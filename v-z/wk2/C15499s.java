package wk2;

import android.content.Intent;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.sdk.platformtools.Log;
import t83.C13855j;
import zt3.C119157j;

/* renamed from: wk2.s */
public final class C15499s implements MMActivity.C6739d {

    /* renamed from: d */
    public final /* synthetic */ C15500t f42035d;

    /* renamed from: e */
    public final /* synthetic */ C13855j f42036e;

    public C15499s(C15500t tVar, C13855j jVar) {
        this.f42035d = tVar;
        this.f42036e = jVar;
    }

    public final void mmOnActivityResult(int i, int i2, Intent intent) {
        Object[] objArr = new Object[3];
        boolean z = false;
        objArr[0] = Integer.valueOf(i);
        objArr[1] = Integer.valueOf(i2);
        if (intent != null) {
            z = true;
        }
        objArr[2] = Boolean.valueOf(z);
        Log.m105925i("MicroMsg.JsApiSend", "ScanJsApi-Call:send requestCode: %s, resultCode: %s, data != null: %s", objArr);
        if (i == (this.f42035d.hashCode() & 65535) && i2 == -1 && intent != null && intent.getIntExtra("sendResult", -1) == 0) {
            C15500t tVar = C15500t.f42037f;
            C13855j jVar = this.f42036e;
            tVar.getClass();
            ((C119157j) C119157j.f356862d).mo183895z(new C15498r(jVar));
        }
    }
}
