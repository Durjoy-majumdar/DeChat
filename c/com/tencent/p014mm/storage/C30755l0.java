package com.tencent.p014mm.storage;

import android.database.Cursor;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.storage.MAutoStorage;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import java.util.Arrays;
import o40.C61926c;
import rx3.C13598b0;
import zh3.C91753f;

/* renamed from: com.tencent.mm.storage.l0 */
public final class C30755l0 extends MAutoStorage<C30753k0> {

    /* renamed from: e */
    public static final String[] f82701e = {MAutoStorage.getCreateSQLs(C30753k0.f82699t, "BizRecExposeInfo")};

    /* renamed from: f */
    public static final String[] f82702f = {"CREATE INDEX IF NOT EXISTS biz_rec_exposeTime_type_index ON BizRecExposeInfo (exposeTime,exposeType)"};

    /* renamed from: d */
    public final C91753f f82703d;

    /* renamed from: com.tencent.mm.storage.l0$a */
    public static final class C30756a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C30755l0 f82704d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C30756a(C30755l0 l0Var) {
            super(0);
            this.f82704d = l0Var;
        }

        public Object invoke() {
            C30755l0 l0Var = this.f82704d;
            l0Var.getClass();
            long currentTimeMillis = System.currentTimeMillis();
            Cursor rawQuery = l0Var.f82703d.rawQuery("SELECT count(*) FROM BizRecExposeInfo", (String[]) null);
            int i = rawQuery.moveToFirst() ? rawQuery.getInt(0) : 0;
            rawQuery.close();
            if (i > 200) {
                try {
                    String format = String.format("DELETE FROM %s WHERE %s IN ( SELECT %s FROM %s ORDER BY %s LIMIT %d )", Arrays.copyOf(new Object[]{"BizRecExposeInfo", "msgId", "msgId", "BizRecExposeInfo", "exposeTime", 50}, 6));
                    C87412m.m108593f(format, "format(format, *args)");
                    l0Var.f82703d.execSQL("BizRecExposeInfo", format);
                    Log.m105925i("MicroMsg.BizRecExposeInfoStorage", "deleteTooOldData delete cost: %d, count: %d", Long.valueOf(System.currentTimeMillis() - currentTimeMillis), Integer.valueOf(i));
                } catch (Exception e) {
                    Log.printErrStackTrace("MicroMsg.BizRecExposeInfoStorage", e, "deleteTooOldData", new Object[0]);
                }
            }
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C30755l0(C91753f fVar) {
        super(fVar, C30753k0.f82699t, "BizRecExposeInfo", f82702f);
        C87412m.m108594g(fVar, "db");
        this.f82703d = fVar;
    }

    /* renamed from: Lo */
    public final boolean mo57657Lo(C30753k0 k0Var) {
        C30753k0 k0Var2;
        C87412m.m108594g(k0Var, "info");
        StringBuilder sb = new StringBuilder();
        sb.append(k0Var.field_msgId);
        sb.append('-');
        sb.append(k0Var.field_exposeType);
        String sb4 = sb.toString();
        k0Var.field_exposeId = sb4;
        C87412m.m108593f(sb4, "info.field_exposeId");
        Cursor rawQuery = this.f82703d.rawQuery("SELECT * FROM BizRecExposeInfo WHERE exposeId = '" + sb4 + "' limit 1", (String[]) null);
        if (rawQuery.moveToFirst()) {
            k0Var2 = new C30753k0();
            k0Var2.convertFrom(rawQuery);
        } else {
            k0Var2 = null;
        }
        rawQuery.close();
        if (k0Var2 != null) {
            Log.m105924i("MicroMsg.BizRecExposeInfoStorage", "insertOrUpdate exist");
            return false;
        }
        boolean insertNotify = super.insertNotify(k0Var, false);
        Log.m105924i("MicroMsg.BizRecExposeInfoStorage", "insertOrUpdate ret=" + insertNotify + ", type=" + k0Var.field_exposeType);
        C61926c.m72656A((String) null, new C30756a(this));
        return insertNotify;
    }

    /* renamed from: jo */
    public final int mo57658jo(int i) {
        Cursor rawQuery = this.f82703d.rawQuery("SELECT count(*) FROM BizRecExposeInfo where exposeTime > " + (System.currentTimeMillis() - 86400000) + " and exposeType = " + i, (String[]) null);
        int i2 = 0;
        if (rawQuery.moveToFirst()) {
            i2 = rawQuery.getInt(0);
        }
        rawQuery.close();
        Log.m105918d("MicroMsg.BizRecExposeInfoStorage", "getTodayExposeRecCardCount count=" + i2 + ", type=" + i);
        return i2;
    }
}
