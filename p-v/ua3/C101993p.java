package ua3;

import com.tencent.p014mm.autogen.events.OpenNoteFromSessionEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import org.json.JSONObject;
import te3.C101811md0;
import wa3.C102364c;
import wa3.C102375n;

/* renamed from: ua3.p */
public class C101993p extends IStaticListener<OpenNoteFromSessionEvent> {
    public boolean callback(IEvent iEvent) {
        OpenNoteFromSessionEvent openNoteFromSessionEvent = (OpenNoteFromSessionEvent) iEvent;
        Log.m105924i("MicroMsg.OpenNoteFromSessionListener", "do OpenNoteFromSessionListener");
        C102375n nVar = new C102375n();
        OpenNoteFromSessionEvent.C67750a aVar = openNoteFromSessionEvent.f193796d;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("msgId", aVar.f193797a);
            String str = aVar.f193798b;
            if (str == null) {
                str = "";
            }
            jSONObject.put("noteXmlStr", str);
            jSONObject.put("showShare", aVar.f193800d);
            jSONObject.put(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, aVar.f193801e);
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.Fav.NoteFloatBallHelper", e, "eventToJson OpenNoteFromSessionEvent", new Object[0]);
        }
        nVar.f301476p = jSONObject.toString();
        int i = 2;
        nVar.f301477q = 2;
        C102364c.vx0().X00(nVar);
        C101811md0 md02 = new C101811md0();
        OpenNoteFromSessionEvent.C67750a aVar2 = openNoteFromSessionEvent.f193796d;
        md02.f298813d = aVar2.f193801e;
        String str2 = aVar2.f193798b;
        Long valueOf = Long.valueOf(aVar2.f193797a);
        OpenNoteFromSessionEvent.C67750a aVar3 = openNoteFromSessionEvent.f193796d;
        nVar.mo141964q(str2, valueOf, aVar3.f193800d, aVar3.f193799c, 0, 0, md02, aVar3.f193802f);
        if (openNoteFromSessionEvent.f193796d.f193800d) {
            i = 3;
        }
        nVar.f301472i.f301480b = i;
        return false;
    }
}
