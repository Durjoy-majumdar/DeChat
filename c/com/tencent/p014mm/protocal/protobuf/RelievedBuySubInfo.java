package com.tencent.p014mm.protocal.protobuf;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: com.tencent.mm.protocal.protobuf.RelievedBuySubInfo */
public class RelievedBuySubInfo extends C47465a {
    public String desc;
    public String icon;
    public int sub_type;
    public String title;

    public static final RelievedBuySubInfo create() {
        return new RelievedBuySubInfo();
    }

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof RelievedBuySubInfo)) {
            return false;
        }
        RelievedBuySubInfo relievedBuySubInfo = (RelievedBuySubInfo) aVar;
        return C46238a.m51546a(Integer.valueOf(this.sub_type), Integer.valueOf(relievedBuySubInfo.sub_type)) && C46238a.m51546a(this.title, relievedBuySubInfo.title) && C46238a.m51546a(this.desc, relievedBuySubInfo.desc) && C46238a.m51546a(this.icon, relievedBuySubInfo.icon);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.sub_type);
            String str = this.title;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            String str2 = this.desc;
            if (str2 != null) {
                aVar.mo74323j(3, str2);
            }
            String str3 = this.icon;
            if (str3 != null) {
                aVar.mo74323j(4, str3);
            }
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.sub_type) + 0;
            String str4 = this.title;
            if (str4 != null) {
                e += C52418a.m58683j(2, str4);
            }
            String str5 = this.desc;
            if (str5 != null) {
                e += C52418a.m58683j(3, str5);
            }
            String str6 = this.icon;
            return str6 != null ? e + C52418a.m58683j(4, str6) : e;
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
            RelievedBuySubInfo relievedBuySubInfo = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                relievedBuySubInfo.sub_type = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 2) {
                relievedBuySubInfo.title = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                relievedBuySubInfo.desc = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                relievedBuySubInfo.icon = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }

    public RelievedBuySubInfo setDesc(String str) {
        this.desc = str;
        return this;
    }

    public RelievedBuySubInfo setIcon(String str) {
        this.icon = str;
        return this;
    }

    public RelievedBuySubInfo setSub_type(int i) {
        this.sub_type = i;
        return this;
    }

    public RelievedBuySubInfo setTitle(String str) {
        this.title = str;
        return this;
    }
}
