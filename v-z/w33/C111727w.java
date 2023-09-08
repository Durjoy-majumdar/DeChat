package w33;

import di3.C86312j;
import h81.C32735h;
import z33.C112595h;

/* renamed from: w33.w */
public final class C111727w {

    /* renamed from: a */
    public boolean f334521a = C112595h.f337166a.mo164369c();

    /* renamed from: b */
    public boolean f334522b = C112595h.m153927n();

    /* renamed from: c */
    public String f334523c;

    /* renamed from: d */
    public boolean f334524d = true;

    /* renamed from: e */
    public boolean f334525e = true;

    public C111727w() {
        String str = "1";
        this.f334523c = str;
        this.f334523c = C112595h.m153929q() ? "2" : str;
        this.f334524d = ((C32735h) C86312j.m106911c(C32735h.class)).mo58784wf(C32735h.C32737c.clicfg_voip_xsetting_allow_reuse_surface, true);
        this.f334525e = C112595h.m153921h();
    }

    public String toString() {
        return "faceBeauty:" + this.f334521a + " --dynamicPreview:" + this.f334522b + "--cameraSdk:" + this.f334523c + " --reuseSurface:" + this.f334524d + "--useImageReader:" + this.f334525e;
    }
}
