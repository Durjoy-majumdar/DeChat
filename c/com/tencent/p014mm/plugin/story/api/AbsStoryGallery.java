package com.tencent.p014mm.plugin.story.api;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import com.tencent.p014mm.p136ui.widget.listview.PullDownListView;
import xv2.C102778f;

/* renamed from: com.tencent.mm.plugin.story.api.AbsStoryGallery */
public abstract class AbsStoryGallery extends RelativeLayout {
    public AbsStoryGallery(Context context) {
        super(context);
    }

    /* renamed from: a */
    public abstract void mo98061a(PullDownListView pullDownListView);

    /* renamed from: b */
    public abstract void mo98062b();

    /* renamed from: c */
    public abstract void mo98063c();

    /* renamed from: d */
    public abstract boolean mo98064d();

    /* renamed from: e */
    public abstract void mo98065e(int i);

    /* renamed from: f */
    public abstract void mo98066f();

    /* renamed from: g */
    public abstract void mo98067g(int i);

    /* renamed from: h */
    public abstract void mo98068h(int i);

    /* renamed from: i */
    public abstract void mo98069i();

    /* renamed from: j */
    public abstract void mo98070j();

    /* renamed from: k */
    public abstract void mo98071k();

    /* renamed from: l */
    public abstract void mo98072l();

    /* renamed from: m */
    public abstract void mo98073m();

    /* renamed from: n */
    public abstract void mo98074n();

    /* renamed from: o */
    public abstract void mo98075o(boolean z);

    /* renamed from: p */
    public abstract void mo98076p(boolean z, boolean z2);

    /* renamed from: q */
    public abstract void mo98077q();

    public abstract void setCurrentHItem(int i);

    public abstract void setCurrentVItem(int i);

    public abstract void setDataSeed(Object obj);

    public abstract void setStoryBrowseUIListener(C102778f fVar);

    public AbsStoryGallery(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public AbsStoryGallery(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
