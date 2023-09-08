package bd1;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.database.CharArrayBuffer;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.net.Uri;
import android.os.Bundle;
import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import gy3.C87412m;
import java.util.List;
import rx3.C48096k;

/* renamed from: bd1.j */
public final class C54450j implements Cursor {

    /* renamed from: d */
    public final ContentValues f152704d;

    /* renamed from: e */
    public final List<String> f152705e;

    public C54450j(ContentValues contentValues, IAutoDBItem.MAutoDBInfo mAutoDBInfo, List<String> list) {
        C87412m.m108594g(contentValues, "cv");
        C87412m.m108594g(mAutoDBInfo, "info");
        C87412m.m108594g(list, "coverFields");
        this.f152704d = contentValues;
        this.f152705e = list;
    }

    public void close() {
        throw new C48096k("An operation is not implemented: Not yet implemented");
    }

    public void copyStringToBuffer(int i, CharArrayBuffer charArrayBuffer) {
        throw new C48096k("An operation is not implemented: Not yet implemented");
    }

    public void deactivate() {
        throw new C48096k("An operation is not implemented: Not yet implemented");
    }

    public byte[] getBlob(int i) {
        return this.f152704d.getAsByteArray(this.f152705e.get(i));
    }

    public int getColumnCount() {
        return this.f152705e.size();
    }

    public int getColumnIndex(String str) {
        throw new C48096k("An operation is not implemented: Not yet implemented");
    }

    public int getColumnIndexOrThrow(String str) {
        throw new C48096k("An operation is not implemented: Not yet implemented");
    }

    public String getColumnName(int i) {
        throw new C48096k("An operation is not implemented: Not yet implemented");
    }

    public String[] getColumnNames() {
        Object[] array = this.f152705e.toArray(new String[0]);
        C87412m.m108592e(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        return (String[]) array;
    }

    public int getCount() {
        throw new C48096k("An operation is not implemented: Not yet implemented");
    }

    public double getDouble(int i) {
        Double asDouble = this.f152704d.getAsDouble(this.f152705e.get(i));
        if (asDouble == null) {
            return 0.0d;
        }
        return asDouble.doubleValue();
    }

    public Bundle getExtras() {
        throw new C48096k("An operation is not implemented: Not yet implemented");
    }

    public float getFloat(int i) {
        Float asFloat = this.f152704d.getAsFloat(this.f152705e.get(i));
        if (asFloat == null) {
            return 0.0f;
        }
        return asFloat.floatValue();
    }

    public int getInt(int i) {
        Integer asInteger = this.f152704d.getAsInteger(this.f152705e.get(i));
        if (asInteger == null) {
            return 0;
        }
        return asInteger.intValue();
    }

    public long getLong(int i) {
        Long asLong = this.f152704d.getAsLong(this.f152705e.get(i));
        if (asLong == null) {
            return 0;
        }
        return asLong.longValue();
    }

    public Uri getNotificationUri() {
        throw new C48096k("An operation is not implemented: Not yet implemented");
    }

    public int getPosition() {
        throw new C48096k("An operation is not implemented: Not yet implemented");
    }

    public short getShort(int i) {
        Short asShort = this.f152704d.getAsShort(this.f152705e.get(i));
        if (asShort == null) {
            return 0;
        }
        return asShort.shortValue();
    }

    public String getString(int i) {
        return this.f152704d.getAsString(this.f152705e.get(i));
    }

    public int getType(int i) {
        throw new C48096k("An operation is not implemented: Not yet implemented");
    }

    public boolean getWantsAllOnMoveCalls() {
        throw new C48096k("An operation is not implemented: Not yet implemented");
    }

    public boolean isAfterLast() {
        throw new C48096k("An operation is not implemented: Not yet implemented");
    }

    public boolean isBeforeFirst() {
        throw new C48096k("An operation is not implemented: Not yet implemented");
    }

    public boolean isClosed() {
        throw new C48096k("An operation is not implemented: Not yet implemented");
    }

    public boolean isFirst() {
        throw new C48096k("An operation is not implemented: Not yet implemented");
    }

    public boolean isLast() {
        throw new C48096k("An operation is not implemented: Not yet implemented");
    }

    public boolean isNull(int i) {
        throw new C48096k("An operation is not implemented: Not yet implemented");
    }

    public boolean move(int i) {
        throw new C48096k("An operation is not implemented: Not yet implemented");
    }

    public boolean moveToFirst() {
        throw new C48096k("An operation is not implemented: Not yet implemented");
    }

    public boolean moveToLast() {
        throw new C48096k("An operation is not implemented: Not yet implemented");
    }

    public boolean moveToNext() {
        throw new C48096k("An operation is not implemented: Not yet implemented");
    }

    public boolean moveToPosition(int i) {
        throw new C48096k("An operation is not implemented: Not yet implemented");
    }

    public boolean moveToPrevious() {
        throw new C48096k("An operation is not implemented: Not yet implemented");
    }

    public void registerContentObserver(ContentObserver contentObserver) {
        throw new C48096k("An operation is not implemented: Not yet implemented");
    }

    public void registerDataSetObserver(DataSetObserver dataSetObserver) {
        throw new C48096k("An operation is not implemented: Not yet implemented");
    }

    public boolean requery() {
        throw new C48096k("An operation is not implemented: Not yet implemented");
    }

    public Bundle respond(Bundle bundle) {
        throw new C48096k("An operation is not implemented: Not yet implemented");
    }

    public void setExtras(Bundle bundle) {
        throw new C48096k("An operation is not implemented: Not yet implemented");
    }

    public void setNotificationUri(ContentResolver contentResolver, Uri uri) {
        throw new C48096k("An operation is not implemented: Not yet implemented");
    }

    public void unregisterContentObserver(ContentObserver contentObserver) {
        throw new C48096k("An operation is not implemented: Not yet implemented");
    }

    public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
        throw new C48096k("An operation is not implemented: Not yet implemented");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ C54450j(android.content.ContentValues r1, com.tencent.p014mm.sdk.storage.IAutoDBItem.MAutoDBInfo r2, java.util.List r3, int r4, gy3.C8480h r5) {
        /*
            r0 = this;
            r4 = r4 & 4
            if (r4 == 0) goto L_0x000f
            java.lang.String[] r3 = r2.columns
            java.lang.String r4 = "info.columns"
            gy3.C87412m.m108593f(r3, r4)
            java.util.List r3 = sx3.C110823p.m151001a0(r3)
        L_0x000f:
            r0.<init>(r1, r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: bd1.C54450j.<init>(android.content.ContentValues, com.tencent.mm.sdk.storage.IAutoDBItem$MAutoDBInfo, java.util.List, int, gy3.h):void");
    }
}
