package tc0;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.p014mm.autogen.events.OplogServiceResultEvent;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import f40.C86709a0;
import g62.C75880o;
import g62.C8233m;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import je0.C46496s;
import o90.C100308d;
import ob0.C117747y;
import ob0.C35142u;
import ob0.C47350c;
import p823sg.C101611g;
import q90.C101062d;
import sf0.C48374j0;
import tc0.C48623d;
import te3.C48684a93;
import te3.C48825b93;
import te3.C51659v73;
import te3.C52085y83;

/* renamed from: tc0.p */
public class C77885p implements C35142u, C8233m {

    /* renamed from: d */
    public boolean f226921d;

    /* renamed from: e */
    public C101611g<Integer, Integer> f226922e;

    /* renamed from: f */
    public C101611g<Integer, Integer> f226923f;

    /* renamed from: g */
    public C77883k f226924g;

    /* renamed from: h */
    public HashMap<Integer, HashSet<WeakReference<C8233m.C8234a>>> f226925h;

    /* renamed from: i */
    public long f226926i;

    /* renamed from: j */
    public MTimerHandler f226927j;

    /* renamed from: tc0.p$c */
    public static class C37009c {

        /* renamed from: a */
        public static C77885p f98122a = new C77885p();
    }

    /* renamed from: tc0.p$a */
    public class C77886a implements MTimerHandler.CallBack {
        public C77886a() {
        }

        public boolean onTimerExpired() {
            Log.m105918d("MicroMsg.OplogService", "summeroplog pusherTry onTimerExpired tryStartNetscene");
            C77885p pVar = C77885p.this;
            pVar.getClass();
            long nowMilliSecond = Util.nowMilliSecond();
            int i = 0;
            if (pVar.f226921d && nowMilliSecond - pVar.f226926i > 10000) {
                pVar.f226921d = false;
            }
            if (pVar.f226921d) {
                Log.m105928w("MicroMsg.OplogService", "summeroplog tryStartNetscene netSceneRunning, return.");
                return false;
            }
            C77883k B = pVar.mo107988B();
            B.getClass();
            ArrayList arrayList = new ArrayList();
            Cursor rawQuery = B.f226919d.rawQuery("select oplog2.id,oplog2.inserTime,oplog2.cmdId,oplog2.buffer,oplog2.reserved1,oplog2.reserved2,oplog2.reserved3,oplog2.reserved4 from oplog2  order by inserTime asc limit ?", new String[]{String.valueOf(20)});
            if (rawQuery != null) {
                int count = rawQuery.getCount();
                if (count <= 0) {
                    rawQuery.close();
                } else {
                    int i2 = 0;
                    while (i2 < count) {
                        rawQuery.moveToPosition(i2);
                        C75880o oVar = new C75880o(i);
                        oVar.f222528b = rawQuery.getInt(i);
                        oVar.f222529c = rawQuery.getLong(1);
                        oVar.f222530d = rawQuery.getInt(2);
                        oVar.f222531e = rawQuery.getBlob(3);
                        oVar.f222532f = rawQuery.getInt(4);
                        oVar.f222533g = rawQuery.getLong(5);
                        oVar.f222534h = rawQuery.getString(6);
                        oVar.f222535i = rawQuery.getString(7);
                        arrayList.add(oVar);
                        i2++;
                        i = 0;
                    }
                    rawQuery.close();
                }
            }
            if (arrayList.size() == 0) {
                Log.m105918d("MicroMsg.OplogService", "summeroplog tryStartNetscene list null ret");
                return false;
            }
            if (!pVar.f226921d && arrayList.size() > 0) {
                pVar.f226926i = nowMilliSecond;
                pVar.f226921d = true;
                LinkedList<C75880o> linkedList = new LinkedList<>();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    C75880o oVar2 = (C75880o) it.next();
                    if (oVar2.mo58568b() == 0 && oVar2.f222532f > 0) {
                        linkedList.add(oVar2);
                    }
                }
                arrayList.removeAll(linkedList);
                for (C75880o oVar3 : linkedList) {
                    if ("@openim".equals(oVar3.f222534h)) {
                        C86709a0.m107528h();
                        C86709a0.m107529k().f251779b.mo123460f(new C46496s(oVar3));
                    } else {
                        pVar.mo107988B().mo107987jo(oVar3);
                    }
                }
                if (!arrayList.isEmpty()) {
                    C86709a0.m107528h();
                    C86709a0.m107529k().f251779b.mo123460f(new C48623d(arrayList));
                }
            }
            Log.m105919d("MicroMsg.OplogService", "summeroplog tryStartNetscene ret ok lastNetscene: %d,  netSceneRunning:%B, take:%d ms. size %s", Long.valueOf(pVar.f226926i), Boolean.valueOf(pVar.f226921d), Long.valueOf(System.currentTimeMillis() - nowMilliSecond), Integer.valueOf(arrayList.size()));
            return false;
        }

