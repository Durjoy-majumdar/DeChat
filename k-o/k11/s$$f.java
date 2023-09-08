package k11;

import android.widget.AbsListView;
import gc0.C20828a;
import j20.C117292a;
import java.util.ArrayList;

public class s$$f implements AbsListView.OnScrollListener {

    /* renamed from: d */
    public final /* synthetic */ C99085s f29752d;

    public s$$f(C99085s sVar) {
        this.f29752d = sVar;
    }

    public void onScroll(AbsListView absListView, int i, int i2, int i3) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(absListView);
        arrayList.add(Integer.valueOf(i));
        arrayList.add(Integer.valueOf(i2));
        arrayList.add(Integer.valueOf(i3));
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingDetailAdapter$3", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V", this, array);
        C117292a.m165361g(this, "com/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingDetailAdapter$3", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V");
    }

    public void onScrollStateChanged(AbsListView absListView, int i) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(absListView);
        arrayList.add(Integer.valueOf(i));
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingDetailAdapter$3", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V", this, array);
        C20828a.m22825b().mo32525n(i);
        if (i != 2) {
            C99085s sVar = this.f29752d;
            sVar.f290461n = false;
            sVar.f290465r.removeCallbacksAndMessages((Object) null);
            this.f29752d.f290465r.sendEmptyMessageDelayed(0, 200);
        } else {
            this.f29752d.f290461n = true;
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingDetailAdapter$3", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V");
    }
}
