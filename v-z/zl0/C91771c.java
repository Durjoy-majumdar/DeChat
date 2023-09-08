package zl0;

import am0.C79588a;
import android.nfc.Tag;
import android.nfc.tech.IsoDep;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32226l;
import gy3.C87412m;
import java.util.Arrays;
import rx3.C13598b0;
import zl0.C91789o;

/* renamed from: zl0.c */
public final class C91771c implements C91770b {

    /* renamed from: a */
    public static final C91771c f262828a = new C91771c();

    /* renamed from: a */
    public void mo125634a(Tag tag, String str, C79588a aVar, C32226l<? super C91789o<Object>, C13598b0> lVar) {
        Object obj;
        C87412m.m108594g(tag, "tag");
        C87412m.m108594g(str, "function");
        C87412m.m108594g(lVar, "callback");
        Log.m105918d("MicroMsg.AppBrand.IsoDepLogic", "execAsync, function: " + str);
        IsoDep isoDep = IsoDep.get(tag);
        if (isoDep == null) {
            lVar.invoke(new C91789o.C91790a(13015, "unavailable tech"));
            return;
        }
        if (C87412m.m108589b(str, "getHistoricalBytes")) {
            byte[] historicalBytes = isoDep.getHistoricalBytes();
            if (historicalBytes != null) {
                StringBuilder sb = new StringBuilder();
                sb.append("historicalBytes: ");
                String arrays = Arrays.toString(historicalBytes);
                C87412m.m108593f(arrays, "toString(this)");
                sb.append(arrays);
                Log.m105918d("MicroMsg.AppBrand.IsoDepLogic", sb.toString());
            } else {
                historicalBytes = null;
            }
            obj = new C91789o.C91791b(historicalBytes);
        } else {
            obj = new C91789o.C91790a(13024, "function not support");
        }
        lVar.invoke(obj);
    }
}
