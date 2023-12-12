public class Main {
    public static void main(String[] args) {
        AudioPlayer player = new AudioPlayer();
        player.play("Moonlight");
        System.out.println(player.getCurrentTrack());
        player.stop();
        System.out.println(player.getCurrentTrack());
        AudioRecorder recorder = new AudioRecorder();
        recorder.record();
        recorder.play("Gatka");
        System.out.println(recorder.getCurrentTrack());
        recorder.stop();
        System.out.println(recorder.getCurrentTrack());
    }
}





//Создайте интерфейс Playable с методами play() и stop(). Затем создайте класс AudioPlayer,
// который реализует интерфейс Playable. Создайте еще один интерфейс Recordable с методами record()
// и stopRecording(). Создайте класс AudioRecorder, который реализует оба интерфейса.
// В методе main создайте объекты AudioPlayer и AudioRecorder и продемонстрируйте их работу.