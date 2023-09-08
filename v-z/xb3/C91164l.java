package xb3;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.View;
import android.view.ViewGroup;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.MMFragmentActivity;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.tmassistantsdk.openSDK.OpenSDKTool4Assistant;
import com.tencent.wxmm.v2helper;
import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import hi3.C87516b;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import kg3.C76577a;
import lg3.C76695c;
import lu3.C88654b;
import p391w3.C22857b;
import p391w3.C22864c;
import rx3.C13598b0;

/* renamed from: xb3.l */
public final class C91164l {

    /* renamed from: a */
    public static final C91164l f261397a = new C91164l();

    /* renamed from: xb3.l$a */
    public static final class C15638a extends C87413o implements C32227p<View, MMFragmentActivity, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ int f42268d;

        /* renamed from: e */
        public final /* synthetic */ String f42269e;

        /* renamed from: f */
        public final /* synthetic */ boolean f42270f;

        /* renamed from: g */
        public final /* synthetic */ int f42271g;

        /* renamed from: h */
        public final /* synthetic */ Integer f42272h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C15638a(int i, String str, boolean z, int i2, Integer num) {
            super(2);
            this.f42268d = i;
            this.f42269e = str;
            this.f42270f = z;
            this.f42271g = i2;
            this.f42272h = num;
        }

