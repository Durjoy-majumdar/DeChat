package com.tencent.p014mm.plugin.emoji.p040ui;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.C39623j;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.mmdata.rpt.EmoticonBoardReddotNotificationStruct;
import com.tencent.p014mm.autogen.mmdata.rpt.EmoticonDesignerIPPageExposureStruct;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.emoji.model.C93116n;
import com.tencent.p014mm.sdk.platformtools.IntentUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import f40.C86709a0;
import fy3.C32224a;
import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import i61.C76300m;
import j20.C117292a;
import java.util.List;
import k20.C9556a;
import k60.C99101e;
import kotlin.Metadata;
import l60.C99342a;
import l60.C99344b;
import n60.C100075f;
import n61.C100078b;
import n61.C100089e0;
import n61.C100091f0;
import n61.C11132a;
import p585kl.C99146d;
import p61.C100640a0;
import p61.C100642b0;
import p61.C100646g;
import p61.C100657j;
import p61.C100666n;
import p61.C100671r;
import p61.C100683x;
import p61.C100684y;
import qo3.C77407n;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import te3.C101787i40;
import te3.C101824o80;
import x51.C102562g;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/emoji/ui/EmojiDesignerIPInfoUI;", "Lcom/tencent/mm/ui/MMActivity;", "<init>", "()V", "plugin-emoji_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.emoji.ui.EmojiDesignerIPInfoUI */
public final class EmojiDesignerIPInfoUI extends MMActivity {

    /* renamed from: t */
    public static final /* synthetic */ int f268467t = 0;

    /* renamed from: d */
    public final String f268468d = "MicroMsg.EmojiDesignerIPInfoUI";

    /* renamed from: e */
    public final C13601g f268469e = C36568h.m40985a(new C93132b(this));

    /* renamed from: f */
    public final C13601g f268470f = C36568h.m40985a(new C93134d(this));

    /* renamed from: g */
    public final C13601g f268471g = C36568h.m40985a(new C93133c(this));

    /* renamed from: h */
    public final C13601g f268472h = C36568h.m40985a(new C93139k(this));

    /* renamed from: i */
    public final C13601g f268473i = C36568h.m40985a(new C93131a(this));

    /* renamed from: j */
    public final C101787i40 f268474j = new C101787i40();

    /* renamed from: n */
    public C100646g f268475n;

    /* renamed from: o */
    public final C100078b f268476o = new C100078b(C100089e0.f293212a);

    /* renamed from: p */
    public C100671r f268477p;

    /* renamed from: q */
    public String f268478q = "";

    /* renamed from: r */
    public int f268479r;

    /* renamed from: s */
    public final EmoticonDesignerIPPageExposureStruct f268480s = new EmoticonDesignerIPPageExposureStruct();

    /* renamed from: com.tencent.mm.plugin.emoji.ui.EmojiDesignerIPInfoUI$g */
    public static final class C55620g implements MenuItem.OnMenuItemClickListener {

        /* renamed from: d */
        public final /* synthetic */ EmojiDesignerIPInfoUI f158318d;

        public C55620g(EmojiDesignerIPInfoUI emojiDesignerIPInfoUI) {
            this.f158318d = emojiDesignerIPInfoUI;
        }

        public final boolean onMenuItemClick(MenuItem menuItem) {
            this.f158318d.finish();
            return false;
        }
    }

    /* renamed from: com.tencent.mm.plugin.emoji.ui.EmojiDesignerIPInfoUI$i */
    public static final class C55621i extends C87413o implements C32227p<List<? extends C101824o80>, Boolean, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ EmojiDesignerIPInfoUI f158319d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C55621i(EmojiDesignerIPInfoUI emojiDesignerIPInfoUI) {
            super(2);
            this.f158319d = emojiDesignerIPInfoUI;
        }

