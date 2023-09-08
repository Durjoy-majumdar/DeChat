package com.tencent.p014mm.p136ui;

import ai3.C112789a;
import ai3.C67047d;
import ai3.C67048e;
import ai3.C67051g;
import android.content.Context;
import android.os.Looper;
import android.os.Message;
import android.util.SparseArray;
import android.widget.BaseAdapter;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import f40.C86709a0;
import h.b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import p1115h.C107922a;
import zt3.C119157j;

/* renamed from: com.tencent.mm.ui.y */
public abstract class C75029y<K, T extends C112789a> extends BaseAdapter {

    /* renamed from: v */
    public static final /* synthetic */ int f220755v = 0;

    /* renamed from: d */
    public String f220756d = "MicroMsg.CursorDataAdapter";

    /* renamed from: e */
    public boolean f220757e = true;

    /* renamed from: f */
    public C75029y<K, T>.f f220758f;

    /* renamed from: g */
    public HashMap<K, C75036e<K, T>> f220759g;

    /* renamed from: h */
    public Context f220760h;

    /* renamed from: i */
    public C75035d f220761i;

    /* renamed from: j */
    public int f220762j = 1000;

    /* renamed from: n */
    public int f220763n = 3000;

    /* renamed from: o */
    public boolean f220764o = true;

    /* renamed from: p */
    public int f220765p = 0;

    /* renamed from: q */
    public int f220766q;

    /* renamed from: r */
    public int f220767r = 0;

    /* renamed from: s */
    public boolean f220768s;

    /* renamed from: t */
    public boolean f220769t;

    /* renamed from: u */
    public C75029y<K, T>.h f220770u;

    /* renamed from: com.tencent.mm.ui.y$a */
    public class C75030a implements C75038g {
        public C75030a() {
        }

        /* renamed from: a */
        public void mo104624a() {
            boolean z;
            Iterator<C75036e<K, T>> it = C75029y.this.f220759g.values().iterator();
            while (true) {
                if (!it.hasNext()) {
                    z = true;
                    break;
                }
                C75036e next = it.next();
                if (next == null || next.f220779b == 5) {
                    if (next == null) {
                        break;
                    }
                } else {
                    break;
                }
            }
            z = false;
            if (z) {
                HashSet hashSet = new HashSet(C75029y.this.f220759g.size());
                for (C75036e<K, T> eVar : C75029y.this.f220759g.values()) {
                    hashSet.add(eVar.f220778a);
                }
                C75029y yVar = C75029y.this;
                Log.m105925i(yVar.f220756d, "newcursor all event is delete, event:%s", Integer.valueOf(yVar.f220759g.size()));
                C75029y<K, T>.f fVar = C75029y.this.f220758f;
                fVar.f192598a.mo91035R(hashSet.toArray(), (C112789a) null);
            } else if (!C75029y.this.f220759g.containsKey((Object) null)) {
                long currentTimeMillis = System.currentTimeMillis();
                SparseArray[] n = C75029y.this.mo104615n();
                SparseArray[] u = C75029y.this.mo103513u(new HashSet(C75029y.this.f220759g.values()), n);
                int length = n.length;
                if (length > 1) {
                    for (int i = 0; i < length; i++) {
                        Log.m105925i(C75029y.this.f220756d, "newcursor %d  refreshPosistion last :%d, oldpos size is %d ,newpos size is %d  ", Integer.valueOf(i), Long.valueOf(System.currentTimeMillis() - currentTimeMillis), Integer.valueOf(n[i].size()), Integer.valueOf(u[i].size()));
                    }
                } else {
                    Log.m105925i(C75029y.this.f220756d, "newcursor refreshPosistion last :%d, oldpos size is %d ,newpos size is %d  ", Long.valueOf(System.currentTimeMillis() - currentTimeMillis), Integer.valueOf(n[0].size()), Integer.valueOf(u[0].size()));
                }
                for (C75036e next2 : C75029y.this.f220759g.values()) {
                    if (next2 != null) {
                        if (next2.f220780c != null) {
                            Log.m105925i(C75029y.this.f220756d, "newcursor notify cache update : key : %s ", next2.f220778a);
                        }
                        C75029y.this.f220758f.f192598a.mo91035R(next2.f220778a, (C112789a) next2.f220780c);
                    } else {
                        Log.m105920e(C75029y.this.f220756d, "newcursor event is null ! ");
                    }
                }
                SparseArray[] d0 = C75029y.this.f220758f.f192598a.mo91037d0();
                for (int i2 = 0; i2 < d0.length; i2++) {
                    d0[i2].clear();
                    for (int i3 = 0; i3 < u[i2].size(); i3++) {
                        d0[i2].put(i3, u[i2].get(i3));
                    }
                }
                C75029y yVar2 = C75029y.this;
                Log.m105925i(yVar2.f220756d, "newcursor after resort new pos size:%d, event:%s", Integer.valueOf(yVar2.f220758f.f192598a.mo91037d0()[0].size()), Integer.valueOf(C75029y.this.f220759g.size()));
            } else {
                long currentTimeMillis2 = System.currentTimeMillis();
                C75029y yVar3 = C75029y.this;
                yVar3.mo104617p(yVar3.mo103507g(yVar3.mo103506f()), true, false);
                Log.m105925i(C75029y.this.f220756d, "cache unuseful,reset cursor,last : %d", Long.valueOf(System.currentTimeMillis() - currentTimeMillis2));
            }
            C75029y.this.f220759g.clear();
        }
    }

