package com.tencent.p014mm.p136ui.chatting;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.tencent.p014mm.plugin.recordvideo.background.provider.WeSeeProvider;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import k20.C9556a;
import ke3.C88144b;

/* renamed from: com.tencent.mm.ui.chatting.r1 */
public class C73838r1 implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ boolean f216672d;

    /* renamed from: e */
    public final /* synthetic */ String f216673e;

    /* renamed from: f */
    public final /* synthetic */ int f216674f;

    /* renamed from: g */
    public final /* synthetic */ String f216675g;

    /* renamed from: h */
    public final /* synthetic */ boolean f216676h;

    /* renamed from: i */
    public final /* synthetic */ C73852u1 f216677i;

    public C73838r1(C73852u1 u1Var, boolean z, String str, int i, String str2, boolean z2) {
        this.f216677i = u1Var;
        this.f216672d = z;
        this.f216673e = str;
        this.f216674f = i;
        this.f216675g = str2;
        this.f216676h = z2;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        WeSeeProvider.C30354a aVar = WeSeeProvider.f115880g;
        aVar.mo57308a();
        if (this.f216672d) {
            Log.m105919d("MicroMsg.ChattingFooterEventImpl", "weishiSchema: %s", this.f216673e);
            C73852u1.m87499I(11, this.f216674f, this.f216677i.f216743l);
            Intent intent = new Intent();
            intent.setAction("android.intent.action.VIEW");
            intent.setData(Uri.parse(this.f216673e));
            intent.setPackage("com.tencent.weishi");
            intent.setFlags(268435456);
            Activity f = this.f216677i.f216741j.mo91565f();
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(intent);
            Activity activity = f;
            C117292a.m165358d(activity, aVar2.mo10232b(), "com/tencent/mm/ui/chatting/ChattingFooterEventImpl$10", "onClick", "(Landroid/content/DialogInterface;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            f.startActivity((Intent) aVar2.mo10231a(0));
            C117292a.m165359e(activity, "com/tencent/mm/ui/chatting/ChattingFooterEventImpl$10", "onClick", "(Landroid/content/DialogInterface;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            return;
        }
        Log.m105919d("MicroMsg.ChattingFooterEventImpl", "weishiUrl: %s", this.f216675g);
        aVar.mo57309b(this.f216673e, System.currentTimeMillis());
        Intent intent2 = new Intent();
        if (!this.f216676h) {
            intent2.putExtra("KRightBtn", true);
        }
        intent2.putExtra("rawUrl", this.f216675g);
        C88144b.m109791i(this.f216677i.f216741j.mo91565f(), "webview", ".ui.tools.WebViewUI", intent2, (Bundle) null);
        C73852u1.m87499I(8, this.f216674f, this.f216677i.f216743l);
    }
}
