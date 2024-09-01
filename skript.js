document.getElementById('reviewForm').addEventListener('submit', function(e) {
    e.preventDefault();

    // Hämta värden från formuläret
    const productName = document.getElementById('productName').value;
    const reviewerName = document.getElementById('reviewerName').value;
    const reviewText = document.getElementById('reviewText').value;

    // Skapa en ny div för recensionen
    const reviewCard = document.createElement('div');
    reviewCard.classList.add('review-card');

    // Skapa och lägg till rubrik för produktnamnet
    const productTitle = document.createElement('h3');
    productTitle.textContent = productName;
    reviewCard.appendChild(productTitle);

    // Skapa och lägg till paragraf för recencentens namn
    const reviewer = document.createElement('p');
    reviewer.textContent = `Recenserad av: ${reviewerName}`;
    reviewCard.appendChild(reviewer);

    // Skapa och lägg till paragraf för själva recensionen
    const review = document.createElement('p');
    review.textContent = reviewText;
    reviewCard.appendChild(review);

    // Lägg till recensionen i listan
    document.getElementById('reviews').appendChild(reviewCard);

    // Rensa formuläret
    document.getElementById('reviewForm').reset();
});
