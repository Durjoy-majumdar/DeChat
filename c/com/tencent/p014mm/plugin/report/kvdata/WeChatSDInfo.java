package com.tencent.p014mm.plugin.report.kvdata;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: com.tencent.mm.plugin.report.kvdata.WeChatSDInfo */
public class WeChatSDInfo extends C47465a {
    public int depth_;
    public long dirCount_;
    public long fileCount_;
    public long fileLenInvalidCount_;
    public LinkedList<SubDirInfo> subDirList_ = new LinkedList<>();
    public int subDirResultsSize_;
    public long tempAccDirCount_;
    public int tempAccDirResultsSize_;
    public long tempAccFileCount_;
    public long tempAccFileLenInvalidCount_;
    public long tempAccTotalSize_;
    public long totalSize_;
    public long totalTime_;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof WeChatSDInfo)) {
            return false;
        }
        WeChatSDInfo weChatSDInfo = (WeChatSDInfo) aVar;
        return C46238a.m51546a(Long.valueOf(this.totalSize_), Long.valueOf(weChatSDInfo.totalSize_)) && C46238a.m51546a(Long.valueOf(this.dirCount_), Long.valueOf(weChatSDInfo.dirCount_)) && C46238a.m51546a(Long.valueOf(this.fileCount_), Long.valueOf(weChatSDInfo.fileCount_)) && C46238a.m51546a(Long.valueOf(this.fileLenInvalidCount_), Long.valueOf(weChatSDInfo.fileLenInvalidCount_)) && C46238a.m51546a(Integer.valueOf(this.subDirResultsSize_), Integer.valueOf(weChatSDInfo.subDirResultsSize_)) && C46238a.m51546a(Long.valueOf(this.totalTime_), Long.valueOf(weChatSDInfo.totalTime_)) && C46238a.m51546a(Integer.valueOf(this.depth_), Integer.valueOf(weChatSDInfo.depth_)) && C46238a.m51546a(Long.valueOf(this.tempAccTotalSize_), Long.valueOf(weChatSDInfo.tempAccTotalSize_)) && C46238a.m51546a(Integer.valueOf(this.tempAccDirResultsSize_), Integer.valueOf(weChatSDInfo.tempAccDirResultsSize_)) && C46238a.m51546a(Long.valueOf(this.tempAccDirCount_), Long.valueOf(weChatSDInfo.tempAccDirCount_)) && C46238a.m51546a(Long.valueOf(this.tempAccFileCount_), Long.valueOf(weChatSDInfo.tempAccFileCount_)) && C46238a.m51546a(Long.valueOf(this.tempAccFileLenInvalidCount_), Long.valueOf(weChatSDInfo.tempAccFileLenInvalidCount_)) && C46238a.m51546a(this.subDirList_, weChatSDInfo.subDirList_);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74321h(1, this.totalSize_);
            aVar.mo74321h(2, this.dirCount_);
            aVar.mo74321h(3, this.fileCount_);
            aVar.mo74321h(4, this.fileLenInvalidCount_);
            aVar.mo74318e(5, this.subDirResultsSize_);
            aVar.mo74321h(6, this.totalTime_);
            aVar.mo74318e(7, this.depth_);
            aVar.mo74321h(8, this.tempAccTotalSize_);
            aVar.mo74318e(9, this.tempAccDirResultsSize_);
            aVar.mo74321h(10, this.tempAccDirCount_);
            aVar.mo74321h(11, this.tempAccFileCount_);
            aVar.mo74321h(12, this.tempAccFileLenInvalidCount_);
            aVar.mo74320g(13, 8, this.subDirList_);
            return 0;
        } else if (i2 == 1) {
            return C52418a.m58681h(1, this.totalSize_) + 0 + C52418a.m58681h(2, this.dirCount_) + C52418a.m58681h(3, this.fileCount_) + C52418a.m58681h(4, this.fileLenInvalidCount_) + C52418a.m58678e(5, this.subDirResultsSize_) + C52418a.m58681h(6, this.totalTime_) + C52418a.m58678e(7, this.depth_) + C52418a.m58681h(8, this.tempAccTotalSize_) + C52418a.m58678e(9, this.tempAccDirResultsSize_) + C52418a.m58681h(10, this.tempAccDirCount_) + C52418a.m58681h(11, this.tempAccFileCount_) + C52418a.m58681h(12, this.tempAccFileLenInvalidCount_) + C52418a.m58680g(13, 8, this.subDirList_);
        } else {
            if (i2 == 2) {
                this.subDirList_.clear();
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
                WeChatSDInfo weChatSDInfo = objArr[1];
                int intValue = objArr[2].intValue();
                switch (intValue) {
                    case 1:
                        weChatSDInfo.totalSize_ = aVar3.mo141631i(intValue);
                        return 0;
                    case 2:
                        weChatSDInfo.dirCount_ = aVar3.mo141631i(intValue);
                        return 0;
                    case 3:
                        weChatSDInfo.fileCount_ = aVar3.mo141631i(intValue);
                        return 0;
                    case 4:
                        weChatSDInfo.fileLenInvalidCount_ = aVar3.mo141631i(intValue);
                        return 0;
                    case 5:
                        weChatSDInfo.subDirResultsSize_ = aVar3.mo141629g(intValue);
                        return 0;
                    case 6:
                        weChatSDInfo.totalTime_ = aVar3.mo141631i(intValue);
                        return 0;
                    case 7:
                        weChatSDInfo.depth_ = aVar3.mo141629g(intValue);
                        return 0;
                    case 8:
                        weChatSDInfo.tempAccTotalSize_ = aVar3.mo141631i(intValue);
                        return 0;
                    case 9:
                        weChatSDInfo.tempAccDirResultsSize_ = aVar3.mo141629g(intValue);
                        return 0;
                    case 10:
                        weChatSDInfo.tempAccDirCount_ = aVar3.mo141631i(intValue);
                        return 0;
                    case 11:
                        weChatSDInfo.tempAccFileCount_ = aVar3.mo141631i(intValue);
                        return 0;
                    case 12:
                        weChatSDInfo.tempAccFileLenInvalidCount_ = aVar3.mo141631i(intValue);
                        return 0;
                    case 13:
                        LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                        int size = j.size();
                        for (int i3 = 0; i3 < size; i3++) {
                            byte[] bArr = j.get(i3);
                            SubDirInfo subDirInfo = new SubDirInfo();
                            if (bArr != null && bArr.length > 0) {
                                subDirInfo.parseFrom(bArr);
                            }
                            weChatSDInfo.subDirList_.add(subDirInfo);
                        }
                        return 0;
                    default:
                        return -1;
                }
            }
        }
    }
}
