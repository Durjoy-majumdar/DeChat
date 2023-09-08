package zo1;

import a14.C53895h;
import a14.C53930o0;
import a14.C53934p0;
import a14.C53973z1;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import bp1.C54519d;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.finder.live.view.C56032b;
import com.tencent.p014mm.plugin.finder.replay.FinderLiveThumbPlayerProxy;
import com.tencent.p014mm.sdk.platformtools.Log;
import cp1.C57952m;
import d60.C58124b;
import gy3.C8480h;
import gy3.C87412m;
import java.util.List;
import java.util.concurrent.CancellationException;
import ph1.C62287a;
import ph1.C62291f;
import ph1.C62297m;
import qj1.C62660c;
import qj1.C62979sf;
import te3.C49712hj1;
import wx3.C15601d;
import wx3.C66212f;

/* renamed from: zo1.j0 */
public final class C66925j0 extends C62660c {

    /* renamed from: t */
    public static final C66926a f192298t = new C66926a((C8480h) null);

    /* renamed from: p */
    public final List<Integer> f192299p;

    /* renamed from: q */
    public final C58124b f192300q;

    /* renamed from: r */
    public C57952m f192301r;

    /* renamed from: s */
    public C53973z1 f192302s;

    /* renamed from: zo1.j0$a */
    public static final class C66926a {
        public C66926a(C8480h hVar) {
        }

        /* renamed from: a */
        public final void mo90919a(long j, C56032b bVar) {
            Window window;
            View decorView;
            C62287a aVar = C62287a.f177060a;
            C62297m mVar = C62287a.f177061b.get(Long.valueOf(j));
            Log.m105924i("FinderFluentReplaySwitchManager", "recordFluentSwitchInRoomPlayer feedId:" + j + " director:" + mVar);
            if (mVar instanceof C62291f) {
                C62291f fVar = (C62291f) mVar;
                fVar.mo84321f();
                C62287a.f177062c.put(Long.valueOf(j), fVar.mo84321f());
            }
            StringBuilder sb = new StringBuilder();
            sb.append("getSwitchInLiveRoomDirector feedId:");
            sb.append(j);
            sb.append(" checkDetach:");
            boolean z = true;
            sb.append(true);
            sb.append(" director:");
            sb.append(mVar);
            Log.m105924i("FinderFluentReplaySwitchManager", sb.toString());
            MMActivity mMActivity = null;
            if (mVar != null && mVar.mo84320e()) {
                mVar = null;
            }
            StringBuilder sb4 = new StringBuilder();
            sb4.append("detachBlock feedId: ");
            sb4.append(j);
            sb4.append(" director: ");
            sb4.append(mVar);
            sb4.append(" isDetach: ");
            sb4.append(mVar != null ? Boolean.valueOf(mVar.mo84320e()) : null);
            Log.m105924i("FinderLiveReplayerPlugin", sb4.toString());
            if (mVar == null || mVar.mo84320e()) {
                z = false;
            }
            if (z) {
                mVar.mo84322g();
            }
            if (bVar != null) {
                bVar.setAlpha(1.0f);
            }
            Context context = bVar != null ? bVar.getContext() : null;
            if (context instanceof MMActivity) {
                mMActivity = (MMActivity) context;
            }
            if (mMActivity != null && (window = mMActivity.getWindow()) != null && (decorView = window.getDecorView()) != null) {
                decorView.setBackgroundColor(-16777216);
            }
        }
    }

    /* renamed from: zo1.j0$b */
    public static final class C66927b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ FinderLiveThumbPlayerProxy f192303d;

        /* renamed from: e */
        public final /* synthetic */ C66925j0 f192304e;

        public C66927b(FinderLiveThumbPlayerProxy finderLiveThumbPlayerProxy, C66925j0 j0Var) {
            this.f192303d = finderLiveThumbPlayerProxy;
            this.f192304e = j0Var;
        }

