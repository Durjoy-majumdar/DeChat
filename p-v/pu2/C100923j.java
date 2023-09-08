package pu2;

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
import com.tencent.p014mm.plugin.sns.p106ui.C96275w6;
import com.tencent.p014mm.plugin.sns.p106ui.SnsTimeLineBaseAdapter;
import com.tencent.p014mm.plugin.sns.p106ui.TagImageView;
import com.tencent.p014mm.plugin.sns.p106ui.item.improve.handle.ImproveOtherItemLoadHandle;
import com.tencent.p014mm.plugin.sns.p106ui.listener.TimelineClickListener;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import com.tencent.p014mm.protocal.protobuf.TimeLineObject;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C96983o3;
import di3.C86312j;
import f14.C58901s;
import fy3.C32227p;
import gy3.C87412m;
import java.util.LinkedList;
import kg3.C76577a;
import kotlin.ResultKt;
import p629ny.C76979h;
import rx3.C13598b0;
import rx3.C13604l;
import te3.C101804kv2;
import te3.C101842st2;
import te3.d05;
import te3.w25;
import uo3.C78253a;
import vr2.C102236a0;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;

/* renamed from: pu2.j */
public final class C100923j extends C100954s {

    /* renamed from: Y0 */
    public static final /* synthetic */ int f295542Y0 = 0;

    /* renamed from: T0 */
    public ViewGroup f295543T0;

    /* renamed from: U0 */
    public TagImageView f295544U0;

    /* renamed from: V0 */
    public ImageView f295545V0;

    /* renamed from: W0 */
    public TextView f295546W0;

    /* renamed from: X0 */
    public TextView f295547X0;

    @C91590f(mo125468c = "com.tencent.mm.plugin.sns.ui.item.improve.ImproveOtherTimelineItem$loadCustomItemInfo$2", mo125469f = "ImproveOtherTimelineItem.kt", mo125470l = {}, mo125471m = "invokeSuspend")
    /* renamed from: pu2.j$a */
    public static final class C100924a extends C91594j implements C32227p<C0000n0, C15601d<? super Boolean>, Object> {

        /* renamed from: d */
        public final /* synthetic */ C100923j f295548d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C100924a(C100923j jVar, C15601d<? super C100924a> dVar) {
            super(2, dVar);
            this.f295548d = jVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveOtherTimelineItem$loadCustomItemInfo$2");
            C100924a aVar = new C100924a(this.f295548d, dVar);
            SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveOtherTimelineItem$loadCustomItemInfo$2");
            return aVar;
        }

        public Object invoke(Object obj, Object obj2) {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveOtherTimelineItem$loadCustomItemInfo$2");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveOtherTimelineItem$loadCustomItemInfo$2");
            Object invokeSuspend = ((C100924a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveOtherTimelineItem$loadCustomItemInfo$2");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveOtherTimelineItem$loadCustomItemInfo$2");
            return invokeSuspend;
        }

