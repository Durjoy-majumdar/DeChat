package com.tencent.p014mm.plugin.game.autogen.chatroom;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: com.tencent.mm.plugin.game.autogen.chatroom.NotificationBar */
public class NotificationBar extends C47465a {
    public LinkedList<Notification> notification_list = new LinkedList<>();
    public String version;

    public static final NotificationBar create() {
        return new NotificationBar();
    }

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof NotificationBar)) {
            return false;
        }
        NotificationBar notificationBar = (NotificationBar) aVar;
        return C46238a.m51546a(this.notification_list, notificationBar.notification_list) && C46238a.m51546a(this.version, notificationBar.version);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74320g(1, 8, this.notification_list);
            String str = this.version;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            return 0;
        } else if (i == 1) {
            int g = C52418a.m58680g(1, 8, this.notification_list) + 0;
            String str2 = this.version;
            return str2 != null ? g + C52418a.m58683j(2, str2) : g;
        } else if (i == 2) {
            this.notification_list.clear();
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
            NotificationBar notificationBar = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i2 = 0; i2 < size; i2++) {
                    byte[] bArr = j.get(i2);
                    Notification notification = new Notification();
                    if (bArr != null && bArr.length > 0) {
                        notification.parseFrom(bArr);
                    }
                    notificationBar.notification_list.add(notification);
                }
                return 0;
            } else if (intValue != 2) {
                return -1;
            } else {
                notificationBar.version = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }

    public NotificationBar setNotification_list(LinkedList<Notification> linkedList) {
        this.notification_list = linkedList;
        return this;
    }

    public NotificationBar setVersion(String str) {
        this.version = str;
        return this;
    }
}
