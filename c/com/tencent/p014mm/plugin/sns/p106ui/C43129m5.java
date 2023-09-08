package com.tencent.p014mm.plugin.sns.p106ui;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.statistics.SnsReportHelper;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import gy3.C87412m;
import h81.C32735h;
import hi2.C46072b;
import hi2.C46075u;
import j20.C117292a;
import java.util.ArrayList;
import kg3.C76577a;
import nj3.C76879j;

/* renamed from: com.tencent.mm.plugin.sns.ui.m5 */
public class C43129m5 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ String f116697d;

    /* renamed from: e */
    public final /* synthetic */ SnsOnlineVideoActivity f116698e;

    /* renamed from: com.tencent.mm.plugin.sns.ui.m5$a */
    public class C43130a implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ boolean f116699d;

        public C43130a(boolean z) {
            this.f116699d = z;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            Class cls = C32735h.class;
            SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity$7$1");
            if (this.f116699d) {
                C46075u uVar = C46075u.f124225a;
                String str = C43129m5.this.f116697d;
                int Qe = ((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.clicfg_phoneix_video_duration, 30);
                Log.m105924i("MicroMsg.SecondCutConfig", "ShareVideoDuration: " + Qe);
                C87412m.m108594g(str, "extInfo");
                Intent intent = new Intent();
                intent.setData(Uri.parse("miaojian://createvideo?scene=" + "moments" + "&miaojianExtInfo=" + str + "&maxDuration=" + Qe + "&from=3"));
                intent.setPackage("com.tencent.phoenix");
                intent.setAction("android.intent.action.VIEW");
                intent.setFlags(268435456);
                uVar.mo71515c(C43129m5.this.f116698e.getContext(), intent);
            } else {
                C46072b bVar = C46072b.f124220a;
                AppCompatActivity context = C43129m5.this.f116698e.getContext();
                StringBuilder sb = new StringBuilder();
                String Y60 = ((C32735h) C86312j.m106911c(cls)).Y60(C32735h.C32737c.clicfg_phoneix_download_url, "https://miaojian.weixin.qq.com/download/apps?channel=");
                Log.m105924i("MicroMsg.SecondCutConfig", "SecondCutDownloadUrl: " + Y60);
                C87412m.m108593f(Y60, "url");
                sb.append(Y60);
                sb.append("1106");
                bVar.mo71509c(context, sb.toString());
            }
            C43129m5.this.f116698e.mo132875W7();
            SnsReportHelper snsReportHelper = SnsReportHelper.f275506m0;
            SnsOnlineVideoActivity snsOnlineVideoActivity = C43129m5.this.f116698e;
            SnsMethodCalculate.markStartTimeMs("access$1900", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity");
            String str2 = snsOnlineVideoActivity.f278387R;
            SnsMethodCalculate.markEndTimeMs("access$1900", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity");
            snsReportHelper.mo131375h(str2, 3);
            SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity$7$1");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.m5$b */
    public class C43131b implements DialogInterface.OnClickListener {
        public C43131b() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity$7$2");
            SnsOnlineVideoActivity snsOnlineVideoActivity = C43129m5.this.f116698e;
            int i2 = SnsOnlineVideoActivity.f278370y0;
            SnsMethodCalculate.markStartTimeMs("access$1800", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity");
            LinearLayout linearLayout = snsOnlineVideoActivity.f278386Q;
            SnsMethodCalculate.markEndTimeMs("access$1800", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity");
            linearLayout.setBackground(C76577a.m92158i(C43129m5.this.f116698e.getContext(), C0966R.C0969drawable.aty));
            SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity$7$2");
        }
    }

    public C43129m5(SnsOnlineVideoActivity snsOnlineVideoActivity, String str) {
        this.f116698e = snsOnlineVideoActivity;
        this.f116697d = str;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/sns/ui/SnsOnlineVideoActivity$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity$7");
        SnsOnlineVideoActivity snsOnlineVideoActivity = this.f116698e;
        int i = SnsOnlineVideoActivity.f278370y0;
        SnsMethodCalculate.markStartTimeMs("access$1800", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity");
        LinearLayout linearLayout = snsOnlineVideoActivity.f278386Q;
        SnsMethodCalculate.markEndTimeMs("access$1800", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity");
        linearLayout.setBackground(C76577a.m92158i(this.f116698e.getContext(), C0966R.C0969drawable.atz));
        boolean b = C46072b.f124220a.mo71508b(this.f116698e.getContext(), "com.tencent.phoenix", "A24DC0755072F64C480DC06DCD3412BF");
        int i2 = b ? C0966R.string.f7988yg : C0966R.string.f7987yf;
        SnsReportHelper snsReportHelper = SnsReportHelper.f275506m0;
        SnsOnlineVideoActivity snsOnlineVideoActivity2 = this.f116698e;
        SnsMethodCalculate.markStartTimeMs("access$1900", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity");
        String str = snsOnlineVideoActivity2.f278387R;
        SnsMethodCalculate.markEndTimeMs("access$1900", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity");
        snsReportHelper.mo131375h(str, 2);
        C76879j.m92739j(this.f116698e.getContext(), i2, C0966R.string.a3h, C0966R.string.a18, C0966R.string.f7926wf, new C43130a(b), new C43131b());
        SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity$7");
        C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/SnsOnlineVideoActivity$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
