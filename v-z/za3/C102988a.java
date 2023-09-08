package za3;

import android.text.Spanned;
import o90.C100308d;
import p823sg.C101611g;

/* renamed from: za3.a */
public class C102988a {

    /* renamed from: a */
    public static C101611g<String, Spanned> f303919a = new C100308d(30);

    /* renamed from: b */
    public static Spanned f303920b = null;

    /* JADX WARNING: type inference failed for: r0v12, types: [java.lang.CharSequence] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.text.Spanned m136184a(java.lang.String r5) {
        /*
            if (r5 != 0) goto L_0x0004
            java.lang.String r5 = ""
        L_0x0004:
            r0 = 2
            java.lang.String r1 = "\n"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r1, r0)
            java.util.regex.Matcher r5 = r0.matcher(r5)
            java.lang.String r0 = "<br/>"
            java.lang.String r5 = r5.replaceAll(r0)
            java.lang.String r0 = "<html>"
            boolean r2 = r5.startsWith(r0)
            if (r2 != 0) goto L_0x002d
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r0)
            r2.append(r5)
            java.lang.String r0 = r2.toString()
            goto L_0x002e
        L_0x002d:
            r0 = r5
        L_0x002e:
            java.lang.String r2 = "</html>"
            boolean r3 = r0.endsWith(r2)
            if (r3 != 0) goto L_0x0045
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r0)
            r3.append(r2)
            java.lang.String r0 = r3.toString()
        L_0x0045:
            r2 = 0
            f303920b = r2     // Catch:{ all -> 0x0052 }
            za3.d r3 = new za3.d     // Catch:{ all -> 0x0052 }
            r3.<init>()     // Catch:{ all -> 0x0052 }
            android.text.Spanned r0 = android.text.Html.fromHtml(r0, r2, r3)     // Catch:{ all -> 0x0052 }
            goto L_0x0059
        L_0x0052:
            android.text.Spanned r0 = f303920b
            if (r0 == 0) goto L_0x0058
            goto L_0x0059
        L_0x0058:
            r0 = r2
        L_0x0059:
            if (r0 != 0) goto L_0x005c
            goto L_0x0096
        L_0x005c:
            java.lang.String r2 = r0.toString()
            int r2 = r2.length()
            r3 = 1
            if (r2 <= r3) goto L_0x0095
            java.lang.String r4 = r0.toString()
            boolean r1 = r4.endsWith(r1)
            if (r1 == 0) goto L_0x0095
            java.lang.Class<android.text.style.ParagraphStyle> r1 = android.text.style.ParagraphStyle.class
            java.lang.Object[] r1 = r0.getSpans(r2, r2, r1)
            int r1 = r1.length
            r4 = 0
            if (r1 <= 0) goto L_0x0084
            int r2 = r2 - r3
            java.lang.CharSequence r0 = r0.subSequence(r4, r2)
            r2 = r0
            android.text.Spanned r2 = (android.text.Spanned) r2
            goto L_0x0096
        L_0x0084:
            int r1 = r2 + -1
            java.lang.Class<za3.d$b> r3 = za3.C102991d.C102993b.class
            java.lang.Object[] r2 = r0.getSpans(r1, r2, r3)
            int r2 = r2.length
            if (r2 <= 0) goto L_0x0095
            java.lang.CharSequence r0 = r0.subSequence(r4, r1)
            android.text.Spanned r0 = (android.text.Spanned) r0
        L_0x0095:
            r2 = r0
        L_0x0096:
            sg.g<java.lang.String, android.text.Spanned> r0 = f303919a
            q90.d r0 = (q90.C101062d) r0
            r0.put(r5, r2)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: za3.C102988a.m136184a(java.lang.String):android.text.Spanned");
    }
}
