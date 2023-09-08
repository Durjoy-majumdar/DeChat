package p354kh;

import android.os.Process;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import nb0.C88912b;
import p213oh.C11412b;
import p335eh.C107275e;
import p335eh.C116768d;
import p335eh.C20599b;
import p339fh.C116867h;
import p339fh.C116869j;
import p348ih.C21079c;
import p356lh.C21428d;

/* renamed from: kh.a */
public class C21333a {

    /* renamed from: a */
    public C109008f f60294a;

    /* renamed from: b */
    public C21428d f60295b;

    /* renamed from: c */
    public AtomicBoolean f60296c = new AtomicBoolean(false);

    /* renamed from: d */
    public AtomicBoolean f60297d = new AtomicBoolean(false);

    /* renamed from: e */
    public AtomicBoolean f60298e = new AtomicBoolean(false);

    /* renamed from: f */
    public volatile HashMap<String, Boolean> f60299f = new HashMap<>();

    /* renamed from: g */
    public Object f60300g = new Object();

    /* renamed from: h */
    public Thread f60301h;

    /* renamed from: i */
    public volatile LinkedList<String> f60302i = new LinkedList<>();

    /* renamed from: j */
    public volatile HashMap<String, Object> f60303j = new HashMap<>();

    /* renamed from: k */
    public volatile HashMap<String, List<C107275e>> f60304k = new HashMap<>();

    /* renamed from: l */
    public volatile HashMap<String, Boolean> f60305l = new HashMap<>();

    /* renamed from: m */
    public volatile HashMap<String, WeakReference<C21079c>> f60306m = new HashMap<>();

    /* renamed from: n */
    public Object f60307n = new Object();

    /* renamed from: o */
    public List<C107275e> f60308o = new ArrayList();

    /* renamed from: p */
    public volatile HashMap<String, Boolean> f60309p = new HashMap<>();

    /* renamed from: q */
    public volatile HashMap<String, Boolean> f60310q = new HashMap<>();

    /* renamed from: r */
    public volatile HashMap<String, Integer> f60311r = new HashMap<>();

    /* renamed from: s */
    public volatile HashMap<String, Long> f60312s = new HashMap<>();

    /* renamed from: t */
    public volatile LinkedList<String> f60313t = new LinkedList<>();

    /* renamed from: u */
    public long f60314u = 0;

    /* renamed from: v */
    public int f60315v = 0;

    /* renamed from: w */
    public long f60316w = 0;

    /* renamed from: x */
    public Runnable f60317x = new C21334a();

    /* renamed from: kh.a$a */
    public class C21334a implements Runnable {
        public C21334a() {
        }

        public void run() {
            Process.setThreadPriority(-19);
            if (C21333a.this.mo33369e()) {
                int i = C11412b.f33577a;
                Log.m105921e("MicroMsg.Mix.AudioMixController", "stop and exit", (Object[]) null);
                return;
            }
            while (!C21333a.this.mo33369e()) {
                C21333a aVar = C21333a.this;
                synchronized (aVar.f60300g) {
                    while (!aVar.mo33369e() && aVar.f60297d.get()) {
                        try {
                            int i2 = C11412b.f33577a;
                            Log.m105925i("MicroMsg.Mix.AudioMixController", "waitMix", (Object[]) null);
                            aVar.f60300g.wait();
                        } catch (Exception e) {
                            int i3 = C11412b.f33577a;
                            Log.printErrStackTrace("MicroMsg.Mix.AudioMixController", e, "waitMix", new Object[0]);
                        } finally {
                            while (true) {
                            }
                        }
                    }
                }
                if (!C21333a.this.mo33369e()) {
                    System.nanoTime();
                    ArrayList arrayList = (ArrayList) C21333a.this.mo33372h();
                    if (arrayList.size() > 0) {
                        long nanoTime = System.nanoTime();
                        C20599b a = ((C21335b) C21333a.this.f60294a).mo33378a(arrayList);
                        long nanoTime2 = System.nanoTime();
                        C21333a aVar2 = C21333a.this;
                        aVar2.f60315v++;
                        aVar2.f60316w += nanoTime2 - nanoTime;
                        if (a != null) {
                            a.f57999d.addAll(aVar2.f60313t);
                            aVar2.f60313t.clear();
                            C21428d dVar = aVar2.f60295b;
                            if (dVar.f60642d.get()) {
                                int i4 = C11412b.f33577a;
                                Log.m105921e("MicroMsg.Mix.AudioMixPlayerImpl", "exit, not to add MixBuff queue", (Object[]) null);
                            } else {
                                synchronized (dVar.f60644f) {
                                    while (((ArrayDeque) dVar.f60643e).size() >= 2 && !dVar.f60642d.get()) {
                                        try {
                                            dVar.f60644f.wait();
                                        } catch (InterruptedException e2) {
                                            int i5 = C11412b.f33577a;
                                            Log.printErrStackTrace("MicroMsg.Mix.AudioMixPlayerImpl", e2, "enqueueMixBuffer", new Object[0]);
                                        }
                                    }
                                    ((ArrayDeque) dVar.f60643e).add(a);
                                    dVar.f60644f.notifyAll();
                                }
                            }
                        }
                        C21333a.this.mo33373i(arrayList);
                        arrayList.clear();
                    }
                } else {
                    return;
                }
            }
            int i6 = C11412b.f33577a;
            Log.m105925i("MicroMsg.Mix.AudioMixController", "mix thread stop and exit", (Object[]) null);
        }
    }

