package dy1;

import android.content.Context;
import android.content.DialogInterface;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.downloader.model.C40935l;
import com.tencent.p014mm.plugin.lite.api.C4770c;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.NetStatusUtil;
import com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyEnum;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import di3.C86312j;
import nj3.C76879j;
import org.json.JSONObject;
import p237sp.C13747c0;
import p237sp.C13754y;
import p237sp.C48456t;
import p237sp.C48457w;
import p680ru.C77570i;
import p749xh.C53352w2;
import y41.C53493b;

/* renamed from: dy1.p */
public class C7563p extends C4770c {

    /* renamed from: dy1.p$a */
    public class C7564a implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ JSONObject f25831d;

        /* renamed from: e */
        public final /* synthetic */ long f25832e;

        public C7564a(JSONObject jSONObject, long j) {
            this.f25831d = jSONObject;
            this.f25832e = j;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            C7563p.this.mo8669q(this.f25831d, this.f25832e);
            dialogInterface.dismiss();
        }
    }

    /* renamed from: dy1.p$b */
    public class C7565b implements DialogInterface.OnClickListener {
        public C7565b() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
            C7563p.this.f19815f.mo5689a("fail_network_not_wifi");
        }
    }

    /* renamed from: a */
    public void mo5693a(String str, JSONObject jSONObject, boolean z) {
        JSONObject jSONObject2 = jSONObject;
        Class cls = C48456t.class;
        long optLong = jSONObject2.optLong("download_id");
        if (optLong <= 0) {
            Log.m105920e("LiteAppJsApiResumeDownloadTask", "fail, invalid downloadId = " + optLong);
            this.f19815f.mo5689a("invalid_downloadid");
            return;
        }
        int optInt = jSONObject2.optInt(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 1000);
        int optInt2 = jSONObject2.optInt("uiarea");
        int optInt3 = jSONObject2.optInt("notice_id");
        int optInt4 = jSONObject2.optInt(TPDownloadProxyEnum.USER_SSID);
        boolean z2 = true;
        int optInt5 = jSONObject2.optInt("download_type", 1);
        if (jSONObject2.optInt("ignoreNetwork", 0) != 1) {
            z2 = false;
        }
        C53352w2 nh = ((C48456t) C86312j.m106911c(cls)).mo72824nh(optLong);
        nh.field_scene = optInt;
        nh.field_uiarea = optInt2;
        nh.field_noticeId = optInt3;
        nh.field_ssid = optInt4;
        nh.field_downloadType = optInt5;
        ((C48456t) C86312j.m106911c(cls)).mo72823NW(nh);
        C53493b bVar = new C53493b();
        bVar.mo74165a(nh);
        bVar.f150424j = 0;
        ((C48457w) C86312j.m106911c(C48457w.class)).mo72829tX(10, bVar);
        boolean optBoolean = jSONObject2.optBoolean("use_downloader_widget", false);
        boolean optBoolean2 = jSONObject2.optBoolean("download_in_wifi", false);
        Context context = MMApplicationContext.getContext();
        if (optBoolean) {
            ((C13747c0) C86312j.m106911c(C13747c0.class)).mo13112em(MMApplicationContext.getContext(), optLong, optBoolean2, z2, new C7566q(this));
            ((C77570i) C86312j.m106911c(C77570i.class)).mo107725zI(10, "LuggageGameWebViewUI_resumeDownloadTask", hashCode());
        } else if (NetStatusUtil.isWifi(context)) {
            mo8669q(jSONObject2, optLong);
        } else {
            C76879j.m92710D(context, context.getString(C0966R.string.lfa), context.getString(C0966R.string.lfb), context.getString(C0966R.string.lf6), context.getString(C0966R.string.f7926wf), false, new C7564a(jSONObject2, optLong), new C7565b(), C0966R.color.akw);
        }
    }

    /* renamed from: q */
    public final void mo8669q(JSONObject jSONObject, long j) {
        Class cls = C48456t.class;
        C53352w2 nh = ((C48456t) C86312j.m106911c(cls)).mo72824nh(j);
        if (nh != null && nh.field_fromDownloadApp) {
            nh.field_fromDownloadApp = false;
            nh.field_showNotification = true;
            ((C48456t) C86312j.m106911c(cls)).mo72823NW(nh);
        }
        if (((C40935l) ((C13754y) C86312j.m106911c(C13754y.class)).Ds0()).mo63972t(j)) {
            this.f19815f.mo5690b();
        } else {
            this.f19815f.mo5689a("fail");
        }
        ((C77570i) C86312j.m106911c(C77570i.class)).mo107725zI(10, "LuggageGameWebViewUI_resumeDownloadTask", hashCode());
    }
}
