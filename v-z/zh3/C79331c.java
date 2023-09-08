package zh3;

import ai3.C112789a;
import ai3.C112793f;
import ai3.C67047d;
import android.content.ContentResolver;
import android.database.CharArrayBuffer;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.net.Uri;
import android.os.Bundle;
import android.util.SparseArray;
import java.util.HashMap;

/* renamed from: zh3.c */
public final class C79331c implements Cursor, C67047d {

    /* renamed from: d */
    public static Cursor f232899d;

    /* renamed from: a */
    public static Cursor m96022a() {
        if (f232899d == null) {
            f232899d = new C79331c();
        }
        return f232899d;
    }

    /* renamed from: B0 */
    public HashMap mo91032B0() {
        return null;
    }

    /* renamed from: K0 */
    public void mo91033K0(int i) {
    }

    /* renamed from: N */
    public boolean mo91034N(Object obj) {
        return false;
    }

    /* renamed from: R */
    public boolean mo91035R(Object obj, C112789a aVar) {
        return false;
    }

    /* renamed from: X */
    public boolean mo91036X(int i) {
        return false;
    }

    public void close() {
    }

    public void copyStringToBuffer(int i, CharArrayBuffer charArrayBuffer) {
    }

    /* renamed from: d0 */
    public SparseArray[] mo91037d0() {
        return null;
    }

    public void deactivate() {
    }

    public byte[] getBlob(int i) {
        return null;
    }

    public int getColumnCount() {
        return 0;
    }

    public int getColumnIndex(String str) {
        return 0;
    }

    public int getColumnIndexOrThrow(String str) {
        return 0;
    }

    public String getColumnName(int i) {
        return null;
    }

    public String[] getColumnNames() {
        return null;
    }

    public int getCount() {
        return 0;
    }

    public double getDouble(int i) {
        return 0.0d;
    }

    public Bundle getExtras() {
        return null;
    }

    public float getFloat(int i) {
        return 0.0f;
    }

    public int getInt(int i) {
        return 0;
    }

    public C112789a getItem(int i) {
        return null;
    }

    public long getLong(int i) {
        return 0;
    }

    public Uri getNotificationUri() {
        return null;
    }

    public int getPosition() {
        return 0;
    }

    public short getShort(int i) {
        return 0;
    }

    public String getString(int i) {
        return null;
    }

    public int getType(int i) {
        return 0;
    }

    public boolean getWantsAllOnMoveCalls() {
        return false;
    }

    public boolean isAfterLast() {
        return true;
    }

    public boolean isBeforeFirst() {
        return false;
    }

    public boolean isClosed() {
        return false;
    }

    public boolean isFirst() {
        return false;
    }

    public boolean isLast() {
        return false;
    }

    public boolean isNull(int i) {
        return false;
    }

    public boolean move(int i) {
        return false;
    }

    public boolean moveToFirst() {
        return false;
    }

    public boolean moveToLast() {
        return false;
    }

    public boolean moveToNext() {
        return false;
    }

    public boolean moveToPosition(int i) {
        return false;
    }

    public boolean moveToPrevious() {
        return false;
    }

    /* renamed from: p0 */
    public C112789a mo91039p0(Object obj) {
        return null;
    }

    public void registerContentObserver(ContentObserver contentObserver) {
    }

    public void registerDataSetObserver(DataSetObserver dataSetObserver) {
    }

    public boolean requery() {
        return false;
    }

    public Bundle respond(Bundle bundle) {
        return null;
    }

    public void setExtras(Bundle bundle) {
    }

    public void setNotificationUri(ContentResolver contentResolver, Uri uri) {
    }

    /* renamed from: u0 */
    public void mo91040u0(C112793f.C67050c cVar) {
    }

    public void unregisterContentObserver(ContentObserver contentObserver) {
    }

    public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
    }

    /* renamed from: v0 */
    public void mo91041v0(boolean z) {
    }

    /* renamed from: w0 */
    public boolean mo91042w0() {
        return false;
    }
}
