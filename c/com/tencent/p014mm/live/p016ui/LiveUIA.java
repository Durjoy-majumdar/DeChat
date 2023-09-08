package com.tencent.p014mm.live.p016ui;

import a14.C0000n0;
import a14.C0001s1;
import a14.C53872d1;
import a14.C53895h;
import a14.C53934p0;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.telephony.PhoneStateListener;
import android.telephony.TelephonyManager;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import aw0.C103928o;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.live.api.LiveConfig;
import com.tencent.p014mm.live.model.RoomLiveService;
import com.tencent.p014mm.live.view.BaseLivePluginLayout;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.tools.KeyboardHeightProvider;
import com.tencent.p014mm.p136ui.widget.SwipeBackLayout;
import com.tencent.p014mm.sdk.platformtools.Log;
import d60.C58124b;
import fy3.C32227p;
import gy3.C87412m;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import km3.C21358a;
import kotlin.Metadata;
import kotlin.ResultKt;
import nj3.C88989a;
import nj3.C88990b;
import rx3.C13598b0;
import uv0.C22663i;
import wx3.C15601d;
import y40.C66491a;
import y40.C66495b;
import y50.C66539p0;
import yx3.C91590f;
import yx3.C91594j;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/live/ui/LiveUIA;", "Lcom/tencent/mm/ui/MMActivity;", "<init>", "()V", "plugin-logic_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
@C88989a(32)
/* renamed from: com.tencent.mm.live.ui.LiveUIA */
public class LiveUIA extends MMActivity {

    /* renamed from: g */
    public static final /* synthetic */ int f157228g = 0;

    /* renamed from: d */
    public C66491a f157229d;

    /* renamed from: e */
    public C66539p0 f157230e;

    /* renamed from: f */
    public Drawable f157231f;

    @C91590f(mo125468c = "com.tencent.mm.live.ui.LiveUIA$initSwipeBack$1", mo125469f = "LiveUIA.kt", mo125470l = {}, mo125471m = "invokeSuspend")
    /* renamed from: com.tencent.mm.live.ui.LiveUIA$a */
    public static final class C55214a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public final /* synthetic */ LiveUIA f157232d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C55214a(LiveUIA liveUIA, C15601d<? super C55214a> dVar) {
            super(2, dVar);
            this.f157232d = liveUIA;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C55214a(this.f157232d, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C55214a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            ResultKt.throwOnFailure(obj);
            C88990b.m111194c(this.f157232d, (C88990b.C61771c) null);
            this.f157232d.getSwipeBackLayout().mo26381c(true);
            return C13598b0.f38549a;
        }
    }

    public int getForceOrientation() {
        RoomLiveService roomLiveService = RoomLiveService.f157190a;
        if (!RoomLiveService.f157211v.f157216a) {
            return 1;
        }
        Intent intent = getIntent();
        boolean z = false;
        if (intent != null && intent.getBooleanExtra("key_is_live_finished", false)) {
            z = true;
        }
        return z ? 1 : 14;
    }

    public int getLayoutId() {
        return C0966R.C0971layout.b7_;
    }

    public void initSwipeBack() {
        super.initSwipeBack();
        C53895h.m60466d(C0001s1.f0d, C53872d1.f151119c, (C53934p0) null, new C55214a(this, (C15601d<? super C55214a>) null), 2, (Object) null);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        Log.m105924i("MicroMsg.LiveUI", "onActivityResult (" + hashCode() + ')');
        super.onActivityResult(i, i2, intent);
        C66491a aVar = this.f157229d;
        if (aVar != null) {
            String str = aVar.f191278e;
            Log.m105924i(str, "onActivityResult " + aVar.f191283j);
            BaseLivePluginLayout baseLivePluginLayout = aVar.f191283j;
            if (baseLivePluginLayout != null) {
                baseLivePluginLayout.onActivityResult(i, i2, intent);
            }
        }
    }

    public void onBackPressed() {
        C66491a aVar = this.f157229d;
        boolean z = false;
        if (aVar != null) {
            BaseLivePluginLayout baseLivePluginLayout = aVar.f191283j;
            if (!(baseLivePluginLayout != null ? baseLivePluginLayout.onBackPress() : false)) {
                z = true;
            }
        }
        if (z) {
            Log.m105924i("MicroMsg.LiveUI", "onBackPressed (" + hashCode() + ')');
            super.onBackPressed();
        }
    }

