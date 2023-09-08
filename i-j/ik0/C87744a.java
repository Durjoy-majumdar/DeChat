package ik0;

import android.content.Context;
import br0.C79774c;
import com.tencent.p014mm.plugin.appbrand.AppBrandRuntime;
import com.tencent.p014mm.plugin.appbrand.C81879g;
import com.tencent.p014mm.plugin.appbrand.phonenumber.PhoneItem;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import fy3.C32224a;
import fy3.C32226l;
import gt0.C87374n0;
import gy3.C87412m;
import java.util.ArrayList;
import p224ra.C12964b;
import p225rc.C89923l;
import rx3.C13598b0;
import wq0.C91070i;
import wq0.C91073k;
import zq0.C91877h0;
import zq0.C91891k0;
import zq0.C91910r;

/* renamed from: ik0.a */
public interface C87744a extends C91073k, C87374n0 {

    /* renamed from: ik0.a$a */
    public static final class C87745a {

        /* renamed from: a */
        public static final C87746a f254040a = new C87746a();

        /* renamed from: ik0.a$a$a */
        public static final class C87746a implements C87747b {
            public C87744a Bq0(C81879g gVar) {
                C79774c cVar;
                C87412m.m108594g(gVar, "component");
                AppBrandRuntime runtime = gVar.getRuntime();
                if (runtime == null || (cVar = runtime.mo113054f0()) == null) {
                    cVar = gVar.mo114271f0();
                }
                C87412m.m108591d(cVar);
                Context context = gVar.getContext();
                if (context == null) {
                    context = MMApplicationContext.getContext();
                }
                C87412m.m108593f(context, "component.context ?: MMA…ationContext.getContext()");
                String appId = gVar.getAppId();
                C87412m.m108593f(appId, "component.appId");
                C91877h0 h0Var = new C91877h0(context, appId, cVar);
                if ((!C89923l.f258408a.mo117502h()) && cVar.isLargeScreenWindow()) {
                    h0Var.mo125667a(1);
                }
                return h0Var;
            }
        }
    }

    /* renamed from: ik0.a$b */
    public interface C87747b extends C12964b {
        C87744a Bq0(C81879g gVar);
    }

    /* renamed from: E */
    void mo121482E(boolean z);

    /* renamed from: l */
    C91070i mo121495l(C81879g gVar, String str, C91891k0 k0Var, PhoneItem phoneItem, C91910r.C91911a aVar);

    void setAppBrandName(String str);

    void setDialogApplyWording(String str);

    void setDialogRequestDesc(String str);

    void setDialogSubDesc(String str);

    void setIconUrl(String str);

    void setOnAccept(C32226l<? super Boolean, C13598b0> lVar);

    void setOnAddPhoneNumber(C32224a<C13598b0> aVar);

    void setOnCancel(C32224a<C13598b0> aVar);

    void setOnDeny(C32224a<C13598b0> aVar);

    void setOnExplain(C32224a<C13598b0> aVar);

    void setOnManagePhoneNumber(C32224a<C13598b0> aVar);

    void setOnPhoneItemSelect(C32226l<? super PhoneItem, C13598b0> lVar);

    void setPhoneItems(ArrayList<PhoneItem> arrayList);
}
