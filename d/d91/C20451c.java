package d91;

import android.app.Activity;
import com.tencent.p014mm.sdk.platformtools.Log;
import h81.C20928j;
import i91.C21064e;
import ia1.C98625h;
import s91.C22316b;
import te3.C118467t1;
import te3.fh4;
import x91.C118865a;
import x91.C23072e;
import z91.C23462b;

/* renamed from: d91.c */
public class C20451c implements C21064e {
    /* renamed from: a */
    public void mo31992a(C118467t1 t1Var, C118467t1 t1Var2) {
        fh4 fh4;
        if (t1Var != null) {
            Object[] objArr = new Object[2];
            objArr[0] = t1Var.f354392d.f354001d;
            objArr[1] = t1Var2 == null ? "NULL" : t1Var2.f354392d.f354001d;
            Log.m105925i("HABBYGE-MALI.HellhoundService", "Stack, onPopWithSlience: %s, %s", objArr);
            C118865a aVar = C118865a.f355584a;
            fh4 fh42 = t1Var.f354392d;
            aVar.mo183575c(fh42.f354001d, fh42.f354003f, C23072e.MATCH_PAGE_SLIENCE_POP_STACK);
            C23462b.m28021f().mo36923h((Activity) null, t1Var, 2, t1Var2);
            C98625h.m128225a().mo138056b(3, t1Var.f354392d.f354001d, (Activity) null);
            C22316b.f63277a.mo35470c(t1Var.f354392d.f354001d, (Activity) null);
            C20928j.C20932d dVar = C20453e.f57483d;
            if (dVar != null && (fh4 = t1Var.f354392d) != null) {
                dVar.mo32661w(fh4.f354002e);
            }
        }
    }

    @Deprecated
    /* renamed from: b */
    public void mo31993b(Activity activity, C118467t1 t1Var, C118467t1 t1Var2) {
        if (t1Var != null) {
            Object[] objArr = new Object[2];
            objArr[0] = t1Var.f354392d.f354001d;
            objArr[1] = t1Var2 == null ? "NULL" : t1Var2.f354392d.f354001d;
            Log.m105925i("HABBYGE-MALI.HellhoundService", "Stack, onPush: %s, %s", objArr);
            C23462b.m28021f().mo36923h(activity, t1Var, 0, t1Var2);
            C20928j.C20932d dVar = C20453e.f57483d;
            if (dVar != null && t1Var.f354392d != null) {
                dVar.mo32644b((String) null);
            }
        }
    }

    /* renamed from: c */
    public void mo31994c(C118467t1 t1Var, C118467t1 t1Var2) {
        if (t1Var != null) {
            Object[] objArr = new Object[3];
            fh4 fh4 = t1Var.f354392d;
            objArr[0] = fh4.f354001d;
            objArr[1] = Long.valueOf(fh4.f354003f);
            objArr[2] = t1Var2 == null ? "NULL" : t1Var2.f354392d.f354001d;
            Log.m105925i("HABBYGE-MALI.HellhoundService", "onPushStackAsync: %s, %s, %s", objArr);
            C23462b.m28021f().mo36923h((Activity) null, t1Var, 0, t1Var2);
            C20928j.C20932d dVar = C20453e.f57483d;
            if (dVar != null && t1Var.f354392d != null) {
                dVar.mo32644b((String) null);
            }
        }
    }
}
