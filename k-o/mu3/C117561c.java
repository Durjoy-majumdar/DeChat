package mu3;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Printer;
import fu3.C116901a;
import java.util.Objects;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicBoolean;
import lu3.C109426i;
import lu3.C117478d;
import mu3.C117573d;
import ou3.C89298b;
import zt3.C119146d;
import zt3.C119157j;

/* renamed from: mu3.c */
public class C117561c implements C116901a {
    private static final String TAG = "SerialHandler";
    private final Handler.Callback callback;
    private boolean hasDefaultLooper;
    /* access modifiers changed from: private */
    public boolean isLogging;
    /* access modifiers changed from: private */
    public AtomicBoolean isQuit;
    /* access modifiers changed from: private */
    public final Handler proxyHandler;
    private C89298b recycleMethod;
    private final C109639a serial;
    /* access modifiers changed from: private */
    public final String serialTag;

    /* renamed from: mu3.c$a */
    public class C117562a implements Runnable {
        public C117562a() {
        }

        public void run() {
            C117561c.this.quit();
        }
    }

    /* renamed from: mu3.c$b */
    public class C117563b extends Handler {
        public C117563b(Looper looper) {
            super(looper);
        }

        public void dispatchMessage(Message message) {
            C117561c.this.dispatchMessage(message);
        }

        public void handleMessage(Message message) {
            C117561c.this.handleMessage(message);
        }

        public boolean sendMessageAtTime(Message message, long j) {
            message.setTarget(C117561c.this.proxyHandler);
            return C117561c.this.sendMessageAtTime(message, j);
        }

        public String toString() {
            return C117561c.this.toString();
        }
    }

    /* renamed from: mu3.c$c */
    public class C117564c implements C117573d.C117575b {

        /* renamed from: a */
        public final /* synthetic */ Runnable f351705a;

        public C117564c(Runnable runnable) {
            this.f351705a = runnable;
        }

        /* renamed from: a */
        public boolean mo182304a(C117577e eVar) {
            Object obj = eVar.f351578o;
            boolean z = false;
            if (obj instanceof C117572k) {
                C117572k kVar = (C117572k) obj;
                if (kVar.f351725g == C117561c.this && kVar.f351723e.getCallback() == this.f351705a) {
                    z = true;
                }
                if (z) {
                    kVar.mo182306a();
                }
            }
            return z;
        }
    }

    /* renamed from: mu3.c$d */
    public class C117565d implements C117573d.C117575b {

        /* renamed from: a */
        public final /* synthetic */ Runnable f351707a;

        /* renamed from: b */
        public final /* synthetic */ Object f351708b;

        public C117565d(Runnable runnable, Object obj) {
            this.f351707a = runnable;
            this.f351708b = obj;
        }

        /* renamed from: a */
        public boolean mo182304a(C117577e eVar) {
            Object obj = eVar.f351578o;
            boolean z = false;
            if (obj instanceof C117572k) {
                C117572k kVar = (C117572k) obj;
                if (kVar.f351725g == C117561c.this && kVar.f351723e.getCallback() == this.f351707a && kVar.f351723e.obj == this.f351708b) {
                    z = true;
                }
                if (z) {
                    kVar.mo182306a();
                }
            }
            return z;
        }
    }

    /* renamed from: mu3.c$e */
    public class C117566e implements C117573d.C117575b {

        /* renamed from: a */
        public final /* synthetic */ int f351710a;

        public C117566e(int i) {
            this.f351710a = i;
        }

        /* renamed from: a */
        public boolean mo182304a(C117577e eVar) {
            Object obj = eVar.f351578o;
            boolean z = false;
            if (obj instanceof C117572k) {
                C117572k kVar = (C117572k) obj;
                if (kVar.f351725g == C117561c.this && kVar.f351723e.what == this.f351710a) {
                    z = true;
                }
                if (z) {
                    kVar.mo182306a();
                }
            }
            return z;
        }
    }

    /* renamed from: mu3.c$f */
    public class C117567f implements C117573d.C117575b {

        /* renamed from: a */
        public final /* synthetic */ int f351712a;

        /* renamed from: b */
        public final /* synthetic */ Object f351713b;

        public C117567f(int i, Object obj) {
            this.f351712a = i;
            this.f351713b = obj;
        }

        /* renamed from: a */
        public boolean mo182304a(C117577e eVar) {
            Object obj = eVar.f351578o;
            boolean z = false;
            if (obj instanceof C117572k) {
                C117572k kVar = (C117572k) obj;
                if (kVar.f351725g == C117561c.this) {
                    Message message = kVar.f351723e;
                    if (message.what == this.f351712a && message.obj == this.f351713b) {
                        z = true;
                    }
                }
                if (z) {
                    kVar.mo182306a();
                }
            }
            return z;
        }
    }

