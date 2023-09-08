package com.tencent.p014mm.plugin.dbbackup;

import android.content.Context;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.wcdb.database.SQLiteDatabase;
import com.tencent.wcdb.repair.RepairKit;
import com.tencent.wcdb.support.CancellationSignal;
import com.tencent.wcdb.support.OperationCanceledException;
import f40.C86709a0;
import qo3.C89779i0;
import zt3.C119157j;
import zt3.C119179t;

/* renamed from: com.tencent.mm.plugin.dbbackup.b$$f */
public final /* synthetic */ class b$$f implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ CancellationSignal f345840d;

    /* renamed from: e */
    public final /* synthetic */ C89779i0 f345841e;

    /* renamed from: f */
    public final /* synthetic */ Context f345842f;

    public /* synthetic */ b$$f(CancellationSignal cancellationSignal, C89779i0 i0Var, Context context) {
        this.f345840d = cancellationSignal;
        this.f345841e = i0Var;
        this.f345842f = context;
    }

    public final void run() {
        b$$i b__i;
        C119179t tVar;
        CancellationSignal cancellationSignal = this.f345840d;
        C89779i0 i0Var = this.f345841e;
        Context context = this.f345842f;
        try {
            SQLiteDatabase f = C86709a0.m107535s().f251811i.mo125615f();
            RepairKit.LeafInfo scan = RepairKit.LeafInfo.scan(f, C115381b.f345831c, cancellationSignal);
            scan.save(f.getPath() + ".li");
            ((C119157j) C119157j.f356862d).mo183895z(new b$$h(i0Var, context, true));
            return;
        } catch (OperationCanceledException unused) {
            Log.m105924i("MicroMsg.DBCommand", "Leaf scanning cancelled.");
            tVar = C119157j.f356862d;
            b__i = new b$$i(i0Var, context, false);
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.DBCommand", e, "Scanning leaf failed", new Object[0]);
            tVar = C119157j.f356862d;
            b__i = new b$$i(i0Var, context, false);
        } catch (Throwable th) {
            ((C119157j) C119157j.f356862d).mo183895z(new b$$i(i0Var, context, false));
            throw th;
        }
        ((C119157j) tVar).mo183895z(b__i);
    }
}
