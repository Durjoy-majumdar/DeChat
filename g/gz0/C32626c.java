package gz0;

import android.database.Cursor;
import com.tencent.p014mm.plugin.card.model.CardInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import dz0.C31352e;
import f40.C86709a0;
import hz0.C33157j0;
import hz0.C33159k0;
import hz0.C33163s;
import hz0.C46141c;
import hz0.C46153l0;
import hz0.C46160w;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import ob0.C11385n;
import ob0.C117747y;
import te3.C50426mo;

/* renamed from: gz0.c */
public class C32626c implements C11385n {

    /* renamed from: d */
    public byte[] f86604d = new byte[0];

    /* renamed from: e */
    public List<C33157j0> f86605e;

    /* renamed from: f */
    public List<C33157j0> f86606f;

    /* renamed from: g */
    public C33163s f86607g;

    /* renamed from: h */
    public List<WeakReference<C31352e>> f86608h = new ArrayList();

    public C32626c() {
        C33159k0 Ix0 = C46153l0.Ix0();
        Ix0.getClass();
        ArrayList arrayList = new ArrayList();
        Cursor rawQuery = Ix0.f90011d.rawQuery("select * from PendingCardId where retryCount < 10", (String[]) null, 2);
        while (rawQuery.moveToNext()) {
            C33157j0 j0Var = new C33157j0();
            j0Var.convertFrom(rawQuery);
            arrayList.add(j0Var);
        }
        rawQuery.close();
        Log.m105919d("MicroMsg.PendingCardIdInfoStorage", "getAll, count = %d", Integer.valueOf(arrayList.size()));
        this.f86605e = arrayList;
        this.f86606f = new ArrayList();
        Log.m105925i("MicroMsg.BatchGetCardMgr", "<init>, init pending list size = %d", Integer.valueOf(this.f86605e.size()));
        C86709a0.m107529k().f251779b.mo123455a(1074, this);
    }

    /* renamed from: a */
    public void mo58722a(int i) {
        C86709a0.m107529k().f251779b.mo123460f(new C46160w(1, i));
    }

    /* renamed from: b */
    public void mo58723b() {
        if (((ArrayList) this.f86605e).size() == 0) {
            Log.m105924i("MicroMsg.BatchGetCardMgr", "getNow, no pending cardinfo ,no need to get");
        } else if (this.f86607g != null) {
            Log.m105924i("MicroMsg.BatchGetCardMgr", "getNow, already doing scene, not trigger now");
        } else {
            LinkedList linkedList = new LinkedList();
            if (((ArrayList) this.f86605e).size() <= 10) {
                linkedList.addAll(this.f86605e);
            } else {
                linkedList.addAll(((ArrayList) this.f86605e).subList(0, 10));
            }
            this.f86607g = new C33163s(linkedList);
            C86709a0.m107529k().f251779b.mo123460f(this.f86607g);
        }
    }

    /* renamed from: c */
    public void mo58724c(C50426mo moVar) {
        if (moVar == null) {
            Log.m105920e("MicroMsg.BatchGetCardMgr", "push fail, CardUserItem is null");
            return;
        }
        C46141c Gx0 = C46153l0.Gx0();
        CardInfo Lo = Gx0.mo71595Lo("" + moVar.f138120d);
        Object[] objArr = new Object[3];
        objArr[0] = moVar.f138120d;
        objArr[1] = Long.valueOf(Lo == null ? 0 : Lo.field_updateSeq);
        objArr[2] = Long.valueOf(moVar.f138121e);
        Log.m105925i("MicroMsg.BatchGetCardMgr", "pushCardUserItem, cardUserId = %s, localSeq = %d, svrSeq = %d", objArr);
        if (Lo == null || Lo.field_updateSeq != moVar.f138121e) {
            C33157j0 j0Var = new C33157j0();
            j0Var.field_cardUserId = moVar.f138120d;
            synchronized (this.f86604d) {
                if (!((ArrayList) this.f86605e).contains(j0Var)) {
                    if (!((ArrayList) this.f86606f).contains(j0Var)) {
                        ((ArrayList) this.f86605e).add(j0Var);
                        Log.m105925i("MicroMsg.BatchGetCardMgr", "pushCardUserItem, insertRet = %b", Boolean.valueOf(C46153l0.Ix0().insert(j0Var)));
                        return;
                    }
                    return;
                }
                return;
            }
        }
        Log.m105920e("MicroMsg.BatchGetCardMgr", "push CardUserItem fail, card.field_updateSeq == item.UpdateSequence");
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        C31352e eVar;
        Log.m105925i("MicroMsg.BatchGetCardMgr", "onSceneEnd, errType = %d, errCode = %d", Integer.valueOf(i), Integer.valueOf(i2));
        this.f86607g = null;
        LinkedList<C33157j0> linkedList = ((C33163s) yVar).f90022g;
        if (i == 0 && i2 == 0) {
            Object[] objArr = new Object[1];
            objArr[0] = Integer.valueOf(linkedList == null ? 0 : linkedList.size());
            Log.m105925i("MicroMsg.BatchGetCardMgr", "onSceneEnd, batch get succ, remove succ id list, size = %d", objArr);
            if (linkedList != null) {
                synchronized (this.f86604d) {
                    ((ArrayList) this.f86605e).removeAll(linkedList);
                }
            }
            long currentTimeMillis = System.currentTimeMillis();
            long beginTransaction = C86709a0.m107535s().f251811i.beginTransaction(Thread.currentThread().getId());
            C33159k0 Ix0 = C46153l0.Ix0();
            Ix0.getClass();
            if (linkedList == null || linkedList.size() == 0) {
                Log.m105920e("MicroMsg.PendingCardIdInfoStorage", "deleteList fail, list is empty");
            } else {
                for (C33157j0 next : linkedList) {
                    if (next != null) {
                        Ix0.delete(next, new String[0]);
                    }
                }
            }
            C86709a0.m107535s().f251811i.endTransaction(beginTransaction);
            Log.m105925i("MicroMsg.BatchGetCardMgr", "onSceneEnd do transaction use time %s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
            mo58723b();
            if (this.f86608h != null) {
                for (int i3 = 0; i3 < ((ArrayList) this.f86608h).size(); i3++) {
                    WeakReference weakReference = (WeakReference) ((ArrayList) this.f86608h).get(i3);
                    if (!(weakReference == null || (eVar = (C31352e) weakReference.get()) == null)) {
                        eVar.mo58084H4();
                    }
                }
                return;
            }
            return;
        }
        Log.m105921e("MicroMsg.BatchGetCardMgr", "onSceneEnd fail, stop batch get, errType = %d, errCode = %d", Integer.valueOf(i), Integer.valueOf(i2));
        synchronized (this.f86604d) {
            if (linkedList != null) {
                if (linkedList.size() > 0) {
                    ((ArrayList) this.f86605e).removeAll(linkedList);
                    ((ArrayList) this.f86606f).addAll(linkedList);
                }
            }
        }
        C33159k0 Ix02 = C46153l0.Ix0();
        Ix02.getClass();
        if (linkedList == null || linkedList.size() == 0) {
            Log.m105920e("MicroMsg.PendingCardIdInfoStorage", "increaseRetryCount fail, list is empty");
            return;
        }
        for (C33157j0 next2 : linkedList) {
            if (next2 != null) {
                next2.field_retryCount++;
                Ix02.update(next2, new String[0]);
            }
        }
    }
}
