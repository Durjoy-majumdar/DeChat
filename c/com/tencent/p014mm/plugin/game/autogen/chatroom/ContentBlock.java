package com.tencent.p014mm.plugin.game.autogen.chatroom;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: com.tencent.mm.plugin.game.autogen.chatroom.ContentBlock */
public class ContentBlock extends C47465a {
    public Color color;
    public String content;
    public JumpInfo jump_info;

    public static final ContentBlock create() {
        return new ContentBlock();
    }

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof ContentBlock)) {
            return false;
        }
        ContentBlock contentBlock = (ContentBlock) aVar;
        return C46238a.m51546a(this.content, contentBlock.content) && C46238a.m51546a(this.color, contentBlock.color) && C46238a.m51546a(this.jump_info, contentBlock.jump_info);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.content;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            Color color2 = this.color;
            if (color2 != null) {
                aVar.mo74322i(2, color2.computeSize());
                this.color.writeFields(aVar);
            }
            JumpInfo jumpInfo = this.jump_info;
            if (jumpInfo != null) {
                aVar.mo74322i(3, jumpInfo.computeSize());
                this.jump_info.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            String str2 = this.content;
            if (str2 != null) {
                i2 = 0 + C52418a.m58683j(1, str2);
            }
            Color color3 = this.color;
            if (color3 != null) {
                i2 += C52418a.m58682i(2, color3.computeSize());
            }
            JumpInfo jumpInfo2 = this.jump_info;
            return jumpInfo2 != null ? i2 + C52418a.m58682i(3, jumpInfo2.computeSize()) : i2;
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
            ContentBlock contentBlock = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                contentBlock.content = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    Color color4 = new Color();
                    if (bArr != null && bArr.length > 0) {
                        color4.parseFrom(bArr);
                    }
                    contentBlock.color = color4;
                }
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    JumpInfo jumpInfo3 = new JumpInfo();
                    if (bArr2 != null && bArr2.length > 0) {
                        jumpInfo3.parseFrom(bArr2);
                    }
                    contentBlock.jump_info = jumpInfo3;
                }
                return 0;
            }
        }
    }

    public ContentBlock setColor(Color color2) {
        this.color = color2;
        return this;
    }

    public ContentBlock setContent(String str) {
        this.content = str;
        return this;
    }

    public ContentBlock setJump_info(JumpInfo jumpInfo) {
        this.jump_info = jumpInfo;
        return this;
    }
}
