package com.tencent.p014mm.plugin.game.autogen.chatroom;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: com.tencent.mm.plugin.game.autogen.chatroom.RestrictRule */
public class RestrictRule extends C47465a {
    public boolean can_pass;
    public Color color;
    public String rule_desc;
    public ShowIcon show_icon;

    public static final RestrictRule create() {
        return new RestrictRule();
    }

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof RestrictRule)) {
            return false;
        }
        RestrictRule restrictRule = (RestrictRule) aVar;
        return C46238a.m51546a(this.rule_desc, restrictRule.rule_desc) && C46238a.m51546a(Boolean.valueOf(this.can_pass), Boolean.valueOf(restrictRule.can_pass)) && C46238a.m51546a(this.color, restrictRule.color) && C46238a.m51546a(this.show_icon, restrictRule.show_icon);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.rule_desc;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            aVar.mo74314a(2, this.can_pass);
            Color color2 = this.color;
            if (color2 != null) {
                aVar.mo74322i(3, color2.computeSize());
                this.color.writeFields(aVar);
            }
            ShowIcon showIcon = this.show_icon;
            if (showIcon != null) {
                aVar.mo74322i(4, showIcon.computeSize());
                this.show_icon.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            String str2 = this.rule_desc;
            if (str2 != null) {
                i2 = 0 + C52418a.m58683j(1, str2);
            }
            int a = i2 + C52418a.m58674a(2, this.can_pass);
            Color color3 = this.color;
            if (color3 != null) {
                a += C52418a.m58682i(3, color3.computeSize());
            }
            ShowIcon showIcon2 = this.show_icon;
            return showIcon2 != null ? a + C52418a.m58682i(4, showIcon2.computeSize()) : a;
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
            RestrictRule restrictRule = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                restrictRule.rule_desc = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                restrictRule.can_pass = aVar3.mo141625c(intValue);
                return 0;
            } else if (intValue == 3) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    Color color4 = new Color();
                    if (bArr != null && bArr.length > 0) {
                        color4.parseFrom(bArr);
                    }
                    restrictRule.color = color4;
                }
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    ShowIcon showIcon3 = new ShowIcon();
                    if (bArr2 != null && bArr2.length > 0) {
                        showIcon3.parseFrom(bArr2);
                    }
                    restrictRule.show_icon = showIcon3;
                }
                return 0;
            }
        }
    }

    public RestrictRule setCan_pass(boolean z) {
        this.can_pass = z;
        return this;
    }

    public RestrictRule setColor(Color color2) {
        this.color = color2;
        return this;
    }

    public RestrictRule setRule_desc(String str) {
        this.rule_desc = str;
        return this;
    }

    public RestrictRule setShow_icon(ShowIcon showIcon) {
        this.show_icon = showIcon;
        return this;
    }
}
