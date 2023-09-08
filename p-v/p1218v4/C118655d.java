package p1218v4;

import android.content.Context;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import p1014o4.C117693m;
import p1169a5.C112757a;
import p1214t4.C118382a;

/* renamed from: v4.d */
public abstract class C118655d<T> {

    /* renamed from: f */
    public static final String f355046f = C117693m.m165967e("ConstraintTracker");

    /* renamed from: a */
    public final C112757a f355047a;

    /* renamed from: b */
    public final Context f355048b;

    /* renamed from: c */
    public final Object f355049c = new Object();

    /* renamed from: d */
    public final Set<C118382a<T>> f355050d = new LinkedHashSet();

    /* renamed from: e */
    public T f355051e;

    /* renamed from: v4.d$a */
    public class C118656a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ List f355052d;

        public C118656a(List list) {
            this.f355052d = list;
        }

        public void run() {
            for (C118382a a : this.f355052d) {
                a.mo183170a(C118655d.this.f355051e);
            }
        }
    }

    public C118655d(Context context, C112757a aVar) {
        this.f355048b = context.getApplicationContext();
        this.f355047a = aVar;
    }

    /* renamed from: a */
    public abstract T mo183374a();

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002c, code lost:
        return;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo183380b(T r4) {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f355049c
            monitor-enter(r0)
            T r1 = r3.f355051e     // Catch:{ all -> 0x002d }
            if (r1 == r4) goto L_0x002b
            if (r1 == 0) goto L_0x0010
            boolean r1 = r1.equals(r4)     // Catch:{ all -> 0x002d }
            if (r1 == 0) goto L_0x0010
            goto L_0x002b
        L_0x0010:
            r3.f355051e = r4     // Catch:{ all -> 0x002d }
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ all -> 0x002d }
            java.util.Set<t4.a<T>> r1 = r3.f355050d     // Catch:{ all -> 0x002d }
            r4.<init>(r1)     // Catch:{ all -> 0x002d }
            a5.a r1 = r3.f355047a     // Catch:{ all -> 0x002d }
            a5.b r1 = (p1169a5.C112758b) r1     // Catch:{ all -> 0x002d }
            java.util.concurrent.Executor r1 = r1.f337644c     // Catch:{ all -> 0x002d }
            v4.d$a r2 = new v4.d$a     // Catch:{ all -> 0x002d }
            r2.<init>(r4)     // Catch:{ all -> 0x002d }
            a5.b$a r1 = (p1169a5.C112758b.C112759a) r1     // Catch:{ all -> 0x002d }
            r1.execute(r2)     // Catch:{ all -> 0x002d }
            monitor-exit(r0)     // Catch:{ all -> 0x002d }
            return
        L_0x002b:
            monitor-exit(r0)     // Catch:{ all -> 0x002d }
            return
        L_0x002d:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x002d }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p1218v4.C118655d.mo183380b(java.lang.Object):void");
    }

    /* renamed from: c */
    public abstract void mo183377c();

    /* renamed from: d */
    public abstract void mo183378d();
}
