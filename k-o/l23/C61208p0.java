package l23;

import a14.C0000n0;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import com.tencent.p014mm.plugin.gallery.model.C93947c;
import com.tencent.p014mm.plugin.gallery.model.C93958f;
import com.tencent.p014mm.plugin.gallery.model.C93974o;
import com.tencent.p014mm.plugin.gallery.model.GalleryItem$MediaItem;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import f72.C97842b;
import fy3.C32227p;
import gy3.C8479f0;
import kotlin.ResultKt;
import rx3.C13598b0;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.vlog.ui.plugin.ThumbLoadingPlugin$showThumbLoading$1", mo125469f = "ThumbLoadingPlugin.kt", mo125470l = {54, 60, 83}, mo125471m = "invokeSuspend")
/* renamed from: l23.p0 */
public final class C61208p0 extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public Object f174247d;

    /* renamed from: e */
    public Object f174248e;

    /* renamed from: f */
    public int f174249f;

    /* renamed from: g */
    public final /* synthetic */ C61205o0 f174250g;

    /* renamed from: h */
    public final /* synthetic */ int f174251h;

    /* renamed from: i */
    public final /* synthetic */ boolean f174252i;

    /* renamed from: j */
    public final /* synthetic */ GalleryItem$MediaItem f174253j;

    @C91590f(mo125468c = "com.tencent.mm.plugin.vlog.ui.plugin.ThumbLoadingPlugin$showThumbLoading$1$1", mo125469f = "ThumbLoadingPlugin.kt", mo125470l = {}, mo125471m = "invokeSuspend")
    /* renamed from: l23.p0$a */
    public static final class C61209a extends C91594j implements C32227p<C0000n0, C15601d<? super Bitmap>, Object> {

        /* renamed from: d */
        public final /* synthetic */ GalleryItem$MediaItem f174254d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C61209a(GalleryItem$MediaItem galleryItem$MediaItem, C15601d<? super C61209a> dVar) {
            super(2, dVar);
            this.f174254d = galleryItem$MediaItem;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C61209a(this.f174254d, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C61209a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            ResultKt.throwOnFailure(obj);
            return this.f174254d.getType() == 2 ? C97842b.m126300q(this.f174254d.f162747d) : BitmapUtil.getBitmapNative(this.f174254d.f162747d);
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.vlog.ui.plugin.ThumbLoadingPlugin$showThumbLoading$1$2", mo125469f = "ThumbLoadingPlugin.kt", mo125470l = {}, mo125471m = "invokeSuspend")
    /* renamed from: l23.p0$b */
    public static final class C61210b extends C91594j implements C32227p<C0000n0, C15601d<? super Bitmap>, Object> {

        /* renamed from: d */
        public final /* synthetic */ C8479f0<Bitmap> f174255d;

        /* renamed from: e */
        public final /* synthetic */ int f174256e;

        /* renamed from: f */
        public final /* synthetic */ int f174257f;

        /* renamed from: g */
        public final /* synthetic */ Matrix f174258g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C61210b(C8479f0<Bitmap> f0Var, int i, int i2, Matrix matrix, C15601d<? super C61210b> dVar) {
            super(2, dVar);
            this.f174255d = f0Var;
            this.f174256e = i;
            this.f174257f = i2;
            this.f174258g = matrix;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C61210b(this.f174255d, this.f174256e, this.f174257f, this.f174258g, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C61210b) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            ResultKt.throwOnFailure(obj);
            T t = this.f174255d.f27484d;
            int width = (((Bitmap) t).getWidth() - this.f174256e) / 2;
            int height = ((Bitmap) this.f174255d.f27484d).getHeight();
            int i = this.f174257f;
            return Bitmap.createBitmap((Bitmap) t, width, (height - i) / 2, this.f174256e, i, this.f174258g, true);
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.vlog.ui.plugin.ThumbLoadingPlugin$showThumbLoading$1$thumb$1", mo125469f = "ThumbLoadingPlugin.kt", mo125470l = {}, mo125471m = "invokeSuspend")
    /* renamed from: l23.p0$c */
    public static final class C61211c extends C91594j implements C32227p<C0000n0, C15601d<? super Bitmap>, Object> {

        /* renamed from: d */
        public final /* synthetic */ GalleryItem$MediaItem f174259d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C61211c(GalleryItem$MediaItem galleryItem$MediaItem, C15601d<? super C61211c> dVar) {
            super(2, dVar);
            this.f174259d = galleryItem$MediaItem;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C61211c(this.f174259d, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C61211c) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            ResultKt.throwOnFailure(obj);
            C93947c g = C93958f.m118747g();
            GalleryItem$MediaItem galleryItem$MediaItem = this.f174259d;
            String str = galleryItem$MediaItem.f162747d;
            return g.mo128877e(str, str, galleryItem$MediaItem.f162751h, (C93974o.C93980f) null, galleryItem$MediaItem.f162752i);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C61208p0(C61205o0 o0Var, int i, boolean z, GalleryItem$MediaItem galleryItem$MediaItem, C15601d<? super C61208p0> dVar) {
        super(2, dVar);
        this.f174250g = o0Var;
        this.f174251h = i;
        this.f174252i = z;
        this.f174253j = galleryItem$MediaItem;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C61208p0(this.f174250g, this.f174251h, this.f174252i, this.f174253j, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C61208p0) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0096  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0186  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(T r14) {
        /*
            r13 = this;
            xx3.a r0 = xx3.C15911a.COROUTINE_SUSPENDED
            int r1 = r13.f174249f
            r2 = 0
            r3 = 3
            r4 = 2
            java.lang.String r5 = "MicroMsg.ThumbLoadingPlugin"
            r6 = 1
            if (r1 == 0) goto L_0x003f
            if (r1 == r6) goto L_0x0033
            if (r1 == r4) goto L_0x0027
            if (r1 != r3) goto L_0x001f
            java.lang.Object r0 = r13.f174248e
            gy3.f0 r0 = (gy3.C8479f0) r0
            java.lang.Object r1 = r13.f174247d
            gy3.f0 r1 = (gy3.C8479f0) r1
            kotlin.ResultKt.throwOnFailure(r14)
            goto L_0x017d
        L_0x001f:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r0)
            throw r14
        L_0x0027:
            java.lang.Object r1 = r13.f174248e
            gy3.f0 r1 = (gy3.C8479f0) r1
            java.lang.Object r2 = r13.f174247d
            gy3.f0 r2 = (gy3.C8479f0) r2
            kotlin.ResultKt.throwOnFailure(r14)
            goto L_0x0090
        L_0x0033:
            java.lang.Object r1 = r13.f174248e
            gy3.f0 r1 = (gy3.C8479f0) r1
            java.lang.Object r7 = r13.f174247d
            gy3.f0 r7 = (gy3.C8479f0) r7
            kotlin.ResultKt.throwOnFailure(r14)
            goto L_0x0062
        L_0x003f:
            kotlin.ResultKt.throwOnFailure(r14)
            l23.o0 r14 = r13.f174250g
            r14.f174243i = r6
            gy3.f0 r1 = new gy3.f0
            r1.<init>()
            a14.h0 r14 = a14.C53872d1.f151119c
            l23.p0$c r7 = new l23.p0$c
            com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem r8 = r13.f174253j
            r7.<init>(r8, r2)
            r13.f174247d = r1
            r13.f174248e = r1
            r13.f174249f = r6
            java.lang.Object r14 = a14.C53895h.m60469g(r14, r7, r13)
            if (r14 != r0) goto L_0x0061
            return r0
        L_0x0061:
            r7 = r1
        L_0x0062:
            r1.f27484d = r14
            T r14 = r7.f27484d
            if (r14 == 0) goto L_0x0073
            android.graphics.Bitmap r14 = (android.graphics.Bitmap) r14
            boolean r14 = r14.isRecycled()
            if (r14 == 0) goto L_0x0071
            goto L_0x0073
        L_0x0071:
            r2 = r7
            goto L_0x0092
        L_0x0073:
            java.lang.String r14 = "cannot user memory thumb"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r14)
            a14.h0 r14 = a14.C53872d1.f151119c
            l23.p0$a r1 = new l23.p0$a
            com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem r8 = r13.f174253j
            r1.<init>(r8, r2)
            r13.f174247d = r7
            r13.f174248e = r7
            r13.f174249f = r4
            java.lang.Object r14 = a14.C53895h.m60469g(r14, r1, r13)
            if (r14 != r0) goto L_0x008e
            return r0
        L_0x008e:
            r1 = r7
            r2 = r1
        L_0x0090:
            r1.f27484d = r14
        L_0x0092:
            T r14 = r2.f27484d
            if (r14 != 0) goto L_0x00a6
            java.lang.String r14 = "thumb still null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r5, r14)
            l23.o0 r14 = r13.f174250g
            int r0 = r13.f174251h
            r14.mo86129y(r0, r6)
            rx3.b0 r14 = rx3.C13598b0.f38549a
            return r14
        L_0x00a6:
            l23.o0 r1 = r13.f174250g
            android.graphics.Bitmap r14 = (android.graphics.Bitmap) r14
            int r14 = r14.getWidth()
            T r4 = r2.f27484d
            android.graphics.Bitmap r4 = (android.graphics.Bitmap) r4
            int r4 = r4.getHeight()
            boolean r7 = r13.f174252i
            android.content.Context r1 = r1.f174241g
            android.graphics.Point r1 = com.tencent.p014mm.p136ui.C85875k4.m106184h(r1)
            int r8 = r1.y
            float r8 = (float) r8
            int r1 = r1.x
            float r1 = (float) r1
            float r8 = r8 / r1
            float r4 = (float) r4
            r9 = 1065353216(0x3f800000, float:1.0)
            float r10 = r4 * r9
            float r14 = (float) r14
            float r10 = r10 / r14
            if (r7 == 0) goto L_0x00d0
            r7 = r8
            goto L_0x00d2
        L_0x00d0:
            r7 = 1058013184(0x3f100000, float:0.5625)
        L_0x00d2:
            int r11 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r11 >= 0) goto L_0x00dd
            float r1 = r1 * r7
            float r1 = r1 * r9
            float r9 = r1 / r4
            goto L_0x00e5
        L_0x00dd:
            int r4 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r4 <= 0) goto L_0x00e5
            float r1 = r1 * r9
            float r9 = r1 / r14
        L_0x00e5:
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r1 = "calculate thumb scale "
            r14.append(r1)
            r14.append(r9)
            java.lang.String r14 = r14.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r14)
            double r4 = (double) r9
            r7 = 4607173411600762667(0x3feff7ced916872b, double:0.999)
            int r14 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r14 < 0) goto L_0x010c
            r7 = 4607186922399644778(0x3ff004189374bc6a, double:1.001)
            int r14 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r14 <= 0) goto L_0x0180
        L_0x010c:
            android.graphics.Matrix r11 = new android.graphics.Matrix
            r11.<init>()
            r11.reset()
            l23.o0 r14 = r13.f174250g
            T r1 = r2.f27484d
            android.graphics.Bitmap r1 = (android.graphics.Bitmap) r1
            int r1 = r1.getWidth()
            float r4 = (float) r1
            float r4 = r4 * r9
            android.content.Context r5 = r14.f174241g
            android.graphics.Point r5 = com.tencent.p014mm.p136ui.C75054z4.m90003a(r5)
            int r5 = r5.x
            float r5 = (float) r5
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 <= 0) goto L_0x013a
            android.content.Context r14 = r14.f174241g
            android.graphics.Point r14 = com.tencent.p014mm.p136ui.C75054z4.m90003a(r14)
            int r14 = r14.x
            float r14 = (float) r14
            float r14 = r14 / r9
            int r14 = (int) r14
            goto L_0x013b
        L_0x013a:
            r14 = r1
        L_0x013b:
            l23.o0 r1 = r13.f174250g
            T r4 = r2.f27484d
            android.graphics.Bitmap r4 = (android.graphics.Bitmap) r4
            int r4 = r4.getHeight()
            float r5 = (float) r4
            float r5 = r5 * r9
            android.content.Context r7 = r1.f174241g
            android.graphics.Point r7 = com.tencent.p014mm.p136ui.C75054z4.m90003a(r7)
            int r7 = r7.y
            float r7 = (float) r7
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 <= 0) goto L_0x0162
            android.content.Context r1 = r1.f174241g
            android.graphics.Point r1 = com.tencent.p014mm.p136ui.C75054z4.m90003a(r1)
            int r1 = r1.y
            float r1 = (float) r1
            float r1 = r1 / r9
            int r1 = (int) r1
            r10 = r1
            goto L_0x0163
        L_0x0162:
            r10 = r4
        L_0x0163:
            a14.h0 r1 = a14.C53872d1.f151119c
            l23.p0$b r4 = new l23.p0$b
            r12 = 0
            r7 = r4
            r8 = r2
            r9 = r14
            r7.<init>(r8, r9, r10, r11, r12)
            r13.f174247d = r2
            r13.f174248e = r2
            r13.f174249f = r3
            java.lang.Object r14 = a14.C53895h.m60469g(r1, r4, r13)
            if (r14 != r0) goto L_0x017b
            return r0
        L_0x017b:
            r0 = r2
            r1 = r0
        L_0x017d:
            r0.f27484d = r14
            r2 = r1
        L_0x0180:
            l23.o0 r14 = r13.f174250g
            int r0 = r14.f174243i
            if (r0 != r6) goto L_0x019e
            android.widget.ImageView r14 = r14.f174240f
            T r0 = r2.f27484d
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0
            r14.setImageBitmap(r0)
            l23.o0 r14 = r13.f174250g
            android.widget.ImageView r14 = r14.f174240f
            r0 = 0
            r14.setVisibility(r0)
            l23.o0 r14 = r13.f174250g
            int r0 = r13.f174251h
            r14.mo86129y(r0, r6)
        L_0x019e:
            rx3.b0 r14 = rx3.C13598b0.f38549a
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: l23.C61208p0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
