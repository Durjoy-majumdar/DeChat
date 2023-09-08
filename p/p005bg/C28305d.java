package p005bg;

import android.content.Context;
import com.tencent.p014mm.advertise.impl.jsapi.C0980a;
import com.tencent.p014mm.advertise.impl.jsapi.C0983b;
import com.tencent.p014mm.advertise.impl.jsapi.MBJsApiClearAdPushMsg;
import com.tencent.p014mm.advertise.impl.jsapi.MBJsApiGetAdPushMsg;
import com.tencent.p014mm.advertise.impl.publicservice.file.MagicAdPublicServicePkgManagement;
import com.tencent.p014mm.advertise.util.MagicAdPushMsg;
import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82543i5;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82870p;
import com.tencent.p014mm.plugin.appbrand.jsapi.JsApiOnWebPageUrlExposed;
import com.tencent.p014mm.plugin.appbrand.jsapi.JsApiWriteCommData;
import com.tencent.p014mm.plugin.appbrand.jsapi.appdownload.JsApiGetInstallState;
import com.tencent.p014mm.plugin.magicbrush.C30172a0;
import com.tencent.p014mm.plugin.magicbrush.C30183d0;
import com.tencent.p014mm.plugin.magicbrush.C30211n0;
import com.tencent.p014mm.plugin.magicbrush.api.MagicBrushConstants$PublicServiceNames;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import d42.C31067e0;
import d42.C86186n;
import di3.C86301e;
import di3.C86312j;
import e42.C7594e;
import ei3.C86522b;
import el0.C7735a;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import kr0.C88274h0;
import org.json.JSONArray;
import org.json.JSONObject;
import p142dg.C7327a;
import p519fg.C32028a;
import p519fg.C32029b;
import p519fg.C32035h;
import p962eg.C86515a;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import sx3.C110818d0;
import sx3.C110826x0;
import tm0.C90538k;

@C86522b(dependencies = {C30211n0.class}, onProcess = {C80625v0.MATCH_MM, C80625v0.MATCH_APPBRAND1})
/* renamed from: bg.d */
public final class C28305d extends C86301e implements C0277c {

    /* renamed from: d */
    public final C13601g f77906d = C36568h.m40985a(C28306a.f77907d);

    /* renamed from: bg.d$a */
    public static final class C28306a extends C87413o implements C32224a<C86515a> {

        /* renamed from: d */
        public static final C28306a f77907d = new C28306a();

        public C28306a() {
            super(0);
        }

        public Object invoke() {
            return new C86515a(((C30183d0) C86312j.m106911c(C30183d0.class)).Ep0(MagicBrushConstants$PublicServiceNames.BIZ_AD_PUBLIC_SERVICE));
        }
    }

    /* renamed from: bg.d$b */
    public static final class C28307b extends C87413o implements C32226l<String, C86186n> {

        /* renamed from: d */
        public static final C28307b f77908d = new C28307b();

        public C28307b() {
            super(1);
        }

        public Object invoke(Object obj) {
            String str = (String) obj;
            C87412m.m108594g(str, "instanceName");
            return new MagicAdPublicServicePkgManagement(str);
        }
    }

    /* renamed from: Bh */
    public JSONArray mo553Bh(String str, String str2) {
        C87412m.m108594g(str, "bizName");
        C87412m.m108594g(str2, "slotId");
        List<C32028a> a = C32035h.f85269a.mo58461a(str, str2);
        JSONArray jSONArray = new JSONArray();
        for (C32028a next : a) {
            C87412m.m108594g(next, "info");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("opcode", next.mo61718p2());
            jSONObject.put("aid", next.mo61714l2());
            jSONObject.put("slotid", next.mo61716n2());
            jSONObject.put("op_time", next.mo61715m2());
            jSONObject.put("traceid", next.mo61717o2());
            jSONArray.put(jSONObject);
        }
        return jSONArray;
    }

