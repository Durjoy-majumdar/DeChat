package n71;

import com.tencent.p014mm.sdk.platformtools.Log;
import java.io.IOException;
import pe3.C47465a;

/* renamed from: n71.d */
public abstract class C47173d extends C47172c {

    /* renamed from: e */
    public C47465a f126723e = null;

    /* renamed from: f */
    public short f126724f = -1;

    /* renamed from: g */
    public short f126725g = -1;

    public C47173d(long j, int i, int i2, byte[] bArr) {
        Log.m105924i("MicroMsg.exdevice.ExDeviceCmdBaseReqResp", "onDeviceRequest deviceId = " + j + " seq = " + i + " cmdId = " + i2);
        this.f126719a = j;
        this.f126724f = (short) i2;
        this.f126725g = (short) i;
        mo72248d(bArr);
    }

    /* renamed from: a */
    public final short mo72250a() {
        return this.f126725g;
    }

    /* renamed from: b */
    public final short mo72251b() {
        return this.f126724f;
    }

    /* renamed from: c */
    public byte[] mo72252c() {
        try {
            return this.f126722d.toByteArray();
        } catch (IOException e) {
            Log.m105921e("MicroMsg.exdevice.ExDeviceCmdBaseReqResp", "mResp.toByteArray() Failed!!! %s", e.getMessage());
            Log.printErrStackTrace("MicroMsg.exdevice.ExDeviceCmdBaseReqResp", e, "", new Object[0]);
            return null;
        }
    }

    /* renamed from: d */
    public abstract C47465a mo72248d(byte[] bArr);
}
