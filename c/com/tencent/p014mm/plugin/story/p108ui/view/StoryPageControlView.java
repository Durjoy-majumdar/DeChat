package com.tencent.p014mm.plugin.story.p108ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.tencent.p014mm.p136ui.base.MMPageControlView;
import gy3.C87412m;
import java.util.HashMap;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\fB\u0019\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¨\u0006\r"}, mo182094d2 = {"Lcom/tencent/mm/plugin/story/ui/view/StoryPageControlView;", "Lcom/tencent/mm/ui/base/MMPageControlView;", "Lcom/tencent/mm/plugin/story/ui/view/StoryPageControlView$a;", "pageControlInterface", "Lrx3/b0;", "setPageIndicatorStatusInterface", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "a", "plugin-story_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.story.ui.view.StoryPageControlView */
public final class StoryPageControlView extends MMPageControlView {

    /* renamed from: com.tencent.mm.plugin.story.ui.view.StoryPageControlView$a */
    public interface C96406a {
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StoryPageControlView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
        C87412m.m108594g(attributeSet, "attrs");
    }

    /* renamed from: a */
    public void mo131771a(int i) {
        super.mo131771a(i);
        int i2 = this.f284231e;
        int i3 = 0;
        while (i3 < i2) {
            ImageView imageView = (ImageView) ((HashMap) this.f284232f).get(Integer.valueOf(i3));
            this.f284233g = imageView;
            imageView.setSelected(i == i3);
            i3++;
        }
    }

    public final void setPageIndicatorStatusInterface(C96406a aVar) {
    }
}
