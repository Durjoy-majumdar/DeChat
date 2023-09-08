package qj1;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.live.model.FinderLiveService;
import com.tencent.p014mm.protocal.protobuf.FinderJumpInfo;
import com.tencent.p014mm.protocal.protobuf.NativeInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import fh1.C59018f2;
import gg1.C32444a;
import gy3.C87412m;
import j20.C117292a;
import j50.C60735a;
import java.util.ArrayList;
import java.util.HashMap;
import ls3.C10649f;
import nj3.C76912y0;
import o40.C61926c;
import ok1.C62042e;
import org.json.JSONException;
import org.json.JSONObject;
import t91.C64208c;
import te3.C64238ap2;
import te3.C64279c90;
import te3.C64331dw0;
import te3.C64347eq2;
import wg1.C15346r1;

/* renamed from: qj1.a8 */
public final class C12245a8 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C64331dw0 f35320d;

    /* renamed from: e */
    public final /* synthetic */ FinderJumpInfo f35321e;

    /* renamed from: f */
    public final /* synthetic */ C63006u7 f35322f;

    public C12245a8(C64331dw0 dw02, FinderJumpInfo finderJumpInfo, C63006u7 u7Var) {
        this.f35320d = dw02;
        this.f35321e = finderJumpInfo;
        this.f35322f = u7Var;
    }

    public final void onClick(View view) {
        String str;
        String str2;
        boolean z;
        JSONObject jSONObject;
        String str3;
        String str4;
        String str5;
        NativeInfo nativeInfo;
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/live/plugin/FinderLiveGiftQueuePlugin$showGiftAllLiveNotify$1$2$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C15346r1 r1Var = C15346r1.f41686a;
        C64331dw0 dw02 = this.f35320d;
        if (dw02 == null || (str = dw02.f182876d) == null) {
            str = "";
        }
        r1Var.mo14181a(2, str);
        try {
            FinderJumpInfo finderJumpInfo = this.f35321e;
            if (finderJumpInfo == null || (nativeInfo = finderJumpInfo.native_info) == null || (str2 = nativeInfo.necessary_params) == null) {
                str2 = "";
            }
            HashMap<String, Bitmap> hashMap = C59018f2.f168857P;
            z = true;
            Log.m105925i("Finder.LivePromoteBannerController", "jump native necessary_params:%s", str2);
            jSONObject = new JSONObject(str2);
        } catch (JSONException e) {
            HashMap<String, Bitmap> hashMap2 = C59018f2.f168857P;
            Log.printErrStackTrace("Finder.LivePromoteBannerController", e, "", new Object[0]);
            jSONObject = null;
        } catch (Throwable unused) {
        }
        int i = this.f35321e.ext_type;
        long P = C61926c.m72671P(jSONObject != null ? jSONObject.optString("object_id") : null);
        if (jSONObject != null) {
            str4 = jSONObject.optString("liveid");
            str3 = "";
        } else {
            str3 = "";
            str4 = null;
        }
        long P2 = C61926c.m72671P(str4);
        String optString = jSONObject != null ? jSONObject.optString("nonceid") : null;
        String optString2 = jSONObject != null ? jSONObject.optString("session_buffer") : null;
        C64238ap2 ap22 = new C64238ap2();
        ap22.f182124d = P;
        ap22.f182125e = P2;
        if (optString != null) {
            ap22.f182126f = optString;
        }
        if (optString2 != null) {
            ap22.f182128h = optString2;
        }
        if (i == 1 && !C62042e.f176370a.mo87027N0()) {
            FinderLiveService.f159376d.getClass();
            C60735a aVar = FinderLiveService.f159378f;
            if (aVar == null || !aVar.mo85682Z()) {
                z = false;
            }
            if (z) {
                C76912y0.makeText(this.f35322f.f166287d.getContext(), (CharSequence) this.f35322f.f166287d.getResources().getString(C0966R.string.f360582dy3), 0).show();
                C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveGiftQueuePlugin$showGiftAllLiveNotify$1$2$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            HashMap hashMap3 = new HashMap();
            C64331dw0 dw03 = this.f35320d;
            if (dw03 == null || (str5 = dw03.f182876d) == null) {
                str5 = str3;
            }
            hashMap3.put("msg_id", str5);
            hashMap3.put("msg_style", C32444a.f86067I2.mo60266n().intValue() == 0 ? "2" : "1");
            C64208c.C64209a aVar2 = C64208c.f181951a;
            C64208c.f181947N.put(Long.valueOf(P2), hashMap3);
            C64279c90 c902 = new C64279c90();
            FinderJumpInfo finderJumpInfo2 = this.f35321e;
            C64347eq2 eq22 = new C64347eq2();
            eq22.f183027r = finderJumpInfo2.ext_buff;
            c902.f182451n = eq22;
            Context context = this.f35322f.f166287d.getContext();
            C87412m.m108593f(context, "root.context");
            ((C10649f) C86312j.m106911c(C10649f.class)).mo10916tP(context, (Intent) null, ap22, false, c902, (C10649f.C10650a) null);
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveGiftQueuePlugin$showGiftAllLiveNotify$1$2$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
