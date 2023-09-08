package wu2;

import a22.C67001a;
import android.content.DialogInterface;
import b22.C28250a;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.sns.p106ui.jsapi.JsapiSnsLabelUI;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import nj3.C76879j;
import qo3.C89779i0;

/* renamed from: wu2.a */
public class C102505a implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ JsapiSnsLabelUI f301831d;

    public C102505a(JsapiSnsLabelUI jsapiSnsLabelUI) {
        this.f301831d = jsapiSnsLabelUI;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI$6");
        JsapiSnsLabelUI jsapiSnsLabelUI = this.f301831d;
        int i2 = JsapiSnsLabelUI.f280245D;
        SnsMethodCalculate.markStartTimeMs("access$1402", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
        jsapiSnsLabelUI.f280261s = true;
        SnsMethodCalculate.markEndTimeMs("access$1402", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
        ((C67001a) C28250a.m38138a()).mo90963a(JsapiSnsLabelUI.m122937O7(this.f301831d));
        JsapiSnsLabelUI jsapiSnsLabelUI2 = this.f301831d;
        C89779i0 Q = C76879j.m92723Q(jsapiSnsLabelUI2, (String) null, jsapiSnsLabelUI2.getString(C0966R.string.jds), false, false, (DialogInterface.OnCancelListener) null);
        SnsMethodCalculate.markStartTimeMs("access$902", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
        jsapiSnsLabelUI2.f280264v = Q;
        SnsMethodCalculate.markEndTimeMs("access$902", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
        SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI$6");
    }
}
