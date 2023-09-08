package com.tencent.p014mm.plugin.appbrand.jsapi.share;

import android.app.Activity;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.ipcinvoker.C80916r;
import com.tencent.p014mm.ipcinvoker.extension.XIPCInvoker;
import com.tencent.p014mm.ipcinvoker.type.IPCVoid;
import com.tencent.p014mm.ipcinvoker.wx_extension.C40324j;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.appbrand.AppBrandRuntimeWC;
import com.tencent.p014mm.plugin.appbrand.C83727p2;
import com.tencent.p014mm.plugin.appbrand.C84072q1;
import com.tencent.p014mm.plugin.appbrand.config.AppBrandInitConfigWC;
import com.tencent.p014mm.plugin.appbrand.config.AppBrandSysConfigWC;
import com.tencent.p014mm.plugin.appbrand.config.AppBrandWeishiParams;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.jsapi.share.JsApiShareAppMessageBase.C82939f;
import com.tencent.p014mm.plugin.appbrand.luggage.export.functionalpage.C1938p;
import com.tencent.p014mm.plugin.appbrand.luggage.export.functionalpage.C83563j;
import com.tencent.p014mm.plugin.appbrand.menu.C83699y;
import com.tencent.p014mm.plugin.appbrand.page.C83928t1;
import com.tencent.p014mm.plugin.appbrand.report.AppBrandStatObject;
import com.tencent.p014mm.plugin.appbrand.weishi.C84905f;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatProcess;
import com.tencent.p014mm.sendtowework.AppBrandData;
import di3.C86312j;
import eb0.C86493v0;
import f62.C75708t0;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import ke3.C88144b;
import kr0.C88267e;
import nj3.C76879j;
import ob0.C47350c;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p170ic.C87687a;
import p225rc.C89916g;
import p225rc.g$$f;
import pe3.C47465a;
import te3.p44;
import te3.q44;
import wi0.C90972a;
import xn0.C91304m;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.share.JsApiShareAppMessageBase */
public abstract class JsApiShareAppMessageBase<Param extends C82939f> extends C82268c<C88267e> {

    /* renamed from: g */
    public final int f242441g = C87687a.m109085a(this);

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.share.JsApiShareAppMessageBase$a */
    public class C40476a implements C40324j.C40326a {

        /* renamed from: a */
        public final /* synthetic */ Intent f108767a;

        /* renamed from: b */
        public final /* synthetic */ C82939f f108768b;

        /* renamed from: c */
        public final /* synthetic */ C88267e f108769c;

        /* renamed from: d */
        public final /* synthetic */ int f108770d;

        public C40476a(Intent intent, C82939f fVar, C88267e eVar, int i) {
            this.f108767a = intent;
            this.f108768b = fVar;
            this.f108769c = eVar;
            this.f108770d = i;
        }

