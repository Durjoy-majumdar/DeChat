package vk3;

import android.database.Cursor;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import com.tencent.p014mm.storage.C72986n2;
import eb0.C97625j3;
import f40.C86709a0;
import f62.C75700k0;
import g62.C75875l;
import hk3.C76227e;
import java.util.List;

/* renamed from: vk3.i */
public class C37747i implements C78430l<C72963f4> {

    /* renamed from: a */
    public String f99977a;

    /* renamed from: b */
    public long f99978b;

    /* renamed from: c */
    public long f99979c;

    /* renamed from: d */
    public Cursor f99980d;

    public C37747i(String str, long j, long j2) {
        this.f99977a = str;
        this.f99978b = j;
        this.f99979c = j2;
    }

    public void close() {
        this.f99980d.close();
    }

    /* renamed from: p */
    public int mo61317p() {
        return ((C72972g4) C97625j3.m125812b().mo105911z()).Vx0(this.f99977a);
    }

    /* renamed from: q */
    public void mo61318q(List<C72963f4> list) {
        try {
            this.f99980d.moveToFirst();
            while (!this.f99980d.isAfterLast()) {
                C72963f4 f4Var = new C72963f4();
                f4Var.convertFrom(this.f99980d);
                list.add(f4Var);
                this.f99980d.moveToNext();
            }
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.ChattingLoader.ChattingSearchDataSource", e, "", new Object[0]);
        }
    }

    /* renamed from: r */
    public void mo61319r(C76227e.C32942b bVar) {
        long jo = ((C72986n2) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96093DX()).mo101184jo(this.f99977a);
        C75875l z = C97625j3.m125812b().mo105911z();
        String str = this.f99977a;
        long max = Math.max(jo, this.f99978b);
        long j = this.f99979c;
        C72972g4 g4Var = (C72972g4) z;
        g4Var.getClass();
        if (j < max) {
            long j2 = max;
            max = j;
            j = j2;
        }
        String str2 = "SELECT * FROM " + g4Var.hy0(str) + " WHERE" + g4Var.iy0(str) + "AND " + "createTime" + " >= " + max + " AND " + "createTime" + " <= " + j + " ORDER BY " + "createTime" + " ASC ";
        Log.m105918d("MicroMsg.MsgInfoStorage", "get cursor: " + str2);
        Cursor rawQuery = g4Var.f212775p.rawQuery(str2, (String[]) null);
        this.f99980d = rawQuery;
        rawQuery.moveToFirst();
        bVar.next();
    }

    /* renamed from: s */
    public long mo61320s() {
        return 0;
    }
}
