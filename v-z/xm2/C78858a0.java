package xm2;

import com.tencent.p014mm.autogen.events.GetSnsTagListEvent;
import com.tencent.p014mm.autogen.events.UpdateSnsTagListEvent;
import com.tencent.p014mm.plugin.setting.p102ui.setting.C71141c4;
import com.tencent.p014mm.plugin.setting.p102ui.setting.UnfamiliarContactDetailUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import kv1.C61173o;
import kv1.C99260q;
import lu3.C88654b;
import lu3.C88656g;
import lv1.C10656l;
import lv1.C76728k;
import lv1.C99681n;
import ob0.C11385n;
import ob0.C117747y;
import zt3.C119157j;

/* renamed from: xm2.a0 */
public class C78858a0 {

    /* renamed from: a */
    public boolean f231681a;

    /* renamed from: b */
    public boolean f231682b;

    /* renamed from: c */
    public boolean f231683c;

    /* renamed from: d */
    public final CountDownLatch f231684d;

    /* renamed from: e */
    public final MMHandler f231685e;

    /* renamed from: f */
    public Object f231686f = new Object();

    /* renamed from: g */
    public HashSet<String> f231687g = new HashSet<>();

    /* renamed from: h */
    public HashSet<String> f231688h = new HashSet<>();

    /* renamed from: i */
    public HashSet<String> f231689i = new HashSet<>();

    /* renamed from: j */
    public HashSet<String> f231690j = new HashSet<>();

    /* renamed from: k */
    public C53377b f231691k;

    /* renamed from: l */
    public UnfamiliarContactDetailUI.C42981o f231692l;

    /* renamed from: m */
    public long f231693m;

    /* renamed from: n */
    public C88654b f231694n;

    /* renamed from: xm2.a0$b */
    public class C53377b implements C88656g, C11385n {

        /* renamed from: d */
        public UnfamiliarContactDetailUI.C42981o f150192d;

        /* renamed from: e */
        public CountDownLatch f150193e;

        /* renamed from: f */
        public C117747y f150194f;

        /* renamed from: g */
        public long f150195g;

        /* renamed from: xm2.a0$b$a */
        public class C53378a implements Runnable {
            public C53378a() {
            }

            public void run() {
                ((C71141c4) C53377b.this.f150192d).mo97829a(UnfamiliarContactDetailUI.C42980l.OVER_ONE_MIN);
            }
        }

        /* renamed from: xm2.a0$b$b */
        public class C53379b implements Runnable {
            public C53379b() {
            }

            public void run() {
                C53377b.this.getClass();
                GetSnsTagListEvent getSnsTagListEvent = new GetSnsTagListEvent();
                getSnsTagListEvent.f9308d.f9309a = 3;
                getSnsTagListEvent.publish();
            }
        }

        public C53377b(UnfamiliarContactDetailUI.C42981o oVar, CountDownLatch countDownLatch) {
            this.f150192d = oVar;
            this.f150193e = countDownLatch;
        }

        public String getKey() {
            return "load_unfamiliar_contact";
        }

        public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
            if (i != 0 || i2 != 0) {
                Log.m105921e("MicroMsg.UnfamiliarContactEngine", "[onSceneEnd] errType:%s errCode:%s errMsg:%s", Integer.valueOf(i), Integer.valueOf(i2), str);
                this.f150193e.countDown();
            } else if (yVar.getType() == 292) {
                this.f150194f = yVar;
                ((C119157j) C119157j.f356862d).mo183875f(this);
            }
        }

