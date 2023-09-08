package y71;

import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: y71.b */
public class C23269b implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C23272e f66887d;

    /* renamed from: e */
    public final /* synthetic */ int f66888e;

    /* renamed from: f */
    public final /* synthetic */ C23277l f66889f;

    /* renamed from: g */
    public final /* synthetic */ int[] f66890g;

    public C23269b(C23272e eVar, int i, C23277l lVar, int[] iArr) {
        this.f66887d = eVar;
        this.f66888e = i;
        this.f66889f = lVar;
        this.f66890g = iArr;
    }

    public void run() {
        if (!C23272e.m27748a(this.f66887d, this.f66888e, this.f66889f, this.f66890g)) {
            Log.m105920e("MicroMsg.exdevice.BluetoothSDKAdapter", "instance.scanImp failed!!!");
        }
    }
}
