package com.tencent.p014mm.p136ui.contact;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C44660i2;
import com.tencent.p014mm.storage.C44661m1;
import com.tencent.p014mm.storage.C72996z1;
import com.tencent.wcdb.Cursor;
import eb0.C75592q0;
import f40.C86709a0;
import f62.C75700k0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* renamed from: com.tencent.mm.ui.contact.y */
public class C74592y {

    /* renamed from: a */
    public List<String> f219250a = null;

    /* renamed from: b */
    public List<C44661m1> f219251b = null;

    /* renamed from: c */
    public List<C44661m1> f219252c = new LinkedList();

    /* renamed from: d */
    public List<C44661m1> f219253d = new LinkedList();

    /* renamed from: e */
    public Map<String, Integer> f219254e;

    /* renamed from: com.tencent.mm.ui.contact.y$a */
    public class C74593a implements Comparator<Map.Entry<String, Integer>> {
        public C74593a() {
        }

        public int compare(Object obj, Object obj2) {
            int i;
            Map.Entry entry = (Map.Entry) obj;
            Map.Entry entry2 = (Map.Entry) obj2;
            if (entry.getValue() != entry2.getValue()) {
                return ((Integer) entry2.getValue()).intValue() - ((Integer) entry.getValue()).intValue();
            }
            int i2 = Integer.MAX_VALUE;
            if (((HashMap) C74592y.this.f219254e).get(entry.getKey()) != null) {
                i = ((Integer) ((HashMap) C74592y.this.f219254e).get(entry.getKey())).intValue();
            } else {
                i = Integer.MAX_VALUE;
            }
            if (((HashMap) C74592y.this.f219254e).get(entry2.getKey()) != null) {
                i2 = ((Integer) ((HashMap) C74592y.this.f219254e).get(entry2.getKey())).intValue();
            }
            return i - i2;
        }
    }

    /* renamed from: com.tencent.mm.ui.contact.y$b */
    public class C74594b implements Comparator<String> {
        public C74594b() {
        }

        public int compare(Object obj, Object obj2) {
            String str = (String) obj;
            String str2 = (String) obj2;
            int i = Integer.MAX_VALUE;
            int intValue = ((HashMap) C74592y.this.f219254e).get(str) != null ? ((Integer) ((HashMap) C74592y.this.f219254e).get(str)).intValue() : Integer.MAX_VALUE;
            if (((HashMap) C74592y.this.f219254e).get(str2) != null) {
                i = ((Integer) ((HashMap) C74592y.this.f219254e).get(str2)).intValue();
            }
            return intValue - i;
        }
    }

    /* renamed from: com.tencent.mm.ui.contact.y$c */
    public class C74595c implements Comparator<String> {
        public C74595c() {
        }

        public int compare(Object obj, Object obj2) {
            String str = (String) obj;
            String str2 = (String) obj2;
            int i = Integer.MAX_VALUE;
            int intValue = ((HashMap) C74592y.this.f219254e).get(str) != null ? ((Integer) ((HashMap) C74592y.this.f219254e).get(str)).intValue() : Integer.MAX_VALUE;
            if (((HashMap) C74592y.this.f219254e).get(str2) != null) {
                i = ((Integer) ((HashMap) C74592y.this.f219254e).get(str2)).intValue();
            }
            return intValue - i;
        }
    }

    /* renamed from: a */
    public void mo103646a(List<String> list) {
        if (this.f219250a == null) {
            if (list.contains(C75592q0.m90789s())) {
                list.remove(C75592q0.m90789s());
            }
            C57826d2.m66826a(list);
            LinkedList linkedList = new LinkedList();
            C57826d2.f165450b = linkedList;
            linkedList.addAll(list);
            Log.m105919d("MicroMsg.NewGroupRecommendDetailReporter", "preCommend: %s", C57826d2.f165450b);
            List<C44661m1> b = mo103647b(list);
            this.f219251b = b;
            if (((LinkedList) b).size() > 0) {
                this.f219250a = mo103648c(b, list, 10);
                this.f219252c = mo103651f(this.f219251b, list);
            }
            List<String> list2 = this.f219250a;
            if (list2 != null && list2.size() < 10 && list.size() > 1) {
                List<C44661m1> b2 = mo103647b(list.subList(list.size() - 1, list.size()));
                if (((LinkedList) b2).size() > 0) {
                    LinkedList linkedList2 = new LinkedList();
                    linkedList2.addAll(this.f219250a);
                    linkedList2.addAll(list);
                    this.f219250a = mo103648c(b2, linkedList2, 10 - this.f219250a.size());
                }
            }
            List<String> list3 = this.f219250a;
            if (list3 != null) {
                int i = 6;
                if (list3.size() <= 6) {
                    i = this.f219250a.size();
                }
                List<String> subList = list3.subList(0, i);
                C57826d2.f165451c = subList;
                Log.m105919d("MicroMsg.NewGroupRecommendDetailReporter", "recommend: %s", subList);
            }
        } else if (this.f219251b != null) {
            if (list.contains(C75592q0.m90789s())) {
                list.remove(C75592q0.m90789s());
            }
            this.f219252c = mo103651f(this.f219251b, list);
        }
    }

