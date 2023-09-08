package qj1;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.method.ScrollingMovementMethod;
import android.text.style.ImageSpan;
import android.view.View;
import android.widget.TextView;
import cl1.C54991o;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.protocal.protobuf.FinderContact;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import di3.C7335d;
import di3.C86312j;
import fy3.C32224a;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import kg3.C76577a;
import ok1.C62042e;
import p629ny.C76979h;
import rx3.C13598b0;
import rx3.C36570n;
import te3.C49765hx0;
import te3.C64674r41;
import tf0.C64916p1;
import wk1.C15437l;
import wk1.C15439m;

/* renamed from: qj1.qf */
public final class C12629qf extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C12522mf f36190d;

    /* renamed from: e */
    public final /* synthetic */ C64674r41 f36191e;

    /* renamed from: f */
    public final /* synthetic */ boolean f36192f;

    /* renamed from: g */
    public final /* synthetic */ boolean f36193g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C12629qf(C12522mf mfVar, C64674r41 r412, boolean z, boolean z2) {
        super(0);
        this.f36190d = mfVar;
        this.f36191e = r412;
        this.f36192f = z;
        this.f36193g = z2;
    }

    public Object invoke() {
        SpannableString spannableString;
        FinderContact finderContact;
        String str;
        FinderContact finderContact2;
        String str2;
        Class cls = C64916p1.class;
        Class cls2 = C76979h.class;
        C12522mf mfVar = this.f36190d;
        View view = mfVar.f36002y;
        if (view != null) {
            mfVar.mo12154c1(view);
        }
        this.f36190d.mo10792g(0);
        this.f36190d.f166287d.setAlpha(0.01f);
        C85875k4.m106189j0(((TextView) ((C36570n) this.f36190d.f35995r).getValue()).getPaint(), 0.8f);
        String d1 = (C87412m.m108589b(((C54991o) this.f36190d.mo87684A0().mo71262a(C54991o.class)).f154345o, this.f36191e.f185128h) || this.f36192f || this.f36193g) ? C12522mf.m12081d1(this.f36192f, this.f36193g) : "";
        C49765hx0 hx02 = this.f36191e.f185135r;
        boolean z = true;
        if ((hx02 != null ? hx02.f134919d : null) != null) {
            C7335d c = C86312j.m106911c(cls);
            C87412m.m108593f(c, "getService(IFinderCommon…atureService::class.java)");
            Context context = this.f36190d.f166287d.getContext();
            C87412m.m108593f(context, "root.context");
            TextPaint paint = this.f36190d.mo12152a1().getPaint();
            C87412m.m108593f(paint, "contextTv.paint");
            C62042e eVar = C62042e.f176370a;
            C64674r41 r412 = this.f36191e;
            CharSequence h = C64916p1.C64917a.m76441h((C64916p1) c, context, paint, C62042e.m72808l0(eVar, r412.f185128h, r412.f185124d, false, 4, (Object) null), 0, 8, (Object) null);
            C7335d c2 = C86312j.m106911c(cls);
            C87412m.m108593f(c2, "getService(IFinderCommon…atureService::class.java)");
            C64916p1 p1Var = (C64916p1) c2;
            Context context2 = this.f36190d.f166287d.getContext();
            C87412m.m108593f(context2, "root.context");
            TextPaint paint2 = this.f36190d.mo12152a1().getPaint();
            C87412m.m108593f(paint2, "contextTv.paint");
            C49765hx0 hx03 = this.f36191e.f185135r;
            CharSequence h2 = C64916p1.C64917a.m76441h(p1Var, context2, paint2, C62042e.m72808l0(eVar, (hx03 == null || (finderContact2 = hx03.f134919d) == null || (str2 = finderContact2.username) == null) ? "" : str2, (hx03 == null || (finderContact = hx03.f134919d) == null || (str = finderContact.nickname) == null) ? "" : str, false, 4, (Object) null), 0, 8, (Object) null);
            Context context3 = this.f36190d.f166287d.getContext();
            C12522mf mfVar2 = this.f36190d;
            spannableString = ((C76979h) C86312j.m106911c(cls2)).mo107057T1(context3, C12522mf.m12080Z0(mfVar2, d1, (ImageSpan) null, mfVar2.f166287d.getContext().getString(C0966R.string.e8t, new Object[]{h, h2})));
        } else {
            Context context4 = this.f36190d.f166287d.getContext();
            StringBuilder sb = new StringBuilder();
            C12522mf mfVar3 = this.f36190d;
            C62042e eVar2 = C62042e.f176370a;
            C64674r41 r413 = this.f36191e;
            sb.append(C12522mf.m12080Z0(mfVar3, d1, (ImageSpan) null, C62042e.m72808l0(eVar2, r413.f185128h, r413.f185124d, false, 4, (Object) null)));
            sb.append(' ');
            spannableString = ((C76979h) C86312j.m106911c(cls2)).mo107057T1(context4, sb.toString());
        }
        if (d1.length() <= 0) {
            z = false;
        }
        if (z) {
            boolean z2 = this.f36192f;
            boolean z3 = this.f36193g;
            Drawable a = C15437l.C15438a.m14437a(C15437l.f41880f, C12522mf.m12081d1(z2, z3), 0.0f, 0.0f, 6, (Object) null);
            String d15 = C12522mf.m12081d1(z2, z3);
            float f = C15439m.f41885k;
            C15439m mVar = r9;
            C15439m mVar2 = new C15439m(d15, f, f, MMApplicationContext.getContext().getResources().getColor(C0966R.color.f3255ky), C15439m.f41883i, MMApplicationContext.getContext().getResources().getColor(C0966R.color.al_), C15439m.f41884j, 0.0f, 128, (C8480h) null);
            spannableString.setSpan(new C15437l(a, mVar), 0, d1.length() + 0, 33);
        }
        ((TextView) ((C36570n) this.f36190d.f35995r).getValue()).setText(spannableString);
        this.f36190d.mo12152a1().setTextSize(0, (float) C76577a.m92157h(this.f36190d.f166287d.getContext(), C0966R.dimen.f3880hp));
        this.f36190d.mo12152a1().setText(((C76979h) C86312j.m106911c(cls2)).mo107057T1(this.f36190d.f166287d.getContext(), this.f36191e.f185126f));
        this.f36190d.mo12152a1().setMovementMethod(ScrollingMovementMethod.getInstance());
        this.f36190d.mo12152a1().post(new C12603pf(this.f36190d, this.f36191e));
        return C13598b0.f38549a;
    }
}
