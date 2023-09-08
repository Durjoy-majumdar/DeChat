package d60;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C75044y4;
import d60.C58124b;
import gy3.C87412m;

/* renamed from: d60.x0 */
public final class C7232x0 extends C58121a {

    /* renamed from: f */
    public final C58124b f25297f;

    /* renamed from: g */
    public final View f25298g;

    /* renamed from: h */
    public final View f25299h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C7232x0(ViewGroup viewGroup, C58124b bVar) {
        super(viewGroup, bVar);
        C87412m.m108594g(viewGroup, "root");
        C87412m.m108594g(bVar, "statueMonitor");
        this.f25297f = bVar;
        View findViewById = viewGroup.findViewById(C0966R.C0970id.fyh);
        this.f25298g = findViewById;
        this.f25299h = viewGroup.findViewById(C0966R.C0970id.fyj);
        if (!mo82893g0()) {
            findViewById.getLayoutParams().height += C75044y4.m89991c(viewGroup.getContext());
        }
    }

    /* renamed from: u0 */
    public void mo3210u0(C58124b.C58125b bVar, Bundle bundle) {
        C87412m.m108594g(bVar, "status");
        int ordinal = bVar.ordinal();
        if (ordinal != 5) {
            boolean z = true;
            if (ordinal != 6) {
                if (ordinal == 7) {
                    mo10792g(0);
                    return;
                } else if (!(ordinal == 27 || ordinal == 28)) {
                    if (ordinal == 39 && this.f25297f.getLiveRole() == 0) {
                        if (bundle == null || !bundle.getBoolean("PARAM_IS_ENTERING_COMMENT")) {
                            z = false;
                        }
                        if (z) {
                            mo10792g(4);
                            return;
                        } else {
                            mo10792g(0);
                            return;
                        }
                    } else {
                        return;
                    }
                }
            } else if (this.f25297f.getLiveRole() != 1) {
                mo10792g(4);
                return;
            } else {
                return;
            }
        }
        mo10792g(4);
    }

    /* renamed from: x0 */
    public final Rect[] mo8399x0() {
        int[] iArr = new int[2];
        this.f25298g.getLocationOnScreen(iArr);
        int i = iArr[0];
        Rect rect = new Rect(i, iArr[1], this.f25298g.getWidth() + i, iArr[1] + this.f25298g.getHeight());
        this.f25299h.getLocationOnScreen(iArr);
        int i2 = iArr[0];
        return new Rect[]{rect, new Rect(i2, iArr[1], this.f25299h.getWidth() + i2, iArr[1] + this.f25299h.getHeight())};
    }
}
