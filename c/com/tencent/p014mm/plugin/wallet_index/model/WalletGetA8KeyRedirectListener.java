package com.tencent.p014mm.plugin.wallet_index.model;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.tencent.mars.smc.IDKey;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.GetA8KeyRedirectEvent;
import com.tencent.p014mm.autogen.events.PayAuthNativeEvent;
import com.tencent.p014mm.autogen.events.WalletPayResultEvent;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.pluginsdk.wallet.PayInfo;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.http.HttpWrapperBase;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.NetStatusUtil;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatHosts;
import com.tencent.p014mm.wallet_core.model.C75136r0;
import di3.C86312j;
import f40.C86709a0;
import fr3.C75792n;
import ie3.C76324c;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.regex.Pattern;
import ke3.C88144b;
import n63.C76845p;
import nj3.C76879j;
import ob0.C11385n;
import ob0.C117747y;
import p728vs.C52991e;
import yq3.C79144b;

/* renamed from: com.tencent.mm.plugin.wallet_index.model.WalletGetA8KeyRedirectListener */
public class WalletGetA8KeyRedirectListener extends IListener<WalletPayResultEvent> implements C11385n {

    /* renamed from: i */
    public static final String f210967i = (HttpWrapperBase.PROTOCAL_HTTP + WeChatHosts.domainString(C0966R.string.fm7) + "?");

    /* renamed from: j */
    public static final String f210968j = (HttpWrapperBase.PROTOCAL_HTTP + WeChatHosts.domainString(C0966R.string.fm6) + "?");

    /* renamed from: d */
    public int f210969d;

    /* renamed from: e */
    public int f210970e = 0;

    /* renamed from: f */
    public GetA8KeyRedirectEvent f210971f;

    /* renamed from: g */
    public Queue<PayAuthNativeEvent> f210972g;

    /* renamed from: h */
    public long f210973h;

    /* renamed from: com.tencent.mm.plugin.wallet_index.model.WalletGetA8KeyRedirectListener$a */
    public class C72528a implements DialogInterface.OnClickListener {
        public C72528a() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            GetA8KeyRedirectEvent getA8KeyRedirectEvent = WalletGetA8KeyRedirectListener.this.f210971f;
            Runnable runnable = getA8KeyRedirectEvent.callback;
            if (runnable != null) {
                getA8KeyRedirectEvent.f107574e.f107579a = 1;
                runnable.run();
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet_index.model.WalletGetA8KeyRedirectListener$b */
    public class C72529b implements DialogInterface.OnClickListener {
        public C72529b() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            GetA8KeyRedirectEvent getA8KeyRedirectEvent = WalletGetA8KeyRedirectListener.this.f210971f;
            Runnable runnable = getA8KeyRedirectEvent.callback;
            if (runnable != null) {
                getA8KeyRedirectEvent.f107574e.f107579a = 1;
                runnable.run();
            }
        }
    }

    public WalletGetA8KeyRedirectListener() {
        super(C40008f.f107254d);
        this.__eventId = 520089918;
    }

