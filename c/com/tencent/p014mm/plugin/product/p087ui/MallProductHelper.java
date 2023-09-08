package com.tencent.p014mm.plugin.product.p087ui;

import af2.C0036f;
import af2.C39553h;
import af2.C39554i;
import af2.C39555j;
import af2.C39556k;
import af2.C39557l;
import af2.C39558m;
import af2.C39559n;
import af2.C67033e;
import af2.C67036o;
import android.app.Activity;
import android.content.Intent;
import bf2.C67225n;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.WalletPayResultEvent;
import com.tencent.p014mm.plugin.appbrand.jsapi.lab.JsApiGetLabInfo;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import f40.C86709a0;
import fm0.C86977r1;
import ie3.C76331i;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import k20.C9556a;
import nj3.C76879j;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C89137b0;
import ol0.C117802e0;
import te3.C49097d50;
import te3.C49254ea0;
import te3.C49638h1;
import te3.C51858wn3;
import ze2.C79322b;

/* renamed from: com.tencent.mm.plugin.product.ui.MallProductHelper */
public class MallProductHelper implements C11385n {

    /* renamed from: j */
    public static int f202269j;

    /* renamed from: d */
    public Activity f202270d;

    /* renamed from: e */
    public boolean f202271e = false;

    /* renamed from: f */
    public boolean f202272f = false;

    /* renamed from: g */
    public C67033e f202273g;

    /* renamed from: h */
    public C70078a f202274h;

    /* renamed from: i */
    public IListener f202275i = new IListener<WalletPayResultEvent>(C40008f.f107254d) {
        {
            this.__eventId = 520089918;
        }

        public boolean callback(IEvent iEvent) {
            WalletPayResultEvent walletPayResultEvent = (WalletPayResultEvent) iEvent;
            boolean z = false;
            if (walletPayResultEvent instanceof WalletPayResultEvent) {
                WalletPayResultEvent.C67828a aVar = walletPayResultEvent.f194085d;
                if (aVar.f194091f) {
                    Log.m105922f("MicroMsg.MallProductUI", "WalletPayResultEvent is from kinda, ScanQRCodePay");
                } else {
                    z = true;
                    if (aVar.f194088c != -1) {
                        Log.m105924i("MicroMsg.MallProductUI", "MallProduct pay result : cancel");
                    } else if (!MallProductHelper.this.f202272f) {
                        Log.m105924i("MicroMsg.MallProductUI", "MallProduct pay result : ok");
                        MallProductHelper.this.mo96456a();
                        MallProductHelper.this.f202272f = true;
                    }
                }
            } else {
                Log.m105922f("MicroMsg.MallProductUI", "mismatched event");
            }
            return z;
        }
    };

    /* renamed from: com.tencent.mm.plugin.product.ui.MallProductHelper$a */
    public interface C70078a {
        /* renamed from: a */
        void mo96460a(int i, int i2, String str);
    }

    public MallProductHelper(Activity activity, C70078a aVar) {
        this.f202270d = activity;
        this.f202273g = C79322b.vx0().wx0();
        this.f202274h = aVar;
    }

