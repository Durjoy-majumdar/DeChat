package p1223z3;

import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.os.CancellationSignal;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import p1135n.C109660b;
import p1188d4.C116561a;
import p1188d4.C116562b;
import p1188d4.C116569f;
import p1191e4.C116683a;
import p1191e4.C116691f;

/* renamed from: z3.f */
public class C119033f {

    /* renamed from: k */
    public static final String[] f356500k = {"UPDATE", "DELETE", "INSERT"};

    /* renamed from: a */
    public final HashMap<String, Integer> f356501a;

    /* renamed from: b */
    public final String[] f356502b;

    /* renamed from: c */
    public Map<String, Set<String>> f356503c;

    /* renamed from: d */
    public final C119038g f356504d;

    /* renamed from: e */
    public AtomicBoolean f356505e = new AtomicBoolean(false);

    /* renamed from: f */
    public volatile boolean f356506f = false;

    /* renamed from: g */
    public volatile C116569f f356507g;

    /* renamed from: h */
    public C119035b f356508h;

    /* renamed from: i */
    public final C109660b<C119036c, C119037d> f356509i = new C109660b<>();

    /* renamed from: j */
    public Runnable f356510j = new C119034a();

    /* renamed from: z3.f$a */
    public class C119034a implements Runnable {
        public C119034a() {
        }

        /* JADX INFO: finally extract failed */
        /* renamed from: a */
        public final Set<Integer> mo183697a() {
            HashSet hashSet = new HashSet();
            Cursor g = C119033f.this.f356504d.mo183705g(new C116561a("SELECT * FROM room_table_modification_log WHERE invalidated = 1;"), (CancellationSignal) null);
            while (g.moveToNext()) {
                try {
                    hashSet.add(Integer.valueOf(g.getInt(0)));
                } catch (Throwable th) {
                    g.close();
                    throw th;
                }
            }
            g.close();
            if (!hashSet.isEmpty()) {
                ((C116691f) C119033f.this.f356507g).mo180702a();
            }
            return hashSet;
        }

        public void run() {
            C116683a aVar;
            ReentrantReadWriteLock.ReadLock readLock = C119033f.this.f356504d.f356524h.readLock();
            Set<Integer> set = null;
            try {
                readLock.lock();
                if (!C119033f.this.mo183694a()) {
                    readLock.unlock();
                } else if (!C119033f.this.f356505e.compareAndSet(true, false)) {
                    readLock.unlock();
                } else if (((C116683a) C119033f.this.f356504d.f356519c.mo180540K()).f349940d.inTransaction()) {
                    readLock.unlock();
                } else {
                    C119038g gVar = C119033f.this.f356504d;
                    if (gVar.f356522f) {
                        aVar = (C116683a) gVar.f356519c.mo180540K();
                        aVar.mo180682a();
                        set = mo183697a();
                        aVar.mo180688g();
                        aVar.mo180683b();
                    } else {
                        set = mo183697a();
                    }
                    readLock.unlock();
                    if (set != null && !set.isEmpty()) {
                        synchronized (C119033f.this.f356509i) {
                            C109660b.C109665e eVar = (C109660b.C109665e) C119033f.this.f356509i.iterator();
                            if (eVar.hasNext()) {
                                ((C119037d) ((Map.Entry) eVar.next()).getValue()).getClass();
                                throw null;
                            }
                        }
                    }
                }
            } catch (SQLiteException | IllegalStateException unused) {
            } catch (Throwable th) {
                readLock.unlock();
                throw th;
            }
        }
    }

    /* renamed from: z3.f$b */
    public static class C119035b {

        /* renamed from: a */
        public final long[] f356512a;

        /* renamed from: b */
        public final boolean[] f356513b;

        /* renamed from: c */
        public final int[] f356514c;

        /* renamed from: d */
        public boolean f356515d;

        /* renamed from: e */
        public boolean f356516e;

        public C119035b(int i) {
            long[] jArr = new long[i];
            this.f356512a = jArr;
            boolean[] zArr = new boolean[i];
            this.f356513b = zArr;
            this.f356514c = new int[i];
            Arrays.fill(jArr, 0);
            Arrays.fill(zArr, false);
        }

        /* renamed from: a */
        public int[] mo183699a() {
            synchronized (this) {
                if (this.f356515d) {
                    if (!this.f356516e) {
                        int length = this.f356512a.length;
                        int i = 0;
                        while (true) {
                            int i2 = 1;
                            if (i < length) {
                                boolean z = this.f356512a[i] > 0;
                                boolean[] zArr = this.f356513b;
                                if (z != zArr[i]) {
                                    int[] iArr = this.f356514c;
                                    if (!z) {
                                        i2 = 2;
                                    }
                                    iArr[i] = i2;
                                } else {
                                    this.f356514c[i] = 0;
                                }
                                zArr[i] = z;
                                i++;
                            } else {
                                this.f356516e = true;
                                this.f356515d = false;
                                int[] iArr2 = this.f356514c;
                                return iArr2;
                            }
                        }
                    }
                }
                return null;
            }
        }
    }

