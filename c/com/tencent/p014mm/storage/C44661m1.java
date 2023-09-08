package com.tencent.p014mm.storage;

import a11.C39479c;
import android.database.Cursor;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.XmlParser;
import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import eb0.C75592q0;
import f40.C86709a0;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import p749xh.C53335e1;
import p788aj.C39607a;
import p788aj.C39608b;
import te3.C49464fs;

/* renamed from: com.tencent.mm.storage.m1 */
public class C44661m1 extends C53335e1 {

    /* renamed from: x1 */
    public static IAutoDBItem.MAutoDBInfo f121082x1 = C53335e1.initAutoDBInfo(C44661m1.class);

    /* renamed from: t1 */
    public C39607a f121083t1;

    /* renamed from: u1 */
    public C39607a f121084u1;

    /* renamed from: v1 */
    public List<String> f121085v1 = new LinkedList();

    /* renamed from: w1 */
    public Map<String, C39608b> f121086w1 = new ConcurrentHashMap();

    public C44661m1() {
        C39607a aVar = new C39607a();
        this.f121083t1 = aVar;
        this.f121084u1 = aVar;
    }

    /* renamed from: B2 */
    public static int m49270B2(String str) {
        try {
            return Util.getInt(str, 0);
        } catch (Exception unused) {
            if (str == null) {
                return 0;
            }
            Log.m105920e("MicroMsg.ChatRoomMember", "parserInt error " + str);
            return 0;
        }
    }

    /* renamed from: G2 */
    public static List<String> m49271G2(String str) {
        LinkedList linkedList = new LinkedList();
        if (Util.isNullOrNil(str)) {
            return linkedList;
        }
        String[] split = str.split(";");
        for (String add : split) {
            linkedList.add(add);
        }
        return linkedList;
    }

    /* renamed from: A2 */
    public void mo69779A2(String str, List<C49464fs> list) {
        if (mo69794v2(this.f121084u1)) {
            mo69784l2();
        }
        for (C49464fs next : list) {
            if (((ConcurrentHashMap) this.f121086w1).containsKey(next.f133650d)) {
                C39608b bVar = (C39608b) ((ConcurrentHashMap) this.f121086w1).get(next.f133650d);
                bVar.f106344e = next.f133652f;
                bVar.f106345f = next.f133655i;
                bVar.f106346g = next.f133656j;
            }
        }
        this.f121084u1.f106335d.clear();
        for (String str2 : ((ConcurrentHashMap) this.f121086w1).keySet()) {
            this.f121084u1.f106335d.add((C39608b) ((ConcurrentHashMap) this.f121086w1).get(str2));
        }
        mo69782E2(str, this.f121084u1, false);
    }

    /* renamed from: C2 */
    public C44661m1 mo69780C2(List<String> list) {
        String str = "";
        if (!(list == null || list.size() == 0)) {
            for (int i = 0; i < list.size(); i++) {
                str = str + list.get(i);
                if (i < list.size() - 1) {
                    str = str + ";";
                }
            }
        }
        this.field_memberlist = str;
        return this;
    }

    /* renamed from: D2 */
    public void mo69781D2(int i) {
        if (mo69794v2(this.f121084u1)) {
            mo69784l2();
        }
        C39607a aVar = this.f121084u1;
        aVar.f106341j = i;
        try {
            this.field_roomdata = aVar.toByteArray();
        } catch (Exception e) {
            Log.m105921e("MicroMsg.ChatRoomMember", "exception:%s", Util.stackTraceToString(e));
        }
    }

