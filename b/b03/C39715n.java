package b03;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.google.android.gms.common.Scopes;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.base.NoMeasuredTextView;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import fy3.C32226l;
import go3.C76003c;
import gy3.C24564k0;
import gy3.C87412m;
import gy3.C87413o;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Set;
import ke3.C88144b;
import kg3.C76577a;
import qy2.C47895k;
import qy2.C63347a;
import rx3.C13598b0;
import rz2.C48201c;
import uz2.C52676d1;
import uz2.C52725x;

/* renamed from: b03.n */
public final class C39715n extends C76003c {

    /* renamed from: s */
    public static final int f106552s = C76577a.m92151b(MMApplicationContext.getContext(), 4);

    /* renamed from: e */
    public Drawable f106553e;

    /* renamed from: f */
    public final String f106554f;

    /* renamed from: g */
    public final C48201c f106555g;

    /* renamed from: h */
    public final C63347a.C47892c f106556h;

    /* renamed from: i */
    public final C63347a.C47893d f106557i;

    /* renamed from: j */
    public final C63347a.C47891b f106558j;

    /* renamed from: n */
    public int f106559n;

    /* renamed from: o */
    public final int f106560o;

    /* renamed from: p */
    public boolean f106561p;

    /* renamed from: q */
    public WeakReference<C47895k> f106562q;

    /* renamed from: r */
    public final String f106563r = ("MicroMsg.TextStatus.TSIconSpan2@" + hashCode());

    /* renamed from: b03.n$a */
    public static final class C39716a implements C47895k {

        /* renamed from: d */
        public final /* synthetic */ View f106564d;

        public C39716a(View view) {
            this.f106564d = view;
        }

        /* renamed from: a */
        public void mo62348a() {
            this.f106564d.invalidate();
        }

        public View getView() {
            return this.f106564d;
        }
    }

    /* renamed from: b03.n$b */
    public static final class C39717b extends C87413o implements C32226l<Bitmap, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C39715n f106565d;

        /* renamed from: e */
        public final /* synthetic */ String f106566e;

        /* renamed from: f */
        public final /* synthetic */ C52676d1 f106567f;

