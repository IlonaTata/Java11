public class Radio {
    private int currentRadioStationNumber;
    private int soundVolume;

    public int getCurrentRadioStationNumber() {
        return currentRadioStationNumber;
    }

    public void setCurrentRadioStationNumber(int newCurrentRadioStationNumber) {
        if (newCurrentRadioStationNumber < 0) {
            return;
        }
        if (newCurrentRadioStationNumber > 9) {
            return;
        }
        currentRadioStationNumber = newCurrentRadioStationNumber;
    }


    public int nextStation() {
        if (currentRadioStationNumber >= 9) {
            return currentRadioStationNumber = 0;
        }
        return currentRadioStationNumber = currentRadioStationNumber + 1;
    }

    public int prevStation() {
        if (currentRadioStationNumber <= 0) {
            return currentRadioStationNumber = 9;
        }
        return currentRadioStationNumber = currentRadioStationNumber - 1;
    }


    public int getSoundVolume() {
        return soundVolume;
    }


    public void setSoundVolume(int newSoundVolume) {
        if (newSoundVolume < 0) {
            return;
        }
        if (newSoundVolume > 10) {
            return;
        }
        soundVolume = newSoundVolume;
    }

    public void increaseVolume() {
        if (soundVolume < 10) {
            soundVolume = soundVolume + 1;
        }


    }

    public void increaseVolumeMoreMax() {
        if (soundVolume >= 10) {
            soundVolume = 10;
        }
    }

    public void increaseVolumeMoreMin() {
        if (soundVolume <= 0) {
            soundVolume = 0;
        }
    }
}



