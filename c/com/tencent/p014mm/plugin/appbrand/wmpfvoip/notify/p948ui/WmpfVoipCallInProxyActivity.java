package com.tencent.p014mm.plugin.appbrand.wmpfvoip.notify.p948ui;

import android.content.Intent;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.Window;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.appbrand.launching.C83350j4;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import eu0.C86683b;
import gy3.C87412m;
import kotlin.Metadata;
import p657pz.C89445b;
import rx3.C13598b0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/appbrand/wmpfvoip/notify/ui/WmpfVoipCallInProxyActivity;", "Lcom/tencent/mm/ui/MMActivity;", "<init>", "()V", "plugin-appbrand-integration_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.appbrand.wmpfvoip.notify.ui.WmpfVoipCallInProxyActivity */
public final class WmpfVoipCallInProxyActivity extends MMActivity {
    public int getLayoutId() {
        return -1;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Rect rect = C85875k4.f250155a;
        C85875k4.m106177d0(getWindow());
        getWindow().setBackgroundDrawable(new ColorDrawable(0));
        if (getIntent() == null) {
            finish();
            return;
        }
        Log.m105924i("MicroMsg.WmpfVoipCallInProxyActivity", "onCreate");
        Log.m105924i("MicroMsg.WMPFVoip.WmpfVoipWindowFlags", "add, activity: " + this);
        Window window = getWindow();
        if (window != null) {
            window.addFlags(6815744);
        }
        Intent intent = getIntent();
        String str = null;
        String stringExtra = intent != null ? intent.getStringExtra("extra_appid") : null;
        Intent intent2 = getIntent();
        String stringExtra2 = intent2 != null ? intent2.getStringExtra("extra_enter_path") : null;
        Intent intent3 = getIntent();
        Integer valueOf = intent3 != null ? Integer.valueOf(intent3.getIntExtra("version_type", 0)) : null;
        C87412m.m108591d(valueOf);
        int intValue = valueOf.intValue();
        Intent intent4 = getIntent();
        Long valueOf2 = intent4 != null ? Long.valueOf(intent4.getLongExtra("calling_instance_id", -1)) : null;
        C87412m.m108591d(valueOf2);
        long longValue = valueOf2.longValue();
        Intent intent5 = getIntent();
        Integer valueOf3 = intent5 != null ? Integer.valueOf(intent5.getIntExtra("extra_enter_scene", 2)) : null;
        C87412m.m108591d(valueOf3);
        int intValue2 = valueOf3.intValue();
        Intent intent6 = getIntent();
        if (intent6 != null) {
            str = intent6.getStringExtra("extra_roomid");
        }
        String str2 = str;
        if (!(stringExtra == null || stringExtra.length() == 0)) {
            if (!(stringExtra2 == null || stringExtra2.length() == 0)) {
                C86683b.m107501b(C86683b.f251674a, this, stringExtra, stringExtra2, intValue, longValue, (C83350j4) null, 32, (Object) null);
                C13598b0 b0Var = C13598b0.f38549a;
                if (str2 != null) {
                    C115669n.INSTANCE.mo160131h(28142, str2, Integer.valueOf(intValue2));
                }
                finish();
                C89445b bVar = (C89445b) C86312j.m106911c(C89445b.class);
                if (bVar != null) {
                    bVar.mo123645Ca();
                    return;
                }
                return;
            }
        }
        Log.m105924i("MicroMsg.WmpfVoipCallInProxyActivity", "appId or enterPath is null");
        finish();
    }
}
