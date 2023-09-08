package dc0;

import android.os.Looper;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import eb0.C45612m0;
import eb0.C75597w2;
import eb0.C97625j3;
import f40.C86709a0;
import f62.C75700k0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import kj2.C117407d;
import p214om.C11502f;
import sf0.C48374j0;
import te3.C49075d04;
import te3.C50051jy1;
import te3.C50052jy2;
import te3.rq4;

public class d$$f implements MTimerHandler.CallBack {

    /* renamed from: d */
    public final /* synthetic */ C31113d f83431d;

    /* renamed from: dc0.d$$f$a */
    public class C31114a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ String f83432d;

        /* renamed from: e */
        public final /* synthetic */ String f83433e;

        /* renamed from: f */
        public final /* synthetic */ boolean f83434f;

        public C31114a(String str, String str2, boolean z) {
            this.f83432d = str;
            this.f83433e = str2;
            this.f83434f = z;
        }

        public void run() {
            LinkedList linkedList;
            LinkedList linkedList2;
            Log.m105925i("MicroMsg.GetContactService", "callback user:%s alias:%s", Util.nullAs(this.f83432d, ""), Util.nullAs(this.f83433e, ""));
            synchronized (this) {
                linkedList = (LinkedList) ((HashMap) d$$f.this.f83431d.f83417c).remove(this.f83432d);
                if (Util.isNullOrNil(this.f83433e)) {
                    linkedList2 = null;
                } else {
                    linkedList2 = (LinkedList) ((HashMap) d$$f.this.f83431d.f83417c).remove(this.f83433e);
                }
            }
            if (linkedList != null) {
                Log.m105925i("MicroMsg.GetContactService", "callback userCallbackContainer user:%s size:%s", Util.nullAs(this.f83432d, ""), Integer.valueOf(linkedList.size()));
                Iterator it = linkedList.iterator();
                while (it.hasNext()) {
                    ((C75597w2.C31525a) it.next()).mo1109a(this.f83432d, this.f83434f);
                }
            }
            if (linkedList2 != null) {
                Log.m105925i("MicroMsg.GetContactService", "callback aliasCallbackContainer user:%s size:%s", Util.nullAs(this.f83432d, ""), Integer.valueOf(linkedList2.size()));
                Iterator it4 = linkedList2.iterator();
                while (it4.hasNext()) {
                    ((C75597w2.C31525a) it4.next()).mo1109a(this.f83432d, this.f83434f);
                }
            }
        }
    }

    public d$$f(C31113d dVar) {
        this.f83431d = dVar;
    }

    public boolean onTimerExpired() {
        boolean z;
        boolean z2;
        char c;
        char c2;
        char c3;
        int i;
        char c4 = 0;
        if (this.f83431d.f83419e.isEmpty()) {
            Log.m105924i("MicroMsg.GetContactService", "tryStartNetscene respHandler queue maybe this time is null , wait doscene!");
            return false;
        }
        long nowMilliSecond = Util.nowMilliSecond();
        int i2 = this.f83431d.f83415a ? 5 : 15;
        ArrayList arrayList = new ArrayList(i2 * 2);
        int i3 = 0;
        while (true) {
            z = true;
            if (i3 >= i2) {
                break;
            }
            d$$g d__g = (d$$g) ((LinkedList) this.f83431d.f83419e).peek();
            if (d__g == null) {
                Log.m105924i("MicroMsg.GetContactService", "tryStartNetscene respHandler queue maybe this time is null , break and wait doscene!");
                break;
            }
            C50051jy1 jy12 = d__g.f83436a;
            LinkedList<C50052jy2> linkedList = jy12.f136382e;
            LinkedList<Integer> linkedList2 = jy12.f136383f;
            LinkedList<C49075d04> linkedList3 = jy12.f136385h;
            if (linkedList3 != null && linkedList3.size() > 0) {
                Iterator<C49075d04> it = linkedList3.iterator();
                while (it.hasNext()) {
                    C49075d04 next = it.next();
                    if (next != null) {
                        ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().mo69676X2(next.f132054d, next.f132055e);
                    }
                }
            }
            int i4 = d__g.f83437b;
            if (linkedList2.size() != linkedList.size()) {
                Object[] objArr = new Object[2];
                objArr[c4] = Integer.valueOf(linkedList2.size());
                objArr[1] = Integer.valueOf(linkedList.size());
                Log.m105929w("MicroMsg.GetContactService", "find warn %s %s", objArr);
            }
            int min = Math.min(linkedList2.size(), linkedList.size());
            if (min <= i4) {
                ((LinkedList) this.f83431d.f83419e).poll();
                if (this.f83431d.f83419e.isEmpty()) {
                    Object[] objArr2 = new Object[2];
                    objArr2[c4] = Integer.valueOf(i4);
                    objArr2[1] = Integer.valueOf(min);
                    Log.m105925i("MicroMsg.GetContactService", "tryStartNetscene respHandler resp proc fin gr.curIdx:%d size:%d and retList is empty break", objArr2);
                    C31113d dVar = this.f83431d;
                    dVar.f83420f = 0;
                    dVar.f83422h.startTimer(0);
                    break;
                }
                Object[] objArr3 = new Object[2];
                objArr3[c4] = Integer.valueOf(i4);
                objArr3[1] = Integer.valueOf(min);
                Log.m105925i("MicroMsg.GetContactService", "tryStartNetscene respHandler resp proc fin gr.curIdx:%d size:%d and retList is not empty continue next", objArr3);
            } else {
                C50052jy2 jy22 = linkedList.get(i4);
                int intValue = linkedList2.get(i4).intValue();
                String str = "";
                String nullAs = Util.nullAs(C48374j0.m53718g(jy22.f136424d), str);
                String nullAs2 = Util.nullAs(jy22.f136395J, str);
                String nullAs3 = Util.nullAs(jy22.f136419Z, str);
                arrayList.add(nullAs);
                arrayList.add(nullAs2);
                arrayList.add(nullAs3);
                if (intValue == -477) {
                    Log.m105921e("MicroMsg.GetContactService", "respHandler getFailed USERNAME_INVAILD :%d ErrName: %s %s %s %s %s", Integer.valueOf(intValue), nullAs, nullAs2, Boolean.valueOf(C31118h.vx0().mo57989jo(nullAs)), Boolean.valueOf(C31118h.vx0().mo57989jo(nullAs2)), Boolean.valueOf(C45612m0.m50683J(nullAs)));
                    C117407d.INSTANCE.idkeyStat(832, 1, 1, false);
                    z2 = false;
                } else if (intValue != 0) {
                    Log.m105921e("MicroMsg.GetContactService", "respHandler getFailed :%d ErrName: %s %s %s", Integer.valueOf(intValue), nullAs, nullAs2, Boolean.valueOf(C45612m0.m50683J(nullAs)));
                    C117407d.INSTANCE.idkeyStat(832, 2, 1, false);
                    z2 = false;
                } else {
                    LinkedList<rq4> linkedList4 = d__g.f83436a.f136384g;
                    if (linkedList4 == null || linkedList4.size() <= i4 || !nullAs.equals(d__g.f83436a.f136384g.get(i4).f141081d)) {
                        Object[] objArr4 = new Object[3];
                        LinkedList<rq4> linkedList5 = d__g.f83436a.f136384g;
                        c = 0;
                        objArr4[0] = linkedList5 == null ? "null" : Integer.valueOf(linkedList5.size());
                        c2 = 1;
                        objArr4[1] = Integer.valueOf(i4);
                        c3 = 2;
                        objArr4[2] = nullAs;
                        Log.m105929w("MicroMsg.GetContactService", "get antispamticket from resp failed: list:%s idx:%d  user:%s", objArr4);
                        i = 4;
                    } else {
                        str = Util.nullAs(d__g.f83436a.f136384g.get(i4).f141082e, str);
                        i = 4;
                        c3 = 2;
                        c2 = 1;
                        c = 0;
                    }
                    Object[] objArr5 = new Object[i];
                    objArr5[c] = nullAs;
                    objArr5[c2] = nullAs2;
                    objArr5[c3] = str;
                    objArr5[3] = Integer.valueOf(d__g.f83438c);
                    Log.m105925i("MicroMsg.GetContactService", "dkverify respHandler mod contact: %s %s %s %s", objArr5);
                    ((C11502f) C86312j.m106911c(C11502f.class)).mo11461Sr().mo93139D4(jy22, str, (byte[]) null, true, false, d__g.f83438c);
                    C117407d.INSTANCE.idkeyStat(832, 0, 1, false);
                    z2 = true;
                }
                new MMHandler(Looper.getMainLooper()).post(new C31114a(nullAs, nullAs2, z2));
                d__g.f83437b++;
            }
            i3++;
            c4 = 0;
        }
        z = false;
        int size = arrayList.size();
        if (size > 0) {
            long beginTransaction = C97625j3.m125812b().mo105909x().beginTransaction(Thread.currentThread().getId());
            C31112c vx02 = C31118h.vx0();
            for (int i5 = 0; i5 < size; i5++) {
                vx02.mo57989jo((String) arrayList.get(i5));
            }
            C97625j3.m125812b().mo105909x().endTransaction(beginTransaction);
        }
        Log.m105924i("MicroMsg.GetContactService", "tryStartNetscene respHandler onTimerExpired netSceneRunning : " + this.f83431d.f83415a + " ret: " + z + " maxCnt: " + i2 + " deleteCount: " + size + " take: " + (Util.nowMilliSecond() - nowMilliSecond) + LocaleUtil.MALAY);
        return z;
    }
}
