package com.tencent.p014mm.plugin.clean.p036ui.fileindexui;

import android.os.Bundle;
import android.os.CancellationSignal;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.AppBrandFileCleanEvent;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.widget.listview.AnimatedExpandableListView;
import f40.C86737h0;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import java.util.Arrays;
import java.util.List;
import k11.C108809b;
import k11.C108813c;
import k11.C108814d;
import k11.C108815e;
import k11.C108816f;
import k11.C108817h;
import k11.C108818i;
import k11.C108819l;
import k11.C9551g;
import kotlin.Metadata;
import sx3.C64186f0;
import wy0.C102506a;
import zt3.C119157j;
import zt3.C119179t;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/clean/ui/fileindexui/CleanCacheUI;", "Lcom/tencent/mm/ui/MMActivity;", "<init>", "()V", "app_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
@C86737h0
/* renamed from: com.tencent.mm.plugin.clean.ui.fileindexui.CleanCacheUI */
public final class CleanCacheUI extends MMActivity {

    /* renamed from: r */
    public static final /* synthetic */ int f312121r = 0;

    /* renamed from: d */
    public AnimatedExpandableListView f312122d;

    /* renamed from: e */
    public C108809b f312123e;

    /* renamed from: f */
    public boolean f312124f;

    /* renamed from: g */
    public boolean f312125g;

    /* renamed from: h */
    public CancellationSignal f312126h;

    /* renamed from: i */
    public List<String> f312127i = C64186f0.f181907d;

    /* renamed from: j */
    public long[] f312128j = new long[16];

    /* renamed from: n */
    public C32224a<Boolean> f312129n = C105125c.f312133d;

    /* renamed from: o */
    public long f312130o = -1;

    /* renamed from: p */
    public int f312131p;

    /* renamed from: q */
    public long f312132q;

    /* renamed from: com.tencent.mm.plugin.clean.ui.fileindexui.CleanCacheUI$a */
    public static final class C85141a implements MenuItem.OnMenuItemClickListener {

        /* renamed from: d */
        public final /* synthetic */ CleanCacheUI f248091d;

        public C85141a(CleanCacheUI cleanCacheUI) {
            this.f248091d = cleanCacheUI;
        }

        public final boolean onMenuItemClick(MenuItem menuItem) {
            this.f248091d.finish();
            return false;
        }
    }

    /* renamed from: com.tencent.mm.plugin.clean.ui.fileindexui.CleanCacheUI$b */
    public static final class C85142b implements CancellationSignal.OnCancelListener {

        /* renamed from: a */
        public static final C85142b f248092a = new C85142b();

        public final void onCancel() {
            AppBrandFileCleanEvent appBrandFileCleanEvent = new AppBrandFileCleanEvent();
            AppBrandFileCleanEvent.C80700a aVar = appBrandFileCleanEvent.f236127d;
            aVar.f236128a = "ACTION_PACKAGE_CALCULATE";
            aVar.f236129b = true;
            appBrandFileCleanEvent.publish();
        }
    }

    /* renamed from: com.tencent.mm.plugin.clean.ui.fileindexui.CleanCacheUI$c */
    public static final class C105125c extends C87413o implements C32224a<Boolean> {

        /* renamed from: d */
        public static final C105125c f312133d = new C105125c();

        public C105125c() {
            super(0);
        }

        public Object invoke() {
            return Boolean.TRUE;
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.b0g;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setMMTitle((int) C0966R.string.bd5);
        setBackBtn(new C85141a(this));
        long[] longArrayExtra = getIntent().getLongArrayExtra("tagsResult");
        if (longArrayExtra == null) {
            longArrayExtra = new long[16];
        }
        this.f312128j = longArrayExtra;
        this.f312124f = getIntent().getBooleanExtra("aggressive", false);
        this.f312125g = getIntent().getBooleanExtra("vacuum", false);
        long[] jArr = this.f312128j;
        int length = jArr.length;
        this.f312122d = (AnimatedExpandableListView) findViewById(C0966R.C0970id.cfi);
        C108809b bVar = new C108809b(this);
        bVar.mo159916h(jArr);
        this.f312123e = bVar;
        View findViewById = findViewById(C0966R.C0970id.mll);
        C87412m.m108593f(findViewById, "findViewById(R.id.select_all_btn)");
        Button button = (Button) findViewById;
        View findViewById2 = findViewById(C0966R.C0970id.c1f);
        C87412m.m108593f(findViewById2, "findViewById(R.id.delete_info_tv)");
        View findViewById3 = findViewById(C0966R.C0970id.c0a);
        C87412m.m108593f(findViewById3, "findViewById(R.id.del_btn)");
        Button button2 = (Button) findViewById3;
        View findViewById4 = findViewById(C0966R.C0970id.cj7);
        C87412m.m108593f(findViewById4, "findViewById(R.id.empty_tip)");
        this.f312129n = new C108813c(bVar, (TextView) findViewById2, this, button, button2, findViewById4);
        bVar.mo159906d(true);
        AnimatedExpandableListView animatedExpandableListView = this.f312122d;
        C87412m.m108591d(animatedExpandableListView);
        animatedExpandableListView.setAdapter(bVar);
        animatedExpandableListView.setOnGroupClickListener(new C108814d(bVar, this));
        animatedExpandableListView.setOnChildClickListener(new C108815e(bVar, this));
        button.setOnClickListener(new C108816f(button, bVar, this));
        button2.setOnClickListener(new C9551g(this));
        C119179t tVar = C119157j.f356862d;
        C108817h hVar = new C108817h(this);
        C119157j jVar = (C119157j) tVar;
        jVar.getClass();
        jVar.mo183892w(hVar, 50, false);
        long[] jArr2 = bVar.f325821e;
        C87412m.m108594g(jArr2, "<this>");
        int length2 = jArr2.length;
        Long[] lArr = new Long[length2];
        int length3 = jArr2.length;
        for (int i = 0; i < length3; i++) {
            lArr[i] = Long.valueOf(jArr2[i]);
        }
        C102506a.m135309i(11, 0, (Long[]) Arrays.copyOf(lArr, length2));
        AnimatedExpandableListView animatedExpandableListView2 = this.f312122d;
        C87412m.m108591d(animatedExpandableListView2);
        animatedExpandableListView2.setOnGroupExpandListener(new C108818i(bVar, this));
        CancellationSignal cancellationSignal = new CancellationSignal();
        cancellationSignal.setOnCancelListener(C85142b.f248092a);
        this.f312126h = cancellationSignal;
        long j = this.f312128j[6];
        ((C119157j) C119157j.f356862d).mo183875f(new C108819l(cancellationSignal, this, j));
    }

    public void onDestroy() {
        CancellationSignal cancellationSignal = this.f312126h;
        if (cancellationSignal != null) {
            cancellationSignal.cancel();
        }
        this.f312126h = null;
        super.onDestroy();
    }
}
