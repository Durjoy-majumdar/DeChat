package up1;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.text.SpannableString;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.view.C4059g5;
import com.tencent.p014mm.protocal.protobuf.FinderContact;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.storage.C72996z1;
import di3.C86312j;
import er1.C58684b;
import er1.C58784w3;
import f40.C86709a0;
import f62.C75700k0;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import je1.C9370r3;
import k20.C9556a;
import ke3.C88144b;
import lc3.C10485b;
import ob0.C11385n;
import ob0.C117747y;
import pc0.C11884l;
import pe3.C47465a;
import pe3.C89349b;
import rx3.C13598b0;
import sf0.C48372d;
import te3.C49583gn1;
import te3.C50327ly2;
import te3.C50518nb;
import te3.C51427tp0;
import up1.C14364t0;

/* renamed from: up1.h0 */
public final class C14348h0 implements C14364t0 {

    /* renamed from: up1.h0$a */
    public static final class C14349a extends C87413o implements C32226l<String, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ boolean f39896d;

        /* renamed from: e */
        public final /* synthetic */ Context f39897e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C14349a(boolean z, Context context) {
            super(1);
            this.f39896d = z;
            this.f39897e = context;
        }

        public Object invoke(Object obj) {
            C87412m.m108594g((String) obj, "detailSuffix");
            Intent intent = new Intent();
            intent.putExtra("k_sns_tag_id", 4);
            intent.putExtra("k_sns_from_settings_about_sns", 1);
            intent.putExtra("BLOCK_LIST_TYPE", 1);
            if (this.f39896d) {
                intent.setClassName(this.f39897e, "com.tencent.mm.ui.contact.privacy.SnsTagDetailUI");
                intent.setFlags(268435456);
                Context context = this.f39897e;
                C9556a aVar = new C9556a();
                aVar.mo10233c(intent);
                Context context2 = context;
                C117292a.m165358d(context2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/storage/FinderNotSeeMyListConfig$getSubTitle$1", "invoke", "(Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                context.startActivity((Intent) aVar.mo10231a(0));
                C117292a.m165359e(context2, "com/tencent/mm/plugin/finder/storage/FinderNotSeeMyListConfig$getSubTitle$1", "invoke", "(Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            } else {
                C88144b.m109791i(this.f39897e, "sns", ".ui.SnsBlackDetailUI", intent, (Bundle) null);
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: up1.h0$b */
    public static final class C14350b implements C11385n {

        /* renamed from: d */
        public final /* synthetic */ List<String> f39898d;

        /* renamed from: e */
        public final /* synthetic */ C14348h0 f39899e;

        public C14350b(List<String> list, C14348h0 h0Var) {
            this.f39898d = list;
            this.f39899e = h0Var;
        }

        public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
            LinkedList<C50327ly2> linkedList;
            C86709a0.m107529k().f251779b.mo123470p(3990, this);
            if (!(yVar instanceof C11884l)) {
                return;
            }
            if (i == 0 && i2 == 0) {
                C50518nb j1 = ((C11884l) yVar).mo11760j1();
                if (j1 != null && (linkedList = j1.f138522e) != null) {
                    C14348h0 h0Var = this.f39899e;
                    for (C50327ly2 ly22 : linkedList) {
                        String str2 = ly22.f137716e.f137101d;
                        C87412m.m108593f(str2, "it.ModOperation.UserName");
                        h0Var.mo13659s(str2, true);
                    }
                    return;
                }
                return;
            }
            List<String> list = this.f39898d;
            C14348h0 h0Var2 = this.f39899e;
            for (String s : list) {
                h0Var2.mo13659s(s, false);
            }
        }
    }

    /* renamed from: up1.h0$c */
    public static final class C14351c implements C11385n {

        /* renamed from: d */
        public final /* synthetic */ C14364t0.C14366b f39900d;

        public C14351c(C14364t0.C14366b bVar) {
            this.f39900d = bVar;
        }

        public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
            C86709a0.m107529k().f251779b.mo123470p(3990, this);
            C14364t0.C14366b bVar = this.f39900d;
            if (bVar != null) {
                bVar.mo3725a(i == 0 && i2 == 0);
            }
        }
    }

    /* renamed from: up1.h0$d */
    public static final class C14352d implements C11385n {

        /* renamed from: d */
        public final /* synthetic */ C14364t0.C14366b f39901d;

        public C14352d(C14364t0.C14366b bVar) {
            this.f39901d = bVar;
        }

        public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
            C86709a0.m107529k().f251779b.mo123470p(3990, this);
            C14364t0.C14366b bVar = this.f39901d;
            if (bVar != null) {
                bVar.mo3725a(i == 0 && i2 == 0);
            }
        }
    }

    /* renamed from: a */
    public C117747y mo13639a(List<String> list) {
        C87412m.m108594g(list, "nameList");
        LinkedList<String> linkedList = new LinkedList<>();
        Log.m105918d("FinderNotSeeMyListConfig", "add user:" + list.size());
        linkedList.addAll(list);
        for (String s : linkedList) {
            mo13659s(s, true);
        }
        C86709a0.m107529k().f251779b.mo123455a(3990, new C14350b(list, this));
        C11884l lVar = new C11884l(linkedList, 134217728, 1, ((C10485b) C86709a0.m107533q(C10485b.class)).vh0().mo107404b("MMBatchModContactTypeMaxNumForServer", 30));
        C86709a0.m107524d().mo123460f(lVar);
        return lVar;
    }

    /* renamed from: b */
    public boolean mo13640b() {
        return false;
    }

    /* renamed from: c */
    public CharSequence mo13641c(Context context, boolean z) {
        C87412m.m108594g(context, "context");
        return mo13658r(context, z);
    }

    /* renamed from: d */
    public CharSequence mo13642d(Context context) {
        C87412m.m108594g(context, "context");
        return mo13658r(context, false);
    }

    /* renamed from: e */
    public /* bridge */ /* synthetic */ C48372d mo13643e() {
        return null;
    }

    /* renamed from: f */
    public CharSequence mo13644f() {
        int dimension = (int) MMApplicationContext.getContext().getResources().getDimension(C0966R.dimen.f3738cr);
        C58784w3 w3Var = C58784w3.f168295a;
        Integer b0 = w3Var.mo83917b0(1, true);
        int intValue = b0 != null ? b0.intValue() : C0966R.raw.icons_filled_channels_like_bold;
        Context context = MMApplicationContext.getContext();
        C87412m.m108593f(context, "getContext()");
        String string = MMApplicationContext.getContext().getString(C0966R.string.hvc);
        C87412m.m108593f(string, "getContext().getString(R…ot_push_my_like_feed_new)");
        return w3Var.mo83957q1(context, string, '#', intValue, C0966R.color.FG_0, dimension, dimension);
    }

    /* renamed from: g */
    public CharSequence mo13645g(Context context) {
        C87412m.m108594g(context, "context");
        return mo13658r(context, false);
    }

    /* renamed from: h */
    public CharSequence mo13646h() {
        String string = MMApplicationContext.getContext().getString(C0966R.string.jsv);
        C87412m.m108593f(string, "getContext().getString(R…ct_finder_black_desc_new)");
        return string;
    }

    /* renamed from: i */
    public boolean mo13647i() {
        return true;
    }

    /* renamed from: j */
    public Set<C117747y> mo13648j(List<? extends FinderContact> list, C14364t0.C14366b bVar) {
        C87412m.m108594g(list, "contacts");
        LinkedList linkedList = new LinkedList();
        for (FinderContact finderContact : list) {
            String str = finderContact.username;
            if (str != null) {
                linkedList.add(str);
            }
        }
        int b = ((C10485b) C86709a0.m107533q(C10485b.class)).vh0().mo107404b("MMBatchModContactTypeMaxNumForServer", 30);
        C86709a0.m107529k().f251779b.mo123455a(3990, new C14351c(bVar));
        HashSet hashSet = new HashSet();
        int i = 0;
        while (i < linkedList.size()) {
            LinkedList linkedList2 = new LinkedList();
            int i2 = 0;
            while (i < linkedList.size() && i2 < b) {
                linkedList2.add(linkedList.get(i2));
                i++;
                i2++;
            }
            C11884l lVar = new C11884l(linkedList, 134217728, 2, b);
            C86709a0.m107524d().mo123460f(lVar);
            hashSet.add(lVar);
        }
        return hashSet;
    }

    /* renamed from: k */
    public C117747y mo13649k(C89349b bVar) {
        return null;
    }

    /* renamed from: l */
    public LinkedList<FinderContact> mo13650l() {
        LinkedList<FinderContact> linkedList = new LinkedList<>();
        Cursor S3 = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().mo69670S3((String[]) null, "", "@finder.block.my.liked.android", "", (List<String>) null);
        Log.m105924i("FinderNotSeeMyListConfig", "count = " + S3.getCount());
        while (S3.moveToNext()) {
            C72996z1 z1Var = new C72996z1();
            z1Var.convertFrom(S3);
            FinderContact finderContact = new FinderContact();
            finderContact.username = z1Var.getUsername();
            linkedList.add(finderContact);
        }
        return linkedList;
    }

    /* renamed from: m */
    public C117747y mo13651m(FinderContact finderContact, C14364t0.C14366b bVar) {
        C87412m.m108594g(finderContact, "contact");
        LinkedList linkedList = new LinkedList();
        Log.m105918d("FinderNotSeeMyListConfig", "deleted user:" + finderContact.username);
        String str = finderContact.username;
        if (str != null) {
            linkedList.add(str);
        }
        int b = ((C10485b) C86709a0.m107533q(C10485b.class)).vh0().mo107404b("MMBatchModContactTypeMaxNumForServer", 30);
        C86709a0.m107529k().f251779b.mo123455a(3990, new C14352d(bVar));
        C11884l lVar = new C11884l(linkedList, 134217728, 2, b);
        C86709a0.m107524d().mo123460f(lVar);
        return lVar;
    }

    /* renamed from: n */
    public LinkedList<FinderContact> mo13652n(C117747y yVar) {
        LinkedList<FinderContact> linkedList = new LinkedList<>();
        C87412m.m108592e(yVar, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.cgi.NetSceneFinderGetTagContact");
        C47465a aVar = ((C9370r3) yVar).f29261g.f127056b.f127083a;
        C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderGetTagContactResp");
        LinkedList<C49583gn1> linkedList2 = ((C51427tp0) aVar).f142317d;
        if (linkedList2 != null) {
            for (C49583gn1 gn12 : linkedList2) {
                FinderContact finderContact = gn12.f134140d;
                if (finderContact != null) {
                    linkedList.add(finderContact);
                }
            }
        }
        return linkedList;
    }

    /* renamed from: o */
    public C89349b mo13653o(C117747y yVar) {
        return null;
    }

    /* renamed from: p */
    public void mo13654p(Context context) {
        C87412m.m108594g(context, "context");
        ((C58684b) C86312j.m106911c(C58684b.class)).Bx0(context, (Intent) null, "@finder.block.my.liked.android");
    }

    /* renamed from: q */
    public CharSequence mo13655q() {
        String string = MMApplicationContext.getContext().getString(C0966R.string.k65);
        C87412m.m108593f(string, "getContext().getString(R…t_finder_unlike_desc_new)");
        return string;
    }

    /* renamed from: r */
    public final CharSequence mo13658r(Context context, boolean z) {
        String string = context.getString(C0966R.string.efb);
        C87412m.m108593f(string, "context.getString(R.stri….finder_not_see_mine_sns)");
        String string2 = context.getString(C0966R.string.fng, new Object[]{string});
        C87412m.m108593f(string2, "context.getString(R.stri…e_feed_new, subTitleLink)");
        SpannableString spannableString = new SpannableString(string2);
        spannableString.setSpan(new C4059g5(string, context.getResources().getColor(C0966R.color.Link_80), context.getResources().getColor(C0966R.color.ahf), false, false, new C14349a(z, context)), 0, string.length(), 17);
        return spannableString;
    }

    /* renamed from: s */
    public final void mo13659s(String str, boolean z) {
        Class cls = C75700k0.class;
        C72996z1 z1Var = ((C75700k0) C86709a0.m107533q(cls)).mo96097Ni().get(str);
        if (z1Var != null) {
            if (z) {
                z1Var.setType(z1Var.getType() | 134217728);
            } else {
                z1Var.setType(z1Var.getType() & -134217729);
            }
            ((C75700k0) C86709a0.m107533q(cls)).mo96097Ni().mo69719p3(z1Var.getUsername(), z1Var);
        }
    }
}
