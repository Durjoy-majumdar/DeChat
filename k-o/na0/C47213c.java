package na0;

import android.content.Context;
import com.tencent.p014mm.C0966R;
import fy3.C32226l;
import gy3.C87413o;
import k21.C60960c;
import nj3.C76879j;
import rx3.C13598b0;

/* renamed from: na0.c */
public final class C47213c extends C87413o implements C32226l<Boolean, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ Context f126770d;

    /* renamed from: e */
    public final /* synthetic */ boolean f126771e;

    /* renamed from: f */
    public final /* synthetic */ String f126772f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C47213c(Context context, boolean z, String str) {
        super(1);
        this.f126770d = context;
        this.f126771e = z;
        this.f126772f = str;
    }

    public Object invoke(Object obj) {
        String str;
        boolean z = true;
        if (((Boolean) obj).booleanValue()) {
            C60960c.f173618a.mo85926j("SnsTemplate", "miaojiansheet", 1);
        } else {
            C60960c.f173618a.mo85926j("SnsTemplate", "miaojiansheet", 2);
        }
        Context context = this.f126770d;
        boolean z2 = this.f126771e;
        String str2 = this.f126772f;
        if (!(str2 == null || str2.length() == 0)) {
            z = false;
        }
        if (z) {
            str = "";
        } else {
            str = "&assetUris=" + this.f126772f + "&launchType=7&showTemplatesList=1";
        }
        C76879j.m92739j(context, z2 ? C0966R.string.f7988yg : 0, z2 ? C0966R.string.a3h : C0966R.string.f360898m20, z2 ? C0966R.string.a18 : C0966R.string.m1z, C0966R.string.f7926wf, new C47215f(z2, str, context), C47216g.f126777d);
        return C13598b0.f38549a;
    }
}
