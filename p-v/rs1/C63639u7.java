package rs1;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.appcompat.app.AppCompatActivity;
import bl3.C39818r;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.plugin.finder.feed.FinderPoiRelateUIContract$PoiRelatePresenter;
import com.tencent.p014mm.plugin.finder.feed.model.FinderPoiRelateLoader;
import com.tencent.p014mm.plugin.finder.feed.p052ui.FinderPoiRelateListUI;
import com.tencent.p014mm.pluginsdk.location.LocationIntent;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import di3.C86312j;
import er1.C58684b;
import fy3.C32224a;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ArrayList;
import kf1.C9669c7;
import nj3.C76879j;
import p447aw.C103918d;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import zc1.C66785b;

/* renamed from: rs1.u7 */
public final class C63639u7 extends UIComponent {

    /* renamed from: d */
    public final C13601g f180424d = C36568h.m40985a(new C63644e(this));

    /* renamed from: e */
    public final C13601g f180425e = C36568h.m40985a(new C63641b(this));

    /* renamed from: f */
    public final C13601g f180426f = C36568h.m40985a(new C63645f(this));

    /* renamed from: g */
    public final C13601g f180427g = C36568h.m40985a(new C63647h(this));

    /* renamed from: h */
    public final C13601g f180428h = C36568h.m40985a(new C63640a(this));

    /* renamed from: i */
    public final C13601g f180429i = C36568h.m40985a(C63646g.f180436d);

    /* renamed from: rs1.u7$a */
    public static final class C63640a extends C87413o implements C32224a<FinderPoiRelateLoader> {

        /* renamed from: d */
        public final /* synthetic */ C63639u7 f180430d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C63640a(C63639u7 u7Var) {
            super(0);
            this.f180430d = u7Var;
        }

        public Object invoke() {
            return new FinderPoiRelateLoader((String) ((C36570n) this.f180430d.f180429i).getValue(), ((C13442s8) C39818r.f106831a.mo62444c(C63639u7.m74964c3(this.f180430d)).mo75002a(C13442s8.class)).mo12861q3());
        }
    }

    /* renamed from: rs1.u7$b */
    public static final class C63641b extends C87413o implements C32224a<Boolean> {

        /* renamed from: d */
        public final /* synthetic */ C63639u7 f180431d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C63641b(C63639u7 u7Var) {
            super(0);
            this.f180431d = u7Var;
        }

        public Object invoke() {
            return Boolean.valueOf(this.f180431d.getIntent().getBooleanExtra("EXTRA_FROM_GUIDE", false));
        }
    }

    /* renamed from: rs1.u7$c */
    public static final class C63642c implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C63639u7 f180432d;

