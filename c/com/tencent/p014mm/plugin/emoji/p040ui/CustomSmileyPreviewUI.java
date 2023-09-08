package com.tencent.p014mm.plugin.emoji.p040ui;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.EmotionStateChangeEvent;
import com.tencent.p014mm.autogen.events.RevokeMsgEvent;
import com.tencent.p014mm.emoji.view.EmojiStatusView;
import com.tencent.p014mm.p136ui.C74928u;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.p136ui.widget.snackbar.C75026b;
import com.tencent.p014mm.plugin.emoji.model.C93108e0;
import com.tencent.p014mm.plugin.emoji.model.EmojiLogic;
import com.tencent.p014mm.plugin.emoji.p040ui.p041v2.EmojiStoreV2DesignerUI;
import com.tencent.p014mm.plugin.emoji.p040ui.widget.ScaleRelativeLayout;
import com.tencent.p014mm.plugin.mvvmbase.BaseMvvmActivity;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C30790w2;
import com.tencent.p014mm.storage.emotion.EmojiInfo;
import com.tencent.xweb.util.WXWebReporter;
import di3.C86312j;
import f40.C86709a0;
import j20.C117292a;
import j61.C33521l;
import j61.C33522n;
import j61.C46439j;
import j61.C46441o;
import j61.C46443q;
import j61.C60779m;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import k20.C9556a;
import ke3.C88144b;
import ky2.C10432i;
import nj3.C76879j;
import ob0.C11385n;
import ob0.C117747y;
import p441aq.C92054g;
import pe3.C47465a;
import s61.C101542b;
import s61.C101543c;
import s61.C101551k;
import te3.C101776f80;
import te3.C101792j80;
import te3.C101824o80;
import te3.C101866x70;
import te3.C50330lz1;
import te3.C50614nz1;
import te3.C50892pz1;
import te3.C52325zy1;
import u61.C101962d;
import w51.C102330b;
import wh3.C38145t;
import wh3.C38146u;
import x51.C102556d;
import x51.C102559e;
import x51.C102562g;
import y51.C66551a;
import z51.C39315g;

/* renamed from: com.tencent.mm.plugin.emoji.ui.CustomSmileyPreviewUI */
public class CustomSmileyPreviewUI extends BaseMvvmActivity implements C11385n, C93108e0.C93110b, C93108e0.C93111c, AdapterView.OnItemClickListener {

    /* renamed from: a1 */
    public static final /* synthetic */ int f268306a1 = 0;

    /* renamed from: A */
    public ScaleRelativeLayout f268307A;

    /* renamed from: B */
    public TextView f268308B;

    /* renamed from: C */
    public EmojiStatusView f268309C;

    /* renamed from: D */
    public View f268310D;

    /* renamed from: E */
    public TextView f268311E;

    /* renamed from: F */
    public View f268312F;

    /* renamed from: G */
    public boolean f268313G = false;

    /* renamed from: H */
    public boolean f268314H = false;

    /* renamed from: I */
    public ViewGroup f268315I;

    /* renamed from: J */
    public ImageView f268316J;

    /* renamed from: K */
    public TextView f268317K;

    /* renamed from: L */
    public TextView f268318L;

    /* renamed from: M */
    public View f268319M;

    /* renamed from: N */
    public TextView f268320N;

    /* renamed from: P */
    public Button f268321P;

    /* renamed from: Q */
    public C93108e0 f268322Q;

    /* renamed from: Q0 */
    public boolean f268323Q0 = false;

    /* renamed from: R */
    public C46439j f268324R;

    /* renamed from: R0 */
    public boolean f268325R0 = false;

    /* renamed from: S */
    public C46441o f268326S;

    /* renamed from: S0 */
    public CustomSmileyPreviewUI$$l f268327S0 = CustomSmileyPreviewUI$$l.NONE;

    /* renamed from: T */
    public C33521l f268328T;

    /* renamed from: T0 */
    public C101551k f268329T0;

    /* renamed from: U */
    public C50330lz1 f268330U;

    /* renamed from: U0 */
    public Runnable f268331U0 = new CustomSmileyPreviewUI$$d(this);

    /* renamed from: V */
    public C33522n f268332V;

    /* renamed from: V0 */
    public Runnable f268333V0 = new CustomSmileyPreviewUI$$f(this);

    /* renamed from: W */
    public C50614nz1 f268334W;

    /* renamed from: W0 */
    public IListener f268335W0;

    /* renamed from: X */
    public long f268336X;

    /* renamed from: X0 */
    public IListener f268337X0;

    /* renamed from: Y */
    public String f268338Y;

    /* renamed from: Y0 */
    public int f268339Y0;

    /* renamed from: Z */
    public String f268340Z;

    /* renamed from: Z0 */
    public C101542b f268341Z0;

    /* renamed from: d */
    public ListView f268342d;

    /* renamed from: e */
    public C102559e f268343e;

    /* renamed from: f */
    public View f268344f;

    /* renamed from: g */
    public ImageView f268345g;

    /* renamed from: h */
    public TextView f268346h;

    /* renamed from: i */
    public TextView f268347i;

    /* renamed from: j */
    public ViewGroup f268348j;

    /* renamed from: n */
    public ImageView f268349n;

    /* renamed from: o */
    public TextView f268350o;

    /* renamed from: p */
    public TextView f268351p;

    /* renamed from: p0 */
    public String f268352p0;

    /* renamed from: q */
    public TextView f268353q;

    /* renamed from: r */
    public View f268354r;

    /* renamed from: s */
    public C52325zy1 f268355s;

    /* renamed from: t */
    public C101776f80 f268356t = new C101776f80();

    /* renamed from: u */
    public String f268357u;

    /* renamed from: v */
    public List<C101543c> f268358v = new ArrayList();

    /* renamed from: w */
    public int f268359w;

    /* renamed from: x */
    public long f268360x;

    /* renamed from: x0 */
    public String f268361x0;

    /* renamed from: y */
    public String f268362y;

    /* renamed from: y0 */
    public boolean f268363y0 = false;

    /* renamed from: z */
    public EmojiInfo f268364z;

    public CustomSmileyPreviewUI() {
        C40008f fVar = C40008f.f107254d;
        this.f268335W0 = new IListener<EmotionStateChangeEvent>(fVar) {
            {
                this.__eventId = 449099204;
            }

            public boolean callback(IEvent iEvent) {
                C102556d dVar;
                EmotionStateChangeEvent emotionStateChangeEvent = (EmotionStateChangeEvent) iEvent;
                if (emotionStateChangeEvent != null && !Util.isNullOrNil(CustomSmileyPreviewUI.this.f268362y) && CustomSmileyPreviewUI.this.f268362y.equals(emotionStateChangeEvent.f264696d.f264697a)) {
                    CustomSmileyPreviewUI customSmileyPreviewUI = CustomSmileyPreviewUI.this;
                    EmotionStateChangeEvent.C92476a aVar = emotionStateChangeEvent.f264696d;
                    String str = aVar.f264697a;
                    int i = aVar.f264698b;
                    int i2 = aVar.f264699c;
                    String str2 = aVar.f264700d;
                    customSmileyPreviewUI.getClass();
                    Log.m105919d("MicroMsg.emoji.CustomSmileyPreviewUI", "[onExchange] productId:[%s] status:[%d] progress:[%d] cdnClientId:[%s]", str, Integer.valueOf(i), Integer.valueOf(i2), str2);
                    if (i == 6) {
                        MMHandlerThread.postToMainThread(new C93197l(customSmileyPreviewUI, str, i2));
                    } else {
                        Log.m105925i("MicroMsg.emoji.CustomSmileyPreviewUI", "product status:%d", Integer.valueOf(i));
                        MMHandlerThread.postToMainThread(new C93199m(customSmileyPreviewUI, str, i));
                    }
                    C102559e eVar = customSmileyPreviewUI.f268343e;
                    if (!(eVar == null || (dVar = eVar.f301966e) == null)) {
                        dVar.mo142184l(str);
                    }
                }
                return false;
            }
        };
        this.f268337X0 = new IListener<RevokeMsgEvent>(fVar) {
            {
                this.__eventId = 675629679;
            }

            public boolean callback(IEvent iEvent) {
                RevokeMsgEvent revokeMsgEvent = (RevokeMsgEvent) iEvent;
                long j = CustomSmileyPreviewUI.this.f268336X;
                if (j != 0 && revokeMsgEvent.f78943d.f78948e == j) {
                    Log.m105924i("MicroMsg.emoji.CustomSmileyPreviewUI", "msg is revoked.");
                    try {
                        C76879j.m92711E(CustomSmileyPreviewUI.this.getContext(), revokeMsgEvent.f78943d.f78945b, "", CustomSmileyPreviewUI.this.getString(C0966R.string.a18), false, new C93203o(this));
                    } catch (Throwable th) {
                        Log.printErrStackTrace("MicroMsg.emoji.CustomSmileyPreviewUI", th, "show alert err", new Object[0]);
                    }
                }
                return false;
            }
        };
        this.f268339Y0 = 0;
        this.f268341Z0 = new CustomSmileyPreviewUI$$e(this);
    }

