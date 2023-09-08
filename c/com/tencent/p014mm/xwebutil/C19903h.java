package com.tencent.p014mm.xwebutil;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.thumbplayer.api.ITPPlayer;
import p206nj.C100115c;

/* renamed from: com.tencent.mm.xwebutil.h */
public class C19903h implements C100115c.C100116a {

    /* renamed from: d */
    public final /* synthetic */ String f56732d;

    public C19903h(String str) {
        this.f56732d = str;
    }

    public void onChange(int i) {
        Log.m105925i("XFilesAudioPlayerLogic", "audioFocusHelper onChange %d", Integer.valueOf(i));
        if (!C19905j.m21650b(this.f56732d)) {
            Log.m105920e("XFilesAudioPlayerLogic", "audioFocusHelper onChange, sCurrentParams invalid");
            return;
        }
        ITPPlayer iTPPlayer = C19905j.f56734a.f56748h;
        if (iTPPlayer == null) {
            Log.m105920e("XFilesAudioPlayerLogic", "audioFocusHelper onChange, tpPlayer invalid");
        } else if (i == -2 || i == -3 || i == -1) {
            Log.m105924i("XFilesAudioPlayerLogic", "audioFocusHelper focus loss, try pause");
            if (iTPPlayer.getCurrentState() == 5) {
                iTPPlayer.pause();
            }
        } else if (i == 1 || i == 2 || i == 3) {
            try {
                Log.m105924i("XFilesAudioPlayerLogic", "audioFocusHelper focus gain");
            } catch (Throwable th) {
                Log.m105920e("XFilesAudioPlayerLogic", "audioFocusHelper pause error: " + th.getMessage());
                C19905j.m21652d("audioFocusHelper pause error ", th);
            }
        }
    }
}
