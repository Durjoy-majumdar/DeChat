package p269xe;

import android.os.Process;
import android.text.TextUtils;
import android.view.View;
import com.tencent.matrix.batterycanary.monitor.feature.C114467i;
import com.tencent.p014mm.app.AppForegroundDelegate;
import com.tencent.p014mm.app.C28675a0;
import com.tencent.p014mm.app.C80617t0;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.xweb.file.XVFSFile;
import di3.C86312j;
import java.util.Iterator;
import java.util.List;
import p1177ce.C113287a;
import p172io.flutter.embedding.android.FlutterActivityLaunchConfigs;
import p212oe.C117762j;
import p212oe.C117776s;
import p212oe.C89202a;
import p329d3.C58104c;
import p981ie.C117159b;

/* renamed from: xe.b */
public final class C118872b {
    /* renamed from: a */
    public static String m167604a(String str) {
        if (str == null || str.length() == 0) {
            return str;
        }
        return Character.toTitleCase(str.charAt(0)) + str.substring(1);
    }

    /* renamed from: b */
    public static String m167605b(C114467i iVar) {
        String str = iVar.f343167p;
        char c = 65535;
        switch (str.hashCode()) {
            case -1462962565:
                if (str.equals("alertBatt")) {
                    c = 4;
                    break;
                }
                break;
            case -1367725928:
                if (str.equals("canary")) {
                    c = 2;
                    break;
                }
                break;
            case -1068784020:
                if (str.equals("module")) {
                    c = 0;
                    break;
                }
                break;
            case 97555:
                if (str.equals("biz")) {
                    c = 1;
                    break;
                }
                break;
            case 1192142491:
                if (str.equals("alertThermal")) {
                    c = 3;
                    break;
                }
                break;
        }
        if (c == 0) {
            return m167604a(((C117776s) iVar).mo182526y());
        }
        if (c != 1) {
            return m167604a(str);
        }
        return m167604a(str) + m167604a(((C117776s) iVar).mo182526y());
    }

    /* renamed from: c */
    public static int m167606c() {
        return m167607d(AppForegroundDelegate.INSTANCE.f343454n);
    }

    /* renamed from: d */
    public static int m167607d(boolean z) {
        boolean z2;
        int b = C117159b.m165201b(MMApplicationContext.getContext(), z);
        if (b != 2) {
            return b;
        }
        C80617t0.m98255d().getClass();
        Class cls = C28675a0.class;
        if (MMApplicationContext.isMainProcess()) {
            z2 = ((C28675a0) C86312j.m106911c(cls)).kf0();
        } else {
            List<? extends Class<? extends View>> ed02 = ((C28675a0) C86312j.m106911c(cls)).ed0();
            if (!ed02.isEmpty()) {
                Iterator<View> it = C80617t0.m98256e().iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (ed02.contains(it.next().getClass())) {
                            z2 = true;
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            z2 = false;
        }
        if (z2) {
            return 4;
        }
        return b;
    }

    /* renamed from: e */
    public static int m167608e() {
        return C117159b.m165213n(MMApplicationContext.getContext());
    }

    /* renamed from: f */
    public static String m167609f() {
        String processName = MMApplicationContext.getProcessName();
        return TextUtils.isEmpty(processName) ? "" : m167610g(processName);
    }

    /* renamed from: g */
    public static String m167610g(String str) {
        return !str.contains(MMApplicationContext.getApplicationId()) ? str : str.contains(XVFSFile.PATH_SEPARATOR) ? str.substring(str.lastIndexOf(XVFSFile.PATH_SEPARATOR) + 1) : FlutterActivityLaunchConfigs.DEFAULT_DART_ENTRYPOINT;
    }

    /* renamed from: h */
    public static C58104c<String, Integer> m167611h(C113287a aVar) {
        String str = aVar.f338971i;
        int i = aVar.f338972j;
        if ("background".equals(str)) {
            if (!TextUtils.isEmpty(aVar.f338973k)) {
                str = aVar.f338973k;
                i = aVar.f338974l;
            } else {
                String str2 = C117762j.f352168f;
                if (!"unknown".equals(str2)) {
                    i = -1;
                    str = str2;
                }
            }
        }
        return new C58104c<>(str, Integer.valueOf(i));
    }

    /* renamed from: i */
    public static String m167612i(String str, int i) {
        if (i > 0) {
            if (i != Process.myPid() ? str.startsWith("com.tencent.mm") : false) {
                if (str.endsWith("_fake")) {
                    return str;
                }
                return str + "_fake";
            }
        }
        if (i > 0 && String.valueOf(str).startsWith("Thread-")) {
            String str2 = C89202a.f257033a.get(Integer.valueOf(i));
            if (!TextUtils.isEmpty(str2)) {
                str = str2;
            }
        }
        return !TextUtils.isEmpty(str) ? str.contains("[GT]ColdPool#") ? "[GT]ColdPool" : str.contains("[GT]HotPool#") ? "[GT]HotPool" : str.contains("mars::") ? "mars::xxx" : str.startsWith("Thread-") ? "Thread-xxx" : str : str;
    }
}
