package eb0;

import android.content.Context;
import bp3.C79755l;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import f62.C31943p0;
import f62.C75706q0;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import ob0.C35136m;
import ob0.C35141t;
import p261wl.C38166b;
import p261wl.C38173h;
import p261wl.C38174i;
import p872ah.C67046a;

/* renamed from: eb0.v5 */
public class C86497v5 implements C35141t {

    /* renamed from: d */
    public final Map<String, List<C86498c>> f251321d = new HashMap();

    /* renamed from: e */
    public final Map<String, List<C86498c>> f251322e = new HashMap();

    /* renamed from: f */
    public final Map<String, List<C75706q0>> f251323f = new HashMap();

    /* renamed from: g */
    public final Map<String, C31943p0> f251324g = new ConcurrentHashMap();

    /* renamed from: eb0.v5$a */
    public interface C31520a extends C38173h {
        /* renamed from: Y */
        void mo58212Y(C35136m.C35137a aVar);
    }

    /* renamed from: eb0.v5$b */
    public interface C31521b extends C38173h {
        /* renamed from: C1 */
        void mo9065C1(C35136m.C35138c cVar);

        /* renamed from: Y */
        void mo9066Y(C35136m.C35137a aVar);
    }

    /* renamed from: eb0.v5$d */
    public static class C31522d {

        /* renamed from: a */
        public static C86497v5 f84272a = new C86497v5();
    }

    /* renamed from: eb0.v5$c */
    public interface C86498c {
        /* renamed from: C1 */
        void mo23909C1(C35136m.C35138c cVar);

        /* renamed from: Y */
        void mo23910Y(C35136m.C35137a aVar);
    }

    @Deprecated
    /* renamed from: B */
    public final void mo120965B(String str, C35136m.C35137a aVar, boolean z) {
        List<C86498c> list;
        boolean z2;
        Map<String, List<C86498c>> map = z ? this.f251322e : this.f251321d;
        synchronized (map) {
            list = map.get(str);
        }
        if (z) {
            C38166b.C38167a aVar2 = (C38166b.C38167a) C38166b.m41759f(C31521b.class);
            Context context = MMApplicationContext.getContext();
            C38166b.C38167a.C38169b bVar = new C38166b.C38167a.C38169b(aVar2, aVar2.f100837d.all().iterator());
            z2 = false;
            while (bVar.hasNext()) {
                C38174i iVar = (C38174i) bVar.next();
                if (!C38166b.m41758e(context, iVar)) {
                    Log.m105929w("MicroMsg.SysCmdMsgExtension", "Listener (%s) is not registered in current process.", iVar);
                } else if (iVar.hasNoKeys() || iVar.hasKey(str)) {
                    C31521b bVar2 = (C31521b) iVar.get();
                    if (bVar2 != null) {
                        bVar2.mo9066Y(aVar);
                        if (!z2) {
                            z2 = true;
                        }
                    } else {
                        Log.m105921e("MicroMsg.SysCmdMsgExtension", "%s returns null, skip notifying.", iVar);
                    }
                }
            }
        } else {
            C38166b.C38167a aVar3 = (C38166b.C38167a) C38166b.m41759f(C31520a.class);
            C38166b.C38167a.C38169b bVar3 = new C38166b.C38167a.C38169b(aVar3, aVar3.f100837d.all().iterator());
            while (bVar3.hasNext()) {
                C38174i iVar2 = (C38174i) bVar3.next();
                if (iVar2.hasKey(str)) {
                    ((C31520a) iVar2.get()).mo58212Y(aVar);
                }
            }
            z2 = false;
        }
        if (list == null || list.isEmpty()) {
            Log.m105928w("MicroMsg.SysCmdMsgExtension", "listener list is empty, return now");
            if (z && !z2) {
                C79755l.m96894d(MMApplicationContext.getProcessName(), str);
                return;
            }
            return;
        }
        if (z) {
            z2 = true;
        }
        Log.m105925i("MicroMsg.SysCmdMsgExtension", "listener list size is %d", Integer.valueOf(list.size()));
        for (C86498c Y : list) {
            Y.mo23910Y(aVar);
        }
        if (!z2) {
            C79755l.m96894d(MMApplicationContext.getProcessName(), str);
        }
    }

