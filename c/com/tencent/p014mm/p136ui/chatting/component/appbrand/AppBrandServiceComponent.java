package com.tencent.p014mm.p136ui.chatting.component.appbrand;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.OnWxaOptionsChangedEvent;
import com.tencent.p014mm.p136ui.C44701a2;
import com.tencent.p014mm.plugin.appbrand.config.WxaAttributes;
import com.tencent.p014mm.plugin.appbrand.config.WxaExposedParams;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import j20.C117292a;
import java.util.ArrayList;
import ke3.C88144b;
import kj3.C10283j;
import kj3.C76587i;
import kj3.C88158f;
import kr0.C76629w0;
import ob0.C47350c;
import ob0.C89144l0;
import org.xwalk.core.XWalkEnvironment;
import te3.C49367f22;
import te3.C49504g22;

/* renamed from: com.tencent.mm.ui.chatting.component.appbrand.AppBrandServiceComponent */
public class AppBrandServiceComponent extends C73426d {

    /* renamed from: e */
    public int f215774e;

    /* renamed from: f */
    public int f215775f;

    /* renamed from: g */
    public WxaExposedParams f215776g;

    /* renamed from: h */
    public String f215777h;

    /* renamed from: i */
    public String f215778i;

    /* renamed from: j */
    public String f215779j;

    /* renamed from: n */
    public String f215780n;

    /* renamed from: o */
    public String f215781o;

    /* renamed from: p */
    public String f215782p;

    /* renamed from: q */
    public boolean f215783q;

    /* renamed from: r */
    public IListener<OnWxaOptionsChangedEvent> f215784r = new IListener<OnWxaOptionsChangedEvent>(C40008f.f107254d) {
        {
            this.__eventId = 495598387;
        }

        public boolean callback(IEvent iEvent) {
            OnWxaOptionsChangedEvent onWxaOptionsChangedEvent = (OnWxaOptionsChangedEvent) iEvent;
            OnWxaOptionsChangedEvent.C67747a aVar = onWxaOptionsChangedEvent.f193781d;
            boolean z = false;
            if (aVar == null || aVar.f193782a == null) {
                Log.m105920e("MicroMsg.AppBrandServiceComponent", "OnWxaOptionsChangedEvent event is empty");
                return false;
            }
            OnWxaOptionsChangedEvent.C67747a aVar2 = onWxaOptionsChangedEvent.f193781d;
            Log.m105919d("MicroMsg.AppBrandServiceComponent", "OnWxaOptionsChangedEvent username:%s,event.brandId:%s,event.newValue:%d", AppBrandServiceComponent.this.f215796d.mo91577r(), aVar2.f193782a, Integer.valueOf(aVar2.f193783b));
            if (onWxaOptionsChangedEvent.f193781d.f193782a.equals(AppBrandServiceComponent.this.f215796d.mo91577r())) {
                AppBrandServiceComponent appBrandServiceComponent = AppBrandServiceComponent.this;
                if ((onWxaOptionsChangedEvent.f193781d.f193783b & 2) > 0) {
                    z = true;
                }
                appBrandServiceComponent.f215783q = z;
                MMHandlerThread.postToMainThread(new C73423a(this));
            }
            return true;
        }
    };

    /* renamed from: s */
    public String f215785s = "";

    /* renamed from: t */
    public C88158f f215786t;

    /* renamed from: u */
    public String f215787u;

