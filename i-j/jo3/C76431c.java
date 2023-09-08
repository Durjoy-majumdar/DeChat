package jo3;

import android.text.InputFilter;
import com.tencent.p014mm.p136ui.tools.C45078p0;
import com.tencent.p014mm.p136ui.widget.cedit.api.C74974a;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import qn3.C77382c;

/* renamed from: jo3.c */
public class C76431c extends C77382c {

    /* renamed from: i */
    public WeakReference<C74974a> f223755i;

    public C76431c(WeakReference<C74974a> weakReference) {
        super("");
        this.f223755i = weakReference;
    }

    /* renamed from: g */
    public static C76431c m91853g(C74974a aVar) {
        return new C76431c(new WeakReference(aVar));
    }

    /* renamed from: a */
    public int mo106647a() {
        if (Util.isNullOrNil(this.f225609c)) {
            WeakReference<C74974a> weakReference = this.f223755i;
            if (weakReference == null) {
                return 1;
            }
            this.f225609c = weakReference.get().getText().toString().trim();
        }
        int e = C45078p0.m49926e(this.f225609c, this.f225612f);
        if (e < 0) {
            Log.m105928w("MicroMsg.InputIEdtBoundaryCheck", "you are crazy =.=!that is 2 GB character!");
            return 2;
        } else if (e < this.f225611e) {
            return 1;
        } else {
            return e > this.f225610d ? 2 : 0;
        }
    }

    /* renamed from: c */
    public void mo106648c() {
        if (!this.f225607a) {
            if (this.f223755i == null) {
                Log.m105928w("MicroMsg.InputIEdtBoundaryCheck", "edit text view is null");
                return;
            } else if (Util.isNullOrNil((List) this.f225613g)) {
                this.f223755i.get().setFilters(new InputFilter[]{new C45078p0(this.f225610d, this.f225612f)});
            } else {
                this.f225613g.add(new C45078p0(this.f225610d, this.f225612f));
                ArrayList<InputFilter> arrayList = this.f225613g;
                this.f223755i.get().setFilters((InputFilter[]) arrayList.toArray(new InputFilter[arrayList.size()]));
            }
        }
        if (this.f225614h != null) {
            int a = mo106647a();
            if (a == 0) {
                this.f225614h.mo4086P4(this.f225609c);
            } else if (a == 1) {
                this.f225614h.mo4084L3(this.f225609c);
            } else if (a == 2) {
                this.f225614h.mo4083L0(this.f225609c);
            }
        }
    }
}
