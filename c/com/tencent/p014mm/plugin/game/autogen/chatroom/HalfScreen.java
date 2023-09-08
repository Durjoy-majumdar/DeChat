package com.tencent.p014mm.plugin.game.autogen.chatroom;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: com.tencent.mm.plugin.game.autogen.chatroom.HalfScreen */
public class HalfScreen extends C47465a {
    public int screen_height_dp;
    public float screen_height_percent;
    public int type;

    public static final HalfScreen create() {
        return new HalfScreen();
    }

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof HalfScreen)) {
            return false;
        }
        HalfScreen halfScreen = (HalfScreen) aVar;
        return C46238a.m51546a(Integer.valueOf(this.type), Integer.valueOf(halfScreen.type)) && C46238a.m51546a(Integer.valueOf(this.screen_height_dp), Integer.valueOf(halfScreen.screen_height_dp)) && C46238a.m51546a(Float.valueOf(this.screen_height_percent), Float.valueOf(halfScreen.screen_height_percent));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.type);
            aVar.mo74318e(2, this.screen_height_dp);
            aVar.mo74317d(3, this.screen_height_percent);
            return 0;
        } else if (i == 1) {
            return C52418a.m58678e(1, this.type) + 0 + C52418a.m58678e(2, this.screen_height_dp) + C52418a.m58677d(3, this.screen_height_percent);
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
                HalfScreen halfScreen = objArr[1];
                int intValue = objArr[2].intValue();
                if (intValue == 1) {
                    halfScreen.type = aVar3.mo141629g(intValue);
                    return 0;
                } else if (intValue == 2) {
                    halfScreen.screen_height_dp = aVar3.mo141629g(intValue);
                    return 0;
                } else if (intValue != 3) {
                    return -1;
                } else {
                    halfScreen.screen_height_percent = aVar3.mo141628f(intValue);
                    return 0;
                }
            }
        }
    }

    public HalfScreen setScreen_height_dp(int i) {
        this.screen_height_dp = i;
        return this;
    }

    public HalfScreen setScreen_height_percent(float f) {
        this.screen_height_percent = f;
        return this;
    }

    public HalfScreen setType(int i) {
        this.type = i;
        return this;
    }
}
