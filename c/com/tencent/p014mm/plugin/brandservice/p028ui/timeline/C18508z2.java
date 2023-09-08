package com.tencent.p014mm.plugin.brandservice.p028ui.timeline;

import a14.C0001s1;
import a14.C53872d1;
import a14.C53895h;
import a14.C53934p0;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Looper;
import android.os.MessageQueue;
import android.text.InputFilter;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.ContextMenu;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.BaseAdapter;
import android.widget.TextView;
import ba3.C39750a;
import com.google.android.gms.common.Scopes;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74783i3;
import com.tencent.p014mm.p136ui.C74928u;
import com.tencent.p014mm.p136ui.tools.C7007c1;
import com.tencent.p014mm.plugin.brandservice.p028ui.timeline.C18412m3;
import com.tencent.p014mm.plugin.brandservice.p028ui.timeline.item.C18311l4;
import com.tencent.p014mm.plugin.brandservice.p028ui.timeline.item.C18353s3;
import com.tencent.p014mm.plugin.brandservice.p028ui.timeline.item.C18355t;
import com.tencent.p014mm.plugin.brandservice.p028ui.timeline.item.C18366u2;
import com.tencent.p014mm.plugin.brandservice.p028ui.timeline.item.C18372v3;
import com.tencent.p014mm.plugin.brandservice.p028ui.timeline.offenread.BizTimeLineHotView;
import com.tencent.p014mm.plugin.brandservice.p028ui.timeline.offenread.C29762i;
import com.tencent.p014mm.plugin.brandservice.p028ui.timeline.offenread.C29763t;
import com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C18479j;
import com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C18485k;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.pluginsdk.model.C19428d;
import com.tencent.p014mm.pluginsdk.model.C19445g;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.SemiXml;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C19613h1;
import com.tencent.p014mm.storage.C19623o0;
import com.tencent.p014mm.storage.C19625p0;
import com.tencent.p014mm.storage.C19627t;
import com.tencent.p014mm.storage.C19636w0;
import com.tencent.p014mm.storage.C44660i2;
import com.tencent.p014mm.storage.C44668u3;
import com.tencent.p014mm.storage.C72996z1;
import com.tencent.p014mm.storage.p0$$f;
import com.tencent.p014mm.storage.p0$$h;
import com.tencent.xweb.util.WXWebReporter;
import cy0.C75308c;
import d62.C75339i;
import di3.C86312j;
import dx0.C31332a;
import eb0.C20583z;
import ex0.C20642c;
import ex0.C45696d;
import f40.C86709a0;
import f62.C75700k0;
import fx0.C45825h;
import fy0.C59335a;
import fy0.C8218c;
import fy0.C8219i;
import fy3.C32224a;
import go3.C76003c;
import gw0.C76073b;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import h81.C32735h;
import h81.C59774i;
import hp3.C87581a;
import ht1.C60193p4;
import ht1.C60200t1;
import j20.C117292a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import k20.C60958c;
import k20.C9556a;
import ke3.C88144b;
import kg3.C76577a;
import kw0.C46746a;
import ky3.C88334c;
import l31.C61212e;
import nj3.C11182m0;
import nj3.C76874e0;
import nr3.C89060f;
import o40.C61926c;
import ox0.C21908c;
import p154fy.C87121j;
import p185kq.C10383h;
import p196ln.C76705f;
import p629ny.C76979h;
import q31.C118148a;
import qo3.C77407n;
import qx0.C22136a;
import rb0.C48009v0;
import rx0.C22260f;
import rx3.C13598b0;
import rx3.C13604l;
import rx3.C36570n;
import s90.C77629i;
import s90.C77630j;
import sx3.C64196u0;
import sx3.C90364q0;
import te3.C118459qf;
import te3.C22508lo3;
import te3.C64522lg;
import te3.C64546m72;
import te3.C64554mg;
import te3.C64635po3;
import te3.mg4;
import wd3.C118762j;
import wx3.C15601d;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.z2 */
public final class C18508z2 extends BaseAdapter implements View.OnCreateContextMenuListener {

    /* renamed from: I */
    public static final C18509a f51409I = new C18509a((C8480h) null);

    /* renamed from: J */
    public static boolean f51410J;

    /* renamed from: K */
    public static long f51411K;

    /* renamed from: L */
    public static int f51412L;

    /* renamed from: M */
    public static int f51413M;

    /* renamed from: N */
    public static int f51414N;

    /* renamed from: P */
    public static int f51415P;

    /* renamed from: Q */
    public static int f51416Q;

    /* renamed from: R */
    public static int f51417R;

    /* renamed from: S */
    public static int f51418S;

    /* renamed from: T */
    public static int f51419T;

    /* renamed from: U */
    public static int f51420U;

    /* renamed from: V */
    public static int f51421V;

    /* renamed from: W */
    public static int f51422W;

    /* renamed from: X */
    public static int f51423X;

    /* renamed from: Y */
    public static Long f51424Y;

    /* renamed from: Z */
    public static Long f51425Z;

    /* renamed from: p0 */
    public static boolean f51426p0;

    /* renamed from: x0 */
    public static boolean f51427x0;

    /* renamed from: A */
    public boolean f51428A;

    /* renamed from: B */
    public boolean f51429B;

    /* renamed from: C */
    public int f51430C;

    /* renamed from: D */
    public final p0$$h f51431D;

    /* renamed from: E */
    public final View.OnClickListener f51432E;

    /* renamed from: F */
    public final C68778t4 f51433F;

    /* renamed from: G */
    public boolean f51434G;

    /* renamed from: H */
    public boolean f51435H;

    /* renamed from: d */
    public final BizTimeLineUI f51436d;

    /* renamed from: e */
    public final List<C19623o0> f51437e;

    /* renamed from: f */
    public final boolean f51438f;

    /* renamed from: g */
    public final List<C19623o0> f51439g = new LinkedList();

    /* renamed from: h */
    public List<C19623o0> f51440h = new LinkedList();

    /* renamed from: i */
    public final C19623o0 f51441i;

    /* renamed from: j */
    public C19623o0 f51442j;

    /* renamed from: n */
    public C18412m3 f51443n;

    /* renamed from: o */
    public BizTimeLineHotView f51444o;

    /* renamed from: p */
    public C18479j f51445p;

    /* renamed from: q */
    public final C18372v3 f51446q;

    /* renamed from: r */
    public boolean f51447r;

    /* renamed from: s */
    public long f51448s;

    /* renamed from: t */
    public boolean f51449t;

    /* renamed from: u */
    public final Set<String> f51450u;

    /* renamed from: v */
    public Set<C77630j> f51451v;

    /* renamed from: w */
    public int f51452w;

    /* renamed from: x */
    public final C21908c f51453x;

    /* renamed from: y */
    public int f51454y;

    /* renamed from: z */
    public int f51455z;

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.z2$a */
    public static final class C18509a {
        public C18509a(C8480h hVar) {
        }

