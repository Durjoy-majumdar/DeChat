package zh3;

import android.os.Looper;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.wcdb.database.SQLiteAsyncCheckpointer;
import com.tencent.wcdb.database.SQLiteDatabase;

public class e$$b extends SQLiteAsyncCheckpointer {
    public e$$b(Looper looper, int i, int i2) {
        super(looper, i, i2);
    }

    public void onCheckpointResult(SQLiteDatabase sQLiteDatabase, int i, int i2, long j) {
        int i3 = i == i2 ? 18 : 21;
        C119118e.f356738r.mo10579b(i3 + 1, i3 + 2, j);
        Log.m105919d("MicroMsg.MMDataBase", "Checkpointed, pages: %d/%d, time: %d, db: %s", Integer.valueOf(i2), Integer.valueOf(i), Long.valueOf(j), sQLiteDatabase.getPath());
    }
}
