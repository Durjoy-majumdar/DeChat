package yc2;

import android.content.Context;
import android.graphics.Region;
import android.os.Binder;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Message;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.LruCache;
import android.util.SparseArray;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.rtmp.TXLiveConstants;
import java.io.FileDescriptor;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import yc2.C118980l;

/* renamed from: yc2.e */
public final class C118965e {

    /* renamed from: A */
    public static final String f356352A = C118978g.m167742b("¬ßºÎáëªÉªÏ¼Ï¦Ä­Á¨Ü¥ëàÌ¢Ä«Øïéñ");

    /* renamed from: B */
    public static final String f356353B = C118978g.m167742b("îøÜ¹Ë­Â°Ýÿùùò÷êÒ±Å¬Ã­ÿéð");

    /* renamed from: g */
    public static final ClassLoader f356354g = C118965e.class.getClassLoader();

    /* renamed from: h */
    public static final String f356355h = C118978g.m167742b("\u001f~\u0010t\u0006i\u0000dJ<U0Gi\bk\bm\u001em\u0004f\u000fc\n~\u0007)`!B!D7D-O&J#W.c\u0002l\rj\u000f}Y\n~\u000bi");

    /* renamed from: i */
    public static final String f356356i = C118978g.m167742b("\u0011p\u001ez\bg\u000ejD+Xv%@2D-N+f\u0007i\bo\nx");

    /* renamed from: j */
    public static final String f356357j = C118978g.m167742b("\u0007t7V5]8");

    /* renamed from: k */
    public static final String f356358k = C118978g.m167742b("\u0017v\u0005L\"V3A'F%@");

    /* renamed from: l */
    public static final String f356359l = C118978g.m167742b("\ng$E)E'F%N");

    /* renamed from: m */
    public static final String f356360m = C118978g.m167742b("\u000ec5\\9N\u001cs\u001ch!L<P");

    /* renamed from: n */
    public static final String f356361n = C118978g.m167742b("Ñ°ÞºÈ§Îªòþ§Æ¥Æ£Ð£Ê¨Á­Ä°Éç®ïïùãèíà©Ç³Ö¤Å¦Ò»Ôºùøóäâ");

    /* renamed from: o */
    public static final String f356362o = C118978g.m167742b("Ù¸Ü¸ùùïõþûö¿Ñ¥À²Ó°Ä­Â¬ïîåòô");

    /* renamed from: p */
    public static final String f356363p = C118978g.m167742b("éëÞ½Þ»È»Ò°ÙµÜ¨ÑöçôãåÈ§É½Ï Ì Å·");

    /* renamed from: q */
    public static final String f356364q = C118978g.m167742b("\u001ak\u001e{\tp<S0Q=t\u001an\u000by\u001f~\u001dx");

    /* renamed from: r */
    public static final String f356365r = C118978g.m167742b("?Y0^:l\u0005`\u0017U,m\u000em\b{\ba\u0003j\u0006o\u001bb+O");

    /* renamed from: s */
    public static final String f356366s = C118978g.m167742b("+M$J.o\fo\ny\nc\u0001h\u0004m\u0019`.A%@\tg\u0001n,U\u0014w\u0014q\u0002q\u0018z\u0013\u0016b\u001bR6");

    /* renamed from: t */
    public static final String f356367t = C118978g.m167742b("!G.@$e\u0006e\u0000s\u0000i\u000bb\u000eg\u0013j$K/J\u0003m\u000bd&_\t`\u0005r;_");

    /* renamed from: u */
    public static final String f356368u = C118978g.m167742b("÷ðÕ¶Õ°Ã°Ù»Ò¾×£Úûú³Ý»Ô§åÊ£Æ±ø");

    /* renamed from: v */
    public static final String f356369v = C118978g.m167742b("±×¾Ð´õõãùò÷ú´Û¿ÚýôÅ¼èõ");

    /* renamed from: w */
    public static final String f356370w = C118978g.m167742b("\rk\u0002l\bN!B7D");

    /* renamed from: x */
    public static final String f356371x = C118978g.m167742b("\"D+H=N\u001dx\u0019k\b`");

    /* renamed from: y */
    public static final String f356372y = C118978g.m167742b("m\u001dx\nl\u0003q\u001c]>]8K8Q3Z6_+R\u0013p\u0004m\u0002l");

    /* renamed from: z */
    public static final String f356373z = C118978g.m167742b("Ì¿Ú®èïÊ©Ê¯Ü¯Æ¤Í¡È¼Åäå¬Â¤Ëüúâ");

    /* renamed from: a */
    public final Queue<C118974g> f356374a = new ConcurrentLinkedQueue();

    /* renamed from: b */
    public final Map<Object, IBinder> f356375b = new WeakHashMap();

    /* renamed from: c */
    public final Map<IBinder, Integer> f356376c = new ConcurrentHashMap();

    /* renamed from: d */
    public final Handler f356377d = new Handler(Looper.getMainLooper());

    /* renamed from: e */
    public IInterface f356378e = null;

    /* renamed from: f */
    public volatile boolean f356379f = false;

    /* renamed from: yc2.e$a */
    public final class C118966a extends C118971d {

        /* renamed from: f */
        public C118976i f356380f = null;

        /* renamed from: g */
        public WeakReference<Object> f356381g = null;

