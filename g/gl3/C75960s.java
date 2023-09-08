package gl3;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import fy3.C32224a;
import gl3.C75922b;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.util.ArrayList;
import kg3.C76577a;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;

/* renamed from: gl3.s */
public class C75960s extends C75921a {

    /* renamed from: B */
    public C75976w f222736B;

    /* renamed from: C */
    public Context f222737C;

    /* renamed from: D */
    public String f222738D;

    /* renamed from: E */
    public Integer f222739E;

    /* renamed from: F */
    public String f222740F;

    /* renamed from: G */
    public boolean f222741G;

    /* renamed from: H */
    public boolean f222742H;

    /* renamed from: I */
    public final C13601g f222743I = C36568h.m40985a(new C75966d(this));

    /* renamed from: J */
    public final C13601g f222744J = C36568h.m40985a(new C75965c(this));

    /* renamed from: gl3.s$a */
    public final class C75961a implements C75922b.C75923a {

        /* renamed from: a */
        public RelativeLayout f222745a;

        /* renamed from: b */
        public TextView f222746b;

        /* renamed from: c */
        public LinearLayout f222747c;

        /* renamed from: d */
        public WeImageView f222748d;

        /* renamed from: e */
        public TextView f222749e;

        /* renamed from: f */
        public TextView f222750f;

        /* renamed from: g */
        public View f222751g;

        public C75961a(C75960s sVar) {
        }
    }

    /* renamed from: gl3.s$b */
    public final class C75962b implements C75922b.C75924b {

        /* renamed from: gl3.s$b$a */
        public static final class C75963a implements View.OnClickListener {

            /* renamed from: d */
            public final /* synthetic */ C75960s f222753d;

            public C75963a(C75960s sVar) {
                this.f222753d = sVar;
            }

