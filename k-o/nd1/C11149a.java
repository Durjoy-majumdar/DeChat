package nd1;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.TextView;
import bl3.C39818r;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import di3.C86312j;
import gy3.C8480h;
import gy3.C87412m;
import l31.C61212e;
import ls1.C10647i;
import rx3.C13604l;
import sx3.C90364q0;
import xd1.C15644c;

/* renamed from: nd1.a */
public final class C11149a extends C10647i {

    /* renamed from: j */
    public boolean f32926j;

    /* renamed from: k */
    public int f32927k;

    /* renamed from: l */
    public int f32928l;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C11149a(int i, String str, boolean z, int i2, int i3) {
        super(str, i);
        C87412m.m108594g(str, FFmpegMetadataRetriever.METADATA_KEY_TITLE);
        this.f32926j = z;
        this.f32927k = i2;
        this.f32928l = i3;
    }

    /* renamed from: a */
    public int mo3852a() {
        return C0966R.C0971layout.ctj;
    }

    /* renamed from: b */
    public int[] mo3853b() {
        return new int[]{0, 24};
    }

    /* renamed from: d */
    public void mo3855d(boolean z, ViewGroup viewGroup) {
        String str;
        C87412m.m108594g(viewGroup, "tabView");
        if (z && ((this.f32059d || this.f174600a != 0) && this.f32928l == 2)) {
            C39818r rVar = C39818r.f106831a;
            Context context = viewGroup.getContext();
            C87412m.m108593f(context, "tabView.context");
            C15644c cVar = (C15644c) rVar.mo62443b(context).mo62449e(C15644c.class);
            if (cVar != null && cVar.f42301t) {
                int i = this.f32927k;
                if (i == 1) {
                    str = "all_feeds_button_in_poi_half_page";
                } else if (i == 2) {
                    str = "latest_feeds_button_in_poi_half_page";
                }
                ((C61212e) C86312j.m106911c(C61212e.class)).mo86153W7("view_clk", viewGroup, C90364q0.m113147f(new C13604l("is_half_page_expanded", Integer.valueOf(cVar.f42288I)), new C13604l("view_id", str)), 27051);
            }
        }
        super.mo3855d(z, viewGroup);
    }

    /* renamed from: k */
    public void mo3857k(boolean z) {
        TextView textView = this.f32064i;
        if (textView == null) {
            return;
        }
        if (this.f32926j) {
            if (z) {
                textView.setTextColor(textView.getContext().getResources().getColor(C0966R.color.BW_100_Alpha_0_9));
            } else {
                textView.setTextColor(textView.getContext().getResources().getColor(C0966R.color.BW_100_Alpha_0_5));
            }
        } else if (z) {
            textView.setTextColor(textView.getContext().getResources().getColor(C0966R.color.FG_0));
        } else {
            textView.setTextColor(textView.getContext().getResources().getColor(C0966R.color.FG_1));
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C11149a(int i, String str, boolean z, int i2, int i3, int i4, C8480h hVar) {
        this(i, (i4 & 2) != 0 ? "" : str, z, (i4 & 8) != 0 ? -1 : i2, (i4 & 16) != 0 ? -1 : i3);
    }
}
