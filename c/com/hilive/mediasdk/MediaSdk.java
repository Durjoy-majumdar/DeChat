package com.hilive.mediasdk;

import android.content.Context;
import com.hilive.mediasdk.SdkInfo;
import com.tencent.midas.api.APMidasPayAPI;

public class MediaSdk {
    private static final String TAG = "[hilive][java]";
    private long mContext = 0;
    private boolean mInited = false;

    public interface MediaCallbacker {
        void onResult(byte[] bArr);
    }

    private boolean addAudio(int i, byte[] bArr, int i2, int i3, int i4, long j) {
        try {
            return nativeAddAudio(this.mContext, i, bArr, i2, i3, i4, j);
        } catch (Exception e) {
            LogDelegate.m97522e(TAG, "getFrame, error:" + e.getMessage(), new Object[0]);
            return false;
        } catch (UnsatisfiedLinkError e2) {
            LogDelegate.m97522e(TAG, "getFrame, error:" + e2.getMessage(), new Object[0]);
            return false;
        }
    }

    private boolean addVideo(int i, byte[] bArr, int i2, int i3, int i4, boolean z, boolean z2, long j) {
        try {
            return nativeAddVideo(this.mContext, i, bArr, i2, i3, i4, z, z2, j);
        } catch (Exception e) {
            LogDelegate.m97522e(TAG, "getFrame, error:" + e.getMessage(), new Object[0]);
            return false;
        } catch (UnsatisfiedLinkError e2) {
            LogDelegate.m97522e(TAG, "getFrame, error:" + e2.getMessage(), new Object[0]);
            return false;
        }
    }

    private boolean getFrame(int i, boolean z, byte[] bArr, SdkInfo.FrameInfo frameInfo) {
        try {
            return nativeGetFrame(this.mContext, i, z, bArr, frameInfo);
        } catch (Exception e) {
            LogDelegate.m97522e(TAG, "getFrame, error:" + e.getMessage(), new Object[0]);
            return false;
        } catch (UnsatisfiedLinkError e2) {
            LogDelegate.m97522e(TAG, "getFrame, error:" + e2.getMessage(), new Object[0]);
            return false;
        }
    }

    private native boolean nativeAddAudio(long j, int i, byte[] bArr, int i2, int i3, int i4, long j2);

    private native boolean nativeAddVideo(long j, int i, byte[] bArr, int i2, int i3, int i4, boolean z, boolean z2, long j2);

    private native long nativeCreate(String str);

    private native boolean nativeGetFrame(long j, int i, boolean z, byte[] bArr, SdkInfo.FrameInfo frameInfo);

    private native void nativeRelease(long j);

    private native boolean nativeRequest(long j, int i, byte[] bArr, MediaCallbacker mediaCallbacker);

    private native boolean nativeSetConfig(long j, int i, int i2);

    private void request(int i, byte[] bArr, MediaCallbacker mediaCallbacker) {
        try {
            LogDelegate.m97523i(TAG, "request, evtType:" + i + " bytes:" + bArr.length, new Object[0]);
            if (!this.mInited) {
                LogDelegate.m97522e(TAG, "request sdk not ready", new Object[0]);
                return;
            }
            if (!nativeRequest(this.mContext, i, bArr, mediaCallbacker)) {
                LogDelegate.m97522e(TAG, "request invoke failed", new Object[0]);
            }
        } catch (Exception e) {
            LogDelegate.m97522e(TAG, "request, error:" + e.getMessage(), new Object[0]);
        } catch (UnsatisfiedLinkError e2) {
            LogDelegate.m97522e(TAG, "request, error:" + e2.getMessage(), new Object[0]);
        }
    }

    public void Loging(int i, byte[] bArr) {
        try {
            String str = new String(bArr);
            if (i == 1) {
                LogDelegate.m97522e(TAG, str, new Object[0]);
            } else if (i == 2) {
                LogDelegate.m97525w(TAG, str, new Object[0]);
            } else if (i == 3) {
                LogDelegate.m97523i(TAG, str, new Object[0]);
            } else if (i == 4 || i == 5) {
                LogDelegate.m97521d(TAG, str, new Object[0]);
            }
        } catch (Exception unused) {
        }
    }

