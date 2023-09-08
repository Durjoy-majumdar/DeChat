package n71;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MD5Util;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.wxmm.v2encoder;
import d81.C45288e;
import eb0.C75592q0;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;
import java.util.zip.CRC32;
import p156gj.C87200o;
import pe3.C47465a;
import qe3.C89625d;
import s71.C48245e;
import s71.C48246f;
import s71.C48247g;

/* renamed from: n71.e */
public class C47174e extends C47173d {
    public C47174e(long j, int i, int i2, byte[] bArr) {
        super(j, i, i2, bArr);
        Log.m105924i("MicroMsg.exdevice.ExDeviceCmdInit", "onDeviceRequest deviceId = " + j + " seq = " + i + " cmdId = " + i2);
    }

    /* renamed from: d */
    public C47465a mo72248d(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            Log.m105920e("MicroMsg.exdevice.ExDeviceCmdInit", "data is null");
            return null;
        }
        C48246f fVar = new C48246f();
        try {
            fVar.parseFrom(bArr);
            Log.m105924i("MicroMsg.exdevice.ExDeviceCmdInit", "------Init Request parse is ok------ ");
            this.f126723e = fVar;
            return fVar;
        } catch (IOException e) {
            Log.m105920e("MicroMsg.exdevice.ExDeviceCmdInit", "pase error : " + e.getMessage());
            Log.printErrStackTrace("MicroMsg.exdevice.ExDeviceCmdInit", e, "", new Object[0]);
            return null;
        }
    }

    /* renamed from: e */
    public void mo72253e(int i, String str, byte[] bArr, byte[] bArr2, int i2, int i3) {
        int[] iArr;
        int i4;
        long j;
        int i5;
        byte[] bArr3 = bArr2;
        Log.m105925i("MicroMsg.exdevice.ExDeviceCmdInit", "------initResponse------ errorCode = %d, errMsg = %s, filter = %s, challenge = %s, initScene = %d, second = %d", Integer.valueOf(i), str, C45288e.m50130a(bArr), C45288e.m50130a(bArr2), Integer.valueOf(i2), Integer.valueOf(i3));
        C48247g gVar = new C48247g();
        C48245e eVar = new C48245e();
        this.f126721c = eVar;
        eVar.f129247d = 0;
        eVar.f129248e = "ok";
        gVar.f129267d = eVar;
        String s = C75592q0.m90789s();
        if (!Util.isNullOrNil(s)) {
            String lowerCase = MD5Util.getMD5String(s).toLowerCase();
            Log.m105925i("MicroMsg.exdevice.Util", "user md5 : [%s]", lowerCase);
            if (Util.isNullOrNil(lowerCase)) {
                Log.m105920e("MicroMsg.exdevice.Util", "get hash code failed, value is null or nill");
                j = 0;
            } else {
                char[] charArray = lowerCase.toCharArray();
                if (charArray.length > 0) {
                    i5 = 0;
                    for (char c : charArray) {
                        i5 = (i5 * 31) + c;
                    }
                } else {
                    i5 = 0;
                }
                long j2 = ((long) i5) & Util.MAX_32BIT_VALUE;
                Log.m105925i("MicroMsg.exdevice.Util", "get int hashcode value = %d, long hashcode = %d", Integer.valueOf(i5), Long.valueOf(j2));
                j = j2;
            }
            iArr = new int[]{(int) ((j >> 32) & Util.MAX_32BIT_VALUE), (int) (j & Util.MAX_32BIT_VALUE)};
        } else {
            iArr = null;
        }
        gVar.f129251e = iArr[0];
        gVar.f129252f = iArr[1];
        if (!Util.isNullOrNil(bArr2)) {
            if (bArr3 == null || bArr3.length == 0) {
                i4 = 0;
            } else {
                CRC32 crc32 = new CRC32();
                crc32.update(bArr3);
                i4 = (int) crc32.getValue();
            }
            gVar.f129253g = i4;
        }
        if (!Util.isNullOrNil(bArr)) {
            byte b = bArr[0];
            if ((b & 4) != 0) {
                gVar.f129258o = C89625d.f257837c;
            }
            if ((b & 8) != 0) {
                int i6 = C89625d.f257835a;
                gVar.f129259p = C87200o.f252873f;
            }
            if ((b & 2) != 0) {
                gVar.f129257n = 2;
            }
            if ((b & v2encoder.enumCODEC_vcodec2) != 0) {
                gVar.f129260q = (int) Util.nowSecond();
            }
            if ((bArr[0] & 32) != 0) {
                TimeZone timeZone = TimeZone.getDefault();
                int rawOffset = timeZone.getRawOffset() / 1000;
                int i7 = (!timeZone.useDaylightTime() || !timeZone.inDaylightTime(new Date(System.currentTimeMillis()))) ? 0 : 1;
                int i8 = (rawOffset / 3600) + i7;
                Log.m105925i("MicroMsg.exdevice.Util", "getTimeZone, rawSecond = %d, dt = %d, re = %d", Integer.valueOf(rawOffset), Integer.valueOf(i7), Integer.valueOf(i8));
                gVar.f129261r = i8;
            }
            if ((bArr[0] & 64) != 0) {
                String format = new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());
                int i9 = 7;
                try {
                    int i15 = Util.getInt(String.valueOf(Calendar.getInstance().get(7)), 0);
                    if (i15 != 1) {
                        i9 = i15 - 1;
                    }
                } catch (Exception e) {
                    Log.m105921e("MicroMsg.exdevice.Util", "parse day failed : %s", e.getMessage());
                    i9 = 0;
                }
                gVar.f129262s = format + i9;
            }
            if ((bArr[0] & 1) != 0) {
                gVar.f129256j = C75592q0.m90783m();
            }
        }
        gVar.f129254h = i2;
        gVar.f129255i = i3;
        this.f126722d = gVar;
        this.f126720b = 20003;
    }
}
