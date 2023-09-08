package com.tencent.p014mm.plugin.sns.p106ui;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.mmsight.SightParams;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import eb0.C31543z5;
import j20.C117292a;
import k20.C9556a;
import ke3.C88144b;
import p182kk.C61104a;
import vr2.C102236a0;

/* renamed from: com.tencent.mm.plugin.sns.ui.s6 */
public class C96221s6 implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ SnsTimeLineUI$$z0 f281177d;

    /* renamed from: e */
    public final /* synthetic */ SnsTimeLineUI f281178e;

    public C96221s6(SnsTimeLineUI snsTimeLineUI, SnsTimeLineUI$$z0 snsTimeLineUI$$z0) {
        this.f281178e = snsTimeLineUI;
        this.f281177d = snsTimeLineUI$$z0;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$69");
        SnsTimeLineUI.m122306i8(this.f281178e).mo132962b(1);
        SnsTimeLineUI snsTimeLineUI = this.f281178e;
        SnsTimeLineUI.m122307j8(snsTimeLineUI, SnsTimeLineUI.m122306i8(snsTimeLineUI));
        int i2 = this.f281177d.f278813b;
        if (i2 == 0) {
            SnsTimeLineUI snsTimeLineUI2 = this.f281178e;
            SnsMethodCalculate.markStartTimeMs("access$6500", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
            snsTimeLineUI2.getClass();
            SnsMethodCalculate.markStartTimeMs("doDownloadWeishi", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
            Intent intent = new Intent();
            intent.putExtra("rawUrl", "https://mobile.qzone.qq.com/l?g=4991");
            C88144b.m109791i(snsTimeLineUI2, "webview", ".ui.tools.WebViewUI", intent, (Bundle) null);
            SnsMethodCalculate.markEndTimeMs("doDownloadWeishi", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
            SnsMethodCalculate.markEndTimeMs("access$6500", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
        } else if (i2 == 2) {
            SnsTimeLineUI snsTimeLineUI3 = this.f281178e;
            SnsMethodCalculate.markStartTimeMs("access$6400", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
            snsTimeLineUI3.getClass();
            SnsMethodCalculate.markStartTimeMs("doCpatureWeiShiSight", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
            if (C61104a.m71665u(snsTimeLineUI3)) {
                SnsMethodCalculate.markEndTimeMs("doCpatureWeiShiSight", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
            } else if (C61104a.m71649e(snsTimeLineUI3)) {
                SnsMethodCalculate.markEndTimeMs("doCpatureWeiShiSight", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
            } else {
                long c = C31543z5.m39453c();
                String l = C102236a0.m134754l();
                Log.m105925i("MicroMsg.SnsTimeLineUI", "doCpatureMMSight sessionID:%s", l);
                C115669n.INSTANCE.mo160131h(13822, 1, 2, l, Long.valueOf(c));
                Intent intent2 = new Intent();
                AppCompatActivity context = snsTimeLineUI3.getContext();
                SightParams sightParams = (SightParams) intent2.getParcelableExtra("KEY_SIGHT_PARAMS");
                if (sightParams == null) {
                    sightParams = new SightParams(2, 0);
                }
                sightParams.f248460q = l;
                if (Util.isNullOrNil(l)) {
                    l = Util.nowMilliSecond() + "_" + Util.getRandomString(5);
                }
                StringBuilder sb = new StringBuilder("weishi://camera?forceNoShowLogin=1");
                Log.m105919d("MicroMsg.TakePhotoUtil", "weishi_url = %s", sb.toString());
                intent2.setAction("android.intent.action.VIEW");
                intent2.setData(Uri.parse(sb.toString()));
                intent2.setPackage("com.tencent.weishi");
                intent2.setFlags(268435456);
                context.getSharedPreferences("opensdk_shareTicket", 0).edit().putString(intent2.getPackage(), l).apply();
                try {
                    C9556a aVar = new C9556a();
                    aVar.mo10233c(intent2);
                    C117292a.m165358d(context, aVar.mo10232b(), "com/tencent/mm/pluginsdk/ui/tools/TakePhotoUtil", "takeWeiShiSight", "(Landroid/content/Context;ILandroid/content/Intent;ILjava/lang/String;ILjava/lang/String;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    context.startActivity((Intent) aVar.mo10231a(0));
                    C117292a.m165359e(context, "com/tencent/mm/pluginsdk/ui/tools/TakePhotoUtil", "takeWeiShiSight", "(Landroid/content/Context;ILandroid/content/Intent;ILjava/lang/String;ILjava/lang/String;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    context.overridePendingTransition(C0966R.C0968anim.f2492eg, -1);
                } catch (Exception e) {
                    Log.m105929w("MicroMsg.TakePhotoUtil", "takeWeishiSight Exception: %s", e.getMessage());
                }
                SnsMethodCalculate.markEndTimeMs("doCpatureWeiShiSight", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
            }
            SnsMethodCalculate.markEndTimeMs("access$6400", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
        }
        SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$69");
    }
}
