package xk1;

import al1.C0083r;
import android.content.Intent;
import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.app.AppCompatActivity;
import bl3.C39818r;
import cl1.C0690t1;
import cl1.C54991o;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import d60.C58124b;
import fj1.C45795b;
import gy3.C87412m;
import il1.C9046k5;
import java.util.ArrayList;
import java.util.LinkedList;
import te3.C51946xa1;

/* renamed from: xk1.b2 */
public final class C15717b2 extends UIComponent {

    /* renamed from: d */
    public C9046k5 f42414d;

    /* renamed from: e */
    public C45795b f42415e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C15717b2(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    /* renamed from: c3 */
    public void mo14441c3(int i, View view, C58124b bVar, C45795b bVar2) {
        C87412m.m108594g(view, "rootView");
        C87412m.m108594g(bVar, "statusMonitor");
        C87412m.m108594g(bVar2, "liveData");
        this.f42415e = bVar2;
        LinearLayout linearLayout = (LinearLayout) view.findViewById(C0966R.C0970id.dr6);
        this.f42414d = linearLayout != null ? new C9046k5(linearLayout, bVar2, Integer.valueOf(i)) : null;
        ArrayList<String> arrayList = i == 2 ? new ArrayList<>(((C54991o) bVar2.mo71262a(C54991o.class)).f154376v2.f513a) : getActivity().getIntent().getStringArrayListExtra("KEY_LUCKY_MONEY_CHAT_ROOM_USERNAME");
        Log.m105924i("Finder.FinderLivePostUIC", "onCreate REQUEST_CODE_SELECT_LUCKY_MONEY_ROOM chatroomList:" + arrayList);
        if (arrayList != null && (!arrayList.isEmpty())) {
            mo14442d3(arrayList);
        }
    }

    /* renamed from: d3 */
    public final void mo14442d3(ArrayList<String> arrayList) {
        C45795b bVar;
        C0083r rVar;
        LinkedList<String> linkedList;
        C0083r rVar2;
        LinkedList<String> linkedList2;
        Class cls = C54991o.class;
        C45795b bVar2 = this.f42415e;
        if (!(bVar2 == null || (rVar2 = ((C54991o) bVar2.mo71262a(cls)).f154376v2) == null || (linkedList2 = rVar2.f513a) == null)) {
            linkedList2.clear();
        }
        if (!(arrayList == null || (bVar = this.f42415e) == null || (rVar = ((C54991o) bVar.mo71262a(cls)).f154376v2) == null || (linkedList = rVar.f513a) == null)) {
            linkedList.addAll(arrayList);
        }
        C9046k5 k5Var = this.f42414d;
        if (k5Var != null) {
            k5Var.mo9870a();
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        C51946xa1 xa12;
        LinkedList<String> linkedList;
        LinkedList<String> linkedList2;
        C51946xa1 xa13;
        LinkedList<String> linkedList3;
        LinkedList<String> linkedList4;
        super.onActivityResult(i, i2, intent);
        if (i2 == -1 && i == 1004) {
            ArrayList<String> stringArrayListExtra = intent != null ? intent.getStringArrayListExtra("KEY_LUCKY_MONEY_CHAT_ROOM_USERNAME") : null;
            if (stringArrayListExtra == null) {
                stringArrayListExtra = new ArrayList<>();
            }
            Log.m105924i("Finder.FinderLivePostUIC", "onActivityResult REQUEST_CODE_SELECT_LUCKY_MONEY_ROOM chatroomList:" + stringArrayListExtra);
            mo14442d3(stringArrayListExtra);
            C45795b bVar = this.f42415e;
            if (bVar != null) {
                C0690t1 t1Var = (C0690t1) bVar.mo71262a(C0690t1.class);
                if (t1Var.mo653f3() || t1Var.f1629i == 0) {
                    t1Var.mo651d3();
                } else {
                    for (String str : stringArrayListExtra) {
                        if (!t1Var.f1631n.contains(str)) {
                            t1Var.f1631n.add(str);
                        }
                        if (t1Var.f1635r == null) {
                            t1Var.mo657k3(new C51946xa1());
                        }
                        C51946xa1 xa14 = t1Var.f1635r;
                        boolean z = false;
                        if (!(!((xa14 == null || (linkedList4 = xa14.f144557d) == null || linkedList4.contains(str)) ? false : true) || (xa13 = t1Var.f1635r) == null || (linkedList3 = xa13.f144557d) == null)) {
                            linkedList3.add(str);
                        }
                        C51946xa1 xa15 = t1Var.f1635r;
                        if (!(xa15 == null || (linkedList2 = xa15.f144559f) == null || linkedList2.contains(str))) {
                            z = true;
                        }
                        if (!(!z || (xa12 = t1Var.f1635r) == null || (linkedList = xa12.f144559f) == null)) {
                            linkedList.add(str);
                        }
                    }
                }
            }
            ((C15798z1) C39818r.f106831a.mo62444c(getActivity()).mo75002a(C15798z1.class)).mo14499e3();
        }
    }
}
