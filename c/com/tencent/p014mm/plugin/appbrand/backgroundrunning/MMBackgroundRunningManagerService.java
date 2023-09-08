package com.tencent.p014mm.plugin.appbrand.backgroundrunning;

import android.app.NotificationManager;
import android.content.Context;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.autogen.events.VoipEvent;
import com.tencent.p014mm.ipcinvoker.C80907o;
import com.tencent.p014mm.ipcinvoker.C80936x;
import com.tencent.p014mm.plugin.appbrand.app.C81161g2;
import com.tencent.p014mm.plugin.appbrand.backgroundrunning.C81591s;
import com.tencent.p014mm.plugin.appbrand.ipc.C81964j;
import com.tencent.p014mm.plugin.appbrand.task.AppBrandProcessesManager;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.PhoneStatusWatcher;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86301e;
import di3.C86312j;
import ei3.C86522b;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import p646pn.C110234e;

@C86522b(dependencies = {C81161g2.class}, onProcess = {C80625v0.MATCH_MM})
/* renamed from: com.tencent.mm.plugin.appbrand.backgroundrunning.MMBackgroundRunningManagerService */
public class MMBackgroundRunningManagerService extends C86301e implements C81591s {

    /* renamed from: i */
    public static NotificationManager f239234i;

    /* renamed from: d */
    public LinkedHashMap<String, AppBrandBackgroundRunningApp> f239235d;

    /* renamed from: e */
    public final HashSet<C81591s.C81592a> f239236e = new HashSet<>();

    /* renamed from: f */
    public List<C81575b> f239237f;

    /* renamed from: g */
    public final PhoneStatusWatcher.PhoneCallListener f239238g = new C81574a();

    /* renamed from: h */
    public IListener<VoipEvent> f239239h = new IListener<VoipEvent>(C40008f.f107254d) {
        {
            this.__eventId = -797557590;
        }

        public boolean callback(IEvent iEvent) {
            VoipEvent voipEvent = (VoipEvent) iEvent;
            if (voipEvent != null) {
                Log.m105925i("MicroMsg.MMBackgroundRunningManagerService", "receive VoipEvent:[%s, %s]", Integer.valueOf(voipEvent.f194019d.f194026f), Integer.valueOf(voipEvent.f194019d.f194022b));
                int i = voipEvent.f194019d.f194022b;
                if (i == 7 || i == 3) {
                    MMBackgroundRunningManagerService.this.B20();
                    MMBackgroundRunningManagerService.this.Vd0();
                }
            }
            return false;
        }
    };

    /* renamed from: com.tencent.mm.plugin.appbrand.backgroundrunning.MMBackgroundRunningManagerService$a */
    public class C81574a implements PhoneStatusWatcher.PhoneCallListener {
        public C81574a() {
        }

