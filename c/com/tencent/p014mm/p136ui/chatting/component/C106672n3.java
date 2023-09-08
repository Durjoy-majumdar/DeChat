package com.tencent.p014mm.p136ui.chatting.component;

import android.app.Activity;
import ck3.C67391b;
import di3.C86312j;
import eb0.C31543z5;
import p270xi.C53356d;
import p270xi.C91212b;
import p498dv.C75457c;
import p640ox.C77049b;
import te3.C110961f13;
import te3.C110964i13;
import te3.C27675g13;
import zj3.C112642j0;

@C91212b(exportInterface = C112642j0.class)
/* renamed from: com.tencent.mm.ui.chatting.component.n3 */
public final class C106672n3 extends C73412a implements C53356d {

    /* renamed from: e */
    public C67391b f318906e;

    /* renamed from: F4 */
    public void mo26186F4() {
    }

    /* renamed from: G4 */
    public void mo26160G4() {
    }

    /* renamed from: g5 */
    public void mo70046g5() {
        Activity f;
        C110964i13 i132;
        C67391b bVar = this.f318906e;
        if (bVar != null && (f = bVar.mo91565f()) != null && ((C75457c) C86312j.m106911c(C75457c.class)).V10(f) && (i132 = (C110964i13) ((C77049b) C86312j.m106911c(C77049b.class)).Wi0(f, 5, C110964i13.class)) != null) {
            i132.f332066p = true;
            C27675g13 g132 = i132.f332064n;
            if (g132 != null) {
                g132.f76617j = 1;
                if (C31543z5.m39453c() >= i132.f332058e) {
                    g132.f76616i += C31543z5.m39453c() - i132.f332058e;
                    i132.f332058e = C31543z5.m39453c();
                }
            }
            C110961f13 f132 = i132.f332067q;
            if (f132 != null && C31543z5.m39453c() >= f132.f331966d) {
                f132.f331969g += C31543z5.m39453c() - f132.f331966d;
                f132.f331966d = C31543z5.m39453c();
            }
            C110961f13 f133 = i132.f332069s;
            if (f133 != null && C31543z5.m39453c() >= f133.f331966d) {
                f133.f331969g += C31543z5.m39453c() - f133.f331966d;
                f133.f331966d = C31543z5.m39453c();
            }
            C110961f13 f134 = i132.f332068r;
            if (f134 != null && C31543z5.m39453c() >= f134.f331966d) {
                f134.f331969g += C31543z5.m39453c() - f134.f331966d;
                f134.f331966d = C31543z5.m39453c();
            }
        }
    }

    /* renamed from: l2 */
    public void mo70047l2() {
        super.mo70047l2();
    }

    /* renamed from: n2 */
    public void mo26199n2() {
        Activity f;
        C110964i13 i132;
        C67391b bVar = this.f318906e;
        if (bVar != null && (f = bVar.mo91565f()) != null && ((C75457c) C86312j.m106911c(C75457c.class)).V10(f) && (i132 = (C110964i13) ((C77049b) C86312j.m106911c(C77049b.class)).Wi0(f, 5, C110964i13.class)) != null) {
            i132.f332066p = false;
            i132.f332058e = C31543z5.m39453c();
            C110961f13 f132 = i132.f332068r;
            if (f132 != null) {
                f132.f331966d = C31543z5.m39453c();
            }
            C110961f13 f133 = i132.f332067q;
            if (f133 != null) {
                f133.f331966d = C31543z5.m39453c();
            }
            C110961f13 f134 = i132.f332069s;
            if (f134 != null) {
                f134.f331966d = C31543z5.m39453c();
            }
        }
    }

    /* renamed from: u2 */
    public void mo70142u2(C67391b bVar) {
        super.mo70142u2(bVar);
        this.f318906e = bVar;
    }
}
