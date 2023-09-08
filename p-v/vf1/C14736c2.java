package vf1;

import android.content.Context;
import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.feed.p052ui.FinderLiveCreateVisitorModeUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.util.ArrayList;
import nj3.C76912y0;
import o40.C61926c;
import p599lr.C61381b;
import rx3.C13598b0;
import u60.C65220d;
import u60.C65231j;
import u60.C65234n;
import uq1.C65458r;
import zc1.C66785b;

/* renamed from: vf1.c2 */
public final class C14736c2 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ FinderLiveCreateVisitorModeUI f40705d;

    /* renamed from: vf1.c2$a */
    public static final class C14737a implements C65231j<C65220d> {

        /* renamed from: a */
        public final /* synthetic */ FinderLiveCreateVisitorModeUI f40706a;

        /* renamed from: vf1.c2$a$a */
        public static final class C14738a extends C87413o implements C32224a<C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ FinderLiveCreateVisitorModeUI f40707d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C14738a(FinderLiveCreateVisitorModeUI finderLiveCreateVisitorModeUI) {
                super(0);
                this.f40707d = finderLiveCreateVisitorModeUI;
            }

            public Object invoke() {
                C76912y0.makeText((Context) this.f40707d, (CharSequence) MMApplicationContext.getContext().getResources().getString(C0966R.string.dk_), 0).show();
                return C13598b0.f38549a;
            }
        }

        public C14737a(FinderLiveCreateVisitorModeUI finderLiveCreateVisitorModeUI) {
            this.f40706a = finderLiveCreateVisitorModeUI;
        }

        /* renamed from: a */
        public void mo539a(C65220d dVar, C65234n nVar) {
            C87412m.m108594g(dVar, "task");
            C87412m.m108594g(nVar, "status");
            C65458r rVar = (C65458r) dVar;
            if (nVar != C65234n.OK || Util.isNullOrNil(rVar.f188352h)) {
                String str = this.f40706a.f14496o;
                Log.m105920e(str, "upload avatar fail,status:" + nVar);
                this.f40706a.mo3015O7(true);
                C61926c.m72668M(new C14738a(this.f40706a));
                return;
            }
            FinderLiveCreateVisitorModeUI finderLiveCreateVisitorModeUI = this.f40706a;
            finderLiveCreateVisitorModeUI.f14490C = rVar.f188352h;
            FinderLiveCreateVisitorModeUI.m2852N7(finderLiveCreateVisitorModeUI);
        }
    }

    public C14736c2(FinderLiveCreateVisitorModeUI finderLiveCreateVisitorModeUI) {
        this.f40705d = finderLiveCreateVisitorModeUI;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/feed/ui/FinderLiveCreateVisitorModeUI$initLayout$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        FinderLiveCreateVisitorModeUI finderLiveCreateVisitorModeUI = this.f40705d;
        int i = FinderLiveCreateVisitorModeUI.f14487I;
        boolean z = false;
        finderLiveCreateVisitorModeUI.mo3015O7(false);
        String str = this.f40705d.f14489B;
        if (str == null || str.length() == 0) {
            z = true;
        }
        if (!z) {
            ((C61381b) C86312j.m106911c(C61381b.class)).mo78545UQ().mo12411d(str, C66785b.f191882e.mo90662O5(), new C14737a(this.f40705d));
        } else {
            FinderLiveCreateVisitorModeUI.m2852N7(this.f40705d);
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/feed/ui/FinderLiveCreateVisitorModeUI$initLayout$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
