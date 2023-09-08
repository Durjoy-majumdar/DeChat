package com.tencent.p014mm.plugin.ipcall.p065ui;

import android.content.Intent;
import android.content.SharedPreferences;
import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.ipcall.model.C42464d;
import com.tencent.p014mm.plugin.ipcall.p065ui.C105394b;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import j20.C117292a;
import java.util.ArrayList;
import nj3.C76879j;
import t12.C110899d;
import t12.C13818a;
import wc3.C15131b;

/* renamed from: com.tencent.mm.plugin.ipcall.ui.g */
public class C105412g implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C105394b f313414d;

    public C105412g(C105394b bVar) {
        this.f313414d = bVar;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/ipcall/ui/DialPadController$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C105394b bVar = this.f313414d;
        bVar.f313349n = bVar.f313338c.getText().toString();
        bVar.f313350o = bVar.f313339d.getText().toString();
        if (Util.isNullOrNil(bVar.f313349n) || Util.isNullOrNil(bVar.f313350o)) {
            String string = MMApplicationContext.getContext().getSharedPreferences("IPCall_LastInputPref", 0).getString("IPCall_LastInputPhoneNumber", "");
            if (!Util.isNullOrNil(string)) {
                String a = bVar.mo150124a(bVar.f313338c.getText().toString().replace("+", ""), C110899d.m151196j(string));
                bVar.f313350o = a;
                bVar.mo150128e(a, -1);
                bVar.mo150125b();
            }
        } else {
            bVar.f313349n = bVar.f313338c.getText().toString().replace("+", "");
            MMActivity mMActivity = bVar.f313346k;
            String f = C13818a.m13110f(mMActivity, bVar.f313349n + bVar.f313350o);
            bVar.f313351p = f;
            bVar.f313352q = !Util.isNullOrNil(f) ? C15131b.m14239c(f, bVar.f313346k) : null;
            String j = C110899d.m151196j(bVar.f313350o);
            SharedPreferences.Editor edit = MMApplicationContext.getContext().getSharedPreferences("IPCall_LastInputPref", 0).edit();
            edit.putString("IPCall_LastInputPhoneNumber", j);
            edit.apply();
            String charSequence = bVar.f313338c.getText().toString();
            String str = bVar.f313348m;
            if (!Util.isNullOrNil(charSequence)) {
                if (Util.isNullOrNil(str)) {
                    str = "";
                }
                SharedPreferences.Editor edit2 = MMApplicationContext.getContext().getSharedPreferences("IPCall_LastInputPref", 0).edit();
                edit2.putString("IPCall_LastInputCountryCode", charSequence.replace("+", ""));
                edit2.putString("IPCall_LastInputCountryName", str);
                edit2.apply();
            }
            C105394b.C56829c cVar = bVar.f313336a;
            if (cVar != null) {
                String str2 = bVar.f313349n;
                String j2 = C110899d.m151196j(bVar.f313350o);
                String str3 = bVar.f313351p;
                String str4 = bVar.f313352q;
                IPCallDialUI iPCallDialUI = (IPCallDialUI) cVar;
                Log.m105925i("MicroMsg.IPCallDialUI", "onDial, countryCode: %s, phoneNumber: %s, contactId: %s, nickname: %s", str2, j2, str3, str4);
                if (C110899d.m151189c(iPCallDialUI)) {
                    if (C42464d.m46136a().mo66549e(Util.getInt(str2, -1))) {
                        C76879j.m92748s(iPCallDialUI, iPCallDialUI.getString(C0966R.string.aua), iPCallDialUI.getString(C0966R.string.aub));
                        C115669n.INSTANCE.kvStat(12058, str2);
                    } else {
                        C115669n.INSTANCE.mo160131h(12059, 0, 0, 0, 0, 1);
                        Intent intent = new Intent(iPCallDialUI, IPCallTalkUI.class);
                        intent.putExtra("IPCallTalkUI_contactId", str3);
                        intent.putExtra("IPCallTalkUI_countryCode", str2);
                        intent.putExtra("IPCallTalkUI_nickname", str4);
                        intent.putExtra("IPCallTalkUI_phoneNumber", j2);
                        intent.putExtra("IPCallTalkUI_dialScene", iPCallDialUI.f313302u);
                        intent.putExtra("IPCallTalkUI_countryType", iPCallDialUI.f313303v);
                        iPCallDialUI.startActivityForResult(intent, 1001);
                    }
                }
            }
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/ipcall/ui/DialPadController$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
