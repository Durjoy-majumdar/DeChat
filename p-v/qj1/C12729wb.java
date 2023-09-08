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

/* renamed from: qj1.wb */
public final class C12729wb extends C87413o implements C32227p<Boolean, Boolean, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C12707vb f36467d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C12729wb(C12707vb vbVar) {
        super(2);
        this.f36467d = vbVar;
    }

    public Object invoke(Object obj, Object obj2) {
        Resources resources;
        int i;
        int i2;
        Resources resources2;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        boolean booleanValue2 = ((Boolean) obj2).booleanValue();
        if (booleanValue) {
            C12707vb vbVar = this.f36467d;
            if (vbVar.f36410G) {
                C58124b.C7172a.m7372a(vbVar.f36415p, C58124b.C58125b.FINDER_LIVE_MEMBERS_LOADING, (Bundle) null, 2, (Object) null);
            }
            C12707vb vbVar2 = this.f36467d;
            if (booleanValue2) {
                resources2 = vbVar2.f166287d.getContext().getResources();
                i2 = C0966R.string.e44;
            } else {
                resources2 = vbVar2.f166287d.getContext().getResources();
                i2 = C0966R.string.f360673e42;
            }
            String string = resources2.getString(i2);
            C87412m.m108593f(string, "if (enable) root.context…action_comment_forbidden)");
            C76912y0.makeText(this.f36467d.f166287d.getContext(), (CharSequence) string, 0).show();
        } else {
            String string2 = this.f36467d.f166287d.getContext().getResources().getString(C0966R.string.e3q);
            C87412m.m108593f(string2, "root.context.resources.g…ofile_action_fail_prefix)");
            if (booleanValue2) {
                resources = this.f36467d.f166287d.getContext().getResources();
                i = C0966R.string.e3z;
            } else {
                resources = this.f36467d.f166287d.getContext().getResources();
                i = C0966R.string.f360674e43;
            }
            String string3 = resources.getString(i);
            C87412m.m108593f(string3, "if (enable) root.context…e_action_recover_comment)");
            Context context = this.f36467d.f166287d.getContext();
            C76912y0.makeText(context, (CharSequence) string2 + string3, 0).show();
        }
        return C13598b0.f38549a;
    }
}
