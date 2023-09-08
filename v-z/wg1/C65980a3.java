package wg1;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import cm1.C55036w0;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.finder.presenter.contract.FinderLiveTagConstract;
import gy3.C87412m;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import te3.C64848y91;
import zk1.C16278q0;

/* renamed from: wg1.a3 */
public final class C65980a3 extends C16278q0 {

    /* renamed from: d */
    public FinderLiveTagConstract.Presenter f189706d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C65980a3(Fragment fragment) {
        super(fragment);
        C87412m.m108594g(fragment, "fragment");
    }

    public int getLayoutId() {
        return C0966R.C0971layout.akc;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        FinderLiveTagConstract.ViewCallback viewCallback;
        FinderLiveTagConstract.Presenter presenter = this.f189706d;
        if (presenter == null) {
            C87412m.m108603p("presenter");
            throw null;
        } else if (i2 == -1 && i == 1 && (viewCallback = presenter.f160362h) != null) {
            viewCallback.mo78468p();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        mo14775c3();
        boolean booleanExtra = getIntent().getBooleanExtra("KEY_HAS_NEXT_ACTION", false);
        ArrayList arrayList = new ArrayList();
        Serializable serializableExtra = getIntent().getSerializableExtra("KEY_TAG_INFO");
        List<byte[]> list = serializableExtra instanceof List ? (List) serializableExtra : null;
        if (list != null) {
            for (byte[] parseFrom : list) {
                C64848y91 y912 = new C64848y91();
                y912.parseFrom(parseFrom);
                arrayList.add(y912);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(new C55036w0((C64848y91) it.next()));
        }
        this.f189706d = new FinderLiveTagConstract.Presenter(arrayList2, booleanExtra);
        AppCompatActivity activity = getActivity();
        C87412m.m108592e(activity, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        MMActivity mMActivity = (MMActivity) activity;
        FinderLiveTagConstract.Presenter presenter = this.f189706d;
        if (presenter != null) {
            FinderLiveTagConstract.ViewCallback viewCallback = new FinderLiveTagConstract.ViewCallback(mMActivity, presenter);
            FinderLiveTagConstract.Presenter presenter2 = this.f189706d;
            if (presenter2 != null) {
                presenter2.mo78467e(viewCallback);
            } else {
                C87412m.m108603p("presenter");
                throw null;
            }
        } else {
            C87412m.m108603p("presenter");
            throw null;
        }
    }

    public void onDestroy() {
        super.onDestroy();
        FinderLiveTagConstract.Presenter presenter = this.f189706d;
        if (presenter != null && presenter == null) {
            C87412m.m108603p("presenter");
            throw null;
        }
    }
}
