package com.tencent.p014mm.plugin.game.protobuf;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import py1.C47540a;
import py1.C47555c0;
import py1.C47562d0;
import py1.C47563d1;
import py1.C47603j;
import py1.C47605j1;
import py1.C47629m4;
import py1.C47631n;
import py1.C47640o1;
import py1.C47644o5;
import py1.C47646p0;
import py1.C47651p5;
import py1.C47653q0;
import py1.C47654q1;
import py1.C47660r0;
import py1.C47668s1;
import py1.C47671s4;
import py1.C47677t3;
import py1.C47687v0;
import py1.C47692w;
import te3.C49335eu3;
import te3.C49966ja;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: com.tencent.mm.plugin.game.protobuf.GetGameCenterGlobalSettingResponse */
public class GetGameCenterGlobalSettingResponse extends C49335eu3 {
    public C47540a A8Key;
    public String AppStoreGoodsId;
    public C47603j AppStorePreload;
    public C47631n AutoRunTaskSetting;
    public C47692w CommJsLib;
    public C47555c0 DownloadIntercept;
    public C47646p0 GameBanner;
    public C47653q0 GameCenterTabSetting;
    public C47660r0 GameCommunityInfo;
    public C47687v0 GameDetailSetting;
    public C47563d1 GameIndexSetting;
    public C47605j1 GameLifeSetting;
    public C47640o1 GameReport;
    public C47654q1 GameSight;
    public C47668s1 GeneralJumpInfo;
    public C47677t3 MessageExposureStrategy;
    public C47629m4 ResourcePreload;
    public boolean ShowEntrance;
    public C47671s4 StatusBarStyle;
    public C47644o5 WebViewControl;
    public C47651p5 WepkgControl;
    public C47562d0 downloaderApp;

