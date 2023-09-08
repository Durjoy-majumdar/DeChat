package lj1;

import com.tencent.p014mm.plugin.finder.view.C4191v0;
import gy3.C87412m;
import kj1.C10125e1;

/* renamed from: lj1.c */
public abstract class C10535c extends C10536d {

    /* renamed from: g */
    public final String f31808g = "MoreActionCustomItem";

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C10535c(C10125e1 e1Var, int i) {
        super(e1Var, i);
        C87412m.m108594g(e1Var, "helper");
    }

    /* JADX WARNING: type inference failed for: r3v1, types: [android.content.Context] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo10798m(com.tencent.p014mm.plugin.finder.view.C4191v0 r11) {
        /*
            r10 = this;
            java.lang.String r0 = "bottomSheet"
            gy3.C87412m.m108594g(r11, r0)
            boolean r0 = r10.mo10519k()
            r1 = 0
            if (r0 == 0) goto L_0x0048
            kj1.e1 r0 = r10.f31809a
            r10.mo10520n(r0, r11)
            zj1.b r2 = zj1.C16217b.f43438a
            java.lang.String r0 = r10.mo10518g()
            r2.mo14751g(r0)
            java.lang.Integer r0 = r10.mo10521o()
            if (r0 == 0) goto L_0x006d
            int r0 = r0.intValue()
            android.view.View r3 = r11.f18463f
            android.content.Context r3 = r3.getContext()
            boolean r4 = r3 instanceof androidx.appcompat.app.AppCompatActivity
            if (r4 == 0) goto L_0x0031
            r1 = r3
            androidx.appcompat.app.AppCompatActivity r1 = (androidx.appcompat.app.AppCompatActivity) r1
        L_0x0031:
            r3 = r1
            if (r3 != 0) goto L_0x0035
            goto L_0x006d
        L_0x0035:
            android.view.View r11 = r11.f18463f
            android.view.View r5 = r11.findViewById(r0)
            java.lang.String r4 = r10.mo10518g()
            r6 = 0
            r7 = 0
            r8 = 24
            r9 = 0
            zj1.C16217b.m15108i(r2, r3, r4, r5, r6, r7, r8, r9)
            goto L_0x006d
        L_0x0048:
            java.lang.String r11 = r10.f31808g
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "add item "
            r0.append(r2)
            java.lang.Class r2 = r10.getClass()
            java.lang.String r2 = r2.getName()
            r0.append(r2)
            java.lang.String r2 = " failed as it is not enabled"
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            int r2 = p213oh.C11412b.f33577a
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r11, r0, r1)
        L_0x006d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: lj1.C10535c.mo10798m(com.tencent.mm.plugin.finder.view.v0):void");
    }

    /* renamed from: n */
    public abstract void mo10520n(C10125e1 e1Var, C4191v0 v0Var);

    /* renamed from: o */
    public Integer mo10521o() {
        return null;
    }
}
