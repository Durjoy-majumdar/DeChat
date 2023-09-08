package cl1;

import al1.C54130j;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import dl1.C58321a;
import fj1.C45795b;
import gi1.C59463a;
import gi1.C59464c;
import gy3.C87412m;
import java.util.LinkedList;
import nj3.C76912y0;

/* renamed from: cl1.c0 */
public final class C54949c0 extends C39970c<C45795b> {

    /* renamed from: f */
    public final LinkedList<C59463a> f153996f = new LinkedList<>();

    /* renamed from: g */
    public C58321a f153997g = C58321a.NORMAL_4_MODE;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C54949c0(C45795b bVar) {
        super(bVar);
        C87412m.m108594g(bVar, "liveContext");
    }

    /* renamed from: c3 */
    public final boolean mo75862c3(boolean z) {
        int i;
        Class cls = C54963d0.class;
        C54963d0 d0Var = (C54963d0) business(cls);
        C59464c value = d0Var.f154077t.getValue();
        if (value != null && value.f169898c == 0 && d0Var.mo75906M3() >= d0Var.mo75907N3()) {
            if (z) {
                C76912y0.makeText(MMApplicationContext.getContext(), (CharSequence) MMApplicationContext.getContext().getResources().getString(C0966R.string.dq7, new Object[]{Integer.valueOf(((C54963d0) business(cls)).mo75907N3())}), 0).show();
            }
            Log.m105924i("LiveLinkMicLogicSlice", "anchorAcceptVisitorValidCheck normal mode over size");
            return false;
        }
        C54963d0 d0Var2 = (C54963d0) business(cls);
        C59464c value2 = d0Var2.f154077t.getValue();
        if (value2 != null && ((i = value2.f169898c) == 2 || i == 3) && d0Var2.mo75906M3() >= 8) {
            if (z) {
                C76912y0.makeText(MMApplicationContext.getContext(), (CharSequence) MMApplicationContext.getContext().getResources().getString(C0966R.string.dq7, new Object[]{8}), 0).show();
            }
            Log.m105924i("LiveLinkMicLogicSlice", "anchorAcceptVisitorValidCheck grab mode over size");
            return false;
        }
        C54963d0 d0Var3 = (C54963d0) business(cls);
        C59464c value3 = d0Var3.f154077t.getValue();
        if (!(value3 != null && value3.f169898c == 1 && d0Var3.mo75906M3() >= 3)) {
            return true;
        }
        if (z) {
            C76912y0.makeText(MMApplicationContext.getContext(), (CharSequence) MMApplicationContext.getContext().getResources().getString(C0966R.string.hss), 0).show();
        }
        Log.m105924i("LiveLinkMicLogicSlice", "anchorAcceptVisitorValidCheck focus mode over size");
        return false;
    }

    /* renamed from: d3 */
    public final C58321a mo75863d3(int i, int i2) {
        return i != 1 ? i != 2 ? i != 3 ? ((C54963d0) business(C54963d0.class)).f154073p != null ? C58321a.NORMAL_PK_MODE : i2 <= 4 ? C58321a.NORMAL_4_MODE : C58321a.NORMAL_5_9_MULTI_MODE : C58321a.GRAB_FOCUS_9_MODE : C58321a.GRAB_9_MODE : C58321a.NORMAL_FOCUS;
    }

    /* renamed from: e3 */
    public final boolean mo75864e3() {
        return ((C54991o) business(C54991o.class)).f154273W1;
    }

    /* renamed from: f3 */
    public final boolean mo75865f3() {
        C54963d0 d0Var = (C54963d0) business(C54963d0.class);
        C54130j jVar = d0Var.f154073p;
        return (jVar != null && jVar.f152004h) || d0Var.f154078u == 5;
    }

    /* renamed from: g3 */
    public final boolean mo75866g3() {
        int ordinal = this.f153997g.ordinal();
        return ordinal == 2 || ordinal == 5 || ordinal == 6;
    }
}
