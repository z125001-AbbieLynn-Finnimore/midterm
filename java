function toggleGallery(id) {
    const gallery = document.getElementById(id);
    if (gallery.style.display === "flex") {
      gallery.style.display = "none";
    } else {
      gallery.style.display = "flex";
    }
  }
  
  document.querySelector('.scroll-down').addEventListener('click', () => {
    document.querySelector('main').scrollIntoView({ behavior: 'smooth' });
  });


  
  