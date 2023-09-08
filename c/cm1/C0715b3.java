package cm1;

import a14.C0000n0;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.widget.TextView;
import com.tencent.p014mm.sdk.platformtools.Log;
import er1.C7832m3;
import fy3.C32227p;
import kotlin.ResultKt;
import rx3.C13598b0;
import te3.C49839if1;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.finder.model.SyncGetImageModel$setDrawerDesc$1", mo125469f = "SyncGetImageModel.kt", mo125470l = {}, mo125471m = "invokeSuspend")
/* renamed from: cm1.b3 */
public final class C0715b3 extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public final /* synthetic */ C0777t2 f1717d;

    /* renamed from: e */
    public final /* synthetic */ TextView f1718e;

    /* renamed from: f */
    public final /* synthetic */ Context f1719f;

    /* renamed from: g */
    public final /* synthetic */ String f1720g;

    /* renamed from: h */
    public final /* synthetic */ boolean f1721h;

    /* renamed from: i */
    public final /* synthetic */ int f1722i;

    /* renamed from: j */
    public final /* synthetic */ C49839if1 f1723j;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0715b3(C0777t2 t2Var, TextView textView, Context context, String str, boolean z, int i, C49839if1 if12, C15601d<? super C0715b3> dVar) {
        super(2, dVar);
        this.f1717d = t2Var;
        this.f1718e = textView;
        this.f1719f = context;
        this.f1720g = str;
        this.f1721h = z;
        this.f1722i = i;
        this.f1723j = if12;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C0715b3(this.f1717d, this.f1718e, this.f1719f, this.f1720g, this.f1721h, this.f1722i, this.f1723j, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C0715b3) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        String str;
        ResultKt.throwOnFailure(obj);
        C0777t2 t2Var = this.f1717d;
        Object j3 = t2Var.mo719j3(this.f1718e, this.f1719f, this.f1720g, this.f1721h, this.f1722i, 0, C0777t2.m720c3(t2Var, this.f1723j), false, 3, false);
        C0777t2 t2Var2 = this.f1717d;
        TextView textView = this.f1718e;
        String str2 = this.f1720g;
        C49839if1 if12 = this.f1723j;
        Context context = this.f1719f;
        boolean z = this.f1721h;
        t2Var2.getClass();
        if (j3 instanceof String) {
            C7832m3 m3Var = C7832m3.f26372a;
            boolean z2 = z;
            CharSequence c = C7832m3.m7968c(m3Var, 0, str2 + j3, context, z, t2Var2.f1821e, 0, false, 96, (Object) null);
            Log.m105924i("Finder.SyncGetImageModel", "setDefaultDrawerText String type match prefixText:" + str2 + ' ' + j3 + " recommendDesc:" + c + " hashCode:" + t2Var2.hashCode());
            if (!z2) {
                StringBuilder sb = new StringBuilder();
                sb.append(str2);
                if (if12 == null || (str = if12.f135264g) == null) {
                    str = "";
                }
                sb.append(str);
                c = sb.toString();
            }
            textView.setText(c);
        } else {
            String str3 = "Finder.SyncGetImageModel";
            String str4 = " hashCode:";
            if (j3 instanceof SpannableStringBuilder) {
                Log.m105924i(str3, "setDefaultDrawerText SpannableStringBuilder type match " + j3 + str4 + t2Var2.hashCode());
                textView.setText((CharSequence) j3);
            } else {
                Log.m105928w(str3, "setDefaultDrawerText desc type match nothing !" + j3 + str4 + t2Var2.hashCode());
            }
        }
        return C13598b0.f38549a;
    }
}