        /* renamed from: a */
        public void mo288a(int i, int i2, String str, C47350c cVar) {
            C47465a aVar;
            if (i != 0 || i2 != 0 || cVar == null || (aVar = cVar.f127056b.f127083a) == null || !(aVar instanceof q44)) {
                Log.m105920e("MicroMsg.JsApiShareAppMessageBase", "shareTransId fail, convert openId to username fail");
                this.f108769c.mo109647a(this.f108770d, JsApiShareAppMessageBase.this.mo115109j("fail:convert openId to username fail"));
                return;
            }
            q44 q44 = (q44) aVar;
            if (q44.f140137d.f138956d == 0 && !Util.isNullOrNil(q44.f140138e)) {
                Log.m105925i("MicroMsg.JsApiShareAppMessageBase", "shareTransId success, username:%s", q44.f140138e);
                this.f108767a.putExtra("Select_Conv_User", q44.f140138e);
                this.f108767a.putExtra("KSendWording", this.f108768b.f242470a.getResources().getString(C0966R.string.a8v));
                JsApiShareAppMessageBase.this.mo115206G(this.f108769c, this.f108770d, this.f108768b, this.f108767a, true);
            } else if (!Util.isNullOrNil(q44.f140137d.f138957e)) {
                Log.m105921e("MicroMsg.JsApiShareAppMessageBase", "shareTransId fail, response error msg:%s", q44.f140137d.f138957e);
                C88267e eVar = this.f108769c;
                int i3 = this.f108770d;
                JsApiShareAppMessageBase jsApiShareAppMessageBase = JsApiShareAppMessageBase.this;
                eVar.mo109647a(i3, jsApiShareAppMessageBase.mo115109j("fail:" + q44.f140137d.f138957e));
            } else {
                Log.m105920e("MicroMsg.JsApiShareAppMessageBase", "shareTransId fail, response username is null");
                this.f108769c.mo109647a(this.f108770d, JsApiShareAppMessageBase.this.mo115109j("fail:response username is null"));
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.share.JsApiShareAppMessageBase$b */
    public class C82934b implements MMActivity.C6739d {

        /* renamed from: d */
        public final /* synthetic */ C88267e f242448d;

        /* renamed from: e */
        public final /* synthetic */ int f242449e;

        /* renamed from: f */
        public final /* synthetic */ C82939f f242450f;

        public C82934b(C88267e eVar, int i, C82939f fVar) {
            this.f242448d = eVar;
            this.f242449e = i;
            this.f242450f = fVar;
        }

        public void mmOnActivityResult(int i, int i2, Intent intent) {
            int i3 = i2;
            Intent intent2 = intent;
            Class<C82940g> cls = C82940g.class;
            if (i != JsApiShareAppMessageBase.this.f242441g) {
                Log.m105925i("MicroMsg.JsApiShareAppMessageBase", "requestCode(%d) not corrected.", Integer.valueOf(i));
                return;
            }
            String stringExtra = intent2 == null ? null : intent2.getStringExtra("Select_Conv_User");
            boolean z = intent2 != null && intent2.getBooleanExtra("KSendGroupToDo", false);
            int intExtra = intent2 == null ? 0 : intent2.getIntExtra("KShowTodoIntroduceView", 0);
            if (i3 != -1) {
                Log.m105925i("MicroMsg.JsApiShareAppMessageBase", "resultCode is not RESULT_OK(%d)", Integer.valueOf(i2));
                boolean z2 = intent2 != null && intent2.getBooleanExtra("finish_by_forward_to_wework", false);
                Log.m105925i("MicroMsg.JsApiShareAppMessageBase", "mmOnActivityResult, finishByForwardToWeWork: %b", Boolean.valueOf(z2));
                if (z2) {
                    C88267e eVar = this.f242448d;
                    int i4 = this.f242449e;
                    JsApiShareAppMessageBase jsApiShareAppMessageBase = JsApiShareAppMessageBase.this;
                    jsApiShareAppMessageBase.getClass();
                    if (BuildInfo.DEBUG) {
                        Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", 0, "ok");
                    }
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("errno", 0);
                    } catch (Exception e) {
                        Log.m105921e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e);
                    }
                    eVar.mo109647a(i4, jsApiShareAppMessageBase.mo115115p("ok", jSONObject));
                    return;
                }
                JsApiShareAppMessageBase.this.mo115203D(this.f242450f, i3);
                C88267e eVar2 = this.f242448d;
                int i5 = this.f242449e;
                JsApiShareAppMessageBase jsApiShareAppMessageBase2 = JsApiShareAppMessageBase.this;
                jsApiShareAppMessageBase2.getClass();
                if (BuildInfo.DEBUG) {
                    Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", 1, "cancel");
                }
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject2.put("errno", 1);
                } catch (Exception e2) {
                    Log.m105921e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e2);
                }
                eVar2.mo109647a(i5, jsApiShareAppMessageBase2.mo115115p("cancel", jSONObject2));
                JsApiShareAppMessageBase jsApiShareAppMessageBase3 = JsApiShareAppMessageBase.this;
                C82939f fVar = this.f242450f;
                String str = fVar.f242492w;
                String str2 = fVar.f242472c.f261061d;
                jsApiShareAppMessageBase3.getClass();
                XIPCInvoker.m98749b(WeChatProcess.PROCESS_MAIN, new ShareDialogTodoReportData(stringExtra, str, str2, z ? 1 : 0, intExtra, 1), cls);
            } else if (stringExtra == null || stringExtra.length() == 0) {
                Log.m105920e("MicroMsg.JsApiShareAppMessageBase", "mmOnActivityResult fail, toUser is null");
                JsApiShareAppMessageBase.this.mo115202C(this.f242450f);
                this.f242448d.mo109647a(this.f242449e, JsApiShareAppMessageBase.this.mo115109j("fail:selected user is nil"));
            } else {
                Log.m105925i("MicroMsg.JsApiShareAppMessageBase", "result success toUser : %s ", stringExtra);
                String stringExtra2 = intent2.getStringExtra("custom_send_text");
                JsApiShareAppMessageBase jsApiShareAppMessageBase4 = JsApiShareAppMessageBase.this;
                C82939f fVar2 = this.f242450f;
                String str3 = fVar2.f242492w;
                String str4 = fVar2.f242472c.f261061d;
                jsApiShareAppMessageBase4.getClass();
                String str5 = "ok";
                XIPCInvoker.m98749b(WeChatProcess.PROCESS_MAIN, new ShareDialogTodoReportData(stringExtra, str3, str4, z ? 1 : 0, intExtra, 2), cls);
                JsApiShareAppMessageBase jsApiShareAppMessageBase5 = JsApiShareAppMessageBase.this;
                C88267e eVar3 = this.f242448d;
                int i6 = this.f242449e;
                C82939f fVar3 = this.f242450f;
                jsApiShareAppMessageBase5.getClass();
                SendAppMessageTask sendAppMessageTask = new SendAppMessageTask();
                SendAppMessageTask sendAppMessageTask2 = sendAppMessageTask;
                jsApiShareAppMessageBase5.mo115200A(sendAppMessageTask, stringExtra, stringExtra2, z, eVar3, fVar3);
                if (fVar3.f242473d) {
                    sendAppMessageTask2.f242533X0 = new C82960f(jsApiShareAppMessageBase5, sendAppMessageTask2, eVar3, i6, fVar3, stringExtra);
                    sendAppMessageTask2.mo114395c();
                } else {
                    sendAppMessageTask2.mo114395c();
                    eVar3.mo109647a(i6, jsApiShareAppMessageBase5.mo115112m(str5, jsApiShareAppMessageBase5.mo115201B(fVar3, sendAppMessageTask2, stringExtra)));
                    jsApiShareAppMessageBase5.mo115204E(false, fVar3, stringExtra);
                }
                Activity activity = fVar3.f242470a;
                if (activity != null) {
                    C76879j.m92726T(activity, activity.getResources().getString(C0966R.string.f7603l4));
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.share.JsApiShareAppMessageBase$c */
    public class C82935c implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C82939f f242452d;

        /* renamed from: e */
        public final /* synthetic */ MMActivity.C6739d f242453e;

        /* renamed from: f */
        public final /* synthetic */ boolean f242454f;

        /* renamed from: g */
        public final /* synthetic */ Intent f242455g;

        /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.share.JsApiShareAppMessageBase$c$a */
        public class C82936a implements g$$f {
            public C82936a() {
            }

            /* renamed from: b */
            public boolean mo1596b(int i, int i2, Intent intent) {
                C82935c cVar = C82935c.this;
                if (JsApiShareAppMessageBase.this.f242441g != i) {
                    return false;
                }
                cVar.f242453e.mmOnActivityResult(i, i2, intent);
                return true;
            }
        }

        public C82935c(C82939f fVar, MMActivity.C6739d dVar, boolean z, Intent intent) {
            this.f242452d = fVar;
            this.f242453e = dVar;
            this.f242454f = z;
            this.f242455g = intent;
        }

        public void run() {
            C89916g.m112446a(this.f242452d.f242470a).mo124232f(new C82936a());
            C88144b.m109802t(this.f242452d.f242470a, this.f242454f ? ".ui.transmit.SelectConversationDirectSelectUI" : ".ui.transmit.SelectConversationUI", this.f242455g, JsApiShareAppMessageBase.this.f242441g);
            if (!this.f242454f) {
                this.f242452d.f242470a.overridePendingTransition(C0966R.C0968anim.f2492eg, C0966R.C0968anim.f2333y);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.share.JsApiShareAppMessageBase$d */
    public interface C82937d {
        /* renamed from: a */
        <ShareParams extends C82939f> void mo115216a(ShareParams shareparams, Intent intent);

        /* renamed from: b */
        <ShareParams extends C82939f> void mo115217b(ShareParams shareparams, SendAppMessageTask sendAppMessageTask, C88267e eVar);

        /* renamed from: c */
        <ShareParams extends C82939f> void mo115218c(ShareParams shareparams, boolean z);

        /* renamed from: d */
        <ShareParams extends C82939f> void mo115219d(ShareParams shareparams, C88267e eVar, JSONObject jSONObject);

        /* renamed from: e */
        <ShareParams extends C82939f> boolean mo115220e(ShareParams shareparams);
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.share.JsApiShareAppMessageBase$e */
    public static class C82938e extends IllegalArgumentException {
        public C82938e(String str) {
            super(str);
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.share.JsApiShareAppMessageBase$f */
    public static class C82939f {

        /* renamed from: A */
        public String f242458A;

        /* renamed from: B */
        public boolean f242459B;

        /* renamed from: C */
        public String f242460C;

        /* renamed from: D */
        public boolean f242461D = false;

        /* renamed from: E */
        public String f242462E = "";

        /* renamed from: F */
        public String f242463F = "";

        /* renamed from: G */
        public String f242464G = "";

        /* renamed from: H */
        public boolean f242465H;

        /* renamed from: I */
        public HashMap<String, Object> f242466I;

        /* renamed from: J */
        public int f242467J = 0;

        /* renamed from: K */
        public String f242468K;

        /* renamed from: L */
        public boolean f242469L;

        /* renamed from: a */
        public Activity f242470a = null;

        /* renamed from: b */
        public C83928t1 f242471b = null;

        /* renamed from: c */
        public AppBrandSysConfigWC f242472c = null;

        /* renamed from: d */
        public boolean f242473d = false;

        /* renamed from: e */
        public int f242474e = -1;

        /* renamed from: f */
        public String f242475f;

        /* renamed from: g */
        public String f242476g;

        /* renamed from: h */
        public String f242477h;

        /* renamed from: i */
        public String f242478i;

        /* renamed from: j */
        public String f242479j;

        /* renamed from: k */
        public boolean f242480k;

        /* renamed from: l */
        public String f242481l;

        /* renamed from: m */
        public int f242482m = 0;

        /* renamed from: n */
        public String f242483n;

        /* renamed from: o */
        public String f242484o;

        /* renamed from: p */
        public String f242485p;

        /* renamed from: q */
        public C82937d f242486q;

        /* renamed from: r */
        public boolean f242487r;

        /* renamed from: s */
        public boolean f242488s;

        /* renamed from: t */
        public boolean f242489t;

        /* renamed from: u */
        public String f242490u;

        /* renamed from: v */
        public String f242491v;

        /* renamed from: w */
        public String f242492w;

        /* renamed from: x */
        public int f242493x;

        /* renamed from: y */
        public int f242494y;

        /* renamed from: z */
        public int f242495z;

        public String toString() {
            return "Params{context=" + this.f242470a + ", pageView=" + this.f242471b + ", config=" + this.f242472c + ", withShareTicket=" + this.f242473d + ", type=" + this.f242474e + ", subType=" + this.f242482m + ", title='" + this.f242475f + '\'' + ", desc='" + this.f242476g + '\'' + ", pagePath='" + this.f242477h + '\'' + ", imageUrl='" + this.f242478i + '\'' + ", cacheKey='" + this.f242479j + '\'' + ", disableForward=" + this.f242480k + ", messageExtraData='" + this.f242481l + '\'' + ", mShareExtImp=" + this.f242486q + ", isDynamicMsg=" + this.f242487r + ", isUpdateMsg=" + this.f242488s + ", isPrivateMsg=" + this.f242489t + ", templateId='" + this.f242490u + '\'' + ", appId='" + this.f242491v + '\'' + ", userName='" + this.f242492w + '\'' + ", pkgType=" + this.f242493x + ", pkgVersion=" + this.f242494y + ", finalAppServiceTypeReport=" + this.f242495z + ", errorUrl='" + this.f242458A + '\'' + ", needDelThumb=" + this.f242459B + ", imgPath='" + this.f242460C + '\'' + ", useDefaultSnapshot=" + this.f242461D + ", msgParams=" + this.f242466I + ", todoActivityId=" + this.f242464G + ", isToDoMessage=" + this.f242465H + ", kv14077ReportShareSourceType=" + this.f242467J + ", currentHtmlUrl=" + this.f242468K + ", hasRelievedBuyPlugin=" + this.f242469L + '}';
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.share.JsApiShareAppMessageBase$g */
    public static class C82940g implements C80916r<ShareDialogTodoReportData, IPCVoid> {
        private C82940g() {
        }

        public Object invoke(Object obj) {
            ShareDialogTodoReportData shareDialogTodoReportData = (ShareDialogTodoReportData) obj;
            ((C75708t0) C86312j.m106911c(C75708t0.class)).Xf0(shareDialogTodoReportData.f242442d, shareDialogTodoReportData.f242443e, shareDialogTodoReportData.f242444f, shareDialogTodoReportData.f242445g, shareDialogTodoReportData.f242446h, shareDialogTodoReportData.f242447i);
            return new IPCVoid();
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.share.JsApiShareAppMessageBase$h */
    public static class C82941h implements C82937d {

        /* renamed from: a */
        public String f242496a;

        /* renamed from: a */
        public <ShareParams extends C82939f> void mo115216a(ShareParams shareparams, Intent intent) {
            HashMap hashMap = new HashMap(4);
            hashMap.put("img_url", shareparams.f242478i);
            hashMap.put(FFmpegMetadataRetriever.METADATA_KEY_TITLE, shareparams.f242475f);
            hashMap.put("desc", shareparams.f242476g);
            hashMap.put("url", this.f242496a);
            intent.putExtra("webview_params", hashMap);
        }

        /* renamed from: b */
        public <ShareParams extends C82939f> void mo115217b(ShareParams shareparams, SendAppMessageTask sendAppMessageTask, C88267e eVar) {
            sendAppMessageTask.f242504B = 5;
            sendAppMessageTask.f242549o = this.f242496a;
        }

        /* renamed from: c */
        public <ShareParams extends C82939f> void mo115218c(ShareParams shareparams, boolean z) {
        }

        /* renamed from: d */
        public <ShareParams extends C82939f> void mo115219d(ShareParams shareparams, C88267e eVar, JSONObject jSONObject) {
            String optString = jSONObject.optString("link");
            this.f242496a = optString;
            if (!Util.isNullOrNil(optString)) {
                shareparams.f242466I.put("is_h5", Boolean.TRUE);
            } else {
                Log.m105928w("MicroMsg.JsApiShareAppMessageBase", "hy: is h5 share type but no link!");
                throw new C82938e("is h5 share type but no h5 link");
            }
        }

        /* renamed from: e */
        public <ShareParams extends C82939f> boolean mo115220e(ShareParams shareparams) {
            return Util.nullAsNil(shareparams.f242460C).startsWith("delayLoadFile://");
        }

        public String toString() {
            return "ShareTypeH5{h5Link='" + this.f242496a + '\'' + '}';
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.share.JsApiShareAppMessageBase$i */
    public static class C82942i implements C82937d {
        public C82942i(C40476a aVar) {
        }

        /* renamed from: a */
        public <ShareParams extends C82939f> void mo115216a(ShareParams shareparams, Intent intent) {
        }

        /* renamed from: b */
        public <ShareParams extends C82939f> void mo115217b(ShareParams shareparams, SendAppMessageTask sendAppMessageTask, C88267e eVar) {
        }

        /* renamed from: c */
        public <ShareParams extends C82939f> void mo115218c(ShareParams shareparams, boolean z) {
        }

        /* renamed from: d */
        public <ShareParams extends C82939f> void mo115219d(ShareParams shareparams, C88267e eVar, JSONObject jSONObject) {
        }

        /* renamed from: e */
        public <ShareParams extends C82939f> boolean mo115220e(ShareParams shareparams) {
            return Util.nullAsNil(shareparams.f242460C).startsWith("delayLoadFile://");
        }

        public String toString() {
            return "ShareTypeNormal{}";
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.share.JsApiShareAppMessageBase$j */
    public static class C82943j implements C82937d {

        /* renamed from: a */
        public String f242497a;

        /* renamed from: b */
        public String f242498b;

        /* renamed from: c */
        public String f242499c;

        /* renamed from: d */
        public String f242500d;

        /* renamed from: e */
        public String f242501e;

        /* renamed from: f */
        public String f242502f;

        /* renamed from: a */
        public <ShareParams extends C82939f> void mo115216a(ShareParams shareparams, Intent intent) {
        }

        /* renamed from: b */
        public <ShareParams extends C82939f> void mo115217b(ShareParams shareparams, SendAppMessageTask sendAppMessageTask, C88267e eVar) {
            sendAppMessageTask.f242504B = 4;
            sendAppMessageTask.f242526U = true;
            sendAppMessageTask.f242521R0 = C82967h0.m101763b(this.f242501e);
            sendAppMessageTask.f242525T0 = C82967h0.m101763b(this.f242502f);
            sendAppMessageTask.f242523S0 = this.f242498b;
            sendAppMessageTask.f242527U0 = this.f242499c;
            sendAppMessageTask.f242529V0 = this.f242500d;
            sendAppMessageTask.f242553r = C82967h0.m101763b(this.f242502f);
        }

        /* renamed from: c */
        public <ShareParams extends C82939f> void mo115218c(ShareParams shareparams, boolean z) {
        }

        /* renamed from: d */
        public <ShareParams extends C82939f> void mo115219d(ShareParams shareparams, C88267e eVar, JSONObject jSONObject) {
            this.f242497a = jSONObject.optString("videoPath");
            String optString = jSONObject.optString("videoThumbPath");
            this.f242498b = jSONObject.optString("videoMD5");
            this.f242499c = jSONObject.optString("videoButtonText");
            this.f242500d = jSONObject.optString("playDesc");
            this.f242501e = C82967h0.m101766e(shareparams.f242471b, this.f242497a, shareparams.f242461D);
            this.f242502f = C82967h0.m101766e(shareparams.f242471b, optString, shareparams.f242461D);
            if (Util.isNullOrNil(this.f242501e) || Util.isNullOrNil(this.f242502f) || Util.isNullOrNil(this.f242498b)) {
                Log.m105928w("MicroMsg.JsApiShareAppMessageBase", "hy: try share video but video path or video thumbpath or md5 is null nil");
                throw new C82938e("try share video but video path or video thumbpath is null nil");
            }
            shareparams.f242466I.put("is_video", Boolean.TRUE);
            shareparams.f242466I.put("footer_icon", shareparams.f242472c.f261063f);
            shareparams.f242466I.put("footer_text", shareparams.f242472c.f261061d);
            shareparams.f242466I.put("video_path", this.f242501e);
            shareparams.f242466I.put("video_thumb_path", this.f242502f);
        }

        /* renamed from: e */
        public <ShareParams extends C82939f> boolean mo115220e(ShareParams shareparams) {
            return Util.nullAsNil(shareparams.f242460C).startsWith("delayLoadFile://") || Util.nullAsNil(this.f242501e).startsWith("delayLoadFile://") || Util.nullAsNil(this.f242502f).startsWith("delayLoadFile://");
        }

        public String toString() {
            return "ShareTypeVideo{videoPath='" + this.f242497a + '\'' + ", videoMD5='" + this.f242498b + '\'' + ", videoButtonText='" + this.f242499c + '\'' + ", videoPlayDesc='" + this.f242500d + '\'' + ", videoPathInFileSystem='" + this.f242501e + '\'' + ", videoThumbPathInFileSystem='" + this.f242502f + '\'' + '}';
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.share.JsApiShareAppMessageBase$k */
    public static class C82944k implements C82937d {
        /* renamed from: a */
        public <ShareParams extends C82939f> void mo115216a(ShareParams shareparams, Intent intent) {
        }

        /* renamed from: b */
        public <ShareParams extends C82939f> void mo115217b(ShareParams shareparams, SendAppMessageTask sendAppMessageTask, C88267e eVar) {
            AppBrandInitConfigWC M1 = eVar.getRuntime().mo113210l1();
            sendAppMessageTask.f242504B = 3;
            AppBrandWeishiParams appBrandWeishiParams = M1.f234848z;
            if (appBrandWeishiParams != null) {
                sendAppMessageTask.f242551p0 = appBrandWeishiParams.f239424h;
                sendAppMessageTask.f242560x0 = appBrandWeishiParams.f239425i;
                sendAppMessageTask.f242562y0 = appBrandWeishiParams.f239426j;
                sendAppMessageTask.f242519Q0 = appBrandWeishiParams.f239421e;
                if (Util.isNullOrNil(sendAppMessageTask.f242550p)) {
                    sendAppMessageTask.f242553r = M1.f234848z.f239422f;
                    sendAppMessageTask.f242554s = false;
                }
            }
        }

        /* renamed from: c */
        public <ShareParams extends C82939f> void mo115218c(ShareParams shareparams, boolean z) {
            C115669n.INSTANCE.mo160131h(16979, shareparams.f242491v, shareparams.f242477h, 0, 3);
        }

        /* renamed from: d */
        public <ShareParams extends C82939f> void mo115219d(ShareParams shareparams, C88267e eVar, JSONObject jSONObject) {
            shareparams.f242461D = false;
            String optString = jSONObject.optString("webpageUrl");
            if (Util.isNullOrNil(optString)) {
                optString = C83727p2.m102773c(eVar.getAppId());
            }
            shareparams.f242458A = optString;
            shareparams.f242466I.put("is_weishi_video", Boolean.TRUE);
            AppBrandInitConfigWC M1 = eVar.getRuntime().mo113210l1();
            AppBrandWeishiParams appBrandWeishiParams = M1.f234848z;
            if (appBrandWeishiParams != null && !Util.isNullOrNil(appBrandWeishiParams.f239423g)) {
                shareparams.f242466I.put("msg_img_path", M1.f234848z.f239423g);
            }
        }

        /* renamed from: e */
        public <ShareParams extends C82939f> boolean mo115220e(ShareParams shareparams) {
            return Util.nullAsNil(shareparams.f242460C).startsWith("delayLoadFile://");
        }
    }

    /* renamed from: A */
    public void mo115200A(SendAppMessageTask sendAppMessageTask, String str, String str2, boolean z, C88267e eVar, Param param) {
        sendAppMessageTask.f242547j = str2;
        sendAppMessageTask.f242548n = str;
        sendAppMessageTask.f242543f = param.f242491v;
        AppBrandRuntimeWC N0 = eVar.getRuntime();
        if (N0 == null || N0.mo113210l1() == null || !(N0.mo113210l1() instanceof AppBrandInitConfigWC)) {
            Log.m105928w("MicroMsg.JsApiShareAppMessageBase", "hy: can not retrieve init config");
            sendAppMessageTask.f242536Z = -1;
        } else {
            sendAppMessageTask.f242536Z = N0.mo113210l1().f234802F;
        }
        sendAppMessageTask.f242544g = param.f242492w;
        sendAppMessageTask.f242545h = param.f242475f;
        sendAppMessageTask.f242546i = param.f242476g;
        sendAppMessageTask.f242549o = param.f242458A;
        sendAppMessageTask.f242555t = param.f242477h;
        sendAppMessageTask.f242559x = param.f242474e;
        sendAppMessageTask.f242554s = param.f242459B;
        sendAppMessageTask.f242550p = param.f242478i;
        AppBrandSysConfigWC appBrandSysConfigWC = param.f242472c;
        sendAppMessageTask.f242552q = appBrandSysConfigWC.f261063f;
        sendAppMessageTask.f242556u = appBrandSysConfigWC.f261072r.f238585d;
        sendAppMessageTask.f242557v = param.f242472c.f261072r.md5;
        sendAppMessageTask.f242558w = param.f242472c.f261072r.pkgVersion;
        AppBrandSysConfigWC appBrandSysConfigWC2 = param.f242472c;
        sendAppMessageTask.f242561y = appBrandSysConfigWC2.f261061d;
        sendAppMessageTask.f242563z = param.f242481l;
        sendAppMessageTask.f242535Y0 = appBrandSysConfigWC2.f239413b1;
        sendAppMessageTask.f242537Z0 = param.f242469L;
        sendAppMessageTask.f242509G = param.f242482m;
        sendAppMessageTask.f242510H = param.f242484o;
        sendAppMessageTask.f242511I = param.f242485p;
        sendAppMessageTask.f242508F = param.f242480k ? 1 : 0;
        if (N0.mo113213o1() instanceof AppBrandSysConfigWC) {
            sendAppMessageTask.f242542e1 = C90972a.SecFlagForSinglePageMode.mo125052a(N0.mo113213o1());
        }
        sendAppMessageTask.f242512J = C84072q1.m103586a(param.f242491v).f245458b.getAndIncrement();
        sendAppMessageTask.f242516N = param.f242471b.mo116162Q0();
        sendAppMessageTask.f242517P = param.f242471b.mo116156K0();
        AppBrandStatObject n1 = param.f242471b.getRuntime().mo121253n1();
        if (n1 != null) {
            int i = n1.f245533f;
            if (i == 0) {
                i = 1000;
            }
            sendAppMessageTask.f242513K = i;
            sendAppMessageTask.f242514L = Util.nullAsNil(n1.f245534g);
            sendAppMessageTask.f242515M = Util.nullAsNil(param.f242471b.getRuntime().mo113210l1().f234837q);
        }
        sendAppMessageTask.f242553r = C82967h0.m101763b(param.f242460C);
        sendAppMessageTask.f242518Q = param.f242473d;
        sendAppMessageTask.f242520R = param.f242487r;
        sendAppMessageTask.f242522S = param.f242488s;
        sendAppMessageTask.f242524T = param.f242489t;
        sendAppMessageTask.f242528V = param.f242490u;
        sendAppMessageTask.f242530W = param.f242479j;
        sendAppMessageTask.f242534Y = param.f242495z;
        sendAppMessageTask.f242532X = param.f242468K;
        param.f242486q.mo115217b(param, sendAppMessageTask, eVar);
        sendAppMessageTask.f242539b1 = param.f242465H;
        sendAppMessageTask.f242538a1 = param.f242464G;
        sendAppMessageTask.f242540c1 = z;
        sendAppMessageTask.f242541d1 = param.f242467J;
    }

    /* renamed from: B */
    public Map<String, Object> mo115201B(Param param, SendAppMessageTask sendAppMessageTask, String str) {
        if (!param.f242473d) {
            return null;
        }
        HashMap hashMap = new HashMap();
        JSONArray jSONArray = new JSONArray();
        try {
            if (!Util.isNullOrNil((List) sendAppMessageTask.f242531W0)) {
                Iterator<ShareInfo> it = sendAppMessageTask.f242531W0.iterator();
                while (it.hasNext()) {
                    ShareInfo next = it.next();
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("shareKey", next.f242575d);
                    jSONObject.put("shareName", next.f242576e);
                    jSONArray.put(jSONObject);
                }
            }
        } catch (JSONException e) {
            Log.m105920e("MicroMsg.JsApiShareAppMessageBase", android.util.Log.getStackTraceString(e));
        }
        hashMap.put("shareInfos", jSONArray);
        return hashMap;
    }

    /* renamed from: C */
    public void mo115202C(Param param) {
    }

    /* renamed from: D */
    public void mo115203D(Param param, int i) {
    }

    /* renamed from: E */
    public void mo115204E(boolean z, Param param, String str) {
    }

    /* renamed from: F */
    public void mo115205F(C88267e eVar, int i, Param param) {
        Intent intent = new Intent();
        mo115209y(intent, param);
        if (!TextUtils.isEmpty(param.f242483n) && param.f242483n.equals("qyweixin")) {
            Log.m105920e("MicroMsg.JsApiShareAppMessageBase", "shareAppMessage, share to wework, why?");
        } else if (Util.isNullOrNil(param.f242462E) && Util.isNullOrNil(param.f242463F)) {
            mo115208x(intent, param, eVar);
            mo115206G(eVar, i, param, intent, false);
        } else if (!Util.isNullOrNil(param.f242463F)) {
            intent.putExtra("Select_Conv_User", param.f242463F);
            intent.putExtra("KSendWording", param.f242470a.getResources().getString(C0966R.string.a8v));
            mo115206G(eVar, i, param, intent, true);
        } else {
            p44 p44 = new p44();
            p44.f139580d = param.f242491v;
            p44.f139581e = param.f242462E;
            C47350c.C47352b bVar = new C47350c.C47352b();
            bVar.f127069d = 1961;
            bVar.f127068c = "/cgi-bin/mmbiz-bin/wxabusiness/share_transid";
            bVar.f127066a = p44;
            bVar.f127067b = new q44();
            ((C40324j) C86312j.m106911c(C40324j.class)).mo63014eH(bVar.mo72403a(), new C40476a(intent, param, eVar, i));
        }
    }

    /* renamed from: G */
    public final void mo115206G(C88267e eVar, int i, Param param, Intent intent, boolean z) {
        long j;
        C82935c cVar = new C82935c(param, new C82934b(eVar, i, param), z, intent);
        if (param.f242486q.mo115220e(param)) {
            Log.m105918d("MicroMsg.JsApiShareAppMessageBase", "hy: should delay navigate");
            j = 200;
        } else {
            j = 0;
        }
        eVar.mo109670o(cVar, j);
    }

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        C88267e eVar = (C88267e) fVar;
        try {
            mo115205F(eVar, i, mo115210z(eVar, jSONObject));
        } catch (C82938e e) {
            Log.printErrStackTrace("MicroMsg.JsApiShareAppMessageBase", e, "hy: illegal params", new Object[0]);
            String message = e.getMessage();
            if (!Util.nullAsNil(message).startsWith("fail")) {
                message = "fail: " + message;
            }
            eVar.mo109647a(i, mo115112m(message, (Map<String, ? extends Object>) null));
        }
    }

    /* renamed from: w */
    public abstract Param mo115207w();

    /* renamed from: x */
    public void mo115208x(Intent intent, Param param, C88267e eVar) {
        String str;
        String str2;
        AppBrandInitConfigWC M1;
        if (param.f242480k || param.f242473d) {
            Log.m105924i("MicroMsg.JsApiShareAppMessageBase", "fillIntentForForwardToWeWorkWhenSelectContactsIfNeed, forbid 1");
            intent.putExtra("selectionconversationui_forbid_send_to_wework", true);
            return;
        }
        Log.m105924i("MicroMsg.JsApiShareAppMessageBase", "fillIntentForForwardToWeWorkWhenSelectContactsIfNeed, do fill");
        intent.putExtra("from_scene_forward_to_wework", 6);
        intent.putExtra("content_type_forward_to_wework", 5);
        AppBrandRuntimeWC N0 = eVar.getRuntime();
        if (N0 == null || (M1 = N0.mo113210l1()) == null) {
            str2 = null;
            str = null;
        } else {
            String str3 = M1.f239364f;
            str = M1.f239363e;
            str2 = str3;
        }
        String str4 = !TextUtils.isEmpty(param.f242460C) ? param.f242460C : param.f242478i;
        if (!TextUtils.isEmpty(str4)) {
            str4 = C82967h0.m101763b(str4);
        }
        String str5 = str4;
        Log.m105925i("MicroMsg.JsApiShareAppMessageBase", "fillIntentForForwardToWeWorkWhenSelectContactsIfNeed, imgPath: %s", str5);
        intent.putExtra("Select_Data_Send_To_WeWork", new AppBrandData(param.f242492w, param.f242477h, str2, str5, str, param.f242475f, Integer.valueOf(param.f242474e)));
    }

    /* renamed from: y */
    public void mo115209y(Intent intent, Param param) {
        intent.putExtra("Select_Conv_Type", 35);
        intent.putExtra("mutil_select_is_ret", !param.f242473d);
        intent.putExtra("select_is_ret", true);
        intent.putExtra("scene_from", 3);
        intent.putExtra("appbrand_params", param.f242466I);
        intent.putExtra("Retr_Msg_Type", 2);
        param.f242486q.mo115216a(param, intent);
    }

    /* renamed from: z */
    public Param mo115210z(C88267e eVar, JSONObject jSONObject) {
        int i;
        char c;
        C88267e eVar2 = eVar;
        JSONObject jSONObject2 = jSONObject;
        Log.m105924i("MicroMsg.JsApiShareAppMessageBase", "invoke share app message directly.");
        Param w = mo115207w();
        if (jSONObject2 != null) {
            Activity o0 = eVar.mo114344o0();
            w.f242470a = o0;
            if (o0 != null) {
                C83928t1 t1Var = (C83928t1) eVar2.mo114342m0(C83928t1.class);
                w.f242471b = t1Var;
                if (t1Var != null) {
                    C83699y J0 = t1Var.mo116155J0(3);
                    if (J0 != null) {
                        String optString = jSONObject2.optString("type");
                        if (C84905f.m104620a(eVar.getRuntime())) {
                            optString = "weishi";
                        }
                        if (Util.isNullOrNil(optString)) {
                            optString = "normal";
                        }
                        String optString2 = jSONObject2.optString("to");
                        Log.m105925i("MicroMsg.JsApiShareAppMessageBase", "hy: share type is %s", optString);
                        w.f242486q = "video".equalsIgnoreCase(optString) ? new C82943j() : "h5".equalsIgnoreCase(optString) ? new C82941h() : "weishi".equalsIgnoreCase(optString) ? new C82944k() : new C82942i((C40476a) null);
                        w.f242472c = eVar.getRuntime().mo113213o1();
                        boolean d = J0.f244320d.mo120957d("enable_share_with_share_ticket", false);
                        w.f242473d = d;
                        if (!d && (eVar2 instanceof C1938p)) {
                            w.f242473d = "withShareTicket".equals(jSONObject2.optString("mode"));
                        }
                        w.f242465H = J0.f244320d.mo120957d("is_todo_message", false);
                        w.f242464G = J0.f244320d.mo120959f("share_todo_activity_id", "");
                        w.f242474e = w.f242473d ? 3 : 2;
                        w.f242475f = jSONObject2.optString(FFmpegMetadataRetriever.METADATA_KEY_TITLE);
                        w.f242476g = jSONObject2.optString("desc", "");
                        w.f242477h = jSONObject2.optString("path");
                        w.f242478i = jSONObject2.optString("imageUrl");
                        w.f242479j = jSONObject2.optString("cacheKey");
                        boolean optBoolean = jSONObject2.optBoolean("disableForward", false);
                        w.f242480k = optBoolean;
                        Log.m105925i("MicroMsg.JsApiShareAppMessageBase", "disableForward:%b", Boolean.valueOf(optBoolean));
                        w.f242481l = jSONObject2.optString("messageExtraData");
                        w.f242482m = jSONObject2.optInt("cardSubType", 0);
                        w.f242461D = jSONObject2.optBoolean("useDefaultSnapshot", true);
                        w.f242483n = optString2;
                        w.f242484o = jSONObject2.optString("thumbDataHash");
                        w.f242485p = jSONObject2.optString("signature");
                        w.f242469L = jSONObject2.optBoolean("hasRelievedBuyPlugin");
                        Log.m105925i("MicroMsg.JsApiShareAppMessageBase", "thumbDataHash:%s, signature:%s", w.f242484o, w.f242485p);
                        AppBrandInitConfigWC M1 = eVar.getRuntime().mo113210l1();
                        if (M1 != null) {
                            w.f242487r = J0.f244320d.mo120960g("enable_share_dynamic");
                            w.f242488s = J0.f244320d.mo120960g("enable_share_with_updateable_msg");
                            w.f242489t = J0.f244320d.mo120960g("enable_share_with_private_msg");
                            w.f242490u = J0.f244320d.mo120959f("enable_share_with_updateable_msg_template_id", "");
                            w.f242491v = eVar.getAppId();
                            w.f242492w = M1.f234839s;
                            w.f242493x = w.f242472c.f261072r.f238585d;
                            w.f242494y = w.f242472c.f261072r.pkgVersion;
                            w.f242495z = eVar.getRuntime().mo113210l1().f234841u;
                            w.f242458A = C83727p2.m102773c(eVar.getAppId());
                            w.f242459B = Util.isNullOrNil(w.f242478i);
                            String e = C82967h0.m101766e(w.f242471b, w.f242478i, w.f242461D);
                            w.f242460C = e;
                            Log.m105925i("MicroMsg.JsApiShareAppMessageBase", "imgPath[%s] imageUrl[%s] default[%s]", e, w.f242478i, Boolean.valueOf(w.f242461D));
                            HashMap<String, Object> hashMap = new HashMap<>();
                            w.f242466I = hashMap;
                            hashMap.put("desc", w.f242476g);
                            w.f242466I.put("type", Integer.valueOf(w.f242474e));
                            w.f242466I.put(FFmpegMetadataRetriever.METADATA_KEY_TITLE, w.f242475f);
                            w.f242466I.put("app_id", w.f242491v);
                            w.f242466I.put("pkg_type", Integer.valueOf(w.f242493x));
                            w.f242466I.put("pkg_version", Integer.valueOf(w.f242494y));
                            w.f242466I.put("img_url", w.f242478i);
                            w.f242466I.put("is_dynamic", Boolean.valueOf(w.f242487r));
                            w.f242466I.put("cache_key", w.f242479j);
                            w.f242466I.put("path", w.f242477h);
                            w.f242466I.put("disableForward", Boolean.valueOf(w.f242480k));
                            w.f242466I.put("subType", Integer.valueOf(w.f242482m));
                            w.f242466I.put("thumbDataHash", w.f242484o);
                            w.f242466I.put("signature", w.f242485p);
                            if (!Util.isNullOrNil(w.f242460C)) {
                                w.f242466I.put("delay_load_img_path", w.f242460C);
                            }
                            w.f242462E = jSONObject2.optString("openId");
                            String optString3 = jSONObject2.optString("chatroomUsername");
                            if (Util.isNullOrNil(optString3)) {
                                optString3 = J0.f244320d.mo120959f("share_to_user", "");
                                C86493v0.C86495c cVar = J0.f244320d;
                                cVar.getClass();
                                if (!TextUtils.isEmpty("share_to_user")) {
                                    ((C86493v0.C86494b) cVar.f251318a).remove("share_to_user");
                                }
                            }
                            w.f242463F = optString3;
                            w.f242486q.mo115219d(w, eVar2, jSONObject2);
                            C83928t1 M0 = eVar.mo114341l0();
                            C91304m I1 = M0 == null ? null : M0.mo116520A1();
                            if (I1 != null) {
                                w.f242468K = I1.getCurrentUrl();
                            } else if (M0 instanceof C83563j) {
                                w.f242468K = jSONObject2.optString("webViewUrl");
                            }
                            boolean optBoolean2 = jSONObject2.optBoolean("sdk_isFromMenu", false);
                            String e2 = mo114779e();
                            if (TextUtils.isEmpty(e2) || e2.equals(C82958e.NAME)) {
                                c = 0;
                                i = 1;
                                w.f242467J = 0;
                            } else {
                                if (e2.contains("ToSpecificContact")) {
                                    w.f242467J = 2;
                                    c = 0;
                                } else if (optBoolean2) {
                                    c = 0;
                                    w.f242467J = 0;
                                } else {
                                    c = 0;
                                    i = 1;
                                    w.f242467J = 1;
                                }
                                i = 1;
                            }
                            Object[] objArr = new Object[i];
                            objArr[c] = w.toString();
                            Log.m105925i("MicroMsg.JsApiShareAppMessageBase", "hy: params: %s", objArr);
                            return w;
                        }
                        Log.m105920e("MicroMsg.JsApiShareAppMessageBase", "hy: no init config");
                        throw new C82938e("no init config");
                    }
                    Log.m105924i("MicroMsg.JsApiShareAppMessageBase", "share app message fail, menuInfo is null.");
                    throw new C82938e("menu is null");
                }
                Log.m105924i("MicroMsg.JsApiShareAppMessageBase", "share app message fail, pageView is null");
                throw new C82938e("current page do not exist");
            }
            Log.m105924i("MicroMsg.JsApiShareAppMessageBase", "share app message fail, context is null");
            throw new C82938e("fail:internal error invalid android context");
        }
        Log.m105924i("MicroMsg.JsApiShareAppMessageBase", "data is null");
        throw new C82938e("data is null");
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.share.JsApiShareAppMessageBase$ShareDialogTodoReportData */
    public static class ShareDialogTodoReportData implements Parcelable {
        public static final Parcelable.Creator<ShareDialogTodoReportData> CREATOR = new C82933a();

        /* renamed from: d */
        public String f242442d;

        /* renamed from: e */
        public String f242443e;

        /* renamed from: f */
        public String f242444f;

        /* renamed from: g */
        public int f242445g;

        /* renamed from: h */
        public int f242446h;

        /* renamed from: i */
        public int f242447i;

        /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.share.JsApiShareAppMessageBase$ShareDialogTodoReportData$a */
        public class C82933a implements Parcelable.Creator<ShareDialogTodoReportData> {
            public Object createFromParcel(Parcel parcel) {
                return new ShareDialogTodoReportData(parcel);
            }

            public Object[] newArray(int i) {
                return new ShareDialogTodoReportData[i];
            }
        }

        public ShareDialogTodoReportData(String str, String str2, String str3, int i, int i2, int i3) {
            this.f242442d = str;
            this.f242443e = str2;
            this.f242444f = str3;
            this.f242445g = i;
            this.f242446h = i2;
            this.f242447i = i3;
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f242442d);
            parcel.writeString(this.f242443e);
            parcel.writeString(this.f242444f);
            parcel.writeInt(this.f242445g);
            parcel.writeInt(this.f242446h);
            parcel.writeInt(this.f242447i);
        }

        public ShareDialogTodoReportData(Parcel parcel) {
            this.f242442d = parcel.readString();
            this.f242443e = parcel.readString();
            this.f242444f = parcel.readString();
            this.f242445g = parcel.readInt();
            this.f242446h = parcel.readInt();
            this.f242447i = parcel.readInt();
        }
    }
}
