package td0;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.p014mm.msgsubscription.SubscribeMsgTmpItem;
import com.tencent.p014mm.msgsubscription.p017ui.SubscribeMsgRequestProxyUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import fy3.C32226l;
import gy3.C8479f0;
import gy3.C8480h;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import k20.C60958c;
import k20.C9556a;
import org.json.JSONObject;
import rd0.C22222c;
import rd0.C22226d;
import rd0.C22227f;
import rx3.C13598b0;
import sx3.C64197v;
import xd0.C23073a;
import xd0.C23074b;
import xd0.C23081h;
import xd0.C23084k;
import yd0.C23285b;
import yd0.C23288c;
import yd0.C23289d;
import yd0.C23292e;
import yd0.C23299h;
import yd0.C23303i;
import zt3.C119157j;

/* renamed from: td0.a */
public class C22478a implements C22222c {

    /* renamed from: d */
    public static final C22482a f63656d = new C22482a((C8480h) null);

    /* renamed from: e */
    public static final HashMap<String, HashMap<String, C22222c.C22224b>> f63657e = new HashMap<>();

    /* renamed from: a */
    public final C23073a f63658a;

    /* renamed from: b */
    public final C23074b f63659b;

    /* renamed from: c */
    public final C22488g f63660c = new C22488g(this);

    /* renamed from: td0.a$b */
    public static final class C22479b {

        /* renamed from: a */
        public final String f63661a;

        /* renamed from: b */
        public final String f63662b;

        /* renamed from: c */
        public final int f63663c;

        /* renamed from: d */
        public C22222c.C22224b f63664d;

