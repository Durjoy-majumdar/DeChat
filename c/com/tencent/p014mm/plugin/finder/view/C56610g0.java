package com.tencent.p014mm.plugin.finder.view;

import android.content.Context;
import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Util;
import f40.C86709a0;
import fy3.C32226l;
import j20.C117292a;
import java.util.ArrayList;
import java.util.List;
import je1.C33560t2;
import nj3.C76912y0;
import rx3.C13598b0;
import sx3.C36907w;
import te3.C64750uh0;
import te3.C64772vh0;

/* renamed from: com.tencent.mm.plugin.finder.view.g0 */
public final class C56610g0 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ FinderAdFeedbackWindow f162303d;

    public C56610g0(FinderAdFeedbackWindow finderAdFeedbackWindow) {
        this.f162303d = finderAdFeedbackWindow;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/view/FinderAdFeedbackWindow$initSecondPage$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        List<C64750uh0> list = this.f162303d.f162008s;
        ArrayList arrayList2 = new ArrayList(C36907w.m41090l(list, 10));
        for (C64750uh0 uh02 : list) {
            arrayList2.add(Integer.valueOf(uh02.f185740d));
        }
        FinderAdFeedbackWindow finderAdFeedbackWindow = this.f162303d;
        long j = finderAdFeedbackWindow.f161999g;
        int i = finderAdFeedbackWindow.f162001i;
        C64772vh0 vh02 = finderAdFeedbackWindow.f162002j;
        String str = vh02.f185889g;
        String str2 = str == null ? "" : str;
        String str3 = vh02.f185890h;
        C86709a0.m107524d().mo123460f(new C33560t2(false, arrayList2, j, i, str2, str3 == null ? "" : str3));
        FinderAdFeedbackWindow finderAdFeedbackWindow2 = this.f162303d;
        C32226l<Long, C13598b0> lVar = finderAdFeedbackWindow2.f162003n;
        if (lVar != null) {
            lVar.invoke(Long.valueOf(finderAdFeedbackWindow2.f162000h));
        }
        if (Util.isNullOrNil((List) this.f162303d.f162008s)) {
            Context context = this.f162303d.f161998f;
            C76912y0.m92768g(context, context.getResources().getString(C0966R.string.f8065dc));
        } else {
            Context context2 = this.f162303d.f161998f;
            C76912y0.m92768g(context2, context2.getResources().getString(C0966R.string.f8067dh));
        }
        FinderAdFeedbackWindow finderAdFeedbackWindow3 = this.f162303d;
        finderAdFeedbackWindow3.f162004o = 2;
        finderAdFeedbackWindow3.dismiss();
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/view/FinderAdFeedbackWindow$initSecondPage$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
