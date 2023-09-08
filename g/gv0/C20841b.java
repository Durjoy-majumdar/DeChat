package gv0;

import com.tencent.p014mm.sdk.platformtools.Log;
import gv0.C20842c;

/* renamed from: gv0.b */
public class C20841b implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ boolean f58871d;

    /* renamed from: e */
    public final /* synthetic */ int f58872e;

    /* renamed from: f */
    public final /* synthetic */ byte[] f58873f;

    /* renamed from: g */
    public final /* synthetic */ int f58874g;

    public C20841b(boolean z, int i, byte[] bArr, int i2) {
        this.f58871d = z;
        this.f58872e = i;
        this.f58873f = bArr;
        this.f58874g = i2;
    }

    public void run() {
        C20842c.C20846e eVar = C20842c.f58878i;
        if (eVar != null) {
            eVar.mo17669a(this.f58871d, this.f58872e, this.f58873f, this.f58874g);
        } else {
            Log.m105928w("MicroMsg.BackupBaseScene", "callbackToNotify, onNotify is null");
        }
    }
}
