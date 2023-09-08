package com.tencent.p014mm.plugin.profile.p088ui.tab.view;

import android.content.Context;
import android.util.AttributeSet;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.tencent.p014mm.plugin.appbrand.widget.recyclerview.LoadMoreRecyclerView;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0016B\u001b\b\u0016\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012B#\b\u0016\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0011\u0010\u0015J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R$\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\u0017"}, mo182094d2 = {"Lcom/tencent/mm/plugin/profile/ui/tab/view/BizProfileRecyclerView;", "Lcom/tencent/mm/plugin/appbrand/widget/recyclerview/LoadMoreRecyclerView;", "Lcom/tencent/mm/plugin/profile/ui/tab/view/BizProfileRecyclerView$a;", "listener", "Lrx3/b0;", "setOnScrollToTopListener", "F1", "Lcom/tencent/mm/plugin/profile/ui/tab/view/BizProfileRecyclerView$a;", "getMOnScrollToTopListener", "()Lcom/tencent/mm/plugin/profile/ui/tab/view/BizProfileRecyclerView$a;", "setMOnScrollToTopListener", "(Lcom/tencent/mm/plugin/profile/ui/tab/view/BizProfileRecyclerView$a;)V", "mOnScrollToTopListener", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyle", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "a", "app_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.profile.ui.tab.view.BizProfileRecyclerView */
public final class BizProfileRecyclerView extends LoadMoreRecyclerView {

    /* renamed from: F1 */
    public C42770a f115795F1;

    /* renamed from: com.tencent.mm.plugin.profile.ui.tab.view.BizProfileRecyclerView$a */
    public interface C42770a {
        /* renamed from: a */
        void mo66881a();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BizProfileRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
    }

    public final C42770a getMOnScrollToTopListener() {
        return this.f115795F1;
    }

    /* renamed from: r1 */
    public void mo17115r1(int i) {
        super.mo17115r1(i);
        Log.m105918d("BizProfileRecyclerView", "scrollToPosition:" + i);
    }

    public final void setMOnScrollToTopListener(C42770a aVar) {
        this.f115795F1 = aVar;
    }

    public final void setOnScrollToTopListener(C42770a aVar) {
        C87412m.m108594g(aVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.f115795F1 = aVar;
    }

    /* renamed from: t1 */
    public void mo17149t1(int i) {
        C42770a aVar;
        super.mo17149t1(i);
        if (i == 0 && (aVar = this.f115795F1) != null) {
            aVar.mo66881a();
        }
        Log.m105918d("BizProfileRecyclerView", "smoothScrollToPosition:" + i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BizProfileRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
    }
}
