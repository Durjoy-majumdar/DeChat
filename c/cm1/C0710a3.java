package cm1;

import a14.C0000n0;
import android.content.Context;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.widget.TextView;
import com.tencent.p014mm.sdk.platformtools.Log;
import er1.C7832m3;
import fy3.C32227p;
import gy3.C87412m;
import kotlin.ResultKt;
import rx3.C13598b0;
import te3.C49839if1;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.finder.model.SyncGetImageModel$setDesc$2", mo125469f = "SyncGetImageModel.kt", mo125470l = {}, mo125471m = "invokeSuspend")
/* renamed from: cm1.a3 */
public final class C0710a3 extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public final /* synthetic */ C0777t2 f1697d;

    /* renamed from: e */
    public final /* synthetic */ TextView f1698e;

    /* renamed from: f */
    public final /* synthetic */ Context f1699f;

    /* renamed from: g */
    public final /* synthetic */ String f1700g;

    /* renamed from: h */
    public final /* synthetic */ boolean f1701h;

    /* renamed from: i */
    public final /* synthetic */ int f1702i;

    /* renamed from: j */
    public final /* synthetic */ int f1703j;

    /* renamed from: n */
    public final /* synthetic */ boolean f1704n;

    /* renamed from: o */
    public final /* synthetic */ C49839if1 f1705o;

    /* renamed from: p */
    public final /* synthetic */ int f1706p;

    /* renamed from: q */
    public final /* synthetic */ boolean f1707q;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0710a3(C0777t2 t2Var, TextView textView, Context context, String str, boolean z, int i, int i2, boolean z2, C49839if1 if12, int i3, boolean z3, C15601d<? super C0710a3> dVar) {
        super(2, dVar);
        this.f1697d = t2Var;
        this.f1698e = textView;
        this.f1699f = context;
        this.f1700g = str;
        this.f1701h = z;
        this.f1702i = i;
        this.f1703j = i2;
        this.f1704n = z2;
        this.f1705o = if12;
        this.f1706p = i3;
        this.f1707q = z3;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C0710a3(this.f1697d, this.f1698e, this.f1699f, this.f1700g, this.f1701h, this.f1702i, this.f1703j, this.f1704n, this.f1705o, this.f1706p, this.f1707q, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C0710a3) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        String str;
        String str2;
        SpannableStringBuilder spannableStringBuilder;
        String str3;
        String str4;
        CharSequence charSequence;
        ResultKt.throwOnFailure(obj);
        C0777t2 t2Var = this.f1697d;
        TextView textView = this.f1698e;
        Context context = this.f1699f;
        String str5 = this.f1700g;
        boolean z = this.f1701h;
        int i = this.f1702i;
        int i2 = this.f1703j;
        if (i2 <= 0 || !this.f1704n) {
            i2 = 0;
        }
        Object j3 = t2Var.mo719j3(textView, context, str5, z, i, i2, C0777t2.m720c3(t2Var, this.f1705o), this.f1704n, this.f1706p, this.f1707q);
        C0777t2 t2Var2 = this.f1697d;
        TextView textView2 = this.f1698e;
        int i3 = this.f1703j;
        boolean z2 = this.f1704n;
        String str6 = this.f1700g;
        Context context2 = this.f1699f;
        boolean z3 = this.f1701h;
        C49839if1 if12 = this.f1705o;
        t2Var2.getClass();
        if (j3 instanceof String) {
            C7832m3 m3Var = C7832m3.f26372a;
            if (i3 <= 0 || !z2) {
                i3 = 0;
            }
            SpannableStringBuilder c = C7832m3.m7968c(m3Var, i3, str6 + ' ' + j3, context2, z3, 0, 0, false, 112, (Object) null);
            Log.m105924i("Finder.SyncGetImageModel", "String type match prefixText:" + str6 + ' ' + j3 + " recommendDesc:" + c + " pos:" + t2Var2.f1823g + " hashCode:" + t2Var2.hashCode());
            textView2.setText(c);
        } else {
            String str7 = "Finder.SyncGetImageModel";
            if (j3 instanceof SpannableString) {
                if (if12 == null) {
                    C7832m3 m3Var2 = C7832m3.f26372a;
                    if (i3 <= 0 || !z2) {
                        i3 = 0;
                    }
                    SpannableStringBuilder append = new SpannableStringBuilder(str6).append(' ').append((CharSequence) j3);
                    C87412m.m108593f(append, "SpannableStringBuilder(p….append(' ').append(desc)");
                    str3 = " pos:";
                    int i4 = i3;
                    str4 = " hashCode:";
                    charSequence = C7832m3.m7969d(m3Var2, i4, append, context2, z3, 0, 0, false, 112, (Object) null);
                } else {
                    str3 = " pos:";
                    str4 = " hashCode:";
                    charSequence = (CharSequence) j3;
                }
                Log.m105924i(str7, "SpannableString type match " + charSequence + str3 + t2Var2.f1823g + str4 + t2Var2.hashCode());
                textView2.setText(charSequence);
            } else if (j3 instanceof SpannableStringBuilder) {
                if (if12 == null) {
                    C7832m3 m3Var3 = C7832m3.f26372a;
                    if (i3 <= 0 || !z2) {
                        i3 = 0;
                    }
                    SpannableStringBuilder append2 = new SpannableStringBuilder(str6).append(' ').append((CharSequence) j3);
                    C87412m.m108593f(append2, "SpannableStringBuilder(p….append(' ').append(desc)");
                    str = " pos:";
                    int i5 = i3;
                    str2 = " hashCode:";
                    spannableStringBuilder = C7832m3.m7969d(m3Var3, i5, append2, context2, z3, 0, 0, false, 112, (Object) null);
                } else {
                    str = " pos:";
                    str2 = " hashCode:";
                    spannableStringBuilder = (SpannableStringBuilder) j3;
                }
                Log.m105924i(str7, "SpannableStringBuilder type match " + spannableStringBuilder + str + t2Var2.f1823g + str2 + t2Var2.hashCode());
                textView2.setText(spannableStringBuilder);
            } else {
                Log.m105928w(str7, "desc type match nothing !" + j3 + " pos:" + t2Var2.f1823g + " hashCode:" + t2Var2.hashCode());
            }
        }
        return C13598b0.f38549a;
    }
}
