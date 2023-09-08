package com.tencent.p014mm.plugin.wear.model;

import android.content.Context;
import androidx.camera.core.FocusMeteringAction;
import com.google.android.gms.wearable.DataItem;
import com.google.android.gms.wearable.DataItemBuffer;
import com.google.android.gms.wearable.Wearable;
import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.storage.C72972g4;
import di3.C86301e;
import di3.C86312j;
import eb0.C97625j3;
import ei3.C86522b;
import h81.C32735h;
import j73.C117299a;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import n73.C11141g;
import n73.C34744f;
import n73.C47189d;
import n73.C47190e;
import n73.C47191h;
import n73.C47192i;
import n73.C47195l;
import n73.C47196m;
import n73.C47197n;
import n73.C47199o;
import n73.C47200p;
import n73.C47204s;
import n73.C47205t;
import o73.C47335c;
import ob0.C35136m;
import p73.C110188a;
import p73.C110190b;
import tf3.C37080x;

@C86522b(onProcess = {C80625v0.MATCH_MM})
/* renamed from: com.tencent.mm.plugin.wear.model.b */
public class C43457b extends C86301e {

    /* renamed from: d */
    public C47204s f117462d;

    /* renamed from: e */
    public C47205t f117463e;

    /* renamed from: f */
    public C115850e f117464f;

    /* renamed from: g */
    public WearLogic f117465g;

    /* renamed from: h */
    public C43464h f117466h;

    /* renamed from: i */
    public WearBizLogic f117467i;

    /* renamed from: j */
    public WearMessageLogic f117468j;

    /* renamed from: n */
    public C43466j f117469n;

    /* renamed from: o */
    public C43468k f117470o;

    /* renamed from: p */
    public C110188a f117471p;

    /* renamed from: q */
    public C35136m f117472q;

    /* renamed from: com.tencent.mm.plugin.wear.model.b$a */
    public class C43458a extends C47335c {
        public C43458a() {
        }

        /* renamed from: b */
        public String mo67621b() {
            return "PhoneStartTask";
        }

        /* renamed from: c */
        public void mo67622c() {
            C43457b.this.f117463e.mo72269a(20001);
            C43457b.this.f117463e.mo72269a(20008);
        }
    }

    /* renamed from: com.tencent.mm.plugin.wear.model.b$b */
    public class C43459b extends C47335c {
        public C43459b() {
        }

        /* renamed from: b */
        public String mo67621b() {
            return "SyncFileTask";
        }

        /* renamed from: c */
        public void mo67622c() {
            if (C43457b.this.f117464f.mo176382c() != null) {
                C117299a aVar = (C117299a) C43457b.this.f117464f.mo176382c();
                aVar.getClass();
                DataItemBuffer await = Wearable.DataApi.getDataItems(aVar.mo181969b()).await();
                Iterator it = await.iterator();
                while (it.hasNext()) {
                    DataItem dataItem = (DataItem) it.next();
                    String uri = dataItem.getUri().toString();
                    if (uri.startsWith("/wechat")) {
                        Log.m105925i("MicroMsg.Wear.GlobalConnection", "delete data item %s", uri);
                        Wearable.DataApi.deleteDataItems(aVar.mo181969b(), dataItem.getUri());
                    }
                }
                await.release();
            }
            C43457b.this.f117463e.mo72269a(20009);
            C43457b.this.f117463e.mo72269a(20017);
        }
    }

    public C43457b() {
        Log.m105925i("MicroMsg.Wear.SubCoreWear", "Create SubCore, classLoader=%s", C43457b.class.getClassLoader());
    }

    public static C43468k Ax0() {
        vx0().requireAccountInitialized();
        return vx0().f117470o;
    }

    public static C110188a Bx0() {
        if (vx0().f117471p == null) {
            vx0().f117471p = new C110188a();
        }
        return vx0().f117471p;
    }

    public static C43457b vx0() {
        return (C43457b) C86312j.m106911c(C43457b.class);
    }

    public static WearBizLogic wx0() {
        vx0().requireAccountInitialized();
        return vx0().f117467i;
    }

    public static C115850e xx0() {
        vx0().requireAccountInitialized();
        return vx0().f117464f;
    }

    public static C43464h yx0() {
        if (vx0().f117466h == null) {
            vx0().f117466h = new C43464h();
        }
        return vx0().f117466h;
    }

    public static C47205t zx0() {
        vx0().requireAccountInitialized();
        return vx0().f117463e;
    }

