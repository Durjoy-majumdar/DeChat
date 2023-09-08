package pu2;

import a14.C0000n0;
import android.content.Context;
import android.text.SpannableString;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.sns.p106ui.C96275w6;
import com.tencent.p014mm.plugin.sns.p106ui.C96277w8;
import com.tencent.p014mm.plugin.sns.p106ui.SnsTimeLineBaseAdapter;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.statistics.SnsReportHelper;
import com.tencent.p014mm.protocal.protobuf.TimeLineObject;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import fy3.C32227p;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import kg3.C76577a;
import kotlin.ResultKt;
import p629ny.C76979h;
import rx3.C13598b0;
import rx3.C13604l;
import wx3.C15601d;
import yx3.C66704d;
import yx3.C91590f;
import yx3.C91594j;

/* renamed from: pu2.g */
public final class C100914g extends C100954s {

    /* renamed from: W0 */
    public static final /* synthetic */ int f295520W0 = 0;

    /* renamed from: T0 */
    public TextView f295521T0;

    /* renamed from: U0 */
    public String f295522U0 = "";

    /* renamed from: V0 */
    public boolean f295523V0;

    @C91590f(mo125468c = "com.tencent.mm.plugin.sns.ui.item.improve.ImproveFoldTimelineItem", mo125469f = "ImproveFoldTimelineItem.kt", mo125470l = {128}, mo125471m = "loadCustomItemInfo")
    /* renamed from: pu2.g$a */
    public static final class C47521a extends C66704d {

        /* renamed from: d */
        public /* synthetic */ Object f127491d;

        /* renamed from: e */
        public final /* synthetic */ C100914g f127492e;

        /* renamed from: f */
        public int f127493f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C47521a(C100914g gVar, C15601d<? super C47521a> dVar) {
            super(dVar);
            this.f127492e = gVar;
        }