    public C21333a(C21428d dVar) {
        this.f60295b = dVar;
    }

    /* renamed from: a */
    public final C21079c mo33365a(String str) {
        WeakReference weakReference;
        if (!this.f60306m.containsKey(str) || (weakReference = this.f60306m.get(str)) == null || weakReference.get() == null) {
            return null;
        }
        return (C21079c) weakReference.get();
    }

    /* renamed from: b */
    public long mo33366b(String str) {
        synchronized (this.f60307n) {
            if (!this.f60312s.containsKey(str)) {
                return -1;
            }
            Long l = this.f60312s.get(str);
            if (l == null) {
                return -1;
            }
            long longValue = l.longValue();
            return longValue;
        }
    }

    /* renamed from: c */
    public boolean mo33367c(String str) {
        if (!this.f60302i.contains(str)) {
            return true;
        }
        List list = this.f60304k.get(str);
        if (list != null && list.size() != 0) {
            return false;
        }
        int i = C11412b.f33577a;
        Log.m105925i("MicroMsg.Mix.AudioMixController", "queue size is 0", (Object[]) null);
        return true;
    }

    /* renamed from: d */
    public boolean mo33368d(String str) {
        synchronized (this.f60307n) {
            if (!this.f60305l.containsKey(str)) {
                return false;
            }
            boolean booleanValue = this.f60305l.get(str).booleanValue();
            return booleanValue;
        }
    }

    /* renamed from: e */
    public boolean mo33369e() {
        return this.f60296c.get();
    }

    /* renamed from: f */
    public void mo33370f() {
        try {
            this.f60307n.notifyAll();
        } catch (Exception e) {
            int i = C11412b.f33577a;
            Log.printErrStackTrace("MicroMsg.Mix.AudioMixController", e, "notifySyncPcmData", new Object[0]);
        }
    }

    /* renamed from: g */
    public void mo33371g(String str) {
        synchronized (this.f60307n) {
            if (this.f60305l.containsKey(str)) {
                this.f60305l.put(str, Boolean.TRUE);
            } else {
                int i = C11412b.f33577a;
                Log.m105921e("MicroMsg.Mix.AudioMixController", "The audio of the id is remove", (Object[]) null);
            }
        }
    }

