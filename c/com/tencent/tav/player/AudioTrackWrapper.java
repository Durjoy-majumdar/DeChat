package com.tencent.tav.player;

import android.media.AudioTrack;
import android.media.MediaFormat;
import com.tencent.tav.decoder.logger.Logger;

public class AudioTrackWrapper {
    private static final String TAG = "AudioTrackWrapper";
    private AudioTrack mAudioTrack;

    public static class AudioTrackConfig {
        public int audioFormat = 2;
        public int bufferSizeInBytes;
        public int channelConfig = 12;
        public int mode = 1;
        public int sampleRateInHz;
        public int streamType = 3;

        public AudioTrackConfig(int i, int i2) {
            this.sampleRateInHz = getSampleRateInHz(i, i2);
            this.bufferSizeInBytes = 8192;
        }

        private int getSampleRateInHz(int i, int i2) {
            return i2 == 1 ? i / 2 : i;
        }

        public String toString() {
            return "AudioTrackConfig{streamType=" + this.streamType + ", sampleRateInHz=" + this.sampleRateInHz + ", channelConfig=" + this.channelConfig + ", audioFormat=" + this.audioFormat + ", bufferSizeInBytes=" + this.bufferSizeInBytes + ", mode=" + this.mode + '}';
        }
    }

    public AudioTrackWrapper(MediaFormat mediaFormat) {
        try {
            init(mediaFormat.getInteger("sample-rate"), mediaFormat.getInteger("channel-count"));
        } catch (Exception unused) {
        }
    }

    private void init(int i, int i2) {
        if (i > 0) {
            AudioTrackConfig audioTrackConfig = new AudioTrackConfig(i, i2);
            Logger.m144641d(TAG, "init:--> " + this);
            try {
                this.mAudioTrack = new AudioTrack(audioTrackConfig.streamType, audioTrackConfig.sampleRateInHz, audioTrackConfig.channelConfig, audioTrackConfig.audioFormat, audioTrackConfig.bufferSizeInBytes, audioTrackConfig.mode);
            } catch (IllegalArgumentException unused) {
                this.mAudioTrack = null;
            }
            AudioTrack audioTrack = this.mAudioTrack;
            if (audioTrack != null) {
                audioTrack.play();
            }
        }
    }

    public boolean allow() {
        return this.mAudioTrack != null;
    }

    public void flush() {
        if (allow()) {
            try {
                AudioTrack audioTrack = this.mAudioTrack;
                if (audioTrack != null) {
                    audioTrack.flush();
                }
            } catch (Exception e) {
                Logger.m144644e(TAG, "flush: ", (Throwable) e);
            }
        }
    }

    public void parse() {
        AudioTrack audioTrack;
        if (allow() && (audioTrack = this.mAudioTrack) != null && audioTrack.getPlayState() == 3) {
            this.mAudioTrack.pause();
        }
    }

    public void release() {
        if (allow()) {
            stop();
            this.mAudioTrack.release();
            Logger.m144641d(TAG, "release:--> " + this);
        }
    }

    public void setVolume(float f) {
        if (allow()) {
            this.mAudioTrack.setVolume(f);
        }
    }

    public void stop() {
        if (allow()) {
            if (this.mAudioTrack.getState() == 3 || this.mAudioTrack.getState() == 2) {
                this.mAudioTrack.stop();
            }
        }
    }

    public void writeData(byte[] bArr, int i, int i2) {
        AudioTrack audioTrack;
        if (allow() && (audioTrack = this.mAudioTrack) != null) {
            try {
                audioTrack.write(bArr, i, i2);
                if (this.mAudioTrack.getPlayState() != 3) {
                    this.mAudioTrack.play();
                }
            } catch (Exception unused) {
            }
        }
    }

    public AudioTrackWrapper(int i, int i2) {
        try {
            init(i, i2);
        } catch (Exception unused) {
        }
    }
}
