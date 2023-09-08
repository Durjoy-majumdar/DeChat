package com.tencent.matrix.backtrace;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import j20.C117292a;
import java.io.File;
import java.util.HashSet;
import k20.C9556a;
import org.xwalk.core.XWalkEnvironment;
import p1069zd.C91662a;

/* renamed from: com.tencent.matrix.backtrace.k */
public class C114419k {

    /* renamed from: g */
    public static boolean f342997g;

    /* renamed from: a */
    public volatile boolean f342998a;

    /* renamed from: b */
    public volatile boolean f342999b;

    /* renamed from: c */
    public volatile C114420a f343000c;

    /* renamed from: d */
    public final C114405e f343001d = new C114405e();

    /* renamed from: e */
    public final Handler f343002e = new Handler(Looper.getMainLooper());

    /* renamed from: f */
    public boolean f343003f = false;

    /* renamed from: com.tencent.matrix.backtrace.k$a */
    public static final class C114420a {

        /* renamed from: a */
        public Context f343004a;

        /* renamed from: b */
        public HashSet<String> f343005b;

        /* renamed from: c */
        public C114421b f343006c = C114421b.Quicken;

        /* renamed from: d */
        public boolean f343007d = false;

        /* renamed from: e */
        public boolean f343008e = false;

        /* renamed from: f */
        public boolean f343009f = true;

        /* renamed from: g */
        public boolean f343010g = false;

        /* renamed from: h */
        public boolean f343011h = true;

        /* renamed from: i */
        public C114423d f343012i = C114423d.WhileScreenOff;

        /* renamed from: j */
        public long f343013j = 3000;

        /* renamed from: k */
        public boolean f343014k = false;

        /* renamed from: l */
        public boolean f343015l = false;

        /* renamed from: m */
        public String f343016m = null;

        /* renamed from: n */
        public boolean f343017n = false;

        /* renamed from: o */
        public final C114419k f343018o;

        public C114420a(Context context, C114419k kVar) {
            String str;
            HashSet<String> hashSet = new HashSet<>();
            this.f343005b = hashSet;
            this.f343004a = context;
            this.f343018o = kVar;
            hashSet.add(context.getApplicationInfo().nativeLibraryDir);
            this.f343005b.add(C114419k.m160961b());
            this.f343005b.add(C114419k.m160960a(context));
            Context context2 = this.f343004a;
            synchronized (C91662a.class) {
                if (C91662a.f262639a == null) {
                    C91662a.f262639a = C91662a.m115197a(context2, Process.myPid());
                }
                str = C91662a.f262639a;
            }
            this.f343010g = context2.getPackageName().equalsIgnoreCase(str);
        }

        public String toString() {
            return "\nWeChat backtrace configurations: \n>>> Backtrace Mode: " + this.f343006c + "\n>>> Quicken always on: " + this.f343008e + "\n>>> Saving Path: " + C114417j.m160947b(this) + "\n>>> Custom Library Loader: " + false + "\n>>> Directories to Warm-up: " + this.f343005b.toString() + "\n>>> Is Warm-up Process: " + this.f343010g + "\n>>> Warm-up Timing: " + this.f343012i + "\n>>> Warm-up Delay: " + this.f343013j + "ms\n>>> Warm-up in isolate process: " + this.f343011h + "\n>>> Enable logger: " + this.f343014k + "\n>>> Enable Isolate Process logger: " + this.f343015l + "\n>>> Path of XLog: " + this.f343016m + "\n>>> Cool-down: " + this.f343007d + "\n>>> Cool-down if Apk Updated: " + this.f343009f + "\n";
        }
    }

    /* renamed from: com.tencent.matrix.backtrace.k$b */
    public enum C114421b {
        Fp(0),
        Quicken(1),
        Dwarf(2),
        FpUntilQuickenWarmedUp(3),
        DwarfUntilQuickenWarmedUp(4);
        

        /* renamed from: d */
        public int f343025d;

        /* access modifiers changed from: public */
        C114421b(int i) {
            this.f343025d = i;
        }

        public String toString() {
            int ordinal = ordinal();
            return ordinal != 0 ? ordinal != 1 ? ordinal != 2 ? ordinal != 3 ? ordinal != 4 ? "Unreachable." : "Use dwarf-based backtrace before quicken has warmed up." : "Use fp-based backtrace before quicken has warmed up." : "Dwarf-based." : "WeChat QuickenUnwindTable-based." : "FramePointer-based.";
        }
    }

    /* renamed from: com.tencent.matrix.backtrace.k$c */
    public static final class C114422c {

        /* renamed from: a */
        public static final C114419k f343026a = new C114419k();
    }

    /* renamed from: com.tencent.matrix.backtrace.k$d */
    public enum C114423d {
        WhileScreenOff
    }

    /* renamed from: a */
    public static String m160960a(Context context) {
        String str = !m160962c() ? "arm" : "arm64";
        File parentFile = new File(context.getApplicationInfo().nativeLibraryDir).getParentFile().getParentFile();
        return new File(parentFile, "/oat/" + str + "/base.odex").getAbsolutePath();
    }

    /* renamed from: b */
    public static String m160961b() {
        return Build.VERSION.SDK_INT >= 29 ? !m160962c() ? "/apex/com.android.runtime/lib/" : "/apex/com.android.runtime/lib64/" : !m160962c() ? "/system/lib/" : "/system/lib64/";
    }

    /* renamed from: c */
    public static boolean m160962c() {
        String str = Build.CPU_ABI;
        return XWalkEnvironment.RUNTIME_ABI_ARM64_STR.equalsIgnoreCase(str) || "x86_64".equalsIgnoreCase(str) || "mips64".equalsIgnoreCase(str);
    }

    /* renamed from: d */
    public static void m160963d() {
        C9556a aVar = new C9556a();
        aVar.mo10233c("wechatbacktrace");
        Object obj = new Object();
        C117292a.m165358d(obj, aVar.mo10232b(), "com/tencent/matrix/backtrace/WeChatBacktrace", "loadLibrary", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
        System.loadLibrary((String) aVar.mo10231a(0));
        C117292a.m165359e(obj, "com/tencent/matrix/backtrace/WeChatBacktrace", "loadLibrary", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
    }
}
