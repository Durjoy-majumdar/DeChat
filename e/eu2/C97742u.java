package eu2;

import a14.C0000n0;
import a14.C53872d1;
import a14.C53895h;
import a14.C53896h0;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.memory.p1073ui.QPictureView;
import com.tencent.p014mm.p136ui.C85868k2;
import com.tencent.p014mm.plugin.sns.model.C94866e1;
import com.tencent.p014mm.plugin.sns.model.C94901o;
import com.tencent.p014mm.plugin.sns.p106ui.SnsTimeLineBaseAdapter;
import com.tencent.p014mm.plugin.sns.p106ui.TagImageView;
import com.tencent.p014mm.plugin.sns.p106ui.improve.item.ImproveTimelineItemNotify;
import com.tencent.p014mm.plugin.sns.p106ui.item.improve.handle.ImproveOtherItemLoadHandle;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import com.tencent.p014mm.protocal.protobuf.TimeLineObject;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C96983o3;
import di3.C86312j;
import f14.C58901s;
import fu2.C97987a;
import fu2.C98036x;
import fu2.C98041z;
import fy3.C32227p;
import gu2.C98214b;
import gy3.C87412m;
import iu2.C98799a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import jq3.C60905o;
import kg3.C76577a;
import kotlin.ResultKt;
import p629ny.C76979h;
import rx3.C13598b0;
import rx3.C13604l;
import te3.C101804kv2;
import te3.C101842st2;
import te3.d05;
import te3.w25;
import vr2.C102236a0;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;
import z31.C102972b;

/* renamed from: eu2.u */
public final class C97742u extends ImproveTimelineItemNotify {

    /* renamed from: c1 */
    public static final /* synthetic */ int f286727c1 = 0;

    /* renamed from: W0 */
    public ViewGroup f286728W0;

    /* renamed from: X0 */
    public TagImageView f286729X0;

    /* renamed from: Y0 */
    public ImageView f286730Y0;

    /* renamed from: Z0 */
    public TextView f286731Z0;

    /* renamed from: a1 */
    public TextView f286732a1;

    /* renamed from: b1 */
    public String f286733b1 = "";

    @C91590f(mo125468c = "com.tencent.mm.plugin.sns.ui.improve.item.OtherImproveTimelineItem$loadCustomItemInfo$2", mo125469f = "OtherImproveTimelineItem.kt", mo125470l = {}, mo125471m = "invokeSuspend")
    /* renamed from: eu2.u$a */
    public static final class C97743a extends C91594j implements C32227p<C0000n0, C15601d<? super Boolean>, Object> {

        /* renamed from: d */
        public final /* synthetic */ C97742u f286734d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C97743a(C97742u uVar, C15601d<? super C97743a> dVar) {
            super(2, dVar);
            this.f286734d = uVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.ui.improve.item.OtherImproveTimelineItem$loadCustomItemInfo$2");
            C97743a aVar = new C97743a(this.f286734d, dVar);
            SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.ui.improve.item.OtherImproveTimelineItem$loadCustomItemInfo$2");
            return aVar;
        }

        public Object invoke(Object obj, Object obj2) {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.OtherImproveTimelineItem$loadCustomItemInfo$2");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.OtherImproveTimelineItem$loadCustomItemInfo$2");
            Object invokeSuspend = ((C97743a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.OtherImproveTimelineItem$loadCustomItemInfo$2");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.OtherImproveTimelineItem$loadCustomItemInfo$2");
            return invokeSuspend;
        }

