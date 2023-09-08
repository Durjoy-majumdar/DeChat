package mf1;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.TextView;
import bl3.C39818r;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import com.tencent.p014mm.plugin.finder.view.C4167r7;
import com.tencent.p014mm.plugin.finder.view.C4174s7;
import com.tencent.p014mm.protocal.protobuf.FinderJumpInfo;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import er1.C58739j4;
import er1.C7919x;
import fe1.C58969q;
import go1.C8366a;
import go1.C8368c;
import gy3.C87412m;
import ht1.C60172g4;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import jq3.C60905o;
import ks3.C10412u;
import ls3.C10649f;
import o40.C61926c;
import pf1.C11920q;
import rf1.C12982a;
import rx3.C13598b0;
import te3.C49720hl0;
import te3.C49737hp2;
import te3.C50124kf1;
import te3.C64238ap2;
import te3.C64279c90;
import te3.C64347eq2;
import te3.C64686ro2;
import te3.uc4;

/* renamed from: mf1.d0 */
public class C10809d0 extends C12982a {

    /* renamed from: mf1.d0$a */
    public static final class C10810a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C10809d0 f32303d;

        /* renamed from: e */
        public final /* synthetic */ C60905o f32304e;

        /* renamed from: f */
        public final /* synthetic */ View f32305f;

        /* renamed from: g */
        public final /* synthetic */ C11920q f32306g;

        /* renamed from: h */
        public final /* synthetic */ BaseFinderFeed f32307h;

        /* renamed from: i */
        public final /* synthetic */ C49737hp2 f32308i;

        public C10810a(C10809d0 d0Var, C60905o oVar, View view, C11920q qVar, BaseFinderFeed baseFinderFeed, C49737hp2 hp22) {
            this.f32303d = d0Var;
            this.f32304e = oVar;
            this.f32305f = view;
            this.f32306g = qVar;
            this.f32307h = baseFinderFeed;
            this.f32308i = hp22;
        }

