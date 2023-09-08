package un3;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.C0125s;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.contact.C74560s1;
import com.tencent.p014mm.plugin.mvvmbase.BaseMvvmActivity;
import com.tencent.p014mm.roomsdk.model.factory.C72940a;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.statecenter.IStateAction;
import com.tencent.p014mm.sdk.statecenter.UIStateCenter;
import com.tencent.p014mm.storage.C72996z1;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import d62.C75339i;
import di3.C86312j;
import f40.C86709a0;
import fy3.C32226l;
import gy3.C8479f0;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import junit.framework.Assert;
import lc3.C10485b;
import nj3.C76879j;
import p530fx.C45819c;
import p910lj.C76701a;
import pg3.C47504d;
import rx3.C13598b0;
import sx3.C36907w;
import tm3.C52354x;
import tm3.C78051b;
import tm3.C78053c;
import tm3.C78065p;
import tm3.C78069w;
import wd3.C78553c1;
import yb2.C15946a;

/* renamed from: un3.i */
public final class C78244i extends C15946a {

    /* renamed from: d */
    public boolean f229212d;

    /* renamed from: un3.i$a */
    public static final class C78245a extends C87413o implements C32226l<C78069w, C13598b0> {

        /* renamed from: d */
        public static final C78245a f229213d = new C78245a();

        public C78245a() {
            super(1);
        }

        public Object invoke(Object obj) {
            IStateAction action;
            C78069w wVar = (C78069w) obj;
            C87412m.m108594g(wVar, "state");
            if (!(((C78051b) wVar.checkAction(C78051b.class)) == null || (action = wVar.getAction()) == null)) {
                action.setResult(new C78053c(true));
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: un3.i$b */
    public static final class C78246b extends C87413o implements C32226l<C78069w, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C78244i f229214d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C78246b(C78244i iVar) {
            super(1);
            this.f229214d = iVar;
        }

        public Object invoke(Object obj) {
            UIStateCenter stateCenter;
            C78069w wVar = (C78069w) obj;
            C87412m.m108594g(wVar, "state");
            if (((C78051b) wVar.checkAction(C78051b.class)) != null) {
                C78244i iVar = this.f229214d;
                HashSet hashSet = new HashSet(C52354x.f146330a.mo73369b(wVar.f228826n, wVar.f228825j, false));
                boolean z = true;
                if (hashSet.size() > 1) {
                    ArrayList arrayList = new ArrayList(C36907w.m41090l(hashSet, 10));
                    Iterator it = hashSet.iterator();
                    while (it.hasNext()) {
                        arrayList.add((String) it.next());
                    }
                    iVar.getClass();
                    Class cls = C45819c.class;
                    if (!iVar.f229212d) {
                        iVar.f229212d = true;
                        boolean z2 = ((C10485b) C86709a0.m107533q(C10485b.class)).vh0().mo107404b("MMDirectCreateAssociateChatRoomSwitch", 0) == 1;
                        if (!z2) {
                            Iterator it4 = arrayList.iterator();
                            while (true) {
                                if (it4.hasNext()) {
                                    if (C72996z1.m85843n5((String) it4.next())) {
                                        z = false;
                                        break;
                                    }
                                } else {
                                    break;
                                }
                            }
                        }
                        C8479f0 f0Var = new C8479f0();
                        if (z2 || z) {
                            T e = ((C45819c) C86312j.m106911c(cls)).mo71192mK("@chatroom").mo71494e("", arrayList);
                            C87412m.m108593f(e, "getService(IRoomFactoryS…reateRoom(\"\", memberList)");
                            f0Var.f27484d = e;
                        } else if (!C74560s1.m89277f()) {
                            C76879j.m92749t(iVar.getActivity(), iVar.getActivity().getString(C0966R.string.j6k), "", (DialogInterface.OnClickListener) null);
                            iVar.f229212d = false;
                        } else {
                            T e2 = ((C45819c) C86312j.m106911c(cls)).mo71192mK("@im.chatroom").mo71494e("", arrayList);
                            C87412m.m108593f(e2, "getService(IRoomFactoryS…reateRoom(\"\", memberList)");
                            f0Var.f27484d = e2;
                        }
                        ((C72940a) f0Var.f27484d).f212615d = new C78240e(f0Var, iVar);
                        ((C72940a) f0Var.f27484d).mo100867d(iVar.getActivity(), iVar.getString(C0966R.string.a3h), iVar.getString(C0966R.string.f360944g53), true, true, new C78241f(iVar, f0Var));
                    }
                } else {
                    BaseMvvmActivity d3 = iVar.mo14598d3();
                    if (!(d3 == null || (stateCenter = d3.getStateCenter()) == null)) {
                        ArrayList arrayList2 = new ArrayList(C36907w.m41090l(hashSet, 10));
                        Iterator it5 = hashSet.iterator();
                        while (it5.hasNext()) {
                            arrayList2.add((String) it5.next());
                        }
                        stateCenter.dispatch(new C78065p(arrayList2, -1));
                    }
                }
            }
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C78244i(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    /* renamed from: g3 */
    public static final void m94528g3(C78244i iVar, int i, int i2, C47504d dVar, String str, boolean z) {
        String str2;
        boolean z2;
        C78244i iVar2 = iVar;
        C47504d dVar2 = dVar;
        iVar.getClass();
        String string = MMApplicationContext.getContext().getString(C0966R.string.b68);
        C87412m.m108593f(string, "getContext().getString(c…oom_sys_msg_invite_split)");
        String str3 = "";
        if (!z) {
            if (dVar2 != null && !Util.isNullOrNil(dVar2.f127467i)) {
                C76879j.m92748s(iVar.getActivity(), dVar2.f127467i, str3);
                return;
            } else if (!z && !Util.isNullOrNil(str)) {
                C76879j.m92748s(iVar.getActivity(), str, str3);
                return;
            }
        }
        if (i2 == -23) {
            String string2 = iVar.getActivity().getString(C0966R.string.i7n);
            C87412m.m108593f(string2, "activity.getString(com.t….room_member_toomuch_tip)");
            String string3 = iVar.getActivity().getString(C0966R.string.i7m);
            C87412m.m108593f(string3, "activity.getString(com.t…ring.room_member_toomuch)");
            String str4 = string3;
            str2 = string2;
            str3 = str4;
        } else {
            str2 = str3;
        }
        C87412m.m108591d(dVar);
        List<String> list = dVar2.f127463e;
        List<String> list2 = dVar2.f127461c;
        if (list == null || list.size() <= 0 || (list.size() != dVar2.f127465g && (list2 == null || list2.size() <= 0 || dVar.mo72507b() != list.size() + list2.size()))) {
            List<String> list3 = dVar2.f127461c;
            if (list3 != null && list3.size() > 0 && dVar2.f127465g == list3.size()) {
                str2 = iVar.getActivity().getString(C0966R.string.f360942g51);
                C87412m.m108593f(str2, "activity.getString(com.t…ing_create_chatroom_fail)");
                str3 = str3 + iVar.getActivity().getString(C0966R.string.eyw, new Object[]{Util.listToString(iVar2.mo108259j3(list3), string)});
            }
            List<String> list4 = dVar2.f127460b;
            if (list4 != null && list4.size() > 0) {
                Iterator<String> it = list4.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (C72996z1.m85843n5(it.next())) {
                            str2 = iVar.getActivity().getString(C0966R.string.f360942g51);
                            C87412m.m108593f(str2, "activity.getString(com.t…ing_create_chatroom_fail)");
                            str3 = iVar.getActivity().getString(C0966R.string.f360943g52);
                            C87412m.m108593f(str3, "activity.getString(com.t…ate_chatroom_openim_fail)");
                            z2 = true;
                            break;
                        }
                    } else {
                        z2 = false;
                        break;
                    }
                }
                if (!z2) {
                    str2 = iVar.getActivity().getString(C0966R.string.f360942g51);
                    C87412m.m108593f(str2, "activity.getString(com.t…ing_create_chatroom_fail)");
                    str3 = str3 + iVar.getActivity().getString(C0966R.string.eyz, new Object[]{Util.listToString(iVar2.mo108259j3(list4), string)});
                }
            }
            if (str2.length() > 0) {
                C76879j.m92748s(iVar.getActivity(), str3, str2);
            } else {
                C76701a.makeText((Context) iVar.getActivity(), (CharSequence) iVar.getActivity().getString(C0966R.string.eyg, new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}), 0).show();
            }
        } else {
            LinkedList linkedList = new LinkedList();
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                linkedList.add(list.get(i3));
            }
            C87412m.m108593f(list2, "memberBlackList");
            Assert.assertTrue(linkedList.size() > 0);
            String string4 = MMApplicationContext.getContext().getString(C0966R.string.b68);
            C87412m.m108593f(string4, "getContext().getString(c…oom_sys_msg_invite_split)");
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(linkedList);
            arrayList.addAll(list2);
            String string5 = iVar.getActivity().getString(C0966R.string.ez8, new Object[]{Util.listToString(iVar2.mo108259j3(arrayList), string4)});
            C87412m.m108593f(string5, "activity.getString(R.str…me(usernameList), split))");
            C76879j.m92709C(iVar.getActivity(), string5, iVar.getActivity().getString(C0966R.string.f360942g51), iVar.getActivity().getString(C0966R.string.ez7), iVar.getActivity().getString(C0966R.string.ez6), true, new C78242g(iVar2, linkedList), (DialogInterface.OnClickListener) null);
        }
    }

