package com.tencent.p014mm.protocal.protobuf;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: com.tencent.mm.protocal.protobuf.NativeInfo */
public class NativeInfo extends C47465a {
    public int native_type;
    public String necessary_params;

    public static final NativeInfo create() {
        return new NativeInfo();
    }

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof NativeInfo)) {
            return false;
        }
        NativeInfo nativeInfo = (NativeInfo) aVar;
        return C46238a.m51546a(Integer.valueOf(this.native_type), Integer.valueOf(nativeInfo.native_type)) && C46238a.m51546a(this.necessary_params, nativeInfo.necessary_params);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.native_type);
            String str = this.necessary_params;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.native_type) + 0;
            String str2 = this.necessary_params;
            return str2 != null ? e + C52418a.m58683j(2, str2) : e;
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
            NativeInfo nativeInfo = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                nativeInfo.native_type = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 2) {
                return -1;
            } else {
                nativeInfo.necessary_params = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }

    public NativeInfo setNative_type(int i) {
        this.native_type = i;
        return this;
    }

    public NativeInfo setNecessary_params(String str) {
        this.necessary_params = str;
        return this;
    }
}
