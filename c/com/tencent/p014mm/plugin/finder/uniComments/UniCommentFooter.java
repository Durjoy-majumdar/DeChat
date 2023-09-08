package com.tencent.p014mm.plugin.finder.uniComments;

import android.animation.Animator;
import android.content.Context;
import android.text.Editable;
import android.text.TextPaint;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import bl3.C39818r;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.api.SmileyPanel;
import com.tencent.p014mm.p136ui.C74942w4;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.MMFragmentActivity;
import com.tencent.p014mm.p136ui.tools.C7020t0;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.plugin.finder.p056ui.p799at.FinderAtSomeoneDialog;
import com.tencent.p014mm.plugin.finder.view.C4191v0;
import com.tencent.p014mm.plugin.finder.view.FinderCommentEditText;
import com.tencent.p014mm.pluginsdk.p133ui.ChatFooterPanel;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.KeyBoardUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import cq1.C57962a;
import cq1.C7125l;
import di3.C86312j;
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
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k20.C60958c;
import k20.C9556a;
import k60.C60979d;
import kotlin.Metadata;
import lq1.C10643x;
import lq1.C46889a;
import lq1.C46890a0;
import lq1.C46895y;
import lq1.C61377z;
import nj3.C76912y0;
import p248ug.C78160t0;
import p629ny.C76979h;
import pl1.C100810g0;
import pl1.C11978e0;
import pl1.C11990s0;
import pl1.C62345f;
import qn3.C77382c;
import rx3.C13598b0;
import sx3.C64186f0;
import tl3.C78039a;
import up1.C27696y;
import up1.C37521f;
import ve1.C65604i;
import wq3.C111847h;
import y04.C66483g;
import z04.C112550d0;
import z04.C66716g;
import z04.C66723k;
import zc1.C66785b;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b#\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0002ª\u0001B#\b\u0016\u0012\n\u0010¥\u0001\u001a\u0005\u0018\u00010¤\u0001\u0012\n\u0010§\u0001\u001a\u0005\u0018\u00010¦\u0001¢\u0006\u0006\b¨\u0001\u0010©\u0001J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0006\u0010\t\u001a\u00020\bJ\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nR\"\u0010\u0013\u001a\u00020\b8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\"\u0010\u001b\u001a\u00020\u00148\u0006@\u0006X.¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\"\u0010#\u001a\u00020\u001c8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\"\u0010'\u001a\u00020\u00148\u0006@\u0006X.¢\u0006\u0012\n\u0004\b$\u0010\u0016\u001a\u0004\b%\u0010\u0018\"\u0004\b&\u0010\u001aR\"\u0010/\u001a\u00020(8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\"\u00107\u001a\u0002008\u0006@\u0006X.¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\"\u0010;\u001a\u00020\b8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b8\u0010\u000e\u001a\u0004\b9\u0010\u0010\"\u0004\b:\u0010\u0012R\"\u0010C\u001a\u00020<8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR\"\u0010G\u001a\u00020\u001c8\u0006@\u0006X.¢\u0006\u0012\n\u0004\bD\u0010\u001e\u001a\u0004\bE\u0010 \"\u0004\bF\u0010\"R\"\u0010K\u001a\u00020\u001c8\u0006@\u0006X.¢\u0006\u0012\n\u0004\bH\u0010\u001e\u001a\u0004\bI\u0010 \"\u0004\bJ\u0010\"R$\u0010S\u001a\u0004\u0018\u00010L8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bM\u0010N\u001a\u0004\bO\u0010P\"\u0004\bQ\u0010RR\"\u0010W\u001a\u00020\b8\u0006@\u0006X.¢\u0006\u0012\n\u0004\bT\u0010\u000e\u001a\u0004\bU\u0010\u0010\"\u0004\bV\u0010\u0012R\"\u0010_\u001a\u00020X8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bY\u0010Z\u001a\u0004\b[\u0010\\\"\u0004\b]\u0010^R\"\u0010b\u001a\u00020\u00048\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b`\u0010a\u001a\u0004\bb\u0010c\"\u0004\bd\u0010eR$\u0010m\u001a\u0004\u0018\u00010f8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bg\u0010h\u001a\u0004\bi\u0010j\"\u0004\bk\u0010lR*\u0010u\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010n8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bo\u0010p\u001a\u0004\bq\u0010r\"\u0004\bs\u0010tR*\u0010y\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010n8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bv\u0010p\u001a\u0004\bw\u0010r\"\u0004\bx\u0010tR\"\u0010}\u001a\u00020X8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bz\u0010Z\u001a\u0004\b{\u0010\\\"\u0004\b|\u0010^R$\u0010\u0001\u001a\u00020\u00048\u0006@\u0006X\u000e¢\u0006\u0013\n\u0004\b~\u0010a\u001a\u0004\b\u0010c\"\u0005\b\u0001\u0010eR/\u0010\u0001\u001a\u00020X2\u0007\u0010\u0001\u001a\u00020X8\u0006@FX\u000e¢\u0006\u0015\n\u0005\b\u0001\u0010Z\u001a\u0005\b\u0001\u0010\\\"\u0005\b\u0001\u0010^R&\u0010\u0001\u001a\u00020\u00048\u0006@\u0006X\u000e¢\u0006\u0015\n\u0005\b\u0001\u0010a\u001a\u0005\b\u0001\u0010c\"\u0005\b\u0001\u0010eR&\u0010\u0001\u001a\u00020\u00048\u0006@\u0006X\u000e¢\u0006\u0015\n\u0005\b\u0001\u0010a\u001a\u0005\b\u0001\u0010c\"\u0005\b\u0001\u0010eR/\u0010\u0001\u001a\u00020X2\u0007\u0010\u0001\u001a\u00020X8\u0006@FX\u000e¢\u0006\u0015\n\u0005\b\u0001\u0010Z\u001a\u0005\b\u0001\u0010\\\"\u0005\b\u0001\u0010^R*\u0010\u0001\u001a\u00030\u00018\u0006@\u0006X\u000e¢\u0006\u0018\n\u0006\b\u0001\u0010\u0001\u001a\u0006\b\u0001\u0010\u0001\"\u0006\b\u0001\u0010\u0001R*\u0010\u0001\u001a\u00030\u00018\u0006@\u0006X\u000e¢\u0006\u0018\n\u0006\b\u0001\u0010\u0001\u001a\u0006\b\u0001\u0010\u0001\"\u0006\b\u0001\u0010\u0001R*\u0010£\u0001\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u0017\n\u0005\bZ\u0010\u0001\u001a\u0006\b\u0001\u0010 \u0001\"\u0006\b¡\u0001\u0010¢\u0001¨\u0006«\u0001"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/uniComments/UniCommentFooter;", "Landroid/widget/LinearLayout;", "Lcom/tencent/mm/ui/tools/t0;", "", "", "isShowSmiley", "Lrx3/b0;", "setSmileyIcon", "Landroid/widget/ImageView;", "getAvatarView", "", "Llq1/a;", "getMentionListWhenReply", "d", "Landroid/widget/ImageView;", "getSwitchSceneAvatar", "()Landroid/widget/ImageView;", "setSwitchSceneAvatar", "(Landroid/widget/ImageView;)V", "switchSceneAvatar", "Landroid/widget/TextView;", "e", "Landroid/widget/TextView;", "getSwitchSceneName", "()Landroid/widget/TextView;", "setSwitchSceneName", "(Landroid/widget/TextView;)V", "switchSceneName", "Landroid/view/View;", "f", "Landroid/view/View;", "getSwitchSceneTip", "()Landroid/view/View;", "setSwitchSceneTip", "(Landroid/view/View;)V", "switchSceneTip", "g", "getSwitchSceneTipTv", "setSwitchSceneTipTv", "switchSceneTipTv", "Lcom/tencent/mm/api/SmileyPanel;", "h", "Lcom/tencent/mm/api/SmileyPanel;", "getSmileyPanel", "()Lcom/tencent/mm/api/SmileyPanel;", "setSmileyPanel", "(Lcom/tencent/mm/api/SmileyPanel;)V", "smileyPanel", "Lcom/tencent/mm/ui/widget/imageview/WeImageView;", "i", "Lcom/tencent/mm/ui/widget/imageview/WeImageView;", "getSmileyBtn", "()Lcom/tencent/mm/ui/widget/imageview/WeImageView;", "setSmileyBtn", "(Lcom/tencent/mm/ui/widget/imageview/WeImageView;)V", "smileyBtn", "j", "getMentionBtn", "setMentionBtn", "mentionBtn", "Lcom/tencent/mm/plugin/finder/view/FinderCommentEditText;", "n", "Lcom/tencent/mm/plugin/finder/view/FinderCommentEditText;", "getEditText", "()Lcom/tencent/mm/plugin/finder/view/FinderCommentEditText;", "setEditText", "(Lcom/tencent/mm/plugin/finder/view/FinderCommentEditText;)V", "editText", "o", "getReplyBtn", "setReplyBtn", "replyBtn", "p", "getCommentEditTextLayout", "setCommentEditTextLayout", "commentEditTextLayout", "Landroid/view/ViewGroup;", "q", "Landroid/view/ViewGroup;", "getCommentEditTextContainer", "()Landroid/view/ViewGroup;", "setCommentEditTextContainer", "(Landroid/view/ViewGroup;)V", "commentEditTextContainer", "r", "getTargetAvatar", "setTargetAvatar", "targetAvatar", "", "s", "I", "getCommentTextLimit", "()I", "setCommentTextLimit", "(I)V", "commentTextLimit", "v", "Z", "isFrozen", "()Z", "setFrozen", "(Z)V", "Lcom/tencent/mm/plugin/finder/uniComments/UniCommentFooter$a;", "w", "Lcom/tencent/mm/plugin/finder/uniComments/UniCommentFooter$a;", "getModeChangeCallback", "()Lcom/tencent/mm/plugin/finder/uniComments/UniCommentFooter$a;", "setModeChangeCallback", "(Lcom/tencent/mm/plugin/finder/uniComments/UniCommentFooter$a;)V", "modeChangeCallback", "Lkotlin/Function0;", "x", "Lfy3/a;", "getBackClickListener", "()Lfy3/a;", "setBackClickListener", "(Lfy3/a;)V", "backClickListener", "y", "getSwitchSceneListener", "setSwitchSceneListener", "switchSceneListener", "z", "getReplyBtnWidth", "setReplyBtnWidth", "replyBtnWidth", "A", "getSendBtnEnabled", "setSendBtnEnabled", "sendBtnEnabled", "value", "B", "getScene", "setScene", "scene", "C", "isSelfProfile", "setSelfProfile", "D", "getBanSwitchScene", "setBanSwitchScene", "banSwitchScene", "F", "getFooterMode", "setFooterMode", "footerMode", "", "G", "Ljava/lang/String;", "getLastFromName", "()Ljava/lang/String;", "setLastFromName", "(Ljava/lang/String;)V", "lastFromName", "H", "getLastActionStr", "setLastActionStr", "lastActionStr", "Ljava/lang/Object;", "getLastTag", "()Ljava/lang/Object;", "setLastTag", "(Ljava/lang/Object;)V", "lastTag", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "a", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.uniComments.UniCommentFooter */
public final class UniCommentFooter extends LinearLayout implements C7020t0, C111847h {

