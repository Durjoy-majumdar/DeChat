package com.tencent.p014mm.plugin.gallery.picker.view;

import a70.C112760b;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74783i3;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.MMActivityController;
import com.tencent.p014mm.p136ui.widget.cropview.CropLayout;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.plugin.gallery.picker.view.WxMediaCropLayout;
import com.tencent.p014mm.plugin.recordvideo.p095ui.WxCropOperationLayout;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.BackwardSupportUtil;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.C86013q1;
import fy3.C32224a;
import fy3.C32227p;
import fy3.C32228q;
import gy3.C87412m;
import gy3.C87413o;
import kotlin.Metadata;
import lw1.C99685b;
import nw1.C11277a;
import nw1.C11285e;
import nw1.C11286f;
import nw1.C11287g;
import nw1.C11288h;
import nw1.C11289i;
import nw1.C11290j;
import nw1.C11291k;
import nw1.C11294n;
import nw1.C11295o;
import nw1.C11298r;
import o40.C61926c;
import p823sg.C90193h;
import qo3.C89779i0;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import vo3.C90852c;
import z04.C119027c;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/gallery/picker/view/ImageCropUI;", "Lcom/tencent/mm/ui/MMActivity;", "<init>", "()V", "plugin-gallery_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
@C90852c(0)
/* renamed from: com.tencent.mm.plugin.gallery.picker.view.ImageCropUI */
public final class ImageCropUI extends MMActivity {

    /* renamed from: D */
    public static final /* synthetic */ int f19098D = 0;

    /* renamed from: A */
    public int f19099A;

    /* renamed from: B */
    public final C32228q<String, ImageView, C32227p<? super Integer, ? super Integer, ? extends Object>, Object> f19100B = new C4421i(this);

    /* renamed from: C */
    public final C32228q<String, ImageView, C32227p<? super Integer, ? super Integer, ? extends Object>, Object> f19101C = new C4418f(this);

    /* renamed from: d */
    public final C13601g f19102d = C36568h.m40985a(new C4416d(this));

    /* renamed from: e */
    public final C13601g f19103e = C36568h.m40985a(new C4422j(this));

    /* renamed from: f */
    public final C13601g f19104f = C36568h.m40985a(new C4417e(this));

    /* renamed from: g */
    public final C13601g f19105g = C36568h.m40985a(new C4413a(this));

    /* renamed from: h */
    public final C13601g f19106h = C36568h.m40985a(new C4414b(this));

    /* renamed from: i */
    public final C13601g f19107i = C36568h.m40985a(new C4424l(this));

    /* renamed from: j */
    public final C13601g f19108j = C36568h.m40985a(new C4423k(this));

    /* renamed from: n */
    public final C13601g f19109n = C36568h.m40985a(new C4419g(this));

    /* renamed from: o */
    public final C13601g f19110o = C36568h.m40985a(new C4415c(this));

    /* renamed from: p */
    public String f19111p = "";

    /* renamed from: q */
    public Bitmap f19112q;

    /* renamed from: r */
    public final C13601g f19113r = C36568h.m40985a(new C4420h(this));

    /* renamed from: s */
    public C89779i0 f19114s;

    /* renamed from: t */
    public C99685b f19115t;

    /* renamed from: u */
    public boolean f19116u;

    /* renamed from: v */
    public int f19117v;

    /* renamed from: w */
    public boolean f19118w;

    /* renamed from: x */
    public int[] f19119x;

    /* renamed from: y */
    public Bitmap f19120y;

    /* renamed from: z */
    public boolean f19121z;

    /* renamed from: com.tencent.mm.plugin.gallery.picker.view.ImageCropUI$a */
    public static final class C4413a extends C87413o implements C32224a<Button> {

        /* renamed from: d */
        public final /* synthetic */ ImageCropUI f19122d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C4413a(ImageCropUI imageCropUI) {
            super(0);
            this.f19122d = imageCropUI;
        }

        public Object invoke() {
            return (Button) this.f19122d.findViewById(C0966R.C0970id.f3u);
        }
    }

    /* renamed from: com.tencent.mm.plugin.gallery.picker.view.ImageCropUI$b */
    public static final class C4414b extends C87413o implements C32224a<Button> {

