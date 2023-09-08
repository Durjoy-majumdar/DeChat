package k53;

import android.content.Context;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import di3.C86312j;
import h81.C32735h;
import j20.C117292a;
import java.util.ArrayList;
import nj3.C11182m0;
import nj3.C11184p0;
import nj3.C76874e0;
import nj3.C76875f0;
import qo3.C101218e0;

/* renamed from: k53.a */
public class C76492a {

    /* renamed from: a */
    public final C101218e0 f223921a;

    /* renamed from: b */
    public Context f223922b;

    /* renamed from: c */
    public C11182m0 f223923c;

    /* renamed from: d */
    public C11184p0 f223924d;

    /* renamed from: e */
    public C11184p0 f223925e;

    /* renamed from: f */
    public C76874e0 f223926f;

    /* renamed from: g */
    public C76874e0 f223927g;

    /* renamed from: h */
    public C76494b f223928h;

    /* renamed from: i */
    public RecyclerView f223929i;

    /* renamed from: j */
    public View f223930j;

    /* renamed from: k */
    public boolean f223931k = false;

    /* renamed from: l */
    public boolean f223932l = false;

    /* renamed from: m */
    public int f223933m = 0;

    /* renamed from: n */
    public AdapterView.OnItemClickListener f223934n = new C76493a();

