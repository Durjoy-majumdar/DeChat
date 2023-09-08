package com.tencent.p014mm.plugin.finder.view.notice;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import com.tencent.p014mm.C0966R;
import fy3.C32224a;
import gy3.C87412m;
import kg3.C76577a;
import kotlin.Metadata;
import te3.C49098d51;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0006\u001a\u00020\u0004H\u0016J\b\u0010\u0007\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0004H\u0016¨\u0006\u000f"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/view/notice/BigGreenNoticeStatusView;", "Lcom/tencent/mm/plugin/finder/view/notice/NoticeStatusView;", "", "getPayText", "", "getLayoutId", "getBgRes", "getNormalTextColorRes", "getGreyTextColorRes", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-finder-base_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.view.notice.BigGreenNoticeStatusView */
public final class BigGreenNoticeStatusView extends NoticeStatusView {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BigGreenNoticeStatusView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
        ViewGroup.LayoutParams layoutParams = getTvPrice().getLayoutParams();
        C87412m.m108592e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.topMargin = C76577a.m92151b(context, 1);
        getTvPrice().setLayoutParams(marginLayoutParams);
    }

    /* renamed from: f */
    public void mo5009f(String str, C32224a<? extends C49098d51> aVar) {
        C87412m.m108594g(aVar, "getNoticeInfo");
        super.mo5009f(str, aVar);
        if (((C49098d51) aVar.invoke()).f132119e == 0) {
            getBgView().setBackground(getResources().getDrawable(C0966R.C0969drawable.f5217go));
            getIvTicket().setIconColor(getResources().getColor(getGreyTextColorRes()));
            getTvBigText().setTextColor(getResources().getColor(getGreyTextColorRes()));
        }
    }

    public int getBgRes() {
        return C0966R.C0969drawable.b8u;
    }

    public int getGreyTextColorRes() {
        return C0966R.color.BW_0_Alpha_0_7;
    }

    public int getLayoutId() {
        return C0966R.C0971layout.f7162d2;
    }

    public int getNormalTextColorRes() {
        return C0966R.color.al_;
    }

    public String getPayText() {
        String string = getResources().getString(C0966R.string.f8157py);
        C87412m.m108593f(string, "resources.getString(R.st…cribe_to_watch_big_green)");
        return string;
    }
}
