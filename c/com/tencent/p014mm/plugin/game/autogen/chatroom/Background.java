package com.tencent.p014mm.plugin.game.autogen.chatroom;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: com.tencent.mm.plugin.game.autogen.chatroom.Background */
public class Background extends C47465a {
    public BgImgInfo img_info;
    public BgPagInfo pag_info;
    public int type;

    public static final Background create() {
        return new Background();
    }

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof Background)) {
            return false;
        }
        Background background = (Background) aVar;
        return C46238a.m51546a(Integer.valueOf(this.type), Integer.valueOf(background.type)) && C46238a.m51546a(this.pag_info, background.pag_info) && C46238a.m51546a(this.img_info, background.img_info);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.type);
            BgPagInfo bgPagInfo = this.pag_info;
            if (bgPagInfo != null) {
                aVar.mo74322i(2, bgPagInfo.computeSize());
                this.pag_info.writeFields(aVar);
            }
            BgImgInfo bgImgInfo = this.img_info;
            if (bgImgInfo != null) {
                aVar.mo74322i(3, bgImgInfo.computeSize());
                this.img_info.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.type) + 0;
            BgPagInfo bgPagInfo2 = this.pag_info;
            if (bgPagInfo2 != null) {
                e += C52418a.m58682i(2, bgPagInfo2.computeSize());
            }
            BgImgInfo bgImgInfo2 = this.img_info;
            return bgImgInfo2 != null ? e + C52418a.m58682i(3, bgImgInfo2.computeSize()) : e;
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
            Background background = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                background.type = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 2) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i2 = 0; i2 < size; i2++) {
                    byte[] bArr = j.get(i2);
                    BgPagInfo bgPagInfo3 = new BgPagInfo();
                    if (bArr != null && bArr.length > 0) {
                        bgPagInfo3.parseFrom(bArr);
                    }
                    background.pag_info = bgPagInfo3;
                }
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    byte[] bArr2 = j2.get(i3);
                    BgImgInfo bgImgInfo3 = new BgImgInfo();
                    if (bArr2 != null && bArr2.length > 0) {
                        bgImgInfo3.parseFrom(bArr2);
                    }
                    background.img_info = bgImgInfo3;
                }
                return 0;
            }
        }
    }

    public Background setImg_info(BgImgInfo bgImgInfo) {
        this.img_info = bgImgInfo;
        return this;
    }

    public Background setPag_info(BgPagInfo bgPagInfo) {
        this.pag_info = bgPagInfo;
        return this;
    }

    public Background setType(int i) {
        this.type = i;
        return this;
    }
}
