package com.tencent.p014mm.plugin.game.autogen.chatroom;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: com.tencent.mm.plugin.game.autogen.chatroom.ShowIcon */
public class ShowIcon extends C47465a {
    public String dark_icon;
    public String light_icon;

    public static final ShowIcon create() {
        return new ShowIcon();
    }

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof ShowIcon)) {
            return false;
        }
        ShowIcon showIcon = (ShowIcon) aVar;
        return C46238a.m51546a(this.light_icon, showIcon.light_icon) && C46238a.m51546a(this.dark_icon, showIcon.dark_icon);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.light_icon;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.dark_icon;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            return 0;
        } else if (i == 1) {
            String str3 = this.light_icon;
            if (str3 != null) {
                i2 = 0 + C52418a.m58683j(1, str3);
            }
            String str4 = this.dark_icon;
            return str4 != null ? i2 + C52418a.m58683j(2, str4) : i2;
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
            ShowIcon showIcon = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                showIcon.light_icon = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 2) {
                return -1;
            } else {
                showIcon.dark_icon = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }

    public ShowIcon setDark_icon(String str) {
        this.dark_icon = str;
        return this;
    }

    public ShowIcon setLight_icon(String str) {
        this.light_icon = str;
        return this;
    }
}
