package p827uh;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.C86013q1;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: uh.b */
public class C90662b {

    /* renamed from: a */
    public String f260481a;

    /* renamed from: b */
    public OutputStream f260482b;

    /* renamed from: c */
    public int f260483c;

    public C90662b(String str, int i, int i2, int i3) {
        this.f260481a = str;
        try {
            this.f260482b = C86013q1.m106429K(str, false);
            ByteBuffer allocate = ByteBuffer.allocate(44);
            allocate.order(ByteOrder.LITTLE_ENDIAN);
            allocate.putInt(1179011410);
            allocate.putInt(0);
            allocate.putInt(1163280727);
            allocate.putInt(544501094);
            int i4 = 16;
            allocate.putInt(16);
            int i5 = 1;
            allocate.putShort(1);
            allocate.putShort((short) i);
            allocate.putInt(i2);
            allocate.putInt(i2 * i * (i3 == 2 ? 2 : 1));
            allocate.putShort((short) (i * (i3 == 2 ? 2 : i5)));
            if (i3 != 2) {
                i4 = 8;
            }
            allocate.putShort((short) i4);
            allocate.putInt(1635017060);
            allocate.putInt(0);
            this.f260483c = 44;
            this.f260482b.write(allocate.array());
        } catch (IOException e) {
            Log.m105920e("MicroMsg.PcmWriter", "create file failed: " + e.getMessage());
        }
    }

    /* renamed from: a */
    public void mo124805a() {
        try {
            this.f260482b.close();
        } catch (IOException e) {
            Log.m105920e("MicroMsg.PcmWriter", "close file failed: " + e.getMessage());
        }
        RandomAccessFile randomAccessFile = null;
        try {
            randomAccessFile = C86013q1.m106420B(this.f260481a, true);
            randomAccessFile.seek(4);
            ByteBuffer allocate = ByteBuffer.allocate(4);
            allocate.order(ByteOrder.LITTLE_ENDIAN);
            allocate.putInt(this.f260483c - 8);
            randomAccessFile.write(allocate.array());
            allocate.rewind();
            allocate.putInt(this.f260483c - 42);
            randomAccessFile.seek(40);
            randomAccessFile.write(allocate.array());
            try {
                randomAccessFile.close();
            } catch (IOException e2) {
                Log.printErrStackTrace("MicroMsg.PcmWriter", e2, "", new Object[0]);
            }
        } catch (FileNotFoundException e3) {
            Log.printErrStackTrace("MicroMsg.PcmWriter", e3, "", new Object[0]);
            if (randomAccessFile != null) {
                try {
                    randomAccessFile.close();
                } catch (IOException e4) {
                    Log.printErrStackTrace("MicroMsg.PcmWriter", e4, "", new Object[0]);
                }
            }
        } catch (IOException e5) {
            Log.printErrStackTrace("MicroMsg.PcmWriter", e5, "", new Object[0]);
            if (randomAccessFile != null) {
                try {
                    randomAccessFile.close();
                } catch (IOException e6) {
                    Log.printErrStackTrace("MicroMsg.PcmWriter", e6, "", new Object[0]);
                }
            }
        } catch (Throwable th) {
            if (randomAccessFile != null) {
                try {
                    randomAccessFile.close();
                } catch (IOException e7) {
                    Log.printErrStackTrace("MicroMsg.PcmWriter", e7, "", new Object[0]);
                }
            }
            throw th;
        }
    }

    /* renamed from: b */
    public boolean mo124806b(byte[] bArr, int i) {
        OutputStream outputStream = this.f260482b;
        if (outputStream == null) {
            return false;
        }
        try {
            outputStream.write(bArr, 0, i);
            this.f260483c += i;
            return true;
        } catch (Exception e) {
            Log.m105920e("MicroMsg.PcmWriter", "write to file failed: " + e.getMessage());
            return false;
        }
    }
}
