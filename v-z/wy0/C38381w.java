package wy0;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.wcdb.database.SQLiteDatabase;
import com.tencent.wcdb.database.SQLiteException;
import fy3.C32224a;
import gy3.C87413o;
import rx3.C13598b0;
import yy0.C102971b;

/* renamed from: wy0.w */
public final class C38381w extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ String f101267d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C38381w(String str) {
        super(0);
        this.f101267d = str;
    }

    public Object invoke() {
        C102971b e = C102506a.f301832a.mo142120e();
        String str = this.f101267d;
        SQLiteDatabase f = e.f303871d.mo125615f();
        Object[] objArr = {str};
        f.beginTransaction();
        try {
            f.execSQL("INSERT OR IGNORE INTO WxFileIndexRefresh SELECT rowId FROM WxFileIndex3 WHERE linkUUID IN (SELECT linkUUID FROM WxFileIndex3 WHERE username = ?)", objArr);
            f.execSQL("DELETE FROM WxFileIndexRefresh WHERE indexRowId IN (SELECT rowId FROM WxFileIndex3 WHERE username = ?)", objArr);
            f.execSQL("DELETE FROM WxFileIndex3 WHERE username = ?", objArr);
            f.setTransactionSuccessful();
        } catch (SQLiteException e2) {
            Log.printErrStackTrace("MicroMsg.WxFileIndexStorage", e2, "Cannot delete WxFileIndex of user: " + str, new Object[0]);
        } catch (Throwable th) {
            try {
                f.endTransaction();
            } catch (RuntimeException unused) {
            }
            throw th;
        }
        try {
            f.endTransaction();
        } catch (RuntimeException unused2) {
        }
        return C13598b0.f38549a;
    }
}
