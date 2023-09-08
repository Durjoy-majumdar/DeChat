package ce1;

import android.text.TextWatcher;

/* renamed from: ce1.y */
public final class C0496y implements TextWatcher {

    /* renamed from: d */
    public final /* synthetic */ C0479p f1220d;

    public C0496y(C0479p pVar) {
        this.f1220d = pVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0003, code lost:
        r7 = r7.toString();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void afterTextChanged(android.text.Editable r7) {
        /*
            r6 = this;
            r0 = 0
            if (r7 == 0) goto L_0x000e
            java.lang.String r7 = r7.toString()
            if (r7 == 0) goto L_0x000e
            int r7 = r7.length()
            goto L_0x000f
        L_0x000e:
            r7 = 0
        L_0x000f:
            ce1.p$b r1 = ce1.C0479p.f1167N
            int r2 = ce1.C0479p.C0481b.m427a(r1)
            int r2 = r2 + -10
            int r3 = ce1.C0479p.C0481b.m427a(r1)
            r4 = 1
            if (r7 >= r3) goto L_0x0022
            if (r2 > r7) goto L_0x0022
            r2 = 1
            goto L_0x0023
        L_0x0022:
            r2 = 0
        L_0x0023:
            r3 = 2131099804(0x7f06009c, float:1.7811972E38)
            if (r2 == 0) goto L_0x0052
            ce1.p r2 = r6.f1220d
            android.widget.TextView r5 = r2.f1197v
            if (r5 == 0) goto L_0x0039
            android.content.res.Resources r2 = r2.getResources()
            int r2 = r2.getColor(r3)
            r5.setTextColor(r2)
        L_0x0039:
            ce1.p r2 = r6.f1220d
            android.widget.TextView r2 = r2.f1197v
            if (r2 != 0) goto L_0x0040
            goto L_0x004c
        L_0x0040:
            int r1 = ce1.C0479p.C0481b.m427a(r1)
            int r1 = r1 - r7
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r2.setText(r1)
        L_0x004c:
            ce1.p r1 = r6.f1220d
            ce1.C0479p.m420c3(r1, r4)
            goto L_0x00bd
        L_0x0052:
            int r2 = ce1.C0479p.C0481b.m427a(r1)
            java.lang.String r5 = ""
            if (r7 != r2) goto L_0x007b
            ce1.p r1 = r6.f1220d
            android.widget.TextView r2 = r1.f1197v
            if (r2 == 0) goto L_0x006b
            android.content.res.Resources r1 = r1.getResources()
            int r1 = r1.getColor(r3)
            r2.setTextColor(r1)
        L_0x006b:
            ce1.p r1 = r6.f1220d
            android.widget.TextView r1 = r1.f1197v
            if (r1 != 0) goto L_0x0072
            goto L_0x0075
        L_0x0072:
            r1.setText(r5)
        L_0x0075:
            ce1.p r1 = r6.f1220d
            ce1.C0479p.m420c3(r1, r0)
            goto L_0x00bd
        L_0x007b:
            int r2 = ce1.C0479p.C0481b.m427a(r1)
            if (r7 <= r2) goto L_0x00ae
            ce1.p r2 = r6.f1220d
            android.widget.TextView r3 = r2.f1197v
            if (r3 == 0) goto L_0x0095
            android.content.res.Resources r2 = r2.getResources()
            r5 = 2131099897(0x7f0600f9, float:1.781216E38)
            int r2 = r2.getColor(r5)
            r3.setTextColor(r2)
        L_0x0095:
            ce1.p r2 = r6.f1220d
            android.widget.TextView r2 = r2.f1197v
            if (r2 != 0) goto L_0x009c
            goto L_0x00a8
        L_0x009c:
            int r1 = ce1.C0479p.C0481b.m427a(r1)
            int r1 = r1 - r7
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r2.setText(r1)
        L_0x00a8:
            ce1.p r1 = r6.f1220d
            ce1.C0479p.m420c3(r1, r4)
            goto L_0x00bd
        L_0x00ae:
            ce1.p r1 = r6.f1220d
            android.widget.TextView r1 = r1.f1197v
            if (r1 != 0) goto L_0x00b5
            goto L_0x00b8
        L_0x00b5:
            r1.setText(r5)
        L_0x00b8:
            ce1.p r1 = r6.f1220d
            ce1.C0479p.m420c3(r1, r0)
        L_0x00bd:
            ce1.p r1 = r6.f1220d
            com.tencent.mm.ui.widget.MMEditText r2 = r1.f1183e
            if (r2 == 0) goto L_0x00d8
            android.text.Editable r2 = r2.getText()
            if (r2 == 0) goto L_0x00ce
            int r2 = r2.length()
            goto L_0x00cf
        L_0x00ce:
            r2 = 0
        L_0x00cf:
            ce1.C0479p.m421d3(r1, r2, r7)
            ce1.p r7 = r6.f1220d
            r7.mo535i3(r0, r0)
            return
        L_0x00d8:
            java.lang.String r7 = "nameEdit"
            gy3.C87412m.m108603p(r7)
            r7 = 0
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: ce1.C0496y.afterTextChanged(android.text.Editable):void");
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
