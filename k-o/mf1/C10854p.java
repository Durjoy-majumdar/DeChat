package mf1;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
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
import er1.C7868s3;
import go1.C8366a;
import go1.C8368c;
import gy3.C87412m;
import ht1.C60200t1;
import j20.C117292a;
import jq3.C60905o;
import k20.C60958c;
import k20.C9556a;
import l60.C99342a;
import l60.C99344b;
import o40.C61926c;
import pf1.C11920q;
import pl1.C100810g0;
import pl1.C11978e0;
import pl1.C11984n0;
import pl1.C11990s0;
import r60.C101350i;
import rf1.C12982a;
import t60.C13831b;
import t60.C64205a;
import t60.C64207e;
import te3.C49730ho;
import up1.C27696y;
import x60.C102564a;

/* renamed from: mf1.p */
public abstract class C10854p extends C12982a {

    /* renamed from: mf1.p$a */
    public static final class C10855a<T, R> implements C64207e {

        /* renamed from: a */
        public final /* synthetic */ C10854p f32421a;

        /* renamed from: b */
        public final /* synthetic */ View f32422b;

        public C10855a(C10854p pVar, View view) {
            this.f32421a = pVar;
            this.f32422b = view;
        }

        /* renamed from: a */
        public void mo507a(C102564a aVar, C101350i iVar, Object obj) {
            Bitmap bitmap = (Bitmap) obj;
            C10854p pVar = this.f32421a;
            View view = this.f32422b;
            boolean z = bitmap != null;
            pVar.getClass();
            C87412m.m108594g(view, "iconLayout");
            C61926c.m72668M(new C10845o(z, view));
        }
    }

    /* renamed from: mf1.p$b */
    public static final class C10856b implements C64205a {

        /* renamed from: a */
        public final /* synthetic */ C10854p f32423a;

        /* renamed from: b */
        public final /* synthetic */ View f32424b;

        public C10856b(C10854p pVar, View view) {
            this.f32423a = pVar;
            this.f32424b = view;
        }

        /* renamed from: a */
        public final void mo729a(boolean z, Object[] objArr) {
            C10854p pVar = this.f32423a;
            View view = this.f32424b;
            pVar.getClass();
            C87412m.m108594g(view, "iconLayout");
            C61926c.m72668M(new C10845o(z, view));
        }
    }

    /* renamed from: mf1.p$c */
    public static final class C10857c implements C13831b {

        /* renamed from: a */
        public final /* synthetic */ View f32425a;

        public C10857c(C10854p pVar, View view) {
            this.f32425a = view;
        }
    }

