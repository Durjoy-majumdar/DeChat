package l63;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.GetA8KeyRedirectEvent;
import com.tencent.p014mm.autogen.events.PayAuthNativeEvent;
import com.tencent.p014mm.plugin.wallet_index.model.WalletGetA8KeyRedirectListener;
import com.tencent.p014mm.sdk.event.EventCenter;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import f40.C86709a0;
import ie3.C76324c;
import java.util.LinkedList;
import ke3.C88144b;
import n63.C76844o;
import nj3.C76879j;
import ob0.C117747y;
import p728vs.C52990d;
import p728vs.C52991e;
import qe3.C12212g;
import yq3.C79144b;

/* renamed from: l63.b */
public class C76671b extends IStaticListener<IEvent> {

    /* renamed from: d */
    public final WalletGetA8KeyRedirectListener f224357d = new WalletGetA8KeyRedirectListener();

    public boolean callback(IEvent iEvent) {
        if (iEvent instanceof GetA8KeyRedirectEvent) {
            WalletGetA8KeyRedirectListener walletGetA8KeyRedirectListener = this.f224357d;
            GetA8KeyRedirectEvent getA8KeyRedirectEvent = (GetA8KeyRedirectEvent) iEvent;
            walletGetA8KeyRedirectListener.f210971f = getA8KeyRedirectEvent;
            GetA8KeyRedirectEvent.C40113a aVar = getA8KeyRedirectEvent.f107573d;
            String str = aVar.f107576b;
            Bundle bundle = aVar.f107578d;
            if (bundle != null) {
                walletGetA8KeyRedirectListener.f210970e = bundle.getInt("pay_channel", 0);
            }
            switch (walletGetA8KeyRedirectListener.f210971f.f107573d.f107575a) {
                case 10:
                case 11:
                    if (!EventCenter.instance.hadListened(walletGetA8KeyRedirectListener)) {
                        walletGetA8KeyRedirectListener.alive();
                    }
                    Log.m105918d("MicroMsg.WalletGetA8KeyRedirectListener", "ReqKey = " + str);
                    if (str != null) {
                        if (!str.startsWith("weixin://wxpay")) {
                            walletGetA8KeyRedirectListener.f210969d = 1;
                            walletGetA8KeyRedirectListener.mo99933f(str, walletGetA8KeyRedirectListener.f210970e);
                            break;
                        } else {
                            walletGetA8KeyRedirectListener.f210969d = 4;
                            C86709a0.m107528h();
                            C86709a0.m107529k().f251779b.mo123455a(233, walletGetA8KeyRedirectListener);
                            walletGetA8KeyRedirectListener.f210971f.f107573d.getClass();
                            C52991e xD = ((C52990d) C86312j.m106911c(C52990d.class)).mo73579xD(str, (String) null, 4, 0, C12212g.m11775a(), new byte[0]);
                            C86709a0.m107528h();
                            C86709a0.m107529k().f251779b.mo123460f((C117747y) xD);
                            walletGetA8KeyRedirectListener.f210973h = System.currentTimeMillis();
                            break;
                        }
                    }
                    break;
                case 12:
                    Log.m105918d("MicroMsg.WalletGetA8KeyRedirectListener", "startBind reqKey = " + str);
                    String str2 = null;
                    String str3 = null;
                    String str4 = null;
                    for (String str5 : str.replace(WalletGetA8KeyRedirectListener.f210967i, "").split("&")) {
                        if (str5.startsWith("errcode=")) {
                            str2 = str5.replace("errcode=", "");
                        } else if (str5.startsWith("errmsg=")) {
                            str4 = str5.replace("errmsg=", "");
                        } else if (str5.startsWith("importkey=")) {
                            str3 = str5.replace("importkey=", "");
                        }
                    }
                    if ("0".equals(str2) && !Util.isNullOrNil(str3)) {
                        Context context = walletGetA8KeyRedirectListener.f210971f.f107573d.f107577c;
                        Intent intent = new Intent();
                        intent.putExtra("key_import_key", str3);
                        intent.putExtra("key_req_bind_scene", 2);
                        intent.putExtra("key_custom_bind_tips", (String) null);
                        C88144b.m109791i(context, "wallet", ".bind.ui.WalletBindUI", intent, (Bundle) null);
                        GetA8KeyRedirectEvent getA8KeyRedirectEvent2 = walletGetA8KeyRedirectListener.f210971f;
                        Runnable runnable = getA8KeyRedirectEvent2.callback;
                        if (runnable != null) {
                            getA8KeyRedirectEvent2.f107574e.f107579a = 1;
                            runnable.run();
                            break;
                        }
                    } else {
                        if (Util.isNullOrNil(str4)) {
                            str4 = walletGetA8KeyRedirectListener.f210971f.f107573d.f107577c.getString(C0966R.string.l_3);
                        }
                        C76879j.m92749t(walletGetA8KeyRedirectListener.f210971f.f107573d.f107577c, str4, "", new C76844o(walletGetA8KeyRedirectListener));
                        break;
                    }
                    break;
                default:
                    return false;
            }
            return true;
        }
        if (iEvent instanceof PayAuthNativeEvent) {
            WalletGetA8KeyRedirectListener walletGetA8KeyRedirectListener2 = this.f224357d;
            PayAuthNativeEvent payAuthNativeEvent = (PayAuthNativeEvent) iEvent;
            walletGetA8KeyRedirectListener2.getClass();
            C79144b.m95773a().getClass();
            if (walletGetA8KeyRedirectListener2.f210972g == null) {
                walletGetA8KeyRedirectListener2.f210972g = new LinkedList();
            }
            ((LinkedList) walletGetA8KeyRedirectListener2.f210972g).offer(payAuthNativeEvent);
            if (!EventCenter.instance.hadListened(walletGetA8KeyRedirectListener2)) {
                walletGetA8KeyRedirectListener2.alive();
            }
            Bundle bundle2 = new Bundle();
            bundle2.putInt("a8key_scene", payAuthNativeEvent.f193807d.f193810b);
            bundle2.putString("qrcode_url", payAuthNativeEvent.f193807d.f193809a);
            bundle2.putInt("channel", payAuthNativeEvent.f193807d.f193811c);
            bundle2.putInt("chat_type", payAuthNativeEvent.f193807d.f193815g);
            bundle2.putInt("send_type", payAuthNativeEvent.f193807d.f193816h);
            bundle2.putInt("qrcode_session_type", payAuthNativeEvent.f193807d.f193817i);
            bundle2.putString("qrcode_session_name", payAuthNativeEvent.f193807d.f193818j);
            bundle2.putString("qrcode_timeline_objid", payAuthNativeEvent.f193807d.f193819k);
            ((C76324c) C86312j.m106911c(C76324c.class)).startScanQRCodePay(payAuthNativeEvent.f193807d.f193812d, bundle2);
        }
        return false;
    }
}