    public void onBusinessPermissionDenied(String str) {
    }

    public void onBusinessPermissionGranted(String str) {
    }

    public void onCreate(Bundle bundle) {
        Log.m105924i("MicroMsg.LiveUI", "onCreate (" + hashCode() + ')');
        super.onCreate(bundle);
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.mo91104o();
        }
        setSelfNavigationBarVisible(8);
        getWindow().addFlags(2097280);
        getWindow().addFlags(67108864);
        getWindow().clearFlags(67108864);
        getWindow().getDecorView().setSystemUiVisibility(1792);
        getWindow().addFlags(Integer.MIN_VALUE);
        getWindow().setStatusBarColor(0);
        getWindow().setNavigationBarColor(0);
        getWindow().setFormat(-3);
        getWindow().setSoftInputMode(51);
        View findViewById = findViewById(C0966R.C0970id.fzs);
        C87412m.m108593f(findViewById, "findViewById(R.id.live_ui_root)");
        LiveConfig liveConfig = (LiveConfig) getIntent().getParcelableExtra("KEY_PARAMS_CONFIG");
        C66491a aVar = new C66491a(this, (FrameLayout) findViewById, liveConfig, getIntent().getBooleanExtra("key_is_live_finished", false));
        this.f157229d = aVar;
        Object systemService = aVar.f191274a.getSystemService("phone");
        C87412m.m108592e(systemService, "null cannot be cast to non-null type android.telephony.TelephonyManager");
        TelephonyManager telephonyManager = (TelephonyManager) systemService;
        PhoneStateListener phoneStateListener = aVar.f191286m;
        C9556a aVar2 = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar2.mo10233c(32);
        aVar2.mo10233c(phoneStateListener);
        TelephonyManager telephonyManager2 = telephonyManager;
        C117292a.m165358d(telephonyManager2, aVar2.mo10232b(), "com/tencent/mm/live/controller/LiveUIRouter", "onCreate", "()V", "android/telephony/TelephonyManager_EXEC_", "listen", "(Landroid/telephony/PhoneStateListener;I)V");
        telephonyManager.listen((PhoneStateListener) aVar2.mo10231a(0), ((Integer) aVar2.mo10231a(1)).intValue());
        C117292a.m165359e(telephonyManager2, "com/tencent/mm/live/controller/LiveUIRouter", "onCreate", "()V", "android/telephony/TelephonyManager_EXEC_", "listen", "(Landroid/telephony/PhoneStateListener;I)V");
        RoomLiveService roomLiveService = RoomLiveService.f157190a;
        RoomLiveService.f157180L = liveConfig != null ? liveConfig.f157071o : 0;
        Integer valueOf = liveConfig != null ? Integer.valueOf(liveConfig.f157063d) : null;
        if (valueOf != null && valueOf.intValue() == 0) {
            roomLiveService.mo76448f(this, true);
            C66491a aVar3 = this.f157229d;
            if (aVar3 != null) {
                aVar3.mo90580a(0);
            }
        } else if (valueOf != null && valueOf.intValue() == 1) {
            roomLiveService.mo76448f(this, false);
            C66491a aVar4 = this.f157229d;
            if (aVar4 != null) {
                aVar4.mo90580a(1);
            }
        }
        C66539p0 p0Var = new C66539p0(new C22663i(this));
        this.f157230e = p0Var;
        p0Var.mo35648A(35, "LiveFloatBall");
        AppCompatActivity context = getContext();
        C87412m.m108592e(context, "null cannot be cast to non-null type android.app.Activity");
        this.f157231f = context.getWindow().getDecorView().getBackground();
    }

    public void onDestroy() {
        Log.m105924i("MicroMsg.LiveUI", "onDestroy (" + hashCode() + ')');
        super.onDestroy();
        C66491a aVar = this.f157229d;
        if (aVar != null) {
            String str = aVar.f191278e;
            Log.m105924i(str, "onDestroy " + aVar.f191283j);
            int size = aVar.f191282i.size();
            for (int i = 0; i < size; i++) {
                aVar.f191282i.valueAt(i).unMount();
            }
            Object systemService = aVar.f191274a.getSystemService("phone");
            C87412m.m108592e(systemService, "null cannot be cast to non-null type android.telephony.TelephonyManager");
            TelephonyManager telephonyManager = (TelephonyManager) systemService;
            PhoneStateListener phoneStateListener = aVar.f191286m;
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar2.mo10233c(0);
            aVar2.mo10233c(phoneStateListener);
            TelephonyManager telephonyManager2 = telephonyManager;
            C117292a.m165358d(telephonyManager2, aVar2.mo10232b(), "com/tencent/mm/live/controller/LiveUIRouter", "onDestroy", "()V", "android/telephony/TelephonyManager_EXEC_", "listen", "(Landroid/telephony/PhoneStateListener;I)V");
            telephonyManager.listen((PhoneStateListener) aVar2.mo10231a(0), ((Integer) aVar2.mo10231a(1)).intValue());
            C117292a.m165359e(telephonyManager2, "com/tencent/mm/live/controller/LiveUIRouter", "onDestroy", "()V", "android/telephony/TelephonyManager_EXEC_", "listen", "(Landroid/telephony/PhoneStateListener;I)V");
        }
        C66539p0 p0Var = this.f157230e;
        if (p0Var != null) {
            p0Var.mo67996A0();
        }
    }

    public void onNewIntent(Intent intent) {
        C66491a aVar;
        BaseLivePluginLayout baseLivePluginLayout;
        Log.m105924i("MicroMsg.LiveUI", "onNewIntent (" + hashCode() + ')');
        super.onNewIntent(intent);
        SwipeBackLayout swipeBackLayout = getSwipeBackLayout();
        C21358a aVar2 = swipeBackLayout.f56489j;
        aVar2.f60423s = swipeBackLayout.f56488i;
        aVar2.f60407c = -1;
        aVar2.mo33431g(0, 0, 0, 0, 10);
        boolean z = true;
        if (intent == null || !intent.getBooleanExtra("route_to_maximize", false)) {
            z = false;
        }
        if (z && (aVar = this.f157229d) != null && (baseLivePluginLayout = aVar.f191283j) != null) {
            C58124b.C7172a.m7372a(baseLivePluginLayout, C58124b.C58125b.MAXI_WINDOW, (Bundle) null, 2, (Object) null);
        }
    }

    public void onPause() {
        Log.m105924i("MicroMsg.LiveUI", "onPause (" + hashCode() + ')');
        super.onPause();
        C66491a aVar = this.f157229d;
        if (aVar != null) {
            String str = aVar.f191278e;
            Log.m105924i(str, "onPause " + aVar.f191283j);
            BaseLivePluginLayout baseLivePluginLayout = aVar.f191283j;
            if (baseLivePluginLayout != null) {
                baseLivePluginLayout.pause();
            }
        }
        C66539p0 p0Var = this.f157230e;
        if (p0Var != null) {
            p0Var.mo64001C();
        }
        C103928o.m138642b();
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        C87412m.m108594g(strArr, "permissions");
        C87412m.m108594g(iArr, "grantResults");
        super.onRequestPermissionsResult(i, strArr, iArr);
        C66491a aVar = this.f157229d;
        if (aVar != null) {
            String str = aVar.f191278e;
            Log.m105924i(str, "onRequestPermissionsResult " + aVar.f191283j);
            BaseLivePluginLayout baseLivePluginLayout = aVar.f191283j;
            if (baseLivePluginLayout != null) {
                baseLivePluginLayout.onRequestPermissionsResult(i, strArr, iArr);
            }
        }
    }

    public void onResume() {
        Log.m105924i("MicroMsg.LiveUI", "onResume (" + hashCode() + ')');
        super.onResume();
        C66491a aVar = this.f157229d;
        if (aVar != null) {
            String str = aVar.f191278e;
            Log.m105924i(str, "onResume " + aVar.f191283j);
            BaseLivePluginLayout baseLivePluginLayout = aVar.f191283j;
            if (baseLivePluginLayout != null) {
                baseLivePluginLayout.resume();
            }
            BaseLivePluginLayout baseLivePluginLayout2 = aVar.f191283j;
            if (baseLivePluginLayout2 != null) {
                baseLivePluginLayout2.post(new C66495b(aVar));
            }
        }
        C66539p0 p0Var = this.f157230e;
        if (p0Var != null) {
            p0Var.mo78184B0();
        }
        C103928o.m138641a(true, false, true);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0061 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onStart() {
        /*
            r8 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "onStart ("
            r0.append(r1)
            int r1 = r8.hashCode()
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "MicroMsg.LiveUI"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
            super.onStart()
            y40.a r0 = r8.f157229d
            if (r0 == 0) goto L_0x0085
            java.lang.String r1 = "accelerometer_rotation"
            java.lang.String r2 = r0.f191278e
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "onStart "
            r3.append(r4)
            com.tencent.mm.live.view.BaseLivePluginLayout r4 = r0.f191283j
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r3)
            r2 = 1
            r3 = 0
            android.content.Context r4 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()     // Catch:{ SettingNotFoundException -> 0x0052 }
            android.content.ContentResolver r4 = r4.getContentResolver()     // Catch:{ SettingNotFoundException -> 0x0052 }
            int r4 = android.provider.Settings.System.getInt(r4, r1)     // Catch:{ SettingNotFoundException -> 0x0052 }
            if (r4 != r2) goto L_0x005c
            r4 = 1
            goto L_0x005d
        L_0x0052:
            r4 = move-exception
            java.lang.String r5 = r0.f191278e
            java.lang.Object[] r6 = new java.lang.Object[r3]
            java.lang.String r7 = ""
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r5, r4, r7, r6)
        L_0x005c:
            r4 = 0
        L_0x005d:
            com.tencent.mm.live.view.BaseLivePluginLayout r5 = r0.f191283j
            if (r5 == 0) goto L_0x0073
            if (r4 == 0) goto L_0x006f
            android.content.SharedPreferences r4 = r0.f191279f
            java.lang.String r6 = "settings_landscape_mode"
            boolean r4 = r4.getBoolean(r6, r3)
            if (r4 == 0) goto L_0x006f
            goto L_0x0070
        L_0x006f:
            r2 = 0
        L_0x0070:
            r5.onRotationSwitchChange(r2)
        L_0x0073:
            y40.a$a r2 = r0.f191280g
            android.content.ContentResolver r4 = r2.f191288b
            android.net.Uri r1 = android.provider.Settings.System.getUriFor(r1)
            r4.registerContentObserver(r1, r3, r2)
            com.tencent.mm.live.view.BaseLivePluginLayout r0 = r0.f191283j
            if (r0 == 0) goto L_0x0085
            r0.start()
        L_0x0085:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.live.p016ui.LiveUIA.onStart():void");
    }

    public void onStop() {
        Log.m105924i("MicroMsg.LiveUI", "onStop (" + hashCode() + ')');
        super.onStop();
        C66491a aVar = this.f157229d;
        if (aVar != null) {
            String str = aVar.f191278e;
            Log.m105924i(str, "onStop " + aVar.f191283j);
            C66491a.C66492a aVar2 = aVar.f191280g;
            aVar2.f191288b.unregisterContentObserver(aVar2);
            KeyboardHeightProvider keyboardHeightProvider = aVar.f191285l;
            if (keyboardHeightProvider != null) {
                keyboardHeightProvider.mo104021d();
            }
            BaseLivePluginLayout baseLivePluginLayout = aVar.f191283j;
            if (baseLivePluginLayout != null) {
                baseLivePluginLayout.stop();
            }
        }
        SwipeBackLayout swipeBackLayout = getSwipeBackLayout();
        C21358a aVar3 = swipeBackLayout.f56489j;
        aVar3.f60423s = swipeBackLayout.f56488i;
        aVar3.f60407c = -1;
        aVar3.mo33431g(0, 0, 0, 0, 10);
    }

    public void onSwipeBack() {
        Log.m105924i("MicroMsg.LiveUI", "onSwipeBack (" + hashCode() + ')');
        C66491a aVar = this.f157229d;
        boolean z = false;
        if (aVar != null) {
            BaseLivePluginLayout baseLivePluginLayout = aVar.f191283j;
            if (!(baseLivePluginLayout != null ? baseLivePluginLayout.onSwipeBack() : false)) {
                z = true;
            }
        }
        if (z) {
            Log.m105924i("MicroMsg.LiveUI", "super onBackPressed (" + hashCode() + ')');
            super.onSwipeBack();
        }
    }
}