        public C118966a(Object obj, IBinder iBinder) {
            super(iBinder);
            try {
                this.f356381g = new WeakReference<>(obj);
                String str = C118965e.f356361n + "$Stub";
                LruCache<String, LruCache<String, Field>> lruCache = C118980l.f356403a;
                this.f356380f = new C118976i(Class.forName(str));
            } catch (Throwable th) {
                C118965e.m167731d(C118965e.this, th);
            }
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            C118976i.C118977a<String> aVar;
            int i3 = i;
            Parcel parcel3 = parcel;
            if (i3 < 1 || i3 > 16777215) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            if (this.f356380f == null) {
                Log.m105920e("MicroMsg.AED", "init failed, give up intercepting.");
                return super.onTransact(i, parcel, parcel2, i2);
            } else if (this.f356381g.get() == null) {
                Log.m105920e("MicroMsg.AED", "lost viewRootImpl instance, give up intercepting.");
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                C118976i iVar = this.f356380f;
                synchronized (iVar) {
                    aVar = iVar.f356398e;
                    if (aVar == null) {
                        iVar.f356398e = new C118976i.C118977a<>(iVar, (C118962b) null);
                        try {
                            IInterface iInterface = (IInterface) C118980l.m167744b(iVar.f356397d, "asInterface", new Class[]{IBinder.class}, iVar);
                            for (Class cls : iVar.f356397d.getInterfaces()) {
                                if (IInterface.class.isAssignableFrom(cls)) {
                                    for (Method method : cls.getDeclaredMethods()) {
                                        if (!"asBinder".equals(method.getName())) {
                                            iVar.f356399f = method.getName();
                                            if (!method.isAccessible()) {
                                                method.setAccessible(true);
                                            }
                                            method.invoke(iInterface, iVar.mo183668a(method.getParameterTypes()));
                                        }
                                    }
                                }
                            }
                            aVar = iVar.f356398e;
                        } catch (Throwable th) {
                            Log.printErrStackTrace("MicroMsg.AED", th, "unexpected exception.", new Object[0]);
                            C118965e.m167731d(C118965e.this, th);
                            iVar.f356398e.clear();
                            throw null;
                        }
                    }
                }
                String str = (String) aVar.get(i3);
                try {
                    parcel3.enforceInterface(C118965e.f356361n);
                    if (C118965e.f356366s.equals(str)) {
                        parcel.readLong();
                        if (parcel.readInt() != 0) {
                            Region.CREATOR.createFromParcel(parcel3);
                        }
                        parcel.readInt();
                        IBinder readStrongBinder = parcel.readStrongBinder();
                        parcel.readInt();
                        ((ConcurrentHashMap) C118965e.this.f356376c).put(readStrongBinder, Integer.valueOf(parcel.readInt()));
                    } else if (C118965e.f356367t.equals(str)) {
                        parcel.readLong();
                        parcel.readInt();
                        parcel.readInt();
                        IBinder readStrongBinder2 = parcel.readStrongBinder();
                        parcel.readInt();
                        ((ConcurrentHashMap) C118965e.this.f356376c).put(readStrongBinder2, Integer.valueOf(parcel.readInt()));
                    } else if (C118965e.f356368u.equals(str)) {
                        parcel.readLong();
                        parcel.readString();
                        if (parcel.readInt() != 0) {
                            Region.CREATOR.createFromParcel(parcel3);
                        }
                        parcel.readInt();
                        IBinder readStrongBinder3 = parcel.readStrongBinder();
                        parcel.readInt();
                        ((ConcurrentHashMap) C118965e.this.f356376c).put(readStrongBinder3, Integer.valueOf(parcel.readInt()));
                    } else if (C118965e.f356369v.equals(str)) {
                        parcel.readLong();
                        parcel.readString();
                        if (parcel.readInt() != 0) {
                            Region.CREATOR.createFromParcel(parcel3);
                        }
                        parcel.readInt();
                        IBinder readStrongBinder4 = parcel.readStrongBinder();
                        parcel.readInt();
                        ((ConcurrentHashMap) C118965e.this.f356376c).put(readStrongBinder4, Integer.valueOf(parcel.readInt()));
                    } else if (C118965e.f356370w.equals(str)) {
                        parcel.readLong();
                        parcel.readInt();
                        if (parcel.readInt() != 0) {
                            Region.CREATOR.createFromParcel(parcel3);
                        }
                        parcel.readInt();
                        IBinder readStrongBinder5 = parcel.readStrongBinder();
                        parcel.readInt();
                        ((ConcurrentHashMap) C118965e.this.f356376c).put(readStrongBinder5, Integer.valueOf(parcel.readInt()));
                    } else if (C118965e.f356371x.equals(str)) {
                        parcel.readLong();
                        parcel.readInt();
                        if (parcel.readInt() != 0) {
                            Region.CREATOR.createFromParcel(parcel3);
                        }
                        parcel.readInt();
                        IBinder readStrongBinder6 = parcel.readStrongBinder();
                        parcel.readInt();
                        ((ConcurrentHashMap) C118965e.this.f356376c).put(readStrongBinder6, Integer.valueOf(parcel.readInt()));
                    } else if (C118965e.f356372y.equals(str)) {
                        parcel.readLong();
                        parcel.readInt();
                        if (parcel.readInt() != 0) {
                            Bundle.CREATOR.createFromParcel(parcel3);
                        }
                        parcel.readInt();
                        IBinder readStrongBinder7 = parcel.readStrongBinder();
                        parcel.readInt();
                        ((ConcurrentHashMap) C118965e.this.f356376c).put(readStrongBinder7, Integer.valueOf(parcel.readInt()));
                    }
                } catch (Throwable th4) {
                    Log.printErrStackTrace("MicroMsg.AED", th4, "unexpected exception.", new Object[0]);
                    C118965e.m167731d(C118965e.this, th4);
                }
                return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* renamed from: yc2.e$b */
    public final class C118967b implements Handler.Callback {

        /* renamed from: d */
        public final WeakReference<Object> f356383d;

        /* renamed from: e */
        public final Handler.Callback f356384e;

        /* renamed from: yc2.e$b$a */
        public class C118968a extends C118972e {

            /* renamed from: c */
            public final /* synthetic */ Integer f356386c;

            /* renamed from: d */
            public final /* synthetic */ View f356387d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C118968a(IInterface iInterface, Integer num, View view) {
                super(iInterface);
                this.f356386c = num;
                this.f356387d = view;
            }

            public Object invoke(Object obj, Method method, Object[] objArr) {
                String name = method.getName();
                if (C118965e.f356373z.equals(name)) {
                    ArrayList arrayList = new ArrayList();
                    AccessibilityNodeInfo accessibilityNodeInfo = objArr[0];
                    if (accessibilityNodeInfo != null) {
                        arrayList.add(accessibilityNodeInfo);
                    }
                    C118965e.m167730c(C118965e.this, this.f356386c.intValue(), this.f356387d, arrayList);
                    if (arrayList.isEmpty()) {
                        objArr[0] = null;
                    } else {
                        objArr[0] = arrayList.get(0);
                    }
                } else if (C118965e.f356352A.equals(name)) {
                    List list = objArr[0];
                    if (list == null) {
                        list = new ArrayList();
                    }
                    C118965e.m167730c(C118965e.this, this.f356386c.intValue(), this.f356387d, list);
                }
                return super.invoke(obj, method, objArr);
            }
        }

        public C118967b(Object obj, Handler.Callback callback) {
            this.f356383d = new WeakReference<>(obj);
            this.f356384e = callback;
        }

        /* renamed from: a */
        public final boolean mo183654a(Message message) {
            Handler.Callback callback = this.f356384e;
            if (callback != null) {
                return callback.handleMessage(message);
            }
            return false;
        }

        /* renamed from: b */
        public final int mo183655b(Message message) {
            int i = message.what;
            switch (i) {
                case 1:
                case 2:
                case 4:
                case 6:
                    break;
                case 3:
                case 5:
                    return ((Integer) C118980l.m167747e(message.obj, "argi1")).intValue();
                default:
                    switch (i) {
                        case 1020:
                            break;
                        case 1021:
                        case TXLiveConstants.PUSH_EVT_ROOM_IN_FAILED:
                            return message.arg2;
                        case 1023:
                            return ((Integer) C118980l.m167747e(message.obj, "argi2")).intValue();
                        default:
                            return 0;
                    }
            }
            return ((Integer) C118980l.m167747e(message.obj, "argi3")).intValue();
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v11, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v5, resolved type: android.view.View} */
        /* JADX WARNING: Can't fix incorrect switch cases order */
        /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
            r2 = (android.os.IInterface) yc2.C118980l.m167747e(r14.obj, "arg2");
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x0049, code lost:
            r2 = (android.os.IInterface) yc2.C118980l.m167747e(r14.obj, "arg1");
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x0052, code lost:
            if (r2 != null) goto L_0x0068;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x0054, code lost:
            com.tencent.p014mm.sdk.platformtools.Log.m105929w("MicroMsg.AED", "callback is null, give up intercepting, op: %s", java.lang.Integer.valueOf(r14.what));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:22:0x0067, code lost:
            return mo183654a(r14);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:0x0070, code lost:
            if (java.lang.reflect.Proxy.isProxyClass(r2.getClass()) == false) goto L_0x0085;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:26:0x0078, code lost:
            if ((java.lang.reflect.Proxy.getInvocationHandler(r2) instanceof yc2.C118965e.C118972e) == false) goto L_0x0085;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:27:0x007a, code lost:
            com.tencent.p014mm.sdk.platformtools.Log.m105928w("MicroMsg.AED", "reused callback, skip rest works.");
         */
        /* JADX WARNING: Code restructure failed: missing block: B:28:0x0084, code lost:
            return mo183654a(r14);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:29:0x0085, code lost:
            r8 = r14.what;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:31:0x008b, code lost:
            switch(r8) {
                case 1: goto L_0x009f;
                case 2: goto L_0x009f;
                case 3: goto L_0x009f;
                case 4: goto L_0x009f;
                case 5: goto L_0x009f;
                case 6: goto L_0x009f;
                default: goto L_0x008e;
            };
         */
        /* JADX WARNING: Code restructure failed: missing block: B:32:0x008e, code lost:
            switch(r8) {
                case 1020: goto L_0x009f;
                case 1021: goto L_0x009f;
                case com.tencent.rtmp.TXLiveConstants.PUSH_EVT_ROOM_IN_FAILED :int: goto L_0x0092;
                case 1023: goto L_0x009f;
                default: goto L_0x0091;
            };
         */
        /* JADX WARNING: Code restructure failed: missing block: B:34:0x0094, code lost:
            if (r8 != 1022) goto L_0x0099;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:36:?, code lost:
            r5 = r14.arg1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:37:0x0099, code lost:
            r5 = 0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:38:0x009a, code lost:
            r5 = r0.findViewById(r5);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:39:0x009f, code lost:
            if (r8 == 1020) goto L_0x00c1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:41:0x00a3, code lost:
            if (r8 == 1021) goto L_0x00be;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:43:0x00a7, code lost:
            if (r8 == 1023) goto L_0x00c1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:44:0x00a9, code lost:
            switch(r8) {
                case 1: goto L_0x00bb;
                case 2: goto L_0x00c1;
                case 3: goto L_0x00bb;
                case 4: goto L_0x00c1;
                case 5: goto L_0x00ae;
                case 6: goto L_0x00bb;
                default: goto L_0x00ac;
            };
         */
        /* JADX WARNING: Code restructure failed: missing block: B:45:0x00ac, code lost:
            r5 = 0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:46:0x00ae, code lost:
            r5 = ((java.lang.Integer) yc2.C118980l.m167747e(r14.obj, "argi2")).intValue();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:47:0x00bb, code lost:
            r5 = r14.arg2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:48:0x00be, code lost:
            r5 = r14.arg1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:49:0x00c1, code lost:
            r5 = ((java.lang.Integer) yc2.C118980l.m167747e(r14.obj, "argi1")).intValue();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:50:0x00cf, code lost:
            r5 = yc2.C118980l.m167743a(r0, yc2.C118965e.f356365r, new java.lang.Class[]{java.lang.Integer.TYPE}, java.lang.Integer.valueOf(r5));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:51:0x00e6, code lost:
            r0 = mo183655b(r14);
            r8 = (java.lang.Integer) ((java.util.concurrent.ConcurrentHashMap) r13.f356385f.f356376c).remove(r2.asBinder());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:52:0x00fa, code lost:
            if (r8 != null) goto L_0x0112;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:53:0x00fc, code lost:
            com.tencent.p014mm.sdk.platformtools.Log.m105929w("MicroMsg.AED", "callback %s's binder is unmarked, give up intercept.", r2.getClass().getName());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:54:0x0111, code lost:
            return mo183654a(r14);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:55:0x0112, code lost:
            r1 = r14.what;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:56:0x0114, code lost:
            switch(r1) {
                case 1: goto L_0x0148;
                case 2: goto L_0x011b;
                case 3: goto L_0x011b;
                case 4: goto L_0x011b;
                case 5: goto L_0x011b;
                case 6: goto L_0x011b;
                default: goto L_0x0117;
            };
         */
        /* JADX WARNING: Code restructure failed: missing block: B:57:0x0117, code lost:
            switch(r1) {
                case 1020: goto L_0x0148;
                case 1021: goto L_0x011b;
                case com.tencent.rtmp.TXLiveConstants.PUSH_EVT_ROOM_IN_FAILED :int: goto L_0x011b;
                case 1023: goto L_0x011b;
                default: goto L_0x011a;
            };
         */
        /* JADX WARNING: Code restructure failed: missing block: B:59:0x011b, code lost:
            r0 = (android.os.IInterface) java.lang.reflect.Proxy.newProxyInstance(yc2.C118965e.f356354g, r2.getClass().getInterfaces(), new yc2.C118965e.C118967b.C118968a(r13, r2, r8, r5));
            r1 = r14.what;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:60:0x0132, code lost:
            switch(r1) {
                case 1: goto L_0x0142;
                case 2: goto L_0x0142;
                case 3: goto L_0x0142;
                case 4: goto L_0x0139;
                case 5: goto L_0x0142;
                case 6: goto L_0x0142;
                default: goto L_0x0135;
            };
         */
        /* JADX WARNING: Code restructure failed: missing block: B:61:0x0135, code lost:
            switch(r1) {
                case 1020: goto L_0x0142;
                case 1021: goto L_0x013f;
                case com.tencent.rtmp.TXLiveConstants.PUSH_EVT_ROOM_IN_FAILED :int: goto L_0x013f;
                case 1023: goto L_0x0139;
                default: goto L_0x0138;
            };
         */
        /* JADX WARNING: Code restructure failed: missing block: B:63:0x0139, code lost:
            yc2.C118980l.m167748f(r14.obj, "arg2", r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:64:0x013f, code lost:
            r14.obj = r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:65:0x0142, code lost:
            yc2.C118980l.m167748f(r14.obj, "arg1", r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:66:0x0148, code lost:
            if (r1 == 1) goto L_0x014e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:67:0x014a, code lost:
            if (r1 == 1020) goto L_0x014e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:68:0x014c, code lost:
            r1 = 0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:69:0x014e, code lost:
            r1 = ((java.lang.Integer) yc2.C118980l.m167747e(r14.obj, "argi2")).intValue();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:71:0x0164, code lost:
            if (yc2.C118965e.m167729b(r13.f356385f, r1, r8.intValue(), r5) != false) goto L_0x0189;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:72:0x0166, code lost:
            yc2.C118980l.m167743a(r2, yc2.C118965e.f356353B, new java.lang.Class[]{java.lang.Boolean.TYPE, java.lang.Integer.TYPE}, java.lang.Boolean.FALSE, java.lang.Integer.valueOf(r0));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:73:0x0182, code lost:
            return true;
         */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean handleMessage(android.os.Message r14) {
            /*
                r13 = this;
                java.lang.ref.WeakReference<java.lang.Object> r0 = r13.f356383d
                java.lang.Object r0 = r0.get()
                java.lang.String r1 = "MicroMsg.AED"
                if (r0 != 0) goto L_0x0015
                java.lang.String r0 = "lost viewRootImpl instance, give up intercepting."
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r0)
                boolean r14 = r13.mo183654a(r14)
                return r14
            L_0x0015:
                java.lang.String r2 = "getView"
                r3 = 0
                java.lang.Object[] r4 = new java.lang.Object[r3]     // Catch:{ all -> 0x0183 }
                r5 = 0
                java.lang.Object r0 = yc2.C118980l.m167743a(r0, r2, r5, r4)     // Catch:{ all -> 0x0183 }
                android.view.View r0 = (android.view.View) r0     // Catch:{ all -> 0x0183 }
                if (r0 != 0) goto L_0x002d
                java.lang.String r0 = "cannot find root view, give up intercepting."
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r0)     // Catch:{ all -> 0x0183 }
                boolean r14 = r13.mo183654a(r14)     // Catch:{ all -> 0x0183 }
                return r14
            L_0x002d:
                int r2 = r14.what     // Catch:{ all -> 0x0183 }
                java.lang.String r4 = "arg2"
                java.lang.String r6 = "arg1"
                switch(r2) {
                    case 1: goto L_0x0049;
                    case 2: goto L_0x0049;
                    case 3: goto L_0x0049;
                    case 4: goto L_0x003b;
                    case 5: goto L_0x0049;
                    case 6: goto L_0x0049;
                    default: goto L_0x0036;
                }
            L_0x0036:
                switch(r2) {
                    case 1020: goto L_0x0049;
                    case 1021: goto L_0x0044;
                    case 1022: goto L_0x0044;
                    case 1023: goto L_0x003b;
                    default: goto L_0x0039;
                }
            L_0x0039:
                r2 = r5
                goto L_0x0051
            L_0x003b:
                java.lang.Object r2 = r14.obj     // Catch:{ all -> 0x0183 }
                java.lang.Object r2 = yc2.C118980l.m167747e(r2, r4)     // Catch:{ all -> 0x0183 }
                android.os.IInterface r2 = (android.os.IInterface) r2     // Catch:{ all -> 0x0183 }
                goto L_0x0051
            L_0x0044:
                java.lang.Object r2 = r14.obj     // Catch:{ all -> 0x0183 }
                android.os.IInterface r2 = (android.os.IInterface) r2     // Catch:{ all -> 0x0183 }
                goto L_0x0051
            L_0x0049:
                java.lang.Object r2 = r14.obj     // Catch:{ all -> 0x0183 }
                java.lang.Object r2 = yc2.C118980l.m167747e(r2, r6)     // Catch:{ all -> 0x0183 }
                android.os.IInterface r2 = (android.os.IInterface) r2     // Catch:{ all -> 0x0183 }
            L_0x0051:
                r7 = 1
                if (r2 != 0) goto L_0x0068
                java.lang.String r0 = "callback is null, give up intercepting, op: %s"
                java.lang.Object[] r2 = new java.lang.Object[r7]     // Catch:{ all -> 0x0183 }
                int r4 = r14.what     // Catch:{ all -> 0x0183 }
                java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x0183 }
                r2[r3] = r4     // Catch:{ all -> 0x0183 }
                com.tencent.p014mm.sdk.platformtools.Log.m105929w(r1, r0, r2)     // Catch:{ all -> 0x0183 }
                boolean r14 = r13.mo183654a(r14)     // Catch:{ all -> 0x0183 }
                return r14
            L_0x0068:
                java.lang.Class r8 = r2.getClass()     // Catch:{ all -> 0x0183 }
                boolean r8 = java.lang.reflect.Proxy.isProxyClass(r8)     // Catch:{ all -> 0x0183 }
                if (r8 == 0) goto L_0x0085
                java.lang.reflect.InvocationHandler r8 = java.lang.reflect.Proxy.getInvocationHandler(r2)     // Catch:{ all -> 0x0183 }
                boolean r8 = r8 instanceof yc2.C118965e.C118972e     // Catch:{ all -> 0x0183 }
                if (r8 == 0) goto L_0x0085
                java.lang.String r0 = "reused callback, skip rest works."
                com.tencent.p014mm.sdk.platformtools.Log.m105928w(r1, r0)     // Catch:{ all -> 0x0183 }
                boolean r14 = r13.mo183654a(r14)     // Catch:{ all -> 0x0183 }
                return r14
            L_0x0085:
                int r8 = r14.what     // Catch:{ all -> 0x0183 }
                java.lang.String r9 = "argi2"
                r10 = 1020(0x3fc, float:1.43E-42)
                switch(r8) {
                    case 1: goto L_0x009f;
                    case 2: goto L_0x009f;
                    case 3: goto L_0x009f;
                    case 4: goto L_0x009f;
                    case 5: goto L_0x009f;
                    case 6: goto L_0x009f;
                    default: goto L_0x008e;
                }
            L_0x008e:
                switch(r8) {
                    case 1020: goto L_0x009f;
                    case 1021: goto L_0x009f;
                    case 1022: goto L_0x0092;
                    case 1023: goto L_0x009f;
                    default: goto L_0x0091;
                }
            L_0x0091:
                goto L_0x00e6
            L_0x0092:
                r5 = 1022(0x3fe, float:1.432E-42)
                if (r8 != r5) goto L_0x0099
                int r5 = r14.arg1     // Catch:{ all -> 0x0183 }
                goto L_0x009a
            L_0x0099:
                r5 = 0
            L_0x009a:
                android.view.View r5 = r0.findViewById(r5)     // Catch:{ all -> 0x0183 }
                goto L_0x00e6
            L_0x009f:
                if (r8 == r10) goto L_0x00c1
                r5 = 1021(0x3fd, float:1.431E-42)
                if (r8 == r5) goto L_0x00be
                r5 = 1023(0x3ff, float:1.434E-42)
                if (r8 == r5) goto L_0x00c1
                switch(r8) {
                    case 1: goto L_0x00bb;
                    case 2: goto L_0x00c1;
                    case 3: goto L_0x00bb;
                    case 4: goto L_0x00c1;
                    case 5: goto L_0x00ae;
                    case 6: goto L_0x00bb;
                    default: goto L_0x00ac;
                }     // Catch:{ all -> 0x0183 }
            L_0x00ac:
                r5 = 0
                goto L_0x00cf
            L_0x00ae:
                java.lang.Object r5 = r14.obj     // Catch:{ all -> 0x0183 }
                java.lang.Object r5 = yc2.C118980l.m167747e(r5, r9)     // Catch:{ all -> 0x0183 }
                java.lang.Integer r5 = (java.lang.Integer) r5     // Catch:{ all -> 0x0183 }
                int r5 = r5.intValue()     // Catch:{ all -> 0x0183 }
                goto L_0x00cf
            L_0x00bb:
                int r5 = r14.arg2     // Catch:{ all -> 0x0183 }
                goto L_0x00cf
            L_0x00be:
                int r5 = r14.arg1     // Catch:{ all -> 0x0183 }
                goto L_0x00cf
            L_0x00c1:
                java.lang.Object r5 = r14.obj     // Catch:{ all -> 0x0183 }
                java.lang.String r8 = "argi1"
                java.lang.Object r5 = yc2.C118980l.m167747e(r5, r8)     // Catch:{ all -> 0x0183 }
                java.lang.Integer r5 = (java.lang.Integer) r5     // Catch:{ all -> 0x0183 }
                int r5 = r5.intValue()     // Catch:{ all -> 0x0183 }
            L_0x00cf:
                java.lang.String r8 = yc2.C118965e.f356365r     // Catch:{ all -> 0x0183 }
                java.lang.Class[] r11 = new java.lang.Class[r7]     // Catch:{ all -> 0x0183 }
                java.lang.Class r12 = java.lang.Integer.TYPE     // Catch:{ all -> 0x0183 }
                r11[r3] = r12     // Catch:{ all -> 0x0183 }
                java.lang.Object[] r12 = new java.lang.Object[r7]     // Catch:{ all -> 0x0183 }
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x0183 }
                r12[r3] = r5     // Catch:{ all -> 0x0183 }
                java.lang.Object r0 = yc2.C118980l.m167743a(r0, r8, r11, r12)     // Catch:{ all -> 0x0183 }
                r5 = r0
                android.view.View r5 = (android.view.View) r5     // Catch:{ all -> 0x0183 }
            L_0x00e6:
                int r0 = r13.mo183655b(r14)     // Catch:{ all -> 0x0183 }
                yc2.e r8 = yc2.C118965e.this     // Catch:{ all -> 0x0183 }
                java.util.Map<android.os.IBinder, java.lang.Integer> r8 = r8.f356376c     // Catch:{ all -> 0x0183 }
                android.os.IBinder r11 = r2.asBinder()     // Catch:{ all -> 0x0183 }
                java.util.concurrent.ConcurrentHashMap r8 = (java.util.concurrent.ConcurrentHashMap) r8     // Catch:{ all -> 0x0183 }
                java.lang.Object r8 = r8.remove(r11)     // Catch:{ all -> 0x0183 }
                java.lang.Integer r8 = (java.lang.Integer) r8     // Catch:{ all -> 0x0183 }
                if (r8 != 0) goto L_0x0112
                java.lang.String r0 = "callback %s's binder is unmarked, give up intercept."
                java.lang.Object[] r4 = new java.lang.Object[r7]     // Catch:{ all -> 0x0183 }
                java.lang.Class r2 = r2.getClass()     // Catch:{ all -> 0x0183 }
                java.lang.String r2 = r2.getName()     // Catch:{ all -> 0x0183 }
                r4[r3] = r2     // Catch:{ all -> 0x0183 }
                com.tencent.p014mm.sdk.platformtools.Log.m105929w(r1, r0, r4)     // Catch:{ all -> 0x0183 }
                boolean r14 = r13.mo183654a(r14)     // Catch:{ all -> 0x0183 }
                return r14
            L_0x0112:
                int r1 = r14.what     // Catch:{ all -> 0x0183 }
                switch(r1) {
                    case 1: goto L_0x0148;
                    case 2: goto L_0x011b;
                    case 3: goto L_0x011b;
                    case 4: goto L_0x011b;
                    case 5: goto L_0x011b;
                    case 6: goto L_0x011b;
                    default: goto L_0x0117;
                }     // Catch:{ all -> 0x0183 }
            L_0x0117:
                switch(r1) {
                    case 1020: goto L_0x0148;
                    case 1021: goto L_0x011b;
                    case 1022: goto L_0x011b;
                    case 1023: goto L_0x011b;
                    default: goto L_0x011a;
                }     // Catch:{ all -> 0x0183 }
            L_0x011a:
                goto L_0x0189
            L_0x011b:
                java.lang.ClassLoader r0 = yc2.C118965e.f356354g     // Catch:{ all -> 0x0183 }
                java.lang.Class r1 = r2.getClass()     // Catch:{ all -> 0x0183 }
                java.lang.Class[] r1 = r1.getInterfaces()     // Catch:{ all -> 0x0183 }
                yc2.e$b$a r3 = new yc2.e$b$a     // Catch:{ all -> 0x0183 }
                r3.<init>(r2, r8, r5)     // Catch:{ all -> 0x0183 }
                java.lang.Object r0 = java.lang.reflect.Proxy.newProxyInstance(r0, r1, r3)     // Catch:{ all -> 0x0183 }
                android.os.IInterface r0 = (android.os.IInterface) r0     // Catch:{ all -> 0x0183 }
                int r1 = r14.what     // Catch:{ all -> 0x0183 }
                switch(r1) {
                    case 1: goto L_0x0142;
                    case 2: goto L_0x0142;
                    case 3: goto L_0x0142;
                    case 4: goto L_0x0139;
                    case 5: goto L_0x0142;
                    case 6: goto L_0x0142;
                    default: goto L_0x0135;
                }     // Catch:{ all -> 0x0183 }
            L_0x0135:
                switch(r1) {
                    case 1020: goto L_0x0142;
                    case 1021: goto L_0x013f;
                    case 1022: goto L_0x013f;
                    case 1023: goto L_0x0139;
                    default: goto L_0x0138;
                }     // Catch:{ all -> 0x0183 }
            L_0x0138:
                goto L_0x0189
            L_0x0139:
                java.lang.Object r1 = r14.obj     // Catch:{ all -> 0x0183 }
                yc2.C118980l.m167748f(r1, r4, r0)     // Catch:{ all -> 0x0183 }
                goto L_0x0189
            L_0x013f:
                r14.obj = r0     // Catch:{ all -> 0x0183 }
                goto L_0x0189
            L_0x0142:
                java.lang.Object r1 = r14.obj     // Catch:{ all -> 0x0183 }
                yc2.C118980l.m167748f(r1, r6, r0)     // Catch:{ all -> 0x0183 }
                goto L_0x0189
            L_0x0148:
                if (r1 == r7) goto L_0x014e
                if (r1 == r10) goto L_0x014e
                r1 = 0
                goto L_0x015a
            L_0x014e:
                java.lang.Object r1 = r14.obj     // Catch:{ all -> 0x0183 }
                java.lang.Object r1 = yc2.C118980l.m167747e(r1, r9)     // Catch:{ all -> 0x0183 }
                java.lang.Integer r1 = (java.lang.Integer) r1     // Catch:{ all -> 0x0183 }
                int r1 = r1.intValue()     // Catch:{ all -> 0x0183 }
            L_0x015a:
                yc2.e r4 = yc2.C118965e.this     // Catch:{ all -> 0x0183 }
                int r6 = r8.intValue()     // Catch:{ all -> 0x0183 }
                boolean r1 = yc2.C118965e.m167729b(r4, r1, r6, r5)     // Catch:{ all -> 0x0183 }
                if (r1 != 0) goto L_0x0189
                java.lang.String r1 = yc2.C118965e.f356353B     // Catch:{ all -> 0x0183 }
                r4 = 2
                java.lang.Class[] r5 = new java.lang.Class[r4]     // Catch:{ all -> 0x0183 }
                java.lang.Class r6 = java.lang.Boolean.TYPE     // Catch:{ all -> 0x0183 }
                r5[r3] = r6     // Catch:{ all -> 0x0183 }
                java.lang.Class r6 = java.lang.Integer.TYPE     // Catch:{ all -> 0x0183 }
                r5[r7] = r6     // Catch:{ all -> 0x0183 }
                java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ all -> 0x0183 }
                java.lang.Boolean r6 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x0183 }
                r4[r3] = r6     // Catch:{ all -> 0x0183 }
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0183 }
                r4[r7] = r0     // Catch:{ all -> 0x0183 }
                yc2.C118980l.m167743a(r2, r1, r5, r4)     // Catch:{ all -> 0x0183 }
                return r7
            L_0x0183:
                r0 = move-exception
                yc2.e r1 = yc2.C118965e.this
                yc2.C118965e.m167731d(r1, r0)
            L_0x0189:
                boolean r14 = r13.mo183654a(r14)
                return r14
            */
            throw new UnsupportedOperationException("Method not decompiled: yc2.C118965e.C118967b.handleMessage(android.os.Message):boolean");
        }
    }

    /* renamed from: yc2.e$c */
    public final class C118969c extends C118972e {

        /* renamed from: c */
        public InvocationHandler f356389c = new C118970a();

        /* renamed from: yc2.e$c$a */
        public class C118970a implements InvocationHandler {
            public C118970a() {
            }

            public Object invoke(Object obj, Method method, Object[] objArr) {
                synchronized (C118965e.this) {
                    if (C118965e.f356364q.equals(method.getName())) {
                        IInterface iInterface = C118965e.this.f356378e;
                        return iInterface;
                    }
                    try {
                        Object invoke = method.invoke(C118969c.this.f356394a.asBinder(), objArr);
                        return invoke;
                    } catch (InvocationTargetException e) {
                        Throwable targetException = e.getTargetException();
                        Class[] exceptionTypes = method.getExceptionTypes();
                        if (exceptionTypes != null && exceptionTypes.length > 0) {
                            Class[] exceptionTypes2 = method.getExceptionTypes();
                            int length = exceptionTypes2.length;
                            int i = 0;
                            while (i < length) {
                                if (!exceptionTypes2[i].isAssignableFrom(targetException.getClass())) {
                                    i++;
                                } else {
                                    throw targetException;
                                }
                            }
                        }
                        C118965e.m167731d(C118965e.this, targetException);
                        return C118965e.m167728a(C118965e.this, method);
                    } catch (Throwable th) {
                        C118965e.m167731d(C118965e.this, th);
                        return C118965e.m167728a(C118965e.this, method);
                    }
                }
            }
        }

        public C118969c(IInterface iInterface) {
            super(iInterface);
        }

        /* renamed from: a */
        public IBinder mo183658a() {
            return (IBinder) Proxy.newProxyInstance(C118965e.f356354g, new Class[]{IBinder.class}, this.f356389c);
        }

        public Object invoke(Object obj, Method method, Object[] objArr) {
            if (C118965e.f356362o.equals(method.getName()) && objArr != null && objArr.length >= 2) {
                IInterface iInterface = objArr[1];
                try {
                    String str = C118965e.f356361n;
                    LruCache<String, LruCache<String, Field>> lruCache = C118980l.f356403a;
                    if (Class.forName(str).isAssignableFrom(iInterface.getClass())) {
                        WeakReference weakReference = (WeakReference) C118980l.m167747e(iInterface, C118965e.f356360m);
                        Object obj2 = weakReference.get();
                        if (obj2 == null) {
                            Log.m105920e("MicroMsg.AED", "lost viewRootImpl instance, give up intercepting.");
                        } else {
                            Object e = C118980l.m167747e(C118980l.m167743a(obj2, C118965e.f356363p, (Class<?>[]) null, new Object[0]), "mHandler");
                            String str2 = C118965e.f356359l;
                            Handler.Callback callback = (Handler.Callback) C118980l.m167747e(e, str2);
                            if (!(callback instanceof C118967b)) {
                                C118980l.m167748f(e, str2, new C118967b(obj2, callback));
                            }
                            synchronized (C118965e.this.f356375b) {
                                IBinder iBinder = (IBinder) ((WeakHashMap) C118965e.this.f356375b).get(obj2);
                                if (iBinder == null) {
                                    C118966a aVar = new C118966a(weakReference.get(), iInterface.asBinder());
                                    ((WeakHashMap) C118965e.this.f356375b).put(obj2, aVar);
                                    iBinder = aVar;
                                }
                                try {
                                    objArr[1] = (IInterface) C118980l.m167744b(Class.forName(str + "$Stub"), "asInterface", new Class[]{IBinder.class}, iBinder);
                                } catch (Throwable th) {
                                    throw new C118980l.C118981a(th);
                                }
                            }
                        }
                    } else {
                        throw new IllegalStateException("mismatched conn class: " + iInterface.getClass() + ", give up intercepting.");
                    }
                } catch (Throwable th4) {
                    Log.printErrStackTrace("MicroMsg.AED", th4, "unexpected exception.", new Object[0]);
                    C118965e.m167731d(C118965e.this, th4);
                    objArr[1] = iInterface;
                }
            }
            return super.invoke(obj, method, objArr);
        }
    }

    /* renamed from: yc2.e$d */
    public class C118971d extends Binder {

        /* renamed from: d */
        public final IBinder f356392d;

        public C118971d(IBinder iBinder) {
            this.f356392d = iBinder;
        }

        public void dump(FileDescriptor fileDescriptor, String[] strArr) {
            try {
                this.f356392d.dump(fileDescriptor, strArr);
            } catch (RemoteException unused) {
            }
        }

        public void dumpAsync(FileDescriptor fileDescriptor, String[] strArr) {
            try {
                this.f356392d.dumpAsync(fileDescriptor, strArr);
            } catch (RemoteException unused) {
            }
        }

        public String getInterfaceDescriptor() {
            try {
                return this.f356392d.getInterfaceDescriptor();
            } catch (RemoteException unused) {
                return "<failure>";
            }
        }

        public boolean isBinderAlive() {
            return this.f356392d.isBinderAlive();
        }

        public void linkToDeath(IBinder.DeathRecipient deathRecipient, int i) {
            try {
                this.f356392d.linkToDeath(deathRecipient, i);
            } catch (RemoteException unused) {
                deathRecipient.binderDied();
            }
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            try {
                if (this.f356392d.isBinderAlive()) {
                    return this.f356392d.transact(i, parcel, parcel2, i2);
                }
                return false;
            } catch (RemoteException e) {
                throw e;
            } catch (Throwable th) {
                C118965e.m167731d(C118965e.this, th);
                return false;
            }
        }

        public boolean pingBinder() {
            return this.f356392d.pingBinder();
        }

        public IInterface queryLocalInterface(String str) {
            return null;
        }

        public boolean unlinkToDeath(IBinder.DeathRecipient deathRecipient, int i) {
            return this.f356392d.unlinkToDeath(deathRecipient, i);
        }
    }

    /* renamed from: yc2.e$e */
    public class C118972e implements InvocationHandler {

        /* renamed from: a */
        public final IInterface f356394a;

        public C118972e(IInterface iInterface) {
            this.f356394a = iInterface;
        }

        /* renamed from: a */
        public IBinder mo183658a() {
            return this.f356394a.asBinder();
        }

        public Object invoke(Object obj, Method method, Object[] objArr) {
            try {
                return "asBinder".equals(method.getName()) ? mo183658a() : method.invoke(this.f356394a, objArr);
            } catch (InvocationTargetException e) {
                Throwable targetException = e.getTargetException();
                if (!(targetException instanceof RuntimeException)) {
                    Class[] exceptionTypes = method.getExceptionTypes();
                    if (exceptionTypes != null && exceptionTypes.length > 0) {
                        Class[] exceptionTypes2 = method.getExceptionTypes();
                        int length = exceptionTypes2.length;
                        int i = 0;
                        while (i < length) {
                            if (!exceptionTypes2[i].isAssignableFrom(targetException.getClass())) {
                                i++;
                            } else {
                                throw targetException;
                            }
                        }
                    }
                    C118965e.m167731d(C118965e.this, targetException);
                    return C118965e.m167728a(C118965e.this, method);
                }
                throw targetException;
            } catch (Throwable th) {
                C118965e.m167731d(C118965e.this, th);
                return C118965e.m167728a(C118965e.this, method);
            }
        }
    }

    /* renamed from: yc2.e$f */
    public static class C118973f extends Exception {
        public C118973f(Throwable th) {
            super(th);
        }
    }

    /* renamed from: yc2.e$g */
    public interface C118974g {
        /* renamed from: a */
        boolean mo183637a(int i, int i2, View view);

        /* renamed from: b */
        void mo183638b(int i, View view, List<AccessibilityNodeInfo> list);

        void onError(Throwable th);
    }

    /* renamed from: yc2.e$h */
    public static final class C118975h {

        /* renamed from: a */
        public static final C118965e f356396a = new C118965e();
    }

    /* renamed from: yc2.e$i */
    public final class C118976i implements IBinder {

        /* renamed from: d */
        public final Class<?> f356397d;

        /* renamed from: e */
        public C118977a<String> f356398e = null;

        /* renamed from: f */
        public String f356399f = null;

        /* renamed from: yc2.e$i$a */
        public final class C118977a<T> extends SparseArray<T> {
            public C118977a(C118976i iVar, C118962b bVar) {
            }

            public void clear() {
                throw new UnsupportedOperationException();
            }

            public void put(int i, T t) {
                if (get(i) == null) {
                    super.put(i, t);
                    return;
                }
                throw new UnsupportedOperationException();
            }
        }

        public C118976i(Class<?> cls) {
            this.f356397d = cls;
        }

        /* renamed from: a */
        public final Object[] mo183668a(Class<?>[] clsArr) {
            int length = clsArr.length;
            Object[] objArr = new Object[length];
            for (int i = 0; i < length; i++) {
                Class<?> cls = clsArr[i];
                if (cls.isPrimitive()) {
                    if (Boolean.TYPE.isAssignableFrom(cls)) {
                        objArr[i] = Boolean.FALSE;
                    } else {
                        objArr[i] = 0;
                    }
                } else if (Number.class.isAssignableFrom(cls)) {
                    objArr[i] = 0;
                } else if (Character.class.isAssignableFrom(cls)) {
                    objArr[i] = 0;
                } else if (Boolean.class.isAssignableFrom(cls)) {
                    objArr[i] = Boolean.FALSE;
                } else {
                    objArr[i] = null;
                }
            }
            return objArr;
        }

        public void dump(FileDescriptor fileDescriptor, String[] strArr) {
        }

        public void dumpAsync(FileDescriptor fileDescriptor, String[] strArr) {
        }

        public String getInterfaceDescriptor() {
            return null;
        }

        public boolean isBinderAlive() {
            return false;
        }

        public void linkToDeath(IBinder.DeathRecipient deathRecipient, int i) {
        }

        public boolean pingBinder() {
            return false;
        }

        public IInterface queryLocalInterface(String str) {
            return null;
        }

        public boolean transact(int i, Parcel parcel, Parcel parcel2, int i2) {
            synchronized (this) {
                C118977a<String> aVar = this.f356398e;
                if (aVar != null) {
                    aVar.put(i, this.f356399f);
                }
            }
            return false;
        }

        public boolean unlinkToDeath(IBinder.DeathRecipient deathRecipient, int i) {
            return false;
        }
    }

    /* renamed from: a */
    public static Object m167728a(C118965e eVar, Method method) {
        eVar.getClass();
        Class<?> returnType = method.getReturnType();
        if (returnType.isPrimitive()) {
            if (Boolean.TYPE.isAssignableFrom(returnType)) {
                return Boolean.FALSE;
            }
            return 0;
        } else if (Number.class.isAssignableFrom(returnType)) {
            return 0;
        } else {
            if (Character.class.isAssignableFrom(returnType)) {
                return 0;
            }
            if (Boolean.class.isAssignableFrom(returnType)) {
                return Boolean.FALSE;
            }
            return null;
        }
    }

    /* renamed from: b */
    public static boolean m167729b(C118965e eVar, int i, int i2, View view) {
        eVar.getClass();
        if (Looper.myLooper() == Looper.getMainLooper()) {
            return eVar.mo183652f(i, i2, view);
        }
        boolean[] zArr = {true, false};
        eVar.f356377d.post(new C118963c(eVar, zArr, i, i2, view));
        synchronized (zArr) {
            while (!zArr[1]) {
                try {
                    zArr.wait();
                } catch (InterruptedException unused) {
                }
            }
        }
        return zArr[0];
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x003c */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x003c A[LOOP:1: B:8:0x003c->B:19:0x003c, LOOP_START, SYNTHETIC] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m167730c(yc2.C118965e r10, int r11, android.view.View r12, java.util.List r13) {
        /*
            r10.getClass()
            android.os.Looper r0 = android.os.Looper.myLooper()
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            if (r0 != r1) goto L_0x0025
            java.util.Queue<yc2.e$g> r10 = r10.f356374a
            java.util.concurrent.ConcurrentLinkedQueue r10 = (java.util.concurrent.ConcurrentLinkedQueue) r10
            java.util.Iterator r10 = r10.iterator()
        L_0x0015:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x0045
            java.lang.Object r0 = r10.next()
            yc2.e$g r0 = (yc2.C118965e.C118974g) r0
            r0.mo183638b(r11, r12, r13)
            goto L_0x0015
        L_0x0025:
            r0 = 1
            boolean[] r0 = new boolean[r0]
            r7 = 0
            r0[r7] = r7
            android.os.Handler r8 = r10.f356377d
            yc2.b r9 = new yc2.b
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            r6 = r0
            r1.<init>(r2, r3, r4, r5, r6)
            r8.post(r9)
            monitor-enter(r0)
        L_0x003c:
            boolean r10 = r0[r7]     // Catch:{ all -> 0x0046 }
            if (r10 != 0) goto L_0x0044
            r0.wait()     // Catch:{ InterruptedException -> 0x003c }
            goto L_0x003c
        L_0x0044:
            monitor-exit(r0)     // Catch:{ all -> 0x0046 }
        L_0x0045:
            return
        L_0x0046:
            r10 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0046 }
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: yc2.C118965e.m167730c(yc2.e, int, android.view.View, java.util.List):void");
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0036 */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0036 A[LOOP:1: B:8:0x0036->B:19:0x0036, LOOP_START, SYNTHETIC] */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m167731d(yc2.C118965e r4, java.lang.Throwable r5) {
        /*
            r4.getClass()
            android.os.Looper r0 = android.os.Looper.myLooper()
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            if (r0 != r1) goto L_0x0025
            java.util.Queue<yc2.e$g> r4 = r4.f356374a
            java.util.concurrent.ConcurrentLinkedQueue r4 = (java.util.concurrent.ConcurrentLinkedQueue) r4
            java.util.Iterator r4 = r4.iterator()
        L_0x0015:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x003f
            java.lang.Object r0 = r4.next()
            yc2.e$g r0 = (yc2.C118965e.C118974g) r0
            r0.onError(r5)
            goto L_0x0015
        L_0x0025:
            r0 = 1
            boolean[] r0 = new boolean[r0]
            r1 = 0
            r0[r1] = r1
            android.os.Handler r2 = r4.f356377d
            yc2.d r3 = new yc2.d
            r3.<init>(r4, r5, r0)
            r2.post(r3)
            monitor-enter(r0)
        L_0x0036:
            boolean r4 = r0[r1]     // Catch:{ all -> 0x0040 }
            if (r4 != 0) goto L_0x003e
            r0.wait()     // Catch:{ InterruptedException -> 0x0036 }
            goto L_0x0036
        L_0x003e:
            monitor-exit(r0)     // Catch:{ all -> 0x0040 }
        L_0x003f:
            return
        L_0x0040:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0040 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: yc2.C118965e.m167731d(yc2.e, java.lang.Throwable):void");
    }

    /* renamed from: e */
    public synchronized void mo183651e(Context context) {
        if (!this.f356379f) {
            try {
                String str = f356356i;
                Class[] clsArr = {String.class};
                Object[] objArr = {"accessibility"};
                LruCache<String, LruCache<String, Field>> lruCache = C118980l.f356403a;
                String str2 = f356355h;
                IInterface iInterface = (IInterface) C118980l.m167744b(Class.forName(str2), f356358k, new Class[]{IBinder.class}, (IBinder) C118980l.m167744b(Class.forName(str), "getService", clsArr, objArr));
                this.f356378e = (IInterface) Proxy.newProxyInstance(f356354g, iInterface.getClass().getInterfaces(), new C118969c(iInterface));
                Object obj = null;
                ((Map) C118980l.m167745c(Class.forName(str), f356357j).get((Object) null)).put("accessibility", this.f356378e.asBinder());
                try {
                    Object b = C118980l.m167744b(AccessibilityManager.class, "getInstance", new Class[]{Context.class}, context);
                    try {
                        obj = C118980l.m167747e(b, "mLock");
                    } catch (Throwable unused) {
                    }
                    if (obj != null) {
                        synchronized (obj) {
                            C118980l.m167748f(b, "mService", this.f356378e);
                        }
                    } else {
                        C118980l.m167748f(b, "mService", this.f356378e);
                    }
                    this.f356379f = true;
                } catch (Throwable th) {
                    throw new C118973f(th);
                }
            } catch (Throwable th4) {
                throw new C118973f(th4);
            }
        }
    }

    /* renamed from: f */
    public final boolean mo183652f(int i, int i2, View view) {
        Iterator it = ((ConcurrentLinkedQueue) this.f356374a).iterator();
        while (it.hasNext()) {
            if (!((C118974g) it.next()).mo183637a(i, i2, view)) {
                return false;
            }
        }
        return true;
    }
}
