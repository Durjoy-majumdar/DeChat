package il1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.RelativeLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.view.FinderLiveDarkModePicker;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.util.ArrayList;
import ok1.C62042e;
import qo3.C12925w;
import qo3.w$$c;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;

/* renamed from: il1.g */
public final class C8978g extends C9120u0 {

    /* renamed from: h */
    public View f28376h;

    /* renamed from: i */
    public View f28377i;

    /* renamed from: j */
    public RelativeLayout f28378j;

    /* renamed from: n */
    public View f28379n;

    /* renamed from: o */
    public final C13601g f28380o;

    /* renamed from: p */
    public Integer f28381p;

    /* renamed from: q */
    public C32226l<? super Integer, C13598b0> f28382q;

    /* renamed from: r */
    public final C13601g f28383r = C36568h.m40985a(C8983e.f28389d);

    /* renamed from: s */
    public final C13601g f28384s = C36568h.m40985a(new C8984f(this));

    /* renamed from: il1.g$a */
    public static final class C8979a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C8978g f28385d;

        public C8979a(C8978g gVar) {
            this.f28385d = gVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/widget/FinderFansClubAnnouncementLevelSettingWidget$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C12925w wVar = this.f28385d.getModifyAnnoucementLevelPage().f36949a;
            if (wVar != null) {
                wVar.mo5085n();
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/widget/FinderFansClubAnnouncementLevelSettingWidget$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: il1.g$b */
    public final class C8980b extends w$$c {
        public C8980b() {
        }

        /* renamed from: a */
        public View mo4781a(Context context) {
            C87412m.m108594g(context, "context");
            return C8978g.this;
        }

        /* renamed from: c */
        public void mo4873c() {
            C13598b0 b0Var;
            Integer selectedLevel = C8978g.this.getSelectedLevel();
            if (selectedLevel != null) {
                C8978g gVar = C8978g.this;
                gVar.getSelectView().setValue(selectedLevel.intValue());
                b0Var = C13598b0.f38549a;
            } else {
                b0Var = null;
            }
            if (b0Var == null) {
                C8978g.this.getSelectView().setValue(1);
            }
        }
    }

    /* renamed from: il1.g$c */
    public static final class C8981c implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C8978g f28387d;

        public C8981c(C8978g gVar) {
            this.f28387d = gVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/widget/FinderFansClubAnnouncementLevelSettingWidget$backBtn$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C8978g gVar = this.f28387d;
            gVar.getClass();
            gVar.postDelayed(new C9000h(gVar), 300);
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/widget/FinderFansClubAnnouncementLevelSettingWidget$backBtn$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: il1.g$d */
    public static final class C8982d implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C8978g f28388d;

        public C8982d(C8978g gVar) {
            this.f28388d = gVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/widget/FinderFansClubAnnouncementLevelSettingWidget$confirmBtn$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C32226l<Integer, C13598b0> backClickListener = this.f28388d.getBackClickListener();
            if (backClickListener != null) {
                backClickListener.invoke(Integer.valueOf(this.f28388d.getSelectView().getValue() + 1));
            }
            C8978g gVar = this.f28388d;
            gVar.getClass();
            gVar.postDelayed(new C9000h(gVar), 300);
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/widget/FinderFansClubAnnouncementLevelSettingWidget$confirmBtn$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: il1.g$e */
    public static final class C8983e extends C87413o implements C32224a<String[]> {

        /* renamed from: d */
        public static final C8983e f28389d = new C8983e();

        public C8983e() {
            super(0);
        }

        public Object invoke() {
            ArrayList arrayList = new ArrayList();
            for (int i = 1; i < 21; i++) {
                arrayList.add(String.valueOf(i));
            }
            Object[] array = arrayList.toArray(new String[0]);
            C87412m.m108592e(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            return (String[]) array;
        }
    }

    /* renamed from: il1.g$f */
    public static final class C8984f extends C87413o implements C32224a<C8980b> {

        /* renamed from: d */
        public final /* synthetic */ C8978g f28390d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C8984f(C8978g gVar) {
            super(0);
            this.f28390d = gVar;
        }

        public Object invoke() {
            return new C8980b();
        }
    }

    /* renamed from: il1.g$g */
    public static final class C8985g extends C87413o implements C32224a<FinderLiveDarkModePicker> {

        /* renamed from: d */
        public final /* synthetic */ Context f28391d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C8985g(Context context) {
            super(0);
            this.f28391d = context;
        }

        public Object invoke() {
            return new FinderLiveDarkModePicker(this.f28391d);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8978g(Context context) {
        super(context);
        C87412m.m108594g(context, "context");
        View inflate = LayoutInflater.from(context).inflate(C0966R.C0971layout.cv4, this, true);
        C87412m.m108593f(inflate, "from(context).inflate(R.…ing_wiget_ui, this, true)");
        this.f28376h = inflate;
        View findViewById = inflate.findViewById(C0966R.C0970id.myv);
        findViewById.setOnClickListener(new C8981c(this));
        this.f28377i = findViewById;
        View findViewById2 = this.f28376h.findViewById(C0966R.C0970id.mz8);
        C87412m.m108593f(findViewById2, "root.findViewById(R.id.f…nouncement_level_content)");
        this.f28378j = (RelativeLayout) findViewById2;
        View findViewById3 = this.f28376h.findViewById(C0966R.C0970id.myw);
        findViewById3.setOnClickListener(new C8982d(this));
        this.f28379n = findViewById3;
        this.f28380o = C36568h.m40985a(new C8985g(context));
        getSelectView().setOptionsArray(getLevelArray());
        this.f28378j.removeAllViews();
        this.f28378j.setGravity(17);
        this.f28378j.addView(getSelectView().getView(), new RelativeLayout.LayoutParams(-2, -1));
        this.f28376h.findViewById(C0966R.C0970id.cte).setOnClickListener(new C8979a(this));
    }

    private final String[] getLevelArray() {
        return (String[]) ((C36570n) this.f28383r).getValue();
    }

    /* access modifiers changed from: private */
    public final C8980b getModifyAnnoucementLevelPage() {
        return (C8980b) ((C36570n) this.f28384s).getValue();
    }

    /* access modifiers changed from: private */
    public final FinderLiveDarkModePicker getSelectView() {
        return (FinderLiveDarkModePicker) ((C36570n) this.f28380o).getValue();
    }

    /* renamed from: d */
    public final void mo9790d(C12925w wVar, Integer num) {
        this.f28381p = num;
        C62042e.f176370a.mo87010H1(this);
        if (wVar != null) {
            wVar.mo12468h(getModifyAnnoucementLevelPage());
        }
    }

    public final C32226l<Integer, C13598b0> getBackClickListener() {
        return this.f28382q;
    }

    public final Integer getSelectedLevel() {
        return this.f28381p;
    }

    public final void setBackClickListener(C32226l<? super Integer, C13598b0> lVar) {
        this.f28382q = lVar;
    }

    public final void setSelectedLevel(Integer num) {
        this.f28381p = num;
    }
}
