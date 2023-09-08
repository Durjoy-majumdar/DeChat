package com.tencent.p014mm.plugin.setting.p102ui.qrcode;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.gms.common.Scopes;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C67654r1;
import com.tencent.p014mm.modelavatar.AvatarStorage;
import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.p136ui.MMBaseActivity;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatHosts;
import d62.C45286l;
import di3.C86312j;
import eb0.C75576f4;
import f40.C86709a0;
import f40.C86718e;
import ke3.C88144b;
import nj3.C76879j;
import ob0.C11385n;
import ob0.C117747y;
import p189kx.C46752w;
import p196ln.C76706g;
import sf0.C48374j0;
import te3.C77967mx3;
import tm2.C14049d;
import wc3.C53150x;

/* renamed from: com.tencent.mm.plugin.setting.ui.qrcode.GetQRCodeInfoUI */
public class GetQRCodeInfoUI extends MMBaseActivity implements C11385n {

    /* renamed from: g */
    public static final /* synthetic */ int f116221g = 0;

    /* renamed from: e */
    public ProgressDialog f116222e = null;

    /* renamed from: f */
    public C45286l f116223f;

    /* renamed from: com.tencent.mm.plugin.setting.ui.qrcode.GetQRCodeInfoUI$a */
    public class C42921a implements C75576f4.C75578b {
        public C42921a() {
        }

        /* renamed from: a */
        public void mo57753a(C114770g gVar) {
            String str;
            if (gVar == null) {
                GetQRCodeInfoUI.this.finish();
            } else if (!C86709a0.m107522a() || C86718e.m107551r()) {
                ((C67654r1) C14049d.m13403b()).mo93183p(new Intent(), GetQRCodeInfoUI.this);
                GetQRCodeInfoUI.this.finish();
            } else {
                GetQRCodeInfoUI getQRCodeInfoUI = GetQRCodeInfoUI.this;
                String dataString = getQRCodeInfoUI.getIntent().getDataString();
                int i = GetQRCodeInfoUI.f116221g;
                getQRCodeInfoUI.getClass();
                if (!Util.isNullOrNil(dataString)) {
                    if (dataString.startsWith("weixin://qr/")) {
                        str = dataString.substring(12) + "@qr";
                    } else {
                        String str2 = C46752w.f125841b;
                        if (dataString.startsWith(str2)) {
                            str = dataString.substring(str2.length()) + "@qr";
                        } else {
                            String str3 = C46752w.f125840a;
                            if (dataString.startsWith(str3)) {
                                str = dataString.substring(str3.length()) + "@qr";
                            } else {
                                str = "";
                            }
                        }
                    }
                    C86709a0.m107524d().mo123455a(106, getQRCodeInfoUI);
                    getQRCodeInfoUI.f116223f = new C45286l(str, 5);
                    C86709a0.m107524d().mo123460f(getQRCodeInfoUI.f116223f);
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.setting.ui.qrcode.GetQRCodeInfoUI$b */
    public class C42922b implements DialogInterface.OnCancelListener {
        public C42922b() {
        }

        public void onCancel(DialogInterface dialogInterface) {
            GetQRCodeInfoUI.this.finish();
        }
    }

    /* renamed from: com.tencent.mm.plugin.setting.ui.qrcode.GetQRCodeInfoUI$c */
    public class C42923c implements DialogInterface.OnClickListener {
        public C42923c() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            GetQRCodeInfoUI.this.finish();
        }
    }

    /* renamed from: com.tencent.mm.plugin.setting.ui.qrcode.GetQRCodeInfoUI$d */
    public class C42924d implements DialogInterface.OnClickListener {
        public C42924d() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            GetQRCodeInfoUI.this.finish();
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        ((C67654r1) C14049d.m13403b()).mo93183p(new Intent(), this);
        finish();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C0966R.C0971layout.a3c);
        Uri data = getIntent().getData();
        if (data == null) {
            finish();
            return;
        }
        String nullAsNil = Util.nullAsNil(data.getHost());
        String nullAsNil2 = Util.nullAsNil(data.getScheme());
        if ((!"http".equals(nullAsNil2) || !WeChatHosts.domainString(C0966R.string.fmp).equals(nullAsNil)) && (!"weixin".equals(nullAsNil2) || !"qr".equals(nullAsNil))) {
            finish();
        } else {
            C86709a0.m107524d().mo123460f(new C75576f4(new C42921a(), (String) null));
        }
    }

    public void onDestroy() {
        super.onDestroy();
        if (this.f116223f != null) {
            C86709a0.m107524d().mo123458d(this.f116223f);
        }
        C86709a0.m107524d().mo123470p(106, this);
    }

    public void onResume() {
        super.onResume();
        this.f116222e = C76879j.m92723Q(this, getString(C0966R.string.a3h), getString(C0966R.string.f7486hk), true, true, new C42922b());
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        Log.m105924i("MicroMsg.GetQRCodeInfoUI", "onSceneEnd: errType = " + i + " errCode = " + i2 + " errMsg = " + str);
        ProgressDialog progressDialog = this.f116222e;
        if (progressDialog != null) {
            progressDialog.dismiss();
            this.f116222e = null;
        }
        if (i == 4 && i2 == -2004) {
            C76879j.m92742m(this, C0966R.string.hq4, C0966R.string.a3h, new C42923c());
        } else if (i == 0 && i2 == 0) {
            C77967mx3 l0 = ((C45286l) yVar).mo70811l0();
            String g = C48374j0.m53718g(l0.f227857d);
            ((AvatarStorage) ((C76706g) C86312j.m106911c(C76706g.class)).mo106826RE()).mo93572u(g, C48374j0.m53715d(l0.f227862i));
            ((C53150x) C86312j.m106911c(C53150x.class)).mo73832B0(new Intent(), l0, 30);
            if (Util.nullAsNil(g).length() > 0) {
                if ((l0.f227867q & 8) > 0) {
                    C115669n nVar = C115669n.INSTANCE;
                    nVar.kvStat(10298, g + "," + 30);
                }
                C88144b.m109794l(this, Scopes.PROFILE, ".ui.ContactInfoUI", 1);
            }
        } else {
            String errMsgContent = Util.getErrMsgContent(str);
            if (Util.isNullOrNil(errMsgContent)) {
                errMsgContent = getString(C0966R.string.f09, new Object[]{Integer.valueOf(i), Integer.valueOf(i2)});
            }
            C76879j.m92749t(this, errMsgContent, getString(C0966R.string.a3h), new C42924d());
        }
    }
}
