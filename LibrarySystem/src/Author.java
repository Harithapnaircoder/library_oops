class Author {
    String name;
    String birthDate;
    String biography;

    public Author(String name, String birthDate, String biography) {
        this.name = name;
        this.birthDate = birthDate;
        this.biography = biography;
    }

    public String getAuthorInfo() {
        return "Name: " + name + "\nBirth Date: " + birthDate + "\nBiography: " + biography;
    }
}