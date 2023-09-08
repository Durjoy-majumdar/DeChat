package q41;

import android.database.Cursor;
import com.tencent.wcdb.database.SQLiteStatement;
import java.util.HashMap;

public final /* synthetic */ class f$$c implements f$$k {

    /* renamed from: a */
    public final /* synthetic */ int[] f353252a;

    /* renamed from: b */
    public final /* synthetic */ int f353253b;

    /* renamed from: c */
    public final /* synthetic */ long f353254c;

    /* renamed from: d */
    public final /* synthetic */ int f353255d;

    /* renamed from: e */
    public final /* synthetic */ int f353256e;

    /* renamed from: f */
    public final /* synthetic */ HashMap f353257f;

    public /* synthetic */ f$$c(int[] iArr, int i, long j, int i2, int i3, HashMap hashMap) {
        this.f353252a = iArr;
        this.f353253b = i;
        this.f353254c = j;
        this.f353255d = i2;
        this.f353256e = i3;
        this.f353257f = hashMap;
    }

    /* renamed from: a */
    public final boolean mo182971a(Cursor cursor, SQLiteStatement sQLiteStatement, int[] iArr) {
        int[] iArr2 = this.f353252a;
        int i = this.f353253b;
        long j = this.f353254c;
        int i2 = this.f353255d;
        int i3 = this.f353256e;
        HashMap hashMap = this.f353257f;
        iArr2[0] = iArr2[0] + 1;
        sQLiteStatement.bindLong(iArr[i], cursor.getLong(i) + j);
        long j2 = cursor.getLong(i2);
        if (j2 > 0) {
            sQLiteStatement.bindLong(iArr[i2], j2 + j);
        }
        Long l = (Long) hashMap.get(Long.valueOf(cursor.getLong(i3)));
        if (l != null) {
            sQLiteStatement.bindLong(iArr[i3], l.longValue());
        }
        return true;
    }
}
