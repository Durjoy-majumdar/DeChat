package com.tencent.p014mm.plugin.appbrand.appcache;

import android.os.Looper;
import com.google.android.gms.dynamite.ProviderConstants;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.appbrand.app.C81161g2;
import com.tencent.p014mm.plugin.appbrand.jsapi.file.C1684x0;
import com.tencent.p014mm.pointers.PInt;
import com.tencent.p014mm.sdk.http.HttpWrapperBase;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatHosts;
import com.tencent.p014mm.sdk.statemachine.State;
import com.tencent.p014mm.sdk.statemachine.StateMachine;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.C86013q1;
import ei0.C86518b;
import f40.C86709a0;
import java.util.Locale;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import org.json.JSONObject;
import te3.u45;

/* renamed from: com.tencent.mm.plugin.appbrand.appcache.w0 */
public class C81376w0 extends StateMachine implements Runnable {

    /* renamed from: i */
    public static final String f238875i = (HttpWrapperBase.PROTOCAL_HTTPS + WeChatHosts.domainString(C0966R.string.fmb) + "/weapp/public/commlib/%d.wxapkg");

    /* renamed from: d */
    public final int f238876d;

    /* renamed from: e */
    public final String f238877e;

    /* renamed from: f */
    public final State f238878f = new C81377a();

    /* renamed from: g */
    public final State f238879g = new C81378b();

    /* renamed from: h */
    public final State f238880h = new C81380c();

    /* renamed from: com.tencent.mm.plugin.appbrand.appcache.w0$a */
    public class C81377a extends State {
        public C81377a() {
        }

        public void enter() {
            super.enter();
            Log.m105924i("MicroMsg.LibIncrementalTestCase[incremental]", "WriteMockLibInfo enter");
            String b = C81352s2.m99773b();
            if (Util.isNullOrNil(b)) {
                C81376w0.m99812e(C81376w0.this, "!!MockLibInfo Path Error!!");
                return;
            }
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(ProviderConstants.API_COLNAME_FEATURE_VERSION, C81376w0.this.f238876d);
                C86009m1 m1Var = new C86009m1(b);
                m1Var.mo119966f();
                m1Var.mo119964e();
                byte[] bytes = jSONObject.toString().getBytes("UTF-8");
                int T = C86013q1.m106438T(m1Var.mo119971i(), bytes, 0, bytes.length);
                if (T != 0) {
                    C81376w0 w0Var = C81376w0.this;
                    C81376w0.m99812e(w0Var, "MockLibInfo Write Error " + T);
                    return;
                }
                C81376w0 w0Var2 = C81376w0.this;
                w0Var2.transitionTo(w0Var2.f238879g);
            } catch (Exception e) {
                C81376w0 w0Var3 = C81376w0.this;
                C81376w0.m99812e(w0Var3, "MockLibInfo Write Exception " + e.getMessage());
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.appcache.w0$b */
    public class C81378b extends State {

        /* renamed from: com.tencent.mm.plugin.appbrand.appcache.w0$b$a */
        public class C81379a implements m3$$b {
            public C81379a() {
            }

            /* renamed from: a */
            public void mo113493a(String str, C86518b.C86519a aVar, Object obj) {
                m3$$c m3__c = (m3$$c) obj;
                Log.m105925i("MicroMsg.LibIncrementalTestCase[incremental]", "MockLibInfo Download Result %s", aVar);
                if (aVar != C86518b.C86519a.OK) {
                    C81376w0 w0Var = C81376w0.this;
                    C81376w0.m99812e(w0Var, "Download MockLibInfo Error: " + aVar.name());
                    return;
                }
                MMHandlerThread.postToMainThread(new C81385x0(this));
            }

            /* renamed from: b */
            public /* bridge */ /* synthetic */ void mo113494b(Object obj) {
                WxaPkgLoadProgress wxaPkgLoadProgress = (WxaPkgLoadProgress) obj;
            }
        }

        public C81378b() {
        }

        public void enter() {
            super.enter();
            Log.m105924i("MicroMsg.LibIncrementalTestCase[incremental]", "DownloadMockLibInfo enter");
            u45 u45 = new u45();
            u45.f259842d = String.format(Locale.US, C81376w0.f238875i, new Object[]{Integer.valueOf(C81376w0.this.f238876d)});
            C81376w0 w0Var = C81376w0.this;
            u45.f259844f = w0Var.f238876d;
            u45.f259843e = w0Var.f238877e;
            u45.f259846h = 1;
            C81161g2.requireAccountInitializedOnDemand();
            C81161g2.f238471g.mo113525i(u45, new PInt());
            C81293m3.m99683i("@LibraryAppId", 0, u45.f259844f, u45.f259842d, new C81379a());
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.appcache.w0$c */
    public class C81380c extends State {

        /* renamed from: com.tencent.mm.plugin.appbrand.appcache.w0$c$a */
        public class C81381a implements C11385n {

            /* renamed from: com.tencent.mm.plugin.appbrand.appcache.w0$c$a$a */
            public class C81382a implements m3$$b {
                public C81382a() {
                }

                /* renamed from: a */
                public void mo113493a(String str, C86518b.C86519a aVar, Object obj) {
                    m3$$c m3__c = (m3$$c) obj;
                    if (aVar == C86518b.C86519a.OK) {
                        C81376w0.m99812e(C81376w0.this, "公共库增量(maybe)更新成功，重启微信确认是否生效");
                    } else {
                        C81376w0.m99812e(C81376w0.this, "公共库增量失败");
                    }
                }

                /* renamed from: b */
                public /* bridge */ /* synthetic */ void mo113494b(Object obj) {
                    WxaPkgLoadProgress wxaPkgLoadProgress = (WxaPkgLoadProgress) obj;
                }
            }

            public C81381a() {
            }

            public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
                if (yVar != null && (yVar.getReqResp() instanceof C47350c)) {
                    int i3 = C81376w0.this.f238876d;
                    int i4 = ((u45) ((C47350c) yVar.getReqResp()).f127056b.f127083a).f259844f;
                    C81293m3.m99675a(C81300o2.m99699i("@LibraryAppId", i3, i4), new C81382a());
                }
                C86709a0.m107529k().f251779b.mo123470p(C1684x0.CTRL_INDEX, this);
            }
        }

        public C81380c() {
        }

        public void enter() {
            super.enter();
            Log.m105924i("MicroMsg.LibIncrementalTestCase[incremental]", "FetchNewestLibAndDoIncremental enter");
            C81285k2.m99657a(true, (Runnable) null);
            C86709a0.m107529k().f251779b.mo123455a(C1684x0.CTRL_INDEX, new C81381a());
        }
    }

    public C81376w0(int i, String str) {
        super("LibIncrementalTestCase", Looper.getMainLooper());
        this.f238876d = i;
        this.f238877e = str;
    }

    /* renamed from: e */
    public static void m99812e(C81376w0 w0Var, String str) {
        w0Var.getClass();
        MMHandlerThread.postToMainThread(new C81392y0(w0Var, str));
    }

    public void onQuitting() {
        super.onQuitting();
        Log.m105924i("MicroMsg.LibIncrementalTestCase[incremental]", "TestCase onQuitting");
    }

    public void run() {
        addState(this.f238878f);
        addState(this.f238879g);
        addState(this.f238880h);
        setInitialState(this.f238878f);
        start();
    }
}
