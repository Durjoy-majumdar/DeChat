package com.tencent.p014mm.plugin.webview.p128ui.tools;

import android.view.MenuItem;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import nj3.C11184p0;
import p140cw.C7138g;
import p447aw.C103918d;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.j */
public class C6181j implements C11184p0 {

    /* renamed from: d */
    public final /* synthetic */ OpenFileChooserUI f22651d;

    public C6181j(OpenFileChooserUI openFileChooserUI) {
        this.f22651d = openFileChooserUI;
    }

    public void onMMMenuItemSelected(MenuItem menuItem, int i) {
        boolean z1 = ((C103918d) C86312j.m106911c(C103918d.class)).mo125788z1(this.f22651d.getContext(), "android.permission.CAMERA", 16, "", "");
        Log.m105925i("MicroMsg.OpenFileChooserUI", "summerper checkPermission checkCamera[%b], stack[%s], activity[%s]", Boolean.valueOf(z1), Util.getStack(), this.f22651d.getContext());
        if (z1) {
            AppCompatActivity context = this.f22651d.getContext();
            OpenFileChooserUI openFileChooserUI = this.f22651d;
            int i2 = OpenFileChooserUI.f22500u;
            String K7 = openFileChooserUI.mo7081K7();
            ((C7138g) C86312j.m106911c(C7138g.class)).Gl0(context, K7, "microMsg." + System.currentTimeMillis() + ".jpg", 2);
        }
    }
}
