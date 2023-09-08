package com.tencent.p014mm.protocal.protobuf;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import te3.C64825xb1;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: com.tencent.mm.protocal.protobuf.FinderMediaReportObject */
public class FinderMediaReportObject extends C47465a {
    public int cdnControl;
    public int cdnUploadRetCode;
    public int cdnUploadTime;
    public C64825xb1 codecInfo;
    public int isBigFile;
    public String mediaId;
    public int mediaType;
    public LinkedList<FinderMediaReportInfo> multiMediaInfo = new LinkedList<>();
    public FinderMediaReportInfo origin;
    public int playDecoderType;
    public int remuxRetCode;
    public int remuxTime;
    public FinderMediaReportInfo target;
    public int videoFinalSize;
    public int zipRetCode;
    public int zipTime;

    public static final FinderMediaReportObject create() {
        return new FinderMediaReportObject();
    }

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof FinderMediaReportObject)) {
            return false;
        }
        FinderMediaReportObject finderMediaReportObject = (FinderMediaReportObject) aVar;
        return C46238a.m51546a(Integer.valueOf(this.remuxTime), Integer.valueOf(finderMediaReportObject.remuxTime)) && C46238a.m51546a(Integer.valueOf(this.remuxRetCode), Integer.valueOf(finderMediaReportObject.remuxRetCode)) && C46238a.m51546a(Integer.valueOf(this.cdnUploadTime), Integer.valueOf(finderMediaReportObject.cdnUploadTime)) && C46238a.m51546a(Integer.valueOf(this.cdnUploadRetCode), Integer.valueOf(finderMediaReportObject.cdnUploadRetCode)) && C46238a.m51546a(Integer.valueOf(this.zipTime), Integer.valueOf(finderMediaReportObject.zipTime)) && C46238a.m51546a(Integer.valueOf(this.zipRetCode), Integer.valueOf(finderMediaReportObject.zipRetCode)) && C46238a.m51546a(Integer.valueOf(this.mediaType), Integer.valueOf(finderMediaReportObject.mediaType)) && C46238a.m51546a(this.mediaId, finderMediaReportObject.mediaId) && C46238a.m51546a(this.origin, finderMediaReportObject.origin) && C46238a.m51546a(this.target, finderMediaReportObject.target) && C46238a.m51546a(Integer.valueOf(this.isBigFile), Integer.valueOf(finderMediaReportObject.isBigFile)) && C46238a.m51546a(Integer.valueOf(this.cdnControl), Integer.valueOf(finderMediaReportObject.cdnControl)) && C46238a.m51546a(Integer.valueOf(this.videoFinalSize), Integer.valueOf(finderMediaReportObject.videoFinalSize)) && C46238a.m51546a(this.multiMediaInfo, finderMediaReportObject.multiMediaInfo) && C46238a.m51546a(this.codecInfo, finderMediaReportObject.codecInfo) && C46238a.m51546a(Integer.valueOf(this.playDecoderType), Integer.valueOf(finderMediaReportObject.playDecoderType));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.remuxTime);
            aVar.mo74318e(2, this.remuxRetCode);
            aVar.mo74318e(3, this.cdnUploadTime);
            aVar.mo74318e(4, this.cdnUploadRetCode);
            aVar.mo74318e(5, this.zipTime);
            aVar.mo74318e(6, this.zipRetCode);
            aVar.mo74318e(7, this.mediaType);
            String str = this.mediaId;
            if (str != null) {
                aVar.mo74323j(8, str);
            }
            FinderMediaReportInfo finderMediaReportInfo = this.origin;
            if (finderMediaReportInfo != null) {
                aVar.mo74322i(9, finderMediaReportInfo.computeSize());
                this.origin.writeFields(aVar);
            }
            FinderMediaReportInfo finderMediaReportInfo2 = this.target;
            if (finderMediaReportInfo2 != null) {
                aVar.mo74322i(10, finderMediaReportInfo2.computeSize());
                this.target.writeFields(aVar);
            }
            aVar.mo74318e(11, this.isBigFile);
            aVar.mo74318e(12, this.cdnControl);
            aVar.mo74318e(13, this.videoFinalSize);
            aVar.mo74320g(14, 8, this.multiMediaInfo);
            C64825xb1 xb12 = this.codecInfo;
            if (xb12 != null) {
                aVar.mo74322i(15, xb12.computeSize());
                this.codecInfo.writeFields(aVar);
            }
            aVar.mo74318e(16, this.playDecoderType);
            return 0;
        } else if (i2 == 1) {
            int e = C52418a.m58678e(1, this.remuxTime) + 0 + C52418a.m58678e(2, this.remuxRetCode) + C52418a.m58678e(3, this.cdnUploadTime) + C52418a.m58678e(4, this.cdnUploadRetCode) + C52418a.m58678e(5, this.zipTime) + C52418a.m58678e(6, this.zipRetCode) + C52418a.m58678e(7, this.mediaType);
            String str2 = this.mediaId;
            if (str2 != null) {
                e += C52418a.m58683j(8, str2);
            }
            FinderMediaReportInfo finderMediaReportInfo3 = this.origin;
            if (finderMediaReportInfo3 != null) {
                e += C52418a.m58682i(9, finderMediaReportInfo3.computeSize());
            }
            FinderMediaReportInfo finderMediaReportInfo4 = this.target;
            if (finderMediaReportInfo4 != null) {
                e += C52418a.m58682i(10, finderMediaReportInfo4.computeSize());
            }
            int e2 = e + C52418a.m58678e(11, this.isBigFile) + C52418a.m58678e(12, this.cdnControl) + C52418a.m58678e(13, this.videoFinalSize) + C52418a.m58680g(14, 8, this.multiMediaInfo);
            C64825xb1 xb13 = this.codecInfo;
            if (xb13 != null) {
                e2 += C52418a.m58682i(15, xb13.computeSize());
            }
            return e2 + C52418a.m58678e(16, this.playDecoderType);
        } else if (i2 == 2) {
            this.multiMediaInfo.clear();
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
            FinderMediaReportObject finderMediaReportObject = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    finderMediaReportObject.remuxTime = aVar3.mo141629g(intValue);
                    return 0;
                case 2:
                    finderMediaReportObject.remuxRetCode = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    finderMediaReportObject.cdnUploadTime = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    finderMediaReportObject.cdnUploadRetCode = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    finderMediaReportObject.zipTime = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    finderMediaReportObject.zipRetCode = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    finderMediaReportObject.mediaType = aVar3.mo141629g(intValue);
                    return 0;
                case 8:
                    finderMediaReportObject.mediaId = aVar3.mo141633k(intValue);
                    return 0;
                case 9:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j.get(i3);
                        FinderMediaReportInfo finderMediaReportInfo5 = new FinderMediaReportInfo();
                        if (bArr != null && bArr.length > 0) {
                            finderMediaReportInfo5.parseFrom(bArr);
                        }
                        finderMediaReportObject.origin = finderMediaReportInfo5;
                    }
                    return 0;
                case 10:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        FinderMediaReportInfo finderMediaReportInfo6 = new FinderMediaReportInfo();
                        if (bArr2 != null && bArr2.length > 0) {
                            finderMediaReportInfo6.parseFrom(bArr2);
                        }
                        finderMediaReportObject.target = finderMediaReportInfo6;
                    }
                    return 0;
                case 11:
                    finderMediaReportObject.isBigFile = aVar3.mo141629g(intValue);
                    return 0;
                case 12:
                    finderMediaReportObject.cdnControl = aVar3.mo141629g(intValue);
                    return 0;
                case 13:
                    finderMediaReportObject.videoFinalSize = aVar3.mo141629g(intValue);
                    return 0;
                case 14:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i5 = 0; i5 < size3; i5++) {
                        byte[] bArr3 = j3.get(i5);
                        FinderMediaReportInfo finderMediaReportInfo7 = new FinderMediaReportInfo();
                        if (bArr3 != null && bArr3.length > 0) {
                            finderMediaReportInfo7.parseFrom(bArr3);
                        }
                        finderMediaReportObject.multiMediaInfo.add(finderMediaReportInfo7);
                    }
                    return 0;
                case 15:
                    LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                    int size4 = j4.size();
                    for (int i6 = 0; i6 < size4; i6++) {
                        byte[] bArr4 = j4.get(i6);
                        C64825xb1 xb14 = new C64825xb1();
                        if (bArr4 != null && bArr4.length > 0) {
                            xb14.parseFrom(bArr4);
                        }
                        finderMediaReportObject.codecInfo = xb14;
                    }
                    return 0;
                case 16:
                    finderMediaReportObject.playDecoderType = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }

    public FinderMediaReportObject setCdnControl(int i) {
        this.cdnControl = i;
        return this;
    }

    public FinderMediaReportObject setCdnUploadRetCode(int i) {
        this.cdnUploadRetCode = i;
        return this;
    }

    public FinderMediaReportObject setCdnUploadTime(int i) {
        this.cdnUploadTime = i;
        return this;
    }

    public FinderMediaReportObject setCodecInfo(C64825xb1 xb12) {
        this.codecInfo = xb12;
        return this;
    }

    public FinderMediaReportObject setIsBigFile(int i) {
        this.isBigFile = i;
        return this;
    }

    public FinderMediaReportObject setMediaId(String str) {
        this.mediaId = str;
        return this;
    }

    public FinderMediaReportObject setMediaType(int i) {
        this.mediaType = i;
        return this;
    }

    public FinderMediaReportObject setMultiMediaInfo(LinkedList<FinderMediaReportInfo> linkedList) {
        this.multiMediaInfo = linkedList;
        return this;
    }

    public FinderMediaReportObject setOrigin(FinderMediaReportInfo finderMediaReportInfo) {
        this.origin = finderMediaReportInfo;
        return this;
    }

    public FinderMediaReportObject setPlayDecoderType(int i) {
        this.playDecoderType = i;
        return this;
    }

    public FinderMediaReportObject setRemuxRetCode(int i) {
        this.remuxRetCode = i;
        return this;
    }

    public FinderMediaReportObject setRemuxTime(int i) {
        this.remuxTime = i;
        return this;
    }

    public FinderMediaReportObject setTarget(FinderMediaReportInfo finderMediaReportInfo) {
        this.target = finderMediaReportInfo;
        return this;
    }

    public FinderMediaReportObject setVideoFinalSize(int i) {
        this.videoFinalSize = i;
        return this;
    }

    public FinderMediaReportObject setZipRetCode(int i) {
        this.zipRetCode = i;
        return this;
    }

    public FinderMediaReportObject setZipTime(int i) {
        this.zipTime = i;
        return this;
    }
}
