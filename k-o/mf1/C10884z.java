package mf1;

import android.content.Context;
import android.graphics.Paint;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74783i3;
import com.tencent.p014mm.p136ui.widget.RoundedCornerFrameLayout;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import com.tencent.p014mm.protocal.protobuf.FinderJumpInfo;
import com.tencent.p014mm.protocal.protobuf.FinderJumpInfoRedDot;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import dp1.C58417y0;
import go1.C8366a;
import go1.C8368c;
import gy3.C87412m;
import j20.C117292a;
import java.util.Iterator;
import java.util.LinkedList;
import jq3.C60905o;
import k20.C60958c;
import k20.C9556a;
import o40.C61926c;
import pf1.C11920q;
import pf1.C62262d0;
import te3.C50687oi1;
import te3.C52212z33;
import te3.uc4;
import zc1.C66785b;

/* renamed from: mf1.z */
public final class C10884z extends C10793b0 {
    /* renamed from: A */
    public void mo11033A(C60905o oVar, View view, FinderJumpInfo finderJumpInfo) {
        C87412m.m108594g(oVar, "holder");
        C87412m.m108594g(view, "jumpView");
        C87412m.m108594g(finderJumpInfo, "info");
        C8368c.f27352a.mo9337d(oVar, view, mo11037g(finderJumpInfo));
    }

    /* renamed from: B */
    public boolean mo11034B(C60905o oVar, FinderJumpInfo finderJumpInfo) {
        C87412m.m108594g(oVar, "holder");
        C87412m.m108594g(finderJumpInfo, "info");
        return C8368c.f27352a.mo9335b(oVar.hashCode(), mo11037g(finderJumpInfo));
    }

