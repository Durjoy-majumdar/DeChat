package com.tencent.p014mm.plugin.finder.video.plugin.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import gy3.C87412m;
import kg3.C76577a;
import kotlin.Metadata;

@Metadata(mo182093d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/video/plugin/view/SubRecordFinishView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-vlog-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1}, mo182098xi = 48)
/* renamed from: com.tencent.mm.plugin.finder.video.plugin.view.SubRecordFinishView */
public final class SubRecordFinishView extends FrameLayout {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SubRecordFinishView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
        LayoutInflater.from(context).inflate(C0966R.C0971layout.f359786aq1, this, true);
        ((WeImageView) findViewById(C0966R.C0970id.k9r)).setIconColor(C76577a.m92153d(context, C0966R.color.f2939n));
        setContentDescription(C76577a.m92166q(context, C0966R.string.f360479d42));
    }
}
