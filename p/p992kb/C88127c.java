package p992kb;

import android.util.SparseArray;
import android.util.SparseIntArray;
import com.tencent.p014mm.plugin.appbrand.C83231l;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.concurrent.CopyOnWriteArrayList;
import p1017od.C89157e;
import zt3.C119157j;

/* renamed from: kb.c */
public class C88127c {

    /* renamed from: l */
    public static final SparseArray<C88127c> f254884l = new SparseArray<>();

    /* renamed from: a */
    public int f254885a = 0;

    /* renamed from: b */
    public long f254886b = 0;

    /* renamed from: c */
    public long f254887c = 0;

    /* renamed from: d */
    public String f254888d = "";

    /* renamed from: e */
    public boolean f254889e = false;

    /* renamed from: f */
    public C89157e f254890f;

    /* renamed from: g */
    public int f254891g = -1;

    /* renamed from: h */
    public float f254892h = -1.0f;

    /* renamed from: i */
    public CopyOnWriteArrayList<Long> f254893i = new CopyOnWriteArrayList<>();

    /* renamed from: j */
    public final C88129b f254894j = new C88129b((C88125a) null);

    /* renamed from: k */
    public C83231l.C83234d f254895k = new C88128a();

    /* renamed from: kb.c$a */
    public class C88128a extends C83231l.C83234d {
        public C88128a() {
        }

        /* renamed from: b */
        public void mo109496b() {
            Log.m105924i("MicroMsg.MBNiReporter", "hy: onCreate");
            C88127c cVar = C88127c.this;
            cVar.getClass();
            Log.m105924i("MicroMsg.MBNiReporter", "hy: initStatis!");
            CopyOnWriteArrayList<Long> copyOnWriteArrayList = cVar.f254893i;
            if (copyOnWriteArrayList != null && copyOnWriteArrayList.size() > 0) {
                cVar.f254893i.clear();
            }
            synchronized (cVar.f254894j) {
                if (cVar.f254894j.size() > 0) {
                    cVar.f254894j.clear();
                }
            }
            cVar.f254889e = false;
            cVar.f254885a = 0;
            cVar.f254886b = 0;
            cVar.f254887c = 0;
        }

        /* renamed from: c */
        public void mo109497c() {
            Log.m105924i("MicroMsg.MBNiReporter", "hy: onDestroy");
            C88127c cVar = C88127c.this;
            cVar.getClass();
            Log.m105924i("MicroMsg.MBNiReporter", "hy: release!");
            C83231l.m102144e(cVar.f254888d, cVar.f254895k);
        }

        /* renamed from: e */
        public void mo74049e(C83231l.C83235e eVar) {
            Log.m105924i("MicroMsg.MBNiReporter", "hy: onPause");
            C88127c cVar = C88127c.this;
            if (cVar.f254889e) {
                Log.m105924i("MicroMsg.MBNiReporter", "hy: hasReported!");
                return;
            }
            ((C119157j) C119157j.f356862d).mo183875f(new C88131e(cVar));
        }

        /* renamed from: f */
        public void mo109498f() {
            Log.m105924i("MicroMsg.MBNiReporter", "hy: onResume");
        }
    }

    /* renamed from: kb.c$b */
    public static final class C88129b extends SparseIntArray {
        public C88129b(C88125a aVar) {
        }

        /* renamed from: a */
        public boolean mo122523a(int i) {
            return indexOfKey(i) >= 0;
        }
    }

    /* renamed from: a */
    public static C88127c m109723a(String str) {
        C88127c cVar;
        int hashCode = str.hashCode();
        SparseArray<C88127c> sparseArray = f254884l;
        synchronized (sparseArray) {
            cVar = sparseArray.get(hashCode);
            if (cVar == null) {
                cVar = new C88127c();
                sparseArray.put(hashCode, cVar);
            }
        }
        return cVar;
    }

    /* renamed from: b */
    public static void m109724b(String str) {
        C88127c cVar;
        int hashCode = str.hashCode();
        SparseArray<C88127c> sparseArray = f254884l;
        synchronized (sparseArray) {
            int indexOfKey = sparseArray.indexOfKey(hashCode);
            if (indexOfKey >= 0) {
                cVar = sparseArray.valueAt(indexOfKey);
                sparseArray.removeAt(indexOfKey);
            } else {
                cVar = null;
            }
        }
        if (cVar != null) {
            Log.m105924i("MicroMsg.MBNiReporter", "hy: release!");
            C83231l.m102144e(cVar.f254888d, cVar.f254895k);
        }
    }
}
