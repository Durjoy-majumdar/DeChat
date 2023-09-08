package com.tencent.p014mm.plugin.scanner.p101ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.base.preference.Preference;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import p755xs.C102720b;
import vl2.C78431a0;

/* renamed from: com.tencent.mm.plugin.scanner.ui.a */
public class C71013a extends Preference implements C102720b.C78973a {

    /* renamed from: J */
    public View f205507J = null;

    /* renamed from: K */
    public TextView f205508K = null;

    /* renamed from: L */
    public ImageView f205509L;

    /* renamed from: M */
    public String f205510M;

    /* renamed from: N */
    public String f205511N = null;

    /* renamed from: com.tencent.mm.plugin.scanner.ui.a$a */
    public class C71014a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ Bitmap f205512d;

        public C71014a(Bitmap bitmap) {
            this.f205512d = bitmap;
        }

        public void run() {
            C71013a.this.f205509L.setImageBitmap(this.f205512d);
            C71013a.this.f205509L.setVisibility(0);
            C71013a.this.getClass();
        }
    }

    public C71013a(Context context) {
        super(context);
        this.f121271G = C0966R.C0971layout.bug;
        ((C102720b) C86312j.m106911c(C102720b.class)).Lu0(this);
    }

    /* renamed from: j3 */
    public void mo24656j3(String str, Bitmap bitmap) {
        if (!Util.isNullOrNil(str) && str.equals(this.f205510M) && bitmap != null && !bitmap.isRecycled() && this.f205509L != null) {
            MMHandlerThread.postToMainThread(new C71014a(bitmap));
        }
    }

    /* renamed from: t */
    public View mo2020t(View view, ViewGroup viewGroup) {
        if (this.f205507J == null) {
            this.f205507J = mo1087x(viewGroup);
        }
        mo1086w(this.f205507J);
        return this.f205507J;
    }

    /* renamed from: w */
    public void mo1086w(View view) {
        Bitmap N6;
        super.mo1086w(view);
        this.f205508K = (TextView) view.findViewById(C0966R.C0970id.f357871c73);
        this.f205509L = (ImageView) view.findViewById(C0966R.C0970id.f5473g3);
        if (!Util.isNullOrNil(this.f205511N)) {
            this.f205508K.setText(this.f205511N);
            this.f205508K.setVisibility(0);
        } else {
            this.f205508K.setVisibility(8);
        }
        if (!Util.isNullOrNil(this.f205510M) && (N6 = ((C102720b) C86312j.m106911c(C102720b.class)).mo142104N6(new C78431a0(this.f205510M))) != null && !N6.isRecycled()) {
            this.f205509L.setImageBitmap(N6);
            this.f205509L.setVisibility(0);
        }
    }
}
