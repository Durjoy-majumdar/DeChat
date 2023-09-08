package zk1;

import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import android.widget.Toast;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72996z1;
import d62.C75339i;
import di3.C86312j;
import er1.C58739j4;
import f40.C86709a0;
import f62.C75700k0;
import gy3.C8480h;
import ht1.C60172g4;
import j20.C117292a;
import java.util.ArrayList;
import java.util.LinkedList;
import je1.C9363p2;
import nj3.C76912y0;
import o40.C61926c;
import p217oq.C11719g;
import rx3.C13598b0;
import te3.C49098d51;
import te3.C49712hj1;
import te3.C49801i51;
import te3.C50576np2;
import te3.C51066r7;
import tf0.C64916p1;
import zc1.C66785b;
import zk1.C16229h;

/* renamed from: zk1.v */
public final class C16284v implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C16229h f43577d;

    public C16284v(C16229h hVar) {
        this.f43577d = hVar;
    }

    public final void onClick(View view) {
        String str;
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/live/viewmodel/component/FinderLiveNoticeUIC$initView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C16229h hVar = this.f43577d;
        int i = hVar.f43474Q;
        if (i <= 0) {
            Log.m105924i(hVar.f43483d, "illegel time");
        } else if (!hVar.mo14767j3().f220433y || hVar.f43464F != 0) {
            C49712hj1 hj12 = null;
            C61926c.m72668M(new C16224f0(true, hVar, (DialogInterface.OnCancelListener) null));
            C49098d51 d512 = new C49098d51();
            d512.f132118d = i;
            d512.f132121g = hVar.mo14765g3().getEditableText().toString();
            ((C11719g) C86312j.m106911c(C11719g.class)).dv0(i);
            LinkedList linkedList = new LinkedList();
            if (hVar.mo14763e3().f220433y && hVar.f43466H != null) {
                C51066r7 r7Var = new C51066r7();
                r7Var.f140736d = 1;
                C58739j4 j4Var = C58739j4.f168176a;
                C50576np2 np22 = new C50576np2();
                LinkedList<String> linkedList2 = np22.f138714d;
                C16229h.C16230a aVar = hVar.f43466H;
                if (aVar == null || (str = aVar.f43503a) == null) {
                    str = "";
                }
                linkedList2.add(str);
                C13598b0 b0Var = C13598b0.f38549a;
                r7Var.f140737e = j4Var.mo83710g0(np22);
                linkedList.add(r7Var);
            }
            C49801i51 i512 = new C49801i51();
            i512.f135109d = hVar.mo14767j3().f220433y ? hVar.f43464F : 0;
            LinkedList<String> linkedList3 = hVar.f43465G.f144557d;
            if (linkedList3 == null) {
                linkedList3 = new LinkedList<>();
            }
            i512.f135110e = linkedList3;
            LinkedList<String> linkedList4 = new LinkedList<>();
            LinkedList<String> linkedList5 = hVar.f43465G.f144557d;
            if (linkedList5 != null) {
                for (String str2 : linkedList5) {
                    C72996z1 z1Var = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().get(str2);
                    if (z1Var != null) {
                        String username = z1Var.getUsername();
                        if (!(username == null || username.length() == 0)) {
                            linkedList4.add(((C75339i) C86312j.m106911c(C75339i.class)).pv0(z1Var, z1Var.getUsername()));
                        }
                    }
                }
            }
            i512.f135112g = linkedList4;
            LinkedList<String> linkedList6 = hVar.f43465G.f144558e;
            if (linkedList6 == null) {
                linkedList6 = new LinkedList<>();
            }
            i512.f135111f = linkedList6;
            String O5 = C66785b.f191882e.mo90662O5();
            C60172g4 gr02 = ((C64916p1) C86312j.m106911c(C64916p1.class)).gr0(hVar.getActivity());
            if (gr02 != null) {
                hj12 = gr02.mo12861q3();
            }
            C86709a0.m107524d().mo123460f(new C9363p2(O5, d512, 0, hj12, linkedList, i512, (String) null, 64, (C8480h) null));
        } else {
            Toast makeText = C76912y0.makeText((Context) hVar.getContext(), (CharSequence) hVar.getContext().getResources().getString(C0966R.string.mra), 0);
            makeText.setGravity(17, 0, 0);
            makeText.show();
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/viewmodel/component/FinderLiveNoticeUIC$initView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
