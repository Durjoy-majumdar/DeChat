package ac3;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.xeffect.WeEffectRender;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.List;
import q00.C110264g;
import qr3.C110470e;
import rx3.C13604l;
import rx3.C13605o;
import sx3.C64186f0;

/* renamed from: ac3.q */
public final class C103369q implements C54010o {

    /* renamed from: a */
    public boolean f304843a;

    /* renamed from: b */
    public C110264g f304844b;

    /* renamed from: c */
    public long f304845c;

    /* renamed from: d */
    public final List<C13604l<String, String>> f304846d = new ArrayList();

    /* renamed from: e */
    public final ArrayList<C13605o<Long, String, String>> f304847e = new ArrayList<>();

    /* renamed from: b */
    public void mo74677b(List<C13604l<String, String>> list) {
        C87412m.m108594g(list, "resList");
        mo143274m(list);
    }

    /* renamed from: d */
    public void mo74671d(C110264g gVar) {
        StringBuilder sb = new StringBuilder();
        sb.append("attach WeVision=");
        if (C110470e.f330363a == 0) {
            C110470e.f330363a = 2011400;
        }
        sb.append(C110470e.f330363a);
        Log.m105924i("FinderLiveLiveElementEffect", sb.toString());
        if (!this.f304843a || gVar == null || gVar.mo143248o() == this.f304845c) {
            C110264g gVar2 = this.f304844b;
            if (gVar2 != null) {
                gVar2.mo143246m(this);
            }
            this.f304844b = gVar;
            if (gVar != null) {
                gVar.mo143240g(this);
            }
            if (gVar != null) {
                long o = gVar.mo143248o();
                this.f304845c = o;
                if (o != 0) {
                    this.f304843a = true;
                    return;
                }
                return;
            }
            mo143274m(C64186f0.f181907d);
            this.f304845c = 0;
            this.f304843a = false;
            return;
        }
        Log.m105924i("FinderLiveLiveElementEffect", "Cannot attach twice!");
    }

    /* renamed from: j */
    public int mo74672j() {
        return 0;
    }

    /* renamed from: m */
    public final void mo143274m(List<C13604l<String, String>> list) {
        ((ArrayList) this.f304846d).clear();
        ((ArrayList) this.f304846d).addAll(list);
        if (!this.f304843a) {
            Log.m105924i("FinderLiveLiveElementEffect", "This effect is not attached!");
        }
        if (this.f304843a) {
            for (C13605o oVar : this.f304847e) {
                WeEffectRender.nRemoveResource(this.f304845c, ((Number) oVar.f38557d).longValue());
            }
            this.f304847e.clear();
            for (C13604l next : list) {
                long[] nAddEffectMaterialsFolder = WeEffectRender.nAddEffectMaterialsFolder(this.f304845c, (String) next.f38556e);
                if (nAddEffectMaterialsFolder != null) {
                    for (long valueOf : nAddEffectMaterialsFolder) {
                        this.f304847e.add(new C13605o(Long.valueOf(valueOf), next.f38555d, next.f38556e));
                    }
                }
            }
        }
    }

    public void reload() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f304846d);
        mo143274m(arrayList);
    }
}
