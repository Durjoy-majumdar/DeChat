package il1;

import al1.C54130j;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.lifecycle.C39622i0;
import bl3.C39818r;
import cj1.C54733a1;
import cl1.C54963d0;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.live.view.FinderLiveApplyLinkAnchorView;
import com.tencent.p014mm.sdk.platformtools.Log;
import fj1.C45795b;
import gy3.C8480h;
import gy3.C87412m;
import ht1.C60200t1;
import j20.C117292a;
import java.util.ArrayList;
import k20.C60958c;
import k20.C9556a;
import k60.C60979d;
import pl1.C100810g0;
import pl1.C11978e0;
import pl1.C11990s0;
import pl1.C62345f;
import rx3.C13598b0;
import up1.C27696y;

/* renamed from: il1.f1 */
public final class C60394f1 {

    /* renamed from: a */
    public final ViewGroup f172199a;

    /* renamed from: b */
    public final String f172200b = "Finder.FinderLiveBattlePanelWidget";

    /* renamed from: c */
    public final ImageView f172201c;

    /* renamed from: d */
    public final TextView f172202d;

    /* renamed from: e */
    public final View f172203e;

    /* renamed from: f */
    public final View f172204f;

    /* renamed from: g */
    public final TextView f172205g;

    /* renamed from: h */
    public final View f172206h;

    /* renamed from: i */
    public final ProgressBar f172207i;

    /* renamed from: j */
    public C45795b f172208j;

    /* renamed from: k */
    public FinderLiveApplyLinkAnchorView.C55975c f172209k;

    /* renamed from: il1.f1$a */
    public static final class C60395a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C60394f1 f172210d;

