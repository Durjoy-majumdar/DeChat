package g81;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.LinkedList;
import java.util.List;
import oa1.C117731d;
import oa1.C61982a;
import oa1.C61983b;
import te3.C64389ga0;

/* renamed from: g81.b */
public class C59377b {

    /* renamed from: b */
    public static C59377b f169709b;

    /* renamed from: a */
    public String f169710a = null;

    /* renamed from: a */
    public MultiProcessMMKV mo84478a() {
        int h = C117731d.m166007c().mo182446h();
        if (h == 0) {
            Log.m105921e("MicroMsg.ExptIdMMKV", "uin err [%d]", Integer.valueOf(h));
            return null;
        }
        String str = h + "_" + "WxExptIdmmkv";
        if (!Util.isEqual(this.f169710a, str)) {
            Log.m105925i("MicroMsg.ExptIdMMKV", "%s get mmkv change uin old[%s] new[%s]", hashCode() + "", this.f169710a, str);
            this.f169710a = str;
        }
        return MultiProcessMMKV.getMMKV(this.f169710a);
    }

    /* renamed from: b */
    public List<C64389ga0> mo84479b() {
        String[] allKeys;
        LinkedList linkedList = new LinkedList();
        MultiProcessMMKV a = mo84478a();
        if (!(a == null || (allKeys = a.allKeys()) == null || allKeys.length <= 0)) {
            Log.m105925i("MicroMsg.ExptIdMMKV", "mmkv keys length is [%d] ", Integer.valueOf(allKeys.length));
            for (int i = 0; i < allKeys.length; i++) {
                C64389ga0 ga02 = new C64389ga0();
                C61982a f = C61983b.m72724e().mo86870f(Util.getInt(allKeys[i], 0));
                if (f != null) {
                    ga02.f183291d = f.f176193a;
                    ga02.f183292e = f.f176194b;
                    ga02.f183293f = f.f176195c;
                    ga02.f183294g = a.decodeInt(allKeys[i]);
                    linkedList.add(ga02);
                }
            }
        }
        return linkedList;
    }
}
