package com.tencent.p014mm.plugin.appbrand.jsapi.share;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.widget.snackbar.C75026b;
import com.tencent.p014mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask;
import com.tencent.p014mm.plugin.appbrand.ipc.C81956c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.utils.C2033c1;
import com.tencent.p014mm.plugin.appbrand.utils.C2046p2;
import com.tencent.p014mm.sdk.platformtools.ImgUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sendtowework.ImgData;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.tinker.loader.shareutil.ShareConstants;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.Arrays;
import ke3.C88144b;
import org.json.JSONObject;
import p170ic.C87687a;
import p225rc.C89916g;
import p225rc.g$$f;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.share.l */
public final class C1862l extends C82268c<C82381f> {
    public static final int CTRL_INDEX = 801;
    public static final String NAME = "shareImageMessage";

    /* renamed from: g */
    public final int f11690g = C87687a.m109085a(this);

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.share.l$a */
    public class C1863a implements C2033c1 {

        /* renamed from: a */
        public final /* synthetic */ C82381f f11691a;

        /* renamed from: b */
        public final /* synthetic */ int f11692b;

        /* renamed from: c */
        public final /* synthetic */ int f11693c;

        /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.share.l$a$a */
        public class C1864a implements AppBrandProxyUIProcessTask.C81943b<ShareToConversationResult> {

            /* renamed from: a */
            public final /* synthetic */ Activity f11695a;

            public C1864a(Activity activity) {
                this.f11695a = activity;
            }

