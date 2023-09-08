package com.tencent.p014mm.p136ui.chatting;

import android.content.Context;
import android.view.MenuItem;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72996z1;
import nj3.C11184p0;
import nj3.C76879j;
import pc0.C100760a0;

/* renamed from: com.tencent.mm.ui.chatting.o4 */
public class C44855o4 implements C11184p0 {

    /* renamed from: d */
    public final /* synthetic */ String f121699d;

    /* renamed from: e */
    public final /* synthetic */ Context f121700e;

    public C44855o4(String str, Context context) {
        this.f121699d = str;
        this.f121700e = context;
    }

    public void onMMMenuItemSelected(MenuItem menuItem, int i) {
        String str = menuItem.getTitle() + "";
        Log.m105925i("MicroMsg.LongClickBrandServiceHelper", "connector click[location]: to[%s] content[%s]", str, this.f121699d);
        C72963f4.C72964b f = C72963f4.C72964b.m85654f(this.f121699d);
        C100760a0.C100764f a = C100760a0.m131931a(str);
        a.f295187a = str;
        a.f295189c = this.f121699d;
        int i2 = 66;
        a.f295190d = C72996z1.m85843n5(f.f212675a) ? 66 : 42;
        a.f295191e = 0;
        a.f295194h = 4;
        a.mo140195a().mo123694a();
        C115669n nVar = C115669n.INSTANCE;
        Object[] objArr = new Object[3];
        if (!C72996z1.m85843n5(f.f212675a)) {
            i2 = 42;
        }
        objArr[0] = Integer.valueOf(i2);
        objArr[1] = 32;
        objArr[2] = str;
        nVar.mo160131h(10424, objArr);
        Context context = this.f121700e;
        C76879j.m92726T(context, context.getString(C0966R.string.a2o));
    }
}
