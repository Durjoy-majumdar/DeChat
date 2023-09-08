package com.tencent.p014mm.protocal.protobuf;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import te3.C101789j00;
import te3.C101796jo2;
import te3.C101799k1;
import te3.C101802kr2;
import te3.C101815ms1;
import te3.C101833r5;
import te3.d05;
import te3.e94;
import te3.sc4;
import te3.w25;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: com.tencent.mm.protocal.protobuf.TimeLineObject */
public class TimeLineObject extends C47465a {

    /* renamed from: d */
    public static final /* synthetic */ int f283892d = 0;
    public C101833r5 AppInfo;
    public String ContentDesc;
    public C101789j00 ContentObj;
    public int CreateTime;

    /* renamed from: Id */
    public String f283893Id;
    public C101802kr2 Location;
    public int Privated;
    public String UserName;
    public C101799k1 actionInfo;
    public String canvasInfo;
    public int contentDescScene;
    public int contentDescShowType;
    public int contentattr;
    public C101815ms1 gameShareCardObject;
    public boolean isExcerpt;
    public C101796jo2 liteappInfo;
    public String publicUserName;
    public int showFlag;
    public int sightFolded;
    public String snsExcerptUrl;
    public String sourceNickName;
    public String sourceUserName;
    public String statExtStr;
    public String statisticsData;
    public sc4 streamvideo;
    public e94 videoTemplate;
    public d05 weappInfo;
    public w25 webSearchInfo;

