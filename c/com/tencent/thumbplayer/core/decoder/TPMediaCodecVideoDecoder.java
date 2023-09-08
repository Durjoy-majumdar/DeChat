package com.tencent.thumbplayer.core.decoder;

import android.media.Image;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Build;
import android.view.Surface;
import com.google.android.gms.common.Scopes;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.thumbplayer.core.common.TPCodecUtils;
import com.tencent.thumbplayer.core.common.TPNativeLog;
import com.tencent.thumbplayer.core.common.TPSystemInfo;
import com.tencent.thumbplayer.core.postprocessor.DisplaySurface;
import com.tencent.thumbplayer.core.postprocessor.ProcessSurface;
import com.tencent.thumbplayer.tmediacodec.TMediaCodec;
import com.tencent.thumbplayer.tmediacodec.util.TUtils;
import java.nio.ByteBuffer;
import java.util.ArrayList;

public class TPMediaCodecVideoDecoder extends TPBaseMediaCodecDecoder {
    private static final String CODEC_HISI_NAME = "hisi";
    private static final String DEVICE_NAME_VIVO_X5L = "vivo X5L";
    private static final String KEY_CROP_BOTTOM = "crop-bottom";
    private static final String KEY_CROP_LEFT = "crop-left";
    private static final String KEY_CROP_RIGHT = "crop-right";
    private static final String KEY_CROP_TOP = "crop-top";
    private static final int PIXEL_STRIDE_CONTINUOUS = 1;
    private static final String TAG = "TPMediaCodecVideoDecode";
    private static final int YUV420P_PLANAR_COUNT = 3;
    private int mCropBottom = 0;
    private int mCropLeft = 0;
    private int mCropRight = 0;
    private int mCropTop = 0;
    private byte[] mCsd0Data = null;
    private byte[] mCsd1Data = null;
    private byte[] mCsd2Data = null;
    private boolean mDisableDolbyVisionComponent = false;
    private DisplaySurface mDisplaySurface = null;
    private int mDolbyVisionLevel = 0;
    private int mDolbyVisionProfile = 0;
    private boolean mEnableMediaCodecOutputData = false;
    private ArrayList<String> mMimeCandidates = new ArrayList<>();
    private ProcessSurface mProcessSurface = null;
    private int mRotation = 0;
    private int mVideoHeight = 0;
    private int mVideoWidth = 0;

    public TPMediaCodecVideoDecoder(int i) {
        super(i);
    }

    private void copyVideoDataFromImage(Image image, TPFrameInfo tPFrameInfo) {
        if (image.getFormat() != 35) {
            tPFrameInfo.format = -1;
            tPFrameInfo.errCode = 3;
            TPNativeLog.printLog(4, TAG, "copyVideoDataFromImage: image format not support!");
            return;
        }
        tPFrameInfo.format = 0;
        int width = image.getWidth();
        int height = image.getHeight();
        Image.Plane[] planes = image.getPlanes();
        int[] iArr = tPFrameInfo.lineSize;
        if (iArr == null || iArr.length < 3) {
            tPFrameInfo.lineSize = new int[3];
        }
        byte[][] bArr = tPFrameInfo.videoData;
        if (bArr == null || bArr.length < 3) {
            tPFrameInfo.videoData = new byte[3][];
        }
        int i = 0;
        while (i < 3) {
            int i2 = i == 0 ? 0 : 1;
            copyVideoDataFromPlane(planes[i], width >> i2, height >> i2, i, tPFrameInfo);
            i++;
        }
    }

    private void copyVideoDataFromPlane(Image.Plane plane, int i, int i2, int i3, TPFrameInfo tPFrameInfo) {
        ByteBuffer buffer = plane.getBuffer();
        tPFrameInfo.lineSize[i3] = i;
        int i4 = i * i2;
        byte[][] bArr = tPFrameInfo.videoData;
        byte[] bArr2 = bArr[i3];
        if (bArr2 == null || bArr2.length < i4) {
            bArr[i3] = new byte[i4];
        }
        if (plane.getPixelStride() == 1) {
            buffer.get(tPFrameInfo.videoData[i3], 0, i4);
            return;
        }
        for (int i5 = 0; i5 < i4; i5++) {
            tPFrameInfo.videoData[i3][i5] = buffer.get(plane.getPixelStride() * i5);
        }
    }

