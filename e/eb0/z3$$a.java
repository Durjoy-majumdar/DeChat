package eb0;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C44660i2;
import com.tencent.p014mm.storage.C72972g4;
import com.tencent.p014mm.storage.C72986n2;
import com.tencent.wcdb.Cursor;
import com.tencent.wcdb.database.SQLiteDirectCursor;
import com.tencent.wcdb.support.CancellationSignal;
import com.tencent.youtu.sdkkitframework.common.StateEvent;
import di3.C86312j;
import eb0.C97629n2;
import f40.C86709a0;
import f62.C75700k0;
import java.util.ArrayList;
import kj2.C117407d;

public final /* synthetic */ class z3$$a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C97629n2.C97630a f286400d;

    /* renamed from: e */
    public final /* synthetic */ long f286401e;

    /* renamed from: f */
    public final /* synthetic */ CancellationSignal f286402f;

    public /* synthetic */ z3$$a(C97629n2.C97630a aVar, long j, CancellationSignal cancellationSignal) {
        this.f286400d = aVar;
        this.f286401e = j;
        this.f286402f = cancellationSignal;
    }

    public final void run() {
        Cursor rawQueryWithFactory;
        Throwable th;
        C97629n2.C97630a aVar = this.f286400d;
        long j = this.f286401e;
        CancellationSignal cancellationSignal = this.f286402f;
        Class cls = C75700k0.class;
        C117407d.INSTANCE.idkeyStat(1333, 0, 1, true);
        ((C44660i2) ((C75700k0) C86709a0.m107533q(cls)).mo96094Ku()).mo69765g();
        C72972g4 g4Var = (C72972g4) ((C75700k0) C86709a0.m107533q(cls)).mo96095LE();
        g4Var.getClass();
        ArrayList arrayList = new ArrayList();
        try {
            rawQueryWithFactory = g4Var.f212775p.mo125615f().rawQueryWithFactory(SQLiteDirectCursor.FACTORY, "SELECT DISTINCT talker FROM message", (Object[]) null, StateEvent.Name.MESSAGE);
            while (rawQueryWithFactory.moveToNext()) {
                arrayList.add(rawQueryWithFactory.getString(0));
            }
            rawQueryWithFactory.close();
        } catch (RuntimeException e) {
            Log.printErrStackTrace("MicroMsg.MsgInfoStorage", e, "Cannot get all talkers", new Object[0]);
        } catch (Throwable th4) {
            th.addSuppressed(th4);
        }
        ((C97629n2) C86312j.m106911c(C97629n2.class)).mo136894Zu(arrayList, aVar, Long.MIN_VALUE, j, true, true, cancellationSignal);
        ((C72986n2) ((C75700k0) C86709a0.m107533q(cls)).mo96093DX()).mo101181Ow("", 0);
        return;
        throw th;
    }
}