    public static final TimeLineObject create() {
        return new TimeLineObject();
    }

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof TimeLineObject)) {
            return false;
        }
        TimeLineObject timeLineObject = (TimeLineObject) aVar;
        return C46238a.m51546a(this.f283893Id, timeLineObject.f283893Id) && C46238a.m51546a(this.UserName, timeLineObject.UserName) && C46238a.m51546a(Integer.valueOf(this.Privated), Integer.valueOf(timeLineObject.Privated)) && C46238a.m51546a(Integer.valueOf(this.CreateTime), Integer.valueOf(timeLineObject.CreateTime)) && C46238a.m51546a(this.ContentDesc, timeLineObject.ContentDesc) && C46238a.m51546a(this.Location, timeLineObject.Location) && C46238a.m51546a(this.AppInfo, timeLineObject.AppInfo) && C46238a.m51546a(this.ContentObj, timeLineObject.ContentObj) && C46238a.m51546a(this.sourceUserName, timeLineObject.sourceUserName) && C46238a.m51546a(this.sourceNickName, timeLineObject.sourceNickName) && C46238a.m51546a(this.publicUserName, timeLineObject.publicUserName) && C46238a.m51546a(Integer.valueOf(this.contentDescShowType), Integer.valueOf(timeLineObject.contentDescShowType)) && C46238a.m51546a(Integer.valueOf(this.contentDescScene), Integer.valueOf(timeLineObject.contentDescScene)) && C46238a.m51546a(this.statisticsData, timeLineObject.statisticsData) && C46238a.m51546a(this.actionInfo, timeLineObject.actionInfo) && C46238a.m51546a(Integer.valueOf(this.contentattr), Integer.valueOf(timeLineObject.contentattr)) && C46238a.m51546a(this.streamvideo, timeLineObject.streamvideo) && C46238a.m51546a(this.statExtStr, timeLineObject.statExtStr) && C46238a.m51546a(this.canvasInfo, timeLineObject.canvasInfo) && C46238a.m51546a(this.weappInfo, timeLineObject.weappInfo) && C46238a.m51546a(Integer.valueOf(this.sightFolded), Integer.valueOf(timeLineObject.sightFolded)) && C46238a.m51546a(this.webSearchInfo, timeLineObject.webSearchInfo) && C46238a.m51546a(Integer.valueOf(this.showFlag), Integer.valueOf(timeLineObject.showFlag)) && C46238a.m51546a(this.liteappInfo, timeLineObject.liteappInfo) && C46238a.m51546a(this.videoTemplate, timeLineObject.videoTemplate) && C46238a.m51546a(this.snsExcerptUrl, timeLineObject.snsExcerptUrl) && C46238a.m51546a(Boolean.valueOf(this.isExcerpt), Boolean.valueOf(timeLineObject.isExcerpt)) && C46238a.m51546a(this.gameShareCardObject, timeLineObject.gameShareCardObject);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        int i3 = 0;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            String str = this.f283893Id;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.UserName;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            aVar.mo74318e(3, this.Privated);
            aVar.mo74318e(4, this.CreateTime);
            String str3 = this.ContentDesc;
            if (str3 != null) {
                aVar.mo74323j(5, str3);
            }
            C101802kr2 kr22 = this.Location;
            if (kr22 != null) {
                aVar.mo74322i(6, kr22.computeSize());
                this.Location.writeFields(aVar);
            }
            C101833r5 r5Var = this.AppInfo;
            if (r5Var != null) {
                aVar.mo74322i(7, r5Var.computeSize());
                this.AppInfo.writeFields(aVar);
            }
            C101789j00 j002 = this.ContentObj;
            if (j002 != null) {
                aVar.mo74322i(8, j002.computeSize());
                this.ContentObj.writeFields(aVar);
            }
            String str4 = this.sourceUserName;
            if (str4 != null) {
                aVar.mo74323j(9, str4);
            }
            String str5 = this.sourceNickName;
            if (str5 != null) {
                aVar.mo74323j(10, str5);
            }
            String str6 = this.publicUserName;
            if (str6 != null) {
                aVar.mo74323j(11, str6);
            }
            aVar.mo74318e(12, this.contentDescShowType);
            aVar.mo74318e(13, this.contentDescScene);
            String str7 = this.statisticsData;
            if (str7 != null) {
                aVar.mo74323j(14, str7);
            }
            C101799k1 k1Var = this.actionInfo;
            if (k1Var != null) {
                aVar.mo74322i(15, k1Var.computeSize());
                this.actionInfo.writeFields(aVar);
            }
            aVar.mo74318e(16, this.contentattr);
            sc4 sc4 = this.streamvideo;
            if (sc4 != null) {
                aVar.mo74322i(17, sc4.computeSize());
                this.streamvideo.writeFields(aVar);
            }
            String str8 = this.statExtStr;
            if (str8 != null) {
                aVar.mo74323j(18, str8);
            }
            String str9 = this.canvasInfo;
            if (str9 != null) {
                aVar.mo74323j(19, str9);
            }
            d05 d05 = this.weappInfo;
            if (d05 != null) {
                aVar.mo74322i(20, d05.computeSize());
                this.weappInfo.writeFields(aVar);
            }
            aVar.mo74318e(21, this.sightFolded);
            w25 w25 = this.webSearchInfo;
            if (w25 != null) {
                aVar.mo74322i(22, w25.computeSize());
                this.webSearchInfo.writeFields(aVar);
            }
            aVar.mo74318e(23, this.showFlag);
            C101796jo2 jo22 = this.liteappInfo;
            if (jo22 != null) {
                aVar.mo74322i(24, jo22.computeSize());
                this.liteappInfo.writeFields(aVar);
            }
            e94 e94 = this.videoTemplate;
            if (e94 != null) {
                aVar.mo74322i(25, e94.computeSize());
                this.videoTemplate.writeFields(aVar);
            }
            String str10 = this.snsExcerptUrl;
            if (str10 != null) {
                aVar.mo74323j(26, str10);
            }
            aVar.mo74314a(27, this.isExcerpt);
            C101815ms1 ms12 = this.gameShareCardObject;
            if (ms12 != null) {
                aVar.mo74322i(28, ms12.computeSize());
                this.gameShareCardObject.writeFields(aVar);
            }
            return 0;
        } else if (i2 == 1) {
            String str11 = this.f283893Id;
            if (str11 != null) {
                i3 = C52418a.m58683j(1, str11) + 0;
            }
            String str12 = this.UserName;
            if (str12 != null) {
                i3 += C52418a.m58683j(2, str12);
            }
            int e = i3 + C52418a.m58678e(3, this.Privated) + C52418a.m58678e(4, this.CreateTime);
            String str13 = this.ContentDesc;
            if (str13 != null) {
                e += C52418a.m58683j(5, str13);
            }
            C101802kr2 kr23 = this.Location;
            if (kr23 != null) {
                e += C52418a.m58682i(6, kr23.computeSize());
            }
            C101833r5 r5Var2 = this.AppInfo;
            if (r5Var2 != null) {
                e += C52418a.m58682i(7, r5Var2.computeSize());
            }
            C101789j00 j003 = this.ContentObj;
            if (j003 != null) {
                e += C52418a.m58682i(8, j003.computeSize());
            }
            String str14 = this.sourceUserName;
            if (str14 != null) {
                e += C52418a.m58683j(9, str14);
            }
            String str15 = this.sourceNickName;
            if (str15 != null) {
                e += C52418a.m58683j(10, str15);
            }
            String str16 = this.publicUserName;
            if (str16 != null) {
                e += C52418a.m58683j(11, str16);
            }
            int e2 = e + C52418a.m58678e(12, this.contentDescShowType) + C52418a.m58678e(13, this.contentDescScene);
            String str17 = this.statisticsData;
            if (str17 != null) {
                e2 += C52418a.m58683j(14, str17);
            }
            C101799k1 k1Var2 = this.actionInfo;
            if (k1Var2 != null) {
                e2 += C52418a.m58682i(15, k1Var2.computeSize());
            }
            int e3 = e2 + C52418a.m58678e(16, this.contentattr);
            sc4 sc42 = this.streamvideo;
            if (sc42 != null) {
                e3 += C52418a.m58682i(17, sc42.computeSize());
            }
            String str18 = this.statExtStr;
            if (str18 != null) {
                e3 += C52418a.m58683j(18, str18);
            }
            String str19 = this.canvasInfo;
            if (str19 != null) {
                e3 += C52418a.m58683j(19, str19);
            }
            d05 d052 = this.weappInfo;
            if (d052 != null) {
                e3 += C52418a.m58682i(20, d052.computeSize());
            }
            int e4 = e3 + C52418a.m58678e(21, this.sightFolded);
            w25 w252 = this.webSearchInfo;
            if (w252 != null) {
                e4 += C52418a.m58682i(22, w252.computeSize());
            }
            int e5 = e4 + C52418a.m58678e(23, this.showFlag);
            C101796jo2 jo23 = this.liteappInfo;
            if (jo23 != null) {
                e5 += C52418a.m58682i(24, jo23.computeSize());
            }
            e94 e942 = this.videoTemplate;
            if (e942 != null) {
                e5 += C52418a.m58682i(25, e942.computeSize());
            }
            String str20 = this.snsExcerptUrl;
            if (str20 != null) {
                e5 += C52418a.m58683j(26, str20);
            }
            int a = e5 + C52418a.m58674a(27, this.isExcerpt);
            C101815ms1 ms13 = this.gameShareCardObject;
            return ms13 != null ? a + C52418a.m58682i(28, ms13.computeSize()) : a;
        } else if (i2 == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            return 0;
        } else if (i2 != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            TimeLineObject timeLineObject = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    timeLineObject.f283893Id = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    timeLineObject.UserName = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    timeLineObject.Privated = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    timeLineObject.CreateTime = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    timeLineObject.ContentDesc = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i4 = 0; i4 < size; i4++) {
                        byte[] bArr = j.get(i4);
                        C101802kr2 kr24 = new C101802kr2();
                        if (bArr != null && bArr.length > 0) {
                            kr24.parseFrom(bArr);
                        }
                        timeLineObject.Location = kr24;
                    }
                    return 0;
                case 7:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i5 = 0; i5 < size2; i5++) {
                        byte[] bArr2 = j2.get(i5);
                        C101833r5 r5Var3 = new C101833r5();
                        if (bArr2 != null && bArr2.length > 0) {
                            r5Var3.parseFrom(bArr2);
                        }
                        timeLineObject.AppInfo = r5Var3;
                    }
                    return 0;
                case 8:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i6 = 0; i6 < size3; i6++) {
                        byte[] bArr3 = j3.get(i6);
                        C101789j00 j004 = new C101789j00();
                        if (bArr3 != null && bArr3.length > 0) {
                            j004.parseFrom(bArr3);
                        }
                        timeLineObject.ContentObj = j004;
                    }
                    return 0;
                case 9:
                    timeLineObject.sourceUserName = aVar3.mo141633k(intValue);
                    return 0;
                case 10:
                    timeLineObject.sourceNickName = aVar3.mo141633k(intValue);
                    return 0;
                case 11:
                    timeLineObject.publicUserName = aVar3.mo141633k(intValue);
                    return 0;
                case 12:
                    timeLineObject.contentDescShowType = aVar3.mo141629g(intValue);
                    return 0;
                case 13:
                    timeLineObject.contentDescScene = aVar3.mo141629g(intValue);
                    return 0;
                case 14:
                    timeLineObject.statisticsData = aVar3.mo141633k(intValue);
                    return 0;
                case 15:
                    LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                    int size4 = j4.size();
                    for (int i7 = 0; i7 < size4; i7++) {
                        byte[] bArr4 = j4.get(i7);
                        C101799k1 k1Var3 = new C101799k1();
                        if (bArr4 != null && bArr4.length > 0) {
                            k1Var3.parseFrom(bArr4);
                        }
                        timeLineObject.actionInfo = k1Var3;
                    }
                    return 0;
                case 16:
                    timeLineObject.contentattr = aVar3.mo141629g(intValue);
                    return 0;
                case 17:
                    LinkedList<byte[]> j5 = aVar3.mo141632j(intValue);
                    int size5 = j5.size();
                    for (int i8 = 0; i8 < size5; i8++) {
                        byte[] bArr5 = j5.get(i8);
                        sc4 sc43 = new sc4();
                        if (bArr5 != null && bArr5.length > 0) {
                            sc43.parseFrom(bArr5);
                        }
                        timeLineObject.streamvideo = sc43;
                    }
                    return 0;
                case 18:
                    timeLineObject.statExtStr = aVar3.mo141633k(intValue);
                    return 0;
                case 19:
                    timeLineObject.canvasInfo = aVar3.mo141633k(intValue);
                    return 0;
                case 20:
                    LinkedList<byte[]> j6 = aVar3.mo141632j(intValue);
                    int size6 = j6.size();
                    for (int i9 = 0; i9 < size6; i9++) {
                        byte[] bArr6 = j6.get(i9);
                        d05 d053 = new d05();
                        if (bArr6 != null && bArr6.length > 0) {
                            d053.parseFrom(bArr6);
                        }
                        timeLineObject.weappInfo = d053;
                    }
                    return 0;
                case 21:
                    timeLineObject.sightFolded = aVar3.mo141629g(intValue);
                    return 0;
                case 22:
                    LinkedList<byte[]> j7 = aVar3.mo141632j(intValue);
                    int size7 = j7.size();
                    for (int i15 = 0; i15 < size7; i15++) {
                        byte[] bArr7 = j7.get(i15);
                        w25 w253 = new w25();
                        if (bArr7 != null && bArr7.length > 0) {
                            w253.parseFrom(bArr7);
                        }
                        timeLineObject.webSearchInfo = w253;
                    }
                    return 0;
                case 23:
                    timeLineObject.showFlag = aVar3.mo141629g(intValue);
                    return 0;
                case 24:
                    LinkedList<byte[]> j8 = aVar3.mo141632j(intValue);
                    int size8 = j8.size();
                    for (int i16 = 0; i16 < size8; i16++) {
                        byte[] bArr8 = j8.get(i16);
                        C101796jo2 jo24 = new C101796jo2();
                        if (bArr8 != null && bArr8.length > 0) {
                            jo24.parseFrom(bArr8);
                        }
                        timeLineObject.liteappInfo = jo24;
                    }
                    return 0;
                case 25:
                    LinkedList<byte[]> j9 = aVar3.mo141632j(intValue);
                    int size9 = j9.size();
                    for (int i17 = 0; i17 < size9; i17++) {
                        byte[] bArr9 = j9.get(i17);
                        e94 e943 = new e94();
                        if (bArr9 != null && bArr9.length > 0) {
                            e943.parseFrom(bArr9);
                        }
                        timeLineObject.videoTemplate = e943;
                    }
                    return 0;
                case 26:
                    timeLineObject.snsExcerptUrl = aVar3.mo141633k(intValue);
                    return 0;
                case 27:
                    timeLineObject.isExcerpt = aVar3.mo141625c(intValue);
                    return 0;
                case 28:
                    LinkedList<byte[]> j15 = aVar3.mo141632j(intValue);
                    int size10 = j15.size();
                    for (int i18 = 0; i18 < size10; i18++) {
                        byte[] bArr10 = j15.get(i18);
                        C101815ms1 ms14 = new C101815ms1();
                        if (bArr10 != null && bArr10.length > 0) {
                            ms14.parseFrom(bArr10);
                        }
                        timeLineObject.gameShareCardObject = ms14;
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }

    public TimeLineObject setActionInfo(C101799k1 k1Var) {
        this.actionInfo = k1Var;
        return this;
    }

    public TimeLineObject setAppInfo(C101833r5 r5Var) {
        this.AppInfo = r5Var;
        return this;
    }

    public TimeLineObject setCanvasInfo(String str) {
        this.canvasInfo = str;
        return this;
    }

    public TimeLineObject setContentDesc(String str) {
        this.ContentDesc = str;
        return this;
    }

    public TimeLineObject setContentDescScene(int i) {
        this.contentDescScene = i;
        return this;
    }

    public TimeLineObject setContentDescShowType(int i) {
        this.contentDescShowType = i;
        return this;
    }

    public TimeLineObject setContentObj(C101789j00 j002) {
        this.ContentObj = j002;
        return this;
    }

    public TimeLineObject setContentattr(int i) {
        this.contentattr = i;
        return this;
    }

    public TimeLineObject setCreateTime(int i) {
        this.CreateTime = i;
        return this;
    }

    public TimeLineObject setGameShareCardObject(C101815ms1 ms12) {
        this.gameShareCardObject = ms12;
        return this;
    }

    public TimeLineObject setId(String str) {
        this.f283893Id = str;
        return this;
    }

    public TimeLineObject setIsExcerpt(boolean z) {
        this.isExcerpt = z;
        return this;
    }

    public TimeLineObject setLiteappInfo(C101796jo2 jo22) {
        this.liteappInfo = jo22;
        return this;
    }

    public TimeLineObject setLocation(C101802kr2 kr22) {
        this.Location = kr22;
        return this;
    }

    public TimeLineObject setPrivated(int i) {
        this.Privated = i;
        return this;
    }

    public TimeLineObject setPublicUserName(String str) {
        this.publicUserName = str;
        return this;
    }

    public TimeLineObject setShowFlag(int i) {
        this.showFlag = i;
        return this;
    }

    public TimeLineObject setSightFolded(int i) {
        this.sightFolded = i;
        return this;
    }

    public TimeLineObject setSnsExcerptUrl(String str) {
        this.snsExcerptUrl = str;
        return this;
    }

    public TimeLineObject setSourceNickName(String str) {
        this.sourceNickName = str;
        return this;
    }

    public TimeLineObject setSourceUserName(String str) {
        this.sourceUserName = str;
        return this;
    }

    public TimeLineObject setStatExtStr(String str) {
        this.statExtStr = str;
        return this;
    }

    public TimeLineObject setStatisticsData(String str) {
        this.statisticsData = str;
        return this;
    }

    public TimeLineObject setStreamvideo(sc4 sc4) {
        this.streamvideo = sc4;
        return this;
    }

    public TimeLineObject setUserName(String str) {
        this.UserName = str;
        return this;
    }

    public TimeLineObject setVideoTemplate(e94 e94) {
        this.videoTemplate = e94;
        return this;
    }

    public TimeLineObject setWeappInfo(d05 d05) {
        this.weappInfo = d05;
        return this;
    }

    public TimeLineObject setWebSearchInfo(w25 w25) {
        this.webSearchInfo = w25;
        return this;
    }
}