        public void run() {
            UpdateSnsTagListEvent updateSnsTagListEvent = new UpdateSnsTagListEvent();
            updateSnsTagListEvent.f107791d.f107793a = this.f150194f;
            updateSnsTagListEvent.publish();
            UpdateSnsTagListEvent.C40178b bVar = updateSnsTagListEvent.f107792e;
            int i = bVar.f107794a;
            List list = bVar.f107795b;
            Object[] objArr = new Object[3];
            objArr[0] = Integer.valueOf(i);
            objArr[1] = Boolean.valueOf(list == null);
            objArr[2] = Integer.valueOf(list == null ? 0 : ((LinkedList) list).size());
            Log.m105925i("MicroMsg.UnfamiliarContactEngine", "[callback] state:%s,tagList is null?%s,tagList size:%s", objArr);
            if (i != 1) {
                if (list != null) {
                    C78858a0.this.f231690j.addAll(list);
                }
                Log.m105925i("MicroMsg.UnfamiliarContactEngine", "[AsyncGetSnsTagInfo] %sms", Long.valueOf(System.currentTimeMillis() - this.f150195g));
                this.f150193e.countDown();
                return;
            }
            if (this.f150192d != null) {
                C78858a0.this.f231685e.postUI(new C53378a());
            }
            C78858a0.this.f231685e.postDelayed(new C53379b(), 30000);
        }
    }

    /* renamed from: xm2.a0$a */
    public class C78859a implements C61173o {

        /* renamed from: d */
        public final int f231695d;

        /* renamed from: e */
        public final /* synthetic */ List f231696e;

        /* renamed from: f */
        public final /* synthetic */ LinkedList f231697f;

        /* renamed from: g */
        public final /* synthetic */ long f231698g;

        public C78859a(int i, List list, LinkedList linkedList, long j) {
            this.f231696e = list;
            this.f231697f = linkedList;
            this.f231698g = j;
            this.f231695d = i;
        }

        /* renamed from: H0 */
        public void mo293H0(C10656l lVar) {
            boolean z;
            List<C99681n> list = lVar.f32076e;
            if (list == null || list.size() <= 0) {
                Object[] objArr = new Object[1];
                objArr[0] = Boolean.valueOf(this.f231696e == null);
                Log.m105921e("MicroMsg.UnfamiliarContactEngine", "[getSameChatInfoTask] list is null? %s ", objArr);
            } else {
                C99681n nVar = list.get(0);
                Object obj = nVar.f292161o;
                if (obj == null || !(obj instanceof HashMap)) {
                    Object[] objArr2 = new Object[2];
                    objArr2[0] = Boolean.valueOf(obj == null);
                    objArr2[1] = Boolean.valueOf(nVar.f292161o instanceof HashMap);
                    Log.m105921e("MicroMsg.UnfamiliarContactEngine", "[getSameChatInfoTask] is null?%s is instanceof List", objArr2);
                } else {
                    HashMap hashMap = (HashMap) obj;
                    synchronized (C78858a0.this.f231686f) {
                        for (String str : this.f231696e) {
                            if (!hashMap.containsKey(str)) {
                                C78858a0.this.f231689i.add(str);
                            } else {
                                Iterator it = ((List) hashMap.get(str)).iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        if (((C99681n) it.next()).f292150d < 100) {
                                            z = true;
                                            break;
                                        }
                                    } else {
                                        z = false;
                                        break;
                                    }
                                }
                                if (!z) {
                                    C78858a0.this.f231689i.add(str);
                                }
                            }
                        }
                    }
                }
            }
            if (this.f231695d >= this.f231697f.size()) {
                Log.m105925i("MicroMsg.UnfamiliarContactEngine", "[getSameChatInfoTask] finish all load! userNames.size:%s cost:%sms", Integer.valueOf(this.f231697f.size()), Long.valueOf(System.currentTimeMillis() - this.f231698g));
                C78858a0.this.f231684d.countDown();
                return;
            }
            C78858a0.this.mo108883a(this.f231697f, this.f231695d);
        }
    }

    public C78858a0(boolean z, boolean z2, boolean z3, UnfamiliarContactDetailUI.C42981o oVar) {
        this.f231681a = z;
        this.f231682b = z2;
        this.f231683c = z3;
        int i = (z2 ? 1 : 0) + (z ? 1 : 0) + (z3 ? 1 : 0);
        Log.m105925i("MicroMsg.UnfamiliarContactEngine", "[UnfamiliarContactEngine] count:%s [%s:%s:%s]", Integer.valueOf(i), Boolean.valueOf(this.f231682b), Boolean.valueOf(this.f231681a), Boolean.valueOf(this.f231683c));
        this.f231684d = new CountDownLatch(i);
        this.f231685e = new MMHandler("UnfamiliarContactEngine");
        this.f231692l = oVar;
    }

    /* renamed from: a */
    public final void mo108883a(LinkedList<String> linkedList, int i) {
        long currentTimeMillis = System.currentTimeMillis();
        int i2 = i + 10;
        if (i2 >= linkedList.size()) {
            i2 = linkedList.size();
        }
        int i3 = i2;
        List<String> subList = linkedList.subList(i, i3);
        C76728k kVar = new C76728k();
        kVar.f224467b = 8;
        kVar.f224468c = Util.listToString(subList, ",");
        kVar.f224478m = new C78859a(i3, subList, linkedList, currentTimeMillis);
        kVar.f224479n = this.f231685e;
        ((C99260q) C86312j.m106911c(C99260q.class)).Xn0(2, kVar);
    }
}
