package com.tencent.p014mm.p136ui.anim;

import android.content.Intent;
import android.graphics.Rect;
import android.os.Bundle;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.secdata.p843ui.MMSecDataActivity;
import fy3.C32224a;
import gj3.C59469a;
import gj3.C59473f;
import gj3.C59474h;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import k20.C9556a;
import kotlin.Metadata;
import ky3.C88334c;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import sx3.C64197v;
import zi3.C16213d;
import zi3.C53791g;
import zi3.C66832c;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/ui/anim/RepairerSharedElementDemo2;", "Lcom/tencent/mm/plugin/secdata/ui/MMSecDataActivity;", "<init>", "()V", "app_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.ui.anim.RepairerSharedElementDemo2 */
public class RepairerSharedElementDemo2 extends MMSecDataActivity {

    /* renamed from: j */
    public static List<Integer> f164996j;

    /* renamed from: d */
    public final List<Integer> f164997d = C64197v.m75537f(Integer.valueOf(C0966R.C0969drawable.bry), Integer.valueOf(C0966R.C0969drawable.f357386bs2), Integer.valueOf(C0966R.C0969drawable.f357387bs3), Integer.valueOf(C0966R.C0969drawable.bs4), Integer.valueOf(C0966R.C0969drawable.bs5), Integer.valueOf(C0966R.C0969drawable.bs6), Integer.valueOf(C0966R.C0969drawable.bs7), Integer.valueOf(C0966R.C0969drawable.bs8), Integer.valueOf(C0966R.C0969drawable.bs9), Integer.valueOf(C0966R.C0969drawable.brz), Integer.valueOf(C0966R.C0969drawable.f357384bs0), Integer.valueOf(C0966R.C0969drawable.f357385bs1));

    /* renamed from: e */
    public final C13601g f164998e = C36568h.m40985a(new C57641h(this));

    /* renamed from: f */
    public final C13601g f164999f = C36568h.m40985a(new C57640g(this));

    /* renamed from: g */
    public final C13601g f165000g = C36568h.m40985a(new C57637b(this));

    /* renamed from: h */
    public final C13601g f165001h = C36568h.m40985a(new C57636a(this));

    /* renamed from: i */
    public final LinkedList<Pair<View, String>> f165002i = new LinkedList<>();

    /* renamed from: com.tencent.mm.ui.anim.RepairerSharedElementDemo2$c */
    public static final class C44704c implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ RepairerSharedElementDemo2 f121227d;

