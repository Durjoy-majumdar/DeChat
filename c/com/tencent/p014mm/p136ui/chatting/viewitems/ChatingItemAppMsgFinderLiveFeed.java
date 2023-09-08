package com.tencent.p014mm.p136ui.chatting.viewitems;

import a14.C0000n0;
import a14.C53930o0;
import a14.C53973z1;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.text.Layout;
import android.text.StaticLayout;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.CheckBox;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import bl3.C39818r;
import ck3.C39969i;
import ck3.C67391b;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.message.C68070l;
import com.tencent.p014mm.p136ui.C74783i3;
import com.tencent.p014mm.p136ui.C74933u4;
import com.tencent.p014mm.p136ui.chatting.C73774p2;
import com.tencent.p014mm.p136ui.chatting.viewitems.C74023i;
import com.tencent.p014mm.p136ui.transmit.MsgRetransmitUI;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.pluginsdk.model.app.C72695v;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72996z1;
import com.tencent.p014mm.view.NinePatchCropImageView;
import com.tencent.xweb.WCWebUpdater;
import di3.C86312j;
import eb0.C45628s0;
import eb0.C75592q0;
import eb0.C75604z3;
import er1.C7919x;
import fy3.C32226l;
import gy3.C8478d0;
import gy3.C87412m;
import gy3.C87413o;
import h81.C59774i;
import ht1.C60151b;
import ht1.C60186m4;
import ht1.C60192p2;
import ht1.C60200t1;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.regex.Pattern;
import jm2.C117361f;
import k20.C60958c;
import k20.C9556a;
import k60.C60979d;
import ke3.C88144b;
import kg3.C76577a;
import kotlin.Metadata;
import ks3.C10412u;
import ks3.C61160f;
import ks3.C61161k;
import ks3.C61165t;
import l31.C61212e;
import ls3.C10649f;
import ls3.C61397g;
import lt1.C10652c;
import lt1.C61401a;
import lt1.C61402b;
import ms3.C11091a;
import n31.C61612b;
import nj3.C76874e0;
import o40.C61926c;
import org.json.JSONObject;
import p1081gi.C98121d;
import p151er.C75651n;
import p185kq.C10383h;
import p217oq.C62120e;
import p270xi.C66281a;
import p270xi.C66282i;
import p270xi.C78839k;
import p565ir.C60603k;
import p565ir.C60606n;
import p565ir.C60613r;
import p629ny.C76979h;
import p744wt.C66191d;
import p749xh.C66261f3;
import pl1.C100810g0;
import pl1.C11978e0;
import pl1.C11990s0;
import pl1.C62368t0;
import q31.C118148a;
import rx3.C13598b0;
import rx3.C13604l;
import sx3.C90363p0;
import sx3.C90364q0;
import t91.C64208c;
import te3.C48654a21;
import te3.C51576uo2;
import te3.C51713vn0;
import te3.C64238ap2;
import te3.C64273c21;
import te3.C64279c90;
import te3.C64347eq2;
import te3.C64623p81;
import te3.C64855yf1;
import up1.C27696y;
import z04.C112551y;
import zj3.C79368l;
import zp3.C23555k;
import zp3.C23564m;

/* renamed from: com.tencent.mm.ui.chatting.viewitems.ChatingItemAppMsgFinderLiveFeed */
public final class ChatingItemAppMsgFinderLiveFeed {

    /* renamed from: a */
    public static final C57713d f165161a = new C57713d();