    /* renamed from: mu3.c$g */
    public class C117568g implements C117573d.C117575b {

        /* renamed from: a */
        public final /* synthetic */ Object f351715a;

        public C117568g(Object obj) {
            this.f351715a = obj;
        }

        /* renamed from: a */
        public boolean mo182304a(C117577e eVar) {
            Object obj;
            Object obj2 = eVar.f351578o;
            boolean z = false;
            if (obj2 instanceof C117572k) {
                C117572k kVar = (C117572k) obj2;
                if (kVar.f351725g == C117561c.this && ((obj = this.f351715a) == null || kVar.f351723e.obj == obj)) {
                    z = true;
                }
                if (z) {
                    kVar.mo182306a();
                }
            }
            return z;
        }
    }

    /* renamed from: mu3.c$h */
    public class C117569h implements C117573d.C117574a {

        /* renamed from: a */
        public final /* synthetic */ int f351717a;

        public C117569h(int i) {
            this.f351717a = i;
        }

        /* renamed from: a */
        public boolean mo182305a(C117577e eVar) {
            Object obj = eVar.f351578o;
            if (!(obj instanceof C117572k)) {
                return false;
            }
            C117572k kVar = (C117572k) obj;
            return kVar.f351725g == C117561c.this && kVar.f351723e.what == this.f351717a;
        }
    }

    /* renamed from: mu3.c$i */
    public class C117570i implements C117573d.C117574a {

        /* renamed from: a */
        public final /* synthetic */ Object f351719a;

        public C117570i(Object obj) {
            this.f351719a = obj;
        }

        /* renamed from: a */
        public boolean mo182305a(C117577e eVar) {
            Object obj = eVar.f351578o;
            if (!(obj instanceof C117572k)) {
                return false;
            }
            C117572k kVar = (C117572k) obj;
            return kVar.f351725g == C117561c.this && kVar.f351723e.obj == this.f351719a;
        }
    }

    /* renamed from: mu3.c$j */
    public class C117571j implements C117573d.C117575b {
        public C117571j() {
        }

        /* renamed from: a */
        public boolean mo182304a(C117577e eVar) {
            Object obj = eVar.f351578o;
            boolean z = false;
            if (obj instanceof C117572k) {
                C117572k kVar = (C117572k) obj;
                if (kVar.f351725g == C117561c.this) {
                    z = true;
                }
                if (z) {
                    kVar.mo182306a();
                }
            }
            return z;
        }
    }

    /* renamed from: mu3.c$k */
    public class C117572k implements C109426i, C117478d {

        /* renamed from: d */
        public Future<?> f351722d;

        /* renamed from: e */
        public Message f351723e;

        /* renamed from: f */
        public String f351724f;

        /* renamed from: g */
        public Object f351725g;

        public C117572k(Message message) {
            if (message != null) {
                this.f351723e = message;
                this.f351724f = C117561c.this.serialTag + "#" + C117561c.this.getMessageName(message);
                this.f351725g = C117561c.this;
                return;
            }
            throw new NullPointerException("msg is null");
        }

        /* renamed from: a */
        public boolean mo182306a() {
            C117561c.this.recycleMessage(this.f351723e);
            return this.f351722d.cancel(false);
        }

        /* renamed from: g */
        public void mo121152g(Future future) {
            this.f351722d = future;
        }

        public String getKey() {
            return this.f351724f;
        }

        public boolean isLogging() {
            return C117561c.this.isLogging;
        }

        public void run() {
            if (C117561c.this.isQuit.get()) {
                this.f351722d.cancel(false);
                C119146d.f356851c.mo125766w(C117561c.TAG, String.format("this handler has quit! %s", new Object[]{this.f351724f}), new Object[0]);
                return;
            }
            if (this.f351723e.getTarget() == null) {
                Message message = this.f351723e;
                if (message.obj == null && message.what == 0) {
                    this.f351722d.cancel(false);
                    C119146d.f356851c.mo125766w(C117561c.TAG, String.format("maybe it's removed before! %s", new Object[]{this.f351724f}), new Object[0]);
                    return;
                }
            }
            Handler target = this.f351723e.getTarget();
            Objects.requireNonNull(target, "target is null!");
            Handler handler = target;
            target.dispatchMessage(this.f351723e);
            C117561c.this.recycleMessage(this.f351723e);
        }
    }

    public C117561c(C109639a aVar) {
        this(aVar, (Handler.Callback) null);
    }

    private void cancelAll() {
        this.serial.f328238b.mo182314g(new C117571j());
    }

