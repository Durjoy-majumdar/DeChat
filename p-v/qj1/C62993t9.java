package qj1;

import android.graphics.Rect;
import android.view.View;
import cl1.C54991o;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.live.bubble.LinearBubbleAnimateContainer;
import com.tencent.p014mm.sdk.platformtools.Log;
import d60.C58124b;
import gy3.C87412m;
import java.util.LinkedHashMap;
import o40.C61926c;
import ok1.C62042e;
import te3.C49712hj1;

/* renamed from: qj1.t9 */
public final class C62993t9 extends C62660c {

    /* renamed from: p */
    public final LinearBubbleAnimateContainer f178740p;

    /* renamed from: q */
    public final C58124b f178741q;

    /* renamed from: r */
    public int f178742r;

    /* renamed from: qj1.t9$a */
    public static final class C62994a implements View.OnLayoutChangeListener {

        /* renamed from: d */
        public final /* synthetic */ C62993t9 f178743d;

        public C62994a(C62993t9 t9Var) {
            this.f178743d = t9Var;
        }

        public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            if (i != i5 || i2 != i6 || i3 != i7 || i4 != i8) {
                Log.m105924i("FinderLiveLeftBubbleAreaPlugin", "addOnLayoutChangeListener change");
                C62993t9 t9Var = this.f178743d;
                t9Var.getClass();
                C61926c.m72668M(new C63029u9(t9Var));
                this.f178743d.f178740p.mo77558c();
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C62993t9(LinearBubbleAnimateContainer linearBubbleAnimateContainer, C58124b bVar) {
        super(linearBubbleAnimateContainer, bVar, (C49712hj1) null);
        C87412m.m108594g(linearBubbleAnimateContainer, "container");
        C87412m.m108594g(bVar, "statusMonitor");
        this.f178740p = linearBubbleAnimateContainer;
        this.f178741q = bVar;
        linearBubbleAnimateContainer.addOnLayoutChangeListener(new C62994a(this));
        if (mo82893g0()) {
            linearBubbleAnimateContainer.setTranslationX(((float) C62042e.f176370a.mo87080g0(this)) - ((float) ((int) linearBubbleAnimateContainer.getContext().getResources().getDimension(C0966R.dimen.f3703bv))));
        }
    }

    /* renamed from: b */
    public boolean mo3200b() {
        return true;
    }

    /* renamed from: h */
    public boolean mo3206h() {
        return true;
    }

    /* renamed from: m */
    public boolean mo3208m() {
        return ((C54991o) mo87696x0(C54991o.class)).f154287Z0 != 2;
    }

    /* renamed from: m0 */
    public void mo11992m0(LinkedHashMap<String, Rect> linkedHashMap) {
        C87412m.m108594g(linkedHashMap, "micUserMap");
        this.f178742r = linkedHashMap.size();
        C61926c.m72668M(new C63029u9(this));
    }
}
