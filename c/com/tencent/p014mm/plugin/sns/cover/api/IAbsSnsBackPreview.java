package com.tencent.p014mm.plugin.sns.cover.api;

import com.tencent.p014mm.feature.sns.api.ICoverStatusChanged;
import pr2.C100844c;
import pr2.C100848g;

/* renamed from: com.tencent.mm.plugin.sns.cover.api.IAbsSnsBackPreview */
public interface IAbsSnsBackPreview extends ICoverStatusChanged {
    int getLayoutId();

    int getType();

    void loadCover(C100844c cVar);

    void onDestroy();

    void onPause();

    void onResume();

    void setCoverFoldStatusProvider(C100848g gVar);
}
