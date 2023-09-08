package com.tencent.p014mm.plugin.finder.view.notice;

import android.content.Context;
import android.util.AttributeSet;
import com.tencent.p014mm.C0966R;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182093d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001b\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\bH\u0016J\b\u0010\n\u001a\u00020\bH\u0016¨\u0006\u000b"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/view/notice/NoticeStatusViewDarkMode;", "Lcom/tencent/mm/plugin/finder/view/notice/NoticeStatusView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "getBgRes", "", "getGreyTextColorRes", "getNormalTextColorRes", "plugin-finder-base_release"}, mo182095k = 1, mo182096mv = {1, 7, 1}, mo182098xi = 48)
/* renamed from: com.tencent.mm.plugin.finder.view.notice.NoticeStatusViewDarkMode */
public final class NoticeStatusViewDarkMode extends NoticeStatusView {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NoticeStatusViewDarkMode(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
    }

    public int getBgRes() {
        return C0966R.C0969drawable.cjy;
    }

    public int getGreyTextColorRes() {
        return C0966R.color.BW_100_Alpha_0_3;
    }

    public int getNormalTextColorRes() {
        return C0966R.color.UN_BW_0_Alpha_0_9;
    }
}
