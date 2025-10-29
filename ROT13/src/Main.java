void main() {
    System.out.println("Введите фразу чтобы её зашифровать:");
    Scanner scanner = new Scanner(System.in);
    String phrase = scanner.nextLine();

    String encryptResult = ROT13.encrypt(phrase);
    System.out.printf("Результат: %s\n", encryptResult);

    String decryptResult = ROT13.decrypt(encryptResult);
    System.out.printf("Расшифровка: %s\n", decryptResult);

    scanner.close();
}
