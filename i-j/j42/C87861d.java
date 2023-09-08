package j42;

import com.github.henryye.nativeiv.ImageDecodeConfig;
import com.tencent.p014mm.plugin.appbrand.appstorage.C81410b0;
import com.tencent.p014mm.sdk.platformtools.Log;
import d42.C86186n;
import gy3.C87412m;
import java.nio.ByteBuffer;
import js0.C9514m;
import p1030s6.C90132b;
import p225rc.C89912a;

/* renamed from: j42.d */
public final class C87861d implements C90132b {

    /* renamed from: a */
    public final /* synthetic */ C87830a f254352a;

    public C87861d(C87830a aVar) {
        this.f254352a = aVar;
    }

    /* renamed from: a */
    public String mo109801a() {
        return "appbrand_file";
    }

    public boolean accept(Object obj) {
        return true;
    }

    /* renamed from: b */
    public C90132b.C90133a mo109803b(Object obj, ImageDecodeConfig imageDecodeConfig) {
        C90132b.C90133a aVar = new C90132b.C90133a();
        C87412m.m108592e(obj, "null cannot be cast to non-null type kotlin.String");
        String str = (String) obj;
        String str2 = this.f254352a.f254274E;
        Log.m105924i(str2, "fetch data " + str);
        C86186n nVar = this.f254352a.f254284j;
        ByteBuffer byteBuffer = null;
        if (nVar != null) {
            C9514m mVar = new C9514m();
            C81410b0 readFile = nVar.mo109577a().readFile(str, mVar);
            C87412m.m108593f(readFile, "pkgManagement.provideFil…).readFile(path, pointer)");
            if (readFile == C81410b0.OK) {
                byteBuffer = (ByteBuffer) mVar.f29691a;
            }
            if (byteBuffer != null) {
                aVar.f258828a = new C89912a(byteBuffer);
            } else {
                String str3 = this.f254352a.f254274E;
                Log.m105920e(str3, "fetch " + str + " failed");
                aVar.f258829b = "Read file " + str + " failed";
            }
            return aVar;
        }
        C87412m.m108603p("pkgManagement");
        throw null;
    }
}
