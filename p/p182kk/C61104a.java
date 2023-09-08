package p182kk;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.AppBrandVoipCheckIsDeviceUsingEvent;
import com.tencent.p014mm.autogen.events.FaceFlashStateEvent;
import com.tencent.p014mm.autogen.events.FinderLiveStateActionEvent;
import com.tencent.p014mm.autogen.events.FinderVideoStateActionEvent;
import com.tencent.p014mm.autogen.events.LiveStateActionEvent;
import com.tencent.p014mm.autogen.events.MultiTalkActionEvent;
import com.tencent.p014mm.autogen.events.VoipCheckIsDeviceUsingEvent;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import nj3.C76879j;
import nj3.C76912y0;
import p910lj.C76701a;

/* renamed from: kk.a */
public class C61104a {

    /* renamed from: kk.a$a */
    public class C10284a implements DialogInterface.OnClickListener {
        public void onClick(DialogInterface dialogInterface, int i) {
        }
    }

    /* renamed from: kk.a$d */
    public class C10285d implements DialogInterface.OnClickListener {
        public void onClick(DialogInterface dialogInterface, int i) {
        }
    }

    /* renamed from: kk.a$e */
    public class C10286e implements DialogInterface.OnClickListener {
        public void onClick(DialogInterface dialogInterface, int i) {
        }
    }

    /* renamed from: kk.a$b */
    public class C61105b implements DialogInterface.OnClickListener {
        public void onClick(DialogInterface dialogInterface, int i) {
        }
    }

    /* renamed from: kk.a$c */
    public class C61106c implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ DialogInterface.OnClickListener f173983d;

