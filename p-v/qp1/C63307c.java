package qp1;

import a14.C0000n0;
import a14.C53872d1;
import a14.C53895h;
import a14.C53896h0;
import android.app.Activity;
import android.content.DialogInterface;
import bl3.C39818r;
import cj1.C54841v0;
import cl1.C54979h1;
import cl1.C54991o;
import cl1.C55001u;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.finder.shopping.presenter.FinderLiveShoppingManagerPresenter;
import dj1.C58283l0;
import fj1.C45795b;
import fy3.C32227p;
import gy3.C8480h;
import ht1.C60172g4;
import java.util.List;
import kotlin.ResultKt;
import nr3.C89059e;
import o40.C61926c;
import pe3.C89349b;
import qo3.C89779i0;
import rx3.C13598b0;
import sk1.C63965x;
import sx3.C13798c0;
import te3.C64434i11;
import te3.v44;
import wx3.C15601d;
import wx3.C66218h;
import xx3.C15911a;
import xx3.C66447b;
import yx3.C91590f;
import yx3.C91594j;
import zc1.C66785b;

@C91590f(mo125468c = "com.tencent.mm.plugin.finder.shopping.presenter.FinderLiveShoppingManagerPresenter$updateProductList$1$1", mo125469f = "FinderLiveShoppingManagerPresenter.kt", mo125470l = {101}, mo125471m = "invokeSuspend")
/* renamed from: qp1.c */
public final class C63307c extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public Object f179635d;

    /* renamed from: e */
    public int f179636e;

    /* renamed from: f */
    public final /* synthetic */ FinderLiveShoppingManagerPresenter f179637f;

    /* renamed from: g */
    public final /* synthetic */ C45795b f179638g;

    /* renamed from: h */
    public final /* synthetic */ v44 f179639h;

    @C91590f(mo125468c = "com.tencent.mm.plugin.finder.shopping.presenter.FinderLiveShoppingManagerPresenter$updateProductList$1$1$result$1", mo125469f = "FinderLiveShoppingManagerPresenter.kt", mo125470l = {102}, mo125471m = "invokeSuspend")
    /* renamed from: qp1.c$a */
    public static final class C63308a extends C91594j implements C32227p<C0000n0, C15601d<? super C64434i11>, Object> {

        /* renamed from: d */
        public int f179640d;

        /* renamed from: e */
        public final /* synthetic */ FinderLiveShoppingManagerPresenter f179641e;

        /* renamed from: f */
        public final /* synthetic */ C45795b f179642f;

        /* renamed from: g */
        public final /* synthetic */ v44 f179643g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C63308a(FinderLiveShoppingManagerPresenter finderLiveShoppingManagerPresenter, C45795b bVar, v44 v44, C15601d<? super C63308a> dVar) {
            super(2, dVar);
            this.f179641e = finderLiveShoppingManagerPresenter;
            this.f179642f = bVar;
            this.f179643g = v44;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C63308a(this.f179641e, this.f179642f, this.f179643g, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C63308a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f179640d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                MMActivity mMActivity = (MMActivity) this.f179641e.f160919a;
                C45795b bVar = this.f179642f;
                v44 v44 = this.f179643g;
                long j = v44.f185841g;
                long j2 = v44.f185840f;
                String str = v44.f185842h;
                String str2 = str == null ? "" : str;
                byte[] bArr = ((C55001u) bVar.mo71262a(C55001u.class)).f154417n;
                String str3 = this.f179643g.f185844j;
                String str4 = str3 == null ? "" : str3;
                String str5 = ((C54991o) this.f179642f.mo71262a(C54991o.class)).f154357q3;
                this.f179640d = 1;
                C66218h hVar = new C66218h(C66447b.m78392b(this));
                C89059e i2 = new C58283l0(j, j2, str2, bArr, 1, C66785b.f191882e.mo90662O5(), str4, (String) null, (C89349b) null, 3, ((C60172g4) C39818r.f106831a.mo62444c(mMActivity).mo62447c(C60172g4.class)).mo12861q3(), str5, 256, (C8480h) null).mo9225i();
                i2.mo123420E(new C54841v0((String) null, bVar, hVar));
                i2.mo11397F(mMActivity);
                Object b = hVar.mo90314b();
                return b == aVar ? aVar : b;
            } else if (i == 1) {
                ResultKt.throwOnFailure(obj);
                return obj;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C63307c(FinderLiveShoppingManagerPresenter finderLiveShoppingManagerPresenter, C45795b bVar, v44 v44, C15601d<? super C63307c> dVar) {
        super(2, dVar);
        this.f179637f = finderLiveShoppingManagerPresenter;
        this.f179638g = bVar;
        this.f179639h = v44;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C63307c(this.f179637f, this.f179638g, this.f179639h, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C63307c) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        C89779i0 i0Var;
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f179636e;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Activity activity = this.f179637f.f160919a;
            C89779i0 e = C89779i0.m112248e(activity, activity.getString(C0966R.string.a4d), false, 3, (DialogInterface.OnCancelListener) null);
            C53896h0 h0Var = C53872d1.f151119c;
            C63308a aVar2 = new C63308a(this.f179637f, this.f179638g, this.f179639h, (C15601d<? super C63308a>) null);
            this.f179635d = e;
            this.f179636e = 1;
            Object g = C53895h.m60469g(h0Var, aVar2, this);
            if (g == aVar) {
                return aVar;
            }
            i0Var = e;
            obj = g;
        } else if (i == 1) {
            i0Var = (C89779i0) this.f179635d;
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C64434i11 i112 = (C64434i11) obj;
        List<R> z = C13798c0.m13102z(((C54979h1) this.f179638g.mo71262a(C54979h1.class)).f154140o.mo87250a(), C63965x.class);
        FinderLiveShoppingManagerPresenter finderLiveShoppingManagerPresenter = this.f179637f;
        if (i112 != null) {
            finderLiveShoppingManagerPresenter.f160922d.clear();
            finderLiveShoppingManagerPresenter.f160922d.addAll(z);
            C63313h hVar = finderLiveShoppingManagerPresenter.f160923e;
            if (hVar != null) {
                C61926c.m72668M(new C63311f(hVar));
            }
        }
        i0Var.dismiss();
        return C13598b0.f38549a;
    }
}
