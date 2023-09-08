package com.tencent.maas.camerafun;

public enum MJAudioDeviceType {
    Unknown(-1),
    LoudSpeaker(0),
    BlueTooth(1),
    HeadPhone(2);
    
    private final int value;

    private MJAudioDeviceType(int i) {
        this.value = i;
    }

    public int getValue() {
        return this.value;
    }
}
