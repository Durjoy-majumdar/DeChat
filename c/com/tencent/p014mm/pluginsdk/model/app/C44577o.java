package com.tencent.p014mm.pluginsdk.model.app;

import android.os.Looper;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import f40.C86709a0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Vector;
import ld2.C46848g;
import md2.C47000b;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import ob0.C89132b;
import ob0.C89147n0;
import sf0.C48374j0;
import te3.C50081k5;
import te3.C50216l5;
import te3.C51018qv3;

/* renamed from: com.tencent.mm.pluginsdk.model.app.o */
public class C44577o implements C44583u0, C11385n {

    /* renamed from: d */
    public Map<String, Integer> f120875d = null;

    /* renamed from: e */
    public List<String> f120876e;

    /* renamed from: f */
    public List<String> f120877f;

    /* renamed from: g */
    public volatile boolean f120878g = false;

    /* renamed from: h */
    public MTimerHandler f120879h = new MTimerHandler(Looper.getMainLooper(), (MTimerHandler.CallBack) new C44578a(), false);

    /* renamed from: com.tencent.mm.pluginsdk.model.app.o$a */
    public class C44578a implements MTimerHandler.CallBack {
        public C44578a() {
        }

        public boolean onTimerExpired() {
            ((HashMap) C44577o.this.f120875d).clear();
            return false;
        }
    }

