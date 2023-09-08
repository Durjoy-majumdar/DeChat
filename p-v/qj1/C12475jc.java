package qj1;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.lifecycle.C0120a0;
import cl1.C0668l;
import cl1.C39975j;
import cl1.C39981t0;
import cl1.C54991o;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import d60.C58124b;
import di3.C86312j;
import er1.C45684k;
import gy3.C87412m;
import hq1.C60085d;
import hq1.C60090e;
import j20.C117292a;
import java.util.ArrayList;
import ky2.C10432i;
import lg1.C46854h;
import nj3.C76912y0;
import nk1.C47272h;
import ok1.C62042e;
import te3.C49712hj1;
import te3.C50317lw0;
import up1.C37521f;

/* renamed from: qj1.jc */
public final class C12475jc extends C62660c {

    /* renamed from: A */
    public final C0120a0<C50317lw0> f35885A;

    /* renamed from: p */
    public final C58124b f35886p;

    /* renamed from: q */
    public final String f35887q = "Finder.FinderLiveNewVisitorPostPlugin";

    /* renamed from: r */
    public final View f35888r;

    /* renamed from: s */
    public final TextView f35889s;

    /* renamed from: t */
    public final RelativeLayout f35890t;

    /* renamed from: u */
    public String f35891u;

    /* renamed from: v */
    public final String f35892v;

    /* renamed from: w */
    public final String f35893w;

    /* renamed from: x */
    public final String f35894x;

    /* renamed from: y */
    public final String f35895y;

    /* renamed from: z */
    public final String f35896z;

    /* renamed from: qj1.jc$a */
    public static final class C12476a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C12475jc f35897d;

        /* renamed from: e */
        public final /* synthetic */ ViewGroup f35898e;

        public C12476a(C12475jc jcVar, ViewGroup viewGroup) {
            this.f35897d = jcVar;
            this.f35898e = viewGroup;
        }

