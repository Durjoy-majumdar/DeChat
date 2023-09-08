package sk1;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.magicbrush.plugin.scl.view.MagicSclViewContainer;
import com.tencent.p014mm.sdk.platformtools.Log;
import g70.C87164i;
import gy3.C8480h;
import gy3.C87412m;
import i70.C87667c;
import java.util.List;
import jq3.C60896i;
import jq3.C60905o;
import jq3.C9493c;
import pe3.C89349b;
import sx3.C110818d0;
import te3.C64374fs1;

/* renamed from: sk1.e */
public final class C63951e extends C60896i<C63953g> {

    /* renamed from: e */
    public final String f181278e = "GameTogetherCardConvert";

    /* renamed from: c */
    public int mo43c() {
        return C0966R.C0971layout.d1j;
    }

    /* renamed from: e */
    public void mo44e(C60905o oVar, C9493c cVar, int i, int i2, boolean z, List list) {
        C64374fs1 fs12;
        C87667c<?, ?>.a aVar;
        C87164i frameSet;
        C64374fs1 fs13;
        C60905o oVar2 = oVar;
        C63953g gVar = (C63953g) cVar;
        C87412m.m108594g(oVar, "holder");
        C87412m.m108594g(gVar, "item");
        Object tag = oVar2.f44854d.getTag();
        String str = null;
        MagicSclViewContainer magicSclViewContainer = tag instanceof MagicSclViewContainer ? (MagicSclViewContainer) tag : null;
        C64374fs1 fs14 = gVar.f181280e;
        String str2 = fs14 != null ? fs14.f183222g : null;
        String str3 = this.f181278e;
        StringBuilder sb = new StringBuilder();
        sb.append("onBind, pos: ");
        sb.append(i);
        sb.append(" type:");
        sb.append(i2);
        sb.append(' ');
        sb.append(str2);
        sb.append(" old:");
        sb.append(magicSclViewContainer != null ? magicSclViewContainer.getFrameSet() : null);
        Log.m105924i(str3, sb.toString());
        Object N = list != null ? C110818d0.m150916N(list) : null;
        String str4 = N instanceof String ? (String) N : null;
        if (C87412m.m108589b(str4, "checkDataChange")) {
            String str5 = this.f181278e;
            Log.m105924i(str5, "payload:" + str4 + " do refresh");
            C87667c<?, ?>.a aVar2 = gVar.f181281f;
            if (aVar2 != null && (fs13 = gVar.f181280e) != null) {
                mo88738j(fs13, aVar2);
                return;
            }
            return;
        }
        View view = oVar2.f44854d;
        C87412m.m108592e(view, "null cannot be cast to non-null type android.view.ViewGroup");
        ViewGroup viewGroup = (ViewGroup) view;
        ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
        C87412m.m108592e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        int width = oVar.mo85811C().getWidth();
        layoutParams.width = width;
        C64374fs1 fs15 = gVar.f181280e;
        boolean z2 = true;
        layoutParams.height = width / (fs15 != null ? Float.valueOf(fs15.f183219d) : 1).intValue();
        viewGroup.setLayoutParams(layoutParams);
        String str6 = (magicSclViewContainer == null || (frameSet = magicSclViewContainer.getFrameSet()) == null) ? null : frameSet.f252785a;
        C64374fs1 fs16 = gVar.f181280e;
        if (!C87412m.m108589b(str6, fs16 != null ? fs16.f183222g : null)) {
            String str7 = this.f181278e;
            StringBuilder sb4 = new StringBuilder();
            sb4.append("unbind old frameSet: ");
            sb4.append(magicSclViewContainer != null ? magicSclViewContainer.getFrameSet() : null);
            Log.m105924i(str7, sb4.toString());
            if (magicSclViewContainer != null) {
                magicSclViewContainer.mo76548e();
            }
            viewGroup.removeView(magicSclViewContainer);
            viewGroup.setTag((Object) null);
            C64374fs1 fs17 = gVar.f181280e;
            if (fs17 != null && (aVar = gVar.f181281f) != null) {
                String str8 = fs17.f183222g;
                if (!(str8 == null || str8.length() == 0)) {
                    String str9 = this.f181278e;
                    Log.m105924i(str9, "createFrameSetView " + fs17.f183222g + ' ' + aVar);
                    Context context = viewGroup.getContext();
                    C87412m.m108593f(context, "container.context");
                    MagicSclViewContainer magicSclViewContainer2 = new MagicSclViewContainer(context, (AttributeSet) null, 0, 6, (C8480h) null);
                    magicSclViewContainer2.setUnbindFrameSetOnDetach(false);
                    String str10 = fs17.f183222g;
                    if (str10 != null) {
                        magicSclViewContainer2.f157377h = str10;
                    }
                    magicSclViewContainer2.setId(View.generateViewId());
                    viewGroup.addView(magicSclViewContainer2, new ConstraintLayout.LayoutParams(-1, -1));
                    viewGroup.setTag(magicSclViewContainer2);
                    magicSclViewContainer2.mo76544a(aVar);
                    magicSclViewContainer2.bringToFront();
                    String str11 = fs17.f183222g;
                    C89349b bVar = fs17.f183220e;
                    if (bVar != null) {
                        str = bVar.mo123705h();
                    }
                    String str12 = this.f181278e;
                    Log.m105918d(str12, "playTogetherData " + str11 + " data:" + str + " frameSetView:" + magicSclViewContainer2.getId());
                    if (str11 != null && str != null) {
                        if (str11.length() > 0) {
                            if (str.length() <= 0) {
                                z2 = false;
                            }
                            if (z2) {
                                C87667c.C87668a.m109055b(aVar, str, str11, (String) null, 4, (Object) null);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        C87667c<?, ?>.a aVar3 = gVar.f181281f;
        if (aVar3 != null && (fs12 = gVar.f181280e) != null) {
            mo88738j(fs12, aVar3);
        }
    }

    /* renamed from: f */
    public void mo45f(RecyclerView recyclerView, C60905o oVar, int i) {
        C87412m.m108594g(recyclerView, "recyclerView");
        C87412m.m108594g(oVar, "holder");
        String str = this.f181278e;
        Log.m105924i(str, "onCreate, type: " + i);
    }

    /* renamed from: j */
    public final void mo88738j(C64374fs1 fs12, C87667c<?, ?>.a aVar) {
        Log.m105924i(this.f181278e, "updateFrameSetView");
        String str = fs12.f183222g;
        C89349b bVar = fs12.f183220e;
        String h = bVar != null ? bVar.mo123705h() : null;
        String str2 = this.f181278e;
        Log.m105918d(str2, "frameSetName:" + str + " playTogetherData data:" + h + ' ');
        if (!(str == null || h == null)) {
            boolean z = true;
            if (str.length() > 0) {
                if (h.length() <= 0) {
                    z = false;
                }
                if (z) {
                    C87667c.C87668a.m109055b(aVar, h, str, (String) null, 4, (Object) null);
                }
            }
        }
        aVar.mo122103f();
    }
}
