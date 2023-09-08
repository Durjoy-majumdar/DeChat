package pf2;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.view.FinderLiveOnliveWidget;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import ex0.C45696d;
import f40.C86709a0;
import fy0.C8219i;
import gy3.C87412m;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import nf2.C47240a;
import sj3.C63941p;
import te3.C50117ke;
import te3.C50249le;
import te3.C52257zg;
import te3.C64273c21;

/* renamed from: pf2.w */
public final class C47499w extends C47466a {

    /* renamed from: B */
    public final View f127441B;

    /* renamed from: C */
    public final String f127442C = "LargeLiveViewHolder";

    /* renamed from: D */
    public final Context f127443D;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C47499w(View view, C47240a aVar, C50117ke keVar) {
        super(view, aVar, keVar);
        C87412m.m108594g(view, "inputItemView");
        C87412m.m108594g(aVar, "outAdapter");
        C87412m.m108594g(keVar, "baseInfo");
        this.f127441B = view;
        this.f127443D = view.getContext();
    }

    /* renamed from: y */
    public void mo72488y(C47472c cVar, int i) {
        C52257zg zgVar;
        C47472c cVar2 = cVar;
        Class cls = C45696d.class;
        C87412m.m108594g(cVar2, "dataModel");
        C50249le leVar = cVar2.f127336b;
        C52257zg zgVar2 = leVar.f137331P;
        if (zgVar2 == null) {
            Log.m105924i(this.f127442C, "detailInfo.finder_live == null");
            return;
        }
        C87412m.m108593f(zgVar2, "detailInfo.finder_live");
        boolean z = !Util.isNullOrNil(leVar.f137343n) && !Util.isNullOrNil(leVar.f137328L);
        View findViewById = this.f127441B.findViewById(C0966R.C0970id.obt);
        View findViewById2 = this.f127441B.findViewById(C0966R.C0970id.obs);
        if (!z) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            View view = findViewById;
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/profile/ui/tab/msg/holder/LargeLiveViewHolder", "filling", "(Lcom/tencent/mm/plugin/profile/ui/tab/msg/holder/DataModel;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/profile/ui/tab/msg/holder/LargeLiveViewHolder", "filling", "(Lcom/tencent/mm/plugin/profile/ui/tab/msg/holder/DataModel;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(8);
            View view2 = findViewById2;
            C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/profile/ui/tab/msg/holder/LargeLiveViewHolder", "filling", "(Lcom/tencent/mm/plugin/profile/ui/tab/msg/holder/DataModel;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/profile/ui/tab/msg/holder/LargeLiveViewHolder", "filling", "(Lcom/tencent/mm/plugin/profile/ui/tab/msg/holder/DataModel;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            ImageView imageView = (ImageView) this.f127441B.findViewById(C0966R.C0970id.f357763my2);
            ImageView imageView2 = (ImageView) this.f127441B.findViewById(C0966R.C0970id.my6);
            TextView textView = (TextView) this.f127441B.findViewById(C0966R.C0970id.my7);
            TextView textView2 = (TextView) this.f127441B.findViewById(C0966R.C0970id.my5);
            FinderLiveOnliveWidget finderLiveOnliveWidget = (FinderLiveOnliveWidget) this.f127441B.findViewById(C0966R.C0970id.dnt);
            FinderLiveOnliveWidget finderLiveOnliveWidget2 = (FinderLiveOnliveWidget) this.f127441B.findViewById(C0966R.C0970id.dke);
            textView.setText(zgVar2.f145871i);
            C8219i.f27144a.mo9271b(textView);
            ((TextView) this.f127441B.findViewById(C0966R.C0970id.my8)).setText(zgVar2.f145878s);
            textView2.setText("");
            C64273c21 Pr0 = ((C45696d) C86709a0.m107533q(cls)).Pr0(zgVar2.f145868f);
            C63941p pVar = C63941p.f181254a;
            C87412m.m108593f(finderLiveOnliveWidget, "liveOnIcon");
            C87412m.m108593f(finderLiveOnliveWidget2, "liveEndIcon");
            pVar.mo88711i(Pr0, finderLiveOnliveWidget, finderLiveOnliveWidget2);
            textView.setTag(C0966R.C0970id.mxm, zgVar2.f145868f);
            pVar.mo88707e(zgVar2.f145867e, zgVar2.f145868f, new C47498v(this, zgVar2, textView, finderLiveOnliveWidget, finderLiveOnliveWidget2, textView2));
            C87412m.m108593f(imageView2, "rightCoverIv");
            C87412m.m108593f(imageView, "blurCoverIv");
            pVar.mo88709g(imageView2, imageView, zgVar2.f145877r.f133134d);
            zgVar = zgVar2;
        } else {
            C9556a aVar3 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar3.mo10233c(8);
            View view3 = findViewById;
            C117292a.m165358d(view3, aVar3.mo10232b(), "com/tencent/mm/plugin/profile/ui/tab/msg/holder/LargeLiveViewHolder", "filling", "(Lcom/tencent/mm/plugin/profile/ui/tab/msg/holder/DataModel;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
            C117292a.m165359e(view3, "com/tencent/mm/plugin/profile/ui/tab/msg/holder/LargeLiveViewHolder", "filling", "(Lcom/tencent/mm/plugin/profile/ui/tab/msg/holder/DataModel;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            C9556a aVar4 = new C9556a();
            aVar4.mo10233c(0);
            View view4 = findViewById2;
            C117292a.m165358d(view4, aVar4.mo10232b(), "com/tencent/mm/plugin/profile/ui/tab/msg/holder/LargeLiveViewHolder", "filling", "(Lcom/tencent/mm/plugin/profile/ui/tab/msg/holder/DataModel;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
            C117292a.m165359e(view4, "com/tencent/mm/plugin/profile/ui/tab/msg/holder/LargeLiveViewHolder", "filling", "(Lcom/tencent/mm/plugin/profile/ui/tab/msg/holder/DataModel;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            View findViewById3 = this.f127441B.findViewById(C0966R.C0970id.oby);
            ImageView imageView3 = (ImageView) this.f127441B.findViewById(C0966R.C0970id.obx);
            FinderLiveOnliveWidget finderLiveOnliveWidget3 = (FinderLiveOnliveWidget) findViewById3.findViewById(C0966R.C0970id.dnt);
            FinderLiveOnliveWidget finderLiveOnliveWidget4 = (FinderLiveOnliveWidget) findViewById3.findViewById(C0966R.C0970id.dke);
            TextView textView3 = (TextView) this.f127441B.findViewById(C0966R.C0970id.obz);
            TextView textView4 = (TextView) this.f127441B.findViewById(C0966R.C0970id.f357766oc1);
            textView3.setText(leVar.f137336d);
            C8219i.f27144a.mo9271b(textView3);
            textView4.setVisibility(8);
            C64273c21 Pr02 = ((C45696d) C86709a0.m107533q(cls)).Pr0(zgVar2.f145868f);
            C63941p pVar2 = C63941p.f181254a;
            C87412m.m108593f(finderLiveOnliveWidget3, "liveOnIcon");
            C87412m.m108593f(finderLiveOnliveWidget4, "liveEndIcon");
            pVar2.mo88711i(Pr02, finderLiveOnliveWidget3, finderLiveOnliveWidget4);
            textView3.setTag(C0966R.C0970id.mxm, zgVar2.f145868f);
            String str = zgVar2.f145867e;
            String str2 = zgVar2.f145868f;
            C52257zg zgVar3 = zgVar2;
            zgVar = zgVar2;
            C47497u uVar = r0;
            C47497u uVar2 = new C47497u(this, zgVar3, textView3, finderLiveOnliveWidget3, finderLiveOnliveWidget4, textView4);
            pVar2.mo88707e(str, str2, uVar);
            int A = C76577a.m92145A(this.f127443D) - C76577a.m92151b(this.f127443D, 16);
            int i2 = (int) (((double) A) * 0.5625d);
            ViewGroup.LayoutParams layoutParams = findViewById3.getLayoutParams();
            C87412m.m108592e(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            ((ConstraintLayout.LayoutParams) layoutParams).height = i2;
            String str3 = this.f127442C;
            Log.m105924i(str3, "setCover, coverUrl = " + leVar.f137328L + ", cardHeight = " + i2 + ", cardWidth = " + A);
            C87412m.m108593f(imageView3, "coverIv");
            pVar2.mo88713k(imageView3, leVar.f137328L);
        }
        this.f127441B.setOnClickListener(new C47496t(zgVar, this));
    }
}
