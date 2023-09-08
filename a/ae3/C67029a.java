package ae3;

import android.content.DialogInterface;
import com.tencent.p014mm.pluginsdk.model.C44590b1;
import com.tencent.p014mm.pluginsdk.p133ui.preference.C72893b;
import eb0.C97625j3;

/* renamed from: ae3.a */
public class C67029a implements DialogInterface.OnCancelListener {

    /* renamed from: d */
    public final /* synthetic */ C44590b1 f192523d;

    public C67029a(C72893b bVar, C44590b1 b1Var) {
        this.f192523d = b1Var;
    }

    public void onCancel(DialogInterface dialogInterface) {
        C97625j3.m125815e().mo123458d(this.f192523d);
    }
}
