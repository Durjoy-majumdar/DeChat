package ej1;

import android.content.Context;
import android.graphics.Bitmap;
import cj1.C0581o5;
import com.tencent.p014mm.sdk.platformtools.Log;
import de3.C75375u;
import gy3.C87412m;
import o40.C61926c;
import qk1.C12806i0;
import r60.C101350i;
import t60.C64207e;
import x60.C102564a;

/* renamed from: ej1.z */
public final class C7724z<T, R> implements C64207e {

    /* renamed from: a */
    public final /* synthetic */ C12806i0.C12807a f26157a;

    /* renamed from: b */
    public final /* synthetic */ C0581o5 f26158b;

    /* renamed from: c */
    public final /* synthetic */ Context f26159c;

    /* renamed from: d */
    public final /* synthetic */ C7721x f26160d;

    /* renamed from: e */
    public final /* synthetic */ C75375u f26161e;

    /* renamed from: f */
    public final /* synthetic */ int f26162f;

    public C7724z(C12806i0.C12807a aVar, C0581o5 o5Var, Context context, C7721x xVar, C75375u uVar, int i) {
        this.f26157a = aVar;
        this.f26158b = o5Var;
        this.f26159c = context;
        this.f26160d = xVar;
        this.f26161e = uVar;
        this.f26162f = i;
    }

    /* renamed from: a */
    public void mo507a(C102564a aVar, C101350i iVar, Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        if (!C87412m.m108589b(this.f26157a.f44854d.getTag(), Long.valueOf(this.f26158b.getSeq()))) {
            Log.m105924i("CommentItemNotify", "onBindNotifyMsg tag:" + this.f26157a.f44854d.getTag() + ", seq:" + this.f26158b.getSeq());
        } else if (bitmap != null) {
            C61926c.m72668M(new C7723y(this.f26159c, bitmap, this.f26160d, this.f26161e, this.f26162f, this.f26157a));
        } else {
            Log.m105924i("CommentItemNotify", "onBindNotifyMsg " + this.f26158b.getSeq() + " resource is null!");
        }
    }
}
