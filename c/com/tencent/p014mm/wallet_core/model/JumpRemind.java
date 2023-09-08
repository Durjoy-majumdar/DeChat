package com.tencent.p014mm.wallet_core.model;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import com.tencent.kinda.gen.CppUtil;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.WebViewUIDestroyEvent;
import com.tencent.p014mm.autogen.events.WxPayGdprResultEvent;
import com.tencent.p014mm.p136ui.tools.C7021t1;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import di3.C86312j;
import ie3.C76324c;
import nj3.C76879j;
import org.json.JSONObject;
import qe3.C89625d;
import te3.C77942hl2;
import te3.C78024zp3;

/* renamed from: com.tencent.mm.wallet_core.model.JumpRemind */
public class JumpRemind {

    /* renamed from: a */
    public int f220972a;

    /* renamed from: b */
    public boolean f220973b;

    /* renamed from: c */
    public String f220974c;

    /* renamed from: d */
    public String f220975d;

    /* renamed from: e */
    public String f220976e;

    /* renamed from: f */
    public C75096g f220977f;

    /* renamed from: g */
    public String f220978g;

    /* renamed from: h */
    public C75124l f220979h;

    /* renamed from: i */
    public boolean f220980i = false;

    /* renamed from: j */
    public boolean f220981j = true;

    /* renamed from: k */
    public IListener<WxPayGdprResultEvent> f220982k;

    /* renamed from: l */
    public IListener<WebViewUIDestroyEvent> f220983l;

    /* renamed from: m */
    public boolean f220984m;

    /* renamed from: com.tencent.mm.wallet_core.model.JumpRemind$a */
    public class C75090a implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ Activity f220987d;

