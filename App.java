package UserLoginPrograme;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Mevcut şifreyi belirleyin (örnek olarak)
        String existingPassword = "131400";

        // Kullanıcıdan şifreyi isteyin
        System.out.print("Lütfen şifrenizi giriniz: ");
        String enteredPassword = scanner.nextLine();
        if (!enteredPassword.equals(existingPassword)) {
            // Şifre yanlışsa sıfırlamak isteyip istemediğini sorun
            System.out.print("Şifre yanlış. Şifrenizi sıfırlamak ister misiniz? (E/H): ");
            String response = scanner.nextLine();
            if (response.equalsIgnoreCase("E")) {
                // Yeni şifre isteyin
                System.out.print("Yeni şifrenizi giriniz: ");
                String newPassword = scanner.nextLine();

                // Yeni şifrenin eski şifre ile aynı olup olmadığını kontrol edin
                if (newPassword.equals(existingPassword)) {
                    System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                } else {
                    System.out.println("Şifre oluşturuldu.");
                }
            } else {
                System.out.println("Şifre sıfırlama işlemi iptal edildi.");
            }
        } else {
            System.out.println("Şifre doğru.");
        }

        scanner.close();
    }
}
