package com.tencent.p014mm.plugin.game.autogen.chatroom;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: com.tencent.mm.plugin.game.autogen.chatroom.DebugOption */
public class DebugOption extends C47465a {
    public String debug_info;
    public boolean need_debug;

    public static final DebugOption create() {
        return new DebugOption();
    }

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof DebugOption)) {
            return false;
        }
        DebugOption debugOption = (DebugOption) aVar;
        return C46238a.m51546a(Boolean.valueOf(this.need_debug), Boolean.valueOf(debugOption.need_debug)) && C46238a.m51546a(this.debug_info, debugOption.debug_info);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74314a(1, this.need_debug);
            String str = this.debug_info;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            return 0;
        } else if (i == 1) {
            int a = C52418a.m58674a(1, this.need_debug) + 0;
            String str2 = this.debug_info;
            return str2 != null ? a + C52418a.m58683j(2, str2) : a;
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
            DebugOption debugOption = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                debugOption.need_debug = aVar3.mo141625c(intValue);
                return 0;
            } else if (intValue != 2) {
                return -1;
            } else {
                debugOption.debug_info = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }

    public DebugOption setDebug_info(String str) {
        this.debug_info = str;
        return this;
    }

    public DebugOption setNeed_debug(boolean z) {
        this.need_debug = z;
        return this;
    }
}
