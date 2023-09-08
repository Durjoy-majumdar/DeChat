package vk3;

import android.database.Cursor;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72954a0;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72986n2;
import eb0.C97625j3;
import f40.C86709a0;
import f62.C75700k0;
import hk3.C76227e;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* renamed from: vk3.a */
public class C78422a implements C78430l<C72963f4> {

    /* renamed from: a */
    public Cursor f229771a;

    /* renamed from: b */
    public String f229772b;

    /* renamed from: c */
    public long f229773c;

    /* renamed from: d */
    public int f229774d;

    /* renamed from: e */
    public int f229775e;

    /* renamed from: vk3.a$a */
    public class C78423a implements Comparator<C72963f4> {
        public C78423a(C78422a aVar) {
        }

        public int compare(Object obj, Object obj2) {
            C72963f4 f4Var = (C72963f4) obj;
            C72963f4 f4Var2 = (C72963f4) obj2;
            if (f4Var.getCreateTime() > f4Var2.getCreateTime()) {
                return 1;
            }
            return f4Var.getCreateTime() < f4Var2.getCreateTime() ? -1 : 0;
        }
    }

    public C78422a(String str, long j, int i, int i2) {
        this.f229772b = str;
        this.f229773c = j;
        this.f229775e = i2;
        this.f229774d = i;
    }

    public void close() {
        this.f229771a.close();
    }

    /* renamed from: p */
    public int mo61317p() {
        return this.f229775e;
    }

    /* renamed from: q */
    public void mo61318q(List<C72963f4> list) {
        this.f229771a.moveToFirst();
        while (!this.f229771a.isAfterLast()) {
            C72963f4 f4Var = new C72963f4();
            f4Var.convertFrom(this.f229771a);
            list.add(f4Var);
            Log.m105925i("MicroMsg.ChattingLoader.ChattingBizDataSource", "ChattingBizDataSource fillItem: %s %s %s %s", f4Var.mo108768t(), f4Var.f230724G, Integer.valueOf(f4Var.mo108769t2()), Integer.valueOf(f4Var.getType()));
            this.f229771a.moveToNext();
        }
        Collections.sort(list, new C78423a(this));
    }

    /* renamed from: r */
    public void mo61319r(C76227e.C32942b bVar) {
        Log.m105925i("MicroMsg.ChattingLoader.ChattingBizDataSource", "[ChattingBizDataSource] talker:%s bizChatId:%s,count:%s totalCount:%s createTime:%s", this.f229772b, Long.valueOf(this.f229773c), Integer.valueOf(this.f229774d), Integer.valueOf(this.f229775e), Long.valueOf(((C72986n2) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96093DX()).mo101184jo(this.f229772b)));
        C72954a0 l = C97625j3.m125812b().mo105897l();
        String str = this.f229772b;
        long j = this.f229773c;
        int i = this.f229774d;
        l.getClass();
        String str2 = "SELECT * FROM " + l.mo100941e(str) + " WHERE " + l.mo100928l(str, j) + " ORDER BY " + "createTime" + " DESC LIMIT " + i;
        Log.m105925i("MicroMsg.BizChatMessageStorage", "getBizInitCursor talker:%s, bizChatId:%s, limitCount:%s, sql:[%s]", str, Long.valueOf(j), Integer.valueOf(i), str2);
        Cursor rawQuery = l.mo100940c().rawQuery(str2, (String[]) null);
        this.f229771a = rawQuery;
        rawQuery.moveToFirst();
        bVar.next();
    }

    /* renamed from: s */
    public long mo61320s() {
        return 0;
    }
}
