package dn0;

import an0.C79592a;
import fn0.C87002g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* renamed from: dn0.r */
public class C86377r {

    /* renamed from: a */
    public final LinkedHashMap<String, ArrayList<C86375p>> f251151a = new LinkedHashMap<>(8, 0.75f);

    /* renamed from: dn0.r$a */
    public class C86378a implements C86376q {

        /* renamed from: a */
        public final /* synthetic */ CountDownLatch f251152a;

        public C86378a(C86377r rVar, CountDownLatch countDownLatch) {
            this.f251152a = countDownLatch;
        }
    }

    /* renamed from: a */
    public synchronized void mo120795a(String str, C86375p pVar) {
        ArrayList arrayList = this.f251151a.get(str);
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.f251151a.put(str, arrayList);
            C87002g.m108023q(3, "RequestManager", "add videoRequest:" + pVar, (Throwable) null);
        }
        arrayList.add(pVar);
    }

    /* renamed from: b */
    public void mo120796b(String str, C86375p pVar) {
        ArrayList<C86375p> c = mo120797c(str, 10);
        ArrayList arrayList = new ArrayList();
        Iterator<C86375p> it = c.iterator();
        while (it.hasNext()) {
            C86375p next = it.next();
            if (next.mo120771a(0)) {
                arrayList.add(next);
            }
        }
        String str2 = "VideoProxy/" + pVar.f251135f + "/" + "RequestManager";
        C87002g.m108023q(4, str2, "cancelPreloadRequestsSync, videoKey:" + str + ", count:" + arrayList.size(), (Throwable) null);
        if (arrayList.size() > 0) {
            CountDownLatch countDownLatch = new CountDownLatch(arrayList.size());
            C87002g.m108023q(5, str2, "start auto cancel preload requests, request count=" + countDownLatch.getCount(), (Throwable) null);
            C86378a aVar = new C86378a(this, countDownLatch);
            Iterator it4 = arrayList.iterator();
            while (it4.hasNext()) {
                C86375p pVar2 = (C86375p) it4.next();
                pVar2.f251133d = aVar;
                if (pVar2.f251130a != null) {
                    if (pVar2.mo120792u(0, 1) && C79592a.m96648a().f233399b) {
                        C87002g.m108023q(3, pVar2.mo120776f(), "cancel start, seq=" + pVar2.f251135f, (Throwable) null);
                    }
                    pVar2.mo120789s(1);
                    pVar2.f251130a.cancel(true);
                }
            }
            try {
                countDownLatch.await((long) 2000, TimeUnit.MILLISECONDS);
                if (mo120797c(str, 10).size() == 0) {
                    C87002g.m108023q(5, str2, "auto cancel preload requests success", (Throwable) null);
                } else {
                    C87002g.m108023q(5, str2, "auto cancel preload requests timeout, max wait time is 2000 seconds", (Throwable) null);
                }
            } catch (InterruptedException e) {
                C87002g.m108023q(5, str2, "auto cancel preload requests interrupted " + e.toString(), (Throwable) null);
            }
        }
    }

    /* renamed from: c */
    public synchronized ArrayList<C86375p> mo120797c(String str, int i) {
        ArrayList<C86375p> arrayList;
        arrayList = new ArrayList<>();
        for (Map.Entry<String, ArrayList<C86375p>> value : this.f251151a.entrySet()) {
            ArrayList arrayList2 = (ArrayList) value.getValue();
            if (arrayList2.size() > 0) {
                C86375p pVar = (C86375p) arrayList2.get(0);
                if (str.equals(pVar.f251143n)) {
                    if (i == -1) {
                        arrayList.addAll(arrayList2);
                    } else if (i == pVar.f251137h) {
                        arrayList.addAll(arrayList2);
                    }
                }
            }
        }
        return arrayList;
    }

    /* renamed from: d */
    public synchronized void mo120798d(C86375p pVar) {
        ArrayList arrayList = this.f251151a.get(pVar.f251144o);
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (pVar.equals((C86375p) it.next())) {
                    if (C79592a.m96648a().f233399b) {
                        C87002g.m108023q(3, "RequestManager", "remove videoRequest:" + pVar, (Throwable) null);
                    }
                    it.remove();
                }
            }
        }
    }

    public synchronized String toString() {
        String str;
        str = super.toString() + "[";
        for (Map.Entry<String, ArrayList<C86375p>> value : this.f251151a.entrySet()) {
            Iterator it = ((ArrayList) value.getValue()).iterator();
            while (it.hasNext()) {
                str = (str + ((C86375p) it.next()).toString()) + ",\n";
            }
        }
        return str + "]";
    }
}
