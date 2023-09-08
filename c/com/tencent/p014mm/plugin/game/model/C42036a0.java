package com.tencent.p014mm.plugin.game.model;

import com.tencent.p014mm.game.report.C40314g;
import com.tencent.p014mm.plugin.game.commlib.util.C30081b;
import com.tencent.p014mm.plugin.game.model.C42072l;
import com.tencent.p014mm.plugin.game.model.C42119w;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.storage.C85801v1;
import di3.C86312j;
import f40.C86709a0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import sw1.C48484q;
import uy1.C52642c;

/* renamed from: com.tencent.mm.plugin.game.model.a0 */
public class C42036a0 {

    /* renamed from: a */
    public long f113237a = 0;

    /* renamed from: com.tencent.mm.plugin.game.model.a0$a */
    public enum C42037a {
        GAME_REDDOT_EXIT_USER_CLICK,
        GAME_REDDOT_EXIT_TIMEOUT,
        GAME_REDDOT_EXIT_EXPOSURE_LIMIT_REACH,
        GAME_REDDOT_EXIT_COVERED,
        GAME_REDDOT_EXIT_QUEUE0_COVERED,
        GAME_REDDOT_EXIT_GAMELIFE_COVERED,
        GAME_REDDOT_EXIT_REVOKE,
        GAME_REDDOT_EXIT_EXPOSURE_SILENT
    }

    /* renamed from: a */
    public final void mo65972a(String str) {
        C42119w k = mo65982k();
        if (k != null && Util.nullAsNil(k.field_gameMsgId).equals(str)) {
            mo65976e();
        }
    }

    /* renamed from: b */
    public void mo65973b() {
        C85801v1 i = C86709a0.m107535s().mo121142i();
        C72994y1.C72995a aVar = C72994y1.C72995a.GAME_INDEX_BANNER_MSGID_LONG_SYNC;
        long longValue = ((Long) i.mo119685f(aVar, 0L)).longValue();
        C42119w Ow = longValue != 0 ? ((C48484q) C86312j.m106911c(C48484q.class)).xi0().mo66000Ow(longValue) : null;
        if (Ow != null && Ow.field_isHidden == 0) {
            C86709a0.m107535s().mo121142i().mo119677K(aVar, 0L);
            mo65972a(Ow.field_gameMsgId);
        }
    }

    /* renamed from: c */
    public void mo65974c() {
        C85801v1 i = C86709a0.m107535s().mo121142i();
        C72994y1.C72995a aVar = C72994y1.C72995a.GAME_INDEX_BUBBLE_MSGID_LONG_SYNC;
        long longValue = ((Long) i.mo119685f(aVar, 0L)).longValue();
        C42119w Ow = longValue != 0 ? ((C48484q) C86312j.m106911c(C48484q.class)).xi0().mo66000Ow(longValue) : null;
        if (Ow != null && Ow.field_isHidden == 0) {
            C86709a0.m107535s().mo121142i().mo119677K(aVar, 0L);
            mo65972a(Ow.field_gameMsgId);
        }
    }

    /* renamed from: d */
    public void mo65975d() {
        C85801v1 i = C86709a0.m107535s().mo121142i();
        C72994y1.C72995a aVar = C72994y1.C72995a.GAME_INDEX_FLOATLAYER_MSGID_LONG_SYNC;
        long longValue = ((Long) i.mo119685f(aVar, 0L)).longValue();
        C42119w Ow = longValue != 0 ? ((C48484q) C86312j.m106911c(C48484q.class)).xi0().mo66000Ow(longValue) : null;
        if (Ow != null && Ow.field_isHidden == 0) {
            C86709a0.m107535s().mo121142i().mo119677K(aVar, 0L);
            mo65972a(Ow.field_gameMsgId);
        }
    }

    /* renamed from: e */
    public void mo65976e() {
        C85801v1 i = C86709a0.m107535s().mo121142i();
        C72994y1.C72995a aVar = C72994y1.C72995a.GAME_DISCOVERY_ENTRANCE_MSGID_LONG_SYNC;
        long longValue = ((Long) i.mo119685f(aVar, 0L)).longValue();
        C42119w Ow = longValue != 0 ? ((C48484q) C86312j.m106911c(C48484q.class)).xi0().mo66000Ow(longValue) : null;
        if (Ow != null && Ow.field_isHidden == 0) {
            C86709a0.m107535s().mo121142i().mo119677K(aVar, 0L);
        }
    }