    /* renamed from: J */
    public static final /* synthetic */ int f161411J = 0;

    /* renamed from: A */
    public boolean f161412A;

    /* renamed from: B */
    public int f161413B = 2;

    /* renamed from: C */
    public boolean f161414C;

    /* renamed from: D */
    public boolean f161415D;

    /* renamed from: E */
    public ArrayList<C46889a> f161416E = new ArrayList<>();

    /* renamed from: F */
    public int f161417F;

    /* renamed from: G */
    public String f161418G = "";

    /* renamed from: H */
    public String f161419H = "";

    /* renamed from: I */
    public Object f161420I;

    /* renamed from: d */
    public ImageView f161421d;

    /* renamed from: e */
    public TextView f161422e;

    /* renamed from: f */
    public View f161423f;

    /* renamed from: g */
    public TextView f161424g;

    /* renamed from: h */
    public SmileyPanel f161425h;

    /* renamed from: i */
    public WeImageView f161426i;

    /* renamed from: j */
    public ImageView f161427j;

    /* renamed from: n */
    public FinderCommentEditText f161428n;

    /* renamed from: o */
    public View f161429o;

    /* renamed from: p */
    public View f161430p;

    /* renamed from: q */
    public ViewGroup f161431q;

    /* renamed from: r */
    public ImageView f161432r;

    /* renamed from: s */
    public int f161433s;

    /* renamed from: t */
    public float f161434t = ((float) KeyBoardUtil.getKeyBordHeightPx(getContext()));

    /* renamed from: u */
    public boolean f161435u;

    /* renamed from: v */
    public boolean f161436v;

    /* renamed from: w */
    public C56458a f161437w;

    /* renamed from: x */
    public C32224a<C13598b0> f161438x;

    /* renamed from: y */
    public C32224a<C13598b0> f161439y;