    /* renamed from: b */
    public void mo11020b(BaseFinderFeed baseFinderFeed, C60905o oVar, View view, C11920q qVar, String str) {
        FinderJumpInfo finderJumpInfo;
        boolean z;
        boolean z2;
        T t;
        boolean z3;
        C60905o oVar2 = oVar;
        View view2 = view;
        C11920q qVar2 = qVar;
        C87412m.m108594g(baseFinderFeed, "feed");
        C87412m.m108594g(oVar2, "holder");
        C87412m.m108594g(view2, "jumpView");
        C87412m.m108594g(qVar2, "infoEx");
        C87412m.m108594g(str, FirebaseAnalytics.C113379b.SOURCE);
        uc4 uc4 = this.f37017f;
        String str2 = null;
        if (uc4 == null) {
            LinkedList<uc4> linkedList = qVar2.f34827a.style;
            C87412m.m108593f(linkedList, "infoEx.jumpInfo.style");
            Iterator<T> it = linkedList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    t = null;
                    break;
                }
                t = it.next();
                if (((uc4) t).f142762h == 0) {
                    z3 = true;
                    continue;
                } else {
                    z3 = false;
                    continue;
                }
                if (z3) {
                    break;
                }
            }
            uc4 = (uc4) t;
        }
        C52212z33 z332 = uc4 != null ? uc4.f142764j : null;
        FinderJumpInfo finderJumpInfo2 = qVar2.f34827a;
        Log.m105924i("Finder.FeedJumperCommonBubbleObserver", "[onBindView] hashCode:" + hashCode() + "holder: " + oVar.hashCode() + " holder position: " + oVar.mo17365l() + " feedId=" + C61926c.m72691p(this.f37014c) + " showPosition=" + qVar2.f34841o + " showStyle=" + qVar2.f34842p + " businessType=" + finderJumpInfo2.business_type + " jumpType=" + finderJumpInfo2.jumpinfo_type + " title=" + finderJumpInfo2.recommend_reason + '|' + finderJumpInfo2.wording + " icon_url=" + finderJumpInfo2.icon_url + " ext_info=" + finderJumpInfo2.ext_info + ' ');
        View findViewById = view2.findViewById(C0966R.C0970id.f358405m20);
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(0);
        View view3 = findViewById;
        C117292a.m165358d(view3, aVar.mo10232b(), "com/tencent/mm/plugin/finder/feed/component/FeedJumperCommonBubbleObserver", "onBindView", "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Landroid/view/View;Lcom/tencent/mm/plugin/finder/feed/jumper/FinderJumpInfoEx;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view3, "com/tencent/mm/plugin/finder/feed/component/FeedJumperCommonBubbleObserver", "onBindView", "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Landroid/view/View;Lcom/tencent/mm/plugin/finder/feed/jumper/FinderJumpInfoEx;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        Context context = oVar2.f173499A;
        C87412m.m108593f(context, "holder.context");
        int x = mo11038x(context);
        if (!mo11034B(oVar2, finderJumpInfo2)) {
            mo12512t(8);
            Log.m105924i("Finder.FeedJumperCommonBubbleObserver", "[onBindView] priority not ok");
            return;
        }
        RoundedCornerFrameLayout roundedCornerFrameLayout = (RoundedCornerFrameLayout) view2.findViewById(C0966R.C0970id.d9i);
        WeImageView weImageView = (WeImageView) view2.findViewById(C0966R.C0970id.d8w);
        TextView textView = (TextView) view2.findViewById(C0966R.C0970id.f358071d92);
        textView.setTextSize(0, oVar2.f173499A.getResources().getDimension(C0966R.dimen.f3684bd));
        weImageView.clearColorFilter();
        weImageView.setLayerPaint((Paint) null);
        weImageView.setIconColor(0);
        if (!Util.isNullOrNil(z332 != null ? z332.f145671d : null)) {
            String str3 = z332 != null ? z332.f145671d : null;
            C87412m.m108593f(roundedCornerFrameLayout, "iconLayout");
            mo11036D(str3, roundedCornerFrameLayout, weImageView);
        } else {
            C87412m.m108593f(roundedCornerFrameLayout, "iconLayout");
            mo11035C(finderJumpInfo2, roundedCornerFrameLayout, weImageView);
        }
        if (z332 != null) {
            str2 = z332.f145672e;
        }
        C62262d0 d0Var = C62262d0.f176978a;
        Context context2 = oVar2.f173499A;
        C87412m.m108593f(context2, "holder.context");
        textView.setText(mo12511h(str2, d0Var.mo87315e(context2, finderJumpInfo2)));
        FinderJumpInfoRedDot finderJumpInfoRedDot = finderJumpInfo2.red_dot;
        if (finderJumpInfoRedDot != null) {
            finderJumpInfo = finderJumpInfo2;
            if (1 == finderJumpInfoRedDot.red_dot_type) {
                x -= oVar2.f173499A.getResources().getDimensionPixelSize(C0966R.dimen.f3766df);
                LinearLayout linearLayout = (LinearLayout) view2.findViewById(C0966R.C0970id.d9m);
                if (linearLayout != null) {
                    linearLayout.setVisibility(0);
                }
            }
        } else {
            finderJumpInfo = finderJumpInfo2;
        }
        C50687oi1 oi12 = C66785b.f191882e.mo90673n0().mo62397b().f140461E;
        if (oi12 != null) {
            z = true;
            if (oi12.f139196d == 1) {
                z2 = true;
                CharSequence text = textView.getText();
                if (!(text == null || text.length() == 0)) {
                    z = false;
                }
                if (!z || z2) {
                    mo12512t(8);
                    Log.m105928w("Finder.FeedJumperCommonBubbleObserver", "title is null.");
                }
                mo12512t(0);
                float measureText = textView.getPaint().measureText(textView.getText().toString());
                if (measureText > ((float) x)) {
                    textView.setWidth(x);
                } else {
                    textView.setWidth((int) measureText);
                }
                mo11033A(oVar2, view2, finderJumpInfo);
                Context context3 = oVar2.f173499A;
                C87412m.m108593f(context3, "holder.context");
                ((C58417y0) C86312j.m106911c(C58417y0.class)).vx0(context3, this.f37014c, "universal_jumpinfo", qVar);
                return;
            }
        } else {
            z = true;
        }
        z2 = false;
        CharSequence text2 = textView.getText();
        z = false;
        if (!z) {
        }
        mo12512t(8);
        Log.m105928w("Finder.FeedJumperCommonBubbleObserver", "title is null.");
    }

    /* renamed from: g */
    public C8366a mo11037g(FinderJumpInfo finderJumpInfo) {
        C87412m.m108594g(finderJumpInfo, "info");
        return finderJumpInfo.business_type == 2 ? C8366a.AD_COMMON : super.mo11037g(finderJumpInfo);
    }

    /* renamed from: x */
    public int mo11038x(Context context) {
        C87412m.m108594g(context, "context");
        return (int) ((((double) C74783i3.m89537a(context).f24704a) * 0.6d) - ((double) context.getResources().getDimensionPixelSize(C0966R.dimen.f3760da)));
    }

    /* renamed from: y */
    public String mo11039y() {
        return "universal_jumpinfo";
    }
}
