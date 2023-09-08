package kz2;

import android.content.Context;
import android.widget.ImageView;
import com.tencent.p014mm.sdk.platformtools.Log;
import kz2.C76641a;
import rz2.C48201c;

/* renamed from: kz2.c */
public final class C76651c implements C76641a.C76642a {

    /* renamed from: a */
    public final /* synthetic */ Context f224313a;

    /* renamed from: b */
    public final /* synthetic */ ImageView f224314b;

    /* renamed from: c */
    public final /* synthetic */ String f224315c;

    /* renamed from: d */
    public final /* synthetic */ C48201c f224316d;

    /* renamed from: e */
    public final /* synthetic */ String f224317e;

    /* renamed from: f */
    public final /* synthetic */ String f224318f;

    /* renamed from: g */
    public final /* synthetic */ int f224319g;

    public C76651c(Context context, ImageView imageView, String str, C48201c cVar, String str2, String str3, int i) {
        this.f224313a = context;
        this.f224314b = imageView;
        this.f224315c = str;
        this.f224316d = cVar;
        this.f224317e = str2;
        this.f224318f = str3;
        this.f224319g = i;
    }

    /* renamed from: a */
    public void mo106921a() {
        Log.m105924i("MicroMsg.TextStatus.StatusImgHandler", "begin download ori pic");
        C76641a.f224261a.mo106917a(this.f224313a, this.f224314b, this.f224315c, this.f224316d, this.f224317e, this.f224318f, (C76641a.C76642a) null, this.f224319g, false);
    }
}
