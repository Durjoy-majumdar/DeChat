package com.tencent.p014mm.p136ui;

import android.content.Context;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.AppBrandNotifySettingsUI;
import com.tencent.p014mm.plugin.appbrand.config.WxaAttributes;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import java.util.Iterator;
import java.util.LinkedList;
import kr0.C76629w0;
import nj3.C76912y0;
import ob0.C117747y;
import ob0.C47350c;
import ob0.l0$$e;
import qo3.C89779i0;
import te3.C49831id2;
import te3.s65;

/* renamed from: com.tencent.mm.ui.l */
public class C74789l implements l0$$e {

    /* renamed from: d */
    public final /* synthetic */ AppBrandNotifySettingsUI f219912d;

    /* renamed from: com.tencent.mm.ui.l$a */
    public class C74790a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C49831id2 f219913d;

        public C74790a(C49831id2 id22) {
            this.f219913d = id22;
        }

        public void run() {
            LinkedList<s65> linkedList = this.f219913d.f135243e;
            if (linkedList == null) {
                Log.m105924i("MicroMsg.AppBrandNotifySettingsUI", "getNotifyMsgInfo, configList is null");
                return;
            }
            AppBrandNotifySettingsUI appBrandNotifySettingsUI = C74789l.this.f219912d;
            int i = AppBrandNotifySettingsUI.f214141j;
            appBrandNotifySettingsUI.getClass();
            LinkedList linkedList2 = new LinkedList();
            C76629w0 w0Var = (C76629w0) C86312j.m106911c(C76629w0.class);
            Iterator<s65> it = linkedList.iterator();
            while (it.hasNext()) {
                s65 next = it.next();
                AppBrandNotifySettingsUI.C73005d.C73007b bVar = new AppBrandNotifySettingsUI.C73005d.C73007b();
                String str = next.f141352d;
                WxaAttributes XX = w0Var.mo106881XX(str);
                boolean z = false;
                if (XX == null) {
                    Log.m105929w("MicroMsg.AppBrandNotifySettingsUI", "can't find local record, appId:%s", str);
                } else {
                    bVar.f214158a = XX.field_username;
                    bVar.f214160c = XX.field_nickname;
                    bVar.f214159b = XX.field_brandIconURL;
                    if (next.f141353e == 0) {
                        z = true;
                    }
                    bVar.f214161d = z;
                    linkedList2.add(bVar);
                }
            }
            AppBrandNotifySettingsUI.C73005d dVar = appBrandNotifySettingsUI.f214143e;
            dVar.f214153e.clear();
            if (!linkedList2.isEmpty()) {
                dVar.f214153e.addAll(linkedList2);
            }
            appBrandNotifySettingsUI.f214143e.notifyDataSetChanged();
            AppBrandNotifySettingsUI.m85889H7(C74789l.this.f219912d, this.f219913d.f135243e);
        }
    }

    public C74789l(AppBrandNotifySettingsUI appBrandNotifySettingsUI) {
        this.f219912d = appBrandNotifySettingsUI;
    }

    /* renamed from: a */
    public int mo1488a(int i, int i2, String str, C47350c cVar, C117747y yVar) {
        Log.m105919d("MicroMsg.AppBrandNotifySettingsUI", "getNotifyMsgInfo errType = %d, errCode = %d, errMsg = %s", Integer.valueOf(i), Integer.valueOf(i2), str);
        C89779i0 i0Var = this.f219912d.f214144f;
        if (i0Var != null) {
            i0Var.dismiss();
        }
        if (i == 0 && i2 == 0) {
            C49831id2 id22 = (C49831id2) cVar.f127056b.f127083a;
            if (id22.f135243e == null) {
                Log.m105920e("MicroMsg.AppBrandNotifySettingsUI", "wxa_msg_config_list not exist");
                return 0;
            }
            this.f219912d.runOnUiThread(new C74790a(id22));
            return 0;
        }
        C76912y0.makeText((Context) this.f219912d, (int) C0966R.string.f361106hd1, 0).show();
        return 0;
    }
}
