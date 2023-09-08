package com.tencent.p014mm.plugin.finder.live.view;

import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.view.refreshLayout.WxRefreshLayout;
import hp3.C87581a;
import java.util.LinkedList;
import ob0.C89132b;
import qk1.C12802g2;
import rx3.C13598b0;
import te3.C49098d51;
import te3.C49236e51;
import te3.C49310eo0;

/* renamed from: com.tencent.mm.plugin.finder.live.view.x0 */
public final class C3235x0<_Ret, _Var> implements C87581a {

    /* renamed from: a */
    public final /* synthetic */ FinderLiveMultiNoticeView f15362a;

    /* renamed from: b */
    public final /* synthetic */ boolean f15363b;

    public C3235x0(FinderLiveMultiNoticeView finderLiveMultiNoticeView, boolean z) {
        this.f15362a = finderLiveMultiNoticeView;
        this.f15363b = z;
    }

    public Object call(Object obj) {
        boolean z;
        C49310eo0 eo02;
        C49236e51 e512;
        C89132b.C89134c cVar = (C89132b.C89134c) obj;
        if (cVar.f256793a != 0 || cVar.f256794b != 0 || (eo02 = (C49310eo0) cVar.f256796d) == null || (e512 = eo02.f133029g) == null) {
            z = true;
        } else {
            boolean z2 = this.f15363b;
            FinderLiveMultiNoticeView finderLiveMultiNoticeView = this.f15362a;
            LinkedList<C49098d51> linkedList = e512.f132697d;
            if (linkedList != null) {
                z = e512.f132698e == 1;
                if (z2) {
                    C12802g2 a = finderLiveMultiNoticeView.getMAdapter();
                    a.getClass();
                    a.f36642f = linkedList;
                    a.notifyDataSetChanged();
                } else {
                    C12802g2 a2 = finderLiveMultiNoticeView.getMAdapter();
                    a2.getClass();
                    LinkedList<C49098d51> linkedList2 = a2.f36642f;
                    int size = linkedList2 != null ? linkedList2.size() : 0;
                    if (a2.f36642f == null) {
                        a2.f36642f = new LinkedList<>();
                    }
                    LinkedList<C49098d51> linkedList3 = a2.f36642f;
                    if (linkedList3 != null) {
                        linkedList3.addAll(linkedList);
                    }
                    a2.notifyItemRangeInserted(size, linkedList.size());
                }
            } else {
                z = true;
            }
            int i = e512.f132699f;
            TextView c = finderLiveMultiNoticeView.getTitleTv();
            if (c != null) {
                c.setText(finderLiveMultiNoticeView.getContext().getResources().getString(C0966R.string.m6m, new Object[]{Integer.valueOf(i)}));
            }
        }
        if (z) {
            WxRefreshLayout b = this.f15362a.getRefreshLayout();
            if (b != null) {
                b.mo26580f(true);
            }
        } else {
            WxRefreshLayout b2 = this.f15362a.getRefreshLayout();
            if (b2 != null) {
                b2.mo26600h();
            }
        }
        String str = this.f15362a.f15284d;
        Log.m105924i(str, "#loadData fromHead=" + this.f15363b + ", hasMore=" + z);
        return C13598b0.f38549a;
    }
}
