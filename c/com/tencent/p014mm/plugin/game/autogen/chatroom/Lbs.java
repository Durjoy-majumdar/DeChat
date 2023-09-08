package com.tencent.p014mm.plugin.game.autogen.chatroom;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: com.tencent.mm.plugin.game.autogen.chatroom.Lbs */
public class Lbs extends C47465a {
    public float latitude;
    public float longitude;

    public static final Lbs create() {
        return new Lbs();
    }

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof Lbs)) {
            return false;
        }
        Lbs lbs = (Lbs) aVar;
        return C46238a.m51546a(Float.valueOf(this.longitude), Float.valueOf(lbs.longitude)) && C46238a.m51546a(Float.valueOf(this.latitude), Float.valueOf(lbs.latitude));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74317d(1, this.longitude);
            aVar.mo74317d(2, this.latitude);
            return 0;
        } else if (i == 1) {
            return C52418a.m58677d(1, this.longitude) + 0 + C52418a.m58677d(2, this.latitude);
        } else {
            if (i == 2) {
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
                Lbs lbs = objArr[1];
                int intValue = objArr[2].intValue();
                if (intValue == 1) {
                    lbs.longitude = aVar3.mo141628f(intValue);
                    return 0;
                } else if (intValue != 2) {
                    return -1;
                } else {
                    lbs.latitude = aVar3.mo141628f(intValue);
                    return 0;
                }
            }
        }
    }

    public Lbs setLatitude(float f) {
        this.latitude = f;
        return this;
    }

    public Lbs setLongitude(float f) {
        this.longitude = f;
        return this;
    }
}
