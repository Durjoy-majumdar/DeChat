package com.tencent.p014mm.plugin.game.autogen.chatroom;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: com.tencent.mm.plugin.game.autogen.chatroom.UserRole */
public class UserRole extends C47465a {
    public String background_color;
    public Color bg_color;
    public Color color;
    public String desc;
    public int role;
    public RoleIcon role_icon;
    public String word_color;

    public static final UserRole create() {
        return new UserRole();
    }

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof UserRole)) {
            return false;
        }
        UserRole userRole = (UserRole) aVar;
        return C46238a.m51546a(Integer.valueOf(this.role), Integer.valueOf(userRole.role)) && C46238a.m51546a(this.background_color, userRole.background_color) && C46238a.m51546a(this.word_color, userRole.word_color) && C46238a.m51546a(this.desc, userRole.desc) && C46238a.m51546a(this.color, userRole.color) && C46238a.m51546a(this.bg_color, userRole.bg_color) && C46238a.m51546a(this.role_icon, userRole.role_icon);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.role);
            String str = this.background_color;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            String str2 = this.word_color;
            if (str2 != null) {
                aVar.mo74323j(3, str2);
            }
            String str3 = this.desc;
            if (str3 != null) {
                aVar.mo74323j(4, str3);
            }
            Color color2 = this.color;
            if (color2 != null) {
                aVar.mo74322i(5, color2.computeSize());
                this.color.writeFields(aVar);
            }
            Color color3 = this.bg_color;
            if (color3 != null) {
                aVar.mo74322i(6, color3.computeSize());
                this.bg_color.writeFields(aVar);
            }
            RoleIcon roleIcon = this.role_icon;
            if (roleIcon != null) {
                aVar.mo74322i(7, roleIcon.computeSize());
                this.role_icon.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.role) + 0;
            String str4 = this.background_color;
            if (str4 != null) {
                e += C52418a.m58683j(2, str4);
            }
            String str5 = this.word_color;
            if (str5 != null) {
                e += C52418a.m58683j(3, str5);
            }
            String str6 = this.desc;
            if (str6 != null) {
                e += C52418a.m58683j(4, str6);
            }
            Color color4 = this.color;
            if (color4 != null) {
                e += C52418a.m58682i(5, color4.computeSize());
            }
            Color color5 = this.bg_color;
            if (color5 != null) {
                e += C52418a.m58682i(6, color5.computeSize());
            }
            RoleIcon roleIcon2 = this.role_icon;
            return roleIcon2 != null ? e + C52418a.m58682i(7, roleIcon2.computeSize()) : e;
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
            UserRole userRole = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    userRole.role = aVar3.mo141629g(intValue);
                    return 0;
                case 2:
                    userRole.background_color = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    userRole.word_color = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    userRole.desc = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        byte[] bArr = j.get(i2);
                        Color color6 = new Color();
                        if (bArr != null && bArr.length > 0) {
                            color6.parseFrom(bArr);
                        }
                        userRole.color = color6;
                    }
                    return 0;
                case 6:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i3 = 0; i3 < size2; i3++) {
                        byte[] bArr2 = j2.get(i3);
                        Color color7 = new Color();
                        if (bArr2 != null && bArr2.length > 0) {
                            color7.parseFrom(bArr2);
                        }
                        userRole.bg_color = color7;
                    }
                    return 0;
                case 7:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i4 = 0; i4 < size3; i4++) {
                        byte[] bArr3 = j3.get(i4);
                        RoleIcon roleIcon3 = new RoleIcon();
                        if (bArr3 != null && bArr3.length > 0) {
                            roleIcon3.parseFrom(bArr3);
                        }
                        userRole.role_icon = roleIcon3;
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }

    public UserRole setBackground_color(String str) {
        this.background_color = str;
        return this;
    }

    public UserRole setBg_color(Color color2) {
        this.bg_color = color2;
        return this;
    }

    public UserRole setColor(Color color2) {
        this.color = color2;
        return this;
    }

    public UserRole setDesc(String str) {
        this.desc = str;
        return this;
    }

    public UserRole setRole(int i) {
        this.role = i;
        return this;
    }

    public UserRole setRole_icon(RoleIcon roleIcon) {
        this.role_icon = roleIcon;
        return this;
    }

    public UserRole setWord_color(String str) {
        this.word_color = str;
        return this;
    }
}
