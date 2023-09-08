package ps2;

import android.content.Context;
import android.view.ViewGroup;
import com.tencent.p014mm.plugin.sns.p106ui.C96328z2;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.C95295z;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import qs2.C101255a0;

/* renamed from: ps2.c0 */
public class C100862c0 {

    /* renamed from: a */
    public List<C101255a0> f295390a;

    /* renamed from: b */
    public Context f295391b;

    /* renamed from: c */
    public ViewGroup f295392c;

    /* renamed from: d */
    public LinkedHashMap<String, C95295z> f295393d;

    public C100862c0(List<C101255a0> list, Context context, int i, ViewGroup viewGroup) {
        this.f295390a = list;
        this.f295391b = context;
        this.f295392c = viewGroup;
    }

    /* renamed from: a */
    public Collection<C95295z> mo140331a() {
        SnsMethodCalculate.markStartTimeMs("getAllComp", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.CompRenderer");
        LinkedHashMap<String, C95295z> linkedHashMap = this.f295393d;
        Collection<C95295z> values = linkedHashMap == null ? Collections.EMPTY_LIST : linkedHashMap.values();
        SnsMethodCalculate.markEndTimeMs("getAllComp", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.CompRenderer");
        return values;
    }

    /* renamed from: b */
    public void mo140332b() {
        SnsMethodCalculate.markStartTimeMs("layout", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.CompRenderer");
        List<C101255a0> list = this.f295390a;
        if (list == null || list.isEmpty()) {
            SnsMethodCalculate.markEndTimeMs("layout", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.CompRenderer");
            return;
        }
        if (this.f295393d == null) {
            this.f295393d = new LinkedHashMap<>();
        }
        for (int i = 0; i < this.f295390a.size(); i++) {
            C101255a0 a0Var = this.f295390a.get(i);
            C95295z zVar = this.f295393d.get(a0Var.f296495a);
            if (zVar != null) {
                zVar.mo130213z(a0Var);
            } else {
                zVar = C96328z2.m123559a(this.f295391b, a0Var, this.f295392c, 0);
                this.f295393d.put(a0Var.f296495a, zVar);
            }
            try {
                if (this.f295392c != zVar.mo131855p().getParent()) {
                    if (this.f295392c.getChildCount() > i) {
                        this.f295392c.addView(zVar.mo131855p(), i);
                        zVar.mo124363d();
                    } else {
                        this.f295392c.addView(zVar.mo131855p());
                        zVar.mo124363d();
                    }
                }
            } catch (Exception e) {
                Log.m105921e("CompRenderer", "component may have same id %s,%s", a0Var.f296495a, Util.stackTraceToString(e));
            }
        }
        SnsMethodCalculate.markEndTimeMs("layout", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.CompRenderer");
    }

    /* renamed from: c */
    public void mo140333c(List<C101255a0> list) {
        SnsMethodCalculate.markStartTimeMs("notify", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.CompRenderer");
        if (list != null && !list.equals(this.f295390a)) {
            this.f295390a = list;
            mo140332b();
        }
        SnsMethodCalculate.markEndTimeMs("notify", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.CompRenderer");
    }

    /* renamed from: d */
    public void mo140334d(C95295z zVar) {
        SnsMethodCalculate.markStartTimeMs("removeView", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.CompRenderer");
        try {
            this.f295393d.remove(zVar.mo131857r());
            this.f295392c.removeView(zVar.mo131609i());
        } catch (Throwable th) {
            Log.m105920e("CompRenderer", "removeView, exp" + th.toString());
        }
        SnsMethodCalculate.markEndTimeMs("removeView", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.CompRenderer");
    }
}
