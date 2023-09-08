package on3;

import a11.C39479c;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import com.tencent.p014mm.sdk.storage.executor.InsertExecutor;
import com.tencent.p014mm.sdk.storage.observer.StorageEventId;
import com.tencent.p014mm.sdk.storage.observer.StorageObserverEvent;
import com.tencent.p014mm.sdk.storage.sql.SingleTable;
import com.tencent.p014mm.storage.C44661m1;
import com.tencent.p014mm.storage.C44662n1;
import com.tencent.p014mm.storage.C72958d5;
import com.tencent.xweb.xwalk.plugin.XWalkPlugin;
import f40.C86709a0;
import fy3.C32224a;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import i40.C46166d;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import jn3.C60885g;
import p749xh.C78806c9;
import pe3.C89349b;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import te3.C50748ox1;
import te3.C51018qv3;
import te3.gh4;
import te3.hh4;
import zh3.C91753f;

/* renamed from: on3.f */
public final class C77022f {

    /* renamed from: d */
    public static final C77024b f225022d = new C77024b((C8480h) null);

    /* renamed from: e */
    public static final SingleTable f225023e = C78806c9.f230584h;

    /* renamed from: f */
    public static final C13601g<C46166d> f225024f = C36568h.m40985a(C77023a.f225028d);

    /* renamed from: a */
    public final String f225025a;

    /* renamed from: b */
    public final String f225026b;

    /* renamed from: c */
    public final C13601g f225027c = C36568h.m40985a(new C77025c(this));

    /* renamed from: on3.f$a */
    public static final class C77023a extends C87413o implements C32224a<C46166d> {

        /* renamed from: d */
        public static final C77023a f225028d = new C77023a();

        public C77023a() {
            super(0);
        }

        public Object invoke() {
            C78806c9.createTable(C86709a0.m107535s().f251811i);
            return new C46166d();
        }
    }

    /* renamed from: on3.f$b */
    public static final class C77024b {
        public C77024b(C8480h hVar) {
        }

        /* renamed from: a */
        public final C46166d mo107347a() {
            return (C46166d) ((C36570n) C77022f.f225024f).getValue();
        }
    }

    /* renamed from: on3.f$c */
    public static final class C77025c extends C87413o implements C32224a<List<C72958d5>> {

        /* renamed from: d */
        public final /* synthetic */ C77022f f225029d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C77025c(C77022f fVar) {
            super(0);
            this.f225029d = fVar;
        }

        public Object invoke() {
            List<C72958d5> multiQuery = C77022f.f225023e.selectAll().where(C78806c9.f230585i.equal(this.f225029d.f225025a)).build().multiQuery(C77022f.f225022d.mo107347a().getDB(), C72958d5.class);
            C44662n1 n1Var = (C44662n1) ((C39479c) C86709a0.m107533q(C39479c.class)).mo62084mr();
            C44661m1 Lo = n1Var.mo69799Lo(this.f225029d.f225025a);
            if (Lo != null) {
                C77022f fVar = this.f225029d;
                if ((Lo.field_compactFlag & 1) == 0 && Lo.field_roomInfoDetailResByte != null) {
                    C50748ox1 ox12 = new C50748ox1();
                    try {
                        ox12.parseFrom(Lo.field_roomInfoDetailResByte);
                        fVar.mo107345c(multiQuery, ox12.f139433s);
                    } catch (Throwable th) {
                        Log.printErrStackTrace(fVar.f225026b, th, "init parse detail err", new Object[0]);
                    }
                    Lo.field_compactFlag |= 1;
                    n1Var.replace(Lo);
                }
            }
            return multiQuery;
        }
    }

    public C77022f(String str) {
        C87412m.m108594g(str, "chatRoomName");
        this.f225025a = str;
        this.f225026b = "TopMsg.TopMsgInfoRecordHelper@" + str;
    }

