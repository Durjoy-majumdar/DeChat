package com.tencent.p014mm.plugin.game.model;

import com.tencent.p014mm.plugin.game.model.C42119w;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.NetStatusUtil;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p933be.C113159b;
import u24.C90598g;

/* renamed from: com.tencent.mm.plugin.game.model.c0 */
public class C42044c0 {

    /* renamed from: a */
    public static C42044c0 f113285a;

    /* renamed from: a */
    public final void mo66013a(Map<String, String> map, C42119w wVar) {
        wVar.f113490p1 = Util.getInt(map.get(".sysmsg.gamecenter.entrance.entrance_red_dot_type"), 0) > 0;
        wVar.f113491q1.f113528b = Util.nullAs(map.get(".sysmsg.gamecenter.entrance.entrance_icon_url"), "");
        if (!Util.isNullOrNil(map.get(".sysmsg.gamecenter.msg_bubble_info.bubble_icon_url")) || !Util.isNullOrNil(map.get(".sysmsg.gamecenter.msg_bubble_info.bubble_desc"))) {
            wVar.f113492r1 = true;
        } else {
            wVar.f113492r1 = false;
        }
    }

    /* renamed from: b */
    public final float mo66014b(List<C42119w.C42122c> list, float f, float f2) {
        float f3;
        Iterator<C42119w.C42122c> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                f3 = 1.0f;
                break;
            }
            C42119w.C42122c next = it.next();
            if (((float) next.f113509b) <= f && ((float) next.f113508a) > f) {
                f3 = (float) next.f113510c;
                break;
            }
        }
        Log.m105919d("MicroMsg.GameNewMessageParser", "gamelog.srv_msg, parser, caculate, caculate common strategy factor: %f", Float.valueOf(f3));
        return f3 * f2;
    }

    /* renamed from: c */
    public final List<C42119w.C42122c> mo66015c(String str, Map<String, String> map) {
        String str2;
        ArrayList arrayList = new ArrayList();
        String str3 = str + ".arg_list";
        int i = 0;
        while (true) {
            if (i == 0) {
                str2 = str3;
            } else {
                str2 = str3 + i;
            }
            if (!map.containsKey(str2)) {
                return arrayList;
            }
            i++;
            C42119w.C42122c cVar = new C42119w.C42122c();
            cVar.f113508a = Util.getInt(map.get(str2 + ".up_bound"), 0);
            cVar.f113509b = Util.getInt(map.get(str2 + ".low_bound"), 0);
            cVar.f113510c = Util.getInt(map.get(str2 + ".arg_value"), 1);
            arrayList.add(cVar);
        }
    }

    /* renamed from: d */
    public final List<String> mo66016d(String str, Map<String, String> map) {
        String str2;
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (true) {
            if (i == 0) {
                str2 = str;
            } else {
                str2 = str + i;
            }
            if (!map.containsKey(str2)) {
                return arrayList;
            }
            i++;
            String str3 = map.get(str2 + ".$pkg_id");
            if (!Util.isNullOrNil(str3)) {
                arrayList.add(str3);
            }
        }
    }

    /* renamed from: e */
    public final void mo66017e(Map<String, String> map, C42119w wVar) {
        wVar.f113459T1.f113522a = Util.nullAs(map.get(".sysmsg.gamecenter.banner.$banner_id"), "");
        ((ArrayList) wVar.f113459T1.f113523b).clear();
        ((ArrayList) wVar.f113459T1.f113523b).addAll(mo66016d(".sysmsg.gamecenter.banner.load_with_wepkg.wepkg", map));
    }

    /* renamed from: f */
    public final void mo66018f(Map<String, String> map, C42119w wVar) {
        boolean z = false;
        wVar.f113491q1.f113527a = Util.getInt(map.get(".sysmsg.gamecenter.entrance.entrance_red_dot_type"), 0);
        wVar.f113491q1.f113528b = Util.nullAs(map.get(".sysmsg.gamecenter.entrance.entrance_icon_url"), "");
        wVar.f113491q1.f113529c = Util.nullAs(map.get(".sysmsg.gamecenter.entrance.entrance_text"), "");
        wVar.f113491q1.f113530d = Util.getInt(map.get(".sysmsg.gamecenter.entrance.entrance_icon_width"), 64) / 2;
        wVar.f113491q1.f113531e = Util.getInt(map.get(".sysmsg.gamecenter.entrance.entrance_icon_height"), 64) / 2;
        wVar.f113491q1.f113532f = Util.getInt(map.get(".sysmsg.gamecenter.entrance.entrance_icon_rounded_corner"), 0) == 1;
        wVar.f113491q1.f113533g = Util.getInt(map.get(".sysmsg.gamecenter.entrance.entrance_show_control.basic_type"), -1);
        C42119w.C42130k kVar = wVar.f113491q1;
        if (Util.getInt(map.get(".sysmsg.gamecenter.entrance.entrance_show_control.ignore_local_control"), 0) == 1) {
            z = true;
        }
        kVar.f113534h = z;
    }

    /* renamed from: g */
    public final void mo66019g(Map<String, String> map, C42119w wVar) {
        wVar.f113466a2.f113517a = C90598g.m113507f(Util.nullAs(map.get(".sysmsg.gamecenter.extra_data.preload"), ""));
        if (!Util.isNullOrNil(wVar.f113466a2.f113517a) && wVar.f113466a2.f113517a.getBytes().length > 204800) {
            wVar.f113466a2.f113517a = "";
        }
    }

    /* renamed from: h */
    public final void mo66020h(Map<String, String> map, C42119w wVar) {
        wVar.f113442C1.f113503a = Util.nullAs(map.get(".sysmsg.gamecenter.float_layer.open_url"), "");
        boolean z = false;
        wVar.f113442C1.f113504b = Util.getInt(map.get(".sysmsg.gamecenter.float_layer.full_screen"), 0) == 1;
        wVar.f113442C1.f113505c = Util.getInt(map.get(".sysmsg.gamecenter.float_layer.orientation"), 0);
        C42119w.C42121b bVar = wVar.f113442C1;
        if (Util.getInt(map.get(".sysmsg.gamecenter.float_layer.is_transparent"), 0) == 1) {
            z = true;
        }
        bVar.f113506d = z;
        ((ArrayList) wVar.f113442C1.f113507e).clear();
        ((ArrayList) wVar.f113442C1.f113507e).addAll(mo66016d(".sysmsg.gamecenter.float_layer.load_with_wepkg.wepkg", map));
    }

    /* renamed from: i */
    public final void mo66021i(Map<String, String> map, C42119w wVar) {
        C42119w.C42127h hVar = wVar.f113464Y1;
        boolean z = false;
        if (Util.getInt(map.get(".sysmsg.gamecenter.gamelife.replace_notice"), 0) == 1) {
            z = true;
        }
        hVar.f113520a = z;
        if (map.get(".sysmsg.gamecenter.gamelife.chatmsg") != null) {
            wVar.f113464Y1.getClass();
        } else {
            wVar.f113464Y1.getClass();
        }
        wVar.f113464Y1.f113521b.f113501a = Util.nullAs(map.get(".sysmsg.gamecenter.gamelife.chatroom.top_chatroom_name"), "");
        wVar.f113464Y1.f113521b.f113502b = Util.nullAs(map.get(".sysmsg.gamecenter.gamelife.chatroom.entrance_open_chatroom_name"), "");
    }

    /* renamed from: j */
    public final void mo66022j(Map<String, String> map, C42119w wVar) {
        wVar.f113465Z1.f113554a = Util.nullAs(map.get(".sysmsg.gamecenter.tab_info.default_key"), "");
        wVar.f113465Z1.f113555b = Util.nullAs(map.get(".sysmsg.gamecenter.tab_info.red_dot.key"), "");
        if (!Util.isNullOrNil(wVar.f113465Z1.f113555b)) {
            wVar.f113465Z1.f113556c = wVar.field_createTime + Util.getLong(map.get(".sysmsg.gamecenter.tab_info.red_dot.expire_time"), 86400);
        }
    }

    /* renamed from: k */
    public final void mo66023k(Map<String, String> map, C42119w wVar) {
        wVar.f113463X1.f113557a = Util.nullAs(map.get(".sysmsg.gamecenter.msg_center_v2.$jump_id"), "");
        wVar.f113463X1.f113558b = Util.getInt(map.get(".sysmsg.gamecenter.msg_center_v2.show_type"), 0);
        wVar.f113463X1.f113559c = Util.getInt(map.get(".sysmsg.gamecenter.msg_center_v2.not_in_msg_center"), 0);
        wVar.f113463X1.f113560d = Util.nullAs(map.get(".sysmsg.gamecenter.msg_center_v2.msg_sender.sender_icon"), "");
        wVar.f113463X1.f113561e = Util.nullAs(map.get(".sysmsg.gamecenter.msg_center_v2.msg_sender.sender_name"), "");
        wVar.f113463X1.f113562f = Util.nullAs(map.get(".sysmsg.gamecenter.msg_center_v2.msg_sender.$jump_id"), "");
        wVar.f113463X1.f113563g = Util.nullAs(map.get(".sysmsg.gamecenter.msg_center_v2.notify_msg_content.content_pic"), "");
        wVar.f113463X1.f113564h = Util.nullAs(map.get(".sysmsg.gamecenter.msg_center_v2.notify_msg_content.first_line_text"), "");
        wVar.f113463X1.f113565i = Util.nullAs(map.get(".sysmsg.gamecenter.msg_center_v2.notify_msg_content.second_line_text"), "");
        wVar.f113463X1.f113566j = Util.nullAs(map.get(".sysmsg.gamecenter.msg_center_v2.interactive_msg_content.merge_id"), "");
        wVar.f113463X1.f113567k = Util.getInt(map.get(".sysmsg.gamecenter.msg_center_v2.interactive_msg_content.merge_count"), 0);
        wVar.f113463X1.f113568l = Util.nullAs(map.get(".sysmsg.gamecenter.msg_center_v2.interactive_msg_content.body_text"), "");
        wVar.f113463X1.f113574r = Util.nullAs(map.get(".sysmsg.gamecenter.msg_center_v2.interactive_msg_content.action_desc"), "");
        wVar.f113463X1.f113575s = Util.nullAs(map.get(".sysmsg.gamecenter.msg_center_v2.interactive_msg_content.action_text"), "");
        wVar.f113463X1.f113577u = Util.nullAs(map.get(".sysmsg.gamecenter.msg_center_v2.interactive_msg_content.quick_response_content_id"), "");
        wVar.f113463X1.f113576t = Util.nullAs(map.get(".sysmsg.gamecenter.msg_center_v2.interactive_msg_content.quota_text"), "");
        wVar.f113463X1.f113578v = Util.getInt(map.get(".sysmsg.gamecenter.msg_center_v2.interactive_msg_content.support_quick_response_flag"), 0);
        wVar.f113463X1.f113569m = Util.nullAs(map.get(".sysmsg.gamecenter.msg_center.second_line.second_line_content"), "");
        wVar.f113463X1.f113570n = Util.nullAs(map.get(".sysmsg.gamecenter.msg_center_v2.interactive_msg_content.right_pic"), "");
        wVar.f113463X1.f113571o = Util.nullAs(map.get(".sysmsg.gamecenter.msg_center_v2.interactive_msg_content.right_text"), "");
        wVar.f113463X1.f113572p = Util.nullAs(map.get(".sysmsg.gamecenter.msg_center_v2.interactive_msg_content.source_name"), "");
        wVar.f113463X1.f113573q = Util.nullAs(map.get(".sysmsg.gamecenter.msg_center_v2.interactive_msg_content.related_id"), "");
        wVar.f113463X1.f113580x = Util.nullAs(map.get(".sysmsg.gamecenter.msg_center_v2.interactive_msg_content.$merge_jump_id"), "");
        wVar.f113463X1.f113579w = Util.nullAs(map.get(".sysmsg.gamecenter.msg_center_v2.interactive_msg_content.$comment_jump_id"), "");
    }

    /* renamed from: l */
    public final void mo66024l(Map<String, String> map, C42119w wVar) {
        String str;
        if (wVar != null && map != null) {
            wVar.f113467b2.f113513a = Util.getInt(map.get(".sysmsg.gamecenter.exposure_strategy.exposure_count"), 4);
            ((ArrayList) wVar.f113467b2.f113514b.f113511a).clear();
            ((ArrayList) wVar.f113467b2.f113514b.f113511a).addAll(mo66015c(".sysmsg.gamecenter.exposure_strategy.wifi_strategy", map));
            boolean z = false;
            wVar.f113467b2.f113514b.f113512b = Util.getInt(map.get(".sysmsg.gamecenter.exposure_strategy.wifi_strategy.enabled"), 0) == 1;
            ((ArrayList) wVar.f113467b2.f113515c.f113511a).clear();
            ((ArrayList) wVar.f113467b2.f113515c.f113511a).addAll(mo66015c(".sysmsg.gamecenter.exposure_strategy.expire_time_strategy", map));
            wVar.f113467b2.f113515c.f113512b = Util.getInt(map.get(".sysmsg.gamecenter.exposure_strategy.expire_time_strategy.enabled"), 0) == 1;
            ((ArrayList) wVar.f113467b2.f113516d.f113511a).clear();
            ((ArrayList) wVar.f113467b2.f113516d.f113511a).addAll(mo66015c(".sysmsg.gamecenter.exposure_strategy.battery_strategy", map));
            wVar.f113467b2.f113516d.f113512b = Util.getInt(map.get(".sysmsg.gamecenter.exposure_strategy.battery_strategy.enabled"), 0) == 1;
            ((ArrayList) wVar.f113468c2).clear();
            List<C42119w.C42126g> list = wVar.f113468c2;
            ArrayList arrayList = new ArrayList();
            int i = 0;
            while (true) {
                if (i == 0) {
                    str = ".sysmsg.gamecenter.exposure_strategy.history_message_list";
                } else {
                    str = ".sysmsg.gamecenter.exposure_strategy.history_message_list" + i;
                }
                if (!map.containsKey(str)) {
                    break;
                }
                i++;
                C42119w.C42126g gVar = new C42119w.C42126g();
                gVar.f113518a = Util.nullAs(map.get(str + ".msg_id"), "");
                gVar.f113519b = Util.getFloat(map.get(str + ".click_score"), 0.5f);
                arrayList.add(gVar);
            }
            ((ArrayList) list).addAll(arrayList);
            float f = wVar.field_clickScore;
            C42119w.C42124e eVar = wVar.f113467b2;
            if (eVar.f113514b.f113512b) {
                float f2 = NetStatusUtil.isWifi(MMApplicationContext.getContext()) ? 1.0f : 0.0f;
                Log.m105919d("MicroMsg.GameNewMessageParser", "gamelog.srv_msg, parser, caculate, gameMsgId:%s caculate score wifi status: %f", wVar.field_gameMsgId, Float.valueOf(f2));
                f = mo66014b(eVar.f113514b.f113511a, f2, f);
            }
            if (eVar.f113516d.f113512b) {
                float b = (float) C113159b.m154842h().mo165664a().mo165677b();
                Log.m105919d("MicroMsg.GameNewMessageParser", "gamelog.srv_msg, parser, caculate, gameMsgId:%s caculate score battery level: %f", wVar.field_gameMsgId, Float.valueOf(b));
                f = mo66014b(eVar.f113516d.f113511a, b, f);
            }
            if (eVar.f113515c.f113512b) {
                float nowSecond = ((float) (wVar.field_expireTime - Util.nowSecond())) / 3600.0f;
                Log.m105919d("MicroMsg.GameNewMessageParser", "gamelog.srv_msg, parser, caculate, gameMsgId:%s caculate score time before expire: %f", wVar.field_gameMsgId, Float.valueOf(nowSecond));
                f = mo66014b(eVar.f113515c.f113511a, nowSecond, f);
            }
            wVar.f113480j2 = f;
            if (Util.getInt(map.get(".sysmsg.gamecenter.exposure_strategy.ignore_exceed_exposure"), 0) == 1) {
                z = true;
            }
            wVar.f113482k2 = z;
        }
    }

    /* renamed from: m */
    public final void mo66025m(Map<String, String> map, C42119w wVar) {
        wVar.f113470e2 = Util.getInt(map.get(".sysmsg.gamecenter.report.msg_subtype"), 0);
        wVar.f113472f2 = Util.nullAs(map.get(".sysmsg.gamecenter.report.noticeid"), "");
        wVar.f113474g2 = Util.nullAs(map.get(".sysmsg.gamecenter.report.ext_data"), "");
        wVar.f113476h2 = Util.nullAs(map.get(".sysmsg.gamecenter.report.business_data"), "");
    }
}