            public final void onClick(View view) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/ui/contact/item/HeaderViewDataItem$HeaderViewItem$fillingViewItem$1$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                C75976w wVar = this.f222753d.f222736B;
                if (wVar != null) {
                    wVar.mo103553a();
                }
                C117292a.m165361g(this, "com/tencent/mm/ui/contact/item/HeaderViewDataItem$HeaderViewItem$fillingViewItem$1$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        }

        /* renamed from: gl3.s$b$b */
        public static final class C75964b implements View.OnClickListener {

            /* renamed from: d */
            public final /* synthetic */ C75960s f222754d;

            public C75964b(C75960s sVar) {
                this.f222754d = sVar;
            }

            public final void onClick(View view) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/ui/contact/item/HeaderViewDataItem$HeaderViewItem$fillingViewItem$1$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                C75976w wVar = this.f222754d.f222736B;
                if (wVar != null) {
                    wVar.mo103554b();
                }
                C117292a.m165361g(this, "com/tencent/mm/ui/contact/item/HeaderViewDataItem$HeaderViewItem$fillingViewItem$1$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        }

        public C75962b() {
        }

        /* JADX WARNING: Removed duplicated region for block: B:34:0x0072  */
        /* JADX WARNING: Removed duplicated region for block: B:39:0x0082  */
        /* JADX WARNING: Removed duplicated region for block: B:53:0x00eb  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo67029a(android.content.Context r11, gl3.C75922b.C75923a r12, gl3.C75922b r13, boolean r14, boolean r15) {
            /*
                r10 = this;
                boolean r14 = r12 instanceof gl3.C75960s.C75961a
                if (r14 == 0) goto L_0x0136
                boolean r14 = r13 instanceof gl3.C75960s
                if (r14 == 0) goto L_0x0136
                gl3.s r14 = gl3.C75960s.this
                r14.mo106192k(r11)
                gl3.s r14 = gl3.C75960s.this
                gl3.s$a r12 = (gl3.C75960s.C75961a) r12
                android.widget.TextView r15 = r12.f222746b
                if (r15 != 0) goto L_0x0016
                goto L_0x001e
            L_0x0016:
                r0 = r13
                gl3.s r0 = (gl3.C75960s) r0
                java.lang.String r0 = r0.f222738D
                r15.setText(r0)
            L_0x001e:
                boolean r15 = r14.f222741G
                if (r15 == 0) goto L_0x002e
                android.widget.LinearLayout r11 = r12.f222747c
                if (r11 != 0) goto L_0x0028
                goto L_0x0136
            L_0x0028:
                r12 = 4
                r11.setVisibility(r12)
                goto L_0x0136
            L_0x002e:
                android.widget.LinearLayout r15 = r12.f222747c
                r0 = 0
                if (r15 != 0) goto L_0x0034
                goto L_0x0037
            L_0x0034:
                r15.setVisibility(r0)
            L_0x0037:
                android.widget.TextView r15 = r12.f222749e
                if (r15 != 0) goto L_0x003c
                goto L_0x0044
            L_0x003c:
                r1 = r13
                gl3.s r1 = (gl3.C75960s) r1
                java.lang.String r1 = r1.f222740F
                r15.setText(r1)
            L_0x0044:
                gl3.s r13 = (gl3.C75960s) r13
                java.lang.Integer r13 = r13.f222739E
                r15 = 0
                if (r13 == 0) goto L_0x0061
                int r13 = r13.intValue()
                com.tencent.mm.ui.widget.imageview.WeImageView r1 = r12.f222748d
                if (r1 != 0) goto L_0x0054
                goto L_0x0057
            L_0x0054:
                r1.setVisibility(r0)
            L_0x0057:
                com.tencent.mm.ui.widget.imageview.WeImageView r1 = r12.f222748d
                if (r1 == 0) goto L_0x0061
                r1.setImageResource(r13)
                rx3.b0 r13 = rx3.C13598b0.f38549a
                goto L_0x0062
            L_0x0061:
                r13 = r15
            L_0x0062:
                r1 = 8
                if (r13 != 0) goto L_0x006e
                com.tencent.mm.ui.widget.imageview.WeImageView r13 = r12.f222748d
                if (r13 != 0) goto L_0x006b
                goto L_0x006e
            L_0x006b:
                r13.setVisibility(r1)
            L_0x006e:
                android.widget.LinearLayout r13 = r12.f222747c
                if (r13 == 0) goto L_0x007a
                gl3.s$b$a r2 = new gl3.s$b$a
                r2.<init>(r14)
                r13.setOnClickListener(r2)
            L_0x007a:
                boolean r13 = r14.f222742H
                if (r13 == 0) goto L_0x00eb
                boolean r13 = r14.f222608e
                if (r13 != 0) goto L_0x00eb
                android.widget.TextView r13 = r12.f222750f
                if (r13 != 0) goto L_0x0087
                goto L_0x008a
            L_0x0087:
                r13.setVisibility(r0)
            L_0x008a:
                android.view.View r13 = r12.f222751g
                if (r13 != 0) goto L_0x008f
                goto L_0x00cd
            L_0x008f:
                k20.a r9 = new k20.a
                r9.<init>()
                java.lang.ThreadLocal<k20.a> r1 = k20.C60958c.f173611a
                java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
                r9.mo10233c(r1)
                java.lang.Object[] r2 = r9.mo10232b()
                java.lang.String r3 = "com/tencent/mm/ui/contact/item/HeaderViewDataItem$HeaderViewItem"
                java.lang.String r4 = "fillingViewItem"
                java.lang.String r5 = "(Landroid/content/Context;Lcom/tencent/mm/ui/contact/item/BaseContactDataItem$BaseContactViewHolder;Lcom/tencent/mm/ui/contact/item/BaseContactDataItem;ZZ)V"
                java.lang.String r6 = "android/view/View_EXEC_"
                java.lang.String r7 = "setVisibility"
                java.lang.String r8 = "(I)V"
                r1 = r13
                j20.C117292a.m165358d(r1, r2, r3, r4, r5, r6, r7, r8)
                java.lang.Object r0 = r9.mo10231a(r0)
                java.lang.Integer r0 = (java.lang.Integer) r0
                int r0 = r0.intValue()
                r13.setVisibility(r0)
                java.lang.String r2 = "com/tencent/mm/ui/contact/item/HeaderViewDataItem$HeaderViewItem"
                java.lang.String r3 = "fillingViewItem"
                java.lang.String r4 = "(Landroid/content/Context;Lcom/tencent/mm/ui/contact/item/BaseContactDataItem$BaseContactViewHolder;Lcom/tencent/mm/ui/contact/item/BaseContactDataItem;ZZ)V"
                java.lang.String r5 = "android/view/View_EXEC_"
                java.lang.String r6 = "setVisibility"
                java.lang.String r7 = "(I)V"
                j20.C117292a.m165359e(r1, r2, r3, r4, r5, r6, r7)
            L_0x00cd:
                android.widget.TextView r13 = r12.f222750f
                if (r13 != 0) goto L_0x00d2
                goto L_0x00de
            L_0x00d2:
                if (r11 == 0) goto L_0x00db
                r15 = 2131835488(0x7f113a60, float:1.9304116E38)
                java.lang.String r15 = r11.getString(r15)
            L_0x00db:
                r13.setText(r15)
            L_0x00de:
                android.widget.TextView r11 = r12.f222750f
                if (r11 == 0) goto L_0x0136
                gl3.s$b$b r12 = new gl3.s$b$b
                r12.<init>(r14)
                r11.setOnClickListener(r12)
                goto L_0x0136
            L_0x00eb:
                android.widget.TextView r11 = r12.f222750f
                if (r11 != 0) goto L_0x00f0
                goto L_0x00f3
            L_0x00f0:
                r11.setVisibility(r1)
            L_0x00f3:
                android.view.View r11 = r12.f222751g
                if (r11 != 0) goto L_0x00f8
                goto L_0x0136
            L_0x00f8:
                k20.a r12 = new k20.a
                r12.<init>()
                java.lang.ThreadLocal<k20.a> r13 = k20.C60958c.f173611a
                java.lang.Integer r13 = java.lang.Integer.valueOf(r1)
                r12.mo10233c(r13)
                java.lang.Object[] r3 = r12.mo10232b()
                java.lang.String r4 = "com/tencent/mm/ui/contact/item/HeaderViewDataItem$HeaderViewItem"
                java.lang.String r5 = "fillingViewItem"
                java.lang.String r6 = "(Landroid/content/Context;Lcom/tencent/mm/ui/contact/item/BaseContactDataItem$BaseContactViewHolder;Lcom/tencent/mm/ui/contact/item/BaseContactDataItem;ZZ)V"
                java.lang.String r7 = "android/view/View_EXEC_"
                java.lang.String r8 = "setVisibility"
                java.lang.String r9 = "(I)V"
                r2 = r11
                j20.C117292a.m165358d(r2, r3, r4, r5, r6, r7, r8, r9)
                java.lang.Object r12 = r12.mo10231a(r0)
                java.lang.Integer r12 = (java.lang.Integer) r12
                int r12 = r12.intValue()
                r11.setVisibility(r12)
                java.lang.String r3 = "com/tencent/mm/ui/contact/item/HeaderViewDataItem$HeaderViewItem"
                java.lang.String r4 = "fillingViewItem"
                java.lang.String r5 = "(Landroid/content/Context;Lcom/tencent/mm/ui/contact/item/BaseContactDataItem$BaseContactViewHolder;Lcom/tencent/mm/ui/contact/item/BaseContactDataItem;ZZ)V"
                java.lang.String r6 = "android/view/View_EXEC_"
                java.lang.String r7 = "setVisibility"
                java.lang.String r8 = "(I)V"
                j20.C117292a.m165359e(r2, r3, r4, r5, r6, r7, r8)
            L_0x0136:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: gl3.C75960s.C75962b.mo67029a(android.content.Context, gl3.b$a, gl3.b, boolean, boolean):void");
        }

        /* renamed from: b */
        public View mo67030b(Context context, ViewGroup viewGroup, View view) {
            View inflate = LayoutInflater.from(context).inflate(C0966R.C0971layout.bwd, viewGroup, false);
            C75961a aVar = (C75961a) ((C36570n) C75960s.this.f222744J).getValue();
            C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.ui.contact.item.HeaderViewDataItem.HeaderViewHolder");
            View findViewById = inflate.findViewById(C0966R.C0970id.evk);
            C87412m.m108592e(findViewById, "null cannot be cast to non-null type android.widget.RelativeLayout");
            aVar.f222745a = (RelativeLayout) findViewById;
            View findViewById2 = inflate.findViewById(C0966R.C0970id.eve);
            C87412m.m108592e(findViewById2, "null cannot be cast to non-null type android.widget.TextView");
            aVar.f222746b = (TextView) findViewById2;
            float f = ((float) C76577a.m92155f(context, C0966R.dimen.f3957lf)) * C76577a.m92161l(context);
            TextView textView = aVar.f222746b;
            if (textView != null) {
                textView.setTextSize(0, f);
            }
            TextView textView2 = aVar.f222746b;
            C85875k4.m106191k0(textView2 != null ? textView2.getPaint() : null);
            View findViewById3 = inflate.findViewById(C0966R.C0970id.bs4);
            C87412m.m108592e(findViewById3, "null cannot be cast to non-null type android.widget.LinearLayout");
            aVar.f222747c = (LinearLayout) findViewById3;
            View findViewById4 = inflate.findViewById(C0966R.C0970id.f2a);
            C87412m.m108592e(findViewById4, "null cannot be cast to non-null type com.tencent.mm.ui.widget.imageview.WeImageView");
            aVar.f222748d = (WeImageView) findViewById4;
            View findViewById5 = inflate.findViewById(C0966R.C0970id.bsk);
            C87412m.m108592e(findViewById5, "null cannot be cast to non-null type android.widget.TextView");
            TextView textView3 = (TextView) findViewById5;
            aVar.f222749e = textView3;
            textView3.setTextSize(0, f);
            View findViewById6 = inflate.findViewById(C0966R.C0970id.nzo);
            C87412m.m108592e(findViewById6, "null cannot be cast to non-null type android.widget.TextView");
            TextView textView4 = (TextView) findViewById6;
            aVar.f222750f = textView4;
            textView4.setTextSize(0, f);
            View findViewById7 = inflate.findViewById(C0966R.C0970id.c7p);
            C87412m.m108592e(findViewById7, "null cannot be cast to non-null type android.view.View");
            aVar.f222751g = findViewById7;
            inflate.setTag(aVar);
            return inflate;
        }

        /* renamed from: c */
        public boolean mo67031c(Context context, View view, C75922b bVar) {
            return false;
        }
    }

    /* renamed from: gl3.s$c */
    public static final class C75965c extends C87413o implements C32224a<C75961a> {

        /* renamed from: d */
        public final /* synthetic */ C75960s f222755d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C75965c(C75960s sVar) {
            super(0);
            this.f222755d = sVar;
        }

        public Object invoke() {
            return new C75961a(this.f222755d);
        }
    }

    /* renamed from: gl3.s$d */
    public static final class C75966d extends C87413o implements C32224a<C75962b> {

        /* renamed from: d */
        public final /* synthetic */ C75960s f222756d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C75966d(C75960s sVar) {
            super(0);
            this.f222756d = sVar;
        }

        public Object invoke() {
            return new C75962b();
        }
    }

    public C75960s(int i) {
        super(0, i);
    }

    /* renamed from: a */
    public void mo67027a(Context context, C75922b.C75923a aVar) {
        this.f222737C = context;
        if (aVar instanceof C75961a) {
            this.f222738D = context != null ? context.getString(C0966R.string.iih) : null;
            mo106192k(context);
        }
    }

    /* renamed from: b */
    public C75922b.C75924b mo67028b() {
        return (C75962b) ((C36570n) this.f222743I).getValue();
    }

    /* renamed from: k */
    public void mo106192k(Context context) {
        String str = null;
        if (this.f222742H) {
            this.f222739E = null;
            if (this.f222608e) {
                if (context != null) {
                    str = context.getString(C0966R.string.iim);
                }
            } else if (context != null) {
                str = context.getString(C0966R.string.n4h);
            }
            this.f222740F = str;
        } else if (this.f222608e) {
            if (context != null) {
                str = context.getString(C0966R.string.iim);
            }
            this.f222740F = str;
            this.f222739E = Integer.valueOf(C0966R.raw.icons_filled_contacts);
        } else {
            if (context != null) {
                str = context.getString(C0966R.string.iig);
            }
            this.f222740F = str;
            this.f222739E = Integer.valueOf(C0966R.raw.icons_filled_add);
        }
    }

    /* renamed from: l */
    public void mo106193l(int i) {
        Context context = this.f222737C;
        if (context != null) {
            C75961a aVar = (C75961a) ((C36570n) this.f222744J).getValue();
            RelativeLayout relativeLayout = aVar.f222745a;
            if (relativeLayout != null) {
                relativeLayout.setBackground(context.getResources().getDrawable(i));
            }
            LinearLayout linearLayout = aVar.f222747c;
            if (linearLayout != null) {
                linearLayout.setBackground(context.getResources().getDrawable(i));
            }
        }
    }
}
