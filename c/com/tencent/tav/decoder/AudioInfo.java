package com.tencent.tav.decoder;

public class AudioInfo implements Cloneable {
    public int channelCount;
    public int pcmEncoding;
    public int sampleRate;

    public AudioInfo() {
        this.sampleRate = 44100;
        this.channelCount = 1;
        this.pcmEncoding = 2;
    }

    public String toString() {
        return "AudioInfo{sampleRate=" + this.sampleRate + ", channelCount=" + this.channelCount + ", pcmEncoding=" + this.pcmEncoding + '}';
    }

    public AudioInfo clone() {
        return new AudioInfo(this.sampleRate, this.channelCount, this.pcmEncoding);
    }

    public AudioInfo(int i, int i2, int i3) {
        this.sampleRate = i;
        this.channelCount = i2;
        this.pcmEncoding = i3;
    }
}
