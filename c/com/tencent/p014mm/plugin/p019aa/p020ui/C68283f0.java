package com.tencent.p014mm.plugin.p019aa.p020ui;

import android.app.Dialog;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.ArrayList;
import java.util.List;
import kv1.C61173o;
import lv1.C10656l;
import lv1.C99681n;
import yf0.C79104i;

/* renamed from: com.tencent.mm.plugin.aa.ui.f0 */
public class C68283f0 implements C61173o {

    /* renamed from: d */
    public final /* synthetic */ ArrayList f196294d;

    /* renamed from: e */
    public final /* synthetic */ String f196295e;

    /* renamed from: f */
    public final /* synthetic */ LaunchAAUI f196296f;

    public C68283f0(LaunchAAUI launchAAUI, ArrayList arrayList, String str) {
        this.f196296f = launchAAUI;
        this.f196294d = arrayList;
        this.f196295e = str;
    }

    /* renamed from: H0 */
    public void mo293H0(C10656l lVar) {
        Dialog dialog = this.f196296f.f196118U0;
        if (dialog != null && dialog.isShowing()) {
            this.f196296f.f196118U0.dismiss();
        }
        this.f196296f.f196120V0 = false;
        this.f196294d.clear();
        int i = lVar.f32074c;
        if (i == -3 || i == -2 || i == -1) {
            Log.m105925i("MicroMsg.Aa.LaunchAAUI", "onSearchError: errorCode=%d | originQuery=%s", Integer.valueOf(i), lVar.f32072a.f224468c);
            if (!lVar.f32072a.f224468c.equals(this.f196295e)) {
                Log.m105924i("MicroMsg.Aa.LaunchAAUI", "Native Search: Not Same Query");
                return;
            }
        } else if (i == 0) {
            Log.m105925i("MicroMsg.Aa.LaunchAAUI", "search result %d", Integer.valueOf(lVar.f32076e.size()));
            String str = this.f196295e;
            if (str == null || !str.equals(lVar.f32072a.f224468c)) {
                Log.m105925i("MicroMsg.Aa.LaunchAAUI", "Native Search: Not Same query origin:%s current:%s", lVar.f32072a.f224468c, this.f196295e);
                return;
            }
            List<C99681n> list = lVar.f32076e;
            if (list != null && list.size() > 0) {
                for (C99681n next : lVar.f32076e) {
                    String str2 = next.f292151e;
                    if (Util.isNullOrNil(str2) ? false : LaunchAAUI.m80630S7(C79104i.m95664i(str2))) {
                        this.f196294d.add(next.f292151e);
                    }
                }
            }
        }
        this.f196296f.mo93795Q7(this.f196294d);
    }
}
