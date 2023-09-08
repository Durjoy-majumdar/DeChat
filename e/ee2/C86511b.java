package ee2;

import android.os.Debug;
import android.os.Process;
import android.text.TextUtils;
import be2.C79693c;
import ce2.C28544a;
import com.tencent.mars.smc.IDKey;
import com.tencent.matrix.hook.C80379a;
import com.tencent.matrix.hook.memory.MemoryHook;
import com.tencent.matrix.lifecycle.C80401d;
import com.tencent.matrix.lifecycle.owners.ProcessExplicitBackgroundOwner;
import com.tencent.matrix.lifecycle.owners.ProcessUILifecycleOwner;
import com.tencent.p014mm.booter.C80814d;
import com.tencent.p014mm.matrix.dice.C80982a;
import com.tencent.p014mm.plugin.performance.diagnostic.C30338e;
import com.tencent.p014mm.plugin.performance.diagnostic.C85311d;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.xweb.WCWebUpdater;
import di3.C86312j;
import f40.C86709a0;
import h81.C32735h;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.concurrent.TimeUnit;
import kj2.C117407d;
import oa1.C117731d;
import org.json.JSONArray;
import org.json.JSONObject;
import p723vf.C118672d;
import qe3.C89625d;

/* renamed from: ee2.b */
public class C86511b extends C85311d<MemoryHook, C86510a> implements C80982a.C80983a {

    /* renamed from: i */
    public static String f251349i = "MicroMsg.MemoryHookLogic";

    /* renamed from: j */
    public static final C86009m1 f251350j;

    /* renamed from: n */
    public static final C86009m1 f251351n;

    /* renamed from: o */
    public static final C86009m1 f251352o;

    /* renamed from: g */
    public final C86510a f251353g = new C86510a(this);

    /* renamed from: h */
    public volatile long f251354h = 0;

    /* renamed from: ee2.b$a */
    public class C86512a extends C80401d {
        public C86512a() {
        }

        /* renamed from: a */
        public void mo17850a() {
            C86511b.this.f251354h = System.currentTimeMillis();
        }

        /* renamed from: b */
        public void mo17851b() {
            C86511b.this.f251354h = 0;
        }
    }

    static {
        String m = C85311d.m105270m();
        f251349i += m;
        String str = MMApplicationContext.getContext().getFilesDir().getAbsolutePath() + "/" + "memory_hook";
        String str2 = str + "/" + m + Process.myPid() + "_memory_hook.log";
        String str3 = str + "/" + m + Process.myPid() + "_memory_hook.json";
        f251350j = new C86009m1(str);
        f251351n = new C86009m1(str2);
        f251352o = new C86009m1(str3);
        Log.m105925i(f251349i, "init dump file path = %s", str2);
        Log.m105925i(f251349i, "init json file path = %s", str3);
    }

    /* renamed from: S1 */
    public double mo55862S1() {
        C80814d dVar = C86709a0.m107531m().mo58407a().f254268g;
        if (dVar != null && Util.nullAs(dVar.mo112567a(".com.tencent.mm.debug.disable_memory_hook"), false)) {
            Log.m105924i(f251349i, "disable memory hook by coolassist");
            return -1.0d;
        } else if (BuildInfo.ENABLE_MATRIX_MEMORY_HOOK) {
            Log.m105924i(f251349i, "enable memory hook by build config");
            return 1.0d;
        } else if (BuildInfo.IS_FLAVOR_P_ALPHA || C89625d.f257845k) {
            Log.m105924i(f251349i, "enable memory hook for Alpha");
            return 1.0d;
        } else if (!BuildInfo.DEBUG && Log.getLogLevel() > 1) {
            return 1.0d / ((double) ((C32735h) C86312j.m106911c(C32735h.class)).mo58777He(C32735h.C32737c.clicfg_diagnostic_memory_hook_expt_rate_denominator_v2, 10000));
        } else {
            Log.m105924i(f251349i, "enable memory hook for DEBUG");
            return 1.0d;
        }
    }

    public long b00() {
        return TimeUnit.DAYS.toMinutes(1);
    }

    /* renamed from: d */
    public void mo56051d() {
        Log.m105925i(f251349i, "onRegistered: %s", "MemoryHook");
        C30338e.f81885e.mo57287a("memory", this);
        C80982a.f237863f.mo112806a(this);
        ProcessExplicitBackgroundOwner.INSTANCE.addLifecycleCallback((C80401d) new C86512a());
    }

    /* renamed from: g */
    public C85311d.C85313b mo118533g() {
        return this.f251353g;
    }

