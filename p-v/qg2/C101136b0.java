package qg2;

import android.database.Cursor;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import com.tencent.p014mm.sdk.storage.MAutoStorage;
import f40.C86709a0;
import java.util.Iterator;
import java.util.Vector;
import og2.C100339h;
import og2.C100340i;
import og2.C100343m;
import og2.C100344n;
import p261wl.C38166b;
import p261wl.C38174i;

/* renamed from: qg2.b0 */
public class C101136b0 extends MAutoStorage<C100344n> implements C100340i {

    /* renamed from: d */
    public ISQLiteDatabase f296032d;

    /* renamed from: e */
    public final Vector<C100339h> f296033e = new Vector<>();

    /* renamed from: qg2.b0$a */
    public class C101137a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C100339h f296034d;

        public C101137a(C100339h hVar) {
            this.f296034d = hVar;
        }

        public void run() {
            if (!C101136b0.this.f296033e.contains(this.f296034d)) {
                C101136b0.this.f296033e.add(this.f296034d);
            }
        }
    }

    /* renamed from: qg2.b0$b */
    public class C101138b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C100339h f296036d;

        public C101138b(C100339h hVar) {
            this.f296036d = hVar;
        }

        public void run() {
            C101136b0.this.f296033e.remove(this.f296036d);
        }
    }

    /* renamed from: qg2.b0$c */
    public class C101139c implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ int f296038d;

        /* renamed from: e */
        public final /* synthetic */ C100344n f296039e;

        public C101139c(int i, C100344n nVar) {
            this.f296038d = i;
            this.f296039e = nVar;
        }

        public void run() {
            Iterator<C100339h> it = C101136b0.this.f296033e.iterator();
            while (it.hasNext()) {
                it.next().mo128649i1(this.f296038d, this.f296039e);
            }
            C38166b.C38167a aVar = (C38166b.C38167a) C38166b.m41759f(C100343m.class);
            C38166b.C38167a.C38169b bVar = new C38166b.C38167a.C38169b(aVar, aVar.f100837d.all().iterator());
            while (bVar.hasNext()) {
                ((C100343m) ((C38174i) bVar.next()).get()).mo139619i1(this.f296038d, this.f296039e);
            }
        }
    }

    public C101136b0(ISQLiteDatabase iSQLiteDatabase) {
        super(iSQLiteDatabase, C100344n.f293919W, "RecordCDNInfo", (String[]) null);
        this.f296032d = iSQLiteDatabase;
    }

    /* renamed from: Lo */
    public boolean delete(C100344n nVar, String... strArr) {
        if (!super.delete(nVar, strArr)) {
            return false;
        }
        mo140579Ow(0, nVar);
        return true;
    }

    /* renamed from: Ow */
    public final void mo140579Ow(int i, C100344n nVar) {
        C86709a0.m107525e().postToWorker(new C101139c(i, nVar));
    }

    /* renamed from: SE */
    public boolean update(C100344n nVar, String... strArr) {
        if (!super.update(nVar, strArr)) {
            return false;
        }
        mo140579Ow(1, nVar);
        return true;
    }

    /* renamed from: Yt */
    public boolean insert(C100344n nVar) {
        if (nVar != null) {
            Log.m105927v("MicroMsg.RecordMsgCDNStorage", "insert record cdn info %s", nVar);
            if (!super.insert(nVar)) {
                return false;
            }
            mo140579Ow(2, nVar);
            return true;
        }
        Log.m105920e("MicroMsg.RecordMsgCDNStorage", "insert null record cdn info");
        return false;
    }

    /* renamed from: bD */
    public void mo140582bD(C100339h hVar) {
        C86709a0.m107525e().postToWorker(new C101138b(hVar));
    }

    /* renamed from: jo */
    public void mo140583jo(C100339h hVar) {
        C86709a0.m107525e().postToWorker(new C101137a(hVar));
    }

    /* renamed from: kD */
    public boolean replace(C100344n nVar) {
        if (!super.replace(nVar)) {
            return false;
        }
        mo140579Ow(1, nVar);
        return true;
    }

    /* renamed from: qq */
    public C100344n mo140585qq(String str) {
        C100344n nVar = null;
        Cursor rawQuery = this.f296032d.rawQuery("SELECT * FROM RecordCDNInfo WHERE mediaId='" + str + "'", (String[]) null, 2);
        if (rawQuery != null && rawQuery.moveToFirst()) {
            nVar = new C100344n();
            nVar.convertFrom(rawQuery);
        }
        if (rawQuery != null) {
            rawQuery.close();
        }
        return nVar;
    }

    public boolean update(long j, IAutoDBItem iAutoDBItem) {
        C100344n nVar = (C100344n) iAutoDBItem;
        if (!super.update(j, nVar)) {
            return false;
        }
        mo140579Ow(1, nVar);
        return true;
    }
}
