package kq1;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C54219z;
import bl3.C39818r;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.plugin.finder.storage.FinderItem;
import com.tencent.p014mm.protocal.protobuf.FinderJumpInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import dr1.C7493o;
import f40.C86709a0;
import fy3.C32224a;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import ht1.C60200t1;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;
import je1.C9304e1;
import lc3.C10485b;
import nr3.C89059e;
import pf1.C11911l;
import pf1.C62273n;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import sx3.C110818d0;
import te3.t54;
import te3.uc4;
import up1.C37521f;

/* renamed from: kq1.f */
public final class C10389f extends UIComponent {

    /* renamed from: d */
    public final C13601g f31600d = C36568h.m40985a(C10390a.f31604d);

    /* renamed from: e */
    public t54 f31601e;

    /* renamed from: f */
    public FinderJumpInfo f31602f;

    /* renamed from: g */
    public C7493o f31603g;

    /* renamed from: kq1.f$a */
    public static final class C10390a extends C87413o implements C32224a<Boolean> {

        /* renamed from: d */
        public static final C10390a f31604d = new C10390a();

        public C10390a() {
            super(0);
        }

        public Object invoke() {
            C37521f.f99374d.getClass();
            boolean z = false;
            int b = ((C10485b) C86709a0.m107533q(C10485b.class)).vh0().mo107404b("FinderPostEnableSelectRedPacket", 0);
            Log.m105924i("FinderConfig", "FinderPostEnableSelectRedPacket switch = " + b);
            if (b == 1) {
                z = true;
            }
            return Boolean.valueOf(z);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C10389f(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    /* renamed from: c3 */
    public final void mo10707c3(FinderItem finderItem) {
        LinkedList<uc4> linkedList;
        uc4 uc4;
        C87412m.m108594g(finderItem, "item");
        boolean z = true;
        if (!(((Boolean) ((C36570n) this.f31600d).getValue()).booleanValue() && this.f31601e != null)) {
            Log.m105924i("FinderPostRedPackCoverUIC", "onEnterPreviewUI disable");
            return;
        }
        FinderJumpInfo finderJumpInfo = this.f31602f;
        if (finderJumpInfo != null && (linkedList = finderJumpInfo.style) != null && (uc4 = (uc4) C110818d0.m150916N(linkedList)) != null) {
            int i = uc4.f142760f;
            AppCompatActivity activity = getActivity();
            if ((activity instanceof MMActivity ? (MMActivity) activity : null) != null) {
                finderItem.getExtReading().f183805g = 0;
                finderItem.getExtReading().f183802d = "";
                finderItem.getExtReading().f183803e = "";
                long expectId = finderItem.getExpectId();
                if (finderItem.getFeedObject().adFlag == 0) {
                    finderItem.getFeedObject().adFlag = 4;
                }
                String str = finderJumpInfo.jump_id;
                if (!(str == null || str.length() == 0)) {
                    z = false;
                }
                if (z) {
                    finderJumpInfo.jump_id = expectId + "_business_type_" + finderJumpInfo.business_type;
                }
                C54219z<Set<C11911l>> g3 = ((C62273n) C39818r.f106831a.mo62446e(C60200t1.class).mo75002a(C62273n.class)).mo87341g3(expectId, 62);
                LinkedList linkedList2 = new LinkedList();
                linkedList2.add(finderJumpInfo);
                C11911l lVar = new C11911l(62, expectId, i, linkedList2, false, (String) null, 48, (C8480h) null);
                HashSet hashSet = new HashSet();
                hashSet.add(lVar);
                g3.postValue(hashSet);
            }
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (!((Boolean) ((C36570n) this.f31600d).getValue()).booleanValue()) {
            Log.m105924i("FinderPostRedPackCoverUIC", "request red pack cover is disable");
            return;
        }
        C89059e i = new C9304e1().mo9225i();
        AppCompatActivity activity = getActivity();
        C87412m.m108592e(activity, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        i.mo11397F((MMActivity) activity);
        i.mo123420E(new C10391g(this));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C10389f(Fragment fragment) {
        super(fragment);
        C87412m.m108594g(fragment, "fragment");
    }
}
