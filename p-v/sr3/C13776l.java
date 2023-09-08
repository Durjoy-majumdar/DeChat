package sr3;

import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C8480h;
import gy3.C87412m;
import java.io.StringReader;
import org.json.JSONObject;

/* renamed from: sr3.l */
public final class C13776l {

    /* renamed from: a */
    public static final C13777a f38895a = new C13777a((C8480h) null);

    /* renamed from: sr3.l$a */
    public static final class C13777a {
        public C13777a(C8480h hVar) {
        }

        /* renamed from: a */
        public final JSONObject mo13138a(String str) {
            C87412m.m108594g(str, "xml");
            try {
                Character ch = C118297h.f353550a;
                C118298i iVar = C118298i.f353559e;
                StringReader stringReader = new StringReader(str);
                C118290c cVar = new C118290c();
                C118299j jVar = new C118299j(stringReader);
                while (jVar.mo183079b()) {
                    jVar.mo183088i("<");
                    if (jVar.mo183079b()) {
                        C118297h.m166884b(jVar, cVar, (String) null, iVar);
                    }
                }
                return new JSONObject(cVar.toString());
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.Json.XmlToJsonUtil", e, "toJsonString", new Object[0]);
                return null;
            }
        }
    }
}
