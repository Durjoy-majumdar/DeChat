package com.tencent.p014mm.plugin.game.p061ui;

import android.os.Bundle;
import com.tencent.p014mm.p136ui.MMBaseActivity;
import com.tencent.p014mm.plugin.game.commlib.C41853c;
import com.tencent.p014mm.sdk.platformtools.Util;
import nj3.C88989a;
import py1.C47687v0;
import uy1.C52642c;

@C88989a(19)
/* renamed from: com.tencent.mm.plugin.game.ui.GameDetailUI */
public class GameDetailUI extends MMBaseActivity {
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        String stringExtra = getIntent().getStringExtra("game_app_id");
        C47687v0 f = C41853c.m45372f();
        int i = f != null ? f.f128069d : 0;
        if (i == 2) {
            C52642c.m58997o(this, stringExtra, 0);
        } else if (i == 1) {
            C52642c.m58998p(this, getIntent().getExtras());
        } else {
            String simCountryCode = Util.getSimCountryCode(this);
            if (Util.isNullOrNil(simCountryCode) || simCountryCode.toLowerCase().equals("cn")) {
                C52642c.m58997o(this, stringExtra, 0);
            } else {
                C52642c.m58998p(this, getIntent().getExtras());
            }
        }
        finish();
    }
}
