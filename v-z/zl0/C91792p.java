package zl0;

import am0.C79588a;
import android.nfc.Tag;
import android.nfc.tech.NfcA;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import java.util.Arrays;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C13602i;
import rx3.C36568h;
import zl0.C91789o;

/* renamed from: zl0.p */
public final class C91792p implements C91770b {

    /* renamed from: a */
    public static final C91792p f262872a = new C91792p();

    /* renamed from: b */
    public static final C13601g f262873b = C36568h.m40986b(C13602i.NONE, C39377a.f105814d);

    /* renamed from: zl0.p$a */
    public static final class C39377a extends C87413o implements C32224a<byte[]> {

        /* renamed from: d */
        public static final C39377a f105814d = new C39377a();

        public C39377a() {
            super(0);
        }

        public Object invoke() {
            return new byte[0];
        }
    }

    /* renamed from: a */
    public void mo125634a(Tag tag, String str, C79588a aVar, C32226l<? super C91789o<Object>, C13598b0> lVar) {
        Object obj;
        C87412m.m108594g(tag, "tag");
        C87412m.m108594g(str, "function");
        C87412m.m108594g(lVar, "callback");
        Log.m105918d("MicroMsg.AppBrand.NfcALogic", "execAsync, function: " + str);
        NfcA nfcA = NfcA.get(tag);
        if (nfcA == null) {
            lVar.invoke(new C91789o.C91790a(13015, "unavailable tech"));
            return;
        }
        if (C87412m.m108589b(str, "getAtqa")) {
            byte[] atqa = nfcA.getAtqa();
            if (atqa == null) {
                atqa = (byte[]) f262873b.getValue();
            }
            StringBuilder sb = new StringBuilder();
            sb.append("atqa: ");
            String arrays = Arrays.toString(atqa);
            C87412m.m108593f(arrays, "toString(this)");
            sb.append(arrays);
            Log.m105918d("MicroMsg.AppBrand.NfcALogic", sb.toString());
            obj = new C91789o.C91791b(atqa);
        } else {
            obj = C87412m.m108589b(str, "getSak") ? new C91789o.C91791b(Short.valueOf(nfcA.getSak())) : new C91789o.C91790a(13024, "function not support");
        }
        lVar.invoke(obj);
    }
}
