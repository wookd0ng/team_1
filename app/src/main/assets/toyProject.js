function loadData() {
    document.getElementById('box').innerText = Android.readCacheFile()
}

function movePage(url) {
    location.href=url
}
