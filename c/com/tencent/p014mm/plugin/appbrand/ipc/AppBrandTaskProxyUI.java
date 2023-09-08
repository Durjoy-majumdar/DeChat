package com.tencent.p014mm.plugin.appbrand.ipc;

import android.content.Context;
import android.webkit.ValueCallback;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.miniutil.MiniReaderConstants;
import com.tencent.p014mm.plugin.appbrand.ipc.MMToClientEvent;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.system.AndroidMediaUtil;
import di3.C86312j;
import p159gw.C98250h;
import p910lj.C76701a;
import qp0.C89783a;
import s00.C110692d;
import s00.C110693e;

/* renamed from: com.tencent.mm.plugin.appbrand.ipc.AppBrandTaskProxyUI */
public class AppBrandTaskProxyUI extends AppBrandProcessProxyUI {

    /* renamed from: A */
    public ValueCallback<Integer> f49245A = new C17866a(this);

    /* renamed from: B */
    public MMToClientEvent.C81947d f49246B = new C17867b();

    /* renamed from: p */
    public C89783a f49247p;

    /* renamed from: q */
    public String f49248q = "";

    /* renamed from: r */
    public String f49249r = "";

    /* renamed from: s */
    public String f49250s = "";

    /* renamed from: t */
    public String f49251t = "";

    /* renamed from: u */
    public String f49252u = "";

    /* renamed from: v */
    public boolean f49253v;

    /* renamed from: w */
    public boolean f49254w = true;

    /* renamed from: x */
    public boolean f49255x = false;

    /* renamed from: y */
    public ValueCallback<Integer> f49256y = null;

    /* renamed from: z */
    public ValueCallback<String> f49257z = null;

    /* renamed from: com.tencent.mm.plugin.appbrand.ipc.AppBrandTaskProxyUI$a */
    public class C17866a implements ValueCallback<Integer> {
        public C17866a(AppBrandTaskProxyUI appBrandTaskProxyUI) {
        }

