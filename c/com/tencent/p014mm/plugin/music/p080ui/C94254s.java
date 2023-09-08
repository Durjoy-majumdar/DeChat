package com.tencent.p014mm.plugin.music.p080ui;

import android.view.View;
import com.tencent.p014mm.autogen.events.MusicPlayerEvent;
import com.tencent.p014mm.plugin.music.p080ui.C94243l;
import com.tencent.p014mm.plugin.music.p080ui.MusicMainUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.Map;
import ma2.C99814o0;

/* renamed from: com.tencent.mm.plugin.music.ui.s */
public class C94254s implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ MusicPlayerEvent f272310d;

    /* renamed from: e */
    public final /* synthetic */ MusicMainUI.C942324 f272311e;

    public C94254s(MusicMainUI.C942324 r1, MusicPlayerEvent musicPlayerEvent) {
        this.f272311e = r1;
        this.f272310d = musicPlayerEvent;
    }

    public void run() {
        C94243l lVar = MusicMainUI.this.f272243j;
        String str = this.f272310d.f9336d.f9339c;
        boolean z = false;
        for (Map.Entry<Integer, View> value : lVar.f272278j.entrySet()) {
            C94243l.C94245b bVar = (C94243l.C94245b) ((View) value.getValue()).getTag();
            if (bVar.f272287a.field_musicId.equals(str)) {
                bVar.mo129572c(C99814o0.wx0().mo140855jo(str), true);
                z = true;
            }
        }
        if (!z) {
            Log.m105924i("MicroMsg.Music.MusicMainAdapter", "holder song id is not exist, do refresh all");
            lVar.notifyDataSetChanged();
        }
    }
}
