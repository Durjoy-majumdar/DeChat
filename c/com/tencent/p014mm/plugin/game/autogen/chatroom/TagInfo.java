package com.tencent.p014mm.plugin.game.autogen.chatroom;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: com.tencent.mm.plugin.game.autogen.chatroom.TagInfo */
public class TagInfo extends C47465a {
    public String appid;
    public Color color;
    public String desc;
    public int score;
    public int type;

    public static final TagInfo create() {
        return new TagInfo();
    }

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof TagInfo)) {
            return false;
        }
        TagInfo tagInfo = (TagInfo) aVar;
        return C46238a.m51546a(this.desc, tagInfo.desc) && C46238a.m51546a(Integer.valueOf(this.type), Integer.valueOf(tagInfo.type)) && C46238a.m51546a(Integer.valueOf(this.score), Integer.valueOf(tagInfo.score)) && C46238a.m51546a(this.appid, tagInfo.appid) && C46238a.m51546a(this.color, tagInfo.color);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.desc;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            aVar.mo74318e(2, this.type);
            aVar.mo74318e(3, this.score);
            String str2 = this.appid;
            if (str2 != null) {
                aVar.mo74323j(4, str2);
            }
            Color color2 = this.color;
            if (color2 != null) {
                aVar.mo74322i(5, color2.computeSize());
                this.color.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            String str3 = this.desc;
            if (str3 != null) {
                i2 = 0 + C52418a.m58683j(1, str3);
            }
            int e = i2 + C52418a.m58678e(2, this.type) + C52418a.m58678e(3, this.score);
            String str4 = this.appid;
            if (str4 != null) {
                e += C52418a.m58683j(4, str4);
            }
            Color color3 = this.color;
            return color3 != null ? e + C52418a.m58682i(5, color3.computeSize()) : e;
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
            TagInfo tagInfo = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                tagInfo.desc = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                tagInfo.type = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 3) {
                tagInfo.score = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 4) {
                tagInfo.appid = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    Color color4 = new Color();
                    if (bArr != null && bArr.length > 0) {
                        color4.parseFrom(bArr);
                    }
                    tagInfo.color = color4;
                }
                return 0;
            }
        }
    }

    public TagInfo setAppid(String str) {
        this.appid = str;
        return this;
    }

    public TagInfo setColor(Color color2) {
        this.color = color2;
        return this;
    }

    public TagInfo setDesc(String str) {
        this.desc = str;
        return this;
    }

    public TagInfo setScore(int i) {
        this.score = i;
        return this;
    }

    public TagInfo setType(int i) {
        this.type = i;
        return this;
    }
}
