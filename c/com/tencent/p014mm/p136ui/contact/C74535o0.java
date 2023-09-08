package com.tencent.p014mm.p136ui.contact;

import android.graphics.Bitmap;
import com.tencent.p014mm.C0966R;
import nj3.C76879j;
import xc0.C78795g;

/* renamed from: com.tencent.mm.ui.contact.o0 */
public class C74535o0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ boolean f219103d;

    /* renamed from: e */
    public final /* synthetic */ C74539p0 f219104e;

    public C74535o0(C74539p0 p0Var, boolean z) {
        this.f219104e = p0Var;
        this.f219103d = z;
    }

    public void run() {
        if (!this.f219103d) {
            ContactRemarkInfoViewUI contactRemarkInfoViewUI = this.f219104e.f219113a;
            C76879j.m92726T(contactRemarkInfoViewUI, contactRemarkInfoViewUI.getString(C0966R.string.f7966xq));
            return;
        }
        ContactRemarkInfoViewUI contactRemarkInfoViewUI2 = this.f219104e.f219113a;
        int i = ContactRemarkInfoViewUI.f218579s;
        contactRemarkInfoViewUI2.getClass();
        Bitmap h = C78795g.m95196e().mo108710h(contactRemarkInfoViewUI2.f218586j);
        if (h != null) {
            contactRemarkInfoViewUI2.f218582f.setImageBitmap(h);
            contactRemarkInfoViewUI2.f218591r = true;
        }
    }
}
