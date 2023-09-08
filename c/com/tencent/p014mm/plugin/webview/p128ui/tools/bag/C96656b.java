package com.tencent.p014mm.plugin.webview.p128ui.tools.bag;

import android.content.Context;
import android.graphics.PointF;
import android.os.Vibrator;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.ScaleAnimation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import l93.C99348a;
import p206nj.C11171e;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.bag.b */
public final class C96656b {

    /* renamed from: j */
    public static final int f283086j;

    /* renamed from: a */
    public C72599a f283087a;

    /* renamed from: b */
    public final C72600b f283088b;

    /* renamed from: c */
    public boolean f283089c;

    /* renamed from: d */
    public PointF f283090d = new PointF();

    /* renamed from: e */
    public boolean f283091e;

    /* renamed from: f */
    public boolean f283092f;

    /* renamed from: g */
    public int f283093g;

    /* renamed from: h */
    public int f283094h;

    /* renamed from: i */
    public boolean f283095i;

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.bag.b$a */
    public static final class C72599a extends FrameLayout {

        /* renamed from: d */
        public ImageView f211216d;

        /* renamed from: e */
        public View f211217e = findViewById(C0966R.C0970id.br8);

        /* renamed from: f */
        public Vibrator f211218f;

        public C72599a(Context context) {
            super(context);
            this.f211218f = (Vibrator) context.getSystemService("vibrator");
            LayoutInflater.from(context).inflate(C0966R.C0971layout.chw, this);
            ImageView imageView = (ImageView) findViewById(C0966R.C0970id.a8a);
            this.f211216d = imageView;
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) imageView.getLayoutParams();
            int i = C99348a.f291335f;
            layoutParams.height = i;
            layoutParams.width = i;
            this.f211216d.setLayoutParams(layoutParams);
        }

        /* renamed from: a */
        public final void mo100017a(float f, float f2) {
            ScaleAnimation scaleAnimation = new ScaleAnimation(f, f2, f, f2, 1, 1.0f, 1, 1.0f);
            scaleAnimation.setFillAfter(true);
            scaleAnimation.setDuration(50);
            this.f211216d.startAnimation(scaleAnimation);
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.bag.b$b */
    public interface C72600b {
    }

    static {
        int i = C99348a.f291335f;
        f283086j = i * i;
    }

    public C96656b(C72600b bVar) {
        this.f283088b = bVar;
        WindowManager windowManager = (WindowManager) MMApplicationContext.getContext().getSystemService("window");
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        if (C11171e.m11046c(26)) {
            layoutParams.type = 2038;
        } else {
            layoutParams.type = 2002;
        }
        layoutParams.format = 1;
        layoutParams.flags = 40;
        layoutParams.gravity = 85;
        int i = C99348a.f291336g;
        layoutParams.width = i;
        layoutParams.height = i;
        layoutParams.x = 0;
        layoutParams.y = 0;
        C72599a aVar = new C72599a(MMApplicationContext.getContext());
        this.f283087a = aVar;
        try {
            aVar.setVisibility(8);
            windowManager.addView(this.f283087a, layoutParams);
        } catch (Exception e) {
            Log.m105921e("MicroMsg.BagCancelController", "showCanceller add failed %s", e);
        }
    }
}