    public synchronized void analysis(byte[] bArr, MediaCallbacker mediaCallbacker) {
        LogDelegate.m97523i(TAG, "analysis", new Object[0]);
        request(101, bArr, mediaCallbacker);
    }

    public synchronized void editorAddTrack(byte[] bArr, MediaCallbacker mediaCallbacker) {
        LogDelegate.m97523i(TAG, "editorAddTrack", new Object[0]);
        request(202, bArr, mediaCallbacker);
    }

    public synchronized void editorCreate(byte[] bArr, MediaCallbacker mediaCallbacker) {
        LogDelegate.m97523i(TAG, "editorCreate", new Object[0]);
        request(200, bArr, mediaCallbacker);
    }

    public synchronized void editorDelTrack(byte[] bArr, MediaCallbacker mediaCallbacker) {
        LogDelegate.m97523i(TAG, "editorDelTrack", new Object[0]);
        request(204, bArr, mediaCallbacker);
    }

    public synchronized void editorExport(byte[] bArr, MediaCallbacker mediaCallbacker) {
        LogDelegate.m97523i(TAG, "editorExport", new Object[0]);
        request(205, bArr, mediaCallbacker);
    }

    public synchronized void editorGetTrack(byte[] bArr, MediaCallbacker mediaCallbacker) {
        LogDelegate.m97523i(TAG, "editorGetTrack", new Object[0]);
        request(201, bArr, mediaCallbacker);
    }

    public synchronized void editorRemove(byte[] bArr, MediaCallbacker mediaCallbacker) {
        LogDelegate.m97523i(TAG, "editorRemove", new Object[0]);
        request(206, bArr, mediaCallbacker);
    }

    public synchronized void editorUpdateTrack(byte[] bArr, MediaCallbacker mediaCallbacker) {
        LogDelegate.m97523i(TAG, "editorUpdateTrack", new Object[0]);
        request(203, bArr, mediaCallbacker);
    }

    public void finalize() {
        uint();
    }

    public synchronized boolean init(Context context) {
        try {
            LogDelegate.m97523i(TAG, "init sdk baseDir " + context.getCacheDir().getAbsolutePath(), new Object[0]);
            LoadDelegate.loadLibraries();
            if (!this.mInited) {
                long nativeCreate = nativeCreate(context.getCacheDir().getAbsolutePath());
                this.mContext = nativeCreate;
                this.mInited = nativeCreate != 0;
            }
            LogDelegate.m97523i(TAG, "init sdk, sdk:" + this.mContext, new Object[0]);
            return this.mInited;
        } catch (Exception e) {
            LogDelegate.m97522e(TAG, "init failed, Exception error:" + e.getMessage(), new Object[0]);
            return false;
        } catch (UnsatisfiedLinkError e2) {
            LogDelegate.m97522e(TAG, "init failed, UnsatisfiedLinkError error:" + e2.getMessage(), new Object[0]);
            return false;
        }
    }

    public synchronized boolean isInited() {
        return this.mInited;
    }

    public synchronized void loaderCreate(byte[] bArr, MediaCallbacker mediaCallbacker) {
        LogDelegate.m97523i(TAG, "loaderCreate", new Object[0]);
        request(500, bArr, mediaCallbacker);
    }

    public synchronized void loaderRemove(byte[] bArr, MediaCallbacker mediaCallbacker) {
        LogDelegate.m97523i(TAG, "loaderRemove", new Object[0]);
        request(503, bArr, mediaCallbacker);
    }

    public synchronized void loaderStart(byte[] bArr, MediaCallbacker mediaCallbacker) {
        LogDelegate.m97523i(TAG, "loaderStart", new Object[0]);
        request(501, bArr, mediaCallbacker);
    }

    public synchronized void loaderStop(byte[] bArr, MediaCallbacker mediaCallbacker) {
        LogDelegate.m97523i(TAG, "loaderStop", new Object[0]);
        request(502, bArr, mediaCallbacker);
    }

    public synchronized void readerCreate(byte[] bArr, MediaCallbacker mediaCallbacker) {
        LogDelegate.m97523i(TAG, "readerCreate", new Object[0]);
        request(400, bArr, mediaCallbacker);
    }

    public synchronized boolean readerGetAudio(int i, byte[] bArr, SdkInfo.FrameInfo frameInfo) {
        return getFrame(i, false, bArr, frameInfo);
    }