    public C44577o() {
        new ArrayList();
        new ArrayList();
        this.f120875d = new HashMap();
        this.f120876e = new Vector();
        this.f120877f = new ArrayList();
        this.f120879h.startTimer(600000);
        C44552f yx02 = C46848g.yx0();
        yx02.getClass();
        MMHandlerThread.postToMainThread(new C44554g(yx02, 7, this));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0047, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo69365a(java.lang.String r5) {
        /*
            r4 = this;
            monitor-enter(r4)
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r5)     // Catch:{ all -> 0x0048 }
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L_0x003a
            java.util.List<java.lang.String> r0 = r4.f120876e     // Catch:{ all -> 0x0048 }
            java.util.Vector r0 = (java.util.Vector) r0     // Catch:{ all -> 0x0048 }
            boolean r0 = r0.contains(r5)     // Catch:{ all -> 0x0048 }
            if (r0 != 0) goto L_0x003a
            boolean r0 = r4.mo69368d(r5)     // Catch:{ all -> 0x0048 }
            if (r0 != 0) goto L_0x0027
            java.lang.String r0 = "MicroMsg.AppInfoService"
            java.lang.String r3 = "this app has reach the max retry count, appid is %s"
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ all -> 0x0048 }
            r2[r1] = r5     // Catch:{ all -> 0x0048 }
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r0, r3, r2)     // Catch:{ all -> 0x0048 }
            monitor-exit(r4)
            return
        L_0x0027:
            java.lang.String r0 = "MicroMsg.AppInfoService"
            java.lang.String r3 = "add appid:[%s]"
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ all -> 0x0048 }
            r2[r1] = r5     // Catch:{ all -> 0x0048 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r3, r2)     // Catch:{ all -> 0x0048 }
            java.util.List<java.lang.String> r0 = r4.f120876e     // Catch:{ all -> 0x0048 }
            java.util.Vector r0 = (java.util.Vector) r0     // Catch:{ all -> 0x0048 }
            r0.add(r5)     // Catch:{ all -> 0x0048 }
            goto L_0x0046
        L_0x003a:
            java.lang.String r0 = "MicroMsg.AppInfoService"
            java.lang.String r3 = "should not add this appid:[%s], it is already runing"
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ all -> 0x0048 }
            r2[r1] = r5     // Catch:{ all -> 0x0048 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r3, r2)     // Catch:{ all -> 0x0048 }
        L_0x0046:
            monitor-exit(r4)
            return
        L_0x0048:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.pluginsdk.model.app.C44577o.mo69365a(java.lang.String):void");
    }

    /* renamed from: b */
    public void mo69366b(LinkedList<String> linkedList) {
        if (linkedList == null || linkedList.size() == 0) {
            Log.m105920e("MicroMsg.AppInfoService", "batch push appinfo err: null or nil applist");
            return;
        }
        Iterator<String> it = linkedList.iterator();
        while (it.hasNext()) {
            mo69365a(it.next());
        }
        mo69370f();
    }

    /* renamed from: c */
    public C44561j mo69367c(String str, long j) {
        if (!(str == null || str.length() == 0)) {
            LinkedList linkedList = new LinkedList();
            linkedList.add(str);
            C44553f1 f1Var = new C44553f1(linkedList);
            C47350c.C47352b bVar = new C47350c.C47352b();
            bVar.f127066a = new C50081k5();
            bVar.f127067b = new C50216l5();
            bVar.f127068c = "/cgi-bin/micromsg-bin/appcenter";
            bVar.f127069d = 452;
            bVar.f127070e = 0;
            bVar.f127071f = 0;
            C47350c a = bVar.mo72403a();
            C50081k5 k5Var = (C50081k5) a.f127055a.f127080a;
            byte[] c = f1Var.mo69339c();
            if (c != null) {
                C51018qv3 qv32 = new C51018qv3();
                qv32.mo73350k(c);
                k5Var.f136558e = qv32;
            }
            k5Var.f136557d = 7;
            C89132b.C89134c b = C89147n0.m111435b(a, j);
            if (b == null) {
                Log.m105920e("MicroMsg.AppInfoService", "getSync resp == null");
                return null;
            }
            Log.m105921e("MicroMsg.AppInfoService", "call getAppInfoList cgi result, errType = %d, errCode = %d", Integer.valueOf(b.f256793a), Integer.valueOf(b.f256794b));
            if (b.f256793a == 0 && b.f256794b == 0) {
                f1Var.mo69337a(C48374j0.m53715d(((C50216l5) b.f256796d).f137180d));
                f1Var.onGYNetEnd(0, b.f256793a, b.f256794b, b.f256795c, a, new byte[0]);
                C47000b a2 = C47000b.C34548a.m40384a();
                if (a2 != null) {
                    return a2.getAppInfo(str);
                }
                Log.m105920e("MicroMsg.AppInfoService", "getISubCorePluginBase() == null");
                return null;
            }
        }
        return null;
    }

    /* renamed from: c3 */
    public void mo69343c3(int i, int i2, String str, C44549d1 d1Var) {
        if (d1Var.mo69338b() != 7) {
            Log.m105918d("MicroMsg.AppInfoService", "not the getappinfolist scene, ignore");
            return;
        }
        synchronized (this) {
            List<String> list = this.f120877f;
            if (list != null && !((ArrayList) list).isEmpty()) {
                ((Vector) this.f120876e).removeAll(this.f120877f);
                ((ArrayList) this.f120877f).clear();
            }
        }
        this.f120878g = false;
        mo69370f();
    }

    /* renamed from: d */
    public final boolean mo69368d(String str) {
        if (str == null) {
            Log.m105920e("MicroMsg.AppInfoService", "increaseCounter fail, appId is null");
            return false;
        }
        Integer valueOf = Integer.valueOf(Util.nullAs((Integer) ((HashMap) this.f120875d).get(str), 0));
        if (valueOf.intValue() >= 5) {
            Log.m105920e("MicroMsg.AppInfoService", "increaseCounter fail, has reached the max try count");
            return false;
        }
        ((HashMap) this.f120875d).put(str, Integer.valueOf(valueOf.intValue() + 1));
        return true;
    }

    /* renamed from: e */
    public void mo69369e(String str) {
        if (str == null || str.length() == 0) {
            Log.m105920e("MicroMsg.AppInfoService", "push fail, appId is null");
            return;
        }
        Log.m105924i("MicroMsg.AppInfoService", "push appid : " + str);
        mo69365a(str);
        mo69370f();
    }

    /* renamed from: f */
    public final void mo69370f() {
        if (this.f120878g) {
            Log.m105918d("MicroMsg.AppInfoService", " batch get appinfo doing now");
            return;
        }
        List<String> list = this.f120876e;
        if (list == null || ((Vector) list).isEmpty()) {
            Log.m105918d("MicroMsg.AppInfoService", "batchwaitinglist is empty, no need to doscene");
            return;
        }
        int size = ((Vector) this.f120876e).size();
        if (size > 20) {
            size = 20;
        }
        synchronized (this) {
            ((ArrayList) this.f120877f).addAll(((Vector) this.f120876e).subList(0, size));
        }
        List<String> list2 = this.f120877f;
        if (list2 != null && !((ArrayList) list2).isEmpty()) {
            this.f120878g = true;
            C86709a0.m107529k().f251779b.mo123460f(new C44551e1(7, new C44553f1(this.f120877f)));
        }
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        int type = yVar.getType();
        if (type != 451) {
            Log.m105920e("MicroMsg.AppInfoService", "error type: " + type);
            return;
        }
        synchronized (this) {
            List<String> list = this.f120877f;
            if (list != null && !((ArrayList) list).isEmpty()) {
                ((Vector) this.f120876e).removeAll(this.f120877f);
                ((ArrayList) this.f120877f).clear();
            }
        }
        this.f120878g = false;
        mo69370f();
    }
}
