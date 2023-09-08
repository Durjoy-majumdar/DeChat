package com.tencent.thumbplayer.core.drm.reuse;

import android.media.MediaDrm;
import android.media.MediaDrmException;
import android.os.Build;
import android.os.Handler;
import com.tencent.thumbplayer.core.common.TPNativeLog;
import com.tencent.thumbplayer.core.drm.ITPMediaDrm;
import com.tencent.thumbplayer.core.drm.TPDirectMediaDrm;
import com.tencent.thumbplayer.core.drm.TPMediaDrmFatalException;
import com.tencent.thumbplayer.core.drm.reuse.TPDoubleQueueCachedPool;
import com.tencent.thumbplayer.core.utils.TPThreadPool;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;

public class TPReuseMediaDrm implements ITPMediaDrm {
    private static final int INIT_POOL_SIZE = 1;
    private static final int KEEP_POOL_SIZE = 2;
    private static final String TAG = "[PlayerCore][TPReuseMediaDrm]";
    private static final UUID WIDEVINE_UUID = new UUID(-1301668207276963122L, -6645017420763422227L);
    private static HashMap<UUID, TPDoubleQueueCachedPool<TPMediaDrmInfo>> mMediaDrmCachedPoolMap = null;
    private final boolean mCanReUse;
    /* access modifiers changed from: private */
    public ITPMediaDrm.OnExpirationUpdateListener mOnExpirationUpdateListener;
    /* access modifiers changed from: private */
    public ITPMediaDrm.OnKeyStatusChangeListener mOnKeyStatusChangeListener;
    private final ITPMediaDrm mTPMediaDrm;
    /* access modifiers changed from: private */
    public boolean mTPMediaDrmError = false;
    /* access modifiers changed from: private */
    public final TPMediaDrmInfo mTPMediaDrmInfo;
    /* access modifiers changed from: private */
    public final UUID mUUID;

    public static class TPMediaDrmInfo {
        public byte[] sessionId;
        public final ITPMediaDrm tpMediaDrm;

        public TPMediaDrmInfo(ITPMediaDrm iTPMediaDrm, byte[] bArr) {
            this.tpMediaDrm = iTPMediaDrm;
            this.sessionId = bArr;
        }
    }

    public static class TPObjectLifecycleMgr implements TPDoubleQueueCachedPool.ITPObjectLifecycleMgr<TPMediaDrmInfo> {
        private final UUID mUUID;

        public TPObjectLifecycleMgr(UUID uuid) {
            this.mUUID = uuid;
        }

        public TPMediaDrmInfo create(TPDoubleQueueCachedPool<TPMediaDrmInfo> tPDoubleQueueCachedPool) {
            try {
                TPDirectMediaDrm tPDirectMediaDrm = new TPDirectMediaDrm(this.mUUID);
                return new TPMediaDrmInfo(tPDirectMediaDrm, tPDirectMediaDrm.openSession());
            } catch (MediaDrmException | TPMediaDrmFatalException e) {
                TPNativeLog.printLog(4, TPReuseMediaDrm.TAG, "createObject error:" + e);
                return null;
            }
        }

        public void release(TPDoubleQueueCachedPool<TPMediaDrmInfo> tPDoubleQueueCachedPool, TPMediaDrmInfo tPMediaDrmInfo) {
            tPMediaDrmInfo.tpMediaDrm.close();
        }

        public boolean reset(TPDoubleQueueCachedPool<TPMediaDrmInfo> tPDoubleQueueCachedPool, TPMediaDrmInfo tPMediaDrmInfo) {
            tPMediaDrmInfo.tpMediaDrm.closeSession(tPMediaDrmInfo.sessionId);
            try {
                tPMediaDrmInfo.sessionId = tPMediaDrmInfo.tpMediaDrm.openSession();
                return true;
            } catch (MediaDrmException | TPMediaDrmFatalException e) {
                TPNativeLog.printLog(4, TPReuseMediaDrm.TAG, "reset error:" + e);
                return false;
            }
        }
    }

