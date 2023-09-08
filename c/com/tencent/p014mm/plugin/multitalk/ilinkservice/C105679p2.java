package com.tencent.p014mm.plugin.multitalk.ilinkservice;

import c92.C104329g;
import com.tencent.p014mm.plugin.multitalk.model.C105851w0;
import com.tencent.p014mm.plugin.multitalk.model.C105857z0;
import com.tencent.p014mm.plugin.voip.video.OpenGlRender;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.wxmm.v2conference;
import java.util.TimerTask;

/* renamed from: com.tencent.mm.plugin.multitalk.ilinkservice.p2 */
public class C105679p2 extends TimerTask {

    /* renamed from: d */
    public byte[] f314228d = new byte[1];

    /* renamed from: e */
    public final /* synthetic */ C105697s2 f314229e;

    public C105679p2(C105697s2 s2Var) {
        this.f314229e = s2Var;
    }

    public void run() {
        boolean z;
        int i;
        while (true) {
            try {
                C105697s2 s2Var = this.f314229e;
                synchronized (s2Var) {
                    z = s2Var.f314275f;
                }
                if (z) {
                    C105724z zVar = C105724z.INSTANCE;
                    byte[] bArr = this.f314228d;
                    zVar.getClass();
                    int GetDecodeVideoData = C105714w.f314302c.GetDecodeVideoData(bArr, 128);
                    v2conference v2conference = C105714w.f314302c;
                    int i2 = v2conference.field_remoteScreenImgLength;
                    int i3 = v2conference.field_remoteScreenImgHeight;
                    int i4 = v2conference.field_remoteScreenImgWidth;
                    int i5 = v2conference.field_remoteScreenImgMember;
                    if (GetDecodeVideoData == -100) {
                        int i6 = i4 * i3 * 4;
                        Log.m105924i("MicroMsg.Multitalk.ILinkVideoMgr", "realloc buffer, new size: " + i6);
                        this.f314228d = new byte[i6];
                    } else {
                        int i7 = v2conference.field_remoteScreenImgFormat;
                        if ((i7 & 256) == 0) {
                            int i8 = (i7 & 512) != 0 ? 2 : 1;
                            if ((i7 & 1024) != 0) {
                                i8 += 2;
                            }
                            i = i8;
                        } else {
                            i = 1;
                        }
                        C105697s2 s2Var2 = this.f314229e;
                        int i9 = s2Var2.f314272c + 1;
                        s2Var2.f314272c = i9;
                        if (i9 % 100 == 0) {
                            Log.m105918d("MicroMsg.Multitalk.ILinkVideoMgr", "GetScreen, ret:" + GetDecodeVideoData + ", len:" + this.f314228d.length + ", rLen:" + i2 + ", rHeight:" + i3 + ", rWidth:" + i4 + ", rMid:" + i5 + ", drawCnt:" + this.f314229e.f314272c + ", format:" + 128);
                        }
                        if (GetDecodeVideoData <= 0) {
                            return;
                        }
                        if (i2 > 0) {
                            if (i5 >= 0) {
                                String c = this.f314229e.f314270a.mo150551c(i5);
                                Log.m105924i("MicroMsg.Multitalk.ILinkVideoMgr", "yuemwang: nGetVideoData mid : " + i5 + " user: " + c + "  size:" + i4 + "x" + i3);
                                Log.m105919d("MicroMsg.Multitalk.ILinkVideoMgr", "GetScreen handleIdleObj get username: %s, position: %d", c, 0);
                                boolean z2 = GetDecodeVideoData == 1 && i4 == 0 && i3 < 3;
                                if (c != null) {
                                    if (z2) {
                                        C104329g.f308829a.mo146028b(2);
                                        Log.m105918d("MicroMsg.Multitalk.ILinkVideoMgr", "receive screen frame using HW decode");
                                        C105851w0.zx0().mo150676q().mo150839c(c, this.f314228d, i4, i3, 0, i);
                                    } else {
                                        Log.m105918d("MicroMsg.Multitalk.ILinkVideoMgr", "receive screen frame using SW decode");
                                        if (i4 > 480) {
                                            C104329g.f308829a.mo146028b(1);
                                            C105851w0.zx0().mo150676q().mo150838b(c, C105708u2.m141913E(this.f314228d, i2), i4, i3, 0, i);
                                        } else {
                                            int[] E = C105708u2.m141913E(this.f314228d, i2);
                                            Log.m105919d("MicroMsg.Multitalk.ILinkVideoMgr", "handleIdleObj get username: %s", c);
                                            C105857z0 q = C105851w0.zx0().mo150676q();
                                            int i15 = OpenGlRender.f318118B;
                                            q.mo150840d(c, E, i4, i3, 0, 4);
                                        }
                                    }
                                }
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
