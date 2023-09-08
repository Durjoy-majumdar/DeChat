package com.tencent.p014mm.protocal.protobuf;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;

/* renamed from: com.tencent.mm.protocal.protobuf.WxaEvaluateWordingList */
public class WxaEvaluateWordingList extends C47465a {
    public LinkedList<WxaEvaluateWording> items = new LinkedList<>();

    public static final WxaEvaluateWordingList create() {
        return new WxaEvaluateWordingList();
    }

    public boolean compareContent(C47465a aVar) {
        return aVar != null && (aVar instanceof WxaEvaluateWordingList) && C46238a.m51546a(this.items, ((WxaEvaluateWordingList) aVar).items);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            objArr[0].mo74320g(1, 8, this.items);
            return 0;
        } else if (i == 1) {
            return C52418a.m58680g(1, 8, this.items) + 0;
        } else {
            if (i == 2) {
                this.items.clear();
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
                WxaEvaluateWordingList wxaEvaluateWordingList = objArr[1];
                int intValue = objArr[2].intValue();
                if (intValue != 1) {
                    return -1;
                }
                LinkedList<byte[]> j = aVar2.mo141632j(intValue);
                int size = j.size();
                for (int i2 = 0; i2 < size; i2++) {
                    byte[] bArr = j.get(i2);
                    WxaEvaluateWording wxaEvaluateWording = new WxaEvaluateWording();
                    if (bArr != null && bArr.length > 0) {
                        wxaEvaluateWording.parseFrom(bArr);
                    }
                    wxaEvaluateWordingList.items.add(wxaEvaluateWording);
                }
                return 0;
            }
        }
    }

    public WxaEvaluateWordingList setItems(LinkedList<WxaEvaluateWording> linkedList) {
        this.items = linkedList;
        return this;
    }
}
