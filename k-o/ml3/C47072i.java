package ml3;

import android.content.Context;
import android.content.DialogInterface;
import com.tencent.p014mm.C0966R;
import eb0.C97625j3;
import ef2.C45654d;
import nj3.C76879j;

/* renamed from: ml3.i */
public class C47072i implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ String f126502d;

    /* renamed from: e */
    public final /* synthetic */ Context f126503e;

    /* renamed from: f */
    public final /* synthetic */ C47077m f126504f;

    /* renamed from: ml3.i$a */
    public class C47073a implements DialogInterface.OnCancelListener {

        /* renamed from: d */
        public final /* synthetic */ C45654d f126505d;

        public C47073a(C45654d dVar) {
            this.f126505d = dVar;
        }

        public void onCancel(DialogInterface dialogInterface) {
            C97625j3.m125815e().mo123458d(this.f126505d);
            C97625j3.m125815e().mo123470p(1394, C47072i.this.f126504f);
        }
    }

    public C47072i(C47077m mVar, String str, Context context) {
        this.f126504f = mVar;
        this.f126502d = str;
        this.f126503e = context;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        C45654d dVar = new C45654d(this.f126502d, true);
        C97625j3.m125815e().mo123455a(1394, this.f126504f);
        C97625j3.m125815e().mo123460f(dVar);
        C47077m mVar = this.f126504f;
        Context context = this.f126503e;
        mVar.f126513f = C76879j.m92723Q(context, context.getString(C0966R.string.a3h), this.f126503e.getString(C0966R.string.a4d), true, true, new C47073a(dVar));
    }
}