    /* renamed from: H7 */
    public static void m117568H7(CustomSmileyPreviewUI customSmileyPreviewUI, boolean z) {
        customSmileyPreviewUI.f268325R0 = z;
        if (z) {
            int ordinal = customSmileyPreviewUI.f268327S0.ordinal();
            if (ordinal == 1) {
                C101962d.f300168a.mo141485c(customSmileyPreviewUI.f268308B, customSmileyPreviewUI.f268342d, customSmileyPreviewUI.f268354r);
            } else if (ordinal == 2 || ordinal == 3) {
                C101962d.f300168a.mo141485c(customSmileyPreviewUI.f268308B, customSmileyPreviewUI.f268344f, customSmileyPreviewUI.f268354r, customSmileyPreviewUI.f268310D);
            } else if (ordinal != 4) {
                C101962d.f300168a.mo141485c(customSmileyPreviewUI.f268308B);
            } else {
                C101962d.f300168a.mo141485c(customSmileyPreviewUI.f268312F);
            }
        } else {
            int ordinal2 = customSmileyPreviewUI.f268327S0.ordinal();
            if (ordinal2 == 1) {
                C101962d.f300168a.mo141486d(customSmileyPreviewUI.f268308B, customSmileyPreviewUI.f268342d, customSmileyPreviewUI.f268354r);
            } else if (ordinal2 == 2 || ordinal2 == 3) {
                C101962d.f300168a.mo141486d(customSmileyPreviewUI.f268308B, customSmileyPreviewUI.f268344f, customSmileyPreviewUI.f268354r);
            } else if (ordinal2 != 4) {
                C101962d.f300168a.mo141486d(customSmileyPreviewUI.f268308B);
            } else {
                C101962d.f300168a.mo141486d(customSmileyPreviewUI.f268312F);
            }
        }
    }

    /* renamed from: I7 */
    public final EmojiInfo mo127672I7() {
        String stringExtra = getIntent().getStringExtra("custom_smiley_preview_md5");
        ((C92054g) C86312j.m106911c(C92054g.class)).getClass();
        EmojiInfo TO = C30790w2.m39221h().mo57717d().mo142044TO(stringExtra);
        if (TO != null) {
            return TO;
        }
        if (this.f268364z == null) {
            return null;
        }
        C30790w2.m39221h().mo57717d().mo142040Ow(this.f268364z);
        return this.f268364z;
    }

