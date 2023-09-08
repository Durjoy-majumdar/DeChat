package ig2;

import android.content.Context;
import android.widget.AbsListView;
import com.tencent.p014mm.p136ui.C6975i1;
import com.tencent.p014mm.pluginsdk.p133ui.tools.C57547m0;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: ig2.a */
public abstract class C76350a<T> extends C6975i1<T> implements AbsListView.OnScrollListener, C57547m0 {
    static {
        Class<C76350a> cls = C76350a.class;
    }

    public C76350a(Context context, T t) {
        super(context, t);
        mo7997q(true);
    }

    public void onScroll(AbsListView absListView, int i, int i2, int i3) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(absListView);
        arrayList.add(Integer.valueOf(i));
        arrayList.add(Integer.valueOf(i2));
        arrayList.add(Integer.valueOf(i3));
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/readerapp/ui/BaseReaderAdapter", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V", this, array);
        C117292a.m165361g(this, "com/tencent/mm/plugin/readerapp/ui/BaseReaderAdapter", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V");
    }

    public void onScrollStateChanged(AbsListView absListView, int i) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(absListView);
        arrayList.add(Integer.valueOf(i));
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/readerapp/ui/BaseReaderAdapter", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V", this, array);
        C117292a.m165361g(this, "com/tencent/mm/plugin/readerapp/ui/BaseReaderAdapter", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V");
    }

    /* renamed from: s */
    public abstract int mo96990s();

    /* renamed from: t */
    public abstract boolean mo96991t();
}
