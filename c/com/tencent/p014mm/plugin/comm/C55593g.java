package com.tencent.p014mm.plugin.comm;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import gc0.C20828a;
import gy3.C87412m;
import gy3.C87413o;
import java.util.Arrays;
import kg3.C76577a;
import o40.C61926c;
import rx3.C13598b0;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.comm.g */
public final class C55593g {

    /* renamed from: a */
    public static final C55593g f158270a = new C55593g();

    /* renamed from: com.tencent.mm.plugin.comm.g$a */
    public static final class C55594a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ Context f158271d;

        /* renamed from: e */
        public final /* synthetic */ Bitmap f158272e;

        /* renamed from: f */
        public final /* synthetic */ View f158273f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C55594a(Context context, Bitmap bitmap, View view) {
            super(0);
            this.f158271d = context;
            this.f158272e = bitmap;
            this.f158273f = view;
        }

        public Object invoke() {
            this.f158273f.setBackground(new BitmapDrawable(this.f158271d.getResources(), this.f158272e));
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.comm.g$b */
    public static final class C55595b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ View f158274d;

        /* renamed from: e */
        public final /* synthetic */ Context f158275e;

        /* renamed from: f */
        public final /* synthetic */ Bitmap f158276f;

        /* renamed from: g */
        public final /* synthetic */ String f158277g;

        public C55595b(View view, Context context, Bitmap bitmap, String str) {
            this.f158274d = view;
            this.f158275e = context;
            this.f158276f = bitmap;
            this.f158277g = str;
        }

        public final void run() {
            int width = this.f158274d.getWidth();
            int height = this.f158274d.getHeight();
            if (this.f158274d.getWidth() == 0 || this.f158274d.getHeight() == 0) {
                width = C76577a.m92151b(this.f158275e, 268);
                height = C76577a.m92151b(this.f158275e, 80);
            }
            int i = width;
            Context context = this.f158275e;
            View view = this.f158274d;
            Bitmap bitmap = this.f158276f;
            String str = this.f158277g;
            ((C119157j) C119157j.f356862d).mo183870a(new C55591f(bitmap, height, i, str, context, view));
        }
    }

    /* renamed from: a */
    public final Bitmap mo77113a(boolean z, Bitmap bitmap) {
        C87412m.m108594g(bitmap, "bm");
        Log.m105920e("MicroMsg.Mv.MusicMvUIUtil", "addGradientDrawableToBitmap, start ");
        long currentTimeMillis = System.currentTimeMillis();
        int[] iArr = {-1711802377, -134744073};
        if (z) {
            iArr = new int[]{-1289542877, -232578269};
        }
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.BL_TR, iArr);
        gradientDrawable.setGradientType(0);
        gradientDrawable.setBounds(0, 0, bitmap.getWidth(), bitmap.getHeight());
        gradientDrawable.draw(new Canvas(bitmap));
        String format = String.format(" addGradientDrawableToBitmap end, cost:%d", Arrays.copyOf(new Object[]{Long.valueOf(System.currentTimeMillis() - currentTimeMillis)}, 1));
        C87412m.m108593f(format, "format(format, *args)");
        Log.m105920e("MicroMsg.Mv.MusicMvUIUtil", format);
        return bitmap;
    }

    /* renamed from: b */
    public final void mo77114b(Context context, View view, Bitmap bitmap, String str) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(bitmap, "bitmap");
        C87412m.m108594g(str, "md5Key");
        if (view != null) {
            Bitmap e = C20828a.m22825b().mo32516e(str);
            if (e != null && !e.isRecycled()) {
                C61926c.m72668M(new C55594a(context, e, view));
            } else if (view.getWidth() <= 0 || view.getHeight() <= 0) {
                view.post(new C55595b(view, context, bitmap, str));
            } else {
                int width = view.getWidth();
                int height = view.getHeight();
                ((C119157j) C119157j.f356862d).mo183870a(new C55591f(bitmap, height, width, str, context, view));
            }
        }
    }
}