        /* renamed from: g */
        public final /* synthetic */ C52725x f106568g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C39717b(C39715n nVar, String str, C52676d1 d1Var, C52725x xVar) {
            super(1);
            this.f106565d = nVar;
            this.f106566e = str;
            this.f106567f = d1Var;
            this.f106568g = xVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:51:0x0169  */
        /* JADX WARNING: Removed duplicated region for block: B:52:0x0171  */
        /* JADX WARNING: Removed duplicated region for block: B:55:0x0178  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object invoke(java.lang.Object r15) {
            /*
                r14 = this;
                android.graphics.Bitmap r15 = (android.graphics.Bitmap) r15
                b03.n r0 = r14.f106565d
                boolean r0 = r0.f106561p
                if (r0 == 0) goto L_0x000a
                goto L_0x018a
            L_0x000a:
                b03.c r0 = com.tencent.p014mm.plugin.textstatus.util.IStatusIconHelperKt.m39109a()
                boolean r0 = r0.mo62275E()
                r1 = 0
                r2 = 0
                r3 = 1
                if (r0 != 0) goto L_0x0021
                b03.c r0 = com.tencent.p014mm.plugin.textstatus.util.IStatusIconHelperKt.m39109a()
                boolean r0 = r0.mo62311w()
                if (r0 == 0) goto L_0x0133
            L_0x0021:
                b03.n r0 = r14.f106565d
                rz2.c r0 = r0.f106555g
                if (r0 == 0) goto L_0x002f
                boolean r0 = r0.mo72947p2()
                if (r0 != 0) goto L_0x002f
                r0 = 1
                goto L_0x0030
            L_0x002f:
                r0 = 0
            L_0x0030:
                if (r0 == 0) goto L_0x0133
                b03.n r0 = r14.f106565d
                qy2.a$c r4 = r0.f106556h
                qy2.a$c r5 = qy2.C63347a.C47892c.SNS_TIMELINE_NICK
                if (r4 == r5) goto L_0x0133
                qy2.a$c r5 = qy2.C63347a.C47892c.PATMSG_NO_BG
                if (r4 == r5) goto L_0x0133
                qy2.a$c r5 = qy2.C63347a.C47892c.PATMSG_WITH_BG
                if (r4 == r5) goto L_0x0133
                int r0 = r0.f106559n
                int r0 = r0 * 5
                int r0 = r0 / 4
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                java.lang.String r5 = r14.f106566e
                r4.append(r5)
                b03.n r5 = r14.f106565d
                java.lang.String r5 = r5.f106554f
                r4.append(r5)
                java.lang.String r4 = r4.toString()
                sg.g<java.lang.String, android.graphics.Bitmap> r5 = gz2.C98293d.f288117b
                o90.b r5 = (o90.C100301b) r5
                java.lang.Object r6 = r5.get(r4)
                android.graphics.Bitmap r6 = (android.graphics.Bitmap) r6
                if (r6 != 0) goto L_0x010b
                uz2.d1 r6 = r14.f106567f
                if (r6 == 0) goto L_0x0073
                int r6 = r6.f147084g
                if (r6 != 0) goto L_0x0073
                r6 = 1
                goto L_0x0074
            L_0x0073:
                r6 = 0
            L_0x0074:
                r7 = 0
                if (r6 == 0) goto L_0x00c0
                uz2.x r6 = r14.f106568g
                boolean r6 = b03.C39713l.m42505j(r6)
                if (r6 != 0) goto L_0x00c0
                if (r15 == 0) goto L_0x00be
                b03.n r6 = r14.f106565d
                android.content.res.Resources r8 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getResources()
                r9 = 2131099934(0x7f06011e, float:1.7812235E38)
                int r8 = r8.getColor(r9)
                r6.getClass()
                int r6 = r15.getWidth()
                int r9 = r15.getHeight()
                android.graphics.Bitmap$Config r10 = r15.getConfig()
                android.graphics.Bitmap r6 = android.graphics.Bitmap.createBitmap(r6, r9, r10)
                android.graphics.Canvas r9 = new android.graphics.Canvas
                r9.<init>(r6)
                android.graphics.Paint r10 = new android.graphics.Paint
                r10.<init>()
                android.graphics.PorterDuffColorFilter r11 = new android.graphics.PorterDuffColorFilter
                android.graphics.PorterDuff$Mode r12 = android.graphics.PorterDuff.Mode.SRC_IN
                r11.<init>(r8, r12)
                r10.setColorFilter(r11)
                r9.drawBitmap(r15, r7, r7, r10)
                java.lang.String r8 = "outputBitmap"
                gy3.C87412m.m108593f(r6, r8)
                goto L_0x00c1
            L_0x00be:
                r6 = r1
                goto L_0x00c1
            L_0x00c0:
                r6 = r15
            L_0x00c1:
                rx3.g r8 = gz2.C98293d.f288118c
                rx3.n r8 = (rx3.C36570n) r8
                java.lang.Object r8 = r8.getValue()
                java.lang.String r9 = "<get-unReadIcon>(...)"
                gy3.C87412m.m108593f(r8, r9)
                android.graphics.Bitmap r8 = (android.graphics.Bitmap) r8
                b03.n r9 = r14.f106565d
                int r10 = r9.f106559n
                int r11 = r10 / 2
                int r12 = r10 / 4
                int r12 = r12 * 3
                if (r6 == 0) goto L_0x0107
                android.graphics.Bitmap r8 = r9.mo62346b(r8, r11, r11)
                android.graphics.Bitmap r6 = r9.mo62346b(r6, r10, r10)
                android.graphics.Bitmap$Config r11 = android.graphics.Bitmap.Config.ARGB_8888
                android.graphics.Bitmap r11 = android.graphics.Bitmap.createBitmap(r0, r10, r11)
                java.lang.String r13 = "createBitmap(bitmapWith,… Bitmap.Config.ARGB_8888)"
                gy3.C87412m.m108593f(r11, r13)
                android.graphics.Bitmap r9 = r9.mo62346b(r11, r0, r10)
                android.graphics.Canvas r10 = new android.graphics.Canvas
                r10.<init>(r9)
                r10.drawBitmap(r6, r7, r7, r1)
                float r6 = (float) r12
                r10.drawBitmap(r8, r6, r7, r1)
                r10.save()
                r10.restore()
                r6 = r9
                goto L_0x0108
            L_0x0107:
                r6 = r1
            L_0x0108:
                r5.put(r4, r6)
            L_0x010b:
                if (r6 == 0) goto L_0x0113
                android.graphics.drawable.BitmapDrawable r15 = new android.graphics.drawable.BitmapDrawable
                r15.<init>(r6)
                goto L_0x0127
            L_0x0113:
                b03.c r4 = com.tencent.p014mm.plugin.textstatus.util.IStatusIconHelperKt.m39109a()
                uz2.x r5 = r14.f106568g
                boolean r5 = b03.C39713l.m42505j(r5)
                b03.n r6 = r14.f106565d
                qy2.a$d r7 = r6.f106557i
                qy2.a$b r6 = r6.f106558j
                android.graphics.drawable.Drawable r15 = r4.mo62297i(r15, r5, r7, r6)
            L_0x0127:
                b03.n r4 = r14.f106565d
                int r4 = r4.f106559n
                r15.setBounds(r2, r2, r0, r4)
                b03.n r0 = r14.f106565d
                r0.f106553e = r15
                goto L_0x0152
            L_0x0133:
                b03.c r0 = com.tencent.p014mm.plugin.textstatus.util.IStatusIconHelperKt.m39109a()
                uz2.x r4 = r14.f106568g
                boolean r4 = b03.C39713l.m42505j(r4)
                b03.n r5 = r14.f106565d
                qy2.a$d r6 = r5.f106557i
                qy2.a$b r5 = r5.f106558j
                android.graphics.drawable.Drawable r15 = r0.mo62297i(r15, r4, r6, r5)
                b03.n r0 = r14.f106565d
                int r0 = r0.f106559n
                r15.setBounds(r2, r2, r0, r0)
                b03.n r0 = r14.f106565d
                r0.f106553e = r15
            L_0x0152:
                b03.n r15 = r14.f106565d
                r15.f106561p = r3
                java.lang.ref.WeakReference<qy2.k> r15 = r15.f106562q
                if (r15 == 0) goto L_0x018a
                java.lang.Object r15 = r15.get()
                qy2.k r15 = (qy2.C47895k) r15
                if (r15 != 0) goto L_0x0163
                goto L_0x018a
            L_0x0163:
                android.view.View r0 = r15.getView()
                if (r0 == 0) goto L_0x0171
                r2 = 2131314867(0x7f0948b3, float:1.8248171E38)
                java.lang.Object r0 = r0.getTag(r2)
                goto L_0x0172
            L_0x0171:
                r0 = r1
            L_0x0172:
                boolean r2 = gy3.C24564k0.m30745i(r0)
                if (r2 == 0) goto L_0x017b
                r1 = r0
                java.util.Set r1 = (java.util.Set) r1
            L_0x017b:
                if (r1 == 0) goto L_0x018a
                b03.n r0 = r14.f106565d
                java.lang.String r0 = r0.f106554f
                boolean r0 = r1.contains(r0)
                if (r0 == 0) goto L_0x018a
                r15.mo62348a()
            L_0x018a:
                rx3.b0 r15 = rx3.C13598b0.f38549a
                return r15
            */
            throw new UnsupportedOperationException("Method not decompiled: b03.C39715n.C39717b.invoke(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C39715n(View view, Drawable drawable, String str, int i, C48201c cVar, C63347a.C47892c cVar2, C63347a.C47893d dVar, C63347a.C47891b bVar, int i2, int i3) {
        super(drawable, i);
        C87412m.m108594g(dVar, "iconType");
        C87412m.m108594g(bVar, "iconColor");
        this.f106553e = drawable;
        this.f106554f = str;
        this.f106555g = cVar;
        this.f106556h = cVar2;
        this.f106557i = dVar;
        this.f106558j = bVar;
        this.f106559n = i2;
        this.f106560o = i3;
        mo62345a(view);
    }

    /* renamed from: a */
    public final void mo62345a(View view) {
        Set set = null;
        C47895k aVar = view instanceof C47895k ? (C47895k) view : ((view instanceof TextView) || (view instanceof NoMeasuredTextView)) ? new C39716a(view) : null;
        if (aVar != null) {
            View view2 = aVar.getView();
            Object tag = view2 != null ? view2.getTag(C0966R.C0970id.f359345ke2) : null;
            if (C24564k0.m30745i(tag)) {
                set = (Set) tag;
            }
            if (set == null) {
                set = new HashSet();
            }
            set.add(this.f106554f);
            View view3 = aVar.getView();
            if (view3 != null) {
                view3.setTag(C0966R.C0970id.f359345ke2, set);
            }
        }
        this.f106562q = new WeakReference<>(aVar);
    }

    /* renamed from: b */
    public final Bitmap mo62346b(Bitmap bitmap, int i, int i2) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Matrix matrix = new Matrix();
        matrix.postScale(((float) i) / ((float) width), ((float) i2) / ((float) height));
        Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, width, height, matrix, true);
        C87412m.m108593f(createBitmap, "createBitmap(bm, 0, 0, w…th, height, matrix, true)");
        return createBitmap;
    }

    public void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        C87412m.m108594g(canvas, "canvas");
        Paint paint2 = paint;
        C87412m.m108594g(paint2, "paint");
        super.draw(canvas, charSequence, i, i2, f + ((float) this.f106560o), i3, i4, i5, paint2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0031, code lost:
        r5 = (r5 = p773yy.C66710j.C53637a.m60171a(r5, false, 1, (java.lang.Object) null)).f147093j;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0016 A[Catch:{ all -> 0x0054 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.graphics.drawable.Drawable getDrawable() {
        /*
            r7 = this;
            r0 = 0
            boolean r1 = r7.f106561p     // Catch:{ all -> 0x0054 }
            if (r1 != 0) goto L_0x005e
            java.lang.String r1 = r7.f106554f     // Catch:{ all -> 0x0054 }
            r2 = 1
            if (r1 == 0) goto L_0x0013
            boolean r1 = z04.C112551y.m153811k(r1)     // Catch:{ all -> 0x0054 }
            if (r1 == 0) goto L_0x0011
            goto L_0x0013
        L_0x0011:
            r1 = 0
            goto L_0x0014
        L_0x0013:
            r1 = 1
        L_0x0014:
            if (r1 != 0) goto L_0x005e
            b03.j r1 = b03.C39707j.f106537a     // Catch:{ all -> 0x0054 }
            java.lang.String r3 = r7.f106554f     // Catch:{ all -> 0x0054 }
            uz2.d1 r3 = r1.mo62298j(r3)     // Catch:{ all -> 0x0054 }
            r4 = 0
            if (r3 == 0) goto L_0x0027
            uz2.x r5 = b03.C39713l.m42503h(r3)     // Catch:{ all -> 0x0054 }
            if (r5 != 0) goto L_0x003b
        L_0x0027:
            rz2.c r5 = r7.f106555g     // Catch:{ all -> 0x0054 }
            if (r5 == 0) goto L_0x003a
            uz2.e0 r5 = p773yy.C66710j.C53637a.m60171a(r5, r0, r2, r4)     // Catch:{ all -> 0x0054 }
            if (r5 == 0) goto L_0x003a
            java.util.LinkedList<uz2.x> r5 = r5.f147093j     // Catch:{ all -> 0x0054 }
            if (r5 == 0) goto L_0x003a
            uz2.x r5 = b03.C39713l.m42501f(r5)     // Catch:{ all -> 0x0054 }
            goto L_0x003b
        L_0x003a:
            r5 = r4
        L_0x003b:
            if (r5 == 0) goto L_0x003f
            java.lang.String r4 = r5.f147281d     // Catch:{ all -> 0x0054 }
        L_0x003f:
            if (r4 == 0) goto L_0x0049
            boolean r6 = z04.C112551y.m153811k(r4)     // Catch:{ all -> 0x0054 }
            if (r6 == 0) goto L_0x0048
            goto L_0x0049
        L_0x0048:
            r2 = 0
        L_0x0049:
            if (r2 != 0) goto L_0x005e
            b03.n$b r2 = new b03.n$b     // Catch:{ all -> 0x0054 }
            r2.<init>(r7, r4, r3, r5)     // Catch:{ all -> 0x0054 }
            r1.mo62341Z(r4, r2)     // Catch:{ all -> 0x0054 }
            goto L_0x005e
        L_0x0054:
            r1 = move-exception
            java.lang.String r2 = r7.f106563r
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r3 = "getDrawable err"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r2, r1, r3, r0)
        L_0x005e:
            android.graphics.drawable.Drawable r0 = r7.f106553e
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: b03.C39715n.getDrawable():android.graphics.drawable.Drawable");
    }

    public int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        C87412m.m108594g(paint, "paint");
        return super.getSize(paint, charSequence, i, i2, fontMetricsInt) + this.f106560o;
    }

    public void onClick(View view) {
        C48201c cVar = this.f106555g;
        C63347a.C47892c cVar2 = this.f106556h;
        if (cVar != null && cVar2 != null && cVar2 == C63347a.C47892c.SNS_FEED && C87412m.m108589b(cVar.field_IconID, "2021")) {
            Intent intent = new Intent();
            intent.putExtra("Contact_User", cVar.field_UserName);
            C88144b.m109791i(view != null ? view.getContext() : null, Scopes.PROFILE, ".ui.ContactInfoUI", intent, (Bundle) null);
        }
    }
}
