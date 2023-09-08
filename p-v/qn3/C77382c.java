package qn3;

import android.text.InputFilter;
import android.widget.EditText;
import com.tencent.p014mm.p136ui.tools.C45078p0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* renamed from: qn3.c */
public class C77382c extends C77381a {

    /* renamed from: a */
    public boolean f225607a = false;

    /* renamed from: b */
    public WeakReference<EditText> f225608b;

    /* renamed from: c */
    public String f225609c;

    /* renamed from: d */
    public int f225610d;

    /* renamed from: e */
    public int f225611e;

    /* renamed from: f */
    public C45078p0.C45079a f225612f = C45078p0.C45079a.MODE_CHINESE_AS_2;

    /* renamed from: g */
    public ArrayList<InputFilter> f225613g;

    /* renamed from: h */
    public C77383a f225614h;

    /* renamed from: qn3.c$a */
    public interface C77383a {
        /* renamed from: L0 */
        void mo4083L0(String str);

        /* renamed from: L3 */
        void mo4084L3(String str);

        /* renamed from: P4 */
        void mo4086P4(String str);
    }

    public C77382c(WeakReference<EditText> weakReference) {
        this.f225608b = weakReference;
    }

    /* renamed from: b */
    public static C77382c m93286b(EditText editText) {
        return new C77382c((WeakReference<EditText>) new WeakReference(editText));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000f, code lost:
        r0 = com.tencent.p014mm.p136ui.tools.C45078p0.m49924c(r2, r1);
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m93287e(java.lang.String r1, int r2) {
        /*
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r0 != 0) goto L_0x0022
            int r0 = com.tencent.p014mm.p136ui.tools.C45078p0.m49927f(r1)
            com.tencent.p014mm.p136ui.tools.C45078p0.m49925d(r2, r1)
            if (r0 <= r2) goto L_0x0022
            int r0 = com.tencent.p014mm.p136ui.tools.C45078p0.m49924c(r2, r1)
            if (r0 <= 0) goto L_0x0022
            if (r0 >= r2) goto L_0x0022
            int r2 = r1.length()
            if (r0 >= r2) goto L_0x0022
            r2 = 0
            java.lang.String r1 = r1.substring(r2, r0)
        L_0x0022:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: qn3.C77382c.m93287e(java.lang.String, int):java.lang.String");
    }

    /* renamed from: a */
    public int mo106647a() {
        if (Util.isNullOrNil(this.f225609c)) {
            WeakReference<EditText> weakReference = this.f225608b;
            if (weakReference == null) {
                return 1;
            }
            this.f225609c = weakReference.get().getText().toString().trim();
        }
        int e = C45078p0.m49926e(this.f225609c, this.f225612f);
        if (e < 0) {
            Log.m105928w("MicroMsg.InputTextBoundaryCheck", "you are crazy =.=!that is 2 GB character!");
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
            if (this.f225608b == null) {
                Log.m105928w("MicroMsg.InputTextBoundaryCheck", "edit text view is null");
                return;
            } else if (Util.isNullOrNil((List) this.f225613g)) {
                this.f225608b.get().setFilters(new InputFilter[]{mo79812f(this.f225610d, this.f225612f)});
            } else {
                this.f225613g.add(mo79812f(this.f225610d, this.f225612f));
                ArrayList<InputFilter> arrayList = this.f225613g;
                this.f225608b.get().setFilters((InputFilter[]) arrayList.toArray(new InputFilter[arrayList.size()]));
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

    /* renamed from: d */
    public void mo107499d(C77383a aVar) {
        this.f225614h = aVar;
        mo106648c();
    }

    /* renamed from: f */
    public C45078p0 mo79812f(int i, C45078p0.C45079a aVar) {
        return new C45078p0(i, aVar);
    }

    public C77382c(String str) {
        this.f225609c = str;
    }
}
