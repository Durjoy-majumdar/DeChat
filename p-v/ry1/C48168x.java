package ry1;

import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.SendMsgEvent;
import com.tencent.p014mm.game.report.C40314g;
import com.tencent.p014mm.message.C68070l;
import com.tencent.p014mm.message.C80996q;
import com.tencent.p014mm.plugin.game.p061ui.GameDetailUI2;
import com.tencent.p014mm.sdk.platformtools.Util;
import eb0.C45628s0;
import nj3.C76879j;
import p141db.C7257a;
import py1.C47643o4;
import wd3.C65953v0;

/* renamed from: ry1.x */
public class C48168x implements C65953v0 {

    /* renamed from: a */
    public final /* synthetic */ String f129103a;

    /* renamed from: b */
    public final /* synthetic */ GameDetailUI2 f129104b;

    public C48168x(GameDetailUI2 gameDetailUI2, String str) {
        this.f129104b = gameDetailUI2;
        this.f129103a = str;
    }

    /* renamed from: a */
    public void mo23a(boolean z, String str, int i) {
        if (z) {
            GameDetailUI2 gameDetailUI2 = this.f129104b;
            String str2 = this.f129103a;
            int i2 = GameDetailUI2.f113761V0;
            gameDetailUI2.getClass();
            C68070l.C68072b bVar = new C68070l.C68072b();
            C47643o4 o4Var = gameDetailUI2.f113802p0;
            bVar.f195570f = o4Var.f127908e;
            bVar.f195574g = o4Var.f127909f;
            bVar.f195582i = 5;
            if (Util.isNullOrNil(o4Var.f127907d)) {
                bVar.f195646y = gameDetailUI2.f113793e.field_appIconUrl;
            } else {
                bVar.f195646y = gameDetailUI2.f113802p0.f127907d;
            }
            bVar.f195586j = gameDetailUI2.f113802p0.f127911h;
            if (C80996q.C1279a.m1369a() != null) {
                C80996q.C1279a.m1369a().mo112827qE(bVar, gameDetailUI2.f113792d, gameDetailUI2.f113793e.field_appName, str2, (String) null, (byte[]) null);
            }
            if (!Util.isNullOrNil(str)) {
                SendMsgEvent sendMsgEvent = new SendMsgEvent();
                SendMsgEvent.C1132a aVar = sendMsgEvent.f9496d;
                aVar.f9497a = str2;
                aVar.f9498b = str;
                aVar.f9499c = C45628s0.m50810y(str2);
                sendMsgEvent.f9496d.f9500d = 0;
                sendMsgEvent.publish();
            }
            GameDetailUI2 gameDetailUI22 = this.f129104b;
            C76879j.m92726T(gameDetailUI22, gameDetailUI22.getResources().getString(C0966R.string.bjc));
            AppCompatActivity context = this.f129104b.getContext();
            GameDetailUI2 gameDetailUI23 = this.f129104b;
            C40314g.m43487f(context, 12, C7257a.CTRL_INDEX, 2, 14, gameDetailUI23.f113792d, gameDetailUI23.f113799n, (String) null);
        }
    }
}
