package com.tencent.p014mm.plugin.location.p069ui;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.DoFavoriteEvent;
import com.tencent.p014mm.p136ui.tools.MMTextInputUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;

/* renamed from: com.tencent.mm.plugin.location.ui.RemarkUI */
public class RemarkUI extends MMTextInputUI {
    /* renamed from: I7 */
    public void mo66593I7(CharSequence charSequence) {
        long longExtra = getIntent().getLongExtra("kFavInfoLocalId", -1);
        if (longExtra > 0) {
            String charSequence2 = charSequence == null ? "" : charSequence.toString();
            Log.m105925i("MicroMsg.MMTextInputUI", "same remark[%s]", charSequence2);
            if (!charSequence2.equals(getIntent().getStringExtra("kRemark"))) {
                DoFavoriteEvent doFavoriteEvent = new DoFavoriteEvent();
                DoFavoriteEvent.C92474a aVar = doFavoriteEvent.f264674d;
                aVar.f264678c = -2;
                aVar.f264681f = Long.toString(longExtra);
                DoFavoriteEvent.C92474a aVar2 = doFavoriteEvent.f264674d;
                aVar2.f264680e = charSequence2;
                Log.m105919d("MicroMsg.MMTextInputUI", "update location remark, favlocalid is %s, remark is %s", aVar2.f264681f, charSequence2);
                doFavoriteEvent.publish();
            }
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.bra;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setMMTitle((int) C0966R.string.gbc);
        String stringExtra = getIntent().getStringExtra("Kwebmap_locaion");
        if (Util.isNullOrNil(stringExtra)) {
            View findViewById = findViewById(C0966R.C0970id.g4a);
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            C117292a.m165358d(findViewById, aVar.mo10232b(), "com/tencent/mm/plugin/location/ui/RemarkUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(findViewById, "com/tencent/mm/plugin/location/ui/RemarkUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        ((TextView) findViewById(C0966R.C0970id.g4u)).setText(stringExtra);
    }
}
