package qj1;

import al1.C54130j;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import cj1.C54733a1;
import cl1.C54963d0;
import cl1.C54991o;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.xweb.file.XVFSFile;
import com.tencent.xweb.util.WXWebReporter;
import d60.C58124b;
import fe1.C58961d;
import fe1.C58969q;
import fy3.C32224a;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import il1.C46272x0;
import il1.C46275z0;
import il1.C60340a1;
import il1.C60346b1;
import il1.C60352c1;
import il1.C60383d1;
import il1.C60535v0;
import j20.C117292a;
import java.util.LinkedHashMap;
import k20.C60958c;
import k20.C9556a;
import k60.C60979d;
import nj3.C76912y0;
import o40.C61926c;
import pl1.C100810g0;
import pl1.C11978e0;
import pl1.C62345f;
import rx3.C13598b0;
import te3.C49712hj1;
import up1.C27696y;
import y50.C15936n0;

/* renamed from: qj1.y3 */
public final class C63118y3 extends C62660c {

    /* renamed from: p */
    public final C58124b f179110p;

    /* renamed from: q */
    public final String f179111q = "FinderLiveBattleInfoPlugin";

    /* renamed from: r */
    public final C60535v0 f179112r;

    /* renamed from: s */
    public final C60352c1 f179113s;

    /* renamed from: qj1.y3$a */
    public static final class C63119a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C63118y3 f179114d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C63119a(C63118y3 y3Var) {
            super(0);
            this.f179114d = y3Var;
        }

