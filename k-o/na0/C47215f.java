package na0;

import android.content.Context;
import android.content.DialogInterface;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import gy3.C87412m;
import h81.C32735h;
import hi2.C46072b;
import hi2.C46075u;
import k21.C60960c;

/* renamed from: na0.f */
public final class C47215f implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ boolean f126774d;

    /* renamed from: e */
    public final /* synthetic */ String f126775e;

    /* renamed from: f */
    public final /* synthetic */ Context f126776f;

    public C47215f(boolean z, String str, Context context) {
        this.f126774d = z;
        this.f126775e = str;
        this.f126776f = context;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        Class cls = C32735h.class;
        C60960c.C60961a aVar = C60960c.f173618a;
        aVar.mo85926j("SnsPublishProcess", "ifEgExit", 1);
        if (this.f126774d) {
            C46075u uVar = C46075u.f124225a;
            int Qe = ((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.clicfg_phoneix_video_duration, 30);
            Log.m105924i("MicroMsg.SecondCutConfig", "ShareVideoDuration: " + Qe);
            uVar.mo71515c(this.f126776f, uVar.mo71514b("moments", Qe, this.f126775e));
            aVar.mo85926j("SnsTemplate", "goToMJAppResult", 1);
            return;
        }
        C46072b bVar = C46072b.f124220a;
        Context context = this.f126776f;
        StringBuilder sb = new StringBuilder();
        String Y60 = ((C32735h) C86312j.m106911c(cls)).Y60(C32735h.C32737c.clicfg_phoneix_download_url, "https://miaojian.weixin.qq.com/download/apps?channel=");
        Log.m105924i("MicroMsg.SecondCutConfig", "SecondCutDownloadUrl: " + Y60);
        C87412m.m108593f(Y60, "url");
        sb.append(Y60);
        sb.append("1101");
        bVar.mo71509c(context, sb.toString());
        aVar.mo85926j("SnsTemplate", "goToMJAppResult", 2);
    }
}
