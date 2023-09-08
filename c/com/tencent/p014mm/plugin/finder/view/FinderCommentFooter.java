package com.tencent.p014mm.plugin.finder.view;

import android.animation.Animator;
import android.content.Context;
import android.text.Editable;
import android.text.InputFilter;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import bl3.C39818r;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.api.SmileyPanel;
import com.tencent.p014mm.p136ui.C74942w4;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.MMFragmentActivity;
import com.tencent.p014mm.p136ui.tools.C45078p0;
import com.tencent.p014mm.p136ui.tools.C7020t0;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.plugin.finder.p056ui.p799at.FinderAtSomeoneDialog;
import com.tencent.p014mm.plugin.finder.view.emoji.FinderEmojiPickView;
import com.tencent.p014mm.pluginsdk.p133ui.ChatFooterPanel;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.KeyBoardUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.smiley.C72953u;
import com.tencent.p014mm.storage.C72994y1;
import cq1.C57962a;
import cq1.C7125l;
import di3.C86312j;
import ds1.C7515a;
import eb0.C75592q0;
import er1.C58784w3;
import fe1.C58961d;
import fe1.C58969q;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import ht1.C60200t1;
import j20.C117292a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import k20.C60958c;
import k20.C9556a;
import k60.C60979d;
import kg3.C76577a;
import kotlin.Metadata;
import nj3.C76912y0;
import o40.C61926c;
import p248ug.C78160t0;
import p629ny.C76979h;
import pl1.C100810g0;
import pl1.C11978e0;
import pl1.C11990s0;
import pl1.C62345f;
import qn3.C77382c;
import rx3.C13598b0;
import sx3.C110823p;
import sx3.C64186f0;
import sx3.C64197v;
import tl3.C78039a;
import up1.C27696y;
import up1.C37521f;
import ve1.C65604i;
import vl3.C102226d;
import wq3.C111847h;
import y04.C66483g;
import z04.C112550d0;
import z04.C66716g;
import z04.C66723k;
import zc1.C66785b;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000¤\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u0007\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0002Ê\u0001B#\b\u0016\u0012\n\u0010Å\u0001\u001a\u0005\u0018\u00010Ä\u0001\u0012\n\u0010Ç\u0001\u001a\u0005\u0018\u00010Æ\u0001¢\u0006\u0006\bÈ\u0001\u0010É\u0001J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016J\u0010\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\bH\u0016J\u0006\u0010\u000e\u001a\u00020\rJ\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fR\"\u0010\u0018\u001a\u00020\r8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\"\u0010 \u001a\u00020\u00198\u0006@\u0006X.¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\"\u0010(\u001a\u00020!8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\"\u0010,\u001a\u00020\u00198\u0006@\u0006X.¢\u0006\u0012\n\u0004\b)\u0010\u001b\u001a\u0004\b*\u0010\u001d\"\u0004\b+\u0010\u001fR\"\u00104\u001a\u00020-8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\"\u0010<\u001a\u0002058\u0006@\u0006X.¢\u0006\u0012\n\u0004\b6\u00107\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R\"\u0010@\u001a\u00020\r8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b=\u0010\u0013\u001a\u0004\b>\u0010\u0015\"\u0004\b?\u0010\u0017R\"\u0010H\u001a\u00020A8\u0006@\u0006X.¢\u0006\u0012\n\u0004\bB\u0010C\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR\"\u0010L\u001a\u00020!8\u0006@\u0006X.¢\u0006\u0012\n\u0004\bI\u0010#\u001a\u0004\bJ\u0010%\"\u0004\bK\u0010'R\"\u0010P\u001a\u00020!8\u0006@\u0006X.¢\u0006\u0012\n\u0004\bM\u0010#\u001a\u0004\bN\u0010%\"\u0004\bO\u0010'R$\u0010X\u001a\u0004\u0018\u00010Q8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bR\u0010S\u001a\u0004\bT\u0010U\"\u0004\bV\u0010WR\"\u0010\\\u001a\u00020\r8\u0006@\u0006X.¢\u0006\u0012\n\u0004\bY\u0010\u0013\u001a\u0004\bZ\u0010\u0015\"\u0004\b[\u0010\u0017R\"\u0010d\u001a\u00020]8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b^\u0010_\u001a\u0004\b`\u0010a\"\u0004\bb\u0010cR\"\u0010l\u001a\u00020e8\u0006@\u0006X.¢\u0006\u0012\n\u0004\bf\u0010g\u001a\u0004\bh\u0010i\"\u0004\bj\u0010kR\"\u0010s\u001a\u00020\b8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bm\u0010n\u001a\u0004\bo\u0010p\"\u0004\bq\u0010rR\"\u0010w\u001a\u00020\b8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bt\u0010n\u001a\u0004\bu\u0010p\"\u0004\bv\u0010rR$\u0010~\u001a\u00020x2\u0006\u0010y\u001a\u00020x8\u0002@BX\u000e¢\u0006\f\n\u0004\bz\u0010{\"\u0004\b|\u0010}R(\u0010\u0001\u001a\u00020\u00048\u0006@\u0006X\u000e¢\u0006\u0017\n\u0005\b\u0010\u0001\u001a\u0006\b\u0001\u0010\u0001\"\u0006\b\u0001\u0010\u0001R1\u0010\u0001\u001a\u00020\u00042\u0006\u0010y\u001a\u00020\u00048\u0006@FX\u000e¢\u0006\u0018\n\u0006\b\u0001\u0010\u0001\u001a\u0006\b\u0001\u0010\u0001\"\u0006\b\u0001\u0010\u0001R,\u0010\u0001\u001a\u0005\u0018\u00010\u00018\u0006@\u0006X\u000e¢\u0006\u0018\n\u0006\b\u0001\u0010\u0001\u001a\u0006\b\u0001\u0010\u0001\"\u0006\b\u0001\u0010\u0001R2\u0010\u0001\u001a\u000b\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00018\u0006@\u0006X\u000e¢\u0006\u0018\n\u0006\b\u0001\u0010\u0001\u001a\u0006\b\u0001\u0010\u0001\"\u0006\b\u0001\u0010\u0001R2\u0010\u0001\u001a\u000b\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00018\u0006@\u0006X\u000e¢\u0006\u0018\n\u0006\b\u0001\u0010\u0001\u001a\u0006\b\u0001\u0010\u0001\"\u0006\b\u0001\u0010\u0001R%\u0010\u0001\u001a\u00020\b8\u0006@\u0006X\u000e¢\u0006\u0014\n\u0004\b{\u0010n\u001a\u0005\b\u0001\u0010p\"\u0005\b\u0001\u0010rR)\u0010¢\u0001\u001a\u00020\u00048\u0006@\u0006X\u000e¢\u0006\u0018\n\u0006\b\u0001\u0010\u0001\u001a\u0006\b \u0001\u0010\u0001\"\u0006\b¡\u0001\u0010\u0001R.\u0010¦\u0001\u001a\u00020\b2\u0006\u0010y\u001a\u00020\b8\u0006@FX\u000e¢\u0006\u0015\n\u0005\b£\u0001\u0010n\u001a\u0005\b¤\u0001\u0010p\"\u0005\b¥\u0001\u0010rR(\u0010§\u0001\u001a\u00020\u00048\u0006@\u0006X\u000e¢\u0006\u0017\n\u0005\bn\u0010\u0001\u001a\u0006\b§\u0001\u0010\u0001\"\u0006\b¨\u0001\u0010\u0001R)\u0010¬\u0001\u001a\u00020\u00048\u0006@\u0006X\u000e¢\u0006\u0018\n\u0006\b©\u0001\u0010\u0001\u001a\u0006\bª\u0001\u0010\u0001\"\u0006\b«\u0001\u0010\u0001R.\u0010°\u0001\u001a\u00020\b2\u0006\u0010y\u001a\u00020\b8\u0006@FX\u000e¢\u0006\u0015\n\u0005\b­\u0001\u0010n\u001a\u0005\b®\u0001\u0010p\"\u0005\b¯\u0001\u0010rR*\u0010¸\u0001\u001a\u00030±\u00018\u0006@\u0006X\u000e¢\u0006\u0018\n\u0006\b²\u0001\u0010³\u0001\u001a\u0006\b´\u0001\u0010µ\u0001\"\u0006\b¶\u0001\u0010·\u0001R*\u0010¼\u0001\u001a\u00030±\u00018\u0006@\u0006X\u000e¢\u0006\u0018\n\u0006\b¹\u0001\u0010³\u0001\u001a\u0006\bº\u0001\u0010µ\u0001\"\u0006\b»\u0001\u0010·\u0001R+\u0010Ã\u0001\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u0018\n\u0006\b½\u0001\u0010¾\u0001\u001a\u0006\b¿\u0001\u0010À\u0001\"\u0006\bÁ\u0001\u0010Â\u0001¨\u0006Ë\u0001"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/view/FinderCommentFooter;", "Landroid/widget/LinearLayout;", "Lcom/tencent/mm/ui/tools/t0;", "", "", "isShowSmiley", "Lrx3/b0;", "setSmileyIcon", "", "resid", "setBackgroundResource", "color", "setBackgroundColor", "Landroid/widget/ImageView;", "getAvatarView", "", "Lcom/tencent/mm/plugin/finder/view/v7;", "getMentionListWhenReply", "d", "Landroid/widget/ImageView;", "getSwitchSceneAvatar", "()Landroid/widget/ImageView;", "setSwitchSceneAvatar", "(Landroid/widget/ImageView;)V", "switchSceneAvatar", "Landroid/widget/TextView;", "e", "Landroid/widget/TextView;", "getSwitchSceneName", "()Landroid/widget/TextView;", "setSwitchSceneName", "(Landroid/widget/TextView;)V", "switchSceneName", "Landroid/view/View;", "f", "Landroid/view/View;", "getSwitchSceneTip", "()Landroid/view/View;", "setSwitchSceneTip", "(Landroid/view/View;)V", "switchSceneTip", "g", "getSwitchSceneTipTv", "setSwitchSceneTipTv", "switchSceneTipTv", "Lcom/tencent/mm/api/SmileyPanel;", "h", "Lcom/tencent/mm/api/SmileyPanel;", "getSmileyPanel", "()Lcom/tencent/mm/api/SmileyPanel;", "setSmileyPanel", "(Lcom/tencent/mm/api/SmileyPanel;)V", "smileyPanel", "Lcom/tencent/mm/ui/widget/imageview/WeImageView;", "i", "Lcom/tencent/mm/ui/widget/imageview/WeImageView;", "getSmileyBtn", "()Lcom/tencent/mm/ui/widget/imageview/WeImageView;", "setSmileyBtn", "(Lcom/tencent/mm/ui/widget/imageview/WeImageView;)V", "smileyBtn", "j", "getMentionBtn", "setMentionBtn", "mentionBtn", "Lcom/tencent/mm/plugin/finder/view/FinderCommentEditText;", "n", "Lcom/tencent/mm/plugin/finder/view/FinderCommentEditText;", "getEditText", "()Lcom/tencent/mm/plugin/finder/view/FinderCommentEditText;", "setEditText", "(Lcom/tencent/mm/plugin/finder/view/FinderCommentEditText;)V", "editText", "o", "getReplyBtn", "setReplyBtn", "replyBtn", "p", "getCommentEditTextLayout", "setCommentEditTextLayout", "commentEditTextLayout", "Landroid/view/ViewGroup;", "q", "Landroid/view/ViewGroup;", "getCommentEditTextContainer", "()Landroid/view/ViewGroup;", "setCommentEditTextContainer", "(Landroid/view/ViewGroup;)V", "commentEditTextContainer", "r", "getTargetAvatar", "setTargetAvatar", "targetAvatar", "Lcom/tencent/mm/plugin/finder/view/emoji/FinderEmojiPickView;", "s", "Lcom/tencent/mm/plugin/finder/view/emoji/FinderEmojiPickView;", "getQuickPickEmoji", "()Lcom/tencent/mm/plugin/finder/view/emoji/FinderEmojiPickView;", "setQuickPickEmoji", "(Lcom/tencent/mm/plugin/finder/view/emoji/FinderEmojiPickView;)V", "quickPickEmoji", "Landroid/widget/FrameLayout;", "t", "Landroid/widget/FrameLayout;", "getSmileyContainer", "()Landroid/widget/FrameLayout;", "setSmileyContainer", "(Landroid/widget/FrameLayout;)V", "smileyContainer", "u", "I", "getCommentTextLimit", "()I", "setCommentTextLimit", "(I)V", "commentTextLimit", "v", "getCommentTextLineLimit", "setCommentTextLineLimit", "commentTextLineLimit", "", "value", "w", "F", "setSmileyPanelHeight", "(F)V", "smileyPanelHeight", "A", "Z", "isFrozen", "()Z", "setFrozen", "(Z)V", "B", "isHideFooterAtModeDefault", "setHideFooterAtModeDefault", "Lcom/tencent/mm/plugin/finder/view/FinderCommentFooter$a;", "C", "Lcom/tencent/mm/plugin/finder/view/FinderCommentFooter$a;", "getModeChangeCallback", "()Lcom/tencent/mm/plugin/finder/view/FinderCommentFooter$a;", "setModeChangeCallback", "(Lcom/tencent/mm/plugin/finder/view/FinderCommentFooter$a;)V", "modeChangeCallback", "Lkotlin/Function0;", "D", "Lfy3/a;", "getBackClickListener", "()Lfy3/a;", "setBackClickListener", "(Lfy3/a;)V", "backClickListener", "E", "getSwitchSceneListener", "setSwitchSceneListener", "switchSceneListener", "getReplyBtnWidth", "setReplyBtnWidth", "replyBtnWidth", "G", "getSendBtnEnabled", "setSendBtnEnabled", "sendBtnEnabled", "H", "getScene", "setScene", "scene", "isSelfProfile", "setSelfProfile", "J", "getBanSwitchScene", "setBanSwitchScene", "banSwitchScene", "L", "getFooterMode", "setFooterMode", "footerMode", "", "M", "Ljava/lang/String;", "getLastFromName", "()Ljava/lang/String;", "setLastFromName", "(Ljava/lang/String;)V", "lastFromName", "N", "getLastActionStr", "setLastActionStr", "lastActionStr", "P", "Ljava/lang/Object;", "getLastTag", "()Ljava/lang/Object;", "setLastTag", "(Ljava/lang/Object;)V", "lastTag", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "a", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.view.FinderCommentFooter */
public final class FinderCommentFooter extends LinearLayout implements C7020t0, C111847h {

