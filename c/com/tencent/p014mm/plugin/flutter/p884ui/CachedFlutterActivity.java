package com.tencent.p014mm.plugin.flutter.p884ui;

import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.view.KeyEvent;
import android.view.WindowInsetsController;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.MMFragmentActivity$$c;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import gy3.C45984j0;
import gy3.C8480h;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kg3.C76577a;
import kotlin.Metadata;
import my3.C34690i;
import my3.C61594j;
import my3.C61595o;
import p172io.flutter.embedding.android.FlutterActivityLaunchConfigs;
import p172io.flutter.embedding.android.PatchedFlutterActivity;
import p172io.flutter.embedding.engine.FlutterEngine;
import p172io.flutter.embedding.engine.FlutterEngineCache;
import p206nj.C11171e;
import sx3.C36904l0;
import sx3.C36907w;
import z04.C112550d0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0007"}, mo182094d2 = {"Lcom/tencent/mm/plugin/flutter/ui/CachedFlutterActivity;", "Lio/flutter/embedding/android/PatchedFlutterActivity;", "<init>", "()V", "a", "b", "c", "flutter-lib_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.flutter.ui.CachedFlutterActivity */
public class CachedFlutterActivity extends PatchedFlutterActivity {

    /* renamed from: e */
    public static final /* synthetic */ int f313157e = 0;

    /* renamed from: d */
    public boolean f313158d;

    /* renamed from: com.tencent.mm.plugin.flutter.ui.CachedFlutterActivity$a */
    public static final class C105358a {
        public C105358a(C8480h hVar) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.flutter.ui.CachedFlutterActivity$b */
    public interface C105359b {
        boolean onKeyDown(int i, KeyEvent keyEvent);
    }

    /* renamed from: com.tencent.mm.plugin.flutter.ui.CachedFlutterActivity$c */
    public static class C105360c implements C105359b {
    }

    static {
        new C105358a((C8480h) null);
    }

    /* renamed from: E7 */
    public final void mo149971E7(Configuration configuration) {
        configuration.uiMode = C85875k4.m106211z() ? 32 : 16;
        configuration.fontScale = C76577a.m92165p(this);
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
        getResources().getDisplayMetrics().setTo(MMApplicationContext.getResources().getDisplayMetrics());
    }

    public void configureFlutterEngine(FlutterEngine flutterEngine) {
        C87412m.m108594g(flutterEngine, "flutterEngine");
    }

    public void finish() {
        super.finish();
        if (getIntent().hasExtra(PatchedFlutterActivity.EXTRA_SUPPORT_SWIPE_BACK)) {
            if (getIntent().getBooleanExtra(PatchedFlutterActivity.EXTRA_SUPPORT_SWIPE_BACK, false)) {
                overridePendingTransition(MMFragmentActivity$$c.f318646c, MMFragmentActivity$$c.f318647d);
            }
        } else if (getBackgroundMode() != FlutterActivityLaunchConfigs.BackgroundMode.transparent) {
            overridePendingTransition(0, C0966R.C0968anim.f2506eu);
        }
    }

    public String getCachedEngineId() {
        String cachedEngineId = super.getCachedEngineId();
        if (cachedEngineId == null || FlutterEngineCache.getInstance().get(cachedEngineId) == null) {
            this.f313158d = false;
            return null;
        }
        this.f313158d = true;
        return cachedEngineId;
    }

    public void onConfigurationChanged(Configuration configuration) {
        C87412m.m108594g(configuration, "newConfig");
        mo149971E7(configuration);
        super.onConfigurationChanged(configuration);
    }

