package qj1;

import ak1.C54067f0;
import ak1.C54108o;
import ak1.C54116w;
import al1.C27914d;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.C0120a0;
import cl1.C54951d;
import cl1.C54979h1;
import cl1.C54991o;
import cl1.C55004v1;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74933u4;
import com.tencent.p014mm.p136ui.C74942w4;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import d60.C58124b;
import di3.C7335d;
import di3.C86312j;
import gy3.C87412m;
import ht1.C8777j5;
import j20.C117292a;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kg3.C76577a;
import ok1.C62042e;
import rx3.C13604l;
import sx3.C90364q0;
import te3.C49712hj1;

/* renamed from: qj1.sf */
public final class C62979sf extends C62660c {

    /* renamed from: p */
    public final ImageView f178699p;

    /* renamed from: q */
    public final ViewGroup f178700q;

    /* renamed from: r */
    public final C58124b f178701r;

    /* renamed from: s */
    public final String f178702s = "Finder.LiveVideoOrientationPlugin";

    /* renamed from: qj1.sf$b */
    public static final class C12664b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ ViewGroup f36265d;

        public C12664b(ViewGroup viewGroup) {
            this.f36265d = viewGroup;
        }

        public final void run() {
            Rect rect = new Rect();
            this.f36265d.getHitRect(rect);
            int i = -MMApplicationContext.getContext().getResources().getDimensionPixelOffset(C0966R.dimen.f3766df);
            rect.inset(i, i);
            ViewParent parent = this.f36265d.getParent();
            C87412m.m108592e(parent, "null cannot be cast to non-null type android.view.View");
            ((View) parent).setTouchDelegate(new TouchDelegate(rect, this.f36265d));
        }
    }

    /* renamed from: qj1.sf$c */
    public static final class C12665c<T> implements C0120a0 {

        /* renamed from: d */
        public final /* synthetic */ C62979sf f36266d;

        public C12665c(C62979sf sfVar) {
            this.f36266d = sfVar;
        }

        public void onChanged(Object obj) {
            C62712dd ddVar;
            Boolean bool = (Boolean) obj;
            C62979sf sfVar = this.f36266d;
            if (sfVar.mo82893g0() && (ddVar = (C62712dd) sfVar.mo87687E0(C62712dd.class)) != null) {
                sfVar.f166287d.post(new C12676tf(sfVar, ddVar));
            }
        }
    }

    /* renamed from: qj1.sf$a */
    public static final class C62980a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C62979sf f178703d;

        /* renamed from: e */
        public final /* synthetic */ ViewGroup f178704e;

        public C62980a(C62979sf sfVar, ViewGroup viewGroup) {
            this.f178703d = sfVar;
            this.f178704e = viewGroup;
        }

        public final void onClick(View view) {
            C54067f0.C0064m mVar = C54067f0.C0064m.ROTATING_BUTTON;
            Class cls = C54108o.class;
            Class cls2 = C54991o.class;
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/plugin/FinderLiveVideoOrientationPlugin$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            ((C54991o) this.f178703d.mo87696x0(cls2)).f154255S3 = true;
            if (this.f178704e.getAlpha() <= 0.0f) {
                C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveVideoOrientationPlugin$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            if (this.f178704e.getContext().getResources().getConfiguration().orientation == 1) {
                C62979sf sfVar = this.f178703d;
                sfVar.getClass();
                Bundle bundle = new Bundle();
                bundle.putString("ACTION_POST_LANDSCAPE", "LANDSCAPE_ACTION_CHANGE_VIDEO");
                ((C54991o) sfVar.mo87696x0(cls2)).f154321h1 = new C27914d("EVENT_POST_LANDSCAPE_ACTION", bundle, (Object) null);
                sfVar.mo14484z0().onLandscapeAction(((C54991o) sfVar.mo87696x0(cls2)).f154295b1, ((C54991o) sfVar.mo87696x0(cls2)).f154291a1, bundle, (Object) null);
                C7335d c = C86312j.m106911c(cls);
                C87412m.m108593f(c, "getService(HellLiveReport::class.java)");
                C8777j5.C8778a.m8606g((C8777j5) c, mVar, C90364q0.m113148g(new C13604l("screen_type", "1")), (String) null, 4, (Object) null);
            } else {
                C62660c.m73643W0(this.f178703d, "PORTRAIT_ACTION_CHANGE_VIDEO", (Object) null, 2, (Object) null);
                C7335d c2 = C86312j.m106911c(cls);
                C87412m.m108593f(c2, "getService(HellLiveReport::class.java)");
                C8777j5.C8778a.m8606g((C8777j5) c2, mVar, C90364q0.m113148g(new C13604l("screen_type", "2")), (String) null, 4, (Object) null);
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveVideoOrientationPlugin$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C62979sf(ViewGroup viewGroup, ImageView imageView, ViewGroup viewGroup2, C58124b bVar) {
        super(viewGroup, bVar, (C49712hj1) null);
        C87412m.m108594g(viewGroup, "root");
        C87412m.m108594g(imageView, "videoOrientationBtn");
        C87412m.m108594g(viewGroup2, "videoOrientationBg");
        C87412m.m108594g(bVar, "statueMonitor");
        this.f178699p = imageView;
        this.f178700q = viewGroup2;
        this.f178701r = bVar;
        ((C54991o) mo87696x0(C54991o.class)).f154255S3 = false;
        viewGroup.setOnClickListener(new C62980a(this, viewGroup));
        viewGroup.post(new C12664b(viewGroup));
        if (viewGroup.getLayoutParams() != null && (viewGroup.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) && mo82893g0()) {
            ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
            C87412m.m108592e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ((ViewGroup.MarginLayoutParams) layoutParams).setMarginEnd(C74942w4.m89784a(viewGroup.getContext(), 28));
        }
        C62042e.f176370a.mo87071d(this);
    }

    /* renamed from: c1 */
    public static void m74202c1(C62979sf sfVar, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        Class cls = C54991o.class;
        if (!sfVar.mo82893g0()) {
            ViewGroup.LayoutParams layoutParams = sfVar.f166287d.getLayoutParams();
            C87412m.m108592e(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
            layoutParams2.topMargin = i;
            layoutParams2.rightMargin = i2;
            sfVar.f166287d.setLayoutParams(layoutParams2);
            sfVar.f166287d.setTag(Integer.valueOf(i));
            sfVar.f178700q.setBackgroundResource(C0966R.C0969drawable.alc);
        } else {
            sfVar.f178700q.setBackground((Drawable) null);
        }
        if (((C54991o) sfVar.mo87696x0(cls)).mo75966J4()) {
            sfVar.mo10792g(0);
        }
        if (!((C54991o) sfVar.mo87684A0().mo71262a(cls)).mo75990Y3()) {
            Context context = sfVar.f166287d.getContext();
            C87412m.m108592e(context, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
            if (!((AppCompatActivity) context).getIntent().hasExtra("KEY_MINI_APP_AD_FLOW_INFO")) {
                return;
            }
        }
        sfVar.mo10792g(8);
    }

    /* renamed from: O0 */
    public void mo12017O0(Configuration configuration) {
        if (C85875k4.m106208w()) {
            mo10792g(8);
        }
    }

    /* JADX WARNING: type inference failed for: r0v6, types: [d60.b] */
    /* JADX WARNING: type inference failed for: r0v8, types: [d60.b] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* renamed from: Z0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo87912Z0() {
        /*
            r3 = this;
            java.lang.Class<cl1.d> r0 = cl1.C54951d.class
            androidx.lifecycle.i0 r0 = r3.mo87696x0(r0)
            cl1.d r0 = (cl1.C54951d) r0
            boolean r0 = r0.mo75869e3()
            r1 = 0
            if (r0 == 0) goto L_0x002b
            java.lang.String r0 = r3.f178702s
            java.lang.String r2 = "checkAlpha isAdVideoPlaying true"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r2)
            d60.b r0 = r3.f178701r
            boolean r2 = r0 instanceof com.tencent.p014mm.plugin.finder.live.view.C56032b
            if (r2 == 0) goto L_0x001f
            r1 = r0
            com.tencent.mm.plugin.finder.live.view.b r1 = (com.tencent.p014mm.plugin.finder.live.view.C56032b) r1
        L_0x001f:
            if (r1 == 0) goto L_0x0024
            r1.disableRatation()
        L_0x0024:
            android.widget.ImageView r0 = r3.f178699p
            r1 = 0
            r0.setAlpha(r1)
            goto L_0x0047
        L_0x002b:
            java.lang.String r0 = r3.f178702s
            java.lang.String r2 = "checkAlpha isAdVideoPlaying false"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r2)
            android.widget.ImageView r0 = r3.f178699p
            r2 = 1065353216(0x3f800000, float:1.0)
            r0.setAlpha(r2)
            d60.b r0 = r3.f178701r
            boolean r2 = r0 instanceof com.tencent.p014mm.plugin.finder.live.view.C56032b
            if (r2 == 0) goto L_0x0042
            r1 = r0
            com.tencent.mm.plugin.finder.live.view.b r1 = (com.tencent.p014mm.plugin.finder.live.view.C56032b) r1
        L_0x0042:
            if (r1 == 0) goto L_0x0047
            r1.enableRotation()
        L_0x0047:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: qj1.C62979sf.mo87912Z0():void");
    }

    /* JADX WARNING: type inference failed for: r0v8, types: [android.view.ViewGroup$LayoutParams] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo87913a1(android.view.View r4) {
        /*
            r3 = this;
            int r0 = r3.mo14483f0()
            if (r0 != 0) goto L_0x0083
            if (r4 == 0) goto L_0x0083
            android.view.ViewGroup r4 = r3.f166287d
            java.lang.Object r4 = r4.getTag()
            boolean r4 = r4 instanceof java.lang.Integer
            if (r4 == 0) goto L_0x0083
            boolean r4 = r3.mo82893g0()
            if (r4 != 0) goto L_0x0083
            java.lang.Class<qj1.x6> r4 = qj1.C63102x6.class
            qj1.c r4 = r3.mo87687E0(r4)
            qj1.x6 r4 = (qj1.C63102x6) r4
            r0 = 0
            if (r4 == 0) goto L_0x002b
            int r1 = r4.mo14483f0()
            if (r1 != 0) goto L_0x002b
            r1 = 1
            goto L_0x002c
        L_0x002b:
            r1 = 0
        L_0x002c:
            if (r1 == 0) goto L_0x0038
            if (r4 == 0) goto L_0x0038
            android.view.ViewGroup r4 = r4.f166287d
            if (r4 == 0) goto L_0x0038
            int r0 = r4.getHeight()
        L_0x0038:
            android.view.ViewGroup r4 = r3.f166287d
            java.lang.Object r4 = r4.getTag()
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.Int"
            gy3.C87412m.m108592e(r4, r1)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            int r4 = r4 + r0
            android.view.ViewGroup r0 = r3.f166287d
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            boolean r1 = r0 instanceof android.view.ViewGroup.MarginLayoutParams
            r2 = 0
            if (r1 == 0) goto L_0x0058
            android.view.ViewGroup$MarginLayoutParams r0 = (android.view.ViewGroup.MarginLayoutParams) r0
            goto L_0x0059
        L_0x0058:
            r0 = r2
        L_0x0059:
            if (r0 == 0) goto L_0x0062
            int r0 = r0.topMargin
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L_0x0063
        L_0x0062:
            r0 = r2
        L_0x0063:
            if (r0 != 0) goto L_0x0066
            goto L_0x006c
        L_0x0066:
            int r0 = r0.intValue()
            if (r0 == r4) goto L_0x0083
        L_0x006c:
            android.view.ViewGroup r0 = r3.f166287d
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            boolean r1 = r0 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r1 == 0) goto L_0x0079
            r2 = r0
            android.view.ViewGroup$MarginLayoutParams r2 = (android.view.ViewGroup.MarginLayoutParams) r2
        L_0x0079:
            if (r2 != 0) goto L_0x007c
            goto L_0x007e
        L_0x007c:
            r2.topMargin = r4
        L_0x007e:
            android.view.ViewGroup r4 = r3.f166287d
            r4.requestLayout()
        L_0x0083:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: qj1.C62979sf.mo87913a1(android.view.View):void");
    }

    /* renamed from: b */
    public boolean mo3200b() {
        return true;
    }

    /* renamed from: b1 */
    public final void mo87914b1(int i, int i2, int i3) {
        ViewGroup viewGroup;
        Class cls = C54991o.class;
        if (!mo82893g0()) {
            C63102x6 x6Var = (C63102x6) mo87687E0(C63102x6.class);
            int height = (!(x6Var != null && x6Var.mo14483f0() == 0) || x6Var == null || (viewGroup = x6Var.f166287d) == null) ? 0 : viewGroup.getHeight();
            ViewGroup.LayoutParams layoutParams = this.f166287d.getLayoutParams();
            C87412m.m108592e(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
            int i4 = i2 + i3;
            layoutParams2.topMargin = height + i4;
            this.f166287d.setTag(Integer.valueOf(i4));
            layoutParams2.rightMargin = C76577a.m92151b(MMApplicationContext.getContext(), 4);
            this.f166287d.setLayoutParams(layoutParams2);
            this.f178700q.setBackgroundResource(C0966R.C0969drawable.alc);
        } else {
            ViewGroup.LayoutParams layoutParams3 = this.f166287d.getLayoutParams();
            C87412m.m108592e(layoutParams3, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ((ViewGroup.MarginLayoutParams) layoutParams3).setMarginEnd(C74942w4.m89784a(this.f166287d.getContext(), 28));
            this.f178700q.setBackground((Drawable) null);
        }
        if (((C54991o) mo87696x0(cls)).mo75966J4()) {
            mo10792g(0);
        }
        if (!((C54991o) mo87684A0().mo71262a(cls)).mo75990Y3()) {
            Context context = this.f166287d.getContext();
            C87412m.m108592e(context, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
            if (!((AppCompatActivity) context).getIntent().hasExtra("KEY_MINI_APP_AD_FLOW_INFO")) {
                return;
            }
        }
        mo10792g(8);
    }

    /* renamed from: d1 */
    public final void mo87915d1(boolean z) {
        C54067f0.C0066n nVar = C54067f0.C0066n.ROTATING_BUTTON;
        Class cls = C54108o.class;
        C54067f0.C0060i0 i0Var = C54067f0.C0060i0.FROM_ONPLUGIN;
        Class cls2 = C54116w.class;
        int i = this.f166287d.getContext().getResources().getConfiguration().orientation;
        String str = this.f178702s;
        Log.m105924i(str, "setLayoutOrientation isFitRenderMode:" + z + ",orientaion:" + i);
        if (!z) {
            mo10792g(8);
            return;
        }
        if (i == 1) {
            this.f178699p.setImageDrawable(C74933u4.m89768e(MMApplicationContext.getContext(), C0966R.raw.icons_outlined_vtoh_new, -1));
            mo10792g(0);
            ((C54116w) C86312j.m106911c(cls2)).vy0(0, 1, i0Var);
            ((C54108o) C86312j.m106911c(cls)).mo9602Jz(nVar, C90364q0.m113148g(new C13604l("screen_type", "1")));
        } else if (i != 2) {
            mo10792g(8);
        } else {
            this.f178699p.setImageDrawable(C74933u4.m89768e(MMApplicationContext.getContext(), C0966R.raw.icons_outlined_htov_new, -1));
            mo10792g(0);
            ((C54116w) C86312j.m106911c(cls2)).vy0(0, 2, i0Var);
            ((C54108o) C86312j.m106911c(cls)).mo9602Jz(nVar, C90364q0.m113148g(new C13604l("screen_type", "2")));
        }
        if (!((C54991o) mo87684A0().mo71262a(C54991o.class)).mo75990Y3()) {
            Context context = this.f166287d.getContext();
            C87412m.m108592e(context, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
            if (!((AppCompatActivity) context).getIntent().hasExtra("KEY_MINI_APP_AD_FLOW_INFO")) {
                return;
            }
        }
        mo10792g(8);
    }

    /* renamed from: g */
    public void mo10792g(int i) {
        boolean g4 = ((C54991o) mo87696x0(C54991o.class)).mo76003g4();
        int i2 = (i != 0 || (!C85875k4.m106208w() && !g4)) ? i : 8;
        String str = this.f178702s;
        Log.m105924i(str, "setVisible: isMicLinking:" + g4 + ", visible:" + i + ", newVisible:" + i2);
        super.mo10792g(i2);
    }

    /* renamed from: h */
    public boolean mo3206h() {
        return true;
    }

    /* renamed from: i0 */
    public void mo8357i0() {
        super.mo8357i0();
        ((C54979h1) mo87696x0(C54979h1.class)).f154145t.observe(this, new C12665c(this));
    }

    /* renamed from: m */
    public boolean mo3208m() {
        return true;
    }

    /* renamed from: m0 */
    public void mo11992m0(LinkedHashMap<String, Rect> linkedHashMap) {
        C87412m.m108594g(linkedHashMap, "micUserMap");
        int i = this.f166287d.getContext().getResources().getConfiguration().orientation;
        String str = this.f178702s;
        Log.m105924i(str, "onMicUserChanged: micUserMap.size:" + linkedHashMap.size() + ", curOrientation:" + i);
        if (linkedHashMap.size() > 1) {
            mo10792g(8);
            if (i == 2) {
                C62660c.m73643W0(this, "PORTRAIT_ACTION_CHANGE_VIDEO", (Object) null, 2, (Object) null);
                return;
            }
            return;
        }
        mo87915d1(((C54991o) mo87696x0(C54991o.class)).mo75966J4());
    }

    /* renamed from: s0 */
    public void mo3209s0() {
        mo87912Z0();
    }

    /* renamed from: u0 */
    public void mo3210u0(C58124b.C58125b bVar, Bundle bundle) {
        C87412m.m108594g(bVar, "status");
        int ordinal = bVar.ordinal();
        if (ordinal != 5) {
            if (ordinal == 7) {
                Class cls = C55004v1.class;
                ((C55004v1) mo87696x0(cls)).f154436g.observe(this, new C63039uf(this));
                ((C55004v1) mo87696x0(cls)).f154442p.observe(this, new C63062vf(this));
                ((C54951d) mo87696x0(C54951d.class)).f154007o.observe(this, new C63092wf(this));
                mo87912Z0();
                return;
            } else if (!(ordinal == 27 || ordinal == 28)) {
                return;
            }
        }
        mo10792g(8);
    }
}
