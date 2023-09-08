package il1;

import ak1.C54067f0;
import ak1.C54108o;
import ak1.C54116w;
import al1.C54130j;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.C0125s;
import cl1.C54963d0;
import cl1.C54991o;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74933u4;
import com.tencent.p014mm.sdk.platformtools.Log;
import d60.C58124b;
import di3.C7335d;
import di3.C86312j;
import gy3.C87412m;
import ht1.C8777j5;
import i50.C60251a;
import java.util.List;
import java.util.Map;
import nj3.C11184p0;
import ok1.C62042e;
import qj1.C62660c;
import qo3.C77407n;
import zj1.C16217b;

/* renamed from: il1.g0 */
public final class C8986g0 {

    /* renamed from: a */
    public final ViewGroup f28392a;

    /* renamed from: b */
    public final C58124b f28393b;

    /* renamed from: c */
    public final C62660c f28394c;

    /* renamed from: d */
    public final String f28395d = "Finder.FinderLiveAnchorMicEntranceWidget";

    /* renamed from: e */
    public final View f28396e;

    /* renamed from: f */
    public final TextView f28397f;

    /* renamed from: g */
    public final ImageView f28398g;

    /* renamed from: h */
    public final View f28399h;

    /* renamed from: i */
    public final TextView f28400i;

    /* renamed from: j */
    public final View f28401j;

    /* renamed from: k */
    public final String f28402k;

    /* renamed from: l */
    public C77407n f28403l;

    /* renamed from: m */
    public C11184p0 f28404m;

    /* renamed from: il1.g0$a */
    public static final class C8987a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C8986g0 f28405d;

        public C8987a(C8986g0 g0Var) {
            this.f28405d = g0Var;
        }

