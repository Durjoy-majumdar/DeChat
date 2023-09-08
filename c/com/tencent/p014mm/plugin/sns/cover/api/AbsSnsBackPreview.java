package com.tencent.p014mm.plugin.sns.cover.api;

import android.content.Context;
import android.view.LayoutInflater;
import android.widget.RelativeLayout;
import pr2.C100844c;
import pr2.C100848g;

/* renamed from: com.tencent.mm.plugin.sns.cover.api.AbsSnsBackPreview */
public abstract class AbsSnsBackPreview extends RelativeLayout implements IAbsSnsBackPreview {
    public AbsSnsBackPreview(Context context) {
        super(context);
        LayoutInflater.from(context).inflate(getLayoutId(), this, true);
    }

    public abstract int getLayoutId();

    public abstract int getType();

    public abstract void loadCover(C100844c cVar);

    public abstract void onDestroy();

    public abstract void onPause();

    public abstract void onResume();

    public void setCoverFoldStatusProvider(C100848g gVar) {
    }
}
