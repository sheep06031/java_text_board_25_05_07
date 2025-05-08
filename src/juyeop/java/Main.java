package juyeop.java;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int articleCount = 0;
        Scanner sc = new Scanner(System.in);


        System.out.println("== 자바 테스트 게시판 ==");
        System.out.println("== 프로그램 시작 ==");

        while (true) {
            System.out.printf("명령) ");
            String cmd = sc.nextLine();

            if (cmd.equals("/usr/article/write")) {
                System.out.println("== 게시물 등록 ==");
                System.out.print("제목 : ");
                String title = sc.nextLine();

                System.out.print("내용 : ");
                String content = sc.nextLine();

                articleCount++;
                Article article = new Article(articleCount, title,content);
                System.out.printf("%d번 게시물이 등록되었습니다.\n",article.id);
                System.out.println(article.toString());

            } else if (cmd.equals("exit")) {
                System.out.println("프로그램을 종료합니다");
                break;
            } else {
                System.out.println("명령어를 잘못 입력하셨습니다");
            }
        }


        sc.close();
    }
}