    /* renamed from: E2 */
    public C44661m1 mo69782E2(String str, C39607a aVar, boolean z) {
        int i;
        this.field_modifytime = System.currentTimeMillis();
        if (!z) {
            C39608b bVar = null;
            Iterator<C39608b> it = aVar.f106335d.iterator();
            while (it.hasNext()) {
                C39608b next = it.next();
                String str2 = next.f106343d;
                if (str2 != null && str2.equals(str)) {
                    bVar = next;
                }
            }
            if (bVar != null) {
                this.field_selfDisplayName = bVar.f106344e;
                i = bVar.f106345f;
                this.field_isShowname = i & 1;
            } else {
                i = 0;
            }
            Log.m105919d("MicroMsg.ChatRoomMember", "displayName[%s] roomFlag[%d] flag[%d]", this.field_selfDisplayName, Integer.valueOf(this.field_chatroomdataflag), Integer.valueOf(i));
            int i2 = (i & 2) | (aVar.f106336e & -3);
            aVar.f106336e = i2;
            this.field_chatroomdataflag = i2;
        }
        try {
            this.field_roomdata = aVar.toByteArray();
            this.f121084u1 = aVar;
        } catch (Exception e) {
            Log.m105921e("MicroMsg.ChatRoomMember", "exception:%s", Util.stackTraceToString(e));
        }
        mo69785m2(aVar);
        return this;
    }

    /* renamed from: F2 */
    public C44661m1 mo69783F2(String str, String str2) {
        String str3;
        String str4;
        String str5;
        C39607a aVar = new C39607a();
        if (!Util.isNullOrNil(str2)) {
            int indexOf = str2.indexOf(60);
            if (indexOf > 0) {
                str2 = str2.substring(indexOf);
            }
            Map<String, String> parseXml = XmlParser.parseXml(str2, "RoomData", (String) null);
            if (parseXml == null) {
                Log.m105920e("MicroMsg.ChatRoomMember", "parse RoomData failed");
                aVar = null;
            } else {
                int i = 0;
                while (true) {
                    try {
                        C39608b bVar = new C39608b();
                        if (i == 0) {
                            str5 = ".RoomData.Member.$UserName";
                            str4 = ".RoomData.Member.DisplayName";
                            str3 = ".RoomData.Member.Flag";
                        } else if (i != 0) {
                            str5 = ".RoomData.Member" + i + ".$UserName";
                            str4 = ".RoomData.Member" + i + ".DisplayName";
                            str3 = ".RoomData.Member" + i + ".Flag";
                        } else {
                            str5 = null;
                            str4 = null;
                            str3 = null;
                        }
                        String nullAs = Util.nullAs(parseXml.get(str5), "");
                        if (Util.isNullOrNil(nullAs)) {
                            break;
                        }
                        bVar.f106343d = nullAs;
                        bVar.f106344e = Util.nullAs(parseXml.get(str4), "");
                        bVar.f106345f = m49270B2(parseXml.get(str3));
                        aVar.f106335d.add(bVar);
                        i++;
                    } catch (Exception unused) {
                    }
                }
                aVar.f106337f = m49270B2(parseXml.get(".RoomData.Type"));
                aVar.f106338g = m49270B2(parseXml.get(".RoomData.Status"));
                aVar.f106339h = m49270B2(parseXml.get(".RoomData.MaxCount"));
                aVar.f106340i = Util.nullAs(parseXml.get(".RoomData.ExtInfo.Upgrader"), "");
            }
        }
        mo69782E2(str, aVar, false);
        return this;
    }

    public void convertFrom(Cursor cursor) {
        super.convertFrom(cursor);
        byte[] bArr = this.field_roomInfoDetailResByte;
        if (bArr != null && bArr.length > 0) {
            Log.m105925i("MicroMsg.ChatRoomMember", "handleGetRoomInfoResUnKnownField saveByteVersion:%s handleByteVersion:%s byte:%s", this.field_saveByteVersion, this.field_handleByteVersion, Integer.valueOf(bArr.length));
        }
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f121082x1;
    }

    /* renamed from: l2 */
    public final void mo69784l2() {
        if (!Util.isNullOrNil(this.field_roomdata)) {
            try {
                this.f121084u1 = (C39607a) new C39607a().parseFrom(this.field_roomdata);
            } catch (Exception unused) {
                this.f121084u1 = new C39607a();
            }
            mo69785m2(this.f121084u1);
        }
    }

