package fe2;

import android.os.Process;
import android.text.TextUtils;
import be2.C79693c;
import ce2.C28544a;
import com.tencent.mars.smc.IDKey;
import com.tencent.matrix.hook.C80379a;
import com.tencent.matrix.hook.pthread.PthreadHook;
import com.tencent.p014mm.matrix.dice.C80982a;
import com.tencent.p014mm.plugin.performance.diagnostic.C30338e;
import com.tencent.p014mm.plugin.performance.diagnostic.C85311d;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatEnvironment;
import com.tencent.p014mm.vfs.C86009m1;
import di3.C86312j;
import h81.C32735h;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kj2.C117407d;
import org.json.JSONArray;
import org.json.JSONObject;
import p723vf.C118672d;

/* renamed from: fe2.b */
public class C86863b extends C85311d<PthreadHook, C86862a> implements C80982a.C80983a {

    /* renamed from: h */
    public static String f252154h = "MicroMsg.PthreadHookLogic";

    /* renamed from: i */
    public static final C86009m1 f252155i;

    /* renamed from: j */
    public static final C86009m1 f252156j;

    /* renamed from: n */
    public static final Set<String> f252157n = new HashSet();

    /* renamed from: g */
    public final C86862a f252158g = new C86862a(this);

    static {
        boolean z = BuildInfo.DEBUG;
        String m = C85311d.m105270m();
        f252154h += m;
        String str = MMApplicationContext.getContext().getFilesDir().getAbsolutePath() + "/" + "pthread_hook";
        String str2 = str + "/" + m + Process.myPid() + "_pthread_hook.json";
        f252155i = new C86009m1(str);
        f252156j = new C86009m1(str2);
        Log.m105925i(f252154h, "init dump file path = %s", str2);
    }

    /* renamed from: S1 */
    public double mo55862S1() {
        if (!BuildInfo.ENABLE_MATRIX_PTHREAD_HOOK) {
            return 1.0d / ((double) ((C32735h) C86312j.m106911c(C32735h.class)).mo58777He(C32735h.C32737c.clicfg_diagnostic_pthread_hook_expt_rate_denominator, -1));
        }
        Log.m105924i(f252154h, "enable pthread hook by build config");
        return 1.0d;
    }

    public long b00() {
        return TimeUnit.DAYS.toMinutes(1);
    }

    /* renamed from: d */
    public void mo56051d() {
        Log.m105925i(f252154h, "onRegistered: %s", "PthreadHook");
        C30338e.f81885e.mo57287a("pthread", this);
        C80982a.f237863f.mo112806a(this);
    }

    /* renamed from: g */
    public C85311d.C85313b mo118533g() {
        return this.f252158g;
    }

    /* renamed from: h */
    public String mo118534h() {
        return "PthreadHook";
    }

    /* renamed from: i */
    public String mo118535i() {
        StringBuilder sb = new StringBuilder();
        sb.append("hook=");
        C86862a aVar = this.f252158g;
        sb.append(aVar.f248523a.decodeString(aVar.f252151l, ""));
        sb.append(",");
        sb.append("thread=");
        C86862a aVar2 = this.f252158g;
        sb.append(aVar2.f248523a.decodeString(aVar2.f252153n, ""));
        sb.append("\t");
        return sb.toString();
    }

    /* renamed from: j */
    public void mo118536j(C85311d.C85317e eVar) {
        ArrayList arrayList = new ArrayList();
        IDKey iDKey = new IDKey(1571, 12, 1);
        IDKey iDKey2 = new IDKey(1571, MMApplicationContext.isMainProcess() ? 70 : MMApplicationContext.isAppBrandProcess() ? 71 : (MMApplicationContext.isToolsProcess() || MMApplicationContext.isToolsIsolatedProcess()) ? 72 : -1, 1);
        arrayList.add(iDKey);
        arrayList.add(iDKey2);
        C117407d.INSTANCE.mo160124a(arrayList, false);
    }

