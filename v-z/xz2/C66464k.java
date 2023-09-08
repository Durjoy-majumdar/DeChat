package xz2;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.FrameLayout;
import go3.C59600d;
import gy3.C87412m;
import ke3.C88144b;
import qy2.C36206l;
import qy2.C77455o;
import uz2.C65488a0;
import uz2.C65490m;
import uz2.C65492p;
import z04.C112551y;

/* renamed from: xz2.k */
public final class C66464k implements C36206l {

    /* renamed from: xz2.k$a */
    public static final class C66465a extends C77455o {
        public C66465a(String str) {
            super(str);
        }

        /* renamed from: d */
        public boolean mo84142d(Context context, Bundle bundle) {
            String r = mo90551r();
            if (r == null || C112551y.m153811k(r)) {
                return false;
            }
            Intent intent = new Intent();
            intent.putExtra("rawUrl", r);
            C88144b.m109791i(context, "webview", ".ui.tools.WebViewUI", intent, (Bundle) null);
            return true;
        }

        /* renamed from: e */
        public void mo90548e(C65492p pVar) {
            if (pVar != null) {
                pVar.f188460i = mo90551r();
            }
        }

        /* renamed from: g */
        public String mo90550g() {
            return "3";
        }

        /* renamed from: j */
        public boolean mo84146j() {
            return false;
        }

        /* renamed from: m */
        public void mo84147m(String str, C65488a0 a0Var) {
            this.f225886b = a0Var;
            this.f225887c = str;
        }

        /* renamed from: n */
        public void mo84148n() {
        }

        /* JADX WARNING: Removed duplicated region for block: B:17:0x002c A[Catch:{ all -> 0x004a }] */
        /* JADX WARNING: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
        /* renamed from: r */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.String mo90551r() {
            /*
                r5 = this;
                uz2.a0 r0 = r5.f225886b
                if (r0 == 0) goto L_0x0055
                java.lang.String r1 = r0.f188439d
                java.lang.String r2 = "3"
                boolean r2 = gy3.C87412m.m108589b(r1, r2)
                r3 = 1
                if (r2 == 0) goto L_0x0011
                r1 = 1
                goto L_0x0017
            L_0x0011:
                java.lang.String r2 = "10"
                boolean r1 = gy3.C87412m.m108589b(r1, r2)
            L_0x0017:
                if (r1 == 0) goto L_0x0055
                java.lang.String r1 = r0.f188441f
                r2 = 0
                java.lang.String r4 = r0.f188442g     // Catch:{ all -> 0x004a }
                if (r4 == 0) goto L_0x0029
                boolean r4 = z04.C112551y.m153811k(r4)     // Catch:{ all -> 0x004a }
                if (r4 == 0) goto L_0x0027
                goto L_0x0029
            L_0x0027:
                r4 = 0
                goto L_0x002a
            L_0x0029:
                r4 = 1
            L_0x002a:
                if (r4 != 0) goto L_0x0054
                java.lang.String r0 = r0.f188442g     // Catch:{ all -> 0x004a }
                byte[] r0 = android.util.Base64.decode(r0, r2)     // Catch:{ all -> 0x004a }
                uz2.l1 r4 = new uz2.l1     // Catch:{ all -> 0x004a }
                r4.<init>()     // Catch:{ all -> 0x004a }
                r4.parseFrom(r0)     // Catch:{ all -> 0x004a }
                java.lang.String r0 = r4.f147160d     // Catch:{ all -> 0x004a }
                if (r0 == 0) goto L_0x0046
                boolean r4 = z04.C112551y.m153811k(r0)     // Catch:{ all -> 0x004a }
                if (r4 == 0) goto L_0x0045
                goto L_0x0046
            L_0x0045:
                r3 = 0
            L_0x0046:
                if (r3 != 0) goto L_0x0054
                r1 = r0
                goto L_0x0054
            L_0x004a:
                r0 = move-exception
                java.lang.Object[] r2 = new java.lang.Object[r2]
                java.lang.String r3 = "H5StatusService"
                java.lang.String r4 = "parse jump err"
                com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r3, r0, r4, r2)
            L_0x0054:
                return r1
            L_0x0055:
                java.lang.String r0 = ""
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: xz2.C66464k.C66465a.mo90551r():java.lang.String");
        }
    }

    /* renamed from: IT */
    public C59600d mo84138IT(String str, FrameLayout frameLayout, C65488a0 a0Var, C65490m mVar) {
        C87412m.m108594g(frameLayout, "container");
        C87412m.m108594g(mVar, "pullDownParam");
        return null;
    }

    public C77455o l30(String str) {
        return new C66465a(str);
    }

    public void release() {
    }
}
