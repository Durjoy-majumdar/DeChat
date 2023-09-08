package gz0;

import android.text.TextUtils;
import com.tencent.p014mm.autogen.events.ShakeAcceptCouponCardEvent;
import com.tencent.p014mm.plugin.card.model.CardInfo;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import f40.C86709a0;
import hz0.C21036o;
import hz0.C46153l0;
import ob0.C11385n;
import ob0.C117747y;
import te3.xa4;
import wz0.C22943h;

/* renamed from: gz0.a */
public class C20866a extends IStaticListener<ShakeAcceptCouponCardEvent> implements C11385n {

    /* renamed from: d */
    public ShakeAcceptCouponCardEvent f58955d;

    public boolean callback(IEvent iEvent) {
        ShakeAcceptCouponCardEvent shakeAcceptCouponCardEvent = (ShakeAcceptCouponCardEvent) iEvent;
        if (!C86709a0.m107522a()) {
            Log.m105920e("MicroMsg.AccessCardEventListener", "ShakeAcceptCouponCardEvent account is not ready");
        } else if (shakeAcceptCouponCardEvent instanceof ShakeAcceptCouponCardEvent) {
            this.f58955d = shakeAcceptCouponCardEvent;
            ShakeAcceptCouponCardEvent.C17691a aVar = shakeAcceptCouponCardEvent.f48126d;
            String str = aVar.f48128a;
            String str2 = aVar.f48129b;
            int i = aVar.f48130c;
            if (TextUtils.isEmpty(str)) {
                Log.m105920e("MicroMsg.AccessCardEventListener", "ShakeAcceptCouponCardEvent card_id is empty");
                Runnable runnable = this.f58955d.callback;
                if (runnable != null) {
                    runnable.run();
                }
                this.f58955d = null;
            } else {
                C86709a0.m107529k().f251779b.mo123455a(1037, this);
                Log.m105924i("MicroMsg.AccessCardEventListener", "ShakeAcceptCouponCardEvent doscene from scene " + i);
                C86709a0.m107529k().f251779b.mo123460f(new C21036o(str, i, "", str2, "", "", 0, 0, (xa4) null));
                return true;
            }
        }
        return false;
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        if (yVar instanceof C21036o) {
            ShakeAcceptCouponCardEvent.C17692b bVar = new ShakeAcceptCouponCardEvent.C17692b();
            Log.m105924i("MicroMsg.AccessCardEventListener", "NetSceneAcceptCardItem doscene return errcode " + i2 + " errmsg" + str);
            if (i == 0 && i2 == 0) {
                Log.m105924i("MicroMsg.AccessCardEventListener", "NetSceneAcceptCardItem doscene is success");
                C21036o oVar = (C21036o) yVar;
                int i3 = oVar.f59521g;
                String str2 = oVar.f59520f;
                String str3 = oVar.f59522h;
                if (i3 == 0) {
                    Log.m105924i("MicroMsg.AccessCardEventListener", "NetSceneAcceptCardItem doscene return ok ");
                    bVar.f48132b = true;
                    CardInfo cardInfo = new CardInfo();
                    C22943h.m26972i(cardInfo, str2);
                    if (!TextUtils.isEmpty(cardInfo.field_card_id)) {
                        bVar.f48131a = cardInfo.field_card_id;
                    } else {
                        Log.m105924i("MicroMsg.AccessCardEventListener", "NetSceneAcceptCardItem doscene return card_id is empty ");
                        bVar.f48131a = "";
                    }
                    C46153l0.yx0().mo71383b("key_accept_card_info", cardInfo);
                } else {
                    Log.m105924i("MicroMsg.AccessCardEventListener", "NetSceneAcceptCardItem doscene return false, retCode " + i3 + " retMsg" + str3);
                    bVar.f48132b = false;
                }
            } else {
                Log.m105924i("MicroMsg.AccessCardEventListener", "NetSceneAcceptCardItem doscene is fail");
                bVar.f48132b = false;
            }
            C86709a0.m107529k().f251779b.mo123470p(1037, this);
            ShakeAcceptCouponCardEvent shakeAcceptCouponCardEvent = this.f58955d;
            shakeAcceptCouponCardEvent.f48127e = bVar;
            Runnable runnable = shakeAcceptCouponCardEvent.callback;
            if (runnable != null) {
                runnable.run();
            }
            this.f58955d = null;
        }
    }
}
