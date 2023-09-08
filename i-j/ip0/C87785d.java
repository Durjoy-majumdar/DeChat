package ip0;

import androidx.exifinterface.media.ExifInterface;
import com.tencent.midas.data.APMidasPluginInfo;
import com.tencent.p014mm.plugin.appbrand.media.encode.Mp3EncodeJni;
import com.tencent.p014mm.plugin.appbrand.media.record.C83646t;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.C86013q1;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;

/* renamed from: ip0.d */
public class C87785d extends C87782b {

    /* renamed from: f */
    public byte[] f254150f;

    /* renamed from: g */
    public OutputStream f254151g;

    /* renamed from: h */
    public int f254152h = 2;

    /* renamed from: a */
    public boolean mo122234a(boolean z, byte[] bArr, int i) {
        int i2 = this.f254146b;
        if (i2 <= 0) {
            Log.m105921e("MicroMsg.Record.MP3AudioEncoder", "mMinBufferSize %d is invalid", Integer.valueOf(i2));
            return false;
        } else if (this.f254151g == null) {
            Log.m105920e("MicroMsg.Record.MP3AudioEncoder", "mFileOutputStream is null");
            return false;
        } else {
            if (this.f254150f == null) {
                int i3 = this.f254152h;
                int i4 = (int) ((((double) (i2 * i3)) * 1.25d) + 7200.0d);
                Log.m105925i("MicroMsg.Record.MP3AudioEncoder", "channelCnt:%d, mMinBufferSize:%d, size:%d, ", Integer.valueOf(i3), Integer.valueOf(this.f254146b), Integer.valueOf(i4));
                this.f254150f = new byte[i4];
            }
            int i5 = i / 2;
            short[] sArr = new short[i5];
            for (int i6 = 0; i6 < i5; i6++) {
                int i7 = i6 * 2;
                sArr[i6] = (short) (((bArr[i7 + 1] & ExifInterface.MARKER) << 8) | (bArr[i7] & ExifInterface.MARKER));
            }
            int encode = Mp3EncodeJni.encode(sArr, sArr, i5, this.f254150f);
            Log.m105919d("MicroMsg.Record.MP3AudioEncoder", "len:%d, shorts.len:%d, encodedSize:%d", Integer.valueOf(i), Integer.valueOf(i5), Integer.valueOf(encode));
            if (encode > 0) {
                Log.m105919d("MicroMsg.Record.MP3AudioEncoder", "encodeSize:%d, len:%d", Integer.valueOf(encode), Integer.valueOf(i));
                try {
                    this.f254151g.write(this.f254150f, 0, encode);
                    mo122233b(this.f254150f, encode, false);
                    return true;
                } catch (IOException e) {
                    Log.printErrStackTrace("MicroMsg.Record.MP3AudioEncoder", e, "encode write", new Object[0]);
                    C83646t.m102682a(20);
                }
            } else {
                Log.m105921e("MicroMsg.Record.MP3AudioEncoder", "Mp3EncodeJni encode fail, encodedSize:%d", Integer.valueOf(encode));
                return false;
            }
        }
    }

    public void close() {
        Log.m105924i("MicroMsg.Record.MP3AudioEncoder", "close");
        Mp3EncodeJni.close();
        OutputStream outputStream = this.f254151g;
        if (outputStream != null) {
            try {
                outputStream.close();
            } catch (IOException e) {
                Log.printErrStackTrace("MicroMsg.Record.MP3AudioEncoder", e, "close", new Object[0]);
                C83646t.m102682a(20);
            }
            this.f254151g = null;
        }
    }

    public void flush() {
        byte[] bArr;
        Log.m105924i("MicroMsg.Record.MP3AudioEncoder", "flush");
        if (this.f254151g == null || (bArr = this.f254150f) == null) {
            Log.m105920e("MicroMsg.Record.MP3AudioEncoder", "flush, mFileOutputStream or mMp3Buffer is null");
            return;
        }
        int flush = Mp3EncodeJni.flush(bArr);
        if (flush > 0) {
            try {
                this.f254151g.write(this.f254150f, 0, flush);
                mo122233b(this.f254150f, flush, true);
            } catch (IOException e) {
                Log.printErrStackTrace("MicroMsg.Record.MP3AudioEncoder", e, "flush write", new Object[0]);
                C83646t.m102682a(20);
            }
        } else {
            Log.m105921e("MicroMsg.Record.MP3AudioEncoder", "flush fail, flushResult:%d", Integer.valueOf(flush));
        }
    }

    public boolean init(String str, int i, int i2, int i3) {
        Log.m105925i("MicroMsg.Record.MP3AudioEncoder", "init, filePath:%s, sampleRate:%d, channelCount:%d, bitRate:%d", str, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3));
        this.f254152h = i2;
        int init = Mp3EncodeJni.init(i, i2, i, i3 / 1000, 5);
        Log.m105925i("MicroMsg.Record.MP3AudioEncoder", "Mp3EncodeJni.init ret :%d", Integer.valueOf(init));
        if (init == -1) {
            C83646t.m102682a(17);
            return false;
        }
        Log.m105925i("MicroMsg.Record.MP3AudioEncoder", "lame MPEG version:%d", Integer.valueOf(Mp3EncodeJni.getVersion()));
        try {
            this.f254151g = C86013q1.m106429K(str, false);
            return true;
        } catch (FileNotFoundException e) {
            Log.printErrStackTrace("MicroMsg.Record.MP3AudioEncoder", e, APMidasPluginInfo.LAUNCH_INTERFACE_INIT, new Object[0]);
            C83646t.m102682a(18);
            return false;
        }
    }
}
