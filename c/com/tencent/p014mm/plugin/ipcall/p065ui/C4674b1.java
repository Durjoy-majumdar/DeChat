package com.tencent.p014mm.plugin.ipcall.p065ui;

import android.content.pm.PackageManager;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import eb0.C75592q0;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import nj3.C11182m0;
import nj3.C76874e0;
import te3.ux4;

/* renamed from: com.tencent.mm.plugin.ipcall.ui.b1 */
public class C4674b1 implements C11182m0 {

    /* renamed from: d */
    public final /* synthetic */ IPCallShareCouponCardUI f19645d;

    public C4674b1(IPCallShareCouponCardUI iPCallShareCouponCardUI) {
        this.f19645d = iPCallShareCouponCardUI;
    }

    public void onCreateMMMenu(C76874e0 e0Var) {
        IPCallShareCouponCardUI iPCallShareCouponCardUI = this.f19645d;
        LinkedList<ux4> linkedList = iPCallShareCouponCardUI.f19554B.f143758d;
        Log.m105924i("MicroMsg.IPCallShareCouponCardUI", "CheckedShareList svr size =" + linkedList.size());
        LinkedList linkedList2 = new LinkedList();
        linkedList2.add(8);
        Iterator<ux4> it = linkedList.iterator();
        while (true) {
            boolean z = true;
            if (!it.hasNext()) {
                break;
            }
            ux4 next = it.next();
            AppCompatActivity context = iPCallShareCouponCardUI.getContext();
            int i = next.f143177d;
            if (!(i == 8 || i == 0 || i == 1 || i == 2 || i == 3 || i == 5)) {
                if (i == 4) {
                    if (!Util.isNullOrNil("com.whatsapp")) {
                        try {
                            context.getPackageManager().getApplicationInfo("com.whatsapp", 8192);
                        } catch (PackageManager.NameNotFoundException unused) {
                        }
                    }
                } else if (i == 6) {
                    z = C75592q0.m90755C();
                } else if (i == 7 && !Util.isNullOrNil("com.facebook.orca")) {
                    context.getPackageManager().getApplicationInfo("com.facebook.orca", 8192);
                }
                z = false;
            }
            if (z) {
                linkedList2.add(Integer.valueOf(next.f143177d));
            }
        }
        Log.m105924i("MicroMsg.IPCallShareCouponCardUI", "CheckedShareList final size =" + linkedList2.size());
        Iterator it4 = linkedList2.iterator();
        while (it4.hasNext()) {
            Integer num = (Integer) it4.next();
            AppCompatActivity context2 = this.f19645d.getContext();
            int intValue = num.intValue();
            HashMap hashMap = new HashMap();
            hashMap.put(8, context2.getString(C0966R.string.fv8));
            hashMap.put(0, context2.getString(C0966R.string.lio));
            hashMap.put(1, context2.getString(C0966R.string.fvc));
            hashMap.put(3, context2.getString(C0966R.string.fv9));
            hashMap.put(2, context2.getString(C0966R.string.fvb));
            hashMap.put(5, context2.getString(C0966R.string.fvd));
            hashMap.put(4, context2.getString(C0966R.string.fve));
            hashMap.put(6, context2.getString(C0966R.string.fva));
            hashMap.put(7, context2.getString(C0966R.string.fv_));
            String str = hashMap.containsKey(Integer.valueOf(intValue)) ? (String) hashMap.get(Integer.valueOf(intValue)) : null;
            int intValue2 = num.intValue();
            HashMap hashMap2 = new HashMap();
            hashMap2.put(8, Integer.valueOf(C0966R.raw.bottomsheet_copy));
            hashMap2.put(0, Integer.valueOf(C0966R.raw.bottomsheet_repost));
            hashMap2.put(1, Integer.valueOf(C0966R.raw.bottomsheet_moment));
            hashMap2.put(3, Integer.valueOf(C0966R.raw.bottomsheet_email));
            hashMap2.put(2, Integer.valueOf(C0966R.raw.bottomsheet_sms));
            hashMap2.put(5, Integer.valueOf(C0966R.raw.bottomsheet_twitter));
            hashMap2.put(4, Integer.valueOf(C0966R.raw.bottomsheet_whatsapp));
            hashMap2.put(6, Integer.valueOf(C0966R.raw.bottomsheet_facebook));
            hashMap2.put(7, Integer.valueOf(C0966R.raw.bottomsheet_messenger));
            int intValue3 = hashMap2.containsKey(Integer.valueOf(intValue2)) ? ((Integer) hashMap2.get(Integer.valueOf(intValue2))).intValue() : -1;
            if (str == null || intValue3 == -1) {
                C76874e0 e0Var2 = e0Var;
            } else {
                e0Var.mo107144g(num.intValue(), str, intValue3);
            }
        }
    }
}
