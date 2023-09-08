package y92;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.view.View;
import android.widget.ImageView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.multitask.model.MultiTaskInfo;
import fy3.C32224a;
import gy3.C87413o;
import ic0.C98661k;
import jq3.C60905o;
import rx3.C13598b0;

/* renamed from: y92.d */
public final class C66587d implements C98661k {

    /* renamed from: a */
    public final /* synthetic */ C66590e f191479a;

    /* renamed from: b */
    public final /* synthetic */ C60905o f191480b;

    /* renamed from: c */
    public final /* synthetic */ String f191481c;

    /* renamed from: d */
    public final /* synthetic */ ImageView f191482d;

    /* renamed from: e */
    public final /* synthetic */ MultiTaskInfo f191483e;

    /* renamed from: f */
    public final /* synthetic */ ImageView f191484f;

    /* renamed from: g */
    public final /* synthetic */ View f191485g;

    /* renamed from: y92.d$a */
    public static final class C66588a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ ImageView f191486d;

        /* renamed from: e */
        public final /* synthetic */ Matrix f191487e;

        /* renamed from: f */
        public final /* synthetic */ Bitmap f191488f;

        /* renamed from: g */
        public final /* synthetic */ C66590e f191489g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C66588a(ImageView imageView, Matrix matrix, Bitmap bitmap, C66590e eVar) {
            super(0);
            this.f191486d = imageView;
            this.f191487e = matrix;
            this.f191488f = bitmap;
            this.f191489g = eVar;
        }

        public Object invoke() {
            this.f191486d.setImageMatrix(this.f191487e);
            this.f191486d.setImageBitmap(this.f191488f);
            this.f191489g.mo90638m(this.f191488f, this.f191486d);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: y92.d$b */
    public static final class C66589b extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ MultiTaskInfo f191490d;

        /* renamed from: e */
        public final /* synthetic */ ImageView f191491e;

        /* renamed from: f */
        public final /* synthetic */ ImageView f191492f;

        /* renamed from: g */
        public final /* synthetic */ View f191493g;

        /* renamed from: h */
        public final /* synthetic */ C60905o f191494h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C66589b(MultiTaskInfo multiTaskInfo, ImageView imageView, ImageView imageView2, View view, C60905o oVar) {
            super(0);
            this.f191490d = multiTaskInfo;
            this.f191491e = imageView;
            this.f191492f = imageView2;
            this.f191493g = view;
            this.f191494h = oVar;
        }

        public Object invoke() {
            this.f191490d.mo80305m2().f183758n = true;
            this.f191491e.setVisibility(0);
            this.f191492f.setVisibility(8);
            this.f191493g.setBackgroundColor(this.f191494h.f173499A.getResources().getColor(C0966R.color.f356958a60));
            ImageView imageView = this.f191491e;
            int i = this.f191490d.field_type;
            imageView.setImageResource(i != 1 ? i != 8 ? i != 22 ? i != 3 ? i != 4 ? C0966R.raw.icons_filled_link : C0966R.raw.icons_filled_documentation : C0966R.raw.bottomsheet_icon_fav : C0966R.raw.icons_filled_play2 : C0966R.raw.icons_filled_news : C0966R.raw.icons_filled_mini_program2);
            return C13598b0.f38549a;
        }
    }

    public C66587d(C66590e eVar, C60905o oVar, String str, ImageView imageView, MultiTaskInfo multiTaskInfo, ImageView imageView2, View view) {
        this.f191479a = eVar;
        this.f191480b = oVar;
        this.f191481c = str;
        this.f191482d = imageView;
        this.f191483e = multiTaskInfo;
        this.f191484f = imageView2;
        this.f191485g = view;
    }

    /* JADX WARNING: type inference failed for: r10v8, types: [rx3.b0] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo6935a(java.lang.String r7, android.view.View r8, android.graphics.Bitmap r9, java.lang.Object[] r10) {
        /*
            r6 = this;
            boolean r7 = r8 instanceof android.widget.ImageView
            r10 = 0
            if (r7 == 0) goto L_0x0008
            android.widget.ImageView r8 = (android.widget.ImageView) r8
            goto L_0x0009
        L_0x0008:
            r8 = r10
        L_0x0009:
            y92.e r7 = r6.f191479a
            jq3.o r0 = r6.f191480b
            if (r8 == 0) goto L_0x0078
            if (r9 == 0) goto L_0x0078
            java.lang.String r1 = r7.f191497g
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "loadImage callback "
            r2.append(r3)
            int r3 = r8.hashCode()
            r2.append(r3)
            r3 = 32
            r2.append(r3)
            r2.append(r9)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r2)
            androidx.recyclerview.widget.RecyclerView r0 = r0.mo85811C()
            if (r0 == 0) goto L_0x003e
            androidx.recyclerview.widget.RecyclerView$LayoutManager r0 = r0.getLayoutManager()
            goto L_0x003f
        L_0x003e:
            r0 = r10
        L_0x003f:
            boolean r1 = r0 instanceof androidx.recyclerview.widget.GridLayoutManager
            if (r1 == 0) goto L_0x0046
            r10 = r0
            androidx.recyclerview.widget.GridLayoutManager r10 = (androidx.recyclerview.widget.GridLayoutManager) r10
        L_0x0046:
            if (r10 == 0) goto L_0x004b
            int r10 = r10.f44669w
            goto L_0x004c
        L_0x004b:
            r10 = 1
        L_0x004c:
            t92.a$a r0 = t92.C64212a.f181991a
            r0.getClass()
            int r0 = t92.C64212a.C64213a.f181993b
            int r1 = r10 + 1
            int r0 = r0 * r1
            int r1 = com.tencent.p014mm.p136ui.C85875k4.m106182g()
            int r1 = r1 - r0
            float r0 = (float) r1
            float r10 = (float) r10
            int r1 = r9.getWidth()
            float r1 = (float) r1
            float r10 = r10 * r1
            float r0 = r0 / r10
            android.graphics.Matrix r10 = new android.graphics.Matrix
            r10.<init>()
            r10.setScale(r0, r0)
            y92.d$a r0 = new y92.d$a
            r0.<init>(r8, r10, r9, r7)
            o40.C61926c.m72668M(r0)
            rx3.b0 r10 = rx3.C13598b0.f38549a
        L_0x0078:
            if (r10 != 0) goto L_0x0096
            java.lang.String r7 = r6.f191481c
            android.widget.ImageView r3 = r6.f191482d
            com.tencent.mm.plugin.multitask.model.MultiTaskInfo r1 = r6.f191483e
            android.widget.ImageView r2 = r6.f191484f
            android.view.View r4 = r6.f191485g
            jq3.o r5 = r6.f191480b
            gc0.a r8 = gc0.C20828a.m22825b()
            r8.mo32513a(r7, r3)
            y92.d$b r7 = new y92.d$b
            r0 = r7
            r0.<init>(r1, r2, r3, r4, r5)
            o40.C61926c.m72668M(r7)
        L_0x0096:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: y92.C66587d.mo6935a(java.lang.String, android.view.View, android.graphics.Bitmap, java.lang.Object[]):void");
    }
}