    /* renamed from: kD */
    public void mo55864kD(double d) {
        C28544a.INSTANCE.mo56047c(((C32735h) C86312j.m106911c(C32735h.class)).Y60(C32735h.C32737c.clicfg_diagnostic_pthread_hook_expt_cmd, "<cmd><diagnostic><PthreadHook\n enable='1' process='all' duration='24' hook='.*\\.so$' thread='.*'/></diagnostic></cmd>"));
        ArrayList arrayList = new ArrayList();
        IDKey iDKey = new IDKey(1571, 10, 1);
        IDKey iDKey2 = new IDKey(1571, MMApplicationContext.isMainProcess() ? 50 : MMApplicationContext.isAppBrandProcess() ? 51 : (MMApplicationContext.isToolsProcess() || MMApplicationContext.isToolsIsolatedProcess()) ? 52 : -1, 1);
        arrayList.add(iDKey);
        arrayList.add(iDKey2);
        C117407d.INSTANCE.mo160124a(arrayList, false);
    }

    public String key() {
        return "PthreadHook";
    }

    /* renamed from: n */
    public C80379a mo118539n() {
        C86862a aVar = this.f252158g;
        String decodeString = aVar.f248523a.decodeString(aVar.f252151l, "");
        C86862a aVar2 = this.f252158g;
        String decodeString2 = aVar2.f248523a.decodeString(aVar2.f252152m, (String) null);
        C86862a aVar3 = this.f252158g;
        String decodeString3 = aVar3.f248523a.decodeString(aVar3.f252153n, "");
        String[] split = decodeString.split(";");
        String[] split2 = decodeString2 == null ? new String[0] : decodeString2.split(";");
        String[] split3 = decodeString3 == null ? new String[]{".*"} : decodeString3.split(";");
        Log.m105925i(f252154h, "hookRegex = %s (ignored)", Arrays.toString(split));
        Log.m105925i(f252154h, "ignoreRegex = %s (ignored)", Arrays.toString(split2));
        Log.m105925i(f252154h, "threadRegex = %s", Arrays.toString(split3));
        PthreadHook pthreadHook = PthreadHook.f235303h;
        pthreadHook.f235307e = true;
        for (String str : split3) {
            if (TextUtils.isEmpty(str)) {
                C118672d.m167352b("Matrix.Pthread", "thread regex is empty!!!", new Object[0]);
            } else {
                ((HashSet) pthreadHook.f235304b).add(str);
            }
        }
        return pthreadHook;
    }