        public Object invoke() {
            this.f179114d.mo88046c1();
            return C13598b0.f38549a;
        }
    }

    /* renamed from: qj1.y3$b */
    public static final class C63120b extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C63118y3 f179115d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C63120b(C63118y3 y3Var) {
            super(0);
            this.f179115d = y3Var;
        }

        public Object invoke() {
            Log.m105924i(this.f179115d.f179111q, "releaseBattle");
            C60535v0 v0Var = this.f179115d.f179112r;
            v0Var.getClass();
            C61926c.m72668M(new C46275z0(v0Var, (C32224a<C13598b0>) null));
            C61926c.m72668M(new C46272x0(v0Var, (C32224a<C13598b0>) null));
            v0Var.mo85502a(8);
            C60352c1 c1Var = this.f179115d.f179113s;
            c1Var.f172033H = 0;
            c1Var.f172048m.stop();
            c1Var.f172049n.stop();
            c1Var.mo85317a(8);
            c1Var.f172035J.stopTimer();
            this.f179115d.mo10792g(8);
            ((C54963d0) this.f179115d.mo87696x0(C54963d0.class)).f154051E = null;
            return C13598b0.f38549a;
        }
    }

    /* renamed from: qj1.y3$c */
    public static final class C63121c extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C63118y3 f179116d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C63121c(C63118y3 y3Var) {
            super(0);
            this.f179116d = y3Var;
        }

        public Object invoke() {
            this.f179116d.mo10792g(8);
            ((C54963d0) this.f179116d.mo87696x0(C54963d0.class)).f154051E = null;
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C63118y3(ViewGroup viewGroup, C58124b bVar) {
        super(viewGroup, bVar, (C49712hj1) null);
        C87412m.m108594g(viewGroup, "root");
        C87412m.m108594g(bVar, "statusMonitor");
        this.f179110p = bVar;
        View findViewById = viewGroup.findViewById(C0966R.C0970id.dfa);
        C87412m.m108593f(findViewById, "root.findViewById<Relati…_live_battle_tip_ui_root)");
        this.f179112r = new C60535v0((ViewGroup) findViewById, bVar, this);
        View findViewById2 = viewGroup.findViewById(C0966R.C0970id.dfi);
        C87412m.m108593f(findViewById2, "root.findViewById<Relati…_battle_top_info_ui_root)");
        this.f179113s = new C60352c1((ViewGroup) findViewById2, bVar, this);
        new C63119a(this);
        mo10792g(8);
    }

    /* renamed from: I0 */
    public void mo12076I0(boolean z) {
        if (z) {
            this.f179113s.f172036a.setVisibility(8);
            return;
        }
        C60352c1 c1Var = this.f179113s;
        c1Var.mo85317a(c1Var.f172034I);
    }

    /* JADX WARNING: Removed duplicated region for block: B:111:0x02c7  */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x02c9  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x02cc  */
    /* JADX WARNING: Removed duplicated region for block: B:119:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0166  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x016d  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0177  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x01b0  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x023e  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0245  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x024f  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x025b  */
    /* renamed from: Z0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo88043Z0(boolean r15) {
        /*
            r14 = this;
            r0 = 0
            r14.mo10792g(r0)
            il1.v0 r1 = r14.f179112r
            r2 = 8
            r1.mo85502a(r2)
            il1.c1 r1 = r14.f179113s
            r1.mo85317a(r0)
            il1.c1 r1 = r14.f179113s
            java.lang.Class<cl1.d0> r3 = cl1.C54963d0.class
            java.lang.String r4 = r1.f172039d
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "battleEnd curBattle:"
            r5.append(r6)
            qj1.c r6 = r1.f172038c
            androidx.lifecycle.i0 r6 = r6.mo87696x0(r3)
            cl1.d0 r6 = (cl1.C54963d0) r6
            cj1.a1 r6 = r6.f154051E
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r5)
            android.widget.TextView r4 = r1.f172026A
            y50.n0$a r5 = y50.C15936n0.f42815a
            java.lang.String r6 = ":"
            java.lang.String r5 = r5.mo14587b(r0, r6)
            r4.setText(r5)
            com.tencent.mm.sdk.platformtools.MTimerHandler r4 = r1.f172035J
            r4.stopTimer()
            qj1.c r4 = r1.f172038c
            androidx.lifecycle.i0 r4 = r4.mo87696x0(r3)
            cl1.d0 r4 = (cl1.C54963d0) r4
            cj1.a1 r4 = r4.f154051E
            if (r4 == 0) goto L_0x0337
            android.view.View r4 = r1.f172061z
            k20.a r13 = new k20.a
            r13.<init>()
            java.lang.ThreadLocal<k20.a> r5 = k20.C60958c.f173611a
            java.lang.Integer r5 = java.lang.Integer.valueOf(r2)
            r13.mo10233c(r5)
            java.lang.Object[] r6 = r13.mo10232b()
            java.lang.String r7 = "com/tencent/mm/plugin/finder/live/widget/FinderLiveBattleBarWidget"
            java.lang.String r8 = "battleEnd"
            java.lang.String r9 = "(Z)V"
            java.lang.String r10 = "android/view/View_EXEC_"
            java.lang.String r11 = "setVisibility"
            java.lang.String r12 = "(I)V"
            r5 = r4
            j20.C117292a.m165358d(r5, r6, r7, r8, r9, r10, r11, r12)
            java.lang.Object r5 = r13.mo10231a(r0)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            r4.setVisibility(r5)
            java.lang.String r6 = "com/tencent/mm/plugin/finder/live/widget/FinderLiveBattleBarWidget"
            java.lang.String r7 = "battleEnd"
            java.lang.String r8 = "(Z)V"
            java.lang.String r9 = "android/view/View_EXEC_"
            java.lang.String r10 = "setVisibility"
            java.lang.String r11 = "(I)V"
            r5 = r4
            j20.C117292a.m165359e(r5, r6, r7, r8, r9, r10, r11)
            int r4 = r1.f172046k
            r1.f172033H = r4
            if (r15 != 0) goto L_0x00db
            android.view.View r15 = r1.f172051p
            k20.a r4 = new k20.a
            r4.<init>()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r0)
            r4.mo10233c(r5)
            java.lang.Object[] r6 = r4.mo10232b()
            java.lang.String r7 = "com/tencent/mm/plugin/finder/live/widget/FinderLiveBattleBarWidget"
            java.lang.String r8 = "battleEnd"
            java.lang.String r9 = "(Z)V"
            java.lang.String r10 = "android/view/View_EXEC_"
            java.lang.String r11 = "setVisibility"
            java.lang.String r12 = "(I)V"
            r5 = r15
            j20.C117292a.m165358d(r5, r6, r7, r8, r9, r10, r11, r12)
            java.lang.Object r4 = r4.mo10231a(r0)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            r15.setVisibility(r4)
            java.lang.String r6 = "com/tencent/mm/plugin/finder/live/widget/FinderLiveBattleBarWidget"
            java.lang.String r7 = "battleEnd"
            java.lang.String r8 = "(Z)V"
            java.lang.String r9 = "android/view/View_EXEC_"
            java.lang.String r10 = "setVisibility"
            java.lang.String r11 = "(I)V"
            j20.C117292a.m165359e(r5, r6, r7, r8, r9, r10, r11)
        L_0x00db:
            java.lang.Class<cl1.o> r15 = cl1.C54991o.class
            qj1.c r4 = r1.f172038c
            androidx.lifecycle.i0 r4 = r4.mo87696x0(r3)
            cl1.d0 r4 = (cl1.C54963d0) r4
            cj1.a1 r4 = r4.f154051E
            r5 = 0
            if (r4 == 0) goto L_0x00f9
            qj1.c r6 = r1.f172038c
            androidx.lifecycle.i0 r6 = r6.mo87696x0(r15)
            cl1.o r6 = (cl1.C54991o) r6
            java.lang.String r6 = r6.f154345o
            al1.g r4 = r4.mo75624c(r6)
            goto L_0x00fa
        L_0x00f9:
            r4 = r5
        L_0x00fa:
            qj1.c r6 = r1.f172038c
            androidx.lifecycle.i0 r6 = r6.mo87696x0(r3)
            cl1.d0 r6 = (cl1.C54963d0) r6
            cj1.a1 r6 = r6.f154051E
            if (r6 == 0) goto L_0x0115
            qj1.c r7 = r1.f172038c
            androidx.lifecycle.i0 r15 = r7.mo87696x0(r15)
            cl1.o r15 = (cl1.C54991o) r15
            java.lang.String r15 = r15.f154345o
            al1.g r15 = r6.mo75623b(r15)
            goto L_0x0116
        L_0x0115:
            r15 = r5
        L_0x0116:
            qj1.c r6 = r1.f172038c
            androidx.lifecycle.i0 r6 = r6.mo87696x0(r3)
            cl1.d0 r6 = (cl1.C54963d0) r6
            cj1.a1 r6 = r6.f154051E
            if (r6 == 0) goto L_0x0129
            int r6 = r6.f153391d
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            goto L_0x012a
        L_0x0129:
            r6 = r5
        L_0x012a:
            r7 = 3
            r8 = 2
            r9 = 1
            if (r6 != 0) goto L_0x0130
            goto L_0x013b
        L_0x0130:
            int r10 = r6.intValue()
            if (r10 != r8) goto L_0x013b
            if (r15 == 0) goto L_0x0159
            int r15 = r15.f151975c
            goto L_0x015a
        L_0x013b:
            if (r6 != 0) goto L_0x013e
            goto L_0x0149
        L_0x013e:
            int r15 = r6.intValue()
            if (r15 != r9) goto L_0x0149
            if (r4 == 0) goto L_0x0159
            int r15 = r4.f151975c
            goto L_0x015a
        L_0x0149:
            if (r6 != 0) goto L_0x014c
            goto L_0x0153
        L_0x014c:
            int r15 = r6.intValue()
            if (r15 != r7) goto L_0x0153
            goto L_0x0159
        L_0x0153:
            if (r6 != 0) goto L_0x0156
            goto L_0x0159
        L_0x0156:
            r6.intValue()
        L_0x0159:
            r15 = 0
        L_0x015a:
            qj1.c r4 = r1.f172038c
            androidx.lifecycle.i0 r4 = r4.mo87696x0(r3)
            cl1.d0 r4 = (cl1.C54963d0) r4
            cj1.a1 r4 = r4.f154051E
            if (r4 == 0) goto L_0x016d
            int r4 = r4.f153391d
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            goto L_0x016e
        L_0x016d:
            r4 = r5
        L_0x016e:
            if (r4 != 0) goto L_0x0171
            goto L_0x01b0
        L_0x0171:
            int r6 = r4.intValue()
            if (r6 != r8) goto L_0x01b0
            org.libpag.PAGView r4 = r1.f172049n
            r4.setVisibility(r0)
            org.libpag.PAGView r4 = r1.f172049n
            android.view.ViewGroup$LayoutParams r4 = r4.getLayoutParams()
            boolean r4 = r4 instanceof android.widget.RelativeLayout.LayoutParams
            if (r4 == 0) goto L_0x0232
            org.libpag.PAGView r4 = r1.f172049n
            android.view.ViewGroup$LayoutParams r4 = r4.getLayoutParams()
            boolean r6 = r4 instanceof android.widget.RelativeLayout.LayoutParams
            if (r6 == 0) goto L_0x0193
            android.widget.RelativeLayout$LayoutParams r4 = (android.widget.RelativeLayout.LayoutParams) r4
            goto L_0x0194
        L_0x0193:
            r4 = r5
        L_0x0194:
            if (r4 != 0) goto L_0x0197
            goto L_0x01a9
        L_0x0197:
            qj1.c r6 = r1.f172038c
            android.view.ViewGroup r6 = r6.f166287d
            android.content.Context r6 = r6.getContext()
            android.graphics.Point r6 = com.tencent.p014mm.p136ui.C75044y4.m89990b(r6)
            int r6 = r6.x
            int r6 = r6 / r8
            r4.setMarginStart(r6)
        L_0x01a9:
            org.libpag.PAGView r4 = r1.f172049n
            r4.requestLayout()
            goto L_0x0232
        L_0x01b0:
            if (r4 != 0) goto L_0x01b3
            goto L_0x01e2
        L_0x01b3:
            int r6 = r4.intValue()
            if (r6 != r9) goto L_0x01e2
            org.libpag.PAGView r4 = r1.f172049n
            r4.setVisibility(r0)
            org.libpag.PAGView r4 = r1.f172049n
            android.view.ViewGroup$LayoutParams r4 = r4.getLayoutParams()
            boolean r4 = r4 instanceof android.widget.RelativeLayout.LayoutParams
            if (r4 == 0) goto L_0x0232
            org.libpag.PAGView r4 = r1.f172049n
            android.view.ViewGroup$LayoutParams r4 = r4.getLayoutParams()
            boolean r6 = r4 instanceof android.widget.RelativeLayout.LayoutParams
            if (r6 == 0) goto L_0x01d5
            android.widget.RelativeLayout$LayoutParams r4 = (android.widget.RelativeLayout.LayoutParams) r4
            goto L_0x01d6
        L_0x01d5:
            r4 = r5
        L_0x01d6:
            if (r4 != 0) goto L_0x01d9
            goto L_0x01dc
        L_0x01d9:
            r4.setMarginStart(r0)
        L_0x01dc:
            org.libpag.PAGView r4 = r1.f172049n
            r4.requestLayout()
            goto L_0x0232
        L_0x01e2:
            if (r4 != 0) goto L_0x01e5
            goto L_0x0232
        L_0x01e5:
            int r4 = r4.intValue()
            if (r4 != r7) goto L_0x0232
            org.libpag.PAGView r4 = r1.f172049n
            r4.setVisibility(r0)
            org.libpag.PAGView r4 = r1.f172049n
            android.view.ViewGroup$LayoutParams r4 = r4.getLayoutParams()
            boolean r4 = r4 instanceof android.widget.RelativeLayout.LayoutParams
            if (r4 == 0) goto L_0x0232
            org.libpag.PAGView r4 = r1.f172049n
            android.view.ViewGroup$LayoutParams r4 = r4.getLayoutParams()
            boolean r6 = r4 instanceof android.widget.RelativeLayout.LayoutParams
            if (r6 == 0) goto L_0x0207
            android.widget.RelativeLayout$LayoutParams r4 = (android.widget.RelativeLayout.LayoutParams) r4
            goto L_0x0208
        L_0x0207:
            r4 = r5
        L_0x0208:
            if (r4 != 0) goto L_0x020b
            goto L_0x022d
        L_0x020b:
            qj1.c r6 = r1.f172038c
            android.view.ViewGroup r6 = r6.f166287d
            android.content.Context r6 = r6.getContext()
            android.graphics.Point r6 = com.tencent.p014mm.p136ui.C75044y4.m89990b(r6)
            int r6 = r6.x
            int r6 = r6 / r8
            qj1.c r10 = r1.f172038c
            android.view.ViewGroup r10 = r10.f166287d
            android.content.Context r10 = r10.getContext()
            r11 = 104(0x68, float:1.46E-43)
            int r10 = com.tencent.p014mm.p136ui.C74942w4.m89784a(r10, r11)
            int r10 = r10 / r8
            int r6 = r6 - r10
            r4.setMarginStart(r6)
        L_0x022d:
            org.libpag.PAGView r4 = r1.f172049n
            r4.requestLayout()
        L_0x0232:
            qj1.c r4 = r1.f172038c
            androidx.lifecycle.i0 r3 = r4.mo87696x0(r3)
            cl1.d0 r3 = (cl1.C54963d0) r3
            cj1.a1 r3 = r3.f154051E
            if (r3 == 0) goto L_0x0245
            int r3 = r3.f153391d
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            goto L_0x0246
        L_0x0245:
            r3 = r5
        L_0x0246:
            if (r3 != 0) goto L_0x0249
            goto L_0x025b
        L_0x0249:
            int r4 = r3.intValue()
            if (r4 != r8) goto L_0x025b
            boolean r3 = com.tencent.p014mm.sdk.platformtools.LocaleUtil.isChineseAppLang()
            if (r3 == 0) goto L_0x0258
            java.lang.String r3 = r1.f172040e
            goto L_0x029b
        L_0x0258:
            java.lang.String r3 = r1.f172041f
            goto L_0x029b
        L_0x025b:
            if (r3 != 0) goto L_0x025e
            goto L_0x027e
        L_0x025e:
            int r4 = r3.intValue()
            if (r4 != r9) goto L_0x027e
            if (r15 <= r9) goto L_0x0272
            boolean r3 = com.tencent.p014mm.sdk.platformtools.LocaleUtil.isChineseAppLang()
            if (r3 == 0) goto L_0x026f
            java.lang.String r3 = r1.f172044i
            goto L_0x029b
        L_0x026f:
            java.lang.String r3 = r1.f172045j
            goto L_0x029b
        L_0x0272:
            boolean r3 = com.tencent.p014mm.sdk.platformtools.LocaleUtil.isChineseAppLang()
            if (r3 == 0) goto L_0x027b
            java.lang.String r3 = r1.f172040e
            goto L_0x029b
        L_0x027b:
            java.lang.String r3 = r1.f172041f
            goto L_0x029b
        L_0x027e:
            if (r3 != 0) goto L_0x0281
            goto L_0x0293
        L_0x0281:
            int r4 = r3.intValue()
            if (r4 != r7) goto L_0x0293
            boolean r3 = com.tencent.p014mm.sdk.platformtools.LocaleUtil.isChineseAppLang()
            if (r3 == 0) goto L_0x0290
            java.lang.String r3 = r1.f172042g
            goto L_0x029b
        L_0x0290:
            java.lang.String r3 = r1.f172043h
            goto L_0x029b
        L_0x0293:
            if (r3 != 0) goto L_0x0296
            goto L_0x0299
        L_0x0296:
            r3.intValue()
        L_0x0299:
            java.lang.String r3 = ""
        L_0x029b:
            java.lang.String r4 = r1.f172039d
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "battleEnd pagRes:"
            r6.append(r7)
            r6.append(r3)
            java.lang.String r7 = ", winningStreakCount:"
            r6.append(r7)
            r6.append(r15)
            java.lang.String r6 = r6.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r6)
            android.widget.TextView r4 = r1.f172050o
            r4.setVisibility(r2)
            if (r3 == 0) goto L_0x02c9
            int r2 = r3.length()
            if (r2 != 0) goto L_0x02c7
            goto L_0x02c9
        L_0x02c7:
            r2 = 0
            goto L_0x02ca
        L_0x02c9:
            r2 = 1
        L_0x02ca:
            if (r2 != 0) goto L_0x0337
            org.libpag.PAGView r2 = r1.f172049n
            android.view.ViewGroup r4 = r1.f172036a
            android.content.Context r4 = r4.getContext()
            android.content.res.AssetManager r4 = r4.getAssets()
            org.libpag.PAGFile r3 = org.libpag.PAGFile.Load(r4, r3)
            r2.setComposition(r3)
            org.libpag.PAGView r2 = r1.f172049n
            r2.setVisibility(r0)
            org.libpag.PAGView r2 = r1.f172049n
            r2.play()
            org.libpag.PAGView r2 = r1.f172049n
            r2.flush()
            if (r15 <= r9) goto L_0x0337
            android.widget.TextView r2 = r1.f172050o
            r2.setVisibility(r0)
            android.widget.TextView r0 = r1.f172050o
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r3 = 120(0x78, float:1.68E-43)
            r2.append(r3)
            r2.append(r15)
            java.lang.String r15 = r2.toString()
            r0.setText(r15)
            android.widget.TextView r15 = r1.f172050o
            r0 = 0
            r15.setAlpha(r0)
            android.widget.TextView r15 = r1.f172050o
            android.view.ViewPropertyAnimator r15 = r15.animate()
            r0 = 1065353216(0x3f800000, float:1.0)
            android.view.ViewPropertyAnimator r15 = r15.alpha(r0)
            android.view.ViewPropertyAnimator r15 = r15.setListener(r5)
            r0 = 500(0x1f4, double:2.47E-321)
            android.view.ViewPropertyAnimator r15 = r15.setDuration(r0)
            android.view.animation.AccelerateInterpolator r2 = new android.view.animation.AccelerateInterpolator
            r2.<init>()
            android.view.ViewPropertyAnimator r15 = r15.setInterpolator(r2)
            android.view.ViewPropertyAnimator r15 = r15.setStartDelay(r0)
            r15.start()
        L_0x0337:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: qj1.C63118y3.mo88043Z0(boolean):void");
    }

    /* renamed from: a1 */
    public final void mo88044a1(boolean z) {
        boolean z2 = z;
        mo10792g(0);
        C60535v0 v0Var = this.f179112r;
        v0Var.getClass();
        C61926c.m72668M(new C46275z0(v0Var, (C32224a<C13598b0>) null));
        C61926c.m72668M(new C46272x0(v0Var, (C32224a<C13598b0>) null));
        v0Var.mo85502a(8);
        this.f179113s.mo85317a(0);
        C60352c1 c1Var = this.f179113s;
        Class cls = C54963d0.class;
        String str = c1Var.f172039d;
        Log.m105924i(str, "battleStart withAnim:" + z2);
        c1Var.f172033H = 0;
        c1Var.f172049n.setVisibility(8);
        c1Var.f172050o.setVisibility(8);
        View view = c1Var.f172051p;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        View view2 = view;
        C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveBattleBarWidget", "battleStart", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/live/widget/FinderLiveBattleBarWidget", "battleStart", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        View view3 = c1Var.f172061z;
        C9556a aVar2 = new C9556a();
        aVar2.mo10233c(8);
        View view4 = view3;
        C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveBattleBarWidget", "battleStart", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
        C117292a.m165359e(view4, "com/tencent/mm/plugin/finder/live/widget/FinderLiveBattleBarWidget", "battleStart", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        c1Var.f172035J.stopTimer();
        c1Var.f172035J.startTimer(1000, 1000);
        TextView textView = c1Var.f172026A;
        C15936n0.C15937a aVar3 = C15936n0.f42815a;
        C54733a1 a1Var = ((C54963d0) c1Var.f172038c.mo87696x0(cls)).f154051E;
        textView.setText(aVar3.mo14587b(a1Var != null ? a1Var.f153390c : 0, XVFSFile.PATH_SEPARATOR));
        if (z2) {
            Class cls2 = C54991o.class;
            C58961d.C58963b bVar = C58961d.f168673a;
            C58969q b = bVar.mo84155b(((C54991o) c1Var.f172038c.mo87696x0(cls2)).f154345o);
            String avatarUrl = b != null ? b.getAvatarUrl() : null;
            C54130j jVar = ((C54963d0) c1Var.f172038c.mo87696x0(cls)).f154073p;
            String str2 = jVar != null ? jVar.f151998b : null;
            C58969q b2 = bVar.mo84155b(((C54991o) c1Var.f172038c.mo87696x0(cls2)).f154345o);
            String nickname = b2 != null ? b2.getNickname() : null;
            C54130j jVar2 = ((C54963d0) c1Var.f172038c.mo87696x0(cls)).f154073p;
            String str3 = jVar2 != null ? jVar2.f152000d : null;
            C11978e0 e0Var = C11978e0.f34938a;
            C60979d<C100810g0> a = e0Var.mo11849a();
            C62345f fVar = new C62345f(avatarUrl, (C27696y) null, 2, (C8480h) null);
            ImageView imageView = c1Var.f172055t;
            C87412m.m108593f(imageView, "battleStartSelfUserAvatar");
            C11978e0.C11979a aVar4 = C11978e0.C11979a.AVATAR;
            a.mo85957c(fVar, imageView, e0Var.mo11851c(aVar4));
            C60979d<C100810g0> a2 = e0Var.mo11849a();
            C62345f fVar2 = new C62345f(str2, (C27696y) null, 2, (C8480h) null);
            ImageView imageView2 = c1Var.f172058w;
            C87412m.m108593f(imageView2, "battleStartOtherUserAvatar");
            a2.mo85957c(fVar2, imageView2, e0Var.mo11851c(aVar4));
            c1Var.f172056u.setText(nickname);
            c1Var.f172059x.setText(str3);
            String str4 = c1Var.f172039d;
            Log.m105924i(str4, "selfAvatar:" + avatarUrl + " otherAvatarUrl:" + str2 + " selfNickname:" + nickname + " otherNickname:" + str3);
            c1Var.f172048m.setVisibility(0);
            c1Var.f172048m.post(new C60383d1(c1Var));
            return;
        }
        View view5 = c1Var.f172053r;
        C9556a aVar5 = new C9556a();
        aVar5.mo10233c(8);
        View view6 = view5;
        C117292a.m165358d(view6, aVar5.mo10232b(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveBattleBarWidget", "battleStart", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view5.setVisibility(((Integer) aVar5.mo10231a(0)).intValue());
        C117292a.m165359e(view6, "com/tencent/mm/plugin/finder/live/widget/FinderLiveBattleBarWidget", "battleStart", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        c1Var.f172048m.setVisibility(8);
        View view7 = c1Var.f172051p;
        C9556a aVar6 = new C9556a();
        aVar6.mo10233c(0);
        View view8 = view7;
        C117292a.m165358d(view8, aVar6.mo10232b(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveBattleBarWidget", "battleStart", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view7.setVisibility(((Integer) aVar6.mo10231a(0)).intValue());
        C117292a.m165359e(view8, "com/tencent/mm/plugin/finder/live/widget/FinderLiveBattleBarWidget", "battleStart", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        View view9 = c1Var.f172061z;
        C9556a aVar7 = new C9556a();
        aVar7.mo10233c(0);
        View view10 = view9;
        C117292a.m165358d(view10, aVar7.mo10232b(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveBattleBarWidget", "battleStart", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view9.setVisibility(((Integer) aVar7.mo10231a(0)).intValue());
        C117292a.m165359e(view10, "com/tencent/mm/plugin/finder/live/widget/FinderLiveBattleBarWidget", "battleStart", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        View view11 = c1Var.f172027B;
        C9556a aVar8 = new C9556a();
        aVar8.mo10233c(0);
        View view12 = view11;
        C117292a.m165358d(view12, aVar8.mo10232b(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveBattleBarWidget", "battleStart", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view11.setVisibility(((Integer) aVar8.mo10231a(0)).intValue());
        C117292a.m165359e(view12, "com/tencent/mm/plugin/finder/live/widget/FinderLiveBattleBarWidget", "battleStart", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        View view13 = c1Var.f172028C;
        C9556a aVar9 = new C9556a();
        aVar9.mo10233c(8);
        View view14 = view13;
        C117292a.m165358d(view14, aVar9.mo10232b(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveBattleBarWidget", "battleStart", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view13.setVisibility(((Integer) aVar9.mo10231a(0)).intValue());
        C117292a.m165359e(view14, "com/tencent/mm/plugin/finder/live/widget/FinderLiveBattleBarWidget", "battleStart", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    /* renamed from: b */
    public boolean mo3200b() {
        return false;
    }

    /* renamed from: b1 */
    public final void mo88045b1() {
        Class cls = C54963d0.class;
        String str = this.f179111q;
        StringBuilder sb = new StringBuilder();
        sb.append("checkNeedRelease isPk: ");
        C54130j jVar = ((C54963d0) mo87696x0(cls)).f154073p;
        sb.append(jVar != null ? Boolean.valueOf(jVar.f152004h) : null);
        Log.m105924i(str, sb.toString());
        C54130j jVar2 = ((C54963d0) mo87696x0(cls)).f154073p;
        boolean z = true;
        if (jVar2 == null || !jVar2.f152004h) {
            z = false;
        }
        if (!z) {
            mo88046c1();
        }
    }

    /* renamed from: c1 */
    public final void mo88046c1() {
        C61926c.m72668M(new C63120b(this));
    }

    /* renamed from: d1 */
    public final void mo88047d1() {
        Class cls = C54963d0.class;
        String str = this.f179111q;
        Log.m105924i(str, "restoreBattleInfo curBattle:" + ((C54963d0) mo87696x0(cls)).f154051E);
        C54733a1 a1Var = ((C54963d0) mo87696x0(cls)).f154051E;
        if (a1Var != null) {
            int i = a1Var.f153392e;
            if (i == 0) {
                mo88049f1();
            } else if (i == 1) {
                mo88048e1();
            } else if (i == 2) {
                this.f179113s.mo85319c();
                mo88044a1(false);
            } else if (i == 3) {
                this.f179113s.mo85319c();
                mo88043Z0(false);
            }
        }
    }

    /* renamed from: e1 */
    public final void mo88048e1() {
        mo10792g(0);
        this.f179112r.mo85502a(0);
        C60535v0 v0Var = this.f179112r;
        v0Var.getClass();
        C61926c.m72668M(new C60340a1(v0Var));
        this.f179113s.mo85317a(8);
    }

    /* renamed from: f1 */
    public final void mo88049f1() {
        mo10792g(0);
        this.f179112r.mo85502a(0);
        C60535v0 v0Var = this.f179112r;
        v0Var.getClass();
        C61926c.m72668M(new C60346b1(v0Var));
        this.f179113s.mo85317a(8);
    }

    /* renamed from: h */
    public boolean mo3206h() {
        return true;
    }

    /* renamed from: i0 */
    public void mo8357i0() {
        super.mo8357i0();
    }

    /* renamed from: m */
    public boolean mo3208m() {
        return ((C54991o) mo87696x0(C54991o.class)).f154287Z0 != 1;
    }

    /* renamed from: m0 */
    public void mo11992m0(LinkedHashMap<String, Rect> linkedHashMap) {
        C87412m.m108594g(linkedHashMap, "micUserMap");
        String str = this.f179111q;
        StringBuilder sb = new StringBuilder();
        sb.append("micUserMap size: ");
        sb.append(linkedHashMap.size());
        sb.append(" isPk: ");
        C54130j jVar = ((C54963d0) mo87696x0(C54963d0.class)).f154073p;
        sb.append(jVar != null ? Boolean.valueOf(jVar.f152004h) : null);
        sb.append(" isLink: ");
        sb.append(((C54991o) mo87696x0(C54991o.class)).mo75993b4());
        Log.m105924i(str, sb.toString());
        mo88045b1();
    }

    /* renamed from: u0 */
    public void mo3210u0(C58124b.C58125b bVar, Bundle bundle) {
        C87412m.m108594g(bVar, "status");
        super.mo3210u0(bVar, bundle);
        int ordinal = bVar.ordinal();
        if (ordinal == 118) {
            Class cls = C54963d0.class;
            String str = this.f179111q;
            Log.m105924i(str, "updateBattleInfo curBattle:" + ((C54963d0) mo87696x0(cls)).f154051E);
            if (((C54963d0) mo87696x0(cls)).f154051E != null) {
                this.f179113s.mo85319c();
            }
        } else if (ordinal != 183) {
            switch (ordinal) {
                case WXWebReporter.WXWEB_GET_MMKV_CALLBACK_IS_NULL:
                    mo88048e1();
                    return;
                case WXWebReporter.WXWEB_GET_REFLECT_MMKV_METHED_FAILED:
                    mo88044a1(true);
                    return;
                case WXWebReporter.WXWEB_GET_REFLECT_MMKV_INVOKE_FAILED:
                    mo88043Z0(true);
                    return;
                case 180:
                    C76912y0.makeText(this.f166287d.getContext(), (CharSequence) this.f166287d.getContext().getResources().getString(C0966R.string.f360539dh3), 0).show();
                    C60535v0 v0Var = this.f179112r;
                    C63121c cVar = new C63121c(this);
                    v0Var.getClass();
                    C61926c.m72668M(new C46272x0(v0Var, cVar));
                    return;
                default:
                    return;
            }
        } else {
            C60535v0 v0Var2 = this.f179112r;
            View view = v0Var2.f172553g;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveBattleAnchorTipWidget", "showAppliedProgressBar", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/finder/live/widget/FinderLiveBattleAnchorTipWidget", "showAppliedProgressBar", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            View view2 = v0Var2.f172552f;
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(4);
            View view3 = view2;
            C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveBattleAnchorTipWidget", "showAppliedProgressBar", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view3, "com/tencent/mm/plugin/finder/live/widget/FinderLiveBattleAnchorTipWidget", "showAppliedProgressBar", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    /* renamed from: w0 */
    public void mo3211w0() {
        super.mo3211w0();
        C60535v0 v0Var = this.f179112r;
        v0Var.getClass();
        C61926c.m72668M(new C46275z0(v0Var, (C32224a<C13598b0>) null));
        C61926c.m72668M(new C46272x0(v0Var, (C32224a<C13598b0>) null));
        v0Var.mo85502a(8);
        C60352c1 c1Var = this.f179113s;
        c1Var.f172033H = 0;
        c1Var.f172048m.stop();
        c1Var.f172049n.stop();
        c1Var.mo85317a(8);
        c1Var.f172035J.stopTimer();
    }
}
