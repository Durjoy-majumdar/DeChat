package qj1;

import ak1.C0073g0;
import ak1.C54108o;
import android.animation.ObjectAnimator;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import bl3.C39818r;
import cl1.C54985m;
import cl1.C54991o;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74933u4;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import d60.C58124b;
import di3.C86312j;
import er1.C58739j4;
import f40.C86709a0;
import fy3.C32224a;
import gg1.C32444a;
import gy3.C87412m;
import gy3.C87413o;
import ht1.C60200t1;
import ht1.C8777j5;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import l60.C99344b;
import nj3.C76912y0;
import o40.C61926c;
import ok1.C62042e;
import org.json.JSONObject;
import org.libpag.PAGView;
import pl1.C100810g0;
import pl1.C11984n0;
import pl1.C11990s0;
import r60.C101350i;
import rx3.C13598b0;
import t60.C64207e;
import te3.C49712hj1;
import up1.C27696y;
import x60.C102564a;

/* renamed from: qj1.u1 */
public final class C12690u1 extends C62660c {

    /* renamed from: A */
    public final String f36356A;

    /* renamed from: B */
    public String f36357B;

    /* renamed from: C */
    public long f36358C;

    /* renamed from: D */
    public boolean f36359D;

    /* renamed from: E */
    public boolean f36360E;

    /* renamed from: p */
    public final C58124b f36361p;

    /* renamed from: q */
    public final String f36362q = "FinderLiveAnchorLikePlugin";

    /* renamed from: r */
    public final ImageView f36363r;

    /* renamed from: s */
    public final TextView f36364s;

    /* renamed from: t */
    public final PAGView f36365t;

    /* renamed from: u */
    public final View f36366u;

    /* renamed from: v */
    public final View f36367v;

    /* renamed from: w */
    public final View f36368w;

    /* renamed from: x */
    public final View f36369x;

    /* renamed from: y */
    public final View f36370y;

    /* renamed from: z */
    public final View f36371z;

    /* renamed from: qj1.u1$a */
    public static final class C12691a<T, R> implements C64207e {

        /* renamed from: a */
        public final /* synthetic */ C12690u1 f36372a;

        public C12691a(C12690u1 u1Var) {
            this.f36372a = u1Var;
        }

        /* renamed from: a */
        public void mo507a(C102564a aVar, C101350i iVar, Object obj) {
            C61926c.m72668M(new C12668t1((Bitmap) obj, this.f36372a));
        }
    }

    /* renamed from: qj1.u1$b */
    public static final class C12692b extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C12690u1 f36373d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C12692b(C12690u1 u1Var) {
            super(0);
            this.f36373d = u1Var;
        }

