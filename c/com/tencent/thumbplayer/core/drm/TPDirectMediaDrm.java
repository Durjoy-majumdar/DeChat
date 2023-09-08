package com.tencent.thumbplayer.core.drm;

import android.media.MediaDrm;
import android.media.MediaDrmException;
import android.media.UnsupportedSchemeException;
import android.os.Build;
import android.os.Handler;
import com.tencent.thumbplayer.core.common.TPNativeLog;
import com.tencent.thumbplayer.core.drm.ITPMediaDrm;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;

public class TPDirectMediaDrm implements ITPMediaDrm {
    private static final String TAG = "TPDirectMediaDrm";
    private MediaDrm mMediaDrm;
    private ITPMediaDrm.OnEventListener mOnEventListener;
    /* access modifiers changed from: private */
    public ITPMediaDrm.OnExpirationUpdateListener mOnExpirationUpdateListener;
    /* access modifiers changed from: private */
    public ITPMediaDrm.OnKeyStatusChangeListener mOnKeyStatusChangeListener;
    private boolean mReleased = false;

    public TPDirectMediaDrm(UUID uuid) {
        try {
            this.mMediaDrm = new MediaDrm(uuid);
        } catch (UnsupportedSchemeException e) {
            throw e;
        } catch (Throwable th) {
            this.mReleased = true;
            TPNativeLog.printLog(4, TAG, "new MediaDrm failed, e:" + th);
        }
        TPNativeLog.printLog(2, TAG, "TPDirectMediaDrm constructor");
    }

    public synchronized void close() {
        if (!this.mReleased) {
            this.mMediaDrm.setOnEventListener((MediaDrm.OnEventListener) null);
            this.mOnEventListener = null;
            int i = Build.VERSION.SDK_INT;
            if (i >= 23) {
                this.mMediaDrm.setOnExpirationUpdateListener((MediaDrm.OnExpirationUpdateListener) null, (Handler) null);
            }
            this.mOnExpirationUpdateListener = null;
            if (i >= 23) {
                this.mMediaDrm.setOnKeyStatusChangeListener((MediaDrm.OnKeyStatusChangeListener) null, (Handler) null);
            }
            this.mOnKeyStatusChangeListener = null;
            if (i >= 28) {
                try {
                    this.mMediaDrm.close();
                } catch (Throwable th) {
                    TPNativeLog.printLog(4, TAG, th.toString());
                }
            } else {
                this.mMediaDrm.release();
            }
            this.mMediaDrm = null;
            this.mReleased = true;
        }
    }

    public synchronized void closeSession(byte[] bArr) {
        if (!this.mReleased) {
            try {
                this.mMediaDrm.closeSession(bArr);
            } catch (Throwable th) {
                TPNativeLog.printLog(4, TAG, th.toString());
                close();
            }
        } else {
            return;
        }
        return;
    }

    public synchronized MediaDrm.KeyRequest getKeyRequest(byte[] bArr, byte[] bArr2, String str, int i, HashMap<String, String> hashMap) {
        if (!this.mReleased) {
            try {
            } catch (MediaDrmException e) {
                throw e;
            } catch (Throwable th) {
                TPNativeLog.printLog(4, TAG, th.toString());
                close();
                throw new TPMediaDrmFatalException(th.getMessage());
            }
        } else {
            throw new TPMediaDrmFatalException("released");
        }
        return this.mMediaDrm.getKeyRequest(bArr, bArr2, str, i, hashMap);
    }

    public synchronized String getPropertyString(String str) {
        if (this.mReleased) {
            return "";
        }
        try {
            return this.mMediaDrm.getPropertyString(str);
        } catch (Throwable th) {
            TPNativeLog.printLog(4, TAG, th.toString());
            close();
            return "";
        }
    }

    public synchronized MediaDrm.ProvisionRequest getProvisionRequest() {
        if (!this.mReleased) {
            try {
            } catch (Throwable th) {
                TPNativeLog.printLog(4, TAG, th.toString());
                close();
                throw new TPMediaDrmFatalException(th.getMessage());
            }
        } else {
            throw new TPMediaDrmFatalException("released");
        }
        return this.mMediaDrm.getProvisionRequest();
    }

