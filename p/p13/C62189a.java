package p13;

import android.media.AudioAttributes;
import android.os.VibrationEffect;
import android.os.Vibrator;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import di3.C86312j;
import gk2.C59528a;
import gy3.C87412m;
import h81.C32735h;
import java.io.File;
import p206nj.C11171e;
import p288a6.C53978d;
import p388v5.C22714a;
import p409b6.C23674a;
import q13.C62579a;
import r13.C63358c;

/* renamed from: p13.a */
public final class C62189a {

    /* renamed from: a */
    public C22714a f176812a;

    /* renamed from: b */
    public Vibrator f176813b;

    /* renamed from: p13.a$a */
    public static final class C62190a implements C23674a {

        /* renamed from: a */
        public final /* synthetic */ C62579a f176814a;

        public C62190a(C62579a aVar) {
            this.f176814a = aVar;
        }

        public final int getCurrentPosition() {
            return this.f176814a.getCurrentPosition();
        }
    }

    /* renamed from: a */
    public final void mo87246a(C59528a aVar, C62579a aVar2) {
        C87412m.m108594g(aVar, "vibrateInfo");
        if (C11171e.m11046c(26) && aVar.f170149a != null && aVar.f170150b != null) {
            if (C63358c.m74699a() ? false : ((C32735h) C86312j.m106911c(C32735h.class)).mo58784wf(C32735h.C32737c.clicfg_ringtone_voip_can_vibrate, true)) {
                Log.m105924i("MircoMsg.VibrateServiceHelper", "init vibrate service use aac haptic" + hashCode());
                C22714a a = C22714a.m26598a(MMApplicationContext.getContext());
                if (a != null) {
                    String str = aVar.f170149a;
                    String str2 = aVar.f170150b;
                    if (!(str == null || str2 == null)) {
                        if (aVar2 == null) {
                            File file = new File(C63358c.m74701e(str, str2, true));
                            C53978d dVar = a.f65297b;
                            if (dVar != null) {
                                dVar.mo37105d(file, 255, 50, (C23674a) null);
                            }
                        } else {
                            File file2 = new File(C63358c.m74701e(str, str2, true));
                            C62190a aVar3 = new C62190a(aVar2);
                            C53978d dVar2 = a.f65297b;
                            if (dVar2 != null) {
                                dVar2.mo37105d(file2, 255, 50, aVar3);
                            }
                        }
                    }
                } else {
                    a = null;
                }
                this.f176812a = a;
            }
        }
    }

    /* renamed from: b */
    public final void mo87247b() {
        if (!C11171e.m11046c(26) || this.f176812a == null) {
            Log.m105924i("MircoMsg.VibrateServiceHelper", "start vibrate service use default");
            Object systemService = MMApplicationContext.getContext().getSystemService("vibrator");
            C87412m.m108592e(systemService, "null cannot be cast to non-null type android.os.Vibrator");
            this.f176813b = (Vibrator) systemService;
            if (C11171e.m11046c(26)) {
                AudioAttributes build = new AudioAttributes.Builder().setUsage(6).build();
                Vibrator vibrator = this.f176813b;
                if (vibrator != null) {
                    vibrator.vibrate(VibrationEffect.createWaveform(new long[]{1000, 1000, 1000, 1000}, 0), build);
                    return;
                }
                return;
            }
            Vibrator vibrator2 = this.f176813b;
            if (vibrator2 != null) {
                vibrator2.vibrate(new long[]{1000, 1000, 1000, 1000}, 0);
                return;
            }
            return;
        }
        Log.m105924i("MircoMsg.VibrateServiceHelper", "start vibrate service use aac haptic " + this.f176812a);
        try {
            C22714a aVar = this.f176812a;
            if (aVar != null) {
                Log.m105924i("MircoMsg.VibrateServiceHelper", "do vibrate use aac haptic  " + this.f176812a);
                C53978d dVar = aVar.f65297b;
                if (dVar != null) {
                    dVar.prepare();
                }
                C53978d dVar2 = aVar.f65297b;
                if (dVar2 != null) {
                    dVar2.mo37103b(true);
                }
                C53978d dVar3 = aVar.f65297b;
                if (dVar3 != null) {
                    dVar3.start();
                }
            }
        } catch (Exception unused) {
            Log.m105920e("MircoMsg.VibrateServiceHelper", "error on haptic vibrate ");
        }
    }

    /* renamed from: c */
    public final void mo87248c() {
        Log.m105924i("MircoMsg.VibrateServiceHelper", "do stop vibrate service");
        C22714a aVar = this.f176812a;
        if (aVar != null) {
            Log.m105924i("MircoMsg.VibrateServiceHelper", "do stop vibrate service " + aVar);
            C53978d dVar = aVar.f65297b;
            if (dVar != null) {
                dVar.pause();
            }
            C53978d dVar2 = aVar.f65297b;
            if (dVar2 != null) {
                dVar2.mo37104c();
            }
            C53978d dVar3 = aVar.f65297b;
            if (dVar3 != null) {
                dVar3.release();
            }
        }
        Vibrator vibrator = this.f176813b;
        if (vibrator != null) {
            vibrator.cancel();
        }
    }
}
