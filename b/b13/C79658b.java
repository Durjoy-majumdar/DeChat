package b13;

import android.content.SharedPreferences;
import b13.C79646a;
import com.tencent.p014mm.pointers.PByteArray;
import com.tencent.p014mm.sdk.http.HttpWrapperBase;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import p156gj.C87200o;
import qe3.C89625d;

/* renamed from: b13.b */
public class C79658b implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ int f233562d;

    /* renamed from: e */
    public final /* synthetic */ String f233563e;

    /* renamed from: f */
    public final /* synthetic */ PByteArray f233564f;

    /* renamed from: g */
    public final /* synthetic */ C79646a.C79653g f233565g;

    public C79658b(C79646a.C79653g gVar, int i, String str, PByteArray pByteArray) {
        this.f233565g = gVar;
        this.f233562d = i;
        this.f233563e = str;
        this.f233564f = pByteArray;
    }

    public void run() {
        SharedPreferences sharedPreferences = MMApplicationContext.getContext().getSharedPreferences("system_config_prefs", 0);
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append((HttpWrapperBase.PROTOCAL_HTTPS + sharedPreferences.getString("support.weixin.qq.com", "support.weixin.qq.com")) + "/cgi-bin/mmsupport-bin/stackreport?version=");
        stringBuffer.append(Integer.toHexString(C89625d.f257841g));
        stringBuffer.append("&devicetype=");
        stringBuffer.append(C87200o.f252868a);
        stringBuffer.append("&filelength=");
        stringBuffer.append(this.f233562d);
        stringBuffer.append("&sum=");
        stringBuffer.append(this.f233563e);
        stringBuffer.append("&reporttype=");
        stringBuffer.append(4);
        String str = C79646a.this.f233543d;
        if (str != null && !str.equals("")) {
            stringBuffer.append("&username=");
            stringBuffer.append(C79646a.this.f233543d);
        }
        Log.m105918d("MicroMsg.MMTraceRoute", "traceroute report url:" + stringBuffer.toString());
        C79646a.C79653g.m96751a(this.f233565g, stringBuffer.toString(), this.f233564f.value);
    }
}
