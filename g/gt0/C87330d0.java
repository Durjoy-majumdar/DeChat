package gt0;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import gy3.C87412m;
import java.util.List;
import kg3.C76577a;
import lb0.C88394b;
import mt0.C88844a;
import mt0.C88846b;
import p224ra.C89909e;
import p974hc.C87471a;

/* renamed from: gt0.d0 */
public final class C87330d0 extends RecyclerView.C16613e<C87337f> {

    /* renamed from: d */
    public List<C87331a> f253099d;

    /* renamed from: e */
    public C87332b f253100e;

    /* renamed from: f */
    public C87333c f253101f;

    /* renamed from: gt0.d0$b */
    public interface C87332b {
        /* renamed from: a */
        void mo114555a(C87331a aVar);
    }

    /* renamed from: gt0.d0$c */
    public interface C87333c {
        /* renamed from: a */
        void mo114556a(View view, C87331a aVar, int i);
    }

    /* renamed from: gt0.d0$d */
    public static final class C87334d extends C87337f {

        /* renamed from: D */
        public final TextView f253110D;

        /* renamed from: E */
        public final ImageView f253111E;

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public C87334d(android.view.ViewGroup r4, java.util.List<gt0.C87330d0.C87331a> r5, gt0.C87330d0 r6) {
            /*
                r3 = this;
                java.lang.String r0 = "parent"
                gy3.C87412m.m108594g(r4, r0)
                java.lang.String r0 = "items"
                gy3.C87412m.m108594g(r5, r0)
                java.lang.String r0 = "itemAdapter"
                gy3.C87412m.m108594g(r6, r0)
                android.content.Context r0 = r4.getContext()
                android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
                r1 = 2131493050(0x7f0c00ba, float:1.860957E38)
                r2 = 0
                android.view.View r4 = r0.inflate(r1, r4, r2)
                java.lang.String r0 = "from(parent.context).inf…list_item, parent, false)"
                gy3.C87412m.m108593f(r4, r0)
                r3.<init>(r4, r5, r6)
                android.view.View r4 = r3.f253120z
                r5 = 2131315360(0x7f094aa0, float:1.8249171E38)
                android.view.View r4 = r4.findViewById(r5)
                java.lang.String r5 = "view.findViewById(R.id.title)"
                gy3.C87412m.m108593f(r4, r5)
                android.widget.TextView r4 = (android.widget.TextView) r4
                r3.f253110D = r4
                android.view.View r4 = r3.f253120z
                r5 = 2131313131(0x7f0941eb, float:1.824465E38)
                android.view.View r4 = r4.findViewById(r5)
                java.lang.String r5 = "view.findViewById(R.id.selected)"
                gy3.C87412m.m108593f(r4, r5)
                android.widget.ImageView r4 = (android.widget.ImageView) r4
                r3.f253111E = r4
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: gt0.C87330d0.C87334d.<init>(android.view.ViewGroup, java.util.List, gt0.d0):void");
        }

        /* renamed from: B */
        public void mo121743B(boolean z) {
            if (z) {
                TextView textView = this.f253110D;
                textView.setContentDescription(textView.getText());
                this.f253111E.setVisibility(0);
                ImageView imageView = this.f253111E;
                imageView.setContentDescription(imageView.getContext().getString(C0966R.string.f7881uv));
                return;
            }
            TextView textView2 = this.f253110D;
            textView2.setContentDescription(this.f253110D.getText() + ' ' + this.f253111E.getContext().getString(C0966R.string.f7883ux));
            this.f253111E.setVisibility(4);
        }

        /* renamed from: y */
        public void mo121744y(C87331a aVar) {
            C87412m.m108594g(aVar, "item");
            this.f253110D.setText(aVar.f253103b);
        }
    }

    /* renamed from: gt0.d0$e */
    public static final class C87335e extends C87337f {

        /* renamed from: D */
        public ImageView f253112D;

