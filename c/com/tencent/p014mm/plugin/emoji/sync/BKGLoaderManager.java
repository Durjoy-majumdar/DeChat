package com.tencent.p014mm.plugin.emoji.sync;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Process;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.ActivateEvent;
import com.tencent.p014mm.autogen.events.EmojiSyncTaskEvent;
import com.tencent.p014mm.plugin.emoji.sync.C93124c;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.NetStatusUtil;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.Vector;
import p595ll.C46875a;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.emoji.sync.BKGLoaderManager */
public class BKGLoaderManager implements C41063f {

    /* renamed from: a */
    public boolean f110545a = false;

    /* renamed from: b */
    public boolean f110546b = false;

    /* renamed from: c */
    public boolean f110547c = false;

    /* renamed from: d */
    public C41062e f110548d = null;

    /* renamed from: e */
    public C93124c f110549e;

    /* renamed from: f */
    public Vector<C41062e> f110550f = new Vector<>();

    /* renamed from: g */
    public final List<C41062e<?>> f110551g = new LinkedList();

    /* renamed from: h */
    public final Vector<C41062e<?>> f110552h = new Vector<>();

    /* renamed from: i */
    public Set<C46875a> f110553i = new HashSet();

    /* renamed from: j */
    public C41058c f110554j;

    /* renamed from: k */
    public int f110555k = -1;

    /* renamed from: l */
    public final boolean[] f110556l = {false};

    /* renamed from: m */
    public Runnable f110557m = new C41056a();

    /* renamed from: n */
    public IListener f110558n;

    /* renamed from: o */
    public IListener f110559o;

    /* renamed from: com.tencent.mm.plugin.emoji.sync.BKGLoaderManager$a */
    public class C41056a implements Runnable {
        public C41056a() {
        }