    private void processOutputData(TMediaCodec tMediaCodec, int i, MediaCodec.BufferInfo bufferInfo, TPFrameInfo tPFrameInfo) {
        if (bufferInfo.flags != 4 || bufferInfo.size > 0) {
            Image outputImage = tMediaCodec.getOutputImage(i);
            if (outputImage == null) {
                tPFrameInfo.format = -1;
                tPFrameInfo.errCode = 3;
                tMediaCodec.releaseOutputBuffer(i, false);
                TPNativeLog.printLog(4, TAG, "processOutputBuffer: getOutputImage return null");
                return;
            }
            copyVideoDataFromImage(outputImage, tPFrameInfo);
            tMediaCodec.releaseOutputBuffer(i, false);
            return;
        }
        TPNativeLog.printLog(2, TAG, "processOutputBuffer: bufferInfo.flags is BUFFER_FLAG_END_OF_STREAM, return EOS!");
        tPFrameInfo.format = -1;
        tPFrameInfo.errCode = 2;
        tMediaCodec.releaseOutputBuffer(i, false);
    }

    public void configCodec(TMediaCodec tMediaCodec, String str) {
        MediaFormat createVideoFormat = MediaFormat.createVideoFormat(str, this.mVideoWidth, this.mVideoHeight);
        if (Build.VERSION.SDK_INT > 22) {
            createVideoFormat.setInteger("rotation-degrees", this.mRotation);
        }
        if (TPSystemInfo.getDeviceName().equalsIgnoreCase(DEVICE_NAME_VIVO_X5L)) {
            createVideoFormat.setInteger("max-input-size", this.mVideoWidth * this.mVideoHeight);
        }
        byte[] bArr = this.mCsd0Data;
        if (bArr != null) {
            createVideoFormat.setByteBuffer(TUtils.CSD_0, ByteBuffer.wrap(bArr));
        }
        byte[] bArr2 = this.mCsd1Data;
        if (bArr2 != null) {
            createVideoFormat.setByteBuffer(TUtils.CSD_1, ByteBuffer.wrap(bArr2));
        }
        byte[] bArr3 = this.mCsd2Data;
        if (bArr3 != null) {
            createVideoFormat.setByteBuffer(TUtils.CSD_2, ByteBuffer.wrap(bArr3));
        }
        if ("video/dolby-vision".equals(str)) {
            createVideoFormat.setInteger(Scopes.PROFILE, TPCodecUtils.convertDolbyVisionToOmxProfile(this.mDolbyVisionProfile));
            createVideoFormat.setInteger(FirebaseAnalytics.C113379b.LEVEL, TPCodecUtils.convertDolbyVisionToOmxLevel(this.mDolbyVisionLevel));
        }
        if (this.mEnableMediaCodecOutputData) {
            createVideoFormat.setInteger("color-format", 2135033992);
            tMediaCodec.configure(createVideoFormat, (Surface) null, this.mMediaCrypto, 0);
        } else {
            tMediaCodec.configure(createVideoFormat, this.mSurface, this.mMediaCrypto, 0);
        }
        tMediaCodec.setVideoScalingMode(1);
    }

    public String getCodecName(String str, boolean z) {
        String str2;
        int i = this.mDolbyVisionProfile;
        if (i <= 0 || this.mDisableDolbyVisionComponent) {
            str2 = TPCodecUtils.getDecoderName(str, z);
        } else {
            str2 = TPCodecUtils.getDolbyVisionDecoderName(str, i, this.mDolbyVisionLevel, z);
            if (str2 == null) {
                str2 = TPCodecUtils.getDecoderName(str, z);
            }
        }
        int cpuHWProducter = TPSystemInfo.getCpuHWProducter(TPSystemInfo.getCpuHarewareName());
        if (str2 == null || !str2.contains(CODEC_HISI_NAME) || cpuHWProducter == 2 || (str2 = TPCodecUtils.getDecoderNameWithoutCache(str, z)) != null) {
            return str2;
        }
        TPNativeLog.printLog(2, getLogTag(), "hisi fall back initMediaCodec failed codecName is null");
        return null;
    }