        /* renamed from: d */
        public final /* synthetic */ ImageCropUI f19123d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C4414b(ImageCropUI imageCropUI) {
            super(0);
            this.f19123d = imageCropUI;
        }

        public Object invoke() {
            return (Button) this.f19123d.findViewById(C0966R.C0970id.f3v);
        }
    }

    /* renamed from: com.tencent.mm.plugin.gallery.picker.view.ImageCropUI$c */
    public static final class C4415c extends C87413o implements C32224a<Integer> {

        /* renamed from: d */
        public final /* synthetic */ ImageCropUI f19124d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C4415c(ImageCropUI imageCropUI) {
            super(0);
            this.f19124d = imageCropUI;
        }

        public Object invoke() {
            return Integer.valueOf(this.f19124d.getIntent().getIntExtra("CropImageMode", 0));
        }
    }

    /* renamed from: com.tencent.mm.plugin.gallery.picker.view.ImageCropUI$d */
    public static final class C4416d extends C87413o implements C32224a<WxMediaCropLayout> {

        /* renamed from: d */
        public final /* synthetic */ ImageCropUI f19125d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C4416d(ImageCropUI imageCropUI) {
            super(0);
            this.f19125d = imageCropUI;
        }

        public Object invoke() {
            return (WxMediaCropLayout) this.f19125d.findViewById(C0966R.C0970id.f3w);
        }
    }

    /* renamed from: com.tencent.mm.plugin.gallery.picker.view.ImageCropUI$e */
    public static final class C4417e extends C87413o implements C32224a<LinearLayout> {

        /* renamed from: d */
        public final /* synthetic */ ImageCropUI f19126d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C4417e(ImageCropUI imageCropUI) {
            super(0);
            this.f19126d = imageCropUI;
        }

        public Object invoke() {
            return (LinearLayout) this.f19126d.findViewById(C0966R.C0970id.f3z);
        }
    }

    /* renamed from: com.tencent.mm.plugin.gallery.picker.view.ImageCropUI$f */
    public static final class C4418f extends C87413o implements C32228q<String, ImageView, C32227p<? super Integer, ? super Integer, ? extends Object>, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ ImageCropUI f19127d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C4418f(ImageCropUI imageCropUI) {
            super(3);
            this.f19127d = imageCropUI;
        }

