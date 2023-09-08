package wh3;

import android.database.Cursor;
import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import p749xh.C38643q4;

/* renamed from: wh3.t */
public class C38145t extends C38643q4 {

    /* renamed from: p */
    public static IAutoDBItem.MAutoDBInfo f100793p = C38643q4.initAutoDBInfo(C38145t.class);

    public C38145t(String str, byte[] bArr) {
        this.field_reqType = str;
        this.field_cache = bArr;
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f100793p;
    }

    public C38145t(Cursor cursor) {
        if (cursor != null) {
            convertFrom(cursor);
        }
    }
}
