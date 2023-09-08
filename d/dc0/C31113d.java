package dc0;

import android.database.Cursor;
import android.util.Pair;
import android.util.SparseArray;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72996z1;
import di3.C86312j;
import eb0.C75592q0;
import eb0.C75597w2;
import f40.C86709a0;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import kj2.C117407d;
import o90.C100308d;
import p214om.C11502f;
import p823sg.C101611g;
import q90.C101062d;
import te3.C49915iy1;
import te3.C51163rv3;
import zt3.C119157j;

/* renamed from: dc0.d */
public final class C31113d implements C75597w2 {

    /* renamed from: a */
    public boolean f83415a = false;

    /* renamed from: b */
    public C101611g<String, Integer> f83416b = new C100308d(200);

    /* renamed from: c */
    public Map<String, LinkedList<C75597w2.C31525a>> f83417c = new HashMap();

    /* renamed from: d */
    public Queue<C49915iy1> f83418d = new LinkedList();

    /* renamed from: e */
    public Queue<d$$g> f83419e = new LinkedList();

    /* renamed from: f */
    public long f83420f = 0;

    /* renamed from: g */
    public long f83421g = 0;

    /* renamed from: h */
    public MTimerHandler f83422h = new MTimerHandler(C86709a0.m107525e().getLooper(), (MTimerHandler.CallBack) new d$$d(this), false);

    /* renamed from: i */
    public final MTimerHandler f83423i = new MTimerHandler(C86709a0.m107525e().getLooper(), (MTimerHandler.CallBack) new d$$f(this), true);

    /* renamed from: a */
    public void mo55985a() {
        Log.m105925i("MicroMsg.GetContactService", "[checkPendingGetContact] %s", Boolean.valueOf(((C11502f) C86312j.m106911c(C11502f.class)).mo11461Sr().Ab0()));
        this.f83422h.startTimer(500);
        if (C86709a0.m107535s().mo121142i().mo119688i(92, 0) == 1) {
            ((C119157j) C119157j.f356862d).mo183878i(new d$$a(), 1000);
        }
    }

    /* renamed from: b */
    public void mo55986b(String str) {
        C86709a0.m107525e().postToWorker(new d$$c(this, str));
    }

    /* renamed from: c */
    public void mo55987c(String str, String str2) {
        Log.m105924i("MicroMsg.GetContactService", "dkverify add Contact :" + str + " chatroom: " + str2 + " stack:" + Util.getStack());
        if (mo57990d(str, str2)) {
            this.f83422h.startTimer(500);
        }
    }

    /* renamed from: d */
    public final boolean mo57990d(String str, String str2) {
        if (Util.isNullOrNil(str)) {
            return false;
        }
        String s = C75592q0.m90789s();
        String c = C75592q0.m90773c();
        if (str.equals(s) || str.equals(c)) {
            Log.m105924i("MicroMsg.GetContactService", "addToStg username: " + str + " equal to user: " + s + " alias: " + c + " ret");
            return false;
        }
        C31111b bVar = new C31111b();
        bVar.f83404a = str;
        bVar.f83410g = Util.nullAsNil(str2);
        bVar.f83405b = Util.nowMilliSecond();
        return C31118h.vx0().mo57988Lo(bVar);
    }

    /* renamed from: e */
    public void mo55988e(String str, String str2, C75597w2.C31525a aVar) {
        Log.m105924i("MicroMsg.GetContactService", "dkverify getNow :" + str + " chatroom: " + str2 + " stack:" + Util.getStack());
        if (mo57990d(str, str2)) {
            if (aVar == null) {
                Log.m105925i("MicroMsg.GetContactService", "addGetContactCallBack %s, addGetContactCallBack is null", Util.nullAs(str, ""));
            } else {
                synchronized (this) {
                    LinkedList linkedList = (LinkedList) ((HashMap) this.f83417c).get(str);
                    if (linkedList == null) {
                        Map<String, LinkedList<C75597w2.C31525a>> map = this.f83417c;
                        LinkedList linkedList2 = new LinkedList();
                        ((HashMap) map).put(str, linkedList2);
                        linkedList = linkedList2;
                    }
                    if (!linkedList.contains(aVar)) {
                        linkedList.add(aVar);
                    }
                }
            }
            this.f83422h.startTimer(0);
        }
    }

    /* renamed from: f */
    public void mo55989f(String str) {
        synchronized (this) {
            ((HashMap) this.f83417c).remove(str);
        }
    }

    /* renamed from: g */
    public void mo55990g(String str, int i, String str2) {
        boolean z = false;
        if (!Util.isNullOrNil(str)) {
            String s = C75592q0.m90789s();
            String c = C75592q0.m90773c();
            if (str.equals(s) || str.equals(c)) {
                Log.m105924i("MicroMsg.GetContactService", "addToStg username: " + str + " equal to user: " + s + " alias: " + c + " ret");
            } else {
                C31111b bVar = new C31111b();
                bVar.f83404a = str;
                bVar.f83411h = Util.nullAsNil(str2);
                bVar.f83409f = Util.nullAsNil(Integer.valueOf(i));
                bVar.f83405b = Util.nowMilliSecond();
                z = C31118h.vx0().mo57988Lo(bVar);
            }
        }
        if (z) {
            this.f83422h.startTimer(500);
        }
    }

