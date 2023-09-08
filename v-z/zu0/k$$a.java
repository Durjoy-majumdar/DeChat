package zu0;

import android.text.TextUtils;
import android.util.Pair;
import com.tencent.p014mm.pointers.PLong;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.vfs.C86013q1;
import gv0.C20849e;
import gv0.C20850f;
import gv0.C20851g;
import gv0.e$$c;
import gv0.e$$d;
import java.util.Iterator;
import java.util.LinkedList;
import pv0.C100968x;
import te3.C77926f9;
import yu0.C23367h;

public final /* synthetic */ class k$$a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C23584k f67640d;

    /* renamed from: e */
    public final /* synthetic */ C23590t f67641e;

    /* renamed from: f */
    public final /* synthetic */ C23367h f67642f;

    /* renamed from: g */
    public final /* synthetic */ C77926f9 f67643g;

    /* renamed from: h */
    public final /* synthetic */ PLong f67644h;

    /* renamed from: i */
    public final /* synthetic */ C72963f4 f67645i;

    /* renamed from: j */
    public final /* synthetic */ LinkedList f67646j;

    public /* synthetic */ k$$a(C23584k kVar, C23590t tVar, C23367h hVar, C77926f9 f9Var, PLong pLong, C72963f4 f4Var, LinkedList linkedList) {
        this.f67640d = kVar;
        this.f67641e = tVar;
        this.f67642f = hVar;
        this.f67643g = f9Var;
        this.f67644h = pLong;
        this.f67645i = f4Var;
        this.f67646j = linkedList;
    }

    public final void run() {
        String str;
        Iterator it;
        e$$c e__c;
        int i;
        int i2;
        Pair pair;
        C23584k kVar = this.f67640d;
        C23590t tVar = this.f67641e;
        C23367h hVar = this.f67642f;
        C77926f9 f9Var = this.f67643g;
        PLong pLong = this.f67644h;
        C72963f4 f4Var = this.f67645i;
        LinkedList linkedList = this.f67646j;
        kVar.getClass();
        long j = pLong.value;
        long createTime = f4Var.getCreateTime();
        tVar.getClass();
        Log.m105925i("MicroMsg.BackupPackAndSend.TagQueueSucker", "addToTag sessionName:%s mediaList:%d, svrId:%d, msgId:%d, fromUser:%s, toUser:%s, type:%d, mediaCount:%d", hVar.f67132a, Integer.valueOf(linkedList.size()), Long.valueOf(f9Var.f227348v), Integer.valueOf(f9Var.f227341o), f9Var.f227335f, f9Var.f227336g, Integer.valueOf(f9Var.f227333d), Integer.valueOf(f9Var.f227342p));
        if (tVar.f67686b == null) {
            tVar.f67686b = new C23589s(tVar.f67685a, hVar);
        }
        long j2 = tVar.f67687c;
        if (j2 == 0 || f9Var.f227350x > j2) {
            tVar.f67687c = f9Var.f227350x;
        } else {
            Log.m105925i("MicroMsg.BackupPackAndSend.TagQueueSucker", "fix beforeTime:%d, clientMsgMilTime:%d", Long.valueOf(j2), Long.valueOf(f9Var.f227350x));
            long j3 = tVar.f67687c + 1;
            f9Var.f227350x = j3;
            tVar.f67687c = j3;
        }
        C23589s sVar = tVar.f67686b;
        sVar.f67678i.add(f9Var);
        if (sVar.f67675f == 0) {
            sVar.f67675f = createTime;
        }
        sVar.f67676g = createTime;
        Iterator it4 = linkedList.iterator();
        while (it4.hasNext()) {
            C100968x xVar = (C100968x) it4.next();
            String str2 = xVar.f295675f;
            String str3 = xVar.f295676g;
            s$$c s__c = new s$$c(sVar);
            if (TextUtils.isEmpty(str3)) {
                it = it4;
                str = str3;
                if (!sVar.f67678i.isEmpty() && str2 != null) {
                    e$$d e__d = sVar.f67681l;
                    LinkedList linkedList2 = new LinkedList(sVar.f67678i);
                    byte[] bArr = sVar.f67670a.f67615d.f303746f;
                    int i3 = C20849e.f58894A;
                    C23584k.f67611q.mo37041a(new C20851g(s__c, linkedList2, e__d, str2, bArr), ((long) linkedList2.size()) * 10240);
                }
            } else if (str2 != null) {
                PLong pLong2 = new PLong();
                e$$d e__d2 = sVar.f67681l;
                byte[] bArr2 = sVar.f67670a.f67615d.f303746f;
                int i4 = C20849e.f58894A;
                e$$c e__c2 = new e$$c(str3);
                int i5 = e__c2.f58907c;
                it = it4;
                str = str3;
                if (i5 <= 0) {
                    e__c = e__c2;
                    i = 1;
                } else {
                    long j4 = (long) i5;
                    e__c = e__c2;
                    i = (int) (j4 / 524288);
                    if (j4 % 524288 != 0) {
                        i++;
                    }
                }
                pLong2.value = (long) i5;
                for (int i6 = 0; i6 < i; i6 = i2 + 1) {
                    e$$c e__c3 = e__c;
                    int i7 = e__c3.f58907c;
                    if (i7 <= 0) {
                        pair = new Pair(0, new byte[0]);
                        i2 = i6;
                    } else {
                        long j5 = (long) (i7 - e__c3.f58908d);
                        if (j5 > 524288) {
                            j5 = 524288;
                        }
                        int i8 = (int) j5;
                        byte[] bArr3 = new byte[i8];
                        i2 = i6;
                        boolean z = ((long) i8) < 524288;
                        try {
                            if (e__c3.f58909e == null) {
                                e__c3.f58909e = C86013q1.m106423E(e__c3.f58906b);
                            }
                            if (e__c3.f58909e.read(bArr3) == i8) {
                                if (z) {
                                    e__c3.f58909e.close();
                                }
                            }
                        } catch (Exception unused) {
                        }
                        int i9 = e__c3.f58908d;
                        e__c3.f58908d = i8 + i9;
                        pair = new Pair(Integer.valueOf(i9), bArr3);
                    }
                    if (pair.second == null || pair.first == null) {
                        Log.m105929w("MicroMsg.BackupDataPushScene", "BackupDataPushScene media backFileOp getNext error, file path:%s", e__c3.f58906b);
                    }
                    C23584k.f67611q.mo37041a(new C20850f(s__c, e__d2, str2, e__c3, bArr2, (byte[]) pair.second, ((Integer) pair.first).intValue()), 524288);
                    e__c = e__c3;
                }
                sVar.f67670a.f67625n.value += pLong2.value;
            } else {
                it = it4;
                str = str3;
            }
            Log.m105925i(sVar.f67671b, "postSendFile chatMsgList:%d, mediaId:%s, path:%s ", Integer.valueOf(sVar.f67678i.size()), str2, str);
            it4 = it;
        }
        int size = sVar.f67678i.size();
        sVar.f67670a.getClass();
        if (size > 100) {
            sVar.mo37060a();
            sVar.mo37061b((C23588r) null);
        }
        kVar.f67617f.addAndGet(-pLong.value);
        if (kVar.f67617f.get() <= ((long) kVar.f67612a)) {
            kVar.f67618g.open();
        }
    }
}
