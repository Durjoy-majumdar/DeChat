package wi0;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import java.util.Arrays;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;

/* renamed from: wi0.v */
public final class C53173v {

    /* renamed from: a */
    public static final C53173v f148355a = new C53173v();

    /* renamed from: b */
    public static final C13601g f148356b = C36568h.m40985a(C53174a.f148358d);

    /* renamed from: c */
    public static final String f148357c = "%s_private_infos";

    /* renamed from: wi0.v$a */
    public static final class C53174a extends C87413o implements C32224a<MultiProcessMMKV> {

        /* renamed from: d */
        public static final C53174a f148358d = new C53174a();

        public C53174a() {
            super(0);
        }

        public Object invoke() {
            C53173v vVar = C53173v.f148355a;
            return MultiProcessMMKV.getMMKV("Luggage.RequirePrivateInfoLogic");
        }
    }

    /* renamed from: a */
    public final int mo73862a(String str) {
        C87412m.m108594g(str, "appId");
        String format = String.format(f148357c, Arrays.copyOf(new Object[]{str}, 1));
        C87412m.m108593f(format, "format(format, *args)");
        int decodeInt = ((MultiProcessMMKV) ((C36570n) f148356b).getValue()).decodeInt(format, 0);
        Log.m105925i("Luggage.RequirePrivateInfoLogic", "getExtFlag %s, %d", str, Integer.valueOf(decodeInt));
        return decodeInt;
    }
}
