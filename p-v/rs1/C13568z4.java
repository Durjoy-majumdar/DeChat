package rs1;

import android.app.Activity;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.plugin.FinderCommonFeatureService;
import com.tencent.p014mm.plugin.finder.extension.reddot.C2479n0;
import com.tencent.p014mm.plugin.finder.extension.reddot.C2492u0;
import com.tencent.p014mm.plugin.finder.extension.reddot.C55718s0;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import gy3.C8480h;
import gy3.C87412m;
import kg3.C76577a;
import ky2.C10432i;
import te3.C51978xi1;
import te3.C64586nn1;

/* renamed from: rs1.z4 */
public final class C13568z4 extends C2492u0 {

    /* renamed from: e */
    public final /* synthetic */ C13392r4 f38488e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13568z4(C13392r4 r4Var) {
        super(false, 1, (C8480h) null);
        this.f38488e = r4Var;
    }

    /* renamed from: a */
    public void mo2472a(C2479n0.C2480a aVar) {
        C51978xi1 xi12;
        StringBuilder sb = new StringBuilder();
        sb.append("[MENU_ID_PROFILE] red=");
        boolean z = true;
        sb.append(aVar != null && aVar.f12908a);
        Log.m105924i("Finder.HomeActionBarUIC", sb.toString());
        if (((C10432i) C86312j.m106911c(C10432i.class)).mo10750e()) {
            StringBuilder sb4 = new StringBuilder();
            sb4.append("[MENU_ID_PROFILE] red=");
            if (aVar == null || !aVar.f12908a) {
                z = false;
            }
            sb4.append(z);
            sb4.append(", return for teen mode.");
            Log.m105924i("Finder.HomeActionBarUIC", sb4.toString());
            return;
        }
        ImageView imageView = (ImageView) this.f38488e.findViewById(C0966R.C0970id.hum);
        TextView textView = (TextView) this.f38488e.findViewById(C0966R.C0970id.hul);
        if (aVar != null && aVar.f12908a) {
            C55718s0 s0Var = aVar.f12910c;
            Integer valueOf = (s0Var == null || (xi12 = s0Var.field_ctrInfo) == null) ? null : Integer.valueOf(xi12.f144670e);
            if ((valueOf != null && valueOf.intValue() == 2) || ((valueOf != null && valueOf.intValue() == 1006) || ((valueOf != null && valueOf.intValue() == 1008) || (valueOf != null && valueOf.intValue() == 1)))) {
                C64586nn1 nn12 = aVar.f12909b;
                int i = nn12 != null ? nn12.f184503e : 0;
                C64586nn1 R5 = ((FinderCommonFeatureService) C86312j.m106911c(FinderCommonFeatureService.class)).Nt0().mo77246R5("TLPersonalCenter");
                int i2 = R5 != null ? R5.f184503e : i;
                Log.m105924i("Finder.HomeActionBarUIC", "resultCount:" + i + " count:" + i2);
                C64586nn1 nn13 = aVar.f12909b;
                if (!(nn13 != null && nn13.f184502d == 2) || i2 <= 0) {
                    if (nn13 != null && nn13.f184502d == 1) {
                        if (!(textView != null && textView.getVisibility() == 0)) {
                            if (imageView != null) {
                                imageView.setVisibility(0);
                            }
                            if (textView != null) {
                                textView.setVisibility(4);
                            }
                            this.f38488e.mo12799d3(1);
                            return;
                        }
                        return;
                    }
                    if (imageView != null) {
                        imageView.setVisibility(4);
                    }
                    if (textView != null) {
                        textView.setVisibility(4);
                        return;
                    }
                    return;
                }
                if (imageView != null) {
                    imageView.setVisibility(4);
                }
                if (textView != null) {
                    C13392r4 r4Var = this.f38488e;
                    C85875k4.m106189j0(textView.getPaint(), 0.8f);
                    textView.setTextSize(1, 10.0f);
                    textView.setVisibility(0);
                    textView.setText(String.valueOf(i2));
                    textView.setText(i2 > 999 ? "· · ·" : String.valueOf(i2));
                    r4Var.getClass();
                    ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
                    C87412m.m108592e(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                    FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                    if (i2 < 10) {
                        layoutParams2.setMarginStart(0);
                        layoutParams2.setMarginEnd((int) r4Var.getContext().getResources().getDimension(C0966R.dimen.f3723cd));
                        layoutParams2.gravity = 8388613;
                    } else {
                        layoutParams2.gravity = 8388611;
                        layoutParams2.setMarginStart((int) r4Var.getContext().getResources().getDimension(C0966R.dimen.f3736cp));
                        layoutParams2.setMarginEnd(0);
                    }
                    textView.setLayoutParams(layoutParams2);
                    Activity context = r4Var.getContext();
                    C87412m.m108594g(context, "context");
                    textView.setBackgroundResource(Float.compare(C76577a.m92165p(context), C76577a.m92174y(context)) > 0 ? i2 < 10 ? C0966R.C0969drawable.awm : C0966R.C0969drawable.awp : i2 < 10 ? C0966R.C0969drawable.awn : C0966R.C0969drawable.awo);
                }
                this.f38488e.mo12799d3(1);
                return;
            }
            if (imageView != null) {
                imageView.setVisibility(0);
            }
            if (textView != null) {
                textView.setVisibility(4);
            }
            this.f38488e.mo12799d3(1);
            return;
        }
        if (imageView != null) {
            imageView.setVisibility(4);
        }
        if (textView != null) {
            textView.setVisibility(4);
        }
    }
}