        public final void onClick(View view) {
            C50124kf1 kf12;
            C49720hl0 hl02;
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/feed/component/FeedJumperLivingStatusObserver$onBindView$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            this.f32303d.mo11090l(this.f32304e, this.f32305f, this.f32306g);
            Context context = this.f32304e.f173499A;
            C87412m.m108593f(context, "holder.context");
            C58969q l = this.f32307h.mo3507l();
            C4167r7 r7Var = new C4167r7(context, l != null ? l.getUsername() : null, this.f32304e.mo17363j(), this.f32307h.mo3513o().isLiveFeed(), this.f32307h.mo3513o().getId());
            BaseFinderFeed baseFinderFeed = this.f32307h;
            C49737hp2 hp22 = this.f32308i;
            C10809d0 d0Var = this.f32303d;
            FinderObject feedObject = baseFinderFeed.mo3513o().getFeedObject();
            long j = hp22.f134809f;
            long j2 = hp22.f134810g;
            long j3 = d0Var.f37014c;
            String str = r7Var.f18404b;
            if (!(str == null || str.length() == 0)) {
                int t3 = ((C60172g4) C39818r.f106831a.mo62443b(r7Var.f18403a).mo62447c(C60172g4.class)).mo12864t3();
                Intent intent = new Intent();
                intent.putExtra("key_enter_live_param_visitor_enter_scene", 5);
                int i = C10412u.f31640a;
                intent.putExtra("KEY_ENTER_LIVE_PARAM_LIVE_EVENT_SOURCE", 2);
                FinderObject finderObject = feedObject;
                intent.putExtra("KEY_ENTER_LIVE_PARAM_FROM_OBJECT_ID", r7Var.f18407e);
                intent.putExtra("KEY_ENTER_LIVE_BACK_NEED_MINI_WINDOW", false);
                Log.m105924i("LiveLogoAssistant", "set fromObjectId:" + C61926c.m72691p(r7Var.f18407e));
                C64279c90 c902 = new C64279c90();
                c902.f182444d = "";
                c902.f182445e = "";
                c902.f182446f = true;
                c902.f182447g = -1;
                c902.f182448h = -1;
                c902.f182449i = 1;
                C64686ro2 ro22 = new C64686ro2();
                ro22.f185214e = t3;
                c902.f182450j = ro22;
                C64347eq2 eq22 = new C64347eq2();
                eq22.f183018f = finderObject != null ? finderObject.sessionBuffer : null;
                eq22.f183019g = (finderObject == null || (kf12 = finderObject.object_extend) == null || (hl02 = kf12.f136752n) == null) ? null : hl02.f134715d;
                StringBuilder sb = new StringBuilder();
                sb.append("fromObjectId:");
                long j4 = j3;
                sb.append(C61926c.m72691p(r7Var.f18407e));
                sb.append(", jumperSessionBuffer:");
                sb.append(eq22.f183018f);
                Log.m105924i("LiveLogoAssistant", sb.toString());
                Log.m105924i("LiveLogoAssistant", "finderForwardSource:" + eq22.f183019g);
                c902.f182451n = eq22;
                Context context2 = r7Var.f18403a;
                C64238ap2 ap22 = new C64238ap2();
                ap22.f182124d = j;
                ap22.f182126f = "";
                ap22.f182125e = j2;
                ap22.f182127g = "";
                ap22.f182129i = "";
                ap22.f182128h = null;
                C13598b0 b0Var = C13598b0.f38549a;
                ((C10649f) C86312j.m106911c(C10649f.class)).mo10916tP(context2, intent, ap22, true, c902, new C4174s7(t3, r7Var, finderObject, j4, intent));
            } else {
                Log.m105924i("LiveLogoAssistant", "[LiveLogoAssistant]click live icon but username is empty!");
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/feed/component/FeedJumperLivingStatusObserver$onBindView$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: b */
    public void mo11020b(BaseFinderFeed baseFinderFeed, C60905o oVar, View view, C11920q qVar, String str) {
        LinkedList<uc4> linkedList;
        T t;
        boolean z;
        C60905o oVar2 = oVar;
        View view2 = view;
        C11920q qVar2 = qVar;
        C87412m.m108594g(baseFinderFeed, "feed");
        C87412m.m108594g(oVar2, "holder");
        C87412m.m108594g(view2, "jumpView");
        C87412m.m108594g(qVar2, "infoEx");
        C87412m.m108594g(str, FirebaseAnalytics.C113379b.SOURCE);
        FinderJumpInfo finderJumpInfo = qVar2.f34827a;
        C49737hp2 hp22 = null;
        boolean z2 = true;
        if (!(finderJumpInfo == null || (linkedList = finderJumpInfo.style) == null)) {
            Iterator<T> it = linkedList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    t = null;
                    break;
                }
                t = it.next();
                if (((uc4) t).f142762h == 16) {
                    z = true;
                    continue;
                } else {
                    z = false;
                    continue;
                }
                if (z) {
                    break;
                }
            }
            uc4 uc4 = (uc4) t;
            if (uc4 != null) {
                hp22 = uc4.f142756M;
            }
        }
        C49737hp2 hp23 = hp22;
        if (hp23 != null) {
            C87412m.m108594g(finderJumpInfo, "info");
            C8368c cVar = C8368c.f27352a;
            if (!cVar.mo9335b(oVar.hashCode(), mo11037g(finderJumpInfo))) {
                mo12512t(8);
                Log.m105924i("Finder.FeedJumperLivingStatusObserver", "[onBindView] priority not ok");
                return;
            }
            BaseFinderFeed baseFinderFeed2 = qVar2.f34830d;
            if (baseFinderFeed2 != null) {
                TextView textView = (TextView) view2.findViewById(C0966R.C0970id.f358599g11);
                TextView textView2 = (TextView) view2.findViewById(C0966R.C0970id.m7g);
                textView.setMaxWidth((int) (((double) oVar2.f173499A.getResources().getDisplayMetrics().widthPixels) * 0.5d));
                textView2.setMaxWidth((int) (((double) oVar2.f173499A.getResources().getDisplayMetrics().widthPixels) * 0.5d));
                textView2.setTextSize(0, oVar2.f173499A.getResources().getDimension(C0966R.dimen.f3684bd));
                String str2 = hp23.f134807d;
                String str3 = "";
                if (!(str2 == null || str2.length() == 0)) {
                    C58739j4 j4Var = C58739j4.f168176a;
                    String str4 = hp23.f134807d;
                    if (str4 == null) {
                        str4 = str3;
                    }
                    textView2.setText(j4Var.mo83677E(str4));
                    textView2.setVisibility(0);
                } else {
                    textView2.setVisibility(8);
                }
                String str5 = hp23.f134808e;
                if (!(str5 == null || str5.length() == 0)) {
                    z2 = false;
                }
                if (!z2) {
                    C58739j4 j4Var2 = C58739j4.f168176a;
                    String str6 = hp23.f134808e;
                    if (str6 != null) {
                        str3 = str6;
                    }
                    textView.setText(j4Var2.mo83677E(str3));
                } else {
                    textView.setText(oVar2.f173499A.getString(C0966R.string.d9h));
                }
                if (textView2.getVisibility() == 0) {
                    textView.setTextSize(0, oVar2.f173499A.getResources().getDimension(C0966R.dimen.f3817fa));
                    textView.setTextColor(oVar2.f173499A.getResources().getColor(C0966R.color.f3583yg));
                    C7919x.m8092b(textView);
                } else {
                    textView.setTextSize(0, oVar2.f173499A.getResources().getDimension(C0966R.dimen.f3684bd));
                    textView.setTextColor(oVar2.f173499A.getResources().getColor(C0966R.color.f3585yj));
                    C7919x.m8091a(textView);
                }
                view2.setOnClickListener(new C10810a(this, oVar, view, qVar, baseFinderFeed2, hp23));
                cVar.mo9337d(oVar2, view2, mo11037g(finderJumpInfo));
            }
        }
    }

    /* renamed from: g */
    public C8366a mo11037g(FinderJumpInfo finderJumpInfo) {
        C87412m.m108594g(finderJumpInfo, "info");
        return finderJumpInfo.business_type == 2 ? C8366a.AD_HARD : C8366a.LIVE_OPEN;
    }

    /* renamed from: i */
    public boolean mo11021i(C11920q qVar) {
        C87412m.m108594g(qVar, "infoEx");
        return true;
    }
}
