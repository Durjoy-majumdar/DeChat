package com.tencent.p014mm.message;

import android.util.Base64;
import com.tencent.p014mm.message.C68070l;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.Map;
import org.json.JSONObject;
import p1081gi.C98121d;

/* renamed from: com.tencent.mm.message.e */
public class C68064e extends C68066g {

    /* renamed from: b */
    public String f195412b;

    /* renamed from: c */
    public String f195413c;

    /* renamed from: d */
    public long f195414d;

    /* renamed from: e */
    public long f195415e;

    /* renamed from: f */
    public int f195416f;

    /* renamed from: a */
    public C68066g mo7615a() {
        return new C68064e();
    }

    /* renamed from: c */
    public void mo7616c(StringBuilder sb, C68070l.C68072b bVar, String str, C98121d dVar, int i, int i2) {
        if (bVar.f195582i == 2001) {
            sb.append("<voice>");
            sb.append("<voiceurl>");
            sb.append(C68070l.C68072b.m80417g(this.f195412b));
            sb.append("</voiceurl>");
            sb.append("<aeskey>");
            sb.append(C68070l.C68072b.m80417g(this.f195413c));
            sb.append("</aeskey>");
            sb.append("<length>");
            sb.append(this.f195414d);
            sb.append("</length>");
            sb.append("<playtime>");
            sb.append(this.f195415e);
            sb.append("</playtime>");
            sb.append("<format>");
            sb.append(this.f195416f);
            sb.append("</format>");
            sb.append("</voice>");
        }
    }

    /* renamed from: d */
    public void mo7617d(Map<String, String> map, C68070l.C68072b bVar) {
        if (bVar.f195582i == 2001) {
            this.f195412b = Util.nullAsNil(map.get(".msg.appmsg.voice.voiceurl"));
            this.f195413c = Util.nullAsNil(map.get(".msg.appmsg.voice.aeskey"));
            this.f195414d = Util.getLong(map.get(".msg.appmsg.voice.length"), 0);
            this.f195415e = Util.getLong(map.get(".msg.appmsg.voice.playtime"), 0);
            this.f195416f = Util.getInt(map.get(".msg.appmsg.voice.format"), 0);
            String str = bVar.f195590k;
            if ((Util.isNullOrNil(this.f195412b) || Util.isNullOrNil(this.f195413c)) && !Util.isNullOrNil(str)) {
                try {
                    JSONObject jSONObject = new JSONObject(new String(Base64.decode(str, 0)));
                    this.f195412b = jSONObject.optString("voice_url");
                    this.f195413c = jSONObject.optString("voice_aeskey");
                    this.f195414d = jSONObject.optLong("voice_file_length");
                    this.f195415e = jSONObject.optLong("voice_playtime");
                    this.f195416f = jSONObject.optInt("voice_format");
                } catch (Exception e) {
                    Log.printErrStackTrace("MicroMsg.AppContentLuckyMoneyVoicePiece", e, "", new Object[0]);
                }
            }
        }
    }
}
