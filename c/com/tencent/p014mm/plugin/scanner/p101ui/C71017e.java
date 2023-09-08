package com.tencent.p014mm.plugin.scanner.p101ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.base.preference.Preference;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import p755xs.C102720b;
import pj3.C47511g;
import vl2.C78431a0;

/* renamed from: com.tencent.mm.plugin.scanner.ui.e */
public class C71017e extends Preference implements C102720b.C78973a {

    /* renamed from: J */
    public View f205526J = null;

    /* renamed from: K */
    public ImageView f205527K = null;

    /* renamed from: L */
    public String f205528L;

    /* renamed from: M */
    public Context f205529M;

    /* renamed from: N */
    public C47511g f205530N;

    /* renamed from: com.tencent.mm.plugin.scanner.ui.e$a */
    public class C71018a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ Bitmap f205531d;

        public C71018a(Bitmap bitmap) {
            this.f205531d = bitmap;
        }

        public void run() {
            C71017e.this.f205527K.setImageBitmap(this.f205531d);
            C71017e.this.f205527K.setBackgroundColor(0);
            C47511g gVar = C71017e.this.f205530N;
            if (gVar != null) {
                gVar.notifyDataSetChanged();
            }
        }
    }

    public C71017e(Context context) {
        super(context);
        this.f121271G = C0966R.C0971layout.bo6;
        ((C102720b) C86312j.m106911c(C102720b.class)).Lu0(this);
        this.f205529M = context;
    }

    /* renamed from: j3 */
    public void mo24656j3(String str, Bitmap bitmap) {
        if (!Util.isNullOrNil(str) && str.equals(this.f205528L) && bitmap != null && !bitmap.isRecycled()) {
            MMHandlerThread.postToMainThread(new C71018a(bitmap));
        }
    }

    /* renamed from: t */
    public View mo2020t(View view, ViewGroup viewGroup) {
        if (this.f205526J == null) {
            this.f205526J = mo1087x(viewGroup);
        }
        mo1086w(this.f205526J);
        return this.f205526J;
    }

    /* renamed from: w */
    public void mo1086w(View view) {
        super.mo1086w(view);
        this.f205527K = (ImageView) view.findViewById(C0966R.C0970id.gqq);
        if (!Util.isNullOrNil(this.f205528L)) {
            Bitmap N6 = ((C102720b) C86312j.m106911c(C102720b.class)).mo142104N6(new C78431a0(this.f205528L));
            if (N6 == null || N6.isRecycled()) {
                this.f205527K.setBackgroundColor(this.f205529M.getResources().getColor(C0966R.color.f3551xh));
                this.f205527K.setImageBitmap((Bitmap) null);
            } else {
                this.f205527K.setImageBitmap(N6);
                this.f205527K.setBackgroundColor(0);
            }
            ((ImageView) view.findViewById(C0966R.C0970id.gql)).setVisibility(0);
        }
    }
}
