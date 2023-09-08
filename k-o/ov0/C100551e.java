package ov0;

import com.tencent.p014mm.autogen.events.BackupResetAccUinEvent;
import com.tencent.p014mm.autogen.events.CleanWxFileIndexEvent;
import com.tencent.p014mm.autogen.events.ShouldRescanMessagesEvent;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86013q1;
import eb0.C97625j3;
import f40.C86709a0;
import f40.C86718e;
import jv0.C99055a;

/* renamed from: ov0.e */
public class C100551e implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ Runnable f294608d;

    /* renamed from: e */
    public final /* synthetic */ C100546d f294609e;

    /* renamed from: ov0.e$a */
    public class C100552a implements MMHandlerThread.IWaitWorkThread {
        public C100552a() {
        }

        public boolean doInBackground() {
            Log.m105924i("MicroMsg.BakOldTempDbModel", "bakoldRecoverFromTempDb doInBackground start");
            Log.appenderFlush();
            C100546d dVar = C100551e.this.f294609e;
            C100546d dVar2 = C100546d.f294591e;
            dVar.getClass();
            long nowMilliSecond = Util.nowMilliSecond();
            C97625j3.m125812b().getClass();
            C86709a0.m107528h();
            C86709a0.m107535s().mo121137c((String) null);
            C86013q1.m106442c(C97625j3.m125812b().mo105899n() + ".tem", C97625j3.m125812b().mo105899n());
            C86013q1.m106442c(C97625j3.m125812b().mo105900o() + ".tem", C97625j3.m125812b().mo105900o());
            C86013q1.m106442c(C97625j3.m125812b().mo105900o() + ".tem" + "-journal", C97625j3.m125812b().mo105900o() + "-journal");
            C86013q1.m106442c(C97625j3.m125812b().mo105900o() + ".tem" + "-wal", C97625j3.m125812b().mo105900o() + "-wal");
            new CleanWxFileIndexEvent().publish();
            C86718e b = C86709a0.m107523b();
            synchronized (b.f251752c) {
                b.mo121123x();
            }
            C86709a0.m107523b().mo121116o();
            C100546d.m131562d();
            new BackupResetAccUinEvent().publish();
            Log.m105925i("MicroMsg.BakOldTempDbModel", "bakoldRecoverFromTempDbImp finish cost time[%d]", Long.valueOf(Util.milliSecondsToNow(nowMilliSecond)));
            C86013q1.m106445f(C99055a.m129003b());
            C100544c f = C100551e.this.f294609e.mo139994f();
            f.f294588b.post(new C100543b(f));
            Log.m105924i("MicroMsg.BakOldTempDbModel", "bakoldRecoverFromTempDb doInBackground end");
            Log.appenderFlush();
            return true;
        }

        public boolean onPostExecute() {
            Log.m105924i("MicroMsg.BakOldTempDbModel", "bakoldRecoverFromTempDb onPostExecute");
            C100551e.this.f294608d.run();
            new ShouldRescanMessagesEvent().publish();
            return false;
        }

        public String toString() {
            return super.toString() + "|bakoldRecoverFromTempDb";
        }
    }

    public C100551e(C100546d dVar, Runnable runnable) {
        this.f294609e = dVar;
        this.f294608d = runnable;
    }

    public void run() {
        Log.m105924i("MicroMsg.BakOldTempDbModel", "bakoldRecoverFromTempDb closeTempDB ok");
        Log.appenderFlush();
        C86709a0.m107525e().postAtFrontOfWorker(new C100552a());
    }
}