        /* JADX WARNING: type inference failed for: r12v37, types: [java.lang.CharSequence] */
        /* JADX WARNING: type inference failed for: r12v40, types: [java.lang.CharSequence] */
        /* JADX WARNING: Code restructure failed: missing block: B:2:0x005f, code lost:
            r12 = r12.f172989A;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:41:0x0154, code lost:
            if (r8 == null) goto L_0x0174;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:48:0x0172, code lost:
            if (r8 == null) goto L_0x0174;
         */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Removed duplicated region for block: B:38:0x0145  */
        /* JADX WARNING: Removed duplicated region for block: B:43:0x0159  */
        /* JADX WARNING: Unknown variable types count: 2 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onClick(android.view.View r12) {
            /*
                r11 = this;
                java.lang.Class<cl1.d0> r0 = cl1.C54963d0.class
                java.lang.Class<ak1.o> r1 = ak1.C54108o.class
                java.util.ArrayList r2 = new java.util.ArrayList
                r2.<init>()
                r2.add(r12)
                java.lang.Object[] r8 = r2.toArray()
                r2.clear()
                java.lang.String r3 = "com/tencent/mm/plugin/finder/live/widget/FinderLiveAnchorMicEntranceWidget$1"
                java.lang.String r4 = "android/view/View$OnClickListener"
                java.lang.String r5 = "onClick"
                java.lang.String r6 = "(Landroid/view/View;)V"
                r7 = r11
                j20.C117292a.m165356b(r3, r4, r5, r6, r7, r8)
                di3.d r12 = di3.C86312j.m106911c(r1)
                java.lang.String r2 = "getService(HellLiveReport::class.java)"
                gy3.C87412m.m108593f(r12, r2)
                r3 = r12
                ht1.j5 r3 = (ht1.C8777j5) r3
                ak1.f0$m r4 = ak1.C54067f0.C0064m.LIVE_CALL
                r5 = 0
                r6 = 0
                r7 = 6
                r8 = 0
                ht1.C8777j5.C8778a.m8606g(r3, r4, r5, r6, r7, r8)
                di3.d r12 = di3.C86312j.m106911c(r1)
                gy3.C87412m.m108593f(r12, r2)
                r3 = r12
                ht1.j5 r3 = (ht1.C8777j5) r3
                ak1.f0$m r4 = ak1.C54067f0.C0064m.WHEAT
                di3.d r12 = di3.C86312j.m106911c(r1)
                ak1.o r12 = (ak1.C54108o) r12
                ak1.f0$l r2 = ak1.C54067f0.C0062l.LIVING
                java.util.Map r5 = r12.Ex0(r2)
                r7 = 4
                ht1.C8777j5.C8778a.m8606g(r3, r4, r5, r6, r7, r8)
                il1.g0 r12 = r11.f28405d
                r12.getClass()
                com.tencent.mm.plugin.finder.live.model.FinderLiveService r12 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159376d
                c50.b r12 = r12.mo77626b()
                r2 = 1
                r3 = 0
                if (r12 == 0) goto L_0x0069
                d50.i r12 = r12.f172989A
                if (r12 == 0) goto L_0x0069
                boolean r12 = r12.f166264k
                if (r12 != r2) goto L_0x0069
                r12 = 1
                goto L_0x006a
            L_0x0069:
                r12 = 0
            L_0x006a:
                java.lang.String r4 = "(Landroid/view/View;)V"
                java.lang.String r5 = "onClick"
                java.lang.String r6 = "android/view/View$OnClickListener"
                java.lang.String r7 = "com/tencent/mm/plugin/finder/live/widget/FinderLiveAnchorMicEntranceWidget$1"
                if (r12 == 0) goto L_0x0096
                il1.g0 r12 = r11.f28405d
                android.view.ViewGroup r12 = r12.f28392a
                android.content.Context r12 = r12.getContext()
                il1.g0 r0 = r11.f28405d
                android.view.ViewGroup r0 = r0.f28392a
                android.content.Context r0 = r0.getContext()
                android.content.res.Resources r0 = r0.getResources()
                r1 = 2131828061(0x7f111d5d, float:1.9289052E38)
                java.lang.String r0 = r0.getString(r1)
                nj3.C76912y0.m92767f(r12, r0)
                j20.C117292a.m165361g(r11, r7, r6, r5, r4)
                return
            L_0x0096:
                il1.g0 r12 = r11.f28405d
                qj1.c r12 = r12.f28394c
                androidx.lifecycle.i0 r12 = r12.mo87696x0(r0)
                cl1.d0 r12 = (cl1.C54963d0) r12
                al1.j r12 = r12.f154073p
                il1.g0 r8 = r11.f28405d
                java.lang.String r8 = r8.f28395d
                java.lang.StringBuilder r9 = new java.lang.StringBuilder
                r9.<init>()
                java.lang.String r10 = "click mic entrance, curLinkUser:"
                r9.append(r10)
                r9.append(r12)
                java.lang.String r12 = " enableBattle:"
                r9.append(r12)
                il1.g0 r12 = r11.f28405d
                qj1.c r12 = r12.f28394c
                androidx.lifecycle.i0 r12 = r12.mo87696x0(r0)
                cl1.d0 r12 = (cl1.C54963d0) r12
                boolean r12 = r12.f154050D
                r9.append(r12)
                java.lang.String r12 = r9.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r12)
                il1.g0 r12 = r11.f28405d
                qj1.c r12 = r12.f28394c
                androidx.lifecycle.i0 r12 = r12.mo87696x0(r0)
                cl1.d0 r12 = (cl1.C54963d0) r12
                int r12 = r12.f154078u
                r0 = 5
                r8 = 0
                if (r12 == r0) goto L_0x0101
                il1.g0 r12 = r11.f28405d
                qj1.c r12 = r12.f28394c
                java.lang.Class<qj1.h2> r0 = qj1.C62799h2.class
                qj1.c r12 = r12.mo87687E0(r0)
                qj1.h2 r12 = (qj1.C62799h2) r12
                if (r12 == 0) goto L_0x00f2
                boolean r12 = r12.f178268z
                if (r12 != r2) goto L_0x00f2
                r12 = 1
                goto L_0x00f3
            L_0x00f2:
                r12 = 0
            L_0x00f3:
                if (r12 == 0) goto L_0x00f6
                goto L_0x0101
            L_0x00f6:
                il1.g0 r12 = r11.f28405d
                d60.b r12 = r12.f28393b
                d60.b$b r0 = d60.C58124b.C58125b.FINDER_LIVE_LINK_MIC_SHOW_APPLY_LIST
                r2 = 2
                d60.C58124b.C7172a.m7372a(r12, r0, r8, r2, r8)
                goto L_0x0139
            L_0x0101:
                il1.g0 r12 = r11.f28405d
                qo3.n r0 = r12.f28403l
                if (r0 != 0) goto L_0x0116
                qo3.n r0 = new qo3.n
                android.view.ViewGroup r9 = r12.f28392a
                android.content.Context r9 = r9.getContext()
                r0.<init>((android.content.Context) r9, (int) r2, (boolean) r2)
                r12.f28403l = r0
                r0.f225775k1 = r2
            L_0x0116:
                qo3.n r0 = r12.f28403l
                if (r0 == 0) goto L_0x011c
                r0.f225792t1 = r2
            L_0x011c:
                if (r0 == 0) goto L_0x0125
                il1.h0 r2 = new il1.h0
                r2.<init>(r12)
                r0.f225771i = r2
            L_0x0125:
                if (r0 == 0) goto L_0x012b
                nj3.p0 r2 = r12.f28404m
                r0.f225782p = r2
            L_0x012b:
                if (r0 == 0) goto L_0x0134
                il1.i0 r2 = new il1.i0
                r2.<init>(r12)
                r0.f225761d = r2
            L_0x0134:
                if (r0 == 0) goto L_0x0139
                r0.mo107573q()
            L_0x0139:
                il1.g0 r12 = r11.f28405d
                android.widget.TextView r12 = r12.f28397f
                int r12 = r12.getVisibility()
                java.lang.String r0 = ""
                if (r12 != 0) goto L_0x0159
                il1.g0 r12 = r11.f28405d
                android.widget.TextView r12 = r12.f28397f
                java.lang.CharSequence r12 = r12.getText()
                boolean r2 = r12 instanceof java.lang.String
                if (r2 == 0) goto L_0x0154
                r8 = r12
                java.lang.String r8 = (java.lang.String) r8
            L_0x0154:
                if (r8 != 0) goto L_0x0157
                goto L_0x0174
            L_0x0157:
                r0 = r8
                goto L_0x0174
            L_0x0159:
                il1.g0 r12 = r11.f28405d
                android.view.View r12 = r12.f28399h
                int r12 = r12.getVisibility()
                if (r12 != 0) goto L_0x0174
                il1.g0 r12 = r11.f28405d
                android.widget.TextView r12 = r12.f28400i
                java.lang.CharSequence r12 = r12.getText()
                boolean r2 = r12 instanceof java.lang.String
                if (r2 == 0) goto L_0x0172
                r8 = r12
                java.lang.String r8 = (java.lang.String) r8
            L_0x0172:
                if (r8 != 0) goto L_0x0157
            L_0x0174:
                di3.d r12 = di3.C86312j.m106911c(r1)
                ak1.o r12 = (ak1.C54108o) r12
                ak1.f0$y r1 = ak1.C54067f0.C54087y.CLICK_LINKMIC_LOGO
                r2 = -1
                r12.Xx0(r1, r0, r2, r2)
                zj1.b r12 = zj1.C16217b.f43438a
                il1.g0 r0 = r11.f28405d
                java.lang.String r0 = r0.f28402k
                r12.mo14745b(r0, r3)
                j20.C117292a.m165361g(r11, r7, r6, r5, r4)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: il1.C8986g0.C8987a.onClick(android.view.View):void");
        }
    }

    /* renamed from: il1.g0$b */
    public static final class C8988b implements C11184p0 {