    /* renamed from: Q */
    public static final /* synthetic */ int f162048Q = 0;

    /* renamed from: A */
    public boolean f162049A;

    /* renamed from: B */
    public boolean f162050B;

    /* renamed from: C */
    public C56552a f162051C;

    /* renamed from: D */
    public C32224a<C13598b0> f162052D;

    /* renamed from: E */
    public C32224a<C13598b0> f162053E;

    /* renamed from: F */
    public int f162054F = C74942w4.m89786c(getContext(), C0966R.dimen.f3758d_);

    /* renamed from: G */
    public boolean f162055G;

    /* renamed from: H */
    public int f162056H = 2;

    /* renamed from: I */
    public boolean f162057I;

    /* renamed from: J */
    public boolean f162058J;

    /* renamed from: K */
    public ArrayList<C41598v7> f162059K = new ArrayList<>();

    /* renamed from: L */
    public int f162060L;

    /* renamed from: M */
    public String f162061M = "";

    /* renamed from: N */
    public String f162062N = "";

    /* renamed from: P */
    public Object f162063P;

    /* renamed from: d */
    public ImageView f162064d;

    /* renamed from: e */
    public TextView f162065e;

    /* renamed from: f */
    public View f162066f;

    /* renamed from: g */
    public TextView f162067g;

    /* renamed from: h */
    public SmileyPanel f162068h;

    /* renamed from: i */
    public WeImageView f162069i;

    /* renamed from: j */
    public ImageView f162070j;

    /* renamed from: n */
    public FinderCommentEditText f162071n;

    /* renamed from: o */
    public View f162072o;

    /* renamed from: p */
    public View f162073p;

    /* renamed from: q */
    public ViewGroup f162074q;

    /* renamed from: r */
    public ImageView f162075r;

    /* renamed from: s */
    public FinderEmojiPickView f162076s;

    /* renamed from: t */
    public FrameLayout f162077t;

    /* renamed from: u */
    public int f162078u;

    /* renamed from: v */
    public int f162079v = 10;

    /* renamed from: w */
    public float f162080w = ((float) KeyBoardUtil.getKeyBordHeightPx(getContext()));

    /* renamed from: x */
    public float f162081x = ((float) KeyBoardUtil.getKeyBordHeightPx(getContext()));

    /* renamed from: y */
    public float f162082y = ((float) C76577a.m92151b(getContext(), 56));

    /* renamed from: z */
    public boolean f162083z;

    /* renamed from: com.tencent.mm.plugin.finder.view.FinderCommentFooter$b */
    public static final class C41552b implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ FinderCommentFooter f111865d;

