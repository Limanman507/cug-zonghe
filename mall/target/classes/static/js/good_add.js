//文件框选择图片时，图片标签自动切换
function showImg()
{
    let f = new FileReader();
    f.onload = function (ev)
    {
        img.src = ev.target.result;
    }
    f.readAsDataURL(file.files[0]);
}