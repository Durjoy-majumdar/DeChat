package r72;

import android.app.Activity;
import android.net.Uri;
import android.util.Base64;
import b63.C113146l;
import com.tencent.kinda.framework.app.KindaConfigCacheStg;
import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.XmlParser;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.wallet_core.model.C86017c0;
import di3.C86301e;
import di3.C86312j;
import eb0.C31543z5;
import ei3.C86522b;
import f40.C86709a0;
import g62.C75875l;
import h81.C32735h;
import ie3.C76328d;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import qe3.C89625d;
import te3.C118476wb3;
import te3.jy4;
import te3.ky4;
import te3.yx4;
import zt3.C119157j;

@C86522b(onProcess = {C80625v0.MATCH_MM})
/* renamed from: r72.b */
public class C77490b extends C86301e implements C76328d {

    /* renamed from: r72.b$a */
    public class C77491a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ int f225952d;

        /* renamed from: e */
        public final /* synthetic */ int f225953e;

        public C77491a(C77490b bVar, int i, int i2) {
            this.f225952d = i;
            this.f225953e = i2;
        }

        public void run() {
            C113146l.m154807e(this.f225952d);
            if (C113146l.m154805c() != null) {
                C115669n.INSTANCE.mo160131h(17162, Integer.valueOf(this.f225953e), C113146l.m154805c().f227799o, C113146l.m154805c().f227798n, C113146l.m154805c().f227800p);
            }
        }
    }

    /* renamed from: r72.b$b */
    public class C77492b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C75875l.C45886e f225954d;

        public C77492b(C75875l.C45886e eVar) {
            this.f225954d = eVar;
        }

        public void run() {
            Map<String, String> parseXml;
            if (!"gh_f0a92aa7146c".equals(this.f225954d.f123844a) || this.f225954d.f123846c.size() == 0) {
                return;
            }
            if (((C32735h) C86312j.m106911c(C32735h.class)).mo58784wf(C32735h.C32737c.clicfg_android_revert_payplugin_topmsg, false)) {
                Log.m105924i("MicroMsg.WxPaySevice", "revert payplugin topmsg abtest is open, return");
                return;
            }
            LinkedList linkedList = new LinkedList();
            Iterator<C72963f4> it = this.f225954d.f123846c.iterator();
            while (it.hasNext()) {
                C72963f4 next = it.next();
                if (next.mo108769t2() != 1 && next.mo101020w3() && next.mo100992d4() && (parseXml = XmlParser.parseXml(next.getContent(), "msg", (String) null)) != null && Util.getInt(parseXml.get(".msg.appmsg.mmreader.template_detail.is_top_msg"), 0) == 1) {
                    String nullAsNil = Util.nullAsNil(parseXml.get(".msg.appmsg.mmreader.template_detail.top_msg_content"));
                    if (!Util.isNullOrNil(nullAsNil)) {
                        jy4 jy4 = new jy4();
                        jy4.f227709d = Long.toString(next.mo108774y2());
                        jy4.f227710e = nullAsNil;
                        jy4.f227711f = C31543z5.m39451a();
                        jy4.f227712g = Util.getLong(parseXml.get(".msg.appmsg.mmreader.template_detail.top_msg_expiration_period_sec"), 0) * 1000;
                        Log.m105925i("MicroMsg.WxPaySevice", "get pay plugin topmsg, svrid is %s, content is %s", jy4.f227709d, jy4.f227710e);
                        linkedList.add(jy4);
                    }
                }
            }
            if (linkedList.size() > 0) {
                C77490b.this.getClass();
                C72994y1.C72995a aVar = C72994y1.C72995a.USERINFO_WALLET_COLLECT_TOPMSG_STRING_SYNC;
                C86709a0.m107528h();
                String str = "";
                String str2 = (String) C86709a0.m107535s().mo121142i().mo119685f(aVar, str);
                ky4 ky4 = new ky4();
                if (Util.isNullOrNil(str2)) {
                    LinkedList<jy4> linkedList2 = new LinkedList<>();
                    Iterator it4 = linkedList.iterator();
                    while (it4.hasNext()) {
                        linkedList2.addFirst((jy4) it4.next());
                        if (linkedList2.size() > 5) {
                            linkedList2.removeLast();
                        }
                    }
                    ky4.f227783d = "gh_f0a92aa7146c";
                    ky4.f227784e = linkedList2;
                } else {
                    try {
                        ky4.parseFrom(str2.getBytes(KindaConfigCacheStg.SAVE_CHARSET));
                    } catch (Exception e) {
                        Log.m105928w("MicroMsg.WxPaySevice", "parse cacheString exp, " + e.getLocalizedMessage());
                    }
                    Iterator it5 = linkedList.iterator();
                    while (it5.hasNext()) {
                        ky4.f227784e.addFirst((jy4) it5.next());
                        if (ky4.f227784e.size() > 5) {
                            ky4.f227784e.removeLast();
                        }
                    }
                }
                try {
                    str = new String(ky4.toByteArray(), KindaConfigCacheStg.SAVE_CHARSET);
                } catch (IOException e2) {
                    Log.m105920e("MicroMsg.WxPaySevice", "save dataString exp, " + e2.getLocalizedMessage());
                }
                C86709a0.m107528h();
                C86709a0.m107535s().mo121142i().mo119677K(aVar, str);
            }
        }
    }

    public C118476wb3 E70() {
        return C113146l.m154806d();
    }

    /* renamed from: Ih */
    public void mo106558Ih(C75875l.C45886e eVar) {
        ((C119157j) C119157j.f356862d).mo183876g(new C77492b(eVar), "PayPlugin_Msg_Handler");
    }

    /* renamed from: Ll */
    public void mo106559Ll(String str, jy4 jy4) {
        ky4 z0;
        C72994y1.C72995a aVar = C72994y1.C72995a.USERINFO_WALLET_COLLECT_TOPMSG_STRING_SYNC;
        if ("gh_f0a92aa7146c".equals(str) && (z0 = mo106563z0(str)) != null && z0.f227784e.size() != 0) {
            int i = 0;
            while (true) {
                if (i >= z0.f227784e.size()) {
                    i = -1;
                    break;
                } else if (z0.f227784e.get(i).f227709d.equals(jy4.f227709d)) {
                    break;
                } else {
                    i++;
                }
            }
            Log.m105925i("MicroMsg.WxPaySevice", "remove pay plugin top msg, index is %s", Integer.valueOf(i));
            if (i != -1) {
                z0.f227784e.remove(i);
            }
            String str2 = "";
            if (z0.f227784e.size() == 0) {
                C86709a0.m107528h();
                C86709a0.m107535s().mo121142i().mo119677K(aVar, str2);
                return;
            }
            try {
                str2 = new String(z0.toByteArray(), KindaConfigCacheStg.SAVE_CHARSET);
            } catch (IOException e) {
                Log.m105920e("MicroMsg.WxPaySevice", "save dataString exp, " + e.getLocalizedMessage());
            }
            C86709a0.m107528h();
            C86709a0.m107535s().mo121142i().mo119677K(aVar, str2);
        }
    }

    /* renamed from: eb */
    public void mo106560eb(Map<String, Object> map, String str, String str2, int i, C76328d.C76329a aVar) {
        Log.m105924i("MicroMsg.WxPaySevice", "start jsapi securetunnel");
        C86017c0 c0Var = new C86017c0(map, str, str2, i, aVar);
        C86709a0.m107528h();
        C86709a0.m107529k().f251779b.mo123460f(c0Var);
    }

    /* renamed from: my */
    public void mo106561my(Activity activity, int i, int i2) {
        Log.m105925i("MicroMsg.WxPaySevice", "reportLocation %s %s", Integer.valueOf(i), Integer.valueOf(i2));
        ((C119157j) C119157j.f356862d).mo183877h(new C77491a(this, i, i2), "wxpay_report_location");
    }

    /* renamed from: si */
    public String mo106562si(String str) {
        byte[] bArr;
        if (Util.isNullOrNil(str)) {
            return null;
        }
        String queryParameter = Uri.parse(str).getQueryParameter("native");
        if (Util.isNullOrNil(queryParameter)) {
            return null;
        }
        Log.m105925i("MicroMsg.WxPaySevice", "hk payurl native param is %s", queryParameter);
        String replace = queryParameter.replace(".", "+").replace("_", "/").replace("-", "=");
        Log.m105925i("MicroMsg.WxPaySevice", "hk payurl native param after replace is %s", replace);
        try {
            bArr = Base64.decode(replace, 0);
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.WxPaySevice", e, "", new Object[0]);
            bArr = null;
        }
        if (Util.isNullOrNil(bArr)) {
            Log.m105924i("MicroMsg.WxPaySevice", "hk payurl native param base64decode null");
            return null;
        }
        yx4 yx4 = new yx4();
        try {
            yx4.parseFrom(bArr);
        } catch (Exception e2) {
            Log.m105928w("MicroMsg.WxPaySevice", "parse nativeInfo exp, " + e2.getLocalizedMessage());
        }
        if (Util.isNullOrNil(yx4.f145566d)) {
            Log.m105924i("MicroMsg.WxPaySevice", "attach is null");
            return null;
        }
        Log.m105925i("MicroMsg.WxPaySevice", "attach is %s, android supprt version is %s", yx4.f145566d, Integer.valueOf(yx4.f145568f));
        if (C89625d.f257841g >= yx4.f145568f) {
            return yx4.f145566d;
        }
        Log.m105924i("MicroMsg.WxPaySevice", "client version small than min version");
        return null;
    }

    /* renamed from: z0 */
    public ky4 mo106563z0(String str) {
        if (!"gh_f0a92aa7146c".equals(str)) {
            return null;
        }
        if (((C32735h) C86312j.m106911c(C32735h.class)).mo58784wf(C32735h.C32737c.clicfg_android_revert_payplugin_topmsg, false)) {
            Log.m105924i("MicroMsg.WxPaySevice", "revert payplugin topmsg abtest is open, return null");
            return null;
        }
        C86709a0.m107528h();
        String str2 = (String) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_WALLET_COLLECT_TOPMSG_STRING_SYNC, "");
        ky4 ky4 = new ky4();
        if (Util.isNullOrNil(str2)) {
            return null;
        }
        try {
            ky4.parseFrom(str2.getBytes(KindaConfigCacheStg.SAVE_CHARSET));
        } catch (Exception e) {
            Log.m105928w("MicroMsg.WxPaySevice", "parse cacheString exp, " + e.getLocalizedMessage());
        }
        return ky4;
    }
}
