package p284zb;

import android.util.Base64;
import com.tencent.p014mm.appbrand.commonjni.AppBrandCommonBindingJni;
import com.tencent.p014mm.appbrand.commonjni.buffer.BufferURLManager;
import com.tencent.p014mm.plugin.appbrand.appstorage.C81410b0;
import com.tencent.p014mm.plugin.appbrand.appstorage.C81415h0;
import com.tencent.p014mm.plugin.appbrand.appstorage.ICommLibReader;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82510g;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C40482o;
import com.tencent.p014mm.plugin.appbrand.utils.C84782s1;
import com.tencent.p014mm.sdk.crash.CrashReportFactory;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import js0.C88016e;
import js0.C9514m;
import kj2.C117407d;
import p206nj.C88957l;
import p762yg.C39011b;
import p762yg.C91447a;
import p762yg.C91450e;
import p762yg.C91451f;

/* renamed from: zb.a */
public class C91627a {

    /* renamed from: a */
    public final AppBrandCommonBindingJni f262484a;

    /* renamed from: b */
    public final BufferURLManager f262485b = new BufferURLManager();

    /* renamed from: zb.a$a */
    public class C39326a implements C39011b.C39013b {
        public void loadLibrary(String str) {
            long currentTicks = Util.currentTicks();
            C88957l.m111078n(str);
            Log.m105925i("MicroMsg.AppBrandCommonBinding", "hy: test loading %s using %d ms", str, Long.valueOf(Util.ticksToNow(currentTicks)));
        }
    }

    /* renamed from: zb.a$b */
    public class C91628b implements C91450e {
        /* renamed from: e */
        public void mo125381e(String str, String str2, Object... objArr) {
            Log.m105921e(str, str2, objArr);
        }

        /* renamed from: i */
        public void mo125382i(String str, String str2, Object... objArr) {
            Log.m105925i(str, str2, objArr);
        }

        public void printStackTrace(String str, Throwable th, String str2, Object... objArr) {
            Log.printErrStackTrace(str, th, str2, objArr);
        }
    }

    /* renamed from: zb.a$c */
    public static abstract class C91629c implements C91447a {

        /* renamed from: a */
        public final WeakReference<C82510g> f262486a;

        /* renamed from: zb.a$c$a */
        public class C91630a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ Throwable f262487d;

            public C91630a(C91629c cVar, Throwable th) {
                this.f262487d = th;
            }

            public void run() {
                throw this.f262487d;
            }
        }

        public C91629c(C82510g gVar) {
            this.f262486a = new WeakReference<>(gVar);
        }

        /* renamed from: C */
        public String mo121816C(String str, String str2, String str3, int i, boolean z) {
            if (this.f262486a.get() == null) {
                Log.m105921e("MicroMsg.AbsAppBrandDelegate", "hy: component released when nativeInvokeHandler: %s, %s, %d, %b", str, str2, Integer.valueOf(i), Boolean.valueOf(z));
                return null;
            }
            try {
                return this.f262486a.get().mo114845P(str, str2, str3, i, z, (C40482o) null);
            } catch (Throwable th) {
                Log.printErrStackTrace("MicroMsg.AbsAppBrandDelegate", th, "IMBInvokeHandler.invoke", new Object[0]);
                MMHandlerThread.postToMainThread(new C91630a(this, th));
                return "";
            }
        }

        /* renamed from: F */
        public void mo122288F(int i, int i2, int i3) {
            try {
                C117407d.INSTANCE.mo182089r((long) i, (long) i2, (long) i3);
            } catch (Exception unused) {
            }
        }

        /* renamed from: J */
        public ByteBuffer mo122289J(String str) {
            if (this.f262486a.get() == null) {
                Log.m105920e("MicroMsg.AbsAppBrandDelegate", "hy: component released when readWeAppFile");
                return null;
            }
            new C9514m();
            ICommLibReader iCommLibReader = (ICommLibReader) this.f262486a.get().mo109668l(ICommLibReader.class);
            if (iCommLibReader == null) {
                Log.m105920e("MicroMsg.AbsAppBrandDelegate", "commLibReader null");
                return null;
            }
            InputStream openRead = iCommLibReader.openRead(str);
            if (openRead == null) {
                Log.m105920e("MicroMsg.AbsAppBrandDelegate", "commLibReader openRead null");
                return null;
            }
            byte[] b = C88016e.m109545b(openRead);
            if (b.length != 0) {
                return C84782s1.m104464e(b);
            }
            Log.m105920e("MicroMsg.AbsAppBrandDelegate", "commLibReader byteArray null");
            return null;
        }

        /* renamed from: e */
        public void mo122291e(String str) {
        }

        /* renamed from: l */
        public boolean mo122294l(String str, String str2) {
            return false;
        }

        /* renamed from: m */
        public void mo122296m(String str) {
            CrashReportFactory.reportRawMessage(Base64.encodeToString(str.getBytes(), 2), "appbrand_commonbinding");
        }

        /* renamed from: p */
        public String[] mo122301p() {
            if (this.f262486a.get() == null) {
                Log.m105920e("MicroMsg.AbsAppBrandDelegate", "hy: component released when getAsyncableJsApis");
                return new String[0];
            }
            C82510g gVar = this.f262486a.get();
            gVar.getClass();
            ArrayList arrayList = new ArrayList(500);
            for (Map.Entry entry : ((ConcurrentHashMap) gVar.f241586h).entrySet()) {
                if ((entry.getValue() instanceof C82268c) && !((C82268c) entry.getValue()).mo1769t()) {
                    arrayList.add((String) entry.getKey());
                }
            }
            return (String[]) arrayList.toArray(new String[arrayList.size()]);
        }

        /* renamed from: v */
        public ByteBuffer mo122302v(String str) {
            if (this.f262486a.get() == null) {
                Log.m105920e("MicroMsg.AbsAppBrandDelegate", "hy: component released when readWeAppFile");
                return null;
            }
            C9514m mVar = new C9514m();
            C81415h0 fileSystem = this.f262486a.get().getFileSystem();
            Objects.requireNonNull(fileSystem);
            C81410b0 readFile = fileSystem.readFile(str, mVar);
            if (readFile == C81410b0.OK) {
                return C84782s1.m104460a((ByteBuffer) mVar.f29691a);
            }
            Log.m105921e("MicroMsg.AbsAppBrandDelegate", "readFile %s failed: %s", str, readFile);
            return null;
        }

        /* renamed from: z */
        public void mo122303z(int i, String str) {
            try {
                C117407d.INSTANCE.kvStat(i, str);
            } catch (Exception unused) {
            }
        }
    }

    static {
        C39326a aVar = new C39326a();
        C39011b.f105067a = aVar;
        C91451f.f262178a = new C91628b();
        aVar.loadLibrary("wxa-runtime-binding");
    }

    public C91627a(C91447a aVar) {
        this.f262484a = new AppBrandCommonBindingJni(aVar);
    }
}
