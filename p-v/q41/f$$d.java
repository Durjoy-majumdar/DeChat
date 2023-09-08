package q41;

import android.database.Cursor;
import com.tencent.wcdb.database.SQLiteStatement;
import java.util.HashMap;

public final /* synthetic */ class f$$d implements f$$k {

    /* renamed from: a */
    public final /* synthetic */ int[] f353258a;

    /* renamed from: b */
    public final /* synthetic */ int f353259b;

    /* renamed from: c */
    public final /* synthetic */ HashMap f353260c;

    public /* synthetic */ f$$d(int[] iArr, int i, HashMap hashMap) {
        this.f353258a = iArr;
        this.f353259b = i;
        this.f353260c = hashMap;
    }

    /* renamed from: a */
    public final boolean mo182971a(Cursor cursor, SQLiteStatement sQLiteStatement, int[] iArr) {
        int[] iArr2 = this.f353258a;
        int i = this.f353259b;
        HashMap hashMap = this.f353260c;
        iArr2[0] = iArr2[0] + 1;
        Long l = (Long) hashMap.get(Long.valueOf(cursor.getLong(i)));
        if (l != null) {
            sQLiteStatement.bindLong(iArr[i], l.longValue());
        }
        return true;
    }
}
