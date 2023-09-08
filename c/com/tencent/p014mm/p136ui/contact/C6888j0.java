package com.tencent.p014mm.p136ui.contact;

import a70.C112760b;
import android.content.Context;
import android.content.Intent;
import android.view.MenuItem;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import ke3.C88144b;
import nj3.C11184p0;
import p140cw.C7138g;
import p447aw.C103918d;
import p910lj.C76701a;

/* renamed from: com.tencent.mm.ui.contact.j0 */
public class C6888j0 implements C11184p0 {

    /* renamed from: d */
    public final /* synthetic */ ContactRemarkInfoModUI f24524d;

    public C6888j0(ContactRemarkInfoModUI contactRemarkInfoModUI) {
        this.f24524d = contactRemarkInfoModUI;
    }

    public void onMMMenuItemSelected(MenuItem menuItem, int i) {
        int itemId = menuItem.getItemId();
        if (itemId == 1) {
            ContactRemarkInfoModUI contactRemarkInfoModUI = this.f24524d;
            int i2 = ContactRemarkInfoModUI.f218496o1;
            contactRemarkInfoModUI.getClass();
            boolean z1 = ((C103918d) C86312j.m106911c(C103918d.class)).mo125788z1(contactRemarkInfoModUI.getContext(), "android.permission.CAMERA", 16, "", "");
            Log.m105925i("MiroMsg.ContactRemarkInfoModUI", "summerper checkPermission checkCamera[%b], stack[%s], activity[%s]", Boolean.valueOf(z1), Util.getStack(), contactRemarkInfoModUI.getContext());
            if (z1) {
                String K = C112760b.m154203K();
                if (!((C7138g) C86312j.m106911c(C7138g.class)).Gl0(contactRemarkInfoModUI, K, "microMsg." + System.currentTimeMillis() + ".jpg", 100)) {
                    C76701a.makeText((Context) contactRemarkInfoModUI, (CharSequence) contactRemarkInfoModUI.getString(C0966R.string.ik5), 1).show();
                }
            }
        } else if (itemId == 2) {
            ContactRemarkInfoModUI contactRemarkInfoModUI2 = this.f24524d;
            int i3 = 3 - contactRemarkInfoModUI2.f218511P;
            if (i3 > 0) {
                Intent intent = new Intent();
                intent.putExtra("max_select_count", i3);
                intent.putExtra("show_header_view", false);
                intent.putExtra("query_source_type", 19);
                intent.putExtra("send_btn_string", contactRemarkInfoModUI2.getResources().getString(C0966R.string.f8014z_));
                intent.addFlags(67108864);
                intent.putExtra("gallery_report_tag", 19);
                C88144b.m109795m(contactRemarkInfoModUI2, "gallery", ".ui.GalleryEntryUI", intent, 200);
            }
        }
    }
}
