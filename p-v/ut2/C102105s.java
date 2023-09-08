package ut2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.animation.TranslateAnimation;
import androidx.appcompat.app.AppCompatActivity;
import au2.C39636a;
import au2.C92093b;
import bv2.C92313c;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.memory.p1073ui.QPictureView;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.plugin.sns.model.C94866e1;
import com.tencent.p014mm.plugin.sns.model.C94895m2;
import com.tencent.p014mm.plugin.sns.p106ui.C43162z1;
import com.tencent.p014mm.plugin.sns.p106ui.C71253l1;
import com.tencent.p014mm.plugin.sns.p106ui.C95713a5;
import com.tencent.p014mm.plugin.sns.p106ui.C96085n8;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.p106ui.video.C96254a;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import di3.C86312j;
import dm2.C45420d;
import du2.C97541a;
import eb0.C75592q0;
import ex0.C45696d;
import f40.C86709a0;
import ft2.C97979c;
import ft2.C97982g;
import ft2.c$$e;
import gy3.C87412m;
import java.util.HashMap;
import ju2.C99045e;
import ju2.C99053l;
import kg3.C76577a;
import l40.C99336c;
import p640ox.C77049b;
import tu2.C101931d;
import yn2.C102882s0;

/* renamed from: ut2.s */
public final class C102105s extends C102084a {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C102105s(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    public void onCreate(Bundle bundle) {
        SnsMethodCalculate.markStartTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveSnsOptionUIC");
        super.onCreate(bundle);
        QPictureView.f266835G = false;
        C92093b bVar = C92093b.f263643a;
        Activity context = getContext();
        SnsMethodCalculate.markStartTimeMs("refresh", "com.tencent.mm.plugin.sns.ui.improve.config.ImproveSnsConfig");
        C87412m.m108594g(context, "context");
        C92093b.f263644b = C75592q0.m90789s();
        C92093b.f263645c = C76577a.m92157h(context, C0966R.dimen.f3679b9) + C85875k4.m106200p(context);
        SnsMethodCalculate.markEndTimeMs("refresh", "com.tencent.mm.plugin.sns.ui.improve.config.ImproveSnsConfig");
        Activity context2 = getContext();
        SnsMethodCalculate.markStartTimeMs("registerReporterData", "com.tencent.mm.plugin.sns.reportflow.SnsTagSearchSpanClickReportFlow$Companion");
        C87412m.m108594g(context2, "context");
        ((C77049b) C86312j.m106911c(C77049b.class)).Kn0(context2, new C45420d(1));
        SnsMethodCalculate.markEndTimeMs("registerReporterData", "com.tencent.mm.plugin.sns.reportflow.SnsTagSearchSpanClickReportFlow$Companion");
        Intent intent = getIntent();
        SnsMethodCalculate.markStartTimeMs("setUpBrowseHelper", "com.tencent.mm.plugin.sns.ui.improve.config.ImproveGlobalInstance");
        C87412m.m108594g(intent, "intent");
        C96085n8.f280582z = new C94895m2(1);
        SnsMethodCalculate.markEndTimeMs("setUpBrowseHelper", "com.tencent.mm.plugin.sns.ui.improve.config.ImproveGlobalInstance");
        Activity context3 = getContext();
        SnsMethodCalculate.markStartTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.improve.func.SnsImprovePhotoLoader");
        C87412m.m108594g(context3, "context");
        C97541a.f286247a = new C95713a5(context3);
        SnsMethodCalculate.markEndTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.improve.func.SnsImprovePhotoLoader");
        C94866e1.hy0().mo131034t(true);
        C94866e1.cy0().mo131279c();
        C96254a.m123394d().mo133935h();
        C45696d dVar = (C45696d) C86709a0.m107533q(C45696d.class);
        if (dVar != null) {
            dVar.Xe0("__sns_timeline__");
        }
        MultiProcessMMKV.getMMKV("SnsMMKV").encode("SnsMMKVSnsUI", true);
        SnsMethodCalculate.markEndTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveSnsOptionUIC");
    }

    public void onDestroy() {
        C43162z1 z1Var;
        SnsMethodCalculate.markStartTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveSnsOptionUIC");
        Log.m105924i("MicroMsg.Improve.SnsOptionUIC", "onDestroy");
        super.onDestroy();
        C96254a.m123394d().mo133936i(getActivity());
        C92313c.m116089a().mo126299b();
        C99336c.f291266b.mo138731a();
        C99053l lVar = C99053l.f290358a;
        SnsMethodCalculate.markStartTimeMs("clearCacheFoldCommentContent", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveTextUtil");
        Log.m105924i("MicroMsg.Improve.TextUtil", "clearCacheFoldCommentContent: ");
        lVar.mo138403a().clear();
        SnsMethodCalculate.markEndTimeMs("clearCacheFoldCommentContent", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveTextUtil");
        C102882s0.f303681a.mo142591c();
        SnsMethodCalculate.markStartTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ui.improve.func.SnsImprovePhotoLoader");
        C97541a.f286247a = null;
        SnsMethodCalculate.markEndTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ui.improve.func.SnsImprovePhotoLoader");
        MultiProcessMMKV.getMMKV("SnsMMKV").encode("SnsMMKVSnsUI", false);
        SnsMethodCalculate.markStartTimeMs("releaseWindow", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveInteractionUtil");
        C99045e.f290347d = null;
        TranslateAnimation translateAnimation = C99045e.f290345b;
        if (translateAnimation != null) {
            translateAnimation.cancel();
        }
        C99045e.f290345b = null;
        TranslateAnimation translateAnimation2 = C99045e.f290346c;
        if (translateAnimation2 != null) {
            translateAnimation2.cancel();
        }
        C99045e.f290346c = null;
        SnsMethodCalculate.markEndTimeMs("releaseWindow", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveInteractionUtil");
        C101931d dVar = C101931d.f300107a;
        SnsMethodCalculate.markStartTimeMs("release", "com.tencent.mm.plugin.sns.ui.item.improve.recycle.TimelineItemViewPool");
        C101931d.f300108b.clear();
        SnsMethodCalculate.markEndTimeMs("release", "com.tencent.mm.plugin.sns.ui.item.improve.recycle.TimelineItemViewPool");
        SnsMethodCalculate.markStartTimeMs("release", "com.tencent.mm.plugin.sns.ui.improve.config.ImproveGlobalInstance");
        SnsMethodCalculate.markStartTimeMs("setOpenIMUnlikeHelper", "com.tencent.mm.plugin.sns.ui.improve.config.ImproveGlobalInstance");
        if (!C87412m.m108589b(C39636a.f106397a, (Object) null) && (z1Var = C39636a.f106397a) != null) {
            z1Var.mo67390c();
        }
        C39636a.f106397a = null;
        SnsMethodCalculate.markEndTimeMs("setOpenIMUnlikeHelper", "com.tencent.mm.plugin.sns.ui.improve.config.ImproveGlobalInstance");
        C96085n8.f280582z = null;
        SnsMethodCalculate.markEndTimeMs("release", "com.tencent.mm.plugin.sns.ui.improve.config.ImproveGlobalInstance");
        C71253l1.m83680a();
        QPictureView.f266835G = true;
        HashMap<Long, c$$e> hashMap = C97979c.f287345j;
        SnsMethodCalculate.markStartTimeMs("reportBigPicClick", "com.tencent.mm.plugin.sns.ui.adapter.SnsTimeLineVendingAdapter");
        C94866e1.my0().post(new C97982g());
        SnsMethodCalculate.markEndTimeMs("reportBigPicClick", "com.tencent.mm.plugin.sns.ui.adapter.SnsTimeLineVendingAdapter");
        SnsMethodCalculate.markEndTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveSnsOptionUIC");
    }

    public void onPause() {
        SnsMethodCalculate.markStartTimeMs("onPause", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveSnsOptionUIC");
        super.onPause();
        C96254a.m123394d().mo133937j();
        C92313c.m116089a().mo126300c();
        SnsMethodCalculate.markEndTimeMs("onPause", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveSnsOptionUIC");
    }

    public void onResume() {
        SnsMethodCalculate.markStartTimeMs("onResume", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveSnsOptionUIC");
        super.onResume();
        C94866e1.Fx0().mo131118g0();
        SnsMethodCalculate.markEndTimeMs("onResume", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveSnsOptionUIC");
    }
}
