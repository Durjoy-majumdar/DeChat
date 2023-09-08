package eu0;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.telephony.PhoneStateListener;
import android.telephony.TelephonyManager;
import com.tencent.p014mm.app.AppForegroundDelegate;
import com.tencent.p014mm.app.C114668z;
import com.tencent.p014mm.plugin.appbrand.launching.C83350j4;
import com.tencent.p014mm.plugin.cloudvoip.cloudvoice.service.OpenVoiceVoIPInterruptListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import di3.C86312j;
import fu0.C87081a;
import gy3.C87412m;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import nj2.C109749c;
import p576jp.C33612d;
import p576jp.C88007b;
import p657pz.C89445b;
import zt3.C119157j;

/* renamed from: eu0.b */
public final class C86683b {

    /* renamed from: a */
    public static final C86683b f251674a = new C86683b();

    /* renamed from: b */
    public static C87081a f251675b;

    /* renamed from: c */
    public static C86685b f251676c;

    /* renamed from: d */
    public static boolean f251677d;

    /* renamed from: e */
    public static Runnable f251678e;

    /* renamed from: f */
    public static TelephonyManager f251679f;

    /* renamed from: g */
    public static PhoneStateListener f251680g;

    /* renamed from: h */
    public static C33612d f251681h = ((C88007b) C86312j.m106911c(C88007b.class)).z50();

    /* renamed from: eu0.b$a */
    public static final class C86684a implements C114668z {
        public void onAppBackground(String str) {
        }

        public void onAppForeground(String str) {
            Log.m105924i("MicroMsg.WMPFVoip.WMPFVoipCallInManager", "willEnterWxaVoipCallingOnAppForeground[" + C86683b.f251677d + "] currentDataEnterWxaVoipCalling=[" + C86683b.f251676c + ']');
            if (C86683b.f251677d) {
                C86683b bVar = C86683b.f251674a;
                Context context = MMApplicationContext.getContext();
                C87412m.m108593f(context, "getContext()");
                bVar.mo121065a(context, false);
                C89445b bVar2 = (C89445b) C86312j.m106911c(C89445b.class);
                if (bVar2 != null) {
                    bVar2.mo123645Ca();
                }
            }
        }
    }

    /* renamed from: eu0.b$b */
    public static final class C86685b {

        /* renamed from: a */
        public final String f251682a;

        /* renamed from: b */
        public final String f251683b;

        /* renamed from: c */
        public final String f251684c;

        /* renamed from: d */
        public final String f251685d;

        /* renamed from: e */
        public final int f251686e;

        /* renamed from: f */
        public final long f251687f;

        /* renamed from: g */
        public final String f251688g;

        /* renamed from: h */
        public final String f251689h;

        /* renamed from: i */
        public final int f251690i;

