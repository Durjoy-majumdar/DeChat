package wg1;

import a14.C53973z1;
import android.view.View;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.MMFragmentActivity;
import com.tencent.p014mm.plugin.finder.live.view.FinderLiveGameWelfareTaskProgressView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import fj1.C45795b;
import fy3.C32224a;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import rx3.C13598b0;
import te3.C51733vs1;

/* renamed from: wg1.q1 */
public final class C53166q1 implements C53162m1 {

    /* renamed from: d */
    public final View f148348d;

    /* renamed from: e */
    public final MMActivity f148349e;

    /* renamed from: f */
    public final C45795b f148350f;

    /* renamed from: g */
    public FinderLiveGameWelfareTaskProgressView f148351g;

    /* renamed from: h */
    public C32224a<C13598b0> f148352h;

    /* renamed from: wg1.q1$a */
    public static final class C53167a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C53166q1 f148353d;

        public C53167a(C53166q1 q1Var) {
            this.f148353d = q1Var;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/component/FinderLiveGameWelfareTaskBubbleViewCallback$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C32224a<C13598b0> aVar = this.f148353d.f148352h;
            if (aVar != null) {
                aVar.invoke();
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/component/FinderLiveGameWelfareTaskBubbleViewCallback$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    public C53166q1(View view, FinderLiveGameWelfareTaskProgressView finderLiveGameWelfareTaskProgressView, MMActivity mMActivity, C53161l1 l1Var, C45795b bVar) {
        C87412m.m108594g(view, "root");
        C87412m.m108594g(mMActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        C87412m.m108594g(bVar, "buContext");
        this.f148348d = view;
        this.f148349e = mMActivity;
        this.f148350f = bVar;
        this.f148351g = finderLiveGameWelfareTaskProgressView;
        if (finderLiveGameWelfareTaskProgressView != null) {
            finderLiveGameWelfareTaskProgressView.setOnClickListener(new C53167a(this));
        }
    }

    /* renamed from: F */
    public void mo73853F() {
        FinderLiveGameWelfareTaskProgressView finderLiveGameWelfareTaskProgressView = this.f148351g;
        if (finderLiveGameWelfareTaskProgressView != null) {
            finderLiveGameWelfareTaskProgressView.setVisibility(8);
        }
        FinderLiveGameWelfareTaskProgressView finderLiveGameWelfareTaskProgressView2 = this.f148351g;
        if (finderLiveGameWelfareTaskProgressView2 != null) {
            Log.m105924i("FinderLiveGameWelfareTaskProgressView", "#reset");
            finderLiveGameWelfareTaskProgressView2.mo64553a();
            C53973z1 z1Var = finderLiveGameWelfareTaskProgressView2.f111662e;
            if (z1Var != null) {
                C53973z1.C53974a.m60623a(z1Var, (CancellationException) null, 1, (Object) null);
            }
            ((ArrayList) finderLiveGameWelfareTaskProgressView2.f111669o).clear();
            finderLiveGameWelfareTaskProgressView2.f111670p = null;
            finderLiveGameWelfareTaskProgressView2.f111664g.removeAllViews();
            finderLiveGameWelfareTaskProgressView2.f111671q = null;
            C53973z1 z1Var2 = finderLiveGameWelfareTaskProgressView2.f111663f;
            if (z1Var2 != null) {
                C53973z1.C53974a.m60623a(z1Var2, (CancellationException) null, 1, (Object) null);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0052, code lost:
        if ((((a14.C53851a) r11).mo74466a() ^ true) != false) goto L_0x0054;
     */
    /* renamed from: T */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo73854T(java.util.List<? extends te3.C51733vs1> r11, te3.C51591us1 r12, int r13, java.lang.String r14) {
        /*
            r10 = this;
            java.lang.String r0 = "taskInfo"
            gy3.C87412m.m108594g(r11, r0)
            java.lang.String r0 = "walfareId"
            gy3.C87412m.m108594g(r14, r0)
            boolean r0 = r11.isEmpty()
            r1 = 1
            r0 = r0 ^ r1
            if (r0 == 0) goto L_0x0143
            com.tencent.mm.plugin.finder.live.view.FinderLiveGameWelfareTaskProgressView r0 = r10.f148351g
            r2 = 0
            r3 = 0
            if (r0 == 0) goto L_0x006c
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "#render taskInfo size: "
            r4.append(r5)
            int r5 = r11.size()
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            java.lang.String r5 = "FinderLiveGameWelfareTaskProgressView"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r4)
            java.util.List<te3.vs1> r4 = r0.f111669o
            java.util.ArrayList r4 = (java.util.ArrayList) r4
            r4.clear()
            java.util.List<te3.vs1> r4 = r0.f111669o
            java.util.ArrayList r4 = (java.util.ArrayList) r4
            r4.addAll(r11)
            a14.z1 r11 = r0.f111662e
            if (r11 == 0) goto L_0x0054
            a14.a r11 = (a14.C53851a) r11
            boolean r11 = r11.mo74466a()
            r11 = r11 ^ r1
            if (r11 != r1) goto L_0x0051
            r11 = 1
            goto L_0x0052
        L_0x0051:
            r11 = 0
        L_0x0052:
            if (r11 == 0) goto L_0x006c
        L_0x0054:
            a14.z1 r11 = r0.f111662e
            if (r11 == 0) goto L_0x005b
            a14.C53973z1.C53974a.m60623a(r11, r3, r1, r3)
        L_0x005b:
            a14.n0 r4 = r0.f111661d
            r5 = 0
            r6 = 0
            com.tencent.mm.plugin.finder.live.view.o0 r7 = new com.tencent.mm.plugin.finder.live.view.o0
            r7.<init>(r0, r3)
            r8 = 3
            r9 = 0
            a14.z1 r11 = a14.C53895h.m60466d(r4, r5, r6, r7, r8, r9)
            r0.f111662e = r11
        L_0x006c:
            java.lang.Class<cl1.y> r11 = cl1.C39988y.class
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r14)
            r14 = 95
            r0.append(r14)
            r0.append(r13)
            java.lang.String r14 = r0.toString()
            fj1.b r0 = r10.f148350f
            androidx.lifecycle.i0 r0 = r0.mo71262a(r11)
            cl1.y r0 = (cl1.C39988y) r0
            java.lang.String r0 = r0.f107215f
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "checkNeedShowBigMode: status: "
            r4.append(r5)
            r4.append(r13)
            java.lang.String r5 = " curWelfareStatus: "
            r4.append(r5)
            r4.append(r14)
            java.lang.String r5 = " lastWelfareKey: "
            r4.append(r5)
            r4.append(r0)
            java.lang.String r4 = r4.toString()
            java.lang.String r5 = "FinderLiveGameWelfareTaskBubbleViewCallback"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r4)
            boolean r0 = gy3.C87412m.m108589b(r14, r0)
            if (r0 != 0) goto L_0x012c
            int r0 = ks3.C46737i.f125817a
            r0 = 2
            if (r13 != r0) goto L_0x012c
            com.tencent.mm.plugin.finder.live.view.FinderLiveGameWelfareTaskProgressView r13 = r10.f148351g
            if (r13 == 0) goto L_0x012c
            android.view.ViewGroup r0 = r13.f111665h
            if (r0 == 0) goto L_0x0126
            r4 = 8
            r0.setVisibility(r4)
            android.view.ViewGroup r0 = r13.f111666i
            if (r0 == 0) goto L_0x0120
            r0.setVisibility(r2)
            android.widget.TextView r0 = r13.f111668n
            if (r0 != 0) goto L_0x00d6
            goto L_0x00ef
        L_0x00d6:
            if (r12 == 0) goto L_0x00dd
            java.lang.String r12 = r12.f143068d
            if (r12 == 0) goto L_0x00dd
            goto L_0x00ec
        L_0x00dd:
            android.content.Context r12 = r13.getContext()
            android.content.res.Resources r12 = r12.getResources()
            r4 = 2131827776(0x7f111c40, float:1.9288474E38)
            java.lang.String r12 = r12.getString(r4)
        L_0x00ec:
            r0.setText(r12)
        L_0x00ef:
            org.libpag.PAGView r12 = r13.f111667j
            if (r12 != 0) goto L_0x00f4
            goto L_0x00f9
        L_0x00f4:
            r4 = 0
            r12.setProgress(r4)
        L_0x00f9:
            org.libpag.PAGView r12 = r13.f111667j
            if (r12 == 0) goto L_0x0100
            r12.play()
        L_0x0100:
            org.libpag.PAGView r12 = r13.f111667j
            if (r12 == 0) goto L_0x0107
            r12.flush()
        L_0x0107:
            a14.z1 r12 = r13.f111663f
            if (r12 == 0) goto L_0x010e
            a14.C53973z1.C53974a.m60623a(r12, r3, r1, r3)
        L_0x010e:
            a14.n0 r4 = r13.f111661d
            r5 = 0
            r6 = 0
            com.tencent.mm.plugin.finder.live.view.p0 r7 = new com.tencent.mm.plugin.finder.live.view.p0
            r7.<init>(r13, r3)
            r8 = 3
            r9 = 0
            a14.z1 r12 = a14.C53895h.m60466d(r4, r5, r6, r7, r8, r9)
            r13.f111663f = r12
            goto L_0x012c
        L_0x0120:
            java.lang.String r11 = "bubbleRoot"
            gy3.C87412m.m108603p(r11)
            throw r3
        L_0x0126:
            java.lang.String r11 = "contentRoot"
            gy3.C87412m.m108603p(r11)
            throw r3
        L_0x012c:
            fj1.b r12 = r10.f148350f
            androidx.lifecycle.i0 r11 = r12.mo71262a(r11)
            cl1.y r11 = (cl1.C39988y) r11
            java.lang.String r12 = "<set-?>"
            gy3.C87412m.m108594g(r14, r12)
            r11.f107215f = r14
            com.tencent.mm.plugin.finder.live.view.FinderLiveGameWelfareTaskProgressView r11 = r10.f148351g
            if (r11 != 0) goto L_0x0140
            goto L_0x0143
        L_0x0140:
            r11.setVisibility(r2)
        L_0x0143:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: wg1.C53166q1.mo73854T(java.util.List, te3.us1, int, java.lang.String):void");
    }

    /* renamed from: a0 */
    public C51733vs1 mo73855a0() {
        FinderLiveGameWelfareTaskProgressView finderLiveGameWelfareTaskProgressView = this.f148351g;
        if (finderLiveGameWelfareTaskProgressView != null) {
            return finderLiveGameWelfareTaskProgressView.getShowingTask();
        }
        return null;
    }

    public MMFragmentActivity getActivity() {
        return this.f148349e;
    }

    /* renamed from: k */
    public void mo73856k(C32224a<C13598b0> aVar) {
        this.f148352h = aVar;
    }
}
