package com.tencent.p014mm.p136ui.chatting;

import android.content.Context;
import android.view.MenuItem;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import nj3.C11184p0;
import nj3.C76879j;
import pc0.C100760a0;

/* renamed from: com.tencent.mm.ui.chatting.n4 */
public class C44854n4 implements C11184p0 {

    /* renamed from: d */
    public final /* synthetic */ String f121697d;

    /* renamed from: e */
    public final /* synthetic */ Context f121698e;

    public C44854n4(String str, Context context) {
        this.f121697d = str;
        this.f121698e = context;
    }

    public void onMMMenuItemSelected(MenuItem menuItem, int i) {
        String str = menuItem.getTitle() + "";
        Log.m105925i("MicroMsg.LongClickBrandServiceHelper", "connector click[location]: to[%s] content[%s]", str, this.f121697d);
        C100760a0.C100764f a = C100760a0.m131931a(str);
        a.f295187a = str;
        a.f295189c = this.f121697d;
        a.f295190d = 48;
        a.f295191e = 0;
        a.f295194h = 4;
        a.mo140195a().mo123694a();
        C115669n.INSTANCE.mo160131h(10424, 48, 16, str);
        Context context = this.f121698e;
        C76879j.m92726T(context, context.getString(C0966R.string.a2o));
    }
}
