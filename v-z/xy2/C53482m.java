package xy2;

import a70.C112760b;
import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import bp3.C104160f;
import bp3.C79758p;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import di0.C86295k;
import di0.C86297n;
import di0.C86299o;
import di3.C86312j;
import gy3.C87412m;
import hn3.C108252a;
import java.util.List;
import kr0.C76630x0;
import org.json.JSONArray;
import org.json.JSONObject;
import p823sg.C90193h;
import su0.C13781a;
import uy2.C52660e;
import wi0.C90973a0;
import wi0.C91003z;
import z04.C112551y;
import z04.C119027c;

/* renamed from: xy2.m */
public final class C53482m {

    /* renamed from: a */
    public static final C53482m f150398a = new C53482m();

    /* renamed from: xy2.m$b */
    public static final class C15917b implements C86297n {
        /* renamed from: a */
        public void mo1541a(int i, String str) {
            Log.m105918d("MicroMsg.TextStatus.TextStatusMiniAppService", "onError() called with: errCode = " + i + ", errMsg = " + str);
        }

        public void onSuccess() {
            Log.m105918d("MicroMsg.TextStatus.TextStatusMiniAppService", "onSuccess() called");
        }
    }

    /* renamed from: xy2.m$c */
    public static final class C15918c implements C86295k {

        /* renamed from: d */
        public final /* synthetic */ List<String> f42786d;

        /* renamed from: e */
        public final /* synthetic */ String f42787e;

        public C15918c(List<String> list, String str) {
            this.f42786d = list;
            this.f42787e = str;
        }

        /* renamed from: a */
        public final String mo3693a() {
            JSONObject jSONObject = new JSONObject();
            List<String> list = this.f42786d;
            boolean z = true;
            if (list != null && (!list.isEmpty())) {
                JSONArray jSONArray = new JSONArray();
                for (String put : this.f42786d) {
                    jSONArray.put(put);
                }
                jSONObject.put("enc_usernames", jSONArray);
            }
            jSONObject.put("isprerender", true);
            String str = this.f42787e;
            if (str != null && !C112551y.m153811k(str)) {
                z = false;
            }
            if (!z) {
                jSONObject.put(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, this.f42787e);
            }
            String jSONObject2 = jSONObject.toString();
            C87412m.m108593f(jSONObject2, "jsonObj.toString()");
            return jSONObject2;
        }
    }

    /* renamed from: xy2.m$a */
    public static final class C53483a implements C86295k {

        /* renamed from: d */
        public final /* synthetic */ String f150399d;

        /* renamed from: e */
        public final /* synthetic */ C52660e f150400e;

        /* renamed from: f */
        public final /* synthetic */ String f150401f;

        public C53483a(String str, C52660e eVar, String str2) {
            this.f150399d = str;
            this.f150400e = eVar;
            this.f150401f = str2;
        }

        /* renamed from: a */
        public final String mo3693a() {
            JSONObject jSONObject = new JSONObject();
            String str = this.f150399d;
            if (str == null) {
                str = "";
            }
            jSONObject.put("enc_username", str);
            C52660e eVar = this.f150400e;
            if (eVar != null) {
                jSONObject.put("session_id", eVar.field_session_id);
                jSONObject.put("hash_username", eVar.field_hash_username);
                jSONObject.put("tag", eVar.field_tag);
                jSONObject.put("source_id", eVar.field_source_id);
                jSONObject.put("plain", eVar.field_plain);
                jSONObject.put("status_id", eVar.field_status_id);
                jSONObject.put("modify_count", eVar.field_modify_count);
                jSONObject.put("card_key", eVar.field_card_key);
            }
            String str2 = this.f150401f;
            if (!(str2 == null || C112551y.m153811k(str2))) {
                jSONObject.put(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, this.f150401f);
            }
            String jSONObject2 = jSONObject.toString();
            C87412m.m108593f(jSONObject2, "jsonObj.toString()");
            return jSONObject2;
        }
    }

    /* renamed from: a */
    public final C86299o mo74149a(String str) {
        C86299o oVar = new C86299o();
        oVar.f250929a = "gh_390359b3fd13@app";
        oVar.f250939k = 1209;
        int i = 0;
        if (C87412m.m108589b(C79758p.f233760a.mo109878a(C104160f.RepairerConfig_TextStatus_UsePreviewMiniApp_Int, 0), 1)) {
            i = 2;
        }
        oVar.f250931c = i;
        oVar.f250934f = "pages/detail/detail.html";
        oVar.f250913B = C90973a0.TRANSPARENT;
        C91003z zVar = C91003z.DISABLED;
        oVar.f250923L = zVar;
        oVar.f250924M = zVar;
        oVar.f250925N = true;
        oVar.f250914C = str;
        return oVar;
    }

    /* renamed from: b */
    public final void mo74150b(Context context, String str, String str2, C52660e eVar) {
        Class cls = C76630x0.class;
        C87412m.m108594g(context, "context");
        Log.m105918d("MicroMsg.TextStatus.TextStatusMiniAppService", "goMiniApp() called with: context = " + context + " un =" + str);
        String str3 = "";
        if (((C76630x0) C86312j.m106911c(cls)).fn0()) {
            MMActivity mMActivity = context instanceof MMActivity ? (MMActivity) context : null;
            if (mMActivity != null) {
                try {
                    View decorView = mMActivity.getWindow().getDecorView();
                    C87412m.m108593f(decorView, "activity.window.decorView");
                    Bitmap d = C108252a.m146586d(decorView, decorView.getWidth(), decorView.getHeight(), false, Bitmap.Config.RGB_565);
                    if (d != null) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(C112760b.m154225d());
                        sb.append("textstatus/");
                        String a = C13781a.m13082a();
                        C87412m.m108593f(a, "username()");
                        byte[] bytes = a.getBytes(C119027c.f356488a);
                        C87412m.m108593f(bytes, "this as java.lang.String).getBytes(charset)");
                        sb.append(C90193h.m112878f(bytes));
                        String sb4 = sb.toString();
                        if (!C86013q1.m106450k(sb4)) {
                            C86013q1.m106461v(sb4);
                        }
                        String str4 = sb4 + "/snapshot";
                        if (C86013q1.m106450k(str4)) {
                            C86013q1.m106447h(str4);
                        }
                        BitmapUtil.saveBitmapToImage(d, 100, Bitmap.CompressFormat.JPEG, str4, true);
                        str3 = str4;
                    }
                } catch (Throwable th) {
                    Log.printErrStackTrace("MicroMsg.TextStatus.TextStatusMiniAppService", th, "getSnapShot err", new Object[0]);
                }
            }
        }
        C86299o a2 = mo74149a(str3);
        a2.f250937i = new C53483a(str, eVar, str2);
        ((C76630x0) C86312j.m106911c(cls)).mo106898tv(context, a2);
    }

    /* renamed from: c */
    public final void mo74151c(Context context, List<String> list, String str) {
        C87412m.m108594g(context, "context");
        Log.m105918d("MicroMsg.TextStatus.TextStatusMiniAppService", "preRenderMiniApp() called with: context = " + context + " preRenderUserlist=" + list);
        C86299o a = mo74149a("");
        a.f250937i = new C15918c(list, str);
        ((C76630x0) C86312j.m106911c(C76630x0.class)).y20(a, new C15917b());
    }
}
