package sa3;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.plugin.welab.p130ui.WelabAppInfoUI;
import com.tencent.p014mm.protocal.GeneralControlWrapper;
import com.tencent.p014mm.protocal.JsapiPermissionWrapper;
import com.tencent.p014mm.sdk.http.HttpWrapperBase;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatHosts;
import f40.C86709a0;
import f40.C86718e;
import j20.C117292a;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import ke3.C88144b;
import p156gj.C87200o;
import p156gj.C87203t;
import qe3.C89625d;

/* renamed from: sa3.c */
public class C13631c implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ WelabAppInfoUI f38624d;

    public C13631c(WelabAppInfoUI welabAppInfoUI) {
        this.f38624d = welabAppInfoUI;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/welab/ui/WelabAppInfoUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        try {
            int g = C86709a0.m107523b().mo121110g();
            String encode = URLEncoder.encode(C89625d.f257838d, "utf-8");
            String encode2 = URLEncoder.encode("" + Util.getTimeZoneOffset(), "utf-8");
            String encode3 = URLEncoder.encode(C87203t.m108270f(true), "utf-8");
            String encode4 = URLEncoder.encode(C89625d.f257836b, "utf-8");
            String encode5 = URLEncoder.encode(C89625d.f257837c, "utf-8");
            String encode6 = URLEncoder.encode(C87200o.f252872e, "utf-8");
            C86709a0.m107523b();
            String encode7 = URLEncoder.encode(C86718e.m107547e(), "utf-8");
            String encode8 = URLEncoder.encode(Util.getSourceeMd5(MMApplicationContext.getContext()), "utf-8");
            StringBuilder sb = new StringBuilder();
            sb.append("&uin=");
            sb.append(g);
            sb.append("&deviceName=");
            sb.append(encode);
            sb.append("&timeZone=");
            sb.append(encode2);
            sb.append("&imei=");
            sb.append(encode3);
            sb.append("&deviceBrand=");
            sb.append(encode4);
            sb.append("&deviceModel=");
            sb.append(encode5);
            sb.append("&ostype=");
            sb.append(encode6);
            sb.append("&clientSeqID=");
            sb.append(encode7);
            sb.append("&signature=");
            sb.append(encode8);
            sb.append("&scene=");
            sb.append(Util.isNullOrNil("") ? 0 : 1);
            String str = HttpWrapperBase.PROTOCAL_HTTPS + WeChatHosts.domainString(C0966R.string.fmi) + "/cgi-bin/mmsupport-bin/readtemplate?t=feedback/index";
            Intent intent = new Intent();
            intent.putExtra("showShare", false);
            intent.putExtra("rawUrl", (str + "&from=" + URLEncoder.encode(this.f38624d.f347597e.field_expId + "|" + this.f38624d.f347596d) + "&version=" + C89625d.f257841g + "&lang=" + LocaleUtil.getCurrentLanguage(MMApplicationContext.getContext()) + "&" + Util.nullAsNil("") + sb.toString()) + "#/comment/4134");
            intent.putExtra(FFmpegMetadataRetriever.METADATA_KEY_TITLE, "意见反馈");
            intent.putExtra("neverGetA8Key", true);
            intent.putExtra("hardcode_jspermission", JsapiPermissionWrapper.f121047h);
            intent.putExtra("hardcode_general_ctrl", GeneralControlWrapper.f121044e);
            C88144b.m109791i(this.f38624d, "webview", ".ui.tools.WebViewUI", intent, (Bundle) null);
        } catch (UnsupportedEncodingException e) {
            Log.m105921e("WelabAppInfoUI", "[oneliang]UnsupportedEncodingException:%s", e.getMessage());
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/welab/ui/WelabAppInfoUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
