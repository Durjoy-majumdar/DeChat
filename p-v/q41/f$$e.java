package q41;

import android.database.Cursor;
import com.tencent.wcdb.database.SQLiteStatement;
import java.util.HashMap;

public final /* synthetic */ class f$$e implements f$$k {

    /* renamed from: a */
    public final /* synthetic */ int[] f353261a;

    /* renamed from: b */
    public final /* synthetic */ int f353262b;

    /* renamed from: c */
    public final /* synthetic */ HashMap f353263c;

    public /* synthetic */ f$$e(int[] iArr, int i, HashMap hashMap) {
        this.f353261a = iArr;
        this.f353262b = i;
        this.f353263c = hashMap;
    }

    /* renamed from: a */
    public final boolean mo182971a(Cursor cursor, SQLiteStatement sQLiteStatement, int[] iArr) {
        int[] iArr2 = this.f353261a;
        int i = this.f353262b;
        HashMap hashMap = this.f353263c;
        iArr2[0] = iArr2[0] + 1;
        Long l = (Long) hashMap.get(Long.valueOf(cursor.getLong(i)));
        if (l != null) {
            sQLiteStatement.bindLong(iArr[i], l.longValue());
        }
        return true;
    }
}