        public C86685b(String str, String str2, String str3, String str4, int i, long j, String str5, String str6, int i2) {
            C87412m.m108594g(str, "AppId");
            C87412m.m108594g(str2, "roomId");
            C87412m.m108594g(str3, "enterPath");
            C87412m.m108594g(str4, "enterPathAutoAccept");
            C87412m.m108594g(str5, "name");
            C87412m.m108594g(str6, "roomType");
            this.f251682a = str;
            this.f251683b = str2;
            this.f251684c = str3;
            this.f251685d = str4;
            this.f251686e = i;
            this.f251687f = j;
            this.f251688g = str5;
            this.f251689h = str6;
            this.f251690i = i2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C86685b)) {
                return false;
            }
            C86685b bVar = (C86685b) obj;
            return C87412m.m108589b(this.f251682a, bVar.f251682a) && C87412m.m108589b(this.f251683b, bVar.f251683b) && C87412m.m108589b(this.f251684c, bVar.f251684c) && C87412m.m108589b(this.f251685d, bVar.f251685d) && this.f251686e == bVar.f251686e && this.f251687f == bVar.f251687f && C87412m.m108589b(this.f251688g, bVar.f251688g) && C87412m.m108589b(this.f251689h, bVar.f251689h) && this.f251690i == bVar.f251690i;
        }

        public int hashCode() {
            long j = this.f251687f;
            return (((((((((((((((this.f251682a.hashCode() * 31) + this.f251683b.hashCode()) * 31) + this.f251684c.hashCode()) * 31) + this.f251685d.hashCode()) * 31) + this.f251686e) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + this.f251688g.hashCode()) * 31) + this.f251689h.hashCode()) * 31) + this.f251690i;
        }

        public String toString() {
            return "EnterWxaVoipCallingTask(AppId=" + this.f251682a + ", roomId=" + this.f251683b + ", enterPath=" + this.f251684c + ", enterPathAutoAccept=" + this.f251685d + ", versionType=" + this.f251686e + ", callingInstanceId=" + this.f251687f + ", name=" + this.f251688g + ", roomType=" + this.f251689h + ", expireTime=" + this.f251690i + ')';
        }
    }

    /* renamed from: eu0.b$c */
    public static final class C86686c implements Runnable {

        /* renamed from: d */
        public static final C86686c f251691d = new C86686c();

        public final void run() {
            C87081a aVar = C86683b.f251675b;
            if (aVar != null) {
                aVar.mo121547a(false, false);
            }
            C86683b.f251674a.mo121068e("close");
        }
    }

    /* renamed from: eu0.b$d */
    public static final class C86687d implements Runnable {

        /* renamed from: d */
        public static final C86687d f251692d = new C86687d();

        public final void run() {
            C86683b.f251677d = false;
            C86683b.f251676c = null;
            MMHandlerThread.removeRunnable(C86683b.f251678e);
            TelephonyManager telephonyManager = C86683b.f251679f;
            if (telephonyManager != null) {
                PhoneStateListener phoneStateListener = C86683b.f251680g;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(0);
                aVar.mo10233c(phoneStateListener);
                C117292a.m165358d(telephonyManager, aVar.mo10232b(), "com/tencent/mm/plugin/appbrand/wmpfvoip/notify/WMPFVoipCallInManager$onCallingFinish$1", "run", "()V", "android/telephony/TelephonyManager_EXEC_", "listen", "(Landroid/telephony/PhoneStateListener;I)V");
                telephonyManager.listen((PhoneStateListener) aVar.mo10231a(0), ((Integer) aVar.mo10231a(1)).intValue());
                C117292a.m165359e(telephonyManager, "com/tencent/mm/plugin/appbrand/wmpfvoip/notify/WMPFVoipCallInManager$onCallingFinish$1", "run", "()V", "android/telephony/TelephonyManager_EXEC_", "listen", "(Landroid/telephony/PhoneStateListener;I)V");
            }
        }
    }

    static {
        AppForegroundDelegate.INSTANCE.mo174208a(new C86684a());
        Object systemService = MMApplicationContext.getContext().getSystemService("phone");
        C87412m.m108592e(systemService, "null cannot be cast to non-null type android.telephony.TelephonyManager");
        f251679f = (TelephonyManager) systemService;
    }

    /* renamed from: b */
    public static void m107501b(C86683b bVar, Context context, String str, String str2, int i, long j, C83350j4 j4Var, int i2, Object obj) {
        C83350j4 j4Var2 = (i2 & 32) != 0 ? null : j4Var;
        bVar.getClass();
        C87412m.m108594g(context, "context");
        C87412m.m108594g(str, "appId");
        C87412m.m108594g(str2, "enterPath");
        C86683b bVar2 = bVar;
        bVar.mo121069f(new C86689d(j, str, str2, i, j4Var2, context));
    }

    /* renamed from: a */
    public final void mo121065a(Context context, boolean z) {
        C86685b bVar = f251676c;
        if (bVar != null) {
            m107501b(f251674a, context, bVar.f251682a, z ? bVar.f251685d : bVar.f251684c, bVar.f251686e, bVar.f251687f, (C83350j4) null, 32, (Object) null);
        }
    }

    /* renamed from: c */
    public final void mo121066c() {
        mo121069f(C86686c.f251691d);
    }

    /* renamed from: d */
    public final void mo121067d() {
        mo121069f(C86687d.f251692d);
        C33612d dVar = f251681h;
        if (dVar != null) {
            OpenVoiceVoIPInterruptListener openVoiceVoIPInterruptListener = (OpenVoiceVoIPInterruptListener) dVar;
            openVoiceVoIPInterruptListener.f248093a = null;
            openVoiceVoIPInterruptListener.mo118164b();
        }
    }

    /* renamed from: e */
    public final void mo121068e(String str) {
        Bundle bundle = new Bundle();
        bundle.putString(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, str);
        bundle.putBoolean("isVideoCall", true);
        bundle.putBoolean("isOutCall", false);
        ((C109749c) C86312j.m106911c(C109749c.class)).mo86672vo(C109749c.C61756a.WMPF_CALL_IN, bundle);
    }

    /* renamed from: f */
    public final void mo121069f(Runnable runnable) {
        if (C87412m.m108589b(Looper.myLooper(), Looper.getMainLooper())) {
            runnable.run();
        } else {
            ((C119157j) C119157j.f356862d).mo183895z(runnable);
        }
    }
}
