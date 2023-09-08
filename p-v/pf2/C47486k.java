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
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import rx3.C13598b0;
import sj3.C63941p;
import te3.C49699hg;
import te3.C50117ke;
import te3.C50249le;
import te3.C52257zg;
import te3.C64273c21;

/* renamed from: pf2.k */
public final class C47486k extends C87413o implements C32226l<Boolean, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C47489n f127380d;

    /* renamed from: e */
    public final /* synthetic */ C49699hg f127381e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C47486k(C47489n nVar, C49699hg hgVar) {
        super(1);
        this.f127380d = nVar;
        this.f127381e = hgVar;
    }

    public Object invoke(Object obj) {
        C52257zg zgVar;
        if (((Boolean) obj).booleanValue()) {
            C47489n nVar = this.f127380d;
            C49699hg hgVar = this.f127381e;
            Class cls = C45696d.class;
            View view = nVar.f127396C;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/profile/ui/tab/msg/holder/FeaturedMsgSingleFinderLiveViewHolder", "fillingMain", "(Lcom/tencent/mm/protocal/protobuf/BizMessage;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/profile/ui/tab/msg/holder/FeaturedMsgSingleFinderLiveViewHolder", "fillingMain", "(Lcom/tencent/mm/protocal/protobuf/BizMessage;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            View view2 = nVar.f127397D;
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(0);
            View view3 = view2;
            C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/plugin/profile/ui/tab/msg/holder/FeaturedMsgSingleFinderLiveViewHolder", "fillingMain", "(Lcom/tencent/mm/protocal/protobuf/BizMessage;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view3, "com/tencent/mm/plugin/profile/ui/tab/msg/holder/FeaturedMsgSingleFinderLiveViewHolder", "fillingMain", "(Lcom/tencent/mm/protocal/protobuf/BizMessage;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            C50249le leVar = hgVar.f134607i.f137969e.get(0);
            C50117ke keVar = hgVar.f134607i.f137968d;
            C52257zg zgVar2 = leVar.f137331P;
            if (zgVar2 == null) {
                Log.m105924i(nVar.f127394A, "detailInfo.finder_live == null");
            } else {
                C47478f fVar = C47478f.f127353a;
                Context context = nVar.f127395B;
                TextView textView = nVar.f127398E;
                C87412m.m108593f(textView, "headerTimeStamp");
                fVar.mo72495c(context, textView, hgVar);
                boolean z = !Util.isNullOrNil(leVar.f137343n) && !Util.isNullOrNil(leVar.f137328L);
                View findViewById = nVar.f44854d.findViewById(C0966R.C0970id.obu);
                View findViewById2 = nVar.f44854d.findViewById(C0966R.C0970id.obv);
                if (!z) {
                    C9556a aVar3 = new C9556a();
                    aVar3.mo10233c(0);
                    View view4 = findViewById;
                    C117292a.m165358d(view4, aVar3.mo10232b(), "com/tencent/mm/plugin/profile/ui/tab/msg/holder/FeaturedMsgSingleFinderLiveViewHolder", "fillingMain", "(Lcom/tencent/mm/protocal/protobuf/BizMessage;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                    C117292a.m165359e(view4, "com/tencent/mm/plugin/profile/ui/tab/msg/holder/FeaturedMsgSingleFinderLiveViewHolder", "fillingMain", "(Lcom/tencent/mm/protocal/protobuf/BizMessage;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    C9556a aVar4 = new C9556a();
                    aVar4.mo10233c(8);
                    View view5 = findViewById2;
                    C117292a.m165358d(view5, aVar4.mo10232b(), "com/tencent/mm/plugin/profile/ui/tab/msg/holder/FeaturedMsgSingleFinderLiveViewHolder", "fillingMain", "(Lcom/tencent/mm/protocal/protobuf/BizMessage;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById2.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
                    C117292a.m165359e(view5, "com/tencent/mm/plugin/profile/ui/tab/msg/holder/FeaturedMsgSingleFinderLiveViewHolder", "fillingMain", "(Lcom/tencent/mm/protocal/protobuf/BizMessage;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    View findViewById3 = nVar.f44854d.findViewById(C0966R.C0970id.obu);
                    ImageView imageView = (ImageView) nVar.f44854d.findViewById(C0966R.C0970id.f357763my2);
                    ImageView imageView2 = (ImageView) nVar.f44854d.findViewById(C0966R.C0970id.my6);
                    TextView textView2 = (TextView) nVar.f44854d.findViewById(C0966R.C0970id.my7);
                    TextView textView3 = (TextView) nVar.f44854d.findViewById(C0966R.C0970id.my5);
                    FinderLiveOnliveWidget finderLiveOnliveWidget = (FinderLiveOnliveWidget) findViewById3.findViewById(C0966R.C0970id.dnt);
                    FinderLiveOnliveWidget finderLiveOnliveWidget2 = (FinderLiveOnliveWidget) findViewById3.findViewById(C0966R.C0970id.dke);
                    textView2.setText(zgVar2.f145871i);
                    C8219i.f27144a.mo9271b(textView2);
                    ((TextView) nVar.f44854d.findViewById(C0966R.C0970id.my8)).setText(zgVar2.f145878s);
                    textView3.setText("");
                    C64273c21 Pr0 = ((C45696d) C86709a0.m107533q(cls)).Pr0(zgVar2.f145868f);
                    C63941p pVar = C63941p.f181254a;
                    C87412m.m108593f(finderLiveOnliveWidget, "liveOnIcon");
                    C87412m.m108593f(finderLiveOnliveWidget2, "liveEndIcon");
                    pVar.mo88711i(Pr0, finderLiveOnliveWidget, finderLiveOnliveWidget2);
                    textView2.setTag(C0966R.C0970id.mxm, zgVar2.f145868f);
                    String str = zgVar2.f145867e;
                    C47488m mVar = r2;
                    FinderLiveOnliveWidget finderLiveOnliveWidget3 = finderLiveOnliveWidget2;
                    String str2 = zgVar2.f145868f;
                    C47488m mVar2 = new C47488m(nVar, zgVar2, textView2, finderLiveOnliveWidget, finderLiveOnliveWidget3, textView3);
                    pVar.mo88707e(str, str2, mVar);
                    C87412m.m108593f(imageView2, "rightCoverIv");
                    C87412m.m108593f(imageView, "blurCoverIv");
                    pVar.mo88709g(imageView2, imageView, zgVar2.f145877r.f133134d);
                    zgVar = zgVar2;
                } else {
                    C9556a aVar5 = new C9556a();
                    aVar5.mo10233c(8);
                    View view6 = findViewById;
                    C117292a.m165358d(view6, aVar5.mo10232b(), "com/tencent/mm/plugin/profile/ui/tab/msg/holder/FeaturedMsgSingleFinderLiveViewHolder", "fillingMain", "(Lcom/tencent/mm/protocal/protobuf/BizMessage;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById.setVisibility(((Integer) aVar5.mo10231a(0)).intValue());
                    C117292a.m165359e(view6, "com/tencent/mm/plugin/profile/ui/tab/msg/holder/FeaturedMsgSingleFinderLiveViewHolder", "fillingMain", "(Lcom/tencent/mm/protocal/protobuf/BizMessage;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    C9556a aVar6 = new C9556a();
                    aVar6.mo10233c(0);
                    View view7 = findViewById2;
                    C117292a.m165358d(view7, aVar6.mo10232b(), "com/tencent/mm/plugin/profile/ui/tab/msg/holder/FeaturedMsgSingleFinderLiveViewHolder", "fillingMain", "(Lcom/tencent/mm/protocal/protobuf/BizMessage;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById2.setVisibility(((Integer) aVar6.mo10231a(0)).intValue());
                    C117292a.m165359e(view7, "com/tencent/mm/plugin/profile/ui/tab/msg/holder/FeaturedMsgSingleFinderLiveViewHolder", "fillingMain", "(Lcom/tencent/mm/protocal/protobuf/BizMessage;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    View findViewById4 = nVar.f44854d.findViewById(C0966R.C0970id.oby);
                    ImageView imageView3 = (ImageView) nVar.f44854d.findViewById(C0966R.C0970id.obx);
                    FinderLiveOnliveWidget finderLiveOnliveWidget4 = (FinderLiveOnliveWidget) findViewById4.findViewById(C0966R.C0970id.dnt);
                    FinderLiveOnliveWidget finderLiveOnliveWidget5 = (FinderLiveOnliveWidget) findViewById4.findViewById(C0966R.C0970id.dke);
                    TextView textView4 = (TextView) nVar.f44854d.findViewById(C0966R.C0970id.obz);
                    TextView textView5 = (TextView) nVar.f44854d.findViewById(C0966R.C0970id.f357766oc1);
                    textView4.setText(leVar.f137336d);
                    textView5.setVisibility(8);
                    C64273c21 Pr02 = ((C45696d) C86709a0.m107533q(cls)).Pr0(zgVar2.f145868f);
                    C63941p pVar2 = C63941p.f181254a;
                    C87412m.m108593f(finderLiveOnliveWidget4, "liveOnIcon");
                    C87412m.m108593f(finderLiveOnliveWidget5, "liveEndIcon");
                    pVar2.mo88711i(Pr02, finderLiveOnliveWidget4, finderLiveOnliveWidget5);
                    textView4.setTag(C0966R.C0970id.mxm, zgVar2.f145868f);
                    String str3 = zgVar2.f145867e;
                    String str4 = zgVar2.f145868f;
                    C52257zg zgVar3 = zgVar2;
                    zgVar = zgVar2;
                    C47487l lVar = r2;
                    C47487l lVar2 = new C47487l(nVar, zgVar3, textView4, finderLiveOnliveWidget4, finderLiveOnliveWidget5, textView5);
                    pVar2.mo88707e(str3, str4, lVar);
                    int A = C76577a.m92145A(nVar.f127395B) - C76577a.m92151b(nVar.f127395B, 16);
                    int i = (int) (((double) A) * 0.5625d);
                    ViewGroup.LayoutParams layoutParams = findViewById4.getLayoutParams();
                    C87412m.m108592e(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                    ((ConstraintLayout.LayoutParams) layoutParams).height = i;
                    String str5 = nVar.f127394A;
                    Log.m105924i(str5, "setCover, coverUrl = " + leVar.f137328L + ", cardHeight = " + i + ", cardWidth = " + A);
                    C87412m.m108593f(imageView3, "coverIv");
                    pVar2.mo88713k(imageView3, leVar.f137328L);
                }
                nVar.f44854d.setOnClickListener(new C47485j(zgVar, nVar));
            }
        }
        return C13598b0.f38549a;
    }
}
