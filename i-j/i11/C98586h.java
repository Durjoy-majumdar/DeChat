package i11;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.wcdb.support.CancellationSignal;
import eb0.C97625j3;
import g62.C75875l;
import j11.C98894c;
import j11.C98895d;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import wy0.C102506a;
import yy0.C102970a;
import zh3.C91753f;

/* renamed from: i11.h */
public class C98586h implements Runnable {

    /* renamed from: d */
    public final List<String> f289074d;

    /* renamed from: e */
    public final List<C98895d> f289075e;

    /* renamed from: f */
    public final C98894c f289076f;

    /* renamed from: g */
    public final int[] f289077g;

    /* renamed from: h */
    public final long f289078h;

    /* renamed from: i */
    public final long f289079i;

    /* renamed from: j */
    public final CancellationSignal f289080j;

    /* renamed from: n */
    public final boolean f289081n;

    /* renamed from: o */
    public long f289082o = 0;

    public C98586h(List<String> list, List<C98895d> list2, int[] iArr, long j, long j2, boolean z, C98894c cVar, CancellationSignal cancellationSignal) {
        this.f289074d = list;
        this.f289075e = list2;
        this.f289077g = iArr;
        this.f289078h = j;
        this.f289079i = j2;
        this.f289081n = z;
        this.f289076f = cVar;
        this.f289080j = cancellationSignal == null ? new CancellationSignal() : cancellationSignal;
    }

    /* renamed from: a */
    public final void mo137954a(List<Long> list) {
        C91753f x = C97625j3.m125812b().mo105909x();
        C75875l z = C97625j3.m125812b().mo105911z();
        long beginTransaction = x.beginTransaction(Thread.currentThread().getId());
        for (Long longValue : list) {
            long longValue2 = longValue.longValue();
            C72972g4 g4Var = (C72972g4) z;
            C72963f4 b002 = g4Var.b00(longValue2);
            if (b002.getMsgId() != 0 && !b002.mo100972K3()) {
                b002.f230727J |= 1;
                b002.f230755r = true;
                g4Var.xy0(longValue2, b002);
            }
        }
        x.endTransaction(beginTransaction);
    }

    /* renamed from: b */
    public final void mo137955b(List<C102970a> list) {
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        loop0:
        while (true) {
            int i = 0;
            for (C102970a next : list) {
                if (next != null) {
                    long j = next.field_diskSpace;
                    if (j > 0) {
                        this.f289082o += j;
                    }
                    C86013q1.m106447h(next.mo142683l2());
                    arrayList2.add(next);
                    if (arrayList2.size() >= 8) {
                        C102506a.f301832a.mo142120e().mo142699jo(arrayList2);
                        arrayList2.clear();
                    }
                    i++;
                    if (hashSet.add(Long.valueOf(next.field_msgId))) {
                        arrayList.add(Long.valueOf(next.field_msgId));
                    }
                    if (i > 128 || arrayList.size() > 32) {
                        if (this.f289081n) {
                            mo137954a(arrayList);
                        }
                        arrayList.clear();
                    }
                }
            }
            break loop0;
        }
        if (!arrayList2.isEmpty()) {
            C102506a.f301832a.mo142120e().mo142699jo(arrayList2);
        }
        if (!arrayList.isEmpty() && this.f289081n) {
            mo137954a(arrayList);
        }
    }

    /* renamed from: c */
    public final String mo137956c() {
        return hashCode() + "";
    }

    public void run() {
        ArrayList arrayList;
        int i;
        if (this.f289074d != null) {
            long currentTicks = Util.currentTicks();
            int size = this.f289074d.size();
            int i2 = 0;
            for (String next : this.f289074d) {
                if (this.f289080j.isCanceled()) {
                    break;
                }
                if (!Util.isNullOrNil(next)) {
                    long currentTimeMillis = System.currentTimeMillis();
                    List<C102970a> mI = C102506a.f301832a.mo142120e().mo142701mI(next, this.f289079i, this.f289078h, this.f289077g, false);
                    int size2 = ((ArrayList) mI).size();
                    mo137955b(mI);
                    i = 1;
                    Log.m105925i("MicroMsg.DeleteFileByWxIndex", "%s deleteByName [%s] [%d] cost[%d]", mo137956c(), next, Integer.valueOf(size2), Long.valueOf(Util.ticksToNow(currentTimeMillis)));
                } else {
                    i = 1;
                }
                i2 += i;
                C98894c cVar = this.f289076f;
                if (cVar != null) {
                    cVar.mo127430W1(i2, size);
                }
            }
            C98894c cVar2 = this.f289076f;
            if (cVar2 != null) {
                cVar2.mo127431q7(this.f289080j.isCanceled(), this.f289082o);
            }
            Log.m105925i("MicroMsg.DeleteFileByWxIndex", "%s deleteByUsername cost[%d]", mo137956c(), Long.valueOf(Util.ticksToNow(currentTicks)));
        } else if (this.f289075e != null) {
            long currentTicks2 = Util.currentTicks();
            int size3 = this.f289075e.size();
            int i3 = 0;
            for (C98895d next2 : this.f289075e) {
                if (this.f289080j.isCanceled()) {
                    break;
                }
                if (this.f289077g != null) {
                    ArrayList arrayList2 = new ArrayList(((ArrayList) next2.f289905l).size());
                    Iterator it = ((ArrayList) next2.f289905l).iterator();
                    while (it.hasNext()) {
                        C102970a aVar = (C102970a) it.next();
                        int[] iArr = this.f289077g;
                        int i4 = aVar.field_msgSubType;
                        IAutoDBItem.MAutoDBInfo mAutoDBInfo = C102970a.f303861F;
                        if (Arrays.binarySearch(iArr, i4) >= 0) {
                            arrayList2.add(aVar);
                        }
                    }
                    arrayList = arrayList2;
                } else {
                    arrayList = next2.f289905l;
                }
                mo137955b(arrayList);
                i3++;
                C98894c cVar3 = this.f289076f;
                if (cVar3 != null) {
                    cVar3.mo127430W1(i3, size3);
                }
            }
            C98894c cVar4 = this.f289076f;
            if (cVar4 != null) {
                cVar4.mo127431q7(this.f289080j.isCanceled(), this.f289082o);
            }
            Log.m105925i("MicroMsg.DeleteFileByWxIndex", "%s deleteByNewAnalyseItem cost[%d]", mo137956c(), Long.valueOf(Util.ticksToNow(currentTicks2)));
        }
    }
}
