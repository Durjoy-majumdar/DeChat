package hs1;

import android.view.View;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import java.util.ArrayList;
import qo3.C12925w;

/* renamed from: hs1.b */
public final class C8737b implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C8740e f28002d;

    public C8737b(C8740e eVar) {
        this.f28002d = eVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/view/notice/NoticeBigCardWidget$initView$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        Log.m105924i("FinderLiveNoticeBigCardWidget", "#initView mCLoseBtn click");
        C12925w wVar = this.f28002d.f28019t;
        if (wVar != null) {
            wVar.mo5085n();
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/view/notice/NoticeBigCardWidget$initView$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
