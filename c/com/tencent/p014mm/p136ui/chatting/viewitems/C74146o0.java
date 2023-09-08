package com.tencent.p014mm.p136ui.chatting.viewitems;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import android.widget.ImageView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.chatting.viewitems.C74162p0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import eb0.C97625j3;
import f12.C7970a;
import gc0.C20828a;
import hc0.C20937c;
import ic0.C21070h;
import ic0.C98661k;
import jc0.C21210b;
import zt3.C119157j;

/* renamed from: com.tencent.mm.ui.chatting.viewitems.o0 */
public class C74146o0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ String f217652d;

    /* renamed from: e */
    public final /* synthetic */ String f217653e;

    /* renamed from: f */
    public final /* synthetic */ C74162p0.C74163a f217654f;

    /* renamed from: g */
    public final /* synthetic */ boolean f217655g;

    /* renamed from: h */
    public final /* synthetic */ View f217656h;

    /* renamed from: com.tencent.mm.ui.chatting.viewitems.o0$a */
    public class C74147a implements C21070h {

        /* renamed from: a */
        public final /* synthetic */ int f217657a;

        /* renamed from: b */
        public final /* synthetic */ int f217658b;

        /* renamed from: com.tencent.mm.ui.chatting.viewitems.o0$a$a */
        public class C74148a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ C21210b f217660d;

            /* renamed from: e */
            public final /* synthetic */ String f217661e;

            public C74148a(C21210b bVar, String str) {
                this.f217660d = bVar;
                this.f217661e = str;
            }

            public void run() {
                if (this.f217660d.f59988d != null && this.f217661e.equals(C74146o0.this.f217656h.getTag(C0966R.C0970id.kdb))) {
                    Resources resources = MMApplicationContext.getResources();
                    C74147a aVar = C74147a.this;
                    C74146o0 o0Var = C74146o0.this;
                    C74146o0.this.f217656h.setBackground(new BitmapDrawable(resources, C74162p0.m88332b(o0Var.f217652d, this.f217660d.f59988d, aVar.f217657a, aVar.f217658b, !o0Var.f217655g)));
                }
            }
        }

        public C74147a(int i, int i2) {
            this.f217657a = i;
            this.f217658b = i2;
        }

        /* renamed from: a */
        public void mo6676a(String str, View view) {
        }

        /* renamed from: b */
        public void mo6677b(String str, View view, C21210b bVar) {
            ((C119157j) C119157j.f356862d).mo183868B(new C74148a(bVar, str));
        }

        /* renamed from: c */
        public Bitmap mo6678c(String str, View view, C21210b bVar) {
            return null;
        }
    }

    public C74146o0(String str, String str2, C74162p0.C74163a aVar, boolean z, View view) {
        this.f217652d = str;
        this.f217653e = str2;
        this.f217654f = aVar;
        this.f217655g = z;
        this.f217656h = view;
    }

    public void run() {
        Log.m105925i(this.f217652d, "get background url: %s", this.f217653e);
        int height = this.f217654f.clickArea.getHeight();
        int width = this.f217654f.clickArea.getWidth();
        Bitmap e = C20828a.m22825b().mo32516e(this.f217653e);
        if (e != null) {
            this.f217656h.setBackground(new BitmapDrawable(MMApplicationContext.getResources(), C74162p0.m88332b(this.f217652d, e, height, width, true ^ this.f217655g)));
            return;
        }
        C20937c.C20939b bVar = new C20937c.C20939b();
        C97625j3.m125812b().getClass();
        bVar.f59351g = C7970a.m8128b();
        bVar.f59346b = true;
        bVar.f59345a = true;
        bVar.f59363s = false;
        bVar.f59354j = width;
        bVar.f59355k = height;
        C20937c a = bVar.mo32666a();
        this.f217656h.setTag(C0966R.C0970id.kdb, this.f217653e);
        C20828a.m22825b().mo32522k(this.f217653e, (ImageView) null, a, (C98661k) null, new C74147a(height, width));
    }
}