    @Deprecated
    /* renamed from: D */
    public void mo120966D(String str, C86498c cVar, boolean z) {
        List list;
        if (!Util.isNullOrNil(str) && cVar != null) {
            Map<String, List<C86498c>> map = z ? this.f251322e : this.f251321d;
            synchronized (map) {
                list = map.get(str);
            }
            if (list != null) {
                synchronized (list) {
                    list.remove(cVar);
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:90:0x01e9  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x01ee  */
    /* renamed from: Fg */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ob0.C35136m.C35139b mo56403Fg(ob0.C35136m.C35137a r14) {
        /*
            r13 = this;
            te3.j3 r0 = r14.f94242a
            int r1 = r0.f227630g
            r2 = 10001(0x2711, float:1.4014E-41)
            r3 = 0
            r4 = 0
            if (r1 == r2) goto L_0x02f0
            r2 = 10002(0x2712, float:1.4016E-41)
            r5 = 1
            if (r1 == r2) goto L_0x001f
            java.lang.String r14 = "MicroMsg.SysCmdMsgExtension"
            java.lang.String r0 = "cmdAM msgType is %d, ignore, return now"
            java.lang.Object[] r2 = new java.lang.Object[r5]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2[r4] = r1
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r14, r0, r2)
            return r3
        L_0x001f:
            te3.rv3 r0 = r0.f227631h
            java.lang.String r0 = sf0.C48374j0.m53718g(r0)
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r1 == 0) goto L_0x0033
            java.lang.String r14 = "MicroMsg.SysCmdMsgExtension"
            java.lang.String r0 = "null msg content"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r14, r0)
            return r3
        L_0x0033:
            java.lang.String r1 = "~SEMI_XML~"
            boolean r1 = r0.startsWith(r1)
            r2 = 2
            if (r1 == 0) goto L_0x0052
            java.util.Map r1 = com.tencent.p014mm.sdk.platformtools.SemiXml.decode(r0)
            if (r1 != 0) goto L_0x004f
            java.lang.String r14 = "MicroMsg.SysCmdMsgExtension"
            java.lang.String r1 = "SemiXml values is null, msgContent %s"
            java.lang.Object[] r2 = new java.lang.Object[r5]
            r2[r4] = r0
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r14, r1, r2)
            return r3
        L_0x004f:
            java.lang.String r6 = "brand_service"
            goto L_0x00c8
        L_0x0052:
            java.lang.String r1 = "<sysmsg"
            int r1 = r0.indexOf(r1)
            r6 = -1
            if (r1 == r6) goto L_0x008b
            java.lang.String r1 = r0.substring(r1)
            java.lang.String r6 = "MicroMsg.SysCmdMsgExtension"
            java.lang.String r7 = "oneliang, msg content:%s,sub content:%s"
            java.lang.Object[] r8 = new java.lang.Object[r2]
            r8[r4] = r0
            r8[r5] = r1
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r6, r7, r8)
            java.lang.String r6 = "sysmsg"
            java.util.Map r1 = com.tencent.p014mm.sdk.platformtools.XmlParser.parseXml(r1, r6, r3)
            if (r1 != 0) goto L_0x0082
            java.lang.String r14 = "MicroMsg.SysCmdMsgExtension"
            java.lang.String r1 = "XmlParser values is null, msgContent %s"
            java.lang.Object[] r2 = new java.lang.Object[r5]
            r2[r4] = r0
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r14, r1, r2)
            return r3
        L_0x0082:
            java.lang.String r6 = ".sysmsg.$type"
            java.lang.Object r6 = r1.get(r6)
            java.lang.String r6 = (java.lang.String) r6
            goto L_0x00c8
        L_0x008b:
            java.lang.String r1 = "<appmsg"
            int r1 = r0.indexOf(r1)
            if (r1 == r6) goto L_0x02e8
            java.lang.String r6 = "MicroMsg.SysCmdMsgExtension"
            java.lang.String r7 = "msgContent start with <appmsg"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r7)
            java.lang.String r1 = r0.substring(r1)
            java.lang.String r6 = "MicroMsg.SysCmdMsgExtension"
            java.lang.String r7 = "oneliang, msg content:%s,sub content:%s"
            java.lang.Object[] r8 = new java.lang.Object[r2]
            r8[r4] = r0
            r8[r5] = r1
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r6, r7, r8)
            java.lang.String r6 = "appmsg"
            java.util.Map r1 = com.tencent.p014mm.sdk.platformtools.XmlParser.parseXml(r1, r6, r3)
            if (r1 != 0) goto L_0x00c0
            java.lang.String r14 = "MicroMsg.SysCmdMsgExtension"
            java.lang.String r1 = "XmlParser values is null, msgContent %s"
            java.lang.Object[] r2 = new java.lang.Object[r5]
            r2[r4] = r0
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r14, r1, r2)
            return r3
        L_0x00c0:
            java.lang.String r6 = ".appmsg.title"
            java.lang.Object r6 = r1.get(r6)
            java.lang.String r6 = (java.lang.String) r6
        L_0x00c8:
            java.lang.String r7 = "MicroMsg.SysCmdMsgExtension"
            java.lang.String r8 = "recieve a syscmd_newxml %s subType %s"
            java.lang.Object[] r9 = new java.lang.Object[r2]
            r9[r4] = r0
            r9[r5] = r6
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r7, r8, r9)
            if (r6 == 0) goto L_0x02e7
            boolean r0 = p285zh.C119114c.f356684a
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r7 = "noteAddXmlMsgType: type="
            r0.append(r7)
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            java.lang.String r7 = "MicroMsg.NotifyPowerInspector"
            p285zh.C119114c.m167920e(r7, r0)
            boolean r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.isMainProcess()
            if (r0 == 0) goto L_0x010d
            com.tencent.matrix.lifecycle.supervisor.AppExplicitBackgroundOwner r0 = com.tencent.matrix.lifecycle.supervisor.AppExplicitBackgroundOwner.INSTANCE
            boolean r0 = r0.isBackground()
            if (r0 == 0) goto L_0x010d
            zh.c$$e r0 = p285zh.C119114c.f356695l
            boolean r7 = r0.mo183788b()
            if (r7 != 0) goto L_0x010a
            boolean r7 = p285zh.C119114c.f356685b
            if (r7 != 0) goto L_0x010d
        L_0x010a:
            r0.mo183789c(r6)
        L_0x010d:
            r13.mo120965B(r6, r14, r5)
            java.util.Map<java.lang.String, java.util.List<f62.q0>> r0 = r13.f251323f
            monitor-enter(r0)
            java.util.Map<java.lang.String, java.util.List<f62.q0>> r7 = r13.f251323f     // Catch:{ all -> 0x02e4 }
            java.util.HashMap r7 = (java.util.HashMap) r7     // Catch:{ all -> 0x02e4 }
            java.lang.Object r7 = r7.get(r6)     // Catch:{ all -> 0x02e4 }
            java.util.List r7 = (java.util.List) r7     // Catch:{ all -> 0x02e4 }
            monitor-exit(r0)     // Catch:{ all -> 0x02e4 }
            java.lang.Class<f62.c1> r0 = f62.C31924c1.class
            wl.d r0 = p261wl.C38166b.m41759f(r0)
            wl.b$a r0 = (p261wl.C38166b.C38167a) r0
            if (r7 == 0) goto L_0x012e
            boolean r8 = r7.isEmpty()
            if (r8 == 0) goto L_0x0161
        L_0x012e:
            wl.d<T> r8 = r0.f100837d
            java.lang.Iterable r8 = r8.all()
            java.util.Iterator r8 = r8.iterator()
        L_0x0138:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L_0x014e
            java.lang.Object r9 = r8.next()
            wl.i r9 = (p261wl.C38174i) r9
            android.app.Application r10 = p261wl.C38166b.f100836c
            boolean r9 = p261wl.C38166b.m41757d(r10, r9)
            if (r9 == 0) goto L_0x0138
            r8 = 1
            goto L_0x014f
        L_0x014e:
            r8 = 0
        L_0x014f:
            if (r8 != 0) goto L_0x0161
            java.lang.String r0 = "MicroMsg.SysCmdMsgExtension"
            java.lang.String r7 = "listener list is empty, return now"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r0, r7)
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getProcessName()
            bp3.C79755l.m96893c(r0, r6)
            goto L_0x01dd
        L_0x0161:
            wl.b$a$b r8 = new wl.b$a$b
            wl.d<T> r9 = r0.f100837d
            java.lang.Iterable r9 = r9.all()
            java.util.Iterator r9 = r9.iterator()
            r8.<init>(r0, r9)
            r0 = 0
        L_0x0171:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L_0x01a4
            java.lang.Object r9 = r8.next()
            wl.i r9 = (p261wl.C38174i) r9
            boolean r10 = r9.hasNoKeys()
            if (r10 != 0) goto L_0x0189
            boolean r10 = r9.hasKey(r6)
            if (r10 == 0) goto L_0x0171
        L_0x0189:
            java.lang.Object r10 = r9.get()
            f62.c1 r10 = (f62.C31924c1) r10
            if (r10 == 0) goto L_0x0198
            r10.mo8730o(r6, r1, r14)
            if (r0 != 0) goto L_0x0171
            r0 = 1
            goto L_0x0171
        L_0x0198:
            java.lang.String r10 = "MicroMsg.SysCmdMsgExtension"
            java.lang.String r11 = "%s returns null, skip notifying."
            java.lang.Object[] r12 = new java.lang.Object[r5]
            r12[r4] = r9
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r10, r11, r12)
            goto L_0x0171
        L_0x01a4:
            if (r7 == 0) goto L_0x01d4
            monitor-enter(r7)
            java.lang.String r0 = "MicroMsg.SysCmdMsgExtension"
            java.lang.String r8 = "listener list size is %d"
            java.lang.Object[] r9 = new java.lang.Object[r5]     // Catch:{ all -> 0x01d1 }
            int r10 = r7.size()     // Catch:{ all -> 0x01d1 }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x01d1 }
            r9[r4] = r10     // Catch:{ all -> 0x01d1 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r8, r9)     // Catch:{ all -> 0x01d1 }
            java.util.Iterator r0 = r7.iterator()     // Catch:{ all -> 0x01d1 }
        L_0x01be:
            boolean r8 = r0.hasNext()     // Catch:{ all -> 0x01d1 }
            if (r8 == 0) goto L_0x01ce
            java.lang.Object r8 = r0.next()     // Catch:{ all -> 0x01d1 }
            f62.q0 r8 = (f62.C75706q0) r8     // Catch:{ all -> 0x01d1 }
            r8.mo25945o(r6, r1, r14)     // Catch:{ all -> 0x01d1 }
            goto L_0x01be
        L_0x01ce:
            monitor-exit(r7)     // Catch:{ all -> 0x01d1 }
            r0 = 1
            goto L_0x01d4
        L_0x01d1:
            r14 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x01d1 }
            throw r14
        L_0x01d4:
            if (r0 != 0) goto L_0x01dd
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getProcessName()
            bp3.C79755l.m96893c(r0, r6)
        L_0x01dd:
            java.util.Map<java.lang.String, f62.p0> r0 = r13.f251324g
            java.util.concurrent.ConcurrentHashMap r0 = (java.util.concurrent.ConcurrentHashMap) r0
            java.lang.Object r0 = r0.get(r6)
            f62.p0 r0 = (f62.C31943p0) r0
            if (r0 == 0) goto L_0x01ee
            ob0.m$b r14 = r0.mo58199X5(r6, r1, r14)
            return r14
        L_0x01ee:
            java.lang.String r0 = "MicroMsg.SysCmdMsgExtension"
            java.lang.String r7 = "no NewXmlConsumer to consume cmd %s!!"
            java.lang.Object[] r8 = new java.lang.Object[r5]
            r8[r4] = r6
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r0, r7, r8)
            java.lang.Class<f62.b1> r0 = f62.C31922b1.class
            wl.d r0 = p261wl.C38166b.m41759f(r0)
            wl.b$a r0 = (p261wl.C38166b.C38167a) r0
            wl.b$a$b r7 = new wl.b$a$b
            wl.d<T> r8 = r0.f100837d
            java.lang.Iterable r8 = r8.all()
            java.util.Iterator r8 = r8.iterator()
            r7.<init>(r0, r8)
        L_0x0210:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x022d
            java.lang.Object r0 = r7.next()
            wl.i r0 = (p261wl.C38174i) r0
            boolean r8 = r0.hasKey(r6)
            if (r8 == 0) goto L_0x0210
            java.lang.Object r0 = r0.get()
            f62.b1 r0 = (f62.C31922b1) r0
            ob0.m$b r14 = r0.mo10269X5(r6, r1, r14)
            return r14
        L_0x022d:
            java.lang.String r14 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getProcessName()
            boolean r0 = bp3.C79755l.m96891a(r6)
            if (r0 == 0) goto L_0x0238
            goto L_0x0278
        L_0x0238:
            java.util.Set<java.lang.Object> r0 = bp3.C79755l.f233753b     // Catch:{ all -> 0x026a }
            r1 = r0
            java.util.HashSet r1 = (java.util.HashSet) r1     // Catch:{ all -> 0x026a }
            boolean r1 = r1.contains(r6)     // Catch:{ all -> 0x026a }
            if (r1 == 0) goto L_0x0244
            goto L_0x0278
        L_0x0244:
            monitor-enter(r0)     // Catch:{ all -> 0x026a }
            r1 = r0
            java.util.HashSet r1 = (java.util.HashSet) r1     // Catch:{ all -> 0x0267 }
            boolean r1 = r1.contains(r6)     // Catch:{ all -> 0x0267 }
            if (r1 == 0) goto L_0x0250
            monitor-exit(r0)     // Catch:{ all -> 0x0267 }
            goto L_0x0278
        L_0x0250:
            java.util.concurrent.locks.Lock r1 = bp3.C79755l.f233758g     // Catch:{ all -> 0x0260 }
            r1.lock()     // Catch:{ all -> 0x0260 }
            r7 = r0
            java.util.HashSet r7 = (java.util.HashSet) r7     // Catch:{ all -> 0x0260 }
            r7.add(r6)     // Catch:{ all -> 0x0260 }
            r1.unlock()     // Catch:{ all -> 0x0267 }
            monitor-exit(r0)     // Catch:{ all -> 0x0267 }
            goto L_0x0278
        L_0x0260:
            r1 = move-exception
            java.util.concurrent.locks.Lock r7 = bp3.C79755l.f233758g     // Catch:{ all -> 0x0267 }
            r7.unlock()     // Catch:{ all -> 0x0267 }
            throw r1     // Catch:{ all -> 0x0267 }
        L_0x0267:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0267 }
            throw r1     // Catch:{ all -> 0x026a }
        L_0x026a:
            r0 = move-exception
            java.lang.String r1 = "MicroMsg.MissingMessageListenerReporter"
            java.lang.String r7 = "fail to call reportMissingINewXmlConsumer(%s,%s)"
            java.lang.Object[] r8 = new java.lang.Object[r2]
            r8[r4] = r14
            r8[r5] = r6
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r1, r0, r7, r8)
        L_0x0278:
            java.lang.String r14 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getProcessName()
            boolean r0 = bp3.C79755l.m96891a(r6)
            if (r0 == 0) goto L_0x0283
            goto L_0x02e7
        L_0x0283:
            java.util.concurrent.locks.Lock r0 = bp3.C79755l.f233757f     // Catch:{ all -> 0x02c9 }
            r0.lock()     // Catch:{ all -> 0x02c9 }
            java.util.Set<java.lang.Object> r1 = bp3.C79755l.f233753b     // Catch:{ all -> 0x02c9 }
            java.util.HashSet r1 = (java.util.HashSet) r1     // Catch:{ all -> 0x02c9 }
            boolean r1 = r1.contains(r6)     // Catch:{ all -> 0x02c9 }
            if (r1 == 0) goto L_0x02c5
            java.util.Set<java.lang.Object> r1 = bp3.C79755l.f233754c     // Catch:{ all -> 0x02c9 }
            java.util.HashSet r1 = (java.util.HashSet) r1     // Catch:{ all -> 0x02c9 }
            boolean r1 = r1.contains(r6)     // Catch:{ all -> 0x02c9 }
            if (r1 == 0) goto L_0x02c5
            java.util.Set<java.lang.Object> r1 = bp3.C79755l.f233755d     // Catch:{ all -> 0x02c9 }
            java.util.HashSet r1 = (java.util.HashSet) r1     // Catch:{ all -> 0x02c9 }
            boolean r1 = r1.contains(r6)     // Catch:{ all -> 0x02c9 }
            if (r1 != 0) goto L_0x02a7
            goto L_0x02c5
        L_0x02a7:
            com.tencent.mm.sdk.platformtools.PeriodRecorder r1 = bp3.C79755l.f233752a     // Catch:{ all -> 0x02c9 }
            java.lang.String r7 = "reportMissingAllNewXmlHandlerOnDemand"
            boolean r1 = r1.isExpired(r7)     // Catch:{ all -> 0x02c9 }
            if (r1 == 0) goto L_0x02c5
            r1 = 11001(0x2af9, float:1.5416E-41)
            java.lang.String r7 = "%s;%s"
            java.lang.Object[] r8 = new java.lang.Object[r2]     // Catch:{ all -> 0x02c9 }
            java.lang.String r9 = "<AllNewXmlHandler>"
            r8[r4] = r9     // Catch:{ all -> 0x02c9 }
            r8[r5] = r6     // Catch:{ all -> 0x02c9 }
            java.lang.String r7 = java.lang.String.format(r7, r8)     // Catch:{ all -> 0x02c9 }
            bp3.C79755l.m96892b(r1, r14, r7)     // Catch:{ all -> 0x02c9 }
        L_0x02c5:
            r0.unlock()
            goto L_0x02e7
        L_0x02c9:
            r0 = move-exception
            java.lang.String r1 = "MicroMsg.MissingMessageListenerReporter"
            java.lang.String r7 = "fail to call reportMissingISysCmdMsgNewXmlListener(%s,%s)"
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ all -> 0x02dd }
            r2[r4] = r14     // Catch:{ all -> 0x02dd }
            r2[r5] = r6     // Catch:{ all -> 0x02dd }
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r1, r0, r7, r2)     // Catch:{ all -> 0x02dd }
            java.util.concurrent.locks.Lock r14 = bp3.C79755l.f233757f
            r14.unlock()
            goto L_0x02e7
        L_0x02dd:
            r14 = move-exception
            java.util.concurrent.locks.Lock r0 = bp3.C79755l.f233757f
            r0.unlock()
            throw r14
        L_0x02e4:
            r14 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x02e4 }
            throw r14
        L_0x02e7:
            return r3
        L_0x02e8:
            java.lang.String r14 = "MicroMsg.SysCmdMsgExtension"
            java.lang.String r0 = "msgContent not start with <sysmsg or <appmsg"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r14, r0)
            return r3
        L_0x02f0:
            te3.rv3 r1 = r0.f227628e
            java.lang.String r1 = sf0.C48374j0.m53718g(r1)
            r13.mo120965B(r1, r14, r4)
            kj2.d r14 = kj2.C117407d.INSTANCE
            r1 = 10395(0x289b, float:1.4566E-41)
            long r4 = r0.f227638r
            java.lang.String r0 = java.lang.String.valueOf(r4)
            r14.kvStat(r1, r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: eb0.C86497v5.mo56403Fg(ob0.m$a):ob0.m$b");
    }

    /* renamed from: O */
    public void mo120967O(String str, C75706q0 q0Var) {
        List list;
        if (!Util.isNullOrNil(str) && q0Var != null) {
            synchronized (this.f251323f) {
                list = (List) ((HashMap) this.f251323f).get(str);
            }
            if (list != null) {
                synchronized (list) {
                    list.remove(q0Var);
                }
            }
        }
    }

    @Deprecated
    /* renamed from: d */
    public void mo120968d(String str, C86498c cVar, boolean z) {
        List list;
        if (!Util.isNullOrNil(str) && cVar != null) {
            Map<String, List<C86498c>> map = z ? this.f251322e : this.f251321d;
            synchronized (map) {
                list = map.get(str);
                if (list == null) {
                    list = new LinkedList();
                    map.put(str, list);
                }
            }
            synchronized (list) {
                if (!list.contains(cVar)) {
                    list.add(cVar);
                }
            }
        }
    }

    /* renamed from: ld */
    public void mo56404ld(C35136m.C35138c cVar) {
        String str;
        List<C86498c> list;
        boolean z;
        if (cVar != null && (str = cVar.f94253d) != null) {
            Log.m105925i("MicroMsg.SysCmdMsgExtension", "delete subType:%s, msgId:%s", str, cVar.f94254e);
            String str2 = cVar.f94253d;
            Map<String, List<C86498c>> map = this.f251322e;
            synchronized (map) {
                list = (List) ((HashMap) map).get(str2);
            }
            C38166b.C38167a aVar = (C38166b.C38167a) C38166b.m41759f(C31521b.class);
            if (list == null || list.isEmpty()) {
                Iterator<C38174i<T>> it = aVar.f100837d.all().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z = false;
                        break;
                    }
                    if (C38166b.m41757d(C38166b.f100836c, it.next())) {
                        z = true;
                        break;
                    }
                }
                if (!z) {
                    Log.m105928w("MicroMsg.SysCmdMsgExtension", "listener list is empty, return now");
                    return;
                }
            }
            C38166b.C38167a.C38169b bVar = new C38166b.C38167a.C38169b(aVar, aVar.f100837d.all().iterator());
            while (bVar.hasNext()) {
                C38174i iVar = (C38174i) bVar.next();
                if (iVar.hasNoKeys() || iVar.hasKey(str2)) {
                    C31521b bVar2 = (C31521b) iVar.get();
                    if (bVar2 != null) {
                        bVar2.mo9065C1(cVar);
                    } else {
                        Log.m105921e("MicroMsg.SysCmdMsgExtension", "%s returns null, skip notifying.", iVar);
                    }
                }
            }
            Log.m105925i("MicroMsg.SysCmdMsgExtension", "listener list size is %d", Integer.valueOf(list.size()));
            for (C86498c C1 : list) {
                C1.mo23909C1(cVar);
            }
        }
    }

    /* renamed from: nA */
    public /* synthetic */ boolean mo56405nA(C67046a aVar, String str, long j, String str2, String str3, String str4, int i, String str5, String str6, String str7, int i2) {
        return false;
    }

    /* renamed from: q */
    public void mo120969q(String str, C75706q0 q0Var) {
        List list;
        if (!Util.isNullOrNil(str) && q0Var != null) {
            synchronized (this.f251323f) {
                list = (List) ((HashMap) this.f251323f).get(str);
                if (list == null) {
                    list = new LinkedList();
                    ((HashMap) this.f251323f).put(str, list);
                }
            }
            synchronized (list) {
                if (!list.contains(q0Var)) {
                    list.add(q0Var);
                }
            }
        }
    }
}
