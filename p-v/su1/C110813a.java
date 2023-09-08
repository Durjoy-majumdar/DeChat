package su1;

import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.view.KeyEvent;
import android.view.View;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.plugin.flutter.p884ui.CachedFlutterActivity;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.plugin.voip.model.C106350h0;
import com.tencent.p014mm.plugin.voip.p475ui.VideoActivity;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import di3.C86312j;
import fy3.C32226l;
import gy3.C45984j0;
import gy3.C87412m;
import gy3.C87413o;
import h81.C32735h;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kg3.C76577a;
import l33.C109246a;
import l33.C109247e;
import my3.C34690i;
import my3.C61594j;
import my3.C61595o;
import p172io.flutter.embedding.android.PatchedFlutterActivityController;
import p172io.flutter.embedding.engine.FlutterEngine;
import p172io.flutter.embedding.engine.FlutterEngineCache;
import p33.C110140b;
import p33.C110152e;
import rx3.C13598b0;
import sx3.C36904l0;
import sx3.C36907w;
import z04.C112550d0;

/* renamed from: su1.a */
public final class C110813a extends PatchedFlutterActivityController {

    /* renamed from: f */
    public static final /* synthetic */ int f331533f = 0;

    /* renamed from: d */
    public boolean f331534d;

    /* renamed from: e */
    public CachedFlutterActivity.C105359b f331535e;

    /* renamed from: su1.a$a */
    public static final class C110814a extends C87413o implements C32226l<Boolean, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C110813a f331536d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C110814a(C110813a aVar) {
            super(1);
            this.f331536d = aVar;
        }

        public Object invoke(Object obj) {
            Boolean bool = (Boolean) obj;
            this.f331536d.finish();
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C110813a(VideoActivity videoActivity) {
        super(videoActivity);
        C87412m.m108594g(videoActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    public void configureFlutterEngine(FlutterEngine flutterEngine) {
        C87412m.m108594g(flutterEngine, "flutterEngine");
    }

    public void dealContentView(View view) {
    }

    public void finish() {
        this.vActivity.mo152911I7();
    }

    public String getCachedEngineId() {
        String cachedEngineId = super.getCachedEngineId();
        if (cachedEngineId == null || FlutterEngineCache.getInstance().get(cachedEngineId) == null) {
            this.f331534d = false;
            return null;
        }
        this.f331534d = true;
        return cachedEngineId;
    }

    public int getForceOrientation() {
        return 1;
    }

    public int getLayoutId() {
        return -1;
    }

    public void importUIComponents(HashSet<Class<? extends UIComponent>> hashSet) {
        C87412m.m108594g(hashSet, "set");
    }

    public boolean onBackPressed() {
        C109246a aVar;
        C106350h0 xx02 = C109247e.xx0();
        if (xx02 == null || (aVar = xx02.f317333b) == null) {
            return true;
        }
        aVar.mo149990b0(new C110814a(this));
        return true;
    }

    public void onConfigurationChanged(Configuration configuration) {
        C87412m.m108594g(configuration, "newConfig");
        setupConfiguration(configuration);
        Log.m105924i("MicroMsg.CachedFlutterActivity", "onConfigurationChanged: " + configuration);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        String cachedEngineId = super.getCachedEngineId();
        Log.m105924i("MicroMsg.CachedFlutterActivity", "onCreate: cachedEngineId=" + cachedEngineId);
        if (cachedEngineId == null && ((C32735h) C86312j.m106911c(C32735h.class)).mo58784wf(C32735h.C32737c.clicfg_flutter_voip_finish_if_invalid_intent, true)) {
            Log.m105928w("MicroMsg.CachedFlutterActivity", "finish activity because null cachedEngineId");
            this.vActivity.mo152911I7();
        } else if (cachedEngineId == null || FlutterEngineCache.getInstance().get(cachedEngineId) != null) {
            C106350h0 xx02 = C109247e.xx0();
            if (xx02 != null) {
                C110152e eVar = xx02.f317355x;
                eVar.getClass();
                C110140b.m149726c(eVar, false, false, false, 7, (Object) null);
            }
        } else {
            Log.m105920e("MicroMsg.CachedFlutterActivity", "launch with cached engine id " + cachedEngineId + ", but it has been destroyed");
            this.vActivity.mo152911I7();
        }
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        C87412m.m108594g(keyEvent, "event");
        CachedFlutterActivity.C105359b bVar = this.f331535e;
        if (bVar != null) {
            return bVar.onKeyDown(i, keyEvent);
        }
        return false;
    }

    public void onResume() {
        super.onResume();
    }

    public void onSwipeBackFinish() {
        C109246a aVar;
        C106350h0 xx02 = C109247e.xx0();
        if (xx02 != null && (aVar = xx02.f317333b) != null) {
            aVar.mo149991c0();
        }
    }

    public void setupConfiguration(Configuration configuration) {
        C87412m.m108594g(configuration, "configuration");
        configuration.uiMode = C85875k4.m106211z() ? 32 : 16;
        configuration.fontScale = C76577a.m92165p(MMApplicationContext.getContext());
        String applicationLanguage = LocaleUtil.getApplicationLanguage();
        if (!(applicationLanguage == null || applicationLanguage.length() == 0)) {
            C87412m.m108593f(applicationLanguage, FFmpegMetadataRetriever.METADATA_KEY_LANGUAGE);
            List T = C112550d0.m153784T(applicationLanguage, new char[]{'_'}, false, 0, 6, (Object) null);
            Locale locale = new Locale((String) T.get(0), T.size() > 1 ? (String) T.get(1) : "", "");
            if (Build.VERSION.SDK_INT >= 24) {
                LocaleList locales = configuration.getLocales();
                C87412m.m108593f(locales, "configuration.locales");
                C61594j i = C61595o.m72301i(0, locales.size());
                ArrayList arrayList = new ArrayList(C36907w.m41090l(i, 10));
                Iterator it = i.iterator();
                while (((C34690i) it).hasNext()) {
                    arrayList.add(locales.get(((C36904l0) it).mo59695a()));
                }
                ArrayList arrayList2 = new ArrayList();
                Iterator it4 = arrayList.iterator();
                while (it4.hasNext()) {
                    Object next = it4.next();
                    Locale locale2 = (Locale) next;
                    if (!C87412m.m108589b(locale2.getLanguage(), locale.getLanguage()) && !C87412m.m108589b(locale2.getCountry(), locale.getCountry())) {
                        arrayList2.add(next);
                    }
                }
                Object[] array = arrayList2.toArray(new Locale[0]);
                C87412m.m108592e(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                C45984j0 j0Var = new C45984j0(2);
                j0Var.mo71372a(locale);
                j0Var.mo71373b((Locale[]) array);
                configuration.setLocales(new LocaleList((Locale[]) j0Var.mo71375d(new Locale[j0Var.mo71374c()])));
            } else {
                configuration.locale = locale;
            }
        }
        this.vActivity.getResources().getDisplayMetrics().setTo(MMApplicationContext.getResources().getDisplayMetrics());
    }

    public boolean shouldDestroyEngineWithHost() {
        String cachedEngineId = super.getCachedEngineId();
        if (!this.f331534d) {
            return true;
        }
        if (cachedEngineId == null || FlutterEngineCache.getInstance().get(cachedEngineId) != null) {
            return super.shouldDestroyEngineWithHost();
        }
        return false;
    }
}
