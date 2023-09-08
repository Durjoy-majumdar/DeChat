package mf1;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import bl3.C39818r;
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
import fy3.C32224a;
import go1.C8366a;
import go1.C8368c;
import gy3.C87412m;
import gy3.C87413o;
import ht1.C60200t1;
import j20.C117292a;
import java.util.Iterator;
import java.util.LinkedList;
import jq3.C60905o;
import k20.C60958c;
import k20.C9556a;
import l60.C99342a;
import l60.C99344b;
import o40.C61926c;
import pf1.C11920q;
import pf1.C62262d0;
import pl1.C100810g0;
import pl1.C11978e0;
import pl1.C11984n0;
import pl1.C11990s0;
import r60.C101350i;
import rf1.C12982a;
import rx3.C13598b0;
import t60.C13831b;
import t60.C64205a;
import t60.C64207e;
import te3.C52260zg2;
import te3.uc4;
import up1.C27696y;
import x60.C102564a;

/* renamed from: mf1.b0 */
public class C10793b0 extends C12982a {

    /* renamed from: mf1.b0$a */
    public static final class C10794a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ boolean f32273d;

        /* renamed from: e */
        public final /* synthetic */ View f32274e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C10794a(boolean z, View view) {
            super(0);
            this.f32273d = z;
            this.f32274e = view;
        }

