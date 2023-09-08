package eu2;

import android.content.Context;
import android.content.res.Configuration;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.lifecycle.C39622i0;
import bl3.C39818r;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.SnsRepostEvent;
import com.tencent.p014mm.plugin.sns.model.C94965w1;
import com.tencent.p014mm.plugin.sns.p106ui.SnsTranslateResultView;
import com.tencent.p014mm.plugin.sns.p106ui.improve.component.unread.ImproveUnreadTierView;
import com.tencent.p014mm.plugin.sns.p106ui.improve.component.unread.ImproveUnreadUIC;
import com.tencent.p014mm.plugin.sns.p106ui.improve.view.ImproveContentView;
import com.tencent.p014mm.plugin.sns.p106ui.improve.view.ImproveInteractionLayout;
import com.tencent.p014mm.plugin.sns.p106ui.improve.view.ImproveTextView;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsJankActivity;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72994y1;
import di3.C86312j;
import dm2.C45424g;
import f40.C86709a0;
import gu2.C98214b;
import gy3.C87412m;
import iu2.C98799a;
import j20.C117292a;
import java.util.regex.Pattern;
import jq3.C60905o;
import k20.C60958c;
import k20.C9556a;
import p629ny.C76979h;
import p640ox.C77049b;
import pu2.C100960u0;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36570n;
import te3.ze4;
import tu2.C101931d;
import ut2.C102087b;
import vr2.C102236a0;
import wx3.C15601d;
import z04.C112550d0;

/* renamed from: eu2.r */
public abstract class C97736r extends C97712i implements C97709g {

    /* renamed from: S */
    public ImproveInteractionLayout f286705S;

    /* renamed from: T */
    public SnsTranslateResultView f286706T;

    /* renamed from: U */
    public View f286707U;

    /* renamed from: V */
    public TextView f286708V;

    /* renamed from: W */
    public C98799a f286709W;

    /* renamed from: p0 */
    public C60905o f286710p0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C97736r(Context context) {
        super(context);
        C87412m.m108594g(context, "context");
    }

