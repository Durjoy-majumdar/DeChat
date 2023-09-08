package com.tencent.p014mm.p136ui.chatting.viewitems;

import a70.C112760b;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMFragmentActivity;
import com.tencent.p014mm.plugin.appbrand.C83727p2;
import com.tencent.p014mm.plugin.appbrand.config.WxaAttributes;
import com.tencent.p014mm.plugin.appbrand.config.WxaExposedParams;
import com.tencent.p014mm.plugin.webview.model.C6049n1;
import com.tencent.p014mm.plugin.webview.model.WebViewJSSDKFileItem;
import com.tencent.p014mm.plugin.webview.modeltools.C6080m;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.VFSStrategy;
import com.tencent.p014mm.vfs.VFSStrategy$$b;
import di3.C86312j;
import eb0.C97625j3;
import gw0.C76073b;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Locale;
import java.util.Map;
import kb0.C46664n;
import ke3.C88144b;
import kr0.C76629w0;
import nj3.C76912y0;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import qo3.C89779i0;
import te3.u75;

/* renamed from: com.tencent.mm.ui.chatting.viewitems.t4 */
public class C74231t4 implements C11385n {

    /* renamed from: d */
    public final /* synthetic */ View f217923d;

    /* renamed from: e */
    public final /* synthetic */ C72963f4 f217924e;

    /* renamed from: f */
    public final /* synthetic */ Map f217925f;

    /* renamed from: g */
    public final /* synthetic */ ChattingItemDyeingTemplate f217926g;

    /* renamed from: com.tencent.mm.ui.chatting.viewitems.t4$a */
    public class C74232a implements C76629w0.C61144a {

        /* renamed from: a */
        public final /* synthetic */ String f217927a;

        public C74232a(String str) {
            this.f217927a = str;
        }

        /* renamed from: a */
        public void mo21208a(WxaAttributes wxaAttributes) {
            if (wxaAttributes == null) {
                C76912y0.makeText(C74231t4.this.f217923d.getContext(), (int) C0966R.string.hd9, 0).show();
                return;
            }
            String str = wxaAttributes.field_appId;
            if (TextUtils.isEmpty(str) || TextUtils.isEmpty(this.f217927a)) {
                Log.m105925i("MicroMsg.ChattingItemDyeingTemplate", "appId(%s) or msgId(%s) is null or nil.", str, this.f217927a);
                C76912y0.makeText(C74231t4.this.f217923d.getContext(), (int) C0966R.string.hd9, 0).show();
                return;
            }
            int i = Util.getInt((String) C74231t4.this.f217925f.get(".msg.appmsg.mmreader.template_detail.template_ext.we_app_state"), -1);
            int i2 = Util.getInt((String) C74231t4.this.f217925f.get(".msg.appmsg.mmreader.template_detail.template_ext.we_app_version"), -1);
            ChattingItemDyeingTemplate chattingItemDyeingTemplate = C74231t4.this.f217926g;
            String str2 = this.f217927a;
            String str3 = ChattingItemDyeingTemplate.f216840y0;
            chattingItemDyeingTemplate.getClass();
            WxaExposedParams.C81632b bVar = new WxaExposedParams.C81632b();
            bVar.f239557a = str;
            bVar.f239566j = 1;
            bVar.f239564h = i;
            bVar.f239563g = i2;
            bVar.f239572p = str2;
            String b = C83727p2.m102772b(bVar.mo113977a());
            if (Util.isNullOrNil(b)) {
                Log.m105920e("MicroMsg.ChattingItemDyeingTemplate", "Error occurred when encode url.");
                C76912y0.makeText(C74231t4.this.f217923d.getContext(), (int) C0966R.string.hd9, 0).show();
                return;
            }
            Log.m105919d("MicroMsg.ChattingItemDyeingTemplate", "go to complain page(%s, %s), url:%s", this.f217927a, str, b);
            Intent intent = new Intent();
            intent.putExtra("rawUrl", b);
            C74023i.m87881c(intent, C74231t4.this.f217926g.f216867v.mo91577r());
            C88144b.m109791i(C74231t4.this.f217926g.f216867v.mo91565f(), "webview", ".ui.tools.WebViewUI", intent, (Bundle) null);
        }
    }