    /* renamed from: z */
    public int f161440z = C74942w4.m89786c(getContext(), C0966R.dimen.f3758d_);

    /* renamed from: com.tencent.mm.plugin.finder.uniComments.UniCommentFooter$b */
    public static final class C41544b implements ChatFooterPanel.C72719a {

        /* renamed from: a */
        public final /* synthetic */ UniCommentFooter f111857a;

        public C41544b(UniCommentFooter uniCommentFooter) {
            this.f111857a = uniCommentFooter;
        }

        /* renamed from: a */
        public void mo64626a() {
        }

        /* renamed from: b */
        public void mo64627b(String str) {
            this.f111857a.getEditText().mo98046o(str);
        }

        /* renamed from: c */
        public void mo64628c() {
            if (this.f111857a.getEditText().getInputConnection() != null) {
                this.f111857a.getEditText().getInputConnection().sendKeyEvent(new KeyEvent(0, 67));
                this.f111857a.getEditText().getInputConnection().sendKeyEvent(new KeyEvent(1, 67));
            }
        }

        /* renamed from: d */
        public void mo64629d(boolean z) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.uniComments.UniCommentFooter$c */
    public static final class C41545c implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ UniCommentFooter f111858d;

        public C41545c(UniCommentFooter uniCommentFooter) {
            this.f111858d = uniCommentFooter;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/uniComments/UniCommentFooter$onFinishInflate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C87412m.m108592e(view, "null cannot be cast to non-null type android.widget.ImageView");
            Object tag = ((ImageView) view).getTag();
            C87412m.m108592e(tag, "null cannot be cast to non-null type kotlin.Boolean");
            UniCommentFooter.m64794c(this.f111858d, !((Boolean) tag).booleanValue());
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/uniComments/UniCommentFooter$onFinishInflate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.uniComments.UniCommentFooter$d */
    public static final class C41546d implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ UniCommentFooter f111859d;

        /* renamed from: com.tencent.mm.plugin.finder.uniComments.UniCommentFooter$d$a */
        public static final class C41547a implements C57962a {

            /* renamed from: a */
            public final /* synthetic */ UniCommentFooter f111860a;

            public C41547a(UniCommentFooter uniCommentFooter) {
                this.f111860a = uniCommentFooter;
            }

            /* renamed from: a */
            public void mo64632a(String str, String str2) {
                C87412m.m108594g(str, "displayName");
                C87412m.m108594g(str2, "username");
                UniCommentFooter uniCommentFooter = this.f111860a;
                int i = UniCommentFooter.f161411J;
                String obj = uniCommentFooter.getEditText().getText().toString();
                int selectionEnd = uniCommentFooter.getEditText().getSelectionEnd();
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
                uniCommentFooter.getEditText().setText(((C76979h) C86312j.m106911c(C76979h.class)).mo107057T1(uniCommentFooter.getContext(), sb.toString()));
                uniCommentFooter.getEditText().setSelection(selectionEnd + str3.length() + str.length() + 1);
                uniCommentFooter.getEditText().postDelayed(new C46895y(uniCommentFooter), 200);
                uniCommentFooter.f161416E.add(new C46889a(str2, str, -1, length2));
            }
        }

        public C41546d(UniCommentFooter uniCommentFooter) {
            this.f111859d = uniCommentFooter;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/uniComments/UniCommentFooter$onFinishInflate$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            Context context = this.f111859d.getContext();
            C87412m.m108593f(context, "context");
            Boolean bool = Boolean.FALSE;
            int i = UniCommentFooter.f161411J;
            new FinderAtSomeoneDialog(context, bool, C72994y1.C72995a.USERINFO_RECENT_AT_FINDER_COMMENT_GROUP_STRING_SYNC, new C41547a(this.f111859d)).show();
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/uniComments/UniCommentFooter$onFinishInflate$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.uniComments.UniCommentFooter$e */
    public static final class C41548e implements TextWatcher {

        /* renamed from: d */
        public final /* synthetic */ UniCommentFooter f111861d;

        /* renamed from: com.tencent.mm.plugin.finder.uniComments.UniCommentFooter$e$a */
        public static final class C41549a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ UniCommentFooter f111862d;

            public C41549a(UniCommentFooter uniCommentFooter) {
                this.f111862d = uniCommentFooter;
            }

            /* JADX WARNING: Removed duplicated region for block: B:16:0x003b  */
            /* JADX WARNING: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void run() {
                /*
                    r8 = this;
                    com.tencent.mm.plugin.finder.uniComments.UniCommentFooter r0 = r8.f111862d
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
                    boolean r4 = r0.f161412A
                    if (r1 != r4) goto L_0x003b
                    goto L_0x008f
                L_0x003b:
                    r0.f161412A = r1
                    r4 = 150(0x96, double:7.4E-322)
                    r6 = 2
                    if (r1 == 0) goto L_0x0069
                    android.animation.ValueAnimator r1 = new android.animation.ValueAnimator
                    r1.<init>()
                    int[] r6 = new int[r6]
                    r6[r3] = r3
                    int r3 = r0.f161440z
                    r6[r2] = r3
                    r1.setIntValues(r6)
                    lq1.t r2 = new lq1.t
                    r2.<init>(r0)
                    r1.addUpdateListener(r2)
                    r1.setDuration(r4)
                    lq1.u r2 = new lq1.u
                    r2.<init>(r0)
                    r1.addListener(r2)
                    r1.start()
                    goto L_0x008f
                L_0x0069:
                    android.animation.ValueAnimator r1 = new android.animation.ValueAnimator
                    r1.<init>()
                    int[] r6 = new int[r6]
                    int r7 = r0.f161440z
                    r6[r3] = r7
                    r6[r2] = r3
                    r1.setIntValues(r6)
                    lq1.v r2 = new lq1.v
                    r2.<init>(r0)
                    r1.addUpdateListener(r2)
                    r1.setDuration(r4)
                    lq1.w r2 = new lq1.w
                    r2.<init>(r0)
                    r1.addListener(r2)
                    r1.start()
                L_0x008f:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.uniComments.UniCommentFooter.C41548e.C41549a.run():void");
            }
        }

        public C41548e(UniCommentFooter uniCommentFooter) {
            this.f111861d = uniCommentFooter;
        }

        public void afterTextChanged(Editable editable) {
            this.f111861d.getEditText().postDelayed(new C41549a(this.f111861d), 160);
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            if (this.f111861d.getScene() == 2) {
                boolean z = true;
                if (i3 == 1) {
                    if ((charSequence != null ? charSequence.charAt(i) : ' ') == '@') {
                        this.f111861d.getClass();
                        C37521f.f99374d.getClass();
                        if (C37521f.f99171F6.mo60266n().intValue() != 1) {
                            z = false;
                        }
                        if (z) {
                            this.f111861d.getMentionBtn().performClick();
                        }
                    }
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.uniComments.UniCommentFooter$f */
    public static final class C41550f implements View.OnKeyListener {

        /* renamed from: d */
        public final /* synthetic */ UniCommentFooter f111863d;

        public C41550f(UniCommentFooter uniCommentFooter) {
            this.f111863d = uniCommentFooter;
        }

        public final boolean onKey(View view, int i, KeyEvent keyEvent) {
            CharSequence charSequence;
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            arrayList.add(Integer.valueOf(i));
            arrayList.add(keyEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/uniComments/UniCommentFooter$onFinishInflate$5", "android/view/View$OnKeyListener", "onKey", "(Landroid/view/View;ILandroid/view/KeyEvent;)Z", this, array);
            int i2 = 0;
            if (i == 67 && keyEvent.getAction() == 0) {
                int selectionEnd = this.f111863d.getEditText().getSelectionEnd();
                Editable text = this.f111863d.getEditText().getText();
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
                    this.f111863d.getEditText().setText(this.f111863d.getEditText().getText().replace(i2, selectionEnd, ""));
                    this.f111863d.getEditText().setSelection(i2);
                    C117292a.m165362h(true, this, "com/tencent/mm/plugin/finder/uniComments/UniCommentFooter$onFinishInflate$5", "android/view/View$OnKeyListener", "onKey", "(Landroid/view/View;ILandroid/view/KeyEvent;)Z");
                    return true;
                }
            }
            C117292a.m165362h(false, this, "com/tencent/mm/plugin/finder/uniComments/UniCommentFooter$onFinishInflate$5", "android/view/View$OnKeyListener", "onKey", "(Landroid/view/View;ILandroid/view/KeyEvent;)Z");
            return false;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.uniComments.UniCommentFooter$m */
    public static final class C41551m implements View.OnClickListener {

        /* renamed from: d */
        public static final C41551m f111864d = new C41551m();

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/uniComments/UniCommentFooter$refreshSwitchSceneView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/uniComments/UniCommentFooter$refreshSwitchSceneView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.uniComments.UniCommentFooter$a */
    public interface C56458a {
        /* renamed from: e */
        void mo79232e(int i, int i2);
    }

    /* renamed from: com.tencent.mm.plugin.finder.uniComments.UniCommentFooter$g */
    public static final class C56459g implements Animator.AnimatorListener {

        /* renamed from: d */
        public final /* synthetic */ UniCommentFooter f161441d;

        /* renamed from: e */
        public final /* synthetic */ boolean f161442e;

        public C56459g(UniCommentFooter uniCommentFooter, boolean z) {
            this.f161441d = uniCommentFooter;
            this.f161442e = z;
        }

        public void onAnimationCancel(Animator animator) {
        }

        public void onAnimationEnd(Animator animator) {
            this.f161441d.getSmileyPanel().setVisibility(4);
            this.f161441d.setSmileyIcon(false);
            if (this.f161442e) {
                this.f161441d.setFooterMode(0);
            }
        }

        public void onAnimationRepeat(Animator animator) {
        }

        public void onAnimationStart(Animator animator) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.uniComments.UniCommentFooter$h */
    public static final class C56460h implements Animator.AnimatorListener {

        /* renamed from: d */
        public final /* synthetic */ UniCommentFooter f161443d;

        public C56460h(UniCommentFooter uniCommentFooter) {
            this.f161443d = uniCommentFooter;
        }

        public void onAnimationCancel(Animator animator) {
        }

        public void onAnimationEnd(Animator animator) {
            this.f161443d.getSmileyPanel().setAlpha(1.0f);
            this.f161443d.getSmileyPanel().setVisibility(4);
        }

        public void onAnimationRepeat(Animator animator) {
        }

        public void onAnimationStart(Animator animator) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.uniComments.UniCommentFooter$i */
    public static final class C56461i implements Animator.AnimatorListener {

        /* renamed from: d */
        public final /* synthetic */ UniCommentFooter f161444d;

        public C56461i(UniCommentFooter uniCommentFooter) {
            this.f161444d = uniCommentFooter;
        }

        public void onAnimationCancel(Animator animator) {
        }

        public void onAnimationEnd(Animator animator) {
            this.f161444d.setFooterMode(2);
            this.f161444d.setSmileyIcon(false);
            this.f161444d.getSmileyBtn().setTag(Boolean.FALSE);
        }

        public void onAnimationRepeat(Animator animator) {
        }

        public void onAnimationStart(Animator animator) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.uniComments.UniCommentFooter$j */
    public static final class C56462j implements Animator.AnimatorListener {

        /* renamed from: d */
        public final /* synthetic */ UniCommentFooter f161445d;

        public C56462j(UniCommentFooter uniCommentFooter) {
            this.f161445d = uniCommentFooter;
        }

        public void onAnimationCancel(Animator animator) {
        }

        public void onAnimationEnd(Animator animator) {
            this.f161445d.setFooterMode(0);
        }

        public void onAnimationRepeat(Animator animator) {
        }

        public void onAnimationStart(Animator animator) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.uniComments.UniCommentFooter$k */
    public static final class C56463k implements C76912y0.C61776j {

        /* renamed from: a */
        public static final C56463k f161446a = new C56463k();

        /* renamed from: a */
        public final void mo596a(View view) {
            TextView textView;
            if (view != null && (textView = (TextView) view.findViewById(C0966R.C0970id.kpy)) != null) {
                textView.setTextSize(1, 14.0f);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.uniComments.UniCommentFooter$l */
    public static final class C56464l implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ UniCommentFooter f161447d;

        /* renamed from: com.tencent.mm.plugin.finder.uniComments.UniCommentFooter$l$a */
        public static final class C56465a extends C87413o implements C32226l<Integer, C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ UniCommentFooter f161448d;

            /* renamed from: e */
            public final /* synthetic */ C4191v0 f161449e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C56465a(UniCommentFooter uniCommentFooter, C4191v0 v0Var) {
                super(1);
                this.f161448d = uniCommentFooter;
                this.f161449e = v0Var;
            }

            public Object invoke(Object obj) {
                if (((Number) obj).intValue() != this.f161448d.getScene()) {
                    UniCommentFooter.m64793b(this.f161448d);
                }
                this.f161449e.mo5072g();
                return C13598b0.f38549a;
            }
        }

        /* renamed from: com.tencent.mm.plugin.finder.uniComments.UniCommentFooter$l$b */
        public static final class C56466b extends C87413o implements C32226l<Integer, C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ UniCommentFooter f161450d;

            /* renamed from: e */
            public final /* synthetic */ C4191v0 f161451e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C56466b(UniCommentFooter uniCommentFooter, C4191v0 v0Var) {
                super(1);
                this.f161450d = uniCommentFooter;
                this.f161451e = v0Var;
            }

            public Object invoke(Object obj) {
                if (((Number) obj).intValue() != this.f161450d.getScene()) {
                    UniCommentFooter.m64793b(this.f161450d);
                }
                this.f161451e.mo5072g();
                return C13598b0.f38549a;
            }
        }

        public C56464l(UniCommentFooter uniCommentFooter) {
            this.f161447d = uniCommentFooter;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/uniComments/UniCommentFooter$refreshSwitchSceneView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C37521f fVar = C37521f.f99374d;
            if (fVar.mo61156J() > 0) {
                fVar.mo61178d0(0);
                View switchSceneTip = this.f161447d.getSwitchSceneTip();
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(8);
                View view2 = switchSceneTip;
                C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/uniComments/UniCommentFooter$refreshSwitchSceneView$2", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                switchSceneTip.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/uniComments/UniCommentFooter$refreshSwitchSceneView$2", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                C4191v0 v0Var = new C4191v0(this.f161447d.getContext());
                UniCommentFooter uniCommentFooter = this.f161447d;
                v0Var.mo5070e(C0966R.C0971layout.cmy);
                C85875k4.m106189j0(((TextView) v0Var.f18463f.findViewById(C0966R.C0970id.e3c)).getPaint(), 0.8f);
                View findViewById = v0Var.f18463f.findViewById(C0966R.C0970id.e3a);
                C87412m.m108593f(findViewById, "item1");
                UniCommentFooter.m64792a(uniCommentFooter, findViewById, 1, new C56465a(uniCommentFooter, v0Var));
                View findViewById2 = v0Var.f18463f.findViewById(C0966R.C0970id.e3b);
                C87412m.m108593f(findViewById2, "item2");
                UniCommentFooter.m64792a(uniCommentFooter, findViewById2, 2, new C56466b(uniCommentFooter, v0Var));
                v0Var.mo5073h();
            } else {
                UniCommentFooter.m64793b(this.f161447d);
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/uniComments/UniCommentFooter$refreshSwitchSceneView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    public UniCommentFooter(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: a */
    public static final void m64792a(UniCommentFooter uniCommentFooter, View view, int i, C32226l lVar) {
        uniCommentFooter.getClass();
        Class cls = C11990s0.class;
        Class<C60200t1> cls2 = C60200t1.class;
        ImageView imageView = (ImageView) view.findViewById(C0966R.C0970id.f15);
        TextView textView = (TextView) view.findViewById(C0966R.C0970id.knx);
        TextView textView2 = (TextView) view.findViewById(C0966R.C0970id.f357845c22);
        ImageView imageView2 = (ImageView) view.findViewById(C0966R.C0970id.itl);
        if (uniCommentFooter.f161413B == i) {
            imageView2.setVisibility(0);
        } else {
            imageView2.setVisibility(8);
        }
        textView2.setText(((C76979h) C86312j.m106911c(C76979h.class)).mo107057T1(uniCommentFooter.getContext(), C58784w3.f168295a.mo83955p0(i)));
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
        view.setOnClickListener(new C10643x(lVar, i));
    }

    /* renamed from: b */
    public static final void m64793b(UniCommentFooter uniCommentFooter) {
        C32224a<C13598b0> aVar = uniCommentFooter.f161439y;
        if (aVar != null) {
            aVar.invoke();
        }
        C58784w3 w3Var = C58784w3.f168295a;
        int i = uniCommentFooter.f161413B;
        w3Var.getClass();
        int i2 = 2;
        if (i == 2) {
            i2 = 1;
        }
        uniCommentFooter.setScene(i2);
        uniCommentFooter.mo79285k(true);
    }

    /* renamed from: c */
    public static final void m64794c(UniCommentFooter uniCommentFooter, boolean z) {
        boolean z2 = uniCommentFooter.f161436v;
        if (!z2) {
            if (!z) {
                uniCommentFooter.setFooterMode(2);
                uniCommentFooter.mo79284j(false);
                uniCommentFooter.getEditText().setShowSoftInputOnFocus(true);
                uniCommentFooter.getEditText().requestFocus();
                Context context = uniCommentFooter.getContext();
                C87412m.m108592e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMFragmentActivity");
                ((MMFragmentActivity) context).showVKB();
            } else {
                boolean z3 = uniCommentFooter.f161417F != 2;
                if (!z2) {
                    uniCommentFooter.getSmileyPanel().setVisibility(0);
                    uniCommentFooter.setSmileyIcon(false);
                    uniCommentFooter.getSmileyBtn().setTag(Boolean.TRUE);
                    if (z3) {
                        C46890a0 a0Var = new C46890a0(uniCommentFooter);
                        if (((float) uniCommentFooter.getSmileyPanel().getHeight()) <= 0.0f) {
                            uniCommentFooter.getSmileyPanel().addOnLayoutChangeListener(new C61377z(uniCommentFooter, a0Var));
                        } else {
                            a0Var.invoke();
                        }
                    } else {
                        uniCommentFooter.getSmileyPanel().setAlpha(0.0f);
                        uniCommentFooter.getSmileyPanel().animate().alpha(1.0f).setDuration(220).setListener((Animator.AnimatorListener) null).start();
                    }
                }
                uniCommentFooter.setFooterMode(1);
                Context context2 = uniCommentFooter.getContext();
                C87412m.m108592e(context2, "null cannot be cast to non-null type com.tencent.mm.ui.MMFragmentActivity");
                ((MMFragmentActivity) context2).hideVKB();
            }
            uniCommentFooter.setSmileyIcon(z);
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

    /* renamed from: Q1 */
    public void mo531Q1(int i, boolean z) {
        int i2 = i;
        boolean z2 = i2 > 0;
        if (!this.f161436v) {
            if (i2 > 0 && i2 != ((int) this.f161434t)) {
                KeyBoardUtil.saveKeyBordHeightPx(getContext(), i2);
                this.f161434t = (float) i2;
                getSmileyPanel().setLayoutParams(new LinearLayout.LayoutParams(-1, (int) this.f161434t));
            }
            if (this.f161435u != z2) {
                this.f161435u = z2;
                if (z2) {
                    animate().setDuration(90).translationY(0.0f).setListener(new C56461i(this)).start();
                } else {
                    int i3 = this.f161417F;
                    if (i3 == 2 || i3 == 0) {
                        animate().setDuration(180).translationY(this.f161434t).setListener(new C56462j(this)).start();
                    }
                }
            }
            if (C37521f.f99374d.mo61156J() <= 0 || !mo79253e()) {
                View switchSceneTip = getSwitchSceneTip();
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(8);
                View view = switchSceneTip;
                C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/uniComments/UniCommentFooter", "onKeyboardHeightChanged", "(IZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                switchSceneTip.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view, "com/tencent/mm/plugin/finder/uniComments/UniCommentFooter", "onKeyboardHeightChanged", "(IZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                return;
            }
            View switchSceneTip2 = getSwitchSceneTip();
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar2.mo10233c(0);
            View view2 = switchSceneTip2;
            C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/uniComments/UniCommentFooter", "onKeyboardHeightChanged", "(IZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            switchSceneTip2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/uniComments/UniCommentFooter", "onKeyboardHeightChanged", "(IZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    /* renamed from: e */
    public final boolean mo79253e() {
        C37521f.f99374d.getClass();
        return C37521f.f99211K1.mo60266n().intValue() == 1 && !this.f161414C && C58784w3.f168295a.mo83983z0() && !this.f161415D;
    }

    /* renamed from: f */
    public final void mo79254f(String str, String str2, Object obj, boolean z) {
        this.f161418G = str == null ? "" : str;
        this.f161419H = str2;
        this.f161420I = obj;
        getEditText().setHint(((C76979h) C86312j.m106911c(C76979h.class)).mo107057T1(getContext(), str + str2));
        getEditText().setTag(obj);
        ViewGroup viewGroup = this.f161431q;
        if (viewGroup != null) {
            viewGroup.setTag(C0966R.C0970id.d3s, getEditText().getHint());
        }
        if (!getEditText().hasFocus() && z) {
            getEditText().requestFocus();
        }
    }

    /* renamed from: g */
    public final void mo79255g(String str, String str2, Object obj) {
        C87412m.m108594g(str, "fromName");
        C87412m.m108594g(str2, "toName");
        String str3 = this.f161418G;
        mo79254f(str3, ' ' + getResources().getString(C0966R.string.bih, new Object[]{str2}), obj, true);
    }

    public final ImageView getAvatarView() {
        return getTargetAvatar();
    }

    public final C32224a<C13598b0> getBackClickListener() {
        return this.f161438x;
    }

    public final boolean getBanSwitchScene() {
        return this.f161415D;
    }

    public final ViewGroup getCommentEditTextContainer() {
        return this.f161431q;
    }

    public final View getCommentEditTextLayout() {
        View view = this.f161430p;
        if (view != null) {
            return view;
        }
        C87412m.m108603p("commentEditTextLayout");
        throw null;
    }

    public final int getCommentTextLimit() {
        return this.f161433s;
    }

    public final FinderCommentEditText getEditText() {
        FinderCommentEditText finderCommentEditText = this.f161428n;
        if (finderCommentEditText != null) {
            return finderCommentEditText;
        }
        C87412m.m108603p("editText");
        throw null;
    }

    public final int getFooterMode() {
        return this.f161417F;
    }

    public final String getLastActionStr() {
        return this.f161419H;
    }

    public final String getLastFromName() {
        return this.f161418G;
    }

    public final Object getLastTag() {
        return this.f161420I;
    }

    public final ImageView getMentionBtn() {
        ImageView imageView = this.f161427j;
        if (imageView != null) {
            return imageView;
        }
        C87412m.m108603p("mentionBtn");
        throw null;
    }

    public final List<C46889a> getMentionListWhenReply() {
        String str;
        T t;
        boolean z;
        if (this.f161413B == 1) {
            this.f161416E.clear();
            return C64186f0.f181907d;
        }
        Editable text = getEditText().getText();
        if (text == null || (str = text.toString()) == null) {
            str = "";
        }
        if (str.length() == 0) {
            this.f161416E.clear();
            return this.f161416E;
        }
        C66483g.C66484a aVar = new C66483g.C66484a((C66483g) C66723k.m78722b(new C66723k("@.*? "), str, 0, 2, (Object) null));
        while (aVar.hasNext()) {
            C66716g gVar = (C66716g) aVar.next();
            String P = C112550d0.m153780P(C112550d0.m153777M(gVar.getValue(), "@"), " ");
            Iterator<T> it = this.f161416E.iterator();
            while (true) {
                if (!it.hasNext()) {
                    t = null;
                    break;
                }
                t = it.next();
                C46889a aVar2 = (C46889a) t;
                if (!C87412m.m108589b(aVar2.f126092b, P) || aVar2.f126095e) {
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
            C46889a aVar3 = (C46889a) t;
            if (aVar3 != null) {
                aVar3.f126093c = (long) gVar.mo90753c().f175174d;
            }
            if (aVar3 != null) {
                aVar3.f126095e = true;
            }
        }
        ArrayList<C46889a> arrayList = this.f161416E;
        ArrayList arrayList2 = new ArrayList();
        for (T next : arrayList) {
            if (((C46889a) next).f126095e) {
                arrayList2.add(next);
            }
        }
        ArrayList<C46889a> arrayList3 = new ArrayList<>(arrayList2);
        for (C46889a aVar4 : arrayList3) {
            if (!Util.isNullOrNil(aVar4.f126091a)) {
                Log.m105924i("MicroMsg.MusicUni.UniCommentFooter", "getMentionListWhenReply at user: " + aVar4.f126091a);
                C7125l.f25089a.mo8290a(C72994y1.C72995a.USERINFO_RECENT_AT_FINDER_COMMENT_GROUP_STRING_SYNC, aVar4.f126091a);
            }
        }
        this.f161416E.clear();
        return arrayList3;
    }

    public final C56458a getModeChangeCallback() {
        return this.f161437w;
    }

    public final View getReplyBtn() {
        View view = this.f161429o;
        if (view != null) {
            return view;
        }
        C87412m.m108603p("replyBtn");
        throw null;
    }

    public final int getReplyBtnWidth() {
        return this.f161440z;
    }

    public final int getScene() {
        return this.f161413B;
    }

    public final boolean getSendBtnEnabled() {
        return this.f161412A;
    }

    public final WeImageView getSmileyBtn() {
        WeImageView weImageView = this.f161426i;
        if (weImageView != null) {
            return weImageView;
        }
        C87412m.m108603p("smileyBtn");
        throw null;
    }

    public final SmileyPanel getSmileyPanel() {
        SmileyPanel smileyPanel = this.f161425h;
        if (smileyPanel != null) {
            return smileyPanel;
        }
        C87412m.m108603p("smileyPanel");
        throw null;
    }

    public final ImageView getSwitchSceneAvatar() {
        ImageView imageView = this.f161421d;
        if (imageView != null) {
            return imageView;
        }
        C87412m.m108603p("switchSceneAvatar");
        throw null;
    }

    public final C32224a<C13598b0> getSwitchSceneListener() {
        return this.f161439y;
    }

    public final TextView getSwitchSceneName() {
        TextView textView = this.f161422e;
        if (textView != null) {
            return textView;
        }
        C87412m.m108603p("switchSceneName");
        throw null;
    }

    public final View getSwitchSceneTip() {
        View view = this.f161423f;
        if (view != null) {
            return view;
        }
        C87412m.m108603p("switchSceneTip");
        throw null;
    }

    public final TextView getSwitchSceneTipTv() {
        TextView textView = this.f161424g;
        if (textView != null) {
            return textView;
        }
        C87412m.m108603p("switchSceneTipTv");
        throw null;
    }

    public final ImageView getTargetAvatar() {
        ImageView imageView = this.f161432r;
        if (imageView != null) {
            return imageView;
        }
        C87412m.m108603p("targetAvatar");
        throw null;
    }

    /* renamed from: h */
    public final void mo79282h(String str, String str2, Object obj) {
        C87412m.m108594g(str, "fromName");
        C87412m.m108594g(str2, "toName");
        String str3 = this.f161418G;
        mo79254f(str3, ' ' + getResources().getString(C0966R.string.bik), obj, true);
    }

    /* renamed from: i */
    public final String mo79283i(String str) {
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
    public final void mo79284j(boolean z) {
        if (!this.f161436v) {
            setSmileyIcon(false);
            getSmileyBtn().setTag(Boolean.FALSE);
            if (z) {
                animate().setInterpolator(new DecelerateInterpolator()).setDuration(220).translationY(this.f161434t).setListener(new C56459g(this, z)).start();
            } else {
                getSmileyPanel().animate().alpha(0.0f).setDuration(220).setListener(new C56460h(this)).start();
            }
        }
    }

    /* renamed from: k */
    public final void mo79285k(boolean z) {
        String obj;
        Class cls = C11990s0.class;
        Class<C60200t1> cls2 = C60200t1.class;
        String str = "";
        if (this.f161413B == 2) {
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
        switchSceneName.setText(((C76979h) C86312j.m106911c(C76979h.class)).mo107057T1(context, w3Var.mo83955p0(this.f161413B)));
        String p0 = w3Var.mo83955p0(this.f161413B);
        mo79254f(mo79283i(p0), this.f161419H, this.f161420I, z);
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
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/uniComments/UniCommentFooter", "refreshCommentScene", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            switchSceneTip.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/finder/uniComments/UniCommentFooter", "refreshCommentScene", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        Editable text = getEditText().getText();
        if (!(text == null || (obj = text.toString()) == null)) {
            str = obj;
        }
        if (str.length() == 0) {
            this.f161416E.clear();
        }
        ArrayList arrayList = new ArrayList();
        C66483g.C66484a aVar2 = new C66483g.C66484a((C66483g) C66723k.m78722b(new C66723k("@.*? "), str, 0, 2, (Object) null));
        while (aVar2.hasNext()) {
            arrayList.add(C112550d0.m153780P(C112550d0.m153777M(((C66716g) aVar2.next()).getValue(), "@"), " "));
        }
        ArrayList<C46889a> arrayList2 = this.f161416E;
        ArrayList arrayList3 = new ArrayList();
        Iterator<C46889a> it = arrayList2.iterator();
        while (it.hasNext()) {
            C46889a next = it.next();
            if (arrayList.contains(next.f126092b)) {
                arrayList3.add(next);
            }
        }
        ArrayList<C46889a> arrayList4 = new ArrayList<>(arrayList3);
        this.f161416E = arrayList4;
        if (this.f161413B == 1 && !Util.isNullOrNil((List) arrayList4)) {
            String string = getContext().getString(C0966R.string.f360770en0);
            C87412m.m108593f(string, "context.getString(R.stri…_finder_cannot_at_friend)");
            C76912y0.m92766e(getContext(), string, C56463k.f161446a);
        }
    }

    /* renamed from: l */
    public final void mo79286l(boolean z) {
        View switchSceneTip = getSwitchSceneTip();
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        C117292a.m165358d(switchSceneTip, aVar.mo10232b(), "com/tencent/mm/plugin/finder/uniComments/UniCommentFooter", "refreshSwitchSceneView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        switchSceneTip.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(switchSceneTip, "com/tencent/mm/plugin/finder/uniComments/UniCommentFooter", "refreshSwitchSceneView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        mo79285k(z);
        View findViewById = findViewById(C0966R.C0970id.f357747bk2);
        if (mo79253e()) {
            View findViewById2 = findViewById.findViewById(C0966R.C0970id.f357745bk0);
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(0);
            View view = findViewById2;
            C117292a.m165358d(view, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/uniComments/UniCommentFooter", "refreshSwitchSceneView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/finder/uniComments/UniCommentFooter", "refreshSwitchSceneView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setOnClickListener(new C56464l(this));
        } else {
            findViewById.setOnClickListener(C41551m.f111864d);
            View findViewById3 = findViewById.findViewById(C0966R.C0970id.f357745bk0);
            C9556a aVar3 = new C9556a();
            aVar3.mo10233c(8);
            View view2 = findViewById3;
            C117292a.m165358d(view2, aVar3.mo10232b(), "com/tencent/mm/plugin/finder/uniComments/UniCommentFooter", "refreshSwitchSceneView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById3.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/uniComments/UniCommentFooter", "refreshSwitchSceneView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if (C37521f.f99374d.mo61156J() > 0) {
            View switchSceneTip2 = getSwitchSceneTip();
            C9556a aVar4 = new C9556a();
            aVar4.mo10233c(0);
            View view3 = switchSceneTip2;
            C117292a.m165358d(view3, aVar4.mo10232b(), "com/tencent/mm/plugin/finder/uniComments/UniCommentFooter", "refreshSwitchSceneView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            switchSceneTip2.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
            C117292a.m165359e(view3, "com/tencent/mm/plugin/finder/uniComments/UniCommentFooter", "refreshSwitchSceneView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        getTargetAvatar().setVisibility(8);
        FinderCommentEditText editText = getEditText();
        editText.setPadding((int) editText.getContext().getResources().getDimension(C0966R.dimen.f3766df), 0, (int) editText.getContext().getResources().getDimension(C0966R.dimen.f3766df), 0);
    }

    /* JADX WARNING: type inference failed for: r3v1, types: [android.content.Context] */
    /* JADX WARNING: type inference failed for: r3v2, types: [android.content.Context] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo79287m(boolean r3) {
        /*
            r2 = this;
            boolean r0 = r2.f161436v
            if (r0 == 0) goto L_0x0005
            return
        L_0x0005:
            boolean r0 = r2.f161435u
            if (r0 == 0) goto L_0x000c
            if (r3 == 0) goto L_0x000c
            return
        L_0x000c:
            r0 = 0
            if (r3 == 0) goto L_0x0020
            android.content.Context r3 = r2.getContext()
            boolean r1 = r3 instanceof com.tencent.p014mm.p136ui.MMFragmentActivity
            if (r1 == 0) goto L_0x001a
            r0 = r3
            com.tencent.mm.ui.MMFragmentActivity r0 = (com.tencent.p014mm.p136ui.MMFragmentActivity) r0
        L_0x001a:
            if (r0 == 0) goto L_0x0030
            r0.showVKB()
            goto L_0x0030
        L_0x0020:
            android.content.Context r3 = r2.getContext()
            boolean r1 = r3 instanceof com.tencent.p014mm.p136ui.MMFragmentActivity
            if (r1 == 0) goto L_0x002b
            r0 = r3
            com.tencent.mm.ui.MMFragmentActivity r0 = (com.tencent.p014mm.p136ui.MMFragmentActivity) r0
        L_0x002b:
            if (r0 == 0) goto L_0x0030
            r0.hideVKB()
        L_0x0030:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.uniComments.UniCommentFooter.mo79287m(boolean):void");
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
        this.f161431q = (ViewGroup) findViewById(C0966R.C0970id.bjh);
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
        getSmileyPanel().setOnTextOperationListener(new C41544b(this));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, (int) this.f161434t);
        getSmileyPanel().setLayoutParams(layoutParams);
        addView(getSmileyPanel(), layoutParams);
        getSmileyBtn().setOnClickListener(new C41545c(this));
        getMentionBtn().setOnClickListener(new C41546d(this));
        setTranslationY(this.f161434t);
        C37521f.f99374d.getClass();
        this.f161433s = C37521f.f99445l1.mo60266n().intValue() * 2;
        View replyBtn = getReplyBtn();
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        C117292a.m165358d(replyBtn, aVar.mo10232b(), "com/tencent/mm/plugin/finder/uniComments/UniCommentFooter", "onFinishInflate", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        replyBtn.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(replyBtn, "com/tencent/mm/plugin/finder/uniComments/UniCommentFooter", "onFinishInflate", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        getEditText().addTextChangedListener(new C41548e(this));
        getEditText().setOnKeyListener(new C41550f(this));
        C77382c b = C77382c.m93286b(getEditText());
        int i = this.f161433s;
        b.f225611e = 0;
        b.f225610d = i;
        b.mo107499d((C77382c.C77383a) null);
        mo79286l(false);
    }

    public final void setBackClickListener(C32224a<C13598b0> aVar) {
        this.f161438x = aVar;
    }

    public final void setBanSwitchScene(boolean z) {
        this.f161415D = z;
    }

    public final void setCommentEditTextContainer(ViewGroup viewGroup) {
        this.f161431q = viewGroup;
    }

    public final void setCommentEditTextLayout(View view) {
        C87412m.m108594g(view, "<set-?>");
        this.f161430p = view;
    }

    public final void setCommentTextLimit(int i) {
        this.f161433s = i;
    }

    public final void setEditText(FinderCommentEditText finderCommentEditText) {
        C87412m.m108594g(finderCommentEditText, "<set-?>");
        this.f161428n = finderCommentEditText;
    }

    public final void setFooterMode(int i) {
        C56458a aVar = this.f161437w;
        if (aVar != null) {
            aVar.mo79232e(this.f161417F, i);
        }
        this.f161417F = i;
    }

    public final void setFrozen(boolean z) {
        this.f161436v = z;
    }

    public final void setLastActionStr(String str) {
        C87412m.m108594g(str, "<set-?>");
        this.f161419H = str;
    }

    public final void setLastFromName(String str) {
        C87412m.m108594g(str, "<set-?>");
        this.f161418G = str;
    }

    public final void setLastTag(Object obj) {
        this.f161420I = obj;
    }

    public final void setMentionBtn(ImageView imageView) {
        C87412m.m108594g(imageView, "<set-?>");
        this.f161427j = imageView;
    }

    public final void setModeChangeCallback(C56458a aVar) {
        this.f161437w = aVar;
    }

    public final void setReplyBtn(View view) {
        C87412m.m108594g(view, "<set-?>");
        this.f161429o = view;
    }

    public final void setReplyBtnWidth(int i) {
        this.f161440z = i;
    }

    public final void setScene(int i) {
        if (BuildInfo.DEBUG || BuildInfo.IS_FLAVOR_PURPLE || BuildInfo.IS_FLAVOR_RED) {
            Log.printInfoStack("MicroMsg.MusicUni.UniCommentFooter", "set footer scene:" + i, new Object[0]);
        }
        this.f161413B = i;
    }

    public final void setSelfProfile(boolean z) {
        this.f161414C = z;
    }

    public final void setSendBtnEnabled(boolean z) {
        this.f161412A = z;
    }

    public final void setSmileyBtn(WeImageView weImageView) {
        C87412m.m108594g(weImageView, "<set-?>");
        this.f161426i = weImageView;
    }

    public final void setSmileyPanel(SmileyPanel smileyPanel) {
        C87412m.m108594g(smileyPanel, "<set-?>");
        this.f161425h = smileyPanel;
    }

    public final void setSwitchSceneAvatar(ImageView imageView) {
        C87412m.m108594g(imageView, "<set-?>");
        this.f161421d = imageView;
    }

    public final void setSwitchSceneListener(C32224a<C13598b0> aVar) {
        this.f161439y = aVar;
    }

    public final void setSwitchSceneName(TextView textView) {
        C87412m.m108594g(textView, "<set-?>");
        this.f161422e = textView;
    }

    public final void setSwitchSceneTip(View view) {
        C87412m.m108594g(view, "<set-?>");
        this.f161423f = view;
    }

    public final void setSwitchSceneTipTv(TextView textView) {
        C87412m.m108594g(textView, "<set-?>");
        this.f161424g = textView;
    }

    public final void setTargetAvatar(ImageView imageView) {
        C87412m.m108594g(imageView, "<set-?>");
        this.f161432r = imageView;
    }
}
