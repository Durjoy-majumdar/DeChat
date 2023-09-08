package b63;

import com.tencent.p014mm.autogen.events.WalletGetBulletinEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import di3.C86312j;
import e63.C31432e;
import f40.C86709a0;
import java.util.Date;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C89137b0;
import p281yz.C79173v;
import te3.C77933g43;
import v53.C37676g;

/* renamed from: b63.b0 */
public class C28262b0 extends IStaticListener<WalletGetBulletinEvent> implements C11385n {

    /* renamed from: d */
    public WalletGetBulletinEvent f77825d;

    /* renamed from: e */
    public String f77826e = null;

    public boolean callback(IEvent iEvent) {
        WalletGetBulletinEvent walletGetBulletinEvent = (WalletGetBulletinEvent) iEvent;
        this.f77825d = walletGetBulletinEvent;
        this.f77826e = walletGetBulletinEvent.f79042d.f79044a;
        long longValue = ((Long) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_WALLET_BULLETIN_GET_TIME_LONG, 0L)).longValue();
        long time = new Date().getTime();
        long j = 600000;
        long longValue2 = ((Long) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_WALLET_BULLETIN_UPDATE_INTERVAL_LONG, 600000L)).longValue();
        if (longValue2 > 0) {
            j = longValue2;
        }
        if (time - longValue > j || Util.isNullOrNil(this.f77826e)) {
            Log.m105924i("MicroMsg.WalletGetBulletinEventListener", "data is out of date,do NetSceneGetBannerInfo for update");
            C37676g gVar = new C37676g();
            C86709a0.m107528h();
            C89137b0 b0Var = C86709a0.m107529k().f251779b;
            b0Var.mo123455a(385, this);
            b0Var.mo123460f(gVar);
            return true;
        } else if (!Util.isNullOrNil(this.f77826e)) {
            Log.m105924i("MicroMsg.WalletGetBulletinEventListener", "get bulletin data from db");
            mo55892d();
            return true;
        } else {
            Log.m105920e("MicroMsg.WalletGetBulletinEventListener", "mScene is null");
            Runnable runnable = this.f77825d.callback;
            if (runnable != null) {
                runnable.run();
            }
            Runnable runnable2 = this.f77825d.f79042d.f79045b;
            if (runnable2 != null) {
                runnable2.run();
            }
            this.f77825d = null;
            return true;
        }
    }

    /* renamed from: d */
    public final void mo55892d() {
        C31432e Fx0 = ((C79173v) C86312j.m106911c(C79173v.class)).Fx0();
        C28271z zVar = new C28271z();
        zVar.field_bulletin_scene = this.f77826e;
        if (!Fx0.get(zVar, new String[0])) {
            Log.m105924i("MicroMsg.WalletGetBulletinEventListener", "not bulletin data ");
        } else {
            WalletGetBulletinEvent.C28848b bVar = this.f77825d.f79043e;
            bVar.f79046a = zVar.field_bulletin_scene;
            bVar.f79047b = zVar.field_bulletin_content;
            bVar.f79048c = zVar.field_bulletin_url;
            int i = zVar.field_type;
            bVar.f79049d = i;
            if (i == 2) {
                bVar.f79050e = new C77933g43();
                C77933g43 g432 = this.f77825d.f79043e.f79050e;
                g432.f227431d = zVar.field_is_show_notice;
                g432.f227433f = zVar.field_left_icon;
                g432.f227434g = zVar.field_jump_url;
                g432.f227432e = zVar.field_wording;
                g432.f227435h = zVar.field_notice_id;
            }
        }
        Runnable runnable = this.f77825d.callback;
        if (runnable != null) {
            runnable.run();
        }
        Runnable runnable2 = this.f77825d.f79042d.f79045b;
        if (runnable2 != null) {
            runnable2.run();
        }
        this.f77825d = null;
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        Log.m105924i("MicroMsg.WalletGetBulletinEventListener", "NetSceneGetBannerInfo resp,errType = " + i + ";errCode=" + i2);
        C86709a0.m107528h();
        C86709a0.m107529k().f251779b.mo123470p(385, this);
        C86709a0.m107528h();
        C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_WALLET_BULLETIN_GET_TIME_LONG, Long.valueOf(new Date().getTime()));
        mo55892d();
    }
}
