package lo2;

import android.widget.CheckBox;
import android.widget.CompoundButton;
import com.tencent.p014mm.plugin.sns.p104ad.landingpage.component.comp.C94604a0;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import qo3.C101218e0;

/* renamed from: lo2.i */
public final class C99543i implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a */
    public final /* synthetic */ CheckBox f291795a;

    /* renamed from: b */
    public final /* synthetic */ C94604a0.C94606b f291796b;

    /* renamed from: c */
    public final /* synthetic */ CheckBox f291797c;

    /* renamed from: d */
    public final /* synthetic */ C101218e0 f291798d;

    public C99543i(CheckBox checkBox, C94604a0.C94606b bVar, CheckBox checkBox2, C101218e0 e0Var) {
        this.f291795a = checkBox;
        this.f291796b = bVar;
        this.f291797c = checkBox2;
        this.f291798d = e0Var;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        SnsMethodCalculate.markStartTimeMs("onCheckedChanged", "com.tencent.mm.plugin.sns.ad.helper.AdCombineFollowHfScreenHelper$showHfScreen$5");
        C99527d.m129883a(this.f291795a, this.f291796b, this.f291797c, this.f291798d);
        SnsMethodCalculate.markEndTimeMs("onCheckedChanged", "com.tencent.mm.plugin.sns.ad.helper.AdCombineFollowHfScreenHelper$showHfScreen$5");
    }
}