        public final Object invokeSuspend(Object obj) {
            w25 w25;
            C101842st2 st22;
            SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveOtherTimelineItem$loadCustomItemInfo$2");
            ResultKt.throwOnFailure(obj);
            C100923j jVar = this.f295548d;
            int i = C100923j.f295542Y0;
            SnsMethodCalculate.markStartTimeMs("access$getOtherItemLayout$p", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveOtherTimelineItem");
            ViewGroup viewGroup = jVar.f295543T0;
            SnsMethodCalculate.markEndTimeMs("access$getOtherItemLayout$p", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveOtherTimelineItem");
            if (viewGroup == null) {
                Boolean bool = Boolean.FALSE;
                SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveOtherTimelineItem$loadCustomItemInfo$2");
                return bool;
            }
            C100923j jVar2 = this.f295548d;
            SnsMethodCalculate.markStartTimeMs("access$getStateIv$p", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveOtherTimelineItem");
            ImageView imageView = jVar2.f295545V0;
            SnsMethodCalculate.markEndTimeMs("access$getStateIv$p", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveOtherTimelineItem");
            if (imageView != null) {
                imageView.setVisibility(8);
            }
            SnsInfo snsInfo = this.f295548d.getStruct().f281367a;
            TimeLineObject timeLine = snsInfo.getTimeLine();
            C87412m.m108593f(timeLine, "snsInfo.timeLine");
            C100923j jVar3 = this.f295548d;
            SnsMethodCalculate.markStartTimeMs("access$firstLoadHandle", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveOtherTimelineItem");
            jVar3.getClass();
            SnsMethodCalculate.markStartTimeMs("firstLoadHandle", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveOtherTimelineItem");
            LinkedList<C101804kv2> linkedList = timeLine.ContentObj.f298427h;
            C87412m.m108593f(linkedList, "tlObj.ContentObj.MediaObjList");
            if (!linkedList.isEmpty()) {
                jVar3.mo140441m("MicroMsg.Improve.ImproveOtherTimelineItem", "load left image,media list size:" + timeLine.ContentObj.f298427h.size());
                C101804kv2 kv22 = timeLine.ContentObj.f298427h.get(0);
                C87412m.m108593f(kv22, "tlObj.ContentObj.MediaObjList.get(0)");
                C101804kv2 kv23 = kv22;
                d05 d05 = timeLine.weappInfo;
                if (!(d05 == null || d05.f298071e == null || d05.f298077n != 1) || (((w25 = timeLine.webSearchInfo) != null && !Util.isNullOrNil(w25.f259899d)) || ((st22 = timeLine.ContentObj.f298430n) != null && st22.f299443d == 16))) {
                    ImageView imageView2 = jVar3.f295545V0;
                    if (imageView2 != null) {
                        imageView2.setImageResource(C0966R.raw.shortvideo_play_btn);
                    }
                    ImageView imageView3 = jVar3.f295545V0;
                    if (imageView3 != null) {
                        imageView3.setVisibility(0);
                    }
                }
                C94901o Fx0 = C94866e1.Fx0();
                TagImageView tagImageView = jVar3.f295544U0;
                int hashCode = jVar3.getContext().hashCode();
                C96983o3 c = C96983o3.m124651c();
                c.f284145b = timeLine.CreateTime;
                Fx0.mo131106Z(kv23, tagImageView, hashCode, c, snsInfo.getSnsId());
            } else {
                jVar3.mo140441m("MicroMsg.Improve.ImproveOtherTimelineItem", "default cover load");
                C94866e1.Fx0().mo131095O(jVar3.f295544U0, -1, C0966R.raw.app_attach_file_icon_webpage, jVar3.getContext().hashCode());
            }
            SnsMethodCalculate.markEndTimeMs("firstLoadHandle", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveOtherTimelineItem");
            SnsMethodCalculate.markEndTimeMs("access$firstLoadHandle", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveOtherTimelineItem");
            C13604l<String, String> handle = ImproveOtherItemLoadHandle.INSTANCE.handle(snsInfo, viewGroup);
            C100923j jVar4 = this.f295548d;
            jVar4.mo140441m("MicroMsg.Improve.ImproveOtherTimelineItem", "loadCustomItemInfo contentStyle:" + timeLine.ContentObj.f298424e + " title:" + ((String) handle.f38555d) + " desc:" + ((String) handle.f38556e));
            C100923j jVar5 = this.f295548d;
            SnsMethodCalculate.markStartTimeMs("access$registerPopupMenu", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveOtherTimelineItem");
            jVar5.getClass();
            SnsMethodCalculate.markStartTimeMs("registerPopupMenu", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveOtherTimelineItem");
            SnsTimeLineBaseAdapter adapter = jVar5.getAdapter();
            if (adapter == null) {
                SnsMethodCalculate.markEndTimeMs("registerPopupMenu", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveOtherTimelineItem");
            } else {
                C78253a k = adapter.mo132921k();
                ViewGroup viewGroup2 = jVar5.f295543T0;
                TimelineClickListener timelineClickListener = adapter.f278572f;
                k.mo108275j(viewGroup2, timelineClickListener.f280396z, timelineClickListener.f280381k);
                SnsMethodCalculate.markEndTimeMs("registerPopupMenu", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveOtherTimelineItem");
            }
            SnsMethodCalculate.markEndTimeMs("access$registerPopupMenu", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveOtherTimelineItem");
            C100923j jVar6 = this.f295548d;
            String str = (String) handle.f38555d;
            String str2 = (String) handle.f38556e;
            SnsMethodCalculate.markStartTimeMs("access$fillTextContent", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveOtherTimelineItem");
            jVar6.getClass();
            SnsMethodCalculate.markStartTimeMs("fillTextContent", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveOtherTimelineItem");
            if (!Util.isNullOrNil(str2)) {
                TextView textView = jVar6.f295546W0;
                if (textView != null) {
                    textView.setVisibility(0);
                }
                TextView textView2 = jVar6.f295546W0;
                if (textView2 != null) {
                    textView2.setText(str2);
                }
            } else {
                TextView textView3 = jVar6.f295546W0;
                if (textView3 != null) {
                    textView3.setVisibility(8);
                }
            }
            int p = SnsTimeLineBaseAdapter.m122254p(snsInfo);
            CharSequence charSequence = null;
            if (!Util.isNullOrNil(str)) {
                TextView textView4 = jVar6.f295547X0;
                if (textView4 != null) {
                    TextView textView5 = jVar6.f295546W0;
                    textView4.setMaxLines(textView5 != null && textView5.getVisibility() == 8 ? 2 : 1);
                }
                TextView textView6 = jVar6.f295547X0;
                if (textView6 != null) {
                    textView6.setVisibility(0);
                }
                if ((timeLine.contentattr & 1) > 0) {
                    TextView textView7 = jVar6.f295547X0;
                    if (textView7 != null) {
                        textView7.setText(C102236a0.m134766r(str, jVar6.getContext(), jVar6.f295547X0));
                    }
                } else {
                    TextView textView8 = jVar6.f295547X0;
                    if (textView8 != null) {
                        textView8.setText(((C76979h) C86312j.m106911c(C76979h.class)).mo107057T1(jVar6.getContext(), str));
                    }
                }
                TextView textView9 = jVar6.f295547X0;
                if (textView9 != null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(C76577a.m92166q(jVar6.getContext(), C0966R.string.jea));
                    sb.append(',');
                    TextView textView10 = jVar6.f295547X0;
                    if (textView10 != null) {
                        charSequence = textView10.getText();
                    }
                    sb.append(charSequence);
                    textView9.setContentDescription(sb.toString());
                }
            } else if (p == 1) {
                TextView textView11 = jVar6.f295547X0;
                if (textView11 != null) {
                    textView11.setText(SnsTimeLineBaseAdapter.m122253o(timeLine.ContentObj.f298426g));
                }
                TextView textView12 = jVar6.f295547X0;
                if (textView12 != null) {
                    textView12.setVisibility(0);
                }
                TextView textView13 = jVar6.f295547X0;
                if (textView13 != null) {
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append(C76577a.m92166q(jVar6.getContext(), C0966R.string.jea));
                    sb4.append(',');
                    TextView textView14 = jVar6.f295547X0;
                    if (textView14 != null) {
                        charSequence = textView14.getText();
                    }
                    sb4.append(charSequence);
                    textView13.setContentDescription(sb4.toString());
                }
            } else {
                TextView textView15 = jVar6.f295547X0;
                if (textView15 != null) {
                    textView15.setVisibility(8);
                }
            }
            SnsMethodCalculate.markEndTimeMs("fillTextContent", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveOtherTimelineItem");
            SnsMethodCalculate.markEndTimeMs("access$fillTextContent", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveOtherTimelineItem");
            Boolean bool2 = Boolean.TRUE;
            SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveOtherTimelineItem$loadCustomItemInfo$2");
            return bool2;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C100923j(Context context, C96275w6 w6Var, SnsTimeLineBaseAdapter snsTimeLineBaseAdapter) {
        super(context, w6Var, snsTimeLineBaseAdapter);
        C87412m.m108594g(context, "context");
        C87412m.m108594g(w6Var, "struct");
        C87412m.m108594g(snsTimeLineBaseAdapter, "adapter");
    }

    /* renamed from: B */
    public Object mo87537B(C15601d<? super Boolean> dVar) {
        SnsMethodCalculate.markStartTimeMs("loadCustomItemInfo", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveOtherTimelineItem");
        C53896h0 h0Var = C53872d1.f151117a;
        Object g = C53895h.m60469g(C58901s.f168555a, new C100924a(this, (C15601d<? super C100924a>) null), dVar);
        SnsMethodCalculate.markEndTimeMs("loadCustomItemInfo", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveOtherTimelineItem");
        return g;
    }

    /* renamed from: f */
    public C13604l<View, ConstraintLayout.LayoutParams> mo87542f() {
        SnsMethodCalculate.markStartTimeMs("buildCustomView", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveOtherTimelineItem");
        View inflate = C85868k2.m106137b(getContext()).inflate(C0966R.C0971layout.f360009d33, this, false);
        C87412m.m108592e(inflate, "null cannot be cast to non-null type android.view.ViewGroup");
        ViewGroup viewGroup = (ViewGroup) inflate;
        this.f295543T0 = viewGroup;
        this.f295544U0 = (TagImageView) viewGroup.findViewById(C0966R.C0970id.f4p);
        this.f295545V0 = (ImageView) viewGroup.findViewById(C0966R.C0970id.k0s);
        this.f295546W0 = (TextView) viewGroup.findViewById(C0966R.C0970id.iub);
        this.f295547X0 = (TextView) viewGroup.findViewById(C0966R.C0970id.kpq);
        ViewGroup viewGroup2 = this.f295543T0;
        if (viewGroup2 != null) {
            viewGroup2.setTag(C0966R.C0970id.f4p, this.f295544U0);
        }
        ViewGroup viewGroup3 = this.f295543T0;
        if (viewGroup3 != null) {
            viewGroup3.setTag(C0966R.C0970id.k0s, this.f295545V0);
        }
        ViewGroup viewGroup4 = this.f295543T0;
        if (viewGroup4 != null) {
            viewGroup4.setTag(C0966R.C0970id.iub, this.f295546W0);
        }
        ViewGroup viewGroup5 = this.f295543T0;
        if (viewGroup5 != null) {
            viewGroup5.setTag(C0966R.C0970id.kpq, this.f295547X0);
        }
        TextView textView = this.f295547X0;
        if (textView != null) {
            textView.setTextColor(C76577a.m92153d(getContext(), C0966R.color.a7f));
        }
        C102236a0.m134779x0(this.f295544U0, getContext());
        ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(0, -2);
        layoutParams.f44464s = 0;
        ViewGroup viewGroup6 = this.f295543T0;
        C87412m.m108591d(viewGroup6);
        C13604l<View, ConstraintLayout.LayoutParams> lVar = new C13604l<>(viewGroup6, layoutParams);
        SnsMethodCalculate.markEndTimeMs("buildCustomView", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveOtherTimelineItem");
        return lVar;
    }

    public QPictureView getTagImgView() {
        SnsMethodCalculate.markStartTimeMs("getTagImgView", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveOtherTimelineItem");
        TagImageView tagImageView = this.f295544U0;
        SnsMethodCalculate.markEndTimeMs("getTagImgView", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveOtherTimelineItem");
        return tagImageView;
    }

    public int getViewType() {
        SnsMethodCalculate.markStartTimeMs("getViewType", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveOtherTimelineItem");
        SnsMethodCalculate.markEndTimeMs("getViewType", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveOtherTimelineItem");
        return 1;
    }

    /* renamed from: n */
    public String mo87544n() {
        SnsMethodCalculate.markStartTimeMs("name", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveOtherTimelineItem");
        SnsMethodCalculate.markEndTimeMs("name", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveOtherTimelineItem");
        return "ImproveOtherTimelineItem";
    }
}
