package ge0;

import android.content.Context;
import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.pluginsdk.cmd.C30650a;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import di3.C86301e;
import di3.C86312j;
import ei3.C86522b;
import f40.C86709a0;
import he0.C46021h;
import he0.C46024k;
import ie0.C46226q;
import java.util.HashMap;
import re0.C36305b;
import re0.C36307d;
import re0.C36308e;
import re0.C36309f;
import re0.C36311h;
import re0.C36313j;
import re0.C36315l;
import ve0.C37723a;
import zh3.C91753f;

@C86522b(onProcess = {C80625v0.MATCH_MM, C80625v0.MATCH_TOOLS, C80625v0.MATCH_APPBRAND})
/* renamed from: ge0.b */
public class C32415b extends C86301e implements C46024k {

    /* renamed from: n */
    public static HashMap<Integer, C91753f.C66827b> f85982n;

    /* renamed from: d */
    public C36307d f85983d;

    /* renamed from: e */
    public C36305b f85984e;

    /* renamed from: f */
    public C36315l f85985f;

    /* renamed from: g */
    public C36311h f85986g;

    /* renamed from: h */
    public C36313j f85987h;

    /* renamed from: i */
    public C46226q f85988i;

    /* renamed from: j */
    public C36309f f85989j;

    /* renamed from: ge0.b$a */
    public class C32416a implements C91753f.C66827b {
        /* renamed from: a */
        public String[] mo6410a() {
            return C36305b.f96655e;
        }
    }

    /* renamed from: ge0.b$b */
    public class C32417b implements C91753f.C66827b {
        /* renamed from: a */
        public String[] mo6410a() {
            return C36307d.f96658e;
        }
    }

    /* renamed from: ge0.b$c */
    public class C32418c implements C91753f.C66827b {
        /* renamed from: a */
        public String[] mo6410a() {
            return C36315l.f96670e;
        }
    }

    /* renamed from: ge0.b$d */
    public class C32419d implements C91753f.C66827b {
        /* renamed from: a */
        public String[] mo6410a() {
            StringBuilder sb = new StringBuilder();
            sb.append("OpenIMFinderInfoNew_TABLE ");
            String[] strArr = C36311h.f96664e;
            sb.append(strArr[0]);
            Log.m105924i("MicroMsg.PluginOpenIM", sb.toString());
            return strArr;
        }
    }

    /* renamed from: ge0.b$e */
    public class C32420e implements C91753f.C66827b {
        /* renamed from: a */
        public String[] mo6410a() {
            return C36313j.f96667e;
        }
    }

    /* renamed from: ge0.b$f */
    public class C32421f implements C91753f.C66827b {
        /* renamed from: a */
        public String[] mo6410a() {
            return C46226q.f124608f;
        }
    }

    /* renamed from: ge0.b$g */
    public class C32422g implements C91753f.C66827b {
        /* renamed from: a */
        public String[] mo6410a() {
            return C36309f.f96661e;
        }
    }

    static {
        HashMap<Integer, C91753f.C66827b> hashMap = new HashMap<>();
        f85982n = hashMap;
        hashMap.put(-923510998, new C32416a());
        f85982n.put(1560773163, new C32417b());
        f85982n.put(-565094361, new C32418c());
        f85982n.put(64785613, new C32419d());
        f85982n.put(-256987579, new C32420e());
        f85982n.put(340868664, new C32421f());
        f85982n.put(-862743677, new C32422g());
    }

    public C36313j Ax0() {
        C86709a0.m107523b().mo121108c();
        if (this.f85987h == null) {
            C86709a0.m107528h();
            this.f85987h = new C36313j(C86709a0.m107535s().f251811i);
        }
        return this.f85987h;
    }

    public C36315l Bx0() {
        C86709a0.m107523b().mo121108c();
        if (this.f85985f == null) {
            C86709a0.m107528h();
            this.f85985f = new C36315l(C86709a0.m107535s().f251811i);
        }
        return this.f85985f;
    }

    /* renamed from: ma */
    public void mo58604ma(String str) {
        mo58603iN().delete(new C36308e(str, (String) null), new String[0]);
    }

    public void onAccountInitialized(Context context) {
        Log.m105924i("MicroMsg.PluginOpenIM", "onAccountInitialized");
        ((C46021h) C86312j.m106911c(C46021h.class)).mo71459at();
    }

    public void onAccountReleased(Context context) {
        Log.m105924i("MicroMsg.PluginOpenIM", "onAccountRelease");
        ((C46021h) C86312j.m106911c(C46021h.class)).mo71462l();
    }

    public void onCreate(Context context) {
        if (MMApplicationContext.isMainProcess()) {
            C30650a.m39147b(new C37723a(), "//im");
        } else if (!MMApplicationContext.isToolsProcess()) {
            MMApplicationContext.isAppBrandProcess();
        }
    }

    public C36305b vx0() {
        C86709a0.m107523b().mo121108c();
        if (this.f85984e == null) {
            C86709a0.m107528h();
            this.f85984e = new C36305b(C86709a0.m107535s().f251811i);
        }
        return this.f85984e;
    }

    /* renamed from: wK */
    public String mo58606wK(String str) {
        C36308e eVar = new C36308e(str, (String) null);
        mo58603iN().get(eVar, new String[0]);
        return eVar.field_content;
    }

    public C36307d wx0() {
        C86709a0.m107523b().mo121108c();
        if (this.f85983d == null) {
            C86709a0.m107528h();
            this.f85983d = new C36307d(C86709a0.m107535s().f251811i);
        }
        return this.f85983d;
    }

    /* renamed from: xx0 */
    public C36309f mo58603iN() {
        C86709a0.m107523b().mo121108c();
        if (this.f85989j == null) {
            C86709a0.m107528h();
            this.f85989j = new C36309f(C86709a0.m107535s().f251811i);
        }
        return this.f85989j;
    }

    public C46226q yx0() {
        C86709a0.m107523b().mo121108c();
        if (this.f85988i == null) {
            C86709a0.m107528h();
            this.f85988i = new C46226q(C86709a0.m107535s().f251811i);
        }
        return this.f85988i;
    }

    public C36311h zx0() {
        C86709a0.m107523b().mo121108c();
        if (this.f85986g == null) {
            C86709a0.m107528h();
            this.f85986g = new C36311h(C86709a0.m107535s().f251811i);
        }
        return this.f85986g;
    }
}
