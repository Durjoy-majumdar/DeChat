package com.tencent.p014mm.protocal.protobuf;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import te3.n65;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: com.tencent.mm.protocal.protobuf.WxaLikeList */
public class WxaLikeList extends C47465a {
    public LinkedList<n65> like_list = new LinkedList<>();
    public int total_like_cnt;

    public static final WxaLikeList create() {
        return new WxaLikeList();
    }

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof WxaLikeList)) {
            return false;
        }
        WxaLikeList wxaLikeList = (WxaLikeList) aVar;
        return C46238a.m51546a(this.like_list, wxaLikeList.like_list) && C46238a.m51546a(Integer.valueOf(this.total_like_cnt), Integer.valueOf(wxaLikeList.total_like_cnt));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74320g(1, 8, this.like_list);
            aVar.mo74318e(2, this.total_like_cnt);
            return 0;
        } else if (i == 1) {
            return C52418a.m58680g(1, 8, this.like_list) + 0 + C52418a.m58678e(2, this.total_like_cnt);
        } else {
            if (i == 2) {
                this.like_list.clear();
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
                WxaLikeList wxaLikeList = objArr[1];
                int intValue = objArr[2].intValue();
                if (intValue == 1) {
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        byte[] bArr = j.get(i2);
                        n65 n65 = new n65();
                        if (bArr != null && bArr.length > 0) {
                            n65.parseFrom(bArr);
                        }
                        wxaLikeList.like_list.add(n65);
                    }
                    return 0;
                } else if (intValue != 2) {
                    return -1;
                } else {
                    wxaLikeList.total_like_cnt = aVar3.mo141629g(intValue);
                    return 0;
                }
            }
        }
    }

    public WxaLikeList setLike_list(LinkedList<n65> linkedList) {
        this.like_list = linkedList;
        return this;
    }

    public WxaLikeList setTotal_like_cnt(int i) {
        this.total_like_cnt = i;
        return this;
    }
}
