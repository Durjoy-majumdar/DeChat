package hl2;

import com.tencent.p014mm.modelimage.C92836k;
import com.tencent.p014mm.modelimage.C92839m;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.XmlParser;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import f40.C86709a0;
import f62.C75700k0;
import gy3.C87412m;
import hl2.C98481i;
import java.util.Map;
import p158gt.C98201k;

/* renamed from: hl2.f */
public final class C98476f {

    /* renamed from: a */
    public static final C98476f f288832a = new C98476f();

    /* renamed from: a */
    public static final void m127926a(C98481i.C98483b bVar, long j, int i) {
        C87412m.m108594g(bVar, "request");
        C72963f4 b002 = ((C72972g4) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96095LE()).b00(j);
        C92836k NQ = ((C92839m) ((C98201k) C86312j.m106911c(C98201k.class)).mo137277xi()).mo127168NQ(b002.mo108768t(), b002.mo108774y2());
        Map<String, String> parseXml = XmlParser.parseXml(NQ.f267393t, "msg", (String) null);
        if (parseXml == null) {
            Log.m105921e("MicroMsg.AiScanChatImageUtils", "fillImageCDNInfo parse cdnInfo failed. [%s]", NQ.f267393t);
            return;
        }
        String str = i != 1 ? parseXml.get(".msg.img.$cdnmidimgurl") : parseXml.get(".msg.img.$cdnbigimgurl");
        String str2 = i != 1 ? parseXml.get(".msg.img.$tpurl") : parseXml.get(".msg.img.$tphdurl");
        String str3 = "";
        bVar.f288841d = str == null ? str3 : str;
        String str4 = parseXml.get(".msg.img.$aeskey");
        if (str4 == null) {
            str4 = str3;
        }
        bVar.f288842e = str4;
        if (!(str2 == null || str2.length() == 0)) {
            C87412m.m108594g(str2, "<set-?>");
            bVar.f288841d = str2;
            String str5 = parseXml.get(".msg.img.$tpauthkey");
            if (str5 != null) {
                str3 = str5;
            }
            bVar.f288842e = str3;
        }
        Log.m105919d("MicroMsg.AiScanChatImageUtils", "alvinluo fillImageCDNInfo url: %s, tpUrl: %s", str, str2);
        Log.m105927v("MicroMsg.AiScanChatImageUtils", "alvinluo fillImageCDNInfo msg content: %s", NQ.f267393t);
    }

    /* renamed from: b */
    public final String mo137844b(C72963f4 f4Var) {
        if (f4Var == null) {
            return null;
        }
        if (!f4Var.mo100979R3() && !f4Var.mo100961A3()) {
            return null;
        }
        String str = ((C92839m) ((C98201k) C86312j.m106911c(C98201k.class)).mo137277xi()).v10(f4Var.mo108765s2(), true) + "hd";
        Log.m105925i("MicroMsg.AiScanChatImageUtils", "alvinluo getImagePath hdThumbPath: %s", str);
        if (C86013q1.m106450k(str)) {
            return str;
        }
        return null;
    }
}
