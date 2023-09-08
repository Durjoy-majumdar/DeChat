package yu2;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74933u4;
import com.tencent.p014mm.p136ui.widget.MMNumberCheckbox;
import com.tencent.p014mm.plugin.sns.model.C94866e1;
import com.tencent.p014mm.plugin.sns.model.C94897n1;
import com.tencent.p014mm.plugin.sns.model.C94901o;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C96983o3;
import com.tencent.xweb.file.XVFSFile;
import f40.C86709a0;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import iy3.C60641c;
import j20.C117292a;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import sx3.C110818d0;
import te3.C101804kv2;
import yu2.C102948i;

/* renamed from: yu2.d */
public final class C102923d extends C102948i {

    /* renamed from: e */
    public final Context f303785e;

    /* renamed from: f */
    public final C13601g f303786f = C36568h.m40985a(new C102938g(this));

    /* renamed from: g */
    public final C13601g f303787g = C36568h.m40985a(C102942l.f303821d);

    /* renamed from: h */
    public final C13601g f303788h = C36568h.m40985a(C102941j.f303820d);

    /* renamed from: i */
    public final C13601g f303789i = C36568h.m40985a(C102939h.f303818d);

    /* renamed from: j */
    public final C13601g f303790j = C36568h.m40985a(C102940i.f303819d);

    /* renamed from: n */
    public C102926c f303791n;

    /* renamed from: o */
    public C102925b f303792o;

    /* renamed from: p */
    public C102924a f303793p;

    /* renamed from: q */
    public C32224a<C13598b0> f303794q;

    /* renamed from: r */
    public C32224a<C13598b0> f303795r;

    /* renamed from: s */
    public int f303796s;

    /* renamed from: t */
    public int f303797t;

    /* renamed from: yu2.d$k */
    public static final class C66701k extends RecyclerView.C0130p {

        /* renamed from: d */
        public final /* synthetic */ C102923d f191743d;

