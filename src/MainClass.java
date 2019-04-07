public class MainClass {
    public static void main(String[] args) {
        worker[] tabl = {
                new worker("Duglas Dugl Duglsovich", "Kiler", "@mail.ru",
                        "89320983454", "12000$", 23),
                new worker("Shvarc Rudolf Goldenovich", "Black Nall",
                        "@yandex.ru", "89742348734", "909$", 43),
                new worker("Yangel Ruzvelt Blokshtain", "director", "@googl.ru",
                        "10987465763", "12$", 37)
        };
        for (int i = 0; i < tabl.length; i++) {
            if (tabl[i].getAge() < 33) { System.out.println(tabl[i].getWorkSurname());

            }

        }
    }
}
