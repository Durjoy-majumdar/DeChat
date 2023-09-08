package com.tencent.p014mm.p136ui.chatting.viewitems;

import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import p158gt.C76057w;
import p158gt.C8451i;
import zt3.C119157j;

/* renamed from: com.tencent.mm.ui.chatting.viewitems.m0 */
public class C74109m0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ String f217520d;

    /* renamed from: e */
    public final /* synthetic */ View f217521e;

    /* renamed from: f */
    public final /* synthetic */ ImageView f217522f;

    /* renamed from: g */
    public final /* synthetic */ ImageView f217523g;

    /* renamed from: h */
    public final /* synthetic */ String f217524h;

    /* renamed from: i */
    public final /* synthetic */ boolean f217525i;

    /* renamed from: com.tencent.mm.ui.chatting.viewitems.m0$a */
    public class C74110a implements C76057w.C76058a {

        /* renamed from: a */
        public final /* synthetic */ int f217526a;

        /* renamed from: b */
        public final /* synthetic */ int f217527b;

        /* renamed from: com.tencent.mm.ui.chatting.viewitems.m0$a$a */
        public class C74111a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ Bitmap f217529d;

            /* renamed from: e */
            public final /* synthetic */ String f217530e;

            public C74111a(Bitmap bitmap, String str) {
                this.f217529d = bitmap;
                this.f217530e = str;
            }

            public void run() {
                if (this.f217529d != null && this.f217530e.equals(C74109m0.this.f217522f.getTag(C0966R.C0970id.kdb))) {
                    Bitmap bitmap = this.f217529d;
                    C74110a aVar = C74110a.this;
                    C74109m0.this.f217522f.setImageBitmap(C74126n0.m88233g(bitmap, aVar.f217526a, aVar.f217527b, !C74109m0.this.f217525i));
                }
            }
        }

        public C74110a(int i, int i2) {
            this.f217526a = i;
            this.f217527b = i2;
        }

        /* renamed from: a */
        public void mo25933a(String str, Bitmap bitmap, String str2) {
            ((C119157j) C119157j.f356862d).mo183868B(new C74111a(bitmap, str));
        }
    }

    public C74109m0(String str, View view, ImageView imageView, ImageView imageView2, String str2, boolean z) {
        this.f217520d = str;
        this.f217521e = view;
        this.f217522f = imageView;
        this.f217523g = imageView2;
        this.f217524h = str2;
        this.f217525i = z;
    }

    public void run() {
        Log.m105925i("MicroMsg.ChattingItemAppMsgC2CHoneyPay", "get background url: %s", this.f217520d);
        int height = this.f217521e.getHeight();
        int width = this.f217521e.getWidth();
        if (height > 0 && width > 0) {
            ViewGroup.LayoutParams layoutParams = this.f217522f.getLayoutParams();
            layoutParams.width = width;
            layoutParams.height = height;
            this.f217522f.setLayoutParams(layoutParams);
            ViewGroup.LayoutParams layoutParams2 = this.f217523g.getLayoutParams();
            layoutParams2.width = width;
            layoutParams2.height = height;
            this.f217523g.setLayoutParams(layoutParams2);
        }
        Bitmap bitmap = ((C8451i) C86312j.m106911c(C8451i.class)).get(this.f217524h);
        if (bitmap != null) {
            this.f217522f.setImageBitmap(C74126n0.m88233g(bitmap, height, width, true ^ this.f217525i));
            return;
        }
        this.f217522f.setTag(C0966R.C0970id.kdb, this.f217524h);
        ((C76057w) C86312j.m106911c(C76057w.class)).h60(this.f217524h, new C74110a(height, width));
    }
}
