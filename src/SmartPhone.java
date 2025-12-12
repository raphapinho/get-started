public class SmartPhone implements VideoPlayer, MusicPlayer {

    @Override
    public void playMusic() {
        System.out.println("O smarthPhone está Tocando música");
    }

    @Override
    public void pauseMusic() {
        System.out.println("O smarthPhone está Pausando música");
    }

    @Override
    public void stopMusic() {
        System.out.println("O smarthPhone está Parando música");
    }

    @Override
    public void playVideo() {
        System.out.println("O smarthPhone está Inciando video");
    }

    @Override
    public void pauseVideo() {
        System.out.println("O smarthPhone está Pausando video");
    }

    @Override
    public void stopVideo() {
        System.out.println("O smarthPhone está Parando video");
    }

}
