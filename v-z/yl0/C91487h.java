package yl0;

import am0.C79589b;
import android.util.Base64;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/* renamed from: yl0.h */
public final class C91487h extends C91478c {
    public static final int CTRL_INDEX = 841;
    public static final String NAME = "NFCGetAtqa";

    /* renamed from: yl0.h$a */
    public static final class C91488a extends C87413o implements C32226l<Object, Object> {

        /* renamed from: d */
        public static final C91488a f262292d = new C91488a();

        public C91488a() {
            super(1);
        }

        public final Object invoke(Object obj) {
            byte[] encode = Base64.encode((obj == null || !(obj instanceof byte[])) ? new byte[0] : (byte[]) obj, 2);
            C87412m.m108593f(encode, "encode(byteArray, Base64.NO_WRAP)");
            Charset charset = StandardCharsets.UTF_8;
            C87412m.m108593f(charset, "UTF_8");
            return new String(encode, charset);
        }
    }

    public C91487h() {
        super(C79589b.NFC_A.f233391d, "getAtqa", "atqa", C91488a.f262292d);
    }
}
