package jx0;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.tencent.p014mm.autogen.mmdata.rpt.BizPersonalCenterReportStruct;
import com.tencent.p014mm.plugin.brandservice.p028ui.personalcenter.BizPersonalCenterActivity;
import com.tencent.p014mm.plugin.brandservice.p028ui.timeline.BizTimeLineNewMsgUI;
import com.tencent.p014mm.plugin.brandservice.p028ui.timeline.BizTimeLineSettingUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import j20.C117292a;
import java.util.ArrayList;
import k20.C9556a;
import ke3.C88144b;
import te3.C51859wo;

/* renamed from: jx0.a */
public final class C46576a implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C51859wo f125471d;

    /* renamed from: e */
    public final /* synthetic */ BizPersonalCenterActivity f125472e;

    public C46576a(C51859wo woVar, BizPersonalCenterActivity bizPersonalCenterActivity) {
        this.f125471d = woVar;
        this.f125472e = bizPersonalCenterActivity;
    }

    public final void onClick(View view) {
        String str;
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/brandservice/ui/personalcenter/BizPersonalCenterActivity$bindClick$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        BizPersonalCenterReportStruct bizPersonalCenterReportStruct = new BizPersonalCenterReportStruct();
        C51859wo woVar = this.f125471d;
        BizPersonalCenterActivity bizPersonalCenterActivity = this.f125472e;
        bizPersonalCenterReportStruct.f107854d = 1;
        bizPersonalCenterReportStruct.f107855e = (long) woVar.f144163e;
        bizPersonalCenterReportStruct.f107856f = bizPersonalCenterActivity.f109263e;
        bizPersonalCenterReportStruct.mo86054n();
        C51859wo woVar2 = this.f125471d;
        int i = woVar2.f144162d;
        if (i == 2) {
            BizPersonalCenterActivity bizPersonalCenterActivity2 = this.f125472e;
            Log.m105924i(bizPersonalCenterActivity2.f109262d, "jump2Web");
            if (Util.isNullOrNil(woVar2.f144164f)) {
                Log.m105920e(bizPersonalCenterActivity2.f109262d, "gotoWebView url is null!");
            } else {
                Intent intent = new Intent();
                intent.putExtra("rawUrl", woVar2.f144164f);
                intent.putExtra("KRightBtn", !woVar2.f144168j);
                C88144b.m109791i(bizPersonalCenterActivity2, "webview", ".ui.tools.WebViewUI", intent, (Bundle) null);
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/brandservice/ui/personalcenter/BizPersonalCenterActivity$bindClick$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        if (i == 1) {
            int i2 = woVar2.f144163e;
            if (i2 == 1) {
                BizPersonalCenterActivity bizPersonalCenterActivity3 = this.f125472e;
                Log.m105924i(bizPersonalCenterActivity3.f109262d, "jump2MyBiz");
                Intent intent2 = new Intent();
                intent2.addFlags(67108864);
                intent2.putExtra("biz_time_line_line_session_id", bizPersonalCenterActivity3.f109263e);
                C88144b.m109801s(bizPersonalCenterActivity3, ".ui.conversation.NewBizConversationUI", intent2, (Bundle) null);
            } else if (i2 == 2) {
                BizPersonalCenterActivity bizPersonalCenterActivity4 = this.f125472e;
                Log.m105924i(bizPersonalCenterActivity4.f109262d, "jump2RecentRead");
                Intent intent3 = new Intent();
                intent3.addFlags(67108864);
                intent3.putExtra("biz_time_line_line_session_id", bizPersonalCenterActivity4.f109263e);
                C88144b.m109791i(bizPersonalCenterActivity4, "brandservice", ".ui.personalcenter.recentread.BizPCRecentReadUI", intent3, (Bundle) null);
            } else if (i2 == 6) {
                BizPersonalCenterActivity bizPersonalCenterActivity5 = this.f125472e;
                Log.m105924i(bizPersonalCenterActivity5.f109262d, "jump2Notification");
                Intent intent4 = new Intent(bizPersonalCenterActivity5.getContext(), BizTimeLineNewMsgUI.class);
                intent4.putExtra("biz_time_line_line_enter_scene", 2);
                intent4.putExtra("biz_time_line_line_session_id", bizPersonalCenterActivity5.f109263e);
                C9556a aVar = new C9556a();
                aVar.mo10233c(intent4);
                BizPersonalCenterActivity bizPersonalCenterActivity6 = bizPersonalCenterActivity5;
                C117292a.m165358d(bizPersonalCenterActivity6, aVar.mo10232b(), "com/tencent/mm/plugin/brandservice/ui/personalcenter/BizPersonalCenterActivity", "jump2Notification", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                bizPersonalCenterActivity5.startActivity((Intent) aVar.mo10231a(0));
                C117292a.m165359e(bizPersonalCenterActivity6, "com/tencent/mm/plugin/brandservice/ui/personalcenter/BizPersonalCenterActivity", "jump2Notification", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            } else if (i2 == 7) {
                BizPersonalCenterActivity bizPersonalCenterActivity7 = this.f125472e;
                Log.m105924i(bizPersonalCenterActivity7.f109262d, "jump2Setting");
                Intent intent5 = new Intent(bizPersonalCenterActivity7.getContext(), BizTimeLineSettingUI.class);
                C9556a aVar2 = new C9556a();
                aVar2.mo10233c(intent5);
                BizPersonalCenterActivity bizPersonalCenterActivity8 = bizPersonalCenterActivity7;
                C117292a.m165358d(bizPersonalCenterActivity8, aVar2.mo10232b(), "com/tencent/mm/plugin/brandservice/ui/personalcenter/BizPersonalCenterActivity", "jump2Setting", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                bizPersonalCenterActivity7.startActivity((Intent) aVar2.mo10231a(0));
                C117292a.m165359e(bizPersonalCenterActivity8, "com/tencent/mm/plugin/brandservice/ui/personalcenter/BizPersonalCenterActivity", "jump2Setting", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                str = "(Landroid/view/View;)V";
                C117292a.m165361g(this, "com/tencent/mm/plugin/brandservice/ui/personalcenter/BizPersonalCenterActivity$bindClick$1", "android/view/View$OnClickListener", "onClick", str);
            }
        }
        str = "(Landroid/view/View;)V";
        C117292a.m165361g(this, "com/tencent/mm/plugin/brandservice/ui/personalcenter/BizPersonalCenterActivity$bindClick$1", "android/view/View$OnClickListener", "onClick", str);
    }
}
