package gg0;

import android.content.Context;
import android.content.DialogInterface;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.modelsimple.C1307j0;
import com.tencent.p014mm.plugin.account.bind.p021ui.C114893g;
import f40.C86709a0;
import nj3.C76879j;

/* renamed from: gg0.f0 */
public class C116954f0 implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C114893g f350516d;

    /* renamed from: gg0.f0$a */
    public class C116955a implements DialogInterface.OnCancelListener {

        /* renamed from: d */
        public final /* synthetic */ C1307j0 f350517d;

        public C116955a(C1307j0 j0Var) {
            this.f350517d = j0Var;
        }

        public void onCancel(DialogInterface dialogInterface) {
            C116954f0.this.f350516d.mo174580b();
            C86709a0.m107524d().mo123458d(this.f350517d);
        }
    }

    public C116954f0(C114893g gVar) {
        this.f350516d = gVar;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        C114893g gVar = this.f350516d;
        C1307j0 j0Var = new C1307j0(5, gVar.f344395h, gVar.f344394g.getSecImgSid(), this.f350516d.f344394g.getSecImgCode(), this.f350516d.f344394g.getSecImgEncryptKey(), true, 1);
        C114893g gVar2 = this.f350516d;
        gVar2.getClass();
        C86709a0.m107524d().mo123455a(384, gVar2);
        C86709a0.m107524d().mo123460f(j0Var);
        C114893g gVar3 = this.f350516d;
        Context context = gVar3.f344391d;
        gVar3.f344393f = C76879j.m92723Q(context, context.getString(C0966R.string.a3h), this.f350516d.f344391d.getString(C0966R.string.gda), true, true, new C116955a(j0Var));
    }
}