    public void onAccountInitialized(Context context) {
        super.onAccountInitialized(context);
        Log.m105924i("MicroMsg.Wear.SubCoreWear", "onAccountPostReset, updated=%b");
        if (((C32735h) C86312j.m106911c(C32735h.class)).mo58782dM(new C37080x()) == 1) {
            Log.m105924i("MicroMsg.Wear.SubCoreWear", "disable wear");
            return;
        }
        this.f117462d = new C47204s();
        this.f117463e = new C47205t();
        this.f117470o = new C43468k();
        this.f117465g = new WearLogic();
        this.f117466h = new C43464h();
        this.f117467i = new WearBizLogic();
        this.f117464f = new C115850e();
        this.f117468j = new WearMessageLogic();
        this.f117469n = new C43466j();
        this.f117471p = new C110188a();
        C110190b bVar = new C110190b();
        this.f117472q = bVar;
        ConcurrentHashMap<Object, C35136m> concurrentHashMap = C35136m.C35140d.f94257a;
        Log.m105925i("MicroMsg.IMessageExtension.Factory", "registerExtensionFor %s, %s", 63, bVar);
        C35136m.C35140d.f94257a.put(63, bVar);
        this.f117462d.mo72268a(this.f117464f.f347576b);
        this.f117462d.mo72268a(this.f117464f.f347577c);
        this.f117462d.mo72268a(this.f117464f.f347578d);
        this.f117462d.mo72268a(new C47192i());
        this.f117462d.mo72268a(new C47191h());
        this.f117462d.mo72268a(new C47190e());
        this.f117462d.mo72268a(new C47189d());
        this.f117462d.mo72268a(new C34744f());
        this.f117462d.mo72268a(new C11141g());
        this.f117462d.mo72268a(new C47195l());
        this.f117462d.mo72268a(new C47197n());
        this.f117462d.mo72268a(new C47200p());
        this.f117462d.mo72268a(new C47199o());
        this.f117462d.mo72268a(new C47196m());
        this.f117470o.mo67630a(new C43458a());
        C43468k kVar = this.f117470o;
        C43459b bVar2 = new C43459b();
        MMHandler mMHandler = kVar.f117490a;
        if (mMHandler != null) {
            kVar.f117490a.sendMessageDelayed(mMHandler.obtainMessage(0, bVar2), FocusMeteringAction.DEFAULT_AUTOCANCEL_DURATION);
        }
    }

    public void onAccountReleased(Context context) {
        super.onAccountReleased(context);
        C35136m mVar = this.f117472q;
        ConcurrentHashMap<Object, C35136m> concurrentHashMap = C35136m.C35140d.f94257a;
        Log.m105925i("MicroMsg.IMessageExtension.Factory", "unregisterExtensionFor %s, %s", 63, mVar);
        C35136m.C35140d.f94257a.remove(63);
        this.f117472q = null;
        Log.m105924i("MicroMsg.Wear.SubCoreWear", "onAccountRelease");
        C47204s sVar = this.f117462d;
        if (sVar != null) {
            sVar.f126760a.clear();
            this.f117462d = null;
        }
        this.f117463e = null;
        WearLogic wearLogic = this.f117465g;
        if (wearLogic != null) {
            wearLogic.f117442g.stopTimer();
            wearLogic.f117438c.dead();
            wearLogic.f117439d.dead();
            wearLogic.f117440e.dead();
            wearLogic.f117441f.dead();
            wearLogic.f117443h.dead();
            wearLogic.f117444i.dead();
            wearLogic.f117445j.dead();
            wearLogic.f117446k.dead();
            wearLogic.f117448m.dead();
            ((C72972g4) C97625j3.m125812b().mo105911z()).sy0(wearLogic.f117447l);
            this.f117465g = null;
        }
        C43464h hVar = this.f117466h;
        if (hVar != null) {
            hVar.getClass();
            this.f117466h = null;
        }
        WearBizLogic wearBizLogic = this.f117467i;
        if (wearBizLogic != null) {
            wearBizLogic.f117427e.dead();
            C97625j3.m125812b().mo105907v().remove(wearBizLogic.f117428f);
            wearBizLogic.f117429g.stopTimer();
            this.f117467i = null;
        }
        C115850e eVar = this.f117464f;
        if (eVar != null) {
            ((C117299a) eVar.f347575a).f351169a.disconnect();
            eVar.f347579e.mo72267b();
            this.f117464f = null;
        }
        WearMessageLogic wearMessageLogic = this.f117468j;
        if (wearMessageLogic != null) {
            wearMessageLogic.getClass();
            MMApplicationContext.getContext().unregisterReceiver(wearMessageLogic);
            this.f117468j = null;
        }
        C43468k kVar = this.f117470o;
        if (kVar != null) {
            kVar.f117490a.quit();
            this.f117470o = null;
        }
        C43466j jVar = this.f117469n;
        if (jVar != null) {
            jVar.getClass();
            MMApplicationContext.getContext().unregisterReceiver(jVar.f117488a);
            this.f117469n = null;
        }
    }
}
