package com.tencent.p014mm.plugin.report.service;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: com.tencent.mm.plugin.report.service.h */
public class C57275h extends C47465a {

    /* renamed from: d */
    public int f164051d;

    /* renamed from: e */
    public String f164052e;

    /* renamed from: f */
    public boolean f164053f;

    /* renamed from: g */
    public boolean f164054g;

    /* renamed from: h */
    public int f164055h;

    /* renamed from: i */
    public boolean f164056i;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C57275h)) {
            return false;
        }
        C57275h hVar = (C57275h) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f164051d), Integer.valueOf(hVar.f164051d)) && C46238a.m51546a(this.f164052e, hVar.f164052e) && C46238a.m51546a(Boolean.valueOf(this.f164053f), Boolean.valueOf(hVar.f164053f)) && C46238a.m51546a(Boolean.valueOf(this.f164054g), Boolean.valueOf(hVar.f164054g)) && C46238a.m51546a(Integer.valueOf(this.f164055h), Integer.valueOf(hVar.f164055h)) && C46238a.m51546a(Boolean.valueOf(this.f164056i), Boolean.valueOf(hVar.f164056i));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            if (this.f164052e != null) {
                aVar.mo74318e(1, this.f164051d);
                String str = this.f164052e;
                if (str != null) {
                    aVar.mo74323j(2, str);
                }
                aVar.mo74314a(3, this.f164053f);
                aVar.mo74314a(4, this.f164054g);
                aVar.mo74318e(5, this.f164055h);
                aVar.mo74314a(6, this.f164056i);
                return 0;
            }
            throw new C52419b("Not all required fields were included: Value");
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f164051d) + 0;
            String str2 = this.f164052e;
            if (str2 != null) {
                e += C52418a.m58683j(2, str2);
            }
            return e + C52418a.m58674a(3, this.f164053f) + C52418a.m58674a(4, this.f164054g) + C52418a.m58678e(5, this.f164055h) + C52418a.m58674a(6, this.f164056i);
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f164052e != null) {
                return 0;
            }
            throw new C52419b("Not all required fields were included: Value");
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C57275h hVar = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    hVar.f164051d = aVar3.mo141629g(intValue);
                    return 0;
                case 2:
                    hVar.f164052e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    hVar.f164053f = aVar3.mo141625c(intValue);
                    return 0;
                case 4:
                    hVar.f164054g = aVar3.mo141625c(intValue);
                    return 0;
                case 5:
                    hVar.f164055h = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    hVar.f164056i = aVar3.mo141625c(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
