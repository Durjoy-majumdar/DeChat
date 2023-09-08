package com.tencent.p014mm.plugin.ipcall.p065ui;

import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.provider.ContactsContract;
import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import eb0.C75592q0;
import j20.C117292a;
import java.util.ArrayList;
import k20.C9556a;
import p447aw.C103918d;
import q12.C12029d;

/* renamed from: com.tencent.mm.plugin.ipcall.ui.z1 */
public class C4739z1 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ IPCallUserProfileUI f19753d;

    public C4739z1(IPCallUserProfileUI iPCallUserProfileUI) {
        this.f19753d = iPCallUserProfileUI;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/ipcall/ui/IPCallUserProfileUI$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f19753d.f19616A.mo11893d();
        C12029d dVar = this.f19753d.f19616A;
        dVar.f35025b = (long) 1;
        dVar.f35026c = (long) 5;
        dVar.mo11891b();
        C115669n.INSTANCE.mo160131h(12766, 3);
        if (!Util.isNullOrNil(this.f19753d.f19630t)) {
            StringBuilder sb = new StringBuilder();
            sb.append("smsto:");
            IPCallUserProfileUI iPCallUserProfileUI = this.f19753d;
            String str = iPCallUserProfileUI.f19630t;
            iPCallUserProfileUI.getClass();
            String str2 = "";
            String str3 = null;
            if (!((C103918d) C86312j.m106911c(C103918d.class)).Lb0(MMApplicationContext.getContext(), "android.permission.READ_CONTACTS")) {
                Log.m105920e("MicroMsg.IPCallUserProfileUI", "no contact permission");
            } else {
                Cursor query = MMApplicationContext.getContext().getContentResolver().query(ContactsContract.CommonDataKinds.Phone.CONTENT_URI, (String[]) null, "contact_id=?", new String[]{str}, (String) null);
                if (query != null) {
                    try {
                        if (query.moveToFirst()) {
                            while (!query.isAfterLast()) {
                                str2 = str2 + query.getString(query.getColumnIndex("data1")) + ",";
                                query.moveToNext();
                            }
                        }
                    } catch (Exception e) {
                        Log.m105921e("MicroMsg.IPCallUserProfileUI", "extractAddressItemFromCursor, error: %s, class: %s", e.getMessage(), e.getClass().getSimpleName());
                    } catch (Throwable th) {
                        query.close();
                        throw th;
                    }
                    query.close();
                    str3 = str2.lastIndexOf(",") >= 0 ? str2.substring(0, str2.lastIndexOf(",")) : str2;
                }
            }
            sb.append(str3);
            Intent intent = new Intent("android.intent.action.SENDTO", Uri.parse(sb.toString()));
            intent.putExtra("sms_body", this.f19753d.getString(C0966R.string.fuc, new Object[]{C75592q0.m90777g().mo62909j3()}));
            IPCallUserProfileUI iPCallUserProfileUI2 = this.f19753d;
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            IPCallUserProfileUI iPCallUserProfileUI3 = iPCallUserProfileUI2;
            C117292a.m165358d(iPCallUserProfileUI3, aVar.mo10232b(), "com/tencent/mm/plugin/ipcall/ui/IPCallUserProfileUI$7", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            iPCallUserProfileUI2.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(iPCallUserProfileUI3, "com/tencent/mm/plugin/ipcall/ui/IPCallUserProfileUI$7", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        } else if (!Util.isNullOrNil(this.f19753d.f19631u)) {
            Intent intent2 = new Intent("android.intent.action.SENDTO", Uri.parse("smsto:" + this.f19753d.f19631u));
            intent2.putExtra("sms_body", this.f19753d.getString(C0966R.string.fuc, new Object[]{C75592q0.m90777g().mo62909j3()}));
            IPCallUserProfileUI iPCallUserProfileUI4 = this.f19753d;
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(intent2);
            IPCallUserProfileUI iPCallUserProfileUI5 = iPCallUserProfileUI4;
            C117292a.m165358d(iPCallUserProfileUI5, aVar2.mo10232b(), "com/tencent/mm/plugin/ipcall/ui/IPCallUserProfileUI$7", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            iPCallUserProfileUI4.startActivity((Intent) aVar2.mo10231a(0));
            C117292a.m165359e(iPCallUserProfileUI5, "com/tencent/mm/plugin/ipcall/ui/IPCallUserProfileUI$7", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/ipcall/ui/IPCallUserProfileUI$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
