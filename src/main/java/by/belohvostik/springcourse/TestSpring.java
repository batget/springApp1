package by.belohvostik.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");


        ClassicalMusic classicalMusic = context.getBean("musicBean1",ClassicalMusic.class);
        System.out.println(classicalMusic.getSong());
        MusicPlayer firstMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        MusicPlayer secondMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);

        boolean comparison = firstMusicPlayer == secondMusicPlayer;

        System.out.println(comparison);
        System.out.println(firstMusicPlayer);
        System.out.println(secondMusicPlayer);
        firstMusicPlayer.setVolume(10);
        System.out.println(firstMusicPlayer.getVolume());
        System.out.println(secondMusicPlayer.getVolume());
        
        context.close();
    }
}
