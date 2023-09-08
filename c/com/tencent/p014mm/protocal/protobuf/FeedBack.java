package com.tencent.p014mm.protocal.protobuf;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: com.tencent.mm.protocal.protobuf.FeedBack */
public class FeedBack extends C47465a {
    public String jumpurl_prefix;
    public String title;

    public static final FeedBack create() {
        return new FeedBack();
    }

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof FeedBack)) {
            return false;
        }
        FeedBack feedBack = (FeedBack) aVar;
        return C46238a.m51546a(this.title, feedBack.title) && C46238a.m51546a(this.jumpurl_prefix, feedBack.jumpurl_prefix);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.title;
            if (str == null) {
                throw new C52419b("Not all required fields were included: title");
            } else if (this.jumpurl_prefix != null) {
                if (str != null) {
                    aVar.mo74323j(1, str);
                }
                String str2 = this.jumpurl_prefix;
                if (str2 != null) {
                    aVar.mo74323j(2, str2);
                }
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: jumpurl_prefix");
            }
        } else if (i == 1) {
            String str3 = this.title;
            if (str3 != null) {
                i2 = 0 + C52418a.m58683j(1, str3);
            }
            String str4 = this.jumpurl_prefix;
            return str4 != null ? i2 + C52418a.m58683j(2, str4) : i2;
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.title == null) {
                throw new C52419b("Not all required fields were included: title");
            } else if (this.jumpurl_prefix != null) {
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: jumpurl_prefix");
            }
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            FeedBack feedBack = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                feedBack.title = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 2) {
                return -1;
            } else {
                feedBack.jumpurl_prefix = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }

    public FeedBack setJumpurl_prefix(String str) {
        this.jumpurl_prefix = str;
        return this;
    }

    public FeedBack setTitle(String str) {
        this.title = str;
        return this;
    }
}
