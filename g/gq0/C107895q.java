package gq0;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.MenuItem;
import android.view.View;
import com.tencent.p014mm.plugin.appbrand.openmaterial.model.AppBrandOpenMaterialCollection;
import com.tencent.p014mm.plugin.appbrand.openmaterial.model.AppBrandOpenMaterialModel;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import fy3.C32226l;
import gq0.C107885g0;
import gy3.C87412m;
import gy3.C87413o;
import iq0.C98783b;
import java.util.List;
import nj3.C11184p0;
import nj3.C47268j0;
import nj3.C76874e0;
import nj3.C76875f0;
import qo3.C77407n;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;

/* renamed from: gq0.q */
public final class C107895q extends C107894n {

    /* renamed from: j */
    public C107896a f323061j = new C107896a(C107885g0.C45943b.HIDE, true);

    /* renamed from: n */
    public C76874e0 f323062n;

    /* renamed from: o */
    public final C13601g f323063o;

    /* renamed from: gq0.q$a */
    public static final class C107896a {

        /* renamed from: a */
        public final C107885g0.C45943b f323064a;

        /* renamed from: b */
        public final boolean f323065b;

        public C107896a(C107885g0.C45943b bVar, boolean z) {
            C87412m.m108594g(bVar, "type");
            this.f323064a = bVar;
            this.f323065b = z;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C107896a)) {
                return false;
            }
            C107896a aVar = (C107896a) obj;
            return this.f323064a == aVar.f323064a && this.f323065b == aVar.f323065b;
        }

        public int hashCode() {
            int hashCode = this.f323064a.hashCode() * 31;
            boolean z = this.f323065b;
            if (z) {
                z = true;
            }
            return hashCode + (z ? 1 : 0);
        }

        public String toString() {
            return "EnhanceState(type=" + this.f323064a + ", hidden=" + this.f323065b + ')';
        }
    }

    /* renamed from: gq0.q$b */
    public static final class C107897b extends C87413o implements C32224a<C32226l<? super AppBrandOpenMaterialModel, ? extends C13598b0>> {

        /* renamed from: d */
        public final /* synthetic */ C77407n f323066d;

        /* renamed from: e */
        public final /* synthetic */ C45944i0 f323067e;

        /* renamed from: f */
        public final /* synthetic */ Context f323068f;

        /* renamed from: g */
        public final /* synthetic */ AppBrandOpenMaterialCollection f323069g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C107897b(C77407n nVar, C45944i0 i0Var, Context context, AppBrandOpenMaterialCollection appBrandOpenMaterialCollection) {
            super(0);
            this.f323066d = nVar;
            this.f323067e = i0Var;
            this.f323068f = context;
            this.f323069g = appBrandOpenMaterialCollection;
        }

        public Object invoke() {
            return new C107874b0(this.f323066d, this.f323067e, this.f323068f, this.f323069g);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C107895q(C98783b bVar, Context context, C77407n nVar, AppBrandOpenMaterialCollection appBrandOpenMaterialCollection, C107879e0 e0Var, C45944i0 i0Var) {
        super(bVar, context, nVar, appBrandOpenMaterialCollection, e0Var, i0Var);
        C87412m.m108594g(bVar, "openMaterialScene");
        C87412m.m108594g(context, "context");
        C87412m.m108594g(nVar, "bottomSheet");
        C87412m.m108594g(appBrandOpenMaterialCollection, "openMaterialCollection");
        C87412m.m108594g(i0Var, "launchAppBrandExecutor");
        this.f323063o = C36568h.m40985a(new C107897b(nVar, i0Var, context, appBrandOpenMaterialCollection));
    }

    /* renamed from: a */
    public static final boolean m146188a(C107895q qVar, View view) {
        qVar.getClass();
        if (!view.isShown()) {
            Log.m105928w("MicroMsg.AppBrand.GridBottomSheetEnhanceLogic", "isViewExposure view is not shown");
            return false;
        }
        Rect rect = new Rect();
        view.getGlobalVisibleRect(rect);
        if (rect.width() >= view.getMeasuredWidth()) {
            return true;
        }
        Log.m105924i("MicroMsg.AppBrand.GridBottomSheetEnhanceLogic", "isViewExposure, view is visible but not exposure");
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x017a  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0189  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0198 A[SYNTHETIC] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo158329b(boolean r30) {
        /*
            r29 = this;
            r0 = r29
            r1 = r30
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "enhance, enable: "
            r2.append(r3)
            r2.append(r1)
            java.lang.String r2 = r2.toString()
            java.lang.String r4 = "MicroMsg.AppBrand.GridBottomSheetEnhanceLogic"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r4, r2)
            gq0.q$a r2 = r0.f323061j
            boolean r2 = r2.f323065b
            r5 = 0
            if (r2 == 0) goto L_0x020c
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r3)
            r2.append(r1)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r4, r2)
            gq0.z r2 = gq0.C76023z.f222890a
            qo3.n r3 = r0.f323056e
            java.lang.String r6 = "convertOpenMaterialCollection2Menu"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r4, r6)
            nj3.e0 r6 = new nj3.e0
            android.content.Context r7 = r0.f323055d
            r6.<init>(r7)
            com.tencent.mm.plugin.appbrand.openmaterial.model.AppBrandOpenMaterialCollection r7 = r0.f323057f
            java.util.List<com.tencent.mm.plugin.appbrand.openmaterial.model.AppBrandOpenMaterialModel> r7 = r7.f311216e
            java.lang.String r8 = "openMaterialCollection.appBrandOpenMaterialModels"
            gy3.C87412m.m108593f(r7, r8)
            int r8 = r7.size()
            r9 = 2147483647(0x7fffffff, float:NaN)
            if (r8 <= r9) goto L_0x0058
            r8 = 2147483647(0x7fffffff, float:NaN)
        L_0x0058:
            r9 = 0
        L_0x0059:
            if (r9 >= r8) goto L_0x01b0
            java.lang.Object r12 = r7.get(r9)
            java.lang.String r13 = "myOpenMaterialModels[i]"
            gy3.C87412m.m108593f(r12, r13)
            com.tencent.mm.plugin.appbrand.openmaterial.model.AppBrandOpenMaterialModel r12 = (com.tencent.p014mm.plugin.appbrand.openmaterial.model.AppBrandOpenMaterialModel) r12
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r14 = "convertOpenMaterialModel2MenuItem, index: "
            r13.append(r14)
            r13.append(r9)
            java.lang.String r14 = ", openMaterialModel: "
            r13.append(r14)
            r13.append(r12)
            java.lang.String r13 = r13.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r4, r13)
            nj3.f0 r13 = new nj3.f0
            android.content.Context r14 = r0.f323055d
            r13.<init>(r14, r9, r5)
            java.lang.String r14 = r12.f311227i
            if (r14 == 0) goto L_0x0096
            int r15 = r14.length()
            if (r15 != 0) goto L_0x0094
            goto L_0x0096
        L_0x0094:
            r15 = 0
            goto L_0x0097
        L_0x0096:
            r15 = 1
        L_0x0097:
            java.lang.String r10 = "functionName"
            if (r15 == 0) goto L_0x00b5
            gq0.l0 r11 = new gq0.l0
            java.lang.String r14 = r12.f311226h
            gy3.C87412m.m108593f(r14, r10)
            r23 = 0
            r24 = 0
            r25 = 6
            r26 = 0
            r21 = r11
            r22 = r14
            r21.<init>(r22, r23, r24, r25, r26)
        L_0x00b1:
            r22 = r7
            goto L_0x014e
        L_0x00b5:
            java.lang.String r15 = r12.f311226h
            gy3.C87412m.m108593f(r15, r10)
            r17 = 0
            r18 = 0
            r19 = 6
            r20 = 0
            r16 = r14
            int r15 = z04.C112550d0.m153769E(r15, r16, r17, r18, r19, r20)
            r11 = -1
            if (r11 != r15) goto L_0x00e2
            gq0.l0 r11 = new gq0.l0
            java.lang.String r14 = r12.f311226h
            gy3.C87412m.m108593f(r14, r10)
            r23 = 0
            r24 = 0
            r25 = 6
            r26 = 0
            r21 = r11
            r22 = r14
            r21.<init>(r22, r23, r24, r25, r26)
            goto L_0x00b1
        L_0x00e2:
            int r11 = r14.length()
            int r11 = r11 + r15
            java.lang.String r5 = r12.f311226h
            int r5 = r5.length()
            r22 = r7
            java.lang.String r7 = "this as java.lang.String…ing(startIndex, endIndex)"
            if (r11 != r5) goto L_0x012b
            if (r15 == 0) goto L_0x0114
            gq0.l0 r11 = new gq0.l0
            java.lang.String r5 = r12.f311226h
            gy3.C87412m.m108593f(r5, r10)
            r10 = 0
            java.lang.String r5 = r5.substring(r10, r15)
            gy3.C87412m.m108593f(r5, r7)
            r18 = 0
            r19 = 4
            r20 = 0
            r15 = r11
            r16 = r5
            r17 = r14
            r15.<init>(r16, r17, r18, r19, r20)
            goto L_0x014e
        L_0x0114:
            gq0.l0 r11 = new gq0.l0
            java.lang.String r5 = r12.f311226h
            gy3.C87412m.m108593f(r5, r10)
            r25 = 0
            r26 = 0
            r27 = 6
            r28 = 0
            r23 = r11
            r24 = r5
            r23.<init>(r24, r25, r26, r27, r28)
            goto L_0x014e
        L_0x012b:
            gq0.l0 r5 = new gq0.l0
            java.lang.String r14 = r12.f311226h
            gy3.C87412m.m108593f(r14, r10)
            r15 = 0
            java.lang.String r14 = r14.substring(r15, r11)
            gy3.C87412m.m108593f(r14, r7)
            java.lang.String r7 = r12.f311226h
            gy3.C87412m.m108593f(r7, r10)
            java.lang.String r7 = r7.substring(r11)
            java.lang.String r10 = "this as java.lang.String).substring(startIndex)"
            gy3.C87412m.m108593f(r7, r10)
            r10 = 1
            r5.<init>(r14, r7, r10)
            r11 = r5
        L_0x014e:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r7 = "convertOpenMaterialModel2MenuItem, functionName: "
            r5.append(r7)
            java.lang.String r7 = r12.f311226h
            r5.append(r7)
            java.lang.String r7 = ", rawFunctionName2Show: "
            r5.append(r7)
            r5.append(r11)
            java.lang.String r5 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r5)
            r13.f224728w = r11
            java.lang.String r5 = r12.f311225g
            android.graphics.drawable.Drawable r7 = lb0.C88393a.m110230a()
            x2.c r7 = (p1162x2.C112021c) r7
            android.graphics.Bitmap r7 = r7.f335330a
            if (r7 == 0) goto L_0x0187
            android.graphics.drawable.BitmapDrawable r10 = new android.graphics.drawable.BitmapDrawable
            android.graphics.Bitmap r7 = r0.mo158331f(r7)
            r10.<init>(r7)
            r7 = 0
            r13.mo107180e(r10, r7)
        L_0x0187:
            if (r5 == 0) goto L_0x0198
            java.lang.String r7 = lb0.C88394b.f255384g
            lb0.b r7 = lb0.C88394b.C88418q.f255427a
            gq0.r r10 = new gq0.r
            r10.<init>(r13, r0)
            lb0.k r11 = lb0.C88431k.f255437d
            r14 = 0
            r7.mo122797p(r10, r5, r11, r14)
        L_0x0198:
            gq0.s r5 = new gq0.s
            r5.<init>(r0, r12)
            r13.f224729x = r5
            gq0.t r5 = new gq0.t
            r5.<init>(r0, r12)
            r13.f224710D = r5
            r6.mo107174t(r13)
            int r9 = r9 + 1
            r7 = r22
            r5 = 0
            goto L_0x0059
        L_0x01b0:
            r0.f323062n = r6
            gq0.u r4 = gq0.C8374u.f27364d
            gq0.v r5 = gq0.C8375v.f27365a
            r3.mo107556a(r6, r4, r5)
            qo3.n r3 = r0.f323056e
            r3.f225723C = r2
            com.tencent.mm.plugin.appbrand.openmaterial.model.AppBrandOpenMaterialCollection r3 = r0.f323057f
            java.util.List<com.tencent.mm.plugin.appbrand.openmaterial.model.AppBrandOpenMaterialDetailModel> r3 = r3.f311217f
            java.lang.String r4 = "openMaterialCollection.a…dOpenMaterialDetailModels"
            gy3.C87412m.m108593f(r3, r4)
            boolean r3 = r3.isEmpty()
            r4 = 1
            r3 = r3 ^ r4
            if (r3 == 0) goto L_0x0208
            qo3.n r3 = r0.f323056e
            gq0.w r5 = new gq0.w
            r5.<init>(r0)
            android.content.Context r6 = r0.f323055d
            r7 = 2131821220(0x7f1102a4, float:1.9275177E38)
            java.lang.String r6 = r6.getString(r7)
            gq0.x r7 = gq0.C8376x.f27366a
            gq0.y r8 = new gq0.y
            r8.<init>(r0)
            r3.f225800x0 = r4
            r3.f225797w = r5
            r3.f225801x1 = r4
            r3.f225806z1 = r6
            r3.f225720A1 = r7
            r3.f225722B1 = r2
            r3.f225724C1 = r8
            boolean r2 = r3.f225726D1
            if (r2 == 0) goto L_0x01f8
            goto L_0x0208
        L_0x01f8:
            androidx.recyclerview.widget.RecyclerView r2 = r3.f225751W0
            if (r2 == 0) goto L_0x0208
            qo3.n$s r4 = new qo3.n$s
            r5 = 0
            r4.<init>(r5)
            r2.mo17043c(r4)
            r2 = 1
            r3.f225726D1 = r2
        L_0x0208:
            r29.mo158330c(r30)
            goto L_0x020f
        L_0x020c:
            r29.mo158330c(r30)
        L_0x020f:
            gq0.q$a r2 = new gq0.q$a
            if (r1 == 0) goto L_0x0216
            gq0.g0$b r1 = gq0.C107885g0.C45943b.ENABLE
            goto L_0x0218
        L_0x0216:
            gq0.g0$b r1 = gq0.C107885g0.C45943b.DISABLE
        L_0x0218:
            r3 = 0
            r2.<init>(r1, r3)
            r0.f323061j = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: gq0.C107895q.mo158329b(boolean):void");
    }

    /* renamed from: c */
    public final void mo158330c(boolean z) {
        List<MenuItem> list;
        C76874e0 e0Var = this.f323062n;
        if (!(e0Var == null || (list = e0Var.f224704d) == null)) {
            for (MenuItem menuItem : list) {
                C76875f0 f0Var = menuItem instanceof C76875f0 ? (C76875f0) menuItem : null;
                if (f0Var != null) {
                    f0Var.f224722q = !z;
                }
            }
        }
        this.f323056e.f225804y1 = z;
    }

    /* renamed from: f */
    public final Bitmap mo158331f(Bitmap bitmap) {
        int width = bitmap.getWidth();
        int i = width / 14;
        int i2 = (i * 2) + width;
        Log.m105924i("MicroMsg.AppBrand.GridBottomSheetEnhanceLogic", "wrapIconWithPadding, sideLen: " + width + ", padding: " + i + ", newSideLen: " + i2);
        Bitmap createBitmap = Bitmap.createBitmap(i2, i2, bitmap.getConfig());
        float f = (float) i;
        new Canvas(createBitmap).drawBitmap(bitmap, f, f, (Paint) null);
        C87412m.m108593f(createBitmap, "newIcon");
        return createBitmap;
    }

    /* renamed from: o */
    public void mo158311o(C107885g0.C45943b bVar) {
        C87412m.m108594g(bVar, "newEnhanceType");
        Log.m105924i("MicroMsg.AppBrand.GridBottomSheetEnhanceLogic", "enhance, newEnhanceType: " + bVar + ", curEnhanceState: " + this.f323061j);
        if (this.f323061j.f323064a != bVar) {
            int ordinal = bVar.ordinal();
            if (ordinal == 0) {
                mo158329b(true);
            } else if (ordinal == 1) {
                mo158329b(false);
            } else if (ordinal == 2) {
                Log.m105918d("MicroMsg.AppBrand.GridBottomSheetEnhanceLogic", "revokeEnhance");
                this.f323056e.mo107556a(new C76874e0(this.f323055d), (C11184p0) null, (C47268j0) null);
                C77407n nVar = this.f323056e;
                nVar.f225723C = null;
                C107876c0 c0Var = C107876c0.f323035a;
                nVar.f225800x0 = false;
                nVar.f225797w = c0Var;
                nVar.f225804y1 = false;
                this.f323061j = new C107896a(C107885g0.C45943b.HIDE, true);
            }
            if (this.f323056e.mo107563h()) {
                C98168o.m126816b(this.f323056e, this.f323055d);
            }
        }
    }
}
