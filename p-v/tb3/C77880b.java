package tb3;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.message.C68062c;
import com.tencent.p014mm.message.C68067h;
import com.tencent.p014mm.message.C68070l;
import com.tencent.p014mm.plugin.luckymoney.model.C42518g;
import com.tencent.p014mm.plugin.luckymoney.model.C69225h0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.wallet_core.model.C86018q0;
import di3.C86301e;
import e32.C75548a;
import e32.C75550b;
import eb0.C86484b;
import ei3.C86522b;
import f32.C75674c;
import f40.C86709a0;
import g32.C32307c;
import g32.C75846b;
import java.util.HashMap;
import ke3.C88144b;
import m53.C10756c;
import nr3.C35015b;
import nr3.C35016g;
import p53.C11854u;
import qb3.C77314c;
import qb3.C77317d;
import st1.C77767l;
import tt1.C78093g;
import tt1.C78101i;
import ub3.C78144b;
import vt1.C78473a;
import wt1.C78654a;
import yb2.C79062b;
import yq3.C79143a;
import zt3.C119157j;

@C86522b(onProcess = {C80625v0.MATCH_MM, C80625v0.MATCH_TOOLS, C80625v0.MATCH_APPBRAND})
/* renamed from: tb3.b */
public class C77880b extends C86301e implements C78144b {

    /* renamed from: d */
    public boolean f226905d = false;

    /* renamed from: e */
    public C35016g<C86018q0> f226906e = new C35016g<>(new C37002a(this));

    /* renamed from: tb3.b$a */
    public class C37002a implements C35015b<C86018q0> {
        public C37002a(C77880b bVar) {
        }

        public Object get() {
            return new C86018q0(C86709a0.m107535s().f251811i);
        }
    }

    /* renamed from: A0 */
    public void mo107977A0(Context context, Bundle bundle, C68070l.C68072b bVar) {
        Intent intent = new Intent();
        intent.putExtras(bundle);
        intent.putExtra("key_way", 0);
        intent.putExtra("key_native_url", bVar.f195608o1);
        intent.putExtra("scene_id", Integer.parseInt(bVar.f195604n1));
        intent.putExtra("key_invalidtime", bVar.f195504K0);
        C68062c cVar = (C68062c) bVar.mo93555w(C68062c.class);
        C68067h hVar = (C68067h) bVar.mo93555w(C68067h.class);
        intent.putExtra("key_exclusive_username", cVar.f195397n);
        intent.putExtra("key_cropname", cVar.f195387d);
        intent.putExtra("key_receive_envelope_url", cVar.f195392i);
        intent.putExtra("key_receive_envelope_md5", cVar.f195393j);
        intent.putExtra("key_receive_envelope_widget_url", cVar.f195398o);
        intent.putExtra("key_receive_envelope_widget_md5", cVar.f195399p);
        intent.putExtra("key_receive_envelope_dynamic_url", cVar.f195409z);
        intent.putExtra("key_receive_envelope_dynamic_md5", cVar.f195380A);
        intent.putExtra("key_receive_envelope_dynamic_type", cVar.f195381B);
        intent.putExtra("key_detail_envelope_dynamic_url", cVar.f195382C);
        intent.putExtra("key_detail_envelope_dynamic_md5", cVar.f195383D);
        intent.putExtra("key_detail_envelope_url", cVar.f195394k);
        intent.putExtra("key_detail_envelope_md5", cVar.f195395l);
        intent.putExtra("key_about_url", hVar.f195444j);
        intent.putExtra("key_packet_id", hVar.f195445k);
        intent.putExtra("key_receive_envelope_widget_status_flag", cVar.f195404u);
        intent.putExtra("key_receive_envelope_fission_info", cVar.f195405v);
        intent.putExtra("key_packet_source", hVar.f195446l);
        intent.putExtra("key_has_story", hVar.f195449o);
        intent.putExtra("key_material_flag", hVar.f195450p);
        C88144b.m109791i(context, "luckymoney", ".ui.LuckyMoneyNotHookReceiveUI", intent, (Bundle) null);
    }

    /* renamed from: C0 */
    public void mo107978C0() {
        C69225h0.m81571b();
        C69225h0.m81573d();
        ((HashMap) C75674c.f222274c).clear();
    }

    /* renamed from: HA */
    public boolean mo107979HA() {
        return this.f226905d;
    }

