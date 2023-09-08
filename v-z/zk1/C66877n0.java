package zk1;

import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.rtmp.p899ui.TXCloudVideoView;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import gy3.C87412m;
import java.util.HashMap;
import lt1.C61401a;
import ph1.C62287a;
import ph1.C62288c;
import ph1.C62292g;
import ph1.C62294j;
import ph1.C62297m;
import vh1.C65749a;

/* renamed from: zk1.n0 */
public final class C66877n0 extends UIComponent {

    /* renamed from: d */
    public final String f192116d = ("FinderLiveExitAnimateOp@" + hashCode() + '}');

    /* renamed from: e */
    public boolean f192117e;

    /* renamed from: f */
    public long f192118f;

    /* renamed from: g */
    public ViewGroup f192119g;

    /* renamed from: h */
    public int f192120h;

    /* renamed from: i */
    public boolean f192121i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C66877n0(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    /* renamed from: c3 */
    public final void mo90868c3(String str) {
        String str2 = this.f192116d;
        Log.m105924i(str2, "notifyFinish source: " + str + " start finish");
        this.f192117e = true;
        getActivity().finish();
        C62287a aVar = C62287a.f177060a;
        StringBuilder sb = new StringBuilder();
        sb.append("clearFluentList fluentExitLiveRoomPlayerList: ");
        HashMap<Long, C62292g> hashMap = C62287a.f177062c;
        sb.append(hashMap.size());
        sb.append(" directorSize: ");
        HashMap<Long, C62297m> hashMap2 = C62287a.f177061b;
        sb.append(hashMap2.size());
        Log.m105924i("FinderFluentReplaySwitchManager", sb.toString());
        hashMap2.clear();
        hashMap.clear();
    }

    /* renamed from: d3 */
    public final void mo90869d3() {
        getActivity().getWindow().setBackgroundDrawable(new ColorDrawable(0));
        getActivity().getWindow().getDecorView().setBackgroundColor(0);
        C62297m b = C62287a.f177060a.mo87354b(this.f192118f);
        if (b == null || !(b instanceof C62288c)) {
            mo90868c3("director = null");
        } else if (b.mo84321f() == null) {
            mo90868c3("onDirectorExit object = null");
        } else {
            C62294j f = b.mo84321f();
            C87412m.m108591d(f);
            C61401a aVar = f.f177089a;
            long j = this.f192118f;
            ViewGroup viewGroup = this.f192119g;
            if (viewGroup != null) {
                C65749a aVar2 = new C65749a(aVar, j, viewGroup, (TXCloudVideoView) null);
                b.mo84317b(aVar2);
                String str = this.f192116d;
                Log.m105924i(str, "onDirectorExit params = " + aVar2);
                b.mo84324i(new C66876m0(this));
                return;
            }
            C87412m.m108603p("parentView");
            throw null;
        }
    }

    public boolean onBackPressed() {
        this.f192121i = true;
        return super.onBackPressed();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        long longExtra = getIntent().getLongExtra("CURRENT_FEED_ID", 0);
        this.f192118f = longExtra;
        C62297m b = C62287a.f177060a.mo87354b(longExtra);
        this.f192120h = b != null ? b.hashCode() : 0;
        String str = this.f192116d;
        Log.m105924i(str, "onCreate currentFeedId: " + this.f192118f + " directorHashCode: " + this.f192120h);
        View findViewById = getActivity().findViewById(C0966R.C0970id.eek);
        C87412m.m108593f(findViewById, "activity.findViewById(R.id.fragment_container)");
        this.f192119g = (ViewGroup) findViewById;
    }

    public void onDestroy() {
        super.onDestroy();
        Log.m105924i(this.f192116d, "onDestroy");
        C62287a aVar = C62287a.f177060a;
        C62297m b = aVar.mo87354b(this.f192118f);
        String str = this.f192116d;
        StringBuilder sb = new StringBuilder();
        sb.append("directorHashCode: ");
        sb.append(this.f192120h);
        sb.append(" direct: ");
        int i = 0;
        sb.append(b != null ? b.hashCode() : 0);
        Log.m105924i(str, sb.toString());
        if (b != null) {
            i = b.hashCode();
        }
        if (i == this.f192120h) {
            aVar.mo87353a(this.f192118f);
        }
    }
}
