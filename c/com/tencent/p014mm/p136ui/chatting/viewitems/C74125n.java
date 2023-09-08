package com.tencent.p014mm.p136ui.chatting.viewitems;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import eb0.C97625j3;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Locale;
import kb0.C46664n;
import ke3.C88144b;
import nj3.C76912y0;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import qo3.C89779i0;
import te3.u75;

/* renamed from: com.tencent.mm.ui.chatting.viewitems.n */
public class C74125n implements C11385n {

    /* renamed from: d */
    public final /* synthetic */ View f217603d;

    /* renamed from: e */
    public final /* synthetic */ String f217604e;

    /* renamed from: f */
    public final /* synthetic */ C74103m f217605f;

    public C74125n(C74103m mVar, View view, String str) {
        this.f217605f = mVar;
        this.f217603d = view;
        this.f217604e = str;
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        C97625j3.m125815e().mo123470p(1198, this);
        Log.m105919d("MicroMsg.ChattingItemAppBrandNotifyMsg", "onSceneEnd(errType : %d, errCode : %d, errMsg : %s, toBan : %s)", Integer.valueOf(i), Integer.valueOf(i2), str, Boolean.FALSE);
        C89779i0 i0Var = this.f217605f.f217505x;
        if (i0Var != null) {
            i0Var.dismiss();
            this.f217605f.f217505x = null;
        }
        if (i == 0 && i2 == 0) {
            C47350c cVar = ((C46664n) yVar).f125633d;
            u75 u75 = cVar != null ? (u75) cVar.f127056b.f127083a : null;
            if (u75 == null) {
                C76912y0.makeText(this.f217603d.getContext(), (int) C0966R.string.hcz, 0).show();
                return;
            }
            String str2 = u75.f142656d;
            Log.m105925i("MicroMsg.ChattingItemAppBrandNotifyMsg", "more view clicked, menu item COMPLAIN_APP_BRAND selected, sync attr username %s", this.f217604e);
            if (TextUtils.isEmpty(this.f217604e) || TextUtils.isEmpty(str2)) {
                Log.m105925i("MicroMsg.ChattingItemAppBrandNotifyMsg", "appId(%s) or msgId(%s) is null or nil.", this.f217604e, str2);
                C76912y0.makeText(this.f217603d.getContext(), (int) C0966R.string.hd9, 0).show();
                return;
            }
            try {
                String format = String.format(Locale.US, C74103m.f217496G, new Object[]{URLEncoder.encode(this.f217604e, "utf-8"), URLEncoder.encode(str2, "utf-8"), 13});
                Log.m105919d("MicroMsg.ChattingItemAppBrandNotifyMsg", "go to complain page(%s, %s), url:%s", str2, this.f217604e, format);
                Intent intent = new Intent();
                intent.putExtra("rawUrl", format);
                C74023i.m87881c(intent, this.f217605f.f217504w.mo91577r());
                C88144b.m109791i(this.f217605f.f217504w.mo91565f(), "webview", ".ui.tools.WebViewUI", intent, (Bundle) null);
            } catch (UnsupportedEncodingException unused) {
                Log.m105920e("MicroMsg.ChattingItemAppBrandNotifyMsg", "Error occurred when encode url.");
                C76912y0.makeText(this.f217603d.getContext(), (int) C0966R.string.hd9, 0).show();
            }
        } else {
            C76912y0.makeText(this.f217603d.getContext(), (int) C0966R.string.hcz, 0).show();
        }
    }
}
