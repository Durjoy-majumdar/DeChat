package h20;

import com.tencent.p014mm.autogen.events.PostSyncTaskEvent;
import com.tencent.p014mm.hardcoder.WXHardCoderJNI;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.thread.ThreadPool;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.storage.C85801v1;
import di3.C86312j;
import f40.C86709a0;

/* renamed from: h20.e */
public class C32668e extends IStaticListener<PostSyncTaskEvent> {

    /* renamed from: d */
    public Runnable f86689d = new C32669a(this);

    /* renamed from: h20.e$a */
    public class C32669a implements Runnable {

        /* renamed from: h20.e$a$a */
        public class C32670a implements Runnable {
            public C32670a(C32669a aVar) {
            }

            public void run() {
                WXHardCoderJNI wXHardCoderJNI = (WXHardCoderJNI) C86312j.m106911c(WXHardCoderJNI.class);
                Object[] objArr = new Object[3];
                objArr[0] = Long.valueOf(Thread.currentThread().getId());
                objArr[1] = Thread.currentThread().getName();
                objArr[2] = Boolean.valueOf(wXHardCoderJNI.isCheckEnv() && wXHardCoderJNI.isRunning() > 0);
                Log.m105925i("MicroMsg.WXHardCoderJNI", "reportHardCoder tid[%d, %s], running[%b]", objArr);
                wXHardCoderJNI.reportIDKey(true, 0, 1, false);
                wXHardCoderJNI.readServerAddr(true);
                wXHardCoderJNI.reportIDKey(true, (!wXHardCoderJNI.isCheckEnv() || wXHardCoderJNI.isRunning() <= 0) ? 5 : 4, 1, false);
                wXHardCoderJNI.reportIDKey(true, wXHardCoderJNI.isHCEnable() ? 6 : 7, 1, false);
            }
        }

        public C32669a(C32668e eVar) {
        }

        public void run() {
            Log.m105924i("MicroMsg.WXHardCoderJNI", "reportHardcoderRunnable start to run");
            C86709a0.m107528h();
            C85801v1 i = C86709a0.m107535s().mo121142i();
            C72994y1.C72995a aVar = C72994y1.C72995a.USERINFO_REPORT_HARDCODER_TIME_LONG;
            long longValue = ((Long) i.mo119685f(aVar, 0L)).longValue();
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - longValue > 86400000 || longValue > currentTimeMillis) {
                C86709a0.m107528h();
                C86709a0.m107535s().mo121142i().mo119677K(aVar, Long.valueOf(currentTimeMillis));
                ThreadPool.post(new C32670a(this), "reportHardCoder");
            }
        }
    }

    public boolean callback(IEvent iEvent) {
        PostSyncTaskEvent postSyncTaskEvent = (PostSyncTaskEvent) iEvent;
        C86709a0.m107525e();
        MMHandlerThread.removeRunnable(this.f86689d);
        C86709a0.m107525e().postToWorkerDelayed(this.f86689d, 3000);
        return false;
    }
}
