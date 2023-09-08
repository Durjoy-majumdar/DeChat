package p670qx;

import android.os.Handler;
import android.text.TextUtils;
import com.tencent.p014mm.app.C114661d0;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import f40.C86709a0;
import p156gj.C87203t;
import p655px.C35714j;

/* renamed from: qx.l */
public class C36156l implements C114661d0 {
    public Handler getHandler() {
        return null;
    }

    public void onAppBackground(String str) {
        MMApplicationContext.isMainProcess();
    }

    public void onAppForeground(String str) {
        if (!MMApplicationContext.isMainProcess()) {
            return;
        }
        if (!TextUtils.isEmpty(C87203t.m108266b()) || C86709a0.m107522a()) {
            C35714j.vx0();
        }
    }
}
