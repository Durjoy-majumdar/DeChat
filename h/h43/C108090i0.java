package h43;

import android.util.Size;
import b43.C104031a;
import com.tencent.p014mm.plugin.voip.model.C106359m0;
import com.tencent.p014mm.plugin.voip.model.C106377r;
import com.tencent.p014mm.plugin.voip.model.C106400y;
import com.tencent.p014mm.plugin.voip.model.v2protocal;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.wxmm.v2helper;
import d43.C106987a;
import fy3.C32228q;
import gy3.C87412m;
import gy3.C87413o;
import l33.C109247e;
import rx3.C13598b0;
import v33.C111384c;
import w33.C111717b;
import w33.C111721d;
import w33.C111725u;
import w33.C111728x;
import x33.C112039b;
import z33.C112593f;

/* renamed from: h43.i0 */
public final class C108090i0 extends C87413o implements C32228q<Size, Integer, Integer, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C108077f0 f323683d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C108090i0(C108077f0 f0Var) {
        super(3);
        this.f323683d = f0Var;
    }

    public Object invoke(Object obj, Object obj2, Object obj3) {
        C108071e eVar;
        v2protocal v2protocal;
        Size size;
        C104031a aVar;
        Size size2;
        Size size3 = (Size) obj;
        int intValue = ((Number) obj2).intValue();
        int intValue2 = ((Number) obj3).intValue();
        boolean z = false;
        if (intValue == 2) {
            C108077f0 f0Var = this.f323683d;
            if (!f0Var.f323643c && C109247e.vx0().f333459s != 0) {
                if (f0Var.f323642b == null) {
                    Log.m105920e("MicroMsg.VoIPRenderMgr", "onFrameDataReady on onFrameAvailable remove preview callback, captureRender is null!");
                } else {
                    if (f0Var.f323638I == null) {
                        MTimerHandler mTimerHandler = new MTimerHandler("CameraPreviewInvalidChecker", (MTimerHandler.CallBack) new C108088h0(f0Var), true);
                        f0Var.f323638I = mTimerHandler;
                        mTimerHandler.startTimer(0, 1000);
                    }
                    Boolean valueOf = Boolean.valueOf(f0Var.f323654n);
                    if (!valueOf.booleanValue()) {
                        valueOf = null;
                    }
                    if (valueOf != null) {
                        valueOf.booleanValue();
                        int i = C112593f.f337157b;
                        Size size4 = i != 640 ? i != 1280 ? i != 1920 ? C112593f.f337161f != null ? new Size(480, v2helper.VOIP_ENC_HEIGHT_LV1) : (!f0Var.f323655o || C109247e.vx0().f333449i <= f0Var.f323656p) ? f0Var.mo158490e() : new Size(640, 480) : (f0Var.f323659s || C112593f.f337161f != null) ? new Size(1920, 1080) : f0Var.mo158490e() : f0Var.mo158490e() : C112593f.f337161f != null ? new Size(640, 480) : (!f0Var.f323655o || C109247e.vx0().f333449i <= f0Var.f323656p) ? f0Var.mo158490e() : new Size(640, 480);
                        C104031a aVar2 = f0Var.f323642b;
                        if (!(aVar2 == null || (size = ((C106987a) aVar2).f320241f) == null || size4.getWidth() == size.getWidth() || f0Var.f323635F >= f0Var.f323634E || (aVar = f0Var.f323642b) == null || (size2 = ((C106987a) aVar).f320241f) == null)) {
                            int width = size4.getWidth();
                            Size size5 = new Size(width, (int) (((float) width) * (((float) size2.getHeight()) / ((float) size2.getWidth()))));
                            C104031a aVar3 = f0Var.f323642b;
                            if (C87412m.m108589b(aVar3 != null ? Boolean.valueOf(aVar3.mo145642n(size5.getWidth(), size5.getHeight())) : null, Boolean.FALSE)) {
                                f0Var.f323635F++;
                            }
                        }
                    }
                    C106359m0 m0Var = C109247e.xx0().f317332a;
                    if (m0Var != null) {
                        C106400y yVar = m0Var.f317396a.f317450A;
                        C106377r rVar = yVar.f317711d;
                        if (rVar == null || (v2protocal = rVar.f317500x) == null) {
                            C112593f.f337156a.mo164363a();
                        } else {
                            byte[] bArr = new byte[4];
                            if (v2protocal.setAppCmd(60, bArr, 4) >= 0) {
                                int byteArrayToInt = Util.byteArrayToInt(bArr);
                                int i2 = byteArrayToInt >> 16;
                                int i3 = byteArrayToInt & 65535;
                                int i4 = yVar.f317706J;
                                if (i4 != 0) {
                                    int i5 = i4 == 1 ? 480 : i4 == 2 ? 640 : i4 == 3 ? 1280 : i2;
                                    i3 = (int) (((float) i5) * ((((float) i3) * 1.0f) / ((float) i2)));
                                    i2 = i5;
                                }
                                if (!v2protocal.f317533T1 && (i2 >= 1280 || i3 >= 1280)) {
                                    i2 = (((i2 >> 1) + 8) / 16) * 16;
                                    i3 = (((i3 >> 1) + 8) / 16) * 16;
                                }
                                if (!v2protocal.f317534U1 && (i2 >= 1920 || i3 >= 1920)) {
                                    Log.m105929w("MicroMsg.Voip.VoipDeviceHandler", "error qos param: exp: %dx%d, used: %dx%d", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(yVar.f317704H), Integer.valueOf(yVar.f317705I));
                                    i2 = yVar.f317704H;
                                    i3 = yVar.f317705I;
                                }
                                yVar.f317704H = i2;
                                yVar.f317705I = i3;
                                C112593f.f337156a.mo164366d(i2, i3);
                            }
                        }
                    }
                    f0Var.f323637H++;
                    if (intValue2 == 0) {
                        f0Var.f323658r.getClass();
                        C111717b bVar = C111384c.f333466e;
                        if (bVar != null) {
                            Log.m105924i("MicroMsg.VoIPEncoderReport", "encode frame failed will cause opposite black frame");
                            long j = C109247e.vx0().f333458r;
                            String str = bVar.f334414d;
                            if (str != null) {
                                C112039b.C112040a aVar4 = bVar.f334412b.get("EncodeBadFrame_" + bVar.f334414d);
                                if (aVar4 == null) {
                                    aVar4 = new C112039b.C112040a();
                                }
                                aVar4.mo163762f("EncodeBadFrame_" + bVar.f334414d);
                                aVar4.mo163760d(Util.milliSecondsToNow(j));
                                aVar4.f335407g = str;
                                aVar4.mo163758b();
                                bVar.f334412b.put("EncodeBadFrame_" + bVar.f334414d, aVar4);
                            }
                        }
                    } else {
                        C111728x xVar = f0Var.f323658r;
                        C111721d dVar = C111384c.f333467f;
                        if (dVar != null) {
                            xVar.getClass();
                            long j2 = C109247e.vx0().f333459s;
                            if (dVar.f334459g == 0 && j2 != 0) {
                                dVar.f334459g = Util.milliSecondsToNow(j2);
                                Log.m105924i("MicroMsg.VoIPProfileReport", "encode first frame come cost " + dVar.f334459g);
                            }
                        }
                        if (xVar.f334536k) {
                            xVar.f334536k = false;
                            C111717b bVar2 = C111384c.f333466e;
                            if (bVar2 != null) {
                                bVar2.mo163394b(Util.milliSecondsToNow(xVar.f334535j));
                            }
                        }
                        xVar.f334539n++;
                        xVar.f334535j = Util.nowMilliSecond();
                        C111725u uVar = C111384c.f333465d;
                        if (uVar != null) {
                            if (uVar.f334494M == 0) {
                                uVar.f334494M = Util.nowMilliSecond();
                            }
                            long milliSecondsToNow = Util.milliSecondsToNow(uVar.f334494M);
                            if (201 <= milliSecondsToNow && milliSecondsToNow < 500) {
                                z = true;
                            }
                            if (z) {
                                uVar.f334489H++;
                                uVar.f334492K += milliSecondsToNow;
                            } else if (milliSecondsToNow > 500) {
                                uVar.f334490I++;
                                uVar.f334493L += milliSecondsToNow;
                            }
                            uVar.f334491J++;
                            uVar.f334494M = Util.nowMilliSecond();
                        }
                    }
                }
            }
        } else {
            if (!(size3 == null || (eVar = this.f323683d.f323662v) == null)) {
                eVar.mo150003z(size3, intValue);
            }
            C108077f0 f0Var2 = this.f323683d;
            f0Var2.getClass();
            if (intValue == 1) {
                Size size6 = C109247e.vx0().f333457q;
                if (size6 != null) {
                    f0Var2.f323658r.mo163441c(false, size6);
                    f0Var2.f323658r.mo163439a(false);
                }
            } else {
                Size size7 = C109247e.vx0().f333456p;
                if (size7 != null) {
                    f0Var2.f323658r.mo163441c(true, size7);
                    f0Var2.f323658r.mo163439a(true);
                }
            }
        }
        return C13598b0.f38549a;
    }
}
