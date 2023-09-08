package jq2;

import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import co2.C92442i;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.sns.model.AdLandingPagesProxy;
import com.tencent.p014mm.plugin.sns.p104ad.timeline.helper.ActionBtnFollowFinderHelper;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import ht1.C60208v1;
import j20.C117292a;
import java.util.ArrayList;
import nj3.C76879j;
import qo3.C89779i0;

/* renamed from: jq2.b */
public class C98983b implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ ActionBtnFollowFinderHelper f290229d;

    public C98983b(ActionBtnFollowFinderHelper actionBtnFollowFinderHelper) {
        this.f290229d = actionBtnFollowFinderHelper;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/sns/ad/timeline/helper/ActionBtnFollowFinderHelper$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ad.timeline.helper.ActionBtnFollowFinderHelper$2");
        Log.m105924i("ActionBtnFollowFinderHelper", "onBtnClick");
        ActionBtnFollowFinderHelper actionBtnFollowFinderHelper = this.f290229d;
        SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.ad.timeline.helper.ActionBtnFollowFinderHelper");
        Context context = actionBtnFollowFinderHelper.f274159a;
        SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.ad.timeline.helper.ActionBtnFollowFinderHelper");
        ActionBtnFollowFinderHelper actionBtnFollowFinderHelper2 = this.f290229d;
        SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.ad.timeline.helper.ActionBtnFollowFinderHelper");
        Context context2 = actionBtnFollowFinderHelper2.f274159a;
        SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.ad.timeline.helper.ActionBtnFollowFinderHelper");
        String string = context2.getString(C0966R.string.a3h);
        ActionBtnFollowFinderHelper actionBtnFollowFinderHelper3 = this.f290229d;
        SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.ad.timeline.helper.ActionBtnFollowFinderHelper");
        Context context3 = actionBtnFollowFinderHelper3.f274159a;
        SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.ad.timeline.helper.ActionBtnFollowFinderHelper");
        C89779i0 Q = C76879j.m92723Q(context, string, context3.getString(C0966R.string.bjo), true, true, (DialogInterface.OnCancelListener) null);
        SnsMethodCalculate.markStartTimeMs("access$102", "com.tencent.mm.plugin.sns.ad.timeline.helper.ActionBtnFollowFinderHelper");
        actionBtnFollowFinderHelper.f274162d = Q;
        SnsMethodCalculate.markEndTimeMs("access$102", "com.tencent.mm.plugin.sns.ad.timeline.helper.ActionBtnFollowFinderHelper");
        ActionBtnFollowFinderHelper actionBtnFollowFinderHelper4 = this.f290229d;
        SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.ad.timeline.helper.ActionBtnFollowFinderHelper");
        int i = actionBtnFollowFinderHelper4.f274176r;
        SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.ad.timeline.helper.ActionBtnFollowFinderHelper");
        if (i == 1000) {
            AdLandingPagesProxy instance = AdLandingPagesProxy.getInstance();
            ActionBtnFollowFinderHelper actionBtnFollowFinderHelper5 = this.f290229d;
            SnsMethodCalculate.markStartTimeMs("access$400", "com.tencent.mm.plugin.sns.ad.timeline.helper.ActionBtnFollowFinderHelper");
            C92442i iVar = actionBtnFollowFinderHelper5.f274165g;
            SnsMethodCalculate.markEndTimeMs("access$400", "com.tencent.mm.plugin.sns.ad.timeline.helper.ActionBtnFollowFinderHelper");
            ActionBtnFollowFinderHelper actionBtnFollowFinderHelper6 = this.f290229d;
            SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.ad.timeline.helper.ActionBtnFollowFinderHelper");
            int i2 = actionBtnFollowFinderHelper6.f274176r;
            SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.ad.timeline.helper.ActionBtnFollowFinderHelper");
            ActionBtnFollowFinderHelper actionBtnFollowFinderHelper7 = this.f290229d;
            SnsMethodCalculate.markStartTimeMs("access$500", "com.tencent.mm.plugin.sns.ad.timeline.helper.ActionBtnFollowFinderHelper");
            AdLandingPagesProxy.C94830p pVar = actionBtnFollowFinderHelper7.f274166h;
            SnsMethodCalculate.markEndTimeMs("access$500", "com.tencent.mm.plugin.sns.ad.timeline.helper.ActionBtnFollowFinderHelper");
            instance.addAdFinderContract(iVar, i2, pVar);
        } else {
            ActionBtnFollowFinderHelper actionBtnFollowFinderHelper8 = this.f290229d;
            SnsMethodCalculate.markStartTimeMs("access$400", "com.tencent.mm.plugin.sns.ad.timeline.helper.ActionBtnFollowFinderHelper");
            C92442i iVar2 = actionBtnFollowFinderHelper8.f274165g;
            SnsMethodCalculate.markEndTimeMs("access$400", "com.tencent.mm.plugin.sns.ad.timeline.helper.ActionBtnFollowFinderHelper");
            SnsMethodCalculate.markStartTimeMs("access$600", "com.tencent.mm.plugin.sns.ad.timeline.helper.ActionBtnFollowFinderHelper");
            SnsMethodCalculate.markStartTimeMs("doFollowFinder", "com.tencent.mm.plugin.sns.ad.timeline.helper.ActionBtnFollowFinderHelper");
            Log.m105924i("ActionBtnFollowFinderHelper", "doFollowFinder, userName=" + iVar2.f264532a);
            if (actionBtnFollowFinderHelper8.f274167i == null) {
                ActionBtnFollowFinderHelper.FollowUserEventListener followUserEventListener = new ActionBtnFollowFinderHelper.FollowUserEventListener(actionBtnFollowFinderHelper8);
                actionBtnFollowFinderHelper8.f274167i = followUserEventListener;
                followUserEventListener.alive();
            }
            try {
                ((C60208v1) C86312j.m106911c(C60208v1.class)).mo78717rl(iVar2.f264532a, 1, 0L, false, 102);
            } catch (Throwable th) {
                Log.m105920e("ActionBtnFollowFinderHelper", "doFollowFinder exp=" + th.toString());
            }
            SnsMethodCalculate.markEndTimeMs("doFollowFinder", "com.tencent.mm.plugin.sns.ad.timeline.helper.ActionBtnFollowFinderHelper");
            SnsMethodCalculate.markEndTimeMs("access$600", "com.tencent.mm.plugin.sns.ad.timeline.helper.ActionBtnFollowFinderHelper");
        }
        SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ad.timeline.helper.ActionBtnFollowFinderHelper$2");
        C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ad/timeline/helper/ActionBtnFollowFinderHelper$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
