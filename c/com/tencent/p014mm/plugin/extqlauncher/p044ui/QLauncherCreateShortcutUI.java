package com.tencent.p014mm.plugin.extqlauncher.p044ui;

import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.modelavatar.AvatarStorage;
import com.tencent.p014mm.p136ui.MMBaseActivity;
import com.tencent.p014mm.p136ui.contact.C74560s1;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72996z1;
import cw0.C116541b;
import d62.C75339i;
import db1.C7260a;
import di3.C86312j;
import eb0.C45628s0;
import eb0.C75592q0;
import eb0.C97625j3;
import java.util.ArrayList;
import ke3.C88144b;
import p196ln.C76706g;
import p910lj.C76701a;

/* renamed from: com.tencent.mm.plugin.extqlauncher.ui.QLauncherCreateShortcutUI */
public class QLauncherCreateShortcutUI extends MMBaseActivity {
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        Log.m105919d("MicroMsg.extqlauncher.QLauncherCreateShortcutUI", "onActivityResult resultCode = %s", Integer.valueOf(i2));
        if (i2 != -1) {
            finish();
            return;
        }
        if (i == 1 && intent != null) {
            if (!C97625j3.m125811a()) {
                Log.m105920e("MicroMsg.extqlauncher.QLauncherCreateShortcutUI", "account not ready");
                C76701a.makeText((Context) this, (int) C0966R.string.chm, 0).show();
                finish();
                return;
            }
            String stringExtra = intent.getStringExtra("Select_Contact");
            ArrayList<String> arrayList = null;
            if (!Util.isNullOrNil(stringExtra)) {
                arrayList = Util.stringsToList(stringExtra.split(","));
            }
            if (arrayList == null || arrayList.size() <= 0) {
                Log.m105920e("MicroMsg.extqlauncher.QLauncherCreateShortcutUI", "userNames empty");
            } else {
                Log.m105918d("MicroMsg.extqlauncher.QLauncherCreateShortcutUI", "userNames count " + arrayList.size());
                String s = C75592q0.m90789s();
                try {
                    ContentValues[] contentValuesArr = new ContentValues[arrayList.size()];
                    int i3 = 0;
                    while (i3 < arrayList.size()) {
                        C72996z1 z1Var = C97625j3.m125812b().mo105907v().get(arrayList.get(i3));
                        if (z1Var != null) {
                            if (((int) z1Var.f108320R1) > 0) {
                                String d = C116541b.m164354d(arrayList.get(i3));
                                if (Util.isNullOrNil(d)) {
                                    Log.m105920e("MicroMsg.extqlauncher.QLauncherCreateShortcutUI", "null encryptShortcutUser");
                                    finish();
                                    return;
                                }
                                ContentValues contentValues = new ContentValues();
                                contentValues.put("source_key", C116541b.f349509a);
                                contentValues.put("owner_id", C116541b.m164354d(s));
                                contentValues.put("unique_id", d);
                                contentValues.put("container", 1);
                                contentValues.put("item_type", Integer.valueOf(z1Var.mo62916m3() ? 2 : !C45628s0.m50751P(z1Var.getUsername()) ? 1 : 0));
                                contentValues.put("name", ((C75339i) C86312j.m106911c(C75339i.class)).pv0(z1Var, arrayList.get(i3)));
                                contentValues.put("icon_path", ((AvatarStorage) ((C76706g) C86312j.m106911c(C76706g.class)).mo106826RE()).mo93558g(arrayList.get(i3), false, false));
                                Intent intent2 = new Intent("com.tencent.mm.action.BIZSHORTCUT");
                                intent2.putExtra("LauncherUI.Shortcut.Username", d);
                                intent2.putExtra("LauncherUI.From.Biz.Shortcut", true);
                                intent2.addFlags(67108864);
                                contentValues.put("intent", intent2.toUri(0));
                                contentValuesArr[i3] = contentValues;
                                i3++;
                            }
                        }
                        Log.m105920e("MicroMsg.extqlauncher.QLauncherCreateShortcutUI", "no such user");
                        finish();
                        return;
                    }
                    getContentResolver().bulkInsert(C7260a.f25321a, contentValuesArr);
                    C76701a.makeText((Context) this, (int) C0966R.string.chn, 0).show();
                } catch (Exception e) {
                    Log.m105919d("MicroMsg.extqlauncher.QLauncherCreateShortcutUI", "bulkInsert shortcut failed, %s", e.getMessage());
                    Log.printErrStackTrace("MicroMsg.extqlauncher.QLauncherCreateShortcutUI", e, "", new Object[0]);
                    C76701a.makeText((Context) this, (int) C0966R.string.chm, 0).show();
                }
            }
        }
        finish();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Log.m105918d("MicroMsg.extqlauncher.QLauncherCreateShortcutUI", "onCreate");
        requestWindowFeature(1);
        setContentView(C0966R.C0971layout.f7110yl);
        Intent intent = new Intent();
        C74560s1.m89276e();
        intent.putExtra("list_attr", C74560s1.m89278g(C74560s1.f219160a, 64, 16384));
        intent.putExtra("list_type", 12);
        intent.putExtra("stay_in_wechat", false);
        intent.putExtra("titile", getString(C0966R.string.f7496hv));
        intent.putExtra("block_contact", C75592q0.m90789s());
        C88144b.m109802t(this, ".ui.contact.SelectContactUI", intent, 1);
    }
}
