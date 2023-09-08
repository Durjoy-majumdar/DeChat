package ep3;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import hp3.C98494b;
import java.util.concurrent.ConcurrentHashMap;
import jp3.C46566c;
import jp3.C9486a;
import jp3.C9487b;
import junit.framework.Assert;
import kp3.C88253a;

/* renamed from: ep3.c */
public class C97688c implements C9487b {

    /* renamed from: d */
    public C97686b f286532d = C97686b.f286528d;

    /* renamed from: e */
    public C97683a f286533e;

    /* renamed from: f */
    public C98494b<? extends C97683a> f286534f;

    /* renamed from: g */
    public C46566c f286535g = new C46566c();

    /* renamed from: a */
    public synchronized C97683a mo136939a() {
        C97686b bVar;
        if (this.f286533e == null && (bVar = this.f286532d) != null) {
            this.f286533e = bVar.mo136937a(this);
        }
        Assert.assertNotNull("You must pair this presenter with a interactor!", this.f286533e);
        return this.f286533e;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:22|23|24) */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x006c, code lost:
        throw new java.lang.InternalError("Could not create interactor api instance : " + r5.toString());
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:22:0x0052 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public <T extends hp3.C98494b<? extends ep3.C97683a>> T mo136940b(android.app.Activity r4, java.lang.Class<? extends hp3.C98494b<? extends ep3.C97683a>> r5) {
        /*
            r3 = this;
            boolean r0 = r4.isFinishing()
            if (r0 != 0) goto L_0x0070
            boolean r0 = r4.isDestroyed()
            if (r0 == 0) goto L_0x000d
            goto L_0x0070
        L_0x000d:
            monitor-enter(r3)
            hp3.b<? extends ep3.a> r4 = r3.f286534f     // Catch:{ all -> 0x006d }
            if (r4 == 0) goto L_0x0037
            boolean r4 = r5.isInstance(r4)     // Catch:{ all -> 0x006d }
            if (r4 == 0) goto L_0x001c
            hp3.b<? extends ep3.a> r4 = r3.f286534f     // Catch:{ all -> 0x006d }
            monitor-exit(r3)
            goto L_0x0051
        L_0x001c:
            java.lang.IllegalAccessError r4 = new java.lang.IllegalAccessError     // Catch:{ all -> 0x006d }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x006d }
            r0.<init>()     // Catch:{ all -> 0x006d }
            java.lang.String r1 = "Only one interactor pair with one presenter! duplicate pairWith : "
            r0.append(r1)     // Catch:{ all -> 0x006d }
            java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x006d }
            r0.append(r5)     // Catch:{ all -> 0x006d }
            java.lang.String r5 = r0.toString()     // Catch:{ all -> 0x006d }
            r4.<init>(r5)     // Catch:{ all -> 0x006d }
            throw r4     // Catch:{ all -> 0x006d }
        L_0x0037:
            java.lang.Object r4 = r5.newInstance()     // Catch:{ IllegalAccessException | InstantiationException -> 0x0052 }
            hp3.b r4 = (hp3.C98494b) r4     // Catch:{ IllegalAccessException | InstantiationException -> 0x0052 }
            r3.f286534f = r4     // Catch:{ IllegalAccessException | InstantiationException -> 0x0052 }
            ep3.a r0 = r3.f286533e     // Catch:{ IllegalAccessException | InstantiationException -> 0x0052 }
            if (r0 != 0) goto L_0x004b
            java.lang.Object r4 = r4.mo67527a()     // Catch:{ IllegalAccessException | InstantiationException -> 0x0052 }
            ep3.a r4 = (ep3.C97683a) r4     // Catch:{ IllegalAccessException | InstantiationException -> 0x0052 }
            r3.f286533e = r4     // Catch:{ IllegalAccessException | InstantiationException -> 0x0052 }
        L_0x004b:
            r3.mo136943e()     // Catch:{ IllegalAccessException | InstantiationException -> 0x0052 }
            hp3.b<? extends ep3.a> r4 = r3.f286534f     // Catch:{ IllegalAccessException | InstantiationException -> 0x0052 }
            monitor-exit(r3)
        L_0x0051:
            return r4
        L_0x0052:
            java.lang.InternalError r4 = new java.lang.InternalError     // Catch:{ all -> 0x006d }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x006d }
            r0.<init>()     // Catch:{ all -> 0x006d }
            java.lang.String r1 = "Could not create interactor api instance : "
            r0.append(r1)     // Catch:{ all -> 0x006d }
            java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x006d }
            r0.append(r5)     // Catch:{ all -> 0x006d }
            java.lang.String r5 = r0.toString()     // Catch:{ all -> 0x006d }
            r4.<init>(r5)     // Catch:{ all -> 0x006d }
            throw r4     // Catch:{ all -> 0x006d }
        L_0x006d:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        L_0x0070:
            java.lang.String r5 = "Vending.Presenter"
            java.lang.String r0 = "Activity %s is finished! This is invalid!"
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r4
            kp3.C88253a.m109902a(r5, r0, r1)
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: ep3.C97688c.mo136940b(android.app.Activity, java.lang.Class):hp3.b");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:24|25|26) */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x006c, code lost:
        throw new java.lang.InternalError("Could not create interactor instance : " + r5.toString());
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:24:0x0052 */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public <T extends ep3.C97683a> T mo136941c(android.app.Activity r4, java.lang.Class<? extends ep3.C97683a> r5) {
        /*
            r3 = this;
            boolean r0 = r4.isFinishing()
            if (r0 != 0) goto L_0x0070
            boolean r0 = r4.isDestroyed()
            if (r0 == 0) goto L_0x000d
            goto L_0x0070
        L_0x000d:
            monitor-enter(r3)
            hp3.b<? extends ep3.a> r4 = r3.f286534f     // Catch:{ all -> 0x006d }
            if (r4 == 0) goto L_0x001a
            java.lang.Object r4 = r4.mo67527a()     // Catch:{ all -> 0x006d }
            ep3.a r4 = (ep3.C97683a) r4     // Catch:{ all -> 0x006d }
            monitor-exit(r3)
            goto L_0x0051
        L_0x001a:
            ep3.a r4 = r3.f286533e     // Catch:{ all -> 0x006d }
            if (r4 == 0) goto L_0x0043
            boolean r4 = r5.isInstance(r4)     // Catch:{ all -> 0x006d }
            if (r4 == 0) goto L_0x0028
            ep3.a r4 = r3.f286533e     // Catch:{ all -> 0x006d }
            monitor-exit(r3)
            goto L_0x0051
        L_0x0028:
            java.lang.IllegalAccessError r4 = new java.lang.IllegalAccessError     // Catch:{ all -> 0x006d }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x006d }
            r0.<init>()     // Catch:{ all -> 0x006d }
            java.lang.String r1 = "Only one interactor pair with one presenter! duplicate pairWith : "
            r0.append(r1)     // Catch:{ all -> 0x006d }
            java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x006d }
            r0.append(r5)     // Catch:{ all -> 0x006d }
            java.lang.String r5 = r0.toString()     // Catch:{ all -> 0x006d }
            r4.<init>(r5)     // Catch:{ all -> 0x006d }
            throw r4     // Catch:{ all -> 0x006d }
        L_0x0043:
            java.lang.Object r4 = r5.newInstance()     // Catch:{ IllegalAccessException | InstantiationException -> 0x0052 }
            ep3.a r4 = (ep3.C97683a) r4     // Catch:{ IllegalAccessException | InstantiationException -> 0x0052 }
            r3.f286533e = r4     // Catch:{ IllegalAccessException | InstantiationException -> 0x0052 }
            r3.mo136943e()     // Catch:{ IllegalAccessException | InstantiationException -> 0x0052 }
            ep3.a r4 = r3.f286533e     // Catch:{ IllegalAccessException | InstantiationException -> 0x0052 }
            monitor-exit(r3)
        L_0x0051:
            return r4
        L_0x0052:
            java.lang.InternalError r4 = new java.lang.InternalError     // Catch:{ all -> 0x006d }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x006d }
            r0.<init>()     // Catch:{ all -> 0x006d }
            java.lang.String r1 = "Could not create interactor instance : "
            r0.append(r1)     // Catch:{ all -> 0x006d }
            java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x006d }
            r0.append(r5)     // Catch:{ all -> 0x006d }
            java.lang.String r5 = r0.toString()     // Catch:{ all -> 0x006d }
            r4.<init>(r5)     // Catch:{ all -> 0x006d }
            throw r4     // Catch:{ all -> 0x006d }
        L_0x006d:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        L_0x0070:
            java.lang.String r5 = "Vending.Presenter"
            java.lang.String r0 = "Activity %s is finished! This is invalid!"
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r4
            kp3.C88253a.m109902a(r5, r0, r1)
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: ep3.C97688c.mo136941c(android.app.Activity, java.lang.Class):ep3.a");
    }

    /* renamed from: d */
    public void mo136942d(Intent intent, Context context) {
        synchronized (this) {
            Assert.assertNotNull("You must pair this presenter with a interactor!", this.f286533e);
            this.f286533e.mo136935g(context);
            this.f286533e.mo136936h(intent);
        }
        mo136944f(1);
    }

    /* renamed from: e */
    public final void mo136943e() {
        C97686b bVar = this.f286532d;
        if (bVar != null) {
            C97683a aVar = this.f286533e;
            if (!((ConcurrentHashMap) bVar.f286529a).containsKey(this)) {
                ((ConcurrentHashMap) bVar.f286529a).put(this, aVar);
                C88253a.m109903b("Vending.InteractorManager", "presenter %s hash %s interactor %s looper %s", this, Integer.valueOf(hashCode()), aVar, Looper.myLooper());
                int i = bVar.f286530b.get(hashCode(), 0);
                if (i > 0 && i < 4) {
                    if (i >= 1) {
                        Handler handler = bVar.f286531c;
                        handler.sendMessage(handler.obtainMessage(1, aVar));
                    }
                    if (i >= 2) {
                        Handler handler2 = bVar.f286531c;
                        handler2.sendMessage(handler2.obtainMessage(2, aVar));
                    }
                    if (i >= 3) {
                        Handler handler3 = bVar.f286531c;
                        handler3.sendMessage(handler3.obtainMessage(3, aVar));
                    }
                    if (i >= 4) {
                        Handler handler4 = bVar.f286531c;
                        handler4.sendMessage(handler4.obtainMessage(4, aVar));
                        return;
                    }
                    return;
                }
                return;
            }
            C88253a.m109902a("Vending.InteractorManager", "duplicate activity and interactor.", new Object[0]);
        }
    }

    /* renamed from: f */
    public final void mo136944f(int i) {
        C97686b bVar = this.f286532d;
        C97683a aVar = (C97683a) ((ConcurrentHashMap) bVar.f286529a).get(this);
        if (aVar != null) {
            if (i == 1) {
                C88253a.m109903b("Vending.InteractorManager", "onCreate interactor %s presenter %s %s %s", aVar, this, Integer.valueOf(hashCode()), Looper.myLooper());
            } else if (!(i == 2 || i == 3)) {
                if (i != 4) {
                    C88253a.m109903b("Vending.InteractorManager", "Unknow phase %s, interactor %s activity %s %s %s", Integer.valueOf(i), aVar, this, Integer.valueOf(hashCode()), Looper.myLooper());
                    return;
                }
                C88253a.m109903b("Vending.InteractorManager", "onDestroy interactor %s activity %s %s %s", aVar, this, Integer.valueOf(hashCode()), Looper.myLooper());
                ((ConcurrentHashMap) bVar.f286529a).remove(this);
            }
            Handler handler = bVar.f286531c;
            handler.sendMessage(handler.obtainMessage(i, aVar));
        }
        bVar.f286530b.put(hashCode(), i);
    }

    public void keep(C9486a aVar) {
        Assert.assertTrue("target must be a ILifeCycle", aVar instanceof C9486a);
        this.f286535g.keep(aVar);
    }
}
