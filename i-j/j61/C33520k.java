package j61;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import java.io.IOException;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import sf0.C48374j0;
import te3.C51018qv3;
import te3.C51614uy1;
import te3.C51755vy1;
import wh3.C38137l;
import wh3.C38138m;
import yl0.C91481e;
import z51.C39315g;

/* renamed from: j61.k */
public class C33520k extends C117747y implements C1311n {

    /* renamed from: d */
    public final C47350c f90751d;

    /* renamed from: e */
    public C11385n f90752e;

    /* renamed from: f */
    public int f90753f;

    /* renamed from: g */
    public int f90754g;

    /* renamed from: h */
    public byte[] f90755h;

    /* renamed from: i */
    public int f90756i;

    /* renamed from: j */
    public String f90757j;

    /* renamed from: n */
    public int f90758n;

    public C33520k(int i, int i2, int i3, String str, int i4, byte[] bArr) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C51614uy1();
        bVar.f127067b = new C51755vy1();
        bVar.f127068c = "/cgi-bin/micromsg-bin/mmgetdesigneremojilist";
        bVar.f127069d = C91481e.CTRL_INDEX;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        this.f90751d = bVar.mo72403a();
        this.f90753f = i;
        this.f90754g = i2;
        this.f90756i = i3;
        this.f90757j = str;
        this.f90755h = bArr;
        this.f90758n = i4;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f90752e = nVar;
        C51614uy1 uy12 = (C51614uy1) this.f90751d.f127055a.f127080a;
        byte[] bArr = this.f90755h;
        if (bArr != null) {
            uy12.f143189f = C48374j0.m53712a(bArr);
        } else {
            uy12.f143189f = new C51018qv3();
        }
        C51018qv3 qv32 = uy12.f143189f;
        Log.m105918d("MicroMsg.emoji.NetSceneGetDesignerEmojiList", qv32 == null ? "Buf is NULL" : qv32.toString());
        uy12.f143188e = this.f90754g;
        uy12.f143187d = this.f90753f;
        uy12.f143190g = this.f90756i;
        uy12.f143191h = this.f90757j;
        uy12.f143192i = this.f90758n;
        return dispatch(gVar, this.f90751d, this);
    }

    public int getType() {
        return C91481e.CTRL_INDEX;
    }

    /* renamed from: j1 */
    public C51755vy1 mo59184j1() {
        C47350c cVar = this.f90751d;
        if (cVar == null) {
            return null;
        }
        return (C51755vy1) cVar.f127056b.f127083a;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        byte[] bArr2;
        Log.m105919d("MicroMsg.emoji.NetSceneGetDesignerEmojiList", "onGYNetEnd ErrType:%d, errCode:%d, errMsg", Integer.valueOf(i2), Integer.valueOf(i3), str);
        if (((i2 == 0 && i3 == 0) || (i2 == 4 && (i3 == 2 || i3 == 3))) && !(((bArr2 = this.f90755h) != null && bArr2.length > 0) || this.f90753f == 3 || this.f90754g == 0)) {
            C38138m e = ((C39315g) C86312j.m106911c(C39315g.class)).mo58034O6().mo57718e();
            String str2 = this.f90754g + "";
            C51755vy1 j1 = mo59184j1();
            e.getClass();
            if (Util.isNullOrNil(str2) || j1 == null) {
                Log.m105928w("MicroMsg.emoji.EmotionDesignerInfo", "saveDesignerEmojiListResponseByUIN failed. designerID or response is null.");
            } else {
                try {
                    C38137l lVar = new C38137l();
                    lVar.field_designerIDAndType = str2 + 2;
                    lVar.field_content = j1.toByteArray();
                    if (e.f100783d.replace("EmotionDesignerInfo", "designerIDAndType", lVar.convertTo()) > 0) {
                        Log.m105925i("MicroMsg.emoji.EmotionDesignerInfo", "savePersonalDesignerResponseByUIN success. designerID:%s", str2);
                    } else {
                        Log.m105925i("MicroMsg.emoji.EmotionDesignerInfo", "savePersonalDesignerResponseByUIN failed. designerID:%s", str2);
                    }
                } catch (IOException e2) {
                    Log.m105921e("MicroMsg.emoji.EmotionDesignerInfo", "saveDesignerSimpleInfoResponseByID exception:%s", Util.stackTraceToString(e2));
                }
            }
        }
        C51018qv3 qv32 = ((C51755vy1) ((C47350c) uVar).f127056b.f127083a).f143768e;
        if (qv32 != null) {
            this.f90755h = C48374j0.m53715d(qv32);
        }
        this.f90752e.onSceneEnd(i2, i3, str, this);
    }
}
