package on3;

import android.content.Context;
import android.content.DialogInterface;
import com.tencent.p014mm.storage.C72958d5;
import com.tencent.p014mm.storage.C72963f4;

/* renamed from: on3.m */
public final class C77027m implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C77029o f225030d;

    /* renamed from: e */
    public final /* synthetic */ Context f225031e;

    /* renamed from: f */
    public final /* synthetic */ int f225032f;

    /* renamed from: g */
    public final /* synthetic */ C72958d5 f225033g;

    /* renamed from: h */
    public final /* synthetic */ C72963f4 f225034h;

    public C77027m(C77029o oVar, Context context, int i, C72958d5 d5Var, C72963f4 f4Var) {
        this.f225030d = oVar;
        this.f225031e = context;
        this.f225032f = i;
        this.f225033g = d5Var;
        this.f225034h = f4Var;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f225030d.wx0(this.f225031e, this.f225032f, this.f225033g, this.f225034h);
    }
}
