package lo2;

import android.widget.CheckBox;
import android.widget.CompoundButton;
import com.tencent.p014mm.plugin.sns.p104ad.landingpage.component.comp.C94604a0;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import qo3.C101218e0;

/* renamed from: lo2.h */
public final class C99541h implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a */
    public final /* synthetic */ CheckBox f291791a;

    /* renamed from: b */
    public final /* synthetic */ C94604a0.C94606b f291792b;

    /* renamed from: c */
    public final /* synthetic */ CheckBox f291793c;

    /* renamed from: d */
    public final /* synthetic */ C101218e0 f291794d;

    public C99541h(CheckBox checkBox, C94604a0.C94606b bVar, CheckBox checkBox2, C101218e0 e0Var) {
        this.f291791a = checkBox;
        this.f291792b = bVar;
        this.f291793c = checkBox2;
        this.f291794d = e0Var;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        SnsMethodCalculate.markStartTimeMs("onCheckedChanged", "com.tencent.mm.plugin.sns.ad.helper.AdCombineFollowHfScreenHelper$showHfScreen$4");
        C99527d.m129883a(this.f291791a, this.f291792b, this.f291793c, this.f291794d);
        SnsMethodCalculate.markEndTimeMs("onCheckedChanged", "com.tencent.mm.plugin.sns.ad.helper.AdCombineFollowHfScreenHelper$showHfScreen$4");
    }
}
