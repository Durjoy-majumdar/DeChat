package com.tencent.p014mm.plugin.game.p061ui;

import android.content.Intent;
import android.os.Bundle;
import com.tencent.p014mm.game.report.C40314g;
import com.tencent.p014mm.plugin.game.C4443h;
import com.tencent.p014mm.plugin.game.model.C42119w;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import f40.C86709a0;
import ke3.C88144b;
import sw1.C48483p;
import sw1.C48484q;
import uy1.C52638a;
import uy1.C52642c;

/* renamed from: com.tencent.mm.plugin.game.ui.GameCenterBaseUI */
public abstract class GameCenterBaseUI extends GameCenterActivity {

    /* renamed from: h */
    public boolean f113684h = false;

    /* renamed from: i */
    public int f113685i = 0;

    /* renamed from: j */
    public C42119w f113686j;

    /* renamed from: n */
    public C42119w f113687n;

    /* renamed from: o */
    public C42119w f113688o;

    /* renamed from: p */
    public boolean f113689p = false;

    /* renamed from: q */
    public boolean f113690q = true;

    /* renamed from: com.tencent.mm.plugin.game.ui.GameCenterBaseUI$a */
    public class C42161a implements Runnable {
        public C42161a() {
        }

        public void run() {
            Class cls = C48483p.class;
            GameCenterBaseUI gameCenterBaseUI = GameCenterBaseUI.this;
            if (gameCenterBaseUI.f113684h) {
                C42119w k = ((C48483p) C86312j.m106911c(cls)).mo66079ar().mo65982k();
                gameCenterBaseUI.f113686j = k;
                if (k != null) {
                    k.mo66075l2();
                }
                C42119w j = ((C48483p) C86312j.m106911c(cls)).mo66079ar().mo65981j();
                gameCenterBaseUI.f113687n = j;
                if (j != null) {
                    j.mo66075l2();
                }
            }
            C42119w g = ((C48483p) C86312j.m106911c(cls)).mo66079ar().mo65978g();
            gameCenterBaseUI.f113688o = g;
            if (g != null) {
                g.mo66075l2();
            }
            GameCenterBaseUI gameCenterBaseUI2 = GameCenterBaseUI.this;
            if (gameCenterBaseUI2.f113684h) {
                C42119w wVar = gameCenterBaseUI2.f113687n;
                if (wVar != null && wVar.field_isHidden == 0 && !Util.isNullOrNil(wVar.f113442C1.f113503a)) {
                    gameCenterBaseUI2.f113689p = true;
                    C42119w wVar2 = gameCenterBaseUI2.f113687n;
                    C52642c.m58999q(gameCenterBaseUI2.getBaseContext(), wVar2, "game_center_h5_floatlayer");
                    C40314g.m43485d(gameCenterBaseUI2, 10, 1006, 1, 1, 0, wVar2.field_appId, 0, wVar2.f113470e2, wVar2.field_gameMsgId, wVar2.f113472f2, (String) null);
                    C115669n.INSTANCE.idkeyStat(858, 18, 1, false);
                    gameCenterBaseUI2.f113687n.field_isRead = true;
                    ((C48484q) C86312j.m106911c(C48484q.class)).xi0().update(gameCenterBaseUI2.f113687n, new String[0]);
                }
                ((C48483p) C86312j.m106911c(cls)).mo66079ar().mo65975d();
            }
        }
    }

    /* renamed from: H7 */
    public String mo66117H7() {
        return null;
    }

    /* renamed from: I7 */
    public String mo66118I7() {
        return null;
    }

    /* renamed from: J7 */
    public int mo66119J7() {
        return 10;
    }

    /* renamed from: K7 */
    public int mo66120K7() {
        return this.f113685i;
    }

    /* renamed from: L7 */
    public int mo66121L7() {
        return 1000;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (!C86709a0.m107522a()) {
            Log.m105920e("MicroMsg.GameCenterBaseUI", "account not ready");
            finish();
            return;
        }
        this.f113685i = getIntent().getIntExtra("game_report_from_scene", 0);
        this.f113684h = getIntent().getBooleanExtra("from_find_more_friend", false);
        C52642c.m58994l().postToWorker(new C42161a());
        C40314g.m43485d(this, 10, 1000, 0, 1, 0, (String) null, this.f113685i, 0, (String) null, (String) null, (String) null);
    }

    public void onResume() {
        super.onResume();
        if (!C86709a0.m107522a()) {
            Log.m105920e("MicroMsg.GameCenterBaseUI", "account not ready");
            return;
        }
        if (!this.f113690q) {
            C52638a aVar = C52638a.C52640b.f146975a;
            if (aVar.f146972b) {
                aVar.f146972b = false;
                Log.m105924i("MicroMsg.GameCenterBaseUI", "restart page from country setting");
                if (!isFinishing()) {
                    finish();
                }
                sendBroadcast(new Intent("com.tencent.mm.game.ACTION_EXIT"), C4443h.f19181a);
                Intent intent = new Intent();
                intent.putExtra("game_report_from_scene", 901);
                intent.putExtra("switch_country_no_anim", true);
                C88144b.m109791i(this, "game", ".ui.GameCenterUI", intent, (Bundle) null);
            }
        }
        this.f113690q = false;
    }
}
