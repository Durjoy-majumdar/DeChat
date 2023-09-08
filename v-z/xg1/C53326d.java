package xg1;

import a14.C53973z1;
import android.view.View;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.MMFragmentActivity;
import com.tencent.p014mm.plugin.finder.live.view.finderlivelogo.FinderLiveLogoGroupView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;

/* renamed from: xg1.d */
public final class C53326d implements C66255b {

    /* renamed from: d */
    public final View f148930d;

    /* renamed from: e */
    public final FinderLiveLogoGroupView f148931e;

    /* renamed from: f */
    public final MMActivity f148932f;

    public C53326d(View view, FinderLiveLogoGroupView finderLiveLogoGroupView, MMActivity mMActivity, C53325a aVar) {
        C87412m.m108594g(view, "root");
        C87412m.m108594g(mMActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        this.f148930d = view;
        this.f148931e = finderLiveLogoGroupView;
        this.f148932f = mMActivity;
    }

    /* renamed from: C */
    public void mo73941C() {
        FinderLiveLogoGroupView finderLiveLogoGroupView = this.f148931e;
        if (finderLiveLogoGroupView != null) {
            finderLiveLogoGroupView.setVisibility(8);
        }
        FinderLiveLogoGroupView finderLiveLogoGroupView2 = this.f148931e;
        if (finderLiveLogoGroupView2 != null) {
            Log.m105924i("FinderLiveLogoGroupView", "#reset");
            C53973z1 z1Var = finderLiveLogoGroupView2.f111679e;
            if (z1Var != null) {
                C53973z1.C53974a.m60623a(z1Var, (CancellationException) null, 1, (Object) null);
            }
            ((ArrayList) finderLiveLogoGroupView2.f111681g).clear();
            finderLiveLogoGroupView2.f111682h = null;
            finderLiveLogoGroupView2.f111680f.removeAllViews();
            finderLiveLogoGroupView2.f111683i = null;
        }
    }

    public MMFragmentActivity getActivity() {
        return this.f148932f;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x004b, code lost:
        if ((((a14.C53851a) r11).mo74466a() ^ true) != false) goto L_0x004d;
     */
    /* renamed from: h0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo73942h0(java.util.List<? extends te3.C51587ur2> r11) {
        /*
            r10 = this;
            java.lang.String r0 = "taskInfo"
            gy3.C87412m.m108594g(r11, r0)
            boolean r0 = r11.isEmpty()
            r1 = 1
            r0 = r0 ^ r1
            if (r0 == 0) goto L_0x006e
            com.tencent.mm.plugin.finder.live.view.finderlivelogo.FinderLiveLogoGroupView r0 = r10.f148931e
            r2 = 0
            if (r0 == 0) goto L_0x0066
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "#render taskInfo size: "
            r3.append(r4)
            int r4 = r11.size()
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = "FinderLiveLogoGroupView"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r3)
            java.util.List<te3.ur2> r3 = r0.f111681g
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            r3.clear()
            java.util.List<te3.ur2> r3 = r0.f111681g
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            r3.addAll(r11)
            a14.z1 r11 = r0.f111679e
            if (r11 == 0) goto L_0x004d
            a14.a r11 = (a14.C53851a) r11
            boolean r11 = r11.mo74466a()
            r11 = r11 ^ r1
            if (r11 != r1) goto L_0x004a
            r11 = 1
            goto L_0x004b
        L_0x004a:
            r11 = 0
        L_0x004b:
            if (r11 == 0) goto L_0x0066
        L_0x004d:
            a14.z1 r11 = r0.f111679e
            r3 = 0
            if (r11 == 0) goto L_0x0055
            a14.C53973z1.C53974a.m60623a(r11, r3, r1, r3)
        L_0x0055:
            a14.n0 r4 = r0.f111678d
            r5 = 0
            r6 = 0
            tk1.a r7 = new tk1.a
            r7.<init>(r0, r3)
            r8 = 3
            r9 = 0
            a14.z1 r11 = a14.C53895h.m60466d(r4, r5, r6, r7, r8, r9)
            r0.f111679e = r11
        L_0x0066:
            com.tencent.mm.plugin.finder.live.view.finderlivelogo.FinderLiveLogoGroupView r11 = r10.f148931e
            if (r11 != 0) goto L_0x006b
            goto L_0x006e
        L_0x006b:
            r11.setVisibility(r2)
        L_0x006e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: xg1.C53326d.mo73942h0(java.util.List):void");
    }
}
