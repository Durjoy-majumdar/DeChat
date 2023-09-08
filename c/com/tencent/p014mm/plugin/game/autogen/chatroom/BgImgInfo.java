package com.tencent.p014mm.plugin.game.autogen.chatroom;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: com.tencent.mm.plugin.game.autogen.chatroom.BgImgInfo */
public class BgImgInfo extends C47465a {
    public String img_url;
    public boolean need_gaussian_blur;

    public static final BgImgInfo create() {
        return new BgImgInfo();
    }

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof BgImgInfo)) {
            return false;
        }
        BgImgInfo bgImgInfo = (BgImgInfo) aVar;
        return C46238a.m51546a(this.img_url, bgImgInfo.img_url) && C46238a.m51546a(Boolean.valueOf(this.need_gaussian_blur), Boolean.valueOf(bgImgInfo.need_gaussian_blur));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.img_url;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            aVar.mo74314a(2, this.need_gaussian_blur);
            return 0;
        } else if (i == 1) {
            String str2 = this.img_url;
            if (str2 != null) {
                i2 = 0 + C52418a.m58683j(1, str2);
            }
            return i2 + C52418a.m58674a(2, this.need_gaussian_blur);
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
            BgImgInfo bgImgInfo = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                bgImgInfo.img_url = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 2) {
                return -1;
            } else {
                bgImgInfo.need_gaussian_blur = aVar3.mo141625c(intValue);
                return 0;
            }
        }
    }

    public BgImgInfo setImg_url(String str) {
        this.img_url = str;
        return this;
    }

    public BgImgInfo setNeed_gaussian_blur(boolean z) {
        this.need_gaussian_blur = z;
        return this;
    }
}
