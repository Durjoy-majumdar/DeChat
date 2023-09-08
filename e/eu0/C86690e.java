package eu0;

import android.app.KeyguardManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.telephony.PhoneStateListener;
import android.telephony.TelephonyManager;
import android.widget.RemoteViews;
import bh3.C113177k;
import com.tencent.luggage.sdk.processes.LuggageServiceType;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.AppForegroundDelegate;
import com.tencent.p014mm.plugin.appbrand.task.AppBrandProcessesManager;
import com.tencent.p014mm.plugin.appbrand.wmpfvoip.notify.p948ui.WmpfVoipCallInProxyActivity;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.FileProviderHelper;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.xweb.IXWebBroadcastListener;
import di3.C7335d;
import di3.C86312j;
import du0.C31289a;
import eu0.C86683b;
import fu0.C87081a;
import gy3.C87412m;
import j20.C117292a;
import java.io.File;
import k20.C60958c;
import k20.C9556a;
import kr0.C88273g1;
import ob0.C47350c;
import ob0.C89144l0;
import p145dx.C31331k;
import p145dx.C7526s;
import p206nj.C11171e;
import p206nj.C76866m;
import p385u2.C111105a;
import p447aw.C103918d;
import p645pj.C77091b;
import p657pz.C89445b;
import p734vz.C65906d;
import te3.b75;
import te3.c75;
import vc3.C65583b;
import w33.C65925a0;

/* renamed from: eu0.e */
public final class C86690e implements Runnable {

    /* renamed from: d */
    public static final C86690e f251700d = new C86690e();

    /* renamed from: eu0.e$a */
    public static final class C86691a extends PhoneStateListener {
        public void onCallStateChanged(int i, String str) {
            super.onCallStateChanged(i, str);
            if (i == 2) {
                Log.m105924i("MicroMsg.WMPFVoip.WMPFVoipCallInManager", "phone calling broke voip calling");
                C86683b.C86685b bVar = C86683b.f251676c;
                if (bVar != null) {
                    String str2 = bVar.f251683b;
                    C87412m.m108594g(str2, "roomId");
                    C47350c.C47352b bVar2 = new C47350c.C47352b();
                    b75 b75 = new b75();
                    b75.f131003e = 9;
                    b75.f131002d = str2;
                    bVar2.f127066a = b75;
                    bVar2.f127067b = new c75();
                    bVar2.f127068c = "/cgi-bin/mmbiz-bin/wxaruntime/updatenativevoiproomstatus";
                    bVar2.f127069d = 5036;
                    C89144l0.m111429e(bVar2.mo72403a(), C31289a.f83781d, true);
                    C86683b bVar3 = C86683b.f251674a;
                    bVar3.mo121066c();
                    bVar3.mo121067d();
                }
            }
        }
    }

