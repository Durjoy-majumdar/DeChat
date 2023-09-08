package a93;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import androidx.camera.core.FocusMeteringAction;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.game.report.C40314g;
import com.tencent.p014mm.plugin.messenger.foundation.PluginMessengerFoundation;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.plugin.webview.luggage.jsapi.C43620m2;
import com.tencent.p014mm.plugin.webview.luggage.jsapi.C5984s1;
import com.tencent.p014mm.plugin.webview.luggage.jsapi.b2$$c;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.thumbplayer.tmediacodec.util.MimeTypes;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import di3.C86312j;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import ke3.C88144b;
import org.json.JSONException;
import org.json.JSONObject;
import p158gt.C8451i;
import qo3.C77398g;
import qo3.C77407n;
import rx3.C13598b0;
import wc3.C15133e0;
import wc3.C78541w;
import wd3.C65953v0;

/* renamed from: a93.d */
public final class C0019d {

    /* renamed from: a93.d$a */
    public interface C0020a {
        /* renamed from: a */
        void mo22a(String str, JSONObject jSONObject);
    }

    /* renamed from: a93.d$b */
    public interface C0021b {
    }

    /* renamed from: a93.d$c */
    public static final class C0022c extends C87413o implements C32226l<String, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C0020a f22d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0022c(C0020a aVar) {
            super(1);
            this.f22d = aVar;
        }