    /* renamed from: com.tencent.mm.ui.y$b */
    public class C75031b implements C75038g {

        /* renamed from: a */
        public final /* synthetic */ C75037f f220772a;

        public C75031b(C75037f fVar) {
            this.f220772a = fVar;
        }

        /* renamed from: a */
        public void mo104624a() {
            C75029y.this.mo104622w(this.f220772a);
        }
    }

    /* renamed from: com.tencent.mm.ui.y$c */
    public class C75032c implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C75037f f220774d;

        /* renamed from: com.tencent.mm.ui.y$c$a */
        public class C75033a implements Runnable {

            /* renamed from: com.tencent.mm.ui.y$c$a$a */
            public class C75034a implements C75038g {
                public C75034a() {
                }

                /* renamed from: a */
                public void mo104624a() {
                    C75032c cVar = C75032c.this;
                    C75029y yVar = C75029y.this;
                    C75037f fVar = cVar.f220774d;
                    int i = C75029y.f220755v;
                    yVar.mo104622w(fVar);
                }
            }

            public C75033a() {
            }

            public void run() {
                C75029y yVar = C75029y.this;
                C75034a aVar = new C75034a();
                int i = C75029y.f220755v;
                yVar.mo104623x(aVar);
            }
        }

        public C75032c(C75037f fVar) {
            this.f220774d = fVar;
        }