        public Object invoke() {
            C12690u1 u1Var = this.f36373d;
            u1Var.f36357B = null;
            ImageView imageView = u1Var.f36363r;
            Drawable drawable = u1Var.f166287d.getContext().getResources().getDrawable(C0966R.raw.icons_filled_call_good);
            C74933u4.m89769f(drawable, this.f36373d.f166287d.getContext().getResources().getColor(C0966R.color.BW_100_Alpha_0_8));
            imageView.setImageDrawable(drawable);
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C12690u1(ViewGroup viewGroup, C58124b bVar) {
        super(viewGroup, bVar, (C49712hj1) null);
        C87412m.m108594g(viewGroup, "root");
        C87412m.m108594g(bVar, "statusMonitor");
        this.f36361p = bVar;
        View findViewById = viewGroup.findViewById(C0966R.C0970id.db4);
        C87412m.m108593f(findViewById, "root.findViewById(R.id.f…chor_like_indicator_icon)");
        this.f36363r = (ImageView) findViewById;
        View findViewById2 = viewGroup.findViewById(C0966R.C0970id.db6);
        C87412m.m108593f(findViewById2, "root.findViewById(R.id.f…anchor_like_indicator_tv)");
        this.f36364s = (TextView) findViewById2;
        this.f36365t = (PAGView) viewGroup.findViewById(C0966R.C0970id.dp9);
        this.f36366u = viewGroup.findViewById(C0966R.C0970id.dao);
        this.f36367v = viewGroup.findViewById(C0966R.C0970id.daq);
        this.f36368w = viewGroup.findViewById(C0966R.C0970id.dap);
        this.f36369x = viewGroup.findViewById(C0966R.C0970id.ddq);
        this.f36370y = viewGroup.findViewById(C0966R.C0970id.ddp);
        this.f36371z = viewGroup.findViewById(C0966R.C0970id.ddn);
        this.f36356A = "finder_live_clap_anim.pag";
        this.f36357B = ((C54991o) mo87696x0(C54991o.class)).f154278X1.f1587c;
        mo12264c1();
    }

    /* renamed from: Z0 */
    public static final void m12191Z0(C12690u1 u1Var, C54985m.C0671b bVar) {
        Class cls = C54991o.class;
        String str = u1Var.f36362q;
        Log.m105924i(str, "updateCheerInfos " + bVar);
        if (bVar != null) {
            ((C54991o) u1Var.mo87696x0(cls)).mo75972M4(bVar.f1580a, bVar.f1581b, bVar.f1582c);
            C63049v9 v9Var = (C63049v9) u1Var.mo87687E0(C63049v9.class);
            if (v9Var != null) {
                v9Var.mo87991f1(((C54991o) u1Var.mo87696x0(cls)).f154278X1.f1586b);
            }
            u1Var.mo12262a1(((C54991o) u1Var.mo87696x0(cls)).f154278X1.f1587c);
        }
    }

    /* renamed from: a1 */
    public final void mo12262a1(String str) {
        String str2 = this.f36362q;
        Log.m105924i(str2, "checkCheerIcon, new:" + str + " old:" + this.f36357B);
        if (((C54991o) mo87696x0(C54991o.class)).f154278X1.f1588d == 0) {
            this.f36357B = null;
            mo12264c1();
        } else if (!Util.isEqual(this.f36357B, str)) {
            this.f36357B = str;
            mo12264c1();
        }
    }

    /* renamed from: b */
    public boolean mo3200b() {
        return true;
    }

    /* renamed from: b1 */
    public final void mo12263b1() {
        if (C62042e.f176370a.mo87027N0() || ((C54991o) mo87696x0(C54991o.class)).f154190D) {
            mo10792g(0);
        } else {
            mo10792g(8);
        }
    }

    /* renamed from: c1 */
    public final void mo12264c1() {
        String str = this.f36362q;
        Log.m105924i(str, "updateCheerIcon:" + this.f36357B);
        if (this.f36359D || this.f36360E) {
            Log.m105924i(this.f36362q, "applaud mode ,return");
            return;
        }
        String str2 = this.f36357B;
        if (!(str2 == null || str2.length() == 0)) {
            C99344b<C100810g0, Bitmap> a = ((C11990s0) C39818r.f106831a.mo62446e(C60200t1.class).mo62447c(C11990s0.class)).mo11871f2().mo85955a(new C11984n0(this.f36357B, C27696y.THUMB_IMAGE));
            C12691a aVar = new C12691a(this);
            a.getClass();
            a.f291320d = aVar;
            a.mo85951a();
            return;
        }
        C61926c.m72668M(new C12692b(this));
    }

    /* renamed from: g */
    public void mo10792g(int i) {
        if (C62042e.f176370a.mo87027N0() || ((C54991o) mo87696x0(C54991o.class)).f154190D) {
            super.mo10792g(i);
        } else {
            super.mo10792g(8);
        }
    }

    /* renamed from: h */
    public boolean mo3206h() {
        return true;
    }

    /* renamed from: m */
    public boolean mo3208m() {
        return ((C54991o) mo87696x0(C54991o.class)).f154287Z0 != 1;
    }

    /* renamed from: u0 */
    public void mo3210u0(C58124b.C58125b bVar, Bundle bundle) {
        Bundle bundle2 = bundle;
        Class cls = C54991o.class;
        C87412m.m108594g(bVar, "status");
        super.mo3210u0(bVar, bundle);
        int ordinal = bVar.ordinal();
        if (ordinal == 7) {
            ((C54985m) mo87696x0(C54985m.class)).f154165p.observe(this, new C62969s1(this));
        } else if (ordinal == 118) {
            if (((C54991o) mo87696x0(cls)).f154178A && !C61926c.m72696u(((C54991o) mo87696x0(cls)).f154354q, 512)) {
                ((C54991o) mo87696x0(cls)).f154182B = true;
            }
            if (!((C54991o) mo87696x0(cls)).f154178A || C61926c.m72696u(((C54991o) mo87696x0(cls)).f154354q, 512) || !((C54991o) mo87696x0(cls)).mo75999e4()) {
                mo10792g(8);
            } else {
                mo10792g(0);
            }
        } else if (ordinal != 144) {
            if (ordinal == 181) {
                if (!(bundle2 != null && !bundle2.getBoolean("PARAM_FINDER_LIVE_LIKE_ENABLE", true))) {
                    ((C54991o) mo87696x0(cls)).f154182B = true;
                    mo10792g(0);
                    return;
                }
                mo10792g(8);
            }
        } else if (System.currentTimeMillis() - this.f36358C <= 10000) {
            if (C58739j4.f168176a.mo83692U()) {
                C76912y0.makeText(this.f166287d.getContext(), (CharSequence) "applaud time interval limit, return", 0).show();
            }
            Log.m105924i(this.f36362q, "applaud time interval limit, return");
        } else if (this.f36359D || this.f36360E) {
            Log.m105924i(this.f36362q, "in applaud mode ,return");
        } else {
            C72994y1.C72995a aVar = C72994y1.C72995a.USERINFO_FINDER_LIVE_HAS_SHOWN_APPLAUD_TIPS_BOOLEAN_SYNC;
            if (((Boolean) C32444a.f86062H1.mo60266n()).booleanValue() || !C86709a0.m107535s().mo121142i().mo119686g(aVar, false)) {
                C86709a0.m107535s().mo121142i().mo119677K(aVar, Boolean.TRUE);
                View view = this.f36369x;
                C9556a aVar2 = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar2.mo10233c(0);
                View view2 = view;
                C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorLikePlugin", "showApplaudTip", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorLikePlugin", "showApplaudTip", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                this.f36371z.setOnClickListener(new C12593p1(this));
                this.f36371z.post(new C12607q1(this));
                this.f36370y.setOnClickListener(new C12631r1(this));
            }
            C54108o oVar = (C54108o) C86312j.m106911c(C54108o.class);
            oVar.getClass();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("sub_action", 1);
            C8777j5.C8778a.m8605f(oVar, C0073g0.ANCHOR_APPLAUD, jSONObject.toString(), (String) null, 4, (Object) null);
            this.f36360E = true;
            View view3 = this.f36366u;
            C9556a aVar3 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar3.mo10233c(0);
            View view4 = view3;
            C117292a.m165358d(view4, aVar3.mo10232b(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorLikePlugin", "likeIconChangeToApplaud", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
            C117292a.m165359e(view4, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorLikePlugin", "likeIconChangeToApplaud", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f36363r.setVisibility(4);
            View view5 = this.f36367v;
            C9556a aVar4 = new C9556a();
            aVar4.mo10233c(0);
            View view6 = view5;
            C117292a.m165358d(view6, aVar4.mo10232b(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorLikePlugin", "likeIconChangeToApplaud", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view5.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
            C117292a.m165359e(view6, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorLikePlugin", "likeIconChangeToApplaud", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f36364s.setVisibility(8);
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f36366u, "scaleX", new float[]{1.0f, 1.5f, 1.0f});
            C87412m.m108593f(ofFloat, "ofFloat(applaudBg, \"scaleX\", 1F, 1.5F, 1F)");
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.f36366u, "scaleY", new float[]{1.0f, 1.5f, 1.0f});
            C87412m.m108593f(ofFloat2, "ofFloat(applaudBg, \"scaleY\", 1F, 1.5F, 1F)");
            ofFloat.setDuration(300);
            ofFloat2.setDuration(300);
            ofFloat.start();
            ofFloat2.start();
            this.f36367v.setOnClickListener(new C12566o1(this));
        }
    }

    /* renamed from: w0 */
    public void mo3211w0() {
        super.mo3211w0();
        this.f36357B = null;
    }
}
