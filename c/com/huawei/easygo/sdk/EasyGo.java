package com.huawei.easygo.sdk;

import android.content.Context;
import android.os.Bundle;
import com.huawei.easygo.BuildConfig;
import com.huawei.easygo.callback.IEasyGoCallback;
import com.huawei.easygo.manager.EasyGoManager;
import com.huawei.easygo.sdk.module.EasyGoRet;
import java.util.Collections;
import java.util.List;
import org.json.JSONObject;

public final class EasyGo {
    private static final String TAG = "EasyGo";
    private EasyGoManager mEasyGoManager = null;

    public EasyGo(Context context) {
        if (getRomSupStatus(context) == 0) {
            this.mEasyGoManager = new EasyGoManager(context);
        }
    }

    private List<Integer> assembleInitFailRet(String[] strArr) {
        if (strArr == null) {
            return null;
        }
        return Collections.nCopies(strArr.length, 507);
    }

    private int getRomSupStatus(Context context) {
        try {
            return new EasyGoManager(context).getRomSupStatus(context, BuildConfig.VERSION_NAME);
        } catch (NoClassDefFoundError unused) {
            return 506;
        } catch (SecurityException unused2) {
            return 508;
        } catch (Exception unused3) {
            return 509;
        }
    }

    public List<Integer> init(String[] strArr) {
        EasyGoManager easyGoManager = this.mEasyGoManager;
        return easyGoManager == null ? assembleInitFailRet(strArr) : easyGoManager.init(strArr);
    }

    public void invokeAsync(String str, String str2, JSONObject jSONObject, Bundle bundle, IEasyGoCallback iEasyGoCallback) {
        EasyGoManager easyGoManager = this.mEasyGoManager;
        if (easyGoManager != null) {
            easyGoManager.invokeAsync(str, str2, jSONObject, bundle, iEasyGoCallback);
        }
    }

    public EasyGoRet invokeSync(String str, String str2, JSONObject jSONObject, Bundle bundle) {
        EasyGoManager easyGoManager = this.mEasyGoManager;
        return easyGoManager == null ? new EasyGoRet(507, new Bundle()) : new EasyGoRet(easyGoManager.invokeSync(str, str2, jSONObject, bundle));
    }

    public void release() {
        EasyGoManager easyGoManager = this.mEasyGoManager;
        if (easyGoManager != null) {
            easyGoManager.release();
        }
    }
}