        /* renamed from: d */
        public final /* synthetic */ C8986g0 f28406d;

        public C8988b(C8986g0 g0Var) {
            this.f28406d = g0Var;
        }

        public final void onMMMenuItemSelected(MenuItem menuItem, int i) {
            Integer valueOf = menuItem != null ? Integer.valueOf(menuItem.getItemId()) : null;
            this.f28406d.getClass();
            if (valueOf != null && valueOf.intValue() == 0) {
                Log.m105924i(this.f28406d.f28395d, "SHEET_MORE_ACTION_STOP_LINK");
                if (this.f28406d.f28393b.getLiveRole() == 0) {
                    ((C54116w) C86312j.m106911c(C54116w.class)).f151919T0 = true;
                }
                C58124b.C7172a.m7372a(this.f28406d.f28393b, C58124b.C58125b.FINDER_LIVE_LINK_MIC_HANGUP_LINK, (Bundle) null, 2, (Object) null);
                C77407n nVar = this.f28406d.f28403l;
                if (nVar != null) {
                    nVar.mo107572p();
                }
            }
        }
    }

    public C8986g0(ViewGroup viewGroup, C58124b bVar, C62660c cVar) {
        C87412m.m108594g(viewGroup, "root");
        C87412m.m108594g(bVar, "statusMonitor");
        C87412m.m108594g(cVar, "basePlugin");
        this.f28392a = viewGroup;
        this.f28393b = bVar;
        this.f28394c = cVar;
        View findViewById = viewGroup.findViewById(C0966R.C0970id.db_);
        this.f28396e = findViewById;
        this.f28397f = (TextView) viewGroup.findViewById(C0966R.C0970id.dbc);
        ImageView imageView = (ImageView) viewGroup.findViewById(C0966R.C0970id.db9);
        this.f28398g = imageView;
        this.f28399h = viewGroup.findViewById(C0966R.C0970id.dbb);
        this.f28400i = (TextView) viewGroup.findViewById(C0966R.C0970id.dba);
        View findViewById2 = viewGroup.findViewById(C0966R.C0970id.f358546om0);
        this.f28401j = findViewById2;
        this.f28402k = "anchorlive.bottom.connectmic";
        this.f28404m = new C8988b(this);
        Drawable drawable = viewGroup.getContext().getResources().getDrawable(C0966R.raw.finder_icons_filled_link_mic);
        C74933u4.m89769f(drawable, -1);
        imageView.setImageDrawable(drawable);
        findViewById.setOnClickListener(new C8987a(this));
        C16217b bVar2 = C16217b.f43438a;
        Context context = viewGroup.getContext();
        C16217b.m15108i(bVar2, context instanceof C0125s ? (C0125s) context : null, "anchorlive.bottom.connectmic", findViewById2, (View) null, (TextView) null, 24, (Object) null);
    }