    /* renamed from: OI */
    public C86018q0 mo107980OI() {
        if (C86709a0.m107522a()) {
            return this.f226906e.mo59825a();
        }
        throw new C86484b();
    }

    /* renamed from: P3 */
    public void mo107981P3(Intent intent) {
        C79062b.m95631b(intent, C75550b.class);
        C79062b.m95631b(intent, C75548a.class);
    }

    /* renamed from: Z4 */
    public void mo107982Z4() {
        C69225h0.f199187a = null;
        C42518g gVar = C69225h0.f199188b;
        if (gVar != null) {
            gVar.mo85581g();
            C69225h0.f199188b = null;
        }
    }

    public void ia0(Context context, HashMap<String, String> hashMap, C78144b.C78145a aVar) {
        if (hashMap == null) {
            Log.m105924i("MicroMsg.PluginWxPay", "extraInfo is null ! Return");
            return;
        }
        String str = hashMap.get("key_red_packet_preview_url");
        String str2 = hashMap.get("key_red_packet_preview_material_id");
        int i = -1;
        if (!Util.isNullOrNil(hashMap.get("key_red_packet_preview_scene"))) {
            i = Integer.parseInt(hashMap.getOrDefault("key_red_packet_preview_scene", "0"));
        }
        if (!Util.isNullOrNil(str)) {
            Log.m105925i("MicroMsg.PluginWxPay", "doRedPacketPreviewLoading, url is %s", str);
            C69225h0.m81572c(context, str, aVar);
        } else if (!Util.isNullOrNil(str2)) {
            Log.m105925i("MicroMsg.PluginWxPay", "doRedPacketPreviewLoading, materialId is %s", str2);
            Log.m105925i("MicroMsg.LuckyMoneyEnvelopePreview", "do get red packet preview from pickUI,materialId: %s", str2);
            C69225h0.f199187a = null;
            C42518g gVar = C69225h0.f199188b;
            if (gVar != null) {
                gVar.mo85581g();
                C69225h0.f199188b = null;
            }
            C69225h0.f199187a = aVar;
            C42518g gVar2 = new C42518g(i, "", str2);
            C69225h0.f199188b = gVar2;
            C69225h0.m81570a(context, gVar2);
        } else {
            Log.m105924i("MicroMsg.PluginWxPay", "url and materialId is both null");
            C69225h0.m81572c(context, "", aVar);
        }
    }

    /* renamed from: l2 */
    public void mo107984l2(Context context, HashMap<String, String> hashMap) {
        C69225h0.m81571b();
        C69225h0.m81573d();
        ((HashMap) C75674c.f222274c).clear();
        Intent intent = new Intent();
        intent.putExtra("Chat_User", "1@fackuser");
        intent.putExtra("key_red_packet_preview_extraInfo", hashMap);
        intent.putExtra("finish_direct", true);
        C88144b.m109801s(context, ".ui.chatting.ChattingUI", intent, (Bundle) null);
    }

    public void onAccountReleased(Context context) {
        super.onAccountReleased(context);
        ((C78101i) C86709a0.m107533q(C78101i.class)).cancel();
    }

    public void onCreate(Context context) {
        super.onCreate(context);
        C77767l lVar = new C77767l();
        C78093g gVar = new C78093g();
        lVar.f226572d = gVar;
        C86709a0.m107532n(C78473a.class, lVar);
        C86709a0.m107532n(C78101i.class, gVar);
        C86709a0.m107532n(C10756c.class, new C11854u());
        C79143a.m95769h("WXCreditOpenProcess", C77317d.class);
        C79143a.m95769h("WXCreditManagerProcess", C77314c.class);
        C79143a.m95769h("FingerprintAuth", C78654a.class);
    }

    /* renamed from: v6 */
    public void mo107985v6() {
        Log.m105918d("MicroMsg.PluginWxPay", "re init soter");
        C78101i iVar = (C78101i) C86709a0.m107533q(C78101i.class);
        if (iVar.fr0() == 0) {
            iVar.prepare();
        }
    }

    /* renamed from: w1 */
    public void mo107986w1(String str) {
        C75846b zx02 = C75846b.zx0();
        zx02.getClass();
        ((C119157j) C119157j.f356862d).mo183876g(new C32307c(zx02, str, false), "update_hb_red_flag_2");
    }
}
