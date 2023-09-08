package com.tencent.p014mm.pluginsdk.p133ui.tools;

import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.http.HttpWrapperBase;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatHosts;
import com.tencent.p014mm.sdk.platformtools.XmlParser;
import com.tencent.p014mm.storage.C72994y1;
import f40.C86709a0;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map;
import p823sg.C77710q;

/* renamed from: com.tencent.mm.pluginsdk.ui.tools.p1 */
public class C85647p1 {

    /* renamed from: a */
    public static final String f249608a = (HttpWrapperBase.PROTOCAL_HTTPS + WeChatHosts.domainString(C0966R.string.fm_) + "/cgi-bin/getunreadmailcount?f=xml&appname=qqmail_weixin&charset=utf-8&clientip=0");

    /* renamed from: com.tencent.mm.pluginsdk.ui.tools.p1$a */
    public class C85648a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C85652e f249609d;

        public C85648a(C85652e eVar) {
            this.f249609d = eVar;
        }

        public void run() {
            this.f249609d.mo102882a();
        }
    }

    /* renamed from: com.tencent.mm.pluginsdk.ui.tools.p1$b */
    public class C85649b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C85652e f249610d;

        public C85649b(C85652e eVar) {
            this.f249610d = eVar;
        }

        public void run() {
            this.f249610d.mo102882a();
        }
    }

    /* renamed from: com.tencent.mm.pluginsdk.ui.tools.p1$c */
    public class C85650c implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C85652e f249611d;

        public C85650c(C85652e eVar) {
            this.f249611d = eVar;
        }

        public void run() {
            this.f249611d.mo102882a();
        }
    }

    /* renamed from: com.tencent.mm.pluginsdk.ui.tools.p1$d */
    public class C85651d implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C85652e f249612d;

        /* renamed from: e */
        public final /* synthetic */ int f249613e;

        public C85651d(C85652e eVar, int i) {
            this.f249612d = eVar;
            this.f249613e = i;
        }

        public void run() {
            this.f249612d.onSuccess(this.f249613e);
        }
    }

    /* renamed from: com.tencent.mm.pluginsdk.ui.tools.p1$e */
    public interface C85652e {
        /* renamed from: a */
        void mo102882a();

        void onSuccess(int i);
    }

    /* renamed from: a */
    public static void m105757a(C85652e eVar) {
        C72994y1.C72995a aVar = C72994y1.C72995a.USERINFO_QQMAIL_UNREAD_COUNT_INT;
        Log.m105924i("MicroMsg.QQMailUnreadHelper", "dz[getUnreadCount]");
        String str = (String) C86709a0.m107535s().mo121142i().mo119684e(-1535680990, "");
        long longValue = new C77710q(Util.nullAsNil((Integer) C86709a0.m107535s().mo121142i().mo119684e(9, (Object) null))).longValue();
        int i = -1;
        if (Util.isNullOrNil(str) || longValue == 0) {
            C86709a0.m107535s().mo121142i().mo119677K(aVar, -1);
            Log.m105928w("MicroMsg.QQMailUnreadHelper", "dz[getUnreadEmailCountAndSet: authkey or uin is null]");
            MMHandlerThread.postToMainThread(new C85648a(eVar));
            return;
        }
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(f249608a).openConnection();
        httpURLConnection.setConnectTimeout(15000);
        httpURLConnection.setReadTimeout(20000);
        httpURLConnection.setRequestProperty("Cookie", String.format("skey=%s;uin=o%d;", new Object[]{str, Long.valueOf(longValue)}));
        if (httpURLConnection.getResponseCode() >= 300) {
            try {
                httpURLConnection.getInputStream().close();
            } catch (Exception e) {
                Log.m105920e("MicroMsg.QQMailUnreadHelper", e.getMessage());
            }
            httpURLConnection.disconnect();
            Log.m105928w("MicroMsg.QQMailUnreadHelper", "dz[getUnreadCount http 300]");
            MMHandlerThread.postToMainThread(new C85649b(eVar));
            return;
        }
        Map<String, String> parseXml = XmlParser.parseXml(Util.convertStreamToString(httpURLConnection.getInputStream()), "Response", (String) null);
        if (parseXml != null && Util.getInt(parseXml.get(".Response.error.code"), -1) == 0) {
            i = Util.getInt(parseXml.get(".Response.result.UnreadCount"), -1);
        }
        if (i < 0) {
            MMHandlerThread.postToMainThread(new C85650c(eVar));
            return;
        }
        C86709a0.m107535s().mo121142i().mo119677K(aVar, Integer.valueOf(i));
        MMHandlerThread.postToMainThread(new C85651d(eVar, i));
    }
}
