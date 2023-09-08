package e23;

import android.view.View;
import android.widget.ImageView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import java.util.List;
import k60.C99101e;
import p171il.C98744t;
import p171il.C98748z;
import p813fl.C97927q0;

/* renamed from: e23.d */
public final class C97594d extends C98748z<C97593c> {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C97594d(View view, C98744t tVar) {
        super(view, tVar);
        C87412m.m108594g(view, "itemView");
        ImageView imageView = (ImageView) view.findViewById(C0966R.C0970id.ccr);
    }

    /* renamed from: y */
    public void mo136856y(C97927q0 q0Var) {
        C87412m.m108594g(q0Var, "item");
        this.f289539A = q0Var;
        C97593c cVar = (C97593c) q0Var;
        List<String> list = C97592a.f286326a;
        Log.m105924i("MicroMsg.PagEmojiPanel", "onBind: null");
        C99101e eVar = C99101e.f290570a;
        C99101e.f290571b.mo138472g((String) null);
        throw null;
    }
}
