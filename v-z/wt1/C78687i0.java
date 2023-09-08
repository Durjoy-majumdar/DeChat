package wt1;

import android.os.Bundle;
import android.text.TextUtils;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.C0120a0;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.wallet_core.p137ui.WalletBaseUI;
import di3.C86312j;
import f40.C86709a0;
import gy3.C87412m;
import nj3.C76912y0;
import ob0.C117747y;
import p623nr.C47294g;
import p623nr.C47295h;
import p623nr.C76954e;
import p623nr.C76955f;
import p623nr.C76956i;
import pv2.C77290d;
import rx3.C36570n;
import tt1.C78092f;
import tt1.C78101i;
import v53.C78342e0;
import wt1.C78670h0;
import xt3.C53448e;
import yq3.C79143a;
import yt3.C23319f;

/* renamed from: wt1.i0 */
public final class C78687i0<T> implements C0120a0 {

    /* renamed from: d */
    public final /* synthetic */ C78670h0 f230390d;

    public C78687i0(C78670h0 h0Var) {
        this.f230390d = h0Var;
    }

    public void onChanged(Object obj) {
        C78670h0.C78671a aVar = (C78670h0.C78671a) obj;
        Class cls = C76954e.class;
        Class cls2 = C78101i.class;
        Log.m105924i("MicroMsg.WalletOpenTouchPayUIC", "on receive event: " + aVar);
        if (aVar instanceof C78670h0.C78671a.C78674c) {
            C78670h0 h0Var = this.f230390d;
            Bundle e = C79143a.m95766e(h0Var.getActivity());
            if (e != null) {
                String string = e.getString("pwd");
                if (TextUtils.isEmpty(string)) {
                    Log.m105920e("MicroMsg.WalletOpenTouchPayUIC", "get user pwd error");
                    C77290d.m93109g(1000, -1000223, -1, "get user pwd error");
                    h0Var.mo108628c3(new C78670h0.C78680b.C78682b(h0Var.getString(C0966R.string.eud)));
                    return;
                }
                C78101i iVar = (C78101i) C86709a0.m107533q(cls2);
                if (!iVar.mo108074Qk()) {
                    h0Var.mo108628c3(new C78670h0.C78680b.C78682b(h0Var.getString(C0966R.string.l3b)));
                } else if (iVar.mo108079gv()) {
                    C23319f.m27817c().mo36811b();
                    C87412m.m108591d(string);
                    h0Var.mo108629d3(new C78670h0.C78671a.C78678g(string));
                } else {
                    Log.m105920e("MicroMsg.WalletOpenTouchPayUIC", "device is not support FingerPrintAuth");
                }
            } else {
                Log.m105920e("MicroMsg.WalletOpenTouchPayUIC", "contextdata is null,for that reason program can't get user pwd");
                C77290d.m93109g(1000, -1000223, -1, "contextdata is null,for that reason program can't get user pwd");
                h0Var.mo108628c3(new C78670h0.C78680b.C78682b(h0Var.getString(C0966R.string.eud)));
            }
        } else if (aVar instanceof C78670h0.C78671a.C78678g) {
            this.f230390d.mo108628c3(C78670h0.C78680b.C78684d.f230387a);
            C78670h0 h0Var2 = this.f230390d;
            String str = ((C78670h0.C78671a.C78678g) aVar).f230381a;
            h0Var2.getClass();
            ((C78101i) C86709a0.m107533q(cls2)).mo108070G3(new Object[0]);
            h0Var2.f230370d = str;
            Log.m105924i("MicroMsg.WalletOpenTouchPayUIC", "hy: start gen auth key");
            C115669n.INSTANCE.mo175911u(1104, 35);
            Object value = ((C36570n) h0Var2.f230371e).getValue();
            C87412m.m108593f(value, "<get-mSoterManager>(...)");
            C78699o0 o0Var = new C78699o0(h0Var2);
            C47295h A30 = ((C76954e) C86312j.m106911c(cls)).A30(str, 1);
            C87412m.m108592e(A30, "null cannot be cast to non-null type com.tencent.soter.wrapper.wrap_net.IWrapUploadKeyNet");
            ((C76956i) value).mo107277b(o0Var, true, 1, (C53448e) A30);
        } else if (aVar instanceof C78670h0.C78671a.C78673b) {
            AppCompatActivity activity = this.f230390d.getActivity();
            C87412m.m108592e(activity, "null cannot be cast to non-null type com.tencent.mm.wallet_core.ui.WalletBaseUI");
            C76955f mx02 = ((C76954e) C86312j.m106911c(cls)).mx0(1);
            C87412m.m108592e(mx02, "null cannot be cast to non-null type com.tencent.mm.modelbase.NetSceneBase");
            ((WalletBaseUI) activity).doSceneProgress((C117747y) mx02, false);
        } else if (aVar instanceof C78670h0.C78671a.C78679h) {
            this.f230390d.mo108628c3(C78670h0.C78680b.C78681a.f230383a);
            C78670h0 h0Var3 = this.f230390d;
            String str2 = ((C78670h0.C78671a.C78679h) aVar).f230382a;
            h0Var3.getClass();
            Log.m105924i("MicroMsg.WalletOpenTouchPayUIC", "request authentication");
            if (Util.isNullOrNil(str2)) {
                Log.m105928w("MicroMsg.WalletOpenTouchPayUIC", "no challenge!!");
                return;
            }
            C115669n.INSTANCE.mo175911u(1104, 41);
            C78092f fVar = new C78092f(str2, 1);
            fVar.f228897d = MMApplicationContext.getString(C0966R.string.m8z);
            fVar.f228898e = MMApplicationContext.getString(C0966R.string.m8y);
            fVar.f228899f = MMApplicationContext.getString(C0966R.string.f7926wf);
            ((C78101i) C86709a0.m107533q(cls2)).mo108082n4(h0Var3.getContext(), fVar, new C78701p0(h0Var3));
        } else if (aVar instanceof C78670h0.C78671a.C78675d) {
            AppCompatActivity activity2 = this.f230390d.getActivity();
            C87412m.m108592e(activity2, "null cannot be cast to non-null type com.tencent.mm.wallet_core.ui.WalletBaseUI");
            C78670h0.C78671a.C78675d dVar = (C78670h0.C78671a.C78675d) aVar;
            C47294g RG = ((C76954e) C86312j.m106911c(cls)).mo72336RG(dVar.f230377a, dVar.f230378b, this.f230390d.f230370d, 1);
            C87412m.m108592e(RG, "null cannot be cast to non-null type com.tencent.mm.modelbase.NetSceneBase");
            ((WalletBaseUI) activity2).doSceneProgress((C117747y) RG, true);
        } else if (aVar instanceof C78670h0.C78671a.C78672a) {
            AppCompatActivity activity3 = this.f230390d.getActivity();
            C87412m.m108592e(activity3, "null cannot be cast to non-null type com.tencent.mm.wallet_core.ui.WalletBaseUI");
            ((WalletBaseUI) activity3).doSceneProgress(new C78342e0((String) null, 19), true);
        } else if (aVar instanceof C78670h0.C78671a.C78676e) {
            C79143a.m95764c(this.f230390d.getActivity(), new Bundle(), 0);
            C76912y0.makeText(MMApplicationContext.getContext(), (int) C0966R.string.eue, 0).show();
        } else if (aVar instanceof C78670h0.C78671a.C78677f) {
            C79143a.m95764c(this.f230390d.getActivity(), new Bundle(), ((C78670h0.C78671a.C78677f) aVar).f230380a);
        }
    }
}
