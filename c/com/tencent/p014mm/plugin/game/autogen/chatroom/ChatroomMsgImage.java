package com.tencent.p014mm.plugin.game.autogen.chatroom;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgImage */
public class ChatroomMsgImage extends C47465a {
    public String aeskey;
    public int crypt_ver;
    public int hd_height;
    public int hd_size;
    public int hd_width;
    public int hevc_hd_size;
    public int hevc_mid_size;
    public int hevc_thumb_size;
    public String md5;
    public int mid_height;
    public int mid_size;
    public int mid_width;
    public int thumb_height;
    public int thumb_size;
    public int thumb_width;
    public String url;

    public static final ChatroomMsgImage create() {
        return new ChatroomMsgImage();
    }

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof ChatroomMsgImage)) {
            return false;
        }
        ChatroomMsgImage chatroomMsgImage = (ChatroomMsgImage) aVar;
        return C46238a.m51546a(this.aeskey, chatroomMsgImage.aeskey) && C46238a.m51546a(Integer.valueOf(this.crypt_ver), Integer.valueOf(chatroomMsgImage.crypt_ver)) && C46238a.m51546a(this.url, chatroomMsgImage.url) && C46238a.m51546a(Integer.valueOf(this.hd_size), Integer.valueOf(chatroomMsgImage.hd_size)) && C46238a.m51546a(Integer.valueOf(this.mid_size), Integer.valueOf(chatroomMsgImage.mid_size)) && C46238a.m51546a(Integer.valueOf(this.thumb_size), Integer.valueOf(chatroomMsgImage.thumb_size)) && C46238a.m51546a(Integer.valueOf(this.thumb_height), Integer.valueOf(chatroomMsgImage.thumb_height)) && C46238a.m51546a(Integer.valueOf(this.thumb_width), Integer.valueOf(chatroomMsgImage.thumb_width)) && C46238a.m51546a(this.md5, chatroomMsgImage.md5) && C46238a.m51546a(Integer.valueOf(this.mid_height), Integer.valueOf(chatroomMsgImage.mid_height)) && C46238a.m51546a(Integer.valueOf(this.mid_width), Integer.valueOf(chatroomMsgImage.mid_width)) && C46238a.m51546a(Integer.valueOf(this.hd_height), Integer.valueOf(chatroomMsgImage.hd_height)) && C46238a.m51546a(Integer.valueOf(this.hd_width), Integer.valueOf(chatroomMsgImage.hd_width)) && C46238a.m51546a(Integer.valueOf(this.hevc_hd_size), Integer.valueOf(chatroomMsgImage.hevc_hd_size)) && C46238a.m51546a(Integer.valueOf(this.hevc_mid_size), Integer.valueOf(chatroomMsgImage.hevc_mid_size)) && C46238a.m51546a(Integer.valueOf(this.hevc_thumb_size), Integer.valueOf(chatroomMsgImage.hevc_thumb_size));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        int i3 = 0;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            String str = this.aeskey;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            aVar.mo74318e(2, this.crypt_ver);
            String str2 = this.url;
            if (str2 != null) {
                aVar.mo74323j(3, str2);
            }
            aVar.mo74318e(4, this.hd_size);
            aVar.mo74318e(5, this.mid_size);
            aVar.mo74318e(6, this.thumb_size);
            aVar.mo74318e(7, this.thumb_height);
            aVar.mo74318e(8, this.thumb_width);
            String str3 = this.md5;
            if (str3 != null) {
                aVar.mo74323j(9, str3);
            }
            aVar.mo74318e(10, this.mid_height);
            aVar.mo74318e(11, this.mid_width);
            aVar.mo74318e(12, this.hd_height);
            aVar.mo74318e(13, this.hd_width);
            aVar.mo74318e(14, this.hevc_hd_size);
            aVar.mo74318e(15, this.hevc_mid_size);
            aVar.mo74318e(16, this.hevc_thumb_size);
            return 0;
        } else if (i2 == 1) {
            String str4 = this.aeskey;
            if (str4 != null) {
                i3 = C52418a.m58683j(1, str4) + 0;
            }
            int e = i3 + C52418a.m58678e(2, this.crypt_ver);
            String str5 = this.url;
            if (str5 != null) {
                e += C52418a.m58683j(3, str5);
            }
            int e2 = e + C52418a.m58678e(4, this.hd_size) + C52418a.m58678e(5, this.mid_size) + C52418a.m58678e(6, this.thumb_size) + C52418a.m58678e(7, this.thumb_height) + C52418a.m58678e(8, this.thumb_width);
            String str6 = this.md5;
            if (str6 != null) {
                e2 += C52418a.m58683j(9, str6);
            }
            return e2 + C52418a.m58678e(10, this.mid_height) + C52418a.m58678e(11, this.mid_width) + C52418a.m58678e(12, this.hd_height) + C52418a.m58678e(13, this.hd_width) + C52418a.m58678e(14, this.hevc_hd_size) + C52418a.m58678e(15, this.hevc_mid_size) + C52418a.m58678e(16, this.hevc_thumb_size);
        } else if (i2 == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            return 0;
        } else if (i2 != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            ChatroomMsgImage chatroomMsgImage = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    chatroomMsgImage.aeskey = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    chatroomMsgImage.crypt_ver = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    chatroomMsgImage.url = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    chatroomMsgImage.hd_size = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    chatroomMsgImage.mid_size = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    chatroomMsgImage.thumb_size = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    chatroomMsgImage.thumb_height = aVar3.mo141629g(intValue);
                    return 0;
                case 8:
                    chatroomMsgImage.thumb_width = aVar3.mo141629g(intValue);
                    return 0;
                case 9:
                    chatroomMsgImage.md5 = aVar3.mo141633k(intValue);
                    return 0;
                case 10:
                    chatroomMsgImage.mid_height = aVar3.mo141629g(intValue);
                    return 0;
                case 11:
                    chatroomMsgImage.mid_width = aVar3.mo141629g(intValue);
                    return 0;
                case 12:
                    chatroomMsgImage.hd_height = aVar3.mo141629g(intValue);
                    return 0;
                case 13:
                    chatroomMsgImage.hd_width = aVar3.mo141629g(intValue);
                    return 0;
                case 14:
                    chatroomMsgImage.hevc_hd_size = aVar3.mo141629g(intValue);
                    return 0;
                case 15:
                    chatroomMsgImage.hevc_mid_size = aVar3.mo141629g(intValue);
                    return 0;
                case 16:
                    chatroomMsgImage.hevc_thumb_size = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }

    public ChatroomMsgImage setAeskey(String str) {
        this.aeskey = str;
        return this;
    }

    public ChatroomMsgImage setCrypt_ver(int i) {
        this.crypt_ver = i;
        return this;
    }

    public ChatroomMsgImage setHd_height(int i) {
        this.hd_height = i;
        return this;
    }

    public ChatroomMsgImage setHd_size(int i) {
        this.hd_size = i;
        return this;
    }

    public ChatroomMsgImage setHd_width(int i) {
        this.hd_width = i;
        return this;
    }

    public ChatroomMsgImage setHevc_hd_size(int i) {
        this.hevc_hd_size = i;
        return this;
    }

    public ChatroomMsgImage setHevc_mid_size(int i) {
        this.hevc_mid_size = i;
        return this;
    }

    public ChatroomMsgImage setHevc_thumb_size(int i) {
        this.hevc_thumb_size = i;
        return this;
    }

    public ChatroomMsgImage setMd5(String str) {
        this.md5 = str;
        return this;
    }

    public ChatroomMsgImage setMid_height(int i) {
        this.mid_height = i;
        return this;
    }

    public ChatroomMsgImage setMid_size(int i) {
        this.mid_size = i;
        return this;
    }

    public ChatroomMsgImage setMid_width(int i) {
        this.mid_width = i;
        return this;
    }

    public ChatroomMsgImage setThumb_height(int i) {
        this.thumb_height = i;
        return this;
    }

    public ChatroomMsgImage setThumb_size(int i) {
        this.thumb_size = i;
        return this;
    }

    public ChatroomMsgImage setThumb_width(int i) {
        this.thumb_width = i;
        return this;
    }

    public ChatroomMsgImage setUrl(String str) {
        this.url = str;
        return this;
    }
}
