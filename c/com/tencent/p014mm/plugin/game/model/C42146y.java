package com.tencent.p014mm.plugin.game.model;

import com.tencent.p014mm.plugin.game.model.C42119w;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import f40.C86709a0;
import java.util.Map;
import java.util.Random;
import sw1.C48484q;

/* renamed from: com.tencent.mm.plugin.game.model.y */
public class C42146y {
    /* renamed from: a */
    public static void m45833a(Map<String, String> map, C42119w wVar) {
        int i;
        if (wVar != null && map != null) {
            if (wVar.f113470e2 == 0) {
                wVar.f113470e2 = wVar.field_msgType;
            }
            wVar.f113462W1.f113582a = Util.nullAs(map.get(".sysmsg.report_rule.$report_id"), "");
            wVar.f113462W1.f113583b = Util.getInt(map.get(".sysmsg.report_rule.report_mode"), 0);
            wVar.f113462W1.f113584c = Util.getInt(map.get(".sysmsg.report_rule.report_sample"), 0);
            C42119w.C42140u uVar = wVar.f113462W1;
            if (uVar.f113585d == null) {
                int i2 = uVar.f113583b;
                if (i2 == 0) {
                    uVar.f113585d = Boolean.TRUE;
                } else if (i2 == 1) {
                    uVar.f113585d = Boolean.FALSE;
                } else if (i2 == 2) {
                    C42119w Ow = ((C48484q) C86312j.m106911c(C48484q.class)).xi0().mo66000Ow(wVar.field_msgId);
                    if (Ow != null) {
                        wVar.f113462W1.f113585d = Boolean.valueOf(Ow.field_needReport);
                    } else {
                        try {
                            C86709a0.m107528h();
                            i = new Random(((long) C86709a0.m107523b().mo121110g()) ^ System.nanoTime()).nextInt(10001);
                        } catch (Exception unused) {
                            i = Util.getIntRandom(10000, 0);
                        }
                        Log.m105925i("MicroMsg.GameMessageParser", "randomValue:%d, reportSample:%d", Integer.valueOf(i), Integer.valueOf(wVar.f113462W1.f113584c));
                        C42119w.C42140u uVar2 = wVar.f113462W1;
                        if (i < uVar2.f113584c) {
                            uVar2.f113585d = Boolean.TRUE;
                        } else {
                            uVar2.f113585d = Boolean.FALSE;
                        }
                    }
                }
                C42119w.C42140u uVar3 = wVar.f113462W1;
                if (uVar3.f113585d == null) {
                    uVar3.f113585d = Boolean.FALSE;
                }
            }
            boolean nullAs = Util.nullAs(wVar.f113462W1.f113585d, false);
            wVar.field_needReport = nullAs;
            Log.m105925i("MicroMsg.GameMessageParser", "gameMessageId:%s, needReport:%b", wVar.field_gameMsgId, Boolean.valueOf(nullAs));
        }
    }

    /* renamed from: b */
    public static void m45834b(Map<String, String> map, C42119w wVar) {
        wVar.f113442C1.f113503a = Util.nullAs(map.get(".sysmsg.gamecenter.floatlayer.open_url"), "");
        boolean z = false;
        wVar.f113442C1.f113504b = Util.getInt(map.get(".sysmsg.gamecenter.floatlayer.full_screen"), 0) == 1;
        wVar.f113442C1.f113505c = Util.getInt(map.get(".sysmsg.gamecenter.floatlayer.orientation"), 0);
        C42119w.C42121b bVar = wVar.f113442C1;
        if (Util.getInt(map.get(".sysmsg.gamecenter.floatlayer.is_transparent"), 0) == 1) {
            z = true;
        }
        bVar.f113506d = z;
    }
}
