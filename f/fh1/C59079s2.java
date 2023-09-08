package fh1;

import android.view.View;
import android.view.ViewGroup;
import android.widget.Space;
import cl1.C39981t0;
import cl1.C54963d0;
import cl1.C54991o;
import cl1.C55004v1;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.live.controller.base.LiveRoomControllerStore;
import com.tencent.p014mm.plugin.finder.live.model.FinderLiveService;
import di1.C7333c;
import gh1.C8313a;
import gi1.C59463a;
import gi1.C59464c;
import gy3.C87412m;
import j50.C60735a;
import java.util.LinkedList;
import o40.C61926c;
import ok1.C62042e;

/* renamed from: fh1.s2 */
public final class C59079s2 extends C8313a {

    /* renamed from: j */
    public ViewGroup f169026j;

    /* renamed from: n */
    public Space f169027n;

    /* renamed from: o */
    public Space f169028o;

    /* renamed from: p */
    public int f169029p;

    /* renamed from: q */
    public int f169030q;

    /* renamed from: r */
    public View f169031r;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59079s2(LiveRoomControllerStore liveRoomControllerStore) {
        super(liveRoomControllerStore);
        C87412m.m108594g(liveRoomControllerStore, "store");
    }

    /* renamed from: m3 */
    public static void m69007m3(C59079s2 s2Var, boolean z, boolean z2, boolean z3, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        if ((i & 4) != 0) {
            z3 = false;
        }
        s2Var.getClass();
        C61926c.m72668M(new C59076r2(s2Var, z3, z2, z));
    }

    /* renamed from: n3 */
    public final boolean mo84287n3() {
        LinkedList<C59463a> linkedList;
        Class cls = C54963d0.class;
        C59464c value = ((C54963d0) business(cls)).f154077t.getValue();
        boolean z = !(value != null && value.f169898c == 1);
        C59464c value2 = ((C54963d0) business(cls)).f154077t.getValue();
        boolean z2 = ((value2 == null || (linkedList = value2.f169896a) == null) ? 1 : linkedList.size()) > 1;
        boolean z3 = ((C55004v1) business(C55004v1.class)).f154438i.size() > 0;
        C7333c<Boolean> cVar = ((C39981t0) business(C39981t0.class)).f107198j;
        boolean b = cVar != null ? C87412m.m108589b(cVar.getValue(), Boolean.TRUE) : false;
        if ((!C62042e.f176370a.mo87030O0() || !z2 || !z) && !z3) {
            FinderLiveService.f159376d.getClass();
            C60735a aVar = FinderLiveService.f159378f;
            if (!(aVar != null && aVar.mo85682Z()) || !z || b) {
                C60735a aVar2 = FinderLiveService.f159378f;
                if (!(aVar2 != null && !aVar2.mo85682Z()) || !((C54991o) business(C54991o.class)).mo75992a4()) {
                    return false;
                }
            }
        }
        return true;
    }

    /* renamed from: o3 */
    public final void mo84288o3(int i) {
        ViewGroup.LayoutParams layoutParams;
        ViewGroup.LayoutParams layoutParams2;
        Space space = this.f169027n;
        if (!(space == null || (layoutParams2 = space.getLayoutParams()) == null)) {
            layoutParams2.height = i;
        }
        Space space2 = this.f169028o;
        if (space2 != null && (layoutParams = space2.getLayoutParams()) != null) {
            layoutParams.height = i;
        }
    }

    public void onLiveActivate() {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
        r0 = r0.getLayoutParams();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onLiveDeactivate() {
        /*
            r2 = this;
            super.onLiveDeactivate()
            android.widget.Space r0 = r2.f169027n
            r1 = 0
            if (r0 == 0) goto L_0x0011
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            if (r0 == 0) goto L_0x0011
            int r0 = r0.height
            goto L_0x0012
        L_0x0011:
            r0 = 0
        L_0x0012:
            if (r0 <= 0) goto L_0x001e
            r2.mo84288o3(r1)
            android.view.View r0 = r2.f169031r
            if (r0 == 0) goto L_0x001e
            r0.requestLayout()
        L_0x001e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: fh1.C59079s2.onLiveDeactivate():void");
    }

    public void onLiveStartFromWindow() {
        mo84288o3(this.f169029p);
    }

    public void onViewMount(ViewGroup viewGroup) {
        C87412m.m108594g(viewGroup, "pluginLayout");
        this.f169026j = viewGroup;
        this.f169027n = (Space) viewGroup.findViewById(C0966R.C0970id.o4w);
        this.f169031r = viewGroup.findViewById(C0966R.C0970id.dwj);
        this.f169028o = (Space) viewGroup.findViewById(C0966R.C0970id.o4v);
        this.f169030q = 0;
    }
}
