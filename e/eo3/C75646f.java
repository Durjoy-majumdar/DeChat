package eo3;

import android.database.Cursor;
import com.tencent.p014mm.storage.C72996z1;
import eb0.C45623p4;
import eb0.C97625j3;
import java.util.ArrayList;

/* renamed from: eo3.f */
public class C75646f implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ boolean f222234d;

    /* renamed from: e */
    public final /* synthetic */ C75635b f222235e;

    public C75646f(C75635b bVar, boolean z) {
        this.f222235e = bVar;
        this.f222234d = z;
    }

    public void run() {
        Cursor cursor;
        Cursor cursor2;
        C75635b bVar = this.f222235e;
        String[] strArr = bVar.f222204o;
        if (strArr != null && strArr.length != 0) {
            ArrayList arrayList = new ArrayList();
            for (String str : this.f222235e.f222204o) {
                if (this.f222235e.mo105987w(str)) {
                    arrayList.add(str);
                }
            }
            if (arrayList.size() > 0) {
                C75635b bVar2 = this.f222235e;
                C75635b bVar3 = this.f222235e;
                bVar2.mo7998r(C97625j3.m125812b().mo105907v().mo69679Y3((String[]) arrayList.toArray(new String[arrayList.size()]), bVar3.f222206q, (String) null, bVar3.f222211v));
                return;
            }
            this.f222235e.mo7998r(C97625j3.m125812b().mo105907v().mo69714m4());
        } else if (bVar.f222205p == null) {
            bVar.mo7998r(C97625j3.m125812b().mo105907v().mo69714m4());
        } else if (!bVar.f222206q.equals("@all.chatroom.contact")) {
            C45623p4 D = C97625j3.m125812b().mo105878D();
            C75635b bVar4 = this.f222235e;
            this.f222235e.mo7998r(D.mo71145b(bVar4.f222205p, bVar4.f222206q, (String) null, bVar4.f222211v, false, false, true));
        } else {
            if (this.f222234d) {
                C45623p4 D2 = C97625j3.m125812b().mo105878D();
                C75635b bVar5 = this.f222235e;
                cursor = D2.mo71145b(bVar5.f222205p, "@micromsg.with.all.biz.qq.com.openim", (String) null, bVar5.f222211v, false, false, false);
            } else {
                C45623p4 D3 = C97625j3.m125812b().mo105878D();
                C75635b bVar6 = this.f222235e;
                cursor = D3.mo71145b(bVar6.f222205p, "@micromsg.with.all.biz.qq.com", (String) null, bVar6.f222211v, false, false, false);
            }
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            while (cursor.moveToNext()) {
                String string = cursor.getString(cursor.getColumnIndex("username"));
                if (!C72996z1.m85820U5(string)) {
                    arrayList2.add(string);
                } else {
                    arrayList3.add(string);
                }
            }
            if (!cursor.isClosed()) {
                cursor.close();
            }
            if (arrayList2.size() == 0 && arrayList3.size() == 0) {
                cursor2 = C97625j3.m125812b().mo105907v().mo69714m4();
            } else {
                C45623p4 D4 = C97625j3.m125812b().mo105878D();
                C75635b bVar7 = this.f222235e;
                cursor2 = D4.mo71144a(bVar7.f222205p, arrayList2, (ArrayList<String>) null, arrayList3, bVar7.f222211v);
            }
            this.f222235e.mo7998r(cursor2);
        }
    }
}
