package com.tencent.p014mm.storage;

import android.database.Cursor;
import com.tencent.p014mm.sdk.storage.MAutoStorage;
import com.tencent.p014mm.sdk.storage.MStorageEvent;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import p227rn.C48056z;
import p261wl.C15510f;
import p261wl.C38166b;
import p261wl.C38174i;
import zh3.C91753f;
import zt3.C119157j;

/* renamed from: com.tencent.mm.storage.d1 */
public class C19607d1 extends MAutoStorage<C19623o0> implements C48056z {

    /* renamed from: i */
    public static final String[] f55475i = {MAutoStorage.getCreateSQLs(C19623o0.f55516y1, "BizTimeLineSingleMsgInfo")};

    /* renamed from: j */
    public static final String[] f55476j = {"CREATE  INDEX IF NOT EXISTS msg_svr_id_index ON BizTimeLineSingleMsgInfo ( msgSvrId ) ", "CREATE  INDEX IF NOT EXISTS talker_index ON BizTimeLineSingleMsgInfo ( talker ) ", "CREATE  INDEX IF NOT EXISTS  create_time_index ON BizTimeLineSingleMsgInfo ( createTime ) ", "CREATE  INDEX IF NOT EXISTS  status_talker_index ON BizTimeLineSingleMsgInfo ( status,talker ) ", "CREATE  INDEX IF NOT EXISTS  status_talker_id_index ON BizTimeLineSingleMsgInfo ( status,talkerId ) ", "CREATE  INDEX IF NOT EXISTS  status_create_time_index ON BizTimeLineSingleMsgInfo ( status,createTime ) ", "CREATE  INDEX IF NOT EXISTS  type_order_flag_index ON BizTimeLineSingleMsgInfo ( type,orderFlag ) "};

    /* renamed from: d */
    public final C91753f f55477d;

    /* renamed from: e */
    public final MStorageEvent<p0$$h, p0$$f> f55478e = new C19608a();

    /* renamed from: f */
    public int f55479f = 100;

    /* renamed from: g */
    public boolean f55480g = false;

    /* renamed from: h */
    public AtomicLong f55481h = new AtomicLong(-50000000);

    /* renamed from: com.tencent.mm.storage.d1$a */
    public class C19608a extends MStorageEvent<p0$$h, p0$$f> {
        public C19608a() {
        }

        public boolean needNotifyExtension() {
            return true;
        }

        public void processEvent(Object obj, Object obj2) {
            ((p0$$h) obj).mo21358p(C19607d1.this, (p0$$f) obj2);
        }

        public void processEventForExtensionOnDemand(Object obj) {
            p0$$f p0__f = (p0$$f) obj;
            C38166b.C38167a aVar = (C38166b.C38167a) C38166b.m41759f(C19609b.class);
            C38166b.C38167a.C38169b bVar = new C38166b.C38167a.C38169b(aVar, aVar.f100837d.all().iterator());
            while (bVar.hasNext()) {
                ((C19609b) ((C38174i) bVar.next()).get()).mo25747p(C19607d1.this, p0__f);
            }
        }
    }

    /* renamed from: com.tencent.mm.storage.d1$b */
    public interface C19609b extends C15510f {
        /* renamed from: p */
        void mo25747p(Object obj, p0$$f p0__f);
    }

    public C19607d1(C91753f fVar) {
        super(fVar, C19623o0.f55516y1, "BizTimeLineSingleMsgInfo", f55476j);
        this.f55477d = fVar;
    }

    /* renamed from: Lo */
    public void mo25732Lo(long j) {
        C19623o0 o0Var = new C19623o0();
        o0Var.field_msgId = j;
        super.delete(o0Var, false, "msgId");
        p0$$f p0__f = new p0$$f();
        p0__f.f55562a = p0$$g.DELETE;
        mo25739jo(p0__f);
    }

    /* renamed from: Ow */
    public C19623o0 mo25733Ow(long j) {
        return mo25737bD(j, "msgId");
    }

    /* renamed from: SE */
    public int mo25734SE() {
        Cursor rawQuery = this.f55477d.rawQuery("SELECT count(*) FROM BizTimeLineSingleMsgInfo where status != 4", (String[]) null);
        int i = 0;
        if (rawQuery.moveToFirst()) {
            i = rawQuery.getInt(0);
        }
        rawQuery.close();
        return i;
    }

