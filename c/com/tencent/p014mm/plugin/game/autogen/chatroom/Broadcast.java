package com.tencent.p014mm.plugin.game.autogen.chatroom;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: com.tencent.mm.plugin.game.autogen.chatroom.Broadcast */
public class Broadcast extends C47465a {
    public LinkedList<BroadcastMessage> message_list = new LinkedList<>();
    public String version;

    public static final Broadcast create() {
        return new Broadcast();
    }

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof Broadcast)) {
            return false;
        }
        Broadcast broadcast = (Broadcast) aVar;
        return C46238a.m51546a(this.message_list, broadcast.message_list) && C46238a.m51546a(this.version, broadcast.version);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74320g(1, 8, this.message_list);
            String str = this.version;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            return 0;
        } else if (i == 1) {
            int g = C52418a.m58680g(1, 8, this.message_list) + 0;
            String str2 = this.version;
            return str2 != null ? g + C52418a.m58683j(2, str2) : g;
        } else if (i == 2) {
            this.message_list.clear();
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
            Broadcast broadcast = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i2 = 0; i2 < size; i2++) {
                    byte[] bArr = j.get(i2);
                    BroadcastMessage broadcastMessage = new BroadcastMessage();
                    if (bArr != null && bArr.length > 0) {
                        broadcastMessage.parseFrom(bArr);
                    }
                    broadcast.message_list.add(broadcastMessage);
                }
                return 0;
            } else if (intValue != 2) {
                return -1;
            } else {
                broadcast.version = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }

    public Broadcast setMessage_list(LinkedList<BroadcastMessage> linkedList) {
        this.message_list = linkedList;
        return this;
    }

    public Broadcast setVersion(String str) {
        this.version = str;
        return this;
    }
}
