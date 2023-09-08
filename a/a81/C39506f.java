package a81;

import com.tencent.p014mm.plugin.exdevice.model.C41140m;
import com.tencent.p014mm.plugin.exdevice.model.C41166r1;
import com.tencent.p014mm.plugin.exdevice.model.C41171u1;
import com.tencent.p014mm.sdk.platformtools.Log;
import d81.C45288e;
import n71.C47174e;
import pe3.C89349b;
import s71.C48246f;
import y71.C53501k;
import y71.C53502m;

/* renamed from: a81.f */
public class C39506f extends C41171u1 {

    /* renamed from: d */
    public C47174e f106075d;

    /* renamed from: e */
    public int f106076e;

    public C39506f(int i, long j, int i2, int i3, byte[] bArr) {
        this.f106075d = new C47174e(j, i2, i3, bArr);
        this.f106076e = i;
    }

    /* renamed from: a */
    public boolean mo62113a(C53501k kVar, C39504d dVar) {
        if (!C53502m.m60037a().mo74180g(this.f106075d.f126719a)) {
            Log.m105921e("MicroMsg.exdevice.MMInitTaskExcuter", "This device send other cmd before do auth, device id = %d", Long.valueOf(this.f106075d.f126719a));
            this.f106075d.mo72253e(-2, "", new byte[0], new byte[0], 0, 0);
            boolean b = new C39501a(this.f106075d, dVar).mo62110b(kVar);
            Log.m105925i("MicroMsg.exdevice.MMInitTaskExcuter", "init start task : %b", Boolean.valueOf(b));
            return b;
        }
        int i = this.f106076e;
        if (-5 == i || -3 == i || -4 == i) {
            Log.m105921e("MicroMsg.exdevice.MMInitTaskExcuter", "Error Code = %d, reply errorcode to device and close channel", Integer.valueOf(i));
            this.f106075d.mo72253e(-1, "", new byte[0], new byte[0], 0, 0);
            boolean b2 = new C39501a(this.f106075d, dVar).mo62110b(kVar);
            Log.m105925i("MicroMsg.exdevice.MMInitTaskExcuter", "init start task : %b", Boolean.valueOf(b2));
            return b2;
        }
        C48246f fVar = (C48246f) this.f106075d.f126723e;
        if (fVar == null) {
            Log.m105920e("MicroMsg.exdevice.MMInitTaskExcuter", "Init Request parse failed, Tell device before stop this task");
            this.f106075d.mo72253e(-4, "", new byte[0], new byte[0], 0, 0);
            boolean b3 = new C39501a(this.f106075d, dVar).mo62110b(kVar);
            Log.m105925i("MicroMsg.exdevice.MMInitTaskExcuter", "init start task : %b", Boolean.valueOf(b3));
            return b3;
        }
        C89349b bVar = fVar.f129250f;
        byte[] bArr = null;
        byte[] f = bVar != null ? bVar.mo123703f() : null;
        C89349b bVar2 = fVar.f129249e;
        if (bVar2 != null) {
            bArr = bVar2.mo123703f();
        }
        byte[] bArr2 = bArr;
        C41166r1.xx0().getClass();
        int i2 = C41140m.f110825g;
        if (!(i2 == 1 || i2 == 2)) {
            Log.m105921e("MicroMsg.exdevice.MMInitTaskExcuter", "initScene = %d, Cannot start init response", Integer.valueOf(i2));
        }
        this.f106075d.mo72253e(0, (String) null, bArr2, f, i2, (int) (C45288e.m50134e() / 1000));
        return new C39501a(this.f106075d, dVar).mo62110b(kVar);
    }
}