        /* renamed from: E */
        public final TextView f253113E;

        /* renamed from: F */
        public final TextView f253114F;

        /* renamed from: G */
        public final ImageView f253115G;

        /* renamed from: gt0.d0$e$a */
        public static final class C87336a implements C88394b.C88408j {

            /* renamed from: d */
            public final /* synthetic */ C87335e f253116d;

            public C87336a(C87335e eVar) {
                this.f253116d = eVar;
            }

            /* renamed from: c */
            public Bitmap mo5830c(Bitmap bitmap) {
                C87412m.m108594g(bitmap, "bitmap");
                Bitmap roundedCornerBitmap = BitmapUtil.getRoundedCornerBitmap(bitmap, false, ((float) C76577a.m92151b(this.f253116d.f253120z.getContext(), 4)) * 1.0f, false);
                C87412m.m108593f(roundedCornerBitmap, "getRoundedCornerBitmap(b…ontext, 4) * 1.0f, false)");
                return roundedCornerBitmap;
            }

            public String key() {
                return "appbrand_user_avatar";
            }
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public C87335e(android.view.ViewGroup r4, java.util.List<gt0.C87330d0.C87331a> r5, gt0.C87330d0 r6) {
            /*
                r3 = this;
                java.lang.String r0 = "parent"
                gy3.C87412m.m108594g(r4, r0)
                java.lang.String r0 = "items"
                gy3.C87412m.m108594g(r5, r0)
                java.lang.String r0 = "itemAdapter"
                gy3.C87412m.m108594g(r6, r0)
                android.content.Context r0 = r4.getContext()
                android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
                r1 = 2131493104(0x7f0c00f0, float:1.8609679E38)
                r2 = 0
                android.view.View r4 = r0.inflate(r1, r4, r2)
                java.lang.String r0 = "from(parent.context).inf…list_item, parent, false)"
                gy3.C87412m.m108593f(r4, r0)
                r3.<init>(r4, r5, r6)
                android.view.View r4 = r3.f253120z
                r5 = 2131306160(0x7f0926b0, float:1.8230511E38)
                android.view.View r4 = r4.findViewById(r5)
                java.lang.String r5 = "view.findViewById(R.id.icon)"
                gy3.C87412m.m108593f(r4, r5)
                android.widget.ImageView r4 = (android.widget.ImageView) r4
                r3.f253112D = r4
                android.view.View r4 = r3.f253120z
                r5 = 2131315360(0x7f094aa0, float:1.8249171E38)
                android.view.View r4 = r4.findViewById(r5)
                java.lang.String r5 = "view.findViewById(R.id.title)"
                gy3.C87412m.m108593f(r4, r5)
                android.widget.TextView r4 = (android.widget.TextView) r4
                r3.f253113E = r4
                android.view.View r4 = r3.f253120z
                r5 = 2131314662(0x7f0947e6, float:1.8247755E38)
                android.view.View r4 = r4.findViewById(r5)
                java.lang.String r5 = "view.findViewById(R.id.sub_title)"
                gy3.C87412m.m108593f(r4, r5)
                android.widget.TextView r4 = (android.widget.TextView) r4
                r3.f253114F = r4
                android.view.View r5 = r3.f253120z
                r6 = 2131313131(0x7f0941eb, float:1.824465E38)
                android.view.View r5 = r5.findViewById(r6)
                java.lang.String r6 = "view.findViewById(R.id.selected)"
                gy3.C87412m.m108593f(r5, r6)
                android.widget.ImageView r5 = (android.widget.ImageView) r5
                r3.f253115G = r5
                android.view.View r5 = r3.f253120z
                r6 = 1
                r5.setImportantForAccessibility(r6)
                r5 = 2
                r4.setImportantForAccessibility(r5)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: gt0.C87330d0.C87335e.<init>(android.view.ViewGroup, java.util.List, gt0.d0):void");
        }

        /* renamed from: B */
        public void mo121743B(boolean z) {
            if (z) {
                TextView textView = this.f253113E;
                textView.setContentDescription(textView.getText());
                this.f253115G.setVisibility(0);
                ImageView imageView = this.f253115G;
                imageView.setContentDescription(imageView.getContext().getString(C0966R.string.f7881uv));
                return;
            }
            TextView textView2 = this.f253113E;
            textView2.setContentDescription(this.f253113E.getText() + ' ' + this.f253115G.getContext().getString(C0966R.string.f7883ux));
            this.f253115G.setVisibility(4);
        }

        /* renamed from: y */
        public void mo121744y(C87331a aVar) {
            Class cls = C87471a.class;
            C87412m.m108594g(aVar, "item");
            C87471a aVar2 = (C87471a) C89909e.m112436a(cls);
            if (aVar2 == null) {
                aVar2 = C87471a.C87472a.f253470a;
            }
            Drawable Y5 = aVar2.mo113356Y5();
            if (Y5 != null) {
                this.f253112D.setImageDrawable(Y5);
            } else {
                Y5 = null;
            }
            if (Y5 == null) {
                this.f253112D.setImageDrawable((Drawable) null);
            }
            TextView textView = this.f253113E;
            C88846b bVar = (C88846b) C89909e.m112436a(C88846b.class);
            if (bVar == null) {
                bVar = C88844a.f256275a;
            }
            SpannableString r902 = bVar.r90(this.f253113E.getContext(), aVar.f253103b, this.f253113E.getTextSize());
            String str = "";
            if (r902 == null) {
                r902 = str;
            }
            textView.setText(r902);
            boolean z = false;
            if (!TextUtils.isEmpty(aVar.f253104c)) {
                this.f253114F.setVisibility(0);
                TextView textView2 = this.f253114F;
                String str2 = aVar.f253104c;
                if (str2 != null) {
                    str = str2;
                }
                textView2.setText(str);
            } else {
                this.f253114F.setVisibility(8);
            }
            Bitmap bitmap = aVar.f253106e;
            if (bitmap != null) {
                Bitmap roundedCornerBitmap = BitmapUtil.getRoundedCornerBitmap(bitmap, false, ((float) C76577a.m92151b(this.f253120z.getContext(), 4)) * 1.0f, false);
                if (roundedCornerBitmap != null) {
                    this.f253112D.setImageBitmap(roundedCornerBitmap);
                    return;
                }
                C87471a aVar3 = (C87471a) C89909e.m112436a(cls);
                if (aVar3 == null) {
                    aVar3 = C87471a.C87472a.f253470a;
                }
                Drawable Y52 = aVar3.mo113356Y5();
                if (Y52 != null) {
                    this.f253112D.setImageDrawable(Y52);
                } else {
                    Y52 = null;
                }
                if (Y52 == null) {
                    this.f253112D.setImageDrawable((Drawable) null);
                    return;
                }
                return;
            }
            if (aVar.f253108g.length() > 0) {
                z = true;
            }
            if (z) {
                String str3 = C88394b.f255384g;
                C88394b.C88418q.f255427a.mo122786b(this.f253112D, aVar.f253108g, (Drawable) null, new C87336a(this));
            }
        }
    }

