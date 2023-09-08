package if2;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.plugin.profile.p088ui.newbizinfo.auth.NewBizInfoAuthMainUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import fy3.C32224a;
import gc0.C20828a;
import gy3.C87412m;
import gy3.C87413o;
import hc0.C20937c;
import hf2.C46035f;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import kg3.C76577a;
import qo3.C77407n;
import qo3.C89779i0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import te3.C50273lj2;
import te3.C51246sh3;

/* renamed from: if2.g */
public final class C8894g extends UIComponent {

    /* renamed from: d */
    public final C13601g f28165d;

    /* renamed from: e */
    public final C13601g f28166e;

    /* renamed from: f */
    public int f28167f = 1;

    /* renamed from: g */
    public C89779i0 f28168g;

    /* renamed from: h */
    public final C13601g f28169h;

    /* renamed from: if2.g$a */
    public static final class C8895a extends RecyclerView.C16613e<RecyclerView.C16631z> {

        /* renamed from: d */
        public final LinkedList<C51246sh3> f28170d;

        /* renamed from: e */
        public final C8894g f28171e;

        /* renamed from: if2.g$a$a */
        public final class C8896a extends RecyclerView.C16631z {

            /* renamed from: A */
            public final TextView f28172A;

            /* renamed from: B */
            public final TextView f28173B;

            /* renamed from: C */
            public final ImageView f28174C;

            /* renamed from: z */
            public final ImageView f28175z;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C8896a(C8895a aVar, View view) {
                super(view);
                C87412m.m108594g(view, "itemView");
                this.f28175z = (ImageView) view.findViewById(C0966R.C0970id.bnd);
                this.f28172A = (TextView) view.findViewById(C0966R.C0970id.bnc);
                this.f28173B = (TextView) view.findViewById(C0966R.C0970id.bne);
                this.f28174C = (ImageView) view.findViewById(C0966R.C0970id.bnf);
                ImageView imageView = (ImageView) view.findViewById(C0966R.C0970id.bnb);
            }
        }

        /* renamed from: if2.g$a$b */
        public static final class C8897b implements View.OnClickListener {

            /* renamed from: d */
            public final /* synthetic */ C8895a f28176d;

            /* renamed from: e */
            public final /* synthetic */ int f28177e;

            public C8897b(C8895a aVar, int i) {
                this.f28176d = aVar;
                this.f28177e = i;
            }

            public final void onClick(View view) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/plugin/profile/ui/newbizinfo/auth/NewBizInfoAuthScopeUIC$AuthScopeAdapter$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                C8895a.m8696F4(this.f28176d, this.f28177e);
                C117292a.m165361g(this, "com/tencent/mm/plugin/profile/ui/newbizinfo/auth/NewBizInfoAuthScopeUIC$AuthScopeAdapter$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        }

        /* renamed from: if2.g$a$c */
        public static final class C8898c implements View.OnLongClickListener {

            /* renamed from: d */
            public final /* synthetic */ C8895a f28178d;

            /* renamed from: e */
            public final /* synthetic */ int f28179e;

            public C8898c(C8895a aVar, int i) {
                this.f28178d = aVar;
                this.f28179e = i;
            }

            public final boolean onLongClick(View view) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/plugin/profile/ui/newbizinfo/auth/NewBizInfoAuthScopeUIC$AuthScopeAdapter$onBindViewHolder$2", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
                C8895a.m8696F4(this.f28178d, this.f28179e);
                C117292a.m165362h(true, this, "com/tencent/mm/plugin/profile/ui/newbizinfo/auth/NewBizInfoAuthScopeUIC$AuthScopeAdapter$onBindViewHolder$2", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
                return true;
            }
        }

        public C8895a(LinkedList<C51246sh3> linkedList, C8894g gVar) {
            C87412m.m108594g(linkedList, "dataList");
            C87412m.m108594g(gVar, "scopeUIC");
            this.f28170d = linkedList;
            this.f28171e = gVar;
        }

        /* renamed from: F4 */
        public static final boolean m8696F4(C8895a aVar, int i) {
            C51246sh3 sh32 = aVar.f28170d.get(i);
            C87412m.m108593f(sh32, "dataList[position]");
            C77407n nVar = new C77407n((Context) aVar.f28171e.getContext(), 1, true);
            String string = aVar.f28171e.getContext().getResources().getString(C0966R.string.bk7);
            C87412m.m108593f(string, "scopeUIC.context.resourc…act_info_biz_delete_auth)");
            String format = String.format(string, Arrays.copyOf(new Object[]{sh32.f141522e}, 1));
            C87412m.m108593f(format, "format(format, *args)");
            nVar.mo107568m(format, 17, C76577a.m92151b(aVar.f28171e.getContext(), 12));
            nVar.f225771i = C8902h.f28183d;
            nVar.f225782p = new C8903i(aVar, i);
            nVar.mo107573q();
            return true;
        }

        public int getItemCount() {
            return this.f28170d.size();
        }

        public void onBindViewHolder(RecyclerView.C16631z zVar, int i) {
            C87412m.m108594g(zVar, "holder");
            if (zVar instanceof C8896a) {
                if (i == 0) {
                    ((C8896a) zVar).f28174C.setVisibility(0);
                } else {
                    ((C8896a) zVar).f28174C.setVisibility(8);
                }
                C51246sh3 sh32 = this.f28170d.get(i);
                C87412m.m108593f(sh32, "dataList[position]");
                C51246sh3 sh33 = sh32;
                int i2 = this.f28171e.f28167f;
                if (i2 == 1) {
                    C8896a aVar = (C8896a) zVar;
                    aVar.f28175z.setVisibility(0);
                    String str = C85875k4.m106211z() ? sh33.f141525h : sh33.f141524g;
                    int b = C76577a.m92151b(this.f28171e.getContext(), 24);
                    C20937c.C20939b bVar = new C20937c.C20939b();
                    bVar.f59346b = true;
                    bVar.f59345a = true;
                    bVar.f59354j = b;
                    bVar.f59355k = b;
                    C20828a.m22825b().mo32519h(str, aVar.f28175z, bVar.mo32666a());
                    aVar.f28175z.setOnClickListener((View.OnClickListener) null);
                } else if (i2 == 2) {
                    C8896a aVar2 = (C8896a) zVar;
                    aVar2.f28175z.setImageResource(C0966R.raw.app_brand_star_delete);
                    aVar2.f28175z.setOnClickListener(new C8897b(this, i));
                }
                C8896a aVar3 = (C8896a) zVar;
                aVar3.f28172A.setText(sh33.f141522e);
                if (sh33.f141523f == 7) {
                    aVar3.f28173B.setVisibility(0);
                } else {
                    aVar3.f28173B.setVisibility(8);
                }
                if (this.f28171e.f28167f == 2) {
                    zVar.f44854d.setOnLongClickListener((View.OnLongClickListener) null);
                } else {
                    zVar.f44854d.setOnLongClickListener(new C8898c(this, i));
                }
            }
        }

        public RecyclerView.C16631z onCreateViewHolder(ViewGroup viewGroup, int i) {
            C87412m.m108594g(viewGroup, "parent");
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C0966R.C0971layout.f7067x4, viewGroup, false);
            C87412m.m108593f(inflate, "view");
            return new C8896a(this, inflate);
        }
    }