    /* renamed from: b */
    public final List<C44661m1> mo103647b(List<String> list) {
        LinkedList linkedList = new LinkedList();
        if (list.size() == 0) {
            return linkedList;
        }
        long nowMilliSecond = Util.nowMilliSecond();
        String str = "select chatroomname,memberlist from chatroom where memberCount < 50 ";
        for (String escapeSqlValue : list) {
            str = str + " and memberlist like \"%" + Util.escapeSqlValue(escapeSqlValue) + "%\" ";
        }
        Cursor rawQuery = C86709a0.m107535s().f251811i.mo125615f().rawQuery(str, (Object[]) null);
        while (rawQuery.moveToNext()) {
            C44661m1 m1Var = new C44661m1();
            m1Var.convertFrom(rawQuery);
            linkedList.add(m1Var);
        }
        rawQuery.close();
        Log.m105925i("MicroMsg.ContactRecommendHelper", "getChatroomByMembername cnt:%d time:%d", Integer.valueOf(linkedList.size()), Long.valueOf(Util.milliSecondsToNow(nowMilliSecond)));
        return linkedList;
    }

    /* renamed from: c */
    public final List<String> mo103648c(List<C44661m1> list, List<String> list2, int i) {
        HashMap hashMap = new HashMap();
        String s = C75592q0.m90789s();
        for (C44661m1 next : list) {
            if (((HashMap) this.f219254e).get(next.field_chatroomname) != null) {
                boolean x2 = next.mo69796x2(s);
                for (String next2 : next.mo69790r2()) {
                    int i2 = 1;
                    if (hashMap.get(next2) != null) {
                        int intValue = ((Integer) hashMap.get(next2)).intValue();
                        if (x2) {
                            i2 = 2;
                        }
                        i2 += intValue;
                    }
                    hashMap.put(next2, Integer.valueOf(i2));
                }
            }
        }
        for (String remove : list2) {
            hashMap.remove(remove);
        }
        hashMap.remove(s);
        ArrayList arrayList = new ArrayList(hashMap.entrySet());
        Collections.sort(arrayList, new C74593a());
        LinkedList linkedList = new LinkedList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            linkedList.add((String) ((Map.Entry) it.next()).getKey());
        }
        if (linkedList.size() <= i) {
            i = linkedList.size();
        }
        return linkedList.subList(0, i);
    }

    /* renamed from: d */
    public android.database.Cursor mo103649d() {
        Class cls = C75700k0.class;
        C86709a0.m107528h();
        android.database.Cursor m4 = ((C75700k0) C86709a0.m107533q(cls)).mo96097Ni().mo69714m4();
        List<String> list = this.f219250a;
        if (list == null || list.size() <= 0) {
            return m4;
        }
        C86709a0.m107528h();
        return ((C75700k0) C86709a0.m107533q(cls)).mo96097Ni().mo69684a4(this.f219250a, 6, true);
    }

    /* renamed from: e */
    public void mo103650e(List<String> list) {
        if (this.f219254e == null) {
            this.f219254e = new HashMap();
            android.database.Cursor H = ((C44660i2) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96094Ku()).mo69737H(list, 0, 200);
            int columnIndex = H.getColumnIndex("username");
            int i = 1;
            while (H.moveToNext()) {
                this.f219254e.put(H.getString(columnIndex), Integer.valueOf(i));
                i++;
            }
            H.close();
        }
    }

    /* renamed from: f */
    public final List<C44661m1> mo103651f(List<C44661m1> list, List<String> list2) {
        LinkedList linkedList = new LinkedList();
        for (C44661m1 next : list) {
            List<String> r2 = next.mo69790r2();
            boolean z = true;
            if (r2.size() == list2.size() + 1) {
                Iterator<String> it = r2.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    String next2 = it.next();
                    if (!list2.contains(next2) && !C75592q0.m90764L(next2)) {
                        z = false;
                        break;
                    }
                }
                if (z) {
                    linkedList.add(next);
                }
            }
        }
        return linkedList;
    }

    /* renamed from: g */
    public final List<String> mo103652g(List<C44661m1> list) {
        if (list == null || list.size() == 0) {
            return new LinkedList();
        }
        LinkedList linkedList = new LinkedList();
        LinkedList linkedList2 = new LinkedList();
        LinkedList linkedList3 = new LinkedList();
        for (C44661m1 m1Var : list) {
            linkedList3.add(m1Var.field_chatroomname);
        }
        C86709a0.m107528h();
        android.database.Cursor j4 = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().mo69708j4(linkedList3, false);
        LinkedList<C72996z1> linkedList4 = new LinkedList<>();
        while (j4.moveToNext()) {
            C72996z1 z1Var = new C72996z1();
            z1Var.convertFrom(j4);
            linkedList4.add(z1Var);
        }
        j4.close();
        for (C72996z1 z1Var2 : linkedList4) {
            if (Util.isNullOrNil(z1Var2.getNickname())) {
                linkedList2.add(z1Var2.getUsername());
            } else {
                linkedList.add(z1Var2.getUsername());
            }
        }
        Collections.sort(linkedList, new C74594b());
        Collections.sort(linkedList2, new C74595c());
        if (linkedList.size() == 0 && linkedList2.size() > 0) {
            return linkedList2.subList(0, 1);
        }
        if (linkedList2.size() != 0 || linkedList.size() <= 0) {
            LinkedList linkedList5 = new LinkedList();
            if (linkedList.size() > 0 && linkedList2.size() > 0) {
                int i = 0;
                while (i < linkedList.size() && i < 2) {
                    linkedList5.add((String) linkedList.get(i));
                    i++;
                }
                linkedList5.add((String) linkedList2.get(0));
            }
            return linkedList5;
        }
        int i2 = 3;
        if (linkedList.size() <= 3) {
            i2 = linkedList.size();
        }
        return linkedList.subList(0, i2);
    }
}
