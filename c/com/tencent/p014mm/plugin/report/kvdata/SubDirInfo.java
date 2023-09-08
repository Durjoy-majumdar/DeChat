package com.tencent.p014mm.plugin.report.kvdata;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: com.tencent.mm.plugin.report.kvdata.SubDirInfo */
public class SubDirInfo extends C47465a {
    public long dirCount_;
    public long fileCount_;
    public long fileLenInvalidCount;
    public int tag_;
    public long totalSize_;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof SubDirInfo)) {
            return false;
        }
        SubDirInfo subDirInfo = (SubDirInfo) aVar;
        return C46238a.m51546a(Integer.valueOf(this.tag_), Integer.valueOf(subDirInfo.tag_)) && C46238a.m51546a(Long.valueOf(this.totalSize_), Long.valueOf(subDirInfo.totalSize_)) && C46238a.m51546a(Long.valueOf(this.dirCount_), Long.valueOf(subDirInfo.dirCount_)) && C46238a.m51546a(Long.valueOf(this.fileCount_), Long.valueOf(subDirInfo.fileCount_)) && C46238a.m51546a(Long.valueOf(this.fileLenInvalidCount), Long.valueOf(subDirInfo.fileLenInvalidCount));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.tag_);
            aVar.mo74321h(2, this.totalSize_);
            aVar.mo74321h(3, this.dirCount_);
            aVar.mo74321h(4, this.fileCount_);
            aVar.mo74321h(5, this.fileLenInvalidCount);
            return 0;
        } else if (i == 1) {
            return C52418a.m58678e(1, this.tag_) + 0 + C52418a.m58681h(2, this.totalSize_) + C52418a.m58681h(3, this.dirCount_) + C52418a.m58681h(4, this.fileCount_) + C52418a.m58681h(5, this.fileLenInvalidCount);
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
                SubDirInfo subDirInfo = objArr[1];
                int intValue = objArr[2].intValue();
                if (intValue == 1) {
                    subDirInfo.tag_ = aVar3.mo141629g(intValue);
                    return 0;
                } else if (intValue == 2) {
                    subDirInfo.totalSize_ = aVar3.mo141631i(intValue);
                    return 0;
                } else if (intValue == 3) {
                    subDirInfo.dirCount_ = aVar3.mo141631i(intValue);
                    return 0;
                } else if (intValue == 4) {
                    subDirInfo.fileCount_ = aVar3.mo141631i(intValue);
                    return 0;
                } else if (intValue != 5) {
                    return -1;
                } else {
                    subDirInfo.fileLenInvalidCount = aVar3.mo141631i(intValue);
                    return 0;
                }
            }
        }
    }
}