        public String toString() {
            return super.toString() + "|pusherTry";
        }
    }

    /* renamed from: tc0.p$b */
    public class C77887b extends MTimerHandler {

        /* renamed from: tc0.p$b$a */
        public class C77888a implements MTimerHandler.CallBack {

            /* renamed from: d */
            public int f226929d = 0;

            /* renamed from: e */
            public int f226930e = 0;

            /* renamed from: f */
            public final /* synthetic */ C77885p f226931f;

            /* renamed from: g */
            public final /* synthetic */ List f226932g;

            /* renamed from: h */
            public final /* synthetic */ LinkedList f226933h;

            /* renamed from: i */
            public final /* synthetic */ LinkedList f226934i;

            /* renamed from: j */
            public final /* synthetic */ C77885p f226935j;

            /* renamed from: tc0.p$b$a$a */
            public class C77889a implements Runnable {

                /* renamed from: d */
                public final /* synthetic */ C75880o f226936d;

                /* renamed from: e */
                public final /* synthetic */ int f226937e;

                /* renamed from: f */
                public final /* synthetic */ C52085y83 f226938f;

                public C77889a(C75880o oVar, int i, C52085y83 y832) {
                    this.f226936d = oVar;
                    this.f226937e = i;
                    this.f226938f = y832;
                }

                public void run() {
                    C77885p pVar = C77888a.this.f226935j;
                    int b = this.f226936d.mo58568b();
                    int i = this.f226937e;
                    C52085y83 y832 = this.f226938f;
                    String str = "";
                    String str2 = y832 == null ? str : y832.f145176e;
                    if (y832 != null) {
                        str = y832.f145175d;
                    }
                    pVar.mo107989D(b, i, str2, str);
                }
            }

            public C77888a(C77885p pVar, List list, LinkedList linkedList, LinkedList linkedList2, C77885p pVar2) {
                this.f226931f = pVar;
                this.f226932g = list;
                this.f226933h = linkedList;
                this.f226934i = linkedList2;
                this.f226935j = pVar2;
            }

            public boolean onTimerExpired() {
                int size = this.f226932g.size();
                int size2 = this.f226933h.size();
                int i = size < size2 ? size : size2;
                if (size != size2) {
                    Log.m105929w("MicroMsg.OplogService", "summeroplog oplogSize[%d] not equal to resultSize[%d]! now size[%d] respIndex[%d]", Integer.valueOf(size), Integer.valueOf(size2), Integer.valueOf(i), Integer.valueOf(this.f226929d));
                }
                ArrayList arrayList = new ArrayList();
                int i2 = this.f226929d;
                if (i2 >= i) {
                    C77885p pVar = this.f226931f;
                    pVar.f226921d = false;
                    if (this.f226930e > 0) {
                        pVar.f226927j.startTimer(((C101062d) pVar.f226922e).size() > 0 ? 500 : 0);
                    }
                    return false;
                }
                int i3 = i2 + 20;
                if (i3 <= i) {
                    i = i3;
                }
                while (true) {
                    int i4 = this.f226929d;
                    if (i4 >= i) {
                        break;
                    }
                    int intValue = ((Integer) this.f226933h.get(i4)).intValue();
                    C75880o oVar = (C75880o) this.f226932g.get(this.f226929d);
                    C52085y83 y832 = this.f226929d < this.f226934i.size() ? (C52085y83) this.f226934i.get(this.f226929d) : null;
                    int i5 = oVar.f222528b;
                    Log.m105925i("MicroMsg.OplogService", "summeroplog id:%d, cmd:%d, result:%d", Integer.valueOf(i5), Integer.valueOf(oVar.mo58568b()), Integer.valueOf(intValue));
                    MMHandlerThread.postToMainThread(new C77889a(oVar, intValue, y832));
                    if (intValue == 0 || intValue == -3400) {
                        this.f226930e++;
                        arrayList.add(oVar);
                        ((C101062d) this.f226931f.f226922e).remove(Integer.valueOf(i5));
                    } else if (intValue == -433) {
                        Log.m105921e("MicroMsg.OplogService", "oplog not yet process, id:%d, cmd:%d", Integer.valueOf(i5), Integer.valueOf(oVar.mo58568b()));
                    } else {
                        Integer num = (Integer) ((C101062d) this.f226931f.f226922e).mo139556b(Integer.valueOf(i5));
                        Log.m105919d("MicroMsg.OplogService", "summeroplog id:%d, inserttime:%d, mapCnt:%d", Integer.valueOf(i5), Long.valueOf(oVar.f222529c), num);
                        if (num == null) {
                            ((C101062d) this.f226931f.f226922e).mo139557c(Integer.valueOf(i5), 1);
                        } else if (num.intValue() < 2) {
                            ((C101062d) this.f226931f.f226922e).mo139557c(Integer.valueOf(i5), Integer.valueOf(num.intValue() + 1));
                        } else {
                            Log.m105919d("MicroMsg.OplogService", "summeroplog LRUMap Max now id:%d, inserttime:%d", Integer.valueOf(i5), Long.valueOf(oVar.f222529c));
                            arrayList.add(oVar);
                        }
                    }
                    this.f226929d++;
                }
                int size3 = arrayList.size();
                if (size3 > 0) {
                    C86709a0.m107528h();
                    long beginTransaction = C86709a0.m107535s().f251811i.beginTransaction(Thread.currentThread().getId());
                    for (int i6 = 0; i6 < size3; i6++) {
                        this.f226931f.mo107988B().mo107987jo((C75880o) arrayList.get(i6));
                    }
                    C86709a0.m107528h();
                    C86709a0.m107535s().f251811i.endTransaction(beginTransaction);
                }
                return true;
            }

            public String toString() {
                return super.toString() + "|RespHandler";
            }
        }

        public C77887b(C77885p pVar, C77885p pVar2, List<C75880o> list, LinkedList<Integer> linkedList, LinkedList<C52085y83> linkedList2) {
            super(C86709a0.m107525e().getLooper(), (MTimerHandler.CallBack) new C77888a(pVar, list, linkedList, linkedList2, pVar2), true);
        }
    }

    public C77885p() {
        this.f226921d = false;
        this.f226922e = new C100308d(200);
        this.f226923f = new C100308d(200);
        this.f226925h = new HashMap<>();
        this.f226926i = 0;
        this.f226927j = new MTimerHandler(C86709a0.m107525e().getLooper(), (MTimerHandler.CallBack) new C77886a(), false);
        this.f226925h = new HashMap<>();
    }

    /* renamed from: B */
    public C77883k mo107988B() {
        if (this.f226924g == null && C86709a0.m107522a()) {
            synchronized (C77883k.class) {
                if (this.f226924g == null) {
                    this.f226924g = new C77883k(C86709a0.m107535s().f251811i);
                }
            }
        }
        return this.f226924g;
    }

    /* renamed from: D */
    public final void mo107989D(int i, int i2, String str, String str2) {
        HashSet hashSet = this.f226925h.get(Integer.valueOf(i));
        if (hashSet != null) {
            LinkedList linkedList = new LinkedList();
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                if (!(weakReference == null || weakReference.get() == null)) {
                    linkedList.add((C8233m.C8234a) weakReference.get());
                }
            }
            Iterator it4 = linkedList.iterator();
            while (it4.hasNext()) {
                ((C8233m.C8234a) it4.next()).mo6254a(i2, str, str2);
            }
            linkedList.clear();
        }
    }

    /* renamed from: O */
    public void mo107990O(int i, C8233m.C8234a aVar) {
        HashSet hashSet = this.f226925h.get(Integer.valueOf(i));
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                if (weakReference != null && weakReference.get() != null && ((C8233m.C8234a) weakReference.get()).equals(aVar)) {
                    hashSet.remove(weakReference);
                    return;
                }
            }
            if (hashSet.size() == 0) {
                this.f226925h.remove(Integer.valueOf(i));
            } else {
                this.f226925h.put(Integer.valueOf(i), hashSet);
            }
        }
    }

    /* renamed from: Q */
    public void mo107991Q(C75880o oVar) {
        C86709a0.m107528h();
        long beginTransaction = C86709a0.m107535s().f251811i.beginTransaction(Thread.currentThread().getId());
        mo107988B().mo107987jo(oVar);
        C86709a0.m107528h();
        C86709a0.m107535s().f251811i.endTransaction(beginTransaction);
    }

    /* renamed from: d */
    public void mo107992d(int i, C8233m.C8234a aVar) {
        HashSet hashSet = this.f226925h.get(Integer.valueOf(i));
        if (hashSet == null) {
            hashSet = new HashSet();
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            if (weakReference != null && weakReference.get() != null && ((C8233m.C8234a) weakReference.get()).equals(aVar)) {
                return;
            }
        }
        hashSet.add(new WeakReference(aVar));
        this.f226925h.put(Integer.valueOf(i), hashSet);
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        C48623d dVar;
        C48623d.C48624a aVar;
        C48825b93 b932;
        LinkedList<Integer> linkedList;
        Log.m105925i("MicroMsg.OplogService", "oplog onsceneEnd errType:%d,errCode:%d,errMsg:%s, sceneType %d", Integer.valueOf(i), Integer.valueOf(i2), str, Integer.valueOf(yVar.getType()));
        String str2 = "";
        if (yVar.getType() == 806) {
            C51659v73 v732 = (C51659v73) ((C47350c) yVar.getReqResp()).f127056b.f127083a;
            C75880o oVar = ((C46496s) yVar).f125268g;
            if (i != 0 && i2 != 0) {
                String g = (v732 == null || v732.getBaseResponse() == null) ? str2 : C48374j0.m53718g(v732.getBaseResponse().f135956e);
                if (!Util.isNullOrNil(g)) {
                    str = g;
                }
                int b = oVar.mo58568b();
                mo107989D(oVar.mo58568b(), -1, str2, str);
                this.f226921d = false;
                Integer num = (Integer) ((C101062d) this.f226923f).mo139556b(Integer.valueOf(b));
                Log.m105919d("MicroMsg.OplogService", "summeroplog id:%d, inserttime:%d, mapCnt:%d", Integer.valueOf(b), Long.valueOf(oVar.f222529c), num);
                if (num == null) {
                    ((C101062d) this.f226923f).mo139557c(Integer.valueOf(b), 1);
                } else if (num.intValue() < 2) {
                    ((C101062d) this.f226923f).mo139557c(Integer.valueOf(b), Integer.valueOf(num.intValue() + 1));
                } else {
                    Log.m105919d("MicroMsg.OplogService", "summeroplog LRUMap Max now id:%d, inserttime:%d", Integer.valueOf(b), Long.valueOf(oVar.f222529c));
                    mo107988B().mo107987jo(oVar);
                }
            } else if (yVar instanceof C46496s) {
                int i3 = v732.getBaseResponse() != null ? v732.getBaseResponse().f135955d : 0;
                OplogServiceResultEvent oplogServiceResultEvent = new OplogServiceResultEvent();
                oplogServiceResultEvent.f107687d.f107688a = i3;
                oplogServiceResultEvent.publish();
                mo107989D(oVar.mo58568b(), i3, str2, str2);
                Log.m105925i("MicroMsg.OplogService", "openim op success, type:%d id %d", Integer.valueOf(oVar.f222532f), Integer.valueOf(oVar.mo58568b()));
                mo107988B().mo107987jo(oVar);
                this.f226921d = false;
                this.f226927j.startTimer(((C101062d) this.f226922e).size() > 0 ? 500 : 0);
            }
        } else if (yVar.getType() == 681) {
            if (i == 0 && i2 == 0 && (aVar = dVar.f130154e) != null) {
                C48684a93 a932 = aVar.f130157b.f130159a;
                int i4 = a932.f130390d;
                if (i4 != 0 || (b932 = a932.f130391e) == null || (linkedList = b932.f131020e) == null) {
                    Log.m105921e("MicroMsg.OplogService", "summeroplog tryStartNetscene onSceneEnd Ret:%d  not ok and no retry.", Integer.valueOf(i4));
                    this.f226921d = false;
                    return;
                }
                if (!(b932 == null || linkedList.size() == 0)) {
                    OplogServiceResultEvent oplogServiceResultEvent2 = new OplogServiceResultEvent();
                    oplogServiceResultEvent2.f107687d.f107688a = a932.f130391e.f131020e.getLast().intValue();
                    LinkedList<C52085y83> linkedList2 = a932.f130391e.f131021f;
                    oplogServiceResultEvent2.f107687d.f107689b = linkedList2.isEmpty() ? str2 : linkedList2.getLast().f145176e;
                    OplogServiceResultEvent.C40152a aVar2 = oplogServiceResultEvent2.f107687d;
                    if (!linkedList2.isEmpty()) {
                        str2 = linkedList2.getLast().f145175d;
                    }
                    aVar2.f107690c = str2;
                    if (Util.isNullOrNil(oplogServiceResultEvent2.f107687d.f107689b) && Util.isNullOrNil(oplogServiceResultEvent2.f107687d.f107690c)) {
                        for (int size = linkedList2.size() - 1; size >= 0; size--) {
                            oplogServiceResultEvent2.f107687d.f107689b = linkedList2.get(size).f145176e;
                            oplogServiceResultEvent2.f107687d.f107690c = linkedList2.get(size).f145175d;
                            if (!Util.isNullOrNil(oplogServiceResultEvent2.f107687d.f107689b) || !Util.isNullOrNil(oplogServiceResultEvent2.f107687d.f107690c)) {
                                break;
                            }
                        }
                    }
                    oplogServiceResultEvent2.publish();
                }
                List<C75880o> list = (dVar = (C48623d) yVar).f130155f;
                C48825b93 b933 = a932.f130391e;
                new C77887b(this, this, list, b933.f131020e, b933.f131021f).startTimer(50);
                return;
            }
            Log.m105921e("MicroMsg.OplogService", "summeroplog tryStartNetscene onSceneEnd errType:%d, errCode:%d, rr:%s not retry", Integer.valueOf(i), Integer.valueOf(i2), ((C48623d) yVar).f130154e.toString());
            this.f226921d = false;
        }
    }

    /* renamed from: q */
    public void mo107993q(C75880o oVar) {
        if (oVar != null) {
            Object[] objArr = new Object[3];
            objArr[0] = Integer.valueOf(oVar.mo58568b());
            objArr[1] = Integer.valueOf(oVar.mo106149a() == null ? -1 : oVar.mo106149a().length);
            objArr[2] = Util.getStack();
            Log.m105925i("MicroMsg.OplogService", "summeroplog dealWith option cmdId= %d, buf len:%d, stack=%s", objArr);
            oVar.f222529c = Util.nowMilliSecond();
            C77883k B = mo107988B();
            B.getClass();
            oVar.f222527a = -1;
            ContentValues contentValues = new ContentValues();
            if ((oVar.f222527a & 2) != 0) {
                contentValues.put("inserTime", Long.valueOf(oVar.f222529c));
            }
            if ((oVar.f222527a & 4) != 0) {
                contentValues.put("cmdId", Integer.valueOf(oVar.mo58568b()));
            }
            if ((oVar.f222527a & 8) != 0) {
                contentValues.put("buffer", oVar.mo106149a());
            }
            if ((oVar.f222527a & 16) != 0) {
                contentValues.put("reserved1", Integer.valueOf(oVar.f222532f));
            }
            if ((oVar.f222527a & 32) != 0) {
                contentValues.put("reserved2", Long.valueOf(oVar.f222533g));
            }
            if ((oVar.f222527a & 64) != 0) {
                contentValues.put("reserved3", oVar.f222534h);
            }
            if ((oVar.f222527a & 128) != 0) {
                contentValues.put("reserved4", oVar.f222535i);
            }
            int q = (int) B.f226919d.mo125627q("oplog2", "id", contentValues, false);
            if (q > 0) {
                oVar.f222528b = q;
            }
        } else {
            Log.m105924i("MicroMsg.OplogService", "summeroplog dealWith option null");
        }
        this.f226927j.startTimer(0);
    }
}
