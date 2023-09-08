package zd0;

import android.widget.LinearLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.msgsubscription.SubscribeMsgTmpItem;
import com.tencent.p014mm.msgsubscription.p017ui.BizSubscribeMsgManagerUI;
import com.tencent.p014mm.msgsubscription.p017ui.MaxRecyclerView;
import com.tencent.p014mm.msgsubscription.presenter.SubscribeMsgSettingData;
import com.tencent.p014mm.p136ui.widget.MMSwitchBtn;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.List;
import vd0.C22736b;

/* renamed from: zd0.h */
public final class C23464h implements C22736b.C22737a {

    /* renamed from: a */
    public final /* synthetic */ BizSubscribeMsgManagerUI f67301a;

    /* renamed from: zd0.h$a */
    public static final class C23465a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ BizSubscribeMsgManagerUI f67302d;

        /* renamed from: e */
        public final /* synthetic */ SubscribeMsgSettingData f67303e;

        public C23465a(BizSubscribeMsgManagerUI bizSubscribeMsgManagerUI, SubscribeMsgSettingData subscribeMsgSettingData) {
            this.f67302d = bizSubscribeMsgManagerUI;
            this.f67303e = subscribeMsgSettingData;
        }

        public final void run() {
            if (!this.f67302d.isFinishing()) {
                BizSubscribeMsgManagerUI bizSubscribeMsgManagerUI = this.f67302d;
                SubscribeMsgSettingData subscribeMsgSettingData = this.f67303e;
                int i = BizSubscribeMsgManagerUI.f49055o;
                bizSubscribeMsgManagerUI.getClass();
                Log.m105925i("MicroMsg.BizSubscribeMsgManagerUI", "alvinluo updateResult %d, isOpened: %b", Integer.valueOf(subscribeMsgSettingData.f49052f.size()), Boolean.valueOf(subscribeMsgSettingData.f49051e));
                MaxRecyclerView maxRecyclerView = bizSubscribeMsgManagerUI.f49062j;
                if (maxRecyclerView != null) {
                    maxRecyclerView.setVisibility(true ^ subscribeMsgSettingData.f49052f.isEmpty() ? 0 : 8);
                    MaxRecyclerView maxRecyclerView2 = (MaxRecyclerView) bizSubscribeMsgManagerUI.findViewById(C0966R.C0970id.k_3);
                    if (maxRecyclerView2 != null) {
                        maxRecyclerView2.setVisibility(0);
                    }
                    boolean z = subscribeMsgSettingData.f49051e;
                    List<SubscribeMsgTmpItem> list = subscribeMsgSettingData.f49052f;
                    String str = subscribeMsgSettingData.f49053g;
                    MMSwitchBtn mMSwitchBtn = bizSubscribeMsgManagerUI.f49060h;
                    if (mMSwitchBtn != null) {
                        mMSwitchBtn.setCheck(z);
                    }
                    LinearLayout linearLayout = bizSubscribeMsgManagerUI.f49063n;
                    if (linearLayout != null) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(bizSubscribeMsgManagerUI.getResources().getString(C0966R.string.ao8));
                        sb.append(',');
                        sb.append(z ? bizSubscribeMsgManagerUI.getResources().getString(C0966R.string.ao6) : bizSubscribeMsgManagerUI.getResources().getString(C0966R.string.f360188ao3));
                        linearLayout.setContentDescription(sb.toString());
                        bizSubscribeMsgManagerUI.f49059g.clear();
                        bizSubscribeMsgManagerUI.f49059g.addAll(list);
                        C119100f<?> fVar = bizSubscribeMsgManagerUI.f49058f;
                        if (fVar != null) {
                            ArrayList<SubscribeMsgTmpItem> arrayList = bizSubscribeMsgManagerUI.f49059g;
                            C87412m.m108594g(arrayList, "list");
                            fVar.f356655d.clear();
                            fVar.f356655d.addAll(arrayList);
                        }
                        C119100f<?> fVar2 = bizSubscribeMsgManagerUI.f49058f;
                        if (fVar2 != null) {
                            C87412m.m108594g(str, "value");
                            fVar2.f356656e = str;
                        }
                        bizSubscribeMsgManagerUI.mo21973H7(z);
                        return;
                    }
                    C87412m.m108603p("ll");
                    throw null;
                }
                C87412m.m108603p("subscribeMsgList");
                throw null;
            }
        }
    }

    public C23464h(BizSubscribeMsgManagerUI bizSubscribeMsgManagerUI) {
        this.f67301a = bizSubscribeMsgManagerUI;
    }

    /* renamed from: a */
    public void mo35838a() {
        Log.m105920e("MicroMsg.BizSubscribeMsgManagerUI", "alvinluo getSubscribeMsgList ERROR");
    }

    /* renamed from: b */
    public void mo35839b(SubscribeMsgSettingData subscribeMsgSettingData) {
        C87412m.m108594g(subscribeMsgSettingData, "data");
        Log.m105924i("MicroMsg.BizSubscribeMsgManagerUI", "alvinluo getSubscribeMsgList onSuccess");
        BizSubscribeMsgManagerUI bizSubscribeMsgManagerUI = this.f67301a;
        bizSubscribeMsgManagerUI.runOnUiThread(new C23465a(bizSubscribeMsgManagerUI, subscribeMsgSettingData));
    }
}
