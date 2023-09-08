package com.tencent.thumbplayer.core.drm;

import android.media.MediaDrmException;
import com.tencent.thumbplayer.core.common.TPNativeLog;
import com.tencent.thumbplayer.core.drm.reuse.TPReuseMediaDrm;
import java.util.UUID;

public final class TPMediaDrmPool {
    private static final String TAG = "TPMediaDrmManager";
    private static final TPMediaDrmPool sInstance = new TPMediaDrmPool();
    private boolean mIsMediaDrmReuse = false;

    private TPMediaDrmPool() {
    }

    public static TPMediaDrmPool getInstance() {
        return sInstance;
    }

    public ITPMediaDrm createTPDirectMediaDrm(UUID uuid) {
        return new TPDirectMediaDrm(uuid);
    }

    public ITPMediaDrm createTPMediaDrm(UUID uuid) {
        if (this.mIsMediaDrmReuse) {
            try {
                return new TPReuseMediaDrm(uuid);
            } catch (MediaDrmException | TPMediaDrmFatalException e) {
                TPNativeLog.printLog(4, TAG, "reset error:" + e);
            }
        }
        return new TPDirectMediaDrm(uuid);
    }

    public void preload() {
        TPReuseMediaDrm.preloadAsync();
    }

    public void setMediaDrmReuseEnable(boolean z) {
        this.mIsMediaDrmReuse = z;
        if (z) {
            preload();
        }
    }
}
