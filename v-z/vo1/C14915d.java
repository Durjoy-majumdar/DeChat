package vo1;

import android.os.Message;
import cj1.C0581o5;
import cl1.C0702z0;
import cl1.C54991o;
import com.tencent.p014mm.sdk.platformtools.Log;
import cp1.C57957o;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import my3.C61594j;
import my3.C61595o;
import p823sg.C101614i;
import qj1.C12322e5;
import sx3.C110818d0;
import vo1.C65768a;

/* renamed from: vo1.d */
public final class C14915d implements C65768a.C65769a {

    /* renamed from: a */
    public final /* synthetic */ C65770a0 f40942a;

    public C14915d(C65770a0 a0Var) {
        this.f40942a = a0Var;
    }

    /* renamed from: a */
    public void mo13968a(int i) {
        C101614i<Long, C0581o5> iVar;
        int i2;
        List<T> m0;
        Class cls = C0702z0.class;
        C0702z0 z0Var = (C0702z0) this.f40942a.mo89804e(cls);
        boolean z = false;
        if (z0Var != null) {
            if (i < 0) {
                Log.m105920e("MMFinder.LiveMsgSlice", "dropMsgToOffset error lastOffset:" + i + '!');
            } else {
                List<C0581o5> list = z0Var.f1672f;
                C87412m.m108593f(list, "msgList");
                synchronized (list) {
                    Iterator<C0581o5> it = list.iterator();
                    i2 = 0;
                    while (true) {
                        if (!it.hasNext()) {
                            i2 = -1;
                            break;
                        }
                        if (it.next().getMsgTime() > i) {
                            break;
                        }
                        i2++;
                    }
                }
                int size = z0Var.f1672f.size();
                if (i2 >= 0 && i2 < size) {
                    List<C0581o5> list2 = z0Var.f1672f;
                    C87412m.m108593f(list2, "msgList");
                    C61594j i3 = C61595o.m72301i(i2, size);
                    synchronized (list2) {
                        m0 = C110818d0.m150941m0(list2, i3);
                    }
                    z0Var.f1672f.removeAll(m0);
                    Log.m105924i("MMFinder.LiveMsgSlice", "dropMsgToOffset oriMsgSize:" + size + ",removePos:" + i2 + ",newMsgSize:" + z0Var.f1672f.size());
                    z = true;
                } else {
                    Log.m105924i("MMFinder.LiveMsgSlice", "dropMsgToOffset oriMsgSize:" + size + ",removePos:" + i2 + ",msgSize:" + z0Var.f1672f.size());
                }
            }
        }
        if (z) {
            C57957o oVar = this.f40942a.f189191e;
            List<C0581o5> list3 = null;
            C12322e5 e5Var = oVar != null ? (C12322e5) oVar.mo78582g(C12322e5.class) : null;
            C0702z0 z0Var2 = (C0702z0) this.f40942a.mo89804e(cls);
            if (z0Var2 != null) {
                list3 = z0Var2.f1672f;
            }
            C65770a0 a0Var = this.f40942a;
            if (e5Var != null && list3 != null) {
                Message obtainMessage = e5Var.mo12025g1().obtainMessage();
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(list3);
                obtainMessage.obj = arrayList;
                int i4 = C12322e5.f35501p0;
                obtainMessage.what = i4;
                e5Var.mo12025g1().removeMessages(i4);
                e5Var.mo12025g1().sendMessage(obtainMessage);
                C54991o oVar2 = (C54991o) a0Var.mo89804e(C54991o.class);
                if (oVar2 != null && (iVar = oVar2.f154330j2) != null) {
                    iVar.clear();
                }
            }
        }
    }
}
