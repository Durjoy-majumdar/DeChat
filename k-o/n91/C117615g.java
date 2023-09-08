package n91;

import android.content.res.Resources;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewParent;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.xweb.file.XVFSFile;
import e91.C116711b;
import gy3.C8480h;
import gy3.C87412m;
import java.util.List;
import te3.xr4;
import te3.yr4;
import z04.C112550d0;
import z04.C112551y;

/* renamed from: n91.g */
public final class C117615g {

    /* renamed from: a */
    public static final C117616a f351847a = new C117616a((C8480h) null);

    /* renamed from: n91.g$a */
    public static final class C117616a {
        public C117616a(C8480h hVar) {
        }

        /* renamed from: a */
        public final String mo182334a(int i) {
            String valueOf = String.valueOf(i);
            if (C116711b.m164591p(valueOf)) {
                String s = C116711b.m164594s(i);
                C87412m.m108593f(s, "toHexString(viewId)");
                return s;
            }
            try {
                String s2 = C116711b.m164594s(i);
                C87412m.m108593f(s2, "toHexString(viewId)");
                return s2;
            } catch (Exception unused) {
                return valueOf;
            }
        }

        /* renamed from: b */
        public final String mo182335b(View view) {
            if (view == null) {
                return null;
            }
            if (-1 == view.getId()) {
                return "-1";
            }
            try {
                String resourceName = view.getResources().getResourceName(view.getId());
                if (resourceName == null) {
                    return mo182334a(view.getId());
                }
                List U = C112550d0.m153785U(C112551y.m153814n(resourceName, "/", XVFSFile.PATH_SEPARATOR, false), new String[]{XVFSFile.PATH_SEPARATOR}, false, 0, 6, (Object) null);
                return "R:" + ((String) U.get(1)) + XVFSFile.PATH_SEPARATOR_CHAR + ((String) U.get(2));
            } catch (Resources.NotFoundException unused) {
                return mo182334a(view.getId());
            }
        }

        /* renamed from: c */
        public final String mo182336c(View view) {
            C87412m.m108594g(view, "view");
            StringBuilder sb = new StringBuilder();
            sb.append(C116711b.m164583h(view.getClass().getName()));
            ViewParent parent = view.getParent();
            while (parent != null && (parent instanceof View)) {
                sb.append("|");
                sb.append(C116711b.m164583h(parent.getClass().getName()));
                parent = ((View) parent).getParent();
            }
            String sb4 = sb.toString();
            C87412m.m108593f(sb4, "viewPath.toString()");
            return sb4;
        }

        /* renamed from: d */
        public final boolean mo182337d(String str, String str2) {
            String h;
            String h2;
            if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str) || (h = C116711b.m164583h(str2)) == null || (h2 = C116711b.m164583h(str)) == null) {
                return true;
            }
            Log.m105924i("HABBYGE-MALI.ViewUtil", "isViewCallerOk: " + h + ", " + h2);
            if (C112551y.m153808h(h, "$", false, 2, (Object) null)) {
                if (!C112551y.m153819s(h2, h, false)) {
                    return false;
                }
            } else if (!C87412m.m108589b(h, h2)) {
                return false;
            }
            return true;
        }

        /* renamed from: e */
        public final boolean mo182338e(xr4 xr4, yr4 yr4) {
            C87412m.m108594g(xr4, "viewNode");
            C87412m.m108594g(yr4, "viewOp");
            Log.m105924i("HABBYGE-MALI.ViewUtil", "viewEqual: " + xr4.f354547d + ", " + yr4.f354607d + ", " + xr4.f354548e + ", " + yr4.f354612i);
            if (C87412m.m108589b(xr4.f354547d, yr4.f354607d) || C87412m.m108589b(xr4.f354548e, yr4.f354612i)) {
                return mo182337d(xr4.f354551h, yr4.f354613j);
            }
            return false;
        }
    }
}