        public final Object invokeSuspend(Object obj) {
            C98214b b;
            w25 w25;
            C101842st2 st22;
            SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.item.OtherImproveTimelineItem$loadCustomItemInfo$2");
            ResultKt.throwOnFailure(obj);
            C98799a data = this.f286734d.getData();
            if (data == null || (b = data.mo138170b()) == null) {
                Boolean bool = Boolean.FALSE;
                SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.item.OtherImproveTimelineItem$loadCustomItemInfo$2");
                return bool;
            }
            C97742u uVar = this.f286734d;
            int i = C97742u.f286727c1;
            SnsMethodCalculate.markStartTimeMs("access$getOtherItemLayout$p", "com.tencent.mm.plugin.sns.ui.improve.item.OtherImproveTimelineItem");
            ViewGroup viewGroup = uVar.f286728W0;
            SnsMethodCalculate.markEndTimeMs("access$getOtherItemLayout$p", "com.tencent.mm.plugin.sns.ui.improve.item.OtherImproveTimelineItem");
            if (viewGroup == null) {
                Boolean bool2 = Boolean.FALSE;
                SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.item.OtherImproveTimelineItem$loadCustomItemInfo$2");
                return bool2;
            }
            C97742u uVar2 = this.f286734d;
            SnsMethodCalculate.markStartTimeMs("access$getStateIv$p", "com.tencent.mm.plugin.sns.ui.improve.item.OtherImproveTimelineItem");
            ImageView imageView = uVar2.f286730Y0;
            SnsMethodCalculate.markEndTimeMs("access$getStateIv$p", "com.tencent.mm.plugin.sns.ui.improve.item.OtherImproveTimelineItem");
            if (imageView != null) {
                imageView.setVisibility(8);
            }
            TimeLineObject G2 = b.mo137509G2();
            C97742u uVar3 = this.f286734d;
            SnsMethodCalculate.markStartTimeMs("access$firstLoadHandle", "com.tencent.mm.plugin.sns.ui.improve.item.OtherImproveTimelineItem");
            uVar3.getClass();
            SnsMethodCalculate.markStartTimeMs("firstLoadHandle", "com.tencent.mm.plugin.sns.ui.improve.item.OtherImproveTimelineItem");
            LinkedList<C101804kv2> linkedList = G2.ContentObj.f298427h;
            C87412m.m108593f(linkedList, "tlObj.ContentObj.MediaObjList");
            if (!linkedList.isEmpty()) {
                uVar3.mo137055z("MicroMsg.Improve.OtherTimelineItem", "load left image,media list size:" + G2.ContentObj.f298427h.size());
                C101804kv2 kv22 = G2.ContentObj.f298427h.get(0);
                C87412m.m108593f(kv22, "tlObj.ContentObj.MediaObjList.get(0)");
                C101804kv2 kv23 = kv22;
                d05 d05 = G2.weappInfo;
                if (!(d05 == null || d05.f298071e == null || d05.f298077n != 1) || (((w25 = G2.webSearchInfo) != null && !Util.isNullOrNil(w25.f259899d)) || ((st22 = G2.ContentObj.f298430n) != null && st22.f299443d == 16))) {
                    ImageView imageView2 = uVar3.f286730Y0;
                    if (imageView2 != null) {
                        imageView2.setImageResource(C0966R.raw.shortvideo_play_btn);
                    }
                    ImageView imageView3 = uVar3.f286730Y0;
                    if (imageView3 != null) {
                        imageView3.setVisibility(0);
                    }
                }
                C94901o Fx0 = C94866e1.Fx0();
                TagImageView tagImageView = uVar3.f286729X0;
                int hashCode = uVar3.getContext().hashCode();
                C96983o3 c = C96983o3.m124651c();
                c.f284145b = G2.CreateTime;
                Fx0.mo131106Z(kv23, tagImageView, hashCode, c, b.mo137504B2());
            } else {
                uVar3.mo137055z("MicroMsg.Improve.OtherTimelineItem", "default cover load");
                C94866e1.Fx0().mo131095O(uVar3.f286729X0, -1, C0966R.raw.app_attach_file_icon_webpage, uVar3.getContext().hashCode());
            }
            SnsMethodCalculate.markEndTimeMs("firstLoadHandle", "com.tencent.mm.plugin.sns.ui.improve.item.OtherImproveTimelineItem");
            SnsMethodCalculate.markEndTimeMs("access$firstLoadHandle", "com.tencent.mm.plugin.sns.ui.improve.item.OtherImproveTimelineItem");
            C13604l<String, String> handle = ImproveOtherItemLoadHandle.INSTANCE.handle(b.mo137505C2(), viewGroup);
            C97742u uVar4 = this.f286734d;
            uVar4.mo137055z("MicroMsg.Improve.OtherTimelineItem", "loadCustomItemInfo contentStyle:" + G2.ContentObj.f298424e + " title:" + ((String) handle.f38555d) + " desc:" + ((String) handle.f38556e));
            C97742u uVar5 = this.f286734d;
            SnsInfo C2 = b.mo137505C2();
            String str = (String) handle.f38555d;
            String str2 = (String) handle.f38556e;
            SnsMethodCalculate.markStartTimeMs("access$fillTextContent", "com.tencent.mm.plugin.sns.ui.improve.item.OtherImproveTimelineItem");
            uVar5.getClass();
            SnsMethodCalculate.markStartTimeMs("fillTextContent", "com.tencent.mm.plugin.sns.ui.improve.item.OtherImproveTimelineItem");
            if (!Util.isNullOrNil(str2)) {
                TextView textView = uVar5.f286731Z0;
                if (textView != null) {
                    textView.setVisibility(0);
                }
                TextView textView2 = uVar5.f286731Z0;
                if (textView2 != null) {
                    textView2.setText(str2);
                }
            } else {
                TextView textView3 = uVar5.f286731Z0;
                if (textView3 != null) {
                    textView3.setVisibility(8);
                }
            }
            int p = SnsTimeLineBaseAdapter.m122254p(C2);
            CharSequence charSequence = null;
            if (!Util.isNullOrNil(str)) {
                TextView textView4 = uVar5.f286732a1;
                if (textView4 != null) {
                    TextView textView5 = uVar5.f286731Z0;
                    textView4.setMaxLines(textView5 != null && textView5.getVisibility() == 8 ? 2 : 1);
                }
                TextView textView6 = uVar5.f286732a1;
                if (textView6 != null) {
                    textView6.setVisibility(0);
                }
                if ((G2.contentattr & 1) > 0) {
                    TextView textView7 = uVar5.f286732a1;
                    if (textView7 != null) {
                        textView7.setText(C102236a0.m134766r(str, uVar5.getContext(), uVar5.f286732a1));
                    }
                } else {
                    TextView textView8 = uVar5.f286732a1;
                    if (textView8 != null) {
                        textView8.setText(((C76979h) C86312j.m106911c(C76979h.class)).mo107057T1(uVar5.getContext(), str));
                    }
                }
                TextView textView9 = uVar5.f286732a1;
                if (textView9 != null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(C76577a.m92166q(uVar5.getContext(), C0966R.string.jea));
                    sb.append(',');
                    TextView textView10 = uVar5.f286732a1;
                    if (textView10 != null) {
                        charSequence = textView10.getText();
                    }
                    sb.append(charSequence);
                    textView9.setContentDescription(sb.toString());
                }
            } else if (p == 1) {
                TextView textView11 = uVar5.f286732a1;
                if (textView11 != null) {
                    textView11.setText(SnsTimeLineBaseAdapter.m122253o(G2.ContentObj.f298426g));
                }
                TextView textView12 = uVar5.f286732a1;
                if (textView12 != null) {
                    textView12.setVisibility(0);
                }
                TextView textView13 = uVar5.f286732a1;
                if (textView13 != null) {
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append(C76577a.m92166q(uVar5.getContext(), C0966R.string.jea));
                    sb4.append(',');
                    TextView textView14 = uVar5.f286732a1;
                    if (textView14 != null) {
                        charSequence = textView14.getText();
                    }
                    sb4.append(charSequence);
                    textView13.setContentDescription(sb4.toString());
                }
            } else {
                TextView textView15 = uVar5.f286732a1;
                if (textView15 != null) {
                    textView15.setVisibility(8);
                }
            }
            SnsMethodCalculate.markEndTimeMs("fillTextContent", "com.tencent.mm.plugin.sns.ui.improve.item.OtherImproveTimelineItem");
            SnsMethodCalculate.markEndTimeMs("access$fillTextContent", "com.tencent.mm.plugin.sns.ui.improve.item.OtherImproveTimelineItem");
            Boolean bool3 = Boolean.TRUE;
            SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.item.OtherImproveTimelineItem$loadCustomItemInfo$2");
            return bool3;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C97742u(Context context) {
        super(context);
        C87412m.m108594g(context, "context");
    }

    /* renamed from: F */
    public Object mo81005F(C15601d<? super Boolean> dVar) {
        SnsMethodCalculate.markStartTimeMs("loadCustomItemInfo", "com.tencent.mm.plugin.sns.ui.improve.item.OtherImproveTimelineItem");
        C53896h0 h0Var = C53872d1.f151117a;
        Object g = C53895h.m60469g(C58901s.f168555a, new C97743a(this, (C15601d<? super C97743a>) null), dVar);
        SnsMethodCalculate.markEndTimeMs("loadCustomItemInfo", "com.tencent.mm.plugin.sns.ui.improve.item.OtherImproveTimelineItem");
        return g;
    }

    /* renamed from: g */
    public Object mo81006g(C60905o oVar, C98799a aVar, int i, boolean z, C15601d<? super C13598b0> dVar) {
        C97987a aVar2;
        SnsMethodCalculate.markStartTimeMs("onBindViewHolder", "com.tencent.mm.plugin.sns.ui.improve.item.OtherImproveTimelineItem");
        Iterator it = C98041z.m126632K(this).iterator();
        while (true) {
            if (!it.hasNext()) {
                aVar2 = null;
                break;
            }
            aVar2 = (C97987a) it.next();
            if (aVar2 instanceof C98036x) {
                break;
            }
        }
        if (aVar2 == null) {
            ArrayList<C97987a> clickInstanceList = getClickInstanceList();
            Context context = getContext();
            C87412m.m108593f(context, "context");
            C98036x xVar = new C98036x(context);
            C97987a.m126564l(xVar, this.f286728W0, false, true, false, 10, (Object) null);
            clickInstanceList.add(xVar);
        }
        this.f286733b1 = aVar.mo138170b().mo137504B2();
        Object g = super.mo81006g(oVar, aVar, i, z, dVar);
        if (g == C15911a.COROUTINE_SUSPENDED) {
            SnsMethodCalculate.markEndTimeMs("onBindViewHolder", "com.tencent.mm.plugin.sns.ui.improve.item.OtherImproveTimelineItem");
            C102972b.f303874a.mo142713g(12076, "BrowseOtherFeedCount", this.f286733b1);
            return g;
        }
        C13598b0 b0Var = C13598b0.f38549a;
        SnsMethodCalculate.markEndTimeMs("onBindViewHolder", "com.tencent.mm.plugin.sns.ui.improve.item.OtherImproveTimelineItem");
        return b0Var;
    }

    public QPictureView getTagImgView() {
        SnsMethodCalculate.markStartTimeMs("getTagImgView", "com.tencent.mm.plugin.sns.ui.improve.item.OtherImproveTimelineItem");
        TagImageView tagImageView = this.f286729X0;
        SnsMethodCalculate.markEndTimeMs("getTagImgView", "com.tencent.mm.plugin.sns.ui.improve.item.OtherImproveTimelineItem");
        return tagImageView;
    }

    public int getViewType() {
        SnsMethodCalculate.markStartTimeMs("getViewType", "com.tencent.mm.plugin.sns.ui.improve.item.OtherImproveTimelineItem");
        SnsMethodCalculate.markEndTimeMs("getViewType", "com.tencent.mm.plugin.sns.ui.improve.item.OtherImproveTimelineItem");
        return 1;
    }

    /* renamed from: k */
    public C13604l<View, ConstraintLayout.LayoutParams> mo81009k() {
        SnsMethodCalculate.markStartTimeMs("buildCustomView", "com.tencent.mm.plugin.sns.ui.improve.item.OtherImproveTimelineItem");
        View inflate = C85868k2.m106137b(getContext()).inflate(C0966R.C0971layout.f360009d33, this, false);
        C87412m.m108592e(inflate, "null cannot be cast to non-null type android.view.ViewGroup");
        ViewGroup viewGroup = (ViewGroup) inflate;
        this.f286728W0 = viewGroup;
        this.f286729X0 = (TagImageView) viewGroup.findViewById(C0966R.C0970id.f4p);
        this.f286730Y0 = (ImageView) viewGroup.findViewById(C0966R.C0970id.k0s);
        this.f286731Z0 = (TextView) viewGroup.findViewById(C0966R.C0970id.iub);
        this.f286732a1 = (TextView) viewGroup.findViewById(C0966R.C0970id.kpq);
        ViewGroup viewGroup2 = this.f286728W0;
        if (viewGroup2 != null) {
            viewGroup2.setTag(C0966R.C0970id.f4p, this.f286729X0);
        }
        ViewGroup viewGroup3 = this.f286728W0;
        if (viewGroup3 != null) {
            viewGroup3.setTag(C0966R.C0970id.k0s, this.f286730Y0);
        }
        ViewGroup viewGroup4 = this.f286728W0;
        if (viewGroup4 != null) {
            viewGroup4.setTag(C0966R.C0970id.iub, this.f286731Z0);
        }
        ViewGroup viewGroup5 = this.f286728W0;
        if (viewGroup5 != null) {
            viewGroup5.setTag(C0966R.C0970id.kpq, this.f286732a1);
        }
        TextView textView = this.f286732a1;
        if (textView != null) {
            textView.setTextColor(C76577a.m92153d(getContext(), C0966R.color.a7f));
        }
        C102236a0.m134779x0(this.f286729X0, getContext());
        ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(0, -2);
        layoutParams.f44464s = 0;
        ViewGroup viewGroup6 = this.f286728W0;
        C87412m.m108591d(viewGroup6);
        C13604l<View, ConstraintLayout.LayoutParams> lVar = new C13604l<>(viewGroup6, layoutParams);
        SnsMethodCalculate.markEndTimeMs("buildCustomView", "com.tencent.mm.plugin.sns.ui.improve.item.OtherImproveTimelineItem");
        return lVar;
    }

    public String name() {
        SnsMethodCalculate.markStartTimeMs("name", "com.tencent.mm.plugin.sns.ui.improve.item.OtherImproveTimelineItem");
        SnsMethodCalculate.markEndTimeMs("name", "com.tencent.mm.plugin.sns.ui.improve.item.OtherImproveTimelineItem");
        return "OtherImproveTimelineItem";
    }
}
