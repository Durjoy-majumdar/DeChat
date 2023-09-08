package com.tencent.p014mm.plugin.webview.luggage;

import android.content.Intent;
import android.os.Bundle;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.WeChatPermissions;
import di3.C86312j;
import nj3.C88989a;
import p447aw.C103918d;

@C88989a(7)
/* renamed from: com.tencent.mm.plugin.webview.luggage.LuggageStubUI */
public class LuggageStubUI extends MMActivity implements MMActivity.C6739d {

    /* renamed from: d */
    public static final /* synthetic */ int f22080d = 0;

    /* renamed from: H7 */
    public final void mo6914H7(int i) {
        Intent intent = new Intent();
        intent.setAction("com.tencent.mm.ACTION_LOCATION_FROM_JSAPI");
        intent.putExtra("key_permission_request_code", getIntent().getIntExtra("key_permission_request_code", 0));
        intent.putExtra("key_result_code", i);
        MMApplicationContext.getContext().sendBroadcast(intent, WeChatPermissions.PERMISSION_MM_MESSAGE());
        finish();
    }

    public int getLayoutId() {
        return -1;
    }

    public void mmOnActivityResult(int i, int i2, Intent intent) {
        mo6914H7(0);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getIntent().getIntExtra("key_action_code", -1) != 1) {
            finish();
            return;
        }
        ((C103918d) C86312j.m106911c(C103918d.class)).Uu0(this, getIntent().getStringArrayExtra("key_permission_types"), getIntent().getIntExtra("key_permission_request_code", 0), (String) null, (String) null);
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (i != 75) {
            mo6914H7(0);
        } else if (iArr[0] == 0) {
            mo6914H7(-1);
        } else {
            mo6914H7(0);
        }
    }
}
