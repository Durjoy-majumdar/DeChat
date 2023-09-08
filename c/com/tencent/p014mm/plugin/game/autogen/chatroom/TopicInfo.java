package com.tencent.p014mm.plugin.game.autogen.chatroom;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: com.tencent.mm.plugin.game.autogen.chatroom.TopicInfo */
public class TopicInfo extends C47465a {
    public String content_id;
    public String content_url;
    public boolean has_publish;
    public String left_desc;
    public String right_desc;

    public static final TopicInfo create() {
        return new TopicInfo();
    }

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof TopicInfo)) {
            return false;
        }
        TopicInfo topicInfo = (TopicInfo) aVar;
        return C46238a.m51546a(Boolean.valueOf(this.has_publish), Boolean.valueOf(topicInfo.has_publish)) && C46238a.m51546a(this.content_id, topicInfo.content_id) && C46238a.m51546a(this.content_url, topicInfo.content_url) && C46238a.m51546a(this.left_desc, topicInfo.left_desc) && C46238a.m51546a(this.right_desc, topicInfo.right_desc);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74314a(1, this.has_publish);
            String str = this.content_id;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            String str2 = this.content_url;
            if (str2 != null) {
                aVar.mo74323j(3, str2);
            }
            String str3 = this.left_desc;
            if (str3 != null) {
                aVar.mo74323j(4, str3);
            }
            String str4 = this.right_desc;
            if (str4 != null) {
                aVar.mo74323j(5, str4);
            }
            return 0;
        } else if (i == 1) {
            int a = C52418a.m58674a(1, this.has_publish) + 0;
            String str5 = this.content_id;
            if (str5 != null) {
                a += C52418a.m58683j(2, str5);
            }
            String str6 = this.content_url;
            if (str6 != null) {
                a += C52418a.m58683j(3, str6);
            }
            String str7 = this.left_desc;
            if (str7 != null) {
                a += C52418a.m58683j(4, str7);
            }
            String str8 = this.right_desc;
            return str8 != null ? a + C52418a.m58683j(5, str8) : a;
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
            TopicInfo topicInfo = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                topicInfo.has_publish = aVar3.mo141625c(intValue);
                return 0;
            } else if (intValue == 2) {
                topicInfo.content_id = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                topicInfo.content_url = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 4) {
                topicInfo.left_desc = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                topicInfo.right_desc = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }

    public TopicInfo setContent_id(String str) {
        this.content_id = str;
        return this;
    }

    public TopicInfo setContent_url(String str) {
        this.content_url = str;
        return this;
    }

    public TopicInfo setHas_publish(boolean z) {
        this.has_publish = z;
        return this;
    }

    public TopicInfo setLeft_desc(String str) {
        this.left_desc = str;
        return this;
    }

    public TopicInfo setRight_desc(String str) {
        this.right_desc = str;
        return this;
    }
}
