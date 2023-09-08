package com.tencent.p014mm.plugin.voip.model;

import android.os.ConditionVariable;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import l33.C109247e;
import lu3.C88654b;

/* renamed from: com.tencent.mm.plugin.voip.model.y$$e */
public class y$$e extends C88654b {

    /* renamed from: e */
    public ConditionVariable f317738e = new ConditionVariable();

    /* renamed from: f */
    public boolean f317739f = false;

    /* renamed from: g */
    public boolean f317740g = false;

    /* renamed from: h */
    public byte[] f317741h = null;

    /* renamed from: i */
    public ByteBuffer f317742i = null;

    /* renamed from: j */
    public int f317743j = 0;

    /* renamed from: n */
    public int f317744n = 0;

    /* renamed from: o */
    public final /* synthetic */ C106400y f317745o;

    public y$$e(C106400y yVar) {
        this.f317745o = yVar;
    }

    public String getKey() {
        return "stop_video_decode_runnable";
    }

    public void run() {
        int i;
        boolean z;
        C106393s0 s0Var;
        boolean z2;
        try {
            if (!this.f317740g) {
                long currentTimeMillis = System.currentTimeMillis();
                if (this.f317745o.f317711d.mo152716s()) {
                    if (this.f317742i == null) {
                        v2protocal v2protocal = this.f317745o.f317711d.f317500x;
                        ByteBuffer order = ByteBuffer.allocateDirect((v2protocal.f317623c + 64) * (v2protocal.f317626d + 64) * 4).order(ByteOrder.nativeOrder());
                        this.f317742i = order;
                        order.position(0);
                        this.f317741h = new byte[this.f317742i.remaining()];
                        Log.m105925i("MicroMsg.Voip.VoipDeviceHandler.VideoRunnable", "init remoteImageByteBuffer, defaultWidth:%s, defaultHeight:%s", Integer.valueOf(this.f317745o.f317711d.f317500x.f317623c), Integer.valueOf(this.f317745o.f317711d.f317500x.f317626d));
                    }
                    ByteBuffer byteBuffer = this.f317742i;
                    if (byteBuffer != null) {
                        byteBuffer.clear();
                        i = this.f317745o.f317711d.f317500x.videoDecodeBB(this.f317742i);
                    } else {
                        i = 0;
                    }
                    if (i == 1) {
                        int i2 = this.f317743j + 1;
                        this.f317743j = i2;
                        v2protocal v2protocal2 = this.f317745o.f317711d.f317500x;
                        int i3 = v2protocal2.field_remoteImgWidth;
                        int i4 = v2protocal2.field_remoteImgHeight;
                        int i5 = v2protocal2.field_remoteImgOrien;
                        if (this.f317744n != i5) {
                            this.f317744n = i5;
                            z = true;
                        } else {
                            z = false;
                        }
                        boolean z3 = i3 == 0 && i4 < 3;
                        if (i2 % 200 == 10) {
                            Log.m105925i("MicroMsg.Voip.VoipDeviceHandler.VideoRunnable", "steve: dec statistics: total:%d, soft:%d, size:%dx%d, HW:%b", Integer.valueOf(i2), Integer.valueOf(this.f317745o.f317711d.f317500x.f317682v1), Integer.valueOf(i3), Integer.valueOf(i4), Boolean.valueOf(z3));
                        }
                        if (z3) {
                            if (!this.f317739f) {
                                C106400y yVar = this.f317745o;
                                int i6 = yVar.f317719l | 1;
                                yVar.f317719l = i6;
                                yVar.f317711d.f317502z.mo152475k0(i6);
                                Log.m105924i("MicroMsg.Voip.VoipDeviceHandler.VideoRunnable", "steve: change to HW dec, restart decoder!");
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            if (v2protocal.f317544e2 != null) {
                                try {
                                    int i7 = this.f317745o.f317711d.f317500x.field_remoteImgLength;
                                    Log.m105918d("MicroMsg.Voip.VoipDeviceHandler.VideoRunnable", "steve:video decode successfully!..len=" + i7);
                                    int i8 = this.f317745o.f317711d.f317500x.field_remoteImgHeight;
                                    byte[] bArr = new byte[i7];
                                    System.arraycopy(this.f317742i.array(), this.f317742i.arrayOffset(), bArr, 0, i7);
                                    if (v2protocal.f317544e2.mo152556b(bArr, i8, true, z2) == 0) {
                                        this.f317745o.f317711d.f317502z.mo152474j0(true);
                                    }
                                    long currentTimeMillis2 = System.currentTimeMillis();
                                    Log.m105918d("MicroMsg.Voip.VoipDeviceHandler.VideoRunnable", "steve: fill in AvcDecoder take time = " + (currentTimeMillis2 - currentTimeMillis) + ", startTime = " + currentTimeMillis);
                                    if (z) {
                                        this.f317745o.f317711d.f317502z.mo149984G(i5);
                                    }
                                } catch (Exception e) {
                                    Log.m105920e("EncodeDecode", "interrupted while waiting");
                                    Log.m105920e("MicroMsg.Voip.VoipDeviceHandler.VideoRunnable", " error:" + e);
                                }
                            }
                        } else {
                            if (this.f317739f) {
                                C106400y yVar2 = this.f317745o;
                                int i9 = yVar2.f317719l & -2;
                                yVar2.f317719l = i9;
                                C106339e eVar = v2protocal.f317544e2;
                                if (eVar != null) {
                                    eVar.f317235j = false;
                                }
                                yVar2.f317711d.f317502z.mo152475k0(i9);
                                Log.m105924i("MicroMsg.Voip.VoipDeviceHandler.VideoRunnable", "steve: change to SW dec");
                            }
                            C106400y yVar3 = this.f317745o;
                            C106377r rVar = yVar3.f317711d;
                            v2protocal v2protocal3 = rVar.f317500x;
                            int i15 = v2protocal3.field_remoteImgLength;
                            if (i15 > 0 && (s0Var = rVar.f317502z) != null) {
                                v2protocal3.f317682v1++;
                                int i16 = ((i3 * i4) * 3) / 2;
                                if (yVar3.f317701E) {
                                    System.arraycopy(this.f317742i.array(), this.f317742i.arrayOffset(), this.f317741h, 0, i16);
                                    this.f317745o.f317711d.f317502z.mo152498z0(i3, i4, i15 / 4, this.f317741h);
                                } else {
                                    s0Var.mo152493u0(i3, i4, i15 / 4, this.f317742i);
                                }
                                this.f317745o.f317711d.f317502z.mo152474j0(false);
                                if (z) {
                                    this.f317745o.f317711d.f317502z.mo149984G(i5);
                                }
                            }
                        }
                        this.f317739f = z3;
                    }
                } else {
                    i = 0;
                }
                if (i != 1) {
                    if (this.f317738e.block(10) && this.f317740g) {
                        return;
                    }
                } else if (this.f317740g) {
                    return;
                }
                C106400y yVar4 = this.f317745o;
                if (yVar4.f317703G == null) {
                    return;
                }
                if (yVar4.f317701E && C109247e.vx0().mo163047a(3) != null) {
                    C109247e.vx0().mo163047a(3).mo162868b(this.f317745o.f317703G);
                } else if (C109247e.vx0().mo163047a(1) != null) {
                    C109247e.vx0().mo163047a(1).mo162868b(this.f317745o.f317703G);
                } else {
                    Log.m105920e("MicroMsg.Voip.VoipDeviceHandler.VideoRunnable", "video decode failed cause thread end");
                }
            }
        } catch (Exception e2) {
            Log.printErrStackTrace("MicroMsg.Voip.VoipDeviceHandler.VideoRunnable", e2, "", new Object[0]);
        }
    }
}
