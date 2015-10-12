s = """    <a href="img/thailand/thailand-#i.jpg" data-gallery>
      <img src="img/thailand/thumbs/thailand-#i.jpg" alt=""  class="img-rounded">
    </a>"""
for (int i = 1;i<108;i++){
println s.replaceAll("#i", String.format("%02d", i))
}