package p203mi;

import com.tencent.p014mm.autogen.mmdata.rpt.RoomTodoEnterStruct;
import com.tencent.p014mm.autogen.mmdata.rpt.RoomTodoHandleStruct;
import com.tencent.p014mm.autogen.mmdata.rpt.RoomTodoMsgTailOpStruct;
import eb0.C45628s0;

/* renamed from: mi.c0 */
public class C24982c0 {
    /* renamed from: a */
    public static void m31597a(String str, int i, int i2, String str2, String str3) {
        int i3 = C45628s0.m50750O(str) ? 2 : C45628s0.m50752Q(str) ? 1 : 0;
        RoomTodoEnterStruct roomTodoEnterStruct = new RoomTodoEnterStruct();
        roomTodoEnterStruct.f69574d = roomTodoEnterStruct.mo86045b("roomId", str, true);
        roomTodoEnterStruct.f69575e = (long) i3;
        roomTodoEnterStruct.f69576f = (long) i;
        roomTodoEnterStruct.f69577g = (long) i2;
        roomTodoEnterStruct.f69578h = 2;
        roomTodoEnterStruct.f69579i = roomTodoEnterStruct.mo86045b("todoid", str2, true);
        roomTodoEnterStruct.f69580j = roomTodoEnterStruct.mo86045b("appusername", str3, true);
        roomTodoEnterStruct.mo86054n();
    }

    /* renamed from: b */
    public static void m31598b(String str, int i, int i2, int i3, String str2, String str3) {
        int i4 = C45628s0.m50750O(str) ? 2 : C45628s0.m50752Q(str) ? 1 : 0;
        RoomTodoHandleStruct roomTodoHandleStruct = new RoomTodoHandleStruct();
        roomTodoHandleStruct.f69581d = roomTodoHandleStruct.mo86045b("roomId", str, true);
        roomTodoHandleStruct.f69582e = (long) i4;
        roomTodoHandleStruct.f69583f = (long) i;
        roomTodoHandleStruct.f69584g = (long) i2;
        roomTodoHandleStruct.f69585h = (long) i3;
        roomTodoHandleStruct.f69586i = roomTodoHandleStruct.mo86045b("todoid", str2, true);
        roomTodoHandleStruct.f69587j = roomTodoHandleStruct.mo86045b("appusername", str3, true);
        roomTodoHandleStruct.mo86054n();
    }

    /* renamed from: c */
    public static void m31599c(String str, int i, int i2, int i3, int i4, String str2, String str3) {
        int i5 = C45628s0.m50750O(str) ? 2 : 1;
        RoomTodoMsgTailOpStruct roomTodoMsgTailOpStruct = new RoomTodoMsgTailOpStruct();
        roomTodoMsgTailOpStruct.f69588d = roomTodoMsgTailOpStruct.mo86045b("roomid", str, true);
        roomTodoMsgTailOpStruct.f69589e = (long) i5;
        roomTodoMsgTailOpStruct.f69590f = (long) i;
        roomTodoMsgTailOpStruct.f69591g = (long) i2;
        roomTodoMsgTailOpStruct.f69592h = (long) i3;
        roomTodoMsgTailOpStruct.f69593i = (long) i4;
        roomTodoMsgTailOpStruct.f69594j = roomTodoMsgTailOpStruct.mo86045b("todoid", str2, true);
        roomTodoMsgTailOpStruct.f69595k = roomTodoMsgTailOpStruct.mo86045b("appusername", str3, true);
        roomTodoMsgTailOpStruct.mo86054n();
    }
}
