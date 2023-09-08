package com.tencent.p014mm.protocal.protobuf;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: com.tencent.mm.protocal.protobuf.FinderJsApiMediaObj */
public class FinderJsApiMediaObj extends C47465a {
    public String mediaPath;
    public int mediaType;
    public FinderJsApiMediaThumbInfo thumbInfo;

    public static final FinderJsApiMediaObj create() {
        return new FinderJsApiMediaObj();
    }

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof FinderJsApiMediaObj)) {
            return false;
        }
        FinderJsApiMediaObj finderJsApiMediaObj = (FinderJsApiMediaObj) aVar;
        return C46238a.m51546a(this.mediaPath, finderJsApiMediaObj.mediaPath) && C46238a.m51546a(Integer.valueOf(this.mediaType), Integer.valueOf(finderJsApiMediaObj.mediaType)) && C46238a.m51546a(this.thumbInfo, finderJsApiMediaObj.thumbInfo);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.mediaPath;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            aVar.mo74318e(2, this.mediaType);
            FinderJsApiMediaThumbInfo finderJsApiMediaThumbInfo = this.thumbInfo;
            if (finderJsApiMediaThumbInfo != null) {
                aVar.mo74322i(3, finderJsApiMediaThumbInfo.computeSize());
                this.thumbInfo.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            String str2 = this.mediaPath;
            if (str2 != null) {
                i2 = 0 + C52418a.m58683j(1, str2);
            }
            int e = i2 + C52418a.m58678e(2, this.mediaType);
            FinderJsApiMediaThumbInfo finderJsApiMediaThumbInfo2 = this.thumbInfo;
            return finderJsApiMediaThumbInfo2 != null ? e + C52418a.m58682i(3, finderJsApiMediaThumbInfo2.computeSize()) : e;
        } else if (i == 2) {
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
            FinderJsApiMediaObj finderJsApiMediaObj = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                finderJsApiMediaObj.mediaPath = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                finderJsApiMediaObj.mediaType = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    FinderJsApiMediaThumbInfo finderJsApiMediaThumbInfo3 = new FinderJsApiMediaThumbInfo();
                    if (bArr != null && bArr.length > 0) {
                        finderJsApiMediaThumbInfo3.parseFrom(bArr);
                    }
                    finderJsApiMediaObj.thumbInfo = finderJsApiMediaThumbInfo3;
                }
                return 0;
            }
        }
    }

    public FinderJsApiMediaObj setMediaPath(String str) {
        this.mediaPath = str;
        return this;
    }

    public FinderJsApiMediaObj setMediaType(int i) {
        this.mediaType = i;
        return this;
    }

    public FinderJsApiMediaObj setThumbInfo(FinderJsApiMediaThumbInfo finderJsApiMediaThumbInfo) {
        this.thumbInfo = finderJsApiMediaThumbInfo;
        return this;
    }
}
