package com.tencent.p014mm.protocal.protobuf;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: com.tencent.mm.protocal.protobuf.FinderMediaReportInfo */
public class FinderMediaReportInfo extends C47465a {
    public int audioBitrate;
    public int fileSize;
    public int fps;
    public int height;
    public int videoBitrate;
    public int videoDuration;
    public int width;

    public static final FinderMediaReportInfo create() {
        return new FinderMediaReportInfo();
    }

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof FinderMediaReportInfo)) {
            return false;
        }
        FinderMediaReportInfo finderMediaReportInfo = (FinderMediaReportInfo) aVar;
        return C46238a.m51546a(Integer.valueOf(this.videoDuration), Integer.valueOf(finderMediaReportInfo.videoDuration)) && C46238a.m51546a(Integer.valueOf(this.videoBitrate), Integer.valueOf(finderMediaReportInfo.videoBitrate)) && C46238a.m51546a(Integer.valueOf(this.width), Integer.valueOf(finderMediaReportInfo.width)) && C46238a.m51546a(Integer.valueOf(this.height), Integer.valueOf(finderMediaReportInfo.height)) && C46238a.m51546a(Integer.valueOf(this.fileSize), Integer.valueOf(finderMediaReportInfo.fileSize)) && C46238a.m51546a(Integer.valueOf(this.audioBitrate), Integer.valueOf(finderMediaReportInfo.audioBitrate)) && C46238a.m51546a(Integer.valueOf(this.fps), Integer.valueOf(finderMediaReportInfo.fps));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.videoDuration);
            aVar.mo74318e(2, this.videoBitrate);
            aVar.mo74318e(3, this.width);
            aVar.mo74318e(4, this.height);
            aVar.mo74318e(5, this.fileSize);
            aVar.mo74318e(6, this.audioBitrate);
            aVar.mo74318e(7, this.fps);
            return 0;
        } else if (i == 1) {
            return C52418a.m58678e(1, this.videoDuration) + 0 + C52418a.m58678e(2, this.videoBitrate) + C52418a.m58678e(3, this.width) + C52418a.m58678e(4, this.height) + C52418a.m58678e(5, this.fileSize) + C52418a.m58678e(6, this.audioBitrate) + C52418a.m58678e(7, this.fps);
        } else {
            if (i == 2) {
                C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
                for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                    if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                        aVar2.mo141624b();
                    }
                }
                return 0;
            } else if (i != 3) {
                return -1;
            } else {
                C102122a aVar3 = objArr[0];
                FinderMediaReportInfo finderMediaReportInfo = objArr[1];
                int intValue = objArr[2].intValue();
                switch (intValue) {
                    case 1:
                        finderMediaReportInfo.videoDuration = aVar3.mo141629g(intValue);
                        return 0;
                    case 2:
                        finderMediaReportInfo.videoBitrate = aVar3.mo141629g(intValue);
                        return 0;
                    case 3:
                        finderMediaReportInfo.width = aVar3.mo141629g(intValue);
                        return 0;
                    case 4:
                        finderMediaReportInfo.height = aVar3.mo141629g(intValue);
                        return 0;
                    case 5:
                        finderMediaReportInfo.fileSize = aVar3.mo141629g(intValue);
                        return 0;
                    case 6:
                        finderMediaReportInfo.audioBitrate = aVar3.mo141629g(intValue);
                        return 0;
                    case 7:
                        finderMediaReportInfo.fps = aVar3.mo141629g(intValue);
                        return 0;
                    default:
                        return -1;
                }
            }
        }
    }

    public FinderMediaReportInfo setAudioBitrate(int i) {
        this.audioBitrate = i;
        return this;
    }

    public FinderMediaReportInfo setFileSize(int i) {
        this.fileSize = i;
        return this;
    }

    public FinderMediaReportInfo setFps(int i) {
        this.fps = i;
        return this;
    }

    public FinderMediaReportInfo setHeight(int i) {
        this.height = i;
        return this;
    }

    public FinderMediaReportInfo setVideoBitrate(int i) {
        this.videoBitrate = i;
        return this;
    }

    public FinderMediaReportInfo setVideoDuration(int i) {
        this.videoDuration = i;
        return this;
    }

    public FinderMediaReportInfo setWidth(int i) {
        this.width = i;
        return this;
    }
}
