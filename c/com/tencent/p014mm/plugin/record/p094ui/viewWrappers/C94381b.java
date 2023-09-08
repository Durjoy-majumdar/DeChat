package com.tencent.p014mm.plugin.record.p094ui.viewWrappers;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.record.p094ui.viewWrappers.ImageViewWrapper;
import com.tencent.p014mm.sdk.system.AndroidMediaUtil;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import eb0.C86493v0;
import ke3.C88144b;
import nj3.C11184p0;
import p159gw.C98250h;
import p910lj.C76701a;
import pb1.C100734q;
import sf0.C48373d0;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.record.ui.viewWrappers.b */
public class C94381b implements C11184p0 {

    /* renamed from: d */
    public final /* synthetic */ ImageViewWrapper.C94375c f272806d;

    /* renamed from: com.tencent.mm.plugin.record.ui.viewWrappers.b$a */
    public class C94382a implements C98250h.C98251a {

        /* renamed from: com.tencent.mm.plugin.record.ui.viewWrappers.b$a$a */
        public class C94383a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ String f272808d;

            public C94383a(String str) {
                this.f272808d = str;
            }

            public void run() {
                C48373d0.f129498a.mo73085b(C86013q1.m106456q(this.f272808d), C94381b.this.f272806d.f272774e.f297464a.f299259I1);
            }
        }

        public C94382a() {
        }

        /* renamed from: a */
        public void mo2055a(String str, String str2) {
            Context context = C94381b.this.f272806d.f272773d;
            C76701a.makeText(context, (CharSequence) context.getString(C0966R.string.bwc, new Object[]{AndroidMediaUtil.getFriendlySdcardPath(str2)}), 1).show();
            ((C119157j) C119157j.f356862d).mo183875f(new C94383a(str2));
        }

        /* renamed from: b */
        public void mo2056b(String str, String str2) {
            Context context = C94381b.this.f272806d.f272773d;
            C76701a.makeText(context, (CharSequence) context.getString(C0966R.string.cr4), 1).show();
        }
    }

    public C94381b(ImageViewWrapper.C94375c cVar) {
        this.f272806d = cVar;
    }

    public void onMMMenuItemSelected(MenuItem menuItem, int i) {
        int itemId = menuItem.getItemId();
        if (itemId == 1) {
            Intent intent = new Intent();
            intent.putExtra("Ksnsupload_type", 0);
            intent.putExtra("sns_kemdia_path", this.f272806d.f272777h);
            String a = C86493v0.m107223a("fav_");
            C86493v0.m107224d().mo120947c(a, true).mo120962i("prePublishId", "fav_");
            intent.putExtra("reportSessionId", a);
            C88144b.m109791i(this.f272806d.f272773d, "sns", ".ui.SnsUploadUI", intent, (Bundle) null);
        } else if (itemId == 2) {
            ImageViewWrapper.C94375c cVar = this.f272806d;
            C100734q.m131871r0(cVar.f272777h, cVar.f272773d, cVar.f272774e.f297464a.f299259I1);
        } else if (itemId == 3) {
            ImageViewWrapper.C94375c cVar2 = this.f272806d;
            ((C98250h) C86312j.m106911c(C98250h.class)).mo137346Zv(cVar2.f272773d, cVar2.f272777h, new C94382a());
        }
    }
}
