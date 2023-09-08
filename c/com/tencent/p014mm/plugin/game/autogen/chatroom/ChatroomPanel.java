package com.tencent.p014mm.plugin.game.autogen.chatroom;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: com.tencent.mm.plugin.game.autogen.chatroom.ChatroomPanel */
public class ChatroomPanel extends C47465a {
    public String panel_icon;
    public LinkedList<Panel> panel_list = new LinkedList<>();
    public String panel_text;

    public static final ChatroomPanel create() {
        return new ChatroomPanel();
    }

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof ChatroomPanel)) {
            return false;
        }
        ChatroomPanel chatroomPanel = (ChatroomPanel) aVar;
        return C46238a.m51546a(this.panel_list, chatroomPanel.panel_list) && C46238a.m51546a(this.panel_icon, chatroomPanel.panel_icon) && C46238a.m51546a(this.panel_text, chatroomPanel.panel_text);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74320g(1, 8, this.panel_list);
            String str = this.panel_icon;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            String str2 = this.panel_text;
            if (str2 != null) {
                aVar.mo74323j(3, str2);
            }
            return 0;
        } else if (i == 1) {
            int g = C52418a.m58680g(1, 8, this.panel_list) + 0;
            String str3 = this.panel_icon;
            if (str3 != null) {
                g += C52418a.m58683j(2, str3);
            }
            String str4 = this.panel_text;
            return str4 != null ? g + C52418a.m58683j(3, str4) : g;
        } else if (i == 2) {
            this.panel_list.clear();
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
            ChatroomPanel chatroomPanel = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i2 = 0; i2 < size; i2++) {
                    byte[] bArr = j.get(i2);
                    Panel panel = new Panel();
                    if (bArr != null && bArr.length > 0) {
                        panel.parseFrom(bArr);
                    }
                    chatroomPanel.panel_list.add(panel);
                }
                return 0;
            } else if (intValue == 2) {
                chatroomPanel.panel_icon = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                chatroomPanel.panel_text = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }

    public ChatroomPanel setPanel_icon(String str) {
        this.panel_icon = str;
        return this;
    }

    public ChatroomPanel setPanel_list(LinkedList<Panel> linkedList) {
        this.panel_list = linkedList;
        return this;
    }

    public ChatroomPanel setPanel_text(String str) {
        this.panel_text = str;
        return this;
    }
}
