package l42;

import com.tencent.p014mm.plugin.appbrand.appstorage.C81410b0;
import com.tencent.p014mm.plugin.appbrand.appstorage.C81461w;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import js0.C9514m;
import z04.C112551y;

/* renamed from: l42.a */
public final class C88380a extends C81461w {
    public C81410b0 readFile(String str, C9514m<ByteBuffer> mVar) {
        C87412m.m108594g(mVar, "pByteBuffer");
        if (C112551y.m153810j(str, "magicbrush.json", false, 2, (Object) null)) {
            mVar.f29691a = StandardCharsets.UTF_8.encode("{ \"publicservices\": { \"MBDemoService\": { \"provider\": \"MBDemoService\", \"version\": \"0\" } } }");
        } else {
            mVar.f29691a = StandardCharsets.UTF_8.encode("test read file");
        }
        Log.m105918d("MagicBrushDemoFileSystem", "readFile path:" + str);
        return C81410b0.OK;
    }
}