    /* renamed from: i3 */
    public static final void m94529i3(C78244i iVar, LinkedList linkedList) {
        iVar.getClass();
        Assert.assertTrue(linkedList.size() > 0);
        LinkedList linkedList2 = new LinkedList();
        int size = linkedList.size();
        for (int i = 0; i < size; i++) {
            linkedList2.add(3);
        }
        new C78553c1(iVar.getActivity(), C78243h.f229211a).mo108531g(linkedList, linkedList2);
    }

    /* renamed from: j3 */
    public final List<String> mo108259j3(List<String> list) {
        ArrayList arrayList = new ArrayList(C36907w.m41090l(list, 10));
        for (String displayName : list) {
            arrayList.add(((C75339i) C86312j.m106911c(C75339i.class)).getDisplayName(displayName));
        }
        return arrayList;
    }

    public void onCreate(Bundle bundle) {
        UIStateCenter stateCenter;
        UIStateCenter stateCenter2;
        BaseMvvmActivity d3 = mo14598d3();
        if (!(d3 == null || (stateCenter2 = d3.getStateCenter()) == null)) {
            stateCenter2.process((C0125s) getActivity(), C78245a.f229213d);
        }
        BaseMvvmActivity d35 = mo14598d3();
        if (d35 != null && (stateCenter = d35.getStateCenter()) != null) {
            stateCenter.observe((C0125s) getActivity(), new C78246b(this));
        }
    }
}