    /* renamed from: S */
    public <T extends C7594e> C31067e0<T> mo554S(String str) {
        String str2 = str;
        Class cls = C30172a0.class;
        C87412m.m108594g(str2, "bizName");
        Class cls2 = C88274h0.class;
        List Ep0 = ((C30183d0) C86312j.m106911c(C30183d0.class)).Ep0(str2);
        C82870p Xg0 = ((C88274h0) C86312j.m106911c(cls2)).Xg0(66012);
        C87412m.m108592e(Xg0, "null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.jsapi.AppBrandAsyncJsApi<*>");
        C30172a0 a0Var = (C30172a0) C86312j.m106911c(cls);
        C82870p Xg02 = ((C88274h0) C86312j.m106911c(cls2)).Xg0(508);
        C87412m.m108592e(Xg02, "null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.jsapi.AppBrandAsyncJsApi<*>");
        C30172a0 a0Var2 = (C30172a0) C86312j.m106911c(cls);
        C82870p Xg03 = ((C88274h0) C86312j.m106911c(cls2)).Xg0(407);
        C87412m.m108592e(Xg03, "null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.jsapi.AppBrandAsyncJsApi<*>");
        HashSet b = C110826x0.m151014b(new C0983b(), new C0980a(), new MBJsApiGetAdPushMsg(), new MBJsApiClearAdPushMsg(), a0Var.Cu0((C82268c) Xg0, str2), a0Var2.Cu0((C82268c) Xg02, str2), ((C30172a0) C86312j.m106911c(cls)).Cu0((C82268c) Xg03, str2));
        C110818d0.m150949u0(Ep0, b);
        return new C31067e0<>(b, C110826x0.m151014b(JsApiGetInstallState.class.getName(), JsApiWriteCommData.class.getName(), C90538k.class.getName(), ((C88274h0) C86312j.m106911c(cls2)).Xg0(C7735a.CTRL_INDEX).getClass().getName(), ((C88274h0) C86312j.m106911c(cls2)).Xg0(251).getClass().getName(), ((C88274h0) C86312j.m106911c(cls2)).Xg0(JsApiOnWebPageUrlExposed.CTRL_INDEX).getClass().getName(), ((C88274h0) C86312j.m106911c(cls2)).Xg0(C82543i5.CTRL_INDEX).getClass().getName(), ((C88274h0) C86312j.m106911c(cls2)).Xg0(711).getClass().getName(), ((C88274h0) C86312j.m106911c(cls2)).Xg0(969).getClass().getName(), ((C88274h0) C86312j.m106911c(cls2)).Xg0(970).getClass().getName(), ((C88274h0) C86312j.m106911c(cls2)).Xg0(1112).getClass().getName(), ((C88274h0) C86312j.m106911c(cls2)).Xg0(1001).getClass().getName()));
    }

    /* renamed from: Yt */
    public List<MagicAdPushMsg> mo555Yt(String str, String str2) {
        C87412m.m108594g(str, "bizName");
        C87412m.m108594g(str2, "slotId");
        List<C32028a> a = C32035h.f85269a.mo58461a(str, str2);
        ArrayList arrayList = new ArrayList();
        for (C32028a next : a) {
            C87412m.m108594g(next, "info");
            int p2 = next.mo61718p2();
            long l2 = next.mo61714l2();
            long n2 = next.mo61716n2();
            long m2 = next.mo61715m2();
            String o2 = next.mo61717o2();
            C87412m.m108593f(o2, "info.getMessage_traceid()");
            arrayList.add(new MagicAdPushMsg(p2, l2, n2, m2, o2));
        }
        return arrayList;
    }

    public C7327a<?> h30() {
        return (C86515a) ((C36570n) this.f77906d).getValue();
    }

    /* renamed from: j0 */
    public boolean mo557j0(String str, String str2) {
        C87412m.m108594g(str, "bizName");
        C87412m.m108594g(str2, "slotId");
        C32035h hVar = C32035h.f85269a;
        C115669n.INSTANCE.mo160131h(27060, str, 2, str2, 0);
        C32029b b = hVar.mo58462b();
        if (b == null) {
            return false;
        }
        int delete = b.delete("AdvertisePushDBInfo", "message_slotid=?", new String[]{"" + str2});
        if (delete >= 0) {
            return true;
        }
        Log.m105920e("MicroMsg.AdvertisePushDBInfoStorage", "clearSpecificSlotMsg error,delete ret:" + delete);
        return false;
    }

    public void onCreate(Context context) {
        C87412m.m108594g(context, "context");
        super.onCreate(context);
        ((C30211n0) C86312j.m106911c(C30211n0.class)).mo57229My(MagicBrushConstants$PublicServiceNames.BIZ_AD_PUBLIC_SERVICE, C28307b.f77908d);
    }
}
