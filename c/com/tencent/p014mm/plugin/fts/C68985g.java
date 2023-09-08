package com.tencent.p014mm.plugin.fts;

import android.database.Cursor;
import com.tencent.p014mm.storage.C72996z1;
import f40.C86709a0;
import f62.C75700k0;
import java.util.ArrayList;
import java.util.List;
import kv1.C61172m;

/* renamed from: com.tencent.mm.plugin.fts.g */
public class C68985g implements C61172m {
    /* renamed from: a */
    public C72996z1 mo94940a(String str) {
        C72996z1 W2 = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().mo69674W2(str);
        if (W2 == null) {
            W2 = new C72996z1();
            Cursor d = mo94943d("SELECT ROWID, username, alias, conRemark, nickname, verifyFlag, type, lvbuff, contactLabelIds FROM rcontact WHERE username = ? AND deleteFlag=0;", new String[]{str}, 2);
            if (d.moveToNext()) {
                W2.f108320R1 = d.getLong(0);
                W2.setUsername(d.getString(1));
                W2.mo62857I2(d.getString(2));
                W2.mo62860K2(d.getString(3));
                W2.mo62878U2(d.getString(4));
                W2.mo62894d3(d.getInt(5));
                W2.mo62919n4(d.getInt(6));
                W2.mo62876T2(d.getBlob(7));
                W2.mo62867O2(d.getString(8));
                W2.mo62869P2(0);
            }
            d.close();
        }
        return W2;
    }

    /* renamed from: b */
    public long mo94941b(String str) {
        Cursor d = mo94943d("SELECT conversationTime FROM rconversation WHERE username=?;", new String[]{str}, 2);
        long j = (d == null || !d.moveToFirst()) ? 0 : d.getLong(0);
        if (d != null) {
            d.close();
        }
        return j;
    }

    /* renamed from: c */
    public List<String> mo94942c(String str) {
        ArrayList arrayList = new ArrayList();
        if (str.endsWith("\u0000")) {
            str = str.substring(0, str.length() - 1);
        }
        if (str.length() == 0) {
            return arrayList;
        }
        Cursor d = mo94943d(String.format("SELECT labelName FROM ContactLabel WHERE labelID IN (%s);", new Object[]{str}), (String[]) null, 2);
        while (d.moveToNext()) {
            arrayList.add(d.getString(0));
        }
        d.close();
        return arrayList;
    }

    /* renamed from: d */
    public Cursor mo94943d(String str, String[] strArr, int i) {
        C86709a0.m107528h();
        return C86709a0.m107535s().f251811i.rawQuery(str, strArr, i);
    }
}
