package rr2;

import android.os.Bundle;
import android.view.View;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import j20.C117292a;
import java.util.ArrayList;
import qh2.C101198e;

/* renamed from: rr2.c */
public final class C101445c implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C101439a f297102d;

    public C101445c(C101439a aVar) {
        this.f297102d = aVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/sns/cover/edit/plugin/SnsCoverCropVideoPlugin$initThumbBarView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverCropVideoPlugin$initThumbBarView$2");
        C101439a aVar = this.f297102d;
        SnsMethodCalculate.markStartTimeMs("access$showNormalLayout", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverCropVideoPlugin");
        aVar.mo140947z();
        SnsMethodCalculate.markEndTimeMs("access$showNormalLayout", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverCropVideoPlugin");
        C101198e.C62622a.m73576a(this.f297102d.f291492d, C101198e.C101199b.EDIT_CROP_FINISH, (Bundle) null, 2, (Object) null);
        SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverCropVideoPlugin$initThumbBarView$2");
        C117292a.m165361g(this, "com/tencent/mm/plugin/sns/cover/edit/plugin/SnsCoverCropVideoPlugin$initThumbBarView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
