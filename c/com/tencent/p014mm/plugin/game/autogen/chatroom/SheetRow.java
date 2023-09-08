package com.tencent.p014mm.plugin.game.autogen.chatroom;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;

/* renamed from: com.tencent.mm.plugin.game.autogen.chatroom.SheetRow */
public class SheetRow extends C47465a {
    public LinkedList<String> sheet_col_list = new LinkedList<>();

    public static final SheetRow create() {
        return new SheetRow();
    }

    public boolean compareContent(C47465a aVar) {
        return aVar != null && (aVar instanceof SheetRow) && C46238a.m51546a(this.sheet_col_list, ((SheetRow) aVar).sheet_col_list);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            objArr[0].mo74320g(1, 1, this.sheet_col_list);
            return 0;
        } else if (i == 1) {
            return C52418a.m58680g(1, 1, this.sheet_col_list) + 0;
        } else {
            if (i == 2) {
                this.sheet_col_list.clear();
                C102122a aVar = new C102122a(objArr[0], C47465a.unknownTagHandler);
                for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar)) {
                    if (!super.populateBuilderWithField(aVar, this, nextFieldNumber)) {
                        aVar.mo141624b();
                    }
                }
                return 0;
            } else if (i != 3) {
                return -1;
            } else {
                C102122a aVar2 = objArr[0];
                SheetRow sheetRow = objArr[1];
                int intValue = objArr[2].intValue();
                if (intValue != 1) {
                    return -1;
                }
                sheetRow.sheet_col_list.add(aVar2.mo141633k(intValue));
                return 0;
            }
        }
    }

    public SheetRow setSheet_col_list(LinkedList<String> linkedList) {
        this.sheet_col_list = linkedList;
        return this;
    }
}
