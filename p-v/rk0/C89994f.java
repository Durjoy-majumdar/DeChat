package rk0;

import android.os.ParcelUuid;
import androidx.exifinterface.media.ExifInterface;
import com.tencent.wxmm.v2encoder;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.UUID;

/* renamed from: rk0.f */
public class C89994f {

    /* renamed from: a */
    public static final ParcelUuid f258571a = ParcelUuid.fromString("00000000-0000-1000-8000-00805F9B34FB");

    static {
        ParcelUuid.fromString("0000110B-0000-1000-8000-00805F9B34FB");
        ParcelUuid.fromString("0000110A-0000-1000-8000-00805F9B34FB");
        ParcelUuid.fromString("0000110D-0000-1000-8000-00805F9B34FB");
        ParcelUuid.fromString("00001108-0000-1000-8000-00805F9B34FB");
        ParcelUuid.fromString("00001112-0000-1000-8000-00805F9B34FB");
        ParcelUuid.fromString("0000111E-0000-1000-8000-00805F9B34FB");
        ParcelUuid.fromString("0000111F-0000-1000-8000-00805F9B34FB");
        ParcelUuid.fromString("0000110E-0000-1000-8000-00805F9B34FB");
        ParcelUuid.fromString("0000110C-0000-1000-8000-00805F9B34FB");
        ParcelUuid.fromString("00001105-0000-1000-8000-00805f9b34fb");
        ParcelUuid.fromString("00001124-0000-1000-8000-00805f9b34fb");
        ParcelUuid.fromString("00001812-0000-1000-8000-00805f9b34fb");
        ParcelUuid.fromString("00001115-0000-1000-8000-00805F9B34FB");
        ParcelUuid.fromString("00001116-0000-1000-8000-00805F9B34FB");
        ParcelUuid.fromString("0000000f-0000-1000-8000-00805F9B34FB");
        ParcelUuid.fromString("0000112f-0000-1000-8000-00805F9B34FB");
        ParcelUuid.fromString("00001134-0000-1000-8000-00805F9B34FB");
        ParcelUuid.fromString("00001133-0000-1000-8000-00805F9B34FB");
        ParcelUuid.fromString("00001132-0000-1000-8000-00805F9B34FB");
    }

    /* renamed from: a */
    public static ParcelUuid m112585a(byte[] bArr) {
        long j;
        if (bArr != null) {
            int length = bArr.length;
            if (length != 2 && length != 4 && length != 16) {
                throw new IllegalArgumentException("uuidBytes length invalid - " + length);
            } else if (length == 16) {
                ByteBuffer order = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                return new ParcelUuid(new UUID(order.getLong(8), order.getLong(0)));
            } else {
                if (length == 2) {
                    j = ((long) (bArr[0] & ExifInterface.MARKER)) + ((long) ((bArr[1] & ExifInterface.MARKER) << 8));
                } else {
                    j = ((long) ((bArr[3] & ExifInterface.MARKER) << 24)) + ((long) (bArr[0] & ExifInterface.MARKER)) + ((long) ((bArr[1] & ExifInterface.MARKER) << 8)) + ((long) ((bArr[2] & ExifInterface.MARKER) << v2encoder.enumCODEC_vcodec2));
                }
                ParcelUuid parcelUuid = f258571a;
                return new ParcelUuid(new UUID(parcelUuid.getUuid().getMostSignificantBits() + (j << 32), parcelUuid.getUuid().getLeastSignificantBits()));
            }
        } else {
            throw new IllegalArgumentException("uuidBytes cannot be null");
        }
    }
}
