package com.tencent.p014mm.plugin.sns.p106ui.improve.view;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85868k2;
import com.tencent.p014mm.plugin.sns.model.C94847c1;
import com.tencent.p014mm.plugin.sns.model.C94880h1;
import com.tencent.p014mm.plugin.sns.model.C94965w1;
import com.tencent.p014mm.plugin.sns.p106ui.C71253l1;
import com.tencent.p014mm.plugin.sns.p106ui.C96174r;
import com.tencent.p014mm.plugin.sns.p106ui.C96275w6;
import com.tencent.p014mm.plugin.sns.p106ui.SnsLikesTextView;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.view.x2c.X2CLinearLayout;
import fy3.C32224a;
import fy3.C32227p;
import gu2.C98214b;
import gv2.C98242p;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.util.ArrayList;
import ju2.C99050h;
import ju2.C99054m;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import kotlin.Metadata;
import oa1.C117731d;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import te3.w64;
import tu2.C101931d;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0013\b\u0016\u0012\b\u0010'\u001a\u0004\u0018\u00010&¢\u0006\u0004\b(\u0010)B\u001d\b\u0016\u0012\b\u0010'\u001a\u0004\u0018\u00010&\u0012\b\u0010+\u001a\u0004\u0018\u00010*¢\u0006\u0004\b(\u0010,B%\b\u0016\u0012\b\u0010'\u001a\u0004\u0018\u00010&\u0012\b\u0010+\u001a\u0004\u0018\u00010*\u0012\u0006\u0010.\u001a\u00020-¢\u0006\u0004\b(\u0010/J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u001b\u0010\u000e\u001a\u00020\t8FX\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001b\u0010\u0013\u001a\u00020\u000f8BX\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0018\u001a\u00020\u00148BX\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u000b\u001a\u0004\b\u0016\u0010\u0017R6\u0010!\u001a\u0016\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00198\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R6\u0010%\u001a\u0016\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00198\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\"\u0010\u001c\u001a\u0004\b#\u0010\u001e\"\u0004\b$\u0010 ¨\u00060"}, mo182094d2 = {"Lcom/tencent/mm/plugin/sns/ui/improve/view/ImproveInteractionLayout;", "Lcom/tencent/mm/view/x2c/X2CLinearLayout;", "Lgu2/b;", "info", "Lrx3/b0;", "setupLikeLayout", "setupDivider", "setupCommentLayout", "setupLayout", "Lcom/tencent/mm/plugin/sns/ui/SnsLikesTextView;", "d", "Lrx3/g;", "getLikeLayout", "()Lcom/tencent/mm/plugin/sns/ui/SnsLikesTextView;", "likeLayout", "Landroid/view/View;", "e", "getDivider", "()Landroid/view/View;", "divider", "Landroid/widget/LinearLayout;", "f", "getCommentLayout", "()Landroid/widget/LinearLayout;", "commentLayout", "Lkotlin/Function2;", "Lte3/w64;", "g", "Lfy3/p;", "getCommentClickListener", "()Lfy3/p;", "setCommentClickListener", "(Lfy3/p;)V", "commentClickListener", "h", "getCommentLongClickListener", "setCommentLongClickListener", "commentLongClickListener", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-sns_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.sns.ui.improve.view.ImproveInteractionLayout */
public final class ImproveInteractionLayout extends X2CLinearLayout {

    /* renamed from: i */
    public static final int f279865i;

    /* renamed from: j */
    public static final boolean f279866j;

    /* renamed from: d */
    public final C13601g f279867d = C36568h.m40985a(new C95891c(this));

    /* renamed from: e */
    public final C13601g f279868e = C36568h.m40985a(new C95890b(this));

    /* renamed from: f */
    public final C13601g f279869f = C36568h.m40985a(new C95889a(this));

    /* renamed from: g */
    public C32227p<? super View, ? super w64, C13598b0> f279870g;

    /* renamed from: h */
    public C32227p<? super View, ? super w64, C13598b0> f279871h;

    /* renamed from: com.tencent.mm.plugin.sns.ui.improve.view.ImproveInteractionLayout$a */
    public static final class C95889a extends C87413o implements C32224a<LinearLayout> {

        /* renamed from: d */
        public final /* synthetic */ ImproveInteractionLayout f279872d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C95889a(ImproveInteractionLayout improveInteractionLayout) {
            super(0);
            this.f279872d = improveInteractionLayout;
        }

        public Object invoke() {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveInteractionLayout$commentLayout$2");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveInteractionLayout$commentLayout$2");
            LinearLayout linearLayout = (LinearLayout) this.f279872d.findViewById(C0966R.C0970id.oeu);
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveInteractionLayout$commentLayout$2");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveInteractionLayout$commentLayout$2");
            return linearLayout;
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.improve.view.ImproveInteractionLayout$b */
    public static final class C95890b extends C87413o implements C32224a<View> {

        /* renamed from: d */
        public final /* synthetic */ ImproveInteractionLayout f279873d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C95890b(ImproveInteractionLayout improveInteractionLayout) {
            super(0);
            this.f279873d = improveInteractionLayout;
        }

        public Object invoke() {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveInteractionLayout$divider$2");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveInteractionLayout$divider$2");
            View findViewById = this.f279873d.findViewById(C0966R.C0970id.oet);
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveInteractionLayout$divider$2");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveInteractionLayout$divider$2");
            return findViewById;
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.improve.view.ImproveInteractionLayout$c */
    public static final class C95891c extends C87413o implements C32224a<SnsLikesTextView> {

        /* renamed from: d */
        public final /* synthetic */ ImproveInteractionLayout f279874d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C95891c(ImproveInteractionLayout improveInteractionLayout) {
            super(0);
            this.f279874d = improveInteractionLayout;
        }

        public Object invoke() {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveInteractionLayout$likeLayout$2");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveInteractionLayout$likeLayout$2");
            SnsLikesTextView snsLikesTextView = (SnsLikesTextView) this.f279874d.findViewById(C0966R.C0970id.oey);
            snsLikesTextView.setClickable(true);
            snsLikesTextView.setLikedTextTouchListener(new C71253l1());
            Context context = this.f279874d.getContext();
            C87412m.m108592e(context, "null cannot be cast to non-null type android.app.Activity");
            snsLikesTextView.setClickableCallBack(new C96174r((Activity) context, 0, new C94880h1(2)));
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveInteractionLayout$likeLayout$2");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveInteractionLayout$likeLayout$2");
            return snsLikesTextView;
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.improve.view.ImproveInteractionLayout$d */
    public static final class C95892d implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ ImproveInteractionLayout f279875d;

        /* renamed from: e */
        public final /* synthetic */ C98214b f279876e;

        /* renamed from: f */
        public final /* synthetic */ int f279877f;

        public C95892d(ImproveInteractionLayout improveInteractionLayout, C98214b bVar, int i) {
            this.f279875d = improveInteractionLayout;
            this.f279876e = bVar;
            this.f279877f = i;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/sns/ui/improve/view/ImproveInteractionLayout$setupCommentLayout$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveInteractionLayout$setupCommentLayout$1");
            C32227p<View, w64, C13598b0> commentClickListener = this.f279875d.getCommentClickListener();
            if (commentClickListener != null) {
                C87412m.m108593f(view, LocaleUtil.ITALIAN);
                w64 w64 = this.f279876e.getCommentList().get(this.f279877f);
                C87412m.m108593f(w64, "info.commentList[i]");
                commentClickListener.invoke(view, w64);
            }
            SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveInteractionLayout$setupCommentLayout$1");
            C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/improve/view/ImproveInteractionLayout$setupCommentLayout$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.improve.view.ImproveInteractionLayout$e */
    public static final class C95893e implements View.OnLongClickListener {

        /* renamed from: d */
        public final /* synthetic */ ImproveInteractionLayout f279878d;

        /* renamed from: e */
        public final /* synthetic */ C98214b f279879e;

        /* renamed from: f */
        public final /* synthetic */ int f279880f;

        public C95893e(ImproveInteractionLayout improveInteractionLayout, C98214b bVar, int i) {
            this.f279878d = improveInteractionLayout;
            this.f279879e = bVar;
            this.f279880f = i;
        }

        public final boolean onLongClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/sns/ui/improve/view/ImproveInteractionLayout$setupCommentLayout$2", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
            SnsMethodCalculate.markStartTimeMs("onLongClick", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveInteractionLayout$setupCommentLayout$2");
            C32227p<View, w64, C13598b0> commentLongClickListener = this.f279878d.getCommentLongClickListener();
            if (commentLongClickListener != null) {
                C87412m.m108593f(view, "v");
                w64 w64 = this.f279879e.getCommentList().get(this.f279880f);
                C87412m.m108593f(w64, "info.commentList[i]");
                commentLongClickListener.invoke(view, w64);
            }
            SnsMethodCalculate.markEndTimeMs("onLongClick", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveInteractionLayout$setupCommentLayout$2");
            C117292a.m165362h(true, this, "com/tencent/mm/plugin/sns/ui/improve/view/ImproveInteractionLayout$setupCommentLayout$2", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
            return true;
        }
    }

    static {
        SnsMethodCalculate.markStartTimeMs("getLikeCollapseLines", "com.tencent.mm.plugin.sns.ui.item.improve.config.TimelineItemConfig");
        boolean z = false;
        int safeParseInt = Util.safeParseInt(C117731d.m166007c().mo182444f("clicfg_sns_like_collapse_lines", "0", false, true));
        SnsMethodCalculate.markEndTimeMs("getLikeCollapseLines", "com.tencent.mm.plugin.sns.ui.item.improve.config.TimelineItemConfig");
        f279865i = safeParseInt;
        SnsMethodCalculate.markStartTimeMs("enableLikeCollapse", "com.tencent.mm.plugin.sns.ui.item.improve.config.TimelineItemConfig");
        if (Util.safeParseInt(C117731d.m166007c().mo182444f("clicfg_sns_like_collapse_enable", "0", false, true)) == 1) {
            z = true;
        }
        SnsMethodCalculate.markEndTimeMs("enableLikeCollapse", "com.tencent.mm.plugin.sns.ui.item.improve.config.TimelineItemConfig");
        f279866j = z;
    }

    public ImproveInteractionLayout(Context context) {
        super(context);
        C85868k2.m106137b(getContext()).inflate(C0966R.C0971layout.d_4, this, true);
    }

    private final LinearLayout getCommentLayout() {
        SnsMethodCalculate.markStartTimeMs("getCommentLayout", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveInteractionLayout");
        Object value = this.f279869f.getValue();
        C87412m.m108593f(value, "<get-commentLayout>(...)");
        LinearLayout linearLayout = (LinearLayout) value;
        SnsMethodCalculate.markEndTimeMs("getCommentLayout", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveInteractionLayout");
        return linearLayout;
    }

    private final View getDivider() {
        SnsMethodCalculate.markStartTimeMs("getDivider", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveInteractionLayout");
        Object value = this.f279868e.getValue();
        C87412m.m108593f(value, "<get-divider>(...)");
        View view = (View) value;
        SnsMethodCalculate.markEndTimeMs("getDivider", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveInteractionLayout");
        return view;
    }

    private final void setupCommentLayout(C98214b bVar) {
        String str;
        String str2;
        C98214b bVar2 = bVar;
        SnsMethodCalculate.markStartTimeMs("setupCommentLayout", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveInteractionLayout");
        while (true) {
            str = "context";
            if (getCommentLayout().getChildCount() >= bVar.getCommentList().size()) {
                break;
            }
            Context context = getContext();
            C87412m.m108593f(context, str);
            getCommentLayout().addView((ImproveCommentView) C101931d.f300107a.mo141428a(ImproveCommentView.class, context));
        }
        while (getCommentLayout().getChildCount() > bVar.getCommentList().size()) {
            C101931d.f300107a.mo141429b(getCommentLayout().getChildAt(getCommentLayout().getChildCount() - 1));
        }
        int i = 0;
        int size = bVar.getCommentList().size();
        while (i < size) {
            Context context2 = getContext();
            C87412m.m108593f(context2, str);
            w64 w64 = bVar.getCommentList().get(i);
            C87412m.m108593f(w64, "info.commentList[i]");
            w64 w642 = w64;
            SnsMethodCalculate.markStartTimeMs("packageCommentContent", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveInteractionUtil");
            C99050h hVar = new C99050h(w642, context2);
            int type = bVar.getType();
            String userName = bVar.getUserName();
            int i2 = size;
            SnsMethodCalculate.markStartTimeMs("enableCommentStory", "com.tencent.mm.plugin.sns.model.SnsConfig");
            C94847c1.m120219g();
            boolean z = C94847c1.f274792b;
            SnsMethodCalculate.markEndTimeMs("enableCommentStory", "com.tencent.mm.plugin.sns.model.SnsConfig");
            SnsMethodCalculate.markStartTimeMs("enableLikeStory", "com.tencent.mm.plugin.sns.model.SnsConfig");
            C94847c1.m120219g();
            boolean z2 = C94847c1.f274793c;
            SnsMethodCalculate.markEndTimeMs("enableLikeStory", "com.tencent.mm.plugin.sns.model.SnsConfig");
            String str3 = str;
            CharSequence c = C98242p.m126941c(context2, w642, hVar, type, userName, 1, z, z2, bVar.mo137505C2());
            SnsMethodCalculate.markEndTimeMs("packageCommentContent", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveInteractionUtil");
            View childAt = getCommentLayout().getChildAt(i);
            C87412m.m108592e(childAt, "null cannot be cast to non-null type com.tencent.mm.plugin.sns.ui.improve.view.ImproveCommentView");
            ImproveCommentView improveCommentView = (ImproveCommentView) childAt;
            improveCommentView.setOnClickListener(new C95892d(this, bVar2, i));
            improveCommentView.setOnLongClickListener(new C95893e(this, bVar2, i));
            w64 w643 = bVar.getCommentList().get(i);
            C87412m.m108593f(w643, "info.commentList[i]");
            w64 w644 = w643;
            int i3 = w644.f299709j;
            String d = C94965w1.m120623d(bVar.mo137504B2(), i3 != 0 ? String.valueOf(i3) : String.valueOf(w644.f299714r));
            String A2 = bVar.mo137503A2();
            C87412m.m108593f(d, "transID");
            SnsMethodCalculate.markStartTimeMs("updateContent", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveCommentView");
            improveCommentView.f279837o = w644;
            improveCommentView.f279838p = c;
            improveCommentView.f279839q = A2;
            SnsMethodCalculate.markStartTimeMs("updateUIStyle", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveCommentView");
            int i4 = i == 0 ? 6 : 4;
            improveCommentView.setBackgroundResource(i == 0 ? C0966R.C0969drawable.au_ : C0966R.C0969drawable.f357356at2);
            improveCommentView.setPadding(C76577a.m92151b(improveCommentView.getContext(), 8), C76577a.m92151b(improveCommentView.getContext(), i4), improveCommentView.getPaddingRight(), C76577a.m92151b(improveCommentView.getContext(), 3));
            SnsMethodCalculate.markEndTimeMs("updateUIStyle", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveCommentView");
            improveCommentView.mo133348l();
            SnsMethodCalculate.markStartTimeMs("updateTranslateLayout", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveCommentView");
            if (C94965w1.m120626g(d, 2)) {
                C94965w1.C94967b e = C94965w1.m120624e(d);
                str2 = "com.tencent.mm.plugin.sns.ui.improve.view.ImproveCommentView";
                improveCommentView.mo67331b(e, 1, e.f275304b, e.f275305c, e.f275309g);
            } else {
                str2 = "com.tencent.mm.plugin.sns.ui.improve.view.ImproveCommentView";
                improveCommentView.mo67332e();
            }
            SnsMethodCalculate.markEndTimeMs("updateTranslateLayout", str2);
            SnsMethodCalculate.markEndTimeMs("updateContent", str2);
            improveCommentView.requestLayout();
            i++;
            size = i2;
            str = str3;
        }
        SnsMethodCalculate.markEndTimeMs("setupCommentLayout", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveInteractionLayout");
    }

    private final void setupDivider(C98214b bVar) {
        SnsMethodCalculate.markStartTimeMs("setupDivider", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveInteractionLayout");
        if (bVar.mo137525y2().mo138165b() <= 0 || bVar.getCommentList().size() <= 0) {
            View divider = getDivider();
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            View view = divider;
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/sns/ui/improve/view/ImproveInteractionLayout", "setupDivider", "(Lcom/tencent/mm/plugin/sns/ui/improve/model/ImproveSnsInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            divider.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/sns/ui/improve/view/ImproveInteractionLayout", "setupDivider", "(Lcom/tencent/mm/plugin/sns/ui/improve/model/ImproveSnsInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            View divider2 = getDivider();
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar2.mo10233c(0);
            View view2 = divider2;
            C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/sns/ui/improve/view/ImproveInteractionLayout", "setupDivider", "(Lcom/tencent/mm/plugin/sns/ui/improve/model/ImproveSnsInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            divider2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/sns/ui/improve/view/ImproveInteractionLayout", "setupDivider", "(Lcom/tencent/mm/plugin/sns/ui/improve/model/ImproveSnsInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        SnsMethodCalculate.markEndTimeMs("setupDivider", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveInteractionLayout");
    }

    private final void setupLikeLayout(C98214b bVar) {
        SnsMethodCalculate.markStartTimeMs("setupLikeLayout", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveInteractionLayout");
        if (bVar.mo137525y2().mo138165b() <= 0) {
            getLikeLayout().setVisibility(8);
        } else {
            getLikeLayout().setVisibility(0);
            getLikeLayout().mo132829d(bVar.mo137525y2(), C99054m.f290360a.mo138406a(bVar), bVar.mo137503A2(), f279865i, f279866j, (C96275w6) null);
        }
        SnsMethodCalculate.markEndTimeMs("setupLikeLayout", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveInteractionLayout");
    }

    /* renamed from: a */
    public final void mo133366a(int i, C94965w1.C94967b bVar, int i2, String str, String str2, boolean z) {
        SnsMethodCalculate.markStartTimeMs("finishTranslate", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveInteractionLayout");
        if (i < 0) {
            SnsMethodCalculate.markEndTimeMs("finishTranslate", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveInteractionLayout");
            return;
        }
        View childAt = getCommentLayout().getChildAt(i);
        C87412m.m108592e(childAt, "null cannot be cast to non-null type com.tencent.mm.plugin.sns.ui.improve.view.ImproveCommentView");
        ((ImproveCommentView) childAt).mo67331b(bVar, i2, str, str2, z);
        SnsMethodCalculate.markEndTimeMs("finishTranslate", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveInteractionLayout");
    }

    /* renamed from: b */
    public final void mo133367b(int i) {
        SnsMethodCalculate.markStartTimeMs("hideTranslate", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveInteractionLayout");
        if (i < 0) {
            SnsMethodCalculate.markEndTimeMs("hideTranslate", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveInteractionLayout");
            return;
        }
        View childAt = getCommentLayout().getChildAt(i);
        C87412m.m108592e(childAt, "null cannot be cast to non-null type com.tencent.mm.plugin.sns.ui.improve.view.ImproveCommentView");
        ((ImproveCommentView) childAt).mo67332e();
        SnsMethodCalculate.markEndTimeMs("hideTranslate", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveInteractionLayout");
    }

    /* renamed from: e */
    public final void mo133368e(int i) {
        SnsMethodCalculate.markStartTimeMs("startTranslate", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveInteractionLayout");
        if (i < 0) {
            SnsMethodCalculate.markEndTimeMs("startTranslate", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveInteractionLayout");
            return;
        }
        View childAt = getCommentLayout().getChildAt(i);
        C87412m.m108592e(childAt, "null cannot be cast to non-null type com.tencent.mm.plugin.sns.ui.improve.view.ImproveCommentView");
        ((ImproveCommentView) childAt).mo67336j();
        SnsMethodCalculate.markEndTimeMs("startTranslate", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveInteractionLayout");
    }

    public final C32227p<View, w64, C13598b0> getCommentClickListener() {
        SnsMethodCalculate.markStartTimeMs("getCommentClickListener", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveInteractionLayout");
        C32227p<? super View, ? super w64, C13598b0> pVar = this.f279870g;
        SnsMethodCalculate.markEndTimeMs("getCommentClickListener", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveInteractionLayout");
        return pVar;
    }

    public final C32227p<View, w64, C13598b0> getCommentLongClickListener() {
        SnsMethodCalculate.markStartTimeMs("getCommentLongClickListener", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveInteractionLayout");
        C32227p<? super View, ? super w64, C13598b0> pVar = this.f279871h;
        SnsMethodCalculate.markEndTimeMs("getCommentLongClickListener", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveInteractionLayout");
        return pVar;
    }

    public final SnsLikesTextView getLikeLayout() {
        SnsMethodCalculate.markStartTimeMs("getLikeLayout", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveInteractionLayout");
        Object value = this.f279867d.getValue();
        C87412m.m108593f(value, "<get-likeLayout>(...)");
        SnsLikesTextView snsLikesTextView = (SnsLikesTextView) value;
        SnsMethodCalculate.markEndTimeMs("getLikeLayout", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveInteractionLayout");
        return snsLikesTextView;
    }

    public final void setCommentClickListener(C32227p<? super View, ? super w64, C13598b0> pVar) {
        SnsMethodCalculate.markStartTimeMs("setCommentClickListener", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveInteractionLayout");
        this.f279870g = pVar;
        SnsMethodCalculate.markEndTimeMs("setCommentClickListener", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveInteractionLayout");
    }

    public final void setCommentLongClickListener(C32227p<? super View, ? super w64, C13598b0> pVar) {
        SnsMethodCalculate.markStartTimeMs("setCommentLongClickListener", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveInteractionLayout");
        this.f279871h = pVar;
        SnsMethodCalculate.markEndTimeMs("setCommentLongClickListener", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveInteractionLayout");
    }

    public final void setupLayout(C98214b bVar) {
        SnsMethodCalculate.markStartTimeMs("setupLayout", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveInteractionLayout");
        C87412m.m108594g(bVar, "info");
        setupLikeLayout(bVar);
        setupDivider(bVar);
        setupCommentLayout(bVar);
        SnsMethodCalculate.markEndTimeMs("setupLayout", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveInteractionLayout");
    }

    public ImproveInteractionLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C85868k2.m106137b(getContext()).inflate(C0966R.C0971layout.d_4, this, true);
    }

    public ImproveInteractionLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C85868k2.m106137b(getContext()).inflate(C0966R.C0971layout.d_4, this, true);
    }
}