    /* renamed from: a */
    public final void mo96456a() {
        C0036f xx02 = C79322b.vx0().xx0();
        C51858wn3 h = this.f202273g.mo91005h();
        xx02.getClass();
        if (h != null && !Util.isNullOrNil(h.f144161e) && !h.f144161e.contains(";")) {
            ((ArrayList) xx02.f43a).remove(h.f144161e);
            ((ArrayList) xx02.f43a).add(h.f144161e);
            xx02.mo39a();
        }
        Intent intent = new Intent(this.f202270d, MallProductUI.class);
        intent.putExtra("key_go_finish", true);
        intent.addFlags(67108864);
        Activity activity = this.f202270d;
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        Activity activity2 = activity;
        C117292a.m165358d(activity2, aVar.mo10232b(), "com/tencent/mm/plugin/product/ui/MallProductHelper", "doSuccessFinish", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        activity.startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(activity2, "com/tencent/mm/plugin/product/ui/MallProductHelper", "doSuccessFinish", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    /* renamed from: b */
    public void mo96457b(int i, int i2, Intent intent) {
        String str = "";
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    WalletPayResultEvent walletPayResultEvent = new WalletPayResultEvent();
                    WalletPayResultEvent.C67828a aVar = walletPayResultEvent.f194085d;
                    aVar.f194088c = i;
                    aVar.f194086a = intent;
                    this.f202275i.callback(walletPayResultEvent);
                } else if (i == 4) {
                    C70078a aVar2 = this.f202274h;
                    if (aVar2 != null) {
                        aVar2.mo96460a(0, 0, str);
                    }
                } else if (i == 10000) {
                    this.f202270d.showDialog(-10002);
                    C86709a0.m107528h();
                    C89137b0 b0Var = C86709a0.m107529k().f251779b;
                    C67033e eVar = this.f202273g;
                    b0Var.mo123460f(new C39556k(eVar.f192535d, eVar.f192543l));
                }
            } else if (i2 == -1 && intent != null) {
                this.f202273g.mo91015s(intent);
                C86709a0.m107528h();
                C86709a0.m107529k().f251779b.mo123460f(new C39557l(this.f202273g.mo91006i(), f202269j));
            }
        } else if (i2 == -1 && intent != null) {
            this.f202273g.mo91015s(intent);
            C70078a aVar3 = this.f202274h;
            if (aVar3 != null) {
                aVar3.mo96460a(0, 0, str);
            }
            C86709a0.m107528h();
            C89137b0 b0Var2 = C86709a0.m107529k().f251779b;
            C67033e eVar2 = this.f202273g;
            C67036o oVar = eVar2.f192533b;
            if (oVar != null) {
                str = oVar.f192554a;
            }
            b0Var2.mo123460f(new C39554i(str, eVar2.f192535d, eVar2.f192540i));
        }
    }

    /* renamed from: c */
    public void mo96458c() {
        C86709a0.m107528h();
        C86709a0.m107529k().f251779b.mo123455a(553, this);
        C86709a0.m107528h();
        C86709a0.m107529k().f251779b.mo123455a(554, this);
        C86709a0.m107528h();
        C86709a0.m107529k().f251779b.mo123455a(C117802e0.CTRL_INDEX, this);
        C86709a0.m107528h();
        C86709a0.m107529k().f251779b.mo123455a(556, this);
        C86709a0.m107528h();
        C86709a0.m107529k().f251779b.mo123455a(JsApiGetLabInfo.CTRL_INDEX, this);
        C86709a0.m107528h();
        C86709a0.m107529k().f251779b.mo123455a(578, this);
        C86709a0.m107528h();
        C86709a0.m107529k().f251779b.mo123455a(C86977r1.CTRL_INDEX, this);
    }