    public C74231t4(ChattingItemDyeingTemplate chattingItemDyeingTemplate, View view, C72963f4 f4Var, Map map) {
        this.f217926g = chattingItemDyeingTemplate;
        this.f217923d = view;
        this.f217924e = f4Var;
        this.f217925f = map;
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        String str2;
        C97625j3.m125815e().mo123470p(1198, this);
        Log.m105919d("MicroMsg.ChattingItemDyeingTemplate", "onSceneEnd(errType : %d, errCode : %d, errMsg : %s, toBan : %s)", Integer.valueOf(i), Integer.valueOf(i2), str, Boolean.FALSE);
        C89779i0 i0Var = this.f217926g.f216868w;
        if (i0Var != null) {
            i0Var.dismiss();
            this.f217926g.f216868w = null;
        }
        if (i != 0 || i2 != 0) {
            C76912y0.makeText(this.f217923d.getContext(), (int) C0966R.string.hcz, 0).show();
        } else if (this.f217924e == this.f217923d.getTag() || this.f217924e == this.f217923d.getTag(C0966R.C0970id.hcu)) {
            C47350c cVar = ((C46664n) yVar).f125633d;
            u75 u75 = cVar != null ? (u75) cVar.f127056b.f127083a : null;
            if (u75 == null) {
                C76912y0.makeText(this.f217923d.getContext(), (int) C0966R.string.hcz, 0).show();
                return;
            }
            String str3 = u75.f142656d;
            String nullAsNil = Util.nullAsNil((String) this.f217925f.get(".msg.fromusername"));
            if (((C76073b) C86312j.m106911c(C76073b.class)).mo94598h0(nullAsNil)) {
                ((C76629w0) C86312j.m106911c(C76629w0.class)).mo106884tG(nullAsNil, new C74232a(str3));
                return;
            }
            Log.m105919d("MicroMsg.ChattingItemDyeingTemplate", "more view clicked, menu item COMPLAIN_APP_BRAND selected, sync attr username %s", nullAsNil);
            ChattingItemDyeingTemplate chattingItemDyeingTemplate = this.f217926g;
            chattingItemDyeingTemplate.getClass();
            try {
                View decorView = ((MMFragmentActivity) chattingItemDyeingTemplate.f216867v.mo91565f()).getWindow().getDecorView();
                decorView.setDrawingCacheEnabled(true);
                decorView.buildDrawingCache();
                Bitmap drawingCache = decorView.getDrawingCache();
                VFSStrategy$$b vFSStrategy$$b = VFSStrategy.f348871a;
                C86009m1 i0 = C112760b.m154236i0("WebImageCache");
                String str4 = (i0.mo119971i() + "/") + String.format(Locale.US, "mmexport_%s_%d", new Object[]{"biz_service_complaint_img", Long.valueOf(System.currentTimeMillis())});
                BitmapUtil.saveBitmapToImage(drawingCache, 100, Bitmap.CompressFormat.JPEG, str4, false);
                WebViewJSSDKFileItem b = C6049n1.m5933b(str4);
                C6080m.Ax0().mo7009a(b);
                str2 = b.f283022e;
            } catch (Exception e) {
                Log.m105920e("MicroMsg.ChattingItemDyeingTemplate", e.getMessage());
                str2 = "";
            }
            try {
                String format = String.format(ChattingItemDyeingTemplate.f216840y0, new Object[]{nullAsNil, URLEncoder.encode(this.f217926g.f216849I, "utf-8"), URLEncoder.encode(str3, "utf-8"), URLEncoder.encode(str2, "utf-8")});
                Log.m105925i("MicroMsg.ChattingItemDyeingTemplate", "go to complain page(%s, %s), url:%s", str3, this.f217926g.f216849I, format);
                Intent intent = new Intent();
                intent.putExtra("rawUrl", format);
                C74023i.m87881c(intent, this.f217926g.f216867v.mo91577r());
                C88144b.m109791i(this.f217926g.f216867v.mo91565f(), "webview", ".ui.tools.WebViewUI", intent, (Bundle) null);
            } catch (UnsupportedEncodingException unused) {
                Log.m105920e("MicroMsg.ChattingItemDyeingTemplate", "Error occurred when encode url.");
                C76912y0.makeText(this.f217923d.getContext(), (int) C0966R.string.hd9, 0).show();
            }
        } else {
            Log.m105929w("MicroMsg.ChattingItemDyeingTemplate", "item msg(%s) has changed.", Long.valueOf(this.f217924e.getMsgId()));
        }
    }
}
