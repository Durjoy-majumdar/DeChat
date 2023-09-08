package com.tencent.p014mm.message;

import android.util.Base64;
import com.tencent.p014mm.message.C68070l;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.io.IOException;
import java.util.Map;
import p1081gi.C98121d;
import te3.bb4;
import te3.za4;

/* renamed from: com.tencent.mm.message.j */
public class C68069j extends C68066g {
    /* renamed from: a */
    public C68066g mo7615a() {
        return new C68069j();
    }

    /* renamed from: c */
    public void mo7616c(StringBuilder sb, C68070l.C68072b bVar, String str, C98121d dVar, int i, int i2) {
        if (!Util.isNullOrNil(bVar.f195562d)) {
            String str2 = bVar.f195535U1;
            bb4 bb4 = new bb4();
            if (str2 != null) {
                try {
                    bb4.parseFrom(Base64.decode(str2, 0));
                } catch (Exception e) {
                    Log.printErrStackTrace("MicroMsg.AppContentStatExtStrPiece", e, "", new Object[0]);
                }
            }
            za4 za4 = new za4();
            bb4.f226994f = za4;
            za4.f186651d = bVar.f195562d;
            try {
                str2 = Base64.encodeToString(bb4.toByteArray(), 0).replace("\n", "");
            } catch (IOException e2) {
                Log.printErrStackTrace("MicroMsg.AppContentStatExtStrPiece", e2, "", new Object[0]);
            }
            bVar.f195535U1 = str2;
        }
        sb.append("<statextstr>" + Util.escapeStringForXml(bVar.f195535U1) + "</statextstr>");
    }

    /* renamed from: d */
    public void mo7617d(Map<String, String> map, C68070l.C68072b bVar) {
    }
}