    /* renamed from: gt0.d0$f */
    public static abstract class C87337f extends RecyclerView.C16631z {

        /* renamed from: C */
        public static final /* synthetic */ int f253117C = 0;

        /* renamed from: A */
        public final List<C87331a> f253118A;

        /* renamed from: B */
        public final C87330d0 f253119B;

        /* renamed from: z */
        public View f253120z;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C87337f(View view, List<C87331a> list, C87330d0 d0Var) {
            super(view);
            C87412m.m108594g(view, "view");
            C87412m.m108594g(list, "items");
            C87412m.m108594g(d0Var, "itemAdapter");
            this.f253120z = view;
            this.f253118A = list;
            this.f253119B = d0Var;
        }

        /* renamed from: B */
        public abstract void mo121743B(boolean z);

        /* renamed from: y */
        public abstract void mo121744y(C87331a aVar);

        /* renamed from: z */
        public final void mo121745z(boolean z, C87331a aVar) {
            C87332b bVar;
            if (this.f253118A.size() == 1) {
                mo121743B(true);
                if (z && (bVar = this.f253119B.f253100e) != null) {
                    bVar.mo114555a(aVar);
                }
            } else if (z) {
                C87332b bVar2 = this.f253119B.f253100e;
                if (bVar2 != null) {
                    bVar2.mo114555a(aVar);
                }
                mo121743B(true);
            } else {
                mo121743B(false);
            }
        }
    }

