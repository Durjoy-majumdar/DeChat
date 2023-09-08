package com.tencent.p014mm.plugin.appbrand.share.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.lifecycle.C0124r;
import androidx.lifecycle.C112974b0;
import androidx.lifecycle.C39623j;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.message.C68070l;
import com.tencent.p014mm.p136ui.widget.MMSwitchBtn;
import com.tencent.p014mm.p136ui.widget.ThreeDotsLoadingView;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.xweb.util.WXWebReporter;
import di3.C86312j;
import j20.C117292a;
import java.util.ArrayList;
import js0.C88020k;
import js0.C9515s;
import kb0.C76529i;
import kg3.C76577a;
import lb0.C88394b;
import p158gt.C76057w;

/* renamed from: com.tencent.mm.plugin.appbrand.share.widget.WxaShareMessagePage */
public class WxaShareMessagePage extends LinearLayout implements C88394b.C88411m, C0124r {

    /* renamed from: d */
    public TextView f246093d;

    /* renamed from: e */
    public ImageView f246094e;

    /* renamed from: f */
    public ImageView f246095f;

    /* renamed from: g */
    public ThreeDotsLoadingView f246096g;

    /* renamed from: h */
    public RelativeLayout f246097h;

    /* renamed from: i */
    public ImageView f246098i;

    /* renamed from: j */
    public MMSwitchBtn f246099j;

    /* renamed from: n */
    public ImageView f246100n;

    /* renamed from: o */
    public TextView f246101o;

    /* renamed from: p */
    public C76529i.C76531b f246102p;

    /* renamed from: q */
    public C76529i.C76532c f246103q;

    /* renamed from: r */
    public View f246104r;

    /* renamed from: s */
    public boolean f246105s;

    /* renamed from: t */
    public ImageView f246106t;