    /* renamed from: h */
    public String mo118534h() {
        return "MemoryHook";
    }

    /* renamed from: i */
    public String mo118535i() {
        StringBuilder sb = new StringBuilder();
        sb.append("hook=");
        C86510a aVar = this.f251353g;
        sb.append(aVar.f248523a.decodeString(aVar.f251340l, ""));
        sb.append(",");
        sb.append("stack=");
        C86510a aVar2 = this.f251353g;
        sb.append(aVar2.f248523a.decodeBool(aVar2.f251342n, false));
        sb.append(",");
        sb.append("mmap=");
        C86510a aVar3 = this.f251353g;
        sb.append(aVar3.f248523a.decodeBool(aVar3.f251347s, false));
        sb.append("\t");
        return sb.toString();
    }

    /* renamed from: j */
    public void mo118536j(C85311d.C85317e eVar) {
        Log.m105925i(f251349i, "onHookEnabled: source = %s", eVar.name());
        ArrayList arrayList = new ArrayList();
        IDKey iDKey = new IDKey(1571, 2, 1);
        IDKey iDKey2 = new IDKey(1571, MMApplicationContext.isMainProcess() ? 40 : MMApplicationContext.isAppBrandProcess() ? 41 : (MMApplicationContext.isToolsProcess() || MMApplicationContext.isToolsIsolatedProcess()) ? 42 : -1, 1);
        arrayList.add(iDKey);
        arrayList.add(iDKey2);
        C117407d.INSTANCE.mo160124a(arrayList, false);
    }

    /* renamed from: kD */
    public void mo55864kD(double d) {
        Log.m105924i(f251349i, "dice action !");
        C86510a aVar = this.f251353g;
        if (aVar.f248523a.decodeInt(aVar.f248531i, 0) > 3) {
            Log.m105920e(f251349i, "skip process cmd, crashed for more than 3 times");
            return;
        }
        C28544a.INSTANCE.mo56047c(C117731d.m166007c().mo182444f("clicfg_diagnostic_memory_hook_expt_cmd", "<cmd><diagnostic><MemoryHook enable='1' source='expt' process='all' duration='24' hook='.*com\\.tencent\\.mm.*\\.so$;.*libhwui\\.so$;.*libEGL\\.so$;.*libGLES.*\\.so$;.*libstagefright_foundation\\.so$;.*libstagefright\\.so$' stack='1' min='0' max='0' force='1' enableExpt='0' sampling='1' mmap='0'/></diagnostic></cmd>", false, true));
        ArrayList arrayList = new ArrayList();
        IDKey iDKey = new IDKey(1571, 0, 1);
        IDKey iDKey2 = new IDKey(1571, MMApplicationContext.isMainProcess() ? 20 : MMApplicationContext.isAppBrandProcess() ? 21 : (MMApplicationContext.isToolsProcess() || MMApplicationContext.isToolsIsolatedProcess()) ? 22 : -1, 1);
        arrayList.add(iDKey);
        arrayList.add(iDKey2);
        C117407d.INSTANCE.mo160124a(arrayList, false);
    }

    public String key() {
        return "MemoryHook";
    }

