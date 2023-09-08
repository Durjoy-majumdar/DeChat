package i72;

import com.tencent.p014mm.sdk.platformtools.Log;
import java.nio.ByteBuffer;

/* renamed from: i72.a */
public class C98606a {
    /* renamed from: a */
    public static void m128204a(ByteBuffer byteBuffer, int i, int i2, int i3, int i4, int i5) {
        Log.m105919d("MicroMsg.ADTSUtils", "addADTStoPacket params: %d, %d, %d, %d", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5));
        int b = m128205b(i4);
        byteBuffer.put(i, (byte) -1);
        byteBuffer.put(i + 1, (byte) -7);
        byteBuffer.put(i + 2, (byte) (((i3 - 1) << 6) + (b << 2) + (i5 >> 2)));
        byteBuffer.put(i + 3, (byte) (((i5 & 3) << 6) + (i2 >> 11)));
        byteBuffer.put(i + 4, (byte) ((i2 & 2047) >> 3));
        byteBuffer.put(i + 5, (byte) (((i2 & 7) << 5) + 31));
        byteBuffer.put(i + 6, (byte) -4);
    }

    /* renamed from: b */
    public static int m128205b(int i) {
        switch (i) {
            case 7350:
                return 12;
            case 8000:
                return 11;
            case 11025:
                return 10;
            case 12000:
                return 9;
            case 22050:
                return 7;
            case 24000:
                return 6;
            case 32000:
                return 5;
            case 44100:
                return 4;
            case 48000:
                return 3;
            case 64000:
                return 2;
            case 88200:
                return 1;
            case 96000:
                return 0;
            default:
                return 8;
        }
    }
}