            public void onReceiveResult(AppBrandProxyUIProcessTask.ProcessResult processResult) {
                C82975k0 k0Var;
                ShareToConversationResult shareToConversationResult = (ShareToConversationResult) processResult;
                if (shareToConversationResult == null) {
                    Log.m105928w("MicroMsg.AppBrand.JsApiShareImageMessage", "invoke, result is null");
                    return;
                }
                int i = shareToConversationResult.f242577d;
                C82975k0[] values = C82975k0.values();
                int length = values.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        k0Var = null;
                        break;
                    }
                    k0Var = values[i2];
                    if (i == k0Var.f242615d) {
                        break;
                    }
                    i2++;
                }
                if (k0Var == null) {
                    Log.m105928w("MicroMsg.AppBrand.JsApiShareImageMessage", "invoke, shareResult is null");
                    k0Var = C82975k0.f242613g;
                }
                Log.m105924i("MicroMsg.AppBrand.JsApiShareImageMessage", "invoke, shareResult: " + k0Var);
                int ordinal = k0Var.ordinal();
                if (ordinal == 0) {
                    Activity activity = this.f11695a;
                    C75026b.m89951a(activity, activity.getString(C0966R.string.fjh));
                    C1863a aVar = C1863a.this;
                    aVar.f11691a.mo109647a(aVar.f11692b, C1862l.this.mo115109j("ok"));
                } else if (ordinal == 1) {
                    C1863a aVar2 = C1863a.this;
                    aVar2.f11691a.mo109647a(aVar2.f11692b, C1862l.this.mo115109j("cancel"));
                } else if (ordinal == 2) {
                    C1863a aVar3 = C1863a.this;
                    aVar3.f11691a.mo109647a(aVar3.f11692b, C1862l.this.mo115109j("fail"));
                }
            }
        }

        /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.share.l$a$b */
        public class C1865b implements MMActivity.C6739d {

            /* renamed from: d */
            public final /* synthetic */ Activity f11697d;

            public C1865b(Activity activity) {
                this.f11697d = activity;
            }

            public void mmOnActivityResult(int i, int i2, Intent intent) {
                if (i != C1862l.this.f11690g) {
                    Log.m105925i("MicroMsg.AppBrand.JsApiShareImageMessage", "invoke, requestCode: %d is not match", Integer.valueOf(i));
                } else if (i2 != -1) {
                    Log.m105924i("MicroMsg.AppBrand.JsApiShareImageMessage", "invoke, resultCode is not RESULT_OK: " + i2);
                    C1863a aVar = C1863a.this;
                    aVar.f11691a.mo109647a(aVar.f11692b, C1862l.this.mo115109j("cancel"));
                } else {
                    ArrayList<String> stringArrayListExtra = intent == null ? null : intent.getStringArrayListExtra("SendMsgUsernames");
                    if (stringArrayListExtra == null || stringArrayListExtra.isEmpty()) {
                        Log.m105928w("MicroMsg.AppBrand.JsApiShareImageMessage", "invoke, toUsers is empty");
                        C1863a aVar2 = C1863a.this;
                        aVar2.f11691a.mo109647a(aVar2.f11692b, C1862l.this.mo115109j("fail:selected user is empty"));
                        return;
                    }
                    Activity activity = this.f11697d;
                    C75026b.m89951a(activity, activity.getString(C0966R.string.fjh));
                    Log.m105924i("MicroMsg.AppBrand.JsApiShareImageMessage", "invoke, toUser: " + Arrays.toString(stringArrayListExtra.toArray()));
                    C1863a aVar3 = C1863a.this;
                    aVar3.f11691a.mo109647a(aVar3.f11692b, C1862l.this.mo115109j("ok"));
                }
            }
        }

        /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.share.l$a$c */
        public class C1866c implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ Activity f11699d;

            /* renamed from: e */
            public final /* synthetic */ MMActivity.C6739d f11700e;

            /* renamed from: f */
            public final /* synthetic */ String f11701f;

            /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.share.l$a$c$a */
            public class C1867a implements g$$f {
                public C1867a() {
                }

                /* renamed from: b */
                public boolean mo1596b(int i, int i2, Intent intent) {
                    C1866c cVar = C1866c.this;
                    if (C1862l.this.f11690g != i) {
                        return false;
                    }
                    cVar.f11700e.mmOnActivityResult(i, i2, intent);
                    return true;
                }
            }

            public C1866c(Activity activity, MMActivity.C6739d dVar, String str) {
                this.f11699d = activity;
                this.f11700e = dVar;
                this.f11701f = str;
            }

            public void run() {
                C89916g.m112446a(this.f11699d).mo124232f(new C1867a());
                Intent intent = new Intent();
                intent.putExtra("Retr_File_Name", this.f11701f);
                intent.putExtra("Retr_Compress_Type", C1863a.this.f11693c);
                intent.putExtra("Retr_Msg_Type", 0);
                intent.putExtra("Retr_show_success_tips", false);
                intent.putExtra("from_scene_forward_to_wework", 6);
                intent.putExtra("content_type_forward_to_wework", 2);
                intent.putExtra("Select_Data_Send_To_WeWork", new ImgData(C86013q1.m106448i(this.f11701f, false)));
                C88144b.m109802t(this.f11699d, ".ui.transmit.MsgRetransmitUI", intent, C1862l.this.f11690g);
            }
        }

        public C1863a(C82381f fVar, int i, int i2) {
            this.f11691a = fVar;
            this.f11692b = i;
            this.f11693c = i2;
        }

        /* renamed from: a */
        public void mo1683a(String str, boolean z) {
            Log.m105924i("MicroMsg.AppBrand.JsApiShareImageMessage", "invoke, localPath: " + str);
            if (Util.isNullOrNil(str)) {
                this.f11691a.mo109647a(this.f11692b, C1862l.this.mo115109j("fail:imagePath is illegal"));
            } else if (!ImgUtil.isImgFile(str)) {
                Log.m105929w("MicroMsg.AppBrand.JsApiShareImageMessage", "invoke, %s is not image", str);
                C86013q1.m106447h(str);
                this.f11691a.mo109647a(this.f11692b, C1862l.this.mo115109j("fail:imagePath is illegal"));
            } else {
                Context context = this.f11691a.getContext();
                if (context instanceof Activity) {
                    Activity activity = (Activity) context;
                    if (ImgUtil.isGif(str)) {
                        Log.m105924i("MicroMsg.AppBrand.JsApiShareImageMessage", "invoke, gif");
                        C81956c.m100675c(activity, new ShareGifToConversationRequest(str), new C1864a(activity), (Intent) null);
                        return;
                    }
                    this.f11691a.mo109673t(new C1866c(activity, new C1865b(activity), str));
                    return;
                }
                Log.m105928w("MicroMsg.AppBrand.JsApiShareImageMessage", "invoke, activity is null");
                this.f11691a.mo109647a(this.f11692b, C1862l.this.mo115109j("fail:activity is null"));
            }
        }
    }

    /* renamed from: w */
    public static int m1892w(String str) {
        str.getClass();
        if (str.equals("compressed")) {
            return 0;
        }
        if (!str.equals(ShareConstants.DEXMODE_RAW)) {
            return m1892w("compressed");
        }
        return 1;
    }

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        if (fVar == null) {
            Log.m105928w("MicroMsg.AppBrand.JsApiShareImageMessage", "invoke, env is null");
        } else if (jSONObject == null) {
            Log.m105928w("MicroMsg.AppBrand.JsApiShareImageMessage", "invoke, data is null");
            fVar.mo109647a(i, mo115109j("fail:data is null"));
        } else if (!jSONObject.has("imagePath")) {
            Log.m105928w("MicroMsg.AppBrand.JsApiShareImageMessage", "invoke, data is null or can not find imagePath");
            fVar.mo109647a(i, mo115109j("fail:imagePath is null"));
        } else {
            String optString = jSONObject.optString("imagePath");
            if (Util.isNullOrNil(optString)) {
                Log.m105928w("MicroMsg.AppBrand.JsApiShareImageMessage", "invoke, imagePath is null");
                fVar.mo109647a(i, mo115109j("fail:imagePath is null"));
                return;
            }
            int w = m1892w(jSONObject.optString("quality", "compressed"));
            Log.m105925i("MicroMsg.AppBrand.JsApiShareImageMessage", "invoke, imagePath: %s, compressType: %d", optString, Integer.valueOf(w));
            C1863a aVar = new C1863a(fVar, i, w);
            C87412m.m108594g(optString, "path");
            C2046p2.m1997a(fVar, optString, (String) null, 7, aVar);
        }
    }
}
