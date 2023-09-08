package hs1;

import android.view.View;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import j20.C117292a;
import java.util.ArrayList;
import rx3.C13598b0;

/* renamed from: hs1.d */
public final class C8739d implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C32224a<C13598b0> f28005d;

    public C8739d(C32224a<C13598b0> aVar) {
        this.f28005d = aVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/view/notice/NoticeBigCardWidget$initView$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        Log.m105924i("FinderLiveNoticeBigCardWidget", "#initView next_confirm click");
        this.f28005d.invoke();
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/view/notice/NoticeBigCardWidget$initView$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
