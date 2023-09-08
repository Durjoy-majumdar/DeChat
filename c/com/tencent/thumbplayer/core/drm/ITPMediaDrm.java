package com.tencent.thumbplayer.core.drm;

import android.media.MediaDrm;
import android.os.Handler;
import java.util.HashMap;
import java.util.List;

public interface ITPMediaDrm {

    public interface OnEventListener {
        void onEvent(ITPMediaDrm iTPMediaDrm, byte[] bArr, int i, int i2, byte[] bArr2);
    }

    public interface OnExpirationUpdateListener {
        void onExpirationUpdate(ITPMediaDrm iTPMediaDrm, byte[] bArr, long j);
    }

    public interface OnKeyStatusChangeListener {
        void onKeyStatusChange(ITPMediaDrm iTPMediaDrm, byte[] bArr, List<MediaDrm.KeyStatus> list, boolean z);
    }

    void close();

    void closeSession(byte[] bArr);

    MediaDrm.KeyRequest getKeyRequest(byte[] bArr, byte[] bArr2, String str, int i, HashMap<String, String> hashMap);

    String getPropertyString(String str);

    MediaDrm.ProvisionRequest getProvisionRequest();

    byte[] openSession();

    byte[] provideKeyResponse(byte[] bArr, byte[] bArr2);

    void provideProvisionResponse(byte[] bArr);

    HashMap<String, String> queryKeyStatus(byte[] bArr);

    void removeKeys(byte[] bArr);

    void restoreKeys(byte[] bArr, byte[] bArr2);

    void setOnExpirationUpdateListener(OnExpirationUpdateListener onExpirationUpdateListener, Handler handler);

    void setOnKeyStatusChangeListener(OnKeyStatusChangeListener onKeyStatusChangeListener, Handler handler);

    void setPropertyString(String str, String str2);
}
