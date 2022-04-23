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
    Author author;
    double price;
    int qty = 0;

    public Book(String name, double price, Author author) {
        this.name = name;
        this.author = author;
        this.price = price;
    }

    public Book(String name, double price, Author author, int qty) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.qty = qty;
    }

    public String getName() {
        return name;
    }

    public Author getAuthor() {
        return author;
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
                + ",author=" + author.toString()
                + ",price=" + price
                + ",qty=" + qty
                + "]";
    }
}
