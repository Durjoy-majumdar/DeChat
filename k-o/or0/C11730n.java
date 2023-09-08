package or0;

import com.tencent.p014mm.plugin.appbrand.app.C1510o;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;

/* renamed from: or0.n */
public final class C11730n {

    /* renamed from: a */
    public static final C32224a<Boolean> f34329a = C11731a.f34331d;

    /* renamed from: b */
    public static final C32224a<Boolean> f34330b = C11732b.f34332d;

    /* renamed from: or0.n$a */
    public static final class C11731a extends C87413o implements C32224a<Boolean> {

        /* renamed from: d */
        public static final C11731a f34331d = new C11731a();

        public C11731a() {
            super(0);
        }

        public Object invoke() {
            MultiProcessMMKV a = C1510o.f10864a.mo1516a();
            C87412m.m108591d(a);
            Boolean valueOf = Boolean.valueOf(a.getBoolean("last_appbrand_switch_short_link_highlight", false));
            boolean booleanValue = valueOf.booleanValue();
            Log.m105918d("WxaShortLinkCapacity", "isHighlightEnable[" + booleanValue + ']');
            return valueOf;
        }
    }

    /* renamed from: or0.n$b */
    public static final class C11732b extends C87413o implements C32224a<Boolean> {

        /* renamed from: d */
        public static final C11732b f34332d = new C11732b();

        public C11732b() {
            super(0);
        }

        public Object invoke() {
            MultiProcessMMKV a = C1510o.f10864a.mo1516a();
            C87412m.m108591d(a);
            Boolean valueOf = Boolean.valueOf(a.getBoolean("last_appbrand_switch_short_link_highlight", false));
            boolean booleanValue = valueOf.booleanValue();
            Log.m105918d("WxaShortLinkCapacity", "isMenuEntryEnable[" + booleanValue + ']');
            return valueOf;
        }
    }
}
