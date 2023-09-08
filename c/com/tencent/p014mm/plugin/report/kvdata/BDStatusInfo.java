package com.tencent.p014mm.plugin.report.kvdata;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: com.tencent.mm.plugin.report.kvdata.BDStatusInfo */
public class BDStatusInfo extends C47465a {
    public long favDBSize_;
    public long mmDBSize_;
    public int mmDBTableCount_;
    public long snsDBSize_;
    public LinkedList<TableInfo> tableList_ = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof BDStatusInfo)) {
            return false;
        }
        BDStatusInfo bDStatusInfo = (BDStatusInfo) aVar;
        return C46238a.m51546a(Long.valueOf(this.mmDBSize_), Long.valueOf(bDStatusInfo.mmDBSize_)) && C46238a.m51546a(Long.valueOf(this.snsDBSize_), Long.valueOf(bDStatusInfo.snsDBSize_)) && C46238a.m51546a(Integer.valueOf(this.mmDBTableCount_), Integer.valueOf(bDStatusInfo.mmDBTableCount_)) && C46238a.m51546a(this.tableList_, bDStatusInfo.tableList_) && C46238a.m51546a(Long.valueOf(this.favDBSize_), Long.valueOf(bDStatusInfo.favDBSize_));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74321h(1, this.mmDBSize_);
            aVar.mo74321h(2, this.snsDBSize_);
            aVar.mo74318e(3, this.mmDBTableCount_);
            aVar.mo74320g(4, 8, this.tableList_);
            aVar.mo74321h(5, this.favDBSize_);
            return 0;
        } else if (i == 1) {
            return C52418a.m58681h(1, this.mmDBSize_) + 0 + C52418a.m58681h(2, this.snsDBSize_) + C52418a.m58678e(3, this.mmDBTableCount_) + C52418a.m58680g(4, 8, this.tableList_) + C52418a.m58681h(5, this.favDBSize_);
        } else {
            if (i == 2) {
                this.tableList_.clear();
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
                BDStatusInfo bDStatusInfo = objArr[1];
                int intValue = objArr[2].intValue();
                if (intValue == 1) {
                    bDStatusInfo.mmDBSize_ = aVar3.mo141631i(intValue);
                    return 0;
                } else if (intValue == 2) {
                    bDStatusInfo.snsDBSize_ = aVar3.mo141631i(intValue);
                    return 0;
                } else if (intValue == 3) {
                    bDStatusInfo.mmDBTableCount_ = aVar3.mo141629g(intValue);
                    return 0;
                } else if (intValue == 4) {
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        byte[] bArr = j.get(i2);
                        TableInfo tableInfo = new TableInfo();
                        if (bArr != null && bArr.length > 0) {
                            tableInfo.parseFrom(bArr);
                        }
                        bDStatusInfo.tableList_.add(tableInfo);
                    }
                    return 0;
                } else if (intValue != 5) {
                    return -1;
                } else {
                    bDStatusInfo.favDBSize_ = aVar3.mo141631i(intValue);
                    return 0;
                }
            }
        }
    }
}
