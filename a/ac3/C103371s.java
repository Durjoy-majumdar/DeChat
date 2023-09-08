package ac3;

import ac3.C103355g1;
import com.tencent.p014mm.xeffect.IWeEffectCallback;
import com.tencent.p014mm.xeffect.WeEffectRender;
import java.util.Iterator;
import sx3.C110823p;

/* renamed from: ac3.s */
public final class C103371s extends C103370r {

    /* renamed from: g */
    public String f304854g;

    /* renamed from: h */
    public String f304855h;

    /* renamed from: i */
    public int f304856i;

    /* renamed from: j */
    public int f304857j;

    /* renamed from: f */
    public void mo74680f(String str, String str2) {
        long[] nAddEffectMaterialsFolder;
        this.f304854g = str;
        this.f304855h = str2;
        if (mo143275m()) {
            boolean z = false;
            this.f304851d = 0;
            Iterator<Long> it = this.f304852e.iterator();
            while (it.hasNext()) {
                long longValue = it.next().longValue();
                WeEffectRender.nRemoveResource(this.f304850c, longValue);
                WeEffectRender.m144535a(this.f304850c, longValue, (IWeEffectCallback) null);
            }
            this.f304852e.clear();
            WeEffectRender.nRemoveFilter(this.f304850c, this.f304853f);
            this.f304853f = 0;
            if (str != null) {
                if (!(str.length() == 0) && (nAddEffectMaterialsFolder = WeEffectRender.nAddEffectMaterialsFolder(this.f304850c, str)) != null) {
                    this.f304852e.addAll(C110823p.m151000Z(nAddEffectMaterialsFolder));
                    C103355g1.C103357b bVar = C103355g1.f304769J;
                    this.f304851d = 47232;
                }
            }
            if (str2 != null) {
                if (str2.length() > 0) {
                    z = true;
                }
                if (z) {
                    this.f304853f = WeEffectRender.nCreateFilterWithConfig(this.f304850c, str2);
                }
            }
        }
    }

    /* renamed from: h */
    public void mo74681h(int i) {
        this.f304857j = i;
        if (mo143275m()) {
            long j = this.f304853f;
            if (j > 0) {
                WeEffectRender.nSetFilterColorWeight(this.f304850c, j, ((float) i) / 100.0f);
            }
        }
    }

    /* renamed from: k */
    public void mo74682k(int i) {
        this.f304856i = i;
        if (mo143275m()) {
            WeEffectRender.nSetMakeupGlobalAlpha(this.f304850c, ((float) i) / 100.0f);
        }
    }

    public void reload() {
        mo74680f(this.f304854g, this.f304855h);
        mo74682k(this.f304856i);
        mo74681h(this.f304857j);
    }
}
