package h32;

import android.database.Cursor;
import android.text.TextUtils;
import b63.C67186g0;
import com.tencent.p014mm.plugin.luckymoney.model.C69242l1;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.XmlParser;
import di3.C86312j;
import e63.C75562i;
import eb0.C86497v5;
import g32.C75846b;
import java.net.URLDecoder;
import java.util.Map;
import ob0.C35136m;
import p281yz.C79173v;
import sf0.C48374j0;

/* renamed from: h32.k */
public class C76134k implements C86497v5.C31521b {
    /* renamed from: C1 */
    public void mo9065C1(C35136m.C35138c cVar) {
        C75846b.zx0().getClass();
    }

    /* renamed from: Y */
    public void mo9066Y(C35136m.C35137a aVar) {
        Cursor query;
        Throwable th;
        C75846b zx02 = C75846b.zx0();
        zx02.getClass();
        Class cls = C79173v.class;
        C67186g0 g0Var = null;
        Map<String, String> parseXml = XmlParser.parseXml(C48374j0.m53718g(aVar.f94242a.f227631h), "sysmsg", (String) null);
        Log.m105924i("MicroMsg.SubCoreLuckyMoney", "helios::::mPayMsgListener");
        if (parseXml == null) {
            Log.m105920e("MicroMsg.SubCoreLuckyMoney", "Resolve msg error");
            return;
        }
        String str = parseXml.get(".sysmsg.paymsg.PayMsgType");
        if (String.valueOf(14).equals(str)) {
            String decode = URLDecoder.decode(parseXml.get(".sysmsg.paymsg.appmsgcontent"));
            if (TextUtils.isEmpty(decode)) {
                Log.m105920e("MicroMsg.SubCoreLuckyMoney", "msgxml illegal");
                return;
            }
            Map<String, String> parseXml2 = XmlParser.parseXml(decode, "msg", (String) null);
            if (parseXml2 == null) {
                Log.m105920e("MicroMsg.SubCoreLuckyMoney", "Resolve appmsgxml error");
                return;
            }
            String str2 = parseXml2.get(".msg.appmsg.wcpayinfo.paymsgid");
            if (Util.isNullOrNil(str2)) {
                Log.m105920e("MicroMsg.SubCoreLuckyMoney", "paymsgid is null");
                return;
            }
            String str3 = parseXml.get(".sysmsg.paymsg.tousername");
            if (Util.isNullOrNil(decode) || Util.isNullOrNil(str3)) {
                Log.m105920e("MicroMsg.SubCoreLuckyMoney", "onRecieveMsg get a illegal msg,which content or toUserName is null");
                return;
            } else if (zx02.Bx0().mo57182a(str2)) {
                Log.m105924i("MicroMsg.SubCoreLuckyMoney", "insert a local msg for luckymoney");
                if (!C69242l1.m81614t(decode, str3, 1)) {
                    zx02.Bx0().mo57183b(str2);
                    return;
                }
                return;
            } else {
                return;
            }
        } else if (String.valueOf(47).equals(str)) {
            String nullAs = Util.nullAs(parseXml.get(".sysmsg.paymsg.OrderId"), "");
            C75562i zx03 = ((C79173v) C86312j.m106911c(cls)).mo109172tc();
            zx03.getClass();
            if (!Util.isNullOrNil(nullAs)) {
                try {
                    query = zx03.f221985d.query("WalletLuckyMoney", new String[]{"*"}, "sendId=?", new String[]{nullAs}, (String) null, (String) null, (String) null, 2);
                    if (query.moveToFirst()) {
                        C67186g0 g0Var2 = new C67186g0();
                        g0Var2.convertFrom(query);
                        query.close();
                        query.close();
                        g0Var = g0Var2;
                    } else {
                        query.close();
                        query.close();
                    }
                } catch (Exception e) {
                    Log.printErrStackTrace("MicroMsg.WalletLuckyMoneyStg", e, "", new Object[0]);
                } catch (Throwable th4) {
                    th.addSuppressed(th4);
                }
            }
            if (g0Var == null) {
                Log.m105929w("MicroMsg.SubCoreLuckyMoney", "can't find sendid: %s", nullAs);
                return;
            }
            g0Var.field_hbStatus = 5;
            ((C79173v) C86312j.m106911c(cls)).mo109172tc().replace(g0Var);
            zx02.Fx0(g0Var.field_sender);
            return;
        } else {
            return;
        }
        throw th;
    }
}
