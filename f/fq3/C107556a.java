package fq3;

import android.content.Context;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.appbrand.jsapi.appdownload.JsApiAddDownloadTaskStraight;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import p175j0.C108504h;
import p415q0.C110261c;
import rx3.C13598b0;
import ta0.C110954a;

/* renamed from: fq3.a */
public final class C107556a {

    /* renamed from: a */
    public static C32227p<C108504h, Integer, C13598b0> f321826a = C110261c.m149879c(141432983, false, C107557a.f321828d);

    /* renamed from: b */
    public static C32227p<C108504h, Integer, C13598b0> f321827b = C110261c.m149879c(151203544, false, C107558b.f321829d);

    /* renamed from: fq3.a$a */
    public static final class C107557a extends C87413o implements C32227p<C108504h, Integer, C13598b0> {

        /* renamed from: d */
        public static final C107557a f321828d = new C107557a();

        public C107557a() {
            super(2);
        }

        public Object invoke(Object obj, Object obj2) {
            C108504h hVar = (C108504h) obj;
            if ((((Number) obj2).intValue() & 11) != 2 || !hVar.mo51575a()) {
                Context context = MMApplicationContext.getContext();
                C87412m.m108593f(context, "getContext()");
                float f = ((float) 3) * ((float) 8);
                C107559c.m145729b(C110954a.m151253a(C0966R.raw.icons_outlined_search, C110954a.m151254b(C0966R.color.BW_100_Alpha_0_5, context), hVar, 0), f, f, (String) null, hVar, JsApiAddDownloadTaskStraight.CTRL_INDEX, 8);
            } else {
                hVar.mo51581d();
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: fq3.a$b */
    public static final class C107558b extends C87413o implements C32227p<C108504h, Integer, C13598b0> {

        /* renamed from: d */
        public static final C107558b f321829d = new C107558b();

        public C107558b() {
            super(2);
        }

        public Object invoke(Object obj, Object obj2) {
            C108504h hVar = (C108504h) obj;
            if ((((Number) obj2).intValue() & 11) != 2 || !hVar.mo51575a()) {
                Context context = MMApplicationContext.getContext();
                C87412m.m108593f(context, "getContext()");
                float f = ((float) 2) * ((float) 8);
                C107559c.m145729b(C110954a.m151253a(C0966R.raw.icons_filled_close2, C110954a.m151254b(C0966R.color.BW_100_Alpha_0_3, context), hVar, 0), f, f, (String) null, hVar, JsApiAddDownloadTaskStraight.CTRL_INDEX, 8);
            } else {
                hVar.mo51581d();
            }
            return C13598b0.f38549a;
        }
    }
}