        public final void onClick(View view) {
            C60085d dVar;
            C60090e eVar;
            String str;
            Class cls = C54991o.class;
            Class cls2 = C39975j.class;
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/plugin/FinderLiveNewVisitorPostPlugin$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            boolean z = false;
            if (((C39975j) this.f35897d.mo87696x0(cls2)).mo62578e3()) {
                C12475jc jcVar = this.f35897d;
                C50317lw0 value = ((C39975j) jcVar.mo87696x0(cls2)).f107170j.getValue();
                if (value == null || (str = value.f137677e) == null) {
                    str = "";
                }
                if (str.length() == 0) {
                    C76912y0.makeText(jcVar.f166287d.getContext(), (CharSequence) MMApplicationContext.getContext().getResources().getString(C0966R.string.m3j), 0).show();
                } else {
                    C47272h hVar = C47272h.f126894a;
                    if (hVar.mo72302g(str)) {
                        C76912y0.makeText(jcVar.f166287d.getContext(), (CharSequence) MMApplicationContext.getContext().getResources().getString(C0966R.string.m3k), 0).show();
                    } else if (hVar.mo72303h(str)) {
                        C76912y0.makeText(jcVar.f166287d.getContext(), (CharSequence) MMApplicationContext.getContext().getResources().getString(C0966R.string.m3l), 0).show();
                    } else if (!((C39975j) jcVar.mo87696x0(cls2)).f107169i) {
                        String string = MMApplicationContext.getContext().getResources().getString(C0966R.string.e6k);
                        C87412m.m108593f(string, "getContext().resources.g…_control_disable_comment)");
                        C76912y0.m92767f(jcVar.f166287d.getContext(), string);
                    } else {
                        z = true;
                    }
                }
                if (z) {
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("PARAM_IS_ENTERING_COMMENT", true);
                    bundle.putString("PARAM_FINDER_LIVE_AUTO_INPUT_MSG", this.f35897d.f35891u);
                    this.f35897d.f35886p.statusChange(C58124b.C58125b.ENTERING_COMMENT, bundle);
                }
            } else {
                C12475jc jcVar2 = this.f35897d;
                ViewGroup viewGroup = this.f35898e;
                if (!((C54991o) jcVar2.mo87696x0(cls)).f154362s || !((C54991o) jcVar2.mo87696x0(cls)).f154366t) {
                    String str2 = ((C54991o) jcVar2.mo87696x0(cls)).f154374v;
                    if (str2 == null || str2.length() == 0) {
                        z = true;
                    }
                    C76912y0.m92767f(viewGroup.getContext(), !z ? ((C54991o) jcVar2.mo87696x0(cls)).f154374v : MMApplicationContext.getContext().getResources().getString(C0966R.string.e6k));
                } else if (C87412m.m108589b(jcVar2.f35889s.getText(), jcVar2.f35896z)) {
                    C76912y0.m92766e(viewGroup.getContext(), MMApplicationContext.getContext().getResources().getString(C0966R.string.dje), C12487kc.f35916a);
                } else {
                    Bundle bundle2 = new Bundle();
                    bundle2.putBoolean("PARAM_IS_ENTERING_COMMENT", true);
                    bundle2.putString("PARAM_FINDER_LIVE_AUTO_INPUT_MSG", jcVar2.f35891u);
                    jcVar2.f35886p.statusChange(C58124b.C58125b.ENTERING_COMMENT, bundle2);
                }
            }
            if (!(!((C54991o) this.f35897d.mo87696x0(cls)).mo75990Y3() || (dVar = (C60085d) this.f35897d.mo87687E0(C60085d.class)) == null || (eVar = dVar.f171450r) == null)) {
                eVar.mo84955a();
                eVar.mo84957c(2014);
            }
            this.f35897d.f35891u = "";
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveNewVisitorPostPlugin$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: qj1.jc$b */
    public static final class C12477b implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C12475jc f35899d;

        public C12477b(C12475jc jcVar) {
            this.f35899d = jcVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/plugin/FinderLiveNewVisitorPostPlugin$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C58124b.C7172a.m7372a(this.f35899d.f35886p, C58124b.C58125b.FINDER_LIVE_COMMENT_CHANGE_TO_MIC_INTERCOM, (Bundle) null, 2, (Object) null);
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveNewVisitorPostPlugin$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: qj1.jc$c */
    public static final class C12478c<T> implements C0120a0 {

        /* renamed from: d */
        public final /* synthetic */ C12475jc f35900d;

        public C12478c(C12475jc jcVar) {
            this.f35900d = jcVar;
        }

        public void onChanged(Object obj) {
            C50317lw0 lw02 = (C50317lw0) obj;
            String str = this.f35900d.f35887q;
            StringBuilder sb = new StringBuilder();
            sb.append("curBoxObserver ");
            sb.append(lw02 != null ? lw02.f137677e : null);
            String sb4 = sb.toString();
            C87412m.m108594g(str, "tag");
            C87412m.m108594g(sb4, "str");
            Log.m105924i(str, "liveDataLog " + sb4);
            this.f35900d.mo12133c1();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C12475jc(ViewGroup viewGroup, C58124b bVar) {
        super(viewGroup, bVar, (C49712hj1) null);
        C87412m.m108594g(viewGroup, "root");
        C87412m.m108594g(bVar, "statusMonitor");
        this.f35886p = bVar;
        View findViewById = viewGroup.findViewById(C0966R.C0970id.e1q);
        this.f35888r = findViewById;
        this.f35889s = (TextView) viewGroup.findViewById(C0966R.C0970id.e1n);
        RelativeLayout relativeLayout = (RelativeLayout) viewGroup.findViewById(C0966R.C0970id.izf);
        this.f35890t = relativeLayout;
        this.f35891u = "";
        String string = MMApplicationContext.getContext().getResources().getString(C0966R.string.djz);
        C87412m.m108593f(string, "getContext().resources.g….finder_live_comment_tip)");
        this.f35892v = string;
        String string2 = MMApplicationContext.getContext().getResources().getString(C0966R.string.d0u);
        C87412m.m108593f(string2, "getContext().resources.g…r_assistant_comment_hint)");
        this.f35893w = string2;
        String string3 = MMApplicationContext.getContext().getResources().getString(C0966R.string.d0p);
        C87412m.m108593f(string3, "getContext().resources.g…nder_anchor_comment_hint)");
        this.f35894x = string3;
        String string4 = MMApplicationContext.getContext().getResources().getString(C0966R.string.m3i);
        C87412m.m108593f(string4, "getContext().resources.g…finder_gala_comment_hint)");
        this.f35895y = string4;
        String string5 = MMApplicationContext.getContext().getResources().getString(C0966R.string.ei5);
        C87412m.m108593f(string5, "getContext().resources.g…finder_post_disable_hint)");
        this.f35896z = string5;
        this.f35885A = new C12478c(this);
        findViewById.setOnClickListener(new C12476a(this, viewGroup));
        if (relativeLayout != null) {
            relativeLayout.setOnClickListener(new C12477b(this));
        }
        C62042e.f176370a.mo87074e(this, true);
    }

    /* renamed from: Z0 */
    public final void mo12130Z0() {
        mo12132b1((int) this.f166287d.getContext().getResources().getDimension(C0966R.dimen.f3721of));
        RelativeLayout relativeLayout = this.f35890t;
        if (relativeLayout != null) {
            relativeLayout.setVisibility(8);
        }
        this.f35888r.requestLayout();
    }

    /* renamed from: a1 */
    public final void mo12131a1() {
        mo12132b1(-2);
        RelativeLayout relativeLayout = this.f35890t;
        if (relativeLayout != null) {
            relativeLayout.setVisibility(8);
        }
        this.f166287d.requestLayout();
    }

    /* renamed from: b */
    public boolean mo3200b() {
        return true;
    }

    /* renamed from: b1 */
    public final void mo12132b1(int i) {
        ViewGroup.LayoutParams layoutParams = this.f35888r.getLayoutParams();
        C87412m.m108592e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        layoutParams.width = i;
        ViewGroup.LayoutParams layoutParams2 = this.f35889s.getLayoutParams();
        C87412m.m108592e(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        layoutParams2.width = i;
    }

    /* renamed from: c1 */
    public final void mo12133c1() {
        Class cls = C54991o.class;
        C62042e eVar = C62042e.f176370a;
        if (eVar.mo87043T0(mo87684A0())) {
            this.f35889s.setText(this.f35896z);
        } else if (!C45684k.f123488a.mo71181b(mo87684A0()) || !((C39975j) mo87696x0(C39975j.class)).mo62578e3()) {
            if (eVar.mo87073d1(mo87684A0())) {
                this.f35889s.setText(this.f35894x);
            } else if (!((C54991o) mo87696x0(cls)).f154362s || !((C54991o) mo87696x0(cls)).f154370u || !((C54991o) mo87696x0(cls)).f154366t) {
                this.f35889s.setText(this.f35896z);
            } else {
                this.f35889s.setText(((C54991o) mo87696x0(cls)).f154190D ? this.f35893w : this.f35892v);
            }
            String str = this.f35887q;
            Log.m105924i(str, "riskControlEnableComment:" + ((C54991o) mo87696x0(cls)).f154362s + ",enableLiveRoomComment:" + ((C54991o) mo87696x0(cls)).f154370u + ",enableCustomerComment:" + ((C54991o) mo87696x0(cls)).f154366t);
        } else {
            this.f35889s.setText(this.f35895y);
        }
    }

    /* renamed from: d1 */
    public final boolean mo12134d1() {
        return !C62042e.f176370a.mo87051W0(mo87684A0()) && C87412m.m108589b(((C39981t0) mo87696x0(C39981t0.class)).f107198j.getValue(), Boolean.TRUE) && !((C54991o) mo87696x0(C54991o.class)).f154190D;
    }

    /* renamed from: g */
    public void mo10792g(int i) {
        if (((C10432i) C86312j.m106911c(C10432i.class)).mo10750e()) {
            this.f166287d.setVisibility(8);
            Log.m105928w(this.f35887q, "setVisible return for isTeenMode");
            return;
        }
        super.mo10792g(i);
    }

    /* renamed from: h */
    public boolean mo3206h() {
        return true;
    }

    /* renamed from: m */
    public boolean mo3208m() {
        return ((C0668l) mo87696x0(C0668l.class)).mo632i3();
    }

    /* renamed from: u0 */
    public void mo3210u0(C58124b.C58125b bVar, Bundle bundle) {
        C46854h hVar;
        Class cls = C39975j.class;
        C87412m.m108594g(bVar, "status");
        super.mo3210u0(bVar, bundle);
        int ordinal = bVar.ordinal();
        if (ordinal == 7) {
            ((C39981t0) mo87696x0(C39981t0.class)).f107198j.observe(this, new C12502lc(this));
        } else if (ordinal != 118) {
            boolean z = true;
            if (ordinal == 121) {
                String string = bundle != null ? bundle.getString("PARAM_FINDER_LIVE_AUTO_INPUT_MSG") : null;
                if (string == null) {
                    string = "";
                }
                this.f35891u = string;
                if (C45684k.f123488a.mo71181b(mo87684A0()) && (hVar = (C46854h) mo87687E0(C46854h.class)) != null) {
                    C87412m.m108594g(hVar.mo87684A0(), "<this>");
                    C37521f.f99374d.getClass();
                    if (C37521f.f99245O1.mo60266n().intValue() != 1) {
                        z = false;
                    }
                    Log.m105924i("Finder.BoxCommon", "local enable:" + z);
                    if (z && ((C39975j) hVar.mo87696x0(cls)).mo62578e3()) {
                        hVar.mo72063a1("");
                    }
                }
                this.f35888r.performClick();
            } else if (ordinal == 216) {
                ((C39975j) mo87696x0(cls)).f107170j.observe(this, this.f35885A);
            } else if (ordinal == 218) {
                if (bundle == null || !bundle.getBoolean("isShow")) {
                    z = false;
                }
                if (z) {
                    mo12130Z0();
                } else if (mo12134d1()) {
                    mo12132b1(-2);
                    this.f35888r.requestLayout();
                    RelativeLayout relativeLayout = this.f35890t;
                    if (relativeLayout != null) {
                        relativeLayout.setVisibility(0);
                    }
                } else {
                    mo12131a1();
                }
            } else if (ordinal == 27 || ordinal == 28) {
                mo10792g(8);
            }
        } else {
            mo12133c1();
        }
    }

    /* renamed from: w0 */
    public void mo3211w0() {
        super.mo3211w0();
        mo12131a1();
    }
}