    public synchronized byte[] openSession() {
        if (!this.mReleased) {
            try {
            } catch (MediaDrmException e) {
                throw e;
            } catch (Throwable th) {
                TPNativeLog.printLog(4, TAG, th.toString());
                close();
                throw new TPMediaDrmFatalException(th.getMessage());
            }
        } else {
            throw new TPMediaDrmFatalException("released");
        }
        return this.mMediaDrm.openSession();
    }

    public synchronized byte[] provideKeyResponse(byte[] bArr, byte[] bArr2) {
        if (!this.mReleased) {
            try {
            } catch (MediaDrmException e) {
                throw e;
            } catch (Throwable th) {
                TPNativeLog.printLog(4, TAG, th.toString());
                close();
                throw new TPMediaDrmFatalException(th.getMessage());
            }
        } else {
            throw new TPMediaDrmFatalException("released");
        }
        return this.mMediaDrm.provideKeyResponse(bArr, bArr2);
    }

    public synchronized void provideProvisionResponse(byte[] bArr) {
        if (!this.mReleased) {
            try {
                this.mMediaDrm.provideProvisionResponse(bArr);
            } catch (MediaDrmException e) {
                throw e;
            } catch (Throwable th) {
                TPNativeLog.printLog(4, TAG, th.toString());
                close();
            }
        } else {
            return;
        }
        return;
    }

    public synchronized HashMap<String, String> queryKeyStatus(byte[] bArr) {
        if (this.mReleased) {
            return new HashMap<>();
        }
        try {
            return this.mMediaDrm.queryKeyStatus(bArr);
        } catch (Throwable th) {
            TPNativeLog.printLog(4, TAG, th.toString());
            close();
            return new HashMap<>();
        }
    }

    public synchronized void removeKeys(byte[] bArr) {
        if (!this.mReleased) {
            try {
                this.mMediaDrm.removeKeys(bArr);
            } catch (Throwable th) {
                TPNativeLog.printLog(4, TAG, th.toString());
                close();
            }
        } else {
            return;
        }
        return;
    }

    public synchronized void restoreKeys(byte[] bArr, byte[] bArr2) {
        if (!this.mReleased) {
            try {
                this.mMediaDrm.restoreKeys(bArr, bArr2);
            } catch (Throwable th) {
                TPNativeLog.printLog(4, TAG, th.toString());
                close();
            }
        } else {
            return;
        }
        return;
    }

    public synchronized void setOnExpirationUpdateListener(ITPMediaDrm.OnExpirationUpdateListener onExpirationUpdateListener, Handler handler) {
        if (Build.VERSION.SDK_INT >= 23) {
            if (!this.mReleased) {
                this.mOnExpirationUpdateListener = onExpirationUpdateListener;
                this.mMediaDrm.setOnExpirationUpdateListener(new MediaDrm.OnExpirationUpdateListener() {
                    public void onExpirationUpdate(MediaDrm mediaDrm, byte[] bArr, long j) {
                        ITPMediaDrm.OnExpirationUpdateListener access$100 = TPDirectMediaDrm.this.mOnExpirationUpdateListener;
                        if (access$100 != null) {
                            access$100.onExpirationUpdate(TPDirectMediaDrm.this, bArr, j);
                        }
                    }
                }, handler);
            }
        }
    }

    public synchronized void setOnKeyStatusChangeListener(ITPMediaDrm.OnKeyStatusChangeListener onKeyStatusChangeListener, Handler handler) {
        if (Build.VERSION.SDK_INT >= 23) {
            if (!this.mReleased) {
                this.mOnKeyStatusChangeListener = onKeyStatusChangeListener;
                this.mMediaDrm.setOnKeyStatusChangeListener(new MediaDrm.OnKeyStatusChangeListener() {
                    public void onKeyStatusChange(MediaDrm mediaDrm, byte[] bArr, List<MediaDrm.KeyStatus> list, boolean z) {
                        ITPMediaDrm.OnKeyStatusChangeListener access$000 = TPDirectMediaDrm.this.mOnKeyStatusChangeListener;
                        if (access$000 != null) {
                            access$000.onKeyStatusChange(TPDirectMediaDrm.this, bArr, list, z);
                        }
                    }
                }, handler);
            }
        }
    }

    public synchronized void setPropertyString(String str, String str2) {
        if (!this.mReleased) {
            try {
                this.mMediaDrm.setPropertyString(str, str2);
            } catch (Throwable th) {
                TPNativeLog.printLog(4, TAG, th.toString());
                close();
            }
        } else {
            return;
        }
        return;
    }
}
