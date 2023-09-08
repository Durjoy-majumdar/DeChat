package wt1;

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
import nj3.C76879j;
import ob0.C117747y;
import p623nr.C47294g;
import p623nr.C47295h;
import p623nr.C76954e;
import p623nr.C76955f;
import p623nr.C76956i;
import rx3.C36570n;
import tt1.C78092f;
import tt1.C78101i;
import v53.C78342e0;
import wt1.C78709x;
import xt3.C53448e;
import yt3.C23319f;

/* renamed from: wt1.z */
public final class C78726z<T> implements C0120a0 {

    /* renamed from: d */
    public final /* synthetic */ C78709x f230436d;

    public C78726z(C78709x xVar) {
        this.f230436d = xVar;
    }

    public void onChanged(Object obj) {
        C78709x.C78710a aVar = (C78709x.C78710a) obj;
        Class cls = C76954e.class;
        Class cls2 = C78101i.class;
        Log.m105924i("MicroMsg.WalletOpenTouchPayAfterPayFinishUIC", "on receive event: " + aVar);
        boolean z = true;
        if (aVar instanceof C78709x.C78710a.C78713c) {
            C78709x xVar = this.f230436d;
            String stringExtra = xVar.getIntent().getStringExtra("kindaPayPwd");
            if (!(stringExtra == null || stringExtra.length() == 0)) {
                z = false;
            }
            if (z) {
                Log.m105928w("MicroMsg.WalletOpenTouchPayAfterPayFinishUIC", "password is null");
                xVar.getActivity().finish();
                return;
            }
            C78101i iVar = (C78101i) C86709a0.m107533q(cls2);
            if (!iVar.mo108074Qk()) {
                Log.m105928w("MicroMsg.WalletOpenTouchPayAfterPayFinishUIC", "not enrolled fingerprint");
                xVar.getActivity().finish();
            } else if (iVar.mo73371F7()) {
                Log.m105928w("MicroMsg.WalletOpenTouchPayAfterPayFinishUIC", "has opened touch pay");
                xVar.getActivity().finish();
            } else if (!iVar.mo108079gv()) {
                Log.m105928w("MicroMsg.WalletOpenTouchPayAfterPayFinishUIC", "can't use soter");
                xVar.getActivity().finish();
            } else {
                C23319f.m27817c().mo36811b();
                xVar.mo108648d3(new C78709x.C78710a.C78717g(stringExtra));
            }
        } else if (aVar instanceof C78709x.C78710a.C78717g) {
            this.f230436d.mo108647c3(C78709x.C78719b.C78723d.f230433a);
            C78709x xVar2 = this.f230436d;
            String str = ((C78709x.C78710a.C78717g) aVar).f230427a;
            xVar2.getClass();
            ((C78101i) C86709a0.m107533q(cls2)).mo108070G3(new Object[0]);
            xVar2.f230417d = str;
            Log.m105924i("MicroMsg.WalletOpenTouchPayAfterPayFinishUIC", "hy: start gen auth key");
            C115669n.INSTANCE.mo175911u(1104, 35);
            Object value = ((C36570n) xVar2.f230418e).getValue();
            C87412m.m108593f(value, "<get-mSoterManager>(...)");
            C78666f0 f0Var = new C78666f0(xVar2);
            C47295h A30 = ((C76954e) C86312j.m106911c(cls)).A30(str, 1);
            C87412m.m108592e(A30, "null cannot be cast to non-null type com.tencent.soter.wrapper.wrap_net.IWrapUploadKeyNet");
            ((C76956i) value).mo107277b(f0Var, true, 1, (C53448e) A30);
        } else if (aVar instanceof C78709x.C78710a.C78712b) {
            AppCompatActivity activity = this.f230436d.getActivity();
            C87412m.m108592e(activity, "null cannot be cast to non-null type com.tencent.mm.wallet_core.ui.WalletBaseUI");
            C76955f mx02 = ((C76954e) C86312j.m106911c(cls)).mx0(1);
            C87412m.m108592e(mx02, "null cannot be cast to non-null type com.tencent.mm.modelbase.NetSceneBase");
            ((WalletBaseUI) activity).doSceneProgress((C117747y) mx02, false);
        } else if (aVar instanceof C78709x.C78710a.C78718h) {
            this.f230436d.mo108647c3(C78709x.C78719b.C78720a.f230429a);
            C78709x xVar3 = this.f230436d;
            String str2 = ((C78709x.C78710a.C78718h) aVar).f230428a;
            xVar3.getClass();
            Log.m105924i("MicroMsg.WalletOpenTouchPayAfterPayFinishUIC", "request authentication");
            if (Util.isNullOrNil(str2)) {
                Log.m105928w("MicroMsg.WalletOpenTouchPayAfterPayFinishUIC", "no challenge!!");
                return;
            }
            C115669n.INSTANCE.mo175911u(1104, 41);
            C78092f fVar = new C78092f(str2, 1);
            fVar.f228897d = MMApplicationContext.getString(C0966R.string.m8z);
            fVar.f228898e = MMApplicationContext.getString(C0966R.string.m8y);
            fVar.f228899f = MMApplicationContext.getString(C0966R.string.f7926wf);
            ((C78101i) C86709a0.m107533q(cls2)).mo108082n4(xVar3.getContext(), fVar, new C78668g0(xVar3));
        } else if (aVar instanceof C78709x.C78710a.C78714d) {
            AppCompatActivity activity2 = this.f230436d.getActivity();
            C87412m.m108592e(activity2, "null cannot be cast to non-null type com.tencent.mm.wallet_core.ui.WalletBaseUI");
            C78709x.C78710a.C78714d dVar = (C78709x.C78710a.C78714d) aVar;
            C47294g RG = ((C76954e) C86312j.m106911c(cls)).mo72336RG(dVar.f230424a, dVar.f230425b, this.f230436d.f230417d, 1);
            C87412m.m108592e(RG, "null cannot be cast to non-null type com.tencent.mm.modelbase.NetSceneBase");
            ((WalletBaseUI) activity2).doSceneProgress((C117747y) RG, true);
        } else if (aVar instanceof C78709x.C78710a.C78711a) {
            AppCompatActivity activity3 = this.f230436d.getActivity();
            C87412m.m108592e(activity3, "null cannot be cast to non-null type com.tencent.mm.wallet_core.ui.WalletBaseUI");
            ((WalletBaseUI) activity3).doSceneProgress(new C78342e0((String) null, 19), true);
        } else if (aVar instanceof C78709x.C78710a.C78715e) {
            C76879j.m92711E(this.f230436d.getActivity(), this.f230436d.getString(C0966R.string.eug), this.f230436d.getString(C0966R.string.euc), this.f230436d.getString(C0966R.string.l39), false, new C78725y(this.f230436d));
        } else if (aVar instanceof C78709x.C78710a.C78716f) {
            this.f230436d.getActivity().finish();
        }
    }
}