        public void onPhoneCall(int i) {
            if (i == 1 || i == 2) {
                Log.m105925i("MicroMsg.MMBackgroundRunningManagerService", "onPhoneCall, kill voip, state:%s", Integer.valueOf(i));
                MMBackgroundRunningManagerService.this.B20();
                MMBackgroundRunningManagerService.this.Vd0();
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.backgroundrunning.MMBackgroundRunningManagerService$b */
    public final class C81575b implements C80936x {

        /* renamed from: a */
        public final String f239242a;

        public C81575b(String str) {
            this.f239242a = str;
        }

        /* renamed from: a */
        public void mo112721a() {
            Log.m105925i("MicroMsg.MMBackgroundRunningManagerService", "onDisconnected, process:%s", this.f239242a);
            AppBrandBackgroundRunningOperationParcel appBrandBackgroundRunningOperationParcel = new AppBrandBackgroundRunningOperationParcel();
            appBrandBackgroundRunningOperationParcel.f239230o = this.f239242a;
            appBrandBackgroundRunningOperationParcel.f239225g = 3;
            MMBackgroundRunningManagerService.this.mo113852MI(appBrandBackgroundRunningOperationParcel);
        }
    }

    public void B20() {
        Iterator it = ((ArrayList) mo113854fA()).iterator();
        while (it.hasNext()) {
            MMBackgroundRunningOperationParcel mMBackgroundRunningOperationParcel = new MMBackgroundRunningOperationParcel();
            mMBackgroundRunningOperationParcel.f239244d = ((AppBrandBackgroundRunningApp) it.next()).f239207d;
            mMBackgroundRunningOperationParcel.f239245e = 20;
            mMBackgroundRunningOperationParcel.f239246f = 2;
            wx0(mMBackgroundRunningOperationParcel);
        }
    }

    /* renamed from: BZ */
    public void mo113850BZ(C81591s.C81592a aVar) {
        if (aVar != null) {
            synchronized (this.f239236e) {
                this.f239236e.add(aVar);
            }
        }
    }

    public void Bp0(C81591s.C81592a aVar) {
        if (aVar != null) {
            synchronized (this.f239236e) {
                this.f239236e.remove(aVar);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:67:0x01fd  */
    /* JADX WARNING: Removed duplicated region for block: B:86:? A[RETURN, SYNTHETIC] */
    /* renamed from: MI */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo113852MI(com.tencent.p014mm.plugin.appbrand.backgroundrunning.AppBrandBackgroundRunningOperationParcel r13) {
        /*
            r12 = this;
            if (r13 == 0) goto L_0x0222
            java.lang.String r0 = "MicroMsg.MMBackgroundRunningManagerService"
            java.lang.String r1 = "receiveOperation in MM process, operation:%s"
            r2 = 1
            java.lang.Object[] r3 = new java.lang.Object[r2]
            r4 = 0
            r3[r4] = r13
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r1, r3)
            java.util.LinkedHashMap<java.lang.String, com.tencent.mm.plugin.appbrand.backgroundrunning.AppBrandBackgroundRunningApp> r0 = r12.f239235d
            if (r0 != 0) goto L_0x0021
            java.lang.String r0 = "MicroMsg.MMBackgroundRunningManagerService"
            java.lang.String r1 = "receiveOperation in MM process, operation:%s, mBackgroundRunningApps==null"
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r4] = r13
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r0, r1, r2)
            return
        L_0x0021:
            java.lang.String r1 = r13.f239226h
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r1 != 0) goto L_0x003c
            java.lang.String r1 = r13.f239226h
            java.lang.String r3 = "AppBrandPluginUI"
            boolean r1 = r1.endsWith(r3)
            if (r1 == 0) goto L_0x003c
            java.lang.String r13 = "MicroMsg.MMBackgroundRunningManagerService"
            java.lang.String r0 = "receiveOperation, ignore fake native mini program"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r13, r0)
            return
        L_0x003c:
            int r1 = r13.f239225g
            r3 = 3
            r5 = 2
            if (r1 != r3) goto L_0x010c
            java.lang.String r1 = r13.f239230o
            boolean r6 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r6 != 0) goto L_0x0102
            java.util.Set r6 = r0.entrySet()
            java.util.Iterator r6 = r6.iterator()
            r7 = 0
        L_0x0053:
            boolean r8 = r6.hasNext()
            if (r8 == 0) goto L_0x00ff
            java.lang.Object r8 = r6.next()
            java.util.Map$Entry r8 = (java.util.Map.Entry) r8
            java.lang.Object r8 = r8.getValue()
            com.tencent.mm.plugin.appbrand.backgroundrunning.AppBrandBackgroundRunningApp r8 = (com.tencent.p014mm.plugin.appbrand.backgroundrunning.AppBrandBackgroundRunningApp) r8
            java.lang.String r9 = r8.f239214n
            boolean r9 = r1.equalsIgnoreCase(r9)
            if (r9 == 0) goto L_0x0053
            java.lang.String r7 = r13.f239226h
            boolean r7 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r7)
            if (r7 == 0) goto L_0x0079
            java.lang.String r7 = r8.f239213j
            r13.f239226h = r7
        L_0x0079:
            int r7 = r13.f239224f
            int r9 = r8.f239209f
            r7 = r7 | r9
            r13.f239224f = r7
            java.lang.String r7 = r8.f239207d
            r13.f239222d = r7
            int r9 = r8.f239208e
            r13.f239223e = r9
            r0.remove(r7)
            java.lang.String r7 = "MicroMsg.MMBackgroundRunningManagerService"
            java.lang.String r9 = "receiveOperation, operation kill process:%s, app:%s"
            java.lang.Object[] r10 = new java.lang.Object[r5]
            r10[r4] = r1
            java.lang.String r11 = r8.f239207d
            r10[r2] = r11
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r9, r10)
            java.lang.String r7 = r8.f239215o
            boolean r7 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r7)
            if (r7 != 0) goto L_0x00fc
            java.lang.String r7 = r8.f239215o
            java.lang.Class r7 = com.tencent.p014mm.plugin.appbrand.backgroundrunning.C81584k.m100071a(r7)
            java.lang.String r9 = "MicroMsg.MMBackgroundRunningManagerService"
            if (r7 != 0) goto L_0x00b9
            java.lang.Object[] r7 = new java.lang.Object[r2]
            java.lang.String r8 = r8.f239207d
            r7[r4] = r8
            java.lang.String r8 = "cancelCustomNotificationFallback for %s, customNotificationLogicClass is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r9, r8, r7)
            goto L_0x00fc
        L_0x00b9:
            java.lang.String r10 = r8.f239207d
            com.tencent.mm.plugin.appbrand.AppBrandRuntimeWC r10 = com.tencent.p014mm.plugin.appbrand.C81682d.m100222b(r10)
            if (r10 != 0) goto L_0x00cd
            java.lang.Object[] r7 = new java.lang.Object[r2]
            java.lang.String r8 = r8.f239207d
            r7[r4] = r8
            java.lang.String r8 = "cancelCustomNotificationFallback for %s, runtime is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r9, r8, r7)
            goto L_0x00fc
        L_0x00cd:
            com.tencent.mm.plugin.appbrand.jsapi.n r7 = r10.mo113032U(r7)
            com.tencent.mm.plugin.appbrand.backgroundrunning.CustomBackgroundRunningNotificationLogic r7 = (com.tencent.p014mm.plugin.appbrand.backgroundrunning.CustomBackgroundRunningNotificationLogic) r7
            if (r7 != 0) goto L_0x00e1
            java.lang.Object[] r7 = new java.lang.Object[r2]
            java.lang.String r8 = r8.f239207d
            r7[r4] = r8
            java.lang.String r8 = "cancelCustomNotificationFallback for %s, customNotificationLogic is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r9, r8, r7)
            goto L_0x00fc
        L_0x00e1:
            android.app.NotificationManager r8 = f239234i
            if (r8 != 0) goto L_0x00f3
            android.content.Context r8 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            java.lang.String r9 = "notification"
            java.lang.Object r8 = r8.getSystemService(r9)
            android.app.NotificationManager r8 = (android.app.NotificationManager) r8
            f239234i = r8
        L_0x00f3:
            android.app.NotificationManager r8 = f239234i
            int r7 = r7.mo113825d()
            r8.cancel(r7)
        L_0x00fc:
            r7 = 3
            goto L_0x0053
        L_0x00ff:
            r2 = r7
            goto L_0x01fb
        L_0x0102:
            java.lang.String r0 = "MicroMsg.MMBackgroundRunningManagerService"
            java.lang.String r1 = "receiveOperation, operation kill, no process"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
            goto L_0x01fa
        L_0x010c:
            java.lang.String r1 = r13.f239222d
            java.lang.Object r1 = r0.get(r1)
            com.tencent.mm.plugin.appbrand.backgroundrunning.AppBrandBackgroundRunningApp r1 = (com.tencent.p014mm.plugin.appbrand.backgroundrunning.AppBrandBackgroundRunningApp) r1
            if (r1 == 0) goto L_0x01a9
            int r6 = r13.f239225g
            if (r6 != r2) goto L_0x014c
            int r0 = r1.f239209f
            int r3 = r13.f239224f
            boolean r0 = com.tencent.p014mm.plugin.appbrand.backgroundrunning.C81583j.m100070b(r0, r3)
            if (r0 != 0) goto L_0x0142
            int r0 = r1.f239209f
            int r3 = r13.f239224f
            r0 = r0 | r3
            r1.f239209f = r0
            java.lang.String r0 = "MicroMsg.MMBackgroundRunningManagerService"
            java.lang.String r1 = "receiveOperation, app(%s) add new usage(%s)"
            java.lang.Object[] r6 = new java.lang.Object[r5]
            java.lang.String r7 = r13.f239222d
            r6[r4] = r7
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r6[r2] = r3
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r1, r6)
            r2 = 2
            goto L_0x01fb
        L_0x0142:
            java.lang.String r0 = "MicroMsg.MMBackgroundRunningManagerService"
            java.lang.String r1 = "receiveOperation, this app has been added before, but now it wants to add a same usage!!!"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r0, r1)
            goto L_0x01fa
        L_0x014c:
            if (r6 != r5) goto L_0x01fa
            int r6 = r1.f239209f
            int r7 = r13.f239224f
            boolean r6 = com.tencent.p014mm.plugin.appbrand.backgroundrunning.C81583j.m100070b(r6, r7)
            if (r6 == 0) goto L_0x01a0
            r6 = 4
            int r7 = r1.f239208e
            r13.f239223e = r7
            int r7 = r1.f239209f
            int r8 = r13.f239224f
            int r9 = ~r8
            r7 = r7 & r9
            r1.f239209f = r7
            java.lang.String r7 = "MicroMsg.MMBackgroundRunningManagerService"
            java.lang.String r9 = "receiveOperation, app(%s) remove usage(%s)"
            java.lang.Object[] r5 = new java.lang.Object[r5]
            java.lang.String r10 = r13.f239222d
            r5[r4] = r10
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r5[r2] = r8
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r9, r5)
            int r5 = r1.f239209f
            if (r5 != 0) goto L_0x019e
            java.lang.String r5 = r13.f239226h
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r5)
            if (r5 == 0) goto L_0x0189
            java.lang.String r1 = r1.f239213j
            r13.f239226h = r1
        L_0x0189:
            java.lang.String r1 = r13.f239222d
            r0.remove(r1)
            java.lang.String r0 = "MicroMsg.MMBackgroundRunningManagerService"
            java.lang.String r1 = "receiveOperation, app(%s) has been removed"
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.String r5 = r13.f239222d
            r2[r4] = r5
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r1, r2)
            r2 = 3
            goto L_0x01fb
        L_0x019e:
            r2 = 4
            goto L_0x01fb
        L_0x01a0:
            java.lang.String r0 = "MicroMsg.MMBackgroundRunningManagerService"
            java.lang.String r1 = "receiveOperation, this app has been added before, but now it wants to remove not added usage!!!"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r0, r1)
            goto L_0x01fa
        L_0x01a9:
            int r1 = r13.f239225g
            if (r1 != r2) goto L_0x01f0
            com.tencent.mm.plugin.appbrand.backgroundrunning.AppBrandBackgroundRunningApp r1 = new com.tencent.mm.plugin.appbrand.backgroundrunning.AppBrandBackgroundRunningApp
            r1.<init>()
            java.lang.String r3 = r13.f239222d
            r1.f239207d = r3
            int r6 = r13.f239223e
            r1.f239208e = r6
            int r6 = r13.f239224f
            r1.f239209f = r6
            java.lang.String r6 = r13.f239227i
            r1.f239211h = r6
            java.lang.String r6 = r13.f239228j
            r1.f239210g = r6
            java.lang.String r6 = r13.f239229n
            r1.f239212i = r6
            java.lang.String r6 = r13.f239226h
            r1.f239213j = r6
            java.lang.String r6 = r13.f239230o
            r1.f239214n = r6
            java.lang.String r6 = r13.f239232q
            r1.f239215o = r6
            r0.put(r3, r1)
            java.lang.String r0 = "MicroMsg.MMBackgroundRunningManagerService"
            java.lang.String r1 = "receiveOperation, add app(%s) with usage(%s)"
            java.lang.Object[] r3 = new java.lang.Object[r5]
            java.lang.String r5 = r13.f239222d
            r3[r4] = r5
            int r4 = r13.f239224f
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r3[r2] = r4
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r1, r3)
            goto L_0x01fb
        L_0x01f0:
            if (r1 != r5) goto L_0x01fa
            java.lang.String r0 = "MicroMsg.MMBackgroundRunningManagerService"
            java.lang.String r1 = "receiveOperation, this app has not been added before, but now it wants to remove some usage!!!"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r0, r1)
        L_0x01fa:
            r2 = 0
        L_0x01fb:
            if (r2 == 0) goto L_0x0222
            java.util.HashSet<com.tencent.mm.plugin.appbrand.backgroundrunning.s$a> r0 = r12.f239236e
            monitor-enter(r0)
            java.util.List r1 = r12.mo113854fA()     // Catch:{ all -> 0x021f }
            java.util.HashSet<com.tencent.mm.plugin.appbrand.backgroundrunning.s$a> r3 = r12.f239236e     // Catch:{ all -> 0x021f }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ all -> 0x021f }
        L_0x020a:
            boolean r4 = r3.hasNext()     // Catch:{ all -> 0x021f }
            if (r4 == 0) goto L_0x021a
            java.lang.Object r4 = r3.next()     // Catch:{ all -> 0x021f }
            com.tencent.mm.plugin.appbrand.backgroundrunning.s$a r4 = (com.tencent.p014mm.plugin.appbrand.backgroundrunning.C81591s.C81592a) r4     // Catch:{ all -> 0x021f }
            r4.mo113864P(r1, r13, r2)     // Catch:{ all -> 0x021f }
            goto L_0x020a
        L_0x021a:
            r12.vx0(r1)     // Catch:{ all -> 0x021f }
            monitor-exit(r0)     // Catch:{ all -> 0x021f }
            goto L_0x0222
        L_0x021f:
            r13 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x021f }
            throw r13
        L_0x0222:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.backgroundrunning.MMBackgroundRunningManagerService.mo113852MI(com.tencent.mm.plugin.appbrand.backgroundrunning.AppBrandBackgroundRunningOperationParcel):void");
    }

    public void Vd0() {
        Iterator it = ((ArrayList) mo113854fA()).iterator();
        while (it.hasNext()) {
            MMBackgroundRunningOperationParcel mMBackgroundRunningOperationParcel = new MMBackgroundRunningOperationParcel();
            mMBackgroundRunningOperationParcel.f239244d = ((AppBrandBackgroundRunningApp) it.next()).f239207d;
            mMBackgroundRunningOperationParcel.f239245e = 8;
            mMBackgroundRunningOperationParcel.f239246f = 2;
            wx0(mMBackgroundRunningOperationParcel);
        }
    }

    /* renamed from: fA */
    public List<AppBrandBackgroundRunningApp> mo113854fA() {
        LinkedHashMap<String, AppBrandBackgroundRunningApp> linkedHashMap = this.f239235d;
        return linkedHashMap == null ? new ArrayList() : new ArrayList(linkedHashMap.values());
    }

    public void onAccountInitialized(Context context) {
        Log.m105924i("MicroMsg.MMBackgroundRunningManagerService", "onRegister MMBackgroundRunningManagerService");
        ((PhoneStatusWatcher) C86312j.m106911c(PhoneStatusWatcher.class)).addPhoneCallListener(this.f239238g);
        this.f239235d = new LinkedHashMap<>();
        Class cls = C81591s.class;
        Log.m105924i("MicroMsg.AppBrandForegroundNotificationManager", "startListening");
        if (C81589m.f239259a == null) {
            C81589m.f239259a = new C81588l();
        }
        if (C86312j.m106916h(cls)) {
            ((C81591s) C86312j.m106911c(cls)).mo113850BZ(C81589m.f239259a);
        }
        if (this.f239237f == null) {
            this.f239237f = new ArrayList();
            for (String bVar : AppBrandProcessesManager.f246131g.mo116963b()) {
                ((ArrayList) this.f239237f).add(new C81575b(bVar));
            }
        }
        Iterator it = ((ArrayList) this.f239237f).iterator();
        while (it.hasNext()) {
            C81575b bVar2 = (C81575b) it.next();
            C80907o.m98779b(bVar2.f239242a, bVar2);
        }
        mo113850BZ((C81591s.C81592a) ((C110234e) C86312j.m106911c(C110234e.class)).Ic0());
        this.f239239h.alive();
    }

    public void onAccountReleased(Context context) {
        Log.m105924i("MicroMsg.MMBackgroundRunningManagerService", "onUnregister MMBackgroundRunningManagerService");
        B20();
        ((PhoneStatusWatcher) C86312j.m106911c(PhoneStatusWatcher.class)).removePhoneCallListener(this.f239238g);
        Class cls = C81591s.class;
        Log.m105924i("MicroMsg.AppBrandForegroundNotificationManager", "stopListening");
        if (C81589m.f239259a != null) {
            if (C86312j.m106916h(cls)) {
                ((C81591s) C86312j.m106911c(cls)).Bp0(C81589m.f239259a);
            }
            C81589m.f239259a = null;
        }
        Iterator it = ((ArrayList) this.f239237f).iterator();
        while (it.hasNext()) {
            C80907o.m98787j(MMApplicationContext.getMainProcessName(), (C81575b) it.next());
        }
        this.f239237f = null;
        Bp0((C81591s.C81592a) ((C110234e) C86312j.m106911c(C110234e.class)).Ic0());
        this.f239239h.dead();
        this.f239236e.clear();
        try {
            this.f239235d.clear();
        } catch (ConcurrentModificationException unused) {
        }
        this.f239235d = null;
    }

    public final void vx0(List<AppBrandBackgroundRunningApp> list) {
        String str;
        if (list == null || list.isEmpty()) {
            str = null;
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append(String.valueOf(list.size()));
            sb.append("|");
            Iterator<AppBrandBackgroundRunningApp> it = list.iterator();
            sb.append(it.next().f239207d);
            while (it.hasNext()) {
                sb.append("#");
                sb.append(it.next().f239207d);
            }
            str = sb.toString();
        }
        String str2 = str;
        Log.m105925i("MicroMsg.MMBackgroundRunningManagerService", "report background running app list changed, note:%s", str2);
        C29452i.m38741a((String) null, 0, System.currentTimeMillis(), 6, str2, 0);
    }

    public void wx0(MMBackgroundRunningOperationParcel mMBackgroundRunningOperationParcel) {
        if (mMBackgroundRunningOperationParcel != null && !Util.isNullOrNil(mMBackgroundRunningOperationParcel.f239244d)) {
            Log.m105925i("MicroMsg.MMBackgroundRunningManagerService", "sendOperation from MM process, operation:%s", mMBackgroundRunningOperationParcel);
            C81964j.m100679b(mMBackgroundRunningOperationParcel.f239244d, mMBackgroundRunningOperationParcel);
        }
    }
}