    /* renamed from: A */
    public final void mo11072A(String str, View view, WeImageView weImageView) {
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
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/feed/component/FeedBaseCardJumperObserver", "loadImage", "(Ljava/lang/String;Landroid/view/View;Lcom/tencent/mm/ui/widget/imageview/WeImageView;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/finder/feed/component/FeedBaseCardJumperObserver", "loadImage", "(Ljava/lang/String;Landroid/view/View;Lcom/tencent/mm/ui/widget/imageview/WeImageView;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        C9556a aVar2 = new C9556a();
        ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
        aVar2.mo10233c(0);
        C117292a.m165358d(view, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/feed/component/FeedBaseCardJumperObserver", "loadImage", "(Ljava/lang/String;Landroid/view/View;Lcom/tencent/mm/ui/widget/imageview/WeImageView;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/finder/feed/component/FeedBaseCardJumperObserver", "loadImage", "(Ljava/lang/String;Landroid/view/View;Lcom/tencent/mm/ui/widget/imageview/WeImageView;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        C99344b<C100810g0, Bitmap> b = ((C11990s0) C39818r.f106831a.mo62446e(cls2).mo62447c(cls)).mo11871f2().mo85956b(new C11984n0(str, C27696y.THUMB_IMAGE), ((C11990s0) C39818r.f106831a.mo62446e(cls2).mo62447c(cls)).mo11867O2(C11978e0.C11979a.COMMON));
        C10855a aVar3 = new C10855a(this, view2);
        b.getClass();
        b.f291320d = aVar3;
        b.f291324h = new C10856b(this, view2);
        b.f291323g = new C10857c(this, view2);
        ((C99342a) b).mo85954d(weImageView2);
    }

    /* renamed from: B */
    public final void mo11073B(TextView textView, CharSequence charSequence) {
        if (textView != null) {
            textView.setText(charSequence);
            textView.setVisibility(Util.isNullOrNil(textView.getText()) ? 8 : 0);
        }
    }

    /* renamed from: g */
    public C8366a mo11037g(FinderJumpInfo finderJumpInfo) {
        C87412m.m108594g(finderJumpInfo, "info");
        return finderJumpInfo.business_type == 2 ? finderJumpInfo.ext_type == 3 ? C8366a.AD_HARD : C8366a.AD_COMMON : super.mo11037g(finderJumpInfo);
    }

    /* renamed from: x */
    public final void mo11074x(BaseFinderFeed baseFinderFeed, C60905o oVar, View view, C11920q qVar, String str, C49730ho hoVar, boolean z) {
        int i;
        View view2;
        ViewGroup.LayoutParams layoutParams;
        int i2;
        C60905o oVar2;
        View view3;
        C60905o oVar3 = oVar;
        View view4 = view;
        C11920q qVar2 = qVar;
        C49730ho hoVar2 = hoVar;
        Class cls = C11990s0.class;
        Class<C60200t1> cls2 = C60200t1.class;
        C87412m.m108594g(baseFinderFeed, "feed");
        C87412m.m108594g(oVar3, "holder");
        C87412m.m108594g(view4, "jumpView");
        C87412m.m108594g(qVar2, "infoEx");
        C87412m.m108594g(str, FirebaseAnalytics.C113379b.SOURCE);
        if (hoVar2 == null) {
            Log.m105924i("Finder.FeedCardJumperObserver", "bindBigCard cardStyle == null");
            return;
        }
        C10817f1 f1Var = qVar2.f34823A;
        if (f1Var != null) {
            f1Var.f32318b = 2;
        }
        FinderJumpInfo finderJumpInfo = qVar2.f34827a;
        View findViewById = view4.findViewById(C0966R.C0970id.f358405m20);
        View findViewById2 = view4.findViewById(C0966R.C0970id.n_a);
        Context context = oVar3.f173499A;
        C87412m.m108593f(context, "holder.context");
        int z2 = mo11076z(context);
        RoundedCornerFrameLayout roundedCornerFrameLayout = (RoundedCornerFrameLayout) view4.findViewById(C0966R.C0970id.n8b);
        WeImageView weImageView = (WeImageView) view4.findViewById(C0966R.C0970id.n86);
        TextView textView = (TextView) view4.findViewById(C0966R.C0970id.n87);
        View view5 = findViewById;
        TextView textView2 = (TextView) view4.findViewById(C0966R.C0970id.n89);
        String str2 = "holder.context";
        TextView textView3 = (TextView) view4.findViewById(C0966R.C0970id.n84);
        String str3 = "Finder.FeedCardJumperObserver";
        ImageView imageView = (ImageView) view4.findViewById(C0966R.C0970id.f358067n82);
        View view6 = findViewById2;
        TextView textView4 = (TextView) view4.findViewById(C0966R.C0970id.f358075gr2);
        int i3 = z2;
        View findViewById3 = view4.findViewById(C0966R.C0970id.n8d);
        weImageView.clearColorFilter();
        weImageView.setLayerPaint((Paint) null);
        weImageView.setIconColor(0);
        if (textView2 != null) {
            textView2.setVisibility(0);
        }
        if (textView4 != null) {
            textView4.setVisibility(0);
        }
        if (!Util.isNullOrNil(hoVar2.f134761o)) {
            findViewById3.setBackgroundColor(Color.parseColor(hoVar2.f134761o));
        }
        if (!Util.isNullOrNil(hoVar2.f134760n)) {
            textView4.setTextColor(Color.parseColor(hoVar2.f134760n));
        }
        if (!Util.isNullOrNil(hoVar2.f134757h)) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            C117292a.m165358d(findViewById3, aVar.mo10232b(), "com/tencent/mm/plugin/finder/feed/component/FeedBaseCardJumperObserver", "bindBigCard", "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Landroid/view/View;Lcom/tencent/mm/plugin/finder/feed/jumper/FinderJumpInfoEx;Ljava/lang/String;Lcom/tencent/mm/protocal/protobuf/CardStyle;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById3.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(findViewById3, "com/tencent/mm/plugin/finder/feed/component/FeedBaseCardJumperObserver", "bindBigCard", "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Landroid/view/View;Lcom/tencent/mm/plugin/finder/feed/jumper/FinderJumpInfoEx;Ljava/lang/String;Lcom/tencent/mm/protocal/protobuf/CardStyle;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            textView4.setText(hoVar2.f134757h);
        } else {
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar2.mo10233c(8);
            C117292a.m165358d(findViewById3, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/feed/component/FeedBaseCardJumperObserver", "bindBigCard", "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Landroid/view/View;Lcom/tencent/mm/plugin/finder/feed/jumper/FinderJumpInfoEx;Ljava/lang/String;Lcom/tencent/mm/protocal/protobuf/CardStyle;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(findViewById3, "com/tencent/mm/plugin/finder/feed/component/FeedBaseCardJumperObserver", "bindBigCard", "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Landroid/view/View;Lcom/tencent/mm/plugin/finder/feed/jumper/FinderJumpInfoEx;Ljava/lang/String;Lcom/tencent/mm/protocal/protobuf/CardStyle;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        mo11073B(textView2, hoVar2.f134755f);
        mo11073B(textView3, hoVar2.f134759j);
        if (!Util.isNullOrNil(hoVar2.f134758i)) {
            imageView.setVisibility(0);
            C39818r rVar = C39818r.f106831a;
            ((C99342a) ((C11990s0) rVar.mo62446e(cls2).mo62447c(cls)).mo11871f2().mo85956b(new C11984n0(hoVar2.f134758i, C27696y.THUMB_IMAGE), ((C11990s0) rVar.mo62446e(cls2).mo62447c(cls)).mo11867O2(C11978e0.C11979a.LINK_THUMB))).mo85954d(imageView);
        } else {
            imageView.setVisibility(8);
        }
        String h = mo12511h(hoVar2.f134753d, qVar2.f34827a.icon_url);
        C87412m.m108593f(roundedCornerFrameLayout, "iconLayout");
        mo11072A(h, roundedCornerFrameLayout, weImageView);
        textView.setText(mo12511h(hoVar2.f134754e, qVar2.f34827a.wording));
        FinderJumpInfoRedDot finderJumpInfoRedDot = finderJumpInfo.red_dot;
        if (finderJumpInfoRedDot == null || 1 != finderJumpInfoRedDot.red_dot_type) {
            oVar2 = oVar;
            view2 = view;
            i2 = 8;
            layoutParams = null;
            i = i3;
        } else {
            oVar2 = oVar;
            i2 = 8;
            i = i3 - oVar2.f173499A.getResources().getDimensionPixelSize(C0966R.dimen.f3766df);
            view2 = view;
            layoutParams = null;
            LinearLayout linearLayout = (LinearLayout) view2.findViewById(C0966R.C0970id.d9m);
            if (linearLayout != null) {
                linearLayout.setVisibility(0);
            }
        }
        float f = hoVar2.f134762p;
        boolean z3 = true;
        roundedCornerFrameLayout.post(new C10837l(roundedCornerFrameLayout, (f > 0.0f ? 1 : (f == 0.0f ? 0 : -1)) == 0 ? 1.0f : f, f));
        C7868s3 s3Var = C7868s3.f26472a;
        C87412m.m108593f(textView2, "titleLineTwoTv");
        int d = s3Var.mo8978d(textView2);
        if (d > i) {
            ViewGroup.LayoutParams layoutParams2 = textView2.getLayoutParams();
            if (layoutParams2 != null) {
                layoutParams2.width = i;
            } else {
                layoutParams2 = layoutParams;
            }
            textView2.setLayoutParams(layoutParams2);
        }
        View findViewById4 = view2.findViewById(C0966R.C0970id.n8_);
        if (findViewById4 != null) {
            int d2 = s3Var.mo8978d(findViewById4);
            if (d2 < s3Var.mo8978d(textView)) {
                d2 = textView.getMeasuredWidth();
            }
            if (d2 >= d) {
                d = d2;
            }
            if (d > i) {
                d = i;
            }
            ViewGroup.LayoutParams layoutParams3 = findViewById4.getLayoutParams();
            layoutParams3.width = d;
            findViewById4.setLayoutParams(layoutParams3);
        }
        CharSequence text = textView.getText();
        if (!(text == null || text.length() == 0)) {
            z3 = false;
        }
        if (z3) {
            C9556a aVar3 = new C9556a();
            aVar3.mo10233c(Integer.valueOf(i2));
            C117292a.m165358d(view6, aVar3.mo10232b(), "com/tencent/mm/plugin/finder/feed/component/FeedBaseCardJumperObserver", "bindBigCard", "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Landroid/view/View;Lcom/tencent/mm/plugin/finder/feed/jumper/FinderJumpInfoEx;Ljava/lang/String;Lcom/tencent/mm/protocal/protobuf/CardStyle;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3 = view6;
            view3.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
            C117292a.m165359e(view3, "com/tencent/mm/plugin/finder/feed/component/FeedBaseCardJumperObserver", "bindBigCard", "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Landroid/view/View;Lcom/tencent/mm/plugin/finder/feed/jumper/FinderJumpInfoEx;Ljava/lang/String;Lcom/tencent/mm/protocal/protobuf/CardStyle;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            Log.m105928w(str3, "title is null.");
        } else {
            view3 = view6;
            C9556a aVar4 = new C9556a();
            aVar4.mo10233c(0);
            View view7 = view3;
            C117292a.m165358d(view7, aVar4.mo10232b(), "com/tencent/mm/plugin/finder/feed/component/FeedBaseCardJumperObserver", "bindBigCard", "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Landroid/view/View;Lcom/tencent/mm/plugin/finder/feed/jumper/FinderJumpInfoEx;Ljava/lang/String;Lcom/tencent/mm/protocal/protobuf/CardStyle;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
            C117292a.m165359e(view7, "com/tencent/mm/plugin/finder/feed/component/FeedBaseCardJumperObserver", "bindBigCard", "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Landroid/view/View;Lcom/tencent/mm/plugin/finder/feed/jumper/FinderJumpInfoEx;Ljava/lang/String;Lcom/tencent/mm/protocal/protobuf/CardStyle;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            if (textView.getPaint().measureText(textView.getText().toString()) > ((float) i)) {
                textView.setWidth(i);
            }
            C8368c.f27352a.mo9337d(oVar2, view2, mo11037g(finderJumpInfo));
            Context context2 = oVar2.f173499A;
            C87412m.m108593f(context2, str2);
            ((C58417y0) C86312j.m106911c(C58417y0.class)).vx0(context2, this.f37014c, "universal_jumpinfo", qVar);
        }
        if (z) {
            View findViewById5 = view2.findViewById(C0966R.C0970id.f358405m20);
            View findViewById6 = view2.findViewById(C0966R.C0970id.n_a);
            C9556a aVar5 = new C9556a();
            aVar5.mo10233c(0);
            View view8 = findViewById6;
            C117292a.m165358d(view8, aVar5.mo10232b(), "com/tencent/mm/plugin/finder/feed/component/FeedBaseCardJumperObserver", "animateExpand", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById6.setVisibility(((Integer) aVar5.mo10231a(0)).intValue());
            C117292a.m165359e(findViewById6, "com/tencent/mm/plugin/finder/feed/component/FeedBaseCardJumperObserver", "animateExpand", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            C9556a aVar6 = new C9556a();
            aVar6.mo10233c(Float.valueOf(0.0f));
            C117292a.m165358d(view8, aVar6.mo10232b(), "com/tencent/mm/plugin/finder/feed/component/FeedBaseCardJumperObserver", "animateExpand", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            findViewById6.setAlpha(((Float) aVar6.mo10231a(0)).floatValue());
            C117292a.m165359e(findViewById6, "com/tencent/mm/plugin/finder/feed/component/FeedBaseCardJumperObserver", "animateExpand", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            C61926c.m72677b(findViewById6, new C10843n(view2, findViewById6, this, findViewById5));
            return;
        }
        C9556a aVar7 = new C9556a();
        aVar7.mo10233c(Integer.valueOf(i2));
        View view9 = view3;
        View view10 = view5;
        C117292a.m165358d(view5, aVar7.mo10232b(), "com/tencent/mm/plugin/finder/feed/component/FeedBaseCardJumperObserver", "bindBigCard", "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Landroid/view/View;Lcom/tencent/mm/plugin/finder/feed/jumper/FinderJumpInfoEx;Ljava/lang/String;Lcom/tencent/mm/protocal/protobuf/CardStyle;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view10.setVisibility(((Integer) aVar7.mo10231a(0)).intValue());
        C117292a.m165359e(view10, "com/tencent/mm/plugin/finder/feed/component/FeedBaseCardJumperObserver", "bindBigCard", "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Landroid/view/View;Lcom/tencent/mm/plugin/finder/feed/jumper/FinderJumpInfoEx;Ljava/lang/String;Lcom/tencent/mm/protocal/protobuf/CardStyle;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        C9556a aVar8 = new C9556a();
        aVar8.mo10233c(0);
        C117292a.m165358d(view9, aVar8.mo10232b(), "com/tencent/mm/plugin/finder/feed/component/FeedBaseCardJumperObserver", "bindBigCard", "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Landroid/view/View;Lcom/tencent/mm/plugin/finder/feed/jumper/FinderJumpInfoEx;Ljava/lang/String;Lcom/tencent/mm/protocal/protobuf/CardStyle;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view9.setVisibility(((Integer) aVar8.mo10231a(0)).intValue());
        C117292a.m165359e(view9, "com/tencent/mm/plugin/finder/feed/component/FeedBaseCardJumperObserver", "bindBigCard", "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Landroid/view/View;Lcom/tencent/mm/plugin/finder/feed/jumper/FinderJumpInfoEx;Ljava/lang/String;Lcom/tencent/mm/protocal/protobuf/CardStyle;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    /* renamed from: y */
    public final void mo11075y(BaseFinderFeed baseFinderFeed, C60905o oVar, View view, C11920q qVar, C49730ho hoVar, String str) {
        TextView textView;
        TextView textView2;
        TextView textView3;
        C60905o oVar2 = oVar;
        View view2 = view;
        C11920q qVar2 = qVar;
        C49730ho hoVar2 = hoVar;
        C87412m.m108594g(baseFinderFeed, "feed");
        C87412m.m108594g(oVar2, "holder");
        C87412m.m108594g(view2, "jumpView");
        C87412m.m108594g(qVar2, "infoEx");
        C87412m.m108594g(str, FirebaseAnalytics.C113379b.SOURCE);
        if (hoVar2 == null) {
            Log.m105924i("Finder.FeedCardJumperObserver", "bindSmallCard cardStyle == null");
            return;
        }
        C10817f1 f1Var = qVar2.f34823A;
        if (f1Var != null) {
            f1Var.f32318b = 1;
        }
        FinderJumpInfo finderJumpInfo = qVar2.f34827a;
        Log.m105924i("Finder.FeedCardJumperObserver", "[onBindView] feedId=" + C61926c.m72691p(this.f37014c) + " jumpType=" + finderJumpInfo.jumpinfo_type + " title=" + finderJumpInfo.recommend_reason + '|' + finderJumpInfo.wording + " icon_url=" + finderJumpInfo.icon_url + " ext_info=" + finderJumpInfo.ext_info + ' ');
        View findViewById = view2.findViewById(C0966R.C0970id.f358405m20);
        View findViewById2 = view2.findViewById(C0966R.C0970id.n_a);
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(0);
        View view3 = findViewById;
        C117292a.m165358d(view3, aVar.mo10232b(), "com/tencent/mm/plugin/finder/feed/component/FeedBaseCardJumperObserver", "bindSmallCard", "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Landroid/view/View;Lcom/tencent/mm/plugin/finder/feed/jumper/FinderJumpInfoEx;Lcom/tencent/mm/protocal/protobuf/CardStyle;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view3, "com/tencent/mm/plugin/finder/feed/component/FeedBaseCardJumperObserver", "bindSmallCard", "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Landroid/view/View;Lcom/tencent/mm/plugin/finder/feed/jumper/FinderJumpInfoEx;Lcom/tencent/mm/protocal/protobuf/CardStyle;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        C9556a aVar2 = new C9556a();
        aVar2.mo10233c(8);
        View view4 = findViewById2;
        C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/feed/component/FeedBaseCardJumperObserver", "bindSmallCard", "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Landroid/view/View;Lcom/tencent/mm/plugin/finder/feed/jumper/FinderJumpInfoEx;Lcom/tencent/mm/protocal/protobuf/CardStyle;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view4.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
        C117292a.m165359e(view4, "com/tencent/mm/plugin/finder/feed/component/FeedBaseCardJumperObserver", "bindSmallCard", "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Landroid/view/View;Lcom/tencent/mm/plugin/finder/feed/jumper/FinderJumpInfoEx;Lcom/tencent/mm/protocal/protobuf/CardStyle;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        Context context = oVar2.f173499A;
        C87412m.m108593f(context, "holder.context");
        int z = mo11076z(context);
        C8368c cVar = C8368c.f27352a;
        if (!cVar.mo9335b(oVar.hashCode(), mo11037g(finderJumpInfo))) {
            mo12512t(8);
            Log.m105924i("Finder.FeedCardJumperObserver", "[onBindView] priority not ok");
            return;
        }
        RoundedCornerFrameLayout roundedCornerFrameLayout = (RoundedCornerFrameLayout) view2.findViewById(C0966R.C0970id.d9i);
        WeImageView weImageView = (WeImageView) view2.findViewById(C0966R.C0970id.d8w);
        TextView textView4 = (TextView) view2.findViewById(C0966R.C0970id.f358071d92);
        TextView textView5 = (TextView) view2.findViewById(C0966R.C0970id.n88);
        TextView textView6 = (TextView) view2.findViewById(C0966R.C0970id.f358074gr1);
        View findViewById3 = view2.findViewById(C0966R.C0970id.n8c);
        C8368c cVar2 = cVar;
        C87412m.m108593f(roundedCornerFrameLayout, "iconLayout");
        String str2 = "holder.context";
        roundedCornerFrameLayout.setRadius((float) (finderJumpInfo.business_type == 8 ? roundedCornerFrameLayout.getContext().getResources().getDimensionPixelSize(C0966R.dimen.f3699bs) : roundedCornerFrameLayout.getContext().getResources().getDimensionPixelSize(C0966R.dimen.f3703bv)));
        weImageView.clearColorFilter();
        weImageView.setLayerPaint((Paint) null);
        weImageView.setIconColor(0);
        mo11073B(textView5, hoVar2.f134755f);
        if (!Util.isNullOrNil(hoVar2.f134761o)) {
            findViewById3.setBackgroundColor(Color.parseColor(hoVar2.f134761o));
        } else {
            findViewById3.setBackgroundColor(oVar2.f173499A.getResources().getColor(C0966R.color.f3169hp));
        }
        if (!Util.isNullOrNil(hoVar2.f134760n)) {
            textView6.setTextColor(Color.parseColor(hoVar2.f134760n));
        } else {
            textView6.setTextColor(oVar2.f173499A.getResources().getColor(C0966R.color.f2975b6));
        }
        if (!Util.isNullOrNil(hoVar2.f134757h)) {
            C9556a aVar3 = new C9556a();
            textView = textView5;
            aVar3.mo10233c(0);
            View view5 = findViewById3;
            C117292a.m165358d(view5, aVar3.mo10232b(), "com/tencent/mm/plugin/finder/feed/component/FeedBaseCardJumperObserver", "bindSmallCard", "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Landroid/view/View;Lcom/tencent/mm/plugin/finder/feed/jumper/FinderJumpInfoEx;Lcom/tencent/mm/protocal/protobuf/CardStyle;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById3.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
            C117292a.m165359e(view5, "com/tencent/mm/plugin/finder/feed/component/FeedBaseCardJumperObserver", "bindSmallCard", "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Landroid/view/View;Lcom/tencent/mm/plugin/finder/feed/jumper/FinderJumpInfoEx;Lcom/tencent/mm/protocal/protobuf/CardStyle;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            textView6.setText(hoVar2.f134757h);
        } else {
            textView = textView5;
            C9556a aVar4 = new C9556a();
            aVar4.mo10233c(8);
            View view6 = findViewById3;
            C117292a.m165358d(view6, aVar4.mo10232b(), "com/tencent/mm/plugin/finder/feed/component/FeedBaseCardJumperObserver", "bindSmallCard", "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Landroid/view/View;Lcom/tencent/mm/plugin/finder/feed/jumper/FinderJumpInfoEx;Lcom/tencent/mm/protocal/protobuf/CardStyle;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById3.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
            C117292a.m165359e(view6, "com/tencent/mm/plugin/finder/feed/component/FeedBaseCardJumperObserver", "bindSmallCard", "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Landroid/view/View;Lcom/tencent/mm/plugin/finder/feed/jumper/FinderJumpInfoEx;Lcom/tencent/mm/protocal/protobuf/CardStyle;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        C11920q qVar3 = qVar;
        mo11072A(mo12511h(hoVar2.f134753d, qVar3.f34827a.icon_url), roundedCornerFrameLayout, weImageView);
        textView4.setText(mo12511h(hoVar2.f134754e, qVar3.f34827a.wording));
        FinderJumpInfoRedDot finderJumpInfoRedDot = finderJumpInfo.red_dot;
        if (finderJumpInfoRedDot != null && 1 == finderJumpInfoRedDot.red_dot_type) {
            z -= oVar2.f173499A.getResources().getDimensionPixelSize(C0966R.dimen.f3766df);
            WeImageView weImageView2 = (WeImageView) view2.findViewById(C0966R.C0970id.d9l);
            if (weImageView2 != null) {
                weImageView2.setVisibility(8);
            }
            LinearLayout linearLayout = (LinearLayout) view2.findViewById(C0966R.C0970id.d9m);
            if (linearLayout != null) {
                linearLayout.setVisibility(0);
            }
        }
        int i = z;
        float f = hoVar2.f134762p;
        roundedCornerFrameLayout.post(new C10837l(roundedCornerFrameLayout, (f > 0.0f ? 1 : (f == 0.0f ? 0 : -1)) == 0 ? 1.0f : f, f));
        CharSequence text = textView4.getText();
        if (text == null || text.length() == 0) {
            C9556a aVar5 = new C9556a();
            aVar5.mo10233c(8);
            View view7 = findViewById;
            C117292a.m165358d(view7, aVar5.mo10232b(), "com/tencent/mm/plugin/finder/feed/component/FeedBaseCardJumperObserver", "bindSmallCard", "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Landroid/view/View;Lcom/tencent/mm/plugin/finder/feed/jumper/FinderJumpInfoEx;Lcom/tencent/mm/protocal/protobuf/CardStyle;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((Integer) aVar5.mo10231a(0)).intValue());
            C117292a.m165359e(view7, "com/tencent/mm/plugin/finder/feed/component/FeedBaseCardJumperObserver", "bindSmallCard", "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Landroid/view/View;Lcom/tencent/mm/plugin/finder/feed/jumper/FinderJumpInfoEx;Lcom/tencent/mm/protocal/protobuf/CardStyle;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            Log.m105928w("Finder.FeedCardJumperObserver", "title is null.");
            textView2 = textView4;
            textView3 = textView;
        } else {
            TextView textView7 = textView4;
            TextView textView8 = textView;
            C9556a aVar6 = new C9556a();
            aVar6.mo10233c(0);
            C8368c cVar3 = cVar2;
            String str3 = str2;
            C117292a.m165358d(findViewById, aVar6.mo10232b(), "com/tencent/mm/plugin/finder/feed/component/FeedBaseCardJumperObserver", "bindSmallCard", "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Landroid/view/View;Lcom/tencent/mm/plugin/finder/feed/jumper/FinderJumpInfoEx;Lcom/tencent/mm/protocal/protobuf/CardStyle;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((Integer) aVar6.mo10231a(0)).intValue());
            C117292a.m165359e(findViewById, "com/tencent/mm/plugin/finder/feed/component/FeedBaseCardJumperObserver", "bindSmallCard", "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Landroid/view/View;Lcom/tencent/mm/plugin/finder/feed/jumper/FinderJumpInfoEx;Lcom/tencent/mm/protocal/protobuf/CardStyle;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            if (textView7.getPaint().measureText(textView7.getText().toString()) > ((float) i)) {
                textView7.setWidth(i);
            }
            cVar3.mo9337d(oVar2, view2, mo11037g(finderJumpInfo));
            Context context2 = oVar2.f173499A;
            C87412m.m108593f(context2, str3);
            textView2 = textView7;
            textView3 = textView;
            ((C58417y0) C86312j.m106911c(C58417y0.class)).vx0(context2, this.f37014c, "universal_jumpinfo", qVar);
        }
        if (textView3 != null) {
            C7868s3 s3Var = C7868s3.f26472a;
            int d = s3Var.mo8978d(textView3);
            if (d < s3Var.mo8978d(textView2)) {
                ViewGroup.LayoutParams layoutParams = textView3.getLayoutParams();
                layoutParams.width = textView2.getMeasuredWidth();
                textView3.setLayoutParams(layoutParams);
            }
            if (d > i) {
                ViewGroup.LayoutParams layoutParams2 = textView3.getLayoutParams();
                layoutParams2.width = i;
                textView3.setLayoutParams(layoutParams2);
            }
        }
    }

    /* renamed from: z */
    public final int mo11076z(Context context) {
        return (int) ((((double) C74783i3.m89537a(context).f24704a) * 0.6d) - ((double) context.getResources().getDimensionPixelSize(C0966R.dimen.f3760da)));
    }
}
