package com.tencent.p014mm.plugin.sns.p106ui;

import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.storage.C85801v1;
import f40.C86709a0;
import j20.C117292a;
import java.util.ArrayList;
import nj3.C76879j;

/* renamed from: com.tencent.mm.plugin.sns.ui.f7 */
public class C95783f7 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ Context f279443d;

    /* renamed from: e */
    public final /* synthetic */ SnsUploadConfigView f279444e;

    /* renamed from: com.tencent.mm.plugin.sns.ui.f7$a */
    public class C95784a implements DialogInterface.OnClickListener {
        public C95784a() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsUploadConfigView$2$1");
            SnsUploadConfigView snsUploadConfigView = C95783f7.this.f279444e;
            int i2 = SnsUploadConfigView.f278888u;
            SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.SnsUploadConfigView");
            boolean z = snsUploadConfigView.f278897o;
            SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.SnsUploadConfigView");
            SnsMethodCalculate.markStartTimeMs("access$302", "com.tencent.mm.plugin.sns.ui.SnsUploadConfigView");
            snsUploadConfigView.f278897o = !z;
            SnsMethodCalculate.markEndTimeMs("access$302", "com.tencent.mm.plugin.sns.ui.SnsUploadConfigView");
            SnsUploadConfigView snsUploadConfigView2 = C95783f7.this.f279444e;
            SnsMethodCalculate.markStartTimeMs("access$400", "com.tencent.mm.plugin.sns.ui.SnsUploadConfigView");
            snsUploadConfigView2.mo133066f();
            SnsMethodCalculate.markEndTimeMs("access$400", "com.tencent.mm.plugin.sns.ui.SnsUploadConfigView");
            SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsUploadConfigView$2$1");
        }
    }

    public C95783f7(SnsUploadConfigView snsUploadConfigView, Context context) {
        this.f279444e = snsUploadConfigView;
        this.f279443d = context;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/sns/ui/SnsUploadConfigView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsUploadConfigView$2");
        SnsUploadConfigView snsUploadConfigView = this.f279444e;
        int i = SnsUploadConfigView.f278888u;
        SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.SnsUploadConfigView");
        boolean z = snsUploadConfigView.f278897o;
        SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.SnsUploadConfigView");
        if (!z) {
            SnsUploadConfigView snsUploadConfigView2 = this.f279444e;
            SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.SnsUploadConfigView");
            boolean z2 = snsUploadConfigView2.f278893h;
            SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.SnsUploadConfigView");
            if (z2) {
                C76879j.m92738i(this.f279443d, C0966R.string.jid, C0966R.string.a3h);
                SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsUploadConfigView$2");
                C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/SnsUploadConfigView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
        }
        C86709a0.m107528h();
        C85801v1 i2 = C86709a0.m107535s().mo121142i();
        C72994y1.C72995a aVar = C72994y1.C72995a.USERINFO_SNS_OPEN_SHOW_WEISHI_BOOLEAN_SYNC;
        if (i2.mo119686g(aVar, true)) {
            C86709a0.m107528h();
            C86709a0.m107535s().mo121142i().mo119677K(aVar, Boolean.FALSE);
            C76879j.m92742m(this.f279443d, C0966R.string.jhx, C0966R.string.a3h, new C95784a());
            SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsUploadConfigView$2");
            C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/SnsUploadConfigView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        SnsUploadConfigView snsUploadConfigView3 = this.f279444e;
        SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.SnsUploadConfigView");
        boolean z3 = snsUploadConfigView3.f278897o;
        SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.SnsUploadConfigView");
        SnsMethodCalculate.markStartTimeMs("access$302", "com.tencent.mm.plugin.sns.ui.SnsUploadConfigView");
        snsUploadConfigView3.f278897o = !z3;
        SnsMethodCalculate.markEndTimeMs("access$302", "com.tencent.mm.plugin.sns.ui.SnsUploadConfigView");
        SnsUploadConfigView snsUploadConfigView4 = this.f279444e;
        SnsMethodCalculate.markStartTimeMs("access$400", "com.tencent.mm.plugin.sns.ui.SnsUploadConfigView");
        snsUploadConfigView4.mo133066f();
        SnsMethodCalculate.markEndTimeMs("access$400", "com.tencent.mm.plugin.sns.ui.SnsUploadConfigView");
        SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsUploadConfigView$2");
        C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/SnsUploadConfigView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