        public C60395a(C60394f1 f1Var) {
            this.f172210d = f1Var;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/widget/FinderLiveBattlePanelWidget$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            FinderLiveApplyLinkAnchorView.C55975c cVar = this.f172210d.f172209k;
            if (cVar != null) {
                cVar.mo77786f();
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveBattlePanelWidget$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: il1.f1$b */
    public static final class C60396b implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C60394f1 f172211d;

        public C60396b(C60394f1 f1Var) {
            this.f172211d = f1Var;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x003a, code lost:
            r4 = r4.f154051E;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onClick(android.view.View r11) {
            /*
                r10 = this;
                ak1.g0 r1 = ak1.C0073g0.ANCHOR_BATTLE
                java.lang.Class<ak1.o> r0 = ak1.C54108o.class
                java.lang.Class<cl1.d0> r2 = cl1.C54963d0.class
                java.util.ArrayList r3 = new java.util.ArrayList
                r3.<init>()
                r3.add(r11)
                java.lang.Object[] r9 = r3.toArray()
                r3.clear()
                java.lang.String r4 = "com/tencent/mm/plugin/finder/live/widget/FinderLiveBattlePanelWidget$2"
                java.lang.String r5 = "android/view/View$OnClickListener"
                java.lang.String r6 = "onClick"
                java.lang.String r7 = "(Landroid/view/View;)V"
                r8 = r10
                j20.C117292a.m165356b(r4, r5, r6, r7, r8, r9)
                il1.f1 r11 = r10.f172211d
                java.lang.String r11 = r11.f172200b
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r4 = "curBattleStatus:"
                r3.append(r4)
                il1.f1 r4 = r10.f172211d
                androidx.lifecycle.i0 r4 = r4.mo85369a(r2)
                cl1.d0 r4 = (cl1.C54963d0) r4
                r5 = 0
                if (r4 == 0) goto L_0x0045
                cj1.a1 r4 = r4.f154051E
                if (r4 == 0) goto L_0x0045
                int r4 = r4.f153392e
                java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
                goto L_0x0046
            L_0x0045:
                r4 = r5
            L_0x0046:
                r3.append(r4)
                java.lang.String r3 = r3.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r3)
                il1.f1 r11 = r10.f172211d
                androidx.lifecycle.i0 r11 = r11.mo85369a(r2)
                cl1.d0 r11 = (cl1.C54963d0) r11
                if (r11 == 0) goto L_0x0065
                cj1.a1 r11 = r11.f154051E
                if (r11 == 0) goto L_0x0065
                int r11 = r11.f153392e
                java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
                goto L_0x0066
            L_0x0065:
                r11 = r5
            L_0x0066:
                java.lang.String r3 = "result"
                java.lang.String r4 = "type"
                java.lang.String r6 = "getService(HellLiveReport::class.java)"
                if (r11 != 0) goto L_0x0070
                goto L_0x00cb
            L_0x0070:
                int r7 = r11.intValue()
                if (r7 != 0) goto L_0x00cb
                ij1.b r11 = ij1.C60299b.f171929a
                java.lang.String r11 = "Finder.LinkMicTimeoutTimer"
                java.lang.String r7 = "stopApplyBattleTimer"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r7)
                ij1.b$b r11 = ij1.C60299b.f171934f
                com.tencent.p014mm.sdk.platformtools.MMHandlerThread.removeRunnable(r11)
                il1.f1 r11 = r10.f172211d
                com.tencent.mm.plugin.finder.live.view.FinderLiveApplyLinkAnchorView$c r11 = r11.f172209k
                if (r11 == 0) goto L_0x008e
                r11.mo77782b()
            L_0x008e:
                il1.f1 r11 = r10.f172211d
                r11.mo85371c()
                di3.d r11 = di3.C86312j.m106911c(r0)
                gy3.C87412m.m108593f(r11, r6)
                r0 = r11
                ht1.j5 r0 = (ht1.C8777j5) r0
                org.json.JSONObject r11 = new org.json.JSONObject
                r11.<init>()
                il1.f1 r6 = r10.f172211d
                r7 = 5
                java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
                r11.putOpt(r4, r7)
                androidx.lifecycle.i0 r2 = r6.mo85369a(r2)
                cl1.d0 r2 = (cl1.C54963d0) r2
                if (r2 == 0) goto L_0x00ba
                cj1.a1 r2 = r2.f154051E
                if (r2 == 0) goto L_0x00ba
                java.lang.String r5 = r2.f153388a
            L_0x00ba:
                r11.putOpt(r3, r5)
                rx3.b0 r2 = rx3.C13598b0.f38549a
                java.lang.String r2 = r11.toString()
                r3 = 0
                r4 = 4
                r5 = 0
                ht1.C8777j5.C8778a.m8605f(r0, r1, r2, r3, r4, r5)
                goto L_0x0143
            L_0x00cb:
                r7 = 1
                if (r11 != 0) goto L_0x00cf
                goto L_0x0115
            L_0x00cf:
                int r11 = r11.intValue()
                if (r11 != r7) goto L_0x0115
                il1.f1 r11 = r10.f172211d
                com.tencent.mm.plugin.finder.live.view.FinderLiveApplyLinkAnchorView$c r11 = r11.f172209k
                if (r11 == 0) goto L_0x00de
                r11.mo77785e()
            L_0x00de:
                di3.d r11 = di3.C86312j.m106911c(r0)
                gy3.C87412m.m108593f(r11, r6)
                r0 = r11
                ht1.j5 r0 = (ht1.C8777j5) r0
                org.json.JSONObject r11 = new org.json.JSONObject
                r11.<init>()
                il1.f1 r6 = r10.f172211d
                r7 = 4
                java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
                r11.putOpt(r4, r7)
                androidx.lifecycle.i0 r2 = r6.mo85369a(r2)
                cl1.d0 r2 = (cl1.C54963d0) r2
                if (r2 == 0) goto L_0x0105
                cj1.a1 r2 = r2.f154051E
                if (r2 == 0) goto L_0x0105
                java.lang.String r5 = r2.f153388a
            L_0x0105:
                r11.putOpt(r3, r5)
                rx3.b0 r2 = rx3.C13598b0.f38549a
                java.lang.String r2 = r11.toString()
                r3 = 0
                r4 = 4
                r5 = 0
                ht1.C8777j5.C8778a.m8605f(r0, r1, r2, r3, r4, r5)
                goto L_0x0143
            L_0x0115:
                il1.f1 r11 = r10.f172211d
                androidx.lifecycle.i0 r11 = r11.mo85369a(r2)
                cl1.d0 r11 = (cl1.C54963d0) r11
                if (r11 == 0) goto L_0x0129
                cj1.a1 r11 = r11.f154051E
                if (r11 == 0) goto L_0x0129
                int r11 = r11.f153392e
                r0 = 3
                if (r11 != r0) goto L_0x0129
                goto L_0x012a
            L_0x0129:
                r7 = 0
            L_0x012a:
                if (r7 == 0) goto L_0x0135
                il1.f1 r11 = r10.f172211d
                com.tencent.mm.plugin.finder.live.view.FinderLiveApplyLinkAnchorView$c r11 = r11.f172209k
                if (r11 == 0) goto L_0x0135
                r11.mo77783c()
            L_0x0135:
                il1.f1 r11 = r10.f172211d
                com.tencent.mm.plugin.finder.live.view.FinderLiveApplyLinkAnchorView$c r11 = r11.f172209k
                if (r11 == 0) goto L_0x013e
                r11.mo77787g()
            L_0x013e:
                il1.f1 r11 = r10.f172211d
                r11.mo85371c()
            L_0x0143:
                java.lang.String r11 = "com/tencent/mm/plugin/finder/live/widget/FinderLiveBattlePanelWidget$2"
                java.lang.String r0 = "android/view/View$OnClickListener"
                java.lang.String r1 = "onClick"
                java.lang.String r2 = "(Landroid/view/View;)V"
                j20.C117292a.m165361g(r10, r11, r0, r1, r2)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: il1.C60394f1.C60396b.onClick(android.view.View):void");
        }
    }

    public C60394f1(ViewGroup viewGroup) {
        C87412m.m108594g(viewGroup, "root");
        this.f172199a = viewGroup;
        this.f172201c = (ImageView) viewGroup.findViewById(C0966R.C0970id.deq);
        this.f172202d = (TextView) viewGroup.findViewById(C0966R.C0970id.df_);
        View findViewById = viewGroup.findViewById(C0966R.C0970id.deu);
        this.f172203e = findViewById;
        this.f172204f = viewGroup.findViewById(C0966R.C0970id.f358100dev);
        this.f172205g = (TextView) viewGroup.findViewById(C0966R.C0970id.dez);
        View findViewById2 = viewGroup.findViewById(C0966R.C0970id.f358101df0);
        this.f172206h = findViewById2;
        this.f172207i = (ProgressBar) viewGroup.findViewById(C0966R.C0970id.dey);
        findViewById2.setOnClickListener(new C60395a(this));
        findViewById.setOnClickListener(new C60396b(this));
    }

    /* renamed from: a */
    public final <T extends C39622i0> T mo85369a(Class<T> cls) {
        C45795b bVar = this.f172208j;
        if (bVar != null) {
            return bVar.mo71262a(cls);
        }
        return null;
    }

    /* renamed from: b */
    public final void mo85370b() {
        C13598b0 b0Var;
        C54130j jVar;
        C54733a1 a1Var;
        C54733a1 a1Var2;
        C54733a1 a1Var3;
        Class cls = C11990s0.class;
        Class<C60200t1> cls2 = C60200t1.class;
        Class cls3 = C54963d0.class;
        String str = this.f172200b;
        StringBuilder sb = new StringBuilder();
        sb.append("fillBattlePanel: curLinkMicUser:");
        C54963d0 d0Var = (C54963d0) mo85369a(cls3);
        sb.append(d0Var != null ? d0Var.f154073p : null);
        sb.append(", enableBattleSwitch:");
        C54963d0 d0Var2 = (C54963d0) mo85369a(cls3);
        sb.append(d0Var2 != null ? Boolean.valueOf(d0Var2.f154050D) : null);
        Log.m105924i(str, sb.toString());
        if (this.f172207i.getVisibility() != 0) {
            C54963d0 d0Var3 = (C54963d0) mo85369a(cls3);
            int i = 8;
            boolean z = true;
            if (d0Var3 == null || (jVar = d0Var3.f154073p) == null) {
                b0Var = null;
            } else {
                C54963d0 d0Var4 = (C54963d0) mo85369a(cls3);
                if ((d0Var4 == null || (a1Var3 = d0Var4.f154051E) == null || a1Var3.f153392e != 0) ? false : true) {
                    this.f172205g.setText(this.f172199a.getContext().getResources().getString(C0966R.string.dh6));
                    this.f172205g.setTextColor(this.f172199a.getContext().getResources().getColor(C0966R.color.f2966ao));
                    View view = this.f172204f;
                    C9556a aVar = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar.mo10233c(8);
                    View view2 = view;
                    C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveBattlePanelWidget", "fillBattlePanel", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                    C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/live/widget/FinderLiveBattlePanelWidget", "fillBattlePanel", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    View view3 = this.f172203e;
                    C9556a aVar2 = new C9556a();
                    aVar2.mo10233c(0);
                    View view4 = view3;
                    C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveBattlePanelWidget", "fillBattlePanel", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                    C117292a.m165359e(view4, "com/tencent/mm/plugin/finder/live/widget/FinderLiveBattlePanelWidget", "fillBattlePanel", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                } else {
                    C54963d0 d0Var5 = (C54963d0) mo85369a(cls3);
                    if ((d0Var5 == null || (a1Var2 = d0Var5.f154051E) == null || a1Var2.f153392e != 1) ? false : true) {
                        this.f172205g.setText(this.f172199a.getContext().getResources().getString(C0966R.string.dh4));
                        this.f172205g.setTextColor(this.f172199a.getContext().getResources().getColor(C0966R.color.FG_0));
                        View view5 = this.f172204f;
                        C9556a aVar3 = new C9556a();
                        ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                        aVar3.mo10233c(8);
                        View view6 = view5;
                        C117292a.m165358d(view6, aVar3.mo10232b(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveBattlePanelWidget", "fillBattlePanel", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view5.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                        C117292a.m165359e(view6, "com/tencent/mm/plugin/finder/live/widget/FinderLiveBattlePanelWidget", "fillBattlePanel", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        View view7 = this.f172203e;
                        C9556a aVar4 = new C9556a();
                        aVar4.mo10233c(0);
                        View view8 = view7;
                        C117292a.m165358d(view8, aVar4.mo10232b(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveBattlePanelWidget", "fillBattlePanel", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view7.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
                        C117292a.m165359e(view8, "com/tencent/mm/plugin/finder/live/widget/FinderLiveBattlePanelWidget", "fillBattlePanel", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    } else {
                        C54963d0 d0Var6 = (C54963d0) mo85369a(cls3);
                        if ((d0Var6 == null || (a1Var = d0Var6.f154051E) == null || a1Var.f153392e != 2) ? false : true) {
                            View view9 = this.f172204f;
                            C9556a aVar5 = new C9556a();
                            ThreadLocal<C9556a> threadLocal3 = C60958c.f173611a;
                            aVar5.mo10233c(0);
                            View view10 = view9;
                            C117292a.m165358d(view10, aVar5.mo10232b(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveBattlePanelWidget", "fillBattlePanel", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            view9.setVisibility(((Integer) aVar5.mo10231a(0)).intValue());
                            C117292a.m165359e(view10, "com/tencent/mm/plugin/finder/live/widget/FinderLiveBattlePanelWidget", "fillBattlePanel", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            View view11 = this.f172203e;
                            C9556a aVar6 = new C9556a();
                            aVar6.mo10233c(8);
                            View view12 = view11;
                            C117292a.m165358d(view12, aVar6.mo10232b(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveBattlePanelWidget", "fillBattlePanel", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            view11.setVisibility(((Integer) aVar6.mo10231a(0)).intValue());
                            C117292a.m165359e(view12, "com/tencent/mm/plugin/finder/live/widget/FinderLiveBattlePanelWidget", "fillBattlePanel", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        } else {
                            this.f172205g.setText(this.f172199a.getContext().getResources().getString(C0966R.string.dh5));
                            this.f172205g.setTextColor(this.f172199a.getContext().getResources().getColor(C0966R.color.FG_0));
                            View view13 = this.f172204f;
                            C9556a aVar7 = new C9556a();
                            ThreadLocal<C9556a> threadLocal4 = C60958c.f173611a;
                            aVar7.mo10233c(8);
                            View view14 = view13;
                            C117292a.m165358d(view14, aVar7.mo10232b(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveBattlePanelWidget", "fillBattlePanel", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            view13.setVisibility(((Integer) aVar7.mo10231a(0)).intValue());
                            C117292a.m165359e(view14, "com/tencent/mm/plugin/finder/live/widget/FinderLiveBattlePanelWidget", "fillBattlePanel", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            View view15 = this.f172203e;
                            C9556a aVar8 = new C9556a();
                            aVar8.mo10233c(0);
                            View view16 = view15;
                            C117292a.m165358d(view16, aVar8.mo10232b(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveBattlePanelWidget", "fillBattlePanel", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            view15.setVisibility(((Integer) aVar8.mo10231a(0)).intValue());
                            C117292a.m165359e(view16, "com/tencent/mm/plugin/finder/live/widget/FinderLiveBattlePanelWidget", "fillBattlePanel", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        }
                    }
                }
                C54963d0 d0Var7 = (C54963d0) mo85369a(cls3);
                if (!(d0Var7 != null && d0Var7.f154050D)) {
                    View view17 = this.f172204f;
                    C9556a aVar9 = new C9556a();
                    aVar9.mo10233c(8);
                    View view18 = view17;
                    C117292a.m165358d(view18, aVar9.mo10232b(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveBattlePanelWidget", "fillBattlePanel", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view17.setVisibility(((Integer) aVar9.mo10231a(0)).intValue());
                    C117292a.m165359e(view18, "com/tencent/mm/plugin/finder/live/widget/FinderLiveBattlePanelWidget", "fillBattlePanel", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    View view19 = this.f172203e;
                    C9556a aVar10 = new C9556a();
                    aVar10.mo10233c(8);
                    View view20 = view19;
                    C117292a.m165358d(view20, aVar10.mo10232b(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveBattlePanelWidget", "fillBattlePanel", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view19.setVisibility(((Integer) aVar10.mo10231a(0)).intValue());
                    C117292a.m165359e(view20, "com/tencent/mm/plugin/finder/live/widget/FinderLiveBattlePanelWidget", "fillBattlePanel", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                this.f172202d.setText(this.f172199a.getContext().getResources().getString(C0966R.string.dh9, new Object[]{jVar.f152000d}));
                C60979d<C100810g0> i2 = ((C11990s0) C39818r.f106831a.mo62446e(cls2).mo62447c(cls)).mo11872i2();
                C62345f fVar = new C62345f(jVar.f151998b, (C27696y) null, 2, (C8480h) null);
                ImageView imageView = this.f172201c;
                C87412m.m108593f(imageView, "avatar");
                i2.mo85957c(fVar, imageView, ((C11990s0) C39818r.f106831a.mo62446e(cls2).mo62447c(cls)).mo11867O2(C11978e0.C11979a.AVATAR));
                b0Var = C13598b0.f38549a;
            }
            if (b0Var == null) {
                this.f172205g.setText(this.f172199a.getContext().getResources().getString(C0966R.string.dh5));
                this.f172205g.setTextColor(this.f172199a.getContext().getResources().getColor(C0966R.color.FG_0));
                View view21 = this.f172204f;
                C9556a aVar11 = new C9556a();
                ThreadLocal<C9556a> threadLocal5 = C60958c.f173611a;
                aVar11.mo10233c(8);
                View view22 = view21;
                C117292a.m165358d(view22, aVar11.mo10232b(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveBattlePanelWidget", "fillBattlePanel", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view21.setVisibility(((Integer) aVar11.mo10231a(0)).intValue());
                C117292a.m165359e(view22, "com/tencent/mm/plugin/finder/live/widget/FinderLiveBattlePanelWidget", "fillBattlePanel", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                View view23 = this.f172203e;
                C54963d0 d0Var8 = (C54963d0) mo85369a(cls3);
                if (d0Var8 == null || !d0Var8.f154050D) {
                    z = false;
                }
                if (z) {
                    i = 0;
                }
                C9556a aVar12 = new C9556a();
                aVar12.mo10233c(Integer.valueOf(i));
                View view24 = view23;
                C117292a.m165358d(view24, aVar12.mo10232b(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveBattlePanelWidget", "fillBattlePanel", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view23.setVisibility(((Integer) aVar12.mo10231a(0)).intValue());
                C117292a.m165359e(view24, "com/tencent/mm/plugin/finder/live/widget/FinderLiveBattlePanelWidget", "fillBattlePanel", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
    }

    /* renamed from: c */
    public final void mo85371c() {
        this.f172207i.setVisibility(0);
        View view = this.f172204f;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveBattlePanelWidget", "showProgressBar", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/finder/live/widget/FinderLiveBattlePanelWidget", "showProgressBar", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        View view2 = this.f172203e;
        C9556a aVar2 = new C9556a();
        aVar2.mo10233c(8);
        View view3 = view2;
        C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveBattlePanelWidget", "showProgressBar", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
        C117292a.m165359e(view3, "com/tencent/mm/plugin/finder/live/widget/FinderLiveBattlePanelWidget", "showProgressBar", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
