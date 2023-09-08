package ls2;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.plugin.sns.p106ui.C96275w6;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.p106ui.widget.SnsCommentCollapseLayout;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import dm2.C45424g;
import gy3.C8480h;
import gy3.C87412m;
import p640ox.C77049b;
import te3.w64;
import te3.ze4;
import vr2.C102236a0;

/* renamed from: ls2.a */
public final class C99591a {

    /* renamed from: a */
    public static final C99592a f291957a = new C99592a((C8480h) null);

    /* renamed from: ls2.a$a */
    public static final class C99592a {
        public C99592a(C8480h hVar) {
        }

        /* renamed from: a */
        public final void mo138966a(SnsInfo snsInfo, View view) {
            SnsMethodCalculate.markStartTimeMs("onDetailPageDescSpanBindView", "com.tencent.mm.plugin.sns.reportflow.SnsTagSearchSpanClickReportFlow$Companion");
            C87412m.m108594g(snsInfo, "snsInfo");
            C87412m.m108594g(view, "view");
            ze4 ze4 = new ze4();
            ze4.f228685e = 3;
            ze4.f228686f = snsInfo.getUserName() + '#' + C102236a0.m134765q0(snsInfo.field_snsId);
            ze4.f228687g = (long) snsInfo.field_createTime;
            ze4.f228688h = 3;
            ze4.f228689i = snsInfo.field_type;
            Context context = view.getContext();
            C87412m.m108593f(context, "view.context");
            C45424g Lq0 = ((C77049b) C86312j.m106911c(C77049b.class)).Lq0(context, 1);
            if (Lq0 != null) {
                Lq0.mo70916a(String.valueOf(view.hashCode()), ze4);
            }
            SnsMethodCalculate.markEndTimeMs("onDetailPageDescSpanBindView", "com.tencent.mm.plugin.sns.reportflow.SnsTagSearchSpanClickReportFlow$Companion");
        }

        /* renamed from: b */
        public final void mo138967b(View view, w64 w64) {
            Class cls = C77049b.class;
            SnsMethodCalculate.markStartTimeMs("onItemCommentSpanBindView", "com.tencent.mm.plugin.sns.reportflow.SnsTagSearchSpanClickReportFlow$Companion");
            C87412m.m108594g(view, "view");
            C87412m.m108594g(w64, FFmpegMetadataRetriever.METADATA_KEY_COMMENT);
            if (view instanceof SnsCommentCollapseLayout) {
                SnsCommentCollapseLayout snsCommentCollapseLayout = (SnsCommentCollapseLayout) view;
                Context context = snsCommentCollapseLayout.getContext();
                C87412m.m108593f(context, "view.context");
                C45424g Lq0 = ((C77049b) C86312j.m106911c(cls)).Lq0(context, 1);
                if (Lq0 != null) {
                    Lq0.mo70918c("Comment_" + w64.hashCode(), String.valueOf(snsCommentCollapseLayout.getNormalCommentTv().hashCode()));
                }
                Context context2 = snsCommentCollapseLayout.getContext();
                C87412m.m108593f(context2, "view.context");
                C45424g Lq02 = ((C77049b) C86312j.m106911c(cls)).Lq0(context2, 1);
                if (Lq02 != null) {
                    Lq02.mo70918c("Comment_" + w64.hashCode(), String.valueOf(snsCommentCollapseLayout.get2LineCommentTv().hashCode()));
                }
            } else if (view instanceof TextView) {
                Context context3 = ((TextView) view).getContext();
                C87412m.m108593f(context3, "view.context");
                C45424g Lq03 = ((C77049b) C86312j.m106911c(cls)).Lq0(context3, 1);
                if (Lq03 != null) {
                    Lq03.mo70918c("Comment_" + w64.hashCode(), String.valueOf(view.hashCode()));
                }
                SnsMethodCalculate.markStartTimeMs("getTAG", "com.tencent.mm.plugin.sns.reportflow.SnsTagSearchSpanClickReportFlow$Companion");
                SnsMethodCalculate.markStartTimeMs("access$getTAG$cp", "com.tencent.mm.plugin.sns.reportflow.SnsTagSearchSpanClickReportFlow");
                SnsMethodCalculate.markEndTimeMs("access$getTAG$cp", "com.tencent.mm.plugin.sns.reportflow.SnsTagSearchSpanClickReportFlow");
                SnsMethodCalculate.markEndTimeMs("getTAG", "com.tencent.mm.plugin.sns.reportflow.SnsTagSearchSpanClickReportFlow$Companion");
                Log.m105924i("MicroMsg.Sns.SnsTagSearchSpanClickReportFlow", "onItemCommentSpanBindView Comment_" + w64.hashCode() + ' ' + view.hashCode());
            }
            SnsMethodCalculate.markEndTimeMs("onItemCommentSpanBindView", "com.tencent.mm.plugin.sns.reportflow.SnsTagSearchSpanClickReportFlow$Companion");
        }

        /* renamed from: c */
        public final void mo138968c(View view, int i, C96275w6 w6Var) {
            SnsMethodCalculate.markStartTimeMs("onItemDescSpanBindView", "com.tencent.mm.plugin.sns.reportflow.SnsTagSearchSpanClickReportFlow$Companion");
            C87412m.m108594g(view, "view");
            C87412m.m108594g(w6Var, "struct");
            View findViewById = view.findViewById(i);
            Context context = view.getContext();
            C87412m.m108593f(context, "view.context");
            C45424g Lq0 = ((C77049b) C86312j.m106911c(C77049b.class)).Lq0(context, 1);
            if (Lq0 != null) {
                Lq0.mo70918c("Item_" + w6Var.f281367a.localid, String.valueOf(findViewById.hashCode()));
            }
            SnsMethodCalculate.markEndTimeMs("onItemDescSpanBindView", "com.tencent.mm.plugin.sns.reportflow.SnsTagSearchSpanClickReportFlow$Companion");
        }
    }
}