    /* renamed from: m2 */
    public final void mo69785m2(C39607a aVar) {
        String str;
        if (this.field_roomdata == null) {
            aVar = new C39607a();
        }
        Iterator<C39608b> it = aVar.f106335d.iterator();
        while (it.hasNext()) {
            C39608b next = it.next();
            if (!(next == null || (str = next.f106343d) == null)) {
                ((ConcurrentHashMap) this.f121086w1).put(str, next);
            }
        }
    }

    /* renamed from: n2 */
    public C39608b mo69786n2(String str) {
        Map<String, C39608b> map = this.f121086w1;
        if (map == null) {
            Log.m105920e("MicroMsg.ChatRoomMember", "getChatroomData hashMap is null!");
            return null;
        }
        if (((ConcurrentHashMap) map).size() <= 0) {
            mo69784l2();
        }
        return (C39608b) ((ConcurrentHashMap) this.f121086w1).get(str);
    }

    /* renamed from: o2 */
    public int mo69787o2() {
        if (mo69794v2(this.f121084u1)) {
            mo69784l2();
        }
        return this.f121084u1.f106339h;
    }

    /* renamed from: p2 */
    public int mo69788p2() {
        if (mo69794v2(this.f121084u1)) {
            mo69784l2();
        }
        return this.f121084u1.f106337f;
    }

    /* renamed from: q2 */
    public String mo69789q2(String str) {
        C39608b n2 = mo69786n2(str);
        return n2 == null ? "" : Util.nullAs(n2.f106344e, "");
    }

    /* renamed from: r2 */
    public List<String> mo69790r2() {
        List<String> list = this.f121085v1;
        if (list == null || list.size() == 0) {
            this.f121085v1 = m49271G2(this.field_memberlist);
        }
        return this.f121085v1;
    }

    /* renamed from: s2 */
    public int mo69791s2() {
        if (mo69794v2(this.f121084u1)) {
            mo69784l2();
        }
        return this.f121084u1.f106341j;
    }

    /* renamed from: t2 */
    public C39607a mo69792t2() {
        if (mo69794v2(this.f121084u1)) {
            mo69784l2();
        }
        return this.f121084u1;
    }

    /* renamed from: u2 */
    public boolean mo69793u2(String str) {
        C39608b n2 = mo69786n2(str);
        return (n2 == null || (n2.f106345f & 2048) == 0) ? false : true;
    }

    /* renamed from: v2 */
    public final boolean mo69794v2(C39607a aVar) {
        return this.f121083t1.computeSize() == aVar.computeSize();
    }

    /* renamed from: w2 */
    public boolean mo69795w2() {
        int i = this.field_openIMRoomMigrateStatus;
        return i == 3 || i == 4;
    }

    /* renamed from: x2 */
    public boolean mo69796x2(String str) {
        return !Util.isNullOrNil(this.field_roomowner) && this.field_roomowner.equals(str);
    }

    /* renamed from: y2 */
    public boolean mo69797y2() {
        Class cls = C39479c.class;
        if (Util.isNullOrNil(this.field_roomowner)) {
            return false;
        }
        String s = C75592q0.m90789s();
        if (((C39479c) C86709a0.m107533q(cls)) == null) {
            Log.m105920e("MicroMsg.ChatRoomMember", "service is null");
            return false;
        }
        return (((C39479c) C86709a0.m107533q(cls)).mo62087yu(this.field_chatroomname) && mo69793u2(s)) || this.field_roomowner.equals(s);
    }

    /* renamed from: z2 */
    public boolean mo69798z2() {
        if (mo69794v2(this.f121084u1)) {
            mo69784l2();
        }
        C39607a aVar = this.f121084u1;
        return aVar.f106341j < aVar.f106342n;
    }
}
