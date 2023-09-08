package sn2;

import com.tencent.p014mm.plugin.shake.p103ui.ShakeReportUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.io.IOException;
import java.util.ArrayList;
import nn2.C21685l;
import nn2.C47288f;
import nn2.C76942m;
import te3.C49335eu3;
import te3.C50874pt2;
import te3.C51155rt2;

public final /* synthetic */ class p$$a implements C22375l {

    /* renamed from: a */
    public final /* synthetic */ C22377p f129636a;

    public /* synthetic */ p$$a(C22377p pVar) {
        this.f129636a = pVar;
    }

    /* renamed from: a */
    public final void mo35517a(C49335eu3 eu32, long j, boolean z) {
        C22377p pVar = this.f129636a;
        if (pVar.f61391d == null) {
            Log.m105928w("Micromsg.ShakeMusicMgr", "shakeGetListener == null");
        } else if (eu32 == null) {
            Log.m105928w("Micromsg.ShakeMusicMgr", "resp null & return");
            ArrayList arrayList = new ArrayList();
            C21685l.C21686a aVar = pVar.f61391d;
            if (aVar != null) {
                ((ShakeReportUI) aVar).mo24635O7(arrayList, 4);
            }
        } else {
            C51155rt2 rt22 = (C51155rt2) eu32;
            Log.m105925i("Micromsg.ShakeMusicMgr", "music size: %d", Integer.valueOf(rt22.f141139i.size()));
            ArrayList arrayList2 = new ArrayList();
            if (rt22.f141139i.size() > 0) {
                C50874pt2 pt22 = rt22.f141139i.get(0);
                Log.m105925i("Micromsg.ShakeMusicMgr", "shake music is success, songName: %s, singerName: %s, bgUrl: %s", pt22.f139956g, pt22.f139957h, pt22.f139959j);
                C47288f fVar = new C47288f();
                String str = pt22.f139957h;
                fVar.field_username = str;
                fVar.field_nickname = pt22.f139956g;
                fVar.field_distance = str;
                fVar.field_sns_bgurl = pt22.f139959j;
                fVar.field_type = 4;
                fVar.field_insertBatch = 1;
                fVar.field_reserved3 = "newShake";
                try {
                    fVar.field_lvbuffer = eu32.toByteArray();
                } catch (IOException e) {
                    Log.m105929w("Micromsg.ShakeMusicMgr", "insertItem, to lvbuf error [%s]", e.getLocalizedMessage());
                }
                C76942m.zx0().mo72324Yt(fVar, true);
                arrayList2.add(fVar);
            }
            ((ShakeReportUI) pVar.f61391d).mo24635O7(arrayList2, j);
        }
    }
}
