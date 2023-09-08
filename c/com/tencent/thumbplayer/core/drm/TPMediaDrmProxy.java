package com.tencent.thumbplayer.core.drm;

import android.media.DeniedByServerException;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaDrm;
import android.media.NotProvisionedException;
import android.media.UnsupportedSchemeException;
import android.os.Build;
import android.os.SystemClock;
import com.tencent.thumbplayer.core.common.TPNativeLog;
import com.tencent.thumbplayer.core.drm.ITPMediaDrm;
import com.tencent.thumbplayer.core.utils.TPThreadPool;
import java.util.HashMap;
import java.util.UUID;
import java.util.concurrent.ExecutorService;

public class TPMediaDrmProxy {
    private static final long CREATE_MEDIA_DRM_SLICE_WAIT_TIME_MS = 100;
    private static final long CREATE_MEDIA_DRM_TIMEOUT_MS = 5000;
    private static final int ERR_API_LOW_LEVEL = 2;
    private static final int ERR_CREATE_MEDIA_DRM_FAILED = 5;
    private static final int ERR_ILLEGAL_ARGUMENT = 1;
    private static final int ERR_INTERRUPT = 3;
    private static final int ERR_NONE = 0;
    private static final int ERR_UNSUPPORTED_SCHEME = 4;
    private static final String TAG = "[PlayerCore][TPMediaDrmProxy]";
    /* access modifiers changed from: private */
    public ITPMediaDrm mMediaDrm;
    private long mNativeContext;
    private UUID mUUID;

    public static final class DrmSessionId {
        public byte[] mSessionId;
        public int mStatus;

        public DrmSessionId(int i, byte[] bArr) {
            this.mStatus = i;
            this.mSessionId = bArr;
        }
    }

    public static final class KeyRequest {
        public byte[] mData;
        public int mRequestType;
        public int mStatus;

        public KeyRequest(int i, byte[] bArr, int i2) {
            this.mRequestType = i;
            this.mData = bArr;
            this.mStatus = i2;
        }
    }

    public static final class MediaDrmProxyCreateResult {
        public int mErrorCode;
        public TPMediaDrmProxy mMediaDrmProxy;

        public MediaDrmProxyCreateResult(TPMediaDrmProxy tPMediaDrmProxy, int i) {
            this.mMediaDrmProxy = tPMediaDrmProxy;
            this.mErrorCode = i;
        }
    }

    public static final class ProvisionRequest {
        public byte[] mData;
        public String mDefaultUrl;

        public ProvisionRequest(String str, byte[] bArr) {
            this.mDefaultUrl = str;
            this.mData = bArr;
        }
    }

    private static void checkInterrupt(ITPDrmInterruptCallback iTPDrmInterruptCallback) {
        if (iTPDrmInterruptCallback != null && iTPDrmInterruptCallback.isInterrupted()) {
            throw new InterruptedException();
        }
    }

    private static MediaDrmProxyCreateResult createMediaDrmProxyByUUID(String str, boolean z, TPDrmInterruptCallbackProxy tPDrmInterruptCallbackProxy) {
        if (str == null) {
            TPNativeLog.printLog(4, "illegal argument.");
            return new MediaDrmProxyCreateResult((TPMediaDrmProxy) null, 1);
        }
        try {
            try {
                TPMediaDrmProxy createMediaDrmProxyWithAsyncTimeout = createMediaDrmProxyWithAsyncTimeout(UUID.fromString(str), z, tPDrmInterruptCallbackProxy);
                return new MediaDrmProxyCreateResult(createMediaDrmProxyWithAsyncTimeout, createMediaDrmProxyWithAsyncTimeout != null ? 0 : 5);
            } catch (UnsupportedSchemeException e) {
                TPNativeLog.printLog(4, e.getMessage());
                return new MediaDrmProxyCreateResult((TPMediaDrmProxy) null, 4);
            } catch (InterruptedException e2) {
                TPNativeLog.printLog(4, e2.getMessage());
                return new MediaDrmProxyCreateResult((TPMediaDrmProxy) null, 3);
            }
        } catch (IllegalArgumentException e3) {
            TPNativeLog.printLog(4, e3.getMessage());
            return new MediaDrmProxyCreateResult((TPMediaDrmProxy) null, 1);
        }
    }

