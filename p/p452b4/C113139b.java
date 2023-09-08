package p452b4;

import android.database.Cursor;

/* renamed from: b4.b */
public class C113139b {
    /* renamed from: a */
    public static int m154796a(Cursor cursor, String str) {
        int columnIndex = cursor.getColumnIndex(str);
        if (columnIndex >= 0) {
            return columnIndex;
        }
        return cursor.getColumnIndexOrThrow("`" + str + "`");
    }
}