        public void onReceiveValue(Object obj) {
            Log.m105925i("MicroMsg.AppBrandTaskProxyUI", "updateRetCallback onReceiveValue ret = %d", (Integer) obj);
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.ipc.AppBrandTaskProxyUI$b */
    public class C17867b implements MMToClientEvent.C81947d {

        /* renamed from: com.tencent.mm.plugin.appbrand.ipc.AppBrandTaskProxyUI$b$a */
        public class C17868a implements C98250h.C98251a {
            public C17868a() {
            }

            /* renamed from: a */
            public void mo2055a(String str, String str2) {
                AppBrandTaskProxyUI appBrandTaskProxyUI = AppBrandTaskProxyUI.this;
                C76701a.makeText((Context) appBrandTaskProxyUI, (CharSequence) appBrandTaskProxyUI.getString(C0966R.string.k3c, new Object[]{AndroidMediaUtil.getFriendlySdcardPath(str2)}), 1).show();
            }

            /* renamed from: b */
            public void mo2056b(String str, String str2) {
                AppBrandTaskProxyUI appBrandTaskProxyUI = AppBrandTaskProxyUI.this;
                C76701a.makeText((Context) appBrandTaskProxyUI, (CharSequence) appBrandTaskProxyUI.getString(C0966R.string.k3b), 1).show();
            }
        }

        public C17867b() {
        }

        /* renamed from: a */
        public void mo22085a(Object obj) {
            Object obj2 = obj;
            Class cls = C110693e.class;
            if (obj2 instanceof MiniReaderConstants.MiniQbFloatBallMenuActionBrandEvent) {
                MiniReaderConstants.MiniQbFloatBallMenuActionBrandEvent miniQbFloatBallMenuActionBrandEvent = (MiniReaderConstants.MiniQbFloatBallMenuActionBrandEvent) obj2;
                if (miniQbFloatBallMenuActionBrandEvent != null) {
                    AppBrandTaskProxyUI appBrandTaskProxyUI = AppBrandTaskProxyUI.this;
                    if (appBrandTaskProxyUI.f49247p != null) {
                        if (!Util.isEqual(miniQbFloatBallMenuActionBrandEvent.f48958e, appBrandTaskProxyUI.f49249r)) {
                            Log.m105921e("MicroMsg.AppBrandTaskProxyUI", "MiniQbFloatBallMenuActionEvent event.filePath:%s filePath:%s", miniQbFloatBallMenuActionBrandEvent.f48958e, AppBrandTaskProxyUI.this.f49249r);
                            return;
                        }
                        Log.m105925i("MicroMsg.AppBrandTaskProxyUI", "MiniQbFloatBallMenuActionEvent event.action:%s", Integer.valueOf(miniQbFloatBallMenuActionBrandEvent.f48957d));
                        int i = miniQbFloatBallMenuActionBrandEvent.f48957d;
                        if (i != 1) {
                            if (i == 2) {
                                AppBrandTaskProxyUI.this.f49247p.mo124068H(false, 1);
                                AppBrandTaskProxyUI appBrandTaskProxyUI2 = AppBrandTaskProxyUI.this;
                                if (appBrandTaskProxyUI2.f49255x) {
                                    AppBrandTaskProxyUI appBrandTaskProxyUI3 = AppBrandTaskProxyUI.this;
                                    ((C110693e) C86312j.m106911c(cls)).mo161955N8(false, false, appBrandTaskProxyUI3, appBrandTaskProxyUI3.f49249r, appBrandTaskProxyUI3.f49252u, appBrandTaskProxyUI3.f49250s, appBrandTaskProxyUI3.f49251t, 10, appBrandTaskProxyUI3.f49257z, appBrandTaskProxyUI3.f49245A, true, appBrandTaskProxyUI3.f49248q);
                                    return;
                                }
                                appBrandTaskProxyUI2.f49254w = false;
                                AppBrandTaskProxyUI appBrandTaskProxyUI4 = AppBrandTaskProxyUI.this;
                                ((C110692d) C86312j.m106911c(C110692d.class)).mo35325SN(appBrandTaskProxyUI4, appBrandTaskProxyUI4.f49251t, appBrandTaskProxyUI4.f49249r);
                                AppBrandTaskProxyUI appBrandTaskProxyUI5 = AppBrandTaskProxyUI.this;
                                ((C110693e) C86312j.m106911c(cls)).mo161957jy(false, false, false, false, appBrandTaskProxyUI5, appBrandTaskProxyUI5.f49249r, appBrandTaskProxyUI5.f49252u, appBrandTaskProxyUI5.f49250s, appBrandTaskProxyUI5.f49251t, 10, appBrandTaskProxyUI5.f49257z, appBrandTaskProxyUI5.f49256y, true, appBrandTaskProxyUI5.f49248q, appBrandTaskProxyUI5.f49253v);
                                return;
                            } else if (i == 4) {
                                AppBrandTaskProxyUI appBrandTaskProxyUI6 = AppBrandTaskProxyUI.this;
                                ((C98250h) C86312j.m106911c(C98250h.class)).pk0(appBrandTaskProxyUI6, appBrandTaskProxyUI6.f49249r, new C17868a());
                                return;
                            } else if (i != 8) {
                                return;
                            }
                        }
                        AppBrandTaskProxyUI.this.f49247p.mo124068H(true, 1);
                        return;
                    }
                }
                Log.m105920e("MicroMsg.AppBrandTaskProxyUI", "MiniQbFloatBallMenuActionEvent fail");
            }
        }
    }

    public void onDestroy() {
        super.onDestroy();
        C89783a aVar = this.f49247p;
        if (aVar != null) {
            aVar.getClass();
            ((C110692d) C86312j.m106911c(C110692d.class)).mo35325SN(this, this.f49251t, this.f49249r);
        }
        MMToClientEvent.m100657u(this.f49248q, this.f49246B);
    }

    public void onPause() {
        super.onPause();
        C89783a aVar = this.f49247p;
        if (aVar != null) {
            aVar.mo74189F();
        }
    }

    public void onResume() {
        super.onResume();
        C89783a aVar = this.f49247p;
        if (aVar != null) {
            aVar.mo74188E();
        }
    }
}
