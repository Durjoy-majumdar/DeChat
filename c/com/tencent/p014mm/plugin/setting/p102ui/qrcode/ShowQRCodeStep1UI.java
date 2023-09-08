package com.tencent.p014mm.plugin.setting.p102ui.qrcode;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import cn2.C0895c;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.account.p024ui.MMFBAuthUI;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.sdk.http.HttpWrapperBase;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatHosts;
import di3.C86312j;
import eb0.C75592q0;
import f40.C86709a0;
import j20.C117292a;
import java.util.ArrayList;
import k20.C9556a;
import ke3.C88144b;
import nj3.C76879j;
import ob0.C11385n;
import ob0.C117747y;
import p156gj.C87200o;
import p200lx.C10661v;
import p200lx.C46896e0;
import p823sg.C90193h;
import p910lj.C76701a;
import qe3.C89625d;
import tm2.C14049d;

/* renamed from: com.tencent.mm.plugin.setting.ui.qrcode.ShowQRCodeStep1UI */
public class ShowQRCodeStep1UI extends MMActivity implements C11385n {

    /* renamed from: d */
    public ProgressDialog f20631d = null;

    /* renamed from: e */
    public ImageView f20632e = null;

    /* renamed from: f */
    public int f20633f = 1;

    /* renamed from: g */
    public byte[] f20634g = null;

    /* renamed from: com.tencent.mm.plugin.setting.ui.qrcode.ShowQRCodeStep1UI$a */
    public class C5188a implements MenuItem.OnMenuItemClickListener {
        public C5188a() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            ShowQRCodeStep1UI.this.hideVKB();
            ShowQRCodeStep1UI.this.finish();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.setting.ui.qrcode.ShowQRCodeStep1UI$b */
    public class C5189b implements MenuItem.OnMenuItemClickListener {
        public C5189b() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            ShowQRCodeStep1UI showQRCodeStep1UI = ShowQRCodeStep1UI.this;
            C76879j.m92737h(showQRCodeStep1UI, "", new String[]{showQRCodeStep1UI.getString(C0966R.string.ikc), showQRCodeStep1UI.getString(C0966R.string.ikg)}, "", false, new C0895c(showQRCodeStep1UI));
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.setting.ui.qrcode.ShowQRCodeStep1UI$c */
    public class C5190c implements View.OnClickListener {
        public C5190c() {
        }

