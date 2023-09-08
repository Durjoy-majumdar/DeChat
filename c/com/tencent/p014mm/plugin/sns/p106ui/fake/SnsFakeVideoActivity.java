package com.tencent.p014mm.plugin.sns.p106ui.fake;

import android.os.Bundle;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.Set;
import kotlin.Metadata;
import nj3.C88989a;
import ot2.C100437h;
import ot2.C100448j;
import ot2.C100455p;
import p206nj.C11171e;
import sx3.C110826x0;
import vo3.C90852c;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/sns/ui/fake/SnsFakeVideoActivity;", "Lcom/tencent/mm/ui/MMActivity;", "<init>", "()V", "plugin-sns_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
@C88989a(3)
@C90852c(0)
/* renamed from: com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoActivity */
public final class SnsFakeVideoActivity extends MMActivity {
    public int getLayoutId() {
        SnsMethodCalculate.markStartTimeMs("getLayoutId", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoActivity");
        SnsMethodCalculate.markEndTimeMs("getLayoutId", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoActivity");
        return C0966R.C0971layout.cwf;
    }

    public Set<Class<? extends UIComponent>> importUIComponents() {
        SnsMethodCalculate.markStartTimeMs("importUIComponents", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoActivity");
        Set<Class<? extends UIComponent>> e = C110826x0.m151017e(C100448j.class, C100455p.class, C100437h.class);
        SnsMethodCalculate.markEndTimeMs("importUIComponents", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoActivity");
        return e;
    }

    public void onCreate(Bundle bundle) {
        SnsMethodCalculate.markStartTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoActivity");
        super.onCreate(bundle);
        SnsMethodCalculate.markStartTimeMs("setWindowStyle", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoActivity");
        boolean booleanExtra = getIntent().getBooleanExtra("intent_video_is_preview", false);
        try {
            if (C11171e.m11046c(19)) {
                if (!booleanExtra) {
                    getWindow().setFlags(201327616, 201327616);
                }
            } else if (!booleanExtra) {
                getWindow().setFlags(1024, 1024);
            }
            getWindow().addFlags(128);
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.SnsOnlineVideoActivity", e, "", new Object[0]);
        }
        SnsMethodCalculate.markEndTimeMs("setWindowStyle", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoActivity");
        SnsMethodCalculate.markEndTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoActivity");
    }

    public void onResume() {
        SnsMethodCalculate.markStartTimeMs("onResume", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoActivity");
        super.onResume();
        getWindow().clearFlags(2048);
        SnsMethodCalculate.markEndTimeMs("onResume", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoActivity");
    }
}
