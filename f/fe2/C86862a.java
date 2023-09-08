package fe2;

import android.text.TextUtils;
import com.tencent.matrix.hook.C80379a;
import com.tencent.p014mm.plugin.performance.diagnostic.C85311d;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.Map;

/* renamed from: fe2.a */
public class C86862a extends C85311d.C85313b {

    /* renamed from: l */
    public final String f252151l;

    /* renamed from: m */
    public final String f252152m;

    /* renamed from: n */
    public final String f252153n;

    public C86862a(C85311d<? extends C80379a, ? extends C85311d.C85313b> dVar) {
        super(dVar);
        this.f252151l = dVar.mo56049b() + ".$hook";
        this.f252152m = dVar.mo56049b() + ".$ignore";
        this.f252153n = dVar.mo56049b() + ".$thread";
    }

    /* renamed from: a */
    public void mo118543a(Map<String, String> map) {
        super.mo118543a(map);
        String str = map.get(this.f252151l);
        if (TextUtils.isEmpty(str)) {
            Log.m105920e("MicroMsg.PthreadHookConfigStg", "ERROR(PthreadHook): hook regex is blank");
            return;
        }
        this.f248523a.encode(this.f252151l, str);
        this.f248523a.encode(this.f252152m, map.get(this.f252152m));
        this.f248523a.encode(this.f252153n, map.get(this.f252153n));
    }

    /* renamed from: c */
    public long mo118545c() {
        return -1;
    }
}