    /* renamed from: com.tencent.mm.ui.chatting.component.appbrand.AppBrandServiceComponent$a */
    public class C73420a implements View.OnClickListener {
        public C73420a() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/chatting/component/appbrand/AppBrandServiceComponent$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            Log.m105924i("MicroMsg.AppBrandServiceComponent", "MMTitleGotoBtn onClick");
            AppBrandServiceComponent appBrandServiceComponent = AppBrandServiceComponent.this;
            Activity f = appBrandServiceComponent.f215796d.mo91565f();
            WxaExposedParams wxaExposedParams = AppBrandServiceComponent.this.f215776g;
            appBrandServiceComponent.getClass();
            if (f == null || wxaExposedParams == null) {
                Log.m105920e("MicroMsg.AppBrandServiceComponent", "activity or exportUrlParams is null");
            } else if (7 == appBrandServiceComponent.f215775f) {
                Log.m105924i("MicroMsg.AppBrandServiceComponent", "goToAppBrandProfileUI, from profile");
                f.finish();
            } else {
                Log.m105925i("MicroMsg.AppBrandServiceComponent", "exportUrlParams : %s", wxaExposedParams.toString());
                if (!Util.isNullOrNil(wxaExposedParams.f239542g)) {
                    Intent intent = new Intent();
                    intent.putExtra("key_username", wxaExposedParams.f239542g);
                    intent.putExtra("key_from_scene", 8);
                    intent.putExtra("key_scene_exposed_params", wxaExposedParams);
                    C88144b.m109791i(f, XWalkEnvironment.MODULE_APPBRAND, ".ui.AppBrandProfileUI", intent, (Bundle) null);
                }
            }
            C117292a.m165361g(this, "com/tencent/mm/ui/chatting/component/appbrand/AppBrandServiceComponent$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.component.appbrand.AppBrandServiceComponent$b */
    public class C73421b extends C44701a2 {

        /* renamed from: com.tencent.mm.ui.chatting.component.appbrand.AppBrandServiceComponent$b$a */
        public class C73422a implements Runnable {
            public C73422a() {
            }

            public void run() {
                AppBrandServiceComponent appBrandServiceComponent = AppBrandServiceComponent.this;
                appBrandServiceComponent.f215786t.f254948e = appBrandServiceComponent.f215796d.mo91577r();
                AppBrandServiceComponent appBrandServiceComponent2 = AppBrandServiceComponent.this;
                C88158f fVar = appBrandServiceComponent2.f215786t;
                fVar.f254952i = false;
                int i = appBrandServiceComponent2.f215774e;
                fVar.f254951h = i;
                fVar.f254950g = appBrandServiceComponent2.f215777h;
                fVar.f254947d = appBrandServiceComponent2.f215776g;
                if (i != 2 && i != 3) {
                    fVar.f254949f = appBrandServiceComponent2.mo102372c();
                    AppBrandServiceComponent appBrandServiceComponent3 = AppBrandServiceComponent.this;
                    if (appBrandServiceComponent3.f215783q) {
                        appBrandServiceComponent3.f215786t.mo122570e(5);
                    } else {
                        appBrandServiceComponent3.f215786t.mo122570e(6);
                    }
                } else if (appBrandServiceComponent2.f215783q) {
                    fVar.mo122570e(1);
                } else {
                    fVar.mo122570e(2);
                }
            }
        }

        public C73421b() {
        }

        /* renamed from: a */
        public void mo62772a(MenuItem menuItem) {
            AppBrandServiceComponent.this.f215796d.mo91578s();
            AppBrandServiceComponent appBrandServiceComponent = AppBrandServiceComponent.this;
            C73422a aVar = new C73422a();
            appBrandServiceComponent.getClass();
            MMHandlerThread.postToMainThread(new C73424b(appBrandServiceComponent, aVar));
        }
    }

    /* renamed from: F4 */
    public void mo26186F4() {
        this.f215784r.alive();
    }

    /* renamed from: G4 */
    public void mo26160G4() {
        this.f215784r.dead();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0052, code lost:
        if (r7.f215781o.equals(r7.f215785s) != false) goto L_0x008e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x00b8  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x00c6  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo102371a() {
        /*
            r7 = this;
            java.lang.Class<zj3.c0> r0 = zj3.C79343c0.class
            java.lang.String r1 = "MicroMsg.AppBrandServiceComponent"
            java.lang.String r2 = "updateStaticTitle()"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r2)
            ck3.b r1 = r7.f215796d
            java.lang.String r1 = r1.mo91577r()
            java.lang.String r1 = kj3.C76587i.m92182b(r1)
            java.lang.String r1 = kj3.C76587i.m92183c(r1)
            r7.f215785s = r1
            java.lang.String r1 = r7.f215780n
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r1 != 0) goto L_0x002c
            ck3.b r1 = r7.f215796d
            com.tencent.mm.ui.chatting.BaseChattingUIFragment r1 = r1.f193286j
            java.lang.String r2 = r7.f215780n
            r1.setMMTitle((java.lang.String) r2)
            goto L_0x0037
        L_0x002c:
            ck3.b r1 = r7.f215796d
            com.tencent.mm.ui.chatting.BaseChattingUIFragment r2 = r1.f193286j
            java.lang.String r1 = r1.mo91576q()
            r2.setMMTitle((java.lang.String) r1)
        L_0x0037:
            java.lang.String r1 = r7.f215781o
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            r2 = 1
            r3 = 0
            if (r1 != 0) goto L_0x0055
            ck3.b r1 = r7.f215796d
            com.tencent.mm.ui.chatting.BaseChattingUIFragment r1 = r1.f193286j
            java.lang.String r4 = r7.f215781o
            r1.setMMSubTitle((java.lang.String) r4)
            java.lang.String r1 = r7.f215781o
            java.lang.String r4 = r7.f215785s
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L_0x0067
            goto L_0x008e
        L_0x0055:
            java.lang.String r1 = r7.f215785s
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            r4 = 2131821345(0x7f110321, float:1.927543E38)
            if (r1 == 0) goto L_0x0069
            ck3.b r1 = r7.f215796d
            com.tencent.mm.ui.chatting.BaseChattingUIFragment r1 = r1.f193286j
            r1.setMMSubTitle((int) r4)
        L_0x0067:
            r2 = 0
            goto L_0x008e
        L_0x0069:
            ck3.b r1 = r7.f215796d
            com.tencent.mm.ui.chatting.BaseChattingUIFragment r1 = r1.f193286j
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            android.content.Context r6 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            java.lang.String r4 = r6.getString(r4)
            r5.append(r4)
            java.lang.String r4 = "-"
            r5.append(r4)
            java.lang.String r4 = r7.f215785s
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            r1.setMMSubTitle((java.lang.String) r4)
        L_0x008e:
            r1 = 0
            com.tencent.mm.ui.chatting.component.appbrand.b r4 = new com.tencent.mm.ui.chatting.component.appbrand.b
            r4.<init>(r7, r1)
            com.tencent.p014mm.sdk.platformtools.MMHandlerThread.postToMainThread(r4)
            ck3.b r1 = r7.f215796d
            com.tencent.mm.ui.chatting.manager.a r1 = r1.f193278b
            xi.d r1 = r1.mo102812a(r0)
            zj3.c0 r1 = (zj3.C79343c0) r1
            com.tencent.mm.ui.chatting.component.appbrand.AppBrandServiceComponent$a r4 = new com.tencent.mm.ui.chatting.component.appbrand.AppBrandServiceComponent$a
            r4.<init>()
            android.content.Context r5 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            r6 = 2131821336(0x7f110318, float:1.9275412E38)
            java.lang.String r5 = r5.getString(r6)
            r1.mo102609P2(r2, r4, r5)
            boolean r1 = r7.f215783q
            if (r1 == 0) goto L_0x00c6
            ck3.b r1 = r7.f215796d
            com.tencent.mm.ui.chatting.manager.a r1 = r1.f193278b
            xi.d r0 = r1.mo102812a(r0)
            zj3.c0 r0 = (zj3.C79343c0) r0
            r0.mo102626l5(r3)
            goto L_0x00d5
        L_0x00c6:
            ck3.b r1 = r7.f215796d
            com.tencent.mm.ui.chatting.manager.a r1 = r1.f193278b
            xi.d r0 = r1.mo102812a(r0)
            zj3.c0 r0 = (zj3.C79343c0) r0
            r1 = 8
            r0.mo102626l5(r1)
        L_0x00d5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.chatting.component.appbrand.AppBrandServiceComponent.mo102371a():void");
    }

    /* renamed from: c */
    public String mo102372c() {
        if (!Util.isNullOrNil(this.f215778i)) {
            this.f215787u = this.f215778i;
        }
        if (Util.isNullOrNil(this.f215787u)) {
            WxaAttributes N2 = ((C76629w0) C86312j.m106911c(C76629w0.class)).mo106879N2(this.f215796d.mo91577r());
            this.f215787u = N2 == null ? null : N2.field_appId;
        }
        if (Util.isNullOrNil(this.f215787u)) {
            Log.m105920e("MicroMsg.AppBrandServiceComponent", "error, appId is null");
        }
        return this.f215787u;
    }

    /* renamed from: e */
    public void mo70065e() {
        boolean z = true;
        this.f215774e = this.f215796d.f193286j.getIntExtra("app_brand_chatting_from_scene", 1);
        this.f215775f = this.f215796d.f193286j.getIntExtra("app_brand_chatting_from_scene_new", 3);
        this.f215776g = (WxaExposedParams) this.f215796d.f193286j.getParcelableExtra("app_brand_chatting_expose_params");
        this.f215777h = Util.nullAsNil(this.f215796d.f193286j.getStringExtra("key_scene_id"));
        Log.m105925i("MicroMsg.AppBrandServiceComponent", "onChattingInit() fromScene:%d newScene:%d wxaExposedParams:%s mSceneId:%s", Integer.valueOf(this.f215774e), Integer.valueOf(this.f215775f), this.f215776g, this.f215777h);
        String stringExtra = this.f215796d.f193286j.getStringExtra("keyPrivateAppId");
        this.f215778i = stringExtra;
        if (!Util.isNullOrNil(stringExtra)) {
            this.f215779j = this.f215796d.f193286j.getStringExtra("keyPrivateUserName");
            this.f215780n = this.f215796d.f193286j.getStringExtra("keyPrivateTitle");
            this.f215781o = this.f215796d.f193286j.getStringExtra("keyPrivateSubTitle");
            String stringExtra2 = this.f215796d.f193286j.getStringExtra("keyPrivateHeadImage");
            this.f215782p = stringExtra2;
            Log.m105925i("MicroMsg.AppBrandServiceComponent", "onChattingInit customized appId:%s, username:%s, title:%s, subtitle:%s, headImage:%s", this.f215778i, this.f215779j, this.f215780n, this.f215781o, stringExtra2);
        }
        this.f215786t = new C88158f(this.f215796d.mo91565f());
        WxaAttributes N2 = ((C76629w0) C86312j.m106911c(C76629w0.class)).mo106879N2(this.f215796d.mo91577r());
        if (N2 == null || (N2.field_appOpt & 2) <= 0) {
            z = false;
        }
        this.f215783q = z;
        String r = this.f215796d.mo91577r();
        String c = mo102372c();
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127069d = 2912;
        bVar.f127068c = "/cgi-bin/mmbiz-bin/wxabusiness/getkefusessioninfo";
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C49367f22 f222 = new C49367f22();
        String b = C76587i.m92182b(r);
        if (Util.isNullOrNil(b)) {
            f222.f133249d = c;
            f222.f133250e = "";
        } else {
            f222.f133249d = C76587i.m92181a(b);
            f222.f133250e = c;
        }
        bVar.f127066a = f222;
        bVar.f127067b = new C49504g22();
        C89144l0.m111429e(bVar.mo72403a(), new C10283j(), false);
    }

    /* renamed from: p5 */
    public String mo102373p5() {
        return this.f215782p;
    }

    /* renamed from: u4 */
    public void mo102374u4() {
        this.f215796d.f193286j.addIconOptionMenu(0, (int) C0966R.string.f7765qz, (int) C0966R.raw.icons_outlined_more, (MenuItem.OnMenuItemClickListener) new C73421b());
    }
}
