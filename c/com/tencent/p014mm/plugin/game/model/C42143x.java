package com.tencent.p014mm.plugin.game.model;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.tencent.p014mm.game.report.C40314g;
import com.tencent.p014mm.plugin.game.model.C42119w;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import h81.C32735h;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Map;
import k20.C9556a;
import ke3.C88144b;
import p763ym.C79138l;
import sw1.C48484q;
import uy1.C52642c;
import v10.C52735e;

/* renamed from: com.tencent.mm.plugin.game.model.x */
public class C42143x implements View.OnClickListener {

    /* renamed from: d */
    public int f113589d;

    /* renamed from: e */
    public Context f113590e;

    /* renamed from: com.tencent.mm.plugin.game.model.x$a */
    public static class C42144a {

        /* renamed from: a */
        public C42119w f113591a;

        /* renamed from: b */
        public String f113592b;

        /* renamed from: c */
        public int f113593c;

        /* renamed from: d */
        public int f113594d;

        public C42144a(C42119w wVar, String str, int i, int i2) {
            this.f113591a = wVar;
            this.f113592b = str;
            this.f113593c = i;
            this.f113594d = i2;
        }
    }

    public C42143x(Context context) {
        this.f113590e = context;
    }

    /* renamed from: a */
    public static int m45831a(Context context, C42119w wVar, C42119w.C42131l lVar, String str, int i) {
        Class cls = C79138l.class;
        int i2 = lVar.f113535d;
        int i3 = 3;
        boolean z = true;
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 == 3) {
                    return m45832b(context, str, i);
                }
                if (i2 == 4) {
                    if (wVar != null) {
                        wVar.field_isRead = true;
                        ((C48484q) C86312j.m106911c(C48484q.class)).xi0().update(wVar, new String[0]);
                    }
                    Intent intent = new Intent();
                    if (((C52735e) C86312j.m106911c(C52735e.class)).mo61266Ad(C32735h.C32737c.clicfg_game_open_message_center_v2, 1) != 1) {
                        z = false;
                    }
                    if (z) {
                        intent.setClassName(context, "com.tencent.mm.plugin.game.ui.chat_tab.ChatRoomTabUI");
                    } else {
                        intent.setClassName(context, "com.tencent.mm.plugin.game.ui.GameMessageUI");
                    }
                    intent.putExtra("game_report_from_scene", i);
                    C9556a aVar = new C9556a();
                    aVar.mo10233c(intent);
                    C117292a.m165358d(context, aVar.mo10232b(), "com/tencent/mm/plugin/game/model/GameMessageClickListener", "dealMsgJumpMsgCenter", "(Landroid/content/Context;Lcom/tencent/mm/plugin/game/model/GameMessage;I)I", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    context.startActivity((Intent) aVar.mo10231a(0));
                    C117292a.m165359e(context, "com/tencent/mm/plugin/game/model/GameMessageClickListener", "dealMsgJumpMsgCenter", "(Landroid/content/Context;Lcom/tencent/mm/plugin/game/model/GameMessage;I)I", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    return 6;
                } else if (i2 != 5) {
                    if (i2 != 7) {
                        Log.m105924i("MicroMsg.GameMessageClickListener", "unknown msg jump type = " + lVar.f113535d);
                        return 0;
                    }
                    Intent intent2 = new Intent();
                    intent2.putExtra("key_can_select_video_and_pic", true);
                    intent2.putExtra("key_send_raw_image", false);
                    intent2.putExtra("max_select_count", 9);
                    intent2.putExtra("query_source_type", 15);
                    intent2.putExtra("query_media_type", 2);
                    intent2.putExtra("show_header_view", false);
                    intent2.addFlags(67108864);
                    intent2.putExtra("game_haowan_ignore_video_preview", true);
                    intent2.putExtra("game_haowan_force_select", true);
                    intent2.putExtra("game_straight_to_publish", true);
                    intent2.putExtra("game_media_default_type", 1);
                    C88144b.m109791i(context, "game", ".media.GamePublishGalleryUI", intent2, (Bundle) null);
                    return 0;
                } else if (Util.isNullOrNil(lVar.jump_url)) {
                    return 0;
                } else {
                    if (C52642c.m58985c(context, lVar.jump_url)) {
                        return 30;
                    }
                    C52642c.m59000r(context, lVar);
                    return 7;
                }
            } else if (((C79138l) C86312j.m106911c(cls)).Tb0(context, str)) {
                C42046d.m45751j(context, str);
            } else {
                i3 = 0;
            }
        } else if (((C79138l) C86312j.m106911c(cls)).Tb0(context, str)) {
            C42046d.m45751j(context, str);
        } else {
            i3 = m45832b(context, str, i);
        }
        return i3;
    }

    /* renamed from: b */
    public static int m45832b(Context context, String str, int i) {
        if (Util.isNullOrNil(str)) {
            return 0;
        }
        Bundle bundle = new Bundle();
        bundle.putCharSequence("game_app_id", str);
        bundle.putInt("game_report_from_scene", i);
        return C52642c.m58996n(context, str, (String) null, bundle, 0);
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/game/model/GameMessageClickListener", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (view.getTag() == null || !(view.getTag() instanceof C42144a)) {
            Log.m105920e("MicroMsg.GameMessageClickListener", "v.getTag is null");
            C117292a.m165361g(this, "com/tencent/mm/plugin/game/model/GameMessageClickListener", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        C42144a aVar = (C42144a) view.getTag();
        C42119w wVar = aVar.f113591a;
        if (wVar == null) {
            Log.m105920e("MicroMsg.GameMessageClickListener", "message is null");
            C117292a.m165361g(this, "com/tencent/mm/plugin/game/model/GameMessageClickListener", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        String str = aVar.f113592b;
        if (str == null) {
            Log.m105920e("MicroMsg.GameMessageClickListener", "jumpId is null");
            C117292a.m165361g(this, "com/tencent/mm/plugin/game/model/GameMessageClickListener", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        C42119w.C42131l lVar = wVar.f113494t1.get(str);
        if (lVar == null) {
            Log.m105920e("MicroMsg.GameMessageClickListener", "jumpInfo is null");
            C117292a.m165361g(this, "com/tencent/mm/plugin/game/model/GameMessageClickListener", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        Context context = this.f113590e;
        C42119w wVar2 = aVar.f113591a;
        int a = m45831a(context, wVar2, lVar, wVar2.field_appId, aVar.f113593c);
        if (a != 0) {
            String a2 = C40314g.m43482a((String) null, (String) null, aVar.f113591a.f113474g2, (Map) null);
            Context context2 = this.f113590e;
            int i = aVar.f113593c;
            int i2 = aVar.f113594d;
            C42119w wVar3 = aVar.f113591a;
            C40314g.m43485d(context2, 13, i, i2, a, 0, wVar3.field_appId, this.f113589d, wVar3.f113470e2, wVar3.field_gameMsgId, wVar3.f113472f2, a2);
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/game/model/GameMessageClickListener", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    public C42143x(Context context, int i) {
        this.f113590e = context;
        this.f113589d = i;
    }
}
