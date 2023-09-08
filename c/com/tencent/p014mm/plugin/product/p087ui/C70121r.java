package com.tencent.p014mm.plugin.product.p087ui;

import af2.C39560p;
import android.graphics.Bitmap;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.p014mm.sdk.platformtools.Util;
import p755xs.C102720b;

/* renamed from: com.tencent.mm.plugin.product.ui.r */
public class C70121r implements C102720b.C78973a {

    /* renamed from: d */
    public ImageView f202413d;

    /* renamed from: e */
    public TextView f202414e;

    /* renamed from: f */
    public C39560p.C39561a f202415f;

    /* renamed from: com.tencent.mm.plugin.product.ui.r$a */
    public class C70122a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ Bitmap f202416d;

        public C70122a(Bitmap bitmap) {
            this.f202416d = bitmap;
        }

        public void run() {
            C70121r.this.f202413d.setImageBitmap(this.f202416d);
        }
    }

    /* renamed from: j3 */
    public void mo24656j3(String str, Bitmap bitmap) {
        C39560p.C39561a aVar = this.f202415f;
        if (aVar != null && !Util.isNullOrNil(aVar.f106205b) && str.equals(this.f202415f.f106205b)) {
            this.f202413d.post(new C70122a(bitmap));
        }
    }
}
