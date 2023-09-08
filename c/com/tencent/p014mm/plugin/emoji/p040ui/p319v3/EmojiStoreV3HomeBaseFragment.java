package com.tencent.p014mm.plugin.emoji.p040ui.p319v3;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Message;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.mmdata.rpt.EmoticonStoreActionStruct;
import com.tencent.p014mm.p136ui.MMFragment;
import com.tencent.p014mm.p136ui.widget.snackbar.C75026b;
import com.tencent.p014mm.plugin.emoji.model.C41051m;
import com.tencent.p014mm.plugin.emoji.model.C93116n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.StartupILogsReport;
import com.tencent.p014mm.sdk.storage.MStorage;
import com.tencent.p014mm.sdk.storage.MStorageEventData;
import com.tencent.p014mm.storage.C30790w2;
import com.tencent.p014mm.storage.C85801v1;
import com.tencent.wxmm.v2helper;
import di3.C86312j;
import f40.C86709a0;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import j61.C33524s;
import j61.C46439j;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import kotlin.Metadata;
import n61.C100095g;
import n61.C61629n;
import nj3.C76879j;
import p441aq.C92054g;
import p61.C100640a0;
import p61.C100648g0;
import p61.C100657j;
import p61.C100660k;
import p61.C100663l;
import p61.C100664m;
import p61.C100666n;
import p61.C100671r;
import p61.C100683x;
import p61.C100684y;
import q61.C101037a;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import te3.C101824o80;
import vo3.C78461f;
import x51.C102562g;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, mo182094d2 = {"Lcom/tencent/mm/plugin/emoji/ui/v3/EmojiStoreV3HomeBaseFragment;", "Lcom/tencent/mm/ui/MMFragment;", "Lp61/r$b;", "<init>", "()V", "plugin-emoji_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.emoji.ui.v3.EmojiStoreV3HomeBaseFragment */
public abstract class EmojiStoreV3HomeBaseFragment extends MMFragment implements C100671r.C100673b {

    /* renamed from: C */
    public static final /* synthetic */ int f268989C = 0;

    /* renamed from: A */
    public final EmojiStoreV3HomeBaseFragment$emotionStateChangeListener$1 f268990A = new EmojiStoreV3HomeBaseFragment$emotionStateChangeListener$1(this, C40008f.f107254d);

    /* renamed from: B */
    public final C93264c f268991B = new C93264c(this);

    /* renamed from: d */
    public final String f268992d = "MicroMsg.EmojiStoreV3HomeBaseFragment";

    /* renamed from: e */
    public final String f268993e = "product_id";

    /* renamed from: f */
    public final String f268994f = "progress";

    /* renamed from: g */
    public final String f268995g = "status";

    /* renamed from: h */
    public final int f268996h = 131075;

    /* renamed from: i */
    public final int f268997i = StartupILogsReport.TYPEID_TINKER_LOAD_COST_MISC_JSON;

    /* renamed from: j */
    public final int f268998j = StartupILogsReport.TYPEID_FIRST_UI_SHOWN_INCLUDE_TINKER_LOAD_MISC_JSON;

    /* renamed from: n */
    public RecyclerView f268999n;

    /* renamed from: o */
    public ProgressDialog f269000o;

    /* renamed from: p */
    public C100671r f269001p;

    /* renamed from: q */
    public View f269002q;

    /* renamed from: r */
    public View f269003r;

    /* renamed from: s */
    public boolean f269004s;

    /* renamed from: t */
    public boolean f269005t;

    /* renamed from: u */
    public String f269006u = "";

    /* renamed from: v */
    public boolean f269007v = true;

    /* renamed from: w */
    public final C13601g f269008w = C36568h.m40985a(C93262a.f269012d);

    /* renamed from: x */
    public final C13601g f269009x = C36568h.m40985a(new C93263b(this));

    /* renamed from: y */
    public final MMHandler f269010y = new C93265d(this);

    /* renamed from: z */
    public final MStorage.IOnStorageChange f269011z = new C93266e(this);

    /* renamed from: com.tencent.mm.plugin.emoji.ui.v3.EmojiStoreV3HomeBaseFragment$a */
    public static final class C93262a extends C87413o implements C32224a<C100664m> {

        /* renamed from: d */
        public static final C93262a f269012d = new C93262a();

        public C93262a() {
            super(0);
        }

        public Object invoke() {
            Context context = MMApplicationContext.getContext();
            C87412m.m108593f(context, "getContext()");
            return new C100664m(context, new C100648g0());
        }
    }

    /* renamed from: com.tencent.mm.plugin.emoji.ui.v3.EmojiStoreV3HomeBaseFragment$b */
    public static final class C93263b extends C87413o implements C32224a<C100095g> {

        /* renamed from: d */
        public final /* synthetic */ EmojiStoreV3HomeBaseFragment f269013d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C93263b(EmojiStoreV3HomeBaseFragment emojiStoreV3HomeBaseFragment) {
            super(0);
            this.f269013d = emojiStoreV3HomeBaseFragment;
        }

        public Object invoke() {
            return new C100095g(this.f269013d.mo127888N());
        }
    }

    /* renamed from: com.tencent.mm.plugin.emoji.ui.v3.EmojiStoreV3HomeBaseFragment$c */
    public static final class C93264c implements C100640a0 {

        /* renamed from: a */
        public final /* synthetic */ EmojiStoreV3HomeBaseFragment f269014a;

        public C93264c(EmojiStoreV3HomeBaseFragment emojiStoreV3HomeBaseFragment) {
            this.f269014a = emojiStoreV3HomeBaseFragment;
        }

        /* renamed from: a */
        public void mo127714a(C100657j<?> jVar, int i, C100684y yVar) {
            C102562g gVar;
            C87412m.m108594g(jVar, "holder");
            if (yVar != null && yVar.getType() == 1) {
                C100666n nVar = (C100666n) jVar;
                C100683x xVar = yVar instanceof C100683x ? (C100683x) yVar : null;
                if (xVar != null && (gVar = xVar.f294996a) != null) {
                    int i2 = gVar.f301987f;
                    EmojiStoreV3HomeBaseFragment emojiStoreV3HomeBaseFragment = this.f269014a;
                    int i3 = EmojiStoreV3HomeBaseFragment.f268989C;
                    C100663l F4 = emojiStoreV3HomeBaseFragment.mo127886L().mo140098F4(i);
                    if (i2 == 9) {
                        EmojiStoreV3HomeBaseFragment emojiStoreV3HomeBaseFragment2 = this.f269014a;
                        String string = emojiStoreV3HomeBaseFragment2.getString(C0966R.string.a3p);
                        if (emojiStoreV3HomeBaseFragment2.isFinishing()) {
                            Log.m105924i(emojiStoreV3HomeBaseFragment2.f268992d, "[showLoadingDialog] activity is finished.");
                        } else {
                            emojiStoreV3HomeBaseFragment2.f269000o = C76879j.m92723Q(emojiStoreV3HomeBaseFragment2.thisActivity(), emojiStoreV3HomeBaseFragment2.getString(C0966R.string.a3h), string, true, true, C61629n.f175263d);
                        }
                    }
                    if (nVar.f294916R0 == null) {
                        nVar.f294916R0 = this.f269014a.mo127887M().f293230e;
                    }
                    if (nVar.f294914Q0 == null) {
                        C100671r rVar = new C100671r();
                        EmojiStoreV3HomeBaseFragment emojiStoreV3HomeBaseFragment3 = this.f269014a;
                        rVar.f294945c = emojiStoreV3HomeBaseFragment3.thisActivity();
                        rVar.f294946d = nVar;
                        rVar.f294947e = emojiStoreV3HomeBaseFragment3.mo127887M().f293230e;
                        rVar.f294948f = F4 != null ? F4.f294885c : 0;
                        EmoticonStoreActionStruct emoticonStoreActionStruct = new EmoticonStoreActionStruct();
                        emoticonStoreActionStruct.f265469e = 1;
                        emoticonStoreActionStruct.f265468d = C101037a.f295825a;
                        if (F4 != null) {
                            emoticonStoreActionStruct.mo126613s(String.valueOf(i - F4.f294883a));
                            emoticonStoreActionStruct.f265474j = (long) F4.f294885c;
                        }
                        rVar.f294955m = emoticonStoreActionStruct;
                        rVar.f294951i = emojiStoreV3HomeBaseFragment3;
                        if (emojiStoreV3HomeBaseFragment3.mo127890P()) {
                            boolean z = C41051m.m44498a().f110536d;
                        }
                        nVar.f294914Q0 = rVar;
                    }
                    EmojiStoreV3HomeBaseFragment emojiStoreV3HomeBaseFragment4 = this.f269014a;
                    C100671r rVar2 = nVar.f294914Q0;
                    emojiStoreV3HomeBaseFragment4.f269001p = rVar2;
                    if (rVar2 != null) {
                        rVar2.mo140109b();
                    }
                }
            }
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: x51.g} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v4, resolved type: te3.a80} */
        /* JADX WARNING: type inference failed for: r6v0 */
        /* JADX WARNING: type inference failed for: r6v6 */
        /* JADX WARNING: type inference failed for: r6v8 */
        /* JADX WARNING: type inference failed for: r6v9 */
        /* JADX WARNING: type inference failed for: r6v10 */
        /* JADX WARNING: Multi-variable type inference failed */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo127715b(p61.C100657j<?> r23, int r24, p61.C100684y r25) {
            /*
                r22 = this;
                r0 = r22
                r1 = r24
                r2 = r25
                java.lang.String r3 = "holder"
                r4 = r23
                gy3.C87412m.m108594g(r4, r3)
                if (r2 != 0) goto L_0x0010
                return
            L_0x0010:
                int r3 = r25.getType()
                r4 = 3
                r5 = 1
                r6 = 0
                if (r3 == r5) goto L_0x0114
                r1 = 6
                if (r3 == r1) goto L_0x009f
                if (r3 == r4) goto L_0x0077
                r1 = 4
                if (r3 == r1) goto L_0x0023
                goto L_0x01a7
            L_0x0023:
                boolean r1 = r2 instanceof p61.C100659j0
                if (r1 == 0) goto L_0x002b
                r1 = r2
                p61.j0 r1 = (p61.C100659j0) r1
                goto L_0x002c
            L_0x002b:
                r1 = r6
            L_0x002c:
                if (r1 == 0) goto L_0x0030
                te3.k70 r6 = r1.f294877a
            L_0x0030:
                r7 = r6
                if (r7 == 0) goto L_0x01a7
                com.tencent.mm.plugin.emoji.ui.v3.EmojiStoreV3HomeBaseFragment r2 = r0.f269014a
                android.app.Activity r9 = r2.getContext()
                if (r9 == 0) goto L_0x006a
                u61.d r8 = u61.C101962d.f300168a
                com.tencent.mm.storage.emotion.EmojiInfo r10 = u61.C101964h.m134226h(r7)
                r11 = 1
                r12 = 0
                r13 = 0
                r14 = 0
                r15 = 0
                r16 = 0
                int r2 = r1.f294878b
                int r2 = r2 + 10000
                r19 = 0
                r20 = 760(0x2f8, float:1.065E-42)
                r21 = 0
                r18 = r2
                r61.h r2 = u61.C101962d.m134210f(r8, r9, r10, r11, r12, r13, r14, r15, r16, r18, r19, r20, r21)
                java.lang.String r3 = r7.f298601v
                boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
                if (r3 != 0) goto L_0x006a
                java.lang.String r3 = r7.f298601v
                java.lang.String r4 = "emojiInfo.StoreMeaning"
                gy3.C87412m.m108593f(r3, r4)
                r2.mo140841b(r3)
            L_0x006a:
                r8 = 0
                r9 = 3
                r10 = 0
                int r1 = r1.f294878b
                int r12 = r1 + 10000
                q61.C101037a.m132406d(r7, r8, r9, r10, r12)
                goto L_0x01a7
            L_0x0077:
                boolean r1 = r2 instanceof p61.C100651h0
                if (r1 == 0) goto L_0x007f
                r1 = r2
                p61.h0 r1 = (p61.C100651h0) r1
                goto L_0x0080
            L_0x007f:
                r1 = r6
            L_0x0080:
                if (r1 == 0) goto L_0x0084
                te3.a80 r6 = r1.f294865b
            L_0x0084:
                if (r6 == 0) goto L_0x01a7
                com.tencent.mm.plugin.emoji.ui.v3.EmojiStoreV3HomeBaseFragment r2 = r0.f269014a
                android.app.Activity r7 = r2.getContext()
                int r8 = r6.f297841g
                java.lang.String r9 = r6.f297839e
                java.lang.String r10 = r6.f297845n
                java.lang.String r11 = r6.f297844j
                java.lang.String r12 = r6.f297842h
                int r1 = r1.f294867d
                int r13 = r1 + 10000
                i61.C98605n.m128203e(r7, r8, r9, r10, r11, r12, r13)
                goto L_0x01a7
            L_0x009f:
                boolean r1 = r2 instanceof p61.C100681v
                if (r1 == 0) goto L_0x00a7
                r1 = r2
                p61.v r1 = (p61.C100681v) r1
                goto L_0x00a8
            L_0x00a7:
                r1 = r6
            L_0x00a8:
                if (r1 == 0) goto L_0x01a7
                byte[] r2 = r1.f294991b
                if (r2 == 0) goto L_0x01a7
                com.tencent.mm.plugin.emoji.ui.v3.EmojiStoreV3HomeBaseFragment r3 = r0.f269014a
                android.app.Activity r3 = r3.getContext()
                java.lang.String r4 = r1.f294992c
                int r1 = r1.f294993d
                int r1 = r1 + 10000
                android.content.Intent r5 = new android.content.Intent
                r5.<init>()
                java.lang.Class<com.tencent.mm.plugin.emoji.ui.v3.EmojiStoreV3TopicUI> r7 = com.tencent.p014mm.plugin.emoji.p040ui.p319v3.EmojiStoreV3TopicUI.class
                r5.setClass(r3, r7)
                java.lang.String r7 = "topic_name"
                r5.putExtra(r7, r4)
                java.lang.String r4 = "emotion_list_buf"
                r5.putExtra(r4, r2)
                java.lang.String r2 = "entrance_scene"
                r5.putExtra(r2, r1)
                java.lang.String r1 = "extra_ip_set_key"
                r5.putExtra(r1, r6)
                k20.a r1 = new k20.a
                r1.<init>()
                r1.mo10233c(r5)
                java.lang.Object[] r8 = r1.mo10232b()
                java.lang.String r9 = "com/tencent/mm/plugin/emoji/mgr/EmojiUINavigatorMgr"
                java.lang.String r10 = "startV3TopicEmotionList"
                java.lang.String r11 = "(Landroid/content/Context;Ljava/lang/String;[BILjava/lang/String;)V"
                java.lang.String r12 = "Undefined"
                java.lang.String r13 = "startActivity"
                java.lang.String r14 = "(Landroid/content/Intent;)V"
                r7 = r3
                j20.C117292a.m165358d(r7, r8, r9, r10, r11, r12, r13, r14)
                r2 = 0
                java.lang.Object r1 = r1.mo10231a(r2)
                android.content.Intent r1 = (android.content.Intent) r1
                r3.startActivity(r1)
                java.lang.String r8 = "com/tencent/mm/plugin/emoji/mgr/EmojiUINavigatorMgr"
                java.lang.String r9 = "startV3TopicEmotionList"
                java.lang.String r10 = "(Landroid/content/Context;Ljava/lang/String;[BILjava/lang/String;)V"
                java.lang.String r11 = "Undefined"
                java.lang.String r12 = "startActivity"
                java.lang.String r13 = "(Landroid/content/Intent;)V"
                j20.C117292a.m165359e(r7, r8, r9, r10, r11, r12, r13)
                goto L_0x01a7
            L_0x0114:
                boolean r3 = r2 instanceof p61.C100683x
                if (r3 == 0) goto L_0x011b
                p61.x r2 = (p61.C100683x) r2
                goto L_0x011c
            L_0x011b:
                r2 = r6
            L_0x011c:
                if (r2 == 0) goto L_0x0120
                x51.g r6 = r2.f294996a
            L_0x0120:
                if (r6 != 0) goto L_0x012c
                com.tencent.mm.plugin.emoji.ui.v3.EmojiStoreV3HomeBaseFragment r1 = r0.f269014a
                java.lang.String r1 = r1.f268992d
                java.lang.String r2 = "click Failed, type:1"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r2)
                return
            L_0x012c:
                com.tencent.mm.autogen.mmdata.rpt.EmoticonStoreActionStruct r11 = new com.tencent.mm.autogen.mmdata.rpt.EmoticonStoreActionStruct
                r11.<init>()
                com.tencent.mm.plugin.emoji.ui.v3.EmojiStoreV3HomeBaseFragment r2 = r0.f269014a
                int r3 = com.tencent.p014mm.plugin.emoji.p040ui.p319v3.EmojiStoreV3HomeBaseFragment.f268989C
                p61.m r2 = r2.mo127886L()
                p61.l r2 = r2.mo140098F4(r1)
                if (r2 == 0) goto L_0x014e
                int r3 = r2.f294883a
                int r1 = r1 - r3
                java.lang.String r1 = java.lang.String.valueOf(r1)
                r11.mo126613s(r1)
                int r1 = r2.f294885c
                long r1 = (long) r1
                r11.f265474j = r1
            L_0x014e:
                long r1 = q61.C101037a.f295825a
                r11.f265468d = r1
                r11.f265469e = r5
                r11.f265470f = r4
                te3.o80 r1 = r6.f301983b
                java.lang.String r1 = r1.f298994d
                r11.mo126618x(r1)
                te3.o80 r1 = r6.f301983b
                java.lang.String r1 = r1.f298996f
                r11.mo126614t(r1)
                te3.o80 r1 = r6.f301983b
                te3.j80 r1 = r1.f298993D
                int r1 = com.tencent.p014mm.plugin.emoji.model.EmojiLogic.m117482m(r1)
                java.lang.String r1 = java.lang.String.valueOf(r1)
                r11.mo126615u(r1)
                te3.o80 r1 = r6.f301983b
                te3.j80 r1 = r1.f298993D
                int r1 = com.tencent.p014mm.plugin.emoji.model.EmojiLogic.m117484o(r1)
                java.lang.String r1 = java.lang.String.valueOf(r1)
                r11.mo126617w(r1)
                te3.o80 r1 = r6.f301983b
                te3.j80 r1 = r1.f298993D
                java.lang.String r1 = com.tencent.p014mm.plugin.emoji.model.EmojiLogic.m117483n(r1)
                r11.mo126616v(r1)
                r11.mo86054n()
                com.tencent.mm.plugin.emoji.ui.v3.EmojiStoreV3HomeBaseFragment r1 = r0.f269014a
                android.app.Activity r3 = r1.getContext()
                te3.o80 r4 = r6.f301983b
                r5 = 0
                r1 = 1
                int r7 = r6.f301987f
                int r8 = r6.f301986e
                com.tencent.mm.plugin.emoji.ui.v3.EmojiStoreV3HomeBaseFragment r2 = r0.f269014a
                java.lang.String r9 = r2.f269006u
                r10 = 5
                r6 = r1
                i61.C98605n.m128202d(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            L_0x01a7:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.emoji.p040ui.p319v3.EmojiStoreV3HomeBaseFragment.C93264c.mo127715b(p61.j, int, p61.y):void");
        }
    }

    /* renamed from: com.tencent.mm.plugin.emoji.ui.v3.EmojiStoreV3HomeBaseFragment$d */
    public static final class C93265d extends MMHandler {

        /* renamed from: a */
        public final /* synthetic */ EmojiStoreV3HomeBaseFragment f269015a;

        public C93265d(EmojiStoreV3HomeBaseFragment emojiStoreV3HomeBaseFragment) {
            this.f269015a = emojiStoreV3HomeBaseFragment;
        }

        public void handleMessage(Message message) {
            String string;
            String string2;
            C87412m.m108594g(message, "msg");
            EmojiStoreV3HomeBaseFragment emojiStoreV3HomeBaseFragment = this.f269015a;
            emojiStoreV3HomeBaseFragment.getClass();
            int i = message.what;
            if (i == emojiStoreV3HomeBaseFragment.f268996h) {
                if (message.getData() != null && (string2 = message.getData().getString(emojiStoreV3HomeBaseFragment.f268993e)) != null) {
                    int i2 = message.getData().getInt(emojiStoreV3HomeBaseFragment.f268994f);
                    String str = emojiStoreV3HomeBaseFragment.f268992d;
                    Log.m105918d(str, "Update Progress " + i2 + ", productId:" + string2);
                    emojiStoreV3HomeBaseFragment.mo127886L().mo140102u5(new C100660k.C100661a(string2, i2));
                }
            } else if (i == emojiStoreV3HomeBaseFragment.f268997i) {
                if (message.getData() != null && (string = message.getData().getString(emojiStoreV3HomeBaseFragment.f268993e)) != null) {
                    emojiStoreV3HomeBaseFragment.mo127886L().mo140102u5(new C100660k.C100662b(string, message.getData().getInt(emojiStoreV3HomeBaseFragment.f268995g)));
                }
            } else if (i == emojiStoreV3HomeBaseFragment.f268998j) {
                emojiStoreV3HomeBaseFragment.mo127886L().mo140101g5(true);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.emoji.ui.v3.EmojiStoreV3HomeBaseFragment$e */
    public static final class C93266e implements MStorage.IOnStorageChange {

        /* renamed from: d */
        public final /* synthetic */ EmojiStoreV3HomeBaseFragment f269016d;

        public C93266e(EmojiStoreV3HomeBaseFragment emojiStoreV3HomeBaseFragment) {
            this.f269016d = emojiStoreV3HomeBaseFragment;
        }

        public final void onNotifyChange(String str, MStorageEventData mStorageEventData) {
            if (!TextUtils.isEmpty(str) && C87412m.m108589b(str, "delete_group_v3")) {
                String str2 = this.f269016d.f268992d;
                Log.m105924i(str2, "IOnStorageChange event:" + str + ", refreshUI");
                Object obj = mStorageEventData.obj;
                String str3 = obj instanceof String ? (String) obj : null;
                C93116n.f268258c.mo127626a();
                if (str3 != null) {
                    this.f269016d.mo127893S(str3, -1);
                }
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v6, resolved type: p61.y} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v5, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v6, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v7, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: K */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m117739K(com.tencent.p014mm.plugin.emoji.p040ui.p319v3.EmojiStoreV3HomeBaseFragment r3, java.lang.String r4, int r5, int r6, java.lang.String r7) {
        /*
            java.lang.String r0 = r3.f268992d
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "[onExchange] productId:["
            r1.append(r2)
            r1.append(r4)
            java.lang.String r2 = "] status:["
            r1.append(r2)
            r1.append(r5)
            java.lang.String r2 = "] progress:["
            r1.append(r2)
            r1.append(r6)
            java.lang.String r2 = "] cdnClientId:["
            r1.append(r2)
            r1.append(r7)
            r7 = 93
            r1.append(r7)
            java.lang.String r7 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r0, r7)
            java.lang.String r7 = ""
            r0 = 6
            if (r5 != r0) goto L_0x005d
            if (r4 != 0) goto L_0x003c
            r5 = r7
            goto L_0x003d
        L_0x003c:
            r5 = r4
        L_0x003d:
            android.os.Message r0 = android.os.Message.obtain()
            android.os.Bundle r1 = r0.getData()
            java.lang.String r2 = r3.f268993e
            r1.putString(r2, r5)
            android.os.Bundle r5 = r0.getData()
            java.lang.String r1 = r3.f268994f
            r5.putInt(r1, r6)
            int r5 = r3.f268996h
            r0.what = r5
            com.tencent.mm.sdk.platformtools.MMHandler r5 = r3.f269010y
            r5.sendMessage(r0)
            goto L_0x0077
        L_0x005d:
            java.lang.String r6 = r3.f268992d
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            java.lang.Integer r2 = java.lang.Integer.valueOf(r5)
            r0[r1] = r2
            java.lang.String r1 = "product status:%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r1, r0)
            if (r4 != 0) goto L_0x0073
            r6 = r7
            goto L_0x0074
        L_0x0073:
            r6 = r4
        L_0x0074:
            r3.mo127893S(r6, r5)
        L_0x0077:
            p61.m r3 = r3.mo127886L()
            if (r4 != 0) goto L_0x007e
            r4 = r7
        L_0x007e:
            java.util.HashMap<java.lang.String, java.lang.Integer> r5 = r3.f294891i
            java.lang.Object r5 = r5.get(r4)
            java.lang.Integer r5 = (java.lang.Integer) r5
            r6 = 0
            if (r5 == 0) goto L_0x00b7
            int r7 = r5.intValue()
            java.util.ArrayList<p61.y> r0 = r3.f294889g
            int r0 = r0.size()
            if (r7 >= r0) goto L_0x00b7
            java.util.ArrayList<p61.y> r3 = r3.f294889g
            int r5 = r5.intValue()
            java.lang.Object r3 = r3.get(r5)
            boolean r5 = r3 instanceof p61.C100683x
            if (r5 == 0) goto L_0x00a6
            p61.x r3 = (p61.C100683x) r3
            goto L_0x00a7
        L_0x00a6:
            r3 = r6
        L_0x00a7:
            if (r3 == 0) goto L_0x00b3
            x51.g r3 = r3.f294996a
            if (r3 == 0) goto L_0x00b3
            te3.o80 r3 = r3.f301983b
            if (r3 == 0) goto L_0x00b3
            java.lang.String r6 = r3.f298994d
        L_0x00b3:
            gy3.C87412m.m108589b(r6, r4)
            goto L_0x010d
        L_0x00b7:
            java.lang.String r5 = r3.f294888f
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r0 = "updateEmotionItemCdn find pos failed by productId:"
            r7.append(r0)
            r7.append(r4)
            java.lang.String r0 = ", updateEmotionItemCdn ergodic"
            r7.append(r0)
            java.lang.String r7 = r7.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r7)
            java.util.ArrayList<p61.y> r3 = r3.f294889g
            java.util.Iterator r3 = r3.iterator()
        L_0x00d9:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x0103
            java.lang.Object r5 = r3.next()
            r7 = r5
            p61.y r7 = (p61.C100684y) r7
            boolean r0 = r7 instanceof p61.C100683x
            if (r0 == 0) goto L_0x00ed
            p61.x r7 = (p61.C100683x) r7
            goto L_0x00ee
        L_0x00ed:
            r7 = r6
        L_0x00ee:
            if (r7 == 0) goto L_0x00fb
            x51.g r7 = r7.f294996a
            if (r7 == 0) goto L_0x00fb
            te3.o80 r7 = r7.f301983b
            if (r7 == 0) goto L_0x00fb
            java.lang.String r7 = r7.f298994d
            goto L_0x00fc
        L_0x00fb:
            r7 = r6
        L_0x00fc:
            boolean r7 = gy3.C87412m.m108589b(r7, r4)
            if (r7 == 0) goto L_0x00d9
            r6 = r5
        L_0x0103:
            p61.y r6 = (p61.C100684y) r6
            if (r6 == 0) goto L_0x010d
            boolean r3 = r6 instanceof p61.C100683x
            if (r3 == 0) goto L_0x010d
            p61.x r6 = (p61.C100683x) r6
        L_0x010d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.emoji.p040ui.p319v3.EmojiStoreV3HomeBaseFragment.m117739K(com.tencent.mm.plugin.emoji.ui.v3.EmojiStoreV3HomeBaseFragment, java.lang.String, int, int, java.lang.String):void");
    }

    /* renamed from: L */
    public final C100664m mo127886L() {
        return (C100664m) ((C36570n) this.f269008w).getValue();
    }

    /* renamed from: M */
    public final C100095g mo127887M() {
        return (C100095g) ((C36570n) this.f269009x).getValue();
    }

    /* renamed from: N */
    public abstract int mo127888N();

    /* JADX WARNING: Removed duplicated region for block: B:22:0x00d5  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00f4  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00fb  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0113  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x01b6  */
    /* renamed from: O */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo127889O() {
        /*
            r15 = this;
            n61.g r0 = r15.mo127887M()
            r1 = 1
            r0.f293233h = r1
            long r2 = java.lang.System.currentTimeMillis()
            r0.f293236n = r2
            te3.xh3 r2 = new te3.xh3
            r2.<init>()
            long r3 = r0.f293236n
            r2.f144663f = r3
            com.tencent.mm.autogen.mmdata.rpt.EmoticonStoreActionStruct r0 = r0.f293237o
            r0.f265468d = r3
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = "initeData sessionid: "
            r0.append(r3)
            long r2 = r2.f144663f
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = "MicroMsg.EmojiStoreV3HomeBaseDataRepo"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)
            androidx.fragment.app.FragmentActivity r0 = r15.thisActivity()
            android.content.Intent r0 = r0.getIntent()
            java.lang.String r3 = "preceding_scence"
            r4 = 5
            r0.getIntExtra(r3, r4)
            androidx.fragment.app.FragmentActivity r0 = r15.thisActivity()
            android.content.Intent r0 = r0.getIntent()
            java.lang.String r3 = "to_talker_name"
            java.lang.String r0 = r0.getStringExtra(r3)
            if (r0 != 0) goto L_0x0054
            java.lang.String r0 = ""
        L_0x0054:
            r15.f269006u = r0
            n61.g r0 = r15.mo127887M()
            r0.getClass()
            n61.g r0 = r15.mo127887M()
            r0.getClass()
            java.lang.Class<aq.g> r3 = p441aq.C92054g.class
            di3.d r3 = di3.C86312j.m106911c(r3)
            aq.g r3 = (p441aq.C92054g) r3
            r3.getClass()
            com.tencent.mm.storage.w2 r3 = com.tencent.p014mm.storage.C30790w2.m39221h()
            boolean[] r4 = r3.f82769a
            monitor-enter(r4)
            wh3.w r3 = r3.f82775g     // Catch:{ all -> 0x01e0 }
            monitor-exit(r4)     // Catch:{ all -> 0x01e0 }
            com.tencent.mm.sdk.storage.ISQLiteDatabase r5 = r3.f100798d
            r4 = 0
            r14 = 0
            if (r5 == 0) goto L_0x0096
            r7 = 0
            java.lang.String[] r9 = new java.lang.String[r1]
            java.lang.String r6 = java.lang.String.valueOf(r1)
            r9[r14] = r6
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 2
            java.lang.String r6 = "GetEmotionStoreRecListCache"
            java.lang.String r8 = "reqType=?"
            android.database.Cursor r5 = r5.query(r6, r7, r8, r9, r10, r11, r12, r13)
            goto L_0x0097
        L_0x0096:
            r5 = r4
        L_0x0097:
            if (r5 == 0) goto L_0x00d2
            boolean r6 = r5.moveToFirst()
            if (r6 == 0) goto L_0x00d2
            wh3.v r6 = new wh3.v
            r6.<init>()
            r6.convertFrom(r5)
            te3.i92 r7 = new te3.i92     // Catch:{ IOException -> 0x00c2 }
            r7.<init>()     // Catch:{ IOException -> 0x00c2 }
            byte[] r6 = r6.field_cache     // Catch:{ IOException -> 0x00c2 }
            r7.parseFrom(r6)     // Catch:{ IOException -> 0x00c2 }
            java.lang.String r6 = r3.f100799e     // Catch:{ IOException -> 0x00c2 }
            java.lang.String r8 = "succeed get cache: %d"
            java.lang.Object[] r9 = new java.lang.Object[r1]     // Catch:{ IOException -> 0x00c2 }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r1)     // Catch:{ IOException -> 0x00c2 }
            r9[r14] = r10     // Catch:{ IOException -> 0x00c2 }
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r6, r8, r9)     // Catch:{ IOException -> 0x00c2 }
            goto L_0x00d3
        L_0x00c2:
            r6 = move-exception
            java.lang.String r3 = r3.f100799e
            java.lang.Object[] r7 = new java.lang.Object[r1]
            java.lang.String r6 = com.tencent.p014mm.sdk.platformtools.Util.stackTraceToString(r6)
            r7[r14] = r6
            java.lang.String r6 = "exception:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r3, r6, r7)
        L_0x00d2:
            r7 = r4
        L_0x00d3:
            if (r5 == 0) goto L_0x00d8
            r5.close()
        L_0x00d8:
            com.tencent.mm.plugin.emoji.model.n r3 = new com.tencent.mm.plugin.emoji.model.n
            r3.<init>(r7)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "load cache type: "
            r5.append(r6)
            int r6 = r0.f293229d
            r5.append(r6)
            java.lang.String r6 = ", raw size: "
            r5.append(r6)
            if (r7 == 0) goto L_0x00fb
            int r6 = r7.f135181d
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            goto L_0x00fc
        L_0x00fb:
            r6 = r4
        L_0x00fc:
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r2, r5)
            java.util.List<p61.y> r5 = r3.f268261a
            java.util.List r5 = sx3.C110818d0.m150953y0(r5)
            boolean r5 = r5.isEmpty()
            r5 = r5 ^ r1
            if (r5 == 0) goto L_0x01b6
            androidx.lifecycle.z<java.lang.Integer> r5 = r0.f293238p
            int r6 = r0.f293244v
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r5.setValue(r6)
            r0.f293235j = r1
            r0.f293230e = r3
            androidx.lifecycle.z<java.lang.Integer> r5 = r0.f293238p
            int r6 = r0.f293239q
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r5.setValue(r6)
            jw.b$a r0 = r0.f293245w
            java.lang.String r5 = "onFinish"
            gy3.C87412m.m108594g(r0, r5)
            java.util.List<p61.y> r5 = r3.f268261a
            java.util.List r5 = sx3.C110818d0.m150953y0(r5)
            boolean r6 = eb0.C75592q0.m90796z()
            if (r6 != 0) goto L_0x0143
            goto L_0x01c1
        L_0x0143:
            boolean r6 = r5.isEmpty()
            if (r6 != 0) goto L_0x01c1
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r5 = r5.iterator()
        L_0x0152:
            boolean r7 = r5.hasNext()
            if (r7 == 0) goto L_0x0192
            java.lang.Object r7 = r5.next()
            p61.y r7 = (p61.C100684y) r7
            int r8 = r7.getType()
            if (r8 == r1) goto L_0x0165
            goto L_0x0152
        L_0x0165:
            boolean r8 = r7 instanceof p61.C100683x
            if (r8 == 0) goto L_0x016c
            p61.x r7 = (p61.C100683x) r7
            goto L_0x016d
        L_0x016c:
            r7 = r4
        L_0x016d:
            if (r7 == 0) goto L_0x0152
            x51.g r7 = r7.f294996a
            if (r7 != 0) goto L_0x0174
            goto L_0x0152
        L_0x0174:
            te3.o80 r7 = r7.f301983b
            boolean r8 = x51.C102561f.m135425e(r7)
            boolean r9 = x51.C102561f.m135422b(r7)
            if (r8 != 0) goto L_0x0152
            if (r9 != 0) goto L_0x0152
            java.lang.String r8 = r7.f298994d
            r6.add(r8)
            java.lang.String r7 = r7.f298994d
            com.tencent.mm.storage.r2 r7 = r3.mo127610b(r7)
            r8 = 11
            r7.f284148c = r8
            goto L_0x0152
        L_0x0192:
            android.content.Context r1 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            int r3 = r6.size()
            if (r3 <= 0) goto L_0x01c1
            java.lang.Class<jw.b> r3 = p179jw.C9531b.class
            di3.d r3 = di3.C86312j.m106911c(r3)
            jw.b r3 = (p179jw.C9531b) r3
            java.lang.String[] r4 = new java.lang.String[r14]
            java.lang.Object[] r4 = r6.toArray(r4)
            java.lang.String r5 = "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>"
            gy3.C87412m.m108592e(r4, r5)
            java.lang.String[] r4 = (java.lang.String[]) r4
            r3.mo10037oy(r1, r4, r0)
            goto L_0x01c1
        L_0x01b6:
            androidx.lifecycle.z<java.lang.Integer> r1 = r0.f293238p
            int r0 = r0.f293243u
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.setValue(r0)
        L_0x01c1:
            n61.g r0 = r15.mo127887M()
            r0.getClass()
            java.lang.String r1 = "loadNetWork"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r2, r1)
            java.lang.String r1 = "MicroMsg.EmojiStoreV3HomeBaseDataRepo"
            java.lang.String r2 = "[refreshNetSceneGetStoreRecList] request buffer is null."
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r2)
            j61.s r1 = new j61.s
            r1.<init>()
            r0.f293231f = r1
            r0.mo139404a()
            return
        L_0x01e0:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x01e0 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.emoji.p040ui.p319v3.EmojiStoreV3HomeBaseFragment.mo127889O():void");
    }

    /* renamed from: P */
    public abstract boolean mo127890P();

    /* renamed from: Q */
    public final void mo127891Q() {
        View view = this.f269002q;
        if (view != null) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/emoji/ui/v3/EmojiStoreV3HomeBaseFragment", "showEmptyUIState", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/emoji/ui/v3/EmojiStoreV3HomeBaseFragment", "showEmptyUIState", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        View view2 = this.f269003r;
        if (view2 != null) {
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar2.mo10233c(8);
            View view3 = view2;
            C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/plugin/emoji/ui/v3/EmojiStoreV3HomeBaseFragment", "showEmptyUIState", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view3, "com/tencent/mm/plugin/emoji/ui/v3/EmojiStoreV3HomeBaseFragment", "showEmptyUIState", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        RecyclerView recyclerView = this.f268999n;
        if (recyclerView != null) {
            recyclerView.setVisibility(8);
        }
    }

    /* renamed from: R */
    public final void mo127892R(boolean z) {
        if (mo127887M().f293234i) {
            Log.m105924i(this.f268992d, "startLoadRemoteEmoji isLoading");
            return;
        }
        C100095g M = mo127887M();
        M.getClass();
        Log.m105924i("MicroMsg.EmojiStoreV3HomeBaseDataRepo", "[refreshNetSceneGetStoreRecList] request buffer is null.");
        M.f293231f = new C33524s();
        mo127887M().mo139404a();
        Log.m105924i(this.f268992d, "[startLoadRemoteEmoji] doScene NetSceneGetEmotionStoreRecList");
    }

    /* renamed from: S */
    public final void mo127893S(String str, int i) {
        Message obtain = Message.obtain();
        obtain.getData().putString(this.f268993e, str);
        obtain.getData().putInt(this.f268995g, i);
        obtain.what = this.f268997i;
        this.f269010y.sendMessage(obtain);
    }

    /* renamed from: c0 */
    public void mo127894c0(String str, String str2, String str3, String str4, String str5) {
        C100095g M = mo127887M();
        M.getClass();
        M.f293232g = new C46439j(str, str2, str3, (String) null, str5);
        C100095g M2 = mo127887M();
        M2.getClass();
        C86709a0.m107529k().f251779b.mo123460f(M2.f293232g);
    }

    public int getForceOrientation() {
        return 1;
    }

    /* JADX WARNING: type inference failed for: r3v9, types: [android.view.View] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onActivityCreated(android.os.Bundle r3) {
        /*
            r2 = this;
            java.lang.String r0 = r2.f268992d
            java.lang.String r1 = "onActivityCreated"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r0, r1)
            super.onActivityCreated(r3)
            r3 = 1
            r2.f269005t = r3
            r3 = 2131301602(0x7f0914e2, float:1.8221267E38)
            android.view.View r3 = r2.findViewById(r3)
            r2.f269002q = r3
            r0 = 0
            if (r3 == 0) goto L_0x0024
            r1 = 2131301611(0x7f0914eb, float:1.8221285E38)
            android.view.View r3 = r3.findViewById(r1)
            android.widget.TextView r3 = (android.widget.TextView) r3
            goto L_0x0025
        L_0x0024:
            r3 = r0
        L_0x0025:
            boolean r3 = r3 instanceof android.widget.TextView
            r3 = 2131308017(0x7f092df1, float:1.8234278E38)
            android.view.View r3 = r2.findViewById(r3)
            r2.f269003r = r3
            r3 = 2131301590(0x7f0914d6, float:1.8221242E38)
            android.view.View r3 = r2.findViewById(r3)
            boolean r1 = r3 instanceof androidx.recyclerview.widget.RecyclerView
            if (r1 == 0) goto L_0x003e
            r0 = r3
            androidx.recyclerview.widget.RecyclerView r0 = (androidx.recyclerview.widget.RecyclerView) r0
        L_0x003e:
            r2.f268999n = r0
            if (r0 != 0) goto L_0x0043
            goto L_0x004f
        L_0x0043:
            androidx.recyclerview.widget.LinearLayoutManager r3 = new androidx.recyclerview.widget.LinearLayoutManager
            android.app.Activity r1 = r2.getContext()
            r3.<init>(r1)
            r0.setLayoutManager(r3)
        L_0x004f:
            p61.m r3 = r2.mo127886L()
            com.tencent.mm.plugin.emoji.ui.v3.EmojiStoreV3HomeBaseFragment$c r0 = r2.f268991B
            r3.getClass()
            java.lang.String r1 = "clickListener"
            gy3.C87412m.m108594g(r0, r1)
            r3.f294890h = r0
            p61.m r3 = r2.mo127886L()
            n61.i r0 = n61.C100097i.f293247d
            r3.f294894o = r0
            p61.m r3 = r2.mo127886L()
            n61.j r0 = n61.C100098j.f293248d
            r3.f294896q = r0
            p61.m r3 = r2.mo127886L()
            n61.k r0 = new n61.k
            r0.<init>(r2)
            r3.f294895p = r0
            androidx.recyclerview.widget.RecyclerView r3 = r2.f268999n
            if (r3 != 0) goto L_0x007f
            goto L_0x0086
        L_0x007f:
            p61.m r0 = r2.mo127886L()
            r3.setAdapter(r0)
        L_0x0086:
            n61.g r3 = r2.mo127887M()
            androidx.lifecycle.z<java.lang.Integer> r3 = r3.f293238p
            n61.m r0 = new n61.m
            r0.<init>(r2)
            r3.observe(r2, r0)
            boolean r3 = r2.f269004s
            if (r3 == 0) goto L_0x009b
            r2.mo127889O()
        L_0x009b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.emoji.p040ui.p319v3.EmojiStoreV3HomeBaseFragment.onActivityCreated(android.os.Bundle):void");
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        String str = this.f268992d;
        Log.m105918d(str, "onActivityResult . requestCode:" + i + "  resultCode:" + i2);
        super.onActivityResult(i, i2, intent);
        if (i != 0) {
            C100671r rVar = this.f269001p;
            if (rVar == null) {
                Log.m105924i(this.f268992d, "payOrDownloadComponent have no init.");
            } else if (rVar != null) {
                rVar.mo140108a(i, i2, intent);
            }
        } else if (i2 == -1) {
            C75026b.m89951a(thisActivity(), C76577a.m92166q(MMApplicationContext.getContext(), C0966R.string.a2x));
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        C87412m.m108594g(configuration, "newConfig");
        super.onConfigurationChanged(configuration);
        setRequestedOrientation(1);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setRequestedOrientation(1);
        this.f268990A.alive();
        ((C92054g) C86312j.m106911c(C92054g.class)).getClass();
        C30790w2.m39221h().mo57715b().add(this.f269011z);
        C78461f bounceView = getBounceView();
        if (bounceView != null) {
            bounceView.setStart2EndBgColor(getResources().getColor(C0966R.color.BW_93));
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C87412m.m108594g(layoutInflater, "inflater");
        Log.m105918d(this.f268992d, "onCreateView");
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        setHasOptionsMenu(false);
        return onCreateView;
    }

    public void onDestroy() {
        super.onDestroy();
        Log.m105918d(this.f268992d, "onDestroy");
        this.f268990A.dead();
        ((C92054g) C86312j.m106911c(C92054g.class)).getClass();
        C30790w2.m39221h().mo57715b().remove(this.f269011z);
        C100095g M = mo127887M();
        M.getClass();
        C86709a0.m107529k().f251779b.mo123470p(6910, M);
        C86709a0.m107529k().f251779b.mo123470p(v2helper.EMethodSetNgStrength, M);
    }

    public void onDestroyView() {
        super.onDestroyView();
        Log.m105918d(this.f268992d, "onDestroyView");
    }

    public void onDetach() {
        super.onDetach();
    }

    public void onPause() {
        super.onPause();
        Log.m105918d(this.f268992d, "onPause");
    }

    public void onResume() {
        Map<String, Integer> map;
        super.onResume();
        Log.m105918d(this.f268992d, "onResume");
        C100095g M = mo127887M();
        M.getClass();
        C86709a0.m107529k().f251779b.mo123455a(6910, M);
        C100095g M2 = mo127887M();
        M2.getClass();
        C86709a0.m107529k().f251779b.mo123455a(v2helper.EMethodSetNgStrength, M2);
        if (this.f269004s) {
            C100664m L = mo127886L();
            Class cls = C92054g.class;
            RecyclerView.LayoutManager layoutManager = null;
            if (!L.f294889g.isEmpty() && (map = ((C92054g) C86312j.m106911c(cls)).zx0().f268264b) != null && !((HashMap) map).isEmpty()) {
                Iterator<C100684y> it = L.f294889g.iterator();
                while (it.hasNext()) {
                    C100684y next = it.next();
                    if (next instanceof C100683x) {
                        C100683x xVar = (C100683x) next;
                        C102562g gVar = xVar.f294996a;
                        C101824o80 o802 = gVar != null ? gVar.f301983b : null;
                        if (o802 != null) {
                            int b = ((C92054g) C86312j.m106911c(cls)).zx0().mo127628b(o802.f298994d);
                            C102562g gVar2 = xVar.f294996a;
                            if (gVar2 != null) {
                                if (b >= 0) {
                                    gVar2.mo142189b(6);
                                    gVar2.f301986e = b;
                                }
                                if (b < 0 && gVar2.f301987f == 6) {
                                    gVar2.mo142189b(3);
                                }
                            }
                        }
                    }
                }
            }
            C85801v1 i = C86709a0.m107535s().mo121142i();
            Boolean bool = Boolean.FALSE;
            Object e = i.mo119684e(208900, bool);
            C87412m.m108592e(e, "null cannot be cast to non-null type kotlin.Boolean");
            if (((Boolean) e).booleanValue()) {
                Log.m105924i(this.f268992d, "onResume needRefreshList");
                mo127892R(false);
                C86709a0.m107535s().mo121142i().mo119676J(208900, bool);
            }
            C100664m L2 = mo127886L();
            RecyclerView recyclerView = this.f268999n;
            if (recyclerView != null) {
                layoutManager = recyclerView.getLayoutManager();
            }
            L2.mo140099G4(layoutManager);
        }
    }

    public void onStop() {
        super.onStop();
        Log.m105918d(this.f268992d, "onStop");
    }

    public void setUserVisibleHint(boolean z) {
        String str = this.f268992d;
        Log.m105918d(str, "setUserVisibleHint :" + z);
        super.setUserVisibleHint(z);
        this.f269004s = z;
        if (!mo127887M().f293233h && this.f269005t) {
            mo127889O();
        }
        if (this.f269004s) {
            this.f269010y.sendEmptyMessageDelayed(this.f268998j, 0);
            Log.m105918d(this.f268992d, "setUserVisibleHint try report 18662, 12875");
            C100664m L = mo127886L();
            RecyclerView recyclerView = this.f268999n;
            L.mo140099G4(recyclerView != null ? recyclerView.getLayoutManager() : null);
            return;
        }
        this.f269010y.removeMessages(this.f268998j);
        mo127886L().mo140101g5(false);
    }

    public boolean supportNavigationSwipeBack() {
        return false;
    }

    /* renamed from: y */
    public void mo127895y() {
        mo127892R(false);
    }
}