        public C44704c(RepairerSharedElementDemo2 repairerSharedElementDemo2) {
            this.f121227d = repairerSharedElementDemo2;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/anim/RepairerSharedElementDemo2$initView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            this.f121227d.mo81983K7(Integer.parseInt(((EditText) ((C36570n) this.f121227d.f165000g).getValue()).getText().toString()));
            C117292a.m165361g(this, "com/tencent/mm/ui/anim/RepairerSharedElementDemo2$initView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.ui.anim.RepairerSharedElementDemo2$d */
    public static final class C44705d implements View.OnTouchListener {

        /* renamed from: d */
        public static final C44705d f121228d = new C44705d();

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/anim/RepairerSharedElementDemo2$initView$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
            boolean performClick = motionEvent.getAction() == 1 ? view.performClick() : false;
            C117292a.m165362h(performClick, this, "com/tencent/mm/ui/anim/RepairerSharedElementDemo2$initView$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            return performClick;
        }
    }

    /* renamed from: com.tencent.mm.ui.anim.RepairerSharedElementDemo2$a */
    public static final class C57636a extends C87413o implements C32224a<Button> {

        /* renamed from: d */
        public final /* synthetic */ RepairerSharedElementDemo2 f165003d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C57636a(RepairerSharedElementDemo2 repairerSharedElementDemo2) {
            super(0);
            this.f165003d = repairerSharedElementDemo2;
        }

        public Object invoke() {
            return (Button) this.f165003d.findViewById(C0966R.C0970id.o5b);
        }
    }

    /* renamed from: com.tencent.mm.ui.anim.RepairerSharedElementDemo2$b */
    public static final class C57637b extends C87413o implements C32224a<EditText> {

        /* renamed from: d */
        public final /* synthetic */ RepairerSharedElementDemo2 f165004d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C57637b(RepairerSharedElementDemo2 repairerSharedElementDemo2) {
            super(0);
            this.f165004d = repairerSharedElementDemo2;
        }

        public Object invoke() {
            return (EditText) this.f165004d.findViewById(C0966R.C0970id.o68);
        }
    }

    /* renamed from: com.tencent.mm.ui.anim.RepairerSharedElementDemo2$e */
    public static final class C57638e implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ RepairerSharedElementDemo2 f165005d;

        public C57638e(RepairerSharedElementDemo2 repairerSharedElementDemo2) {
            this.f165005d = repairerSharedElementDemo2;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/anim/RepairerSharedElementDemo2$initView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            Intent intent = new Intent(this.f165005d, RepairerSharedElementPreviewActivity2.class);
            Bundle a = C59473f.m69397a(((C59474h) this.f165005d.component(C59474h.class)).f169947e, view, (C59469a) null, (Intent) null, 6, (Object) null);
            RepairerSharedElementDemo2 repairerSharedElementDemo2 = this.f165005d;
            C9556a aVar = new C9556a();
            aVar.mo10233c(a);
            aVar.mo10233c(intent);
            RepairerSharedElementDemo2 repairerSharedElementDemo22 = repairerSharedElementDemo2;
            C117292a.m165358d(repairerSharedElementDemo22, aVar.mo10232b(), "com/tencent/mm/ui/anim/RepairerSharedElementDemo2$initView$3", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;Landroid/os/Bundle;)V");
            repairerSharedElementDemo2.startActivity((Intent) aVar.mo10231a(0), (Bundle) aVar.mo10231a(1));
            C117292a.m165359e(repairerSharedElementDemo22, "com/tencent/mm/ui/anim/RepairerSharedElementDemo2$initView$3", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;Landroid/os/Bundle;)V");
            C117292a.m165361g(this, "com/tencent/mm/ui/anim/RepairerSharedElementDemo2$initView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.ui.anim.RepairerSharedElementDemo2$f */
    public static final class C57639f extends RecyclerView.C0129l {

        /* renamed from: d */
        public final /* synthetic */ int f165006d;

        public C57639f(int i) {
            this.f165006d = i;
        }

        /* renamed from: g */
        public void mo21g(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C16628w wVar) {
            C87412m.m108594g(rect, "outRect");
            C87412m.m108594g(view, "view");
            C87412m.m108594g(recyclerView, "parent");
            C87412m.m108594g(wVar, "state");
            super.mo21g(rect, view, recyclerView, wVar);
            int i = this.f165006d;
            rect.bottom = i;
            rect.left = i / 2;
            rect.right = i / 2;
        }
    }

    /* renamed from: com.tencent.mm.ui.anim.RepairerSharedElementDemo2$g */
    public static final class C57640g extends C87413o implements C32224a<RecyclerView> {

        /* renamed from: d */
        public final /* synthetic */ RepairerSharedElementDemo2 f165007d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C57640g(RepairerSharedElementDemo2 repairerSharedElementDemo2) {
            super(0);
            this.f165007d = repairerSharedElementDemo2;
        }

        public Object invoke() {
            return (RecyclerView) this.f165007d.findViewById(C0966R.C0970id.o_g);
        }
    }

    /* renamed from: com.tencent.mm.ui.anim.RepairerSharedElementDemo2$h */
    public static final class C57641h extends C87413o implements C32224a<RecyclerView> {

        /* renamed from: d */
        public final /* synthetic */ RepairerSharedElementDemo2 f165008d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C57641h(RepairerSharedElementDemo2 repairerSharedElementDemo2) {
            super(0);
            this.f165008d = repairerSharedElementDemo2;
        }

        public Object invoke() {
            return (RecyclerView) this.f165008d.findViewById(C0966R.C0970id.o_i);
        }
    }

    /* renamed from: H7 */
    public final List<Integer> mo81980H7(int i) {
        LinkedList linkedList = new LinkedList();
        for (int i2 = 0; i2 < i; i2++) {
            linkedList.add(this.f164997d.get(C88334c.f255322d.mo122718g(this.f164997d.size())));
        }
        return linkedList;
    }

    /* renamed from: I7 */
    public final RecyclerView mo81981I7() {
        Object value = ((C36570n) this.f164998e).getValue();
        C87412m.m108593f(value, "<get-rvFold>(...)");
        return (RecyclerView) value;
    }

    /* renamed from: J7 */
    public void mo81982J7(List<Integer> list) {
        C87412m.m108594g(list, "dataList");
        int i = 1;
        if (list.size() > 1) {
            i = list.size() <= 4 ? 2 : 3;
        }
        this.f165002i.clear();
        mo81981I7().setLayoutManager(new GridLayoutManager(this, i));
        mo81981I7().setAdapter(new C66832c(list, 9, this.f165002i));
        int dimensionPixelSize = getResources().getDimensionPixelSize(C0966R.dimen.f3699bs);
        if (mo81981I7().getItemDecorationCount() > 0) {
            mo81981I7().mo17095k1(0);
        }
        mo81981I7().mo17085h0(new C57639f(dimensionPixelSize));
    }

    /* renamed from: K7 */
    public void mo81983K7(int i) {
        List<Integer> H7 = mo81980H7(i);
        mo81982J7(H7);
        ((EditText) ((C36570n) this.f165000g).getValue()).setText(String.valueOf(i));
        f164996j = H7;
    }

    public void finishAfterTransition() {
        finish();
    }

    public int getLayoutId() {
        return C0966R.C0971layout.d8k;
    }

    public void initView() {
        Object value = ((C36570n) this.f164999f).getValue();
        C87412m.m108593f(value, "<get-rvBtns>(...)");
        ((RecyclerView) value).setLayoutManager(new GridLayoutManager(this, 8));
        LinkedList linkedList = new LinkedList();
        for (int i = 1; i < 30; i++) {
            linkedList.add(Integer.valueOf(i));
        }
        Object value2 = ((C36570n) this.f164999f).getValue();
        C87412m.m108593f(value2, "<get-rvBtns>(...)");
        ((RecyclerView) value2).setAdapter(new C16213d(linkedList, new C53791g(this)));
        ((Button) ((C36570n) this.f165001h).getValue()).setOnClickListener(new C44704c(this));
        mo81983K7(9);
        mo81981I7().setOnTouchListener(C44705d.f121228d);
        mo81981I7().setOnClickListener(new C57638e(this));
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        initView();
    }
}