    public synchronized boolean readerGetVideo(int i, byte[] bArr, SdkInfo.FrameInfo frameInfo) {
        return getFrame(i, true, bArr, frameInfo);
    }

    public synchronized void readerRemove(byte[] bArr, MediaCallbacker mediaCallbacker) {
        LogDelegate.m97523i(TAG, "readerRemove", new Object[0]);
        request(405, bArr, mediaCallbacker);
    }

    public synchronized void readerSeek(byte[] bArr, MediaCallbacker mediaCallbacker) {
        LogDelegate.m97523i(TAG, "readerSeek", new Object[0]);
        request(402, bArr, mediaCallbacker);
    }

    public synchronized void readerStart(byte[] bArr, MediaCallbacker mediaCallbacker) {
        LogDelegate.m97523i(TAG, "readerStart", new Object[0]);
        request(401, bArr, mediaCallbacker);
    }

    public synchronized void readerStop(byte[] bArr, MediaCallbacker mediaCallbacker) {
        LogDelegate.m97523i(TAG, "readerStop", new Object[0]);
        request(404, bArr, mediaCallbacker);
    }

    public synchronized void remux(byte[] bArr, MediaCallbacker mediaCallbacker) {
        LogDelegate.m97523i(TAG, "remux", new Object[0]);
        request(102, bArr, mediaCallbacker);
    }

    public synchronized boolean setConfig(int i, int i2) {
        try {
            if (this.mInited) {
                return nativeSetConfig(this.mContext, i, i2);
            }
        } catch (Exception e) {
            LogDelegate.m97522e(TAG, "getSdkVersion failed, error:" + e.getMessage(), new Object[0]);
        } catch (UnsatisfiedLinkError e2) {
            LogDelegate.m97522e(TAG, "getSdkVersion failed, error:" + e2.getMessage(), new Object[0]);
        }
        return false;
    }

    public synchronized void test(byte[] bArr, MediaCallbacker mediaCallbacker) {
        LogDelegate.m97523i(TAG, APMidasPayAPI.ENV_TEST, new Object[0]);
        request(100, bArr, mediaCallbacker);
    }

    public synchronized void uint() {
        LogDelegate.m97523i(TAG, "uint start", new Object[0]);
        try {
            this.mInited = false;
            nativeRelease(this.mContext);
            this.mContext = 0;
        } catch (Exception e) {
            LogDelegate.m97522e(TAG, "release, Exception error:" + e.getMessage(), new Object[0]);
        } catch (UnsatisfiedLinkError e2) {
            LogDelegate.m97522e(TAG, "release, UnsatisfiedLinkError error:" + e2.getMessage(), new Object[0]);
        }
        LogDelegate.m97523i(TAG, "uint end", new Object[0]);
    }

    public synchronized boolean writerAudio(int i, byte[] bArr, int i2, int i3, int i4, long j) {
        return addAudio(i, bArr, i2, i3, i4, j);
    }

    public synchronized void writerCreate(byte[] bArr, MediaCallbacker mediaCallbacker) {
        LogDelegate.m97523i(TAG, "writerCreate", new Object[0]);
        request(300, bArr, mediaCallbacker);
    }

    public synchronized void writerRemove(byte[] bArr, MediaCallbacker mediaCallbacker) {
        LogDelegate.m97523i(TAG, "writerRemove", new Object[0]);
        request(304, bArr, mediaCallbacker);
    }

    public synchronized void writerStart(byte[] bArr, MediaCallbacker mediaCallbacker) {
        LogDelegate.m97523i(TAG, "writerStart", new Object[0]);
        request(301, bArr, mediaCallbacker);
    }

    public synchronized void writerStop(byte[] bArr, MediaCallbacker mediaCallbacker) {
        LogDelegate.m97523i(TAG, "writerStop", new Object[0]);
        request(303, bArr, mediaCallbacker);
    }

    public synchronized void writerUpdate(byte[] bArr, MediaCallbacker mediaCallbacker) {
        LogDelegate.m97523i(TAG, "writerUpdate", new Object[0]);
        request(302, bArr, mediaCallbacker);
    }

    public synchronized boolean writerVideo(int i, byte[] bArr, int i2, int i3, int i4, boolean z, boolean z2, long j) {
        return addVideo(i, bArr, i2, i3, i4, z, z2, j);
    }
}
