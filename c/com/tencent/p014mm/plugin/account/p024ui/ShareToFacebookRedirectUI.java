package com.tencent.p014mm.plugin.account.p024ui;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.mmfb.sdk.C116102h;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.wxmm.v2helper;
import eb0.C75592q0;
import f40.C86709a0;
import jg0.C117355j;
import jg0.C9396h;
import jg0.C9399k;
import nj3.C76879j;
import nj3.C88989a;
import ob0.C11385n;
import ob0.C117747y;
import p910lj.C76701a;
import qo3.C47883u;
import qo3.C77426q;
import qo3.C89779i0;
import te3.C49781i04;

@C88989a(3)
/* renamed from: com.tencent.mm.plugin.account.ui.ShareToFacebookRedirectUI */
public class ShareToFacebookRedirectUI extends MMActivity implements C11385n {

    /* renamed from: j */
    public static final /* synthetic */ int f10778j = 0;

    /* renamed from: d */
    public String f10779d;

    /* renamed from: e */
    public String f10780e;

    /* renamed from: f */
    public String f10781f;

    /* renamed from: g */
    public String f10782g;

    /* renamed from: h */
    public C116102h f10783h;

    /* renamed from: i */
    public C89779i0 f10784i;

    /* renamed from: com.tencent.mm.plugin.account.ui.ShareToFacebookRedirectUI$a */
    public class C1458a implements DialogInterface.OnClickListener {
        public C1458a() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            ShareToFacebookRedirectUI.this.finish();
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.ui.ShareToFacebookRedirectUI$b */
    public class C1459b extends C9399k {
        public C1459b() {
        }

        /* renamed from: a */
        public void mo779a(int i, String str) {
            int i2 = ShareToFacebookRedirectUI.f10778j;
            Log.m105921e("MicroMsg.ShareToFacebookRedirectUI", "refresh token error. errType:%d, errMsg:%s", Integer.valueOf(i), str);
            super.mo779a(i, str);
            if (i == 3) {
                ShareToFacebookRedirectUI shareToFacebookRedirectUI = ShareToFacebookRedirectUI.this;
                shareToFacebookRedirectUI.getClass();
                Log.m105920e("MicroMsg.ShareToFacebookRedirectUI", "dealWithRefreshTokenFail");
                String string = shareToFacebookRedirectUI.getContext().getString(C0966R.string.a3h);
                C76879j.m92750u(shareToFacebookRedirectUI.getContext(), shareToFacebookRedirectUI.getContext().getString(C0966R.string.cle), string, new C1476e3(shareToFacebookRedirectUI), (DialogInterface.OnClickListener) null);
            }
        }