        public final void run() {
            int[] iArr = new int[2];
            this.f192303d.getLocationOnScreen(iArr);
            int height = iArr[1] + this.f192303d.getHeight();
            C62979sf sfVar = (C62979sf) this.f192304e.mo87687E0(C62979sf.class);
            if (sfVar != null) {
                C62979sf.m74202c1(sfVar, height, 0, 2, (Object) null);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C66925j0(ViewGroup viewGroup, List<Integer> list, C58124b bVar) {
        super(viewGroup, bVar, (C49712hj1) null);
        C87412m.m108594g(viewGroup, "root");
        C87412m.m108594g(bVar, "statusMonitor");
        this.f192299p = list;
        this.f192300q = bVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:47:0x017e, code lost:
        if ((!r1.isEmpty()) != false) goto L_0x0180;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x01b7, code lost:
        if ((!r1.isEmpty()) != false) goto L_0x01b9;
     */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x0296 A[Catch:{ Exception -> 0x02bb }] */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x029d A[Catch:{ Exception -> 0x02bb }] */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x02a6 A[Catch:{ Exception -> 0x02bb }] */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x02ad A[Catch:{ Exception -> 0x02bb }] */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x02ca  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x02cd  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x02d1  */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x02eb  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x01e7  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x01ec  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x01f1  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x01f6  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x01fb  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0250 A[Catch:{ Exception -> 0x02bb }] */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0257 A[Catch:{ Exception -> 0x02bb }] */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0262 A[Catch:{ Exception -> 0x02bb }] */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0269 A[Catch:{ Exception -> 0x02bb }] */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0272 A[Catch:{ Exception -> 0x02bb }] */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0279 A[Catch:{ Exception -> 0x02bb }] */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0284 A[Catch:{ Exception -> 0x02bb }] */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x028b A[Catch:{ Exception -> 0x02bb }] */
    /* renamed from: Z0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo90914Z0() {
        /*
            r24 = this;
            r0 = r24
            java.lang.Class<cl1.o> r1 = cl1.C54991o.class
            androidx.lifecycle.i0 r2 = r0.mo87696x0(r1)
            cl1.o r2 = (cl1.C54991o) r2
            boolean r2 = r2.mo75992a4()
            com.tencent.mm.plugin.finder.live.view.b r3 = r24.mo14484z0()
            int r3 = r3.getMeasuredWidth()
            if (r3 <= 0) goto L_0x0040
            com.tencent.mm.plugin.finder.live.view.b r3 = r24.mo14484z0()
            int r3 = r3.getMeasuredHeight()
            if (r3 <= 0) goto L_0x0040
            rx3.l r3 = new rx3.l
            com.tencent.mm.plugin.finder.live.view.b r5 = r24.mo14484z0()
            int r5 = r5.getMeasuredWidth()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            com.tencent.mm.plugin.finder.live.view.b r6 = r24.mo14484z0()
            int r6 = r6.getMeasuredHeight()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r3.<init>(r5, r6)
            goto L_0x0041
        L_0x0040:
            r3 = 0
        L_0x0041:
            cp1.m r5 = r0.f192301r
            if (r5 == 0) goto L_0x02bd
            android.view.ViewGroup r6 = r0.f166287d
            android.content.Context r6 = r6.getContext()
            java.lang.String r7 = "root.context"
            gy3.C87412m.m108593f(r6, r7)
            fj1.b r7 = r24.mo87684A0()
            com.tencent.mm.plugin.finder.live.view.b r8 = r24.mo14484z0()
            boolean r8 = r8.isLandscape()
            com.tencent.mm.plugin.finder.live.view.b r9 = r24.mo14484z0()
            android.widget.RelativeLayout r9 = r9.getPreviewRoot()
            java.lang.String r10 = ",top:"
            java.lang.Class<cl1.d0> r11 = cl1.C54963d0.class
            java.lang.String r12 = "buContext"
            gy3.C87412m.m108594g(r7, r12)
            java.lang.String r12 = "container"
            gy3.C87412m.m108594g(r9, r12)
            com.tencent.mm.plugin.finder.replay.FinderLiveThumbPlayerProxy r12 = r5.f165852a
            android.view.ViewParent r12 = r12.getParent()
            java.lang.String r13 = "FinderLiveReplayerWidget"
            if (r12 != 0) goto L_0x0083
            java.lang.String r1 = "adjustLayout playerView's parent is null!"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r13, r1)
            goto L_0x02bd
        L_0x0083:
            com.tencent.mm.plugin.finder.replay.FinderLiveThumbPlayerProxy r12 = r5.f165852a
            android.view.ViewGroup$LayoutParams r12 = r12.getLayoutParams()
            boolean r14 = r12 instanceof android.widget.RelativeLayout.LayoutParams
            if (r14 == 0) goto L_0x0090
            android.widget.RelativeLayout$LayoutParams r12 = (android.widget.RelativeLayout.LayoutParams) r12
            goto L_0x0091
        L_0x0090:
            r12 = 0
        L_0x0091:
            android.view.ViewGroup$LayoutParams r14 = r9.getLayoutParams()
            boolean r15 = r14 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r15 == 0) goto L_0x009c
            android.view.ViewGroup$MarginLayoutParams r14 = (android.view.ViewGroup.MarginLayoutParams) r14
            goto L_0x009d
        L_0x009c:
            r14 = 0
        L_0x009d:
            android.graphics.Point r15 = com.tencent.p014mm.p136ui.C75044y4.m89990b(r6)
            int r15 = r15.y
            android.graphics.Point r4 = com.tencent.p014mm.p136ui.C75044y4.m89990b(r6)
            int r4 = r4.x
            r16 = r15
            android.graphics.Point r15 = com.tencent.p014mm.p136ui.C75044y4.m89990b(r6)
            int r15 = r15.y
            if (r3 != 0) goto L_0x00b9
            ok1.e r3 = ok1.C62042e.f176370a
            rx3.l r3 = r3.mo87086i0(r6)
        L_0x00b9:
            r17 = r15
            A r15 = r3.f38555d
            java.lang.Number r15 = (java.lang.Number) r15
            int r15 = r15.intValue()
            B r3 = r3.f38556e
            java.lang.Number r3 = (java.lang.Number) r3
            int r3 = r3.intValue()
            java.lang.String r0 = "buContext.business(\n    …).audienceLinkMicUserList"
            r18 = 1065353216(0x3f800000, float:1.0)
            r19 = 0
            r20 = r13
            r21 = 1071877689(0x3fe38e39, float:1.7777778)
            r13 = 0
            if (r2 == 0) goto L_0x0196
            androidx.lifecycle.i0 r22 = r7.mo71262a(r1)
            cl1.o r22 = (cl1.C54991o) r22
            boolean r22 = r22.mo76007j4()
            if (r22 != 0) goto L_0x0196
            if (r8 != 0) goto L_0x015d
            androidx.lifecycle.i0 r0 = r7.mo71262a(r1)
            cl1.o r0 = (cl1.C54991o) r0
            boolean r0 = r0.mo75993b4()
            if (r0 == 0) goto L_0x0104
            ok1.e r0 = ok1.C62042e.f176370a
            r1 = 3
            r6 = 0
            int r0 = ok1.C62042e.m72807k0(r0, r13, r13, r1, r6)
            int r1 = r15 / 2
            float r1 = (float) r1
            float r1 = r1 * r21
            int r1 = (int) r1
            r6 = 0
            goto L_0x01d6
        L_0x0104:
            float r0 = (float) r15
            androidx.lifecycle.i0 r8 = r7.mo71262a(r1)
            cl1.o r8 = (cl1.C54991o) r8
            int r8 = r8.f154338m1
            float r8 = (float) r8
            androidx.lifecycle.i0 r1 = r7.mo71262a(r1)
            cl1.o r1 = (cl1.C54991o) r1
            int r1 = r1.f154335l1
            float r1 = (float) r1
            float r8 = r8 / r1
            float r0 = r0 * r8
            int r0 = (int) r0
            float r1 = (float) r3
            r7 = 1060118724(0x3f3020c4, float:0.68799996)
            float r19 = r1 * r7
            android.content.Context r7 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            android.content.res.Resources r7 = r7.getResources()
            r8 = 2131166453(0x7f0704f5, float:1.7947152E38)
            float r7 = r7.getDimension(r8)
            float r8 = (float) r0
            r11 = 16
            int r16 = (r8 > r19 ? 1 : (r8 == r19 ? 0 : -1))
            if (r16 > 0) goto L_0x0150
            r13 = 1042267767(0x3e1fbe77, float:0.156)
            float r1 = r1 * r13
            int r1 = (int) r1
            int r6 = com.tencent.p014mm.p136ui.C75044y4.m89994f(r6)
            int r13 = r1 + r6
            int r1 = (r8 > r7 ? 1 : (r8 == r7 ? 0 : -1))
            if (r1 >= 0) goto L_0x014e
            int r1 = (int) r7
            if (r12 == 0) goto L_0x0156
            r12.addRule(r11)
            goto L_0x0156
        L_0x014e:
            r1 = r0
            goto L_0x0156
        L_0x0150:
            if (r12 == 0) goto L_0x0155
            r12.addRule(r11)
        L_0x0155:
            r1 = -1
        L_0x0156:
            r11 = r7
            r8 = r19
            r6 = 0
            r7 = r0
            goto L_0x01e4
        L_0x015d:
            boolean r1 = com.tencent.p014mm.p136ui.C85875k4.m106208w()
            if (r1 == 0) goto L_0x01d9
            androidx.lifecycle.i0 r1 = r7.mo71262a(r11)
            cl1.d0 r1 = (cl1.C54963d0) r1
            al1.j r1 = r1.f154073p
            if (r1 != 0) goto L_0x0180
            androidx.lifecycle.i0 r1 = r7.mo71262a(r11)
            cl1.d0 r1 = (cl1.C54963d0) r1
            java.util.List<al1.j> r1 = r1.f154074q
            gy3.C87412m.m108593f(r1, r0)
            boolean r0 = r1.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x01d9
        L_0x0180:
            int r0 = r15 / 2
            boolean r1 = com.tencent.p014mm.p136ui.C85875k4.m106208w()
            if (r1 == 0) goto L_0x0189
            goto L_0x018c
        L_0x0189:
            r18 = 1071877689(0x3fe38e39, float:1.7777778)
        L_0x018c:
            ok1.e r1 = ok1.C62042e.f176370a
            r6 = 3
            r7 = 0
            int r1 = ok1.C62042e.m72807k0(r1, r13, r13, r6, r7)
            r6 = r7
            goto L_0x01cd
        L_0x0196:
            boolean r1 = com.tencent.p014mm.p136ui.C85875k4.m106208w()
            if (r1 == 0) goto L_0x01d9
            androidx.lifecycle.i0 r1 = r7.mo71262a(r11)
            cl1.d0 r1 = (cl1.C54963d0) r1
            al1.j r1 = r1.f154073p
            if (r1 != 0) goto L_0x01b9
            androidx.lifecycle.i0 r1 = r7.mo71262a(r11)
            cl1.d0 r1 = (cl1.C54963d0) r1
            java.util.List<al1.j> r1 = r1.f154074q
            gy3.C87412m.m108593f(r1, r0)
            boolean r0 = r1.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x01d9
        L_0x01b9:
            int r0 = r15 / 2
            boolean r1 = com.tencent.p014mm.p136ui.C85875k4.m106208w()
            if (r1 == 0) goto L_0x01c2
            goto L_0x01c5
        L_0x01c2:
            r18 = 1071877689(0x3fe38e39, float:1.7777778)
        L_0x01c5:
            ok1.e r1 = ok1.C62042e.f176370a
            r6 = 0
            r7 = 3
            int r1 = ok1.C62042e.m72807k0(r1, r13, r13, r7, r6)
        L_0x01cd:
            float r0 = (float) r0
            float r0 = r0 * r18
            int r0 = (int) r0
            r23 = r1
            r1 = r0
            r0 = r23
        L_0x01d6:
            r16 = r1
            goto L_0x01dd
        L_0x01d9:
            r6 = 0
            r1 = r17
            r0 = 0
        L_0x01dd:
            r13 = r0
            r0 = r1
            r1 = r16
            r7 = 0
            r8 = 0
            r11 = 0
        L_0x01e4:
            if (r14 != 0) goto L_0x01e7
            goto L_0x01e9
        L_0x01e7:
            r14.topMargin = r13
        L_0x01e9:
            if (r14 != 0) goto L_0x01ec
            goto L_0x01ee
        L_0x01ec:
            r14.height = r1
        L_0x01ee:
            if (r14 != 0) goto L_0x01f1
            goto L_0x01f3
        L_0x01f1:
            r14.width = r4
        L_0x01f3:
            if (r12 != 0) goto L_0x01f6
            goto L_0x01f8
        L_0x01f6:
            r12.height = r0
        L_0x01f8:
            if (r12 != 0) goto L_0x01fb
            goto L_0x01fd
        L_0x01fb:
            r12.width = r4
        L_0x01fd:
            r9.setLayoutParams(r14)     // Catch:{ Exception -> 0x02bb }
            com.tencent.mm.plugin.finder.replay.FinderLiveThumbPlayerProxy r0 = r5.f165852a     // Catch:{ Exception -> 0x02bb }
            r0.setLayoutParams(r12)     // Catch:{ Exception -> 0x02bb }
            if (r12 == 0) goto L_0x0214
            int r0 = r12.height     // Catch:{ Exception -> 0x02bb }
            if (r0 <= 0) goto L_0x0214
            int r1 = r12.width     // Catch:{ Exception -> 0x02bb }
            if (r1 <= 0) goto L_0x0214
            com.tencent.mm.plugin.finder.replay.FinderLiveThumbPlayerProxy r4 = r5.f165852a     // Catch:{ Exception -> 0x02bb }
            r4.mo78605J(r1, r0)     // Catch:{ Exception -> 0x02bb }
        L_0x0214:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x02bb }
            r0.<init>()     // Catch:{ Exception -> 0x02bb }
            java.lang.String r1 = "adjustLayout container size:("
            r0.append(r1)     // Catch:{ Exception -> 0x02bb }
            r0.append(r15)     // Catch:{ Exception -> 0x02bb }
            java.lang.String r1 = " - "
            r0.append(r1)     // Catch:{ Exception -> 0x02bb }
            r0.append(r3)     // Catch:{ Exception -> 0x02bb }
            java.lang.String r1 = "), isLandscapeVideo:"
            r0.append(r1)     // Catch:{ Exception -> 0x02bb }
            r0.append(r2)     // Catch:{ Exception -> 0x02bb }
            java.lang.String r1 = ",videoScaleHeight:"
            r0.append(r1)     // Catch:{ Exception -> 0x02bb }
            r0.append(r7)     // Catch:{ Exception -> 0x02bb }
            java.lang.String r1 = ",limitHeight:"
            r0.append(r1)     // Catch:{ Exception -> 0x02bb }
            r0.append(r8)     // Catch:{ Exception -> 0x02bb }
            java.lang.String r1 = ",landscapePlayerMiniHeight:"
            r0.append(r1)     // Catch:{ Exception -> 0x02bb }
            r0.append(r11)     // Catch:{ Exception -> 0x02bb }
            java.lang.String r1 = ",parentLp height:"
            r0.append(r1)     // Catch:{ Exception -> 0x02bb }
            if (r14 == 0) goto L_0x0257
            int r1 = r14.height     // Catch:{ Exception -> 0x02bb }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ Exception -> 0x02bb }
            goto L_0x0258
        L_0x0257:
            r1 = r6
        L_0x0258:
            r0.append(r1)     // Catch:{ Exception -> 0x02bb }
            java.lang.String r1 = ",parentLp width:"
            r0.append(r1)     // Catch:{ Exception -> 0x02bb }
            if (r14 == 0) goto L_0x0269
            int r1 = r14.width     // Catch:{ Exception -> 0x02bb }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ Exception -> 0x02bb }
            goto L_0x026a
        L_0x0269:
            r1 = r6
        L_0x026a:
            r0.append(r1)     // Catch:{ Exception -> 0x02bb }
            r0.append(r10)     // Catch:{ Exception -> 0x02bb }
            if (r14 == 0) goto L_0x0279
            int r1 = r14.topMargin     // Catch:{ Exception -> 0x02bb }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ Exception -> 0x02bb }
            goto L_0x027a
        L_0x0279:
            r1 = r6
        L_0x027a:
            r0.append(r1)     // Catch:{ Exception -> 0x02bb }
            java.lang.String r1 = ", previewLp height:"
            r0.append(r1)     // Catch:{ Exception -> 0x02bb }
            if (r12 == 0) goto L_0x028b
            int r1 = r12.height     // Catch:{ Exception -> 0x02bb }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ Exception -> 0x02bb }
            goto L_0x028c
        L_0x028b:
            r1 = r6
        L_0x028c:
            r0.append(r1)     // Catch:{ Exception -> 0x02bb }
            java.lang.String r1 = ",previewLp width:"
            r0.append(r1)     // Catch:{ Exception -> 0x02bb }
            if (r12 == 0) goto L_0x029d
            int r1 = r12.width     // Catch:{ Exception -> 0x02bb }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ Exception -> 0x02bb }
            goto L_0x029e
        L_0x029d:
            r1 = r6
        L_0x029e:
            r0.append(r1)     // Catch:{ Exception -> 0x02bb }
            r0.append(r10)     // Catch:{ Exception -> 0x02bb }
            if (r12 == 0) goto L_0x02ad
            int r1 = r12.topMargin     // Catch:{ Exception -> 0x02bb }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ Exception -> 0x02bb }
            goto L_0x02ae
        L_0x02ad:
            r1 = r6
        L_0x02ae:
            r0.append(r1)     // Catch:{ Exception -> 0x02bb }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x02bb }
            r1 = r20
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)     // Catch:{ Exception -> 0x02bb }
            goto L_0x02be
        L_0x02bb:
            goto L_0x02be
        L_0x02bd:
            r6 = 0
        L_0x02be:
            java.lang.Class<ii1.e> r0 = ii1.C60291e.class
            r1 = r24
            qj1.c r0 = r1.mo87687E0(r0)
            ii1.e r0 = (ii1.C60291e) r0
            if (r0 == 0) goto L_0x02cd
            android.view.ViewGroup r4 = r0.f166287d
            goto L_0x02ce
        L_0x02cd:
            r4 = r6
        L_0x02ce:
            if (r4 != 0) goto L_0x02d1
            goto L_0x02e0
        L_0x02d1:
            com.tencent.mm.plugin.finder.live.view.b r0 = r24.mo14484z0()
            android.widget.RelativeLayout r0 = r0.getPreviewRoot()
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            r4.setLayoutParams(r0)
        L_0x02e0:
            com.tencent.mm.plugin.finder.live.view.b r0 = r24.mo14484z0()
            android.view.ViewGroup r0 = r0.getCommonTopContentRoot()
            if (r0 != 0) goto L_0x02eb
            goto L_0x02fa
        L_0x02eb:
            com.tencent.mm.plugin.finder.live.view.b r2 = r24.mo14484z0()
            android.widget.RelativeLayout r2 = r2.getPreviewRoot()
            android.view.ViewGroup$LayoutParams r2 = r2.getLayoutParams()
            r0.setLayoutParams(r2)
        L_0x02fa:
            com.tencent.mm.plugin.finder.live.view.b r3 = r24.mo14484z0()
            com.tencent.mm.plugin.finder.live.view.b r0 = r24.mo14484z0()
            org.json.JSONObject r4 = r0.getCurrentMicData()
            r5 = 1
            r6 = 0
            r7 = 4
            r8 = 0
            com.tencent.p014mm.plugin.finder.live.view.C56032b.notifySEIMicUserChange$default(r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: zo1.C66925j0.mo90914Z0():void");
    }

    /* renamed from: a1 */
    public final boolean mo90915a1() {
        C57952m mVar = this.f192301r;
        if (mVar != null) {
            return mVar.f165852a.isPlaying();
        }
        return false;
    }

    /* renamed from: b */
    public boolean mo3200b() {
        return false;
    }

    /* renamed from: b1 */
    public final void mo90916b1(Integer num, boolean z) {
        FinderLiveThumbPlayerProxy finderLiveThumbPlayerProxy;
        StringBuilder sb = new StringBuilder();
        sb.append("replay_step3:playVideo,player:");
        C57952m mVar = this.f192301r;
        sb.append(mVar != null ? mVar.hashCode() : 0);
        sb.append(",offset:");
        sb.append(num);
        sb.append(",fromFloat:");
        sb.append(z);
        sb.append(", isPlaying:");
        sb.append(mo90915a1());
        sb.append('!');
        Log.m105924i("FinderLiveReplayerPlugin", sb.toString());
        if (z) {
            mo90914Z0();
            C57952m mVar2 = this.f192301r;
            if (mVar2 != null && (finderLiveThumbPlayerProxy = mVar2.f165852a) != null) {
                finderLiveThumbPlayerProxy.postDelayed(new C66927b(finderLiveThumbPlayerProxy, this), 100);
                return;
            }
            return;
        }
        C57952m mVar3 = this.f192301r;
        if (mVar3 != null) {
            mVar3.mo82759e(num);
        }
    }

    /* renamed from: c1 */
    public final void mo90917c1(double d, boolean z) {
        C57952m mVar = this.f192301r;
        if (mVar != null) {
            Log.m105924i("FinderLiveReplayerWidget", "seekVideo " + mVar.hashCode() + " playerView:" + mVar.f165852a.hashCode() + " afterSeekPlay:" + z);
            mVar.f165852a.mo51223a(d, z);
            if (z) {
                mVar.f165852a.play();
            }
        }
    }

    /* renamed from: d1 */
    public final void mo90918d1() {
        C57952m mVar = this.f192301r;
        if (mVar != null) {
            mVar.mo82763i();
        }
    }

    /* renamed from: h */
    public boolean mo3206h() {
        return false;
    }

    /* renamed from: i0 */
    public void mo8357i0() {
        super.mo8357i0();
        Class cls = C54519d.class;
        C66937n0 n0Var = new C66937n0(this);
        if (C87412m.m108589b(((C54519d) mo87696x0(cls)).f152848h.getValue(), Boolean.TRUE)) {
            n0Var.invoke();
            C53973z1 z1Var = this.f192302s;
            if (z1Var != null) {
                C53973z1.C53974a.m60623a(z1Var, (CancellationException) null, 1, (Object) null);
            }
        }
        ((C54519d) mo87696x0(cls)).f152848h.observe(this, new C66931l0(n0Var, this));
        this.f192302s = C53895h.m60466d(C53930o0.m60555b(), (C66212f) null, (C53934p0) null, new C16360m0(n0Var, (C15601d<? super C16360m0>) null), 3, (Object) null);
    }

    /* renamed from: m */
    public boolean mo3208m() {
        return true;
    }
}
