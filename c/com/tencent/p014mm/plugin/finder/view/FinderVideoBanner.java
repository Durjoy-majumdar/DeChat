package com.tencent.p014mm.plugin.finder.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85868k2;
import com.tencent.p014mm.plugin.finder.video.FinderVideoLayout;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012B#\b\u0016\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0011\u0010\u0015J\b\u0010\u0004\u001a\u00020\u0003H\u0017R\"\u0010\f\u001a\u00020\u00058\u0016@\u0016X\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\u0016"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/view/FinderVideoBanner;", "Lcom/tencent/mm/plugin/finder/view/FinderBaseMediaBanner;", "Lcom/tencent/mm/plugin/finder/video/FinderVideoLayout;", "", "getContentDescription", "Lcom/tencent/mm/plugin/finder/view/u7;", "q", "Lcom/tencent/mm/plugin/finder/view/u7;", "getMediaType", "()Lcom/tencent/mm/plugin/finder/view/u7;", "setMediaType", "(Lcom/tencent/mm/plugin/finder/view/u7;)V", "mediaType", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.view.FinderVideoBanner */
public final class FinderVideoBanner extends FinderBaseMediaBanner<FinderVideoLayout> {

    /* renamed from: q */
    public C4189u7 f17969q = C4189u7.VIDEO;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderVideoBanner(Context context) {
        super(context);
        C87412m.m108594g(context, "context");
        View inflate = C85868k2.m106137b(getContext()).inflate(C0966R.C0971layout.alk, this, false);
        C87412m.m108592e(inflate, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.video.FinderVideoLayout");
        FinderVideoLayout finderVideoLayout = (FinderVideoLayout) inflate;
        addView(finderVideoLayout, new FrameLayout.LayoutParams(-1, -1));
        setMediaView(finderVideoLayout);
    }

    /* renamed from: b */
    public View mo4376b() {
        return (FinderVideoLayout) getMediaView();
    }

    public CharSequence getContentDescription() {
        FinderVideoLayout.C56521b playInfo;
        FinderVideoLayout finderVideoLayout = (FinderVideoLayout) ((FinderVideoLayout) getMediaView()).findViewById(C0966R.C0970id.d7a);
        boolean z = true;
        if (finderVideoLayout == null || (playInfo = finderVideoLayout.getPlayInfo()) == null || !playInfo.f161898g) {
            z = false;
        }
        if (z) {
            String string = getResources().getString(C0966R.string.a1s);
            C87412m.m108593f(string, "{\n            resources.…tring.app_play)\n        }");
            return string;
        }
        String string2 = getResources().getString(C0966R.string.a1a);
        C87412m.m108593f(string2, "{\n            resources.…ring.app_pause)\n        }");
        return string2;
    }

    public C4189u7 getMediaType() {
        return this.f17969q;
    }

    public void setMediaType(C4189u7 u7Var) {
        C87412m.m108594g(u7Var, "<set-?>");
        this.f17969q = u7Var;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderVideoBanner(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
        View inflate = C85868k2.m106137b(getContext()).inflate(C0966R.C0971layout.alk, this, false);
        C87412m.m108592e(inflate, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.video.FinderVideoLayout");
        FinderVideoLayout finderVideoLayout = (FinderVideoLayout) inflate;
        addView(finderVideoLayout, new FrameLayout.LayoutParams(-1, -1));
        setMediaView(finderVideoLayout);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderVideoBanner(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
        View inflate = C85868k2.m106137b(getContext()).inflate(C0966R.C0971layout.alk, this, false);
        C87412m.m108592e(inflate, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.video.FinderVideoLayout");
        FinderVideoLayout finderVideoLayout = (FinderVideoLayout) inflate;
        addView(finderVideoLayout, new FrameLayout.LayoutParams(-1, -1));
        setMediaView(finderVideoLayout);
    }
}
