package y50;

import com.tencent.p014mm.message.C68066g;
import com.tencent.p014mm.message.C68070l;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import gy3.C87412m;
import java.util.Map;
import p1081gi.C98121d;

/* renamed from: y50.q0 */
public final class C66541q0 extends C68066g {

    /* renamed from: b */
    public String f191394b = "";

    /* renamed from: c */
    public String f191395c = "";

    /* renamed from: d */
    public String f191396d = "";

    /* renamed from: a */
    public C68066g mo7615a() {
        return new C66541q0();
    }

    /* renamed from: c */
    public void mo7616c(StringBuilder sb, C68070l.C68072b bVar, String str, C98121d dVar, int i, int i2) {
        boolean z = false;
        if (bVar != null && bVar.f195582i == 60) {
            z = true;
        }
        if (z && sb != null) {
            sb.append("<mmlive>");
            sb.append("<live_id>");
            sb.append(C68070l.C68072b.m80417g(this.f191394b));
            sb.append("</live_id>");
            sb.append("</mmlive>");
        }
    }

    /* renamed from: d */
    public void mo7617d(Map<String, String> map, C68070l.C68072b bVar) {
        boolean z = false;
        if (bVar != null && bVar.f195582i == 60) {
            z = true;
        }
        if (z) {
            C87412m.m108591d(map);
            String nullAsNil = Util.nullAsNil(map.get(".msg.appmsg.mmlive.live_id"));
            C87412m.m108593f(nullAsNil, "nullAsNil(values!![\".msg.appmsg.mmlive.live_id\"])");
            this.f191394b = nullAsNil;
            String nullAsNil2 = Util.nullAsNil(map.get(".msg.appmsg.title"));
            C87412m.m108593f(nullAsNil2, "nullAsNil(values!![\".msg.appmsg.title\"])");
            this.f191395c = nullAsNil2;
            String nullAsNil3 = Util.nullAsNil(map.get(".msg.appmsg.thumburl"));
            C87412m.m108593f(nullAsNil3, "nullAsNil(values!![\".msg.appmsg.thumburl\"])");
            this.f191396d = nullAsNil3;
            Log.m105924i("MicroMsg.ShareLiveAppMsgPiece", toString());
        }
    }

    public String toString() {
        return "ShareLiveAppMsgPiece(liveId='" + this.f191394b + "', liveName='" + this.f191395c + "', thumbUrl='" + this.f191396d + "')";
    }
}
