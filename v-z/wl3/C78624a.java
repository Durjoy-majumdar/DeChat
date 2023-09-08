package wl3;

import android.content.Context;
import android.os.Bundle;
import android.util.Pair;
import com.tencent.p014mm.p136ui.chatting.C73313b1;
import com.tencent.p014mm.storage.C72963f4;
import di3.C86301e;
import ei3.C86522b;
import gy3.C87412m;
import java.util.List;
import p240sx.C77797h;
import rx3.C13603j;
import s90.C77632o;

@C86522b
/* renamed from: wl3.a */
public final class C78624a extends C86301e implements C77797h {

    /* renamed from: wl3.a$a */
    public /* synthetic */ class C78625a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f230305a;

        static {
            int[] iArr = new int[C77632o.C77633a.values().length];
            iArr[0] = 1;
            iArr[1] = 2;
            iArr[2] = 3;
            f230305a = iArr;
        }
    }

    /* renamed from: wl3.a$b */
    public static final class C78626b implements C77632o {

        /* renamed from: d */
        public final /* synthetic */ C77797h.C77798a f230306d;

        /* renamed from: e */
        public final /* synthetic */ C78624a f230307e;

        public C78626b(C77797h.C77798a aVar, C78624a aVar2) {
            this.f230306d = aVar;
            this.f230307e = aVar2;
        }

        /* renamed from: N */
        public boolean mo22497N() {
            return this.f230306d.mo83540N();
        }

        /* renamed from: e0 */
        public boolean mo22498e0() {
            return this.f230306d.mo83544e0();
        }

        /* renamed from: g0 */
        public void mo22499g0(Bundle bundle) {
            this.f230306d.mo83545g0(bundle);
        }

        /* renamed from: m6 */
        public void mo22500m6(C77632o.C77633a aVar) {
            this.f230306d.mo83543c(C78624a.vx0(this.f230307e, aVar));
        }

        /* renamed from: r7 */
        public void mo22502r7(C77632o.C77633a aVar) {
            this.f230306d.mo83542b(C78624a.vx0(this.f230307e, aVar));
        }

        /* renamed from: s0 */
        public boolean mo22503s0() {
            return this.f230306d.mo83546s0();
        }

        /* renamed from: z1 */
        public void mo22504z1(C77632o.C77633a aVar) {
            this.f230306d.mo83541a(C78624a.vx0(this.f230307e, aVar));
        }
    }

    public static final C77797h.C77798a.C77799a vx0(C78624a aVar, C77632o.C77633a aVar2) {
        aVar.getClass();
        int i = aVar2 == null ? -1 : C78625a.f230305a[aVar2.ordinal()];
        if (i == -1) {
            return null;
        }
        if (i == 1) {
            return C77797h.C77798a.C77799a.del;
        }
        if (i == 2) {
            return C77797h.C77798a.C77799a.trans;
        }
        if (i == 3) {
            return C77797h.C77798a.C77799a.fav;
        }
        throw new C13603j();
    }

    public boolean Rb0(Context context, List<? extends C72963f4> list, boolean z, String str, C77797h.C77798a aVar) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(list, "selectItems");
        C87412m.m108594g(str, "from");
        C87412m.m108594g(aVar, "callback");
        return C73313b1.m86457c(context, list, z, str, new C78626b(aVar, this));
    }

    public int Ui0() {
        return C73313b1.m86459e();
    }

    /* renamed from: VR */
    public List<C72963f4> mo107937VR() {
        return C73313b1.f215414a.f215425a;
    }

    public Pair<Long, Boolean> Xj0(Context context, String str, boolean z) {
        return C73313b1.m86460f(context, str, z, str);
    }

    /* renamed from: yb */
    public Pair<Long, Boolean> mo107939yb(Context context, String str, boolean z, String str2) {
        return C73313b1.m86460f(context, str, z, str2);
    }
}
