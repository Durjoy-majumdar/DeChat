package com.tencent.p014mm.plugin.game.autogen.chatroom;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: com.tencent.mm.plugin.game.autogen.chatroom.SlotList */
public class SlotList extends C47465a {
    public String head_desc;
    public LinkedList<Slot> slot_list = new LinkedList<>();
    public String version;

    public static final SlotList create() {
        return new SlotList();
    }

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof SlotList)) {
            return false;
        }
        SlotList slotList = (SlotList) aVar;
        return C46238a.m51546a(this.slot_list, slotList.slot_list) && C46238a.m51546a(this.version, slotList.version) && C46238a.m51546a(this.head_desc, slotList.head_desc);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74320g(1, 8, this.slot_list);
            String str = this.version;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            String str2 = this.head_desc;
            if (str2 != null) {
                aVar.mo74323j(3, str2);
            }
            return 0;
        } else if (i == 1) {
            int g = C52418a.m58680g(1, 8, this.slot_list) + 0;
            String str3 = this.version;
            if (str3 != null) {
                g += C52418a.m58683j(2, str3);
            }
            String str4 = this.head_desc;
            return str4 != null ? g + C52418a.m58683j(3, str4) : g;
        } else if (i == 2) {
            this.slot_list.clear();
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
            SlotList slotList = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i2 = 0; i2 < size; i2++) {
                    byte[] bArr = j.get(i2);
                    Slot slot = new Slot();
                    if (bArr != null && bArr.length > 0) {
                        slot.parseFrom(bArr);
                    }
                    slotList.slot_list.add(slot);
                }
                return 0;
            } else if (intValue == 2) {
                slotList.version = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                slotList.head_desc = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }

    public SlotList setHead_desc(String str) {
        this.head_desc = str;
        return this;
    }

    public SlotList setSlot_list(LinkedList<Slot> linkedList) {
        this.slot_list = linkedList;
        return this;
    }

    public SlotList setVersion(String str) {
        this.version = str;
        return this;
    }
}
