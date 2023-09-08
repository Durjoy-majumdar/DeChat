package l71;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: l71.a */
public class C117461a {

    /* renamed from: a */
    public static boolean f351535a;

    /* renamed from: b */
    public static int f351536b;

    /* renamed from: c */
    public static final Handler f351537c = new C117462a(Looper.getMainLooper());

    /* renamed from: l71.a$a */
    public class C117462a extends Handler {
        public C117462a(Looper looper) {
            super(looper);
        }

        public void handleMessage(Message message) {
            int i = message.what;
            if (i == 0) {
                C117463b bVar = (C117463b) message.obj;
                switch (bVar.ordinal()) {
                    case 0:
                        C117461a.m165682b(1);
                        break;
                    case 1:
                        C117461a.m165681a(-2);
                        break;
                    case 2:
                        C117461a.m165682b(2);
                        break;
                    case 3:
                        C117461a.m165681a(-3);
                        break;
                    case 4:
                        C117461a.m165682b(4);
                        break;
                    case 5:
                        C117461a.m165681a(-5);
                        break;
                    case 6:
                        C117461a.m165682b(8);
                        break;
                    case 7:
                        C117461a.m165681a(-9);
                        break;
                    case 8:
                        C117461a.m165682b(16);
                        break;
                    case 9:
                        C117461a.m165681a(-17);
                        break;
                    case 10:
                        C117461a.m165682b(32);
                        break;
                    case 11:
                        C117461a.m165681a(-33);
                        break;
                }
                if (C117461a.f351536b > 0) {
                    C117461a.f351535a = true;
                } else if (bVar == C117463b.INVOKE_ONCE) {
                    C117461a.f351535a = true;
                    C117461a.f351537c.sendEmptyMessageDelayed(1, 20000);
                } else {
                    C117461a.f351535a = false;
                }
            } else if (i == 1 && C117461a.f351536b == 0) {
                C117461a.f351535a = false;
            }
        }
    }

    /* renamed from: l71.a$b */
    public enum C117463b {
        SCANNING,
        STOP_SCANNING,
        START_CHANNEL_SERVICE,
        STOP_CHANNEL_SERVICE,
        SIMPLE_BLUETOOTH_SCAN,
        SIMPLE_BLUETOOTH_STOP_SCAN,
        SIMPLE_BLUETOOTH_CONNECT,
        SIMPLE_BLUETOOTH_DISCONNECT,
        WEAR_SERVICE_CREATE,
        WEAR_SERVICE_DESTROY,
        RTOS_SERVICE_CREATE,
        RTOS_SERVICE_DESTROY,
        INVOKE_ONCE
    }

    /* renamed from: a */
    public static /* synthetic */ int m165681a(int i) {
        int i2 = i & f351536b;
        f351536b = i2;
        return i2;
    }

    /* renamed from: b */
    public static /* synthetic */ int m165682b(int i) {
        int i2 = i | f351536b;
        f351536b = i2;
        return i2;
    }

    /* renamed from: c */
    public static void m165683c(C117463b bVar) {
        Log.m105925i("MicroMsg.ExDeviceProcessBusyMonitor", "Operating %s", bVar);
        Handler handler = f351537c;
        handler.removeMessages(1);
        handler.sendMessage(Message.obtain(handler, 0, bVar));
    }
}
