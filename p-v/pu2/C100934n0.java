package pu2;

import android.content.Context;
import android.content.res.Configuration;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.SnsFinderPostEvent;
import com.tencent.p014mm.kiss.widget.textview.PLSysTextView;
import com.tencent.p014mm.p136ui.widget.StoryAvatarDotsView;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.plugin.sns.model.C94965w1;
import com.tencent.p014mm.plugin.sns.p106ui.AsyncNormalTextView;
import com.tencent.p014mm.plugin.sns.p106ui.C71253l1;
import com.tencent.p014mm.plugin.sns.p106ui.C96275w6;
import com.tencent.p014mm.plugin.sns.p106ui.SnsTimeLineBaseAdapter;
import com.tencent.p014mm.plugin.sns.p106ui.SnsTranslateResultView;
import com.tencent.p014mm.plugin.sns.p106ui.improve.view.ImproveTextView;
import com.tencent.p014mm.plugin.sns.p106ui.item.BaseTimeLineItem;
import com.tencent.p014mm.plugin.sns.p106ui.item.improve.recycle.TimelineCommentView;
import com.tencent.p014mm.plugin.sns.p106ui.listener.TimelineClickListener;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsJankActivity;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.p106ui.widget.SnsAvatarImageView;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import com.tencent.p014mm.protocal.protobuf.TimeLineObject;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72996z1;
import di3.C86312j;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import ip3.C98780b;
import j20.C117292a;
import java.util.ArrayList;
import java.util.List;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import ls2.C99591a;
import o40.C61926c;
import op3.C117882j;
import p196ln.C76705f;
import p599lr.C61381b;
import p629ny.C76979h;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36570n;
import te3.C101789j00;
import te3.C101808lv2;
import tu2.C101931d;
import vu2.C52993b;
import xt2.C102723a;
import yn2.C102882s0;
import yn2.C102887v0;

/* renamed from: pu2.n0 */
public abstract class C100934n0 extends C100942r {

    /* renamed from: U */
    public TimelineCommentView f295564U;

    /* renamed from: V */
    public SnsTranslateResultView f295565V;

    /* renamed from: W */
    public TextView f295566W;

    /* renamed from: p0 */
    public ViewGroup f295567p0;

    /* renamed from: x0 */
    public StoryAvatarDotsView f295568x0;

    /* renamed from: pu2.n0$a */
    public static final class C100935a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C100934n0 f295569d;

        /* renamed from: pu2.n0$a$a */
        public static final class C100936a extends C87413o implements C32224a<C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ C100934n0 f295570d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C100936a(C100934n0 n0Var) {
                super(0);
                this.f295570d = n0Var;
            }

