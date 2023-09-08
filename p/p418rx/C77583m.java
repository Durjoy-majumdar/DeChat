package p418rx;

import android.content.Context;
import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.p136ui.contact.C74490f3;
import com.tencent.p014mm.p136ui.contact.C74493g1;
import com.tencent.p014mm.p136ui.contact.C74498h1;
import com.tencent.p014mm.p136ui.contact.C74526m1;
import com.tencent.p014mm.p136ui.contact.C74536o1;
import com.tencent.p014mm.p136ui.contact.C74560s1;
import com.tencent.p014mm.p136ui.contact.C74568u;
import com.tencent.p014mm.p136ui.contact.C74572v;
import com.tencent.p014mm.p136ui.contact.MMBaseSelectContactUI;
import di3.C86301e;
import ei3.C86522b;
import java.util.HashSet;
import java.util.List;
import p240sx.C48486s;
import p240sx.C77809r;
import p240sx.C77810t;

@C86522b(onProcess = {C80625v0.MATCH_MM, C80625v0.MATCH_APPBRAND})
/* renamed from: rx.m */
public class C77583m extends C86301e implements C77810t {
    public C48486s Ag0() {
        return C48095o.f128949a;
    }

    /* renamed from: De */
    public C74526m1 mo107762De(MMBaseSelectContactUI mMBaseSelectContactUI, List<String> list, boolean z, boolean z2) {
        return new C74490f3(mMBaseSelectContactUI, list, z, false, z2, 0);
    }

    public C74498h1 Jr0(C74493g1 g1Var, String str, int i, boolean z, HashSet<String> hashSet) {
        return new C74536o1(g1Var, str, i, z, hashSet);
    }

    public C74526m1 Nv0(MMBaseSelectContactUI mMBaseSelectContactUI, List<String> list, boolean z, boolean z2, C74572v vVar) {
        return new C74568u(mMBaseSelectContactUI, list, z, z2, vVar);
    }

    public C77809r h50() {
        return C77582l.f226182a;
    }

    public void onAccountInitialized(Context context) {
        C74560s1.m89276e();
    }
}
