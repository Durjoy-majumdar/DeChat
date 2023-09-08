package com.tencent.p014mm.plugin.webview.p128ui.tools.newjsapi;

import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.util.Base64;
import android.widget.ImageView;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import gc0.C20828a;
import gy3.C87412m;
import gy3.C87413o;
import hc0.C20937c;
import java.util.HashMap;
import o40.C61926c;
import ol0.C117804f0;
import org.json.JSONObject;
import qo3.C77389a;
import qo3.C77398g;
import rx3.C13598b0;
import t83.C13849g;
import t83.C13851h1;
import t83.C13855j;
import w83.C15053a;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.newjsapi.h */
public final class C6481h extends C15053a {

    /* renamed from: d */
    public static final C6481h f23553d = new C6481h();

    /* renamed from: e */
    public static final String f23554e = "MicroMsg.JsApiConfirmDialog";

    /* renamed from: f */
    public static final int f23555f = C117804f0.CTRL_INDEX;

    /* renamed from: g */
    public static final String f23556g = "confirmDialog";

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.newjsapi.h$a */
    public static final class C6482a implements DialogInterface.OnCancelListener {

        /* renamed from: d */
        public final /* synthetic */ C13855j f23557d;

        /* renamed from: e */
        public final /* synthetic */ C13851h1 f23558e;

        /* renamed from: f */
        public final /* synthetic */ HashMap<String, Object> f23559f;

        public C6482a(C13855j jVar, C13851h1 h1Var, HashMap<String, Object> hashMap) {
            this.f23557d = jVar;
            this.f23558e = h1Var;
            this.f23559f = hashMap;
        }

