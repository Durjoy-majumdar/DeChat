package com.tencent.p014mm.plugin.sns.p106ui;

import com.tencent.p014mm.plugin.sns.p106ui.SnsChatRoomMemberUI;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import java.util.Comparator;

/* renamed from: com.tencent.mm.plugin.sns.ui.a4 */
public class C71230a4 implements Comparator<SnsChatRoomMemberUI.C71203b> {
    public C71230a4(SnsChatRoomMemberUI snsChatRoomMemberUI) {
    }

    public int compare(Object obj, Object obj2) {
        SnsMethodCalculate.markStartTimeMs("compare", "com.tencent.mm.plugin.sns.ui.SnsChatRoomMemberUI$2");
        SnsMethodCalculate.markStartTimeMs("compare", "com.tencent.mm.plugin.sns.ui.SnsChatRoomMemberUI$2");
        int i = ((SnsChatRoomMemberUI.C71203b) obj2).f206106c - ((SnsChatRoomMemberUI.C71203b) obj).f206106c;
        SnsMethodCalculate.markEndTimeMs("compare", "com.tencent.mm.plugin.sns.ui.SnsChatRoomMemberUI$2");
        SnsMethodCalculate.markEndTimeMs("compare", "com.tencent.mm.plugin.sns.ui.SnsChatRoomMemberUI$2");
        return i;
    }
}