        public C61106c(DialogInterface.OnClickListener onClickListener) {
            this.f173983d = onClickListener;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            DialogInterface.OnClickListener onClickListener = this.f173983d;
            if (onClickListener != null) {
                onClickListener.onClick(dialogInterface, i);
            }
        }
    }

    /* renamed from: kk.a$f */
    public class C61107f implements DialogInterface.OnClickListener {
        public void onClick(DialogInterface dialogInterface, int i) {
        }
    }

    /* renamed from: A */
    public static boolean m71641A() {
        VoipCheckIsDeviceUsingEvent voipCheckIsDeviceUsingEvent = new VoipCheckIsDeviceUsingEvent();
        voipCheckIsDeviceUsingEvent.publish();
        return voipCheckIsDeviceUsingEvent.f194014d.f194016b;
    }

    /* renamed from: B */
    public static boolean m71642B(Context context, boolean z) {
        VoipCheckIsDeviceUsingEvent voipCheckIsDeviceUsingEvent = new VoipCheckIsDeviceUsingEvent();
        voipCheckIsDeviceUsingEvent.publish();
        VoipCheckIsDeviceUsingEvent.C67817a aVar = voipCheckIsDeviceUsingEvent.f194014d;
        if (aVar.f194017c && z) {
            C76912y0.makeText(context, (CharSequence) m71643C(context, aVar.f194015a), 0).show();
        }
        return voipCheckIsDeviceUsingEvent.f194014d.f194017c;
    }

    /* renamed from: C */
    public static String m71643C(Context context, boolean z) {
        return z ? context.getString(C0966R.string.auu) : context.getString(C0966R.string.auw);
    }

    /* renamed from: D */
    public static boolean m71644D() {
        MultiTalkActionEvent multiTalkActionEvent = new MultiTalkActionEvent();
        multiTalkActionEvent.f154837d.f107635a = 1;
        multiTalkActionEvent.publish();
        return multiTalkActionEvent.f154838e.f154839a;
    }

    /* renamed from: a */
    public static boolean m71645a() {
        AppBrandVoipCheckIsDeviceUsingEvent appBrandVoipCheckIsDeviceUsingEvent = new AppBrandVoipCheckIsDeviceUsingEvent();
        appBrandVoipCheckIsDeviceUsingEvent.publish();
        Log.m105925i("MicroMsg.DeviceOccupy", "checkAppBrandCameraUsing isVoiceUsing:%b, isCameraUsing:%b", Boolean.valueOf(appBrandVoipCheckIsDeviceUsingEvent.f154734d.f154736b), Boolean.valueOf(appBrandVoipCheckIsDeviceUsingEvent.f154734d.f154735a));
        if (appBrandVoipCheckIsDeviceUsingEvent.f154734d.f154735a) {
            Log.m105924i("MicroMsg.DeviceOccupy", "app brand voip camera using");
        }
        return appBrandVoipCheckIsDeviceUsingEvent.f154734d.f154735a;
    }

    /* renamed from: b */
    public static boolean m71646b(Context context) {
        return m71647c(context, true);
    }

    /* renamed from: c */
    public static boolean m71647c(Context context, boolean z) {
        AppBrandVoipCheckIsDeviceUsingEvent appBrandVoipCheckIsDeviceUsingEvent = new AppBrandVoipCheckIsDeviceUsingEvent();
        appBrandVoipCheckIsDeviceUsingEvent.publish();
        Log.m105925i("MicroMsg.DeviceOccupy", "checkAppBrandCameraUsingAndShowToast isVoiceUsing:%b, isCameraUsing:%b", Boolean.valueOf(appBrandVoipCheckIsDeviceUsingEvent.f154734d.f154736b), Boolean.valueOf(appBrandVoipCheckIsDeviceUsingEvent.f154734d.f154735a));
        if (appBrandVoipCheckIsDeviceUsingEvent.f154734d.f154735a) {
            Log.m105924i("MicroMsg.DeviceOccupy", "app brand voip camera using");
            if (z) {
                C76701a.makeText(context, (CharSequence) m71643C(context, appBrandVoipCheckIsDeviceUsingEvent.f154734d.f154735a), 0).show();
            }
        }
        return appBrandVoipCheckIsDeviceUsingEvent.f154734d.f154735a;
    }

    /* renamed from: d */
    public static boolean m71648d() {
        AppBrandVoipCheckIsDeviceUsingEvent appBrandVoipCheckIsDeviceUsingEvent = new AppBrandVoipCheckIsDeviceUsingEvent();
        appBrandVoipCheckIsDeviceUsingEvent.publish();
        Log.m105925i("MicroMsg.DeviceOccupy", "checkAppBrandVoiceUsing isVoiceUsing:%b, isCameraUsing:%b", Boolean.valueOf(appBrandVoipCheckIsDeviceUsingEvent.f154734d.f154736b), Boolean.valueOf(appBrandVoipCheckIsDeviceUsingEvent.f154734d.f154735a));
        if (appBrandVoipCheckIsDeviceUsingEvent.f154734d.f154736b) {
            Log.m105924i("MicroMsg.DeviceOccupy", "app brand voip voice using");
        }
        return appBrandVoipCheckIsDeviceUsingEvent.f154734d.f154736b;
    }

    /* renamed from: e */
    public static boolean m71649e(Context context) {
        AppBrandVoipCheckIsDeviceUsingEvent appBrandVoipCheckIsDeviceUsingEvent = new AppBrandVoipCheckIsDeviceUsingEvent();
        appBrandVoipCheckIsDeviceUsingEvent.publish();
        Log.m105925i("MicroMsg.DeviceOccupy", "checkAppBrandVoiceUsingAndShowToast isVoiceUsing:%b, isCameraUsing:%b", Boolean.valueOf(appBrandVoipCheckIsDeviceUsingEvent.f154734d.f154736b), Boolean.valueOf(appBrandVoipCheckIsDeviceUsingEvent.f154734d.f154735a));
        if (appBrandVoipCheckIsDeviceUsingEvent.f154734d.f154736b) {
            Log.m105924i("MicroMsg.DeviceOccupy", "app brand voip voice using");
            C76879j.m92754y(context, "", m71643C(context, appBrandVoipCheckIsDeviceUsingEvent.f154734d.f154735a), context.getString(C0966R.string.f8028zq), new C10286e());
        }
        return appBrandVoipCheckIsDeviceUsingEvent.f154734d.f154736b;
    }

    /* renamed from: f */
    public static boolean m71650f(Context context, DialogInterface.OnClickListener onClickListener) {
        AppBrandVoipCheckIsDeviceUsingEvent appBrandVoipCheckIsDeviceUsingEvent = new AppBrandVoipCheckIsDeviceUsingEvent();
        appBrandVoipCheckIsDeviceUsingEvent.publish();
        Log.m105925i("MicroMsg.DeviceOccupy", "checkAppBrandVoiceUsingAndShowToast isVoiceUsing:%b, isCameraUsing:%b", Boolean.valueOf(appBrandVoipCheckIsDeviceUsingEvent.f154734d.f154736b), Boolean.valueOf(appBrandVoipCheckIsDeviceUsingEvent.f154734d.f154735a));
        if (appBrandVoipCheckIsDeviceUsingEvent.f154734d.f154736b) {
            Log.m105924i("MicroMsg.DeviceOccupy", "app brand voip voice using");
            C76879j.m92754y(context, "", m71643C(context, appBrandVoipCheckIsDeviceUsingEvent.f154734d.f154735a), context.getString(C0966R.string.f8028zq), onClickListener);
        }
        return appBrandVoipCheckIsDeviceUsingEvent.f154734d.f154736b;
    }

    /* renamed from: g */
    public static boolean m71651g(Context context) {
        return m71653i(context, true, (Bundle) null);
    }

    /* renamed from: h */
    public static boolean m71652h(Context context, boolean z, DialogInterface.OnClickListener onClickListener) {
        VoipCheckIsDeviceUsingEvent voipCheckIsDeviceUsingEvent = new VoipCheckIsDeviceUsingEvent();
        voipCheckIsDeviceUsingEvent.publish();
        if (!voipCheckIsDeviceUsingEvent.f194014d.f194016b) {
            return m71663s(context, onClickListener);
        }
        Log.m105924i("MicroMsg.DeviceOccupy", "isCameraUsing");
        if (z) {
            C76879j.m92754y(context, "", m71643C(context, voipCheckIsDeviceUsingEvent.f194014d.f194015a), context.getString(C0966R.string.f8028zq), onClickListener);
        }
        return voipCheckIsDeviceUsingEvent.f194014d.f194016b;
    }

    /* renamed from: i */
    public static boolean m71653i(Context context, boolean z, Bundle bundle) {
        VoipCheckIsDeviceUsingEvent voipCheckIsDeviceUsingEvent = new VoipCheckIsDeviceUsingEvent();
        voipCheckIsDeviceUsingEvent.publish();
        if (voipCheckIsDeviceUsingEvent.f194014d.f194016b) {
            Log.m105924i("MicroMsg.DeviceOccupy", "isCameraUsing");
            if (z) {
                C76879j.m92754y(context, "", m71643C(context, voipCheckIsDeviceUsingEvent.f194014d.f194015a), context.getString(C0966R.string.f8028zq), new C61105b());
            }
            return voipCheckIsDeviceUsingEvent.f194014d.f194016b;
        } else if (m71657m(context, z, bundle)) {
            return true;
        } else {
            LiveStateActionEvent liveStateActionEvent = new LiveStateActionEvent();
            liveStateActionEvent.publish();
            Log.m105925i("MicroMsg.DeviceOccupy", "isLiving %b isAnchor %b isAudioMicing %s isVideoMicing %s", Boolean.valueOf(liveStateActionEvent.f154829d.f154830a), Boolean.valueOf(liveStateActionEvent.f154829d.f154831b), Boolean.valueOf(liveStateActionEvent.f154829d.f154832c), Boolean.valueOf(liveStateActionEvent.f154829d.f154833d));
            LiveStateActionEvent.C55143a aVar = liveStateActionEvent.f154829d;
            boolean z2 = aVar.f154831b ? aVar.f154830a : aVar.f154833d;
            if (z2 && z) {
                C76879j.m92754y(context, "", context.getString(C0966R.string.g94), context.getString(C0966R.string.f8028zq), new C61108b());
            }
            return z2;
        }
    }

    /* renamed from: j */
    public static int m71654j() {
        if (m71641A()) {
            return 1;
        }
        VoipCheckIsDeviceUsingEvent voipCheckIsDeviceUsingEvent = new VoipCheckIsDeviceUsingEvent();
        voipCheckIsDeviceUsingEvent.publish();
        if (voipCheckIsDeviceUsingEvent.f194014d.f194017c) {
            return 2;
        }
        if (m71667w(MMApplicationContext.getContext())) {
            return 3;
        }
        return m71644D() ? 4 : 0;
    }

    /* renamed from: k */
    public static boolean m71655k(Context context, DialogInterface.OnClickListener onClickListener) {
        FaceFlashStateEvent faceFlashStateEvent = new FaceFlashStateEvent();
        faceFlashStateEvent.publish();
        if (!faceFlashStateEvent.f9152d.f9153a) {
            return false;
        }
        Log.m105924i("MicroMsg.DeviceOccupy", "is Face page exist");
        C76879j.m92754y(context, "", context.getString(C0966R.string.cjn), context.getString(C0966R.string.f8028zq), onClickListener);
        return faceFlashStateEvent.f9152d.f9153a;
    }

    /* renamed from: l */
    public static boolean m71656l(Context context, boolean z) {
        FinderLiveStateActionEvent finderLiveStateActionEvent = new FinderLiveStateActionEvent();
        finderLiveStateActionEvent.publish();
        Log.m105925i("MicroMsg.DeviceOccupy", "checkFinderLive isLiving %b isAnchor %b", Boolean.valueOf(finderLiveStateActionEvent.f154780d.f154781a), Boolean.valueOf(finderLiveStateActionEvent.f154780d.f154782b));
        FinderLiveStateActionEvent.C55128a aVar = finderLiveStateActionEvent.f154780d;
        boolean z2 = aVar.f154781a;
        if (z2 && z) {
            C76912y0.makeText(context, (CharSequence) aVar.f154782b ? context.getString(C0966R.string.e0j) : context.getString(C0966R.string.e0k), 0).show();
        }
        return z2;
    }

    /* renamed from: m */
    public static boolean m71657m(Context context, boolean z, Bundle bundle) {
        FinderLiveStateActionEvent finderLiveStateActionEvent = new FinderLiveStateActionEvent();
        finderLiveStateActionEvent.publish();
        boolean z2 = true;
        Log.m105925i("MicroMsg.DeviceOccupy", "checkFinderLive isLiving %b isAnchor %b", Boolean.valueOf(finderLiveStateActionEvent.f154780d.f154781a), Boolean.valueOf(finderLiveStateActionEvent.f154780d.f154782b));
        FinderLiveStateActionEvent.C55128a aVar = finderLiveStateActionEvent.f154780d;
        boolean z3 = aVar.f154781a && aVar.f154782b;
        boolean z4 = aVar.f154785e;
        boolean z5 = aVar.f154786f;
        boolean z6 = bundle != null ? bundle.getBoolean("CLICK_ENTER_SCAN", false) : false;
        boolean z7 = z6 && !z4 && !z5;
        Log.m105925i("MicroMsg.DeviceOccupy", "isAnchorLinkMic %b isEnterScan %b isMicIntercomEnable %b", Boolean.valueOf(z4), Boolean.valueOf(z6), Boolean.valueOf(z5));
        if (!z3 || z7) {
            z2 = false;
        }
        if (z2 && z) {
            C76912y0.makeText(context, (CharSequence) z4 ? context.getString(C0966R.string.mrb) : z5 ? context.getString(C0966R.string.mrc) : finderLiveStateActionEvent.f154780d.f154782b ? context.getString(C0966R.string.e0j) : context.getString(C0966R.string.e0k), 0).show();
        }
        return z2;
    }

    /* renamed from: n */
    public static boolean m71658n(Context context, boolean z) {
        FinderLiveStateActionEvent finderLiveStateActionEvent = new FinderLiveStateActionEvent();
        finderLiveStateActionEvent.publish();
        boolean z2 = true;
        Log.m105925i("MicroMsg.DeviceOccupy", "checkFinderLive isLiving %b isAnchor %b", Boolean.valueOf(finderLiveStateActionEvent.f154780d.f154781a), Boolean.valueOf(finderLiveStateActionEvent.f154780d.f154782b));
        FinderLiveStateActionEvent.C55128a aVar = finderLiveStateActionEvent.f154780d;
        if (!aVar.f154781a || aVar.f154782b || !aVar.f154783c) {
            z2 = false;
        }
        if (z2 && z) {
            C76912y0.makeText(context, (CharSequence) aVar.f154782b ? context.getString(C0966R.string.e0j) : context.getString(C0966R.string.e0k), 0).show();
        }
        return z2;
    }

    /* renamed from: o */
    public static boolean m71659o(Context context, boolean z) {
        FinderLiveStateActionEvent finderLiveStateActionEvent = new FinderLiveStateActionEvent();
        finderLiveStateActionEvent.publish();
        FinderLiveStateActionEvent.C55128a aVar = finderLiveStateActionEvent.f154780d;
        boolean z2 = aVar.f154785e;
        boolean z3 = aVar.f154786f;
        boolean z4 = true;
        Log.m105925i("MicroMsg.DeviceOccupy", "checkFinderLiveStateAsVisitorMicOrIntercom isLiving %b isAnchor %b isLinkMic %b isMicIntercomEnable %b", Boolean.valueOf(aVar.f154781a), Boolean.valueOf(finderLiveStateActionEvent.f154780d.f154782b), Boolean.valueOf(z2), Boolean.valueOf(z3));
        FinderLiveStateActionEvent.C55128a aVar2 = finderLiveStateActionEvent.f154780d;
        if (!aVar2.f154781a || aVar2.f154782b || (!z2 && !z3)) {
            z4 = false;
        }
        if (z4 && z) {
            C76912y0.makeText(context, (CharSequence) z2 ? context.getString(C0966R.string.mrb) : z3 ? context.getString(C0966R.string.mrc) : context.getString(C0966R.string.e0k), 0).show();
        }
        return z4;
    }

    /* renamed from: p */
    public static boolean m71660p() {
        FinderLiveStateActionEvent finderLiveStateActionEvent = new FinderLiveStateActionEvent();
        finderLiveStateActionEvent.publish();
        Log.m105925i("MicroMsg.DeviceOccupy", "checkFinderLiveStatePlaying isLiving %b isAnchor %b", Boolean.valueOf(finderLiveStateActionEvent.f154780d.f154781a), Boolean.valueOf(finderLiveStateActionEvent.f154780d.f154782b));
        FinderLiveStateActionEvent.C55128a aVar = finderLiveStateActionEvent.f154780d;
        return aVar.f154781a && !aVar.f154782b;
    }

    /* renamed from: q */
    public static boolean m71661q(Context context, boolean z) {
        FinderVideoStateActionEvent finderVideoStateActionEvent = new FinderVideoStateActionEvent();
        finderVideoStateActionEvent.publish();
        Log.m105925i("MicroMsg.DeviceOccupy", "checkFinderVideoState isExist %b ", Boolean.valueOf(finderVideoStateActionEvent.f154816d.f154817a));
        if (finderVideoStateActionEvent.f154816d.f154817a && z && context != null) {
            C76912y0.makeText(context, (int) C0966R.string.ebc, 0).show();
        }
        return finderVideoStateActionEvent.f154816d.f154817a;
    }

    /* renamed from: r */
    public static boolean m71662r() {
        LiveStateActionEvent liveStateActionEvent = new LiveStateActionEvent();
        liveStateActionEvent.publish();
        Log.m105925i("MicroMsg.DeviceOccupy", "isLiving %b isAnchor %b", Boolean.valueOf(liveStateActionEvent.f154829d.f154830a), Boolean.valueOf(liveStateActionEvent.f154829d.f154831b));
        return liveStateActionEvent.f154829d.f154830a;
    }

    /* renamed from: s */
    public static boolean m71663s(Context context, DialogInterface.OnClickListener onClickListener) {
        LiveStateActionEvent liveStateActionEvent = new LiveStateActionEvent();
        liveStateActionEvent.publish();
        Log.m105925i("MicroMsg.DeviceOccupy", "isLiving %b isAnchor %b", Boolean.valueOf(liveStateActionEvent.f154829d.f154830a), Boolean.valueOf(liveStateActionEvent.f154829d.f154831b));
        boolean z = liveStateActionEvent.f154829d.f154830a;
        if (z) {
            C76879j.m92754y(context, "", context.getString(C0966R.string.g94), context.getString(C0966R.string.f8028zq), new C61106c(onClickListener));
        }
        return z;
    }

    /* renamed from: t */
    public static boolean m71664t(Context context, boolean z) {
        LiveStateActionEvent liveStateActionEvent = new LiveStateActionEvent();
        liveStateActionEvent.publish();
        boolean z2 = false;
        Log.m105925i("MicroMsg.DeviceOccupy", "checkFinderLiveStatePlaying isLiving %b isAnchor %b", Boolean.valueOf(liveStateActionEvent.f154829d.f154830a), Boolean.valueOf(liveStateActionEvent.f154829d.f154831b));
        LiveStateActionEvent.C55143a aVar = liveStateActionEvent.f154829d;
        if (aVar.f154830a && aVar.f154831b) {
            z2 = true;
        }
        if (z2 && z) {
            C76879j.m92754y(context, "", context.getString(C0966R.string.e0j), context.getString(C0966R.string.f8028zq), new C61107f());
        }
        return z2;
    }

    /* renamed from: u */
    public static boolean m71665u(Context context) {
        if (!m71644D()) {
            return false;
        }
        Log.m105924i("MicroMsg.DeviceOccupy", "isMultiTalking");
        C76879j.m92754y(context, "", context.getString(C0966R.string.gzg), context.getString(C0966R.string.f8028zq), new C10284a());
        return true;
    }

    /* renamed from: v */
    public static boolean m71666v(Context context, DialogInterface.OnClickListener onClickListener) {
        if (!m71644D()) {
            return false;
        }
        Log.m105924i("MicroMsg.DeviceOccupy", "isMultiTalking");
        C76879j.m92754y(context, "", context.getString(C0966R.string.gzg), context.getString(C0966R.string.f8028zq), onClickListener).setCanceledOnTouchOutside(false);
        return true;
    }

    /* renamed from: w */
    public static boolean m71667w(Context context) {
        MultiTalkActionEvent multiTalkActionEvent = new MultiTalkActionEvent();
        multiTalkActionEvent.f154837d.f107635a = 2;
        multiTalkActionEvent.publish();
        return multiTalkActionEvent.f154838e.f154839a;
    }

    /* renamed from: x */
    public static boolean m71668x() {
        boolean z = false;
        if (m71656l((Context) null, false) || m71661q((Context) null, false)) {
            z = true;
        }
        Log.m105924i("MicroMsg.DeviceOccupy", "checkMutePlay=" + z);
        return z;
    }

    /* renamed from: y */
    public static boolean m71669y(Context context) {
        VoipCheckIsDeviceUsingEvent voipCheckIsDeviceUsingEvent = new VoipCheckIsDeviceUsingEvent();
        voipCheckIsDeviceUsingEvent.publish();
        if (voipCheckIsDeviceUsingEvent.f194014d.f194017c) {
            Log.m105924i("MicroMsg.DeviceOccupy", "isVoiceUsing");
            C76879j.m92754y(context, "", m71643C(context, voipCheckIsDeviceUsingEvent.f194014d.f194015a), context.getString(C0966R.string.f8028zq), new C10285d());
            return voipCheckIsDeviceUsingEvent.f194014d.f194017c;
        } else if (!m71657m(context, true, (Bundle) null) && !m71661q(context, true)) {
            return m71663s(context, (DialogInterface.OnClickListener) null);
        } else {
            return true;
        }
    }

    /* renamed from: z */
    public static boolean m71670z(Context context, DialogInterface.OnClickListener onClickListener) {
        VoipCheckIsDeviceUsingEvent voipCheckIsDeviceUsingEvent = new VoipCheckIsDeviceUsingEvent();
        voipCheckIsDeviceUsingEvent.publish();
        if (voipCheckIsDeviceUsingEvent.f194014d.f194017c) {
            Log.m105924i("MicroMsg.DeviceOccupy", "isVoiceUsing");
            C76879j.m92754y(context, "", m71643C(context, voipCheckIsDeviceUsingEvent.f194014d.f194015a), context.getString(C0966R.string.f8028zq), onClickListener);
            return voipCheckIsDeviceUsingEvent.f194014d.f194017c;
        } else if (m71661q(context, true)) {
            return true;
        } else {
            return m71663s(context, (DialogInterface.OnClickListener) null);
        }
    }
}