        public C66701k(C102923d dVar) {
            this.f191743d = dVar;
        }

        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(recyclerView);
            arrayList.add(Integer.valueOf(i));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/sns/ui/picker/SnsAlbumPickerListAdapter$onAttachedToRecyclerView$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
            SnsMethodCalculate.markStartTimeMs("onScrollStateChanged", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter$onAttachedToRecyclerView$1");
            C87412m.m108594g(recyclerView, "recyclerView");
            C102923d dVar = this.f191743d;
            SnsMethodCalculate.markStartTimeMs("access$setMCurScrollState$p", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter");
            dVar.f303797t = i;
            SnsMethodCalculate.markEndTimeMs("access$setMCurScrollState$p", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter");
            super.onScrollStateChanged(recyclerView, i);
            SnsMethodCalculate.markEndTimeMs("onScrollStateChanged", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter$onAttachedToRecyclerView$1");
            C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/picker/SnsAlbumPickerListAdapter$onAttachedToRecyclerView$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
        }

        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(recyclerView);
            arrayList.add(Integer.valueOf(i));
            arrayList.add(Integer.valueOf(i2));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/sns/ui/picker/SnsAlbumPickerListAdapter$onAttachedToRecyclerView$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
            super.onScrolled(recyclerView, i, i2);
            C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/picker/SnsAlbumPickerListAdapter$onAttachedToRecyclerView$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
        }
    }

    /* renamed from: yu2.d$a */
    public interface C102924a {
        /* renamed from: a */
        void mo142649a(C102944e0 e0Var, View view);
    }

    /* renamed from: yu2.d$b */
    public interface C102925b {
        /* renamed from: a */
        void mo142650a(int i, int i2, int i3, int i4);
    }

    /* renamed from: yu2.d$c */
    public interface C102926c {
        /* renamed from: a */
        void mo142651a(List<C102944e0> list);
    }

    /* renamed from: yu2.d$d */
    public final class C102927d extends RecyclerView.C16631z {

        /* renamed from: A */
        public final /* synthetic */ C102923d f303798A;

        /* renamed from: z */
        public final C13601g f303799z;

        /* renamed from: yu2.d$d$a */
        public static final class C102928a extends C87413o implements C32224a<TextView> {

            /* renamed from: d */
            public final /* synthetic */ View f303800d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C102928a(View view) {
                super(0);
                this.f303800d = view;
            }

            public Object invoke() {
                SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter$LoadingViewHolder$loadingTv$2");
                SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter$LoadingViewHolder$loadingTv$2");
                TextView textView = (TextView) this.f303800d.findViewById(C0966R.C0970id.g2t);
                SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter$LoadingViewHolder$loadingTv$2");
                SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter$LoadingViewHolder$loadingTv$2");
                return textView;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C102927d(C102923d dVar, View view) {
            super(view);
            C87412m.m108594g(view, "view");
            this.f303798A = dVar;
            this.f303799z = C36568h.m40985a(new C102928a(view));
        }
    }

    /* renamed from: yu2.d$e */
    public final class C102929e extends RecyclerView.C16631z {

        /* renamed from: A */
        public final C13601g f303801A;

        /* renamed from: B */
        public final C13601g f303802B;

        /* renamed from: C */
        public final C13601g f303803C;

        /* renamed from: D */
        public final C13601g f303804D;

        /* renamed from: E */
        public final C13601g f303805E;

        /* renamed from: F */
        public final C13601g f303806F;

        /* renamed from: G */
        public final /* synthetic */ C102923d f303807G;

        /* renamed from: z */
        public final C13601g f303808z;

        /* renamed from: yu2.d$e$a */
        public static final class C102930a extends C87413o implements C32224a<MMNumberCheckbox> {

            /* renamed from: d */
            public final /* synthetic */ View f303809d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C102930a(View view) {
                super(0);
                this.f303809d = view;
            }

            public Object invoke() {
                SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter$SnsInfoViewHolder$checkbox$2");
                SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter$SnsInfoViewHolder$checkbox$2");
                MMNumberCheckbox mMNumberCheckbox = (MMNumberCheckbox) this.f303809d.findViewById(C0966R.C0970id.f358727gq0);
                SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter$SnsInfoViewHolder$checkbox$2");
                SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter$SnsInfoViewHolder$checkbox$2");
                return mMNumberCheckbox;
            }
        }

        /* renamed from: yu2.d$e$b */
        public static final class C102931b extends C87413o implements C32224a<ImageView> {

            /* renamed from: d */
            public final /* synthetic */ View f303810d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C102931b(View view) {
                super(0);
                this.f303810d = view;
            }

            public Object invoke() {
                SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter$SnsInfoViewHolder$ivMaskType$2");
                SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter$SnsInfoViewHolder$ivMaskType$2");
                ImageView imageView = (ImageView) this.f303810d.findViewById(C0966R.C0970id.kzg);
                SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter$SnsInfoViewHolder$ivMaskType$2");
                SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter$SnsInfoViewHolder$ivMaskType$2");
                return imageView;
            }
        }

        /* renamed from: yu2.d$e$c */
        public static final class C102932c extends C87413o implements C32224a<ImageView> {

            /* renamed from: d */
            public final /* synthetic */ View f303811d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C102932c(View view) {
                super(0);
                this.f303811d = view;
            }

            public Object invoke() {
                SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter$SnsInfoViewHolder$ivMediaMask$2");
                SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter$SnsInfoViewHolder$ivMediaMask$2");
                ImageView imageView = (ImageView) this.f303811d.findViewById(C0966R.C0970id.gqg);
                SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter$SnsInfoViewHolder$ivMediaMask$2");
                SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter$SnsInfoViewHolder$ivMediaMask$2");
                return imageView;
            }
        }

        /* renamed from: yu2.d$e$d */
        public static final class C102933d extends C87413o implements C32224a<ImageView> {

            /* renamed from: d */
            public final /* synthetic */ View f303812d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C102933d(View view) {
                super(0);
                this.f303812d = view;
            }

            public Object invoke() {
                SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter$SnsInfoViewHolder$ivPrivacy$2");
                SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter$SnsInfoViewHolder$ivPrivacy$2");
                ImageView imageView = (ImageView) this.f303812d.findViewById(C0966R.C0970id.i2u);
                SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter$SnsInfoViewHolder$ivPrivacy$2");
                SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter$SnsInfoViewHolder$ivPrivacy$2");
                return imageView;
            }
        }

        /* renamed from: yu2.d$e$e */
        public static final class C102934e extends C87413o implements C32224a<ImageView> {

            /* renamed from: d */
            public final /* synthetic */ View f303813d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C102934e(View view) {
                super(0);
                this.f303813d = view;
            }

            public Object invoke() {
                SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter$SnsInfoViewHolder$ivThumb$2");
                SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter$SnsInfoViewHolder$ivThumb$2");
                ImageView imageView = (ImageView) this.f303813d.findViewById(C0966R.C0970id.gqr);
                SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter$SnsInfoViewHolder$ivThumb$2");
                SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter$SnsInfoViewHolder$ivThumb$2");
                return imageView;
            }
        }

        /* renamed from: yu2.d$e$f */
        public static final class C102935f extends C87413o implements C32224a<TextView> {

            /* renamed from: d */
            public final /* synthetic */ View f303814d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C102935f(View view) {
                super(0);
                this.f303814d = view;
            }

            public Object invoke() {
                SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter$SnsInfoViewHolder$tvMaskDescription$2");
                SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter$SnsInfoViewHolder$tvMaskDescription$2");
                TextView textView = (TextView) this.f303814d.findViewById(C0966R.C0970id.kzi);
                SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter$SnsInfoViewHolder$tvMaskDescription$2");
                SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter$SnsInfoViewHolder$tvMaskDescription$2");
                return textView;
            }
        }

        /* renamed from: yu2.d$e$g */
        public static final class C102936g extends C87413o implements C32224a<View> {

            /* renamed from: d */
            public final /* synthetic */ View f303815d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C102936g(View view) {
                super(0);
                this.f303815d = view;
            }

            public Object invoke() {
                SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter$SnsInfoViewHolder$vMaskBottom$2");
                SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter$SnsInfoViewHolder$vMaskBottom$2");
                View findViewById = this.f303815d.findViewById(C0966R.C0970id.kze);
                SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter$SnsInfoViewHolder$vMaskBottom$2");
                SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter$SnsInfoViewHolder$vMaskBottom$2");
                return findViewById;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C102929e(C102923d dVar, View view) {
            super(view);
            C87412m.m108594g(view, "itemView");
            this.f303807G = dVar;
            this.f303808z = C36568h.m40985a(new C102934e(view));
            this.f303801A = C36568h.m40985a(new C102930a(view));
            this.f303802B = C36568h.m40985a(new C102935f(view));
            this.f303803C = C36568h.m40985a(new C102931b(view));
            this.f303804D = C36568h.m40985a(new C102933d(view));
            this.f303805E = C36568h.m40985a(new C102932c(view));
            this.f303806F = C36568h.m40985a(new C102936g(view));
        }

        /* renamed from: B */
        public final ImageView mo142652B() {
            SnsMethodCalculate.markStartTimeMs("getIvPrivacy", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter$SnsInfoViewHolder");
            Object value = ((C36570n) this.f303804D).getValue();
            C87412m.m108593f(value, "<get-ivPrivacy>(...)");
            ImageView imageView = (ImageView) value;
            SnsMethodCalculate.markEndTimeMs("getIvPrivacy", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter$SnsInfoViewHolder");
            return imageView;
        }

        /* renamed from: C */
        public final ImageView mo142653C() {
            SnsMethodCalculate.markStartTimeMs("getIvThumb", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter$SnsInfoViewHolder");
            Object value = ((C36570n) this.f303808z).getValue();
            C87412m.m108593f(value, "<get-ivThumb>(...)");
            ImageView imageView = (ImageView) value;
            SnsMethodCalculate.markEndTimeMs("getIvThumb", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter$SnsInfoViewHolder");
            return imageView;
        }

        /* renamed from: D */
        public final TextView mo142654D() {
            SnsMethodCalculate.markStartTimeMs("getTvMaskDescription", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter$SnsInfoViewHolder");
            Object value = ((C36570n) this.f303802B).getValue();
            C87412m.m108593f(value, "<get-tvMaskDescription>(...)");
            TextView textView = (TextView) value;
            SnsMethodCalculate.markEndTimeMs("getTvMaskDescription", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter$SnsInfoViewHolder");
            return textView;
        }

        /* renamed from: y */
        public final MMNumberCheckbox mo142655y() {
            SnsMethodCalculate.markStartTimeMs("getCheckbox", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter$SnsInfoViewHolder");
            Object value = ((C36570n) this.f303801A).getValue();
            C87412m.m108593f(value, "<get-checkbox>(...)");
            MMNumberCheckbox mMNumberCheckbox = (MMNumberCheckbox) value;
            SnsMethodCalculate.markEndTimeMs("getCheckbox", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter$SnsInfoViewHolder");
            return mMNumberCheckbox;
        }

        /* renamed from: z */
        public final ImageView mo142656z() {
            SnsMethodCalculate.markStartTimeMs("getIvMaskType", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter$SnsInfoViewHolder");
            Object value = ((C36570n) this.f303803C).getValue();
            C87412m.m108593f(value, "<get-ivMaskType>(...)");
            ImageView imageView = (ImageView) value;
            SnsMethodCalculate.markEndTimeMs("getIvMaskType", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter$SnsInfoViewHolder");
            return imageView;
        }
    }

    /* renamed from: yu2.d$f */
    public final class C102937f extends RecyclerView.C16631z {

        /* renamed from: z */
        public final /* synthetic */ C102923d f303816z;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C102937f(C102923d dVar, View view) {
            super(view);
            C87412m.m108594g(view, "itemView");
            this.f303816z = dVar;
        }
    }

    /* renamed from: yu2.d$g */
    public static final class C102938g extends C87413o implements C32224a<C102951j> {

        /* renamed from: d */
        public final /* synthetic */ C102923d f303817d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C102938g(C102923d dVar) {
            super(0);
            this.f303817d = dVar;
        }

        public Object invoke() {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter$mHelper$2");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter$mHelper$2");
            C102923d dVar = this.f303817d;
            dVar.getClass();
            SnsMethodCalculate.markStartTimeMs("initSnsAlbumAdapterHelper", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter");
            C102947h hVar = new C102947h(dVar);
            String O4 = dVar.mo142669O4();
            SnsMethodCalculate.markStartTimeMs("isMySelf", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapterBase");
            boolean b = C87412m.m108589b(C86709a0.m107535s().mo121142i().mo119684e(2, (Object) null), dVar.mo142669O4());
            SnsMethodCalculate.markEndTimeMs("isMySelf", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapterBase");
            C102951j jVar = new C102951j(hVar, O4, b);
            SnsMethodCalculate.markEndTimeMs("initSnsAlbumAdapterHelper", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter$mHelper$2");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter$mHelper$2");
            return jVar;
        }
    }

    /* renamed from: yu2.d$h */
    public static final class C102939h extends C87413o implements C32224a<Map<String, C102944e0>> {

        /* renamed from: d */
        public static final C102939h f303818d = new C102939h();

        public C102939h() {
            super(0);
        }

        public Object invoke() {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter$mObjIdMediaInfoMap$2");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter$mObjIdMediaInfoMap$2");
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter$mObjIdMediaInfoMap$2");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter$mObjIdMediaInfoMap$2");
            return linkedHashMap;
        }
    }

    /* renamed from: yu2.d$i */
    public static final class C102940i extends C87413o implements C32224a<LinkedHashSet<Integer>> {

        /* renamed from: d */
        public static final C102940i f303819d = new C102940i();

        public C102940i() {
            super(0);
        }

        public Object invoke() {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter$mTimeHeaderPosSet$2");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter$mTimeHeaderPosSet$2");
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter$mTimeHeaderPosSet$2");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter$mTimeHeaderPosSet$2");
            return linkedHashSet;
        }
    }

    /* renamed from: yu2.d$j */
    public static final class C102941j extends C87413o implements C32224a<List<C102944e0>> {

        /* renamed from: d */
        public static final C102941j f303820d = new C102941j();

        public C102941j() {
            super(0);
        }

        public Object invoke() {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter$mVisibleSnsMediaInfoList$2");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter$mVisibleSnsMediaInfoList$2");
            ArrayList arrayList = new ArrayList();
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter$mVisibleSnsMediaInfoList$2");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter$mVisibleSnsMediaInfoList$2");
            return arrayList;
        }
    }

    /* renamed from: yu2.d$l */
    public static final class C102942l extends C87413o implements C32224a<List<C102944e0>> {

        /* renamed from: d */
        public static final C102942l f303821d = new C102942l();

        public C102942l() {
            super(0);
        }

        public Object invoke() {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter$selectedSnsInfoList$2");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter$selectedSnsInfoList$2");
            ArrayList arrayList = new ArrayList();
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter$selectedSnsInfoList$2");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter$selectedSnsInfoList$2");
            return arrayList;
        }
    }

    public C102923d(Context context) {
        C87412m.m108594g(context, "context");
        this.f303785e = context;
    }

    /* renamed from: N5 */
    public static final /* synthetic */ List m136072N5(C102923d dVar) {
        SnsMethodCalculate.markStartTimeMs("access$getDataListRef", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter");
        List<C102944e0> P5 = dVar.mo142642P5();
        SnsMethodCalculate.markEndTimeMs("access$getDataListRef", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter");
        return P5;
    }

    /* renamed from: O5 */
    public final Context mo142641O5() {
        SnsMethodCalculate.markStartTimeMs("getContext", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter");
        Context context = this.f303785e;
        SnsMethodCalculate.markEndTimeMs("getContext", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter");
        return context;
    }

    /* renamed from: P5 */
    public final List<C102944e0> mo142642P5() {
        SnsMethodCalculate.markStartTimeMs("getDataListRef", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter");
        SnsMethodCalculate.markStartTimeMs("getMVisibleSnsMediaInfoList", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter");
        List<C102944e0> list = (List) ((C36570n) this.f303788h).getValue();
        SnsMethodCalculate.markEndTimeMs("getMVisibleSnsMediaInfoList", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter");
        SnsMethodCalculate.markEndTimeMs("getDataListRef", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter");
        return list;
    }

    /* renamed from: Q5 */
    public final int mo142643Q5(C102944e0 e0Var) {
        SnsMethodCalculate.markStartTimeMs("getItemPos", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter");
        int indexOf = mo142642P5().indexOf(e0Var);
        SnsMethodCalculate.markEndTimeMs("getItemPos", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter");
        return indexOf;
    }

    /* renamed from: R5 */
    public final C102951j mo142644R5() {
        SnsMethodCalculate.markStartTimeMs("getMHelper", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter");
        C102951j jVar = (C102951j) ((C36570n) this.f303786f).getValue();
        SnsMethodCalculate.markEndTimeMs("getMHelper", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter");
        return jVar;
    }

    /* renamed from: S5 */
    public final List<C102944e0> mo142645S5() {
        SnsMethodCalculate.markStartTimeMs("getSelectedSnsInfoList", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter");
        List<C102944e0> list = (List) ((C36570n) this.f303787g).getValue();
        SnsMethodCalculate.markEndTimeMs("getSelectedSnsInfoList", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter");
        return list;
    }

    /* renamed from: T5 */
    public final void mo142646T5() {
        SnsMethodCalculate.markStartTimeMs("hideLoadingView", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter");
        if ((!mo142642P5().isEmpty()) && mo142644R5().mo142674d((C102944e0) C110818d0.m150923U(mo142642P5()))) {
            notifyItemRemoved(mo142642P5().size() - 1);
            mo142642P5().remove(mo142642P5().size() - 1);
        }
        SnsMethodCalculate.markEndTimeMs("hideLoadingView", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter");
    }

    /* renamed from: U5 */
    public final void mo142647U5() {
        SnsMethodCalculate.markStartTimeMs("pullDataFromSnsStorage", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter");
        C102951j R5 = mo142644R5();
        C102948i.C102949a G4 = mo142668G4();
        G4.getClass();
        SnsMethodCalculate.markStartTimeMs("getMLimitSeq", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapterBase$SnsInfoArguments");
        String str = G4.f303832a;
        SnsMethodCalculate.markEndTimeMs("getMLimitSeq", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapterBase$SnsInfoArguments");
        mo142668G4().getClass();
        SnsMethodCalculate.markStartTimeMs("getMIsPrivacy", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapterBase$SnsInfoArguments");
        SnsMethodCalculate.markEndTimeMs("getMIsPrivacy", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapterBase$SnsInfoArguments");
        R5.getClass();
        SnsMethodCalculate.markStartTimeMs("resetCursor", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapterHelper");
        C87412m.m108594g(str, "limitSeq");
        Log.m105918d("MicroMsg.SnsAlbumPickerListAdapterHelper", "resetCursor limitSeq = " + str + " , isPrivate = " + false + " ,isWork = " + true + ' ');
        R5.f303844h = str;
        R5.mo133228a(true);
        SnsMethodCalculate.markEndTimeMs("resetCursor", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapterHelper");
        SnsMethodCalculate.markEndTimeMs("pullDataFromSnsStorage", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter");
    }

    /* renamed from: V5 */
    public void mo142648V5(boolean z) {
        SnsMethodCalculate.markStartTimeMs("setDataLoadAll", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter");
        SnsMethodCalculate.markStartTimeMs("setDataLoadAll", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapterBase");
        C102948i.C102949a G4 = mo142668G4();
        G4.getClass();
        SnsMethodCalculate.markStartTimeMs("setMAllPageDataLoadFinish", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapterBase$SnsInfoArguments");
        G4.f303837f = z;
        SnsMethodCalculate.markEndTimeMs("setMAllPageDataLoadFinish", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapterBase$SnsInfoArguments");
        SnsMethodCalculate.markEndTimeMs("setDataLoadAll", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapterBase");
        if (z) {
            mo142646T5();
        }
        SnsMethodCalculate.markEndTimeMs("setDataLoadAll", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter");
    }

    public int getItemCount() {
        SnsMethodCalculate.markStartTimeMs("getItemCount", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter");
        int size = mo142642P5().size();
        SnsMethodCalculate.markEndTimeMs("getItemCount", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter");
        return size;
    }

    public int getItemViewType(int i) {
        int i2;
        SnsMethodCalculate.markStartTimeMs("getItemViewType", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter");
        if (i >= mo142642P5().size()) {
            SnsMethodCalculate.markEndTimeMs("getItemViewType", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter");
            return -1;
        }
        C102944e0 e0Var = mo142642P5().get(i);
        if (mo142644R5().mo142675e(e0Var)) {
            SnsMethodCalculate.markStartTimeMs("getMTimeHeaderPosSet", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter");
            SnsMethodCalculate.markEndTimeMs("getMTimeHeaderPosSet", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter");
            ((Set) ((C36570n) this.f303790j).getValue()).add(Integer.valueOf(i));
            i2 = 2;
        } else {
            i2 = mo142644R5().mo142674d(e0Var) ? 4 : 1;
        }
        SnsMethodCalculate.markEndTimeMs("getItemViewType", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter");
        return i2;
    }

    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        SnsMethodCalculate.markStartTimeMs("onAttachedToRecyclerView", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter");
        C87412m.m108594g(recyclerView, "recyclerView");
        recyclerView.mo17043c(new C66701k(this));
        super.onAttachedToRecyclerView(recyclerView);
        SnsMethodCalculate.markEndTimeMs("onAttachedToRecyclerView", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter");
    }

    public void onBindViewHolder(RecyclerView.C16631z zVar, int i) {
        String str;
        RecyclerView.C16631z zVar2 = zVar;
        int i2 = i;
        SnsMethodCalculate.markStartTimeMs("onBindViewHolder", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter");
        C87412m.m108594g(zVar2, "holder");
        SnsMethodCalculate.markStartTimeMs("checkPreload", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter");
        C32224a<C13598b0> aVar = this.f303794q;
        if (!(aVar == null || i2 != Math.max((getItemCount() - 1) - this.f303796s, 0) || this.f303797t == 0)) {
            aVar.invoke();
        }
        SnsMethodCalculate.markEndTimeMs("checkPreload", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter");
        if (zVar2 instanceof C102929e) {
            C102929e eVar = (C102929e) zVar2;
            SnsMethodCalculate.markStartTimeMs("onBind", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter$SnsInfoViewHolder");
            if (m136072N5(eVar.f303807G).size() <= i2) {
                SnsMethodCalculate.markEndTimeMs("onBind", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter$SnsInfoViewHolder");
            } else {
                C102944e0 e0Var = (C102944e0) m136072N5(eVar.f303807G).get(i2);
                C101804kv2 b = e0Var.mo142659b();
                eVar.f44854d.setTag(C0966R.C0970id.jrl, Integer.valueOf(i));
                eVar.f44854d.setTag(C0966R.C0970id.jrm, 1);
                eVar.f44854d.setOnClickListener(new C102943e(eVar.f303807G, e0Var, eVar));
                eVar.mo142653C().setScaleType(ImageView.ScaleType.CENTER_CROP);
                eVar.mo142653C().setBackgroundColor(eVar.f303807G.mo142641O5().getResources().getColor(C0966R.color.acp));
                C94901o Fx0 = C94866e1.Fx0();
                ImageView C = eVar.mo142653C();
                int hashCode = eVar.mo142653C().getContext().hashCode();
                C94901o.C94911h hVar = C94901o.C94911h.IMG_SCENE_SNSUSER;
                C96983o3 o3Var = new C96983o3("album_self");
                Fx0.getClass();
                SnsMethodCalculate.markStartTimeMs("setSnsGrid", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
                C101804kv2 kv22 = b;
                Fx0.mo131102V(b, C, C0966R.C0969drawable.aly, hashCode, hVar, o3Var);
                SnsMethodCalculate.markEndTimeMs("setSnsGrid", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
                if (kv22.f298690e == 6) {
                    SnsMethodCalculate.markStartTimeMs("getVMaskBottom", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter$SnsInfoViewHolder");
                    Object value = ((C36570n) eVar.f303806F).getValue();
                    C87412m.m108593f(value, "<get-vMaskBottom>(...)");
                    View view = (View) value;
                    SnsMethodCalculate.markEndTimeMs("getVMaskBottom", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter$SnsInfoViewHolder");
                    C9556a aVar2 = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar2.mo10233c(0);
                    View view2 = view;
                    C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/sns/ui/picker/SnsAlbumPickerListAdapter$SnsInfoViewHolder", "onBind", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                    C117292a.m165359e(view2, "com/tencent/mm/plugin/sns/ui/picker/SnsAlbumPickerListAdapter$SnsInfoViewHolder", "onBind", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    eVar.mo142656z().setVisibility(0);
                    eVar.mo142656z().setImageResource(C0966R.raw.video_icon_in_gird);
                    eVar.mo142654D().setVisibility(0);
                    TextView D = eVar.mo142654D();
                    C102923d dVar = eVar.f303807G;
                    SnsMethodCalculate.markStartTimeMs("access$getMHelper", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter");
                    C102951j R5 = dVar.mo142644R5();
                    SnsMethodCalculate.markEndTimeMs("access$getMHelper", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter");
                    float f = kv22.f298684R;
                    R5.getClass();
                    SnsMethodCalculate.markStartTimeMs("secondFloatTime2String", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapterHelper");
                    if (f <= 0.0f) {
                        SnsMethodCalculate.markEndTimeMs("secondFloatTime2String", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapterHelper");
                        str = "--:--";
                    } else {
                        int b2 = C60641c.m70921b(f);
                        String valueOf = String.valueOf(b2 % 60);
                        if (valueOf.length() < 2) {
                            valueOf = '0' + valueOf;
                        }
                        str = (b2 / 60) + XVFSFile.PATH_SEPARATOR_CHAR + valueOf;
                        SnsMethodCalculate.markEndTimeMs("secondFloatTime2String", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapterHelper");
                    }
                    D.setText(str);
                } else {
                    SnsMethodCalculate.markStartTimeMs("getVMaskBottom", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter$SnsInfoViewHolder");
                    Object value2 = ((C36570n) eVar.f303806F).getValue();
                    C87412m.m108593f(value2, "<get-vMaskBottom>(...)");
                    View view3 = (View) value2;
                    SnsMethodCalculate.markEndTimeMs("getVMaskBottom", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter$SnsInfoViewHolder");
                    C9556a aVar3 = new C9556a();
                    ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                    aVar3.mo10233c(4);
                    View view4 = view3;
                    C117292a.m165358d(view4, aVar3.mo10232b(), "com/tencent/mm/plugin/sns/ui/picker/SnsAlbumPickerListAdapter$SnsInfoViewHolder", "onBind", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view3.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                    C117292a.m165359e(view4, "com/tencent/mm/plugin/sns/ui/picker/SnsAlbumPickerListAdapter$SnsInfoViewHolder", "onBind", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    eVar.mo142656z().setVisibility(4);
                    eVar.mo142654D().setVisibility(4);
                }
                C102923d dVar2 = eVar.f303807G;
                SnsMethodCalculate.markStartTimeMs("access$getMHelper", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter");
                C102951j R52 = dVar2.mo142644R5();
                SnsMethodCalculate.markEndTimeMs("access$getMHelper", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter");
                SnsInfo a = e0Var.mo142658a();
                C102948i.C102949a G4 = eVar.f303807G.mo142668G4();
                G4.getClass();
                SnsMethodCalculate.markStartTimeMs("getMIsSelf", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapterBase$SnsInfoArguments");
                boolean z = G4.f303834c;
                SnsMethodCalculate.markEndTimeMs("getMIsSelf", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapterBase$SnsInfoArguments");
                R52.getClass();
                SnsMethodCalculate.markStartTimeMs("checkSnsInfoPrivate", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapterHelper");
                C87412m.m108594g(a, "snsInfo");
                boolean i3 = C94897n1.m120371i(a.getLocalPrivate(), z);
                SnsMethodCalculate.markEndTimeMs("checkSnsInfoPrivate", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapterHelper");
                if (i3) {
                    eVar.mo142652B().setVisibility(0);
                    eVar.mo142652B().setImageDrawable(C74933u4.m89768e(eVar.f303807G.mo142641O5(), C0966R.raw.icons_filled_lock, eVar.f303807G.mo142641O5().getResources().getColor(C0966R.color.f2975b6)));
                } else {
                    eVar.mo142652B().setVisibility(4);
                }
                eVar.mo142655y().setTag(C0966R.C0970id.jrl, Integer.valueOf(i));
                eVar.mo142655y().setVisibility(0);
                eVar.mo142655y().setOnClickListener(new C102945f(eVar.f303807G));
                int b3 = C76577a.m92151b(eVar.f303807G.mo142641O5(), 20);
                ViewParent parent = eVar.mo142655y().getParent();
                View view5 = parent instanceof View ? (View) parent : null;
                if (view5 != null) {
                    view5.post(new C102946g(eVar, b3));
                }
                C102923d dVar3 = eVar.f303807G;
                SnsMethodCalculate.markStartTimeMs("access$getSelectedSnsInfoList", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter");
                List<C102944e0> S5 = dVar3.mo142645S5();
                SnsMethodCalculate.markEndTimeMs("access$getSelectedSnsInfoList", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter");
                if (S5.contains(e0Var)) {
                    MMNumberCheckbox y = eVar.mo142655y();
                    C102923d dVar4 = eVar.f303807G;
                    SnsMethodCalculate.markStartTimeMs("access$getSelectedSnsInfoList", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter");
                    List<C102944e0> S52 = dVar4.mo142645S5();
                    SnsMethodCalculate.markEndTimeMs("access$getSelectedSnsInfoList", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter");
                    y.setCheckedNumber(S52.indexOf(e0Var) + 1);
                    SnsMethodCalculate.markStartTimeMs("getIvMediaMask", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter$SnsInfoViewHolder");
                    Object value3 = ((C36570n) eVar.f303805E).getValue();
                    C87412m.m108593f(value3, "<get-ivMediaMask>(...)");
                    ImageView imageView = (ImageView) value3;
                    SnsMethodCalculate.markEndTimeMs("getIvMediaMask", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter$SnsInfoViewHolder");
                    imageView.setVisibility(0);
                    imageView.setBackgroundResource(C0966R.color.UN_BW_0_Alpha_0_5);
                } else {
                    eVar.mo142655y().setChecked(false);
                    SnsMethodCalculate.markStartTimeMs("getIvMediaMask", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter$SnsInfoViewHolder");
                    Object value4 = ((C36570n) eVar.f303805E).getValue();
                    C87412m.m108593f(value4, "<get-ivMediaMask>(...)");
                    ImageView imageView2 = (ImageView) value4;
                    SnsMethodCalculate.markEndTimeMs("getIvMediaMask", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter$SnsInfoViewHolder");
                    imageView2.setBackground((Drawable) null);
                    imageView2.setVisibility(4);
                }
                SnsMethodCalculate.markEndTimeMs("onBind", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter$SnsInfoViewHolder");
            }
        } else if (zVar2 instanceof C102937f) {
            C102937f fVar = (C102937f) zVar2;
            SnsMethodCalculate.markStartTimeMs("onBind", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter$TimeHeaderViewHolder");
            fVar.f44854d.setTag(C0966R.C0970id.jrl, Integer.valueOf(i));
            fVar.f44854d.setTag(C0966R.C0970id.jrm, 2);
            ((TextView) fVar.f44854d.findViewById(C0966R.C0970id.hwh)).setText(((C102944e0) m136072N5(fVar.f303816z).get(i2)).mo142659b().f298697o);
            SnsMethodCalculate.markEndTimeMs("onBind", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter$TimeHeaderViewHolder");
        } else if (zVar2 instanceof C102927d) {
            C102927d dVar5 = (C102927d) zVar2;
            SnsMethodCalculate.markStartTimeMs("onBind", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter$LoadingViewHolder");
            SnsMethodCalculate.markStartTimeMs("checkLoadingMoreView", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter$LoadingViewHolder");
            SnsMethodCalculate.markStartTimeMs("getLoadingTv", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter$LoadingViewHolder");
            Object value5 = ((C36570n) dVar5.f303799z).getValue();
            C87412m.m108593f(value5, "<get-loadingTv>(...)");
            SnsMethodCalculate.markEndTimeMs("getLoadingTv", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter$LoadingViewHolder");
            ((TextView) value5).setVisibility(0);
            SnsMethodCalculate.markStartTimeMs("getLoadingTv", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter$LoadingViewHolder");
            Object value6 = ((C36570n) dVar5.f303799z).getValue();
            C87412m.m108593f(value6, "<get-loadingTv>(...)");
            SnsMethodCalculate.markEndTimeMs("getLoadingTv", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter$LoadingViewHolder");
            ((TextView) value6).setText(dVar5.f303798A.mo142641O5().getResources().getString(C0966R.string.f360085a04));
            SnsMethodCalculate.markEndTimeMs("checkLoadingMoreView", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter$LoadingViewHolder");
            SnsMethodCalculate.markEndTimeMs("onBind", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter$LoadingViewHolder");
        }
        SnsMethodCalculate.markEndTimeMs("onBindViewHolder", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter");
    }

    public RecyclerView.C16631z onCreateViewHolder(ViewGroup viewGroup, int i) {
        RecyclerView.C16631z zVar;
        RecyclerView.C16631z zVar2;
        SnsMethodCalculate.markStartTimeMs("onCreateViewHolder", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter");
        C87412m.m108594g(viewGroup, "parent");
        if (i == 1) {
            View inflate = LayoutInflater.from(this.f303785e).inflate(C0966R.C0971layout.bn4, viewGroup, false);
            C87412m.m108593f(inflate, "from(context).inflate(R.…m_ui_item, parent, false)");
            zVar2 = new C102929e(this, inflate);
        } else if (i == 2) {
            View inflate2 = LayoutInflater.from(this.f303785e).inflate(C0966R.C0971layout.f359927bn3, viewGroup, false);
            C87412m.m108593f(inflate2, "from(context).inflate(R.…er_layout, parent, false)");
            zVar2 = new C102937f(this, inflate2);
        } else if (i != 4) {
            zVar = super.createViewHolder(viewGroup, i);
            C87412m.m108593f(zVar, "super.createViewHolder(parent, viewType)");
            SnsMethodCalculate.markEndTimeMs("onCreateViewHolder", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter");
            return zVar;
        } else {
            View inflate3 = LayoutInflater.from(this.f303785e).inflate(C0966R.C0971layout.f359926bn2, viewGroup, false);
            C87412m.m108593f(inflate3, "from(context).inflate(R.…de_layout, parent, false)");
            zVar2 = new C102927d(this, inflate3);
        }
        zVar = zVar2;
        SnsMethodCalculate.markEndTimeMs("onCreateViewHolder", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter");
        return zVar;
    }
}
