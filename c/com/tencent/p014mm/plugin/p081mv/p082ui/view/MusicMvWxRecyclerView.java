package com.tencent.p014mm.plugin.p081mv.p082ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.tencent.p014mm.view.recyclerview.WxRecyclerView;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001:\u0001\u0013B\u001b\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fB#\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u000e\u0010\u0012R$\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u0014"}, mo182094d2 = {"Lcom/tencent/mm/plugin/mv/ui/view/MusicMvWxRecyclerView;", "Lcom/tencent/mm/view/recyclerview/WxRecyclerView;", "Lcom/tencent/mm/plugin/mv/ui/view/MusicMvWxRecyclerView$a;", "E1", "Lcom/tencent/mm/plugin/mv/ui/view/MusicMvWxRecyclerView$a;", "getChangeListener", "()Lcom/tencent/mm/plugin/mv/ui/view/MusicMvWxRecyclerView$a;", "setChangeListener", "(Lcom/tencent/mm/plugin/mv/ui/view/MusicMvWxRecyclerView$a;)V", "changeListener", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyle", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "a", "plugin-mv_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.mv.ui.view.MusicMvWxRecyclerView */
public class MusicMvWxRecyclerView extends WxRecyclerView {

    /* renamed from: E1 */
    public C57122a f163660E1;

    /* renamed from: com.tencent.mm.plugin.mv.ui.view.MusicMvWxRecyclerView$a */
    public interface C57122a {
        /* renamed from: a */
        void mo80640a(View view);

        /* renamed from: b */
        void mo80641b(View view);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MusicMvWxRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
    }

    public final C57122a getChangeListener() {
        return this.f163660E1;
    }

    public void onViewAdded(View view) {
        super.onViewAdded(view);
        C57122a aVar = this.f163660E1;
        if (aVar != null) {
            aVar.mo80641b(view);
        }
    }

    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        C57122a aVar = this.f163660E1;
        if (aVar != null) {
            aVar.mo80640a(view);
        }
    }

    public final void setChangeListener(C57122a aVar) {
        this.f163660E1 = aVar;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MusicMvWxRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
    }
}
