package go2;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: go2.b */
public class C116981b {

    /* renamed from: a */
    public ByteBuffer f350545a;

    public C116981b(ByteBuffer byteBuffer) {
        Log.m105918d("AdDeviceInfo.ua.DexParser", "buffer:" + byteBuffer.toString());
        this.f350545a = byteBuffer;
        byteBuffer.position(0);
        this.f350545a.order(ByteOrder.LITTLE_ENDIAN);
    }

    /* renamed from: a */
    public static boolean m165051a(byte[] bArr) {
        SnsMethodCalculate.markStartTimeMs("checkBytes", "com.tencent.mm.plugin.sns.ad.device.utils.ua.dex.DexParser");
        if (bArr.length < 5) {
            SnsMethodCalculate.markEndTimeMs("checkBytes", "com.tencent.mm.plugin.sns.ad.device.utils.ua.dex.DexParser");
            return false;
        } else if (bArr[0] < 53) {
            SnsMethodCalculate.markEndTimeMs("checkBytes", "com.tencent.mm.plugin.sns.ad.device.utils.ua.dex.DexParser");
            return false;
        } else {
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            int i4 = 0;
            while (i < bArr.length) {
                byte b = bArr[i];
                if (b < 48 && b != 46) {
                    SnsMethodCalculate.markEndTimeMs("checkBytes", "com.tencent.mm.plugin.sns.ad.device.utils.ua.dex.DexParser");
                    return false;
                } else if (b <= 57 || b == 46) {
                    if (i2 == 2 && b != 46) {
                        i4++;
                    }
                    if (b == 46) {
                        i2++;
                    }
                    if (i2 == 0) {
                        i3 = (i3 * 10) + (b - 48);
                    }
                    i++;
                } else {
                    SnsMethodCalculate.markEndTimeMs("checkBytes", "com.tencent.mm.plugin.sns.ad.device.utils.ua.dex.DexParser");
                    return false;
                }
            }
            if (i2 < 3 || i3 < 50 || i4 != 4) {
                SnsMethodCalculate.markEndTimeMs("checkBytes", "com.tencent.mm.plugin.sns.ad.device.utils.ua.dex.DexParser");
                return false;
            }
            SnsMethodCalculate.markEndTimeMs("checkBytes", "com.tencent.mm.plugin.sns.ad.device.utils.ua.dex.DexParser");
            return true;
        }
    }

