package gl3;

import android.content.Context;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.storage.C72996z1;
import d62.C75339i;
import di3.C86312j;
import f40.C86709a0;
import f62.C75700k0;
import gl3.C75922b;
import kg3.C76577a;
import p629ny.C76979h;

/* renamed from: gl3.c */
public class C75925c extends C75946n {

    /* renamed from: F */
    public boolean f222627F;

    /* renamed from: G */
    public int f222628G = 0;

    /* renamed from: H */
    public String f222629H;

    public C75925c(int i) {
        super(i);
    }

    /* renamed from: a */
    public void mo67027a(Context context, C75922b.C75923a aVar) {
        String str;
        int i = this.f222628G;
        if (i == 0 || (str = this.f222629H) == null) {
            C72996z1 z1Var = this.f222600A;
            if (!this.f222627F) {
                C86709a0.m107528h();
                z1Var = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().get(this.f222602y);
                mo106181j(z1Var);
                this.f222627F = true;
            }
            if (z1Var == null) {
                this.f222601x = "";
                return;
            }
            this.f222601x = ((C76979h) C86312j.m106911c(C76979h.class)).op0(context, ((C75339i) C86312j.m106911c(C75339i.class)).mo62520pi(z1Var), C76577a.m92157h(context, C0966R.dimen.f3927j7));
            this.f222602y = z1Var.getUsername();
            return;
        }
        this.f222703C = i;
        this.f222702B = str;
    }
}
