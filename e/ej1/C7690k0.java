package ej1;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.style.LeadingMarginSpan;
import android.widget.RelativeLayout;
import cj1.C0581o5;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74942w4;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import de3.C75375u;
import di3.C86312j;
import fj1.C45795b;
import gy3.C8479f0;
import gy3.C8480h;
import gy3.C87412m;
import p629ny.C76979h;
import qk1.C12806i0;
import wk1.C15437l;
import wk1.C15439m;
import yg1.C15999b;

/* renamed from: ej1.k0 */
public abstract class C7690k0 extends C15999b {

    /* renamed from: ej1.k0$a */
    public static final class C7691a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C12806i0.C12807a f26051d;

        /* renamed from: e */
        public final /* synthetic */ C8479f0<RelativeLayout> f26052e;

        /* renamed from: f */
        public final /* synthetic */ C75375u f26053f;

        public C7691a(C12806i0.C12807a aVar, C8479f0<RelativeLayout> f0Var, C75375u uVar) {
            this.f26051d = aVar;
            this.f26052e = f0Var;
            this.f26053f = uVar;
        }

        public final void run() {
            if (this.f26051d.f36658A.getLineCount() > 1) {
                T t = this.f26052e.f27484d;
                ((RelativeLayout) t).setPadding(0, ((RelativeLayout) t).getPaddingTop(), 0, ((RelativeLayout) this.f26052e.f27484d).getPaddingBottom());
                this.f26051d.f36658A.setSpacingAdd(5);
                SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(this.f26053f);
                valueOf.setSpan(new LeadingMarginSpan.Standard(0, C74942w4.m89784a(MMApplicationContext.getContext(), 6)), 0, this.f26053f.length(), 33);
                this.f26051d.f36658A.mo104279b(valueOf);
                return;
            }
            T t2 = this.f26052e.f27484d;
            ((RelativeLayout) t2).setPadding(0, ((RelativeLayout) t2).getPaddingTop(), ((RelativeLayout) this.f26052e.f27484d).getPaddingRight(), ((RelativeLayout) this.f26052e.f27484d).getPaddingBottom());
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C7690k0(C45795b bVar) {
        super(bVar);
        C87412m.m108594g(bVar, "liveContext");
    }

    /* renamed from: b */
    public void mo8798b(Context context, C12806i0.C12807a aVar, C0581o5 o5Var, int i) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(aVar, "holder");
        C87412m.m108594g(o5Var, "msg");
        mo8811o(context, aVar, o5Var.getContent());
    }

    /* renamed from: m */
    public final C15437l mo8809m() {
        Drawable a = C15437l.C15438a.m14437a(C15437l.f41880f, mo14624e(), 0.0f, 0.0f, 6, (Object) null);
        String e = mo14624e();
        int i = C15439m.f41883i;
        float f = C15439m.f41885k;
        return new C15437l(a, new C15439m(e, f, f, MMApplicationContext.getContext().getResources().getColor(C0966R.color.BW_100_Alpha_0_3), C15439m.f41883i, MMApplicationContext.getContext().getResources().getColor(C0966R.color.al_), C15439m.f41884j, 0.0f, 128, (C8480h) null));
    }

    /* renamed from: n */
    public final void mo8810n(Context context, C12806i0.C12807a aVar, C75375u uVar) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(aVar, "holder");
        C87412m.m108594g(uVar, "userMessage");
        C8479f0 f0Var = new C8479f0();
        T parent = aVar.f36658A.getParent();
        C87412m.m108592e(parent, "null cannot be cast to non-null type android.widget.RelativeLayout");
        f0Var.f27484d = (RelativeLayout) parent;
        aVar.f36658A.mo104279b(uVar);
        aVar.f36658A.setTextSize((float) this.f43055h);
        aVar.f36658A.post(new C7691a(aVar, f0Var, uVar));
        aVar.f36659B.setBackground(context.getResources().getDrawable(C0966R.C0969drawable.f5166yy));
        aVar.f36658A.setTag(C0966R.C0970id.d47, mo14624e());
    }

    /* renamed from: o */
    public final void mo8811o(Context context, C12806i0.C12807a aVar, String str) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(aVar, "holder");
        if (!(str == null || str.length() == 0)) {
            C75375u uVar = new C75375u(((C76979h) C86312j.m106911c(C76979h.class)).mo107057T1(context, context.getString(C0966R.string.dge, new Object[]{str})));
            uVar.mo105705b(mo8809m(), 0, mo14624e().length() + 0, 33);
            mo8810n(context, aVar, uVar);
        }
    }
}
