package qk1;

import ak1.C54067f0;
import ak1.C54108o;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import di3.C86312j;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.Iterator;
import kg3.C76577a;
import rx3.C13598b0;
import rx3.C13604l;
import sx3.C90364q0;
import te3.C64311db1;
import z04.C112550d0;
import z04.C112551y;

/* renamed from: qk1.i1 */
public final class C63221i1 extends RecyclerView.C16613e<C63222a> {

    /* renamed from: d */
    public final Context f179400d;

    /* renamed from: e */
    public ArrayList<C63223b> f179401e = new ArrayList<>();

    /* renamed from: f */
    public C32224a<C13598b0> f179402f;

    /* renamed from: g */
    public C32226l<? super Integer, C13598b0> f179403g;

    /* renamed from: h */
    public String f179404h;

    /* renamed from: i */
    public boolean f179405i = true;

    /* renamed from: j */
    public String f179406j;

    /* renamed from: qk1.i1$a */
    public static class C63222a extends RecyclerView.C16631z {

        /* renamed from: A */
        public TextView f179407A;

        /* renamed from: B */
        public FrameLayout f179408B;

        /* renamed from: z */
        public WeImageView f179409z;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C63222a(View view) {
            super(view);
            C87412m.m108594g(view, "itemView");
            View findViewById = view.findViewById(C0966R.C0970id.fty);
            C87412m.m108593f(findViewById, "itemView.findViewById(R.…st_comment_poi_info_icon)");
            this.f179409z = (WeImageView) findViewById;
            View findViewById2 = view.findViewById(C0966R.C0970id.ftv);
            C87412m.m108593f(findViewById2, "itemView.findViewById(R.…e_fast_comment_info_text)");
            this.f179407A = (TextView) findViewById2;
            View findViewById3 = view.findViewById(C0966R.C0970id.ftx);
            C87412m.m108593f(findViewById3, "itemView.findViewById(R.…fast_comment_item_layout)");
            this.f179408B = (FrameLayout) findViewById3;
        }
    }

    /* renamed from: qk1.i1$b */
    public static final class C63223b {

        /* renamed from: a */
        public String f179410a;

        /* renamed from: b */
        public final int f179411b;

        /* renamed from: c */
        public long f179412c;

