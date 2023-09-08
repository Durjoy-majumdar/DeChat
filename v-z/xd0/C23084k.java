package xd0;

import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import yd0.C23283a;
import zt3.C119157j;

/* renamed from: xd0.k */
public final class C23084k {

    /* renamed from: a */
    public static final C23084k f66311a = new C23084k();

    /* renamed from: b */
    public static final HashMap<String, String> f66312b = new HashMap<>();

    /* renamed from: c */
    public static final HashMap<String, List<C23283a>> f66313c = new HashMap<>();

    /* renamed from: d */
    public static final HashMap<Long, C23283a> f66314d = new HashMap<>();

    /* renamed from: xd0.k$a */
    public static final class C23085a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C23073a f66315d;

        /* renamed from: e */
        public final /* synthetic */ C23283a f66316e;

        /* renamed from: xd0.k$a$a */
        public static final class C23086a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ C23283a f66317d;

            public C23086a(C23283a aVar) {
                this.f66317d = aVar;
            }

            public final void run() {
                C23283a aVar = this.f66317d;
                if (!aVar.f66924d) {
                    aVar.run();
                    return;
                }
                Log.m105925i("MicroMsg.SubscribeMsgStorageTaskManager", "alvinluo task %s has cancelled", aVar.mo36763b());
            }
        }

        public C23085a(C23073a aVar, C23283a aVar2) {
            this.f66315d = aVar;
            this.f66316e = aVar2;
        }

        public final void run() {
            String valueOf = String.valueOf(this.f66315d.hashCode());
            C23084k kVar = C23084k.f66311a;
            HashMap<String, String> hashMap = C23084k.f66312b;
            String str = hashMap.get(valueOf);
            if (str == null) {
                str = "SubscribeMsgTask" + valueOf;
                hashMap.put(valueOf, str);
            }
            C23283a aVar = this.f66316e;
            boolean z = true;
            Log.m105919d("MicroMsg.SubscribeMsgStorageTaskManager", "alvinluo onTaskRunBefore addTask: %s", Integer.valueOf(aVar.hashCode()));
            if (aVar.f66923c && aVar.f66922b) {
                List<C23283a> list = C23084k.f66313c.get(aVar.mo36763b());
                Object[] objArr = new Object[1];
                objArr[0] = list != null ? Integer.valueOf(list.size()) : null;
                Log.m105919d("MicroMsg.SubscribeMsgStorageTaskManager", "alvinluo onTaskRunBefore oldTask size: %s", objArr);
                if (list != null) {
                    for (C23283a aVar2 : list) {
                        Log.m105927v("MicroMsg.SubscribeMsgStorageTaskManager", "alvinluo onTaskRunBefore cancel old task: %s", Integer.valueOf(aVar2.hashCode()));
                        aVar2.mo36762a();
                    }
                }
                if (list != null) {
                    list.clear();
                }
            }
            HashMap<String, List<C23283a>> hashMap2 = C23084k.f66313c;
            List list2 = hashMap2.get(aVar.mo36763b());
            if (list2 != null && !list2.isEmpty()) {
                z = false;
            }
            if (z) {
                list2 = new ArrayList();
            }
            if (list2 != null) {
                list2.add(aVar);
            }
            String b = aVar.mo36763b();
            C87412m.m108591d(list2);
            hashMap2.put(b, list2);
            C23084k.f66314d.put(Long.valueOf((long) aVar.hashCode()), aVar);
            ((C119157j) C119157j.f356862d).mo183876g(new C23086a(this.f66316e), str);
        }
    }

    /* renamed from: a */
    public final void mo36491a(C23283a aVar) {
        C87412m.m108594g(aVar, "task");
        if (aVar.f66922b) {
            ((C119157j) C119157j.f356862d).mo183876g(new C23082i(aVar), "manager_thread");
        }
        ((C119157j) C119157j.f356862d).mo183876g(new C23083j(aVar), "manager_thread");
    }

    /* renamed from: b */
    public final void mo36492b(C23073a aVar, C23283a aVar2) {
        C87412m.m108594g(aVar, "storageManager");
        C87412m.m108594g(aVar2, "task");
        Log.m105925i("MicroMsg.SubscribeMsgStorageTaskManager", "alvinluo runTask storageManager: %s, task className: %s, async: %b", Integer.valueOf(aVar.hashCode()), aVar2.getClass().getSimpleName(), Boolean.valueOf(aVar2.f66922b));
        if (!aVar2.f66922b) {
            aVar2.run();
            ((C119157j) C119157j.f356862d).mo183876g(new C23080g(aVar2), "manager_thread");
            return;
        }
        ((C119157j) C119157j.f356862d).mo183876g(new C23085a(aVar, aVar2), "manager_thread");
    }
}
