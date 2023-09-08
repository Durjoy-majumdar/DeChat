package com.tencent.p014mm.plugin.profile.p088ui;

import android.content.Context;
import android.view.MenuItem;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.ClipboardHelper;
import nj3.C11184p0;
import nj3.C76879j;

/* renamed from: com.tencent.mm.plugin.profile.ui.y1 */
public class C70305y1 implements C11184p0 {

    /* renamed from: d */
    public final /* synthetic */ String f203083d;

    /* renamed from: e */
    public final /* synthetic */ NormalProfileHeaderPreference f203084e;

    public C70305y1(NormalProfileHeaderPreference normalProfileHeaderPreference, String str) {
        this.f203084e = normalProfileHeaderPreference;
        this.f203083d = str;
    }

    public void onMMMenuItemSelected(MenuItem menuItem, int i) {
        if (i == 0) {
            ClipboardHelper.setText(this.f203083d);
            Context context = this.f203084e.f202574N;
            C76879j.m92729W(context, context.getString(C0966R.string.f7938wv));
        }
    }
}
