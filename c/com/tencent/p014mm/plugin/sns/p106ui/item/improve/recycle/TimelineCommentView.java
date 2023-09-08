package com.tencent.p014mm.plugin.sns.p106ui.item.improve.recycle;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74942w4;
import com.tencent.p014mm.plugin.sns.model.C94866e1;
import com.tencent.p014mm.plugin.sns.model.C94965w1;
import com.tencent.p014mm.plugin.sns.p106ui.C43151t;
import com.tencent.p014mm.plugin.sns.p106ui.C96230u;
import com.tencent.p014mm.plugin.sns.p106ui.C96275w6;
import com.tencent.p014mm.plugin.sns.p106ui.SnsLikesTextView;
import com.tencent.p014mm.plugin.sns.p106ui.TranslateCommentTextView;
import com.tencent.p014mm.plugin.sns.p106ui.item.BaseTimeLineItem;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.p106ui.widget.SnsCommentCollapseLayout;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import com.tencent.p014mm.protocal.protobuf.TimeLineObject;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import de3.C75355a0;
import de3.C75360c0;
import di3.C86312j;
import fy3.C32224a;
import fy3.C32228q;
import fy3.C32229r;
import go3.C76003c;
import gv2.C98242p;
import gy3.C87412m;
import gy3.C87413o;
import ip3.C98780b;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import kotlin.Metadata;
import ls2.C99591a;
import oa1.C117731d;
import op3.C117882j;
import p773yy.C79168k;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import te3.w64;
import tu2.C101929b;
import tu2.C101930c;
import tu2.C101931d;
import tu2.C52365a;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\r\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002B\u0013\b\u0016\u0012\b\u00100\u001a\u0004\u0018\u00010/¢\u0006\u0004\b1\u00102B\u001d\b\u0016\u0012\b\u00100\u001a\u0004\u0018\u00010/\u0012\b\u00104\u001a\u0004\u0018\u000103¢\u0006\u0004\b1\u00105B%\b\u0016\u0012\b\u00100\u001a\u0004\u0018\u00010/\u0012\b\u00104\u001a\u0004\u0018\u000103\u0012\u0006\u00106\u001a\u00020\u001f¢\u0006\u0004\b1\u00107R\u001b\u0010\b\u001a\u00020\u00038FX\u0002¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\r\u001a\u00020\t8BX\u0002¢\u0006\f\n\u0004\b\n\u0010\u0005\u001a\u0004\b\u000b\u0010\fR\u001b\u0010\u0011\u001a\u00020\u00018FX\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u0005\u001a\u0004\b\u000f\u0010\u0010RB\u0010\u001d\u001a\"\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00128\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR<\u0010&\u001a\u001c\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u001e8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R$\u0010.\u001a\u0004\u0018\u00010'8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-¨\u00068"}, mo182094d2 = {"Lcom/tencent/mm/plugin/sns/ui/item/improve/recycle/TimelineCommentView;", "Landroid/widget/LinearLayout;", "Ltu2/c;", "Lcom/tencent/mm/plugin/sns/ui/SnsLikesTextView;", "d", "Lrx3/g;", "getLikeLayout", "()Lcom/tencent/mm/plugin/sns/ui/SnsLikesTextView;", "likeLayout", "Landroid/view/View;", "e", "getDivider", "()Landroid/view/View;", "divider", "f", "getCommentLayout", "()Landroid/widget/LinearLayout;", "commentLayout", "Lkotlin/Function4;", "Lte3/w64;", "", "", "Lrx3/b0;", "i", "Lfy3/r;", "getCommentClickListener", "()Lfy3/r;", "setCommentClickListener", "(Lfy3/r;)V", "commentClickListener", "Lkotlin/Function3;", "", "j", "Lfy3/q;", "getCommentLongClickListener", "()Lfy3/q;", "setCommentLongClickListener", "(Lfy3/q;)V", "commentLongClickListener", "Landroid/view/View$OnClickListener;", "n", "Landroid/view/View$OnClickListener;", "getSingleCommentCollapseClickListener", "()Landroid/view/View$OnClickListener;", "setSingleCommentCollapseClickListener", "(Landroid/view/View$OnClickListener;)V", "singleCommentCollapseClickListener", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-sns_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.sns.ui.item.improve.recycle.TimelineCommentView */
public final class TimelineCommentView extends LinearLayout implements C101930c {

    /* renamed from: d */
    public final C13601g f280082d = C36568h.m40985a(new C43122c(this));

    /* renamed from: e */
    public final C13601g f280083e = C36568h.m40985a(new C43121b(this));

    /* renamed from: f */
    public final C13601g f280084f = C36568h.m40985a(new C43120a(this));

    /* renamed from: g */
    public int f280085g;

    /* renamed from: h */
    public boolean f280086h;

    /* renamed from: i */
    public C32229r<? super View, ? super w64, ? super String, ? super CharSequence, C13598b0> f280087i;

    /* renamed from: j */
    public C32228q<? super View, ? super Integer, ? super Integer, C13598b0> f280088j;

    /* renamed from: n */
    public View.OnClickListener f280089n;

    /* renamed from: com.tencent.mm.plugin.sns.ui.item.improve.recycle.TimelineCommentView$a */
    public static final class C43120a extends C87413o implements C32224a<LinearLayout> {

        /* renamed from: d */
        public final /* synthetic */ TimelineCommentView f116686d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C43120a(TimelineCommentView timelineCommentView) {
            super(0);
            this.f116686d = timelineCommentView;
        }

        public Object invoke() {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.improve.recycle.TimelineCommentView$commentLayout$2");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.improve.recycle.TimelineCommentView$commentLayout$2");
            LinearLayout linearLayout = new LinearLayout(this.f116686d.getContext());
            linearLayout.setOrientation(1);
            this.f116686d.addView(linearLayout, new ViewGroup.LayoutParams(-1, -2));
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.improve.recycle.TimelineCommentView$commentLayout$2");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.improve.recycle.TimelineCommentView$commentLayout$2");
            return linearLayout;
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.item.improve.recycle.TimelineCommentView$b */
    public static final class C43121b extends C87413o implements C32224a<View> {

        /* renamed from: d */
        public final /* synthetic */ TimelineCommentView f116687d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C43121b(TimelineCommentView timelineCommentView) {
            super(0);
            this.f116687d = timelineCommentView;
        }

        public Object invoke() {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.improve.recycle.TimelineCommentView$divider$2");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.improve.recycle.TimelineCommentView$divider$2");
            View view = new View(this.f116687d.getContext());
            view.setBackgroundColor(C76577a.m92153d(this.f116687d.getContext(), C0966R.color.abr));
            this.f116687d.addView(view, 1, new ViewGroup.LayoutParams(-1, 1));
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.improve.recycle.TimelineCommentView$divider$2");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.improve.recycle.TimelineCommentView$divider$2");
            return view;
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.item.improve.recycle.TimelineCommentView$c */
    public static final class C43122c extends C87413o implements C32224a<SnsLikesTextView> {

        /* renamed from: d */
        public final /* synthetic */ TimelineCommentView f116688d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C43122c(TimelineCommentView timelineCommentView) {
            super(0);
            this.f116688d = timelineCommentView;
        }

        public Object invoke() {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.improve.recycle.TimelineCommentView$likeLayout$2");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.improve.recycle.TimelineCommentView$likeLayout$2");
            SnsLikesTextView snsLikesTextView = new SnsLikesTextView(this.f116688d.getContext(), (AttributeSet) null);
            snsLikesTextView.setGravity(16);
            ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -2);
            int f = C76577a.m92155f(this.f116688d.getContext(), C0966R.dimen.f3956le);
            int f2 = C76577a.m92155f(this.f116688d.getContext(), C0966R.dimen.f3623g);
            snsLikesTextView.setPadding(f, f2, f, f2);
            this.f116688d.addView(snsLikesTextView, 0, layoutParams);
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.improve.recycle.TimelineCommentView$likeLayout$2");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.improve.recycle.TimelineCommentView$likeLayout$2");
            return snsLikesTextView;
        }
    }

    public TimelineCommentView(Context context) {
        super(context);
        SnsMethodCalculate.markStartTimeMs("getLikeCollapseLines", "com.tencent.mm.plugin.sns.ui.item.improve.config.TimelineItemConfig");
        boolean z = false;
        int safeParseInt = Util.safeParseInt(C117731d.m166007c().mo182444f("clicfg_sns_like_collapse_lines", "0", false, true));
        SnsMethodCalculate.markEndTimeMs("getLikeCollapseLines", "com.tencent.mm.plugin.sns.ui.item.improve.config.TimelineItemConfig");
        this.f280085g = safeParseInt;
        SnsMethodCalculate.markStartTimeMs("enableLikeCollapse", "com.tencent.mm.plugin.sns.ui.item.improve.config.TimelineItemConfig");
        z = Util.safeParseInt(C117731d.m166007c().mo182444f("clicfg_sns_like_collapse_enable", "0", false, true)) == 1 ? true : z;
        SnsMethodCalculate.markEndTimeMs("enableLikeCollapse", "com.tencent.mm.plugin.sns.ui.item.improve.config.TimelineItemConfig");
        this.f280086h = z;
        setBackgroundResource(C0966R.C0969drawable.a6s);
        setOrientation(1);
    }

    private final View getDivider() {
        SnsMethodCalculate.markStartTimeMs("getDivider", "com.tencent.mm.plugin.sns.ui.item.improve.recycle.TimelineCommentView");
        View view = (View) this.f280083e.getValue();
        SnsMethodCalculate.markEndTimeMs("getDivider", "com.tencent.mm.plugin.sns.ui.item.improve.recycle.TimelineCommentView");
        return view;
    }

    /* renamed from: a */
    public final void mo133451a(C96275w6 w6Var, int i) {
        int i2;
        String str;
        int i3;
        String str2;
        LinearLayout linearLayout;
        C94965w1.C94967b bVar;
        boolean z;
        View view;
        boolean z2;
        LinearLayout linearLayout2;
        C98780b<C117882j> bVar2;
        int i4;
        int i5;
        int i6;
        w64 w64;
        View view2;
        int i7;
        String str3;
        TimelineCommentView timelineCommentView;
        String str4;
        boolean z3;
        w64 w642;
        String str5;
        String str6;
        String str7;
        int i8;
        SnsInfo snsInfo;
        View view3;
        int i9;
        int i15;
        Drawable drawable;
        int i16;
        int i17;
        TranslateCommentTextView translateCommentTextView;
        TranslateCommentTextView translateCommentTextView2;
        TimelineCommentView timelineCommentView2 = this;
        C96275w6 w6Var2 = w6Var;
        String str8 = "loadCommentData";
        String str9 = "com.tencent.mm.plugin.sns.ui.item.improve.recycle.TimelineCommentView";
        SnsMethodCalculate.markStartTimeMs(str8, str9);
        C87412m.m108594g(w6Var2, "struct");
        C98780b<C117882j> bVar3 = w6Var2.f281363W;
        int i18 = 0;
        boolean z4 = (bVar3 != null ? bVar3.mo138165b() : 0) > 0;
        C98780b<C117882j> bVar4 = w6Var2.f281364X;
        boolean z5 = (bVar4 != null ? bVar4.mo138165b() : 0) > 0;
        SnsLikesTextView likeLayout = getLikeLayout();
        if (z4) {
            SnsMethodCalculate.markStartTimeMs("loadLikeLayout", str9);
            C98780b<C117882j> bVar5 = w6Var2.f281363W;
            if (bVar5 != null) {
                bVar5.mo138165b();
            }
            getLikeLayout().mo132829d(w6Var2.f281363W, i, w6Var2.f281381h, timelineCommentView2.f280085g, timelineCommentView2.f280086h, w6Var);
            SnsMethodCalculate.markEndTimeMs("loadLikeLayout", str9);
            i2 = 0;
        } else {
            i2 = 8;
        }
        likeLayout.setVisibility(i2);
        View divider = getDivider();
        int i19 = (!z4 || !z5) ? 8 : 0;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(Integer.valueOf(i19));
        View view4 = divider;
        C117292a.m165358d(view4, aVar.mo10232b(), "com/tencent/mm/plugin/sns/ui/item/improve/recycle/TimelineCommentView", "loadCommentData", "(Lcom/tencent/mm/plugin/sns/ui/SnsTimeLineVendingStruct;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        divider.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view4, "com/tencent/mm/plugin/sns/ui/item/improve/recycle/TimelineCommentView", "loadCommentData", "(Lcom/tencent/mm/plugin/sns/ui/SnsTimeLineVendingStruct;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        LinearLayout commentLayout = getCommentLayout();
        if (z5) {
            String str10 = "loadCommentLayout";
            SnsMethodCalculate.markStartTimeMs(str10, str9);
            w6Var2.f281371c.CommentUserList.size();
            LinkedList<w64> linkedList = w6Var2.f281371c.CommentUserList;
            SnsInfo snsInfo2 = w6Var2.f281367a;
            C87412m.m108593f(snsInfo2, "struct.mSnsInfo");
            C98780b<C117882j> bVar6 = w6Var2.f281364X;
            LinearLayout commentLayout2 = getCommentLayout();
            int childCount = commentLayout2.getChildCount();
            int b = bVar6.mo138165b();
            if (childCount > b) {
                for (int i25 = b; i25 < childCount; i25++) {
                    View childAt = commentLayout2.getChildAt(b);
                    commentLayout2.removeViewAt(b);
                    if (childAt instanceof SnsCommentCollapseLayout) {
                        C101931d.f300107a.mo141429b(childAt);
                    }
                }
            }
            int b2 = bVar6.mo138165b();
            int i26 = 0;
            int i27 = 0;
            while (i27 < b2) {
                C117882j a = bVar6.mo138164a(i27);
                Long l = (Long) a.mo182596a(i18);
                int i28 = b2;
                String str11 = (String) a.mo182596a(1);
                String str12 = str8;
                String str13 = (String) a.mo182596a(3);
                LinearLayout linearLayout3 = commentLayout;
                CharSequence charSequence = (CharSequence) a.mo182596a(4);
                String str14 = (String) a.mo182596a(2);
                String str15 = (String) a.mo182596a(5);
                String str16 = str10;
                CharSequence charSequence2 = (CharSequence) a.mo182596a(6);
                if (!Util.isNullOrNil(str15)) {
                    C87412m.m108593f(l, "theCommentId");
                    l.longValue();
                }
                C87412m.m108593f(l, "theCommentId");
                l.longValue();
                w64 w643 = linkedList.get(i27);
                C98780b<C117882j> bVar7 = bVar6;
                int i29 = w643.f299716t;
                LinkedList<w64> linkedList2 = linkedList;
                int i35 = w643.f299715s;
                int i36 = i27;
                ArrayList<C94965w1.C94967b> arrayList = w6Var2.f281380g0;
                String str17 = str13;
                C87412m.m108593f(arrayList, "struct.commentTranslateInfo");
                String str18 = w6Var2.f281382i;
                C87412m.m108593f(str18, "struct.mSnsId");
                long longValue = l.longValue();
                SnsMethodCalculate.markStartTimeMs("getCommentTranslateInfo", str9);
                SnsInfo snsInfo3 = snsInfo2;
                if (arrayList.size() <= 0) {
                    SnsMethodCalculate.markEndTimeMs("getCommentTranslateInfo", str9);
                } else {
                    Iterator<C94965w1.C94967b> it = arrayList.iterator();
                    while (it.hasNext()) {
                        C94965w1.C94967b next = it.next();
                        Iterator<C94965w1.C94967b> it4 = it;
                        String str19 = next.f275303a;
                        if (str19 != null) {
                            C94965w1.C94967b bVar8 = next;
                            StringBuilder sb = new StringBuilder();
                            sb.append(longValue);
                            long j = longValue;
                            sb.append("");
                            if (C87412m.m108589b(str19, C94965w1.m120623d(str18, sb.toString()))) {
                                SnsMethodCalculate.markEndTimeMs("getCommentTranslateInfo", str9);
                                bVar = bVar8;
                                break;
                            }
                            it = it4;
                            longValue = j;
                        } else {
                            it = it4;
                        }
                    }
                    SnsMethodCalculate.markEndTimeMs("getCommentTranslateInfo", str9);
                }
                bVar = null;
                if (bVar != null && bVar.f275307e) {
                    C94965w1.m120629j(bVar.f275303a, 2);
                }
                if (i26 >= childCount) {
                    if (bVar == null || bVar.f275307e) {
                        Context context = getContext();
                        C87412m.m108593f(context, "context");
                        View a2 = C101931d.f300107a.mo141428a(SnsCommentCollapseLayout.class, context);
                        SnsCommentCollapseLayout snsCommentCollapseLayout = (SnsCommentCollapseLayout) a2;
                        snsCommentCollapseLayout.mo134081f(1, ((float) 15) * C76577a.m92165p(getContext()));
                        snsCommentCollapseLayout.setTextColor(getContext().getResources().getColor(C0966R.color.FG_0_5));
                        snsCommentCollapseLayout.setGravity(16);
                        translateCommentTextView2 = a2;
                    } else {
                        TranslateCommentTextView translateCommentTextView3 = new TranslateCommentTextView(getContext());
                        float f = (float) 15;
                        translateCommentTextView3.getTranslateResultView().mo133018i(1, C76577a.m92165p(getContext()) * f);
                        translateCommentTextView3.getOriginCommentTextView().setTextSize(1, f * C76577a.m92165p(getContext()));
                        translateCommentTextView2 = translateCommentTextView3;
                    }
                    view = translateCommentTextView2;
                    z = true;
                } else {
                    View childAt2 = commentLayout2.getChildAt(i26);
                    C87412m.m108593f(childAt2, "commentLinear.getChildAt(index)");
                    view = childAt2;
                    z = false;
                }
                if (bVar != null) {
                    if (!(view instanceof TranslateCommentTextView)) {
                        commentLayout2.removeView(view);
                        TranslateCommentTextView translateCommentTextView4 = new TranslateCommentTextView(getContext());
                        commentLayout2.addView(translateCommentTextView4, i26);
                        translateCommentTextView4.getTranslateResultView().mo133015e();
                        float f2 = (float) 15;
                        i17 = i26;
                        i16 = childCount;
                        translateCommentTextView4.getTranslateResultView().mo133018i(1, f2 * C76577a.m92165p(translateCommentTextView4.getContext()));
                        translateCommentTextView4.getOriginCommentTextView().setTextSize(1, f2 * C76577a.m92165p(translateCommentTextView4.getContext()));
                        translateCommentTextView = translateCommentTextView4;
                    } else {
                        i17 = i26;
                        i16 = childCount;
                        translateCommentTextView = view;
                    }
                    view2 = translateCommentTextView;
                    view2.setOnTouchListener((View.OnTouchListener) null);
                    TranslateCommentTextView translateCommentTextView5 = (TranslateCommentTextView) view2;
                    TextView originCommentTextView = translateCommentTextView5.getOriginCommentTextView();
                    C87412m.m108593f(originCommentTextView, "translateCommentTextView.originCommentTextView");
                    C87412m.m108593f(charSequence2, "shorCommentCharSeq");
                    C87412m.m108593f(charSequence, "theCommentCharSeq");
                    int i37 = i17;
                    i6 = i36;
                    i5 = i28;
                    String str20 = str14;
                    CharSequence charSequence3 = charSequence;
                    TranslateCommentTextView translateCommentTextView6 = translateCommentTextView5;
                    i4 = i16;
                    int i38 = i29;
                    LinearLayout linearLayout4 = commentLayout2;
                    int i39 = i35;
                    LinearLayout linearLayout5 = linearLayout4;
                    bVar2 = bVar7;
                    mo133452b(originCommentTextView, charSequence2, charSequence3, i38, i39, w643);
                    if (!bVar.f275306d) {
                        translateCommentTextView6.mo133138c();
                    } else if (!bVar.f275307e) {
                        translateCommentTextView6.mo133136a(bVar, bVar.f275304b, bVar.f275305c);
                    } else {
                        translateCommentTextView6.getTranslateResultView().setVisibility(8);
                        z2 = z;
                        str4 = str9;
                        str3 = str20;
                        w64 = w643;
                        linearLayout2 = linearLayout5;
                        z3 = true;
                        i7 = i37;
                        timelineCommentView = this;
                    }
                    z2 = z;
                    str4 = str9;
                    str3 = str20;
                    w64 = w643;
                    linearLayout2 = linearLayout5;
                    z3 = true;
                    i7 = i37;
                    timelineCommentView = this;
                } else {
                    i5 = i28;
                    i4 = childCount;
                    LinearLayout linearLayout6 = commentLayout2;
                    String str21 = str14;
                    bVar2 = bVar7;
                    i6 = i36;
                    int i44 = i26;
                    SnsCommentCollapseLayout snsCommentCollapseLayout2 = view;
                    if (!z) {
                        boolean z6 = view instanceof TranslateCommentTextView;
                        snsCommentCollapseLayout2 = view;
                        if (z6) {
                            linearLayout6.removeView(view);
                            SnsCommentCollapseLayout snsCommentCollapseLayout3 = new SnsCommentCollapseLayout(getContext());
                            linearLayout6.addView(snsCommentCollapseLayout3, i44);
                            snsCommentCollapseLayout3.mo134081f(1, ((float) 15) * C76577a.m92165p(snsCommentCollapseLayout3.getContext()));
                            snsCommentCollapseLayout2 = snsCommentCollapseLayout3;
                        }
                    }
                    View view5 = snsCommentCollapseLayout2;
                    boolean z7 = view5 instanceof SnsCommentCollapseLayout;
                    if (z7) {
                        i8 = i44;
                        str7 = str21;
                        ((SnsCommentCollapseLayout) view5).mo134081f(1, ((float) 15) * C76577a.m92165p(view5.getContext()));
                        SnsCommentCollapseLayout snsCommentCollapseLayout4 = (SnsCommentCollapseLayout) view5;
                        snsCommentCollapseLayout4.setOpClickListener(this.f280089n);
                        C75355a0 a0Var = new C75355a0(getContext());
                        a0Var.f221527n = null;
                        a0Var.f221528o = -1;
                        linearLayout2 = linearLayout6;
                        snsInfo = snsInfo3;
                        if (C98242p.m126943e(snsInfo, w643.f299703d)) {
                            a0Var.f221529p = 31;
                        }
                        snsCommentCollapseLayout4.setPressTouchListener(a0Var);
                    } else {
                        i8 = i44;
                        str7 = str21;
                        linearLayout2 = linearLayout6;
                        snsInfo = snsInfo3;
                    }
                    C87412m.m108593f(charSequence2, "shorCommentCharSeq");
                    C87412m.m108593f(charSequence, "theCommentCharSeq");
                    SnsMethodCalculate.markStartTimeMs("wrapEmojiInfo", str9);
                    CharSequence[] charSequenceArr = {charSequence2, charSequence};
                    int hashCode = view5.hashCode();
                    if (Util.isNullOrNil(str15) || !z7) {
                        i9 = i29;
                        view3 = view5;
                        z2 = z;
                        str4 = str9;
                        w64 = w643;
                        i15 = i35;
                        snsInfo3 = snsInfo;
                        SnsMethodCalculate.markEndTimeMs("wrapEmojiInfo", str4);
                    } else {
                        Bitmap j2 = C94866e1.Fx0().mo131123j(str15, hashCode, new BaseTimeLineItem.C95908m(str15, charSequence2, charSequence, view5, i29, i35, (C43151t) null));
                        int a3 = C74942w4.m89784a(getContext(), 28);
                        StringBuilder sb4 = new StringBuilder(str15);
                        if (j2 == null) {
                            sb4.append("miss");
                            Log.m105925i("MicroMsg.BaseTimeLineItem", "wrapEmojiInfo:%s miss cache", sb4.toString());
                            drawable = getContext().getResources().getDrawable(C0966R.C0969drawable.atg);
                            snsInfo3 = snsInfo;
                        } else {
                            snsInfo3 = snsInfo;
                            Log.m105925i("MicroMsg.BaseTimeLineItem", "wrapEmojiInfo:%s hit cache", sb4.toString());
                            drawable = new BitmapDrawable(j2);
                        }
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence2);
                        spannableStringBuilder.append("  ").append(sb4.toString()).append("  ").append(" ");
                        int length = ((spannableStringBuilder.length() - sb4.toString().length()) - 2) - 1;
                        z2 = z;
                        int length2 = ((spannableStringBuilder.length() - sb4.toString().length()) - 4) - 1;
                        w64 = w643;
                        if (drawable != null) {
                            drawable.setBounds(0, 0, a3, a3);
                        }
                        i15 = i35;
                        C76003c cVar = new C76003c(drawable, 1);
                        i9 = i29;
                        view3 = view5;
                        String str22 = "wrapEmojiInfo";
                        String str23 = str9;
                        C75360c0 c0Var = new C75360c0(getContext(), sb4.toString(), (C75360c0.C75361a) null, 2);
                        spannableStringBuilder.setSpan(cVar, length, sb4.toString().length() + length, 33);
                        spannableStringBuilder.setSpan(c0Var, length2, length2 + 4 + sb4.toString().length(), 33);
                        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(charSequence);
                        spannableStringBuilder2.append("  ").append(sb4.toString()).append("  ").append(" ");
                        int length3 = ((spannableStringBuilder2.length() - sb4.toString().length()) - 2) - 1;
                        int length4 = ((spannableStringBuilder2.length() - sb4.toString().length()) - 4) - 1;
                        if (drawable != null) {
                            drawable.setBounds(0, 0, a3, a3);
                        }
                        spannableStringBuilder2.setSpan(cVar, length3, sb4.toString().length() + length3, 33);
                        spannableStringBuilder2.setSpan(c0Var, length4, length4 + 4 + sb4.toString().length(), 33);
                        charSequenceArr[0] = spannableStringBuilder;
                        charSequenceArr[1] = spannableStringBuilder2;
                        str4 = str23;
                        SnsMethodCalculate.markEndTimeMs(str22, str4);
                    }
                    SnsMethodCalculate.markStartTimeMs("attachStatusSpan", str4);
                    View view6 = view3;
                    ((C79168k) C86312j.m106911c(C79168k.class)).mo74119Py(view6, charSequence);
                    SnsMethodCalculate.markEndTimeMs("attachStatusSpan", str4);
                    i7 = i8;
                    timelineCommentView = this;
                    str3 = str7;
                    mo133452b(view6, charSequenceArr[0], charSequenceArr[1], i9, i15, w64);
                    view2 = view6;
                    z3 = false;
                }
                if (i7 > 0) {
                    if (z3) {
                        view2.setPadding(C76577a.m92151b(getContext(), 8), C76577a.m92151b(getContext(), 4), C76577a.m92151b(getContext(), 0), C76577a.m92151b(getContext(), 3));
                    } else {
                        view2.setPadding(C76577a.m92151b(getContext(), 8), C76577a.m92151b(getContext(), 4), C76577a.m92151b(getContext(), 0), C76577a.m92151b(getContext(), 3));
                    }
                    if (i7 == bVar2.mo138165b() - 1) {
                        view2.setBackgroundResource(C0966R.C0969drawable.au_);
                    } else {
                        view2.setBackgroundResource(C0966R.C0969drawable.f357356at2);
                    }
                } else {
                    if (z3) {
                        view2.setPadding(C76577a.m92151b(getContext(), 8), C76577a.m92151b(getContext(), 6), C76577a.m92151b(getContext(), 0), C76577a.m92151b(getContext(), 3));
                    } else {
                        view2.setPadding(C76577a.m92151b(getContext(), 8), C76577a.m92151b(getContext(), 6), C76577a.m92151b(getContext(), 0), C76577a.m92151b(getContext(), 3));
                    }
                    view2.setBackgroundResource(C0966R.C0969drawable.au9);
                }
                if (z3) {
                    int h = C76577a.m92157h(getContext(), C0966R.dimen.f3956le);
                    SnsMethodCalculate.markStartTimeMs("setSplitPadding", "com.tencent.mm.plugin.sns.ui.TranslateCommentTextView");
                    ((TranslateCommentTextView) view2).f279065e.getSplitlineView().setPadding(0, 0, h, 0);
                    SnsMethodCalculate.markEndTimeMs("setSplitPadding", "com.tencent.mm.plugin.sns.ui.TranslateCommentTextView");
                }
                if (C98242p.m126944f(w64)) {
                    str6 = null;
                    view2.setOnLongClickListener((View.OnLongClickListener) null);
                    view2.setOnClickListener((View.OnClickListener) null);
                    w642 = w64;
                    str5 = str17;
                } else {
                    str6 = null;
                    view2.setOnLongClickListener(new C52365a(timelineCommentView, view2));
                    w642 = w64;
                    str5 = str17;
                    view2.setOnClickListener(new C101929b(timelineCommentView, w642, str3, str5));
                }
                C96275w6 w6Var3 = w6Var;
                String str24 = w6Var3.f281381h;
                String str25 = w6Var3.f281382i;
                String str26 = w6Var3.f281398y;
                TimeLineObject timeLineObject = w6Var3.f281369b;
                if (timeLineObject != null) {
                    str6 = timeLineObject.f283893Id;
                }
                view2.setTag(new C96230u(str24, str25, w642, str11, str5, view2, 1, str26, str6));
                LinearLayout linearLayout7 = linearLayout2;
                if (z2) {
                    linearLayout7.removeView(view2);
                    linearLayout7.addView(view2);
                }
                i26 = i7 + 1;
                i27 = i6 + 1;
                w6Var2 = w6Var3;
                str9 = str4;
                timelineCommentView2 = timelineCommentView;
                str8 = str12;
                commentLayout = linearLayout3;
                str10 = str16;
                linkedList = linkedList2;
                snsInfo2 = snsInfo3;
                b2 = i5;
                childCount = i4;
                bVar6 = bVar2;
                i18 = 0;
                commentLayout2 = linearLayout7;
            }
            str = str8;
            TimelineCommentView timelineCommentView3 = timelineCommentView2;
            str2 = str9;
            SnsMethodCalculate.markEndTimeMs(str10, str2);
            linearLayout = commentLayout;
            i3 = 0;
        } else {
            str = str8;
            TimelineCommentView timelineCommentView4 = timelineCommentView2;
            str2 = str9;
            linearLayout = commentLayout;
            i3 = 8;
        }
        linearLayout.setVisibility(i3);
        SnsMethodCalculate.markEndTimeMs(str, str2);
    }

    /* renamed from: b */
    public final void mo133452b(View view, CharSequence charSequence, CharSequence charSequence2, int i, int i2, w64 w64) {
        SnsMethodCalculate.markStartTimeMs("spanCommentTextView", "com.tencent.mm.plugin.sns.ui.item.improve.recycle.TimelineCommentView");
        if (view instanceof SnsCommentCollapseLayout) {
            ((SnsCommentCollapseLayout) view).mo134080e(charSequence, charSequence2, i, i2);
        } else if (view instanceof TextView) {
            ((TextView) view).setText(charSequence);
        }
        C99591a.f291957a.mo138967b(view, w64);
        SnsMethodCalculate.markEndTimeMs("spanCommentTextView", "com.tencent.mm.plugin.sns.ui.item.improve.recycle.TimelineCommentView");
    }

    public final C32229r<View, w64, String, CharSequence, C13598b0> getCommentClickListener() {
        SnsMethodCalculate.markStartTimeMs("getCommentClickListener", "com.tencent.mm.plugin.sns.ui.item.improve.recycle.TimelineCommentView");
        C32229r<? super View, ? super w64, ? super String, ? super CharSequence, C13598b0> rVar = this.f280087i;
        SnsMethodCalculate.markEndTimeMs("getCommentClickListener", "com.tencent.mm.plugin.sns.ui.item.improve.recycle.TimelineCommentView");
        return rVar;
    }

    public final LinearLayout getCommentLayout() {
        SnsMethodCalculate.markStartTimeMs("getCommentLayout", "com.tencent.mm.plugin.sns.ui.item.improve.recycle.TimelineCommentView");
        LinearLayout linearLayout = (LinearLayout) this.f280084f.getValue();
        SnsMethodCalculate.markEndTimeMs("getCommentLayout", "com.tencent.mm.plugin.sns.ui.item.improve.recycle.TimelineCommentView");
        return linearLayout;
    }

    public final C32228q<View, Integer, Integer, C13598b0> getCommentLongClickListener() {
        SnsMethodCalculate.markStartTimeMs("getCommentLongClickListener", "com.tencent.mm.plugin.sns.ui.item.improve.recycle.TimelineCommentView");
        C32228q<? super View, ? super Integer, ? super Integer, C13598b0> qVar = this.f280088j;
        SnsMethodCalculate.markEndTimeMs("getCommentLongClickListener", "com.tencent.mm.plugin.sns.ui.item.improve.recycle.TimelineCommentView");
        return qVar;
    }

    public final SnsLikesTextView getLikeLayout() {
        SnsMethodCalculate.markStartTimeMs("getLikeLayout", "com.tencent.mm.plugin.sns.ui.item.improve.recycle.TimelineCommentView");
        SnsLikesTextView snsLikesTextView = (SnsLikesTextView) this.f280082d.getValue();
        SnsMethodCalculate.markEndTimeMs("getLikeLayout", "com.tencent.mm.plugin.sns.ui.item.improve.recycle.TimelineCommentView");
        return snsLikesTextView;
    }

    public final View.OnClickListener getSingleCommentCollapseClickListener() {
        SnsMethodCalculate.markStartTimeMs("getSingleCommentCollapseClickListener", "com.tencent.mm.plugin.sns.ui.item.improve.recycle.TimelineCommentView");
        View.OnClickListener onClickListener = this.f280089n;
        SnsMethodCalculate.markEndTimeMs("getSingleCommentCollapseClickListener", "com.tencent.mm.plugin.sns.ui.item.improve.recycle.TimelineCommentView");
        return onClickListener;
    }

    public void reset() {
        SnsMethodCalculate.markStartTimeMs("reset", "com.tencent.mm.plugin.sns.ui.item.improve.recycle.TimelineCommentView");
        this.f280087i = null;
        this.f280088j = null;
        this.f280089n = null;
        SnsMethodCalculate.markEndTimeMs("reset", "com.tencent.mm.plugin.sns.ui.item.improve.recycle.TimelineCommentView");
    }

    public final void setCommentClickListener(C32229r<? super View, ? super w64, ? super String, ? super CharSequence, C13598b0> rVar) {
        SnsMethodCalculate.markStartTimeMs("setCommentClickListener", "com.tencent.mm.plugin.sns.ui.item.improve.recycle.TimelineCommentView");
        this.f280087i = rVar;
        SnsMethodCalculate.markEndTimeMs("setCommentClickListener", "com.tencent.mm.plugin.sns.ui.item.improve.recycle.TimelineCommentView");
    }

    public final void setCommentLongClickListener(C32228q<? super View, ? super Integer, ? super Integer, C13598b0> qVar) {
        SnsMethodCalculate.markStartTimeMs("setCommentLongClickListener", "com.tencent.mm.plugin.sns.ui.item.improve.recycle.TimelineCommentView");
        this.f280088j = qVar;
        SnsMethodCalculate.markEndTimeMs("setCommentLongClickListener", "com.tencent.mm.plugin.sns.ui.item.improve.recycle.TimelineCommentView");
    }

    public final void setSingleCommentCollapseClickListener(View.OnClickListener onClickListener) {
        SnsMethodCalculate.markStartTimeMs("setSingleCommentCollapseClickListener", "com.tencent.mm.plugin.sns.ui.item.improve.recycle.TimelineCommentView");
        this.f280089n = onClickListener;
        SnsMethodCalculate.markEndTimeMs("setSingleCommentCollapseClickListener", "com.tencent.mm.plugin.sns.ui.item.improve.recycle.TimelineCommentView");
    }

    public TimelineCommentView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        SnsMethodCalculate.markStartTimeMs("getLikeCollapseLines", "com.tencent.mm.plugin.sns.ui.item.improve.config.TimelineItemConfig");
        boolean z = false;
        int safeParseInt = Util.safeParseInt(C117731d.m166007c().mo182444f("clicfg_sns_like_collapse_lines", "0", false, true));
        SnsMethodCalculate.markEndTimeMs("getLikeCollapseLines", "com.tencent.mm.plugin.sns.ui.item.improve.config.TimelineItemConfig");
        this.f280085g = safeParseInt;
        SnsMethodCalculate.markStartTimeMs("enableLikeCollapse", "com.tencent.mm.plugin.sns.ui.item.improve.config.TimelineItemConfig");
        z = Util.safeParseInt(C117731d.m166007c().mo182444f("clicfg_sns_like_collapse_enable", "0", false, true)) == 1 ? true : z;
        SnsMethodCalculate.markEndTimeMs("enableLikeCollapse", "com.tencent.mm.plugin.sns.ui.item.improve.config.TimelineItemConfig");
        this.f280086h = z;
        setBackgroundResource(C0966R.C0969drawable.a6s);
        setOrientation(1);
    }

    public TimelineCommentView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        SnsMethodCalculate.markStartTimeMs("getLikeCollapseLines", "com.tencent.mm.plugin.sns.ui.item.improve.config.TimelineItemConfig");
        boolean z = false;
        int safeParseInt = Util.safeParseInt(C117731d.m166007c().mo182444f("clicfg_sns_like_collapse_lines", "0", false, true));
        SnsMethodCalculate.markEndTimeMs("getLikeCollapseLines", "com.tencent.mm.plugin.sns.ui.item.improve.config.TimelineItemConfig");
        this.f280085g = safeParseInt;
        SnsMethodCalculate.markStartTimeMs("enableLikeCollapse", "com.tencent.mm.plugin.sns.ui.item.improve.config.TimelineItemConfig");
        z = Util.safeParseInt(C117731d.m166007c().mo182444f("clicfg_sns_like_collapse_enable", "0", false, true)) == 1 ? true : z;
        SnsMethodCalculate.markEndTimeMs("enableLikeCollapse", "com.tencent.mm.plugin.sns.ui.item.improve.config.TimelineItemConfig");
        this.f280086h = z;
        setBackgroundResource(C0966R.C0969drawable.a6s);
        setOrientation(1);
    }
}
