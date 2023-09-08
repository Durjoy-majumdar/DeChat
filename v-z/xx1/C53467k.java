package xx1;

import com.tencent.p014mm.plugin.game.model.C42072l;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import eb0.C86497v5;
import java.util.ArrayList;
import ob0.C35136m;

/* renamed from: xx1.k */
public class C53467k implements C86497v5.C31521b {
    /* renamed from: C1 */
    public void mo9065C1(C35136m.C35138c cVar) {
        if (cVar != null && !Util.isNullOrNil(cVar.f94253d) && !Util.isNullOrNil(cVar.f94254e)) {
            Log.m105925i("GameSysCmdMsgListener", "delete msgType:%s, msgId:%s", cVar.f94253d, cVar.f94254e);
            if ("gamecenter".equalsIgnoreCase(cVar.f94253d)) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(cVar.f94254e);
                C42072l.m45770a(arrayList, false);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:174:0x07fa  */
    /* JADX WARNING: Removed duplicated region for block: B:201:0x08c1  */
    /* JADX WARNING: Removed duplicated region for block: B:202:0x08c7 A[SYNTHETIC, Splitter:B:202:0x08c7] */
    /* JADX WARNING: Removed duplicated region for block: B:212:0x0924  */
    /* JADX WARNING: Removed duplicated region for block: B:213:0x0926  */
    /* JADX WARNING: Removed duplicated region for block: B:218:0x0947  */
    /* JADX WARNING: Removed duplicated region for block: B:222:0x0966  */
    /* JADX WARNING: Removed duplicated region for block: B:232:0x09b9  */
    /* JADX WARNING: Removed duplicated region for block: B:233:0x09bb  */
    /* JADX WARNING: Removed duplicated region for block: B:235:0x09be  */
    /* JADX WARNING: Removed duplicated region for block: B:236:0x09e2  */
    /* JADX WARNING: Removed duplicated region for block: B:241:0x0a07  */
    /* JADX WARNING: Removed duplicated region for block: B:283:0x0c26  */
    /* JADX WARNING: Removed duplicated region for block: B:286:0x0c30  */
    /* JADX WARNING: Removed duplicated region for block: B:295:0x093b A[EDGE_INSN: B:295:0x093b->B:216:0x093b ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:304:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:305:? A[RETURN, SYNTHETIC] */
    /* renamed from: Y */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo9066Y(ob0.C35136m.C35137a r45) {
        /*
            r44 = this;
            java.lang.Class<sw1.p> r1 = sw1.C48483p.class
            di3.d r0 = di3.C86312j.m106911c(r1)
            sw1.p r0 = (sw1.C48483p) r0
            com.tencent.mm.plugin.game.model.a0 r2 = r0.mo66079ar()
            r0 = r45
            te3.j3 r0 = r0.f94242a
            r2.getClass()
            java.lang.Class<sp.w> r3 = p237sp.C48457w.class
            java.lang.Class<sw1.q> r4 = sw1.C48484q.class
            te3.rv3 r5 = r0.f227631h
            java.lang.String r5 = sf0.C48374j0.m53718g(r5)
            r6 = 1
            java.lang.Object[] r7 = new java.lang.Object[r6]
            long r8 = r0.f227638r
            java.lang.Long r0 = java.lang.Long.valueOf(r8)
            r8 = 0
            r7[r8] = r0
            java.lang.String r9 = "MicroMsg.GameMessageService"
            java.lang.String r0 = "gamelog.srv_msg, service, recv, Received a message: %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r9, r0, r7)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r7 = "gamelog.srv_msg, service, recv, Message content: "
            r0.append(r7)
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r0)
            com.tencent.mm.storage.y1$a r0 = com.tencent.p014mm.storage.C72994y1.C72995a.GAME_MSG_BOTTOM_TAB_BOOLEAN_SYNC
            boolean r7 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r5)
            r12 = 0
            java.lang.String r14 = "MicroMsg.GameMessageParser"
            java.lang.String r15 = "resource"
            java.lang.String r11 = "\""
            if (r7 == 0) goto L_0x0059
            java.lang.String r0 = "msg content is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r14, r0)
            goto L_0x007e
        L_0x0059:
            java.lang.String r7 = "sysmsg"
            java.util.Map r7 = com.tencent.p014mm.sdk.platformtools.XmlParser.parseXml(r5, r7, r12)
            if (r7 == 0) goto L_0x09f7
            int r16 = r7.size()
            if (r16 != 0) goto L_0x0069
            goto L_0x09f7
        L_0x0069:
            java.lang.String r12 = ".sysmsg.$type"
            java.lang.Object r12 = r7.get(r12)
            java.lang.String r12 = (java.lang.String) r12
            java.lang.String r13 = "gamecenter"
            boolean r12 = r13.equalsIgnoreCase(r12)
            if (r12 != 0) goto L_0x0086
            java.lang.String r0 = "Type not matched"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r14, r0)
        L_0x007e:
            r27 = r2
            r28 = r3
            r1 = r11
            r11 = r9
            goto L_0x0a02
        L_0x0086:
            com.tencent.mm.plugin.game.model.w r12 = new com.tencent.mm.plugin.game.model.w
            r12.<init>()
            r12.field_showInMsgList = r6
            r18 = r11
            long r10 = java.lang.System.currentTimeMillis()
            r12.field_msgId = r10
            r12.field_rawXML = r5
            r12.field_hasMergedCount = r6
            java.lang.String r5 = ".sysmsg.gamecenter.$newmsgtype"
            java.lang.Object r10 = r7.get(r5)
            java.lang.String r10 = (java.lang.String) r10
            int r10 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r10, (int) r8)
            r12.field_msgType = r10
            java.lang.String r11 = ".sysmsg.gamecenter.merge_id"
            java.lang.String r13 = ".sysmsg.gamecenter.wifi_flag"
            java.lang.String r6 = ".sysmsg.gamecenter.msg_id"
            r21 = 1000(0x3e8, double:4.94E-321)
            r24 = r9
            r8 = 100
            java.lang.String r9 = ""
            r27 = r2
            r28 = r3
            r2 = 0
            if (r10 == r8) goto L_0x01fd
            r8 = 30
            if (r10 != r8) goto L_0x00c3
            goto L_0x01fd
        L_0x00c3:
            java.lang.Object r6 = r7.get(r6)
            java.lang.String r6 = (java.lang.String) r6
            java.lang.String r6 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r6, (java.lang.String) r9)
            r12.field_gameMsgId = r6
            java.lang.Object r5 = r7.get(r5)
            java.lang.String r5 = (java.lang.String) r5
            r6 = 0
            int r5 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r5, (int) r6)
            r12.field_msgType = r5
            if (r5 != 0) goto L_0x00ec
            java.lang.String r5 = ".sysmsg.gamecenter.$msgtype"
            java.lang.Object r5 = r7.get(r5)
            java.lang.String r5 = (java.lang.String) r5
            int r5 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r5, (int) r6)
            r12.field_msgType = r5
        L_0x00ec:
            java.lang.String r5 = ".sysmsg.gamecenter.appinfo.appid"
            java.lang.Object r5 = r7.get(r5)
            java.lang.String r5 = (java.lang.String) r5
            r12.field_appId = r5
            java.lang.String r5 = ".sysmsg.gamecenter.formatcontent"
            java.lang.Object r5 = r7.get(r5)
            java.lang.String r5 = (java.lang.String) r5
            java.lang.String r5 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r5, (java.lang.String) r9)
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r5)
            r6 = 1
            r5 = r5 ^ r6
            r12.field_showInMsgList = r5
            java.lang.String r5 = ".sysmsg.game_control_info.createtime"
            java.lang.Object r6 = r7.get(r5)
            java.lang.String r6 = (java.lang.String) r6
            long r30 = java.lang.System.currentTimeMillis()
            r10 = r9
            long r8 = r30 / r21
            long r8 = com.tencent.p014mm.sdk.platformtools.Util.getLong(r6, r8)
            r12.field_createTime = r8
            java.lang.String r6 = ".sysmsg.game_control_info.expiredtime"
            java.lang.Object r6 = r7.get(r6)
            java.lang.String r6 = (java.lang.String) r6
            long r8 = com.tencent.p014mm.sdk.platformtools.Util.getLong(r6, r2)
            int r6 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r6 != 0) goto L_0x0137
            r2 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r12.field_expireTime = r2
            goto L_0x014a
        L_0x0137:
            java.lang.Object r2 = r7.get(r5)
            java.lang.String r2 = (java.lang.String) r2
            long r5 = java.lang.System.currentTimeMillis()
            long r5 = r5 / r21
            long r2 = com.tencent.p014mm.sdk.platformtools.Util.getLong(r2, r5)
            long r2 = r2 + r8
            r12.field_expireTime = r2
        L_0x014a:
            java.lang.Object r2 = r7.get(r13)
            java.lang.String r2 = (java.lang.String) r2
            r3 = 0
            int r2 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r2, (int) r3)
            if (r2 <= 0) goto L_0x015b
            r2 = 1
            r12.field_isHidden = r2
            goto L_0x015d
        L_0x015b:
            r12.field_isHidden = r3
        L_0x015d:
            java.lang.Object r2 = r7.get(r11)
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r2 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r2, (java.lang.String) r10)
            r12.field_mergerId = r2
            int r2 = r12.field_msgType
            r3 = 10
            if (r2 != r3) goto L_0x0174
            java.lang.String r2 = "6"
            r12.field_weight = r2
            goto L_0x0178
        L_0x0174:
            java.lang.String r2 = "2"
            r12.field_weight = r2
        L_0x0178:
            long r2 = java.lang.System.currentTimeMillis()
            long r2 = r2 / r21
            r12.field_receiveTime = r2
            java.lang.String r2 = ".sysmsg.game_control_info.filter_flag"
            java.lang.Object r2 = r7.get(r2)
            java.lang.String r2 = (java.lang.String) r2
            r5 = 0
            long r2 = com.tencent.p014mm.sdk.platformtools.Util.getLong(r2, r5)
            r12.f113440A1 = r2
            java.lang.String r2 = ".sysmsg.game_control_info.control_flag"
            java.lang.Object r2 = r7.get(r2)
            java.lang.String r2 = (java.lang.String) r2
            long r2 = com.tencent.p014mm.sdk.platformtools.Util.getLong(r2, r5)
            r12.f113500z1 = r2
            java.lang.String r2 = ".sysmsg.game_control_info.not_in_msg_center"
            java.lang.Object r2 = r7.get(r2)
            java.lang.String r2 = (java.lang.String) r2
            r3 = 0
            int r2 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r2, (int) r3)
            r12.f113441B1 = r2
            java.lang.String r2 = ".sysmsg.gamecenter.message_bubble_info.show_message_bubble"
            java.lang.Object r2 = r7.get(r2)
            java.lang.String r2 = (java.lang.String) r2
            int r2 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r2, (int) r3)
            if (r2 <= 0) goto L_0x01bd
            r2 = 1
            goto L_0x01be
        L_0x01bd:
            r2 = 0
        L_0x01be:
            r12.f113492r1 = r2
            java.lang.String r2 = ".sysmsg.gamecenter.noticeid"
            java.lang.Object r2 = r7.get(r2)
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r2 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r2, (java.lang.String) r10)
            r12.f113472f2 = r2
            com.tencent.mm.plugin.game.model.w$k r2 = r12.f113491q1
            java.lang.String r3 = ".sysmsg.gamecenter.badge_display_type"
            java.lang.Object r3 = r7.get(r3)
            java.lang.String r3 = (java.lang.String) r3
            r5 = 0
            int r3 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r3, (int) r5)
            r2.f113527a = r3
            com.tencent.mm.plugin.game.model.w$k r2 = r12.f113491q1
            int r2 = r2.f113527a
            if (r2 <= 0) goto L_0x01e7
            r2 = 1
            goto L_0x01e8
        L_0x01e7:
            r2 = 0
        L_0x01e8:
            r12.f113490p1 = r2
            long r2 = r12.f113500z1
            r5 = 4
            long r2 = r2 & r5
            r5 = 0
            int r8 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r8 != 0) goto L_0x01f8
            r2 = 0
            r12.f113490p1 = r2
        L_0x01f8:
            com.tencent.p014mm.plugin.game.model.C42146y.m45834b(r7, r12)
            goto L_0x0397
        L_0x01fd:
            r10 = r9
            com.tencent.mm.plugin.game.model.c0 r2 = com.tencent.p014mm.plugin.game.model.C42044c0.f113285a
            if (r2 != 0) goto L_0x0209
            com.tencent.mm.plugin.game.model.c0 r2 = new com.tencent.mm.plugin.game.model.c0
            r2.<init>()
            com.tencent.p014mm.plugin.game.model.C42044c0.f113285a = r2
        L_0x0209:
            com.tencent.mm.plugin.game.model.c0 r2 = com.tencent.p014mm.plugin.game.model.C42044c0.f113285a
            r2.getClass()
            java.lang.Object r3 = r7.get(r6)
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r3 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r3, (java.lang.String) r10)
            r12.field_gameMsgId = r3
            java.lang.String r3 = ".sysmsg.gamecenter.appid"
            java.lang.Object r3 = r7.get(r3)
            java.lang.String r3 = (java.lang.String) r3
            r12.field_appId = r3
            java.lang.String r3 = ".sysmsg.gamecenter.time_info.create_time"
            java.lang.Object r5 = r7.get(r3)
            java.lang.String r5 = (java.lang.String) r5
            long r8 = java.lang.System.currentTimeMillis()
            long r8 = r8 / r21
            long r5 = com.tencent.p014mm.sdk.platformtools.Util.getLong(r5, r8)
            r12.field_createTime = r5
            java.lang.String r5 = ".sysmsg.gamecenter.time_info.expire_time"
            java.lang.Object r5 = r7.get(r5)
            java.lang.String r5 = (java.lang.String) r5
            r8 = 0
            long r5 = com.tencent.p014mm.sdk.platformtools.Util.getLong(r5, r8)
            int r32 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r32 != 0) goto L_0x0252
            r8 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r12.field_expireTime = r8
            goto L_0x0265
        L_0x0252:
            java.lang.Object r3 = r7.get(r3)
            java.lang.String r3 = (java.lang.String) r3
            long r8 = java.lang.System.currentTimeMillis()
            long r8 = r8 / r21
            long r8 = com.tencent.p014mm.sdk.platformtools.Util.getLong(r3, r8)
            long r8 = r8 + r5
            r12.field_expireTime = r8
        L_0x0265:
            java.lang.String r3 = ".sysmsg.gamecenter.time_info.random_time"
            java.lang.Object r3 = r7.get(r3)
            java.lang.String r3 = (java.lang.String) r3
            r5 = 0
            long r8 = com.tencent.p014mm.sdk.platformtools.Util.getLong(r3, r5)
            r12.f113471f1 = r8
            java.lang.Object r3 = r7.get(r13)
            java.lang.String r3 = (java.lang.String) r3
            r5 = 0
            int r3 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r3, (int) r5)
            if (r3 <= 0) goto L_0x0286
            r3 = 1
            r12.field_isHidden = r3
            goto L_0x0288
        L_0x0286:
            r12.field_isHidden = r5
        L_0x0288:
            java.lang.Object r3 = r7.get(r11)
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r3 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r3, (java.lang.String) r10)
            r12.field_mergerId = r3
            java.lang.String r3 = ".sysmsg.gamecenter.weight"
            java.lang.Object r3 = r7.get(r3)
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r3 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r3, (java.lang.String) r10)
            r12.field_weight = r3
            long r5 = java.lang.System.currentTimeMillis()
            long r5 = r5 / r21
            r12.field_receiveTime = r5
            java.lang.String r3 = ".sysmsg.gamecenter.entrance.entrance_show_control.reappearable"
            java.lang.Object r3 = r7.get(r3)
            java.lang.String r3 = (java.lang.String) r3
            r5 = 0
            int r3 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r3, (int) r5)
            r5 = 1
            if (r3 != r5) goto L_0x02bc
            r3 = 1
            goto L_0x02bd
        L_0x02bc:
            r3 = 0
        L_0x02bd:
            r12.field_reappearable = r3
            java.lang.String r3 = ".sysmsg.gamecenter.push_id"
            java.lang.Object r3 = r7.get(r3)
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r3 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r3, (java.lang.String) r10)
            r12.field_pushId = r3
            boolean r3 = com.tencent.p014mm.plugin.game.commlib.util.C30081b.m38959a()
            if (r3 == 0) goto L_0x02d5
            r3 = 2
            goto L_0x02d6
        L_0x02d5:
            r3 = 0
        L_0x02d6:
            java.lang.String r5 = ".sysmsg.gamecenter.exposure_strategy.channel"
            java.lang.Object r5 = r7.get(r5)
            java.lang.String r5 = (java.lang.String) r5
            int r3 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r5, (int) r3)
            r12.field_channel = r3
            java.lang.String r3 = ".sysmsg.gamecenter.exposure_strategy.click_score"
            java.lang.Object r3 = r7.get(r3)
            java.lang.String r3 = (java.lang.String) r3
            r5 = 1056964608(0x3f000000, float:0.5)
            float r3 = com.tencent.p014mm.sdk.platformtools.Util.getFloat(r3, r5)
            r12.field_clickScore = r3
            r2.mo66025m(r7, r12)
            java.lang.String r3 = ".sysmsg.gamecenter.filter_flag"
            java.lang.Object r3 = r7.get(r3)
            java.lang.String r3 = (java.lang.String) r3
            r5 = 0
            long r8 = com.tencent.p014mm.sdk.platformtools.Util.getLong(r3, r5)
            r12.f113440A1 = r8
            java.lang.String r3 = ".sysmsg.gamecenter.msg_center.not_in_msg_center"
            java.lang.Object r3 = r7.get(r3)
            java.lang.String r3 = (java.lang.String) r3
            r5 = 0
            int r3 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r3, (int) r5)
            r12.f113441B1 = r3
            r2.mo66013a(r7, r12)
            r2.mo66020h(r7, r12)
            com.tencent.mm.plugin.game.model.w$q r3 = r12.f113458S1
            java.lang.String r5 = ".sysmsg.gamecenter.display_with_wepkg.$pkg_id"
            java.lang.Object r5 = r7.get(r5)
            java.lang.String r5 = (java.lang.String) r5
            java.lang.String r5 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r5, (java.lang.String) r10)
            r3.f113551a = r5
            com.tencent.mm.plugin.game.model.w$q r3 = r12.f113458S1
            java.lang.String r5 = ".sysmsg.gamecenter.display_with_wepkg"
            java.lang.Object r5 = r7.get(r5)
            java.lang.String r5 = (java.lang.String) r5
            r6 = 0
            int r5 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r5, (int) r6)
            r3.f113552b = r5
            com.tencent.mm.plugin.game.model.w$q r3 = r12.f113458S1
            java.lang.String r3 = r3.f113551a
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
            if (r3 != 0) goto L_0x034a
            r3 = 1
            r12.field_isHidden = r3
        L_0x034a:
            com.tencent.mm.plugin.game.model.w$q r3 = r12.f113458S1
            java.lang.String r5 = ".sysmsg.gamecenter.display_with_wepkg.$always_display_after_time"
            java.lang.Object r5 = r7.get(r5)
            java.lang.String r5 = (java.lang.String) r5
            r8 = 0
            long r5 = com.tencent.p014mm.sdk.platformtools.Util.getLong(r5, r8)
            r3.f113553c = r5
            java.lang.String r3 = ".sysmsg.gamecenter.device_flag"
            java.lang.Object r3 = r7.get(r3)
            java.lang.String r3 = (java.lang.String) r3
            r5 = 0
            int r3 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r3, (int) r5)
            r12.f113499y1 = r3
            r2.mo66017e(r7, r12)
            r2.mo66018f(r7, r12)
            r2.mo66023k(r7, r12)
            r2.mo66021i(r7, r12)
            r2.mo66022j(r7, r12)
            r2.mo66019g(r7, r12)
            r2.mo66024l(r7, r12)
            int r2 = r12.field_msgType
            r3 = 30
            if (r2 != r3) goto L_0x0397
            com.tencent.mm.plugin.game.model.w$t r2 = r12.f113461V1
            java.lang.String r3 = ".sysmsg.gamecenter.download_type"
            java.lang.Object r3 = r7.get(r3)
            java.lang.String r3 = (java.lang.String) r3
            r5 = 0
            int r3 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r3, (int) r5)
            r2.f113581a = r3
        L_0x0397:
            com.tencent.mm.plugin.game.model.w$s r2 = r12.f113463X1
            int r2 = r2.f113558b
            r12.field_showType = r2
            r3 = 1
            if (r2 == r3) goto L_0x03a3
            r3 = 2
            if (r2 != r3) goto L_0x03bd
        L_0x03a3:
            f40.o r2 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r2 = r2.mo121142i()
            com.tencent.mm.storage.y1$a r3 = com.tencent.p014mm.storage.C72994y1.C72995a.GAME_MSG_NOTIFY_TAB_BOOLEAN_SYNC
            java.lang.Boolean r5 = java.lang.Boolean.TRUE
            r2.mo119677K(r3, r5)
            f40.o r2 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r2 = r2.mo121142i()
            r2.mo119677K(r0, r5)
        L_0x03bd:
            com.tencent.mm.plugin.game.model.w$h r2 = r12.f113464Y1
            boolean r2 = r2.f113520a
            if (r2 == 0) goto L_0x03dd
            f40.o r2 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r2 = r2.mo121142i()
            com.tencent.mm.storage.y1$a r3 = com.tencent.p014mm.storage.C72994y1.C72995a.GAME_MSG_CHAT_TAB_BOOLEAN_SYNC
            java.lang.Boolean r5 = java.lang.Boolean.TRUE
            r2.mo119677K(r3, r5)
            f40.o r2 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r2 = r2.mo121142i()
            r2.mo119677K(r0, r5)
        L_0x03dd:
            com.tencent.mm.plugin.game.model.w$s r0 = r12.f113463X1
            java.lang.String r2 = r0.f113577u
            r12.field_quickResponseContentId = r2
            int r2 = r12.field_showType
            if (r2 == 0) goto L_0x03f0
            int r2 = r0.f113559c
            r3 = 1
            if (r2 != r3) goto L_0x03f8
            r2 = 0
            r12.field_showInMsgList = r2
            goto L_0x03f8
        L_0x03f0:
            r2 = 0
            r3 = 1
            int r5 = r12.f113441B1
            if (r5 != r3) goto L_0x03f8
            r12.field_showInMsgList = r2
        L_0x03f8:
            java.lang.String r0 = r0.f113566j
            r12.field_interactiveMergeId = r0
            com.tencent.mm.plugin.game.model.w$r r0 = r12.f113465Z1
            long r2 = r0.f113556c
            r12.field_redDotExpireTime = r2
            com.tencent.p014mm.plugin.game.model.C42146y.m45833a(r7, r12)
            com.tencent.mm.plugin.game.model.w$v r0 = r12.f113460U1
            java.lang.String r2 = ".sysmsg.support_version.$android"
            java.lang.Object r2 = r7.get(r2)
            java.lang.String r2 = (java.lang.String) r2
            r3 = 0
            int r2 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r2, (int) r3)
            r0.f113586a = r2
            r2 = 2
            java.lang.Object[] r0 = new java.lang.Object[r2]
            com.tencent.mm.plugin.game.model.w$v r2 = r12.f113460U1
            int r2 = r2.f113586a
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0[r3] = r2
            int r2 = qe3.C89625d.f257841g
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3 = 1
            r0[r3] = r2
            java.lang.String r2 = "xml support version: %d, current client version: %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r14, r2, r0)
            com.tencent.mm.plugin.game.model.w$v r0 = r12.f113460U1
            int r0 = r0.f113586a
            if (r0 == 0) goto L_0x043f
            int r2 = qe3.C89625d.f257841g
            if (r0 > r2) goto L_0x043d
            goto L_0x043f
        L_0x043d:
            r0 = 0
            goto L_0x0440
        L_0x043f:
            r0 = 1
        L_0x0440:
            if (r0 != 0) goto L_0x0475
            java.lang.String r0 = "xml is invalid in current client version"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r14, r0)
            boolean r0 = r12.field_needReport
            if (r0 == 0) goto L_0x046f
            android.content.Context r29 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            r30 = 0
            r31 = 0
            r32 = 0
            r33 = 401(0x191, float:5.62E-43)
            r34 = 0
            java.lang.String r0 = r12.field_appId
            r36 = 0
            r37 = 0
            java.lang.String r1 = r12.field_gameMsgId
            java.lang.String r2 = r12.f113472f2
            java.lang.String r40 = ""
            r35 = r0
            r38 = r1
            r39 = r2
            com.tencent.p014mm.game.report.C40314g.m43485d(r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40)
        L_0x046f:
            r1 = r18
            r11 = r24
            goto L_0x0a02
        L_0x0475:
            com.tencent.mm.plugin.game.model.l r0 = com.tencent.p014mm.plugin.game.model.C42072l.f113359a
            if (r0 != 0) goto L_0x0480
            com.tencent.mm.plugin.game.model.l r0 = new com.tencent.mm.plugin.game.model.l
            r0.<init>()
            com.tencent.p014mm.plugin.game.model.C42072l.f113359a = r0
        L_0x0480:
            com.tencent.mm.plugin.game.model.l r0 = com.tencent.p014mm.plugin.game.model.C42072l.f113359a
            boolean r2 = r12.field_needReport
            r0.getClass()
            java.lang.String r0 = ".sysmsg.wepkg.$pkg_id"
            java.lang.Object r0 = r7.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r0, (java.lang.String) r10)
            java.lang.String r3 = ".sysmsg.wepkg.download_trigger_type"
            java.lang.Object r3 = r7.get(r3)
            java.lang.String r3 = (java.lang.String) r3
            r5 = 0
            int r3 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r3, (int) r5)
            java.lang.String r6 = ".sysmsg.wepkg.download_type"
            java.lang.Object r6 = r7.get(r6)
            java.lang.String r6 = (java.lang.String) r6
            int r6 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r6, (int) r5)
            zt3.t r5 = zt3.C119157j.f356862d
            com.tencent.mm.plugin.game.model.i r8 = new com.tencent.mm.plugin.game.model.i
            r8.<init>(r0, r3, r6, r2)
            zt3.j r5 = (zt3.C119157j) r5
            r5.mo183884o(r8)
            java.lang.String r0 = ".sysmsg.control_command"
            java.lang.Object r0 = r7.get(r0)
            java.lang.String r3 = "MicroMsg.GameControlCmdParser"
            if (r0 != 0) goto L_0x04cf
            java.lang.String r0 = "dont exist control command"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r0)
            r14 = r18
            r11 = r24
            r24 = r12
            goto L_0x09f3
        L_0x04cf:
            com.tencent.mm.storage.y1$a r0 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_GAME_PULL_GLOBAL_CONFIG_TIME_LONG
            java.lang.String r5 = ".sysmsg.control_command.global_setting"
            java.lang.Object r5 = r7.get(r5)
            if (r5 == 0) goto L_0x0572
            java.lang.String r5 = ".sysmsg.control_command.global_setting.pull_trigger_type"
            java.lang.Object r5 = r7.get(r5)
            java.lang.String r5 = (java.lang.String) r5
            r6 = 0
            int r5 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r5, (int) r6)
            java.lang.String r8 = ".sysmsg.control_command.global_setting.expect_complete_seconds"
            java.lang.Object r8 = r7.get(r8)
            java.lang.String r8 = (java.lang.String) r8
            r13 = 0
            long r8 = com.tencent.p014mm.sdk.platformtools.Util.getLong(r8, r13)
            r11 = 2
            java.lang.Object[] r13 = new java.lang.Object[r11]
            java.lang.Integer r11 = java.lang.Integer.valueOf(r5)
            r13[r6] = r11
            java.lang.Long r11 = java.lang.Long.valueOf(r8)
            r14 = 1
            r13[r14] = r11
            java.lang.String r11 = "gamelog.srv_msg, service, ctrl_msg, global_setting, pull_trigger_type:%d, expect_complete_seconds:%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r11, r13)
            if (r5 != 0) goto L_0x054a
            r25 = 0
            int r5 = (r8 > r25 ? 1 : (r8 == r25 ? 0 : -1))
            if (r5 > 0) goto L_0x0514
            r5 = 0
            goto L_0x0527
        L_0x0514:
            int r5 = (int) r8
            int r5 = com.tencent.p014mm.sdk.platformtools.Util.getIntRandom(r5, r6)
            java.lang.Object[] r8 = new java.lang.Object[r14]
            java.lang.Integer r9 = java.lang.Integer.valueOf(r5)
            r8[r6] = r9
            java.lang.String r6 = "random time interval:%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r6, r8)
            long r5 = (long) r5
        L_0x0527:
            long r8 = com.tencent.p014mm.sdk.platformtools.Util.nowSecond()
            long r8 = r8 + r5
            f40.o r11 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r11 = r11.mo121142i()
            java.lang.Long r8 = java.lang.Long.valueOf(r8)
            r11.mo119677K(r0, r8)
            com.tencent.mm.sdk.platformtools.MMHandler r0 = com.tencent.p014mm.plugin.game.commlib.util.C41864d.m45386c()
            com.tencent.mm.plugin.game.model.j r8 = new com.tencent.mm.plugin.game.model.j
            r8.<init>()
            long r5 = r5 * r21
            r0.postDelayed(r8, r5)
            goto L_0x0572
        L_0x054a:
            r6 = 1
            if (r5 != r6) goto L_0x0572
            android.content.Context r5 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            boolean r5 = com.tencent.p014mm.plugin.wepkg.utils.C44536d.m48919e(r5)
            if (r5 == 0) goto L_0x055f
            com.tencent.mm.plugin.game.commlib.d r0 = com.tencent.p014mm.plugin.game.commlib.C30075d.m38954a()
            r0.mo57102b(r6, r6)
            goto L_0x0572
        L_0x055f:
            f40.o r5 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r5 = r5.mo121142i()
            long r8 = com.tencent.p014mm.sdk.platformtools.Util.nowSecond()
            java.lang.Long r6 = java.lang.Long.valueOf(r8)
            r5.mo119677K(r0, r6)
        L_0x0572:
            java.lang.String r0 = ".sysmsg.control_command.message_setting.hide_conf"
            java.lang.Object r5 = r7.get(r0)
            java.lang.String r6 = "msg_id"
            if (r5 == 0) goto L_0x0640
            com.tencent.mm.plugin.game.model.l$a r5 = new com.tencent.mm.plugin.game.model.l$a
            r5.<init>()
            java.lang.String r8 = ".sysmsg.control_command.message_setting.hide_conf.$start_time"
            java.lang.Object r8 = r7.get(r8)
            java.lang.String r8 = (java.lang.String) r8
            r13 = 0
            long r8 = com.tencent.p014mm.sdk.platformtools.Util.getLong(r8, r13)
            r5.f113360a = r8
            java.lang.String r8 = ".sysmsg.control_command.message_setting.hide_conf.$end_time"
            java.lang.Object r8 = r7.get(r8)
            java.lang.String r8 = (java.lang.String) r8
            long r8 = com.tencent.p014mm.sdk.platformtools.Util.getLong(r8, r13)
            r5.f113361b = r8
            java.lang.String r8 = ".sysmsg.control_command.message_setting.hide_conf.$msg_type"
            java.lang.Object r8 = r7.get(r8)
            java.lang.String r8 = (java.lang.String) r8
            r9 = -10
            int r8 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r8, (int) r9)
            r5.f113362c = r8
            java.util.List<java.lang.String> r8 = r5.f113363d
            java.util.List r0 = com.tencent.p014mm.plugin.game.model.C42072l.m45771b(r0, r6, r7)
            java.util.ArrayList r8 = (java.util.ArrayList) r8
            r8.addAll(r0)
            r8 = 3
            java.lang.Object[] r0 = new java.lang.Object[r8]
            long r8 = r5.f113360a
            java.lang.Long r8 = java.lang.Long.valueOf(r8)
            r9 = 0
            r0[r9] = r8
            long r8 = r5.f113361b
            java.lang.Long r8 = java.lang.Long.valueOf(r8)
            r9 = 1
            r0[r9] = r8
            int r8 = r5.f113362c
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r9 = 2
            r0[r9] = r8
            java.lang.String r8 = "gamelog.srv_msg, service, ctrl_msg, hide_msg, start:%d, end:%d, type:%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r3, r8, r0)
            f40.o r0 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r0 = r0.mo121142i()
            com.tencent.mm.storage.y1$a r8 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_GAME_MESSAGE_SETTING_HIDE_CONF_STRING
            java.lang.Object r0 = r0.mo119685f(r8, r10)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r0)
            boolean r9 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)     // Catch:{ JSONException -> 0x063f }
            if (r9 != 0) goto L_0x0609
            org.json.JSONArray r9 = new org.json.JSONArray     // Catch:{ JSONException -> 0x063f }
            r9.<init>(r0)     // Catch:{ JSONException -> 0x063f }
            int r0 = r9.length()     // Catch:{ JSONException -> 0x063f }
            r11 = 20
            if (r0 <= r11) goto L_0x060e
            r11 = 0
            r9.remove(r11)     // Catch:{ JSONException -> 0x063f }
            goto L_0x060e
        L_0x0609:
            org.json.JSONArray r9 = new org.json.JSONArray     // Catch:{ JSONException -> 0x063f }
            r9.<init>()     // Catch:{ JSONException -> 0x063f }
        L_0x060e:
            java.lang.String r0 = r5.mo66039a()     // Catch:{ JSONException -> 0x063f }
            r9.put(r0)     // Catch:{ JSONException -> 0x063f }
            f40.o r0 = f40.C86709a0.m107535s()     // Catch:{ JSONException -> 0x063f }
            com.tencent.mm.storage.v1 r0 = r0.mo121142i()     // Catch:{ JSONException -> 0x063f }
            java.lang.String r5 = r9.toString()     // Catch:{ JSONException -> 0x063f }
            r0.mo119677K(r8, r5)     // Catch:{ JSONException -> 0x063f }
            java.lang.String r0 = "gamelog.srv_msg, service, ctrl_msg, hide_msg, hideConf list size:%d, content:%s"
            r5 = 2
            java.lang.Object[] r8 = new java.lang.Object[r5]     // Catch:{ JSONException -> 0x063f }
            int r5 = r9.length()     // Catch:{ JSONException -> 0x063f }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ JSONException -> 0x063f }
            r11 = 0
            r8[r11] = r5     // Catch:{ JSONException -> 0x063f }
            java.lang.String r5 = r9.toString()     // Catch:{ JSONException -> 0x063f }
            r9 = 1
            r8[r9] = r5     // Catch:{ JSONException -> 0x063f }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r0, r8)     // Catch:{ JSONException -> 0x063f }
            goto L_0x0640
        L_0x063f:
        L_0x0640:
            java.lang.String r0 = ".sysmsg.control_command.message_setting.del_conf"
            java.lang.Object r5 = r7.get(r0)
            if (r5 == 0) goto L_0x07e8
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.List r6 = com.tencent.p014mm.plugin.game.model.C42072l.m45771b(r0, r6, r7)
            r5.addAll(r6)
            com.tencent.p014mm.plugin.game.model.C42072l.m45770a(r5, r2)
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.lang.String r6 = "push_id"
            java.util.List r0 = com.tencent.p014mm.plugin.game.model.C42072l.m45771b(r0, r6, r7)
            r5.addAll(r0)
            com.tencent.mm.storage.y1$a r6 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_GAME_FUNCTION_MSG_PUSHID_DELETED_STRING
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.util.List) r5)
            if (r0 == 0) goto L_0x066f
            goto L_0x07e8
        L_0x066f:
            f40.o r0 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r0 = r0.mo121142i()
            java.lang.Object r0 = r0.mo119685f(r6, r10)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r0)
            boolean r8 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)     // Catch:{ JSONException -> 0x0693 }
            if (r8 != 0) goto L_0x068d
            org.json.JSONArray r8 = new org.json.JSONArray     // Catch:{ JSONException -> 0x0693 }
            r8.<init>(r0)     // Catch:{ JSONException -> 0x0693 }
            goto L_0x06a6
        L_0x068d:
            org.json.JSONArray r8 = new org.json.JSONArray     // Catch:{ JSONException -> 0x0693 }
            r8.<init>()     // Catch:{ JSONException -> 0x0693 }
            goto L_0x06a6
        L_0x0693:
            r0 = move-exception
            f40.o r8 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r8 = r8.mo121142i()
            r8.mo119677K(r6, r10)
            r8 = 0
            java.lang.Object[] r9 = new java.lang.Object[r8]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r3, r0, r10, r9)
            r8 = 0
        L_0x06a6:
            if (r8 != 0) goto L_0x06aa
            goto L_0x07e8
        L_0x06aa:
            java.util.Iterator r0 = r5.iterator()
        L_0x06ae:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L_0x07c7
            java.lang.Object r5 = r0.next()
            java.lang.String r5 = (java.lang.String) r5
            int r9 = r8.length()
            r11 = 100
            if (r9 <= r11) goto L_0x06c6
            r9 = 0
            r8.remove(r9)
        L_0x06c6:
            r8.put(r5)
            di3.d r9 = di3.C86312j.m106911c(r1)
            sw1.p r9 = (sw1.C48483p) r9
            com.tencent.mm.plugin.game.model.a0 r9 = r9.mo66079ar()
            com.tencent.mm.plugin.game.model.w r13 = r9.mo65984m()
            if (r13 == 0) goto L_0x06ea
            java.lang.String r13 = r13.field_pushId
            java.lang.String r13 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r13)
            boolean r13 = r13.equals(r5)
            if (r13 == 0) goto L_0x06ea
            com.tencent.mm.plugin.game.model.a0$a r13 = com.tencent.p014mm.plugin.game.model.C42036a0.C42037a.GAME_REDDOT_EXIT_REVOKE
            r9.mo65977f(r13)
        L_0x06ea:
            di3.d r9 = di3.C86312j.m106911c(r4)
            sw1.q r9 = (sw1.C48484q) r9
            com.tencent.mm.plugin.game.model.b0 r9 = r9.xi0()
            r9.getClass()
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r14 = "select * from GameRawMessage where pushId = \""
            r13.append(r14)
            r13.append(r5)
            r14 = r18
            r13.append(r14)
            java.lang.String r13 = r13.toString()
            r18 = r0
            r11 = 0
            java.lang.String[] r0 = new java.lang.String[r11]
            android.database.Cursor r0 = r9.rawQuery(r13, r0)
            if (r0 != 0) goto L_0x071a
            r9 = 0
            goto L_0x072b
        L_0x071a:
            com.tencent.mm.plugin.game.model.w r9 = new com.tencent.mm.plugin.game.model.w
            r9.<init>()
            boolean r11 = r0.moveToFirst()
            if (r11 == 0) goto L_0x0728
            r9.convertFrom(r0)
        L_0x0728:
            r0.close()
        L_0x072b:
            if (r9 == 0) goto L_0x0749
            java.lang.String r0 = r9.field_pushId
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0749
            di3.d r0 = di3.C86312j.m106911c(r4)
            sw1.q r0 = (sw1.C48484q) r0
            com.tencent.mm.plugin.game.model.b0 r0 = r0.xi0()
            r11 = 0
            java.lang.String[] r5 = new java.lang.String[r11]
            r0.delete(r9, r5)
            r11 = r24
            r0 = 1
            goto L_0x0760
        L_0x0749:
            r11 = 0
            r9 = 1
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r0[r11] = r5
            java.lang.String r9 = "dont have pushId:%s for delete"
            r11 = r24
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r11, r9, r0)
            com.tencent.mm.plugin.game.model.w r9 = new com.tencent.mm.plugin.game.model.w
            r9.<init>()
            r9.field_gameMsgId = r10
            r9.field_pushId = r5
            r0 = 0
        L_0x0760:
            if (r0 == 0) goto L_0x0767
            r0 = 201(0xc9, float:2.82E-43)
            r37 = 201(0xc9, float:2.82E-43)
            goto L_0x076b
        L_0x0767:
            r0 = 202(0xca, float:2.83E-43)
            r37 = 202(0xca, float:2.83E-43)
        L_0x076b:
            if (r2 == 0) goto L_0x07b3
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.lang.String r5 = r9.field_pushId
            java.lang.String r5 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r5)
            java.lang.String r13 = "pushId"
            r0.put(r13, r5)
            android.content.Context r32 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            r33 = 0
            r36 = 403(0x193, float:5.65E-43)
            java.lang.String r5 = r9.field_appId
            r39 = 0
            int r13 = r9.f113470e2
            r21 = r1
            java.lang.String r1 = r9.field_gameMsgId
            r22 = r2
            java.lang.String r2 = r9.f113472f2
            r24 = r12
            com.tencent.mm.plugin.game.model.w$k r12 = r9.f113491q1
            int r12 = r12.f113527a
            java.lang.String r12 = java.lang.String.valueOf(r12)
            java.lang.String r9 = r9.f113474g2
            java.lang.String r43 = com.tencent.p014mm.game.report.C40314g.m43482a(r15, r12, r9, r0)
            r35 = 0
            r34 = 0
            r38 = r5
            r40 = r13
            r41 = r1
            r42 = r2
            com.tencent.p014mm.game.report.C40314g.m43485d(r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43)
            goto L_0x07b9
        L_0x07b3:
            r21 = r1
            r22 = r2
            r24 = r12
        L_0x07b9:
            r0 = r18
            r1 = r21
            r2 = r22
            r12 = r24
            r24 = r11
            r18 = r14
            goto L_0x06ae
        L_0x07c7:
            r14 = r18
            r11 = r24
            r24 = r12
            java.lang.String r0 = r8.toString()
            f40.o r1 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r1 = r1.mo121142i()
            r1.mo119677K(r6, r0)
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r1 = 0
            r2[r1] = r0
            java.lang.String r0 = "gamelog.srv_msg, service, ctrl_msg, delete_msg, deleted msg by pushId list:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r0, r2)
            goto L_0x07ee
        L_0x07e8:
            r14 = r18
            r11 = r24
            r24 = r12
        L_0x07ee:
            java.lang.Class<sp.y> r0 = p237sp.C13754y.class
            java.lang.Class<sp.t> r1 = p237sp.C48456t.class
            java.lang.String r2 = ".sysmsg.control_command.game_download"
            java.lang.Object r2 = r7.get(r2)
            if (r2 == 0) goto L_0x08a4
            java.lang.String r2 = ".sysmsg.control_command.game_download.delete_all_download_task"
            java.lang.Object r2 = r7.get(r2)
            java.lang.String r2 = (java.lang.String) r2
            r5 = 0
            int r2 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r2, (int) r5)
            r5 = 1
            if (r2 != r5) goto L_0x080c
            r2 = 1
            goto L_0x080d
        L_0x080c:
            r2 = 0
        L_0x080d:
            java.lang.String r5 = ".sysmsg.control_command.game_download.delete_download_task.$appid"
            java.lang.Object r5 = r7.get(r5)
            java.lang.String r5 = (java.lang.String) r5
            java.lang.String r5 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r5, (java.lang.String) r10)
            java.lang.String r6 = ".sysmsg.control_command.game_download.delete_download_task.download_url"
            java.lang.Object r6 = r7.get(r6)
            java.lang.String r6 = (java.lang.String) r6
            java.lang.String r6 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r6, (java.lang.String) r10)
            r8 = 3
            java.lang.Object[] r9 = new java.lang.Object[r8]
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r2)
            r12 = 0
            r9[r12] = r8
            r8 = 1
            r9[r8] = r5
            r8 = 2
            r9[r8] = r6
            java.lang.String r8 = "gamelog.srv_msg, service, ctrl_msg, game_download, del_all:%b, del_appid:%s, del_url:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r8, r9)
            if (r2 == 0) goto L_0x086e
            di3.d r1 = di3.C86312j.m106911c(r1)
            sp.t r1 = (p237sp.C48456t) r1
            java.util.LinkedList r1 = r1.mo72819Cz()
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.util.List) r1)
            if (r2 != 0) goto L_0x08a4
            java.util.Iterator r1 = r1.iterator()
        L_0x0850:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x08a4
            java.lang.Object r2 = r1.next()
            xh.w2 r2 = (p749xh.C53352w2) r2
            di3.d r5 = di3.C86312j.m106911c(r0)
            sp.y r5 = (p237sp.C13754y) r5
            sp.v r5 = r5.Ds0()
            long r8 = r2.field_downloadId
            com.tencent.mm.plugin.downloader.model.l r5 = (com.tencent.p014mm.plugin.downloader.model.C40935l) r5
            r5.mo63970r(r8)
            goto L_0x0850
        L_0x086e:
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r5)
            if (r2 != 0) goto L_0x087f
            di3.d r1 = di3.C86312j.m106911c(r1)
            sp.t r1 = (p237sp.C48456t) r1
            xh.w2 r12 = r1.mo72822IX(r5)
            goto L_0x0891
        L_0x087f:
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r6)
            if (r2 != 0) goto L_0x0890
            di3.d r1 = di3.C86312j.m106911c(r1)
            sp.t r1 = (p237sp.C48456t) r1
            xh.w2 r12 = r1.I60(r6)
            goto L_0x0891
        L_0x0890:
            r12 = 0
        L_0x0891:
            if (r12 == 0) goto L_0x08a4
            di3.d r0 = di3.C86312j.m106911c(r0)
            sp.y r0 = (p237sp.C13754y) r0
            sp.v r0 = r0.Ds0()
            long r1 = r12.field_downloadId
            com.tencent.mm.plugin.downloader.model.l r0 = (com.tencent.p014mm.plugin.downloader.model.C40935l) r0
            r0.mo63970r(r1)
        L_0x08a4:
            java.lang.String r0 = ".sysmsg.control_command.auto_run_switch"
            java.lang.Object r0 = r7.get(r0)
            if (r0 == 0) goto L_0x090a
            java.lang.String r0 = "game_mmkv"
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r0 = com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV.getMMKV(r0)
            if (r0 != 0) goto L_0x08b5
            goto L_0x090a
        L_0x08b5:
            java.lang.String r1 = "auto_run_switch"
            java.lang.String r2 = r0.decodeString(r1, r10)
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r5 == 0) goto L_0x08c7
            org.json.JSONObject r5 = new org.json.JSONObject
            r5.<init>()
            goto L_0x08cc
        L_0x08c7:
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0909 }
            r5.<init>(r2)     // Catch:{ JSONException -> 0x0909 }
        L_0x08cc:
            java.lang.String r6 = "md5_check"
            com.tencent.p014mm.plugin.game.model.C42072l.m45772c(r6, r7, r5)
            java.lang.String r6 = "download_resume"
            com.tencent.p014mm.plugin.game.model.C42072l.m45772c(r6, r7, r5)
            java.lang.String r6 = "preload_commlib"
            com.tencent.p014mm.plugin.game.model.C42072l.m45772c(r6, r7, r5)
            java.lang.String r6 = "game_silent_download"
            com.tencent.p014mm.plugin.game.model.C42072l.m45772c(r6, r7, r5)
            java.lang.String r6 = "wepkg_download_retry"
            com.tencent.p014mm.plugin.game.model.C42072l.m45772c(r6, r7, r5)
            java.lang.String r6 = "wepkg_expired_clean"
            com.tencent.p014mm.plugin.game.model.C42072l.m45772c(r6, r7, r5)
            java.lang.String r6 = "game_cache_clean"
            com.tencent.p014mm.plugin.game.model.C42072l.m45772c(r6, r7, r5)
            java.lang.String r6 = "game_resource_check"
            com.tencent.p014mm.plugin.game.model.C42072l.m45772c(r6, r7, r5)
            java.lang.String r5 = r5.toString()
            r0.encode((java.lang.String) r1, (java.lang.String) r5)
            r1 = 1
            java.lang.Object[] r0 = new java.lang.Object[r1]
            r1 = 0
            r0[r1] = r2
            java.lang.String r1 = "gamelog.srv_msg, service, ctrl_msg, autorun_switch, content:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r1, r0)
            goto L_0x090a
        L_0x0909:
        L_0x090a:
            java.lang.String r0 = ".sysmsg.control_command.cdn_setting"
            java.lang.Object r0 = r7.get(r0)
            if (r0 == 0) goto L_0x0998
            java.lang.String r0 = ".sysmsg.control_command.cdn_setting.prefetch_url_list"
            java.lang.Object r0 = r7.get(r0)
            if (r0 == 0) goto L_0x0998
            java.lang.String r0 = ".sysmsg.control_command.cdn_setting.prefetch_url_list.prefetch_url"
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r2 = 0
        L_0x0922:
            if (r2 != 0) goto L_0x0926
            r5 = r0
            goto L_0x0935
        L_0x0926:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r0)
            r5.append(r2)
            java.lang.String r5 = r5.toString()
        L_0x0935:
            boolean r6 = r7.containsKey(r5)
            if (r6 != 0) goto L_0x0966
            java.lang.String r0 = "gamelog.srv_msg, service, ctrl_msg, preload_cdn"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r0)
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.util.List) r1)
            if (r0 == 0) goto L_0x0947
            goto L_0x0998
        L_0x0947:
            java.util.Iterator r0 = r1.iterator()
        L_0x094b:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0998
            java.lang.Object r1 = r0.next()
            com.tencent.mm.plugin.game.model.l$b r1 = (com.tencent.p014mm.plugin.game.model.C42072l.C42074b) r1
            zt3.t r2 = zt3.C119157j.f356862d
            com.tencent.mm.plugin.game.model.k r3 = new com.tencent.mm.plugin.game.model.k
            r3.<init>(r1)
            zt3.j r2 = (zt3.C119157j) r2
            java.lang.String r1 = "prefetchUrlPerform"
            r2.mo183876g(r3, r1)
            goto L_0x094b
        L_0x0966:
            int r2 = r2 + 1
            com.tencent.mm.plugin.game.model.l$b r6 = new com.tencent.mm.plugin.game.model.l$b
            r6.<init>()
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r5)
            java.lang.String r9 = ".$method"
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            java.lang.Object r8 = r7.get(r8)
            java.lang.String r8 = (java.lang.String) r8
            boolean r9 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r8)
            if (r9 != 0) goto L_0x098c
            r6.f113364a = r8
        L_0x098c:
            java.lang.Object r5 = r7.get(r5)
            java.lang.String r5 = (java.lang.String) r5
            r6.f113365b = r5
            r1.add(r6)
            goto L_0x0922
        L_0x0998:
            com.tencent.mm.storage.y1$a r0 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_GAME_REDDOT_LEVELUP_SHUTDOWN_TIME_SEC_LONG
            java.lang.String r1 = ".sysmsg.control_command.exposure_message_setting"
            java.lang.Object r1 = r7.get(r1)
            if (r1 == 0) goto L_0x09f3
            java.lang.String r1 = ".sysmsg.control_command.exposure_message_setting.force_shutdown"
            java.lang.Object r2 = r7.get(r1)
            if (r2 != 0) goto L_0x09ab
            goto L_0x09f3
        L_0x09ab:
            java.lang.Object r1 = r7.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            r2 = 0
            int r1 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r1, (int) r2)
            r2 = 1
            if (r1 != r2) goto L_0x09bb
            r1 = 1
            goto L_0x09bc
        L_0x09bb:
            r1 = 0
        L_0x09bc:
            if (r1 == 0) goto L_0x09e2
            java.lang.String r1 = ".sysmsg.control_command.exposure_message_setting.force_duration"
            java.lang.Object r1 = r7.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            r2 = 86400(0x15180, double:4.26873E-319)
            long r1 = com.tencent.p014mm.sdk.platformtools.Util.getLong(r1, r2)
            long r5 = com.tencent.p014mm.sdk.platformtools.Util.nowSecond()
            long r5 = r5 + r1
            f40.o r1 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r1 = r1.mo121142i()
            java.lang.Long r2 = java.lang.Long.valueOf(r5)
            r1.mo119677K(r0, r2)
            goto L_0x09f3
        L_0x09e2:
            f40.o r1 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r1 = r1.mo121142i()
            r2 = 0
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r1.mo119677K(r0, r2)
        L_0x09f3:
            r1 = r14
            r12 = r24
            goto L_0x0a03
        L_0x09f7:
            r27 = r2
            r28 = r3
            r1 = r11
            r11 = r9
            java.lang.String r0 = "Parse failed"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r14, r0)
        L_0x0a02:
            r12 = 0
        L_0x0a03:
            if (r12 != 0) goto L_0x0a07
            goto L_0x0c8b
        L_0x0a07:
            r0 = 6
            java.lang.Object[] r0 = new java.lang.Object[r0]
            int r2 = r12.field_msgType
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3 = 0
            r0[r3] = r2
            java.lang.String r2 = r12.field_appId
            r3 = 1
            r0[r3] = r2
            long r2 = r12.field_msgId
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r3 = 2
            r0[r3] = r2
            java.lang.String r2 = r12.field_gameMsgId
            r3 = 3
            r0[r3] = r2
            com.tencent.mm.plugin.game.model.w$u r2 = r12.f113462W1
            int r2 = r2.f113583b
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3 = 4
            r0[r3] = r2
            r2 = 5
            com.tencent.mm.plugin.game.model.w$u r5 = r12.f113462W1
            int r5 = r5.f113584c
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r0[r2] = r5
            java.lang.String r2 = "gamelog.srv_msg, service, recv, type = %d, appId = %s, msgId = %s, gameMsgId:%s, reportMode:%d, reportSample:%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r11, r2, r0)
            int r0 = r12.field_msgType
            if (r0 == 0) goto L_0x0c16
            r2 = 30
            if (r0 == r2) goto L_0x0b29
            r2 = r27
            int r0 = r2.mo65989r(r12)
            if (r0 != 0) goto L_0x0b16
            r2.mo65988q(r12)
            di3.d r2 = di3.C86312j.m106911c(r4)
            sw1.q r2 = (sw1.C48484q) r2
            com.tencent.mm.plugin.game.model.b0 r2 = r2.xi0()
            boolean r2 = r2.insert(r12)
            boolean r3 = com.tencent.p014mm.plugin.game.commlib.util.C30081b.m38959a()
            if (r3 == 0) goto L_0x0af7
            java.util.List<com.tencent.mm.plugin.game.model.w$g> r3 = r12.f113468c2
            if (r3 == 0) goto L_0x0af7
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            int r3 = r3.size()
            if (r3 <= 0) goto L_0x0af7
            di3.d r3 = di3.C86312j.m106911c(r4)
            sw1.q r3 = (sw1.C48484q) r3
            com.tencent.mm.plugin.game.model.b0 r3 = r3.xi0()
            java.util.List<com.tencent.mm.plugin.game.model.w$g> r4 = r12.f113468c2
            r3.getClass()
            if (r4 == 0) goto L_0x0af7
            java.util.ArrayList r4 = (java.util.ArrayList) r4
            int r5 = r4.size()
            if (r5 > 0) goto L_0x0a8e
            goto L_0x0af7
        L_0x0a8e:
            java.util.Iterator r4 = r4.iterator()
        L_0x0a92:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0af7
            java.lang.Object r5 = r4.next()
            com.tencent.mm.plugin.game.model.w$g r5 = (com.tencent.p014mm.plugin.game.model.C42119w.C42126g) r5
            java.lang.String r6 = r5.f113518a
            boolean r6 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r6)
            if (r6 == 0) goto L_0x0aa7
            goto L_0x0a92
        L_0x0aa7:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "update GameRawMessage set clickScore="
            r6.append(r7)
            float r7 = r5.f113519b
            r6.append(r7)
            java.lang.String r7 = " where "
            r6.append(r7)
            java.lang.String r7 = "gameMsgId"
            r6.append(r7)
            java.lang.String r7 = " = \""
            r6.append(r7)
            java.lang.String r7 = r5.f113518a
            r6.append(r7)
            r6.append(r1)
            java.lang.String r6 = r6.toString()
            java.lang.String r7 = "GameRawMessage"
            boolean r6 = r3.execSQL(r7, r6)
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            r7 = 3
            java.lang.Object[] r8 = new java.lang.Object[r7]
            float r7 = r5.f113519b
            java.lang.Float r7 = java.lang.Float.valueOf(r7)
            r9 = 0
            r8[r9] = r7
            java.lang.String r5 = r5.f113518a
            r7 = 1
            r8[r7] = r5
            r5 = 2
            r8[r5] = r6
            java.lang.String r5 = "MicroMsg.GameMessageStorage"
            java.lang.String r6 = "gamelog.srv_msg, storage, update, update history score: %f, msgId: %s, isSuc: %b"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r6, r8)
            goto L_0x0a92
        L_0x0af7:
            r7 = 1
            java.lang.Object[] r1 = new java.lang.Object[r7]
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r3 = 0
            r1[r3] = r2
            java.lang.String r2 = "gamelog.srv_msg, service, recv, Insert raw message: %b"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r11, r2, r1)
            boolean r1 = r12.field_needReport
            if (r1 == 0) goto L_0x0b16
            com.tencent.mm.plugin.report.service.n r2 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r3 = 858(0x35a, double:4.24E-321)
            r5 = 1
            r7 = 1
            r9 = 0
            r2.idkeyStat(r3, r5, r7, r9)
        L_0x0b16:
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            r3 = 0
            r1[r3] = r2
            java.lang.String r2 = "gamelog.srv_msg, service, recv, process status:%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r11, r2, r1)
            r21 = r0
            goto L_0x0c1e
        L_0x0b29:
            java.lang.String r0 = "gamelog.srv_msg, service, recv, silent download message"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r0)
            com.tencent.mm.plugin.game.model.w$t r0 = r12.f113461V1
            int r0 = r0.f113581a
            if (r0 != 0) goto L_0x0bde
            com.tencent.mm.plugin.game.model.silent_download.k r0 = com.tencent.p014mm.plugin.game.model.silent_download.C42107k.C42110b.f113420a
            java.lang.String r1 = "MicroMsg.GameSilentDownloader"
            java.lang.String r2 = r12.field_appId
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r2 == 0) goto L_0x0b58
            java.lang.String r0 = "msg is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
            di3.d r0 = di3.C86312j.m106911c(r28)
            r1 = r0
            sp.w r1 = (p237sp.C48457w) r1
            r3 = 16
            r5 = 1
            java.lang.String r2 = "appid_is_empty"
            r1.mo72827VV(r2, r3, r5)
            r13 = 0
            goto L_0x0c1c
        L_0x0b58:
            java.lang.String r2 = r12.field_appId
            long r5 = r12.field_expireTime
            long r7 = r12.f113471f1
            com.tencent.mm.plugin.game.model.silent_download.f r9 = new com.tencent.mm.plugin.game.model.silent_download.f
            r9.<init>()
            r9.field_appId = r2
            di3.d r10 = di3.C86312j.m106911c(r4)
            sw1.q r10 = (sw1.C48484q) r10
            com.tencent.mm.plugin.game.model.silent_download.i r10 = r10.Po0()
            r13 = 0
            java.lang.String[] r11 = new java.lang.String[r13]
            boolean r10 = r10.get(r9, (java.lang.String[]) r11)
            if (r10 != 0) goto L_0x0bc2
            r9.field_expireTime = r5
            r9.field_randomTime = r7
            r5 = 1
            r9.field_isFirst = r5
            r9.field_isRunning = r13
            r9.field_noWifi = r5
            r9.field_noSdcard = r5
            r9.field_noEnoughSpace = r5
            r9.field_lowBattery = r5
            r9.field_continueDelay = r5
            r9.field_forceUpdateFlag = r13
            di3.d r2 = di3.C86312j.m106911c(r4)
            sw1.q r2 = (sw1.C48484q) r2
            com.tencent.mm.plugin.game.model.silent_download.i r2 = r2.Po0()
            boolean r2 = r2.insert(r9)
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.String r4 = r9.field_appId
            r3[r13] = r4
            long r6 = r9.field_expireTime
            java.lang.Long r4 = java.lang.Long.valueOf(r6)
            r3[r5] = r4
            long r4 = r9.field_randomTime
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            r5 = 2
            r3[r5] = r4
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r4 = 3
            r3[r4] = r2
            java.lang.String r2 = "insert GameSilentDownloadTask, appid:%s, expireTime:%d, randomTime:%d, ret:%b"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r2, r3)
            r0.mo66068b(r13)
            goto L_0x0c1c
        L_0x0bc2:
            r5 = 1
            java.lang.Object[] r0 = new java.lang.Object[r5]
            r0[r13] = r2
            java.lang.String r3 = "GameSilentDownloadTask exist! appid = %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r3, r0)
            di3.d r0 = di3.C86312j.m106911c(r28)
            r16 = r0
            sp.w r16 = (p237sp.C48457w) r16
            r18 = 17
            r20 = 1
            r17 = r2
            r16.mo72827VV(r17, r18, r20)
            goto L_0x0c1c
        L_0x0bde:
            r1 = 1
            r13 = 0
            if (r0 != r1) goto L_0x0c1c
            di3.d r0 = di3.C86312j.m106911c(r28)
            r1 = r0
            sp.w r1 = (p237sp.C48457w) r1
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = r12.field_appId
            r0.append(r2)
            java.lang.String r2 = "_gameres_1"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            r3 = 33
            r4 = 25
            java.lang.String r5 = ""
            java.lang.String r6 = ""
            java.lang.String r7 = ""
            java.lang.String r8 = ""
            r1.mo72828q8(r2, r3, r4, r5, r6, r7, r8)
            wx1.b r0 = wx1.C53217b.f148462a
            java.lang.String r1 = r12.field_appId
            long r2 = r12.field_expireTime
            r4 = 1
            r0.mo73891h(r1, r4, r2)
            goto L_0x0c1c
        L_0x0c16:
            r13 = 0
            java.lang.String r0 = "gamelog.srv_msg, service, recv, control command message"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r0)
        L_0x0c1c:
            r21 = 0
        L_0x0c1e:
            java.lang.String r0 = r12.field_gameMsgId
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 == 0) goto L_0x0c2c
            com.tencent.mm.plugin.game.model.w$u r0 = r12.f113462W1
            java.lang.String r0 = r0.f113582a
            r12.field_gameMsgId = r0
        L_0x0c2c:
            boolean r0 = r12.field_needReport
            if (r0 == 0) goto L_0x0c8b
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            boolean r1 = com.tencent.p014mm.plugin.game.commlib.util.C30081b.m38959a()
            if (r1 == 0) goto L_0x0c3e
            java.lang.String r1 = "1"
            goto L_0x0c40
        L_0x0c3e:
            java.lang.String r1 = "0"
        L_0x0c40:
            java.lang.String r2 = "reddot_strategy"
            r0.put(r2, r1)
            int r1 = r12.field_channel
            java.lang.String r1 = java.lang.Integer.toString(r1)
            java.lang.String r2 = "channel"
            r0.put(r2, r1)
            android.content.Context r16 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 18
            java.lang.String r1 = r12.field_appId
            r23 = 0
            int r2 = r12.f113470e2
            java.lang.String r3 = r12.field_gameMsgId
            java.lang.String r4 = r12.f113472f2
            com.tencent.mm.plugin.game.model.w$k r5 = r12.f113491q1
            int r5 = r5.f113527a
            java.lang.String r5 = java.lang.String.valueOf(r5)
            java.lang.String r6 = r12.f113474g2
            java.lang.String r27 = com.tencent.p014mm.game.report.C40314g.m43482a(r15, r5, r6, r0)
            r22 = r1
            r24 = r2
            r25 = r3
            r26 = r4
            com.tencent.p014mm.game.report.C40314g.m43485d(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            com.tencent.mm.plugin.report.service.n r5 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r6 = 858(0x35a, double:4.24E-321)
            r8 = 0
            r10 = 1
            r12 = 0
            r5.idkeyStat(r6, r8, r10, r12)
        L_0x0c8b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: xx1.C53467k.mo9066Y(ob0.m$a):void");
    }
}