        public final Object invokeSuspend(Object obj) {
            SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveFoldTimelineItem$loadCustomItemInfo$1");
            this.f127491d = obj;
            this.f127493f |= Integer.MIN_VALUE;
            Object B = this.f127492e.mo87537B(this);
            SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveFoldTimelineItem$loadCustomItemInfo$1");
            return B;
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.sns.ui.item.improve.ImproveFoldTimelineItem$loadCustomItemInfo$2", mo125469f = "ImproveFoldTimelineItem.kt", mo125470l = {}, mo125471m = "invokeSuspend")
    /* renamed from: pu2.g$b */
    public static final class C47522b extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public final /* synthetic */ C100914g f127494d;

        /* renamed from: e */
        public final /* synthetic */ TextView f127495e;

        /* renamed from: f */
        public final /* synthetic */ SpannableString f127496f;

        /* renamed from: pu2.g$b$b */
        public static final class C47523b implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ TextView f127497d;

            /* renamed from: e */
            public final /* synthetic */ C100914g f127498e;

            /* renamed from: f */
            public final /* synthetic */ SpannableString f127499f;

            public C47523b(TextView textView, C100914g gVar, SpannableString spannableString) {
                this.f127497d = textView;
                this.f127498e = gVar;
                this.f127499f = spannableString;
            }

            public final void run() {
                SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveFoldTimelineItem$loadCustomItemInfo$2$2");
                float textSize = this.f127497d.getTextSize();
                float width = ((float) this.f127497d.getWidth()) - ((float) (C76577a.m92157h(this.f127498e.getContext(), C0966R.dimen.f3736cp) * 2));
                int i = (int) (width / textSize);
                int length = this.f127499f.length();
                C100914g gVar = this.f127498e;
                SnsMethodCalculate.markStartTimeMs("access$getSuffix$p", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveFoldTimelineItem");
                String str = gVar.f295522U0;
                SnsMethodCalculate.markEndTimeMs("access$getSuffix$p", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveFoldTimelineItem");
                int length2 = str.length();
                int i2 = i - length2;
                int min = Math.min(i2, length);
                StringBuilder sb = new StringBuilder();
                sb.append("content = ");
                sb.append(this.f127499f);
                sb.append(", suffix = ");
                C100914g gVar2 = this.f127498e;
                SnsMethodCalculate.markStartTimeMs("access$getSuffix$p", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveFoldTimelineItem");
                String str2 = gVar2.f295522U0;
                SnsMethodCalculate.markEndTimeMs("access$getSuffix$p", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveFoldTimelineItem");
                sb.append(str2);
                Log.m105924i("MicroMsg.ImproveFoldTimelineItem", sb.toString());
                Log.m105924i("MicroMsg.ImproveFoldTimelineItem", "textSize = " + textSize + ", width = " + width + ", textNumber = " + i + ", descLen = " + length + ", suffixLen = " + length2 + ", maxDescLen = " + i2);
                if (min > 0) {
                    StringBuilder sb4 = new StringBuilder();
                    SpannableString spannableString = this.f127499f;
                    C87412m.m108593f(spannableString, "content");
                    sb4.append(spannableString.subSequence(0, min).toString());
                    C100914g gVar3 = this.f127498e;
                    SnsMethodCalculate.markStartTimeMs("access$getSuffix$p", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveFoldTimelineItem");
                    String str3 = gVar3.f295522U0;
                    SnsMethodCalculate.markEndTimeMs("access$getSuffix$p", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveFoldTimelineItem");
                    sb4.append(str3);
                    this.f127497d.setText(String.valueOf(((C76979h) C86312j.m106911c(C76979h.class)).yp0(this.f127498e.getContext(), sb4.toString(), this.f127497d.getTextSize())));
                }
                SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveFoldTimelineItem$loadCustomItemInfo$2$2");
            }
        }

        /* renamed from: pu2.g$b$a */
        public static final class C47524a implements View.OnClickListener {

            /* renamed from: d */
            public final /* synthetic */ C100914g f127500d;

            public C47524a(C100914g gVar) {
                this.f127500d = gVar;
            }

            public final void onClick(View view) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/plugin/sns/ui/item/improve/ImproveFoldTimelineItem$loadCustomItemInfo$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveFoldTimelineItem$loadCustomItemInfo$2$1");
                C100914g gVar = this.f127500d;
                int i = C100914g.f295520W0;
                SnsMethodCalculate.markStartTimeMs("access$jumpToFoldPage", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveFoldTimelineItem");
                gVar.getClass();
                SnsMethodCalculate.markStartTimeMs("jumpToFoldPage", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveFoldTimelineItem");
                gVar.mo140441m("MicroMsg.ImproveFoldTimelineItem", "jumpToFoldPage");
                if (gVar.f295521T0 == null) {
                    SnsMethodCalculate.markEndTimeMs("jumpToFoldPage", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveFoldTimelineItem");
                } else {
                    TimeLineObject timeLine = gVar.getStruct().f281367a.getTimeLine();
                    C87412m.m108593f(timeLine, "struct.mSnsInfo.timeLine");
                    C96277w8 w8Var = new C96277w8();
                    w8Var.f281402a = timeLine.UserName;
                    Long l = gVar.getStruct().f281374d0.f183902d.get(0);
                    C87412m.m108593f(l, "struct.wsGroupStruct.snsIds[0]");
                    w8Var.f281404c = l.longValue();
                    Long l2 = gVar.getStruct().f281374d0.f183902d.get(gVar.getStruct().f281374d0.f183902d.size() - 1);
                    C87412m.m108593f(l2, "struct.wsGroupStruct.sns…upStruct.snsIds.size - 1]");
                    w8Var.f281405d = l2.longValue();
                    w8Var.f281403b = gVar.getStruct().f281372c0.field_groupId;
                    List<Long> list = w8Var.f281406e;
                    LinkedList<Long> linkedList = gVar.getStruct().f281374d0.f183902d;
                    C87412m.m108593f(linkedList, "struct.wsGroupStruct.snsIds");
                    ((ArrayList) list).addAll(linkedList);
                    TextView textView = gVar.f295521T0;
                    if (textView != null) {
                        textView.setTag(w8Var);
                    }
                    SnsReportHelper.f275506m0.mo131369b0(gVar.getStruct().f281383j, true, gVar.getStruct().f281376e0);
                    View.OnClickListener onClickListener = gVar.getAdapter().f278576j.f280590h;
                    if (onClickListener != null) {
                        onClickListener.onClick(gVar.f295521T0);
                    }
                    SnsMethodCalculate.markEndTimeMs("jumpToFoldPage", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveFoldTimelineItem");
                }
                SnsMethodCalculate.markEndTimeMs("access$jumpToFoldPage", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveFoldTimelineItem");
                SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveFoldTimelineItem$loadCustomItemInfo$2$1");
                C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/item/improve/ImproveFoldTimelineItem$loadCustomItemInfo$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C47522b(C100914g gVar, TextView textView, SpannableString spannableString, C15601d<? super C47522b> dVar) {
            super(2, dVar);
            this.f127494d = gVar;
            this.f127495e = textView;
            this.f127496f = spannableString;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveFoldTimelineItem$loadCustomItemInfo$2");
            C47522b bVar = new C47522b(this.f127494d, this.f127495e, this.f127496f, dVar);
            SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveFoldTimelineItem$loadCustomItemInfo$2");
            return bVar;
        }

        public Object invoke(Object obj, Object obj2) {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveFoldTimelineItem$loadCustomItemInfo$2");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveFoldTimelineItem$loadCustomItemInfo$2");
            Object invokeSuspend = ((C47522b) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveFoldTimelineItem$loadCustomItemInfo$2");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveFoldTimelineItem$loadCustomItemInfo$2");
            return invokeSuspend;
        }

        public final Object invokeSuspend(Object obj) {
            SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveFoldTimelineItem$loadCustomItemInfo$2");
            ResultKt.throwOnFailure(obj);
            C100914g gVar = this.f127494d;
            int i = C100914g.f295520W0;
            SnsMethodCalculate.markStartTimeMs("access$getNeedAddSuffix$p", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveFoldTimelineItem");
            boolean z = gVar.f295523V0;
            SnsMethodCalculate.markEndTimeMs("access$getNeedAddSuffix$p", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveFoldTimelineItem");
            if (!z) {
                this.f127495e.setText(String.valueOf(this.f127496f));
            }
            this.f127495e.setOnClickListener(new C47524a(this.f127494d));
            C100914g gVar2 = this.f127494d;
            SnsMethodCalculate.markStartTimeMs("access$getNeedAddSuffix$p", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveFoldTimelineItem");
            boolean z2 = gVar2.f295523V0;
            SnsMethodCalculate.markEndTimeMs("access$getNeedAddSuffix$p", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveFoldTimelineItem");
            if (z2) {
                TextView textView = this.f127495e;
                textView.post(new C47523b(textView, this.f127494d, this.f127496f));
            }
            C13598b0 b0Var = C13598b0.f38549a;
            SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveFoldTimelineItem$loadCustomItemInfo$2");
            return b0Var;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C100914g(Context context, C96275w6 w6Var, SnsTimeLineBaseAdapter snsTimeLineBaseAdapter) {
        super(context, w6Var, snsTimeLineBaseAdapter);
        C87412m.m108594g(context, "context");
        C87412m.m108594g(w6Var, "struct");
        C87412m.m108594g(snsTimeLineBaseAdapter, "adapter");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0029  */
    /* renamed from: B */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object mo87537B(wx3.C15601d<? super java.lang.Boolean> r13) {
        /*
            r12 = this;
            java.lang.String r0 = "loadCustomItemInfo"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ui.item.improve.ImproveFoldTimelineItem"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            boolean r2 = r13 instanceof pu2.C100914g.C47521a
            if (r2 == 0) goto L_0x001b
            r2 = r13
            pu2.g$a r2 = (pu2.C100914g.C47521a) r2
            int r3 = r2.f127493f
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x001b
            int r3 = r3 - r4
            r2.f127493f = r3
            goto L_0x0020
        L_0x001b:
            pu2.g$a r2 = new pu2.g$a
            r2.<init>(r12, r13)
        L_0x0020:
            java.lang.Object r13 = r2.f127491d
            xx3.a r3 = xx3.C15911a.COROUTINE_SUSPENDED
            int r4 = r2.f127493f
            r5 = 1
            if (r4 == 0) goto L_0x003b
            if (r4 != r5) goto L_0x0030
            kotlin.ResultKt.throwOnFailure(r13)
            goto L_0x0195
        L_0x0030:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r2)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            throw r13
        L_0x003b:
            kotlin.ResultKt.throwOnFailure(r13)
            android.widget.TextView r13 = r12.f295521T0
            if (r13 != 0) goto L_0x0048
            java.lang.Boolean r13 = java.lang.Boolean.FALSE
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return r13
        L_0x0048:
            com.tencent.mm.plugin.sns.ui.w6 r4 = r12.getStruct()
            os2.n0 r4 = r4.f281372c0
            if (r4 == 0) goto L_0x019b
            com.tencent.mm.plugin.sns.ui.w6 r4 = r12.getStruct()
            te3.k94 r4 = r4.f281374d0
            if (r4 == 0) goto L_0x019b
            com.tencent.mm.plugin.sns.ui.w6 r4 = r12.getStruct()
            te3.k94 r4 = r4.f281374d0
            java.util.LinkedList<java.lang.Long> r4 = r4.f183902d
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.util.List) r4)
            if (r4 == 0) goto L_0x0068
            goto L_0x019b
        L_0x0068:
            com.tencent.mm.plugin.sns.ui.w6 r4 = r12.getStruct()
            te3.k94 r4 = r4.f281374d0
            java.util.LinkedList<java.lang.Long> r4 = r4.f183902d
            int r4 = r4.size()
            java.lang.String r6 = "getSnsInfoStorage().get(id)"
            java.lang.String r7 = "struct.wsGroupStruct.snsIds.first"
            if (r4 != r5) goto L_0x00d5
            com.tencent.mm.plugin.sns.ui.w6 r4 = r12.getStruct()
            te3.k94 r4 = r4.f281374d0
            java.lang.String r4 = r4.f183903e
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)
            if (r4 == 0) goto L_0x00c5
            com.tencent.mm.plugin.sns.ui.w6 r4 = r12.getStruct()
            te3.k94 r4 = r4.f281374d0
            java.util.LinkedList<java.lang.Long> r4 = r4.f183902d
            java.lang.Object r4 = r4.getFirst()
            gy3.C87412m.m108593f(r4, r7)
            java.lang.Number r4 = (java.lang.Number) r4
            long r7 = r4.longValue()
            os2.e0 r4 = com.tencent.p014mm.plugin.sns.model.C94866e1.Yx0()
            com.tencent.mm.plugin.sns.storage.SnsInfo r4 = r4.mo139806SE(r7)
            gy3.C87412m.m108593f(r4, r6)
            lu2.l r6 = lu2.C10655l.f32071a
            com.tencent.mm.protocal.protobuf.TimeLineObject r4 = r4.getTimeLine()
            te3.j00 r4 = r4.ContentObj
            int r4 = r4.f298424e
            com.tencent.mm.plugin.sns.ui.w6 r7 = r12.getStruct()
            te3.k94 r7 = r7.f281374d0
            java.util.LinkedList<java.lang.Long> r7 = r7.f183902d
            int r7 = r7.size()
            java.lang.String r4 = r6.mo10923a(r4, r7)
            goto L_0x016b
        L_0x00c5:
            com.tencent.mm.plugin.sns.ui.w6 r4 = r12.getStruct()
            te3.k94 r4 = r4.f281374d0
            java.lang.String r4 = r4.f183903e
            java.lang.String r6 = "{\n                struct…uct.descTip\n            }"
            gy3.C87412m.m108593f(r4, r6)
            goto L_0x016b
        L_0x00d5:
            com.tencent.mm.plugin.sns.ui.w6 r4 = r12.getStruct()
            te3.k94 r4 = r4.f281374d0
            java.util.LinkedList<java.lang.Long> r4 = r4.f183902d
            int r4 = r4.size()
            if (r4 <= r5) goto L_0x0169
            com.tencent.mm.plugin.sns.ui.w6 r4 = r12.getStruct()
            te3.k94 r4 = r4.f281374d0
            java.lang.String r4 = r4.f183903e
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)
            if (r4 == 0) goto L_0x012c
            com.tencent.mm.plugin.sns.ui.w6 r4 = r12.getStruct()
            te3.k94 r4 = r4.f281374d0
            java.util.LinkedList<java.lang.Long> r4 = r4.f183902d
            java.lang.Object r4 = r4.getFirst()
            gy3.C87412m.m108593f(r4, r7)
            java.lang.Number r4 = (java.lang.Number) r4
            long r7 = r4.longValue()
            os2.e0 r4 = com.tencent.p014mm.plugin.sns.model.C94866e1.Yx0()
            com.tencent.mm.plugin.sns.storage.SnsInfo r4 = r4.mo139806SE(r7)
            gy3.C87412m.m108593f(r4, r6)
            lu2.l r6 = lu2.C10655l.f32071a
            com.tencent.mm.protocal.protobuf.TimeLineObject r4 = r4.getTimeLine()
            te3.j00 r4 = r4.ContentObj
            int r4 = r4.f298424e
            com.tencent.mm.plugin.sns.ui.w6 r7 = r12.getStruct()
            te3.k94 r7 = r7.f281374d0
            java.util.LinkedList<java.lang.Long> r7 = r7.f183902d
            int r7 = r7.size()
            java.lang.String r4 = r6.mo10923a(r4, r7)
            goto L_0x016b
        L_0x012c:
            com.tencent.mm.plugin.sns.ui.w6 r4 = r12.getStruct()
            te3.k94 r4 = r4.f281374d0
            java.lang.String r4 = r4.f183903e
            java.lang.String r6 = "struct.wsGroupStruct.descTip"
            gy3.C87412m.m108593f(r4, r6)
            android.content.Context r6 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            android.content.res.Resources r6 = r6.getResources()
            r7 = 2131836961(0x7f114021, float:1.9307104E38)
            java.lang.Object[] r8 = new java.lang.Object[r5]
            r9 = 0
            com.tencent.mm.plugin.sns.ui.w6 r10 = r12.getStruct()
            te3.k94 r10 = r10.f281374d0
            java.util.LinkedList<java.lang.Long> r10 = r10.f183902d
            int r10 = r10.size()
            java.lang.Integer r11 = new java.lang.Integer
            r11.<init>(r10)
            r8[r9] = r11
            java.lang.String r6 = r6.getString(r7, r8)
            java.lang.String r7 = "getContext().resources.g…ds.size\n                )"
            gy3.C87412m.m108593f(r6, r7)
            r12.f295522U0 = r6
            r12.f295523V0 = r5
            goto L_0x016b
        L_0x0169:
            java.lang.String r4 = ""
        L_0x016b:
            java.lang.Class<ny.h> r6 = p629ny.C76979h.class
            di3.d r6 = di3.C86312j.m106911c(r6)
            ny.h r6 = (p629ny.C76979h) r6
            android.content.Context r7 = r12.getContext()
            float r8 = r13.getTextSize()
            android.text.SpannableString r4 = r6.yp0(r7, r4, r8)
            a14.h0 r6 = a14.C53872d1.f151117a
            a14.k2 r6 = f14.C58901s.f168555a
            pu2.g$b r7 = new pu2.g$b
            r8 = 0
            r7.<init>(r12, r13, r4, r8)
            r2.f127493f = r5
            java.lang.Object r13 = a14.C53895h.m60469g(r6, r7, r2)
            if (r13 != r3) goto L_0x0195
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return r3
        L_0x0195:
            java.lang.Boolean r13 = java.lang.Boolean.TRUE
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return r13
        L_0x019b:
            java.lang.String r13 = "MicroMsg.ImproveFoldTimelineItem"
            java.lang.String r2 = "loadCustomItemInfo error,for struct not valid"
            r12.mo140440l(r13, r2)
            java.lang.Boolean r13 = java.lang.Boolean.FALSE
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: pu2.C100914g.mo87537B(wx3.d):java.lang.Object");
    }

    /* renamed from: f */
    public C13604l<View, ConstraintLayout.LayoutParams> mo87542f() {
        SnsMethodCalculate.markStartTimeMs("buildCustomView", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveFoldTimelineItem");
        TextView textView = new TextView(getContext());
        int h = C76577a.m92157h(getContext(), C0966R.dimen.f3736cp);
        int i = mo140438i(18);
        textView.setPadding(h, i, h, i);
        textView.setTextColor(C76577a.m92153d(getContext(), C0966R.color.BW_0_Alpha_0_9));
        textView.setTextSize(0, (float) C76577a.m92164o(getContext(), C0966R.dimen.f3957lf));
        textView.setBackground(C76577a.m92158i(getContext(), C0966R.C0969drawable.atk));
        textView.setMaxLines(1);
        ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(-1, -1);
        this.f295521T0 = textView;
        C13604l<View, ConstraintLayout.LayoutParams> lVar = new C13604l<>(textView, layoutParams);
        SnsMethodCalculate.markEndTimeMs("buildCustomView", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveFoldTimelineItem");
        return lVar;
    }

    public int getViewType() {
        SnsMethodCalculate.markStartTimeMs("getViewType", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveFoldTimelineItem");
        SnsMethodCalculate.markEndTimeMs("getViewType", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveFoldTimelineItem");
        return 22;
    }

    /* renamed from: n */
    public String mo87544n() {
        SnsMethodCalculate.markStartTimeMs("name", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveFoldTimelineItem");
        SnsMethodCalculate.markEndTimeMs("name", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveFoldTimelineItem");
        return "ImproveFoldTimelineItem";
    }

    /* renamed from: s */
    public void mo140379s() {
        SnsMethodCalculate.markStartTimeMs("layoutCommentView", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveFoldTimelineItem");
        SnsMethodCalculate.markEndTimeMs("layoutCommentView", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveFoldTimelineItem");
    }

    /* renamed from: v */
    public void mo140380v() {
        SnsMethodCalculate.markStartTimeMs("loadContentView", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveFoldTimelineItem");
        getContentText().mo132054i("", getAdapter(), getStruct().f281385l, getStruct());
        getContentText().mo132052e();
        ImageView commentImage = getCommentImage();
        if (commentImage != null) {
            commentImage.setVisibility(8);
        }
        SnsMethodCalculate.markEndTimeMs("loadContentView", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveFoldTimelineItem");
    }
}
