package com.tencent.p014mm.plugin.voiceprint.p118ui;

import android.view.MenuItem;

/* renamed from: com.tencent.mm.plugin.voiceprint.ui.i */
public class C5717i implements MenuItem.OnMenuItemClickListener {

    /* renamed from: d */
    public final /* synthetic */ VoicePrintFinishUI f21732d;

    public C5717i(VoicePrintFinishUI voicePrintFinishUI) {
        this.f21732d = voicePrintFinishUI;
    }

    public boolean onMenuItemClick(MenuItem menuItem) {
        this.f21732d.finish();
        return true;
    }
}
