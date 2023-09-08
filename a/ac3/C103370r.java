package ac3;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.xeffect.IWeEffectCallback;
import com.tencent.p014mm.xeffect.WeEffectRender;
import gy3.C87412m;
import java.util.ArrayList;
import q00.C110264g;
import sx3.C110818d0;
import sx3.C110823p;

/* renamed from: ac3.r */
public class C103370r implements C54011p {

    /* renamed from: a */
    public boolean f304848a;

    /* renamed from: b */
    public C110264g f304849b;

    /* renamed from: c */
    public long f304850c;

    /* renamed from: d */
    public int f304851d;

    /* renamed from: e */
    public final ArrayList<Long> f304852e = new ArrayList<>();

    /* renamed from: f */
    public long f304853f;

    /* renamed from: c */
    public void mo74679c(String str, IWeEffectCallback iWeEffectCallback) {
        long[] nAddEffectMaterialsFolder;
        C87412m.m108594g(iWeEffectCallback, "callback");
        if (mo143275m()) {
            for (Number longValue : this.f304852e) {
                long longValue2 = longValue.longValue();
                WeEffectRender.nRemoveResource(this.f304850c, longValue2);
                WeEffectRender.m144535a(this.f304850c, longValue2, (IWeEffectCallback) null);
            }
            this.f304852e.clear();
            if (str != null) {
                if (!(str.length() == 0) && (nAddEffectMaterialsFolder = WeEffectRender.nAddEffectMaterialsFolder(this.f304850c, str)) != null) {
                    this.f304852e.addAll(C110823p.m151000Z(nAddEffectMaterialsFolder));
                    Long l = (Long) C110818d0.m150916N(this.f304852e);
                    if (l != null) {
                        WeEffectRender.m144535a(this.f304850c, l.longValue(), iWeEffectCallback);
                    }
                }
            }
        }
    }

    /* renamed from: d */
    public void mo74671d(C110264g gVar) {
        if (!this.f304848a || gVar == null || gVar.mo143248o() == this.f304850c) {
            C110264g gVar2 = this.f304849b;
            if (gVar2 != null) {
                gVar2.mo143246m(this);
            }
            this.f304849b = gVar;
            if (gVar != null) {
                gVar.mo143240g(this);
            }
            if (gVar != null) {
                long o = gVar.mo143248o();
                this.f304850c = o;
                if (o != 0) {
                    this.f304848a = true;
                    return;
                }
                return;
            }
            mo74680f("", "");
            this.f304850c = 0;
            this.f304848a = false;
            return;
        }
        Log.m105924i("MicroMsg.MakeUpSuitEffect", "Cannot attach twice!");
    }

    /* renamed from: f */
    public void mo74680f(String str, String str2) {
        throw null;
    }

    /* renamed from: j */
    public int mo74672j() {
        return this.f304851d;
    }

    /* renamed from: m */
    public final boolean mo143275m() {
        if (!this.f304848a) {
            Log.m105924i("MicroMsg.MakeUpSuitEffect", "This effect is not attached!");
        }
        return this.f304848a;
    }
}