    public boolean callback(IEvent iEvent) {
        boolean z;
        WalletPayResultEvent walletPayResultEvent = (WalletPayResultEvent) iEvent;
        C75136r0.f221075a = System.currentTimeMillis();
        boolean z2 = false;
        if (walletPayResultEvent != null) {
            StringBuilder sb = new StringBuilder();
            sb.append("onPayEnd, isOk = ");
            sb.append(walletPayResultEvent.f194085d.f194088c == -1);
            sb.append(", the event is ");
            sb.append(walletPayResultEvent);
            Log.m105918d("MicroMsg.WalletGetA8KeyRedirectListener", sb.toString());
            if (walletPayResultEvent.f194085d.f194088c == -1) {
                Intent intent = new Intent();
                intent.addFlags(67108864);
                Intent intent2 = walletPayResultEvent.f194085d.f194086a;
                if (intent2 == null || intent2.getIntExtra("pay_channel", 0) != 13) {
                    C88144b.m109801s(MMApplicationContext.getContext(), ".ui.LauncherUI", intent, (Bundle) null);
                } else {
                    Log.m105924i("MicroMsg.WalletGetA8KeyRedirectListener", "channel is MMPAY_CHANNEL_SCAN_QRCODE_IMAGE_CHANNEL ，return org page");
                }
                z = true;
            } else {
                z = false;
            }
            if (walletPayResultEvent.f194085d.f194091f) {
                Queue<PayAuthNativeEvent> queue = this.f210972g;
                if (queue != null && ((LinkedList) queue).size() > 0) {
                    PayAuthNativeEvent payAuthNativeEvent = (PayAuthNativeEvent) ((LinkedList) this.f210972g).poll();
                    Log.m105924i("MicroMsg.WalletGetA8KeyRedirectListener", "One PayAuthNativeEvent has been consumed, and the size of mKindaAuthNativeEventQueue is " + ((LinkedList) this.f210972g).size());
                    int i = walletPayResultEvent.f194085d.f194088c;
                    if (i == 0) {
                        payAuthNativeEvent.f193808e.f193820a = 1;
                    } else if (i == 3) {
                        payAuthNativeEvent.f193808e.f193820a = 2;
                    }
                    MMHandlerThread.postToMainThread(new C76845p(this, payAuthNativeEvent));
                    z2 = true;
                } else if (this.f210972g != null) {
                    Log.m105920e("MicroMsg.WalletGetA8KeyRedirectListener", "The state of mKindaAuthNativeEventQueue is error! it's empty!");
                } else {
                    Log.m105920e("MicroMsg.WalletGetA8KeyRedirectListener", "The state of mKindaAuthNativeEventQueue is error! it is null!");
                }
            } else {
                z2 = z;
            }
        }
        Log.m105922f("MicroMsg.WalletGetA8KeyRedirectListener", "mismatched event");
        if (!z2 || ((LinkedList) this.f210972g).size() > 0) {
            Log.m105924i("MicroMsg.WalletGetA8KeyRedirectListener", "event isn't consumed, isDealEvent: " + z2 + ", and mKindaAuthNativeEventQueue.size(): " + ((LinkedList) this.f210972g).size());
        } else {
            dead();
            Log.m105924i("MicroMsg.WalletGetA8KeyRedirectListener", "event is finish and consumed");
        }
        return z2;
    }

    /* renamed from: e */
    public final void mo99932e(int i, int i2, long j) {
        int i3 = this.f210969d == 1 ? 163 : 132;
        ArrayList arrayList = new ArrayList();
        IDKey iDKey = new IDKey();
        iDKey.SetID(i3);
        iDKey.SetValue(1);
        iDKey.SetKey(26);
        arrayList.add(iDKey);
        if (!(i == 0 && i2 == 0)) {
            IDKey iDKey2 = new IDKey();
            iDKey2.SetID(i3);
            iDKey2.SetValue(1);
            IDKey iDKey3 = new IDKey();
            iDKey3.SetID(i3);
            iDKey3.SetValue(1);
            iDKey2.SetKey(8);
            if (i2 < 0) {
                iDKey3.SetKey(9);
            } else if (i2 > 0) {
                iDKey3.SetKey(10);
            }
        }
        if (this.f210969d == 4 && j > 0) {
            IDKey iDKey4 = new IDKey();
            iDKey4.SetID(i3);
            iDKey4.SetValue(1);
            IDKey iDKey5 = new IDKey();
            iDKey5.SetID(i3);
            iDKey5.SetValue(1);
            IDKey iDKey6 = new IDKey();
            iDKey6.SetID(i3);
            iDKey6.SetValue((long) ((int) j));
            iDKey4.SetKey(0);
            int i4 = (j > 1000 ? 1 : (j == 1000 ? 0 : -1));
            if (i4 <= 0) {
                iDKey5.SetKey(1);
                iDKey6.SetKey(4);
            } else if (i4 > 0 && j <= 3000) {
                iDKey5.SetKey(2);
                iDKey6.SetKey(5);
            } else if (j > 3000) {
                iDKey5.SetKey(3);
                iDKey6.SetKey(6);
            }
            arrayList.add(iDKey4);
            arrayList.add(iDKey5);
            arrayList.add(iDKey6);
        }
        C115669n.INSTANCE.mo160124a(arrayList, true);
    }

