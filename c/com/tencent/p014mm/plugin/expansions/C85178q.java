package com.tencent.p014mm.plugin.expansions;

import android.content.res.AssetManager;
import com.tencent.mars.smc.IDKey;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import j20.C117292a;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import k20.C9556a;
import p564iq.C87789a;
import p564iq.C87790d;
import si3.C90199a;
import si3.C90201c;
import ui3.C90663a;
import ui3.C90664c;

/* renamed from: com.tencent.mm.plugin.expansions.q */
public final class C85178q {

    /* renamed from: a */
    public static final byte[] f248171a = new byte[0];

    /* renamed from: b */
    public static volatile C90664c f248172b = new C85179a();

    /* renamed from: c */
    public static volatile C90199a f248173c;

    /* renamed from: d */
    public static final List<String> f248174d = new ArrayList();

    /* renamed from: com.tencent.mm.plugin.expansions.q$a */
    public class C85179a implements C90664c {
        /* renamed from: a */
        public File mo118207a() {
            return new File(MMApplicationContext.getContext().getApplicationInfo().nativeLibraryDir);
        }

        public AssetManager getAssets() {
            return MMApplicationContext.getContext().getAssets();
        }
    }

    /* renamed from: com.tencent.mm.plugin.expansions.q$b */
    public static class C85180b<T> implements Future<T> {

        /* renamed from: d */
        public final T f248175d;

        public C85180b(T t) {
            this.f248175d = t;
        }

        public boolean cancel(boolean z) {
            return false;
        }

        public T get() {
            return this.f248175d;
        }

        public boolean isCancelled() {
            return false;
        }

        public boolean isDone() {
            return true;
        }

        public T get(long j, TimeUnit timeUnit) {
            return this.f248175d;
        }
    }

    /* renamed from: com.tencent.mm.plugin.expansions.q$c */
    public static class C85181c extends C90663a<Object> {
        static {
            StringBuilder sb = new StringBuilder();
            sb.append("expansions-");
            sb.append(C90201c.m112900a());
            sb.append(".obb");
        }

        /* renamed from: c */
        public static C85181c m105048c() {
            C85181c cVar = new C85181c();
            cVar.mo124671b(0);
            cVar.mo124670a("use builtin impl");
            return cVar;
        }
    }

    static {
        C85181c c = C85181c.m105048c();
        f248173c = new C90199a(c, new C85180b(c));
    }

    /* renamed from: a */
    public static void m105037a() {
        Delivery.dumpAppClassLoader();
    }

    /* renamed from: b */
    public static Future<?> m105038b(C87789a aVar) {
        if (Delivery.isEnabled()) {
            return Delivery.getAssets(aVar);
        }
        if (aVar != null) {
            aVar.mo118204a(f248172b.getAssets());
        }
        return f248173c.f258966a;
    }

    /* renamed from: c */
    public static String m105039c() {
        if (Delivery.isEnabled()) {
            return Delivery.getLastObbErrorInfo();
        }
        ArrayList<IDKey> arrayList = C29890o.f80973a;
        return String.valueOf(MultiProcessMMKV.getDefault().getInt("expansions_error_reason", -1));
    }

    /* renamed from: d */
    public static Future<?> m105040d(C87790d.C33382a aVar) {
        if (Delivery.isEnabled()) {
            return Delivery.install(aVar);
        }
        if (aVar != null) {
            aVar.mo55610a(f248172b);
        }
        return f248173c.f258966a;
    }

    /* renamed from: e */
    public static boolean m105041e() {
        if (Delivery.isEnabled()) {
            return Delivery.isInstalled();
        }
        return true;
    }

    /* renamed from: f */
    public static Future<?> m105042f(boolean z) {
        if (Delivery.isEnabled()) {
            return Delivery.request();
        }
        Log.m105924i("MicroMsg.exp.Expansions", "request expansions, isInstalling = " + true + ", isForce = " + z);
        return f248173c.f258966a;
    }

    /* renamed from: g */
    public static boolean m105043g(boolean z) {
        if (Delivery.isEnabled()) {
            return Delivery.requestSync(z);
        }
        return true;
    }

    /* renamed from: h */
    public static AssetManager m105044h() {
        return Delivery.isEnabled() ? Delivery.tryGetAssets() : f248172b.getAssets();
    }

    /* renamed from: i */
    public static boolean m105045i(String str) {
        if (Delivery.isEnabled()) {
            if (Delivery.tryLoadLibrary(str)) {
                return true;
            }
            Log.m105928w("MicroMsg.exp.Expansions", "tryLoadLibrary with delivery fail, fallback to legacy!");
        }
        List<String> list = f248174d;
        if (((ArrayList) list).contains(str)) {
            return true;
        }
        try {
            C9556a aVar = new C9556a();
            aVar.mo10233c(str);
            Object obj = new Object();
            C117292a.m165358d(obj, aVar.mo10232b(), "com/tencent/mm/plugin/expansions/JExpansions", "tryLoadLibrary", "(Ljava/lang/String;)Z", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
            System.loadLibrary((String) aVar.mo10231a(0));
            C117292a.m165359e(obj, "com/tencent/mm/plugin/expansions/JExpansions", "tryLoadLibrary", "(Ljava/lang/String;)Z", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
            ((ArrayList) list).add(str);
            return true;
        } catch (Throwable th) {
            Log.m105928w("MicroMsg.exp.Expansions", "tryLoadLibrary fail, error = " + th.getMessage());
            return false;
        }
    }

    /* renamed from: j */
    public static void m105046j(String str) {
        if (Delivery.isEnabled()) {
            Delivery.updateLang(str);
        }
    }
}
