package tg1;

import com.tencent.p014mm.autogen.events.FeedUpdateEvent;
import com.tencent.p014mm.autogen.events.FinderLiveTipsBarEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C7335d;
import di3.C86312j;
import eb0.C31543z5;
import f40.C86709a0;
import f62.C31922b1;
import ft1.C59319a;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import ik1.C33345k;
import ik1.C33352l;
import java.util.List;
import java.util.Map;
import java.util.Vector;
import jp3.C9487b;
import js3.C33659a;
import ls3.C34356e;
import o40.C11348f;
import o40.C61926c;
import ob0.C35136m;
import org.json.JSONObject;
import p565ir.C60606n;
import p749xh.C38624o3;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import sf0.C48374j0;
import te3.C50429mo2;
import te3.C64623p81;
import te3.C77949j3;

/* renamed from: tg1.e */
public final class C37095e {

    /* renamed from: a */
    public static final C37095e f98274a = new C37095e();

    /* renamed from: b */
    public static final C13601g f98275b = C36568h.m40985a(C37101f.f98278d);

    /* renamed from: tg1.e$a */
    public static final class C37096a implements C31922b1 {
        /* JADX WARNING: Removed duplicated region for block: B:37:0x00f6  */
        /* JADX WARNING: Removed duplicated region for block: B:39:0x00f9  */
        /* renamed from: X5 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public ob0.C35136m.C35139b mo10269X5(java.lang.String r18, java.util.Map<java.lang.String, java.lang.String> r19, ob0.C35136m.C35137a r20) {
            /*
                r17 = this;
                r0 = r19
                r1 = r20
                boolean r2 = f40.C86709a0.m107522a()
                r3 = 0
                if (r2 != 0) goto L_0x000c
                return r3
            L_0x000c:
                if (r18 == 0) goto L_0x0141
                if (r0 == 0) goto L_0x0141
                if (r1 != 0) goto L_0x0014
                goto L_0x0141
            L_0x0014:
                te3.j3 r1 = r1.f94242a
                if (r1 != 0) goto L_0x0019
                return r3
            L_0x0019:
                tg1.e r2 = tg1.C37095e.f98274a
                java.lang.String r4 = ".sysmsg.chatroomid"
                java.lang.Object r0 = r0.get(r4)
                java.lang.String r0 = (java.lang.String) r0
                java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r0)
                te3.rv3 r1 = r1.f227631h
                java.lang.String r1 = sf0.C48374j0.m53718g(r1)
                java.lang.String r4 = "msgContent"
                gy3.C87412m.m108593f(r1, r4)
                r6 = 0
                r7 = 0
                r8 = 6
                r9 = 0
                java.lang.String r5 = "<sysmsg"
                r4 = r1
                int r4 = z04.C112550d0.m153769E(r4, r5, r6, r7, r8, r9)
                r5 = -1
                java.lang.String r6 = "Finder.FinderLiveTipsBarDataEventReceiver"
                if (r4 == r5) goto L_0x00cd
                java.lang.String r4 = r1.substring(r4)
                java.lang.String r5 = "this as java.lang.String).substring(startIndex)"
                gy3.C87412m.m108593f(r4, r5)
                sr3.l$a r5 = sr3.C13776l.f38895a
                org.json.JSONObject r4 = r5.mo13138a(r4)
                if (r4 == 0) goto L_0x00cd
                java.lang.String r5 = "sysmsg"
                org.json.JSONObject r4 = r4.getJSONObject(r5)     // Catch:{ all -> 0x00b5 }
                java.lang.String r5 = "livelist"
                org.json.JSONObject r4 = r4.getJSONObject(r5)     // Catch:{ all -> 0x00b5 }
                java.lang.String r5 = "json.getJSONObject(\"sysm…getJSONObject(\"livelist\")"
                gy3.C87412m.m108593f(r4, r5)     // Catch:{ all -> 0x00b5 }
                java.lang.String r5 = "item"
                org.json.JSONObject r8 = r4.optJSONObject(r5)     // Catch:{ all -> 0x00b5 }
                if (r8 == 0) goto L_0x007d
                org.json.JSONArray r4 = new org.json.JSONArray     // Catch:{ all -> 0x00b5 }
                r4.<init>()     // Catch:{ all -> 0x00b5 }
                org.json.JSONArray r4 = r4.put(r8)     // Catch:{ all -> 0x00b5 }
                java.lang.String r5 = "JSONArray().put(singleItem)"
                gy3.C87412m.m108593f(r4, r5)     // Catch:{ all -> 0x00b5 }
                goto L_0x0086
            L_0x007d:
                org.json.JSONArray r4 = r4.getJSONArray(r5)     // Catch:{ all -> 0x00b5 }
                java.lang.String r5 = "getJSONArray(key)"
                gy3.C87412m.m108593f(r4, r5)     // Catch:{ all -> 0x00b5 }
            L_0x0086:
                int r5 = r4.length()     // Catch:{ all -> 0x00b5 }
                java.util.ArrayList r8 = new java.util.ArrayList     // Catch:{ all -> 0x00b5 }
                r8.<init>()     // Catch:{ all -> 0x00b5 }
                r9 = 0
            L_0x0090:
                java.lang.String r10 = "chatRoomId"
                if (r9 >= r5) goto L_0x00ac
                org.json.JSONObject r11 = r4.getJSONObject(r9)     // Catch:{ all -> 0x00b5 }
                gy3.C87412m.m108593f(r0, r10)     // Catch:{ all -> 0x00b5 }
                java.lang.String r10 = "itemJson"
                gy3.C87412m.m108593f(r11, r10)     // Catch:{ all -> 0x00b5 }
                xh.o3 r10 = r2.mo60966c(r0, r11)     // Catch:{ all -> 0x00b5 }
                if (r10 == 0) goto L_0x00a9
                r8.add(r10)     // Catch:{ all -> 0x00b5 }
            L_0x00a9:
                int r9 = r9 + 1
                goto L_0x0090
            L_0x00ac:
                tg1.e$c r2 = new tg1.e$c     // Catch:{ all -> 0x00b5 }
                gy3.C87412m.m108593f(r0, r10)     // Catch:{ all -> 0x00b5 }
                r2.<init>(r8, r0)     // Catch:{ all -> 0x00b5 }
                goto L_0x00e2
            L_0x00b5:
                r0 = move-exception
                java.lang.Object[] r2 = new java.lang.Object[r7]
                java.lang.String r4 = "parseNewXmlToTipsBarData"
                com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r6, r0, r4, r2)
                ft1.a r8 = ft1.C59319a.f169618b
                r10 = 0
                r11 = 0
                r12 = 0
                r13 = 0
                r14 = 0
                r15 = 60
                r16 = 0
                java.lang.String r9 = "parseNewXmlToTipsBarData"
                o40.C11348f.C11349a.m11178b(r8, r9, r10, r11, r12, r13, r14, r15, r16)
            L_0x00cd:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r2 = "parse xml failed, xml:"
                r0.append(r2)
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r0)
                r2 = r3
            L_0x00e2:
                if (r2 == 0) goto L_0x0141
                java.util.List<xh.o3> r0 = r2.f98276a
                boolean r0 = r0.isEmpty()
                r1 = 1
                r0 = r0 ^ r1
                if (r0 == 0) goto L_0x0141
                java.lang.String r0 = r2.f98277b
                int r0 = r0.length()
                if (r0 <= 0) goto L_0x00f7
                r7 = 1
            L_0x00f7:
                if (r7 == 0) goto L_0x0141
                java.util.List<xh.o3> r0 = r2.f98276a
                java.util.Iterator r0 = r0.iterator()
            L_0x00ff:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L_0x0141
                java.lang.Object r1 = r0.next()
                xh.o3 r1 = (p749xh.C38624o3) r1
                tg1.e r2 = tg1.C37095e.f98274a
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r4 = "addTipsBarConsumer recv liveId:"
                r2.append(r4)
                long r4 = r1.field_liveId
                java.lang.String r4 = o40.C61926c.m72691p(r4)
                r2.append(r4)
                java.lang.String r4 = ", chatroomId:"
                r2.append(r4)
                java.lang.String r4 = r1.field_hostRoomId
                r2.append(r4)
                java.lang.String r4 = ", anchorWx:"
                r2.append(r4)
                java.lang.String r4 = r1.field_anchorWxUsername
                r2.append(r4)
                java.lang.String r2 = r2.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r2)
                tg1.e r2 = tg1.C37095e.f98274a
                tg1.C37095e.m41218a(r2, r1)
                goto L_0x00ff
            L_0x0141:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: tg1.C37095e.C37096a.mo10269X5(java.lang.String, java.util.Map, ob0.m$a):ob0.m$b");
        }
    }

    /* renamed from: tg1.e$b */
    public static final class C37097b extends IStaticListener<FeedUpdateEvent> {
        public boolean callback(IEvent iEvent) {
            FeedUpdateEvent feedUpdateEvent = (FeedUpdateEvent) iEvent;
            C87412m.m108594g(feedUpdateEvent, "event");
            FeedUpdateEvent.C1041a aVar = feedUpdateEvent.f9173d;
            if (aVar.f9175b != 8 || aVar.f9182i != 2) {
                return false;
            }
            long j = aVar.f9174a;
            C37095e eVar = C37095e.f98274a;
            Log.m105924i("Finder.FinderLiveTipsBarDataEventReceiver", "liveEndListener recv liveId:" + C61926c.m72691p(j));
            C33345k b = C37095e.m41219b(C37095e.f98274a);
            if (b == null) {
                return false;
            }
            b.mo59084Lo(j, true);
            return false;
        }
    }

