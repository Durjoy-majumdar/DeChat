package o04;

import g04.C20770i;
import gy3.C8480h;
import gy3.C87412m;
import java.util.List;
import n04.C25122g1;
import n04.C25144j1;
import n04.C25158m1;
import n04.C25176s0;
import n04.C25198y1;
import p04.C25413f;
import p04.C25417j;
import q04.C25521d;
import q04.C35757b;
import sx3.C64186f0;

/* renamed from: o04.g */
public final class C25326g extends C25176s0 implements C25521d {

    /* renamed from: e */
    public final C35757b f71825e;

    /* renamed from: f */
    public final C25327i f71826f;

    /* renamed from: g */
    public final C25198y1 f71827g;

    /* renamed from: h */
    public final C25122g1 f71828h;

    /* renamed from: i */
    public final boolean f71829i;

    /* renamed from: j */
    public final boolean f71830j;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C25326g(q04.C35757b r8, o04.C25327i r9, n04.C25198y1 r10, n04.C25122g1 r11, boolean r12, boolean r13, int r14, gy3.C8480h r15) {
        /*
            r7 = this;
            r15 = r14 & 8
            if (r15 == 0) goto L_0x000b
            n04.g1$a r11 = n04.C25122g1.f71557e
            r11.getClass()
            n04.g1 r11 = n04.C25122g1.f71558f
        L_0x000b:
            r4 = r11
            r11 = r14 & 16
            r15 = 0
            if (r11 == 0) goto L_0x0013
            r5 = 0
            goto L_0x0014
        L_0x0013:
            r5 = r12
        L_0x0014:
            r11 = r14 & 32
            if (r11 == 0) goto L_0x001a
            r6 = 0
            goto L_0x001b
        L_0x001a:
            r6 = r13
        L_0x001b:
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o04.C25326g.<init>(q04.b, o04.i, n04.y1, n04.g1, boolean, boolean, int, gy3.h):void");
    }

    /* renamed from: I0 */
    public List<C25158m1> mo37079I0() {
        return C64186f0.f181907d;
    }

    /* renamed from: J0 */
    public C25122g1 mo37080J0() {
        return this.f71828h;
    }

    /* renamed from: K0 */
    public C25144j1 mo37081K0() {
        return this.f71826f;
    }

    /* renamed from: L0 */
    public boolean mo37082L0() {
        return this.f71829i;
    }

    /* renamed from: O0 */
    public C25198y1 mo37084O0(boolean z) {
        return new C25326g(this.f71825e, this.f71826f, this.f71827g, this.f71828h, z, false, 32, (C8480h) null);
    }

    /* renamed from: R0 */
    public C25176s0 mo37086R0(boolean z) {
        return new C25326g(this.f71825e, this.f71826f, this.f71827g, this.f71828h, z, false, 32, (C8480h) null);
    }

    /* renamed from: S0 */
    public C25176s0 mo37087S0(C25122g1 g1Var) {
        C87412m.m108594g(g1Var, "newAttributes");
        return new C25326g(this.f71825e, this.f71826f, this.f71827g, g1Var, this.f71829i, this.f71830j);
    }

    /* renamed from: T0 */
    public C25326g mo37085P0(C25323e eVar) {
        C87412m.m108594g(eVar, "kotlinTypeRefiner");
        C35757b bVar = this.f71825e;
        C25327i c = this.f71826f.mo37093n(eVar);
        C25198y1 y1Var = this.f71827g;
        return new C25326g(bVar, c, y1Var != null ? eVar.mo52414h(y1Var).mo52229N0() : null, this.f71828h, this.f71829i, false, 32, (C8480h) null);
    }

    /* renamed from: n */
    public C20770i mo37088n() {
        return C25417j.m32696a(C25413f.CAPTURED_TYPE_SCOPE, true, new String[0]);
    }

    public C25326g(C35757b bVar, C25327i iVar, C25198y1 y1Var, C25122g1 g1Var, boolean z, boolean z2) {
        C87412m.m108594g(bVar, "captureStatus");
        C87412m.m108594g(iVar, "constructor");
        C87412m.m108594g(g1Var, "attributes");
        this.f71825e = bVar;
        this.f71826f = iVar;
        this.f71827g = y1Var;
        this.f71828h = g1Var;
        this.f71829i = z;
        this.f71830j = z2;
    }
}
