package com.tencent.p014mm.plugin.webview.luggage.menu;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.widget.ImageView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.game.report.C40314g;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.C80883e;
import com.tencent.p014mm.ipcinvoker.C80907o;
import com.tencent.p014mm.plugin.appbrand.jsapi.C1876t4;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.webview.luggage.C43633m1;
import com.tencent.p014mm.plugin.webview.luggage.C43658n;
import com.tencent.p014mm.plugin.webview.model.C6059u1;
import com.tencent.p014mm.plugin.webview.model.C6062v1;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatProcess;
import di3.C86312j;
import gc0.C20828a;
import java.net.URI;
import java.net.URISyntaxException;
import nj3.C76874e0;
import org.json.JSONException;
import org.json.JSONObject;
import p003ay.C0235b;
import y10.C15928a;

/* renamed from: com.tencent.mm.plugin.webview.luggage.menu.d */
public class C43638d extends C43634a {

    /* renamed from: com.tencent.mm.plugin.webview.luggage.menu.d$b */
    public static class C6008b implements C80883e<Bundle, Bundle> {
        private C6008b() {
        }

        public void invoke(Object obj, C1256g gVar) {
            Bundle bundle = (Bundle) obj;
            String string = bundle.getString("icon_url");
            String string2 = bundle.getString("page_url");
            String string3 = bundle.getString(FFmpegMetadataRetriever.METADATA_KEY_TITLE);
            C6009e eVar = new C6009e(this, gVar);
            if (Util.isNullOrNil(string2) || Util.isNullOrNil(string3) || Util.isNullOrNil(string)) {
                Log.m105920e("MicroMsg.WebViewShortcutManager", "url is null");
                C6062v1.m5941b(eVar, false);
                return;
            }
            ((C0235b) C86312j.m106911c(C0235b.class)).mo257AZ(MMApplicationContext.getContext(), C6062v1.m5940a((Bitmap) null, string2, string3, false));
            C20828a.m22825b().mo32524m(string, (ImageView) null, new C6059u1(string2, string3, eVar));
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.luggage.menu.d$a */
    public class C43639a implements C1256g<Bundle> {

        /* renamed from: d */
        public final /* synthetic */ C43658n f117897d;

        /* renamed from: e */
        public final /* synthetic */ Context f117898e;

        public C43639a(C43638d dVar, C43658n nVar, Context context) {
            this.f117897d = nVar;
            this.f117898e = context;
        }

        /* renamed from: a */
        public void mo894a(Object obj) {
            boolean z = ((Bundle) obj).getBoolean("success");
            this.f117897d.f148259i.mo73815b(new C43635b(this, z));
            MMHandlerThread.postToMainThread(new C43636c(this, z));
        }
    }

    public C43638d() {
        super(29);
    }

    /* renamed from: a */
    public void mo67921a(Context context, C43658n nVar, C76874e0 e0Var) {
        boolean z = nVar.f148261n.getBoolean("from_shortcut", false);
        nVar.f117933T0.getClass();
        String str = null;
        String u = Util.isNullOrNil((String) null) ? nVar.mo67942u() : null;
        if (Util.isNullOrNil((String) null)) {
            C43633m1 m1Var = nVar.f117923M;
            String b = m1Var.mo67920b();
            if (!Util.isNullOrNil(b)) {
                str = m1Var.f117891c.get(b);
            }
        }
        if (!z && !Util.isNullOrNil(u) && !Util.isNullOrNil(str) && nVar.mo65805w(255)) {
            e0Var.mo107144g(29, context.getString(C0966R.string.hrc), C0966R.raw.webview_add_shortcut);
            String t = nVar.mo67941t();
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("url", t);
            } catch (JSONException unused) {
            }
            C40314g.m43484c(context, 34, 3401, 1, 1, 0, C15928a.m14857d(jSONObject.toString()));
        }
    }

    /* renamed from: b */
    public void mo67922b(Context context, C43658n nVar, C43657t tVar) {
        String str;
        String str2;
        C43658n nVar2 = nVar;
        Bundle bundle = new Bundle();
        nVar2.f117933T0.getClass();
        if (Util.isNullOrNil((String) null)) {
            C43633m1 m1Var = nVar2.f117923M;
            String b = m1Var.mo67920b();
            String str3 = Util.isNullOrNil(b) ? null : m1Var.f117891c.get(b);
            if (!Util.isNullOrNil(str3)) {
                int lastIndexOf = str3.lastIndexOf("/");
                if (lastIndexOf != -1) {
                    str2 = str3.substring(0, lastIndexOf) + "/0";
                } else {
                    str2 = str3;
                }
                Log.m105925i("MicroMsg.MenuDelegate_AddShortcut", "rawIconUrl : %s, newIconUrl : %s", str3, str2);
                bundle.putString("icon_url", str2);
            } else {
                return;
            }
        } else {
            bundle.putString("icon_url", (String) null);
        }
        if (Util.isNullOrNil((String) null)) {
            String t = nVar.mo67941t();
            Uri parse = Uri.parse(t);
            String query = parse.getQuery();
            String str4 = "ssid=25";
            if (!Util.isNullOrNil(query)) {
                if (query.contains("ssid=")) {
                    str4 = query.replaceFirst("ssid=[0-9]*", str4);
                } else {
                    str4 = query + "&ssid=25";
                }
            }
            try {
                str = new URI(parse.getScheme(), parse.getAuthority(), parse.getPath(), str4, parse.getFragment()).toString();
            } catch (URISyntaxException e) {
                Log.printErrStackTrace("MicroMsg.MenuDelegate_AddShortcut", e, "", new Object[0]);
                str = t;
            }
            Log.m105919d("MicroMsg.MenuDelegate_AddShortcut", "rawUrl : %s, newUrl : %s", t, str);
            bundle.putString("page_url", str);
        } else {
            bundle.putString("page_url", (String) null);
        }
        if (Util.isNullOrNil((String) null)) {
            bundle.putString(FFmpegMetadataRetriever.METADATA_KEY_TITLE, nVar.mo67942u());
        } else {
            bundle.putString(FFmpegMetadataRetriever.METADATA_KEY_TITLE, (String) null);
        }
        C80907o.m98781d(WeChatProcess.PROCESS_MAIN, bundle, C6008b.class, new C43639a(this, nVar2, context));
        C115669n.INSTANCE.mo175911u(C1876t4.CTRL_INDEX, 12);
        String t2 = nVar.mo67941t();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("url", t2);
        } catch (JSONException unused) {
        }
        C40314g.m43484c(context, 34, 3401, 1, 2, 0, C15928a.m14857d(jSONObject.toString()));
    }
}
