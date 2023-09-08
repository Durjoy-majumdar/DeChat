package com.tencent.p014mm.plugin.finder.nearby.live.square.more;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import androidx.fragment.app.C112919c0;
import bl3.C0324s;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.plugin.finder.p056ui.MMFinderUI;
import gy3.C24560g0;
import ht1.C8815x4;
import java.util.Set;
import kotlin.Metadata;
import ln1.C10585g;
import sx3.C22415w0;
import t91.C64208c;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/nearby/live/square/more/NearbyLiveMoreUI;", "Lcom/tencent/mm/plugin/finder/ui/MMFinderUI;", "<init>", "()V", "plugin-finder-nearby_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.nearby.live.square.more.NearbyLiveMoreUI */
public class NearbyLiveMoreUI extends MMFinderUI {

    /* renamed from: o */
    public final NearbyLiveSquareMoreFragment f15680o = new NearbyLiveSquareMoreFragment();

    /* renamed from: p */
    public boolean f15681p;

    /* renamed from: q */
    public boolean f15682q = true;

    /* renamed from: com.tencent.mm.plugin.finder.nearby.live.square.more.NearbyLiveMoreUI$a */
    public static final class C3311a implements MenuItem.OnMenuItemClickListener {

        /* renamed from: d */
        public final /* synthetic */ NearbyLiveMoreUI f15683d;

        public C3311a(NearbyLiveMoreUI nearbyLiveMoreUI) {
            this.f15683d = nearbyLiveMoreUI;
        }

        public final boolean onMenuItemClick(MenuItem menuItem) {
            this.f15683d.finish();
            return true;
        }
    }

    /* renamed from: J7 */
    public String mo2994J7() {
        return "NearbyLiveMoreUI";
    }

    public void finish() {
        this.f15681p = true;
        C10585g.f31933a.mo10845c();
        super.finish();
    }

    public int getLayoutId() {
        return C0966R.C0971layout.bka;
    }

    public Set<Class<? extends UIComponent>> importUIComponents() {
        return C22415w0.m26092a(C0324s.m265a(C24560g0.m30725a(C8815x4.class)));
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setMMTitle((int) C0966R.string.h6j);
        setBackBtn(new C3311a(this));
        if (this.f15682q) {
            getController().mo177081j0(getContext().getResources().getColor(C0966R.color.f2947a4));
            setBackGroundColorResource(C0966R.color.f2947a4);
            setActionbarColor(getContext().getResources().getColor(C0966R.color.f2947a4));
            findViewById(C0966R.C0970id.iwn).setBackgroundColor(getResources().getColor(C0966R.color.f2947a4));
        }
        NearbyLiveSquareMoreFragment nearbyLiveSquareMoreFragment = this.f15680o;
        Intent intent = getIntent();
        nearbyLiveSquareMoreFragment.setArguments(intent != null ? intent.getExtras() : null);
        Bundle arguments = this.f15680o.getArguments();
        if (arguments != null) {
            arguments.putInt("key_use_dark_style", this.f15682q ? 1 : 0);
        }
        C112919c0 beginTransaction = getSupportFragmentManager().beginTransaction();
        beginTransaction.mo165167i(C0966R.C0970id.e_o, this.f15680o, (String) null, 1);
        beginTransaction.mo165171o(this.f15680o).mo165163e();
        this.f15681p = false;
    }

    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        this.f15680o.setArguments(intent != null ? intent.getExtras() : null);
    }

    public void onPause() {
        super.onPause();
        if (this.f15681p) {
            C64208c.C64209a aVar = C64208c.f181951a;
            C64208c.f181952b = false;
        }
    }

    public void onResume() {
        C64208c.C64209a aVar = C64208c.f181951a;
        C64208c.f181952b = true;
        super.onResume();
    }
}
