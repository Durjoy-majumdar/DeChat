package p1064xf;

import android.os.Looper;
import android.os.Message;
import android.os.MessageQueue;
import android.util.SparseBooleanArray;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.lang.reflect.Field;
import kj2.C117407d;
import lu3.C109426i;

/* renamed from: xf.c */
public class C91194c {

    /* renamed from: a */
    public static boolean f261452a = false;

    /* renamed from: b */
    public static int f261453b = 0;

    /* renamed from: c */
    public static C109426i f261454c = null;

    /* renamed from: d */
    public static String f261455d = "";

    /* renamed from: e */
    public static volatile SparseBooleanArray f261456e = new SparseBooleanArray(5);

    /* renamed from: f */
    public static int f261457f = -1;

    /* renamed from: g */
    public static volatile boolean f261458g = true;

    /* renamed from: a */
    public static void m114456a(int i) {
        f261453b = 0;
        int i2 = 0;
        while (i2 < 10) {
            boolean z = true;
            Log.m105925i("SyncBarrierWatchDogPlus", "startCheckStrictly, token = %d, checkCount = %d ", Integer.valueOf(i), Integer.valueOf(i2));
            i2++;
            if (i != m114457b()) {
                Log.m105924i("SyncBarrierWatchDogPlus", "token != lastToken, just break");
                return;
            }
            C91193b bVar = new C91193b(Looper.getMainLooper());
            Message obtain = Message.obtain();
            obtain.setAsynchronous(true);
            obtain.setTarget(bVar);
            obtain.arg1 = 0;
            Message obtain2 = Message.obtain();
            obtain2.arg1 = 1;
            bVar.sendMessage(obtain);
            bVar.sendMessage(obtain2);
            if (f261453b > 3) {
                Log.m105925i("SyncBarrierWatchDogPlus", "Maybe happens a barrier leak, token = %d, barrierCount = barrierCount", Integer.valueOf(i), Integer.valueOf(f261453b));
                if (i == m114457b()) {
                    m114458c(i, 21, 11);
                } else {
                    m114458c(i, 20, 10);
                }
            } else {
                z = false;
            }
            if (!z) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException unused) {
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: b */
    public static int m114457b() {
        try {
            MessageQueue queue = Looper.getMainLooper().getQueue();
            Field declaredField = queue.getClass().getDeclaredField("mMessages");
            declaredField.setAccessible(true);
            Message message = (Message) declaredField.get(queue);
            if (message == null || message.getTarget() != null) {
                return -1;
            }
            return message.arg1;
        } catch (Exception unused) {
            return -1;
        }
    }

    /* renamed from: c */
    public static void m114458c(int i, int i2, int i3) {
        if (!f261456e.get(i)) {
            f261456e.put(i, true);
            C117407d dVar = C117407d.INSTANCE;
            dVar.idkeyStat(1470, (long) i2, 1, true);
            String visibleScene = AppMethodBeat.getVisibleScene();
            if (visibleScene == null) {
                visibleScene = "";
            }
            Log.m105925i("SyncBarrierWatchDogPlus", "sync barrier leak happens in scene : %s, type : %d", visibleScene, Integer.valueOf(i3));
            dVar.mo160131h(20739, visibleScene, Integer.valueOf(i3));
        }
    }
}
