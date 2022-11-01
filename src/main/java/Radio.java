public class Radio {
    private int currentRadioStationNumber;
    private int soundVolume;

    public int getCurrentRadioStationNumber() {
        return currentRadioStationNumber;
    }

    public void CurrentRadioStationNumber(int newCurrentRadioStationNumber) {
        if (newCurrentRadioStationNumber < 0) {
            return;
        }
        if (newCurrentRadioStationNumber > 9) {
            return;
        }
        currentRadioStationNumber = newCurrentRadioStationNumber + 1;
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

    public int nextStation(int radioStationMore9) {
        if (radioStationMore9 >= 9) {
            return currentRadioStationNumber = 0;
        }
        return currentRadioStationNumber = radioStationMore9 + 1;
    }

    public int prevStation(int radioStationLess0) {
        if (radioStationLess0 <= 0) {
            return currentRadioStationNumber = 9;
        }
        return currentRadioStationNumber = radioStationLess0 - 1;
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
        soundVolume = newSoundVolume + 1;
    }

    public int moreMaxVolume(int maxVolume) {

        if (maxVolume >= 10) {
            return soundVolume = 10;
        }
        return soundVolume = maxVolume + 1;
    }

    public int lessMinVolume(int minVolume) {

        if (minVolume <= 0) {
            return soundVolume = 0;
        }
        return soundVolume = minVolume - 1;
    }
}




