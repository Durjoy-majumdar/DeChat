package com.tencent.p014mm.protocal.protobuf;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: com.tencent.mm.protocal.protobuf.FinderJsApiMediaThumbInfo */
public class FinderJsApiMediaThumbInfo extends C47465a {
    public int thumbHeight;
    public String thumbPath;
    public int thumbWidth;

    public static final FinderJsApiMediaThumbInfo create() {
        return new FinderJsApiMediaThumbInfo();
    }

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof FinderJsApiMediaThumbInfo)) {
            return false;
        }
        FinderJsApiMediaThumbInfo finderJsApiMediaThumbInfo = (FinderJsApiMediaThumbInfo) aVar;
        return C46238a.m51546a(Integer.valueOf(this.thumbWidth), Integer.valueOf(finderJsApiMediaThumbInfo.thumbWidth)) && C46238a.m51546a(Integer.valueOf(this.thumbHeight), Integer.valueOf(finderJsApiMediaThumbInfo.thumbHeight)) && C46238a.m51546a(this.thumbPath, finderJsApiMediaThumbInfo.thumbPath);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.thumbWidth);
            aVar.mo74318e(2, this.thumbHeight);
            String str = this.thumbPath;
            if (str != null) {
                aVar.mo74323j(3, str);
            }
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.thumbWidth) + 0 + C52418a.m58678e(2, this.thumbHeight);
            String str2 = this.thumbPath;
            return str2 != null ? e + C52418a.m58683j(3, str2) : e;
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
            FinderJsApiMediaThumbInfo finderJsApiMediaThumbInfo = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                finderJsApiMediaThumbInfo.thumbWidth = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 2) {
                finderJsApiMediaThumbInfo.thumbHeight = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                finderJsApiMediaThumbInfo.thumbPath = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }

    public FinderJsApiMediaThumbInfo setThumbHeight(int i) {
        this.thumbHeight = i;
        return this;
    }

    public FinderJsApiMediaThumbInfo setThumbPath(String str) {
        this.thumbPath = str;
        return this;
    }

    public FinderJsApiMediaThumbInfo setThumbWidth(int i) {
        this.thumbWidth = i;
        return this;
    }
}
