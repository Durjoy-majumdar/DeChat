package kp0;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import di3.C86312j;
import fy3.C32224a;
import gy3.C87413o;
import p757xv.C91353u;
import rx3.C13601g;
import rx3.C36568h;

/* renamed from: kp0.a */
public final class C33964a {

    /* renamed from: a */
    public static final C13601g f91707a = C36568h.m40985a(C33965a.f91708d);

    /* renamed from: kp0.a$a */
    public static final class C33965a extends C87413o implements C32224a<Boolean> {

        /* renamed from: d */
        public static final C33965a f91708d = new C33965a();

        public C33965a() {
            super(0);
        }

        public Object invoke() {
            MultiProcessMMKV multiProcessMMKV;
            boolean z = false;
            try {
                C91353u uVar = (C91353u) C86312j.m106911c(C91353u.class);
                if (uVar != null) {
                    boolean eq = uVar.mo112628eq();
                    C13601g gVar = C33964a.f91707a;
                    Boolean valueOf = Boolean.valueOf(eq);
                    if (!(valueOf == null || (multiProcessMMKV = MultiProcessMMKV.getDefault()) == null)) {
                        multiProcessMMKV.encode("WeAppV8LiteStrategy#cachedIs3GUserSpace", valueOf.booleanValue() ? 1 : 2);
                    }
                    z = eq;
                }
            } catch (Exception e) {
                Log.m105924i("MicroMsg.AppBrand.WeAppMemoryStrategy", "query is3GUserSpace fail since " + e);
                C13601g gVar2 = C33964a.f91707a;
                MultiProcessMMKV multiProcessMMKV2 = MultiProcessMMKV.getDefault();
                int i = multiProcessMMKV2 != null ? multiProcessMMKV2.getInt("WeAppV8LiteStrategy#cachedIs3GUserSpace", 0) : 0;
                Boolean bool = i != 1 ? i != 2 ? null : Boolean.FALSE : Boolean.TRUE;
                if (bool != null) {
                    z = bool.booleanValue();
                }
            }
            return Boolean.valueOf(z);
        }
    }
}
