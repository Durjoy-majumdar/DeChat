package com.tencent.p014mm.plugin.finder.convert;

import android.view.View;
import androidx.lifecycle.C0124r;
import androidx.lifecycle.C112974b0;
import androidx.lifecycle.C39623j;
import dp1.C58394n1;
import gy3.C87412m;
import kf1.C9833k9;
import kotlin.Metadata;
import te3.C49712hj1;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0007J\b\u0010\u0004\u001a\u00020\u0002H\u0007¨\u0006\u0005"}, mo182094d2 = {"com/tencent/mm/plugin/finder/convert/FinderStreamCardAlbumConvert$lifecycleObserver$1", "Landroidx/lifecycle/r;", "Lrx3/b0;", "onPause", "onResume", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.convert.FinderStreamCardAlbumConvert$lifecycleObserver$1 */
public final class FinderStreamCardAlbumConvert$lifecycleObserver$1 implements C0124r {

    /* renamed from: d */
    public final /* synthetic */ FinderStreamCardAlbumConvert f158496d;

    public FinderStreamCardAlbumConvert$lifecycleObserver$1(FinderStreamCardAlbumConvert finderStreamCardAlbumConvert) {
        this.f158496d = finderStreamCardAlbumConvert;
    }

    @C112974b0(C39623j.C39625b.ON_PAUSE)
    public final void onPause() {
        C9833k9 k9Var;
        FinderStreamCardAlbumConvert finderStreamCardAlbumConvert = this.f158496d;
        View view = finderStreamCardAlbumConvert.f158449v;
        if (view != null && FinderStreamCardAlbumConvert.m63271j(finderStreamCardAlbumConvert, view) && (k9Var = finderStreamCardAlbumConvert.f158450w.f158452a) != null) {
            long currentTimeMillis = System.currentTimeMillis() - finderStreamCardAlbumConvert.f158450w.f158455d;
            int indexOf = finderStreamCardAlbumConvert.f158435e.f13285z.getDataListJustForAdapter().indexOf(k9Var);
            C58394n1 n1Var = C58394n1.f167305a;
            String str = k9Var.f30387d.f184841e;
            if (str == null) {
                str = "";
            }
            String str2 = str;
            C49712hj1 hj12 = finderStreamCardAlbumConvert.f158438h;
            if (hj12 != null) {
                n1Var.mo83233a(str2, k9Var, indexOf, currentTimeMillis, hj12);
            } else {
                C87412m.m108603p("contextObj");
                throw null;
            }
        }
    }

    @C112974b0(C39623j.C39625b.ON_RESUME)
    public final void onResume() {
        FinderStreamCardAlbumConvert finderStreamCardAlbumConvert = this.f158496d;
        View view = finderStreamCardAlbumConvert.f158449v;
        if (view != null && FinderStreamCardAlbumConvert.m63271j(finderStreamCardAlbumConvert, view)) {
            finderStreamCardAlbumConvert.f158450w.f158455d = System.currentTimeMillis();
        }
    }
}
