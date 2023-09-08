package com.tencent.p014mm.p136ui.anim;

import android.os.Bundle;
import android.widget.ImageView;
import androidx.appcompat.app.ActionBar;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.secdata.p843ui.MMSecDataActivity;
import fy3.C32224a;
import gj3.C59469a;
import gj3.C59471d;
import gj3.C59474h;
import gj3.C59476i;
import gy3.C87412m;
import gy3.C87413o;
import hj3.C20955b;
import in3.C87773e;
import kotlin.Metadata;
import nj3.C88989a;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/ui/anim/RepairerSharedElementPreviewActivity;", "Lcom/tencent/mm/plugin/secdata/ui/MMSecDataActivity;", "<init>", "()V", "app_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
@C88989a(35)
/* renamed from: com.tencent.mm.ui.anim.RepairerSharedElementPreviewActivity */
public final class RepairerSharedElementPreviewActivity extends MMSecDataActivity {

    /* renamed from: d */
    public final C13601g f165027d = C36568h.m40985a(new C57652a(this));

    /* renamed from: com.tencent.mm.ui.anim.RepairerSharedElementPreviewActivity$a */
    public static final class C57652a extends C87413o implements C32224a<ImageView> {

        /* renamed from: d */
        public final /* synthetic */ RepairerSharedElementPreviewActivity f165028d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C57652a(RepairerSharedElementPreviewActivity repairerSharedElementPreviewActivity) {
            super(0);
            this.f165028d = repairerSharedElementPreviewActivity;
        }

        public Object invoke() {
            return (ImageView) this.f165028d.findViewById(C0966R.C0970id.o8v);
        }
    }

    /* renamed from: com.tencent.mm.ui.anim.RepairerSharedElementPreviewActivity$b */
    public static final class C57653b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ RepairerSharedElementPreviewActivity f165029d;

        public C57653b(RepairerSharedElementPreviewActivity repairerSharedElementPreviewActivity) {
            this.f165029d = repairerSharedElementPreviewActivity;
        }

        public final void run() {
            ((C59474h) this.f165029d.component(C59474h.class)).f169946d.mo84574b((C59471d) null, C20955b.f59396a);
        }
    }

    public void finish() {
        super.finish();
        overridePendingTransition(0, 0);
    }

    public int getLayoutId() {
        return C0966R.C0971layout.d7j;
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
        ((ImageView) ((C36570n) this.f165027d).getValue()).setImageResource(C0966R.C0969drawable.f4762m7);
        ImageView imageView = (ImageView) ((C36570n) this.f165027d).getValue();
        C87412m.m108593f(imageView, "ivAvatar");
        C59476i.m69400b(imageView, "soontest", (Object) null, 2, (Object) null);
        ((ImageView) ((C36570n) this.f165027d).getValue()).post(new C57653b(this));
    }
}