        public void run() {
            BKGLoaderManager bKGLoaderManager = BKGLoaderManager.this;
            bKGLoaderManager.getClass();
            if (bKGLoaderManager.f110546b || bKGLoaderManager.f110547c) {
                bKGLoaderManager.mo64097f();
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.emoji.sync.BKGLoaderManager$b */
    public class C41057b implements Runnable {
        public C41057b() {
        }

        public void run() {
            Set<C46875a> set = BKGLoaderManager.this.f110553i;
            if (set != null && ((HashSet) set).size() > 0) {
                Iterator it = ((HashSet) BKGLoaderManager.this.f110553i).iterator();
                while (it.hasNext()) {
                    ((C46875a) it.next()).mo72082a();
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.emoji.sync.BKGLoaderManager$c */
    public final class C41058c extends BroadcastReceiver {

        /* renamed from: com.tencent.mm.plugin.emoji.sync.BKGLoaderManager$c$a */
        public class C41059a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ Context f110565d;

            public C41059a(Context context) {
                this.f110565d = context;
            }

            public void run() {
                int netType = NetStatusUtil.getNetType(this.f110565d);
                Log.m105925i("MicroMsg.BKGLoader.BKGLoaderManager", "[cpan] network change type:%d", Integer.valueOf(netType));
                BKGLoaderManager bKGLoaderManager = BKGLoaderManager.this;
                if (bKGLoaderManager.f110555k != netType) {
                    if (bKGLoaderManager.f110545a || NetStatusUtil.isWifi(MMApplicationContext.getContext())) {
                        BKGLoaderManager bKGLoaderManager2 = BKGLoaderManager.this;
                        if (!bKGLoaderManager2.f110547c) {
                            bKGLoaderManager2.mo64097f();
                        }
                    } else {
                        BKGLoaderManager bKGLoaderManager3 = BKGLoaderManager.this;
                        synchronized (bKGLoaderManager3) {
                            bKGLoaderManager3.f110546b = false;
                            bKGLoaderManager3.f110547c = false;
                            bKGLoaderManager3.f110545a = false;
                            bKGLoaderManager3.mo64094c();
                            C41062e eVar = bKGLoaderManager3.f110548d;
                            if (eVar != null) {
                                eVar.mo64105a();
                            }
                        }
                    }
                    BKGLoaderManager.this.f110555k = netType;
                }
            }
        }

        public C41058c() {
        }

        public void onReceive(Context context, Intent intent) {
            ((C119157j) C119157j.f356862d).mo183875f(new C41059a(context));
        }
    }

    public BKGLoaderManager(C93124c cVar) {
        C40008f fVar = C40008f.f107254d;
        this.f110558n = new IListener<ActivateEvent>(fVar) {
            {
                this.__eventId = -1435144905;
            }

            public boolean callback(IEvent iEvent) {
                ((C119157j) C119157j.f356862d).mo183876g(new BKGLoaderManager$2$$a(this, (ActivateEvent) iEvent), "BKG-mActivateEvent");
                return false;
            }
        };
        this.f110559o = new IListener<EmojiSyncTaskEvent>(fVar) {
            {
                this.__eventId = 1273581380;
            }

            public boolean callback(IEvent iEvent) {
                EmojiSyncTaskEvent emojiSyncTaskEvent = (EmojiSyncTaskEvent) iEvent;
                if (!(emojiSyncTaskEvent instanceof EmojiSyncTaskEvent) || Util.isNullOrNil(emojiSyncTaskEvent.f107420d.f107422b)) {
                    return false;
                }
                BKGLoaderManager bKGLoaderManager = BKGLoaderManager.this;
                EmojiSyncTaskEvent.C40056a aVar = emojiSyncTaskEvent.f107420d;
                bKGLoaderManager.mo64095d(aVar.f107422b, aVar.f107421a, aVar.f107423c);
                return false;
            }
        };
        this.f110549e = cVar;
        Process.myUid();
        this.f110555k = NetStatusUtil.getNetType(MMApplicationContext.getContext());
    }

    /* renamed from: a */
    public synchronized void mo64092a(List<C41062e<?>> list) {
        if (list != null) {
            for (C41062e next : list) {
                boolean z = false;
                for (C41062e<?> key : this.f110551g) {
                    if (Util.isEqual(next.getKey(), key.getKey())) {
                        z = true;
                    }
                }
                if (!z) {
                    ((LinkedList) this.f110551g).addAll(list);
                    Log.m105925i("MicroMsg.BKGLoader.BKGLoaderManager", "addNoWifiTask: %s", next.getKey());
                }
            }
        }
    }

    /* renamed from: b */
    public synchronized void mo64093b(List<C41062e<?>> list) {
        if (list != null) {
            if (list.size() > 0) {
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    C41062e eVar = list.get(i);
                    C41062e eVar2 = this.f110548d;
                    if (eVar2 != null && eVar2.equals(eVar)) {
                        Object[] objArr = new Object[1];
                        objArr[0] = eVar == null ? "task is null" : eVar.getKey();
                        Log.m105925i("MicroMsg.BKGLoader.BKGLoaderManager", "[cpan] currentTask equals task is has exist:%s", objArr);
                    } else if (eVar == null || this.f110552h.contains(eVar)) {
                        Object[] objArr2 = new Object[1];
                        objArr2[0] = eVar == null ? "task is null" : eVar.getKey();
                        Log.m105925i("MicroMsg.BKGLoader.BKGLoaderManager", "[cpan] task is has exist:%s", objArr2);
                    } else {
                        this.f110552h.add(eVar);
                    }
                }
            }
        }
    }

    /* renamed from: c */
    public void mo64094c() {
        ((C119157j) C119157j.f356862d).mo183895z(new C41057b());
    }

    /* renamed from: d */
    public synchronized void mo64095d(String str, int i, boolean z) {
        Log.m105925i("MicroMsg.BKGLoader.BKGLoaderManager", "[cpan] task is finish. key:%s success:%b", str, Boolean.valueOf(z));
        if (this.f110548d != null) {
            if (!Util.isNullOrNil(str)) {
                if (this.f110550f.contains(this.f110548d)) {
                    this.f110550f.remove(this.f110548d);
                } else {
                    if (((LinkedList) this.f110551g).contains(this.f110548d)) {
                        ((LinkedList) this.f110551g).remove(this.f110548d);
                    } else if (this.f110552h.contains(this.f110548d)) {
                        this.f110552h.remove(this.f110548d);
                    }
                }
                if (!z) {
                    Log.m105924i("MicroMsg.BKGLoader.BKGLoaderManager", "retry later.");
                } else if (i != 2) {
                    ((C119157j) C119157j.f356862d).mo183895z(new C41061d(this, i));
                }
                if (i == 2) {
                    ((C119157j) C119157j.f356862d).mo183878i(this.f110557m, 3000);
                } else {
                    ((C119157j) C119157j.f356862d).mo183878i(this.f110557m, 1000);
                }
            }
        }
        Log.m105920e("MicroMsg.BKGLoader.BKGLoaderManager", "CurrentTask or key is null. or key is no equal crrentkey ");
    }

    /* renamed from: e */
    public synchronized void mo64096e() {
        Vector<C41062e> vector = this.f110550f;
        if (vector != null) {
            vector.clear();
        }
        Vector<C41062e<?>> vector2 = this.f110552h;
        if (vector2 != null) {
            vector2.clear();
        }
        ((LinkedList) this.f110551g).clear();
        this.f110546b = false;
        this.f110547c = false;
    }

    /* renamed from: f */
    public synchronized void mo64097f() {
        Log.m105925i("MicroMsg.BKGLoader.BKGLoaderManager", "tryToStart: %s", Boolean.valueOf(this.f110545a));
        if (!NetStatusUtil.isWifi(MMApplicationContext.getContext()) && !this.f110545a) {
            if (this.f110551g.isEmpty()) {
                if (NetStatusUtil.isConnected(MMApplicationContext.getContext())) {
                    Log.m105924i("MicroMsg.BKGLoader.BKGLoaderManager", "[dz tryToStart is 3g or 4g]");
                    this.f110546b = false;
                    this.f110547c = false;
                    mo64094c();
                } else {
                    Log.m105924i("MicroMsg.BKGLoader.BKGLoaderManager", "[dz tryToStart is not wifi, 3g nor 4g]");
                }
            }
        }
        Vector<C41062e> vector = this.f110550f;
        if (vector == null || vector.size() <= 0) {
            Log.m105924i("MicroMsg.BKGLoader.BKGLoaderManager", "[cpan] tryToStart no task list .");
            Vector<C41062e> vector2 = this.f110550f;
            if (vector2 == null || vector2.size() <= 0) {
                this.f110546b = false;
            }
            Vector<C41062e> vector3 = this.f110550f;
            if ((vector3 == null || vector3.size() <= 0) && this.f110546b) {
                this.f110546b = false;
            }
            mo64094c();
        } else {
            this.f110546b = true;
            this.f110547c = false;
            C41062e remove = this.f110550f.remove(0);
            this.f110548d = remove;
            remove.mo64106b(this);
            ((C93124c.C93126b) this.f110549e.f268270a).execute(this.f110548d);
            Log.m105925i("MicroMsg.BKGLoader.BKGLoaderManager", "[cpan] tryToStart task is ruing. key:%s upload list size:%d", this.f110548d.getKey(), Integer.valueOf(this.f110550f.size()));
            mo64094c();
        }
        if (!this.f110546b) {
            if (!this.f110551g.isEmpty()) {
                this.f110547c = true;
                C41062e eVar = (C41062e) ((LinkedList) this.f110551g).remove(0);
                this.f110548d = eVar;
                eVar.mo64106b(this);
                ((C93124c.C93126b) this.f110549e.f268270a).execute(this.f110548d);
            } else {
                Vector<C41062e<?>> vector4 = this.f110552h;
                if (vector4 == null || vector4.size() <= 0) {
                    this.f110547c = false;
                    this.f110545a = false;
                } else {
                    this.f110547c = true;
                    C41062e remove2 = this.f110552h.remove(0);
                    this.f110548d = remove2;
                    remove2.mo64106b(this);
                    ((C93124c.C93126b) this.f110549e.f268270a).execute(this.f110548d);
                    Log.m105925i("MicroMsg.BKGLoader.BKGLoaderManager", "[cpan] tryToStart download store emoji task is runing. productID:%s size:%d", this.f110548d.getKey(), Integer.valueOf(this.f110552h.size()));
                }
            }
            mo64094c();
        }
    }
}