    /* renamed from: h */
    public List<C107275e> mo33372h() {
        boolean z;
        ArrayList arrayList = new ArrayList();
        synchronized (this.f60307n) {
            arrayList.addAll(this.f60302i);
        }
        int i = 0;
        while (true) {
            C107275e eVar = null;
            if (i < arrayList.size()) {
                String str = (String) arrayList.get(i);
                if (!mo33368d(str)) {
                    List list = this.f60304k.get(str);
                    if (list == null || list.size() == 0) {
                        synchronized (this.f60307n) {
                            z = this.f60309p.containsKey(str) && this.f60309p.get(str).booleanValue();
                        }
                        if (z) {
                            synchronized (this.f60307n) {
                                this.f60309p.put(str, Boolean.FALSE);
                            }
                            this.f60295b.mo33590k(5, str);
                            C88912b c = this.f60295b.mo33582c(str);
                            if (c != null) {
                                c.f256421f = (int) mo33366b(str);
                            }
                            mo33374j(str);
                        } else {
                            continue;
                        }
                    } else {
                        C21079c a = mo33365a(str);
                        if (a != null) {
                            a.mo32831w(list.size());
                        }
                        Object obj = this.f60303j.get(str);
                        if (obj == null) {
                            continue;
                        } else {
                            synchronized (obj) {
                                int size = list.size();
                                if (size > 0) {
                                    while (size > 0) {
                                        size--;
                                        eVar = (C107275e) list.remove(size);
                                        if (!this.f60311r.containsKey(str) || ((long) this.f60311r.get(str).intValue()) <= eVar.f320942e) {
                                            break;
                                        } else if (eVar.f320944g) {
                                            C116867h.m164840a().mo180851c(eVar);
                                        }
                                    }
                                    if (eVar != null) {
                                        this.f60312s.put(str, Long.valueOf(eVar.f320942e));
                                        C88912b c2 = this.f60295b.mo33582c(str);
                                        if (c2 != null && c2.f256427l == 0.0d && !eVar.f320944g) {
                                            C107275e b = C116867h.m164840a().mo180850b();
                                            if (b != null) {
                                                if (b.f320943f == null) {
                                                    b.f320943f = new byte[3536];
                                                }
                                                b.mo157747a();
                                                ((ArrayList) this.f60308o).add(b);
                                            } else {
                                                ((ArrayList) this.f60308o).add(eVar);
                                            }
                                        } else if (c2 == null || c2.f256427l != 0.0d || !eVar.f320944g) {
                                            ((ArrayList) this.f60308o).add(eVar);
                                        } else {
                                            eVar.mo157747a();
                                            ((ArrayList) this.f60308o).add(eVar);
                                        }
                                        this.f60313t.add(str);
                                    } else if (a != null) {
                                        a.mo32831w(list.size());
                                    }
                                }
                            }
                        }
                    }
                }
                i++;
            } else {
                synchronized (this.f60307n) {
                    if (((ArrayList) this.f60308o).size() == 0 && !mo33369e()) {
                        try {
                            int i2 = C11412b.f33577a;
                            Log.m105925i("MicroMsg.Mix.AudioMixController", "wait read data", (Object[]) null);
                            this.f60307n.wait();
                        } catch (Exception e) {
                            int i3 = C11412b.f33577a;
                            Log.printErrStackTrace("MicroMsg.Mix.AudioMixController", e, "readMixDataFromPcmTrack", new Object[0]);
                        }
                    }
                }
                return this.f60308o;
            }
        }
        while (true) {
        }
    }

    /* renamed from: i */
    public final void mo33373i(List<C107275e> list) {
        for (C107275e next : list) {
            if (next != null && next.f320944g) {
                C116867h.m164840a().mo180851c(next);
            }
        }
    }

    /* renamed from: j */
    public void mo33374j(String str) {
        synchronized (this.f60307n) {
            if (this.f60302i.contains(str)) {
                this.f60302i.remove(str);
                Object obj = this.f60303j.get(str);
                List remove = this.f60304k.remove(str);
                if (obj != null) {
                    synchronized (obj) {
                        mo33373i(remove);
                        remove.clear();
                    }
                } else {
                    mo33373i(remove);
                    remove.clear();
                }
                this.f60303j.remove(str);
                this.f60305l.remove(str);
                this.f60309p.remove(str);
                this.f60310q.remove(str);
                if (this.f60297d.get()) {
                    mo33370f();
                }
                this.f60311r.remove(str);
                this.f60312s.remove(str);
            } else {
                int i = C11412b.f33577a;
                Log.m105921e("MicroMsg.Mix.AudioMixController", "The audio of the id is remove", (Object[]) null);
            }
        }
    }