    /* renamed from: k53.a$a */
    public class C76493a implements AdapterView.OnItemClickListener {
        public C76493a() {
        }

        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(adapterView);
            arrayList.add(view);
            arrayList.add(Integer.valueOf(i));
            arrayList.add(Long.valueOf(j));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/wallet/ui/BankCardListBottomSheetUI$1", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
            if (i >= C76492a.this.f223926f.size() + C76492a.this.f223927g.size()) {
                C117292a.m165361g(this, "com/tencent/mm/plugin/wallet/ui/BankCardListBottomSheetUI$1", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
                return;
            }
            if (i < C76492a.this.f223926f.size()) {
                C76875f0 f0Var = (C76875f0) ((ArrayList) C76492a.this.f223926f.f224704d).get(i);
                if (f0Var == null || !f0Var.f224722q) {
                    C11184p0 p0Var = C76492a.this.f223924d;
                    if (p0Var != null) {
                        p0Var.onMMMenuItemSelected(f0Var, i);
                    } else {
                        f0Var.mo107177c();
                    }
                    C76492a.this.f223933m = i;
                } else {
                    C117292a.m165361g(this, "com/tencent/mm/plugin/wallet/ui/BankCardListBottomSheetUI$1", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
                    return;
                }
            } else if (C76492a.this.f223927g.size() > 0 && i < C76492a.this.f223926f.size() + C76492a.this.f223927g.size()) {
                C76492a aVar = C76492a.this;
                C76875f0 f0Var2 = (C76875f0) ((ArrayList) aVar.f223927g.f224704d).get(i - aVar.f223926f.size());
                if (f0Var2 == null || !f0Var2.f224722q) {
                    C11184p0 p0Var2 = C76492a.this.f223925e;
                    if (p0Var2 != null) {
                        p0Var2.onMMMenuItemSelected(f0Var2, i);
                    }
                } else {
                    C117292a.m165361g(this, "com/tencent/mm/plugin/wallet/ui/BankCardListBottomSheetUI$1", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
                    return;
                }
            }
            C76492a.this.f223928h.notifyDataSetChanged();
            C117292a.m165361g(this, "com/tencent/mm/plugin/wallet/ui/BankCardListBottomSheetUI$1", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
        }
    }

    /* renamed from: k53.a$b */
    public class C76494b extends RecyclerView.C16613e<C76495a> {

        /* renamed from: d */
        public AdapterView.OnItemClickListener f223936d;

        /* renamed from: e */
        public C76874e0 f223937e;

        /* renamed from: k53.a$b$a */
        public class C76495a extends RecyclerView.C16631z implements View.OnClickListener {

            /* renamed from: A */
            public TextView f223939A;

            /* renamed from: B */
            public WeImageView f223940B;

            /* renamed from: C */
            public WeImageView f223941C;

            /* renamed from: D */
            public ImageView f223942D;

            /* renamed from: E */
            public LinearLayout f223943E;

            /* renamed from: z */
            public TextView f223945z;

            public C76495a(View view, int i) {
                super(view);
                view.setOnClickListener(this);
                this.f223945z = (TextView) view.findViewById(C0966R.C0970id.knx);
                this.f223940B = (WeImageView) view.findViewById(C0966R.C0970id.f15);
                this.f223943E = (LinearLayout) view.findViewById(C0966R.C0970id.iwc);
                this.f223939A = (TextView) view.findViewById(C0966R.C0970id.f357845c22);
                this.f223941C = (WeImageView) view.findViewById(C0966R.C0970id.f359003ic1);
                ImageView imageView = (ImageView) view.findViewById(C0966R.C0970id.c7p);
                this.f223942D = imageView;
                if (i == 1) {
                    LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) imageView.getLayoutParams();
                    layoutParams.setMargins(0, 0, 0, 0);
                    this.f223942D.setLayoutParams(layoutParams);
                    this.f223941C.setImageResource(C0966R.raw.icons_outlined_arrow);
                    this.f223941C.setIconColor(C76492a.this.f223922b.getResources().getColor(C0966R.color.FG_2));
                }
            }

            public void onClick(View view) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/plugin/wallet/ui/BankCardListBottomSheetUI$RecycleViewAdapter$ViewHolder", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                AdapterView.OnItemClickListener onItemClickListener = C76494b.this.f223936d;
                if (onItemClickListener != null) {
                    onItemClickListener.onItemClick((AdapterView) null, view, mo17365l(), (long) mo17365l());
                }
                C117292a.m165361g(this, "com/tencent/mm/plugin/wallet/ui/BankCardListBottomSheetUI$RecycleViewAdapter$ViewHolder", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        }

        public C76494b() {
        }

        public int getItemCount() {
            return this.f223937e.size() + C76492a.this.f223927g.size();
        }

        public int getItemViewType(int i) {
            return i < this.f223937e.size() ? 0 : 1;
        }

        public void onBindViewHolder(RecyclerView.C16631z zVar, int i) {
            ImageView imageView;
            C76495a aVar = (C76495a) zVar;
            if (i < this.f223937e.size()) {
                if (C76492a.this.f223933m >= this.f223937e.size()) {
                    C76492a.this.f223933m = 0;
                }
                aVar.f223943E.setFocusable(true);
                C76875f0 f0Var = (C76875f0) ((ArrayList) this.f223937e.f224704d).get(i);
                aVar.f223945z.setText(f0Var.getTitle());
                if (f0Var.getIcon() != null) {
                    aVar.f223940B.setVisibility(0);
                    aVar.f223940B.setImageDrawable(f0Var.getIcon());
                    int i2 = f0Var.f224725t;
                    if (i2 != 0) {
                        aVar.f223940B.setIconColor(i2);
                    } else {
                        aVar.f223940B.setIconColor(C76492a.this.f223922b.getResources().getColor(C0966R.color.ahf));
                    }
                } else {
                    C76492a.this.getClass();
                    if (C76492a.this.f223932l) {
                        aVar.f223940B.setVisibility(4);
                    } else {
                        aVar.f223940B.setVisibility(8);
                    }
                }
                C76492a.this.getClass();
                if (f0Var.f224722q) {
                    aVar.f223945z.setTextColor(C76492a.this.f223922b.getResources().getColor(C0966R.color.f3148gx));
                    aVar.f223940B.setAlpha(77);
                    aVar.f223943E.setBackgroundResource(C0966R.color.ahf);
                } else {
                    aVar.f223940B.setAlpha(255);
                    aVar.f223945z.setTextColor(C76492a.this.f223922b.getResources().getColor(C0966R.color.f3147gw));
                }
                if (aVar.f223939A != null) {
                    if (!TextUtils.isEmpty(f0Var.f224721p)) {
                        aVar.f223939A.setVisibility(0);
                        aVar.f223939A.setText(f0Var.f224721p);
                        if (C76492a.this.f223931k) {
                            aVar.f223939A.setMovementMethod(LinkMovementMethod.getInstance());
                        }
                    } else {
                        aVar.f223939A.setVisibility(8);
                    }
                }
                aVar.f223943E.setContentDescription(MMApplicationContext.getContext().getString(C0966R.string.kk6, new Object[]{aVar.f223945z.getText(), aVar.f223939A.getText()}));
                if (f0Var.f224722q) {
                    WeImageView weImageView = aVar.f223941C;
                    if (weImageView != null) {
                        weImageView.setVisibility(4);
                    }
                    aVar.f223939A.setTextColor(C76492a.this.f223922b.getResources().getColor(C0966R.color.f3148gx));
                } else {
                    aVar.f223939A.setTextColor(C76492a.this.f223922b.getResources().getColor(C0966R.color.f3149gy));
                    if (C76492a.this.f223933m == i) {
                        WeImageView weImageView2 = aVar.f223941C;
                        if (weImageView2 != null) {
                            weImageView2.setVisibility(0);
                        }
                        aVar.f223943E.setContentDescription(MMApplicationContext.getContext().getString(C0966R.string.kk7, new Object[]{aVar.f223945z.getText(), aVar.f223939A.getText()}));
                    } else {
                        WeImageView weImageView3 = aVar.f223941C;
                        if (weImageView3 != null) {
                            weImageView3.setVisibility(4);
                        }
                    }
                }
                ImageView imageView2 = aVar.f223942D;
                if (imageView2 != null) {
                    imageView2.setVisibility(0);
                }
                if (C76492a.this.f223927g.size() == 0 && i == this.f223937e.size() - 1 && (imageView = aVar.f223942D) != null) {
                    ((LinearLayout.LayoutParams) imageView.getLayoutParams()).setMargins(0, 0, 0, 0);
                }
                aVar.f223939A.setImportantForAccessibility(2);
            } else if (C76492a.this.f223927g.size() > 0 && i < this.f223937e.size() + C76492a.this.f223927g.size()) {
                C76875f0 f0Var2 = (C76875f0) ((ArrayList) C76492a.this.f223927g.f224704d).get(i - this.f223937e.size());
                aVar.f223945z.setText(f0Var2.getTitle());
                if (C76492a.this.f223933m >= this.f223937e.size() + C76492a.this.f223927g.size()) {
                    C76492a.this.f223933m = 0;
                }
                if (f0Var2.getIcon() != null) {
                    aVar.f223940B.setVisibility(0);
                    aVar.f223940B.setImageDrawable(f0Var2.getIcon());
                    int i3 = f0Var2.f224725t;
                    if (i3 != 0) {
                        aVar.f223940B.setIconColor(i3);
                    } else {
                        aVar.f223940B.setIconColor(C76492a.this.f223922b.getResources().getColor(C0966R.color.ahf));
                    }
                } else {
                    aVar.f223940B.setVisibility(8);
                }
                if (f0Var2.f224722q) {
                    aVar.f223945z.setTextColor(C76492a.this.f223922b.getResources().getColor(C0966R.color.f3148gx));
                    aVar.f223943E.setBackgroundResource(C0966R.color.ahf);
                    aVar.f223940B.setAlpha(0.1f);
                } else {
                    TextView textView = aVar.f223945z;
                    textView.setTextColor(textView.getTextColors());
                    aVar.f223943E.setBackgroundResource(C0966R.C0969drawable.aez);
                }
                if (aVar.f223939A != null) {
                    if (!TextUtils.isEmpty(f0Var2.f224721p)) {
                        aVar.f223939A.setVisibility(0);
                        aVar.f223939A.setText(f0Var2.f224721p);
                    } else {
                        aVar.f223939A.setVisibility(8);
                    }
                    aVar.f223939A.setImportantForAccessibility(2);
                }
                aVar.f223943E.setContentDescription(MMApplicationContext.getContext().getString(C0966R.string.kk6, new Object[]{aVar.f223945z.getText(), aVar.f223939A.getText()}));
                if (f0Var2.f224722q) {
                    WeImageView weImageView4 = aVar.f223941C;
                    if (weImageView4 != null) {
                        weImageView4.setVisibility(4);
                    }
                    aVar.f223939A.setTextColor(C76492a.this.f223922b.getResources().getColor(C0966R.color.f3148gx));
                    aVar.f223940B.setAlpha(0.1f);
                } else {
                    aVar.f223939A.setTextColor(C76492a.this.f223922b.getResources().getColor(C0966R.color.f3149gy));
                    WeImageView weImageView5 = aVar.f223941C;
                    if (weImageView5 != null) {
                        weImageView5.setVisibility(0);
                    }
                }
                ImageView imageView3 = aVar.f223942D;
                if (imageView3 != null) {
                    imageView3.setVisibility(0);
                }
            }
        }

        public RecyclerView.C16631z onCreateViewHolder(ViewGroup viewGroup, int i) {
            return new C76495a(LayoutInflater.from(C76492a.this.f223922b).inflate(C0966R.C0971layout.b8o, viewGroup, false), i);
        }
    }

    public C76492a(Context context) {
        this.f223922b = context;
        if (((C32735h) C86312j.m106911c(C32735h.class)).mo58784wf(C32735h.C32737c.clicfg_payment_select_remove_confirm_button_android, false)) {
            this.f223921a = new C101218e0(context, 0, 3);
        } else {
            this.f223921a = new C101218e0(context, 2, 3);
        }
        Context context2 = this.f223922b;
        this.f223926f = new C76874e0(context2);
        this.f223927g = new C76874e0(context2);
        this.f223929i = new RecyclerView(this.f223922b, (AttributeSet) null);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        this.f223929i.setFocusable(false);
        this.f223929i.setLayoutParams(layoutParams);
        this.f223929i.setHasFixedSize(true);
        this.f223929i.setLayoutManager(new LinearLayoutManager(this.f223922b));
        this.f223929i.setItemViewCacheSize(20);
        this.f223929i.setPadding(0, 0, 0, 0);
        C76494b bVar = new C76494b();
        this.f223928h = bVar;
        bVar.f223937e = this.f223926f;
        bVar.f223936d = this.f223934n;
        this.f223929i.setAdapter(bVar);
        C101218e0 e0Var = this.f223921a;
        if (e0Var != null) {
            e0Var.mo140663j(this.f223929i);
        }
    }

    /* renamed from: a */
    public boolean mo106726a() {
        return this.f223921a.mo140661h();
    }

    /* renamed from: b */
    public void mo106727b() {
        C76494b bVar = this.f223928h;
        if (bVar != null) {
            bVar.notifyDataSetChanged();
        }
        this.f223921a.mo140655A();
    }

    /* renamed from: c */
    public void mo106728c() {
        this.f223921a.mo140680z();
    }

    /* renamed from: d */
    public void mo106729d() {
        C76494b bVar;
        C11182m0 m0Var = this.f223923c;
        if (m0Var != null) {
            m0Var.onCreateMMMenu(this.f223926f);
        }
        this.f223929i.setPadding(0, 0, 0, 0);
        if (!(this.f223927g == null || (bVar = this.f223928h) == null)) {
            bVar.notifyDataSetChanged();
        }
        this.f223921a.mo140655A();
    }
}
