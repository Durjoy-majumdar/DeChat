package com.tencent.p014mm.protocal.protobuf;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: com.tencent.mm.protocal.protobuf.Html5Info */
public class Html5Info extends C47465a {
    public int height_percent;
    public int style;
    public String url;
    public String webview_ext_info;

    public static final Html5Info create() {
        return new Html5Info();
    }

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof Html5Info)) {
            return false;
        }
        Html5Info html5Info = (Html5Info) aVar;
        return C46238a.m51546a(this.url, html5Info.url) && C46238a.m51546a(Integer.valueOf(this.style), Integer.valueOf(html5Info.style)) && C46238a.m51546a(Integer.valueOf(this.height_percent), Integer.valueOf(html5Info.height_percent)) && C46238a.m51546a(this.webview_ext_info, html5Info.webview_ext_info);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.url;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            aVar.mo74318e(2, this.style);
            aVar.mo74318e(3, this.height_percent);
            String str2 = this.webview_ext_info;
            if (str2 != null) {
                aVar.mo74323j(4, str2);
            }
            return 0;
        } else if (i == 1) {
            String str3 = this.url;
            if (str3 != null) {
                i2 = 0 + C52418a.m58683j(1, str3);
            }
            int e = i2 + C52418a.m58678e(2, this.style) + C52418a.m58678e(3, this.height_percent);
            String str4 = this.webview_ext_info;
            return str4 != null ? e + C52418a.m58683j(4, str4) : e;
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
            Html5Info html5Info = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                html5Info.url = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                html5Info.style = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 3) {
                html5Info.height_percent = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                html5Info.webview_ext_info = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }

    public Html5Info setHeight_percent(int i) {
        this.height_percent = i;
        return this;
    }

    public Html5Info setStyle(int i) {
        this.style = i;
        return this;
    }

    public Html5Info setUrl(String str) {
        this.url = str;
        return this;
    }

    public Html5Info setWebview_ext_info(String str) {
        this.webview_ext_info = str;
        return this;
    }
}