    public C87330d0(List<C87331a> list) {
        C87412m.m108594g(list, "items");
        this.f253099d = list;
    }

    public int getItemCount() {
        return this.f253099d.size();
    }

    public int getItemViewType(int i) {
        C87331a aVar = this.f253099d.get(i);
        if (aVar != null) {
            return aVar.f253102a;
        }
        return 0;
    }

    public void onBindViewHolder(RecyclerView.C16631z zVar, int i) {
        C87337f fVar = (C87337f) zVar;
        C87412m.m108594g(fVar, "holder");
        C87331a aVar = this.f253099d.get(i);
        if (aVar != null) {
            C8453g0 g0Var = new C8453g0(this);
            fVar.mo121744y(aVar);
            fVar.mo121745z(aVar.f253107f, aVar);
            fVar.f253120z.setOnClickListener(new C87339e0(aVar, fVar, g0Var, i));
            fVar.f253120z.setOnLongClickListener(new C87346f0(fVar, aVar, i));
        }
    }

    public RecyclerView.C16631z onCreateViewHolder(ViewGroup viewGroup, int i) {
        C87412m.m108594g(viewGroup, "parent");
        return i == 1 ? new C87334d(viewGroup, this.f253099d, this) : new C87335e(viewGroup, this.f253099d, this);
    }

    /* renamed from: gt0.d0$a */
    public static final class C87331a {

        /* renamed from: a */
        public final int f253102a;

        /* renamed from: b */
        public final String f253103b;

        /* renamed from: c */
        public final String f253104c;

        /* renamed from: d */
        public final String f253105d;

        /* renamed from: e */
        public Bitmap f253106e;

        /* renamed from: f */
        public boolean f253107f;

        /* renamed from: g */
        public String f253108g;

        /* renamed from: h */
        public int f253109h;

        public C87331a(int i, String str, String str2, String str3, Bitmap bitmap, boolean z, String str4, int i2) {
            C87412m.m108594g(str4, "iconUrl");
            this.f253102a = i;
            this.f253103b = str;
            this.f253104c = str2;
            this.f253105d = str3;
            this.f253106e = bitmap;
            this.f253107f = z;
            this.f253108g = str4;
            this.f253109h = i2;
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public C87331a(int r11, java.lang.String r12, java.lang.String r13, java.lang.String r14, boolean r15, java.lang.String r16, int r17) {
            /*
                r10 = this;
                java.lang.String r0 = "iconUrl"
                r8 = r16
                gy3.C87412m.m108594g(r8, r0)
                r6 = 0
                r1 = r10
                r2 = r11
                r3 = r12
                r4 = r13
                r5 = r14
                r7 = r15
                r9 = r17
                r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: gt0.C87330d0.C87331a.<init>(int, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, int):void");
        }

        public C87331a(int i, String str, String str2, String str3, boolean z, Bitmap bitmap, int i2) {
            this(i, str, str2, str3, bitmap, z, "", i2);
        }

        public C87331a(int i, String str, String str2, boolean z) {
            this(i, str, "", str2, (Bitmap) null, z, "", 0);
        }
    }
}