    /* renamed from: f */
    public final void mo99933f(String str, int i) {
        Log.m105918d("MicroMsg.WalletGetA8KeyRedirectListener", "startPay reqKey = " + str);
        PayInfo payInfo = new PayInfo();
        payInfo.f212587e = this.f210969d;
        String str2 = null;
        String str3 = null;
        for (String str4 : str.replace(f210968j, "").split("&")) {
            if (str4.startsWith("errcode=")) {
                str2 = str4.replace("errcode=", "");
            } else if (str4.startsWith("errmsg=")) {
                str3 = str4.replace("errmsg=", "");
            } else if (str4.startsWith("reqkey=")) {
                payInfo.f212592j = str4.replace("reqkey=", "");
            } else if (str4.startsWith("uuid=")) {
                payInfo.f212593n = str4.replace("uuid=", "");
            } else if (str4.startsWith("appid=")) {
                payInfo.f212594o = str4.replace("appid=", "");
            } else if (str4.startsWith("appsource=")) {
                payInfo.f212595p = str4.replace("appsource=", "");
            } else if (str4.startsWith("productid=")) {
                payInfo.f212598s = str4.replace("productid=", "");
            }
        }
        payInfo.f212589g = i;
        if ("0".equals(str2)) {
            C79144b.m95773a().getClass();
            ((C76324c) C86312j.m106911c(C76324c.class)).startWxpayQueryCashierPay(payInfo.f212592j, payInfo.f212587e, payInfo.f212589g);
            GetA8KeyRedirectEvent getA8KeyRedirectEvent = this.f210971f;
            Runnable runnable = getA8KeyRedirectEvent.callback;
            if (runnable != null) {
                getA8KeyRedirectEvent.f107574e.f107579a = 1;
                runnable.run();
            }
        } else {
            if (Util.isNullOrNil(str3)) {
                str3 = this.f210971f.f107573d.f107577c.getString(C0966R.string.l_3);
            }
            C76879j.m92749t(this.f210971f.f107573d.f107577c, str3, "", new C72529b());
        }
        if (!TextUtils.isEmpty(str2) && Pattern.compile("[0-9]*").matcher(str2).matches()) {
            mo99932e(0, Integer.valueOf(str2).intValue(), 0);
        }
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        if (yVar instanceof C52991e) {
            long currentTimeMillis = System.currentTimeMillis() - this.f210973h;
            C115669n.INSTANCE.mo160131h(11170, 233, 0, Long.valueOf(currentTimeMillis), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(NetStatusUtil.getNetType(MMApplicationContext.getContext())), "");
            mo99932e(i, i2, currentTimeMillis);
            Log.m105918d("MicroMsg.WalletGetA8KeyRedirectListener", "onSceneEnd errType = " + i + ", errCode = " + i2 + ",errMsg = " + str);
            C86709a0.m107528h();
            C86709a0.m107529k().f251779b.mo123470p(233, this);
            if (i == 0 && i2 == 0) {
                mo99933f(((C52991e) yVar).mo63062R(), this.f210970e);
                return;
            }
            if (Util.isNullOrNil(str)) {
                str = this.f210971f.f107573d.f107577c.getString(C0966R.string.l_3);
            }
            C76879j.m92749t(this.f210971f.f107573d.f107577c, str, "", new C72528a());
        } else if (yVar instanceof C75792n) {
            Log.m105919d("MicroMsg.WalletGetA8KeyRedirectListener", "native auth, errType: %d, errCode: %d", Integer.valueOf(i), Integer.valueOf(i2));
            C86709a0.m107528h();
            C86709a0.m107529k().f251779b.mo123470p(385, this);
            if (i == 0 && i2 == 0 && "0".equals(((C75792n) yVar).f222399d)) {
                throw null;
            }
            throw null;
        } else {
            Log.m105924i("MicroMsg.WalletGetA8KeyRedirectListener", "other scene");
        }
    }
}