        public C75090a(Activity activity) {
            this.f220987d = activity;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            Log.m105924i("MicroMsg.JumpRemind", "onClick1 ");
            C75096g gVar = JumpRemind.this.f220977f;
            if (gVar == null || !gVar.f221001c.equals("right_button_wording")) {
                JumpRemind.this.f220979h.onCancel();
            } else {
                JumpRemind.this.mo104781e(this.f220987d);
            }
        }
    }

    /* renamed from: com.tencent.mm.wallet_core.model.JumpRemind$b */
    public class C75091b implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ Activity f220989d;

        public C75091b(Activity activity) {
            this.f220989d = activity;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            Log.m105924i("MicroMsg.JumpRemind", "onClick2");
            C75096g gVar = JumpRemind.this.f220977f;
            if (gVar == null || !gVar.f221001c.equals("left_button_wording")) {
                JumpRemind.this.f220979h.onCancel();
            } else {
                JumpRemind.this.mo104781e(this.f220989d);
            }
        }
    }

    /* renamed from: com.tencent.mm.wallet_core.model.JumpRemind$c */
    public class C75092c implements C75124l {

        /* renamed from: a */
        public final /* synthetic */ C75121j f220991a;

        /* renamed from: b */
        public final /* synthetic */ Activity f220992b;

        public C75092c(C75121j jVar, Activity activity) {
            this.f220991a = jVar;
            this.f220992b = activity;
        }

        public void onCancel() {
            if (JumpRemind.this.mo104780b()) {
                this.f220991a.mo95711a();
            } else {
                this.f220992b.finish();
            }
        }

        public void onEnter() {
            JumpRemind.this.getClass();
        }

        public void onUrlCancel() {
            if (JumpRemind.this.mo104780b()) {
                this.f220991a.mo95711a();
            } else {
                this.f220992b.finish();
            }
        }

        public void onUrlOk() {
            if (JumpRemind.this.mo104780b()) {
                this.f220991a.mo95711a();
            }
        }
    }

    /* renamed from: com.tencent.mm.wallet_core.model.JumpRemind$d */
    public class C75093d implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C75122k f220994d;

        public C75093d(C75122k kVar) {
            this.f220994d = kVar;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            Log.m105924i("MicroMsg.JumpRemind", "onClick1 ");
            C75096g gVar = JumpRemind.this.f220977f;
            if (gVar == null || !gVar.f221001c.equals("right_button_wording")) {
                this.f220994d.onCancel();
                return;
            }
            C75122k kVar = this.f220994d;
            C75096g gVar2 = JumpRemind.this.f220977f;
            kVar.mo95653a(gVar2.f220999a, gVar2.f221000b);
        }
    }

    /* renamed from: com.tencent.mm.wallet_core.model.JumpRemind$e */
    public class C75094e implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C75122k f220996d;

        public C75094e(C75122k kVar) {
            this.f220996d = kVar;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            Log.m105924i("MicroMsg.JumpRemind", "onClick2");
            C75096g gVar = JumpRemind.this.f220977f;
            if (gVar == null || !gVar.f221001c.equals("left_button_wording")) {
                this.f220996d.onCancel();
                return;
            }
            C75122k kVar = this.f220996d;
            C75096g gVar2 = JumpRemind.this.f220977f;
            kVar.mo95653a(gVar2.f220999a, gVar2.f221000b);
        }
    }

    /* renamed from: com.tencent.mm.wallet_core.model.JumpRemind$f */
    public class C75095f implements C75127o {
        public C75095f() {
        }

        public void onActivityResult(int i, int i2, Intent intent) {
            JumpRemind.this.f220982k.dead();
            JumpRemind.this.f220983l.dead();
        }

        public void onCreate() {
        }

        public void onDestroy() {
            JumpRemind.this.f220982k.dead();
            JumpRemind.this.f220983l.dead();
        }
    }

    /* renamed from: com.tencent.mm.wallet_core.model.JumpRemind$g */
    public static class C75096g {

        /* renamed from: a */
        public int f220999a;

        /* renamed from: b */
        public String f221000b;

        /* renamed from: c */
        public String f221001c;
    }

    public JumpRemind() {
        C40008f fVar = C40008f.f107254d;
        this.f220982k = new IListener<WxPayGdprResultEvent>(fVar) {
            {
                this.__eventId = -553207673;
            }

            public boolean callback(IEvent iEvent) {
                Log.m105924i("MicroMsg.JumpRemind", "WxPayGdprResultEvent result");
                JumpRemind.this.f220980i = true;
                MMHandlerThread.postToMainThread(new C75154x(this, (WxPayGdprResultEvent) iEvent));
                JumpRemind.this.f220982k.dead();
                return false;
            }
        };
        this.f220983l = new IListener<WebViewUIDestroyEvent>(fVar) {
            {
                this.__eventId = -1681666147;
            }

            public boolean callback(IEvent iEvent) {
                WebViewUIDestroyEvent webViewUIDestroyEvent = (WebViewUIDestroyEvent) iEvent;
                Log.m105924i("MicroMsg.JumpRemind", "WebViewUIDestroyEvent close");
                JumpRemind.this.f220983l.dead();
                MMHandlerThread.postToMainThreadDelayed(new C75156y(this), 200);
                return false;
            }
        };
        this.f220984m = false;
    }

    /* renamed from: c */
    public static JumpRemind m90058c(JSONObject jSONObject) {
        if (jSONObject != null) {
            try {
                ((C76324c) C86312j.m106911c(C76324c.class)).ensureLibraryLoaded();
                Log.m105925i("MicroMsg.JumpRemind", "feed %s", CppUtil.getFilterLog(jSONObject.toString()));
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.JumpRemind", e, "error create", new Object[0]);
                return null;
            }
        }
        JSONObject optJSONObject = jSONObject.optJSONObject("bindquerynew_resp");
        if (optJSONObject != null) {
            jSONObject = optJSONObject;
        }
        JSONObject optJSONObject2 = jSONObject.optJSONObject("bindqueryresp");
        if (optJSONObject2 != null) {
            jSONObject = optJSONObject2;
        }
        JSONObject optJSONObject3 = jSONObject.optJSONObject("jumpRemind");
        if (optJSONObject3 == null) {
            optJSONObject3 = jSONObject.optJSONObject("jump_remind");
        }
        if (optJSONObject3 == null) {
            optJSONObject3 = jSONObject.optJSONObject("jump_remind_info");
        }
        if (optJSONObject3 == null) {
            return null;
        }
        JumpRemind jumpRemind = new JumpRemind();
        jumpRemind.f220972a = optJSONObject3.optInt("jump_type");
        jumpRemind.f220973b = optJSONObject3.optBoolean("is_pop_up_windows");
        jumpRemind.f220974c = optJSONObject3.optString("wording");
        jumpRemind.f220975d = optJSONObject3.optString("left_button_wording");
        jumpRemind.f220976e = optJSONObject3.optString("right_button_wording");
        jumpRemind.f220978g = optJSONObject3.optString(FFmpegMetadataRetriever.METADATA_KEY_TITLE);
        JSONObject optJSONObject4 = optJSONObject3.optJSONObject("url");
        C75096g gVar = new C75096g();
        jumpRemind.f220977f = gVar;
        if (optJSONObject4 != null) {
            gVar.f220999a = optJSONObject4.optInt("type");
            C75096g gVar2 = jumpRemind.f220977f;
            optJSONObject4.optString("appid");
            gVar2.getClass();
            C75096g gVar3 = jumpRemind.f220977f;
            optJSONObject4.optString("app_version");
            gVar3.getClass();
            jumpRemind.f220977f.f221000b = optJSONObject4.optString("path");
            jumpRemind.f220977f.f221001c = optJSONObject4.optString("button_name");
        }
        return jumpRemind;
    }

    /* renamed from: d */
    public static JumpRemind m90059d(C77942hl2 hl22) {
        if (hl22 == null) {
            return null;
        }
        JumpRemind jumpRemind = new JumpRemind();
        jumpRemind.f220973b = hl22.f227572e;
        jumpRemind.f220972a = hl22.f227571d;
        jumpRemind.f220974c = hl22.f227573f;
        jumpRemind.f220975d = hl22.f227574g;
        jumpRemind.f220976e = hl22.f227575h;
        jumpRemind.f220978g = hl22.f227577j;
        C75096g gVar = new C75096g();
        jumpRemind.f220977f = gVar;
        C78024zp3 zp32 = hl22.f227576i;
        if (zp32 != null) {
            gVar.f220999a = zp32.f228746d;
            String str = zp32.f228747e;
            C75096g gVar2 = jumpRemind.f220977f;
            String str2 = hl22.f227576i.f228748f;
            gVar2.getClass();
            C75096g gVar3 = jumpRemind.f220977f;
            C78024zp3 zp33 = hl22.f227576i;
            gVar3.f221000b = zp33.f228749g;
            gVar3.f221001c = zp33.f228750h;
        }
        return jumpRemind;
    }

    /* renamed from: a */
    public void mo104779a() {
        C75096g gVar = this.f220977f;
        if (gVar != null && !Util.isNullOrNil(gVar.f221000b)) {
            if (this.f220977f.f221000b.contains("clientversion")) {
                Log.m105928w("MicroMsg.JumpRemind", "url.path contain clientversion");
                return;
            }
            C75096g gVar2 = this.f220977f;
            String str = gVar2.f221000b;
            gVar2.f221000b = C7021t1.m7266a(str, "clientversion" + "=" + C89625d.f257841g);
        }
    }

    /* renamed from: b */
    public boolean mo104780b() {
        return this.f220972a == 1;
    }

    /* renamed from: e */
    public final void mo104781e(Context context) {
        if (context instanceof C75125m) {
            ((C75125m) context).register(new C75095f());
            this.f220982k.alive();
            this.f220983l.alive();
            this.f220980i = false;
            Intent intent = new Intent();
            intent.putExtra("rawUrl", this.f220977f.f221000b);
            intent.putExtra("showShare", false);
            this.f220979h.onEnter();
            C75228t.m90217J(context, intent);
        } else if (this.f220984m) {
            this.f220982k.alive();
            this.f220983l.alive();
            this.f220980i = false;
            Intent intent2 = new Intent();
            intent2.putExtra("rawUrl", this.f220977f.f221000b);
            intent2.putExtra("showShare", false);
            this.f220979h.onEnter();
            C75228t.m90217J(context, intent2);
        }
    }

    /* renamed from: f */
    public boolean mo104782f(Activity activity, C75121j jVar) {
        mo104784h(activity, new C75092c(jVar, activity));
        return true;
    }

    /* renamed from: g */
    public boolean mo104783g(Activity activity, C75122k kVar) {
        C76879j.m92707A(activity, this.f220974c, this.f220978g, this.f220976e, this.f220975d, new C75093d(kVar), new C75094e(kVar));
        return true;
    }

    /* renamed from: h */
    public boolean mo104784h(Activity activity, C75124l lVar) {
        this.f220979h = lVar;
        if (this.f220973b) {
            C76879j.m92717K(activity, this.f220981j, this.f220974c, this.f220978g, this.f220976e, this.f220975d, new C75090a(activity), new C75091b(activity));
            return true;
        }
        mo104781e(activity);
        return true;
    }
}