        /* renamed from: a */
        public static final void m19194a(C18509a aVar, C18508z2 z2Var) {
            aVar.getClass();
            WeakReference weakReference = new WeakReference(z2Var);
            WeakReference weakReference2 = new WeakReference(z2Var.f51436d);
            C18508z2 z2Var2 = (C18508z2) weakReference.get();
            boolean z = z2Var2 != null && z2Var2.f51435H;
            if (!C18508z2.f51426p0 && !C18508z2.f51427x0 && z) {
                C18508z2.f51426p0 = true;
                List<C19623o0> list = z2Var.f51439g;
                List<C19623o0> list2 = z2Var.f51440h;
                C18412m3.C18415c<String, C18412m3.C18414b> cVar = z2Var.f51436d.f50249v.f51081o;
                C87412m.m108593f(cVar, "adapter.mContext.reportSessionItemCache");
                C87412m.m108594g(list, "list");
                C87412m.m108594g(list2, "recList");
                C64522lg lgVar = new C64522lg();
                int decodeInt = C20583z.f57949a.mo32230c().decodeInt("BizmsgContextCnt", 20);
                if (decodeInt > 50) {
                    decodeInt = 50;
                }
                if (decodeInt >= 0) {
                    try {
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        for (Map.Entry next : cVar.entrySet()) {
                            if (((C18412m3.C18414b) next.getValue()).f63826F == 1) {
                                linkedHashMap.put(next.getKey(), next.getValue());
                            }
                        }
                        for (C18412m3.C18414b bVar : linkedHashMap.values()) {
                            LinkedList<C64554mg> linkedList = lgVar.f184089d;
                            C59335a aVar2 = C59335a.f169630a;
                            C87412m.m108593f(bVar, "item");
                            linkedList.add(aVar2.mo84439b(bVar, bVar.f63822B, 0, false));
                        }
                        int size = lgVar.f184089d.size();
                        int i = decodeInt - size;
                        Log.m105918d("MicroMsg.BizTLUtil", "getBizRecFeedReqContext click size = " + size);
                        if (i > 0) {
                            if (!list2.isEmpty()) {
                                Iterator it = new C64196u0(list2).iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        break;
                                    }
                                    C19623o0 o0Var = (C19623o0) it.next();
                                    C18412m3.C18414b bVar2 = cVar.get(o0Var.mo25768r2() + "_0");
                                    if (bVar2 != null && bVar2.f63851X0 == 1) {
                                        lgVar.f184089d.addAll(C59335a.m69245a(o0Var, cVar, 0, false));
                                        i--;
                                        if (i <= 0) {
                                            break;
                                        }
                                    }
                                }
                            }
                            Log.m105918d("MicroMsg.BizTLUtil", "getBizRecFeedReqContext add rec size = " + lgVar.f184089d.size());
                            if (i > 0) {
                                if (!list.isEmpty()) {
                                    Iterator it4 = new C64196u0(list).iterator();
                                    while (true) {
                                        if (!it4.hasNext()) {
                                            break;
                                        }
                                        C19623o0 o0Var2 = (C19623o0) it4.next();
                                        C18412m3.C18414b bVar3 = cVar.get(o0Var2.mo25768r2() + "_0");
                                        if (bVar3 != null && bVar3.f63851X0 == 1) {
                                            lgVar.f184089d.addAll(C59335a.m69245a(o0Var2, cVar, 0, false));
                                            i--;
                                            if (i <= 0) {
                                                break;
                                            }
                                        }
                                    }
                                }
                                Log.m105918d("MicroMsg.BizTLUtil", "getBizRecFeedReqContext all size = " + lgVar.f184089d.size());
                            }
                        }
                    } catch (Exception e) {
                        Log.m105920e("MicroMsg.BizTLUtil", "getBizRecFeedReqContext ex " + e.getMessage());
                    }
                }
                C53895h.m60466d(C0001s1.f0d, C53872d1.f151119c, (C53934p0) null, new C18503x2(weakReference, weakReference2, lgVar, (C15601d<? super C18503x2>) null), 2, (Object) null);
            } else if (!z) {
                C61926c.m72668M(new C18502w2(weakReference));
            }
        }

        /* renamed from: b */
        public static void m19195b(C18509a aVar, C18508z2 z2Var, C20583z.C20585c cVar, boolean z, C64635po3 po32, int i, Object obj) {
            boolean z2 = (i & 4) != 0 ? false : z;
            if ((i & 8) != 0) {
                po32 = null;
            }
            aVar.getClass();
            WeakReference weakReference = new WeakReference(z2Var);
            C20583z.C20585c cVar2 = cVar;
            C53895h.m60466d(C0001s1.f0d, C53872d1.f151119c, (C53934p0) null, new C18493v2(cVar2, po32, new WeakReference(z2Var.f51436d), weakReference, z2, (C15601d<? super C18493v2>) null), 2, (Object) null);
        }

        /* renamed from: c */
        public final boolean mo23169c() {
            return C19636w0.m21171m() && C22136a.f62619b;
        }
    }

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.z2$b */
    public static final class C18510b implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C18508z2 f51456d;

        /* renamed from: e */
        public final /* synthetic */ C18412m3 f51457e;

        public C18510b(C18508z2 z2Var, C18412m3 m3Var) {
            this.f51456d = z2Var;
            this.f51457e = m3Var;
        }

        public final void onClick(View view) {
            Class cls = C75700k0.class;
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/brandservice/ui/timeline/BizTimeLineAdapter$avatarClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            Object tag = view.getTag();
            C87412m.m108592e(tag, "null cannot be cast to non-null type com.tencent.mm.storage.BizTimeLineInfo");
            C19623o0 o0Var = (C19623o0) tag;
            String str = o0Var.field_talker;
            C72996z1 z1Var = ((C75700k0) C86709a0.m107533q(cls)).mo96097Ni().get(o0Var.field_talker);
            boolean z = false;
            boolean z2 = !o0Var.mo25758F2() && z1Var != null && !z1Var.mo62927s3();
            boolean z3 = C29762i.f80770a;
            boolean z4 = C29762i.f80771b;
            if (z2 || z4) {
                z = true;
            }
            if (z) {
                Intent intent = new Intent();
                intent.putExtra("Contact_User", str);
                if (z2) {
                    intent.putExtra("Contact_Scene", WXWebReporter.WXWEB_IDKEY_X5WEBVIEW_ONSHOWCUSTOMVIEW_SPECIAL_NATIVE);
                } else {
                    intent.putExtra("Contact_Scene", WXWebReporter.WXXWEB_IDKEY_X5_LOAD_URL_MAX_FAILED_TEST_SYS_SUC);
                }
                intent.putExtra("force_get_contact", true);
                intent.putExtra("key_use_new_contact_profile", true);
                intent.putExtra("KOpenArticleSceneFromScene", 90);
                if (!Util.isNullOrNil(z1Var.getUsername())) {
                    ((C44660i2) ((C75700k0) C86709a0.m107533q(cls)).mo96094Ku()).mo69778p0(z1Var.getUsername());
                }
                C88144b.m109791i(this.f51456d.f51436d, Scopes.PROFILE, ".ui.ContactInfoUI", intent, (Bundle) null);
                this.f51457e.mo22984k(o0Var, 1);
            } else {
                Intent intent2 = new Intent();
                intent2.putExtra("Chat_User", str);
                intent2.putExtra("finish_direct", true);
                intent2.putExtra("KOpenArticleSceneFromScene", 90);
                intent2.putExtra("specific_chat_from_scene", 2);
                intent2.putExtra("preChatTYPE", 11);
                C88144b.m109801s(this.f51456d.f51436d, ".ui.chatting.ChattingUI", intent2, (Bundle) null);
                this.f51457e.mo22984k(o0Var, 9);
                C45825h.f123727a.mo71296i(3, str, "");
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/brandservice/ui/timeline/BizTimeLineAdapter$avatarClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.z2$c */
    public static final class C18511c implements C68778t4 {

        /* renamed from: a */
        public final /* synthetic */ C18412m3 f51458a;

        /* renamed from: b */
        public final /* synthetic */ BizTimeLineHotView f51459b;

        /* renamed from: c */
        public final /* synthetic */ C18508z2 f51460c;

        public C18511c(C18412m3 m3Var, BizTimeLineHotView bizTimeLineHotView, C18508z2 z2Var) {
            this.f51458a = m3Var;
            this.f51459b = bizTimeLineHotView;
            this.f51460c = z2Var;
        }

        /* renamed from: a */
        public final void mo23171a(C19623o0 o0Var, String str, int i, int i2) {
            this.f51458a.mo22975b(o0Var, i, i2);
            this.f51459b.mo23032d(o0Var);
            C18508z2 z2Var = this.f51460c;
            C87412m.m108593f(o0Var, "info");
            z2Var.getClass();
            C22136a.C22137a aVar = C22136a.C22137a.CLICK_SUBSCRIBE;
            C22136a.f62624g = o0Var;
            C22136a.f62623f = C22136a.f62622e;
            C22136a.f62625h = str;
            C22136a.f62626i = aVar;
        }
    }

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.z2$d */
    public static final class C18512d implements C118148a {

        /* renamed from: a */
        public final /* synthetic */ C19623o0 f51461a;

        public C18512d(C19623o0 o0Var) {
            this.f51461a = o0Var;
        }

        /* renamed from: a */
        public /* synthetic */ boolean mo36a(Object obj, String str, int i) {
            return false;
        }

        /* renamed from: b */
        public final Map<String, Object> mo37b(String str) {
            Class cls = C10383h.class;
            C13604l[] lVarArr = new C13604l[6];
            String Wb = ((C59774i) C86312j.m106911c(C59774i.class)).mo84751Wb();
            if (Wb == null) {
                Wb = "";
            }
            lVarArr[0] = new C13604l("behaviour_session_id", Wb);
            int i = 1;
            lVarArr[1] = new C13604l("finder_context_id", ((C10383h) C86312j.m106911c(cls)).mo10696E());
            lVarArr[2] = new C13604l("finder_tab_context_id", ((C10383h) C86312j.m106911c(cls)).mo10698S0());
            C19428d dVar = C19428d.f54856a;
            if (!dVar.mo25185t(this.f51461a.field_talker)) {
                i = 2;
            }
            lVarArr[3] = new C13604l("live_enter_status", Integer.valueOf(i));
            lVarArr[4] = new C13604l("share_username", "");
            lVarArr[5] = new C13604l("finder_feed_export_id", dVar.mo25172f(this.f51461a.field_talker));
            return C90364q0.m113147f(lVarArr);
        }
    }

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.z2$e */
    public static final class C18513e implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C19623o0 f51462d;

        /* renamed from: e */
        public final /* synthetic */ C18508z2 f51463e;

        public C18513e(C19623o0 o0Var, C18508z2 z2Var) {
            this.f51462d = o0Var;
            this.f51463e = z2Var;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/brandservice/ui/timeline/BizTimeLineAdapter$initHeader$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C19428d dVar = C19428d.f54856a;
            C19623o0 o0Var = this.f51462d;
            dVar.mo25156I(o0Var.field_talker, o0Var);
            C19623o0 o0Var2 = this.f51462d;
            o0Var2.f55527l1 = true;
            dVar.mo25190y(this.f51463e.f51436d, this.f51462d.field_talker, (String) null, 3, dVar.mo25174h(o0Var2.field_talker), (List<? extends C118459qf>) null);
            C117292a.m165361g(this, "com/tencent/mm/plugin/brandservice/ui/timeline/BizTimeLineAdapter$initHeader$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.z2$f */
    public static final class C18514f implements View.OnLongClickListener {

        /* renamed from: d */
        public final /* synthetic */ C18508z2 f51464d;

        /* renamed from: e */
        public final /* synthetic */ C19623o0 f51465e;

        public C18514f(C18508z2 z2Var, C19623o0 o0Var) {
            this.f51464d = z2Var;
            this.f51465e = o0Var;
        }

        public final boolean onLongClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/brandservice/ui/timeline/BizTimeLineAdapter$initHeader$2", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
            C18508z2 z2Var = this.f51464d;
            C19623o0 o0Var = this.f51465e;
            z2Var.f51442j = o0Var;
            z2Var.f51443n.mo22984k(o0Var, 20);
            C22260f fVar = this.f51464d.f51436d.f50233d;
            C87412m.m108593f(view, LocaleUtil.ITALIAN);
            fVar.mo35421d(view, this.f51465e, (C77630j) null, 0, false);
            C117292a.m165362h(false, this, "com/tencent/mm/plugin/brandservice/ui/timeline/BizTimeLineAdapter$initHeader$2", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
            return false;
        }
    }

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.z2$g */
    public static final class C18515g implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ int f51466d;

        /* renamed from: e */
        public final /* synthetic */ C18508z2 f51467e;

        public C18515g(int i, C18508z2 z2Var) {
            this.f51466d = i;
            this.f51467e = z2Var;
        }

        public final void run() {
            if (this.f51466d == this.f51467e.getCount() - 1 && !this.f51467e.f51434G) {
                Log.m105925i("MicroMsg.BizTimeLineAdapter", "loadMoreData %d/%d", Integer.valueOf(this.f51466d), Integer.valueOf(this.f51467e.getCount()));
                if (!this.f51467e.mo23164u()) {
                    this.f51467e.mo23165v();
                } else if (!C18508z2.f51409I.mo23169c()) {
                    C18479j jVar = this.f51467e.f51445p;
                    jVar.getClass();
                    if (C18479j.f51307k == null) {
                        C18479j.m19131h();
                    }
                    if (C18479j.f51307k.booleanValue()) {
                        C31332a.m39373a("BizTimeLineImgLoaderThread", new C18485k(jVar), 0);
                    }
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.z2$h */
    public static final class C18516h extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C18508z2 f51468d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C18516h(C18508z2 z2Var) {
            super(0);
            this.f51468d = z2Var;
        }

        public Object invoke() {
            C18509a.m19194a(C18508z2.f51409I, this.f51468d);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.z2$i */
    public static final class C18517i extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C18508z2 f51469d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C18517i(C18508z2 z2Var) {
            super(0);
            this.f51469d = z2Var;
        }

        public Object invoke() {
            C18509a.m19194a(C18508z2.f51409I, this.f51469d);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.z2$j */
    public static final class C18518j implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C18508z2 f51470d;

        public C18518j(C18508z2 z2Var) {
            this.f51470d = z2Var;
        }

        public final void run() {
            C18508z2 z2Var = this.f51470d;
            z2Var.mo23138E(z2Var.f51439g);
        }
    }

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.z2$k */
    public static final class C18519k implements p0$$h {

        /* renamed from: a */
        public final /* synthetic */ C18508z2 f51471a;

        /* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.z2$k$a */
        public static final class C18520a implements MessageQueue.IdleHandler {

            /* renamed from: d */
            public final /* synthetic */ C18508z2 f51472d;

            /* renamed from: e */
            public final /* synthetic */ Object f51473e;

            /* renamed from: f */
            public final /* synthetic */ p0$$f f51474f;

            public C18520a(C18508z2 z2Var, Object obj, p0$$f p0__f) {
                this.f51472d = z2Var;
                this.f51473e = obj;
                this.f51474f = p0__f;
            }

            /* JADX INFO: finally extract failed */
            /* JADX WARNING: Removed duplicated region for block: B:137:0x02cd  */
            /* JADX WARNING: Removed duplicated region for block: B:147:0x01a5 A[EDGE_INSN: B:147:0x01a5->B:89:0x01a5 ?: BREAK  , SYNTHETIC] */
            /* JADX WARNING: Removed duplicated region for block: B:155:? A[RETURN, SYNTHETIC] */
            /* JADX WARNING: Removed duplicated region for block: B:83:0x0185 A[Catch:{ all -> 0x02d6 }] */
            /* JADX WARNING: Removed duplicated region for block: B:91:0x01ad A[Catch:{ all -> 0x02d6 }] */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public boolean queueIdle() {
                /*
                    r26 = this;
                    r1 = r26
                    android.os.MessageQueue r0 = android.os.Looper.myQueue()
                    r0.removeIdleHandler(r1)
                    com.tencent.mm.plugin.brandservice.ui.timeline.z2 r0 = r1.f51472d
                    com.tencent.mm.plugin.brandservice.ui.timeline.BizTimeLineUI r0 = r0.f51436d
                    r2 = 0
                    if (r0 == 0) goto L_0x02dc
                    boolean r0 = r0.isFinishing()
                    if (r0 == 0) goto L_0x0018
                    goto L_0x02dc
                L_0x0018:
                    com.tencent.mm.plugin.brandservice.ui.timeline.z2 r0 = r1.f51472d
                    java.lang.Object r3 = r1.f51473e
                    java.lang.String r4 = "stg"
                    gy3.C87412m.m108593f(r3, r4)
                    com.tencent.mm.storage.p0$$f r3 = r1.f51474f
                    com.tencent.mm.storage.p0$$g r4 = com.tencent.p014mm.storage.p0$$g.RE_SORT
                    com.tencent.mm.plugin.brandservice.ui.timeline.BizTimeLineUI r5 = r0.f51436d
                    com.tencent.mm.plugin.bizui.widget.StoryListView r5 = r5.f50235f
                    if (r5 != 0) goto L_0x002e
                    goto L_0x02d5
                L_0x002e:
                    int r6 = r5.getFirstVisiblePosition()
                    com.tencent.mm.plugin.brandservice.ui.timeline.BizTimeLineUI r7 = r0.f51436d
                    com.tencent.mm.plugin.brandservice.ui.timeline.offenread.BizTimeLineHotView r8 = r7.f50245r
                    int r8 = r8.getVisibility()
                    r9 = 1
                    if (r8 == 0) goto L_0x0048
                    android.widget.LinearLayout r7 = r7.f50240n
                    int r7 = r7.getVisibility()
                    if (r7 != 0) goto L_0x0046
                    goto L_0x0048
                L_0x0046:
                    r7 = 0
                    goto L_0x0049
                L_0x0048:
                    r7 = 1
                L_0x0049:
                    if (r7 != 0) goto L_0x004e
                    if (r6 != 0) goto L_0x004e
                    r6 = 1
                L_0x004e:
                    android.view.View r7 = r5.getChildAt(r2)
                    if (r7 == 0) goto L_0x0059
                    int r7 = r7.getTop()
                    goto L_0x005a
                L_0x0059:
                    r7 = 0
                L_0x005a:
                    r5.setBlockLayoutChildren(r9)
                    if (r3 == 0) goto L_0x02be
                    com.tencent.mm.storage.o0 r8 = r3.f55563b     // Catch:{ all -> 0x02d6 }
                    java.lang.String r10 = "MicroMsg.BizTimeLineAdapter"
                    if (r8 == 0) goto L_0x007d
                    boolean r8 = r0.mo23157o(r8)     // Catch:{ all -> 0x02d6 }
                    if (r8 == 0) goto L_0x007d
                    java.lang.String r0 = "alvinluo onDataChnage filterMsg %d"
                    java.lang.Object[] r4 = new java.lang.Object[r9]     // Catch:{ all -> 0x02d6 }
                    com.tencent.mm.storage.o0 r3 = r3.f55563b     // Catch:{ all -> 0x02d6 }
                    int r3 = r3.field_type     // Catch:{ all -> 0x02d6 }
                    java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x02d6 }
                    r4[r2] = r3     // Catch:{ all -> 0x02d6 }
                    com.tencent.p014mm.sdk.platformtools.Log.m105925i(r10, r0, r4)     // Catch:{ all -> 0x02d6 }
                    goto L_0x00cb
                L_0x007d:
                    java.lang.String r8 = "alvinluo onDataChange eventType: %s"
                    java.lang.Object[] r11 = new java.lang.Object[r9]     // Catch:{ all -> 0x02d6 }
                    com.tencent.mm.storage.p0$$g r12 = r3.f55562a     // Catch:{ all -> 0x02d6 }
                    r11[r2] = r12     // Catch:{ all -> 0x02d6 }
                    com.tencent.p014mm.sdk.platformtools.Log.m105925i(r10, r8, r11)     // Catch:{ all -> 0x02d6 }
                    com.tencent.mm.storage.p0$$g r8 = r3.f55562a     // Catch:{ all -> 0x02d6 }
                    com.tencent.mm.storage.p0$$g r11 = com.tencent.p014mm.storage.p0$$g.INSERT     // Catch:{ all -> 0x02d6 }
                    if (r8 != r11) goto L_0x01cf
                    com.tencent.mm.storage.o0 r11 = r3.f55563b     // Catch:{ all -> 0x02d6 }
                    if (r11 == 0) goto L_0x01cf
                    java.util.List<com.tencent.mm.storage.o0> r4 = r0.f51439g     // Catch:{ all -> 0x02d6 }
                    java.util.LinkedList r4 = (java.util.LinkedList) r4     // Catch:{ all -> 0x02d6 }
                    int r4 = r4.size()     // Catch:{ all -> 0x02d6 }
                    java.lang.String r8 = "notifyInfo.info"
                    if (r4 <= 0) goto L_0x0124
                    com.tencent.mm.plugin.brandservice.ui.timeline.z2$a r4 = com.tencent.p014mm.plugin.brandservice.p028ui.timeline.C18508z2.f51409I     // Catch:{ all -> 0x02d6 }
                    boolean r4 = r4.mo23169c()     // Catch:{ all -> 0x02d6 }
                    if (r4 == 0) goto L_0x00cd
                    com.tencent.mm.storage.o0 r4 = r3.f55563b     // Catch:{ all -> 0x02d6 }
                    long r11 = r4.mo25767q2()     // Catch:{ all -> 0x02d6 }
                    java.util.List<com.tencent.mm.storage.o0> r4 = r0.f51439g     // Catch:{ all -> 0x02d6 }
                    java.util.LinkedList r4 = (java.util.LinkedList) r4     // Catch:{ all -> 0x02d6 }
                    java.lang.Object r4 = r4.get(r2)     // Catch:{ all -> 0x02d6 }
                    com.tencent.mm.storage.o0 r4 = (com.tencent.p014mm.storage.C19623o0) r4     // Catch:{ all -> 0x02d6 }
                    long r13 = r4.mo25767q2()     // Catch:{ all -> 0x02d6 }
                    int r4 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
                    if (r4 >= 0) goto L_0x00cd
                    java.lang.String r0 = "onDataChange reject msg %s"
                    java.lang.Object[] r4 = new java.lang.Object[r9]     // Catch:{ all -> 0x02d6 }
                    com.tencent.mm.storage.o0 r3 = r3.f55563b     // Catch:{ all -> 0x02d6 }
                    java.lang.String r3 = r3.field_talker     // Catch:{ all -> 0x02d6 }
                    r4[r2] = r3     // Catch:{ all -> 0x02d6 }
                    com.tencent.p014mm.sdk.platformtools.Log.m105925i(r10, r0, r4)     // Catch:{ all -> 0x02d6 }
                L_0x00cb:
                    r4 = 0
                    goto L_0x010a
                L_0x00cd:
                    java.util.List<com.tencent.mm.storage.o0> r4 = r0.f51439g     // Catch:{ all -> 0x02d6 }
                    java.util.LinkedList r4 = (java.util.LinkedList) r4     // Catch:{ all -> 0x02d6 }
                    int r4 = r4.size()     // Catch:{ all -> 0x02d6 }
                    r8 = 0
                L_0x00d6:
                    if (r8 >= r4) goto L_0x0122
                    java.util.List<com.tencent.mm.storage.o0> r11 = r0.f51439g     // Catch:{ all -> 0x02d6 }
                    java.util.LinkedList r11 = (java.util.LinkedList) r11     // Catch:{ all -> 0x02d6 }
                    java.lang.Object r11 = r11.get(r8)     // Catch:{ all -> 0x02d6 }
                    com.tencent.mm.storage.o0 r11 = (com.tencent.p014mm.storage.C19623o0) r11     // Catch:{ all -> 0x02d6 }
                    com.tencent.mm.storage.o0 r12 = r3.f55563b     // Catch:{ all -> 0x02d6 }
                    long r13 = r12.field_orderFlag     // Catch:{ all -> 0x02d6 }
                    r15 = r3
                    long r2 = r11.field_orderFlag     // Catch:{ all -> 0x02d6 }
                    int r16 = (r13 > r2 ? 1 : (r13 == r2 ? 0 : -1))
                    if (r16 != 0) goto L_0x0110
                    int r2 = r12.field_type     // Catch:{ all -> 0x02d6 }
                    int r3 = r11.field_type     // Catch:{ all -> 0x02d6 }
                    if (r2 != r3) goto L_0x0110
                    r20 = 101(0x65, double:5.0E-322)
                    kj2.d r17 = kj2.C117407d.INSTANCE     // Catch:{ all -> 0x02d6 }
                    r18 = 1454(0x5ae, double:7.184E-321)
                    r22 = 1
                    r17.mo182089r(r18, r20, r22)     // Catch:{ all -> 0x02d6 }
                    java.lang.String r0 = "onDataChange msg exist %s"
                    java.lang.Object[] r2 = new java.lang.Object[r9]     // Catch:{ all -> 0x02d6 }
                    java.lang.String r3 = r11.field_talker     // Catch:{ all -> 0x02d6 }
                    r4 = 0
                    r2[r4] = r3     // Catch:{ all -> 0x02d6 }
                    com.tencent.p014mm.sdk.platformtools.Log.m105925i(r10, r0, r2)     // Catch:{ all -> 0x02d6 }
                L_0x010a:
                    r5.setBlockLayoutChildren(r4)
                    r2 = 0
                    goto L_0x02d5
                L_0x0110:
                    if (r16 <= 0) goto L_0x011d
                    java.util.List<com.tencent.mm.storage.o0> r2 = r0.f51439g     // Catch:{ all -> 0x02d6 }
                    java.util.LinkedList r2 = (java.util.LinkedList) r2     // Catch:{ all -> 0x02d6 }
                    r2.add(r8, r12)     // Catch:{ all -> 0x02d6 }
                    r3 = r15
                    r2 = 1
                    r4 = 1
                    goto L_0x0134
                L_0x011d:
                    int r8 = r8 + 1
                    r3 = r15
                    r2 = 0
                    goto L_0x00d6
                L_0x0122:
                    r2 = 0
                    goto L_0x0133
                L_0x0124:
                    r15 = r3
                    java.util.List<com.tencent.mm.storage.o0> r2 = r0.f51439g     // Catch:{ all -> 0x02d6 }
                    r3 = r15
                    com.tencent.mm.storage.o0 r4 = r3.f55563b     // Catch:{ all -> 0x02d6 }
                    gy3.C87412m.m108593f(r4, r8)     // Catch:{ all -> 0x02d6 }
                    java.util.LinkedList r2 = (java.util.LinkedList) r2     // Catch:{ all -> 0x02d6 }
                    r2.add(r4)     // Catch:{ all -> 0x02d6 }
                    r2 = 1
                L_0x0133:
                    r4 = 0
                L_0x0134:
                    if (r2 == 0) goto L_0x013b
                    java.util.List<com.tencent.mm.storage.o0> r2 = r0.f51439g     // Catch:{ all -> 0x02d6 }
                    r0.mo23138E(r2)     // Catch:{ all -> 0x02d6 }
                L_0x013b:
                    com.tencent.mm.storage.o0 r2 = r0.mo23159p()     // Catch:{ all -> 0x02d6 }
                    if (r2 == 0) goto L_0x0167
                    long r10 = r2.mo25767q2()     // Catch:{ all -> 0x02d6 }
                    r12 = 1
                    int r8 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
                    if (r8 != 0) goto L_0x014d
                    r8 = 1
                    goto L_0x014e
                L_0x014d:
                    r8 = 0
                L_0x014e:
                    if (r8 == 0) goto L_0x0151
                    goto L_0x0168
                L_0x0151:
                    long r10 = r0.f51448s     // Catch:{ all -> 0x02d6 }
                    r12 = 0
                    int r8 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
                    if (r8 >= 0) goto L_0x015c
                    r0.mo23167x()     // Catch:{ all -> 0x02d6 }
                L_0x015c:
                    long r10 = r2.mo25767q2()     // Catch:{ all -> 0x02d6 }
                    long r12 = r0.f51448s     // Catch:{ all -> 0x02d6 }
                    int r2 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
                    if (r2 != 0) goto L_0x0167
                    goto L_0x0168
                L_0x0167:
                    r9 = 0
                L_0x0168:
                    if (r9 == 0) goto L_0x01a5
                    java.lang.Long r2 = com.tencent.p014mm.plugin.brandservice.p028ui.timeline.C18508z2.f51424Y     // Catch:{ all -> 0x02d6 }
                    if (r2 != 0) goto L_0x01a5
                    com.tencent.mm.plugin.brandservice.ui.timeline.z2$a r2 = com.tencent.p014mm.plugin.brandservice.p028ui.timeline.C18508z2.f51409I     // Catch:{ all -> 0x02d6 }
                    boolean r2 = r2.mo23169c()     // Catch:{ all -> 0x02d6 }
                    if (r2 != 0) goto L_0x01a5
                    java.util.List<com.tencent.mm.storage.o0> r2 = r0.f51439g     // Catch:{ all -> 0x02d6 }
                    java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x02d6 }
                    r8 = -1
                    r10 = r8
                L_0x017f:
                    boolean r12 = r2.hasNext()     // Catch:{ all -> 0x02d6 }
                    if (r12 == 0) goto L_0x01a5
                    java.lang.Object r12 = r2.next()     // Catch:{ all -> 0x02d6 }
                    com.tencent.mm.storage.o0 r12 = (com.tencent.p014mm.storage.C19623o0) r12     // Catch:{ all -> 0x02d6 }
                    int r13 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
                    if (r13 == 0) goto L_0x01a0
                    long r13 = r12.mo25767q2()     // Catch:{ all -> 0x02d6 }
                    int r15 = (r10 > r13 ? 1 : (r10 == r13 ? 0 : -1))
                    if (r15 == 0) goto L_0x01a0
                    long r8 = r12.field_orderFlag     // Catch:{ all -> 0x02d6 }
                    java.lang.Long r2 = java.lang.Long.valueOf(r8)     // Catch:{ all -> 0x02d6 }
                    com.tencent.p014mm.plugin.brandservice.p028ui.timeline.C18508z2.f51424Y = r2     // Catch:{ all -> 0x02d6 }
                    goto L_0x01a5
                L_0x01a0:
                    long r10 = r12.mo25767q2()     // Catch:{ all -> 0x02d6 }
                    goto L_0x017f
                L_0x01a5:
                    com.tencent.mm.storage.o0 r2 = r3.f55563b     // Catch:{ all -> 0x02d6 }
                    boolean r2 = r2.mo25758F2()     // Catch:{ all -> 0x02d6 }
                    if (r2 == 0) goto L_0x01b7
                    com.tencent.mm.storage.o0 r2 = r3.f55563b     // Catch:{ all -> 0x02d6 }
                    fy0.C20739g.m22690b(r2)     // Catch:{ all -> 0x02d6 }
                    com.tencent.mm.storage.o0 r2 = r3.f55563b     // Catch:{ all -> 0x02d6 }
                    r2.mo25774x2()     // Catch:{ all -> 0x02d6 }
                L_0x01b7:
                    com.tencent.mm.plugin.brandservice.ui.timeline.m3 r2 = r0.f51443n     // Catch:{ all -> 0x02d6 }
                    r20 = 5
                    r22 = 0
                    r24 = 0
                    r25 = 0
                    java.lang.String r16 = ""
                    r17 = 0
                    r19 = 0
                    r21 = -1
                    r15 = r2
                    r15.mo22985l(r16, r17, r19, r20, r21, r22, r24, r25)     // Catch:{ all -> 0x02d6 }
                    goto L_0x02bf
                L_0x01cf:
                    com.tencent.mm.storage.p0$$g r2 = com.tencent.p014mm.storage.p0$$g.DELETE     // Catch:{ all -> 0x02d6 }
                    if (r8 == r2) goto L_0x01ee
                    if (r8 != r4) goto L_0x01d6
                    goto L_0x01ee
                L_0x01d6:
                    com.tencent.mm.storage.p0$$g r2 = com.tencent.p014mm.storage.p0$$g.UPDATE     // Catch:{ all -> 0x02d6 }
                    if (r8 != r2) goto L_0x02be
                    java.util.List<com.tencent.mm.storage.o0> r2 = r3.f55565d     // Catch:{ all -> 0x02d6 }
                    boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.util.List) r2)     // Catch:{ all -> 0x02d6 }
                    if (r2 != 0) goto L_0x02be
                    java.util.List<com.tencent.mm.storage.o0> r2 = r3.f55565d     // Catch:{ all -> 0x02d6 }
                    java.lang.String r3 = "notifyInfo.list"
                    gy3.C87412m.m108593f(r2, r3)     // Catch:{ all -> 0x02d6 }
                    r0.mo23137D(r2)     // Catch:{ all -> 0x02d6 }
                    goto L_0x02be
                L_0x01ee:
                    r0.mo23167x()     // Catch:{ all -> 0x02d6 }
                    com.tencent.mm.storage.o0 r8 = r0.mo23161r()     // Catch:{ all -> 0x02d6 }
                    if (r8 != 0) goto L_0x01f8
                    goto L_0x0216
                L_0x01f8:
                    java.util.List<com.tencent.mm.storage.o0> r11 = r0.f51439g     // Catch:{ all -> 0x02d6 }
                    java.util.LinkedList r11 = (java.util.LinkedList) r11     // Catch:{ all -> 0x02d6 }
                    r11.clear()     // Catch:{ all -> 0x02d6 }
                    com.tencent.mm.storage.p0 r11 = rb0.C48009v0.Jx0()     // Catch:{ all -> 0x02d6 }
                    long r12 = r8.field_orderFlag     // Catch:{ all -> 0x02d6 }
                    java.util.List r8 = r11.mo25808mI(r12)     // Catch:{ all -> 0x02d6 }
                    r0.mo23155n(r8)     // Catch:{ all -> 0x02d6 }
                    java.util.List<com.tencent.mm.storage.o0> r8 = r0.f51439g     // Catch:{ all -> 0x02d6 }
                    r0.mo23138E(r8)     // Catch:{ all -> 0x02d6 }
                    java.util.List<com.tencent.mm.storage.o0> r8 = r0.f51439g     // Catch:{ all -> 0x02d6 }
                    r0.mo23139b(r8)     // Catch:{ all -> 0x02d6 }
                L_0x0216:
                    com.tencent.mm.storage.p0$$g r8 = r3.f55562a     // Catch:{ all -> 0x02d6 }
                    if (r8 != r4) goto L_0x023c
                    com.tencent.mm.storage.z0 r4 = com.tencent.p014mm.storage.C19641z0.f55645a     // Catch:{ all -> 0x02d6 }
                    r8 = 3
                    r4.mo25867j(r8)     // Catch:{ all -> 0x02d6 }
                    java.util.List<com.tencent.mm.storage.o0> r4 = r0.f51439g     // Catch:{ all -> 0x02d6 }
                    boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.util.List) r4)     // Catch:{ all -> 0x02d6 }
                    if (r4 != 0) goto L_0x023c
                    com.tencent.mm.storage.p0 r4 = rb0.C48009v0.Jx0()     // Catch:{ all -> 0x02d6 }
                    java.util.List<com.tencent.mm.storage.o0> r8 = r0.f51439g     // Catch:{ all -> 0x02d6 }
                    java.util.LinkedList r8 = (java.util.LinkedList) r8     // Catch:{ all -> 0x02d6 }
                    r11 = 0
                    java.lang.Object r8 = r8.get(r11)     // Catch:{ all -> 0x02d6 }
                    com.tencent.mm.storage.o0 r8 = (com.tencent.p014mm.storage.C19623o0) r8     // Catch:{ all -> 0x02d6 }
                    long r11 = r8.field_orderFlag     // Catch:{ all -> 0x02d6 }
                    r4.r50(r11)     // Catch:{ all -> 0x02d6 }
                L_0x023c:
                    com.tencent.mm.storage.p0$$g r3 = r3.f55562a     // Catch:{ all -> 0x02d6 }
                    if (r3 != r2) goto L_0x0272
                    boolean r2 = qx0.C22136a.f62621d     // Catch:{ all -> 0x02d6 }
                    if (r2 != 0) goto L_0x0272
                    java.util.List<com.tencent.mm.storage.o0> r2 = r0.f51439g     // Catch:{ all -> 0x02d6 }
                    java.util.LinkedList r2 = (java.util.LinkedList) r2     // Catch:{ all -> 0x02d6 }
                    int r2 = r2.size()     // Catch:{ all -> 0x02d6 }
                    if (r2 != 0) goto L_0x0272
                    com.tencent.mm.storage.p0 r2 = rb0.C48009v0.Jx0()     // Catch:{ all -> 0x02d6 }
                    int r2 = r2.mo25786NQ()     // Catch:{ all -> 0x02d6 }
                    if (r2 > 0) goto L_0x0259
                    goto L_0x025a
                L_0x0259:
                    r9 = 0
                L_0x025a:
                    qx0.C22136a.f62621d = r9     // Catch:{ all -> 0x02d6 }
                    java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x02d6 }
                    r2.<init>()     // Catch:{ all -> 0x02d6 }
                    java.lang.String r3 = "onDataChange allMsgEnd="
                    r2.append(r3)     // Catch:{ all -> 0x02d6 }
                    boolean r3 = qx0.C22136a.f62621d     // Catch:{ all -> 0x02d6 }
                    r2.append(r3)     // Catch:{ all -> 0x02d6 }
                    java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x02d6 }
                    com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r2)     // Catch:{ all -> 0x02d6 }
                L_0x0272:
                    java.lang.Long r2 = com.tencent.p014mm.plugin.brandservice.p028ui.timeline.C18508z2.f51424Y     // Catch:{ all -> 0x02d6 }
                    if (r2 == 0) goto L_0x02be
                    com.tencent.mm.storage.p0 r2 = rb0.C48009v0.Jx0()     // Catch:{ all -> 0x02d6 }
                    java.lang.Long r3 = com.tencent.p014mm.plugin.brandservice.p028ui.timeline.C18508z2.f51424Y     // Catch:{ all -> 0x02d6 }
                    gy3.C87412m.m108591d(r3)     // Catch:{ all -> 0x02d6 }
                    long r3 = r3.longValue()     // Catch:{ all -> 0x02d6 }
                    java.lang.String r8 = "orderFlag"
                    com.tencent.mm.storage.o0 r2 = r2.mo25789SE(r3, r8)     // Catch:{ all -> 0x02d6 }
                    if (r2 != 0) goto L_0x02be
                    java.util.List<com.tencent.mm.storage.o0> r2 = r0.f51439g     // Catch:{ all -> 0x02d6 }
                    java.util.LinkedList r2 = (java.util.LinkedList) r2     // Catch:{ all -> 0x02d6 }
                    int r2 = r2.size()     // Catch:{ all -> 0x02d6 }
                    r4 = 0
                L_0x0295:
                    if (r4 >= r2) goto L_0x02be
                    java.util.List<com.tencent.mm.storage.o0> r3 = r0.f51439g     // Catch:{ all -> 0x02d6 }
                    java.util.LinkedList r3 = (java.util.LinkedList) r3     // Catch:{ all -> 0x02d6 }
                    java.lang.Object r3 = r3.get(r4)     // Catch:{ all -> 0x02d6 }
                    com.tencent.mm.storage.o0 r3 = (com.tencent.p014mm.storage.C19623o0) r3     // Catch:{ all -> 0x02d6 }
                    long r8 = r3.field_orderFlag     // Catch:{ all -> 0x02d6 }
                    java.lang.Long r10 = com.tencent.p014mm.plugin.brandservice.p028ui.timeline.C18508z2.f51424Y     // Catch:{ all -> 0x02d6 }
                    gy3.C87412m.m108591d(r10)     // Catch:{ all -> 0x02d6 }
                    long r10 = r10.longValue()     // Catch:{ all -> 0x02d6 }
                    int r12 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
                    if (r12 >= 0) goto L_0x02b9
                    long r2 = r3.field_orderFlag     // Catch:{ all -> 0x02d6 }
                    java.lang.Long r2 = java.lang.Long.valueOf(r2)     // Catch:{ all -> 0x02d6 }
                    com.tencent.p014mm.plugin.brandservice.p028ui.timeline.C18508z2.f51424Y = r2     // Catch:{ all -> 0x02d6 }
                    goto L_0x02be
                L_0x02b9:
                    int r4 = r4 + 1
                    goto L_0x0295
                L_0x02bc:
                    r2 = 0
                    goto L_0x02d8
                L_0x02be:
                    r4 = 0
                L_0x02bf:
                    com.tencent.mm.plugin.brandservice.ui.timeline.BizTimeLineUI r2 = r0.f51436d     // Catch:{ all -> 0x02d6 }
                    r2.mo22785M7()     // Catch:{ all -> 0x02d6 }
                    r0.notifyDataSetChanged()     // Catch:{ all -> 0x02d6 }
                    r2 = 0
                    r5.setBlockLayoutChildren(r2)
                    if (r4 <= 0) goto L_0x02d5
                    if (r6 != 0) goto L_0x02d1
                    r4 = 0
                    goto L_0x02d2
                L_0x02d1:
                    int r4 = r4 + r6
                L_0x02d2:
                    com.tencent.p014mm.pluginsdk.p133ui.tools.C72924q1.m85521b(r5, r4, r7, r2, r2)
                L_0x02d5:
                    return r2
                L_0x02d6:
                    r0 = move-exception
                    goto L_0x02bc
                L_0x02d8:
                    r5.setBlockLayoutChildren(r2)
                    throw r0
                L_0x02dc:
                    return r2
                */
                throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.brandservice.p028ui.timeline.C18508z2.C18519k.C18520a.queueIdle():boolean");
            }
        }

        public C18519k(C18508z2 z2Var) {
            this.f51471a = z2Var;
        }

        /* renamed from: p */
        public final void mo21358p(Object obj, p0$$f p0__f) {
            if (p0__f == null || !p0__f.f55566e) {
                Looper.myQueue().addIdleHandler(new C18520a(this.f51471a, obj, p0__f));
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.z2$l */
    public static final class C18521l implements View.OnLongClickListener {

        /* renamed from: d */
        public final /* synthetic */ C18508z2 f51475d;

        /* renamed from: e */
        public final /* synthetic */ C19623o0 f51476e;

        /* renamed from: f */
        public final /* synthetic */ C77630j f51477f;

        /* renamed from: g */
        public final /* synthetic */ int f51478g;

        public C18521l(C18508z2 z2Var, C19623o0 o0Var, C77630j jVar, int i) {
            this.f51475d = z2Var;
            this.f51476e = o0Var;
            this.f51477f = jVar;
            this.f51478g = i;
        }

        public final boolean onLongClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/brandservice/ui/timeline/BizTimeLineAdapter$setCommonAction$1", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
            C22260f fVar = this.f51475d.f51436d.f50233d;
            C87412m.m108593f(view, LocaleUtil.ITALIAN);
            fVar.mo35421d(view, this.f51476e, this.f51477f, this.f51478g, true);
            C117292a.m165362h(true, this, "com/tencent/mm/plugin/brandservice/ui/timeline/BizTimeLineAdapter$setCommonAction$1", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.z2$m */
    public static final class C18522m implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ int f51479d;

        /* renamed from: e */
        public final /* synthetic */ C77630j f51480e;

        /* renamed from: f */
        public final /* synthetic */ C18508z2 f51481f;

        /* renamed from: g */
        public final /* synthetic */ C19623o0 f51482g;

        public C18522m(int i, C77630j jVar, C18508z2 z2Var, C19623o0 o0Var) {
            this.f51479d = i;
            this.f51480e = jVar;
            this.f51481f = z2Var;
            this.f51482g = o0Var;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/brandservice/ui/timeline/BizTimeLineAdapter$setCommonAction$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            int currentTimeMillis = (int) (System.currentTimeMillis() / ((long) 1000));
            Map<String, String> decode = !Util.isNullOrNil(this.f51480e.f226321M) ? SemiXml.decode(this.f51480e.f226321M) : null;
            if (decode != null) {
                int i = this.f51479d;
                String valueOf = i == 0 ? "" : String.valueOf(i);
                if (((C60193p4) C86312j.m106911c(C60193p4.class)).mo78731f7(this.f51481f.f51436d, ".msg.appmsg.mmreader.category.item" + valueOf, decode, ((C60200t1) C86312j.m106911c(C60200t1.class)).mo76842e7(26, 2, 25, (Intent) null))) {
                    Log.m105924i("MicroMsg.BizTimeLineAdapter", "biz enter finder logic");
                    ((C18511c) this.f51481f.f51433F).mo23171a(this.f51482g, this.f51480e.f226326e, this.f51479d, currentTimeMillis);
                    C117292a.m165361g(this, "com/tencent/mm/plugin/brandservice/ui/timeline/BizTimeLineAdapter$setCommonAction$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                    return;
                }
            }
            Bundle bundle = new Bundle();
            int i2 = 90;
            C72996z1 z1Var = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().get(this.f51482g.field_talker);
            if (z1Var != null && !z1Var.mo62927s3()) {
                i2 = 157;
            }
            bundle.putInt("biz_video_scene", i2);
            bundle.putInt(C74928u.C74929b.f220309a, this.f51481f.f51436d.getIntent().getIntExtra("KOpenArticleSceneFromScene", 10000));
            bundle.putInt("geta8key_scene", 56);
            bundle.putString("webpageTitle", this.f51480e.f226325d);
            C39750a.f106644a.mo62388d(this.f51480e.f226315G);
            BizTimeLineUI bizTimeLineUI = this.f51481f.f51436d;
            C19623o0 o0Var = this.f51482g;
            C75308c.m90328a(bizTimeLineUI, o0Var.field_msgId, o0Var.field_msgSvrId, this.f51479d, bundle);
            ((C18511c) this.f51481f.f51433F).mo23171a(this.f51482g, this.f51480e.f226326e, this.f51479d, currentTimeMillis);
            C117292a.m165361g(this, "com/tencent/mm/plugin/brandservice/ui/timeline/BizTimeLineAdapter$setCommonAction$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.z2$n */
    public static final class C18523n implements C11182m0 {

        /* renamed from: d */
        public final /* synthetic */ C18508z2 f51483d;

        public C18523n(C18508z2 z2Var) {
            this.f51483d = z2Var;
        }

        public final void onCreateMMMenu(C76874e0 e0Var) {
            C44668u3 Ni = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni();
            C19623o0 o0Var = this.f51483d.f51442j;
            C87412m.m108591d(o0Var);
            C72996z1 z1Var = Ni.get(o0Var.field_talker);
            e0Var.mo107125a(10, C0966R.string.aog);
            if (z1Var != null && z1Var.mo62927s3()) {
                e0Var.mo107140d(2, this.f51483d.f51436d.getResources().getColor(C0966R.color.f2966ao), this.f51483d.f51436d.getString(C0966R.string.glz));
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.z2$o */
    public static final class C18524o<_Ret, _Var> implements C87581a {

        /* renamed from: a */
        public final /* synthetic */ long f51484a;

        public C18524o(long j) {
            this.f51484a = j;
        }

        public Object call(Object obj) {
            Long l = (Long) obj;
            return Boolean.valueOf(C19636w0.m21174p(this.f51484a));
        }
    }

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.z2$p */
    public static final class C18525p<_Ret, _Var> implements C87581a {

        /* renamed from: a */
        public final /* synthetic */ C18508z2 f51485a;

        public C18525p(C18508z2 z2Var) {
            this.f51485a = z2Var;
        }

        public Object call(Object obj) {
            Boolean bool = (Boolean) obj;
            C87412m.m108593f(bool, "aBoolean");
            if (!bool.booleanValue()) {
                return null;
            }
            this.f51485a.f51436d.mo22782J7();
            return null;
        }
    }

    public C18508z2(BizTimeLineUI bizTimeLineUI, List<? extends C19623o0> list, boolean z, boolean z2, C18412m3 m3Var, BizTimeLineHotView bizTimeLineHotView) {
        C19623o0 p;
        ArrayList arrayList;
        boolean z3;
        C87412m.m108594g(bizTimeLineUI, "mContext");
        C87412m.m108594g(list, "list");
        C87412m.m108594g(m3Var, "report");
        C87412m.m108594g(bizTimeLineHotView, "bizTimeLineHotView");
        this.f51436d = bizTimeLineUI;
        this.f51437e = list;
        this.f51438f = z2;
        C19623o0 o0Var = new C19623o0();
        boolean z4 = true;
        o0Var.f55529n1 = 1;
        this.f51441i = o0Var;
        this.f51443n = m3Var;
        this.f51448s = -1;
        this.f51450u = new HashSet();
        this.f51451v = new HashSet();
        this.f51453x = new C21908c();
        this.f51431D = new C18519k(this);
        this.f51432E = new C18510b(this, m3Var);
        this.f51433F = new C18511c(m3Var, bizTimeLineHotView, this);
        this.f51435H = true;
        int i = 0;
        f51426p0 = false;
        f51427x0 = false;
        if (C19636w0.m21171m()) {
            f51411K = 0;
            if (!z2) {
                f51410J = false;
                C22136a.f62619b = true;
                int i2 = 10;
                C22136a.f62620c = list.size() < 10;
                int NQ = C48009v0.Jx0().mo25786NQ();
                if (list.size() == NQ) {
                    int g = C20583z.f57949a.mo32233g();
                    if (NQ <= (g <= 10 ? g : i2)) {
                        z3 = true;
                        C22136a.f62621d = z3;
                        Log.m105924i("MicroMsg.BizTimeLineAdapter", "initRecommendFeeds firstGroupEnd=" + C22136a.f62620c + ", allMsgEnd=" + C22136a.f62621d);
                    }
                }
                z3 = false;
                C22136a.f62621d = z3;
                Log.m105924i("MicroMsg.BizTimeLineAdapter", "initRecommendFeeds firstGroupEnd=" + C22136a.f62620c + ", allMsgEnd=" + C22136a.f62621d);
            } else {
                List<C19623o0> list2 = C20583z.f57953e;
                if (!(list2 == null || list2.isEmpty())) {
                    this.f51440h = list2;
                }
            }
            this.f51428A = false;
            C64546m72 b = C20583z.f57949a.mo32229b();
            if (b != null) {
                LinkedList<C22508lo3> linkedList = b.f184214d;
                if (linkedList != null) {
                    arrayList = new ArrayList();
                    for (T next : linkedList) {
                        C22508lo3 lo32 = (C22508lo3) next;
                        C87412m.m108593f(lo32, "card");
                        if (C19613h1.m21044q(lo32)) {
                            arrayList.add(next);
                        }
                    }
                } else {
                    arrayList = null;
                }
                if (!(arrayList == null || arrayList.isEmpty())) {
                    mo23150i(arrayList);
                    Log.m105924i("MicroMsg.BizTimeLineAdapter", "initRecommendFeeds use save data");
                } else {
                    C22136a.f62619b = false;
                    this.f51428A = true;
                }
            }
        }
        mo23139b(this.f51437e);
        this.f51444o = bizTimeLineHotView;
        f51416Q = this.f51436d.getResources().getDimensionPixelSize(C0966R.dimen.f4161um);
        f51417R = this.f51436d.getResources().getDimensionPixelSize(C0966R.dimen.f4158uh);
        f51418S = this.f51436d.getResources().getDimensionPixelSize(C0966R.dimen.f3895i6);
        this.f51436d.getResources().getDimensionPixelSize(C0966R.dimen.f3913iq);
        f51420U = this.f51436d.getResources().getDimensionPixelSize(C0966R.dimen.f4165ur);
        f51421V = this.f51436d.getResources().getDimensionPixelOffset(C0966R.dimen.f3895i6);
        f51419T = this.f51436d.getResources().getDimensionPixelOffset(C0966R.dimen.f3926j6);
        f51422W = C76577a.m92151b(this.f51436d, 2);
        C76577a.m92151b(this.f51436d, 40);
        f51423X = C76577a.m92151b(this.f51436d, 8);
        C74783i3.C6978a a = C74783i3.m89537a(this.f51436d);
        int i3 = a.f24704a;
        int i4 = a.f24705b;
        int i5 = i3 < i4 ? i3 : i4;
        float f = (float) 16;
        int g2 = i5 - ((int) (C76577a.m92156g(this.f51436d) * f));
        int g3 = i5 - ((int) ((C76577a.m92156g(this.f51436d) * f) * ((float) 2)));
        Log.m105925i("MicroMsg.BizTimeLineAdapter", "screen width = %d, screen height = %d, cover width = %d, cover width for feed = %d", Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(g2), Integer.valueOf(g3));
        float f2 = (float) g2;
        f51412L = (int) (f2 / 2.35f);
        float f3 = (float) g3;
        f51413M = (int) (f3 / 2.35f);
        f51414N = (int) (f2 / 1.7777778f);
        f51415P = (int) (f3 / 1.7777778f);
        C48009v0.Jx0().f55551e.add(this.f51431D, Looper.getMainLooper());
        mo23155n(this.f51437e);
        mo23138E(this.f51437e);
        this.f51449t = z;
        C19623o0 p2 = mo23159p();
        if (p2 != null) {
            f51425Z = Long.valueOf(p2.mo25767q2());
        }
        f51424Y = null;
        if (!f51409I.mo23169c() && this.f51449t && (p = mo23159p()) != null) {
            if (!(p.mo25767q2() == 1)) {
                Iterator<C19623o0> it = this.f51439g.iterator();
                long j = -1;
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    C19623o0 next2 = it.next();
                    if (j != -1 && j != next2.mo25767q2()) {
                        f51424Y = Long.valueOf(next2.field_orderFlag);
                        break;
                    }
                    j = next2.mo25767q2();
                }
            }
        }
        this.f51445p = new C18479j(this.f51436d, this.f51439g, this.f51440h);
        this.f51446q = new C18372v3(this, this.f51436d);
        C18355t.f50835a = ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_open_timeline_reccard_follow, 1) != 1 ? false : z4;
        C19623o0 p3 = mo23159p();
        if (p3 != null) {
            long q2 = p3.mo25767q2();
            C19625p0 Jx0 = C48009v0.Jx0();
            Jx0.getClass();
            Cursor rawQuery = Jx0.f55550d.rawQuery("SELECT count(*) FROM BizTimeLineInfo where orderFlag >= " + (q2 << 32), (String[]) null);
            i = rawQuery.moveToFirst() ? rawQuery.getInt(0) : i;
            rawQuery.close();
        }
        this.f51430C = Math.min(i, C20583z.f57949a.mo32233g());
        Log.m105924i("MicroMsg.BizTimeLineAdapter", "topLineItemCount = " + this.f51430C);
    }

    /* renamed from: a */
    public static final void m19167a(C18508z2 z2Var) {
        List<C19623o0> list = z2Var.f51440h;
        if (list == null || list.isEmpty()) {
            Log.m105928w("MicroMsg.BizTimeLineAdapter", "onGetRecommendFeedFail mRecList is empty");
            C22136a.f62619b = false;
        } else if (C22136a.f62620c && C22136a.f62619b) {
            z2Var.mo23165v();
        }
        z2Var.notifyDataSetChanged();
    }

    /* renamed from: A */
    public final void mo23134A() {
        C77407n nVar = new C77407n((Context) this.f51436d, 1, false);
        nVar.f225771i = new C18523n(this);
        nVar.f225782p = this.f51446q;
        nVar.mo107573q();
    }

    /* renamed from: B */
    public final void mo23135B() {
        C22136a.f62619b = false;
        int size = ((LinkedList) this.f51439g).size();
        if (!mo23164u()) {
            mo23165v();
        } else if (((LinkedList) this.f51439g).size() > size) {
            if (size > 0) {
                f51424Y = Long.valueOf(((C19623o0) ((LinkedList) this.f51439g).get(size)).field_orderFlag);
            }
            mo23166w();
        }
    }

    /* renamed from: C */
    public final void mo23136C(C19623o0 o0Var) {
        if (o0Var == null) {
            Log.m105928w("MicroMsg.BizTimeLineAdapter", "updateGroupId info is null");
            return;
        }
        long q2 = o0Var.mo25767q2();
        long TO = C48009v0.Jx0().mo25791TO();
        Log.m105919d("MicroMsg.BizTimeLineAdapter", "updateGroupId keep %b, groupId %d, maxGroupId %d", Boolean.valueOf(this.f51449t), Long.valueOf(q2), Long.valueOf(TO));
        if (!this.f51449t && q2 == TO) {
            long j = o0Var.field_orderFlag;
            C89060f.m111323b(Long.valueOf(j)).mo123064p(new C18524o(j)).mo123062e(new C18525p(this));
        }
    }

    /* renamed from: D */
    public final void mo23137D(List<? extends C19623o0> list) {
        if (!Util.isNullOrNil((List) list) && !Util.isNullOrNil((List) this.f51439g)) {
            for (C19623o0 o0Var : list) {
                Iterator<C19623o0> it = this.f51439g.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    C19623o0 next = it.next();
                    C87412m.m108591d(o0Var);
                    if (o0Var.field_msgId == next.field_msgId) {
                        if (next.mo25758F2()) {
                            next.mo25762J2(o0Var.mo25774x2());
                        }
                        if (next.mo25753A2()) {
                            next.field_content = o0Var.field_content;
                            next.f55534s1 = null;
                            next.f55535t1 = "";
                            next.mo25761I2();
                        }
                    }
                }
            }
        }
    }

    /* renamed from: E */
    public final void mo23138E(List<? extends C19623o0> list) {
        int i;
        List<? extends C19623o0> list2 = list;
        if (C118762j.f355306a.mo183489b(1) && !list.isEmpty()) {
            Log.m105919d("MicroMsg.BizTimeLineAdapter", "alvinluo doUpdateListCellPosition list: %d", Integer.valueOf(list.size()));
            long currentTimeMillis = System.currentTimeMillis();
            C19623o0 o0Var = (C19623o0) list2.get(0);
            o0Var.f55523h1 = 1;
            int size = list.size();
            int i2 = 1;
            int i3 = 1;
            while (i2 < size) {
                C19623o0 o0Var2 = (C19623o0) list2.get(i2);
                int i4 = o0Var.field_type;
                if (i4 == 1 || i4 != 285212721) {
                    i = 1;
                } else {
                    i = ((C76073b) C86312j.m106911c(C76073b.class)).mo94595II(o0Var.field_msgId, o0Var.field_content);
                    if (!o0Var.field_isExpand) {
                        i = Math.min(i, 2);
                    }
                }
                i3 += i;
                o0Var2.f55523h1 = i3;
                i2++;
                o0Var = o0Var2;
            }
            Log.m105919d("MicroMsg.BizTimeLineAdapter", "alvinluo doUpdateListCellPosition cost: %d, startCellPosition: %d, size: %d", Long.valueOf(System.currentTimeMillis() - currentTimeMillis), 1, Integer.valueOf(list.size()));
        }
    }

    /* renamed from: b */
    public final void mo23139b(List<? extends C19623o0> list) {
        boolean z = false;
        if (!(list == null || list.isEmpty())) {
            return;
        }
        if (!f51409I.mo23169c()) {
            mo23165v();
        } else if (C22136a.f62621d) {
            List<C19623o0> list2 = this.f51440h;
            if (list2 == null || list2.isEmpty()) {
                z = true;
            }
            if (z && !f51426p0 && !f51427x0) {
                mo23165v();
            }
        }
    }

    /* renamed from: d */
    public final void mo23140d(int i, int i2) {
        ArrayList arrayList = new ArrayList();
        if (i <= i2) {
            while (true) {
                C19623o0 q = getItem(i);
                if (q != null && q.field_type == 285212721) {
                    Log.m105926v("MicroMsg.BizTimeLineAdapter", "terry checkpreload:" + q.field_msgId);
                    String[] strArr = new String[3];
                    strArr[0] = String.valueOf(q.field_msgId);
                    String str = q.field_content;
                    C87412m.m108593f(str, "info.field_content");
                    strArr[1] = str;
                    strArr[2] = q.field_isExpand ? "-1" : "2";
                    arrayList.add(strArr);
                }
                if (i == i2) {
                    break;
                }
                i++;
            }
        }
        if (arrayList.size() > 0) {
            ((C45696d) C86709a0.m107533q(C45696d.class)).n90(arrayList, 90);
        }
    }

    /* renamed from: f */
    public final void mo23141f(C19623o0 o0Var, int i) {
        this.f51443n.mo22975b(o0Var, i, (int) (System.currentTimeMillis() / ((long) 1000)));
    }

    /* renamed from: g */
    public final void mo23142g(C19623o0 o0Var) {
        C64546m72 b;
        C87412m.m108594g(o0Var, "info");
        this.f51440h.remove(o0Var);
        List<C19623o0> list = this.f51440h;
        if (list == null || list.isEmpty()) {
            Log.m105928w("MicroMsg.BizTimeLineAdapter", "onFeedBack mRecList is empty");
            mo23135B();
        }
        notifyDataSetChanged();
        C20583z.C20584b bVar = C20583z.f57949a;
        if (o0Var.f55539x1 != null && (b = bVar.mo32229b()) != null) {
            LinkedList<C22508lo3> linkedList = b.f184214d;
            C87412m.m108593f(linkedList, "it.RecommendCard");
            C22508lo3 lo32 = null;
            for (C22508lo3 lo33 : linkedList) {
                String str = lo33.f64175h;
                C22508lo3 lo34 = o0Var.f55539x1;
                if (C87412m.m108589b(str, lo34 != null ? lo34.f64175h : null)) {
                    Log.m105924i("Micromsg.BizTLRecFeedsDataUtil", "onRemove first screen data");
                    lo32 = lo33;
                }
            }
            if (lo32 != null) {
                b.f184214d.remove(lo32);
                C20583z.f57949a.mo32234h(b);
            }
        }
    }

    public int getCount() {
        return (!f51409I.mo23169c() || !C22136a.f62620c) ? ((LinkedList) this.f51439g).size() : ((LinkedList) this.f51439g).size() + this.f51440h.size() + 1;
    }

    public long getItemId(int i) {
        return 0;
    }

    public int getItemViewType(int i) {
        C19623o0 q = getItem(i);
        if (q == null) {
            Log.m105920e("MicroMsg.BizTimeLineAdapter", "getItemViewType info is null");
            return 0;
        }
        int i2 = q.field_type;
        boolean z = true;
        if (i2 == 1) {
            return 2;
        }
        if (i2 == 285212721) {
            return 1;
        }
        if (i2 == 620757041) {
            return 3;
        }
        if (i2 == 637534257) {
            return 4;
        }
        if (q.f55529n1 != 1) {
            z = false;
        }
        if (z) {
            return 5;
        }
        return q.mo25759G2() ? 6 : 0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:118:0x04f8  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x05cb A[LOOP:2: B:123:0x05c1->B:125:0x05cb, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x0620  */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x069f  */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x06ac  */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x06d8  */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x06eb  */
    /* JADX WARNING: Removed duplicated region for block: B:179:0x07fb  */
    /* JADX WARNING: Removed duplicated region for block: B:180:0x080b  */
    /* JADX WARNING: Removed duplicated region for block: B:262:0x0b75  */
    /* JADX WARNING: Removed duplicated region for block: B:265:0x0b8b  */
    /* JADX WARNING: Removed duplicated region for block: B:269:0x0be6  */
    /* JADX WARNING: Removed duplicated region for block: B:270:0x0be9  */
    /* JADX WARNING: Removed duplicated region for block: B:275:0x0c0a  */
    /* JADX WARNING: Removed duplicated region for block: B:276:0x0c13  */
    /* JADX WARNING: Removed duplicated region for block: B:279:0x0c1f  */
    /* JADX WARNING: Removed duplicated region for block: B:353:0x0c26 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View getView(int r55, android.view.View r56, android.view.ViewGroup r57) {
        /*
            r54 = this;
            r0 = r54
            r9 = r55
            r1 = r56
            r2 = r57
            java.lang.String r3 = "parent"
            gy3.C87412m.m108594g(r2, r3)
            com.tencent.mm.storage.o0 r8 = r54.getItem(r55)
            if (r8 != 0) goto L_0x001c
            android.view.View r1 = new android.view.View
            com.tencent.mm.plugin.brandservice.ui.timeline.BizTimeLineUI r2 = r0.f51436d
            r1.<init>(r2)
            return r1
        L_0x001c:
            r54.mo23163t(r55)
            int r3 = r8.field_type
            java.lang.String r15 = ""
            r14 = 0
            r13 = 8
            r12 = 1
            r11 = 0
            if (r3 == r12) goto L_0x0c51
            r4 = 285212721(0x11000031, float:1.0097479E-28)
            r10 = 2
            r7 = 3
            r6 = 5
            if (r3 == r4) goto L_0x03bb
            r4 = 620757041(0x25000031, float:1.1102295E-16)
            if (r3 == r4) goto L_0x03b0
            r4 = 637534257(0x26000031, float:4.440918E-16)
            if (r3 == r4) goto L_0x027f
            int r3 = r8.f55529n1
            if (r3 != r12) goto L_0x0042
            r3 = 1
            goto L_0x0043
        L_0x0042:
            r3 = 0
        L_0x0043:
            if (r3 == 0) goto L_0x022a
            f51410J = r12
            if (r1 != 0) goto L_0x00d4
            com.tencent.mm.plugin.brandservice.ui.timeline.item.w3 r1 = new com.tencent.mm.plugin.brandservice.ui.timeline.item.w3
            r1.<init>()
            com.tencent.mm.plugin.brandservice.ui.timeline.BizTimeLineUI r2 = r0.f51436d
            android.view.View r3 = r1.f50924i
            if (r3 == 0) goto L_0x0056
            r2 = r3
            goto L_0x00cb
        L_0x0056:
            r3 = 2131493330(0x7f0c01d2, float:1.8610137E38)
            android.view.View r2 = android.view.View.inflate(r2, r3, r14)
            r1.f50924i = r2
            r3 = 2131298051(0x7f090703, float:1.8214064E38)
            android.view.View r2 = r2.findViewById(r3)
            android.widget.LinearLayout r2 = (android.widget.LinearLayout) r2
            r1.f50918c = r2
            android.view.View r2 = r1.f50924i
            r3 = 2131298122(0x7f09074a, float:1.8214208E38)
            android.view.View r2 = r2.findViewById(r3)
            android.widget.LinearLayout r2 = (android.widget.LinearLayout) r2
            r1.f50919d = r2
            android.view.View r2 = r1.f50924i
            r3 = 2131298123(0x7f09074b, float:1.821421E38)
            android.view.View r2 = r2.findViewById(r3)
            android.widget.TextView r2 = (android.widget.TextView) r2
            r1.f50920e = r2
            android.view.View r2 = r1.f50924i
            r3 = 2131298112(0x7f090740, float:1.8214188E38)
            android.view.View r2 = r2.findViewById(r3)
            android.widget.LinearLayout r2 = (android.widget.LinearLayout) r2
            r1.f50921f = r2
            android.view.View r2 = r1.f50924i
            r3 = 2131298113(0x7f090741, float:1.821419E38)
            android.view.View r2 = r2.findViewById(r3)
            android.widget.TextView r2 = (android.widget.TextView) r2
            r1.f50922g = r2
            android.view.View r2 = r1.f50924i
            r3 = 2131298120(0x7f090748, float:1.8214204E38)
            android.view.View r2 = r2.findViewById(r3)
            android.widget.ProgressBar r2 = (android.widget.ProgressBar) r2
            r1.f50923h = r2
            android.view.View r2 = r1.f50924i
            r3 = 2131298121(0x7f090749, float:1.8214206E38)
            android.view.View r2 = r2.findViewById(r3)
            android.widget.TextView r2 = (android.widget.TextView) r2
            fy0.i r2 = fy0.C8219i.f27144a
            android.widget.TextView r3 = r1.f50920e
            r2.mo9271b(r3)
            android.widget.LinearLayout r2 = r1.f50919d
            r3 = 1056964608(0x3f000000, float:0.5)
            com.tencent.p014mm.p136ui.tools.C7007c1.m7257b(r2, r3)
            android.widget.LinearLayout r2 = r1.f50918c
            com.tencent.p014mm.p136ui.tools.C7007c1.m7257b(r2, r3)
            android.view.View r2 = r1.f50924i
        L_0x00cb:
            r2.setTag(r1)
            r53 = r2
            r2 = r1
            r1 = r53
            goto L_0x00df
        L_0x00d4:
            java.lang.Object r2 = r56.getTag()
            java.lang.String r3 = "null cannot be cast to non-null type com.tencent.mm.plugin.brandservice.ui.timeline.item.BizTimeLineNewMsgLineItem"
            gy3.C87412m.m108592e(r2, r3)
            com.tencent.mm.plugin.brandservice.ui.timeline.item.w3 r2 = (com.tencent.p014mm.plugin.brandservice.p028ui.timeline.item.C18378w3) r2
        L_0x00df:
            boolean r3 = f51427x0
            if (r3 == 0) goto L_0x00e9
            android.widget.ProgressBar r3 = r2.f50923h
            r3.setVisibility(r11)
            goto L_0x00ee
        L_0x00e9:
            android.widget.ProgressBar r3 = r2.f50923h
            r3.setVisibility(r13)
        L_0x00ee:
            eb0.z$b r3 = eb0.C20583z.f57949a
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r3 = r3.mo32230c()
            java.lang.String r4 = "RecommendFeedsWording"
            java.lang.String r3 = r3.decodeString(r4, r15)
            if (r3 == 0) goto L_0x010a
            boolean r4 = z04.C112551y.m153811k(r3)
            if (r4 != 0) goto L_0x010a
            android.widget.TextView r4 = r2.f50920e
            if (r4 != 0) goto L_0x0107
            goto L_0x010a
        L_0x0107:
            r4.setText(r3)
        L_0x010a:
            boolean r3 = qx0.C22136a.f62621d
            java.lang.String r4 = "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams"
            if (r3 == 0) goto L_0x0178
            android.widget.LinearLayout r3 = r2.f50918c
            r3.setVisibility(r13)
            android.widget.LinearLayout r3 = r2.f50921f
            r3.setVisibility(r11)
            android.widget.LinearLayout r3 = r2.f50921f
            android.view.ViewGroup$LayoutParams r5 = r3.getLayoutParams()
            gy3.C87412m.m108592e(r5, r4)
            android.widget.LinearLayout$LayoutParams r5 = (android.widget.LinearLayout.LayoutParams) r5
            int r4 = f51423X
            int r4 = r4 * 5
            r5.topMargin = r4
            r5.bottomMargin = r4
            r3.setLayoutParams(r5)
            java.util.List<com.tencent.mm.storage.o0> r3 = r0.f51439g
            if (r3 == 0) goto L_0x013d
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L_0x013b
            goto L_0x013d
        L_0x013b:
            r3 = 0
            goto L_0x013e
        L_0x013d:
            r3 = 1
        L_0x013e:
            if (r3 == 0) goto L_0x015c
            android.widget.TextView r3 = r2.f50922g
            com.tencent.mm.plugin.brandservice.ui.timeline.BizTimeLineUI r4 = r0.f51436d
            r5 = 2131822683(0x7f11085b, float:1.9278144E38)
            java.lang.String r4 = r4.getString(r5)
            r3.setText(r4)
            r18 = 12
            com.tencent.mm.plugin.report.service.n r15 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r16 = 1590(0x636, double:7.856E-321)
            r20 = 1
            r22 = 0
            r15.idkeyStat(r16, r18, r20, r22)
            goto L_0x01c3
        L_0x015c:
            android.widget.TextView r3 = r2.f50922g
            com.tencent.mm.plugin.brandservice.ui.timeline.BizTimeLineUI r4 = r0.f51436d
            r5 = 2131822681(0x7f110859, float:1.927814E38)
            java.lang.String r4 = r4.getString(r5)
            r3.setText(r4)
            r18 = 13
            com.tencent.mm.plugin.report.service.n r15 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r16 = 1590(0x636, double:7.856E-321)
            r20 = 1
            r22 = 0
            r15.idkeyStat(r16, r18, r20, r22)
            goto L_0x01c3
        L_0x0178:
            android.widget.LinearLayout r3 = r2.f50918c
            r3.setVisibility(r11)
            java.util.List<com.tencent.mm.storage.o0> r3 = r0.f51439g
            java.util.LinkedList r3 = (java.util.LinkedList) r3
            int r3 = r3.size()
            if (r3 != 0) goto L_0x01be
            android.widget.LinearLayout r3 = r2.f50921f
            android.view.ViewGroup$LayoutParams r5 = r3.getLayoutParams()
            gy3.C87412m.m108592e(r5, r4)
            android.widget.LinearLayout$LayoutParams r5 = (android.widget.LinearLayout.LayoutParams) r5
            int r4 = f51423X
            int r6 = r4 * 8
            r5.topMargin = r6
            r5.bottomMargin = r4
            r3.setLayoutParams(r5)
            android.widget.LinearLayout r3 = r2.f50921f
            r3.setVisibility(r11)
            android.widget.TextView r3 = r2.f50922g
            com.tencent.mm.plugin.brandservice.ui.timeline.BizTimeLineUI r4 = r0.f51436d
            r5 = 2131822682(0x7f11085a, float:1.9278142E38)
            java.lang.String r4 = r4.getString(r5)
            r3.setText(r4)
            r18 = 14
            com.tencent.mm.plugin.report.service.n r15 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r16 = 1590(0x636, double:7.856E-321)
            r20 = 1
            r22 = 0
            r15.idkeyStat(r16, r18, r20, r22)
            goto L_0x01c3
        L_0x01be:
            android.widget.LinearLayout r3 = r2.f50921f
            r3.setVisibility(r13)
        L_0x01c3:
            r18 = 10
            com.tencent.mm.plugin.report.service.n r3 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r16 = 1590(0x636, double:7.856E-321)
            r20 = 1
            r22 = 0
            r15 = r3
            r15.idkeyStat(r16, r18, r20, r22)
            int r4 = com.tencent.p014mm.storage.C19636w0.f55626c
            java.lang.String r4 = java.lang.String.valueOf(r4)
            r5 = 22101(0x5655, float:3.097E-41)
            java.lang.Object[] r6 = new java.lang.Object[r7]
            r6[r11] = r4
            java.lang.Integer r4 = java.lang.Integer.valueOf(r11)
            r6[r12] = r4
            java.lang.Integer r4 = java.lang.Integer.valueOf(r55)
            r6[r10] = r4
            r3.mo160131h(r5, r6)
            android.widget.LinearLayout r4 = r2.f50918c
            com.tencent.mm.plugin.brandservice.ui.timeline.a3 r5 = new com.tencent.mm.plugin.brandservice.ui.timeline.a3
            r5.<init>(r9, r0)
            r4.setOnClickListener(r5)
            android.widget.LinearLayout r4 = r2.f50919d
            int r5 = com.tencent.p014mm.storage.C19636w0.f55626c
            java.lang.String r5 = java.lang.String.valueOf(r5)
            r6 = 22718(0x58be, float:3.1835E-41)
            java.lang.Object[] r7 = new java.lang.Object[r7]
            java.lang.Integer r13 = java.lang.Integer.valueOf(r11)
            r7[r11] = r13
            java.lang.Integer r13 = java.lang.Integer.valueOf(r55)
            r7[r12] = r13
            r7[r10] = r5
            r3.mo160131h(r6, r7)
            r4.setVisibility(r11)
            android.widget.LinearLayout r3 = r2.f50919d
            boolean r4 = f51427x0
            r4 = r4 ^ r12
            r3.setEnabled(r4)
            android.widget.LinearLayout r3 = r2.f50919d
            com.tencent.mm.plugin.brandservice.ui.timeline.b3 r4 = new com.tencent.mm.plugin.brandservice.ui.timeline.b3
            r4.<init>(r0, r2, r9)
            r3.setOnClickListener(r4)
            goto L_0x03b4
        L_0x022a:
            boolean r3 = r8.mo25759G2()
            if (r3 == 0) goto L_0x0236
            android.view.View r1 = r0.mo23154l(r8, r9, r1, r2)
            goto L_0x03b4
        L_0x0236:
            if (r1 != 0) goto L_0x025c
            com.tencent.mm.plugin.brandservice.ui.timeline.item.k4 r1 = new com.tencent.mm.plugin.brandservice.ui.timeline.item.k4
            r1.<init>()
            com.tencent.mm.plugin.brandservice.ui.timeline.BizTimeLineUI r2 = r0.f51436d
            android.view.View r3 = r1.f50826e
            if (r3 == 0) goto L_0x0245
            r2 = r3
            goto L_0x0253
        L_0x0245:
            r3 = 2131493392(0x7f0c0210, float:1.8610263E38)
            android.view.View r2 = android.view.View.inflate(r2, r3, r14)
            r1.f50826e = r2
            r1.mo22903a()
            android.view.View r2 = r1.f50826e
        L_0x0253:
            r2.setTag(r1)
            r53 = r2
            r2 = r1
            r1 = r53
            goto L_0x0267
        L_0x025c:
            java.lang.Object r2 = r56.getTag()
            java.lang.String r3 = "null cannot be cast to non-null type com.tencent.mm.plugin.brandservice.ui.timeline.item.BizTimeLineUnknownItem"
            gy3.C87412m.m108592e(r2, r3)
            com.tencent.mm.plugin.brandservice.ui.timeline.item.k4 r2 = (com.tencent.p014mm.plugin.brandservice.p028ui.timeline.item.C18307k4) r2
        L_0x0267:
            r0.mo23162s(r2, r8)
            android.widget.LinearLayout r3 = r2.f50739n
            java.lang.String r4 = "unknownItem.topLayout"
            gy3.C87412m.m108593f(r3, r4)
            android.widget.LinearLayout r2 = r2.f50738m
            java.lang.String r4 = "unknownItem.newTipsLayout"
            gy3.C87412m.m108593f(r2, r4)
            r0.mo23152j(r9, r8, r3, r2)
            goto L_0x03b4
        L_0x027f:
            kj2.d r3 = kj2.C117407d.INSTANCE
            r16 = 1454(0x5ae, double:7.184E-321)
            r20 = 1
            r18 = 66
            r15 = r3
            r15.mo182089r(r16, r18, r20)
            com.tencent.mm.storage.t r4 = com.tencent.p014mm.storage.C19627t.f55586a
            boolean r4 = r4.mo25833g()
            if (r4 == 0) goto L_0x034e
            java.lang.String r4 = r8.mo25775y2()
            if (r4 == 0) goto L_0x02a2
            boolean r4 = z04.C112551y.m153811k(r4)
            if (r4 == 0) goto L_0x02a0
            goto L_0x02a2
        L_0x02a0:
            r4 = 0
            goto L_0x02a3
        L_0x02a2:
            r4 = 1
        L_0x02a3:
            if (r4 == 0) goto L_0x02a7
            goto L_0x034e
        L_0x02a7:
            java.lang.String r4 = r8.mo25775y2()
            boolean r5 = r8.f55525j1
            java.lang.String r6 = "viewId"
            if (r5 != 0) goto L_0x0311
            jw0.e r5 = jw0.C9533e.f29713a
            gy3.C87412m.m108593f(r4, r6)
            boolean r5 = r5.mo10213f(r4, r1)
            if (r5 != 0) goto L_0x0311
            r18 = 68
            r16 = 1454(0x5ae, double:7.184E-321)
            r20 = 1
            r15 = r3
            r15.mo182089r(r16, r18, r20)
            android.view.View r1 = new android.view.View
            com.tencent.mm.plugin.brandservice.ui.timeline.BizTimeLineUI r2 = r0.f51436d
            r1.<init>(r2)
            k20.a r2 = new k20.a
            r2.<init>()
            java.lang.ThreadLocal<k20.a> r3 = k20.C60958c.f173611a
            java.lang.Integer r3 = java.lang.Integer.valueOf(r13)
            r2.mo10233c(r3)
            java.lang.Object[] r23 = r2.mo10232b()
            java.lang.String r24 = "com/tencent/mm/plugin/brandservice/ui/timeline/BizTimeLineAdapter"
            java.lang.String r25 = "fillingCanvas"
            java.lang.String r26 = "(Lcom/tencent/mm/storage/BizTimeLineInfo;ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;"
            java.lang.String r27 = "android/view/View_EXEC_"
            java.lang.String r28 = "setVisibility"
            java.lang.String r29 = "(I)V"
            r22 = r1
            j20.C117292a.m165358d(r22, r23, r24, r25, r26, r27, r28, r29)
            java.lang.Object r2 = r2.mo10231a(r11)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r1.setVisibility(r2)
            java.lang.String r23 = "com/tencent/mm/plugin/brandservice/ui/timeline/BizTimeLineAdapter"
            java.lang.String r24 = "fillingCanvas"
            java.lang.String r25 = "(Lcom/tencent/mm/storage/BizTimeLineInfo;ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;"
            java.lang.String r26 = "android/view/View_EXEC_"
            java.lang.String r27 = "setVisibility"
            java.lang.String r28 = "(I)V"
            j20.C117292a.m165359e(r22, r23, r24, r25, r26, r27, r28)
            goto L_0x03b4
        L_0x0311:
            r8.f55525j1 = r12
            if (r1 == 0) goto L_0x032a
            java.lang.Object r5 = r56.getTag()
            boolean r5 = r5 instanceof com.tencent.p014mm.plugin.brandservice.p028ui.timeline.item.C18219c0
            if (r5 != 0) goto L_0x031e
            goto L_0x032a
        L_0x031e:
            java.lang.Object r5 = r56.getTag()
            java.lang.String r7 = "null cannot be cast to non-null type com.tencent.mm.plugin.brandservice.ui.timeline.item.BizTLRecCanvas"
            gy3.C87412m.m108592e(r5, r7)
            com.tencent.mm.plugin.brandservice.ui.timeline.item.c0 r5 = (com.tencent.p014mm.plugin.brandservice.p028ui.timeline.item.C18219c0) r5
            goto L_0x0338
        L_0x032a:
            com.tencent.mm.plugin.brandservice.ui.timeline.item.c0 r5 = new com.tencent.mm.plugin.brandservice.ui.timeline.item.c0
            com.tencent.mm.plugin.brandservice.ui.timeline.BizTimeLineUI r1 = r0.f51436d
            r5.<init>(r1, r0)
            android.view.ViewGroup r1 = r5.mo22836i()
            r1.setTag(r5)
        L_0x0338:
            r5.mo22815a(r8, r9, r1, r2)
            r18 = 67
            r16 = 1454(0x5ae, double:7.184E-321)
            r20 = 1
            r15 = r3
            r15.mo182089r(r16, r18, r20)
            jw0.e r2 = jw0.C9533e.f29713a
            gy3.C87412m.m108593f(r4, r6)
            r2.mo10212e(r4)
            goto L_0x03b4
        L_0x034e:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "hide ad "
            r1.append(r2)
            java.lang.String r2 = r8.mo25775y2()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "MicroMsg.BizTimeLineAdapter"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r1)
            android.view.View r1 = new android.view.View
            com.tencent.mm.plugin.brandservice.ui.timeline.BizTimeLineUI r2 = r0.f51436d
            r1.<init>(r2)
            k20.a r2 = new k20.a
            r2.<init>()
            java.lang.ThreadLocal<k20.a> r3 = k20.C60958c.f173611a
            java.lang.Integer r3 = java.lang.Integer.valueOf(r13)
            r2.mo10233c(r3)
            java.lang.Object[] r16 = r2.mo10232b()
            java.lang.String r17 = "com/tencent/mm/plugin/brandservice/ui/timeline/BizTimeLineAdapter"
            java.lang.String r18 = "fillingCanvas"
            java.lang.String r19 = "(Lcom/tencent/mm/storage/BizTimeLineInfo;ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;"
            java.lang.String r20 = "android/view/View_EXEC_"
            java.lang.String r21 = "setVisibility"
            java.lang.String r22 = "(I)V"
            r15 = r1
            j20.C117292a.m165358d(r15, r16, r17, r18, r19, r20, r21, r22)
            java.lang.Object r2 = r2.mo10231a(r11)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r1.setVisibility(r2)
            java.lang.String r16 = "com/tencent/mm/plugin/brandservice/ui/timeline/BizTimeLineAdapter"
            java.lang.String r17 = "fillingCanvas"
            java.lang.String r18 = "(Lcom/tencent/mm/storage/BizTimeLineInfo;ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;"
            java.lang.String r19 = "android/view/View_EXEC_"
            java.lang.String r20 = "setVisibility"
            java.lang.String r21 = "(I)V"
            j20.C117292a.m165359e(r15, r16, r17, r18, r19, r20, r21)
            goto L_0x03b4
        L_0x03b0:
            android.view.View r1 = r0.mo23153k(r8, r9, r1, r2)
        L_0x03b4:
            r2 = r0
            r10 = r8
            r4 = r9
            r6 = r14
            r5 = 0
            goto L_0x0dcd
        L_0x03bb:
            boolean r2 = r0.f51449t
            if (r2 != 0) goto L_0x03d4
            java.util.Map<java.lang.Long, java.lang.Integer> r2 = fy0.C20739g.f58625a
            boolean r2 = r8.mo25754B2()
            if (r2 != 0) goto L_0x03c8
            goto L_0x03d4
        L_0x03c8:
            fy0.d r2 = new fy0.d
            r2.<init>(r8)
            r3 = 0
            java.lang.String r5 = "BrandServiceWorkerThread"
            dx0.C31332a.m39373a(r5, r2, r3)
        L_0x03d4:
            if (r1 != 0) goto L_0x043a
            com.tencent.mm.plugin.brandservice.ui.timeline.item.t3 r1 = new com.tencent.mm.plugin.brandservice.ui.timeline.item.t3
            r1.<init>()
            com.tencent.mm.plugin.brandservice.ui.timeline.BizTimeLineUI r2 = r0.f51436d
            r3 = 2131493318(0x7f0c01c6, float:1.8610113E38)
            android.view.View r2 = android.view.View.inflate(r2, r3, r14)
            r3 = 2131298050(0x7f090702, float:1.8214062E38)
            android.view.View r3 = r2.findViewById(r3)
            java.lang.String r4 = "null cannot be cast to non-null type android.widget.LinearLayout"
            gy3.C87412m.m108592e(r3, r4)
            android.widget.LinearLayout r3 = (android.widget.LinearLayout) r3
            r1.f50847m = r3
            r3 = 2131313532(0x7f09437c, float:1.8245463E38)
            android.view.View r3 = r2.findViewById(r3)
            gy3.C87412m.m108592e(r3, r4)
            android.widget.LinearLayout r3 = (android.widget.LinearLayout) r3
            r1.f50848n = r3
            r3 = 2131313533(0x7f09437d, float:1.8245465E38)
            android.view.View r3 = r2.findViewById(r3)
            java.lang.String r5 = "null cannot be cast to non-null type android.widget.TextView"
            gy3.C87412m.m108592e(r3, r5)
            android.widget.TextView r3 = (android.widget.TextView) r3
            r1.f50849o = r3
            r3 = 2131298108(0x7f09073c, float:1.821418E38)
            android.view.View r3 = r2.findViewById(r3)
            gy3.C87412m.m108592e(r3, r4)
            android.widget.LinearLayout r3 = (android.widget.LinearLayout) r3
            r1.f50850p = r3
            r3 = 2131298095(0x7f09072f, float:1.8214153E38)
            android.view.View r3 = r2.findViewById(r3)
            gy3.C87412m.m108592e(r3, r4)
            android.widget.LinearLayout r3 = (android.widget.LinearLayout) r3
            r1.f50851q = r3
            r1.f50826e = r2
            r1.mo22903a()
            r2.setTag(r1)
            r5 = r1
            r16 = r2
            goto L_0x0448
        L_0x043a:
            java.lang.Object r2 = r56.getTag()
            java.lang.String r3 = "null cannot be cast to non-null type com.tencent.mm.plugin.brandservice.ui.timeline.item.BizTimeLineItemHolder"
            gy3.C87412m.m108592e(r2, r3)
            com.tencent.mm.plugin.brandservice.ui.timeline.item.t3 r2 = (com.tencent.p014mm.plugin.brandservice.p028ui.timeline.item.C18361t3) r2
            r16 = r1
            r5 = r2
        L_0x0448:
            com.tencent.mm.plugin.brandservice.ui.timeline.BizTimeLineUI r1 = r0.f51436d
            r5.f50824c = r1
            r5.f50825d = r0
            java.util.List<com.tencent.mm.plugin.brandservice.ui.timeline.item.q3> r1 = r5.f50852r
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            java.util.Iterator r1 = r1.iterator()
        L_0x0456:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x046f
            java.lang.Object r2 = r1.next()
            com.tencent.mm.plugin.brandservice.ui.timeline.item.q3 r2 = (com.tencent.p014mm.plugin.brandservice.p028ui.timeline.item.C18339q3) r2
            android.view.View r3 = r2.f50769m
            com.tencent.p014mm.p136ui.chatting.C74355z4.m88794b(r3, r7)
            android.widget.LinearLayout r3 = r5.f50847m
            android.view.View r2 = r2.f50769m
            r3.removeView(r2)
            goto L_0x0456
        L_0x046f:
            java.util.List<com.tencent.mm.plugin.brandservice.ui.timeline.item.q3> r1 = r5.f50852r
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            r1.clear()
            java.lang.Class<gw0.b> r1 = gw0.C76073b.class
            di3.d r1 = di3.C86312j.m106911c(r1)
            gw0.b r1 = (gw0.C76073b) r1
            long r2 = r8.field_msgId
            java.lang.String r4 = r8.field_content
            s90.f r1 = r1.mo94597JZ(r2, r4)
            r4 = r1
            s90.i r4 = (s90.C77629i) r4
            java.util.LinkedList<s90.j> r3 = r4.f226295i
            int r2 = r3.size()
            r1 = -1
            if (r2 != 0) goto L_0x049f
            android.widget.LinearLayout r2 = r5.f50847m
            r2.setVisibility(r13)
            r5.mo22926f(r5, r1, r11)
            r10 = r8
            r4 = r9
            r5 = 0
            goto L_0x0c4a
        L_0x049f:
            android.widget.LinearLayout r12 = r5.f50847m
            r12.setVisibility(r11)
            java.lang.Object r12 = r3.get(r11)
            s90.j r12 = (s90.C77630j) r12
            int r10 = r12.f226333o
            r6 = 6
            r13 = 7
            if (r10 != r6) goto L_0x04b2
            r12.f226333o = r13
        L_0x04b2:
            com.tencent.mm.plugin.brandservice.ui.timeline.z2 r10 = r5.f50825d
            com.tencent.mm.plugin.brandservice.ui.timeline.preload.j r10 = r10.f51445p
            r10.getClass()
            boolean r10 = fy0.C20734b.m22688a(r8, r12, r2)
            r6 = 10
            if (r10 == 0) goto L_0x04e0
            java.lang.String r14 = r12.f226330i
            boolean r14 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r14)
            if (r14 == 0) goto L_0x04d4
            int r14 = r12.f226333o
            if (r14 == r13) goto L_0x04d4
            if (r14 == r6) goto L_0x04d4
            r5.mo22926f(r5, r1, r2)
            r14 = 0
            goto L_0x04e4
        L_0x04d4:
            java.lang.Object r1 = r3.get(r11)
            s90.j r1 = (s90.C77630j) r1
            int r1 = r1.f226333o
            r5.mo22926f(r5, r1, r2)
            goto L_0x04e3
        L_0x04e0:
            r5.mo22926f(r5, r1, r2)
        L_0x04e3:
            r14 = r10
        L_0x04e4:
            r8.f55517b1 = r14
            android.content.Context r1 = r5.f50824c
            android.app.Activity r1 = (android.app.Activity) r1
            android.view.LayoutInflater r1 = r1.getLayoutInflater()
            java.util.List<com.tencent.mm.plugin.brandservice.ui.timeline.item.q3> r10 = r5.f50852r
            java.util.ArrayList r10 = (java.util.ArrayList) r10
            int r10 = r10.size()
        L_0x04f6:
            if (r10 >= r2) goto L_0x05c0
            android.view.View r18 = com.tencent.p014mm.p136ui.chatting.C74355z4.m88793a(r7)
            if (r18 != 0) goto L_0x0506
            r7 = 2131493319(0x7f0c01c7, float:1.8610115E38)
            r13 = 0
            android.view.View r18 = r1.inflate(r7, r13)
        L_0x0506:
            r7 = r18
            com.tencent.mm.plugin.brandservice.ui.timeline.z2 r13 = r5.f50825d
            android.content.Context r6 = r5.f50824c
            android.widget.LinearLayout r11 = r5.f50847m
            r20 = r1
            com.tencent.mm.plugin.brandservice.ui.timeline.item.q3 r1 = new com.tencent.mm.plugin.brandservice.ui.timeline.item.q3
            r1.<init>(r13, r6)
            r1.f50769m = r7
            r6 = 2131315515(0x7f094b3b, float:1.8249485E38)
            android.view.View r6 = r7.findViewById(r6)
            r1.f50770n = r6
            r6 = 2131300403(0x7f091033, float:1.8218835E38)
            android.view.View r6 = r7.findViewById(r6)
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6
            r1.f50771o = r6
            r6 = 2131315413(0x7f094ad5, float:1.8249279E38)
            android.view.View r6 = r7.findViewById(r6)
            com.tencent.mm.ui.widget.MMNeat7extView r6 = (com.tencent.p014mm.p136ui.widget.MMNeat7extView) r6
            r1.f50772p = r6
            fy0.i r6 = fy0.C8219i.f27144a
            r6 = 2131314717(0x7f09481d, float:1.8247867E38)
            android.view.View r6 = r7.findViewById(r6)
            android.widget.TextView r6 = (android.widget.TextView) r6
            r1.f50773q = r6
            r6 = 2131300511(0x7f09109f, float:1.8219054E38)
            android.view.View r6 = r7.findViewById(r6)
            r1.f50774r = r6
            r6 = 2131300531(0x7f0910b3, float:1.8219094E38)
            android.view.View r6 = r7.findViewById(r6)
            android.widget.ImageView r6 = (android.widget.ImageView) r6
            r1.f50775s = r6
            r6 = 2131311000(0x7f093998, float:1.8240328E38)
            android.view.View r6 = r7.findViewById(r6)
            android.widget.ImageView r6 = (android.widget.ImageView) r6
            r1.f50778v = r6
            r6 = 2131298044(0x7f0906fc, float:1.821405E38)
            android.view.View r6 = r7.findViewById(r6)
            r1.f50776t = r6
            r6 = 2131298134(0x7f090756, float:1.8214233E38)
            android.view.View r6 = r7.findViewById(r6)
            android.widget.ImageView r6 = (android.widget.ImageView) r6
            r1.f50777u = r6
            r6 = 2131314314(0x7f09468a, float:1.824705E38)
            android.view.View r6 = r7.findViewById(r6)
            r1.f50779w = r6
            r6 = 2131305228(0x7f09230c, float:1.822862E38)
            android.view.View r6 = r7.findViewById(r6)
            android.widget.TextView r6 = (android.widget.TextView) r6
            r1.f50780x = r6
            r6 = 2131310969(0x7f093979, float:1.8240265E38)
            android.view.View r6 = r7.findViewById(r6)
            r1.f50781y = r6
            r6 = 2131310968(0x7f093978, float:1.8240263E38)
            android.view.View r6 = r7.findViewById(r6)
            r1.f50782z = r6
            r6 = 2131310975(0x7f09397f, float:1.8240277E38)
            android.view.View r6 = r7.findViewById(r6)
            android.widget.TextView r6 = (android.widget.TextView) r6
            r1.f50766A = r6
            int r6 = r11.getChildCount()
            r11.addView(r7, r6)
            java.util.List<com.tencent.mm.plugin.brandservice.ui.timeline.item.q3> r6 = r5.f50852r
            java.util.ArrayList r6 = (java.util.ArrayList) r6
            r6.add(r1)
            int r10 = r10 + 1
            r1 = r20
            r6 = 10
            r7 = 3
            r11 = 0
            r13 = 7
            goto L_0x04f6
        L_0x05c0:
            r1 = 0
        L_0x05c1:
            java.util.List<com.tencent.mm.plugin.brandservice.ui.timeline.item.q3> r6 = r5.f50852r
            java.util.ArrayList r6 = (java.util.ArrayList) r6
            int r6 = r6.size()
            if (r1 >= r6) goto L_0x061e
            java.util.List<com.tencent.mm.plugin.brandservice.ui.timeline.item.q3> r6 = r5.f50852r
            java.util.ArrayList r6 = (java.util.ArrayList) r6
            java.lang.Object r6 = r6.get(r1)
            com.tencent.mm.plugin.brandservice.ui.timeline.item.q3 r6 = (com.tencent.p014mm.plugin.brandservice.p028ui.timeline.item.C18339q3) r6
            android.view.View r6 = r6.f50769m
            k20.a r7 = new k20.a
            r7.<init>()
            java.lang.ThreadLocal<k20.a> r10 = k20.C60958c.f173611a
            r10 = 8
            java.lang.Integer r11 = java.lang.Integer.valueOf(r10)
            r7.mo10233c(r11)
            java.lang.Object[] r29 = r7.mo10232b()
            java.lang.String r30 = "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTimeLineItemHolder"
            java.lang.String r31 = "fillingBizMsg"
            java.lang.String r32 = "(Lcom/tencent/mm/storage/BizTimeLineInfo;ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;"
            java.lang.String r33 = "android/view/View_EXEC_"
            java.lang.String r34 = "setVisibility"
            java.lang.String r35 = "(I)V"
            r28 = r6
            j20.C117292a.m165358d(r28, r29, r30, r31, r32, r33, r34, r35)
            r10 = 0
            java.lang.Object r7 = r7.mo10231a(r10)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            r6.setVisibility(r7)
            java.lang.String r29 = "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTimeLineItemHolder"
            java.lang.String r30 = "fillingBizMsg"
            java.lang.String r31 = "(Lcom/tencent/mm/storage/BizTimeLineInfo;ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;"
            java.lang.String r32 = "android/view/View_EXEC_"
            java.lang.String r33 = "setVisibility"
            java.lang.String r34 = "(I)V"
            j20.C117292a.m165359e(r28, r29, r30, r31, r32, r33, r34)
            int r1 = r1 + 1
            goto L_0x05c1
        L_0x061e:
            if (r14 == 0) goto L_0x069f
            int r1 = r12.f226333o
            r6 = 5
            if (r1 != r6) goto L_0x063a
            com.tencent.mm.plugin.brandservice.ui.timeline.item.i4 r1 = r5.f50854t
            int r7 = r8.f55523h1
            r13 = r2
            r11 = r3
            r3 = r12
            r28 = r4
            r4 = r8
            r10 = r5
            r5 = r55
            r0 = 6
            r6 = r28
            r1.mo22848f(r2, r3, r4, r5, r6, r7)
            goto L_0x06a5
        L_0x063a:
            r13 = r2
            r11 = r3
            r28 = r4
            r10 = r5
            r0 = 6
            r2 = 8
            if (r1 != r2) goto L_0x0654
            com.tencent.mm.plugin.brandservice.ui.timeline.item.d4 r1 = r10.f50855u
            int r7 = r8.f55523h1
            r2 = r13
            r3 = r12
            r4 = r8
            r5 = r55
            r6 = r28
            r1.mo22848f(r2, r3, r4, r5, r6, r7)
            goto L_0x06a5
        L_0x0654:
            r2 = 7
            if (r1 != r2) goto L_0x0666
            com.tencent.mm.plugin.brandservice.ui.timeline.item.j4 r1 = r10.f50856v
            int r7 = r8.f55523h1
            r2 = r13
            r3 = r12
            r4 = r8
            r5 = r55
            r6 = r28
            r1.mo22848f(r2, r3, r4, r5, r6, r7)
            goto L_0x06a5
        L_0x0666:
            if (r1 != r0) goto L_0x067d
            com.tencent.mm.plugin.brandservice.ui.timeline.item.z3 r1 = r10.f50857w
            r2 = 0
            java.lang.Object r3 = r11.get(r2)
            s90.j r3 = (s90.C77630j) r3
            int r7 = r8.f55523h1
            r2 = r13
            r4 = r8
            r5 = r55
            r6 = r28
            r1.mo22848f(r2, r3, r4, r5, r6, r7)
            goto L_0x06a5
        L_0x067d:
            r2 = 10
            if (r1 != r2) goto L_0x0690
            com.tencent.mm.plugin.brandservice.ui.timeline.item.g4 r1 = r10.f50858x
            int r7 = r8.f55523h1
            r2 = r13
            r3 = r12
            r4 = r8
            r5 = r55
            r6 = r28
            r1.mo22848f(r2, r3, r4, r5, r6, r7)
            goto L_0x06a5
        L_0x0690:
            com.tencent.mm.plugin.brandservice.ui.timeline.item.f4 r1 = r10.f50853s
            int r7 = r8.f55523h1
            r2 = r13
            r3 = r12
            r4 = r8
            r5 = r55
            r6 = r28
            r1.mo22848f(r2, r3, r4, r5, r6, r7)
            goto L_0x06a5
        L_0x069f:
            r13 = r2
            r11 = r3
            r28 = r4
            r10 = r5
            r0 = 6
        L_0x06a5:
            r1 = 2
            if (r13 <= r1) goto L_0x06d8
            boolean r1 = r8.field_isExpand
            if (r1 != 0) goto L_0x06d8
            android.widget.LinearLayout r1 = r10.f50848n
            r2 = 0
            r1.setVisibility(r2)
            android.widget.TextView r1 = r10.f50849o
            android.content.Context r3 = r10.f50824c
            r4 = 2131822731(0x7f11088b, float:1.9278242E38)
            r5 = 1
            java.lang.Object[] r6 = new java.lang.Object[r5]
            int r5 = r13 + -2
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r6[r2] = r5
            java.lang.String r2 = r3.getString(r4, r6)
            r1.setText(r2)
            android.widget.LinearLayout r1 = r10.f50848n
            r1.setTag(r8)
            android.widget.LinearLayout r1 = r10.f50848n
            android.view.View$OnClickListener r2 = r10.f50859y
            r1.setOnClickListener(r2)
            goto L_0x06df
        L_0x06d8:
            android.widget.LinearLayout r1 = r10.f50848n
            r2 = 8
            r1.setVisibility(r2)
        L_0x06df:
            r7 = r14
        L_0x06e0:
            if (r7 >= r13) goto L_0x0c37
            boolean r1 = r8.field_isExpand
            if (r1 != 0) goto L_0x06eb
            r1 = 1
            if (r7 <= r1) goto L_0x06eb
            goto L_0x0c37
        L_0x06eb:
            java.lang.Object r1 = r11.get(r7)
            r6 = r1
            s90.j r6 = (s90.C77630j) r6
            int r1 = r8.f55523h1
            int r1 = r1 + r7
            int r2 = r6.f226333o
            if (r2 != r0) goto L_0x06fc
            r2 = 7
            r6.f226333o = r2
        L_0x06fc:
            java.util.List<com.tencent.mm.plugin.brandservice.ui.timeline.item.q3> r2 = r10.f50852r
            if (r14 == 0) goto L_0x0703
            int r3 = r7 + -1
            goto L_0x0704
        L_0x0703:
            r3 = r7
        L_0x0704:
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            java.lang.Object r2 = r2.get(r3)
            r5 = r2
            com.tencent.mm.plugin.brandservice.ui.timeline.item.q3 r5 = (com.tencent.p014mm.plugin.brandservice.p028ui.timeline.item.C18339q3) r5
            int r2 = r12.f226333o
            r3 = 8
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
            if (r7 != 0) goto L_0x075d
            android.view.View r2 = r5.f50770n
            k20.a r3 = new k20.a
            r3.<init>()
            java.lang.ThreadLocal<k20.a> r17 = k20.C60958c.f173611a
            r3.mo10233c(r4)
            java.lang.Object[] r39 = r3.mo10232b()
            java.lang.String r40 = "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTimeLineItemHolder"
            java.lang.String r41 = "setCommItemPadding"
            java.lang.String r42 = "(Lcom/tencent/mm/plugin/brandservice/ui/timeline/item/BizTimeLineCommSlot;IIIZLjava/util/List;)V"
            java.lang.String r43 = "android/view/View_EXEC_"
            java.lang.String r44 = "setVisibility"
            java.lang.String r45 = "(I)V"
            r38 = r2
            j20.C117292a.m165358d(r38, r39, r40, r41, r42, r43, r44, r45)
            r4 = 0
            java.lang.Object r3 = r3.mo10231a(r4)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r2.setVisibility(r3)
            java.lang.String r30 = "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTimeLineItemHolder"
            java.lang.String r31 = "setCommItemPadding"
            java.lang.String r32 = "(Lcom/tencent/mm/plugin/brandservice/ui/timeline/item/BizTimeLineCommSlot;IIIZLjava/util/List;)V"
            java.lang.String r33 = "android/view/View_EXEC_"
            java.lang.String r34 = "setVisibility"
            java.lang.String r35 = "(I)V"
            r29 = r2
            j20.C117292a.m165359e(r29, r30, r31, r32, r33, r34, r35)
            goto L_0x085e
        L_0x075d:
            r3 = 1
            if (r7 != r3) goto L_0x07ad
            if (r14 == 0) goto L_0x07ad
            r3 = 7
            if (r2 == r3) goto L_0x07ad
            r3 = 5
            if (r2 == r3) goto L_0x07ae
            if (r2 == r0) goto L_0x07ae
            android.view.View r2 = r5.f50770n
            k20.a r0 = new k20.a
            r0.<init>()
            java.lang.ThreadLocal<k20.a> r17 = k20.C60958c.f173611a
            r0.mo10233c(r4)
            java.lang.Object[] r30 = r0.mo10232b()
            java.lang.String r31 = "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTimeLineItemHolder"
            java.lang.String r32 = "setCommItemPadding"
            java.lang.String r33 = "(Lcom/tencent/mm/plugin/brandservice/ui/timeline/item/BizTimeLineCommSlot;IIIZLjava/util/List;)V"
            java.lang.String r34 = "android/view/View_EXEC_"
            java.lang.String r35 = "setVisibility"
            java.lang.String r36 = "(I)V"
            r29 = r2
            j20.C117292a.m165358d(r29, r30, r31, r32, r33, r34, r35, r36)
            r4 = 0
            java.lang.Object r0 = r0.mo10231a(r4)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            r2.setVisibility(r0)
            java.lang.String r30 = "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTimeLineItemHolder"
            java.lang.String r31 = "setCommItemPadding"
            java.lang.String r32 = "(Lcom/tencent/mm/plugin/brandservice/ui/timeline/item/BizTimeLineCommSlot;IIIZLjava/util/List;)V"
            java.lang.String r33 = "android/view/View_EXEC_"
            java.lang.String r34 = "setVisibility"
            java.lang.String r35 = "(I)V"
            j20.C117292a.m165359e(r29, r30, r31, r32, r33, r34, r35)
            goto L_0x07f5
        L_0x07ad:
            r3 = 5
        L_0x07ae:
            android.view.View r0 = r5.f50770n
            k20.a r2 = new k20.a
            r2.<init>()
            java.lang.ThreadLocal<k20.a> r4 = k20.C60958c.f173611a
            r4 = 0
            java.lang.Integer r3 = java.lang.Integer.valueOf(r4)
            r2.mo10233c(r3)
            java.lang.Object[] r39 = r2.mo10232b()
            java.lang.String r40 = "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTimeLineItemHolder"
            java.lang.String r41 = "setCommItemPadding"
            java.lang.String r42 = "(Lcom/tencent/mm/plugin/brandservice/ui/timeline/item/BizTimeLineCommSlot;IIIZLjava/util/List;)V"
            java.lang.String r43 = "android/view/View_EXEC_"
            java.lang.String r44 = "setVisibility"
            java.lang.String r45 = "(I)V"
            r38 = r0
            j20.C117292a.m165358d(r38, r39, r40, r41, r42, r43, r44, r45)
            r3 = 0
            java.lang.Object r2 = r2.mo10231a(r3)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r0.setVisibility(r2)
            java.lang.String r39 = "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTimeLineItemHolder"
            java.lang.String r40 = "setCommItemPadding"
            java.lang.String r41 = "(Lcom/tencent/mm/plugin/brandservice/ui/timeline/item/BizTimeLineCommSlot;IIIZLjava/util/List;)V"
            java.lang.String r42 = "android/view/View_EXEC_"
            java.lang.String r43 = "setVisibility"
            java.lang.String r44 = "(I)V"
            j20.C117292a.m165359e(r38, r39, r40, r41, r42, r43, r44)
        L_0x07f5:
            if (r14 == 0) goto L_0x080b
            r0 = 1
            if (r7 < r0) goto L_0x07fb
            goto L_0x080b
        L_0x07fb:
            android.view.View r0 = r5.f50770n
            int r2 = f51421V
            android.view.ViewGroup$LayoutParams r3 = r0.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r3 = (android.widget.LinearLayout.LayoutParams) r3
            r3.rightMargin = r2
            r0.setLayoutParams(r3)
            goto L_0x085e
        L_0x080b:
            int r0 = r7 + -1
            java.lang.Object r0 = r11.get(r0)
            s90.j r0 = (s90.C77630j) r0
            java.lang.Object r2 = r11.get(r7)
            s90.j r2 = (s90.C77630j) r2
            int r3 = r0.f226333o
            r4 = 7
            if (r3 == r4) goto L_0x082c
            r4 = 5
            if (r3 == r4) goto L_0x082c
            r4 = 6
            if (r3 == r4) goto L_0x082c
            java.lang.String r0 = r0.f226330i
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 != 0) goto L_0x083f
        L_0x082c:
            int r0 = r2.f226333o
            r3 = 7
            if (r0 == r3) goto L_0x084f
            r3 = 5
            if (r0 == r3) goto L_0x084f
            r3 = 6
            if (r0 == r3) goto L_0x084f
            java.lang.String r0 = r2.f226330i
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 == 0) goto L_0x084f
        L_0x083f:
            android.view.View r0 = r5.f50770n
            int r2 = f51421V
            android.view.ViewGroup$LayoutParams r3 = r0.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r3 = (android.widget.LinearLayout.LayoutParams) r3
            r3.rightMargin = r2
            r0.setLayoutParams(r3)
            goto L_0x085e
        L_0x084f:
            android.view.View r0 = r5.f50770n
            int r2 = f51420U
            android.view.ViewGroup$LayoutParams r3 = r0.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r3 = (android.widget.LinearLayout.LayoutParams) r3
            r3.rightMargin = r2
            r0.setLayoutParams(r3)
        L_0x085e:
            if (r14 != 0) goto L_0x08e1
            if (r7 != 0) goto L_0x088b
            r0 = 1
            if (r13 != r0) goto L_0x0877
            android.view.ViewGroup r0 = r5.f50771o
            r19 = 0
            int r20 = f51419T
            r21 = 0
            int r22 = f51417R
            r17 = r10
            r18 = r0
            r17.mo22924d(r18, r19, r20, r21, r22)
            goto L_0x0888
        L_0x0877:
            android.view.ViewGroup r0 = r5.f50771o
            r19 = 0
            int r22 = f51419T
            r21 = 0
            r17 = r10
            r18 = r0
            r20 = r22
            r17.mo22924d(r18, r19, r20, r21, r22)
        L_0x0888:
            r0 = 2
            goto L_0x0934
        L_0x088b:
            r0 = 1
            if (r7 != r0) goto L_0x08b7
            r0 = 2
            if (r13 != r0) goto L_0x08a4
            android.view.ViewGroup r2 = r5.f50771o
            r19 = 0
            int r20 = f51419T
            r21 = 0
            int r22 = f51417R
            r17 = r10
            r18 = r2
            r17.mo22924d(r18, r19, r20, r21, r22)
            goto L_0x0934
        L_0x08a4:
            android.view.ViewGroup r2 = r5.f50771o
            r19 = 0
            int r22 = f51419T
            r21 = 0
            r17 = r10
            r18 = r2
            r20 = r22
            r17.mo22924d(r18, r19, r20, r21, r22)
            goto L_0x0934
        L_0x08b7:
            r0 = 2
            int r2 = r13 + -1
            if (r7 != r2) goto L_0x08cf
            android.view.ViewGroup r2 = r5.f50771o
            r19 = 0
            int r20 = f51419T
            r21 = 0
            int r22 = f51417R
            r17 = r10
            r18 = r2
            r17.mo22924d(r18, r19, r20, r21, r22)
            goto L_0x0934
        L_0x08cf:
            android.view.ViewGroup r2 = r5.f50771o
            r19 = 0
            int r22 = f51419T
            r21 = 0
            r17 = r10
            r18 = r2
            r20 = r22
            r17.mo22924d(r18, r19, r20, r21, r22)
            goto L_0x0934
        L_0x08e1:
            r0 = 2
            r2 = 1
            if (r7 != r2) goto L_0x090d
            int r2 = r13 + -1
            if (r7 != r2) goto L_0x08fb
            android.view.ViewGroup r2 = r5.f50771o
            r19 = 0
            int r22 = f51417R
            r21 = 0
            r17 = r10
            r18 = r2
            r20 = r22
            r17.mo22924d(r18, r19, r20, r21, r22)
            goto L_0x0934
        L_0x08fb:
            android.view.ViewGroup r2 = r5.f50771o
            r19 = 0
            int r20 = f51417R
            r21 = 0
            int r22 = f51419T
            r17 = r10
            r18 = r2
            r17.mo22924d(r18, r19, r20, r21, r22)
            goto L_0x0934
        L_0x090d:
            int r2 = r13 + -1
            if (r7 != r2) goto L_0x0923
            android.view.ViewGroup r2 = r5.f50771o
            r19 = 0
            int r20 = f51419T
            r21 = 0
            int r22 = f51417R
            r17 = r10
            r18 = r2
            r17.mo22924d(r18, r19, r20, r21, r22)
            goto L_0x0934
        L_0x0923:
            android.view.ViewGroup r2 = r5.f50771o
            r19 = 0
            int r22 = f51419T
            r21 = 0
            r17 = r10
            r18 = r2
            r20 = r22
            r17.mo22924d(r18, r19, r20, r21, r22)
        L_0x0934:
            r2 = 0
            r5.mo22908e(r6, r8, r7, r2)
            r5.mo22879d(r6, r8, r7, r2)
            android.view.View r2 = r5.f50779w
            android.widget.TextView r3 = r5.f50780x
            r5.mo22920b(r2, r3, r8, r6)
            java.lang.String r2 = r6.f226325d
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r2 == 0) goto L_0x0996
            fx0.d r2 = fx0.C45821d.f123719a
            int r3 = r6.f226333o
            r4 = 5
            if (r3 == r4) goto L_0x0982
            r4 = 7
            if (r3 == r4) goto L_0x0974
            r4 = 8
            if (r3 == r4) goto L_0x0966
            android.content.Context r3 = r10.f50824c
            android.content.res.Resources r3 = r3.getResources()
            r4 = 2131822678(0x7f110856, float:1.9278134E38)
            java.lang.String r3 = r3.getString(r4)
            goto L_0x098f
        L_0x0966:
            android.content.Context r3 = r10.f50824c
            android.content.res.Resources r3 = r3.getResources()
            r4 = 2131822679(0x7f110857, float:1.9278136E38)
            java.lang.String r3 = r3.getString(r4)
            goto L_0x098f
        L_0x0974:
            android.content.Context r3 = r10.f50824c
            android.content.res.Resources r3 = r3.getResources()
            r4 = 2131822694(0x7f110866, float:1.9278167E38)
            java.lang.String r3 = r3.getString(r4)
            goto L_0x098f
        L_0x0982:
            android.content.Context r3 = r10.f50824c
            android.content.res.Resources r3 = r3.getResources()
            r4 = 2131822693(0x7f110865, float:1.9278165E38)
            java.lang.String r3 = r3.getString(r4)
        L_0x098f:
            com.tencent.mm.ui.widget.MMNeat7extView r4 = r5.f50772p
            r0 = 1
            r2.mo71289g(r3, r4, r6, r0)
            goto L_0x09a0
        L_0x0996:
            r0 = 1
            fx0.d r2 = fx0.C45821d.f123719a
            java.lang.String r3 = r6.f226325d
            com.tencent.mm.ui.widget.MMNeat7extView r4 = r5.f50772p
            r2.mo71289g(r3, r4, r6, r0)
        L_0x09a0:
            com.tencent.mm.ui.widget.MMNeat7extView r2 = r5.f50772p
            android.content.Context r3 = r10.f50824c
            android.content.res.Resources r3 = r3.getResources()
            r4 = 2131099800(0x7f060098, float:1.7811963E38)
            int r3 = r3.getColor(r4)
            r2.setTextColor(r3)
            int r2 = r6.f226334p
            if (r2 == 0) goto L_0x0a15
            if (r2 != r0) goto L_0x09b9
            goto L_0x0a15
        L_0x09b9:
            android.view.View r1 = r5.f50774r
            k20.a r2 = new k20.a
            r2.<init>()
            r3 = 8
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
            r2.mo10233c(r4)
            java.lang.Object[] r39 = r2.mo10232b()
            java.lang.String r40 = "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTimeLineItemHolder"
            java.lang.String r41 = "fillingBizMsg"
            java.lang.String r42 = "(Lcom/tencent/mm/storage/BizTimeLineInfo;ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;"
            java.lang.String r43 = "android/view/View_EXEC_"
            java.lang.String r44 = "setVisibility"
            java.lang.String r45 = "(I)V"
            r38 = r1
            j20.C117292a.m165358d(r38, r39, r40, r41, r42, r43, r44, r45)
            r3 = 0
            java.lang.Object r2 = r2.mo10231a(r3)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r1.setVisibility(r2)
            java.lang.String r18 = "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTimeLineItemHolder"
            java.lang.String r19 = "fillingBizMsg"
            java.lang.String r20 = "(Lcom/tencent/mm/storage/BizTimeLineInfo;ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;"
            java.lang.String r21 = "android/view/View_EXEC_"
            java.lang.String r22 = "setVisibility"
            java.lang.String r23 = "(I)V"
            r17 = r1
            j20.C117292a.m165359e(r17, r18, r19, r20, r21, r22, r23)
            com.tencent.mm.ui.widget.MMNeat7extView r1 = r5.f50772p
            android.content.Context r2 = r10.f50824c
            android.content.res.Resources r2 = r2.getResources()
            r3 = 2131099806(0x7f06009e, float:1.7811976E38)
            int r2 = r2.getColor(r3)
            r1.setTextColor(r2)
            r2 = 7
            r3 = 8
            goto L_0x0a76
        L_0x0a15:
            android.view.View r2 = r5.f50774r
            k20.a r3 = new k20.a
            r3.<init>()
            r17 = 0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r17)
            r3.mo10233c(r0)
            java.lang.Object[] r39 = r3.mo10232b()
            java.lang.String r40 = "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTimeLineItemHolder"
            java.lang.String r41 = "fillingBizMsg"
            java.lang.String r42 = "(Lcom/tencent/mm/storage/BizTimeLineInfo;ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;"
            java.lang.String r43 = "android/view/View_EXEC_"
            java.lang.String r44 = "setVisibility"
            java.lang.String r45 = "(I)V"
            r38 = r2
            j20.C117292a.m165358d(r38, r39, r40, r41, r42, r43, r44, r45)
            r0 = 0
            java.lang.Object r3 = r3.mo10231a(r0)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r0 = r3.intValue()
            r2.setVisibility(r0)
            java.lang.String r18 = "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTimeLineItemHolder"
            java.lang.String r19 = "fillingBizMsg"
            java.lang.String r20 = "(Lcom/tencent/mm/storage/BizTimeLineInfo;ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;"
            java.lang.String r21 = "android/view/View_EXEC_"
            java.lang.String r22 = "setVisibility"
            java.lang.String r23 = "(I)V"
            r17 = r2
            j20.C117292a.m165359e(r17, r18, r19, r20, r21, r22, r23)
            com.tencent.mm.ui.widget.MMNeat7extView r0 = r5.f50772p
            android.content.Context r2 = r10.f50824c
            android.content.res.Resources r2 = r2.getResources()
            int r2 = r2.getColor(r4)
            r0.setTextColor(r2)
            int r0 = r6.f226333o
            r2 = 7
            if (r0 != r2) goto L_0x0a8c
            android.widget.ImageView r0 = r5.f50775s
            r3 = 8
            r0.setVisibility(r3)
        L_0x0a76:
            r0 = r10
            r27 = r11
            r29 = r12
            r51 = r13
            r26 = r14
            r52 = r15
            r57 = 8
            r3 = 5
            r9 = 0
            r10 = 6
            r24 = 2
            r25 = 7
            goto L_0x0b6d
        L_0x0a8c:
            r3 = 8
            java.lang.String r0 = r6.f226330i
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 != 0) goto L_0x0aef
            android.widget.ImageView r0 = r5.f50775s
            r4 = 0
            r0.setVisibility(r4)
            java.lang.String r0 = r6.f226312D
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 == 0) goto L_0x0aa7
            java.lang.String r0 = r6.f226330i
            goto L_0x0aa9
        L_0x0aa7:
            java.lang.String r0 = r6.f226312D
        L_0x0aa9:
            r43 = r0
            com.tencent.mm.plugin.brandservice.ui.timeline.z2 r0 = r10.f50825d
            com.tencent.mm.plugin.brandservice.ui.timeline.preload.j r0 = r0.f51445p
            long r2 = r8.field_msgId
            android.widget.ImageView r4 = r5.f50775s
            int r46 = f51416Q
            r47 = 0
            com.tencent.mm.plugin.brandservice.ui.timeline.item.u3 r48 = new com.tencent.mm.plugin.brandservice.ui.timeline.item.u3
            r23 = r10
            r24 = 2
            r10 = r48
            r27 = r11
            r9 = 0
            r11 = r23
            r29 = r12
            r12 = r5
            r51 = r13
            r57 = 8
            r17 = 0
            r25 = 7
            r13 = r6
            r26 = r14
            r14 = r8
            r52 = r15
            r15 = r7
            r10.<init>(r11, r12, r13, r14, r15)
            r50 = 1073741824(0x40000000, float:2.0)
            r38 = r0
            r39 = r2
            r41 = r7
            r42 = r6
            r44 = r4
            r45 = r46
            r49 = r1
            r38.mo23107i(r39, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50)
            r3 = 5
            r10 = 6
            goto L_0x0b4e
        L_0x0aef:
            r23 = r10
            r27 = r11
            r29 = r12
            r51 = r13
            r26 = r14
            r52 = r15
            r57 = 8
            r9 = 0
            r24 = 2
            r25 = 7
            int r0 = r6.f226333o
            r3 = 5
            r10 = 6
            if (r0 == r3) goto L_0x0b51
            if (r0 != r10) goto L_0x0b0b
            goto L_0x0b51
        L_0x0b0b:
            android.view.View r0 = r5.f50774r
            k20.a r1 = new k20.a
            r1.<init>()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r57)
            r1.mo10233c(r2)
            java.lang.Object[] r39 = r1.mo10232b()
            java.lang.String r40 = "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTimeLineItemHolder"
            java.lang.String r41 = "fillingBizMsg"
            java.lang.String r42 = "(Lcom/tencent/mm/storage/BizTimeLineInfo;ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;"
            java.lang.String r43 = "android/view/View_EXEC_"
            java.lang.String r44 = "setVisibility"
            java.lang.String r45 = "(I)V"
            r38 = r0
            j20.C117292a.m165358d(r38, r39, r40, r41, r42, r43, r44, r45)
            java.lang.Object r1 = r1.mo10231a(r9)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r0.setVisibility(r1)
            java.lang.String r31 = "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTimeLineItemHolder"
            java.lang.String r32 = "fillingBizMsg"
            java.lang.String r33 = "(Lcom/tencent/mm/storage/BizTimeLineInfo;ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;"
            java.lang.String r34 = "android/view/View_EXEC_"
            java.lang.String r35 = "setVisibility"
            java.lang.String r36 = "(I)V"
            r30 = r0
            j20.C117292a.m165359e(r30, r31, r32, r33, r34, r35, r36)
        L_0x0b4e:
            r0 = r23
            goto L_0x0b6d
        L_0x0b51:
            android.widget.ImageView r0 = r5.f50775s
            r0.setVisibility(r9)
            r0 = r23
            com.tencent.mm.plugin.brandservice.ui.timeline.z2 r2 = r0.f50825d
            com.tencent.mm.plugin.brandservice.ui.timeline.preload.j r2 = r2.f51445p
            android.widget.ImageView r4 = r5.f50775s
            int r21 = f51416Q
            java.lang.String r18 = "2131231667"
            r17 = r2
            r19 = r4
            r20 = r21
            r22 = r1
            r17.mo23108j(r18, r19, r20, r21, r22)
        L_0x0b6d:
            java.lang.String r1 = r6.f226332n
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r1 != 0) goto L_0x0b8b
            int r1 = r6.f226333o
            r11 = 3
            if (r1 != r11) goto L_0x0b8c
            android.widget.TextView r1 = r5.f50773q
            java.lang.String r2 = r6.f226332n
            r1.setText(r2)
            android.widget.TextView r1 = r5.f50773q
            r1.setVisibility(r9)
            r12 = r52
            r13 = 8
            goto L_0x0b9a
        L_0x0b8b:
            r11 = 3
        L_0x0b8c:
            android.widget.TextView r1 = r5.f50773q
            r12 = r52
            r1.setText(r12)
            android.widget.TextView r1 = r5.f50773q
            r13 = 8
            r1.setVisibility(r13)
        L_0x0b9a:
            android.view.View r1 = r5.f50769m
            k20.a r2 = new k20.a
            r2.<init>()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r9)
            r2.mo10233c(r4)
            java.lang.Object[] r31 = r2.mo10232b()
            java.lang.String r32 = "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTimeLineItemHolder"
            java.lang.String r33 = "fillingBizMsg"
            java.lang.String r34 = "(Lcom/tencent/mm/storage/BizTimeLineInfo;ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;"
            java.lang.String r35 = "android/view/View_EXEC_"
            java.lang.String r36 = "setVisibility"
            java.lang.String r37 = "(I)V"
            r30 = r1
            j20.C117292a.m165358d(r30, r31, r32, r33, r34, r35, r36, r37)
            java.lang.Object r2 = r2.mo10231a(r9)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r1.setVisibility(r2)
            java.lang.String r18 = "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTimeLineItemHolder"
            java.lang.String r19 = "fillingBizMsg"
            java.lang.String r20 = "(Lcom/tencent/mm/storage/BizTimeLineInfo;ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;"
            java.lang.String r21 = "android/view/View_EXEC_"
            java.lang.String r22 = "setVisibility"
            java.lang.String r23 = "(I)V"
            r17 = r1
            j20.C117292a.m165359e(r17, r18, r19, r20, r21, r22, r23)
            com.tencent.mm.plugin.brandservice.ui.timeline.z2 r1 = r0.f50825d
            android.view.View r14 = r5.f50769m
            r15 = r51
            r4 = 1
            if (r15 <= r4) goto L_0x0be9
            r17 = 1
            goto L_0x0beb
        L_0x0be9:
            r17 = 0
        L_0x0beb:
            r2 = r6
            r9 = 5
            r3 = r8
            r10 = 1
            r4 = r55
            r11 = r5
            r5 = r28
            r13 = r6
            r6 = r14
            r14 = r7
            r7 = r17
            r10 = r8
            r8 = r14
            r1.mo23168z(r2, r3, r4, r5, r6, r7, r8)
            int r2 = r15 + -1
            if (r14 != r2) goto L_0x0c13
            android.widget.LinearLayout r1 = r0.f50848n
            int r1 = r1.getVisibility()
            if (r1 == 0) goto L_0x0c13
            android.view.View r1 = r11.f50769m
            r2 = 2131231301(0x7f080245, float:1.807868E38)
            r1.setBackgroundResource(r2)
            goto L_0x0c1b
        L_0x0c13:
            android.view.View r1 = r11.f50769m
            r2 = 2131231308(0x7f08024c, float:1.8078693E38)
            r1.setBackgroundResource(r2)
        L_0x0c1b:
            int r1 = r13.f226333o
            if (r1 != r9) goto L_0x0c26
            com.tencent.mm.plugin.brandservice.ui.timeline.preload.l r2 = com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C40726l.f109414a
            java.lang.String r3 = r13.f226326e
            r2.mo63636e(r3, r1)
        L_0x0c26:
            int r7 = r14 + 1
            r9 = r55
            r8 = r10
            r13 = r15
            r14 = r26
            r11 = r27
            r10 = r0
            r15 = r12
            r12 = r29
            r0 = 6
            goto L_0x06e0
        L_0x0c37:
            r0 = r10
            r10 = r8
            com.tencent.mm.plugin.brandservice.ui.timeline.z2 r1 = r0.f50825d
            android.widget.LinearLayout r2 = r0.f50851q
            android.widget.LinearLayout r3 = r0.f50850p
            r4 = r55
            r5 = 0
            r1.mo23152j(r4, r10, r2, r3)
            com.tencent.mm.plugin.brandservice.ui.timeline.z2 r1 = r0.f50825d
            r1.mo23162s(r0, r10)
        L_0x0c4a:
            r6 = 0
            r2 = r54
            r1 = r16
            goto L_0x0dcd
        L_0x0c51:
            r10 = r8
            r4 = r9
            r12 = r15
            r5 = 0
            if (r1 != 0) goto L_0x0cb8
            com.tencent.mm.plugin.brandservice.ui.timeline.item.y3 r0 = new com.tencent.mm.plugin.brandservice.ui.timeline.item.y3
            r0.<init>()
            r2 = r54
            com.tencent.mm.plugin.brandservice.ui.timeline.BizTimeLineUI r1 = r2.f51436d
            r0.f50824c = r1
            r0.f50825d = r2
            android.view.View r3 = r0.f50826e
            if (r3 == 0) goto L_0x0c6b
            r1 = r3
            r6 = 0
            goto L_0x0cb4
        L_0x0c6b:
            r3 = 2131493379(0x7f0c0203, float:1.8610236E38)
            r6 = 0
            android.view.View r1 = android.view.View.inflate(r1, r3, r6)
            r0.f50826e = r1
            r0.mo22903a()
            android.view.View r1 = r0.f50826e
            r3 = 2131298124(0x7f09074c, float:1.8214212E38)
            android.view.View r1 = r1.findViewById(r3)
            com.tencent.mm.ui.widget.MMNeat7extView r1 = (com.tencent.p014mm.p136ui.widget.MMNeat7extView) r1
            r0.f51005p = r1
            android.view.View r1 = r0.f50826e
            r3 = 2131298125(0x7f09074d, float:1.8214214E38)
            android.view.View r1 = r1.findViewById(r3)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r0.f51006q = r1
            com.tencent.mm.ui.widget.MMNeat7extView r1 = r0.f51005p
            de3.o r3 = new de3.o
            de3.a0 r7 = new de3.a0
            com.tencent.mm.ui.widget.MMNeat7extView r8 = r0.f51005p
            android.content.Context r8 = r8.getContext()
            r7.<init>(r8)
            r3.<init>(r1, r7)
            r1.setOnTouchListener(r3)
            android.view.View r1 = r0.f50826e
            r3 = 2131298090(0x7f09072a, float:1.8214143E38)
            android.view.View r1 = r1.findViewById(r3)
            r0.f51004o = r1
            android.view.View r1 = r0.f50826e
        L_0x0cb4:
            r1.setTag(r0)
            goto L_0x0cc6
        L_0x0cb8:
            r6 = 0
            r2 = r54
            java.lang.Object r0 = r56.getTag()
            java.lang.String r3 = "null cannot be cast to non-null type com.tencent.mm.plugin.brandservice.ui.timeline.item.BizTimeLineTextItem"
            gy3.C87412m.m108592e(r0, r3)
            com.tencent.mm.plugin.brandservice.ui.timeline.item.y3 r0 = (com.tencent.p014mm.plugin.brandservice.p028ui.timeline.item.C18397y3) r0
        L_0x0cc6:
            java.lang.Class<ny.h> r3 = p629ny.C76979h.class
            di3.d r3 = di3.C86312j.m106911c(r3)
            r13 = r3
            ny.h r13 = (p629ny.C76979h) r13
            android.content.Context r14 = r0.f50824c
            java.lang.String r15 = r10.field_content
            com.tencent.mm.ui.widget.MMNeat7extView r3 = r0.f51005p
            float r3 = r3.getTextSize()
            int r3 = (int) r3
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r12)
            long r8 = r10.field_msgSvrId
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            java.lang.String r7 = eb0.C86493v0.m107223a(r7)
            eb0.v0 r8 = eb0.C86493v0.m107224d()
            r9 = 1
            eb0.v0$c r8 = r8.mo120947c(r7, r9)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r11 = "msg_"
            r9.append(r11)
            long r11 = r10.field_msgSvrId
            r9.append(r11)
            java.lang.String r9 = r9.toString()
            java.lang.String r11 = "prePublishId"
            r8.mo120962i(r11, r9)
            java.lang.String r9 = r10.field_talker
            java.lang.String r11 = "preUsername"
            r8.mo120962i(r11, r9)
            r17 = 1
            r18 = 0
            r16 = r3
            r19 = r7
            android.text.SpannableString r3 = r13.mo107078or(r14, r15, r16, r17, r18, r19)
            com.tencent.mm.ui.widget.MMNeat7extView r7 = r0.f51005p
            r8 = 2147483647(0x7fffffff, float:NaN)
            r7.setMaxLines(r8)
            com.tencent.mm.ui.widget.MMNeat7extView r7 = r0.f51005p
            r7.mo104279b(r3)
            boolean r3 = r10.field_isExpand
            r7 = 2131822689(0x7f110861, float:1.9278157E38)
            r9 = 2131822690(0x7f110862, float:1.9278159E38)
            if (r3 == 0) goto L_0x0d48
            android.widget.TextView r3 = r0.f51006q
            android.content.Context r11 = r0.f50824c
            java.lang.String r11 = r11.getString(r7)
            r3.setText(r11)
            goto L_0x0d53
        L_0x0d48:
            android.widget.TextView r3 = r0.f51006q
            android.content.Context r11 = r0.f50824c
            java.lang.String r11 = r11.getString(r9)
            r3.setText(r11)
        L_0x0d53:
            android.content.Context r3 = r0.f50824c
            int r3 = kg3.C76577a.m92145A(r3)
            android.content.Context r11 = r0.f50824c
            r12 = 72
            int r11 = kg3.C76577a.m92151b(r11, r12)
            int r3 = r3 - r11
            com.tencent.mm.ui.widget.MMNeat7extView r11 = r0.f51005p
            yr3.a r3 = r11.mo154990i(r3, r8)
            if (r3 == 0) goto L_0x0d6f
            com.tencent.neattextview.textview.layout.NeatLayout r3 = (com.tencent.neattextview.textview.layout.NeatLayout) r3
            int r11 = r3.f319992L
            goto L_0x0d70
        L_0x0d6f:
            r11 = 0
        L_0x0d70:
            r3 = 4
            if (r11 <= r3) goto L_0x0d9b
            boolean r8 = r10.field_isExpand
            if (r8 != 0) goto L_0x0d7c
            com.tencent.mm.ui.widget.MMNeat7extView r8 = r0.f51005p
            r8.setMaxLines(r3)
        L_0x0d7c:
            android.widget.TextView r8 = r0.f51006q
            r8.setVisibility(r5)
            boolean r8 = r10.field_isExpand
            if (r8 == 0) goto L_0x0d8b
            android.widget.TextView r8 = r0.f51006q
            r8.setText(r7)
            goto L_0x0d90
        L_0x0d8b:
            android.widget.TextView r7 = r0.f51006q
            r7.setText(r9)
        L_0x0d90:
            android.widget.TextView r7 = r0.f51006q
            com.tencent.mm.plugin.brandservice.ui.timeline.item.x3 r8 = new com.tencent.mm.plugin.brandservice.ui.timeline.item.x3
            r8.<init>(r0, r10)
            r7.setOnClickListener(r8)
            goto L_0x0da7
        L_0x0d9b:
            com.tencent.mm.ui.widget.MMNeat7extView r7 = r0.f51005p
            r7.setMaxLines(r8)
            android.widget.TextView r7 = r0.f51006q
            r8 = 8
            r7.setVisibility(r8)
        L_0x0da7:
            com.tencent.mm.ui.widget.MMNeat7extView r7 = r0.f51005p
            android.view.ViewGroup$LayoutParams r7 = r7.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r7 = (android.widget.LinearLayout.LayoutParams) r7
            if (r11 > r3) goto L_0x0db6
            r3 = 17
            r7.gravity = r3
            goto L_0x0dba
        L_0x0db6:
            r3 = 19
            r7.gravity = r3
        L_0x0dba:
            com.tencent.mm.ui.widget.MMNeat7extView r3 = r0.f51005p
            r3.setLayoutParams(r7)
            com.tencent.mm.plugin.brandservice.ui.timeline.z2 r3 = r0.f50825d
            r3.mo23162s(r0, r10)
            com.tencent.mm.plugin.brandservice.ui.timeline.z2 r3 = r0.f50825d
            android.widget.LinearLayout r7 = r0.f50739n
            android.widget.LinearLayout r0 = r0.f50738m
            r3.mo23152j(r4, r10, r7, r0)
        L_0x0dcd:
            java.lang.Object r0 = r1.getTag()
            boolean r3 = r0 instanceof com.tencent.p014mm.plugin.brandservice.p028ui.timeline.item.C18206a
            if (r3 == 0) goto L_0x0dd9
            r14 = r0
            com.tencent.mm.plugin.brandservice.ui.timeline.item.a r14 = (com.tencent.p014mm.plugin.brandservice.p028ui.timeline.item.C18206a) r14
            goto L_0x0dda
        L_0x0dd9:
            r14 = r6
        L_0x0dda:
            if (r14 == 0) goto L_0x0de0
            r14.f50327a = r10
            r14.f50328b = r4
        L_0x0de0:
            boolean r0 = r2.f51449t
            if (r0 != 0) goto L_0x0e3a
            boolean r0 = r2.f51447r
            if (r0 != 0) goto L_0x0e3a
            com.tencent.mm.plugin.brandservice.ui.timeline.m3 r0 = r2.f51443n
            qx0.b r0 = r0.f51079m
            if (r0 == 0) goto L_0x0e18
            int r3 = r10.f55529n1
            r6 = 1
            if (r3 != r6) goto L_0x0df5
            r12 = 1
            goto L_0x0df6
        L_0x0df5:
            r12 = 0
        L_0x0df6:
            if (r12 == 0) goto L_0x0df9
            goto L_0x0e19
        L_0x0df9:
            java.util.HashMap<java.lang.String, java.lang.Boolean> r3 = r0.f62641c
            java.lang.String r7 = r10.mo25768r2()
            java.lang.String r8 = "info.id"
            gy3.C87412m.m108593f(r7, r8)
            java.lang.Boolean r8 = java.lang.Boolean.TRUE
            r3.put(r7, r8)
            zt3.t r3 = zt3.C119157j.f356862d
            qx0.c r7 = new qx0.c
            r7.<init>(r0, r10, r4)
            zt3.j r3 = (zt3.C119157j) r3
            java.lang.String r0 = "BizTimeLineExpose"
            r3.mo183876g(r7, r0)
            goto L_0x0e19
        L_0x0e18:
            r6 = 1
        L_0x0e19:
            int r0 = r10.f55529n1
            if (r0 != 0) goto L_0x0e1f
            r12 = 1
            goto L_0x0e20
        L_0x0e1f:
            r12 = 0
        L_0x0e20:
            if (r12 == 0) goto L_0x0e3a
            com.tencent.mm.storage.z0 r0 = com.tencent.p014mm.storage.C19641z0.f55645a
            com.tencent.mm.plugin.brandservice.ui.timeline.m3 r0 = r2.f51443n
            r0.mo22993t(r10)
            boolean r0 = r10.mo25758F2()
            if (r0 != 0) goto L_0x0e3a
            boolean r0 = r10.mo25753A2()
            if (r0 != 0) goto L_0x0e3a
            java.lang.String r0 = r10.field_talker
            r2.mo23149h(r0)
        L_0x0e3a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.brandservice.p028ui.timeline.C18508z2.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    public int getViewTypeCount() {
        return 7;
    }

    /* renamed from: h */
    public final void mo23149h(String str) {
        if (str != null && !((HashSet) this.f51450u).contains(str)) {
            ((C87121j) C86312j.m106911c(C87121j.class)).mo71215V9(str, 2);
            ((HashSet) this.f51450u).add(str);
        }
    }

    /* renamed from: i */
    public final void mo23150i(List<? extends C22508lo3> list) {
        boolean z;
        Iterator<T> it = list.iterator();
        while (true) {
            z = true;
            if (!it.hasNext()) {
                break;
            }
            C19623o0 o0Var = new C19623o0();
            o0Var.f55529n1 = 2;
            o0Var.f55539x1 = (C22508lo3) it.next();
            o0Var.field_orderFlag = C20583z.f57954f.incrementAndGet();
            this.f51440h.add(o0Var);
            C22508lo3 lo32 = o0Var.f55539x1;
            C87412m.m108593f(lo32, "recFeed");
            C88334c cVar = C19613h1.f55490a;
            if (lo32.f64173f != 2003) {
                z = false;
            }
            if (z) {
                C19627t.f55586a.mo25852z(o0Var);
            }
        }
        List<C19623o0> list2 = this.f51440h;
        if (list2 != null && !list2.isEmpty()) {
            z = false;
        }
        if (!z && this.f51434G) {
            mo23166w();
        }
        notifyDataSetChanged();
    }

    public boolean isEmpty() {
        if (super.isEmpty()) {
            if (C48009v0.Kx0().mo25734SE() > 0) {
                return false;
            }
            mg4 a = C29763t.m38870a();
            if (!(a == null || Util.isNullOrNil((List) a.f184323d))) {
                return false;
            }
        }
        return super.isEmpty();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x007c, code lost:
        if (r2.longValue() == r1.field_orderFlag) goto L_0x00a9;
     */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00ed  */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo23152j(int r18, com.tencent.p014mm.storage.C19623o0 r19, android.view.View r20, android.view.View r21) {
        /*
            r17 = this;
            r0 = r17
            r1 = r19
            r10 = r20
            r11 = r21
            java.lang.String r2 = "info"
            gy3.C87412m.m108594g(r1, r2)
            java.lang.String r2 = "topLayout"
            gy3.C87412m.m108594g(r10, r2)
            java.lang.String r2 = "newTipsLayout"
            gy3.C87412m.m108594g(r11, r2)
            r2 = 8
            java.lang.Integer r12 = java.lang.Integer.valueOf(r2)
            r13 = 0
            java.lang.Integer r14 = java.lang.Integer.valueOf(r13)
            if (r18 <= 0) goto L_0x0131
            k20.a r9 = new k20.a
            r9.<init>()
            java.lang.ThreadLocal<k20.a> r2 = k20.C60958c.f173611a
            r9.mo10233c(r14)
            java.lang.Object[] r3 = r9.mo10232b()
            java.lang.String r4 = "com/tencent/mm/plugin/brandservice/ui/timeline/BizTimeLineAdapter"
            java.lang.String r5 = "fillingCommInfo"
            java.lang.String r6 = "(ILcom/tencent/mm/storage/BizTimeLineInfo;Landroid/view/View;Landroid/view/View;)V"
            java.lang.String r7 = "android/view/View_EXEC_"
            java.lang.String r8 = "setVisibility"
            java.lang.String r16 = "(I)V"
            r2 = r20
            r15 = r9
            r9 = r16
            j20.C117292a.m165358d(r2, r3, r4, r5, r6, r7, r8, r9)
            java.lang.Object r2 = r15.mo10231a(r13)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r10.setVisibility(r2)
            java.lang.String r3 = "com/tencent/mm/plugin/brandservice/ui/timeline/BizTimeLineAdapter"
            java.lang.String r4 = "fillingCommInfo"
            java.lang.String r5 = "(ILcom/tencent/mm/storage/BizTimeLineInfo;Landroid/view/View;Landroid/view/View;)V"
            java.lang.String r6 = "android/view/View_EXEC_"
            java.lang.String r7 = "setVisibility"
            java.lang.String r8 = "(I)V"
            r2 = r20
            j20.C117292a.m165359e(r2, r3, r4, r5, r6, r7, r8)
            com.tencent.mm.plugin.brandservice.ui.timeline.z2$a r2 = f51409I
            boolean r2 = r2.mo23169c()
            if (r2 == 0) goto L_0x0070
            goto L_0x00ab
        L_0x0070:
            java.lang.Long r2 = f51424Y
            if (r2 == 0) goto L_0x007f
            long r3 = r1.field_orderFlag
            long r5 = r2.longValue()
            int r2 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r2 != 0) goto L_0x00ab
            goto L_0x00a9
        L_0x007f:
            long r2 = r19.mo25767q2()
            r4 = 0
            int r6 = r18 + -1
            com.tencent.mm.storage.o0 r6 = r0.getItem(r6)
            if (r6 == 0) goto L_0x0091
            long r4 = r6.mo25767q2()
        L_0x0091:
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 == 0) goto L_0x00ab
            java.lang.Long r2 = f51425Z
            if (r2 == 0) goto L_0x00ab
            long r2 = r2.longValue()
            int r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r6 != 0) goto L_0x00ab
            long r2 = r1.field_orderFlag
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            f51424Y = r2
        L_0x00a9:
            r15 = 1
            goto L_0x00ac
        L_0x00ab:
            r15 = 0
        L_0x00ac:
            if (r15 == 0) goto L_0x00ed
            k20.a r10 = new k20.a
            r10.<init>()
            r10.mo10233c(r14)
            java.lang.Object[] r3 = r10.mo10232b()
            java.lang.String r4 = "com/tencent/mm/plugin/brandservice/ui/timeline/BizTimeLineAdapter"
            java.lang.String r5 = "fillingCommInfo"
            java.lang.String r6 = "(ILcom/tencent/mm/storage/BizTimeLineInfo;Landroid/view/View;Landroid/view/View;)V"
            java.lang.String r7 = "android/view/View_EXEC_"
            java.lang.String r8 = "setVisibility"
            java.lang.String r9 = "(I)V"
            r2 = r21
            j20.C117292a.m165358d(r2, r3, r4, r5, r6, r7, r8, r9)
            java.lang.Object r2 = r10.mo10231a(r13)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r11.setVisibility(r2)
            java.lang.String r3 = "com/tencent/mm/plugin/brandservice/ui/timeline/BizTimeLineAdapter"
            java.lang.String r4 = "fillingCommInfo"
            java.lang.String r5 = "(ILcom/tencent/mm/storage/BizTimeLineInfo;Landroid/view/View;Landroid/view/View;)V"
            java.lang.String r6 = "android/view/View_EXEC_"
            java.lang.String r7 = "setVisibility"
            java.lang.String r8 = "(I)V"
            r2 = r21
            j20.C117292a.m165359e(r2, r3, r4, r5, r6, r7, r8)
            goto L_0x01d2
        L_0x00ed:
            k20.a r14 = new k20.a
            r14.<init>()
            r14.mo10233c(r12)
            java.lang.Object[] r3 = r14.mo10232b()
            java.lang.String r4 = "com/tencent/mm/plugin/brandservice/ui/timeline/BizTimeLineAdapter"
            java.lang.String r5 = "fillingCommInfo"
            java.lang.String r6 = "(ILcom/tencent/mm/storage/BizTimeLineInfo;Landroid/view/View;Landroid/view/View;)V"
            java.lang.String r7 = "android/view/View_EXEC_"
            java.lang.String r8 = "setVisibility"
            java.lang.String r9 = "(I)V"
            r2 = r21
            j20.C117292a.m165358d(r2, r3, r4, r5, r6, r7, r8, r9)
            java.lang.Object r2 = r14.mo10231a(r13)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r11.setVisibility(r2)
            java.lang.String r3 = "com/tencent/mm/plugin/brandservice/ui/timeline/BizTimeLineAdapter"
            java.lang.String r4 = "fillingCommInfo"
            java.lang.String r5 = "(ILcom/tencent/mm/storage/BizTimeLineInfo;Landroid/view/View;Landroid/view/View;)V"
            java.lang.String r6 = "android/view/View_EXEC_"
            java.lang.String r7 = "setVisibility"
            java.lang.String r8 = "(I)V"
            r2 = r21
            j20.C117292a.m165359e(r2, r3, r4, r5, r6, r7, r8)
            int r2 = f51418S
            r10.setMinimumHeight(r2)
            goto L_0x01d2
        L_0x0131:
            com.tencent.mm.plugin.brandservice.ui.timeline.BizTimeLineUI r2 = r0.f51436d
            com.tencent.mm.plugin.brandservice.ui.timeline.offenread.BizTimeLineHotView r3 = r2.f50245r
            int r3 = r3.getVisibility()
            if (r3 == 0) goto L_0x0146
            android.widget.LinearLayout r2 = r2.f50240n
            int r2 = r2.getVisibility()
            if (r2 != 0) goto L_0x0144
            goto L_0x0146
        L_0x0144:
            r15 = 0
            goto L_0x0147
        L_0x0146:
            r15 = 1
        L_0x0147:
            if (r15 == 0) goto L_0x0151
            int r2 = f51422W
            int r2 = r2 * 2
            r10.setMinimumHeight(r2)
            goto L_0x0156
        L_0x0151:
            int r2 = f51418S
            r10.setMinimumHeight(r2)
        L_0x0156:
            k20.a r15 = new k20.a
            r15.<init>()
            java.lang.ThreadLocal<k20.a> r2 = k20.C60958c.f173611a
            r15.mo10233c(r14)
            java.lang.Object[] r3 = r15.mo10232b()
            java.lang.String r4 = "com/tencent/mm/plugin/brandservice/ui/timeline/BizTimeLineAdapter"
            java.lang.String r5 = "fillingCommInfo"
            java.lang.String r6 = "(ILcom/tencent/mm/storage/BizTimeLineInfo;Landroid/view/View;Landroid/view/View;)V"
            java.lang.String r7 = "android/view/View_EXEC_"
            java.lang.String r8 = "setVisibility"
            java.lang.String r9 = "(I)V"
            r2 = r20
            j20.C117292a.m165358d(r2, r3, r4, r5, r6, r7, r8, r9)
            java.lang.Object r2 = r15.mo10231a(r13)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r10.setVisibility(r2)
            java.lang.String r3 = "com/tencent/mm/plugin/brandservice/ui/timeline/BizTimeLineAdapter"
            java.lang.String r4 = "fillingCommInfo"
            java.lang.String r5 = "(ILcom/tencent/mm/storage/BizTimeLineInfo;Landroid/view/View;Landroid/view/View;)V"
            java.lang.String r6 = "android/view/View_EXEC_"
            java.lang.String r7 = "setVisibility"
            java.lang.String r8 = "(I)V"
            r2 = r20
            j20.C117292a.m165359e(r2, r3, r4, r5, r6, r7, r8)
            k20.a r10 = new k20.a
            r10.<init>()
            r10.mo10233c(r12)
            java.lang.Object[] r3 = r10.mo10232b()
            java.lang.String r4 = "com/tencent/mm/plugin/brandservice/ui/timeline/BizTimeLineAdapter"
            java.lang.String r5 = "fillingCommInfo"
            java.lang.String r6 = "(ILcom/tencent/mm/storage/BizTimeLineInfo;Landroid/view/View;Landroid/view/View;)V"
            java.lang.String r7 = "android/view/View_EXEC_"
            java.lang.String r8 = "setVisibility"
            java.lang.String r9 = "(I)V"
            r2 = r21
            j20.C117292a.m165358d(r2, r3, r4, r5, r6, r7, r8, r9)
            java.lang.Object r2 = r10.mo10231a(r13)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r11.setVisibility(r2)
            java.lang.String r3 = "com/tencent/mm/plugin/brandservice/ui/timeline/BizTimeLineAdapter"
            java.lang.String r4 = "fillingCommInfo"
            java.lang.String r5 = "(ILcom/tencent/mm/storage/BizTimeLineInfo;Landroid/view/View;Landroid/view/View;)V"
            java.lang.String r6 = "android/view/View_EXEC_"
            java.lang.String r7 = "setVisibility"
            java.lang.String r8 = "(I)V"
            r2 = r21
            j20.C117292a.m165359e(r2, r3, r4, r5, r6, r7, r8)
        L_0x01d2:
            r0.mo23136C(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.brandservice.p028ui.timeline.C18508z2.mo23152j(int, com.tencent.mm.storage.o0, android.view.View, android.view.View):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:86:0x051e  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0570  */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View mo23153k(com.tencent.p014mm.storage.C19623o0 r35, int r36, android.view.View r37, android.view.ViewGroup r38) {
        /*
            r34 = this;
            r0 = r34
            r1 = r35
            r2 = r36
            boolean r3 = r0.f51449t
            if (r3 != 0) goto L_0x0021
            java.util.Map<java.lang.Long, java.lang.Integer> r3 = fy0.C20739g.f58625a
            if (r1 == 0) goto L_0x0021
            boolean r3 = r35.mo25758F2()
            if (r3 != 0) goto L_0x0015
            goto L_0x0021
        L_0x0015:
            fy0.h r3 = new fy0.h
            r3.<init>(r1)
            r4 = 0
            java.lang.String r6 = "BrandServiceWorkerThread"
            dx0.C31332a.m39373a(r6, r3, r4)
        L_0x0021:
            if (r37 != 0) goto L_0x0035
            com.tencent.mm.plugin.brandservice.ui.timeline.item.d2 r3 = new com.tencent.mm.plugin.brandservice.ui.timeline.item.d2
            com.tencent.mm.plugin.brandservice.ui.timeline.BizTimeLineUI r4 = r0.f51436d
            r3.<init>(r4, r0)
            android.view.View r4 = r3.f50409d
            r4.setTag(r3)
            r33 = r4
            r4 = r3
            r3 = r33
            goto L_0x0043
        L_0x0035:
            java.lang.Object r3 = r37.getTag()
            java.lang.String r4 = "null cannot be cast to non-null type com.tencent.mm.plugin.brandservice.ui.timeline.item.BizTLRecCardNew"
            gy3.C87412m.m108592e(r3, r4)
            com.tencent.mm.plugin.brandservice.ui.timeline.item.d2 r3 = (com.tencent.p014mm.plugin.brandservice.p028ui.timeline.item.C18234d2) r3
            r4 = r3
            r3 = r37
        L_0x0043:
            java.lang.String r5 = "info"
            gy3.C87412m.m108594g(r1, r5)
            te3.re4 r5 = r35.mo25774x2()
            java.lang.String r6 = "MicroMsg.BizTLRecCardNew"
            if (r5 != 0) goto L_0x005a
            r4.mo22846a()
            java.lang.String r1 = "[TRACE_BIZRECCARD] info null"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r1)
            goto L_0x060a
        L_0x005a:
            te3.re4 r5 = r1.f55530o1
            int r5 = r5.f64521j
            boolean r5 = com.tencent.p014mm.plugin.brandservice.p028ui.timeline.item.C18355t.m18924c(r5)
            if (r5 != 0) goto L_0x0086
            r4.mo22846a()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "[TRACE_BIZRECCARD] style = "
            r2.append(r4)
            te3.re4 r1 = r1.f55530o1
            int r1 = r1.f64521j
            r2.append(r1)
            java.lang.String r1 = " not support"
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r1)
            goto L_0x060a
        L_0x0086:
            te3.re4 r5 = r1.f55530o1
            java.lang.String r7 = "info.wrapper"
            gy3.C87412m.m108593f(r5, r7)
            boolean r5 = com.tencent.p014mm.storage.C19613h1.m21043p(r5, r1)
            if (r5 != 0) goto L_0x009d
            r4.mo22846a()
            java.lang.String r1 = "[TRACE_BIZRECCARD] wrapper illegal"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r1)
            goto L_0x060a
        L_0x009d:
            te3.re4 r5 = r1.f55530o1
            int r5 = r5.f64521j
            r7 = 3
            r8 = 5
            r12 = 8
            if (r5 == r7) goto L_0x00c0
            if (r5 == r8) goto L_0x00c1
            r7 = 1001(0x3e9, float:1.403E-42)
            if (r5 == r7) goto L_0x00be
            switch(r5) {
                case 101: goto L_0x00bc;
                case 102: goto L_0x00ba;
                case 103: goto L_0x00b8;
                case 104: goto L_0x00b5;
                case 105: goto L_0x00b2;
                default: goto L_0x00b0;
            }
        L_0x00b0:
            r7 = 1
            goto L_0x00c1
        L_0x00b2:
            r7 = 9
            goto L_0x00c1
        L_0x00b5:
            r7 = 8
            goto L_0x00c1
        L_0x00b8:
            r7 = 7
            goto L_0x00c1
        L_0x00ba:
            r7 = 6
            goto L_0x00c1
        L_0x00bc:
            r7 = 4
            goto L_0x00c1
        L_0x00be:
            r7 = 5
            goto L_0x00c1
        L_0x00c0:
            r7 = 2
        L_0x00c1:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r8 = "[TRACE_BIZRECCARD] filling style = "
            r5.append(r8)
            te3.re4 r8 = r1.f55530o1
            int r8 = r8.f64521j
            r5.append(r8)
            java.lang.String r8 = ", msgId = "
            r5.append(r8)
            long r8 = r1.field_msgId
            r5.append(r8)
            java.lang.String r5 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r5)
            com.tencent.mm.plugin.brandservice.ui.timeline.z2 r5 = r4.f50408c
            android.widget.LinearLayout r6 = r4.f50420o
            java.lang.String r8 = "topLayout"
            gy3.C87412m.m108593f(r6, r8)
            android.widget.LinearLayout r8 = r4.f50419n
            java.lang.String r9 = "newTipsLayout"
            gy3.C87412m.m108593f(r8, r9)
            r5.mo23152j(r2, r1, r6, r8)
            com.tencent.mm.plugin.brandservice.ui.timeline.item.h2 r5 = r4.f50412g
            r5.mo22876d()
            com.tencent.mm.plugin.brandservice.ui.timeline.item.x0 r5 = r4.f50411f
            r5.mo22938k()
            com.tencent.mm.plugin.brandservice.ui.timeline.item.j0 r5 = r4.f50410e
            r5.mo22881k()
            com.tencent.mm.plugin.brandservice.ui.timeline.item.p0 r5 = r4.f50413h
            r5.mo22900i()
            com.tencent.mm.plugin.brandservice.ui.timeline.item.u0 r5 = r4.f50414i
            r5.mo22929h()
            com.tencent.mm.plugin.brandservice.ui.timeline.item.q1 r5 = r4.f50415j
            r5.mo22907i()
            com.tencent.mm.plugin.brandservice.ui.timeline.item.o2 r5 = r4.f50416k
            r5.mo22898h()
            com.tencent.mm.plugin.brandservice.ui.timeline.item.y1 r5 = r4.f50417l
            r5.mo22951s()
            com.tencent.mm.plugin.brandservice.ui.timeline.item.h1 r5 = r4.f50418m
            android.widget.LinearLayout r5 = r5.mo22860j()
            r5.setVisibility(r12)
            switch(r7) {
                case 1: goto L_0x0175;
                case 2: goto L_0x016c;
                case 3: goto L_0x0163;
                case 4: goto L_0x015a;
                case 5: goto L_0x0151;
                case 6: goto L_0x0148;
                case 7: goto L_0x013f;
                case 8: goto L_0x0136;
                case 9: goto L_0x012d;
                default: goto L_0x012b;
            }
        L_0x012b:
            goto L_0x060a
        L_0x012d:
            com.tencent.mm.plugin.brandservice.ui.timeline.item.h1 r5 = r4.f50418m
            android.view.View r4 = r4.f50409d
            r5.mo22815a(r1, r2, r3, r4)
            goto L_0x060a
        L_0x0136:
            com.tencent.mm.plugin.brandservice.ui.timeline.item.y1 r5 = r4.f50417l
            android.view.View r4 = r4.f50409d
            r5.mo22815a(r1, r2, r3, r4)
            goto L_0x060a
        L_0x013f:
            com.tencent.mm.plugin.brandservice.ui.timeline.item.o2 r5 = r4.f50416k
            android.view.View r4 = r4.f50409d
            r5.mo22815a(r1, r2, r3, r4)
            goto L_0x060a
        L_0x0148:
            com.tencent.mm.plugin.brandservice.ui.timeline.item.q1 r5 = r4.f50415j
            android.view.View r4 = r4.f50409d
            r5.mo22815a(r1, r2, r3, r4)
            goto L_0x060a
        L_0x0151:
            com.tencent.mm.plugin.brandservice.ui.timeline.item.u0 r5 = r4.f50414i
            android.view.View r4 = r4.f50409d
            r5.mo22815a(r1, r2, r3, r4)
            goto L_0x060a
        L_0x015a:
            com.tencent.mm.plugin.brandservice.ui.timeline.item.p0 r5 = r4.f50413h
            android.view.View r4 = r4.f50409d
            r5.mo22815a(r1, r2, r3, r4)
            goto L_0x060a
        L_0x0163:
            com.tencent.mm.plugin.brandservice.ui.timeline.item.x0 r5 = r4.f50411f
            android.view.View r4 = r4.f50409d
            r5.mo22815a(r1, r2, r3, r4)
            goto L_0x060a
        L_0x016c:
            com.tencent.mm.plugin.brandservice.ui.timeline.item.j0 r5 = r4.f50410e
            android.view.View r4 = r4.f50409d
            r5.mo22815a(r1, r2, r3, r4)
            goto L_0x060a
        L_0x0175:
            com.tencent.mm.plugin.brandservice.ui.timeline.item.h2 r14 = r4.f50412g
            android.view.View r4 = r4.f50409d
            r14.getClass()
            java.lang.Class<ex0.d> r15 = ex0.C45696d.class
            com.tencent.mm.plugin.report.service.n r24 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r17 = 1149(0x47d, double:5.677E-321)
            r19 = 2
            r21 = 1
            r23 = 0
            r16 = r24
            r16.idkeyStat(r17, r19, r21, r23)
            android.content.Context r5 = r14.f50824c
            android.view.View r6 = r14.f50826e
            if (r6 != 0) goto L_0x0236
            r6 = 2131316315(0x7f094e5b, float:1.8251108E38)
            android.view.View r4 = r4.findViewById(r6)
            android.view.ViewStub r4 = (android.view.ViewStub) r4
            android.view.View r4 = r4.inflate()
            r14.f50826e = r4
            r14.mo22903a()
            android.view.View r4 = r14.f50826e
            r6 = 2131298001(0x7f0906d1, float:1.8213963E38)
            android.view.View r4 = r4.findViewById(r6)
            android.widget.TextView r4 = (android.widget.TextView) r4
            r14.f50556p = r4
            android.view.View r4 = r14.f50826e
            r6 = 2131299724(0x7f090d8c, float:1.8217457E38)
            android.view.View r4 = r4.findViewById(r6)
            r14.f50557q = r4
            android.view.View r4 = r14.f50826e
            r6 = 2131299723(0x7f090d8b, float:1.8217455E38)
            android.view.View r4 = r4.findViewById(r6)
            r14.f50558r = r4
            android.view.View r4 = r14.f50826e
            r6 = 2131297999(0x7f0906cf, float:1.8213959E38)
            android.view.View r4 = r4.findViewById(r6)
            r14.f50559s = r4
            android.view.View r4 = r14.f50826e
            r6 = 2131298000(0x7f0906d0, float:1.821396E38)
            android.view.View r4 = r4.findViewById(r6)
            android.widget.TextView r4 = (android.widget.TextView) r4
            r14.f50560t = r4
            android.view.View r4 = r14.f50826e
            r6 = 2131297987(0x7f0906c3, float:1.8213934E38)
            android.view.View r4 = r4.findViewById(r6)
            com.tencent.mm.ui.widget.MMNeat7extView r4 = (com.tencent.p014mm.p136ui.widget.MMNeat7extView) r4
            r14.f50561u = r4
            android.view.View r4 = r14.f50826e
            r6 = 2131297998(0x7f0906ce, float:1.8213957E38)
            android.view.View r4 = r4.findViewById(r6)
            r14.f50555o = r4
            android.view.View r4 = r14.f50826e
            r6 = 2131297983(0x7f0906bf, float:1.8213926E38)
            android.view.View r4 = r4.findViewById(r6)
            r14.f50562v = r4
            android.view.View r4 = r14.f50826e
            r6 = 2131297984(0x7f0906c0, float:1.8213928E38)
            android.view.View r4 = r4.findViewById(r6)
            android.widget.TextView r4 = (android.widget.TextView) r4
            r14.f50563w = r4
            android.view.View r4 = r14.f50826e
            r6 = 2131297985(0x7f0906c1, float:1.821393E38)
            android.view.View r4 = r4.findViewById(r6)
            com.tencent.mm.ui.widget.MMNeat7extView r4 = (com.tencent.p014mm.p136ui.widget.MMNeat7extView) r4
            r14.f50564x = r4
            android.view.View r4 = r14.f50826e
            r6 = 2131310012(0x7f0935bc, float:1.8238324E38)
            android.view.View r4 = r4.findViewById(r6)
            com.tencent.mm.ui.widget.imageview.WeImageView r4 = (com.tencent.p014mm.p136ui.widget.imageview.WeImageView) r4
            android.content.res.Resources r5 = r5.getResources()
            r6 = 2131099682(0x7f060022, float:1.7811724E38)
            int r5 = r5.getColor(r6)
            r4.setIconColor(r5)
        L_0x0236:
            android.view.View r4 = r14.f50826e
            k20.a r5 = new k20.a
            r5.<init>()
            java.lang.ThreadLocal<k20.a> r6 = k20.C60958c.f173611a
            r11 = 0
            java.lang.Integer r6 = java.lang.Integer.valueOf(r11)
            r5.mo10233c(r6)
            java.lang.Object[] r17 = r5.mo10232b()
            java.lang.String r18 = "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecCardOld"
            java.lang.String r19 = "filling"
            java.lang.String r20 = "(Lcom/tencent/mm/storage/BizTimeLineInfo;ILandroid/view/View;Landroid/view/View;)Landroid/view/View;"
            java.lang.String r21 = "android/view/View_EXEC_"
            java.lang.String r22 = "setVisibility"
            java.lang.String r23 = "(I)V"
            r16 = r4
            j20.C117292a.m165358d(r16, r17, r18, r19, r20, r21, r22, r23)
            java.lang.Object r5 = r5.mo10231a(r11)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            r4.setVisibility(r5)
            java.lang.String r17 = "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecCardOld"
            java.lang.String r18 = "filling"
            java.lang.String r19 = "(Lcom/tencent/mm/storage/BizTimeLineInfo;ILandroid/view/View;Landroid/view/View;)Landroid/view/View;"
            java.lang.String r20 = "android/view/View_EXEC_"
            java.lang.String r21 = "setVisibility"
            java.lang.String r22 = "(I)V"
            j20.C117292a.m165359e(r16, r17, r18, r19, r20, r21, r22)
            te3.me4 r10 = r35.mo25773w2()
            if (r10 == 0) goto L_0x05c9
            te3.oe4 r4 = r10.f64240e
            if (r4 != 0) goto L_0x0286
            goto L_0x05c9
        L_0x0286:
            k20.a r9 = new k20.a
            r9.<init>()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r11)
            r9.mo10233c(r4)
            java.lang.Object[] r5 = r9.mo10232b()
            java.lang.String r6 = "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecCardOld"
            java.lang.String r7 = "filling"
            java.lang.String r8 = "(Lcom/tencent/mm/storage/BizTimeLineInfo;ILandroid/view/View;Landroid/view/View;)Landroid/view/View;"
            java.lang.String r16 = "android/view/View_EXEC_"
            java.lang.String r17 = "setVisibility"
            java.lang.String r18 = "(I)V"
            r4 = r3
            r12 = r9
            r9 = r16
            r13 = r10
            r10 = r17
            r0 = 0
            r11 = r18
            j20.C117292a.m165358d(r4, r5, r6, r7, r8, r9, r10, r11)
            java.lang.Object r4 = r12.mo10231a(r0)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            r3.setVisibility(r4)
            java.lang.String r5 = "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecCardOld"
            java.lang.String r6 = "filling"
            java.lang.String r7 = "(Lcom/tencent/mm/storage/BizTimeLineInfo;ILandroid/view/View;Landroid/view/View;)Landroid/view/View;"
            java.lang.String r8 = "android/view/View_EXEC_"
            java.lang.String r9 = "setVisibility"
            java.lang.String r10 = "(I)V"
            r4 = r3
            j20.C117292a.m165359e(r4, r5, r6, r7, r8, r9, r10)
            android.widget.TextView r4 = r14.f50556p
            java.lang.String r5 = r13.f64239d
            r4.setText(r5)
            android.widget.TextView r4 = r14.f50830i
            android.text.TextPaint r4 = r4.getPaint()
            r5 = 1
            r4.setFakeBoldText(r5)
            android.widget.ImageView r4 = r14.f50829h
            te3.oe4 r6 = r13.f64240e
            java.lang.String r6 = r6.f64339i
            hc0.c$b r7 = new hc0.c$b
            r7.<init>()
            r8 = 2131231376(0x7f080290, float:1.8078831E38)
            r7.f59361q = r8
            r7.f59347c = r5
            r7.f59364t = r5
            gc0.a r5 = gc0.C20828a.m22825b()
            hc0.c r7 = r7.mo32666a()
            r5.mo32519h(r6, r4, r7)
            android.widget.TextView r4 = r14.f50830i
            te3.oe4 r5 = r13.f64240e
            java.lang.String r5 = r5.f64335e
            r4.setText(r5)
            android.widget.TextView r4 = r14.f50560t
            te3.oe4 r5 = r13.f64240e
            java.lang.String r5 = r5.f64337g
            r4.setText(r5)
            com.tencent.mm.ui.widget.MMNeat7extView r4 = r14.f50561u
            te3.oe4 r5 = r13.f64240e
            java.lang.String r5 = r5.f64338h
            r4.mo104279b(r5)
            te3.oe4 r4 = r13.f64240e
            java.lang.String r4 = r4.f64334d
            java.lang.Class<f62.k0> r5 = f62.C75700k0.class
            k40.a r5 = f40.C86709a0.m107533q(r5)
            f62.k0 r5 = (f62.C75700k0) r5
            com.tencent.mm.storage.u3 r5 = r5.mo96097Ni()
            com.tencent.mm.storage.z1 r5 = r5.get(r4)
            if (r5 == 0) goto L_0x0334
            long r5 = r5.f108320R1
            int r6 = (int) r5
            if (r6 > 0) goto L_0x033e
        L_0x0334:
            eb0.w2 r5 = eb0.C31519v2.m39436a()
            r6 = 0
            java.lang.String r7 = ""
            r5.mo55988e(r4, r7, r6)
        L_0x033e:
            android.view.View r5 = r14.f50559s
            com.tencent.mm.plugin.brandservice.ui.timeline.item.e2 r6 = new com.tencent.mm.plugin.brandservice.ui.timeline.item.e2
            r6.<init>(r14, r4, r1)
            r5.setOnClickListener(r6)
            java.util.LinkedList<te3.ne4> r4 = r13.f64242g
            java.lang.String r5 = "MicroMsg.BizTimeLineItem"
            if (r4 == 0) goto L_0x0440
            java.lang.Object r4 = r4.get(r0)
            if (r4 == 0) goto L_0x0440
            java.util.LinkedList<te3.ne4> r4 = r13.f64242g
            java.lang.Object r4 = r4.get(r0)
            te3.ne4 r4 = (te3.ne4) r4
            int r4 = r4.f64281d
            r6 = 1
            r4 = r4 & r6
            if (r4 != 0) goto L_0x0440
            java.util.LinkedList<te3.ne4> r4 = r13.f64242g
            java.lang.Object r4 = r4.get(r0)
            te3.ne4 r4 = (te3.ne4) r4
            android.view.View r6 = r14.f50562v
            k20.a r7 = new k20.a
            r7.<init>()
            java.lang.Integer r8 = java.lang.Integer.valueOf(r0)
            r7.mo10233c(r8)
            java.lang.Object[] r17 = r7.mo10232b()
            java.lang.String r18 = "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecCardOld"
            java.lang.String r19 = "filling"
            java.lang.String r20 = "(Lcom/tencent/mm/storage/BizTimeLineInfo;ILandroid/view/View;Landroid/view/View;)Landroid/view/View;"
            java.lang.String r21 = "android/view/View_EXEC_"
            java.lang.String r22 = "setVisibility"
            java.lang.String r23 = "(I)V"
            r16 = r6
            j20.C117292a.m165358d(r16, r17, r18, r19, r20, r21, r22, r23)
            java.lang.Object r7 = r7.mo10231a(r0)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            r6.setVisibility(r7)
            java.lang.String r7 = "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecCardOld"
            java.lang.String r8 = "filling"
            java.lang.String r9 = "(Lcom/tencent/mm/storage/BizTimeLineInfo;ILandroid/view/View;Landroid/view/View;)Landroid/view/View;"
            java.lang.String r10 = "android/view/View_EXEC_"
            java.lang.String r11 = "setVisibility"
            java.lang.String r12 = "(I)V"
            j20.C117292a.m165359e(r6, r7, r8, r9, r10, r11, r12)
            android.view.View r6 = r14.f50555o
            k20.a r7 = new k20.a
            r7.<init>()
            java.lang.Integer r8 = java.lang.Integer.valueOf(r0)
            r7.mo10233c(r8)
            java.lang.Object[] r17 = r7.mo10232b()
            java.lang.String r18 = "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecCardOld"
            java.lang.String r19 = "filling"
            java.lang.String r20 = "(Lcom/tencent/mm/storage/BizTimeLineInfo;ILandroid/view/View;Landroid/view/View;)Landroid/view/View;"
            java.lang.String r21 = "android/view/View_EXEC_"
            java.lang.String r22 = "setVisibility"
            java.lang.String r23 = "(I)V"
            r16 = r6
            j20.C117292a.m165358d(r16, r17, r18, r19, r20, r21, r22, r23)
            java.lang.Object r7 = r7.mo10231a(r0)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            r6.setVisibility(r7)
            java.lang.String r17 = "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecCardOld"
            java.lang.String r18 = "filling"
            java.lang.String r19 = "(Lcom/tencent/mm/storage/BizTimeLineInfo;ILandroid/view/View;Landroid/view/View;)Landroid/view/View;"
            java.lang.String r20 = "android/view/View_EXEC_"
            java.lang.String r21 = "setVisibility"
            java.lang.String r22 = "(I)V"
            j20.C117292a.m165359e(r16, r17, r18, r19, r20, r21, r22)
            android.widget.TextView r6 = r14.f50563w
            java.lang.String r7 = r13.f64241f
            r6.setText(r7)
            com.tencent.mm.ui.widget.MMNeat7extView r6 = r14.f50564x
            java.lang.String r7 = r4.f64282e
            r6.mo104279b(r7)
            android.view.View r6 = r14.f50562v
            com.tencent.mm.plugin.brandservice.ui.timeline.item.f2 r7 = new com.tencent.mm.plugin.brandservice.ui.timeline.item.f2
            r7.<init>(r14, r1, r4)
            r6.setOnClickListener(r7)
            android.view.View r6 = r14.f50559s
            r7 = 2131231308(0x7f08024c, float:1.8078693E38)
            r6.setBackgroundResource(r7)
            r6 = 90
            k40.a r7 = f40.C86709a0.m107533q(r15)
            ex0.d r7 = (ex0.C45696d) r7
            r8 = 1
            boolean r7 = r7.mo70957E5(r8)
            if (r7 == 0) goto L_0x04da
            java.lang.String r7 = r4.f64284g
            boolean r7 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r7)
            if (r7 != 0) goto L_0x04da
            java.lang.Object[] r7 = new java.lang.Object[r8]
            java.lang.String r8 = r4.f64284g
            r7[r0] = r8
            java.lang.String r8 = "preload %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r5, r8, r7)
            k40.a r7 = f40.C86709a0.m107533q(r15)
            ex0.d r7 = (ex0.C45696d) r7
            java.lang.String r8 = r4.f64284g
            int r4 = r4.f64288n
            java.lang.Object[] r9 = new java.lang.Object[r0]
            r7.Tn0(r8, r4, r6, r9)
            goto L_0x04da
        L_0x0440:
            r17 = 1149(0x47d, double:5.677E-321)
            r19 = 6
            r21 = 1
            r23 = 0
            r16 = r24
            r16.idkeyStat(r17, r19, r21, r23)
            android.view.View r6 = r14.f50555o
            k20.a r4 = new k20.a
            r4.<init>()
            r7 = 8
            java.lang.Integer r8 = java.lang.Integer.valueOf(r7)
            r4.mo10233c(r8)
            java.lang.Object[] r26 = r4.mo10232b()
            java.lang.String r27 = "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecCardOld"
            java.lang.String r28 = "filling"
            java.lang.String r29 = "(Lcom/tencent/mm/storage/BizTimeLineInfo;ILandroid/view/View;Landroid/view/View;)Landroid/view/View;"
            java.lang.String r30 = "android/view/View_EXEC_"
            java.lang.String r31 = "setVisibility"
            java.lang.String r32 = "(I)V"
            r25 = r6
            j20.C117292a.m165358d(r25, r26, r27, r28, r29, r30, r31, r32)
            java.lang.Object r4 = r4.mo10231a(r0)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            r6.setVisibility(r4)
            java.lang.String r7 = "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecCardOld"
            java.lang.String r8 = "filling"
            java.lang.String r9 = "(Lcom/tencent/mm/storage/BizTimeLineInfo;ILandroid/view/View;Landroid/view/View;)Landroid/view/View;"
            java.lang.String r10 = "android/view/View_EXEC_"
            java.lang.String r11 = "setVisibility"
            java.lang.String r12 = "(I)V"
            j20.C117292a.m165359e(r6, r7, r8, r9, r10, r11, r12)
            android.view.View r4 = r14.f50562v
            k20.a r6 = new k20.a
            r6.<init>()
            r7 = 8
            java.lang.Integer r8 = java.lang.Integer.valueOf(r7)
            r6.mo10233c(r8)
            java.lang.Object[] r16 = r6.mo10232b()
            java.lang.String r17 = "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecCardOld"
            java.lang.String r18 = "filling"
            java.lang.String r19 = "(Lcom/tencent/mm/storage/BizTimeLineInfo;ILandroid/view/View;Landroid/view/View;)Landroid/view/View;"
            java.lang.String r20 = "android/view/View_EXEC_"
            java.lang.String r21 = "setVisibility"
            java.lang.String r22 = "(I)V"
            r15 = r4
            j20.C117292a.m165358d(r15, r16, r17, r18, r19, r20, r21, r22)
            java.lang.Object r6 = r6.mo10231a(r0)
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            r4.setVisibility(r6)
            java.lang.String r16 = "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecCardOld"
            java.lang.String r17 = "filling"
            java.lang.String r18 = "(Lcom/tencent/mm/storage/BizTimeLineInfo;ILandroid/view/View;Landroid/view/View;)Landroid/view/View;"
            java.lang.String r19 = "android/view/View_EXEC_"
            java.lang.String r20 = "setVisibility"
            java.lang.String r21 = "(I)V"
            j20.C117292a.m165359e(r15, r16, r17, r18, r19, r20, r21)
            android.view.View r4 = r14.f50559s
            r6 = 2131231301(0x7f080245, float:1.807868E38)
            r4.setBackgroundResource(r6)
        L_0x04da:
            fy0.C20739g.m22690b(r35)
            te3.re4 r4 = r35.mo25774x2()
            if (r4 != 0) goto L_0x04e5
            goto L_0x060a
        L_0x04e5:
            te3.qe4 r6 = r13.f64245j
            if (r6 != 0) goto L_0x04ef
            java.lang.String r6 = "[TRACE_BIZRECCARD] shouldShowNegativeFeedback recCardUserInfo = null"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r6)
            goto L_0x0511
        L_0x04ef:
            te3.ie0 r6 = r6.f185009e
            if (r6 != 0) goto L_0x04f9
            java.lang.String r6 = "[TRACE_BIZRECCARD] shouldShowNegativeFeedback recCardUserInfo.FeedbackInfo = null"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r6)
            goto L_0x0511
        L_0x04f9:
            int r7 = r6.f183683e
            r8 = 1
            if (r7 == r8) goto L_0x0504
            java.lang.String r6 = "[TRACE_BIZRECCARD] shouldShowNegativeFeedback recCardUserInfo.FeedbackInfo.ShowNegativeFeedbackReason != 1"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r6)
            goto L_0x0511
        L_0x0504:
            java.util.LinkedList<java.lang.String> r6 = r6.f183682d
            boolean r6 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.util.List) r6)
            if (r6 == 0) goto L_0x0513
            java.lang.String r6 = "[TRACE_BIZRECCARD] shouldShowNegativeFeedback recCardUserInfo.FeedbackInfo.NegativeFeedbackReason null"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r6)
        L_0x0511:
            r11 = 0
            goto L_0x0514
        L_0x0513:
            r11 = 1
        L_0x0514:
            if (r11 != 0) goto L_0x0570
            java.util.LinkedList<java.lang.String> r4 = r4.f64520i
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.util.List) r4)
            if (r4 == 0) goto L_0x0570
            r4 = 1
            java.lang.Object[] r1 = new java.lang.Object[r4]
            te3.oe4 r2 = r13.f64240e
            java.lang.String r2 = r2.f64335e
            r1[r0] = r2
            java.lang.String r2 = "[TRACE_BIZRECCARD] hideNegativeFeedback，BizNickName = %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r2, r1)
            android.view.View r1 = r14.f50557q
            k20.a r2 = new k20.a
            r2.<init>()
            r4 = 8
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r2.mo10233c(r4)
            java.lang.Object[] r7 = r2.mo10232b()
            java.lang.String r8 = "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecCardOld"
            java.lang.String r9 = "filling"
            java.lang.String r10 = "(Lcom/tencent/mm/storage/BizTimeLineInfo;ILandroid/view/View;Landroid/view/View;)Landroid/view/View;"
            java.lang.String r11 = "android/view/View_EXEC_"
            java.lang.String r12 = "setVisibility"
            java.lang.String r13 = "(I)V"
            r6 = r1
            j20.C117292a.m165358d(r6, r7, r8, r9, r10, r11, r12, r13)
            java.lang.Object r0 = r2.mo10231a(r0)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            r1.setVisibility(r0)
            java.lang.String r7 = "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecCardOld"
            java.lang.String r8 = "filling"
            java.lang.String r9 = "(Lcom/tencent/mm/storage/BizTimeLineInfo;ILandroid/view/View;Landroid/view/View;)Landroid/view/View;"
            java.lang.String r10 = "android/view/View_EXEC_"
            java.lang.String r11 = "setVisibility"
            java.lang.String r12 = "(I)V"
            j20.C117292a.m165359e(r6, r7, r8, r9, r10, r11, r12)
            goto L_0x060a
        L_0x0570:
            r4 = 1
            java.lang.Object[] r4 = new java.lang.Object[r4]
            te3.oe4 r6 = r13.f64240e
            java.lang.String r6 = r6.f64335e
            r4[r0] = r6
            java.lang.String r6 = "[TRACE_BIZRECCARD] showNegativeFeedback，BizNickName = %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r6, r4)
            android.view.View r7 = r14.f50557q
            k20.a r4 = new k20.a
            r4.<init>()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r0)
            r4.mo10233c(r5)
            java.lang.Object[] r16 = r4.mo10232b()
            java.lang.String r17 = "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecCardOld"
            java.lang.String r18 = "filling"
            java.lang.String r19 = "(Lcom/tencent/mm/storage/BizTimeLineInfo;ILandroid/view/View;Landroid/view/View;)Landroid/view/View;"
            java.lang.String r20 = "android/view/View_EXEC_"
            java.lang.String r21 = "setVisibility"
            java.lang.String r22 = "(I)V"
            r15 = r7
            j20.C117292a.m165358d(r15, r16, r17, r18, r19, r20, r21, r22)
            java.lang.Object r0 = r4.mo10231a(r0)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            r7.setVisibility(r0)
            java.lang.String r8 = "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecCardOld"
            java.lang.String r9 = "filling"
            java.lang.String r10 = "(Lcom/tencent/mm/storage/BizTimeLineInfo;ILandroid/view/View;Landroid/view/View;)Landroid/view/View;"
            java.lang.String r11 = "android/view/View_EXEC_"
            java.lang.String r12 = "setVisibility"
            java.lang.String r13 = "(I)V"
            j20.C117292a.m165359e(r7, r8, r9, r10, r11, r12, r13)
            android.view.View r0 = r14.f50557q
            com.tencent.mm.plugin.brandservice.ui.timeline.item.g2 r4 = new com.tencent.mm.plugin.brandservice.ui.timeline.item.g2
            r4.<init>(r14, r1, r2)
            r0.setOnClickListener(r4)
            goto L_0x060a
        L_0x05c9:
            r0 = 0
            k20.a r1 = new k20.a
            r1.<init>()
            r2 = 8
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r1.mo10233c(r2)
            java.lang.Object[] r5 = r1.mo10232b()
            java.lang.String r6 = "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecCardOld"
            java.lang.String r7 = "filling"
            java.lang.String r8 = "(Lcom/tencent/mm/storage/BizTimeLineInfo;ILandroid/view/View;Landroid/view/View;)Landroid/view/View;"
            java.lang.String r9 = "android/view/View_EXEC_"
            java.lang.String r10 = "setVisibility"
            java.lang.String r11 = "(I)V"
            r4 = r3
            j20.C117292a.m165358d(r4, r5, r6, r7, r8, r9, r10, r11)
            java.lang.Object r0 = r1.mo10231a(r0)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            r3.setVisibility(r0)
            java.lang.String r5 = "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecCardOld"
            java.lang.String r6 = "filling"
            java.lang.String r7 = "(Lcom/tencent/mm/storage/BizTimeLineInfo;ILandroid/view/View;Landroid/view/View;)Landroid/view/View;"
            java.lang.String r8 = "android/view/View_EXEC_"
            java.lang.String r9 = "setVisibility"
            java.lang.String r10 = "(I)V"
            j20.C117292a.m165359e(r4, r5, r6, r7, r8, r9, r10)
        L_0x060a:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.brandservice.p028ui.timeline.C18508z2.mo23153k(com.tencent.mm.storage.o0, int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    /* renamed from: l */
    public final View mo23154l(C19623o0 o0Var, int i, View view, ViewGroup viewGroup) {
        View view2;
        C18311l4 l4Var;
        boolean z;
        C22508lo3 lo32;
        C19623o0 o0Var2 = o0Var;
        int i2 = i;
        boolean z2 = true;
        f51410J = true;
        if (view == null) {
            l4Var = new C18311l4(this.f51436d, this);
            view2 = l4Var.f50665e;
            view2.setTag(l4Var);
        } else {
            Object tag = view.getTag();
            C87412m.m108592e(tag, "null cannot be cast to non-null type com.tencent.mm.plugin.brandservice.ui.timeline.item.BizTlRecFeedCard");
            l4Var = (C18311l4) tag;
            view2 = view;
        }
        C19623o0 q = getItem(i2 - 1);
        C87412m.m108594g(o0Var2, "info");
        C22508lo3 lo33 = o0Var2.f55539x1;
        int i3 = 0;
        if (lo33 == null) {
            Log.m105924i("MicroMsg.BizTlRecFeedCard", "[TRACE_BIZRECFEED] recFeed is null");
            C18366u2[] u2VarArr = l4Var.f50664d;
            int length = u2VarArr.length;
            while (i3 < length) {
                u2VarArr[i3].mo22838d();
                i3++;
            }
        } else {
            int i4 = lo33.f64173f;
            C88334c cVar = C19613h1.f55490a;
            switch (i4) {
                case 2001:
                case 2002:
                case 2003:
                case 2004:
                    z = true;
                    break;
                default:
                    z = false;
                    break;
            }
            if (!z) {
                Log.m105924i("MicroMsg.BizTlRecFeedCard", "[TRACE_BIZRECFEED] style = " + o0Var2.f55539x1.f64173f + " not support");
                C18366u2[] u2VarArr2 = l4Var.f50664d;
                int length2 = u2VarArr2.length;
                while (i3 < length2) {
                    u2VarArr2[i3].mo22838d();
                    i3++;
                }
            } else {
                C87412m.m108593f(lo33, "info.recFeed");
                if (!C19613h1.m21044q(lo33)) {
                    Log.m105924i("MicroMsg.BizTlRecFeedCard", "[TRACE_BIZRECFEED] recFeed is illegal");
                    C18366u2[] u2VarArr3 = l4Var.f50664d;
                    int length3 = u2VarArr3.length;
                    while (i3 < length3) {
                        u2VarArr3[i3].mo22838d();
                        i3++;
                    }
                } else {
                    o0Var2.field_isRead = 1;
                    C22508lo3 lo34 = o0Var2.f55539x1;
                    if (lo34 != null && lo34.f64173f == 2004) {
                        View view3 = (View) ((C36570n) l4Var.f50666f).getValue();
                        C9556a aVar = new C9556a();
                        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                        aVar.mo10233c(8);
                        View view4 = view3;
                        C117292a.m165358d(view4, aVar.mo10232b(), "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTlRecFeedCard", "hideLineAndGap", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view3.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                        C117292a.m165359e(view4, "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTlRecFeedCard", "hideLineAndGap", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        l4Var.f50665e.setPadding(0, 0, 0, 0);
                    } else {
                        if (lo34.f64184t == 0) {
                            if (q != null && q.mo25759G2()) {
                                C22508lo3 lo35 = q.f55539x1;
                                if (lo35 == null || lo35.f64184t != 0) {
                                    z2 = false;
                                }
                                if (z2) {
                                    View view5 = (View) ((C36570n) l4Var.f50666f).getValue();
                                    C9556a aVar2 = new C9556a();
                                    ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                                    aVar2.mo10233c(0);
                                    View view6 = view5;
                                    C117292a.m165358d(view6, aVar2.mo10232b(), "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTlRecFeedCard", "showLine", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                    view5.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                                    C117292a.m165359e(view6, "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTlRecFeedCard", "showLine", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                    l4Var.f50665e.setPadding(0, 0, 0, 0);
                                }
                            }
                        }
                        View view7 = (View) ((C36570n) l4Var.f50666f).getValue();
                        C9556a aVar3 = new C9556a();
                        ThreadLocal<C9556a> threadLocal3 = C60958c.f173611a;
                        aVar3.mo10233c(8);
                        View view8 = view7;
                        C117292a.m165358d(view8, aVar3.mo10232b(), "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTlRecFeedCard", "showGap", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view7.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                        C117292a.m165359e(view8, "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTlRecFeedCard", "showGap", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        l4Var.f50665e.setPadding(0, f51423X, 0, 0);
                    }
                    C115669n.INSTANCE.idkeyStat(1590, 20, 1, false);
                    for (C18366u2 u2Var : l4Var.f50664d) {
                        if (((!o0Var.mo25759G2() || (lo32 = o0Var2.f55539x1) == null) ? -1 : lo32.f64173f) != u2Var.mo22837b()) {
                            u2Var.mo22838d();
                        } else {
                            u2Var.mo22839g();
                            u2Var.mo22815a(o0Var2, i2, view2, l4Var.f50665e);
                        }
                    }
                    if (o0Var2.f55528m1) {
                        o0Var2.f55528m1 = false;
                        l4Var.f50665e.setBackgroundColor(C76577a.m92153d(l4Var.f50663c, C0966R.color.al6));
                        l4Var.f50665e.findViewById(C0966R.C0970id.iew).startAnimation(AnimationUtils.loadAnimation(l4Var.f50663c, C0966R.C0968anim.f2357al));
                    }
                }
            }
        }
        o0Var2.f55524i1 = this.f51440h.indexOf(o0Var2);
        return view2;
    }

    /* renamed from: n */
    public final void mo23155n(List<? extends C19623o0> list) {
        LinkedList linkedList = new LinkedList();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (!mo23157o((C19623o0) list.get(i))) {
                linkedList.add(list.get(i));
            }
        }
        this.f51439g.addAll(linkedList);
        Log.m105925i("MicroMsg.BizTimeLineAdapter", "alvinluo filterAndAddList size: %d/%d", Integer.valueOf(list.size()), Integer.valueOf(linkedList.size()));
    }

    public void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        Log.m105918d("MicroMsg.BizTimeLineAdapter", "notifyDataSetChanged");
    }

    /* renamed from: o */
    public final boolean mo23157o(C19623o0 o0Var) {
        int i;
        Long l = null;
        Long valueOf = o0Var != null ? Long.valueOf(o0Var.mo25767q2()) : null;
        C19623o0 p = mo23159p();
        if (p != null) {
            l = Long.valueOf(p.mo25767q2());
        }
        if (!C87412m.m108589b(valueOf, l)) {
            return false;
        }
        return o0Var == null || (i = o0Var.field_type) == 34 || i == 3;
    }

    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        C87412m.m108594g(contextMenu, "menu");
        C87412m.m108594g(view, "v");
        C87412m.m108594g(contextMenuInfo, "menuInfo");
    }

    /* renamed from: p */
    public final C19623o0 mo23159p() {
        if (this.f51439g.size() > 0) {
            return this.f51439g.get(0);
        }
        return null;
    }

    /* renamed from: q */
    public C19623o0 getItem(int i) {
        int size;
        if (i < ((LinkedList) this.f51439g).size() && i >= 0) {
            return (C19623o0) ((LinkedList) this.f51439g).get(i);
        }
        if (!f51409I.mo23169c()) {
            return null;
        }
        if (i == ((LinkedList) this.f51439g).size()) {
            return this.f51441i;
        }
        if (this.f51440h.size() <= 0 || (i - ((LinkedList) this.f51439g).size()) - 1 >= this.f51440h.size() || size < 0) {
            return null;
        }
        return this.f51440h.get(size);
    }

    /* renamed from: r */
    public final C19623o0 mo23161r() {
        if (((LinkedList) this.f51439g).size() <= 0) {
            return null;
        }
        List<C19623o0> list = this.f51439g;
        return (C19623o0) ((LinkedList) list).get(((LinkedList) list).size() - 1);
    }

    /* renamed from: s */
    public final void mo23162s(C18353s3 s3Var, C19623o0 o0Var) {
        int i;
        C18353s3 s3Var2 = s3Var;
        C19623o0 o0Var2 = o0Var;
        Class cls = C76979h.class;
        Class cls2 = C61212e.class;
        C87412m.m108594g(s3Var2, "slot");
        C87412m.m108594g(o0Var2, "info");
        ((C76705f) C86312j.m106911c(C76705f.class)).mo106822J5(s3Var2.f50829h, o0Var2.field_talker);
        String displayName = ((C75339i) C86312j.m106911c(C75339i.class)).getDisplayName(o0Var2.field_talker);
        C72996z1 z1Var = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().get(o0Var2.field_talker);
        if (z1Var == null || !z1Var.mo62940x3()) {
            s3Var2.f50830i.setText(((C76979h) C86312j.m106911c(cls)).yp0(this.f51436d, displayName, s3Var2.f50830i.getTextSize()));
        } else {
            Drawable drawable = this.f51436d.getResources().getDrawable(C0966R.C0969drawable.bwa);
            int textSize = (int) s3Var2.f50830i.getTextSize();
            drawable.setBounds(0, 0, textSize, textSize);
            C76003c cVar = new C76003c(drawable, 1);
            SpannableString spannableString = new SpannableString("@");
            spannableString.setSpan(cVar, 0, 1, 33);
            s3Var2.f50830i.setText(TextUtils.concat(new CharSequence[]{((C76979h) C86312j.m106911c(cls)).yp0(this.f51436d, displayName, s3Var2.f50830i.getTextSize()).toString() + ' ', spannableString}));
        }
        if (z1Var != null && z1Var.mo62940x3()) {
            displayName = displayName + 65292 + this.f51436d.getString(C0966R.string.f361428ju1);
        }
        s3Var2.f50830i.setContentDescription(displayName);
        C8219i.f27144a.mo9271b(s3Var2.f50830i);
        View view = s3Var2.f50832k;
        if (view != null) {
            C19428d dVar = C19428d.f54856a;
            if (!((Boolean) ((C36570n) C19428d.f54865j).getValue()).booleanValue() || !dVar.mo25185t(o0Var2.field_talker)) {
                i = 8;
            } else {
                View view2 = s3Var2.f50832k;
                if (view2 != null) {
                    ((C61212e) C86312j.m106911c(cls2)).o30(view2, "living_label_biz_timeline_cell");
                    ((C61212e) C86312j.m106911c(cls2)).mo86175pO(view2, 40, 26236);
                    ((C61212e) C86312j.m106911c(cls2)).mo86149PM(view2, C90364q0.m113147f(new C13604l("feed_id", "0"), new C13604l("live_id", ""), new C13604l("comment_scene", ""), new C13604l("finder_username", ""), new C13604l("session_buffer", " "), new C13604l("wx_username", o0Var2.field_talker)));
                    ((C61212e) C86312j.m106911c(cls2)).E60(view2, new C18512d(o0Var2));
                }
                C7007c1.m7257b(s3Var2.f50832k, 0.5f);
                o0Var2.f55526k1 = System.currentTimeMillis();
                String str = o0Var2.field_msgId + '_' + o0Var2.field_talker;
                HashSet<String> hashSet = C19428d.f54875t;
                if (!hashSet.contains(str)) {
                    hashSet.add(str);
                    ((C119157j) C119157j.f356862d).mo183879j(new C19445g(o0Var2, C19636w0.f55626c), 3000, "BizTimeLineExpose");
                }
                View view3 = s3Var2.f50832k;
                if (view3 != null) {
                    view3.setOnClickListener(new C18513e(o0Var2, this));
                }
                i = 0;
            }
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(Integer.valueOf(i));
            View view4 = view;
            C117292a.m165358d(view4, aVar.mo10232b(), "com/tencent/mm/plugin/brandservice/ui/timeline/BizTimeLineAdapter", "initHeader", "(Lcom/tencent/mm/plugin/brandservice/ui/timeline/item/BizTimeLineItem;Lcom/tencent/mm/storage/BizTimeLineInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view4, "com/tencent/mm/plugin/brandservice/ui/timeline/BizTimeLineAdapter", "initHeader", "(Lcom/tencent/mm/plugin/brandservice/ui/timeline/item/BizTimeLineItem;Lcom/tencent/mm/storage/BizTimeLineInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        s3Var2.f50828g.setTag(o0Var2);
        s3Var2.f50828g.setOnClickListener(this.f51432E);
        s3Var2.f50831j.setVisibility(0);
        if (C19636w0.m21172n()) {
            s3Var2.f50831j.setText(C8218c.m8301a(this.f51436d, o0Var2.field_createTime));
        } else {
            s3Var2.f50831j.setText(Util.nullAsNil(o0Var2.field_recommendReason));
            C46746a aVar2 = C46746a.f125826a;
            TextView textView = s3Var2.f50831j;
            C87412m.m108593f(textView, "slot.timeTV");
            textView.setFilters(new InputFilter[]{new InputFilter.LengthFilter(8)});
        }
        s3Var2.f50828g.setOnLongClickListener(new C18514f(this, o0Var2));
    }

    /* renamed from: t */
    public final void mo23163t(int i) {
        if (i == getCount() - 1 && !this.f51434G) {
            ((C119157j) C119157j.f356862d).mo183895z(new C18515g(i, this));
        }
        if (C19636w0.m21171m() && !this.f51438f && !this.f51429B) {
            int i2 = this.f51430C - i;
            int decodeInt = C20583z.f57949a.mo32230c().decodeInt("BizTLRecommendFeedsTimingPreload", 5);
            if (i2 <= decodeInt || this.f51430C == 0 || decodeInt <= 0) {
                Log.m105924i("MicroMsg.BizTimeLineAdapter", "load first screen feeds");
                this.f51429B = true;
                C18509a.m19195b(f51409I, this, C20583z.C20585c.GET_RECOMMEND_FEEDS_SCENE_ENTER, this.f51428A, (C64635po3) null, 8, (Object) null);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:40:0x009f  */
    /* renamed from: u */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo23164u() {
        /*
            r9 = this;
            com.tencent.mm.plugin.brandservice.ui.timeline.z2$a r0 = f51409I
            boolean r1 = r0.mo23169c()
            r2 = 1
            if (r1 == 0) goto L_0x0016
            boolean r1 = qx0.C22136a.f62620c
            if (r1 == 0) goto L_0x0016
            com.tencent.mm.plugin.brandservice.ui.timeline.z2$h r0 = new com.tencent.mm.plugin.brandservice.ui.timeline.z2$h
            r0.<init>(r9)
            o40.C61926c.m72668M(r0)
            return r2
        L_0x0016:
            com.tencent.mm.storage.p0 r1 = rb0.C48009v0.Jx0()
            r3 = 10
            com.tencent.mm.storage.o0 r4 = r9.mo23161r()
            if (r4 == 0) goto L_0x0025
            long r4 = r4.field_orderFlag
            goto L_0x002a
        L_0x0025:
            r4 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
        L_0x002a:
            java.util.List r1 = r1.mo25813uP(r3, r4)
            boolean r3 = com.tencent.p014mm.storage.C19636w0.m21171m()
            r4 = 0
            if (r3 == 0) goto L_0x0069
            boolean r3 = qx0.C22136a.f62619b
            if (r3 != 0) goto L_0x0069
            boolean r3 = r1.isEmpty()
            if (r3 == 0) goto L_0x0069
            boolean r3 = r9.f51435H
            if (r3 == 0) goto L_0x0069
            java.util.List<com.tencent.mm.storage.o0> r0 = r9.f51440h
            if (r0 == 0) goto L_0x004d
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x004e
        L_0x004d:
            r4 = 1
        L_0x004e:
            if (r4 == 0) goto L_0x0058
            com.tencent.mm.plugin.brandservice.ui.timeline.z2$i r0 = new com.tencent.mm.plugin.brandservice.ui.timeline.z2$i
            r0.<init>(r9)
            o40.C61926c.m72668M(r0)
        L_0x0058:
            qx0.C22136a.f62619b = r2
            qx0.C22136a.f62621d = r2
            qx0.C22136a.f62620c = r2
            r9.notifyDataSetChanged()
            java.lang.String r0 = "MicroMsg.BizTimeLineAdapter"
            java.lang.String r1 = "loadMoreData allMsgEnd"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
            return r2
        L_0x0069:
            boolean r0 = r0.mo23169c()
            if (r0 == 0) goto L_0x00cc
            boolean r0 = qx0.C22136a.f62620c
            if (r0 != 0) goto L_0x00cc
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x00ca
            com.tencent.mm.storage.o0 r0 = r9.mo23159p()
            if (r0 == 0) goto L_0x009b
            r3 = r1
            java.util.LinkedList r3 = (java.util.LinkedList) r3
            int r5 = r3.size()
            int r5 = r5 - r2
            java.lang.Object r3 = r3.get(r5)
            com.tencent.mm.storage.o0 r3 = (com.tencent.p014mm.storage.C19623o0) r3
            long r5 = r3.mo25767q2()
            long r7 = r0.mo25767q2()
            int r0 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r0 != 0) goto L_0x009b
            r0 = 1
            goto L_0x009c
        L_0x009b:
            r0 = 0
        L_0x009c:
            if (r0 != 0) goto L_0x009f
            goto L_0x00ca
        L_0x009f:
            eb0.z$b r0 = eb0.C20583z.f57949a
            int r0 = r0.mo32233g()
            r3 = r1
            java.util.LinkedList r3 = (java.util.LinkedList) r3
            int r3 = r3.size()
            java.util.List<com.tencent.mm.storage.o0> r5 = r9.f51439g
            java.util.LinkedList r5 = (java.util.LinkedList) r5
            int r5 = r5.size()
            int r3 = r3 + r5
            if (r3 < r0) goto L_0x00cc
            qx0.C22136a.f62620c = r2
            java.util.List<com.tencent.mm.storage.o0> r3 = r9.f51439g
            java.util.LinkedList r3 = (java.util.LinkedList) r3
            int r3 = r3.size()
            int r0 = r0 - r3
            if (r0 >= r2) goto L_0x00c5
            r0 = 1
        L_0x00c5:
            java.util.List r1 = sx3.C110818d0.m150947s0(r1, r0)
            goto L_0x00cc
        L_0x00ca:
            qx0.C22136a.f62620c = r2
        L_0x00cc:
            r9.mo23155n(r1)
            com.tencent.mm.plugin.brandservice.ui.timeline.z2$j r0 = new com.tencent.mm.plugin.brandservice.ui.timeline.z2$j
            r0.<init>(r9)
            java.util.Map<java.lang.Long, java.lang.Integer> r3 = fy0.C20739g.f58625a
            android.os.MessageQueue r3 = android.os.Looper.myQueue()
            fy0.e r5 = new fy0.e
            r5.<init>(r1, r0)
            r3.addIdleHandler(r5)
            r9.notifyDataSetChanged()
            int r0 = r1.size()
            if (r0 <= 0) goto L_0x00ec
            goto L_0x00ed
        L_0x00ec:
            r2 = 0
        L_0x00ed:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.brandservice.p028ui.timeline.C18508z2.mo23164u():boolean");
    }

    /* renamed from: v */
    public final void mo23165v() {
        this.f51434G = true;
        BizTimeLineUI bizTimeLineUI = this.f51436d;
        if (!bizTimeLineUI.isFinishing() && bizTimeLineUI.f50236g != null) {
            View view = (View) bizTimeLineUI.mo176895$(C0966R.C0970id.f357542ae0);
            if (view == null) {
                Log.m105928w("MicroMsg.BizTimeLineUI", "noMoreData loadingLayout is null");
                return;
            }
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/brandservice/ui/timeline/BizTimeLineUI", "noMoreData", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/brandservice/ui/timeline/BizTimeLineUI", "noMoreData", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            View view2 = (View) bizTimeLineUI.mo176895$(C0966R.C0970id.ae9);
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(0);
            C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/brandservice/ui/timeline/BizTimeLineUI", "noMoreData", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/brandservice/ui/timeline/BizTimeLineUI", "noMoreData", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            TextView textView = (TextView) bizTimeLineUI.mo176895$(C0966R.C0970id.ae8);
            if (f51409I.mo23169c()) {
                textView.setText(bizTimeLineUI.getString(C0966R.string.ap_));
                C115669n.INSTANCE.idkeyStat(1590, 15, 1, false);
                return;
            }
            textView.setText(bizTimeLineUI.getString(C0966R.string.apa));
        }
    }

    /* renamed from: w */
    public final void mo23166w() {
        this.f51434G = false;
        BizTimeLineUI bizTimeLineUI = this.f51436d;
        if (!bizTimeLineUI.isFinishing() && bizTimeLineUI.f50236g != null) {
            View view = (View) bizTimeLineUI.mo176895$(C0966R.C0970id.f357542ae0);
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/brandservice/ui/timeline/BizTimeLineUI", "resetNoMoreData", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/brandservice/ui/timeline/BizTimeLineUI", "resetNoMoreData", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            View view2 = (View) bizTimeLineUI.mo176895$(C0966R.C0970id.ae9);
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(8);
            View view3 = view2;
            C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/plugin/brandservice/ui/timeline/BizTimeLineUI", "resetNoMoreData", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view3, "com/tencent/mm/plugin/brandservice/ui/timeline/BizTimeLineUI", "resetNoMoreData", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    /* renamed from: x */
    public final void mo23167x() {
        C19623o0 o0Var = null;
        Cursor rawQuery = C48009v0.Jx0().f55550d.rawQuery("SELECT * FROM BizTimeLineInfo order by orderFlag asc limit 1", (String[]) null, 2);
        if (rawQuery.moveToFirst()) {
            o0Var = new C19623o0();
            o0Var.convertFrom(rawQuery);
        }
        rawQuery.close();
        if (o0Var != null) {
            this.f51448s = o0Var.mo25767q2();
        }
    }

    /* renamed from: z */
    public final void mo23168z(C77630j jVar, C19623o0 o0Var, int i, C77629i iVar, View view, boolean z, int i2) {
        C19623o0 o0Var2 = o0Var;
        View view2 = view;
        int i3 = i2;
        C87412m.m108594g(jVar, "item");
        C87412m.m108594g(o0Var2, "info");
        C87412m.m108594g(view2, "clickView");
        ((C20642c) C86312j.m106911c(C20642c.class)).mo32319pK(jVar, o0Var, i, iVar, view, z, i2, this.f51433F);
        view2.setOnLongClickListener(new C18521l(this, o0Var2, jVar, i3));
        if (jVar.f226333o == 5) {
            view2.setOnClickListener(new C18522m(i3, jVar, this, o0Var2));
        }
    }
}
