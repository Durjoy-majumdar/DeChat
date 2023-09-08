package com.tencent.p014mm.protocal.protobuf;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import te3.C50679og3;
import u14.C52418a;
import v14.C102122a;

/* renamed from: com.tencent.mm.protocal.protobuf.ServicePreInfo */
public class ServicePreInfo extends C47465a {
    public LinkedList<C50679og3> media_list = new LinkedList<>();

    public static final ServicePreInfo create() {
        return new ServicePreInfo();
    }

    public boolean compareContent(C47465a aVar) {
        return aVar != null && (aVar instanceof ServicePreInfo) && C46238a.m51546a(this.media_list, ((ServicePreInfo) aVar).media_list);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            objArr[0].mo74320g(1, 8, this.media_list);
            return 0;
        } else if (i == 1) {
            return C52418a.m58680g(1, 8, this.media_list) + 0;
        } else {
            if (i == 2) {
                this.media_list.clear();
                C102122a aVar = new C102122a(objArr[0], C47465a.unknownTagHandler);
                for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar)) {
                    if (!super.populateBuilderWithField(aVar, this, nextFieldNumber)) {
                        aVar.mo141624b();
                    }
                }
                return 0;
            } else if (i != 3) {
                return -1;
            } else {
                C102122a aVar2 = objArr[0];
                ServicePreInfo servicePreInfo = objArr[1];
                int intValue = objArr[2].intValue();
                if (intValue != 1) {
                    return -1;
                }
                LinkedList<byte[]> j = aVar2.mo141632j(intValue);
                int size = j.size();
                for (int i2 = 0; i2 < size; i2++) {
                    byte[] bArr = j.get(i2);
                    C50679og3 og32 = new C50679og3();
                    if (bArr != null && bArr.length > 0) {
                        og32.parseFrom(bArr);
                    }
                    servicePreInfo.media_list.add(og32);
                }
                return 0;
            }
        }
    }

    public ServicePreInfo setMedia_list(LinkedList<C50679og3> linkedList) {
        this.media_list = linkedList;
        return this;
    }
}
