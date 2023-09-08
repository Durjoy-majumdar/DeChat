package com.tencent.p014mm.p136ui.contact;

import android.view.MenuItem;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.ui.contact.v3 */
public class C74575v3 implements MenuItem.OnMenuItemClickListener {

    /* renamed from: d */
    public final /* synthetic */ SelectLabelContactUI f219222d;

    public C74575v3(SelectLabelContactUI selectLabelContactUI) {
        this.f219222d = selectLabelContactUI;
    }

    public boolean onMenuItemClick(MenuItem menuItem) {
        ArrayList arrayList = new ArrayList(this.f219222d.f218842F);
        Log.m105925i("MicroMsg.SelectLabelContactUI", "SelectUser: %s", arrayList.toString());
        this.f219222d.mo103465g8(Util.listToString(arrayList, ","));
        return true;
    }
}
