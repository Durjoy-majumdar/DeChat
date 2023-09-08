package com.tencent.p014mm.plugin.multitalk.ilinkservice;

import com.tencent.p014mm.plugin.multitalk.model.C105851w0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.wxmm.v2conference;
import lu3.C109426i;

/* renamed from: com.tencent.mm.plugin.multitalk.ilinkservice.q2 */
public class C105682q2 implements C109426i {

    /* renamed from: d */
    public byte[] f314235d = new byte[1];

    /* renamed from: e */
    public final /* synthetic */ C105697s2 f314236e;

    public C105682q2(C105697s2 s2Var) {
        this.f314236e = s2Var;
    }

    public String getKey() {
        return "iLinkVideoMgr.DecodeTimerTask";
    }

    public boolean isLogging() {
        return false;
    }

    public void run() {
        boolean z;
        while (true) {
            try {
                C105697s2 s2Var = this.f314236e;
                synchronized (s2Var) {
                    z = s2Var.f314275f;
                }
                if (z) {
                    C105724z zVar = C105724z.INSTANCE;
                    byte[] bArr = this.f314235d;
                    zVar.getClass();
                    int GetDecodeVideoData = C105714w.f314302c.GetDecodeVideoData(bArr, 0);
                    v2conference v2conference = C105714w.f314302c;
                    int i = v2conference.field_remoteImgLength;
                    int i2 = v2conference.field_remoteImgHeight;
                    int i3 = v2conference.field_remoteImgWidth;
                    int i4 = v2conference.field_remoteImgMember;
                    if (GetDecodeVideoData == -100) {
                        int i5 = i3 * i2 * 4;
                        Log.m105924i("MicroMsg.Multitalk.ILinkVideoMgr", "realloc buffer, new size: " + i5);
                        this.f314235d = new byte[i5];
                    } else {
                        C105697s2 s2Var2 = this.f314236e;
                        int i6 = s2Var2.f314271b + 1;
                        s2Var2.f314271b = i6;
                        if (i6 % 100 == 0) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("GetVideo,  ret:");
                            sb.append(GetDecodeVideoData);
                            sb.append(", len:");
                            sb.append(this.f314235d.length);
                            sb.append(", rLen:");
                            sb.append(i);
                            sb.append(", rHeight:");
                            sb.append(i2);
                            sb.append(", rWidth:");
                            sb.append(i3);
                            sb.append(", rMid:");
                            sb.append(i4);
                            sb.append(", drawCnt:");
                            this.f314236e.getClass();
                            sb.append(0);
                            sb.append(", format:");
                            sb.append(0);
                            Log.m105918d("MicroMsg.Multitalk.ILinkVideoMgr", sb.toString());
                        }
                        if (GetDecodeVideoData > 0 && i > 0 && i2 > 0) {
                            if (i3 > 0) {
                                if (i4 >= 0) {
                                    String c = this.f314236e.f314270a.mo150551c(i4);
                                    int[] E = C105708u2.m141913E(this.f314235d, i);
                                    Log.m105919d("MicroMsg.Multitalk.ILinkVideoMgr", "handleIdleObj get username: %s", c);
                                    if (c != null) {
                                        C105851w0.zx0().mo150676q().mo150840d(c, E, i3, i2, 0, 90);
                                    }
                                }
                            } else {
                                return;
                            }
                        } else {
                            return;
                        }
                    }
                } else {
                    return;
                }
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.Multitalk.ILinkVideoMgr", e, "timer task crash", new Object[0]);
                return;
            }
        }
        while (true) {
        }
    }
}
