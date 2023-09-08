package com.tencent.p014mm.plugin.wenote.p131ui.nativenote.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import gy3.C87412m;
import j20.C117292a;
import java.util.LinkedList;
import k20.C60958c;
import k20.C9556a;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\f"}, mo182094d2 = {"Lcom/tencent/mm/plugin/wenote/ui/nativenote/view/MediaGroupItemCoverView;", "Landroid/widget/LinearLayout;", "", "visibility", "Lrx3/b0;", "setVisibility", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "app_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.wenote.ui.nativenote.view.MediaGroupItemCoverView */
public final class MediaGroupItemCoverView extends LinearLayout {

    /* renamed from: d */
    public final LinkedList<View> f23919d = new LinkedList<>();

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MediaGroupItemCoverView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        if (i == 8) {
            for (View view : this.f23919d) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(Integer.valueOf(i));
                C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/wenote/ui/nativenote/view/MediaGroupItemCoverView", "setVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view, "com/tencent/mm/plugin/wenote/ui/nativenote/view/MediaGroupItemCoverView", "setVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
    }
}