    public static C117561c create(String str) {
        return new C117561c(str);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0011, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0017, code lost:
        throw new java.lang.RuntimeException(r4);
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void recycleMessage(android.os.Message r4) {
        /*
            r3 = this;
            if (r4 != 0) goto L_0x0003
            return
        L_0x0003:
            ou3.b r0 = r3.recycleMethod     // Catch:{ Exception -> 0x0011 }
            r1 = 0
            java.lang.Object[] r2 = new java.lang.Object[r1]     // Catch:{ Exception -> 0x0011 }
            monitor-enter(r0)     // Catch:{ Exception -> 0x0011 }
            r0.mo123642a(r4, r1, r2)     // Catch:{ all -> 0x000e }
            monitor-exit(r0)     // Catch:{ Exception -> 0x0011 }
            return
        L_0x000e:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ Exception -> 0x0011 }
            throw r4     // Catch:{ Exception -> 0x0011 }
        L_0x0011:
            r4 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: mu3.C117561c.recycleMessage(android.os.Message):void");
    }

    public C117572k createRunnable(Message message) {
        return new C117572k(message);
    }

    public void dispatchMessage(Message message) {
        if (message.getCallback() != null) {
            message.getCallback().run();
            return;
        }
        Handler.Callback callback2 = this.callback;
        if (callback2 == null || !callback2.handleMessage(message)) {
            handleMessage(message);
        }
    }

    public void dump(Printer printer, String str) {
        printer.println(str + this.serial.f328238b.mo182310c().toString());
    }

    public boolean executeOrSendMessage(Message message) {
        if (C109639a.m148953d() != this.serial) {
            return sendMessage(message);
        }
        dispatchMessage(message);
        return true;
    }

    public Looper getLooper() {
        return null;
    }

    public String getMessageName(Message message) {
        return this.proxyHandler.getMessageName(message);
    }

    public Handler getSelf() {
        return null;
    }

    public C109639a getSerial() {
        return this.serial;
    }

    public String getSerialTag() {
        return this.serialTag;
    }

    public void handleMessage(Message message) {
    }

    public boolean hasMessages(int i) {
        return this.serial.f328238b.mo182309b(new C117569h(i));
    }

    public boolean isQuit() {
        return this.isQuit.get();
    }

    public Message obtainMessage() {
        return this.proxyHandler.obtainMessage();
    }

    public boolean post(Runnable runnable) {
        return this.proxyHandler.post(runnable);
    }

    public boolean postAtFrontOfQueue(Runnable runnable) {
        Handler handler = this.proxyHandler;
        return handler.sendMessageAtTime(Message.obtain(handler, runnable), Long.MIN_VALUE);
    }

    public boolean postAtTime(Runnable runnable, long j) {
        return this.proxyHandler.postAtTime(runnable, j);
    }

    public boolean postDelayed(Runnable runnable, long j) {
        return this.proxyHandler.postDelayed(runnable, j);
    }

    public boolean quit() {
        if (!this.isQuit.compareAndSet(false, true)) {
            return false;
        }
        cancelAll();
        return true;
    }

    public boolean quitSafely() {
        post(new C117562a());
        return true;
    }

    public void removeCallbacks(Runnable runnable) {
        this.serial.f328238b.mo182314g(new C117564c(runnable));
    }

    public void removeCallbacksAndMessages(Object obj) {
        this.serial.f328238b.mo182314g(new C117568g(obj));
    }

    public void removeMessages(int i) {
        this.serial.f328238b.mo182314g(new C117566e(i));
    }

    public boolean sendEmptyMessage(int i) {
        return this.proxyHandler.sendEmptyMessage(i);
    }

    public boolean sendEmptyMessageAtTime(int i, long j) {
        return this.proxyHandler.sendEmptyMessageAtTime(i, j);
    }

    public boolean sendEmptyMessageDelayed(int i, long j) {
        return this.proxyHandler.sendEmptyMessageDelayed(i, j);
    }

    public boolean sendMessage(Message message) {
        return this.proxyHandler.sendMessage(message);
    }

    public boolean sendMessageAtFrontOfQueue(Message message) {
        return this.proxyHandler.sendMessageAtTime(message, Long.MIN_VALUE);
    }

    public boolean sendMessageAtTime(Message message, long j) {
        C117572k createRunnable = createRunnable(message);
        if (isQuit()) {
            C119146d.f356849a.mo174286d(createRunnable.f351724f, 0, this.serialTag, true);
            return false;
        } else if (((C119157j) C119157j.f356862d).f356864a.get()) {
            C119146d.f356849a.mo174286d(createRunnable.f351724f, 0, this.serialTag, true);
            return false;
        } else {
            if (j != Long.MIN_VALUE) {
                long uptimeMillis = j - SystemClock.uptimeMillis();
                if (C109639a.m148951b() == this.serial) {
                    ((C119157j) C119157j.f356862d).mo183869C(createRunnable, uptimeMillis);
                } else {
                    ((C119157j) C119157j.f356862d).mo183879j(createRunnable, uptimeMillis, this.serialTag);
                }
            } else if (C109639a.m148951b() == this.serial) {
                ((C119157j) C119157j.f356862d).mo183868B(createRunnable);
            } else {
                ((C119157j) C119157j.f356862d).mo183877h(createRunnable, this.serialTag);
            }
            return true;
        }
    }

    public boolean sendMessageDelayed(Message message, long j) {
        return this.proxyHandler.sendMessageDelayed(message, j);
    }

    public void setHasDefaultLooper(boolean z) {
        this.hasDefaultLooper = z;
    }

    public void setLogging(boolean z) {
        this.isLogging = z;
    }

    public String toString() {
        return String.format("SerialHandler(%s) %s", new Object[]{getSerialTag(), getClass().getName()});
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0044, code lost:
        r7 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x004a, code lost:
        throw new java.lang.RuntimeException(r7);
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C117561c(mu3.C109639a r7, android.os.Handler.Callback r8) {
        /*
            r6 = this;
            r6.<init>()
            r0 = 1
            r6.isLogging = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r0.<init>()
            r6.isQuit = r0
            mu3.c$b r0 = new mu3.c$b
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>(r1)
            r6.proxyHandler = r0
            ou3.b r1 = new ou3.b
            java.lang.Class<android.os.Message> r2 = android.os.Message.class
            java.lang.String r3 = "recycleUnchecked"
            r4 = 0
            java.lang.Class[] r5 = new java.lang.Class[r4]
            r1.<init>(r2, r3, r5)
            r6.recycleMethod = r1
            java.util.Objects.requireNonNull(r7)
            r6.serial = r7
            java.lang.String r7 = r7.f328237a
            r6.serialTag = r7
            r6.callback = r8
            java.lang.Class<android.os.Handler> r7 = android.os.Handler.class
            java.lang.String r8 = "mLooper"
            r1 = 0
            ou3.a r2 = new ou3.a     // Catch:{ Exception -> 0x0044 }
            r2.<init>(r7, r8)     // Catch:{ Exception -> 0x0044 }
            monitor-enter(r2)     // Catch:{ Exception -> 0x0044 }
            r2.mo123641c(r0, r1, r4)     // Catch:{ all -> 0x0041 }
            monitor-exit(r2)     // Catch:{ Exception -> 0x0044 }
            return
        L_0x0041:
            r7 = move-exception
            monitor-exit(r2)     // Catch:{ Exception -> 0x0044 }
            throw r7     // Catch:{ Exception -> 0x0044 }
        L_0x0044:
            r7 = move-exception
            java.lang.RuntimeException r8 = new java.lang.RuntimeException
            r8.<init>(r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: mu3.C117561c.<init>(mu3.a, android.os.Handler$Callback):void");
    }

    public Message obtainMessage(int i) {
        return this.proxyHandler.obtainMessage(i);
    }

    public boolean postAtTime(Runnable runnable, Object obj, long j) {
        return this.proxyHandler.postAtTime(runnable, obj, j);
    }

    public boolean postDelayed(Runnable runnable, Object obj, long j) {
        Message obtain = Message.obtain(this.proxyHandler, runnable);
        obtain.obj = obj;
        return sendMessageDelayed(obtain, j);
    }

    public Message obtainMessage(int i, Object obj) {
        return this.proxyHandler.obtainMessage(i, obj);
    }

    public boolean hasMessages(int i, Object obj) {
        return this.serial.f328238b.mo182309b(new C117570i(obj));
    }

    public Message obtainMessage(int i, int i2, int i3) {
        return this.proxyHandler.obtainMessage(i, i2, i3);
    }

    public void removeCallbacks(Runnable runnable, Object obj) {
        this.serial.f328238b.mo182314g(new C117565d(runnable, obj));
    }

    public void removeMessages(int i, Object obj) {
        this.serial.f328238b.mo182314g(new C117567f(i, obj));
    }

    public Message obtainMessage(int i, int i2, int i3, Object obj) {
        return this.proxyHandler.obtainMessage(i, i2, i3, obj);
    }

    public C117561c(String str) {
        this(C109639a.m148950a(str), (Handler.Callback) null);
    }

    public C117561c(String str, Handler.Callback callback2) {
        this(C109639a.m148950a(str), callback2);
    }
}
