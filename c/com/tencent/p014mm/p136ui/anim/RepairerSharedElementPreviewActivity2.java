package com.tencent.p014mm.p136ui.anim;

import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.ActionBar;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.secdata.p843ui.MMSecDataActivity;
import fy3.C32224a;
import gj3.C59469a;
import gj3.C59471d;
import gj3.C59474h;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import hj3.C20955b;
import in3.C87773e;
import java.util.List;
import kotlin.Metadata;
import nj3.C88989a;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import zi3.C16215h;
import zi3.C66831a;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/ui/anim/RepairerSharedElementPreviewActivity2;", "Lcom/tencent/mm/plugin/secdata/ui/MMSecDataActivity;", "<init>", "()V", "app_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
@C88989a(35)
/* renamed from: com.tencent.mm.ui.anim.RepairerSharedElementPreviewActivity2 */
public final class RepairerSharedElementPreviewActivity2 extends MMSecDataActivity {

    /* renamed from: d */
    public final C13601g f165030d = C36568h.m40985a(new C57655b(this));

    /* renamed from: com.tencent.mm.ui.anim.RepairerSharedElementPreviewActivity2$a */
    public static final class C57654a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ RepairerSharedElementPreviewActivity2 f165031d;

        public C57654a(RepairerSharedElementPreviewActivity2 repairerSharedElementPreviewActivity2) {
            this.f165031d = repairerSharedElementPreviewActivity2;
        }

        public final void run() {
            ((C59474h) this.f165031d.component(C59474h.class)).f169946d.mo84574b((C59471d) null, C20955b.f59396a);
        }
    }

    /* renamed from: com.tencent.mm.ui.anim.RepairerSharedElementPreviewActivity2$b */
    public static final class C57655b extends C87413o implements C32224a<RecyclerView> {

        /* renamed from: d */
        public final /* synthetic */ RepairerSharedElementPreviewActivity2 f165032d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C57655b(RepairerSharedElementPreviewActivity2 repairerSharedElementPreviewActivity2) {
            super(0);
            this.f165032d = repairerSharedElementPreviewActivity2;
        }

        public Object invoke() {
            return (RecyclerView) this.f165032d.findViewById(C0966R.C0970id.o_h);
        }
    }

    /* renamed from: com.tencent.mm.ui.anim.RepairerSharedElementPreviewActivity2$c */
    public static final class C57656c extends C87413o implements C32224a<View> {

        /* renamed from: d */
        public final /* synthetic */ RepairerSharedElementPreviewActivity2 f165033d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C57656c(RepairerSharedElementPreviewActivity2 repairerSharedElementPreviewActivity2) {
            super(0);
            this.f165033d = repairerSharedElementPreviewActivity2;
        }

        public Object invoke() {
            return this.f165033d.findViewById(C0966R.C0970id.ob7);
        }
    }

    public RepairerSharedElementPreviewActivity2() {
        C36568h.m40985a(new C57656c(this));
    }

    /* renamed from: H7 */
    public final RecyclerView mo81988H7() {
        Object value = ((C36570n) this.f165030d).getValue();
        C87412m.m108593f(value, "<get-rvExpand>(...)");
        return (RecyclerView) value;
    }

    public void finish() {
        super.finish();
        overridePendingTransition(0, 0);
    }

    public int getLayoutId() {
        return C0966R.C0971layout.f6328bx;
    }

    public void onBackPressed() {
        finishAfterTransition();
    }

    public void onCreate(Bundle bundle) {
        ((C59474h) component(C59474h.class)).f169946d.mo84573a((C59469a) null);
        supportRequestWindowFeature(109);
        super.onCreate(bundle);
        setActionbarColor(0);
        getWindow().getDecorView().setSystemUiVisibility(1792);
        C87773e.m109211d(getWindow());
        setNavigationbarColor(getResources().getColor(C0966R.color.ahf));
        setMMTitle("");
        hideActionbarLine();
        hideActionBarOperationArea();
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.mo91104o();
        }
        List<Integer> list = RepairerSharedElementDemo2.f164996j;
        if (list != null) {
            int i = 1;
            if (list.size() > 1) {
                i = list.size() <= 4 ? 2 : 3;
            }
            mo81988H7().setLayoutManager(new GridLayoutManager(this, i));
            mo81988H7().setAdapter(new C66831a(list, Integer.MAX_VALUE, (List) null, 4, (C8480h) null));
            int dimensionPixelSize = getResources().getDimensionPixelSize(C0966R.dimen.f3723cd);
            if (mo81988H7().getItemDecorationCount() > 0) {
                mo81988H7().mo17095k1(0);
            }
            mo81988H7().mo17085h0(new C16215h(dimensionPixelSize));
            mo81988H7().post(new C57654a(this));
        }
    }
}
