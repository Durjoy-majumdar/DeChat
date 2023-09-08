package bp3;

import com.tencent.p014mm.app.C80611s0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.PeriodRecorder;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: bp3.l */
public class C79755l {

    /* renamed from: a */
    public static final PeriodRecorder f233752a = new PeriodRecorder("MissingMessageListenerRpt", TimeUnit.HOURS.toMillis(48), false, true);

    /* renamed from: b */
    public static final Set<Object> f233753b = new HashSet();

    /* renamed from: c */
    public static final Set<Object> f233754c = new HashSet();

    /* renamed from: d */
    public static final Set<Object> f233755d = new HashSet();

    /* renamed from: e */
    public static final Set<Object> f233756e = new HashSet();

    /* renamed from: f */
    public static final Lock f233757f;

    /* renamed from: g */
    public static final Lock f233758g;

    static {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        f233757f = reentrantReadWriteLock.readLock();
        f233758g = reentrantReadWriteLock.writeLock();
    }

    /* renamed from: a */
    public static boolean m96891a(Object obj) {
        return "NewXmlShowChatRoomAnnouncement".equals(obj) || "RecommendEmotion".equals(obj) || "SafeModuleCfg".equals(obj) || "voipmt_not_friend".equals(obj) || "ShareExtensionSendImgResp".equals(obj) || "ShareExtensionSendAppMsgResp".equals(obj);
    }

    /* renamed from: b */
    public static void m96892b(int i, String str, String str2) {
        C80611s0.m98244b(21019, 0, 0, Integer.valueOf(i), str, str2, 0);
    }

    /* renamed from: c */
    public static void m96893c(String str, Object obj) {
        if (obj != null && !m96891a(obj)) {
            try {
                Set<Object> set = f233754c;
                if (!((HashSet) set).contains(obj)) {
                    synchronized (set) {
                        if (!((HashSet) set).contains(obj)) {
                            try {
                                Lock lock = f233758g;
                                lock.lock();
                                ((HashSet) set).add(obj);
                                lock.unlock();
                            } catch (Throwable th) {
                                f233758g.unlock();
                                throw th;
                            }
                        }
                    }
                }
            } catch (Throwable th4) {
                Log.printErrStackTrace("MicroMsg.MissingMessageListenerReporter", th4, "fail to call reportMissingINewXmlReceived(%s,%s)", str, obj);
            }
        }
    }

    /* renamed from: d */
    public static void m96894d(String str, Object obj) {
        if (obj != null && !m96891a(obj)) {
            try {
                Set<Object> set = f233755d;
                if (!((HashSet) set).contains(obj)) {
                    synchronized (set) {
                        if (!((HashSet) set).contains(obj)) {
                            ((HashSet) set).add(obj);
                        }
                    }
                }
            } catch (Throwable th) {
                Log.printErrStackTrace("MicroMsg.MissingMessageListenerReporter", th, "fail to call reportMissingISysCmdMsgNewXmlListener(%s,%s)", str, obj);
            }
        }
    }
}
