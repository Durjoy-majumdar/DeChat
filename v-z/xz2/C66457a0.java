package xz2;

import android.content.Context;
import android.os.Bundle;
import android.widget.FrameLayout;
import android.widget.ImageView;
import b03.C67128d0;
import com.google.android.gms.dynamite.ProviderConstants;
import com.tencent.p014mm.sdk.platformtools.Log;
import di0.C86299o;
import di3.C86312j;
import gc0.C20828a;
import go3.C59600d;
import gy3.C87412m;
import kr0.C76630x0;
import org.json.JSONObject;
import p1070zf.C91680c;
import p213oh.C11412b;
import qy2.C36206l;
import qy2.C77455o;
import rx3.C13598b0;
import uz2.C65488a0;
import uz2.C65490m;
import uz2.C65492p;
import z04.C112551y;

/* renamed from: xz2.a0 */
public final class C66457a0 implements C36206l {

    /* renamed from: xz2.a0$a */
    public static final class C66458a {

        /* renamed from: a */
        public final String f191223a;

        /* renamed from: b */
        public final String f191224b;

        /* renamed from: c */
        public final int f191225c;

        /* renamed from: d */
        public final int f191226d;

        public C66458a(String str, String str2, int i, int i2) {
            this.f191223a = str;
            this.f191224b = str2;
            this.f191225c = i;
            this.f191226d = i2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C66458a)) {
                return false;
            }
            C66458a aVar = (C66458a) obj;
            return C87412m.m108589b(this.f191223a, aVar.f191223a) && C87412m.m108589b(this.f191224b, aVar.f191224b) && this.f191225c == aVar.f191225c && this.f191226d == aVar.f191226d;
        }

        public int hashCode() {
            String str = this.f191223a;
            int i = 0;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f191224b;
            if (str2 != null) {
                i = str2.hashCode();
            }
            return ((((hashCode + i) * 31) + this.f191225c) * 31) + this.f191226d;
        }

        public String toString() {
            return "WeAppJumpParam(username=" + this.f191223a + ", enterPath=" + this.f191224b + ", version=" + this.f191225c + ", versionType=" + this.f191226d + ')';
        }
    }

    /* renamed from: xz2.a0$b */
    public static final class C66459b extends C77455o {

        /* renamed from: d */
        public JSONObject f191227d;

        public C66459b(String str) {
            super(str);
        }

        /* renamed from: d */
        public boolean mo84142d(Context context, Bundle bundle) {
            C66458a r = mo90549r();
            if (r == null) {
                return false;
            }
            C76630x0 x0Var = (C76630x0) C86312j.m106911c(C76630x0.class);
            if (x0Var == null) {
                return true;
            }
            C86299o oVar = new C86299o();
            String str = r.f191223a;
            oVar.f250929a = str;
            oVar.f250934f = r.f191224b;
            oVar.f250932d = r.f191225c;
            oVar.f250931c = r.f191226d;
            oVar.f250939k = C91680c.CTRL_INDEX;
            oVar.f250940l = str;
            C13598b0 b0Var = C13598b0.f38549a;
            x0Var.mo106898tv(context, oVar);
            return true;
        }

        /* renamed from: e */
        public void mo90548e(C65492p pVar) {
            C66458a r = mo90549r();
            if (r != null) {
                if (pVar != null) {
                    pVar.f188458g = r.f191223a;
                }
                if (pVar != null) {
                    pVar.f188459h = r.f191224b;
                }
            }
        }

        /* renamed from: j */
        public boolean mo84146j() {
            return false;
        }

        /* renamed from: m */
        public void mo84147m(String str, C65488a0 a0Var) {
            JSONObject jSONObject;
            this.f225886b = a0Var;
            this.f225887c = str;
            if (a0Var != null && C87412m.m108589b(a0Var.f188439d, "7")) {
                try {
                    jSONObject = new JSONObject(a0Var.f188441f);
                } catch (Throwable th) {
                    int i = C11412b.f33577a;
                    Log.printErrStackTrace("MicroMsg.TextStatus.WeAppStatusService", th, "WeAppStatus parse err", new Object[0]);
                    jSONObject = null;
                }
                this.f191227d = jSONObject;
            }
        }

        /* renamed from: n */
        public void mo84148n() {
        }

        /* renamed from: p */
        public boolean mo84851p(FrameLayout frameLayout) {
            C87412m.m108594g(frameLayout, "container");
            ImageView imageView = (ImageView) frameLayout.findViewWithTag("MicroMsg.TextStatus.WeAppStatusService");
            if (imageView == null) {
                imageView = new ImageView(frameLayout.getContext());
            }
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            frameLayout.removeAllViews();
            frameLayout.addView(imageView);
            imageView.setOutlineProvider(new C67128d0(0.5f));
            imageView.setClipToOutline(true);
            JSONObject jSONObject = this.f191227d;
            String optString = jSONObject != null ? jSONObject.optString("headImageURL") : null;
            if (!(optString == null || C112551y.m153811k(optString))) {
                C20828a.m22825b().mo32518g(optString, imageView);
            }
            return true;
        }

        /* renamed from: r */
        public final C66458a mo90549r() {
            JSONObject jSONObject;
            C65488a0 a0Var = this.f225886b;
            if (a0Var == null || !C87412m.m108589b(a0Var.f188439d, "7")) {
                return null;
            }
            try {
                jSONObject = new JSONObject(a0Var.f188441f);
            } catch (Throwable unused) {
                jSONObject = new JSONObject();
            }
            return new C66458a(jSONObject.optString("username"), jSONObject.optString("path"), jSONObject.optInt(ProviderConstants.API_COLNAME_FEATURE_VERSION), jSONObject.optInt("versionType", 0));
        }
    }

    /* renamed from: IT */
    public C59600d mo84138IT(String str, FrameLayout frameLayout, C65488a0 a0Var, C65490m mVar) {
        C87412m.m108594g(frameLayout, "container");
        C87412m.m108594g(mVar, "pullDownParam");
        return null;
    }

    public C77455o l30(String str) {
        return new C66459b(str);
    }

    public void release() {
    }
}
