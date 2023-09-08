package w41;

import androidx.exifinterface.media.ExifInterface;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.ByteBuffer;
import java.util.Properties;
import p1054vg.C118674k;

/* renamed from: w41.c */
public class C118748c {

    /* renamed from: c */
    public static final C118674k f355283c = new C118674k(38650);

    /* renamed from: a */
    public Properties f355284a = new Properties();

    /* renamed from: b */
    public byte[] f355285b;

    /* renamed from: a */
    public void mo183476a(byte[] bArr) {
        if (bArr == null) {
            Log.m105928w("MicroMsg.Channel.GameComment", "decode, data is null");
            return;
        }
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        C118674k kVar = f355283c;
        byte[] bArr2 = new byte[2];
        wrap.get(bArr2);
        if (!kVar.equals(new C118674k(bArr2))) {
            Log.m105920e("MicroMsg.Channel.GameComment", "decode, unknow protocol");
        }
        if (bArr.length - 2 <= 2) {
            Log.m105920e("MicroMsg.Channel.GameComment", "decode, data.length - headLength <= 2");
            return;
        }
        byte[] bArr3 = new byte[2];
        wrap.get(bArr3);
        int i = ((bArr3[1] << 8) & 65280) + (bArr3[0] & ExifInterface.MARKER);
        if ((bArr.length - 2) - 2 < i) {
            Log.m105920e("MicroMsg.Channel.GameComment", "decode, cooment content is empty");
            return;
        }
        byte[] bArr4 = new byte[i];
        wrap.get(bArr4);
        try {
            this.f355284a.load(new InputStreamReader(new ByteArrayInputStream(bArr4), "UTF-8"));
        } catch (IOException unused) {
        }
        int length = ((bArr.length - 2) - i) - 2;
        if (length > 0) {
            byte[] bArr5 = new byte[length];
            this.f355285b = bArr5;
            wrap.get(bArr5);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("GameComment [p=");
        sb.append(this.f355284a);
        sb.append(", otherData=");
        byte[] bArr = this.f355285b;
        sb.append(bArr == null ? "" : new String(bArr));
        sb.append("]");
        return sb.toString();
    }
}
