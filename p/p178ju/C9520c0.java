package p178ju;

import android.app.ProgressDialog;
import c62.C0419f;
import com.tencent.p014mm.sdk.crash.CrashReportFactory;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import di3.C86312j;
import nj3.C76912y0;
import ob0.C117747y;
import ob0.C35142u;
import p239sv.C13785l;

/* renamed from: ju.c0 */
public class C9520c0 implements C35142u {
    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        C0419f fVar = (C0419f) C86312j.m106911c(C0419f.class);
        fVar.getClass();
        try {
            if (CrashReportFactory.hasDebuger()) {
                C76912y0.makeText(MMApplicationContext.getContext(), (CharSequence) String.format("just debug errType %s errCode %s errMsg %s", new Object[]{Integer.valueOf(i), Integer.valueOf(i2), str}), 1).show();
            }
            if (yVar.getType() == 853) {
                ProgressDialog progressDialog = fVar.f1033i;
                if (progressDialog != null) {
                    progressDialog.dismiss();
                    fVar.f1033i = null;
                }
                if (yVar.equals(fVar.f1034j)) {
                    C13785l lVar = (C13785l) yVar;
                    if (i2 == 0) {
                        MMApplicationContext.getContext().getSharedPreferences("switch_contact_prefs", 0).edit().putBoolean(fVar.Dx0(lVar.mo13147i(), lVar.mo13149u()), true).commit();
                        fVar.Hx0(lVar.mo13147i());
                    }
                    Log.m105928w("MicroMsg.PluginMessenger", "onSceneEnd VerifyOpenIMContact errCode: " + i2 + " errType: " + i + " userName: " + lVar.mo13147i() + " ticket: " + lVar.mo13146E0() + " talkerUsername: " + lVar.mo13149u());
                }
            }
        } catch (Throwable th) {
            Log.m105920e("MicroMsg.PluginMessenger", "onSceneEnd " + th);
        }
    }
}