    /* renamed from: b */
    public String mo180953b() {
        short b;
        long j;
        SnsMethodCalculate.markStartTimeMs("findChromeVer", "com.tencent.mm.plugin.sns.ad.device.utils.ua.dex.DexParser");
        ByteBuffer byteBuffer = this.f350545a;
        SnsMethodCalculate.markStartTimeMs("readBytes", "com.tencent.mm.plugin.sns.ad.device.utils.ua.dex.Buffers");
        byte[] bArr = new byte[8];
        byteBuffer.get(bArr);
        SnsMethodCalculate.markEndTimeMs("readBytes", "com.tencent.mm.plugin.sns.ad.device.utils.ua.dex.Buffers");
        String str = new String(bArr);
        if (!str.startsWith("dex\n")) {
            Log.m105918d("AdDeviceInfo.ua.DexParser", "dex magic error");
            SnsMethodCalculate.markEndTimeMs("findChromeVer", "com.tencent.mm.plugin.sns.ad.device.utils.ua.dex.DexParser");
            return "";
        }
        int i = 4;
        if (Integer.parseInt(str.substring(4, 7)) < 35) {
            Log.m105918d("AdDeviceInfo.ua.DexParser", "dex version error");
        }
        SnsMethodCalculate.markStartTimeMs("readDexHeader", "com.tencent.mm.plugin.sns.ad.device.utils.ua.dex.DexParser");
        this.f350545a.getInt();
        ByteBuffer byteBuffer2 = this.f350545a;
        SnsMethodCalculate.markStartTimeMs("readBytes", "com.tencent.mm.plugin.sns.ad.device.utils.ua.dex.Buffers");
        byteBuffer2.get(new byte[20]);
        SnsMethodCalculate.markEndTimeMs("readBytes", "com.tencent.mm.plugin.sns.ad.device.utils.ua.dex.Buffers");
        C116980a.m165050c(this.f350545a);
        SnsMethodCalculate.markStartTimeMs("setFileSize", "com.tencent.mm.plugin.sns.ad.device.utils.ua.dex.DexHeader");
        SnsMethodCalculate.markEndTimeMs("setFileSize", "com.tencent.mm.plugin.sns.ad.device.utils.ua.dex.DexHeader");
        long c = C116980a.m165050c(this.f350545a);
        SnsMethodCalculate.markStartTimeMs("setHeaderSize", "com.tencent.mm.plugin.sns.ad.device.utils.ua.dex.DexHeader");
        SnsMethodCalculate.markEndTimeMs("setHeaderSize", "com.tencent.mm.plugin.sns.ad.device.utils.ua.dex.DexHeader");
        C116980a.m165050c(this.f350545a);
        C116980a.m165050c(this.f350545a);
        SnsMethodCalculate.markStartTimeMs("setLinkSize", "com.tencent.mm.plugin.sns.ad.device.utils.ua.dex.DexHeader");
        SnsMethodCalculate.markEndTimeMs("setLinkSize", "com.tencent.mm.plugin.sns.ad.device.utils.ua.dex.DexHeader");
        C116980a.m165050c(this.f350545a);
        SnsMethodCalculate.markStartTimeMs("setLinkOff", "com.tencent.mm.plugin.sns.ad.device.utils.ua.dex.DexHeader");
        SnsMethodCalculate.markEndTimeMs("setLinkOff", "com.tencent.mm.plugin.sns.ad.device.utils.ua.dex.DexHeader");
        C116980a.m165050c(this.f350545a);
        SnsMethodCalculate.markStartTimeMs("setMapOff", "com.tencent.mm.plugin.sns.ad.device.utils.ua.dex.DexHeader");
        SnsMethodCalculate.markEndTimeMs("setMapOff", "com.tencent.mm.plugin.sns.ad.device.utils.ua.dex.DexHeader");
        int i2 = this.f350545a.getInt();
        SnsMethodCalculate.markStartTimeMs("setStringIdsSize", "com.tencent.mm.plugin.sns.ad.device.utils.ua.dex.DexHeader");
        SnsMethodCalculate.markEndTimeMs("setStringIdsSize", "com.tencent.mm.plugin.sns.ad.device.utils.ua.dex.DexHeader");
        long c2 = C116980a.m165050c(this.f350545a);
        SnsMethodCalculate.markStartTimeMs("setStringIdsOff", "com.tencent.mm.plugin.sns.ad.device.utils.ua.dex.DexHeader");
        SnsMethodCalculate.markEndTimeMs("setStringIdsOff", "com.tencent.mm.plugin.sns.ad.device.utils.ua.dex.DexHeader");
        this.f350545a.getInt();
        SnsMethodCalculate.markStartTimeMs("setTypeIdsSize", "com.tencent.mm.plugin.sns.ad.device.utils.ua.dex.DexHeader");
        SnsMethodCalculate.markEndTimeMs("setTypeIdsSize", "com.tencent.mm.plugin.sns.ad.device.utils.ua.dex.DexHeader");
        C116980a.m165050c(this.f350545a);
        SnsMethodCalculate.markStartTimeMs("setTypeIdsOff", "com.tencent.mm.plugin.sns.ad.device.utils.ua.dex.DexHeader");
        SnsMethodCalculate.markEndTimeMs("setTypeIdsOff", "com.tencent.mm.plugin.sns.ad.device.utils.ua.dex.DexHeader");
        this.f350545a.getInt();
        SnsMethodCalculate.markStartTimeMs("setProtoIdsSize", "com.tencent.mm.plugin.sns.ad.device.utils.ua.dex.DexHeader");
        SnsMethodCalculate.markEndTimeMs("setProtoIdsSize", "com.tencent.mm.plugin.sns.ad.device.utils.ua.dex.DexHeader");
        C116980a.m165050c(this.f350545a);
        SnsMethodCalculate.markStartTimeMs("setProtoIdsOff", "com.tencent.mm.plugin.sns.ad.device.utils.ua.dex.DexHeader");
        SnsMethodCalculate.markEndTimeMs("setProtoIdsOff", "com.tencent.mm.plugin.sns.ad.device.utils.ua.dex.DexHeader");
        this.f350545a.getInt();
        SnsMethodCalculate.markStartTimeMs("setFieldIdsSize", "com.tencent.mm.plugin.sns.ad.device.utils.ua.dex.DexHeader");
        SnsMethodCalculate.markEndTimeMs("setFieldIdsSize", "com.tencent.mm.plugin.sns.ad.device.utils.ua.dex.DexHeader");
        C116980a.m165050c(this.f350545a);
        SnsMethodCalculate.markStartTimeMs("setFieldIdsOff", "com.tencent.mm.plugin.sns.ad.device.utils.ua.dex.DexHeader");
        SnsMethodCalculate.markEndTimeMs("setFieldIdsOff", "com.tencent.mm.plugin.sns.ad.device.utils.ua.dex.DexHeader");
        this.f350545a.getInt();
        SnsMethodCalculate.markStartTimeMs("setMethodIdsSize", "com.tencent.mm.plugin.sns.ad.device.utils.ua.dex.DexHeader");
        SnsMethodCalculate.markEndTimeMs("setMethodIdsSize", "com.tencent.mm.plugin.sns.ad.device.utils.ua.dex.DexHeader");
        C116980a.m165050c(this.f350545a);
        SnsMethodCalculate.markStartTimeMs("setMethodIdsOff", "com.tencent.mm.plugin.sns.ad.device.utils.ua.dex.DexHeader");
        SnsMethodCalculate.markEndTimeMs("setMethodIdsOff", "com.tencent.mm.plugin.sns.ad.device.utils.ua.dex.DexHeader");
        this.f350545a.getInt();
        SnsMethodCalculate.markStartTimeMs("setClassDefsSize", "com.tencent.mm.plugin.sns.ad.device.utils.ua.dex.DexHeader");
        SnsMethodCalculate.markEndTimeMs("setClassDefsSize", "com.tencent.mm.plugin.sns.ad.device.utils.ua.dex.DexHeader");
        C116980a.m165050c(this.f350545a);
        SnsMethodCalculate.markStartTimeMs("setClassDefsOff", "com.tencent.mm.plugin.sns.ad.device.utils.ua.dex.DexHeader");
        SnsMethodCalculate.markEndTimeMs("setClassDefsOff", "com.tencent.mm.plugin.sns.ad.device.utils.ua.dex.DexHeader");
        this.f350545a.getInt();
        SnsMethodCalculate.markStartTimeMs("setDataSize", "com.tencent.mm.plugin.sns.ad.device.utils.ua.dex.DexHeader");
        SnsMethodCalculate.markEndTimeMs("setDataSize", "com.tencent.mm.plugin.sns.ad.device.utils.ua.dex.DexHeader");
        C116980a.m165050c(this.f350545a);
        SnsMethodCalculate.markStartTimeMs("setDataOff", "com.tencent.mm.plugin.sns.ad.device.utils.ua.dex.DexHeader");
        SnsMethodCalculate.markEndTimeMs("setDataOff", "com.tencent.mm.plugin.sns.ad.device.utils.ua.dex.DexHeader");
        ByteBuffer byteBuffer3 = this.f350545a;
        SnsMethodCalculate.markStartTimeMs("getHeaderSize", "com.tencent.mm.plugin.sns.ad.device.utils.ua.dex.DexHeader");
        SnsMethodCalculate.markEndTimeMs("getHeaderSize", "com.tencent.mm.plugin.sns.ad.device.utils.ua.dex.DexHeader");
        C116980a.m165048a(byteBuffer3, c);
        SnsMethodCalculate.markEndTimeMs("readDexHeader", "com.tencent.mm.plugin.sns.ad.device.utils.ua.dex.DexParser");
        SnsMethodCalculate.markStartTimeMs("getStringIdsOff", "com.tencent.mm.plugin.sns.ad.device.utils.ua.dex.DexHeader");
        SnsMethodCalculate.markEndTimeMs("getStringIdsOff", "com.tencent.mm.plugin.sns.ad.device.utils.ua.dex.DexHeader");
        SnsMethodCalculate.markStartTimeMs("getStringIdsSize", "com.tencent.mm.plugin.sns.ad.device.utils.ua.dex.DexHeader");
        SnsMethodCalculate.markEndTimeMs("getStringIdsSize", "com.tencent.mm.plugin.sns.ad.device.utils.ua.dex.DexHeader");
        long j2 = (long) i2;
        if (j2 > 50000) {
            j2 = 50000;
        }
        Log.m105920e("AdDeviceInfo.ua.DexParser", "stringIdsOff: " + c2 + ", size:" + j2);
        int i3 = 0;
        while (((long) i3) < j2) {
            C116980a.m165048a(this.f350545a, ((long) (i3 * 4)) + c2);
            C116980a.m165048a(this.f350545a, C116980a.m165050c(this.f350545a));
            SnsMethodCalculate.markStartTimeMs("readString", "com.tencent.mm.plugin.sns.ad.device.utils.ua.dex.DexParser");
            SnsMethodCalculate.markStartTimeMs("readVarInts", "com.tencent.mm.plugin.sns.ad.device.utils.ua.dex.DexParser");
            int i4 = 0;
            int i5 = 0;
            do {
                if (i4 > i) {
                    Log.m105918d("AdDeviceInfo.ua.DexParser", "readVarInts count error!");
                }
                b = C116980a.m165049b(this.f350545a);
                i5 |= (b & 127) << (i4 * 7);
                i4++;
            } while ((b & 128) != 0);
            SnsMethodCalculate.markEndTimeMs("readVarInts", "com.tencent.mm.plugin.sns.ad.device.utils.ua.dex.DexParser");
            SnsMethodCalculate.markStartTimeMs("readString", "com.tencent.mm.plugin.sns.ad.device.utils.ua.dex.DexParser");
            char[] cArr = new char[i5];
            int i6 = 0;
            while (i6 < i5) {
                short b2 = C116980a.m165049b(this.f350545a);
                if ((b2 & 128) == 0) {
                    cArr[i6] = (char) b2;
                    j = j2;
                } else {
                    j = j2;
                    if ((b2 & 224) == 192) {
                        cArr[i6] = (char) ((C116980a.m165049b(this.f350545a) & 63) | ((b2 & 31) << 6));
                    } else if ((b2 & 240) == 224) {
                        cArr[i6] = (char) (((C116980a.m165049b(this.f350545a) & 63) << 6) | ((b2 & 15) << 12) | (C116980a.m165049b(this.f350545a) & 63));
                    }
                }
                char c3 = cArr[i6];
                i6++;
                j2 = j;
            }
            long j3 = j2;
            String str2 = new String(cArr);
            SnsMethodCalculate.markEndTimeMs("readString", "com.tencent.mm.plugin.sns.ad.device.utils.ua.dex.DexParser");
            SnsMethodCalculate.markEndTimeMs("readString", "com.tencent.mm.plugin.sns.ad.device.utils.ua.dex.DexParser");
            SnsMethodCalculate.markStartTimeMs("checkStr", "com.tencent.mm.plugin.sns.ad.device.utils.ua.dex.DexParser");
            boolean a = m165051a(str2.getBytes());
            SnsMethodCalculate.markEndTimeMs("checkStr", "com.tencent.mm.plugin.sns.ad.device.utils.ua.dex.DexParser");
            if (a) {
                Log.m105920e("AdDeviceInfo.ua.DexParser", "check true: " + str2);
                SnsMethodCalculate.markEndTimeMs("findChromeVer", "com.tencent.mm.plugin.sns.ad.device.utils.ua.dex.DexParser");
                return str2;
            }
            i3++;
            j2 = j3;
            i = 4;
        }
        Log.m105920e("AdDeviceInfo.ua.DexParser", "not found chrome version");
        SnsMethodCalculate.markEndTimeMs("findChromeVer", "com.tencent.mm.plugin.sns.ad.device.utils.ua.dex.DexParser");
        return "";
    }
}
