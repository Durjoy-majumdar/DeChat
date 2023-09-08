package oc3;

import android.media.AudioManager;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import java.util.concurrent.ConcurrentHashMap;
import nc3.C34767b;

/* renamed from: oc3.b */
public final class C21791b implements AudioManager.OnAudioFocusChangeListener {

    /* renamed from: d */
    public final /* synthetic */ C34767b.C34769b f61760d;

    public C21791b(C34767b.C34769b bVar) {
        this.f61760d = bVar;
    }

    public final void onAudioFocusChange(int i) {
        int i2 = i;
        if (C21788a.f61754n) {
            C34767b.C34769b bVar = this.f61760d;
            C87412m.m108594g(bVar, "<this>");
            if (!((bVar.f93452b & 2) == 2) && i2 == -3) {
                Log.m105928w("MicroMsg.AFS.AudioFocusManagerImpl", "genAudioFocusRequest: intercept AUDIOFOCUS_LOSS_TRANSIENT_CAN_DUCK call");
                return;
            }
        }
        if (C21788a.f61753j) {
            C21788a aVar = C21788a.f61747d;
            C34767b.C34769b bVar2 = this.f61760d;
            Log.m105924i("MicroMsg.AFS.AudioFocusManagerImpl", "onAudioFocusChangeOld: " + bVar2 + ", " + i2);
            ConcurrentHashMap<C34767b.C34769b, C21792c> concurrentHashMap = C21788a.f61751h;
            C21792c cVar = concurrentHashMap.get(bVar2);
            if (cVar == null) {
                Log.m105928w("MicroMsg.AFS.AudioFocusManagerImpl", "onAudioFocusChangeOld: " + bVar2 + " not contains in sessionMap");
            } else if (i2 == -3) {
                Log.m105924i("MicroMsg.AFS.AudioFocusManagerImpl", "onAudioFocusChangeOld: " + cVar + " dispatch onPause can duck");
                C34767b.C21622a aVar2 = cVar.f61765e;
                if (aVar2 != null) {
                    aVar2.mo17997a(true);
                }
                aVar.mo34193q(cVar, false, false);
            } else if (i2 == -2) {
                Log.m105924i("MicroMsg.AFS.AudioFocusManagerImpl", "onAudioFocusChangeOld: " + cVar + " dispatch onPause");
                C34767b.C21622a aVar3 = cVar.f61765e;
                if (aVar3 != null) {
                    aVar3.mo17997a(false);
                }
                aVar.mo34193q(cVar, false, false);
            } else if (i2 == -1) {
                Log.m105924i("MicroMsg.AFS.AudioFocusManagerImpl", "onAudioFocusChangeOld: " + cVar + " dispatch onStop");
                C34767b.C21622a aVar4 = cVar.f61765e;
                if (aVar4 != null) {
                    aVar4.onStop();
                }
                concurrentHashMap.remove(bVar2);
                aVar.mo34193q(cVar, false, false);
            } else if (i2 != 1) {
                Log.m105928w("MicroMsg.AFS.AudioFocusManagerImpl", "onAudioFocusChangeOld: un expected focusChange value " + i2);
            } else {
                Log.m105924i("MicroMsg.AFS.AudioFocusManagerImpl", "onAudioFocusChangeOld: " + cVar + " dispatch onResume");
                C34767b.C21622a aVar5 = cVar.f61765e;
                if (aVar5 != null) {
                    aVar5.onResume();
                }
                aVar.mo34193q(cVar, true, true);
            }
        } else {
            C21788a aVar6 = C21788a.f61747d;
            C34767b.C34769b bVar3 = this.f61760d;
            Log.m105924i("MicroMsg.AFS.AudioFocusManagerImpl", "onAudioFocusChange: " + bVar3 + ", " + i2);
            ConcurrentHashMap<C34767b.C34769b, C21792c> concurrentHashMap2 = C21788a.f61751h;
            C21792c cVar2 = concurrentHashMap2.get(bVar3);
            if (cVar2 == null) {
                Log.m105928w("MicroMsg.AFS.AudioFocusManagerImpl", "onAudioFocusChange: " + bVar3 + " not contains in sessionMap");
            } else if (i2 == -3) {
                Log.m105924i("MicroMsg.AFS.AudioFocusManagerImpl", "onAudioFocusChange: " + cVar2 + " dispatch onPause can duck");
                aVar6.mo34193q(cVar2, false, false);
                C34767b.C21622a aVar7 = cVar2.f61765e;
                if (aVar7 != null) {
                    aVar7.mo17997a(true);
                }
            } else if (i2 == -2) {
                Log.m105924i("MicroMsg.AFS.AudioFocusManagerImpl", "onAudioFocusChange: " + cVar2 + " dispatch onPause");
                aVar6.mo34193q(cVar2, false, false);
                C34767b.C21622a aVar8 = cVar2.f61765e;
                if (aVar8 != null) {
                    aVar8.mo17997a(false);
                }
            } else if (i2 == -1) {
                Log.m105924i("MicroMsg.AFS.AudioFocusManagerImpl", "onAudioFocusChange: " + cVar2 + " dispatch onStop");
                concurrentHashMap2.remove(bVar3);
                aVar6.mo34193q(cVar2, false, false);
                C34767b.C21622a aVar9 = cVar2.f61765e;
                if (aVar9 != null) {
                    aVar9.onStop();
                }
            } else if (i2 != 1) {
                Log.m105928w("MicroMsg.AFS.AudioFocusManagerImpl", "onAudioFocusChange: un expected focusChange value " + i2);
            } else {
                Log.m105924i("MicroMsg.AFS.AudioFocusManagerImpl", "onAudioFocusChange: " + cVar2 + " dispatch onResume");
                aVar6.mo34193q(cVar2, true, true);
                C34767b.C21622a aVar10 = cVar2.f61765e;
                if (aVar10 != null) {
                    aVar10.onResume();
                }
            }
        }
    }
}
