package com.tencent.p014mm.plugin.finder.service;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.autogen.events.DoFavoriteEvent;
import com.tencent.p014mm.message.C68070l;
import com.tencent.p014mm.plugin.finder.biz.FinderBizProfileFragment;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import di3.C86301e;
import di3.C86312j;
import eb0.C75592q0;
import ei3.C86522b;
import er1.C7888v2;
import gy3.C87412m;
import ht1.C60167f1;
import ht1.C60193p4;
import ht1.C60200t1;
import java.util.Map;
import ke3.C88144b;
import o40.C61926c;
import p1081gi.C98121d;
import te3.C101801kd0;
import te3.C101835rd0;
import te3.C64682rk1;

@C86522b
/* renamed from: com.tencent.mm.plugin.finder.service.g1 */
public final class C56281g1 extends C86301e implements C60193p4 {
    public String D90(String str, Map<String, String> map) {
        String s;
        C87412m.m108594g(str, "prefix");
        C87412m.m108594g(map, "values");
        C64682rk1 o = C60167f1.m70157o(str, map);
        if (o == null || (s = C68070l.C68072b.m80420s(C7888v2.f26513a.mo9008f(o), (String) null, (C98121d) null)) == null) {
            return null;
        }
        return s;
    }

    public boolean Vu0(AppCompatActivity appCompatActivity, String str, Map<String, String> map) {
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        C87412m.m108594g(str, "prefix");
        C87412m.m108594g(map, "values");
        C64682rk1 o = C60167f1.m70157o(str, map);
        if (o == null) {
            return false;
        }
        C7888v2.C7889a aVar = C7888v2.f26513a;
        aVar.getClass();
        C68070l.C68072b f = aVar.mo9008f(o);
        Intent intent = new Intent();
        intent.putExtra("Retr_Msg_Type", 18);
        intent.putExtra("Multi_Retr", true);
        intent.putExtra("Retr_Msg_content", C68070l.C68072b.m80420s(f, (String) null, (C98121d) null));
        intent.putExtra("Retr_go_to_chattingUI", false);
        intent.putExtra("Retr_show_success_tips", true);
        C88144b.m109801s(appCompatActivity, ".ui.transmit.MsgRetransmitUI", intent, (Bundle) null);
        return true;
    }

    public C64682rk1 an0(String str, Map<String, String> map) {
        C87412m.m108594g(str, "prefix");
        C87412m.m108594g(map, "values");
        return C60167f1.m70157o(str, map);
    }

    /* renamed from: f7 */
    public boolean mo78731f7(Context context, String str, Map<String, String> map, String str2) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(str, "prefix");
        C87412m.m108594g(map, "values");
        C64682rk1 o = C60167f1.m70157o(str, map);
        if (o == null) {
            return false;
        }
        Intent intent = new Intent();
        intent.putExtra("key_context_id", str2);
        intent.putExtra("report_scene", 11);
        intent.putExtra("from_user", C75592q0.m90789s());
        intent.putExtra("feed_object_id", C61926c.m72671P(o.f185183d));
        intent.putExtra("feed_object_nonceId", o.f185191o);
        intent.putExtra("key_comment_scene", 25);
        intent.putExtra("key_reuqest_scene", 3);
        ((C60200t1) C86312j.m106911c(C60200t1.class)).mo76864nr(context, intent);
        return true;
    }

    /* renamed from: kE */
    public boolean mo78732kE(AppCompatActivity appCompatActivity, String str, Map<String, String> map) {
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        C87412m.m108594g(str, "prefix");
        C87412m.m108594g(map, "values");
        C64682rk1 o = C60167f1.m70157o(str, map);
        if (o == null) {
            return false;
        }
        C7888v2.f26513a.getClass();
        DoFavoriteEvent doFavoriteEvent = new DoFavoriteEvent();
        C101801kd0 kd02 = new C101801kd0();
        C101835rd0 rd02 = new C101835rd0();
        rd02.mo141275k(C75592q0.m90789s());
        rd02.mo141274j(o.f185183d);
        rd02.mo141273f(Util.nowMilliSecond());
        kd02.mo141219q(rd02);
        kd02.mo141214l(o);
        DoFavoriteEvent.C92474a aVar = doFavoriteEvent.f264674d;
        aVar.f264679d = "";
        aVar.f264676a = kd02;
        aVar.f264678c = 20;
        aVar.f264684i = appCompatActivity;
        Log.m105924i("Finder.FinderFavUtil", "publish fav event, id:" + o.f185183d);
        doFavoriteEvent.publish();
        return true;
    }

    public C60193p4.C46113a mw0(String str, long j) {
        if (str == null) {
            str = "";
        }
        return new FinderBizProfileFragment(str, j);
    }
}
