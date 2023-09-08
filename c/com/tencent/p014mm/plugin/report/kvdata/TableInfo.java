package com.tencent.p014mm.plugin.report.kvdata;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: com.tencent.mm.plugin.report.kvdata.TableInfo */
public class TableInfo extends C47465a {
    public long count_;
    public String name_;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof TableInfo)) {
            return false;
        }
        TableInfo tableInfo = (TableInfo) aVar;
        return C46238a.m51546a(this.name_, tableInfo.name_) && C46238a.m51546a(Long.valueOf(this.count_), Long.valueOf(tableInfo.count_));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.name_;
            if (str != null) {
                if (str != null) {
                    aVar.mo74323j(1, str);
                }
                aVar.mo74321h(2, this.count_);
                return 0;
            }
            throw new C52419b("Not all required fields were included: name_");
        } else if (i == 1) {
            String str2 = this.name_;
            if (str2 != null) {
                i2 = 0 + C52418a.m58683j(1, str2);
            }
            return i2 + C52418a.m58681h(2, this.count_);
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.name_ != null) {
                return 0;
            }
            throw new C52419b("Not all required fields were included: name_");
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            TableInfo tableInfo = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                tableInfo.name_ = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 2) {
                return -1;
            } else {
                tableInfo.count_ = aVar3.mo141631i(intValue);
                return 0;
            }
        }
    }
}
