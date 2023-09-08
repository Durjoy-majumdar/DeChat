package a22;

import b22.C28251b;
import cm0.C28613b;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72955b2;
import com.tencent.p014mm.storage.C72960e2;
import com.tencent.p014mm.storage.C72996z1;
import d22.C45259e;
import d22.C75319a;
import eb0.C75592q0;
import eb0.C97625j3;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import ob0.C11385n;
import ob0.C117747y;
import te3.ap4;

/* renamed from: a22.a */
public class C67001a implements C28251b {

    /* renamed from: a */
    public String f192475a;

    /* renamed from: b */
    public ArrayList<String> f192476b;

    /* renamed from: c */
    public ArrayList<String> f192477c;

    /* renamed from: d */
    public C11385n f192478d = new C67002a();

    /* renamed from: a22.a$a */
    public class C67002a implements C11385n {
        public C67002a() {
        }

        public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
            Log.m105920e("MicroMsg.Label.ContactLabelManagerImpl", "onSceneEnd");
            int type = yVar.getType();
            if (type != 635) {
                if (type == 638) {
                    if (i == 0 && i2 == 0) {
                        ArrayList<String> arrayList = C67001a.this.f192477c;
                        int size = (arrayList == null || arrayList.isEmpty()) ? 0 : C67001a.this.f192477c.size();
                        ArrayList<String> arrayList2 = C67001a.this.f192476b;
                        int size2 = (arrayList2 == null || arrayList2.isEmpty()) ? 0 : C67001a.this.f192476b.size() - size;
                        if (size > 0 || size2 > 0) {
                            Log.m105919d("MicroMsg.Label.ContactLabelManagerImpl", "cpan[saveContact]addLabelNum:%d,updateLabelNum:%d", Integer.valueOf(size), Integer.valueOf(size2));
                            C115669n.INSTANCE.mo160131h(11220, C75592q0.m90789s(), Integer.valueOf(size), Integer.valueOf(size2), 0, 0);
                        }
                    }
                    C67001a.this.mo90974l();
                }
            } else if (i == 0 && i2 == 0) {
                C67001a aVar = C67001a.this;
                aVar.mo90975m(aVar.f192475a, aVar.f192476b);
            } else {
                C67001a.this.mo90974l();
                Log.m105920e("MicroMsg.Label.ContactLabelManagerImpl", "add contact lable faild");
            }
        }
    }

    /* renamed from: a */
    public void mo90963a(List<String> list) {
        C97625j3.m125815e().mo123460f(new C75319a(list));
    }

    /* renamed from: b */
    public void mo90964b(List<String> list, List<String> list2) {
        HashMap hashMap = new HashMap();
        LinkedList linkedList = new LinkedList();
        if (list != null && list.size() > 0) {
            Iterator<String> it = list2.iterator();
            for (String next : list) {
                ArrayList<String> stringsToList = Util.stringsToList(it.next().split(","));
                if (stringsToList != null && stringsToList.size() > 0) {
                    for (String next2 : stringsToList) {
                        if (hashMap.containsKey(next2)) {
                            String str = (String) hashMap.get(next2);
                            String b = C0008d.m1b(str, next);
                            if (!b.equalsIgnoreCase(str)) {
                                hashMap.put(next2, b);
                            }
                        } else {
                            C72996z1 z1Var = C97625j3.m125812b().mo105907v().get(next2);
                            if (z1Var != null) {
                                String r2 = z1Var.mo73974r2();
                                String b2 = C0008d.m1b(r2, next);
                                if (!b2.equalsIgnoreCase(r2)) {
                                    hashMap.put(next2, b2);
                                }
                            }
                        }
                    }
                }
            }
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            ap4 ap4 = new ap4();
            ap4.f130717d = (String) entry.getKey();
            ap4.f130718e = (String) entry.getValue();
            linkedList.add(ap4);
        }
        if (linkedList.size() > 0) {
            C97625j3.m125815e().mo123460f(new C45259e(linkedList));
        }
    }

    /* renamed from: c */
    public void mo90965c() {
        C27740g.vx0().mo100945Lo();
    }

    /* renamed from: d */
    public List mo90966d() {
        return C27740g.vx0().mo100947TE();
    }

    /* renamed from: e */
    public List<String> mo90967e() {
        C72960e2 vx02 = C27740g.vx0();
        vx02.getClass();
        long nowMilliSecond = Util.nowMilliSecond();
        ArrayList<C72955b2> SE = vx02.mo100946SE();
        ArrayList arrayList = new ArrayList();
        if (SE != null) {
            vx02.mo100952jo();
            if (vx02.f212652f != null) {
                for (int i = 0; i < SE.size(); i++) {
                    ArrayList arrayList2 = vx02.f212652f.get(Integer.valueOf(SE.get(i).field_labelID));
                    if (arrayList2 != null && arrayList2.size() > 0) {
                        arrayList.add(SE.get(i).field_labelName);
                    }
                }
                Log.m105925i("MicroMsg.Label.ContactLabelStorage", "getAllLabelHasContact time:%s all:%s hascontact:%s stack:%s", Long.valueOf(Util.milliSecondsToNow(nowMilliSecond)), Integer.valueOf(SE.size()), Integer.valueOf(arrayList.size()), Util.getStack());
            }
        }
        return arrayList;
    }

    /* renamed from: f */
    public String mo90968f(String str) {
        return C27740g.vx0().mo100944LL(str);
    }

    /* renamed from: g */
    public List<String> mo90969g(String str) {
        if (Util.isNullOrNil(str)) {
            Log.m105928w("MicroMsg.Label.ContactLabelManagerImpl", "labels is null.");
            return null;
        }
        String[] split = str.split(",");
        if (split == null || split.length <= 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(Arrays.asList(split));
        return arrayList;
    }

    /* renamed from: h */
    public String mo90970h(String str) {
        return C27740g.vx0().mo100943DN(str);
    }

    /* renamed from: i */
    public String mo90971i(List<String> list) {
        if (list == null || list.isEmpty()) {
            Log.m105928w("MicroMsg.Label.ContactLabelManagerImpl", "labelList is empty");
            return null;
        }
        StringBuilder sb = new StringBuilder();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            sb.append(list.get(i));
            if (i < size - 1) {
                sb.append(",");
            }
        }
        return sb.toString();
    }

    /* JADX WARNING: Removed duplicated region for block: B:41:0x00d9  */
    /* JADX WARNING: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List mo90972j(java.lang.String r11) {
        /*
            r10 = this;
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r11)
            r1 = 0
            if (r0 == 0) goto L_0x0010
            java.lang.String r11 = "MicroMsg.Label.ContactLabelManagerImpl"
            java.lang.String r0 = "cpan[getLabelStrList]"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r11, r0)
            goto L_0x00dd
        L_0x0010:
            java.lang.String r0 = "\u0000"
            boolean r2 = r11.endsWith(r0)
            if (r2 == 0) goto L_0x001e
            java.lang.String r2 = ""
            java.lang.String r11 = r11.replace(r0, r2)
        L_0x001e:
            com.tencent.mm.storage.e2 r0 = a22.C27740g.vx0()
            java.lang.String r2 = ","
            java.lang.String[] r11 = r11.split(r2)
            r0.getClass()
            if (r11 == 0) goto L_0x00dd
            int r3 = r11.length
            if (r3 > 0) goto L_0x0032
            goto L_0x00dd
        L_0x0032:
            int r3 = r11.length
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "select * from ContactLabel where labelID"
            r4.append(r5)
            java.lang.String r5 = " in ( "
            r4.append(r5)
            r5 = 0
            r6 = 0
        L_0x0044:
            if (r6 >= r3) goto L_0x0069
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "'"
            r7.append(r8)
            r9 = r11[r6]
            r7.append(r9)
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            r4.append(r7)
            int r7 = r3 + -1
            if (r6 >= r7) goto L_0x0066
            r4.append(r2)
        L_0x0066:
            int r6 = r6 + 1
            goto L_0x0044
        L_0x0069:
            java.lang.String r11 = " )"
            r4.append(r11)
            java.lang.String r11 = r4.toString()
            r2 = 1
            java.lang.Object[] r3 = new java.lang.Object[r2]
            r3[r5] = r11
            java.lang.String r4 = "MicroMsg.Label.ContactLabelStorage"
            java.lang.String r6 = "cpan[getLabelStrList] SQL:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r4, r6, r3)
            com.tencent.mm.sdk.storage.ISQLiteDatabase r0 = r0.f212650d     // Catch:{ Exception -> 0x00c0, all -> 0x00be }
            r3 = 2
            android.database.Cursor r11 = r0.rawQuery(r11, r1, r3)     // Catch:{ Exception -> 0x00c0, all -> 0x00be }
            java.lang.String r0 = "labelName"
            int r0 = r11.getColumnIndex(r0)     // Catch:{ Exception -> 0x00bc }
            boolean r3 = r11.moveToFirst()     // Catch:{ Exception -> 0x00bc }
            if (r3 == 0) goto L_0x00d2
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ Exception -> 0x00bc }
            r3.<init>()     // Catch:{ Exception -> 0x00bc }
        L_0x0096:
            java.lang.String r6 = r11.getString(r0)     // Catch:{ Exception -> 0x00bc }
            r3.add(r6)     // Catch:{ Exception -> 0x00bc }
            boolean r6 = r11.moveToNext()     // Catch:{ Exception -> 0x00bc }
            if (r6 != 0) goto L_0x0096
            java.lang.String r0 = "cpan[getLabelStrList] resut size:%d"
            java.lang.Object[] r6 = new java.lang.Object[r2]     // Catch:{ Exception -> 0x00bc }
            int r7 = r3.size()     // Catch:{ Exception -> 0x00bc }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ Exception -> 0x00bc }
            r6[r5] = r7     // Catch:{ Exception -> 0x00bc }
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r4, r0, r6)     // Catch:{ Exception -> 0x00bc }
            r11.close()
            r1 = r3
            goto L_0x00dd
        L_0x00b9:
            r0 = move-exception
            r1 = r11
            goto L_0x00d6
        L_0x00bc:
            r0 = move-exception
            goto L_0x00c3
        L_0x00be:
            r11 = move-exception
            goto L_0x00d7
        L_0x00c0:
            r11 = move-exception
            r0 = r11
            r11 = r1
        L_0x00c3:
            java.lang.String r3 = "cpan[getLabelStrList] exception:%s"
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ all -> 0x00b9 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x00b9 }
            r2[r5] = r0     // Catch:{ all -> 0x00b9 }
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r4, r3, r2)     // Catch:{ all -> 0x00b9 }
            if (r11 == 0) goto L_0x00dd
        L_0x00d2:
            r11.close()
            goto L_0x00dd
        L_0x00d6:
            r11 = r0
        L_0x00d7:
            if (r1 == 0) goto L_0x00dc
            r1.close()
        L_0x00dc:
            throw r11
        L_0x00dd:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: a22.C67001a.mo90972j(java.lang.String):java.util.List");
    }

    /* renamed from: k */
    public List mo90973k(String str) {
        return C27740g.vx0().mo100951bO(str);
    }

    /* renamed from: l */
    public final void mo90974l() {
        this.f192475a = null;
        this.f192476b = null;
        this.f192477c = null;
        C97625j3.m125815e().mo123470p(C28613b.CTRL_INDEX, this.f192478d);
        C97625j3.m125815e().mo123470p(638, this.f192478d);
    }

    /* renamed from: m */
    public final void mo90975m(String str, ArrayList<String> arrayList) {
        Object[] objArr = new Object[2];
        objArr[0] = str;
        String str2 = "";
        objArr[1] = arrayList == null ? str2 : arrayList.toString();
        Log.m105919d("MicroMsg.Label.ContactLabelManagerImpl", "cpan[saveContact] username:%s,list:%s", objArr);
        if (Util.isNullOrNil(str) || arrayList == null || arrayList.size() <= 0) {
            Log.m105920e("MicroMsg.Label.ContactLabelManagerImpl", "add contact label faild.");
            return;
        }
        if (arrayList.size() > 0) {
            str2 = C0008d.m3d(C27740g.vx0().mo100955mL(arrayList));
        }
        LinkedList linkedList = new LinkedList();
        ap4 ap4 = new ap4();
        ap4.f130718e = str2;
        ap4.f130717d = str;
        linkedList.add(ap4);
        C97625j3.m125815e().mo123460f(new C45259e(linkedList));
    }
}
