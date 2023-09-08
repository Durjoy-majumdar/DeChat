package lx0;

import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.MMNeat7extView;
import gc0.C20828a;
import gy3.C87412m;
import hc0.C20937c;
import java.util.List;
import jq3.C60896i;
import jq3.C60905o;
import jq3.C9493c;
import kg3.C76577a;
import kw0.C46746a;
import mx0.C47111e;
import te3.C49280eg;

/* renamed from: lx0.b */
public final class C46903b extends C60896i<C47111e> {
    /* renamed from: c */
    public int mo43c() {
        return C0966R.C0971layout.d3o;
    }

    /* renamed from: e */
    public void mo44e(C60905o oVar, C9493c cVar, int i, int i2, boolean z, List list) {
        C60905o oVar2 = oVar;
        C47111e eVar = (C47111e) cVar;
        C87412m.m108594g(oVar2, "holder");
        C87412m.m108594g(eVar, "item");
        super.mo44e(oVar, eVar, i, i2, z, list);
        MMNeat7extView mMNeat7extView = (MMNeat7extView) oVar2.f44854d.findViewById(C0966R.C0970id.f357526ns2);
        TextView textView = (TextView) oVar2.f44854d.findViewById(C0966R.C0970id.f357524ns0);
        String str = eVar.f126587d.f132910f;
        if (str != null) {
            mMNeat7extView.mo104279b(str);
        }
        textView.setText(eVar.f126587d.f132911g);
        C49280eg egVar = eVar.f126587d;
        FrameLayout frameLayout = (FrameLayout) oVar2.f44854d.findViewById(C0966R.C0970id.f357525ns1);
        if (egVar.f132914j == 10) {
            frameLayout.setVisibility(8);
            return;
        }
        frameLayout.setVisibility(0);
        frameLayout.removeAllViews();
        if (egVar.f132914j == 7) {
            ImageView imageView = new ImageView(oVar2.f173499A);
            imageView.setBackgroundColor(C76577a.m92153d(oVar2.f173499A, C0966R.color.f2930d));
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(C76577a.m92151b(oVar2.f173499A, 40), C76577a.m92151b(oVar2.f173499A, 40));
            layoutParams.gravity = 17;
            C46746a.m52038k(C46746a.f125826a, imageView, (float) C76577a.m92151b(oVar2.f173499A, 20), false, false, 12, (Object) null);
            frameLayout.addView(imageView, layoutParams);
            ImageView imageView2 = new ImageView(oVar2.f173499A);
            imageView2.setImageResource(C0966R.raw.biz_voice_playing_icon_black_inner3);
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(C76577a.m92151b(oVar2.f173499A, 20), C76577a.m92151b(oVar2.f173499A, 20));
            layoutParams2.gravity = 17;
            frameLayout.addView(imageView2, layoutParams2);
            return;
        }
        ImageView imageView3 = new ImageView(oVar2.f173499A);
        imageView3.setScaleType(ImageView.ScaleType.CENTER_CROP);
        C46746a.m52038k(C46746a.f125826a, imageView3, (float) C76577a.m92151b(oVar2.f173499A, 2), false, false, 12, (Object) null);
        frameLayout.addView(imageView3, new FrameLayout.LayoutParams(-1, -1));
        C20937c.C20939b bVar = new C20937c.C20939b();
        bVar.f59361q = C0966R.color.f3284m6;
        bVar.f59347c = true;
        bVar.f59345a = true;
        bVar.f59344B = "bizRecentReading";
        C20828a.m22825b().mo32519h(egVar.f132908d, imageView3, bVar.mo32666a());
        int i3 = egVar.f132914j;
        if (i3 == 5) {
            ImageView imageView4 = new ImageView(oVar2.f173499A);
            imageView4.setImageResource(C0966R.C0969drawable.bw9);
            FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(C76577a.m92151b(oVar2.f173499A, 24), C76577a.m92151b(oVar2.f173499A, 24));
            layoutParams3.gravity = 17;
            frameLayout.addView(imageView4, layoutParams3);
        } else if (i3 == 8) {
            ImageView imageView5 = new ImageView(oVar2.f173499A);
            imageView5.setImageResource(C0966R.raw.biz_timeline_pic_1_1);
            FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(C76577a.m92151b(oVar2.f173499A, 16), C76577a.m92151b(oVar2.f173499A, 16));
            layoutParams4.gravity = 8388693;
            layoutParams4.setMargins(0, 0, C76577a.m92151b(oVar2.f173499A, 2), C76577a.m92151b(oVar2.f173499A, 2));
            frameLayout.addView(imageView5, layoutParams4);
        }
    }
}
