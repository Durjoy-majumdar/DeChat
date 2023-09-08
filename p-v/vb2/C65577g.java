package vb2;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import gy3.C87412m;
import hb2.C8503a;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import kg3.C76577a;
import p385u2.C111105a;

/* renamed from: vb2.g */
public final class C65577g extends RecyclerView.C0129l {

    /* renamed from: d */
    public final Context f188684d;

    /* renamed from: e */
    public int f188685e;

    /* renamed from: f */
    public final int f188686f;

    /* renamed from: g */
    public final List<C65578a> f188687g = new ArrayList();

    /* renamed from: h */
    public final int f188688h;

    /* renamed from: i */
    public final Rect f188689i;

    /* renamed from: j */
    public BitmapDrawable f188690j;

    /* renamed from: n */
    public Drawable f188691n;

    /* renamed from: o */
    public final PorterDuffColorFilter f188692o;

    /* renamed from: p */
    public final PorterDuffColorFilter f188693p;

    /* renamed from: q */
    public final LinkedList<Integer> f188694q;

    /* renamed from: r */
    public boolean f188695r;

    /* renamed from: s */
    public boolean f188696s;

    /* renamed from: vb2.g$a */
    public final class C65578a {

        /* renamed from: a */
        public int f188697a;

        /* renamed from: b */
        public float f188698b;

        /* renamed from: c */
        public float f188699c;

        public C65578a(C65577g gVar, int i, float f, float f2) {
            this.f188697a = i;
            this.f188698b = f;
            this.f188699c = f2;
        }
    }

    public C65577g(Context context) {
        C87412m.m108594g(context, "context");
        this.f188684d = context;
        int b = C76577a.m92151b(context, 22);
        this.f188686f = b;
        this.f188688h = C76577a.m92151b(context, 16);
        int b2 = C76577a.m92151b(context, 3);
        this.f188689i = new Rect();
        this.f188690j = new BitmapDrawable(context.getResources(), BitmapUtil.getBitmapNative((int) C0966R.raw.icons_filled_transform, context.getResources().getDisplayMetrics().density));
        Object obj = C111105a.f332697a;
        Drawable b3 = C111105a.C111110c.m151511b(context, C0966R.C0969drawable.cja);
        C87412m.m108591d(b3);
        this.f188691n = b3;
        this.f188692o = new PorterDuffColorFilter(C111105a.m151500b(context, C0966R.color.f2960ag), PorterDuff.Mode.SRC_ATOP);
        this.f188693p = new PorterDuffColorFilter(C111105a.m151500b(context, C0966R.color.BW_50), PorterDuff.Mode.SRC_ATOP);
        this.f188694q = new LinkedList<>();
        this.f188695r = true;
        this.f188696s = true;
        this.f188691n.setBounds(0, 0, b, b);
        int i = b - b2;
        this.f188690j.setBounds(b2, b2, i, i);
    }

    /* renamed from: i */
    public void mo123i(Canvas canvas, RecyclerView recyclerView, RecyclerView.C16628w wVar) {
        C87412m.m108594g(canvas, "canvas");
        C87412m.m108594g(recyclerView, "parent");
        C87412m.m108594g(wVar, "state");
        if (this.f188695r && (!C8503a.f27530f.isEmpty())) {
            RecyclerView.C16613e adapter = recyclerView.getAdapter();
            C87412m.m108592e(adapter, "null cannot be cast to non-null type com.tencent.mm.plugin.mv.ui.widget.MvTracksAdapter");
            int size = ((C65567d) adapter).f188664e.getTracks().size();
            this.f188685e = 0;
            int childCount = recyclerView.getChildCount();
            int i = 0;
            while (i < childCount) {
                View childAt = recyclerView.getChildAt(i);
                int N0 = recyclerView.mo17029N0(childAt) - 1;
                RecyclerView.m15804R0(childAt, this.f188689i);
                if (this.f188696s || N0 != size - 1) {
                    if (N0 >= 0 && N0 < size) {
                        float right = (float) ((this.f188689i.right + childAt.getRight()) / 2);
                        float f = (float) this.f188686f;
                        float f2 = right - (f / 2.0f);
                        float f3 = f + f2;
                        canvas.save();
                        canvas.translate(f2, ((float) ((childAt.getTop() + childAt.getBottom()) - this.f188686f)) / 2.0f);
                        this.f188691n.draw(canvas);
                        this.f188690j.setColorFilter(this.f188694q.contains(Integer.valueOf(N0)) ? this.f188692o : this.f188693p);
                        this.f188690j.draw(canvas);
                        canvas.restore();
                        if (this.f188685e < ((ArrayList) this.f188687g).size()) {
                            C65578a aVar = (C65578a) ((ArrayList) this.f188687g).get(this.f188685e);
                            float f4 = (float) this.f188688h;
                            aVar.f188697a = N0;
                            aVar.f188698b = f2 - f4;
                            aVar.f188699c = f3 + f4;
                        } else {
                            List<C65578a> list = this.f188687g;
                            float f5 = (float) this.f188688h;
                            ((ArrayList) list).add(new C65578a(this, N0, f2 - f5, f3 + f5));
                        }
                        this.f188685e++;
                    }
                    i++;
                } else {
                    return;
                }
            }
        }
    }
}
