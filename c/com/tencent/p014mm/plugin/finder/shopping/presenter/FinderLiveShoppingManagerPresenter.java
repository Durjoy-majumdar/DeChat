package com.tencent.p014mm.plugin.finder.shopping.presenter;

import android.app.Activity;
import android.content.Intent;
import cm1.C0740i2;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import gg1.C32444a;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import op1.C62080b;
import qp1.C63313h;
import rx3.C13598b0;
import sp1.C64100l0;
import sx3.C36907w;
import te3.v44;

/* renamed from: com.tencent.mm.plugin.finder.shopping.presenter.FinderLiveShoppingManagerPresenter */
public final class FinderLiveShoppingManagerPresenter {

    /* renamed from: a */
    public final Activity f160919a;

    /* renamed from: b */
    public final String f160920b = "FinderLiveShoppingManagerPresenter";

    /* renamed from: c */
    public final boolean f160921c;

    /* renamed from: d */
    public final LinkedList<C0740i2> f160922d;

    /* renamed from: e */
    public C63313h f160923e;

    /* renamed from: f */
    public v44 f160924f;

    /* renamed from: g */
    public final FinderLiveShoppingManagerPresenter$feedChangeListener$1 f160925g;

    public FinderLiveShoppingManagerPresenter(Activity activity) {
        C87412m.m108594g(activity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        this.f160919a = activity;
        C32444a aVar = C32444a.f86121a;
        this.f160921c = C32444a.f86104U0.mo60266n().intValue() == 0;
        this.f160922d = new LinkedList<>();
        this.f160925g = new FinderLiveShoppingManagerPresenter$feedChangeListener$1(this, C40008f.f107254d);
    }

    /* renamed from: a */
    public final void mo78778a(List<Long> list, boolean z) {
        C87412m.m108594g(list, "allList");
        Intent intent = new Intent();
        ArrayList arrayList = new ArrayList(C36907w.m41090l(list, 10));
        for (Number longValue : list) {
            arrayList.add(String.valueOf(longValue.longValue()));
        }
        intent.putStringArrayListExtra("KEY_PRODUCTLIST", new ArrayList(arrayList));
        intent.putExtra("KEY_DELETE", z);
        this.f160919a.setResult(-1, intent);
    }

    /* renamed from: b */
    public final void mo78779b(int i) {
        C13598b0 b0Var;
        C64100l0 l0Var;
        C62080b bVar;
        C63313h hVar = this.f160923e;
        if (hVar == null || (l0Var = hVar.f179652c) == null || (bVar = l0Var.f181755q) == null) {
            b0Var = null;
        } else {
            String str = this.f160920b;
            Log.m105924i(str, "userBack source:" + i + ",productIdList:" + bVar.mo87145F4());
            if (((ArrayList) bVar.mo87145F4()).isEmpty()) {
                mo78778a(bVar.f176507f, true);
            } else {
                mo78778a(bVar.mo87145F4(), false);
            }
            b0Var = C13598b0.f38549a;
        }
        if (b0Var == null) {
            String str2 = this.f160920b;
            Log.m105924i(str2, "userBack source:" + i + " editAdapter is null!");
        }
    }
}