    public TPReuseMediaDrm(UUID uuid) {
        boolean z = false;
        preload();
        TPMediaDrmInfo allocTPMediaDrm = allocTPMediaDrm(uuid);
        this.mCanReUse = allocTPMediaDrm != null ? true : z;
        if (allocTPMediaDrm == null) {
            TPDirectMediaDrm tPDirectMediaDrm = new TPDirectMediaDrm(uuid);
            allocTPMediaDrm = new TPMediaDrmInfo(tPDirectMediaDrm, tPDirectMediaDrm.openSession());
        }
        this.mTPMediaDrmInfo = allocTPMediaDrm;
        this.mTPMediaDrm = allocTPMediaDrm.tpMediaDrm;
        this.mUUID = uuid;
        TPNativeLog.printLog(2, TAG, "TPReuseMediaDrm constructor");
    }

    private TPMediaDrmInfo allocTPMediaDrm(UUID uuid) {
        TPDoubleQueueCachedPool tPDoubleQueueCachedPool = mMediaDrmCachedPoolMap.get(uuid);
        if (tPDoubleQueueCachedPool != null) {
            return (TPMediaDrmInfo) tPDoubleQueueCachedPool.allocObject();
        }
        TPNativeLog.printLog(4, TAG, "allocTPMediaDrm error, this UUID DRM is not cached");
        return null;
    }

    /* access modifiers changed from: private */
    public void freeTPMediaDrm(UUID uuid, TPMediaDrmInfo tPMediaDrmInfo, boolean z) {
        TPDoubleQueueCachedPool tPDoubleQueueCachedPool = mMediaDrmCachedPoolMap.get(uuid);
        if (tPDoubleQueueCachedPool == null) {
            tPMediaDrmInfo.tpMediaDrm.close();
        } else if (z) {
            tPDoubleQueueCachedPool.freeObject(tPMediaDrmInfo);
        } else {
            tPDoubleQueueCachedPool.recycleObject(tPMediaDrmInfo);
        }
    }

    /* access modifiers changed from: private */
    public static void preload() {
        if (mMediaDrmCachedPoolMap == null) {
            UUID uuid = WIDEVINE_UUID;
            TPDoubleQueueCachedPool tPDoubleQueueCachedPool = new TPDoubleQueueCachedPool(1, 2, new TPObjectLifecycleMgr(uuid));
            synchronized (TPReuseMediaDrm.class) {
                if (mMediaDrmCachedPoolMap == null) {
                    HashMap<UUID, TPDoubleQueueCachedPool<TPMediaDrmInfo>> hashMap = new HashMap<>();
                    mMediaDrmCachedPoolMap = hashMap;
                    hashMap.put(uuid, tPDoubleQueueCachedPool);
                    tPDoubleQueueCachedPool = null;
                }
            }
            if (tPDoubleQueueCachedPool != null) {
                tPDoubleQueueCachedPool.release();
            }
        }
    }

    public static void preloadAsync() {
        TPThreadPool.getInstance().obtainThreadExecutor().execute(new Runnable() {
            public void run() {
                TPReuseMediaDrm.preload();
            }
        });
    }

    public void close() {
        int i = Build.VERSION.SDK_INT;
        if (i >= 23) {
            this.mTPMediaDrm.setOnExpirationUpdateListener((ITPMediaDrm.OnExpirationUpdateListener) null, (Handler) null);
        }
        this.mOnExpirationUpdateListener = null;
        if (i >= 23) {
            this.mTPMediaDrm.setOnKeyStatusChangeListener((ITPMediaDrm.OnKeyStatusChangeListener) null, (Handler) null);
        }
        this.mOnKeyStatusChangeListener = null;
        if (!this.mCanReUse) {
            this.mTPMediaDrm.close();
        } else {
            TPThreadPool.getInstance().obtainThreadExecutor().execute(new Runnable() {
                public void run() {
                    TPReuseMediaDrm tPReuseMediaDrm = TPReuseMediaDrm.this;
                    tPReuseMediaDrm.freeTPMediaDrm(tPReuseMediaDrm.mUUID, TPReuseMediaDrm.this.mTPMediaDrmInfo, TPReuseMediaDrm.this.mTPMediaDrmError);
                }
            });
        }
    }

