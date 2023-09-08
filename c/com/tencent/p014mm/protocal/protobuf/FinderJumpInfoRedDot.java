package com.tencent.p014mm.protocal.protobuf;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: com.tencent.mm.protocal.protobuf.FinderJumpInfoRedDot */
public class FinderJumpInfoRedDot extends C47465a {
    public long red_dot_type;
    public String value;

    public static final FinderJumpInfoRedDot create() {
        return new FinderJumpInfoRedDot();
    }

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof FinderJumpInfoRedDot)) {
            return false;
        }
        FinderJumpInfoRedDot finderJumpInfoRedDot = (FinderJumpInfoRedDot) aVar;
        return C46238a.m51546a(Long.valueOf(this.red_dot_type), Long.valueOf(finderJumpInfoRedDot.red_dot_type)) && C46238a.m51546a(this.value, finderJumpInfoRedDot.value);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74321h(1, this.red_dot_type);
            String str = this.value;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            return 0;
        } else if (i == 1) {
            int h = C52418a.m58681h(1, this.red_dot_type) + 0;
            String str2 = this.value;
            return str2 != null ? h + C52418a.m58683j(2, str2) : h;
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
            FinderJumpInfoRedDot finderJumpInfoRedDot = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                finderJumpInfoRedDot.red_dot_type = aVar3.mo141631i(intValue);
                return 0;
            } else if (intValue != 2) {
                return -1;
            } else {
                finderJumpInfoRedDot.value = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }

    public FinderJumpInfoRedDot setRed_dot_type(long j) {
        this.red_dot_type = j;
        return this;
    }

    public FinderJumpInfoRedDot setValue(String str) {
        this.value = str;
        return this;
    }
}