    /* renamed from: h */
    public final void mo57991h(String str, boolean z) {
        MMHandlerThread.postToMainThread(new d$$e(this, str, z));
    }

    /* renamed from: i */
    public final void mo57992i() {
        List list;
        C31112c vx02 = C31118h.vx0();
        long j = this.f83420f;
        vx02.getClass();
        int i = 2;
        int i2 = 0;
        int i3 = 1;
        Cursor rawQuery = vx02.f83414d.rawQuery("select getcontactinfov2.username,getcontactinfov2.inserttime,getcontactinfov2.type,getcontactinfov2.lastgettime,getcontactinfov2.reserved1,getcontactinfov2.reserved2,getcontactinfov2.reserved3,getcontactinfov2.reserved4 from getcontactinfov2 where inserttime> ?  order by inserttime asc limit ?", new String[]{String.valueOf(j), String.valueOf(80)});
        if (rawQuery != null) {
            int count = rawQuery.getCount();
            Log.m105925i("MicroMsg.GetContactService", "getFromDb count:%d", Integer.valueOf(count));
            if (count <= 0) {
                rawQuery.close();
                return;
            }
            LinkedList<C51163rv3> linkedList = new LinkedList<>();
            LinkedList<C51163rv3> linkedList2 = new LinkedList<>();
            LinkedList linkedList3 = new LinkedList();
            SparseArray sparseArray = new SparseArray();
            LinkedList linkedList4 = new LinkedList();
            while (rawQuery.moveToNext()) {
                String string = rawQuery.getString(i2);
                long j2 = rawQuery.getLong(i3);
                rawQuery.getInt(i);
                rawQuery.getInt(3);
                rawQuery.getInt(4);
                int i4 = rawQuery.getInt(5);
                String string2 = rawQuery.getString(6);
                String string3 = rawQuery.getString(7);
                if (string == null) {
                    string = "";
                }
                if (string2 == null) {
                    string2 = "";
                }
                String nullAsNil = Util.nullAsNil(string2);
                int nullAsNil2 = Util.nullAsNil(Integer.valueOf(i4));
                if (string3 == null) {
                    string3 = "";
                }
                String nullAsNil3 = Util.nullAsNil(string3);
                this.f83420f = j2;
                String str = string + "#" + nullAsNil;
                int nullAs = Util.nullAs((Integer) ((C101062d) this.f83416b).mo139556b(str), i2);
                if (nullAs < 3) {
                    ((C101062d) this.f83416b).mo139557c(str, Integer.valueOf(nullAs + 1));
                    if (C72996z1.m85847r5(string)) {
                        C49915iy1 iy12 = new C49915iy1();
                        C51163rv3 rv32 = new C51163rv3();
                        rv32.f141175d = string;
                        rv32.f141176e = true;
                        linkedList.add(rv32);
                        C51163rv3 rv33 = new C51163rv3();
                        rv33.f141175d = nullAsNil;
                        rv33.f141176e = true;
                        linkedList2.add(rv33);
                        iy12.f135747e = linkedList;
                        iy12.f135751i = linkedList2;
                        ((LinkedList) this.f83418d).add(iy12);
                        linkedList = new LinkedList<>();
                        linkedList2 = new LinkedList<>();
                        Log.m105925i("MicroMsg.GetContactService", "getFromDb this is openRoom now reqlist size:%d , this req usr count:%d usr %s", Integer.valueOf(((LinkedList) this.f83418d).size()), Integer.valueOf(iy12.f135747e.size()), string);
                    } else if (C72996z1.m85843n5(string)) {
                        C49915iy1 iy13 = new C49915iy1();
                        C51163rv3 rv34 = new C51163rv3();
                        rv34.f141175d = string;
                        rv34.f141176e = true;
                        linkedList.add(rv34);
                        C51163rv3 rv35 = new C51163rv3();
                        rv35.f141175d = nullAsNil;
                        rv35.f141176e = true;
                        linkedList2.add(rv35);
                        iy13.f135747e = linkedList;
                        iy13.f135751i = linkedList2;
                        ((LinkedList) this.f83418d).add(iy13);
                        linkedList = new LinkedList<>();
                        linkedList2 = new LinkedList<>();
                        Log.m105925i("MicroMsg.GetContactService", "getFromDb this is isOpenIM now reqlist size:%d , this req usr count:%d usr %s", Integer.valueOf(((LinkedList) this.f83418d).size()), Integer.valueOf(iy13.f135747e.size()), string);
                    } else if (nullAsNil2 == 1) {
                        C51163rv3 rv36 = new C51163rv3();
                        rv36.f141175d = string;
                        rv36.f141176e = true;
                        C51163rv3 rv37 = new C51163rv3();
                        rv37.f141175d = nullAsNil3;
                        rv37.f141176e = true;
                        linkedList3.add(new Pair(rv36, rv37));
                        Log.m105925i("MicroMsg.GetContactService", "getFromDb add user:%s scene:%s ticket:%s", string, Integer.valueOf(nullAsNil2), nullAsNil3);
                    } else if (nullAsNil2 != 0) {
                        if (sparseArray.indexOfKey(nullAsNil2) < 0) {
                            list = new LinkedList();
                            sparseArray.put(nullAsNil2, list);
                        } else {
                            list = (List) sparseArray.get(nullAsNil2);
                        }
                        list.add(string);
                    } else {
                        C51163rv3 rv38 = new C51163rv3();
                        rv38.f141175d = string;
                        rv38.f141176e = true;
                        linkedList.add(rv38);
                        C51163rv3 rv39 = new C51163rv3();
                        rv39.f141175d = nullAsNil;
                        rv39.f141176e = true;
                        linkedList2.add(rv39);
                        Log.m105925i("MicroMsg.GetContactService", "getFromDb add user:%s getScene:%s room:%s", string, Integer.valueOf(nullAsNil2), nullAsNil);
                    }
                } else {
                    linkedList4.add(string);
                    mo57991h(string, false);
                }
                if (linkedList.size() >= 20 || rawQuery.isLast()) {
                    C49915iy1 iy14 = new C49915iy1();
                    iy14.f135747e = linkedList;
                    iy14.f135746d = linkedList.size();
                    iy14.f135751i = linkedList2;
                    iy14.f135750h = linkedList2.size();
                    ((LinkedList) this.f83418d).add(iy14);
                    linkedList = new LinkedList<>();
                    LinkedList<C51163rv3> linkedList5 = new LinkedList<>();
                    Log.m105925i("MicroMsg.GetContactService", "getFromDb now reqlist size:%d , this req usr count:%d getScene=%s", Integer.valueOf(((LinkedList) this.f83418d).size()), Integer.valueOf(iy14.f135747e.size()), Integer.valueOf(nullAsNil2));
                    linkedList2 = linkedList5;
                }
                i2 = 0;
                i = 2;
                i3 = 1;
            }
            rawQuery.close();
            for (int i5 = 0; i5 < sparseArray.size(); i5++) {
                C49915iy1 iy15 = new C49915iy1();
                int keyAt = sparseArray.keyAt(i5);
                LinkedList linkedList6 = new LinkedList();
                for (String str2 : (List) sparseArray.valueAt(i5)) {
                    C51163rv3 rv310 = new C51163rv3();
                    rv310.f141175d = str2;
                    rv310.f141176e = true;
                    linkedList6.add(rv310);
                }
                iy15.f135747e.addAll(linkedList6);
                iy15.f135746d = iy15.f135747e.size();
                iy15.f135752j = keyAt;
                ((LinkedList) this.f83418d).add(iy15);
                Log.m105925i("MicroMsg.GetContactService", "[buildSceneReqList] scene=%s count=%s req size=%s", Integer.valueOf(iy15.f135752j), Integer.valueOf(iy15.f135746d), Integer.valueOf(((LinkedList) this.f83418d).size()));
            }
            sparseArray.clear();
            Iterator it = linkedList3.iterator();
            while (it.hasNext()) {
                Pair pair = (Pair) it.next();
                C49915iy1 iy16 = new C49915iy1();
                LinkedList<C51163rv3> linkedList7 = new LinkedList<>();
                linkedList7.add(pair.first);
                iy16.f135747e = linkedList7;
                iy16.f135746d = linkedList7.size();
                iy16.f135752j = 1;
                iy16.f135753n = (C51163rv3) pair.second;
                ((LinkedList) this.f83418d).add(iy16);
            }
            linkedList3.clear();
            for (int i6 = 0; i6 < linkedList4.size(); i6++) {
                String str3 = (String) linkedList4.get(i6);
                boolean U5 = C72996z1.m85820U5(str3);
                Log.m105929w("MicroMsg.GetContactService", "getFromDb try getContact Too much room usr:%s; remove from table:%s ", str3, Boolean.valueOf(U5));
                if (U5) {
                    C31118h.vx0().mo57989jo(str3);
                }
                boolean endsWith = (str3 == null || str3.length() <= 0) ? false : str3.endsWith("@qy_u");
                Log.m105929w("MicroMsg.GetContactService", "getFromDb try getContact Too much biz usr:%s; remove from table:%s ", str3, Boolean.valueOf(U5));
                if (endsWith) {
                    C31118h.vx0().mo57989jo(str3);
                    C117407d.INSTANCE.idkeyStat(832, 3, 1, false);
                }
            }
        }
    }
}