        /* renamed from: b */
        public void mo780b(Bundle bundle) {
            super.mo780b(bundle);
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.ui.ShareToFacebookRedirectUI$c */
    public class C1460c implements C47883u {

        /* renamed from: a */
        public final /* synthetic */ C77426q f10787a;

        /* renamed from: com.tencent.mm.plugin.account.ui.ShareToFacebookRedirectUI$c$a */
        public class C1461a implements DialogInterface.OnCancelListener {
            public C1461a() {
            }

            public void onCancel(DialogInterface dialogInterface) {
                ShareToFacebookRedirectUI.this.f10784i.dismiss();
                ShareToFacebookRedirectUI.this.finish();
            }
        }

        public C1460c(C77426q qVar) {
            this.f10787a = qVar;
        }

        /* renamed from: a */
        public void mo353a(boolean z, String str) {
            ShareToFacebookRedirectUI.this.hideVKB();
            this.f10787a.f225839c.dismiss();
            if (z) {
                C49781i04 i042 = new C49781i04();
                if (Util.isNullOrNil(str)) {
                    str = " ";
                }
                i042.f135009d = str;
                ShareToFacebookRedirectUI shareToFacebookRedirectUI = ShareToFacebookRedirectUI.this;
                i042.f135012g = shareToFacebookRedirectUI.f10779d;
                i042.f135013h = shareToFacebookRedirectUI.f10780e;
                i042.f135011f = shareToFacebookRedirectUI.f10782g;
                i042.f135010e = shareToFacebookRedirectUI.f10781f;
                C86709a0.m107524d().mo123460f(new C9396h(i042));
                ShareToFacebookRedirectUI shareToFacebookRedirectUI2 = ShareToFacebookRedirectUI.this;
                shareToFacebookRedirectUI2.f10784i = C76879j.m92723Q(shareToFacebookRedirectUI2, "", "", false, false, new C1461a());
                return;
            }
            ShareToFacebookRedirectUI.this.finish();
        }
    }

    /* renamed from: H7 */
    public final void mo1462H7() {
        Log.m105924i("MicroMsg.ShareToFacebookRedirectUI", "doSend");
        C77426q qVar = new C77426q(this);
        qVar.mo107606r(this.f10779d);
        qVar.f225837a.f225714b.f225659p = this.f10781f;
        qVar.mo107596h(this.f10780e);
        qVar.f225837a.f225714b.f225647d = getString(C0966R.string.f7934wo);
        qVar.mo107601m(C0966R.string.f360097a31);
        qVar.mo107590b(new C1460c(qVar));
        qVar.mo107603o();
    }

    /* renamed from: I7 */
    public final void mo1463I7() {
        Log.m105924i("MicroMsg.ShareToFacebookRedirectUI", "refreshFacebookToken");
        long nullAsNil = Util.nullAsNil((Long) C86709a0.m107535s().mo121142i().mo119684e(65831, (Object) null));
        String nullAsNil2 = Util.nullAsNil((String) C86709a0.m107535s().mo121142i().mo119684e(65830, (Object) null));
        if (Util.milliSecondsToNow(nullAsNil) <= 86400000 || nullAsNil2.length() <= 0) {
            mo1462H7();
            return;
        }
        C116102h hVar = new C116102h();
        this.f10783h = hVar;
        hVar.mo177424h(nullAsNil2);
        new C117355j(this.f10783h, new C1459b()).mo182018c();
    }

    public int getLayoutId() {
        return -1;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        Object[] objArr = new Object[3];
        objArr[0] = Integer.valueOf(i);
        objArr[1] = Integer.valueOf(i2);
        objArr[2] = Boolean.valueOf(intent == null);
        Log.m105925i("MicroMsg.ShareToFacebookRedirectUI", "onActivityResult, requestCode:%d, resultCode:%d, data==null:%b", objArr);
        if (i == 0 && i2 == -1 && intent != null) {
            boolean booleanExtra = intent.getBooleanExtra("bind_facebook_succ", false);
            Log.m105925i("MicroMsg.ShareToFacebookRedirectUI", "bind facebooksucc %b", Boolean.valueOf(booleanExtra));
            if (booleanExtra) {
                mo1463I7();
                mo1462H7();
                return;
            }
        }
        finish();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C86709a0.m107524d().mo123455a(v2helper.EMethodSetSendToNetworkOff, this);
        this.f10779d = getIntent().getStringExtra(FFmpegMetadataRetriever.METADATA_KEY_TITLE);
        this.f10780e = getIntent().getStringExtra("digest");
        this.f10781f = getIntent().getStringExtra("img");
        String stringExtra = getIntent().getStringExtra("link");
        this.f10782g = stringExtra;
        Log.m105925i("MicroMsg.ShareToFacebookRedirectUI", "title %s, digest:%s, img:%s, link:%s", this.f10779d, this.f10780e, this.f10781f, stringExtra);
        if (!C75592q0.m90792v()) {
            Intent intent = new Intent(this, MMFBAuthUI.class);
            intent.putExtra("is_force_unbind", true);
            startActivityForResult(intent, 0);
            return;
        }
        mo1463I7();
        mo1462H7();
    }

    public void onDestroy() {
        C86709a0.m107524d().mo123470p(v2helper.EMethodSetSendToNetworkOff, this);
        C116102h hVar = this.f10783h;
        if (hVar != null) {
            hVar.mo177420c(this);
        }
        super.onDestroy();
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        Log.m105925i("MicroMsg.ShareToFacebookRedirectUI", "type:%d, code:%d, msg:%s", Integer.valueOf(i), Integer.valueOf(i2), str);
        hideVKB();
        this.f10784i.dismiss();
        if (i == 4 && i2 == -68) {
            if (Util.isNullOrNil(str)) {
                str = "error";
            }
            C76879j.m92750u(getContext(), str, getString(C0966R.string.a3h), new C1476e3(this), (DialogInterface.OnClickListener) null);
        } else if (i == 0 && i2 == 0) {
            String string = getString(C0966R.string.j6i);
            if (!isFinishing()) {
                C76701a.makeText((Context) this, (CharSequence) string, 0).show();
            }
            finish();
        } else {
            AppCompatActivity context = getContext();
            C76879j.m92750u(context, "err(" + i2 + "," + i + ")", getString(C0966R.string.a3h), new C1458a(), (DialogInterface.OnClickListener) null);
        }
    }
}
