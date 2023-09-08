package com.tencent.p014mm.p136ui.base;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.midas.data.APMidasPluginInfo;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import java.util.ArrayList;
import k20.C60958c;
import k20.C9556a;

/* renamed from: com.tencent.mm.ui.base.MMLoadMoreListView */
public class MMLoadMoreListView extends ListView {

    /* renamed from: d */
    public View f214846d = null;

    /* renamed from: e */
    public C73175b f214847e = null;

    /* renamed from: f */
    public boolean f214848f = false;

    /* renamed from: g */
    public TextView f214849g;

    /* renamed from: com.tencent.mm.ui.base.MMLoadMoreListView$a */
    public class C73174a implements AbsListView.OnScrollListener {
        public C73174a() {
        }

        public void onScroll(AbsListView absListView, int i, int i2, int i3) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(absListView);
            arrayList.add(Integer.valueOf(i));
            arrayList.add(Integer.valueOf(i2));
            arrayList.add(Integer.valueOf(i3));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/base/MMLoadMoreListView$1", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V", this, array);
            if (i == 0 && MMLoadMoreListView.this.getChildAt(0) != null && MMLoadMoreListView.this.getChildAt(0).getTop() == MMLoadMoreListView.this.getPaddingTop()) {
                MMLoadMoreListView.this.f214848f = true;
            } else {
                MMLoadMoreListView.this.f214848f = false;
            }
            Log.m105919d("MMLoadMoreListView", "newpoi scroll2Top %s", "" + MMLoadMoreListView.this.f214848f);
            C117292a.m165361g(this, "com/tencent/mm/ui/base/MMLoadMoreListView$1", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V");
        }

        public void onScrollStateChanged(AbsListView absListView, int i) {
            C73175b bVar;
            ArrayList arrayList = new ArrayList();
            arrayList.add(absListView);
            arrayList.add(Integer.valueOf(i));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/base/MMLoadMoreListView$1", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V", this, array);
            if (absListView.getLastVisiblePosition() == absListView.getCount() - 1 && (bVar = MMLoadMoreListView.this.f214847e) != null) {
                bVar.onLoadMore();
            }
            C117292a.m165361g(this, "com/tencent/mm/ui/base/MMLoadMoreListView$1", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V");
        }
    }

    /* renamed from: com.tencent.mm.ui.base.MMLoadMoreListView$b */
    public interface C73175b {
        void onLoadMore();
    }

    public MMLoadMoreListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo101729e();
    }

    /* renamed from: b */
    public void mo101727b() {
        if (this.f214846d != null) {
            this.f214849g.setVisibility(8);
            View view = this.f214846d;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/ui/base/MMLoadMoreListView", "dismissFooterView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/ui/base/MMLoadMoreListView", "dismissFooterView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    /* renamed from: c */
    public void mo101728c() {
        if (this.f214846d.getParent() == null) {
            if (this.f214846d == null) {
                mo101730f();
            }
            try {
                removeFooterView(this.f214846d);
                addFooterView(this.f214846d);
            } catch (Exception unused) {
            }
        }
        this.f214849g.setVisibility(0);
        View view = this.f214846d;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(0);
        View view2 = view;
        C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/ui/base/MMLoadMoreListView", "displayFooterView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view2, "com/tencent/mm/ui/base/MMLoadMoreListView", "displayFooterView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    /* renamed from: e */
    public final void mo101729e() {
        if (this.f214846d == null) {
            mo101730f();
            addFooterView(this.f214846d);
            View view = this.f214846d;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/ui/base/MMLoadMoreListView", APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/ui/base/MMLoadMoreListView", APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    /* renamed from: f */
    public final void mo101730f() {
        View inflate = View.inflate(getContext(), C0966R.C0971layout.bcf, (ViewGroup) null);
        this.f214846d = inflate;
        this.f214849g = (TextView) inflate.findViewById(C0966R.C0970id.edi);
        View view = this.f214846d;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/ui/base/MMLoadMoreListView", "initFooter", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/ui/base/MMLoadMoreListView", "initFooter", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    /* renamed from: g */
    public void mo101731g() {
        setOnScrollListener(new C73174a());
    }

    public boolean getScroll2Top() {
        return getFirstVisiblePosition() == 0 && getChildAt(0) != null && getChildAt(0).getTop() == getPaddingTop();
    }

    public void setFooterTips(String str) {
        this.f214849g.setText(str);
    }

    public void setOnFootrClickListener(View.OnClickListener onClickListener) {
        this.f214849g.setOnClickListener(onClickListener);
    }

    public void setOnLoadMoreListener(C73175b bVar) {
        this.f214847e = bVar;
    }

    public MMLoadMoreListView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo101729e();
    }
}
