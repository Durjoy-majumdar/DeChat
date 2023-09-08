package eg1;

import android.os.Message;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.XmlParser;
import com.tencent.p014mm.storage.C72963f4;
import di3.C7335d;
import di3.C86312j;
import eb0.C31543z5;
import er1.C58739j4;
import gy3.C87412m;
import ht1.C76242a3;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import jp3.C9487b;
import o40.C61926c;
import p565ir.C60606n;
import te3.C50429mo2;

/* renamed from: eg1.x */
public final class C31595x implements C76242a3 {

    /* renamed from: a */
    public static final C31595x f84430a = new C31595x();

    /* renamed from: b */
    public static Map<String, Long> f84431b = Collections.synchronizedMap(new HashMap());

    /* renamed from: c */
    public static final int f84432c = 1;

    /* renamed from: d */
    public static volatile LinkedList<C72963f4> f84433d;

    /* renamed from: e */
    public static volatile boolean f84434e;

    /* renamed from: f */
    public static final int f84435f = 60;

    /* renamed from: g */
    public static MMHandler f84436g = new MMHandler("FinderLiveNotifyRefreshManager", (MMHandler.Callback) C31596a.f84437d);

    /* renamed from: eg1.x$a */
    public static final class C31596a implements MMHandler.Callback {

        /* renamed from: d */
        public static final C31596a f84437d = new C31596a();

        public final boolean handleMessage(Message message) {
            Message message2 = message;
            C87412m.m108594g(message2, LocaleUtil.ITALIAN);
            if (message2.what == C31595x.f84432c) {
                C31595x xVar = C31595x.f84430a;
                Object obj = message2.obj;
                C87412m.m108592e(obj, "null cannot be cast to non-null type java.util.LinkedList<com.tencent.mm.storage.MsgInfo>");
                LinkedList<C72963f4> linkedList = (LinkedList) obj;
                if (!C31595x.f84434e || linkedList.isEmpty()) {
                    Log.m105924i("FinderLiveNotifyRefreshManager", "refreshLiveInfo isPageFocus:" + C31595x.f84434e + ",data size:" + linkedList.size() + '!');
                } else {
                    HashMap hashMap = new HashMap();
                    for (C72963f4 f4Var : linkedList) {
                        Map<String, String> parseXml = XmlParser.parseXml(f4Var.getContent(), "msg", (String) null);
                        String str = parseXml.get(".msg.appmsg.extinfo.notifymsg.tipsinfo.tips_id");
                        long P = C61926c.m72671P(parseXml.get(".msg.appmsg.extinfo.notifymsg.tipsinfo.live_id"));
                        if (C58739j4.f168176a.mo83692U()) {
                            Log.m105924i("FinderLiveNotifyRefreshManager", "refreshLiveInfo liveId:" + P + ",tipsId:" + str + '!');
                        }
                        Long l = C31595x.f84431b.get(str);
                        long longValue = l != null ? l.longValue() : 0;
                        if (P != 0) {
                            if (!(str == null || str.length() == 0) && ((long) C31543z5.m39455e()) > longValue) {
                                hashMap.put(Long.valueOf(P), f4Var);
                                C7335d c = C86312j.m106911c(C60606n.class);
                                C87412m.m108593f(c, "getService(IFinderLiveFeatureService::class.java)");
                                C60606n.C60607a.m70857a((C60606n) c, P, false, (C9487b) null, new C31597y(P, str, hashMap), 5, (String) null, (C50429mo2) null, 96, (Object) null);
                            }
                        }
                        Log.m105924i("FinderLiveNotifyRefreshManager", "liveId:" + P + ",tipsId:" + str + " is not allow to refresh, next time stamp:" + longValue);
                    }
                }
            }
            return true;
        }
    }

    /* renamed from: a */
    public void mo58255a() {
        f84434e = true;
    }

    /* renamed from: b */
    public void mo58256b() {
        f84431b.clear();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0040, code lost:
        return;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void mo58257c(java.util.LinkedList<com.tencent.p014mm.storage.C72963f4> r4) {
        /*
            r3 = this;
            monitor-enter(r3)
            java.lang.String r0 = "data"
            gy3.C87412m.m108594g(r4, r0)     // Catch:{ all -> 0x0041 }
            boolean r0 = r4.isEmpty()     // Catch:{ all -> 0x0041 }
            if (r0 != 0) goto L_0x003f
            boolean r0 = f84434e     // Catch:{ all -> 0x0041 }
            if (r0 != 0) goto L_0x0011
            goto L_0x003f
        L_0x0011:
            f84433d = r4     // Catch:{ all -> 0x0041 }
            java.lang.String r0 = "FinderLiveNotifyRefreshManager"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0041 }
            r1.<init>()     // Catch:{ all -> 0x0041 }
            java.lang.String r2 = "allow to request,size = "
            r1.append(r2)     // Catch:{ all -> 0x0041 }
            int r2 = r4.size()     // Catch:{ all -> 0x0041 }
            r1.append(r2)     // Catch:{ all -> 0x0041 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0041 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)     // Catch:{ all -> 0x0041 }
            com.tencent.mm.sdk.platformtools.MMHandler r0 = f84436g     // Catch:{ all -> 0x0041 }
            int r1 = f84432c     // Catch:{ all -> 0x0041 }
            r0.removeMessages(r1)     // Catch:{ all -> 0x0041 }
            com.tencent.mm.sdk.platformtools.MMHandler r0 = f84436g     // Catch:{ all -> 0x0041 }
            android.os.Message r4 = r0.obtainMessage(r1, r4)     // Catch:{ all -> 0x0041 }
            r0.sendMessage(r4)     // Catch:{ all -> 0x0041 }
            monitor-exit(r3)
            return
        L_0x003f:
            monitor-exit(r3)
            return
        L_0x0041:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: eg1.C31595x.mo58257c(java.util.LinkedList):void");
    }

    /* renamed from: d */
    public Map<String, Long> mo58258d() {
        return f84431b;
    }

    /* renamed from: e */
    public void mo58259e() {
        f84434e = false;
        f84436g.removeMessages(f84432c);
    }
}