    /* renamed from: z3.f$c */
    public static abstract class C119036c {
        /* renamed from: a */
        public abstract void mo183700a(Set<String> set);
    }

    /* renamed from: z3.f$d */
    public static class C119037d {
    }

    public C119033f(C119038g gVar, Map<String, String> map, Map<String, Set<String>> map2, String... strArr) {
        this.f356504d = gVar;
        this.f356508h = new C119035b(strArr.length);
        this.f356501a = new HashMap<>();
        this.f356503c = map2;
        Collections.newSetFromMap(new IdentityHashMap());
        int length = strArr.length;
        this.f356502b = new String[length];
        for (int i = 0; i < length; i++) {
            String str = strArr[i];
            Locale locale = Locale.US;
            String lowerCase = str.toLowerCase(locale);
            this.f356501a.put(lowerCase, Integer.valueOf(i));
            String str2 = map.get(strArr[i]);
            if (str2 != null) {
                this.f356502b[i] = str2.toLowerCase(locale);
            } else {
                this.f356502b[i] = lowerCase;
            }
        }
        for (Map.Entry next : map.entrySet()) {
            Locale locale2 = Locale.US;
            String lowerCase2 = ((String) next.getValue()).toLowerCase(locale2);
            if (this.f356501a.containsKey(lowerCase2)) {
                String lowerCase3 = ((String) next.getKey()).toLowerCase(locale2);
                HashMap<String, Integer> hashMap = this.f356501a;
                hashMap.put(lowerCase3, hashMap.get(lowerCase2));
            }
        }
    }

    /* renamed from: a */
    public boolean mo183694a() {
        C116562b bVar = this.f356504d.f356517a;
        if (!(bVar != null && ((C116683a) bVar).f349940d.isOpen())) {
            return false;
        }
        if (!this.f356506f) {
            this.f356504d.f356519c.mo180540K();
        }
        return this.f356506f;
    }

    /* renamed from: b */
    public final void mo183695b(C116562b bVar, int i) {
        C116683a aVar = (C116683a) bVar;
        aVar.mo180684c("INSERT OR IGNORE INTO room_table_modification_log VALUES(" + i + ", 0)");
        String str = this.f356502b[i];
        StringBuilder sb = new StringBuilder();
        String[] strArr = f356500k;
        for (int i2 = 0; i2 < 3; i2++) {
            String str2 = strArr[i2];
            sb.setLength(0);
            sb.append("CREATE TEMP TRIGGER IF NOT EXISTS ");
            sb.append("`");
            sb.append("room_table_modification_trigger_");
            sb.append(str);
            sb.append("_");
            sb.append(str2);
            sb.append("`");
            sb.append(" AFTER ");
            sb.append(str2);
            sb.append(" ON `");
            sb.append(str);
            sb.append("` BEGIN UPDATE ");
            sb.append("room_table_modification_log");
            sb.append(" SET ");
            sb.append("invalidated");
            sb.append(" = 1");
            sb.append(" WHERE ");
            sb.append("table_id");
            sb.append(" = ");
            sb.append(i);
            sb.append(" AND ");
            sb.append("invalidated");
            sb.append(" = 0");
            sb.append("; END");
            aVar.mo180684c(sb.toString());
        }
    }

    /* renamed from: c */
    public void mo183696c(C116562b bVar) {
        C116683a aVar = (C116683a) bVar;
        if (!aVar.f349940d.inTransaction()) {
            while (true) {
                try {
                    ReentrantReadWriteLock.ReadLock readLock = this.f356504d.f356524h.readLock();
                    readLock.lock();
                    try {
                        int[] a = this.f356508h.mo183699a();
                        if (a == null) {
                            readLock.unlock();
                            return;
                        }
                        int length = a.length;
                        aVar.mo180682a();
                        for (int i = 0; i < length; i++) {
                            int i2 = a[i];
                            if (i2 == 1) {
                                mo183695b(aVar, i);
                            } else if (i2 == 2) {
                                String str = this.f356502b[i];
                                StringBuilder sb = new StringBuilder();
                                String[] strArr = f356500k;
                                for (int i3 = 0; i3 < 3; i3++) {
                                    String str2 = strArr[i3];
                                    sb.setLength(0);
                                    sb.append("DROP TRIGGER IF EXISTS ");
                                    sb.append("`");
                                    sb.append("room_table_modification_trigger_");
                                    sb.append(str);
                                    sb.append("_");
                                    sb.append(str2);
                                    sb.append("`");
                                    aVar.mo180684c(sb.toString());
                                }
                            }
                        }
                        aVar.mo180688g();
                        aVar.mo180683b();
                        C119035b bVar2 = this.f356508h;
                        synchronized (bVar2) {
                            bVar2.f356516e = false;
                        }
                        readLock.unlock();
                    } catch (Throwable th) {
                        readLock.unlock();
                        throw th;
                    }
                } catch (SQLiteException | IllegalStateException unused) {
                    return;
                }
            }
            while (true) {
            }
        }
    }
}
