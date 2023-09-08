package n73;

import com.tencent.p014mm.plugin.wear.model.C43457b;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: n73.t */
public class C47205t {

    /* renamed from: a */
    public static AtomicInteger f126761a = new AtomicInteger();

    /* renamed from: a */
    public void mo72269a(int i) {
        mo72270b(i, (byte[]) null, false);
    }

    /* renamed from: b */
    public void mo72270b(int i, byte[] bArr, boolean z) {
        if (z) {
            bArr = C43457b.xx0().mo176381b(bArr);
        }
        int incrementAndGet = f126761a.incrementAndGet();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        try {
            dataOutputStream.writeInt(0);
            dataOutputStream.writeInt(incrementAndGet);
            dataOutputStream.writeInt(i);
            if (bArr == null || bArr.length <= 0) {
                dataOutputStream.writeInt(0);
            } else {
                dataOutputStream.writeInt(bArr.length);
                dataOutputStream.write(bArr);
            }
            C43457b.xx0().mo176384e(byteArrayOutputStream.toByteArray());
        } catch (IOException e) {
            Log.printErrStackTrace("MicroMsg.Wear.WearPushServerLogic", e, "gen response data error connectType=%d, sessionId=%d, funId=%d", 0, Integer.valueOf(incrementAndGet), Integer.valueOf(i));
        }
    }
}