            public Object invoke() {
                SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemMeasure$loadFinderPostView$1$1");
                SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemMeasure$loadFinderPostView$1$1");
                this.f295570d.getFinderPostStub().setVisibility(8);
                SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemMeasure$loadFinderPostView$1$1");
                C13598b0 b0Var = C13598b0.f38549a;
                SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemMeasure$loadFinderPostView$1$1");
                return b0Var;
            }
        }

        public C100935a(C100934n0 n0Var) {
            this.f295569d = n0Var;
        }

        public final void onClick(View view) {
            int i;
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/sns/ui/item/improve/TimelineItemMeasure$loadFinderPostView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemMeasure$loadFinderPostView$1");
            SnsFinderPostEvent snsFinderPostEvent = new SnsFinderPostEvent();
            snsFinderPostEvent.f265144d.f265146b = this.f295569d.getContext();
            SnsFinderPostEvent.C92576a aVar = snsFinderPostEvent.f265144d;
            if (this.f295569d.getViewType() == 37 || this.f295569d.getViewType() == 36) {
                C102887v0 v0Var = C102887v0.VideoPath;
                i = 2;
            } else {
                C102887v0 v0Var2 = C102887v0.VideoPath;
                i = 0;
            }
            aVar.f265145a = i;
            snsFinderPostEvent.f265144d.f265147c = this.f295569d.getStruct().f281367a;
            snsFinderPostEvent.publish();
            C61926c.m72666K(700, new C100936a(this.f295569d));
            SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemMeasure$loadFinderPostView$1");
            C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/item/improve/TimelineItemMeasure$loadFinderPostView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C100934n0(Context context, C96275w6 w6Var, SnsTimeLineBaseAdapter snsTimeLineBaseAdapter) {
        super(context, w6Var, snsTimeLineBaseAdapter);
        C87412m.m108594g(context, "context");
        C87412m.m108594g(w6Var, "struct");
        C87412m.m108594g(snsTimeLineBaseAdapter, "adapter");
    }

    /* renamed from: x */
    private final void m132315x(TextView textView, int i, CharSequence charSequence) {
        SnsMethodCalculate.markStartTimeMs("setWithContent", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemMeasure");
        textView.setVisibility(0);
        if (i != 0) {
            charSequence = getContext().getString(i, new Object[]{charSequence});
        }
        textView.setText(((C76979h) C86312j.m106911c(C76979h.class)).yp0(getContext(), charSequence, textView.getTextSize()), TextView.BufferType.SPANNABLE);
        SnsMethodCalculate.markEndTimeMs("setWithContent", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemMeasure");
    }

    public final TimelineCommentView getCommentView() {
        SnsMethodCalculate.markStartTimeMs("getCommentView", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemMeasure");
        TimelineCommentView timelineCommentView = this.f295564U;
        SnsMethodCalculate.markEndTimeMs("getCommentView", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemMeasure");
        return timelineCommentView;
    }

    public final SnsTranslateResultView getContentTranslateResultText() {
        SnsMethodCalculate.markStartTimeMs("getContentTranslateResultText", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemMeasure");
        SnsTranslateResultView snsTranslateResultView = this.f295565V;
        SnsMethodCalculate.markEndTimeMs("getContentTranslateResultText", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemMeasure");
        return snsTranslateResultView;
    }

    /* renamed from: k */
    public void mo140398k() {
        TimelineClickListener timelineClickListener;
        C101789j00 j002;
        int i;
        SnsMethodCalculate.markStartTimeMs("loadBasicInfo", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemMeasure");
        SnsMethodCalculate.markStartTimeMs("loadNecessaryInfo", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemMeasure");
        SnsJankActivity.C96073a aVar = SnsJankActivity.f280539s;
        aVar.mo133612a(mo87544n(), "loadNecessaryInfo");
        mo140441m("MicroMsg.Improve.TimelineItemMeasure", "loadNecessaryInfo[" + getStruct().f281376e0 + "]:" + mo87544n() + ' ' + getStruct().f281390q + ' ');
        SnsMethodCalculate.markStartTimeMs("loadAvatar", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemMeasure");
        SnsAvatarImageView avatarImage = getAvatarImage();
        String str = getStruct().f281398y;
        C87412m.m108593f(str, "struct.mUsername");
        SnsMethodCalculate.markStartTimeMs("load", "com.tencent.mm.plugin.sns.ui.item.improve.loader.TimelineAvatarLoader");
        if (avatarImage == null) {
            SnsMethodCalculate.markEndTimeMs("load", "com.tencent.mm.plugin.sns.ui.item.improve.loader.TimelineAvatarLoader");
        } else {
            ((C76705f) C86312j.m106911c(C76705f.class)).mo106849z(avatarImage, str);
            SnsMethodCalculate.markEndTimeMs("load", "com.tencent.mm.plugin.sns.ui.item.improve.loader.TimelineAvatarLoader");
        }
        SnsMethodCalculate.markEndTimeMs("loadAvatar", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemMeasure");
        SnsMethodCalculate.markStartTimeMs("loadNickName", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemMeasure");
        boolean z = false;
        getWeComTagImage().setVisibility(C72996z1.m85843n5(getStruct().f281398y) && C87412m.m108589b("3552365301", getStruct().f281377f.mo73980x2()) ? 0 : 8);
        getNickNameText().setContactInfo(getStruct().f281377f);
        getNickNameText().mo97919b(getStruct().f281398y, getStruct().f281399z, new BaseTimeLineItem.C95907l(getAdapter(), getStruct().f281398y), getStruct().f281391r, getStruct().f281381h, getViewType(), getStruct().f281391r);
        SnsMethodCalculate.markEndTimeMs("loadNickName", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemMeasure");
        SnsMethodCalculate.markStartTimeMs("loadGameAboutView", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemMeasure");
        if (getStruct().f281365Y) {
            if (getGameAboutStub() instanceof ViewStub) {
                PLSysTextView g = mo140413g(true, C0966R.color.ad8, C0966R.dimen.f3957lf);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                layoutParams.setMargins(0, C76577a.m92157h(getContext(), C0966R.dimen.f3956le), 0, 0);
                View gameAboutStub = getGameAboutStub();
                C87412m.m108592e(gameAboutStub, "null cannot be cast to non-null type android.view.ViewStub");
                C52993b.m59322a((ViewStub) gameAboutStub, g, layoutParams);
                setGameAboutStub(g);
            }
            View gameAboutStub2 = getGameAboutStub();
            C87412m.m108592e(gameAboutStub2, "null cannot be cast to non-null type android.widget.TextView");
            ((TextView) gameAboutStub2).setText(getStruct().f281366Z);
            View gameAboutStub3 = getGameAboutStub();
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar2.mo10233c(0);
            View view = gameAboutStub3;
            C117292a.m165358d(view, aVar2.mo10232b(), "com/tencent/mm/plugin/sns/ui/item/improve/TimelineItemMeasure", "loadGameAboutView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            gameAboutStub3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/sns/ui/item/improve/TimelineItemMeasure", "loadGameAboutView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            View gameAboutStub4 = getGameAboutStub();
            C9556a aVar3 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar3.mo10233c(8);
            View view2 = gameAboutStub4;
            C117292a.m165358d(view2, aVar3.mo10232b(), "com/tencent/mm/plugin/sns/ui/item/improve/TimelineItemMeasure", "loadGameAboutView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            gameAboutStub4.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/sns/ui/item/improve/TimelineItemMeasure", "loadGameAboutView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        SnsMethodCalculate.markEndTimeMs("loadGameAboutView", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemMeasure");
        SnsMethodCalculate.markStartTimeMs("loadAddressView", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemMeasure");
        if (!Util.isNullOrNil(getStruct().f281346F)) {
            if (getAddressStub() instanceof ViewStub) {
                PLSysTextView g2 = mo140413g(true, C0966R.color.ad8, C0966R.dimen.f3957lf);
                LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
                layoutParams2.setMargins(0, C76577a.m92157h(getContext(), C0966R.dimen.f3956le), 0, 0);
                View addressStub = getAddressStub();
                C87412m.m108592e(addressStub, "null cannot be cast to non-null type android.view.ViewStub");
                C52993b.m59322a((ViewStub) addressStub, g2, layoutParams2);
                setAddressStub(g2);
            }
            View addressStub2 = getAddressStub();
            C87412m.m108592e(addressStub2, "null cannot be cast to non-null type com.tencent.mm.kiss.widget.textview.PLSysTextView");
            PLSysTextView pLSysTextView = (PLSysTextView) addressStub2;
            pLSysTextView.setText(getStruct().f281346F);
            pLSysTextView.setClickable(getStruct().f281347G);
            int d = getStruct().f281347G ? C76577a.m92153d(getContext(), C0966R.color.ad8) : C76577a.m92153d(getContext(), C0966R.color.f3288ma);
            if (getStruct().f281347G) {
                pLSysTextView.setBackground(C76577a.m92158i(getContext(), C0966R.C0969drawable.f357356at2));
            } else {
                pLSysTextView.setBackground(C76577a.m92158i(getContext(), C0966R.C0969drawable.ags));
            }
            pLSysTextView.setTextColor(d);
            View addressStub3 = getAddressStub();
            C9556a aVar4 = new C9556a();
            aVar4.mo10233c(0);
            View view3 = addressStub3;
            C117292a.m165358d(view3, aVar4.mo10232b(), "com/tencent/mm/plugin/sns/ui/item/improve/TimelineItemMeasure", "loadAddressView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            addressStub3.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
            C117292a.m165359e(view3, "com/tencent/mm/plugin/sns/ui/item/improve/TimelineItemMeasure", "loadAddressView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            View addressStub4 = getAddressStub();
            C9556a aVar5 = new C9556a();
            aVar5.mo10233c(8);
            View view4 = addressStub4;
            C117292a.m165358d(view4, aVar5.mo10232b(), "com/tencent/mm/plugin/sns/ui/item/improve/TimelineItemMeasure", "loadAddressView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            addressStub4.setVisibility(((Integer) aVar5.mo10231a(0)).intValue());
            C117292a.m165359e(view4, "com/tencent/mm/plugin/sns/ui/item/improve/TimelineItemMeasure", "loadAddressView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        SnsMethodCalculate.markEndTimeMs("loadAddressView", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemMeasure");
        SnsMethodCalculate.markStartTimeMs("loadWithFriendView", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemMeasure");
        if (getStruct().f281355O) {
            if (getWithFriendStub() instanceof ViewStub) {
                PLSysTextView g3 = mo140413g(true, C0966R.color.f356983ae1, C0966R.dimen.f3957lf);
                LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
                layoutParams3.setMargins(0, C76577a.m92157h(getContext(), C0966R.dimen.f3956le), 0, 0);
                View withFriendStub = getWithFriendStub();
                C87412m.m108592e(withFriendStub, "null cannot be cast to non-null type android.view.ViewStub");
                C52993b.m59322a((ViewStub) withFriendStub, g3, layoutParams3);
                setWithFriendStub(g3);
            }
            View withFriendStub2 = getWithFriendStub();
            C87412m.m108592e(withFriendStub2, "null cannot be cast to non-null type com.tencent.mm.kiss.widget.textview.PLSysTextView");
            PLSysTextView pLSysTextView2 = (PLSysTextView) withFriendStub2;
            if (!Util.isNullOrNil(getStruct().f281357Q)) {
                View withFriendStub3 = getWithFriendStub();
                C9556a aVar6 = new C9556a();
                aVar6.mo10233c(8);
                View view5 = withFriendStub3;
                C117292a.m165358d(view5, aVar6.mo10232b(), "com/tencent/mm/plugin/sns/ui/item/improve/TimelineItemMeasure", "loadWithFriendView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                withFriendStub3.setVisibility(((Integer) aVar6.mo10231a(0)).intValue());
                C117292a.m165359e(view5, "com/tencent/mm/plugin/sns/ui/item/improve/TimelineItemMeasure", "loadWithFriendView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            } else if (getStruct().f281358R) {
                m132315x(pLSysTextView2, C0966R.string.jj8, "");
            } else if (!Util.isNullOrNil(getStruct().f281356P)) {
                int i2 = getViewType() == 7 ? C0966R.string.jj6 : C0966R.string.jj7;
                String str2 = getStruct().f281356P;
                C87412m.m108593f(str2, "struct.mWithUserText");
                m132315x(pLSysTextView2, i2, str2);
            } else {
                View withFriendStub4 = getWithFriendStub();
                C9556a aVar7 = new C9556a();
                aVar7.mo10233c(8);
                View view6 = withFriendStub4;
                C117292a.m165358d(view6, aVar7.mo10232b(), "com/tencent/mm/plugin/sns/ui/item/improve/TimelineItemMeasure", "loadWithFriendView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                withFriendStub4.setVisibility(((Integer) aVar7.mo10231a(0)).intValue());
                C117292a.m165359e(view6, "com/tencent/mm/plugin/sns/ui/item/improve/TimelineItemMeasure", "loadWithFriendView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        } else {
            View withFriendStub5 = getWithFriendStub();
            C9556a aVar8 = new C9556a();
            aVar8.mo10233c(8);
            View view7 = withFriendStub5;
            C117292a.m165358d(view7, aVar8.mo10232b(), "com/tencent/mm/plugin/sns/ui/item/improve/TimelineItemMeasure", "loadWithFriendView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            withFriendStub5.setVisibility(((Integer) aVar8.mo10231a(0)).intValue());
            C117292a.m165359e(view7, "com/tencent/mm/plugin/sns/ui/item/improve/TimelineItemMeasure", "loadWithFriendView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        SnsMethodCalculate.markEndTimeMs("loadWithFriendView", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemMeasure");
        SnsMethodCalculate.markStartTimeMs("loadTypeIcon", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemMeasure");
        if (getStruct().f281351K) {
            if (getTypeIcon() instanceof ViewStub) {
                WeImageView weImageView = new WeImageView(getContext());
                weImageView.setImageResource(C0966R.raw.icons_outlined_mini_program);
                weImageView.setIconColor(C76577a.m92153d(weImageView.getContext(), C0966R.color.BW_0_Alpha_0_3));
                int h = C76577a.m92157h(getContext(), C0966R.dimen.f3726cf);
                int h2 = C76577a.m92157h(getContext(), C0966R.dimen.f3722cc);
                int h3 = C76577a.m92157h(getContext(), C0966R.dimen.f3699bs) - C76577a.m92157h(getContext(), C0966R.dimen.f3766df);
                LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(h, h);
                layoutParams4.setMargins(h2, 0, h3, 0);
                View typeIcon = getTypeIcon();
                C87412m.m108592e(typeIcon, "null cannot be cast to non-null type android.view.ViewStub");
                C52993b.m59322a((ViewStub) typeIcon, weImageView, layoutParams4);
                setTypeIcon(weImageView);
            }
            View typeIcon2 = getTypeIcon();
            C9556a aVar9 = new C9556a();
            aVar9.mo10233c(0);
            View view8 = typeIcon2;
            C117292a.m165358d(view8, aVar9.mo10232b(), "com/tencent/mm/plugin/sns/ui/item/improve/TimelineItemMeasure", "loadTypeIcon", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            typeIcon2.setVisibility(((Integer) aVar9.mo10231a(0)).intValue());
            C117292a.m165359e(view8, "com/tencent/mm/plugin/sns/ui/item/improve/TimelineItemMeasure", "loadTypeIcon", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            View typeIcon3 = getTypeIcon();
            C9556a aVar10 = new C9556a();
            aVar10.mo10233c(8);
            View view9 = typeIcon3;
            C117292a.m165358d(view9, aVar10.mo10232b(), "com/tencent/mm/plugin/sns/ui/item/improve/TimelineItemMeasure", "loadTypeIcon", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            typeIcon3.setVisibility(((Integer) aVar10.mo10231a(0)).intValue());
            C117292a.m165359e(view9, "com/tencent/mm/plugin/sns/ui/item/improve/TimelineItemMeasure", "loadTypeIcon", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        SnsMethodCalculate.markEndTimeMs("loadTypeIcon", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemMeasure");
        SnsMethodCalculate.markStartTimeMs("loadAppNameView", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemMeasure");
        if (getStruct().f281348H) {
            if (getAppNameStub() instanceof ViewStub) {
                PLSysTextView pLSysTextView3 = new PLSysTextView(getContext());
                pLSysTextView3.setSingleLine();
                mo140442o(pLSysTextView3, C0966R.dimen.f3957lf);
                pLSysTextView3.setTextColor(C76577a.m92153d(pLSysTextView3.getContext(), C0966R.color.ad8));
                pLSysTextView3.setEllipsize(TextUtils.TruncateAt.END);
                LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-2, -2);
                layoutParams5.setMargins(C76577a.m92157h(getContext(), C0966R.dimen.f3722cc), 0, 0, 0);
                View appNameStub = getAppNameStub();
                C87412m.m108592e(appNameStub, "null cannot be cast to non-null type android.view.ViewStub");
                C52993b.m59322a((ViewStub) appNameStub, pLSysTextView3, layoutParams5);
                setAppNameStub(pLSysTextView3);
            }
            TimeLineObject timeLineObject = getStruct().f281369b;
            boolean z2 = (timeLineObject != null ? timeLineObject.ContentObj : null) != null && ((i = j002.f298424e) == 28 || i == 34 || i == 45 || i == 43 || i == 36 || (i == 1 && (j002 = timeLineObject.ContentObj).f298435s != null));
            CharSequence charSequence = getStruct().f281350J;
            if (charSequence.length() > 10 && !z2) {
                charSequence = charSequence.subSequence(0, 10).toString() + "...";
            }
            SpannableString spannableString = new SpannableString(charSequence);
            spannableString.setSpan(new C100932m0(this), 0, spannableString.length(), 33);
            getAppNameStub().setClickable(true);
            getAppNameStub().setOnTouchListener(new C71253l1());
            if (!getStruct().f281349I && !C87412m.m108589b("wx7fa037cc7dfabad5", timeLineObject.AppInfo.f299236d)) {
                View appNameStub2 = getAppNameStub();
                C87412m.m108592e(appNameStub2, "null cannot be cast to non-null type com.tencent.mm.kiss.widget.textview.PLSysTextView");
                ((PLSysTextView) appNameStub2).setTextColor(C76577a.m92153d(getContext(), C0966R.color.f356983ae1));
                View appNameStub3 = getAppNameStub();
                C87412m.m108592e(appNameStub3, "null cannot be cast to non-null type com.tencent.mm.kiss.widget.textview.PLSysTextView");
                ((PLSysTextView) appNameStub3).setOnTouchListener((View.OnTouchListener) null);
            }
            View appNameStub4 = getAppNameStub();
            C87412m.m108592e(appNameStub4, "null cannot be cast to non-null type com.tencent.mm.kiss.widget.textview.PLSysTextView");
            ((PLSysTextView) appNameStub4).setText(spannableString, TextView.BufferType.SPANNABLE);
            View appNameStub5 = getAppNameStub();
            C87412m.m108592e(appNameStub5, "null cannot be cast to non-null type com.tencent.mm.kiss.widget.textview.PLSysTextView");
            ((PLSysTextView) appNameStub5).setContentDescription(spannableString);
            View appNameStub6 = getAppNameStub();
            C9556a aVar11 = new C9556a();
            aVar11.mo10233c(0);
            View view10 = appNameStub6;
            C117292a.m165358d(view10, aVar11.mo10232b(), "com/tencent/mm/plugin/sns/ui/item/improve/TimelineItemMeasure", "loadAppNameView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            appNameStub6.setVisibility(((Integer) aVar11.mo10231a(0)).intValue());
            C117292a.m165359e(view10, "com/tencent/mm/plugin/sns/ui/item/improve/TimelineItemMeasure", "loadAppNameView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            View appNameStub7 = getAppNameStub();
            C9556a aVar12 = new C9556a();
            aVar12.mo10233c(8);
            View view11 = appNameStub7;
            C117292a.m165358d(view11, aVar12.mo10232b(), "com/tencent/mm/plugin/sns/ui/item/improve/TimelineItemMeasure", "loadAppNameView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            appNameStub7.setVisibility(((Integer) aVar12.mo10231a(0)).intValue());
            C117292a.m165359e(view11, "com/tencent/mm/plugin/sns/ui/item/improve/TimelineItemMeasure", "loadAppNameView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        SnsMethodCalculate.markEndTimeMs("loadAppNameView", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemMeasure");
        SnsMethodCalculate.markStartTimeMs("loadFeedDeleteView", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemMeasure");
        if (getStruct().f281342B) {
            if (getDelTextStub() instanceof ViewStub) {
                Context context = getContext();
                C87412m.m108593f(context, "context");
                ImproveTextView improveTextView = new ImproveTextView(context);
                improveTextView.setId(C0966R.C0970id.f5712mj);
                improveTextView.setBackgroundResource(C0966R.C0969drawable.f357356at2);
                improveTextView.setSingleLine();
                improveTextView.setText(C76577a.m92166q(improveTextView.getContext(), C0966R.string.f7944x1));
                mo140442o(improveTextView, C0966R.dimen.f3957lf);
                improveTextView.setTextColor(C76577a.m92153d(improveTextView.getContext(), C0966R.color.ad8));
                LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(-2, -2);
                layoutParams6.setMargins(mo140438i(10), 0, 0, 0);
                View delTextStub = getDelTextStub();
                C87412m.m108592e(delTextStub, "null cannot be cast to non-null type android.view.ViewStub");
                C52993b.m59322a((ViewStub) delTextStub, improveTextView, layoutParams6);
                setDelTextStub(improveTextView);
            }
            View delTextStub2 = getDelTextStub();
            C9556a aVar13 = new C9556a();
            aVar13.mo10233c(0);
            View view12 = delTextStub2;
            C117292a.m165358d(view12, aVar13.mo10232b(), "com/tencent/mm/plugin/sns/ui/item/improve/TimelineItemMeasure", "loadFeedDeleteView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            delTextStub2.setVisibility(((Integer) aVar13.mo10231a(0)).intValue());
            C117292a.m165359e(view12, "com/tencent/mm/plugin/sns/ui/item/improve/TimelineItemMeasure", "loadFeedDeleteView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            getDelTextStub().setTag(getStruct().f281381h);
        } else {
            View delTextStub3 = getDelTextStub();
            C9556a aVar14 = new C9556a();
            aVar14.mo10233c(8);
            C117292a.m165358d(delTextStub3, aVar14.mo10232b(), "com/tencent/mm/plugin/sns/ui/item/improve/TimelineItemMeasure", "loadFeedDeleteView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            delTextStub3.setVisibility(((Integer) aVar14.mo10231a(0)).intValue());
            C117292a.m165359e(delTextStub3, "com/tencent/mm/plugin/sns/ui/item/improve/TimelineItemMeasure", "loadFeedDeleteView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        SnsMethodCalculate.markEndTimeMs("loadFeedDeleteView", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemMeasure");
        mo140404t();
        mo87550q();
        aVar.mo133613b(mo87544n());
        SnsMethodCalculate.markEndTimeMs("loadNecessaryInfo", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemMeasure");
        SnsMethodCalculate.markStartTimeMs("loadItemErrorTipView", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemMeasure");
        if (getStruct().f281352L) {
            if (getItemErrorStub().getParent() != null) {
                this.f295566W = (TextView) getItemErrorStub().inflate().findViewById(C0966R.C0970id.hzs);
            }
            TextView textView = this.f295566W;
            if (textView != null) {
                textView.setTag(getStruct().f281381h);
            }
            getItemErrorStub().setVisibility(0);
            mo140441m("MicroMsg.Improve.TimelineItemMeasure", "loadItemErrorTipView error:" + getStruct().f281353M);
            int i3 = getStruct().f281353M;
            if (i3 == 7) {
                TextView textView2 = this.f295566W;
                if (textView2 != null) {
                    textView2.setText(C0966R.string.mij);
                    textView2.setOnClickListener((View.OnClickListener) null);
                    getItemErrorStub().setClickable(false);
                    getItemErrorStub().setEnabled(false);
                }
            } else if (i3 == 201) {
                TextView textView3 = this.f295566W;
                if (textView3 != null) {
                    textView3.setText(C0966R.string.jg4);
                    textView3.setOnClickListener((View.OnClickListener) null);
                    getItemErrorStub().setClickable(false);
                    getItemErrorStub().setEnabled(false);
                }
            } else if (i3 == 210) {
                TextView textView4 = this.f295566W;
                if (textView4 != null) {
                    textView4.setText(C0966R.string.jg6);
                    textView4.setOnClickListener((View.OnClickListener) null);
                    getItemErrorStub().setClickable(false);
                    getItemErrorStub().setEnabled(false);
                }
            } else if (i3 != 211) {
                TextView textView5 = this.f295566W;
                if (textView5 != null) {
                    textView5.setText(C0966R.string.jg7);
                    SnsTimeLineBaseAdapter adapter = getAdapter();
                    C87412m.m108591d(adapter);
                    textView5.setOnClickListener(adapter.f278572f.f280390t);
                    getItemErrorStub().setClickable(true);
                    getItemErrorStub().setEnabled(true);
                }
            } else {
                TextView textView6 = this.f295566W;
                if (textView6 != null) {
                    textView6.setText(C0966R.string.jg5);
                    SnsTimeLineBaseAdapter adapter2 = getAdapter();
                    C87412m.m108591d(adapter2);
                    textView6.setOnClickListener(adapter2.f278572f.f280390t);
                    getItemErrorStub().setClickable(true);
                    getItemErrorStub().setEnabled(true);
                }
            }
            SnsInfo snsInfo = getStruct().f281367a;
            C101808lv2 postInfo = snsInfo != null ? snsInfo.getPostInfo() : null;
            if (postInfo != null && !Util.isNullOrNil(postInfo.f298732F)) {
                mo140441m("MicroMsg.Improve.TimelineItemMeasure", "loadItemErrorTipView tips:" + postInfo.f298737K + ' ' + postInfo.f298738L + ' ' + postInfo.f298732F);
                if (Util.isNullOrNil(postInfo.f298737K) || Util.isNullOrNil(postInfo.f298738L)) {
                    TextView textView7 = this.f295566W;
                    if (textView7 != null) {
                        textView7.setText(postInfo.f298732F);
                    }
                } else {
                    TextView textView8 = this.f295566W;
                    if (textView8 != null) {
                        SnsTimeLineBaseAdapter adapter3 = getAdapter();
                        textView8.setOnClickListener((adapter3 == null || (timelineClickListener = adapter3.f278572f) == null) ? null : timelineClickListener.f280390t);
                    }
                    getItemErrorStub().setClickable(true);
                    getItemErrorStub().setEnabled(true);
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(postInfo.f298738L);
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add(postInfo.f298737K);
                    ((C76979h) C86312j.m106911c(C76979h.class)).mo107047GG(getContext(), arrayList, postInfo.f298732F + postInfo.f298737K, arrayList2, this.f295566W);
                }
            } else if (getStruct().f281367a.getTimeLine().ContentObj.f298424e == 28) {
                TextView textView9 = this.f295566W;
                if (textView9 != null && textView9.isClickable()) {
                    z = true;
                }
                if (z) {
                    getItemErrorStub().setVisibility(8);
                }
            }
        } else {
            getItemErrorStub().setVisibility(8);
        }
        SnsMethodCalculate.markEndTimeMs("loadItemErrorTipView", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemMeasure");
        mo140405w();
        SnsMethodCalculate.markStartTimeMs("getEnableLargeUI", "com.tencent.mm.plugin.sns.ui.improve.component.old.TimelineFeedImproveConfigUIC$Companion");
        SnsMethodCalculate.markStartTimeMs("access$getEnableLargeUI$cp", "com.tencent.mm.plugin.sns.ui.improve.component.old.TimelineFeedImproveConfigUIC");
        boolean z3 = C102723a.f303339d;
        SnsMethodCalculate.markEndTimeMs("access$getEnableLargeUI$cp", "com.tencent.mm.plugin.sns.ui.improve.component.old.TimelineFeedImproveConfigUIC");
        SnsMethodCalculate.markEndTimeMs("getEnableLargeUI", "com.tencent.mm.plugin.sns.ui.improve.component.old.TimelineFeedImproveConfigUIC$Companion");
        if (z3) {
            SnsMethodCalculate.markStartTimeMs("adjustLargeTimelineItemLayout", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemMeasure");
            View appNameStub8 = getAppNameStub();
            TextView textView10 = appNameStub8 instanceof TextView ? (TextView) appNameStub8 : null;
            if (textView10 != null) {
                textView10.setEllipsize((TextUtils.TruncateAt) null);
            }
            SnsMethodCalculate.markEndTimeMs("adjustLargeTimelineItemLayout", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemMeasure");
        }
        SnsMethodCalculate.markEndTimeMs("loadBasicInfo", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemMeasure");
    }

    public void onAttachedToWindow() {
        SnsMethodCalculate.markStartTimeMs("onAttachedToWindow", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemMeasure");
        super.onAttachedToWindow();
        mo140405w();
        SnsMethodCalculate.markEndTimeMs("onAttachedToWindow", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemMeasure");
    }

    public void onConfigurationChanged(Configuration configuration) {
        SnsMethodCalculate.markStartTimeMs("onConfigurationChanged", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemMeasure");
        super.onConfigurationChanged(configuration);
        mo140441m("MicroMsg.Improve.TimelineItemMeasure", "onConfigurationChanged");
        mo140406y();
        SnsMethodCalculate.markEndTimeMs("onConfigurationChanged", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemMeasure");
    }

    /* renamed from: p */
    public abstract BaseTimeLineItem.BaseViewHolder mo140400p();

    /* renamed from: q */
    public void mo87550q() {
        SnsMethodCalculate.markStartTimeMs("customLayoutMeasureForReuse", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemMeasure");
        SnsMethodCalculate.markEndTimeMs("customLayoutMeasureForReuse", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemMeasure");
    }

    /* renamed from: r */
    public final void mo140401r(StoryAvatarDotsView storyAvatarDotsView, List<String> list, int i) {
        SnsMethodCalculate.markStartTimeMs("initAvatarsView", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemMeasure");
        if (storyAvatarDotsView == null) {
            SnsMethodCalculate.markEndTimeMs("initAvatarsView", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemMeasure");
            return;
        }
        storyAvatarDotsView.setVisibility(0);
        storyAvatarDotsView.setIconSize(C76577a.m92151b(getContext(), 20));
        storyAvatarDotsView.setIconGap(C76577a.m92151b(getContext(), 24));
        if (list.size() > 0) {
            storyAvatarDotsView.setVisibility(0);
            storyAvatarDotsView.setIconLayerCount(Math.min(list.size(), i));
            int childCount = storyAvatarDotsView.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                ((C76705f) C86312j.m106911c(C76705f.class)).D20(storyAvatarDotsView.mo136313a(i2), list.get(i2), 0.1f);
                storyAvatarDotsView.mo136313a(i2).setPadding(C76577a.m92151b(getContext(), 1), C76577a.m92151b(getContext(), 1), C76577a.m92151b(getContext(), 1), C76577a.m92151b(getContext(), 1));
            }
        } else {
            storyAvatarDotsView.setVisibility(8);
        }
        SnsMethodCalculate.markEndTimeMs("initAvatarsView", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemMeasure");
    }

    /* renamed from: s */
    public void mo140379s() {
        SnsMethodCalculate.markStartTimeMs("layoutCommentView", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemMeasure");
        SnsJankActivity.C96073a aVar = SnsJankActivity.f280539s;
        aVar.mo133612a(mo87544n(), "layoutCommentView");
        StringBuilder sb = new StringBuilder();
        sb.append("layoutCommentView like size:");
        C98780b<C117882j> bVar = getStruct().f281363W;
        sb.append(bVar != null ? Integer.valueOf(bVar.mo138165b()) : null);
        sb.append(" comment size:");
        C98780b<C117882j> bVar2 = getStruct().f281364X;
        sb.append(bVar2 != null ? Integer.valueOf(bVar2.mo138165b()) : null);
        mo140441m("MicroMsg.Improve.TimelineItemMeasure", sb.toString());
        C98780b<C117882j> bVar3 = getStruct().f281363W;
        if ((bVar3 != null ? bVar3.mo138165b() : 0) <= 0) {
            C98780b<C117882j> bVar4 = getStruct().f281364X;
            if ((bVar4 != null ? bVar4.mo138165b() : 0) <= 0) {
                TimelineCommentView timelineCommentView = this.f295564U;
                if (timelineCommentView != null) {
                    if (timelineCommentView.getParent() != null) {
                        getCommentContainer().removeView(timelineCommentView);
                    }
                    C101931d.f300107a.mo141429b(timelineCommentView);
                }
                this.f295564U = null;
                aVar.mo133613b(mo87544n());
                SnsMethodCalculate.markEndTimeMs("layoutCommentView", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemMeasure");
            }
        }
        SnsMethodCalculate.markStartTimeMs("buildCommentView", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemMeasure");
        if (this.f295564U == null) {
            Context context = getContext();
            C87412m.m108593f(context, "context");
            this.f295564U = (TimelineCommentView) C101931d.f300107a.mo141428a(TimelineCommentView.class, context);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
            SnsMethodCalculate.markStartTimeMs("getSmall_Padding", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemBuild$Companion");
            SnsMethodCalculate.markStartTimeMs("access$getSmall_Padding$delegate$cp", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemBuild");
            C13601g<Integer> gVar = C100942r.f295581I;
            SnsMethodCalculate.markEndTimeMs("access$getSmall_Padding$delegate$cp", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemBuild");
            int intValue = ((Number) ((C36570n) gVar).getValue()).intValue();
            SnsMethodCalculate.markEndTimeMs("getSmall_Padding", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemBuild$Companion");
            layoutParams.setMargins(0, intValue, 0, mo140438i(4));
            getCommentContainer().addView(this.f295564U, layoutParams);
            SnsMethodCalculate.markStartTimeMs("addCommentClickListener", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemMeasure");
            SnsTimeLineBaseAdapter adapter = getAdapter();
            if (adapter == null) {
                SnsMethodCalculate.markEndTimeMs("addCommentClickListener", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemMeasure");
            } else {
                TimelineCommentView timelineCommentView2 = this.f295564U;
                if (timelineCommentView2 != null) {
                    timelineCommentView2.setCommentClickListener(new C100925j0(this));
                }
                TimelineCommentView timelineCommentView3 = this.f295564U;
                if (timelineCommentView3 != null) {
                    timelineCommentView3.setCommentLongClickListener(new C62546k0(this));
                }
                TimelineCommentView timelineCommentView4 = this.f295564U;
                if (timelineCommentView4 != null) {
                    timelineCommentView4.setSingleCommentCollapseClickListener(adapter.f278561M);
                }
                SnsMethodCalculate.markEndTimeMs("addCommentClickListener", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemMeasure");
            }
        }
        SnsMethodCalculate.markEndTimeMs("buildCommentView", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemMeasure");
        TimelineCommentView timelineCommentView5 = this.f295564U;
        if (timelineCommentView5 != null) {
            timelineCommentView5.mo133451a(getStruct(), getViewType());
        }
        aVar.mo133613b(mo87544n());
        SnsMethodCalculate.markEndTimeMs("layoutCommentView", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemMeasure");
    }

    public final void setCommentView(TimelineCommentView timelineCommentView) {
        SnsMethodCalculate.markStartTimeMs("setCommentView", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemMeasure");
        this.f295564U = timelineCommentView;
        SnsMethodCalculate.markEndTimeMs("setCommentView", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemMeasure");
    }

    public final void setContentTranslateResultText(SnsTranslateResultView snsTranslateResultView) {
        SnsMethodCalculate.markStartTimeMs("setContentTranslateResultText", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemMeasure");
        this.f295565V = snsTranslateResultView;
        SnsMethodCalculate.markEndTimeMs("setContentTranslateResultText", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemMeasure");
    }

    /* renamed from: t */
    public final void mo140404t() {
        SnsMethodCalculate.markStartTimeMs("loadContentTranslateView", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemMeasure");
        C94965w1.C94967b bVar = getStruct().f281378f0;
        if (bVar == null) {
            C101931d.f300107a.mo141429b(this.f295565V);
        } else {
            if (this.f295565V == null) {
                Context context = getContext();
                C87412m.m108593f(context, "context");
                this.f295565V = (SnsTranslateResultView) C101931d.f300107a.mo141428a(SnsTranslateResultView.class, context);
            }
            SnsTranslateResultView snsTranslateResultView = this.f295565V;
            if (snsTranslateResultView != null) {
                if (!bVar.f275306d) {
                    snsTranslateResultView.mo133015e();
                    snsTranslateResultView.mo133019j(1);
                } else if (!bVar.f275307e) {
                    snsTranslateResultView.mo133015e();
                    snsTranslateResultView.mo133013a(bVar, 1, bVar.f275304b, bVar.f275305c, bVar.f275309g);
                } else {
                    C101931d.f300107a.mo141429b(snsTranslateResultView);
                }
                if (snsTranslateResultView.getParent() == null) {
                    ViewParent parent = getContentText().getParent();
                    C87412m.m108592e(parent, "null cannot be cast to non-null type android.view.ViewGroup");
                    ((ViewGroup) parent).addView(snsTranslateResultView, getMatchWidthWrapHeightParams());
                }
            }
        }
        SnsMethodCalculate.markEndTimeMs("loadContentTranslateView", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemMeasure");
    }

    /* renamed from: v */
    public void mo140380v() {
        SnsMethodCalculate.markStartTimeMs("loadContentView", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemMeasure");
        getContentText().setVisibility(0);
        getContentText().setContentTextColor(C76577a.m92153d(getContext(), C0966R.color.a7f));
        AsyncNormalTextView contentText = getContentText();
        contentText.getClass();
        SnsMethodCalculate.markStartTimeMs("setContentTextSize", "com.tencent.mm.plugin.sns.ui.CollapsibleTextView");
        contentText.f276740f.f266765d.mo138747k(0, (float) C76577a.m92164o(getContext(), C0966R.dimen.f3911io));
        SnsMethodCalculate.markEndTimeMs("setContentTextSize", "com.tencent.mm.plugin.sns.ui.CollapsibleTextView");
        getContentText().mo132054i(getStruct().f281384k, getAdapter(), getStruct().f281385l, getStruct());
        getContentText().mo132052e();
        mo140441m("MicroMsg.Improve.TimelineItemMeasure", "loadContentView bindTagDataBindContentText");
        C99591a.f291957a.mo138968c(getContentText(), C0966R.C0970id.c2h, getStruct());
        SnsMethodCalculate.markEndTimeMs("loadContentView", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemMeasure");
    }

    /* renamed from: w */
    public final void mo140405w() {
        SnsMethodCalculate.markStartTimeMs("loadFinderPostView", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemMeasure");
        if (C102882s0.f303681a.mo142590b(getStruct().f281381h)) {
            if (getFinderPostStub().getParent() != null) {
                View inflate = getFinderPostStub().inflate();
                Context context = getContext();
                C87412m.m108593f(context, "context");
                ((TextView) inflate.findViewById(C0966R.C0970id.ncn)).setText(((C61381b) C86312j.m106911c(C61381b.class)).mo78553iZ(context));
                inflate.setOnClickListener(new C100935a(this));
            }
            getFinderPostStub().setVisibility(0);
        } else {
            getFinderPostStub().setVisibility(8);
        }
        SnsMethodCalculate.markEndTimeMs("loadFinderPostView", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemMeasure");
    }

    /* renamed from: y */
    public final void mo140406y() {
        SnsMethodCalculate.markStartTimeMs("updateCheckEnableLargeUI", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemMeasure");
        SnsMethodCalculate.markStartTimeMs("getEnableLargeUI", "com.tencent.mm.plugin.sns.ui.improve.component.old.TimelineFeedImproveConfigUIC$Companion");
        SnsMethodCalculate.markStartTimeMs("access$getEnableLargeUI$cp", "com.tencent.mm.plugin.sns.ui.improve.component.old.TimelineFeedImproveConfigUIC");
        boolean z = C102723a.f303339d;
        SnsMethodCalculate.markEndTimeMs("access$getEnableLargeUI$cp", "com.tencent.mm.plugin.sns.ui.improve.component.old.TimelineFeedImproveConfigUIC");
        SnsMethodCalculate.markEndTimeMs("getEnableLargeUI", "com.tencent.mm.plugin.sns.ui.improve.component.old.TimelineFeedImproveConfigUIC$Companion");
        int j = mo140439j(z);
        ViewGroup.LayoutParams layoutParams = getRightPanelLayout().getLayoutParams();
        layoutParams.width = j;
        getRightPanelLayout().setLayoutParams(layoutParams);
        ViewGroup contentContainer = getContentContainer();
        if (contentContainer != null) {
            ViewGroup.LayoutParams layoutParams2 = contentContainer.getLayoutParams();
            C87412m.m108593f(layoutParams2, "it.layoutParams");
            SnsMethodCalculate.markStartTimeMs("updateContentLayoutParams", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemBuild");
            SnsMethodCalculate.markStartTimeMs("updateContentLayoutParams", "com.tencent.mm.plugin.sns.ui.improve.component.old.IFeedImproveEnableLargeUI$DefaultImpls");
            layoutParams2.width = z ? -2 : -1;
            if (layoutParams2 instanceof LinearLayout.LayoutParams) {
                if (z) {
                    ((LinearLayout.LayoutParams) layoutParams2).gravity = 1;
                } else {
                    ((LinearLayout.LayoutParams) layoutParams2).gravity = 0;
                }
            }
            Log.m105924i("MicroMsg.Improve.TimelineItemBuild", "updateContentLayoutParams: enableLargeUI=" + z + ',');
            SnsMethodCalculate.markEndTimeMs("updateContentLayoutParams", "com.tencent.mm.plugin.sns.ui.improve.component.old.IFeedImproveEnableLargeUI$DefaultImpls");
            SnsMethodCalculate.markEndTimeMs("updateContentLayoutParams", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemBuild");
            contentContainer.setLayoutParams(layoutParams2);
        }
        SnsMethodCalculate.markEndTimeMs("updateCheckEnableLargeUI", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemMeasure");
    }
}
