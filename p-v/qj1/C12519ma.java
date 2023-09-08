package qj1;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import com.tencent.p014mm.C0966R;
import d60.C58124b;
import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import nj3.C76912y0;
import rx3.C13598b0;

/* renamed from: qj1.ma */
public final class C12519ma extends C87413o implements C32227p<Boolean, Boolean, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C12389fa f35985d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C12519ma(C12389fa faVar) {
        super(2);
        this.f35985d = faVar;
    }

    public Object invoke(Object obj, Object obj2) {
        Resources resources;
        int i;
        int i2;
        Resources resources2;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        boolean booleanValue2 = ((Boolean) obj2).booleanValue();
        if (booleanValue) {
            C58124b.C7172a.m7372a(this.f35985d.f35690p, C58124b.C58125b.FINDER_LIVE_MEMBERS_LOADING, (Bundle) null, 2, (Object) null);
            C12389fa faVar = this.f35985d;
            if (booleanValue2) {
                resources2 = faVar.f35665B;
                i2 = C0966R.string.e44;
            } else {
                resources2 = faVar.f35665B;
                i2 = C0966R.string.f360673e42;
            }
            String string = resources2.getString(i2);
            C87412m.m108593f(string, "if (enable) resources.ge…action_comment_forbidden)");
            C76912y0.makeText(this.f35985d.mo14484z0().getContext(), (CharSequence) string, 0).show();
        } else {
            String string2 = this.f35985d.f35665B.getString(C0966R.string.e3q);
            C87412m.m108593f(string2, "resources.getString(R.st…ofile_action_fail_prefix)");
            if (booleanValue2) {
                resources = this.f35985d.f35665B;
                i = C0966R.string.e3z;
            } else {
                resources = this.f35985d.f35665B;
                i = C0966R.string.f360674e43;
            }
            String string3 = resources.getString(i);
            C87412m.m108593f(string3, "if (enable) resources.ge…e_action_recover_comment)");
            Context context = this.f35985d.mo14484z0().getContext();
            C76912y0.makeText(context, (CharSequence) string2 + string3, 0).show();
        }
        return C13598b0.f38549a;
    }
}
