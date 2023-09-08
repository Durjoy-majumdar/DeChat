package eb1;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import ob0.C11385n;
import ob0.C47357z;
import te3.C49510g33;

/* renamed from: eb1.r */
public abstract class C45645r extends C47357z {

    /* renamed from: f */
    public static String f123433f;

    /* renamed from: e */
    public C11385n f123434e = null;

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f123434e = nVar;
        if (Util.isNullOrNil(f123433f)) {
            return getType();
        }
        Log.m105925i("MicroMsg.NetSceneFaceRsaBase", "hy: has ticket: %s", f123433f);
        mo71160m1(f123433f);
        return mo71157j1(gVar, nVar);
    }

    /* renamed from: j1 */
    public abstract int mo71157j1(C114770g gVar, C11385n nVar);

    /* renamed from: k1 */
    public abstract C49510g33 mo71158k1(C114799u uVar);

    /* renamed from: l1 */
    public abstract void mo71159l1(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr);

    /* renamed from: m1 */
    public abstract void mo71160m1(String str);
}
