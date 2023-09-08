package com.tencent.p014mm.plugin.repairer.p099ui.demo.refresh.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.tencent.p014mm.hellhoundlib.fragments.HellAndroidXFragment;
import com.tencent.p014mm.view.refreshLayout.WxRefreshLayout;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/repairer/ui/demo/refresh/fragment/BaseFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "ui-repairer_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.repairer.ui.demo.refresh.fragment.BaseFragment */
public abstract class BaseFragment extends HellAndroidXFragment {

    /* renamed from: d */
    public final List<String> f163964d = new ArrayList();

    /* renamed from: e */
    public WxRefreshLayout f163965e;

    /* renamed from: L */
    public static /* synthetic */ void m65952L(BaseFragment baseFragment, int i, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 1) != 0) {
                i = 19;
            }
            baseFragment.mo80800K(i);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: down");
    }

    /* renamed from: K */
    public void mo80800K(int i) {
        ((ArrayList) this.f163964d).clear();
        if (i >= 0) {
            int i2 = 0;
            while (true) {
                List<String> list = this.f163964d;
                ((ArrayList) list).add("测试数据" + i2);
                if (i2 == i) {
                    break;
                }
                i2++;
            }
        }
        mo80804P();
    }

    /* renamed from: M */
    public final WxRefreshLayout mo80801M() {
        WxRefreshLayout wxRefreshLayout = this.f163965e;
        if (wxRefreshLayout != null) {
            return wxRefreshLayout;
        }
        C87412m.m108603p("refreshLayout");
        throw null;
    }

    /* renamed from: N */
    public abstract void mo80802N();

    /* renamed from: O */
    public abstract void mo80803O(View view);

    /* renamed from: P */
    public void mo80804P() {
    }

    /* renamed from: Q */
    public void mo80805Q() {
        int size = ((ArrayList) this.f163964d).size();
        int i = size + 10;
        while (size < i) {
            List<String> list = this.f163964d;
            ((ArrayList) list).add("测试数据" + size);
            size++;
        }
        mo80804P();
    }

    public abstract int getLayoutId();

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C87412m.m108594g(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(getLayoutId(), (ViewGroup) null);
        C87412m.m108593f(inflate, "view");
        mo80803O(inflate);
        mo80802N();
        return inflate;
    }
}
