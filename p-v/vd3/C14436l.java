package vd3;

import android.widget.LinearLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import gy3.C8480h;
import gy3.C87412m;
import java.util.Map;
import rx3.C13604l;
import sx3.C90364q0;

/* renamed from: vd3.l */
public final class C14436l extends LinearLayout {

    /* renamed from: d */
    public static final Map<String, Integer> f40050d;

    /* renamed from: vd3.l$a */
    public static final class C14437a {
        public C14437a(C8480h hVar) {
        }

        /* renamed from: a */
        public static final String m13718a(C14437a aVar, int i) {
            aVar.getClass();
            String string = MMApplicationContext.getString(i);
            C87412m.m108593f(string, "getString(resId)");
            return string;
        }
    }

    static {
        C14437a aVar = new C14437a((C8480h) null);
        String a = C14437a.m13718a(aVar, C0966R.string.lnj);
        Integer valueOf = Integer.valueOf(C0966R.raw.icons_outlined_pencil);
        String a2 = C14437a.m13718a(aVar, C0966R.string.lnh);
        Integer valueOf2 = Integer.valueOf(C0966R.raw.icons_outlined_max_window);
        f40050d = C90364q0.m113147f(new C13604l(a, valueOf), new C13604l(a2, valueOf2), new C13604l(C14437a.m13718a(aVar, C0966R.string.lnk), Integer.valueOf(C0966R.raw.icons_outlined_copy)), new C13604l(C14437a.m13718a(aVar, C0966R.string.lnl), valueOf2), new C13604l(C14437a.m13718a(aVar, C0966R.string.lnn), valueOf), new C13604l(C14437a.m13718a(aVar, C0966R.string.lni), Integer.valueOf(C0966R.raw.icons_outlined_album)));
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C14436l(android.content.Context r2, java.lang.String r3, android.util.AttributeSet r4, int r5, int r6, gy3.C8480h r7) {
        /*
            r1 = this;
            r7 = r6 & 4
            r0 = 0
            if (r7 == 0) goto L_0x0006
            r4 = r0
        L_0x0006:
            r6 = r6 & 8
            if (r6 == 0) goto L_0x000b
            r5 = 0
        L_0x000b:
            java.lang.String r6 = "context"
            gy3.C87412m.m108594g(r2, r6)
            java.lang.String r7 = "descString"
            gy3.C87412m.m108594g(r3, r7)
            r1.<init>(r2, r4, r5)
            android.content.Context r2 = r1.getContext()
            android.view.LayoutInflater r2 = android.view.LayoutInflater.from(r2)
            r4 = 2131493409(0x7f0c0221, float:1.8610297E38)
            android.view.View r2 = r2.inflate(r4, r1)
            r4 = 2131315707(0x7f094bfb, float:1.8249875E38)
            android.view.View r4 = r2.findViewById(r4)
            android.widget.TextView r4 = (android.widget.TextView) r4
            r4.setText(r3)
            android.content.Context r5 = r2.getContext()
            gy3.C87412m.m108593f(r5, r6)
            java.lang.String r6 = "window"
            java.lang.Object r6 = r5.getSystemService(r6)
            java.lang.String r7 = "null cannot be cast to non-null type android.view.WindowManager"
            gy3.C87412m.m108592e(r6, r7)
            android.view.WindowManager r6 = (android.view.WindowManager) r6
            android.util.DisplayMetrics r7 = new android.util.DisplayMetrics
            r7.<init>()
            android.view.Display r6 = r6.getDefaultDisplay()
            if (r6 == 0) goto L_0x0056
            r6.getMetrics(r7)
        L_0x0056:
            float r6 = r7.density
            android.content.res.Resources r5 = r5.getResources()
            android.util.DisplayMetrics r5 = r5.getDisplayMetrics()
            float r5 = r5.density
            r7 = 1096810496(0x41600000, float:14.0)
            float r6 = r6 * r7
            float r6 = r6 / r5
            r5 = 1
            r4.setTextSize(r5, r6)
            java.util.Map<java.lang.String, java.lang.Integer> r4 = f40050d
            java.lang.Object r4 = r4.get(r3)
            java.lang.Integer r4 = (java.lang.Integer) r4
            if (r4 == 0) goto L_0x0087
            int r4 = r4.intValue()
            r5 = 2131306751(0x7f0928ff, float:1.823171E38)
            android.view.View r2 = r2.findViewById(r5)
            com.tencent.mm.ui.widget.imageview.WeImageView r2 = (com.tencent.p014mm.p136ui.widget.imageview.WeImageView) r2
            r2.setImageResource(r4)
            rx3.b0 r0 = rx3.C13598b0.f38549a
        L_0x0087:
            if (r0 != 0) goto L_0x009f
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "initView: can't find icon , desc:"
            r2.append(r4)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "MicroMsg.BottomBarClickableItem"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r2)
        L_0x009f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: vd3.C14436l.<init>(android.content.Context, java.lang.String, android.util.AttributeSet, int, int, gy3.h):void");
    }
}