    /* renamed from: n */
    public C80379a mo118539n() {
        C86510a aVar = this.f251353g;
        String decodeString = aVar.f248523a.decodeString(aVar.f251340l, "");
        C86510a aVar2 = this.f251353g;
        String decodeString2 = aVar2.f248523a.decodeString(aVar2.f251341m, "");
        C86510a aVar3 = this.f251353g;
        boolean decodeBool = aVar3.f248523a.decodeBool(aVar3.f251342n, false);
        C86510a aVar4 = this.f251353g;
        int decodeInt = aVar4.f248523a.decodeInt(aVar4.f251343o, 0);
        C86510a aVar5 = this.f251353g;
        int decodeInt2 = aVar5.f248523a.decodeInt(aVar5.f251344p, 0);
        C86510a aVar6 = this.f251353g;
        double decodeDouble = aVar6.f248523a.decodeDouble(aVar6.f251345q, 1.0d);
        C86510a aVar7 = this.f251353g;
        boolean decodeBool2 = aVar7.f248523a.decodeBool(aVar7.f251346r, false);
        C86510a aVar8 = this.f251353g;
        boolean decodeBool3 = aVar8.f248523a.decodeBool(aVar8.f251347s, false);
        C86510a aVar9 = this.f251353g;
        int decodeInt3 = aVar9.f248523a.decodeInt(aVar9.f251348t, 52428800);
        Log.m105925i(f251349i, "hook:%s, ignore:%s, enableStacktrace:%s, min:%d, max:%d, sampling:%f, extreme:%s, mmap:%s, stacklog:%s", decodeString, decodeString2, Boolean.valueOf(decodeBool), Integer.valueOf(decodeInt), Integer.valueOf(decodeInt2), Double.valueOf(decodeDouble), Boolean.valueOf(decodeBool2), Boolean.valueOf(decodeBool3), Integer.valueOf(decodeInt3));
        if (TextUtils.isEmpty(decodeString)) {
            Log.m105920e(f251349i, "ERROR(MemoryHook): hook regex is blank");
            return null;
        }
        String[] split = decodeString.split(";");
        String[] split2 = decodeString2.split(";");
        MemoryHook memoryHook = MemoryHook.f235293j;
        memoryHook.getClass();
        for (String str : split) {
            if (TextUtils.isEmpty(str)) {
                C118672d.m167352b("Matrix.MemoryHook", "thread regex is empty!!!", new Object[0]);
            } else {
                ((HashSet) memoryHook.f235294b).add(str);
            }
        }
        for (String str2 : split2) {
            if (!TextUtils.isEmpty(str2)) {
                ((HashSet) memoryHook.f235295c).add(str2);
            }
        }
        memoryHook.f235299g = decodeBool;
        memoryHook.f235296d = decodeInt;
        memoryHook.f235297e = decodeInt2;
        memoryHook.f235298f = decodeInt3;
        memoryHook.f235300h = decodeBool3;
        return memoryHook;
    }

    /* renamed from: p */
    public void mo118541p(boolean z) {
        if (z) {
            if (Debug.getNativeHeapAllocatedSize() > 524288000) {
                mo120986r((String) null, f251352o.mo119971i());
            }
            mo120987s(false, 0);
            return;
        }
        C86009m1 m1Var = f251351n;
        mo120986r(m1Var.mo119971i(), f251352o.mo119971i());
        mo120987s(false, 0);
        C79693c.m96810d(f251349i, m1Var);
    }

