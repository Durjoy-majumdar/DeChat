package zh3;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.wcdb.Cursor;
import com.tencent.wcdb.CursorIndexOutOfBoundsException;
import com.tencent.wcdb.CursorWrapper;
import com.tencent.wcdb.database.SQLiteCursor;
import com.tencent.wcdb.database.SQLiteDirectCursor;

public class e$$i extends CursorWrapper {

    /* renamed from: d */
    public int f356762d;

    /* renamed from: e */
    public long f356763e;

    public e$$i(Cursor cursor, String str) {
        super(cursor);
        if (cursor instanceof SQLiteDirectCursor) {
            this.f356762d = 2;
        } else if (cursor instanceof SQLiteCursor) {
            this.f356762d = 1;
        } else {
            this.f356762d = -1;
        }
        this.f356763e = System.nanoTime();
    }

    public void close() {
        this.mCursor.close();
        long nanoTime = (System.nanoTime() - this.f356763e) / 1000;
        int i = this.f356762d;
        int i2 = i == 1 ? 0 : i == 2 ? 3 : -1;
        if (i2 >= 0) {
            C119118e.f356738r.mo10579b(i2 + 1, i2 + 2, nanoTime);
        }
    }

    public byte[] getBlob(int i) {
        try {
            return super.getBlob(i);
        } catch (CursorIndexOutOfBoundsException | IllegalStateException e) {
            Log.printErrStackTrace("MicroMsg.MMDataBase", e, "", new Object[0]);
            return null;
        }
    }

    public int getCount() {
        if (this.f356762d == 2) {
            Log.m105928w("MicroMsg.MMDataBase", "Slow operation: " + Util.stackTraceToString(new Throwable()));
        }
        try {
            return this.mCursor.getCount();
        } catch (IllegalStateException e) {
            Log.printErrStackTrace("MicroMsg.MMDataBase", e, "", new Object[0]);
            return 0;
        }
    }

    public double getDouble(int i) {
        try {
            return super.getDouble(i);
        } catch (CursorIndexOutOfBoundsException | IllegalStateException e) {
            Log.printErrStackTrace("MicroMsg.MMDataBase", e, "", new Object[0]);
            return 0.0d;
        }
    }

    public float getFloat(int i) {
        try {
            return super.getFloat(i);
        } catch (CursorIndexOutOfBoundsException | IllegalStateException e) {
            Log.printErrStackTrace("MicroMsg.MMDataBase", e, "", new Object[0]);
            return 0.0f;
        }
    }

    public int getInt(int i) {
        try {
            return super.getInt(i);
        } catch (CursorIndexOutOfBoundsException | IllegalStateException e) {
            Log.printErrStackTrace("MicroMsg.MMDataBase", e, "", new Object[0]);
            return 0;
        }
    }

    public long getLong(int i) {
        try {
            return super.getLong(i);
        } catch (CursorIndexOutOfBoundsException | IllegalStateException e) {
            Log.printErrStackTrace("MicroMsg.MMDataBase", e, "", new Object[0]);
            return 0;
        }
    }

    public short getShort(int i) {
        try {
            return super.getShort(i);
        } catch (CursorIndexOutOfBoundsException | IllegalStateException e) {
            Log.printErrStackTrace("MicroMsg.MMDataBase", e, "", new Object[0]);
            return 0;
        }
    }

    public String getString(int i) {
        try {
            return super.getString(i);
        } catch (CursorIndexOutOfBoundsException | IllegalStateException e) {
            Log.printErrStackTrace("MicroMsg.MMDataBase", e, "", new Object[0]);
            return null;
        }
    }
}