    /* renamed from: TE */
    public int mo25735TE(long j) {
        Cursor rawQuery = this.f55477d.rawQuery("SELECT count(*) FROM BizTimeLineSingleMsgInfo where status != 4 and talkerId = " + j + " ", (String[]) null);
        int i = 0;
        if (rawQuery.moveToFirst()) {
            i = rawQuery.getInt(0);
        }
        rawQuery.close();
        return i;
    }

    /* renamed from: Yt */
    public final List<C19623o0> mo25736Yt(Cursor cursor) {
        LinkedList linkedList = new LinkedList();
        while (cursor.moveToNext()) {
            C19623o0 o0Var = new C19623o0();
            o0Var.convertFrom(cursor);
            linkedList.add(o0Var);
        }
        cursor.close();
        return linkedList;
    }

    /* renamed from: bD */
    public C19623o0 mo25737bD(long j, String str) {
        C19623o0 o0Var = new C19623o0();
        Cursor query = this.f55477d.query("BizTimeLineSingleMsgInfo", (String[]) null, str + "=?", new String[]{"" + j}, (String) null, (String) null, (String) null, 2);
        if (query.moveToFirst()) {
            o0Var.convertFrom(query);
            query.close();
            return o0Var;
        }
        query.close();
        return null;
    }

    /* renamed from: bF */
    public synchronized long mo25738bF() {
        if (this.f55481h.longValue() == -50000000) {
            C19623o0 o0Var = null;
            Cursor rawQuery = this.f55477d.rawQuery("SELECT * FROM BizTimeLineSingleMsgInfo where type=10100 or type=318767153 order by createTime DESC limit 1", (String[]) null);
            if (rawQuery.moveToFirst()) {
                o0Var = new C19623o0();
                o0Var.convertFrom(rawQuery);
            }
            rawQuery.close();
            if (o0Var != null) {
                this.f55481h.set(o0Var.field_msgId);
            }
        }
        return this.f55481h.incrementAndGet();
    }

    /* renamed from: jo */
    public void mo25739jo(p0$$f p0__f) {
        if (this.f55478e.event(p0__f)) {
            this.f55478e.doNotify();
        }
    }

    /* renamed from: kD */
    public C19623o0 mo25740kD() {
        C19623o0 o0Var = null;
        Cursor rawQuery = this.f55477d.rawQuery("SELECT * FROM BizTimeLineSingleMsgInfo where status != 4 order by createTime DESC limit 1", (String[]) null);
        if (rawQuery.moveToFirst()) {
            o0Var = new C19623o0();
            o0Var.convertFrom(rawQuery);
        }
        rawQuery.close();
        return o0Var;
    }

    /* renamed from: mI */
    public boolean insert(C19623o0 o0Var) {
        boolean insertNotify = super.insertNotify(o0Var, false);
        p0$$f p0__f = new p0$$f();
        p0__f.f55564c = o0Var.field_talker;
        p0__f.f55563b = o0Var;
        p0__f.f55562a = p0$$g.INSERT;
        mo25739jo(p0__f);
        if (!this.f55480g) {
            this.f55480g = true;
            ((C119157j) C119157j.f356862d).mo183879j(new C44656f1(this), 1000, "BizTimeLineInfoStorageThread");
        }
        return insertNotify;
    }

    /* renamed from: mL */
    public boolean mo25742mL(C19623o0 o0Var) {
        boolean updateNotify = super.updateNotify(o0Var, false, "msgSvrId");
        p0$$f p0__f = new p0$$f();
        p0__f.f55564c = o0Var.field_talker;
        p0__f.f55563b = o0Var;
        p0__f.f55562a = p0$$g.UPDATE;
        mo25739jo(p0__f);
        return updateNotify;
    }

    /* renamed from: qq */
    public boolean mo25743qq(String str) {
        C19623o0 o0Var = new C19623o0();
        o0Var.field_talker = str;
        boolean delete = super.delete(o0Var, false, "talker");
        p0$$f p0__f = new p0$$f();
        p0__f.f55564c = o0Var.field_talker;
        p0__f.f55563b = o0Var;
        p0__f.f55562a = p0$$g.DELETE;
        mo25739jo(p0__f);
        return delete;
    }
}