        public C63223b(String str, int i, long j) {
            C87412m.m108594g(str, FFmpegMetadataRetriever.METADATA_KEY_COMMENT);
            this.f179410a = str;
            this.f179411b = i;
            this.f179412c = j;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C63223b)) {
                return false;
            }
            C63223b bVar = (C63223b) obj;
            return C87412m.m108589b(this.f179410a, bVar.f179410a) && this.f179411b == bVar.f179411b && this.f179412c == bVar.f179412c;
        }

        public int hashCode() {
            long j = this.f179412c;
            return (((this.f179410a.hashCode() * 31) + this.f179411b) * 31) + ((int) (j ^ (j >>> 32)));
        }

        public String toString() {
            return "FinderFastCommentInfo(comment=" + this.f179410a + ", type=" + this.f179411b + ", lastSendTime=" + this.f179412c + ')';
        }
    }

    public C63221i1(Context context) {
        C87412m.m108594g(context, "context");
        this.f179400d = context;
    }

    /* renamed from: F4 */
    public final void mo88128F4(String str) {
        C13598b0 b0Var;
        C63223b bVar;
        boolean z;
        Iterator<C63223b> it = this.f179401e.iterator();
        while (true) {
            b0Var = null;
            if (!it.hasNext()) {
                bVar = null;
                break;
            }
            bVar = it.next();
            if (bVar.f179411b == 0) {
                z = true;
                continue;
            } else {
                z = false;
                continue;
            }
            if (z) {
                break;
            }
        }
        if (bVar != null) {
            int size = this.f179401e.size() - 1;
            if (size < 0) {
                size = 0;
            }
            this.f179404h = str;
            String str2 = this.f179406j;
            if (!(!(str2 == null || str2.length() == 0))) {
                str2 = null;
            }
            if (str2 != null) {
                if (str == null) {
                    this.f179405i = true;
                    String str3 = this.f179401e.get(size).f179410a;
                    String string = MMApplicationContext.getContext().getString(C0966R.string.djn, new Object[]{str2});
                    C87412m.m108593f(string, "getContext().getString(c…pecified_city, localCity)");
                    if (!C87412m.m108589b(str3, C112550d0.m153799i0(string).toString())) {
                        C63223b bVar2 = this.f179401e.get(size);
                        String string2 = MMApplicationContext.getContext().getString(C0966R.string.djn, new Object[]{str2});
                        C87412m.m108593f(string2, "getContext().getString(c…pecified_city, localCity)");
                        String obj = C112550d0.m153799i0(string2).toString();
                        bVar2.getClass();
                        C87412m.m108594g(obj, "<set-?>");
                        bVar2.f179410a = obj;
                        notifyItemChanged(size);
                    }
                } else {
                    this.f179405i = false;
                    String n = C112551y.m153814n(str, "<%@>", str2, false);
                    if (!C87412m.m108589b(this.f179401e.get(size).f179410a, n)) {
                        C63223b bVar3 = this.f179401e.get(size);
                        bVar3.getClass();
                        bVar3.f179410a = n;
                        notifyItemChanged(size);
                    }
                }
                b0Var = C13598b0.f38549a;
            }
            if (b0Var == null) {
                this.f179405i = true;
                C63223b bVar4 = this.f179401e.get(size);
                String string3 = this.f179400d.getResources().getString(C0966R.string.dm8);
                C87412m.m108593f(string3, "context.resources.getStr…ast_comment_location_tip)");
                bVar4.getClass();
                bVar4.f179410a = string3;
            }
            b0Var = C13598b0.f38549a;
        }
        if (b0Var == null) {
            Log.m105924i("FinderLiveFastCommentAdapter", "no poi item");
        }
    }

    /* renamed from: G4 */
    public final void mo88129G4(C64311db1 db12) {
        int size = this.f179401e.size() - 1;
        if (size < 0) {
            size = 0;
        }
        if (db12 != null) {
            String str = db12.f182663f;
            this.f179406j = str;
            if (str != null) {
                String str2 = this.f179404h;
                C13598b0 b0Var = null;
                if (!(!(str2 == null || str2.length() == 0))) {
                    str2 = null;
                }
                if (str2 != null) {
                    this.f179405i = false;
                    String n = C112551y.m153814n(str2, "<%@>", str, false);
                    if (!C87412m.m108589b(this.f179401e.get(size).f179410a, n)) {
                        C63223b bVar = this.f179401e.get(size);
                        bVar.getClass();
                        bVar.f179410a = n;
                        notifyItemChanged(size);
                    }
                    b0Var = C13598b0.f38549a;
                }
                if (b0Var == null) {
                    this.f179405i = true;
                    String str3 = this.f179401e.get(size).f179410a;
                    String string = MMApplicationContext.getContext().getString(C0966R.string.djn, new Object[]{str});
                    C87412m.m108593f(string, "getContext().getString(c…the_specified_city, city)");
                    if (!C87412m.m108589b(str3, C112550d0.m153799i0(string).toString())) {
                        C63223b bVar2 = this.f179401e.get(size);
                        String string2 = MMApplicationContext.getContext().getString(C0966R.string.djn, new Object[]{str});
                        C87412m.m108593f(string2, "getContext().getString(c…the_specified_city, city)");
                        String obj = C112550d0.m153799i0(string2).toString();
                        bVar2.getClass();
                        C87412m.m108594g(obj, "<set-?>");
                        bVar2.f179410a = obj;
                        notifyItemChanged(size);
                    }
                }
            }
        }
    }

    public int getItemCount() {
        return this.f179401e.size();
    }

    public void onBindViewHolder(RecyclerView.C16631z zVar, int i) {
        C63222a aVar = (C63222a) zVar;
        C87412m.m108594g(aVar, "holder");
        C54067f0.C0066n nVar = C54067f0.C0066n.QUICK_REPLY;
        Class cls = C54108o.class;
        if (this.f179401e.get(i).f179411b == 0) {
            ((C54108o) C86312j.m106911c(cls)).mo9602Jz(nVar, C90364q0.m113148g(new C13604l("button_type", "0"), new C13604l("quick_reply_index", String.valueOf(i)), new C13604l("quick_reply_content", this.f179401e.get(i).f179410a)));
            if (this.f179405i) {
                if (aVar.f179409z.getVisibility() == 8) {
                    aVar.f179409z.setVisibility(0);
                }
            } else if (aVar.f179409z.getVisibility() == 0) {
                aVar.f179409z.setVisibility(8);
            }
            aVar.f179408B.setOnClickListener(new C63228j1(i, this));
        } else {
            aVar.f179409z.setVisibility(8);
            ((C54108o) C86312j.m106911c(cls)).mo9602Jz(nVar, C90364q0.m113148g(new C13604l("button_type", "1"), new C13604l("quick_reply_index", String.valueOf(i)), new C13604l("quick_reply_content", this.f179401e.get(i).f179410a)));
            aVar.f179408B.setOnClickListener(new C63231k1(i, this));
        }
        ViewGroup.LayoutParams layoutParams = aVar.f179408B.getLayoutParams();
        C87412m.m108592e(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
        if (i == 0) {
            layoutParams2.setMarginStart(C76577a.m92151b(this.f179400d, 10));
        } else {
            layoutParams2.setMarginStart(C76577a.m92152c(this.f179400d, 0));
        }
        aVar.f179408B.setLayoutParams(layoutParams2);
        aVar.f179407A.setText(this.f179401e.get(i).f179410a);
    }

    public RecyclerView.C16631z onCreateViewHolder(ViewGroup viewGroup, int i) {
        C87412m.m108594g(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C0966R.C0971layout.ah8, viewGroup, false);
        C87412m.m108593f(inflate, "from(parent.context).inf…ment_item, parent, false)");
        return new C63222a(inflate);
    }
}
