package wf1;

import com.tencent.p014mm.p136ui.widget.picker.C7045j;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: wf1.k0 */
public final class C15192k0 implements C7045j.C7054i {

    /* renamed from: a */
    public final /* synthetic */ C15193l f41361a;

    public C15192k0(C15193l lVar) {
        this.f41361a = lVar;
    }

    /* renamed from: a */
    public final void mo7435a(int i) {
        String str = this.f41361a.f41381d;
        Log.m105924i(str, "[OnFirstOptionChange] " + this.f41361a.f41370C.get(i).intValue());
        C15193l lVar = this.f41361a;
        lVar.mo14135l3(lVar.f41370C.get(i));
    }
}
