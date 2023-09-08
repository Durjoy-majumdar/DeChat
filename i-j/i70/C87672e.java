package i70;

import android.view.View;
import android.view.ViewGroup;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C8480h;
import gy3.C87412m;
import java.util.HashMap;
import r52.C89872c;

/* renamed from: i70.e */
public final class C87672e {

    /* renamed from: a */
    public final HashMap<Integer, C87673a> f253937a = new HashMap<>();

    /* renamed from: i70.e$a */
    public static final class C87673a {

        /* renamed from: a */
        public final int f253938a;

        /* renamed from: b */
        public String f253939b;

        /* renamed from: c */
        public int f253940c;

        /* renamed from: d */
        public int f253941d;

        /* renamed from: e */
        public int f253942e;

        /* renamed from: f */
        public int f253943f;

        /* renamed from: g */
        public View f253944g;

        /* renamed from: h */
        public C89872c f253945h;

        /* renamed from: i */
        public boolean f253946i;

        /* renamed from: j */
        public boolean f253947j;

        /* renamed from: k */
        public boolean f253948k;

        /* renamed from: l */
        public boolean f253949l;

        /* renamed from: m */
        public boolean f253950m;

        public C87673a() {
            this(0, (String) null, 0, 0, 0, 0, (View) null, (C89872c) null, false, false, false, false, false, 8191, (C8480h) null);
        }

        public C87673a(int i, String str, int i2, int i3, int i4, int i5, View view, C89872c cVar, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, int i6, C8480h hVar) {
            int i7 = i6;
            boolean z6 = false;
            int i8 = (i7 & 1) != 0 ? 0 : i;
            String str2 = (i7 & 2) != 0 ? "" : str;
            int i9 = (i7 & 4) != 0 ? 0 : i2;
            int i15 = (i7 & 8) != 0 ? 0 : i3;
            int i16 = (i7 & 16) != 0 ? 0 : i4;
            int i17 = (i7 & 32) != 0 ? 0 : i5;
            C89872c cVar2 = null;
            View view2 = (i7 & 64) != 0 ? null : view;
            cVar2 = (i7 & 128) == 0 ? cVar : cVar2;
            boolean z7 = (i7 & 256) != 0 ? false : z;
            boolean z8 = (i7 & 512) != 0 ? false : z2;
            boolean z9 = (i7 & 1024) != 0 ? false : z3;
            boolean z15 = (i7 & 2048) != 0 ? false : z4;
            z6 = (i7 & 4096) == 0 ? z5 : z6;
            C87412m.m108594g(str2, "frameSetId");
            this.f253938a = i8;
            this.f253939b = str2;
            this.f253940c = i9;
            this.f253941d = i15;
            this.f253942e = i16;
            this.f253943f = i17;
            this.f253944g = view2;
            this.f253945h = cVar2;
            this.f253946i = z7;
            this.f253947j = z8;
            this.f253948k = z9;
            this.f253949l = z15;
            this.f253950m = z6;
        }

        /* renamed from: a */
        public final void mo122107a() {
            if (this.f253945h != null) {
                this.f253947j = true;
            }
            View view = this.f253944g;
            if (view != null && view.getLayoutParams() != null) {
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                C87412m.m108592e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.width = this.f253942e;
                marginLayoutParams.height = this.f253943f;
                marginLayoutParams.topMargin = this.f253941d;
                marginLayoutParams.leftMargin = this.f253940c;
                view.setLayoutParams(marginLayoutParams);
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C87673a)) {
                return false;
            }
            C87673a aVar = (C87673a) obj;
            return this.f253938a == aVar.f253938a && C87412m.m108589b(this.f253939b, aVar.f253939b) && this.f253940c == aVar.f253940c && this.f253941d == aVar.f253941d && this.f253942e == aVar.f253942e && this.f253943f == aVar.f253943f && C87412m.m108589b(this.f253944g, aVar.f253944g) && C87412m.m108589b(this.f253945h, aVar.f253945h) && this.f253946i == aVar.f253946i && this.f253947j == aVar.f253947j && this.f253948k == aVar.f253948k && this.f253949l == aVar.f253949l && this.f253950m == aVar.f253950m;
        }

        public int hashCode() {
            int hashCode = ((((((((((this.f253938a * 31) + this.f253939b.hashCode()) * 31) + this.f253940c) * 31) + this.f253941d) * 31) + this.f253942e) * 31) + this.f253943f) * 31;
            View view = this.f253944g;
            int i = 0;
            int hashCode2 = (hashCode + (view == null ? 0 : view.hashCode())) * 31;
            C89872c cVar = this.f253945h;
            if (cVar != null) {
                i = cVar.hashCode();
            }
            int i2 = (hashCode2 + i) * 31;
            boolean z = this.f253946i;
            boolean z2 = true;
            if (z) {
                z = true;
            }
            int i3 = (i2 + (z ? 1 : 0)) * 31;
            boolean z3 = this.f253947j;
            if (z3) {
                z3 = true;
            }
            int i4 = (i3 + (z3 ? 1 : 0)) * 31;
            boolean z4 = this.f253948k;
            if (z4) {
                z4 = true;
            }
            int i5 = (i4 + (z4 ? 1 : 0)) * 31;
            boolean z5 = this.f253949l;
            if (z5) {
                z5 = true;
            }
            int i6 = (i5 + (z5 ? 1 : 0)) * 31;
            boolean z6 = this.f253950m;
            if (!z6) {
                z2 = z6;
            }
            return i6 + (z2 ? 1 : 0);
        }

        public String toString() {
            return "MagicSclCanvas(canvasId=" + this.f253938a + ", frameSetId=" + this.f253939b + ", left=" + this.f253940c + ", top=" + this.f253941d + ", width=" + this.f253942e + ", height=" + this.f253943f + ", canvasView=" + this.f253944g + ", externalView=" + this.f253945h + ", pendingFirstFrame=" + this.f253946i + ", pendingSize=" + this.f253947j + ", pendingRedraw=" + this.f253948k + ", firstFrameRendered=" + this.f253949l + ", surfaceAvailable=" + this.f253950m + ')';
        }
    }

    /* renamed from: b */
    public static C87673a m109065b(C87672e eVar, int i, String str, View view, int i2, Object obj) {
        C87672e eVar2 = eVar;
        View view2 = null;
        String str2 = (i2 & 2) != 0 ? null : str;
        if ((i2 & 4) == 0) {
            view2 = view;
        }
        eVar.getClass();
        Log.m105924i("MagicSclCanvasMgr", "notifyCanvasInfo canvasId:" + i + ",frameSetId:" + str2);
        C87673a aVar = eVar2.f253937a.get(Integer.valueOf(i));
        if (aVar == null) {
            aVar = new C87673a(i, (String) null, 0, 0, 0, 0, (View) null, (C89872c) null, false, false, false, false, false, 8190, (C8480h) null);
            eVar2.f253937a.put(Integer.valueOf(i), aVar);
        }
        if (str2 != null) {
            aVar.f253939b = str2;
        }
        if (view2 != null) {
            aVar.f253944g = view2;
        }
        return aVar;
    }

    /* renamed from: a */
    public final C87673a mo122106a(int i) {
        return this.f253937a.get(Integer.valueOf(i));
    }
}
