package com.tencent.p014mm.p136ui.transmit;

import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85864g1;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import f40.C86737h0;
import nj3.C88989a;

@C86737h0
@C88989a(7)
/* renamed from: com.tencent.mm.ui.transmit.SelectConversationDirectSelectUI */
public class SelectConversationDirectSelectUI extends SelectConversationUI {
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f220209z1 = true;
        String stringExtra = getIntent().getStringExtra("Select_Conv_User");
        if (!Util.isNullOrNil(stringExtra)) {
            Log.m105918d("MicroMsg.SelectConversationDirectSelectUI", "hy: request direct select username");
            setContentViewVisibility(8);
            overridePendingTransition(0, 0);
            C85864g1.m106129d(getWindow());
            C85864g1.m106127b(getWindow(), false);
            getWindow().setBackgroundDrawable(new ColorDrawable(0));
            setBackGroundColorResource(C0966R.color.f3536x0);
            mo104140q8(stringExtra);
            return;
        }
        throw new IllegalArgumentException("not provide username for share. please use pure SelectConversationUI");
    }

    public void onCreateBeforeSetContentView() {
        super.onCreateBeforeSetContentView();
        supportRequestWindowFeature(1);
    }

    public void setMMOrientation() {
    }
}