    /* renamed from: a */
    public final void mo107343a(long j) {
        T t;
        boolean z;
        Iterator<T> it = mo107344b().iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            if (((C72958d5) t).mo108716n2().f183488f == j) {
                z = true;
                continue;
            } else {
                z = false;
                continue;
            }
            if (z) {
                break;
            }
        }
        C72958d5 d5Var = (C72958d5) t;
        if (d5Var != null) {
            d5Var.mo108719q2(true);
            d5Var.updateToDB(f225022d.mo107347a().getDB(), true);
            Log.m105925i(this.f225026b, "cancelBySrvId() succeed :%s", Long.valueOf(j));
            return;
        }
        Log.m105921e(this.f225026b, "cancelBySrvId() called can not find :%s", Long.valueOf(j));
    }

    /* renamed from: b */
    public final List<C72958d5> mo107344b() {
        return (List) ((C36570n) this.f225027c).getValue();
    }

    /* renamed from: c */
    public final void mo107345c(List<C72958d5> list, C51018qv3 qv32) {
        C87412m.m108594g(list, XWalkPlugin.PRIVATE_CACHE_DIR_NAME);
        if (qv32 != null) {
            try {
                C89349b bVar = qv32.f140574f;
                if (bVar != null) {
                    byte[] bArr = bVar.f257327a;
                    if (bArr != null) {
                        gh4 gh4 = new gh4();
                        gh4.parseFrom(bArr);
                        mo107346d(list, gh4.f183332d);
                        return;
                    }
                }
            } catch (Throwable th) {
                Log.printErrStackTrace(this.f225026b, th, "updateTopMsgInfoItemsByServer err", new Object[0]);
                return;
            }
        }
        mo107346d(list, new LinkedList());
    }

    /* renamed from: d */
    public final void mo107346d(List<C72958d5> list, List<? extends hh4> list2) {
        String str;
        T t;
        boolean z;
        T t2;
        boolean z2;
        String str2 = this.f225026b;
        StringBuilder sb = new StringBuilder();
        sb.append("updateTopMsgInfoItemsByServer() called with: items = ");
        if (list2 != null) {
            StringBuilder sb4 = new StringBuilder("size:" + list2.size());
            for (hh4 a : list2) {
                sb4.append(C60885g.m71299a(a));
            }
            str = sb4.toString();
            C87412m.m108593f(str, "sb.toString()");
        } else {
            str = null;
        }
        sb.append(str);
        Log.m105918d(str2, sb.toString());
        List<? extends hh4> linkedList = list2 == null ? new LinkedList<>() : list2;
        StringBuilder sb5 = new StringBuilder();
        ISQLiteDatabase db = f225022d.mo107347a().getDB();
        C87412m.m108592e(db, "null cannot be cast to non-null type com.tencent.mm.sdk.storage.ISQLiteDatabase");
        long beginTransaction = ((C91753f) db).beginTransaction(Thread.currentThread().getId());
        LinkedList linkedList2 = new LinkedList();
        Iterator<C72958d5> it = list.iterator();
        while (it.hasNext()) {
            C72958d5 next = it.next();
            Iterator<T> it4 = linkedList.iterator();
            while (true) {
                if (!it4.hasNext()) {
                    t2 = null;
                    break;
                }
                t2 = it4.next();
                if (((hh4) t2).f183486d == next.getId()) {
                    z2 = true;
                    continue;
                } else {
                    z2 = false;
                    continue;
                }
                if (z2) {
                    break;
                }
            }
            if (((hh4) t2) == null) {
                linkedList2.add(next);
                it.remove();
                int deleteFromDB = next.deleteFromDB(f225022d.mo107347a().getDB(), true);
                sb5.append("d:" + next.mo108716n2().f183486d + '-' + deleteFromDB);
            }
        }
        for (hh4 hh4 : linkedList) {
            Iterator<T> it5 = list.iterator();
            while (true) {
                if (!it5.hasNext()) {
                    t = null;
                    break;
                }
                t = it5.next();
                if (((C72958d5) t).getId() == hh4.f183486d) {
                    z = true;
                    continue;
                } else {
                    z = false;
                    continue;
                }
                if (z) {
                    break;
                }
            }
            C72958d5 d5Var = (C72958d5) t;
            if (d5Var == null) {
                C72958d5 d5Var2 = new C72958d5();
                d5Var2.mo108718p2(hh4.f183486d);
                d5Var2.mo108720r2(hh4);
                d5Var2.mo108717o2(this.f225025a);
                list.add(d5Var2);
                ISQLiteDatabase db4 = f225022d.mo107347a().getDB();
                StorageObserverEvent storageObserverEvent = new StorageObserverEvent(StorageEventId.getINSERT(), String.valueOf(d5Var2.getPrimaryKeyValue()), "MicroMsg.SDK.BaseTopMsgInfoRecord");
                storageObserverEvent.setObj(d5Var2);
                long execute = new InsertExecutor(d5Var2, true, storageObserverEvent, C78806c9.f230593t, "MicroMsg.SDK.BaseTopMsgInfoRecord").execute(db4);
                sb5.append("i:" + hh4.f183486d + '-' + execute);
            } else {
                List<C72958d5> list3 = list;
                d5Var.mo108720r2(hh4);
                int updateToDB = d5Var.updateToDB(f225022d.mo107347a().getDB(), true);
                sb5.append("u:" + d5Var.mo108716n2().f183486d + '-' + updateToDB);
            }
        }
        List<C72958d5> list4 = list;
        ISQLiteDatabase db5 = f225022d.mo107347a().getDB();
        if (db5 != null) {
            ((C91753f) db5).endTransaction(beginTransaction);
        }
        String str3 = this.f225026b;
        StringBuilder sb6 = new StringBuilder();
        sb6.append("after update opRes=");
        sb6.append(sb5);
        sb6.append(" cache=");
        StringBuilder sb7 = new StringBuilder("size:" + list.size());
        for (C72958d5 d5Var3 : list) {
            C87412m.m108594g(d5Var3, "<this>");
            StringBuilder sb8 = new StringBuilder();
            sb8.append("item{id=");
            sb8.append(d5Var3.getId());
            sb8.append(" isCancel =");
            sb8.append(d5Var3.mo108715m2());
            sb8.append(" item=");
            hh4 n2 = d5Var3.mo108716n2();
            C87412m.m108593f(n2, "topMsgInfoItem");
            sb8.append(C60885g.m71299a(n2));
            sb8.append('}');
            sb7.append(sb8.toString());
        }
        String sb9 = sb7.toString();
        C87412m.m108593f(sb9, "sb.toString()");
        sb6.append(sb9);
        Log.m105918d(str3, sb6.toString());
    }
}
