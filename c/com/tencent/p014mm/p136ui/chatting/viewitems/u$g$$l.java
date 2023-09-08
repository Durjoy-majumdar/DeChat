package com.tencent.p014mm.p136ui.chatting.viewitems;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import android.view.ViewTreeObserver;
import ck3.C67391b;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.chatting.viewitems.C74244u;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import ic0.C21070h;
import jc0.C21210b;
import kg3.C76577a;

/* renamed from: com.tencent.mm.ui.chatting.viewitems.u$g$$l */
public class u$g$$l implements C21070h {

    /* renamed from: a */
    public final /* synthetic */ C74244u.C74255e f250027a;

    /* renamed from: b */
    public final /* synthetic */ C67391b f250028b;

    /* renamed from: com.tencent.mm.ui.chatting.viewitems.u$g$$l$a */
    public class C85838a implements ViewTreeObserver.OnPreDrawListener {

        /* renamed from: d */
        public final /* synthetic */ Bitmap f250029d;

        public C85838a(Bitmap bitmap) {
            this.f250029d = bitmap;
        }

        public boolean onPreDraw() {
            u$g$$l.this.f250027a.f218087x.getViewTreeObserver().removeOnPreDrawListener(this);
            int height = u$g$$l.this.f250027a.f218087x.getHeight();
            int width = u$g$$l.this.f250027a.f218087x.getWidth();
            if (height == 0) {
                height = C76577a.m92157h(u$g$$l.this.f250028b.mo91565f(), C0966R.dimen.f4282ym);
            }
            if (width == 0) {
                width = C76577a.m92157h(u$g$$l.this.f250028b.mo91565f(), C0966R.dimen.f4283yn);
            }
            u$g$$l.this.f250027a.f218087x.setBackgroundDrawable(new BitmapDrawable(BitmapUtil.createMaskImage(this.f250029d, C0966R.C0969drawable.byb, width, height)));
            return true;
        }
    }

    public u$g$$l(C74244u.C74261g gVar, C74244u.C74255e eVar, C67391b bVar) {
        this.f250027a = eVar;
        this.f250028b = bVar;
    }

    /* renamed from: a */
    public void mo6676a(String str, View view) {
    }

    /* renamed from: b */
    public void mo6677b(String str, View view, C21210b bVar) {
        Bitmap bitmap = bVar.f59988d;
        if (bitmap != null) {
            this.f250027a.f218087x.getViewTreeObserver().addOnPreDrawListener(new C85838a(bitmap));
        }
    }

    /* renamed from: c */
    public Bitmap mo6678c(String str, View view, C21210b bVar) {
        return null;
    }
}
