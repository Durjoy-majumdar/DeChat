package com.tencent.p014mm.plugin.test;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ArrayList;
import kg3.C76577a;
import kotlin.Metadata;
import nj3.C88989a;
import o40.C61926c;
import oy2.C11790a;
import oy2.C11791b;
import oy2.C11792c;
import oy2.C11793d;
import oy2.C11794e;
import rx3.C13598b0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0007"}, mo182094d2 = {"Lcom/tencent/mm/plugin/test/ExMainSettings;", "Lcom/tencent/mm/ui/MMActivity;", "<init>", "()V", "a", "b", "c", "app_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
@C88989a(3)
/* renamed from: com.tencent.mm.plugin.test.ExMainSettings */
public final class ExMainSettings extends MMActivity {

    /* renamed from: f */
    public static final /* synthetic */ int f21569f = 0;

    /* renamed from: d */
    public RecyclerView f21570d;

    /* renamed from: e */
    public final ArrayList<C5627a> f21571e = new ArrayList<>();

    /* renamed from: com.tencent.mm.plugin.test.ExMainSettings$b */
    public static final class C5628b extends RecyclerView.C16613e<RecyclerView.C16631z> {

        /* renamed from: d */
        public final ArrayList<C5627a> f21576d;

        public C5628b(ArrayList<C5627a> arrayList) {
            C87412m.m108594g(arrayList, "list");
            this.f21576d = arrayList;
        }

        public int getItemCount() {
            return this.f21576d.size();
        }

        public void onBindViewHolder(RecyclerView.C16631z zVar, int i) {
            C87412m.m108594g(zVar, "_holder");
            C5629c cVar = (C5629c) zVar;
            C5627a aVar = this.f21576d.get(i);
            C87412m.m108593f(aVar, "list[position]");
            C5627a aVar2 = aVar;
            cVar.f21578B.setText(aVar2.f21572a);
            Integer num = aVar2.f21573b;
            if (num != null) {
                cVar.f21577A.setImageResource(num.intValue());
            }
            Drawable drawable = aVar2.f21574c;
            if (drawable != null) {
                cVar.f21577A.setImageDrawable(drawable);
            }
            cVar.f21579z.setOnClickListener(aVar2.f21575d);
        }

        public RecyclerView.C16631z onCreateViewHolder(ViewGroup viewGroup, int i) {
            C87412m.m108594g(viewGroup, "parent");
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C0966R.C0971layout.bxf, viewGroup, false);
            C87412m.m108593f(inflate, "from(parent.context)\n   …yout_item, parent, false)");
            return new C5629c(inflate);
        }
    }

    /* renamed from: com.tencent.mm.plugin.test.ExMainSettings$c */
    public static final class C5629c extends RecyclerView.C16631z {

        /* renamed from: A */
        public ImageView f21577A;

        /* renamed from: B */
        public TextView f21578B;

        /* renamed from: z */
        public View f21579z;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5629c(View view) {
            super(view);
            C87412m.m108594g(view, "itemView");
            View findViewById = view.findViewById(C0966R.C0970id.l8e);
            C87412m.m108593f(findViewById, "itemView.findViewById(co…n.story.R.id.view_layout)");
            this.f21579z = findViewById;
            View findViewById2 = view.findViewById(C0966R.C0970id.ann);
            C87412m.m108593f(findViewById2, "itemView.findViewById(co…gin.story.R.id.busi_icon)");
            this.f21577A = (ImageView) findViewById2;
            View findViewById3 = view.findViewById(C0966R.C0970id.h_d);
            C87412m.m108593f(findViewById3, "itemView.findViewById(R.id.name_tv)");
            this.f21578B = (TextView) findViewById3;
        }
    }

    /* renamed from: com.tencent.mm.plugin.test.ExMainSettings$d */
    public static final class C5630d implements MenuItem.OnMenuItemClickListener {

        /* renamed from: d */
        public final /* synthetic */ ExMainSettings f21580d;

        public C5630d(ExMainSettings exMainSettings) {
            this.f21580d = exMainSettings;
        }

        public final boolean onMenuItemClick(MenuItem menuItem) {
            this.f21580d.finish();
            return false;
        }
    }

    /* renamed from: com.tencent.mm.plugin.test.ExMainSettings$e */
    public static final class C5631e extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C5628b f21581d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5631e(C5628b bVar) {
            super(0);
            this.f21581d = bVar;
        }

        public Object invoke() {
            this.f21581d.notifyDataSetChanged();
            return C13598b0.f38549a;
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.bkw;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setMMTitle("");
        setBackBtn(new C5630d(this));
        this.f21571e.add(new C5627a("朋友圈", (int) C0966R.raw.friendactivity_refresh, (View.OnClickListener) new C11790a(this)));
        this.f21571e.add(new C5627a("Live", (int) C0966R.raw.panel_icon_live, (View.OnClickListener) new C11791b(this)));
        Drawable i = C76577a.m92158i(getContext(), C0966R.raw.icons_outlined_finder_icon);
        i.setColorFilter(new PorterDuffColorFilter(getContext().getResources().getColor(C0966R.color.Orange_100), PorterDuff.Mode.SRC_ATOP));
        this.f21571e.add(new C5627a("Finder", i, (View.OnClickListener) new C11792c(this)));
        if (BuildInfo.DEBUG) {
            this.f21571e.add(new C5627a("moveXlog", (Drawable) null, (View.OnClickListener) new C11793d(this)));
        }
        this.f21571e.add(new C5627a("VideoCompositionUI", (Drawable) null, (View.OnClickListener) new C11794e(this)));
        this.f21570d = (RecyclerView) findViewById(C0966R.C0970id.id7);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        RecyclerView recyclerView = this.f21570d;
        if (recyclerView != null) {
            recyclerView.setLayoutManager(linearLayoutManager);
        }
        C5628b bVar = new C5628b(this.f21571e);
        RecyclerView recyclerView2 = this.f21570d;
        if (recyclerView2 != null) {
            recyclerView2.setAdapter(bVar);
        }
        RecyclerView recyclerView3 = this.f21570d;
        if (recyclerView3 != null) {
            recyclerView3.setItemViewCacheSize(0);
        }
        C61926c.m72666K(0, new C5631e(bVar));
    }

    /* renamed from: com.tencent.mm.plugin.test.ExMainSettings$a */
    public static final class C5627a {

        /* renamed from: a */
        public String f21572a;

        /* renamed from: b */
        public Integer f21573b;

        /* renamed from: c */
        public Drawable f21574c;

        /* renamed from: d */
        public View.OnClickListener f21575d;

        public C5627a(String str, int i, View.OnClickListener onClickListener) {
            C87412m.m108594g(str, "name");
            C87412m.m108594g(onClickListener, "onClickListener");
            this.f21572a = str;
            this.f21573b = Integer.valueOf(i);
            this.f21575d = onClickListener;
        }

        public C5627a(String str, Drawable drawable, View.OnClickListener onClickListener) {
            C87412m.m108594g(str, "name");
            C87412m.m108594g(onClickListener, "onClickListener");
            this.f21572a = str;
            this.f21574c = drawable;
            this.f21575d = onClickListener;
        }
    }
}
