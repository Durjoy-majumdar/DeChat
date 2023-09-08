package com.tencent.p014mm.plugin.ipcall.p065ui;

import android.view.MenuItem;
import android.view.View;
import com.tencent.p014mm.plugin.ipcall.model.C105385g;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import nj3.C11184p0;
import s12.C13614k;
import s12.C13615l;

/* renamed from: com.tencent.mm.plugin.ipcall.ui.v */
public class C4722v implements C11184p0 {

    /* renamed from: d */
    public final /* synthetic */ C13614k f19726d;

    /* renamed from: e */
    public final /* synthetic */ int f19727e;

    /* renamed from: f */
    public final /* synthetic */ C4725w f19728f;

    public C4722v(C4725w wVar, C13614k kVar, int i) {
        this.f19728f = wVar;
        this.f19726d = kVar;
        this.f19727e = i;
    }

    public void onMMMenuItemSelected(MenuItem menuItem, int i) {
        int delete;
        if (i == 0) {
            C4725w wVar = this.f19728f;
            C13614k kVar = this.f19726d;
            int i2 = this.f19727e;
            wVar.getClass();
            if (kVar.field_addressId > 0) {
                C13615l Cx0 = C105385g.Cx0();
                long j = kVar.field_addressId;
                if (j > 0) {
                    int delete2 = Cx0.f38583d.delete("IPCallRecord", "addressId=?", new String[]{String.valueOf(j)});
                    if (delete2 < 0) {
                        Log.m105919d("MicroMsg.IPCallRecordStorage", "deleteByAddressId failed, ret: %d, addressId: %d", Integer.valueOf(delete2), Long.valueOf(j));
                    }
                } else {
                    Cx0.getClass();
                }
            } else {
                C13615l Cx02 = C105385g.Cx0();
                String str = kVar.field_phonenumber;
                Cx02.getClass();
                if (!Util.isNullOrNil(str) && (delete = Cx02.f38583d.delete("IPCallRecord", "phonenumber=?", new String[]{str})) < 0) {
                    Log.m105919d("MicroMsg.IPCallRecordStorage", "deleteByCallPhoneNumber failed, ret: %d, phoneNumber: %s", Integer.valueOf(delete), str);
                }
            }
            C4709r0 r0Var = wVar.f19732b;
            r0Var.f19701q.remove(i2);
            r0Var.notifyDataSetChanged();
            if (wVar.f19732b.getCount() > 0) {
                View view = wVar.f19733c;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(8);
                View view2 = view;
                C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/ipcall/ui/IPCallAddressController", "deleteRecordIntenal", "(Lcom/tencent/mm/plugin/ipcall/model/storage/IPCallRecord;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/ipcall/ui/IPCallAddressController", "deleteRecordIntenal", "(Lcom/tencent/mm/plugin/ipcall/model/storage/IPCallRecord;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                return;
            }
            View view3 = wVar.f19733c;
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar2.mo10233c(0);
            C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/plugin/ipcall/ui/IPCallAddressController", "deleteRecordIntenal", "(Lcom/tencent/mm/plugin/ipcall/model/storage/IPCallRecord;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view3, "com/tencent/mm/plugin/ipcall/ui/IPCallAddressController", "deleteRecordIntenal", "(Lcom/tencent/mm/plugin/ipcall/model/storage/IPCallRecord;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }
}
