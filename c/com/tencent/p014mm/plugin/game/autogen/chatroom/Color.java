package com.tencent.p014mm.plugin.game.autogen.chatroom;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: com.tencent.mm.plugin.game.autogen.chatroom.Color */
public class Color extends C47465a {
    public String dark_color;
    public String h5_dark_color;
    public String h5_light_color;
    public String light_color;

    public static final Color create() {
        return new Color();
    }

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof Color)) {
            return false;
        }
        Color color = (Color) aVar;
        return C46238a.m51546a(this.light_color, color.light_color) && C46238a.m51546a(this.dark_color, color.dark_color) && C46238a.m51546a(this.h5_light_color, color.h5_light_color) && C46238a.m51546a(this.h5_dark_color, color.h5_dark_color);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.light_color;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.dark_color;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            String str3 = this.h5_light_color;
            if (str3 != null) {
                aVar.mo74323j(3, str3);
            }
            String str4 = this.h5_dark_color;
            if (str4 != null) {
                aVar.mo74323j(4, str4);
            }
            return 0;
        } else if (i == 1) {
            String str5 = this.light_color;
            if (str5 != null) {
                i2 = 0 + C52418a.m58683j(1, str5);
            }
            String str6 = this.dark_color;
            if (str6 != null) {
                i2 += C52418a.m58683j(2, str6);
            }
            String str7 = this.h5_light_color;
            if (str7 != null) {
                i2 += C52418a.m58683j(3, str7);
            }
            String str8 = this.h5_dark_color;
            return str8 != null ? i2 + C52418a.m58683j(4, str8) : i2;
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
            Color color = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                color.light_color = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                color.dark_color = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                color.h5_light_color = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                color.h5_dark_color = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }

    public Color setDark_color(String str) {
        this.dark_color = str;
        return this;
    }

    public Color setH5_dark_color(String str) {
        this.h5_dark_color = str;
        return this;
    }

    public Color setH5_light_color(String str) {
        this.h5_light_color = str;
        return this;
    }

    public Color setLight_color(String str) {
        this.light_color = str;
        return this;
    }
}