        public void run() {
            int a = this.f220774d.mo91064a();
            Log.m105925i(C75029y.this.f220756d, "select db count: %d", Integer.valueOf(a));
            MMHandlerThread.postToMainThread(new C75033a());
        }
    }

    /* renamed from: com.tencent.mm.ui.y$d */
    public interface C75035d {
        /* renamed from: a */
        void mo103572a(Object obj);

        /* renamed from: b */
        void mo103573b(Object obj);
    }

    /* renamed from: com.tencent.mm.ui.y$e */
    public static class C75036e<K, T> {

        /* renamed from: a */
        public K f220778a;

        /* renamed from: b */
        public int f220779b;

        /* renamed from: c */
        public T f220780c;

        public C75036e(K k, int i, T t) {
            this.f220778a = k;
            this.f220779b = i;
            this.f220780c = t;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C75036e.class != obj.getClass()) {
                return false;
            }
            C75036e eVar = (C75036e) obj;
            if (this.f220779b != eVar.f220779b) {
                return false;
            }
            K k = this.f220778a;
            if (k == null) {
                if (eVar.f220778a != null) {
                    return false;
                }
            } else if (!k.equals(eVar.f220778a)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            int i = (this.f220779b + 31) * 31;
            K k = this.f220778a;
            return i + (k == null ? 0 : k.hashCode());
        }
    }

    /* renamed from: com.tencent.mm.ui.y$g */
    public interface C75038g {
        /* renamed from: a */
        void mo104624a();
    }

    /* renamed from: com.tencent.mm.ui.y$h */
    public class C75039h {

        /* renamed from: a */
        public C75029y<K, T>.C107922a f220782a = new C75040a(Looper.getMainLooper());

        /* renamed from: b */
        public C75029y<K, T>.b f220783b = new C75041b(C86709a0.m107525e().getLooper());

        /* renamed from: c */
        public LinkedList<Integer> f220784c;

        /* renamed from: d */
        public int f220785d;

        /* renamed from: com.tencent.mm.ui.y$h$a */
        public class C75040a extends MMHandler {

            /* renamed from: a */
            public boolean f220787a;

            public C75040a(Looper looper) {
                super(looper);
            }

            public void handleMessage(Message message) {
                super.handleMessage(message);
                if (!this.f220787a) {
                    synchronized (C75039h.this) {
                        C75039h hVar = C75039h.this;
                        hVar.f220785d = hVar.mo104630c();
                        C75039h hVar2 = C75039h.this;
                        Log.m105925i(C75029y.this.f220756d, "newcursor updateWorkerRefresh status:%d, what:%s", Integer.valueOf(hVar2.f220785d), Integer.valueOf(message.what));
                    }
                    int i = message.what;
                    if (i == 1) {
                        C75029y.this.mo104616o();
                    } else if (i == 2) {
                        C75029y.this.mo104617p((C75037f) message.obj, false, true);
                    }
                }
            }
        }

        /* renamed from: com.tencent.mm.ui.y$h$b */
        public class C75041b extends MMHandler {

            /* renamed from: g */
            public static final /* synthetic */ int f220789g = 0;

            /* renamed from: a */
            public long f220790a;

            /* renamed from: b */
            public long f220791b;

            /* renamed from: c */
            public boolean f220792c;

            /* renamed from: d */
            public final int f220793d = (hashCode() | 1910);

            /* renamed from: e */
            public final int f220794e = (hashCode() | 1914);

            public C75041b(Looper looper) {
                super(looper);
                C75039h.this.f220784c = new LinkedList<>();
            }

            public void handleMessage(Message message) {
                super.handleMessage(message);
                int i = message.what;
                if (i == this.f220794e) {
                    removeMessages(this.f220793d);
                    long currentTimeMillis = System.currentTimeMillis();
                    this.f220792c = true;
                    Object obj = message.obj;
                    if (obj instanceof Boolean) {
                        this.f220792c = ((Boolean) obj).booleanValue();
                    }
                    long j = this.f220791b;
                    C75039h hVar = C75039h.this;
                    C75029y yVar = C75029y.this;
                    int i2 = yVar.f220762j;
                    if (currentTimeMillis - j <= ((long) i2) && currentTimeMillis - j >= 0) {
                        long j2 = this.f220790a;
                        if ((j2 == 0 || currentTimeMillis - j2 <= ((long) yVar.f220763n)) && currentTimeMillis - j2 >= 0 && this.f220792c) {
                            sendEmptyMessageDelayed(this.f220793d, (long) i2);
                            this.f220791b = currentTimeMillis;
                        }
                    }
                    C75039h.m89986a(hVar);
                    this.f220791b = currentTimeMillis;
                } else if (i == this.f220793d) {
                    C75039h.m89986a(C75039h.this);
                }
            }
        }

        public C75039h() {
        }

        /* renamed from: a */
        public static void m89986a(C75039h hVar) {
            int c;
            synchronized (hVar) {
                c = hVar.mo104630c();
                hVar.f220784c.clear();
            }
            if (c == 2) {
                long currentTimeMillis = System.currentTimeMillis();
                C75029y<K, T>.f g = C75029y.this.mo103507g(C75029y.this.mo103506f());
                int a = g.mo91064a();
                Log.m105925i(C75029y.this.f220756d, "newcursor fillCursor last : %d  count %d ", Long.valueOf(System.currentTimeMillis() - currentTimeMillis), Integer.valueOf(a));
                C75029y<K, T>.C107922a aVar = hVar.f220782a;
                aVar.getClass();
                Message obtain = Message.obtain();
                obtain.obj = g;
                obtain.what = 2;
                aVar.sendMessage(obtain);
                return;
            }
            hVar.f220782a.sendEmptyMessage(1);
        }

        /* renamed from: b */
        public final void mo104629b() {
            C75029y<K, T>.b bVar = this.f220783b;
            bVar.removeMessages(bVar.f220793d);
            bVar.removeMessages(bVar.f220794e);
            C75029y<K, T>.C107922a aVar = this.f220782a;
            aVar.f220787a = true;
            aVar.removeMessages(1);
            aVar.removeMessages(2);
            this.f220784c.clear();
            this.f220785d = 0;
        }

        /* renamed from: c */
        public final int mo104630c() {
            if (this.f220784c.size() > 1) {
                return 2;
            }
            if (this.f220784c.size() == 1) {
                return this.f220784c.get(0).intValue();
            }
            return 0;
        }
    }

    public C75029y(boolean z, Context context, int i) {
        this.f220760h = context;
        this.f220768s = z;
        this.f220766q = i;
        Log.m105925i("MicroMsg.CursorDataAdapter", "newCursor setPageSize %d", Integer.valueOf(i));
    }

    /* renamed from: a */
    public final void mo104606a(String str, boolean z) {
        if (!(this.f220765p == 0)) {
            boolean z2 = this.f220764o;
            if (z2 || z) {
                if (!z) {
                    Log.m105925i(this.f220756d, "newcursor cache needRefresh : needRefreshInfront :%b from : %s", Boolean.valueOf(z2), str);
                }
                mo104620t(false, true);
            }
        }
    }

    /* renamed from: b */
    public final void mo104607b() {
        boolean z;
        if (this.f220768s) {
            int i = this.f220758f.f192598a.mo91042w0() ? 1 : 2;
            int i2 = this.f220767r;
            if (!(i == i2 || i2 == 0)) {
                C75029y<K, T>.h hVar = this.f220770u;
                if (hVar != null) {
                    synchronized (hVar) {
                        z = hVar.f220785d != 0;
                    }
                    if (z) {
                        mo104617p(mo103507g(mo103506f()), true, false);
                    }
                }
                Log.m105925i(this.f220756d, "newcursor change update stats  %d ", Integer.valueOf(i));
            }
            this.f220767r = i;
        }
    }

    /* renamed from: d */
    public void mo104608d(boolean z) {
        C75029y<K, T>.h hVar;
        C75029y<K, T>.f fVar = this.f220758f;
        if (fVar != null) {
            fVar.f192598a.close();
            fVar.f192598a = null;
            this.f220758f = null;
        }
        if (z && (hVar = this.f220770u) != null) {
            synchronized (hVar) {
                Log.m105924i(C75029y.this.f220756d, "newcursor quit ");
                hVar.mo104629b();
            }
            this.f220770u = null;
            HashMap<K, C75036e<K, T>> hashMap = this.f220759g;
            if (hashMap != null) {
                hashMap.clear();
                Log.m105924i(this.f220756d, "newcursor closeCursor,clear events");
            }
        }
        this.f220765p = 0;
        this.f220767r = 0;
    }

    /* renamed from: f */
    public abstract C67047d<K> mo103506f();

    /* renamed from: g */
    public abstract C75029y<K, T>.f mo103507g(C67047d<K> dVar);

    public int getCount() {
        if (this.f220758f == null) {
            long currentTimeMillis = System.currentTimeMillis();
            mo104621v(mo103506f());
            Log.m105925i(this.f220756d, "newcursor createCursor last : %d", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
        }
        mo104606a("getcount", false);
        C75029y<K, T>.f fVar = this.f220758f;
        if (fVar != null) {
            return fVar.mo91064a();
        }
        Log.m105928w(this.f220756d, "[getCount] is zero!");
        return 0;
    }

    public long getItemId(int i) {
        return 0;
    }

    /* renamed from: h */
    public abstract T mo103510h();

    /* renamed from: i */
    public int mo104611i() {
        HashMap<K, C75036e<K, T>> hashMap = this.f220759g;
        if (hashMap == null || hashMap.size() == 0) {
            return 0;
        }
        return this.f220759g.containsKey((Object) null) ? 2 : 1;
    }

    /* renamed from: j */
    public int mo104612j(int i) {
        C67047d dVar;
        C75029y<K, T>.f fVar = this.f220758f;
        if (fVar == null || (dVar = fVar.f192598a) == null) {
            return 0;
        }
        if (dVar instanceof C67048e) {
            return ((C67048e) dVar).f192596f[i].getCount();
        }
        throw new RuntimeException("the cursor is not instanceof MergeHeapCursor ,please call getCount() instead ");
    }

    /* renamed from: k */
    public T getItem(int i) {
        if (this.f220758f == null) {
            mo104621v(mo103506f());
        }
        mo104606a("getItem", false);
        this.f220758f.f192598a.moveToPosition(i);
        T item = this.f220758f.f192598a.getItem(i);
        if (item != null) {
            C67047d dVar = this.f220758f.f192598a;
            item.mo69646w();
        } else {
            Log.m105921e(this.f220756d, "newcursor getItem error %d", Integer.valueOf(i));
        }
        return item;
    }

    /* renamed from: l */
    public HashMap<Object, T> mo104614l() {
        C75029y<K, T>.f fVar = this.f220758f;
        if (fVar == null) {
            return null;
        }
        return fVar.f192598a.mo91032B0();
    }

    /* renamed from: n */
    public SparseArray<K>[] mo104615n() {
        SparseArray[] d0;
        C75029y<K, T>.f fVar = this.f220758f;
        if (fVar == null || (d0 = fVar.f192598a.mo91037d0()) == null) {
            return null;
        }
        int length = d0.length;
        SparseArray<K>[] sparseArrayArr = new SparseArray[length];
        for (int i = 0; i < length; i++) {
            sparseArrayArr[i] = new SparseArray<>();
            for (int i2 = 0; i2 < d0[i].size(); i2++) {
                sparseArrayArr[i].put(i2, d0[i].get(i2));
            }
        }
        return sparseArrayArr;
    }

    /* renamed from: o */
    public final void mo104616o() {
        C75029y<K, T>.f fVar = this.f220758f;
        if (fVar == null || fVar.f192598a.isClosed() || this.f220759g.size() != 0) {
            mo104623x(new C75030a());
        } else {
            Log.m105924i(this.f220756d, "events size is 0  ");
        }
    }

    /* renamed from: p */
    public final void mo104617p(C75029y<K, T>.f fVar, boolean z, boolean z2) {
        boolean z3;
        if (z) {
            C75029y<K, T>.h hVar = this.f220770u;
            if (hVar != null) {
                synchronized (hVar) {
                    z3 = hVar.f220785d != 0;
                }
                if (z3) {
                    C75029y<K, T>.h hVar2 = this.f220770u;
                    synchronized (hVar2) {
                        Log.m105924i(C75029y.this.f220756d, "newcursor resetQueue ");
                        hVar2.mo104629b();
                        hVar2.f220782a = new C75039h.C75040a(Looper.getMainLooper());
                        hVar2.f220783b = new C75039h.C75041b(C86709a0.m107525e().getLooper());
                    }
                }
            }
            HashMap<K, C75036e<K, T>> hashMap = this.f220759g;
            if (hashMap != null) {
                hashMap.clear();
            }
        }
        if (z2 && fVar != null && !fVar.f192599b) {
            mo104623x(new C75031b(fVar));
        } else if (fVar == null || !fVar.f192599b || !z2) {
            mo104622w(fVar);
        } else {
            ((C119157j) C119157j.f356862d).mo183875f(new C75032c(fVar));
        }
    }

    /* renamed from: q */
    public void mo104618q(K k, int i) {
        mo104619r(k, i, (C112789a) null, true);
    }

    /* renamed from: r */
    public void mo104619r(K k, int i, T t, boolean z) {
        boolean z2;
        if (this.f220758f != null) {
            if (this.f220759g == null) {
                this.f220759g = new HashMap<>();
            }
            boolean containsKey = this.f220759g.containsKey((Object) null);
            if (i == 5 || !this.f220768s || i == 1) {
                if (i != 5) {
                    this.f220759g.clear();
                    this.f220759g.put((Object) null, (Object) null);
                } else if (!containsKey) {
                    this.f220759g.put(k, new C75036e(k, i, t));
                }
                Log.m105925i(this.f220756d, "newcursor syncHandle is true ,changeType is %d  ", Integer.valueOf(i));
                z2 = true;
            } else if (containsKey) {
                Log.m105924i(this.f220756d, "newcursor need reset ,return ");
                return;
            } else {
                if (this.f220767r != 1) {
                    this.f220759g.clear();
                    this.f220759g.put((Object) null, (Object) null);
                } else if (this.f220758f.f192598a.mo91034N(k) || i == 2) {
                    HashMap<K, C75036e<K, T>> hashMap = this.f220759g;
                    C75036e eVar = new C75036e(k, i, t);
                    if (eVar.f220779b == 2 && this.f220758f.f192598a.mo91034N(k)) {
                        eVar.f220779b = 3;
                    }
                    C75036e eVar2 = hashMap.get(k);
                    if (eVar2 != null) {
                        hashMap.remove(eVar2);
                        int i2 = eVar.f220779b;
                        if (i2 == 2) {
                            int i3 = eVar2.f220779b;
                            if (i3 == 2) {
                                Log.m105924i(this.f220756d, "newcursor processEvent last insert, now insert, impossible");
                                eVar.f220779b = 2;
                            } else if (i3 != 5) {
                                Log.m105924i(this.f220756d, "newcursor processEvent last update, now insert, impossible");
                                eVar.f220779b = 2;
                            } else {
                                eVar.f220779b = 3;
                            }
                        } else if (i2 != 5) {
                            int i4 = eVar2.f220779b;
                            if (i4 == 2) {
                                eVar.f220779b = 2;
                            } else if (i4 != 5) {
                                eVar.f220779b = 3;
                            } else {
                                Log.m105924i(this.f220756d, "newcursor processEvent last delete, now update, impossible");
                                eVar.f220779b = 3;
                            }
                        } else {
                            int i5 = eVar2.f220779b;
                            if (i5 != 2) {
                                if (i5 != 5) {
                                    eVar.f220779b = 5;
                                } else {
                                    Log.m105924i(this.f220756d, "newcursor processEvent last delete, now delete, impossible");
                                    eVar.f220779b = 5;
                                }
                            }
                            Log.m105925i(this.f220756d, "newcursor add event events size %d", Integer.valueOf(this.f220759g.size()));
                        }
                        hashMap.put(k, eVar);
                    } else {
                        hashMap.put(k, eVar);
                    }
                    if (!this.f220758f.f192598a.mo91036X(hashMap.size())) {
                        Log.m105925i(this.f220756d, "newcursor events size exceed limit :size is :  %d", Integer.valueOf(hashMap.size()));
                        hashMap.clear();
                        hashMap.put((Object) null, (Object) null);
                    }
                    Log.m105925i(this.f220756d, "newcursor add event events size %d", Integer.valueOf(this.f220759g.size()));
                } else {
                    Log.m105924i(this.f220756d, "newcursor event pass ");
                }
                z2 = false;
            }
            int i6 = mo104611i();
            this.f220765p = i6;
            String str = this.f220756d;
            Object[] objArr = new Object[3];
            objArr[0] = Integer.valueOf(i6);
            objArr[1] = Boolean.valueOf(this.f220767r == 1);
            objArr[2] = Integer.valueOf(i);
            Log.m105925i(str, "newcursor refreshStatus: %d ,hasLoadedAllDataStatus %b changeType :%d ", objArr);
            if (z2) {
                Log.m105924i(this.f220756d, "newcursor event is refresh sync ");
                mo104620t(true, z);
            } else if (this.f220757e && this.f220764o) {
                mo104620t(false, z);
            }
        }
    }

    /* renamed from: s */
    public abstract ArrayList<T> mo103512s(ArrayList<K> arrayList);

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0071, code lost:
        if (r0 == false) goto L_0x0077;
     */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0084  */
    /* renamed from: t */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo104620t(boolean r8, boolean r9) {
        /*
            r7 = this;
            boolean r0 = r7.f220769t
            r1 = 0
            r2 = 2
            if (r0 != 0) goto L_0x0063
            if (r8 == 0) goto L_0x0009
            goto L_0x0063
        L_0x0009:
            int r8 = r7.mo104611i()
            if (r8 != 0) goto L_0x0017
            java.lang.String r8 = r7.f220756d
            java.lang.String r9 = "newcursor need not change "
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r9)
            return
        L_0x0017:
            if (r8 != r2) goto L_0x0025
            java.lang.String r0 = r7.f220756d
            java.lang.String r2 = "newcursor enqueueMessage resetcursor "
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r2)
            java.util.HashMap<K, com.tencent.mm.ui.y$e<K, T>> r0 = r7.f220759g
            r0.clear()
        L_0x0025:
            com.tencent.mm.ui.y<K, T>$h r0 = r7.f220770u
            if (r0 != 0) goto L_0x0030
            com.tencent.mm.ui.y$h r0 = new com.tencent.mm.ui.y$h
            r0.<init>()
            r7.f220770u = r0
        L_0x0030:
            com.tencent.mm.ui.y<K, T>$h r0 = r7.f220770u
            monitor-enter(r0)
            java.util.LinkedList<java.lang.Integer> r2 = r0.f220784c     // Catch:{ all -> 0x0060 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x0060 }
            boolean r2 = r2.contains(r3)     // Catch:{ all -> 0x0060 }
            if (r2 != 0) goto L_0x0048
            java.util.LinkedList<java.lang.Integer> r2 = r0.f220784c     // Catch:{ all -> 0x0060 }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x0060 }
            r2.add(r8)     // Catch:{ all -> 0x0060 }
        L_0x0048:
            int r8 = r0.mo104630c()     // Catch:{ all -> 0x0060 }
            r0.f220785d = r8     // Catch:{ all -> 0x0060 }
            com.tencent.mm.ui.y<K, T>$h.b r8 = r0.f220783b     // Catch:{ all -> 0x0060 }
            int r2 = r8.f220794e     // Catch:{ all -> 0x0060 }
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r9)     // Catch:{ all -> 0x0060 }
            android.os.Message r9 = r8.obtainMessage(r2, r9)     // Catch:{ all -> 0x0060 }
            r8.sendMessage(r9)     // Catch:{ all -> 0x0060 }
            monitor-exit(r0)
            goto L_0x00f8
        L_0x0060:
            r8 = move-exception
            monitor-exit(r0)
            throw r8
        L_0x0063:
            com.tencent.mm.ui.y<K, T>$h r8 = r7.f220770u
            r9 = 1
            if (r8 == 0) goto L_0x0077
            monitor-enter(r8)
            int r0 = r8.f220785d     // Catch:{ all -> 0x0074 }
            if (r0 == 0) goto L_0x006f
            r0 = 1
            goto L_0x0070
        L_0x006f:
            r0 = 0
        L_0x0070:
            monitor-exit(r8)
            if (r0 != 0) goto L_0x007d
            goto L_0x0077
        L_0x0074:
            r9 = move-exception
            monitor-exit(r8)
            throw r9
        L_0x0077:
            int r8 = r7.mo104611i()
            if (r8 == 0) goto L_0x007f
        L_0x007d:
            r8 = 1
            goto L_0x0080
        L_0x007f:
            r8 = 0
        L_0x0080:
            if (r8 != 0) goto L_0x0084
            goto L_0x00f8
        L_0x0084:
            int r8 = r7.mo104611i()
            com.tencent.mm.ui.y<K, T>$h r0 = r7.f220770u
            if (r0 == 0) goto L_0x00d6
            monitor-enter(r0)
            int r3 = r0.f220785d     // Catch:{ all -> 0x00d3 }
            monitor-exit(r0)
            java.lang.String r0 = r7.f220756d
            java.lang.String r4 = "newcursor mWorkerHandler.isHandingMsg,type is %d "
            java.lang.Object[] r5 = new java.lang.Object[r9]
            java.lang.Integer r6 = java.lang.Integer.valueOf(r3)
            r5[r1] = r6
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r4, r5)
            if (r3 == 0) goto L_0x00cf
            com.tencent.mm.ui.y<K, T>$h r0 = r7.f220770u
            monitor-enter(r0)
            com.tencent.mm.ui.y r4 = com.tencent.p014mm.p136ui.C75029y.this     // Catch:{ all -> 0x00cc }
            java.lang.String r4 = r4.f220756d     // Catch:{ all -> 0x00cc }
            java.lang.String r5 = "newcursor resetQueue "
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r5)     // Catch:{ all -> 0x00cc }
            r0.mo104629b()     // Catch:{ all -> 0x00cc }
            com.tencent.mm.ui.y$h$a r4 = new com.tencent.mm.ui.y$h$a     // Catch:{ all -> 0x00cc }
            android.os.Looper r5 = android.os.Looper.getMainLooper()     // Catch:{ all -> 0x00cc }
            r4.<init>(r5)     // Catch:{ all -> 0x00cc }
            r0.f220782a = r4     // Catch:{ all -> 0x00cc }
            com.tencent.mm.ui.y$h$b r4 = new com.tencent.mm.ui.y$h$b     // Catch:{ all -> 0x00cc }
            com.tencent.mm.sdk.platformtools.MMHandlerThread r5 = f40.C86709a0.m107525e()     // Catch:{ all -> 0x00cc }
            android.os.Looper r5 = r5.getLooper()     // Catch:{ all -> 0x00cc }
            r4.<init>(r5)     // Catch:{ all -> 0x00cc }
            r0.f220783b = r4     // Catch:{ all -> 0x00cc }
            monitor-exit(r0)
            goto L_0x00cf
        L_0x00cc:
            r8 = move-exception
            monitor-exit(r0)
            throw r8
        L_0x00cf:
            if (r8 == r2) goto L_0x00d6
            r8 = r3
            goto L_0x00d6
        L_0x00d3:
            r8 = move-exception
            monitor-exit(r0)
            throw r8
        L_0x00d6:
            java.lang.String r0 = r7.f220756d
            java.lang.String r3 = "newcursor ensureNewState  refreshstatus is %d "
            java.lang.Object[] r4 = new java.lang.Object[r9]
            java.lang.Integer r5 = java.lang.Integer.valueOf(r8)
            r4[r1] = r5
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r3, r4)
            r7.f220765p = r1
            if (r8 != r2) goto L_0x00f5
            ai3.d r8 = r7.mo103506f()
            com.tencent.mm.ui.y$f r8 = r7.mo103507g(r8)
            r7.mo104617p(r8, r9, r9)
            goto L_0x00f8
        L_0x00f5:
            r7.mo104616o()
        L_0x00f8:
            r7.f220765p = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.C75029y.mo104620t(boolean, boolean):void");
    }

    /* renamed from: u */
    public abstract SparseArray<K>[] mo103513u(HashSet<C75036e<K, T>> hashSet, SparseArray<K>[] sparseArrayArr);

    /* renamed from: v */
    public void mo104621v(C67047d<K> dVar) {
        mo104608d(true);
        C75029y<K, T>.f fVar = this.f220758f;
        if (fVar == null || fVar.f192598a != dVar) {
            if (fVar != null && !fVar.f192598a.isClosed()) {
                C75029y<K, T>.f fVar2 = this.f220758f;
                fVar2.f192598a.close();
                fVar2.f192598a = null;
                this.f220758f = null;
            }
            C75029y<K, T>.f g = mo103507g(dVar);
            this.f220758f = g;
            g.mo91064a();
            mo104607b();
            notifyDataSetChanged();
        }
    }

    /* renamed from: w */
    public final void mo104622w(C75029y<K, T>.f fVar) {
        mo104608d(false);
        this.f220758f = fVar;
        fVar.mo91064a();
        mo104607b();
    }

    /* renamed from: x */
    public final void mo104623x(C75038g gVar) {
        long currentTimeMillis = System.currentTimeMillis();
        C75035d dVar = this.f220761i;
        if (dVar != null) {
            dVar.mo103573b(this);
        }
        if (gVar != null) {
            gVar.mo104624a();
        }
        notifyDataSetChanged();
        C75035d dVar2 = this.f220761i;
        if (dVar2 != null) {
            dVar2.mo103572a(this);
        }
        C75029y<K, T>.h hVar = this.f220770u;
        if (hVar != null) {
            synchronized (hVar) {
                C75029y<K, T>.b bVar = hVar.f220783b;
                int i = C75039h.C75041b.f220789g;
                bVar.getClass();
                bVar.f220790a = System.currentTimeMillis();
            }
        }
        Log.m105925i(this.f220756d, "newcursor update callback last :%d ", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    /* renamed from: com.tencent.mm.ui.y$f */
    public class C75037f extends C67051g<K, T> {
        public C75037f(C67047d<K> dVar, boolean z) {
            super(dVar, C75029y.this.f220766q, z);
        }

        public C75037f(C67047d<K> dVar) {
            super(dVar, C75029y.this.f220766q, false);
        }
    }

    public C75029y(Context context, int i, int i2) {
        this.f220760h = context;
        this.f220768s = true;
        this.f220769t = false;
        if (i > 2000) {
            i = 2000;
        } else if (i < 100) {
            i = 100;
        }
        if (i2 > 5000) {
            i2 = 5000;
        } else if (i2 < 1000) {
            i2 = 1000;
        }
        this.f220762j = i;
        this.f220763n = i2;
    }
}
