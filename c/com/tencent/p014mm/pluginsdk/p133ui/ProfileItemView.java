package com.tencent.p014mm.pluginsdk.p133ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import com.tencent.p014mm.storage.C72996z1;

/* renamed from: com.tencent.mm.pluginsdk.ui.ProfileItemView */
public abstract class ProfileItemView extends FrameLayout {

    /* renamed from: d */
    public C72996z1 f24012d;

    public ProfileItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    public abstract void mo5918a();

    public abstract int getLayout();

    public ProfileItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(getLayout(), this);
        mo5918a();
    }
}
