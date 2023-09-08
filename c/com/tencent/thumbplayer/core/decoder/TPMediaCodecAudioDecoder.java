package com.tencent.thumbplayer.core.decoder;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Build;
import android.view.Surface;
import com.tencent.thumbplayer.core.common.TPCodecUtils;
import com.tencent.thumbplayer.core.common.TPNativeLog;
import com.tencent.thumbplayer.tmediacodec.TMediaCodec;
import com.tencent.thumbplayer.tmediacodec.util.TUtils;
import java.nio.ByteBuffer;
import java.util.ArrayList;

public class TPMediaCodecAudioDecoder extends TPBaseMediaCodecDecoder {
    private static final String TAG = "TPMediaCodecAudioDecoder";
    private int mAudioFormat = 0;
    private int mChannelCount = 0;
    private byte[] mCsd0Data = null;
    private boolean mEnableAudioPassThrough = false;
    private boolean mIsAdts = false;
    private ArrayList<String> mMimeCandidates = new ArrayList<>();
    private int mSampleRate = 0;

    public TPMediaCodecAudioDecoder(int i) {
        super(i);
    }

    public void configCodec(TMediaCodec tMediaCodec, String str) {
        TPNativeLog.printLog(2, TAG, "configCodec: ");
        MediaFormat createAudioFormat = MediaFormat.createAudioFormat(str, this.mSampleRate, this.mChannelCount);
        byte[] bArr = this.mCsd0Data;
        if (bArr != null) {
            createAudioFormat.setByteBuffer(TUtils.CSD_0, ByteBuffer.wrap(bArr));
        }
        if (this.mIsAdts) {
            TPNativeLog.printLog(2, TAG, "configCodec: set is adts");
            createAudioFormat.setInteger("is-adts", 1);
        }
        tMediaCodec.configure(createAudioFormat, (Surface) null, this.mMediaCrypto, 0);
    }

    public String getCodecName(String str, boolean z) {
        return TPCodecUtils.getDecoderName(str, z);
    }

    public String getLogTag() {
        return TAG;
    }

    public boolean initDecoder(String str, int i, int i2, int i3, int i4) {
        TPNativeLog.printLog(2, TAG, "initDecoder, mimeType:" + str + " sampleRate:" + i + " channelCount:" + i2 + " drmType:" + i3 + " audioFormat:" + i4);
        this.mSampleRate = i;
        this.mChannelCount = i2;
        this.mDrmType = i3;
        this.mAudioFormat = i4;
        this.mMimeCandidates.clear();
        this.mMimeCandidates.add(str);
        return true;
    }

    public boolean initDecoder(String str, int i, int i2, int i3, Surface surface, int i4, int i5, int i6) {
        return false;
    }

    public void processMediaCodecException(Exception exc) {
    }

    public void processOutputBuffer(TMediaCodec tMediaCodec, int i, MediaCodec.BufferInfo bufferInfo, TPFrameInfo tPFrameInfo) {
        tPFrameInfo.sampleRate = this.mSampleRate;
        tPFrameInfo.channelCount = this.mChannelCount;
        tPFrameInfo.format = this.mAudioFormat;
        ByteBuffer outputBuffer = tMediaCodec.getOutputBuffer(i);
        byte[] bArr = null;
        if (outputBuffer != null) {
            int i2 = bufferInfo.size;
            byte[] bArr2 = new byte[i2];
            outputBuffer.get(bArr2, bufferInfo.offset, i2);
            bArr = bArr2;
        }
        tPFrameInfo.data = bArr;
        if (bufferInfo.flags == 4 && bufferInfo.size <= 0) {
            TPNativeLog.printLog(2, TAG, "processOutputBuffer: bufferInfo.flags is BUFFER_FLAG_END_OF_STREAM, return EOS!");
            tPFrameInfo.errCode = 2;
        }
        tMediaCodec.releaseOutputBuffer(i, false);
    }

    public void processOutputConfigData(TMediaCodec tMediaCodec, int i, MediaCodec.BufferInfo bufferInfo, TPFrameInfo tPFrameInfo) {
        tMediaCodec.releaseOutputBuffer(i, false);
        tPFrameInfo.errCode = 1;
    }

    public void processOutputFormatChanged(MediaFormat mediaFormat) {
        int i;
        int i2;
        try {
            if (mediaFormat.containsKey("sample-rate")) {
                this.mSampleRate = mediaFormat.getInteger("sample-rate");
            }
            if (mediaFormat.containsKey("channel-count")) {
                this.mChannelCount = mediaFormat.getInteger("channel-count");
            }
            if (Build.VERSION.SDK_INT < 24 || !mediaFormat.containsKey("pcm-encoding")) {
                i = 2;
                TPNativeLog.printLog(2, TAG, "processOutputFormatChanged, mEnableAudioPassThrough:" + this.mEnableAudioPassThrough + ", mSampleRate: " + this.mSampleRate + ", mChannelCount: " + this.mChannelCount + " mAudioFormat: " + this.mAudioFormat + " pcmFormat:" + i);
            }
            i = mediaFormat.getInteger("pcm-encoding");
            try {
                TPNativeLog.printLog(2, TAG, "processOutputFormatChanged: MediaFormat.KEY_PCM_ENCODING: " + i);
            } catch (Exception e) {
                Exception exc = e;
                i2 = i;
                e = exc;
            }
            TPNativeLog.printLog(2, TAG, "processOutputFormatChanged, mEnableAudioPassThrough:" + this.mEnableAudioPassThrough + ", mSampleRate: " + this.mSampleRate + ", mChannelCount: " + this.mChannelCount + " mAudioFormat: " + this.mAudioFormat + " pcmFormat:" + i);
        } catch (Exception e2) {
            e = e2;
            i2 = 2;
            TPNativeLog.printLog(4, TAG, "processOutputFormatChanged got one exception: " + getStackTrace(e));
            i = i2;
            TPNativeLog.printLog(2, TAG, "processOutputFormatChanged, mEnableAudioPassThrough:" + this.mEnableAudioPassThrough + ", mSampleRate: " + this.mSampleRate + ", mChannelCount: " + this.mChannelCount + " mAudioFormat: " + this.mAudioFormat + " pcmFormat:" + i);
        }
    }

    public int setOperateRate(float f) {
        return super.setOperateRate(f);
    }

    public boolean setParamBool(int i, boolean z) {
        if (i == 2) {
            this.mIsAdts = z;
            return true;
        } else if (i != 3) {
            return super.setParamBool(i, z);
        } else {
            this.mEnableAudioPassThrough = z;
            String logTag = getLogTag();
            TPNativeLog.printLog(2, logTag, "setParamBool mEnableAudioPassThrough:" + this.mEnableAudioPassThrough);
            return true;
        }
    }

    public boolean setParamBytes(int i, byte[] bArr) {
        if (i == 200) {
            this.mCsd0Data = bArr;
        }
        return super.setParamBytes(i, bArr);
    }

    public boolean setParamObject(int i, Object obj) {
        return super.setParamObject(i, obj);
    }

    public ArrayList<String> getMimeCandidates() {
        return this.mMimeCandidates;
    }
}
