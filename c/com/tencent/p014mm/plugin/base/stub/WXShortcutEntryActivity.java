package com.tencent.p014mm.plugin.base.stub;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.pluginsdk.p133ui.AutoLoginActivity;
import com.tencent.p014mm.sdk.platformtools.IntentUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.WeChatBrands;
import p261wl.C38166b;
import p261wl.C38174i;
import p329d3.C86165a;
import vn2.C14914d;
import vn2.C90850c;
import vn2.C90851e;
import vo3.C90852c;

@C90852c(0)
/* renamed from: com.tencent.mm.plugin.base.stub.WXShortcutEntryActivity */
public class WXShortcutEntryActivity extends AutoLoginActivity {

    /* renamed from: com.tencent.mm.plugin.base.stub.WXShortcutEntryActivity$a */
    public class C85080a implements C86165a<Integer> {
        public C85080a() {
        }

        public void accept(Object obj) {
            Integer num = (Integer) obj;
            WXShortcutEntryActivity.this.finish();
        }
    }

    /* renamed from: J7 */
    public void mo94557J7(AutoLoginActivity.C72717a aVar, Intent intent) {
        if (intent == null) {
            Log.m105920e("MicroMsg.WXShortcutEntryActivity", "intent is null");
            finish();
            return;
        }
        C90851e eVar = C90851e.INSTANCE;
        boolean z = false;
        int intExtra = IntentUtil.getIntExtra(intent, "type", 0);
        eVar.getClass();
        if (intExtra == 1 || intExtra == 3) {
            z = true;
        }
        if (!z || WeChatBrands.Business.Entries.GlobalAppbrand.checkAvailable(this, new C85080a())) {
            AppCompatActivity context = getContext();
            C90850c cVar = eVar.f260824d.get(intExtra);
            if (cVar == null) {
                C38166b.C38167a aVar2 = (C38166b.C38167a) C38166b.m41759f(C14914d.class);
                C38166b.C38167a.C38169b bVar = new C38166b.C38167a.C38169b(aVar2, aVar2.f100837d.all().iterator());
                while (bVar.hasNext()) {
                    C38174i iVar = (C38174i) bVar.next();
                    if (iVar.hasKey(Integer.valueOf(intExtra))) {
                        cVar = (C90850c) iVar.get();
                    }
                }
            }
            if (cVar != null) {
                cVar.mo13967d(context, intent);
                cVar.mo1972q(context, intent);
                cVar.mo13966B(context, intent);
            }
            finish();
        }
    }

    /* renamed from: K7 */
    public boolean mo94558K7(Intent intent) {
        return true;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }
}
