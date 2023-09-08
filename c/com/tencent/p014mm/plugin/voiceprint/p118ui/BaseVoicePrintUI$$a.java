package com.tencent.p014mm.plugin.voiceprint.p118ui;

import android.view.MenuItem;

/* renamed from: com.tencent.mm.plugin.voiceprint.ui.BaseVoicePrintUI$$a */
public final /* synthetic */ class BaseVoicePrintUI$$a implements MenuItem.OnMenuItemClickListener {

    /* renamed from: d */
    public final /* synthetic */ BaseVoicePrintUI f347501d;

    public /* synthetic */ BaseVoicePrintUI$$a(BaseVoicePrintUI baseVoicePrintUI) {
        this.f347501d = baseVoicePrintUI;
    }

    public final boolean onMenuItemClick(MenuItem menuItem) {
        BaseVoicePrintUI baseVoicePrintUI = this.f347501d;
        int i = BaseVoicePrintUI.f347485v;
        baseVoicePrintUI.finish();
        return true;
    }
}
