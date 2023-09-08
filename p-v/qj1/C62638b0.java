package qj1;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import cl1.C54991o;
import com.tencent.p014mm.p136ui.MMActivity;
import d60.C58124b;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import ob0.C11385n;
import ob0.C117747y;
import rx3.C13598b0;
import te3.C49712hj1;
import wg1.C66032j;
import wg1.C66034k;
import wg1.C66041l;
import wg1.C66043m;

/* renamed from: qj1.b0 */
public final class C62638b0 extends C62660c implements C11385n {

    /* renamed from: p */
    public final C58124b f177892p;

    /* renamed from: q */
    public C66032j f177893q;

    /* renamed from: r */
    public C66034k f177894r;

    /* renamed from: qj1.b0$a */
    public static final class C62639a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C66043m f177895d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C62639a(C66043m mVar) {
            super(0);
            this.f177895d = mVar;
        }

        public Object invoke() {
            View view = this.f177895d.f189861d;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/live/component/FinderLiveAllowanceGiftCardViewCallback", "hideCardView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/finder/live/component/FinderLiveAllowanceGiftCardViewCallback", "hideCardView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C62638b0(ViewGroup viewGroup, C58124b bVar) {
        super(viewGroup, bVar, (C49712hj1) null);
        C87412m.m108594g(viewGroup, "root");
        C87412m.m108594g(bVar, "statusMonitor");
        this.f177892p = bVar;
        Context context = viewGroup.getContext();
        C87412m.m108593f(context, "root.context");
        this.f177893q = new C66041l(context, mo87684A0(), bVar);
        Context context2 = viewGroup.getContext();
        C87412m.m108592e(context2, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        C66043m mVar = new C66043m(viewGroup, (MMActivity) context2, this.f177893q);
        C66032j jVar = this.f177893q;
        if (jVar != null) {
            jVar.onAttach(mVar);
        }
        mVar.f189866i = new C62639a(mVar);
        this.f177894r = mVar;
    }

    /* renamed from: b */
    public boolean mo3200b() {
        return true;
    }

    /* renamed from: h */
    public boolean mo3206h() {
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0011, code lost:
        r1 = r1.getResources();
     */
    /* renamed from: i0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo8357i0() {
        /*
            r3 = this;
            wg1.k r0 = r3.f177894r
            if (r0 == 0) goto L_0x0023
            wg1.m r0 = (wg1.C66043m) r0
            android.view.View r0 = r0.f189865h
            if (r0 != 0) goto L_0x000b
            goto L_0x0023
        L_0x000b:
            android.content.Context r1 = r0.getContext()
            if (r1 == 0) goto L_0x001f
            android.content.res.Resources r1 = r1.getResources()
            if (r1 == 0) goto L_0x001f
            r2 = 2131232490(0x7f0806ea, float:1.808109E38)
            android.graphics.drawable.Drawable r1 = r1.getDrawable(r2)
            goto L_0x0020
        L_0x001f:
            r1 = 0
        L_0x0020:
            r0.setBackground(r1)
        L_0x0023:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: qj1.C62638b0.mo8357i0():void");
    }

    /* renamed from: m */
    public boolean mo3208m() {
        return ((C54991o) mo87696x0(C54991o.class)).f154287Z0 != 1;
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
    }

    /* renamed from: u0 */
    public void mo3210u0(C58124b.C58125b bVar, Bundle bundle) {
        C66034k kVar;
        C66034k kVar2;
        C66032j jVar;
        C66034k kVar3;
        C87412m.m108594g(bVar, "status");
        int ordinal = bVar.ordinal();
        if (ordinal == 202) {
            C66032j jVar2 = this.f177893q;
            if (jVar2 != null && (kVar = ((C66041l) jVar2).f189859f) != null) {
                kVar.mo90065i0();
            }
        } else if (ordinal == 204) {
            C66032j jVar3 = this.f177893q;
            if (jVar3 != null && (kVar2 = ((C66041l) jVar3).f189859f) != null) {
                kVar2.mo90064f0();
            }
        } else if (ordinal == 205 && (jVar = this.f177893q) != null && (kVar3 = ((C66041l) jVar).f189859f) != null) {
            kVar3.mo90063B0();
        }
    }

    /* renamed from: w0 */
    public void mo3211w0() {
        View view;
        super.mo3211w0();
        C66034k kVar = this.f177894r;
        if (kVar != null && (view = ((C66043m) kVar).f189865h) != null) {
            view.setBackground((Drawable) null);
        }
    }
}