    /* renamed from: com.tencent.mm.plugin.appbrand.share.widget.WxaShareMessagePage$a */
    public class C84254a implements View.OnClickListener {
        public C84254a() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/appbrand/share/widget/WxaShareMessagePage$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C76529i.C76532c cVar = WxaShareMessagePage.this.f246103q;
            if (cVar != null) {
                cVar.mo104154b();
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/appbrand/share/widget/WxaShareMessagePage$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.share.widget.WxaShareMessagePage$b */
    public class C84255b implements MMSwitchBtn.C7041b {
        public C84255b() {
        }

        public void onStatusChange(boolean z) {
            WxaShareMessagePage.this.setTag(C0966R.C0970id.f6023v5, Boolean.valueOf(z));
            C76529i.C76532c cVar = WxaShareMessagePage.this.f246103q;
            if (cVar != null) {
                cVar.mo104153a(z);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.share.widget.WxaShareMessagePage$c */
    public class C84256c implements C76057w.C76058a {

        /* renamed from: a */
        public final /* synthetic */ boolean f246109a;

        /* renamed from: com.tencent.mm.plugin.appbrand.share.widget.WxaShareMessagePage$c$a */
        public class C84257a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ Bitmap f246111d;

            public C84257a(Bitmap bitmap) {
                this.f246111d = bitmap;
            }

            public void run() {
                C84256c cVar = C84256c.this;
                if (cVar.f246109a) {
                    WxaShareMessagePage.this.f246100n.setImageBitmap(this.f246111d);
                    WxaShareMessagePage.this.f246095f.setImageBitmap(this.f246111d);
                    return;
                }
                WxaShareMessagePage.this.f246100n.setImageBitmap(this.f246111d);
                WxaShareMessagePage.this.f246095f.setImageBitmap(this.f246111d);
            }
        }

        public C84256c(boolean z) {
            this.f246109a = z;
        }

        /* renamed from: a */
        public void mo25933a(String str, Bitmap bitmap, String str2) {
            MMHandlerThread.postToMainThread(new C84257a(bitmap));
        }
    }

    public WxaShareMessagePage(Context context) {
        super(context);
        mo116924f(context);
    }

    /* renamed from: b */
    public void mo1907b() {
        this.f246096g.setVisibility(4);
        this.f246096g.mo119904f();
        this.f246094e.setImageBitmap((Bitmap) null);
        this.f246095f.setVisibility(0);
        C76529i.C76531b bVar = this.f246102p;
        if (bVar != null) {
            bVar.mo94358a(1);
        }
    }

    /* renamed from: d */
    public void mo1908d() {
    }

    /* renamed from: e */
    public void mo116923e(Bundle bundle) {
        int i = bundle.getInt("key_biz", 2);
        boolean z = bundle.getBoolean("is_video", false);
        if (C68070l.C68071a.m80416b(i) || z) {
            this.f246105s = true;
            ViewGroup.LayoutParams layoutParams = this.f246094e.getLayoutParams();
            layoutParams.width = C76577a.m92151b(getContext(), 112);
            layoutParams.height = C76577a.m92151b(getContext(), 63);
            this.f246094e.setLayoutParams(layoutParams);
            this.f246094e.setScaleType(ImageView.ScaleType.CENTER_CROP);
            ViewGroup.LayoutParams layoutParams2 = this.f246095f.getLayoutParams();
            layoutParams2.width = C76577a.m92151b(getContext(), 112);
            layoutParams2.height = C76577a.m92151b(getContext(), 63);
            this.f246095f.setLayoutParams(layoutParams2);
            ViewGroup.LayoutParams layoutParams3 = this.f246104r.getLayoutParams();
            layoutParams3.width = C76577a.m92151b(getContext(), 112);
            layoutParams3.height = C76577a.m92151b(getContext(), 63);
            this.f246104r.setLayoutParams(layoutParams3);
            if (i == 0) {
                this.f246100n.setImageResource(C0966R.raw.my_life_around_default_icon);
                this.f246095f.setImageResource(C0966R.raw.app_msg_share_nearby_life_default);
            } else if (1 == i || z) {
                String string = bundle.getString("key_footer_icon", "");
                if (!Util.isNullOrNil(string)) {
                    ((C76057w) C86312j.m106911c(C76057w.class)).h60(string, new C84256c(z));
                }
            }
            String string2 = bundle.getString("key_footer_text", "");
            String string3 = bundle.getString("key_footer_text_default", "");
            if (!string2.isEmpty()) {
                this.f246101o.setText(string2);
            } else if (!string3.isEmpty()) {
                this.f246101o.setText(string3);
            }
        }
    }

    /* renamed from: f */
    public final void mo116924f(Context context) {
        View inflate = View.inflate(context, C0966R.C0971layout.cj6, this);
        this.f246104r = inflate.findViewById(C0966R.C0970id.ees);
        this.f246094e = (ImageView) inflate.findViewById(C0966R.C0970id.bv8);
        this.f246095f = (ImageView) inflate.findViewById(C0966R.C0970id.cku);
        this.f246093d = (TextView) inflate.findViewById(C0966R.C0970id.kpm);
        this.f246106t = (ImageView) inflate.findViewById(C0966R.C0970id.l5y);
        this.f246096g = (ThreeDotsLoadingView) inflate.findViewById(C0966R.C0970id.g3t);
        View inflate2 = LayoutInflater.from(context).inflate(C0966R.C0971layout.b3z, (ViewGroup) inflate, false);
        this.f246100n = (ImageView) inflate2.findViewById(C0966R.C0970id.jig);
        this.f246101o = (TextView) inflate2.findViewById(C0966R.C0970id.jih);
        this.f246097h = (RelativeLayout) inflate.findViewById(C0966R.C0970id.f359402kq3);
        this.f246098i = (ImageView) inflate.findViewById(C0966R.C0970id.f8f);
        this.f246099j = (MMSwitchBtn) inflate.findViewById(C0966R.C0970id.f359401kq2);
        ((ViewGroup) inflate.findViewById(C0966R.C0970id.f357785br0)).addView(inflate2);
        setGravity(17);
        this.f246098i.setOnClickListener(new C84254a());
        setTag(C0966R.C0970id.f6023v5, Boolean.FALSE);
        this.f246099j.setSwitchListener(new C84255b());
    }

    /* renamed from: g */
    public void mo116925g(boolean z, C76529i.C76532c cVar) {
        if (z) {
            this.f246097h.setVisibility(0);
        } else {
            this.f246097h.setVisibility(8);
        }
        this.f246103q = cVar;
    }

    public ImageView getCoverImageView() {
        return this.f246094e;
    }

    public ImageView getErrorImageView() {
        return this.f246095f;
    }

    public ThreeDotsLoadingView getLoadingView() {
        return this.f246096g;
    }

    public ImageView getVideoIcon() {
        return this.f246106t;
    }

    public int getWidgetHeight() {
        return C88020k.m109553d(180);
    }

    public int getWidgetWidth() {
        return C88020k.m109553d(WXWebReporter.WXWEB_IDKEY_DEBUG_LINK_ALL);
    }

    public String key() {
        return C9515s.m9209a(this);
    }

    @C112974b0(C39623j.C39625b.ON_DESTROY)
    public void onActivityDestroyed() {
        this.f246096g.mo119904f();
        String str = C88394b.f255384g;
        C88394b.C88418q.f255427a.mo122789e(this);
    }

    public void onBitmapLoaded(Bitmap bitmap) {
        this.f246096g.setVisibility(4);
        this.f246096g.mo119904f();
        if (bitmap == null || bitmap.isRecycled()) {
            this.f246094e.setImageBitmap((Bitmap) null);
            this.f246095f.setVisibility(0);
        } else {
            this.f246094e.setImageBitmap(bitmap);
            this.f246095f.setVisibility(4);
        }
        C76529i.C76531b bVar = this.f246102p;
        if (bVar != null) {
            bVar.mo94358a(0);
        }
    }

    public void setImageData(Bitmap bitmap) {
        this.f246094e.setVisibility(0);
        this.f246096g.setVisibility(4);
        this.f246095f.setVisibility(4);
        if (bitmap == null || bitmap.isRecycled()) {
            this.f246094e.setImageBitmap((Bitmap) null);
        } else if (this.f246105s) {
            this.f246094e.setImageBitmap(bitmap);
        } else {
            this.f246094e.setImageBitmap(((C76529i) C86312j.m106911c(C76529i.class)).mo106766ul(112, 90).mo5830c(bitmap));
        }
    }

    public void setImageUrl(String str) {
        Class cls = C76529i.class;
        this.f246096g.setVisibility(0);
        this.f246096g.mo119903e();
        this.f246095f.setVisibility(4);
        this.f246094e.setVisibility(0);
        if (this.f246105s) {
            String str2 = C88394b.f255384g;
            C88394b.C88418q.f255427a.mo122797p(this, str, (C88394b.C88408j) null, ((C76529i) C86312j.m106911c(cls)).mo106759Hc(112, 90, C76529i.C76530a.DECODE_TYPE_ORIGIN));
            return;
        }
        String str3 = C88394b.f255384g;
        C88394b.C88418q.f255427a.mo122797p(this, str, (C88394b.C88408j) null, ((C76529i) C86312j.m106911c(cls)).Ij0(112, 90));
    }

    public void setOnLoadImageResult(C76529i.C76531b bVar) {
        this.f246102p = bVar;
    }

    public void setTitle(String str) {
        this.f246093d.setText(str);
    }

    public WxaShareMessagePage(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo116924f(context);
    }

    public WxaShareMessagePage(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo116924f(context);
    }
}
