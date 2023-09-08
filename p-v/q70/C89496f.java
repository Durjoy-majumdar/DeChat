package q70;

import android.os.CancellationSignal;
import bp3.C79760s;
import com.tencent.matrix.lifecycle.supervisor.AppDeepBackgroundOwner;
import com.tencent.matrix.lifecycle.supervisor.AppStagedBackgroundOwner;
import com.tencent.matrix.util.MemInfo;
import com.tencent.matrix.util.ProcessInfo;
import com.tencent.matrix.util.PssInfo;
import com.tencent.matrix.util.SystemInfo;
import com.tencent.p014mm.matrix.trigger.RemoteTrigger;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MAlarmHandler;
import com.tencent.p014mm.vfs.C116281f0;
import com.tencent.p014mm.vfs.C116340x0;
import com.tencent.p014mm.vfs.FileSystem;
import com.tencent.xweb.XWebSdk;
import fy3.C32224a;
import fy3.C32226l;
import fy3.C32229r;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONObject;
import p269xe.C91190k;
import p269xe.C91191l;
import p659qe.C89612g;
import p723vf.C118672d;
import rx3.C13598b0;
import sx3.C110823p;
import t70.C36961c;
import zt3.C119157j;

/* renamed from: q70.f */
public final class C89496f {

    /* renamed from: a */
    public static final C89496f f257573a = new C89496f();

    /* renamed from: b */
    public static final long f257574b;

    /* renamed from: c */
    public static final long f257575c;

    /* renamed from: d */
    public static final long f257576d;

    /* renamed from: e */
    public static final long f257577e;

    /* renamed from: f */
    public static final long f257578f;

    /* renamed from: g */
    public static volatile boolean f257579g;

    /* renamed from: q70.f$a */
    public static final class C89497a extends C87413o implements C32229r<Integer, Integer, MemInfo[], MemInfo[], C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ long f257580d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C89497a(long j) {
            super(4);
            this.f257580d = j;
        }