    /* renamed from: d */
    public void mo96459d() {
        C86709a0.m107528h();
        C86709a0.m107529k().f251779b.mo123470p(553, this);
        C86709a0.m107528h();
        C86709a0.m107529k().f251779b.mo123470p(554, this);
        C86709a0.m107528h();
        C86709a0.m107529k().f251779b.mo123470p(C117802e0.CTRL_INDEX, this);
        C86709a0.m107528h();
        C86709a0.m107529k().f251779b.mo123470p(556, this);
        C86709a0.m107528h();
        C86709a0.m107529k().f251779b.mo123470p(JsApiGetLabInfo.CTRL_INDEX, this);
        C86709a0.m107528h();
        C86709a0.m107529k().f251779b.mo123470p(578, this);
        C86709a0.m107528h();
        C86709a0.m107529k().f251779b.mo123470p(C86977r1.CTRL_INDEX, this);
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        String str2;
        int i3 = i;
        int i4 = i2;
        String str3 = str;
        C117747y yVar2 = yVar;
        Log.m105918d("MicroMsg.MallProductUI", "errCode: " + i4 + ", errMsg: " + str3);
        if (i3 == 0 && i4 == 0) {
            if (yVar2 instanceof C39555j) {
                C39555j jVar = (C39555j) yVar2;
                this.f202273g.mo91017u(jVar.f106186g, jVar.f106187h);
                C70078a aVar = this.f202274h;
                if (aVar != null) {
                    aVar.mo96460a(i3, i4, str3);
                }
                if (!Util.isNullOrNil(jVar.f106186g.f192554a)) {
                    C115669n.INSTANCE.mo160131h(11007, this.f202273g.mo91007j(), jVar.f106186g.f192554a, Integer.valueOf(f202269j), 1);
                } else {
                    C115669n.INSTANCE.mo160131h(11007, this.f202273g.mo91007j(), jVar.f106185f, Integer.valueOf(f202269j), 1);
                }
            } else if (yVar2 instanceof C39557l) {
                C39557l lVar = (C39557l) yVar2;
                C67033e eVar = this.f202273g;
                String str4 = lVar.f106194f;
                LinkedList<C49254ea0> linkedList = lVar.f106195g;
                LinkedList<C49638h1> linkedList2 = lVar.f106196h;
                eVar.f192535d = str4;
                eVar.f192548q = linkedList2;
                eVar.f192547p = linkedList;
                eVar.mo91016t(0);
                Activity activity = this.f202270d;
                Intent intent = new Intent(this.f202270d, MallProductSubmitUI.class);
                C9556a aVar2 = new C9556a();
                aVar2.mo10233c(intent);
                Activity activity2 = activity;
                C117292a.m165358d(activity2, aVar2.mo10232b(), "com/tencent/mm/plugin/product/ui/MallProductHelper", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                activity.startActivity((Intent) aVar2.mo10231a(0));
                C117292a.m165359e(activity2, "com/tencent/mm/plugin/product/ui/MallProductHelper", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                C115669n.INSTANCE.mo160131h(11009, this.f202273g.mo91007j(), this.f202273g.f192533b.f192554a, Integer.valueOf(f202269j), 1);
            } else if (!(yVar2 instanceof C39553h)) {
                if (yVar2 instanceof C39559n) {
                    String str5 = ((C39559n) yVar2).f106201f;
                    int i5 = f202269j == 7 ? 1001 : 6;
                    Log.m105918d("MicroMsg.MallProductUI", "payScene:" + i5);
                    Activity activity3 = this.f202270d;
                    C67225n nVar = this.f202273g.f192533b.f192559f;
                    String str6 = nVar != null ? nVar.f193042d : null;
                    if (!Util.isNullOrNil(str5)) {
                        C76331i.m91761e(activity3, C76331i.m91757a(str5, str6, (String) null, (String) null, i5, 0), 3);
                    }
                    this.f202275i.alive();
                } else if (yVar2 instanceof C39558m) {
                    Activity activity4 = this.f202270d;
                    C76879j.m92726T(activity4, activity4.getString(C0966R.string.god));
                    mo96456a();
                } else if (yVar2 instanceof C39554i) {
                    try {
                        this.f202270d.dismissDialog(-10002);
                    } catch (Exception e) {
                        Log.m105920e("MicroMsg.MallProductUI", e.toString());
                    }
                    C67033e eVar2 = this.f202273g;
                    eVar2.f192547p = ((C39554i) yVar2).f106182f;
                    eVar2.mo91016t(0);
                } else if (yVar2 instanceof C39556k) {
                    try {
                        this.f202270d.dismissDialog(-10002);
                    } catch (Exception e2) {
                        Log.m105920e("MicroMsg.MallProductUI", e2.toString());
                    }
                    C39556k kVar = (C39556k) yVar2;
                    C67033e eVar3 = this.f202273g;
                    String str7 = kVar.f106191g;
                    LinkedList<C49097d50> linkedList3 = kVar.f106190f;
                    eVar3.getClass();
                    if (!Util.isNullOrNil(str7) && linkedList3 != null && linkedList3.size() > 0) {
                        if (eVar3.f192551t == null) {
                            eVar3.f192551t = new HashMap();
                        }
                        ((HashMap) eVar3.f192551t).put(str7, linkedList3);
                    }
                    C70078a aVar3 = this.f202274h;
                    if (aVar3 != null) {
                        aVar3.mo96460a(i3, i4, str3);
                    }
                }
            }
        } else if (i4 != -10010003) {
            Log.m105924i("MicroMsg.MallProductUI", "unkown errCode " + i4);
            if (Util.isNullOrNil(str)) {
                str2 = i4 + " : " + this.f202270d.getString(C0966R.string.gnv);
            } else {
                str2 = str3;
            }
            C70078a aVar4 = this.f202274h;
            if (aVar4 != null) {
                aVar4.mo96460a(i3, i4, str2);
            }
        } else {
            Log.m105924i("MicroMsg.MallProductUI", "deal with MMBIZPAY_FUNC_ERR_NO_EXISTED_PRODUCT");
            if (yVar2 instanceof C39555j) {
                C39555j jVar2 = (C39555j) yVar2;
                this.f202273g.mo91017u(jVar2.f106186g, jVar2.f106187h);
                C70078a aVar5 = this.f202274h;
                if (aVar5 != null) {
                    aVar5.mo96460a(i3, i4, str3);
                }
            }
        }
    }
}
