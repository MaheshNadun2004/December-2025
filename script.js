document.getElementById('convertBtn').addEventListener('click', () => {
    const fileInput = document.getElementById('videoInput');
    if(fileInput.files.length === 0){
        alert("Please select a video file!");
        return;
    }

    const formData = new FormData();
    formData.append('video', fileInput.files[0]);

    fetch('/convert', {
        method: 'POST',
        body: formData
    })
    .then(response => response.blob())
    .then(blob => {
        const url = window.URL.createObjectURL(blob);
        const link = document.getElementById('downloadLink');
        link.href = url;
        link.download = "output.mp3";
        link.style.display = 'inline';
        link.textContent = "Download MP3";
    })
    .catch(err => alert("Error: " + err));
});