    public synchronized void closeSession(byte[] bArr) {
        if (!Arrays.equals(bArr, this.mTPMediaDrmInfo.sessionId)) {
            this.mTPMediaDrmError = true;
        }
    }

    public MediaDrm.KeyRequest getKeyRequest(byte[] bArr, byte[] bArr2, String str, int i, HashMap<String, String> hashMap) {
        return this.mTPMediaDrm.getKeyRequest(bArr, bArr2, str, i, hashMap);
    }

    public String getPropertyString(String str) {
        return this.mTPMediaDrm.getPropertyString(str);
    }

    public MediaDrm.ProvisionRequest getProvisionRequest() {
        return this.mTPMediaDrm.getProvisionRequest();
    }

    public synchronized byte[] openSession() {
        return this.mTPMediaDrmInfo.sessionId;
    }

    public byte[] provideKeyResponse(byte[] bArr, byte[] bArr2) {
        return this.mTPMediaDrm.provideKeyResponse(bArr, bArr2);
    }

    public void provideProvisionResponse(byte[] bArr) {
        this.mTPMediaDrm.provideProvisionResponse(bArr);
    }

    public HashMap<String, String> queryKeyStatus(byte[] bArr) {
        return this.mTPMediaDrm.queryKeyStatus(bArr);
    }

    public void removeKeys(byte[] bArr) {
        this.mTPMediaDrm.removeKeys(bArr);
    }

    public void restoreKeys(byte[] bArr, byte[] bArr2) {
        this.mTPMediaDrm.restoreKeys(bArr, bArr2);
    }

    public void setOnExpirationUpdateListener(ITPMediaDrm.OnExpirationUpdateListener onExpirationUpdateListener, Handler handler) {
        if (Build.VERSION.SDK_INT >= 23) {
            this.mOnExpirationUpdateListener = onExpirationUpdateListener;
            this.mTPMediaDrm.setOnExpirationUpdateListener(new ITPMediaDrm.OnExpirationUpdateListener() {
                public void onExpirationUpdate(ITPMediaDrm iTPMediaDrm, byte[] bArr, long j) {
                    ITPMediaDrm.OnExpirationUpdateListener access$200 = TPReuseMediaDrm.this.mOnExpirationUpdateListener;
                    if (access$200 != null) {
                        access$200.onExpirationUpdate(TPReuseMediaDrm.this, bArr, j);
                    }
                }
            }, handler);
        }
    }

    public void setOnKeyStatusChangeListener(ITPMediaDrm.OnKeyStatusChangeListener onKeyStatusChangeListener, Handler handler) {
        if (Build.VERSION.SDK_INT >= 23) {
            this.mOnKeyStatusChangeListener = onKeyStatusChangeListener;
            this.mTPMediaDrm.setOnKeyStatusChangeListener(new ITPMediaDrm.OnKeyStatusChangeListener() {
                public void onKeyStatusChange(ITPMediaDrm iTPMediaDrm, byte[] bArr, List<MediaDrm.KeyStatus> list, boolean z) {
                    ITPMediaDrm.OnKeyStatusChangeListener access$100 = TPReuseMediaDrm.this.mOnKeyStatusChangeListener;
                    if (access$100 != null) {
                        access$100.onKeyStatusChange(TPReuseMediaDrm.this, bArr, list, z);
                    }
                }
            }, handler);
        }
    }

    public void setPropertyString(String str, String str2) {
        this.mTPMediaDrm.setPropertyString(str, str2);
    }
}
