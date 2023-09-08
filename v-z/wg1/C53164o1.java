package wg1;

import ak1.C54067f0;
import ak1.C54116w;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.ViewGroup;
import com.tencent.p014mm.plugin.finder.live.view.FinderLiveGameWelfareTaskProgressView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import ke3.C88144b;
import kr0.C76630x0;
import qj1.C62660c;
import rx3.C13598b0;
import te3.C50390me2;
import te3.C51292ss1;
import te3.C51439ts1;
import te3.C51733vs1;
import te3.C51870ws1;

/* renamed from: wg1.o1 */
public final class C53164o1 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C53165p1 f148339d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C53164o1(C53165p1 p1Var) {
        super(0);
        this.f148339d = p1Var;
    }

    public Object invoke() {
        boolean z;
        C51439ts1 ts12;
        C50390me2 me22;
        C51733vs1 a0;
        Boolean bool;
        C53162m1 m1Var = this.f148339d.f148344h;
        C53166q1 q1Var = m1Var instanceof C53166q1 ? (C53166q1) m1Var : null;
        boolean z2 = false;
        if (q1Var != null) {
            FinderLiveGameWelfareTaskProgressView finderLiveGameWelfareTaskProgressView = q1Var.f148351g;
            if (finderLiveGameWelfareTaskProgressView != null) {
                ViewGroup viewGroup = finderLiveGameWelfareTaskProgressView.f111666i;
                if (viewGroup != null) {
                    bool = Boolean.valueOf(viewGroup.getVisibility() == 0);
                } else {
                    C87412m.m108603p("bubbleRoot");
                    throw null;
                }
            } else {
                bool = null;
            }
            z = C87412m.m108589b(bool, Boolean.TRUE);
        } else {
            z = false;
        }
        int i = z ? 1 : 2;
        C54116w wVar = (C54116w) C86312j.m106911c(C54116w.class);
        C54067f0.C39610v vVar = C54067f0.C39610v.TASK_CLICK;
        C53162m1 m1Var2 = this.f148339d.f148344h;
        wVar.hy0(vVar, (m1Var2 == null || (a0 = m1Var2.mo73855a0()) == null) ? null : a0.f143675j, i);
        C53165p1 p1Var = this.f148339d;
        C51292ss1 ss12 = p1Var.f148345i;
        if (!(ss12 == null || (ts12 = ss12.f141719g) == null)) {
            int i2 = ts12.f142382d;
            if (i2 == 1) {
                C51870ws1 ws12 = ts12.f142383e;
                if (ws12 != null) {
                    String str = ws12.f144243d;
                    if (str == null || str.length() == 0) {
                        z2 = true;
                    }
                    if (z2) {
                        Log.m105924i("FinderLiveGameWelfareTaskBubblePresenter", "#viewCallback?.onBubbleClick appid is null, return");
                    } else {
                        C53160k4 k4Var = C53160k4.f148337a;
                        if (((C76630x0) C86312j.m106911c(C76630x0.class)).fn0()) {
                            C62660c cVar = p1Var.f148343g;
                            Bundle bundle = new Bundle();
                            bundle.putBoolean("PORTRAIT_ACTION_BUNDLE_OPEN_MINI_APP", true);
                            bundle.putByteArray("PORTRAIT_ACTION_BUNDLE_GAME_WELFARE_INFO", ws12.toByteArray());
                            C13598b0 b0Var = C13598b0.f38549a;
                            cVar.mo87694V0("PORTRAIT_ACTION_FinderLiveGameWelfareTaskBubblePresenter", bundle);
                        } else {
                            Context context = p1Var.f148341e;
                            String str2 = ws12.f144243d;
                            String str3 = str2 == null ? "" : str2;
                            String str4 = ws12.f144244e;
                            k4Var.mo73852b(context, str3, str4 == null ? "" : str4, ws12.f144245f, ws12.f144246g, new C53163n1(p1Var));
                            p1Var.f148347n = true;
                        }
                    }
                }
            } else if (i2 == 2 && (me22 = ts12.f142384f) != null) {
                String str5 = me22.f137974d;
                Log.m105924i("FinderLiveGameWelfareTaskBubblePresenter", "#goToH5 " + str5);
                if (Util.isNullOrNil(str5)) {
                    Log.m105928w("FinderLiveGameWelfareTaskBubblePresenter", "#goToH5 h5 is empty");
                } else {
                    Intent intent = new Intent();
                    intent.putExtra("rawUrl", str5);
                    intent.putExtra("showShare", false);
                    C88144b.m109791i(p1Var.f148341e, "webview", ".ui.tools.WebViewUI", intent, (Bundle) null);
                }
            }
        }
        return C13598b0.f38549a;
    }
}
