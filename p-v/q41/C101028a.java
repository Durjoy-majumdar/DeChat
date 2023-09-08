package q41;

import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C85801v1;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.wcdb.database.SQLiteDatabase;
import com.tencent.wcdb.repair.RepairKit;
import com.tencent.wcdb.support.CancellationSignal;
import com.tencent.wcdb.support.OperationCanceledException;
import com.tencent.xweb.util.WXWebReporter;
import di3.C86312j;
import f40.C86709a0;
import g62.C75875l;
import gy3.C87412m;
import h81.C32735h;
import java.util.concurrent.Future;
import kj2.C117407d;
import qh3.C89661b;
import rx3.C13598b0;
import rx3.C36570n;

/* renamed from: q41.a */
public final class C101028a implements Runnable {

    /* renamed from: d */
    public static final C101028a f295813d = new C101028a();

    /* renamed from: e */
    public static CancellationSignal f295814e;

    /* renamed from: f */
    public static Future<?> f295815f;

    /* renamed from: g */
    public static boolean f295816g;

    /* renamed from: h */
    public static volatile boolean f295817h;

    /* renamed from: q41.a$a */
    public static final class C101029a implements C75875l.C32329c {
        /* renamed from: w5 */
        public void mo55728w5(C75875l lVar, C75875l.C45886e eVar) {
            C89661b.C89663b bVar = (C89661b.C89663b) ((C36570n) C101031c.f295820b).getValue();
            ((C36570n) C101031c.f295821c).getValue();
            C13598b0 b0Var = C13598b0.f38549a;
            if (C86709a0.m107522a()) {
                if (C87412m.m108589b(eVar != null ? eVar.f123845b : null, "delete") && eVar.f123849f > 0) {
                    C101028a.m132398a(false);
                }
            }
        }
    }

    /* renamed from: a */
    public static final void m132398a(boolean z) {
        if (!f295817h) {
            Log.m105924i("MicroMsg.DBLeafBackup", "Will update backup soon.");
            C85801v1 i = C86709a0.m107535s().mo121142i();
            i.mo119680N(94, 0);
            i.mo119681a(false);
            f295817h = true;
            C101031c.m132400a(75, 0, 2, (Object) null);
        }
        if (z) {
            Log.m105924i("MicroMsg.DBLeafBackup", "Drop DB leaf backup.");
            C86013q1.m106447h(C86709a0.m107535s().f251811i.mo125615f().getPath() + ".li");
            C101031c.m132400a(76, 0, 2, (Object) null);
        }
    }

    /* JADX INFO: finally extract failed */
    public void run() {
        CancellationSignal cancellationSignal;
        synchronized (this) {
            try {
                cancellationSignal = f295814e;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (cancellationSignal != null) {
            if (C87412m.m108589b("0", ((C32735h) C86312j.m106911c(C32735h.class)).mo58776F5("clicfg_db_backup_leaf_android", "0"))) {
                Log.m105924i("MicroMsg.DBLeafBackup", "Leaf backup disabled.");
                return;
            }
            long currentTimeMillis = System.currentTimeMillis();
            try {
                long F = currentTimeMillis - C86709a0.m107535s().mo121142i().mo119672F(94, 0);
                if (F < 86400000) {
                    Log.m105924i("MicroMsg.DBLeafBackup", "Backup interval not reached, skip: [" + F + " / 86400000]");
                    return;
                }
                C101031c.m132400a(65, 0, 2, (Object) null);
                Log.m105924i("MicroMsg.DBLeafBackup", "Start leaf backup, interval: [" + F + " / 86400000]");
                SQLiteDatabase f = C86709a0.m107535s().f251811i.mo125615f();
                RepairKit.LeafInfo.scan(f, C101031c.f295819a, cancellationSignal).save(f.getPath() + ".li.tmp");
                C86013q1.m106463x(f.getPath() + ".li.tmp", f.getPath() + ".li");
                C85801v1 i = C86709a0.m107535s().mo121142i();
                i.mo119680N(94, currentTimeMillis);
                i.mo119681a(false);
                f295817h = false;
                long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
                Log.m105924i("MicroMsg.DBLeafBackup", "Leaf backup done, time: " + currentTimeMillis2 + " ms");
                C117407d.INSTANCE.mo160130g(WXWebReporter.WXWEB_IDKEY_PLUGIN_CONFIG_DOWNLOAD, WXWebReporter.WXWEB_IDKEY_PLUGIN_CONFIG_DOWNLOAD, 66, 69, (int) 1, (int) (currentTimeMillis2 / ((long) 1000)), true);
                synchronized (this) {
                    f295814e = null;
                    f295815f = null;
                    C13598b0 b0Var = C13598b0.f38549a;
                }
            } catch (OperationCanceledException unused) {
                long currentTimeMillis3 = System.currentTimeMillis() - currentTimeMillis;
                Log.m105924i("MicroMsg.DBLeafBackup", "Leaf backup cancelled, time: " + currentTimeMillis3 + " ms");
                String[] strArr = C101031c.f295819a;
                C117407d.INSTANCE.mo160130g(WXWebReporter.WXWEB_IDKEY_PLUGIN_CONFIG_DOWNLOAD, WXWebReporter.WXWEB_IDKEY_PLUGIN_CONFIG_DOWNLOAD, 67, 70, (int) 1, (int) (currentTimeMillis3 / ((long) 1000)), true);
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.DBLeafBackup", e, "Leaf backup failed.", new Object[0]);
                C101031c.m132400a(68, 0, 2, (Object) null);
                C117407d.INSTANCE.mo160131h(21388, "@DBLeafBackupFailed", 0, 0, e.getMessage(), BuildInfo.REV);
                C85801v1 i2 = C86709a0.m107535s().mo121142i();
                i2.mo119680N(94, currentTimeMillis);
                i2.mo119681a(false);
            }
        }
    }
}
