package lq2;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import lq2.C99586f;
import rq2.C101432s;

/* renamed from: lq2.g */
public class C99587g extends RecyclerView.C16631z {

    /* renamed from: A */
    public FrameLayout f291933A;

    /* renamed from: B */
    public ImageView f291934B;

    /* renamed from: C */
    public ImageView f291935C;

    /* renamed from: D */
    public FrameLayout f291936D;

    /* renamed from: E */
    public ViewGroup f291937E;

    /* renamed from: F */
    public TextView f291938F;

    /* renamed from: G */
    public TextView f291939G;

    /* renamed from: H */
    public LinearLayout f291940H;

    /* renamed from: I */
    public ImageView f291941I;

    /* renamed from: J */
    public TextView f291942J;

    /* renamed from: K */
    public FrameLayout f291943K;

    /* renamed from: L */
    public ImageView f291944L;

    /* renamed from: M */
    public TextView f291945M;

    /* renamed from: z */
    public ImageView f291946z;

    public C99587g(View view, C99586f.C61380a aVar) {
        super(view);
        this.f291946z = (ImageView) view.findViewById(C0966R.C0970id.f359238mm0);
        this.f291933A = (FrameLayout) view.findViewById(C0966R.C0970id.f359240mm2);
        this.f291934B = (ImageView) view.findViewById(C0966R.C0970id.f359239mm1);
        this.f291935C = (ImageView) view.findViewById(C0966R.C0970id.jqy);
        this.f291936D = (FrameLayout) view.findViewById(C0966R.C0970id.jqz);
        this.f291937E = (ViewGroup) view.findViewById(C0966R.C0970id.joc);
        this.f291938F = (TextView) view.findViewById(C0966R.C0970id.knx);
        this.f291939G = (TextView) view.findViewById(C0966R.C0970id.f357845c22);
        this.f291940H = (LinearLayout) view.findViewById(C0966R.C0970id.f2b);
        this.f291941I = (ImageView) view.findViewById(C0966R.C0970id.jpx);
        this.f291942J = (TextView) view.findViewById(C0966R.C0970id.jpy);
        this.f291943K = (FrameLayout) view.findViewById(C0966R.C0970id.alv);
        this.f291944L = (ImageView) view.findViewById(C0966R.C0970id.alt);
        this.f291945M = (TextView) view.findViewById(C0966R.C0970id.amk);
        this.f291943K.setOnClickListener(aVar);
    }

    /* renamed from: y */
    public void mo138962y(int i) {
        SnsMethodCalculate.markStartTimeMs("reset", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardSubItemViewHolder");
        C101432s.m133132n(this.f291946z, false);
        C101432s.m133132n(this.f291934B, false);
        C101432s.m133132n(this.f291937E, false);
        C101432s.m133132n(this.f291938F, false);
        C101432s.m133132n(this.f291939G, false);
        C101432s.m133132n(this.f291941I, false);
        C101432s.m133132n(this.f291942J, false);
        C101432s.m133132n(this.f291943K, false);
        C101432s.m133132n(this.f291944L, false);
        C101432s.m133132n(this.f291945M, false);
        this.f291943K.setTag(Integer.valueOf(i));
        SnsMethodCalculate.markEndTimeMs("reset", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardSubItemViewHolder");
    }
}