    /* renamed from: J7 */
    public final void mo127673J7() {
        Intent intent = new Intent();
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.f268340Z);
        intent.putStringArrayListExtra("k_outside_expose_proof_item_list", arrayList);
        if (Util.isNullOrNil(this.f268352p0)) {
            intent.putExtra("k_username", this.f268338Y);
        } else {
            intent.putExtra("k_username", this.f268352p0);
        }
        intent.putExtra("k_expose_msg_id", this.f268336X);
        intent.putExtra("k_expose_msg_type", 47);
        intent.putExtra("showShare", false);
        intent.putExtra("rawUrl", String.format(C74928u.C45092d.f122306a, new Object[]{51}));
        C88144b.m109791i(this, "webview", ".ui.tools.WebViewUI", intent, (Bundle) null);
    }

    /* renamed from: K7 */
    public Intent mo127674K7(C101824o80 o802, int i) {
        Intent intent = new Intent();
        intent.setClass(this, EmojiStoreDetailUI.class);
        if (o802 == null) {
            return null;
        }
        intent.putExtra("extra_id", o802.f298994d);
        intent.putExtra("extra_name", o802.f298996f);
        intent.putExtra("extra_copyright", o802.f299004q);
        intent.putExtra("extra_coverurl", o802.f299002o);
        intent.putExtra("extra_description", o802.f298997g);
        intent.putExtra("extra_price", o802.f298999i);
        intent.putExtra("extra_type", o802.f299000j);
        intent.putExtra("extra_flag", o802.f299001n);
        intent.putExtra("preceding_scence", 4);
        intent.putExtra("call_by", 1);
        intent.putExtra("download_entrance_scene", i);
        intent.putExtra("check_clickflag", true);
        String stringExtra = getIntent().getStringExtra("to_talker_name");
        if (!Util.isNullOrNil(stringExtra)) {
            intent.putExtra("to_talker_name", stringExtra);
        }
        return intent;
    }

    /* renamed from: L7 */
    public final void mo127675L7(int i) {
        C50330lz1 lz12;
        C101866x70 x702;
        int ordinal = this.f268327S0.ordinal();
        if (ordinal == 1) {
            C102559e eVar = this.f268343e;
            if (eVar != null && eVar.getCount() > 0) {
                Intent K7 = mo127674K7(this.f268343e.getItem(0).f301983b, i);
                C9556a aVar = new C9556a();
                aVar.mo10233c(K7);
                C117292a.m165358d(this, aVar.mo10232b(), "com/tencent/mm/plugin/emoji/ui/CustomSmileyPreviewUI", "onClickByShowingType", "(I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                startActivity((Intent) aVar.mo10231a(0));
                C117292a.m165359e(this, "com/tencent/mm/plugin/emoji/ui/CustomSmileyPreviewUI", "onClickByShowingType", "(I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            }
        } else if (ordinal == 2) {
            C52325zy1 zy12 = this.f268355s;
            if (zy12 == null || zy12.f146279d == null) {
                Log.m105924i("MicroMsg.emoji.CustomSmileyPreviewUI", "simple designer info is null");
                return;
            }
            Intent intent = new Intent();
            intent.setClass(getContext(), EmojiStoreV2DesignerUI.class);
            intent.putExtra("uin", this.f268355s.f146279d.f136019d);
            intent.putExtra("name", this.f268355s.f146279d.f136020e);
            intent.putExtra("headurl", this.f268355s.f146279d.f136021f);
            intent.putExtra("extra_scence", i);
            AppCompatActivity context = getContext();
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(intent);
            AppCompatActivity appCompatActivity = context;
            C117292a.m165358d(appCompatActivity, aVar2.mo10232b(), "com/tencent/mm/plugin/emoji/ui/CustomSmileyPreviewUI", "onClickByShowingType", "(I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((Intent) aVar2.mo10231a(0));
            C117292a.m165359e(appCompatActivity, "com/tencent/mm/plugin/emoji/ui/CustomSmileyPreviewUI", "onClickByShowingType", "(I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        } else if (ordinal == 3 && (lz12 = this.f268330U) != null && (x702 = lz12.f137724d) != null && !Util.isNullOrNil(x702.f299854f)) {
            String str = this.f268330U.f137724d.f299854f;
            Intent intent2 = new Intent();
            intent2.putExtra("showShare", true);
            intent2.putExtra("rawUrl", str);
            C88144b.m109791i(this, "webview", ".ui.tools.WebViewUI", intent2, (Bundle) null);
            C115669n nVar = C115669n.INSTANCE;
            EmojiInfo emojiInfo = this.f268364z;
            nVar.mo160131h(12789, 4, this.f268364z.getMd5(), 1, emojiInfo.field_designerID, emojiInfo.field_groupId, "", "", "", "", emojiInfo.field_activityid);
        }
    }

    /* renamed from: M7 */
    public final void mo127676M7(String str, EmojiInfo emojiInfo) {
        int i;
        int i2;
        if (!Util.isNullOrNil(str) && emojiInfo != null) {
            if (Util.isNullOrNil(str) || (i = emojiInfo.field_catalog) == 18 || i == 17 || ((i2 = emojiInfo.field_type) == 10 && i2 == 11)) {
                ListView listView = this.f268342d;
                if (listView != null) {
                    listView.setVisibility(8);
                    return;
                }
                return;
            }
            ListView listView2 = this.f268342d;
            if (listView2 != null) {
                listView2.setVisibility(0);
                this.f268327S0 = CustomSmileyPreviewUI$$l.EMOTION;
            }
            C102559e eVar = this.f268343e;
            if (eVar != null) {
                eVar.f301979o = this.f268363y0;
                eVar.notifyDataSetChanged();
            }
        }
    }

    /* renamed from: N7 */
    public final void mo127677N7() {
        ArrayList arrayList = new ArrayList();
        C101824o80 o802 = new C101824o80();
        C101776f80 f802 = this.f268356t;
        o802.f299002o = f802.f298245q;
        o802.f298995e = f802.f298236e;
        o802.f298996f = f802.f298237f;
        o802.f299001n = f802.f298242n;
        o802.f298997g = f802.f298238g;
        o802.f299003p = f802.f298246r;
        o802.f299000j = f802.f298241j;
        o802.f298999i = f802.f298240i;
        o802.f299007t = f802.f298248t;
        o802.f299008u = f802.f298249u;
        o802.f298994d = f802.f298235d;
        o802.f298991B = f802.f298233I;
        o802.f298990A = f802.f298232H;
        C50614nz1 nz12 = this.f268334W;
        if (nz12 != null) {
            o802.f298993D = nz12.f138862j;
        }
        C102562g gVar = new C102562g(o802);
        gVar.f301985d = f802;
        arrayList.add(gVar);
        C102556d dVar = new C102556d(arrayList);
        Log.m105925i("MicroMsg.emoji.CustomSmileyPreviewUI", "updateEmojiActivity: %s", this.f268356t.f298230F);
        C102559e eVar = this.f268343e;
        if (eVar != null) {
            eVar.f301979o = this.f268363y0;
            if (eVar.f301966e != dVar) {
                eVar.f301966e = dVar.clone();
                eVar.notifyDataSetChanged();
            }
        }
        this.f268342d.setVisibility(0);
        this.f268315I.setVisibility(8);
        this.f268327S0 = CustomSmileyPreviewUI$$l.EMOTION;
        mo127678O7(this.f268358v);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001a, code lost:
        r0 = r0.getItem(0);
     */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x009a A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x009b  */
    /* renamed from: O7 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo127678O7(java.util.List<s61.C101543c> r15) {
        /*
            r14 = this;
            com.tencent.mm.plugin.emoji.ui.CustomSmileyPreviewUI$$l r0 = r14.f268327S0
            com.tencent.mm.plugin.emoji.ui.CustomSmileyPreviewUI$$l r1 = com.tencent.p014mm.plugin.emoji.p040ui.CustomSmileyPreviewUI$$l.NONE
            r2 = 2131301554(0x7f0914b2, float:1.822117E38)
            r3 = 1
            r4 = 0
            if (r0 != r1) goto L_0x000e
        L_0x000b:
            r0 = 0
            goto L_0x0098
        L_0x000e:
            com.tencent.mm.plugin.emoji.ui.CustomSmileyPreviewUI$$l r1 = com.tencent.p014mm.plugin.emoji.p040ui.CustomSmileyPreviewUI$$l.EMOTION
            if (r0 != r1) goto L_0x0083
            x51.e r0 = r14.f268343e
            int r1 = r0.getCount()
            if (r1 != r3) goto L_0x0027
            x51.g r0 = r0.getItem(r4)
            if (r0 == 0) goto L_0x0027
            int r0 = r0.f301987f
            r1 = 7
            if (r0 != r1) goto L_0x0027
            r0 = 1
            goto L_0x0028
        L_0x0027:
            r0 = 0
        L_0x0028:
            if (r0 == 0) goto L_0x0083
            boolean r0 = r14.f268323Q0
            if (r0 == 0) goto L_0x000b
            android.view.View r0 = r14.f268354r
            if (r0 == 0) goto L_0x000b
            r1 = 8
            k20.a r13 = new k20.a
            r13.<init>()
            java.lang.ThreadLocal<k20.a> r5 = k20.C60958c.f173611a
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r13.mo10233c(r1)
            java.lang.Object[] r6 = r13.mo10232b()
            java.lang.String r7 = "com/tencent/mm/plugin/emoji/ui/CustomSmileyPreviewUI"
            java.lang.String r8 = "checkIfNeedShowPreviewRelativeEmotionList"
            java.lang.String r9 = "(Ljava/util/List;)Z"
            java.lang.String r10 = "android/view/View_EXEC_"
            java.lang.String r11 = "setVisibility"
            java.lang.String r12 = "(I)V"
            r5 = r0
            j20.C117292a.m165358d(r5, r6, r7, r8, r9, r10, r11, r12)
            java.lang.Object r1 = r13.mo10231a(r4)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r0.setVisibility(r1)
            java.lang.String r6 = "com/tencent/mm/plugin/emoji/ui/CustomSmileyPreviewUI"
            java.lang.String r7 = "checkIfNeedShowPreviewRelativeEmotionList"
            java.lang.String r8 = "(Ljava/util/List;)Z"
            java.lang.String r9 = "android/view/View_EXEC_"
            java.lang.String r10 = "setVisibility"
            java.lang.String r11 = "(I)V"
            j20.C117292a.m165359e(r5, r6, r7, r8, r9, r10, r11)
            android.view.View r0 = r14.findViewById(r2)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            android.view.View r1 = r14.f268354r
            r0.removeView(r1)
            r0 = 0
            r14.f268354r = r0
            goto L_0x000b
        L_0x0083:
            if (r15 == 0) goto L_0x008e
            boolean r0 = r15.isEmpty()
            if (r0 == 0) goto L_0x008c
            goto L_0x008e
        L_0x008c:
            r0 = 1
            goto L_0x0098
        L_0x008e:
            java.lang.String r0 = "MicroMsg.emoji.CustomSmileyPreviewUI"
            java.lang.String r1 = "no real relative preview data, not show preview list"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
            goto L_0x000b
        L_0x0098:
            if (r0 != 0) goto L_0x009b
            return
        L_0x009b:
            boolean r0 = r14.f268323Q0
            if (r0 == 0) goto L_0x00ec
            s61.k r0 = r14.f268329T0
            if (r0 == 0) goto L_0x00eb
            if (r15 == 0) goto L_0x00eb
            boolean r0 = r15.isEmpty()
            if (r0 == 0) goto L_0x00ac
            goto L_0x00eb
        L_0x00ac:
            s61.k r0 = r14.f268329T0
            r0.getClass()
            java.lang.String r1 = r0.f297293e
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "updateDiffData before size:"
            r2.append(r3)
            java.util.ArrayList<s61.c> r3 = r0.f297294f
            int r3 = r3.size()
            r2.append(r3)
            java.lang.String r3 = " afterSize:"
            r2.append(r3)
            int r3 = r15.size()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r2)
            s61.j r1 = new s61.j
            r1.<init>(r0, r15)
            androidx.recyclerview.widget.l$c r1 = androidx.recyclerview.widget.C54248l.m60949a(r1, r4)
            s61.i r2 = new s61.i
            r2.<init>(r0, r15)
            r1.mo75045a(r2)
        L_0x00eb:
            return
        L_0x00ec:
            android.view.View r0 = r14.findViewById(r2)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            androidx.appcompat.app.AppCompatActivity r1 = r14.getContext()
            android.view.LayoutInflater r1 = com.tencent.p014mm.p136ui.C85868k2.m106137b(r1)
            r2 = 2131494169(0x7f0c0519, float:1.8611839E38)
            android.view.View r1 = r1.inflate(r2, r0, r4)
            r2 = 2131311271(0x7f093aa7, float:1.8240878E38)
            android.view.View r2 = r1.findViewById(r2)
            com.tencent.mm.plugin.emoji.ui.v3.widget.preview.PreviewRelativeEmotionRecyclerView r2 = (com.tencent.p014mm.plugin.emoji.p040ui.p319v3.widget.preview.PreviewRelativeEmotionRecyclerView) r2
            androidx.recyclerview.widget.LinearLayoutManager r5 = new androidx.recyclerview.widget.LinearLayoutManager
            androidx.appcompat.app.AppCompatActivity r6 = r14.getContext()
            r5.<init>(r6, r4, r4)
            r2.setLayoutManager(r5)
            s61.l r5 = new s61.l
            androidx.appcompat.app.AppCompatActivity r6 = r14.getContext()
            r5.<init>(r6)
            r2.mo17085h0(r5)
            s61.k r5 = new s61.k
            androidx.appcompat.app.AppCompatActivity r6 = r14.getContext()
            r5.<init>(r6)
            s61.b r6 = r14.f268341Z0
            java.lang.String r7 = "listener"
            gy3.C87412m.m108594g(r6, r7)
            r5.f297295g = r6
            r2.setAdapter(r5)
            java.lang.String r2 = "newData"
            gy3.C87412m.m108594g(r15, r2)
            java.util.ArrayList<s61.c> r2 = r5.f297294f
            r2.clear()
            java.util.ArrayList<s61.c> r2 = r5.f297294f
            r2.addAll(r15)
            int r2 = r15.size()
            r5.notifyItemRangeChanged(r4, r2)
            java.lang.String r2 = r5.f297293e
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r6 = "updateNewData Size:"
            r4.append(r6)
            int r15 = r15.size()
            r4.append(r15)
            java.lang.String r15 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r15)
            r14.f268329T0 = r5
            r14.f268323Q0 = r3
            r14.f268354r = r1
            r0.addView(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.emoji.p040ui.CustomSmileyPreviewUI.mo127678O7(java.util.List):void");
    }

    /* renamed from: c0 */
    public void mo127624c0(String str, String str2, String str3, String str4, String str5) {
        this.f268324R = new C46439j(str, str2, str3, (String) null, str5);
        C86709a0.m107529k().f251779b.mo123460f(this.f268324R);
    }

    public int getForceOrientation() {
        return 1;
    }

    public int getLayoutId() {
        return C0966R.C0971layout.f7113yp;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v27, resolved type: te3.lz1} */
    /* JADX WARNING: type inference failed for: r9v25 */
    /* JADX WARNING: type inference failed for: r9v28, types: [android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r9v29 */
    /* JADX WARNING: type inference failed for: r9v30 */
    /* JADX WARNING: type inference failed for: r9v31 */
    /* JADX WARNING: type inference failed for: r9v32 */
    /* JADX WARNING: type inference failed for: r9v41 */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x041d, code lost:
        if (((i61.C98602h) ((z51.C39315g) di3.C86312j.m106911c(r2)).mo58035cm()).mo138006M(r1.f268364z.field_groupId) != false) goto L_0x041f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x05cf, code lost:
        if (r2 != null) goto L_0x05e3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x05e1, code lost:
        if (r2 != null) goto L_0x05e3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x05e3, code lost:
        r2.close();
        r9 = r9;
     */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x0603  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x0632  */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x0634  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x063c  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0531  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0587  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x058d A[SYNTHETIC, Splitter:B:81:0x058d] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void initView() {
        /*
            r20 = this;
            r1 = r20
            java.lang.Class<z51.g> r2 = z51.C39315g.class
            java.lang.Class<aq.g> r3 = p441aq.C92054g.class
            java.lang.String r4 = ""
            r1.setMMTitle((java.lang.String) r4)
            android.content.Intent r0 = r20.getIntent()
            java.lang.String r5 = "custom_smiley_preview_md5"
            java.lang.String r0 = r0.getStringExtra(r5)
            long r5 = eb0.C31543z5.m39451a()
            r1.f268360x = r5
            android.content.Intent r5 = r20.getIntent()
            java.lang.String r6 = "scene"
            r7 = 9
            int r5 = r5.getIntExtra(r6, r7)
            r1.f268359w = r5
            android.content.Intent r5 = r20.getIntent()
            java.lang.String r6 = "msg_id"
            r7 = 0
            long r5 = r5.getLongExtra(r6, r7)
            r1.f268336X = r5
            android.content.Intent r5 = r20.getIntent()
            java.lang.String r6 = "msg_sender"
            java.lang.String r5 = r5.getStringExtra(r6)
            r1.f268338Y = r5
            android.content.Intent r5 = r20.getIntent()
            java.lang.String r6 = "msg_content"
            java.lang.String r5 = r5.getStringExtra(r6)
            r1.f268340Z = r5
            android.content.Intent r5 = r20.getIntent()
            java.lang.String r6 = "room_id"
            java.lang.String r5 = r5.getStringExtra(r6)
            r1.f268352p0 = r5
            android.content.Intent r5 = r20.getIntent()
            java.lang.String r6 = "talker_username"
            java.lang.String r5 = r5.getStringExtra(r6)
            r1.f268361x0 = r5
            r5 = 1
            java.lang.Object[] r6 = new java.lang.Object[r5]
            r7 = 0
            r6[r7] = r0
            java.lang.String r8 = "MicroMsg.emoji.CustomSmileyPreviewUI"
            java.lang.String r9 = "[initView] md5:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r8, r9, r6)
            java.lang.String r6 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r0)
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            if (r0 == 0) goto L_0x008c
            java.lang.String r0 = "CustomSmileyPreviewUI ini fail md5 is fail"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r8, r0)
            r20.finish()
        L_0x008c:
            r0 = 2131301552(0x7f0914b0, float:1.8221165E38)
            android.view.View r0 = r1.findViewById(r0)
            com.tencent.mm.plugin.emoji.ui.widget.ScaleRelativeLayout r0 = (com.tencent.p014mm.plugin.emoji.p040ui.widget.ScaleRelativeLayout) r0
            r1.f268307A = r0
            r0 = 2131300663(0x7f091137, float:1.8219362E38)
            android.view.View r0 = r1.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1.f268308B = r0
            r0 = 2131301545(0x7f0914a9, float:1.822115E38)
            android.view.View r0 = r1.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1.f268311E = r0
            r0 = 2131301546(0x7f0914aa, float:1.8221153E38)
            android.view.View r0 = r1.findViewById(r0)
            r1.f268310D = r0
            r0 = 2131300664(0x7f091138, float:1.8219364E38)
            android.view.View r0 = r1.findViewById(r0)
            com.tencent.mm.emoji.view.EmojiStatusView r0 = (com.tencent.p014mm.emoji.view.EmojiStatusView) r0
            r1.f268309C = r0
            com.tencent.mm.plugin.emoji.ui.CustomSmileyPreviewUI$$g r9 = new com.tencent.mm.plugin.emoji.ui.CustomSmileyPreviewUI$$g
            r9.<init>(r1)
            r0.setOnClickListener(r9)
            r0 = 2131301543(0x7f0914a7, float:1.8221147E38)
            android.view.View r0 = r1.findViewById(r0)
            r1.f268312F = r0
            r0 = 2131301544(0x7f0914a8, float:1.8221149E38)
            android.view.View r0 = r1.findViewById(r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r9 = 2131755560(0x7f100228, float:1.9142003E38)
            r10 = -1
            android.graphics.drawable.Drawable r9 = com.tencent.p014mm.p136ui.C74933u4.m89768e(r1, r9, r10)
            r0.setImageDrawable(r9)
            android.content.Intent r0 = r20.getIntent()
            java.lang.String r9 = "emoji_info"
            android.os.Parcelable r0 = r0.getParcelableExtra(r9)
            com.tencent.mm.storage.emotion.EmojiInfo r0 = (com.tencent.p014mm.storage.emotion.EmojiInfo) r0
            r1.f268364z = r0
            if (r0 != 0) goto L_0x010d
            di3.d r0 = di3.C86312j.m106911c(r3)
            aq.g r0 = (p441aq.C92054g) r0
            r0.getClass()
            com.tencent.mm.storage.w2 r0 = com.tencent.p014mm.storage.C30790w2.m39221h()
            wh3.g r0 = r0.mo57717d()
            com.tencent.mm.storage.emotion.EmojiInfo r0 = r0.mo142044TO(r6)
            r1.f268364z = r0
        L_0x010d:
            com.tencent.mm.storage.emotion.EmojiInfo r0 = r1.f268364z
            if (r0 != 0) goto L_0x0115
            r20.finish()
            return
        L_0x0115:
            com.tencent.mm.emoji.view.EmojiStatusView r9 = r1.f268309C
            r9.setEmojiInfo(r0)
            com.tencent.mm.storage.emotion.EmojiInfo r0 = r1.f268364z
            boolean r0 = u61.C101964h.m134233o(r0)
            r9 = 8
            if (r0 == 0) goto L_0x0174
            android.view.View r0 = r1.f268312F
            k20.a r15 = new k20.a
            r15.<init>()
            java.lang.ThreadLocal<k20.a> r11 = k20.C60958c.f173611a
            java.lang.Integer r11 = java.lang.Integer.valueOf(r7)
            r15.mo10233c(r11)
            java.lang.Object[] r12 = r15.mo10232b()
            java.lang.String r13 = "com/tencent/mm/plugin/emoji/ui/CustomSmileyPreviewUI"
            java.lang.String r14 = "initView"
            java.lang.String r16 = "()V"
            java.lang.String r17 = "android/view/View_EXEC_"
            java.lang.String r18 = "setVisibility"
            java.lang.String r19 = "(I)V"
            r11 = r0
            r10 = r15
            r15 = r16
            r16 = r17
            r17 = r18
            r18 = r19
            j20.C117292a.m165358d(r11, r12, r13, r14, r15, r16, r17, r18)
            java.lang.Object r10 = r10.mo10231a(r7)
            java.lang.Integer r10 = (java.lang.Integer) r10
            int r10 = r10.intValue()
            r0.setVisibility(r10)
            java.lang.String r12 = "com/tencent/mm/plugin/emoji/ui/CustomSmileyPreviewUI"
            java.lang.String r13 = "initView"
            java.lang.String r14 = "()V"
            java.lang.String r15 = "android/view/View_EXEC_"
            java.lang.String r16 = "setVisibility"
            java.lang.String r17 = "(I)V"
            j20.C117292a.m165359e(r11, r12, r13, r14, r15, r16, r17)
            com.tencent.mm.plugin.emoji.ui.CustomSmileyPreviewUI$$l r0 = com.tencent.p014mm.plugin.emoji.p040ui.CustomSmileyPreviewUI$$l.CAPTURE
            r1.f268327S0 = r0
            goto L_0x01bd
        L_0x0174:
            android.view.View r0 = r1.f268312F
            k20.a r15 = new k20.a
            r15.<init>()
            java.lang.ThreadLocal<k20.a> r10 = k20.C60958c.f173611a
            java.lang.Integer r10 = java.lang.Integer.valueOf(r9)
            r15.mo10233c(r10)
            java.lang.Object[] r11 = r15.mo10232b()
            java.lang.String r12 = "com/tencent/mm/plugin/emoji/ui/CustomSmileyPreviewUI"
            java.lang.String r13 = "initView"
            java.lang.String r14 = "()V"
            java.lang.String r16 = "android/view/View_EXEC_"
            java.lang.String r17 = "setVisibility"
            java.lang.String r18 = "(I)V"
            r10 = r0
            r9 = r15
            r15 = r16
            r16 = r17
            r17 = r18
            j20.C117292a.m165358d(r10, r11, r12, r13, r14, r15, r16, r17)
            java.lang.Object r9 = r9.mo10231a(r7)
            java.lang.Integer r9 = (java.lang.Integer) r9
            int r9 = r9.intValue()
            r0.setVisibility(r9)
            java.lang.String r11 = "com/tencent/mm/plugin/emoji/ui/CustomSmileyPreviewUI"
            java.lang.String r12 = "initView"
            java.lang.String r13 = "()V"
            java.lang.String r14 = "android/view/View_EXEC_"
            java.lang.String r15 = "setVisibility"
            java.lang.String r16 = "(I)V"
            j20.C117292a.m165359e(r10, r11, r12, r13, r14, r15, r16)
        L_0x01bd:
            com.tencent.mm.plugin.emoji.ui.widget.ScaleRelativeLayout r0 = r1.f268307A
            com.tencent.mm.plugin.emoji.ui.CustomSmileyPreviewUI$$h r9 = new com.tencent.mm.plugin.emoji.ui.CustomSmileyPreviewUI$$h
            r9.<init>(r1)
            r0.post(r9)
            com.tencent.mm.plugin.emoji.ui.widget.ScaleRelativeLayout r0 = r1.f268307A
            com.tencent.mm.plugin.emoji.ui.CustomSmileyPreviewUI$$i r9 = new com.tencent.mm.plugin.emoji.ui.CustomSmileyPreviewUI$$i
            r9.<init>(r1)
            r0.setScaleActionStatusCallback(r9)
            di3.d r0 = di3.C86312j.m106911c(r2)
            z51.g r0 = (z51.C39315g) r0
            zc3.a r0 = r0.mo58035cm()
            com.tencent.mm.storage.emotion.EmojiInfo r9 = r1.f268364z
            java.lang.String r9 = r9.getMd5()
            i61.h r0 = (i61.C98602h) r0
            java.lang.String r0 = r0.mo138012T(r9)
            android.widget.TextView r9 = r1.f268308B
            if (r9 == 0) goto L_0x01fb
            boolean r9 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r9 != 0) goto L_0x01fb
            android.widget.TextView r9 = r1.f268308B
            r9.setText(r0)
            com.tencent.mm.emoji.view.EmojiStatusView r9 = r1.f268309C
            r9.setContentDescription(r0)
        L_0x01fb:
            r0 = 2131301548(0x7f0914ac, float:1.8221157E38)
            android.view.View r0 = r1.findViewById(r0)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r1.f268315I = r0
            r0 = 2131301547(0x7f0914ab, float:1.8221155E38)
            android.view.View r0 = r1.findViewById(r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r1.f268316J = r0
            r0 = 2131301553(0x7f0914b1, float:1.8221167E38)
            android.view.View r0 = r1.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1.f268317K = r0
            r0 = 2131301549(0x7f0914ad, float:1.822116E38)
            android.view.View r0 = r1.findViewById(r0)
            r1.f268319M = r0
            r0 = 2131301551(0x7f0914af, float:1.8221163E38)
            android.view.View r0 = r1.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1.f268318L = r0
            r0 = 2131301550(0x7f0914ae, float:1.8221161E38)
            android.view.View r0 = r1.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1.f268320N = r0
            r0 = 2131301542(0x7f0914a6, float:1.8221145E38)
            android.view.View r0 = r1.findViewById(r0)
            android.widget.Button r0 = (android.widget.Button) r0
            r1.f268321P = r0
            java.lang.Object[] r0 = new java.lang.Object[r5]
            com.tencent.mm.storage.emotion.EmojiInfo r9 = r1.f268364z
            java.lang.String r9 = r9.field_lensId
            r0[r7] = r9
            java.lang.String r9 = "loadLensInfo: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r8, r9, r0)
            android.view.ViewGroup r0 = r1.f268315I
            r9 = 8
            r0.setVisibility(r9)
            com.tencent.mm.storage.emotion.EmojiInfo r0 = r1.f268364z
            java.lang.String r0 = r0.field_lensId
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 != 0) goto L_0x0285
            com.tencent.mm.storage.emotion.EmojiInfo r0 = r1.f268364z
            java.lang.String r0 = r0.field_lensId
            com.tencent.mm.plugin.emoji.ui.d r9 = new com.tencent.mm.plugin.emoji.ui.d
            r9.<init>(r1)
            java.lang.String r10 = "lensId"
            gy3.C87412m.m108594g(r0, r10)
            boolean r10 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.isMainProcess()
            if (r10 == 0) goto L_0x0280
            vh3.e r10 = new vh3.e
            r10.<init>(r1, r0, r9)
            goto L_0x0285
        L_0x0280:
            vh3.g r10 = new vh3.g
            r10.<init>(r1, r0, r9)
        L_0x0285:
            android.content.Intent r0 = r20.getIntent()
            java.lang.String r9 = "custom_smiley_preview_appid"
            java.lang.String r0 = r0.getStringExtra(r9)
            android.content.Intent r9 = r20.getIntent()
            java.lang.String r10 = "custom_smiley_preview_appname"
            r9.getStringExtra(r10)
            r9 = 2131297304(0x7f090418, float:1.821255E38)
            android.view.View r9 = r1.findViewById(r9)
            android.widget.TextView r9 = (android.widget.TextView) r9
            java.lang.Class<ym.l> r10 = p763ym.C79138l.class
            di3.d r10 = di3.C86312j.m106911c(r10)
            ym.l r10 = (p763ym.C79138l) r10
            com.tencent.mm.pluginsdk.model.app.j r0 = r10.getAppInfo(r0)
            if (r0 == 0) goto L_0x02ba
            java.lang.String r0 = r0.field_appName
            if (r0 == 0) goto L_0x02ba
            java.lang.String r0 = r0.trim()
            r0.getClass()
        L_0x02ba:
            r10 = 8
            r9.setVisibility(r10)
            com.tencent.mm.storage.emotion.EmojiInfo r0 = r1.f268364z
            java.lang.String r0 = r0.field_groupId
            r1.f268362y = r0
            j61.n r9 = new j61.n
            r9.<init>(r0)
            r1.f268332V = r9
            f40.g r0 = f40.C86709a0.m107529k()
            ob0.b0 r0 = r0.f251779b
            j61.n r9 = r1.f268332V
            r0.mo123460f(r9)
            r0 = 16908298(0x102000a, float:2.3877257E-38)
            android.view.View r0 = r1.findViewById(r0)
            android.widget.ListView r0 = (android.widget.ListView) r0
            r1.f268342d = r0
            x51.e r0 = new x51.e
            androidx.appcompat.app.AppCompatActivity r9 = r20.getContext()
            r0.<init>(r9)
            r1.f268343e = r0
            r0.f301967f = r1
            r0.f301980p = r7
            android.widget.ListView r0 = r1.f268342d
            r0.setOnItemClickListener(r1)
            android.widget.ListView r0 = r1.f268342d
            x51.e r9 = r1.f268343e
            r0.setAdapter(r9)
            x51.e r0 = r1.f268343e
            r0.getClass()
            java.lang.String r0 = r1.f268362y
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            r9 = 0
            java.lang.String r10 = "exception:%s"
            if (r0 != 0) goto L_0x039e
            di3.d r0 = di3.C86312j.m106911c(r3)
            aq.g r0 = (p441aq.C92054g) r0
            r0.getClass()
            com.tencent.mm.storage.w2 r0 = com.tencent.p014mm.storage.C30790w2.m39221h()
            wh3.o r0 = r0.mo57719f()
            java.lang.String r11 = r1.f268362y
            wh3.n r0 = r0.mo61538jo(r11)
            if (r0 == 0) goto L_0x0353
            byte[] r11 = r0.field_content
            if (r11 == 0) goto L_0x0353
            te3.pz1 r11 = new te3.pz1
            r11.<init>()
            byte[] r12 = r0.field_content     // Catch:{ IOException -> 0x0347 }
            r11.parseFrom(r12)     // Catch:{ IOException -> 0x0347 }
            te3.f80 r12 = r11.f140062d     // Catch:{ IOException -> 0x0347 }
            r1.f268356t = r12     // Catch:{ IOException -> 0x0347 }
            java.lang.String r0 = r0.field_lan     // Catch:{ IOException -> 0x0347 }
            r1.f268357u = r0     // Catch:{ IOException -> 0x0347 }
            u61.d r0 = u61.C101962d.f300168a     // Catch:{ IOException -> 0x0347 }
            java.util.LinkedList<te3.k70> r11 = r11.f140063e     // Catch:{ IOException -> 0x0347 }
            java.util.List r0 = r0.mo141487e(r11, r9)     // Catch:{ IOException -> 0x0347 }
            r1.f268358v = r0     // Catch:{ IOException -> 0x0347 }
            goto L_0x0353
        L_0x0347:
            r0 = move-exception
            java.lang.Object[] r11 = new java.lang.Object[r5]
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.stackTraceToString(r0)
            r11[r7] = r0
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r8, r10, r11)
        L_0x0353:
            te3.f80 r0 = r1.f268356t
            if (r0 == 0) goto L_0x0389
            java.lang.String r0 = r1.f268357u
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 != 0) goto L_0x0389
            java.lang.String r0 = r1.f268357u
            androidx.appcompat.app.AppCompatActivity r8 = r20.getContext()
            java.lang.String r8 = com.tencent.p014mm.sdk.platformtools.LocaleUtil.getCurrentLanguage(r8)
            boolean r0 = r0.equalsIgnoreCase(r8)
            if (r0 != 0) goto L_0x0370
            goto L_0x0389
        L_0x0370:
            r20.mo127677N7()
            j61.o r0 = new j61.o
            java.lang.String r8 = r1.f268362y
            r11 = -1
            r0.<init>(r8, r5, r11)
            r1.f268326S = r0
            f40.g r0 = f40.C86709a0.m107529k()
            ob0.b0 r0 = r0.f251779b
            j61.o r8 = r1.f268326S
            r0.mo123460f(r8)
            goto L_0x039e
        L_0x0389:
            r11 = -1
            j61.o r0 = new j61.o
            java.lang.String r8 = r1.f268362y
            r0.<init>(r8, r5, r11)
            r1.f268326S = r0
            f40.g r0 = f40.C86709a0.m107529k()
            ob0.b0 r0 = r0.f251779b
            j61.o r8 = r1.f268326S
            r0.mo123460f(r8)
        L_0x039e:
            com.tencent.mm.plugin.emoji.model.e0 r0 = new com.tencent.mm.plugin.emoji.model.e0
            r0.<init>()
            r1.f268322Q = r0
            r0.f268238d = r1
            x51.e r8 = r1.f268343e
            r0.f268235a = r8
            int r8 = r1.f268359w
            r0.f268240f = r8
            r0.f268241g = r1
            di3.d r0 = di3.C86312j.m106911c(r3)
            aq.g r0 = (p441aq.C92054g) r0
            r0.getClass()
            com.tencent.mm.storage.w2 r0 = com.tencent.p014mm.storage.C30790w2.m39221h()
            wh3.f r0 = r0.mo57714a()
            java.lang.String r8 = r1.f268362y
            boolean r0 = r0.mo61531Lo(r8)
            r1.f268363y0 = r0
            java.lang.String r0 = r1.f268362y
            com.tencent.mm.storage.emotion.EmojiInfo r8 = r1.f268364z
            r1.mo127676M7(r0, r8)
            java.util.List<s61.c> r0 = r1.f268358v
            r1.mo127678O7(r0)
            com.tencent.mm.plugin.emoji.ui.CustomSmileyPreviewUI$$j r0 = new com.tencent.mm.plugin.emoji.ui.CustomSmileyPreviewUI$$j
            r0.<init>(r1)
            r1.setBackBtn(r0)
            com.tencent.mm.storage.emotion.EmojiInfo r0 = r1.f268364z
            int r8 = r0.field_catalog
            com.tencent.mm.sdk.storage.IAutoDBItem$MAutoDBInfo r11 = com.tencent.p014mm.storage.emotion.EmojiInfo.f284123W1
            r11 = 81
            if (r8 == r11) goto L_0x03f0
            boolean r0 = r0.mo62637I0()
            if (r0 != 0) goto L_0x03f0
            r0 = 1
            goto L_0x03f1
        L_0x03f0:
            r0 = 0
        L_0x03f1:
            com.tencent.mm.storage.emotion.EmojiInfo r8 = r1.f268364z
            int r12 = r8.field_catalog
            if (r12 == r11) goto L_0x041f
            java.lang.String r8 = r8.field_groupId
            boolean r8 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r8)
            if (r8 != 0) goto L_0x041f
            com.tencent.mm.storage.emotion.EmojiInfo r8 = r1.f268364z
            java.lang.String r8 = r8.field_groupId
            boolean r8 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r8)
            if (r8 != 0) goto L_0x0420
            di3.d r2 = di3.C86312j.m106911c(r2)
            z51.g r2 = (z51.C39315g) r2
            zc3.a r2 = r2.mo58035cm()
            com.tencent.mm.storage.emotion.EmojiInfo r8 = r1.f268364z
            java.lang.String r8 = r8.field_groupId
            i61.h r2 = (i61.C98602h) r2
            boolean r2 = r2.mo138006M(r8)
            if (r2 == 0) goto L_0x0420
        L_0x041f:
            r0 = 1
        L_0x0420:
            r2 = 2131756370(0x7f100552, float:1.9143646E38)
            com.tencent.mm.plugin.emoji.ui.CustomSmileyPreviewUI$$k r8 = new com.tencent.mm.plugin.emoji.ui.CustomSmileyPreviewUI$$k
            r8.<init>(r1)
            r1.addIconOptionMenu(r7, r2, r8)
            r1.showOptionMenu(r0)
            r0 = 2131300866(0x7f091202, float:1.8219774E38)
            android.view.View r0 = r1.findViewById(r0)
            r1.f268344f = r0
            r0 = 2131300865(0x7f091201, float:1.8219772E38)
            android.view.View r0 = r1.findViewById(r0)
            r2 = 2131300872(0x7f091208, float:1.8219786E38)
            android.view.View r2 = r0.findViewById(r2)
            android.widget.ImageView r2 = (android.widget.ImageView) r2
            r1.f268345g = r2
            r2 = 2131300882(0x7f091212, float:1.8219806E38)
            android.view.View r2 = r0.findViewById(r2)
            android.widget.TextView r2 = (android.widget.TextView) r2
            r1.f268346h = r2
            r2 = 2131300870(0x7f091206, float:1.8219782E38)
            android.view.View r0 = r0.findViewById(r2)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1.f268347i = r0
            r0 = 2131312116(0x7f093df4, float:1.8242591E38)
            android.view.View r0 = r1.findViewById(r0)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r1.f268348j = r0
            r0 = 2131312117(0x7f093df5, float:1.8242593E38)
            android.view.View r0 = r1.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1.f268353q = r0
            android.view.ViewGroup r0 = r1.f268348j
            r2 = 2131312115(0x7f093df3, float:1.824259E38)
            android.view.View r0 = r0.findViewById(r2)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1.f268351p = r0
            android.view.ViewGroup r0 = r1.f268348j
            r2 = 2131312113(0x7f093df1, float:1.8242585E38)
            android.view.View r0 = r0.findViewById(r2)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r1.f268349n = r0
            android.view.ViewGroup r0 = r1.f268348j
            r2 = 2131312114(0x7f093df2, float:1.8242587E38)
            android.view.View r0 = r0.findViewById(r2)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1.f268350o = r0
            u61.d r0 = u61.C101962d.f300168a
            androidx.appcompat.app.AppCompatActivity r2 = r20.getContext()
            r8 = 2131100455(0x7f060327, float:1.7813292E38)
            int r12 = kg3.C76577a.m92153d(r2, r8)
            androidx.appcompat.app.AppCompatActivity r2 = r20.getContext()
            r8 = 2131099657(0x7f060009, float:1.7811673E38)
            int r13 = kg3.C76577a.m92153d(r2, r8)
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r11 = r0
            android.graphics.drawable.Drawable r2 = r11.mo141484b(r12, r13, r14, r15, r16, r17)
            android.view.View r8 = r1.f268344f
            r8.setBackground(r2)
            android.view.View r2 = r1.f268344f
            k20.a r8 = new k20.a
            r8.<init>()
            java.lang.ThreadLocal<k20.a> r11 = k20.C60958c.f173611a
            r11 = 8
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            r8.mo10233c(r11)
            java.lang.Object[] r12 = r8.mo10232b()
            java.lang.String r13 = "com/tencent/mm/plugin/emoji/ui/CustomSmileyPreviewUI"
            java.lang.String r14 = "initDesignerView"
            java.lang.String r15 = "()V"
            java.lang.String r16 = "android/view/View_EXEC_"
            java.lang.String r17 = "setVisibility"
            java.lang.String r18 = "(I)V"
            r11 = r2
            j20.C117292a.m165358d(r11, r12, r13, r14, r15, r16, r17, r18)
            java.lang.Object r8 = r8.mo10231a(r7)
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            r2.setVisibility(r8)
            java.lang.String r12 = "com/tencent/mm/plugin/emoji/ui/CustomSmileyPreviewUI"
            java.lang.String r13 = "initDesignerView"
            java.lang.String r14 = "()V"
            java.lang.String r15 = "android/view/View_EXEC_"
            java.lang.String r16 = "setVisibility"
            java.lang.String r17 = "(I)V"
            j20.C117292a.m165359e(r11, r12, r13, r14, r15, r16, r17)
            com.tencent.mm.storage.emotion.EmojiInfo r2 = r1.f268364z
            if (r2 == 0) goto L_0x0551
            java.lang.String r2 = r2.field_designerID
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r2 != 0) goto L_0x0551
            com.tencent.mm.storage.emotion.EmojiInfo r2 = r1.f268364z
            java.lang.String r2 = r2.field_designerID
            di3.d r8 = di3.C86312j.m106911c(r3)
            aq.g r8 = (p441aq.C92054g) r8
            r8.getClass()
            com.tencent.mm.storage.w2 r8 = com.tencent.p014mm.storage.C30790w2.m39221h()
            wh3.m r8 = r8.mo57718e()
            te3.zy1 r2 = r8.mo61536jo(r2)
            r1.f268355s = r2
            if (r2 == 0) goto L_0x053b
            java.util.LinkedList<te3.k70> r8 = r2.f146281f
            java.util.LinkedList<te3.o80> r2 = r2.f146280e
            java.util.List r0 = r0.mo141487e(r8, r2)
            r1.f268358v = r0
        L_0x053b:
            com.tencent.mm.storage.emotion.EmojiInfo r0 = r1.f268364z
            java.lang.String r0 = r0.field_designerID
            j61.l r2 = new j61.l
            r2.<init>(r0)
            r1.f268328T = r2
            f40.g r0 = f40.C86709a0.m107529k()
            ob0.b0 r0 = r0.f251779b
            j61.l r2 = r1.f268328T
            r0.mo123460f(r2)
        L_0x0551:
            com.tencent.mm.storage.emotion.EmojiInfo r0 = r1.f268364z
            if (r0 == 0) goto L_0x0607
            java.lang.String r0 = r0.field_activityid
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 == 0) goto L_0x0567
            com.tencent.mm.storage.emotion.EmojiInfo r0 = r1.f268364z
            java.lang.String r0 = r0.field_linkId
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 != 0) goto L_0x0607
        L_0x0567:
            com.tencent.mm.storage.emotion.EmojiInfo r0 = r1.f268364z
            java.lang.String r0 = r0.field_md5
            di3.d r2 = di3.C86312j.m106911c(r3)
            aq.g r2 = (p441aq.C92054g) r2
            r2.getClass()
            com.tencent.mm.storage.w2 r2 = com.tencent.p014mm.storage.C30790w2.m39221h()
            wh3.u r2 = r2.mo57720g()
            r2.getClass()
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            java.lang.String r8 = "MicroMsg.emoji.Storage"
            if (r3 == 0) goto L_0x058d
            java.lang.String r0 = "getEmotionActivityByID failed. activityID is null."
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r8, r0)
            goto L_0x05e6
        L_0x058d:
            com.tencent.mm.sdk.storage.ISQLiteDatabase r11 = r2.f100795d     // Catch:{ IOException -> 0x05d4, all -> 0x05d2 }
            java.lang.String r12 = "GetEmotionListCache"
            r13 = 0
            java.lang.String r14 = "reqType=?"
            java.lang.String[] r15 = new java.lang.String[r5]     // Catch:{ IOException -> 0x05d4, all -> 0x05d2 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x05d4, all -> 0x05d2 }
            r2.<init>()     // Catch:{ IOException -> 0x05d4, all -> 0x05d2 }
            java.lang.String r3 = "activityID:"
            r2.append(r3)     // Catch:{ IOException -> 0x05d4, all -> 0x05d2 }
            r2.append(r0)     // Catch:{ IOException -> 0x05d4, all -> 0x05d2 }
            java.lang.String r0 = r2.toString()     // Catch:{ IOException -> 0x05d4, all -> 0x05d2 }
            r15[r7] = r0     // Catch:{ IOException -> 0x05d4, all -> 0x05d2 }
            r16 = 0
            r17 = 0
            r18 = 0
            android.database.Cursor r2 = r11.query(r12, r13, r14, r15, r16, r17, r18)     // Catch:{ IOException -> 0x05d4, all -> 0x05d2 }
            if (r2 == 0) goto L_0x05cf
            boolean r0 = r2.moveToFirst()     // Catch:{ IOException -> 0x05cd }
            if (r0 == 0) goto L_0x05cf
            wh3.t r0 = new wh3.t     // Catch:{ IOException -> 0x05cd }
            r0.<init>(r2)     // Catch:{ IOException -> 0x05cd }
            te3.lz1 r3 = new te3.lz1     // Catch:{ IOException -> 0x05cd }
            r3.<init>()     // Catch:{ IOException -> 0x05cd }
            byte[] r0 = r0.field_cache     // Catch:{ IOException -> 0x05cd }
            r3.parseFrom(r0)     // Catch:{ IOException -> 0x05cd }
            r9 = r3
            goto L_0x05cf
        L_0x05cd:
            r0 = move-exception
            goto L_0x05d6
        L_0x05cf:
            if (r2 == 0) goto L_0x05e6
            goto L_0x05e3
        L_0x05d2:
            r0 = move-exception
            goto L_0x0601
        L_0x05d4:
            r0 = move-exception
            r2 = r9
        L_0x05d6:
            java.lang.Object[] r3 = new java.lang.Object[r5]     // Catch:{ all -> 0x05ff }
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.stackTraceToString(r0)     // Catch:{ all -> 0x05ff }
            r3[r7] = r0     // Catch:{ all -> 0x05ff }
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r8, r10, r3)     // Catch:{ all -> 0x05ff }
            if (r2 == 0) goto L_0x05e6
        L_0x05e3:
            r2.close()
        L_0x05e6:
            r1.f268330U = r9
            com.tencent.mm.storage.emotion.EmojiInfo r0 = r1.f268364z
            java.lang.String r2 = r0.field_activityid
            java.lang.String r3 = r0.field_md5
            java.lang.String r0 = r0.field_linkId
            j61.m r8 = new j61.m
            r8.<init>(r2, r3, r0)
            f40.g r0 = f40.C86709a0.m107529k()
            ob0.b0 r0 = r0.f251779b
            r0.mo123460f(r8)
            goto L_0x0607
        L_0x05ff:
            r0 = move-exception
            r9 = r2
        L_0x0601:
            if (r9 == 0) goto L_0x0606
            r9.close()
        L_0x0606:
            throw r0
        L_0x0607:
            com.tencent.mm.plugin.emoji.ui.f r0 = new com.tencent.mm.plugin.emoji.ui.f
            r0.<init>(r1)
            com.tencent.p014mm.sdk.platformtools.MMHandlerThread.postToMainThread(r0)
            android.view.View r0 = r1.f268344f
            com.tencent.mm.plugin.emoji.ui.e r2 = new com.tencent.mm.plugin.emoji.ui.e
            r2.<init>(r1)
            r0.setOnClickListener(r2)
            com.tencent.mm.plugin.report.service.n r0 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r2 = 12067(0x2f23, float:1.691E-41)
            r3 = 5
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r8 = 2
            java.lang.Integer r9 = java.lang.Integer.valueOf(r8)
            r3[r7] = r9
            java.lang.String r7 = r1.f268362y
            r3[r5] = r7
            r3[r8] = r6
            r5 = 3
            com.tencent.mm.storage.emotion.EmojiInfo r6 = r1.f268364z
            if (r6 != 0) goto L_0x0634
            r7 = r4
            goto L_0x0636
        L_0x0634:
            java.lang.String r7 = r6.field_designerID
        L_0x0636:
            r3[r5] = r7
            r5 = 4
            if (r6 != 0) goto L_0x063c
            goto L_0x063e
        L_0x063c:
            java.lang.String r4 = r6.field_activityid
        L_0x063e:
            r3[r5] = r4
            r0.mo160131h(r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.emoji.p040ui.CustomSmileyPreviewUI.initView():void");
    }

    /* renamed from: k5 */
    public void mo127623k5(C102330b bVar) {
        Object[] objArr = new Object[3];
        objArr[0] = bVar.mo141886e();
        objArr[1] = TextUtils.isEmpty(bVar.mo141887f()) ? "" : bVar.mo141887f();
        objArr[2] = Integer.valueOf(bVar.mo141888g());
        Log.m105925i("MicroMsg.emoji.CustomSmileyPreviewUI", "[onProductClick] productId:%s, productPrice:%s, productStatus:%d", objArr);
        this.f268322Q.mo127620c(bVar);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        C50614nz1 nz12;
        super.onActivityResult(i, i2, intent);
        boolean z = false;
        Log.m105919d("MicroMsg.emoji.CustomSmileyPreviewUI", "onActivityResult. requestCode:[%d] resultCode:[%d]", Integer.valueOf(i), Integer.valueOf(i2));
        if (i != 0) {
            if (i == 1001 && (nz12 = this.f268334W) != null) {
                C101792j80 j802 = nz12.f138862j;
                int i3 = EmojiLogic.f268226a;
                if (j802 != null && j802.f298510o == 1) {
                    z = true;
                }
                if (z) {
                    Log.m105924i("MicroMsg.emoji.CustomSmileyPreviewUI", "NetSceneGetEmotionDesc refresh");
                    this.f268332V = new C33522n(this.f268362y);
                    C86709a0.m107529k().f251779b.mo123460f(this.f268332V);
                }
            }
        } else if (i2 == -1) {
            C75026b.m89951a(this, getContext().getString(C0966R.string.a2x));
        }
    }

    public void onCreate(Bundle bundle) {
        Class cls = C10432i.class;
        super.onCreate(bundle);
        if (((C10432i) C86312j.m106911c(cls)).mo10750e()) {
            Log.m105924i("MicroMsg.emoji.CustomSmileyPreviewUI", "exit in teen mode");
            ((C10432i) C86312j.m106911c(cls)).mo10755m4(this);
            finish();
            return;
        }
        C86709a0.m107529k().f251779b.mo123455a(412, this);
        C86709a0.m107529k().f251779b.mo123455a(521, this);
        C86709a0.m107529k().f251779b.mo123455a(411, this);
        C86709a0.m107529k().f251779b.mo123455a(WXWebReporter.WXXWEB_PRE_DOWN_ARM64_SUC, this);
        C86709a0.m107529k().f251779b.mo123455a(368, this);
        this.f268335W0.alive();
        this.f268337X0.alive();
        initView();
        setActionbarColor(getContext().getResources().getColor(C0966R.color.al6));
        hideActionbarLine();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x00a7, code lost:
        r2 = r2.f146279d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onDestroy() {
        /*
            r18 = this;
            r0 = r18
            f40.g r1 = f40.C86709a0.m107529k()
            ob0.b0 r1 = r1.f251779b
            r2 = 412(0x19c, float:5.77E-43)
            r1.mo123470p(r2, r0)
            f40.g r1 = f40.C86709a0.m107529k()
            ob0.b0 r1 = r1.f251779b
            r2 = 521(0x209, float:7.3E-43)
            r1.mo123470p(r2, r0)
            f40.g r1 = f40.C86709a0.m107529k()
            ob0.b0 r1 = r1.f251779b
            r2 = 411(0x19b, float:5.76E-43)
            r1.mo123470p(r2, r0)
            f40.g r1 = f40.C86709a0.m107529k()
            ob0.b0 r1 = r1.f251779b
            r2 = 239(0xef, float:3.35E-43)
            r1.mo123470p(r2, r0)
            f40.g r1 = f40.C86709a0.m107529k()
            ob0.b0 r1 = r1.f251779b
            r2 = 368(0x170, float:5.16E-43)
            r1.mo123470p(r2, r0)
            com.tencent.mm.sdk.event.IListener r1 = r0.f268335W0
            r1.dead()
            com.tencent.mm.sdk.event.IListener r1 = r0.f268337X0
            r1.dead()
            super.onDestroy()
            java.lang.Runnable r1 = r0.f268331U0
            com.tencent.p014mm.sdk.platformtools.MMHandlerThread.removeRunnable(r1)
            java.lang.Runnable r1 = r0.f268333V0
            com.tencent.p014mm.sdk.platformtools.MMHandlerThread.removeRunnable(r1)
            com.tencent.mm.storage.emotion.EmojiInfo r1 = r0.f268364z
            if (r1 == 0) goto L_0x011a
            com.tencent.mm.plugin.report.service.n r1 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r2 = 12789(0x31f5, float:1.7921E-41)
            r3 = 11
            java.lang.Object[] r4 = new java.lang.Object[r3]
            r5 = 7
            java.lang.Integer r6 = java.lang.Integer.valueOf(r5)
            r7 = 0
            r4[r7] = r6
            com.tencent.mm.storage.emotion.EmojiInfo r6 = r0.f268364z
            java.lang.String r6 = r6.getMd5()
            r8 = 1
            r4[r8] = r6
            java.lang.Integer r6 = java.lang.Integer.valueOf(r8)
            r9 = 2
            r4[r9] = r6
            com.tencent.mm.storage.emotion.EmojiInfo r6 = r0.f268364z
            java.lang.String r10 = r6.field_designerID
            r11 = 3
            r4[r11] = r10
            java.lang.String r10 = r6.field_groupId
            r12 = 4
            r4[r12] = r10
            java.lang.String r10 = r0.f268338Y
            r13 = 5
            r4[r13] = r10
            r10 = 6
            java.lang.String r14 = ""
            r4[r10] = r14
            r4[r5] = r14
            r15 = 8
            r4[r15] = r14
            java.lang.String r6 = r6.field_activityid
            r16 = 9
            r4[r16] = r6
            long r5 = r0.f268360x
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            r6 = 10
            r4[r6] = r5
            r1.mo160131h(r2, r4)
            te3.zy1 r2 = r0.f268355s
            if (r2 == 0) goto L_0x00b2
            te3.jd3 r2 = r2.f146279d
            if (r2 == 0) goto L_0x00b2
            int r2 = r2.f136019d
            java.lang.String r2 = p823sg.C77710q.m93738a(r2)
            goto L_0x00b3
        L_0x00b2:
            r2 = r14
        L_0x00b3:
            r4 = 12740(0x31c4, float:1.7853E-41)
            r5 = 14
            java.lang.Object[] r5 = new java.lang.Object[r5]
            java.lang.Integer r17 = java.lang.Integer.valueOf(r12)
            r5[r7] = r17
            r5[r8] = r2
            com.tencent.mm.storage.emotion.EmojiInfo r2 = r0.f268364z
            java.lang.String r2 = r2.field_groupId
            r5[r9] = r2
            r5[r11] = r14
            int r2 = r0.f268359w
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r5[r12] = r2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r16)
            r5[r13] = r2
            r5[r10] = r14
            com.tencent.mm.storage.emotion.EmojiInfo r2 = r0.f268364z
            java.lang.String r2 = r2.field_activityid
            r7 = 7
            r5[r7] = r2
            r5[r15] = r14
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            long r7 = r0.f268360x
            r2.append(r7)
            r2.append(r14)
            java.lang.String r2 = r2.toString()
            r5[r16] = r2
            com.tencent.mm.storage.emotion.EmojiInfo r2 = r0.f268364z
            java.lang.String r2 = r2.field_lensId
            r5[r6] = r2
            boolean r2 = r0.f268313G
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r5[r3] = r2
            r2 = 12
            boolean r3 = r0.f268314H
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r5[r2] = r3
            r2 = 13
            int r3 = r0.f268339Y0
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r5[r2] = r3
            r1.mo160131h(r4, r5)
        L_0x011a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.emoji.p040ui.CustomSmileyPreviewUI.onDestroy():void");
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(adapterView);
        arrayList.add(view);
        arrayList.add(Integer.valueOf(i));
        arrayList.add(Long.valueOf(j));
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/emoji/ui/CustomSmileyPreviewUI", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        C102559e eVar = this.f268343e;
        if (eVar != null && eVar.getCount() > 0) {
            C115669n nVar = C115669n.INSTANCE;
            EmojiInfo emojiInfo = this.f268364z;
            nVar.mo160131h(12789, 4, this.f268364z.getMd5(), 1, emojiInfo.field_designerID, emojiInfo.field_groupId, "", "", "", "", emojiInfo.field_activityid, Long.valueOf(this.f268360x));
            C102562g g = this.f268343e.getItem(0);
            Intent K7 = mo127674K7(g.f301983b, this.f268359w);
            K7.putExtra("extra_status", g.f301987f);
            K7.putExtra("extra_progress", g.f301986e);
            startActivityForResult(K7, 1001);
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/emoji/ui/CustomSmileyPreviewUI", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }

    public void onPause() {
        super.onPause();
    }

    public void onResume() {
        super.onResume();
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        Class cls = C92054g.class;
        int type = yVar.getType();
        Log.m105925i("MicroMsg.emoji.CustomSmileyPreviewUI", "onSceneEnd: %s, %s, %s", Integer.valueOf(type), Integer.valueOf(i), Integer.valueOf(i2));
        if (type == 239) {
            C33521l lVar = (C33521l) yVar;
            if (lVar != this.f268328T) {
                Log.m105924i("MicroMsg.emoji.CustomSmileyPreviewUI", "onSceneEnd, current NetSceneGetDesignerSimpleInfo not match, skip!");
                return;
            }
            this.f268328T = lVar;
            C52325zy1 j1 = lVar.mo59185j1();
            this.f268355s = j1;
            this.f268358v = C101962d.f300168a.mo141487e(j1.f146281f, j1.f146280e);
            MMHandlerThread.postToMainThread(new C93170f(this));
        } else if (type != 368) {
            if (type != 521) {
                if (type != 411) {
                    if (type == 412 && (yVar instanceof C46441o)) {
                        C46441o oVar = (C46441o) yVar;
                        if (oVar != this.f268326S) {
                            Log.m105924i("MicroMsg.emoji.CustomSmileyPreviewUI", "onSceneEnd, current NetSceneGetEmotionDetail not match, skip!");
                            return;
                        }
                        this.f268326S = oVar;
                        String str2 = "";
                        if (i == 0) {
                            if (i2 == 0) {
                                C101776f80 j15 = oVar.mo71837j1();
                                this.f268356t = j15;
                                C101792j80 j802 = j15.f298234J;
                                if (j802 != null) {
                                    Log.m105925i("MicroMsg.emoji.CustomSmileyPreviewUI", "EmotionLinkInfo %s, %s, %s, %s", j802.f298504f, j802.f298503e, Integer.valueOf(j802.f298509n), this.f268356t.f298234J.f298505g);
                                }
                                this.f268358v = C101962d.f300168a.mo141487e(((C50892pz1) oVar.f125092d.f127056b.f127083a).f140063e, (List<? extends C101824o80>) null);
                                if (this.f268356t == null || TextUtils.isEmpty(this.f268362y) || !this.f268362y.equals(this.f268356t.f298235d)) {
                                    Object[] objArr = new Object[2];
                                    objArr[0] = this.f268362y + str2;
                                    C101776f80 f802 = this.f268356t;
                                    if (f802 != null) {
                                        str2 = f802.f298235d;
                                    }
                                    objArr[1] = str2;
                                    Log.m105925i("MicroMsg.emoji.CustomSmileyPreviewUI", "[onSceneEnd GetEmotionDetail no same product id] cureent:%s,scene:%s", objArr);
                                    return;
                                }
                                mo127677N7();
                                Log.m105924i("MicroMsg.emoji.CustomSmileyPreviewUI", "[onSceneEnd] GetEmotionDetail" + this.f268356t.f298235d);
                            }
                        } else if (i2 != 5) {
                        } else {
                            if (this.f268356t == null || oVar.mo71837j1() == null || TextUtils.isEmpty(this.f268362y) || !this.f268362y.equals(this.f268356t.f298235d) || this.f268356t.f298242n == oVar.mo71837j1().f298242n) {
                                Object[] objArr2 = new Object[2];
                                objArr2[0] = this.f268362y + str2;
                                C101776f80 f803 = this.f268356t;
                                if (f803 != null) {
                                    str2 = f803.f298235d;
                                }
                                objArr2[1] = str2;
                                Log.m105925i("MicroMsg.emoji.CustomSmileyPreviewUI", "[onSceneEnd GetEmotionDetail no same product id or PackFlag is same.] cureent:%s,scene:%s", objArr2);
                                return;
                            }
                            this.f268356t.f298242n = oVar.mo71837j1().f298242n;
                            mo127677N7();
                            Log.m105924i("MicroMsg.emoji.CustomSmileyPreviewUI", "[onSceneEnd] GetEmotionDetail" + this.f268356t.f298235d);
                        }
                    }
                } else if (yVar instanceof C46443q) {
                    ((C92054g) C86312j.m106911c(cls)).getClass();
                    C30790w2.m39221h().mo57720g().mo61545Yt(12, ((C46443q) yVar).mo71839l1());
                }
            } else if (i2 == 0) {
                if (this.f268332V == yVar) {
                    ((C92054g) C86312j.m106911c(cls)).getClass();
                    this.f268363y0 = C30790w2.m39221h().mo57714a().mo61531Lo(this.f268362y);
                    runOnUiThread(this.f268333V0);
                    C47465a aVar = this.f268332V.f90762d.f127056b.f127083a;
                    this.f268334W = (C50614nz1) aVar;
                    C50614nz1 nz12 = (C50614nz1) aVar;
                    C101792j80 j803 = nz12.f138862j;
                    if (j803 != null) {
                        Log.m105925i("MicroMsg.emoji.CustomSmileyPreviewUI", "GetEmotionDescResponse.Link %s, %s, %s, %s", j803.f298504f, j803.f298503e, Integer.valueOf(j803.f298509n), nz12.f138862j.f298505g);
                    }
                    if (this.f268334W != null) {
                        mo127677N7();
                    }
                }
                MMHandlerThread.postToMainThreadDelayed(this.f268331U0, 500);
            }
        } else if (i2 == 0) {
            C60779m mVar = (C60779m) yVar;
            C50330lz1 lz12 = (C50330lz1) mVar.f173113d.f127056b.f127083a;
            if (lz12 != null) {
                C38146u g = ((C39315g) C86312j.m106911c(C39315g.class)).mo58034O6().mo57720g();
                String str3 = mVar.f173116g;
                g.getClass();
                try {
                    g.mo61546jo("activityID:" + str3);
                    g.insert(new C38145t("activityID:" + str3, lz12.toByteArray()));
                } catch (Exception e) {
                    Log.m105921e("MicroMsg.emoji.Storage", "exception:%s", Util.stackTraceToString(e));
                }
            }
            this.f268330U = lz12;
            MMHandlerThread.postToMainThread(new C93170f(this));
        } else {
            Log.m105928w("MicroMsg.emoji.CustomSmileyPreviewUI", "get activity failed.");
        }
    }

    public void onStart() {
        super.onStart();
    }

    public void setRequestedOrientation(int i) {
        super.setRequestedOrientation(getForceOrientation());
    }

    public void superImportUIComponents(HashSet<Class<? extends UIComponent>> hashSet) {
        super.superImportUIComponents(hashSet);
        hashSet.add(C66551a.class);
    }

    /* renamed from: z4 */
    public void mo127625z4(boolean z) {
    }
}
