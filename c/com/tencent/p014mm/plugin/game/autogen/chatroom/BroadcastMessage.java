package com.tencent.p014mm.plugin.game.autogen.chatroom;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: com.tencent.mm.plugin.game.autogen.chatroom.BroadcastMessage */
public class BroadcastMessage extends C47465a {
    public Color color;
    public int disappear_second;
    public int type;
    public LinkedList<String> username_list = new LinkedList<>();
    public String wording;

    public static final BroadcastMessage create() {
        return new BroadcastMessage();
    }

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof BroadcastMessage)) {
            return false;
        }
        BroadcastMessage broadcastMessage = (BroadcastMessage) aVar;
        return C46238a.m51546a(this.wording, broadcastMessage.wording) && C46238a.m51546a(this.username_list, broadcastMessage.username_list) && C46238a.m51546a(Integer.valueOf(this.type), Integer.valueOf(broadcastMessage.type)) && C46238a.m51546a(this.color, broadcastMessage.color) && C46238a.m51546a(Integer.valueOf(this.disappear_second), Integer.valueOf(broadcastMessage.disappear_second));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.wording;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            aVar.mo74320g(2, 1, this.username_list);
            aVar.mo74318e(3, this.type);
            Color color2 = this.color;
            if (color2 != null) {
                aVar.mo74322i(4, color2.computeSize());
                this.color.writeFields(aVar);
            }
            aVar.mo74318e(5, this.disappear_second);
            return 0;
        } else if (i == 1) {
            String str2 = this.wording;
            if (str2 != null) {
                i2 = 0 + C52418a.m58683j(1, str2);
            }
            int g = i2 + C52418a.m58680g(2, 1, this.username_list) + C52418a.m58678e(3, this.type);
            Color color3 = this.color;
            if (color3 != null) {
                g += C52418a.m58682i(4, color3.computeSize());
            }
            return g + C52418a.m58678e(5, this.disappear_second);
        } else if (i == 2) {
            this.username_list.clear();
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
            BroadcastMessage broadcastMessage = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                broadcastMessage.wording = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                broadcastMessage.username_list.add(aVar3.mo141633k(intValue));
                return 0;
            } else if (intValue == 3) {
                broadcastMessage.type = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 4) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    Color color4 = new Color();
                    if (bArr != null && bArr.length > 0) {
                        color4.parseFrom(bArr);
                    }
                    broadcastMessage.color = color4;
                }
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                broadcastMessage.disappear_second = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }

    public BroadcastMessage setColor(Color color2) {
        this.color = color2;
        return this;
    }

    public BroadcastMessage setDisappear_second(int i) {
        this.disappear_second = i;
        return this;
    }

    public BroadcastMessage setType(int i) {
        this.type = i;
        return this;
    }

    public BroadcastMessage setUsername_list(LinkedList<String> linkedList) {
        this.username_list = linkedList;
        return this;
    }

    public BroadcastMessage setWording(String str) {
        this.wording = str;
        return this;
    }
}
