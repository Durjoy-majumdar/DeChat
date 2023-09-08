package wd3;

import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86301e;
import ei3.C86522b;
import hc0.C20937c;
import rb0.C47984k;
import rb0.C48009v0;
import sb0.C48340e;
import sb0.C48353j;

@C86522b(onProcess = {C80625v0.MATCH_MM, C80625v0.MATCH_TOOLS})
/* renamed from: wd3.f */
public class C53151f extends C86301e implements C78585u0 {
    public String Hj0(Object obj) {
        return ((C48353j) obj).field_userName;
    }

    public C20937c Im0(String str) {
        C20937c.C20939b bVar = new C20937c.C20939b();
        bVar.f59351g = C48340e.m53671l(str);
        bVar.f59346b = true;
        bVar.f59363s = true;
        bVar.f59359o = C0966R.raw.default_avatar;
        return bVar.mo32666a();
    }

    /* renamed from: LN */
    public Object mo73838LN(String str) {
        C48353j jVar = C48009v0.Bx0().get(str);
        if (jVar != null && !Util.isNullOrNil(jVar.field_userId) && jVar.field_userId.equals(str)) {
            return jVar;
        }
        C48353j jVar2 = new C48353j();
        jVar2.field_userId = str;
        return jVar2;
    }

    /* renamed from: gb */
    public String mo73839gb(Object obj) {
        return ((C48353j) obj).field_headImageUrl;
    }

    /* renamed from: qC */
    public boolean mo73840qC(String str) {
        return C47984k.m53334h(str);
    }

    /* renamed from: rv */
    public String mo73841rv(Object obj) {
        return ((C48353j) obj).field_userId;
    }
}
