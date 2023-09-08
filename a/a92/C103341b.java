package a92;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.plugin.voip.p475ui.C71599n0;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import fy3.C32227p;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import p1162x2.C112020b;
import rx3.C13598b0;
import v82.C111418b0;

/* renamed from: a92.b */
public final class C103341b extends RecyclerView.C16613e<C67021d> implements View.OnClickListener {

    /* renamed from: q */
    public static final float f304723q = ((float) C111418b0.f333554o);

    /* renamed from: r */
    public static final float f304724r = ((float) C111418b0.f333552m);

    /* renamed from: s */
    public static final float f304725s = ((float) C111418b0.f333546g);

    /* renamed from: t */
    public static final float f304726t = ((float) C76577a.m92151b(MMApplicationContext.getContext(), 2));

    /* renamed from: d */
    public RecyclerView f304727d;

    /* renamed from: e */
    public Context f304728e;

    /* renamed from: f */
    public CopyOnWriteArrayList<Bitmap> f304729f = new CopyOnWriteArrayList<>();

    /* renamed from: g */
    public int f304730g = -1;

    /* renamed from: h */
    public int f304731h = -1;

    /* renamed from: i */
    public int f304732i = -1;

    /* renamed from: j */
    public float f304733j = f304723q;

    /* renamed from: n */
    public float f304734n = f304724r;

    /* renamed from: o */
    public C32227p<? super View, ? super Integer, C13598b0> f304735o;

    /* renamed from: p */
    public boolean f304736p;

    public C103341b(RecyclerView recyclerView, Context context) {
        C87412m.m108594g(context, "context");
        this.f304727d = recyclerView;
        this.f304728e = context;
    }

    public int getItemCount() {
        return this.f304729f.size();
    }

    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        C87412m.m108594g(recyclerView, "recyclerView");
        super.onAttachedToRecyclerView(recyclerView);
        this.f304736p = true;
    }

    public void onBindViewHolder(RecyclerView.C16631z zVar, int i) {
        C67021d dVar = (C67021d) zVar;
        C87412m.m108594g(dVar, "holder");
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams((int) this.f304733j, (int) this.f304734n);
        ImageView imageView = dVar.f192515A;
        if (imageView != null) {
            imageView.setLayoutParams(layoutParams);
        }
        WeImageView weImageView = dVar.f192516z;
        if (weImageView != null) {
            weImageView.setLayoutParams(layoutParams);
        }
        if (this.f304732i != i) {
            ImageView imageView2 = dVar.f192515A;
            if (imageView2 != null) {
                imageView2.setVisibility(0);
            }
        } else {
            ImageView imageView3 = dVar.f192515A;
            if (imageView3 != null) {
                imageView3.setVisibility(8);
            }
        }
        if (this.f304736p) {
            this.f304736p = false;
            RecyclerView recyclerView = this.f304727d;
            if (recyclerView != null) {
                int i2 = this.f304732i;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(Integer.valueOf(i2));
                RecyclerView recyclerView2 = recyclerView;
                C117292a.m165358d(recyclerView2, aVar.mo10232b(), "com/tencent/mm/plugin/multitalk/ui/widget/projector/recyclerview/ScreenProjectThumbLayoutAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/multitalk/ui/widget/projector/recyclerview/ScreenProjectThumbnailLayoutHolder;I)V", "Undefined", "smoothScrollToPosition", "(I)V");
                recyclerView.mo17149t1(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(recyclerView2, "com/tencent/mm/plugin/multitalk/ui/widget/projector/recyclerview/ScreenProjectThumbLayoutAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/multitalk/ui/widget/projector/recyclerview/ScreenProjectThumbnailLayoutHolder;I)V", "Undefined", "smoothScrollToPosition", "(I)V");
            }
        }
        if ((!this.f304729f.isEmpty()) && i < this.f304729f.size()) {
            C112020b bVar = new C112020b(this.f304728e.getResources(), this.f304729f.get(i));
            bVar.f335333d.setAntiAlias(true);
            bVar.mo163680c(f304726t);
            WeImageView weImageView2 = dVar.f192516z;
            if (weImageView2 != null) {
                weImageView2.setBackground(bVar);
            }
        }
        WeImageView weImageView3 = dVar.f192516z;
        if (weImageView3 != null) {
            weImageView3.setClipToOutline(true);
        }
        WeImageView weImageView4 = dVar.f192516z;
        if (weImageView4 != null) {
            weImageView4.setOutlineProvider(new C71599n0(f304726t));
        }
        ImageView imageView4 = dVar.f192515A;
        if (imageView4 != null) {
            imageView4.setClipToOutline(true);
        }
        ImageView imageView5 = dVar.f192515A;
        if (imageView5 != null) {
            imageView5.setOutlineProvider(new C71599n0(f304726t));
        }
        dVar.f44854d.setTag(Integer.valueOf(i));
        dVar.f44854d.setClipToOutline(true);
        dVar.f44854d.setOutlineProvider(new C71599n0(f304726t));
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/multitalk/ui/widget/projector/recyclerview/ScreenProjectThumbLayoutAdapter", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C87412m.m108594g(view, "v");
        C32227p<? super View, ? super Integer, C13598b0> pVar = this.f304735o;
        if (pVar != null) {
            Object tag = view.getTag();
            C87412m.m108592e(tag, "null cannot be cast to non-null type kotlin.Int");
            C13598b0 invoke = pVar.invoke(view, (Integer) tag);
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/multitalk/ui/widget/projector/recyclerview/ScreenProjectThumbLayoutAdapter", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    public RecyclerView.C16631z onCreateViewHolder(ViewGroup viewGroup, int i) {
        C87412m.m108594g(viewGroup, "parent");
        View inflate = LayoutInflater.from(this.f304728e).inflate(C0966R.C0971layout.f359901bi0, viewGroup, false);
        inflate.setOnClickListener(this);
        return new C67021d(inflate);
    }
}