    public String getLogTag() {
        return TAG;
    }

    public boolean initDecoder(String str, int i, int i2, int i3, int i4) {
        return false;
    }

    public boolean initDecoder(String str, int i, int i2, int i3, Surface surface, int i4, int i5, int i6) {
        TPNativeLog.printLog(2, TAG, "initDecoder, mimeType:" + str + " width:" + i + " height:" + i2 + " rotation:" + i3 + " dvProfile:" + i5 + " dvLevel:" + i6);
        this.mVideoWidth = i;
        this.mVideoHeight = i2;
        this.mRotation = i3;
        boolean z = false;
        if (this.mEnableRendererSharpen > 0 && !this.mEnableAsyncMode) {
            try {
                DisplaySurface displaySurface = new DisplaySurface(surface);
                this.mDisplaySurface = displaySurface;
                displaySurface.makeCurrent();
                ProcessSurface processSurface = new ProcessSurface(this.mVideoWidth, this.mVideoHeight, this.mSharpenShaderPath);
                this.mProcessSurface = processSurface;
                this.mSurface = processSurface.getSurface();
            } catch (Exception unused) {
                this.mEnableRendererSharpen = 0;
                TPNativeLog.printLog(2, TAG, "sifeng create sharpen surface failed!");
            }
        }
        if (this.mEnableRendererSharpen <= 0 || this.mEnableAsyncMode || this.mSurface == null) {
            this.mSurface = surface;
        }
        this.mDrmType = i4;
        this.mDolbyVisionProfile = i5;
        this.mDolbyVisionLevel = i6;
        this.mMimeCandidates.clear();
        if ("video/dolby-vision".equals(str)) {
            int convertDolbyVisionToOmxProfile = TPCodecUtils.convertDolbyVisionToOmxProfile(this.mDolbyVisionProfile);
            if (convertDolbyVisionToOmxProfile >= 4 && convertDolbyVisionToOmxProfile <= 256) {
                z = true;
            }
            if (!this.mDisableDolbyVisionComponent || !z) {
                this.mMimeCandidates.add(str);
                if (z) {
                    this.mMimeCandidates.add("video/hevc");
                }
            } else {
                this.mMimeCandidates.add("video/hevc");
            }
        } else {
            this.mMimeCandidates.add(str);
        }
        return true;
    }

    public void processMediaCodecException(Exception exc) {
    }

    public void processOutputBuffer(TMediaCodec tMediaCodec, int i, MediaCodec.BufferInfo bufferInfo, TPFrameInfo tPFrameInfo) {
        tPFrameInfo.width = this.mVideoWidth;
        tPFrameInfo.height = this.mVideoHeight;
        tPFrameInfo.cropLeft = this.mCropLeft;
        tPFrameInfo.cropRight = this.mCropRight;
        tPFrameInfo.cropTop = this.mCropTop;
        tPFrameInfo.cropBottom = this.mCropBottom;
        tPFrameInfo.format = 167;
        if (this.mEnableMediaCodecOutputData) {
            processOutputData(tMediaCodec, i, bufferInfo, tPFrameInfo);
        }
    }

    public void processOutputConfigData(TMediaCodec tMediaCodec, int i, MediaCodec.BufferInfo bufferInfo, TPFrameInfo tPFrameInfo) {
        tPFrameInfo.errCode = 0;
        processOutputBuffer(tMediaCodec, i, bufferInfo, tPFrameInfo);
    }

