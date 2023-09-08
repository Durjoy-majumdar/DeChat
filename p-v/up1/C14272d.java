package up1;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.service.C3601l1;
import com.tencent.p014mm.protocal.protobuf.FinderContact;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import di3.C86312j;
import er1.C58684b;
import fe1.C58961d;
import fe1.C58969q;
import gy3.C87412m;
import ht1.C8794p5;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.Vector;
import je1.C9357o2;
import ob0.C117747y;
import pe3.C47465a;
import pe3.C89349b;
import sf0.C48372d;
import te3.C50542nh0;
import te3.C50972qk0;
import te3.C51376tc1;
import te3.C52279zl0;
import up1.C14364t0;
import vp1.C14930g;

/* renamed from: up1.d */
public final class C14272d implements C14364t0 {

    /* renamed from: a */
    public final C14930g f39816a = new C14930g("blockPoster.fp");

    /* renamed from: b */
    public Vector<C8794p5<C51376tc1>> f39817b = new Vector<>();

    /* renamed from: up1.d$a */
    public static final class C14273a implements C8794p5<C51376tc1> {

        /* renamed from: d */
        public final /* synthetic */ C14272d f39818d;

        /* renamed from: e */
        public final /* synthetic */ C14364t0.C14366b f39819e;

        /* renamed from: f */
        public final /* synthetic */ FinderContact f39820f;

        public C14273a(C14272d dVar, C14364t0.C14366b bVar, FinderContact finderContact) {
            this.f39818d = dVar;
            this.f39819e = bVar;
            this.f39820f = finderContact;
        }

        /* renamed from: c5 */
        public void mo705c5(Object obj, C50542nh0 nh02) {
            C58961d.C58963b bVar;
            C58969q b;
            C51376tc1 tc12 = (C51376tc1) obj;
            C87412m.m108594g(tc12, "req");
            C87412m.m108594g(nh02, "ret");
            this.f39818d.f39817b.remove(this);
            C14364t0.C14366b bVar2 = this.f39819e;
            if (bVar2 != null) {
                bVar2.mo3725a(nh02.f138603e == 0);
            }
            if (nh02.f138603e == 0 && tc12.f142118e == 0 && (b = bVar.mo84155b(this.f39820f.username)) != null) {
                b.field_extFlag &= -16385;
                (bVar = C58961d.f168673a).mo84166o(b);
            }
        }
    }

    /* renamed from: a */
    public C117747y mo13639a(List<String> list) {
        C87412m.m108594g(list, "nameList");
        return null;
    }

    /* renamed from: b */
    public boolean mo13640b() {
        return true;
    }

    /* renamed from: c */
    public CharSequence mo13641c(Context context, boolean z) {
        C87412m.m108594g(context, "context");
        return null;
    }

    /* renamed from: d */
    public CharSequence mo13642d(Context context) {
        C87412m.m108594g(context, "context");
        String string = MMApplicationContext.getContext().getString(C0966R.string.fz_);
        C87412m.m108593f(string, "getContext().getString(R…ock_poster_sub_title_new)");
        return string;
    }

    /* renamed from: e */
    public C48372d mo13643e() {
        return this.f39816a;
    }

    /* renamed from: f */
    public CharSequence mo13644f() {
        String string = MMApplicationContext.getContext().getString(C0966R.string.cxn);
        C87412m.m108593f(string, "getContext().getString(R…inder_account_black_list)");
        return string;
    }

    /* renamed from: g */
    public CharSequence mo13645g(Context context) {
        C87412m.m108594g(context, "context");
        String string = MMApplicationContext.getContext().getString(C0966R.string.d2d);
        C87412m.m108593f(string, "getContext().getString(R…inder_block_poster_empty)");
        return string;
    }

    /* renamed from: h */
    public CharSequence mo13646h() {
        String string = MMApplicationContext.getContext().getString(C0966R.string.jsv);
        C87412m.m108593f(string, "getContext().getString(R…ct_finder_black_desc_new)");
        return string;
    }

    /* renamed from: i */
    public boolean mo13647i() {
        return false;
    }

    /* renamed from: j */
    public Set<C117747y> mo13648j(List<? extends FinderContact> list, C14364t0.C14366b bVar) {
        C87412m.m108594g(list, "contacts");
        return null;
    }

    /* renamed from: k */
    public C117747y mo13649k(C89349b bVar) {
        return new C9357o2(bVar);
    }

    /* renamed from: l */
    public LinkedList<FinderContact> mo13650l() {
        return this.f39816a.mo73082b();
    }

    /* renamed from: m */
    public C117747y mo13651m(FinderContact finderContact, C14364t0.C14366b bVar) {
        C87412m.m108594g(finderContact, "contact");
        String str = finderContact.username;
        if (str == null) {
            return null;
        }
        C14273a aVar = new C14273a(this, bVar, finderContact);
        this.f39817b.add(aVar);
        ((C3601l1) C86312j.m106911c(C3601l1.class)).Hu0(str, false, aVar);
        return null;
    }

    /* renamed from: n */
    public LinkedList<FinderContact> mo13652n(C117747y yVar) {
        C87412m.m108592e(yVar, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.cgi.NetSceneBlockPosterList");
        C47465a aVar = ((C9357o2) yVar).f29227h.f127056b.f127083a;
        C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderGetBlockPosterListResponse");
        return ((C52279zl0) aVar).f146059d;
    }

    /* renamed from: o */
    public C89349b mo13653o(C117747y yVar) {
        C87412m.m108592e(yVar, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.cgi.NetSceneBlockPosterList");
        C47465a aVar = ((C9357o2) yVar).f29227h.f127056b.f127083a;
        C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderGetBlockPosterListResponse");
        return ((C52279zl0) aVar).f146060e;
    }

    /* renamed from: p */
    public void mo13654p(Context context) {
        C87412m.m108594g(context, "context");
        Intent intent = new Intent();
        Intent intent2 = !(context instanceof Activity) ? intent : null;
        if (intent2 != null) {
            intent2.addFlags(268435456);
        }
        try {
            intent.putExtra("request_type", 8);
            intent.putExtra("need_history", false);
        } catch (Exception unused) {
        }
        ((C58684b) C86312j.m106911c(C58684b.class)).Ex0(context, (C50972qk0) null, intent);
    }

    /* renamed from: q */
    public CharSequence mo13655q() {
        String string = MMApplicationContext.getContext().getString(C0966R.string.k65);
        C87412m.m108593f(string, "getContext().getString(R…t_finder_unlike_desc_new)");
        return string;
    }
}
