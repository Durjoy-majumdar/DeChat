package com.tencent.p014mm.plugin.finder.live.view;

import ak1.C54108o;
import android.view.View;
import cl1.C54974f1;
import cl1.C54979h1;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.live.model.FinderLiveService;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C7335d;
import di3.C86312j;
import eb0.C31543z5;
import er1.C58739j4;
import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.util.ArrayList;
import rx3.C13598b0;
import te3.C64370fp1;
import te3.C64399gj1;
import te3.C64857yh3;

/* renamed from: com.tencent.mm.plugin.finder.live.view.y1 */
public final class C56112y1 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ FinderLiveProductRecordView f159981d;

    /* renamed from: com.tencent.mm.plugin.finder.live.view.y1$a */
    public static final class C56113a extends C87413o implements C32227p<Boolean, Long, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ FinderLiveProductRecordView f159982d;

        /* renamed from: e */
        public final /* synthetic */ C64370fp1 f159983e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C56113a(FinderLiveProductRecordView finderLiveProductRecordView, C64370fp1 fp12) {
            super(2);
            this.f159982d = finderLiveProductRecordView;
            this.f159983e = fp12;
        }

        public Object invoke(Object obj, Object obj2) {
            boolean booleanValue = ((Boolean) obj).booleanValue();
            ((Number) obj2).longValue();
            if (booleanValue) {
                C54974f1 f1Var = (C54974f1) FinderLiveService.f159376d.mo77630e(C54974f1.class);
                if (f1Var != null) {
                    f1Var.mo75934c3((C64370fp1) null);
                }
                FinderLiveProductRecordView.m64006d(this.f159982d, this.f159983e, 0);
            }
            return C13598b0.f38549a;
        }
    }

    public C56112y1(FinderLiveProductRecordView finderLiveProductRecordView) {
        this.f159981d = finderLiveProductRecordView;
    }

    public final void onClick(View view) {
        C64399gj1 gj12;
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/live/view/FinderLiveProductRecordView$recordingView$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C54979h1 h1Var = (C54979h1) FinderLiveService.f159376d.mo77630e(C54979h1.class);
        boolean z = false;
        if (!(h1Var == null || (gj12 = h1Var.f154113E) == null || gj12.f183344e != 0)) {
            z = true;
        }
        if (z) {
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/view/FinderLiveProductRecordView$recordingView$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        C58739j4 j4Var = C58739j4.f168176a;
        FinderLiveProductRecordView finderLiveProductRecordView = this.f159981d;
        C64370fp1 fp12 = finderLiveProductRecordView.f159800h;
        C64857yh3 yh32 = fp12 != null ? fp12.f183160E : null;
        if (!(fp12 == null || yh32 == null)) {
            if (yh32.f186537i == 1000) {
                if (yh32.f186534f > 0) {
                    int i = FinderLiveProductRecordView.f159795r;
                    if (((long) (C31543z5.m39455e() - yh32.f186534f)) < 5) {
                        C7335d c = C86312j.m106911c(C54108o.class);
                        C87412m.m108593f(c, "getService(HellLiveReport::class.java)");
                        C54108o.Ux0((C54108o) c, 7, 1, 0, 0, 12, (Object) null);
                        FinderLiveProductRecordView.m64007e(finderLiveProductRecordView, C0966R.string.e3b);
                    }
                }
                FinderLiveProductRecordView.m64005c(finderLiveProductRecordView, 106, fp12.f183176d, new C56113a(finderLiveProductRecordView, fp12));
            } else {
                Log.m105924i(finderLiveProductRecordView.f159796d, "no recording");
            }
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/view/FinderLiveProductRecordView$recordingView$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
