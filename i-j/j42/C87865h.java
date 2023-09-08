package j42;

import com.tencent.magicbrush.handler.p940fs.IMBFileSystem;
import com.tencent.p014mm.plugin.appbrand.appstorage.C81410b0;
import d42.C86186n;
import gy3.C87412m;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import js0.C9514m;

/* renamed from: j42.h */
public final class C87865h implements IMBFileSystem {

    /* renamed from: a */
    public final /* synthetic */ C87830a f254356a;

    public C87865h(C87830a aVar) {
        this.f254356a = aVar;
    }

    public byte[] readFile(String str) {
        C87412m.m108594g(str, "path");
        C86186n nVar = this.f254356a.f254284j;
        if (nVar != null) {
            C9514m mVar = new C9514m();
            C81410b0 readFile = nVar.mo109577a().readFile(str, mVar);
            C87412m.m108593f(readFile, "pkgManagement.provideFil…).readFile(path, pointer)");
            ByteBuffer byteBuffer = readFile == C81410b0.OK ? (ByteBuffer) mVar.f29691a : null;
            if (byteBuffer != null) {
                return byteBuffer.array();
            }
            return null;
        }
        C87412m.m108603p("pkgManagement");
        throw null;
    }

    public String readTextFile(String str) {
        C87412m.m108594g(str, "path");
        C86186n nVar = this.f254356a.f254284j;
        String str2 = null;
        if (nVar != null) {
            C9514m mVar = new C9514m();
            C81410b0 readFile = nVar.mo109577a().readFile(str, mVar);
            C87412m.m108593f(readFile, "pkgManagement.provideFil…).readFile(path, pointer)");
            ByteBuffer byteBuffer = readFile == C81410b0.OK ? (ByteBuffer) mVar.f29691a : null;
            if (byteBuffer != null) {
                str2 = StandardCharsets.UTF_8.decode(byteBuffer).toString();
            }
            return str2 == null ? "" : str2;
        }
        C87412m.m108603p("pkgManagement");
        throw null;
    }
}
