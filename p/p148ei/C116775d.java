package p148ei;

import android.content.Context;
import android.content.Intent;
import com.tencent.p014mm.autogen.events.BroadcastEvent;
import com.tencent.p014mm.autogen.events.UINotifyEvent;
import com.tencent.p014mm.plugin.account.p024ui.DisasterUI;
import com.tencent.p014mm.sdk.event.IStaticListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import j20.C117292a;
import java.util.HashMap;
import java.util.Map;
import k20.C9556a;

/* renamed from: ei.d */
public class C116775d extends IStaticListener<BroadcastEvent> {

    /* renamed from: d */
    public C7661a f350093d;

    /* renamed from: e */
    public Map<Integer, Long> f350094e = new HashMap();

    /* renamed from: f */
    public Map<Long, C7661a> f350095f = new HashMap();

    /* renamed from: ei.d$a */
    public static class C7661a {

        /* renamed from: a */
        public String f26005a = null;

        /* renamed from: b */
        public long f26006b = 0;

        /* renamed from: c */
        public String f26007c = null;

        /* renamed from: d */
        public Map<Integer, UINotifyEvent> f26008d = new HashMap();

        public String toString() {
            String str = "";
            for (Integer num : ((HashMap) this.f26008d).keySet()) {
                str = str + num + ",";
            }
            if (str.length() > 0) {
                str = str.substring(0, str.length() - 1);
            }
            return String.format("NoticeInfo(%d){noticeID[%s], disasterTick[%d], content[%s], posistions[%s]}", new Object[]{Integer.valueOf(hashCode()), this.f26005a, Long.valueOf(this.f26006b), this.f26007c, str});
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:176:0x057a  */
    /* JADX WARNING: Removed duplicated region for block: B:177:0x058e  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00f3  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0105  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean callback(com.tencent.p014mm.sdk.event.IEvent r35) {
        /*
            r34 = this;
            r1 = r34
            r2 = r35
            com.tencent.mm.autogen.events.BroadcastEvent r2 = (com.tencent.p014mm.autogen.events.BroadcastEvent) r2
            com.tencent.mm.autogen.events.BroadcastEvent$a r0 = r2.f343529d
            int r3 = r0.f236156a
            r8 = 2
            r9 = 0
            java.lang.Integer r10 = java.lang.Integer.valueOf(r9)
            r11 = 1
            java.lang.String r12 = "MicroMsg.BroadcastController"
            if (r3 == r11) goto L_0x0833
            if (r3 == r8) goto L_0x070f
            java.lang.String r13 = ".Url"
            java.lang.String r14 = ".Tips"
            java.lang.String r15 = ".Language"
            java.lang.String r5 = "parseLong expiredTime error:%s"
            java.lang.String r8 = ".e.Item"
            r16 = 1800000(0x1b7740, double:8.89318E-318)
            java.lang.String r6 = ".e.ExpiredTime"
            java.lang.String r7 = "disaster_noticeid_list_key"
            java.lang.String r9 = "disaster_pref"
            java.lang.String r11 = ".e.NoticeId"
            java.lang.String r4 = ""
            r22 = r10
            java.lang.String r10 = "e"
            r23 = r2
            java.lang.String r2 = "en"
            r24 = r2
            java.lang.String r2 = ".Content"
            r25 = r14
            r14 = 4
            if (r3 == r14) goto L_0x0480
            r14 = 5
            if (r3 == r14) goto L_0x0044
            goto L_0x0956
        L_0x0044:
            java.lang.String r0 = r0.f236157b
            r3 = 1
            java.lang.Object[] r14 = new java.lang.Object[r3]
            if (r0 != 0) goto L_0x004d
            r3 = -1
            goto L_0x0051
        L_0x004d:
            int r3 = r0.length()
        L_0x0051:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r20 = 0
            r14[r20] = r3
            java.lang.String r3 = "summerdiz handleNewDisaster xml len[%d]"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r12, r3, r14)
            r3 = 0
            java.util.Map r10 = com.tencent.p014mm.sdk.platformtools.XmlParser.parseXml(r0, r10, r3)
            if (r10 != 0) goto L_0x006c
            java.lang.String r0 = "summerdiz handleNewDisaster this is not errmsg"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r12, r0)
            goto L_0x0956
        L_0x006c:
            r3 = 1
            java.lang.Object[] r0 = new java.lang.Object[r3]
            r0[r20] = r10
            java.lang.String r3 = "summerdiz handleNewDisaster values[%s]"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r12, r3, r0)
            java.lang.Object r0 = r10.get(r11)
            java.lang.String r0 = (java.lang.String) r0
            r27 = r2
            r28 = r13
            r13 = 0
            long r2 = com.tencent.p014mm.sdk.platformtools.Util.getLong(r0, r13)
            int r0 = (r2 > r13 ? 1 : (r2 == r13 ? 0 : -1))
            if (r0 > 0) goto L_0x008f
            java.lang.String r0 = "summerdiz handleNewDisaster noticeID null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r12, r0)
        L_0x008f:
            boolean r0 = sf0.C90188n0.f258931Y
            if (r0 != 0) goto L_0x00c4
            java.lang.Object r0 = r10.get(r6)     // Catch:{ Exception -> 0x00ba }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x00ba }
            r13 = 0
            long r29 = com.tencent.p014mm.sdk.platformtools.Util.getLong(r0, r13)     // Catch:{ Exception -> 0x00ba }
            long r18 = com.tencent.p014mm.sdk.platformtools.Util.secondsToNow(r29)     // Catch:{ Exception -> 0x00ba }
            int r0 = (r18 > r13 ? 1 : (r18 == r13 ? 0 : -1))
            if (r0 <= 0) goto L_0x00c4
            java.lang.String r0 = "summerdiz handleNewDisaster expiredTime is too small, drop id:%d"
            r6 = 1
            java.lang.Object[] r11 = new java.lang.Object[r6]     // Catch:{ Exception -> 0x00b8 }
            java.lang.Long r6 = java.lang.Long.valueOf(r29)     // Catch:{ Exception -> 0x00ba }
            r13 = 0
            r11[r13] = r6     // Catch:{ Exception -> 0x00ba }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r12, r0, r11)     // Catch:{ Exception -> 0x00ba }
            goto L_0x0956
        L_0x00b8:
            r0 = move-exception
            goto L_0x00bc
        L_0x00ba:
            r0 = move-exception
            r6 = 1
        L_0x00bc:
            java.lang.Object[] r11 = new java.lang.Object[r6]
            r6 = 0
            r11[r6] = r0
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r12, r5, r11)
        L_0x00c4:
            ei.d$a r0 = new ei.d$a
            r0.<init>()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r4)
            r5.append(r2)
            java.lang.String r5 = r5.toString()
            r0.f26005a = r5
            android.content.Context r5 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            r6 = 4
            android.content.SharedPreferences r5 = r5.getSharedPreferences(r9, r6)
            java.lang.String r5 = r5.getString(r7, r4)
            boolean r6 = sf0.C90188n0.f258932Z
            if (r6 != 0) goto L_0x0105
            java.lang.String r6 = r0.f26005a
            boolean r6 = r5.contains(r6)
            if (r6 == 0) goto L_0x0105
            r6 = 2
            java.lang.Object[] r2 = new java.lang.Object[r6]
            r3 = 0
            r2[r3] = r5
            java.lang.String r0 = r0.f26005a
            r3 = 1
            r2[r3] = r0
            java.lang.String r0 = "summerdiz handleNewDisaster noticeIdList %s contain notifyID:%s, drop id"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r12, r0, r2)
            goto L_0x0956
        L_0x0105:
            java.util.Map<java.lang.Long, ei.d$a> r5 = r1.f350095f
            java.util.HashMap r5 = (java.util.HashMap) r5
            int r5 = r5.size()
            if (r5 <= 0) goto L_0x0138
            java.util.Map<java.lang.Long, ei.d$a> r5 = r1.f350095f
            java.lang.Long r6 = java.lang.Long.valueOf(r2)
            java.util.HashMap r5 = (java.util.HashMap) r5
            java.lang.Object r5 = r5.get(r6)
            ei.d$a r5 = (p148ei.C116775d.C7661a) r5
            if (r5 == 0) goto L_0x012c
            r6 = 1
            java.lang.Object[] r0 = new java.lang.Object[r6]
            r6 = 0
            r0[r6] = r5
            java.lang.String r6 = "summerdiz  handleNewDisaster found info in map[%s]"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r12, r6, r0)
            r0 = r5
            goto L_0x0143
        L_0x012c:
            java.util.Map<java.lang.Long, ei.d$a> r5 = r1.f350095f
            java.lang.Long r6 = java.lang.Long.valueOf(r2)
            java.util.HashMap r5 = (java.util.HashMap) r5
            r5.put(r6, r0)
            goto L_0x0143
        L_0x0138:
            java.util.Map<java.lang.Long, ei.d$a> r5 = r1.f350095f
            java.lang.Long r6 = java.lang.Long.valueOf(r2)
            java.util.HashMap r5 = (java.util.HashMap) r5
            r5.put(r6, r0)
        L_0x0143:
            java.lang.String r5 = ".e.Position"
            java.lang.Object r5 = r10.get(r5)
            java.lang.String r5 = (java.lang.String) r5
            boolean r6 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r5)
            if (r6 == 0) goto L_0x0158
            java.lang.String r0 = "summerdiz handleNewDisaster positionStr is null!"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r12, r0)
            goto L_0x0956
        L_0x0158:
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.lang.String r7 = ","
            java.lang.String[] r5 = r5.split(r7)
            if (r5 == 0) goto L_0x0479
            int r7 = r5.length
            r9 = 1
            if (r7 >= r9) goto L_0x016b
            goto L_0x0479
        L_0x016b:
            int r7 = r5.length
            r11 = 0
            r13 = 0
        L_0x016e:
            if (r11 >= r7) goto L_0x0197
            r14 = r5[r11]
            r9 = 0
            int r14 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r14, (int) r9)
            if (r14 <= 0) goto L_0x0193
            r9 = 1
            if (r14 != r9) goto L_0x018c
            java.lang.Object[] r13 = new java.lang.Object[r9]
            java.lang.Integer r9 = java.lang.Integer.valueOf(r14)
            r14 = 0
            r13[r14] = r9
            java.lang.String r9 = "summerdiz handleNewDisaster found tonyTips[%d]"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r12, r9, r13)
            r13 = 1
            goto L_0x0193
        L_0x018c:
            java.lang.Integer r9 = java.lang.Integer.valueOf(r14)
            r6.add(r9)
        L_0x0193:
            int r11 = r11 + 1
            r9 = 1
            goto L_0x016e
        L_0x0197:
            if (r13 != 0) goto L_0x01a6
            int r5 = r6.size()
            if (r5 != 0) goto L_0x01a6
            java.lang.String r0 = "summerdiz handleNewDisaster positions size is 0!"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r12, r0)
            goto L_0x0956
        L_0x01a6:
            android.content.Context r5 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            java.lang.String r5 = com.tencent.p014mm.sdk.platformtools.LocaleUtil.getCurrentLanguage(r5)
            r7 = 1
            java.lang.Object[] r9 = new java.lang.Object[r7]
            r7 = 0
            r9[r7] = r5
            java.lang.String r7 = "summerdiz handleNewDisaster curLang[%s]"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r12, r7, r9)
            r9 = 0
            r11 = 0
            r14 = 0
            r22 = 0
        L_0x01be:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r8)
            if (r14 != 0) goto L_0x01cc
            r30 = r9
            r9 = r4
            goto L_0x01d4
        L_0x01cc:
            java.lang.Integer r29 = java.lang.Integer.valueOf(r14)
            r30 = r9
            r9 = r29
        L_0x01d4:
            r7.append(r9)
            java.lang.String r7 = r7.toString()
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r7)
            r9.append(r15)
            java.lang.String r9 = r9.toString()
            java.lang.Object r9 = r10.get(r9)
            java.lang.String r9 = (java.lang.String) r9
            r29 = r11
            if (r9 != 0) goto L_0x01fd
            r11 = 3
            if (r14 <= r11) goto L_0x01fd
            r5 = 0
            r7 = 2
            r14 = 0
            r26 = 0
            goto L_0x024c
        L_0x01fd:
            boolean r11 = r5.equalsIgnoreCase(r9)
            if (r11 == 0) goto L_0x03fa
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r7)
            r11 = r27
            r5.append(r11)
            java.lang.String r5 = r5.toString()
            java.lang.Object r5 = r10.get(r5)
            r14 = r5
            java.lang.String r14 = (java.lang.String) r14
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r7)
            r8 = r28
            r5.append(r8)
            java.lang.String r5 = r5.toString()
            java.lang.Object r5 = r10.get(r5)
            java.lang.String r5 = (java.lang.String) r5
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r7)
            r7 = r25
            r8.append(r7)
            java.lang.String r7 = r8.toString()
            java.lang.Object r7 = r10.get(r7)
            java.lang.String r7 = (java.lang.String) r7
            r26 = r7
            r7 = 2
        L_0x024c:
            java.lang.Object[] r8 = new java.lang.Object[r7]
            r7 = 0
            r8[r7] = r14
            r7 = 1
            r8[r7] = r26
            java.lang.String r7 = "summerdiz handleNewDisaster content[%s] tips[%s]"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r12, r7, r8)
            boolean r7 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r14)
            if (r7 == 0) goto L_0x026b
            java.lang.String r5 = "summerdiz handleNewDisaster cann't hit curLang"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r5)
            r7 = r22
            r11 = r29
            r9 = r30
            goto L_0x026f
        L_0x026b:
            r11 = r5
            r7 = r14
            r9 = r26
        L_0x026f:
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r11)
            if (r5 == 0) goto L_0x0280
            android.content.Context r5 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            r8 = 2131824663(0x7f111017, float:1.928216E38)
            java.lang.String r11 = r5.getString(r8)
        L_0x0280:
            if (r13 == 0) goto L_0x02d2
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r7)
            if (r5 == 0) goto L_0x0293
            android.content.Context r5 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            r7 = 2131824657(0x7f111011, float:1.9282148E38)
            java.lang.String r7 = r5.getString(r7)
        L_0x0293:
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r9)
            if (r5 == 0) goto L_0x02a4
            android.content.Context r5 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            r8 = 2131824661(0x7f111015, float:1.9282156E38)
            java.lang.String r9 = r5.getString(r8)
        L_0x02a4:
            r5 = r23
            com.tencent.mm.autogen.events.BroadcastEvent$b r8 = r5.f343530e
            r8.f343533c = r7
            r10 = 30
            r8.f343534d = r10
            r8.f343532b = r11
            r10 = 1
            r8.f343531a = r10
            r10 = 0
            r8.f343537g = r10
            r10 = 6
            r8.f343535e = r10
            r8.f343536f = r4
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r4)
            r10.append(r2)
            java.lang.String r10 = r10.toString()
            r8.f343538h = r10
            com.tencent.mm.autogen.events.BroadcastEvent$b r8 = r5.f343530e
            r10 = 1
            r8.f343539i = r10
            goto L_0x02d4
        L_0x02d2:
            r5 = r23
        L_0x02d4:
            int r8 = r6.size()
            if (r8 != 0) goto L_0x02e1
            java.lang.String r0 = "summerdiz handleNewDisaster no other position need to tip"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r0)
            goto L_0x0956
        L_0x02e1:
            long r14 = r0.f26006b
            r18 = 0
            int r8 = (r14 > r18 ? 1 : (r14 == r18 ? 0 : -1))
            if (r8 == 0) goto L_0x02f8
            long r14 = com.tencent.p014mm.sdk.platformtools.Util.ticksToNow(r14)
            int r8 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r8 >= 0) goto L_0x02f8
            java.lang.String r0 = "summerdiz handleNewDisaster disasterTick within half an hour, drop it"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r0)
            goto L_0x0956
        L_0x02f8:
            long r14 = com.tencent.p014mm.sdk.platformtools.Util.currentTicks()
            r0.f26006b = r14
            java.util.Iterator r6 = r6.iterator()
        L_0x0302:
            boolean r8 = r6.hasNext()
            if (r8 == 0) goto L_0x0956
            java.lang.Object r8 = r6.next()
            java.lang.Integer r8 = (java.lang.Integer) r8
            java.util.Map<java.lang.Integer, java.lang.Long> r10 = r1.f350094e
            java.util.HashMap r10 = (java.util.HashMap) r10
            java.lang.Object r10 = r10.get(r8)
            java.lang.Long r10 = (java.lang.Long) r10
            r14 = 0
            long r16 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.Long) r10, (long) r14)
            java.lang.Long r10 = java.lang.Long.valueOf(r16)
            long r16 = r10.longValue()
            int r22 = (r16 > r14 ? 1 : (r16 == r14 ? 0 : -1))
            if (r22 <= 0) goto L_0x0348
            long r14 = r10.longValue()
            int r16 = (r14 > r2 ? 1 : (r14 == r2 ? 0 : -1))
            if (r16 < 0) goto L_0x0348
            r14 = 3
            java.lang.Object[] r15 = new java.lang.Object[r14]
            r14 = 0
            r15[r14] = r8
            r8 = 1
            r15[r8] = r10
            java.lang.Long r8 = java.lang.Long.valueOf(r2)
            r10 = 2
            r15[r10] = r8
            java.lang.String r8 = "summerdiz p[%d] has bigger oldPositionNoticeId[%d, %d]"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r12, r8, r15)
            goto L_0x0302
        L_0x0348:
            java.util.Map<java.lang.Integer, com.tencent.mm.autogen.events.UINotifyEvent> r10 = r0.f26008d
            java.util.HashMap r10 = (java.util.HashMap) r10
            java.lang.Object r10 = r10.get(r8)
            com.tencent.mm.autogen.events.UINotifyEvent r10 = (com.tencent.p014mm.autogen.events.UINotifyEvent) r10
            if (r10 != 0) goto L_0x0376
            com.tencent.mm.autogen.events.UINotifyEvent r10 = new com.tencent.mm.autogen.events.UINotifyEvent
            r10.<init>()
            com.tencent.mm.autogen.events.UINotifyEvent$a r14 = r10.f343630d
            r14.getClass()
            r15 = 30
            r14.f343634d = r15
            r14.f343636f = r4
            r15 = 2131496661(0x7f0c0ed5, float:1.8616893E38)
            r14.f343637g = r15
            int r15 = r8.intValue()
            r14.f343639i = r15
            java.util.Map<java.lang.Integer, com.tencent.mm.autogen.events.UINotifyEvent> r14 = r0.f26008d
            java.util.HashMap r14 = (java.util.HashMap) r14
            r14.put(r8, r10)
        L_0x0376:
            boolean r14 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r9)
            if (r14 == 0) goto L_0x037d
            r9 = r7
        L_0x037d:
            boolean r14 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r9)
            if (r14 == 0) goto L_0x03a3
            int r9 = r8.intValue()
            r14 = 2
            if (r9 == r14) goto L_0x0398
            r14 = 3
            if (r9 == r14) goto L_0x0394
            r14 = 4
            if (r9 == r14) goto L_0x0394
            r9 = 2131824660(0x7f111014, float:1.9282154E38)
            goto L_0x039b
        L_0x0394:
            r9 = 2131824659(0x7f111013, float:1.9282152E38)
            goto L_0x039b
        L_0x0398:
            r9 = 2131824662(0x7f111016, float:1.9282158E38)
        L_0x039b:
            android.content.Context r14 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            java.lang.String r9 = r14.getString(r9)
        L_0x03a3:
            com.tencent.mm.autogen.events.UINotifyEvent$a r14 = r10.f343630d
            r14.f343633c = r9
            r14.f343632b = r11
            r15 = 1
            r14.f343631a = r15
            r15 = 2
            r14.f343635e = r15
            java.lang.String r15 = r0.f26005a
            r14.f343638h = r15
            java.util.Map<java.lang.Integer, java.lang.Long> r14 = r1.f350094e
            java.lang.Long r15 = java.lang.Long.valueOf(r2)
            java.util.HashMap r14 = (java.util.HashMap) r14
            r14.put(r8, r15)
            if (r13 != 0) goto L_0x03f0
            com.tencent.mm.autogen.events.BroadcastEvent$b r14 = r5.f343530e
            r14.f343533c = r9
            r15 = 30
            r14.f343534d = r15
            r14.f343532b = r11
            r15 = 1
            r14.f343531a = r15
            r15 = 2131496661(0x7f0c0ed5, float:1.8616893E38)
            r14.f343537g = r15
            r15 = 2
            r14.f343535e = r15
            r14.f343536f = r4
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            r15.append(r4)
            r15.append(r2)
            java.lang.String r15 = r15.toString()
            r14.f343538h = r15
            com.tencent.mm.autogen.events.BroadcastEvent$b r14 = r5.f343530e
            int r8 = r8.intValue()
            r14.f343539i = r8
        L_0x03f0:
            ei.b r8 = new ei.b
            r8.<init>(r1, r10)
            com.tencent.p014mm.sdk.platformtools.MMHandlerThread.postToMainThread(r8)
            goto L_0x0302
        L_0x03fa:
            r11 = r27
            r27 = r23
            r31 = r25
            r25 = r13
            r13 = r31
            r32 = r2
            r2 = r24
            r23 = r32
            r3 = r28
            boolean r9 = r2.equalsIgnoreCase(r9)
            if (r9 == 0) goto L_0x045b
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r7)
            r9.append(r11)
            java.lang.String r9 = r9.toString()
            java.lang.Object r9 = r10.get(r9)
            java.lang.String r9 = (java.lang.String) r9
            r28 = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r7)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            java.lang.Object r0 = r10.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            r22 = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r7)
            r0.append(r13)
            java.lang.String r0 = r0.toString()
            java.lang.Object r0 = r10.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            r29 = r22
            r22 = r9
            r9 = r0
            goto L_0x045f
        L_0x045b:
            r28 = r0
            r9 = r30
        L_0x045f:
            int r14 = r14 + 1
            r0 = r28
            r28 = r3
            r31 = r23
            r24 = r2
            r2 = r31
            r23 = r27
            r27 = r11
            r11 = r29
            r33 = r25
            r25 = r13
            r13 = r33
            goto L_0x01be
        L_0x0479:
            java.lang.String r0 = "summerdiz handleNewDisaster positionStr id invaild!"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r12, r0)
            goto L_0x0956
        L_0x0480:
            r14 = r2
            r3 = r13
            r2 = r24
            r13 = r25
            java.lang.String r0 = r0.f236157b
            r2 = 2
            java.lang.Object[] r13 = new java.lang.Object[r2]
            ei.d$a r2 = r1.f350093d
            r20 = 0
            r13[r20] = r2
            r2 = 1
            r13[r2] = r0
            java.lang.String r2 = "summerdiz handleEventOOB oldNoticeInfo[%s], event[%s]"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r12, r2, r13)
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r2 == 0) goto L_0x04a1
            goto L_0x0956
        L_0x04a1:
            java.lang.String r2 = "<"
            int r2 = r0.indexOf(r2)
            if (r2 >= 0) goto L_0x04ab
            goto L_0x0956
        L_0x04ab:
            r2 = 0
            java.util.Map r10 = com.tencent.p014mm.sdk.platformtools.XmlParser.parseXml(r0, r10, r2)
            if (r10 != 0) goto L_0x04b9
            java.lang.String r0 = "this is not errmsg"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r12, r0)
            goto L_0x0956
        L_0x04b9:
            ei.d$a r0 = r1.f350093d
            if (r0 != 0) goto L_0x04f0
            ei.d$a r0 = new ei.d$a
            r0.<init>()
            r1.f350093d = r0
            com.tencent.mm.autogen.events.UINotifyEvent r0 = new com.tencent.mm.autogen.events.UINotifyEvent
            r0.<init>()
            ei.d$a r13 = r1.f350093d
            java.util.Map<java.lang.Integer, com.tencent.mm.autogen.events.UINotifyEvent> r13 = r13.f26008d
            java.util.HashMap r13 = (java.util.HashMap) r13
            r2 = r22
            r13.put(r2, r0)
            com.tencent.mm.autogen.events.UINotifyEvent$a r0 = r0.f343630d
            r0.f343633c = r4
            r0.f343632b = r4
            r13 = 30
            r0.f343634d = r13
            r13 = 0
            r0.f343631a = r13
            r0.f343636f = r4
            r0.f343635e = r13
            r13 = 2131496661(0x7f0c0ed5, float:1.8616893E38)
            r0.f343637g = r13
            r0.f343638h = r4
            r13 = 0
            r0.f343639i = r13
            goto L_0x04f2
        L_0x04f0:
            r2 = r22
        L_0x04f2:
            boolean r0 = sf0.C90188n0.f258930X
            if (r0 != 0) goto L_0x051c
            ei.d$a r0 = r1.f350093d
            r22 = r2
            r28 = r3
            long r2 = r0.f26006b
            r18 = 0
            int r0 = (r2 > r18 ? 1 : (r2 == r18 ? 0 : -1))
            if (r0 == 0) goto L_0x0513
            long r2 = com.tencent.p014mm.sdk.platformtools.Util.ticksToNow(r2)
            int r0 = (r2 > r16 ? 1 : (r2 == r16 ? 0 : -1))
            if (r0 >= 0) goto L_0x0513
            java.lang.String r0 = "disasterTick within half an hour, drop it"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r0)
            goto L_0x0956
        L_0x0513:
            ei.d$a r0 = r1.f350093d
            long r2 = com.tencent.p014mm.sdk.platformtools.Util.currentTicks()
            r0.f26006b = r2
            goto L_0x0520
        L_0x051c:
            r22 = r2
            r28 = r3
        L_0x0520:
            boolean r0 = sf0.C90188n0.f258931Y
            if (r0 != 0) goto L_0x0555
            java.lang.Object r0 = r10.get(r6)     // Catch:{ Exception -> 0x054b }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x054b }
            r2 = 0
            long r16 = com.tencent.p014mm.sdk.platformtools.Util.getLong(r0, r2)     // Catch:{ Exception -> 0x054b }
            long r18 = com.tencent.p014mm.sdk.platformtools.Util.secondsToNow(r16)     // Catch:{ Exception -> 0x054b }
            int r0 = (r18 > r2 ? 1 : (r18 == r2 ? 0 : -1))
            if (r0 <= 0) goto L_0x0555
            java.lang.String r0 = "expiredTime is too small, drop id:%d"
            r2 = 1
            java.lang.Object[] r3 = new java.lang.Object[r2]     // Catch:{ Exception -> 0x0549 }
            java.lang.Long r2 = java.lang.Long.valueOf(r16)     // Catch:{ Exception -> 0x054b }
            r6 = 0
            r3[r6] = r2     // Catch:{ Exception -> 0x054b }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r12, r0, r3)     // Catch:{ Exception -> 0x054b }
            goto L_0x0956
        L_0x0549:
            r0 = move-exception
            goto L_0x054d
        L_0x054b:
            r0 = move-exception
            r2 = 1
        L_0x054d:
            java.lang.Object[] r3 = new java.lang.Object[r2]
            r2 = 0
            r3[r2] = r0
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r12, r5, r3)
        L_0x0555:
            ei.d$a r0 = r1.f350093d
            java.lang.Object r2 = r10.get(r11)
            java.lang.String r2 = (java.lang.String) r2
            r0.f26005a = r2
            android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            r2 = 4
            android.content.SharedPreferences r0 = r0.getSharedPreferences(r9, r2)
            java.lang.String r0 = r0.getString(r7, r4)
            boolean r2 = sf0.C90188n0.f258932Z
            if (r2 != 0) goto L_0x058e
            ei.d$a r2 = r1.f350093d
            java.lang.String r2 = r2.f26005a
            boolean r2 = r0.contains(r2)
            if (r2 == 0) goto L_0x058e
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r0
            ei.d$a r0 = r1.f350093d
            java.lang.String r0 = r0.f26005a
            r3 = 1
            r2[r3] = r0
            java.lang.String r0 = "noticeIdList %s contain notifyID:%s, drop id"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r12, r0, r2)
            goto L_0x0956
        L_0x058e:
            android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            java.lang.String r2 = com.tencent.p014mm.sdk.platformtools.LocaleUtil.getCurrentLanguage(r0)
            r0 = 0
            r3 = 0
            r5 = 0
            r6 = 0
        L_0x059a:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r8)
            if (r6 != 0) goto L_0x05a6
            r9 = r4
            goto L_0x05aa
        L_0x05a6:
            java.lang.Integer r9 = java.lang.Integer.valueOf(r6)
        L_0x05aa:
            r7.append(r9)
            java.lang.String r7 = r7.toString()
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r7)
            r9.append(r15)
            java.lang.String r9 = r9.toString()
            java.lang.Object r9 = r10.get(r9)
            java.lang.String r9 = (java.lang.String) r9
            if (r9 != 0) goto L_0x05d0
            r11 = 3
            if (r6 <= r11) goto L_0x05d0
            r4 = 0
            r14 = 0
            r26 = 0
            goto L_0x061c
        L_0x05d0:
            boolean r11 = r2.equalsIgnoreCase(r9)
            if (r11 == 0) goto L_0x06a5
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r7)
            r2.append(r14)
            java.lang.String r2 = r2.toString()
            java.lang.Object r2 = r10.get(r2)
            r14 = r2
            java.lang.String r14 = (java.lang.String) r14
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r7)
            r11 = r28
            r2.append(r11)
            java.lang.String r2 = r2.toString()
            java.lang.Object r2 = r10.get(r2)
            java.lang.String r2 = (java.lang.String) r2
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r7)
            r13 = r25
            r4.append(r13)
            java.lang.String r4 = r4.toString()
            java.lang.Object r4 = r10.get(r4)
            java.lang.String r4 = (java.lang.String) r4
            r26 = r2
        L_0x061c:
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r14)
            if (r2 == 0) goto L_0x0628
            java.lang.String r2 = "handleEventOOB cann't hit curLang"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r2)
            goto L_0x062c
        L_0x0628:
            r5 = r4
            r0 = r14
            r3 = r26
        L_0x062c:
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
            if (r2 == 0) goto L_0x063d
            android.content.Context r2 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            r3 = 2131824663(0x7f111017, float:1.928216E38)
            java.lang.String r3 = r2.getString(r3)
        L_0x063d:
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r2 == 0) goto L_0x0653
            java.lang.String r0 = "handleEventOOB defContent is also null use hardcode"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r0)
            android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            r2 = 2131824656(0x7f111010, float:1.9282146E38)
            java.lang.String r0 = r0.getString(r2)
        L_0x0653:
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r5)
            if (r2 == 0) goto L_0x066c
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r2 == 0) goto L_0x066b
            android.content.Context r2 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            r4 = 2131824660(0x7f111014, float:1.9282154E38)
            java.lang.String r5 = r2.getString(r4)
            goto L_0x066c
        L_0x066b:
            r5 = r0
        L_0x066c:
            ei.d$a r2 = r1.f350093d
            java.util.Map<java.lang.Integer, com.tencent.mm.autogen.events.UINotifyEvent> r2 = r2.f26008d
            java.util.HashMap r2 = (java.util.HashMap) r2
            r4 = r22
            java.lang.Object r2 = r2.get(r4)
            com.tencent.mm.autogen.events.UINotifyEvent r2 = (com.tencent.p014mm.autogen.events.UINotifyEvent) r2
            com.tencent.mm.autogen.events.UINotifyEvent$a r4 = r2.f343630d
            r4.f343633c = r5
            r4.f343632b = r3
            r3 = 1
            r4.f343631a = r3
            r3 = 2
            r4.f343635e = r3
            ei.d$a r3 = r1.f350093d
            java.lang.String r3 = r3.f26005a
            r4.f343638h = r3
            ei.c r3 = new ei.c
            r3.<init>(r1, r2)
            com.tencent.p014mm.sdk.platformtools.MMHandlerThread.postToMainThread(r3)
            ei.d$a r2 = r1.f350093d
            r2.f26007c = r0
            ob0.b0 r0 = eb0.C97625j3.m125815e()
            boolean r0 = r0.f256815j
            if (r0 == 0) goto L_0x0956
            r34.mo180754d()
            goto L_0x0956
        L_0x06a5:
            r16 = r2
            r18 = r3
            r3 = r22
            r2 = r24
            r13 = r25
            r11 = r28
            r17 = 2131824660(0x7f111014, float:1.9282154E38)
            r21 = 2131824663(0x7f111017, float:1.928216E38)
            boolean r9 = r2.equalsIgnoreCase(r9)
            if (r9 == 0) goto L_0x06ff
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r7)
            r0.append(r14)
            java.lang.String r0 = r0.toString()
            java.lang.Object r0 = r10.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r7)
            r5.append(r11)
            java.lang.String r5 = r5.toString()
            java.lang.Object r5 = r10.get(r5)
            java.lang.String r5 = (java.lang.String) r5
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r7)
            r9.append(r13)
            java.lang.String r7 = r9.toString()
            java.lang.Object r7 = r10.get(r7)
            java.lang.String r7 = (java.lang.String) r7
            r18 = r5
            r5 = r7
        L_0x06ff:
            int r6 = r6 + 1
            r24 = r2
            r22 = r3
            r28 = r11
            r25 = r13
            r2 = r16
            r3 = r18
            goto L_0x059a
        L_0x070f:
            r27 = r2
            r3 = r10
            int r0 = r0.f236158c
            r2 = 3
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
            r5 = 0
            r2[r5] = r4
            ei.d$a r4 = r1.f350093d
            r5 = 1
            r2[r5] = r4
            java.util.Map<java.lang.Integer, java.lang.Long> r4 = r1.f350094e
            java.util.HashMap r4 = (java.util.HashMap) r4
            int r4 = r4.size()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r5 = 2
            r2[r5] = r4
            java.lang.String r4 = "summerdiz handlePullNotify position[%d],oldNoticeInfo[%s], positionNoticeIdMap[%d]"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r12, r4, r2)
            r2 = 13936(0x3670, float:1.9528E-41)
            if (r0 <= 0) goto L_0x07df
            java.util.Map<java.lang.Integer, java.lang.Long> r4 = r1.f350094e
            java.util.HashMap r4 = (java.util.HashMap) r4
            int r4 = r4.size()
            if (r4 <= 0) goto L_0x07df
            java.util.Map<java.lang.Integer, java.lang.Long> r3 = r1.f350094e
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
            java.util.HashMap r3 = (java.util.HashMap) r3
            java.lang.Object r3 = r3.get(r4)
            java.lang.Long r3 = (java.lang.Long) r3
            r4 = 0
            long r6 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.Long) r3, (long) r4)
            r3 = 2
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.Integer r8 = java.lang.Integer.valueOf(r0)
            r9 = 0
            r3[r9] = r8
            java.lang.Long r8 = java.lang.Long.valueOf(r6)
            r9 = 1
            r3[r9] = r8
            java.lang.String r8 = "summerdiz handlePullNotify position[%d] found noticeId[%d]"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r12, r8, r3)
            int r3 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r3 <= 0) goto L_0x0956
            java.util.Map<java.lang.Long, ei.d$a> r3 = r1.f350095f
            java.lang.Long r4 = java.lang.Long.valueOf(r6)
            java.util.HashMap r3 = (java.util.HashMap) r3
            java.lang.Object r3 = r3.get(r4)
            ei.d$a r3 = (p148ei.C116775d.C7661a) r3
            if (r3 != 0) goto L_0x0790
            java.util.Map<java.lang.Integer, java.lang.Long> r2 = r1.f350094e
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.util.HashMap r2 = (java.util.HashMap) r2
            r2.remove(r0)
            goto L_0x0956
        L_0x0790:
            java.util.Map<java.lang.Integer, com.tencent.mm.autogen.events.UINotifyEvent> r3 = r3.f26008d
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
            java.util.HashMap r3 = (java.util.HashMap) r3
            java.lang.Object r3 = r3.get(r4)
            com.tencent.mm.autogen.events.UINotifyEvent r3 = (com.tencent.p014mm.autogen.events.UINotifyEvent) r3
            if (r3 != 0) goto L_0x07a2
            goto L_0x0956
        L_0x07a2:
            r4 = r27
            com.tencent.mm.autogen.events.BroadcastEvent$b r4 = r4.f343530e
            com.tencent.mm.autogen.events.UINotifyEvent$a r3 = r3.f343630d
            java.lang.String r5 = r3.f343633c
            r4.f343533c = r5
            int r5 = r3.f343634d
            r4.f343534d = r5
            java.lang.String r5 = r3.f343632b
            r4.f343532b = r5
            boolean r5 = r3.f343631a
            r4.f343531a = r5
            int r6 = r3.f343637g
            r4.f343537g = r6
            int r6 = r3.f343635e
            r4.f343535e = r6
            java.lang.String r6 = r3.f343636f
            r4.f343536f = r6
            java.lang.String r6 = r3.f343638h
            r4.f343538h = r6
            int r3 = r3.f343639i
            r4.f343539i = r3
            if (r5 == 0) goto L_0x0956
            com.tencent.mm.plugin.report.service.n r3 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r4 = 1
            java.lang.Object[] r4 = new java.lang.Object[r4]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r5 = 0
            r4[r5] = r0
            r3.mo160131h(r2, r4)
            goto L_0x0956
        L_0x07df:
            r4 = r27
            ei.d$a r5 = r1.f350093d
            if (r5 == 0) goto L_0x0956
            java.util.Map<java.lang.Integer, com.tencent.mm.autogen.events.UINotifyEvent> r5 = r5.f26008d
            java.util.HashMap r5 = (java.util.HashMap) r5
            java.lang.Object r3 = r5.get(r3)
            com.tencent.mm.autogen.events.UINotifyEvent r3 = (com.tencent.p014mm.autogen.events.UINotifyEvent) r3
            if (r3 != 0) goto L_0x07f3
            goto L_0x0956
        L_0x07f3:
            com.tencent.mm.autogen.events.BroadcastEvent$b r4 = r4.f343530e
            com.tencent.mm.autogen.events.UINotifyEvent$a r3 = r3.f343630d
            java.lang.String r5 = r3.f343633c
            r4.f343533c = r5
            int r5 = r3.f343634d
            r4.f343534d = r5
            java.lang.String r5 = r3.f343632b
            r4.f343532b = r5
            boolean r5 = r3.f343631a
            r4.f343531a = r5
            int r6 = r3.f343637g
            r4.f343537g = r6
            int r6 = r3.f343635e
            r4.f343535e = r6
            java.lang.String r6 = r3.f343636f
            r4.f343536f = r6
            java.lang.String r6 = r3.f343638h
            r4.f343538h = r6
            int r3 = r3.f343639i
            r4.f343539i = r3
            if (r5 == 0) goto L_0x082d
            com.tencent.mm.plugin.report.service.n r3 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r4 = 1
            java.lang.Object[] r4 = new java.lang.Object[r4]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r5 = 0
            r4[r5] = r0
            r3.mo160131h(r2, r4)
            goto L_0x082e
        L_0x082d:
            r5 = 0
        L_0x082e:
            r34.mo180754d()
            goto L_0x0956
        L_0x0833:
            r3 = r10
            r5 = 0
            java.lang.String r2 = r0.f236157b
            r6 = 0
            long r8 = com.tencent.p014mm.sdk.platformtools.Util.getLong(r2, r6)
            int r0 = r0.f236158c
            r4 = 4
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r4[r5] = r2
            java.lang.Integer r5 = java.lang.Integer.valueOf(r0)
            r6 = 1
            r4[r6] = r5
            ei.d$a r5 = r1.f350093d
            r6 = 2
            java.lang.Integer r7 = java.lang.Integer.valueOf(r6)
            r4[r6] = r5
            java.util.Map<java.lang.Long, ei.d$a> r5 = r1.f350095f
            java.util.HashMap r5 = (java.util.HashMap) r5
            int r5 = r5.size()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r6 = 3
            r4[r6] = r5
            java.lang.String r5 = "summerdiz cancelUIEvent cancelNoticeIDStr[%s] cancelPosition[%d], oldNoticeInfo[%s] newDisasterNoticeInfoMap[%d] "
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r12, r5, r4)
            java.util.Map<java.lang.Long, ei.d$a> r4 = r1.f350095f
            java.util.HashMap r4 = (java.util.HashMap) r4
            int r4 = r4.size()
            r5 = 13939(0x3673, float:1.9533E-41)
            if (r4 <= 0) goto L_0x0930
            r10 = 0
            int r4 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r4 <= 0) goto L_0x0930
            java.util.Map<java.lang.Long, ei.d$a> r4 = r1.f350095f
            java.lang.Long r6 = java.lang.Long.valueOf(r8)
            java.util.HashMap r4 = (java.util.HashMap) r4
            java.lang.Object r4 = r4.get(r6)
            ei.d$a r4 = (p148ei.C116775d.C7661a) r4
            if (r4 == 0) goto L_0x092b
            r6 = 1
            java.lang.Object[] r10 = new java.lang.Object[r6]
            r6 = 0
            r10[r6] = r4
            java.lang.String r6 = "summerdiz cancelUIEvent found info[%s]"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r12, r6, r10)
            java.lang.String r6 = "summerdiz cancelPosition[%d] found event[%b]"
            if (r0 <= 0) goto L_0x08e7
            java.util.Map<java.lang.Integer, com.tencent.mm.autogen.events.UINotifyEvent> r4 = r4.f26008d
            java.lang.Integer r8 = java.lang.Integer.valueOf(r0)
            java.util.HashMap r4 = (java.util.HashMap) r4
            java.lang.Object r4 = r4.get(r8)
            com.tencent.mm.autogen.events.UINotifyEvent r4 = (com.tencent.p014mm.autogen.events.UINotifyEvent) r4
            if (r4 == 0) goto L_0x08d7
            r8 = 2
            java.lang.Object[] r9 = new java.lang.Object[r8]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r8 = 0
            r9[r8] = r0
            com.tencent.mm.autogen.events.UINotifyEvent$a r0 = r4.f343630d
            boolean r0 = r0.f343631a
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r10 = 1
            r9[r10] = r0
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r12, r6, r9)
            com.tencent.mm.autogen.events.UINotifyEvent$a r0 = r4.f343630d
            boolean r6 = r0.f343631a
            if (r6 == 0) goto L_0x0930
            r0.f343631a = r8
            r4.publish()
            com.tencent.mm.plugin.report.service.n r0 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            java.lang.Object[] r2 = new java.lang.Object[r10]
            r2[r8] = r7
            r0.mo160131h(r5, r2)
            goto L_0x0956
        L_0x08d7:
            r8 = 0
            r10 = 1
            java.lang.Object[] r4 = new java.lang.Object[r10]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r4[r8] = r0
            java.lang.String r0 = "summerdiz cancelPosition[%d] not found event"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r12, r0, r4)
            goto L_0x0930
        L_0x08e7:
            java.util.Map<java.lang.Integer, com.tencent.mm.autogen.events.UINotifyEvent> r0 = r4.f26008d
            java.util.HashMap r0 = (java.util.HashMap) r0
            java.util.Collection r0 = r0.values()
            if (r0 == 0) goto L_0x0956
            java.util.Iterator r0 = r0.iterator()
            if (r0 == 0) goto L_0x0956
        L_0x08f7:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x0956
            java.lang.Object r2 = r0.next()
            com.tencent.mm.autogen.events.UINotifyEvent r2 = (com.tencent.p014mm.autogen.events.UINotifyEvent) r2
            if (r2 == 0) goto L_0x08f7
            com.tencent.mm.autogen.events.UINotifyEvent$a r3 = r2.f343630d
            boolean r3 = r3.f343631a
            if (r3 == 0) goto L_0x08f7
            r3 = 2
            java.lang.Object[] r4 = new java.lang.Object[r3]
            java.lang.Long r3 = java.lang.Long.valueOf(r8)
            r5 = 0
            r4[r5] = r3
            com.tencent.mm.autogen.events.UINotifyEvent$a r3 = r2.f343630d
            boolean r3 = r3.f343631a
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            r7 = 1
            r4[r7] = r3
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r12, r6, r4)
            com.tencent.mm.autogen.events.UINotifyEvent$a r3 = r2.f343630d
            r3.f343631a = r5
            r2.publish()
            goto L_0x08f7
        L_0x092b:
            java.lang.String r0 = "summerdiz cancelNoticeID not found info"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r0)
        L_0x0930:
            ei.d$a r0 = r1.f350093d
            if (r0 == 0) goto L_0x0956
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r0 != 0) goto L_0x0958
            ei.d$a r0 = r1.f350093d
            java.lang.String r0 = r0.f26005a
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L_0x0958
            r4 = 2
            java.lang.Object[] r0 = new java.lang.Object[r4]
            ei.d$a r3 = r1.f350093d
            java.lang.String r3 = r3.f26005a
            r4 = 0
            r0[r4] = r3
            r3 = 1
            r0[r3] = r2
            java.lang.String r2 = "summerdiz cancelUIEvent old now:[%s], want to cancel:[%s], drop id"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r12, r2, r0)
        L_0x0956:
            r4 = 0
            goto L_0x097e
        L_0x0958:
            ei.d$a r0 = r1.f350093d
            java.util.Map<java.lang.Integer, com.tencent.mm.autogen.events.UINotifyEvent> r0 = r0.f26008d
            java.util.HashMap r0 = (java.util.HashMap) r0
            java.lang.Object r0 = r0.get(r3)
            com.tencent.mm.autogen.events.UINotifyEvent r0 = (com.tencent.p014mm.autogen.events.UINotifyEvent) r0
            if (r0 == 0) goto L_0x0956
            com.tencent.mm.autogen.events.UINotifyEvent$a r2 = r0.f343630d
            boolean r2 = r2.f343631a
            if (r2 == 0) goto L_0x0956
            com.tencent.mm.plugin.report.service.n r2 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r3 = 1
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r4 = 0
            r3[r4] = r7
            r2.mo160131h(r5, r3)
            com.tencent.mm.autogen.events.UINotifyEvent$a r2 = r0.f343630d
            r2.f343631a = r4
            r0.publish()
        L_0x097e:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p148ei.C116775d.callback(com.tencent.mm.sdk.event.IEvent):boolean");
    }

    /* renamed from: d */
    public final void mo180754d() {
        C7661a aVar = this.f350093d;
        if (aVar != null && ((HashMap) aVar.f26008d).get(0) != null && !Util.isNullOrNil(this.f350093d.f26007c)) {
            Log.m105925i("MicroMsg.BroadcastController", "summerdize checkShowDisasterContent showDisasterContent[%s]", this.f350093d.f26007c);
            Intent intent = new Intent();
            intent.putExtra("key_disaster_content", this.f350093d.f26007c);
            intent.putExtra("key_disaster_url", ((UINotifyEvent) ((HashMap) this.f350093d.f26008d).get(0)).f343630d.f343632b);
            intent.setClass(MMApplicationContext.getContext(), DisasterUI.class).addFlags(268435456);
            Context context = MMApplicationContext.getContext();
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(intent);
            Context context2 = context;
            C117292a.m165358d(context2, aVar2.mo10232b(), "com/tencent/mm/broadcast/BroadcastController", "checkShowDisasterContent", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((Intent) aVar2.mo10231a(0));
            C117292a.m165359e(context2, "com/tencent/mm/broadcast/BroadcastController", "checkShowDisasterContent", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            this.f350093d.f26007c = null;
        }
    }
}