    public void processOutputFormatChanged(MediaFormat mediaFormat) {
        boolean z = mediaFormat.containsKey(KEY_CROP_RIGHT) && mediaFormat.containsKey(KEY_CROP_LEFT) && mediaFormat.containsKey(KEY_CROP_BOTTOM) && mediaFormat.containsKey(KEY_CROP_TOP);
        this.mVideoWidth = mediaFormat.getInteger("width");
        this.mVideoHeight = mediaFormat.getInteger("height");
        if (z) {
            this.mCropLeft = mediaFormat.getInteger(KEY_CROP_LEFT);
            this.mCropRight = mediaFormat.getInteger(KEY_CROP_RIGHT);
            this.mCropTop = mediaFormat.getInteger(KEY_CROP_TOP);
            this.mCropBottom = mediaFormat.getInteger(KEY_CROP_BOTTOM);
        }
        TPNativeLog.printLog(2, TAG, "processOutputFormatChanged: mVideoWidth: " + this.mVideoWidth + ", mVideoHeight: " + this.mVideoHeight + ", mCropLeft: " + this.mCropLeft + ", mCropRight: " + this.mCropRight + ", mCropTop: " + this.mCropTop + ", mCropBottom: " + this.mCropBottom);
    }

    public int release() {
        int release = super.release();
        try {
            DisplaySurface displaySurface = this.mDisplaySurface;
            if (displaySurface != null) {
                displaySurface.makeCurrent();
                ProcessSurface processSurface = this.mProcessSurface;
                if (processSurface != null) {
                    processSurface.release();
                }
                this.mDisplaySurface.release();
            }
        } catch (Exception unused) {
            TPNativeLog.printLog(2, TAG, "custom render release failed!");
        }
        this.mProcessSurface = null;
        this.mDisplaySurface = null;
        return release;
    }

    public int releaseOutputBuffer(int i, boolean z, long j) {
        int releaseOutputBuffer = super.releaseOutputBuffer(i, z, j);
        if (releaseOutputBuffer == 0 && z && this.mEnableRendererSharpen > 0 && this.mSurface == this.mProcessSurface.getSurface()) {
            try {
                this.mDisplaySurface.makeCurrent();
                this.mDisplaySurface.querySurface();
                this.mProcessSurface.awaitNewImage();
                this.mProcessSurface.drawImage(this.mVideoWidth, this.mVideoHeight, this.mDisplaySurface.getmWidth(), this.mDisplaySurface.getmHeight(), this.mSwitchEnableRendererSharpen, this.mEnableRendererSharpen);
                this.mDisplaySurface.swapBuffers();
            } catch (Exception unused) {
                TPNativeLog.printLog(2, TAG, "sifeng sharpen render pass failed!");
            }
        }
        return releaseOutputBuffer;
    }

    public int setOperateRate(float f) {
        return super.setOperateRate(f);
    }

    public int setOutputSurface(Surface surface) {
        if (this.mEnableMediaCodecOutputData) {
            return 3;
        }
        return super.setOutputSurface(surface);
    }

    public boolean setParamBool(int i, boolean z) {
        if (5 == i) {
            if (!this.mStarted) {
                this.mEnableMediaCodecOutputData = z;
            } else {
                String logTag = getLogTag();
                TPNativeLog.printLog(3, logTag, "BOOL_ENABLE_MEDIACODEC_OUTPUT_DATA failed. need set before start, mStart=" + this.mStarted + ", api level is " + Build.VERSION.SDK_INT + ", support api level = " + 21);
            }
        } else if (6 == i) {
            if (!this.mStarted) {
                this.mDisableDolbyVisionComponent = z;
            } else {
                String logTag2 = getLogTag();
                TPNativeLog.printLog(3, logTag2, "BOOL_FORCE_DOLBY_VISION_USE_HEVC_CODEC failed. need set before start, mStart=" + this.mStarted);
            }
        }
        return super.setParamBool(i, z);
    }

    public boolean setParamBytes(int i, byte[] bArr) {
        if (i == 200) {
            this.mCsd0Data = bArr;
        } else if (i == 201) {
            this.mCsd1Data = bArr;
        } else if (i == 202) {
            this.mCsd2Data = bArr;
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
