package com.tencent.p014mm.plugin.game.model;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.tencent.p014mm.autogen.events.WepkgNotifyEvent;
import com.tencent.p014mm.game.report.C40314g;
import com.tencent.p014mm.plugin.game.commlib.util.C30081b;
import com.tencent.p014mm.plugin.game.model.C42036a0;
import com.tencent.p014mm.plugin.game.model.C42119w;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p206nj.C117627q;
import qy1.C12934a;
import sw1.C48483p;
import sw1.C48484q;
import uy1.C52642c;

/* renamed from: com.tencent.mm.plugin.game.model.u */
public class C42114u {
    /* renamed from: a */
    public static String m45824a(String str, C42119w wVar, Intent intent, boolean z) {
        if (wVar != null) {
            wVar.mo66075l2();
            if (intent != null && !intent.hasExtra("game_pre_inject_data")) {
                intent.putExtra("game_pre_inject_data", wVar.f113466a2.f113517a);
            }
            if (!Util.isNullOrNil(wVar.f113442C1.f113503a)) {
                if (z) {
                    List<String> list = wVar.f113442C1.f113507e;
                    if (!Util.isNullOrNil((List) list)) {
                        WepkgNotifyEvent wepkgNotifyEvent = new WepkgNotifyEvent();
                        WepkgNotifyEvent.C40188a aVar = wepkgNotifyEvent.f107837d;
                        aVar.f107838a = 8;
                        aVar.f107844g = 1;
                        aVar.f107845h = list;
                        wepkgNotifyEvent.publish();
                    }
                }
                str = m45825b(str, "h5FloatLayer=1");
                Log.m105925i("MicroMsg.GameEntranceChecker", "after checking float, url = %s", str);
            }
            if (!Util.isNullOrNil(wVar.f113459T1.f113522a)) {
                if (z) {
                    List<String> list2 = wVar.f113459T1.f113523b;
                    if (!Util.isNullOrNil((List) list2)) {
                        WepkgNotifyEvent wepkgNotifyEvent2 = new WepkgNotifyEvent();
                        WepkgNotifyEvent.C40188a aVar2 = wepkgNotifyEvent2.f107837d;
                        aVar2.f107838a = 8;
                        aVar2.f107844g = 1;
                        aVar2.f107845h = list2;
                        wepkgNotifyEvent2.publish();
                    }
                }
                try {
                    str = m45825b(str, "h5BannerId=" + C117627q.m165909b(wVar.f113459T1.f113522a, "UTF-8"));
                } catch (UnsupportedEncodingException unused) {
                }
                Log.m105925i("MicroMsg.GameEntranceChecker", "after checking banner, url = %s", str);
            }
            if (!Util.isNullOrNil(wVar.f113493s1.f113525b) && !Util.isNullOrNil(wVar.f113493s1.f113524a) && !Util.isNullOrNil(wVar.f113493s1.f113526c)) {
                str = m45825b(str, "hasBubble=1");
            }
            String b = m45825b(str, "localMsgId=" + wVar.field_msgId);
            str = m45825b(b, "gameMsgId=" + wVar.field_gameMsgId);
            if (!Util.isNullOrNil(wVar.f113476h2)) {
                try {
                    str = m45825b(str, "business_data=" + URLEncoder.encode(wVar.f113476h2, "utf-8"));
                } catch (UnsupportedEncodingException unused2) {
                }
            }
        }
        if (intent == null || !intent.hasExtra("key_game_url_ext_param")) {
            return str;
        }
        String stringExtra = intent.getStringExtra("key_game_url_ext_param");
        try {
            return m45825b(str, "fromGameParam=" + C117627q.m165909b(stringExtra, "UTF-8"));
        } catch (UnsupportedEncodingException e) {
            Log.m105920e("MicroMsg.GameEntranceChecker", e.getMessage());
            return str;
        }
    }

