package com.tencent.p014mm.plugin.game.autogen.chatroom;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgEmoji */
public class ChatroomMsgEmoji extends C47465a {
    public String activityid;
    public String aeskey;
    public String attachedtext;
    public String attachedtextcolor;
    public String authkey;
    public String cdnurl;
    public String designerid;
    public String emojiattr;
    public String encrypturl;
    public String externmd5;
    public String externurl;
    public String extxml;
    public int height;
    public boolean is_charge;
    public int len;
    public String lensid;
    public String md5;
    public int newxmlflag;
    public String productid;
    public String thumburl;
    public String tpurl;
    public int type;
    public int width;

    public static final ChatroomMsgEmoji create() {
        return new ChatroomMsgEmoji();
    }

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof ChatroomMsgEmoji)) {
            return false;
        }
        ChatroomMsgEmoji chatroomMsgEmoji = (ChatroomMsgEmoji) aVar;
        return C46238a.m51546a(this.md5, chatroomMsgEmoji.md5) && C46238a.m51546a(Integer.valueOf(this.len), Integer.valueOf(chatroomMsgEmoji.len)) && C46238a.m51546a(this.productid, chatroomMsgEmoji.productid) && C46238a.m51546a(Integer.valueOf(this.type), Integer.valueOf(chatroomMsgEmoji.type)) && C46238a.m51546a(this.extxml, chatroomMsgEmoji.extxml) && C46238a.m51546a(this.cdnurl, chatroomMsgEmoji.cdnurl) && C46238a.m51546a(Integer.valueOf(this.newxmlflag), Integer.valueOf(chatroomMsgEmoji.newxmlflag)) && C46238a.m51546a(this.designerid, chatroomMsgEmoji.designerid) && C46238a.m51546a(this.thumburl, chatroomMsgEmoji.thumburl) && C46238a.m51546a(this.encrypturl, chatroomMsgEmoji.encrypturl) && C46238a.m51546a(this.aeskey, chatroomMsgEmoji.aeskey) && C46238a.m51546a(Integer.valueOf(this.width), Integer.valueOf(chatroomMsgEmoji.width)) && C46238a.m51546a(Integer.valueOf(this.height), Integer.valueOf(chatroomMsgEmoji.height)) && C46238a.m51546a(this.externurl, chatroomMsgEmoji.externurl) && C46238a.m51546a(this.externmd5, chatroomMsgEmoji.externmd5) && C46238a.m51546a(this.activityid, chatroomMsgEmoji.activityid) && C46238a.m51546a(this.tpurl, chatroomMsgEmoji.tpurl) && C46238a.m51546a(this.authkey, chatroomMsgEmoji.authkey) && C46238a.m51546a(this.attachedtext, chatroomMsgEmoji.attachedtext) && C46238a.m51546a(this.attachedtextcolor, chatroomMsgEmoji.attachedtextcolor) && C46238a.m51546a(this.lensid, chatroomMsgEmoji.lensid) && C46238a.m51546a(Boolean.valueOf(this.is_charge), Boolean.valueOf(chatroomMsgEmoji.is_charge)) && C46238a.m51546a(this.emojiattr, chatroomMsgEmoji.emojiattr);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        int i3 = 0;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            String str = this.md5;
            if (str != null) {
                if (str != null) {
                    aVar.mo74323j(1, str);
                }
                aVar.mo74318e(2, this.len);
                String str2 = this.productid;
                if (str2 != null) {
                    aVar.mo74323j(3, str2);
                }
                aVar.mo74318e(4, this.type);
                String str3 = this.extxml;
                if (str3 != null) {
                    aVar.mo74323j(5, str3);
                }
                String str4 = this.cdnurl;
                if (str4 != null) {
                    aVar.mo74323j(6, str4);
                }
                aVar.mo74318e(7, this.newxmlflag);
                String str5 = this.designerid;
                if (str5 != null) {
                    aVar.mo74323j(8, str5);
                }
                String str6 = this.thumburl;
                if (str6 != null) {
                    aVar.mo74323j(9, str6);
                }
                String str7 = this.encrypturl;
                if (str7 != null) {
                    aVar.mo74323j(10, str7);
                }
                String str8 = this.aeskey;
                if (str8 != null) {
                    aVar.mo74323j(11, str8);
                }
                aVar.mo74318e(12, this.width);
                aVar.mo74318e(13, this.height);
                String str9 = this.externurl;
                if (str9 != null) {
                    aVar.mo74323j(14, str9);
                }
                String str10 = this.externmd5;
                if (str10 != null) {
                    aVar.mo74323j(15, str10);
                }
                String str11 = this.activityid;
                if (str11 != null) {
                    aVar.mo74323j(16, str11);
                }
                String str12 = this.tpurl;
                if (str12 != null) {
                    aVar.mo74323j(17, str12);
                }
                String str13 = this.authkey;
                if (str13 != null) {
                    aVar.mo74323j(18, str13);
                }
                String str14 = this.attachedtext;
                if (str14 != null) {
                    aVar.mo74323j(19, str14);
                }
                String str15 = this.attachedtextcolor;
                if (str15 != null) {
                    aVar.mo74323j(20, str15);
                }
                String str16 = this.lensid;
                if (str16 != null) {
                    aVar.mo74323j(21, str16);
                }
                aVar.mo74314a(22, this.is_charge);
                String str17 = this.emojiattr;
                if (str17 != null) {
                    aVar.mo74323j(23, str17);
                }
                return 0;
            }
            throw new C52419b("Not all required fields were included: md5");
        } else if (i2 == 1) {
            String str18 = this.md5;
            if (str18 != null) {
                i3 = C52418a.m58683j(1, str18) + 0;
            }
            int e = i3 + C52418a.m58678e(2, this.len);
            String str19 = this.productid;
            if (str19 != null) {
                e += C52418a.m58683j(3, str19);
            }
            int e2 = e + C52418a.m58678e(4, this.type);
            String str20 = this.extxml;
            if (str20 != null) {
                e2 += C52418a.m58683j(5, str20);
            }
            String str21 = this.cdnurl;
            if (str21 != null) {
                e2 += C52418a.m58683j(6, str21);
            }
            int e3 = e2 + C52418a.m58678e(7, this.newxmlflag);
            String str22 = this.designerid;
            if (str22 != null) {
                e3 += C52418a.m58683j(8, str22);
            }
            String str23 = this.thumburl;
            if (str23 != null) {
                e3 += C52418a.m58683j(9, str23);
            }
            String str24 = this.encrypturl;
            if (str24 != null) {
                e3 += C52418a.m58683j(10, str24);
            }
            String str25 = this.aeskey;
            if (str25 != null) {
                e3 += C52418a.m58683j(11, str25);
            }
            int e4 = e3 + C52418a.m58678e(12, this.width) + C52418a.m58678e(13, this.height);
            String str26 = this.externurl;
            if (str26 != null) {
                e4 += C52418a.m58683j(14, str26);
            }
            String str27 = this.externmd5;
            if (str27 != null) {
                e4 += C52418a.m58683j(15, str27);
            }
            String str28 = this.activityid;
            if (str28 != null) {
                e4 += C52418a.m58683j(16, str28);
            }
            String str29 = this.tpurl;
            if (str29 != null) {
                e4 += C52418a.m58683j(17, str29);
            }
            String str30 = this.authkey;
            if (str30 != null) {
                e4 += C52418a.m58683j(18, str30);
            }
            String str31 = this.attachedtext;
            if (str31 != null) {
                e4 += C52418a.m58683j(19, str31);
            }
            String str32 = this.attachedtextcolor;
            if (str32 != null) {
                e4 += C52418a.m58683j(20, str32);
            }
            String str33 = this.lensid;
            if (str33 != null) {
                e4 += C52418a.m58683j(21, str33);
            }
            int a = e4 + C52418a.m58674a(22, this.is_charge);
            String str34 = this.emojiattr;
            return str34 != null ? a + C52418a.m58683j(23, str34) : a;
        } else if (i2 == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.md5 != null) {
                return 0;
            }
            throw new C52419b("Not all required fields were included: md5");
        } else if (i2 != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            ChatroomMsgEmoji chatroomMsgEmoji = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    chatroomMsgEmoji.md5 = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    chatroomMsgEmoji.len = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    chatroomMsgEmoji.productid = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    chatroomMsgEmoji.type = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    chatroomMsgEmoji.extxml = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    chatroomMsgEmoji.cdnurl = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    chatroomMsgEmoji.newxmlflag = aVar3.mo141629g(intValue);
                    return 0;
                case 8:
                    chatroomMsgEmoji.designerid = aVar3.mo141633k(intValue);
                    return 0;
                case 9:
                    chatroomMsgEmoji.thumburl = aVar3.mo141633k(intValue);
                    return 0;
                case 10:
                    chatroomMsgEmoji.encrypturl = aVar3.mo141633k(intValue);
                    return 0;
                case 11:
                    chatroomMsgEmoji.aeskey = aVar3.mo141633k(intValue);
                    return 0;
                case 12:
                    chatroomMsgEmoji.width = aVar3.mo141629g(intValue);
                    return 0;
                case 13:
                    chatroomMsgEmoji.height = aVar3.mo141629g(intValue);
                    return 0;
                case 14:
                    chatroomMsgEmoji.externurl = aVar3.mo141633k(intValue);
                    return 0;
                case 15:
                    chatroomMsgEmoji.externmd5 = aVar3.mo141633k(intValue);
                    return 0;
                case 16:
                    chatroomMsgEmoji.activityid = aVar3.mo141633k(intValue);
                    return 0;
                case 17:
                    chatroomMsgEmoji.tpurl = aVar3.mo141633k(intValue);
                    return 0;
                case 18:
                    chatroomMsgEmoji.authkey = aVar3.mo141633k(intValue);
                    return 0;
                case 19:
                    chatroomMsgEmoji.attachedtext = aVar3.mo141633k(intValue);
                    return 0;
                case 20:
                    chatroomMsgEmoji.attachedtextcolor = aVar3.mo141633k(intValue);
                    return 0;
                case 21:
                    chatroomMsgEmoji.lensid = aVar3.mo141633k(intValue);
                    return 0;
                case 22:
                    chatroomMsgEmoji.is_charge = aVar3.mo141625c(intValue);
                    return 0;
                case 23:
                    chatroomMsgEmoji.emojiattr = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }

    public ChatroomMsgEmoji setActivityid(String str) {
        this.activityid = str;
        return this;
    }

    public ChatroomMsgEmoji setAeskey(String str) {
        this.aeskey = str;
        return this;
    }

    public ChatroomMsgEmoji setAttachedtext(String str) {
        this.attachedtext = str;
        return this;
    }

    public ChatroomMsgEmoji setAttachedtextcolor(String str) {
        this.attachedtextcolor = str;
        return this;
    }

    public ChatroomMsgEmoji setAuthkey(String str) {
        this.authkey = str;
        return this;
    }

    public ChatroomMsgEmoji setCdnurl(String str) {
        this.cdnurl = str;
        return this;
    }

    public ChatroomMsgEmoji setDesignerid(String str) {
        this.designerid = str;
        return this;
    }

    public ChatroomMsgEmoji setEmojiattr(String str) {
        this.emojiattr = str;
        return this;
    }

    public ChatroomMsgEmoji setEncrypturl(String str) {
        this.encrypturl = str;
        return this;
    }

    public ChatroomMsgEmoji setExternmd5(String str) {
        this.externmd5 = str;
        return this;
    }

    public ChatroomMsgEmoji setExternurl(String str) {
        this.externurl = str;
        return this;
    }

    public ChatroomMsgEmoji setExtxml(String str) {
        this.extxml = str;
        return this;
    }

    public ChatroomMsgEmoji setHeight(int i) {
        this.height = i;
        return this;
    }

    public ChatroomMsgEmoji setIs_charge(boolean z) {
        this.is_charge = z;
        return this;
    }

    public ChatroomMsgEmoji setLen(int i) {
        this.len = i;
        return this;
    }

    public ChatroomMsgEmoji setLensid(String str) {
        this.lensid = str;
        return this;
    }

    public ChatroomMsgEmoji setMd5(String str) {
        this.md5 = str;
        return this;
    }

    public ChatroomMsgEmoji setNewxmlflag(int i) {
        this.newxmlflag = i;
        return this;
    }

    public ChatroomMsgEmoji setProductid(String str) {
        this.productid = str;
        return this;
    }

    public ChatroomMsgEmoji setThumburl(String str) {
        this.thumburl = str;
        return this;
    }

    public ChatroomMsgEmoji setTpurl(String str) {
        this.tpurl = str;
        return this;
    }

    public ChatroomMsgEmoji setType(int i) {
        this.type = i;
        return this;
    }

    public ChatroomMsgEmoji setWidth(int i) {
        this.width = i;
        return this;
    }
}