        public C22479b(String str, String str2, int i) {
            C87412m.m108594g(str, "bizUsername");
            C87412m.m108594g(str2, "templateId");
            this.f63661a = str;
            this.f63662b = str2;
            this.f63663c = i;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C22479b)) {
                return false;
            }
            C22479b bVar = (C22479b) obj;
            return C87412m.m108589b(this.f63661a, bVar.f63661a) && C87412m.m108589b(this.f63662b, bVar.f63662b) && this.f63663c == bVar.f63663c;
        }

        public int hashCode() {
            return (((this.f63661a.hashCode() * 31) + this.f63662b.hashCode()) * 31) + this.f63663c;
        }

        public String toString() {
            return "UpdateSubscribeStatusTask(bizUsername=" + this.f63661a + ", templateId=" + this.f63662b + ", uiStatus=" + this.f63663c + ')';
        }
    }

    /* renamed from: td0.a$c */
    public static final class C22480c implements C22222c.C22224b {

        /* renamed from: a */
        public final /* synthetic */ C22478a f63665a;

        /* renamed from: b */
        public final /* synthetic */ String f63666b;

        public C22480c(C22478a aVar, String str) {
            this.f63665a = aVar;
            this.f63666b = str;
        }

        /* renamed from: a */
        public void mo35378a() {
            this.f63665a.mo35622t(this.f63666b, C22483b.f63670d);
        }

        /* renamed from: b */
        public void mo35379b(String str, C22222c.C22225c cVar) {
            C87412m.m108594g(str, "templateId");
            C87412m.m108594g(cVar, "result");
            C22478a.m26219s(this.f63665a, str, cVar);
        }
    }

    /* renamed from: td0.a$d */
    public static final class C22481d implements C22222c.C22224b {

        /* renamed from: a */
        public final /* synthetic */ C22478a f63667a;

        /* renamed from: b */
        public final /* synthetic */ SubscribeMsgTmpItem f63668b;

        /* renamed from: c */
        public final /* synthetic */ C22222c.C22224b f63669c;

        public C22481d(C22478a aVar, SubscribeMsgTmpItem subscribeMsgTmpItem, C22222c.C22224b bVar) {
            this.f63667a = aVar;
            this.f63668b = subscribeMsgTmpItem;
            this.f63669c = bVar;
        }

        /* renamed from: a */
        public void mo35378a() {
            this.f63667a.mo35622t(this.f63668b.f49021f, C22483b.f63670d);
            C22222c.C22224b bVar = this.f63669c;
            if (bVar != null) {
                bVar.mo35378a();
            }
        }

        /* renamed from: b */
        public void mo35379b(String str, C22222c.C22225c cVar) {
            C87412m.m108594g(str, "templateId");
            C87412m.m108594g(cVar, "result");
            C22478a.m26219s(this.f63667a, this.f63668b.f49021f, cVar);
            C22222c.C22224b bVar = this.f63669c;
            if (bVar != null) {
                bVar.mo35379b(this.f63668b.f49021f, cVar);
            }
        }
    }

    /* renamed from: td0.a$a */
    public static final class C22482a {
        public C22482a(C8480h hVar) {
        }

        /* renamed from: a */
        public final void mo35626a(String str, String str2, C22222c.C22224b bVar) {
            C87412m.m108594g(str, "templateId");
            C87412m.m108594g(str2, "viewKey");
            C87412m.m108594g(bVar, "callback");
            HashMap<String, HashMap<String, C22222c.C22224b>> hashMap = C22478a.f63657e;
            HashMap hashMap2 = hashMap.get(str);
            if (hashMap2 == null) {
                hashMap2 = new HashMap();
            }
            hashMap2.put(str2, bVar);
            hashMap.put(str, hashMap2);
            Log.m105925i("MicroMsg.BaseSubscribeMsgService", "alvinluo registerNotifyCallback templateId: %s, size: %d", str, Integer.valueOf(hashMap2.size()));
        }

        /* renamed from: b */
        public final void mo35627b(String str, String str2) {
            C87412m.m108594g(str, "templateId");
            C87412m.m108594g(str2, "viewKey");
            HashMap hashMap = C22478a.f63657e.get(str);
            if (hashMap != null) {
                hashMap.remove(str2);
            }
            Object[] objArr = new Object[2];
            objArr[0] = str;
            objArr[1] = hashMap != null ? Integer.valueOf(hashMap.size()) : null;
            Log.m105925i("MicroMsg.BaseSubscribeMsgService", "alvinluo unregisterNotifyCallback templateId: %s, size: %s", objArr);
        }
    }

    public C22478a(C23073a aVar) {
        this.f63658a = aVar;
        this.f63659b = new C23074b(aVar);
    }

    /* renamed from: s */
    public static final void m26219s(C22478a aVar, String str, C22222c.C22225c cVar) {
        aVar.getClass();
        Log.m105925i("MicroMsg.BaseSubscribeMsgService", "alvinluo onUpdatedWrapper templateId: %s, isSubscribed: %b, switchOpen: %b", str, Boolean.valueOf(cVar.f62963a), Boolean.valueOf(cVar.f62964b));
        aVar.mo35622t(str, new C22484c(str, cVar));
    }

    /* renamed from: a */
    public boolean mo35360a(String str) {
        C87412m.m108594g(str, "bizUsername");
        C23074b bVar = this.f63659b;
        bVar.getClass();
        C23073a aVar = bVar.f66288a;
        if (aVar != null) {
            return aVar.mo36476r2(str);
        }
        return false;
    }

    /* renamed from: b */
    public void mo35361b(String str, List<SubscribeMsgTmpItem> list, boolean z, boolean z2, boolean z3) {
        C87412m.m108594g(str, "bizUsername");
        C87412m.m108594g(list, "subscribeMsgList");
        this.f63659b.mo36479a(str, list, z, z2, z3);
    }

    /* renamed from: c */
    public SubscribeMsgTmpItem mo35362c(String str, String str2) {
        C87412m.m108594g(str, "bizUsername");
        C87412m.m108594g(str2, "templateId");
        C23074b bVar = this.f63659b;
        bVar.getClass();
        C23073a aVar = bVar.f66288a;
        if (aVar != null) {
            return aVar.mo36478t2(str, str2);
        }
        return null;
    }

    /* renamed from: d */
    public void mo35363d(String str, String str2) {
        C87412m.m108594g(str, "bizUsername");
        C87412m.m108594g(str2, "templateId");
        C22488g gVar = this.f63660c;
        C22480c cVar = new C22480c(this, str2);
        gVar.getClass();
        C22222c cVar2 = gVar.f63684b;
        T c = cVar2 != null ? cVar2.mo35362c(str, str2) : null;
        C8479f0 f0Var = new C8479f0();
        f0Var.f27484d = c;
        C22222c cVar3 = gVar.f63684b;
        boolean z = false;
        boolean a = cVar3 != null ? cVar3.mo35360a(str) : false;
        if (c != null) {
            Log.m105927v("MicroMsg.SubscribeStatusUpdateManager", "alvinluo isTemplateMsgSubscribed read from cache: %d", Integer.valueOf(c.f49025j));
            if (c.f49025j == 1) {
                z = true;
            }
            C22222c.C22225c cVar4 = new C22222c.C22225c(z, a);
            cVar4.f62965c = c.f49032t;
            cVar4.f62966d = c.f49033u;
            cVar.mo35379b(str2, cVar4);
            SubscribeMsgTmpItem subscribeMsgTmpItem = (SubscribeMsgTmpItem) f0Var.f27484d;
            C22479b bVar = new C22479b(str, str2, subscribeMsgTmpItem != null ? subscribeMsgTmpItem.f49025j : -1);
            bVar.f63664d = cVar;
            C13598b0 b0Var = C13598b0.f38549a;
            gVar.mo35628a(subscribeMsgTmpItem, bVar);
            return;
        }
        Log.m105924i("MicroMsg.SubscribeStatusUpdateManager", "alvinluo isTemplateMsgSubscribed read from local");
        C22222c cVar5 = gVar.f63684b;
        if (cVar5 != null) {
            cVar5.mo35369j(str, new C22486e(gVar, f0Var, str2, cVar));
        }
    }

    /* renamed from: e */
    public void mo35364e(String str, String str2, long j) {
        C87412m.m108594g(str, "bizUsername");
        C87412m.m108594g(str2, "templateId");
        C23074b bVar = this.f63659b;
        bVar.getClass();
        C23073a aVar = bVar.f66288a;
        if (aVar != null) {
            C23084k kVar = C23084k.f66311a;
            ArrayList arrayList = new ArrayList();
            Log.m105925i("MicroMsg.SubscribeMsgDataLoader", "alvinluo updateGetSubscribeMsgUiStatusTimestamp timestamp: %s", Long.valueOf(j));
            SubscribeMsgTmpItem subscribeMsgTmpItem = new SubscribeMsgTmpItem(str2, 0, 0, false);
            subscribeMsgTmpItem.f49027o = j;
            arrayList.add(subscribeMsgTmpItem);
            C13598b0 b0Var = C13598b0.f38549a;
            kVar.mo36492b(aVar, new C23303i(str, arrayList, bVar.f66288a, (C22226d) null, 8, (C8480h) null));
        }
    }

    /* renamed from: f */
    public final C23073a mo35365f() {
        return this.f63658a;
    }

    /* renamed from: h */
    public long mo35367h(String str, String str2, List<String> list, String str3, C22226d dVar) {
        C87412m.m108594g(str, "username");
        C87412m.m108594g(str2, "subscribeUrl");
        List<String> list2 = list;
        C87412m.m108594g(list, "templateIdList");
        String str4 = str3;
        C87412m.m108594g(str3, "extInfo");
        C23074b bVar = this.f63659b;
        bVar.getClass();
        Log.m105925i("MicroMsg.SubscribeMsgDataLoader", "alvinluo getSubscribeListByUsername username: %s, url: %s, templateIdList size: %s", str, str2, Integer.valueOf(list.size()));
        C23073a aVar = bVar.f66288a;
        if (aVar == null) {
            return -1;
        }
        C23289d dVar2 = new C23289d(str, "", str2, list, str3, aVar, dVar);
        C23084k.f66311a.mo36492b(bVar.f66288a, dVar2);
        return (long) dVar2.hashCode();
    }

    /* renamed from: i */
    public void mo35368i(long j) {
        this.f63659b.getClass();
        C23084k kVar = C23084k.f66311a;
        ((C119157j) C119157j.f356862d).mo183876g(new C23081h(j), "manager_thread");
    }

    /* renamed from: j */
    public void mo35369j(String str, C22226d dVar) {
        C87412m.m108594g(str, "username");
        C23074b bVar = this.f63659b;
        bVar.getClass();
        Log.m105925i("MicroMsg.SubscribeMsgDataLoader", "alvinluo getLocalSubscribeList username: %s", str);
        C23073a aVar = bVar.f66288a;
        if (aVar != null) {
            C23084k.f66311a.mo36492b(aVar, new C23288c(str, aVar, dVar));
        }
    }

    /* renamed from: k */
    public long mo35370k(C22227f fVar) {
        C87412m.m108594g(fVar, "updateRequest");
        C23074b bVar = this.f63659b;
        bVar.getClass();
        if (bVar.f66288a == null) {
            return -1;
        }
        Log.m105924i("MicroMsg.SubscribeMsgDataLoader", "alvinluo updateSubscribeList username: " + fVar.f62967a + ", appId: " + fVar.f62968b + ", size: " + ((ArrayList) fVar.f62969c).size());
        C23299h hVar = new C23299h(fVar, bVar.f66288a);
        hVar.f66922b = fVar.f62976j;
        hVar.f66923c = fVar.f62977k;
        C23084k.f66311a.mo36492b(bVar.f66288a, hVar);
        return (long) hVar.hashCode();
    }

    /* renamed from: l */
    public void mo35371l(Context context, String str, String str2, Bundle bundle) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(bundle, "extra");
        Log.m105925i("MicroMsg.BaseSubscribeMsgService", "alvinluo clickSubscribeMsgSpan bizUsername: %s, url: %s", str, str2);
        if (str != null && str2 != null) {
            Intent intent = new Intent(context, SubscribeMsgRequestProxyUI.class);
            intent.putExtra("key_biz_username", str);
            intent.putExtra("key_scene", 1);
            intent.putExtra("key_subscribe_url", str2);
            intent.putExtra("key_action", 3);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 4);
            intent.putExtra("key_extra_info", jSONObject.toString());
            intent.putExtras(bundle);
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            C117292a.m165358d(context, aVar.mo10232b(), "com/tencent/mm/msgsubscription/model/SubscribeMsgService", "clickSubscribeMsgSpan", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(context, "com/tencent/mm/msgsubscription/model/SubscribeMsgService", "clickSubscribeMsgSpan", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
    }

    /* renamed from: m */
    public void mo35372m(String str, SubscribeMsgTmpItem subscribeMsgTmpItem, C22222c.C22224b bVar) {
        C87412m.m108594g(str, "bizUsername");
        C87412m.m108594g(subscribeMsgTmpItem, "tmpItem");
        C22488g gVar = this.f63660c;
        C22481d dVar = new C22481d(this, subscribeMsgTmpItem, bVar);
        gVar.getClass();
        Log.m105925i("MicroMsg.SubscribeStatusUpdateManager", "alvinluo switchSubscribeStatus templateId: %s, settingStatus: %d, switchOpened: %b", subscribeMsgTmpItem.f49021f, Integer.valueOf(subscribeMsgTmpItem.f49025j), Boolean.valueOf(subscribeMsgTmpItem.f49026n));
        ArrayList c = C64197v.m75534c(subscribeMsgTmpItem);
        C22222c cVar = gVar.f63684b;
        if (cVar != null) {
            C22222c.C22223a.m25749a(cVar, str, c, false, false, false, 4, (Object) null);
        }
        C22227f fVar = new C22227f();
        fVar.f62967a = str;
        ((ArrayList) fVar.f62969c).addAll(c);
        fVar.f62970d = subscribeMsgTmpItem.f49026n;
        fVar.f62975i = new C22487f(subscribeMsgTmpItem, dVar, gVar, str);
        C22222c cVar2 = gVar.f63684b;
        if (cVar2 != null) {
            cVar2.mo35370k(fVar);
        }
    }

    /* renamed from: n */
    public long mo35373n(String str, String str2, List<String> list, String str3, C22226d dVar) {
        C87412m.m108594g(str, "appId");
        C87412m.m108594g(str2, "subscribeUrl");
        List<String> list2 = list;
        C87412m.m108594g(list, "templateIdList");
        String str4 = str3;
        C87412m.m108594g(str3, "extInfo");
        C23074b bVar = this.f63659b;
        bVar.getClass();
        Log.m105925i("MicroMsg.SubscribeMsgDataLoader", "alvinluo getSubscribeListByAppId appId: %s, url: %s, templateIdList size: %s", str, str2, Integer.valueOf(list.size()));
        C23073a aVar = bVar.f66288a;
        if (aVar == null) {
            return -1;
        }
        C23289d dVar2 = new C23289d("", str, str2, list, str3, aVar, dVar);
        C23084k.f66311a.mo36492b(bVar.f66288a, dVar2);
        return (long) dVar2.hashCode();
    }

    /* renamed from: o */
    public void mo35374o(String str, boolean z) {
        C87412m.m108594g(str, "bizUsername");
        Log.m105925i("MicroMsg.BaseSubscribeMsgService", "alvinluo updateLocalSwitchOpened bizUsername: %s, switchOpened: %b", str, Boolean.valueOf(z));
        C23074b bVar = this.f63659b;
        bVar.getClass();
        bVar.mo36479a(str, new ArrayList(), z, true, false);
    }

    /* renamed from: p */
    public void mo35375p(Context context, int i, int i2, String str, Bundle bundle) {
        Context context2 = context;
        String str2 = str;
        Bundle bundle2 = bundle;
        C87412m.m108594g(context2, "context");
        C87412m.m108594g(str2, "bizAppId");
        Log.m105925i("MicroMsg.BaseSubscribeMsgService", "alvinluo requestSubscribeMsgForResult scene: %d, bizAppId: %s, requestCode: %s", Integer.valueOf(i), str2, Integer.valueOf(i2));
        Intent intent = new Intent(context2, SubscribeMsgRequestProxyUI.class);
        intent.putExtra("key_need_result", true);
        intent.putExtra("key_biz_app_id", str2);
        intent.putExtra("key_scene", i);
        intent.putExtra("key_action", 3);
        if (bundle2 != null) {
            intent.putExtras(bundle2);
        }
        if (context2 instanceof Activity) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(Integer.valueOf(i2));
            aVar.mo10233c(intent);
            C117292a.m165364j((Activity) context2, aVar.mo10232b(), "com/tencent/mm/msgsubscription/model/SubscribeMsgService", "requestSubscribeMsgForResult", "(Landroid/content/Context;IILjava/lang/String;Landroid/os/Bundle;)V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
            return;
        }
        Log.m105920e("MicroMsg.BaseSubscribeMsgService", "alvinluo requestSubscribeMsgForResult context is not activity");
    }

    /* renamed from: q */
    public void mo35376q(String str, C22226d dVar) {
        C87412m.m108594g(str, "username");
        C23074b bVar = this.f63659b;
        bVar.getClass();
        Log.m105925i("MicroMsg.SubscribeMsgDataLoader", "alvinluo getSubscribeMsgListByUsername %s", str);
        C23073a aVar = bVar.f66288a;
        if (aVar != null) {
            C23084k.f66311a.mo36492b(aVar, new C23285b(str, aVar, dVar));
        }
    }

    /* renamed from: r */
    public void mo35377r(String str, List<String> list, C22226d dVar) {
        C87412m.m108594g(str, "username");
        C87412m.m108594g(list, "templateIdList");
        C23074b bVar = this.f63659b;
        bVar.getClass();
        Log.m105925i("MicroMsg.SubscribeMsgDataLoader", "alvinluo getSubscribeStatus username: %s, template size: %d", str, Integer.valueOf(list.size()));
        C23073a aVar = bVar.f66288a;
        if (aVar != null) {
            C23084k.f66311a.mo36492b(aVar, new C23292e(str, list, aVar, dVar));
        }
    }

    /* renamed from: t */
    public final void mo35622t(String str, C32226l<? super C22222c.C22224b, C13598b0> lVar) {
        HashMap hashMap = f63657e.get(str);
        Integer num = null;
        Set<String> keySet = hashMap != null ? hashMap.keySet() : null;
        Object[] objArr = new Object[2];
        objArr[0] = str;
        if (keySet != null) {
            num = Integer.valueOf(keySet.size());
        }
        objArr[1] = num;
        Log.m105925i("MicroMsg.BaseSubscribeMsgService", "alvinluo callbackWrapper templateId: %s, callback size: %s", objArr);
        if (keySet != null) {
            for (String str2 : keySet) {
                lVar.invoke(hashMap.get(str2));
            }
        }
    }
}