    /* renamed from: k */
    public boolean mo33375k(String str, int i, boolean z) {
        C107275e eVar;
        String str2 = str;
        if (!this.f60302i.contains(str2)) {
            return false;
        }
        if (i < 0) {
            this.f60311r.remove(str2);
            return false;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (i == 0) {
            this.f60311r.remove(str2);
        } else {
            this.f60311r.put(str2, Integer.valueOf(i));
        }
        List list = this.f60304k.get(str2);
        if (list == null || list.size() == 0) {
            this.f60311r.remove(str2);
            return false;
        }
        C88912b c = this.f60295b.mo33582c(str2);
        if (c == null) {
            this.f60311r.remove(str2);
            return false;
        }
        int i2 = C11412b.f33577a;
        Log.m105925i("MicroMsg.Mix.AudioMixController", "seekTo begin", (Object[]) null);
        boolean d = mo33368d(str);
        if (!d) {
            mo33371g(str);
        }
        int size = list.size();
        C116768d b = C116869j.m164845a().mo180853b(c.f256418c);
        int k = b.mo180745k();
        int i3 = i / 20;
        int b2 = (int) (mo33366b(str) / 20);
        Object obj = this.f60303j.get(str2);
        if (obj == null) {
            this.f60311r.remove(str2);
            return false;
        }
        C21079c a = mo33365a(str);
        if (i3 > b2 && i3 <= k) {
            Log.m105921e("MicroMsg.Mix.AudioMixController", "seekTo seekToPos > currentPos", (Object[]) null);
            int i4 = i3 - b2;
            synchronized (obj) {
                int i5 = 0;
                while (i5 < i4 && i5 < size) {
                    int size2 = list.size() - 1;
                    if (size2 >= 0 && (eVar = (C107275e) list.remove(size2)) != null && eVar.f320944g) {
                        C116867h.m164840a().mo180851c(eVar);
                    }
                    i5++;
                }
            }
            if (a != null) {
                a.mo32831w(list.size());
            }
        } else if (i3 < b2 && b2 <= k && !z) {
            Log.m105921e("MicroMsg.Mix.AudioMixController", "seekTo seekToPos < currentPos, can't write queue", (Object[]) null);
            synchronized (obj) {
                mo33373i(list);
                list.clear();
            }
            if (a != null) {
                a.mo32831w(list.size());
            }
        } else if (i3 < b2 && b2 <= k) {
            Log.m105921e("MicroMsg.Mix.AudioMixController", "seekTo seekToPos < currentPos, can write queue", (Object[]) null);
            synchronized (obj) {
                while (b2 > i3) {
                    C107275e e = b.mo180739e(b2);
                    if (e != null) {
                        list.add(list.size(), e);
                    }
                    b2--;
                }
            }
        }
        if (!d) {
            Log.m105925i("MicroMsg.Mix.AudioMixController", "is not Pause", (Object[]) null);
            synchronized (this.f60307n) {
                if (this.f60305l.containsKey(str2)) {
                    this.f60305l.put(str2, Boolean.FALSE);
                } else {
                    int i6 = C11412b.f33577a;
                    Log.m105921e("MicroMsg.Mix.AudioMixController", "The audio of the id is remove", (Object[]) null);
                }
            }
            synchronized (this.f60307n) {
                mo33370f();
            }
        }
        Log.m105925i("MicroMsg.Mix.AudioMixController", "seekTo end, time:%d", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
        return true;
    }

    /* renamed from: l */
    public void mo33376l(String str) {
        if (this.f60314u > 0) {
            this.f60314u = 0;
        }
        synchronized (this.f60307n) {
            this.f60298e.set(false);
            HashMap<String, Boolean> hashMap = this.f60299f;
            Boolean bool = Boolean.FALSE;
            hashMap.put(str, bool);
            if (!this.f60302i.contains(str)) {
                this.f60302i.add(str);
                this.f60304k.put(str, new ArrayList());
                this.f60303j.put(str, new Object());
                this.f60309p.put(str, bool);
            } else {
                int i = C11412b.f33577a;
                Log.m105921e("MicroMsg.Mix.AudioMixController", "The audio of the Id is mixing", (Object[]) null);
            }
            this.f60305l.put(str, bool);
            this.f60310q.put(str, bool);
            if (this.f60297d.get()) {
                this.f60297d.set(false);
            } else {
                ((ArrayList) this.f60308o).size();
            }
            synchronized (this.f60300g) {
                try {
                    this.f60300g.notify();
                } catch (Exception e) {
                    int i2 = C11412b.f33577a;
                    Log.printErrStackTrace("MicroMsg.Mix.AudioMixController", e, "notifyMix", new Object[0]);
                }
            }
            mo33370f();
        }
    }
}