        public void onClick(View view) {
            Class<ShareToQQUI> cls = ShareToQQUI.class;
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/setting/ui/qrcode/ShowQRCodeStep1UI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            int i = ShowQRCodeStep1UI.this.f20633f;
            if (i == 3) {
                byte[] c = C86709a0.m107529k().mo121128c(1);
                String s = C75592q0.m90789s();
                int nullAsNil = Util.nullAsNil((Integer) C86709a0.m107535s().mo121142i().mo119684e(66561, (Object) null));
                Log.m105919d("MicroMsg.ShowQRCodeStep1UI", "sessionKey[%s], userName[%s], style[%d]", Util.secPrint(Util.encodeHexString(c)), s, Integer.valueOf(nullAsNil));
                StringBuilder sb = new StringBuilder();
                sb.append(HttpWrapperBase.PROTOCAL_HTTPS);
                sb.append(WeChatHosts.domainString(C0966R.string.fmp));
                sb.append("/cgi-bin/rweibourl?sid=");
                sb.append(C90193h.m112878f(c));
                sb.append("&u=");
                sb.append(s);
                sb.append("&qr=");
                sb.append(nullAsNil);
                sb.append("&device=");
                int i2 = C89625d.f257835a;
                sb.append(C87200o.f252868a);
                sb.append("&version=");
                sb.append(C89625d.f257841g);
                String sb4 = sb.toString();
                Log.m105919d("MicroMsg.ShowQRCodeStep1UI", "[%s]", sb4);
                Intent intent = new Intent();
                intent.putExtra("rawUrl", sb4);
                intent.putExtra(FFmpegMetadataRetriever.METADATA_KEY_TITLE, ShowQRCodeStep1UI.this.getString(C0966R.string.iku));
                C88144b.m109791i(ShowQRCodeStep1UI.this, "webview", ".ui.tools.WebViewUI", intent, (Bundle) null);
                ShowQRCodeStep1UI.this.finish();
            } else if (i == 4) {
                if (C75592q0.m90792v()) {
                    Intent intent2 = new Intent(ShowQRCodeStep1UI.this, cls);
                    intent2.putExtra("show_to", 4);
                    ShowQRCodeStep1UI showQRCodeStep1UI = ShowQRCodeStep1UI.this;
                    C9556a aVar = new C9556a();
                    aVar.mo10233c(intent2);
                    ShowQRCodeStep1UI showQRCodeStep1UI2 = showQRCodeStep1UI;
                    C117292a.m165358d(showQRCodeStep1UI2, aVar.mo10232b(), "com/tencent/mm/plugin/setting/ui/qrcode/ShowQRCodeStep1UI$3", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    showQRCodeStep1UI.startActivity((Intent) aVar.mo10231a(0));
                    C117292a.m165359e(showQRCodeStep1UI2, "com/tencent/mm/plugin/setting/ui/qrcode/ShowQRCodeStep1UI$3", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                } else {
                    ShowQRCodeStep1UI.this.startActivity(MMFBAuthUI.class);
                }
                ShowQRCodeStep1UI.this.finish();
            } else if (i == 2) {
                Intent intent3 = new Intent(ShowQRCodeStep1UI.this, cls);
                intent3.putExtra("show_to", 2);
                ShowQRCodeStep1UI showQRCodeStep1UI3 = ShowQRCodeStep1UI.this;
                C9556a aVar2 = new C9556a();
                aVar2.mo10233c(intent3);
                ShowQRCodeStep1UI showQRCodeStep1UI4 = showQRCodeStep1UI3;
                C117292a.m165358d(showQRCodeStep1UI4, aVar2.mo10232b(), "com/tencent/mm/plugin/setting/ui/qrcode/ShowQRCodeStep1UI$3", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                showQRCodeStep1UI3.startActivity((Intent) aVar2.mo10231a(0));
                C117292a.m165359e(showQRCodeStep1UI4, "com/tencent/mm/plugin/setting/ui/qrcode/ShowQRCodeStep1UI$3", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                ShowQRCodeStep1UI.this.finish();
            } else {
                Intent intent4 = new Intent(ShowQRCodeStep1UI.this, cls);
                intent4.putExtra("show_to", 1);
                ShowQRCodeStep1UI showQRCodeStep1UI5 = ShowQRCodeStep1UI.this;
                C9556a aVar3 = new C9556a();
                aVar3.mo10233c(intent4);
                ShowQRCodeStep1UI showQRCodeStep1UI6 = showQRCodeStep1UI5;
                C117292a.m165358d(showQRCodeStep1UI6, aVar3.mo10232b(), "com/tencent/mm/plugin/setting/ui/qrcode/ShowQRCodeStep1UI$3", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                showQRCodeStep1UI5.startActivity((Intent) aVar3.mo10231a(0));
                C117292a.m165359e(showQRCodeStep1UI6, "com/tencent/mm/plugin/setting/ui/qrcode/ShowQRCodeStep1UI$3", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                ShowQRCodeStep1UI.this.finish();
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/setting/ui/qrcode/ShowQRCodeStep1UI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.setting.ui.qrcode.ShowQRCodeStep1UI$d */
    public class C5191d implements DialogInterface.OnCancelListener {

        /* renamed from: d */
        public final /* synthetic */ C10661v f20638d;

        public C5191d(ShowQRCodeStep1UI showQRCodeStep1UI, C10661v vVar) {
            this.f20638d = vVar;
        }

        public void onCancel(DialogInterface dialogInterface) {
            C86709a0.m107524d().mo123458d((C117747y) this.f20638d);
        }
    }

    /* renamed from: H7 */
    public void mo6160H7() {
        C10661v EY = ((C46896e0) C86312j.m106911c(C46896e0.class)).mo71985EY();
        C86709a0.m107524d().mo123460f((C117747y) EY);
        this.f20631d = C76879j.m92723Q(getContext(), getString(C0966R.string.a3h), getString(C0966R.string.ikf), true, true, new C5191d(this, EY));
    }

    public int getLayoutId() {
        return C0966R.C0971layout.bzb;
    }

    public void initView() {
        setMMTitle((int) C0966R.string.iln);
        this.f20632e = (ImageView) findViewById(C0966R.C0970id.jax);
        this.f20633f = getIntent().getIntExtra("show_to", 1);
        TextView textView = (TextView) findViewById(C0966R.C0970id.jkb);
        int i = this.f20633f;
        if (i == 3) {
            textView.setText(getString(C0966R.string.ikk, new Object[]{getString(C0966R.string.iko)}));
        } else if (i == 4) {
            textView.setText(getString(C0966R.string.ikk, new Object[]{getString(C0966R.string.ikl)}));
        } else if (i == 2) {
            textView.setText(getString(C0966R.string.ikk, new Object[]{getString(C0966R.string.ikn)}));
        } else {
            textView.setText(getString(C0966R.string.ikk, new Object[]{getString(C0966R.string.ikm)}));
        }
        mo6160H7();
        setBackBtn(new C5188a());
        addIconOptionMenu(0, C0966R.raw.icons_outlined_more, new C5189b());
        ((Button) findViewById(C0966R.C0970id.jay)).setOnClickListener(new C5190c());
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        initView();
        C86709a0.m107524d().mo123455a(168, this);
    }

    public void onDestroy() {
        C86709a0.m107524d().mo123470p(168, this);
        super.onDestroy();
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        Log.m105925i("MicroMsg.ShowQRCodeStep1UI", "onSceneEnd: errType = %d errCode = %d errMsg = %s", Integer.valueOf(i), Integer.valueOf(i2), str);
        ProgressDialog progressDialog = this.f20631d;
        if (progressDialog != null) {
            progressDialog.dismiss();
            this.f20631d = null;
        }
        if (!C14049d.m13402a().mo93165v5(getContext(), i, i2, str)) {
            if (i == 0 && i2 == 0) {
                byte[] b = ((C10661v) yVar).mo10930b();
                this.f20634g = b;
                this.f20632e.setImageBitmap(BitmapUtil.decodeByteArray(b));
                return;
            }
            C76701a.makeText((Context) this, (CharSequence) getString(C0966R.string.f0a, new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}), 0).show();
        }
    }
}