    public void onCreate(Bundle bundle) {
        Configuration configuration = getResources().getConfiguration();
        C87412m.m108593f(configuration, "resources.configuration");
        mo149971E7(configuration);
        super.onCreate(bundle);
        String cachedEngineId = super.getCachedEngineId();
        if (cachedEngineId != null && FlutterEngineCache.getInstance().get(cachedEngineId) == null) {
            Log.m105920e("MicroMsg.CachedFlutterActivity", "launch with cached engine id " + cachedEngineId + ", but it has been destroyed");
            finish();
        }
        if (getIntent().hasExtra(PatchedFlutterActivity.EXTRA_LIGHT_STATUS_BARS)) {
            boolean booleanExtra = getIntent().getBooleanExtra(PatchedFlutterActivity.EXTRA_LIGHT_STATUS_BARS, false);
            if (C11171e.m11046c(30)) {
                if (booleanExtra) {
                    WindowInsetsController windowInsetsController = getWindow().getDecorView().getWindowInsetsController();
                    if (windowInsetsController != null) {
                        windowInsetsController.setSystemBarsAppearance(8, 8);
                    }
                } else {
                    WindowInsetsController windowInsetsController2 = getWindow().getDecorView().getWindowInsetsController();
                    if (windowInsetsController2 != null) {
                        windowInsetsController2.setSystemBarsAppearance(0, 8);
                    }
                }
            } else if (C11171e.m11046c(21)) {
                if (booleanExtra) {
                    getWindow().clearFlags(67108864);
                    getWindow().addFlags(Integer.MIN_VALUE);
                    getWindow().getDecorView().setSystemUiVisibility(getWindow().getDecorView().getSystemUiVisibility() | 8192);
                } else {
                    getWindow().getDecorView().setSystemUiVisibility(getWindow().getDecorView().getSystemUiVisibility() & -8193);
                }
            }
        }
        if (getIntent().hasExtra(PatchedFlutterActivity.EXTRA_LIGHT_NAVIGATION_BARS)) {
            boolean booleanExtra2 = getIntent().getBooleanExtra(PatchedFlutterActivity.EXTRA_LIGHT_NAVIGATION_BARS, false);
            if (C11171e.m11046c(30)) {
                if (booleanExtra2) {
                    WindowInsetsController windowInsetsController3 = getWindow().getDecorView().getWindowInsetsController();
                    if (windowInsetsController3 != null) {
                        windowInsetsController3.setSystemBarsAppearance(16, 16);
                    }
                } else {
                    WindowInsetsController windowInsetsController4 = getWindow().getDecorView().getWindowInsetsController();
                    if (windowInsetsController4 != null) {
                        windowInsetsController4.setSystemBarsAppearance(0, 16);
                    }
                }
            } else if (C11171e.m11046c(21)) {
                if (booleanExtra2) {
                    getWindow().clearFlags(134217728);
                    getWindow().addFlags(Integer.MIN_VALUE);
                    getWindow().getDecorView().setSystemUiVisibility(getWindow().getDecorView().getSystemUiVisibility() | 16);
                } else {
                    getWindow().getDecorView().setSystemUiVisibility(getWindow().getDecorView().getSystemUiVisibility() & -17);
                }
            }
        }
        if (getIntent().hasExtra(PatchedFlutterActivity.EXTRA_STATUS_BAR_COLOR)) {
            int intExtra = getIntent().getIntExtra(PatchedFlutterActivity.EXTRA_STATUS_BAR_COLOR, 0);
            if (C11171e.m11046c(21)) {
                getWindow().setStatusBarColor(intExtra);
            }
        }
        if (getIntent().hasExtra(PatchedFlutterActivity.EXTRA_NAVIGATION_BAR_COLOR)) {
            int intExtra2 = getIntent().getIntExtra(PatchedFlutterActivity.EXTRA_NAVIGATION_BAR_COLOR, 0);
            if (C11171e.m11046c(21)) {
                getWindow().setNavigationBarColor(intExtra2);
            }
        }
        if (getIntent().hasExtra(PatchedFlutterActivity.EXTRA_SUPPORT_SWIPE_BACK) && getIntent().getBooleanExtra(PatchedFlutterActivity.EXTRA_SUPPORT_SWIPE_BACK, false)) {
            overridePendingTransition(MMFragmentActivity$$c.f318644a, MMFragmentActivity$$c.f318645b);
        }
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        C87412m.m108594g(keyEvent, "event");
        return super.onKeyDown(i, keyEvent);
    }

    public boolean onKeyLongPress(int i, KeyEvent keyEvent) {
        C87412m.m108594g(keyEvent, "event");
        return super.onKeyLongPress(i, keyEvent);
    }

    public boolean onKeyMultiple(int i, int i2, KeyEvent keyEvent) {
        C87412m.m108594g(keyEvent, "event");
        return super.onKeyMultiple(i, i2, keyEvent);
    }

    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        C87412m.m108594g(keyEvent, "event");
        return super.onKeyUp(i, keyEvent);
    }

    public void setRequestedOrientation(int i) {
        if (Build.VERSION.SDK_INT == 26) {
            try {
                super.setRequestedOrientation(i);
            } catch (Exception unused) {
                Log.m105928w("MicroMsg.CachedFlutterActivity", "setRequestedOrientation() couldn't be called successfully");
            }
        } else {
            super.setRequestedOrientation(i);
        }
    }

    public boolean shouldDestroyEngineWithHost() {
        String cachedEngineId = super.getCachedEngineId();
        if (!this.f313158d) {
            return true;
        }
        if (cachedEngineId == null || FlutterEngineCache.getInstance().get(cachedEngineId) != null) {
            return super.shouldDestroyEngineWithHost();
        }
        return false;
    }
}
