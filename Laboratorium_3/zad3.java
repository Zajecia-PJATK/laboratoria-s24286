class Author {
    String name;
    String email;
    char gender;

    public Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public char getGender() {
        return gender;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Author[name=" + name
                + ",email=" + email
                + ",gender=" + gender
                + "]";
    }
}

class Book {
    String name;
    Author[] authors;
    double price;
    int qty = 0;

    public Book(String name, double price, Author[] authors) {
        this.name = name;
        this.authors = authors;
        this.price = price;
    }

    public Book(String name, double price, Author[] authors, int qty) {
        this.name = name;
        this.authors = authors;
        this.price = price;
        this.qty = qty;
    }

    public String getName() {
        return name;
    }

    public Author[] getAuthors() {
        return authors;
    }

    public String getAuthorNames() {
        String authorNames = "";
        for (int i = 0; i < authors.length; i++) {
            if (i != authors.length - 1) authorNames += authors[i] + ", ";
            else authorNames += authors[i];
        }
        return authorNames;
    }

    public double getPrice() {
        return price;
    }

    public int getQty() {
        return qty;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    @Override
    public String toString() {
        return "Book[name=" + name
                + ",price=" + price
                + ",authors=[" + getAuthorNames()
                + "],qty=" + qty
                + "]";
    }
}
