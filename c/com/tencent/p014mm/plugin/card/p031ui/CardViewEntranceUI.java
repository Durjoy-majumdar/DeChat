package com.tencent.p014mm.plugin.card.p031ui;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.xweb.xwalk.plugin.XWalkReaderBasePlugin;
import j20.C117292a;
import java.util.LinkedList;
import k20.C9556a;
import nj3.C88989a;
import te3.C50289lo;
import wz0.C53262l;

@C88989a(3)
/* renamed from: com.tencent.mm.plugin.card.ui.CardViewEntranceUI */
public class CardViewEntranceUI extends MMActivity {
    public int getLayoutId() {
        return C0966R.C0971layout.f6689lu;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        if (intent == null) {
            Log.m105920e("MicroMsg.CardViewEntranceUI", "CardViewEntranceUI onCreate() intent == null");
            setResult(0, intent);
            finish();
            return;
        }
        int intExtra = intent.getIntExtra("key_from_scene", 50);
        Log.m105924i("MicroMsg.CardViewEntranceUI", "CardViewEntranceUI doRediect() handle data");
        String stringExtra = intent.getStringExtra("card_list");
        String stringExtra2 = intent.getStringExtra("key_app_id");
        Log.m105919d("MicroMsg.CardViewEntranceUI", "appid: %s", stringExtra2);
        if (TextUtils.isEmpty(stringExtra)) {
            Log.m105920e("MicroMsg.CardViewEntranceUI", "CardViewEntranceUI oncreate card_list is empty");
            setResult(0, intent);
            finish();
            return;
        }
        LinkedList<C50289lo> a = C53262l.m59699a(stringExtra, intExtra, stringExtra2);
        if (a == null || a.size() == 0) {
            Log.m105920e("MicroMsg.CardViewEntranceUI", "CardViewEntranceUI oncreate tempList size is empty");
            setResult(0, intent);
            finish();
            return;
        }
        Intent intent2 = new Intent();
        if (a.size() == 1) {
            intent2.putExtra("card_list", stringExtra);
            intent2.putExtra("key_app_id", stringExtra2);
            intent2.putExtra("key_from_scene", 50);
            intent2.putExtra("key_previous_scene", intExtra);
            if (!Util.isNullOrNil(intent.getStringExtra("key_template_id"))) {
                intent2.putExtra("key_template_id", intent.getStringExtra("key_template_id"));
            }
            intent2.putExtra("key_from_appbrand_type", intent.getIntExtra("key_from_appbrand_type", 0));
            intent2.setClass(this, CardDetailUI.class);
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent2);
            C117292a.m165358d(this, aVar.mo10232b(), "com/tencent/mm/plugin/card/ui/CardViewEntranceUI", "doRediect", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(this, "com/tencent/mm/plugin/card/ui/CardViewEntranceUI", "doRediect", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        } else {
            intent2.putExtra(XWalkReaderBasePlugin.PARAM_KEY_VIEW_TYPE, 0);
            intent2.putExtra("card_list", stringExtra);
            intent2.putExtra("key_previous_scene", intExtra);
            if (!Util.isNullOrNil(intent.getStringExtra("key_template_id"))) {
                intent2.putExtra("key_template_id", intent.getStringExtra("key_template_id"));
            }
            intent2.putExtra("key_app_id", stringExtra2);
            intent2.putExtra("key_from_appbrand_type", intent.getIntExtra("key_from_appbrand_type", 0));
            intent2.setClass(this, CardViewUI.class);
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(intent2);
            C117292a.m165358d(this, aVar2.mo10232b(), "com/tencent/mm/plugin/card/ui/CardViewEntranceUI", "doRediect", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            startActivity((Intent) aVar2.mo10231a(0));
            C117292a.m165359e(this, "com/tencent/mm/plugin/card/ui/CardViewEntranceUI", "doRediect", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
        Log.m105920e("MicroMsg.CardViewEntranceUI", "CardViewEntranceUI onCreate() parameter is ok");
        setResult(-1, intent);
        finish();
    }
}
