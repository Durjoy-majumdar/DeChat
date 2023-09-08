package r23;

import android.content.Context;
import android.graphics.Canvas;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74933u4;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.List;
import kg3.C76577a;
import sx3.C110818d0;
import u23.C111119f;

/* renamed from: r23.e */
public final class C110499e extends RecyclerView.C0129l {

    /* renamed from: d */
    public final Context f330411d;

    /* renamed from: e */
    public final C111119f f330412e;

    /* renamed from: f */
    public int f330413f;

    /* renamed from: g */
    public final int f330414g;

    /* renamed from: h */
    public final int f330415h;

    /* renamed from: i */
    public final List<C110500a> f330416i = new ArrayList();

    /* renamed from: j */
    public final List<Boolean> f330417j = new ArrayList();

    /* renamed from: n */
    public final int f330418n;

    /* renamed from: o */
    public int f330419o;

    /* renamed from: r23.e$a */
    public final class C110500a {

        /* renamed from: a */
        public int f330420a;

        /* renamed from: b */
        public float f330421b;

        /* renamed from: c */
        public float f330422c;

        public C110500a(C110499e eVar, int i, float f, float f2) {
            this.f330420a = i;
            this.f330421b = f;
            this.f330422c = f2;
        }
    }

    public C110499e(Context context, C111119f fVar) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(fVar, "adapter");
        this.f330411d = context;
        this.f330412e = fVar;
        int b = C76577a.m92151b(context, 22);
        this.f330414g = b;
        this.f330415h = b / 2;
        this.f330418n = C76577a.m92151b(context, 16);
        this.f330419o = -1;
    }

    /* renamed from: i */
    public void mo123i(Canvas canvas, RecyclerView recyclerView, RecyclerView.C16628w wVar) {
        C87412m.m108594g(canvas, "c");
        C87412m.m108594g(recyclerView, "parent");
        C87412m.m108594g(wVar, "state");
        int itemCount = this.f330412e.getItemCount();
        this.f330413f = 0;
        int childCount = recyclerView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = recyclerView.getChildAt(i);
            int N0 = recyclerView.mo17029N0(childAt);
            if (N0 > 1 && N0 < itemCount - 1) {
                int i2 = this.f330419o;
                if (i2 >= 0) {
                    if (!(N0 <= i2 + 2 && i2 + 1 <= N0)) {
                    }
                }
                int left = childAt.getLeft();
                int i3 = N0 - 2;
                Boolean bool = (Boolean) C110818d0.m150917O(this.f330417j, i3);
                boolean booleanValue = bool != null ? bool.booleanValue() : false;
                View inflate = LayoutInflater.from(this.f330411d).inflate(C0966R.C0971layout.ccf, recyclerView, false);
                ImageView imageView = (ImageView) inflate.findViewById(C0966R.C0970id.l_k);
                Context context = this.f330411d;
                imageView.setImageDrawable(C74933u4.m89768e(context, C0966R.raw.icons_filled_transform, context.getResources().getColor(booleanValue ? C0966R.color.f2960ag : C0966R.color.BW_50)));
                int i4 = this.f330414g;
                inflate.measure(i4, i4);
                int i5 = this.f330414g;
                inflate.layout(0, 0, i5, i5);
                float f = (float) left;
                int i6 = this.f330415h;
                float f2 = f - ((float) i6);
                float f3 = f + ((float) i6);
                canvas.save();
                canvas.translate(f2, ((float) (recyclerView.getHeight() - this.f330414g)) / 2.0f);
                inflate.draw(canvas);
                canvas.restore();
                if (this.f330413f < ((ArrayList) this.f330416i).size()) {
                    C110500a aVar = (C110500a) ((ArrayList) this.f330416i).get(this.f330413f);
                    int i7 = this.f330418n;
                    aVar.f330420a = i3;
                    aVar.f330421b = f2 - ((float) i7);
                    aVar.f330422c = f3 + ((float) i7);
                } else {
                    List<C110500a> list = this.f330416i;
                    int i8 = this.f330418n;
                    ((ArrayList) list).add(new C110500a(this, i3, f2 - ((float) i8), f3 + ((float) i8)));
                }
                this.f330413f++;
            }
        }
    }
}