        public Object invoke(Object obj, Object obj2, Object obj3) {
            String str = (String) obj;
            ImageView imageView = (ImageView) obj2;
            C32227p pVar = (C32227p) obj3;
            C87412m.m108594g(str, "mediaPath");
            C87412m.m108594g(imageView, "imageView");
            C87412m.m108594g(pVar, "loadedCallback");
            C61926c.m72656A((String) null, new C4428b(str, this.f19127d, imageView, pVar));
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.gallery.picker.view.ImageCropUI$g */
    public static final class C4419g extends C87413o implements C32224a<String> {

        /* renamed from: d */
        public final /* synthetic */ ImageCropUI f19128d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C4419g(ImageCropUI imageCropUI) {
            super(0);
            this.f19128d = imageCropUI;
        }

        public Object invoke() {
            String stringExtra = this.f19128d.getIntent().getStringExtra("CropImage_ImgPath");
            return stringExtra == null ? "" : stringExtra;
        }
    }

    /* renamed from: com.tencent.mm.plugin.gallery.picker.view.ImageCropUI$h */
    public static final class C4420h extends C87413o implements C32224a<String> {

        /* renamed from: d */
        public final /* synthetic */ ImageCropUI f19129d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C4420h(ImageCropUI imageCropUI) {
            super(0);
            this.f19129d = imageCropUI;
        }

        public Object invoke() {
            String stringExtra = this.f19129d.getIntent().getStringExtra("CropImage_OutputPath");
            if (stringExtra != null) {
                return stringExtra;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(C112760b.m154240l());
            StringBuilder sb4 = new StringBuilder();
            ImageCropUI imageCropUI = this.f19129d;
            int i = ImageCropUI.f19098D;
            sb4.append(imageCropUI.mo5348L7());
            sb4.append(System.currentTimeMillis());
            byte[] bytes = sb4.toString().getBytes(C119027c.f356488a);
            C87412m.m108593f(bytes, "this as java.lang.String).getBytes(charset)");
            sb.append(C90193h.m112878f(bytes));
            sb.append("_crop.jpg");
            return sb.toString();
        }
    }

    /* renamed from: com.tencent.mm.plugin.gallery.picker.view.ImageCropUI$i */
    public static final class C4421i extends C87413o implements C32228q<String, ImageView, C32227p<? super Integer, ? super Integer, ? extends Object>, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ ImageCropUI f19130d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C4421i(ImageCropUI imageCropUI) {
            super(3);
            this.f19130d = imageCropUI;
        }

        public Object invoke(Object obj, Object obj2, Object obj3) {
            String str = (String) obj;
            ImageView imageView = (ImageView) obj2;
            C32227p pVar = (C32227p) obj3;
            C87412m.m108594g(str, "imgPath");
            C87412m.m108594g(imageView, "imgView");
            C87412m.m108594g(pVar, "loadedCallback");
            Log.m105924i("MicroMsg.AvatarCropUI", "enter previewMatting");
            C61926c.m72656A((String) null, new C4431e(str, this.f19130d, imageView, pVar));
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.gallery.picker.view.ImageCropUI$j */
    public static final class C4422j extends C87413o implements C32224a<ImageView> {

        /* renamed from: d */
        public final /* synthetic */ ImageCropUI f19131d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C4422j(ImageCropUI imageCropUI) {
            super(0);
            this.f19131d = imageCropUI;
        }

        public Object invoke() {
            return (ImageView) this.f19131d.findViewById(C0966R.C0970id.f358437f40);
        }
    }

    /* renamed from: com.tencent.mm.plugin.gallery.picker.view.ImageCropUI$k */
    public static final class C4423k extends C87413o implements C32224a<WeImageView> {

        /* renamed from: d */
        public final /* synthetic */ ImageCropUI f19132d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C4423k(ImageCropUI imageCropUI) {
            super(0);
            this.f19132d = imageCropUI;
        }

        public Object invoke() {
            return (WeImageView) this.f19132d.findViewById(C0966R.C0970id.f3x);
        }
    }

    /* renamed from: com.tencent.mm.plugin.gallery.picker.view.ImageCropUI$l */
    public static final class C4424l extends C87413o implements C32224a<WeImageView> {

        /* renamed from: d */
        public final /* synthetic */ ImageCropUI f19133d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C4424l(ImageCropUI imageCropUI) {
            super(0);
            this.f19133d = imageCropUI;
        }

        public Object invoke() {
            return (WeImageView) this.f19133d.findViewById(C0966R.C0970id.f3y);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0087, code lost:
        if (r2 == null) goto L_0x008d;
     */
    /* renamed from: H7 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m4581H7(com.tencent.p014mm.plugin.gallery.picker.view.ImageCropUI r15) {
        /*
            java.lang.String r0 = r15.mo5348L7()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x00cb
            boolean r0 = r15.f19116u
            if (r0 == 0) goto L_0x0010
            goto L_0x00cb
        L_0x0010:
            r0 = 1
            r15.f19116u = r0
            r15.mo5352P7()
            ds.m$a r0 = new ds.m$a
            r0.<init>()
            r1 = 100
            r0.f25771f = r1
            r1 = 940(0x3ac, float:1.317E-42)
            r0.f25770e = r1
            r0.f25769d = r1
            java.lang.String r1 = r15.mo5349M7()
            r0.f25768c = r1
            java.lang.String r1 = "MicroMsg.AvatarCropUI"
            java.lang.String r2 = "get avatar/cover config"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r2)
            com.tencent.mm.plugin.gallery.picker.view.WxMediaCropLayout r1 = r15.mo5346J7()
            com.tencent.mm.plugin.gallery.picker.view.WxMediaCropLayout$a r1 = r1.getCurrentCropInfo()
            java.lang.String r2 = r15.mo5348L7()
            boolean r2 = com.tencent.p014mm.vfs.C86013q1.m106450k(r2)
            if (r2 == 0) goto L_0x004a
            java.lang.String r2 = r15.mo5348L7()
        L_0x0048:
            r4 = r2
            goto L_0x0090
        L_0x004a:
            android.graphics.Bitmap r2 = r15.f19112q
            if (r2 == 0) goto L_0x008d
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.Class<a70.b> r4 = a70.C112760b.class
            monitor-enter(r4)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x008a }
            r5.<init>()     // Catch:{ all -> 0x008a }
            java.lang.String r6 = a70.C112760b.m154195C()     // Catch:{ all -> 0x008a }
            r5.append(r6)     // Catch:{ all -> 0x008a }
            java.lang.String r6 = "image_crop/"
            r5.append(r6)     // Catch:{ all -> 0x008a }
            java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x008a }
            monitor-exit(r4)
            r3.append(r5)
            long r4 = java.lang.System.currentTimeMillis()
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r4 = 0
            boolean r2 = r15.mo5351O7(r3, r2, r4)
            if (r2 == 0) goto L_0x0085
            r15.f19111p = r3
            r2 = r3
            goto L_0x0087
        L_0x0085:
            java.lang.String r2 = ""
        L_0x0087:
            if (r2 != 0) goto L_0x0048
            goto L_0x008d
        L_0x008a:
            r15 = move-exception
            monitor-exit(r4)
            throw r15
        L_0x008d:
            java.lang.String r2 = ""
            goto L_0x0048
        L_0x0090:
            java.lang.String r2 = "if (VFSFileOp.fileExists…  saveImg()\n            }"
            gy3.C87412m.m108593f(r4, r2)
            java.lang.String r2 = "MicroMsg.AvatarCropUI"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r5 = "input path: "
            r3.append(r5)
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r3)
            lw1.b r2 = new lw1.b
            r2.<init>(r0)
            r5 = 1
            android.graphics.Matrix r6 = r1.mo5354a()
            android.graphics.Rect r7 = r1.f19139f
            android.graphics.Rect r8 = r1.f19142i
            android.graphics.Rect r9 = r1.f19141h
            r10 = 0
            r11 = 0
            nw1.d r12 = new nw1.d
            r12.<init>(r15)
            r13 = 128(0x80, float:1.794E-43)
            r14 = 0
            r3 = r2
            p143ds.C7510m.C7511b.m7645a(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            r15.f19115t = r2
        L_0x00cb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.gallery.picker.view.ImageCropUI.m4581H7(com.tencent.mm.plugin.gallery.picker.view.ImageCropUI):void");
    }

    /* renamed from: I7 */
    public static final void m4582I7(ImageCropUI imageCropUI, int i, int i2) {
        ImageCropUI imageCropUI2 = imageCropUI;
        imageCropUI.getClass();
        if (i == 0 || i2 == 0) {
            Log.m105924i("ImageCropReport", "inc: 8");
            C115669n.INSTANCE.mo175913w(1361, (long) 8, 1);
            imageCropUI2.setResult(-1);
            imageCropUI.finish();
            return;
        }
        int exifOrientation = BackwardSupportUtil.ExifHelper.getExifOrientation(imageCropUI.mo5348L7());
        imageCropUI2.f19117v = exifOrientation;
        int i3 = (exifOrientation == 90 || exifOrientation == 270) ? i2 : i;
        int i4 = (exifOrientation == 90 || exifOrientation == 270) ? i : i2;
        C11277a aVar = C11277a.f33206a;
        aVar.mo11333a(4);
        aVar.mo11334b(14);
        aVar.mo11333a(13);
        Log.m105924i("MicroMsg.AvatarCropUI", "preview background");
        Bitmap extractThumbNail = BitmapUtil.extractThumbNail(imageCropUI.mo5348L7(), i4, i3, true);
        ImageView imageView = null;
        Bitmap rotate = extractThumbNail != null ? BitmapUtil.rotate(extractThumbNail, (float) imageCropUI2.f19117v) : null;
        if (rotate != null) {
            Log.m105924i("MicroMsg.AvatarCropUI", "background image decode successful");
            aVar.mo11334b(20);
            aVar.mo11333a(19);
            imageView = imageCropUI.mo5350N7();
            int width = rotate.getWidth();
            int height = rotate.getHeight();
            int width2 = imageView.getWidth();
            int height2 = imageView.getHeight();
            Matrix matrix = new Matrix();
            matrix.reset();
            float f = (float) width;
            float f2 = (float) width2;
            float f3 = f / f2;
            float f4 = (float) height;
            float f5 = (float) height2;
            float f6 = f4 / f5;
            if (f3 >= f6) {
                f3 = f6;
            }
            if (width2 > height2) {
                f2 = f5;
            }
            float f7 = f2 / f;
            float f8 = f2 / f4;
            if (f7 <= f8) {
                f7 = f8;
            }
            if (((double) f3) < 1.0d) {
                matrix.postScale(f7, f7);
            }
            imageView.setImageMatrix(matrix);
            imageView.setImageBitmap(rotate);
        }
        if (imageView == null) {
            Log.m105924i("MicroMsg.AvatarCropUI", "background image decode fail");
            aVar.mo11333a(8);
            imageCropUI2.setResult(-1);
            imageCropUI.finish();
        }
    }

    /* renamed from: J7 */
    public final WxMediaCropLayout mo5346J7() {
        return (WxMediaCropLayout) ((C36570n) this.f19102d).getValue();
    }

    /* renamed from: K7 */
    public final RectF mo5347K7() {
        C74783i3.C6978a a = C74783i3.m89537a((Context) null);
        float dimension = ((float) a.f24704a) - getContext().getResources().getDimension(C0966R.dimen.f3755d6);
        float f = (float) 2;
        float f2 = (((float) a.f24705b) - dimension) / f;
        if (this.f19099A != 5) {
            return new RectF(getContext().getResources().getDimension(C0966R.dimen.f3743cv), f2, getContext().getResources().getDimension(C0966R.dimen.f3743cv) + dimension, dimension + f2);
        }
        float floatExtra = getIntent().getFloatExtra("CropImage_aspect_ratio", 1.0f);
        float f3 = floatExtra > 0.0f ? (((float) 1) / floatExtra) * dimension : dimension;
        float f4 = (((float) a.f24705b) - f3) / f;
        return new RectF(getContext().getResources().getDimension(C0966R.dimen.f3743cv), f4, getContext().getResources().getDimension(C0966R.dimen.f3743cv) + dimension, f3 + f4);
    }

    /* renamed from: L7 */
    public final String mo5348L7() {
        return (String) ((C36570n) this.f19109n).getValue();
    }

    /* renamed from: M7 */
    public final String mo5349M7() {
        return (String) ((C36570n) this.f19113r).getValue();
    }

    /* renamed from: N7 */
    public final ImageView mo5350N7() {
        return (ImageView) ((C36570n) this.f19103e).getValue();
    }

    /* renamed from: O7 */
    public final boolean mo5351O7(String str, Bitmap bitmap, boolean z) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            BitmapUtil.saveBitmapToImage(bitmap, 100, Bitmap.CompressFormat.JPEG, str, z);
            Log.m105924i("MicroMsg.AvatarCropUI", "saveBitmapToImage successful ");
            return true;
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.AvatarCropUI", e, "", new Object[0]);
            Log.m105920e("MicroMsg.AvatarCropUI", "saveBitmapToImage failed: " + e);
            return false;
        }
    }

    /* renamed from: P7 */
    public final void mo5352P7() {
        C89779i0 i0Var = this.f19114s;
        if (i0Var != null) {
            i0Var.dismiss();
        }
        this.f19114s = C89779i0.m112248e(this, getString(C0966R.string.gas), false, 0, (DialogInterface.OnCancelListener) null);
    }

    public int getLayoutId() {
        return C0966R.C0971layout.f359828b00;
    }

    public void onBackPressed() {
        super.onBackPressed();
        C99685b bVar = this.f19115t;
        if (bVar != null) {
            bVar.f292174d.shutdownNow();
        }
        Log.m105924i("ImageCropReport", "inc: " + 9);
        C115669n.INSTANCE.mo175913w(1361, (long) 9, 1);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f19099A = getIntent().getIntExtra("CropImage_from_scene", 0);
        Log.m105924i("ImageCropReport", "inc: 10");
        C115669n nVar = C115669n.INSTANCE;
        nVar.mo175913w(1361, (long) 10, 1);
        setMMTitle("");
        if (((Number) ((C36570n) this.f19110o).getValue()).intValue() == 1) {
            getWindow().setFlags(201327616, 201327616);
            setLightNavigationbarIcon();
            View findViewById = findViewById(C0966R.C0970id.f358438f41);
            findViewById.setPadding(0, 0, 0, C75044y4.m89991c(getContext()));
            findViewById.post(new C11285e(findViewById, this));
            setActionbarColor(C0966R.color.ahf);
            setActionbarColor(-16777216);
            fullScreenNoTitleBar(true, 0);
            ((LinearLayout) ((C36570n) this.f19104f).getValue()).setVisibility(0);
            ((Button) ((C36570n) this.f19105g).getValue()).setOnClickListener(new C11286f(this));
            ((Button) ((C36570n) this.f19106h).getValue()).setOnClickListener(new C11287g(this));
            ((WeImageView) ((C36570n) this.f19108j).getValue()).setOnClickListener(new C11288h(this));
            ((WeImageView) ((C36570n) this.f19107i).getValue()).setOnClickListener(new C11289i(this));
        } else {
            addTextOptionMenu(0, getString(C0966R.string.f54), new C11290j(this), (View.OnLongClickListener) null, MMActivityController.C73075r.GREEN);
            setBackBtn(new C11291k(this));
        }
        this.f19121z = false;
        mo5352P7();
        int intValue = ((Number) ((C36570n) this.f19110o).getValue()).intValue();
        if (intValue == 1) {
            if (this.f19099A == 3) {
                Log.m105924i("ImageCropReport", "inc: 0");
                nVar.mo175913w(1361, (long) 0, 1);
                Log.m105924i("MicroMsg.AvatarCropUI", "scene avatar");
            } else {
                Log.m105924i("ImageCropReport", "inc: 1");
                nVar.mo175913w(1361, (long) 1, 1);
                Log.m105924i("MicroMsg.AvatarCropUI", "scene cover");
            }
            WxMediaCropLayout J7 = mo5346J7();
            J7.setVisibility(0);
            J7.setShowBorder(false);
            J7.mo150015f(mo5347K7(), WxCropOperationLayout.C94436h.RECT_HARD);
            long currentTimeMillis = System.currentTimeMillis();
            String L7 = mo5348L7();
            C87412m.m108593f(L7, "imgPath");
            WxMediaCropLayout.m141519g(J7, currentTimeMillis, L7, true, (WxMediaCropLayout.C4426b) null, this.f19101C, 8, (Object) null);
        } else if (intValue == 2) {
            Log.m105924i("ImageCropReport", "inc: 2");
            nVar.mo175913w(1361, (long) 2, 1);
            Log.m105924i("MicroMsg.AvatarCropUI", "scene background");
            ImageView N7 = mo5350N7();
            N7.post(new C11295o(N7, this));
        } else if (intValue == 3) {
            Log.m105924i("ImageCropReport", "inc: 3");
            nVar.mo175913w(1361, (long) 3, 1);
            Log.m105924i("MicroMsg.AvatarCropUI", "scene emoji");
            WxMediaCropLayout J72 = mo5346J7();
            J72.setVisibility(0);
            J72.setShowBorder(false);
            J72.setCropLayoutScaleType(CropLayout.C97279e.ALIGN_START);
            J72.mo150025j();
            C61926c.m72656A((String) null, new C11294n(this, J72));
        } else if (intValue == 4) {
            C61926c.m72656A((String) null, new C11298r(this));
        }
    }

    public void onDestroy() {
        super.onDestroy();
        this.f19112q = null;
        if (!TextUtils.isEmpty(this.f19111p) && C86013q1.m106450k(this.f19111p)) {
            C86013q1.m106447h(this.f19111p);
        }
    }

    public void setRequestedOrientation(int i) {
        super.setRequestedOrientation(1);
    }
}
