package com.tencent.p014mm.plugin.finder.p056ui;

import a14.C0000n0;
import a14.C53934p0;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import bl3.C0317e;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter;
import com.tencent.p014mm.view.recyclerview.WxRecyclerView;
import fy3.C32224a;
import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ArrayList;
import java.util.List;
import kotlin.ResultKt;
import p192l4.C10462b;
import pe1.C35464c;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import wx3.C15601d;
import wx3.C66212f;
import ye1.C66628j;
import yx3.C91590f;
import yx3.C91594j;

/* renamed from: com.tencent.mm.plugin.finder.ui.ViewBindUIC */
public final class ViewBindUIC extends UIComponent {

    /* renamed from: d */
    public final C13601g f161172d = C36568h.m40985a(new C56377a(this));

    /* renamed from: e */
    public final ArrayList<C35464c<?>> f161173e;

    /* renamed from: f */
    public final WxRecyclerAdapter<C35464c<?>> f161174f;

    /* renamed from: com.tencent.mm.plugin.finder.ui.ViewBindUIC$a */
    public static final class C56377a extends C87413o implements C32224a<C66628j> {

        /* renamed from: d */
        public final /* synthetic */ ViewBindUIC f161175d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C56377a(ViewBindUIC viewBindUIC) {
            super(0);
            this.f161175d = viewBindUIC;
        }

        public Object invoke() {
            View findViewIdRootView = this.f161175d.getFindViewIdRootView();
            C87412m.m108591d(findViewIdRootView);
            FrameLayout frameLayout = (FrameLayout) findViewIdRootView;
            WxRecyclerView wxRecyclerView = (WxRecyclerView) C10462b.m10395a(findViewIdRootView, C0966R.C0970id.iio);
            if (wxRecyclerView != null) {
                return new C66628j(frameLayout, frameLayout, wxRecyclerView);
            }
            throw new NullPointerException("Missing required view with ID: ".concat(findViewIdRootView.getResources().getResourceName(C0966R.C0970id.iio)));
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.finder.ui.ViewBindUIC$updateData$1", mo125469f = "FinderSettingsUI.kt", mo125470l = {}, mo125471m = "invokeSuspend")
    /* renamed from: com.tencent.mm.plugin.finder.ui.ViewBindUIC$b */
    public static final class C56378b extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public final /* synthetic */ ViewBindUIC f161176d;

        /* renamed from: e */
        public final /* synthetic */ List<C35464c<?>> f161177e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C56378b(ViewBindUIC viewBindUIC, List<? extends C35464c<?>> list, C15601d<? super C56378b> dVar) {
            super(2, dVar);
            this.f161176d = viewBindUIC;
            this.f161177e = list;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C56378b(this.f161176d, this.f161177e, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C56378b) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            ResultKt.throwOnFailure(obj);
            this.f161176d.f161173e.clear();
            this.f161176d.f161173e.addAll(this.f161177e);
            this.f161176d.f161174f.notifyDataSetChanged();
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ViewBindUIC(Fragment fragment) {
        super(fragment);
        C87412m.m108594g(fragment, "fragment");
        ArrayList<C35464c<?>> arrayList = new ArrayList<>();
        this.f161173e = arrayList;
        this.f161174f = new WxRecyclerAdapter<>(new ViewBindUIC$adapter$1(this), arrayList, false);
    }

    /* renamed from: c3 */
    public final void mo79129c3(List<? extends C35464c<?>> list) {
        C87412m.m108594g(list, "data");
        C0317e.launchUI$default(this, (C66212f) null, (C53934p0) null, new C56378b(this, list, (C15601d<? super C56378b>) null), 3, (Object) null);
    }

    public int getLayoutId() {
        return C0966R.C0971layout.cs9;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        WxRecyclerView wxRecyclerView = ((C66628j) ((C36570n) this.f161172d).getValue()).f191589a;
        wxRecyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        wxRecyclerView.setAdapter(this.f161174f);
    }
}
