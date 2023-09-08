package ad2;

import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import com.tencent.p014mm.booter.notification.C67843i;
import com.tencent.p014mm.booter.notification.C67845k;
import com.tencent.p014mm.booter.notification.MMNotification;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.MStorageEx;
import com.tencent.p014mm.sdk.thread.ThreadPool;
import com.tencent.p014mm.storage.C30783v3;
import eb0.C45629t0;
import eb0.C86492u2;
import eb0.C97625j3;
import f40.C86709a0;
import p285zh.C119114c;
import p645pj.C77095h;

/* renamed from: ad2.b */
public class C39544b implements C30783v3.C30787d {

    /* renamed from: d */
    public boolean f106168d = true;

    /* renamed from: e */
    public MMHandler f106169e = new C39545a(Looper.getMainLooper());

    /* renamed from: ad2.b$a */
    public class C39545a extends MMHandler {

        /* renamed from: ad2.b$a$a */
        public class C39546a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ String f106171d;

            /* renamed from: ad2.b$a$a$a */
            public class C39547a implements Runnable {

                /* renamed from: d */
                public final /* synthetic */ int f106173d;

                /* renamed from: e */
                public final /* synthetic */ int f106174e;

                /* renamed from: ad2.b$a$a$a$a */
                public class C39548a implements Runnable {
                    public C39548a() {
                    }

                    public void run() {
                        C86492u2 f = C97625j3.m125816f();
                        C39547a aVar = C39547a.this;
                        int i = aVar.f106173d;
                        String str = C39546a.this.f106171d;
                        ((MMNotification) f).getClass();
                        C67845k.C67847b.f194757a.mo93234b(i, str);
                        C39544b bVar = C39544b.this;
                        if (bVar.f106168d) {
                            bVar.f106168d = false;
                            ((MMNotification) C97625j3.m125816f()).getClass();
                            C67843i.m80206c(false);
                        }
                    }
                }

                public C39547a(int i, int i2) {
                    this.f106173d = i;
                    this.f106174e = i2;
                }

                public void run() {
                    C86492u2 f = C97625j3.m125816f();
                    int i = this.f106173d;
                    ((MMNotification) f).getClass();
                    C67843i.m80207d(i);
                    C86492u2 f2 = C97625j3.m125816f();
                    String str = C39546a.this.f106171d;
                    int i2 = this.f106174e;
                    ((MMNotification) f2).getClass();
                    C67843i.m80208e(str, i2);
                    Log.m105925i("MicroMsg.NotificationObserver", "NotificationObserver refresh total badge count: %d, and talker badge count: %d", Integer.valueOf(this.f106173d), Integer.valueOf(this.f106174e));
                    ThreadPool.post((Runnable) new C39548a(), "NotificationObserver", false);
                }
            }

            public C39546a(String str) {
                this.f106171d = str;
            }

            public void run() {
                if (!C86709a0.m107523b().mo121114l()) {
                    Log.m105928w("MicroMsg.NotificationObserver", "account not init.");
                } else if (C45629t0.m50821h(this.f106171d)) {
                    Log.m105925i("MicroMsg.NotificationObserver", "talker[%s] is mute.", this.f106171d);
                } else {
                    C119114c.m167921f("badge");
                    MMHandlerThread.postToMainThread(new C39547a(C77095h.m93059b(), C45629t0.m50817d(this.f106171d, (String[]) null)));
                }
            }
        }

        public C39545a(Looper looper) {
            super(looper);
        }

        public void handleMessage(Message message) {
            super.handleMessage(message);
            C86709a0.m107525e().postToWorkerDelayed(new C39546a(message.getData().getString("com.tencent.mm.notification.observer")), 500);
        }
    }

    public void onNotifyChange(int i, MStorageEx mStorageEx, Object obj) {
        boolean z = true;
        int i2 = 0;
        Log.m105925i("MicroMsg.NotificationObserver", "event: %d", Integer.valueOf(i));
        if (obj instanceof String) {
            String str = (String) obj;
            if (!Util.isNullOrNil(str)) {
                if (C97625j3.f286396b != null) {
                    z = false;
                }
                if (!z) {
                    i2 = (int) C97625j3.m125812b().mo105907v().mo69664N2(str).f108320R1;
                    C97625j3.m125812b().mo105907v().mo69653F1(str);
                }
                this.f106169e.removeMessages(i2);
                Message obtain = Message.obtain();
                Bundle bundle = new Bundle();
                bundle.putString("com.tencent.mm.notification.observer", str);
                obtain.setData(bundle);
                obtain.what = i2;
                this.f106169e.sendMessageDelayed(obtain, 50);
                return;
            }
        }
        Log.m105919d("MicroMsg.NotificationObserver", "onNotifyChange obj not String event:%d stg:%s obj:%s", Integer.valueOf(i), mStorageEx, obj);
    }
}
