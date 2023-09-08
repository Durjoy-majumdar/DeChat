package lr1;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.video.plugin.view.RecordTypeSelectView;
import com.tencent.p014mm.plugin.recordvideo.jumper.RecordConfigProvider;
import ej3.C45662a;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ArrayList;
import kg3.C76577a;
import lh2.C109344g0;
import qh2.C101198e;
import rx3.C13598b0;

/* renamed from: lr1.a */
public final class C61382a implements C109344g0 {

    /* renamed from: d */
    public RecordTypeSelectView f174586d;

    /* renamed from: e */
    public C101198e f174587e;

    /* renamed from: f */
    public final Context f174588f;

    /* renamed from: g */
    public boolean f174589g;

    /* renamed from: lr1.a$a */
    public static final class C61383a extends C87413o implements C32226l<Integer, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C61382a f174590d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C61383a(C61382a aVar) {
            super(1);
            this.f174590d = aVar;
        }

        public Object invoke(Object obj) {
            int intValue = ((Number) obj).intValue();
            C61382a aVar = this.f174590d;
            boolean z = true;
            if (intValue != 1) {
                z = false;
            }
            aVar.f174589g = z;
            Bundle bundle = new Bundle();
            bundle.putBoolean("PARAM_1_BOOLEAN", this.f174590d.f174589g);
            this.f174590d.f174587e.mo14585p(C101198e.C101199b.RECORD_TYPE_CHANGE, bundle);
            return C13598b0.f38549a;
        }
    }

    public C61382a(RecordTypeSelectView recordTypeSelectView, C101198e eVar) {
        C87412m.m108594g(recordTypeSelectView, "view");
        C87412m.m108594g(eVar, "status");
        this.f174586d = recordTypeSelectView;
        this.f174587e = eVar;
        Context context = recordTypeSelectView.getContext();
        this.f174588f = context;
        ArrayList arrayList = new ArrayList();
        arrayList.add(C76577a.m92166q(context, C0966R.string.huy));
        arrayList.add(C76577a.m92166q(context, C0966R.string.hux));
        this.f174586d.setData(arrayList);
        this.f174586d.setSelectChangeListener(new C61383a(this));
    }

    /* renamed from: e */
    public boolean mo78564e() {
        return false;
    }

    public String name() {
        return C61382a.class.getName();
    }

    public void onActivityResult(int i, int i2, Intent intent) {
    }

    public void onAttach() {
    }

    public void onDetach() {
    }

    public void onPause() {
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        C109344g0.C61280a.m71860a(this, i, strArr, iArr);
    }

    public void onResume() {
    }

    public void release() {
    }

    public void reset() {
    }

    public void setVisibility(int i) {
        if (i == 0) {
            C45662a.m50855a(this.f174586d, 0.0f, 0, (C32224a) null, 7, (Object) null);
        } else {
            C45662a.m50856b(this.f174586d, 0, 0, (C32224a) null, 7, (Object) null);
        }
    }

    /* renamed from: v */
    public void mo78575v(RecordConfigProvider recordConfigProvider) {
        C87412m.m108594g(recordConfigProvider, "configProvider");
    }
}