    public static final GetGameCenterGlobalSettingResponse create() {
        return new GetGameCenterGlobalSettingResponse();
    }

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof GetGameCenterGlobalSettingResponse)) {
            return false;
        }
        GetGameCenterGlobalSettingResponse getGameCenterGlobalSettingResponse = (GetGameCenterGlobalSettingResponse) aVar;
        return C46238a.m51546a(this.BaseResponse, getGameCenterGlobalSettingResponse.BaseResponse) && C46238a.m51546a(Boolean.valueOf(this.ShowEntrance), Boolean.valueOf(getGameCenterGlobalSettingResponse.ShowEntrance)) && C46238a.m51546a(this.GameIndexSetting, getGameCenterGlobalSettingResponse.GameIndexSetting) && C46238a.m51546a(this.AppStoreGoodsId, getGameCenterGlobalSettingResponse.AppStoreGoodsId) && C46238a.m51546a(this.GameDetailSetting, getGameCenterGlobalSettingResponse.GameDetailSetting) && C46238a.m51546a(this.AppStorePreload, getGameCenterGlobalSettingResponse.AppStorePreload) && C46238a.m51546a(this.StatusBarStyle, getGameCenterGlobalSettingResponse.StatusBarStyle) && C46238a.m51546a(this.CommJsLib, getGameCenterGlobalSettingResponse.CommJsLib) && C46238a.m51546a(this.WepkgControl, getGameCenterGlobalSettingResponse.WepkgControl) && C46238a.m51546a(this.downloaderApp, getGameCenterGlobalSettingResponse.downloaderApp) && C46238a.m51546a(this.WebViewControl, getGameCenterGlobalSettingResponse.WebViewControl) && C46238a.m51546a(this.DownloadIntercept, getGameCenterGlobalSettingResponse.DownloadIntercept) && C46238a.m51546a(this.A8Key, getGameCenterGlobalSettingResponse.A8Key) && C46238a.m51546a(this.AutoRunTaskSetting, getGameCenterGlobalSettingResponse.AutoRunTaskSetting) && C46238a.m51546a(this.GameCenterTabSetting, getGameCenterGlobalSettingResponse.GameCenterTabSetting) && C46238a.m51546a(this.GameLifeSetting, getGameCenterGlobalSettingResponse.GameLifeSetting) && C46238a.m51546a(this.GeneralJumpInfo, getGameCenterGlobalSettingResponse.GeneralJumpInfo) && C46238a.m51546a(this.GameCommunityInfo, getGameCenterGlobalSettingResponse.GameCommunityInfo) && C46238a.m51546a(this.GameBanner, getGameCenterGlobalSettingResponse.GameBanner) && C46238a.m51546a(this.GameSight, getGameCenterGlobalSettingResponse.GameSight) && C46238a.m51546a(this.GameReport, getGameCenterGlobalSettingResponse.GameReport) && C46238a.m51546a(this.ResourcePreload, getGameCenterGlobalSettingResponse.ResourcePreload) && C46238a.m51546a(this.MessageExposureStrategy, getGameCenterGlobalSettingResponse.MessageExposureStrategy);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        int i3 = 0;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            C49966ja jaVar = this.BaseResponse;
            if (jaVar != null) {
                if (jaVar != null) {
                    aVar.mo74322i(1, jaVar.computeSize());
                    this.BaseResponse.writeFields(aVar);
                }
                aVar.mo74314a(2, this.ShowEntrance);
                C47563d1 d1Var = this.GameIndexSetting;
                if (d1Var != null) {
                    aVar.mo74322i(3, d1Var.computeSize());
                    this.GameIndexSetting.writeFields(aVar);
                }
                String str = this.AppStoreGoodsId;
                if (str != null) {
                    aVar.mo74323j(4, str);
                }
                C47687v0 v0Var = this.GameDetailSetting;
                if (v0Var != null) {
                    aVar.mo74322i(6, v0Var.computeSize());
                    this.GameDetailSetting.writeFields(aVar);
                }
                C47603j jVar = this.AppStorePreload;
                if (jVar != null) {
                    aVar.mo74322i(7, jVar.computeSize());
                    this.AppStorePreload.writeFields(aVar);
                }
                C47671s4 s4Var = this.StatusBarStyle;
                if (s4Var != null) {
                    aVar.mo74322i(8, s4Var.computeSize());
                    this.StatusBarStyle.writeFields(aVar);
                }
                C47692w wVar = this.CommJsLib;
                if (wVar != null) {
                    aVar.mo74322i(11, wVar.computeSize());
                    this.CommJsLib.writeFields(aVar);
                }
                C47651p5 p5Var = this.WepkgControl;
                if (p5Var != null) {
                    aVar.mo74322i(12, p5Var.computeSize());
                    this.WepkgControl.writeFields(aVar);
                }
                C47562d0 d0Var = this.downloaderApp;
                if (d0Var != null) {
                    aVar.mo74322i(13, d0Var.computeSize());
                    this.downloaderApp.writeFields(aVar);
                }
                C47644o5 o5Var = this.WebViewControl;
                if (o5Var != null) {
                    aVar.mo74322i(14, o5Var.computeSize());
                    this.WebViewControl.writeFields(aVar);
                }
                C47555c0 c0Var = this.DownloadIntercept;
                if (c0Var != null) {
                    aVar.mo74322i(15, c0Var.computeSize());
                    this.DownloadIntercept.writeFields(aVar);
                }
                C47540a aVar2 = this.A8Key;
                if (aVar2 != null) {
                    aVar.mo74322i(16, aVar2.computeSize());
                    this.A8Key.writeFields(aVar);
                }
                C47631n nVar = this.AutoRunTaskSetting;
                if (nVar != null) {
                    aVar.mo74322i(17, nVar.computeSize());
                    this.AutoRunTaskSetting.writeFields(aVar);
                }
                C47653q0 q0Var = this.GameCenterTabSetting;
                if (q0Var != null) {
                    aVar.mo74322i(18, q0Var.computeSize());
                    this.GameCenterTabSetting.writeFields(aVar);
                }
                C47605j1 j1Var = this.GameLifeSetting;
                if (j1Var != null) {
                    aVar.mo74322i(19, j1Var.computeSize());
                    this.GameLifeSetting.writeFields(aVar);
                }
                C47668s1 s1Var = this.GeneralJumpInfo;
                if (s1Var != null) {
                    aVar.mo74322i(20, s1Var.computeSize());
                    this.GeneralJumpInfo.writeFields(aVar);
                }
                C47660r0 r0Var = this.GameCommunityInfo;
                if (r0Var != null) {
                    aVar.mo74322i(21, r0Var.computeSize());
                    this.GameCommunityInfo.writeFields(aVar);
                }
                C47646p0 p0Var = this.GameBanner;
                if (p0Var != null) {
                    aVar.mo74322i(22, p0Var.computeSize());
                    this.GameBanner.writeFields(aVar);
                }
                C47654q1 q1Var = this.GameSight;
                if (q1Var != null) {
                    aVar.mo74322i(23, q1Var.computeSize());
                    this.GameSight.writeFields(aVar);
                }
                C47640o1 o1Var = this.GameReport;
                if (o1Var != null) {
                    aVar.mo74322i(24, o1Var.computeSize());
                    this.GameReport.writeFields(aVar);
                }
                C47629m4 m4Var = this.ResourcePreload;
                if (m4Var != null) {
                    aVar.mo74322i(25, m4Var.computeSize());
                    this.ResourcePreload.writeFields(aVar);
                }
                C47677t3 t3Var = this.MessageExposureStrategy;
                if (t3Var != null) {
                    aVar.mo74322i(26, t3Var.computeSize());
                    this.MessageExposureStrategy.writeFields(aVar);
                }
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i2 == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i3 = C52418a.m58682i(1, jaVar2.computeSize()) + 0;
            }
            int a = i3 + C52418a.m58674a(2, this.ShowEntrance);
            C47563d1 d1Var2 = this.GameIndexSetting;
            if (d1Var2 != null) {
                a += C52418a.m58682i(3, d1Var2.computeSize());
            }
            String str2 = this.AppStoreGoodsId;
            if (str2 != null) {
                a += C52418a.m58683j(4, str2);
            }
            C47687v0 v0Var2 = this.GameDetailSetting;
            if (v0Var2 != null) {
                a += C52418a.m58682i(6, v0Var2.computeSize());
            }
            C47603j jVar2 = this.AppStorePreload;
            if (jVar2 != null) {
                a += C52418a.m58682i(7, jVar2.computeSize());
            }
            C47671s4 s4Var2 = this.StatusBarStyle;
            if (s4Var2 != null) {
                a += C52418a.m58682i(8, s4Var2.computeSize());
            }
            C47692w wVar2 = this.CommJsLib;
            if (wVar2 != null) {
                a += C52418a.m58682i(11, wVar2.computeSize());
            }
            C47651p5 p5Var2 = this.WepkgControl;
            if (p5Var2 != null) {
                a += C52418a.m58682i(12, p5Var2.computeSize());
            }
            C47562d0 d0Var2 = this.downloaderApp;
            if (d0Var2 != null) {
                a += C52418a.m58682i(13, d0Var2.computeSize());
            }
            C47644o5 o5Var2 = this.WebViewControl;
            if (o5Var2 != null) {
                a += C52418a.m58682i(14, o5Var2.computeSize());
            }
            C47555c0 c0Var2 = this.DownloadIntercept;
            if (c0Var2 != null) {
                a += C52418a.m58682i(15, c0Var2.computeSize());
            }
            C47540a aVar3 = this.A8Key;
            if (aVar3 != null) {
                a += C52418a.m58682i(16, aVar3.computeSize());
            }
            C47631n nVar2 = this.AutoRunTaskSetting;
            if (nVar2 != null) {
                a += C52418a.m58682i(17, nVar2.computeSize());
            }
            C47653q0 q0Var2 = this.GameCenterTabSetting;
            if (q0Var2 != null) {
                a += C52418a.m58682i(18, q0Var2.computeSize());
            }
            C47605j1 j1Var2 = this.GameLifeSetting;
            if (j1Var2 != null) {
                a += C52418a.m58682i(19, j1Var2.computeSize());
            }
            C47668s1 s1Var2 = this.GeneralJumpInfo;
            if (s1Var2 != null) {
                a += C52418a.m58682i(20, s1Var2.computeSize());
            }
            C47660r0 r0Var2 = this.GameCommunityInfo;
            if (r0Var2 != null) {
                a += C52418a.m58682i(21, r0Var2.computeSize());
            }
            C47646p0 p0Var2 = this.GameBanner;
            if (p0Var2 != null) {
                a += C52418a.m58682i(22, p0Var2.computeSize());
            }
            C47654q1 q1Var2 = this.GameSight;
            if (q1Var2 != null) {
                a += C52418a.m58682i(23, q1Var2.computeSize());
            }
            C47640o1 o1Var2 = this.GameReport;
            if (o1Var2 != null) {
                a += C52418a.m58682i(24, o1Var2.computeSize());
            }
            C47629m4 m4Var2 = this.ResourcePreload;
            if (m4Var2 != null) {
                a += C52418a.m58682i(25, m4Var2.computeSize());
            }
            C47677t3 t3Var2 = this.MessageExposureStrategy;
            return t3Var2 != null ? a + C52418a.m58682i(26, t3Var2.computeSize()) : a;
        } else if (i2 == 2) {
            C102122a aVar4 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar4); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar4)) {
                if (!super.populateBuilderWithField(aVar4, this, nextFieldNumber)) {
                    aVar4.mo141624b();
                }
            }
            if (this.BaseResponse != null) {
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i2 != 3) {
            return -1;
        } else {
            C102122a aVar5 = objArr[0];
            GetGameCenterGlobalSettingResponse getGameCenterGlobalSettingResponse = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    LinkedList<byte[]> j = aVar5.mo141632j(intValue);
                    int size = j.size();
                    for (int i4 = 0; i4 < size; i4++) {
                        byte[] bArr = j.get(i4);
                        C49966ja jaVar3 = new C49966ja();
                        if (bArr != null && bArr.length > 0) {
                            jaVar3.parseFrom(bArr);
                        }
                        getGameCenterGlobalSettingResponse.BaseResponse = jaVar3;
                    }
                    return 0;
                case 2:
                    getGameCenterGlobalSettingResponse.ShowEntrance = aVar5.mo141625c(intValue);
                    return 0;
                case 3:
                    LinkedList<byte[]> j2 = aVar5.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i5 = 0; i5 < size2; i5++) {
                        byte[] bArr2 = j2.get(i5);
                        C47563d1 d1Var3 = new C47563d1();
                        if (bArr2 != null && bArr2.length > 0) {
                            d1Var3.parseFrom(bArr2);
                        }
                        getGameCenterGlobalSettingResponse.GameIndexSetting = d1Var3;
                    }
                    return 0;
                case 4:
                    getGameCenterGlobalSettingResponse.AppStoreGoodsId = aVar5.mo141633k(intValue);
                    return 0;
                case 6:
                    LinkedList<byte[]> j3 = aVar5.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i6 = 0; i6 < size3; i6++) {
                        byte[] bArr3 = j3.get(i6);
                        C47687v0 v0Var3 = new C47687v0();
                        if (bArr3 != null && bArr3.length > 0) {
                            v0Var3.parseFrom(bArr3);
                        }
                        getGameCenterGlobalSettingResponse.GameDetailSetting = v0Var3;
                    }
                    return 0;
                case 7:
                    LinkedList<byte[]> j4 = aVar5.mo141632j(intValue);
                    int size4 = j4.size();
                    for (int i7 = 0; i7 < size4; i7++) {
                        byte[] bArr4 = j4.get(i7);
                        C47603j jVar3 = new C47603j();
                        if (bArr4 != null && bArr4.length > 0) {
                            jVar3.parseFrom(bArr4);
                        }
                        getGameCenterGlobalSettingResponse.AppStorePreload = jVar3;
                    }
                    return 0;
                case 8:
                    LinkedList<byte[]> j5 = aVar5.mo141632j(intValue);
                    int size5 = j5.size();
                    for (int i8 = 0; i8 < size5; i8++) {
                        byte[] bArr5 = j5.get(i8);
                        C47671s4 s4Var3 = new C47671s4();
                        if (bArr5 != null && bArr5.length > 0) {
                            s4Var3.parseFrom(bArr5);
                        }
                        getGameCenterGlobalSettingResponse.StatusBarStyle = s4Var3;
                    }
                    return 0;
                case 11:
                    LinkedList<byte[]> j6 = aVar5.mo141632j(intValue);
                    int size6 = j6.size();
                    for (int i9 = 0; i9 < size6; i9++) {
                        byte[] bArr6 = j6.get(i9);
                        C47692w wVar3 = new C47692w();
                        if (bArr6 != null && bArr6.length > 0) {
                            wVar3.parseFrom(bArr6);
                        }
                        getGameCenterGlobalSettingResponse.CommJsLib = wVar3;
                    }
                    return 0;
                case 12:
                    LinkedList<byte[]> j7 = aVar5.mo141632j(intValue);
                    int size7 = j7.size();
                    for (int i15 = 0; i15 < size7; i15++) {
                        byte[] bArr7 = j7.get(i15);
                        C47651p5 p5Var3 = new C47651p5();
                        if (bArr7 != null && bArr7.length > 0) {
                            p5Var3.parseFrom(bArr7);
                        }
                        getGameCenterGlobalSettingResponse.WepkgControl = p5Var3;
                    }
                    return 0;
                case 13:
                    LinkedList<byte[]> j8 = aVar5.mo141632j(intValue);
                    int size8 = j8.size();
                    for (int i16 = 0; i16 < size8; i16++) {
                        byte[] bArr8 = j8.get(i16);
                        C47562d0 d0Var3 = new C47562d0();
                        if (bArr8 != null && bArr8.length > 0) {
                            d0Var3.parseFrom(bArr8);
                        }
                        getGameCenterGlobalSettingResponse.downloaderApp = d0Var3;
                    }
                    return 0;
                case 14:
                    LinkedList<byte[]> j9 = aVar5.mo141632j(intValue);
                    int size9 = j9.size();
                    for (int i17 = 0; i17 < size9; i17++) {
                        byte[] bArr9 = j9.get(i17);
                        C47644o5 o5Var3 = new C47644o5();
                        if (bArr9 != null && bArr9.length > 0) {
                            o5Var3.parseFrom(bArr9);
                        }
                        getGameCenterGlobalSettingResponse.WebViewControl = o5Var3;
                    }
                    return 0;
                case 15:
                    LinkedList<byte[]> j15 = aVar5.mo141632j(intValue);
                    int size10 = j15.size();
                    for (int i18 = 0; i18 < size10; i18++) {
                        byte[] bArr10 = j15.get(i18);
                        C47555c0 c0Var3 = new C47555c0();
                        if (bArr10 != null && bArr10.length > 0) {
                            c0Var3.parseFrom(bArr10);
                        }
                        getGameCenterGlobalSettingResponse.DownloadIntercept = c0Var3;
                    }
                    return 0;
                case 16:
                    LinkedList<byte[]> j16 = aVar5.mo141632j(intValue);
                    int size11 = j16.size();
                    for (int i19 = 0; i19 < size11; i19++) {
                        byte[] bArr11 = j16.get(i19);
                        C47540a aVar6 = new C47540a();
                        if (bArr11 != null && bArr11.length > 0) {
                            aVar6.parseFrom(bArr11);
                        }
                        getGameCenterGlobalSettingResponse.A8Key = aVar6;
                    }
                    return 0;
                case 17:
                    LinkedList<byte[]> j17 = aVar5.mo141632j(intValue);
                    int size12 = j17.size();
                    for (int i25 = 0; i25 < size12; i25++) {
                        byte[] bArr12 = j17.get(i25);
                        C47631n nVar3 = new C47631n();
                        if (bArr12 != null && bArr12.length > 0) {
                            nVar3.parseFrom(bArr12);
                        }
                        getGameCenterGlobalSettingResponse.AutoRunTaskSetting = nVar3;
                    }
                    return 0;
                case 18:
                    LinkedList<byte[]> j18 = aVar5.mo141632j(intValue);
                    int size13 = j18.size();
                    for (int i26 = 0; i26 < size13; i26++) {
                        byte[] bArr13 = j18.get(i26);
                        C47653q0 q0Var3 = new C47653q0();
                        if (bArr13 != null && bArr13.length > 0) {
                            q0Var3.parseFrom(bArr13);
                        }
                        getGameCenterGlobalSettingResponse.GameCenterTabSetting = q0Var3;
                    }
                    return 0;
                case 19:
                    LinkedList<byte[]> j19 = aVar5.mo141632j(intValue);
                    int size14 = j19.size();
                    for (int i27 = 0; i27 < size14; i27++) {
                        byte[] bArr14 = j19.get(i27);
                        C47605j1 j1Var3 = new C47605j1();
                        if (bArr14 != null && bArr14.length > 0) {
                            j1Var3.parseFrom(bArr14);
                        }
                        getGameCenterGlobalSettingResponse.GameLifeSetting = j1Var3;
                    }
                    return 0;
                case 20:
                    LinkedList<byte[]> j25 = aVar5.mo141632j(intValue);
                    int size15 = j25.size();
                    for (int i28 = 0; i28 < size15; i28++) {
                        byte[] bArr15 = j25.get(i28);
                        C47668s1 s1Var3 = new C47668s1();
                        if (bArr15 != null && bArr15.length > 0) {
                            s1Var3.parseFrom(bArr15);
                        }
                        getGameCenterGlobalSettingResponse.GeneralJumpInfo = s1Var3;
                    }
                    return 0;
                case 21:
                    LinkedList<byte[]> j26 = aVar5.mo141632j(intValue);
                    int size16 = j26.size();
                    for (int i29 = 0; i29 < size16; i29++) {
                        byte[] bArr16 = j26.get(i29);
                        C47660r0 r0Var3 = new C47660r0();
                        if (bArr16 != null && bArr16.length > 0) {
                            r0Var3.parseFrom(bArr16);
                        }
                        getGameCenterGlobalSettingResponse.GameCommunityInfo = r0Var3;
                    }
                    return 0;
                case 22:
                    LinkedList<byte[]> j27 = aVar5.mo141632j(intValue);
                    int size17 = j27.size();
                    for (int i35 = 0; i35 < size17; i35++) {
                        byte[] bArr17 = j27.get(i35);
                        C47646p0 p0Var3 = new C47646p0();
                        if (bArr17 != null && bArr17.length > 0) {
                            p0Var3.parseFrom(bArr17);
                        }
                        getGameCenterGlobalSettingResponse.GameBanner = p0Var3;
                    }
                    return 0;
                case 23:
                    LinkedList<byte[]> j28 = aVar5.mo141632j(intValue);
                    int size18 = j28.size();
                    for (int i36 = 0; i36 < size18; i36++) {
                        byte[] bArr18 = j28.get(i36);
                        C47654q1 q1Var3 = new C47654q1();
                        if (bArr18 != null && bArr18.length > 0) {
                            q1Var3.parseFrom(bArr18);
                        }
                        getGameCenterGlobalSettingResponse.GameSight = q1Var3;
                    }
                    return 0;
                case 24:
                    LinkedList<byte[]> j29 = aVar5.mo141632j(intValue);
                    int size19 = j29.size();
                    for (int i37 = 0; i37 < size19; i37++) {
                        byte[] bArr19 = j29.get(i37);
                        C47640o1 o1Var3 = new C47640o1();
                        if (bArr19 != null && bArr19.length > 0) {
                            o1Var3.parseFrom(bArr19);
                        }
                        getGameCenterGlobalSettingResponse.GameReport = o1Var3;
                    }
                    return 0;
                case 25:
                    LinkedList<byte[]> j35 = aVar5.mo141632j(intValue);
                    int size20 = j35.size();
                    for (int i38 = 0; i38 < size20; i38++) {
                        byte[] bArr20 = j35.get(i38);
                        C47629m4 m4Var3 = new C47629m4();
                        if (bArr20 != null && bArr20.length > 0) {
                            m4Var3.parseFrom(bArr20);
                        }
                        getGameCenterGlobalSettingResponse.ResourcePreload = m4Var3;
                    }
                    return 0;
                case 26:
                    LinkedList<byte[]> j36 = aVar5.mo141632j(intValue);
                    int size21 = j36.size();
                    for (int i39 = 0; i39 < size21; i39++) {
                        byte[] bArr21 = j36.get(i39);
                        C47677t3 t3Var3 = new C47677t3();
                        if (bArr21 != null && bArr21.length > 0) {
                            t3Var3.parseFrom(bArr21);
                        }
                        getGameCenterGlobalSettingResponse.MessageExposureStrategy = t3Var3;
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }

    public GetGameCenterGlobalSettingResponse setA8Key(C47540a aVar) {
        this.A8Key = aVar;
        return this;
    }

    public GetGameCenterGlobalSettingResponse setAppStoreGoodsId(String str) {
        this.AppStoreGoodsId = str;
        return this;
    }

    public GetGameCenterGlobalSettingResponse setAppStorePreload(C47603j jVar) {
        this.AppStorePreload = jVar;
        return this;
    }

    public GetGameCenterGlobalSettingResponse setAutoRunTaskSetting(C47631n nVar) {
        this.AutoRunTaskSetting = nVar;
        return this;
    }

    public GetGameCenterGlobalSettingResponse setCommJsLib(C47692w wVar) {
        this.CommJsLib = wVar;
        return this;
    }

    public GetGameCenterGlobalSettingResponse setDownloadIntercept(C47555c0 c0Var) {
        this.DownloadIntercept = c0Var;
        return this;
    }

    public GetGameCenterGlobalSettingResponse setDownloaderApp(C47562d0 d0Var) {
        this.downloaderApp = d0Var;
        return this;
    }

    public GetGameCenterGlobalSettingResponse setGameBanner(C47646p0 p0Var) {
        this.GameBanner = p0Var;
        return this;
    }

    public GetGameCenterGlobalSettingResponse setGameCenterTabSetting(C47653q0 q0Var) {
        this.GameCenterTabSetting = q0Var;
        return this;
    }

    public GetGameCenterGlobalSettingResponse setGameCommunityInfo(C47660r0 r0Var) {
        this.GameCommunityInfo = r0Var;
        return this;
    }

    public GetGameCenterGlobalSettingResponse setGameDetailSetting(C47687v0 v0Var) {
        this.GameDetailSetting = v0Var;
        return this;
    }

    public GetGameCenterGlobalSettingResponse setGameIndexSetting(C47563d1 d1Var) {
        this.GameIndexSetting = d1Var;
        return this;
    }

    public GetGameCenterGlobalSettingResponse setGameLifeSetting(C47605j1 j1Var) {
        this.GameLifeSetting = j1Var;
        return this;
    }

    public GetGameCenterGlobalSettingResponse setGameReport(C47640o1 o1Var) {
        this.GameReport = o1Var;
        return this;
    }

    public GetGameCenterGlobalSettingResponse setGameSight(C47654q1 q1Var) {
        this.GameSight = q1Var;
        return this;
    }

    public GetGameCenterGlobalSettingResponse setGeneralJumpInfo(C47668s1 s1Var) {
        this.GeneralJumpInfo = s1Var;
        return this;
    }

    public GetGameCenterGlobalSettingResponse setMessageExposureStrategy(C47677t3 t3Var) {
        this.MessageExposureStrategy = t3Var;
        return this;
    }

    public GetGameCenterGlobalSettingResponse setResourcePreload(C47629m4 m4Var) {
        this.ResourcePreload = m4Var;
        return this;
    }

    public GetGameCenterGlobalSettingResponse setShowEntrance(boolean z) {
        this.ShowEntrance = z;
        return this;
    }

    public GetGameCenterGlobalSettingResponse setStatusBarStyle(C47671s4 s4Var) {
        this.StatusBarStyle = s4Var;
        return this;
    }

    public GetGameCenterGlobalSettingResponse setWebViewControl(C47644o5 o5Var) {
        this.WebViewControl = o5Var;
        return this;
    }

    public GetGameCenterGlobalSettingResponse setWepkgControl(C47651p5 p5Var) {
        this.WepkgControl = p5Var;
        return this;
    }
}
