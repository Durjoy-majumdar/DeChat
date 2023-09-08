package zr1;

import android.graphics.Bitmap;
import android.view.View;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: zr1.a */
public final class C16395a extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C16396b f43792d;

    /* renamed from: e */
    public final /* synthetic */ Bitmap f43793e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C16395a(C16396b bVar, Bitmap bitmap) {
        super(0);
        this.f43792d = bVar;
        this.f43793e = bitmap;
    }

    public Object invoke() {
        String str = this.f43792d.f43796c;
        StringBuilder sb = new StringBuilder();
        sb.append("loaded match, view:");
        View view = this.f43792d.f43797d.get();
        sb.append(view != null ? Integer.valueOf(view.hashCode()) : null);
        Log.m105924i(str, sb.toString());
        C16396b bVar = this.f43792d;
        bVar.f43798e = this.f43793e;
        View view2 = bVar.f43797d.get();
        if (view2 != null) {
            view2.invalidate();
        }
        return C13598b0.f38549a;
    }
}