        /* renamed from: I */
        public Object mo162I(Object obj, Object obj2, Object obj3, Object obj4) {
            int intValue = ((Number) obj).intValue();
            ((Number) obj2).intValue();
            MemInfo[] memInfoArr = (MemInfo[]) obj3;
            C87412m.m108594g(memInfoArr, "amsMemInfos");
            C87412m.m108594g((MemInfo[]) obj4, "debugMemInfos");
            ((C119157j) C119157j.f356862d).mo183884o(new C89495e(this.f257580d, memInfoArr, intValue));
            return C13598b0.f38549a;
        }
    }

    /* renamed from: q70.f$b */
    public static final class C89498b extends C87413o implements C32229r<Integer, Integer, MemInfo[], MemInfo[], C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ long f257581d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C89498b(long j) {
            super(4);
            this.f257581d = j;
        }

        /* renamed from: I */
        public Object mo162I(Object obj, Object obj2, Object obj3, Object obj4) {
            int intValue = ((Number) obj).intValue();
            ((Number) obj2).intValue();
            MemInfo[] memInfoArr = (MemInfo[]) obj3;
            C87412m.m108594g(memInfoArr, "amsMemInfos");
            C87412m.m108594g((MemInfo[]) obj4, "debugMemInfos");
            ((C119157j) C119157j.f356862d).mo183884o(new C89507g(this.f257581d, memInfoArr, intValue));
            return C13598b0.f38549a;
        }
    }

    /* renamed from: q70.f$c */
    public static final class C89499c extends C87413o implements C32229r<Integer, Integer, MemInfo[], MemInfo[], C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ long f257582d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C89499c(long j) {
            super(4);
            this.f257582d = j;
        }

        /* renamed from: I */
        public Object mo162I(Object obj, Object obj2, Object obj3, Object obj4) {
            int intValue = ((Number) obj).intValue();
            ((Number) obj2).intValue();
            MemInfo[] memInfoArr = (MemInfo[]) obj3;
            C87412m.m108594g(memInfoArr, "amsMemInfos");
            C87412m.m108594g((MemInfo[]) obj4, "debugMemInfos");
            ((C119157j) C119157j.f356862d).mo183884o(new C89511h(this.f257582d, memInfoArr, intValue));
            return C13598b0.f38549a;
        }
    }

    /* renamed from: q70.f$d */
    public static final class C89500d extends C87413o implements C32229r<Integer, Integer, MemInfo[], MemInfo[], C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ long f257583d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C89500d(long j) {
            super(4);
            this.f257583d = j;
        }

        /* renamed from: I */
        public Object mo162I(Object obj, Object obj2, Object obj3, Object obj4) {
            int intValue = ((Number) obj).intValue();
            ((Number) obj2).intValue();
            MemInfo[] memInfoArr = (MemInfo[]) obj3;
            C87412m.m108594g(memInfoArr, "amsMemInfos");
            C87412m.m108594g((MemInfo[]) obj4, "debugMemInfos");
            ((C119157j) C119157j.f356862d).mo183884o(new C89523p(this.f257583d, memInfoArr, intValue));
            return C13598b0.f38549a;
        }
    }

    /* renamed from: q70.f$e */
    public static final class C89501e extends C87413o implements C32229r<Integer, Integer, MemInfo[], MemInfo[], C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ long f257584d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C89501e(long j) {
            super(4);
            this.f257584d = j;
        }

        /* renamed from: I */
        public Object mo162I(Object obj, Object obj2, Object obj3, Object obj4) {
            int intValue = ((Number) obj).intValue();
            ((Number) obj2).intValue();
            MemInfo[] memInfoArr = (MemInfo[]) obj3;
            C87412m.m108594g(memInfoArr, "amsMemInfos");
            C87412m.m108594g((MemInfo[]) obj4, "debugMemInfos");
            ((C119157j) C119157j.f356862d).mo183884o(new C89525q(this.f257584d, memInfoArr, intValue));
            return C13598b0.f38549a;
        }
    }

    /* renamed from: q70.f$f */
    public static final class C89502f extends C87413o implements C32229r<Integer, Integer, MemInfo[], MemInfo[], C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ long f257585d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C89502f(long j) {
            super(4);
            this.f257585d = j;
        }

        /* renamed from: I */
        public Object mo162I(Object obj, Object obj2, Object obj3, Object obj4) {
            int intValue = ((Number) obj).intValue();
            ((Number) obj2).intValue();
            MemInfo[] memInfoArr = (MemInfo[]) obj3;
            C87412m.m108594g(memInfoArr, "amsMemInfos");
            C87412m.m108594g((MemInfo[]) obj4, "debugMemInfos");
            ((C119157j) C119157j.f356862d).mo183884o(new C89526r(this.f257585d, memInfoArr, intValue));
            return C13598b0.f38549a;
        }
    }

    /* renamed from: q70.f$g */
    public static final class C89503g extends C87413o implements C32229r<Integer, Integer, MemInfo[], MemInfo[], C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ long f257586d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C89503g(long j) {
            super(4);
            this.f257586d = j;
        }

        /* renamed from: I */
        public Object mo162I(Object obj, Object obj2, Object obj3, Object obj4) {
            int intValue = ((Number) obj).intValue();
            ((Number) obj2).intValue();
            MemInfo[] memInfoArr = (MemInfo[]) obj3;
            C87412m.m108594g(memInfoArr, "amsMemInfos");
            C87412m.m108594g((MemInfo[]) obj4, "debugMemInfos");
            ((C119157j) C119157j.f356862d).mo183884o(new C89527s(this.f257586d, memInfoArr, intValue));
            return C13598b0.f38549a;
        }
    }

    /* renamed from: q70.f$h */
    public static final class C89504h extends C87413o implements C32229r<Integer, Integer, MemInfo[], MemInfo[], C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ long f257587d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C89504h(long j) {
            super(4);
            this.f257587d = j;
        }

        /* renamed from: I */
        public Object mo162I(Object obj, Object obj2, Object obj3, Object obj4) {
            int intValue = ((Number) obj).intValue();
            ((Number) obj2).intValue();
            MemInfo[] memInfoArr = (MemInfo[]) obj3;
            C87412m.m108594g(memInfoArr, "amsMemInfos");
            C87412m.m108594g((MemInfo[]) obj4, "debugMemInfos");
            ((C119157j) C119157j.f356862d).mo183884o(new C89528t(this.f257587d, memInfoArr, intValue));
            return C13598b0.f38549a;
        }
    }

    /* renamed from: q70.f$i */
    public static final class C89505i extends C87413o implements C32229r<Integer, Integer, MemInfo[], MemInfo[], C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ long f257588d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C89505i(long j) {
            super(4);
            this.f257588d = j;
        }

        /* renamed from: I */
        public Object mo162I(Object obj, Object obj2, Object obj3, Object obj4) {
            int intValue = ((Number) obj).intValue();
            ((Number) obj2).intValue();
            MemInfo[] memInfoArr = (MemInfo[]) obj3;
            C87412m.m108594g(memInfoArr, "amsMemInfos");
            C87412m.m108594g((MemInfo[]) obj4, "debugMemInfos");
            ((C119157j) C119157j.f356862d).mo183884o(new C89533y(this.f257588d, memInfoArr, intValue));
            return C13598b0.f38549a;
        }
    }

    static {
        TimeUnit timeUnit = TimeUnit.MINUTES;
        f257574b = timeUnit.toMillis(1);
        f257575c = timeUnit.toMillis(3);
        f257576d = timeUnit.toMillis(5);
        f257577e = timeUnit.toMillis(15);
        f257578f = timeUnit.toMillis(35);
    }

    /* renamed from: a */
    public static final void m111882a(C89496f fVar, MemInfo[] memInfoArr, int i, int i2, long j) {
        fVar.getClass();
        String str = "";
        if (memInfoArr.length == 0) {
            Log.m105920e("MicroMsg.monitor.AppBackgroundMemory", "MemInfo is empty!!");
            return;
        }
        try {
            FileSystem.C85995c b = ((C116340x0) C116281f0.C116289i.f348994a.mo177788a()).mo177847b("hprofs");
            if (b != null) {
                b.mo119928a(new CancellationSignal());
            }
            C36961c.C36962a.m41108a(RemoteTrigger.f79440d, false, i, (C32226l) null, 5, (Object) null);
        } catch (Throwable th) {
            C118672d.m167354d("MicroMsg.monitor.AppBackgroundMemory", th, str, new Object[0]);
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("xweb-sdk", XWebSdk.getXWebSdkVersion());
            jSONObject.put("xweb-apk", XWebSdk.getAvailableVersion());
            str = C91191l.m114455a(jSONObject);
        } catch (Throwable th4) {
            C118672d.m167354d("MicroMsg.monitor.AppBackgroundMemory", th4, str, new Object[0]);
        }
        String str2 = str;
        C91190k.C26537a aVar = C91190k.f261451a;
        String a = C91191l.m114455a(fVar.mo123799l(memInfoArr));
        boolean z = BuildInfo.IS_ARM64;
        SystemInfo systemInfo = ((MemInfo) C110823p.m150976B(memInfoArr)).f235675i;
        C87412m.m108591d(systemInfo);
        String a2 = C91191l.m114455a(systemInfo.mo112194a());
        String str3 = BuildInfo.BUILD_TAG;
        String str4 = BuildInfo.REV;
        C87412m.m108593f(str3, "BUILD_TAG");
        C87412m.m108593f(str4, "REV");
        C91190k.C26538b bVar = new C91190k.C26538b(i, "All", 0, 0, 0, 0, 0, 0, (String) null, 0, (String) null, i2, a, 0, 0, 0, (String) null, (String) null, 0, 0, 0, 0, z ? 1 : 0, j, a2, (String) null, str2, 0, 0, str3, str4, 0, 0, -1707087876, 1, (C8480h) null);
        Log.m105924i("MicroMsg.monitor.AppBackgroundMemory", bVar.toString());
        aVar.mo53491a(bVar);
        Log.m105924i("MicroMsg.monitor.AppBackgroundMemory", "report24556 done");
    }

    /* renamed from: b */
    public final C89612g mo123789b() {
        long k = mo123798k(500.0d);
        return new C89612g(true, AppDeepBackgroundOwner.INSTANCE, f257574b, k, MAlarmHandler.NEXT_FIRE_INTERVAL, 0, new C89497a(k), (C32224a) null, 160, (C8480h) null);
    }

    /* renamed from: c */
    public final C89612g mo123790c() {
        long k = mo123798k(700.0d);
        return new C89612g(true, AppDeepBackgroundOwner.INSTANCE, f257574b, k, MAlarmHandler.NEXT_FIRE_INTERVAL, 0, new C89498b(k), (C32224a) null, 160, (C8480h) null);
    }

    /* renamed from: d */
    public final C89612g mo123791d() {
        long k = mo123798k(900.0d);
        return new C89612g(true, AppDeepBackgroundOwner.INSTANCE, f257574b, k, MAlarmHandler.NEXT_FIRE_INTERVAL, 0, new C89499c(k), (C32224a) null, 160, (C8480h) null);
    }

    /* renamed from: e */
    public final C89612g mo123792e() {
        long k = mo123798k(500.0d);
        return new C89612g(true, AppDeepBackgroundOwner.INSTANCE, f257575c, k, MAlarmHandler.NEXT_FIRE_INTERVAL, 0, new C89500d(k), (C32224a) null, 160, (C8480h) null);
    }

    /* renamed from: f */
    public final C89612g mo123793f() {
        long k = mo123798k(700.0d);
        return new C89612g(true, AppDeepBackgroundOwner.INSTANCE, f257575c, k, MAlarmHandler.NEXT_FIRE_INTERVAL, 0, new C89501e(k), (C32224a) null, 160, (C8480h) null);
    }

    /* renamed from: g */
    public final C89612g mo123794g() {
        long k = mo123798k(900.0d);
        return new C89612g(true, AppDeepBackgroundOwner.INSTANCE, 0, k, MAlarmHandler.NEXT_FIRE_INTERVAL, 0, new C89502f(k), (C32224a) null, 164, (C8480h) null);
    }

    /* renamed from: h */
    public final C89612g mo123795h() {
        long k = mo123798k(500.0d);
        return new C89612g(true, AppDeepBackgroundOwner.INSTANCE, f257576d, k, MAlarmHandler.NEXT_FIRE_INTERVAL, 0, new C89503g(k), (C32224a) null, 160, (C8480h) null);
    }

    /* renamed from: i */
    public final C89612g mo123796i() {
        long k = mo123798k(700.0d);
        return new C89612g(true, AppDeepBackgroundOwner.INSTANCE, f257576d, k, MAlarmHandler.NEXT_FIRE_INTERVAL, 0, new C89504h(k), (C32224a) null, 160, (C8480h) null);
    }

    /* renamed from: j */
    public final C89612g mo123797j() {
        C79760s.m96908a("stagedBgConfig_3min config expt");
        long j = (long) (1.3d * ((double) 1024) * ((double) 1024));
        C79760s.m96909b();
        C79760s.m96908a("stagedBgConfig_3min create config");
        C89612g gVar = new C89612g(true, AppStagedBackgroundOwner.INSTANCE, 0, j, MAlarmHandler.NEXT_FIRE_INTERVAL, 0, new C89505i(j), (C32224a) null, 164, (C8480h) null);
        C79760s.m96909b();
        return gVar;
    }

    /* renamed from: k */
    public final long mo123798k(double d) {
        return (long) (d * ((double) 1024));
    }

    /* renamed from: l */
    public final JSONObject mo123799l(MemInfo[] memInfoArr) {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONArray jSONArray = new JSONArray();
            jSONObject.put("count", memInfoArr.length);
            jSONObject.put("detail", jSONArray);
            ArrayList<JSONObject> arrayList = new ArrayList<>(memInfoArr.length);
            for (MemInfo memInfo : memInfoArr) {
                JSONObject jSONObject2 = new JSONObject();
                ProcessInfo processInfo = memInfo.f235671e;
                C87412m.m108591d(processInfo);
                jSONObject2.put("process", processInfo.f235683e);
                ProcessInfo processInfo2 = memInfo.f235671e;
                C87412m.m108591d(processInfo2);
                jSONObject2.put("pid", processInfo2.f235682d);
                PssInfo pssInfo = memInfo.f235676j;
                C87412m.m108591d(pssInfo);
                jSONObject2.put("amsPss", pssInfo.mo112172a());
                arrayList.add(jSONObject2);
            }
            for (JSONObject put : arrayList) {
                jSONArray.put(put);
            }
        } catch (Throwable th) {
            C118672d.m167354d("MicroMsg.monitor.AppBackgroundMemory", th, "", new Object[0]);
        }
        return jSONObject;
    }
}
