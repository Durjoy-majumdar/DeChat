package com.tencent.p014mm.plugin.scanner.p101ui.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.tencent.midas.data.APMidasPluginInfo;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.plugin.scanner.p101ui.widget.ScanProductListLayout;
import com.tencent.p014mm.plugin.scanner.view.MultiRectView;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C8479f0;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import kotlin.Metadata;
import nl2.C109753o;
import rx3.C13598b0;
import sx3.C64197v;
import vl2.C37756o;
import zt3.C119157j;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001:\u0005\u001a\u001b\u001c\u001d\u001eB\u001d\b\u0016\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0016\u0010\u0017B%\b\u0016\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\u0006\u0010\u0018\u001a\u00020\t¢\u0006\u0004\b\u0016\u0010\u0019J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u0006\u0010\n\u001a\u00020\tR\"\u0010\u0011\u001a\u00020\t8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u001f"}, mo182094d2 = {"Lcom/tencent/mm/plugin/scanner/ui/widget/ScanProductMaskDecorView;", "Landroid/widget/FrameLayout;", "Lcom/tencent/mm/plugin/scanner/ui/widget/ScanProductMaskDecorView$d;", "callBack", "Lrx3/b0;", "setScanProductCallBack", "Lcom/tencent/mm/plugin/scanner/ui/widget/ScanProductMaskDecorView$e;", "listener", "setScanProductOnItemClickListener", "", "getTotalProductCount", "j", "I", "getLastId", "()I", "setLastId", "(I)V", "lastId", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "a", "b", "c", "d", "e", "plugin-scan_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.scanner.ui.widget.ScanProductMaskDecorView */
public final class ScanProductMaskDecorView extends FrameLayout {

    /* renamed from: n */
    public static HashMap<String, Bitmap> f316085n = new HashMap<>();

    /* renamed from: d */
    public RecyclerView f316086d;

    /* renamed from: e */
    public ScanProductListLayout f316087e;

    /* renamed from: f */
    public C106127b f316088f;

    /* renamed from: g */
    public float f316089g;

    /* renamed from: h */
    public C106130d f316090h;

    /* renamed from: i */
    public int f316091i;

    /* renamed from: j */
    public int f316092j = -1;

    /* renamed from: com.tencent.mm.plugin.scanner.ui.widget.ScanProductMaskDecorView$a */
    public static final class C106126a extends RecyclerView.C16631z {

        /* renamed from: z */
        public final View f316093z;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C106126a(View view) {
            super(view);
            C87412m.m108594g(view, "itemView");
            this.f316093z = view.findViewById(C0966R.C0970id.cir);
        }
    }

    /* renamed from: com.tencent.mm.plugin.scanner.ui.widget.ScanProductMaskDecorView$b */
    public static final class C106127b extends RecyclerView.C16613e<RecyclerView.C16631z> {

        /* renamed from: d */
        public final Context f316094d;

        /* renamed from: e */
        public final RecyclerView f316095e;

        /* renamed from: f */
        public final int f316096f = 1;

        /* renamed from: g */
        public final int f316097g = 2;

        /* renamed from: h */
        public int f316098h;

        /* renamed from: i */
        public final ArrayList<Integer> f316099i;

        /* renamed from: j */
        public final HashMap<Integer, C109753o> f316100j;

        /* renamed from: n */
        public C106131e f316101n;

        /* renamed from: o */
        public ArrayList<Integer> f316102o;

        /* renamed from: p */
        public View f316103p;

        /* renamed from: com.tencent.mm.plugin.scanner.ui.widget.ScanProductMaskDecorView$b$a */
        public static final class C106128a implements View.OnClickListener {

            /* renamed from: d */
            public final /* synthetic */ C8479f0<C109753o> f316104d;

            /* renamed from: e */
            public final /* synthetic */ C106127b f316105e;

            /* renamed from: f */
            public final /* synthetic */ int f316106f;

            public C106128a(C8479f0<C109753o> f0Var, C106127b bVar, int i) {
                this.f316104d = f0Var;
                this.f316105e = bVar;
                this.f316106f = i;
            }

            public final void onClick(View view) {
                int indexOf;
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/plugin/scanner/ui/widget/ScanProductMaskDecorView$ProductInfoAdapter$onBindViewHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                int i = 1;
                boolean z = false;
                Log.m105925i("MicroMsg.ScanProductMaskDecorView", "onScanProductItemClick reqKey: %s", ((C109753o) this.f316104d.f27484d).f328502i);
                C106131e eVar = this.f316105e.f316101n;
                if (eVar != null) {
                    C87412m.m108593f(view, LocaleUtil.ITALIAN);
                    C109753o oVar = (C109753o) this.f316104d.f27484d;
                    ArrayList<Integer> arrayList2 = this.f316105e.f316099i;
                    int size = arrayList2 == null ? 0 : arrayList2.size();
                    C106127b bVar = this.f316105e;
                    int i2 = this.f316106f;
                    ArrayList<Integer> arrayList3 = bVar.f316099i;
                    if (arrayList3 == null || arrayList3.isEmpty()) {
                        z = true;
                    }
                    if (!z && (indexOf = bVar.f316099i.indexOf(Integer.valueOf(i2))) != -1) {
                        i = 1 + indexOf;
                    }
                    eVar.mo24349a(view, oVar, size, i);
                }
                C117292a.m165361g(this, "com/tencent/mm/plugin/scanner/ui/widget/ScanProductMaskDecorView$ProductInfoAdapter$onBindViewHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        }

        public C106127b(Context context, RecyclerView recyclerView) {
            C87412m.m108594g(context, "context");
            C87412m.m108594g(recyclerView, "recyclerView");
            this.f316094d = context;
            this.f316095e = recyclerView;
            this.f316098h = context.getResources().getDimensionPixelSize(C0966R.dimen.f3749d0);
            this.f316099i = new ArrayList<>();
            this.f316100j = new HashMap<>();
            this.f316102o = new ArrayList<>();
        }

        public int getItemCount() {
            return this.f316099i.size() + 2;
        }

        public int getItemViewType(int i) {
            int i2 = this.f316097g;
            if (i == 0 || i > this.f316099i.size()) {
                i2 = this.f316096f;
            }
            Log.m105918d("MicroMsg.ScanProductMaskDecorView", "getItemViewType   dataSize:" + this.f316099i.size() + "  viewType" + i2 + "   pos:" + i);
            return i2;
        }

        public void onBindViewHolder(RecyclerView.C16631z zVar, int i) {
            T t;
            RecyclerView.C16631z zVar2 = zVar;
            int i2 = i;
            C87412m.m108594g(zVar2, "holder");
            Integer num = null;
            if (i2 == 0) {
                if (zVar2 instanceof C106126a) {
                    this.f316103p = ((C106126a) zVar2).f316093z;
                }
                StringBuilder sb = new StringBuilder();
                sb.append("onBindViewHolder  header EmptyViewHolder  recyclerViewHeight:");
                sb.append(this.f316095e.getHeight());
                sb.append("  mHeaderEmptyView:");
                View view = this.f316103p;
                if (view != null) {
                    num = Integer.valueOf(view.getHeight());
                }
                sb.append(num);
                sb.append("  topMargin:");
                ViewGroup.LayoutParams layoutParams = this.f316095e.getLayoutParams();
                C87412m.m108592e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                sb.append(((ViewGroup.MarginLayoutParams) layoutParams).topMargin);
                sb.append("  pos:");
                sb.append(i2);
                Log.m105924i("MicroMsg.ScanProductMaskDecorView", sb.toString());
                return;
            }
            boolean z = false;
            if (i2 > this.f316099i.size()) {
                if (zVar2 instanceof C106126a) {
                    View view2 = ((C106126a) zVar2).f316093z;
                    C9556a aVar = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar.mo10233c(8);
                    View view3 = view2;
                    C117292a.m165358d(view3, aVar.mo10232b(), "com/tencent/mm/plugin/scanner/ui/widget/ScanProductMaskDecorView$ProductInfoAdapter", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view2.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                    C117292a.m165359e(view3, "com/tencent/mm/plugin/scanner/ui/widget/ScanProductMaskDecorView$ProductInfoAdapter", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                Log.m105924i("MicroMsg.ScanProductMaskDecorView", "onBindViewHolder  footer EmptyViewHolder pos:" + i2);
                return;
            }
            Integer num2 = this.f316099i.get(i2 - 1);
            C87412m.m108593f(num2, "mProductInfoList[position - 1]");
            int intValue = num2.intValue();
            C8479f0 f0Var = new C8479f0();
            synchronized (this.f316100j) {
                t = this.f316100j.get(Integer.valueOf(intValue));
                f0Var.f27484d = t;
                C13598b0 b0Var = C13598b0.f38549a;
            }
            if (((C109753o) t) != null && (zVar2 instanceof C106129c)) {
                if (((C109753o) t).f328500g == 1 || ((C109753o) t).f328500g == 2 || ((C109753o) t).f328500g == 2) {
                    C106129c cVar = (C106129c) zVar2;
                    cVar.f316109C.setVisibility(0);
                    cVar.f316108B.setVisibility(8);
                    if (((C109753o) f0Var.f27484d).f328500g == 1) {
                        View view4 = cVar.f316110D;
                        C9556a aVar2 = new C9556a();
                        ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                        aVar2.mo10233c(4);
                        View view5 = view4;
                        C117292a.m165358d(view5, aVar2.mo10232b(), "com/tencent/mm/plugin/scanner/ui/widget/ScanProductMaskDecorView$ProductInfoAdapter", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view4.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                        C117292a.m165359e(view5, "com/tencent/mm/plugin/scanner/ui/widget/ScanProductMaskDecorView$ProductInfoAdapter", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                } else {
                    C106129c cVar2 = (C106129c) zVar2;
                    cVar2.f316108B.setVisibility(0);
                    cVar2.f316109C.setVisibility(8);
                    T t2 = f0Var.f27484d;
                    if (((C109753o) t2).f328500g == 4) {
                        View view6 = cVar2.f316110D;
                        C9556a aVar3 = new C9556a();
                        ThreadLocal<C9556a> threadLocal3 = C60958c.f173611a;
                        aVar3.mo10233c(0);
                        View view7 = view6;
                        C117292a.m165358d(view7, aVar3.mo10232b(), "com/tencent/mm/plugin/scanner/ui/widget/ScanProductMaskDecorView$ProductInfoAdapter", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view6.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                        C117292a.m165359e(view7, "com/tencent/mm/plugin/scanner/ui/widget/ScanProductMaskDecorView$ProductInfoAdapter", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        String str = (!C37756o.m41529a() || ((C109753o) f0Var.f27484d).f328496c == 1) ? "" : "后台识别：";
                        if (((C109753o) f0Var.f27484d).f328505l.length() > 0) {
                            TextView textView = cVar2.f316108B;
                            textView.setText(str + ((C109753o) f0Var.f27484d).f328505l);
                        } else {
                            TextView textView2 = cVar2.f316108B;
                            textView2.setText(str + this.f316094d.getString(C0966R.string.f361238ie2));
                        }
                    } else if (((C109753o) t2).f328500g == 3 || ((C109753o) t2).f328500g == 5) {
                        cVar2.f316108B.setText(this.f316094d.getString(C0966R.string.f361238ie2));
                        if (((C109753o) f0Var.f27484d).f328502i.length() == 0) {
                            View view8 = cVar2.f316110D;
                            C9556a aVar4 = new C9556a();
                            ThreadLocal<C9556a> threadLocal4 = C60958c.f173611a;
                            aVar4.mo10233c(4);
                            View view9 = view8;
                            C117292a.m165358d(view9, aVar4.mo10232b(), "com/tencent/mm/plugin/scanner/ui/widget/ScanProductMaskDecorView$ProductInfoAdapter", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            view8.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
                            C117292a.m165359e(view9, "com/tencent/mm/plugin/scanner/ui/widget/ScanProductMaskDecorView$ProductInfoAdapter", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        } else {
                            View view10 = cVar2.f316110D;
                            C9556a aVar5 = new C9556a();
                            ThreadLocal<C9556a> threadLocal5 = C60958c.f173611a;
                            aVar5.mo10233c(0);
                            View view11 = view10;
                            C117292a.m165358d(view11, aVar5.mo10232b(), "com/tencent/mm/plugin/scanner/ui/widget/ScanProductMaskDecorView$ProductInfoAdapter", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            view10.setVisibility(((Integer) aVar5.mo10231a(0)).intValue());
                            C117292a.m165359e(view11, "com/tencent/mm/plugin/scanner/ui/widget/ScanProductMaskDecorView$ProductInfoAdapter", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        }
                    }
                }
                if (((C109753o) f0Var.f27484d).f328502i.length() > 0) {
                    z = true;
                }
                if (z) {
                    ((C106129c) zVar2).f316111z.setOnClickListener(new C106128a(f0Var, this, intValue));
                } else {
                    ((C106129c) zVar2).f316111z.setOnClickListener((View.OnClickListener) null);
                }
                C106129c cVar3 = (C106129c) zVar2;
                cVar3.f316107A.setImageBitmap((Bitmap) null);
                cVar3.f316107A.setTag(Integer.valueOf(((C109753o) f0Var.f27484d).f328501h));
                int i3 = ((C109753o) f0Var.f27484d).f328501h;
                ImageView imageView = cVar3.f316107A;
                C87412m.m108593f(imageView, "holder.productInfoIconIv");
                T t3 = f0Var.f27484d;
                byte[] bArr = ((C109753o) t3).f328498e;
                int i4 = ((C109753o) t3).f328499f;
                HashMap<String, Bitmap> hashMap = ScanProductMaskDecorView.f316085n;
                Bitmap bitmap = ScanProductMaskDecorView.f316085n.get(String.valueOf(i3));
                if (bitmap == null || bitmap.isRecycled()) {
                    ((C119157j) C119157j.f356862d).mo183875f(new C106133a(i4, bArr, this, i3, imageView));
                } else {
                    imageView.setImageBitmap(bitmap);
                }
                StringBuilder sb4 = new StringBuilder();
                sb4.append("onBindViewHolder info:");
                sb4.append(f0Var.f27484d);
                sb4.append("  mHeaderEmptyView:");
                View view12 = this.f316103p;
                if (view12 != null) {
                    num = Integer.valueOf(view12.getHeight());
                }
                sb4.append(num);
                sb4.append("  topMargin:");
                ViewGroup.LayoutParams layoutParams2 = this.f316095e.getLayoutParams();
                C87412m.m108592e(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                sb4.append(((ViewGroup.MarginLayoutParams) layoutParams2).topMargin);
                sb4.append(" pos:");
                sb4.append(i2);
                Log.m105926v("MicroMsg.ScanProductMaskDecorView", sb4.toString());
            }
        }

        public RecyclerView.C16631z onCreateViewHolder(ViewGroup viewGroup, int i) {
            C87412m.m108594g(viewGroup, "parent");
            if (i == this.f316096f) {
                View inflate = View.inflate(viewGroup.getContext(), C0966R.C0971layout.bue, (ViewGroup) null);
                C87412m.m108593f(inflate, "view");
                return new C106126a(inflate);
            }
            View inflate2 = View.inflate(viewGroup.getContext(), C0966R.C0971layout.buf, (ViewGroup) null);
            C87412m.m108593f(inflate2, "view");
            return new C106129c(inflate2);
        }
    }

    /* renamed from: com.tencent.mm.plugin.scanner.ui.widget.ScanProductMaskDecorView$c */
    public static final class C106129c extends RecyclerView.C16631z {

        /* renamed from: A */
        public final ImageView f316107A;

        /* renamed from: B */
        public final TextView f316108B;

        /* renamed from: C */
        public final ProgressBar f316109C;

        /* renamed from: D */
        public final View f316110D;

        /* renamed from: z */
        public final ViewGroup f316111z;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C106129c(View view) {
            super(view);
            C87412m.m108594g(view, "itemView");
            this.f316111z = (ViewGroup) view.findViewById(C0966R.C0970id.j1n);
            this.f316107A = (ImageView) view.findViewById(C0966R.C0970id.j1m);
            TextView textView = (TextView) view.findViewById(C0966R.C0970id.j1p);
            C85875k4.m106189j0(textView.getPaint(), 0.8f);
            this.f316108B = textView;
            this.f316109C = (ProgressBar) view.findViewById(C0966R.C0970id.j1o);
            this.f316110D = view.findViewById(C0966R.C0970id.f6145yj);
        }
    }

    /* renamed from: com.tencent.mm.plugin.scanner.ui.widget.ScanProductMaskDecorView$d */
    public interface C106130d {
        /* renamed from: a */
        void mo24350a(int i);

        /* renamed from: b */
        void mo24351b(int i, long j, int i2);
    }

    /* renamed from: com.tencent.mm.plugin.scanner.ui.widget.ScanProductMaskDecorView$e */
    public interface C106131e {
        /* renamed from: a */
        void mo24349a(View view, C109753o oVar, int i, int i2);
    }

    /* renamed from: com.tencent.mm.plugin.scanner.ui.widget.ScanProductMaskDecorView$f */
    public static final class C106132f implements ScanProductListLayout.C106122a {

        /* renamed from: a */
        public final /* synthetic */ ScanProductMaskDecorView f316112a;

        public C106132f(ScanProductMaskDecorView scanProductMaskDecorView) {
            this.f316112a = scanProductMaskDecorView;
        }

        /* renamed from: a */
        public void mo151808a(int i) {
            ScanProductMaskDecorView scanProductMaskDecorView = this.f316112a;
            scanProductMaskDecorView.f316091i = i;
            if (i == 0) {
                C106127b bVar = scanProductMaskDecorView.f316088f;
            } else if (i == 2) {
                C106127b bVar2 = scanProductMaskDecorView.f316088f;
            }
            C106130d dVar = scanProductMaskDecorView.f316090h;
            if (dVar != null) {
                dVar.mo24350a(i);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ScanProductMaskDecorView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108591d(context);
        mo151814a();
    }

    /* renamed from: a */
    public final void mo151814a() {
        Log.m105924i("MicroMsg.ScanProductMaskDecorView", APMidasPluginInfo.LAUNCH_INTERFACE_INIT);
        View inflate = LayoutInflater.from(getContext()).inflate(C0966R.C0971layout.b4x, this);
        ScanProductListLayout scanProductListLayout = (ScanProductListLayout) inflate.findViewById(C0966R.C0970id.j1r);
        this.f316087e = scanProductListLayout;
        if (scanProductListLayout != null) {
            scanProductListLayout.setProductListCallBack(new C106132f(this));
        }
        this.f316086d = (RecyclerView) inflate.findViewById(C0966R.C0970id.ixk);
        Context context = getContext();
        C87412m.m108593f(context, "context");
        RecyclerView recyclerView = this.f316086d;
        C87412m.m108591d(recyclerView);
        C106127b bVar = new C106127b(context, recyclerView);
        this.f316088f = bVar;
        RecyclerView recyclerView2 = this.f316086d;
        if (recyclerView2 != null) {
            recyclerView2.setAdapter(bVar);
        }
        RecyclerView recyclerView3 = this.f316086d;
        if (recyclerView3 != null) {
            recyclerView3.setLayoutManager(new LinearLayoutManager(getContext(), 1, false));
        }
        addView(new MultiRectView(getContext()), new FrameLayout.LayoutParams(-1, -1));
        setWillNotDraw(false);
        this.f316089g = (float) C76577a.m92151b(getContext(), 16);
        C106127b bVar2 = this.f316088f;
        if (bVar2 != null) {
            bVar2.notifyDataSetChanged();
        }
    }

    /* renamed from: b */
    public final int mo151815b(List<C109753o> list) {
        C87412m.m108594g(list, "productItemList");
        C106127b bVar = this.f316088f;
        int i = -1;
        if (bVar != null) {
            Log.m105925i("MicroMsg.ScanProductMaskDecorView", "notifyUpdateProductItemList size: %s", Integer.valueOf(list.size()));
            int i2 = 0;
            boolean z = false;
            for (T next : list) {
                int i3 = i2 + 1;
                if (i2 >= 0) {
                    C109753o oVar = (C109753o) next;
                    C109753o oVar2 = bVar.f316100j.get(Integer.valueOf(oVar.f328501h));
                    if (oVar2 != null) {
                        oVar2.f328495b = oVar.f328495b;
                        oVar2.f328494a = oVar.f328494a;
                        oVar2.f328496c = oVar.f328496c;
                        oVar2.f328497d = oVar.f328497d;
                        oVar2.f328500g = oVar.f328500g;
                        oVar2.f328502i = oVar.f328502i;
                        oVar2.f328505l = oVar.f328505l;
                        oVar2.f328506m = oVar.f328506m;
                        oVar2.f328507n = oVar.f328507n;
                        oVar2.f328508o = oVar.f328508o;
                        oVar2.f328504k = oVar.f328504k;
                        int i4 = oVar.f328501h;
                        Iterator<Integer> it = bVar.f316099i.iterator();
                        int i5 = 0;
                        while (true) {
                            if (it.hasNext()) {
                                Integer next2 = it.next();
                                int i6 = i5 + 1;
                                if (i5 < 0) {
                                    C64197v.m75542k();
                                    throw null;
                                } else if (i4 == next2.intValue()) {
                                    bVar.notifyItemChanged(i6);
                                    i = i6;
                                    break;
                                } else {
                                    i5 = i6;
                                }
                            } else {
                                Iterator<Integer> it4 = bVar.f316102o.iterator();
                                int i7 = 0;
                                while (it4.hasNext()) {
                                    Integer next3 = it4.next();
                                    int i8 = i7 + 1;
                                    if (i7 >= 0) {
                                        int intValue = next3.intValue();
                                        Log.m105925i("MicroMsg.ScanProductMaskDecorView", "notifyItemChanged insert pending id: %s", Integer.valueOf(intValue));
                                        bVar.f316099i.add(0, Integer.valueOf(intValue));
                                        bVar.notifyItemInserted(1);
                                        i7 = i8;
                                    } else {
                                        C64197v.m75542k();
                                        throw null;
                                    }
                                }
                                bVar.f316102o.clear();
                                i = 1;
                            }
                        }
                        z = true;
                    }
                    Log.m105924i("MicroMsg.ScanProductMaskDecorView", "notifyUpdateProductItemList updated: " + z + ", source: " + oVar.f328494a + ", session: " + oVar.f328495b + ", scanImageType: " + oVar.f328496c + ", trackId: " + oVar.f328501h + ", reqKey: " + oVar.f328502i);
                    i2 = i3;
                } else {
                    C64197v.m75542k();
                    throw null;
                }
            }
        }
        return i;
    }

    /* renamed from: c */
    public final boolean mo151816c() {
        ScanProductListLayout scanProductListLayout = this.f316087e;
        if (scanProductListLayout == null || !scanProductListLayout.f316065r) {
            return false;
        }
        RecyclerView recyclerView = scanProductListLayout.f316056f;
        if (recyclerView != null) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            C117292a.m165358d(recyclerView, aVar.mo10232b(), "com/tencent/mm/plugin/scanner/ui/widget/ScanProductListLayout", "onBackPressed", "()Z", "Undefined", "scrollToPosition", "(I)V");
            recyclerView.mo17115r1(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(recyclerView, "com/tencent/mm/plugin/scanner/ui/widget/ScanProductListLayout", "onBackPressed", "()Z", "Undefined", "scrollToPosition", "(I)V");
        }
        scanProductListLayout.mo151798i();
        scanProductListLayout.f316065r = false;
        return true;
    }

    /* renamed from: d */
    public final void mo151817d(int i) {
        ScanProductListLayout scanProductListLayout = this.f316087e;
        if (scanProductListLayout != null) {
            C87412m.m108591d(scanProductListLayout);
            ViewGroup.LayoutParams layoutParams = scanProductListLayout.getLayoutParams();
            C87412m.m108592e(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
            layoutParams2.height = getHeight() / 2;
            layoutParams2.setMargins(0, 0, 0, i);
            ScanProductListLayout scanProductListLayout2 = this.f316087e;
            C87412m.m108591d(scanProductListLayout2);
            scanProductListLayout2.setLayoutParams(layoutParams2);
        }
    }

    public final int getLastId() {
        return this.f316092j;
    }

    public final int getTotalProductCount() {
        ArrayList<Integer> arrayList;
        C106127b bVar = this.f316088f;
        if (bVar == null || (arrayList = bVar.f316099i) == null) {
            return 0;
        }
        return arrayList.size();
    }

    public final void setLastId(int i) {
        this.f316092j = i;
    }

    public final void setScanProductCallBack(C106130d dVar) {
        C87412m.m108594g(dVar, "callBack");
        this.f316090h = dVar;
    }

    public final void setScanProductOnItemClickListener(C106131e eVar) {
        C87412m.m108594g(eVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        C106127b bVar = this.f316088f;
        if (bVar != null) {
            bVar.f316101n = eVar;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ScanProductMaskDecorView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108591d(context);
        mo151814a();
    }
}