    /* renamed from: tg1.e$c */
    public static final class C37098c {

        /* renamed from: a */
        public final List<C38624o3> f98276a;

        /* renamed from: b */
        public final String f98277b;

        public C37098c(List<? extends C38624o3> list, String str) {
            C87412m.m108594g(list, "liveList");
            C87412m.m108594g(str, "chatRoomId");
            this.f98276a = list;
            this.f98277b = str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C37098c)) {
                return false;
            }
            C37098c cVar = (C37098c) obj;
            return C87412m.m108589b(this.f98276a, cVar.f98276a) && C87412m.m108589b(this.f98277b, cVar.f98277b);
        }

        public int hashCode() {
            return (this.f98276a.hashCode() * 31) + this.f98277b.hashCode();
        }

        public String toString() {
            return "NewXmlFinderChatRoomLiveTipsbar(liveList=" + this.f98276a + ", chatRoomId=" + this.f98277b + ')';
        }
    }

    /* renamed from: tg1.e$d */
    public static final class C37099d implements C31922b1 {
        /* renamed from: X5 */
        public C35136m.C35139b mo10269X5(String str, Map<String, String> map, C35136m.C35137a aVar) {
            C77949j3 j3Var;
            if (!(!C86709a0.m107522a() || str == null || map == null)) {
                String nullAsNil = Util.nullAsNil(map.get(".sysmsg.live.finderliveid"));
                C87412m.m108593f(nullAsNil, "liveIdStr");
                if (nullAsNil.length() == 0) {
                    C37095e eVar = C37095e.f98274a;
                    StringBuilder sb = new StringBuilder();
                    sb.append("removeTipsBarConsumer liveIdStr empty, xml:");
                    sb.append(C48374j0.m53718g((aVar == null || (j3Var = aVar.f94242a) == null) ? null : j3Var.f227631h));
                    Log.m105924i("Finder.FinderLiveTipsBarDataEventReceiver", sb.toString());
                } else {
                    long P = C61926c.m72671P(nullAsNil);
                    C37095e eVar2 = C37095e.f98274a;
                    Log.m105924i("Finder.FinderLiveTipsBarDataEventReceiver", "removeTipsBarConsumer recv liveId:" + C61926c.m72691p(P));
                    C33345k b = C37095e.m41219b(C37095e.f98274a);
                    if (b != null) {
                        b.mo59084Lo(P, true);
                    }
                }
            }
            return null;
        }
    }

    /* renamed from: tg1.e$e */
    public static final class C37100e extends IStaticListener<FinderLiveTipsBarEvent> {
        public boolean callback(IEvent iEvent) {
            String str;
            C33345k b;
            FinderLiveTipsBarEvent finderLiveTipsBarEvent = (FinderLiveTipsBarEvent) iEvent;
            C87412m.m108594g(finderLiveTipsBarEvent, "event");
            FinderLiveTipsBarEvent.C28745a aVar = finderLiveTipsBarEvent.f78795d;
            if (!(aVar == null || (str = aVar.f78797b) == null)) {
                C37095e eVar = C37095e.f98274a;
                Log.m105924i("Finder.FinderLiveTipsBarDataEventReceiver", "tipsBarEventListener recv type:" + aVar.f78796a + ", chatRoomId:" + str);
                int i = aVar.f78796a;
                if (i == 1) {
                    C64623p81 p812 = aVar.f78798c;
                    if (p812 == null) {
                        Log.m105924i("Finder.FinderLiveTipsBarDataEventReceiver", "tipsBarEventListener ADD_APPMSG finderShareObject null");
                    } else {
                        C37095e eVar2 = C37095e.f98274a;
                        String str2 = aVar.f78799d;
                        C87412m.m108593f(str2, "data.anchorWxUsername");
                        C38624o3 o3Var = new C38624o3();
                        o3Var.field_liveId = C61926c.m72671P(p812.f184778d);
                        o3Var.field_hostRoomId = str;
                        o3Var.field_timeStamp = (long) C31543z5.m39455e();
                        o3Var.field_anchorWxUsername = str2;
                        o3Var.field_anchorFinderUsername = p812.f184763G;
                        o3Var.field_anchorFinderNickname = p812.f184762F;
                        o3Var.field_finderObjectId = C61926c.m72671P(p812.f184780f);
                        o3Var.field_finderNonceId = p812.f184790s;
                        o3Var.field_sourceType = p812.f184793v;
                        if (o3Var.field_liveId == 0) {
                            Log.m105924i("Finder.FinderLiveTipsBarDataEventReceiver", "liveId invalid");
                            o3Var = null;
                        }
                        if (o3Var != null) {
                            C37095e.m41218a(eVar2, o3Var);
                        }
                    }
                } else if (i == 2 && (b = C37095e.m41219b(C37095e.f98274a)) != null) {
                    int delete = b.f90392d.delete("FinderLiveTipsBar", "hostRoomId= ? ", new String[]{str});
                    if (delete < 0) {
                        String str3 = C33345k.f90387g;
                        Log.m105920e(str3, "deleteByHostRoomId failed, hostRoomId:" + str + ", result:" + delete);
                    } else {
                        Vector<C38624o3> vector = C33345k.f90389i;
                        synchronized (vector) {
                            C61926c.m72674S(vector, new C33352l(str));
                        }
                        C33659a aVar2 = b.f90393e;
                        if (aVar2 != null) {
                            aVar2.mo59247a(str);
                        }
                        b.mo59089qq(str);
                        String str4 = C33345k.f90387g;
                        Log.m105924i(str4, "deleteByHostRoomId, hostRoomId:" + str + ", result:" + delete);
                    }
                }
            }
            return false;
        }
    }

    /* renamed from: tg1.e$f */
    public static final class C37101f extends C87413o implements C32224a<C33345k> {

        /* renamed from: d */
        public static final C37101f f98278d = new C37101f();

        public C37101f() {
            super(0);
        }

        public Object invoke() {
            return (C33345k) ((C34356e) C86312j.m106911c(C34356e.class)).mo58236XA();
        }
    }

    /* renamed from: a */
    public static final void m41218a(C37095e eVar, C38624o3 o3Var) {
        eVar.getClass();
        Log.m105924i("Finder.FinderLiveTipsBarDataEventReceiver", "checkAndInsert " + C61926c.m72691p(o3Var.field_liveId));
        C7335d c = C86312j.m106911c(C60606n.class);
        C87412m.m108593f(c, "getService(IFinderLiveFeatureService::class.java)");
        C60606n.C60607a.m70857a((C60606n) c, o3Var.field_liveId, false, (C9487b) null, new C37102f(o3Var), 1, (String) null, (C50429mo2) null, 96, (Object) null);
    }

    /* renamed from: b */
    public static final C33345k m41219b(C37095e eVar) {
        eVar.getClass();
        return (C33345k) ((C36570n) f98275b).getValue();
    }

    /* renamed from: c */
    public final C38624o3 mo60966c(String str, JSONObject jSONObject) {
        try {
            C38624o3 o3Var = new C38624o3();
            o3Var.field_liveId = C61926c.m72671P(jSONObject.getString("liveid"));
            o3Var.field_hostRoomId = str;
            o3Var.field_timeStamp = jSONObject.optLong("createtime", (long) C31543z5.m39455e());
            o3Var.field_anchorWxUsername = jSONObject.getString("livesendername");
            o3Var.field_anchorFinderUsername = jSONObject.getString("liveusername");
            o3Var.field_anchorFinderNickname = jSONObject.getString("nickname");
            o3Var.field_finderObjectId = C61926c.m72671P(jSONObject.getString("finderobjectid"));
            o3Var.field_finderNonceId = jSONObject.optString("findernonceid");
            if (o3Var.field_liveId != 0) {
                return o3Var;
            }
            Log.m105924i("Finder.FinderLiveTipsBarDataEventReceiver", "liveId invalid, json:" + jSONObject);
            return null;
        } catch (Throwable th) {
            Log.printErrStackTrace("Finder.FinderLiveTipsBarDataEventReceiver", th, "jsonToBaseFinderLiveTipsBar", new Object[0]);
            C11348f.C11349a.m11178b(C59319a.f169618b, "parseNewXmlToTipsBarData_item", false, (C11348f.C11352b) null, false, false, (C32224a) null, 60, (Object) null);
            return null;
        }
    }
}
