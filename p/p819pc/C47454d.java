package p819pc;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;

/* renamed from: pc.d */
public final class C47454d {

    /* renamed from: a */
    public static final C47454d f127280a = new C47454d();

    /* renamed from: b */
    public static final C13601g f127281b = C36568h.m40985a(C47455a.f127282d);

    /* renamed from: pc.d$a */
    public static final class C47455a extends C87413o implements C32224a<MultiProcessMMKV> {

        /* renamed from: d */
        public static final C47455a f127282d = new C47455a();

        public C47455a() {
            super(0);
        }

        public Object invoke() {
            MultiProcessMMKV mmkv = MultiProcessMMKV.getMMKV("SwitchRenderLogic", 2);
            C87412m.m108591d(mmkv);
            return mmkv;
        }
    }

    /* renamed from: a */
    public final MultiProcessMMKV mo72474a() {
        return (MultiProcessMMKV) ((C36570n) f127281b).getValue();
    }

    /* renamed from: b */
    public final void mo72475b(String str, int i) {
        C87412m.m108594g(str, "appId");
        MultiProcessMMKV a = mo72474a();
        a.putInt("SwitchRenderLogic#" + str, i).commit();
    }

    /* renamed from: c */
    public final void mo72476c(int i) {
        Log.m105924i("SwitchRenderLogic", "setDeafultMode:" + i);
        mo72474a().putInt("SwitchRenderLogic#Default", i).commit();
    }
}
