package com.tencent.p014mm.plugin.game.autogen.chatroom;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: com.tencent.mm.plugin.game.autogen.chatroom.Panel */
public class Panel extends C47465a {
    public String desc;
    public String icon;
    public JumpInfo jump_info;
    public int type;

    public static final Panel create() {
        return new Panel();
    }

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof Panel)) {
            return false;
        }
        Panel panel = (Panel) aVar;
        return C46238a.m51546a(Integer.valueOf(this.type), Integer.valueOf(panel.type)) && C46238a.m51546a(this.icon, panel.icon) && C46238a.m51546a(this.desc, panel.desc) && C46238a.m51546a(this.jump_info, panel.jump_info);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.type);
            String str = this.icon;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            String str2 = this.desc;
            if (str2 != null) {
                aVar.mo74323j(3, str2);
            }
            JumpInfo jumpInfo = this.jump_info;
            if (jumpInfo != null) {
                aVar.mo74322i(4, jumpInfo.computeSize());
                this.jump_info.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.type) + 0;
            String str3 = this.icon;
            if (str3 != null) {
                e += C52418a.m58683j(2, str3);
            }
            String str4 = this.desc;
            if (str4 != null) {
                e += C52418a.m58683j(3, str4);
            }
            JumpInfo jumpInfo2 = this.jump_info;
            return jumpInfo2 != null ? e + C52418a.m58682i(4, jumpInfo2.computeSize()) : e;
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
            Panel panel = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                panel.type = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 2) {
                panel.icon = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                panel.desc = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i2 = 0; i2 < size; i2++) {
                    byte[] bArr = j.get(i2);
                    JumpInfo jumpInfo3 = new JumpInfo();
                    if (bArr != null && bArr.length > 0) {
                        jumpInfo3.parseFrom(bArr);
                    }
                    panel.jump_info = jumpInfo3;
                }
                return 0;
            }
        }
    }

    public Panel setDesc(String str) {
        this.desc = str;
        return this;
    }

    public Panel setIcon(String str) {
        this.icon = str;
        return this;
    }

    public Panel setJump_info(JumpInfo jumpInfo) {
        this.jump_info = jumpInfo;
        return this;
    }

    public Panel setType(int i) {
        this.type = i;
        return this;
    }
}
