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
import com.tencent.thumbplayer.core.common.TPMediaCodecProfileLevel;
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

/* renamed from: up1.g0 */
public final class C14342g0 implements C14364t0 {

    /* renamed from: up1.g0$a */
    public static final class C14343a extends C87413o implements C32226l<String, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ boolean f39889d;

        /* renamed from: e */
        public final /* synthetic */ Context f39890e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C14343a(boolean z, Context context) {
            super(1);
            this.f39889d = z;
            this.f39890e = context;
        }

        public Object invoke(Object obj) {
            C87412m.m108594g((String) obj, "detailSuffix");
            Intent intent = new Intent();
            intent.putExtra("k_sns_tag_id", 5);
            intent.putExtra("k_sns_from_settings_about_sns", 2);
            intent.putExtra("k_tag_detail_sns_block_scene", 8);
            intent.putExtra("BLOCK_LIST_TYPE", 2);
            if (this.f39889d) {
                intent.setClassName(this.f39890e, "com.tencent.mm.ui.contact.privacy.SnsTagDetailUI");
                intent.addFlags(268435456);
                intent.addFlags(67108864);
                Context context = this.f39890e;
                C9556a aVar = new C9556a();
                aVar.mo10233c(intent);
                Context context2 = context;
                C117292a.m165358d(context2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/storage/FinderNotSeeHimListConfig$getSubTitle$1", "invoke", "(Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                context.startActivity((Intent) aVar.mo10231a(0));
                C117292a.m165359e(context2, "com/tencent/mm/plugin/finder/storage/FinderNotSeeHimListConfig$getSubTitle$1", "invoke", "(Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            } else {
                C88144b.m109791i(this.f39890e, "sns", ".ui.SnsTagDetailUI", intent, (Bundle) null);
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: up1.g0$b */
    public static final class C14344b implements C11385n {

        /* renamed from: d */
        public final /* synthetic */ List<String> f39891d;

        /* renamed from: e */
        public final /* synthetic */ C14342g0 f39892e;

        public C14344b(List<String> list, C14342g0 g0Var) {
            this.f39891d = list;
            this.f39892e = g0Var;
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
                    C14342g0 g0Var = this.f39892e;
                    for (C50327ly2 ly22 : linkedList) {
                        String str2 = ly22.f137716e.f137101d;
                        C87412m.m108593f(str2, "it.ModOperation.UserName");
                        g0Var.mo13657s(str2, true);
                    }
                    return;
                }
                return;
            }
            List<String> list = this.f39891d;
            C14342g0 g0Var2 = this.f39892e;
            for (String s : list) {
                g0Var2.mo13657s(s, false);
            }
        }
    }

    /* renamed from: up1.g0$c */
    public static final class C14345c implements C11385n {

        /* renamed from: d */
        public final /* synthetic */ C14364t0.C14366b f39893d;

        public C14345c(C14364t0.C14366b bVar) {
            this.f39893d = bVar;
        }

        public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
            C86709a0.m107529k().f251779b.mo123470p(3990, this);
            C14364t0.C14366b bVar = this.f39893d;
            if (bVar != null) {
                bVar.mo3725a(i == 0 && i2 == 0);
            }
        }
    }

    /* renamed from: up1.g0$d */
    public static final class C14346d implements C11385n {

        /* renamed from: d */
        public final /* synthetic */ C14364t0.C14366b f39894d;

        public C14346d(C14364t0.C14366b bVar) {
            this.f39894d = bVar;
        }

        public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
            C86709a0.m107529k().f251779b.mo123470p(3990, this);
            C14364t0.C14366b bVar = this.f39894d;
            if (bVar != null) {
                bVar.mo3725a(i == 0 && i2 == 0);
            }
        }
    }

    /* renamed from: a */
    public C117747y mo13639a(List<String> list) {
        C87412m.m108594g(list, "nameList");
        LinkedList<String> linkedList = new LinkedList<>();
        Log.m105918d("FinderNotSeeHimListConfig", "add user:" + list.size());
        linkedList.addAll(list);
        for (String s : linkedList) {
            mo13657s(s, true);
        }
        C86709a0.m107529k().f251779b.mo123455a(3990, new C14344b(list, this));
        C11884l lVar = new C11884l(linkedList, TPMediaCodecProfileLevel.HEVCHighTierLevel62, 1, ((C10485b) C86709a0.m107533q(C10485b.class)).vh0().mo107404b("MMBatchModContactTypeMaxNumForServer", 30));
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
        return mo13656r(context, z);
    }

    /* renamed from: d */
    public CharSequence mo13642d(Context context) {
        C87412m.m108594g(context, "context");
        return mo13656r(context, false);
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
        String string = MMApplicationContext.getContext().getString(C0966R.string.iji);
        C87412m.m108593f(string, "getContext().getString(R…not_see_he_like_feed_new)");
        return w3Var.mo83957q1(context, string, '#', intValue, C0966R.color.FG_0, dimension, dimension);
    }

    /* renamed from: g */
    public CharSequence mo13645g(Context context) {
        C87412m.m108594g(context, "context");
        return mo13656r(context, false);
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
        C86709a0.m107529k().f251779b.mo123455a(3990, new C14345c(bVar));
        HashSet hashSet = new HashSet();
        hashSet.clear();
        int i = 0;
        while (i < linkedList.size()) {
            LinkedList linkedList2 = new LinkedList();
            int i2 = 0;
            while (i < linkedList.size() && i2 < b) {
                linkedList2.add(linkedList.get(i2));
                i++;
                i2++;
            }
            C11884l lVar = new C11884l(linkedList, TPMediaCodecProfileLevel.HEVCHighTierLevel62, 2, b);
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
        Cursor S3 = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().mo69670S3((String[]) null, "", "@finder.block.his.liked.android", "", (List<String>) null);
        Log.m105924i("FinderNotSeeHimListConfig", "count = " + S3.getCount());
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
        Log.m105918d("FinderNotSeeHimListConfig", "deleted user:" + finderContact.username);
        String str = finderContact.username;
        if (str != null) {
            linkedList.add(str);
        }
        int b = ((C10485b) C86709a0.m107533q(C10485b.class)).vh0().mo107404b("MMBatchModContactTypeMaxNumForServer", 30);
        C86709a0.m107529k().f251779b.mo123455a(3990, new C14346d(bVar));
        C11884l lVar = new C11884l(linkedList, TPMediaCodecProfileLevel.HEVCHighTierLevel62, 2, b);
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
        ((C58684b) C86312j.m106911c(C58684b.class)).Bx0(context, (Intent) null, "@finder.block.his.liked.android");
    }

    /* renamed from: q */
    public CharSequence mo13655q() {
        String string = MMApplicationContext.getContext().getString(C0966R.string.k65);
        C87412m.m108593f(string, "getContext().getString(R…t_finder_unlike_desc_new)");
        return string;
    }

    /* renamed from: r */
    public final CharSequence mo13656r(Context context, boolean z) {
        String string = context.getString(C0966R.string.d2o);
        C87412m.m108593f(string, "context.getString(R.stri…nder_can_not_see_him_sns)");
        String string2 = context.getString(C0966R.string.foa, new Object[]{string});
        C87412m.m108593f(string2, "context.getString(R.stri…ommend_new, subTitleLink)");
        SpannableString spannableString = new SpannableString(string2);
        spannableString.setSpan(new C4059g5(string, context.getResources().getColor(C0966R.color.Link_80), context.getResources().getColor(C0966R.color.ahf), false, false, new C14343a(z, context)), 0, string.length(), 17);
        return spannableString;
    }

    /* renamed from: s */
    public final void mo13657s(String str, boolean z) {
        Class cls = C75700k0.class;
        C72996z1 z1Var = ((C75700k0) C86709a0.m107533q(cls)).mo96097Ni().get(str);
        if (z1Var != null) {
            if (z) {
                z1Var.setType(z1Var.getType() | TPMediaCodecProfileLevel.HEVCHighTierLevel62);
            } else {
                z1Var.setType(z1Var.getType() & -33554433);
            }
            ((C75700k0) C86709a0.m107533q(cls)).mo96097Ni().mo69719p3(z1Var.getUsername(), z1Var);
        }
    }
}
