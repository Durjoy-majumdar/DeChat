package com.tencent.p014mm.plugin.topstory.p113ui.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.tencent.p014mm.p136ui.base.CustomViewPager;
import com.tencent.p014mm.p136ui.widget.MMWebView;
import com.tencent.p014mm.sdk.platformtools.Log;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002B\u001d\b\u0016\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, mo182094d2 = {"Lcom/tencent/mm/plugin/topstory/ui/widget/TopStoryViewPager;", "Lcom/tencent/mm/ui/base/CustomViewPager;", "Lcom/tencent/mm/ui/widget/MMWebView$c;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "ui-topstory_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.topstory.ui.widget.TopStoryViewPager */
public class TopStoryViewPager extends CustomViewPager implements MMWebView.C45104c {

    /* renamed from: d */
    public final String f316395d = "MicroMsg.MultiTaskViewPager";

    public TopStoryViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: a */
    public boolean mo70479a(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z) {
        if (((i3 != 0 || i >= 0) && (Math.abs(i3 - i5) >= 160 || i <= 0)) || i2 != 0) {
            return false;
        }
        setUnableDrag(false, true);
        Log.m105918d(this.f316395d, "onOverScroll, Horizontal Scroll trigger");
        return true;
    }

    public boolean canScroll(View view, boolean z, int i, int i2, int i3) {
        return true;
    }
}
