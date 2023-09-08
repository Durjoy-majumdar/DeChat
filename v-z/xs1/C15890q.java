package xs1;

import android.content.Context;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import androidx.lifecycle.C39622i0;
import cl1.C55001u;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import gy3.C87412m;
import hp3.C87581a;
import j20.C117292a;
import java.util.ArrayList;
import nr3.C89059e;
import ob0.C89132b;
import qo3.C47883u;
import qo3.C77426q;
import rx3.C13598b0;
import te3.C51079ra1;
import te3.C51215sa1;
import ws1.C15592b;

/* renamed from: xs1.q */
public final class C15890q extends ClickableSpan {

    /* renamed from: d */
    public final /* synthetic */ C15883o f42767d;

    /* renamed from: e */
    public final /* synthetic */ C51215sa1 f42768e;

    /* renamed from: xs1.q$a */
    public static final class C15891a implements C47883u {

        /* renamed from: a */
        public final /* synthetic */ C15883o f42769a;

        /* renamed from: b */
        public final /* synthetic */ C51215sa1 f42770b;

        /* renamed from: xs1.q$a$a */
        public static final class C15892a<_Ret, _Var> implements C87581a {

            /* renamed from: a */
            public final /* synthetic */ C15883o f42771a;

            /* renamed from: b */
            public final /* synthetic */ C51215sa1 f42772b;

            public C15892a(C15883o oVar, C51215sa1 sa12) {
                this.f42771a = oVar;
                this.f42772b = sa12;
            }

            public Object call(Object obj) {
                C89132b.C89134c cVar = (C89132b.C89134c) obj;
                this.f42771a.f42746C.mo8913b();
                if (cVar.f256793a == 0 && cVar.f256794b == 0) {
                    C51215sa1 sa12 = this.f42772b;
                    if (sa12 != null) {
                        sa12.f141392h = 1;
                    }
                    if (sa12 != null) {
                        sa12.f141391g = 0;
                    }
                    this.f42771a.mo14533a1();
                }
                return C13598b0.f38549a;
            }
        }

        public C15891a(C15883o oVar, C51215sa1 sa12) {
            this.f42769a = oVar;
            this.f42770b = sa12;
        }

        /* renamed from: a */
        public final void mo353a(boolean z, String str) {
            if (z) {
                C51079ra1 ra12 = new C51079ra1();
                C51215sa1 sa12 = this.f42770b;
                String str2 = null;
                ra12.f140788h = sa12 != null ? sa12.f141393i : null;
                if (sa12 != null) {
                    str2 = sa12.f141389e;
                }
                ra12.f140785e = str2;
                int i = 0;
                ra12.f140784d = sa12 != null ? sa12.f141388d : 0;
                if (sa12 != null) {
                    i = sa12.f141395n;
                }
                ra12.f140787g = i;
                this.f42769a.f42746C.begin();
                C39622i0 x0 = this.f42769a.mo87696x0(C55001u.class);
                C15883o oVar = this.f42769a;
                C51215sa1 sa13 = this.f42770b;
                C55001u uVar = (C55001u) x0;
                C89059e i2 = new C15592b(uVar.f154420q.f182392d, uVar.f154416j, uVar.f154423t, ra12, 1).mo9225i();
                i2.mo123420E(new C15892a(oVar, sa13));
                Context context = oVar.f166287d.getContext();
                C87412m.m108592e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
                i2.mo11397F((MMActivity) context);
            }
        }
    }

    public C15890q(C15883o oVar, C51215sa1 sa12) {
        this.f42767d = oVar;
        this.f42768e = sa12;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/vote/plugin/FinderLiveVoteCardPlugin$setStopVoteSpan$1", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V", this, array);
        C87412m.m108594g(view, "widget");
        C77426q qVar = new C77426q(this.f42767d.f166287d.getContext());
        qVar.mo107595g(this.f42767d.f166287d.getContext().getResources().getString(C0966R.string.msq));
        qVar.mo107589a(true);
        qVar.mo107602n(this.f42767d.f166287d.getContext().getResources().getString(C0966R.string.msr));
        qVar.mo107590b(new C15891a(this.f42767d, this.f42768e));
        qVar.mo107604p(true);
        qVar.mo107603o();
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/vote/plugin/FinderLiveVoteCardPlugin$setStopVoteSpan$1", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V");
    }

    public void updateDrawState(TextPaint textPaint) {
        C87412m.m108594g(textPaint, "ds");
        textPaint.setColor(this.f42767d.f166287d.getContext().getResources().getColor(C0966R.color.f3417s5));
        textPaint.setUnderlineText(false);
        textPaint.clearShadowLayer();
    }
}