        public C41552b(FinderCommentFooter finderCommentFooter) {
            this.f111865d = finderCommentFooter;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/view/FinderCommentFooter$onFinishInflate$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C87412m.m108592e(view, "null cannot be cast to non-null type android.widget.ImageView");
            Object tag = ((ImageView) view).getTag();
            C87412m.m108592e(tag, "null cannot be cast to non-null type kotlin.Boolean");
            FinderCommentFooter.m65200c(this.f111865d, !((Boolean) tag).booleanValue());
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/view/FinderCommentFooter$onFinishInflate$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.view.FinderCommentFooter$c */
    public static final class C41553c implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ FinderCommentFooter f111866d;

        /* renamed from: com.tencent.mm.plugin.finder.view.FinderCommentFooter$c$a */
        public static final class C41554a implements C57962a {

            /* renamed from: a */
            public final /* synthetic */ FinderCommentFooter f111867a;

            public C41554a(FinderCommentFooter finderCommentFooter) {
                this.f111867a = finderCommentFooter;
            }

            /* renamed from: a */
            public void mo64632a(String str, String str2) {
                C87412m.m108594g(str, "displayName");
                C87412m.m108594g(str2, "username");
                FinderCommentFooter finderCommentFooter = this.f111867a;
                int i = FinderCommentFooter.f162048Q;
                String obj = finderCommentFooter.getEditText().getText().toString();
                int selectionEnd = finderCommentFooter.getEditText().getSelectionEnd();
                int length = obj.length();
                if (selectionEnd > length) {
                    selectionEnd = length;
                }
                int i2 = selectionEnd - 1;
                if (i2 < 0) {
                    i2 = 0;
                }
                String str3 = "@";
                if (C87412m.m108589b(obj.subSequence(i2, selectionEnd).toString(), str3)) {
                    str3 = "";
                }
                long length2 = (long) (str.length() + 2);
                if (selectionEnd > obj.length()) {
                    selectionEnd = obj.length();
                }
                StringBuilder sb = new StringBuilder();
                String substring = obj.substring(0, selectionEnd);
                C87412m.m108593f(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                sb.append(substring);
                sb.append(str3);
                sb.append(str);
                sb.append(8197);
                String substring2 = obj.substring(selectionEnd, obj.length());
                C87412m.m108593f(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
                sb.append(substring2);
                finderCommentFooter.getEditText().setText(((C76979h) C86312j.m106911c(C76979h.class)).mo107057T1(finderCommentFooter.getContext(), sb.toString()));
                finderCommentFooter.getEditText().setSelection(selectionEnd + str3.length() + str.length() + 1);
                finderCommentFooter.getEditText().postDelayed(new C41595m1(finderCommentFooter), 200);
                finderCommentFooter.f162059K.add(new C41598v7(str2, str, -1, length2));
            }
        }

        public C41553c(FinderCommentFooter finderCommentFooter) {
            this.f111866d = finderCommentFooter;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/view/FinderCommentFooter$onFinishInflate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            Context context = this.f111866d.getContext();
            C87412m.m108593f(context, "context");
            Boolean bool = Boolean.FALSE;
            int i = FinderCommentFooter.f162048Q;
            new FinderAtSomeoneDialog(context, bool, C72994y1.C72995a.USERINFO_RECENT_AT_FINDER_COMMENT_GROUP_STRING_SYNC, new C41554a(this.f111866d)).show();
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/view/FinderCommentFooter$onFinishInflate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.view.FinderCommentFooter$d */
    public static final class C41555d implements TextWatcher {

        /* renamed from: d */
        public final /* synthetic */ FinderCommentFooter f111868d;

        /* renamed from: com.tencent.mm.plugin.finder.view.FinderCommentFooter$d$a */
        public static final class C41556a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ FinderCommentFooter f111869d;

            public C41556a(FinderCommentFooter finderCommentFooter) {
                this.f111869d = finderCommentFooter;
            }

            /* JADX WARNING: Removed duplicated region for block: B:16:0x003b  */
            /* JADX WARNING: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void run() {
                /*
                    r8 = this;
                    com.tencent.mm.plugin.finder.view.FinderCommentFooter r0 = r8.f111869d
                    com.tencent.mm.plugin.finder.view.FinderCommentEditText r1 = r0.getEditText()
                    android.text.Editable r1 = r1.getText()
                    r0.getClass()
                    r2 = 1
                    r3 = 0
                    if (r1 == 0) goto L_0x0019
                    int r4 = r1.length()
                    if (r4 <= 0) goto L_0x0019
                    r4 = 1
                    goto L_0x001a
                L_0x0019:
                    r4 = 0
                L_0x001a:
                    if (r4 == 0) goto L_0x0035
                    java.lang.String r1 = java.lang.String.valueOf(r1)
                    java.lang.CharSequence r1 = z04.C112550d0.m153799i0(r1)
                    java.lang.String r1 = r1.toString()
                    int r1 = r1.length()
                    if (r1 <= 0) goto L_0x0030
                    r1 = 1
                    goto L_0x0031
                L_0x0030:
                    r1 = 0
                L_0x0031:
                    if (r1 == 0) goto L_0x0035
                    r1 = 1
                    goto L_0x0036
                L_0x0035:
                    r1 = 0
                L_0x0036:
                    boolean r4 = r0.f162055G
                    if (r1 != r4) goto L_0x003b
                    goto L_0x008f
                L_0x003b:
                    r0.f162055G = r1
                    r4 = 150(0x96, double:7.4E-322)
                    r6 = 2
                    if (r1 == 0) goto L_0x0069
                    android.animation.ValueAnimator r1 = new android.animation.ValueAnimator
                    r1.<init>()
                    int[] r6 = new int[r6]
                    r6[r3] = r3
                    int r3 = r0.f162054F
                    r6[r2] = r3
                    r1.setIntValues(r6)
                    com.tencent.mm.plugin.finder.view.h1 r2 = new com.tencent.mm.plugin.finder.view.h1
                    r2.<init>(r0)
                    r1.addUpdateListener(r2)
                    r1.setDuration(r4)
                    com.tencent.mm.plugin.finder.view.i1 r2 = new com.tencent.mm.plugin.finder.view.i1
                    r2.<init>(r0)
                    r1.addListener(r2)
                    r1.start()
                    goto L_0x008f
                L_0x0069:
                    android.animation.ValueAnimator r1 = new android.animation.ValueAnimator
                    r1.<init>()
                    int[] r6 = new int[r6]
                    int r7 = r0.f162054F
                    r6[r3] = r7
                    r6[r2] = r3
                    r1.setIntValues(r6)
                    com.tencent.mm.plugin.finder.view.j1 r2 = new com.tencent.mm.plugin.finder.view.j1
                    r2.<init>(r0)
                    r1.addUpdateListener(r2)
                    r1.setDuration(r4)
                    com.tencent.mm.plugin.finder.view.k1 r2 = new com.tencent.mm.plugin.finder.view.k1
                    r2.<init>(r0)
                    r1.addListener(r2)
                    r1.start()
                L_0x008f:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.view.FinderCommentFooter.C41555d.C41556a.run():void");
            }
        }

        public C41555d(FinderCommentFooter finderCommentFooter) {
            this.f111868d = finderCommentFooter;
        }

        public void afterTextChanged(Editable editable) {
            this.f111868d.getEditText().postDelayed(new C41556a(this.f111868d), 160);
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            if (this.f111868d.getScene() == 2) {
                boolean z = true;
                if (i3 == 1) {
                    if ((charSequence != null ? charSequence.charAt(i) : ' ') == '@') {
                        this.f111868d.getClass();
                        C37521f.f99374d.getClass();
                        if (C37521f.f99171F6.mo60266n().intValue() != 1) {
                            z = false;
                        }
                        if (z) {
                            this.f111868d.getMentionBtn().performClick();
                        }
                    }
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.view.FinderCommentFooter$e */
    public static final class C41557e implements View.OnKeyListener {

        /* renamed from: d */
        public final /* synthetic */ FinderCommentFooter f111870d;

        public C41557e(FinderCommentFooter finderCommentFooter) {
            this.f111870d = finderCommentFooter;
        }

        public final boolean onKey(View view, int i, KeyEvent keyEvent) {
            CharSequence charSequence;
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            arrayList.add(Integer.valueOf(i));
            arrayList.add(keyEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/view/FinderCommentFooter$onFinishInflate$4", "android/view/View$OnKeyListener", "onKey", "(Landroid/view/View;ILandroid/view/KeyEvent;)Z", this, array);
            int i2 = 0;
            if (i == 67 && keyEvent.getAction() == 0) {
                int selectionEnd = this.f111870d.getEditText().getSelectionEnd();
                Editable text = this.f111870d.getEditText().getText();
                if (text != null) {
                    int i3 = selectionEnd - 1;
                    if (i3 < 0) {
                        i3 = 0;
                    }
                    charSequence = text.subSequence(i3, selectionEnd);
                } else {
                    charSequence = null;
                }
                if (C87412m.m108589b(String.valueOf(charSequence), " ")) {
                    CharSequence subSequence = text.subSequence(0, selectionEnd);
                    int length = subSequence.length() - 1;
                    while (true) {
                        if (-1 >= length) {
                            break;
                        } else if (subSequence.charAt(length) == '@') {
                            i2 = length;
                            break;
                        } else {
                            length--;
                        }
                    }
                    this.f111870d.getEditText().setText(this.f111870d.getEditText().getText().replace(i2, selectionEnd, ""));
                    this.f111870d.getEditText().setSelection(i2);
                    C117292a.m165362h(true, this, "com/tencent/mm/plugin/finder/view/FinderCommentFooter$onFinishInflate$4", "android/view/View$OnKeyListener", "onKey", "(Landroid/view/View;ILandroid/view/KeyEvent;)Z");
                    return true;
                }
            }
            C117292a.m165362h(false, this, "com/tencent/mm/plugin/finder/view/FinderCommentFooter$onFinishInflate$4", "android/view/View$OnKeyListener", "onKey", "(Landroid/view/View;ILandroid/view/KeyEvent;)Z");
            return false;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.view.FinderCommentFooter$g */
    public static final class C41558g implements InputFilter {

        /* renamed from: d */
        public final /* synthetic */ FinderCommentFooter f111871d;

        public C41558g(FinderCommentFooter finderCommentFooter) {
            this.f111871d = finderCommentFooter;
        }

        public CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
            C87412m.m108594g(charSequence, FirebaseAnalytics.C113379b.SOURCE);
            C87412m.m108594g(spanned, "dest");
            int i5 = 0;
            int i6 = 0;
            while (true) {
                boolean z = true;
                if (i5 >= spanned.length()) {
                    break;
                }
                if (spanned.charAt(i5) != 10) {
                    z = false;
                }
                if (z) {
                    i6++;
                }
                i5++;
            }
            int i7 = 0;
            for (int i8 = 0; i8 < charSequence.length(); i8++) {
                if (charSequence.charAt(i8) == 10) {
                    i7++;
                }
            }
            if (i7 + i6 < this.f111871d.getCommentTextLineLimit()) {
                return charSequence;
            }
            C76912y0.makeText(this.f111871d.getContext(), (CharSequence) this.f111871d.getContext().getResources().getString(C0966R.string.f8070dm), 0).show();
            int commentTextLineLimit = this.f111871d.getCommentTextLineLimit() - i6;
            Pattern pattern = C61926c.f176038a;
            int i9 = 0;
            int i15 = -1;
            int i16 = -1;
            while (i9 < commentTextLineLimit) {
                int D = C112550d0.m153768D(charSequence, 10, i15 + 1, false, 4, (Object) null);
                if (D == -1) {
                    break;
                }
                i9++;
                i16 = D;
                i15 = D + 1;
            }
            return i16 > 0 ? charSequence.subSequence(0, i16) : i16 == 0 ? "" : charSequence;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.view.FinderCommentFooter$h */
    public static final class C41559h implements ChatFooterPanel.C72719a {

        /* renamed from: a */
        public final /* synthetic */ FinderCommentFooter f111872a;

        public C41559h(FinderCommentFooter finderCommentFooter) {
            this.f111872a = finderCommentFooter;
        }

        /* renamed from: a */
        public void mo64626a() {
        }

        /* renamed from: b */
        public void mo64627b(String str) {
            this.f111872a.getEditText().append(C102226d.m134696a(this.f111872a.getContext(), str));
        }

        /* renamed from: c */
        public void mo64628c() {
            if (this.f111872a.getEditText().getInputConnection() != null) {
                this.f111872a.getEditText().getInputConnection().sendKeyEvent(new KeyEvent(0, 67));
                this.f111872a.getEditText().getInputConnection().sendKeyEvent(new KeyEvent(1, 67));
            }
        }

        /* renamed from: d */
        public void mo64629d(boolean z) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.view.FinderCommentFooter$o */
    public static final class C41560o implements View.OnClickListener {

        /* renamed from: d */
        public static final C41560o f111873d = new C41560o();

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/view/FinderCommentFooter$refreshSwitchSceneView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/view/FinderCommentFooter$refreshSwitchSceneView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.view.FinderCommentFooter$a */
    public interface C56552a {
        /* renamed from: e */
        void mo55509e(int i, int i2);
    }

    /* renamed from: com.tencent.mm.plugin.finder.view.FinderCommentFooter$f */
    public static final class C56553f extends C77382c {

        /* renamed from: com.tencent.mm.plugin.finder.view.FinderCommentFooter$f$a */
        public static final class C56554a extends C45078p0 {

            /* renamed from: f */
            public final /* synthetic */ int f162084f;

            /* renamed from: g */
            public final /* synthetic */ C56553f f162085g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C56554a(int i, C45078p0.C45079a aVar, C56553f fVar) {
                super(i, aVar);
                this.f162084f = i;
                this.f162085g = fVar;
            }

            public CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
                C87412m.m108594g(spanned, "dest");
                if (charSequence == null) {
                    return "";
                }
                int e = C45078p0.m49926e(spanned.toString(), this.f162085g.f225612f);
                int e2 = C45078p0.m49926e(charSequence.toString(), this.f162085g.f225612f);
                int i5 = e + e2;
                int i6 = this.f162084f;
                if (i5 <= i6 || (r8 = i6 - e) >= e2) {
                    return charSequence;
                }
                int i7 = 1;
                while (i7 <= charSequence.length() && C45078p0.m49926e(charSequence.subSequence(0, i7).toString(), this.f162085g.f225612f) <= r8) {
                    i7++;
                }
                int i8 = i7 - 1;
                if (i8 <= 0 || i8 > charSequence.length()) {
                    return "";
                }
                SpannableString valueOf = SpannableString.valueOf(charSequence);
                C87412m.m108593f(valueOf, "valueOf(this)");
                Object[] spans = valueOf.getSpans(0, i8, C72953u.class);
                C87412m.m108593f(spans, "getSpans(start, end, T::class.java)");
                C72953u uVar = (C72953u) C110823p.m150978D(spans);
                return charSequence.subSequence(0, Math.min(i8 + (uVar != null ? uVar.f212637g - uVar.f212636f : 0), charSequence.length()));
            }
        }

        public C56553f(WeakReference<EditText> weakReference) {
            super(weakReference);
        }

        /* renamed from: f */
        public C45078p0 mo79812f(int i, C45078p0.C45079a aVar) {
            return new C56554a(i, aVar, this);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.view.FinderCommentFooter$i */
    public static final class C56555i implements Animator.AnimatorListener {

        /* renamed from: d */
        public final /* synthetic */ FinderCommentFooter f162086d;

        /* renamed from: e */
        public final /* synthetic */ boolean f162087e;

        public C56555i(FinderCommentFooter finderCommentFooter, boolean z) {
            this.f162086d = finderCommentFooter;
            this.f162087e = z;
        }

        public void onAnimationCancel(Animator animator) {
        }

        public void onAnimationEnd(Animator animator) {
            this.f162086d.getSmileyPanel().setVisibility(4);
            this.f162086d.setSmileyIcon(false);
            if (this.f162087e) {
                this.f162086d.setFooterMode(0);
            }
        }

        public void onAnimationRepeat(Animator animator) {
        }

        public void onAnimationStart(Animator animator) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.view.FinderCommentFooter$j */
    public static final class C56556j implements Animator.AnimatorListener {

        /* renamed from: d */
        public final /* synthetic */ FinderCommentFooter f162088d;

        public C56556j(FinderCommentFooter finderCommentFooter) {
            this.f162088d = finderCommentFooter;
        }

        public void onAnimationCancel(Animator animator) {
        }

        public void onAnimationEnd(Animator animator) {
            this.f162088d.getSmileyPanel().setAlpha(1.0f);
            this.f162088d.getSmileyPanel().setVisibility(4);
        }

        public void onAnimationRepeat(Animator animator) {
        }

        public void onAnimationStart(Animator animator) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.view.FinderCommentFooter$k */
    public static final class C56557k implements Animator.AnimatorListener {

        /* renamed from: d */
        public final /* synthetic */ FinderCommentFooter f162089d;

        public C56557k(FinderCommentFooter finderCommentFooter) {
            this.f162089d = finderCommentFooter;
        }

        public void onAnimationCancel(Animator animator) {
        }

        public void onAnimationEnd(Animator animator) {
            this.f162089d.setFooterMode(2);
            this.f162089d.setSmileyIcon(false);
            this.f162089d.getSmileyBtn().setTag(Boolean.FALSE);
            this.f162089d.getSmileyPanel().setVisibility(4);
            this.f162089d.getQuickPickEmoji().setVisibility(0);
        }

        public void onAnimationRepeat(Animator animator) {
        }

        public void onAnimationStart(Animator animator) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.view.FinderCommentFooter$l */
    public static final class C56558l implements Animator.AnimatorListener {

        /* renamed from: d */
        public final /* synthetic */ FinderCommentFooter f162090d;

        public C56558l(FinderCommentFooter finderCommentFooter) {
            this.f162090d = finderCommentFooter;
        }

        public void onAnimationCancel(Animator animator) {
        }

        public void onAnimationEnd(Animator animator) {
            this.f162090d.setFooterMode(0);
            this.f162090d.getQuickPickEmoji().setVisibility(4);
            this.f162090d.mo79774h("", "", (Object) null);
        }

        public void onAnimationRepeat(Animator animator) {
        }

        public void onAnimationStart(Animator animator) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.view.FinderCommentFooter$m */
    public static final class C56559m implements C76912y0.C61776j {

        /* renamed from: a */
        public static final C56559m f162091a = new C56559m();

        /* renamed from: a */
        public final void mo596a(View view) {
            TextView textView;
            if (view != null && (textView = (TextView) view.findViewById(C0966R.C0970id.kpy)) != null) {
                textView.setTextSize(1, 14.0f);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.view.FinderCommentFooter$n */
    public static final class C56560n implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ FinderCommentFooter f162092d;

        /* renamed from: com.tencent.mm.plugin.finder.view.FinderCommentFooter$n$a */
        public static final class C56561a extends C87413o implements C32226l<Integer, C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ FinderCommentFooter f162093d;

            /* renamed from: e */
            public final /* synthetic */ C4191v0 f162094e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C56561a(FinderCommentFooter finderCommentFooter, C4191v0 v0Var) {
                super(1);
                this.f162093d = finderCommentFooter;
                this.f162094e = v0Var;
            }

            public Object invoke(Object obj) {
                if (((Number) obj).intValue() != this.f162093d.getScene()) {
                    FinderCommentFooter.m65199b(this.f162093d);
                }
                this.f162094e.mo5072g();
                return C13598b0.f38549a;
            }
        }

        /* renamed from: com.tencent.mm.plugin.finder.view.FinderCommentFooter$n$b */
        public static final class C56562b extends C87413o implements C32226l<Integer, C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ FinderCommentFooter f162095d;

            /* renamed from: e */
            public final /* synthetic */ C4191v0 f162096e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C56562b(FinderCommentFooter finderCommentFooter, C4191v0 v0Var) {
                super(1);
                this.f162095d = finderCommentFooter;
                this.f162096e = v0Var;
            }

            public Object invoke(Object obj) {
                if (((Number) obj).intValue() != this.f162095d.getScene()) {
                    FinderCommentFooter.m65199b(this.f162095d);
                }
                this.f162096e.mo5072g();
                return C13598b0.f38549a;
            }
        }

        public C56560n(FinderCommentFooter finderCommentFooter) {
            this.f162092d = finderCommentFooter;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/view/FinderCommentFooter$refreshSwitchSceneView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C37521f fVar = C37521f.f99374d;
            if (fVar.mo61156J() > 0) {
                fVar.mo61178d0(0);
                View switchSceneTip = this.f162092d.getSwitchSceneTip();
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(8);
                View view2 = switchSceneTip;
                C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/view/FinderCommentFooter$refreshSwitchSceneView$2", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                switchSceneTip.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/view/FinderCommentFooter$refreshSwitchSceneView$2", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                C4191v0 v0Var = new C4191v0(this.f162092d.getContext());
                FinderCommentFooter finderCommentFooter = this.f162092d;
                v0Var.mo5070e(C0966R.C0971layout.f359788aq3);
                C85875k4.m106189j0(((TextView) v0Var.f18463f.findViewById(C0966R.C0970id.e3c)).getPaint(), 0.8f);
                View findViewById = v0Var.f18463f.findViewById(C0966R.C0970id.e3a);
                C87412m.m108593f(findViewById, "item1");
                FinderCommentFooter.m65198a(finderCommentFooter, findViewById, 1, new C56561a(finderCommentFooter, v0Var));
                View findViewById2 = v0Var.f18463f.findViewById(C0966R.C0970id.e3b);
                C87412m.m108593f(findViewById2, "item2");
                FinderCommentFooter.m65198a(finderCommentFooter, findViewById2, 2, new C56562b(finderCommentFooter, v0Var));
                v0Var.mo5073h();
            } else {
                FinderCommentFooter.m65199b(this.f162092d);
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/view/FinderCommentFooter$refreshSwitchSceneView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    public FinderCommentFooter(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: a */
    public static final void m65198a(FinderCommentFooter finderCommentFooter, View view, int i, C32226l lVar) {
        finderCommentFooter.getClass();
        Class cls = C11990s0.class;
        Class<C60200t1> cls2 = C60200t1.class;
        ImageView imageView = (ImageView) view.findViewById(C0966R.C0970id.f15);
        TextView textView = (TextView) view.findViewById(C0966R.C0970id.knx);
        TextView textView2 = (TextView) view.findViewById(C0966R.C0970id.f357845c22);
        ImageView imageView2 = (ImageView) view.findViewById(C0966R.C0970id.itl);
        if (finderCommentFooter.f162056H == i) {
            imageView2.setVisibility(0);
        } else {
            imageView2.setVisibility(8);
        }
        textView2.setText(((C76979h) C86312j.m106911c(C76979h.class)).mo107057T1(finderCommentFooter.getContext(), C58784w3.f168295a.mo83955p0(i)));
        if (i == 1) {
            C58969q b = C58961d.f168673a.mo84155b(C66785b.f191882e.mo90662O5());
            String avatarUrl = b != null ? b.getAvatarUrl() : "";
            C39818r rVar = C39818r.f106831a;
            C60979d<C100810g0> i2 = ((C11990s0) rVar.mo62446e(cls2).mo62447c(cls)).mo11872i2();
            C62345f fVar = new C62345f(avatarUrl, (C27696y) null, 2, (C8480h) null);
            C87412m.m108593f(imageView, "avatarIv");
            i2.mo85957c(fVar, imageView, ((C11990s0) rVar.mo62446e(cls2).mo62447c(cls)).mo11867O2(C11978e0.C11979a.AVATAR));
            textView.setText(C0966R.string.eqh);
        } else {
            C78039a.m94189a(imageView, C75592q0.m90789s());
            textView.setText(C0966R.string.eqi);
        }
        view.setOnClickListener(new C4092l1(lVar, i));
    }

    /* renamed from: b */
    public static final void m65199b(FinderCommentFooter finderCommentFooter) {
        C32224a<C13598b0> aVar = finderCommentFooter.f162053E;
        if (aVar != null) {
            aVar.invoke();
        }
        C58784w3 w3Var = C58784w3.f168295a;
        int i = finderCommentFooter.f162056H;
        w3Var.getClass();
        int i2 = 2;
        if (i == 2) {
            i2 = 1;
        }
        finderCommentFooter.setScene(i2);
        finderCommentFooter.mo79777k(true);
    }

    /* renamed from: c */
    public static final void m65200c(FinderCommentFooter finderCommentFooter, boolean z) {
        boolean z2 = finderCommentFooter.f162049A;
        if (!z2) {
            if (!z) {
                finderCommentFooter.setFooterMode(2);
                finderCommentFooter.mo79776j(false);
                finderCommentFooter.getEditText().setShowSoftInputOnFocus(true);
                finderCommentFooter.getEditText().requestFocus();
                Context context = finderCommentFooter.getContext();
                C87412m.m108592e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMFragmentActivity");
                ((MMFragmentActivity) context).showVKB();
            } else {
                boolean z3 = finderCommentFooter.f162060L != 2;
                if (!z2) {
                    finderCommentFooter.getSmileyPanel().setVisibility(0);
                    finderCommentFooter.getQuickPickEmoji().setVisibility(4);
                    finderCommentFooter.setSmileyIcon(false);
                    finderCommentFooter.getSmileyBtn().setTag(Boolean.TRUE);
                    if (z3) {
                        C41596o1 o1Var = new C41596o1(finderCommentFooter);
                        if (((float) finderCommentFooter.getSmileyPanel().getHeight()) <= 0.0f) {
                            finderCommentFooter.getSmileyPanel().addOnLayoutChangeListener(new C56644n1(finderCommentFooter, o1Var));
                        } else {
                            o1Var.invoke();
                        }
                    } else {
                        finderCommentFooter.getSmileyPanel().setAlpha(0.0f);
                        finderCommentFooter.getSmileyPanel().animate().alpha(1.0f).setDuration(220).setListener((Animator.AnimatorListener) null).start();
                    }
                }
                finderCommentFooter.setFooterMode(1);
                Context context2 = finderCommentFooter.getContext();
                C87412m.m108592e(context2, "null cannot be cast to non-null type com.tencent.mm.ui.MMFragmentActivity");
                ((MMFragmentActivity) context2).hideVKB();
            }
            finderCommentFooter.setSmileyIcon(z);
        }
    }

    /* access modifiers changed from: private */
    public final void setSmileyIcon(boolean z) {
        if (z) {
            getSmileyBtn().mo104518r(C0966R.raw.icons_outlined_keyboard, C0966R.color.FG_0);
            getSmileyBtn().setContentDescription(getSmileyBtn().getContext().getString(C0966R.string.b3l));
            return;
        }
        getSmileyBtn().mo104518r(C0966R.raw.icons_outlined_emoji, C0966R.color.FG_0);
        getSmileyBtn().setContentDescription(getSmileyBtn().getContext().getString(C0966R.string.b3j));
    }

    private final void setSmileyPanelHeight(float f) {
        this.f162080w = f;
        C7515a.f25778b = f + (((float) 2) * ((float) C76577a.m92151b(getContext(), 64)));
    }

    /* renamed from: Q1 */
    public void mo531Q1(int i, boolean z) {
        int i2 = i;
        boolean z2 = i2 > 0;
        if (!this.f162049A) {
            Log.m105924i("Finder.FinderCommentFooter", "onKeyboardHeightChanged isShow: " + z2 + " height:" + i2);
            if (i2 > 0 && i2 != ((int) this.f162081x)) {
                KeyBoardUtil.saveKeyBordHeightPx(getContext(), i2);
                this.f162081x = (float) i2;
                setSmileyPanelHeight(getQuickPickEmoji().getCanShowEmoji() ? this.f162081x + this.f162082y : this.f162081x);
                getSmileyPanel().setLayoutParams(new FrameLayout.LayoutParams(-1, (int) this.f162080w));
            }
            if (this.f162083z != z2) {
                this.f162083z = z2;
                if (z2) {
                    animate().setDuration(90).translationY(0.0f).setListener(new C56557k(this)).start();
                } else {
                    int i3 = this.f162060L;
                    if (i3 == 2 || i3 == 0) {
                        animate().setDuration(180).translationY(this.f162050B ? (float) getHeight() : this.f162080w).setListener(new C56558l(this)).start();
                    }
                }
            }
            if (!z2 || C37521f.f99374d.mo61156J() <= 0 || !mo79742e()) {
                View switchSceneTip = getSwitchSceneTip();
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(8);
                View view = switchSceneTip;
                C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/view/FinderCommentFooter", "onKeyboardHeightChanged", "(IZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                switchSceneTip.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view, "com/tencent/mm/plugin/finder/view/FinderCommentFooter", "onKeyboardHeightChanged", "(IZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                return;
            }
            View switchSceneTip2 = getSwitchSceneTip();
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar2.mo10233c(0);
            View view2 = switchSceneTip2;
            C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/view/FinderCommentFooter", "onKeyboardHeightChanged", "(IZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            switchSceneTip2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/view/FinderCommentFooter", "onKeyboardHeightChanged", "(IZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    /* renamed from: e */
    public final boolean mo79742e() {
        C37521f.f99374d.getClass();
        return C37521f.f99211K1.mo60266n().intValue() == 1 && !this.f162057I && C58784w3.f168295a.mo83983z0() && !this.f162058J;
    }

    /* renamed from: f */
    public final void mo79743f(String str, String str2, Object obj, boolean z) {
        this.f162061M = str == null ? "" : str;
        this.f162062N = str2;
        this.f162063P = obj;
        getEditText().setHint(((C76979h) C86312j.m106911c(C76979h.class)).mo107057T1(getContext(), str + str2));
        getEditText().setTag(obj);
        ViewGroup viewGroup = this.f162074q;
        if (viewGroup != null) {
            viewGroup.setTag(C0966R.C0970id.d3s, getEditText().getHint());
        }
        if (!getEditText().hasFocus() && z) {
            getEditText().requestFocus();
        }
    }

    /* renamed from: g */
    public final void mo79744g(String str, String str2, Object obj) {
        C87412m.m108594g(str, "fromName");
        C87412m.m108594g(str2, "toName");
        String str3 = this.f162061M;
        mo79743f(str3, ' ' + getResources().getString(C0966R.string.bih, new Object[]{str2}), obj, true);
    }

    public final ImageView getAvatarView() {
        return getTargetAvatar();
    }

    public final C32224a<C13598b0> getBackClickListener() {
        return this.f162052D;
    }

    public final boolean getBanSwitchScene() {
        return this.f162058J;
    }

    public final ViewGroup getCommentEditTextContainer() {
        return this.f162074q;
    }

    public final View getCommentEditTextLayout() {
        View view = this.f162073p;
        if (view != null) {
            return view;
        }
        C87412m.m108603p("commentEditTextLayout");
        throw null;
    }

    public final int getCommentTextLimit() {
        return this.f162078u;
    }

    public final int getCommentTextLineLimit() {
        return this.f162079v;
    }

    public final FinderCommentEditText getEditText() {
        FinderCommentEditText finderCommentEditText = this.f162071n;
        if (finderCommentEditText != null) {
            return finderCommentEditText;
        }
        C87412m.m108603p("editText");
        throw null;
    }

    public final int getFooterMode() {
        return this.f162060L;
    }

    public final String getLastActionStr() {
        return this.f162062N;
    }

    public final String getLastFromName() {
        return this.f162061M;
    }

    public final Object getLastTag() {
        return this.f162063P;
    }

    public final ImageView getMentionBtn() {
        ImageView imageView = this.f162070j;
        if (imageView != null) {
            return imageView;
        }
        C87412m.m108603p("mentionBtn");
        throw null;
    }

    public final List<C41598v7> getMentionListWhenReply() {
        String str;
        T t;
        boolean z;
        if (this.f162056H == 1) {
            this.f162059K.clear();
            return C64186f0.f181907d;
        }
        Editable text = getEditText().getText();
        if (text == null || (str = text.toString()) == null) {
            str = "";
        }
        if (str.length() == 0) {
            this.f162059K.clear();
            return this.f162059K;
        }
        C66483g.C66484a aVar = new C66483g.C66484a((C66483g) C66723k.m78722b(new C66723k("@.*? "), str, 0, 2, (Object) null));
        while (aVar.hasNext()) {
            C66716g gVar = (C66716g) aVar.next();
            String P = C112550d0.m153780P(C112550d0.m153777M(gVar.getValue(), "@"), " ");
            Iterator<T> it = this.f162059K.iterator();
            while (true) {
                if (!it.hasNext()) {
                    t = null;
                    break;
                }
                t = it.next();
                C41598v7 v7Var = (C41598v7) t;
                if (!C87412m.m108589b(v7Var.f111967b, P) || v7Var.f111970e) {
                    z = false;
                    continue;
                } else {
                    z = true;
                    continue;
                }
                if (z) {
                    break;
                }
            }
            C41598v7 v7Var2 = (C41598v7) t;
            if (v7Var2 != null) {
                v7Var2.f111968c = (long) gVar.mo90753c().f175174d;
            }
            if (v7Var2 != null) {
                v7Var2.f111970e = true;
            }
        }
        ArrayList<C41598v7> arrayList = this.f162059K;
        ArrayList arrayList2 = new ArrayList();
        for (T next : arrayList) {
            if (((C41598v7) next).f111970e) {
                arrayList2.add(next);
            }
        }
        ArrayList<C41598v7> arrayList3 = new ArrayList<>(arrayList2);
        for (C41598v7 v7Var3 : arrayList3) {
            if (!Util.isNullOrNil(v7Var3.f111966a)) {
                Log.m105924i("Finder.FinderCommentFooter", "getMentionListWhenReply at user: " + v7Var3.f111966a);
                C7125l.f25089a.mo8290a(C72994y1.C72995a.USERINFO_RECENT_AT_FINDER_COMMENT_GROUP_STRING_SYNC, v7Var3.f111966a);
            }
        }
        this.f162059K.clear();
        return arrayList3;
    }

    public final C56552a getModeChangeCallback() {
        return this.f162051C;
    }

    public final FinderEmojiPickView getQuickPickEmoji() {
        FinderEmojiPickView finderEmojiPickView = this.f162076s;
        if (finderEmojiPickView != null) {
            return finderEmojiPickView;
        }
        C87412m.m108603p("quickPickEmoji");
        throw null;
    }

    public final View getReplyBtn() {
        View view = this.f162072o;
        if (view != null) {
            return view;
        }
        C87412m.m108603p("replyBtn");
        throw null;
    }

    public final int getReplyBtnWidth() {
        return this.f162054F;
    }

    public final int getScene() {
        return this.f162056H;
    }

    public final boolean getSendBtnEnabled() {
        return this.f162055G;
    }

    public final WeImageView getSmileyBtn() {
        WeImageView weImageView = this.f162069i;
        if (weImageView != null) {
            return weImageView;
        }
        C87412m.m108603p("smileyBtn");
        throw null;
    }

    public final FrameLayout getSmileyContainer() {
        FrameLayout frameLayout = this.f162077t;
        if (frameLayout != null) {
            return frameLayout;
        }
        C87412m.m108603p("smileyContainer");
        throw null;
    }

    public final SmileyPanel getSmileyPanel() {
        SmileyPanel smileyPanel = this.f162068h;
        if (smileyPanel != null) {
            return smileyPanel;
        }
        C87412m.m108603p("smileyPanel");
        throw null;
    }

    public final ImageView getSwitchSceneAvatar() {
        ImageView imageView = this.f162064d;
        if (imageView != null) {
            return imageView;
        }
        C87412m.m108603p("switchSceneAvatar");
        throw null;
    }

    public final C32224a<C13598b0> getSwitchSceneListener() {
        return this.f162053E;
    }

    public final TextView getSwitchSceneName() {
        TextView textView = this.f162065e;
        if (textView != null) {
            return textView;
        }
        C87412m.m108603p("switchSceneName");
        throw null;
    }

    public final View getSwitchSceneTip() {
        View view = this.f162066f;
        if (view != null) {
            return view;
        }
        C87412m.m108603p("switchSceneTip");
        throw null;
    }

    public final TextView getSwitchSceneTipTv() {
        TextView textView = this.f162067g;
        if (textView != null) {
            return textView;
        }
        C87412m.m108603p("switchSceneTipTv");
        throw null;
    }

    public final ImageView getTargetAvatar() {
        ImageView imageView = this.f162075r;
        if (imageView != null) {
            return imageView;
        }
        C87412m.m108603p("targetAvatar");
        throw null;
    }

    /* renamed from: h */
    public final void mo79774h(String str, String str2, Object obj) {
        C87412m.m108594g(str, "fromName");
        C87412m.m108594g(str2, "toName");
        String str3 = this.f162061M;
        mo79743f(str3, ' ' + getResources().getString(C0966R.string.bik), obj, true);
    }

    /* renamed from: i */
    public final String mo79775i(String str) {
        C65604i iVar = C65604i.f188772a;
        Context context = getContext();
        C87412m.m108593f(context, "context");
        C37521f fVar = C37521f.f99374d;
        int c = iVar.mo89677c(context, fVar.mo61150D());
        Context context2 = getContext();
        C87412m.m108593f(context2, "context");
        int c2 = iVar.mo89677c(context2, fVar.mo61150D() + 1);
        TextPaint paint = getEditText().getPaint();
        C87412m.m108593f(paint, "editText.paint");
        return iVar.mo89678d(paint, str, c, c2);
    }

    /* renamed from: j */
    public final void mo79776j(boolean z) {
        if (!this.f162049A) {
            getQuickPickEmoji().setVisibility(0);
            setSmileyIcon(false);
            getSmileyBtn().setTag(Boolean.FALSE);
            if (z) {
                animate().setInterpolator(new DecelerateInterpolator()).setDuration(220).translationY(this.f162050B ? (float) getHeight() : this.f162080w).setListener(new C56555i(this, z)).start();
            } else {
                getSmileyPanel().animate().alpha(0.0f).setDuration(220).setListener(new C56556j(this)).start();
            }
        }
    }

    /* renamed from: k */
    public final void mo79777k(boolean z) {
        String obj;
        Class cls = C11990s0.class;
        Class<C60200t1> cls2 = C60200t1.class;
        String str = "";
        if (this.f162056H == 2) {
            C37521f.f99374d.getClass();
            if (C37521f.f99171F6.mo60266n().intValue() == 1) {
                getMentionBtn().setVisibility(0);
            }
            C78039a.m94189a(getSwitchSceneAvatar(), C75592q0.m90789s());
            getSwitchSceneTipTv().setText(C0966R.string.eqg);
        } else {
            getMentionBtn().setVisibility(8);
            C58969q b = C58961d.f168673a.mo84155b(C66785b.f191882e.mo90662O5());
            String avatarUrl = b != null ? b.getAvatarUrl() : str;
            C39818r rVar = C39818r.f106831a;
            ((C11990s0) rVar.mo62446e(cls2).mo62447c(cls)).mo11872i2().mo85957c(new C62345f(avatarUrl, (C27696y) null, 2, (C8480h) null), getSwitchSceneAvatar(), ((C11990s0) rVar.mo62446e(cls2).mo62447c(cls)).mo11867O2(C11978e0.C11979a.AVATAR));
            getSwitchSceneTipTv().setText(C0966R.string.eqg);
        }
        TextView switchSceneName = getSwitchSceneName();
        Context context = getContext();
        C58784w3 w3Var = C58784w3.f168295a;
        switchSceneName.setText(((C76979h) C86312j.m106911c(C76979h.class)).mo107057T1(context, w3Var.mo83955p0(this.f162056H)));
        String p0 = w3Var.mo83955p0(this.f162056H);
        mo79743f(mo79775i(p0), this.f162062N, this.f162063P, z);
        ViewGroup viewGroup = (ViewGroup) findViewById(C0966R.C0970id.f357747bk2);
        if (viewGroup != null) {
            viewGroup.setTag(C0966R.C0970id.d5e, p0);
        }
        if (C37521f.f99374d.mo61156J() <= 0 && getSwitchSceneTip().getVisibility() == 0) {
            View switchSceneTip = getSwitchSceneTip();
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            View view = switchSceneTip;
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/view/FinderCommentFooter", "refreshCommentScene", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            switchSceneTip.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/finder/view/FinderCommentFooter", "refreshCommentScene", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        Editable text = getEditText().getText();
        if (!(text == null || (obj = text.toString()) == null)) {
            str = obj;
        }
        if (str.length() == 0) {
            this.f162059K.clear();
        }
        ArrayList arrayList = new ArrayList();
        C66483g.C66484a aVar2 = new C66483g.C66484a((C66483g) C66723k.m78722b(new C66723k("@.*? "), str, 0, 2, (Object) null));
        while (aVar2.hasNext()) {
            arrayList.add(C112550d0.m153780P(C112550d0.m153777M(((C66716g) aVar2.next()).getValue(), "@"), " "));
        }
        ArrayList<C41598v7> arrayList2 = this.f162059K;
        ArrayList arrayList3 = new ArrayList();
        Iterator<C41598v7> it = arrayList2.iterator();
        while (it.hasNext()) {
            C41598v7 next = it.next();
            if (arrayList.contains(next.f111967b)) {
                arrayList3.add(next);
            }
        }
        ArrayList<C41598v7> arrayList4 = new ArrayList<>(arrayList3);
        this.f162059K = arrayList4;
        if (this.f162056H == 1 && !Util.isNullOrNil((List) arrayList4)) {
            String string = getContext().getString(C0966R.string.f360770en0);
            C87412m.m108593f(string, "context.getString(R.stri…_finder_cannot_at_friend)");
            C76912y0.m92766e(getContext(), string, C56559m.f162091a);
        }
    }

    /* renamed from: l */
    public final void mo79778l(boolean z) {
        View switchSceneTip = getSwitchSceneTip();
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        C117292a.m165358d(switchSceneTip, aVar.mo10232b(), "com/tencent/mm/plugin/finder/view/FinderCommentFooter", "refreshSwitchSceneView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        switchSceneTip.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(switchSceneTip, "com/tencent/mm/plugin/finder/view/FinderCommentFooter", "refreshSwitchSceneView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        mo79777k(z);
        View findViewById = findViewById(C0966R.C0970id.f357747bk2);
        if (mo79742e()) {
            View findViewById2 = findViewById.findViewById(C0966R.C0970id.f357745bk0);
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(0);
            View view = findViewById2;
            C117292a.m165358d(view, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/view/FinderCommentFooter", "refreshSwitchSceneView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/finder/view/FinderCommentFooter", "refreshSwitchSceneView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setOnClickListener(new C56560n(this));
        } else {
            findViewById.setOnClickListener(C41560o.f111873d);
            View findViewById3 = findViewById.findViewById(C0966R.C0970id.f357745bk0);
            C9556a aVar3 = new C9556a();
            aVar3.mo10233c(8);
            View view2 = findViewById3;
            C117292a.m165358d(view2, aVar3.mo10232b(), "com/tencent/mm/plugin/finder/view/FinderCommentFooter", "refreshSwitchSceneView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById3.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/view/FinderCommentFooter", "refreshSwitchSceneView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if (C37521f.f99374d.mo61156J() > 0) {
            View switchSceneTip2 = getSwitchSceneTip();
            C9556a aVar4 = new C9556a();
            aVar4.mo10233c(0);
            View view3 = switchSceneTip2;
            C117292a.m165358d(view3, aVar4.mo10232b(), "com/tencent/mm/plugin/finder/view/FinderCommentFooter", "refreshSwitchSceneView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            switchSceneTip2.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
            C117292a.m165359e(view3, "com/tencent/mm/plugin/finder/view/FinderCommentFooter", "refreshSwitchSceneView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        getTargetAvatar().setVisibility(8);
        FinderCommentEditText editText = getEditText();
        editText.setPadding((int) editText.getContext().getResources().getDimension(C0966R.dimen.f3766df), 0, (int) editText.getContext().getResources().getDimension(C0966R.dimen.f3766df), 0);
    }

    /* JADX WARNING: type inference failed for: r3v1, types: [android.content.Context] */
    /* JADX WARNING: type inference failed for: r3v3, types: [android.content.Context] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo79779m(boolean r3) {
        /*
            r2 = this;
            boolean r0 = r2.f162049A
            if (r0 == 0) goto L_0x0005
            return
        L_0x0005:
            boolean r0 = r2.f162083z
            if (r0 == 0) goto L_0x000c
            if (r3 == 0) goto L_0x000c
            return
        L_0x000c:
            r0 = 0
            if (r3 == 0) goto L_0x0027
            com.tencent.mm.plugin.finder.view.FinderCommentEditText r3 = r2.getEditText()
            r3.requestFocus()
            android.content.Context r3 = r2.getContext()
            boolean r1 = r3 instanceof com.tencent.p014mm.p136ui.MMFragmentActivity
            if (r1 == 0) goto L_0x0021
            r0 = r3
            com.tencent.mm.ui.MMFragmentActivity r0 = (com.tencent.p014mm.p136ui.MMFragmentActivity) r0
        L_0x0021:
            if (r0 == 0) goto L_0x0037
            r0.showVKB()
            goto L_0x0037
        L_0x0027:
            android.content.Context r3 = r2.getContext()
            boolean r1 = r3 instanceof com.tencent.p014mm.p136ui.MMFragmentActivity
            if (r1 == 0) goto L_0x0032
            r0 = r3
            com.tencent.mm.ui.MMFragmentActivity r0 = (com.tencent.p014mm.p136ui.MMFragmentActivity) r0
        L_0x0032:
            if (r0 == 0) goto L_0x0037
            r0.hideVKB()
        L_0x0037:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.view.FinderCommentFooter.mo79779m(boolean):void");
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        View findViewById = findViewById(C0966R.C0970id.bjz);
        C87412m.m108593f(findViewById, "findViewById(R.id.comment_scene_avatar)");
        setSwitchSceneAvatar((ImageView) findViewById);
        View findViewById2 = findViewById(C0966R.C0970id.f357746bk1);
        C87412m.m108593f(findViewById2, "findViewById(R.id.comment_scene_name)");
        setSwitchSceneName((TextView) findViewById2);
        View findViewById3 = findViewById(C0966R.C0970id.f357748bk3);
        C87412m.m108593f(findViewById3, "findViewById(R.id.comment_switch_scene_tip_layout)");
        setSwitchSceneTip(findViewById3);
        View findViewById4 = findViewById(C0966R.C0970id.bk4);
        C87412m.m108593f(findViewById4, "findViewById(R.id.comment_switch_scene_tip_tv)");
        setSwitchSceneTipTv((TextView) findViewById4);
        View findViewById5 = findViewById(C0966R.C0970id.jni);
        C87412m.m108593f(findViewById5, "findViewById(R.id.smiley_btn)");
        setSmileyBtn((WeImageView) findViewById5);
        View findViewById6 = findViewById(C0966R.C0970id.grp);
        C87412m.m108593f(findViewById6, "findViewById(R.id.mention_btn)");
        setMentionBtn((ImageView) findViewById6);
        View findViewById7 = findViewById(C0966R.C0970id.bjg);
        C87412m.m108593f(findViewById7, "findViewById(R.id.comment_et)");
        setEditText((FinderCommentEditText) findViewById7);
        View findViewById8 = findViewById(C0966R.C0970id.bk5);
        C87412m.m108593f(findViewById8, "findViewById(R.id.comment_target_avatar)");
        setTargetAvatar((ImageView) findViewById8);
        View findViewById9 = findViewById(C0966R.C0970id.ipi);
        C87412m.m108593f(findViewById9, "findViewById(R.id.reply_btn)");
        setReplyBtn(findViewById9);
        View findViewById10 = findViewById(C0966R.C0970id.bji);
        C87412m.m108593f(findViewById10, "findViewById(R.id.comment_et_layout)");
        setCommentEditTextLayout(findViewById10);
        this.f162074q = (ViewGroup) findViewById(C0966R.C0970id.bjh);
        View findViewById11 = findViewById(C0966R.C0970id.m8r);
        C87412m.m108593f(findViewById11, "findViewById(R.id.v_quick_pick_emoji)");
        setQuickPickEmoji((FinderEmojiPickView) findViewById11);
        View findViewById12 = findViewById(C0966R.C0970id.m1m);
        C87412m.m108593f(findViewById12, "findViewById(R.id.fl_smiley_container)");
        setSmileyContainer((FrameLayout) findViewById12);
        if (C85875k4.m106211z()) {
            getSwitchSceneTip().setBackgroundResource(C0966R.C0969drawable.a5m);
        } else {
            getSwitchSceneTip().setBackgroundResource(C0966R.C0969drawable.a5l);
        }
        getSmileyBtn().setTag(Boolean.FALSE);
        SmileyPanel c = C78160t0.m94372c(getContext(), false);
        C87412m.m108593f(c, "getSmileyPanel(context, false)");
        setSmileyPanel(c);
        getSmileyPanel().setEntranceScene(13);
        getSmileyPanel().setBackgroundResource(C0966R.C0969drawable.c2_);
        getSmileyPanel().mo100191d();
        getSmileyPanel().mo100192e(true);
        getSmileyPanel().mo100193f(false, false);
        getSmileyPanel().setVisibility(4);
        getSmileyPanel().mo100197i();
        C41559h hVar = new C41559h(this);
        getSmileyPanel().setOnTextOperationListener(hVar);
        getQuickPickEmoji().setOnTextOperationListener(hVar);
        FinderEmojiPickView quickPickEmoji = getQuickPickEmoji();
        quickPickEmoji.f162281e.mo138125c(quickPickEmoji.f162286j);
        quickPickEmoji.f162281e.notifyDataSetChanged();
        float keyBordHeightPx = (float) KeyBoardUtil.getKeyBordHeightPx(getContext());
        if (getQuickPickEmoji().getCanShowEmoji()) {
            setSmileyPanelHeight(this.f162080w + this.f162082y);
        } else {
            setSmileyPanelHeight(keyBordHeightPx);
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, (int) this.f162080w);
        getSmileyPanel().setLayoutParams(layoutParams);
        getSmileyContainer().addView(getSmileyPanel(), layoutParams);
        getSmileyBtn().setOnClickListener(new C41552b(this));
        getMentionBtn().setOnClickListener(new C41553c(this));
        setTranslationY(this.f162080w);
        Log.m105924i("Finder.FinderCommentFooter", "translationY: " + getTranslationY() + ", smileyPanelHeight: " + this.f162080w + ", quickEmojiHeight: " + this.f162082y + ", canShowEmoji: " + getQuickPickEmoji().getCanShowEmoji() + ", keyBoardHeight: " + keyBordHeightPx);
        C37521f fVar = C37521f.f99374d;
        fVar.getClass();
        this.f162078u = C37521f.f99445l1.mo60266n().intValue() * 2;
        fVar.getClass();
        this.f162079v = C37521f.f99453m1.mo60266n().intValue();
        View replyBtn = getReplyBtn();
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        C117292a.m165358d(replyBtn, aVar.mo10232b(), "com/tencent/mm/plugin/finder/view/FinderCommentFooter", "onFinishInflate", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        replyBtn.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(replyBtn, "com/tencent/mm/plugin/finder/view/FinderCommentFooter", "onFinishInflate", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        getEditText().addTextChangedListener(new C41555d(this));
        getEditText().setOnKeyListener(new C41557e(this));
        C56553f fVar2 = new C56553f(new WeakReference(getEditText()));
        int i = this.f162078u;
        fVar2.f225611e = 0;
        fVar2.f225610d = i;
        fVar2.f225613g = C64197v.m75534c(new C41558g(this));
        fVar2.mo107499d((C77382c.C77383a) null);
        mo79778l(false);
    }

    public final void setBackClickListener(C32224a<C13598b0> aVar) {
        this.f162052D = aVar;
    }

    public void setBackgroundColor(int i) {
        super.setBackgroundColor(i);
        Log.m105924i("Finder.FinderCommentFooter", "setBackgroundColor: " + i);
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        Log.m105924i("Finder.FinderCommentFooter", "setBackgroundResource: " + i);
    }

    public final void setBanSwitchScene(boolean z) {
        this.f162058J = z;
    }

    public final void setCommentEditTextContainer(ViewGroup viewGroup) {
        this.f162074q = viewGroup;
    }

    public final void setCommentEditTextLayout(View view) {
        C87412m.m108594g(view, "<set-?>");
        this.f162073p = view;
    }

    public final void setCommentTextLimit(int i) {
        this.f162078u = i;
    }

    public final void setCommentTextLineLimit(int i) {
        this.f162079v = i;
    }

    public final void setEditText(FinderCommentEditText finderCommentEditText) {
        C87412m.m108594g(finderCommentEditText, "<set-?>");
        this.f162071n = finderCommentEditText;
    }

    public final void setFooterMode(int i) {
        C56552a aVar = this.f162051C;
        if (aVar != null) {
            aVar.mo55509e(this.f162060L, i);
        }
        this.f162060L = i;
    }

    public final void setFrozen(boolean z) {
        this.f162049A = z;
    }

    public final void setHideFooterAtModeDefault(boolean z) {
        setTranslationY(this.f162080w + (z ? getSmileyPanel().getResources().getDimension(C0966R.dimen.a77) : 0.0f));
        this.f162050B = z;
    }

    public final void setLastActionStr(String str) {
        C87412m.m108594g(str, "<set-?>");
        this.f162062N = str;
    }

    public final void setLastFromName(String str) {
        C87412m.m108594g(str, "<set-?>");
        this.f162061M = str;
    }

    public final void setLastTag(Object obj) {
        this.f162063P = obj;
    }

    public final void setMentionBtn(ImageView imageView) {
        C87412m.m108594g(imageView, "<set-?>");
        this.f162070j = imageView;
    }

    public final void setModeChangeCallback(C56552a aVar) {
        this.f162051C = aVar;
    }

    public final void setQuickPickEmoji(FinderEmojiPickView finderEmojiPickView) {
        C87412m.m108594g(finderEmojiPickView, "<set-?>");
        this.f162076s = finderEmojiPickView;
    }

    public final void setReplyBtn(View view) {
        C87412m.m108594g(view, "<set-?>");
        this.f162072o = view;
    }

    public final void setReplyBtnWidth(int i) {
        this.f162054F = i;
    }

    public final void setScene(int i) {
        if (BuildInfo.DEBUG || BuildInfo.IS_FLAVOR_PURPLE || BuildInfo.IS_FLAVOR_RED) {
            Log.printInfoStack("Finder.FinderCommentFooter", "set footer scene:" + i, new Object[0]);
        }
        this.f162056H = i;
    }

    public final void setSelfProfile(boolean z) {
        this.f162057I = z;
    }

    public final void setSendBtnEnabled(boolean z) {
        this.f162055G = z;
    }

    public final void setSmileyBtn(WeImageView weImageView) {
        C87412m.m108594g(weImageView, "<set-?>");
        this.f162069i = weImageView;
    }

    public final void setSmileyContainer(FrameLayout frameLayout) {
        C87412m.m108594g(frameLayout, "<set-?>");
        this.f162077t = frameLayout;
    }

    public final void setSmileyPanel(SmileyPanel smileyPanel) {
        C87412m.m108594g(smileyPanel, "<set-?>");
        this.f162068h = smileyPanel;
    }

    public final void setSwitchSceneAvatar(ImageView imageView) {
        C87412m.m108594g(imageView, "<set-?>");
        this.f162064d = imageView;
    }

    public final void setSwitchSceneListener(C32224a<C13598b0> aVar) {
        this.f162053E = aVar;
    }

    public final void setSwitchSceneName(TextView textView) {
        C87412m.m108594g(textView, "<set-?>");
        this.f162065e = textView;
    }

    public final void setSwitchSceneTip(View view) {
        C87412m.m108594g(view, "<set-?>");
        this.f162066f = view;
    }

    public final void setSwitchSceneTipTv(TextView textView) {
        C87412m.m108594g(textView, "<set-?>");
        this.f162067g = textView;
    }

    public final void setTargetAvatar(ImageView imageView) {
        C87412m.m108594g(imageView, "<set-?>");
        this.f162075r = imageView;
    }
}
