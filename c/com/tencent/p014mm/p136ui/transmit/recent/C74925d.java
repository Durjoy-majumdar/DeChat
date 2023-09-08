package com.tencent.p014mm.p136ui.transmit.recent;

import android.database.Cursor;
import android.os.Bundle;
import com.tencent.p014mm.ipcinvoker.C80916r;
import com.tencent.p014mm.ipcinvoker.type.IPCVoid;
import com.tencent.p014mm.p136ui.contact.C74560s1;
import com.tencent.p014mm.plugin.messenger.foundation.PluginMessengerFoundation;
import com.tencent.p014mm.pluginsdk.platformtools.ContactBlackListHelper;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import com.tencent.p014mm.storage.C30783v3;
import com.tencent.p014mm.storage.C44660i2;
import com.tencent.p014mm.storage.C72976h2;
import d62.C75339i;
import di3.C86312j;
import eb0.C45628s0;
import f40.C86709a0;
import f62.C75700k0;
import gl3.C75946n;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import p922vj.C78420a;
import x20.C15618a;

/* renamed from: com.tencent.mm.ui.transmit.recent.d */
public final class C74925d {

    /* renamed from: a */
    public final ArrayList<String> f220304a;

    /* renamed from: b */
    public ArrayList<C75946n> f220305b = new ArrayList<>();

    @Metadata(mo182093d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0005"}, mo182094d2 = {"<anonymous>", "Landroid/os/Bundle;", "kotlin.jvm.PlatformType", "it", "Lcom/tencent/mm/ipcinvoker/type/IPCVoid;", "invoke"}, mo182095k = 3, mo182096mv = {1, 7, 1}, mo182098xi = 48)
    /* renamed from: com.tencent.mm.ui.transmit.recent.d$a */
    public static final class C74926a<InputType, ResultType> implements C80916r {

        /* renamed from: a */
        public static final C74926a<InputType, ResultType> f220306a = new C74926a<>();

        public Object invoke(Object obj) {
            IPCVoid iPCVoid = (IPCVoid) obj;
            ArrayList<ForwardConversationInfo> a = new C74925d().mo104180a();
            Bundle bundle = new Bundle();
            bundle.putParcelableArrayList("list", a);
            return bundle;
        }
    }

    public C74925d() {
        ArrayList<String> arrayList = new ArrayList<>();
        this.f220304a = arrayList;
        if (MMApplicationContext.isMainProcess()) {
            this.f220305b.clear();
            arrayList.clear();
            HashSet hashSet = new HashSet();
            hashSet.addAll(C74560s1.m89273b());
            HashSet<String> h = C45628s0.m50776h();
            h.remove("filehelper");
            hashSet.addAll(h);
            arrayList.addAll(hashSet);
            arrayList.addAll(ContactBlackListHelper.m6942a());
        }
    }

    /* renamed from: a */
    public final ArrayList<ForwardConversationInfo> mo104180a() {
        Class cls = C75700k0.class;
        List<String> e = ((PluginMessengerFoundation) C86312j.m106911c(PluginMessengerFoundation.class)).mo96076P7().mo90702e();
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(e);
        ArrayList<ForwardConversationInfo> arrayList2 = new ArrayList<>();
        C30783v3 Ku = ((C75700k0) C86709a0.m107533q(cls)).mo96094Ku();
        ArrayList<String> arrayList3 = this.f220304a;
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = C78420a.f229768m1;
        Cursor J = ((C44660i2) Ku).mo69739J(arrayList, 1, arrayList3, (String) null, false, "");
        C87412m.m108593f(J, "service(IMessengerStorag…PARENT_REF_NULL,false,\"\")");
        ArrayList arrayList4 = new ArrayList();
        if (J.getCount() > 0) {
            J.moveToFirst();
            int i = 0;
            while (true) {
                int i2 = i + 1;
                C75946n nVar = new C75946n(i);
                C72976h2 h2Var = new C72976h2();
                h2Var.convertFrom(J);
                nVar.mo106181j(((C75700k0) C86709a0.m107533q(cls)).mo96097Ni().mo69674W2(h2Var.getUsername()));
                if (nVar.f222600A == null) {
                    nVar.mo106181j(((C75700k0) C86709a0.m107533q(cls)).mo96097Ni().mo69656H3(h2Var.getUsername()));
                }
                nVar.f222608e = false;
                nVar.f222602y = h2Var.getUsername();
                String username = h2Var.getUsername();
                C87412m.m108593f(username, "conversation.username");
                String nickname = nVar.f222600A.getNickname();
                C87412m.m108593f(nickname, "conversationDataItem.contact.nickname");
                if (Util.isNullOrNil(nickname)) {
                    nickname = ((C75339i) C86312j.m106911c(C75339i.class)).getDisplayName(username);
                    C87412m.m108593f(nickname, "{\n            ServiceMan…yName(username)\n        }");
                }
                nVar.f222601x = nickname;
                Log.m105924i("MircoMsg.RecentForwardDataProvider", "createConversationDataItem " + i + " item: " + nVar + " nickname:" + nVar.f222601x + " username:" + nVar.f222602y);
                arrayList4.add(nVar);
                if (!J.moveToNext()) {
                    break;
                }
                i = i2;
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            Iterator it4 = arrayList4.iterator();
            int i3 = 0;
            while (true) {
                if (!it4.hasNext()) {
                    i3 = -1;
                    break;
                } else if (C87412m.m108589b(((C75946n) it4.next()).f222602y, str)) {
                    break;
                } else {
                    i3++;
                }
            }
            if (i3 > -1) {
                Object obj = arrayList4.get(i3);
                C87412m.m108593f(obj, "items[index]");
                C75946n nVar2 = (C75946n) obj;
                String str2 = nVar2.f222602y;
                String obj2 = nVar2.f222601x.toString();
                String l2 = nVar2.f222600A.mo62913l2();
                C87412m.m108593f(l2, "conversation.contact.alias");
                arrayList2.add(new ForwardConversationInfo(str2, obj2, l2, nVar2.f222600A.mo73969n2().toString()));
            }
        }
        J.close();
        return arrayList2;
    }

    /* renamed from: b */
    public final ArrayList<ForwardConversationInfo> mo104181b() {
        ArrayList<ForwardConversationInfo> arrayList;
        Bundle bundle = (Bundle) C15618a.m14628d(IPCVoid.f10316d, C74926a.f220306a);
        if (bundle != null) {
            bundle.setClassLoader(ForwardConversationInfo.class.getClassLoader());
            arrayList = bundle.getParcelableArrayList("list");
        } else {
            arrayList = null;
        }
        return arrayList == null ? new ArrayList<>() : arrayList;
    }
}
