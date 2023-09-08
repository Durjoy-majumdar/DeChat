package pc0;

import android.text.TextUtils;
import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.storage.C72963f4;
import di3.C86301e;
import di3.C86312j;
import eb0.C75569c4;
import ei3.C86522b;
import f62.C75696g0;
import f62.C75705n0;
import f62.C75710x0;
import fw0.C75809r;
import nr3.C89055a;
import p227rn.C48053v;
import pc0.C100760a0;
import sb0.C48340e;
import te3.C78020yw2;

@C86522b(onProcess = {C80625v0.MATCH_MM, C80625v0.MATCH_TOOLS})
/* renamed from: pc0.y */
public class C77070y extends C86301e implements C75710x0 {

    /* renamed from: d */
    public final C77071b f225126d = new C77071b((C35448a) null);

    /* renamed from: e */
    public C75696g0 f225127e;

    /* renamed from: pc0.y$b */
    public static final class C77071b extends C89055a<C75705n0> implements C75705n0 {

        /* renamed from: pc0.y$b$a */
        public class C77072a implements C89055a.C89056a<C75705n0> {

            /* renamed from: a */
            public final /* synthetic */ C78020yw2 f225128a;

            /* renamed from: b */
            public final /* synthetic */ C72963f4 f225129b;

            public C77072a(C77071b bVar, C78020yw2 yw22, C72963f4 f4Var) {
                this.f225128a = yw22;
                this.f225129b = f4Var;
            }

            /* renamed from: a */
            public void mo54201a(Object obj) {
                ((C75705n0) obj).mo106024h(this.f225128a, this.f225129b);
            }
        }

        public C77071b(C35448a aVar) {
        }

        /* renamed from: h */
        public void mo106024h(C78020yw2 yw22, C72963f4 f4Var) {
            mo123416n(new C77072a(this, yw22, f4Var));
        }
    }

    /* renamed from: Al */
    public void mo106029Al(C100760a0.C77062c cVar) {
        C100760a0.f295176a = cVar;
    }

    public String B00(C72963f4 f4Var) {
        String str;
        C75696g0 g0Var = this.f225127e;
        if (g0Var == null) {
            return null;
        }
        ((C75809r) g0Var).getClass();
        if (!((C48053v) C86312j.m106911c(C48053v.class)).mo72614OE(f4Var.mo108768t())) {
            return C75569c4.m90672e(f4Var);
        }
        String str2 = C48340e.f129426a;
        if (str2 == null) {
            return null;
        }
        int indexOf = str2.indexOf("<climsgid>");
        if (indexOf >= 0) {
            int i = indexOf + 10;
            int indexOf2 = str2.indexOf("</climsgid>", i + 1);
            if (indexOf2 >= 0) {
                String substring = str2.substring(i, indexOf2);
                if (TextUtils.isEmpty(C48340e.f129427b) || !substring.contains(C48340e.f129427b)) {
                    str = substring + C48340e.f129428c.incrementAndGet();
                } else {
                    str = C48340e.m53663d(C48340e.f129427b);
                }
                str2 = str2.substring(0, i) + str + str2.substring(indexOf2);
            }
        }
        return str2;
    }

    public C75705n0 Sr0() {
        return this.f225126d;
    }

    /* renamed from: eK */
    public void mo106032eK(C75696g0 g0Var) {
        this.f225127e = g0Var;
    }

    public void lk0(C75705n0 n0Var) {
        this.f225126d.add(n0Var);
    }
}
