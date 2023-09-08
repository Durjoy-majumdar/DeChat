package com.tencent.p014mm.plugin.game.autogen.chatroom;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: com.tencent.mm.plugin.game.autogen.chatroom.Notification */
public class Notification extends C47465a {
    public Color background_color;
    public boolean click_after_close;
    public int disappear_second;

    /* renamed from: id */
    public int f112124id;
    public JumpInfo jump_info;
    public String left_icon_url;
    public int priority;
    public boolean right_icon_can_close;
    public String right_icon_url;
    public int type;
    public Color word_color;
    public String wording;

    public static final Notification create() {
        return new Notification();
    }

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof Notification)) {
            return false;
        }
        Notification notification = (Notification) aVar;
        return C46238a.m51546a(this.word_color, notification.word_color) && C46238a.m51546a(this.background_color, notification.background_color) && C46238a.m51546a(this.wording, notification.wording) && C46238a.m51546a(this.jump_info, notification.jump_info) && C46238a.m51546a(Integer.valueOf(this.type), Integer.valueOf(notification.type)) && C46238a.m51546a(this.left_icon_url, notification.left_icon_url) && C46238a.m51546a(this.right_icon_url, notification.right_icon_url) && C46238a.m51546a(Boolean.valueOf(this.right_icon_can_close), Boolean.valueOf(notification.right_icon_can_close)) && C46238a.m51546a(Integer.valueOf(this.disappear_second), Integer.valueOf(notification.disappear_second)) && C46238a.m51546a(Integer.valueOf(this.priority), Integer.valueOf(notification.priority)) && C46238a.m51546a(Integer.valueOf(this.f112124id), Integer.valueOf(notification.f112124id)) && C46238a.m51546a(Boolean.valueOf(this.click_after_close), Boolean.valueOf(notification.click_after_close));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            Color color = this.word_color;
            if (color != null) {
                aVar.mo74322i(1, color.computeSize());
                this.word_color.writeFields(aVar);
            }
            Color color2 = this.background_color;
            if (color2 != null) {
                aVar.mo74322i(2, color2.computeSize());
                this.background_color.writeFields(aVar);
            }
            String str = this.wording;
            if (str != null) {
                aVar.mo74323j(3, str);
            }
            JumpInfo jumpInfo = this.jump_info;
            if (jumpInfo != null) {
                aVar.mo74322i(4, jumpInfo.computeSize());
                this.jump_info.writeFields(aVar);
            }
            aVar.mo74318e(5, this.type);
            String str2 = this.left_icon_url;
            if (str2 != null) {
                aVar.mo74323j(6, str2);
            }
            String str3 = this.right_icon_url;
            if (str3 != null) {
                aVar.mo74323j(7, str3);
            }
            aVar.mo74314a(8, this.right_icon_can_close);
            aVar.mo74318e(9, this.disappear_second);
            aVar.mo74318e(10, this.priority);
            aVar.mo74318e(11, this.f112124id);
            aVar.mo74314a(12, this.click_after_close);
            return 0;
        } else if (i == 1) {
            Color color3 = this.word_color;
            if (color3 != null) {
                i2 = 0 + C52418a.m58682i(1, color3.computeSize());
            }
            Color color4 = this.background_color;
            if (color4 != null) {
                i2 += C52418a.m58682i(2, color4.computeSize());
            }
            String str4 = this.wording;
            if (str4 != null) {
                i2 += C52418a.m58683j(3, str4);
            }
            JumpInfo jumpInfo2 = this.jump_info;
            if (jumpInfo2 != null) {
                i2 += C52418a.m58682i(4, jumpInfo2.computeSize());
            }
            int e = i2 + C52418a.m58678e(5, this.type);
            String str5 = this.left_icon_url;
            if (str5 != null) {
                e += C52418a.m58683j(6, str5);
            }
            String str6 = this.right_icon_url;
            if (str6 != null) {
                e += C52418a.m58683j(7, str6);
            }
            return e + C52418a.m58674a(8, this.right_icon_can_close) + C52418a.m58678e(9, this.disappear_second) + C52418a.m58678e(10, this.priority) + C52418a.m58678e(11, this.f112124id) + C52418a.m58674a(12, this.click_after_close);
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
            Notification notification = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j.get(i3);
                        Color color5 = new Color();
                        if (bArr != null && bArr.length > 0) {
                            color5.parseFrom(bArr);
                        }
                        notification.word_color = color5;
                    }
                    return 0;
                case 2:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        Color color6 = new Color();
                        if (bArr2 != null && bArr2.length > 0) {
                            color6.parseFrom(bArr2);
                        }
                        notification.background_color = color6;
                    }
                    return 0;
                case 3:
                    notification.wording = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i5 = 0; i5 < size3; i5++) {
                        byte[] bArr3 = j3.get(i5);
                        JumpInfo jumpInfo3 = new JumpInfo();
                        if (bArr3 != null && bArr3.length > 0) {
                            jumpInfo3.parseFrom(bArr3);
                        }
                        notification.jump_info = jumpInfo3;
                    }
                    return 0;
                case 5:
                    notification.type = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    notification.left_icon_url = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    notification.right_icon_url = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    notification.right_icon_can_close = aVar3.mo141625c(intValue);
                    return 0;
                case 9:
                    notification.disappear_second = aVar3.mo141629g(intValue);
                    return 0;
                case 10:
                    notification.priority = aVar3.mo141629g(intValue);
                    return 0;
                case 11:
                    notification.f112124id = aVar3.mo141629g(intValue);
                    return 0;
                case 12:
                    notification.click_after_close = aVar3.mo141625c(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }

    public Notification setBackground_color(Color color) {
        this.background_color = color;
        return this;
    }

    public Notification setClick_after_close(boolean z) {
        this.click_after_close = z;
        return this;
    }

    public Notification setDisappear_second(int i) {
        this.disappear_second = i;
        return this;
    }

    public Notification setId(int i) {
        this.f112124id = i;
        return this;
    }

    public Notification setJump_info(JumpInfo jumpInfo) {
        this.jump_info = jumpInfo;
        return this;
    }

    public Notification setLeft_icon_url(String str) {
        this.left_icon_url = str;
        return this;
    }

    public Notification setPriority(int i) {
        this.priority = i;
        return this;
    }

    public Notification setRight_icon_can_close(boolean z) {
        this.right_icon_can_close = z;
        return this;
    }

    public Notification setRight_icon_url(String str) {
        this.right_icon_url = str;
        return this;
    }

    public Notification setType(int i) {
        this.type = i;
        return this;
    }

    public Notification setWord_color(Color color) {
        this.word_color = color;
        return this;
    }

    public Notification setWording(String str) {
        this.wording = str;
        return this;
    }
}
