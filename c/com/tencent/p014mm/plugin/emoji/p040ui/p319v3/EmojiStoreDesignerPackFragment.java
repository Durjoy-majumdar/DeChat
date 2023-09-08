package com.tencent.p014mm.plugin.emoji.p040ui.p319v3;

import android.content.Context;
import android.content.Intent;
import android.util.AttributeSet;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.C0120a0;
import androidx.lifecycle.C39623j;
import androidx.lifecycle.LiveData;
import androidx.recyclerview.widget.RecyclerView;
import bl3.C39818r;
import com.tencent.p014mm.autogen.mmdata.rpt.EmoticonBoardReddotNotificationStruct;
import com.tencent.p014mm.hellhoundlib.fragments.HellAndroidXFragment;
import com.tencent.p014mm.plugin.emoji.p040ui.EmojiStoreDetailUI;
import com.tencent.p014mm.plugin.emoji.p040ui.p041v2.C55627a;
import com.tencent.p014mm.plugin.emoji.p040ui.p319v3.model.EmojiDesignerPackPageSource;
import com.tencent.p014mm.plugin.emoji.p040ui.p319v3.model.EmojiStoreDesignerPackList;
import com.tencent.p014mm.sdk.platformtools.IntentUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import fy3.C32224a;
import fy3.C32227p;
import gy3.C8479f0;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.util.List;
import jp3.C46566c;
import jp3.C9486a;
import k20.C9556a;
import kotlin.Metadata;
import n61.C100078b;
import n61.C100089e0;
import n61.C100091f0;
import p585kl.C99146d;
import p61.C100640a0;
import p61.C100642b0;
import p61.C100657j;
import p61.C100666n;
import p61.C100671r;
import p61.C100683x;
import p61.C100684y;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import te3.C101824o80;
import te3.C49103d62;
import x51.C102562g;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo182094d2 = {"Lcom/tencent/mm/plugin/emoji/ui/v3/EmojiStoreDesignerPackFragment;", "Landroidx/fragment/app/Fragment;", "plugin-emoji_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.emoji.ui.v3.EmojiStoreDesignerPackFragment */
public final class EmojiStoreDesignerPackFragment extends HellAndroidXFragment {

    /* renamed from: p */
    public static final /* synthetic */ int f268972p = 0;

    /* renamed from: d */
    public final int f268973d;

    /* renamed from: e */
    public final LiveData<C49103d62> f268974e;

    /* renamed from: f */
    public final LiveData<EmojiStoreDesignerPackList> f268975f;

    /* renamed from: g */
    public final String f268976g = "MicroMsg.EmojiStoreDesignerPackFragment";

    /* renamed from: h */
    public final C46566c<C9486a> f268977h = new C46566c<>();

    /* renamed from: i */
    public C100671r f268978i;

    /* renamed from: j */
    public final C100078b f268979j = new C100078b(C100089e0.f293212a);

    /* renamed from: n */
    public long f268980n;

    /* renamed from: o */
    public final C13601g f268981o = C36568h.m40985a(new C93261f(this));

    /* renamed from: com.tencent.mm.plugin.emoji.ui.v3.EmojiStoreDesignerPackFragment$d */
    public static final class C55635d extends C87413o implements C32227p<List<? extends C101824o80>, Boolean, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ EmojiStoreDesignerPackFragment f158342d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C55635d(EmojiStoreDesignerPackFragment emojiStoreDesignerPackFragment) {
            super(2);
            this.f158342d = emojiStoreDesignerPackFragment;
        }

        public Object invoke(Object obj, Object obj2) {
            List list = (List) obj;
            boolean booleanValue = ((Boolean) obj2).booleanValue();
            String str = this.f158342d.f268976g;
            StringBuilder sb = new StringBuilder();
            sb.append("onCreateView: ");
            sb.append(list != null ? Integer.valueOf(list.size()) : null);
            sb.append(", ");
            sb.append(booleanValue);
            Log.m105924i(str, sb.toString());
            this.f158342d.mo127885K().post(new C55636a(booleanValue, this.f158342d, list));
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.emoji.ui.v3.EmojiStoreDesignerPackFragment$a */
    public static final class C93257a<T> implements C0120a0 {

        /* renamed from: d */
        public final /* synthetic */ C8479f0<EmojiDesignerPackPageSource> f268982d;

        /* renamed from: e */
        public final /* synthetic */ EmojiStoreDesignerPackFragment f268983e;

        /* renamed from: f */
        public final /* synthetic */ C32227p<List<? extends C101824o80>, Boolean, C13598b0> f268984f;

        public C93257a(C8479f0<EmojiDesignerPackPageSource> f0Var, EmojiStoreDesignerPackFragment emojiStoreDesignerPackFragment, C32227p<? super List<? extends C101824o80>, ? super Boolean, C13598b0> pVar) {
            this.f268982d = f0Var;
            this.f268983e = emojiStoreDesignerPackFragment;
            this.f268984f = pVar;
        }

        public void onChanged(Object obj) {
            C8479f0<EmojiDesignerPackPageSource> f0Var = this.f268982d;
            EmojiStoreDesignerPackFragment emojiStoreDesignerPackFragment = this.f268983e;
            f0Var.f27484d = new EmojiDesignerPackPageSource(emojiStoreDesignerPackFragment.f268977h, emojiStoreDesignerPackFragment.f268973d, (EmojiStoreDesignerPackList) obj, this.f268984f);
            ((EmojiDesignerPackPageSource) this.f268982d.f27484d).mo127920a();
        }
    }

    /* renamed from: com.tencent.mm.plugin.emoji.ui.v3.EmojiStoreDesignerPackFragment$b */
    public static final class C93258b extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C8479f0<EmojiDesignerPackPageSource> f268985d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C93258b(C8479f0<EmojiDesignerPackPageSource> f0Var) {
            super(0);
            this.f268985d = f0Var;
        }

        public Object invoke() {
            ((EmojiDesignerPackPageSource) this.f268985d.f27484d).mo127920a();
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.emoji.ui.v3.EmojiStoreDesignerPackFragment$c */
    public static final class C93259c<T> implements C0120a0 {

        /* renamed from: d */
        public final /* synthetic */ EmojiStoreDesignerPackFragment f268986d;

        public C93259c(EmojiStoreDesignerPackFragment emojiStoreDesignerPackFragment) {
            this.f268986d = emojiStoreDesignerPackFragment;
        }

        public void onChanged(Object obj) {
            C49103d62 d622 = (C49103d62) obj;
            C100671r rVar = this.f268986d.f268978i;
            if (rVar != null) {
                rVar.f294954l = d622.f132145e;
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.emoji.ui.v3.EmojiStoreDesignerPackFragment$e */
    public static final class C93260e implements C100640a0 {

        /* renamed from: a */
        public final /* synthetic */ EmojiStoreDesignerPackFragment f268987a;

        public C93260e(EmojiStoreDesignerPackFragment emojiStoreDesignerPackFragment) {
            this.f268987a = emojiStoreDesignerPackFragment;
        }

        /* renamed from: a */
        public void mo127714a(C100657j<?> jVar, int i, C100684y yVar) {
            boolean z;
            C102562g gVar;
            C87412m.m108594g(jVar, "holder");
            if (yVar != null && ((z = yVar instanceof C100683x)) && (jVar instanceof C100666n)) {
                C100683x xVar = z ? (C100683x) yVar : null;
                if (xVar != null && (gVar = xVar.f294996a) != null) {
                    C99146d dVar = C99146d.f290701a;
                    EmoticonBoardReddotNotificationStruct emoticonBoardReddotNotificationStruct = C99146d.f290702b;
                    emoticonBoardReddotNotificationStruct.mo126612s(gVar.f301983b.f298994d);
                    dVar.mo138515a(3);
                    emoticonBoardReddotNotificationStruct.mo126612s("");
                    EmojiStoreDesignerPackFragment emojiStoreDesignerPackFragment = this.f268987a;
                    C100671r rVar = emojiStoreDesignerPackFragment.f268978i;
                    if (rVar != null) {
                        rVar.f294946d = (C100642b0) jVar;
                    }
                    if (rVar != null) {
                        C39623j lifecycle = emojiStoreDesignerPackFragment.getLifecycle();
                        C87412m.m108593f(lifecycle, "lifecycle");
                        rVar.f294951i = new C100091f0(lifecycle, this.f268987a.f268978i);
                    }
                    C100671r rVar2 = this.f268987a.f268978i;
                    if (rVar2 != null) {
                        rVar2.mo140109b();
                    }
                }
            }
        }

        /* renamed from: b */
        public void mo127715b(C100657j<?> jVar, int i, C100684y yVar) {
            boolean z;
            C102562g gVar;
            Intent intent;
            C87412m.m108594g(jVar, "holder");
            if (yVar != null && ((z = yVar instanceof C100683x))) {
                Intent intent2 = null;
                C100683x xVar = z ? (C100683x) yVar : null;
                if (xVar != null && (gVar = xVar.f294996a) != null) {
                    EmojiStoreDesignerPackFragment emojiStoreDesignerPackFragment = this.f268987a;
                    int i2 = EmojiStoreDesignerPackFragment.f268972p;
                    emojiStoreDesignerPackFragment.getClass();
                    C39818r rVar = C39818r.f106831a;
                    Context requireContext = emojiStoreDesignerPackFragment.requireContext();
                    C87412m.m108593f(requireContext, "requireContext()");
                    ((C55627a) rVar.mo62443b(requireContext).mo75002a(C55627a.class)).f158330e.f154998i++;
                    EmojiStoreDesignerPackFragment emojiStoreDesignerPackFragment2 = this.f268987a;
                    emojiStoreDesignerPackFragment2.getClass();
                    Intent intent3 = new Intent();
                    intent3.setClass(emojiStoreDesignerPackFragment2.requireContext(), EmojiStoreDetailUI.class);
                    C101824o80 o802 = gVar.f301983b;
                    if (o802 != null) {
                        C99146d dVar = C99146d.f290701a;
                        EmoticonBoardReddotNotificationStruct emoticonBoardReddotNotificationStruct = C99146d.f290702b;
                        emoticonBoardReddotNotificationStruct.mo126612s(o802.f298994d);
                        dVar.mo138515a(4);
                        emoticonBoardReddotNotificationStruct.mo126612s("");
                        intent3.putExtra("extra_id", o802.f298994d);
                        intent3.putExtra("extra_name", o802.f298996f);
                        intent3.putExtra("extra_copyright", o802.f299004q);
                        intent3.putExtra("extra_coverurl", o802.f299002o);
                        intent3.putExtra("extra_description", o802.f298997g);
                        intent3.putExtra("extra_price", o802.f298999i);
                        intent3.putExtra("extra_type", o802.f299000j);
                        intent3.putExtra("extra_flag", o802.f299001n);
                        intent3.putExtra("preceding_scence", 106);
                        intent3.putExtra("download_entrance_scene", 6);
                        intent3.putExtra("call_by", 1);
                        intent3.putExtra("check_clickflag", false);
                        intent3.putExtra("extra_status", gVar.f301987f);
                        intent3.putExtra("extra_progress", gVar.f301986e);
                        intent3.putExtra("searchID", emojiStoreDesignerPackFragment2.f268980n);
                        intent3.putExtra("extra_pack_wecoin_price", o802.f298990A);
                        intent3.putExtra("extra_wecoin_price", o802.f298991B);
                        FragmentActivity activity = emojiStoreDesignerPackFragment2.getActivity();
                        String stringExtra = (activity == null || (intent = activity.getIntent()) == null) ? null : intent.getStringExtra("to_talker_name");
                        if (!Util.isNullOrNil(stringExtra)) {
                            intent3.putExtra("to_talker_name", stringExtra);
                        }
                        FragmentActivity activity2 = emojiStoreDesignerPackFragment2.getActivity();
                        if (activity2 != null) {
                            intent2 = activity2.getIntent();
                        }
                        if (IntentUtil.getBooleanExtra(intent2, "from_appbrand_ui", false)) {
                            intent3.putExtra("from_appbrand_ui", true);
                        }
                        intent2 = intent3;
                    }
                    EmojiStoreDesignerPackFragment emojiStoreDesignerPackFragment3 = this.f268987a;
                    C9556a aVar = new C9556a();
                    aVar.mo10233c(intent2);
                    EmojiStoreDesignerPackFragment emojiStoreDesignerPackFragment4 = emojiStoreDesignerPackFragment3;
                    C117292a.m165358d(emojiStoreDesignerPackFragment4, aVar.mo10232b(), "com/tencent/mm/plugin/emoji/ui/v3/EmojiStoreDesignerPackFragment$onCreateView$itemListener$1", "onClick", "(Lcom/tencent/mm/plugin/emoji/ui/v3/model/EmojiStoreV3BaseHolder;ILcom/tencent/mm/plugin/emoji/ui/v3/model/IEmojiStoreTypeItem;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    emojiStoreDesignerPackFragment3.startActivity((Intent) aVar.mo10231a(0));
                    C117292a.m165359e(emojiStoreDesignerPackFragment4, "com/tencent/mm/plugin/emoji/ui/v3/EmojiStoreDesignerPackFragment$onCreateView$itemListener$1", "onClick", "(Lcom/tencent/mm/plugin/emoji/ui/v3/model/EmojiStoreV3BaseHolder;ILcom/tencent/mm/plugin/emoji/ui/v3/model/IEmojiStoreTypeItem;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.emoji.ui.v3.EmojiStoreDesignerPackFragment$f */
    public static final class C93261f extends C87413o implements C32224a<RecyclerView> {

        /* renamed from: d */
        public final /* synthetic */ EmojiStoreDesignerPackFragment f268988d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C93261f(EmojiStoreDesignerPackFragment emojiStoreDesignerPackFragment) {
            super(0);
            this.f268988d = emojiStoreDesignerPackFragment;
        }

        public Object invoke() {
            return new RecyclerView(this.f268988d.requireContext(), (AttributeSet) null);
        }
    }

    public EmojiStoreDesignerPackFragment(int i, LiveData<C49103d62> liveData, LiveData<EmojiStoreDesignerPackList> liveData2) {
        C87412m.m108594g(liveData, "designerData");
        C87412m.m108594g(liveData2, "liveData");
        this.f268973d = i;
        this.f268974e = liveData;
        this.f268975f = liveData2;
    }

    /* renamed from: K */
    public final RecyclerView mo127885K() {
        return (RecyclerView) ((C36570n) this.f268981o).getValue();
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        C100671r rVar = this.f268978i;
        if (rVar != null) {
            rVar.mo140108a(i, i2, intent);
        }
        super.onActivityResult(i, i2, intent);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0048, code lost:
        r7 = r7.getIntent();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View onCreateView(android.view.LayoutInflater r5, android.view.ViewGroup r6, android.os.Bundle r7) {
        /*
            r4 = this;
            java.lang.String r6 = "inflater"
            gy3.C87412m.m108594g(r5, r6)
            com.tencent.mm.plugin.emoji.ui.v3.EmojiStoreDesignerPackFragment$e r5 = new com.tencent.mm.plugin.emoji.ui.v3.EmojiStoreDesignerPackFragment$e
            r5.<init>(r4)
            n61.b r6 = r4.f268979j
            r6.f293188d = r5
            androidx.fragment.app.FragmentActivity r5 = r4.getActivity()
            r6 = 0
            if (r5 == 0) goto L_0x0023
            android.content.Intent r5 = r5.getIntent()
            if (r5 == 0) goto L_0x0023
            java.lang.String r0 = "searchID"
            long r6 = r5.getLongExtra(r0, r6)
        L_0x0023:
            r4.f268980n = r6
            p61.r r5 = new p61.r
            r5.<init>()
            r4.f268978i = r5
            android.content.Context r6 = r4.requireContext()
            r5.f294945c = r6
            p61.r r5 = r4.f268978i
            if (r5 == 0) goto L_0x0039
            r6 = 6
            r5.f294948f = r6
        L_0x0039:
            if (r5 == 0) goto L_0x003f
            long r6 = r4.f268980n
            r5.f294949g = r6
        L_0x003f:
            r6 = 0
            if (r5 == 0) goto L_0x005e
            androidx.fragment.app.FragmentActivity r7 = r4.getActivity()
            if (r7 == 0) goto L_0x0055
            android.content.Intent r7 = r7.getIntent()
            if (r7 == 0) goto L_0x0055
            java.lang.String r0 = "docID"
            java.lang.String r7 = r7.getStringExtra(r0)
            goto L_0x0056
        L_0x0055:
            r7 = r6
        L_0x0056:
            java.lang.String r0 = ""
            java.lang.String r7 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r7, (java.lang.String) r0)
            r5.f294950h = r7
        L_0x005e:
            androidx.recyclerview.widget.RecyclerView r5 = r4.mo127885K()
            androidx.recyclerview.widget.LinearLayoutManager r7 = new androidx.recyclerview.widget.LinearLayoutManager
            android.content.Context r0 = r4.requireContext()
            r7.<init>(r0)
            r5.setLayoutManager(r7)
            androidx.recyclerview.widget.RecyclerView r5 = r4.mo127885K()
            n61.b r7 = r4.f268979j
            r5.setAdapter(r7)
            androidx.recyclerview.widget.RecyclerView r5 = r4.mo127885K()
            android.content.Context r7 = r4.requireContext()
            android.content.res.Resources r7 = r7.getResources()
            r0 = 2131165355(0x7f0700ab, float:1.7944925E38)
            int r7 = r7.getDimensionPixelOffset(r0)
            r0 = 0
            r5.setPadding(r0, r0, r0, r7)
            androidx.recyclerview.widget.RecyclerView r5 = r4.mo127885K()
            r5.setClipToPadding(r0)
            androidx.recyclerview.widget.RecyclerView r5 = r4.mo127885K()
            n61.a r7 = new n61.a
            android.content.Context r0 = r4.requireContext()
            java.lang.String r1 = "requireContext()"
            gy3.C87412m.m108593f(r0, r1)
            r7.<init>(r0)
            r5.mo17085h0(r7)
            com.tencent.mm.plugin.emoji.ui.v3.EmojiStoreDesignerPackFragment$d r5 = new com.tencent.mm.plugin.emoji.ui.v3.EmojiStoreDesignerPackFragment$d
            r5.<init>(r4)
            gy3.f0 r7 = new gy3.f0
            r7.<init>()
            com.tencent.mm.plugin.emoji.ui.v3.model.EmojiDesignerPackPageSource r0 = new com.tencent.mm.plugin.emoji.ui.v3.model.EmojiDesignerPackPageSource
            jp3.c<jp3.a> r1 = r4.f268977h
            int r2 = r4.f268973d
            androidx.lifecycle.LiveData<com.tencent.mm.plugin.emoji.ui.v3.model.EmojiStoreDesignerPackList> r3 = r4.f268975f
            java.lang.Object r3 = r3.getValue()
            com.tencent.mm.plugin.emoji.ui.v3.model.EmojiStoreDesignerPackList r3 = (com.tencent.p014mm.plugin.emoji.p040ui.p319v3.model.EmojiStoreDesignerPackList) r3
            r0.<init>(r1, r2, r3, r5)
            r7.f27484d = r0
            r0.mo127920a()
            androidx.lifecycle.LiveData<com.tencent.mm.plugin.emoji.ui.v3.model.EmojiStoreDesignerPackList> r0 = r4.f268975f
            androidx.lifecycle.s r1 = r4.getViewLifecycleOwner()
            com.tencent.mm.plugin.emoji.ui.v3.EmojiStoreDesignerPackFragment$a r2 = new com.tencent.mm.plugin.emoji.ui.v3.EmojiStoreDesignerPackFragment$a
            r2.<init>(r7, r4, r5)
            r0.observe(r1, r2)
            n61.b r5 = r4.f268979j
            com.tencent.mm.plugin.emoji.ui.v3.EmojiStoreDesignerPackFragment$b r0 = new com.tencent.mm.plugin.emoji.ui.v3.EmojiStoreDesignerPackFragment$b
            r0.<init>(r7)
            r5.f293189e = r0
            p61.r r5 = r4.f268978i
            if (r5 == 0) goto L_0x00f4
            androidx.lifecycle.LiveData<te3.d62> r7 = r4.f268974e
            java.lang.Object r7 = r7.getValue()
            te3.d62 r7 = (te3.C49103d62) r7
            if (r7 == 0) goto L_0x00f2
            java.lang.String r6 = r7.f132145e
        L_0x00f2:
            r5.f294954l = r6
        L_0x00f4:
            androidx.lifecycle.LiveData<te3.d62> r5 = r4.f268974e
            androidx.lifecycle.s r6 = r4.getViewLifecycleOwner()
            com.tencent.mm.plugin.emoji.ui.v3.EmojiStoreDesignerPackFragment$c r7 = new com.tencent.mm.plugin.emoji.ui.v3.EmojiStoreDesignerPackFragment$c
            r7.<init>(r4)
            r5.observe(r6, r7)
            com.tencent.mm.plugin.emoji.model.n$a r5 = com.tencent.p014mm.plugin.emoji.model.C93116n.f268258c
            r5.mo127626a()
            androidx.recyclerview.widget.RecyclerView r5 = r4.mo127885K()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.emoji.p040ui.p319v3.EmojiStoreDesignerPackFragment.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    public void onDestroy() {
        super.onDestroy();
        this.f268977h.dead();
    }
}
