package com.tencent.p014mm.storage;

import android.database.Cursor;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.storage.MAutoStorage;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import java.util.Arrays;
import java.util.Calendar;
import o40.C61926c;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import zh3.C91753f;

/* renamed from: com.tencent.mm.storage.q */
public final class C30766q extends MAutoStorage<C30763p> {

    /* renamed from: f */
    public static final String[] f82734f = {MAutoStorage.getCreateSQLs(C30763p.f82716r, "BizAdInfo")};

    /* renamed from: g */
    public static final String[] f82735g = {"CREATE  INDEX IF NOT EXISTS biz_exposeTime_index ON BizAdInfo ( exposeTime ) "};

    /* renamed from: d */
    public final C91753f f82736d;

    /* renamed from: e */
    public final C13601g f82737e = C36568h.m40985a(C30767a.f82738d);

    /* renamed from: com.tencent.mm.storage.q$a */
    public static final class C30767a extends C87413o implements C32224a<MultiProcessMMKV> {

        /* renamed from: d */
        public static final C30767a f82738d = new C30767a();

        public C30767a() {
            super(0);
        }

        public Object invoke() {
            return MultiProcessMMKV.getSingleMMKV("biz_timeline_ad");
        }
    }

    /* renamed from: com.tencent.mm.storage.q$b */
    public static final class C30768b extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C30766q f82739d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C30768b(C30766q qVar) {
            super(0);
            this.f82739d = qVar;
        }

        public Object invoke() {
            C30766q qVar = this.f82739d;
            qVar.getClass();
            long currentTimeMillis = System.currentTimeMillis();
            Cursor rawQuery = qVar.f82736d.rawQuery("SELECT count(*) FROM BizAdInfo", (String[]) null);
            int i = rawQuery.moveToFirst() ? rawQuery.getInt(0) : 0;
            rawQuery.close();
            if (i > 100) {
                String format = String.format("DELETE FROM %s WHERE %s IN ( SELECT %s FROM %s ORDER BY %s LIMIT %d )", Arrays.copyOf(new Object[]{"BizAdInfo", "aId", "aId", "BizAdInfo", "exposeTime", 50}, 6));
                C87412m.m108593f(format, "format(format, *args)");
                qVar.f82736d.execSQL("BizAdInfo", format);
                Log.m105925i("MicroMsg.BizAdInfoStorage", "deleteTooOldData delete cost: %d, count: %d", Long.valueOf(System.currentTimeMillis() - currentTimeMillis), Integer.valueOf(i));
            }
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C30766q(C91753f fVar) {
        super(fVar, C30763p.f82716r, "BizAdInfo", f82735g);
        C87412m.m108594g(fVar, "db");
        this.f82736d = fVar;
    }

    /* renamed from: Lo */
    public final void mo57688Lo() {
        Log.m105924i("MicroMsg.BizAdInfoStorage", "deleteTable start");
        this.f82736d.execSQL("BizAdInfo", "delete from BizAdInfo");
        Log.m105924i("MicroMsg.BizAdInfoStorage", "deleteTable end");
    }

    /* renamed from: Yt */
    public final boolean mo57689Yt(C30763p pVar) {
        C87412m.m108594g(pVar, "info");
        if (get(pVar, new String[0])) {
            Log.m105924i("MicroMsg.BizAdInfoStorage", "insertOrUpdate exist");
            return false;
        }
        boolean insertNotify = super.insertNotify(pVar, false);
        Log.m105924i("MicroMsg.BizAdInfoStorage", "insertOrUpdate ret=" + insertNotify);
        C61926c.m72656A((String) null, new C30768b(this));
        return insertNotify;
    }

    /* renamed from: jo */
    public final void mo57690jo(String str) {
        C30763p pVar = new C30763p();
        pVar.field_aId = str;
        super.delete(pVar, false, "aId");
    }

    /* renamed from: qq */
    public final long mo57691qq() {
        Calendar instance = Calendar.getInstance();
        C87412m.m108593f(instance, "getInstance()");
        instance.setTimeInMillis(System.currentTimeMillis());
        instance.set(11, 0);
        instance.set(13, 0);
        instance.set(12, 0);
        instance.set(14, 0);
        return instance.getTimeInMillis();
    }
}
