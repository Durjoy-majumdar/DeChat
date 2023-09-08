package kv0;

import androidx.exifinterface.media.ExifInterface;
import com.tencent.p014mm.pointers.PByteArray;
import com.tencent.p014mm.sdk.platformtools.Log;
import gv0.C20842c;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.zip.CRC32;
import p823sg.C90194m;
import p823sg.C90196p;
import yu0.C102910f;

/* renamed from: kv0.a */
public class C88308a {
    /* renamed from: a */
    public static int m110075a(byte[] bArr, int i, short s, short s2, int i2, int i3, byte[] bArr2, PByteArray pByteArray) {
        int i4;
        String str = "";
        if (s != 1) {
            String format = String.format("unpack failed, getVersion:%d", new Object[]{Short.valueOf(s)});
            Log.m105920e("MicroMsg.BakOldPacker", format);
            pByteArray.value = format.getBytes();
            return -1;
        }
        if (C20842c.f58880n == 1) {
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                byteArrayOutputStream.write(bArr);
                byteArrayOutputStream.write(C90196p.m112888e(i));
                byteArrayOutputStream.write(new byte[]{(byte) ((s >> 8) & 255), (byte) (s & 255)});
                byteArrayOutputStream.write(new byte[]{(byte) ((s2 >> 8) & 255), (byte) (s2 & 255)});
                byteArrayOutputStream.write(C90196p.m112888e(i2));
                byteArrayOutputStream.write(C90196p.m112888e(0));
                byteArrayOutputStream.write(bArr2);
                CRC32 crc32 = new CRC32();
                crc32.update(byteArrayOutputStream.toByteArray());
                i4 = (int) crc32.getValue();
            } catch (IOException e) {
                Log.printErrStackTrace("MicroMsg.BakOldPacker", e, str, new Object[0]);
                i4 = 0;
            }
            if (i3 != i4) {
                CRC32 crc322 = new CRC32();
                crc322.update(bArr2);
                for (int length = bArr2.length > 100 ? bArr2.length - 100 : 0; length < bArr2.length; length++) {
                    str = str + Integer.toHexString(bArr2[length] & ExifInterface.MARKER) + " ";
                }
                Log.m105921e("MicroMsg.BakOldPacker", "dump errBuf: %s", str);
                String format2 = String.format("unpack failed--calcSum:%d, getfromPcMgr:%d, seq:%d, type:%d, size:%d, just buf.crc:%d, last 100 bytes:%s", new Object[]{Integer.valueOf(i4), Integer.valueOf(i3), Integer.valueOf(i), Short.valueOf(s2), Integer.valueOf(i2), Integer.valueOf((int) crc322.getValue()), str});
                Log.m105920e("MicroMsg.BakOldPacker", format2);
                pByteArray.value = format2.getBytes();
                return -2;
            }
        }
        if (!(s2 == 1 || s2 == 2)) {
            bArr2 = C90194m.m112881b(bArr2, C102910f.f303739h);
        }
        pByteArray.value = bArr2;
        return 0;
    }
}