    /* renamed from: if2.g$b */
    public static final class C8899b extends C87413o implements C32224a<RecyclerView> {

        /* renamed from: d */
        public final /* synthetic */ AppCompatActivity f28180d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C8899b(AppCompatActivity appCompatActivity) {
            super(0);
            this.f28180d = appCompatActivity;
        }

        public Object invoke() {
            return (RecyclerView) this.f28180d.findViewById(C0966R.C0970id.bnh);
        }
    }

    /* renamed from: if2.g$c */
    public static final class C8900c extends C87413o implements C32224a<NewBizInfoAuthMainUI> {

        /* renamed from: d */
        public final /* synthetic */ AppCompatActivity f28181d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C8900c(AppCompatActivity appCompatActivity) {
            super(0);
            this.f28181d = appCompatActivity;
        }

        public Object invoke() {
            AppCompatActivity appCompatActivity = this.f28181d;
            C87412m.m108592e(appCompatActivity, "null cannot be cast to non-null type com.tencent.mm.plugin.profile.ui.newbizinfo.auth.NewBizInfoAuthMainUI");
            return (NewBizInfoAuthMainUI) appCompatActivity;
        }
    }

    /* renamed from: if2.g$d */
    public static final class C8901d extends C87413o implements C32224a<Button> {

        /* renamed from: d */
        public final /* synthetic */ AppCompatActivity f28182d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C8901d(AppCompatActivity appCompatActivity) {
            super(0);
            this.f28182d = appCompatActivity;
        }

        public Object invoke() {
            return (Button) this.f28182d.findViewById(C0966R.C0970id.bn9);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8894g(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        this.f28165d = C36568h.m40985a(new C8899b(appCompatActivity));
        this.f28166e = C36568h.m40985a(new C8901d(appCompatActivity));
        this.f28169h = C36568h.m40985a(new C8900c(appCompatActivity));
    }

    /* renamed from: c3 */
    public final RecyclerView mo9712c3() {
        return (RecyclerView) ((C36570n) this.f28165d).getValue();
    }

    /* renamed from: d3 */
    public final Button mo9713d3() {
        return (Button) ((C36570n) this.f28166e).getValue();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (C46035f.f124140j == null) {
            Log.m105924i("NewBizInfoAuthScopeUIC", "staticResp == null");
            getActivity().finish();
        } else {
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
            linearLayoutManager.mo16974W(1);
            mo9712c3().setLayoutManager(linearLayoutManager);
            RecyclerView c3 = mo9712c3();
            C50273lj2 lj22 = C46035f.f124140j;
            C87412m.m108591d(lj22);
            LinkedList<C51246sh3> linkedList = lj22.f137459f;
            C87412m.m108593f(linkedList, "NewBizInfoSettingJsApiUI…!.privacy_scope_item_list");
            c3.setAdapter(new C8895a(linkedList, this));
        }
        mo9713d3().post(new C8905k(this));
        mo9713d3().setOnClickListener(new C8904j(this));
    }
}
