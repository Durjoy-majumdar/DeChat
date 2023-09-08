package tr0;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import com.tencent.p014mm.sdk.storage.MAutoDBFieldAnnotation;
import com.tencent.p014mm.sdk.storage.MAutoStorage;

/* renamed from: tr0.a */
public final class C90575a extends MAutoStorage<C90576a> {

    /* renamed from: d */
    public static final String[] f260233d = {MAutoStorage.getCreateSQLs(C90576a.f260234d, "AppBrandCommonKVBinaryData")};

    /* renamed from: tr0.a$a */
    public static final class C90576a extends IAutoDBItem {

        /* renamed from: d */
        public static final IAutoDBItem.MAutoDBInfo f260234d = IAutoDBItem.initAutoDBInfo(C90576a.class);
        @MAutoDBFieldAnnotation(defValue = "$$invalid", primaryKey = 1)
        public String field_key;
        public byte[] field_value;

        public void convertFrom(Cursor cursor) {
            this.field_key = cursor.getString(0);
            this.field_value = cursor.getBlob(1);
        }

        public ContentValues convertTo() {
            ContentValues contentValues = new ContentValues(2);
            contentValues.put("key", this.field_key);
            contentValues.put("value", this.field_value);
            return contentValues;
        }

        public IAutoDBItem.MAutoDBInfo getDBInfo() {
            return f260234d;
        }
    }

    public C90575a(ISQLiteDatabase iSQLiteDatabase) {
        super(iSQLiteDatabase, C90576a.f260234d, "AppBrandCommonKVBinaryData", (String[]) null);
    }

    /* renamed from: Lo */
    public void mo124710Lo(String str, byte[] bArr) {
        if (!Util.isNullOrNil(str)) {
            C90576a aVar = new C90576a();
            aVar.field_key = str;
            aVar.field_value = bArr;
            super.replace(aVar);
        }
    }

    /* renamed from: V3 */
    public void mo124711V3(String str) {
        C90576a aVar = new C90576a();
        aVar.field_key = str;
        aVar.field_value = new byte[0];
        super.replace(aVar);
    }

    /* renamed from: jo */
    public byte[] mo124712jo(String str) {
        if (Util.isNullOrNil(str)) {
            return null;
        }
        C90576a aVar = new C90576a();
        aVar.field_key = str;
        if (super.get(aVar, new String[0])) {
            return aVar.field_value;
        }
        return null;
    }
}
