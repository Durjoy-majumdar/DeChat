package kx1;

import ax1.C39643f;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import java.io.ByteArrayOutputStream;
import p1081gi.C98120c;
import p1081gi.C98121d;
import p1081gi.C98124g;

/* renamed from: kx1.b */
public final class C46790b implements C98124g.C98125a {

    /* renamed from: d */
    public final /* synthetic */ C39643f f125913d;

    public C46790b(C39643f fVar) {
        this.f125913d = fVar;
    }

    /* renamed from: g0 */
    public int mo1773g0(String str, int i, C98120c cVar, C98121d dVar, boolean z) {
        String str2;
        String str3;
        long j;
        String dVar2;
        String str4 = str;
        int i2 = i;
        C98120c cVar2 = cVar;
        C98121d dVar3 = dVar;
        C87412m.m108594g(str4, "mediaId");
        Object[] objArr = new Object[4];
        objArr[0] = str4;
        objArr[1] = Integer.valueOf(i);
        String str5 = "null";
        if (cVar2 == null || (str2 = cVar.toString()) == null) {
            str2 = str5;
        }
        objArr[2] = str2;
        if (!(dVar3 == null || (dVar2 = dVar.toString()) == null)) {
            str5 = dVar2;
        }
        objArr[3] = str5;
        Log.m105925i("MicroMsg.ChatRoomMediaUploader", "on cdn callback mediaId = %s, startRet = %d, keep_ProgressInfo = %s, keep_SceneResult = %s", objArr);
        if (i2 == -21005) {
            Log.m105925i("MicroMsg.ChatRoomMediaUploader", "duplicate request, ignore this request, media id is %s", str4);
            return 0;
        } else if (i2 != 0) {
            Log.m105921e("MicroMsg.ChatRoomMediaUploader", "start failed : %d, media id is :%s", Integer.valueOf(i), str4);
            ((C46794f) this.f125913d).mo72015a(false, i2, str4, dVar3);
            return 0;
        } else if (cVar2 != null) {
            Log.m105925i("MicroMsg.ChatRoomMediaUploader", "progressInfo : %s", cVar.toString());
            long j2 = cVar2.field_toltalLength;
            long j3 = 0;
            if (j2 > 0) {
                str3 = "MicroMsg.ChatRoomMediaUploader";
                j = (cVar2.field_finishedLength * ((long) 100)) / j2;
            } else {
                str3 = "MicroMsg.ChatRoomMediaUploader";
                j = 0;
            }
            if (j >= 0) {
                j3 = j > 100 ? 100 : j;
            }
            Log.m105919d(str3, "progressInfo, percent = %d, finishLen = %d, totalLen = %d", Long.valueOf(j3), Long.valueOf(cVar2.field_finishedLength), Long.valueOf(cVar2.field_toltalLength));
            ((C46794f) this.f125913d).getClass();
            Log.m105925i("MicroMsg.SendImgUtil", "onProgress, percent = %d, mediaId = %s", Integer.valueOf((int) j3), str4);
            return 0;
        } else {
            String str6 = "MicroMsg.ChatRoomMediaUploader";
            if (dVar3 != null) {
                int i3 = dVar3.field_retCode;
                if (i3 != 0) {
                    Log.m105921e(str6, "cdntra clientid:%s sceneResult.retCode:%d sceneResult[%s]", str4, Integer.valueOf(i3), dVar3);
                    ((C46794f) this.f125913d).mo72015a(false, dVar3.field_retCode, str4, dVar3);
                } else {
                    Log.m105925i(str6, "cdn trans suceess, media id : %s", str4);
                    ((C46794f) this.f125913d).mo72015a(true, 0, str4, dVar3);
                }
            }
            return 0;
        }
    }

    /* renamed from: h */
    public void mo1774h(String str, ByteArrayOutputStream byteArrayOutputStream) {
        C87412m.m108594g(str, "mediaId");
        C87412m.m108594g(byteArrayOutputStream, "buff");
    }

    /* renamed from: j */
    public byte[] mo1775j(String str, byte[] bArr) {
        C87412m.m108594g(str, "mediaId");
        C87412m.m108594g(bArr, "inbuf");
        return null;
    }
}