        public Object invoke(Object obj, Object obj2) {
            List list = (List) obj;
            boolean booleanValue = ((Boolean) obj2).booleanValue();
            String str = this.f158319d.f268468d;
            StringBuilder sb = new StringBuilder();
            sb.append("onCreate: ");
            sb.append(list != null ? Integer.valueOf(list.size()) : null);
            sb.append(", ");
            sb.append(booleanValue);
            Log.m105924i(str, sb.toString());
            ((RecyclerView) ((C36570n) this.f158319d.f268472h).getValue()).post(new C55622a0(booleanValue, this.f158319d, list));
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.emoji.ui.EmojiDesignerIPInfoUI$a */
    public static final class C93131a extends C87413o implements C32224a<AppBarLayout> {

        /* renamed from: d */
        public final /* synthetic */ EmojiDesignerIPInfoUI f268481d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C93131a(EmojiDesignerIPInfoUI emojiDesignerIPInfoUI) {
            super(0);
            this.f268481d = emojiDesignerIPInfoUI;
        }

        public Object invoke() {
            return (AppBarLayout) this.f268481d.findViewById(C0966R.C0970id.cyv);
        }
    }

    /* renamed from: com.tencent.mm.plugin.emoji.ui.EmojiDesignerIPInfoUI$b */
    public static final class C93132b extends C87413o implements C32224a<ImageView> {

        /* renamed from: d */
        public final /* synthetic */ EmojiDesignerIPInfoUI f268482d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C93132b(EmojiDesignerIPInfoUI emojiDesignerIPInfoUI) {
            super(0);
            this.f268482d = emojiDesignerIPInfoUI;
        }

        public Object invoke() {
            return (ImageView) this.f268482d.findViewById(C0966R.C0970id.cyx);
        }
    }

    /* renamed from: com.tencent.mm.plugin.emoji.ui.EmojiDesignerIPInfoUI$c */
    public static final class C93133c extends C87413o implements C32224a<TextView> {

        /* renamed from: d */
        public final /* synthetic */ EmojiDesignerIPInfoUI f268483d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C93133c(EmojiDesignerIPInfoUI emojiDesignerIPInfoUI) {
            super(0);
            this.f268483d = emojiDesignerIPInfoUI;
        }

        public Object invoke() {
            return (TextView) this.f268483d.findViewById(C0966R.C0970id.czb);
        }
    }

    /* renamed from: com.tencent.mm.plugin.emoji.ui.EmojiDesignerIPInfoUI$d */
    public static final class C93134d extends C87413o implements C32224a<TextView> {

        /* renamed from: d */
        public final /* synthetic */ EmojiDesignerIPInfoUI f268484d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C93134d(EmojiDesignerIPInfoUI emojiDesignerIPInfoUI) {
            super(0);
            this.f268484d = emojiDesignerIPInfoUI;
        }

        public Object invoke() {
            return (TextView) this.f268484d.findViewById(C0966R.C0970id.d9t);
        }
    }

    /* renamed from: com.tencent.mm.plugin.emoji.ui.EmojiDesignerIPInfoUI$e */
    public static final class C93135e extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ EmojiDesignerIPInfoUI f268485d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C93135e(EmojiDesignerIPInfoUI emojiDesignerIPInfoUI) {
            super(0);
            this.f268485d = emojiDesignerIPInfoUI;
        }

        public Object invoke() {
            C100646g gVar = this.f268485d.f268475n;
            if (gVar != null) {
                gVar.mo140090a();
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.emoji.ui.EmojiDesignerIPInfoUI$f */
    public static final class C93136f implements AppBarLayout.C67445c {

        /* renamed from: a */
        public final /* synthetic */ EmojiDesignerIPInfoUI f268486a;

        public C93136f(EmojiDesignerIPInfoUI emojiDesignerIPInfoUI) {
            this.f268486a = emojiDesignerIPInfoUI;
        }

        /* renamed from: a */
        public final void mo3128a(AppBarLayout appBarLayout, int i) {
            if (i + appBarLayout.getHeight() <= 0) {
                EmojiDesignerIPInfoUI emojiDesignerIPInfoUI = this.f268486a;
                emojiDesignerIPInfoUI.setMMTitle(emojiDesignerIPInfoUI.f268474j.f298384f);
                return;
            }
            this.f268486a.setMMTitle("");
        }
    }

    /* renamed from: com.tencent.mm.plugin.emoji.ui.EmojiDesignerIPInfoUI$h */
    public static final class C93137h implements MenuItem.OnMenuItemClickListener {

        /* renamed from: d */
        public final /* synthetic */ EmojiDesignerIPInfoUI f268487d;

        public C93137h(EmojiDesignerIPInfoUI emojiDesignerIPInfoUI) {
            this.f268487d = emojiDesignerIPInfoUI;
        }

        public final boolean onMenuItemClick(MenuItem menuItem) {
            Log.m105924i(this.f268487d.f268468d, "on shard click.");
            EmojiDesignerIPInfoUI emojiDesignerIPInfoUI = this.f268487d;
            emojiDesignerIPInfoUI.f268480s.f265453g++;
            C77407n nVar = new C77407n((Context) emojiDesignerIPInfoUI.getContext(), 1, false);
            nVar.f225771i = new C93161b0(emojiDesignerIPInfoUI);
            nVar.f225782p = new C93163c0(emojiDesignerIPInfoUI);
            nVar.mo107573q();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.emoji.ui.EmojiDesignerIPInfoUI$j */
    public static final class C93138j implements C100640a0 {

        /* renamed from: a */
        public final /* synthetic */ EmojiDesignerIPInfoUI f268488a;

        public C93138j(EmojiDesignerIPInfoUI emojiDesignerIPInfoUI) {
            this.f268488a = emojiDesignerIPInfoUI;
        }

        /* renamed from: a */
        public void mo127714a(C100657j<?> jVar, int i, C100684y yVar) {
            boolean z;
            C87412m.m108594g(jVar, "holder");
            if (yVar != null && ((z = yVar instanceof C100683x)) && (jVar instanceof C100666n)) {
                C100683x xVar = z ? (C100683x) yVar : null;
                if (xVar != null && xVar.f294996a != null) {
                    EmojiDesignerIPInfoUI emojiDesignerIPInfoUI = this.f268488a;
                    C100671r rVar = emojiDesignerIPInfoUI.f268477p;
                    if (rVar != null) {
                        rVar.f294946d = (C100642b0) jVar;
                    }
                    if (rVar != null) {
                        C39623j lifecycle = emojiDesignerIPInfoUI.getLifecycle();
                        C87412m.m108593f(lifecycle, "lifecycle");
                        rVar.f294951i = new C100091f0(lifecycle, this.f268488a.f268477p);
                    }
                    C100671r rVar2 = this.f268488a.f268477p;
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
            C87412m.m108594g(jVar, "holder");
            if (yVar != null && ((z = yVar instanceof C100683x))) {
                Intent intent = null;
                C100683x xVar = z ? (C100683x) yVar : null;
                if (xVar != null && (gVar = xVar.f294996a) != null) {
                    EmojiDesignerIPInfoUI emojiDesignerIPInfoUI = this.f268488a;
                    int i2 = EmojiDesignerIPInfoUI.f268467t;
                    emojiDesignerIPInfoUI.getClass();
                    Intent intent2 = new Intent();
                    intent2.setClass(emojiDesignerIPInfoUI, EmojiStoreDetailUI.class);
                    C101824o80 o802 = gVar.f301983b;
                    if (o802 != null) {
                        C99146d dVar = C99146d.f290701a;
                        EmoticonBoardReddotNotificationStruct emoticonBoardReddotNotificationStruct = C99146d.f290702b;
                        emoticonBoardReddotNotificationStruct.mo126612s(o802.f298994d);
                        dVar.mo138515a(4);
                        emoticonBoardReddotNotificationStruct.mo126612s("");
                        intent2.putExtra("extra_id", o802.f298994d);
                        intent2.putExtra("extra_name", o802.f298996f);
                        intent2.putExtra("extra_copyright", o802.f299004q);
                        intent2.putExtra("extra_coverurl", o802.f299002o);
                        intent2.putExtra("extra_description", o802.f298997g);
                        intent2.putExtra("extra_price", o802.f298999i);
                        intent2.putExtra("extra_type", o802.f299000j);
                        intent2.putExtra("extra_flag", o802.f299001n);
                        intent2.putExtra("preceding_scence", 106);
                        intent2.putExtra("download_entrance_scene", 6);
                        intent2.putExtra("call_by", 1);
                        intent2.putExtra("check_clickflag", false);
                        intent2.putExtra("extra_status", gVar.f301987f);
                        intent2.putExtra("extra_progress", gVar.f301986e);
                        intent2.putExtra("searchID", "searchId");
                        intent2.putExtra("extra_pack_wecoin_price", o802.f298990A);
                        intent2.putExtra("extra_wecoin_price", o802.f298991B);
                        String stringExtra = intent2.getStringExtra("to_talker_name");
                        if (!Util.isNullOrNil(stringExtra)) {
                            intent2.putExtra("to_talker_name", stringExtra);
                        }
                        if (IntentUtil.getBooleanExtra(intent2, "from_appbrand_ui", false)) {
                            intent2.putExtra("from_appbrand_ui", true);
                        }
                        intent = intent2;
                    }
                    EmojiDesignerIPInfoUI emojiDesignerIPInfoUI2 = this.f268488a;
                    C9556a aVar = new C9556a();
                    aVar.mo10233c(intent);
                    EmojiDesignerIPInfoUI emojiDesignerIPInfoUI3 = emojiDesignerIPInfoUI2;
                    C117292a.m165358d(emojiDesignerIPInfoUI3, aVar.mo10232b(), "com/tencent/mm/plugin/emoji/ui/EmojiDesignerIPInfoUI$onCreate$itemListener$1", "onClick", "(Lcom/tencent/mm/plugin/emoji/ui/v3/model/EmojiStoreV3BaseHolder;ILcom/tencent/mm/plugin/emoji/ui/v3/model/IEmojiStoreTypeItem;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    emojiDesignerIPInfoUI2.startActivity((Intent) aVar.mo10231a(0));
                    C117292a.m165359e(emojiDesignerIPInfoUI3, "com/tencent/mm/plugin/emoji/ui/EmojiDesignerIPInfoUI$onCreate$itemListener$1", "onClick", "(Lcom/tencent/mm/plugin/emoji/ui/v3/model/EmojiStoreV3BaseHolder;ILcom/tencent/mm/plugin/emoji/ui/v3/model/IEmojiStoreTypeItem;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.emoji.ui.EmojiDesignerIPInfoUI$k */
    public static final class C93139k extends C87413o implements C32224a<RecyclerView> {

        /* renamed from: d */
        public final /* synthetic */ EmojiDesignerIPInfoUI f268489d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C93139k(EmojiDesignerIPInfoUI emojiDesignerIPInfoUI) {
            super(0);
            this.f268489d = emojiDesignerIPInfoUI;
        }

        public Object invoke() {
            return (RecyclerView) this.f268489d.findViewById(C0966R.C0970id.dbl);
        }
    }

    public void finish() {
        String str = this.f268468d;
        Log.m105924i(str, "finish: " + this.f268480s.mo1006q());
        this.f268480s.mo86054n();
        super.finish();
    }

    public int getLayoutId() {
        return C0966R.C0971layout.ai5;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 2002 && i2 == -1) {
            C87412m.m108591d(intent);
            String stringExtra = intent.getStringExtra("Select_Conv_User");
            if (!Util.isNullOrNil(stringExtra)) {
                String str = this.f268468d;
                Log.m105918d(str, ".." + stringExtra);
                C101787i40 i402 = this.f268474j;
                C76300m.m91728d(this, stringExtra, 97, 0, i402.f298384f, i402.f298385g, i402.f298383e, (String) null, 0, i402.f298382d);
                return;
            }
            Log.m105924i(this.f268468d, "member or data is null.");
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        String stringExtra = getIntent().getStringExtra("EXTRA_SESSION_ID");
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.f268478q = stringExtra;
        this.f268479r = getIntent().getIntExtra("uin", 0);
        this.f268474j.f298382d = getIntent().getStringExtra("extra_ip_set_key");
        this.f268474j.f298384f = getIntent().getStringExtra("EXTRA_IP_SET_NAME");
        this.f268474j.f298385g = getIntent().getStringExtra("EXTRA_IP_SET_DESC");
        this.f268474j.f298383e = getIntent().getStringExtra("EXTRA_IP_SET_URL");
        String str = this.f268474j.f298383e;
        if (str != null) {
            C99344b<String, Bitmap> e = C99101e.f290571b.mo85955a(str);
            C100075f.C100076a aVar = new C100075f.C100076a();
            aVar.f293176b = true;
            e.f291319c = aVar.mo139398a();
            ImageView imageView = (ImageView) ((C36570n) this.f268469e).getValue();
            C87412m.m108593f(imageView, "headerImage");
            ((C99342a) e).mo85954d(imageView);
        }
        ((TextView) ((C36570n) this.f268470f).getValue()).setText(this.f268474j.f298384f);
        ((TextView) ((C36570n) this.f268471g).getValue()).setText(this.f268474j.f298385g);
        this.f268476o.f293188d = new C93138j(this);
        C100671r rVar = new C100671r();
        this.f268477p = rVar;
        rVar.f294945c = this;
        rVar.f294948f = 45;
        rVar.f294954l = getIntent().getStringExtra("name");
        ((RecyclerView) ((C36570n) this.f268472h).getValue()).setLayoutManager(new LinearLayoutManager(this));
        ((RecyclerView) ((C36570n) this.f268472h).getValue()).setAdapter(this.f268476o);
        ((RecyclerView) ((C36570n) this.f268472h).getValue()).mo17085h0(new C11132a(this));
        C55621i iVar = new C55621i(this);
        String str2 = this.f268474j.f298382d;
        if (str2 == null) {
            str2 = "";
        }
        this.f268475n = new C100646g(str2, iVar);
        this.f268476o.f293189e = new C93135e(this);
        C100646g gVar = this.f268475n;
        if (gVar != null) {
            gVar.mo140090a();
        }
        C93116n.f268258c.mo127626a();
        setMMTitle("");
        setActionbarColor(getResources().getColor(C0966R.color.al6));
        ((AppBarLayout) ((C36570n) this.f268473i).getValue()).mo146159a(new C93136f(this));
        setBackBtn(new C55620g(this));
        addIconOptionMenu(0, C0966R.raw.icons_outlined_share, new C93137h(this));
        EmoticonDesignerIPPageExposureStruct emoticonDesignerIPPageExposureStruct = this.f268480s;
        emoticonDesignerIPPageExposureStruct.f265450d = emoticonDesignerIPPageExposureStruct.mo86045b("SessionId", this.f268478q, true);
        EmoticonDesignerIPPageExposureStruct emoticonDesignerIPPageExposureStruct2 = this.f268480s;
        emoticonDesignerIPPageExposureStruct2.f265452f = emoticonDesignerIPPageExposureStruct2.mo86045b("DesUin", String.valueOf(this.f268479r), true);
        EmoticonDesignerIPPageExposureStruct emoticonDesignerIPPageExposureStruct3 = this.f268480s;
        emoticonDesignerIPPageExposureStruct3.f265451e = emoticonDesignerIPPageExposureStruct3.mo86045b("IPSetKey", this.f268474j.f298382d, true);
    }

    public void onDestroy() {
        C100646g gVar = this.f268475n;
        if (gVar != null) {
            C86709a0.m107529k().f251779b.mo123470p(411, gVar.f294851h);
        }
        super.onDestroy();
    }
}