    /* renamed from: p */
    public static final void m126045p(C97736r rVar) {
        C98214b b;
        SnsMethodCalculate.markStartTimeMs("access$tryRepostEvent", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemMeasure");
        rVar.getClass();
        SnsMethodCalculate.markStartTimeMs("tryRepostEvent", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemMeasure");
        C98799a aVar = rVar.f286709W;
        if (aVar == null || (b = aVar.mo138170b()) == null) {
            SnsMethodCalculate.markEndTimeMs("tryRepostEvent", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemMeasure");
        } else {
            SnsRepostEvent snsRepostEvent = new SnsRepostEvent();
            snsRepostEvent.f265193d.f265194a = b.mo137503A2();
            snsRepostEvent.publish();
            rVar.getItemErrorStub().setVisibility(8);
            SnsMethodCalculate.markEndTimeMs("tryRepostEvent", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemMeasure");
        }
        SnsMethodCalculate.markEndTimeMs("access$tryRepostEvent", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemMeasure");
    }

    /* renamed from: A */
    public final int mo137038A() {
        SnsMethodCalculate.markStartTimeMs("position", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemMeasure");
        C60905o oVar = this.f286710p0;
        int j = oVar != null ? oVar.mo17363j() : -1;
        SnsMethodCalculate.markEndTimeMs("position", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemMeasure");
        return j;
    }

    /* renamed from: B */
    public final void mo137039B(TextView textView, int i, CharSequence charSequence) {
        SnsMethodCalculate.markStartTimeMs("setWithContent", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemMeasure");
        textView.setVisibility(0);
        if (i != 0) {
            charSequence = getContext().getString(i, new Object[]{charSequence});
        }
        textView.setText(((C76979h) C86312j.m106911c(C76979h.class)).yp0(getContext(), charSequence, textView.getTextSize()), TextView.BufferType.SPANNABLE);
        SnsMethodCalculate.markEndTimeMs("setWithContent", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemMeasure");
    }

    /* renamed from: C */
    public final void mo137040C() {
        SnsMethodCalculate.markStartTimeMs("updateCheckEnableLargeUI", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemMeasure");
        SnsMethodCalculate.markStartTimeMs("getEnableLargeUI", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveConfigUIC$Companion");
        SnsMethodCalculate.markStartTimeMs("access$getEnableLargeUI$cp", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveConfigUIC");
        boolean z = C102087b.f300617d;
        SnsMethodCalculate.markEndTimeMs("access$getEnableLargeUI$cp", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveConfigUIC");
        SnsMethodCalculate.markEndTimeMs("getEnableLargeUI", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveConfigUIC$Companion");
        int o = mo137012o(z);
        ViewGroup.LayoutParams layoutParams = getRightPanelLayout().getLayoutParams();
        layoutParams.width = o;
        getRightPanelLayout().setLayoutParams(layoutParams);
        ViewGroup contentContainer = getContentContainer();
        if (contentContainer != null) {
            ViewGroup.LayoutParams layoutParams2 = contentContainer.getLayoutParams();
            C87412m.m108593f(layoutParams2, "it.layoutParams");
            SnsMethodCalculate.markStartTimeMs("updateContentLayoutParams", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
            SnsMethodCalculate.markStartTimeMs("updateContentLayoutParams", "com.tencent.mm.plugin.sns.ui.improve.item.large.IImproveEnableLargeUI$DefaultImpls");
            layoutParams2.width = z ? -2 : -1;
            if (layoutParams2 instanceof LinearLayout.LayoutParams) {
                if (z) {
                    ((LinearLayout.LayoutParams) layoutParams2).gravity = 1;
                } else {
                    ((LinearLayout.LayoutParams) layoutParams2).gravity = 0;
                }
            }
            Log.m105924i("MicroMsg.Improve.TimelineItemBuild", "updateContentLayoutParams: enableLargeUI=" + z + ',');
            SnsMethodCalculate.markEndTimeMs("updateContentLayoutParams", "com.tencent.mm.plugin.sns.ui.improve.item.large.IImproveEnableLargeUI$DefaultImpls");
            SnsMethodCalculate.markEndTimeMs("updateContentLayoutParams", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
            contentContainer.setLayoutParams(layoutParams2);
        }
        SnsMethodCalculate.markEndTimeMs("updateCheckEnableLargeUI", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemMeasure");
    }

    /* renamed from: c */
    public void mo133276c() {
        SnsMethodCalculate.markStartTimeMs("hideDivider", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemMeasure");
        View divider = getDivider();
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        C117292a.m165358d(divider, aVar.mo10232b(), "com/tencent/mm/plugin/sns/ui/improve/item/ImproveTimelineItemMeasure", "hideDivider", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        divider.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(divider, "com/tencent/mm/plugin/sns/ui/improve/item/ImproveTimelineItemMeasure", "hideDivider", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        SnsMethodCalculate.markEndTimeMs("hideDivider", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemMeasure");
    }

    /* renamed from: d */
    public void mo133277d() {
        C98214b b;
        SnsMethodCalculate.markStartTimeMs("realTimeUpdate", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemMeasure");
        C98799a aVar = this.f286709W;
        if (aVar == null || (b = aVar.mo138170b()) == null) {
            SnsMethodCalculate.markEndTimeMs("realTimeUpdate", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemMeasure");
            return;
        }
        TextView publishTimeText = getPublishTimeText();
        if (publishTimeText != null) {
            publishTimeText.setText(b.mo137508F2());
        }
        SnsMethodCalculate.markStartTimeMs("enableShowDebugLabel", "com.tencent.mm.plugin.sns.ui.item.improve.config.TimelineItemConfig");
        boolean z = false;
        if (C86709a0.m107535s().mo121142i().mo119689j(C72994y1.C72995a.USERINFO_SNS_FEED_NEW_SHOW_DEBUG_INT_SYNC, 0) == 1) {
            z = true;
        }
        SnsMethodCalculate.markEndTimeMs("enableShowDebugLabel", "com.tencent.mm.plugin.sns.ui.item.improve.config.TimelineItemConfig");
        if (z) {
            ImproveTextView debugLabel = getDebugLabel();
            debugLabel.setText(mo137038A() + " - " + b.mo137526z2() + " - " + b.mo137504B2());
        }
        SnsMethodCalculate.markEndTimeMs("realTimeUpdate", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemMeasure");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:148:0x039b, code lost:
        if (r2.isClickable() == true) goto L_0x039f;
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo133278f(jq3.C60905o r21, iu2.C98799a r22, int r23) {
        /*
            r20 = this;
            r0 = r20
            r1 = r21
            r2 = r22
            java.lang.String r3 = "measure"
            java.lang.String r4 = "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemMeasure"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r3, r4)
            java.lang.String r5 = "holder"
            gy3.C87412m.m108594g(r1, r5)
            java.lang.String r5 = "item"
            gy3.C87412m.m108594g(r2, r5)
            boolean r5 = r0.mo137046r(r2)
            r0.f286709W = r2
            r0.f286710p0 = r1
            r20.mo84001s()
            java.lang.String r1 = "loadGroupPermissionView"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r1, r4)
            iu2.a r2 = r0.f286709W
            java.lang.String r6 = "com.tencent.mm.plugin.sns.ui.improve.model.ImproveSnsInfo"
            r7 = 8
            r8 = 1
            r9 = 0
            if (r2 == 0) goto L_0x0193
            gu2.b r2 = r2.mo138170b()
            if (r2 != 0) goto L_0x003c
            goto L_0x0193
        L_0x003c:
            java.lang.String r10 = "getShowGroupEnable"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r10, r6)
            java.lang.Boolean r11 = r2.f287976g1
            if (r11 != 0) goto L_0x009a
            java.lang.Boolean r11 = java.lang.Boolean.FALSE
            r2.f287976g1 = r11
            com.tencent.mm.protocal.protobuf.SnsObject r11 = r2.mo137506D2()
            java.lang.String r12 = r2.getUserName()
            if (r12 == 0) goto L_0x009a
            java.lang.String r12 = r2.getUserName()
            au2.b r13 = au2.C92093b.f263643a
            java.lang.String r13 = r13.mo126084a()
            boolean r12 = gy3.C87412m.m108589b(r12, r13)
            if (r12 == 0) goto L_0x009a
            int r12 = r2.getLocalPrivate()
            r12 = r12 & r8
            if (r12 == 0) goto L_0x006c
            r12 = 1
            goto L_0x006d
        L_0x006c:
            r12 = 0
        L_0x006d:
            int r11 = r11.ExtFlag
            java.lang.String r13 = "checkEnableShowGroupByExtFlag"
            java.lang.String r14 = "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r13, r14)
            r15 = r11 & 3
            r8 = 3
            if (r15 == r8) goto L_0x008e
            r8 = r11 & 5
            r15 = 5
            if (r8 == r15) goto L_0x008e
            r8 = r11 & 1025(0x401, float:1.436E-42)
            r15 = 1025(0x401, float:1.436E-42)
            if (r8 == r15) goto L_0x008e
            r8 = 513(0x201, float:7.19E-43)
            r11 = r11 & r8
            if (r11 != r8) goto L_0x008c
            goto L_0x008e
        L_0x008c:
            r8 = 0
            goto L_0x008f
        L_0x008e:
            r8 = 1
        L_0x008f:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r13, r14)
            if (r8 == 0) goto L_0x009a
            if (r12 != 0) goto L_0x009a
            java.lang.Boolean r8 = java.lang.Boolean.TRUE
            r2.f287976g1 = r8
        L_0x009a:
            java.lang.Boolean r8 = r2.f287976g1
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r10, r6)
            java.lang.Boolean r10 = java.lang.Boolean.TRUE
            boolean r8 = gy3.C87412m.m108589b(r8, r10)
            if (r8 == 0) goto L_0x0149
            android.view.View r8 = r20.getGroupImageStub()
            boolean r8 = r8 instanceof android.view.ViewStub
            if (r8 == 0) goto L_0x00f7
            com.tencent.mm.ui.widget.imageview.WeImageView r8 = new com.tencent.mm.ui.widget.imageview.WeImageView
            android.content.Context r10 = r20.getContext()
            r8.<init>(r10)
            r10 = 2131756050(0x7f100412, float:1.9142997E38)
            r11 = 2131099851(0x7f0600cb, float:1.7812067E38)
            r8.mo104518r(r10, r11)
            r10 = 2131296822(0x7f090236, float:1.8211572E38)
            r8.setId(r10)
            android.content.Context r10 = r20.getContext()
            r11 = 2131165324(0x7f07008c, float:1.7944862E38)
            int r10 = kg3.C76577a.m92157h(r10, r11)
            android.widget.LinearLayout$LayoutParams r11 = new android.widget.LinearLayout$LayoutParams
            r11.<init>(r10, r10)
            android.content.Context r10 = r20.getContext()
            r12 = 2131165306(0x7f07007a, float:1.7944825E38)
            int r10 = kg3.C76577a.m92157h(r10, r12)
            r11.setMargins(r10, r9, r9, r9)
            android.view.View r10 = r20.getGroupImageStub()
            java.lang.String r12 = "null cannot be cast to non-null type android.view.ViewStub"
            gy3.C87412m.m108592e(r10, r12)
            android.view.ViewStub r10 = (android.view.ViewStub) r10
            vu2.C52993b.m59322a(r10, r8, r11)
            r0.setGroupImageStub(r8)
        L_0x00f7:
            android.view.View r8 = r20.getGroupImageStub()
            k20.a r10 = new k20.a
            r10.<init>()
            java.lang.ThreadLocal<k20.a> r11 = k20.C60958c.f173611a
            java.lang.Integer r11 = java.lang.Integer.valueOf(r9)
            r10.mo10233c(r11)
            java.lang.Object[] r13 = r10.mo10232b()
            java.lang.String r14 = "com/tencent/mm/plugin/sns/ui/improve/item/ImproveTimelineItemMeasure"
            java.lang.String r15 = "loadGroupPermissionView"
            java.lang.String r16 = "()V"
            java.lang.String r17 = "android/view/View_EXEC_"
            java.lang.String r18 = "setVisibility"
            java.lang.String r19 = "(I)V"
            r12 = r8
            j20.C117292a.m165358d(r12, r13, r14, r15, r16, r17, r18, r19)
            java.lang.Object r10 = r10.mo10231a(r9)
            java.lang.Integer r10 = (java.lang.Integer) r10
            int r10 = r10.intValue()
            r8.setVisibility(r10)
            java.lang.String r13 = "com/tencent/mm/plugin/sns/ui/improve/item/ImproveTimelineItemMeasure"
            java.lang.String r14 = "loadGroupPermissionView"
            java.lang.String r15 = "()V"
            java.lang.String r16 = "android/view/View_EXEC_"
            java.lang.String r17 = "setVisibility"
            java.lang.String r18 = "(I)V"
            j20.C117292a.m165359e(r12, r13, r14, r15, r16, r17, r18)
            android.view.View r8 = r20.getGroupImageStub()
            java.lang.String r2 = r2.mo137503A2()
            r8.setTag(r2)
            goto L_0x018f
        L_0x0149:
            android.view.View r2 = r20.getGroupImageStub()
            k20.a r8 = new k20.a
            r8.<init>()
            java.lang.ThreadLocal<k20.a> r10 = k20.C60958c.f173611a
            java.lang.Integer r10 = java.lang.Integer.valueOf(r7)
            r8.mo10233c(r10)
            java.lang.Object[] r11 = r8.mo10232b()
            java.lang.String r12 = "com/tencent/mm/plugin/sns/ui/improve/item/ImproveTimelineItemMeasure"
            java.lang.String r13 = "loadGroupPermissionView"
            java.lang.String r14 = "()V"
            java.lang.String r15 = "android/view/View_EXEC_"
            java.lang.String r16 = "setVisibility"
            java.lang.String r17 = "(I)V"
            r10 = r2
            j20.C117292a.m165358d(r10, r11, r12, r13, r14, r15, r16, r17)
            java.lang.Object r8 = r8.mo10231a(r9)
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            r2.setVisibility(r8)
            java.lang.String r11 = "com/tencent/mm/plugin/sns/ui/improve/item/ImproveTimelineItemMeasure"
            java.lang.String r12 = "loadGroupPermissionView"
            java.lang.String r13 = "()V"
            java.lang.String r14 = "android/view/View_EXEC_"
            java.lang.String r15 = "setVisibility"
            java.lang.String r16 = "(I)V"
            j20.C117292a.m165359e(r10, r11, r12, r13, r14, r15, r16)
        L_0x018f:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r4)
            goto L_0x0196
        L_0x0193:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r4)
        L_0x0196:
            java.lang.String r1 = "loadItemErrorTipView"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r1, r4)
            iu2.a r2 = r0.f286709W
            java.lang.String r8 = "MicroMsg.Improve.TimelineItemMeasure"
            if (r2 == 0) goto L_0x03b4
            gu2.b r2 = r2.mo138170b()
            if (r2 != 0) goto L_0x01aa
            goto L_0x03b4
        L_0x01aa:
            java.lang.String r10 = "getPostInfo"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r10, r6)
            rx3.g r11 = r2.f287978i1
            rx3.n r11 = (rx3.C36570n) r11
            java.lang.Object r11 = r11.getValue()
            te3.lv2 r11 = (te3.C101808lv2) r11
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r10, r6)
            boolean r6 = r2.isDieItem()
            if (r6 == 0) goto L_0x03a9
            android.view.ViewStub r6 = r20.getItemErrorStub()
            android.view.ViewParent r6 = r6.getParent()
            if (r6 == 0) goto L_0x01e1
            android.view.ViewStub r6 = r20.getItemErrorStub()
            android.view.View r6 = r6.inflate()
            r0.f286707U = r6
            r10 = 2131311118(0x7f093a0e, float:1.8240567E38)
            android.view.View r6 = r6.findViewById(r10)
            android.widget.TextView r6 = (android.widget.TextView) r6
            r0.f286708V = r6
        L_0x01e1:
            android.widget.TextView r6 = r0.f286708V
            if (r6 != 0) goto L_0x01e6
            goto L_0x01ed
        L_0x01e6:
            java.lang.String r10 = r2.mo137503A2()
            r6.setTag(r10)
        L_0x01ed:
            android.view.ViewStub r6 = r20.getItemErrorStub()
            r6.setVisibility(r9)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r10 = "loadItemErrorTipView error:"
            r6.append(r10)
            int r10 = r11.f298755s
            r6.append(r10)
            java.lang.String r6 = r6.toString()
            r0.mo137055z(r8, r6)
            int r6 = r11.f298755s
            r10 = 7
            r12 = 0
            if (r6 == r10) goto L_0x02b5
            r10 = 201(0xc9, float:2.82E-43)
            if (r6 == r10) goto L_0x0293
            r10 = 210(0xd2, float:2.94E-43)
            if (r6 == r10) goto L_0x0271
            r10 = 211(0xd3, float:2.96E-43)
            if (r6 == r10) goto L_0x0247
            android.widget.TextView r6 = r0.f286708V
            if (r6 == 0) goto L_0x0227
            r10 = 2131837094(0x7f1140a6, float:1.9307373E38)
            r6.setText(r10)
        L_0x0227:
            android.view.View r6 = r0.f286707U
            if (r6 == 0) goto L_0x0233
            eu2.p r10 = new eu2.p
            r10.<init>(r0)
            r6.setOnClickListener(r10)
        L_0x0233:
            android.view.View r6 = r0.f286707U
            r10 = 1
            if (r6 != 0) goto L_0x0239
            goto L_0x023c
        L_0x0239:
            r6.setClickable(r10)
        L_0x023c:
            android.view.View r6 = r0.f286707U
            if (r6 != 0) goto L_0x0242
            goto L_0x02d6
        L_0x0242:
            r6.setEnabled(r10)
            goto L_0x02d6
        L_0x0247:
            android.widget.TextView r6 = r0.f286708V
            if (r6 == 0) goto L_0x0251
            r10 = 2131837092(0x7f1140a4, float:1.930737E38)
            r6.setText(r10)
        L_0x0251:
            android.view.View r6 = r0.f286707U
            if (r6 == 0) goto L_0x025d
            eu2.o r10 = new eu2.o
            r10.<init>(r0)
            r6.setOnClickListener(r10)
        L_0x025d:
            android.view.View r6 = r0.f286707U
            r10 = 1
            if (r6 != 0) goto L_0x0263
            goto L_0x0266
        L_0x0263:
            r6.setClickable(r10)
        L_0x0266:
            android.view.View r6 = r0.f286707U
            if (r6 != 0) goto L_0x026c
            goto L_0x02d6
        L_0x026c:
            r6.setEnabled(r10)
            goto L_0x02d6
        L_0x0271:
            android.widget.TextView r6 = r0.f286708V
            if (r6 == 0) goto L_0x027b
            r10 = 2131837093(0x7f1140a5, float:1.9307371E38)
            r6.setText(r10)
        L_0x027b:
            android.view.View r6 = r0.f286707U
            if (r6 == 0) goto L_0x0282
            r6.setOnClickListener(r12)
        L_0x0282:
            android.view.View r6 = r0.f286707U
            if (r6 != 0) goto L_0x0287
            goto L_0x028a
        L_0x0287:
            r6.setClickable(r9)
        L_0x028a:
            android.view.View r6 = r0.f286707U
            if (r6 != 0) goto L_0x028f
            goto L_0x02d6
        L_0x028f:
            r6.setEnabled(r9)
            goto L_0x02d6
        L_0x0293:
            android.widget.TextView r6 = r0.f286708V
            if (r6 == 0) goto L_0x029d
            r10 = 2131837091(0x7f1140a3, float:1.9307367E38)
            r6.setText(r10)
        L_0x029d:
            android.view.View r6 = r0.f286707U
            if (r6 == 0) goto L_0x02a4
            r6.setOnClickListener(r12)
        L_0x02a4:
            android.view.View r6 = r0.f286707U
            if (r6 != 0) goto L_0x02a9
            goto L_0x02ac
        L_0x02a9:
            r6.setClickable(r9)
        L_0x02ac:
            android.view.View r6 = r0.f286707U
            if (r6 != 0) goto L_0x02b1
            goto L_0x02d6
        L_0x02b1:
            r6.setEnabled(r9)
            goto L_0x02d6
        L_0x02b5:
            android.widget.TextView r6 = r0.f286708V
            if (r6 == 0) goto L_0x02bf
            r10 = 2131837198(0x7f11410e, float:1.9307584E38)
            r6.setText(r10)
        L_0x02bf:
            android.view.View r6 = r0.f286707U
            if (r6 == 0) goto L_0x02c6
            r6.setOnClickListener(r12)
        L_0x02c6:
            android.view.View r6 = r0.f286707U
            if (r6 != 0) goto L_0x02cb
            goto L_0x02ce
        L_0x02cb:
            r6.setClickable(r9)
        L_0x02ce:
            android.view.View r6 = r0.f286707U
            if (r6 != 0) goto L_0x02d3
            goto L_0x02d6
        L_0x02d3:
            r6.setEnabled(r9)
        L_0x02d6:
            java.lang.String r6 = r11.f298732F
            boolean r6 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r6)
            if (r6 != 0) goto L_0x037d
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r6 = "loadItemErrorTipView tips:"
            r2.append(r6)
            java.lang.String r6 = r11.f298737K
            r2.append(r6)
            r6 = 32
            r2.append(r6)
            java.lang.String r10 = r11.f298738L
            r2.append(r10)
            r2.append(r6)
            java.lang.String r6 = r11.f298732F
            r2.append(r6)
            java.lang.String r2 = r2.toString()
            r0.mo137055z(r8, r2)
            java.lang.String r2 = r11.f298737K
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r2 != 0) goto L_0x0372
            java.lang.String r2 = r11.f298738L
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r2 != 0) goto L_0x0372
            android.view.View r2 = r0.f286707U
            if (r2 == 0) goto L_0x0323
            eu2.q r6 = new eu2.q
            r6.<init>(r0)
            r2.setOnClickListener(r6)
        L_0x0323:
            android.view.View r2 = r0.f286707U
            r6 = 1
            if (r2 != 0) goto L_0x0329
            goto L_0x032c
        L_0x0329:
            r2.setClickable(r6)
        L_0x032c:
            android.view.View r2 = r0.f286707U
            if (r2 != 0) goto L_0x0331
            goto L_0x0334
        L_0x0331:
            r2.setEnabled(r6)
        L_0x0334:
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            java.lang.String r2 = r11.f298738L
            r14.add(r2)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.lang.String r6 = r11.f298737K
            r2.add(r6)
            java.lang.Class<ny.h> r6 = p629ny.C76979h.class
            di3.d r6 = di3.C86312j.m106911c(r6)
            r12 = r6
            ny.h r12 = (p629ny.C76979h) r12
            android.content.Context r13 = r20.getContext()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r10 = r11.f298732F
            r6.append(r10)
            java.lang.String r10 = r11.f298737K
            r6.append(r10)
            java.lang.String r15 = r6.toString()
            android.widget.TextView r6 = r0.f286708V
            r16 = r2
            r17 = r6
            r12.mo107047GG(r13, r14, r15, r16, r17)
            goto L_0x03b0
        L_0x0372:
            android.widget.TextView r2 = r0.f286708V
            if (r2 != 0) goto L_0x0377
            goto L_0x03b0
        L_0x0377:
            java.lang.String r6 = r11.f298732F
            r2.setText(r6)
            goto L_0x03b0
        L_0x037d:
            com.tencent.mm.protocal.protobuf.TimeLineObject r2 = r2.mo137509G2()
            if (r2 == 0) goto L_0x038f
            te3.j00 r2 = r2.ContentObj
            if (r2 == 0) goto L_0x038f
            int r2 = r2.f298424e
            r6 = 28
            if (r2 != r6) goto L_0x038f
            r10 = 1
            goto L_0x0390
        L_0x038f:
            r10 = 0
        L_0x0390:
            if (r10 == 0) goto L_0x03b0
            android.widget.TextView r2 = r0.f286708V
            if (r2 == 0) goto L_0x039e
            boolean r2 = r2.isClickable()
            r6 = 1
            if (r2 != r6) goto L_0x039e
            goto L_0x039f
        L_0x039e:
            r6 = 0
        L_0x039f:
            if (r6 == 0) goto L_0x03b0
            android.view.ViewStub r2 = r20.getItemErrorStub()
            r2.setVisibility(r7)
            goto L_0x03b0
        L_0x03a9:
            android.view.ViewStub r2 = r20.getItemErrorStub()
            r2.setVisibility(r7)
        L_0x03b0:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r4)
            goto L_0x03b7
        L_0x03b4:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r4)
        L_0x03b7:
            java.lang.String r1 = "loadFinderPostView"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r1, r4)
            iu2.a r2 = r0.f286709W
            if (r2 == 0) goto L_0x042e
            gu2.b r2 = r2.mo138170b()
            if (r2 != 0) goto L_0x03c8
            goto L_0x042e
        L_0x03c8:
            yn2.s0 r6 = yn2.C102882s0.f303681a
            java.lang.String r10 = r2.mo137503A2()
            boolean r6 = r6.mo142590b(r10)
            if (r6 == 0) goto L_0x041d
            android.view.ViewStub r6 = r20.getFinderPostStub()
            android.view.ViewParent r6 = r6.getParent()
            if (r6 == 0) goto L_0x040f
            android.view.ViewStub r6 = r20.getFinderPostStub()
            android.view.View r6 = r6.inflate()
            r7 = 2131314079(0x7f09459f, float:1.8246573E38)
            android.view.View r7 = r6.findViewById(r7)
            android.widget.TextView r7 = (android.widget.TextView) r7
            java.lang.Class<lr.b> r10 = p599lr.C61381b.class
            di3.d r10 = di3.C86312j.m106911c(r10)
            lr.b r10 = (p599lr.C61381b) r10
            android.content.Context r11 = r20.getContext()
            java.lang.String r12 = "context"
            gy3.C87412m.m108593f(r11, r12)
            java.lang.String r10 = r10.mo78553iZ(r11)
            r7.setText(r10)
            eu2.n r7 = new eu2.n
            r7.<init>(r0, r2)
            r6.setOnClickListener(r7)
        L_0x040f:
            java.lang.String r2 = "loadFinderPostView: show"
            r0.mo137055z(r8, r2)
            android.view.ViewStub r2 = r20.getFinderPostStub()
            r2.setVisibility(r9)
            goto L_0x042a
        L_0x041d:
            java.lang.String r2 = "loadFinderPostView: hide"
            r0.mo137053x(r8, r2)
            android.view.ViewStub r2 = r20.getFinderPostStub()
            r2.setVisibility(r7)
        L_0x042a:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r4)
            goto L_0x0431
        L_0x042e:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r4)
        L_0x0431:
            if (r5 == 0) goto L_0x0436
            r20.mo137051t()
        L_0x0436:
            r20.mo137040C()
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r4)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: eu2.C97736r.mo133278f(jq3.o, iu2.a, int):boolean");
    }

    /* renamed from: g */
    public Object mo81006g(C60905o oVar, C98799a aVar, int i, boolean z, C15601d<? super C13598b0> dVar) {
        SnsMethodCalculate.markStartTimeMs("onBindViewHolder", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemMeasure");
        SnsMethodCalculate.markStartTimeMs("onBindViewHolder$suspendImpl", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemMeasure");
        ImproveUnreadTierView unreadLayout = getUnreadLayout();
        unreadLayout.getClass();
        SnsMethodCalculate.markStartTimeMs("onBindViewHolder", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadTierView");
        C87412m.m108594g(oVar, "holder");
        C87412m.m108594g(aVar, "item");
        unreadLayout.f279753f = aVar;
        unreadLayout.f279754g = oVar;
        C39818r rVar = C39818r.f106831a;
        Context context = unreadLayout.getContext();
        C87412m.m108593f(context, "context");
        C39622i0 a = rVar.mo62443b(context).mo75002a(ImproveUnreadUIC.class);
        C87412m.m108593f(a, "UICProvider.of(context).…oveUnreadUIC::class.java)");
        SnsMethodCalculate.markStartTimeMs("addObserver", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC");
        ((ImproveUnreadUIC) a).f279766i.add(unreadLayout);
        SnsMethodCalculate.markEndTimeMs("addObserver", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC");
        unreadLayout.mo133310a();
        SnsMethodCalculate.markEndTimeMs("onBindViewHolder", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadTierView");
        mo137055z("MicroMsg.Improve.DataFlow", "pos:" + i + " bindHolder " + aVar.mo138170b());
        C13598b0 b0Var = C13598b0.f38549a;
        SnsMethodCalculate.markEndTimeMs("onBindViewHolder$suspendImpl", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemMeasure");
        SnsMethodCalculate.markEndTimeMs("onBindViewHolder", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemMeasure");
        return b0Var;
    }

    public final ImproveInteractionLayout getCommentView() {
        SnsMethodCalculate.markStartTimeMs("getCommentView", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemMeasure");
        ImproveInteractionLayout improveInteractionLayout = this.f286705S;
        SnsMethodCalculate.markEndTimeMs("getCommentView", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemMeasure");
        return improveInteractionLayout;
    }

    public final SnsTranslateResultView getContentTranslateResultText() {
        SnsMethodCalculate.markStartTimeMs("getContentTranslateResultText", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemMeasure");
        SnsTranslateResultView snsTranslateResultView = this.f286706T;
        SnsMethodCalculate.markEndTimeMs("getContentTranslateResultText", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemMeasure");
        return snsTranslateResultView;
    }

    public final C98799a getData() {
        SnsMethodCalculate.markStartTimeMs("getData", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemMeasure");
        C98799a aVar = this.f286709W;
        SnsMethodCalculate.markEndTimeMs("getData", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemMeasure");
        return aVar;
    }

    public final C60905o getHolder() {
        SnsMethodCalculate.markStartTimeMs("getHolder", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemMeasure");
        C60905o oVar = this.f286710p0;
        SnsMethodCalculate.markEndTimeMs("getHolder", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemMeasure");
        return oVar;
    }

    /* renamed from: h */
    public void mo81008h() {
        SnsMethodCalculate.markStartTimeMs("onViewRecycled", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemMeasure");
        mo137055z("MicroMsg.Improve.TimelineItemMeasure", '[' + hashCode() + "] onViewRecycled");
        ImproveUnreadTierView unreadLayout = getUnreadLayout();
        unreadLayout.getClass();
        SnsMethodCalculate.markStartTimeMs("onViewRecycled", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadTierView");
        C39818r rVar = C39818r.f106831a;
        Context context = unreadLayout.getContext();
        C87412m.m108593f(context, "context");
        ImproveUnreadUIC improveUnreadUIC = (ImproveUnreadUIC) rVar.mo62443b(context).mo75002a(ImproveUnreadUIC.class);
        improveUnreadUIC.getClass();
        SnsMethodCalculate.markStartTimeMs("removeObserver", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC");
        improveUnreadUIC.f279766i.remove(unreadLayout);
        SnsMethodCalculate.markEndTimeMs("removeObserver", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC");
        SnsMethodCalculate.markEndTimeMs("onViewRecycled", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadTierView");
        SnsMethodCalculate.markEndTimeMs("onViewRecycled", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemMeasure");
    }

    public void onConfigurationChanged(Configuration configuration) {
        SnsMethodCalculate.markStartTimeMs("onConfigurationChanged", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemMeasure");
        super.onConfigurationChanged(configuration);
        mo137040C();
        SnsMethodCalculate.markEndTimeMs("onConfigurationChanged", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemMeasure");
    }

    /* renamed from: q */
    public void mo84000q() {
        SnsMethodCalculate.markStartTimeMs("customLayoutMeasureForReuse", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemMeasure");
        SnsMethodCalculate.markEndTimeMs("customLayoutMeasureForReuse", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemMeasure");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x001b, code lost:
        r3 = r3.mo138170b();
     */
    /* renamed from: r */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo137046r(iu2.C98799a r6) {
        /*
            r5 = this;
            java.lang.String r0 = "isItemChanged"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemMeasure"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            java.lang.String r2 = "item"
            gy3.C87412m.m108594g(r6, r2)
            gu2.b r2 = r6.mo138170b()
            java.lang.String r2 = r2.mo137504B2()
            iu2.a r3 = r5.f286709W
            r4 = 0
            if (r3 == 0) goto L_0x0026
            gu2.b r3 = r3.mo138170b()
            if (r3 == 0) goto L_0x0026
            java.lang.String r3 = r3.mo137504B2()
            goto L_0x0027
        L_0x0026:
            r3 = r4
        L_0x0027:
            boolean r2 = gy3.C87412m.m108589b(r2, r3)
            r3 = 1
            if (r2 == 0) goto L_0x004e
            iu2.a r2 = r5.f286709W
            r4 = 0
            if (r2 == 0) goto L_0x0048
            gu2.b r2 = r2.mo138170b()
            if (r2 == 0) goto L_0x0048
            gu2.b r6 = r6.mo138170b()
            int r6 = r6.getCreateTime()
            int r2 = r2.getCreateTime()
            if (r6 != r2) goto L_0x0048
            r4 = 1
        L_0x0048:
            r6 = r4 ^ 1
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return r6
        L_0x004e:
            gu2.b r6 = r6.mo138170b()
            java.lang.String r6 = r6.mo137504B2()
            iu2.a r2 = r5.f286709W
            if (r2 == 0) goto L_0x0064
            gu2.b r2 = r2.mo138170b()
            if (r2 == 0) goto L_0x0064
            java.lang.String r4 = r2.mo137504B2()
        L_0x0064:
            boolean r6 = gy3.C87412m.m108589b(r6, r4)
            r6 = r6 ^ r3
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: eu2.C97736r.mo137046r(iu2.a):boolean");
    }

    /* renamed from: s */
    public void mo84001s() {
        C98214b b;
        SnsMethodCalculate.markStartTimeMs("layoutCommentView", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemMeasure");
        C98799a aVar = this.f286709W;
        if (aVar == null || (b = aVar.mo138170b()) == null) {
            SnsMethodCalculate.markEndTimeMs("layoutCommentView", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemMeasure");
            return;
        }
        SnsJankActivity.C96073a aVar2 = SnsJankActivity.f280539s;
        aVar2.mo133612a(name(), "layoutCommentView");
        int b2 = b.mo137525y2().mo138165b();
        int size = b.getCommentList().size();
        mo137055z("MicroMsg.Improve.TimelineItemMeasure", "like size:" + b2 + " comment size:" + size);
        if (b2 > 0 || size > 0) {
            SnsMethodCalculate.markStartTimeMs("buildCommentView", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemMeasure");
            if (this.f286705S == null) {
                Context context = getContext();
                C87412m.m108593f(context, "context");
                this.f286705S = (ImproveInteractionLayout) C101931d.f300107a.mo141428a(ImproveInteractionLayout.class, context);
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
                SnsMethodCalculate.markStartTimeMs("getSmall_Padding", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild$Companion");
                SnsMethodCalculate.markStartTimeMs("access$getSmall_Padding$delegate$cp", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
                C13601g<Integer> gVar = C97712i.f286644J;
                SnsMethodCalculate.markEndTimeMs("access$getSmall_Padding$delegate$cp", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
                int intValue = ((Number) ((C36570n) gVar).getValue()).intValue();
                SnsMethodCalculate.markEndTimeMs("getSmall_Padding", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild$Companion");
                layoutParams.setMargins(0, intValue, 0, 0);
                getCommentContainer().addView(this.f286705S, layoutParams);
            }
            SnsMethodCalculate.markEndTimeMs("buildCommentView", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemMeasure");
            ImproveInteractionLayout improveInteractionLayout = this.f286705S;
            if (improveInteractionLayout != null) {
                improveInteractionLayout.setupLayout(b);
            }
        } else {
            C101931d.f300107a.mo141429b(this.f286705S);
            this.f286705S = null;
        }
        aVar2.mo133613b(name());
        SnsMethodCalculate.markEndTimeMs("layoutCommentView", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemMeasure");
    }

    public final void setCommentView(ImproveInteractionLayout improveInteractionLayout) {
        SnsMethodCalculate.markStartTimeMs("setCommentView", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemMeasure");
        this.f286705S = improveInteractionLayout;
        SnsMethodCalculate.markEndTimeMs("setCommentView", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemMeasure");
    }

    public final void setContentTranslateResultText(SnsTranslateResultView snsTranslateResultView) {
        SnsMethodCalculate.markStartTimeMs("setContentTranslateResultText", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemMeasure");
        this.f286706T = snsTranslateResultView;
        SnsMethodCalculate.markEndTimeMs("setContentTranslateResultText", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemMeasure");
    }

    public final void setData(C98799a aVar) {
        SnsMethodCalculate.markStartTimeMs("setData", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemMeasure");
        this.f286709W = aVar;
        SnsMethodCalculate.markEndTimeMs("setData", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemMeasure");
    }

    public final void setHolder(C60905o oVar) {
        SnsMethodCalculate.markStartTimeMs("setHolder", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemMeasure");
        this.f286710p0 = oVar;
        SnsMethodCalculate.markEndTimeMs("setHolder", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemMeasure");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0040, code lost:
        r2 = r2.mo138170b();
     */
    /* renamed from: t */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo137051t() {
        /*
            r53 = this;
            r10 = r53
            java.lang.String r11 = "loadBasicInfo"
            java.lang.String r12 = "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemMeasure"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r11, r12)
            java.lang.String r13 = "loadNecessaryInfo"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r13, r12)
            com.tencent.mm.plugin.sns.ui.monitor.SnsJankActivity$a r14 = com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsJankActivity.f280539s
            java.lang.String r0 = r53.name()
            r14.mo133612a(r0, r13)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "loadNecessaryInfo pos:"
            r0.append(r1)
            int r1 = r53.mo137038A()
            r0.append(r1)
            java.lang.String r1 = " type:"
            r0.append(r1)
            java.lang.String r1 = r53.name()
            r0.append(r1)
            r1 = 32
            r0.append(r1)
            iu2.a r2 = r10.f286709W
            if (r2 == 0) goto L_0x004b
            gu2.b r2 = r2.mo138170b()
            if (r2 == 0) goto L_0x004b
            java.lang.String r2 = r2.mo137508F2()
            goto L_0x004c
        L_0x004b:
            r2 = 0
        L_0x004c:
            r0.append(r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r9 = "MicroMsg.Improve.TimelineItemMeasure"
            r10.mo137055z(r9, r0)
            java.lang.String r0 = "loadAvatar"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r12)
            iu2.a r1 = r10.f286709W
            if (r1 == 0) goto L_0x0070
            gu2.b r1 = r1.mo138170b()
            if (r1 == 0) goto L_0x0070
            java.lang.String r1 = r1.getUserName()
            goto L_0x0071
        L_0x0070:
            r1 = 0
        L_0x0071:
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 == 0) goto L_0x0081
            java.lang.String r1 = "loadAvatar error,null username"
            r10.mo137054y(r9, r1)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r12)
            goto L_0x0093
        L_0x0081:
            java.lang.Class<ln.f> r2 = p196ln.C76705f.class
            di3.d r2 = di3.C86312j.m106911c(r2)
            ln.f r2 = (p196ln.C76705f) r2
            com.tencent.mm.plugin.sns.ui.widget.SnsAvatarImageView r3 = r53.getAvatarImage()
            r2.mo106849z(r3, r1)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r12)
        L_0x0093:
            r53.mo137052w()
            java.lang.String r8 = "loadGameAboutView"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r8, r12)
            iu2.a r0 = r10.f286709W
            java.lang.String r7 = "null cannot be cast to non-null type android.widget.TextView"
            java.lang.String r6 = "null cannot be cast to non-null type android.view.ViewStub"
            r16 = 8
            r5 = 2131165644(0x7f0701cc, float:1.794551E38)
            java.lang.String r4 = "com.tencent.mm.plugin.sns.ui.improve.model.ImproveSnsInfo"
            r3 = -2
            if (r0 == 0) goto L_0x0204
            gu2.b r1 = r0.mo138170b()
            if (r1 != 0) goto L_0x00b6
            goto L_0x0204
        L_0x00b6:
            java.lang.String r0 = "getShowGameInfo"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r4)
            java.lang.Boolean r2 = r1.f287967X0
            if (r2 != 0) goto L_0x00c2
            r1.mo137514L2()
        L_0x00c2:
            java.lang.Boolean r2 = r1.f287967X0
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r4)
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r0 = gy3.C87412m.m108589b(r2, r0)
            if (r0 == 0) goto L_0x01ac
            android.view.View r0 = r53.getGameAboutStub()
            boolean r0 = r0 instanceof android.view.ViewStub
            if (r0 == 0) goto L_0x0134
            r2 = 1
            r18 = 2131101521(0x7f060751, float:1.7815454E38)
            r19 = 2131165645(0x7f0701cd, float:1.7945513E38)
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 120(0x78, float:1.68E-43)
            r25 = 0
            r0 = r53
            r15 = r1
            r1 = r2
            r2 = r18
            r3 = r19
            r28 = r4
            r4 = r20
            r5 = r21
            r30 = r6
            r6 = r22
            r31 = r7
            r7 = r23
            r32 = r8
            r8 = r24
            r17 = r11
            r11 = r9
            r9 = r25
            android.widget.TextView r0 = eu2.C97712i.m126020l(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9)
            android.widget.LinearLayout$LayoutParams r1 = new android.widget.LinearLayout$LayoutParams
            r9 = -2
            r1.<init>(r9, r9)
            android.content.Context r2 = r53.getContext()
            r8 = 2131165644(0x7f0701cc, float:1.794551E38)
            int r2 = kg3.C76577a.m92157h(r2, r8)
            r7 = 0
            r1.setMargins(r7, r2, r7, r7)
            android.view.View r2 = r53.getGameAboutStub()
            r6 = r30
            gy3.C87412m.m108592e(r2, r6)
            android.view.ViewStub r2 = (android.view.ViewStub) r2
            vu2.C52993b.m59322a(r2, r0, r1)
            r10.setGameAboutStub(r0)
            goto L_0x0143
        L_0x0134:
            r15 = r1
            r28 = r4
            r31 = r7
            r32 = r8
            r17 = r11
            r7 = 0
            r8 = 2131165644(0x7f0701cc, float:1.794551E38)
            r11 = r9
            r9 = -2
        L_0x0143:
            android.view.View r0 = r53.getGameAboutStub()
            r5 = r31
            gy3.C87412m.m108592e(r0, r5)
            android.widget.TextView r0 = (android.widget.TextView) r0
            java.lang.String r1 = "getGameInfoText"
            r4 = r28
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r1, r4)
            java.lang.String r2 = r15.f287968Y0
            if (r2 != 0) goto L_0x015c
            r15.mo137514L2()
        L_0x015c:
            java.lang.String r2 = r15.f287968Y0
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r4)
            r0.setText(r2)
            android.view.View r0 = r53.getGameAboutStub()
            k20.a r1 = new k20.a
            r1.<init>()
            java.lang.ThreadLocal<k20.a> r2 = k20.C60958c.f173611a
            java.lang.Integer r2 = java.lang.Integer.valueOf(r7)
            r1.mo10233c(r2)
            java.lang.Object[] r19 = r1.mo10232b()
            java.lang.String r20 = "com/tencent/mm/plugin/sns/ui/improve/item/ImproveTimelineItemMeasure"
            java.lang.String r21 = "loadGameAboutView"
            java.lang.String r22 = "()V"
            java.lang.String r23 = "android/view/View_EXEC_"
            java.lang.String r24 = "setVisibility"
            java.lang.String r25 = "(I)V"
            r18 = r0
            j20.C117292a.m165358d(r18, r19, r20, r21, r22, r23, r24, r25)
            java.lang.Object r1 = r1.mo10231a(r7)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r0.setVisibility(r1)
            java.lang.String r19 = "com/tencent/mm/plugin/sns/ui/improve/item/ImproveTimelineItemMeasure"
            java.lang.String r20 = "loadGameAboutView"
            java.lang.String r21 = "()V"
            java.lang.String r22 = "android/view/View_EXEC_"
            java.lang.String r23 = "setVisibility"
            java.lang.String r24 = "(I)V"
            j20.C117292a.m165359e(r18, r19, r20, r21, r22, r23, r24)
            goto L_0x01fe
        L_0x01ac:
            r5 = r7
            r32 = r8
            r17 = r11
            r7 = 0
            r8 = 2131165644(0x7f0701cc, float:1.794551E38)
            r11 = r9
            r9 = -2
            android.view.View r0 = r53.getGameAboutStub()
            k20.a r1 = new k20.a
            r1.<init>()
            java.lang.ThreadLocal<k20.a> r2 = k20.C60958c.f173611a
            java.lang.Integer r2 = java.lang.Integer.valueOf(r16)
            r1.mo10233c(r2)
            java.lang.Object[] r34 = r1.mo10232b()
            java.lang.String r35 = "com/tencent/mm/plugin/sns/ui/improve/item/ImproveTimelineItemMeasure"
            java.lang.String r36 = "loadGameAboutView"
            java.lang.String r37 = "()V"
            java.lang.String r38 = "android/view/View_EXEC_"
            java.lang.String r39 = "setVisibility"
            java.lang.String r40 = "(I)V"
            r33 = r0
            j20.C117292a.m165358d(r33, r34, r35, r36, r37, r38, r39, r40)
            java.lang.Object r1 = r1.mo10231a(r7)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r0.setVisibility(r1)
            java.lang.String r34 = "com/tencent/mm/plugin/sns/ui/improve/item/ImproveTimelineItemMeasure"
            java.lang.String r35 = "loadGameAboutView"
            java.lang.String r36 = "()V"
            java.lang.String r37 = "android/view/View_EXEC_"
            java.lang.String r38 = "setVisibility"
            java.lang.String r39 = "(I)V"
            j20.C117292a.m165359e(r33, r34, r35, r36, r37, r38, r39)
        L_0x01fe:
            r0 = r32
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r12)
            goto L_0x0211
        L_0x0204:
            r5 = r7
            r0 = r8
            r17 = r11
            r7 = 0
            r8 = 2131165644(0x7f0701cc, float:1.794551E38)
            r11 = r9
            r9 = -2
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r12)
        L_0x0211:
            java.lang.String r15 = "loadAddressView"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r15, r12)
            iu2.a r0 = r10.f286709W
            if (r0 == 0) goto L_0x03ac
            gu2.b r3 = r0.mo138170b()
            if (r3 != 0) goto L_0x0223
            goto L_0x03ac
        L_0x0223:
            java.lang.String r0 = r3.mo137521u2()
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 != 0) goto L_0x0357
            android.view.View r0 = r53.getAddressStub()
            boolean r0 = r0 instanceof android.view.ViewStub
            if (r0 == 0) goto L_0x0292
            r1 = 1
            r2 = 2131101521(0x7f060751, float:1.7815454E38)
            r18 = 2131165645(0x7f0701cd, float:1.7945513E38)
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 120(0x78, float:1.68E-43)
            r24 = 0
            r0 = r53
            r25 = r3
            r3 = r18
            r41 = r4
            r4 = r19
            r42 = r5
            r5 = r20
            r43 = r6
            r6 = r21
            r7 = r22
            r8 = r23
            r18 = r13
            r13 = -2
            r9 = r24
            android.widget.TextView r0 = eu2.C97712i.m126020l(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9)
            android.text.TextUtils$TruncateAt r1 = android.text.TextUtils.TruncateAt.END
            r0.setEllipsize(r1)
            android.widget.LinearLayout$LayoutParams r1 = new android.widget.LinearLayout$LayoutParams
            r1.<init>(r13, r13)
            android.content.Context r2 = r53.getContext()
            r9 = 2131165644(0x7f0701cc, float:1.794551E38)
            int r2 = kg3.C76577a.m92157h(r2, r9)
            r8 = 0
            r1.setMargins(r8, r2, r8, r8)
            android.view.View r2 = r53.getAddressStub()
            r7 = r43
            gy3.C87412m.m108592e(r2, r7)
            android.view.ViewStub r2 = (android.view.ViewStub) r2
            vu2.C52993b.m59322a(r2, r0, r1)
            r10.setAddressStub(r0)
            goto L_0x02a0
        L_0x0292:
            r25 = r3
            r41 = r4
            r42 = r5
            r7 = r6
            r18 = r13
            r8 = 0
            r9 = 2131165644(0x7f0701cc, float:1.794551E38)
            r13 = -2
        L_0x02a0:
            android.view.View r0 = r53.getAddressStub()
            r6 = r42
            gy3.C87412m.m108592e(r0, r6)
            android.widget.TextView r0 = (android.widget.TextView) r0
            java.lang.String r1 = r25.mo137521u2()
            r0.setText(r1)
            java.lang.String r1 = "getAddressClickable"
            r5 = r41
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r1, r5)
            r2 = r25
            java.lang.Boolean r3 = r2.f287965V0
            if (r3 != 0) goto L_0x02c2
            r2.mo137512J2()
        L_0x02c2:
            java.lang.Boolean r2 = r2.f287965V0
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r5)
            if (r2 == 0) goto L_0x02ce
            boolean r2 = r2.booleanValue()
            goto L_0x02cf
        L_0x02ce:
            r2 = 0
        L_0x02cf:
            r0.setClickable(r2)
            if (r2 == 0) goto L_0x02e0
            android.content.Context r1 = r53.getContext()
            r3 = 2131101521(0x7f060751, float:1.7815454E38)
            int r1 = kg3.C76577a.m92153d(r1, r3)
            goto L_0x02eb
        L_0x02e0:
            android.content.Context r1 = r53.getContext()
            r3 = 2131100381(0x7f0602dd, float:1.7813142E38)
            int r1 = kg3.C76577a.m92153d(r1, r3)
        L_0x02eb:
            if (r2 == 0) goto L_0x02fc
            android.content.Context r2 = r53.getContext()
            r3 = 2131234949(0x7f081085, float:1.8086078E38)
            android.graphics.drawable.Drawable r2 = kg3.C76577a.m92158i(r2, r3)
            r0.setBackground(r2)
            goto L_0x030a
        L_0x02fc:
            android.content.Context r2 = r53.getContext()
            r3 = 2131234067(0x7f080d13, float:1.808429E38)
            android.graphics.drawable.Drawable r2 = kg3.C76577a.m92158i(r2, r3)
            r0.setBackground(r2)
        L_0x030a:
            r0.setTextColor(r1)
            android.view.View r0 = r53.getAddressStub()
            k20.a r1 = new k20.a
            r1.<init>()
            java.lang.ThreadLocal<k20.a> r2 = k20.C60958c.f173611a
            java.lang.Integer r2 = java.lang.Integer.valueOf(r8)
            r1.mo10233c(r2)
            java.lang.Object[] r27 = r1.mo10232b()
            java.lang.String r28 = "com/tencent/mm/plugin/sns/ui/improve/item/ImproveTimelineItemMeasure"
            java.lang.String r29 = "loadAddressView"
            java.lang.String r30 = "()V"
            java.lang.String r31 = "android/view/View_EXEC_"
            java.lang.String r32 = "setVisibility"
            java.lang.String r33 = "(I)V"
            r26 = r0
            j20.C117292a.m165358d(r26, r27, r28, r29, r30, r31, r32, r33)
            java.lang.Object r1 = r1.mo10231a(r8)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r0.setVisibility(r1)
            java.lang.String r20 = "com/tencent/mm/plugin/sns/ui/improve/item/ImproveTimelineItemMeasure"
            java.lang.String r21 = "loadAddressView"
            java.lang.String r22 = "()V"
            java.lang.String r23 = "android/view/View_EXEC_"
            java.lang.String r24 = "setVisibility"
            java.lang.String r25 = "(I)V"
            r19 = r0
            j20.C117292a.m165359e(r19, r20, r21, r22, r23, r24, r25)
            goto L_0x03a8
        L_0x0357:
            r7 = r6
            r18 = r13
            r8 = 0
            r9 = 2131165644(0x7f0701cc, float:1.794551E38)
            r13 = -2
            r6 = r5
            r5 = r4
            android.view.View r0 = r53.getAddressStub()
            k20.a r1 = new k20.a
            r1.<init>()
            java.lang.ThreadLocal<k20.a> r2 = k20.C60958c.f173611a
            java.lang.Integer r2 = java.lang.Integer.valueOf(r16)
            r1.mo10233c(r2)
            java.lang.Object[] r27 = r1.mo10232b()
            java.lang.String r28 = "com/tencent/mm/plugin/sns/ui/improve/item/ImproveTimelineItemMeasure"
            java.lang.String r29 = "loadAddressView"
            java.lang.String r30 = "()V"
            java.lang.String r31 = "android/view/View_EXEC_"
            java.lang.String r32 = "setVisibility"
            java.lang.String r33 = "(I)V"
            r26 = r0
            j20.C117292a.m165358d(r26, r27, r28, r29, r30, r31, r32, r33)
            java.lang.Object r1 = r1.mo10231a(r8)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r0.setVisibility(r1)
            java.lang.String r27 = "com/tencent/mm/plugin/sns/ui/improve/item/ImproveTimelineItemMeasure"
            java.lang.String r28 = "loadAddressView"
            java.lang.String r29 = "()V"
            java.lang.String r30 = "android/view/View_EXEC_"
            java.lang.String r31 = "setVisibility"
            java.lang.String r32 = "(I)V"
            j20.C117292a.m165359e(r26, r27, r28, r29, r30, r31, r32)
        L_0x03a8:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r15, r12)
            goto L_0x03b9
        L_0x03ac:
            r7 = r6
            r18 = r13
            r8 = 0
            r9 = 2131165644(0x7f0701cc, float:1.794551E38)
            r13 = -2
            r6 = r5
            r5 = r4
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r15, r12)
        L_0x03b9:
            java.lang.String r15 = "loadWithFriendView"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r15, r12)
            iu2.a r0 = r10.f286709W
            java.lang.String r4 = ""
            if (r0 == 0) goto L_0x05f1
            gu2.b r3 = r0.mo138170b()
            if (r3 != 0) goto L_0x03cd
            goto L_0x05f1
        L_0x03cd:
            java.lang.String r0 = "getShowWithUser"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r5)
            java.lang.Boolean r1 = r3.f287970a1
            if (r1 != 0) goto L_0x03d9
            r3.mo137515M2()
        L_0x03d9:
            java.lang.Boolean r1 = r3.f287970a1
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r5)
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            boolean r0 = gy3.C87412m.m108589b(r1, r2)
            if (r0 == 0) goto L_0x059f
            android.view.View r0 = r53.getWithFriendStub()
            boolean r0 = r0 instanceof android.view.ViewStub
            if (r0 == 0) goto L_0x0449
            r1 = 0
            r19 = 2131101556(0x7f060774, float:1.7815525E38)
            r20 = 2131165645(0x7f0701cd, float:1.7945513E38)
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 120(0x78, float:1.68E-43)
            r26 = 0
            r0 = r53
            r44 = r2
            r2 = r19
            r45 = r3
            r3 = r20
            r46 = r4
            r4 = r21
            r47 = r5
            r5 = r22
            r48 = r6
            r6 = r23
            r49 = r7
            r7 = r24
            r8 = r25
            r9 = r26
            android.widget.TextView r0 = eu2.C97712i.m126020l(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9)
            android.widget.LinearLayout$LayoutParams r1 = new android.widget.LinearLayout$LayoutParams
            r1.<init>(r13, r13)
            android.content.Context r2 = r53.getContext()
            r3 = 2131165644(0x7f0701cc, float:1.794551E38)
            int r2 = kg3.C76577a.m92157h(r2, r3)
            r9 = 0
            r1.setMargins(r9, r2, r9, r9)
            android.view.View r2 = r53.getWithFriendStub()
            r8 = r49
            gy3.C87412m.m108592e(r2, r8)
            android.view.ViewStub r2 = (android.view.ViewStub) r2
            vu2.C52993b.m59322a(r2, r0, r1)
            r10.setWithFriendStub(r0)
            goto L_0x0455
        L_0x0449:
            r44 = r2
            r45 = r3
            r46 = r4
            r47 = r5
            r48 = r6
            r8 = r7
            r9 = 0
        L_0x0455:
            android.view.View r0 = r53.getWithFriendStub()
            r7 = r48
            gy3.C87412m.m108592e(r0, r7)
            android.widget.TextView r0 = (android.widget.TextView) r0
            java.lang.String r1 = "getWithUserMentionMe"
            r6 = r47
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r1, r6)
            r2 = r45
            java.lang.Boolean r3 = r2.f287972c1
            if (r3 != 0) goto L_0x0470
            r2.mo137515M2()
        L_0x0470:
            java.lang.Boolean r3 = r2.f287972c1
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r6)
            r1 = r44
            boolean r1 = gy3.C87412m.m108589b(r3, r1)
            if (r1 == 0) goto L_0x04d0
            r1 = 2131837218(0x7f114122, float:1.9307625E38)
            r5 = r46
            r10.mo137039B(r0, r1, r5)
            android.view.View r0 = r53.getWithFriendStub()
            k20.a r1 = new k20.a
            r1.<init>()
            java.lang.ThreadLocal<k20.a> r2 = k20.C60958c.f173611a
            java.lang.Integer r2 = java.lang.Integer.valueOf(r9)
            r1.mo10233c(r2)
            java.lang.Object[] r27 = r1.mo10232b()
            java.lang.String r28 = "com/tencent/mm/plugin/sns/ui/improve/item/ImproveTimelineItemMeasure"
            java.lang.String r29 = "loadWithFriendView"
            java.lang.String r30 = "()V"
            java.lang.String r31 = "android/view/View_EXEC_"
            java.lang.String r32 = "setVisibility"
            java.lang.String r33 = "(I)V"
            r26 = r0
            j20.C117292a.m165358d(r26, r27, r28, r29, r30, r31, r32, r33)
            java.lang.Object r1 = r1.mo10231a(r9)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r0.setVisibility(r1)
            java.lang.String r20 = "com/tencent/mm/plugin/sns/ui/improve/item/ImproveTimelineItemMeasure"
            java.lang.String r21 = "loadWithFriendView"
            java.lang.String r22 = "()V"
            java.lang.String r23 = "android/view/View_EXEC_"
            java.lang.String r24 = "setVisibility"
            java.lang.String r25 = "(I)V"
            r19 = r0
            j20.C117292a.m165359e(r19, r20, r21, r22, r23, r24, r25)
            goto L_0x05ed
        L_0x04d0:
            r5 = r46
            java.lang.String r1 = "getWithUserText"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r1, r6)
            java.lang.String r3 = r2.f287971b1
            if (r3 != 0) goto L_0x04de
            r2.mo137515M2()
        L_0x04de:
            java.lang.String r3 = r2.f287971b1
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r6)
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
            if (r3 != 0) goto L_0x0557
            int r3 = r53.getViewType()
            r4 = 7
            if (r3 != r4) goto L_0x04f4
            r3 = 2131837216(0x7f114120, float:1.930762E38)
            goto L_0x04f7
        L_0x04f4:
            r3 = 2131837217(0x7f114121, float:1.9307623E38)
        L_0x04f7:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r1, r6)
            java.lang.String r4 = r2.f287971b1
            if (r4 != 0) goto L_0x0501
            r2.mo137515M2()
        L_0x0501:
            java.lang.String r2 = r2.f287971b1
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r6)
            gy3.C87412m.m108591d(r2)
            r10.mo137039B(r0, r3, r2)
            android.view.View r0 = r53.getWithFriendStub()
            k20.a r1 = new k20.a
            r1.<init>()
            java.lang.ThreadLocal<k20.a> r2 = k20.C60958c.f173611a
            java.lang.Integer r2 = java.lang.Integer.valueOf(r9)
            r1.mo10233c(r2)
            java.lang.Object[] r27 = r1.mo10232b()
            java.lang.String r28 = "com/tencent/mm/plugin/sns/ui/improve/item/ImproveTimelineItemMeasure"
            java.lang.String r29 = "loadWithFriendView"
            java.lang.String r30 = "()V"
            java.lang.String r31 = "android/view/View_EXEC_"
            java.lang.String r32 = "setVisibility"
            java.lang.String r33 = "(I)V"
            r26 = r0
            j20.C117292a.m165358d(r26, r27, r28, r29, r30, r31, r32, r33)
            java.lang.Object r1 = r1.mo10231a(r9)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r0.setVisibility(r1)
            java.lang.String r20 = "com/tencent/mm/plugin/sns/ui/improve/item/ImproveTimelineItemMeasure"
            java.lang.String r21 = "loadWithFriendView"
            java.lang.String r22 = "()V"
            java.lang.String r23 = "android/view/View_EXEC_"
            java.lang.String r24 = "setVisibility"
            java.lang.String r25 = "(I)V"
            r19 = r0
            j20.C117292a.m165359e(r19, r20, r21, r22, r23, r24, r25)
            goto L_0x05ed
        L_0x0557:
            android.view.View r0 = r53.getWithFriendStub()
            k20.a r1 = new k20.a
            r1.<init>()
            java.lang.ThreadLocal<k20.a> r2 = k20.C60958c.f173611a
            java.lang.Integer r2 = java.lang.Integer.valueOf(r16)
            r1.mo10233c(r2)
            java.lang.Object[] r27 = r1.mo10232b()
            java.lang.String r28 = "com/tencent/mm/plugin/sns/ui/improve/item/ImproveTimelineItemMeasure"
            java.lang.String r29 = "loadWithFriendView"
            java.lang.String r30 = "()V"
            java.lang.String r31 = "android/view/View_EXEC_"
            java.lang.String r32 = "setVisibility"
            java.lang.String r33 = "(I)V"
            r26 = r0
            j20.C117292a.m165358d(r26, r27, r28, r29, r30, r31, r32, r33)
            java.lang.Object r1 = r1.mo10231a(r9)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r0.setVisibility(r1)
            java.lang.String r27 = "com/tencent/mm/plugin/sns/ui/improve/item/ImproveTimelineItemMeasure"
            java.lang.String r28 = "loadWithFriendView"
            java.lang.String r29 = "()V"
            java.lang.String r30 = "android/view/View_EXEC_"
            java.lang.String r31 = "setVisibility"
            java.lang.String r32 = "(I)V"
            j20.C117292a.m165359e(r26, r27, r28, r29, r30, r31, r32)
            goto L_0x05ed
        L_0x059f:
            r8 = r7
            r9 = 0
            r7 = r6
            r6 = r5
            r5 = r4
            android.view.View r0 = r53.getWithFriendStub()
            k20.a r1 = new k20.a
            r1.<init>()
            java.lang.ThreadLocal<k20.a> r2 = k20.C60958c.f173611a
            java.lang.Integer r2 = java.lang.Integer.valueOf(r16)
            r1.mo10233c(r2)
            java.lang.Object[] r34 = r1.mo10232b()
            java.lang.String r35 = "com/tencent/mm/plugin/sns/ui/improve/item/ImproveTimelineItemMeasure"
            java.lang.String r36 = "loadWithFriendView"
            java.lang.String r37 = "()V"
            java.lang.String r38 = "android/view/View_EXEC_"
            java.lang.String r39 = "setVisibility"
            java.lang.String r40 = "(I)V"
            r33 = r0
            j20.C117292a.m165358d(r33, r34, r35, r36, r37, r38, r39, r40)
            java.lang.Object r1 = r1.mo10231a(r9)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r0.setVisibility(r1)
            java.lang.String r20 = "com/tencent/mm/plugin/sns/ui/improve/item/ImproveTimelineItemMeasure"
            java.lang.String r21 = "loadWithFriendView"
            java.lang.String r22 = "()V"
            java.lang.String r23 = "android/view/View_EXEC_"
            java.lang.String r24 = "setVisibility"
            java.lang.String r25 = "(I)V"
            r19 = r0
            j20.C117292a.m165359e(r19, r20, r21, r22, r23, r24, r25)
        L_0x05ed:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r15, r12)
            goto L_0x05f9
        L_0x05f1:
            r8 = r7
            r9 = 0
            r7 = r6
            r6 = r5
            r5 = r4
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r15, r12)
        L_0x05f9:
            java.lang.String r0 = "loadTypeIcon"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r12)
            iu2.a r1 = r10.f286709W
            r15 = 2131165306(0x7f07007a, float:1.7944825E38)
            if (r1 == 0) goto L_0x073c
            gu2.b r1 = r1.mo138170b()
            if (r1 != 0) goto L_0x060e
            goto L_0x073c
        L_0x060e:
            java.lang.String r2 = "getShowTypeIcon"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r6)
            java.lang.Boolean r3 = r1.f287977h1
            if (r3 != 0) goto L_0x0630
            com.tencent.mm.protocal.protobuf.TimeLineObject r3 = r1.mo137509G2()
            if (r3 == 0) goto L_0x0629
            te3.j00 r3 = r3.ContentObj
            if (r3 == 0) goto L_0x0629
            int r3 = r3.f298424e
            r4 = 30
            if (r3 != r4) goto L_0x0629
            r3 = 1
            goto L_0x062a
        L_0x0629:
            r3 = 0
        L_0x062a:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            r1.f287977h1 = r3
        L_0x0630:
            java.lang.Boolean r1 = r1.f287977h1
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r6)
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            boolean r1 = gy3.C87412m.m108589b(r1, r2)
            if (r1 == 0) goto L_0x06f1
            android.view.View r1 = r53.getTypeIcon()
            boolean r1 = r1 instanceof android.view.ViewStub
            if (r1 == 0) goto L_0x06a3
            com.tencent.mm.ui.widget.imageview.WeImageView r1 = new com.tencent.mm.ui.widget.imageview.WeImageView
            android.content.Context r2 = r53.getContext()
            r1.<init>(r2)
            r2 = 2131756358(0x7f100546, float:1.9143621E38)
            r1.setImageResource(r2)
            android.content.Context r2 = r1.getContext()
            r3 = 2131099669(0x7f060015, float:1.7811698E38)
            int r2 = kg3.C76577a.m92153d(r2, r3)
            r1.setIconColor(r2)
            android.content.Context r2 = r53.getContext()
            r3 = 2131165310(0x7f07007e, float:1.7944834E38)
            int r2 = kg3.C76577a.m92157h(r2, r3)
            android.content.Context r3 = r53.getContext()
            int r3 = kg3.C76577a.m92157h(r3, r15)
            android.content.Context r4 = r53.getContext()
            r15 = 2131165277(0x7f07005d, float:1.7944767E38)
            int r4 = kg3.C76577a.m92157h(r4, r15)
            android.content.Context r15 = r53.getContext()
            r13 = 2131165371(0x7f0700bb, float:1.7944957E38)
            int r13 = kg3.C76577a.m92157h(r15, r13)
            int r4 = r4 - r13
            android.widget.LinearLayout$LayoutParams r13 = new android.widget.LinearLayout$LayoutParams
            r13.<init>(r2, r2)
            r13.setMargins(r3, r9, r4, r9)
            android.view.View r2 = r53.getTypeIcon()
            gy3.C87412m.m108592e(r2, r8)
            android.view.ViewStub r2 = (android.view.ViewStub) r2
            vu2.C52993b.m59322a(r2, r1, r13)
            r10.setTypeIcon(r1)
        L_0x06a3:
            java.lang.String r1 = "loadTypeIcon: show"
            r10.mo137053x(r11, r1)
            android.view.View r1 = r53.getTypeIcon()
            k20.a r2 = new k20.a
            r2.<init>()
            java.lang.ThreadLocal<k20.a> r3 = k20.C60958c.f173611a
            java.lang.Integer r3 = java.lang.Integer.valueOf(r9)
            r2.mo10233c(r3)
            java.lang.Object[] r29 = r2.mo10232b()
            java.lang.String r30 = "com/tencent/mm/plugin/sns/ui/improve/item/ImproveTimelineItemMeasure"
            java.lang.String r31 = "loadTypeIcon"
            java.lang.String r32 = "()V"
            java.lang.String r33 = "android/view/View_EXEC_"
            java.lang.String r34 = "setVisibility"
            java.lang.String r35 = "(I)V"
            r28 = r1
            j20.C117292a.m165358d(r28, r29, r30, r31, r32, r33, r34, r35)
            java.lang.Object r2 = r2.mo10231a(r9)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r1.setVisibility(r2)
            java.lang.String r29 = "com/tencent/mm/plugin/sns/ui/improve/item/ImproveTimelineItemMeasure"
            java.lang.String r30 = "loadTypeIcon"
            java.lang.String r31 = "()V"
            java.lang.String r32 = "android/view/View_EXEC_"
            java.lang.String r33 = "setVisibility"
            java.lang.String r34 = "(I)V"
            j20.C117292a.m165359e(r28, r29, r30, r31, r32, r33, r34)
            goto L_0x0738
        L_0x06f1:
            android.view.View r1 = r53.getTypeIcon()
            k20.a r2 = new k20.a
            r2.<init>()
            java.lang.ThreadLocal<k20.a> r3 = k20.C60958c.f173611a
            java.lang.Integer r3 = java.lang.Integer.valueOf(r16)
            r2.mo10233c(r3)
            java.lang.Object[] r36 = r2.mo10232b()
            java.lang.String r37 = "com/tencent/mm/plugin/sns/ui/improve/item/ImproveTimelineItemMeasure"
            java.lang.String r38 = "loadTypeIcon"
            java.lang.String r39 = "()V"
            java.lang.String r40 = "android/view/View_EXEC_"
            java.lang.String r41 = "setVisibility"
            java.lang.String r42 = "(I)V"
            r35 = r1
            j20.C117292a.m165358d(r35, r36, r37, r38, r39, r40, r41, r42)
            java.lang.Object r2 = r2.mo10231a(r9)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r1.setVisibility(r2)
            java.lang.String r36 = "com/tencent/mm/plugin/sns/ui/improve/item/ImproveTimelineItemMeasure"
            java.lang.String r37 = "loadTypeIcon"
            java.lang.String r38 = "()V"
            java.lang.String r39 = "android/view/View_EXEC_"
            java.lang.String r40 = "setVisibility"
            java.lang.String r41 = "(I)V"
            j20.C117292a.m165359e(r35, r36, r37, r38, r39, r40, r41)
        L_0x0738:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r12)
            goto L_0x073f
        L_0x073c:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r12)
        L_0x073f:
            java.lang.String r11 = "loadAppNameView"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r11, r12)
            iu2.a r0 = r10.f286709W
            if (r0 == 0) goto L_0x096c
            gu2.b r15 = r0.mo138170b()
            if (r15 != 0) goto L_0x0751
            goto L_0x096c
        L_0x0751:
            java.lang.String r0 = "getShowAppName"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r6)
            java.lang.Boolean r1 = r15.f287973d1
            if (r1 != 0) goto L_0x075d
            r15.mo137513K2()
        L_0x075d:
            java.lang.Boolean r1 = r15.f287973d1
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r6)
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
            boolean r0 = gy3.C87412m.m108589b(r1, r4)
            if (r0 == 0) goto L_0x091b
            android.view.View r0 = r53.getAppNameStub()
            boolean r0 = r0 instanceof android.view.ViewStub
            if (r0 == 0) goto L_0x07cd
            r1 = 1
            r2 = 2131101521(0x7f060751, float:1.7815454E38)
            r3 = 2131165645(0x7f0701cd, float:1.7945513E38)
            r21 = 1
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 112(0x70, float:1.57E-43)
            r26 = 0
            r0 = r53
            r50 = r4
            r13 = 1
            r4 = r21
            r21 = r5
            r5 = r22
            r51 = r6
            r6 = r23
            r52 = r7
            r7 = r24
            r13 = r8
            r8 = r25
            r23 = r14
            r14 = 0
            r9 = r26
            android.widget.TextView r0 = eu2.C97712i.m126020l(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9)
            android.text.TextUtils$TruncateAt r1 = android.text.TextUtils.TruncateAt.END
            r0.setEllipsize(r1)
            android.widget.LinearLayout$LayoutParams r1 = new android.widget.LinearLayout$LayoutParams
            r2 = -2
            r1.<init>(r2, r2)
            android.content.Context r2 = r53.getContext()
            r3 = 2131165306(0x7f07007a, float:1.7944825E38)
            int r2 = kg3.C76577a.m92157h(r2, r3)
            r1.setMargins(r2, r14, r14, r14)
            android.view.View r2 = r53.getAppNameStub()
            gy3.C87412m.m108592e(r2, r13)
            android.view.ViewStub r2 = (android.view.ViewStub) r2
            vu2.C52993b.m59322a(r2, r0, r1)
            r10.setAppNameStub(r0)
            goto L_0x07d9
        L_0x07cd:
            r50 = r4
            r21 = r5
            r51 = r6
            r52 = r7
            r13 = r8
            r23 = r14
            r14 = 0
        L_0x07d9:
            com.tencent.mm.protocal.protobuf.TimeLineObject r0 = r15.mo137509G2()
            if (r0 != 0) goto L_0x07e7
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r11, r12)
            r3 = r51
            r4 = 1
            goto L_0x0975
        L_0x07e7:
            te3.j00 r1 = r0.ContentObj
            if (r1 == 0) goto L_0x080a
            int r2 = r1.f298424e
            r3 = 28
            if (r2 == r3) goto L_0x0808
            r3 = 34
            if (r2 == r3) goto L_0x0808
            r3 = 45
            if (r2 == r3) goto L_0x0808
            r3 = 43
            if (r2 == r3) goto L_0x0808
            r3 = 36
            if (r2 == r3) goto L_0x0808
            r3 = 1
            if (r2 != r3) goto L_0x080a
            te3.p81 r1 = r1.f298435s
            if (r1 == 0) goto L_0x080a
        L_0x0808:
            r2 = 1
            goto L_0x080b
        L_0x080a:
            r2 = 0
        L_0x080b:
            java.lang.String r1 = "getAppNameText"
            r3 = r51
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r1, r3)
            java.lang.CharSequence r4 = r15.f287975f1
            if (r4 != 0) goto L_0x0819
            r15.mo137513K2()
        L_0x0819:
            java.lang.CharSequence r4 = r15.f287975f1
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r3)
            if (r4 != 0) goto L_0x0822
            r4 = r21
        L_0x0822:
            java.lang.String r4 = (java.lang.String) r4
            int r1 = r4.length()
            r5 = 10
            if (r1 <= r5) goto L_0x0847
            if (r2 != 0) goto L_0x0847
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.CharSequence r2 = r4.subSequence(r14, r5)
            java.lang.String r2 = r2.toString()
            r1.append(r2)
            java.lang.String r2 = "..."
            r1.append(r2)
            java.lang.String r4 = r1.toString()
        L_0x0847:
            android.text.SpannableString r1 = new android.text.SpannableString
            r1.<init>(r4)
            eu2.m r2 = new eu2.m
            r2.<init>(r10, r15)
            int r4 = r1.length()
            r5 = 33
            r1.setSpan(r2, r14, r4, r5)
            android.view.View r2 = r53.getAppNameStub()
            r4 = 1
            r2.setClickable(r4)
            android.view.View r2 = r53.getAppNameStub()
            com.tencent.mm.plugin.sns.ui.l1 r5 = new com.tencent.mm.plugin.sns.ui.l1
            r5.<init>()
            r2.setOnTouchListener(r5)
            java.lang.String r2 = "getAppTailClickable"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r3)
            java.lang.Boolean r5 = r15.f287974e1
            if (r5 != 0) goto L_0x087a
            r15.mo137513K2()
        L_0x087a:
            java.lang.Boolean r5 = r15.f287974e1
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)
            r2 = r50
            boolean r2 = gy3.C87412m.m108589b(r5, r2)
            if (r2 != 0) goto L_0x08bb
            te3.r5 r0 = r0.AppInfo
            java.lang.String r0 = r0.f299236d
            java.lang.String r2 = "wx7fa037cc7dfabad5"
            boolean r0 = gy3.C87412m.m108589b(r2, r0)
            if (r0 != 0) goto L_0x08bb
            android.view.View r0 = r53.getAppNameStub()
            r2 = r52
            gy3.C87412m.m108592e(r0, r2)
            android.widget.TextView r0 = (android.widget.TextView) r0
            android.content.Context r5 = r53.getContext()
            r6 = 2131101515(0x7f06074b, float:1.7815442E38)
            int r5 = kg3.C76577a.m92153d(r5, r6)
            r0.setTextColor(r5)
            android.view.View r0 = r53.getAppNameStub()
            gy3.C87412m.m108592e(r0, r2)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r5 = 0
            r0.setOnTouchListener(r5)
            goto L_0x08bd
        L_0x08bb:
            r2 = r52
        L_0x08bd:
            android.view.View r0 = r53.getAppNameStub()
            gy3.C87412m.m108592e(r0, r2)
            android.widget.TextView r0 = (android.widget.TextView) r0
            android.text.TextUtils$TruncateAt r2 = android.text.TextUtils.TruncateAt.END
            r0.setEllipsize(r2)
            android.widget.TextView$BufferType r2 = android.widget.TextView.BufferType.SPANNABLE
            r0.setText(r1, r2)
            r0.setContentDescription(r1)
            android.view.View r0 = r53.getAppNameStub()
            k20.a r1 = new k20.a
            r1.<init>()
            java.lang.ThreadLocal<k20.a> r2 = k20.C60958c.f173611a
            java.lang.Integer r2 = java.lang.Integer.valueOf(r14)
            r1.mo10233c(r2)
            java.lang.Object[] r29 = r1.mo10232b()
            java.lang.String r30 = "com/tencent/mm/plugin/sns/ui/improve/item/ImproveTimelineItemMeasure"
            java.lang.String r31 = "loadAppNameView"
            java.lang.String r32 = "()V"
            java.lang.String r33 = "android/view/View_EXEC_"
            java.lang.String r34 = "setVisibility"
            java.lang.String r35 = "(I)V"
            r28 = r0
            j20.C117292a.m165358d(r28, r29, r30, r31, r32, r33, r34, r35)
            java.lang.Object r1 = r1.mo10231a(r14)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r0.setVisibility(r1)
            java.lang.String r29 = "com/tencent/mm/plugin/sns/ui/improve/item/ImproveTimelineItemMeasure"
            java.lang.String r30 = "loadAppNameView"
            java.lang.String r31 = "()V"
            java.lang.String r32 = "android/view/View_EXEC_"
            java.lang.String r33 = "setVisibility"
            java.lang.String r34 = "(I)V"
            j20.C117292a.m165359e(r28, r29, r30, r31, r32, r33, r34)
            goto L_0x0968
        L_0x091b:
            r3 = r6
            r13 = r8
            r23 = r14
            r4 = 1
            r14 = 0
            android.view.View r0 = r53.getAppNameStub()
            k20.a r1 = new k20.a
            r1.<init>()
            java.lang.ThreadLocal<k20.a> r2 = k20.C60958c.f173611a
            java.lang.Integer r2 = java.lang.Integer.valueOf(r16)
            r1.mo10233c(r2)
            java.lang.Object[] r36 = r1.mo10232b()
            java.lang.String r37 = "com/tencent/mm/plugin/sns/ui/improve/item/ImproveTimelineItemMeasure"
            java.lang.String r38 = "loadAppNameView"
            java.lang.String r39 = "()V"
            java.lang.String r40 = "android/view/View_EXEC_"
            java.lang.String r41 = "setVisibility"
            java.lang.String r42 = "(I)V"
            r35 = r0
            j20.C117292a.m165358d(r35, r36, r37, r38, r39, r40, r41, r42)
            java.lang.Object r1 = r1.mo10231a(r14)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r0.setVisibility(r1)
            java.lang.String r36 = "com/tencent/mm/plugin/sns/ui/improve/item/ImproveTimelineItemMeasure"
            java.lang.String r37 = "loadAppNameView"
            java.lang.String r38 = "()V"
            java.lang.String r39 = "android/view/View_EXEC_"
            java.lang.String r40 = "setVisibility"
            java.lang.String r41 = "(I)V"
            j20.C117292a.m165359e(r35, r36, r37, r38, r39, r40, r41)
        L_0x0968:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r11, r12)
            goto L_0x0975
        L_0x096c:
            r3 = r6
            r13 = r8
            r23 = r14
            r4 = 1
            r14 = 0
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r11, r12)
        L_0x0975:
            java.lang.String r11 = "loadFeedDeleteView"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r11, r12)
            iu2.a r0 = r10.f286709W
            if (r0 == 0) goto L_0x0a9c
            gu2.b r15 = r0.mo138170b()
            if (r15 != 0) goto L_0x0987
            goto L_0x0a9c
        L_0x0987:
            java.lang.String r0 = "isMe"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r3)
            java.lang.String r1 = r15.getUserName()
            if (r1 == 0) goto L_0x09a8
            java.lang.String r1 = r15.getUserName()
            au2.b r2 = au2.C92093b.f263643a
            java.lang.String r2 = r2.mo126084a()
            boolean r1 = gy3.C87412m.m108589b(r1, r2)
            if (r1 == 0) goto L_0x09a8
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r3)
            r2 = 1
            goto L_0x09ac
        L_0x09a8:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r3)
            r2 = 0
        L_0x09ac:
            if (r2 == 0) goto L_0x0a52
            android.view.View r0 = r53.getDelTextStub()
            boolean r0 = r0 instanceof android.view.ViewStub
            if (r0 == 0) goto L_0x09ff
            r1 = 1
            r2 = 2131101521(0x7f060751, float:1.7815454E38)
            r3 = 2131165645(0x7f0701cd, float:1.7945513E38)
            r4 = 1
            r5 = 2131296813(0x7f09022d, float:1.8211553E38)
            r6 = 2131234949(0x7f081085, float:1.8086078E38)
            r7 = 0
            r8 = 64
            r9 = 0
            r0 = r53
            android.widget.TextView r0 = eu2.C97712i.m126020l(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9)
            android.text.TextUtils$TruncateAt r1 = android.text.TextUtils.TruncateAt.END
            r0.setEllipsize(r1)
            android.content.Context r1 = r0.getContext()
            r2 = 2131821450(0x7f11038a, float:1.9275644E38)
            java.lang.String r1 = kg3.C76577a.m92166q(r1, r2)
            r0.setText(r1)
            android.widget.LinearLayout$LayoutParams r1 = new android.widget.LinearLayout$LayoutParams
            r2 = -2
            r1.<init>(r2, r2)
            r2 = 10
            int r2 = r10.mo137011n(r2)
            r1.setMargins(r2, r14, r14, r14)
            android.view.View r2 = r53.getDelTextStub()
            gy3.C87412m.m108592e(r2, r13)
            android.view.ViewStub r2 = (android.view.ViewStub) r2
            vu2.C52993b.m59322a(r2, r0, r1)
            r10.setDelTextStub(r0)
        L_0x09ff:
            android.view.View r3 = r53.getDelTextStub()
            k20.a r0 = new k20.a
            r0.<init>()
            java.lang.ThreadLocal<k20.a> r1 = k20.C60958c.f173611a
            java.lang.Integer r1 = java.lang.Integer.valueOf(r14)
            r0.mo10233c(r1)
            java.lang.Object[] r27 = r0.mo10232b()
            java.lang.String r28 = "com/tencent/mm/plugin/sns/ui/improve/item/ImproveTimelineItemMeasure"
            java.lang.String r29 = "loadFeedDeleteView"
            java.lang.String r30 = "()V"
            java.lang.String r31 = "android/view/View_EXEC_"
            java.lang.String r32 = "setVisibility"
            java.lang.String r33 = "(I)V"
            r26 = r3
            j20.C117292a.m165358d(r26, r27, r28, r29, r30, r31, r32, r33)
            java.lang.Object r0 = r0.mo10231a(r14)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            r3.setVisibility(r0)
            java.lang.String r4 = "com/tencent/mm/plugin/sns/ui/improve/item/ImproveTimelineItemMeasure"
            java.lang.String r5 = "loadFeedDeleteView"
            java.lang.String r6 = "()V"
            java.lang.String r7 = "android/view/View_EXEC_"
            java.lang.String r8 = "setVisibility"
            java.lang.String r9 = "(I)V"
            j20.C117292a.m165359e(r3, r4, r5, r6, r7, r8, r9)
            android.view.View r0 = r53.getDelTextStub()
            java.lang.String r1 = r15.mo137503A2()
            r0.setTag(r1)
            goto L_0x0a98
        L_0x0a52:
            android.view.View r0 = r53.getDelTextStub()
            k20.a r1 = new k20.a
            r1.<init>()
            java.lang.ThreadLocal<k20.a> r2 = k20.C60958c.f173611a
            java.lang.Integer r2 = java.lang.Integer.valueOf(r16)
            r1.mo10233c(r2)
            java.lang.Object[] r3 = r1.mo10232b()
            java.lang.String r4 = "com/tencent/mm/plugin/sns/ui/improve/item/ImproveTimelineItemMeasure"
            java.lang.String r5 = "loadFeedDeleteView"
            java.lang.String r6 = "()V"
            java.lang.String r7 = "android/view/View_EXEC_"
            java.lang.String r8 = "setVisibility"
            java.lang.String r9 = "(I)V"
            r2 = r0
            j20.C117292a.m165358d(r2, r3, r4, r5, r6, r7, r8, r9)
            java.lang.Object r1 = r1.mo10231a(r14)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r0.setVisibility(r1)
            java.lang.String r3 = "com/tencent/mm/plugin/sns/ui/improve/item/ImproveTimelineItemMeasure"
            java.lang.String r4 = "loadFeedDeleteView"
            java.lang.String r5 = "()V"
            java.lang.String r6 = "android/view/View_EXEC_"
            java.lang.String r7 = "setVisibility"
            java.lang.String r8 = "(I)V"
            j20.C117292a.m165359e(r2, r3, r4, r5, r6, r7, r8)
        L_0x0a98:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r11, r12)
            goto L_0x0a9f
        L_0x0a9c:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r11, r12)
        L_0x0a9f:
            r53.mo84002v()
            r53.mo84000q()
            java.lang.String r0 = r53.name()
            r1 = r23
            r1.mo133613b(r0)
            r0 = r18
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r12)
            java.lang.String r0 = "getEnableLargeUI"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ui.improve.component.ImproveConfigUIC$Companion"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            java.lang.String r2 = "access$getEnableLargeUI$cp"
            java.lang.String r3 = "com.tencent.mm.plugin.sns.ui.improve.component.ImproveConfigUIC"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r3)
            boolean r4 = ut2.C102087b.f300617d
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            if (r4 == 0) goto L_0x0ae6
            java.lang.String r0 = "adjustLargeTimelineItemLayout"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r12)
            android.view.View r1 = r53.getAppNameStub()
            boolean r2 = r1 instanceof android.widget.TextView
            if (r2 == 0) goto L_0x0adc
            r5 = r1
            android.widget.TextView r5 = (android.widget.TextView) r5
            goto L_0x0add
        L_0x0adc:
            r5 = 0
        L_0x0add:
            if (r5 == 0) goto L_0x0ae3
            r1 = 0
            r5.setEllipsize(r1)
        L_0x0ae3:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r12)
        L_0x0ae6:
            r0 = r17
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: eu2.C97736r.mo137051t():void");
    }

    /* renamed from: v */
    public void mo84002v() {
        C98214b b;
        String str;
        Class cls = C77049b.class;
        SnsMethodCalculate.markStartTimeMs("loadContentView", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemMeasure");
        C98799a aVar = this.f286709W;
        if (aVar == null || (b = aVar.mo138170b()) == null) {
            SnsMethodCalculate.markEndTimeMs("loadContentView", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemMeasure");
            return;
        }
        Context context = getContext();
        C87412m.m108593f(context, "context");
        SnsInfo C2 = b.mo137505C2();
        SnsMethodCalculate.markStartTimeMs("onItemDescSpanGenerate", "com.tencent.mm.plugin.sns.reportflow.SnsTagSearchSpanClickReportFlow$Companion");
        if (C2 == null) {
            SnsMethodCalculate.markEndTimeMs("onItemDescSpanGenerate", "com.tencent.mm.plugin.sns.reportflow.SnsTagSearchSpanClickReportFlow$Companion");
        } else {
            ze4 ze4 = new ze4();
            ze4.f228685e = 3;
            ze4.f228686f = C2.getUserName() + '#' + C102236a0.m134765q0(C2.field_snsId);
            ze4.f228687g = (long) C2.field_createTime;
            ze4.f228688h = 1;
            ze4.f228689i = C2.field_type;
            ze4.f228690j = C2.localid;
            SnsMethodCalculate.markStartTimeMs("getTAG", "com.tencent.mm.plugin.sns.reportflow.SnsTagSearchSpanClickReportFlow$Companion");
            SnsMethodCalculate.markStartTimeMs("access$getTAG$cp", "com.tencent.mm.plugin.sns.reportflow.SnsTagSearchSpanClickReportFlow");
            SnsMethodCalculate.markEndTimeMs("access$getTAG$cp", "com.tencent.mm.plugin.sns.reportflow.SnsTagSearchSpanClickReportFlow");
            SnsMethodCalculate.markEndTimeMs("getTAG", "com.tencent.mm.plugin.sns.reportflow.SnsTagSearchSpanClickReportFlow$Companion");
            Log.m105918d("MicroMsg.Sns.SnsTagSearchSpanClickReportFlow", "onItemDescSpanGenerate by snsInfo: ShareSceneId=" + ze4.f228686f + ", CreateTime=" + ze4.f228687g + ", SnsContentType=" + ze4.f228689i + ", SnsLocalId=" + ze4.f228690j);
            C45424g Lq0 = ((C77049b) C86312j.m106911c(cls)).Lq0(context, 1);
            if (Lq0 != null) {
                Lq0.mo70916a("Item_" + C2.localid, ze4);
            }
            SnsMethodCalculate.markEndTimeMs("onItemDescSpanGenerate", "com.tencent.mm.plugin.sns.reportflow.SnsTagSearchSpanClickReportFlow$Companion");
        }
        ImproveContentView contentText = getContentText();
        int i = b.mo137509G2().contentDescShowType;
        SnsMethodCalculate.markStartTimeMs("getMainContent", "com.tencent.mm.plugin.sns.ui.improve.model.ImproveSnsInfo");
        String str2 = (String) ((C36570n) b.f287960Q0).getValue();
        SnsMethodCalculate.markEndTimeMs("getMainContent", "com.tencent.mm.plugin.sns.ui.improve.model.ImproveSnsInfo");
        contentText.getClass();
        SnsMethodCalculate.markStartTimeMs("setText", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveContentView");
        contentText.f279852t = b;
        if (str2 != null) {
            Pattern compile = Pattern.compile("[\\p{Cf}]");
            C87412m.m108593f(compile, "compile(pattern)");
            String replaceAll = compile.matcher(str2).replaceAll("");
            C87412m.m108593f(replaceAll, "nativePattern.matcher(in…).replaceAll(replacement)");
            str = C112550d0.m153799i0(replaceAll).toString();
        } else {
            str = null;
        }
        contentText.f279853u = str;
        contentText.f279854v = i;
        contentText.setVisibility(TextUtils.isEmpty(str2) ? 8 : 0);
        if (contentText.getWidth() > 0) {
            contentText.mo133356n();
        } else {
            contentText.f279855w = -1;
        }
        SnsMethodCalculate.markStartTimeMs("updateTranslateLayout", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveContentView");
        if (C94965w1.m120626g(b.mo137507E2(), 2)) {
            C94965w1.C94967b e = C94965w1.m120624e(b.mo137507E2());
            contentText.mo67331b(e, 1, e.f275304b, e.f275305c, e.f275309g);
        } else {
            contentText.mo67332e();
        }
        SnsMethodCalculate.markEndTimeMs("updateTranslateLayout", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveContentView");
        SnsMethodCalculate.markEndTimeMs("setText", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveContentView");
        ImproveContentView contentText2 = getContentText();
        String valueOf = String.valueOf(b.mo137526z2());
        SnsMethodCalculate.markStartTimeMs("onItemDescSpanBindView", "com.tencent.mm.plugin.sns.reportflow.SnsTagSearchSpanClickReportFlow$Companion");
        C87412m.m108594g(contentText2, "view");
        C87412m.m108594g(valueOf, "snsLocalId");
        View findViewById = contentText2.findViewById(C0966R.C0970id.c2h);
        Context context2 = contentText2.getContext();
        C87412m.m108593f(context2, "view.context");
        C45424g Lq02 = ((C77049b) C86312j.m106911c(cls)).Lq0(context2, 1);
        if (Lq02 != null) {
            Lq02.mo70918c("Item_" + valueOf, String.valueOf(findViewById.hashCode()));
        }
        SnsMethodCalculate.markEndTimeMs("onItemDescSpanBindView", "com.tencent.mm.plugin.sns.reportflow.SnsTagSearchSpanClickReportFlow$Companion");
        SnsMethodCalculate.markEndTimeMs("loadContentView", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemMeasure");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0048  */
    /* renamed from: w */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo137052w() {
        /*
            r17 = this;
            java.lang.String r0 = "loadNickName"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemMeasure"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            r2 = r17
            iu2.a r3 = r2.f286709W
            if (r3 == 0) goto L_0x0099
            gu2.b r3 = r3.mo138170b()
            if (r3 != 0) goto L_0x0016
            goto L_0x0099
        L_0x0016:
            java.lang.String r4 = r3.getUserName()
            boolean r4 = com.tencent.p014mm.storage.C72996z1.m85843n5(r4)
            r5 = 1
            r6 = 0
            if (r4 == 0) goto L_0x0040
            java.lang.String r4 = "getOpenIMAppID"
            java.lang.String r7 = "com.tencent.mm.plugin.sns.ui.improve.model.ImproveSnsInfo"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r4, r7)
            rx3.g r8 = r3.f287961R0
            rx3.n r8 = (rx3.C36570n) r8
            java.lang.Object r8 = r8.getValue()
            java.lang.String r8 = (java.lang.String) r8
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r7)
            java.lang.String r4 = "3552365301"
            boolean r4 = gy3.C87412m.m108589b(r4, r8)
            if (r4 == 0) goto L_0x0040
            r4 = 1
            goto L_0x0041
        L_0x0040:
            r4 = 0
        L_0x0041:
            tu2.e r7 = r17.getWeComTagImage()
            if (r4 == 0) goto L_0x0048
            goto L_0x004a
        L_0x0048:
            r6 = 8
        L_0x004a:
            r7.setVisibility(r6)
            com.tencent.mm.plugin.sns.ui.AsyncTextView r4 = r17.getNickNameText()
            com.tencent.mm.storage.z1 r6 = r3.mo137522v2()
            r4.setContactInfo(r6)
            com.tencent.mm.plugin.sns.ui.AsyncTextView r4 = r17.getNickNameText()
            java.lang.String r6 = r3.mo137524x2()
            r4.getClass()
            java.lang.String r7 = "checkDisplayNickChanged"
            java.lang.String r8 = "com.tencent.mm.plugin.sns.ui.AsyncTextView"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r7, r8)
            java.lang.String r9 = r4.f206066h
            boolean r6 = r6.equals(r9)
            r5 = r5 ^ r6
            r4.f206074s = r5
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r7, r8)
            com.tencent.mm.plugin.sns.ui.AsyncTextView r9 = r17.getNickNameText()
            java.lang.String r10 = r3.getUserName()
            java.lang.String r11 = r3.mo137524x2()
            fu2.v r12 = new fu2.v
            r12.<init>()
            r13 = 0
            java.lang.String r14 = r3.mo137503A2()
            int r15 = r17.getViewType()
            r16 = 0
            r9.mo97919b(r10, r11, r12, r13, r14, r15, r16)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return
        L_0x0099:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: eu2.C97736r.mo137052w():void");
    }

    /* renamed from: x */
    public final void mo137053x(String str, String str2) {
        SnsMethodCalculate.markStartTimeMs("logD", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemMeasure");
        C87412m.m108594g(str, "tag");
        C87412m.m108594g(str2, "msg");
        Log.m105918d(str, '[' + C100960u0.f295631a.mo140477b(this.f286709W) + '-' + hashCode() + ']' + str2);
        SnsMethodCalculate.markEndTimeMs("logD", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemMeasure");
    }

    /* renamed from: y */
    public final void mo137054y(String str, String str2) {
        SnsMethodCalculate.markStartTimeMs("logE", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemMeasure");
        C87412m.m108594g(str, "tag");
        C87412m.m108594g(str2, "msg");
        Log.m105920e(str, '[' + C100960u0.f295631a.mo140477b(this.f286709W) + '-' + hashCode() + ']' + str2);
        SnsMethodCalculate.markEndTimeMs("logE", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemMeasure");
    }

    /* renamed from: z */
    public final void mo137055z(String str, String str2) {
        SnsMethodCalculate.markStartTimeMs("logI", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemMeasure");
        C87412m.m108594g(str, "tag");
        C87412m.m108594g(str2, "msg");
        Log.m105924i(str, '[' + C100960u0.f295631a.mo140477b(this.f286709W) + '-' + hashCode() + ']' + str2);
        SnsMethodCalculate.markEndTimeMs("logI", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemMeasure");
    }
}