    /* renamed from: r */
    public final void mo120986r(String str, String str2) {
        Log.m105924i(f251349i, "memory dump begin");
        long currentTimeMillis = System.currentTimeMillis();
        try {
            C86009m1 m1Var = f251350j;
            if (!m1Var.mo119967g()) {
                m1Var.mo119987x();
            }
            MemoryHook.f235293j.mo111842d(str, str2);
            Log.m105925i(f251349i, "dump path = %s, json path = %s", f251351n.mo119971i(), f251352o.mo119971i());
        } catch (Exception e) {
            Log.printErrStackTrace(f251349i, e, "something wrong when dumping", new Object[0]);
        }
        Log.m105925i(f251349i, "memory dump end, cost = %d", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    /* renamed from: s */
    public final void mo120987s(boolean z, int i) {
        C86009m1 m1Var = f251352o;
        try {
            JSONObject jSONObject = new JSONObject(C79693c.m96811e(m1Var.mo119971i()));
            ProcessUILifecycleOwner.f235399x.getClass();
            String str = ProcessUILifecycleOwner.f235392q;
            Log.m105925i(f251349i, "recent scene @ %s", str);
            mo120989u(jSONObject, "NativeHeap", z, i, str);
            mo120989u(jSONObject, "mmap", z, i, str);
            mo120988t(jSONObject, "SoNativeSize", z, i, str);
            mo120988t(jSONObject, "SoMmapSize", z, i, str);
            m1Var.mo119966f();
        } catch (Throwable th) {
            f251352o.mo119966f();
            throw th;
        }
    }

    /* renamed from: t */
    public final void mo120988t(JSONObject jSONObject, String str, boolean z, int i, String str2) {
        String str3 = str;
        try {
            JSONArray jSONArray = jSONObject.getJSONArray(str);
            if (jSONArray.length() <= 0) {
                Log.m105924i(f251349i, "reportSoSizeJson: report nothing");
            }
            String valueOf = String.valueOf(Debug.getNativeHeapAllocatedSize());
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                ArrayList arrayList = new ArrayList();
                if ("SoNativeSize".equalsIgnoreCase(str3)) {
                    arrayList.add(z ? "8" : WCWebUpdater.XWEB_UPDATER_START_CHECK_TYPE_EMBEDINSTALL);
                } else if ("SoMmapSize".equalsIgnoreCase(str3)) {
                    arrayList.add(z ? "9" : WCWebUpdater.XWEB_UPDATER_START_CHECK_TYPE_CONFIG_ONLY);
                }
                arrayList.add(MMApplicationContext.getProcessName());
                JSONObject jSONObject2 = jSONArray.getJSONObject(i2);
                String[] split = jSONObject2.getString("so").split("/");
                arrayList.add(split[split.length - 1]);
                String string = jSONObject2.getString("size");
                arrayList.add(string);
                long j = 0;
                if (Util.getLong(string, 0) < 1048576) {
                    Log.m105925i(f251349i, "so size %s < 1M", string);
                    return;
                }
                while (arrayList.size() < 26) {
                    arrayList.add("");
                }
                arrayList.add(valueOf);
                boolean active = ProcessExplicitBackgroundOwner.INSTANCE.active();
                if (active) {
                    try {
                        j = System.currentTimeMillis() - this.f251354h;
                    } catch (Throwable th) {
                        th = th;
                        Log.printErrStackTrace(f251349i, th, "reportSoSizeJson", new Object[0]);
                    }
                }
                arrayList.add(active ? "2" : "1");
                arrayList.add(String.valueOf(j));
                Log.m105925i(f251349i, "dumpAndReport: isBackground=%s, bgDuration=%s", Boolean.valueOf(active), Long.valueOf(j));
                arrayList.add(String.valueOf(Process.myPid()));
                arrayList.add(BuildInfo.BUILD_TAG);
                arrayList.add(BuildInfo.REV);
                arrayList.add(String.valueOf(i));
                arrayList.add(str2);
                C117407d.INSTANCE.mo160137l(21217, arrayList);
                Log.m105919d(f251349i, "report -> %s", Arrays.toString(arrayList.toArray()));
            }
        } catch (Throwable th4) {
            th = th4;
            Log.printErrStackTrace(f251349i, th, "reportSoSizeJson", new Object[0]);
        }
    }

    /* renamed from: u */
    public final void mo120989u(JSONObject jSONObject, String str, boolean z, int i, String str2) {
        try {
            JSONArray jSONArray = jSONObject.getJSONArray(str);
            if (jSONArray.length() <= 0) {
                Log.m105924i(f251349i, "reportStacktraceJson: report nothing");
                return;
            }
            ArrayList arrayList = new ArrayList();
            String str3 = "1";
            if ("mmap".equalsIgnoreCase(str)) {
                arrayList.add(z ? "7" : str3);
            } else if ("NativeHeap".equalsIgnoreCase(str)) {
                arrayList.add(z ? WCWebUpdater.XWEB_UPDATER_START_CHECK_TYPE_NOTIFY_ONLY_INSTALL_EMBED_PLUGIN : "0");
            }
            arrayList.add(MMApplicationContext.getProcessName());
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i2);
                String[] split = jSONObject2.getString("so").split("/");
                arrayList.add(split[split.length - 1]);
                arrayList.add(jSONObject2.getString("size"));
                JSONArray jSONArray2 = jSONObject2.getJSONArray("top_stacks");
                for (int i3 = 0; i3 < jSONArray2.length(); i3++) {
                    JSONObject jSONObject3 = jSONArray2.getJSONObject(i3);
                    arrayList.add(jSONObject3.getString("stack"));
                    arrayList.add(jSONObject3.getString("size"));
                }
            }
            while (arrayList.size() < 26) {
                arrayList.add("");
            }
            arrayList.add(String.valueOf(Debug.getNativeHeapAllocatedSize()));
            boolean active = ProcessExplicitBackgroundOwner.INSTANCE.active();
            long currentTimeMillis = active ? System.currentTimeMillis() - this.f251354h : 0;
            if (active) {
                str3 = "2";
            }
            arrayList.add(str3);
            arrayList.add(String.valueOf(currentTimeMillis));
            Log.m105925i(f251349i, "dumpAndReport: isBackground=%s, bgDuration=%s", Boolean.valueOf(active), Long.valueOf(currentTimeMillis));
            arrayList.add(String.valueOf(Process.myPid()));
            arrayList.add(BuildInfo.BUILD_TAG);
            arrayList.add(BuildInfo.REV);
            arrayList.add(String.valueOf(i));
            arrayList.add(str2);
            C117407d.INSTANCE.mo160137l(21217, arrayList);
            Log.m105919d(f251349i, "report: %s", Arrays.toString(arrayList.toArray()));
        } catch (Throwable th) {
            Log.printErrStackTrace(f251349i, th, "reportStacktraceJson", new Object[0]);
        }
    }
}
