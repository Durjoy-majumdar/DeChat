package qj1;

import android.content.Context;
import android.os.Bundle;
import android.view.ViewGroup;
import cl1.C54991o;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.finder.live.model.FinderLiveService;
import com.tencent.p014mm.plugin.finder.live.view.FinderLiveGameWelfareTaskProgressView;
import com.tencent.p014mm.sdk.platformtools.Log;
import d60.C58124b;
import di3.C86312j;
import fy3.C32226l;
import gy3.C87412m;
import ky2.C10432i;
import ob0.C11385n;
import ob0.C117747y;
import pe3.C47465a;
import rx3.C13598b0;
import te3.C49712hj1;
import te3.C51267sm1;
import te3.C51416tm1;
import te3.C51870ws1;
import wg1.C53160k4;
import wg1.C53161l1;
import wg1.C53165p1;
import wg1.C53166q1;

/* renamed from: qj1.c7 */
public final class C47844c7 extends C62660c implements C11385n {

    /* renamed from: p */
    public C53161l1 f128423p;

    /* renamed from: q */
    public boolean f128424q;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C47844c7(ViewGroup viewGroup, FinderLiveGameWelfareTaskProgressView finderLiveGameWelfareTaskProgressView, C58124b bVar) {
        super(viewGroup, bVar, (C49712hj1) null);
        C87412m.m108594g(viewGroup, "root");
        C87412m.m108594g(bVar, "statusMonitor");
        Context context = viewGroup.getContext();
        C87412m.m108593f(context, "root.context");
        this.f128423p = new C53165p1(viewGroup, context, mo87684A0(), bVar, this);
        Context context2 = viewGroup.getContext();
        C87412m.m108592e(context2, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        C53166q1 q1Var = new C53166q1(viewGroup, finderLiveGameWelfareTaskProgressView, (MMActivity) context2, this.f128423p, mo87684A0());
        C53161l1 l1Var = this.f128423p;
        if (l1Var != null) {
            ((C53165p1) l1Var).onAttach(q1Var);
        }
        mo10792g(8);
    }

    /* renamed from: T0 */
    public void mo11982T0(Bundle bundle, Object obj) {
        C53161l1 l1Var = this.f128423p;
        if (l1Var != null) {
            C53165p1 p1Var = (C53165p1) l1Var;
            Bundle bundle2 = null;
            if (C87412m.m108589b(bundle != null ? bundle.getString("ACTION_POST_PORTRAIT", "") : null, "PORTRAIT_ACTION_FinderLiveGameWelfareTaskBubblePresenter")) {
                if (obj instanceof Bundle) {
                    bundle2 = (Bundle) obj;
                }
                if (bundle2 != null) {
                    boolean z = false;
                    if (bundle2.getBoolean("PORTRAIT_ACTION_BUNDLE_OPEN_MINI_APP", false)) {
                        try {
                            byte[] byteArray = bundle2.getByteArray("PORTRAIT_ACTION_BUNDLE_GAME_WELFARE_INFO");
                            if (byteArray != null) {
                                C47465a parseFrom = new C51870ws1().parseFrom(byteArray);
                                C87412m.m108592e(parseFrom, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.GameWelfareWxaJumpInfo");
                                C51870ws1 ws12 = (C51870ws1) parseFrom;
                                String str = ws12.f144243d;
                                if (str == null || str.length() == 0) {
                                    z = true;
                                }
                                if (z) {
                                    Log.m105924i("FinderLiveGameWelfareTaskBubblePresenter", "#onPortraitAction-openMiniApp appid is null, return");
                                    return;
                                }
                                C53160k4 k4Var = C53160k4.f148337a;
                                Context context = p1Var.f148341e;
                                String str2 = ws12.f144243d;
                                String str3 = str2 == null ? "" : str2;
                                String str4 = ws12.f144244e;
                                k4Var.mo73852b(context, str3, str4 == null ? "" : str4, ws12.f144245f, ws12.f144246g, (C32226l<? super Boolean, C13598b0>) null);
                                p1Var.f148347n = true;
                            }
                        } catch (Exception e) {
                            Log.m105920e("FinderLiveGameWelfareTaskBubblePresenter", "onPortraitAction-openMiniApp" + e.getLocalizedMessage());
                        }
                    }
                }
            }
        }
    }

    /* renamed from: b */
    public boolean mo3200b() {
        return true;
    }

    /* renamed from: g */
    public void mo10792g(int i) {
        if (((C10432i) C86312j.m106911c(C10432i.class)).mo10750e()) {
            this.f166287d.setVisibility(8);
            Log.m105928w("FinderLiveGameWelfareTaskBubblePlugin", "setVisible return for isTeenMode");
            return;
        }
        super.mo10792g(i);
    }

    /* renamed from: h */
    public boolean mo3206h() {
        return true;
    }

    /* renamed from: i0 */
    public void mo8357i0() {
        Log.m105924i("FinderLiveGameWelfareTaskBubblePlugin", "#mount");
        this.f128424q = true;
        Log.m105924i("FinderLiveGameWelfareTaskBubblePlugin", "#startPollingBannerData");
        C51267sm1 sm12 = new C51267sm1();
        FinderLiveService.f159376d.getClass();
        FinderLiveService.f159383n.mo75799e(5, sm12, new C47843b7(this, C51416tm1.class), false);
    }

    /* renamed from: m */
    public boolean mo3208m() {
        return ((C54991o) mo87696x0(C54991o.class)).f154287Z0 != 1;
    }

    public final void onResume() {
        C53161l1 l1Var = this.f128423p;
        if (l1Var != null) {
            C53165p1 p1Var = (C53165p1) l1Var;
            Log.m105924i("FinderLiveGameWelfareTaskBubblePresenter", "#requestToPreloadMiniAppOnResume");
            if (p1Var.f148347n) {
                p1Var.f148347n = false;
            } else {
                p1Var.mo73857e();
            }
        }
        C53161l1 l1Var2 = this.f128423p;
        if (l1Var2 != null) {
            C53165p1 p1Var2 = (C53165p1) l1Var2;
            p1Var2.mo73858n(p1Var2.f148345i, true);
        }
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
    }

    /* renamed from: w0 */
    public void mo3211w0() {
        super.mo3211w0();
        this.f128424q = false;
        Log.m105924i("FinderLiveGameWelfareTaskBubblePlugin", "#unMount");
        C53161l1 l1Var = this.f128423p;
        if (l1Var != null) {
            ((C53165p1) l1Var).onDetach();
        }
    }
}
