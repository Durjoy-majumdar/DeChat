package q41;

import android.database.Cursor;
import com.tencent.tav.coremedia.TimeUtil;
import com.tencent.wcdb.database.SQLiteStatement;
import java.util.HashMap;

public final /* synthetic */ class f$$a implements f$$k {

    /* renamed from: a */
    public final /* synthetic */ int[] f353242a;

    /* renamed from: b */
    public final /* synthetic */ int f353243b;

    /* renamed from: c */
    public final /* synthetic */ long[] f353244c;

    /* renamed from: d */
    public final /* synthetic */ HashMap f353245d;

    public /* synthetic */ f$$a(int[] iArr, int i, long[] jArr, HashMap hashMap) {
        this.f353242a = iArr;
        this.f353243b = i;
        this.f353244c = jArr;
        this.f353245d = hashMap;
    }

    /* renamed from: a */
    public final boolean mo182971a(Cursor cursor, SQLiteStatement sQLiteStatement, int[] iArr) {
        int[] iArr2 = this.f353242a;
        int i = this.f353243b;
        long[] jArr = this.f353244c;
        HashMap hashMap = this.f353245d;
        iArr2[0] = iArr2[0] + 1;
        Cursor cursor2 = cursor;
        long j = cursor.getLong(i);
        long j2 = jArr[0];
        jArr[0] = 1 + j2;
        hashMap.put(Long.valueOf(j), Long.valueOf(j2));
        sQLiteStatement.bindLong(iArr[i], j2);
        long j3 = jArr[0];
        if (j3 > TimeUtil.SECOND_TO_US && j3 <= 10000000) {
            jArr[0] = 10000001;
        }
        return true;
    }
}
