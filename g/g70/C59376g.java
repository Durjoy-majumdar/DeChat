package g70;

import android.view.ViewGroup;
import android.view.ViewParent;
import com.tencent.p014mm.magicbrush.plugin.scl.view.MagicSclViewContainer;
import fy3.C32224a;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: g70.g */
public final class C59376g extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C87164i f169707d;

    /* renamed from: e */
    public final /* synthetic */ boolean f169708e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59376g(C87164i iVar, boolean z) {
        super(0);
        this.f169707d = iVar;
        this.f169708e = z;
    }

    public Object invoke() {
        MagicSclViewContainer magicSclViewContainer = this.f169707d.f252796l;
        ViewGroup viewGroup = null;
        ViewParent parent = magicSclViewContainer != null ? magicSclViewContainer.getParent() : null;
        if (parent instanceof ViewGroup) {
            viewGroup = (ViewGroup) parent;
        }
        if (viewGroup != null) {
            viewGroup.setClipChildren(this.f169708e);
        }
        return C13598b0.f38549a;
    }
}
