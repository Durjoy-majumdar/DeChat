package com.tencent.p014mm.p136ui.chatting.component.biz;

import android.database.Cursor;
import com.tencent.p014mm.autogen.mmdata.rpt.ServiceAcctMuteOpStruct;
import com.tencent.p014mm.p136ui.chatting.component.biz.C44810i;
import com.tencent.p014mm.storage.C44660i2;
import com.tencent.p014mm.storage.C72976h2;
import com.tencent.p014mm.storage.C72996z1;
import eb0.C31543z5;
import eb0.C45628s0;
import eb0.C75592q0;
import f40.C86709a0;
import f62.C75700k0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import rb0.C47976j;
import rb0.C48009v0;
import zt3.C119157j;

/* renamed from: com.tencent.mm.ui.chatting.component.biz.g */
public class C73441g implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C44810i.C44811a f215816d;

    /* renamed from: com.tencent.mm.ui.chatting.component.biz.g$a */
    public class C73442a implements Runnable {
        public C73442a() {
        }

        public void run() {
            C73441g.this.f215816d.f121611a.dismiss();
            C44810i.this.f121610f.mo102396b();
        }
    }

    public C73441g(C44810i.C44811a aVar) {
        this.f215816d = aVar;
    }

    public void run() {
        Class cls = C75700k0.class;
        C75592q0.m90770R(true);
        C47976j Fx0 = C48009v0.Fx0();
        Fx0.getClass();
        ArrayList arrayList = new ArrayList();
        Cursor rawQuery = Fx0.rawQuery(String.format(Locale.US, "select %s from %s where %s = %d", new Object[]{"username", "bizinfo", "type", 1}), new String[0]);
        if (rawQuery != null) {
            if (rawQuery.moveToFirst()) {
                do {
                    arrayList.add(rawQuery.getString(0));
                } while (rawQuery.moveToNext());
            }
            rawQuery.close();
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (!C45628s0.m50770e(str)) {
                C44810i.this.f121609e.add(str);
            }
        }
        long j = 0;
        for (String str2 : C44810i.this.f121609e) {
            C72996z1 z1Var = ((C75700k0) C86709a0.m107533q(cls)).mo96097Ni().get(str2);
            C45628s0.m50779i0(z1Var, false);
            C72976h2 j2 = ((C44660i2) ((C75700k0) C86709a0.m107533q(cls)).mo96094Ku()).mo69771j(str2);
            if (j2 != null) {
                ((C44660i2) ((C75700k0) C86709a0.m107533q(cls)).mo96094Ku()).mo69773k0(j2, str2);
                if (!C45628s0.m50746K(z1Var)) {
                    j += (long) j2.mo108786G2();
                }
            }
        }
        ((C119157j) C119157j.f356862d).mo183895z(new C73442a());
        ServiceAcctMuteOpStruct serviceAcctMuteOpStruct = new ServiceAcctMuteOpStruct();
        serviceAcctMuteOpStruct.f194379d = 2;
        serviceAcctMuteOpStruct.f194380e = C31543z5.m39451a();
        serviceAcctMuteOpStruct.f194381f = j;
        serviceAcctMuteOpStruct.mo86054n();
    }
}