    private static TPMediaDrmProxy createMediaDrmProxyWithAsyncTimeout(UUID uuid, boolean z, ITPDrmInterruptCallback iTPDrmInterruptCallback) {
        TPMediaDrmProxy tPMediaDrmProxy;
        Object obj = new Object();
        TPMediaDrmProxy[] tPMediaDrmProxyArr = {null};
        UnsupportedSchemeException[] unsupportedSchemeExceptionArr = {null};
        boolean[] zArr = {false};
        TPNativeLog.printLog(2, "async create mediaDrm proxy start.");
        ExecutorService obtainThreadExecutor = TPThreadPool.getInstance().obtainThreadExecutor();
        final TPMediaDrmProxy[] tPMediaDrmProxyArr2 = tPMediaDrmProxyArr;
        final UUID uuid2 = uuid;
        final boolean z2 = z;
        final UnsupportedSchemeException[] unsupportedSchemeExceptionArr2 = unsupportedSchemeExceptionArr;
        final Object obj2 = obj;
        C200862 r112 = r1;
        final boolean[] zArr2 = zArr;
        C200862 r1 = new Runnable() {
            public void run() {
                boolean z;
                TPMediaDrmProxy tPMediaDrmProxy;
                TPNativeLog.printLog(2, "create system mediaDrm proxy start.");
                try {
                    tPMediaDrmProxyArr2[0] = new TPMediaDrmProxy(uuid2, z2);
                } catch (UnsupportedSchemeException e) {
                    unsupportedSchemeExceptionArr2[0] = e;
                }
                TPNativeLog.printLog(2, "create system mediaDrm proxy end.");
                synchronized (obj2) {
                    z = zArr2[0];
                    obj2.notify();
                }
                if (z && (tPMediaDrmProxy = tPMediaDrmProxyArr2[0]) != null) {
                    tPMediaDrmProxy.release();
                }
            }
        };
        obtainThreadExecutor.execute(r112);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        while (tPMediaDrmProxyArr[0] == null) {
            synchronized (obj) {
                try {
                    checkInterrupt(iTPDrmInterruptCallback);
                } catch (InterruptedException e) {
                    InterruptedException interruptedException = e;
                    zArr[0] = true;
                    throw interruptedException;
                }
            }
            long elapsedRealtime2 = 5000 - (SystemClock.elapsedRealtime() - elapsedRealtime);
            if (elapsedRealtime2 <= 0) {
                break;
            }
            synchronized (obj) {
                try {
                    obj.wait(Math.min(elapsedRealtime2, 100));
                } catch (InterruptedException e2) {
                    zArr[0] = true;
                    throw e2;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        UnsupportedSchemeException unsupportedSchemeException = unsupportedSchemeExceptionArr[0];
        if (unsupportedSchemeException == null) {
            synchronized (obj) {
                TPMediaDrmProxy tPMediaDrmProxy2 = tPMediaDrmProxyArr[0];
                if (tPMediaDrmProxy2 == null) {
                    zArr[0] = true;
                    tPMediaDrmProxy = null;
                } else {
                    tPMediaDrmProxy = tPMediaDrmProxy2;
                }
            }
            TPNativeLog.printLog(2, "async create mediaDrm proxy end.");
            return tPMediaDrmProxy;
        }
        throw unsupportedSchemeException;
    }

    public static boolean isCryptoSchemeSupported(String str) {
        if (str == null) {
            TPNativeLog.printLog(2, "isCryptoSchemeSupported, illegal argument.");
            return false;
        }
        try {
            boolean isCryptoSchemeSupported = MediaDrm.isCryptoSchemeSupported(UUID.fromString(str));
            TPNativeLog.printLog(2, "isCryptoSchemeSupported, supported:" + isCryptoSchemeSupported);
            return isCryptoSchemeSupported;
        } catch (IllegalArgumentException e) {
            TPNativeLog.printLog(4, e.getMessage());
            return false;
        }
    }

    /* access modifiers changed from: private */
    public native void native_mediaDrmOnEvent(byte[] bArr, int i, int i2, byte[] bArr2);

    public static void setMediaDrmReuseEnable(boolean z) {
        TPMediaDrmPool.getInstance().setMediaDrmReuseEnable(z);
        StringBuilder sb = new StringBuilder();
        sb.append("setMediaDrmReuseEnable, reuse:");
        sb.append(z ? "true" : "false");
        TPNativeLog.printLog(2, TAG, sb.toString());
    }

    public void closeSession(byte[] bArr) {
        if (bArr != null) {
            this.mMediaDrm.closeSession(bArr);
        }
    }

    public KeyRequest getKeyRequest(byte[] bArr, byte[] bArr2, String str, int i) {
        try {
            MediaDrm.KeyRequest keyRequest = this.mMediaDrm.getKeyRequest(bArr, bArr2, str, i, (HashMap<String, String>) null);
            return new KeyRequest(Build.VERSION.SDK_INT >= 23 ? keyRequest.getRequestType() : 0, keyRequest.getData(), 0);
        } catch (NotProvisionedException | TPMediaDrmFatalException unused) {
            return new KeyRequest(-1, (byte[]) null, -1);
        }
    }

    public MediaCrypto getMediaCrypto(byte[] bArr) {
        try {
            return new MediaCrypto(this.mUUID, bArr);
        } catch (MediaCryptoException unused) {
            return null;
        }
    }

    public String getPropertyString(String str) {
        return this.mMediaDrm.getPropertyString(str);
    }

    public ProvisionRequest getProvisionRequest() {
        try {
            MediaDrm.ProvisionRequest provisionRequest = this.mMediaDrm.getProvisionRequest();
            return new ProvisionRequest(provisionRequest.getDefaultUrl(), provisionRequest.getData());
        } catch (TPMediaDrmFatalException unused) {
            return new ProvisionRequest("", new byte[0]);
        }
    }

    public DrmSessionId openSession() {
        int i;
        byte[] bArr = null;
        try {
            bArr = this.mMediaDrm.openSession();
            i = 0;
        } catch (NotProvisionedException unused) {
            i = -1;
        } catch (Exception unused2) {
            i = -2;
        }
        return new DrmSessionId(i, bArr);
    }

    public int provideKeyResponse(byte[] bArr, byte[] bArr2) {
        try {
            this.mMediaDrm.provideKeyResponse(bArr, bArr2);
            return 0;
        } catch (NotProvisionedException unused) {
            return -1;
        } catch (DeniedByServerException | TPMediaDrmFatalException unused2) {
            return -2;
        }
    }

    public int provideProvisionResponse(byte[] bArr) {
        try {
            this.mMediaDrm.provideProvisionResponse(bArr);
            return 0;
        } catch (DeniedByServerException unused) {
            return -1;
        }
    }

    public void release() {
        this.mMediaDrm.close();
    }

    public void setPropertyString(String str, String str2) {
        this.mMediaDrm.setPropertyString(str, str2);
    }

    private TPMediaDrmProxy(UUID uuid, boolean z) {
        ITPMediaDrm iTPMediaDrm;
        if (z) {
            iTPMediaDrm = TPMediaDrmPool.getInstance().createTPMediaDrm(uuid);
        } else {
            iTPMediaDrm = TPMediaDrmPool.getInstance().createTPDirectMediaDrm(uuid);
        }
        new ITPMediaDrm.OnEventListener() {
            public void onEvent(ITPMediaDrm iTPMediaDrm, byte[] bArr, int i, int i2, byte[] bArr2) {
                if (iTPMediaDrm == TPMediaDrmProxy.this.mMediaDrm) {
                    TPMediaDrmProxy.this.native_mediaDrmOnEvent(bArr, i, i2, bArr2);
                }
            }
        };
        this.mMediaDrm = iTPMediaDrm;
        this.mUUID = uuid;
    }
}
