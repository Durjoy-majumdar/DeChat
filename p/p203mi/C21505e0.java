package p203mi;

import com.tencent.p014mm.autogen.mmdata.rpt.ChatRoomToolEditeLogStruct;
import eb0.C45628s0;

/* renamed from: mi.e0 */
public class C21505e0 {
    /* renamed from: a */
    public static void m24350a(String str, int i, int i2, int i3) {
        int i4 = C45628s0.m50750O(str) ? 2 : 1;
        ChatRoomToolEditeLogStruct chatRoomToolEditeLogStruct = new ChatRoomToolEditeLogStruct();
        chatRoomToolEditeLogStruct.f48254d = chatRoomToolEditeLogStruct.mo86045b("roomusrname", str, true);
        chatRoomToolEditeLogStruct.f48255e = (long) i;
        chatRoomToolEditeLogStruct.f48256f = (long) i4;
        chatRoomToolEditeLogStruct.f48257g = (long) i2;
        chatRoomToolEditeLogStruct.f48258h = (long) i3;
        chatRoomToolEditeLogStruct.mo86054n();
    }
}
