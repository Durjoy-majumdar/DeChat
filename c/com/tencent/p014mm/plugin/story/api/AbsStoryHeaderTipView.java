package com.tencent.p014mm.plugin.story.api;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.RelativeLayout;

/* renamed from: com.tencent.mm.plugin.story.api.AbsStoryHeaderTipView */
public abstract class AbsStoryHeaderTipView extends RelativeLayout {
    public AbsStoryHeaderTipView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: a */
    public abstract void mo134175a();

    /* renamed from: b */
    public abstract void mo134176b();

    /* renamed from: c */
    public abstract void mo134177c();

    /* renamed from: d */
    public abstract void mo134178d();

    /* renamed from: e */
    public abstract void mo134179e();

    /* renamed from: f */
    public abstract void mo134180f();

    /* renamed from: g */
    public abstract void mo134181g();

    public abstract void setSnsType(int i);

    public AbsStoryHeaderTipView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
