package yl0;

import am0.C79589b;
import android.util.Base64;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/* renamed from: yl0.i */
public final class C91489i extends C91478c {
    public static final int CTRL_INDEX = 842;
    public static final String NAME = "NFCGetHistoricalBytes";

    /* renamed from: yl0.i$a */
    public static final class C91490a extends C87413o implements C32226l<Object, Object> {

        /* renamed from: d */
        public static final C91490a f262293d = new C91490a();

        public C91490a() {
            super(1);
        }

        public final Object invoke(Object obj) {
            if (obj == null || !(obj instanceof byte[])) {
                return null;
            }
            byte[] encode = Base64.encode((byte[]) obj, 2);
            C87412m.m108593f(encode, "encode(it, Base64.NO_WRAP)");
            Charset charset = StandardCharsets.UTF_8;
            C87412m.m108593f(charset, "UTF_8");
            return new String(encode, charset);
        }
    }

    public C91489i() {
        super(C79589b.ISO_DEP.f233391d, "getHistoricalBytes", "histBytes", C91490a.f262293d);
    }
}
