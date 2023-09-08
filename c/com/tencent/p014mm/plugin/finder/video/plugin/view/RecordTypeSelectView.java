package com.tencent.p014mm.plugin.finder.video.plugin.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.C54257t;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.util.ArrayList;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import kotlin.Metadata;
import rx3.C13598b0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0002\u0012\u0013B\u0019\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u001e\u0010\u0007\u001a\u00020\u00062\u0016\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0002j\b\u0012\u0004\u0012\u00020\u0003`\u0004J\u001e\u0010\u000b\u001a\u00020\u00062\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0006\u0018\u00010\b¨\u0006\u0014"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/video/plugin/view/RecordTypeSelectView;", "Landroid/widget/RelativeLayout;", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "title", "Lrx3/b0;", "setData", "Lkotlin/Function1;", "", "listener", "setSelectChangeListener", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "a", "b", "plugin-vlog-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.video.plugin.view.RecordTypeSelectView */
public final class RecordTypeSelectView extends RelativeLayout {

    /* renamed from: d */
    public RecyclerView f161984d;

    /* renamed from: e */
    public ArrayList<String> f161985e = new ArrayList<>();

    /* renamed from: f */
    public int f161986f;

    /* renamed from: g */
    public C56542b f161987g;

    /* renamed from: h */
    public FinderFilterLayoutManager f161988h;

    /* renamed from: i */
    public C56541a f161989i;

    /* renamed from: j */
    public C32226l<? super Integer, C13598b0> f161990j;

    /* renamed from: n */
    public C32226l<? super Integer, C13598b0> f161991n;

    /* renamed from: com.tencent.mm.plugin.finder.video.plugin.view.RecordTypeSelectView$a */
    public final class C56541a extends C54257t {
        public C56541a() {
        }

        /* renamed from: c */
        public int[] mo75026c(RecyclerView.LayoutManager layoutManager, View view) {
            C87412m.m108594g(layoutManager, "layoutManager");
            C87412m.m108594g(view, "targetView");
            return super.mo75026c(layoutManager, view);
        }

        /* JADX WARNING: Removed duplicated region for block: B:13:0x0040  */
        /* renamed from: f */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public android.view.View mo75029f(androidx.recyclerview.widget.RecyclerView.LayoutManager r6) {
            /*
                r5 = this;
                android.view.View r6 = super.mo75029f(r6)
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "findSnapView "
                r0.append(r1)
                r1 = 0
                if (r6 == 0) goto L_0x0016
                java.lang.Object r2 = r6.getTag()
                goto L_0x0017
            L_0x0016:
                r2 = r1
            L_0x0017:
                r0.append(r2)
                java.lang.String r0 = r0.toString()
                java.lang.String r2 = "MicroMsg.RecordTypeSelectView"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)
                r0 = 0
                if (r6 == 0) goto L_0x003d
                com.tencent.mm.plugin.finder.video.plugin.view.RecordTypeSelectView r2 = com.tencent.p014mm.plugin.finder.video.plugin.view.RecordTypeSelectView.this
                int r2 = r2.f161986f
                java.lang.Object r3 = r6.getTag()
                boolean r4 = r3 instanceof java.lang.Integer
                if (r4 != 0) goto L_0x0033
                goto L_0x003d
            L_0x0033:
                java.lang.Number r3 = (java.lang.Number) r3
                int r3 = r3.intValue()
                if (r2 != r3) goto L_0x003d
                r2 = 1
                goto L_0x003e
            L_0x003d:
                r2 = 0
            L_0x003e:
                if (r2 != 0) goto L_0x0068
                com.tencent.mm.plugin.finder.video.plugin.view.RecordTypeSelectView r2 = com.tencent.p014mm.plugin.finder.video.plugin.view.RecordTypeSelectView.this
                if (r6 == 0) goto L_0x0048
                java.lang.Object r1 = r6.getTag()
            L_0x0048:
                java.lang.Integer r1 = (java.lang.Integer) r1
                if (r1 == 0) goto L_0x0050
                int r0 = r1.intValue()
            L_0x0050:
                r2.f161986f = r0
                com.tencent.mm.plugin.finder.video.plugin.view.RecordTypeSelectView r0 = com.tencent.p014mm.plugin.finder.video.plugin.view.RecordTypeSelectView.this
                fy3.l<? super java.lang.Integer, rx3.b0> r1 = r0.f161990j
                if (r1 == 0) goto L_0x0061
                int r0 = r0.f161986f
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                r1.invoke(r0)
            L_0x0061:
                com.tencent.mm.plugin.finder.video.plugin.view.RecordTypeSelectView r0 = com.tencent.p014mm.plugin.finder.video.plugin.view.RecordTypeSelectView.this
                com.tencent.mm.plugin.finder.video.plugin.view.RecordTypeSelectView$b r0 = r0.f161987g
                r0.notifyDataSetChanged()
            L_0x0068:
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.video.plugin.view.RecordTypeSelectView.C56541a.mo75029f(androidx.recyclerview.widget.RecyclerView$LayoutManager):android.view.View");
        }

        /* renamed from: g */
        public int mo75030g(RecyclerView.LayoutManager layoutManager, int i, int i2) {
            return super.mo75030g(layoutManager, i, i2);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.video.plugin.view.RecordTypeSelectView$b */
    public final class C56542b extends RecyclerView.C16613e<RecyclerView.C16631z> {

        /* renamed from: d */
        public Context f161993d;

        /* renamed from: e */
        public final /* synthetic */ RecordTypeSelectView f161994e;

        /* renamed from: com.tencent.mm.plugin.finder.video.plugin.view.RecordTypeSelectView$b$a */
        public static final class C56543a implements View.OnClickListener {

            /* renamed from: d */
            public final /* synthetic */ RecordTypeSelectView f161995d;

            /* renamed from: e */
            public final /* synthetic */ int f161996e;

            public C56543a(RecordTypeSelectView recordTypeSelectView, int i) {
                this.f161995d = recordTypeSelectView;
                this.f161996e = i;
            }

            public final void onClick(View view) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/plugin/finder/video/plugin/view/RecordTypeSelectView$RecordTypeAdapter$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                ((C56545c) this.f161995d.f161991n).invoke(Integer.valueOf(this.f161996e));
                C117292a.m165361g(this, "com/tencent/mm/plugin/finder/video/plugin/view/RecordTypeSelectView$RecordTypeAdapter$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        }

        /* renamed from: com.tencent.mm.plugin.finder.video.plugin.view.RecordTypeSelectView$b$b */
        public static final class C56544b extends RecyclerView.C16631z {
            public C56544b(View view) {
                super(view);
            }
        }

        public C56542b(RecordTypeSelectView recordTypeSelectView, Context context) {
            C87412m.m108594g(context, "context");
            this.f161994e = recordTypeSelectView;
            this.f161993d = context;
        }

        public int getItemCount() {
            return this.f161994e.f161985e.size();
        }

        public void onBindViewHolder(RecyclerView.C16631z zVar, int i) {
            C87412m.m108594g(zVar, "viewHolder");
            View view = zVar.f44854d;
            C87412m.m108592e(view, "null cannot be cast to non-null type android.widget.TextView");
            TextView textView = (TextView) view;
            textView.setText(this.f161994e.f161985e.get(i));
            float measureText = textView.getPaint().measureText(this.f161994e.f161985e.get(i)) + ((float) C76577a.m92157h(this.f161993d, C0966R.dimen.f3749d0));
            Log.m105918d("MicroMsg.RecordTypeSelectView", "onBindViewHolder pos:" + i + " width:" + measureText);
            ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
            C87412m.m108592e(layoutParams, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.LayoutParams");
            int i2 = 0;
            ((RecyclerView.LayoutParams) layoutParams).setMarginStart(i == 0 ? (C76577a.m92145A(this.f161993d) - ((int) measureText)) / 2 : 0);
            ViewGroup.LayoutParams layoutParams2 = textView.getLayoutParams();
            C87412m.m108592e(layoutParams2, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.LayoutParams");
            RecyclerView.LayoutParams layoutParams3 = (RecyclerView.LayoutParams) layoutParams2;
            if (i == getItemCount() - 1) {
                i2 = (C76577a.m92145A(this.f161993d) - ((int) measureText)) / 2;
            }
            layoutParams3.setMarginEnd(i2);
            textView.setAlpha(i == this.f161994e.f161986f ? 1.0f : 0.5f);
            textView.setTag(Integer.valueOf(i));
            textView.setOnClickListener(new C56543a(this.f161994e, i));
        }

        public RecyclerView.C16631z onCreateViewHolder(ViewGroup viewGroup, int i) {
            C87412m.m108594g(viewGroup, "parent");
            return new C56544b(LayoutInflater.from(this.f161993d).inflate(C0966R.C0971layout.aoq, viewGroup, false));
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.video.plugin.view.RecordTypeSelectView$c */
    public static final class C56545c extends C87413o implements C32226l<Integer, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ RecordTypeSelectView f161997d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C56545c(RecordTypeSelectView recordTypeSelectView) {
            super(1);
            this.f161997d = recordTypeSelectView;
        }

        public Object invoke(Object obj) {
            int intValue = ((Number) obj).intValue();
            RecordTypeSelectView recordTypeSelectView = this.f161997d;
            recordTypeSelectView.f161986f = intValue;
            C32226l<? super Integer, C13598b0> lVar = recordTypeSelectView.f161990j;
            if (lVar != null) {
                lVar.invoke(Integer.valueOf(intValue));
            }
            this.f161997d.f161987g.notifyDataSetChanged();
            FinderFilterLayoutManager finderFilterLayoutManager = this.f161997d.f161988h;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(Integer.valueOf(intValue));
            FinderFilterLayoutManager finderFilterLayoutManager2 = finderFilterLayoutManager;
            C117292a.m165358d(finderFilterLayoutManager2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/video/plugin/view/RecordTypeSelectView$itemClickListener$1", "invoke", "(I)V", "Undefined", "scrollToPosition", "(I)V");
            finderFilterLayoutManager.scrollToPosition(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(finderFilterLayoutManager2, "com/tencent/mm/plugin/finder/video/plugin/view/RecordTypeSelectView$itemClickListener$1", "invoke", "(I)V", "Undefined", "scrollToPosition", "(I)V");
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RecordTypeSelectView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
        this.f161987g = new C56542b(this, context);
        this.f161988h = new FinderFilterLayoutManager(context);
        this.f161989i = new C56541a();
        this.f161991n = new C56545c(this);
        LayoutInflater.from(context).inflate(C0966R.C0971layout.aor, this, true);
        View findViewById = findViewById(C0966R.C0970id.j_z);
        C87412m.m108593f(findViewById, "findViewById(R.id.select_type_list)");
        RecyclerView recyclerView = (RecyclerView) findViewById;
        this.f161984d = recyclerView;
        recyclerView.setLayoutManager(this.f161988h);
        this.f161984d.setAdapter(this.f161987g);
        this.f161989i.mo75025b(this.f161984d);
    }

    public final void setData(ArrayList<String> arrayList) {
        C87412m.m108594g(arrayList, FFmpegMetadataRetriever.METADATA_KEY_TITLE);
        this.f161985e.addAll(arrayList);
        this.f161987g.notifyDataSetChanged();
    }

    public final void setSelectChangeListener(C32226l<? super Integer, C13598b0> lVar) {
        this.f161990j = lVar;
    }
}
