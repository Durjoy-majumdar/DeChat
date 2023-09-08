package wq0;

import android.text.TextUtils;
import android.util.SparseArray;
import android.util.SparseIntArray;
import com.google.android.gms.dynamite.ProviderConstants;
import com.tencent.p014mm.plugin.appbrand.AppBrandRuntimeWC;
import com.tencent.p014mm.plugin.appbrand.C81827f;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82554k;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82870p;
import com.tencent.p014mm.plugin.appbrand.page.AppBrandPageContainerWC;
import com.tencent.p014mm.plugin.appbrand.report.model.C84158m;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatBrands;
import gy3.C87412m;
import java.util.HashSet;
import java.util.LinkedList;
import nm0.C89018a;
import nm0.C89024c;
import qe3.C89625d;
import rx3.C13598b0;
import xb3.C15635h;
import xb3.C91163e;

/* renamed from: wq0.a */
public class C91057a extends C81827f {

    /* renamed from: d */
    public final AppBrandRuntimeWC f261222d;

    /* renamed from: e */
    public final C82554k f261223e;

    /* renamed from: f */
    public final C89018a f261224f;

    /* renamed from: g */
    public final SparseIntArray f261225g = new SparseIntArray();

    public C91057a(AppBrandRuntimeWC appBrandRuntimeWC, C82554k kVar) {
        super(appBrandRuntimeWC, kVar, appBrandRuntimeWC.f251968f1);
        this.f261222d = appBrandRuntimeWC;
        this.f261223e = kVar;
        this.f261224f = appBrandRuntimeWC.f238282j1;
    }

    /* renamed from: a */
    public void mo114217a(C82870p pVar, String str, String str2, int i, String str3) {
        synchronized (this.f261225g) {
            this.f261225g.delete(i);
        }
        if (TextUtils.isEmpty(str3)) {
            return;
        }
        if ((BuildInfo.DEBUG || BuildInfo.IS_FLAVOR_RED || C89625d.f257846l || C89625d.f257845k) && "fail:internal error invalid js component".equals(str3)) {
            throw new ClassCastException(String.format("Mismatch api(%s) component", new Object[]{pVar.mo114779e()}));
        } else {
            this.f261224f.mo123389b(i, str3);
        }
    }

    /* renamed from: b */
    public void mo114218b(int i, String str) {
        this.f261224f.mo123389b(i, str);
    }

    /* renamed from: d */
    public boolean mo114220d(C82870p pVar, String str, String str2, int i, C82381f.C82383b bVar) {
        String str3;
        C89018a aVar = this.f261224f;
        C82554k kVar = this.f261223e;
        if (this.f261222d.mo121254q1()) {
            try {
                str3 = Util.nullAsNil(this.f261222d.mo113210l1().f239367i);
            } catch (Exception unused) {
                str3 = "";
            }
        } else {
            AppBrandPageContainerWC P1 = this.f261222d.mo113212m1();
            str3 = P1 == null ? null : P1.getCurrentUrl();
        }
        aVar.getClass();
        C87412m.m108594g(kVar, "component");
        C87412m.m108594g(pVar, ProviderConstants.API_PATH);
        boolean z = false;
        if (!((HashSet) C84158m.f245696a).contains(pVar.mo114779e())) {
            C89024c poll = aVar.f256621b.f256622a.poll();
            if (poll == null) {
                poll = new C89024c();
            }
            long currentTicks = Util.currentTicks();
            poll.f256628a = kVar;
            poll.f256629b = pVar;
            poll.f256630c = str;
            poll.f256631d = currentTicks;
            poll.f256632e = str3;
            poll.f256633f = 0;
            SparseArray<C89024c> sparseArray = aVar.f256620a;
            synchronized (sparseArray) {
                sparseArray.put(i, poll);
                C13598b0 b0Var = C13598b0.f38549a;
            }
        }
        C82554k kVar2 = this.f261223e;
        LinkedList<String> linkedList = C15589y.f42222a;
        C87412m.m108594g(kVar2, "env");
        if (C15589y.f42222a.contains(pVar.mo114779e())) {
            z = !WeChatBrands.Business.Entries.PaymentAppbrandJsb.checkAvailableSlient(kVar2.getContext(), new C91058a0(bVar, pVar, kVar2));
        }
        if (z) {
            return true;
        }
        return super.mo114220d(pVar, str, str2, i, bVar);
    }

    /* renamed from: f */
    public void mo114222f(C82870p pVar, String str, String str2, int i, int i2) {
        C89024c cVar;
        boolean z;
        SparseArray<C89024c> sparseArray = this.f261224f.f256620a;
        synchronized (sparseArray) {
            cVar = sparseArray.get(i, (Object) null);
        }
        C89024c cVar2 = cVar;
        if (cVar2 != null) {
            cVar2.f256633f = i2;
        }
        if (4 == i2) {
            HashSet<String> hashSet = C91163e.f261395a;
            String e = pVar.mo114779e();
            C87412m.m108594g(e, "apiName");
            if (C91163e.f261395a.contains(e)) {
                Log.m105918d("WcPayReport", "report jsapi onAuthRequested " + e);
                C15635h hVar = C15635h.f42265a;
                hVar.mo14381b("AppBrand-" + e, "3", "");
                z = true;
            } else {
                z = false;
            }
            if (z) {
                synchronized (this.f261225g) {
                    this.f261225g.delete(i);
                }
            }
        }
    }

    /* renamed from: g */
    public void mo125123g(String str, int i) {
        this.f261223e.getAsyncHandler().post(new a$$a(this, i, str));
    }

    /* renamed from: h */
    public boolean mo125124h(String str, int i) {
        HashSet<String> hashSet = C91163e.f261395a;
        C87412m.m108594g(str, "apiName");
        if (!C91163e.f261395a.contains(str)) {
            return false;
        }
        synchronized (this.f261225g) {
            this.f261225g.put(i, 1);
        }
        return true;
    }
}
