package com.tencent.p014mm.plugin.fts;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.widget.ImageView;
import com.tencent.p014mm.plugin.fts.C93829e;
import com.tencent.p014mm.sdk.platformtools.Log;
import ov1.C77041h;

/* renamed from: com.tencent.mm.plugin.fts.d */
public class C93827d implements C93829e.C93832c {

    /* renamed from: a */
    public final /* synthetic */ ImageView f270792a;

    /* renamed from: b */
    public final /* synthetic */ Context f270793b;

    /* renamed from: c */
    public final /* synthetic */ C93829e f270794c;

    /* renamed from: com.tencent.mm.plugin.fts.d$a */
    public class C93828a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ String f270795d;

        /* renamed from: e */
        public final /* synthetic */ Bitmap f270796e;

        public C93828a(String str, Bitmap bitmap) {
            this.f270795d = str;
            this.f270796e = bitmap;
        }

        public void run() {
            if (this.f270795d.equals(C93827d.this.f270792a.getTag())) {
                Resources resources = C93827d.this.f270793b.getResources();
                Bitmap bitmap = this.f270796e;
                ImageView imageView = C93827d.this.f270792a;
                imageView.setImageDrawable(new C77041h(resources, bitmap));
                imageView.postInvalidate();
            }
        }
    }

    public C93827d(C93829e eVar, ImageView imageView, Context context) {
        this.f270794c = eVar;
        this.f270792a = imageView;
        this.f270793b = context;
    }

    /* renamed from: a */
    public void mo128772a(C93829e.C93831b bVar, String str, boolean z) {
        Log.m105927v("MicroMsg.FTS.FTSImageLoader", "LoadBitmapJob finish: %s %b", str, Boolean.valueOf(z));
        this.f270794c.f270808j.remove(str);
        if (z) {
            Bitmap e = this.f270794c.mo128777e(str);
            if (str.equals(this.f270792a.getTag())) {
                this.f270794c.f270803e.post(new C93828a(str, e));
            }
        }
    }
}