        public C63642c(C63639u7 u7Var) {
            this.f180432d = u7Var;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
            ((C103918d) C86312j.m106911c(C103918d.class)).mo125783j7(this.f180432d.getActivity());
        }
    }

    /* renamed from: rs1.u7$d */
    public static final class C63643d implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public static final C63643d f180433d = new C63643d();

        public final void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
        }
    }

    /* renamed from: rs1.u7$e */
    public static final class C63644e extends C87413o implements C32224a<FinderPoiRelateListUI> {

        /* renamed from: d */
        public final /* synthetic */ C63639u7 f180434d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C63644e(C63639u7 u7Var) {
            super(0);
            this.f180434d = u7Var;
        }

        public Object invoke() {
            Activity context = this.f180434d.getContext();
            C87412m.m108592e(context, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.feed.ui.FinderPoiRelateListUI");
            return (FinderPoiRelateListUI) context;
        }
    }

    /* renamed from: rs1.u7$f */
    public static final class C63645f extends C87413o implements C32224a<FinderPoiRelateUIContract$PoiRelatePresenter> {

        /* renamed from: d */
        public final /* synthetic */ C63639u7 f180435d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C63645f(C63639u7 u7Var) {
            super(0);
            this.f180435d = u7Var;
        }

        public Object invoke() {
            FinderPoiRelateListUI c3 = C63639u7.m74964c3(this.f180435d);
            C63639u7.m74964c3(this.f180435d).getClass();
            return new FinderPoiRelateUIContract$PoiRelatePresenter(c3, 2, 124, (FinderPoiRelateLoader) ((C36570n) this.f180435d.f180428h).getValue());
        }
    }

    /* renamed from: rs1.u7$g */
    public static final class C63646g extends C87413o implements C32224a<String> {

        /* renamed from: d */
        public static final C63646g f180436d = new C63646g();

        public C63646g() {
            super(0);
        }

        public Object invoke() {
            return C66785b.f191882e.mo90662O5();
        }
    }

    /* renamed from: rs1.u7$h */
    public static final class C63647h extends C87413o implements C32224a<C9669c7> {

        /* renamed from: d */
        public final /* synthetic */ C63639u7 f180437d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C63647h(C63639u7 u7Var) {
            super(0);
            this.f180437d = u7Var;
        }

        public Object invoke() {
            FinderPoiRelateListUI c3 = C63639u7.m74964c3(this.f180437d);
            C63639u7.m74964c3(this.f180437d).getClass();
            return new C9669c7(c3, 2, 124, false, 8, (C8480h) null);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C63639u7(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    /* renamed from: c3 */
    public static final FinderPoiRelateListUI m74964c3(C63639u7 u7Var) {
        return (FinderPoiRelateListUI) ((C36570n) u7Var.f180424d).getValue();
    }

    public int getLayoutId() {
        return C0966R.C0971layout.an6;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i != 16666) {
            return;
        }
        if (i2 == -1) {
            Parcelable parcelableExtra = intent != null ? intent.getParcelableExtra("KLocationIntent") : null;
            C87412m.m108592e(parcelableExtra, "null cannot be cast to non-null type com.tencent.mm.pluginsdk.location.LocationIntent");
            LocationIntent locationIntent = (LocationIntent) parcelableExtra;
            Log.m105924i("Finder.FinderPoiRelativeListUIC", "locationIntent: " + locationIntent.mo100133a());
            ArrayList arrayList = new ArrayList();
            arrayList.add(locationIntent.f211465p);
            Intent intent2 = new Intent();
            intent2.putExtra("extra_poi_list", arrayList);
            if (((Boolean) ((C36570n) this.f180425e).getValue()).booleanValue()) {
                ((C58684b) C86312j.m106911c(C58684b.class)).my0(getContext(), intent2);
            } else {
                getContext().setResult(-1, intent2);
            }
            getContext().finish();
            return;
        }
        Log.m105924i("Finder.FinderPoiRelativeListUIC", "map search result : cancel");
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ((C9669c7) ((C36570n) this.f180427g).getValue()).mo10355Y0((FinderPoiRelateUIContract$PoiRelatePresenter) ((C36570n) this.f180426f).getValue());
        ((FinderPoiRelateUIContract$PoiRelatePresenter) ((C36570n) this.f180426f).getValue()).mo2525t((C9669c7) ((C36570n) this.f180427g).getValue());
    }

    public void onDestroy() {
        super.onDestroy();
        ((FinderPoiRelateUIContract$PoiRelatePresenter) ((C36570n) this.f180426f).getValue()).onDetach();
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        C87412m.m108594g(strArr, "permissions");
        C87412m.m108594g(iArr, "grantResults");
        super.onRequestPermissionsResult(i, strArr, iArr);
        if (iArr.length == 0) {
            Log.m105924i("Finder.FinderPoiRelativeListUIC", "onRequestPermissionsResult grantResults length 0");
        } else if (i != 64) {
        } else {
            if (iArr[0] == 0) {
                ((C9669c7) ((C36570n) this.f180427g).getValue()).mo10289c1();
            } else {
                C76879j.m92709C(getActivity(), getString(C0966R.string.f361129hi0), getString(C0966R.string.hif), getString(C0966R.string.fyd), getString(C0966R.string.atx), false, new C63642c(this), C63643d.f180433d);
            }
        }
    }
}
