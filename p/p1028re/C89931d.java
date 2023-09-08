package p1028re;

import android.os.Handler;
import android.os.HandlerThread;
import com.tencent.matrix.lifecycle.IBackgroundStatefulOwner;
import com.tencent.xweb.file.XVFSFile;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.Iterator;
import p723vf.C118672d;
import p723vf.C90778c;

/* renamed from: re.d */
public final class C89931d {

    /* renamed from: a */
    public static final ArrayList<C89928a> f258424a = new ArrayList<>();

    /* renamed from: b */
    public static final ArrayList<C89928a> f258425b = new ArrayList<>();

    /* renamed from: c */
    public static final C89931d f258426c = new C89931d();

    /* renamed from: re.d$a */
    public static final class C89932a implements Runnable {

        /* renamed from: d */
        public final Handler f258427d;

        /* renamed from: e */
        public volatile int f258428e;

        /* renamed from: f */
        public final String f258429f;

        /* renamed from: g */
        public final IBackgroundStatefulOwner f258430g;

        /* renamed from: h */
        public final ArrayList<C89928a> f258431h;

        /* renamed from: i */
        public final C89929b f258432i;

        /* renamed from: j */
        public final boolean f258433j;

        public C89932a(String str, IBackgroundStatefulOwner iBackgroundStatefulOwner, ArrayList<C89928a> arrayList, C89929b bVar, boolean z) {
            C87412m.m108594g(str, "name");
            C87412m.m108594g(iBackgroundStatefulOwner, "backgroundOwner");
            C87412m.m108594g(arrayList, "trimCallback");
            C87412m.m108594g(bVar, "config");
            this.f258429f = str;
            this.f258430g = iBackgroundStatefulOwner;
            this.f258431h = arrayList;
            this.f258432i = bVar;
            this.f258433j = z;
            HandlerThread b = C90778c.m113844b();
            C87412m.m108593f(b, "MatrixHandlerThread.getDefaultHandlerThread()");
            this.f258427d = new Handler(b.getLooper());
        }

        public void run() {
            int i = this.f258428e;
            if (i >= this.f258432i.f258422b.size()) {
                C118672d.m167352b("Matrix.TrimMemoryNotifier", "index[" + i + "] out of bounds[" + this.f258432i.f258422b.size() + ']', new Object[0]);
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("!!![");
            sb.append(this.f258429f);
            sb.append("] trim timeout [");
            int i2 = i + 1;
            sb.append(i2);
            sb.append(XVFSFile.SEPARATOR_CHAR);
            sb.append(this.f258432i.f258422b.size());
            sb.append("] ");
            sb.append(this.f258432i.f258422b.get(i));
            C118672d.m167353c("Matrix.TrimMemoryNotifier", sb.toString(), new Object[0]);
            C89931d.f258426c.mo124254d(this.f258431h);
            if (i2 < this.f258432i.f258422b.size()) {
                this.f258428e = i2;
                Long l = this.f258432i.f258422b.get(i2);
                C87412m.m108593f(l, "config.delayMillis[nextIndex]");
                long longValue = l.longValue();
                this.f258427d.postDelayed(this, longValue);
                C118672d.m167353c("Matrix.TrimMemoryNotifier", "...[" + this.f258429f + "] trim delay[" + (i2 + 1) + XVFSFile.SEPARATOR_CHAR + this.f258432i.f258422b.size() + "] " + longValue, new Object[0]);
            }
        }
    }

    /* renamed from: a */
    public static final void m112503a(C89931d dVar, ArrayList arrayList, int i) {
        ArrayList arrayList2;
        dVar.getClass();
        synchronized (arrayList) {
            arrayList2 = new ArrayList(arrayList);
        }
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            try {
                ((C89928a) it.next()).mo391a(i);
            } catch (Throwable th) {
                C118672d.m167354d("Matrix.TrimMemoryNotifier", th, "", new Object[0]);
            }
        }
        Runtime.getRuntime().gc();
    }

    /* renamed from: b */
    public final void mo124252b(C89928a aVar) {
        C87412m.m108594g(aVar, "callback");
        ArrayList<C89928a> arrayList = f258425b;
        synchronized (arrayList) {
            arrayList.add(aVar);
        }
    }

    /* renamed from: c */
    public final void mo124253c(C89928a aVar) {
        C87412m.m108594g(aVar, "callback");
        ArrayList<C89928a> arrayList = f258424a;
        synchronized (arrayList) {
            arrayList.add(aVar);
        }
    }

    /* renamed from: d */
    public final void mo124254d(ArrayList<C89928a> arrayList) {
        ArrayList<C89928a> arrayList2;
        synchronized (arrayList) {
            arrayList2 = new ArrayList<>(arrayList);
        }
        for (C89928a b : arrayList2) {
            try {
                b.mo392b();
            } catch (Throwable th) {
                C118672d.m167354d("Matrix.TrimMemoryNotifier", th, "", new Object[0]);
            }
        }
        Runtime.getRuntime().gc();
    }
}
