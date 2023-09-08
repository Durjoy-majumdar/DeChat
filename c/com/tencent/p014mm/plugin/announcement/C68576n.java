package com.tencent.p014mm.plugin.announcement;

import android.view.MenuItem;
import android.widget.TextView;
import com.tencent.p014mm.sdk.platformtools.ClipboardHelper;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import nj3.C11184p0;

/* renamed from: com.tencent.mm.plugin.announcement.n */
public class C68576n implements C11184p0 {

    /* renamed from: d */
    public final /* synthetic */ TextView f197003d;

    public C68576n(RoomCardUI roomCardUI, TextView textView) {
        this.f197003d = textView;
    }

    public void onMMMenuItemSelected(MenuItem menuItem, int i) {
        if (i == 0) {
            ClipboardHelper.setText(MMApplicationContext.getContext(), (CharSequence) null, this.f197003d.getText().toString());
        }
    }
}
