package qk1;

import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.util.ArrayList;
import java.util.List;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import uo3.C78253a;

/* renamed from: qk1.m2 */
public final class C12816m2 extends RecyclerView.C16613e<C12817a> {

    /* renamed from: d */
    public final MMActivity f36692d;

    /* renamed from: e */
    public final List<String> f36693e = new ArrayList();

    /* renamed from: f */
    public final C13601g f36694f = C36568h.m40985a(new C12820b(this));

    /* renamed from: g */
    public C32226l<? super String, C13598b0> f36695g;

    /* renamed from: qk1.m2$a */
    public final class C12817a extends RecyclerView.C16631z {

        /* renamed from: A */
        public final TextView f36696A;

        /* renamed from: B */
        public String f36697B = "";

        /* renamed from: C */
        public final /* synthetic */ C12816m2 f36698C;

        /* renamed from: z */
        public final View f36699z;

        /* renamed from: qk1.m2$a$a */
        public static final class C12818a implements View.OnTouchListener {

            /* renamed from: d */
            public static final C12818a f36700d = new C12818a();

            public final boolean onTouch(View view, MotionEvent motionEvent) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                arrayList.add(motionEvent);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveSensitiveWordAdapter$WordItemViewHolder$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
                if (motionEvent.getActionMasked() == 0) {
                    view.setTag(C0966R.C0970id.f359414kt0, new float[]{motionEvent.getRawX(), motionEvent.getRawY()});
                }
                C117292a.m165362h(false, this, "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveSensitiveWordAdapter$WordItemViewHolder$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
                return false;
            }
        }

        /* renamed from: qk1.m2$a$b */
        public static final class C12819b implements View.OnLongClickListener {

            /* renamed from: d */
            public final /* synthetic */ C12817a f36701d;

            public C12819b(C12817a aVar) {
                this.f36701d = aVar;
            }

            public final boolean onLongClick(View view) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveSensitiveWordAdapter$WordItemViewHolder$2", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
                Object tag = view.getTag(C0966R.C0970id.f359414kt0);
                C87412m.m108592e(tag, "null cannot be cast to non-null type kotlin.FloatArray");
                float[] fArr = (float[]) tag;
                C12817a aVar = this.f36701d;
                int i = (int) fArr[1];
                ((C78253a) ((C36570n) aVar.f36698C.f36694f).getValue()).mo108266a();
                ((C78253a) ((C36570n) aVar.f36698C.f36694f).getValue()).mo108273h(aVar.f44854d, new C12822n2(aVar), new C12824o2(aVar.f36698C, aVar), (int) fArr[0], i);
                C117292a.m165362h(true, this, "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveSensitiveWordAdapter$WordItemViewHolder$2", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
                return true;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C12817a(C12816m2 m2Var, View view) {
            super(view);
            C87412m.m108594g(view, "viewItem");
            this.f36698C = m2Var;
            this.f36699z = view;
            view.setOnTouchListener(C12818a.f36700d);
            view.setOnLongClickListener(new C12819b(this));
            View findViewById = view.findViewById(C0966R.C0970id.o09);
            C87412m.m108593f(findViewById, "viewItem.findViewById(R.id.word)");
            this.f36696A = (TextView) findViewById;
        }
    }

    /* renamed from: qk1.m2$b */
    public static final class C12820b extends C87413o implements C32224a<C78253a> {

        /* renamed from: d */
        public final /* synthetic */ C12816m2 f36702d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C12820b(C12816m2 m2Var) {
            super(0);
            this.f36702d = m2Var;
        }

        public Object invoke() {
            return new C78253a(this.f36702d.f36692d);
        }
    }

    public C12816m2(MMActivity mMActivity) {
        C87412m.m108594g(mMActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        this.f36692d = mMActivity;
    }

    public int getItemCount() {
        return ((ArrayList) this.f36693e).size();
    }

    public void onBindViewHolder(RecyclerView.C16631z zVar, int i) {
        C12817a aVar = (C12817a) zVar;
        C87412m.m108594g(aVar, "holder");
        String str = (String) ((ArrayList) this.f36693e).get(i);
        C87412m.m108594g(str, "word");
        aVar.f36697B = str;
        aVar.f36696A.setText(str);
    }

    public RecyclerView.C16631z onCreateViewHolder(ViewGroup viewGroup, int i) {
        C87412m.m108594g(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C0966R.C0971layout.d4h, viewGroup, false);
        C87412m.m108593f(inflate, "itemView");
        return new C12817a(this, inflate);
    }
}
