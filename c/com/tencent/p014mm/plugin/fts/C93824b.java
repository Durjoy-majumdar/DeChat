package com.tencent.p014mm.plugin.fts;

import android.database.Cursor;
import android.database.CursorWrapper;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: com.tencent.mm.plugin.fts.b */
public class C93824b extends CursorWrapper {

    /* renamed from: d */
    public static HashSet<Cursor> f270786d = new HashSet<>();

    public C93824b(Cursor cursor) {
        super(cursor);
        f270786d.add(cursor);
        Log.m105925i("MicroMsg.FTS.FTSCursor", "add cursor %d", Integer.valueOf(cursor.hashCode()));
    }

    /* renamed from: a */
    public static final void m118491a() {
        Iterator<Cursor> it = f270786d.iterator();
        while (it.hasNext()) {
            Cursor next = it.next();
            if (!next.isClosed()) {
                try {
                    next.close();
                } catch (Exception unused) {
                }
                Log.m105921e("MicroMsg.FTS.FTSCursor", "not close cursor!!! %d", Integer.valueOf(next.hashCode()));
            }
        }
        f270786d.clear();
    }

    public void close() {
        super.close();
        Cursor wrappedCursor = getWrappedCursor();
        f270786d.remove(wrappedCursor);
        Log.m105925i("MicroMsg.FTS.FTSCursor", "remove cursor %d", Integer.valueOf(wrappedCursor.hashCode()));
    }
}