    /* renamed from: b */
    public static String m45825b(String str, String str2) {
        Uri parse = Uri.parse(str);
        String query = parse.getQuery();
        if (query != null) {
            str2 = query + "&" + str2;
        }
        try {
            return new URI(parse.getScheme(), parse.getAuthority(), parse.getPath(), str2, parse.getFragment()).toString();
        } catch (URISyntaxException e) {
            Log.printErrStackTrace("MicroMsg.GameEntranceChecker", e, "", new Object[0]);
            return str;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0075, code lost:
        if (r8 != 4) goto L_0x007b;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m45826c(android.content.Intent r3, java.lang.String r4, boolean r5, com.tencent.p014mm.plugin.game.model.C42119w r6, int r7, java.lang.String r8) {
        /*
            java.lang.String r0 = "geta8key_scene"
            r1 = 32
            r3.putExtra(r0, r1)
            java.lang.String r0 = "KPublisherId"
            r3.putExtra(r0, r4)
            java.lang.String r4 = "game_check_float"
            r3.putExtra(r4, r5)
            if (r5 == 0) goto L_0x0095
            if (r6 == 0) goto L_0x0095
            r6.mo66075l2()
            com.tencent.mm.plugin.game.model.w$b r4 = r6.f113442C1
            r5 = 1
            if (r4 == 0) goto L_0x0092
            java.lang.String r4 = r4.f113503a
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)
            if (r4 != 0) goto L_0x0092
            com.tencent.mm.plugin.game.luggage.GameFloatLayerInfo r4 = new com.tencent.mm.plugin.game.luggage.GameFloatLayerInfo
            r4.<init>()
            com.tencent.mm.plugin.game.model.w$b r0 = r6.f113442C1
            java.lang.String r0 = r0.f113503a
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r8)
            if (r1 != 0) goto L_0x0061
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r1 == 0) goto L_0x003b
            goto L_0x0061
        L_0x003b:
            android.net.Uri r8 = android.net.Uri.parse(r8)
            java.lang.String r1 = "nav_color"
            java.lang.String r8 = r8.getQueryParameter(r1)
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r8)
            if (r1 == 0) goto L_0x004c
            goto L_0x0061
        L_0x004c:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "nav_color="
            r1.append(r2)
            r1.append(r8)
            java.lang.String r8 = r1.toString()
            java.lang.String r0 = m45825b(r0, r8)
        L_0x0061:
            r4.f112846d = r0
            com.tencent.mm.plugin.game.model.w$b r8 = r6.f113442C1
            boolean r0 = r8.f113504b
            r4.f112847e = r0
            r0 = -1
            int r8 = r8.f113505c
            if (r8 == r5) goto L_0x007a
            r1 = 2
            if (r8 == r1) goto L_0x0078
            r1 = 3
            if (r8 == r1) goto L_0x007a
            r1 = 4
            if (r8 == r1) goto L_0x0078
            goto L_0x007b
        L_0x0078:
            r0 = 1
            goto L_0x007b
        L_0x007a:
            r0 = 0
        L_0x007b:
            r4.f112848f = r0
            com.tencent.mm.plugin.game.luggage.GameWebViewLaunchParams r8 = new com.tencent.mm.plugin.game.luggage.GameWebViewLaunchParams
            r8.<init>()
            r8.f112849d = r4
            java.lang.String r4 = "launchParams"
            r3.putExtra(r4, r8)
            com.tencent.mm.plugin.game.model.w$b r4 = r6.f113442C1
            java.lang.String r4 = r4.f113503a
            java.lang.String r8 = "game_float_layer_url"
            r3.putExtra(r8, r4)
        L_0x0092:
            m45828e(r6, r7, r5)
        L_0x0095:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.game.model.C42114u.m45826c(android.content.Intent, java.lang.String, boolean, com.tencent.mm.plugin.game.model.w, int, java.lang.String):void");
    }

    /* renamed from: d */
    public static void m45827d(Context context, Intent intent, String str, boolean z, C42119w wVar, int i) {
        intent.putExtra("geta8key_scene", 32);
        intent.putExtra("KPublisherId", str);
        intent.putExtra("game_check_float", z);
        if (z && wVar != null) {
            wVar.mo66075l2();
            C42119w.C42121b bVar = wVar.f113442C1;
            if (bVar.f113506d) {
                intent.putExtra("game_transparent_float_url", bVar.f113503a);
            }
            intent.putExtra("game_sourceScene", i);
            intent.putExtra("game_float_layer_url", wVar.f113442C1.f113503a);
        }
        C52642c.m59008z(intent, context);
    }

    /* renamed from: e */
    public static void m45828e(C42119w wVar, int i, int i2) {
        C42119w wVar2;
        int i3 = i2;
        Class cls = C48483p.class;
        if (wVar != null) {
            wVar2 = wVar;
        } else {
            wVar2 = ((C48483p) C86312j.m106911c(cls)).mo66079ar().mo65981j();
            if (wVar2 == null) {
                return;
            }
        }
        wVar2.mo66075l2();
        Log.m105924i("MicroMsg.GameEntranceChecker", "float layer report");
        if (!Util.isNullOrNil(wVar2.f113442C1.f113503a)) {
            String a = C40314g.m43482a("resource", String.valueOf(wVar2.f113491q1.f113527a), wVar2.f113474g2, (Map) null);
            C40314g.m43485d(MMApplicationContext.getContext(), 10, 1006, 1, 1, 0, wVar2.field_appId, i, wVar2.f113470e2, wVar2.field_gameMsgId, wVar2.f113472f2, a);
            if (i3 == 1) {
                C115669n.INSTANCE.idkeyStat(858, 16, 1, false);
            } else if (i3 == 2) {
                C115669n.INSTANCE.idkeyStat(858, 17, 1, false);
            }
            wVar2.field_isRead = true;
            ((C48484q) C86312j.m106911c(C48484q.class)).xi0().update(wVar2, new String[0]);
        }
        ((C48483p) C86312j.m106911c(cls)).mo66079ar().mo65975d();
    }

    /* renamed from: f */
    public static void m45829f(int i, boolean z, String str) {
        String str2 = str;
        Class cls = C48483p.class;
        C42119w k = ((C48483p) C86312j.m106911c(cls)).mo66079ar().mo65982k();
        HashMap hashMap = new HashMap();
        String str3 = "1";
        if (z) {
            hashMap.put("luggage", str3);
        }
        if (str2 != null) {
            hashMap.put("entrance_url", str2);
        }
        if (k == null) {
            hashMap.put("function_type", "resource");
            hashMap.put("function_value", String.valueOf(0));
            C40314g.m43484c(MMApplicationContext.getContext(), 9, 901, 1, i, 0, C12934a.m12381c(hashMap));
            return;
        }
        k.mo66075l2();
        if (!C30081b.m38959a()) {
            str3 = "0";
        }
        hashMap.put("reddot_strategy", str3);
        hashMap.put("channel", Integer.toString(k.field_channel));
        int i2 = i;
        C40314g.m43485d(MMApplicationContext.getContext(), 9, 901, 1, i2, 0, k.field_appId, 0, k.f113470e2, k.field_gameMsgId, k.f113472f2, C40314g.m43482a("resource", String.valueOf(k.f113491q1.f113527a), k.f113474g2, hashMap));
        ((C48483p) C86312j.m106911c(cls)).mo66079ar().mo65977f(C42036a0.C42037a.GAME_REDDOT_EXIT_USER_CLICK);
        C115669n.INSTANCE.idkeyStat(858, 3, 1, false);
    }
}
