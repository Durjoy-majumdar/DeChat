package com.tencent.p014mm.protocal.protobuf;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: com.tencent.mm.protocal.protobuf.FinderMediaExtra */
public class FinderMediaExtra extends C47465a {
    public LinkedList<String> cover_url_word = new LinkedList<>();
    public String text;

    public static final FinderMediaExtra create() {
        return new FinderMediaExtra();
    }

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof FinderMediaExtra)) {
            return false;
        }
        FinderMediaExtra finderMediaExtra = (FinderMediaExtra) aVar;
        return C46238a.m51546a(this.text, finderMediaExtra.text) && C46238a.m51546a(this.cover_url_word, finderMediaExtra.cover_url_word);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.text;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            aVar.mo74320g(2, 1, this.cover_url_word);
            return 0;
        } else if (i == 1) {
            String str2 = this.text;
            if (str2 != null) {
                i2 = 0 + C52418a.m58683j(1, str2);
            }
            return i2 + C52418a.m58680g(2, 1, this.cover_url_word);
        } else if (i == 2) {
            this.cover_url_word.clear();
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
            FinderMediaExtra finderMediaExtra = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                finderMediaExtra.text = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 2) {
                return -1;
            } else {
                finderMediaExtra.cover_url_word.add(aVar3.mo141633k(intValue));
                return 0;
            }
        }
    }

    public FinderMediaExtra setCover_url_word(LinkedList<String> linkedList) {
        this.cover_url_word = linkedList;
        return this;
    }

    public FinderMediaExtra setText(String str) {
        this.text = str;
        return this;
    }
}