        public final void onCancel(DialogInterface dialogInterface) {
            C13849g gVar = this.f23557d.f39001d;
            String str = this.f23558e.f38990c;
            gVar.mo10774a(str, this.f23558e.f38996i + ":cancelled", this.f23559f);
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.newjsapi.h$b */
    public static final class C6483b implements DialogInterface.OnDismissListener {

        /* renamed from: d */
        public final /* synthetic */ C13855j f23560d;

        /* renamed from: e */
        public final /* synthetic */ C13851h1 f23561e;

        /* renamed from: f */
        public final /* synthetic */ HashMap<String, Object> f23562f;

        public C6483b(C13855j jVar, C13851h1 h1Var, HashMap<String, Object> hashMap) {
            this.f23560d = jVar;
            this.f23561e = h1Var;
            this.f23562f = hashMap;
        }

        public final void onDismiss(DialogInterface dialogInterface) {
            C13849g gVar = this.f23560d.f39001d;
            String str = this.f23561e.f38990c;
            gVar.mo10774a(str, this.f23561e.f38996i + ":dismiss", this.f23562f);
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.newjsapi.h$c */
    public static final class C6484c implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C13855j f23563d;

        /* renamed from: e */
        public final /* synthetic */ C13851h1 f23564e;

        /* renamed from: f */
        public final /* synthetic */ HashMap<String, Object> f23565f;

        public C6484c(C13855j jVar, C13851h1 h1Var, HashMap<String, Object> hashMap) {
            this.f23563d = jVar;
            this.f23564e = h1Var;
            this.f23565f = hashMap;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            C13849g gVar = this.f23563d.f39001d;
            String str = this.f23564e.f38990c;
            gVar.mo10774a(str, this.f23564e.f38996i + ":ok", this.f23565f);
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.newjsapi.h$d */
    public static final class C6485d implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C13855j f23566d;

        /* renamed from: e */
        public final /* synthetic */ C13851h1 f23567e;

        /* renamed from: f */
        public final /* synthetic */ HashMap<String, Object> f23568f;

        public C6485d(C13855j jVar, C13851h1 h1Var, HashMap<String, Object> hashMap) {
            this.f23566d = jVar;
            this.f23567e = h1Var;
            this.f23568f = hashMap;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            C13849g gVar = this.f23566d.f39001d;
            String str = this.f23567e.f38990c;
            gVar.mo10774a(str, this.f23567e.f38996i + ":no", this.f23568f);
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.newjsapi.h$e */
    public static final class C6486e extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C77398g.C77402i f23569d;

        /* renamed from: e */
        public final /* synthetic */ JSONObject f23570e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C6486e(C77398g.C77402i iVar, JSONObject jSONObject, String str) {
            super(0);
            this.f23569d = iVar;
            this.f23570e = jSONObject;
        }

        public Object invoke() {
            C77398g a = this.f23569d.mo107548a();
            if (this.f23570e.has("msgIconUrl")) {
                ImageView imageView = a.f225703t;
                C20828a b = C20828a.m22825b();
                String string = this.f23570e.getString("msgIconUrl");
                C20937c.C20939b bVar = new C20937c.C20939b();
                bVar.f59346b = true;
                b.mo32519h(string, imageView, bVar.mo32666a());
            }
            a.show();
            return C13598b0.f38549a;
        }
    }

    /* renamed from: a */
    public boolean mo7286a(C13855j jVar, C13851h1 h1Var) {
        HashMap hashMap;
        C13855j jVar2;
        C13855j jVar3 = jVar;
        C13851h1 h1Var2 = h1Var;
        C87412m.m108594g(jVar3, "env");
        C87412m.m108594g(h1Var2, "msg");
        HashMap hashMap2 = new HashMap();
        String str = "confirmText";
        String str2 = "confirmTextColor";
        String str3 = "cancelText";
        String str4 = "cancelTextColor";
        String str5 = "cancelable";
        try {
            String str6 = "contentDescGravity";
            C77398g.C77402i iVar = new C77398g.C77402i(jVar3.f38998a);
            JSONObject jSONObject = h1Var2.f38991d;
            if (jSONObject.has(FFmpegMetadataRetriever.METADATA_KEY_TITLE)) {
                try {
                    iVar.f225714b.f225644a = jSONObject.getString(FFmpegMetadataRetriever.METADATA_KEY_TITLE);
                } catch (Exception e) {
                    e = e;
                    jVar2 = jVar;
                    hashMap = hashMap2;
                    Log.printErrStackTrace(f23554e, e, "doConfirmDialog", new Object[0]);
                    C13849g gVar = jVar2.f39001d;
                    String str7 = h1Var2.f38990c;
                    gVar.mo10774a(str7, h1Var2.f38996i + ":err", hashMap);
                    return false;
                }
            }
            if (jSONObject.has("titleDesc")) {
                iVar.f225714b.f225645b = jSONObject.getString("titleDesc");
            }
            if (jSONObject.has("titleColor")) {
                String string = jSONObject.getString("titleColor");
                C87412m.m108593f(string, "rawParams.getString(KEY_TITLE_COLOR)");
                iVar.f225714b.f225630M = Color.parseColor(string) | -16777216;
            }
            if (jSONObject.has("titleMaxLine")) {
                iVar.f225714b.f225631N = jSONObject.getInt("titleMaxLine");
            }
            if (jSONObject.has("titleGravity")) {
                iVar.f225714b.f225634Q = jSONObject.getInt("titleGravity");
            }
            if (jSONObject.has("msg")) {
                iVar.f225714b.f225660q = jSONObject.getString("msg");
            }
            if (jSONObject.has("msgSubTitle")) {
                iVar.f225714b.f225661r = jSONObject.getString("msgSubTitle");
            }
            if (jSONObject.has("msgSubDesc")) {
                iVar.f225714b.f225662s = jSONObject.getString("msgSubDesc");
            }
            if (jSONObject.has("msgMaxLine")) {
                iVar.f225714b.f225632O = jSONObject.getInt("msgMaxLine");
            }
            if (jSONObject.has("msgIconBase64")) {
                byte[] decode = Base64.decode(jSONObject.getString("msgIconBase64"), 0);
                iVar.f225714b.f225657n = BitmapFactory.decodeByteArray(decode, 0, decode.length);
            } else if (jSONObject.has("msgIconUrl")) {
                iVar.f225714b.f225657n = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
            }
            if (jSONObject.has("contentDesc")) {
                iVar.f225714b.f225646c = jSONObject.getString("contentDesc");
            }
            String str8 = str6;
            if (jSONObject.has(str8)) {
                iVar.f225714b.f225633P = jSONObject.getInt(str8);
            }
            String str9 = str;
            if (jSONObject.has(str9)) {
                iVar.f225714b.f225663t = jSONObject.getString(str9);
            }
            String str10 = str2;
            if (jSONObject.has(str10)) {
                String string2 = jSONObject.getString(str10);
                C87412m.m108593f(string2, "rawParams.getString(KEY_CONFIRM_COLOR)");
                iVar.f225714b.f225638U = Color.parseColor(string2) | -16777216;
            }
            String str11 = str3;
            if (jSONObject.has(str11)) {
                iVar.f225714b.f225664u = jSONObject.getString(str11);
            }
            String str12 = str4;
            if (jSONObject.has(str12)) {
                String string3 = jSONObject.getString(str12);
                C87412m.m108593f(string3, "rawParams.getString(KEY_CANCEL_COLOR)");
                iVar.f225714b.f225637T = Color.parseColor(string3) | -16777216;
            }
            String str13 = str5;
            if (jSONObject.has(str13)) {
                iVar.f225714b.f225668y = jSONObject.optBoolean(str13, false);
            }
            jVar2 = jVar;
            hashMap = hashMap2;
            try {
                C6482a aVar = new C6482a(jVar2, h1Var2, hashMap);
                C77389a aVar2 = iVar.f225714b;
                aVar2.f225622E = aVar;
                aVar2.f225623F = new C6483b(jVar2, h1Var2, hashMap);
                aVar2.f225620C = new C6484c(jVar2, h1Var2, hashMap);
                aVar2.f225621D = new C6485d(jVar2, h1Var2, hashMap);
                C61926c.m72668M(new C6486e(iVar, jSONObject, "msgIconUrl"));
                return true;
            } catch (Exception e2) {
                e = e2;
                Log.printErrStackTrace(f23554e, e, "doConfirmDialog", new Object[0]);
                C13849g gVar2 = jVar2.f39001d;
                String str72 = h1Var2.f38990c;
                gVar2.mo10774a(str72, h1Var2.f38996i + ":err", hashMap);
                return false;
            }
        } catch (Exception e3) {
            e = e3;
            jVar2 = jVar3;
            hashMap = hashMap2;
            Log.printErrStackTrace(f23554e, e, "doConfirmDialog", new Object[0]);
            C13849g gVar22 = jVar2.f39001d;
            String str722 = h1Var2.f38990c;
            gVar22.mo10774a(str722, h1Var2.f38996i + ":err", hashMap);
            return false;
        }
    }

    /* renamed from: b */
    public int mo7287b() {
        return f23555f;
    }

    /* renamed from: c */
    public String mo7288c() {
        return f23556g;
    }
}