        public Object invoke(Object obj) {
            String str = (String) obj;
            C5984s1.f22235e = str;
            C5984s1.f22236f = 2;
            C0020a aVar = this.f22d;
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, "friend");
            } catch (JSONException unused) {
            }
            String nullAsNil = Util.nullAsNil(str);
            C87412m.m108593f(nullAsNil, "nullAsNil(username)");
            aVar.mo22a(nullAsNil, jSONObject);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: a93.d$d */
    public static final class C0023d implements C65953v0 {

        /* renamed from: a */
        public final /* synthetic */ String f23a;

        /* renamed from: b */
        public final /* synthetic */ Context f24b;

        /* renamed from: c */
        public final /* synthetic */ String f25c;

        /* renamed from: d */
        public final /* synthetic */ String f26d;

        /* renamed from: e */
        public final /* synthetic */ JSONObject f27e;

        /* renamed from: f */
        public final /* synthetic */ C0021b f28f;

        /* renamed from: g */
        public final /* synthetic */ C43620m2.C5947b f29g;

        /* renamed from: a93.d$d$a */
        public static final class C0024a implements C8451i.C8452a {

            /* renamed from: a */
            public final /* synthetic */ CountDownLatch f30a;

            public C0024a(CountDownLatch countDownLatch) {
                this.f30a = countDownLatch;
            }

            /* renamed from: a */
            public final void mo24a(Bitmap bitmap, byte[] bArr) {
                this.f30a.countDown();
            }
        }

        public C0023d(String str, Context context, String str2, String str3, JSONObject jSONObject, C0021b bVar, C43620m2.C5947b bVar2) {
            this.f23a = str;
            this.f24b = context;
            this.f25c = str2;
            this.f26d = str3;
            this.f27e = jSONObject;
            this.f28f = bVar;
            this.f29g = bVar2;
        }

        /* renamed from: a */
        public final void mo23a(boolean z, String str, int i) {
            Class cls = C8451i.class;
            if (z) {
                if (!Util.isNullOrNil(this.f23a)) {
                    CountDownLatch countDownLatch = new CountDownLatch(1);
                    long currentTimeMillis = System.currentTimeMillis();
                    ((C8451i) C86312j.m106911c(cls)).bb0(this.f23a, false, new C0024a(countDownLatch));
                    try {
                        countDownLatch.await(FocusMeteringAction.DEFAULT_AUTOCANCEL_DURATION, TimeUnit.MILLISECONDS);
                    } catch (InterruptedException e) {
                        Log.printErrStackTrace("MicroMsg.LuggageMenuSheetHelper", e, "", new Object[0]);
                    } finally {
                        long j = currentTimeMillis - System.currentTimeMillis();
                        ((C8451i) C86312j.m106911c(cls)).mo9372SO(this.f23a);
                        Context context = this.f24b;
                        String str2 = this.f25c;
                        C87412m.m108593f(str2, "appId");
                        String str3 = this.f26d;
                        JSONObject jSONObject = this.f27e;
                        C87412m.m108593f(str, MimeTypes.BASE_TYPE_TEXT);
                        C0026g.m15a(context, str2, str3, jSONObject, str);
                        Log.m105925i("MicroMsg.LuggageMenuSheetHelper", "recent forward send success, loading duration is %d", Long.valueOf(j));
                    }
                } else {
                    Context context2 = this.f24b;
                    String str4 = this.f25c;
                    C87412m.m108593f(str4, "appId");
                    String str5 = this.f26d;
                    JSONObject jSONObject2 = this.f27e;
                    C87412m.m108593f(str, MimeTypes.BASE_TYPE_TEXT);
                    C0026g.m15a(context2, str4, str5, jSONObject2, str);
                }
                C0021b bVar = this.f28f;
                if (bVar != null) {
                    C40314g.m43484c(MMApplicationContext.getContext(), 20, 2001, 2, 48, 0, b2$$c.C5887d.this.f22111b);
                }
                this.f29g.mo6945a((String) null, (JSONObject) null);
                Context context3 = this.f24b;
                if (context3 instanceof Activity) {
                    ((Activity) context3).finish();
                }
                ((PluginMessengerFoundation) C86312j.m106911c(PluginMessengerFoundation.class)).mo96076P7().mo90704g(this.f26d);
                return;
            }
            C0021b bVar2 = this.f28f;
            if (bVar2 != null) {
                C40314g.m43484c(MMApplicationContext.getContext(), 20, 2001, 2, 56, 0, b2$$c.C5887d.this.f22111b);
            }
            this.f29g.mo6945a("cancel", (JSONObject) null);
        }
    }

    /* renamed from: a93.d$e */
    public static final class C0025e implements C77398g.C77402i.C77404b {

        /* renamed from: a */
        public final /* synthetic */ String f31a;

        /* renamed from: b */
        public final /* synthetic */ Context f32b;

        public C0025e(String str, Context context) {
            this.f31a = str;
            this.f32b = context;
        }

        /* renamed from: a */
        public final void mo25a() {
            if (Util.isNullOrNil(this.f31a)) {
                Log.m105924i("MicroMsg.LuggageMenuSheetHelper", "webview recent share: onContentClick: url is null");
                return;
            }
            Intent intent = new Intent();
            intent.putExtra("rawUrl", this.f31a);
            intent.putExtra("hide_option_menu", true);
            C88144b.m109791i(this.f32b, "webview", ".ui.tools.WebViewUI", intent, (Bundle) null);
        }
    }

    /* renamed from: a */
    public static final void m9a(Context context, C77407n nVar, C0020a aVar) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(nVar, "bottomSheet");
        C87412m.m108594g(aVar, "forwardClick");
        ((C15133e0) C86312j.m106911c(C15133e0.class)).Ct0().Q60(context, nVar, 4, (C32226l<? super Boolean, C13598b0>) null, new C0022c(aVar));
    }

    /* renamed from: b */
    public static final boolean m10b(Context context, String str, String str2, JSONObject jSONObject, C43620m2.C5947b bVar, C0021b bVar2) {
        Context context2 = context;
        String str3 = str2;
        JSONObject jSONObject2 = jSONObject;
        C43620m2.C5947b bVar3 = bVar;
        C87412m.m108594g(context, "context");
        String str4 = str;
        C87412m.m108594g(str, "sourceUserName");
        C87412m.m108594g(str3, "clickUrl");
        C87412m.m108594g(jSONObject2, "data");
        C87412m.m108594g(bVar3, "callback");
        if (Util.isNullOrNil(str)) {
            bVar3.mo6945a("fail", (JSONObject) null);
            return false;
        }
        String optString = jSONObject2.optString(FFmpegMetadataRetriever.METADATA_KEY_TITLE);
        String optString2 = jSONObject2.optString("img_url");
        String optString3 = jSONObject2.optString("appid");
        String string = context.getResources().getString(C0966R.string.a3w);
        C87412m.m108593f(string, "context.resources.getStr…libmmui.R.string.app_url)");
        StringBuffer stringBuffer = new StringBuffer(string);
        stringBuffer.append(optString);
        String stringBuffer2 = stringBuffer.toString();
        C87412m.m108593f(stringBuffer2, "StringBuffer(tips).append(orgTitle).toString()");
        C0023d dVar = new C0023d(optString2, context, optString3, str, jSONObject, bVar2, bVar);
        ((C78541w) C86312j.m106911c(C78541w.class)).ph0(context, str, stringBuffer2, dVar, new C0025e(str3, context), (DialogInterface.OnDismissListener) null);
        return true;
    }
}
