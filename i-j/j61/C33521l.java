package j61;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.xweb.util.WXWebReporter;
import di3.C86312j;
import java.io.IOException;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import te3.C52184yy1;
import te3.C52325zy1;
import wh3.C38137l;
import wh3.C38138m;
import z51.C39315g;

/* renamed from: j61.l */
public class C33521l extends C117747y implements C1311n {

    /* renamed from: d */
    public final C47350c f90759d;

    /* renamed from: e */
    public C11385n f90760e;

    /* renamed from: f */
    public String f90761f;

    public C33521l(String str) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C52184yy1();
        bVar.f127067b = new C52325zy1();
        bVar.f127068c = "/cgi-bin/micromsg-bin/mmgetdesignersimpleinfo";
        bVar.f127069d = WXWebReporter.WXXWEB_PRE_DOWN_ARM64_SUC;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        this.f90759d = bVar.mo72403a();
        this.f90761f = str;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f90760e = nVar;
        C47350c cVar = this.f90759d;
        ((C52184yy1) cVar.f127055a.f127080a).f145576d = this.f90761f;
        return dispatch(gVar, cVar, this);
    }

    public int getType() {
        return WXWebReporter.WXXWEB_PRE_DOWN_ARM64_SUC;
    }

    /* renamed from: j1 */
    public C52325zy1 mo59185j1() {
        C47350c cVar = this.f90759d;
        if (cVar == null) {
            return null;
        }
        return (C52325zy1) cVar.f127056b.f127083a;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105919d("MicroMsg.emoji.NetSceneGetDesignerSimpleInfo", "onGYNetEnd ErrType:%d, errCode:%d, errMsg", Integer.valueOf(i2), Integer.valueOf(i3), str);
        if (i2 == 0 && i3 == 0) {
            C38138m e = ((C39315g) C86312j.m106911c(C39315g.class)).mo58034O6().mo57718e();
            String str2 = this.f90761f;
            C52325zy1 j1 = mo59185j1();
            e.getClass();
            if (Util.isNullOrNil(str2) || j1 == null) {
                Log.m105928w("MicroMsg.emoji.EmotionDesignerInfo", "saveDesignerSimpleInfoResponseByID failed. designerID or response is null.");
            } else {
                try {
                    C38137l lVar = new C38137l();
                    lVar.field_designerIDAndType = str2 + 0;
                    lVar.field_content = j1.toByteArray();
                    if (e.f100783d.replace("EmotionDesignerInfo", "designerIDAndType", lVar.convertTo()) > 0) {
                        Log.m105925i("MicroMsg.emoji.EmotionDesignerInfo", "saveDesignerSimpleInfoResponseByID success. designerID:%s", str2);
                    } else {
                        Log.m105925i("MicroMsg.emoji.EmotionDesignerInfo", "saveDesignerSimpleInfoResponseByID failed. designerID:%s", str2);
                    }
                } catch (IOException e2) {
                    Log.m105921e("MicroMsg.emoji.EmotionDesignerInfo", "saveDesignerSimpleInfoResponseByID exception:%s", Util.stackTraceToString(e2));
                }
            }
        }
        this.f90760e.onSceneEnd(i2, i3, str, this);
    }
}
