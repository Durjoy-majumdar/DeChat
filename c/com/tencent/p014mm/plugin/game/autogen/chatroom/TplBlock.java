package com.tencent.p014mm.plugin.game.autogen.chatroom;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: com.tencent.mm.plugin.game.autogen.chatroom.TplBlock */
public class TplBlock extends C47465a {
    public boolean can_be_at;
    public String content;
    public JumpInfo jump_info;
    public int type;
    public String username;

    public static final TplBlock create() {
        return new TplBlock();
    }

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof TplBlock)) {
            return false;
        }
        TplBlock tplBlock = (TplBlock) aVar;
        return C46238a.m51546a(Integer.valueOf(this.type), Integer.valueOf(tplBlock.type)) && C46238a.m51546a(this.content, tplBlock.content) && C46238a.m51546a(this.jump_info, tplBlock.jump_info) && C46238a.m51546a(this.username, tplBlock.username) && C46238a.m51546a(Boolean.valueOf(this.can_be_at), Boolean.valueOf(tplBlock.can_be_at));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.type);
            String str = this.content;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            JumpInfo jumpInfo = this.jump_info;
            if (jumpInfo != null) {
                aVar.mo74322i(3, jumpInfo.computeSize());
                this.jump_info.writeFields(aVar);
            }
            String str2 = this.username;
            if (str2 != null) {
                aVar.mo74323j(4, str2);
            }
            aVar.mo74314a(5, this.can_be_at);
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.type) + 0;
            String str3 = this.content;
            if (str3 != null) {
                e += C52418a.m58683j(2, str3);
            }
            JumpInfo jumpInfo2 = this.jump_info;
            if (jumpInfo2 != null) {
                e += C52418a.m58682i(3, jumpInfo2.computeSize());
            }
            String str4 = this.username;
            if (str4 != null) {
                e += C52418a.m58683j(4, str4);
            }
            return e + C52418a.m58674a(5, this.can_be_at);
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
            TplBlock tplBlock = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                tplBlock.type = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 2) {
                tplBlock.content = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i2 = 0; i2 < size; i2++) {
                    byte[] bArr = j.get(i2);
                    JumpInfo jumpInfo3 = new JumpInfo();
                    if (bArr != null && bArr.length > 0) {
                        jumpInfo3.parseFrom(bArr);
                    }
                    tplBlock.jump_info = jumpInfo3;
                }
                return 0;
            } else if (intValue == 4) {
                tplBlock.username = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                tplBlock.can_be_at = aVar3.mo141625c(intValue);
                return 0;
            }
        }
    }

    public TplBlock setCan_be_at(boolean z) {
        this.can_be_at = z;
        return this;
    }

    public TplBlock setContent(String str) {
        this.content = str;
        return this;
    }

    public TplBlock setJump_info(JumpInfo jumpInfo) {
        this.jump_info = jumpInfo;
        return this;
    }

    public TplBlock setType(int i) {
        this.type = i;
        return this;
    }

    public TplBlock setUsername(String str) {
        this.username = str;
        return this;
    }
}
