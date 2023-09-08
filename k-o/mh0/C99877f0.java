package mh0;

import androidx.lifecycle.C0123n0;
import androidx.lifecycle.C39622i0;
import androidx.lifecycle.C54209k0;
import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import com.tencent.p014mm.sdk.storage.executor.DeleteExecutor;
import com.tencent.p014mm.sdk.storage.observer.StorageEventId;
import com.tencent.p014mm.sdk.storage.observer.StorageObserverEvent;
import com.tencent.p014mm.sdk.storage.sql.SelectSql;
import com.tencent.p014mm.storage.C57594e4;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import f40.C86709a0;
import gy3.C87412m;
import i40.C60247c;
import java.util.ArrayList;
import p1083jg.C98941c;
import p548hg.C76165c;
import p606mm.C99933h;
import p682rz.C101480j;
import p749xh.C102645g6;
import ph0.C100792a;
import qh0.C62619a;
import sx3.C110818d0;
import z04.C119027c;

/* renamed from: mh0.f0 */
public final class C99877f0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C72963f4 f292655d;

    public C99877f0(C72963f4 f4Var) {
        this.f292655d = f4Var;
    }

    public final void run() {
        C39622i0 a;
        C39622i0 a2;
        byte[] m2;
        Class<C60247c> cls = C60247c.class;
        Class cls2 = C57594e4.class;
        C72963f4 f4Var = this.f292655d;
        if (f4Var != null) {
            ((C76165c) C86312j.m106911c(C76165c.class)).v90(f4Var);
            SelectSql q2 = C102645g6.m135569q2(f4Var.getMsgId());
            synchronized (C60247c.f171776h) {
                C86709a0.m107523b().mo121108c();
                if (cls.isAssignableFrom(cls2)) {
                    a = new C54209k0((C0123n0) C86709a0.m107523b().f251755f, (C54209k0.C54210b) new C60247c.C60248a.C60249a()).mo75002a(cls2);
                } else {
                    throw new IllegalArgumentException("getLiveDB modelClass must extends BaseMvvmDB");
                }
            }
            C102645g6 g6Var = (C102645g6) q2.singleQuery(((C57594e4) a).getDB(), C102645g6.class);
            if (!(g6Var == null || (m2 = g6Var.mo142302m2()) == null)) {
                C99889n nVar = new C99889n();
                nVar.mo141099d(new String(m2, C119027c.f356488a));
                ArrayList<C99893q> arrayList = nVar.f292694f;
                ArrayList arrayList2 = new ArrayList();
                for (C99893q D : arrayList) {
                    String D2 = D.mo55379D();
                    if (D2 != null) {
                        arrayList2.add(D2);
                    }
                }
                ((C101480j) C86312j.m106911c(C101480j.class)).tp0(f4Var.getMsgId(), C110818d0.m150953y0(arrayList2));
                long msgId = f4Var.getMsgId();
                long y2 = f4Var.mo108774y2();
                String t = f4Var.mo108768t();
                C87412m.m108593f(t, "albumMsg.talker");
                ((C99933h) C86312j.m106911c(C99933h.class)).mo84406lr(18, String.valueOf(msgId), C62619a.class, new C98941c(3, y2, t));
            }
            if (g6Var != null) {
                synchronized (C60247c.f171776h) {
                    C86709a0.m107523b().mo121108c();
                    if (cls.isAssignableFrom(cls2)) {
                        a2 = new C54209k0((C0123n0) C86709a0.m107523b().f251755f, (C54209k0.C54210b) new C60247c.C60248a.C60249a()).mo75002a(cls2);
                    } else {
                        throw new IllegalArgumentException("getLiveDB modelClass must extends BaseMvvmDB");
                    }
                }
                ISQLiteDatabase db = ((C57594e4) a2).getDB();
                StorageObserverEvent storageObserverEvent = new StorageObserverEvent(StorageEventId.getDELETE(), String.valueOf(g6Var.getPrimaryKeyValue()), "MicroMsg.SDK.BaseMsgExtraInfo");
                storageObserverEvent.setObj(g6Var);
                new DeleteExecutor(g6Var, storageObserverEvent, C102645g6.f302370B, "MicroMsg.SDK.BaseMsgExtraInfo").execute(db);
            }
            C100792a aVar = C100792a.f295260a;
            try {
                String t2 = f4Var.mo108768t();
                C87412m.m108593f(t2, "msg.talker");
                C86013q1.m106445f(aVar.mo140232c(t2, f4Var.getMsgId()).mo119971i());
            } catch (Throwable unused) {
            }
        }
    }
}