        public Object invoke() {
            if (this.f32273d) {
                this.f32274e.setBackground((Drawable) null);
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: mf1.b0$b */
    public static final class C10795b<T, R> implements C64207e {

        /* renamed from: a */
        public final /* synthetic */ C10793b0 f32275a;

        /* renamed from: b */
        public final /* synthetic */ View f32276b;

        public C10795b(C10793b0 b0Var, View view) {
            this.f32275a = b0Var;
            this.f32276b = view;
        }

        /* renamed from: a */
        public void mo507a(C102564a aVar, C101350i iVar, Object obj) {
            this.f32275a.mo11040z(this.f32276b, ((Bitmap) obj) != null);
        }
    }

    /* renamed from: mf1.b0$c */
    public static final class C10796c implements C64205a {

        /* renamed from: a */
        public final /* synthetic */ C10793b0 f32277a;

        /* renamed from: b */
        public final /* synthetic */ View f32278b;

        public C10796c(C10793b0 b0Var, View view) {
            this.f32277a = b0Var;
            this.f32278b = view;
        }

        /* renamed from: a */
        public final void mo729a(boolean z, Object[] objArr) {
            this.f32277a.mo11040z(this.f32278b, z);
        }
    }

    /* renamed from: mf1.b0$d */
    public static final class C10797d implements C13831b {

        /* renamed from: a */
        public final /* synthetic */ View f32279a;

        public C10797d(C10793b0 b0Var, View view) {
            this.f32279a = view;
        }
    }

    /* renamed from: mf1.b0$e */
    public static final class C10798e<T, R> implements C64207e {

        /* renamed from: a */
        public final /* synthetic */ C10793b0 f32280a;

        /* renamed from: b */
        public final /* synthetic */ View f32281b;

        public C10798e(C10793b0 b0Var, View view) {
            this.f32280a = b0Var;
            this.f32281b = view;
        }

        /* renamed from: a */
        public void mo507a(C102564a aVar, C101350i iVar, Object obj) {
            this.f32280a.mo11040z(this.f32281b, ((Bitmap) obj) != null);
        }
    }

    /* renamed from: mf1.b0$f */
    public static final class C10799f implements C64205a {

        /* renamed from: a */
        public final /* synthetic */ C10793b0 f32282a;

        /* renamed from: b */
        public final /* synthetic */ View f32283b;

        public C10799f(C10793b0 b0Var, View view) {
            this.f32282a = b0Var;
            this.f32283b = view;
        }

        /* renamed from: a */
        public final void mo729a(boolean z, Object[] objArr) {
            this.f32282a.mo11040z(this.f32283b, z);
        }
    }

    /* renamed from: mf1.b0$g */
    public static final class C10800g implements C13831b {

        /* renamed from: a */
        public final /* synthetic */ View f32284a;

        public C10800g(C10793b0 b0Var, View view) {
            this.f32284a = view;
        }
    }

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

    /* renamed from: C */
    public final void mo11035C(FinderJumpInfo finderJumpInfo, View view, WeImageView weImageView) {
        FinderJumpInfo finderJumpInfo2 = finderJumpInfo;
        View view2 = view;
        WeImageView weImageView2 = weImageView;
        Class cls = C11990s0.class;
        Class<C60200t1> cls2 = C60200t1.class;
        C87412m.m108594g(finderJumpInfo2, "info");
        C87412m.m108594g(view2, "iconLayout");
        C87412m.m108594g(weImageView2, "iconView");
        String str = finderJumpInfo2.icon_url;
        if (str == null || str.length() == 0) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/feed/component/FeedJumperHotSpotBubbleObserver", "loadImage", "(Lcom/tencent/mm/protocal/protobuf/FinderJumpInfo;Landroid/view/View;Lcom/tencent/mm/ui/widget/imageview/WeImageView;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/finder/feed/component/FeedJumperHotSpotBubbleObserver", "loadImage", "(Lcom/tencent/mm/protocal/protobuf/FinderJumpInfo;Landroid/view/View;Lcom/tencent/mm/ui/widget/imageview/WeImageView;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        C9556a aVar2 = new C9556a();
        ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
        aVar2.mo10233c(0);
        C117292a.m165358d(view, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/feed/component/FeedJumperHotSpotBubbleObserver", "loadImage", "(Lcom/tencent/mm/protocal/protobuf/FinderJumpInfo;Landroid/view/View;Lcom/tencent/mm/ui/widget/imageview/WeImageView;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/finder/feed/component/FeedJumperHotSpotBubbleObserver", "loadImage", "(Lcom/tencent/mm/protocal/protobuf/FinderJumpInfo;Landroid/view/View;Lcom/tencent/mm/ui/widget/imageview/WeImageView;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        C99344b<C100810g0, Bitmap> b = ((C11990s0) C39818r.f106831a.mo62446e(cls2).mo62447c(cls)).mo11871f2().mo85956b(new C11984n0(finderJumpInfo2.icon_url, C27696y.THUMB_IMAGE), ((C11990s0) C39818r.f106831a.mo62446e(cls2).mo62447c(cls)).mo11867O2(C11978e0.C11979a.LINK_THUMB));
        C10795b bVar = new C10795b(this, view2);
        b.getClass();
        b.f291320d = bVar;
        b.f291324h = new C10796c(this, view2);
        b.f291323g = new C10797d(this, view2);
        ((C99342a) b).mo85954d(weImageView2);
    }

    /* renamed from: D */
    public final void mo11036D(String str, View view, WeImageView weImageView) {
        View view2 = view;
        WeImageView weImageView2 = weImageView;
        Class cls = C11990s0.class;
        Class<C60200t1> cls2 = C60200t1.class;
        C87412m.m108594g(view2, "iconLayout");
        C87412m.m108594g(weImageView2, "iconView");
        if (Util.isNullOrNil(str)) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/feed/component/FeedJumperHotSpotBubbleObserver", "loadImage", "(Ljava/lang/String;Landroid/view/View;Lcom/tencent/mm/ui/widget/imageview/WeImageView;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/finder/feed/component/FeedJumperHotSpotBubbleObserver", "loadImage", "(Ljava/lang/String;Landroid/view/View;Lcom/tencent/mm/ui/widget/imageview/WeImageView;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        C9556a aVar2 = new C9556a();
        ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
        aVar2.mo10233c(0);
        C117292a.m165358d(view, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/feed/component/FeedJumperHotSpotBubbleObserver", "loadImage", "(Ljava/lang/String;Landroid/view/View;Lcom/tencent/mm/ui/widget/imageview/WeImageView;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/finder/feed/component/FeedJumperHotSpotBubbleObserver", "loadImage", "(Ljava/lang/String;Landroid/view/View;Lcom/tencent/mm/ui/widget/imageview/WeImageView;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        C99344b<C100810g0, Bitmap> b = ((C11990s0) C39818r.f106831a.mo62446e(cls2).mo62447c(cls)).mo11871f2().mo85956b(new C11984n0(str, C27696y.THUMB_IMAGE), ((C11990s0) C39818r.f106831a.mo62446e(cls2).mo62447c(cls)).mo11867O2(C11978e0.C11979a.COMMON));
        C10798e eVar = new C10798e(this, view2);
        b.getClass();
        b.f291320d = eVar;
        b.f291324h = new C10799f(this, view2);
        b.f291323g = new C10800g(this, view2);
        ((C99342a) b).mo85954d(weImageView2);
    }

    /* renamed from: b */
    public void mo11020b(BaseFinderFeed baseFinderFeed, C60905o oVar, View view, C11920q qVar, String str) {
        String str2;
        T t;
        String str3;
        boolean z;
        C60905o oVar2 = oVar;
        View view2 = view;
        C11920q qVar2 = qVar;
        C87412m.m108594g(baseFinderFeed, "feed");
        C87412m.m108594g(oVar2, "holder");
        C87412m.m108594g(view2, "jumpView");
        C87412m.m108594g(qVar2, "infoEx");
        C87412m.m108594g(str, FirebaseAnalytics.C113379b.SOURCE);
        LinkedList<uc4> linkedList = qVar2.f34827a.style;
        C87412m.m108593f(linkedList, "infoEx.jumpInfo.style");
        Iterator<T> it = linkedList.iterator();
        while (true) {
            str2 = null;
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            if (((uc4) t).f142762h == 1) {
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
        C52260zg2 zg22 = uc4 != null ? uc4.f142765n : null;
        FinderJumpInfo finderJumpInfo = qVar2.f34827a;
        Log.m105924i("Finder.FeedAdHotSpotJumperObserver", "[onBindView] hashCode:" + hashCode() + "holder: " + oVar.hashCode() + " holder position: " + oVar.mo17365l() + " feedId=" + C61926c.m72691p(this.f37014c) + " showPosition=" + qVar2.f34841o + " showStyle=" + qVar2.f34842p + " businessType=" + finderJumpInfo.business_type + " jumpType=" + finderJumpInfo.jumpinfo_type + " title=" + finderJumpInfo.recommend_reason + '|' + finderJumpInfo.wording + " icon_url=" + finderJumpInfo.icon_url + " ext_info=" + finderJumpInfo.ext_info + ' ');
        View findViewById = view2.findViewById(C0966R.C0970id.f358405m20);
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(0);
        View view3 = findViewById;
        C117292a.m165358d(view3, aVar.mo10232b(), "com/tencent/mm/plugin/finder/feed/component/FeedJumperHotSpotBubbleObserver", "onBindView", "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Landroid/view/View;Lcom/tencent/mm/plugin/finder/feed/jumper/FinderJumpInfoEx;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view3, "com/tencent/mm/plugin/finder/feed/component/FeedJumperHotSpotBubbleObserver", "onBindView", "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Landroid/view/View;Lcom/tencent/mm/plugin/finder/feed/jumper/FinderJumpInfoEx;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        Context context = oVar2.f173499A;
        C87412m.m108593f(context, "holder.context");
        int x = mo11038x(context);
        if (!mo11034B(oVar2, finderJumpInfo)) {
            mo12512t(8);
            Log.m105924i("Finder.FeedAdHotSpotJumperObserver", "[onBindView] priority not ok");
            return;
        }
        RoundedCornerFrameLayout roundedCornerFrameLayout = (RoundedCornerFrameLayout) view2.findViewById(C0966R.C0970id.d9i);
        WeImageView weImageView = (WeImageView) view2.findViewById(C0966R.C0970id.d8w);
        TextView textView = (TextView) view2.findViewById(C0966R.C0970id.f358071d92);
        textView.setTextSize(0, oVar2.f173499A.getResources().getDimension(C0966R.dimen.f3684bd));
        weImageView.clearColorFilter();
        weImageView.setLayerPaint((Paint) null);
        weImageView.setIconColor(0);
        if (!Util.isNullOrNil(zg22 != null ? zg22.f145904d : null)) {
            String str4 = zg22 != null ? zg22.f145904d : null;
            C87412m.m108593f(roundedCornerFrameLayout, "iconLayout");
            mo11036D(str4, roundedCornerFrameLayout, weImageView);
        } else {
            C87412m.m108593f(roundedCornerFrameLayout, "iconLayout");
            mo11035C(finderJumpInfo, roundedCornerFrameLayout, weImageView);
        }
        if (zg22 != null) {
            str2 = zg22.f145905e;
        }
        C62262d0 d0Var = C62262d0.f176978a;
        Context context2 = oVar2.f173499A;
        C87412m.m108593f(context2, "holder.context");
        textView.setText(mo12511h(str2, d0Var.mo87315e(context2, finderJumpInfo)));
        FinderJumpInfoRedDot finderJumpInfoRedDot = finderJumpInfo.red_dot;
        if (finderJumpInfoRedDot != null) {
            str3 = "holder.context";
            if (1 == finderJumpInfoRedDot.red_dot_type) {
                x -= oVar2.f173499A.getResources().getDimensionPixelSize(C0966R.dimen.f3766df);
                LinearLayout linearLayout = (LinearLayout) view2.findViewById(C0966R.C0970id.d9m);
                if (linearLayout != null) {
                    linearLayout.setVisibility(0);
                }
            }
        } else {
            str3 = "holder.context";
        }
        CharSequence text = textView.getText();
        if (text == null || text.length() == 0) {
            mo12512t(8);
            Log.m105928w("Finder.FeedAdHotSpotJumperObserver", "title is null.");
            return;
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
        C87412m.m108593f(context3, str3);
        ((C58417y0) C86312j.m106911c(C58417y0.class)).vx0(context3, this.f37014c, mo11039y(), qVar);
    }

    /* renamed from: g */
    public C8366a mo11037g(FinderJumpInfo finderJumpInfo) {
        C87412m.m108594g(finderJumpInfo, "info");
        return finderJumpInfo.business_type == 2 ? C8366a.AD_HOT : super.mo11037g(finderJumpInfo);
    }

    /* renamed from: x */
    public int mo11038x(Context context) {
        C87412m.m108594g(context, "context");
        return (int) ((((double) C74783i3.m89537a(context).f24704a) * 0.6d) - ((double) context.getResources().getDimensionPixelSize(C0966R.dimen.f3757d9)));
    }

    /* renamed from: y */
    public String mo11039y() {
        return "operational_jumpinfo";
    }

    /* renamed from: z */
    public final void mo11040z(View view, boolean z) {
        C87412m.m108594g(view, "iconLayout");
        C61926c.m72668M(new C10794a(z, view));
    }
}