    public final void run() {
        String str;
        String str2;
        RemoteViews remoteViews;
        String string;
        C88273g1 g1Var = C88273g1.WMPF_VOIP_CALL_IN;
        LuggageServiceType luggageServiceType = LuggageServiceType.WASERVICE;
        if (C86683b.f251680g == null) {
            C86683b.f251680g = new C86691a();
        }
        TelephonyManager telephonyManager = C86683b.f251679f;
        if (telephonyManager != null) {
            PhoneStateListener phoneStateListener = C86683b.f251680g;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(32);
            aVar.mo10233c(phoneStateListener);
            C117292a.m165358d(telephonyManager, aVar.mo10232b(), "com/tencent/mm/plugin/appbrand/wmpfvoip/notify/WMPFVoipCallInManager$handleCallIn$1", "run", "()V", "android/telephony/TelephonyManager_EXEC_", "listen", "(Landroid/telephony/PhoneStateListener;I)V");
            telephonyManager.listen((PhoneStateListener) aVar.mo10231a(0), ((Integer) aVar.mo10231a(1)).intValue());
            C117292a.m165359e(telephonyManager, "com/tencent/mm/plugin/appbrand/wmpfvoip/notify/WMPFVoipCallInManager$handleCallIn$1", "run", "()V", "android/telephony/TelephonyManager_EXEC_", "listen", "(Landroid/telephony/PhoneStateListener;I)V");
        }
        C86683b bVar = C86683b.f251674a;
        C86683b.C86685b bVar2 = C86683b.f251676c;
        if (bVar2 != null) {
            Context context = MMApplicationContext.getContext();
            boolean z = C11171e.m11045b(28) || C87412m.m108589b(Build.VERSION.CODENAME, "Q");
            AppForegroundDelegate appForegroundDelegate = AppForegroundDelegate.INSTANCE;
            if (appForegroundDelegate.f343454n) {
                C87412m.m108593f(context, "context");
                Class cls = C113177k.class;
                boolean Jn = ((C103918d) C86312j.m106911c(C103918d.class)).mo125772Jn(context);
                boolean z2 = C111105a.m151499a(context, "android.permission.RECORD_AUDIO") == 0 && C111105a.m151499a(context, "android.permission.CAMERA") == 0;
                C113177k.C113179b bVar3 = C113177k.C113179b.CAMERA;
                C113177k.C113178a aVar2 = C113177k.C113178a.CHATTING;
                boolean z3 = ((C113177k) C86312j.m106911c(cls)).w00(bVar3, aVar2) && ((C113177k) C86312j.m106911c(cls)).w00(C113177k.C113179b.MICRO_PHONE, aVar2) && ((C113177k) C86312j.m106911c(cls)).w00(C113177k.C113179b.OVERLAY, aVar2);
                if (!Jn || !z2 || !z3) {
                    ((C65925a0) ((C65906d) C86312j.m106911c(C65906d.class)).dr0()).getClass();
                    C65925a0.C65926a aVar3 = C65925a0.f189527c;
                    aVar3.f189530c = 2;
                    aVar3.f189531d = !z2 ? 3 : !Jn ? 2 : -1;
                }
                if ((Jn && z2 && z3) && appForegroundDelegate.f343454n) {
                    Object systemService = context.getSystemService("keyguard");
                    KeyguardManager keyguardManager = systemService instanceof KeyguardManager ? (KeyguardManager) systemService : null;
                    if (!(keyguardManager != null ? keyguardManager.isKeyguardLocked() : false)) {
                        bVar.mo121066c();
                        C87081a aVar4 = new C87081a(context);
                        C86683b.f251675b = aVar4;
                        String str3 = bVar2.f251688g;
                        C87412m.m108594g(str3, "<set-?>");
                        aVar4.f252673f = str3;
                        C87081a aVar5 = C86683b.f251675b;
                        if (aVar5 != null) {
                            if (C87412m.m108589b(bVar2.f251689h, "video")) {
                                str = context.getResources().getString(C0966R.string.fpk);
                                C87412m.m108593f(str, "context.resources.getStr…n_video_popup_window_tip)");
                            } else {
                                str = context.getResources().getString(C0966R.string.fqg);
                                C87412m.m108593f(str, "context.resources.getStr…n_voice_popup_window_tip)");
                            }
                            aVar5.f252674g = str;
                        }
                        C87081a aVar6 = C86683b.f251675b;
                        if (aVar6 != null) {
                            aVar6.f252675h = new C86688c(context, bVar2);
                            aVar6.mo121548b(false);
                        }
                        AppBrandProcessesManager.f246131g.mo116962a().mo116954S(luggageServiceType, g1Var);
                        bVar.mo121068e(IXWebBroadcastListener.STAGE_START);
                        int i = bVar2.f251690i;
                        String str4 = bVar2.f251683b;
                        MMHandlerThread.removeRunnable(C86683b.f251678e);
                        C86694h hVar = new C86694h(i, str4);
                        C86683b.f251678e = hVar;
                        MMHandlerThread.postToMainThreadDelayed(hVar, ((long) i) * 1000);
                        String str5 = bVar2.f251683b;
                        C87412m.m108594g(str5, "roomId");
                        C115669n.INSTANCE.mo160131h(28142, str5, 1);
                    }
                }
                bVar.mo121065a(context, false);
                String str6 = bVar2.f251683b;
                C87412m.m108594g(str6, "roomId");
                C115669n.INSTANCE.mo160131h(28142, str6, 2);
            } else if (!C77091b.m93035q()) {
                C86683b.f251677d = true;
                Log.m105924i("MicroMsg.WMPFVoip.WMPFVoipCallInManager", "[callInImp] app is background, and newVoipMsgNotification switch status is closed, do noting");
            } else if (z) {
                Intent intent = new Intent(context, WmpfVoipCallInProxyActivity.class);
                intent.putExtra("extra_appid", bVar2.f251682a);
                intent.putExtra("extra_enter_path", bVar2.f251684c);
                intent.putExtra("version_type", bVar2.f251686e);
                intent.putExtra("extra_enter_scene", 3);
                intent.putExtra("extra_roomid", bVar2.f251683b);
                intent.addFlags(1342177280);
                C86683b.C86685b bVar4 = C86683b.f251676c;
                if (bVar4 != null) {
                    intent.putExtra("calling_instance_id", bVar4.f251687f);
                }
                if (C77091b.m93019a()) {
                    remoteViews = new RemoteViews(MMApplicationContext.getPackageName(), C0966R.C0971layout.ccu);
                    remoteViews.setTextViewText(C0966R.C0970id.hju, bVar2.f251688g);
                    if (C87412m.m108589b(bVar2.f251689h, "video")) {
                        str2 = MMApplicationContext.getResources().getString(C0966R.string.fpj);
                        C87412m.m108593f(str2, "getResources()\n         …n_video_notification_tip)");
                        remoteViews.setImageViewResource(C0966R.C0970id.hjp, C0966R.C0969drawable.bs_);
                    } else {
                        str2 = MMApplicationContext.getResources().getString(C0966R.string.fqf);
                        C87412m.m108593f(str2, "getResources()\n         …n_voice_notification_tip)");
                        remoteViews.setImageViewResource(C0966R.C0970id.hjp, C0966R.C0969drawable.bsa);
                    }
                    remoteViews.setTextViewText(C0966R.C0970id.f358873hk0, str2);
                    remoteViews.setImageViewResource(C0966R.C0970id.lnr, C0966R.C0969drawable.bsd);
                } else {
                    remoteViews = new RemoteViews(MMApplicationContext.getPackageName(), C0966R.C0971layout.ccv);
                    if (intent.getBooleanExtra("Voip_VideoCall", true)) {
                        string = MMApplicationContext.getResources().getString(C0966R.string.fpj);
                        C87412m.m108593f(string, "getResources()\n         …n_video_notification_tip)");
                    } else {
                        string = MMApplicationContext.getResources().getString(C0966R.string.fqf);
                        C87412m.m108593f(string, "getResources()\n         …n_voice_notification_tip)");
                    }
                    remoteViews.setTextViewText(C0966R.C0970id.lns, MMApplicationContext.getResources().getString(C0966R.string.a0u));
                    remoteViews.setTextViewText(C0966R.C0970id.hjo, str2);
                }
                String str7 = str2;
                C7335d c = C86312j.m106911c(C89445b.class);
                C87412m.m108593f(c, "getService(IActivityHelperService::class.java)");
                C89445b bVar5 = (C89445b) c;
                C87412m.m108593f(context, "context");
                ComponentName component = intent.getComponent();
                String className = component != null ? component.getClassName() : null;
                String a = C65583b.m77266a();
                C87412m.m108593f(a, "getVoipChannelId()");
                bVar5.mo123648UT(context, intent, remoteViews, str7, className, true, a, true, true);
                C86683b.f251677d = true;
                AppBrandProcessesManager.f246131g.mo116962a().mo116954S(luggageServiceType, g1Var);
                int i2 = bVar2.f251690i;
                String str8 = bVar2.f251683b;
                MMHandlerThread.removeRunnable(C86683b.f251678e);
                C86694h hVar2 = new C86694h(i2, str8);
                C86683b.f251678e = hVar2;
                MMHandlerThread.postToMainThreadDelayed(hVar2, ((long) i2) * 1000);
            } else {
                C87412m.m108593f(context, "context");
                bVar.mo121065a(context, false);
                String str9 = bVar2.f251683b;
                C87412m.m108594g(str9, "roomId");
                C115669n.INSTANCE.mo160131h(28142, str9, 2);
            }
        }
        if (((C31331k) C86312j.m106911c(C31331k.class)).mo57891pV() && C76866m.m92676e()) {
            MMApplicationContext.getContext().grantUriPermission("com.android.systemui", FileProviderHelper.getUriForFile(MMApplicationContext.getContext(), C86009m1.m106378c(new File(((C7526s) C86312j.m106911c(C7526s.class)).mo8654Hy().mo90177h()))), 1);
        }
    }
}