    /* renamed from: b */
    public static final String f165162b = "ChatingItemAppMsgFinderLiveFeed";

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b3\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\bp\u0010qJ\u0016\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\n\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u0016R$\u0010\t\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR$\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R$\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR$\u0010\u001c\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\n\u001a\u0004\b\u001d\u0010\f\"\u0004\b\u001e\u0010\u000eR$\u0010\u001f\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010\n\u001a\u0004\b \u0010\f\"\u0004\b!\u0010\u000eR$\u0010\"\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\"\u0010\n\u001a\u0004\b#\u0010\f\"\u0004\b$\u0010\u000eR$\u0010%\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b%\u0010\u0017\u001a\u0004\b&\u0010\u0019\"\u0004\b'\u0010\u001bR$\u0010(\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b(\u0010\u0011\u001a\u0004\b)\u0010\u0013\"\u0004\b*\u0010\u0015R$\u0010+\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b+\u0010\u0011\u001a\u0004\b,\u0010\u0013\"\u0004\b-\u0010\u0015R$\u0010.\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b.\u0010\u0011\u001a\u0004\b/\u0010\u0013\"\u0004\b0\u0010\u0015R$\u00101\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b1\u0010\n\u001a\u0004\b2\u0010\f\"\u0004\b3\u0010\u000eR$\u00104\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b4\u0010\n\u001a\u0004\b5\u0010\f\"\u0004\b6\u0010\u000eR$\u00107\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b7\u0010\u0017\u001a\u0004\b8\u0010\u0019\"\u0004\b9\u0010\u001bR$\u0010:\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b:\u0010\u0017\u001a\u0004\b;\u0010\u0019\"\u0004\b<\u0010\u001bR$\u0010=\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b=\u0010\n\u001a\u0004\b>\u0010\f\"\u0004\b?\u0010\u000eR$\u0010@\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b@\u0010\u0011\u001a\u0004\bA\u0010\u0013\"\u0004\bB\u0010\u0015R\"\u0010D\u001a\u00020C8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bD\u0010E\u001a\u0004\bF\u0010G\"\u0004\bH\u0010IR$\u0010J\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bJ\u0010\u0017\u001a\u0004\bK\u0010\u0019\"\u0004\bL\u0010\u001bR$\u0010M\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bM\u0010\u0017\u001a\u0004\bN\u0010\u0019\"\u0004\bO\u0010\u001bR$\u0010P\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bP\u0010\u0017\u001a\u0004\bQ\u0010\u0019\"\u0004\bR\u0010\u001bR\"\u0010T\u001a\u00020S8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bT\u0010U\u001a\u0004\bV\u0010W\"\u0004\bX\u0010YR0\u0010\\\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020[\u0018\u00010Z8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\\\u0010]\u001a\u0004\b^\u0010_\"\u0004\b`\u0010aR$\u0010c\u001a\u0004\u0018\u00010b8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bc\u0010d\u001a\u0004\be\u0010f\"\u0004\bg\u0010hR$\u0010j\u001a\u0004\u0018\u00010i8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bj\u0010k\u001a\u0004\bl\u0010m\"\u0004\bn\u0010o¨\u0006r"}, mo182094d2 = {"Lcom/tencent/mm/ui/chatting/viewitems/ChatingItemAppMsgFinderLiveFeed$AppMsgFinderLiveFeedHolder;", "Lcom/tencent/mm/ui/chatting/viewitems/i$c;", "Landroid/view/View;", "view", "", "isSend", "createAppMsgFinderFeedHolder", "getMainContainerView", "Landroid/widget/ImageView;", "finderAvatar", "Landroid/widget/ImageView;", "getFinderAvatar", "()Landroid/widget/ImageView;", "setFinderAvatar", "(Landroid/widget/ImageView;)V", "Landroid/widget/TextView;", "finderNickname", "Landroid/widget/TextView;", "getFinderNickname", "()Landroid/widget/TextView;", "setFinderNickname", "(Landroid/widget/TextView;)V", "iconGroupContainer", "Landroid/view/View;", "getIconGroupContainer", "()Landroid/view/View;", "setIconGroupContainer", "(Landroid/view/View;)V", "finderAuthIcon", "getFinderAuthIcon", "setFinderAuthIcon", "finderTailTag", "getFinderTailTag", "setFinderTailTag", "finderThumb", "getFinderThumb", "setFinderThumb", "finderThumbSpace", "getFinderThumbSpace", "setFinderThumbSpace", "finderBansTv", "getFinderBansTv", "setFinderBansTv", "finderDesc", "getFinderDesc", "setFinderDesc", "finderText", "getFinderText", "setFinderText", "finderIcon", "getFinderIcon", "setFinderIcon", "tickIV", "getTickIV", "setTickIV", "liveTag", "getLiveTag", "setLiveTag", "liveEndTag", "getLiveEndTag", "setLiveEndTag", "activityInfoIcon", "getActivityInfoIcon", "setActivityInfoIcon", "reasonTv", "getReasonTv", "setReasonTv", "", "width", "I", "getWidth", "()I", "setWidth", "(I)V", "detailLayout", "getDetailLayout", "setDetailLayout", "feedDetailLayout", "getFeedDetailLayout", "setFeedDetailLayout", "finderOlympicView", "getFinderOlympicView", "setFinderOlympicView", "", "liveId", "J", "getLiveId", "()J", "setLiveId", "(J)V", "Lkotlin/Function1;", "Lrx3/b0;", "onViewExposedListener", "Lfy3/l;", "getOnViewExposedListener", "()Lfy3/l;", "setOnViewExposedListener", "(Lfy3/l;)V", "Landroid/widget/LinearLayout;", "bottomMask", "Landroid/widget/LinearLayout;", "getBottomMask", "()Landroid/widget/LinearLayout;", "setBottomMask", "(Landroid/widget/LinearLayout;)V", "", "talkerUserName", "Ljava/lang/String;", "getTalkerUserName", "()Ljava/lang/String;", "setTalkerUserName", "(Ljava/lang/String;)V", "<init>", "()V", "app_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    /* renamed from: com.tencent.mm.ui.chatting.viewitems.ChatingItemAppMsgFinderLiveFeed$AppMsgFinderLiveFeedHolder */
    public static final class AppMsgFinderLiveFeedHolder extends C74023i.C74026c {
        public static final int $stable = 8;
        private ImageView activityInfoIcon;
        private LinearLayout bottomMask;
        private View detailLayout;
        private View feedDetailLayout;
        private ImageView finderAuthIcon;
        private ImageView finderAvatar;
        private TextView finderBansTv;
        private TextView finderDesc;
        private ImageView finderIcon;
        private TextView finderNickname;
        private View finderOlympicView;
        private ImageView finderTailTag;
        private TextView finderText;
        private ImageView finderThumb;
        private View finderThumbSpace;
        private View iconGroupContainer;
        private View liveEndTag;
        private long liveId;
        private View liveTag;
        private C32226l<? super Boolean, C13598b0> onViewExposedListener;
        private TextView reasonTv;
        private String talkerUserName;
        private ImageView tickIV;
        private int width;

        public final AppMsgFinderLiveFeedHolder createAppMsgFinderFeedHolder(View view, boolean z) {
            Class cls = C75651n.class;
            C87412m.m108594g(view, "view");
            super.create(view);
            LinearLayout linearLayout = (LinearLayout) view.findViewById(C0966R.C0970id.b47);
            Context context = view.getContext();
            C74783i3.C6978a a = C74783i3.m89537a(context);
            int min = Math.min(a.f24704a, a.f24705b);
            boolean z2 = false;
            boolean z3 = ((C75651n) C86312j.m106911c(cls)).ld0() == 1;
            if (((C75651n) C86312j.m106911c(cls)).mo55944dw() == 1) {
                z2 = true;
            }
            float dimension = context.getResources().getDimension(z3 ? C0966R.dimen.f3743cv : C0966R.dimen.f3723cd);
            this.width = z2 ? C76577a.m92151b(view.getContext(), 169) : (int) ((((float) min) - dimension) / ((float) 2));
            ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
            C87412m.m108592e(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
            layoutParams2.width = this.width;
            linearLayout.setLayoutParams(layoutParams2);
            ChatingItemAppMsgFinderLiveFeed.f165161a.getClass();
            String str = ChatingItemAppMsgFinderLiveFeed.f165162b;
            Log.m105924i(str, "real widthPixels:" + min + " ,dp:" + dimension + " , width:" + this.width);
            this.finderAvatar = (ImageView) view.findViewById(C0966R.C0970id.b6_);
            this.finderNickname = (TextView) view.findViewById(C0966R.C0970id.b6g);
            this.iconGroupContainer = view.findViewById(C0966R.C0970id.o5j);
            this.finderAuthIcon = (ImageView) view.findViewById(C0966R.C0970id.b69);
            this.finderTailTag = (ImageView) view.findViewById(C0966R.C0970id.o5k);
            this.finderThumb = (ImageView) view.findViewById(C0966R.C0970id.b6k);
            this.finderThumbSpace = view.findViewById(C0966R.C0970id.jhr);
            this.finderBansTv = (TextView) view.findViewById(C0966R.C0970id.mo9);
            this.finderDesc = (TextView) view.findViewById(C0966R.C0970id.ln4);
            this.finderText = (TextView) view.findViewById(C0966R.C0970id.b6j);
            this.finderIcon = (ImageView) view.findViewById(C0966R.C0970id.b6c);
            this.finderOlympicView = view.findViewById(C0966R.C0970id.m1c);
            this.liveEndTag = view.findViewById(C0966R.C0970id.dke);
            this.activityInfoIcon = (ImageView) view.findViewById(C0966R.C0970id.f358478fd2);
            this.reasonTv = (TextView) view.findViewById(C0966R.C0970id.kxv);
            this.bottomMask = (LinearLayout) view.findViewById(C0966R.C0970id.b6a);
            View findViewById = view.findViewById(C0966R.C0970id.b9_);
            TextView textView = findViewById instanceof TextView ? (TextView) findViewById : null;
            if (textView != null) {
                this.userTV = textView;
            }
            this.detailLayout = view.findViewById(C0966R.C0970id.b3p);
            this.feedDetailLayout = view.findViewById(C0966R.C0970id.jhz);
            this.liveTag = view.findViewById(C0966R.C0970id.dnt);
            if (!(!((C60200t1) C86312j.m106911c(C60200t1.class)).mo76873sF())) {
                this.checkBox = (CheckBox) view.findViewById(C0966R.C0970id.b46);
                this.maskView = view.findViewById(C0966R.C0970id.b7h);
            }
            ProgressBar progressBar = (ProgressBar) view.findViewById(C0966R.C0970id.f359466l14);
            this.uploadingPB = progressBar;
            if (z) {
                this.tickIV = (ImageView) view.findViewById(C0966R.C0970id.b8x);
                ImageView imageView = this.finderThumb;
                if (imageView instanceof NinePatchCropImageView) {
                    C87412m.m108592e(imageView, "null cannot be cast to non-null type com.tencent.mm.view.NinePatchCropImageView");
                    ((NinePatchCropImageView) imageView).setNinePatchId(C0966R.C0969drawable.byy);
                }
            } else {
                if (progressBar != null) {
                    progressBar.setVisibility(8);
                }
                ImageView imageView2 = this.finderThumb;
                if (imageView2 instanceof NinePatchCropImageView) {
                    C87412m.m108592e(imageView2, "null cannot be cast to non-null type com.tencent.mm.view.NinePatchCropImageView");
                    ((NinePatchCropImageView) imageView2).setNinePatchId(C0966R.C0969drawable.bym);
                }
            }
            ImageView imageView3 = this.finderIcon;
            if (imageView3 != null) {
                imageView3.setImageDrawable(C74933u4.m89768e(imageView3.getContext(), z3 ? C0966R.raw.icons_filled_channel : C0966R.raw.icons_outlined_finder_icon, C76577a.m92153d(imageView3.getContext(), C0966R.color.f2960ag)));
            }
            return this;
        }

        public final ImageView getActivityInfoIcon() {
            return this.activityInfoIcon;
        }

        public final LinearLayout getBottomMask() {
            return this.bottomMask;
        }

        public final View getDetailLayout() {
            return this.detailLayout;
        }

        public final View getFeedDetailLayout() {
            return this.feedDetailLayout;
        }

        public final ImageView getFinderAuthIcon() {
            return this.finderAuthIcon;
        }

        public final ImageView getFinderAvatar() {
            return this.finderAvatar;
        }

        public final TextView getFinderBansTv() {
            return this.finderBansTv;
        }

        public final TextView getFinderDesc() {
            return this.finderDesc;
        }

        public final ImageView getFinderIcon() {
            return this.finderIcon;
        }

        public final TextView getFinderNickname() {
            return this.finderNickname;
        }

        public final View getFinderOlympicView() {
            return this.finderOlympicView;
        }

        public final ImageView getFinderTailTag() {
            return this.finderTailTag;
        }

        public final TextView getFinderText() {
            return this.finderText;
        }

        public final ImageView getFinderThumb() {
            return this.finderThumb;
        }

        public final View getFinderThumbSpace() {
            return this.finderThumbSpace;
        }

        public final View getIconGroupContainer() {
            return this.iconGroupContainer;
        }

        public final View getLiveEndTag() {
            return this.liveEndTag;
        }

        public final long getLiveId() {
            return this.liveId;
        }

        public final View getLiveTag() {
            return this.liveTag;
        }

        public View getMainContainerView() {
            return this.detailLayout;
        }

        public final C32226l<Boolean, C13598b0> getOnViewExposedListener() {
            return this.onViewExposedListener;
        }

        public final TextView getReasonTv() {
            return this.reasonTv;
        }

        public final String getTalkerUserName() {
            return this.talkerUserName;
        }

        public final ImageView getTickIV() {
            return this.tickIV;
        }

        public final int getWidth() {
            return this.width;
        }

        public final void setActivityInfoIcon(ImageView imageView) {
            this.activityInfoIcon = imageView;
        }

        public final void setBottomMask(LinearLayout linearLayout) {
            this.bottomMask = linearLayout;
        }

        public final void setDetailLayout(View view) {
            this.detailLayout = view;
        }

        public final void setFeedDetailLayout(View view) {
            this.feedDetailLayout = view;
        }

        public final void setFinderAuthIcon(ImageView imageView) {
            this.finderAuthIcon = imageView;
        }

        public final void setFinderAvatar(ImageView imageView) {
            this.finderAvatar = imageView;
        }

        public final void setFinderBansTv(TextView textView) {
            this.finderBansTv = textView;
        }

        public final void setFinderDesc(TextView textView) {
            this.finderDesc = textView;
        }

        public final void setFinderIcon(ImageView imageView) {
            this.finderIcon = imageView;
        }

        public final void setFinderNickname(TextView textView) {
            this.finderNickname = textView;
        }

        public final void setFinderOlympicView(View view) {
            this.finderOlympicView = view;
        }

        public final void setFinderTailTag(ImageView imageView) {
            this.finderTailTag = imageView;
        }

        public final void setFinderText(TextView textView) {
            this.finderText = textView;
        }

        public final void setFinderThumb(ImageView imageView) {
            this.finderThumb = imageView;
        }

        public final void setFinderThumbSpace(View view) {
            this.finderThumbSpace = view;
        }

        public final void setIconGroupContainer(View view) {
            this.iconGroupContainer = view;
        }

        public final void setLiveEndTag(View view) {
            this.liveEndTag = view;
        }

        public final void setLiveId(long j) {
            this.liveId = j;
        }

        public final void setLiveTag(View view) {
            this.liveTag = view;
        }

        public final void setOnViewExposedListener(C32226l<? super Boolean, C13598b0> lVar) {
            this.onViewExposedListener = lVar;
        }

        public final void setReasonTv(TextView textView) {
            this.reasonTv = textView;
        }

        public final void setTalkerUserName(String str) {
            this.talkerUserName = str;
        }

        public final void setTickIV(ImageView imageView) {
            this.tickIV = imageView;
        }

        public final void setWidth(int i) {
            this.width = i;
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.viewitems.ChatingItemAppMsgFinderLiveFeed$a */
    public static abstract class C57706a extends C74023i implements C73774p2 {

        /* renamed from: A */
        public View f165163A;

        /* renamed from: B */
        public long f165164B;

        /* renamed from: C */
        public final C78839k f165165C = new C57707a(this);

        /* renamed from: v */
        public C0000n0 f165166v = C53930o0.m60555b();

        /* renamed from: w */
        public C53973z1 f165167w;

        /* renamed from: x */
        public final int f165168x = MMApplicationContext.getContext().getResources().getDimensionPixelOffset(C0966R.dimen.f3736cp);

        /* renamed from: y */
        public final int f165169y = (MMApplicationContext.getContext().getResources().getDimensionPixelOffset(C0966R.dimen.f3723cd) * -1);

        /* renamed from: z */
        public C67391b f165170z;

        /* renamed from: com.tencent.mm.ui.chatting.viewitems.ChatingItemAppMsgFinderLiveFeed$a$a */
        public static final class C57707a extends C66281a {

            /* renamed from: d */
            public final /* synthetic */ C57706a f165171d;

            public C57707a(C57706a aVar) {
                this.f165171d = aVar;
            }

            /* JADX WARNING: type inference failed for: r0v8, types: [android.view.View] */
            /* JADX WARNING: Multi-variable type inference failed */
            /* JADX WARNING: Unknown variable types count: 1 */
            /* renamed from: n2 */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void mo26199n2() {
                /*
                    r9 = this;
                    java.lang.Class<ht1.p2> r0 = ht1.C60192p2.class
                    com.tencent.mm.ui.chatting.viewitems.ChatingItemAppMsgFinderLiveFeed$a r1 = r9.f165171d
                    android.view.View r1 = r1.f165163A
                    r2 = 0
                    if (r1 == 0) goto L_0x0010
                    java.lang.String r3 = "fluent_view_tag"
                    android.view.View r1 = r1.findViewWithTag(r3)
                    goto L_0x0011
                L_0x0010:
                    r1 = r2
                L_0x0011:
                    if (r1 == 0) goto L_0x006b
                    com.tencent.mm.ui.chatting.viewitems.ChatingItemAppMsgFinderLiveFeed$a r3 = r9.f165171d
                    com.tencent.mm.ui.chatting.viewitems.ChatingItemAppMsgFinderLiveFeed$d r4 = com.tencent.p014mm.p136ui.chatting.viewitems.ChatingItemAppMsgFinderLiveFeed.f165161a
                    r4.getClass()
                    java.lang.String r4 = com.tencent.p014mm.p136ui.chatting.viewitems.ChatingItemAppMsgFinderLiveFeed.f165162b
                    java.lang.StringBuilder r5 = new java.lang.StringBuilder
                    r5.<init>()
                    java.lang.String r6 = "onChattingExitAnimEnd detach fluent view "
                    r5.append(r6)
                    r5.append(r1)
                    java.lang.String r6 = " feedId: "
                    r5.append(r6)
                    long r6 = r3.f165164B
                    r5.append(r6)
                    java.lang.String r5 = r5.toString()
                    com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r5)
                    long r4 = r3.f165164B
                    r6 = 0
                    int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                    if (r8 != 0) goto L_0x0051
                    android.view.View r0 = r3.f165163A
                    boolean r3 = r0 instanceof android.view.ViewGroup
                    if (r3 == 0) goto L_0x004b
                    r2 = r0
                    android.view.ViewGroup r2 = (android.view.ViewGroup) r2
                L_0x004b:
                    if (r2 == 0) goto L_0x006b
                    r2.removeView(r1)
                    goto L_0x006b
                L_0x0051:
                    di3.d r1 = di3.C86312j.m106911c(r0)
                    ht1.p2 r1 = (ht1.C60192p2) r1
                    long r2 = r3.f165164B
                    lt1.b r1 = r1.mo85197zC(r2)
                    if (r1 == 0) goto L_0x0062
                    r1.mo84322g()
                L_0x0062:
                    di3.d r0 = di3.C86312j.m106911c(r0)
                    ht1.p2 r0 = (ht1.C60192p2) r0
                    r0.mo85192OA()
                L_0x006b:
                    com.tencent.mm.ui.chatting.viewitems.ChatingItemAppMsgFinderLiveFeed$a r0 = r9.f165171d
                    ck3.b r0 = r0.f165170z
                    if (r0 == 0) goto L_0x0080
                    java.lang.Class<xi.i> r1 = p270xi.C66282i.class
                    com.tencent.mm.ui.chatting.manager.a r0 = r0.f193278b
                    xi.d r0 = r0.mo102812a(r1)
                    xi.i r0 = (p270xi.C66282i) r0
                    if (r0 == 0) goto L_0x0080
                    r0.mo90406z0(r9)
                L_0x0080:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.chatting.viewitems.ChatingItemAppMsgFinderLiveFeed.C57706a.C57707a.mo26199n2():void");
            }
        }

        /* renamed from: com.tencent.mm.ui.chatting.viewitems.ChatingItemAppMsgFinderLiveFeed$a$b */
        public static final class C57708b extends C87413o implements C32226l<Boolean, C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ C57706a f165172d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C57708b(C57706a aVar) {
                super(1);
                this.f165172d = aVar;
            }

            public Object invoke(Object obj) {
                if (!((Boolean) obj).booleanValue()) {
                    Log.m105924i("BaseChattingItemAppMsgFinderLiveFeed", "onViewExposedListener false, cancel it");
                    C53973z1 z1Var = this.f165172d.f165167w;
                    if (z1Var != null) {
                        C53973z1.C53974a.m60623a(z1Var, (CancellationException) null, 1, (Object) null);
                    }
                }
                return C13598b0.f38549a;
            }
        }

        /* renamed from: o0 */
        public static final void m66443o0(C57706a aVar, AppMsgFinderLiveFeedHolder appMsgFinderLiveFeedHolder) {
            ImageView finderTailTag = appMsgFinderLiveFeedHolder.getFinderTailTag();
            if (finderTailTag != null) {
                finderTailTag.setVisibility(8);
            }
            TextView finderNickname = appMsgFinderLiveFeedHolder.getFinderNickname();
            ViewGroup.MarginLayoutParams marginLayoutParams = null;
            ViewGroup.LayoutParams layoutParams = finderNickname != null ? finderNickname.getLayoutParams() : null;
            ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
            if (marginLayoutParams2 != null) {
                marginLayoutParams2.setMarginEnd(aVar.f165168x);
            }
            View iconGroupContainer = appMsgFinderLiveFeedHolder.getIconGroupContainer();
            ViewGroup.LayoutParams layoutParams2 = iconGroupContainer != null ? iconGroupContainer.getLayoutParams() : null;
            if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2;
            }
            if (marginLayoutParams != null) {
                marginLayoutParams.setMarginStart(aVar.f165169y);
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:118:0x027d  */
        /* JADX WARNING: Removed duplicated region for block: B:119:0x0280  */
        /* JADX WARNING: Removed duplicated region for block: B:124:0x028f  */
        /* JADX WARNING: Removed duplicated region for block: B:125:0x0292  */
        /* JADX WARNING: Removed duplicated region for block: B:128:0x02a1  */
        /* JADX WARNING: Removed duplicated region for block: B:129:0x02a6  */
        /* JADX WARNING: Removed duplicated region for block: B:132:0x02b5  */
        /* JADX WARNING: Removed duplicated region for block: B:133:0x02ba  */
        /* JADX WARNING: Removed duplicated region for block: B:136:0x02bf  */
        /* JADX WARNING: Removed duplicated region for block: B:137:0x02c2  */
        /* JADX WARNING: Removed duplicated region for block: B:139:0x02c5  */
        /* JADX WARNING: Removed duplicated region for block: B:140:0x02ce  */
        /* JADX WARNING: Removed duplicated region for block: B:143:0x02dd  */
        /* JADX WARNING: Removed duplicated region for block: B:144:0x02e2  */
        /* JADX WARNING: Removed duplicated region for block: B:147:0x02e7  */
        /* JADX WARNING: Removed duplicated region for block: B:148:0x02ea  */
        /* JADX WARNING: Removed duplicated region for block: B:150:0x02ed  */
        /* renamed from: f */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo26237f(com.tencent.p014mm.p136ui.chatting.viewitems.C74023i.C74026c r24, ck3.C67391b r25, com.tencent.p014mm.storage.C72963f4 r26, java.lang.String r27) {
            /*
                r23 = this;
                r0 = r23
                r1 = r24
                r2 = r25
                java.lang.Class<ir.n> r8 = p565ir.C60606n.class
                java.lang.String r3 = "holder"
                gy3.C87412m.m108594g(r1, r3)
                java.lang.String r3 = "chattingContext"
                gy3.C87412m.m108594g(r2, r3)
                java.lang.String r3 = "msg"
                r4 = r26
                gy3.C87412m.m108594g(r4, r3)
                java.lang.String r3 = "userName"
                r5 = r27
                gy3.C87412m.m108594g(r5, r3)
                java.lang.String r3 = "BaseChattingItemAppMsgFinderLiveFeed"
                java.lang.String r5 = "filling"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r5)
                r0.f165170z = r2
                a14.z1 r5 = r0.f165167w
                r9 = 0
                r10 = 1
                if (r5 == 0) goto L_0x0033
                a14.C53973z1.C53974a.m60623a(r5, r9, r10, r9)
            L_0x0033:
                java.lang.Class<xi.i> r5 = p270xi.C66282i.class
                com.tencent.mm.ui.chatting.manager.a r6 = r2.f193278b
                xi.d r5 = r6.mo102812a(r5)
                xi.i r5 = (p270xi.C66282i) r5
                xi.k r6 = r0.f165165C
                r5.mo90406z0(r6)
                boolean r5 = r1 instanceof com.tencent.p014mm.p136ui.chatting.viewitems.ChatingItemAppMsgFinderLiveFeed.AppMsgFinderLiveFeedHolder
                if (r5 != 0) goto L_0x004c
                java.lang.String r1 = "filling not AppMsgFinderLiveFeedHolder return"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r1)
                return
            L_0x004c:
                r11 = r1
                com.tencent.mm.ui.chatting.viewitems.ChatingItemAppMsgFinderLiveFeed$AppMsgFinderLiveFeedHolder r11 = (com.tencent.p014mm.p136ui.chatting.viewitems.ChatingItemAppMsgFinderLiveFeed.AppMsgFinderLiveFeedHolder) r11
                com.tencent.mm.ui.chatting.viewitems.ChatingItemAppMsgFinderLiveFeed$a$b r1 = new com.tencent.mm.ui.chatting.viewitems.ChatingItemAppMsgFinderLiveFeed$a$b
                r1.<init>(r0)
                r11.setOnViewExposedListener(r1)
                java.lang.String r1 = r26.getContent()
                if (r1 == 0) goto L_0x0066
                java.lang.String r4 = r26.mo108775z2()
                com.tencent.mm.message.l$b r1 = com.tencent.p014mm.message.C68070l.C68072b.m80422u(r1, r4)
                goto L_0x0067
            L_0x0066:
                r1 = r9
            L_0x0067:
                if (r1 == 0) goto L_0x0073
                java.lang.Class<ht1.b> r4 = ht1.C60151b.class
                com.tencent.mm.message.g r1 = r1.mo93555w(r4)
                ht1.b r1 = (ht1.C60151b) r1
                r12 = r1
                goto L_0x0074
            L_0x0073:
                r12 = r9
            L_0x0074:
                java.lang.Class<er.n> r1 = p151er.C75651n.class
                di3.d r1 = di3.C86312j.m106911c(r1)
                er.n r1 = (p151er.C75651n) r1
                int r1 = r1.ld0()
                r13 = 0
                if (r1 != r10) goto L_0x0085
                r14 = 1
                goto L_0x0086
            L_0x0085:
                r14 = 0
            L_0x0086:
                android.view.View r1 = r11.getFeedDetailLayout()
                if (r1 != 0) goto L_0x008d
                goto L_0x00e4
            L_0x008d:
                if (r14 == 0) goto L_0x0092
                r4 = 8
                goto L_0x00a4
            L_0x0092:
                android.widget.TextView r4 = r11.getFinderNickname()
                gy3.C87412m.m108591d(r4)
                android.text.TextPaint r4 = r4.getPaint()
                r5 = 1061997773(0x3f4ccccd, float:0.8)
                com.tencent.p014mm.p136ui.C85875k4.m106189j0(r4, r5)
                r4 = 0
            L_0x00a4:
                k20.a r5 = new k20.a
                r5.<init>()
                java.lang.ThreadLocal<k20.a> r6 = k20.C60958c.f173611a
                java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
                r5.mo10233c(r4)
                java.lang.Object[] r16 = r5.mo10232b()
                java.lang.String r17 = "com/tencent/mm/ui/chatting/viewitems/ChatingItemAppMsgFinderLiveFeed$BaseChattingItemAppMsgFinderLiveFeed"
                java.lang.String r18 = "filling"
                java.lang.String r19 = "(Lcom/tencent/mm/ui/chatting/viewitems/ChattingItem$BaseViewHolder;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/storage/MsgInfo;Ljava/lang/String;)V"
                java.lang.String r20 = "android/view/View_EXEC_"
                java.lang.String r21 = "setVisibility"
                java.lang.String r22 = "(I)V"
                r15 = r1
                j20.C117292a.m165358d(r15, r16, r17, r18, r19, r20, r21, r22)
                java.lang.Object r4 = r5.mo10231a(r13)
                java.lang.Integer r4 = (java.lang.Integer) r4
                int r4 = r4.intValue()
                r1.setVisibility(r4)
                java.lang.String r16 = "com/tencent/mm/ui/chatting/viewitems/ChatingItemAppMsgFinderLiveFeed$BaseChattingItemAppMsgFinderLiveFeed"
                java.lang.String r17 = "filling"
                java.lang.String r18 = "(Lcom/tencent/mm/ui/chatting/viewitems/ChattingItem$BaseViewHolder;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/storage/MsgInfo;Ljava/lang/String;)V"
                java.lang.String r19 = "android/view/View_EXEC_"
                java.lang.String r20 = "setVisibility"
                java.lang.String r21 = "(I)V"
                j20.C117292a.m165359e(r15, r16, r17, r18, r19, r20, r21)
            L_0x00e4:
                di3.d r1 = di3.C86312j.m106911c(r8)
                ir.n r1 = (p565ir.C60606n) r1
                boolean r1 = r1.J10()
                if (r1 != 0) goto L_0x00f1
                goto L_0x014c
            L_0x00f1:
                boolean r1 = r2.f193283g
                if (r1 != 0) goto L_0x00f6
                goto L_0x014c
            L_0x00f6:
                if (r12 == 0) goto L_0x0147
                te3.p81 r1 = r12.f171698b
                int r4 = r1.f184791t
                if (r4 == r10) goto L_0x00ff
                goto L_0x0147
            L_0x00ff:
                java.lang.String r1 = r1.f184780f
                long r4 = o40.C61926c.m72671P(r1)
                java.lang.String r1 = o40.C61926c.m72691p(r4)
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                java.lang.String r7 = "filling feedId="
                r6.append(r7)
                r6.append(r1)
                java.lang.String r1 = r6.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r1)
                r6 = 0
                int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                if (r1 != 0) goto L_0x0124
                goto L_0x014c
            L_0x0124:
                android.widget.ImageView r6 = r11.getActivityInfoIcon()
                if (r6 == 0) goto L_0x014c
                a14.n0 r15 = r0.f165166v
                r16 = 0
                r17 = 0
                com.tencent.mm.ui.chatting.viewitems.f r18 = new com.tencent.mm.ui.chatting.viewitems.f
                r7 = 0
                r1 = r18
                r2 = r25
                r3 = r4
                r5 = r12
                r1.<init>(r2, r3, r5, r6, r7)
                r19 = 3
                r20 = 0
                a14.z1 r1 = a14.C53895h.m60466d(r15, r16, r17, r18, r19, r20)
                r0.f165167w = r1
                goto L_0x014c
            L_0x0147:
                java.lang.String r1 = "filling not living return"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r1)
            L_0x014c:
                di3.d r1 = di3.C86312j.m106911c(r8)
                ir.n r1 = (p565ir.C60606n) r1
                android.widget.TextView r2 = r11.getFinderNickname()
                android.widget.ImageView r3 = r11.getFinderAuthIcon()
                if (r14 == 0) goto L_0x015e
                r4 = 0
                goto L_0x0160
            L_0x015e:
                r4 = 1101004800(0x41a00000, float:20.0)
            L_0x0160:
                r1.mo85037Tb(r2, r3, r12, r4)
                java.lang.Class<pl1.s0> r1 = pl1.C11990s0.class
                java.lang.Class<ht1.t1> r2 = ht1.C60200t1.class
                if (r12 == 0) goto L_0x0170
                te3.p81 r3 = r12.f171698b
                if (r3 == 0) goto L_0x0170
                java.lang.String r3 = r3.f184777V
                goto L_0x0171
            L_0x0170:
                r3 = r9
            L_0x0171:
                if (r3 == 0) goto L_0x017c
                int r3 = r3.length()
                if (r3 != 0) goto L_0x017a
                goto L_0x017c
            L_0x017a:
                r3 = 0
                goto L_0x017d
            L_0x017c:
                r3 = 1
            L_0x017d:
                if (r3 != 0) goto L_0x0262
                if (r12 == 0) goto L_0x0193
                te3.p81 r3 = r12.f171698b
                if (r3 == 0) goto L_0x0193
                java.lang.String r3 = r3.f184777V
                if (r3 == 0) goto L_0x0193
                java.lang.String r4 = "null"
                boolean r3 = z04.C112550d0.m153801u(r3, r4, r13)
                if (r3 != r10) goto L_0x0193
                r3 = 1
                goto L_0x0194
            L_0x0193:
                r3 = 0
            L_0x0194:
                if (r3 != 0) goto L_0x0262
                if (r12 == 0) goto L_0x01a9
                te3.p81 r3 = r12.f171698b
                if (r3 == 0) goto L_0x01a9
                java.lang.String r3 = r3.f184777V
                if (r3 == 0) goto L_0x01a9
                java.lang.String r4 = "NULL"
                boolean r3 = z04.C112550d0.m153801u(r3, r4, r13)
                if (r3 != r10) goto L_0x01a9
                goto L_0x01aa
            L_0x01a9:
                r10 = 0
            L_0x01aa:
                if (r10 == 0) goto L_0x01ae
                goto L_0x0262
            L_0x01ae:
                android.widget.ImageView r3 = r11.getFinderTailTag()
                android.widget.ImageView r4 = r11.getFinderTailTag()
                if (r4 == 0) goto L_0x01bd
                android.view.ViewGroup$LayoutParams r4 = r4.getLayoutParams()
                goto L_0x01be
            L_0x01bd:
                r4 = r9
            L_0x01be:
                boolean r5 = r4 instanceof android.view.ViewGroup.MarginLayoutParams
                if (r5 == 0) goto L_0x01c5
                android.view.ViewGroup$MarginLayoutParams r4 = (android.view.ViewGroup.MarginLayoutParams) r4
                goto L_0x01c6
            L_0x01c5:
                r4 = r9
            L_0x01c6:
                if (r3 == 0) goto L_0x025b
                if (r4 == 0) goto L_0x025b
                bl3.r r5 = bl3.C39818r.f106831a
                bl3.r$a r6 = r5.mo62446e(r2)
                bl3.c r6 = r6.mo62447c(r1)
                pl1.s0 r6 = (pl1.C11990s0) r6
                k60.d r6 = r6.mo11868R0()
                java.lang.Class<pl1.t0> r7 = pl1.C62368t0.class
                di3.d r7 = di3.C86312j.m106911c(r7)
                pl1.t0 r7 = (pl1.C62368t0) r7
                if (r12 == 0) goto L_0x01ec
                te3.p81 r8 = r12.f171698b
                if (r8 == 0) goto L_0x01ec
                java.lang.String r8 = r8.f184777V
                if (r8 != 0) goto L_0x01ee
            L_0x01ec:
                java.lang.String r8 = ""
            L_0x01ee:
                up1.y r10 = up1.C27696y.THUMB_IMAGE
                pl1.g0 r7 = r7.mo87412UE(r8, r10)
                pl1.e0$a r8 = pl1.C11978e0.C11979a.DEFAULT
                bl3.r$a r2 = r5.mo62446e(r2)
                bl3.c r1 = r2.mo62447c(r1)
                pl1.s0 r1 = (pl1.C11990s0) r1
                n60.f r1 = r1.mo11867O2(r8)
                l60.b r1 = r6.mo85956b(r7, r1)
                l60.a r1 = (l60.C99342a) r1
                r1.mo85954d(r3)
                r3.setVisibility(r13)
                int r1 = r4.getMarginStart()
                int r2 = r4.getMarginEnd()
                int r1 = r1 + r2
                int r2 = r4.width
                int r1 = r1 + r2
                android.widget.TextView r2 = r11.getFinderNickname()
                if (r2 == 0) goto L_0x0227
                android.view.ViewGroup$LayoutParams r2 = r2.getLayoutParams()
                goto L_0x0228
            L_0x0227:
                r2 = r9
            L_0x0228:
                boolean r3 = r2 instanceof android.view.ViewGroup.MarginLayoutParams
                if (r3 == 0) goto L_0x022f
                android.view.ViewGroup$MarginLayoutParams r2 = (android.view.ViewGroup.MarginLayoutParams) r2
                goto L_0x0230
            L_0x022f:
                r2 = r9
            L_0x0230:
                if (r2 != 0) goto L_0x0233
                goto L_0x0239
            L_0x0233:
                int r3 = r0.f165168x
                int r3 = r3 + r1
                r2.setMarginEnd(r3)
            L_0x0239:
                android.view.View r2 = r11.getIconGroupContainer()
                if (r2 == 0) goto L_0x0244
                android.view.ViewGroup$LayoutParams r2 = r2.getLayoutParams()
                goto L_0x0245
            L_0x0244:
                r2 = r9
            L_0x0245:
                boolean r3 = r2 instanceof android.view.ViewGroup.MarginLayoutParams
                if (r3 == 0) goto L_0x024c
                android.view.ViewGroup$MarginLayoutParams r2 = (android.view.ViewGroup.MarginLayoutParams) r2
                goto L_0x024d
            L_0x024c:
                r2 = r9
            L_0x024d:
                if (r2 != 0) goto L_0x0250
                goto L_0x0258
            L_0x0250:
                int r3 = r0.f165169y
                int r1 = r1 * -1
                int r3 = r3 + r1
                r2.setMarginStart(r3)
            L_0x0258:
                rx3.b0 r1 = rx3.C13598b0.f38549a
                goto L_0x025c
            L_0x025b:
                r1 = r9
            L_0x025c:
                if (r1 != 0) goto L_0x0265
                m66443o0(r0, r11)
                goto L_0x0265
            L_0x0262:
                m66443o0(r0, r11)
            L_0x0265:
                com.tencent.mm.ui.chatting.viewitems.ChatingItemAppMsgFinderLiveFeed$d r1 = com.tencent.p014mm.p136ui.chatting.viewitems.ChatingItemAppMsgFinderLiveFeed.f165161a
                r1.getClass()
                java.lang.String r1 = com.tencent.p014mm.p136ui.chatting.viewitems.ChatingItemAppMsgFinderLiveFeed.f165162b
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "tryShowTailTag "
                r2.append(r3)
                if (r12 == 0) goto L_0x0280
                te3.p81 r3 = r12.f171698b
                if (r3 == 0) goto L_0x0280
                java.lang.String r3 = r3.f184781g
                goto L_0x0281
            L_0x0280:
                r3 = r9
            L_0x0281:
                r2.append(r3)
                java.lang.String r3 = " tailTagURL:"
                r2.append(r3)
                if (r12 == 0) goto L_0x0292
                te3.p81 r3 = r12.f171698b
                if (r3 == 0) goto L_0x0292
                java.lang.String r3 = r3.f184777V
                goto L_0x0293
            L_0x0292:
                r3 = r9
            L_0x0293:
                r2.append(r3)
                java.lang.String r3 = " tailTag layoutParams:"
                r2.append(r3)
                android.widget.ImageView r3 = r11.getFinderTailTag()
                if (r3 == 0) goto L_0x02a6
                android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
                goto L_0x02a7
            L_0x02a6:
                r3 = r9
            L_0x02a7:
                r2.append(r3)
                java.lang.String r3 = "nickname marginEnd:"
                r2.append(r3)
                android.widget.TextView r3 = r11.getFinderNickname()
                if (r3 == 0) goto L_0x02ba
                android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
                goto L_0x02bb
            L_0x02ba:
                r3 = r9
            L_0x02bb:
                boolean r4 = r3 instanceof android.view.ViewGroup.MarginLayoutParams
                if (r4 == 0) goto L_0x02c2
                android.view.ViewGroup$MarginLayoutParams r3 = (android.view.ViewGroup.MarginLayoutParams) r3
                goto L_0x02c3
            L_0x02c2:
                r3 = r9
            L_0x02c3:
                if (r3 == 0) goto L_0x02ce
                int r3 = r3.getMarginEnd()
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                goto L_0x02cf
            L_0x02ce:
                r3 = r9
            L_0x02cf:
                r2.append(r3)
                java.lang.String r3 = " iconGroupContainer marginStart:"
                r2.append(r3)
                android.view.View r3 = r11.getIconGroupContainer()
                if (r3 == 0) goto L_0x02e2
                android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
                goto L_0x02e3
            L_0x02e2:
                r3 = r9
            L_0x02e3:
                boolean r4 = r3 instanceof android.view.ViewGroup.MarginLayoutParams
                if (r4 == 0) goto L_0x02ea
                android.view.ViewGroup$MarginLayoutParams r3 = (android.view.ViewGroup.MarginLayoutParams) r3
                goto L_0x02eb
            L_0x02ea:
                r3 = r9
            L_0x02eb:
                if (r3 == 0) goto L_0x02f5
                int r3 = r3.getMarginStart()
                java.lang.Integer r9 = java.lang.Integer.valueOf(r3)
            L_0x02f5:
                r2.append(r9)
                r3 = 32
                r2.append(r3)
                java.lang.String r2 = r2.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r2)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.chatting.viewitems.ChatingItemAppMsgFinderLiveFeed.C57706a.mo26237f(com.tencent.mm.ui.chatting.viewitems.i$c, ck3.b, com.tencent.mm.storage.f4, java.lang.String):void");
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.viewitems.ChatingItemAppMsgFinderLiveFeed$b */
    public static class C57709b extends C57706a {

        /* renamed from: com.tencent.mm.ui.chatting.viewitems.ChatingItemAppMsgFinderLiveFeed$b$a */
        public static final class C57710a extends C23555k.C23562d {

            /* renamed from: a */
            public final /* synthetic */ AppMsgFinderLiveFeedHolder f165173a;

            /* renamed from: b */
            public final /* synthetic */ C60151b f165174b;

            /* renamed from: c */
            public final /* synthetic */ C72963f4 f165175c;

            public C57710a(AppMsgFinderLiveFeedHolder appMsgFinderLiveFeedHolder, C60151b bVar, C72963f4 f4Var) {
                this.f165173a = appMsgFinderLiveFeedHolder;
                this.f165174b = bVar;
                this.f165175c = f4Var;
            }

            /* renamed from: a */
            public long mo52a(View view) {
                C87412m.m108594g(view, "view");
                return this.f165175c.getMsgId() + ((long) view.hashCode());
            }

            /* renamed from: b */
            public void mo53b(View view, long j, long j2, boolean z) {
                C87412m.m108594g(view, "view");
                C32226l<Boolean, C13598b0> onViewExposedListener = this.f165173a.getOnViewExposedListener();
                if (onViewExposedListener != null) {
                    onViewExposedListener.invoke(Boolean.valueOf(z));
                }
                if (z && ((C61397g) C86312j.m106911c(C61397g.class)).Nj0(this.f165174b.f171698b.f184779e, view.findViewById(C0966R.C0970id.dnt), view.findViewById(C0966R.C0970id.dke), this.f165173a.getLiveId())) {
                    ChatingItemAppMsgFinderLiveFeed.f165161a.mo82127j(this.f165174b.f171698b, C72996z1.m85820U5(this.f165175c.mo108768t()));
                }
            }
        }

        /* renamed from: E */
        public View mo26231E(LayoutInflater layoutInflater, View view) {
            C87412m.m108594g(layoutInflater, "inflater");
            if (view == null || view.getTag() == null) {
                view = new C6807n4(layoutInflater, ((C75651n) C86312j.m106911c(C75651n.class)).ld0() == 1 ? C0966R.C0971layout.cxq : C0966R.C0971layout.f6890rc);
                view.setTag(new AppMsgFinderLiveFeedHolder().createAppMsgFinderFeedHolder(view, false));
            }
            return view;
        }

        /* renamed from: R */
        public boolean mo26232R() {
            return false;
        }

        /* renamed from: X */
        public boolean mo26233X(MenuItem menuItem, C67391b bVar, C72963f4 f4Var) {
            C87412m.m108594g(menuItem, "item");
            C87412m.m108594g(bVar, "ui");
            C87412m.m108594g(f4Var, "msg");
            if (menuItem.getItemId() != 111) {
                return false;
            }
            ChatingItemAppMsgFinderLiveFeed.f165161a.mo82128k(bVar, f4Var);
            return true;
        }

        /* renamed from: Z */
        public boolean mo26235Z(C76874e0 e0Var, View view, ContextMenu.ContextMenuInfo contextMenuInfo, C72963f4 f4Var) {
            C87412m.m108594g(e0Var, "menu");
            C87412m.m108594g(view, "v");
            Object tag = view.getTag();
            C87412m.m108592e(tag, "null cannot be cast to non-null type com.tencent.mm.ui.chatting.viewitems.ItemDataTag");
            int b = ((C74243t8) tag).mo103252b();
            if (f4Var == null) {
                return true;
            }
            if (ChatingItemAppMsgFinderLiveFeed.f165161a.mo82120b(f4Var)) {
                C67391b bVar = this.f165170z;
                C87412m.m108591d(bVar);
                e0Var.mo107136c(b, 111, 0, bVar.mo91572m().getString(C0966R.string.i48), C0966R.raw.icons_filled_share);
            }
            e0Var.removeItem(116);
            return true;
        }

        /* renamed from: a */
        public void mo70162a(View view, C67391b bVar, C72963f4 f4Var) {
        }

        /* renamed from: a0 */
        public boolean mo26236a0(View view, C67391b bVar, C72963f4 f4Var) {
            C87412m.m108594g(view, "v");
            C87412m.m108594g(bVar, "ui");
            C87412m.m108594g(f4Var, "msg");
            ChatingItemAppMsgFinderLiveFeed.f165161a.mo82126i(this, view, bVar, f4Var, mo103068y(bVar, f4Var));
            return false;
        }

        /* renamed from: d */
        public C72963f4.C72966d<?> mo82118d(C72963f4 f4Var, Context context, C39969i iVar) {
            C87412m.m108594g(context, "context");
            C87412m.m108594g(iVar, "talkerInfo");
            return new C57719e(f4Var);
        }

        /* renamed from: f */
        public void mo26237f(C74023i.C74026c cVar, C67391b bVar, C72963f4 f4Var, String str) {
            LinearLayout linearLayout;
            C74023i.C74026c cVar2 = cVar;
            C67391b bVar2 = bVar;
            C72963f4 f4Var2 = f4Var;
            Class cls = C76979h.class;
            Class cls2 = C11990s0.class;
            Class<C60200t1> cls3 = C60200t1.class;
            Class cls4 = C60606n.class;
            C87412m.m108594g(cVar2, "tag");
            C87412m.m108594g(bVar2, "ui");
            C87412m.m108594g(f4Var2, "msg");
            C87412m.m108594g(str, "userName");
            super.mo26237f(cVar, bVar, f4Var, str);
            AppMsgFinderLiveFeedHolder appMsgFinderLiveFeedHolder = (AppMsgFinderLiveFeedHolder) cVar2;
            appMsgFinderLiveFeedHolder.setLiveId(0);
            View detailLayout = appMsgFinderLiveFeedHolder.getDetailLayout();
            C87412m.m108591d(detailLayout);
            detailLayout.animate().cancel();
            View detailLayout2 = appMsgFinderLiveFeedHolder.getDetailLayout();
            C87412m.m108591d(detailLayout2);
            detailLayout2.setTag(Long.valueOf(System.currentTimeMillis()));
            LinearLayout bottomMask = appMsgFinderLiveFeedHolder.getBottomMask();
            if (bottomMask != null) {
                bottomMask.setVisibility(8);
            }
            appMsgFinderLiveFeedHolder.setTalkerUserName(bVar.mo91577r());
            String content = f4Var.getContent();
            C68070l.C68072b u = content != null ? C68070l.C68072b.m80422u(content, f4Var.mo108775z2()) : null;
            if (u != null) {
                C60151b bVar3 = (C60151b) u.mo93555w(C60151b.class);
                if (bVar3 != null) {
                    String str2 = bVar3.f171698b.f184778d;
                    if (str2 == null) {
                        str2 = "0";
                    }
                    appMsgFinderLiveFeedHolder.setLiveId(Util.getLong(str2, 0));
                    C60979d<C100810g0> i2 = ((C11990s0) C39818r.f106831a.mo62446e(cls3).mo62447c(cls2)).mo11872i2();
                    C62368t0 t0Var = (C62368t0) C86312j.m106911c(C62368t0.class);
                    String str3 = bVar3.f171698b.f184789r;
                    if (str3 == null) {
                        str3 = "";
                    }
                    C100810g0 UE = t0Var.mo87412UE(str3, C27696y.THUMB_IMAGE);
                    ImageView finderAvatar = appMsgFinderLiveFeedHolder.getFinderAvatar();
                    C87412m.m108591d(finderAvatar);
                    i2.mo85957c(UE, finderAvatar, ((C11990s0) C39818r.f106831a.mo62446e(cls3).mo62447c(cls2)).mo11867O2(C11978e0.C11979a.AVATAR_WITHOUT_DEFAULT));
                    TextView finderNickname = appMsgFinderLiveFeedHolder.getFinderNickname();
                    C87412m.m108591d(finderNickname);
                    finderNickname.setText(((C76979h) C86312j.m106911c(cls)).mo107057T1(bVar.mo91565f(), bVar3.f171698b.f184781g));
                    String Dk = ((C60606n) C86312j.m106911c(cls4)).mo84996Dk(appMsgFinderLiveFeedHolder.getLiveId());
                    if (!(Dk.length() > 0)) {
                        Dk = null;
                    }
                    if (Dk != null) {
                        bVar3.f171698b.f184783i = Dk;
                    }
                    C57713d dVar = ChatingItemAppMsgFinderLiveFeed.f165161a;
                    C64623p81 p812 = bVar3.f171698b;
                    C57713d dVar2 = dVar;
                    C60151b bVar4 = bVar3;
                    dVar.mo82130m(bVar, cVar, p812, p812.f184761E, (C51713vn0) null);
                    C64623p81 p813 = bVar4.f171698b;
                    C87412m.m108594g(p813, "shareObject");
                    dVar2.mo82121c(appMsgFinderLiveFeedHolder, p813, bVar2);
                    C64623p81 p814 = bVar4.f171698b;
                    dVar2.mo82119a(appMsgFinderLiveFeedHolder, p814.f184784j, p814.f184785n);
                    ImageView finderThumb = appMsgFinderLiveFeedHolder.getFinderThumb();
                    C87412m.m108591d(finderThumb);
                    finderThumb.setVisibility(0);
                    String str4 = bVar4.f171698b.f184782h;
                    if (str4 == null || str4.length() == 0) {
                        TextView finderDesc = appMsgFinderLiveFeedHolder.getFinderDesc();
                        C87412m.m108591d(finderDesc);
                        finderDesc.setVisibility(8);
                    } else {
                        TextView finderDesc2 = appMsgFinderLiveFeedHolder.getFinderDesc();
                        C87412m.m108591d(finderDesc2);
                        finderDesc2.setVisibility(8);
                        TextView finderDesc3 = appMsgFinderLiveFeedHolder.getFinderDesc();
                        C87412m.m108591d(finderDesc3);
                        finderDesc3.setText(bVar4.f171698b.f184782h);
                    }
                    String str5 = bVar4.f171698b.f184765I;
                    if (!(str5 == null || str5.length() == 0)) {
                        C64623p81 p815 = bVar4.f171698b;
                        if (p815.f184791t != 2) {
                            String str6 = p815.f184768L;
                            if (!(str6 == null || str6.length() == 0) && C87412m.m108589b(bVar4.f171698b.f184768L, "1")) {
                                View finderOlympicView = appMsgFinderLiveFeedHolder.getFinderOlympicView();
                                if (finderOlympicView != null) {
                                    View findViewById = finderOlympicView.findViewById(C0966R.C0970id.m19);
                                    C87412m.m108593f(findViewById, "it.findViewById(com.tenc…finder_olympic_invite_bg)");
                                    View findViewById2 = finderOlympicView.findViewById(C0966R.C0970id.m1_);
                                    C87412m.m108593f(findViewById2, "it.findViewById(com.tenc…nder_olympic_invite_icon)");
                                    ((C60606n) C86312j.m106911c(cls4)).x30((ImageView) findViewById, C61165t.SHARE_BG, C0966R.C0969drawable.cfu);
                                    ((C60606n) C86312j.m106911c(cls4)).x30((ImageView) findViewById2, C61165t.SHARE_ICON, C0966R.C0969drawable.cfv);
                                    View findViewById3 = finderOlympicView.findViewById(C0966R.C0970id.m1b);
                                    C87412m.m108593f(findViewById3, "it.findViewById(com.tenc…nder_olympic_invite_text)");
                                    TextView textView = (TextView) findViewById3;
                                    textView.setTextSize(1, 14.0f);
                                    View findViewById4 = finderOlympicView.findViewById(C0966R.C0970id.m1a);
                                    C87412m.m108593f(findViewById4, "it.findViewById(com.tenc…nder_olympic_invite_name)");
                                    TextView textView2 = (TextView) findViewById4;
                                    textView2.setTextSize(1, 14.0f);
                                    View findViewById5 = finderOlympicView.findViewById(C0966R.C0970id.m1d);
                                    C87412m.m108593f(findViewById5, "it.findViewById(com.tenc…inder_olympic_invite_you)");
                                    TextView textView3 = (TextView) findViewById5;
                                    textView3.setTextSize(1, 17.0f);
                                    C7919x.m8091a(textView);
                                    C7919x.m8091a(textView2);
                                    C7919x.m8091a(textView3);
                                    String str7 = bVar4.f171698b.f184766J;
                                    if (str7 == null || str7.length() == 0) {
                                        textView2.setVisibility(8);
                                    } else {
                                        textView2.setText(((C76979h) C86312j.m106911c(cls)).mo107057T1(bVar.mo91565f(), bVar4.f171698b.f184766J));
                                        if (textView2.getVisibility() == 8) {
                                            textView2.setVisibility(0);
                                        }
                                    }
                                    String string = bVar.mo91565f().getResources().getString(C0966R.string.lua, new Object[]{bVar4.f171698b.f184765I});
                                    C87412m.m108593f(string, "ui.context.resources.get…t.shareObject.relayIndex)");
                                    int width = appMsgFinderLiveFeedHolder.getWidth() - (C76577a.m92151b(bVar.mo91565f(), 12) * 2);
                                    String n = C112551y.m153814n(string, "\n", "", false);
                                    if (new StaticLayout(n, 0, n.length(), textView.getPaint(), width, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true).getLineCount() <= 1) {
                                        string = n;
                                    }
                                    textView.setText(string);
                                }
                                View finderOlympicView2 = appMsgFinderLiveFeedHolder.getFinderOlympicView();
                                if (finderOlympicView2 != null) {
                                    C9556a aVar = new C9556a();
                                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                                    aVar.mo10233c(0);
                                    View view = finderOlympicView2;
                                    C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/ui/chatting/viewitems/ChatingItemAppMsgFinderLiveFeed$ChattingItemAppMsgFinderLiveFeedFrom", "filling", "(Lcom/tencent/mm/ui/chatting/viewitems/ChattingItem$BaseViewHolder;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/storage/MsgInfo;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                    finderOlympicView2.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                                    C117292a.m165359e(view, "com/tencent/mm/ui/chatting/viewitems/ChatingItemAppMsgFinderLiveFeed$ChattingItemAppMsgFinderLiveFeedFrom", "filling", "(Lcom/tencent/mm/ui/chatting/viewitems/ChattingItem$BaseViewHolder;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/storage/MsgInfo;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                }
                                ImageView finderThumb2 = appMsgFinderLiveFeedHolder.getFinderThumb();
                                if (finderThumb2 != null) {
                                    finderThumb2.setVisibility(8);
                                }
                                LinearLayout bottomMask2 = appMsgFinderLiveFeedHolder.getBottomMask();
                                if (bottomMask2 != null) {
                                    bottomMask2.setVisibility(8);
                                }
                                linearLayout = (LinearLayout) appMsgFinderLiveFeedHolder.convertView.findViewById(C0966R.C0970id.b47);
                                if (linearLayout != null && !dVar2.mo82124g(bVar4.f171698b.f184779e, linearLayout, appMsgFinderLiveFeedHolder.getLiveId())) {
                                    dVar2.mo82123f(linearLayout, bVar4.f171698b, bVar, str, true);
                                }
                                View view2 = appMsgFinderLiveFeedHolder.convertView;
                                C87412m.m108593f(view2, "holder.convertView");
                                C23564m.m28138h(view2, new C57710a(appMsgFinderLiveFeedHolder, bVar4, f4Var2));
                            }
                        }
                    }
                    View finderOlympicView3 = appMsgFinderLiveFeedHolder.getFinderOlympicView();
                    if (finderOlympicView3 != null) {
                        C9556a aVar2 = new C9556a();
                        ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                        aVar2.mo10233c(8);
                        View view3 = finderOlympicView3;
                        C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/ui/chatting/viewitems/ChatingItemAppMsgFinderLiveFeed$ChattingItemAppMsgFinderLiveFeedFrom", "filling", "(Lcom/tencent/mm/ui/chatting/viewitems/ChattingItem$BaseViewHolder;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/storage/MsgInfo;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        finderOlympicView3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                        C117292a.m165359e(view3, "com/tencent/mm/ui/chatting/viewitems/ChatingItemAppMsgFinderLiveFeed$ChattingItemAppMsgFinderLiveFeedFrom", "filling", "(Lcom/tencent/mm/ui/chatting/viewitems/ChattingItem$BaseViewHolder;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/storage/MsgInfo;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                    ImageView finderThumb3 = appMsgFinderLiveFeedHolder.getFinderThumb();
                    if (finderThumb3 != null) {
                        finderThumb3.setVisibility(0);
                    }
                    linearLayout = (LinearLayout) appMsgFinderLiveFeedHolder.convertView.findViewById(C0966R.C0970id.b47);
                    dVar2.mo82123f(linearLayout, bVar4.f171698b, bVar, str, true);
                    View view22 = appMsgFinderLiveFeedHolder.convertView;
                    C87412m.m108593f(view22, "holder.convertView");
                    C23564m.m28138h(view22, new C57710a(appMsgFinderLiveFeedHolder, bVar4, f4Var2));
                }
                appMsgFinderLiveFeedHolder.clickArea.setOnClickListener(mo103099u(bVar2));
                appMsgFinderLiveFeedHolder.clickArea.setOnLongClickListener(mo103098p(bVar2));
                appMsgFinderLiveFeedHolder.clickArea.setOnTouchListener(((C79368l) bVar2.f193278b.mo102812a(C79368l.class)).mo108189Z4());
                C67391b bVar5 = this.f165170z;
                C87412m.m108591d(bVar5);
                appMsgFinderLiveFeedHolder.clickArea.setTag(new C74243t8(f4Var2, bVar5.mo91583x(), cVar2, (String) null));
                ChatingItemAppMsgFinderLiveFeed.f165161a.mo82129l(appMsgFinderLiveFeedHolder);
            }
        }

        /* renamed from: k0 */
        public boolean mo26238k0(int i, boolean z) {
            return !z && (i == 973078577 || i == 975175729);
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.viewitems.ChatingItemAppMsgFinderLiveFeed$c */
    public static class C57711c extends C57706a {

        /* renamed from: com.tencent.mm.ui.chatting.viewitems.ChatingItemAppMsgFinderLiveFeed$c$a */
        public static final class C57712a extends C23555k.C23562d {

            /* renamed from: a */
            public final /* synthetic */ AppMsgFinderLiveFeedHolder f165176a;

            /* renamed from: b */
            public final /* synthetic */ C64623p81 f165177b;

            /* renamed from: c */
            public final /* synthetic */ C72963f4 f165178c;

            public C57712a(AppMsgFinderLiveFeedHolder appMsgFinderLiveFeedHolder, C64623p81 p812, C72963f4 f4Var) {
                this.f165176a = appMsgFinderLiveFeedHolder;
                this.f165177b = p812;
                this.f165178c = f4Var;
            }

            /* renamed from: a */
            public long mo52a(View view) {
                C87412m.m108594g(view, "view");
                return this.f165178c.getMsgId() + ((long) view.hashCode());
            }

            /* renamed from: b */
            public void mo53b(View view, long j, long j2, boolean z) {
                C87412m.m108594g(view, "view");
                C32226l<Boolean, C13598b0> onViewExposedListener = this.f165176a.getOnViewExposedListener();
                if (onViewExposedListener != null) {
                    onViewExposedListener.invoke(Boolean.valueOf(z));
                }
                if (z && ((C61397g) C86312j.m106911c(C61397g.class)).Nj0(this.f165177b.f184779e, view.findViewById(C0966R.C0970id.dnt), view.findViewById(C0966R.C0970id.dke), this.f165176a.getLiveId())) {
                    ChatingItemAppMsgFinderLiveFeed.f165161a.mo82127j(this.f165177b, C72996z1.m85820U5(this.f165178c.mo108768t()));
                }
            }
        }

        /* renamed from: E */
        public View mo26231E(LayoutInflater layoutInflater, View view) {
            C87412m.m108594g(layoutInflater, "inflater");
            if (view == null || view.getTag() == null) {
                view = new C6807n4(layoutInflater, ((C75651n) C86312j.m106911c(C75651n.class)).ld0() == 1 ? C0966R.C0971layout.cxt : C0966R.C0971layout.f6940st);
                view.setTag(new AppMsgFinderLiveFeedHolder().createAppMsgFinderFeedHolder(view, true));
            }
            return view;
        }

        /* renamed from: R */
        public boolean mo26232R() {
            return true;
        }

        /* renamed from: X */
        public boolean mo26233X(MenuItem menuItem, C67391b bVar, C72963f4 f4Var) {
            C87412m.m108594g(menuItem, "item");
            C87412m.m108594g(bVar, "ui");
            C87412m.m108594g(f4Var, "msg");
            if (menuItem.getItemId() != 111) {
                return false;
            }
            ChatingItemAppMsgFinderLiveFeed.f165161a.mo82128k(bVar, f4Var);
            return true;
        }

        /* renamed from: Z */
        public boolean mo26235Z(C76874e0 e0Var, View view, ContextMenu.ContextMenuInfo contextMenuInfo, C72963f4 f4Var) {
            C87412m.m108594g(e0Var, "menu");
            C87412m.m108594g(view, "v");
            Object tag = view.getTag();
            C87412m.m108592e(tag, "null cannot be cast to non-null type com.tencent.mm.ui.chatting.viewitems.ItemDataTag");
            int b = ((C74243t8) tag).mo103252b();
            if (f4Var != null) {
                if (ChatingItemAppMsgFinderLiveFeed.f165161a.mo82120b(f4Var)) {
                    C67391b bVar = this.f165170z;
                    C87412m.m108591d(bVar);
                    e0Var.mo107136c(b, 111, 0, bVar.mo91572m().getString(C0966R.string.i48), C0966R.raw.icons_filled_share);
                }
                e0Var.removeItem(116);
                if ((f4Var.getStatus() == 2 || f4Var.f230728K == 1) && mo103083Q(f4Var, this.f165170z) && mo103081O(f4Var.mo108768t())) {
                    C67391b bVar2 = this.f165170z;
                    C87412m.m108591d(bVar2);
                    if (!bVar2.mo91580u()) {
                        e0Var.mo107136c(b, 123, 0, view.getContext().getString(C0966R.string.b_d), C0966R.raw.icons_filled_previous);
                    }
                }
            }
            return true;
        }

        /* renamed from: a */
        public void mo70162a(View view, C67391b bVar, C72963f4 f4Var) {
            C87412m.m108594g(view, "v");
            C87412m.m108594g(bVar, "ui");
            C87412m.m108594g(f4Var, "msg");
            if (f4Var.mo101020w3()) {
                C72695v.m85081w(f4Var);
                C75604z3.m90834f(f4Var.getMsgId());
                bVar.mo91541B(true);
            }
        }

        /* renamed from: a0 */
        public boolean mo26236a0(View view, C67391b bVar, C72963f4 f4Var) {
            C87412m.m108594g(view, "v");
            C87412m.m108594g(bVar, "ui");
            C87412m.m108594g(f4Var, "msg");
            ChatingItemAppMsgFinderLiveFeed.f165161a.mo82126i(this, view, bVar, f4Var, mo103068y(bVar, f4Var));
            return false;
        }

        /* renamed from: d */
        public C72963f4.C72966d<?> mo82118d(C72963f4 f4Var, Context context, C39969i iVar) {
            C87412m.m108594g(context, "context");
            C87412m.m108594g(iVar, "talkerInfo");
            return new C57719e(f4Var);
        }

        /* JADX WARNING: Removed duplicated region for block: B:67:0x02a6  */
        /* renamed from: f */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo26237f(com.tencent.p014mm.p136ui.chatting.viewitems.C74023i.C74026c r29, ck3.C67391b r30, com.tencent.p014mm.storage.C72963f4 r31, java.lang.String r32) {
            /*
                r28 = this;
                r7 = r28
                r6 = r29
                r8 = r30
                r9 = r31
                java.lang.Class<ny.h> r10 = p629ny.C76979h.class
                java.lang.Class<pl1.s0> r0 = pl1.C11990s0.class
                java.lang.Class<ht1.t1> r1 = ht1.C60200t1.class
                java.lang.Class<zj3.l> r11 = zj3.C79368l.class
                java.lang.Class<ir.n> r12 = p565ir.C60606n.class
                java.lang.String r2 = "tag"
                gy3.C87412m.m108594g(r6, r2)
                java.lang.String r2 = "ui"
                gy3.C87412m.m108594g(r8, r2)
                java.lang.String r2 = "msg"
                gy3.C87412m.m108594g(r9, r2)
                java.lang.String r2 = "userName"
                r13 = r32
                gy3.C87412m.m108594g(r13, r2)
                super.mo26237f(r29, r30, r31, r32)
                r14 = r6
                com.tencent.mm.ui.chatting.viewitems.ChatingItemAppMsgFinderLiveFeed$AppMsgFinderLiveFeedHolder r14 = (com.tencent.p014mm.p136ui.chatting.viewitems.ChatingItemAppMsgFinderLiveFeed.AppMsgFinderLiveFeedHolder) r14
                r2 = 0
                r14.setLiveId(r2)
                android.view.View r4 = r14.getDetailLayout()
                gy3.C87412m.m108591d(r4)
                android.view.ViewPropertyAnimator r4 = r4.animate()
                r4.cancel()
                android.view.View r4 = r14.getDetailLayout()
                gy3.C87412m.m108591d(r4)
                long r15 = java.lang.System.currentTimeMillis()
                java.lang.Long r5 = java.lang.Long.valueOf(r15)
                r4.setTag(r5)
                android.widget.LinearLayout r4 = r14.getBottomMask()
                r15 = 8
                if (r4 != 0) goto L_0x005f
                goto L_0x0062
            L_0x005f:
                r4.setVisibility(r15)
            L_0x0062:
                java.lang.String r4 = r30.mo91577r()
                r14.setTalkerUserName(r4)
                java.lang.String r4 = r31.getContent()
                if (r4 == 0) goto L_0x0078
                java.lang.String r5 = r31.mo108775z2()
                com.tencent.mm.message.l$b r4 = com.tencent.p014mm.message.C68070l.C68072b.m80422u(r4, r5)
                goto L_0x0079
            L_0x0078:
                r4 = 0
            L_0x0079:
                if (r4 == 0) goto L_0x03dc
                java.lang.Class<ht1.b> r5 = ht1.C60151b.class
                com.tencent.mm.message.g r4 = r4.mo93555w(r5)
                ht1.b r4 = (ht1.C60151b) r4
                te3.p81 r5 = r4.f171698b
                if (r5 == 0) goto L_0x0395
                java.lang.String r4 = r5.f184778d
                if (r4 != 0) goto L_0x008d
                java.lang.String r4 = "0"
            L_0x008d:
                long r2 = com.tencent.p014mm.sdk.platformtools.Util.getLong(r4, r2)
                r14.setLiveId(r2)
                bl3.r r2 = bl3.C39818r.f106831a
                bl3.r$a r2 = r2.mo62446e(r1)
                bl3.c r2 = r2.mo62447c(r0)
                pl1.s0 r2 = (pl1.C11990s0) r2
                k60.d r2 = r2.mo11872i2()
                java.lang.Class<pl1.t0> r3 = pl1.C62368t0.class
                di3.d r3 = di3.C86312j.m106911c(r3)
                pl1.t0 r3 = (pl1.C62368t0) r3
                java.lang.String r4 = r5.f184789r
                java.lang.String r15 = ""
                if (r4 != 0) goto L_0x00b3
                r4 = r15
            L_0x00b3:
                up1.y r13 = up1.C27696y.THUMB_IMAGE
                pl1.g0 r3 = r3.mo87412UE(r4, r13)
                android.widget.ImageView r4 = r14.getFinderAvatar()
                gy3.C87412m.m108591d(r4)
                pl1.e0$a r13 = pl1.C11978e0.C11979a.AVATAR_WITHOUT_DEFAULT
                bl3.r r6 = bl3.C39818r.f106831a
                bl3.r$a r1 = r6.mo62446e(r1)
                bl3.c r0 = r1.mo62447c(r0)
                pl1.s0 r0 = (pl1.C11990s0) r0
                n60.f r0 = r0.mo11867O2(r13)
                r2.mo85957c(r3, r4, r0)
                android.widget.TextView r0 = r14.getFinderNickname()
                gy3.C87412m.m108591d(r0)
                di3.d r1 = di3.C86312j.m106911c(r10)
                ny.h r1 = (p629ny.C76979h) r1
                android.app.Activity r2 = r30.mo91565f()
                java.lang.String r3 = r5.f184781g
                android.text.SpannableString r1 = r1.mo107057T1(r2, r3)
                r0.setText(r1)
                di3.d r0 = di3.C86312j.m106911c(r12)
                ir.n r0 = (p565ir.C60606n) r0
                long r1 = r14.getLiveId()
                java.lang.String r0 = r0.mo84996Dk(r1)
                int r1 = r0.length()
                if (r1 <= 0) goto L_0x0105
                r1 = 1
                goto L_0x0106
            L_0x0105:
                r1 = 0
            L_0x0106:
                if (r1 == 0) goto L_0x0109
                goto L_0x010a
            L_0x0109:
                r0 = 0
            L_0x010a:
                if (r0 == 0) goto L_0x010e
                r5.f184783i = r0
            L_0x010e:
                com.tencent.mm.ui.chatting.viewitems.ChatingItemAppMsgFinderLiveFeed$d r6 = com.tencent.p014mm.p136ui.chatting.viewitems.ChatingItemAppMsgFinderLiveFeed.f165161a
                te3.c21 r4 = r5.f184761E
                r13 = 0
                r0 = r6
                r1 = r30
                r2 = r29
                r3 = r5
                r17 = r11
                r7 = 2
                r11 = r5
                r5 = r13
                r0.mo82130m(r1, r2, r3, r4, r5)
                r6.mo82121c(r14, r11, r8)
                float r0 = r11.f184784j
                float r1 = r11.f184785n
                r6.mo82119a(r14, r0, r1)
                android.widget.ImageView r0 = r14.getFinderThumb()
                gy3.C87412m.m108591d(r0)
                r1 = 0
                r0.setVisibility(r1)
                java.lang.String r0 = r11.f184782h
                if (r0 == 0) goto L_0x0143
                int r0 = r0.length()
                if (r0 != 0) goto L_0x0141
                goto L_0x0143
            L_0x0141:
                r0 = 0
                goto L_0x0144
            L_0x0143:
                r0 = 1
            L_0x0144:
                if (r0 == 0) goto L_0x0153
                android.widget.TextView r0 = r14.getFinderDesc()
                gy3.C87412m.m108591d(r0)
                r1 = 8
                r0.setVisibility(r1)
                goto L_0x016b
            L_0x0153:
                r1 = 8
                android.widget.TextView r0 = r14.getFinderDesc()
                gy3.C87412m.m108591d(r0)
                r0.setVisibility(r1)
                android.widget.TextView r0 = r14.getFinderDesc()
                gy3.C87412m.m108591d(r0)
                java.lang.String r1 = r11.f184782h
                r0.setText(r1)
            L_0x016b:
                java.lang.String r0 = r11.f184765I
                if (r0 == 0) goto L_0x0178
                int r0 = r0.length()
                if (r0 != 0) goto L_0x0176
                goto L_0x0178
            L_0x0176:
                r0 = 0
                goto L_0x0179
            L_0x0178:
                r0 = 1
            L_0x0179:
                if (r0 != 0) goto L_0x030b
                int r0 = r11.f184791t
                if (r0 == r7) goto L_0x030b
                java.lang.String r0 = r11.f184768L
                if (r0 == 0) goto L_0x018c
                int r0 = r0.length()
                if (r0 != 0) goto L_0x018a
                goto L_0x018c
            L_0x018a:
                r0 = 0
                goto L_0x018d
            L_0x018c:
                r0 = 1
            L_0x018d:
                if (r0 != 0) goto L_0x030b
                java.lang.String r0 = r11.f184768L
                java.lang.String r1 = "1"
                boolean r0 = gy3.C87412m.m108589b(r0, r1)
                if (r0 == 0) goto L_0x030b
                android.view.View r0 = r14.getFinderOlympicView()
                if (r0 == 0) goto L_0x02aa
                r1 = 2131304546(0x7f092062, float:1.8227238E38)
                android.view.View r1 = r0.findViewById(r1)
                java.lang.String r2 = "it.findViewById(com.tenc…finder_olympic_invite_bg)"
                gy3.C87412m.m108593f(r1, r2)
                android.widget.ImageView r1 = (android.widget.ImageView) r1
                r2 = 2131304547(0x7f092063, float:1.822724E38)
                android.view.View r2 = r0.findViewById(r2)
                java.lang.String r3 = "it.findViewById(com.tenc…nder_olympic_invite_icon)"
                gy3.C87412m.m108593f(r2, r3)
                android.widget.ImageView r2 = (android.widget.ImageView) r2
                di3.d r3 = di3.C86312j.m106911c(r12)
                ir.n r3 = (p565ir.C60606n) r3
                ks3.t r4 = ks3.C61165t.SHARE_BG
                r5 = 2131232945(0x7f0808b1, float:1.8082014E38)
                r3.x30(r1, r4, r5)
                di3.d r1 = di3.C86312j.m106911c(r12)
                ir.n r1 = (p565ir.C60606n) r1
                ks3.t r3 = ks3.C61165t.SHARE_ICON
                r4 = 2131232946(0x7f0808b2, float:1.8082016E38)
                r1.x30(r2, r3, r4)
                r1 = 2131304549(0x7f092065, float:1.8227244E38)
                android.view.View r1 = r0.findViewById(r1)
                java.lang.String r2 = "it.findViewById(com.tenc…nder_olympic_invite_text)"
                gy3.C87412m.m108593f(r1, r2)
                android.widget.TextView r1 = (android.widget.TextView) r1
                r2 = 1096810496(0x41600000, float:14.0)
                r3 = 1
                r1.setTextSize(r3, r2)
                r4 = 2131304548(0x7f092064, float:1.8227242E38)
                android.view.View r4 = r0.findViewById(r4)
                java.lang.String r5 = "it.findViewById(com.tenc…nder_olympic_invite_name)"
                gy3.C87412m.m108593f(r4, r5)
                android.widget.TextView r4 = (android.widget.TextView) r4
                r4.setTextSize(r3, r2)
                r2 = 2131304551(0x7f092067, float:1.8227248E38)
                android.view.View r0 = r0.findViewById(r2)
                java.lang.String r2 = "it.findViewById(com.tenc…inder_olympic_invite_you)"
                gy3.C87412m.m108593f(r0, r2)
                android.widget.TextView r0 = (android.widget.TextView) r0
                r2 = 1099431936(0x41880000, float:17.0)
                r0.setTextSize(r3, r2)
                er1.C7919x.m8091a(r1)
                er1.C7919x.m8091a(r4)
                er1.C7919x.m8091a(r0)
                java.lang.String r0 = r11.f184766J
                if (r0 == 0) goto L_0x0225
                int r0 = r0.length()
                if (r0 != 0) goto L_0x0223
                goto L_0x0225
            L_0x0223:
                r0 = 0
                goto L_0x0226
            L_0x0225:
                r0 = 1
            L_0x0226:
                if (r0 == 0) goto L_0x022e
                r0 = 8
                r4.setVisibility(r0)
                goto L_0x024e
            L_0x022e:
                r0 = 8
                di3.d r2 = di3.C86312j.m106911c(r10)
                ny.h r2 = (p629ny.C76979h) r2
                android.app.Activity r3 = r30.mo91565f()
                java.lang.String r5 = r11.f184766J
                android.text.SpannableString r2 = r2.mo107057T1(r3, r5)
                r4.setText(r2)
                int r2 = r4.getVisibility()
                if (r2 != r0) goto L_0x024e
                r0 = 0
                r4.setVisibility(r0)
                goto L_0x024f
            L_0x024e:
                r0 = 0
            L_0x024f:
                android.app.Activity r2 = r30.mo91565f()
                android.content.res.Resources r2 = r2.getResources()
                r3 = 2131829356(0x7f11226c, float:1.9291679E38)
                r4 = 1
                java.lang.Object[] r5 = new java.lang.Object[r4]
                java.lang.String r4 = r11.f184765I
                r5[r0] = r4
                java.lang.String r0 = r2.getString(r3, r5)
                java.lang.String r2 = "ui.context.resources.get… finderObject.relayIndex)"
                gy3.C87412m.m108593f(r0, r2)
                int r2 = r14.getWidth()
                android.app.Activity r3 = r30.mo91565f()
                r4 = 12
                int r3 = kg3.C76577a.m92151b(r3, r4)
                int r3 = r3 * 2
                int r23 = r2 - r3
                java.lang.String r2 = "\n"
                r3 = 0
                java.lang.String r2 = z04.C112551y.m153814n(r0, r2, r15, r3)
                android.text.StaticLayout r3 = new android.text.StaticLayout
                r20 = 0
                int r21 = r2.length()
                android.text.TextPaint r22 = r1.getPaint()
                android.text.Layout$Alignment r24 = android.text.Layout.Alignment.ALIGN_NORMAL
                r25 = 1065353216(0x3f800000, float:1.0)
                r26 = 0
                r27 = 1
                r18 = r3
                r19 = r2
                r18.<init>(r19, r20, r21, r22, r23, r24, r25, r26, r27)
                int r3 = r3.getLineCount()
                r4 = 1
                if (r3 > r4) goto L_0x02a7
                r0 = r2
            L_0x02a7:
                r1.setText(r0)
            L_0x02aa:
                android.view.View r0 = r14.getFinderOlympicView()
                if (r0 != 0) goto L_0x02b1
                goto L_0x02f4
            L_0x02b1:
                k20.a r1 = new k20.a
                r1.<init>()
                java.lang.ThreadLocal<k20.a> r2 = k20.C60958c.f173611a
                r2 = 0
                java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
                r1.mo10233c(r3)
                java.lang.Object[] r19 = r1.mo10232b()
                java.lang.String r20 = "com/tencent/mm/ui/chatting/viewitems/ChatingItemAppMsgFinderLiveFeed$ChattingItemAppMsgFinderLiveFeedTo"
                java.lang.String r21 = "filling"
                java.lang.String r22 = "(Lcom/tencent/mm/ui/chatting/viewitems/ChattingItem$BaseViewHolder;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/storage/MsgInfo;Ljava/lang/String;)V"
                java.lang.String r23 = "android/view/View_EXEC_"
                java.lang.String r24 = "setVisibility"
                java.lang.String r25 = "(I)V"
                r18 = r0
                j20.C117292a.m165358d(r18, r19, r20, r21, r22, r23, r24, r25)
                r2 = 0
                java.lang.Object r1 = r1.mo10231a(r2)
                java.lang.Integer r1 = (java.lang.Integer) r1
                int r1 = r1.intValue()
                r0.setVisibility(r1)
                java.lang.String r19 = "com/tencent/mm/ui/chatting/viewitems/ChatingItemAppMsgFinderLiveFeed$ChattingItemAppMsgFinderLiveFeedTo"
                java.lang.String r20 = "filling"
                java.lang.String r21 = "(Lcom/tencent/mm/ui/chatting/viewitems/ChattingItem$BaseViewHolder;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/storage/MsgInfo;Ljava/lang/String;)V"
                java.lang.String r22 = "android/view/View_EXEC_"
                java.lang.String r23 = "setVisibility"
                java.lang.String r24 = "(I)V"
                j20.C117292a.m165359e(r18, r19, r20, r21, r22, r23, r24)
            L_0x02f4:
                android.widget.ImageView r0 = r14.getFinderThumb()
                r1 = 8
                if (r0 != 0) goto L_0x02fd
                goto L_0x0300
            L_0x02fd:
                r0.setVisibility(r1)
            L_0x0300:
                android.widget.LinearLayout r0 = r14.getBottomMask()
                if (r0 != 0) goto L_0x0307
                goto L_0x0361
            L_0x0307:
                r0.setVisibility(r1)
                goto L_0x0361
            L_0x030b:
                android.view.View r0 = r14.getFinderOlympicView()
                gy3.C87412m.m108591d(r0)
                k20.a r1 = new k20.a
                r1.<init>()
                java.lang.ThreadLocal<k20.a> r2 = k20.C60958c.f173611a
                r2 = 8
                java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
                r1.mo10233c(r3)
                java.lang.Object[] r19 = r1.mo10232b()
                java.lang.String r20 = "com/tencent/mm/ui/chatting/viewitems/ChatingItemAppMsgFinderLiveFeed$ChattingItemAppMsgFinderLiveFeedTo"
                java.lang.String r21 = "filling"
                java.lang.String r22 = "(Lcom/tencent/mm/ui/chatting/viewitems/ChattingItem$BaseViewHolder;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/storage/MsgInfo;Ljava/lang/String;)V"
                java.lang.String r23 = "android/view/View_EXEC_"
                java.lang.String r24 = "setVisibility"
                java.lang.String r25 = "(I)V"
                r18 = r0
                j20.C117292a.m165358d(r18, r19, r20, r21, r22, r23, r24, r25)
                r2 = 0
                java.lang.Object r1 = r1.mo10231a(r2)
                java.lang.Integer r1 = (java.lang.Integer) r1
                int r1 = r1.intValue()
                r0.setVisibility(r1)
                java.lang.String r19 = "com/tencent/mm/ui/chatting/viewitems/ChatingItemAppMsgFinderLiveFeed$ChattingItemAppMsgFinderLiveFeedTo"
                java.lang.String r20 = "filling"
                java.lang.String r21 = "(Lcom/tencent/mm/ui/chatting/viewitems/ChattingItem$BaseViewHolder;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/storage/MsgInfo;Ljava/lang/String;)V"
                java.lang.String r22 = "android/view/View_EXEC_"
                java.lang.String r23 = "setVisibility"
                java.lang.String r24 = "(I)V"
                j20.C117292a.m165359e(r18, r19, r20, r21, r22, r23, r24)
                android.widget.ImageView r0 = r14.getFinderThumb()
                gy3.C87412m.m108591d(r0)
                r1 = 0
                r0.setVisibility(r1)
            L_0x0361:
                android.view.View r0 = r14.convertView
                r1 = 2131299182(0x7f090b6e, float:1.8216358E38)
                android.view.View r0 = r0.findViewById(r1)
                r1 = r0
                android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
                if (r1 == 0) goto L_0x0385
                java.lang.String r0 = r11.f184779e
                long r2 = r14.getLiveId()
                boolean r0 = r6.mo82124g(r0, r1, r2)
                if (r0 != 0) goto L_0x0385
                r5 = 1
                r0 = r6
                r2 = r11
                r3 = r30
                r4 = r32
                r0.mo82123f(r1, r2, r3, r4, r5)
            L_0x0385:
                android.view.View r0 = r14.convertView
                java.lang.String r1 = "holder.convertView"
                gy3.C87412m.m108593f(r0, r1)
                com.tencent.mm.ui.chatting.viewitems.ChatingItemAppMsgFinderLiveFeed$c$a r1 = new com.tencent.mm.ui.chatting.viewitems.ChatingItemAppMsgFinderLiveFeed$c$a
                r1.<init>(r14, r11, r9)
                zp3.C23564m.m28138h(r0, r1)
                goto L_0x0398
            L_0x0395:
                r17 = r11
                r7 = 2
            L_0x0398:
                android.view.View r0 = r14.clickArea
                r1 = 2
                r7 = r28
                com.tencent.mm.ui.chatting.viewitems.i$f r2 = r7.mo103099u(r8)
                r0.setOnClickListener(r2)
                android.view.View r0 = r14.clickArea
                com.tencent.mm.ui.chatting.viewitems.i$e r2 = r7.mo103098p(r8)
                r0.setOnLongClickListener(r2)
                android.view.View r0 = r14.clickArea
                com.tencent.mm.ui.chatting.manager.a r2 = r8.f193278b
                r3 = r17
                xi.d r2 = r2.mo102812a(r3)
                zj3.l r2 = (zj3.C79368l) r2
                com.tencent.mm.ui.chatting.h2 r2 = r2.mo108189Z4()
                r0.setOnTouchListener(r2)
                com.tencent.mm.ui.chatting.viewitems.t8 r0 = new com.tencent.mm.ui.chatting.viewitems.t8
                ck3.b r2 = r7.f165170z
                gy3.C87412m.m108591d(r2)
                boolean r2 = r2.mo91583x()
                r4 = r29
                r5 = 0
                r0.<init>(r9, r2, r4, r5)
                android.view.View r2 = r14.clickArea
                r2.setTag(r0)
                com.tencent.mm.ui.chatting.viewitems.ChatingItemAppMsgFinderLiveFeed$d r0 = com.tencent.p014mm.p136ui.chatting.viewitems.ChatingItemAppMsgFinderLiveFeed.f165161a
                r0.mo82129l(r14)
                goto L_0x03de
            L_0x03dc:
                r3 = r11
                r1 = 2
            L_0x03de:
                boolean r0 = com.tencent.p014mm.p136ui.chatting.viewitems.C74023i.m87878T()
                if (r0 == 0) goto L_0x042a
                android.widget.ProgressBar r0 = r14.uploadingPB
                if (r0 == 0) goto L_0x03ed
                r2 = 8
                r0.setVisibility(r2)
            L_0x03ed:
                int r0 = r31.getStatus()
                if (r0 != r1) goto L_0x0417
                com.tencent.mm.ui.chatting.manager.a r0 = r8.f193278b
                xi.d r0 = r0.mo102812a(r3)
                zj3.l r0 = (zj3.C79368l) r0
                long r1 = r31.getMsgId()
                boolean r0 = r7.mo103080N(r0, r1)
                if (r0 == 0) goto L_0x0417
                android.widget.ImageView r0 = r14.getTickIV()
                if (r0 == 0) goto L_0x044a
                android.widget.ImageView r0 = r14.getTickIV()
                gy3.C87412m.m108591d(r0)
                r2 = 0
                r0.setVisibility(r2)
                goto L_0x044a
            L_0x0417:
                android.widget.ImageView r0 = r14.getTickIV()
                if (r0 == 0) goto L_0x044a
                android.widget.ImageView r0 = r14.getTickIV()
                gy3.C87412m.m108591d(r0)
                r3 = 8
                r0.setVisibility(r3)
                goto L_0x044a
            L_0x042a:
                r2 = 0
                r3 = 8
                android.widget.ImageView r0 = r14.getTickIV()
                if (r0 == 0) goto L_0x043d
                android.widget.ImageView r0 = r14.getTickIV()
                gy3.C87412m.m108591d(r0)
                r0.setVisibility(r3)
            L_0x043d:
                int r0 = r31.getStatus()
                if (r0 >= r1) goto L_0x0445
                r15 = 1
                goto L_0x0446
            L_0x0445:
                r15 = 0
            L_0x0446:
                r0 = 1
                r7.mo103093i0(r14, r15, r0)
            L_0x044a:
                java.lang.String r3 = r30.mo91573n()
                boolean r4 = r30.mo91583x()
                r0 = r28
                r1 = r14
                r2 = r31
                r5 = r30
                r6 = r28
                r0.mo103087e0(r1, r2, r3, r4, r5, r6)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.chatting.viewitems.ChatingItemAppMsgFinderLiveFeed.C57711c.mo26237f(com.tencent.mm.ui.chatting.viewitems.i$c, ck3.b, com.tencent.mm.storage.f4, java.lang.String):void");
        }

        /* renamed from: k0 */
        public boolean mo26238k0(int i, boolean z) {
            return z && (i == 973078577 || i == 975175729);
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.viewitems.ChatingItemAppMsgFinderLiveFeed$d */
    public static final class C57713d {

        /* renamed from: com.tencent.mm.ui.chatting.viewitems.ChatingItemAppMsgFinderLiveFeed$d$a */
        public static final class C57714a implements C60606n.C60609c {

            /* renamed from: a */
            public final /* synthetic */ AppMsgFinderLiveFeedHolder f165179a;

            /* renamed from: b */
            public final /* synthetic */ C64623p81 f165180b;

            /* renamed from: c */
            public final /* synthetic */ long f165181c;

            /* renamed from: d */
            public final /* synthetic */ C67391b f165182d;

            public C57714a(AppMsgFinderLiveFeedHolder appMsgFinderLiveFeedHolder, C64623p81 p812, long j, C67391b bVar) {
                this.f165179a = appMsgFinderLiveFeedHolder;
                this.f165180b = p812;
                this.f165181c = j;
                this.f165182d = bVar;
            }

            /* JADX WARNING: Code restructure failed: missing block: B:28:0x00f6, code lost:
                if (r10 == null) goto L_0x00f8;
             */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void onLiveStatusCallback(long r20, int r22, java.lang.Object r23) {
                /*
                    r19 = this;
                    r0 = r19
                    r1 = r20
                    r3 = r22
                    r4 = r23
                    java.lang.Class<ir.n> r5 = p565ir.C60606n.class
                    com.tencent.mm.ui.chatting.viewitems.ChatingItemAppMsgFinderLiveFeed$AppMsgFinderLiveFeedHolder r6 = r0.f165179a
                    long r6 = r6.getLiveId()
                    int r8 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
                    if (r8 == 0) goto L_0x0021
                    com.tencent.mm.ui.chatting.viewitems.ChatingItemAppMsgFinderLiveFeed$d r1 = com.tencent.p014mm.p136ui.chatting.viewitems.ChatingItemAppMsgFinderLiveFeed.f165161a
                    r1.getClass()
                    java.lang.String r1 = com.tencent.p014mm.p136ui.chatting.viewitems.ChatingItemAppMsgFinderLiveFeed.f165162b
                    java.lang.String r2 = "#checkLiveStatus.onLiveStatusCallback not match, return"
                    com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r2)
                    return
                L_0x0021:
                    te3.p81 r6 = r0.f165180b
                    r6.f184791t = r3
                    boolean r7 = r4 instanceof te3.C51713vn0
                    r8 = 0
                    if (r7 == 0) goto L_0x002e
                    r9 = r4
                    te3.vn0 r9 = (te3.C51713vn0) r9
                    goto L_0x002f
                L_0x002e:
                    r9 = r8
                L_0x002f:
                    if (r9 == 0) goto L_0x0034
                    te3.c21 r9 = r9.f143572d
                    goto L_0x0035
                L_0x0034:
                    r9 = r8
                L_0x0035:
                    r6.f184761E = r9
                    di3.d r6 = di3.C86312j.m106911c(r5)
                    ir.n r6 = (p565ir.C60606n) r6
                    com.tencent.mm.ui.chatting.viewitems.ChatingItemAppMsgFinderLiveFeed$AppMsgFinderLiveFeedHolder r9 = r0.f165179a
                    long r9 = r9.getLiveId()
                    java.lang.String r6 = r6.mo84996Dk(r9)
                    int r9 = r6.length()
                    if (r9 <= 0) goto L_0x004f
                    r9 = 1
                    goto L_0x0050
                L_0x004f:
                    r9 = 0
                L_0x0050:
                    if (r9 == 0) goto L_0x0053
                    goto L_0x0054
                L_0x0053:
                    r6 = r8
                L_0x0054:
                    if (r6 == 0) goto L_0x005a
                    te3.p81 r9 = r0.f165180b
                    r9.f184783i = r6
                L_0x005a:
                    com.tencent.mm.ui.chatting.viewitems.ChatingItemAppMsgFinderLiveFeed$d r6 = com.tencent.p014mm.p136ui.chatting.viewitems.ChatingItemAppMsgFinderLiveFeed.f165161a
                    r6.getClass()
                    java.lang.String r9 = com.tencent.p014mm.p136ui.chatting.viewitems.ChatingItemAppMsgFinderLiveFeed.f165162b
                    java.lang.StringBuilder r12 = new java.lang.StringBuilder
                    r12.<init>()
                    java.lang.String r13 = "[checkLiveStatus] thisLiveId:"
                    r12.append(r13)
                    long r13 = r0.f165181c
                    r12.append(r13)
                    java.lang.String r13 = ",liveID:"
                    r12.append(r13)
                    r12.append(r1)
                    java.lang.String r13 = ",desc:"
                    r12.append(r13)
                    te3.p81 r13 = r0.f165180b
                    java.lang.String r13 = r13.f184782h
                    r12.append(r13)
                    java.lang.String r13 = ",share status:"
                    r12.append(r13)
                    te3.p81 r13 = r0.f165180b
                    int r13 = r13.f184791t
                    r12.append(r13)
                    java.lang.String r13 = ",callback liveStatus:"
                    r12.append(r13)
                    r12.append(r3)
                    r13 = 44
                    r12.append(r13)
                    te3.p81 r13 = r0.f165180b
                    te3.c21 r13 = r13.f184761E
                    java.lang.String r18 = ""
                    if (r13 == 0) goto L_0x00f8
                    java.lang.StringBuilder r14 = new java.lang.StringBuilder
                    r14.<init>()
                    java.lang.String r15 = "liveId:"
                    r14.append(r15)
                    long r10 = r13.f182392d
                    java.lang.String r10 = o40.C61926c.m72691p(r10)
                    r14.append(r10)
                    java.lang.String r10 = " live_status:"
                    r14.append(r10)
                    int r10 = r13.f182394f
                    r14.append(r10)
                    java.lang.String r10 = " replay_status:"
                    r14.append(r10)
                    int r10 = r13.f182366L
                    r14.append(r10)
                    java.lang.String r10 = " replay_url is empty:"
                    r14.append(r10)
                    java.lang.String r10 = r13.f182364J
                    if (r10 == 0) goto L_0x00de
                    int r10 = r10.length()
                    if (r10 != 0) goto L_0x00dc
                    goto L_0x00de
                L_0x00dc:
                    r10 = 0
                    goto L_0x00df
                L_0x00de:
                    r10 = 1
                L_0x00df:
                    r14.append(r10)
                    java.lang.String r10 = ", status_desc:"
                    r14.append(r10)
                    java.lang.String r10 = r13.f182373R0
                    r14.append(r10)
                    java.lang.String r10 = "};"
                    r14.append(r10)
                    java.lang.String r10 = r14.toString()
                    if (r10 != 0) goto L_0x00fa
                L_0x00f8:
                    r10 = r18
                L_0x00fa:
                    r12.append(r10)
                    java.lang.String r10 = r12.toString()
                    com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r10)
                    ck3.b r13 = r0.f165182d
                    com.tencent.mm.ui.chatting.viewitems.ChatingItemAppMsgFinderLiveFeed$AppMsgFinderLiveFeedHolder r14 = r0.f165179a
                    te3.p81 r15 = r0.f165180b
                    te3.c21 r9 = r15.f184761E
                    if (r7 == 0) goto L_0x0111
                    r8 = r4
                    te3.vn0 r8 = (te3.C51713vn0) r8
                L_0x0111:
                    r17 = r8
                    r12 = r6
                    r16 = r9
                    r12.mo82130m(r13, r14, r15, r16, r17)
                    if (r7 == 0) goto L_0x0124
                    te3.vn0 r4 = (te3.C51713vn0) r4
                    java.lang.String r4 = r4.f143575g
                    if (r4 != 0) goto L_0x0122
                    goto L_0x0124
                L_0x0122:
                    r18 = r4
                L_0x0124:
                    r4 = r18
                    int r7 = r4.length()
                    if (r7 != 0) goto L_0x012e
                    r7 = 1
                    goto L_0x012f
                L_0x012e:
                    r7 = 0
                L_0x012f:
                    r8 = 2
                    if (r7 != 0) goto L_0x015b
                    if (r3 == r8) goto L_0x015b
                    di3.d r5 = di3.C86312j.m106911c(r5)
                    ir.n r5 = (p565ir.C60606n) r5
                    boolean r5 = r5.J10()
                    if (r5 != 0) goto L_0x0141
                    goto L_0x015b
                L_0x0141:
                    com.tencent.mm.ui.chatting.viewitems.ChatingItemAppMsgFinderLiveFeed$AppMsgFinderLiveFeedHolder r5 = r0.f165179a
                    android.widget.TextView r5 = r5.getReasonTv()
                    if (r5 != 0) goto L_0x014a
                    goto L_0x014d
                L_0x014a:
                    r5.setText(r4)
                L_0x014d:
                    com.tencent.mm.ui.chatting.viewitems.ChatingItemAppMsgFinderLiveFeed$AppMsgFinderLiveFeedHolder r4 = r0.f165179a
                    android.widget.TextView r4 = r4.getReasonTv()
                    if (r4 != 0) goto L_0x0156
                    goto L_0x0169
                L_0x0156:
                    r5 = 0
                    r4.setVisibility(r5)
                    goto L_0x0169
                L_0x015b:
                    com.tencent.mm.ui.chatting.viewitems.ChatingItemAppMsgFinderLiveFeed$AppMsgFinderLiveFeedHolder r4 = r0.f165179a
                    android.widget.TextView r4 = r4.getReasonTv()
                    if (r4 != 0) goto L_0x0164
                    goto L_0x0169
                L_0x0164:
                    r5 = 8
                    r4.setVisibility(r5)
                L_0x0169:
                    com.tencent.mm.ui.chatting.viewitems.ChatingItemAppMsgFinderLiveFeed$AppMsgFinderLiveFeedHolder r4 = r0.f165179a
                    r6.mo82129l(r4)
                    te3.p81 r4 = r0.f165180b
                    te3.c21 r5 = r4.f184761E
                    boolean r4 = r6.mo82125h(r4, r5)
                    if (r4 != 0) goto L_0x01e2
                    r4 = 1
                    if (r3 != r4) goto L_0x017d
                    r11 = 1
                    goto L_0x017e
                L_0x017d:
                    r11 = 2
                L_0x017e:
                    t91.c$a r3 = t91.C64208c.f181951a
                    java.lang.String r1 = java.lang.String.valueOf(r20)
                    java.util.List r1 = r3.mo89026a(r1)
                    r6.getClass()
                    java.util.ArrayList r1 = (java.util.ArrayList) r1     // Catch:{ Exception -> 0x01eb }
                    java.util.Iterator r1 = r1.iterator()     // Catch:{ Exception -> 0x01eb }
                L_0x0191:
                    boolean r2 = r1.hasNext()     // Catch:{ Exception -> 0x01eb }
                    if (r2 == 0) goto L_0x01eb
                    java.lang.Object r2 = r1.next()     // Catch:{ Exception -> 0x01eb }
                    java.util.Map r2 = (java.util.Map) r2     // Catch:{ Exception -> 0x01eb }
                    t91.c$a r3 = t91.C64208c.f181951a     // Catch:{ Exception -> 0x01eb }
                    java.lang.String r4 = "event_params"
                    java.lang.Object r4 = r2.get(r4)     // Catch:{ Exception -> 0x01eb }
                    java.lang.String r5 = "null cannot be cast to non-null type kotlin.collections.MutableMap<kotlin.String, kotlin.Any?>"
                    gy3.C87412m.m108592e(r4, r5)     // Catch:{ Exception -> 0x01eb }
                    java.util.Map r4 = gy3.C24564k0.m30739c(r4)     // Catch:{ Exception -> 0x01eb }
                    java.util.Map r16 = r3.mo89034i(r4, r11)     // Catch:{ Exception -> 0x01eb }
                    java.lang.String r3 = "event_id"
                    java.lang.Object r3 = r2.get(r3)     // Catch:{ Exception -> 0x01eb }
                    java.lang.String r4 = "null cannot be cast to non-null type kotlin.String"
                    gy3.C87412m.m108592e(r3, r4)     // Catch:{ Exception -> 0x01eb }
                    r15 = r3
                    java.lang.String r15 = (java.lang.String) r15     // Catch:{ Exception -> 0x01eb }
                    java.lang.String r3 = "event_time"
                    java.lang.Object r2 = r2.get(r3)     // Catch:{ Exception -> 0x01eb }
                    java.lang.String r3 = "null cannot be cast to non-null type kotlin.Long"
                    gy3.C87412m.m108592e(r2, r3)     // Catch:{ Exception -> 0x01eb }
                    java.lang.Long r2 = (java.lang.Long) r2     // Catch:{ Exception -> 0x01eb }
                    long r13 = r2.longValue()     // Catch:{ Exception -> 0x01eb }
                    java.lang.Class<l31.e> r2 = l31.C61212e.class
                    di3.d r2 = di3.C86312j.m106911c(r2)     // Catch:{ Exception -> 0x01eb }
                    r12 = r2
                    l31.e r12 = (l31.C61212e) r12     // Catch:{ Exception -> 0x01eb }
                    r17 = 26236(0x667c, float:3.6764E-41)
                    r18 = 0
                    r12.oh0(r13, r15, r16, r17, r18)     // Catch:{ Exception -> 0x01eb }
                    goto L_0x0191
                L_0x01e2:
                    t91.c$a r3 = t91.C64208c.f181951a
                    java.lang.String r1 = java.lang.String.valueOf(r20)
                    r3.mo89031f(r1)
                L_0x01eb:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.chatting.viewitems.ChatingItemAppMsgFinderLiveFeed.C57713d.C57714a.onLiveStatusCallback(long, int, java.lang.Object):void");
            }
        }

        /* renamed from: com.tencent.mm.ui.chatting.viewitems.ChatingItemAppMsgFinderLiveFeed$d$b */
        public static final class C57715b implements C118148a {

            /* renamed from: a */
            public final /* synthetic */ C64623p81 f165183a;

            /* renamed from: b */
            public final /* synthetic */ C8478d0 f165184b;

            /* renamed from: c */
            public final /* synthetic */ String f165185c;

            public C57715b(C64623p81 p812, C8478d0 d0Var, String str) {
                this.f165183a = p812;
                this.f165184b = d0Var;
                this.f165185c = str;
            }

            /* renamed from: a */
            public /* synthetic */ boolean mo36a(Object obj, String str, int i) {
                return false;
            }

            /* renamed from: b */
            public final Map<String, Object> mo37b(String str) {
                Class cls = C10383h.class;
                Class cls2 = C66191d.class;
                C13604l[] lVarArr = new C13604l[6];
                lVarArr[0] = new C13604l("live_enter_status", Long.valueOf(this.f165183a.f184791t == 1 ? ((C66191d) C86312j.m106911c(cls2)).mo61350GE() : ((C66191d) C86312j.m106911c(cls2)).mo61352JO()));
                lVarArr[1] = new C13604l("behaviour_session_id", ((C59774i) C86312j.m106911c(C59774i.class)).mo84751Wb());
                lVarArr[2] = new C13604l("finder_context_id", ((C10383h) C86312j.m106911c(cls)).mo10696E());
                lVarArr[3] = new C13604l("finder_tab_context_id", ((C10383h) C86312j.m106911c(cls)).mo10698S0());
                lVarArr[4] = new C13604l("live_share_type", Integer.valueOf(this.f165184b.f27483d));
                lVarArr[5] = new C13604l("share_username", this.f165185c);
                return C90364q0.m113147f(lVarArr);
            }
        }

        /* renamed from: com.tencent.mm.ui.chatting.viewitems.ChatingItemAppMsgFinderLiveFeed$d$c */
        public static final class C57716c implements C61612b {

            /* renamed from: a */
            public final /* synthetic */ C64623p81 f165186a;

            /* renamed from: b */
            public final /* synthetic */ View f165187b;

            /* renamed from: c */
            public final /* synthetic */ long f165188c;

            public C57716c(C64623p81 p812, View view, long j) {
                this.f165186a = p812;
                this.f165187b = view;
                this.f165188c = j;
            }

            /* renamed from: a */
            public final void mo77120a(long j, String str, Map<String, Object> map) {
                Map<String, Object> map2 = map;
                Class cls = C66191d.class;
                long GE = this.f165186a.f184791t == 1 ? ((C66191d) C86312j.m106911c(cls)).mo61350GE() : ((C66191d) C86312j.m106911c(cls)).mo61352JO();
                C64208c.C64209a aVar = C64208c.f181951a;
                C87412m.m108593f(str, "eventId");
                C87412m.m108593f(map2, "params");
                int i = (int) GE;
                if (!aVar.mo89028c(j, str, map, i)) {
                    C57713d dVar = ChatingItemAppMsgFinderLiveFeed.f165161a;
                    if (!dVar.mo82124g(this.f165186a.f184779e, this.f165187b, this.f165188c)) {
                        C64623p81 p812 = this.f165186a;
                        if (!dVar.mo82125h(p812, p812.f184761E)) {
                            ((C61212e) C86312j.m106911c(C61212e.class)).oh0(j, str, aVar.mo89034i(map2, i), 26236, false);
                        }
                    }
                }
            }
        }

        /* renamed from: com.tencent.mm.ui.chatting.viewitems.ChatingItemAppMsgFinderLiveFeed$d$d */
        public static final class C57717d implements C88144b.C76564c {

            /* renamed from: a */
            public final /* synthetic */ boolean f165189a;

            /* renamed from: b */
            public final /* synthetic */ C64623p81 f165190b;

            public C57717d(boolean z, C64623p81 p812) {
                this.f165189a = z;
                this.f165190b = p812;
            }

            public final void onActivityResult(int i, int i2, Intent intent) {
                if (i2 == -1) {
                    ArrayList<String> stringArrayListExtra = intent != null ? intent.getStringArrayListExtra("SendMsgUsernames") : null;
                    if (stringArrayListExtra == null) {
                        stringArrayListExtra = new ArrayList<>(0);
                    }
                    String str = "";
                    for (String str2 : stringArrayListExtra) {
                        if (!(str.length() == 0)) {
                            str = str + ';' + str2;
                        } else {
                            str = str + str2;
                        }
                    }
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("share_username", str);
                    if (this.f165189a) {
                        C11091a aVar = C11091a.f32868a;
                        C64623p81 p812 = this.f165190b;
                        C11091a.m10992b(aVar, p812.f184778d, p812.f184780f, p812.f184779e, WCWebUpdater.XWEB_UPDATER_START_CHECK_TYPE_EMBEDINSTALL, "1", "0", jSONObject, (String) null, 128, (Object) null);
                        return;
                    }
                    C11091a aVar2 = C11091a.f32868a;
                    C64623p81 p813 = this.f165190b;
                    C11091a.m10992b(aVar2, p813.f184778d, p813.f184780f, p813.f184779e, "3", "1", "0", jSONObject, (String) null, 128, (Object) null);
                }
            }
        }

        /* renamed from: com.tencent.mm.ui.chatting.viewitems.ChatingItemAppMsgFinderLiveFeed$d$e */
        public static final class C57718e {

            /* renamed from: a */
            public String f165191a = "";

            /* renamed from: b */
            public String f165192b = "";
        }

        /* renamed from: e */
        public static /* synthetic */ void m66468e(C57713d dVar, long j, long j2, String str, C60151b bVar, C67391b bVar2, C72963f4 f4Var, boolean z, int i, Object obj) {
            dVar.mo82122d(j, j2, (i & 4) != 0 ? "" : str, bVar, bVar2, f4Var, (i & 64) != 0 ? false : z);
        }

        /* renamed from: n */
        public static final C57718e m66469n(C51713vn0 vn02, C64623p81 p812) {
            C48654a21 a212;
            LinkedList<C48654a21> linkedList;
            T t;
            boolean z;
            String str = null;
            C51576uo2 uo22 = vn02 != null ? vn02.f143580o : null;
            boolean z2 = true;
            if (vn02 == null || (linkedList = vn02.f143586u) == null) {
                a212 = null;
            } else {
                Iterator<T> it = linkedList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        t = null;
                        break;
                    }
                    t = it.next();
                    if (((C48654a21) t).f130235i == 2) {
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
                a212 = (C48654a21) t;
            }
            C57718e eVar = new C57718e();
            String str2 = a212 != null ? a212.f130230d : null;
            String str3 = "";
            if (!(str2 == null || str2.length() == 0)) {
                StringBuilder sb = new StringBuilder();
                sb.append(a212 != null ? a212.f130230d : null);
                sb.append(Util.nullAsNil(a212 != null ? a212.f130231e : null));
                String sb4 = sb.toString();
                C87412m.m108594g(sb4, "<set-?>");
                eVar.f165191a = sb4;
                if (a212 != null) {
                    str = a212.f130230d;
                }
                if (str != null) {
                    str3 = str;
                }
                eVar.f165192b = str3;
            } else {
                String str4 = uo22 != null ? uo22.f142984d : null;
                if (!(str4 == null || str4.length() == 0)) {
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append(uo22 != null ? uo22.f142984d : null);
                    sb5.append(Util.nullAsNil(uo22 != null ? uo22.f142985e : null));
                    String sb6 = sb5.toString();
                    C87412m.m108594g(sb6, "<set-?>");
                    eVar.f165191a = sb6;
                    if (uo22 != null) {
                        str = uo22.f142984d;
                    }
                    if (str != null) {
                        str3 = str;
                    }
                    eVar.f165192b = str3;
                } else {
                    String str5 = p812.f184783i;
                    if (!(str5 == null || str5.length() == 0)) {
                        String str6 = p812.f184783i;
                        if (str6 == null) {
                            str6 = str3;
                        }
                        eVar.f165191a = str6;
                        Pattern compile = Pattern.compile("&?token=[^&]*");
                        C87412m.m108593f(compile, "compile(pattern)");
                        String replaceAll = compile.matcher(str6).replaceAll(str3);
                        C87412m.m108593f(replaceAll, "nativePattern.matcher(in…).replaceAll(replacement)");
                        eVar.f165192b = replaceAll;
                    } else {
                        String str7 = p812.f184789r;
                        if (!(str7 == null || str7.length() == 0)) {
                            z2 = false;
                        }
                        if (!z2) {
                            String str8 = p812.f184789r;
                            if (str8 != null) {
                                str3 = str8;
                            }
                            eVar.f165191a = str3;
                            eVar.f165192b = str3;
                        }
                    }
                }
            }
            return eVar;
        }

        /* renamed from: a */
        public final void mo82119a(AppMsgFinderLiveFeedHolder appMsgFinderLiveFeedHolder, float f, float f2) {
            C87412m.m108594g(appMsgFinderLiveFeedHolder, "holder");
            ImageView finderThumb = appMsgFinderLiveFeedHolder.getFinderThumb();
            C87412m.m108591d(finderThumb);
            ViewGroup.LayoutParams layoutParams = finderThumb.getLayoutParams();
            C87412m.m108592e(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            layoutParams2.height = (int) (((double) appMsgFinderLiveFeedHolder.getWidth()) * 1.3333333730697632d);
            ImageView finderThumb2 = appMsgFinderLiveFeedHolder.getFinderThumb();
            if (finderThumb2 != null) {
                finderThumb2.setLayoutParams(layoutParams2);
            }
            View finderOlympicView = appMsgFinderLiveFeedHolder.getFinderOlympicView();
            if (finderOlympicView != null) {
                finderOlympicView.setLayoutParams(layoutParams2);
            }
            View finderThumbSpace = appMsgFinderLiveFeedHolder.getFinderThumbSpace();
            if (finderThumbSpace != null) {
                finderThumbSpace.setLayoutParams(layoutParams2);
            }
        }

        /* renamed from: b */
        public final boolean mo82120b(C72963f4 f4Var) {
            if (f4Var == null || Util.isNullOrNil(f4Var.getContent()) || C68070l.C68072b.m80422u(f4Var.getContent(), (String) null) == null) {
                return true;
            }
            C64623p81 p812 = ((C60151b) C68070l.C68072b.m80422u(f4Var.getContent(), f4Var.mo108775z2()).mo93555w(C60151b.class)).f171698b;
            C60613r rVar = (C60613r) C86312j.m106911c(C60613r.class);
            C64273c21 c212 = p812.f184761E;
            return rVar.ot0(c212 != null ? c212.f182385X0 : 0);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x001b, code lost:
            r0 = z04.C66731x.m78732f(r0);
         */
        /* renamed from: c */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo82121c(com.tencent.p014mm.p136ui.chatting.viewitems.ChatingItemAppMsgFinderLiveFeed.AppMsgFinderLiveFeedHolder r17, te3.C64623p81 r18, ck3.C67391b r19) {
            /*
                r16 = this;
                r2 = r18
                java.lang.String r0 = "holder"
                r1 = r17
                gy3.C87412m.m108594g(r1, r0)
                java.lang.String r0 = "shareObject"
                gy3.C87412m.m108594g(r2, r0)
                java.lang.String r0 = "ui"
                r6 = r19
                gy3.C87412m.m108594g(r6, r0)
                java.lang.String r0 = r2.f184778d
                if (r0 == 0) goto L_0x0026
                java.lang.Long r0 = z04.C66731x.m78732f(r0)
                if (r0 == 0) goto L_0x0026
                long r3 = r0.longValue()
                goto L_0x0028
            L_0x0026:
                r3 = 0
            L_0x0028:
                r7 = r3
                com.tencent.mm.ui.chatting.viewitems.ChatingItemAppMsgFinderLiveFeed$d$a r10 = new com.tencent.mm.ui.chatting.viewitems.ChatingItemAppMsgFinderLiveFeed$d$a
                r0 = r10
                r1 = r17
                r2 = r18
                r3 = r7
                r5 = r19
                r0.<init>(r1, r2, r3, r5)
                android.app.Activity r0 = r19.mo91565f()
                boolean r0 = r0 instanceof com.tencent.p014mm.p136ui.MMFragmentActivity
                if (r0 == 0) goto L_0x004a
                android.app.Activity r0 = r19.mo91565f()
                java.lang.String r1 = "null cannot be cast to non-null type com.tencent.mm.ui.MMFragmentActivity"
                gy3.C87412m.m108592e(r0, r1)
                com.tencent.mm.ui.MMFragmentActivity r0 = (com.tencent.p014mm.p136ui.MMFragmentActivity) r0
                goto L_0x004b
            L_0x004a:
                r0 = 0
            L_0x004b:
                r9 = r0
                java.lang.Class<ir.n> r0 = p565ir.C60606n.class
                di3.d r0 = di3.C86312j.m106911c(r0)
                java.lang.String r1 = "getService(IFinderLiveFeatureService::class.java)"
                gy3.C87412m.m108593f(r0, r1)
                r5 = r0
                ir.n r5 = (p565ir.C60606n) r5
                r0 = 0
                r11 = 1
                r12 = 0
                r13 = 0
                r14 = 96
                r15 = 0
                r6 = r7
                r8 = r0
                p565ir.C60606n.C60607a.m70857a(r5, r6, r8, r9, r10, r11, r12, r13, r14, r15)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.chatting.viewitems.ChatingItemAppMsgFinderLiveFeed.C57713d.mo82121c(com.tencent.mm.ui.chatting.viewitems.ChatingItemAppMsgFinderLiveFeed$AppMsgFinderLiveFeedHolder, te3.p81, ck3.b):void");
        }

        /* renamed from: d */
        public final void mo82122d(long j, long j2, String str, C60151b bVar, C67391b bVar2, C72963f4 f4Var, boolean z) {
            String str2;
            long j3 = j;
            long j4 = j2;
            C60151b bVar3 = bVar;
            Class cls = C60200t1.class;
            long Oc0 = (long) ((C62120e) C86312j.m106911c(C62120e.class)).Oc0();
            String r = bVar2.mo91577r();
            C87412m.m108593f(r, "ui.talkerUserName");
            ((C60603k) C86312j.m106911c(C60603k.class)).mo84959cS(j, j2, bVar, Oc0, r);
            C117361f.INSTANCE.mo182041q(540999697);
            int i = 2;
            String R1 = !bVar2.mo91582w() ? ((C60200t1) C86312j.m106911c(cls)).mo76802R1(2, 2, 65) : C45628s0.m50748M(bVar2.mo91577r()) ? ((C60200t1) C86312j.m106911c(cls)).mo76802R1(31, 2, 65) : ((C60200t1) C86312j.m106911c(cls)).mo76802R1(3, 2, 65);
            Intent intent = new Intent();
            intent.putExtra("CURRENT_FEED_ID", j3);
            intent.putExtra("LAUNCH_WITH_ANIM", z);
            String str3 = C64208c.f181958h;
            if (str3 == null) {
                str3 = "";
            }
            intent.putExtra("key_enter_live_param_share_username", str3);
            boolean z2 = false;
            intent.putExtra("key_enter_live_param_from_share_scene", 0);
            intent.putExtra("key_enter_live_param_from_share_scene_new", 1);
            String C5 = ((C60200t1) C86312j.m106911c(cls)).mo76861l7().mo83756C5(f4Var);
            intent.putExtra("Chat_Msg_Id", f4Var.getMsgId());
            intent.putExtra("KEY_ENTER_LIVE_PARAM_TO_USERNAME", C5);
            intent.putExtra("key_enter_live_param_visitor_enter_scene", 1);
            String str4 = bVar3.f171698b.f184794w;
            if (str4 == null) {
                str4 = "";
            }
            intent.putExtra("key_enter_live_param_ecsource", str4);
            String str5 = ChatingItemAppMsgFinderLiveFeed.f165162b;
            StringBuilder sb = new StringBuilder();
            sb.append("to ecSource:");
            String str6 = bVar3.f171698b.f184794w;
            if (str6 == null) {
                str6 = "";
            }
            sb.append(str6);
            sb.append(',');
            String str7 = C64208c.f181958h;
            if (str7 == null) {
                str7 = "";
            }
            sb.append(str7);
            sb.append(",toUsername:");
            sb.append(C5);
            Log.m105924i(str5, sb.toString());
            intent.putExtra("key_enter_live_param_bind_type", bVar3.f171698b.f184797z);
            String str8 = bVar3.f171698b.f184757A;
            if (str8 == null) {
                str8 = "";
            }
            intent.putExtra("key_enter_live_param_by_biz_username", str8);
            String str9 = bVar3.f171698b.f184758B;
            if (str9 == null) {
                str9 = "";
            }
            intent.putExtra("key_enter_live_param_by_biz_nickname", str9);
            String str10 = bVar3.f171698b.f184783i;
            if (!(str10 == null || str10.length() == 0)) {
                str2 = bVar3.f171698b.f184783i;
            } else {
                String str11 = bVar3.f171698b.f184789r;
                str2 = !(str11 == null || str11.length() == 0) ? bVar3.f171698b.f184789r : "";
            }
            intent.putExtra("key_enter_live_cover_url", str2);
            intent.putExtra("key_enter_live_param_is_from_chat_group", bVar2.mo91583x());
            int i2 = C10412u.f31640a;
            intent.putExtra("KEY_ENTER_LIVE_PARAM_LIVE_EVENT_SOURCE", 7);
            String str12 = bVar3.f171698b.f184765I;
            if (!(str12 == null || str12.length() == 0)) {
                String str13 = bVar3.f171698b.f184768L;
                if (!(str13 == null || str13.length() == 0) && C87412m.m108589b(bVar3.f171698b.f184768L, "1")) {
                    C64855yf1 yf12 = new C64855yf1();
                    C64623p81 p812 = bVar3.f171698b;
                    yf12.f186510e = p812.f184765I;
                    yf12.f186509d = p812.f184764H;
                    yf12.f186512g = p812.f184767K;
                    yf12.f186511f = p812.f184766J;
                    intent.putExtra("KEY_ENTER_LIVE_PARAM_OLYMPIC_FIRE_AUTHOR_INFO", yf12.toByteArray());
                }
            }
            if (bVar2.mo91583x()) {
                String r2 = bVar2.mo91577r();
                if (r2 != null && C112551y.m153808h(r2, "@chatroom", false, 2, (Object) null)) {
                    z2 = true;
                }
                if (z2) {
                    String r3 = bVar2.mo91577r();
                    if (r3 == null) {
                        r3 = "";
                    }
                    intent.putExtra("KEY_ENTER_LIVE_PARAM_BOX_GROUP_ID", r3);
                    intent.putExtra("KEY_ENTER_LIVE_PARAM_BOX_GROUP_TO_LIVEID", j4);
                }
            }
            if (bVar3.f171698b.f184761E != null) {
                C115669n.INSTANCE.mo175913w(1552, 93, 1);
            } else {
                C115669n.INSTANCE.mo175913w(1552, 94, 1);
            }
            C64238ap2 ap22 = new C64238ap2();
            ap22.f182124d = j3;
            ap22.f182125e = j4;
            C64623p81 p813 = bVar3.f171698b;
            String str14 = p813.f184790s;
            if (str14 == null) {
                str14 = "";
            }
            ap22.f182126f = str14;
            String str15 = p813.f184779e;
            if (str15 == null) {
                str15 = "";
            }
            ap22.f182127g = str15;
            ap22.f182128h = "";
            ap22.f182129i = p813.f184782h;
            ap22.f182130j = p813.f184761E;
            C64279c90 c902 = new C64279c90();
            c902.f182444d = R1;
            c902.f182445e = "";
            c902.f182447g = -1;
            c902.f182448h = -1;
            c902.f182449i = 1;
            C64347eq2 eq22 = new C64347eq2();
            if (!C72996z1.m85820U5(bVar2.mo91577r())) {
                i = 1;
            }
            eq22.f183020h = i;
            eq22.f183021i = bVar2.mo91577r();
            eq22.f183022j = C45628s0.m50749N(bVar2.mo91577r()) ? 1 : 0;
            c902.f182451n = eq22;
            Activity f = bVar2.mo91565f();
            C87412m.m108593f(f, "ui.context");
            ((C10649f) C86312j.m106911c(C10649f.class)).mo10916tP(f, intent, ap22, ((C60200t1) C86312j.m106911c(cls)).mo76861l7().mo83771R5(), c902, (C10649f.C10650a) null);
        }

        /* renamed from: f */
        public final void mo82123f(View view, C64623p81 p812, C67391b bVar, String str, boolean z) {
            View view2 = view;
            C64623p81 p813 = p812;
            String str2 = str;
            Class cls = C61212e.class;
            C87412m.m108594g(view2, "view");
            C87412m.m108594g(p813, C66261f3.COL_FINDEROBJECT);
            C87412m.m108594g(bVar, "ui");
            C87412m.m108594g(str2, "userName");
            ((C61212e) C86312j.m106911c(cls)).se0(view2);
            try {
                String str3 = p813.f184778d;
                long parseLong = str3 != null ? Long.parseLong(str3) : -1;
                try {
                    if (!mo82125h(p813, p813.f184761E)) {
                        C8478d0 d0Var = new C8478d0();
                        d0Var.f27483d = -1;
                        d0Var.f27483d = bVar.mo91583x() ? 1 : 0;
                        C61212e o302 = ((C61212e) C86312j.m106911c(cls)).o30(view2, "live_room_card");
                        C13604l[] lVarArr = new C13604l[5];
                        String str4 = p813.f184780f;
                        if (str4 == null) {
                            str4 = "";
                        }
                        lVarArr[0] = new C13604l("feed_id", str4);
                        String str5 = p813.f184778d;
                        if (str5 == null) {
                            str5 = "";
                        }
                        lVarArr[1] = new C13604l("live_id", str5);
                        lVarArr[2] = new C13604l("comment_scene", ((C66191d) C86312j.m106911c(C66191d.class)).mo61356um());
                        String str6 = p813.f184779e;
                        if (str6 == null) {
                            str6 = "";
                        }
                        lVarArr[3] = new C13604l("finder_username", str6);
                        lVarArr[4] = new C13604l("session_buffer", "");
                        o302.mo86149PM(view2, C90364q0.m113147f(lVarArr)).E60(view2, new C57715b(p813, d0Var, str2));
                        if (z) {
                            C64208c.f181951a.mo89030e(String.valueOf(p813.f184778d), (Map<String, Object>) null);
                        }
                        ((C61212e) C86312j.m106911c(cls)).r80(view2, 40, new C57716c(p813, view2, parseLong));
                    }
                } catch (Exception unused) {
                }
            } catch (Exception unused2) {
            }
        }

        /* renamed from: g */
        public final boolean mo82124g(String str, View view, long j) {
            C87412m.m108594g(view, "view");
            return ((C61397g) C86312j.m106911c(C61397g.class)).Nj0(str, view.findViewById(C0966R.C0970id.dnt), view.findViewById(C0966R.C0970id.dke), j);
        }

        /* renamed from: h */
        public final boolean mo82125h(C64623p81 p812, C64273c21 c212) {
            Class cls = C61397g.class;
            C87412m.m108594g(p812, "shareObject");
            return c212 != null ? ((C61397g) C86312j.m106911c(cls)).ah0(p812.f184779e, c212) : ((C61397g) C86312j.m106911c(cls)).mo83476G0(p812);
        }

        /* renamed from: i */
        public final boolean mo82126i(C74023i iVar, View view, C67391b bVar, C72963f4 f4Var, String str) {
            C60151b bVar2;
            String str2;
            C60151b bVar3;
            C13598b0 b0Var;
            C13598b0 b0Var2;
            C74023i iVar2 = iVar;
            View view2 = view;
            C72963f4 f4Var2 = f4Var;
            Class cls = C61397g.class;
            Class cls2 = C60606n.class;
            Class cls3 = C60192p2.class;
            C87412m.m108594g(iVar2, "chatItem");
            C87412m.m108594g(view2, "v");
            C87412m.m108594g(bVar, "ui");
            C87412m.m108594g(f4Var2, "msg");
            String content = f4Var.getContent();
            C68070l.C68072b u = content != null ? C68070l.C68072b.m80422u(content, f4Var.mo108775z2()) : null;
            if (!(u == null || (bVar2 = (C60151b) u.mo93555w(C60151b.class)) == null)) {
                long P = C61926c.m72671P(bVar2.f171698b.f184780f);
                long P2 = C61926c.m72671P(bVar2.f171698b.f184778d);
                C57713d dVar = ChatingItemAppMsgFinderLiveFeed.f165161a;
                Long valueOf = Long.valueOf(P);
                View rootView = view.getRootView();
                C87412m.m108593f(rootView, "v.rootView");
                dVar.getClass();
                C57706a aVar = iVar2 instanceof C57706a ? (C57706a) iVar2 : null;
                if (aVar != null) {
                    aVar.f165164B = valueOf != null ? valueOf.longValue() : 0;
                    aVar.f165163A = rootView;
                    C67391b bVar4 = aVar.f165170z;
                    if (bVar4 != null) {
                        C66282i iVar3 = (C66282i) bVar4.f193278b.mo102812a(C66282i.class);
                        if (iVar3 != null) {
                            iVar3.mo90405j4(((C57706a) iVar2).f165165C);
                        }
                    }
                }
                if (P != 0) {
                    if (str == null) {
                        str2 = bVar.mo91574o().getUsername();
                        if (str2 == null) {
                            str2 = "";
                        }
                    } else {
                        str2 = str;
                    }
                    C64208c.f181958h = str2;
                    C64208c.f181959i = ((C10383h) C86312j.m106911c(C10383h.class)).mo10700XQ(bVar.mo91574o().f108320R1);
                    boolean Nj0 = ((C61397g) C86312j.m106911c(cls)).Nj0(bVar2.f171698b.f184779e, view2.findViewById(C0966R.C0970id.dnt), view2.findViewById(C0966R.C0970id.dke), P2);
                    ImageView imageView = (ImageView) view2.findViewById(C0966R.C0970id.b6k);
                    boolean Xl0 = ((C60192p2) C86312j.m106911c(cls3)).Xl0();
                    C64623p81 p812 = bVar2.f171698b;
                    C64273c21 c212 = p812.f184761E;
                    String str3 = "";
                    String str4 = (!(c212 != null && c212.f182384X == 1) && p812.f184791t == 1 && Xl0) ? c212 != null ? c212.f182395g : null : str3;
                    String str5 = "v.context";
                    if (Nj0) {
                        dVar.getClass();
                        Class cls4 = C60200t1.class;
                        int i = 2;
                        String R1 = !bVar.mo91582w() ? ((C60200t1) C86312j.m106911c(cls4)).mo76802R1(2, 2, 65) : ((C60200t1) C86312j.m106911c(cls4)).mo76802R1(3, 2, 65);
                        int i2 = C61160f.f174109a;
                        int i3 = bVar2.f171698b.f184759C;
                        int i4 = ((i3 == 2 || i3 == 8 || i3 == 16) || i3 == 6) ? 1 : 2;
                        if (!C72996z1.m85820U5(f4Var.mo108768t())) {
                            i = 1;
                        }
                        ((C60606n) C86312j.m106911c(cls2)).ih0(P2);
                        String str6 = str5;
                        String str7 = "null cannot be cast to non-null type android.view.ViewGroup";
                        String str8 = FirebaseAnalytics.C113378a.SHARE;
                        int i5 = i;
                        long j = P2;
                        ((C61397g) C86312j.m106911c(cls)).mo83473AP(false, P, str8, i4, i5);
                        Intent T5 = ((C60200t1) C86312j.m106911c(cls4)).mo76861l7().mo83773T5((Intent) null, str8, i5);
                        Log.m105924i(ChatingItemAppMsgFinderLiveFeed.f165162b, "jumpToReplayLive " + Xl0 + " validStatus");
                        if (imageView == null || !Xl0) {
                            C61397g gVar = (C61397g) C86312j.m106911c(cls);
                            Activity f = bVar.mo91565f();
                            C64623p81 p813 = bVar2.f171698b;
                            String str9 = p813.f184779e;
                            String str10 = str9 == null ? str3 : str9;
                            String str11 = p813.f184790s;
                            gVar.mo83482aR(T5, f, P, j, str10, str11 == null ? str3 : str11, p813.f184782h, R1, ((C60200t1) C86312j.m106911c(cls4)).mo76861l7().mo83771R5());
                        } else {
                            C61401a aVar2 = C61401a.CHAT_REPLAY;
                            ViewParent parent = imageView.getParent();
                            C87412m.m108592e(parent, str7);
                            C10652c Pz = ((C60192p2) C86312j.m106911c(cls3)).mo85193Pz(aVar2, P, (ViewGroup) parent, imageView, "", !((C60606n) C86312j.m106911c(cls2)).mo85008I1(bVar2.f171698b.f184761E), bVar2.f171698b.f184761E);
                            Context context = view.getContext();
                            C87412m.m108593f(context, str6);
                            C61402b co = ((C60192p2) C86312j.m106911c(cls3)).mo85196co(context, Pz);
                            if (co != null) {
                                co.mo84323h(new C57755g(T5, bVar, P, j, bVar2, R1));
                                b0Var2 = C13598b0.f38549a;
                            } else {
                                b0Var2 = null;
                            }
                            if (b0Var2 == null) {
                                C61397g gVar2 = (C61397g) C86312j.m106911c(cls);
                                Activity f2 = bVar.mo91565f();
                                C64623p81 p814 = bVar2.f171698b;
                                String str12 = p814.f184779e;
                                String str13 = str12 == null ? str3 : str12;
                                String str14 = p814.f184790s;
                                gVar2.mo83482aR(T5, f2, P, j, str13, str14 == null ? str3 : str14, p814.f184782h, R1, ((C60200t1) C86312j.m106911c(cls4)).mo76861l7().mo83771R5());
                            }
                        }
                    } else {
                        String str15 = str5;
                        String str16 = "null cannot be cast to non-null type android.view.ViewGroup";
                        long j2 = P2;
                        if (Util.isEqual(p812.f184779e, C75592q0.m90778h())) {
                            Intent intent = new Intent();
                            intent.putExtra("KEY_PARAMS_SOURCE_TYPE", bVar2.f171698b.f184793v);
                            C60606n nVar = (C60606n) C86312j.m106911c(cls2);
                            Context context2 = MMApplicationContext.getContext();
                            Long valueOf2 = Long.valueOf(j2);
                            C64623p81 p815 = bVar2.f171698b;
                            String str17 = p815.f184790s;
                            nVar.o90(intent, context2, P, valueOf2, str17 == null ? str3 : str17, p815.f184782h, "", "", "");
                        } else {
                            C72963f4.C72966d dVar2 = f4Var2.f212670y1;
                            C57719e eVar = dVar2 instanceof C57719e ? (C57719e) dVar2 : null;
                            if (eVar != null) {
                                eVar.f165196e = true;
                            }
                            dVar.getClass();
                            Log.m105924i(ChatingItemAppMsgFinderLiveFeed.f165162b, "onQuoteLiveMsgClick fluentSwitch: " + Xl0 + " livestate: " + bVar2.f171698b.f184791t + " streamUrl: " + str4);
                            dVar.getClass();
                            if (bVar2.f171698b.f184791t != 1 || imageView == null || !Xl0) {
                                m66468e(dVar, P, j2, str4, bVar2, bVar, f4Var, false, 64, (Object) null);
                            } else {
                                C60192p2 p2Var = (C60192p2) C86312j.m106911c(cls3);
                                C61401a aVar3 = C61401a.CHAT;
                                ViewParent parent2 = imageView.getParent();
                                C87412m.m108592e(parent2, str16);
                                C10652c Pz2 = p2Var.mo85193Pz(aVar3, P, (ViewGroup) parent2, imageView, str4 == null ? str3 : str4, !((C60606n) C86312j.m106911c(cls2)).mo85008I1(bVar2.f171698b.f184761E), bVar2.f171698b.f184761E);
                                Context context3 = view.getContext();
                                C87412m.m108593f(context3, str15);
                                C61402b Ui = ((C60192p2) C86312j.m106911c(cls3)).mo85194Ui(context3, Pz2);
                                if (Ui != null) {
                                    bVar3 = bVar2;
                                    Ui.mo84323h(new C57757h(P, j2, str4, bVar3, bVar, f4Var));
                                    b0Var = C13598b0.f38549a;
                                } else {
                                    bVar3 = bVar2;
                                    b0Var = null;
                                }
                                if (b0Var == null) {
                                    m66468e(dVar, P, j2, str4, bVar3, bVar, f4Var, false, 64, (Object) null);
                                }
                            }
                            ((C61212e) C86312j.m106911c(C61212e.class)).mo86153W7("view_clk", view, C90363p0.m113143b(new C13604l("view_id", "live_room_card_share")), 26236);
                        }
                    }
                }
            }
            return false;
        }

        /* renamed from: j */
        public final void mo82127j(C64623p81 p812, boolean z) {
            C87412m.m108594g(p812, "shareObject");
            long P = C61926c.m72671P(p812.f184780f);
            int i = C61160f.f174109a;
            int i2 = p812.f184759C;
            ((C61397g) C86312j.m106911c(C61397g.class)).mo83473AP(true, P, FirebaseAnalytics.C113378a.SHARE, ((i2 == 2 || i2 == 8 || i2 == 16) || p812.f184759C == 6) ? 1 : 2, z ? 2 : 1);
        }

        /* renamed from: k */
        public final void mo82128k(C67391b bVar, C72963f4 f4Var) {
            C68070l.C68072b u;
            C87412m.m108594g(bVar, "ui");
            C87412m.m108594g(f4Var, "msg");
            if (!Util.isNullOrNil(f4Var.getContent()) && (u = C68070l.C68072b.m80422u(f4Var.getContent(), (String) null)) != null) {
                boolean U5 = C72996z1.m85820U5(f4Var.mo108768t());
                C64623p81 p812 = ((C60151b) C68070l.C68072b.m80422u(f4Var.getContent(), f4Var.mo108775z2()).mo93555w(C60151b.class)).f171698b;
                Intent intent = new Intent(bVar.mo91565f(), MsgRetransmitUI.class);
                intent.putExtra("Retr_Msg_Id", f4Var.getMsgId());
                int i = u.f195582i;
                if (i == 63) {
                    intent.putExtra("Retr_Msg_Type", 23);
                } else if (i == 88) {
                    intent.putExtra("Retr_Msg_Type", 31);
                }
                String str = ChatingItemAppMsgFinderLiveFeed.f165162b;
                Log.m105924i(str, "retransmit content.type:" + u.f195582i);
                intent.putExtra("Multi_Retr", true);
                intent.putExtra("Retr_Msg_content", C68070l.C68072b.m80420s(u, (String) null, (C98121d) null));
                intent.putExtra("Retr_go_to_chattingUI", false);
                intent.putExtra("Retr_show_success_tips", true);
                C88144b.m109799q(bVar.f193279c, "", "", intent, ((C60186m4) C86312j.m106911c(C60186m4.class)).mo85187Yk(), false, new C57717d(U5, p812));
            }
        }

        /* renamed from: l */
        public final void mo82129l(AppMsgFinderLiveFeedHolder appMsgFinderLiveFeedHolder) {
            int i;
            C87412m.m108594g(appMsgFinderLiveFeedHolder, "holder");
            LinearLayout bottomMask = appMsgFinderLiveFeedHolder.getBottomMask();
            if (bottomMask != null) {
                if (((C75651n) C86312j.m106911c(C75651n.class)).ld0() == 1) {
                    bottomMask.setVisibility(0);
                    i = C0966R.C0969drawable.f357202cj3;
                } else {
                    i = C0966R.C0969drawable.f357201a52;
                }
                ((C60200t1) C86312j.m106911c(C60200t1.class)).mo76861l7().mo83777X5(bottomMask, C0966R.C0969drawable.f357203a53, i);
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:41:0x0247, code lost:
            r5 = r2.f182386Y;
         */
        /* renamed from: m */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean mo82130m(ck3.C67391b r32, com.tencent.p014mm.p136ui.chatting.viewitems.C74023i.C74026c r33, te3.C64623p81 r34, te3.C64273c21 r35, te3.C51713vn0 r36) {
            /*
                r31 = this;
                r0 = r33
                r1 = r34
                r2 = r35
                r3 = r36
                java.lang.Class<ht1.t1> r4 = ht1.C60200t1.class
                java.lang.Class<ir.n> r5 = p565ir.C60606n.class
                java.lang.String r6 = "ui"
                r7 = r32
                gy3.C87412m.m108594g(r7, r6)
                java.lang.String r6 = "tag"
                gy3.C87412m.m108594g(r0, r6)
                java.lang.String r6 = "shareObject"
                gy3.C87412m.m108594g(r1, r6)
                com.tencent.mm.ui.chatting.viewitems.ChatingItemAppMsgFinderLiveFeed$AppMsgFinderLiveFeedHolder r0 = (com.tencent.p014mm.p136ui.chatting.viewitems.ChatingItemAppMsgFinderLiveFeed.AppMsgFinderLiveFeedHolder) r0
                di3.d r6 = di3.C86312j.m106911c(r5)
                ir.n r6 = (p565ir.C60606n) r6
                r7 = 0
                java.lang.Integer r8 = java.lang.Integer.valueOf(r7)
                ks3.k r11 = r6.mo85062iC(r1, r7)
                java.lang.String r6 = com.tencent.p014mm.p136ui.chatting.viewitems.ChatingItemAppMsgFinderLiveFeed.f165162b
                java.lang.StringBuilder r9 = new java.lang.StringBuilder
                r9.<init>()
                java.lang.String r10 = "liveCardState:"
                r9.append(r10)
                r9.append(r11)
                java.lang.String r9 = r9.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r9)
                int r6 = r11.ordinal()
                java.lang.String r15 = "getService(IFinderCommon…atureService::class.java)"
                java.lang.String r9 = "getService(IFinderLiveFeatureService::class.java)"
                r14 = 8
                r13 = 1
                if (r6 == 0) goto L_0x0062
                if (r6 == r13) goto L_0x0062
                r10 = 2
                if (r6 == r10) goto L_0x0065
                r10 = 3
                if (r6 == r10) goto L_0x0062
                r2 = 4
                if (r6 == r2) goto L_0x0065
                r6 = 1
                goto L_0x02c1
            L_0x0062:
                r6 = 1
                goto L_0x019e
            L_0x0065:
                com.tencent.mm.ui.chatting.viewitems.ChatingItemAppMsgFinderLiveFeed$d$e r1 = m66469n(r3, r1)
                android.view.View r2 = r0.getLiveTag()
                java.lang.Integer r3 = java.lang.Integer.valueOf(r14)
                if (r2 != 0) goto L_0x0074
                goto L_0x00b3
            L_0x0074:
                k20.a r6 = new k20.a
                r6.<init>()
                java.lang.ThreadLocal<k20.a> r10 = k20.C60958c.f173611a
                r6.mo10233c(r3)
                java.lang.Object[] r17 = r6.mo10232b()
                java.lang.String r18 = "com/tencent/mm/ui/chatting/viewitems/ChatingItemAppMsgFinderLiveFeed$Companion"
                java.lang.String r19 = "updateLiveTag$showEndTag"
                java.lang.String r20 = "(Lcom/tencent/mm/protocal/protobuf/FinderGetLiveInfoResp;Lcom/tencent/mm/protocal/protobuf/FinderLiveShareObject;Lcom/tencent/mm/ui/chatting/viewitems/ChatingItemAppMsgFinderLiveFeed$AppMsgFinderLiveFeedHolder;Lcom/tencent/plugin/finder/live/api/constants/ConstantsFinderLive$LiveCardState;)V"
                java.lang.String r21 = "android/view/View_EXEC_"
                java.lang.String r22 = "setVisibility"
                java.lang.String r23 = "(I)V"
                r16 = r2
                j20.C117292a.m165358d(r16, r17, r18, r19, r20, r21, r22, r23)
                java.lang.Object r6 = r6.mo10231a(r7)
                java.lang.Integer r6 = (java.lang.Integer) r6
                int r6 = r6.intValue()
                r2.setVisibility(r6)
                java.lang.String r17 = "com/tencent/mm/ui/chatting/viewitems/ChatingItemAppMsgFinderLiveFeed$Companion"
                java.lang.String r18 = "updateLiveTag$showEndTag"
                java.lang.String r19 = "(Lcom/tencent/mm/protocal/protobuf/FinderGetLiveInfoResp;Lcom/tencent/mm/protocal/protobuf/FinderLiveShareObject;Lcom/tencent/mm/ui/chatting/viewitems/ChatingItemAppMsgFinderLiveFeed$AppMsgFinderLiveFeedHolder;Lcom/tencent/plugin/finder/live/api/constants/ConstantsFinderLive$LiveCardState;)V"
                java.lang.String r20 = "android/view/View_EXEC_"
                java.lang.String r21 = "setVisibility"
                java.lang.String r22 = "(I)V"
                j20.C117292a.m165359e(r16, r17, r18, r19, r20, r21, r22)
            L_0x00b3:
                android.view.View r2 = r0.getLiveEndTag()
                if (r2 != 0) goto L_0x00ba
                goto L_0x00f9
            L_0x00ba:
                k20.a r6 = new k20.a
                r6.<init>()
                java.lang.ThreadLocal<k20.a> r10 = k20.C60958c.f173611a
                r6.mo10233c(r8)
                java.lang.Object[] r24 = r6.mo10232b()
                java.lang.String r25 = "com/tencent/mm/ui/chatting/viewitems/ChatingItemAppMsgFinderLiveFeed$Companion"
                java.lang.String r26 = "updateLiveTag$showEndTag"
                java.lang.String r27 = "(Lcom/tencent/mm/protocal/protobuf/FinderGetLiveInfoResp;Lcom/tencent/mm/protocal/protobuf/FinderLiveShareObject;Lcom/tencent/mm/ui/chatting/viewitems/ChatingItemAppMsgFinderLiveFeed$AppMsgFinderLiveFeedHolder;Lcom/tencent/plugin/finder/live/api/constants/ConstantsFinderLive$LiveCardState;)V"
                java.lang.String r28 = "android/view/View_EXEC_"
                java.lang.String r29 = "setVisibility"
                java.lang.String r30 = "(I)V"
                r23 = r2
                j20.C117292a.m165358d(r23, r24, r25, r26, r27, r28, r29, r30)
                java.lang.Object r6 = r6.mo10231a(r7)
                java.lang.Integer r6 = (java.lang.Integer) r6
                int r6 = r6.intValue()
                r2.setVisibility(r6)
                java.lang.String r24 = "com/tencent/mm/ui/chatting/viewitems/ChatingItemAppMsgFinderLiveFeed$Companion"
                java.lang.String r25 = "updateLiveTag$showEndTag"
                java.lang.String r26 = "(Lcom/tencent/mm/protocal/protobuf/FinderGetLiveInfoResp;Lcom/tencent/mm/protocal/protobuf/FinderLiveShareObject;Lcom/tencent/mm/ui/chatting/viewitems/ChatingItemAppMsgFinderLiveFeed$AppMsgFinderLiveFeedHolder;Lcom/tencent/plugin/finder/live/api/constants/ConstantsFinderLive$LiveCardState;)V"
                java.lang.String r27 = "android/view/View_EXEC_"
                java.lang.String r28 = "setVisibility"
                java.lang.String r29 = "(I)V"
                j20.C117292a.m165359e(r23, r24, r25, r26, r27, r28, r29)
            L_0x00f9:
                di3.d r2 = di3.C86312j.m106911c(r4)
                gy3.C87412m.m108593f(r2, r15)
                r16 = r2
                ht1.t1 r16 = (ht1.C60200t1) r16
                java.lang.String r2 = r1.f165191a
                android.widget.ImageView r18 = r0.getFinderThumb()
                java.lang.String r1 = r1.f165192b
                r20 = 0
                r21 = 8
                r22 = 0
                r17 = r2
                r19 = r1
                ht1.C60200t1.C60201a.m70368f(r16, r17, r18, r19, r20, r21, r22)
                android.widget.ImageView r1 = r0.getFinderThumb()
                if (r1 != 0) goto L_0x0120
                goto L_0x0123
            L_0x0120:
                r1.setVisibility(r7)
            L_0x0123:
                android.view.View r1 = r0.getFinderOlympicView()
                if (r1 != 0) goto L_0x012a
                goto L_0x0168
            L_0x012a:
                k20.a r2 = new k20.a
                r2.<init>()
                java.lang.ThreadLocal<k20.a> r4 = k20.C60958c.f173611a
                r2.mo10233c(r3)
                java.lang.Object[] r16 = r2.mo10232b()
                java.lang.String r17 = "com/tencent/mm/ui/chatting/viewitems/ChatingItemAppMsgFinderLiveFeed$Companion"
                java.lang.String r18 = "updateLiveTag$showEndTag"
                java.lang.String r19 = "(Lcom/tencent/mm/protocal/protobuf/FinderGetLiveInfoResp;Lcom/tencent/mm/protocal/protobuf/FinderLiveShareObject;Lcom/tencent/mm/ui/chatting/viewitems/ChatingItemAppMsgFinderLiveFeed$AppMsgFinderLiveFeedHolder;Lcom/tencent/plugin/finder/live/api/constants/ConstantsFinderLive$LiveCardState;)V"
                java.lang.String r20 = "android/view/View_EXEC_"
                java.lang.String r21 = "setVisibility"
                java.lang.String r22 = "(I)V"
                r15 = r1
                j20.C117292a.m165358d(r15, r16, r17, r18, r19, r20, r21, r22)
                java.lang.Object r2 = r2.mo10231a(r7)
                java.lang.Integer r2 = (java.lang.Integer) r2
                int r2 = r2.intValue()
                r1.setVisibility(r2)
                java.lang.String r16 = "com/tencent/mm/ui/chatting/viewitems/ChatingItemAppMsgFinderLiveFeed$Companion"
                java.lang.String r17 = "updateLiveTag$showEndTag"
                java.lang.String r18 = "(Lcom/tencent/mm/protocal/protobuf/FinderGetLiveInfoResp;Lcom/tencent/mm/protocal/protobuf/FinderLiveShareObject;Lcom/tencent/mm/ui/chatting/viewitems/ChatingItemAppMsgFinderLiveFeed$AppMsgFinderLiveFeedHolder;Lcom/tencent/plugin/finder/live/api/constants/ConstantsFinderLive$LiveCardState;)V"
                java.lang.String r19 = "android/view/View_EXEC_"
                java.lang.String r20 = "setVisibility"
                java.lang.String r21 = "(I)V"
                j20.C117292a.m165359e(r15, r16, r17, r18, r19, r20, r21)
            L_0x0168:
                android.widget.ImageView r1 = r0.getActivityInfoIcon()
                if (r1 != 0) goto L_0x016f
                goto L_0x0172
            L_0x016f:
                r1.setVisibility(r14)
            L_0x0172:
                android.widget.TextView r1 = r0.getReasonTv()
                if (r1 != 0) goto L_0x0179
                goto L_0x017c
            L_0x0179:
                r1.setVisibility(r14)
            L_0x017c:
                android.widget.TextView r1 = r0.getFinderBansTv()
                if (r1 != 0) goto L_0x0183
                goto L_0x0186
            L_0x0183:
                r1.setVisibility(r14)
            L_0x0186:
                di3.d r1 = di3.C86312j.m106911c(r5)
                gy3.C87412m.m108593f(r1, r9)
                r9 = r1
                ir.n r9 = (p565ir.C60606n) r9
                android.view.View r10 = r0.getLiveEndTag()
                r12 = 0
                r0 = 4
                r14 = 0
                r6 = 1
                r13 = r0
                p565ir.C60606n.C60607a.m70861e(r9, r10, r11, r12, r13, r14)
                goto L_0x02c1
            L_0x019e:
                android.view.View r10 = r0.getLiveTag()
                if (r10 != 0) goto L_0x01a5
                goto L_0x01e4
            L_0x01a5:
                k20.a r12 = new k20.a
                r12.<init>()
                java.lang.ThreadLocal<k20.a> r13 = k20.C60958c.f173611a
                r12.mo10233c(r8)
                java.lang.Object[] r17 = r12.mo10232b()
                java.lang.String r18 = "com/tencent/mm/ui/chatting/viewitems/ChatingItemAppMsgFinderLiveFeed$Companion"
                java.lang.String r19 = "updateLiveTag$showLiveTag"
                java.lang.String r20 = "(Lcom/tencent/mm/protocal/protobuf/FinderLiveInfo;Lcom/tencent/mm/protocal/protobuf/FinderGetLiveInfoResp;Lcom/tencent/mm/protocal/protobuf/FinderLiveShareObject;Lcom/tencent/mm/ui/chatting/viewitems/ChatingItemAppMsgFinderLiveFeed$AppMsgFinderLiveFeedHolder;Lcom/tencent/plugin/finder/live/api/constants/ConstantsFinderLive$LiveCardState;)V"
                java.lang.String r21 = "android/view/View_EXEC_"
                java.lang.String r22 = "setVisibility"
                java.lang.String r23 = "(I)V"
                r16 = r10
                j20.C117292a.m165358d(r16, r17, r18, r19, r20, r21, r22, r23)
                java.lang.Object r8 = r12.mo10231a(r7)
                java.lang.Integer r8 = (java.lang.Integer) r8
                int r8 = r8.intValue()
                r10.setVisibility(r8)
                java.lang.String r17 = "com/tencent/mm/ui/chatting/viewitems/ChatingItemAppMsgFinderLiveFeed$Companion"
                java.lang.String r18 = "updateLiveTag$showLiveTag"
                java.lang.String r19 = "(Lcom/tencent/mm/protocal/protobuf/FinderLiveInfo;Lcom/tencent/mm/protocal/protobuf/FinderGetLiveInfoResp;Lcom/tencent/mm/protocal/protobuf/FinderLiveShareObject;Lcom/tencent/mm/ui/chatting/viewitems/ChatingItemAppMsgFinderLiveFeed$AppMsgFinderLiveFeedHolder;Lcom/tencent/plugin/finder/live/api/constants/ConstantsFinderLive$LiveCardState;)V"
                java.lang.String r20 = "android/view/View_EXEC_"
                java.lang.String r21 = "setVisibility"
                java.lang.String r22 = "(I)V"
                j20.C117292a.m165359e(r16, r17, r18, r19, r20, r21, r22)
            L_0x01e4:
                android.view.View r8 = r0.getLiveEndTag()
                if (r8 != 0) goto L_0x01eb
                goto L_0x022e
            L_0x01eb:
                k20.a r10 = new k20.a
                r10.<init>()
                java.lang.ThreadLocal<k20.a> r12 = k20.C60958c.f173611a
                java.lang.Integer r12 = java.lang.Integer.valueOf(r14)
                r10.mo10233c(r12)
                java.lang.Object[] r24 = r10.mo10232b()
                java.lang.String r25 = "com/tencent/mm/ui/chatting/viewitems/ChatingItemAppMsgFinderLiveFeed$Companion"
                java.lang.String r26 = "updateLiveTag$showLiveTag"
                java.lang.String r27 = "(Lcom/tencent/mm/protocal/protobuf/FinderLiveInfo;Lcom/tencent/mm/protocal/protobuf/FinderGetLiveInfoResp;Lcom/tencent/mm/protocal/protobuf/FinderLiveShareObject;Lcom/tencent/mm/ui/chatting/viewitems/ChatingItemAppMsgFinderLiveFeed$AppMsgFinderLiveFeedHolder;Lcom/tencent/plugin/finder/live/api/constants/ConstantsFinderLive$LiveCardState;)V"
                java.lang.String r28 = "android/view/View_EXEC_"
                java.lang.String r29 = "setVisibility"
                java.lang.String r30 = "(I)V"
                r23 = r8
                j20.C117292a.m165358d(r23, r24, r25, r26, r27, r28, r29, r30)
                java.lang.Object r10 = r10.mo10231a(r7)
                java.lang.Integer r10 = (java.lang.Integer) r10
                int r10 = r10.intValue()
                r8.setVisibility(r10)
                java.lang.String r24 = "com/tencent/mm/ui/chatting/viewitems/ChatingItemAppMsgFinderLiveFeed$Companion"
                java.lang.String r25 = "updateLiveTag$showLiveTag"
                java.lang.String r26 = "(Lcom/tencent/mm/protocal/protobuf/FinderLiveInfo;Lcom/tencent/mm/protocal/protobuf/FinderGetLiveInfoResp;Lcom/tencent/mm/protocal/protobuf/FinderLiveShareObject;Lcom/tencent/mm/ui/chatting/viewitems/ChatingItemAppMsgFinderLiveFeed$AppMsgFinderLiveFeedHolder;Lcom/tencent/plugin/finder/live/api/constants/ConstantsFinderLive$LiveCardState;)V"
                java.lang.String r27 = "android/view/View_EXEC_"
                java.lang.String r28 = "setVisibility"
                java.lang.String r29 = "(I)V"
                j20.C117292a.m165359e(r23, r24, r25, r26, r27, r28, r29)
            L_0x022e:
                di3.d r5 = di3.C86312j.m106911c(r5)
                gy3.C87412m.m108593f(r5, r9)
                r9 = r5
                ir.n r9 = (p565ir.C60606n) r9
                android.view.View r10 = r0.getLiveTag()
                r12 = 0
                r13 = 4
                r5 = 0
                r8 = 8
                r14 = r5
                p565ir.C60606n.C60607a.m70861e(r9, r10, r11, r12, r13, r14)
                if (r2 == 0) goto L_0x0251
                te3.ix0 r5 = r2.f182386Y
                if (r5 == 0) goto L_0x0251
                int r5 = r5.f183745d
                if (r5 != r6) goto L_0x0251
                r13 = 1
                goto L_0x0252
            L_0x0251:
                r13 = 0
            L_0x0252:
                if (r13 != 0) goto L_0x0283
                com.tencent.mm.ui.chatting.viewitems.ChatingItemAppMsgFinderLiveFeed$d$e r1 = m66469n(r3, r1)
                di3.d r2 = di3.C86312j.m106911c(r4)
                gy3.C87412m.m108593f(r2, r15)
                r16 = r2
                ht1.t1 r16 = (ht1.C60200t1) r16
                java.lang.String r2 = r1.f165191a
                android.widget.ImageView r18 = r0.getFinderThumb()
                java.lang.String r1 = r1.f165192b
                r20 = 0
                r21 = 8
                r22 = 0
                r17 = r2
                r19 = r1
                ht1.C60200t1.C60201a.m70369g(r16, r17, r18, r19, r20, r21, r22)
                android.widget.TextView r0 = r0.getFinderBansTv()
                if (r0 != 0) goto L_0x027f
                goto L_0x02c1
            L_0x027f:
                r0.setVisibility(r8)
                goto L_0x02c1
            L_0x0283:
                com.tencent.mm.ui.chatting.viewitems.ChatingItemAppMsgFinderLiveFeed$d$e r1 = m66469n(r3, r1)
                di3.d r3 = di3.C86312j.m106911c(r4)
                gy3.C87412m.m108593f(r3, r15)
                r8 = r3
                ht1.t1 r8 = (ht1.C60200t1) r8
                java.lang.String r9 = r1.f165191a
                android.widget.ImageView r10 = r0.getFinderThumb()
                java.lang.String r11 = r1.f165192b
                r12 = 0
                r13 = 8
                r14 = 0
                ht1.C60200t1.C60201a.m70366d(r8, r9, r10, r11, r12, r13, r14)
                android.widget.TextView r1 = r0.getFinderBansTv()
                if (r1 != 0) goto L_0x02a7
                goto L_0x02b7
            L_0x02a7:
                if (r2 == 0) goto L_0x02b2
                te3.ix0 r2 = r2.f182386Y
                if (r2 == 0) goto L_0x02b2
                java.lang.String r2 = r2.f183746e
                if (r2 == 0) goto L_0x02b2
                goto L_0x02b4
            L_0x02b2:
                java.lang.String r2 = ""
            L_0x02b4:
                r1.setText(r2)
            L_0x02b7:
                android.widget.TextView r0 = r0.getFinderBansTv()
                if (r0 != 0) goto L_0x02be
                goto L_0x02c1
            L_0x02be:
                r0.setVisibility(r7)
            L_0x02c1:
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.chatting.viewitems.ChatingItemAppMsgFinderLiveFeed.C57713d.mo82130m(ck3.b, com.tencent.mm.ui.chatting.viewitems.i$c, te3.p81, te3.c21, te3.vn0):boolean");
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.viewitems.ChatingItemAppMsgFinderLiveFeed$e */
    public static final class C57719e implements C72963f4.C72966d<C57719e> {

        /* renamed from: b */
        public final C72963f4 f165193b;

        /* renamed from: c */
        public C61161k f165194c;

        /* renamed from: d */
        public C61161k f165195d;

        /* renamed from: e */
        public boolean f165196e;

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: com.tencent.mm.message.l$b} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: com.tencent.mm.message.l$b} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v11, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v12, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v16, resolved type: com.tencent.mm.message.l$b} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v17, resolved type: java.lang.String} */
        /* JADX WARNING: type inference failed for: r1v18 */
        /* JADX WARNING: Failed to insert additional move for type inference */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public C57719e(com.tencent.p014mm.storage.C72963f4 r4) {
            /*
                r3 = this;
                java.lang.Class<ir.n> r0 = p565ir.C60606n.class
                r3.<init>()
                r3.f165193b = r4
                ks3.k r1 = ks3.C61161k.Living
                r3.f165194c = r1
                r3.f165195d = r1
                r1 = 0
                if (r4 == 0) goto L_0x0015
                java.lang.String r2 = r4.getContent()
                goto L_0x0016
            L_0x0015:
                r2 = r1
            L_0x0016:
                if (r2 == 0) goto L_0x0026
                if (r4 == 0) goto L_0x001e
                java.lang.String r1 = r4.mo108775z2()
            L_0x001e:
                if (r1 != 0) goto L_0x0022
                java.lang.String r1 = ""
            L_0x0022:
                com.tencent.mm.message.l$b r1 = com.tencent.p014mm.message.C68070l.C68072b.m80422u(r2, r1)
            L_0x0026:
                if (r1 == 0) goto L_0x0073
                java.lang.Class<ht1.b> r4 = ht1.C60151b.class
                com.tencent.mm.message.g r4 = r1.mo93555w(r4)
                ht1.b r4 = (ht1.C60151b) r4
                te3.p81 r4 = r4.f171698b
                di3.d r1 = di3.C86312j.m106911c(r0)
                ir.n r1 = (p565ir.C60606n) r1
                r2 = 0
                ks3.k r1 = r1.mo85062iC(r4, r2)
                r3.f165194c = r1
                di3.d r0 = di3.C86312j.m106911c(r0)
                ir.n r0 = (p565ir.C60606n) r0
                r1 = 1
                ks3.k r4 = r0.mo85062iC(r4, r1)
                r3.f165195d = r4
                com.tencent.mm.ui.chatting.viewitems.ChatingItemAppMsgFinderLiveFeed$d r4 = com.tencent.p014mm.p136ui.chatting.viewitems.ChatingItemAppMsgFinderLiveFeed.f165161a
                r4.getClass()
                java.lang.String r4 = com.tencent.p014mm.p136ui.chatting.viewitems.ChatingItemAppMsgFinderLiveFeed.f165162b
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "localLiveState:"
                r0.append(r1)
                ks3.k r1 = r3.f165194c
                r0.append(r1)
                java.lang.String r1 = ", cacheLiveState:"
                r0.append(r1)
                ks3.k r1 = r3.f165195d
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r0)
            L_0x0073:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.chatting.viewitems.ChatingItemAppMsgFinderLiveFeed.C57719e.<init>(com.tencent.mm.storage.f4):void");
        }

        /* renamed from: a */
        public boolean mo82132a(Object obj) {
            C61161k kVar;
            C57719e eVar = (C57719e) obj;
            if (this.f165193b == null) {
                return false;
            }
            if ((eVar != null ? eVar.f165193b : null) == null) {
                return false;
            }
            ChatingItemAppMsgFinderLiveFeed.f165161a.getClass();
            String str = ChatingItemAppMsgFinderLiveFeed.f165162b;
            Log.m105924i(str, "needInvalidate:" + this.f165196e + ", old.localLiveState:" + this.f165194c + ", new.localLiveState:" + eVar.f165194c + ", new.cacheLiveState:" + eVar.f165195d);
            return this.f165196e || ((kVar = eVar.f165195d) == eVar.f165194c && kVar == this.f165194c);
        }
    }
}
