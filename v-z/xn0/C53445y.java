package xn0;

import android.os.Bundle;
import com.tencent.p014mm.sdk.platformtools.Log;
import d93.C45310h;
import t83.C48590l;

/* renamed from: xn0.y */
public class C53445y implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ Bundle f150347d;

    /* renamed from: e */
    public final /* synthetic */ C53437j0 f150348e;

    public C53445y(C53437j0 j0Var, Bundle bundle) {
        this.f150348e = j0Var;
        this.f150347d = bundle;
    }

    public void run() {
        C45310h hVar;
        if (!this.f150347d.containsKey("jsapi_preverify_fun_list") || (hVar = this.f150348e.f150340f) == null) {
            boolean z = true;
            Object[] objArr = new Object[1];
            if (this.f150348e.f150340f == null) {
                z = false;
            }
            objArr[0] = Boolean.valueOf(z);
            Log.m105921e("MicroMsg.MMDefaultWebViewStubCallback", "has JSAPI_CONTROL_BYTES wvPerm %b", objArr);
        } else {
            hVar.mo70866i(this.f150347d);
        }
        C48590l lVar = this.f150348e.f150339e;
        if (lVar != null) {
            lVar.mo8700d();
        }
    }
}
