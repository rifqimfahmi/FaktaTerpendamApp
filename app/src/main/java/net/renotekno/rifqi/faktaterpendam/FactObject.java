package net.renotekno.rifqi.faktaterpendam;

import java.util.Random;

public class FactObject {

    public final String[] facts = {
            "Unta dapat berlari lebih cepat dari kuda.",
            "Medali emas olimpiade sebenarnya terbuat dari silver.",
            "Kamu lahir dengan 300 tulang; Ketika kamu dewasa, kamu memiliki 206 tulang.",
            "Cahaya matahari membutuhkan waktu 8 menit untuk sampai ke bumi.",
            "Beberapa tumbuhan bambu dapat tumbuh lebih dari 1 meter dalam sehari.",
            "Negara Florida lebih besar daripada England.",
            "Beberapa penguin dapat melompat 2-3 meter dari air.",
            "Rata-rata membutuhkan 66 hari untuk merubah kebiasaan.",
            "Semut melakukan stretching saat bangun"};

    public String getFact(){
        Random random = new Random();
        int randomNumber = random.nextInt(facts.length);
        String theFact = facts[randomNumber];

        return theFact;
    }
}
