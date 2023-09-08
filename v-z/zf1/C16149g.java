package zf1;

import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import gy3.C87412m;
import java.util.List;
import jq3.C60896i;
import jq3.C60905o;
import jq3.C9493c;
import p629ny.C76979h;

/* renamed from: zf1.g */
public final class C16149g extends C60896i<C16151i> {

    /* renamed from: e */
    public final boolean f43340e;

    /* renamed from: f */
    public final String f43341f = "Finder.FinderAlbumFilterConvert";

    public C16149g(boolean z) {
        this.f43340e = z;
    }

    /* renamed from: c */
    public int mo43c() {
        return C0966R.C0971layout.acg;
    }

    /* renamed from: e */
    public void mo44e(C60905o oVar, C9493c cVar, int i, int i2, boolean z, List list) {
        C16151i iVar = (C16151i) cVar;
        C87412m.m108594g(oVar, "holder");
        C87412m.m108594g(iVar, "item");
        TextView textView = (TextView) oVar.mo85812D(C0966R.C0970id.ksp);
        if (textView != null) {
            textView.setText(((C76979h) C86312j.m106911c(C76979h.class)).mo107057T1(oVar.f173499A, iVar.f43344d.f43343b));
        }
        if (iVar.f43345e) {
            if (this.f43340e) {
                if (textView != null) {
                    textView.setTextColor(oVar.f173499A.getResources().getColor(C0966R.color.f2975b6));
                }
            } else if (textView != null) {
                textView.setTextColor(oVar.f173499A.getResources().getColor(C0966R.color.FG_0));
            }
            C85875k4.m106189j0(textView.getPaint(), 0.8f);
        } else {
            if (this.f43340e) {
                if (textView != null) {
                    textView.setTextColor(oVar.f173499A.getResources().getColor(C0966R.color.BW_100_Alpha_0_5));
                }
            } else if (textView != null) {
                textView.setTextColor(oVar.f173499A.getResources().getColor(C0966R.color.FG_1));
            }
            C85875k4.m106189j0(textView.getPaint(), 0.1f);
        }
        String str = this.f43341f;
        Log.m105924i(str, "item hash:" + iVar.hashCode() + ", topic:" + iVar.f43344d.f43343b + ", selected:" + iVar.f43345e);
    }

    /* renamed from: f */
    public void mo45f(RecyclerView recyclerView, C60905o oVar, int i) {
        C87412m.m108594g(recyclerView, "recyclerView");
        C87412m.m108594g(oVar, "holder");
        TextView textView = (TextView) oVar.mo85812D(C0966R.C0970id.ksp);
        if (textView != null) {
            textView.setTextSize(1, 14.0f);
        }
    }
}
