package q41;

import android.database.Cursor;
import com.tencent.wcdb.DatabaseUtils;
import com.tencent.wcdb.database.SQLiteStatement;

public final /* synthetic */ class f$$b implements f$$k {

    /* renamed from: a */
    public final /* synthetic */ C118169f f353246a;

    /* renamed from: b */
    public final /* synthetic */ int[] f353247b;

    /* renamed from: c */
    public final /* synthetic */ int f353248c;

    /* renamed from: d */
    public final /* synthetic */ String[] f353249d;

    /* renamed from: e */
    public final /* synthetic */ int f353250e;

    /* renamed from: f */
    public final /* synthetic */ int f353251f;

    public /* synthetic */ f$$b(C118169f fVar, int[] iArr, int i, String[] strArr, int i2, int i3) {
        this.f353246a = fVar;
        this.f353247b = iArr;
        this.f353248c = i;
        this.f353249d = strArr;
        this.f353250e = i2;
        this.f353251f = i3;
    }

    /* renamed from: a */
    public final boolean mo182971a(Cursor cursor, SQLiteStatement sQLiteStatement, int[] iArr) {
        C118169f fVar = this.f353246a;
        int[] iArr2 = this.f353247b;
        int i = this.f353248c;
        String[] strArr = this.f353249d;
        int i2 = this.f353250e;
        int i3 = this.f353251f;
        fVar.getClass();
        iArr2[0] = iArr2[0] + 1;
        if (cursor.getType(i) != 1) {
            return false;
        }
        strArr[0] = cursor.getString(i2);
        sQLiteStatement.bindLong(iArr[i3], DatabaseUtils.longForQuery(fVar.f353216a, "SELECT count(*) FROM message WHERE talker=?", strArr));
        return true;
    }
}
