package vd3;

import android.widget.AbsListView;
import j20.C117292a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* renamed from: vd3.i */
public class C78399i implements AbsListView.OnScrollListener {

    /* renamed from: d */
    public AbsListView.OnScrollListener f229723d;

    /* renamed from: e */
    public ArrayList<WeakReference<C78400a>> f229724e = new ArrayList<>();

    /* renamed from: vd3.i$a */
    public interface C78400a {
        void onScrollStateChanged(boolean z);
    }

    public C78399i(AbsListView.OnScrollListener onScrollListener) {
        this.f229723d = onScrollListener;
    }

    /* renamed from: a */
    public void mo108346a(boolean z) {
        for (int i = 0; i < this.f229724e.size(); i++) {
            WeakReference weakReference = this.f229724e.get(i);
            if (weakReference != null) {
                C78400a aVar = (C78400a) weakReference.get();
                if (aVar != null) {
                    aVar.onScrollStateChanged(z);
                } else {
                    this.f229724e.remove(i);
                }
            } else {
                this.f229724e.remove(i);
            }
        }
    }

    public void onScroll(AbsListView absListView, int i, int i2, int i3) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(absListView);
        arrayList.add(Integer.valueOf(i));
        arrayList.add(Integer.valueOf(i2));
        arrayList.add(Integer.valueOf(i3));
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/pluginsdk/ui/AvatarWrapperScrollListener", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V", this, array);
        AbsListView.OnScrollListener onScrollListener = this.f229723d;
        if (onScrollListener != null) {
            onScrollListener.onScroll(absListView, i, i2, i3);
        }
        C117292a.m165361g(this, "com/tencent/mm/pluginsdk/ui/AvatarWrapperScrollListener", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V");
    }

    public void onScrollStateChanged(AbsListView absListView, int i) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(absListView);
        arrayList.add(Integer.valueOf(i));
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/pluginsdk/ui/AvatarWrapperScrollListener", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V", this, array);
        if (i == 2) {
            mo108346a(true);
        } else {
            mo108346a(false);
        }
        AbsListView.OnScrollListener onScrollListener = this.f229723d;
        if (onScrollListener != null) {
            onScrollListener.onScrollStateChanged(absListView, i);
        }
        C117292a.m165361g(this, "com/tencent/mm/pluginsdk/ui/AvatarWrapperScrollListener", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V");
    }
}
