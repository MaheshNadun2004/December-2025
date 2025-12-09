from flask import Flask, request, render_template, send_file
from moviepy.editor import VideoFileClip
import os

app = Flask(__name__)

@app.route('/')
def index():
    return render_template('index.html')

@app.route('/convert', methods=['POST'])
def convert_to_mp3():
    file = request.files['video']
    if not file:
        return "No file uploaded", 400

    # Save uploaded video temporarily
    video_path = "temp_video.mp4"
    file.save(video_path)

    # Extract audio
    audio_path = "output.mp3"
    video = VideoFileClip(video_path)
    video.audio.write_audiofile(audio_path)

    # Remove temp video
    os.remove(video_path)

    # Send mp3 file
    return send_file(audio_path, as_attachment=True)

if __name__ == '__main__':
    app.run(debug=True)
