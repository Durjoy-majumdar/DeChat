package com.tencent.p014mm.storage;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.wcdb.database.SQLiteDatabase;
import java.util.HashMap;
import java.util.Map;
import zh3.C91753f;

/* renamed from: com.tencent.mm.storage.v1$$b */
public class v1$$b implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C85801v1 f249902d;

    public v1$$b(C85801v1 v1Var) {
        this.f249902d = v1Var;
    }

    public void run() {
        int i;
        StringBuilder sb;
        String str;
        HashMap<Integer, v1$$e> hashMap;
        HashMap<String, v1$$e> hashMap2;
        C91753f fVar = this.f249902d.f249894c;
        SQLiteDatabase f = fVar != null ? fVar.mo125615f() : null;
        if (f == null || !f.isOpen()) {
            Log.m105928w("MicroMsg.ConfigStorage", "Skip flushing because database has been closed.");
            return;
        }
        boolean z = true;
        try {
            f.acquireReference();
            f.beginTransaction();
            try {
                Object[] objArr = new Object[3];
                Object[] objArr2 = new Object[1];
                synchronized (this.f249902d) {
                    C85801v1 v1Var = this.f249902d;
                    hashMap = v1Var.f249897f;
                    hashMap2 = v1Var.f249898g;
                    v1Var.f249897f = new HashMap<>();
                    this.f249902d.f249898g = new HashMap<>();
                    this.f249902d.f249900i = false;
                }
                i = 0;
                for (Map.Entry next : hashMap.entrySet()) {
                    try {
                        v1$$e v1__e = (v1$$e) next.getValue();
                        if (v1__e == null) {
                            objArr2[0] = next.getKey();
                            f.execSQL("DELETE FROM userinfo WHERE id=?;", objArr2);
                        } else {
                            objArr[0] = next.getKey();
                            objArr[1] = Integer.valueOf(v1__e.f249905a);
                            objArr[2] = v1__e.f249906b;
                            f.execSQL("INSERT OR REPLACE INTO userinfo VALUES (?,?,?);", objArr);
                        }
                        i++;
                    } catch (RuntimeException e) {
                        e = e;
                        try {
                            Log.printErrStackTrace("MicroMsg.ConfigStorage", e, "Failed to flush ConfigStorage", new Object[0]);
                            f.endTransaction();
                            f.releaseReference();
                            str = "MicroMsg.ConfigStorage";
                            sb = new StringBuilder();
                            sb.append("Flushed ");
                            sb.append(i);
                            sb.append(" entries.");
                            Log.m105924i(str, sb.toString());
                        } catch (Throwable th) {
                            th = th;
                            f.endTransaction();
                            f.releaseReference();
                            Log.m105924i("MicroMsg.ConfigStorage", "Flushed " + i + " entries.");
                            throw th;
                        }
                    }
                }
                for (Map.Entry next2 : hashMap2.entrySet()) {
                    v1$$e v1__e2 = (v1$$e) next2.getValue();
                    if (v1__e2 == null) {
                        objArr2[0] = next2.getKey();
                        f.execSQL("DELETE FROM userinfo2 WHERE sid=?;", objArr2);
                    } else {
                        objArr[0] = next2.getKey();
                        objArr[1] = Integer.valueOf(v1__e2.f249905a);
                        objArr[2] = v1__e2.f249906b;
                        f.execSQL("INSERT OR REPLACE INTO userinfo2 VALUES (?,?,?);", objArr);
                    }
                    i++;
                }
                f.setTransactionSuccessful();
                if (f.inTransaction()) {
                    f.endTransaction();
                }
                f.releaseReference();
                str = "MicroMsg.ConfigStorage";
                sb = new StringBuilder();
            } catch (RuntimeException e2) {
                e = e2;
            } catch (Throwable th4) {
                th = th4;
                i = 0;
                f.endTransaction();
                f.releaseReference();
                Log.m105924i("MicroMsg.ConfigStorage", "Flushed " + i + " entries.");
                throw th;
            }
        } catch (RuntimeException e3) {
            e = e3;
            z = false;
            i = 0;
            Log.printErrStackTrace("MicroMsg.ConfigStorage", e, "Failed to flush ConfigStorage", new Object[0]);
            if (z && f.inTransaction()) {
                f.endTransaction();
            }
            f.releaseReference();
            str = "MicroMsg.ConfigStorage";
            sb = new StringBuilder();
            sb.append("Flushed ");
            sb.append(i);
            sb.append(" entries.");
            Log.m105924i(str, sb.toString());
        } catch (Throwable th5) {
            th = th5;
            z = false;
            i = 0;
            if (z && f.inTransaction()) {
                f.endTransaction();
            }
            f.releaseReference();
            Log.m105924i("MicroMsg.ConfigStorage", "Flushed " + i + " entries.");
            throw th;
        }
        sb.append("Flushed ");
        sb.append(i);
        sb.append(" entries.");
        Log.m105924i(str, sb.toString());
    }
}
