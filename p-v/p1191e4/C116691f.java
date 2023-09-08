package p1191e4;

import android.database.sqlite.SQLiteStatement;
import p1188d4.C116569f;

/* renamed from: e4.f */
public class C116691f extends C116690e implements C116569f {

    /* renamed from: e */
    public final SQLiteStatement f349956e;

    public C116691f(SQLiteStatement sQLiteStatement) {
        super(sQLiteStatement);
        this.f349956e = sQLiteStatement;
    }

    /* renamed from: a */
    public int mo180702a() {
        return this.f349956e.executeUpdateDelete();
    }
}
