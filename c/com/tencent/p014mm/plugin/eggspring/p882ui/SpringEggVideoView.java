package com.tencent.p014mm.plugin.eggspring.p882ui;

import android.content.Context;
import android.util.AttributeSet;
import com.tencent.p014mm.modelvideo.MMVideoView;
import com.tencent.p014mm.pluginsdk.p133ui.C96814a;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0019\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bB!\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\n\u0010\u000eJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\u000f"}, mo182094d2 = {"Lcom/tencent/mm/plugin/eggspring/ui/SpringEggVideoView;", "Lcom/tencent/mm/modelvideo/MMVideoView;", "", "filepath", "Lrx3/b0;", "setFilepath", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-eggspring_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.eggspring.ui.SpringEggVideoView */
public final class SpringEggVideoView extends MMVideoView {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SpringEggVideoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
        C87412m.m108594g(attributeSet, "attrs");
        setScaleType(C96814a.C96817e.CROP);
        setIsShowBasicControls(false);
    }

    public void setFilepath(String str) {
        super.setFilepath(str);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SpringEggVideoView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
        C87412m.m108594g(attributeSet, "attrs");
        setScaleType(C96814a.C96817e.CROP);
        setIsShowBasicControls(false);
    }
}
