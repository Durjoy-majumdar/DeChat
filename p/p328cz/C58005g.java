package p328cz;

import b72.C16754b;
import b72.C16756d;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86301e;
import di3.C86312j;
import dm2.C58325i;
import ei3.C86522b;
import p501dz.C58465g;
import p606mm.C99933h;
import p749xh.C38549d8;
import pe3.C47465a;
import rx3.C36570n;

@C86522b
/* renamed from: cz.g */
public final class C58005g extends C86301e implements C58465g {

    /* renamed from: cz.g$a */
    public static final class C58006a<T extends C47465a> implements C58325i {

        /* renamed from: a */
        public final /* synthetic */ String f165927a;

        public C58006a(String str) {
            this.f165927a = str;
        }

        /* renamed from: a */
        public final void mo32063a(int i, boolean z, C38549d8 d8Var, T t) {
            String str = this.f165927a;
            Log.m105924i(str, "save secdata action:" + i + " success:" + z);
        }
    }

    /* renamed from: V2 */
    public C16754b mo82805V2() {
        return (C16756d) ((C36570n) ((C20373i) C86312j.m106911c(C20373i.class)).f57093g).getValue();
    }

    /* renamed from: zg */
    public <T extends C47465a> void mo82806zg(String str, String str2, T t) {
        ((C99933h) C86312j.m106911c(C99933h.class)).mo84399BM(6, str2, t, new C58006a(str));
    }
}