    /* renamed from: a */
    public final void mo9798a() {
        Class cls = C54963d0.class;
        List<C54130j> list = ((C54963d0) this.f28394c.mo87696x0(cls)).f154071n;
        C87412m.m108593f(list, "basePlugin.business(Live…ass.java).linkMicUserList");
        if ((!list.isEmpty()) || ((C54963d0) this.f28394c.mo87696x0(cls)).mo75914V3() || ((C54963d0) this.f28394c.mo87696x0(cls)).mo75913U3()) {
            ImageView imageView = this.f28398g;
            Drawable drawable = this.f28392a.getContext().getResources().getDrawable(C0966R.raw.finder_icons_filled_link_mic);
            C74933u4.m89769f(drawable, this.f28392a.getContext().getResources().getColor(C0966R.color.UN_BW_0_Alpha_0_9));
            imageView.setImageDrawable(drawable);
            this.f28396e.setBackground(this.f28392a.getContext().getResources().getDrawable(C0966R.C0969drawable.a15));
            return;
        }
        ImageView imageView2 = this.f28398g;
        Drawable drawable2 = this.f28392a.getContext().getResources().getDrawable(C0966R.raw.finder_icons_filled_link_mic);
        C74933u4.m89769f(drawable2, -1);
        imageView2.setImageDrawable(drawable2);
        this.f28396e.setBackground(this.f28392a.getContext().getResources().getDrawable(C0966R.C0969drawable.f357183a14));
    }

    /* renamed from: b */
    public final void mo9799b() {
        Class cls = C54108o.class;
        Class cls2 = C54991o.class;
        if (((C54991o) this.f28394c.mo87696x0(cls2)).f154301c3) {
            this.f28392a.setVisibility(8);
            return;
        }
        if (C60251a.f171781k1 != null) {
            this.f28392a.setVisibility(8);
        } else if (C62042e.f176370a.mo87048V0(this.f28394c.mo87684A0()) || !((C54963d0) this.f28394c.mo87696x0(C54963d0.class)).mo75902I3() || ((C54991o) this.f28394c.mo87696x0(cls2)).mo75966J4() || !((C54991o) this.f28394c.mo87696x0(cls2)).mo75999e4()) {
            this.f28392a.setVisibility(8);
        } else {
            if (this.f28392a.getVisibility() != 0) {
                C7335d c = C86312j.m106911c(cls);
                C87412m.m108593f(c, "getService(HellLiveReport::class.java)");
                C8777j5.C8778a.m8608i((C8777j5) c, C54067f0.C0066n.LIVE_CALL, (Map) null, 2, (Object) null);
                ((C54108o) C86312j.m106911c(cls)).mo9602Jz(C54067f0.C0066n.WHEAT, ((C54108o) C86312j.m106911c(cls)).Ex0(C54067f0.C0062l.LIVING));
            }
            this.f28392a.setVisibility(0);
        }
    }
}
