package w33;

import android.util.Size;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import l33.C109247e;
import t33.C110900a;
import v33.C111384c;
import w33.C111714a;
import x33.C112039b;

/* renamed from: w33.v */
public final class C111726v implements C110900a {
    /* renamed from: a */
    public void mo162594a(int i) {
        C112039b.C112040a aVar;
        C112039b.C112040a aVar2;
        C111725u uVar;
        C111725u uVar2;
        C111725u uVar3;
        C111725u uVar4;
        switch (i) {
            case 16:
                C111714a aVar3 = C111384c.f333462a;
                if (aVar3 != null) {
                    if (aVar3.f334398d) {
                        Log.m105920e("MicroMsg.VoIPCameraParamsReport", "camera start preview error");
                        long j = C109247e.vx0().f333458r;
                        C112039b.C112040a aVar4 = aVar3.f334397c.get("StartPreviewError");
                        if (aVar4 != null) {
                            aVar4.mo163758b();
                        } else {
                            aVar4 = new C112039b.C112040a();
                            aVar4.mo163760d(Util.milliSecondsToNow(j));
                            aVar4.f335401a = "StartPreviewError";
                        }
                        aVar3.f334397c.put("StartPreviewError", aVar4);
                    }
                    aVar3.f334398d = true;
                    long j2 = C109247e.vx0().f333458r;
                    C112039b.C112040a aVar5 = aVar3.f334396b.get("StartPreview");
                    if (aVar5 != null) {
                        aVar5.mo163758b();
                    } else {
                        aVar5 = new C112039b.C112040a();
                        aVar5.mo163760d(Util.milliSecondsToNow(j2));
                        aVar5.f335401a = "StartPreview";
                    }
                    aVar3.f334396b.put("StartPreview", aVar5);
                    Log.m105924i("MicroMsg.VoIPCameraParamsReport", "start preview");
                    return;
                }
                return;
            case 17:
                C111714a aVar6 = C111384c.f333462a;
                if (aVar6 != null) {
                    Log.m105924i("MicroMsg.VoIPCameraParamsReport", "stop preview");
                    if (!aVar6.f334398d) {
                        Log.m105920e("MicroMsg.VoIPCameraParamsReport", "camera stop preview error");
                        long j3 = C109247e.vx0().f333458r;
                        C112039b.C112040a aVar7 = aVar6.f334397c.get("StopPreviewError");
                        if (aVar7 != null) {
                            aVar7.mo163758b();
                        } else {
                            aVar7 = new C112039b.C112040a();
                            aVar7.mo163760d(Util.milliSecondsToNow(j3));
                            aVar7.f335401a = "StopPreviewError";
                        }
                        aVar6.f334397c.put("StopPreviewError", aVar7);
                    }
                    aVar6.f334398d = false;
                    C112039b.C112040a aVar8 = aVar6.f334396b.get("StartPreview");
                    if (aVar8 != null) {
                        aVar8.mo163758b();
                    }
                    long j4 = C109247e.vx0().f333458r;
                    C112039b.C112040a aVar9 = aVar6.f334396b.get("StopPreview");
                    if (aVar9 != null) {
                        aVar9.mo163758b();
                    } else {
                        aVar9 = new C112039b.C112040a();
                        aVar9.mo163760d(Util.milliSecondsToNow(j4));
                        aVar9.f335401a = "StopPreview";
                    }
                    aVar6.f334396b.put("StopPreview", aVar9);
                    return;
                }
                return;
            case 18:
                C111714a aVar10 = C111384c.f333462a;
                if (aVar10 != null) {
                    Log.m105924i("MicroMsg.VoIPCameraParamsReport", "cameraInit");
                    long j5 = C109247e.vx0().f333458r;
                    C112039b.C112040a aVar11 = aVar10.f334396b.get("InitCamera");
                    if (aVar11 == null) {
                        aVar11 = new C112039b.C112040a();
                    }
                    aVar11.mo163760d(Util.milliSecondsToNow(j5));
                    aVar11.f335401a = "InitCamera";
                    aVar10.f334396b.put("InitCamera", aVar11);
                    if (aVar10.f334399e == null) {
                        aVar10.f334399e = "InitCamera";
                        return;
                    }
                    return;
                }
                return;
            case 19:
                C111714a aVar12 = C111384c.f333462a;
                if (aVar12 != null) {
                    Log.m105924i("MicroMsg.VoIPCameraParamsReport", "switchCamera");
                    C112039b.C112040a aVar13 = aVar12.f334396b.get(aVar12.f334399e);
                    if (aVar13 != null) {
                        aVar13.mo163758b();
                    }
                    long j6 = C109247e.vx0().f333458r;
                    StringBuilder sb = new StringBuilder();
                    sb.append("SwitchCamera_");
                    C111714a.C111715a aVar14 = aVar12.f334395a;
                    Integer num = null;
                    sb.append(aVar14 != null ? Integer.valueOf(aVar14.f334407a) : null);
                    String sb4 = sb.toString();
                    C112039b.C112040a aVar15 = aVar12.f334396b.get(sb4);
                    if (aVar15 == null) {
                        aVar15 = new C112039b.C112040a();
                    }
                    aVar15.mo163760d(Util.milliSecondsToNow(j6));
                    aVar15.mo163762f(sb4);
                    aVar15.f335410j = "SwitchCamera";
                    C111714a.C111715a aVar16 = aVar12.f334395a;
                    if (aVar16 != null) {
                        num = Integer.valueOf(aVar16.f334407a);
                    }
                    aVar15.f335407g = String.valueOf(num);
                    aVar12.f334396b.put(sb4, aVar15);
                    aVar12.f334399e = sb4;
                    aVar12.f334402h = sb4;
                    return;
                }
                return;
            case 21:
                C111714a aVar17 = C111384c.f333462a;
                if (aVar17 != null && (aVar = aVar17.f334396b.get("StartPreview")) != null) {
                    long milliSecondsToNow = aVar17.f334406l + Util.milliSecondsToNow(aVar.f335408h);
                    aVar17.f334406l = milliSecondsToNow;
                    aVar17.f334406l = milliSecondsToNow / ((long) 2);
                    Log.m105924i("MicroMsg.VoIPCameraParamsReport", "start preview end cost " + aVar17.f334406l);
                    return;
                }
                return;
            case 22:
                C111714a aVar18 = C111384c.f333462a;
                if (aVar18 != null) {
                    Log.m105924i("MicroMsg.VoIPCameraParamsReport", "releaseCamera");
                    long j7 = C109247e.vx0().f333458r;
                    C112039b.C112040a aVar19 = aVar18.f334396b.get("ReleaseCamera");
                    if (aVar19 != null) {
                        aVar19.mo163758b();
                    } else {
                        aVar19 = new C112039b.C112040a();
                        aVar19.mo163760d(Util.milliSecondsToNow(j7));
                        aVar19.f335401a = "ReleaseCamera";
                    }
                    aVar18.f334396b.put("ReleaseCamera", aVar19);
                    return;
                }
                return;
            case 23:
                C111719c cVar = C111384c.f333463b;
                if (cVar != null) {
                    long j8 = C109247e.vx0().f333458r;
                    C112039b.C112040a aVar20 = cVar.f334429a.get("EnterFullscreen");
                    if (aVar20 == null) {
                        aVar20 = new C112039b.C112040a();
                    }
                    C112039b.C112040a aVar21 = cVar.f334429a.get("EnterMiniScreen");
                    if (aVar21 != null) {
                        aVar21.mo163758b();
                    }
                    aVar20.f335401a = "EnterFullscreen";
                    aVar20.mo163760d(Util.milliSecondsToNow(j8));
                    cVar.f334429a.put("EnterFullscreen", aVar20);
                    cVar.f334431c = "EnterFullscreen";
                    Log.m105924i("MicroMsg.VoIPOpReport", "enterFullscreen");
                    return;
                }
                return;
            case 24:
                C111719c cVar2 = C111384c.f333463b;
                if (cVar2 != null) {
                    long j9 = C109247e.vx0().f333458r;
                    C112039b.C112040a aVar22 = cVar2.f334429a.get("EnterMiniScreen");
                    if (aVar22 == null) {
                        aVar22 = new C112039b.C112040a();
                    }
                    C112039b.C112040a aVar23 = cVar2.f334429a.get("EnterFullscreen");
                    if (aVar23 != null) {
                        aVar23.mo163758b();
                    }
                    aVar22.f335401a = "EnterMiniScreen";
                    aVar22.mo163760d(Util.milliSecondsToNow(j9));
                    cVar2.f334429a.put("EnterMiniScreen", aVar22);
                    cVar2.f334431c = "EnterMiniScreen";
                    Log.m105924i("MicroMsg.VoIPOpReport", "enterMiniScreen");
                    return;
                }
                return;
            case 25:
                C111719c cVar3 = C111384c.f333463b;
                if (cVar3 != null) {
                    int i2 = C109247e.vx0().f333443c;
                    long j15 = C109247e.vx0().f333458r;
                    String str = "RotateDevice_" + i2;
                    C112039b.C112040a aVar24 = cVar3.f334429a.get(str);
                    if (aVar24 == null) {
                        aVar24 = new C112039b.C112040a();
                    }
                    String str2 = cVar3.f334430b;
                    if (!(str2 == null || (aVar2 = cVar3.f334429a.get(str2)) == null)) {
                        aVar2.mo163758b();
                    }
                    aVar24.mo163762f(str);
                    aVar24.mo163760d(Util.milliSecondsToNow(j15));
                    aVar24.mo163763g(String.valueOf(i2));
                    cVar3.f334429a.put(str, aVar24);
                    cVar3.f334430b = str;
                    Log.m105924i("MicroMsg.VoIPOpReport", "rotate device " + i2);
                    return;
                }
                return;
            case 26:
                C109247e.vx0().getClass();
                C111725u uVar5 = C111384c.f333465d;
                if (uVar5 != null) {
                    Log.m105924i("MicroMsg.VoIPRenderReport", "onDecodeModeChanged toSoft:" + true);
                    long j16 = C109247e.vx0().f333458r;
                    C112039b.C112040a aVar25 = uVar5.f334496b.get("DecodeChangeHard");
                    if (aVar25 != null) {
                        aVar25.mo163758b();
                    }
                    C112039b.C112040a aVar26 = uVar5.f334496b.get("DecodeChangeSoft");
                    if (aVar26 == null) {
                        aVar26 = new C112039b.C112040a();
                    }
                    aVar26.mo163760d(Util.milliSecondsToNow(j16));
                    aVar26.f335401a = "DecodeChangeSoft";
                    uVar5.f334496b.put("DecodeChangeSoft", aVar26);
                    return;
                }
                return;
            case 27:
                Size size = C109247e.vx0().f333456p;
                if (size != null && (uVar = C111384c.f333465d) != null) {
                    uVar.mo163431m(size, true);
                    return;
                }
                return;
            case 28:
                Size size2 = C109247e.vx0().f333456p;
                if (size2 != null && (uVar2 = C111384c.f333465d) != null) {
                    uVar2.mo163430l(size2, true);
                    return;
                }
                return;
            case 29:
                int i3 = C109247e.vx0().f333443c;
                C111725u uVar6 = C111384c.f333465d;
                if (uVar6 != null) {
                    Log.m105924i("MicroMsg.VoIPRenderReport", "isLocal : " + true + "onRenderRotateChanged " + i3);
                    long j17 = C109247e.vx0().f333458r;
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append("DrawLocalRotateChange");
                    sb5.append(i3);
                    String sb6 = sb5.toString();
                    String str3 = uVar6.f334502h;
                    C112039b.C112040a aVar27 = uVar6.f334496b.get(sb6);
                    if (aVar27 == null) {
                        aVar27 = new C112039b.C112040a();
                    }
                    C112039b.C112040a aVar28 = uVar6.f334496b.get(str3);
                    if (aVar28 != null) {
                        aVar28.mo163758b();
                        uVar6.f334496b.put(sb6, aVar28);
                    }
                    aVar27.mo163760d(Util.milliSecondsToNow(j17));
                    aVar27.mo163762f(sb6);
                    aVar27.mo163763g(String.valueOf(i3));
                    uVar6.f334496b.put(sb6, aVar27);
                    uVar6.f334507m.add(Integer.valueOf(i3));
                    uVar6.f334502h = sb6;
                    return;
                }
                return;
            case 30:
                Size size3 = C109247e.vx0().f333457q;
                if (size3 != null && (uVar3 = C111384c.f333465d) != null) {
                    uVar3.mo163431m(size3, false);
                    return;
                }
                return;
            case 31:
                Size size4 = C109247e.vx0().f333457q;
                if (size4 != null && (uVar4 = C111384c.f333465d) != null) {
                    uVar4.mo163430l(size4, false);
                    return;
                }
                return;
            default:
                return;
        }
    }
}
