package com.tencent.p014mm.plugin.sns.p106ui;

import android.content.DialogInterface;
import android.view.MenuItem;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import nj3.C76879j;

/* renamed from: com.tencent.mm.plugin.sns.ui.k5 */
public class C95999k5 implements MenuItem.OnMenuItemClickListener {

    /* renamed from: d */
    public final /* synthetic */ SnsOnlineVideoActivity f280327d;

    /* renamed from: com.tencent.mm.plugin.sns.ui.k5$a */
    public class C96000a implements DialogInterface.OnClickListener {
        public C96000a() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity$5$1");
            SnsOnlineVideoActivity snsOnlineVideoActivity = C95999k5.this.f280327d;
            int i2 = SnsOnlineVideoActivity.f278370y0;
            SnsMethodCalculate.markStartTimeMs("access$1702", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity");
            snsOnlineVideoActivity.f278376F = true;
            SnsMethodCalculate.markEndTimeMs("access$1702", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity");
            C95999k5.this.f280327d.mo132875W7();
            SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity$5$1");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.k5$b */
    public class C96001b implements DialogInterface.OnClickListener {
        public C96001b(C95999k5 k5Var) {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity$5$2");
            SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity$5$2");
        }
    }

    public C95999k5(SnsOnlineVideoActivity snsOnlineVideoActivity) {
        this.f280327d = snsOnlineVideoActivity;
    }

    public boolean onMenuItemClick(MenuItem menuItem) {
        SnsMethodCalculate.markStartTimeMs("onMenuItemClick", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity$5");
        C76879j.m92743n(this.f280327d, C0966R.string.jjr, C0966R.string.a3h, new C96000a(), new C96001b(this));
        SnsMethodCalculate.markEndTimeMs("onMenuItemClick", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity$5");
        return true;
    }
}