        public Object invoke(Object obj, Object obj2) {
            View view = (View) obj;
            MMFragmentActivity mMFragmentActivity = (MMFragmentActivity) obj2;
            if (mMFragmentActivity != null) {
                try {
                    if (!mMFragmentActivity.isFinishing() && !mMFragmentActivity.isDestroyed()) {
                        if (mMFragmentActivity.isSwiping()) {
                        }
                    }
                } catch (Throwable th) {
                    Log.printErrStackTrace("MicroMsg.WcPayReport|WcPayViewExposureReport", th, "", new Object[0]);
                }
                return C13598b0.f38549a;
            }
            if (view == null && mMFragmentActivity != null) {
                int i = this.f42268d;
                String str = this.f42269e;
                if (i != 0) {
                    view = mMFragmentActivity.findViewById(i);
                } else {
                    if ((str.length() > 0) && (mMFragmentActivity.getWindow().getDecorView() instanceof ViewGroup)) {
                        View decorView = mMFragmentActivity.getWindow().getDecorView();
                        C87412m.m108592e(decorView, "null cannot be cast to non-null type android.view.ViewGroup");
                        view = C15632d.m14634a((ViewGroup) decorView, C0966R.C0970id.f359572m92, str, 0);
                    }
                }
            }
            if (view == null) {
                Log.m105928w("MicroMsg.WcPayReport|WcPayViewExposureReport", "can't find target view: " + this.f42268d + ", " + this.f42269e);
            }
            C91164l lVar = C91164l.f261397a;
            int a = C91164l.m114382a(lVar, view, this.f42270f, this.f42271g, this.f42272h);
            String str2 = this.f42269e;
            C87412m.m108594g(str2, "resId");
            if (mMFragmentActivity != null) {
                str2 = mMFragmentActivity.getClass().getSimpleName() + '-' + str2;
            }
            if (mMFragmentActivity == null || (!mMFragmentActivity.isFinishing() && !mMFragmentActivity.isDestroyed() && !mMFragmentActivity.isSwiping())) {
                C91164l.m114383b(lVar, a, str2);
            } else {
                Log.m105928w("MicroMsg.WcPayReport|WcPayViewExposureReport", "activity is finished");
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: xb3.l$b */
    public static final class C15639b extends C88654b {

        /* renamed from: e */
        public final /* synthetic */ String f42273e;

        /* renamed from: f */
        public final /* synthetic */ WeakReference<View> f42274f;

        /* renamed from: g */
        public final /* synthetic */ C32227p<View, MMFragmentActivity, C13598b0> f42275g;

        /* renamed from: h */
        public final /* synthetic */ WeakReference<MMFragmentActivity> f42276h;

        public C15639b(String str, WeakReference<View> weakReference, C32227p<? super View, ? super MMFragmentActivity, C13598b0> pVar, WeakReference<MMFragmentActivity> weakReference2) {
            this.f42273e = str;
            this.f42274f = weakReference;
            this.f42275g = pVar;
            this.f42276h = weakReference2;
        }

        public String getKey() {
            return this.f42273e;
        }

        public void run() {
            Log.m105918d("MicroMsg.WcPayReport|WcPayViewExposureReport", "do func: " + this.f42273e + ", " + this.f42274f.get());
            this.f42275g.invoke(this.f42274f.get(), this.f42276h.get());
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:115:0x02cd A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final int m114382a(xb3.C91164l r18, android.view.View r19, boolean r20, int r21, java.lang.Integer r22) {
        /*
            r0 = r18
            r1 = r19
            r2 = r21
            r18.getClass()
            r4 = 1
            if (r1 == 0) goto L_0x02f8
            boolean r5 = r19.isAttachedToWindow()
            if (r5 == 0) goto L_0x02f8
            android.view.ViewParent r5 = r19.getParent()
            if (r5 != 0) goto L_0x001a
            goto L_0x02f8
        L_0x001a:
            boolean r5 = r19.isShown()
            if (r5 != 0) goto L_0x0023
            r3 = 2
            goto L_0x02f9
        L_0x0023:
            float r5 = r19.getAlpha()
            r6 = 0
            int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r5 != 0) goto L_0x002e
            r5 = 1
            goto L_0x002f
        L_0x002e:
            r5 = 0
        L_0x002f:
            if (r5 == 0) goto L_0x0034
            r3 = 3
            goto L_0x02f9
        L_0x0034:
            android.graphics.Rect r5 = new android.graphics.Rect
            r5.<init>()
            boolean r7 = r1.getGlobalVisibleRect(r5)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "global rect: "
            r8.append(r9)
            r8.append(r5)
            java.lang.String r8 = r8.toString()
            java.lang.String r9 = "MicroMsg.WcPayReport|WcPayViewExposureReport"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r9, r8)
            if (r7 != 0) goto L_0x0058
            r3 = 5
            goto L_0x02f9
        L_0x0058:
            int r7 = r19.getWidth()
            int r8 = r5.width()
            if (r7 > r8) goto L_0x02d1
            int r7 = r19.getHeight()
            int r5 = r5.height()
            if (r7 <= r5) goto L_0x006e
            goto L_0x02d1
        L_0x006e:
            android.graphics.Rect r5 = new android.graphics.Rect
            r5.<init>()
            r1.getGlobalVisibleRect(r5)
            r7 = r1
            r8 = 0
        L_0x0078:
            android.view.ViewParent r10 = r7.getParent()
            boolean r10 = r10 instanceof android.view.ViewGroup
            java.lang.String r11 = ", "
            if (r10 == 0) goto L_0x012f
            r10 = 200(0xc8, float:2.8E-43)
            if (r8 >= r10) goto L_0x012f
            android.view.ViewParent r10 = r7.getParent()
            java.lang.String r12 = "null cannot be cast to non-null type android.view.ViewGroup"
            gy3.C87412m.m108592e(r10, r12)
            android.view.ViewGroup r10 = (android.view.ViewGroup) r10
            if (r22 != 0) goto L_0x0094
            goto L_0x009a
        L_0x0094:
            int r12 = r22.intValue()
            if (r12 == 0) goto L_0x00a9
        L_0x009a:
            int r12 = r10.getId()
            if (r22 != 0) goto L_0x00a1
            goto L_0x00a9
        L_0x00a1:
            int r13 = r22.intValue()
            if (r13 != r12) goto L_0x00a9
            goto L_0x012f
        L_0x00a9:
            boolean r12 = r10.isShown()
            if (r12 == 0) goto L_0x012a
            float r12 = r10.getAlpha()
            int r12 = (r12 > r6 ? 1 : (r12 == r6 ? 0 : -1))
            if (r12 != 0) goto L_0x00b9
            r12 = 1
            goto L_0x00ba
        L_0x00b9:
            r12 = 0
        L_0x00ba:
            if (r12 == 0) goto L_0x00be
            goto L_0x012a
        L_0x00be:
            int r12 = r10.getChildCount()
            r13 = 0
            r14 = 0
        L_0x00c4:
            if (r13 >= r12) goto L_0x012a
            android.view.View r15 = r10.getChildAt(r13)
            if (r15 != 0) goto L_0x00cd
            goto L_0x0127
        L_0x00cd:
            if (r14 != 0) goto L_0x00d6
            boolean r16 = gy3.C87412m.m108589b(r15, r7)
            if (r16 != 0) goto L_0x00d6
            goto L_0x0127
        L_0x00d6:
            boolean r16 = gy3.C87412m.m108589b(r15, r7)
            if (r16 == 0) goto L_0x00de
            r14 = 1
            goto L_0x0127
        L_0x00de:
            boolean r16 = r15.isShown()
            if (r16 == 0) goto L_0x0127
            float r16 = r15.getAlpha()
            int r16 = (r16 > r6 ? 1 : (r16 == r6 ? 0 : -1))
            if (r16 != 0) goto L_0x00ef
            r16 = 1
            goto L_0x00f1
        L_0x00ef:
            r16 = 0
        L_0x00f1:
            if (r16 == 0) goto L_0x00f4
            goto L_0x0127
        L_0x00f4:
            android.graphics.Rect r3 = new android.graphics.Rect
            r3.<init>()
            r15.getGlobalVisibleRect(r3)
            boolean r17 = r3.contains(r5)
            if (r17 == 0) goto L_0x0127
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "target: "
            r6.append(r7)
            r6.append(r5)
            java.lang.String r5 = ", overlay: "
            r6.append(r5)
            r6.append(r3)
            r6.append(r11)
            r6.append(r15)
            java.lang.String r3 = r6.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r9, r3)
            r3 = 1
            goto L_0x0130
        L_0x0127:
            int r13 = r13 + 1
            goto L_0x00c4
        L_0x012a:
            int r8 = r8 + 1
            r7 = r10
            goto L_0x0078
        L_0x012f:
            r3 = 0
        L_0x0130:
            if (r3 == 0) goto L_0x0135
            r3 = 4
            goto L_0x02f9
        L_0x0135:
            if (r20 == 0) goto L_0x02cf
            boolean r3 = r1 instanceof android.widget.ImageView
            if (r3 == 0) goto L_0x019e
            r3 = r1
            android.widget.ImageView r3 = (android.widget.ImageView) r3
            android.graphics.drawable.Drawable r4 = r3.getDrawable()
            if (r4 != 0) goto L_0x0148
            android.graphics.drawable.Drawable r4 = r3.getBackground()
        L_0x0148:
            if (r4 != 0) goto L_0x014c
            goto L_0x02af
        L_0x014c:
            int r1 = r0.mo125224c(r4, r1)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "drawable color: "
            r3.append(r4)
            java.lang.String r4 = xb3.C91162a.m114380c(r1)
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r9, r3)
            if (r1 != 0) goto L_0x016c
            goto L_0x02af
        L_0x016c:
            int r3 = xb3.C91162a.m114378a(r1, r2)
            boolean r4 = r0.mo125225d(r3, r2)
            if (r4 == 0) goto L_0x02cb
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = "find similarColor: "
            r0.append(r3)
            int r1 = xb3.C91162a.m114378a(r1, r2)
            java.lang.String r1 = xb3.C91162a.m114380c(r1)
            r0.append(r1)
            r0.append(r11)
            java.lang.String r1 = xb3.C91162a.m114380c(r21)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r9, r0)
            goto L_0x02cb
        L_0x019e:
            boolean r3 = r1 instanceof android.widget.TextView
            if (r3 == 0) goto L_0x01db
            r0 = r1
            android.widget.TextView r0 = (android.widget.TextView) r0
            int r0 = r0.getCurrentTextColor()
            double r5 = p1057w2.C90885a.m114000e(r0, r2)
            r7 = 4611686018427387904(0x4000000000000000, double:2.0)
            int r1 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r1 >= 0) goto L_0x01b4
            goto L_0x01b5
        L_0x01b4:
            r4 = 0
        L_0x01b5:
            if (r4 == 0) goto L_0x02cb
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "find low contrast: "
            r1.append(r3)
            java.lang.String r0 = xb3.C91162a.m114380c(r0)
            r1.append(r0)
            r1.append(r11)
            java.lang.String r0 = xb3.C91162a.m114380c(r21)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r9, r0)
            goto L_0x02cb
        L_0x01db:
            int r3 = r19.getWidth()
            int r5 = r19.getHeight()
            android.graphics.Bitmap$Config r6 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r3 = android.graphics.Bitmap.createBitmap(r3, r5, r6)
            android.graphics.Canvas r5 = new android.graphics.Canvas
            r5.<init>(r3)
            r1.draw(r5)
            java.lang.String r1 = "bitmap"
            gy3.C87412m.m108593f(r3, r1)
            int r1 = xb3.C91162a.f261394a
            android.graphics.Bitmap$Config r1 = r3.getConfig()
            android.graphics.Bitmap$Config r5 = android.graphics.Bitmap.Config.ARGB_8888
            if (r1 == r5) goto L_0x0201
            goto L_0x0246
        L_0x0201:
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            int r5 = r3.getWidth()
            r6 = 0
        L_0x020b:
            if (r6 >= r5) goto L_0x0246
            int r7 = r3.getHeight()
            r8 = 0
        L_0x0212:
            if (r8 >= r7) goto L_0x0243
            int r10 = r3.getPixel(r6, r8)
            java.lang.Integer r11 = java.lang.Integer.valueOf(r10)
            java.lang.Object r11 = r1.get(r11)
            java.lang.Integer r11 = (java.lang.Integer) r11
            if (r11 != 0) goto L_0x022c
            int r11 = xb3.C91162a.m114378a(r10, r2)
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
        L_0x022c:
            int r11 = r11.intValue()
            if (r10 == r11) goto L_0x0235
            r3.setPixel(r6, r8, r11)
        L_0x0235:
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            r1.put(r10, r11)
            int r8 = r8 + 1
            goto L_0x0212
        L_0x0243:
            int r6 = r6 + 1
            goto L_0x020b
        L_0x0246:
            w3.b$b r1 = new w3.b$b
            r1.<init>(r3)
            r3 = 16
            r1.f65704c = r3
            int r3 = xb3.C91162a.f261394a
            r1.f65705d = r3
            r3 = -1
            r1.f65706e = r3
            java.util.List<w3.c> r3 = r1.f65703b
            if (r3 == 0) goto L_0x025f
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            r3.clear()
        L_0x025f:
            java.util.List<w3.b$c> r3 = r1.f65707f
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            r3.clear()
            w3.b r1 = r1.mo36019b()
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.List<w3.b$e> r1 = r1.f65697a
            java.util.List r1 = java.util.Collections.unmodifiableList(r1)
            java.lang.String r5 = "palette.swatches"
            gy3.C87412m.m108593f(r1, r5)
            java.util.Iterator r1 = r1.iterator()
        L_0x027f:
            boolean r5 = r1.hasNext()
            if (r5 == 0) goto L_0x0295
            java.lang.Object r5 = r1.next()
            w3.b$e r5 = (p391w3.C22857b.C22862e) r5
            int r5 = r5.f65714d
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r3.add(r5)
            goto L_0x027f
        L_0x0295:
            java.util.Iterator r1 = r3.iterator()
        L_0x0299:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x02cb
            java.lang.Object r3 = r1.next()
            java.lang.Number r3 = (java.lang.Number) r3
            int r3 = r3.intValue()
            boolean r5 = r0.mo125225d(r3, r2)
            if (r5 != 0) goto L_0x02b1
        L_0x02af:
            r4 = 0
            goto L_0x02cb
        L_0x02b1:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "similar color: "
            r5.append(r6)
            java.lang.String r3 = xb3.C91162a.m114380c(r3)
            r5.append(r3)
            java.lang.String r3 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r9, r3)
            goto L_0x0299
        L_0x02cb:
            if (r4 == 0) goto L_0x02cf
            r3 = 7
            goto L_0x02f9
        L_0x02cf:
            r3 = 0
            goto L_0x02f9
        L_0x02d1:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "width: "
            r0.append(r2)
            int r2 = r19.getWidth()
            r0.append(r2)
            java.lang.String r2 = ", height: "
            r0.append(r2)
            int r1 = r19.getHeight()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r9, r0)
            r3 = 6
            goto L_0x02f9
        L_0x02f8:
            r3 = 1
        L_0x02f9:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: xb3.C91164l.m114382a(xb3.l, android.view.View, boolean, int, java.lang.Integer):int");
    }

    /* renamed from: b */
    public static final void m114383b(C91164l lVar, int i, String str) {
        String str2;
        lVar.getClass();
        Log.m105918d("MicroMsg.WcPayReport|WcPayViewExposureReport", "check view exposure: " + str + ", " + i);
        if (i != 0) {
            switch (i) {
                case 1:
                    str2 = "not add into layout";
                    break;
                case 2:
                    str2 = "not shown";
                    break;
                case 3:
                    str2 = "alpha is 0";
                    break;
                case 4:
                    str2 = "has been covered";
                    break;
                case 5:
                    str2 = "out of screen range";
                    break;
                case 6:
                    str2 = "out of screen range partly";
                    break;
                case 7:
                    str2 = "inappropriate color";
                    break;
                default:
                    str2 = "ok";
                    break;
            }
            String valueOf = String.valueOf(i);
            C87412m.m108594g(str, "viewId");
            C87412m.m108594g(valueOf, OpenSDKTool4Assistant.EXTRA_ERROR_CODE);
            C115669n nVar = C115669n.INSTANCE;
            Object[] objArr = new Object[8];
            int i2 = 0;
            objArr[0] = "2";
            objArr[1] = str;
            objArr[2] = valueOf;
            objArr[3] = str2;
            objArr[4] = "";
            objArr[5] = Integer.valueOf(C85875k4.m106211z() ? 1 : 0);
            objArr[6] = Integer.valueOf(C76695c.m92341b() ? 1 : 0);
            if (C76577a.m92165p(MMApplicationContext.getContext()) > 1.0f) {
                i2 = 1;
            }
            objArr[7] = Integer.valueOf(i2);
            nVar.mo160131h(24610, objArr);
        }
    }

    /* renamed from: c */
    public final int mo125224c(Drawable drawable, View view) {
        if (drawable instanceof ColorDrawable) {
            return ((ColorDrawable) drawable).getColor();
        }
        if (drawable instanceof BitmapDrawable) {
            Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
            C87412m.m108593f(bitmap, "drawable.bitmap");
            int i = C91162a.f261394a;
            C22857b.C22859b bVar = new C22857b.C22859b(bitmap);
            bVar.f65704c = 16;
            bVar.f65705d = C91162a.f261394a;
            bVar.f65706e = -1;
            List<C22864c> list = bVar.f65703b;
            if (list != null) {
                ((ArrayList) list).clear();
            }
            ((ArrayList) bVar.f65707f).clear();
            C22857b.C22862e eVar = bVar.mo36019b().f65701e;
            if (eVar != null) {
                return eVar.f65714d;
            }
        } else if (drawable instanceof StateListDrawable) {
            Drawable current = ((StateListDrawable) drawable).getCurrent();
            C87412m.m108593f(current, "drawable.current");
            return mo125224c(current, view);
        } else if (drawable instanceof C87516b) {
            Log.m105928w("MicroMsg.WcPayReport|WcPayViewExposureReport", "is SVGDrawable");
        } else {
            Log.m105928w("MicroMsg.WcPayReport|WcPayViewExposureReport", "can't parse drawable: " + drawable);
        }
        return 0;
    }

    /* renamed from: d */
    public final boolean mo125225d(int i, int i2) {
        C38481c d = C91162a.m114381d(i);
        C38481c d2 = C91162a.m114381d(i2);
        double d3 = d.f101476a;
        double d4 = d2.f101476a;
        double d5 = d.f101478c;
        double d6 = d2.f101478c;
        double d7 = d.f101477b;
        double d8 = d5 * d5;
        double pow = Math.pow((d7 * d7) + d8, 0.5d);
        double d9 = d2.f101477b;
        double d15 = d3;
        double d16 = d2.f101478c;
        double d17 = (double) 2;
        double d18 = (double) 7;
        double pow2 = Math.pow((pow + Math.pow((d9 * d9) + (d16 * d16), 0.5d)) / d17, d18);
        double d19 = d18;
        double d25 = d17;
        double d26 = (double) 1;
        double d27 = (double) 6103515625L;
        double d28 = d27;
        double pow3 = ((d26 - Math.pow(pow2 / (pow2 + d27), 0.5d)) * 0.5d) + d26;
        double d29 = d.f101477b * pow3;
        double d35 = d2.f101477b * pow3;
        double pow4 = Math.pow((d29 * d29) + d8, 0.5d);
        double d36 = d26;
        double pow5 = Math.pow((d35 * d35) + (d6 * d6), 0.5d);
        double b = C91162a.m114379b(d29, d5);
        double b2 = C91162a.m114379b(d35, d6);
        double d37 = pow4 - pow5;
        double d38 = d15 - d4;
        double sin = Math.sin(((b - b2) * 3.141592653589793d) / ((double) v2helper.VOIP_ENC_HEIGHT_LV1)) * d25 * Math.pow(pow4 * pow5, 0.5d);
        double d39 = (pow4 + pow5) / d25;
        double d44 = (b + b2) / d25;
        double d45 = ((d15 + d4) / d25) - ((double) 50);
        double d46 = (double) 30;
        double d47 = (double) 180;
        double d48 = sin;
        double d49 = d36 + (0.045d * d39);
        double cos = (((d36 - (Math.cos(((d44 - d46) * 3.141592653589793d) / d47) * 0.17d)) + (Math.cos(((d25 * d44) * 3.141592653589793d) / d47) * 0.24d)) + (Math.cos((((((double) 3) * d44) + ((double) 6)) * 3.141592653589793d) / d47) * 0.32d)) - (Math.cos((((((double) 4) * d44) - ((double) 63)) * 3.141592653589793d) / d47) * 0.2d);
        double pow6 = Math.pow(d39, d19);
        double d54 = d25;
        double d55 = -Math.sin((((d46 * Math.exp(-Math.pow((d44 - ((double) 275)) / ((double) 25), d54))) * d54) * 3.141592653589793d) / d47);
        double pow7 = d38 / ((d36 + ((Math.pow(d45, 2.0d) * 0.015d) / Math.pow(((double) 20) + Math.pow(d45, 2.0d), 0.5d))) * 1.0d);
        double d56 = d37 / (d49 * 1.0d);
        double d57 = d48 / ((d36 + ((0.015d * d39) * cos)) * 1.0d);
        return Math.pow((((pow7 * pow7) + (d56 * d56)) + (d57 * d57)) + (((d55 * (Math.pow(pow6 / (pow6 + d28), 0.5d) * d25)) * d56) * d57), 0.5d) <= 5.0d;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001e, code lost:
        if (r1 != false) goto L_0x0020;
     */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0058  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final lu3.C88654b mo125226e(android.view.View r15, int r16, long r17, java.lang.String r19, com.tencent.p014mm.p136ui.MMFragmentActivity r20, boolean r21, int r22, java.lang.Integer r23) {
        /*
            r14 = this;
            r0 = r15
            r7 = r19
            r8 = r20
            java.lang.String r1 = "viewId"
            gy3.C87412m.m108594g(r7, r1)
            java.lang.String r1 = "activity"
            gy3.C87412m.m108594g(r8, r1)
            r9 = 0
            if (r21 != 0) goto L_0x0020
            r1 = 0
            if (r0 == 0) goto L_0x001e
            boolean r2 = r15.isLaidOut()
            if (r2 != 0) goto L_0x001e
            r1 = 1
        L_0x001e:
            if (r1 == 0) goto L_0x0028
        L_0x0020:
            int r1 = (r17 > r9 ? 1 : (r17 == r9 ? 0 : -1))
            if (r1 > 0) goto L_0x0028
            r1 = 500(0x1f4, double:2.47E-321)
            r11 = r1
            goto L_0x002a
        L_0x0028:
            r11 = r17
        L_0x002a:
            xb3.l$a r13 = new xb3.l$a
            r1 = r13
            r2 = r16
            r3 = r19
            r4 = r21
            r5 = r22
            r6 = r23
            r1.<init>(r2, r3, r4, r5, r6)
            int r1 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r1 <= 0) goto L_0x0058
            java.lang.ref.WeakReference r1 = new java.lang.ref.WeakReference
            r1.<init>(r15)
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r8)
            xb3.l$b r2 = new xb3.l$b
            r2.<init>(r7, r1, r13, r0)
            zt3.t r0 = zt3.C119157j.f356862d
            zt3.j r0 = (zt3.C119157j) r0
            java.lang.String r1 = "wcpay_report_check_exposure"
            r0.mo183879j(r2, r11, r1)
            return r2
        L_0x0058:
            r13.invoke(r15, r8)
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: xb3.C91164l.mo125226e(android.view.View, int, long, java.lang.String, com.tencent.mm.ui.MMFragmentActivity, boolean, int, java.lang.Integer):lu3.b");
    }
}
