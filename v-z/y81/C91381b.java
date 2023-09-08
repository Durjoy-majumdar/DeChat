package y81;

import a91.C79474a;
import b91.C79674a;
import b91.C79675b;
import b91.C79676c;
import com.eclipsesource.mmv8.C80135V8;
import com.eclipsesource.mmv8.JavaCallback;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import z81.C91623a;
import z81.C91624b;

/* renamed from: y81.b */
public class C91381b {

    /* renamed from: a */
    public C91624b f262076a = new C91623a();

    /* renamed from: b */
    public List<C79474a> f262077b;

    public C91381b() {
        ArrayList arrayList = new ArrayList();
        this.f262077b = arrayList;
        arrayList.add(new C79674a());
        this.f262077b.add(new C79676c());
        this.f262077b.add(new C79675b());
        for (C79474a next : this.f262077b) {
            C91623a aVar = (C91623a) this.f262076a;
            C80135V8 v8 = aVar.f262482a;
            boolean z = false;
            if (!(v8 == null || v8.isReleased() || next == null)) {
                try {
                    aVar.f262482a.registerJavaMethod((JavaCallback) next, next.mo109468b());
                    z = true;
                } catch (Throwable th) {
                    Log.m105921e("EdgeComputingJSScriptEngine", "[EdgeComputingJSScriptEngine] registerJsApi fail, jsApi : %s, msg : %s", next.mo109468b(), th.getMessage());
                }
            }
            if (!z) {
                Log.m105920e("EdgeComputingScriptService", "[EdgeComputingScriptService] registerJsApi fail, jsApi : " + next.mo109468b());
            }
        }
    }

    /* renamed from: a */
    public final String mo125348a(String str, int i, long j, long j2) {
        return "2" + "," + new SimpleDateFormat("yyyyMMdd").format(new Date(j)) + "," + j + "," + j2 + "," + str + "," + i;
    }

    /* renamed from: b */
    public void mo125349b() {
        C91624b bVar = this.f262076a;
        if (bVar != null) {
            C91623a aVar = (C91623a) bVar;
            C80135V8 v8 = aVar.f262482a;
            if (v8 != null && !v8.isReleased()) {
                try {
                    aVar.f262482a.release(true);
                } catch (Throwable th) {
                    Log.m105920e("EdgeComputingJSScriptEngine", "[EdgeComputingJSScriptEngine] release throw Throwable : " + th.getMessage());
                }
            }
            aVar.f262482a = null;
        }
        if (((ArrayList) this.f262077b).size() > 0) {
            Iterator it = ((ArrayList) this.f262077b).iterator();
            while (it.hasNext()) {
                ((C79474a) it.next()).release();
            }
            ((ArrayList) this.f262077b).clear();
        }
    }
}
