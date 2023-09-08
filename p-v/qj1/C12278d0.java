package qj1;

import ak1.C54067f0;
import ak1.C54108o;
import ak1.C54116w;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import cl1.C54991o;
import cl1.C55001u;
import com.tencent.p014mm.plugin.finder.live.plugin.FinderLiveAnchorAfterPlugin;
import com.tencent.p014mm.protocal.protobuf.FinderJumpInfo;
import com.tencent.p014mm.protocal.protobuf.Html5Info;
import com.tencent.p014mm.protocal.protobuf.NativeInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C7335d;
import di3.C86312j;
import gy3.C87412m;
import ht1.C60200t1;
import ht1.C8777j5;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashMap;
import ke3.C88144b;
import o40.C61926c;
import org.json.JSONObject;
import p185kq.C10383h;

/* renamed from: qj1.d0 */
public final class C12278d0 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ FinderLiveAnchorAfterPlugin f35373d;

    /* renamed from: e */
    public final /* synthetic */ FinderJumpInfo f35374e;

    public C12278d0(FinderLiveAnchorAfterPlugin finderLiveAnchorAfterPlugin, FinderJumpInfo finderJumpInfo) {
        this.f35373d = finderLiveAnchorAfterPlugin;
        this.f35374e = finderJumpInfo;
    }

    public final void onClick(View view) {
        String str;
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorAfterPlugin$doShowGuide$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        String str2 = ((C54991o) this.f35373d.mo87696x0(C54991o.class)).f154345o;
        long j = ((C55001u) this.f35373d.mo87696x0(C55001u.class)).f154420q.f182392d;
        ((C54116w) C86312j.m106911c(C54116w.class)).getClass();
        C87412m.m108594g(str2, "username");
        HashMap hashMap = new HashMap();
        hashMap.put("finder_username", str2);
        hashMap.put("liveId", String.valueOf(j));
        C7335d c = C86312j.m106911c(C54108o.class);
        C87412m.m108593f(c, "getService(HellLiveReport::class.java)");
        C8777j5 j5Var = (C8777j5) c;
        C54067f0.C0064m mVar = C54067f0.C0064m.LIVE_END_PAGE_DIAGNOSIS;
        String E = ((C10383h) C86312j.m106911c(C10383h.class)).mo10696E();
        String str3 = "";
        C8777j5.C8778a.m8607h(j5Var, mVar, hashMap, E == null ? str3 : E, "1002", (String) null, 16, (Object) null);
        Log.m105924i("HABBYGE-MALI.HellLiveVisitorReoprter", "report23057, liveid = " + ((String) hashMap.get("liveid")));
        Intent intent = new Intent();
        FinderJumpInfo finderJumpInfo = this.f35374e;
        NativeInfo nativeInfo = finderJumpInfo.native_info;
        boolean z = false;
        if (nativeInfo != null && nativeInfo.native_type == 12) {
            z = true;
        }
        if (z) {
            NativeInfo nativeInfo2 = this.f35374e.native_info;
            if (!(nativeInfo2 == null || (str = nativeInfo2.necessary_params) == null)) {
                str3 = str;
            }
            JSONObject jSONObject = new JSONObject(str3);
            String optString = jSONObject.optString("object_id");
            String optString2 = jSONObject.optString("object_nonce_id");
            String str4 = this.f35373d.f15109q;
            Log.m105924i(str4, "jump to live " + optString);
            intent.putExtra("feed_object_id", C61926c.m72671P(optString));
            intent.putExtra("KEY_OBJECT_NONCE_ID", optString2);
            Context context = this.f35373d.f166287d.getContext();
            C87412m.m108593f(context, "root.context");
            ((C60200t1) C86312j.m106911c(C60200t1.class)).mo76864nr(context, intent);
        } else {
            Html5Info html5Info = finderJumpInfo.html5_info;
            String str5 = html5Info != null ? html5Info.url : null;
            String str6 = this.f35373d.f15109q;
            Log.m105924i(str6, "jump to h5 page " + str5);
            intent.putExtra("rawUrl", str5);
            C88144b.m109791i(this.f35373d.f166287d.getContext(), "webview", ".ui.tools.WebViewUI", intent, (Bundle) null);
        }
        this.f35373d.f15106M = System.currentTimeMillis();
        this.f35373d.mo3198Z0(2);
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorAfterPlugin$doShowGuide$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
