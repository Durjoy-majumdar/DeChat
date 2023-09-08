package ve1;

import cm1.C0734g2;
import com.tencent.p014mm.C0966R;
import jq3.C60896i;

/* renamed from: ve1.o8 */
public final class C14589o8 extends C60896i<C0734g2> {

    /* renamed from: e */
    public final String f40414e = "Finder.FinderTopicFilterConvert";

    /* renamed from: c */
    public int mo43c() {
        return C0966R.C0971layout.aqs;
    }

    /* JADX WARNING: type inference failed for: r7v12, types: [java.lang.CharSequence] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo44e(jq3.C60905o r4, jq3.C9493c r5, int r6, int r7, boolean r8, java.util.List r9) {
        /*
            r3 = this;
            cm1.g2 r5 = (cm1.C0734g2) r5
            java.lang.String r6 = "holder"
            gy3.C87412m.m108594g(r4, r6)
            java.lang.String r6 = "item"
            gy3.C87412m.m108594g(r5, r6)
            r6 = 2131315540(0x7f094b54, float:1.8249536E38)
            android.view.View r6 = r4.mo85812D(r6)
            r7 = 2131315558(0x7f094b66, float:1.8249573E38)
            android.view.View r7 = r4.mo85812D(r7)
            android.widget.TextView r7 = (android.widget.TextView) r7
            java.lang.String r8 = ""
            if (r7 != 0) goto L_0x0021
            goto L_0x004a
        L_0x0021:
            java.lang.Class<ny.h> r9 = p629ny.C76979h.class
            di3.d r9 = di3.C86312j.m106911c(r9)
            ny.h r9 = (p629ny.C76979h) r9
            android.content.Context r0 = r4.f173499A
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r2 = 35
            r1.append(r2)
            te3.sn1 r2 = r5.f1749d
            java.lang.String r2 = r2.f141617d
            if (r2 != 0) goto L_0x003c
            r2 = r8
        L_0x003c:
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            android.text.SpannableString r9 = r9.mo107057T1(r0, r1)
            r7.setText(r9)
        L_0x004a:
            boolean r9 = r5.f1751f
            if (r9 == 0) goto L_0x0082
            boolean r9 = r5.f1752g
            if (r9 == 0) goto L_0x0065
            if (r7 == 0) goto L_0x0077
            android.content.Context r4 = r4.f173499A
            android.content.res.Resources r4 = r4.getResources()
            r9 = 2131099684(0x7f060024, float:1.7811728E38)
            int r4 = r4.getColor(r9)
            r7.setTextColor(r4)
            goto L_0x0077
        L_0x0065:
            if (r7 == 0) goto L_0x0077
            android.content.Context r4 = r4.f173499A
            android.content.res.Resources r4 = r4.getResources()
            r9 = 2131099800(0x7f060098, float:1.7811963E38)
            int r4 = r4.getColor(r9)
            r7.setTextColor(r4)
        L_0x0077:
            android.text.TextPaint r4 = r7.getPaint()
            r9 = 1061997773(0x3f4ccccd, float:0.8)
            com.tencent.p014mm.p136ui.C85875k4.m106189j0(r4, r9)
            goto L_0x00b5
        L_0x0082:
            boolean r9 = r5.f1752g
            if (r9 == 0) goto L_0x0099
            if (r7 == 0) goto L_0x00ab
            android.content.Context r4 = r4.f173499A
            android.content.res.Resources r4 = r4.getResources()
            r9 = 2131099676(0x7f06001c, float:1.7811712E38)
            int r4 = r4.getColor(r9)
            r7.setTextColor(r4)
            goto L_0x00ab
        L_0x0099:
            if (r7 == 0) goto L_0x00ab
            android.content.Context r4 = r4.f173499A
            android.content.res.Resources r4 = r4.getResources()
            r9 = 2131099804(0x7f06009c, float:1.7811972E38)
            int r4 = r4.getColor(r9)
            r7.setTextColor(r4)
        L_0x00ab:
            android.text.TextPaint r4 = r7.getPaint()
            r9 = 1036831949(0x3dcccccd, float:0.1)
            com.tencent.p014mm.p136ui.C85875k4.m106189j0(r4, r9)
        L_0x00b5:
            if (r6 == 0) goto L_0x00c9
            r4 = 2131302588(0x7f0918bc, float:1.8223266E38)
            if (r7 == 0) goto L_0x00c1
            java.lang.CharSequence r7 = r7.getText()
            goto L_0x00c2
        L_0x00c1:
            r7 = 0
        L_0x00c2:
            if (r7 != 0) goto L_0x00c5
            goto L_0x00c6
        L_0x00c5:
            r8 = r7
        L_0x00c6:
            r6.setTag(r4, r8)
        L_0x00c9:
            java.lang.String r4 = r3.f40414e
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "item hash:"
            r6.append(r7)
            int r7 = r5.hashCode()
            r6.append(r7)
            java.lang.String r7 = ", topic:"
            r6.append(r7)
            te3.sn1 r7 = r5.f1749d
            java.lang.String r7 = r7.f141617d
            r6.append(r7)
            java.lang.String r7 = ", selected:"
            r6.append(r7)
            boolean r5 = r5.f1751f
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ve1.C14589o8.mo44e(jq3.o, jq3.c, int, int, boolean, java.util.List):void");
    }
}
