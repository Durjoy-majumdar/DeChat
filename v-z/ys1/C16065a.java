package ys1;

import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.view.recyclerview.WxRecyclerView;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import er1.C7813i5;
import er1.C7919x;
import fy3.C32224a;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import vs1.C14974a;

/* renamed from: ys1.a */
public final class C16065a extends UIComponent {

    /* renamed from: d */
    public final C13601g f43206d;

    /* renamed from: e */
    public final C13601g f43207e;

    /* renamed from: f */
    public C14974a f43208f;

    /* renamed from: g */
    public long f43209g;

    /* renamed from: h */
    public long f43210h;

    /* renamed from: i */
    public String f43211i = "";

    /* renamed from: j */
    public final C7813i5 f43212j = C7813i5.C7814a.m7953a(C7813i5.f26336f, getContext(), getContext().getResources().getString(C0966R.string.ett), 500, (DialogInterface.OnCancelListener) null, 8, (Object) null);

    /* renamed from: ys1.a$a */
    public static final class C16066a extends C87413o implements C32224a<TextView> {

        /* renamed from: d */
        public final /* synthetic */ AppCompatActivity f43213d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C16066a(AppCompatActivity appCompatActivity) {
            super(0);
            this.f43213d = appCompatActivity;
        }

        public Object invoke() {
            return (TextView) this.f43213d.findViewById(C0966R.C0970id.nh_);
        }
    }

    /* renamed from: ys1.a$b */
    public static final class C16067b extends C87413o implements C32224a<WxRecyclerView> {

        /* renamed from: d */
        public final /* synthetic */ AppCompatActivity f43214d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C16067b(AppCompatActivity appCompatActivity) {
            super(0);
            this.f43214d = appCompatActivity;
        }

        public Object invoke() {
            return (WxRecyclerView) this.f43214d.findViewById(C0966R.C0970id.f359539ni3);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C16065a(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        this.f43206d = C36568h.m40985a(new C16067b(appCompatActivity));
        this.f43207e = C36568h.m40985a(new C16066a(appCompatActivity));
    }

    /* renamed from: c3 */
    public final TextView mo14681c3() {
        Object value = ((C36570n) this.f43207e).getValue();
        C87412m.m108593f(value, "<get-createBtn>(...)");
        return (TextView) value;
    }

    public int getLayoutId() {
        return C0966R.C0971layout.czp;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f43208f = new C14974a(getActivity());
        Object value = ((C36570n) this.f43206d).getValue();
        C87412m.m108593f(value, "<get-recyclerView>(...)");
        WxRecyclerView wxRecyclerView = (WxRecyclerView) value;
        wxRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        wxRecyclerView.setAdapter(this.f43208f);
        C7919x.m8091a(mo14681c3());
        C14974a aVar = this.f43208f;
        if (aVar != null) {
            aVar.f41047r = new C16068b(this);
        }
        C14974a aVar2 = this.f43208f;
        if (aVar2 != null) {
            aVar2.f41046q = new C16069c(wxRecyclerView);
        }
        mo14681c3().setOnClickListener(new C16070d(this));
        this.f43209g = getIntent().getLongExtra("finderlivecreateparamliveid", 0);
        this.f43210h = getIntent().getLongExtra("finderlivecreateparamobjectid", 0);
        String stringExtra = getIntent().getStringExtra("finderlivecreateparamnonceobjectid");
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.f43211i = stringExtra;
        C14974a aVar3 = this.f43208f;
        if (aVar3 != null) {
            aVar3.f41037e.add(new C14974a.C14979e("", new C14974a.C14980f(false, 0, (String) null, 7, (C8480h) null), 0));
            aVar3.f41037e.add(new C14974a.C14979e("", new C14974a.C14980f(false, 0, (String) null, 7, (C8480h) null), 2));
            aVar3.f41037e.add(new C14974a.C14979e("", new C14974a.C14980f(false, 0, (String) null, 7, (C8480h) null), 2));
            aVar3.f41037e.add(new C14974a.C14979e("", new C14974a.C14980f(false, 0, (String) null, 7, (C8480h) null), 1));
            aVar3.notifyDataSetChanged();
            aVar3.f41043n = true;
        }
    }
}
