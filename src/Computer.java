public class Computer implements MusicPlayer, VideoPlayer {
    @Override
    public void playMusic() {
        System.out.println("O computador está Tocando música");
    }

    @Override
    public void pauseMusic() {
        System.out.println("O computador está Pausando música");
    }

    @Override
    public void stopMusic() {
        System.out.println("O computador está Parando música");
    }

    @Override
    public void playVideo() {
        System.out.println("O computador está Inciando video");
    }

    @Override
    public void pauseVideo() {
        System.out.println("O computador está Pausando video");
    }

    @Override
    public void stopVideo() {
        System.out.println("O computador está Parando video");
    }
}
