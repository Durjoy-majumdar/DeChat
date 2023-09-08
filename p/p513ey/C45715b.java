package p513ey;

import com.tencent.p014mm.modelsimple.C40357e0;
import com.tencent.p014mm.modelsimple.C40359h0;
import com.tencent.p014mm.modelsimple.C40360i0;
import com.tencent.p014mm.modelsimple.C40361k0;
import com.tencent.p014mm.modelsimple.C40365o;
import com.tencent.p014mm.modelsimple.C40374z;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72963f4;
import di3.C86301e;
import eb0.C75592q0;
import ei3.C86522b;
import f40.C86709a0;
import g62.C45887r;
import java.util.HashSet;
import java.util.LinkedList;
import p154fy.C32223f;
import p154fy.C45843c;
import p154fy.C45844i;
import p154fy.C8217g;
import p154fy.C87119d;
import p154fy.C87120h;
import p154fy.C87121j;
import p645pj.C47509i;
import te3.C52064y4;

@C86522b
/* renamed from: ey.b */
public class C45715b extends C86301e implements C87121j, C32223f, C45887r {
    /* renamed from: A8 */
    public C87120h mo71209A8(String str, int i, LinkedList<C52064y4> linkedList) {
        return new C40360i0(str, i, linkedList);
    }

    public C8217g J20(int i, String str) {
        return new C40357e0(i, str, "");
    }

    /* renamed from: KQ */
    public C8217g mo71211KQ(int i, String str, String str2) {
        return new C40357e0(i, str, str2);
    }

    /* renamed from: Kr */
    public C8217g mo71212Kr(String str) {
        return new C40357e0(str);
    }

    /* renamed from: Ot */
    public void mo71213Ot(String str, int i) {
        C40359h0.m43529k1(str, i);
    }

    public C8217g Tf0(String str, boolean z, boolean z2, boolean z3, boolean z4) {
        return new C40357e0(str, z, z2, z3, z4);
    }

    /* renamed from: V9 */
    public void mo71215V9(String str, int i) {
        C40359h0.m43530l1(str, i);
    }

    public C45843c ch0(int i) {
        return new C40365o(i);
    }

    public void de0(int i, String str, String str2) {
        HashSet<Long> hashSet = C40359h0.f108457g;
        boolean z = false;
        Log.m105925i("MicroMsg.NetSceneStatusNotify", "enterSessionFunction %s %s %s", Integer.valueOf(i), str, str2);
        if (!(i == 2 && C47509i.m52838a().mo107404b("StatusNotifyForbidEnterSession", 0) == 1)) {
            z = true;
        }
        if (z && C40359h0.m43528j1()) {
            C86709a0.m107529k().f251779b.mo123460f(new C40359h0(C75592q0.m90789s(), i, str, str2));
        }
    }

    /* renamed from: iI */
    public C45844i mo71218iI(int i) {
        return new C40361k0(i, 0, 0);
    }

    public void j90(C72963f4 f4Var) {
        C40359h0.m43533o1(f4Var);
    }

    /* renamed from: lB */
    public C87119d mo71220lB(int i) {
        return new C40374z(i);
    }

    public void oc0(String str, int i, String str2, String str3) {
        C40359h0.m43531m1(str, i, str2, str3);
    }

    /* renamed from: up */
    public void mo71222up(C72963f4 f4Var, int i, int i2) {
        C40359h0.m43532n1(f4Var, i, i2);
    }

    /* renamed from: wE */
    public void mo71223wE(String str, int i, String str2, String str3) {
        C40359h0.m43531m1(str, i, str2, str3);
    }
}
