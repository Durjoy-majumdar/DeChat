package dr1;

import androidx.appcompat.app.AppCompatActivity;
import bt1.C0378f;
import com.tencent.p014mm.C0966R;
import nj3.C76874e0;

/* renamed from: dr1.c */
public final class C7475c extends C0378f.C0379a {

    /* renamed from: e */
    public final /* synthetic */ C7483i f25693e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C7475c(C7483i iVar, AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        this.f25693e = iVar;
    }

    public void onCreateMMMenu(C76874e0 e0Var) {
        if (e0Var != null) {
            C7483i iVar = this.f25693e;
            if (e0Var.mo107176v()) {
                int color = this.f980d.getResources().getColor(C0966R.color.f3133gi);
                e0Var.mo107140d(1, color, this.f980d.getResources().getString(C0966R.string.f360757ej3));
                if (iVar.mo8621d(iVar.f25703d)) {
                    e0Var.mo107140d(3, color, this.f980d.getResources().getString(C0966R.string.nay));
                }
                e0Var.mo107140d(2, color, this.f980d.getResources().getString(C0966R.string.f360491cu3));
            }
        }
    }
}
