package com.tencent.p014mm.live.core.mini;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u000e\u001a\u00020\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0006\u001a\u00020\u0002H&J\u0012\u0010\t\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0007H&¨\u0006\u0011"}, mo182094d2 = {"Lcom/tencent/mm/live/core/mini/AbsLiveMiniView;", "Landroid/widget/FrameLayout;", "", "state", "Lrx3/b0;", "setState", "getCurrentState", "", "coverUrl", "setBgCoverUrl", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "style", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-core_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.live.core.mini.AbsLiveMiniView */
public abstract class AbsLiveMiniView extends FrameLayout {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AbsLiveMiniView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
    }

    /* renamed from: a */
    public abstract void mo76394a(int i);

    /* renamed from: b */
    public abstract int mo76395b();

    /* renamed from: c */
    public void mo76396c() {
    }

    /* renamed from: d */
    public abstract void mo76397d(int i);

    public abstract int getCurrentState();

    public abstract void setBgCoverUrl(String str);

    public abstract void setState(int i);
}
