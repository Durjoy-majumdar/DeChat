package jq2;

import android.content.Context;
import android.content.Intent;
import com.tencent.p014mm.app.C67654r1;
import com.tencent.p014mm.modelsns.SnsAdClick;
import com.tencent.p014mm.plugin.sns.p104ad.adxml.AdClickActionInfo;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import p214om.C11502f;
import rq2.C101431r;

/* renamed from: jq2.f */
public final class C98984f {
    /* renamed from: a */
    public static final boolean m128890a(Context context, AdClickActionInfo adClickActionInfo, int i, SnsAdClick snsAdClick) {
        SnsMethodCalculate.markStartTimeMs("doJumpContact", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdJumpContactHelper");
        boolean z = false;
        if (context == null) {
            SnsMethodCalculate.markEndTimeMs("doJumpContact", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdJumpContactHelper");
            return false;
        } else if (adClickActionInfo == null) {
            SnsMethodCalculate.markEndTimeMs("doJumpContact", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdJumpContactHelper");
            return false;
        } else {
            Intent intent = new Intent();
            C101431r.m133118a(snsAdClick, 39);
            String nullAsNil = Util.nullAsNil(adClickActionInfo.f273679y);
            if (adClickActionInfo.f273660k0 == 1) {
                z = true;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("doJumpContact, userName is ");
            sb.append(nullAsNil);
            sb.append(", openVideoTab is ");
            sb.append(z);
            sb.append(", source is ");
            sb.append(i);
            sb.append(", snsAdClick clickPos is ");
            Integer num = null;
            sb.append(snsAdClick != null ? Integer.valueOf(snsAdClick.f267472g) : null);
            sb.append(", snsAdClick clickAction is ");
            if (snsAdClick != null) {
                num = Integer.valueOf(snsAdClick.f267473h);
            }
            sb.append(num);
            Log.m105924i("AdJumpContactHelper", sb.toString());
            intent.putExtra("Contact_User", nullAsNil);
            intent.putExtra("KSnsAdTag", snsAdClick);
            intent.putExtra("Contact_Scene", 78);
            intent.putExtra("CONTACT_INFO_UI_SOURCE", i == 0 ? 6 : 1);
            if (z) {
                intent.putExtra("biz_profile_tab_type", 1);
            }
            intent.putExtra("force_get_contact", true);
            intent.putExtra("key_use_new_contact_profile", true);
            ((C67654r1) ((C11502f) C86312j.m106911c(C11502f.class)).mo11462yM()).mo93174g(intent, context);
            SnsMethodCalculate.markEndTimeMs("doJumpContact", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdJumpContactHelper");
            return true;
        }
    }
}
