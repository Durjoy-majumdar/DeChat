package y92;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.RoundCornerImageView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter;
import gy3.C87412m;
import java.util.List;
import jq3.C60905o;
import jq3.C9493c;
import k60.C99101e;
import rx3.C13598b0;
import te3.C64459j13;
import v92.C65558a;
import w92.C65943a;
import x92.C15628a;

/* renamed from: y92.a */
public final class C66584a extends C66590e {

    /* renamed from: j */
    public final String f191475j = "MicroMsg.AppBrandMinusScreenRoundCornerConvert";

    /* renamed from: n */
    public final int f191476n = 4;

    public C66584a(C65943a aVar) {
        super(C0966R.C0971layout.bbn, aVar);
    }

    /* renamed from: d */
    public void mo2292d(RecyclerView recyclerView, WxRecyclerAdapter<?> wxRecyclerAdapter) {
        C87412m.m108594g(recyclerView, "recyclerView");
        C87412m.m108594g(wxRecyclerAdapter, "adapter");
        super.mo2292d(recyclerView, wxRecyclerAdapter);
    }

    /* renamed from: e */
    public void mo44e(C60905o oVar, C9493c cVar, int i, int i2, boolean z, List list) {
        String str;
        C65558a aVar = (C65558a) cVar;
        C87412m.m108594g(oVar, "holder");
        C87412m.m108594g(aVar, "item");
        Log.m105918d(this.f191475j, "onBindViewHolder");
        super.mo90637l(oVar, aVar, i, i2, z, list);
        ImageView imageView = (ImageView) oVar.f44854d.findViewById(C0966R.C0970id.h3f);
        TextView textView = (TextView) oVar.f44854d.findViewById(C0966R.C0970id.h3n);
        C64459j13 m2 = aVar.f188631d.mo80305m2();
        C13598b0 b0Var = null;
        if (!Util.isNullOrNil(aVar.f188631d.mo80305m2().f183759o)) {
            C15628a aVar2 = C15628a.f42254a;
            C87412m.m108593f(textView, "nickname");
            String str2 = m2 != null ? m2.f183751d : null;
            if (str2 == null) {
                str2 = "";
            }
            textView.setText(aVar2.mo14374a(textView, str2, this.f191476n));
        }
        imageView.setImageDrawable((Drawable) null);
        C64459j13 m25 = aVar.f188631d.mo80305m2();
        if (!(m25 == null || (str = m25.f183756i) == null)) {
            C99101e.f290571b.mo85957c(str, imageView, this.f191498h);
            b0Var = C13598b0.f38549a;
        }
        if (b0Var == null) {
            RoundCornerImageView roundCornerImageView = (RoundCornerImageView) oVar.f44854d.findViewById(C0966R.C0970id.f357834c01);
            roundCornerImageView.setVisibility(0);
            roundCornerImageView.setImageResource(C0966R.raw.spannable_app_brand_link_logo);
        }
    }

    /* renamed from: f */
    public void mo45f(RecyclerView recyclerView, C60905o oVar, int i) {
        C87412m.m108594g(recyclerView, "recyclerView");
        C87412m.m108594g(oVar, "holder");
        super.mo45f(recyclerView, oVar, i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001b, code lost:
        if ((r5.length() > 0) == true) goto L_0x001f;
     */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String mo90635j(android.content.Context r4, v92.C65558a r5) {
        /*
            r3 = this;
            java.lang.String r0 = "context"
            gy3.C87412m.m108594g(r4, r0)
            java.lang.String r0 = "item"
            gy3.C87412m.m108594g(r5, r0)
            java.lang.String r5 = super.mo90635j(r4, r5)
            r0 = 1
            r1 = 0
            if (r5 == 0) goto L_0x001e
            int r2 = r5.length()
            if (r2 <= 0) goto L_0x001a
            r2 = 1
            goto L_0x001b
        L_0x001a:
            r2 = 0
        L_0x001b:
            if (r2 != r0) goto L_0x001e
            goto L_0x001f
        L_0x001e:
            r0 = 0
        L_0x001f:
            if (r0 == 0) goto L_0x0022
            goto L_0x002d
        L_0x0022:
            android.content.res.Resources r4 = r4.getResources()
            r5 = 2131832903(0x7f113047, float:1.9298873E38)
            java.lang.String r5 = r4.getString(r5)
        L_0x002d:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: y92.C66584a.mo90635j(android.content.Context, v92.a):java.lang.String");
    }
}
