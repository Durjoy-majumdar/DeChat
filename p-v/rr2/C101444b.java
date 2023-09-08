package rr2;

import android.os.Bundle;
import android.view.View;
import com.tencent.p014mm.plugin.mmsight.segment.SliderSeekBar;
import com.tencent.p014mm.plugin.recordvideo.jumper.RecordConfigProvider;
import com.tencent.p014mm.plugin.recordvideo.plugin.cropvideo.EditVideoSeekBarView;
import com.tencent.p014mm.plugin.sight.base.C94554a;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import qh2.C101198e;

/* renamed from: rr2.b */
public final class C101444b implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C101439a f297101d;

    public C101444b(C101439a aVar) {
        this.f297101d = aVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/sns/cover/edit/plugin/SnsCoverCropVideoPlugin$initThumbBarView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverCropVideoPlugin$initThumbBarView$1");
        C101439a aVar = this.f297101d;
        SnsMethodCalculate.markStartTimeMs("access$getInfo$p", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverCropVideoPlugin");
        C94554a aVar2 = aVar.f297096j;
        SnsMethodCalculate.markEndTimeMs("access$getInfo$p", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverCropVideoPlugin");
        int i = (aVar2 != null ? aVar2.f273443a : 0) * 1000;
        C101439a aVar3 = this.f297101d;
        SnsMethodCalculate.markStartTimeMs("access$getConfigProvider$p", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverCropVideoPlugin");
        RecordConfigProvider recordConfigProvider = aVar3.f297095i;
        SnsMethodCalculate.markEndTimeMs("access$getConfigProvider$p", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverCropVideoPlugin");
        if (recordConfigProvider != null) {
            if (i > recordConfigProvider.f272935w) {
                C101198e.C62622a.m73576a(this.f297101d.f291492d, C101198e.C101199b.UI_FINISH, (Bundle) null, 2, (Object) null);
            } else {
                C101439a aVar4 = this.f297101d;
                SnsMethodCalculate.markStartTimeMs("access$getCropThumbView", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverCropVideoPlugin");
                EditVideoSeekBarView x = aVar4.mo140945x();
                SnsMethodCalculate.markEndTimeMs("access$getCropThumbView", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverCropVideoPlugin");
                SliderSeekBar sliderSeekBar = x.f272945d.f313592p;
                if (sliderSeekBar != null) {
                    sliderSeekBar.mo150253d();
                }
                C101439a aVar5 = this.f297101d;
                SnsMethodCalculate.markStartTimeMs("access$showNormalLayout", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverCropVideoPlugin");
                aVar5.mo140947z();
                SnsMethodCalculate.markEndTimeMs("access$showNormalLayout", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverCropVideoPlugin");
                C101198e.C62622a.m73576a(this.f297101d.f291492d, C101198e.C101199b.EDIT_CROP_CANCEL, (Bundle) null, 2, (Object) null);
            }
            SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverCropVideoPlugin$initThumbBarView$1");
            C117292a.m165361g(this, "com/tencent/mm/plugin/sns/cover/edit/plugin/SnsCoverCropVideoPlugin$initThumbBarView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        C87412m.m108603p("configProvider");
        throw null;
    }
}
