package com.tencent.p014mm.plugin.ipcall.p065ui;

import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.ClipboardHelper;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import nj3.C11184p0;

/* renamed from: com.tencent.mm.plugin.ipcall.ui.x1 */
public class C4731x1 implements C11184p0 {

    /* renamed from: d */
    public final /* synthetic */ TextView f19744d;

    /* renamed from: e */
    public final /* synthetic */ IPCallUserProfileUI f19745e;

    public C4731x1(IPCallUserProfileUI iPCallUserProfileUI, TextView textView) {
        this.f19745e = iPCallUserProfileUI;
        this.f19744d = textView;
    }

    public void onMMMenuItemSelected(MenuItem menuItem, int i) {
        if (i == 0) {
            C115669n.INSTANCE.mo160131h(12766, 4);
            ClipboardHelper.setText(MMApplicationContext.getContext(), (CharSequence) null, this.f19744d.getText().toString());
            Toast.makeText(this.f19745e, C0966R.string.fun, 0).show();
        }
    }
}
