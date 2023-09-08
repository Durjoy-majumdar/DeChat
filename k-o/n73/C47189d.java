package n73;

import android.database.Cursor;
import com.tencent.p014mm.p136ui.contact.C74560s1;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C44660i2;
import com.tencent.p014mm.storage.C72996z1;
import d62.C75339i;
import di3.C86312j;
import eb0.C45628s0;
import eb0.C97625j3;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import l73.C46836a;
import te3.i05;
import te3.l15;
import te3.m15;
import te3.o05;
import te3.p05;

/* renamed from: n73.d */
public class C47189d extends C47188b {
    /* renamed from: a */
    public List<Integer> mo11243a() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(11008);
        arrayList.add(11009);
        return arrayList;
    }

    /* renamed from: b */
    public byte[] mo11244b(int i, byte[] bArr) {
        Class cls = C75339i.class;
        int i2 = 5;
        if (i == 11008) {
            C46836a.m52128a(6);
            l15 l15 = new l15();
            try {
                l15.parseFrom(bArr);
                LinkedList linkedList = new LinkedList();
                linkedList.addAll(C74560s1.m89273b());
                linkedList.addAll(C45628s0.m50776h());
                Cursor H = ((C44660i2) C97625j3.m125812b().mo105908w()).mo69737H(linkedList, l15.f137130d, 50);
                if (l15.f137130d != 0) {
                    i2 = 20;
                }
                m15 m15 = new m15();
                m15.f137756e = l15.f137130d;
                while (true) {
                    if (H == null || !H.moveToNext()) {
                        break;
                    }
                    C72996z1 z1Var = C97625j3.m125812b().mo105907v().get(H.getString(H.getColumnIndex("username")));
                    m15.f137756e++;
                    if (!z1Var.mo62916m3() && !z1Var.mo62920o3()) {
                        i05 i05 = new i05();
                        i05.f135016e = ((C75339i) C86312j.m106911c(cls)).mo62520pi(z1Var);
                        i05.f135015d = z1Var.getUsername();
                        m15.f137755d.add(i05);
                        if (m15.f137755d.size() >= i2) {
                            m15.f137757f = H.moveToNext();
                            break;
                        }
                    }
                }
                Log.m105919d("MicroMsg.Wear.HttpContactServer", "request offset: %d | return offset: %d | return size: %d", Integer.valueOf(l15.f137130d), Integer.valueOf(m15.f137756e), Integer.valueOf(m15.f137755d.size()));
                if (H != null) {
                    H.close();
                }
                try {
                    return m15.toByteArray();
                } catch (IOException unused) {
                    return null;
                }
            } catch (IOException e) {
                Log.printErrStackTrace("MicroMsg.Wear.HttpContactServer", e, "", new Object[0]);
                return null;
            }
        } else {
            if (i == 11009) {
                C46836a.m52128a(7);
                o05 o05 = new o05();
                try {
                    o05.parseFrom(bArr);
                    p05 p05 = new p05();
                    Cursor C3 = C97625j3.m125812b().mo105907v().mo69650C3((List<String>) null, false);
                    int i3 = o05.f138891d;
                    while (true) {
                        if (C3 == null || !C3.moveToNext()) {
                            break;
                        } else if (i3 > 0) {
                            i3--;
                        } else {
                            C72996z1 z1Var2 = C97625j3.m125812b().mo105907v().get(C3.getString(0));
                            i05 i052 = new i05();
                            i052.f135016e = ((C75339i) C86312j.m106911c(cls)).mo62520pi(z1Var2);
                            i052.f135015d = z1Var2.getUsername();
                            p05.f139488d.add(i052);
                            if (p05.f139488d.size() >= 5) {
                                p05.f139490f = C3.moveToNext();
                                break;
                            }
                        }
                    }
                    if (C3 != null) {
                        C3.close();
                    }
                    p05.f139489e = o05.f138891d + p05.f139488d.size();
                    try {
                        return p05.toByteArray();
                    } catch (IOException e2) {
                        Log.printErrStackTrace("MicroMsg.Wear.HttpContactServer", e2, "", new Object[0]);
                        return null;
                    }
                } catch (IOException e3) {
                    Log.printErrStackTrace("MicroMsg.Wear.HttpContactServer", e3, "", new Object[0]);
                }
            }
            return null;
        }
    }

    /* renamed from: c */
    public boolean mo72262c(int i) {
        return i == 11008 || i == 11009;
    }

    /* renamed from: d */
    public boolean mo72263d(int i) {
        return i == 11008 || i == 11009;
    }
}
