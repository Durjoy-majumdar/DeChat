package p160gy;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.sns.model.C94866e1;
import com.tencent.p014mm.plugin.sns.model.C94942r1;
import com.tencent.p014mm.plugin.sns.p106ui.SnsTimeLineUI;
import com.tencent.p014mm.plugin.sns.p106ui.improve.ImproveSnsTimelineUI;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import di3.C86301e;
import di3.C86312j;
import ei3.C86522b;
import f40.C86709a0;
import gv2.C98249r;
import gy3.C87412m;
import h81.C32735h;
import iv2.C33419c;
import iv2.C46289a;
import j20.C117292a;
import java.io.IOException;
import k20.C9556a;
import ke3.C88144b;
import os2.C100423z;
import p166hy.C98564l0;
import p166hy.C98567o0;
import p761yd.C38993b;
import rx3.C13604l;

@C86522b
/* renamed from: gy.w0 */
public final class C98289w0 extends C86301e implements C98567o0 {

    /* renamed from: d */
    public boolean f288115d = mo137597wZ();

    /* renamed from: DW */
    public void mo137587DW(Activity activity) {
        SnsMethodCalculate.markStartTimeMs("onClickSecondCut", "com.tencent.mm.feature.sns.SnsFeatureService");
        C87412m.m108594g(activity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        SnsTimeLineUI.m122314x8(activity);
        SnsMethodCalculate.markEndTimeMs("onClickSecondCut", "com.tencent.mm.feature.sns.SnsFeatureService");
    }

    public boolean Fi0() {
        SnsMethodCalculate.markStartTimeMs("canSetFinderAsCover", "com.tencent.mm.feature.sns.SnsFeatureService");
        SnsMethodCalculate.markStartTimeMs("canSetFinderAsCover", "com.tencent.mm.plugin.sns.util.SetSnsBgFromFinderUtils");
        boolean wf = ((C32735h) C86312j.m106911c(C32735h.class)).mo58784wf(C32735h.C32737c.clicfg_sns_cover_enable, false);
        SnsMethodCalculate.markEndTimeMs("canSetFinderAsCover", "com.tencent.mm.plugin.sns.util.SetSnsBgFromFinderUtils");
        SnsMethodCalculate.markEndTimeMs("canSetFinderAsCover", "com.tencent.mm.feature.sns.SnsFeatureService");
        return wf;
    }

    /* renamed from: Mr */
    public boolean mo137589Mr() {
        SnsMethodCalculate.markStartTimeMs("isShowSecondcut", "com.tencent.mm.feature.sns.SnsFeatureService");
        Boolean bool = SnsTimeLineUI.f278611T1;
        SnsMethodCalculate.markStartTimeMs("isShowSecondcut", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
        boolean e = C38993b.m41995e("clicfg_sns_gallery_show_secondcut", false);
        SnsMethodCalculate.markEndTimeMs("isShowSecondcut", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
        SnsMethodCalculate.markEndTimeMs("isShowSecondcut", "com.tencent.mm.feature.sns.SnsFeatureService");
        return e;
    }

    public void Wk0(Activity activity, int i, byte[] bArr, int i2) {
        SnsMethodCalculate.markStartTimeMs("enterSnsCoverFinderPreviewUI", "com.tencent.mm.feature.sns.SnsFeatureService");
        if (activity == null) {
            SnsMethodCalculate.markEndTimeMs("enterSnsCoverFinderPreviewUI", "com.tencent.mm.feature.sns.SnsFeatureService");
        } else if (bArr == null) {
            SnsMethodCalculate.markEndTimeMs("enterSnsCoverFinderPreviewUI", "com.tencent.mm.feature.sns.SnsFeatureService");
        } else {
            C46289a.f124738a.mo71702a(activity, i, bArr, i2);
            SnsMethodCalculate.markEndTimeMs("enterSnsCoverFinderPreviewUI", "com.tencent.mm.feature.sns.SnsFeatureService");
        }
    }

    /* renamed from: Z0 */
    public C98564l0 mo137591Z0() {
        SnsMethodCalculate.markStartTimeMs("getSnsCoverStg", "com.tencent.mm.feature.sns.SnsFeatureService");
        C100423z Ux0 = C94866e1.Ux0();
        C87412m.m108593f(Ux0, "getSnsCoverStg()");
        SnsMethodCalculate.markEndTimeMs("getSnsCoverStg", "com.tencent.mm.feature.sns.SnsFeatureService");
        return Ux0;
    }

    /* renamed from: an */
    public void mo137592an(String str, Bundle bundle, String str2) {
        SnsMethodCalculate.markStartTimeMs("checkEmotionSafeStrategyInfoList", "com.tencent.mm.feature.sns.SnsFeatureService");
        C87412m.m108594g(str, "path");
        C87412m.m108594g(bundle, "extraData");
        C87412m.m108594g(str2, "extraKey");
        C94942r1.f275179a.mo131224c(str, bundle, str2);
        SnsMethodCalculate.markEndTimeMs("checkEmotionSafeStrategyInfoList", "com.tencent.mm.feature.sns.SnsFeatureService");
    }

    public void fb0(MMActivity mMActivity, boolean z) {
        SnsMethodCalculate.markStartTimeMs("doCpatureMMSight", "com.tencent.mm.feature.sns.SnsFeatureService");
        C87412m.m108594g(mMActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        SnsTimeLineUI.m122311q8(mMActivity, Boolean.valueOf(z));
        SnsMethodCalculate.markEndTimeMs("doCpatureMMSight", "com.tencent.mm.feature.sns.SnsFeatureService");
    }

    public boolean gj0() {
        SnsMethodCalculate.markStartTimeMs("isCancelCameraSheet", "com.tencent.mm.feature.sns.SnsFeatureService");
        boolean w8 = SnsTimeLineUI.m122313w8();
        SnsMethodCalculate.markEndTimeMs("isCancelCameraSheet", "com.tencent.mm.feature.sns.SnsFeatureService");
        return w8;
    }

    /* renamed from: om */
    public void mo137595om(Intent intent) {
        SnsMethodCalculate.markStartTimeMs("selectFinderAsCover", "com.tencent.mm.feature.sns.SnsFeatureService");
        SnsMethodCalculate.markStartTimeMs("selectFinderAsCover", "com.tencent.mm.plugin.sns.util.SetSnsBgFromFinderUtils");
        if (intent != null) {
            FinderObject finderObject = new FinderObject();
            try {
                finderObject.parseFrom(intent.getByteArrayExtra("SELECT_OBJECT"));
            } catch (IOException e) {
                Log.printErrStackTrace("SetSnsBgFromFinderUtils", e, "FinderObject error", new Object[0]);
            }
            C94866e1.gy0().mo131205p(finderObject);
        }
        SnsMethodCalculate.markEndTimeMs("selectFinderAsCover", "com.tencent.mm.plugin.sns.util.SetSnsBgFromFinderUtils");
        SnsMethodCalculate.markEndTimeMs("selectFinderAsCover", "com.tencent.mm.feature.sns.SnsFeatureService");
    }

    public C13604l<String, String> qa0() {
        SnsMethodCalculate.markStartTimeMs("getSnsMediaPath", "com.tencent.mm.feature.sns.SnsFeatureService");
        C13604l<String, String> b = C33419c.f90549a.mo59134b();
        SnsMethodCalculate.markEndTimeMs("getSnsMediaPath", "com.tencent.mm.feature.sns.SnsFeatureService");
        return b;
    }

    /* renamed from: wZ */
    public boolean mo137597wZ() {
        SnsMethodCalculate.markStartTimeMs("useImproveSnsUI", "com.tencent.mm.feature.sns.SnsFeatureService");
        boolean z = false;
        if (!C86709a0.m107523b().mo121114l()) {
            SnsMethodCalculate.markEndTimeMs("useImproveSnsUI", "com.tencent.mm.feature.sns.SnsFeatureService");
            return false;
        }
        int j = C86709a0.m107535s().mo121142i().mo119689j(C72994y1.C72995a.USERINFO_SNS_USE_IMPROVEUI_INT_SYNC, 0);
        if (j != 1) {
            z = j != 2 ? ((C32735h) C86312j.m106911c(C32735h.class)).mo58784wf(C32735h.C32737c.clicfg_sns_improve_ui_enable, false) : true;
        }
        SnsMethodCalculate.markEndTimeMs("useImproveSnsUI", "com.tencent.mm.feature.sns.SnsFeatureService");
        return z;
    }

    public void x50() {
        SnsMethodCalculate.markStartTimeMs("resetSnsPostDescPreloadTextViewConfig", "com.tencent.mm.feature.sns.SnsFeatureService");
        C98249r.m126977f();
        SnsMethodCalculate.markEndTimeMs("resetSnsPostDescPreloadTextViewConfig", "com.tencent.mm.feature.sns.SnsFeatureService");
    }

    public boolean yb0(Context context, Intent intent, int i, C98567o0.C76249a aVar) {
        Context context2 = context;
        int i2 = i;
        C98567o0.C76249a aVar2 = aVar;
        SnsMethodCalculate.markStartTimeMs("jumpToSnsUI", "com.tencent.mm.feature.sns.SnsFeatureService");
        C87412m.m108594g(context, "context");
        C87412m.m108594g(aVar2, "data");
        if (!C86709a0.m107523b().mo121114l()) {
            Log.printErrStackTrace("MicroMsg.SnsFeatureService", (Throwable) null, "account has not Initialized", new Object[0]);
            SnsMethodCalculate.markEndTimeMs("jumpToSnsUI", "com.tencent.mm.feature.sns.SnsFeatureService");
            return false;
        }
        Intent intent2 = intent == null ? new Intent() : intent;
        intent2.putExtra("sns_enter_scene", i2);
        if (aVar2.f223345a) {
            intent2.addFlags(67108864);
        }
        intent2.putExtra("sns_timeline_NeedFirstLoadint", aVar2.f223346b);
        intent2.putExtra("enter_by_red", aVar2.f223347c);
        intent2.putExtra("sns_jump_timestamp", System.currentTimeMillis());
        intent2.putExtra("is_sns_notify_open", aVar2.f223348d);
        intent2.putExtra("sns_unread_count", aVar2.f223349e);
        intent2.putExtra("is_need_resend_sns", aVar2.f223352h);
        if (!TextUtils.isEmpty(aVar2.f223350f)) {
            intent2.putExtra("new_feed_id", aVar2.f223350f);
        }
        intent2.putExtra("sns_resume_state", aVar2.f223351g);
        boolean wZ = mo137597wZ();
        Log.printInfoStack("MicroMsg.SnsFeatureService", "enterScene:" + i2 + " data:" + aVar2 + " use improve ui:" + wZ, new Object[0]);
        if (wZ != this.f288115d) {
            C94866e1.Kx0().mo133238a();
        }
        this.f288115d = wZ;
        if (wZ) {
            intent2.setClass(context, ImproveSnsTimelineUI.class);
            C9556a aVar3 = new C9556a();
            aVar3.mo10233c(intent2);
            C117292a.m165358d(context, aVar3.mo10232b(), "com/tencent/mm/feature/sns/SnsFeatureService", "jumpToSnsUI", "(Landroid/content/Context;Landroid/content/Intent;ILcom/tencent/mm/feature/sns/api/ISnsFeatureService$SnsJumpData;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((Intent) aVar3.mo10231a(0));
            C117292a.m165359e(context, "com/tencent/mm/feature/sns/SnsFeatureService", "jumpToSnsUI", "(Landroid/content/Context;Landroid/content/Intent;ILcom/tencent/mm/feature/sns/api/ISnsFeatureService$SnsJumpData;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        } else {
            C88144b.m109791i(context, "sns", ".ui.SnsTimeLineUI", intent2, (Bundle) null);
        }
        SnsMethodCalculate.markEndTimeMs("jumpToSnsUI", "com.tencent.mm.feature.sns.SnsFeatureService");
        return true;
    }
}
