package com.tencent.wcdb;

import android.database.CharArrayBuffer;
import android.database.ContentObserver;
import android.database.DataSetObserver;
import android.os.Bundle;
import android.os.RemoteException;
import com.tencent.wcdb.AbstractCursor;
import com.tencent.wcdb.support.Log;

public final class BulkCursorToCursorAdaptor extends AbstractWindowedCursor {
    private static final String TAG = "BulkCursor";
    private IBulkCursor mBulkCursor;
    private String[] mColumns;
    private int mCount;
    private AbstractCursor.SelfContentObserver mObserverBridge = new AbstractCursor.SelfContentObserver(this);
    private boolean mWantsAllOnMoveCalls;

    private void throwIfCursorIsClosed() {
        if (this.mBulkCursor == null) {
            throw new StaleDataException("Attempted to access a cursor after it has been closed.");
        }
    }

    public void close() {
        super.close();
        IBulkCursor iBulkCursor = this.mBulkCursor;
        if (iBulkCursor != null) {
            try {
                iBulkCursor.close();
            } catch (RemoteException unused) {
                Log.m164301w(TAG, "Remote process exception when closing");
            } catch (Throwable th) {
                this.mBulkCursor = null;
                throw th;
            }
            this.mBulkCursor = null;
        }
    }

    public void copyStringToBuffer(int i, CharArrayBuffer charArrayBuffer) {
    }

    public void deactivate() {
        super.deactivate();
        IBulkCursor iBulkCursor = this.mBulkCursor;
        if (iBulkCursor != null) {
            try {
                iBulkCursor.deactivate();
            } catch (RemoteException unused) {
                Log.m164301w(TAG, "Remote process exception when deactivating");
            }
        }
    }

    public String[] getColumnNames() {
        throwIfCursorIsClosed();
        return this.mColumns;
    }

    public int getCount() {
        throwIfCursorIsClosed();
        return this.mCount;
    }

    public Bundle getExtras() {
        throwIfCursorIsClosed();
        try {
            return this.mBulkCursor.getExtras();
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    public IContentObserver getObserver() {
        try {
            return (IContentObserver) this.mObserverBridge.getClass().getMethod("getContentObserver", new Class[0]).invoke(this.mObserverBridge, new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    public void initialize(BulkCursorDescriptor bulkCursorDescriptor) {
        this.mBulkCursor = bulkCursorDescriptor.cursor;
        String[] strArr = bulkCursorDescriptor.columnNames;
        this.mColumns = strArr;
        this.mRowIdColumnIndex = DatabaseUtils.findRowIdColumnIndex(strArr);
        this.mWantsAllOnMoveCalls = bulkCursorDescriptor.wantsAllOnMoveCalls;
        this.mCount = bulkCursorDescriptor.count;
        CursorWindow cursorWindow = bulkCursorDescriptor.window;
        if (cursorWindow != null) {
            setWindow(cursorWindow);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0035 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0036 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onMove(int r3, int r4) {
        /*
            r2 = this;
            r2.throwIfCursorIsClosed()
            r3 = 0
            com.tencent.wcdb.CursorWindow r0 = r2.mWindow     // Catch:{ RemoteException -> 0x0038 }
            if (r0 == 0) goto L_0x0028
            int r0 = r0.getStartPosition()     // Catch:{ RemoteException -> 0x0038 }
            if (r4 < r0) goto L_0x0028
            com.tencent.wcdb.CursorWindow r0 = r2.mWindow     // Catch:{ RemoteException -> 0x0038 }
            int r0 = r0.getStartPosition()     // Catch:{ RemoteException -> 0x0038 }
            com.tencent.wcdb.CursorWindow r1 = r2.mWindow     // Catch:{ RemoteException -> 0x0038 }
            int r1 = r1.getNumRows()     // Catch:{ RemoteException -> 0x0038 }
            int r0 = r0 + r1
            if (r4 < r0) goto L_0x001e
            goto L_0x0028
        L_0x001e:
            boolean r0 = r2.mWantsAllOnMoveCalls     // Catch:{ RemoteException -> 0x0038 }
            if (r0 == 0) goto L_0x0031
            com.tencent.wcdb.IBulkCursor r0 = r2.mBulkCursor     // Catch:{ RemoteException -> 0x0038 }
            r0.onMove(r4)     // Catch:{ RemoteException -> 0x0038 }
            goto L_0x0031
        L_0x0028:
            com.tencent.wcdb.IBulkCursor r0 = r2.mBulkCursor     // Catch:{ RemoteException -> 0x0038 }
            com.tencent.wcdb.CursorWindow r4 = r0.getWindow(r4)     // Catch:{ RemoteException -> 0x0038 }
            r2.setWindow(r4)     // Catch:{ RemoteException -> 0x0038 }
        L_0x0031:
            com.tencent.wcdb.CursorWindow r4 = r2.mWindow
            if (r4 != 0) goto L_0x0036
            return r3
        L_0x0036:
            r3 = 1
            return r3
        L_0x0038:
            java.lang.String r4 = "BulkCursor"
            java.lang.String r0 = "Unable to get window because the remote process is dead"
            com.tencent.wcdb.support.Log.m164293e(r4, r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.wcdb.BulkCursorToCursorAdaptor.onMove(int, int):boolean");
    }

    public void registerContentObserver(ContentObserver contentObserver) {
    }

    public void registerDataSetObserver(DataSetObserver dataSetObserver) {
    }

    public boolean requery() {
        throwIfCursorIsClosed();
        try {
            int requery = this.mBulkCursor.requery(getObserver());
            this.mCount = requery;
            if (requery != -1) {
                this.mPos = -1;
                closeWindow();
                super.requery();
                return true;
            }
            deactivate();
            return false;
        } catch (Exception e) {
            Log.m164293e(TAG, "Unable to requery because the remote process exception " + e.getMessage());
            deactivate();
            return false;
        }
    }

    public Bundle respond(Bundle bundle) {
        throwIfCursorIsClosed();
        try {
            return this.mBulkCursor.respond(bundle);
        } catch (RemoteException e) {
            Log.m164302w(TAG, "respond() threw RemoteException, returning an empty bundle.", e);
            return Bundle.EMPTY;
        }
    }

    public void unregisterContentObserver(ContentObserver contentObserver) {
    }

    public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
    }
}
