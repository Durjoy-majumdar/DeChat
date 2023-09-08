package com.tencent.p014mm.p136ui;

import android.app.Activity;
import android.content.DialogInterface;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.platformtools.NetStatusUtil;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import java.util.HashMap;
import m13.C88689b;
import p271xn.C38770l;
import p910lj.C76701a;
import qo3.C47883u;
import qo3.C77426q;

/* renamed from: com.tencent.mm.ui.g2 */
public class C30855g2 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ Activity f82883d;

    /* renamed from: com.tencent.mm.ui.g2$a */
    public class C30856a implements C47883u {

        /* renamed from: a */
        public final /* synthetic */ HashMap f82884a;

        public C30856a(HashMap hashMap) {
            this.f82884a = hashMap;
        }

        /* renamed from: a */
        public void mo353a(boolean z, String str) {
            Log.m105925i("MicroMsg.MMErrorProcessor", "onDialogClick %s", Boolean.valueOf(z));
            if (z) {
                ((C38770l) C86312j.m106911c(C38770l.class)).Wj0(C30855g2.this.f82883d, this.f82884a);
                C115669n.INSTANCE.idkeyStat(1429, 35, 1, false);
                C76701a.makeText(MMApplicationContext.getContext(), (CharSequence) MMApplicationContext.getContext().getString(C0966R.string.maj), 1).show();
            }
            MultiProcessMMKV.getMMKV(MMApplicationContext.getDefaultPreferencePath()).putBoolean("update_has_new_package", false);
        }
    }

    /* renamed from: com.tencent.mm.ui.g2$b */
    public class C30857b implements DialogInterface.OnDismissListener {
        public C30857b(C30855g2 g2Var) {
        }

        public void onDismiss(DialogInterface dialogInterface) {
            C115669n.INSTANCE.idkeyStat(1429, 36, 1, false);
            MultiProcessMMKV.getMMKV(MMApplicationContext.getDefaultPreferencePath()).putBoolean("update_has_new_package", false);
        }
    }

    public C30855g2(Activity activity) {
        this.f82883d = activity;
    }

    public void run() {
        Class cls = C88689b.class;
        boolean z = MultiProcessMMKV.getMMKV(MMApplicationContext.getDefaultPreferencePath()).getBoolean("update_has_new_package", false);
        Log.m105925i("MicroMsg.MMErrorProcessor", "hasXkeyUpdateUrl = %s.", Boolean.valueOf(z));
        if (!z) {
            C74785j2.f219907a = true;
            return;
        }
        boolean isWifi = NetStatusUtil.isWifi(MMApplicationContext.getContext());
        Log.m105925i("MicroMsg.MMErrorProcessor", "checkXkeyUpdateUrl, curIsWifi = %s, hasShownXkeyUrlUpdateDialog = %s", Boolean.valueOf(isWifi), Boolean.valueOf(C74785j2.f219907a));
        if (isWifi) {
            C74785j2.f219907a = true;
            if (z) {
                HashMap<String, Object> gd02 = ((C88689b) C86312j.m106911c(cls)).gd0();
                boolean z2 = gd02 != null && !gd02.isEmpty();
                Log.m105925i("MicroMsg.MMErrorProcessor", "checkSuccess = %s, checkUrlCanDownload = %s.", Boolean.valueOf(z2), Boolean.valueOf(((C88689b) C86312j.m106911c(cls)).mo122752er(MMApplicationContext.getContext())));
                if (!z2) {
                    MultiProcessMMKV.getMMKV(MMApplicationContext.getDefaultPreferencePath()).putBoolean("update_has_new_package", false);
                    return;
                }
                String string = MMApplicationContext.getContext().getString(C0966R.string.k7d);
                Object obj = gd02.get("dialog_tips_content");
                if (obj instanceof String) {
                    String str = (String) obj;
                    if (!Util.isNullOrNil(str)) {
                        string = str;
                    }
                }
                C115669n.INSTANCE.idkeyStat(1429, 34, 1, false);
                C77426q qVar = new C77426q(MMApplicationContext.getContext());
                qVar.mo107595g(string);
                qVar.mo107601m(C0966R.string.mai);
                qVar.mo107606r(MMApplicationContext.getContext().getString(C0966R.string.btj));
                qVar.mo107589a(true);
                qVar.mo107590b(new C30856a(gd02));
                qVar.mo107593e(new C30857b(this));
                qVar.mo107603o();
            }
        }
    }
}
