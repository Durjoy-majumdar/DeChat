package ja1;

import android.view.View;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import j20.C21153d;
import java.lang.ref.WeakReference;
import java.util.Map;
import n91.C117614e;
import te3.xr4;

/* renamed from: ja1.a */
public final class C21208a {

    /* renamed from: a */
    public static boolean f59982a;

    /* renamed from: b */
    public static final C21209a f59983b = new C21209a();

    /* renamed from: c */
    public static boolean f59984c;

    /* renamed from: ja1.a$a */
    public static final class C21209a implements C21153d {
        /* renamed from: a */
        public void mo32409a(String str, String str2, String str3, Object obj, Object obj2) {
        }

        /* renamed from: b */
        public void mo32410b(String str, String str2, String str3, Object obj, Object[] objArr) {
            if (objArr != null) {
                if (!(objArr.length == 0)) {
                    Integer num = objArr[0];
                    C87412m.m108592e(num, "null cannot be cast to non-null type kotlin.Int");
                    int intValue = num.intValue();
                    C21208a.f59982a = 10 == intValue;
                    C21208a.f59984c = Integer.MAX_VALUE == intValue;
                    xr4 xr4 = new xr4();
                    xr4.f354547d = String.valueOf(intValue);
                    xr4.f354555o = System.currentTimeMillis();
                    xr4.f354548e = xr4.f354547d;
                    xr4.f354549f = "MMPopupWindow$PopupViewContainer";
                    xr4.f354551h = "MMPopupWindow$PopupViewContainer";
                    xr4.f354552i = 1;
                    xr4.f354561u = 0;
                    Log.m105924i("HABBYGE-MALI.SubMenuMonitor", "SubMenuMonitor, viewCallback:\nid=" + xr4.f354547d + "\ntimestamp=" + xr4.f354555o + "\neventId=" + xr4.f354552i);
                    Map<String, WeakReference<View>> map = C117614e.f351842a;
                    C117614e.f351846e.mo33861a((View) null, xr4);
                }
            }
        }
    }
}
