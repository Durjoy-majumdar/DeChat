package no1;

import android.view.View;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;

/* renamed from: no1.g */
public final class C11242g extends C11240e {

    /* renamed from: f */
    public Integer f33144f;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C11242g(androidx.appcompat.app.AppCompatActivity r12, androidx.fragment.app.Fragment r13, java.lang.Integer r14, java.util.List r15, java.lang.String r16, int r17, gy3.C8480h r18) {
        /*
            r11 = this;
            r0 = r17 & 4
            r1 = 0
            if (r0 == 0) goto L_0x0007
            r0 = r1
            goto L_0x0008
        L_0x0007:
            r0 = r14
        L_0x0008:
            r2 = r17 & 8
            if (r2 == 0) goto L_0x000e
            r6 = r1
            goto L_0x000f
        L_0x000e:
            r6 = r15
        L_0x000f:
            r1 = r17 & 16
            if (r1 == 0) goto L_0x0017
            java.lang.String r1 = ""
            r8 = r1
            goto L_0x0019
        L_0x0017:
            r8 = r16
        L_0x0019:
            java.lang.String r1 = "activity"
            r2 = r12
            gy3.C87412m.m108594g(r12, r1)
            java.lang.String r1 = "name"
            gy3.C87412m.m108594g(r8, r1)
            r7 = 0
            r9 = 8
            r10 = 0
            r3 = r11
            r4 = r12
            r5 = r13
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            r1 = r11
            r1.f33144f = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: no1.C11242g.<init>(androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.Fragment, java.lang.Integer, java.util.List, java.lang.String, int, gy3.h):void");
    }

    /* renamed from: a */
    public void mo11313a() {
        for (View view : this.f33142e) {
            Integer num = this.f33144f;
            WeImageView weImageView = null;
            if (num != null) {
                int intValue = num.intValue();
                if (view instanceof WeImageView) {
                    weImageView = (WeImageView) view;
                }
                if (weImageView != null) {
                    weImageView.setIconColor(intValue);
                }
            } else {
                boolean z = view instanceof WeImageView;
                WeImageView weImageView2 = z ? (WeImageView) view : null;
                if (weImageView2 != null) {
                    weImageView2.setIconColor(0);
                }
                if (z) {
                    weImageView = (WeImageView) view;
                }
                if (weImageView != null) {
                    weImageView.clearColorFilter();
                }
            }
        }
    }
}