    /* renamed from: p */
    public void mo118541p(boolean z) {
        C86009m1 m1Var;
        char c;
        Log.m105924i(f252154h, "memory dump begin");
        long currentTimeMillis = System.currentTimeMillis();
        int i = 0;
        try {
            C86009m1 m1Var2 = f252155i;
            if (!m1Var2.mo119967g()) {
                m1Var2.mo119987x();
            }
            PthreadHook pthreadHook = PthreadHook.f235303h;
            C86009m1 m1Var3 = f252156j;
            pthreadHook.mo111843d(m1Var3.mo119971i());
            Log.m105925i(f252154h, "dump path = %s", m1Var3.mo119971i());
        } catch (Exception e) {
            Log.printErrStackTrace(f252154h, e, "something wrong when dumping", new Object[0]);
        }
        Log.m105925i(f252154h, "memory dump end, cost = %d", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
        C86009m1 m1Var4 = new C86009m1(f252156j.mo119971i());
        String str = "\n\t";
        Log.m105925i(f252154h, ">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> dump file = %s, modified = %s", m1Var4.getName(), C79693c.m96812f(m1Var4.mo119979q()));
        try {
            JSONArray jSONArray = new JSONObject(C79693c.m96811e(m1Var4.mo119971i())).getJSONArray("PthreadHook_not_exited");
            long currentTimeMillis2 = System.currentTimeMillis();
            int i2 = 0;
            while (i2 < jSONArray.length()) {
                JSONObject jSONObject = jSONArray.getJSONObject(i2);
                long j = Util.getLong(jSONObject.getString("hash"), 0);
                String string = jSONObject.getString("native");
                String string2 = jSONObject.getString("java");
                int i3 = Util.getInt(jSONObject.getString("count"), i);
                JSONArray jSONArray2 = jSONObject.getJSONArray("threads");
                String str2 = f252154h;
                JSONArray jSONArray3 = jSONArray;
                m1Var = m1Var4;
                int i4 = i2;
                try {
                    Log.m105925i(str2, "------------------------------- hash= %d -------------------------------", Long.valueOf(j));
                    Log.m105925i(f252154h, "native\n\t%s", string.replace(";", str));
                    Log.m105925i(f252154h, "java\n\t%s", string2.replace(";", str));
                    Log.m105925i(f252154h, "ThreadCount = %d", Integer.valueOf(i3));
                    ArrayList arrayList = new ArrayList();
                    HashSet hashSet = new HashSet();
                    int i5 = 0;
                    while (i5 < jSONArray2.length()) {
                        StringBuilder sb = new StringBuilder();
                        String str3 = str;
                        JSONObject jSONObject2 = jSONArray2.getJSONObject(i5);
                        JSONArray jSONArray4 = jSONArray2;
                        sb.append("{");
                        sb.append(jSONObject2.getString("tid"));
                        sb.append("-");
                        sb.append(jSONObject2.getString("name"));
                        sb.append("}");
                        String sb4 = sb.toString();
                        arrayList.add(sb4);
                        if (!((HashSet) f252157n).contains(sb4)) {
                            hashSet.add(sb4);
                        }
                        i5++;
                        str = str3;
                        jSONArray2 = jSONArray4;
                    }
                    String str4 = str;
                    Log.m105925i(f252154h, "==> leaked threads : %s", arrayList.toString().replace(",", ""));
                    if (!hashSet.isEmpty()) {
                        C117407d.INSTANCE.mo160131h(19816, 0, Long.valueOf(currentTimeMillis2), Long.valueOf(j), string, string2, Integer.valueOf(i3), arrayList.toString().replace(",", ""), MMApplicationContext.getProcessName(), Integer.valueOf(Process.myPid()), BuildInfo.BUILD_TAG, BuildInfo.REV);
                        f252157n.addAll(hashSet);
                        Log.m105925i(f252154h, "reported %s", hashSet);
                    }
                    i2 = i4 + 1;
                    jSONArray = jSONArray3;
                    m1Var4 = m1Var;
                    str = str4;
                    i = 0;
                } catch (Exception e2) {
                    e = e2;
                    try {
                        c = 0;
                        Log.printErrStackTrace(f252154h, e, "report kv error", new Object[0]);
                        m1Var.mo119966f();
                        String str5 = f252154h;
                        Object[] objArr = new Object[2];
                        objArr[c] = m1Var.getName();
                        objArr[1] = C79693c.m96812f(m1Var.mo119979q());
                        Log.m105925i(str5, "<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<< dump file = %s, modified = %s", objArr);
                    } catch (Throwable th) {
                        th = th;
                        m1Var.mo119966f();
                        throw th;
                    }
                }
            }
            m1Var = m1Var4;
            if (WeChatEnvironment.isMonkeyEnv() || WeChatEnvironment.hasDebugger() || BuildInfo.IS_FLAVOR_RED || BuildInfo.DEBUG) {
                C79693c.m96808b(m1Var);
            }
            m1Var.mo119966f();
            c = 0;
        } catch (Exception e3) {
            e = e3;
            m1Var = m1Var4;
            c = 0;
            Log.printErrStackTrace(f252154h, e, "report kv error", new Object[0]);
            m1Var.mo119966f();
            String str52 = f252154h;
            Object[] objArr2 = new Object[2];
            objArr2[c] = m1Var.getName();
            objArr2[1] = C79693c.m96812f(m1Var.mo119979q());
            Log.m105925i(str52, "<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<< dump file = %s, modified = %s", objArr2);
        } catch (Throwable th4) {
            th = th4;
            m1Var = m1Var4;
            m1Var.mo119966f();
            throw th;
        }
        String str522 = f252154h;
        Object[] objArr22 = new Object[2];
        objArr22[c] = m1Var.getName();
        objArr22[1] = C79693c.m96812f(m1Var.mo119979q());
        Log.m105925i(str522, "<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<< dump file = %s, modified = %s", objArr22);
    }
}