    /* renamed from: f */
    public void mo65977f(C42037a aVar) {
        C42037a aVar2 = aVar;
        C42119w l = mo65983l();
        if (l != null) {
            mo65976e();
            mo65975d();
            mo65974c();
            mo65973b();
            if (aVar2 == C42037a.GAME_REDDOT_EXIT_USER_CLICK) {
                C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_FINDER_LAST_CLICK_GAME_REDDOT_TIME_LONG, Long.valueOf(Util.nowSecond()));
            }
            l.mo66075l2();
            HashMap hashMap = new HashMap();
            hashMap.put("reddot_strategy", C30081b.m38959a() ? "1" : "0");
            hashMap.put("channel", Integer.toString(l.field_channel));
            hashMap.put("expo_times", String.valueOf(l.field_exposuredCount));
            hashMap.put("exit_reason", String.valueOf(aVar.ordinal()));
            String a = C40314g.m43482a("resource", String.valueOf(l.field_msgType), l.f113474g2, hashMap);
            if (l.field_needReport) {
                C40314g.m43485d(MMApplicationContext.getContext(), 9, 901, 1, 96, 0, l.field_appId, 0, l.f113470e2, l.field_gameMsgId, l.f113472f2, a);
            }
            Log.m105925i("MicroMsg.GameMessageService", "gamelog.srv_msg, service, reddotExit, msgId: %d gameMsgId:%s exit with exposured cnt: %d, reason: %s, title:%s.", Long.valueOf(l.field_msgId), l.field_gameMsgId, Integer.valueOf(l.field_exposuredCount), aVar2, l.f113491q1.f113529c);
        }
    }

    /* renamed from: g */
    public C42119w mo65978g() {
        C42119w Ow;
        long longValue = ((Long) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.GAME_INDEX_BUBBLE_MSGID_LONG_SYNC, 0L)).longValue();
        if (longValue != 0 && (Ow = ((C48484q) C86312j.m106911c(C48484q.class)).xi0().mo66000Ow(longValue)) != null && Ow.field_isHidden == 0 && !mo65987p(Ow)) {
            return Ow;
        }
        return null;
    }

    /* renamed from: h */
    public C42119w mo65979h() {
        C42119w k = mo65982k();
        if (k == null) {
            k = mo65981j();
        }
        if (k == null) {
            k = mo65978g();
        }
        if (k == null) {
            long longValue = ((Long) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.GAME_INDEX_BANNER_MSGID_LONG_SYNC, 0L)).longValue();
            if (longValue == 0 || (k = ((C48484q) C86312j.m106911c(C48484q.class)).xi0().mo66000Ow(longValue)) == null || k.field_isHidden != 0 || mo65987p(k)) {
                k = null;
            }
        }
        if (k != null) {
            k.mo66075l2();
        }
        return k;
    }

    /* renamed from: i */
    public final int mo65980i() {
        String[] split = ((String) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_GAME_SINGLE_DAY_REDDOT_EXPOSURED_CNT_STRING, "")).split("_");
        if (split.length != 2) {
            return 0;
        }
        try {
            boolean isSameDay = Util.isSameDay(Long.parseLong(split[0]), System.currentTimeMillis());
            int parseInt = Integer.parseInt(split[1]);
            if (!isSameDay) {
                return 0;
            }
            return parseInt;
        } catch (NumberFormatException e) {
            Log.printErrStackTrace("MicroMsg.GameMessageService", e, "", new Object[0]);
            return 0;
        }
    }

    /* renamed from: j */
    public C42119w mo65981j() {
        C42119w Ow;
        long longValue = ((Long) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.GAME_INDEX_FLOATLAYER_MSGID_LONG_SYNC, 0L)).longValue();
        if (longValue != 0 && (Ow = ((C48484q) C86312j.m106911c(C48484q.class)).xi0().mo66000Ow(longValue)) != null && Ow.field_isHidden == 0 && !mo65987p(Ow)) {
            return Ow;
        }
        return null;
    }

    /* renamed from: k */
    public C42119w mo65982k() {
        C42119w l = mo65983l();
        if (l == null || mo65987p(l)) {
            return null;
        }
        return l;
    }

    /* renamed from: l */
    public C42119w mo65983l() {
        long longValue = ((Long) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.GAME_DISCOVERY_ENTRANCE_MSGID_LONG_SYNC, 0L)).longValue();
        C42119w Ow = longValue != 0 ? ((C48484q) C86312j.m106911c(C48484q.class)).xi0().mo66000Ow(longValue) : null;
        if (Ow == null || Ow.field_isHidden != 0) {
            return null;
        }
        return Ow;
    }

    /* renamed from: m */
    public C42119w mo65984m() {
        long longValue = ((Long) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.GAME_DISCOVERY_ENTRANCE_MSGID_LONG_SYNC, 0L)).longValue();
        if (longValue != 0) {
            return ((C48484q) C86312j.m106911c(C48484q.class)).xi0().mo66000Ow(longValue);
        }
        return null;
    }

    /* renamed from: n */
    public boolean mo65985n(C42119w wVar) {
        String nullAsNil = Util.nullAsNil((String) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_GAME_MESSAGE_SETTING_HIDE_CONF_STRING, ""));
        ArrayList arrayList = new ArrayList();
        if (!Util.isNullOrNil(nullAsNil)) {
            try {
                JSONArray jSONArray = new JSONArray(nullAsNil);
                for (int i = 0; i < jSONArray.length(); i++) {
                    arrayList.add(C42072l.C42073a.m45773b(jSONArray.optString(i)));
                }
            } catch (JSONException unused) {
            }
        }
        long nowSecond = Util.nowSecond();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C42072l.C42073a aVar = (C42072l.C42073a) it.next();
            if (aVar.f113360a <= nowSecond && aVar.f113361b >= nowSecond) {
                if (wVar.f113491q1.f113533g == aVar.f113362c) {
                    return true;
                }
                if (((ArrayList) aVar.f113363d).contains(wVar.field_gameMsgId)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: o */
    public boolean mo65986o(C42119w wVar) {
        if (wVar == null) {
            return false;
        }
        C42119w.C42130k kVar = wVar.f113491q1;
        if (kVar.f113534h) {
            return false;
        }
        String valueOf = String.valueOf(kVar.f113533g);
        String a = C42046d.m45742a();
        if (Util.isNullOrNil(a)) {
            return false;
        }
        for (String equals : a.split(",")) {
            if (equals.equals(valueOf)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: p */
    public final boolean mo65987p(C42119w wVar) {
        if (wVar == null) {
            return true;
        }
        return wVar.field_expireTime < System.currentTimeMillis() / 1000;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v13, resolved type: com.tencent.mm.plugin.game.model.w$p} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v8, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v11, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v13, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v15, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v17, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v18, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v19, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v20, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v21, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v22, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v23, resolved type: java.lang.String} */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:102:0x028a */
    /* JADX WARNING: Missing exception handler attribute for start block: B:107:0x029c */
    /* JADX WARNING: Missing exception handler attribute for start block: B:112:0x02b0 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:147:0x035e */
    /* JADX WARNING: Missing exception handler attribute for start block: B:152:0x0372 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:92:0x0262 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:97:0x0276 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x0304  */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x0308  */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo65988q(com.tencent.p014mm.plugin.game.model.C42119w r24) {
        /*
            r23 = this;
            r1 = r24
            java.lang.Class<sw1.q> r2 = sw1.C48484q.class
            int r0 = r1.field_showType
            java.lang.String r3 = "createTime"
            java.lang.String r4 = ""
            r5 = 1
            r6 = 0
            r7 = 0
            if (r0 == 0) goto L_0x012c
            com.tencent.mm.plugin.game.model.w$s r0 = r1.f113463X1
            int r8 = r0.f113567k
            if (r8 <= r5) goto L_0x0438
            java.lang.String r0 = r0.f113566j
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 != 0) goto L_0x0438
            di3.d r0 = di3.C86312j.m106911c(r2)
            sw1.q r0 = (sw1.C48484q) r0
            com.tencent.mm.plugin.game.model.b0 r0 = r0.xi0()
            java.lang.String r8 = r1.field_interactiveMergeId
            r0.getClass()
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "select * from GameRawMessage where showType=1 and interactiveMergeId= \""
            r9.append(r10)
            r9.append(r8)
            java.lang.String r8 = "\" and "
            r9.append(r8)
            java.lang.String r8 = "isRead"
            r9.append(r8)
            java.lang.String r8 = "=0 order by "
            r9.append(r8)
            r9.append(r3)
            java.lang.String r3 = " desc"
            r9.append(r3)
            java.lang.String r3 = r9.toString()
            java.util.LinkedList r8 = new java.util.LinkedList
            r8.<init>()
            java.lang.String[] r9 = new java.lang.String[r6]
            android.database.Cursor r0 = r0.rawQuery(r3, r9)
            if (r0 != 0) goto L_0x0062
            goto L_0x007c
        L_0x0062:
            boolean r3 = r0.moveToFirst()
            if (r3 == 0) goto L_0x0079
        L_0x0068:
            com.tencent.mm.plugin.game.model.w r3 = new com.tencent.mm.plugin.game.model.w
            r3.<init>()
            r3.convertFrom(r0)
            r8.add(r3)
            boolean r3 = r0.moveToNext()
            if (r3 != 0) goto L_0x0068
        L_0x0079:
            r0.close()
        L_0x007c:
            java.util.Iterator r0 = r8.iterator()
        L_0x0080:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x0090
            java.lang.Object r3 = r0.next()
            com.tencent.mm.plugin.game.model.w r3 = (com.tencent.p014mm.plugin.game.model.C42119w) r3
            int r3 = r3.field_hasMergedCount
            int r5 = r5 + r3
            goto L_0x0080
        L_0x0090:
            com.tencent.mm.plugin.game.model.w$s r0 = r1.f113463X1
            int r0 = r0.f113567k
            if (r5 < r0) goto L_0x0438
            r1.field_hasMergedCount = r5
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>()
            java.util.Iterator r3 = r8.iterator()
        L_0x00a1:
            boolean r5 = r3.hasNext()
            java.lang.String r8 = ";"
            if (r5 == 0) goto L_0x00f0
            java.lang.Object r5 = r3.next()
            com.tencent.mm.plugin.game.model.w r5 = (com.tencent.p014mm.plugin.game.model.C42119w) r5
            java.lang.String r9 = r5.field_mergeSenderIcon
            boolean r9 = r4.equals(r9)
            if (r9 != 0) goto L_0x00c5
            java.lang.String r9 = r5.field_mergeSenderIcon
            java.lang.String[] r8 = r9.split(r8)
            java.util.List r8 = java.util.Arrays.asList(r8)
            r0.addAll(r8)
            goto L_0x00e0
        L_0x00c5:
            java.lang.String r8 = r5.field_rawXML
            java.lang.String r9 = "sysmsg"
            java.util.Map r8 = com.tencent.p014mm.sdk.platformtools.XmlParser.parseXml(r8, r9, r7)
            if (r8 == 0) goto L_0x00d8
            java.lang.String r9 = ".sysmsg.gamecenter.msg_center_v2.msg_sender.sender_icon"
            java.lang.Object r8 = r8.get(r9)
            java.lang.String r8 = (java.lang.String) r8
            goto L_0x00d9
        L_0x00d8:
            r8 = r7
        L_0x00d9:
            java.lang.String r8 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r8, (java.lang.String) r4)
            r0.addFirst(r8)
        L_0x00e0:
            di3.d r8 = di3.C86312j.m106911c(r2)
            sw1.q r8 = (sw1.C48484q) r8
            com.tencent.mm.plugin.game.model.b0 r8 = r8.xi0()
            java.lang.String[] r9 = new java.lang.String[r6]
            r8.delete(r5, r9)
            goto L_0x00a1
        L_0x00f0:
            int r2 = r0.size()
            r3 = 4
            if (r2 < r3) goto L_0x00fb
            r0.removeLast()
            goto L_0x00f0
        L_0x00fb:
            com.tencent.mm.plugin.game.model.w$s r2 = r1.f113463X1
            java.lang.String r2 = r2.f113560d
            r0.addFirst(r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.util.Iterator r0 = r0.iterator()
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x0124
        L_0x0111:
            java.lang.Object r3 = r0.next()
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            r2.append(r3)
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x0124
            r2.append(r8)
            goto L_0x0111
        L_0x0124:
            java.lang.String r0 = r2.toString()
            r1.field_mergeSenderIcon = r0
            goto L_0x0438
        L_0x012c:
            java.lang.String r0 = r1.field_mergerId
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 == 0) goto L_0x0135
            return
        L_0x0135:
            di3.d r0 = di3.C86312j.m106911c(r2)
            sw1.q r0 = (sw1.C48484q) r0
            com.tencent.mm.plugin.game.model.b0 r0 = r0.xi0()
            java.lang.String r8 = r1.field_mergerId
            int r9 = r1.field_msgType
            r0.getClass()
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "select * from GameRawMessage where msgType="
            r10.append(r11)
            r10.append(r9)
            java.lang.String r9 = " and "
            r10.append(r9)
            java.lang.String r9 = "mergerId"
            r10.append(r9)
            java.lang.String r9 = "= \""
            r10.append(r9)
            r10.append(r8)
            java.lang.String r8 = "\" order by "
            r10.append(r8)
            r10.append(r3)
            java.lang.String r3 = " desc limit 1"
            r10.append(r3)
            java.lang.String r3 = r10.toString()
            com.tencent.mm.plugin.game.model.w r8 = new com.tencent.mm.plugin.game.model.w
            r8.<init>()
            java.lang.String[] r9 = new java.lang.String[r6]
            android.database.Cursor r0 = r0.rawQuery(r3, r9)
            if (r0 != 0) goto L_0x0185
            r8 = r7
            goto L_0x0191
        L_0x0185:
            boolean r3 = r0.moveToFirst()
            if (r3 == 0) goto L_0x018e
            r8.convertFrom(r0)
        L_0x018e:
            r0.close()
        L_0x0191:
            if (r8 == 0) goto L_0x0438
            r8.mo66075l2()
            java.util.LinkedList<com.tencent.mm.plugin.game.model.w$p> r0 = r8.f113489o1
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.util.List) r0)
            if (r0 != 0) goto L_0x0438
            r24.mo66075l2()
            java.util.LinkedList r3 = new java.util.LinkedList
            java.util.LinkedList<com.tencent.mm.plugin.game.model.w$p> r0 = r8.f113489o1
            r3.<init>(r0)
            java.util.LinkedList<com.tencent.mm.plugin.game.model.w$p> r0 = r1.f113489o1
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.util.List) r0)
            if (r0 != 0) goto L_0x01dd
            java.util.LinkedList<com.tencent.mm.plugin.game.model.w$p> r0 = r1.f113489o1
            java.lang.Object r0 = r0.get(r6)
            com.tencent.mm.plugin.game.model.w$p r0 = (com.tencent.p014mm.plugin.game.model.C42119w.C42135p) r0
            java.lang.String r0 = r0.f113546a
            boolean r9 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r9 != 0) goto L_0x01dd
            java.util.LinkedList<com.tencent.mm.plugin.game.model.w$p> r9 = r8.f113489o1
            java.util.Iterator r9 = r9.iterator()
        L_0x01c6:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L_0x01dd
            java.lang.Object r10 = r9.next()
            com.tencent.mm.plugin.game.model.w$p r10 = (com.tencent.p014mm.plugin.game.model.C42119w.C42135p) r10
            java.lang.String r11 = r10.f113546a
            boolean r11 = r11.equals(r0)
            if (r11 == 0) goto L_0x01c6
            r3.remove(r10)
        L_0x01dd:
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.util.List) r3)
            if (r0 != 0) goto L_0x0422
            java.lang.String r9 = r1.field_rawXML
            java.util.HashMap<java.lang.String, com.tencent.mm.plugin.game.model.w$l> r10 = r8.f113494t1
            java.lang.String r11 = "</jump>"
            java.lang.String r12 = "</userinfo>"
            java.lang.String r13 = "<userinfo>"
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r9)
            if (r0 != 0) goto L_0x0417
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.util.List) r3)
            if (r0 == 0) goto L_0x01fb
            goto L_0x0417
        L_0x01fb:
            java.lang.String r0 = "badge_icon"
            java.lang.String r14 = "profile"
            java.lang.String r15 = "usericon"
            java.lang.String r6 = "nickname"
            java.lang.String r5 = "username"
            java.lang.String r7 = "userinfo"
            boolean r16 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.util.List) r3)
            r17 = r8
            java.lang.String r8 = "MicroMsg.GameXmlProcess"
            if (r16 == 0) goto L_0x021d
            r16 = r2
            r22 = r9
            r20 = r11
            r19 = r12
            r21 = r13
            goto L_0x02fd
        L_0x021d:
            r16 = r2
            java.io.StringWriter r2 = new java.io.StringWriter
            r2.<init>()
            org.xmlpull.v1.XmlPullParserFactory r18 = org.xmlpull.v1.XmlPullParserFactory.newInstance()     // Catch:{ Exception -> 0x02ed }
            org.xmlpull.v1.XmlSerializer r1 = r18.newSerializer()     // Catch:{ Exception -> 0x02ed }
            r1.setOutput(r2)     // Catch:{ Exception -> 0x02ed }
            java.util.Iterator r18 = r3.iterator()     // Catch:{ Exception -> 0x02ed }
        L_0x0233:
            boolean r19 = r18.hasNext()     // Catch:{ Exception -> 0x02ed }
            if (r19 == 0) goto L_0x02d0
            java.lang.Object r19 = r18.next()     // Catch:{ Exception -> 0x02ed }
            r20 = r11
            r11 = r19
            com.tencent.mm.plugin.game.model.w$p r11 = (com.tencent.p014mm.plugin.game.model.C42119w.C42135p) r11     // Catch:{ Exception -> 0x02cc }
            r19 = r12
            r12 = 0
            r1.startTag(r12, r7)     // Catch:{ Exception -> 0x02c8 }
            java.lang.String r12 = "jump_id"
            r21 = r13
            java.lang.String r13 = r11.f113550e     // Catch:{ Exception -> 0x02c4 }
            r22 = r9
            r9 = 0
            r1.attribute(r9, r12, r13)     // Catch:{ Exception -> 0x02eb }
            r1.startTag(r9, r5)     // Catch:{ Exception -> 0x02eb }
            java.lang.String r9 = r11.f113546a     // Catch:{ Exception -> 0x0262 }
            java.lang.String r9 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r9, (java.lang.String) r4)     // Catch:{ Exception -> 0x0262 }
            r1.text(r9)     // Catch:{ Exception -> 0x0262 }
            goto L_0x0265
        L_0x0262:
            r1.text(r4)     // Catch:{ Exception -> 0x02eb }
        L_0x0265:
            r9 = 0
            r1.endTag(r9, r5)     // Catch:{ Exception -> 0x02eb }
            r1.startTag(r9, r6)     // Catch:{ Exception -> 0x02eb }
            java.lang.String r9 = r11.f113547b     // Catch:{ Exception -> 0x0276 }
            java.lang.String r9 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r9, (java.lang.String) r4)     // Catch:{ Exception -> 0x0276 }
            r1.text(r9)     // Catch:{ Exception -> 0x0276 }
            goto L_0x0279
        L_0x0276:
            r1.text(r4)     // Catch:{ Exception -> 0x02eb }
        L_0x0279:
            r9 = 0
            r1.endTag(r9, r6)     // Catch:{ Exception -> 0x02eb }
            r1.startTag(r9, r15)     // Catch:{ Exception -> 0x02eb }
            java.lang.String r9 = r11.f113548c     // Catch:{ Exception -> 0x028a }
            java.lang.String r9 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r9, (java.lang.String) r4)     // Catch:{ Exception -> 0x028a }
            r1.text(r9)     // Catch:{ Exception -> 0x028a }
            goto L_0x028d
        L_0x028a:
            r1.text(r4)     // Catch:{ Exception -> 0x02eb }
        L_0x028d:
            r9 = 0
            r1.endTag(r9, r15)     // Catch:{ Exception -> 0x02eb }
            r1.startTag(r9, r14)     // Catch:{ Exception -> 0x02eb }
            java.lang.String r12 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r9, (java.lang.String) r4)     // Catch:{ Exception -> 0x029c }
            r1.text(r12)     // Catch:{ Exception -> 0x029c }
            goto L_0x029f
        L_0x029c:
            r1.text(r4)     // Catch:{ Exception -> 0x02eb }
        L_0x029f:
            r9 = 0
            r1.endTag(r9, r14)     // Catch:{ Exception -> 0x02eb }
            r1.startTag(r9, r0)     // Catch:{ Exception -> 0x02eb }
            java.lang.String r9 = r11.f113549d     // Catch:{ Exception -> 0x02b0 }
            java.lang.String r9 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r9, (java.lang.String) r4)     // Catch:{ Exception -> 0x02b0 }
            r1.text(r9)     // Catch:{ Exception -> 0x02b0 }
            goto L_0x02b3
        L_0x02b0:
            r1.text(r4)     // Catch:{ Exception -> 0x02eb }
        L_0x02b3:
            r9 = 0
            r1.endTag(r9, r0)     // Catch:{ Exception -> 0x02eb }
            r1.endTag(r9, r7)     // Catch:{ Exception -> 0x02eb }
            r12 = r19
            r11 = r20
            r13 = r21
            r9 = r22
            goto L_0x0233
        L_0x02c4:
            r0 = move-exception
            r22 = r9
            goto L_0x02f6
        L_0x02c8:
            r0 = move-exception
            r22 = r9
            goto L_0x02f4
        L_0x02cc:
            r0 = move-exception
            r22 = r9
            goto L_0x02f2
        L_0x02d0:
            r22 = r9
            r20 = r11
            r19 = r12
            r21 = r13
            r1.endDocument()     // Catch:{ Exception -> 0x02eb }
            r2.flush()     // Catch:{ Exception -> 0x02eb }
            r2.close()     // Catch:{ Exception -> 0x02eb }
            java.lang.StringBuffer r0 = r2.getBuffer()
            java.lang.String r0 = r0.toString()
            r1 = r0
            goto L_0x02fe
        L_0x02eb:
            r0 = move-exception
            goto L_0x02f6
        L_0x02ed:
            r0 = move-exception
            r22 = r9
            r20 = r11
        L_0x02f2:
            r19 = r12
        L_0x02f4:
            r21 = r13
        L_0x02f6:
            java.lang.String r0 = r0.getMessage()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r8, r0)
        L_0x02fd:
            r1 = r4
        L_0x02fe:
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r0 == 0) goto L_0x0308
            r9 = r22
            goto L_0x041d
        L_0x0308:
            java.lang.String r0 = "jump_url"
            java.lang.String r2 = "jump_type"
            java.lang.String r5 = "jump"
            boolean r6 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.util.List) r3)
            if (r6 != 0) goto L_0x0397
            boolean r6 = r10.isEmpty()
            if (r6 == 0) goto L_0x031c
            goto L_0x0397
        L_0x031c:
            java.io.StringWriter r6 = new java.io.StringWriter
            r6.<init>()
            org.xmlpull.v1.XmlPullParserFactory r7 = org.xmlpull.v1.XmlPullParserFactory.newInstance()     // Catch:{ Exception -> 0x038f }
            org.xmlpull.v1.XmlSerializer r7 = r7.newSerializer()     // Catch:{ Exception -> 0x038f }
            r7.setOutput(r6)     // Catch:{ Exception -> 0x038f }
            java.util.Iterator r9 = r3.iterator()     // Catch:{ Exception -> 0x038f }
        L_0x0330:
            boolean r11 = r9.hasNext()     // Catch:{ Exception -> 0x038f }
            if (r11 == 0) goto L_0x037d
            java.lang.Object r11 = r9.next()     // Catch:{ Exception -> 0x038f }
            com.tencent.mm.plugin.game.model.w$p r11 = (com.tencent.p014mm.plugin.game.model.C42119w.C42135p) r11     // Catch:{ Exception -> 0x038f }
            java.lang.String r12 = r11.f113550e     // Catch:{ Exception -> 0x038f }
            java.lang.Object r12 = r10.get(r12)     // Catch:{ Exception -> 0x038f }
            com.tencent.mm.plugin.game.model.w$l r12 = (com.tencent.p014mm.plugin.game.model.C42119w.C42131l) r12     // Catch:{ Exception -> 0x038f }
            if (r12 == 0) goto L_0x0330
            r13 = 0
            r7.startTag(r13, r5)     // Catch:{ Exception -> 0x038f }
            java.lang.String r14 = "id"
            java.lang.String r11 = r11.f113550e     // Catch:{ Exception -> 0x038f }
            r7.attribute(r13, r14, r11)     // Catch:{ Exception -> 0x038f }
            r7.startTag(r13, r2)     // Catch:{ Exception -> 0x038f }
            int r11 = r12.f113535d     // Catch:{ Exception -> 0x035e }
            java.lang.String r11 = java.lang.String.valueOf(r11)     // Catch:{ Exception -> 0x035e }
            r7.text(r11)     // Catch:{ Exception -> 0x035e }
            goto L_0x0361
        L_0x035e:
            r7.text(r4)     // Catch:{ Exception -> 0x038f }
        L_0x0361:
            r11 = 0
            r7.endTag(r11, r2)     // Catch:{ Exception -> 0x038f }
            r7.startTag(r11, r0)     // Catch:{ Exception -> 0x038f }
            java.lang.String r11 = r12.f113536e     // Catch:{ Exception -> 0x0372 }
            java.lang.String r11 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r11, (java.lang.String) r4)     // Catch:{ Exception -> 0x0372 }
            r7.text(r11)     // Catch:{ Exception -> 0x0372 }
            goto L_0x0375
        L_0x0372:
            r7.text(r4)     // Catch:{ Exception -> 0x038f }
        L_0x0375:
            r11 = 0
            r7.endTag(r11, r0)     // Catch:{ Exception -> 0x038f }
            r7.endTag(r11, r5)     // Catch:{ Exception -> 0x038f }
            goto L_0x0330
        L_0x037d:
            r7.endDocument()     // Catch:{ Exception -> 0x038f }
            r6.flush()     // Catch:{ Exception -> 0x038f }
            r6.close()     // Catch:{ Exception -> 0x038f }
            java.lang.StringBuffer r0 = r6.getBuffer()
            java.lang.String r4 = r0.toString()
            goto L_0x0397
        L_0x038f:
            r0 = move-exception
            java.lang.String r0 = r0.getMessage()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r8, r0)
        L_0x0397:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r5 = r22
            r2.<init>(r5)
            r6 = r21
            int r0 = r2.indexOf(r6)     // Catch:{ Exception -> 0x03f5 }
            r7 = -1
            if (r0 == r7) goto L_0x03cc
            int r0 = r2.indexOf(r6)     // Catch:{ Exception -> 0x03f5 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x03f5 }
            r6.<init>()     // Catch:{ Exception -> 0x03f5 }
            java.lang.String r9 = "<usercount>"
            r6.append(r9)     // Catch:{ Exception -> 0x03f5 }
            int r3 = r3.size()     // Catch:{ Exception -> 0x03f5 }
            r6.append(r3)     // Catch:{ Exception -> 0x03f5 }
            r3 = 1
            r6.append(r3)     // Catch:{ Exception -> 0x03f5 }
            java.lang.String r3 = "</usercount>"
            r6.append(r3)     // Catch:{ Exception -> 0x03f5 }
            java.lang.String r3 = r6.toString()     // Catch:{ Exception -> 0x03f5 }
            r2.insert(r0, r3)     // Catch:{ Exception -> 0x03f5 }
        L_0x03cc:
            r3 = r19
            int r0 = r2.lastIndexOf(r3)     // Catch:{ Exception -> 0x03f5 }
            if (r0 == r7) goto L_0x03dd
            int r0 = r2.lastIndexOf(r3)     // Catch:{ Exception -> 0x03f5 }
            int r0 = r0 + 11
            r2.insert(r0, r1)     // Catch:{ Exception -> 0x03f5 }
        L_0x03dd:
            r1 = r20
            int r0 = r2.lastIndexOf(r1)     // Catch:{ Exception -> 0x03f5 }
            if (r0 == r7) goto L_0x0412
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)     // Catch:{ Exception -> 0x03f5 }
            if (r0 != 0) goto L_0x0412
            int r0 = r2.lastIndexOf(r1)     // Catch:{ Exception -> 0x03f5 }
            int r0 = r0 + 7
            r2.insert(r0, r4)     // Catch:{ Exception -> 0x03f5 }
            goto L_0x0412
        L_0x03f5:
            r0 = move-exception
            java.lang.String r0 = r0.getMessage()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r8, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "xml is invalid : "
            r0.append(r1)
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r8, r0)
        L_0x0412:
            java.lang.String r9 = r2.toString()
            goto L_0x041d
        L_0x0417:
            r16 = r2
            r17 = r8
            r5 = r9
            r9 = r5
        L_0x041d:
            r1 = r24
            r1.field_rawXML = r9
            goto L_0x0426
        L_0x0422:
            r16 = r2
            r17 = r8
        L_0x0426:
            di3.d r0 = di3.C86312j.m106911c(r16)
            sw1.q r0 = (sw1.C48484q) r0
            com.tencent.mm.plugin.game.model.b0 r0 = r0.xi0()
            r1 = 0
            java.lang.String[] r1 = new java.lang.String[r1]
            r7 = r17
            r0.delete(r7, r1)
        L_0x0438:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.game.model.C42036a0.mo65988q(com.tencent.mm.plugin.game.model.w):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:114:0x0276  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x02f9  */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x0367  */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x039c  */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x03c8  */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x03dd  */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x03e3 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:166:0x03fd A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x0412  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00dc  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x018a  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x019c  */
    /* renamed from: r */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo65989r(com.tencent.p014mm.plugin.game.model.C42119w r29) {
        /*
            r28 = this;
            r1 = r28
            r2 = r29
            com.tencent.mm.storage.y1$a r3 = com.tencent.p014mm.storage.C72994y1.C72995a.GAME_GIFT_ENTRANCE_MSGID_LONG_SYNC
            java.lang.String r4 = "MicroMsg.GameMessageService"
            if (r2 != 0) goto L_0x0011
            java.lang.String r0 = "msg is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r4, r0)
            r0 = -1
            return r0
        L_0x0011:
            java.lang.String r0 = r2.field_gameMsgId
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r0)
            f40.o r5 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r5 = r5.mo121142i()
            com.tencent.mm.storage.y1$a r6 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_GAME_FUNCTION_MSG_DELETED_STRING
            java.lang.String r7 = ""
            java.lang.Object r5 = r5.mo119685f(r6, r7)
            java.lang.String r5 = (java.lang.String) r5
            java.lang.String r5 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r5)
            r6 = 1
            java.lang.Object[] r7 = new java.lang.Object[r6]
            r8 = 0
            r7[r8] = r5
            java.lang.String r9 = "filter msgIds:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r9, r7)
            org.json.JSONArray r7 = new org.json.JSONArray     // Catch:{ JSONException -> 0x005c }
            r7.<init>(r5)     // Catch:{ JSONException -> 0x005c }
            r5 = 0
        L_0x003e:
            int r9 = r7.length()     // Catch:{ JSONException -> 0x005c }
            if (r5 >= r9) goto L_0x005d
            java.lang.String r9 = r7.getString(r5)     // Catch:{ JSONException -> 0x005c }
            boolean r9 = r0.equals(r9)     // Catch:{ JSONException -> 0x005c }
            if (r9 == 0) goto L_0x0059
            java.lang.String r5 = "filter deleted message. gameMsgId:%s"
            java.lang.Object[] r7 = new java.lang.Object[r6]     // Catch:{ JSONException -> 0x005c }
            r7[r8] = r0     // Catch:{ JSONException -> 0x005c }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r5, r7)     // Catch:{ JSONException -> 0x005c }
            r0 = 1
            goto L_0x005e
        L_0x0059:
            int r5 = r5 + 1
            goto L_0x003e
        L_0x005c:
        L_0x005d:
            r0 = 0
        L_0x005e:
            if (r0 == 0) goto L_0x0067
            java.lang.String r0 = "filter deleted message"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r0)
            r0 = 5
            return r0
        L_0x0067:
            int r0 = r2.f113499y1
            r5 = 6
            if (r0 != r6) goto L_0x0072
            java.lang.String r0 = "only in ios"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r0)
            return r5
        L_0x0072:
            java.lang.String r0 = r2.field_gameMsgId
            boolean r7 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r7 == 0) goto L_0x007b
            goto L_0x00bc
        L_0x007b:
            java.lang.Class<sw1.q> r7 = sw1.C48484q.class
            di3.d r7 = di3.C86312j.m106911c(r7)
            sw1.q r7 = (sw1.C48484q) r7
            com.tencent.mm.plugin.game.model.b0 r7 = r7.xi0()
            r7.getClass()
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "select count(*) from GameRawMessage where gameMsgId = \""
            r9.append(r10)
            r9.append(r0)
            java.lang.String r0 = "\""
            r9.append(r0)
            java.lang.String r0 = r9.toString()
            java.lang.String[] r9 = new java.lang.String[r8]
            android.database.Cursor r0 = r7.rawQuery(r0, r9)
            if (r0 != 0) goto L_0x00a9
            goto L_0x00bc
        L_0x00a9:
            boolean r7 = r0.moveToFirst()
            if (r7 == 0) goto L_0x00b4
            int r7 = r0.getInt(r8)
            goto L_0x00b5
        L_0x00b4:
            r7 = 0
        L_0x00b5:
            r0.close()
            if (r7 <= 0) goto L_0x00bc
            r0 = 1
            goto L_0x00bd
        L_0x00bc:
            r0 = 0
        L_0x00bd:
            r7 = 2
            if (r0 == 0) goto L_0x00dc
            java.lang.Object[] r0 = new java.lang.Object[r6]
            java.lang.String r3 = r2.field_gameMsgId
            r0[r8] = r3
            java.lang.String r3 = "duplicated msg:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r4, r3, r0)
            boolean r0 = r2.field_needReport
            if (r0 == 0) goto L_0x00db
            com.tencent.mm.plugin.report.service.n r8 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r9 = 858(0x35a, double:4.24E-321)
            r11 = 4
            r13 = 1
            r15 = 0
            r8.idkeyStat(r9, r11, r13, r15)
        L_0x00db:
            return r7
        L_0x00dc:
            long r9 = java.lang.System.currentTimeMillis()
            r11 = 1000(0x3e8, double:4.94E-321)
            long r9 = r9 / r11
            long r11 = r2.field_expireTime
            int r0 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r0 > 0) goto L_0x00eb
            r0 = 0
            goto L_0x00ec
        L_0x00eb:
            r0 = 1
        L_0x00ec:
            if (r0 != 0) goto L_0x0122
            java.lang.Object[] r0 = new java.lang.Object[r6]
            java.lang.String r3 = r2.field_gameMsgId
            r0[r8] = r3
            java.lang.String r3 = "msg is expired Time, %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r4, r3, r0)
            boolean r0 = r2.field_needReport
            if (r0 == 0) goto L_0x0109
            com.tencent.mm.plugin.report.service.n r7 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r8 = 858(0x35a, double:4.24E-321)
            r10 = 5
            r12 = 1
            r14 = 0
            r7.idkeyStat(r8, r10, r12, r14)
        L_0x0109:
            com.tencent.mm.plugin.game.model.w$q r0 = r2.f113458S1
            java.lang.String r0 = r0.f113551a
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r2 != 0) goto L_0x0121
            com.tencent.mm.autogen.events.WepkgNotifyEvent r2 = new com.tencent.mm.autogen.events.WepkgNotifyEvent
            r2.<init>()
            com.tencent.mm.autogen.events.WepkgNotifyEvent$a r3 = r2.f107837d
            r3.f107838a = r5
            r3.f107839b = r0
            r2.publish()
        L_0x0121:
            return r6
        L_0x0122:
            java.lang.Class<ym.l> r0 = p763ym.C79138l.class
            long r9 = r2.f113440A1
            java.lang.String r11 = r2.field_appId
            r12 = 1
            r15 = 4
            int r16 = (r9 > r12 ? 1 : (r9 == r12 ? 0 : -1))
            if (r16 != 0) goto L_0x0158
            boolean r9 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r11)
            if (r9 != 0) goto L_0x0145
            di3.d r0 = di3.C86312j.m106911c(r0)
            ym.l r0 = (p763ym.C79138l) r0
            android.content.Context r9 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            boolean r0 = r0.Tb0(r9, r11)
            if (r0 != 0) goto L_0x0187
        L_0x0145:
            boolean r0 = r2.field_needReport
            if (r0 == 0) goto L_0x0156
            com.tencent.mm.plugin.report.service.n r16 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r17 = 858(0x35a, double:4.24E-321)
            r19 = 6
            r21 = 1
            r23 = 0
            r16.idkeyStat(r17, r19, r21, r23)
        L_0x0156:
            r0 = 3
            goto L_0x0188
        L_0x0158:
            r12 = 2
            int r16 = (r9 > r12 ? 1 : (r9 == r12 ? 0 : -1))
            if (r16 != 0) goto L_0x0187
            boolean r9 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r11)
            if (r9 != 0) goto L_0x0174
            di3.d r0 = di3.C86312j.m106911c(r0)
            ym.l r0 = (p763ym.C79138l) r0
            android.content.Context r9 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            boolean r0 = r0.Tb0(r9, r11)
            if (r0 == 0) goto L_0x0187
        L_0x0174:
            boolean r0 = r2.field_needReport
            if (r0 == 0) goto L_0x0185
            com.tencent.mm.plugin.report.service.n r16 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r17 = 858(0x35a, double:4.24E-321)
            r19 = 7
            r21 = 1
            r23 = 0
            r16.idkeyStat(r17, r19, r21, r23)
        L_0x0185:
            r0 = 4
            goto L_0x0188
        L_0x0187:
            r0 = 0
        L_0x0188:
            if (r0 == 0) goto L_0x019c
            java.lang.Object[] r3 = new java.lang.Object[r7]
            java.lang.String r2 = r2.field_gameMsgId
            r3[r8] = r2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            r3[r6] = r2
            java.lang.String r2 = "checkFilter failed,%s, status: %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r4, r2, r3)
            return r0
        L_0x019c:
            int r0 = r2.field_msgType
            r9 = 30
            if (r0 != r9) goto L_0x01b4
            boolean r0 = r2.field_needReport
            if (r0 == 0) goto L_0x01b3
            com.tencent.mm.plugin.report.service.n r9 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r10 = 858(0x35a, double:4.24E-321)
            r12 = 8
            r14 = 1
            r16 = 0
            r9.idkeyStat(r10, r12, r14, r16)
        L_0x01b3:
            return r8
        L_0x01b4:
            com.tencent.mm.plugin.game.model.w r9 = r28.mo65979h()
            boolean r10 = r1.mo65986o(r9)
            boolean r11 = r28.mo65986o(r29)
            if (r11 == 0) goto L_0x021c
            boolean r0 = r2.field_needReport
            if (r0 == 0) goto L_0x021c
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            boolean r12 = com.tencent.p014mm.plugin.game.commlib.util.C30081b.m38959a()
            if (r12 == 0) goto L_0x01d4
            java.lang.String r12 = "1"
            goto L_0x01d6
        L_0x01d4:
            java.lang.String r12 = "0"
        L_0x01d6:
            java.lang.String r13 = "reddot_strategy"
            r0.put(r13, r12)
            int r12 = r2.field_channel
            java.lang.String r12 = java.lang.Integer.toString(r12)
            java.lang.String r13 = "channel"
            r0.put(r13, r12)
            android.content.Context r16 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 404(0x194, float:5.66E-43)
            r21 = 0
            java.lang.String r12 = r2.field_appId
            r23 = 0
            int r13 = r2.f113470e2
            java.lang.String r5 = r2.field_gameMsgId
            java.lang.String r14 = r2.f113472f2
            com.tencent.mm.plugin.game.model.w$k r7 = r2.f113491q1
            int r7 = r7.f113527a
            java.lang.String r7 = java.lang.String.valueOf(r7)
            java.lang.String r6 = r2.f113474g2
            java.lang.String r8 = "resource"
            java.lang.String r27 = com.tencent.p014mm.game.report.C40314g.m43482a(r8, r7, r6, r0)
            r22 = r12
            r24 = r13
            r25 = r5
            r26 = r14
            com.tencent.p014mm.game.report.C40314g.m43485d(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            r0 = 8
            goto L_0x021d
        L_0x021c:
            r0 = 0
        L_0x021d:
            sw1.m r5 = sw1.C48477m.C13789a.m13091a()
            if (r5 == 0) goto L_0x022c
            android.content.Context r6 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            boolean r5 = r5.ju0(r6)
            goto L_0x022d
        L_0x022c:
            r5 = 0
        L_0x022d:
            java.lang.Class<ky2.i> r6 = ky2.C10432i.class
            di3.d r6 = di3.C86312j.m106911c(r6)
            ky2.i r6 = (ky2.C10432i) r6
            boolean r6 = r6.mo10750e()
            long r7 = eb0.C75592q0.m90781k()
            r12 = 8388608(0x800000, double:4.144523E-317)
            long r7 = r7 & r12
            r12 = 0
            int r14 = (r7 > r12 ? 1 : (r7 == r12 ? 0 : -1))
            if (r14 == 0) goto L_0x0249
            r7 = 1
            goto L_0x024a
        L_0x0249:
            r7 = 0
        L_0x024a:
            if (r0 != 0) goto L_0x026f
            if (r6 == 0) goto L_0x0253
            r0 = 10
            r5 = 10
            goto L_0x0270
        L_0x0253:
            if (r5 != 0) goto L_0x0257
            r5 = 6
            goto L_0x0270
        L_0x0257:
            if (r7 == 0) goto L_0x025e
            r0 = 9
            r5 = 9
            goto L_0x0270
        L_0x025e:
            java.lang.Class<xx.g> r5 = p274xx.C66446g.class
            di3.d r5 = di3.C86312j.m106911c(r5)
            xx.g r5 = (p274xx.C66446g) r5
            boolean r5 = r5.mo61611mW()
            if (r5 != 0) goto L_0x026f
            r0 = 7
            r5 = 7
            goto L_0x0270
        L_0x026f:
            r5 = r0
        L_0x0270:
            boolean r0 = com.tencent.p014mm.plugin.game.commlib.util.C30081b.m38959a()
            if (r0 == 0) goto L_0x02f9
            java.lang.Object[] r0 = new java.lang.Object[r15]
            long r6 = r2.field_msgId
            java.lang.Long r6 = java.lang.Long.valueOf(r6)
            r7 = 0
            r0[r7] = r6
            java.lang.String r6 = r2.field_gameMsgId
            r7 = 1
            r0[r7] = r6
            int r6 = r2.field_channel
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r8 = 2
            r0[r8] = r6
            float r6 = r2.f113480j2
            java.lang.Float r6 = java.lang.Float.valueOf(r6)
            r9 = 3
            r0[r9] = r6
            java.lang.String r6 = "gamelog.srv_msg, service, reddotReceive, hit reddot levelup exp receive with msgId: %d, gameMsgId:%s, channel: %d, clickScore: %f."
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r6, r0)
            int r0 = r2.field_channel
            if (r0 != r7) goto L_0x02df
            if (r11 != 0) goto L_0x02c9
            java.lang.Object[] r0 = new java.lang.Object[r8]
            long r8 = r2.field_msgId
            java.lang.Long r6 = java.lang.Long.valueOf(r8)
            r8 = 0
            r0[r8] = r6
            java.lang.String r6 = r2.field_gameMsgId
            r0[r7] = r6
            java.lang.String r6 = "gamelog.srv_msg, service, reddotReceive, insert ZeroQueue msgId: %d, gameMsgId:%s."
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r6, r0)
            com.tencent.mm.plugin.game.model.a0$a r0 = com.tencent.p014mm.plugin.game.model.C42036a0.C42037a.GAME_REDDOT_EXIT_QUEUE0_COVERED
            r1.mo65977f(r0)
            r28.mo65994w(r29)
            r28.mo65993v(r29)
            r28.mo65992u(r29)
            r28.mo65991t(r29)
            goto L_0x02df
        L_0x02c9:
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            long r6 = r2.field_msgId
            java.lang.Long r6 = java.lang.Long.valueOf(r6)
            r7 = 0
            r0[r7] = r6
            java.lang.String r6 = r2.field_gameMsgId
            r7 = 1
            r0[r7] = r6
            java.lang.String r6 = "gamelog.srv_msg, service, reddotReceive,msg is ban msgId: %d, gameMsgId:%s."
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r6, r0)
        L_0x02df:
            int r0 = r2.field_msgType
            if (r0 == r15) goto L_0x02e4
            goto L_0x02f5
        L_0x02e4:
            f40.o r0 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r0 = r0.mo121142i()
            long r6 = r2.field_msgId
            java.lang.Long r4 = java.lang.Long.valueOf(r6)
            r0.mo119677K(r3, r4)
        L_0x02f5:
            r28.mo65990s(r29)
            return r5
        L_0x02f9:
            r0 = 3
            java.lang.Object[] r0 = new java.lang.Object[r0]
            long r6 = r2.field_msgId
            java.lang.Long r6 = java.lang.Long.valueOf(r6)
            r7 = 0
            r0[r7] = r6
            java.lang.String r6 = r2.field_gameMsgId
            r8 = 1
            r0[r8] = r6
            java.lang.String r6 = r2.field_weight
            r8 = 2
            r0[r8] = r6
            java.lang.String r6 = "gamelog.srv_msg, service, reddotReceive, not hit reddot levelup exp, use old way msgId: %d, gameMsgId:%s, weight: %s."
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r6, r0)
            com.tencent.mm.plugin.game.model.w r6 = r28.mo65979h()
            if (r6 == 0) goto L_0x03df
            r6.mo66075l2()
            org.json.JSONObject r8 = new org.json.JSONObject
            r8.<init>()
            java.lang.String r0 = "oldNoticeId"
            java.lang.String r12 = r6.f113472f2     // Catch:{ Exception -> 0x0349 }
            r8.put(r0, r12)     // Catch:{ Exception -> 0x0349 }
            java.lang.String r0 = "oldMsgId"
            java.lang.String r12 = r6.field_gameMsgId     // Catch:{ Exception -> 0x0349 }
            r8.put(r0, r12)     // Catch:{ Exception -> 0x0349 }
            java.lang.String r0 = r2.field_weight     // Catch:{ Exception -> 0x0349 }
            java.lang.String r12 = r6.field_weight     // Catch:{ Exception -> 0x0349 }
            int r0 = r0.compareTo(r12)     // Catch:{ Exception -> 0x0349 }
            java.lang.String r12 = "coverType"
            if (r0 < 0) goto L_0x0341
            r13 = 1
            r8.put(r12, r13)     // Catch:{ Exception -> 0x0347 }
            goto L_0x0363
        L_0x0341:
            r0 = 2
            r13 = 1
            r8.put(r12, r0)     // Catch:{ Exception -> 0x0347 }
            goto L_0x0363
        L_0x0347:
            r0 = move-exception
            goto L_0x034b
        L_0x0349:
            r0 = move-exception
            r13 = 1
        L_0x034b:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r14 = "reportMsgCover: "
            r12.append(r14)
            java.lang.String r0 = r0.getMessage()
            r12.append(r0)
            java.lang.String r0 = r12.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r4, r0)
        L_0x0363:
            boolean r0 = r2.field_needReport
            if (r0 == 0) goto L_0x0392
            android.content.Context r16 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 31
            r21 = 0
            java.lang.String r0 = r2.field_appId
            r23 = 0
            int r4 = r2.f113470e2
            java.lang.String r12 = r2.field_gameMsgId
            java.lang.String r14 = r2.f113472f2
            java.lang.String r8 = r8.toString()
            java.lang.String r27 = qy1.C12934a.m12382d(r8)
            r22 = r0
            r24 = r4
            r25 = r12
            r26 = r14
            com.tencent.p014mm.game.report.C40314g.m43485d(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
        L_0x0392:
            java.lang.String r0 = r2.field_weight
            java.lang.String r4 = r6.field_weight
            int r0 = r0.compareTo(r4)
            if (r0 < 0) goto L_0x03c8
            boolean r0 = r2.field_needReport
            if (r0 == 0) goto L_0x03ad
            com.tencent.mm.plugin.report.service.n r16 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r17 = 858(0x35a, double:4.24E-321)
            r19 = 10
            r21 = 1
            r23 = 0
            r16.idkeyStat(r17, r19, r21, r23)
        L_0x03ad:
            com.tencent.mm.plugin.game.model.w$q r0 = r6.f113458S1
            java.lang.String r0 = r0.f113551a
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r4 != 0) goto L_0x03c6
            com.tencent.mm.autogen.events.WepkgNotifyEvent r4 = new com.tencent.mm.autogen.events.WepkgNotifyEvent
            r4.<init>()
            com.tencent.mm.autogen.events.WepkgNotifyEvent$a r6 = r4.f107837d
            r8 = 6
            r6.f107838a = r8
            r6.f107839b = r0
            r4.publish()
        L_0x03c6:
            r0 = 1
            goto L_0x03da
        L_0x03c8:
            boolean r0 = r2.field_needReport
            if (r0 == 0) goto L_0x03d9
            com.tencent.mm.plugin.report.service.n r16 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r17 = 858(0x35a, double:4.24E-321)
            r19 = 11
            r21 = 1
            r23 = 0
            r16.idkeyStat(r17, r19, r21, r23)
        L_0x03d9:
            r0 = 0
        L_0x03da:
            if (r0 == 0) goto L_0x03dd
            goto L_0x03e0
        L_0x03dd:
            r6 = 0
            goto L_0x03e1
        L_0x03df:
            r13 = 1
        L_0x03e0:
            r6 = 1
        L_0x03e1:
            if (r6 == 0) goto L_0x03fd
            if (r9 == 0) goto L_0x03e9
            if (r11 == 0) goto L_0x03e9
            if (r10 == 0) goto L_0x040d
        L_0x03e9:
            if (r11 != 0) goto L_0x03f3
            com.tencent.mm.plugin.game.model.a0$a r0 = com.tencent.p014mm.plugin.game.model.C42036a0.C42037a.GAME_REDDOT_EXIT_COVERED
            r1.mo65977f(r0)
            r28.mo65994w(r29)
        L_0x03f3:
            r28.mo65993v(r29)
            r28.mo65992u(r29)
            r28.mo65991t(r29)
            goto L_0x040d
        L_0x03fd:
            if (r10 == 0) goto L_0x040d
            if (r11 != 0) goto L_0x040d
            r28.mo65994w(r29)
            r28.mo65993v(r29)
            r28.mo65992u(r29)
            r28.mo65991t(r29)
        L_0x040d:
            int r0 = r2.field_msgType
            if (r0 == r15) goto L_0x0412
            goto L_0x0423
        L_0x0412:
            f40.o r0 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r0 = r0.mo121142i()
            long r6 = r2.field_msgId
            java.lang.Long r4 = java.lang.Long.valueOf(r6)
            r0.mo119677K(r3, r4)
        L_0x0423:
            r28.mo65990s(r29)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.game.model.C42036a0.mo65989r(com.tencent.mm.plugin.game.model.w):int");
    }

    /* renamed from: s */
    public final void mo65990s(C42119w wVar) {
        if (wVar != null && !Util.isNullOrNil(wVar.f113491q1.f113528b)) {
            C42119w.C42130k kVar = wVar.f113491q1;
            if (kVar.f113532f) {
                C52642c.m59006x(kVar.f113528b, 0.083333336f);
            } else {
                C52642c.m59006x(kVar.f113528b, 0.0f);
            }
        }
    }

    /* renamed from: t */
    public final void mo65991t(C42119w wVar) {
        if (!Util.isNullOrNil(wVar.f113459T1.f113522a)) {
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.GAME_INDEX_BANNER_MSGID_LONG_SYNC, Long.valueOf(wVar.field_msgId));
        } else {
            mo65973b();
        }
    }

    /* renamed from: u */
    public final void mo65992u(C42119w wVar) {
        if (wVar.f113492r1) {
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.GAME_INDEX_BUBBLE_MSGID_LONG_SYNC, Long.valueOf(wVar.field_msgId));
        } else {
            mo65974c();
        }
    }

    /* renamed from: v */
    public final void mo65993v(C42119w wVar) {
        if (!Util.isNullOrNil(wVar.f113442C1.f113503a)) {
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.GAME_INDEX_FLOATLAYER_MSGID_LONG_SYNC, Long.valueOf(wVar.field_msgId));
        } else {
            mo65975d();
        }
    }

    /* renamed from: w */
    public boolean mo65994w(C42119w wVar) {
        C72994y1.C72995a aVar = C72994y1.C72995a.GAME_DISCOVERY_ENTRANCE_MSGID_LONG_SYNC;
        if (!wVar.f113490p1) {
            C86709a0.m107535s().mo121142i().mo119677K(aVar, 0L);
        } else if (!C52642c.m58995m(wVar.f113463X1.f113573q)) {
            C86709a0.m107535s().mo121142i().mo119677K(aVar, Long.valueOf(wVar.field_msgId));
            Log.m105919d("MicroMsg.GameMessageService", "gamelog.srv_msg, service, update, updateGameEntrance gameMsgId: %s.", wVar.field_gameMsgId);
            return true;
        }
        return false;
    }
}
