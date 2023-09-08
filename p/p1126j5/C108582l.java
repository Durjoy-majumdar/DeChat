package p1126j5;

import android.content.Context;
import android.content.res.Configuration;
import android.net.Uri;
import d24.C20419r;
import gy3.C87412m;
import p864t5.C110905d;
import p972h5.C108140f;

/* renamed from: j5.l */
public final class C108582l implements C108576g<Uri> {

    /* renamed from: a */
    public final Context f325042a;

    /* renamed from: b */
    public final C108140f f325043b;

    public C108582l(Context context, C108140f fVar) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(fVar, "drawableDecoder");
        this.f325042a = context;
        this.f325043b = fVar;
    }

    /* renamed from: a */
    public boolean mo159568a(Object obj) {
        Uri uri = (Uri) obj;
        C87412m.m108594g(uri, "data");
        return C87412m.m108589b(uri.getScheme(), "android.resource");
    }

    /* renamed from: b */
    public String mo159569b(Object obj) {
        Uri uri = (Uri) obj;
        C87412m.m108594g(uri, "data");
        StringBuilder sb = new StringBuilder();
        sb.append(uri);
        sb.append('-');
        Configuration configuration = this.f325042a.getResources().getConfiguration();
        C87412m.m108593f(configuration, "context.resources.configuration");
        C20419r rVar = C110905d.f331711a;
        sb.append(configuration.uiMode & 48);
        return sb.toString();
    }

    /* JADX WARNING: Removed duplicated region for block: B:42:0x0108  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object mo159570c(p1106e5.C107228a r16, java.lang.Object r17, coil.size.Size r18, p972h5.C108143i r19, wx3.C15601d r20) {
        /*
            r15 = this;
            r0 = r19
            r1 = r17
            android.net.Uri r1 = (android.net.Uri) r1
            h5.b r2 = p972h5.C108136b.DISK
            java.lang.String r3 = r1.getAuthority()
            r4 = 0
            r5 = 1
            if (r3 != 0) goto L_0x0011
            goto L_0x0019
        L_0x0011:
            boolean r6 = z04.C112551y.m153811k(r3)
            r6 = r6 ^ r5
            if (r6 == 0) goto L_0x0019
            goto L_0x001a
        L_0x0019:
            r3 = r4
        L_0x001a:
            java.lang.String r6 = "Invalid android.resource URI: "
            if (r3 == 0) goto L_0x016a
            java.util.List r7 = r1.getPathSegments()
            java.lang.String r8 = "data.pathSegments"
            gy3.C87412m.m108593f(r7, r8)
            java.lang.Object r7 = sx3.C110818d0.m150925W(r7)
            java.lang.String r7 = (java.lang.String) r7
            if (r7 != 0) goto L_0x0031
            r7 = r4
            goto L_0x0035
        L_0x0031:
            java.lang.Integer r7 = z04.C66731x.m78731e(r7)
        L_0x0035:
            if (r7 == 0) goto L_0x015f
            int r1 = r7.intValue()
            android.content.Context r6 = r0.f323810a
            android.content.pm.PackageManager r7 = r6.getPackageManager()
            android.content.res.Resources r7 = r7.getResourcesForApplication(r3)
            java.lang.String r8 = "context.packageManager.g…rApplication(packageName)"
            gy3.C87412m.m108593f(r7, r8)
            android.util.TypedValue r8 = new android.util.TypedValue
            r8.<init>()
            r7.getValue(r1, r8, r5)
            java.lang.CharSequence r8 = r8.string
            java.lang.String r9 = "path"
            gy3.C87412m.m108593f(r8, r9)
            r10 = 47
            r11 = 0
            r12 = 0
            r13 = 6
            r14 = 0
            r9 = r8
            int r9 = z04.C112550d0.m153771G(r9, r10, r11, r12, r13, r14)
            int r10 = r8.length()
            java.lang.CharSequence r8 = r8.subSequence(r9, r10)
            java.lang.String r8 = r8.toString()
            android.webkit.MimeTypeMap r9 = android.webkit.MimeTypeMap.getSingleton()
            java.lang.String r10 = "getSingleton()"
            gy3.C87412m.m108593f(r9, r10)
            java.lang.String r8 = p864t5.C110905d.m151205a(r9, r8)
            java.lang.String r9 = "text/xml"
            boolean r9 = gy3.C87412m.m108589b(r8, r9)
            if (r9 == 0) goto L_0x0146
            java.lang.String r8 = r6.getPackageName()
            boolean r3 = gy3.C87412m.m108589b(r3, r8)
            if (r3 == 0) goto L_0x0094
            android.graphics.drawable.Drawable r1 = p864t5.C110904c.m151204a(r6, r1)
            goto L_0x00ea
        L_0x0094:
            android.content.res.XmlResourceParser r3 = r7.getXml(r1)
            java.lang.String r8 = "resources.getXml(resId)"
            gy3.C87412m.m108593f(r3, r8)
            int r8 = r3.next()
        L_0x00a1:
            r9 = 2
            if (r8 == r9) goto L_0x00ab
            if (r8 == r5) goto L_0x00ab
            int r8 = r3.next()
            goto L_0x00a1
        L_0x00ab:
            if (r8 != r9) goto L_0x013d
            int r8 = android.os.Build.VERSION.SDK_INT
            r9 = 24
            if (r8 >= r9) goto L_0x00ec
            java.lang.String r8 = r3.getName()
            java.lang.String r9 = "vector"
            boolean r9 = gy3.C87412m.m108589b(r8, r9)
            if (r9 == 0) goto L_0x00d1
            android.util.AttributeSet r1 = android.util.Xml.asAttributeSet(r3)
            android.content.res.Resources$Theme r4 = r6.getTheme()
            j4.g r8 = new j4.g
            r8.<init>()
            r8.inflate(r7, r3, r1, r4)
            r1 = r8
            goto L_0x00ea
        L_0x00d1:
            java.lang.String r9 = "animated-vector"
            boolean r8 = gy3.C87412m.m108589b(r8, r9)
            if (r8 == 0) goto L_0x00ec
            android.util.AttributeSet r1 = android.util.Xml.asAttributeSet(r3)
            android.content.res.Resources$Theme r8 = r6.getTheme()
            j4.c r9 = new j4.c
            r9.<init>(r6, r4, r4)
            r9.inflate(r7, r3, r1, r8)
            r1 = r9
        L_0x00ea:
            r8 = r1
            goto L_0x00f9
        L_0x00ec:
            android.content.res.Resources$Theme r3 = r6.getTheme()
            java.lang.ThreadLocal<android.util.TypedValue> r4 = p1050v2.C111325g.f333301a
            android.graphics.drawable.Drawable r3 = r7.getDrawable(r1, r3)
            if (r3 == 0) goto L_0x0128
            r8 = r3
        L_0x00f9:
            boolean r1 = r8 instanceof p906j4.C108561g
            if (r1 != 0) goto L_0x0103
            boolean r1 = r8 instanceof android.graphics.drawable.VectorDrawable
            if (r1 == 0) goto L_0x0102
            goto L_0x0103
        L_0x0102:
            r5 = 0
        L_0x0103:
            j5.e r1 = new j5.e
            r3 = r15
            if (r5 == 0) goto L_0x0124
            h5.f r7 = r3.f325043b
            android.graphics.Bitmap$Config r9 = r0.f323811b
            p5.e r11 = r0.f323813d
            boolean r12 = r0.f323814e
            r10 = r18
            android.graphics.Bitmap r0 = r7.mo158537a(r8, r9, r10, r11, r12)
            android.content.res.Resources r4 = r6.getResources()
            java.lang.String r6 = "context.resources"
            gy3.C87412m.m108593f(r4, r6)
            android.graphics.drawable.BitmapDrawable r8 = new android.graphics.drawable.BitmapDrawable
            r8.<init>(r4, r0)
        L_0x0124:
            r1.<init>(r8, r5, r2)
            goto L_0x015e
        L_0x0128:
            r3 = r15
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            java.lang.String r1 = "Invalid resource ID: "
            java.lang.String r0 = gy3.C87412m.m108600m(r1, r0)
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        L_0x013d:
            r3 = r15
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.String r1 = "No start tag found."
            r0.<init>(r1)
            throw r0
        L_0x0146:
            r3 = r15
            j5.m r0 = new j5.m
            java.io.InputStream r1 = r7.openRawResource(r1)
            java.lang.String r4 = "resources.openRawResource(resId)"
            gy3.C87412m.m108593f(r1, r4)
            o24.d0 r1 = o24.C21777r.m24939f(r1)
            o24.j r1 = o24.C21777r.m24935b(r1)
            r0.<init>(r1, r8, r2)
            r1 = r0
        L_0x015e:
            return r1
        L_0x015f:
            r3 = r15
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = gy3.C87412m.m108600m(r6, r1)
            r0.<init>(r1)
            throw r0
        L_0x016a:
            r3 = r15
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = gy3.C87412m.m108600m(r6, r1)
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p1126j5.C108582l.mo159570c(e5.a, java.lang.Object, coil.size.Size, h5.i, wx3.d):java.lang.Object");
    }
}
