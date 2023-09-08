package it1;

import android.content.Context;
import android.content.DialogInterface;
import android.util.SparseArray;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import eb0.C31543z5;
import fy3.C32224a;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import ht1.C60200t1;
import it1.C9247b;
import je1.C9336m0;
import jp3.C9487b;
import jt1.C9519c;
import kj2.C117407d;
import kt1.C46744d;
import kt1.C61169f;
import kt1.C61170g;
import nr3.C89059e;
import ob0.C117747y;
import ob0.C47350c;
import ob0.C89132b;
import org.json.JSONObject;
import ot1.C11767a;
import qo3.C77426q;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import te3.C49335eu3;
import te3.C49712hj1;

/* renamed from: it1.c */
public class C60625c<_Resp extends C49335eu3> extends C9519c<String, _Resp> implements C61170g {

    /* renamed from: q */
    public static final C60626a f172729q = new C60626a((C8480h) null);

    /* renamed from: r */
    public static final SparseArray<Long> f172730r = new SparseArray<>();

    /* renamed from: j */
    public final C49712hj1 f172731j;

    /* renamed from: n */
    public C9247b f172732n;

    /* renamed from: o */
    public boolean f172733o;

    /* renamed from: p */
    public final C13601g f172734p;

    /* renamed from: it1.c$a */
    public static final class C60626a {
        public C60626a(C8480h hVar) {
        }

        /* renamed from: a */
        public final long mo85583a(int i) {
            Long l = C60625c.f172730r.get(i);
            if (l == null) {
                return 0;
            }
            return l.longValue();
        }
    }

    /* renamed from: it1.c$b */
    public static final class C60627b extends C87413o implements C32224a<C61169f> {

        /* renamed from: d */
        public final /* synthetic */ C60625c<_Resp> f172735d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C60627b(C60625c<_Resp> cVar) {
            super(0);
            this.f172735d = cVar;
        }

        public Object invoke() {
            C61169f fVar = new C61169f(this.f172735d);
            C49712hj1 hj12 = this.f172735d.f172731j;
            fVar.f174150j = hj12 != null ? hj12.f134677n : 0;
            return fVar;
        }
    }

    public C60625c() {
        this((C49712hj1) null, (C9487b) null, 3, (C8480h) null);
    }

    public C60625c(C49712hj1 hj12, C9487b<?> bVar) {
        super(bVar);
        this.f172731j = hj12;
        this.f172733o = true;
        this.f172734p = C36568h.m40985a(new C60627b(this));
    }

    /* renamed from: l */
    public static /* synthetic */ C60625c m70894l(C60625c cVar, Context context, String str, long j, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                str = null;
            }
            if ((i & 4) != 0) {
                j = 500;
            }
            cVar.mo85582k(context, str, j);
            return cVar;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: delayLoading");
    }

    /* renamed from: M */
    public C46744d mo8509M() {
        return C46744d.Default;
    }

    /* renamed from: N */
    public JSONObject mo8506N() {
        return null;
    }

    /* renamed from: R0 */
    public JSONObject mo8510R0() {
        return null;
    }

    /* renamed from: g */
    public void mo85581g() {
        C9247b bVar = this.f172732n;
        if (bVar != null) {
            bVar.mo8913b();
        }
        super.mo85581g();
    }

    /* renamed from: h */
    public final void mo10094h(int i, int i2, String str, _Resp _resp, C117747y yVar) {
        int i3 = i;
        int i4 = i2;
        String str2 = str;
        Class cls = C60200t1.class;
        C87412m.m108594g(_resp, "resp");
        C61169f fVar = (C61169f) ((C36570n) this.f172734p).getValue();
        fVar.f174146f = fVar.f174145e.mo72288a();
        C9247b bVar = this.f172732n;
        if (bVar != null) {
            bVar.mo8913b();
        }
        mo332r(i, i2, str, _resp, yVar);
        C61169f fVar2 = (C61169f) ((C36570n) this.f172734p).getValue();
        fVar2.f174147g = fVar2.f174145e.mo72288a();
        ((C61169f) ((C36570n) this.f172734p).getValue()).mo86104a(i3, i4, str2, this.f256789f);
        if (this.f172733o) {
            if (i3 == 4 && i4 == -4019) {
                if (str2 != null) {
                    C77426q qVar = new C77426q(((C60200t1) C86312j.m106911c(cls)).mo76771JP());
                    qVar.mo107595g(str2);
                    qVar.mo107601m(C0966R.string.lkg);
                    qVar.mo107589a(true);
                    qVar.mo107600l(C11767a.C11768a.f34454a);
                    qVar.mo107603o();
                }
                C117407d.INSTANCE.idkeyStat(1264, 6, 1, false);
            }
            if (i3 != 4) {
                return;
            }
            if ((i4 == -5300 || i4 == -5000) && str2 != null) {
                C77426q qVar2 = new C77426q(((C60200t1) C86312j.m106911c(cls)).mo76771JP());
                qVar2.mo107595g(str2);
                qVar2.mo107601m(C0966R.string.lkg);
                qVar2.mo107589a(true);
                qVar2.mo107600l(C11767a.C11768a.f34454a);
                qVar2.mo107603o();
            }
        }
    }

    /* renamed from: i */
    public C89059e<C89132b.C89134c<_Resp>> mo9225i() {
        C9247b bVar = this.f172732n;
        if (bVar != null) {
            bVar.begin();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("[dispatchCgi] ");
        C47350c cVar = this.f256789f;
        C87412m.m108593f(cVar, "reqResp");
        sb.append(cVar.f127057c);
        Log.m105924i("Finder.FinderCgi", sb.toString());
        if (mo10087q()) {
            C49712hj1 hj12 = this.f172731j;
            f172730r.put(hj12 != null ? hj12.f134675i : 0, Long.valueOf(C31543z5.m39453c()));
        }
        ((C61169f) ((C36570n) this.f172734p).getValue()).mo86106c(this.f256789f);
        C89059e<C89132b.C89134c<_Resp>> i = super.mo9225i();
        C87412m.m108593f(i, "super.run()");
        return i;
    }

    /* renamed from: k */
    public final C60625c<_Resp> mo85582k(Context context, String str, long j) {
        C87412m.m108594g(context, "context");
        this.f172732n = C9247b.C9248a.m8889a(C9247b.f28989d, context, str, j, (DialogInterface.OnCancelListener) null, 8, (Object) null);
        return this;
    }

    /* renamed from: n */
    public String getKey() {
        return String.valueOf(this.f256789f.f127058d);
    }

    /* renamed from: q */
    public boolean mo10087q() {
        return this instanceof C9336m0;
    }

    /* renamed from: r */
    public void mo332r(int i, int i2, String str, _Resp _resp, C117747y yVar) {
        C87412m.m108594g(_resp, "resp");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C60625c(C49712hj1 hj12, C9487b bVar, int i, C8480h hVar) {
        this((i & 1) != 0 ? null : hj12, (i & 2) != 0 ? null : bVar);
    }
}
