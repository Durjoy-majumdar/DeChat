package p922vj;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import kj2.C117407d;
import p749xh.C78821o1;

/* renamed from: vj.a */
public class C78420a extends C78821o1 {

    /* renamed from: m1 */
    public static IAutoDBItem.MAutoDBInfo f229768m1 = C78821o1.initAutoDBInfo(C78420a.class);

    public C78420a() {
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f229768m1;
    }

    /* renamed from: j3 */
    public void mo108371j3(int i) {
        int m2 = mo108819m2() | i;
        if (mo108819m2() >= 0 && mo108819m2() < 536870912 && ((m2 >= 536870912 || m2 < 0) && getUsername().contains("@"))) {
            Log.m105925i("Conversition", "wrong add attr flag: %s, %s, %s, %s", getUsername(), Integer.valueOf(mo108819m2()), Integer.valueOf(i), Util.getStack());
            C117407d.INSTANCE.mo160131h(20435, 2, Integer.valueOf(mo108819m2()), Integer.valueOf(i), getUsername());
        }
        mo108790K2(i | mo108819m2());
    }

    /* renamed from: k3 */
    public boolean mo108372k3(int i) {
        return (i & mo108819m2()) != 0;
    }

    /* renamed from: l3 */
    public void mo108373l3(int i) {
        mo108790K2((~i) & mo108819m2());
    }

    public C78420a(String str) {
        setUsername(str);
    }
}
