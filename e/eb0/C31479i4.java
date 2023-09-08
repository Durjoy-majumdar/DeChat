package eb0;

import android.database.Cursor;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: eb0.i4 */
public class C31479i4 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C75586j4 f84203d;

    public C31479i4(C75586j4 j4Var) {
        this.f84203d = j4Var;
    }

    public void run() {
        long currentTimeMillis = System.currentTimeMillis();
        C75586j4 j4Var = this.f84203d;
        j4Var.getClass();
        Cursor rawQuery = j4Var.f222063d.rawQuery("SELECT count(*) FROM " + j4Var.mo105933kD(20), (String[]) null, 2);
        int i = rawQuery.moveToFirst() ? rawQuery.getInt(0) : 0;
        rawQuery.close();
        if (i > 1000) {
            this.f84203d.f222063d.execSQL("readerappnews1", String.format("DELETE FROM %s WHERE %s IN ( SELECT %s FROM %s ORDER BY %s LIMIT %d )", new Object[]{"readerappnews1", "time", "time", "readerappnews1", "time", 100}));
            Log.m105925i("MicroMsg.ReaderAppInfoStorage", "deleteOldData delete cost: %d, count: %d", Long.valueOf(System.currentTimeMillis() - currentTimeMillis), Integer.valueOf(i));
        } else {
            Log.m105925i("MicroMsg.ReaderAppInfoStorage", "deleteOldData count: %d", Integer.valueOf(i));
        }
        C75586j4.f222062f = false;
    }
}
