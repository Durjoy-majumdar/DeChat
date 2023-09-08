package com.tencent.p014mm.plugin.game.autogen.chatroom;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: com.tencent.mm.plugin.game.autogen.chatroom.MyChatroomNotice */
public class MyChatroomNotice extends C47465a {
    public Color bg_color;
    public LinkedList<ContentBlock> content_list = new LinkedList<>();

    public static final MyChatroomNotice create() {
        return new MyChatroomNotice();
    }

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof MyChatroomNotice)) {
            return false;
        }
        MyChatroomNotice myChatroomNotice = (MyChatroomNotice) aVar;
        return C46238a.m51546a(this.content_list, myChatroomNotice.content_list) && C46238a.m51546a(this.bg_color, myChatroomNotice.bg_color);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74320g(1, 8, this.content_list);
            Color color = this.bg_color;
            if (color != null) {
                aVar.mo74322i(2, color.computeSize());
                this.bg_color.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            int g = C52418a.m58680g(1, 8, this.content_list) + 0;
            Color color2 = this.bg_color;
            return color2 != null ? g + C52418a.m58682i(2, color2.computeSize()) : g;
        } else if (i == 2) {
            this.content_list.clear();
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
            MyChatroomNotice myChatroomNotice = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i2 = 0; i2 < size; i2++) {
                    byte[] bArr = j.get(i2);
                    ContentBlock contentBlock = new ContentBlock();
                    if (bArr != null && bArr.length > 0) {
                        contentBlock.parseFrom(bArr);
                    }
                    myChatroomNotice.content_list.add(contentBlock);
                }
                return 0;
            } else if (intValue != 2) {
                return -1;
            } else {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    byte[] bArr2 = j2.get(i3);
                    Color color3 = new Color();
                    if (bArr2 != null && bArr2.length > 0) {
                        color3.parseFrom(bArr2);
                    }
                    myChatroomNotice.bg_color = color3;
                }
                return 0;
            }
        }
    }

    public MyChatroomNotice setBg_color(Color color) {
        this.bg_color = color;
        return this;
    }

    public MyChatroomNotice setContent_list(LinkedList<ContentBlock> linkedList) {
        this.content_list = linkedList;
        return this;
    }
}
