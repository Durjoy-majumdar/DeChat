package com.tencent.p014mm.plugin.sns.p106ui;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.TinkerStatusReport;
import de3.C86258g;
import eb0.C75592q0;
import java.util.HashMap;
import java.util.Map;
import ke3.C88144b;
import nj3.C88989a;

@C88989a(7)
/* renamed from: com.tencent.mm.plugin.sns.ui.SnsTransparentUI */
public class SnsTransparentUI extends MMActivity {

    /* renamed from: e */
    public static final /* synthetic */ int f278824e = 0;

    /* renamed from: d */
    public Map<String, Bitmap> f278825d = new HashMap();

    public int getLayoutId() {
        SnsMethodCalculate.markStartTimeMs("getLayoutId", "com.tencent.mm.plugin.sns.ui.SnsTransparentUI");
        SnsMethodCalculate.markEndTimeMs("getLayoutId", "com.tencent.mm.plugin.sns.ui.SnsTransparentUI");
        return -1;
    }

    public void onCreate(Bundle bundle) {
        String str;
        SnsMethodCalculate.markStartTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.SnsTransparentUI");
        super.onCreate(bundle);
        this.mController.mo177043E();
        Intent intent = getIntent();
        if (intent != null) {
            int intExtra = intent.getIntExtra("op", -1);
            if (intExtra == 2) {
                String stringExtra = intent.getStringExtra("adlandingXml");
                String stringExtra2 = intent.getStringExtra("shareTitle");
                String stringExtra3 = intent.getStringExtra("shareThumbUrl");
                String stringExtra4 = intent.getStringExtra("shareDesc");
                String stringExtra5 = intent.getStringExtra("shareUrl");
                String stringExtra6 = intent.getStringExtra("statExtStr");
                String stringExtra7 = intent.getStringExtra("uxInfo");
                String stringExtra8 = intent.getStringExtra("canvasId");
                SnsMethodCalculate.markStartTimeMs("doTransimt", "com.tencent.mm.plugin.sns.ui.SnsTransparentUI");
                Log.m105924i("SnsTransparentUI", "doTransimt snsAdNativeLadingPagesUI");
                Log.m105924i("SnsTransparentUI.Share", "uxInfo = " + stringExtra7 + ", canvasId = " + stringExtra8);
                String s = C75592q0.m90789s();
                Log.m105924i("MicroMsg.SnsAdNativeLandingPagesUI.uxInfo", "openAdCanvasPage doTransmit in SnsTransparentUI, uxInfo is " + stringExtra7 + ", selfUserName is " + s);
                Intent intent2 = new Intent();
                intent2.putExtra("Select_Conv_Type", TinkerStatusReport.KVSTAT_TYPE_ID_TINKER_EXCEPTION);
                intent2.putExtra("select_is_ret", true);
                C96323y6 y6Var = r0;
                C96323y6 y6Var2 = new C96323y6(this, stringExtra, stringExtra2, stringExtra3, stringExtra4, stringExtra5, stringExtra6, stringExtra7, s, stringExtra8);
                C88144b.m109803u(this, ".ui.transmit.SelectConversationUI", intent2, 0, y6Var);
                SnsMethodCalculate.markEndTimeMs("doTransimt", "com.tencent.mm.plugin.sns.ui.SnsTransparentUI");
                str = "onCreate";
                SnsMethodCalculate.markEndTimeMs(str, "com.tencent.mm.plugin.sns.ui.SnsTransparentUI");
            } else if (intExtra == 4) {
                String stringExtra9 = intent.getStringExtra("phoneNum");
                SnsMethodCalculate.markStartTimeMs("doDial", "com.tencent.mm.plugin.sns.ui.SnsTransparentUI");
                C86258g.C86259a.f250859a.mo10689hP(this, stringExtra9, new C96330z6(this), new Bundle());
                SnsMethodCalculate.markEndTimeMs("doDial", "com.tencent.mm.plugin.sns.ui.SnsTransparentUI");
            }
        }
        str = "onCreate";
        SnsMethodCalculate.markEndTimeMs(str, "com.tencent.mm.plugin.sns.ui.SnsTransparentUI");
    }
}
