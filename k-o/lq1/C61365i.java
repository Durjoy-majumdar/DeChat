package lq1;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.uniComments.UniCommentDrawerPresenter;
import com.tencent.p014mm.protocal.protobuf.FinderCommentInfo;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import java.util.Iterator;
import java.util.LinkedList;
import je1.C46523h2;
import nj3.C76879j;
import nj3.C76912y0;
import nq1.C61889d;
import nr3.C89059e;
import o40.C61926c;
import ob0.C47350c;
import qq1.C63317a;
import rx3.C13598b0;
import sq1.C64147b;
import sq1.C64151e;
import te3.C49031co1;
import te3.C64833xn1;

/* renamed from: lq1.i */
public final class C61365i implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ UniCommentDrawerPresenter f174549d;

    /* renamed from: e */
    public final /* synthetic */ C64151e f174550e;

    /* renamed from: f */
    public final /* synthetic */ Context f174551f;

    /* renamed from: lq1.i$a */
    public static final class C61366a implements DialogInterface.OnCancelListener {

        /* renamed from: d */
        public static final C61366a f174552d = new C61366a();

        public final void onCancel(DialogInterface dialogInterface) {
        }
    }

    /* renamed from: lq1.i$b */
    public static final class C61367b extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ UniCommentDrawerPresenter f174553d;

        /* renamed from: e */
        public final /* synthetic */ C64151e f174554e;

        /* renamed from: f */
        public final /* synthetic */ C32224a<C13598b0> f174555f;

        /* renamed from: g */
        public final /* synthetic */ C32224a<C13598b0> f174556g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C61367b(UniCommentDrawerPresenter uniCommentDrawerPresenter, C64151e eVar, C32224a<C13598b0> aVar, C32224a<C13598b0> aVar2) {
            super(0);
            this.f174553d = uniCommentDrawerPresenter;
            this.f174554e = eVar;
            this.f174555f = aVar;
            this.f174556g = aVar2;
        }

        public Object invoke() {
            int i = this.f174553d.f161381i == 2 ? 2 : 3;
            C61889d dVar = new C61889d();
            C63317a aVar = this.f174553d.f161380h;
            if (aVar != null) {
                String str = aVar.f179669a;
                String str2 = aVar.f179670b;
                long itemId = this.f174554e.getItemId();
                C87412m.m108594g(str, "app_name");
                C87412m.m108594g(str2, "entity_id");
                C47350c.C47352b bVar = new C47350c.C47352b();
                C64833xn1 xn12 = new C64833xn1();
                xn12.f186341f = str;
                xn12.f186342g = str2;
                xn12.f186339d = C46523h2.f125330a.mo71859a(6964);
                xn12.f186348p = 2;
                xn12.f186349q = i;
                xn12.f186344i = itemId;
                bVar.f127066a = xn12;
                bVar.f127067b = new C49031co1();
                bVar.f127068c = "/cgi-bin/micromsg-bin/finderunicomment";
                bVar.f127069d = 6964;
                dVar.mo123453j(bVar.mo72403a());
                C89059e i2 = dVar.mo9225i();
                i2.mo11397F(this.f174553d);
                i2.mo123062e(new C10640j(this.f174555f, this.f174556g));
                return C13598b0.f38549a;
            }
            C87412m.m108603p("feedObj");
            throw null;
        }
    }

    /* renamed from: lq1.i$c */
    public static final class C61368c extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ UniCommentDrawerPresenter f174557d;

        /* renamed from: e */
        public final /* synthetic */ Context f174558e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C61368c(UniCommentDrawerPresenter uniCommentDrawerPresenter, Context context) {
            super(0);
            this.f174557d = uniCommentDrawerPresenter;
            this.f174558e = context;
        }

        public Object invoke() {
            Dialog dialog = this.f174557d.f161374E;
            if (dialog != null) {
                dialog.dismiss();
            }
            C76912y0.makeText(this.f174558e, (int) C0966R.string.eju, 0).show();
            return C13598b0.f38549a;
        }
    }

    /* renamed from: lq1.i$d */
    public static final class C61369d extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ UniCommentDrawerPresenter f174559d;

        /* renamed from: e */
        public final /* synthetic */ C64151e f174560e;

        /* renamed from: f */
        public final /* synthetic */ Context f174561f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C61369d(UniCommentDrawerPresenter uniCommentDrawerPresenter, C64151e eVar, Context context) {
            super(0);
            this.f174559d = uniCommentDrawerPresenter;
            this.f174560e = eVar;
            this.f174561f = context;
        }

        public Object invoke() {
            int i;
            Dialog dialog = this.f174559d.f161374E;
            if (dialog != null) {
                dialog.dismiss();
            }
            C64151e eVar = this.f174560e;
            if (eVar.f181868d.field_actionInfo.f186500h != 0) {
                Iterator<C64151e> it = this.f174559d.f161378f.f174500a.iterator();
                while (it.hasNext()) {
                    C64151e next = it.next();
                    if (next.f181868d.mo88875m2() == eVar.f181868d.field_actionInfo.f186500h) {
                        C64147b bVar = next.f181868d;
                        bVar.mo88876n2().expandCommentCount = bVar.mo88879q2() - 1;
                        if (next.f181868d.mo88879q2() < 0) {
                            next.f181868d.mo88876n2().expandCommentCount = 0;
                        }
                        LinkedList<FinderCommentInfo> s2 = next.f181868d.mo88881s2();
                        if (s2 != null) {
                            C61926c.m72675T(s2, new C61370k(eVar));
                        }
                    }
                }
            }
            UniCommentDrawerPresenter.C56449a aVar = this.f174559d.f161383n;
            if (aVar != null) {
                aVar.mo79249a(this.f174560e.f181868d.mo88875m2(), this.f174560e.f181868d.field_localCommentId, false);
            }
            C64151e eVar2 = this.f174560e;
            C64147b bVar2 = eVar2.f181868d;
            if (bVar2.field_actionInfo.f186500h == 0) {
                C63317a aVar2 = this.f174559d.f161380h;
                if (aVar2 != null) {
                    if (bVar2.mo88879q2() > 0 && eVar2.f181868d.mo88879q2() <= (i = aVar2.f179671c)) {
                        aVar2.f179671c = i - eVar2.f181868d.mo88879q2();
                    }
                    aVar2.f179671c--;
                } else {
                    C87412m.m108603p("feedObj");
                    throw null;
                }
            }
            this.f174560e.f181868d.mo88875m2();
            C76912y0.makeText(this.f174561f, (int) C0966R.string.d6e, 0).show();
            this.f174559d.mo79241n0();
            return C13598b0.f38549a;
        }
    }

    public C61365i(UniCommentDrawerPresenter uniCommentDrawerPresenter, C64151e eVar, Context context) {
        this.f174549d = uniCommentDrawerPresenter;
        this.f174550e = eVar;
        this.f174551f = context;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        C13598b0 b0Var;
        Dialog dialog = this.f174549d.f161374E;
        if (dialog != null) {
            dialog.show();
            b0Var = C13598b0.f38549a;
        } else {
            b0Var = null;
        }
        if (b0Var == null) {
            UniCommentDrawerPresenter uniCommentDrawerPresenter = this.f174549d;
            Context context = this.f174551f;
            uniCommentDrawerPresenter.f161374E = C76879j.m92723Q(context, context.getString(C0966R.string.a3h), context.getString(C0966R.string.a4d), true, false, C61366a.f174552d);
        }
        C61367b bVar = new C61367b(this.f174549d, this.f174550e, new C61369d(this.f174549d, this.f174550e, this.f174551f), new C61368c(this.f174549d, this.f174551f));
        C64147b bVar2 = this.f174550e.f181868d;
        int i2 = bVar2.field_state;
        boolean z = true;
        if (i2 == 1 || i2 == -1) {
            z = false;
        }
        if (z || bVar2.field_localCommentId == 0) {
            bVar.invoke();
        }
    }
}
