package zh1;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import gy3.C87412m;
import ig1.C8916d;
import j20.C117292a;
import java.util.LinkedList;
import java.util.List;
import k20.C60958c;
import k20.C9556a;
import te3.C50900q11;
import yh1.C16011a;

/* renamed from: zh1.f */
public final class C16203f {

    /* renamed from: a */
    public final Context f43406a;

    /* renamed from: b */
    public final ViewGroup f43407b;

    /* renamed from: c */
    public final C16011a f43408c;

    /* renamed from: d */
    public final View f43409d;

    /* renamed from: e */
    public final ImageView f43410e;

    /* renamed from: f */
    public final LinkedList<C50900q11> f43411f;

    /* renamed from: g */
    public final C16204a f43412g;

    /* renamed from: h */
    public C8916d f43413h;

    /* renamed from: i */
    public final RecyclerView f43414i;

    /* renamed from: zh1.f$a */
    public final class C16204a extends RecyclerView.C16613e<C16205a> {

        /* renamed from: d */
        public final List<C50900q11> f43415d;

        /* renamed from: e */
        public final /* synthetic */ C16203f f43416e;

        /* renamed from: zh1.f$a$a */
        public final class C16205a extends RecyclerView.C16631z {

            /* renamed from: A */
            public final TextView f43417A;

            /* renamed from: z */
            public final TextView f43418z;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C16205a(C16204a aVar, View view) {
                super(view);
                C87412m.m108594g(view, "view");
                View findViewById = view.findViewById(C0966R.C0970id.nsu);
                C87412m.m108593f(findViewById, "view.findViewById(R.id.content_tips)");
                this.f43418z = (TextView) findViewById;
                View findViewById2 = view.findViewById(C0966R.C0970id.br8);
                C87412m.m108593f(findViewById2, "view.findViewById(R.id.content)");
                this.f43417A = (TextView) findViewById2;
            }
        }

        public C16204a(C16203f fVar, List<? extends C50900q11> list) {
            C87412m.m108594g(list, "itemList");
            this.f43416e = fVar;
            this.f43415d = list;
        }

        /* renamed from: F4 */
        public final void mo14738F4(TextView textView) {
            try {
                textView.setTypeface(Typeface.createFromAsset(this.f43416e.f43406a.getAssets(), "fonts/SF-Pro-Display-BoldItalic.otf"));
            } catch (Exception e) {
                Log.m105921e("GiftBatchSelectToastWidget", "setLiveGiftTypeFace error", e);
            }
        }

        public int getItemCount() {
            return this.f43415d.size();
        }

        public void onBindViewHolder(RecyclerView.C16631z zVar, int i) {
            C16205a aVar = (C16205a) zVar;
            C87412m.m108594g(aVar, "holder");
            mo14738F4(aVar.f43418z);
            mo14738F4(aVar.f43417A);
            float f = 15.0f;
            aVar.f43417A.setTextSize(this.f43415d.size() > 5 ? 15.0f : 17.0f);
            TextView textView = aVar.f43418z;
            if (this.f43415d.size() <= 5) {
                f = 17.0f;
            }
            textView.setTextSize(f);
            aVar.f43417A.setText(String.valueOf(this.f43415d.get(i).f140088d));
            aVar.f44854d.setOnClickListener(new C16207g(this.f43416e, this, i));
        }

        public RecyclerView.C16631z onCreateViewHolder(ViewGroup viewGroup, int i) {
            C87412m.m108594g(viewGroup, "parent");
            View inflate = LayoutInflater.from(this.f43416e.f43406a).inflate(C0966R.C0971layout.d48, (ViewGroup) null);
            C87412m.m108593f(inflate, "rootView");
            return new C16205a(this, inflate);
        }
    }

    /* renamed from: zh1.f$b */
    public final class C16206b extends RecyclerView.C0129l {
        public C16206b() {
        }

        /* renamed from: g */
        public void mo21g(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C16628w wVar) {
            C87412m.m108594g(rect, "outRect");
            C87412m.m108594g(view, "view");
            C87412m.m108594g(recyclerView, "parent");
            C87412m.m108594g(wVar, "state");
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            C87412m.m108592e(layoutParams, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.LayoutParams");
            int b = ((RecyclerView.LayoutParams) layoutParams).mo17280b();
            Log.m105924i("GiftBatchSelectToastWidget", "getItemOffsets: pos: " + b);
            C16203f.this.f43411f.size();
            rect.left = b > 0 ? C16203f.this.f43411f.size() > 5 ? MMApplicationContext.getContext().getResources().getDimensionPixelSize(C0966R.dimen.f3743cv) : MMApplicationContext.getContext().getResources().getDimensionPixelSize(C0966R.dimen.f3745cw) : 0;
            rect.right = 0;
            rect.bottom = 0;
            rect.top = 0;
        }
    }

    public C16203f(Context context, ViewGroup viewGroup, C16011a aVar) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(viewGroup, "parentRoot");
        C87412m.m108594g(aVar, "onBatchSelect");
        this.f43406a = context;
        this.f43407b = viewGroup;
        this.f43408c = aVar;
        View inflate = LayoutInflater.from(context).inflate(C0966R.C0971layout.d46, (ViewGroup) null);
        this.f43409d = inflate;
        this.f43410e = (ImageView) inflate.findViewById(C0966R.C0970id.f6145yj);
        LinkedList<C50900q11> linkedList = new LinkedList<>();
        this.f43411f = linkedList;
        C16204a aVar2 = new C16204a(this, linkedList);
        this.f43412g = aVar2;
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(C0966R.C0970id.iiq);
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext(), 0, false));
        recyclerView.setVerticalFadingEdgeEnabled(false);
        recyclerView.setVerticalScrollBarEnabled(false);
        recyclerView.setOverScrollMode(2);
        recyclerView.setAdapter(aVar2);
        this.f43414i = recyclerView;
        recyclerView.mo17085h0(new C16206b());
    }

    /* renamed from: a */
    public final void mo14737a() {
        if (this.f43409d.getVisibility() == 0) {
            View view = this.f43409d;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(4);
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/live/gift/widget/GiftBatchSelectPanelWidget", "hideWidget", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/finder/live/gift/widget/GiftBatchSelectPanelWidget", "hideWidget", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f43407b.removeView(this.f43409d);
        }
    }
}
