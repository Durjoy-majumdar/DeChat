package com.tencent.p014mm.plugin.game.p061ui;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.plugin.C40030e;
import com.tencent.p014mm.opensdk.channel.MMessageActV2;
import com.tencent.p014mm.opensdk.modelbiz.CreateChatroom;
import com.tencent.p014mm.opensdk.modelbiz.JoinChatroom;
import com.tencent.p014mm.p136ui.MMBaseActivity;
import com.tencent.p014mm.plugin.game.commlib.util.C41864d;
import com.tencent.p014mm.pluginsdk.model.app.C44561j;
import com.tencent.p014mm.pluginsdk.model.app.C72688j0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import ke3.C88144b;
import nj3.C76879j;
import nj3.C88989a;
import ob0.C47350c;
import ob0.C89144l0;
import p763ym.C79138l;
import pe3.C89349b;
import py1.C47591h1;
import py1.C47598i1;
import py1.C47667s0;
import py1.C47674t0;
import ry1.C48118g;
import ry1.C48120h;
import wc3.C15134f0;
import wc3.C53145l0;

@C88989a(7)
/* renamed from: com.tencent.mm.plugin.game.ui.CreateOrJoinChatroomUI */
public class CreateOrJoinChatroomUI extends MMBaseActivity {

    /* renamed from: q */
    public static final /* synthetic */ int f113614q = 0;

    /* renamed from: e */
    public String f113615e;

    /* renamed from: f */
    public String f113616f;

    /* renamed from: g */
    public String f113617g;

    /* renamed from: h */
    public String f113618h;

    /* renamed from: i */
    public String f113619i;

    /* renamed from: j */
    public String f113620j;

    /* renamed from: n */
    public String f113621n;

    /* renamed from: o */
    public String f113622o;

    /* renamed from: p */
    public ProgressDialog f113623p = null;

    /* renamed from: E7 */
    public static void m45844E7(CreateOrJoinChatroomUI createOrJoinChatroomUI, String str) {
        createOrJoinChatroomUI.getClass();
        Intent intent = new Intent();
        String l5 = ((C79138l) C86312j.m106911c(C79138l.class)).mo74012l5(createOrJoinChatroomUI, createOrJoinChatroomUI.f113617g);
        intent.putExtra("action", createOrJoinChatroomUI.f113615e);
        intent.putExtra("app_name", l5);
        intent.putExtra("rawUrl", str);
        C88144b.m109795m(createOrJoinChatroomUI, "webview", ".ui.tools.game.GameChattingRoomWebViewUI", intent, 5);
    }

    /* renamed from: F7 */
    public final void mo66110F7() {
        ProgressDialog progressDialog = this.f113623p;
        if (progressDialog != null && progressDialog.isShowing()) {
            this.f113623p.cancel();
        }
    }

    /* renamed from: G7 */
    public final void mo66111G7(int i) {
        C44561j appInfo = ((C79138l) C86312j.m106911c(C79138l.class)).getAppInfo(this.f113617g);
        Bundle bundle = new Bundle();
        if (this.f113615e.equals("action_create")) {
            CreateChatroom.Resp resp = new CreateChatroom.Resp();
            if (appInfo != null) {
                resp.openId = appInfo.field_openId;
            }
            resp.transaction = this.f113618h;
            resp.extMsg = this.f113622o;
            resp.errCode = i;
            resp.toBundle(bundle);
        } else if (this.f113615e.equals("action_join")) {
            JoinChatroom.Resp resp2 = new JoinChatroom.Resp();
            if (appInfo != null) {
                resp2.openId = appInfo.field_openId;
            }
            resp2.transaction = this.f113618h;
            resp2.extMsg = this.f113622o;
            resp2.errCode = i;
            resp2.toBundle(bundle);
        }
        MMessageActV2.Args args = new MMessageActV2.Args();
        args.targetPkgName = this.f113616f;
        args.bundle = bundle;
        C72688j0.m85024j(args);
        C72688j0.m85021g(bundle);
        C72688j0.m85022h(bundle);
        MMessageActV2.send(MMApplicationContext.getContext(), args);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == 5) {
            if (i2 == 4) {
                mo66111G7(0);
            } else if (i2 == 5) {
                if (intent != null) {
                    ((C40030e) C15134f0.C15135a.m14248a()).mo62718b(this, intent.getStringExtra("rawUrl"), true, (C53145l0) null, (Bundle) null);
                }
            } else if (i2 == 0) {
                mo66111G7(-2);
            }
        }
        finish();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        requestWindowFeature(1);
        Log.m105924i("MicroMsg.CreateOrJoinChatroomUI", "onCreate");
        C41864d.m45384a(this);
        Intent intent = getIntent();
        this.f113615e = intent.getStringExtra("action");
        this.f113616f = intent.getStringExtra("package_name");
        this.f113617g = intent.getStringExtra("key_app_id");
        this.f113618h = intent.getStringExtra("key_transaction");
        this.f113619i = intent.getStringExtra(FirebaseAnalytics.C113379b.GROUP_ID);
        this.f113620j = intent.getStringExtra("chatroom_name");
        this.f113621n = intent.getStringExtra("chatroom_nickname");
        this.f113622o = intent.getStringExtra("ext_msg");
        if (Util.isNullOrNil(this.f113615e) || Util.isNullOrNil(this.f113617g) || Util.isNullOrNil(this.f113619i)) {
            Log.m105920e("MicroMsg.CreateOrJoinChatroomUI", "Invalid args");
            finish();
            return;
        }
        this.f113623p = C76879j.m92723Q(this, "", getBaseContext().getString(C0966R.string.fcd), true, true, (DialogInterface.OnCancelListener) null);
        if (this.f113615e.equals("action_create")) {
            Log.m105925i("MicroMsg.CreateOrJoinChatroomUI", "createChatroom, appid = %s, groupId = %s, ChatRoomName = %s", this.f113617g, this.f113619i, this.f113620j);
            C47350c.C47352b bVar = new C47350c.C47352b();
            bVar.f127066a = new C47667s0();
            bVar.f127067b = new C47674t0();
            bVar.f127068c = "/cgi-bin/mmgame-bin/gamecreatechatroom";
            bVar.f127069d = 1205;
            C47350c a = bVar.mo72403a();
            C47667s0 s0Var = (C47667s0) a.f127055a.f127080a;
            s0Var.f127989d = this.f113617g;
            s0Var.f127990e = this.f113619i;
            String str = this.f113620j;
            s0Var.f127991f = new C89349b(str == null ? new byte[0] : str.getBytes());
            String str2 = this.f113621n;
            s0Var.f127992g = new C89349b(str2 == null ? new byte[0] : str2.getBytes());
            C89144l0.m111429e(a, new C48118g(this), false);
        } else if (this.f113615e.equals("action_join")) {
            C47350c.C47352b bVar2 = new C47350c.C47352b();
            bVar2.f127066a = new C47591h1();
            bVar2.f127067b = new C47598i1();
            bVar2.f127068c = "/cgi-bin/mmgame-bin/gamejoinchatroom";
            bVar2.f127069d = 1206;
            C47350c a2 = bVar2.mo72403a();
            C47591h1 h1Var = (C47591h1) a2.f127055a.f127080a;
            h1Var.f127751d = this.f113617g;
            h1Var.f127752e = this.f113619i;
            String str3 = this.f113621n;
            h1Var.f127753f = new C89349b(str3 == null ? new byte[0] : str3.getBytes());
            C89144l0.m111429e(a2, new C48120h(this), false);
        }
    }

    public void onDestroy() {
        mo66110F7();
        C41864d.m45388e(this);
        super.onDestroy();
    }
}
