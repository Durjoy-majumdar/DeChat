package com.tencent.p014mm.plugin.emoji.p040ui;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.gms.common.Scopes;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.app.C67654r1;
import com.tencent.p014mm.autogen.events.EmotionStateChangeEvent;
import com.tencent.p014mm.autogen.mmdata.rpt.EmoticonDetailActivityInfoStruct;
import com.tencent.p014mm.autogen.mmdata.rpt.EmoticonStoreActionStruct;
import com.tencent.p014mm.autogen.mmdata.rpt.EmotionPageStruct;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.base.MMAutoSizeTextView;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.p136ui.widget.snackbar.C75026b;
import com.tencent.p014mm.plugin.emoji.model.EmojiLogic;
import com.tencent.p014mm.plugin.emoji.p040ui.p041v2.DonorsAvatarView;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.pluginsdk.p133ui.emoji.BannerEmojiView;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.BackwardSupportUtil;
import com.tencent.p014mm.sdk.platformtools.IntentUtil;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatBrands;
import com.tencent.p014mm.sdk.storage.MStorage;
import com.tencent.p014mm.sdk.storage.MStorageEventData;
import com.tencent.p014mm.storage.C30790w2;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.storage.emotion.EmojiGroupInfo;
import com.tencent.p014mm.storage.emotion.EmojiInfo;
import com.tencent.wxmm.v2helper;
import di0.C86299o;
import di3.C86312j;
import eb0.C75592q0;
import f40.C86709a0;
import fy3.C32224a;
import gc0.C20828a;
import hc0.C20937c;
import ht1.C60200t1;
import i61.C8859k;
import i61.C98601f;
import j20.C117292a;
import j61.C33522n;
import j61.C33523r;
import j61.C46439j;
import j61.C46441o;
import j61.C46445t;
import j61.C98905c;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import k20.C60958c;
import k20.C9556a;
import ke3.C88144b;
import kg3.C76577a;
import kr0.C76630x0;
import ky2.C10432i;
import lc3.C10485b;
import nj3.C76879j;
import ob0.C11385n;
import ob0.C117747y;
import p179jw.C9531b;
import p214om.C11502f;
import p441aq.C92054g;
import p585kl.C99148f;
import qo3.C89779i0;
import rx3.C13598b0;
import te3.C101776f80;
import te3.C101792j80;
import te3.C101860w93;
import te3.C101867x93;
import te3.C49528g80;
import te3.C50614nz1;
import te3.C51759vz1;
import u61.C101963g;
import u61.C101964h;
import u61.C101966i;
import u61.C14123e;
import wc3.C78541w;
import wh3.C38142q;
import x51.C102561f;
import y51.C66553b;

/* renamed from: com.tencent.mm.plugin.emoji.ui.EmojiStoreDetailUI */
public class EmojiStoreDetailUI extends MMActivity implements C11385n, View.OnClickListener, MStorage.IOnStorageChange {

    /* renamed from: D1 */
    public static final /* synthetic */ int f268553D1 = 0;

    /* renamed from: A */
    public TextView f268554A;

    /* renamed from: A1 */
    public View.OnClickListener f268555A1 = new EmojiStoreDetailUI$$h(this);

    /* renamed from: B */
    public View f268556B;

    /* renamed from: B1 */
    public MMHandler f268557B1 = new EmojiStoreDetailUI$$i(this);

    /* renamed from: C */
    public ProgressDialog f268558C;

    /* renamed from: C1 */
    public C9531b.C9532a f268559C1 = new EmojiStoreDetailUI$$d(this);

    /* renamed from: D */
    public EmojiDetailScrollView f268560D;

    /* renamed from: E */
    public BannerEmojiView f268561E;

    /* renamed from: F */
    public TextView f268562F;

    /* renamed from: G */
    public MMAutoSizeTextView f268563G;

    /* renamed from: H */
    public TextView f268564H;

    /* renamed from: I */
    public TextView f268565I;

    /* renamed from: J */
    public TextView f268566J;

    /* renamed from: K */
    public EmojiDetailGridView f268567K;

    /* renamed from: L */
    public ImageView f268568L;

    /* renamed from: M */
    public ProgressBar f268569M;

    /* renamed from: N */
    public View f268570N;

    /* renamed from: P */
    public TextView f268571P;

    /* renamed from: Q */
    public TextView f268572Q;

    /* renamed from: Q0 */
    public ImageView f268573Q0;

    /* renamed from: R */
    public View f268574R;

    /* renamed from: R0 */
    public TextView f268575R0;

    /* renamed from: S */
    public int f268576S;

    /* renamed from: S0 */
    public View f268577S0;

    /* renamed from: T */
    public View f268578T;

    /* renamed from: T0 */
    public TextView f268579T0;

    /* renamed from: U */
    public ProgressBar f268580U;

    /* renamed from: U0 */
    public Button f268581U0;

    /* renamed from: V */
    public View f268582V;

    /* renamed from: V0 */
    public DonorsAvatarView f268583V0;

    /* renamed from: W */
    public ImageView f268584W;

    /* renamed from: W0 */
    public TextView f268585W0;

    /* renamed from: X */
    public TextView f268586X;

    /* renamed from: X0 */
    public int f268587X0;

    /* renamed from: Y */
    public View f268588Y;

    /* renamed from: Y0 */
    public int f268589Y0;

    /* renamed from: Z */
    public View f268590Z;

    /* renamed from: Z0 */
    public int f268591Z0;

    /* renamed from: a1 */
    public int f268592a1;

    /* renamed from: b1 */
    public int f268593b1;

    /* renamed from: c1 */
    public String f268594c1 = "";

    /* renamed from: d */
    public Context f268595d;

    /* renamed from: d1 */
    public String f268596d1 = "";

    /* renamed from: e */
    public String f268597e;

    /* renamed from: e1 */
    public String f268598e1;

    /* renamed from: f */
    public String f268599f;

    /* renamed from: f1 */
    public boolean f268600f1;

    /* renamed from: g */
    public String f268601g;

    /* renamed from: g1 */
    public int f268602g1;

    /* renamed from: h */
    public String f268603h;

    /* renamed from: h1 */
    public int f268604h1 = -1;

    /* renamed from: i */
    public int f268605i;

    /* renamed from: i1 */
    public String f268606i1;

    /* renamed from: j */
    public boolean f268607j;

    /* renamed from: j1 */
    public String f268608j1;

    /* renamed from: k1 */
    public String f268609k1;

    /* renamed from: l1 */
    public String[] f268610l1 = new String[1];

    /* renamed from: m1 */
    public boolean f268611m1 = false;

    /* renamed from: n */
    public C101966i f268612n;

    /* renamed from: n1 */
    public View f268613n1;

    /* renamed from: o */
    public int f268614o;

    /* renamed from: o1 */
    public boolean f268615o1 = true;

    /* renamed from: p */
    public int f268616p = -1;

    /* renamed from: p0 */
    public TextView f268617p0;

    /* renamed from: p1 */
    public C50614nz1 f268618p1;

    /* renamed from: q */
    public C46441o f268619q;

    /* renamed from: q1 */
    public boolean f268620q1 = false;

    /* renamed from: r */
    public C46439j f268621r;

    /* renamed from: r1 */
    public boolean f268622r1 = true;

    /* renamed from: s */
    public C33523r f268623s;

    /* renamed from: s1 */
    public boolean f268624s1 = false;

    /* renamed from: t */
    public EmojiStoreDetailUI$$l f268625t;

    /* renamed from: t1 */
    public C89779i0 f268626t1;

    /* renamed from: u */
    public C101776f80 f268627u = new C101776f80();

    /* renamed from: u1 */
    public EmoticonStoreActionStruct f268628u1;

    /* renamed from: v */
    public boolean f268629v;

    /* renamed from: v1 */
    public EmoticonDetailActivityInfoStruct f268630v1;

    /* renamed from: w */
    public String f268631w = "";

    /* renamed from: w1 */
    public IListener f268632w1 = new IListener<EmotionStateChangeEvent>(C40008f.f107254d) {
        {
            this.__eventId = 449099204;
        }

        public boolean callback(IEvent iEvent) {
            String str;
            EmotionStateChangeEvent emotionStateChangeEvent = (EmotionStateChangeEvent) iEvent;
            String str2 = EmojiStoreDetailUI.this.f268597e;
            if (str2 == null || (str = emotionStateChangeEvent.f264696d.f264697a) == null || !str.equals(str2)) {
                return false;
            }
            EmojiStoreDetailUI emojiStoreDetailUI = EmojiStoreDetailUI.this;
            EmotionStateChangeEvent.C92476a aVar = emotionStateChangeEvent.f264696d;
            emojiStoreDetailUI.mo127742N7(aVar.f264697a, aVar.f264698b, aVar.f264699c, aVar.f264700d);
            return false;
        }
    };

    /* renamed from: x */
    public C51759vz1 f268633x = null;

    /* renamed from: x0 */
    public TextView f268634x0;

    /* renamed from: x1 */
    public View.OnClickListener f268635x1 = new EmojiStoreDetailUI$$e(this);

    /* renamed from: y */
    public boolean f268636y;

    /* renamed from: y0 */
    public View f268637y0;

    /* renamed from: y1 */
    public View.OnClickListener f268638y1 = new EmojiStoreDetailUI$$f(this);

    /* renamed from: z */
    public View f268639z;

    /* renamed from: z1 */
    public View.OnClickListener f268640z1 = new EmojiStoreDetailUI$$g(this);

    /* renamed from: H7 */
    public final void mo127736H7() {
        View view = this.f268639z;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(0);
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/emoji/ui/EmojiStoreDetailUI", "dealUiNoFind", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/emoji/ui/EmojiStoreDetailUI", "dealUiNoFind", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        View view2 = this.f268556B;
        C9556a aVar2 = new C9556a();
        aVar2.mo10233c(8);
        View view3 = view2;
        C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/plugin/emoji/ui/EmojiStoreDetailUI", "dealUiNoFind", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
        C117292a.m165359e(view3, "com/tencent/mm/plugin/emoji/ui/EmojiStoreDetailUI", "dealUiNoFind", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f268560D.setVisibility(8);
        this.f268554A.setText(C0966R.string.c6m);
    }

    /* renamed from: I7 */
    public final void mo127737I7() {
        if (C101963g.m134217b(this.f268597e)) {
            C98905c.m128727a().mo138241c();
            return;
        }
        String str = this.f268597e;
        String str2 = this.f268601g;
        String str3 = this.f268599f;
        String str4 = this.f268603h;
        this.f268621r = new C46439j(str, str2, str3, (String) null, (String) null, (EmojiGroupInfo) null, 0, 0, Util.isNullOrNil(str4) ^ true ? 1 : 0, str4);
        C86709a0.m107529k().f251779b.mo123460f(this.f268621r);
        switch (this.f268592a1) {
            case 9:
                C115669n.INSTANCE.mo160131h(11598, 2, this.f268597e);
                return;
            case 10:
                C115669n.INSTANCE.mo160131h(11598, 1, this.f268597e);
                return;
            case 11:
                C115669n.INSTANCE.mo160131h(11598, 3, this.f268597e);
                return;
            default:
                return;
        }
    }

    /* renamed from: J7 */
    public final C101792j80 mo127738J7() {
        C101776f80 f802 = this.f268627u;
        if (f802 == null) {
            return null;
        }
        return f802.f298234J;
    }

    /* renamed from: K7 */
    public final void mo127739K7() {
        Log.m105924i("MicroMsg.emoji.EmojiStoreDetailUI", "[handleLoadDataFailed]");
        C101776f80 f802 = this.f268627u;
        if (f802 == null || f802.f298242n == 0) {
            View view = this.f268639z;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/emoji/ui/EmojiStoreDetailUI", "handleLoadDataFailed", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/emoji/ui/EmojiStoreDetailUI", "handleLoadDataFailed", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            View view2 = this.f268556B;
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(8);
            View view3 = view2;
            C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/plugin/emoji/ui/EmojiStoreDetailUI", "handleLoadDataFailed", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view3, "com/tencent/mm/plugin/emoji/ui/EmojiStoreDetailUI", "handleLoadDataFailed", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    /* renamed from: L7 */
    public final void mo127740L7() {
        Log.m105924i("MicroMsg.emoji.EmojiStoreDetailUI", "loadRemoteEmotionDetailData");
        if (this.f268627u == null) {
            this.f268619q = new C46441o(this.f268597e, this.f268592a1, -1);
        } else if (Util.isNullOrNil(this.f268631w) || !this.f268631w.equalsIgnoreCase(LocaleUtil.getCurrentLanguage(this.f268595d))) {
            this.f268619q = new C46441o(this.f268597e, this.f268592a1, -1);
        } else {
            this.f268619q = new C46441o(this.f268597e, this.f268592a1, this.f268627u.f298254z);
        }
        C86709a0.m107529k().f251779b.mo123460f(this.f268619q);
        int i = this.f268605i;
        if (i == -1 || i == 3) {
            View view = this.f268556B;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/emoji/ui/EmojiStoreDetailUI", "loadRemoteEmotionDetailData", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/emoji/ui/EmojiStoreDetailUI", "loadRemoteEmotionDetailData", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            View view3 = this.f268639z;
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(8);
            View view4 = view3;
            C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/emoji/ui/EmojiStoreDetailUI", "loadRemoteEmotionDetailData", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view4, "com/tencent/mm/plugin/emoji/ui/EmojiStoreDetailUI", "loadRemoteEmotionDetailData", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f268558C = C76879j.m92723Q(this, getString(C0966R.string.a3h), getString(C0966R.string.a4d), true, true, new EmojiStoreDetailUI$$c(this));
        }
    }

    /* renamed from: M7 */
    public final void mo127741M7() {
        if (C102561f.m135423c(this.f268627u.f298242n, 64)) {
            boolean z = true;
            if ((((C10485b) C86709a0.m107533q(C10485b.class)).vh0().mo107404b("EmotionRewardOption", 0) & 1) == 1) {
                z = false;
            }
            if (z) {
                this.f268623s = new C33523r(this.f268597e, 0);
                C86709a0.m107529k().f251779b.mo123460f(this.f268623s);
            }
        }
    }

    /* renamed from: N7 */
    public void mo127742N7(String str, int i, int i2, String str2) {
        Log.m105919d("MicroMsg.emoji.EmojiStoreDetailUI", "productId:%s,status:%d, progress:%d, cdnClientID:%s, ", str, Integer.valueOf(i), Integer.valueOf(i2), str2);
        if (!Util.isNullOrNil(str) && str.equals(this.f268597e)) {
            if (!TextUtils.isEmpty(str2)) {
                this.f268598e1 = str2;
            }
            if (i == -1) {
                if (this.f268616p != -1) {
                    this.f268616p = -1;
                    mo127743O7(1003);
                }
            } else if (i == 7) {
                this.f268616p = 7;
                mo127743O7(1003);
            } else if (i != 6) {
                Log.m105928w("MicroMsg.emoji.EmojiStoreDetailUI", "[onExchange] do nothing.");
            } else if (!TextUtils.isEmpty(str) && str.equals(this.f268597e)) {
                this.f268616p = 6;
                this.f268614o = i2;
                mo127743O7(1004);
            }
        }
    }

    /* renamed from: O7 */
    public void mo127743O7(int i) {
        MMHandler mMHandler = this.f268557B1;
        if (mMHandler != null) {
            mMHandler.sendEmptyMessage(i);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:68:0x04ef  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0503  */
    /* renamed from: P7 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo127744P7() {
        /*
            r25 = this;
            r0 = r25
            te3.f80 r1 = r0.f268627u
            java.lang.String r1 = r1.f298237f
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r1 != 0) goto L_0x0019
            te3.f80 r1 = r0.f268627u
            java.lang.String r1 = r1.f298237f
            r0.setMMTitle((java.lang.String) r1)
            te3.f80 r1 = r0.f268627u
            java.lang.String r1 = r1.f298237f
            r0.f268599f = r1
        L_0x0019:
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            te3.f80 r3 = r0.f268627u
            java.lang.String r3 = r3.f298250v
            r4 = 0
            r2[r4] = r3
            java.lang.String r3 = "MicroMsg.emoji.EmojiStoreDetailUI"
            java.lang.String r5 = "mData.PanelUrl:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r3, r5, r2)
            android.view.View r2 = r0.f268556B
            k20.a r5 = new k20.a
            r5.<init>()
            java.lang.ThreadLocal<k20.a> r6 = k20.C60958c.f173611a
            java.lang.Integer r6 = java.lang.Integer.valueOf(r4)
            r5.mo10233c(r6)
            java.lang.Object[] r7 = r5.mo10232b()
            java.lang.String r8 = "com/tencent/mm/plugin/emoji/ui/EmojiStoreDetailUI"
            java.lang.String r9 = "updateAllView"
            java.lang.String r10 = "()V"
            java.lang.String r11 = "android/view/View_EXEC_"
            java.lang.String r12 = "setVisibility"
            java.lang.String r13 = "(I)V"
            r6 = r2
            j20.C117292a.m165358d(r6, r7, r8, r9, r10, r11, r12, r13)
            java.lang.Object r5 = r5.mo10231a(r4)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            r2.setVisibility(r5)
            java.lang.String r7 = "com/tencent/mm/plugin/emoji/ui/EmojiStoreDetailUI"
            java.lang.String r8 = "updateAllView"
            java.lang.String r9 = "()V"
            java.lang.String r10 = "android/view/View_EXEC_"
            java.lang.String r11 = "setVisibility"
            java.lang.String r12 = "(I)V"
            j20.C117292a.m165359e(r6, r7, r8, r9, r10, r11, r12)
            android.view.View r2 = r0.f268639z
            k20.a r5 = new k20.a
            r5.<init>()
            r6 = 8
            java.lang.Integer r7 = java.lang.Integer.valueOf(r6)
            r5.mo10233c(r7)
            java.lang.Object[] r14 = r5.mo10232b()
            java.lang.String r15 = "com/tencent/mm/plugin/emoji/ui/EmojiStoreDetailUI"
            java.lang.String r16 = "updateAllView"
            java.lang.String r17 = "()V"
            java.lang.String r18 = "android/view/View_EXEC_"
            java.lang.String r19 = "setVisibility"
            java.lang.String r20 = "(I)V"
            r13 = r2
            j20.C117292a.m165358d(r13, r14, r15, r16, r17, r18, r19, r20)
            java.lang.Object r5 = r5.mo10231a(r4)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            r2.setVisibility(r5)
            java.lang.String r14 = "com/tencent/mm/plugin/emoji/ui/EmojiStoreDetailUI"
            java.lang.String r15 = "updateAllView"
            java.lang.String r16 = "()V"
            java.lang.String r17 = "android/view/View_EXEC_"
            java.lang.String r18 = "setVisibility"
            java.lang.String r19 = "(I)V"
            j20.C117292a.m165359e(r13, r14, r15, r16, r17, r18, r19)
            java.lang.String r2 = r0.f268597e
            boolean r2 = u61.C101963g.m134217b(r2)
            if (r2 != 0) goto L_0x00d1
            te3.f80 r2 = r0.f268627u
            if (r2 == 0) goto L_0x00d9
            java.lang.String r2 = r2.f298245q
            if (r2 == 0) goto L_0x00d9
            k60.a r5 = k60.C99101e.f290571b
            l60.b r2 = r5.mo85955a(r2)
            com.tencent.mm.pluginsdk.ui.emoji.BannerEmojiView r5 = r0.f268561E
            l60.a r2 = (l60.C99342a) r2
            r2.mo85954d(r5)
            goto L_0x00d9
        L_0x00d1:
            com.tencent.mm.pluginsdk.ui.emoji.BannerEmojiView r2 = r0.f268561E
            r5 = 2131235361(0x7f081221, float:1.8086914E38)
            r2.setImageResource(r5)
        L_0x00d9:
            com.tencent.mm.ui.base.MMAutoSizeTextView r2 = r0.f268563G
            te3.f80 r5 = r0.f268627u
            java.lang.String r5 = r5.f298237f
            r2.setText(r5)
            android.widget.TextView r2 = r0.f268564H
            te3.f80 r5 = r0.f268627u
            java.lang.String r5 = r5.f298247s
            r2.setText(r5)
            android.widget.TextView r2 = r0.f268566J
            te3.f80 r5 = r0.f268627u
            java.lang.String r5 = r5.f298238g
            r2.setText(r5)
            te3.f80 r2 = r0.f268627u
            int r2 = r2.f298241j
            boolean r2 = x51.C102561f.m135423c(r2, r1)
            if (r2 == 0) goto L_0x0104
            android.widget.TextView r2 = r0.f268562F
            r2.setVisibility(r6)
            goto L_0x0111
        L_0x0104:
            android.widget.TextView r2 = r0.f268562F
            r2.setVisibility(r4)
            android.widget.TextView r2 = r0.f268562F
            r5 = 2131825112(0x7f1111d8, float:1.928307E38)
            r2.setText(r5)
        L_0x0111:
            r25.mo127749U7()
            r25.mo127747S7()
            r25.mo127745Q7()
            java.lang.String r2 = r0.f268597e
            boolean r2 = u61.C101963g.m134217b(r2)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
            if (r2 == 0) goto L_0x0166
            android.view.View r2 = r0.f268613n1
            k20.a r15 = new k20.a
            r15.<init>()
            r15.mo10233c(r5)
            java.lang.Object[] r8 = r15.mo10232b()
            java.lang.String r9 = "com/tencent/mm/plugin/emoji/ui/EmojiStoreDetailUI"
            java.lang.String r10 = "updateGirdView"
            java.lang.String r11 = "()V"
            java.lang.String r12 = "android/view/View_EXEC_"
            java.lang.String r13 = "setVisibility"
            java.lang.String r14 = "(I)V"
            r7 = r2
            j20.C117292a.m165358d(r7, r8, r9, r10, r11, r12, r13, r14)
            java.lang.Object r5 = r15.mo10231a(r4)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            r2.setVisibility(r5)
            java.lang.String r8 = "com/tencent/mm/plugin/emoji/ui/EmojiStoreDetailUI"
            java.lang.String r9 = "updateGirdView"
            java.lang.String r10 = "()V"
            java.lang.String r11 = "android/view/View_EXEC_"
            java.lang.String r12 = "setVisibility"
            java.lang.String r13 = "(I)V"
            j20.C117292a.m165359e(r7, r8, r9, r10, r11, r12, r13)
            goto L_0x0202
        L_0x0166:
            te3.f80 r2 = r0.f268627u
            java.util.LinkedList<te3.x93> r2 = r2.f298253y
            if (r2 == 0) goto L_0x01c0
            int r2 = r2.size()
            if (r2 <= 0) goto L_0x01c0
            te3.f80 r2 = r0.f268627u
            java.util.LinkedList<te3.x93> r2 = r2.f298253y
            java.lang.Object r2 = r2.get(r4)
            te3.x93 r2 = (te3.C101867x93) r2
            java.lang.String r2 = r2.f299876d
            if (r2 != 0) goto L_0x0181
            goto L_0x01c0
        L_0x0181:
            android.view.View r2 = r0.f268613n1
            k20.a r15 = new k20.a
            r15.<init>()
            r15.mo10233c(r5)
            java.lang.Object[] r8 = r15.mo10232b()
            java.lang.String r9 = "com/tencent/mm/plugin/emoji/ui/EmojiStoreDetailUI"
            java.lang.String r10 = "updateGirdView"
            java.lang.String r11 = "()V"
            java.lang.String r12 = "android/view/View_EXEC_"
            java.lang.String r13 = "setVisibility"
            java.lang.String r14 = "(I)V"
            r7 = r2
            j20.C117292a.m165358d(r7, r8, r9, r10, r11, r12, r13, r14)
            java.lang.Object r5 = r15.mo10231a(r4)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            r2.setVisibility(r5)
            java.lang.String r8 = "com/tencent/mm/plugin/emoji/ui/EmojiStoreDetailUI"
            java.lang.String r9 = "updateGirdView"
            java.lang.String r10 = "()V"
            java.lang.String r11 = "android/view/View_EXEC_"
            java.lang.String r12 = "setVisibility"
            java.lang.String r13 = "(I)V"
            j20.C117292a.m165359e(r7, r8, r9, r10, r11, r12, r13)
            goto L_0x0202
        L_0x01c0:
            android.view.View r2 = r0.f268613n1
            k20.a r5 = new k20.a
            r5.<init>()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r6)
            r5.mo10233c(r7)
            java.lang.Object[] r15 = r5.mo10232b()
            java.lang.String r16 = "com/tencent/mm/plugin/emoji/ui/EmojiStoreDetailUI"
            java.lang.String r17 = "updateGirdView"
            java.lang.String r18 = "()V"
            java.lang.String r19 = "android/view/View_EXEC_"
            java.lang.String r20 = "setVisibility"
            java.lang.String r21 = "(I)V"
            r14 = r2
            j20.C117292a.m165358d(r14, r15, r16, r17, r18, r19, r20, r21)
            java.lang.Object r5 = r5.mo10231a(r4)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            r2.setVisibility(r5)
            java.lang.String r15 = "com/tencent/mm/plugin/emoji/ui/EmojiStoreDetailUI"
            java.lang.String r16 = "updateGirdView"
            java.lang.String r17 = "()V"
            java.lang.String r18 = "android/view/View_EXEC_"
            java.lang.String r19 = "setVisibility"
            java.lang.String r20 = "(I)V"
            j20.C117292a.m165359e(r14, r15, r16, r17, r18, r19, r20)
        L_0x0202:
            com.tencent.mm.plugin.emoji.ui.EmojiDetailGridView r2 = r0.f268567K
            java.lang.String r5 = r0.f268597e
            r2.setProductId(r5)
            com.tencent.mm.plugin.emoji.ui.EmojiStoreDetailUI$$l r2 = r0.f268625t
            if (r2 == 0) goto L_0x0210
            r2.notifyDataSetInvalidated()
        L_0x0210:
            java.lang.Object[] r2 = new java.lang.Object[r1]
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            te3.f80 r7 = r0.f268627u
            int r7 = r7.f298242n
            r5.append(r7)
            java.lang.String r7 = ""
            r5.append(r7)
            java.lang.String r5 = r5.toString()
            r2[r4] = r5
            java.lang.String r5 = "mData.PackFlag:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r3, r5, r2)
            te3.f80 r2 = r0.f268627u
            int r2 = r2.f298242n
            r5 = 16
            r2 = r2 & r5
            if (r2 != r5) goto L_0x0243
            r2 = 2131756448(0x7f1005a0, float:1.9143804E38)
            com.tencent.mm.plugin.emoji.ui.r0 r5 = new com.tencent.mm.plugin.emoji.ui.r0
            r5.<init>(r0)
            r0.addIconOptionMenu(r4, r2, r5)
        L_0x0243:
            com.tencent.mm.ui.base.MMAutoSizeTextView r2 = r0.f268563G
            int r5 = r0.f268576S
            android.view.View r7 = r0.f268578T
            int r7 = r7.getWidth()
            int r5 = r5 - r7
            androidx.appcompat.app.AppCompatActivity r7 = r25.getContext()
            r8 = 2131165590(0x7f070196, float:1.7945401E38)
            int r7 = kg3.C76577a.m92157h(r7, r8)
            r9 = 2
            int r7 = r7 * 2
            int r5 = r5 - r7
            android.widget.TextView r7 = r0.f268562F
            int r7 = r7.getWidth()
            int r5 = r5 - r7
            androidx.appcompat.app.AppCompatActivity r7 = r25.getContext()
            r10 = 2131165563(0x7f07017b, float:1.7945347E38)
            int r7 = kg3.C76577a.m92157h(r7, r10)
            int r7 = r7 * 2
            int r5 = r5 - r7
            r2.setMaxWidth(r5)
            com.tencent.mm.ui.base.MMAutoSizeTextView r2 = r0.f268563G
            r2.setVisibility(r6)
            com.tencent.mm.ui.base.MMAutoSizeTextView r2 = r0.f268563G
            r2.setVisibility(r4)
            te3.f80 r2 = r0.f268627u
            te3.jd3 r2 = r2.f298229E
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
            if (r2 == 0) goto L_0x033b
            int r2 = r2.f136019d
            if (r2 == 0) goto L_0x033b
            int r2 = r0.f268593b1
            r7 = 6
            if (r2 == r7) goto L_0x033b
            android.view.View r2 = r0.f268588Y
            k20.a r7 = new k20.a
            r7.<init>()
            r7.mo10233c(r5)
            java.lang.Object[] r11 = r7.mo10232b()
            java.lang.String r12 = "com/tencent/mm/plugin/emoji/ui/EmojiStoreDetailUI"
            java.lang.String r13 = "updateDesignerView"
            java.lang.String r14 = "()V"
            java.lang.String r15 = "android/view/View_EXEC_"
            java.lang.String r16 = "setVisibility"
            java.lang.String r17 = "(I)V"
            r10 = r2
            j20.C117292a.m165358d(r10, r11, r12, r13, r14, r15, r16, r17)
            java.lang.Object r7 = r7.mo10231a(r4)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            r2.setVisibility(r7)
            java.lang.String r11 = "com/tencent/mm/plugin/emoji/ui/EmojiStoreDetailUI"
            java.lang.String r12 = "updateDesignerView"
            java.lang.String r13 = "()V"
            java.lang.String r14 = "android/view/View_EXEC_"
            java.lang.String r15 = "setVisibility"
            java.lang.String r16 = "(I)V"
            j20.C117292a.m165359e(r10, r11, r12, r13, r14, r15, r16)
            android.view.View r2 = r0.f268582V
            k20.a r7 = new k20.a
            r7.<init>()
            r7.mo10233c(r5)
            java.lang.Object[] r18 = r7.mo10232b()
            java.lang.String r19 = "com/tencent/mm/plugin/emoji/ui/EmojiStoreDetailUI"
            java.lang.String r20 = "updateDesignerView"
            java.lang.String r21 = "()V"
            java.lang.String r22 = "android/view/View_EXEC_"
            java.lang.String r23 = "setVisibility"
            java.lang.String r24 = "(I)V"
            r17 = r2
            j20.C117292a.m165358d(r17, r18, r19, r20, r21, r22, r23, r24)
            java.lang.Object r5 = r7.mo10231a(r4)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            r2.setVisibility(r5)
            java.lang.String r18 = "com/tencent/mm/plugin/emoji/ui/EmojiStoreDetailUI"
            java.lang.String r19 = "updateDesignerView"
            java.lang.String r20 = "()V"
            java.lang.String r21 = "android/view/View_EXEC_"
            java.lang.String r22 = "setVisibility"
            java.lang.String r23 = "(I)V"
            j20.C117292a.m165359e(r17, r18, r19, r20, r21, r22, r23)
            gc0.a r2 = gc0.C20828a.m22825b()
            te3.f80 r5 = r0.f268627u
            te3.jd3 r5 = r5.f298229E
            java.lang.String r5 = r5.f136021f
            android.widget.ImageView r7 = r0.f268584W
            java.lang.String r10 = r0.f268597e
            hc0.c r10 = i61.C98601f.m128137b(r10, r5)
            r2.mo32519h(r5, r7, r10)
            android.widget.TextView r2 = r0.f268586X
            te3.f80 r5 = r0.f268627u
            te3.jd3 r5 = r5.f298229E
            java.lang.String r5 = r5.f136020e
            r2.setText(r5)
            android.view.View r2 = r0.f268582V
            com.tencent.mm.plugin.emoji.ui.q0 r5 = new com.tencent.mm.plugin.emoji.ui.q0
            r5.<init>(r0)
            r2.setOnClickListener(r5)
            goto L_0x03c0
        L_0x033b:
            android.view.View r2 = r0.f268588Y
            k20.a r5 = new k20.a
            r5.<init>()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r6)
            r5.mo10233c(r7)
            java.lang.Object[] r11 = r5.mo10232b()
            java.lang.String r12 = "com/tencent/mm/plugin/emoji/ui/EmojiStoreDetailUI"
            java.lang.String r13 = "updateDesignerView"
            java.lang.String r14 = "()V"
            java.lang.String r15 = "android/view/View_EXEC_"
            java.lang.String r16 = "setVisibility"
            java.lang.String r17 = "(I)V"
            r10 = r2
            j20.C117292a.m165358d(r10, r11, r12, r13, r14, r15, r16, r17)
            java.lang.Object r5 = r5.mo10231a(r4)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            r2.setVisibility(r5)
            java.lang.String r11 = "com/tencent/mm/plugin/emoji/ui/EmojiStoreDetailUI"
            java.lang.String r12 = "updateDesignerView"
            java.lang.String r13 = "()V"
            java.lang.String r14 = "android/view/View_EXEC_"
            java.lang.String r15 = "setVisibility"
            java.lang.String r16 = "(I)V"
            j20.C117292a.m165359e(r10, r11, r12, r13, r14, r15, r16)
            android.view.View r2 = r0.f268582V
            k20.a r5 = new k20.a
            r5.<init>()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r6)
            r5.mo10233c(r7)
            java.lang.Object[] r18 = r5.mo10232b()
            java.lang.String r19 = "com/tencent/mm/plugin/emoji/ui/EmojiStoreDetailUI"
            java.lang.String r20 = "updateDesignerView"
            java.lang.String r21 = "()V"
            java.lang.String r22 = "android/view/View_EXEC_"
            java.lang.String r23 = "setVisibility"
            java.lang.String r24 = "(I)V"
            r17 = r2
            j20.C117292a.m165358d(r17, r18, r19, r20, r21, r22, r23, r24)
            java.lang.Object r5 = r5.mo10231a(r4)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            r2.setVisibility(r5)
            java.lang.String r18 = "com/tencent/mm/plugin/emoji/ui/EmojiStoreDetailUI"
            java.lang.String r19 = "updateDesignerView"
            java.lang.String r20 = "()V"
            java.lang.String r21 = "android/view/View_EXEC_"
            java.lang.String r22 = "setVisibility"
            java.lang.String r23 = "(I)V"
            j20.C117292a.m165359e(r17, r18, r19, r20, r21, r22, r23)
        L_0x03c0:
            te3.f80 r2 = r0.f268627u
            int r2 = r2.f298242n
            r5 = 32
            r2 = r2 & r5
            r7 = 3
            if (r2 != r5) goto L_0x0413
            android.widget.TextView r2 = r0.f268572Q
            android.view.ViewGroup$LayoutParams r2 = r2.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r2 = (android.widget.LinearLayout.LayoutParams) r2
            android.widget.TextView r5 = r0.f268571P
            android.view.ViewGroup$LayoutParams r5 = r5.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r5 = (android.widget.LinearLayout.LayoutParams) r5
            android.widget.TextView r10 = r0.f268572Q
            r10.setVisibility(r4)
            r10 = 1065353216(0x3f800000, float:1.0)
            r2.weight = r10
            r2.gravity = r7
            androidx.appcompat.app.AppCompatActivity r11 = r25.getContext()
            int r11 = kg3.C76577a.m92157h(r11, r8)
            r2.leftMargin = r11
            android.widget.TextView r11 = r0.f268572Q
            r11.setLayoutParams(r2)
            android.widget.TextView r2 = r0.f268572Q
            r2.setGravity(r7)
            r5.weight = r10
            r2 = 5
            r5.gravity = r2
            androidx.appcompat.app.AppCompatActivity r10 = r25.getContext()
            int r8 = kg3.C76577a.m92157h(r10, r8)
            r5.rightMargin = r8
            android.widget.TextView r8 = r0.f268571P
            r8.setLayoutParams(r5)
            android.widget.TextView r5 = r0.f268571P
            r5.setGravity(r2)
            goto L_0x042e
        L_0x0413:
            android.widget.TextView r2 = r0.f268571P
            android.view.ViewGroup$LayoutParams r2 = r2.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r2 = (android.widget.LinearLayout.LayoutParams) r2
            r5 = 17
            r2.gravity = r5
            android.widget.TextView r8 = r0.f268571P
            r8.setLayoutParams(r2)
            android.widget.TextView r2 = r0.f268571P
            r2.setGravity(r5)
            android.widget.TextView r2 = r0.f268572Q
            r2.setVisibility(r6)
        L_0x042e:
            r25.mo127748T7()
            te3.f80 r2 = r0.f268627u
            int r2 = r2.f298242n
            boolean r2 = x51.C102561f.m135421a(r2)
            if (r2 == 0) goto L_0x0524
            te3.f80 r2 = r0.f268627u
            java.lang.String r2 = r2.f298230F
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r2 == 0) goto L_0x0447
            goto L_0x0524
        L_0x0447:
            android.view.View r2 = r0.f268590Z
            k20.a r5 = new k20.a
            r5.<init>()
            java.lang.Integer r8 = java.lang.Integer.valueOf(r4)
            r5.mo10233c(r8)
            java.lang.Object[] r11 = r5.mo10232b()
            java.lang.String r12 = "com/tencent/mm/plugin/emoji/ui/EmojiStoreDetailUI"
            java.lang.String r13 = "updateAllView"
            java.lang.String r14 = "()V"
            java.lang.String r15 = "android/view/View_EXEC_"
            java.lang.String r16 = "setVisibility"
            java.lang.String r17 = "(I)V"
            r10 = r2
            j20.C117292a.m165358d(r10, r11, r12, r13, r14, r15, r16, r17)
            java.lang.Object r5 = r5.mo10231a(r4)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            r2.setVisibility(r5)
            java.lang.String r11 = "com/tencent/mm/plugin/emoji/ui/EmojiStoreDetailUI"
            java.lang.String r12 = "updateAllView"
            java.lang.String r13 = "()V"
            java.lang.String r14 = "android/view/View_EXEC_"
            java.lang.String r15 = "setVisibility"
            java.lang.String r16 = "(I)V"
            j20.C117292a.m165359e(r10, r11, r12, r13, r14, r15, r16)
            android.widget.TextView r2 = r0.f268617p0
            te3.f80 r5 = r0.f268627u
            java.lang.String r5 = r5.f298230F
            r2.setText(r5)
            com.tencent.mm.autogen.mmdata.rpt.EmoticonDetailActivityInfoStruct r2 = new com.tencent.mm.autogen.mmdata.rpt.EmoticonDetailActivityInfoStruct
            r2.<init>()
            r0.f268630v1 = r2
            java.lang.String r5 = r0.f268597e
            java.lang.String r8 = "pid"
            java.lang.String r5 = r2.mo86045b(r8, r5, r1)
            r2.f265454d = r5
            com.tencent.mm.autogen.mmdata.rpt.EmoticonDetailActivityInfoStruct r2 = r0.f268630v1
            int r5 = r0.f268593b1
            long r10 = (long) r5
            r2.f265455e = r10
            te3.f80 r2 = r0.f268627u
            te3.w93 r2 = r2.f298231G
            if (r2 != 0) goto L_0x04b8
            java.lang.String r2 = "go2ActivityDetail: info is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r3, r2)
        L_0x04b6:
            r2 = 0
            goto L_0x04ed
        L_0x04b8:
            int r5 = r2.f299719d
            if (r5 == r1) goto L_0x04e3
            if (r5 == r9) goto L_0x04da
            if (r5 == r7) goto L_0x04c9
            java.lang.String r2 = r2.f299724i
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r2 == 0) goto L_0x04ec
            goto L_0x04eb
        L_0x04c9:
            java.lang.String r5 = r2.f299722g
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r5)
            if (r5 != 0) goto L_0x04b6
            java.lang.String r2 = r2.f299723h
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r2 == 0) goto L_0x04ec
            goto L_0x04eb
        L_0x04da:
            java.lang.String r2 = r2.f299721f
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r2 == 0) goto L_0x04ec
            goto L_0x04eb
        L_0x04e3:
            java.lang.String r2 = r2.f299720e
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r2 == 0) goto L_0x04ec
        L_0x04eb:
            goto L_0x04b6
        L_0x04ec:
            r2 = 1
        L_0x04ed:
            if (r2 != 0) goto L_0x0503
            com.tencent.mm.autogen.mmdata.rpt.EmoticonDetailActivityInfoStruct r2 = r0.f268630v1
            r10 = 0
            r2.f265456f = r10
            android.widget.TextView r2 = r0.f268634x0
            r5 = 2131824907(0x7f11110b, float:1.9282655E38)
            r2.setText(r5)
            android.widget.TextView r2 = r0.f268634x0
            r2.setEnabled(r4)
            goto L_0x0566
        L_0x0503:
            com.tencent.mm.autogen.mmdata.rpt.EmoticonDetailActivityInfoStruct r2 = r0.f268630v1
            r10 = 1
            r2.f265456f = r10
            te3.f80 r2 = r0.f268627u
            te3.w93 r2 = r2.f298231G
            java.lang.String r2 = r2.f299725j
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r5 == 0) goto L_0x051e
            android.widget.TextView r2 = r0.f268634x0
            r5 = 2131824909(0x7f11110d, float:1.928266E38)
            r2.setText(r5)
            goto L_0x0566
        L_0x051e:
            android.widget.TextView r5 = r0.f268634x0
            r5.setText(r2)
            goto L_0x0566
        L_0x0524:
            android.view.View r2 = r0.f268590Z
            k20.a r5 = new k20.a
            r5.<init>()
            java.lang.Integer r8 = java.lang.Integer.valueOf(r6)
            r5.mo10233c(r8)
            java.lang.Object[] r11 = r5.mo10232b()
            java.lang.String r12 = "com/tencent/mm/plugin/emoji/ui/EmojiStoreDetailUI"
            java.lang.String r13 = "updateAllView"
            java.lang.String r14 = "()V"
            java.lang.String r15 = "android/view/View_EXEC_"
            java.lang.String r16 = "setVisibility"
            java.lang.String r17 = "(I)V"
            r10 = r2
            j20.C117292a.m165358d(r10, r11, r12, r13, r14, r15, r16, r17)
            java.lang.Object r5 = r5.mo10231a(r4)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            r2.setVisibility(r5)
            java.lang.String r11 = "com/tencent/mm/plugin/emoji/ui/EmojiStoreDetailUI"
            java.lang.String r12 = "updateAllView"
            java.lang.String r13 = "()V"
            java.lang.String r14 = "android/view/View_EXEC_"
            java.lang.String r15 = "setVisibility"
            java.lang.String r16 = "(I)V"
            j20.C117292a.m165359e(r10, r11, r12, r13, r14, r15, r16)
        L_0x0566:
            te3.j80 r2 = r25.mo127738J7()
            boolean r5 = com.tencent.p014mm.plugin.emoji.model.EmojiLogic.m117490u(r2)
            if (r5 == 0) goto L_0x0604
            r5 = 4
            java.lang.Object[] r5 = new java.lang.Object[r5]
            java.lang.String r6 = r2.f298504f
            r5[r4] = r6
            java.lang.String r6 = r2.f298503e
            r5[r1] = r6
            int r6 = r2.f298509n
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r5[r9] = r6
            java.lang.String r6 = r2.f298505g
            r5[r7] = r6
            java.lang.String r6 = "EmotionLinkInfo %s, %s, %s, %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r6, r5)
            android.view.View r3 = r0.f268637y0
            k20.a r5 = new k20.a
            r5.<init>()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r4)
            r5.mo10233c(r6)
            java.lang.Object[] r8 = r5.mo10232b()
            java.lang.String r9 = "com/tencent/mm/plugin/emoji/ui/EmojiStoreDetailUI"
            java.lang.String r10 = "updateAllView"
            java.lang.String r11 = "()V"
            java.lang.String r12 = "android/view/View_EXEC_"
            java.lang.String r13 = "setVisibility"
            java.lang.String r14 = "(I)V"
            r7 = r3
            j20.C117292a.m165358d(r7, r8, r9, r10, r11, r12, r13, r14)
            java.lang.Object r5 = r5.mo10231a(r4)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            r3.setVisibility(r5)
            java.lang.String r8 = "com/tencent/mm/plugin/emoji/ui/EmojiStoreDetailUI"
            java.lang.String r9 = "updateAllView"
            java.lang.String r10 = "()V"
            java.lang.String r11 = "android/view/View_EXEC_"
            java.lang.String r12 = "setVisibility"
            java.lang.String r13 = "(I)V"
            j20.C117292a.m165359e(r7, r8, r9, r10, r11, r12, r13)
            k60.e r3 = k60.C99101e.f290570a
            k60.a r3 = k60.C99101e.f290571b
            java.lang.String r5 = r2.f298503e
            l60.b r3 = r3.mo85955a(r5)
            n60.f$a r5 = new n60.f$a
            r5.<init>()
            r5.f293176b = r1
            n60.f r5 = r5.mo139398a()
            r3.f291319c = r5
            android.widget.ImageView r5 = r0.f268573Q0
            l60.a r3 = (l60.C99342a) r3
            r3.mo85954d(r5)
            android.widget.TextView r3 = r0.f268575R0
            java.lang.String r5 = r2.f298504f
            r3.setText(r5)
            int r2 = r2.f298502d
            if (r2 != r1) goto L_0x05f8
            goto L_0x05f9
        L_0x05f8:
            r1 = 0
        L_0x05f9:
            android.widget.TextView r2 = r0.f268575R0
            r2.setEnabled(r1)
            android.view.View r2 = r0.f268637y0
            r2.setEnabled(r1)
            goto L_0x0646
        L_0x0604:
            android.view.View r3 = r0.f268637y0
            k20.a r1 = new k20.a
            r1.<init>()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r6)
            r1.mo10233c(r2)
            java.lang.Object[] r6 = r1.mo10232b()
            java.lang.String r7 = "com/tencent/mm/plugin/emoji/ui/EmojiStoreDetailUI"
            java.lang.String r8 = "updateAllView"
            java.lang.String r9 = "()V"
            java.lang.String r10 = "android/view/View_EXEC_"
            java.lang.String r11 = "setVisibility"
            java.lang.String r12 = "(I)V"
            r5 = r3
            j20.C117292a.m165358d(r5, r6, r7, r8, r9, r10, r11, r12)
            java.lang.Object r1 = r1.mo10231a(r4)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r3.setVisibility(r1)
            java.lang.String r4 = "com/tencent/mm/plugin/emoji/ui/EmojiStoreDetailUI"
            java.lang.String r5 = "updateAllView"
            java.lang.String r6 = "()V"
            java.lang.String r7 = "android/view/View_EXEC_"
            java.lang.String r8 = "setVisibility"
            java.lang.String r9 = "(I)V"
            j20.C117292a.m165359e(r3, r4, r5, r6, r7, r8, r9)
        L_0x0646:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.emoji.p040ui.EmojiStoreDetailUI.mo127744P7():void");
    }

    /* renamed from: Q7 */
    public final void mo127745Q7() {
        C50614nz1 nz12;
        if (this.f268620q1) {
            C50614nz1 nz13 = this.f268618p1;
            if (nz13 == null || (nz13.f138860h & 1) != 1) {
                C101776f80 f802 = this.f268627u;
                if ((f802 == null || !C102561f.m135423c(f802.f298242n, 1)) && (nz12 = this.f268618p1) != null && !TextUtils.isEmpty(nz12.f138859g)) {
                    this.f268565I.setText(this.f268618p1.f138859g);
                    this.f268565I.setTextColor(getContext().getResources().getColor(C0966R.color.f3552xi));
                    this.f268565I.setBackgroundDrawable((Drawable) null);
                    this.f268565I.setEnabled(false);
                }
            }
        }
    }

    /* renamed from: R7 */
    public void mo127746R7(boolean z) {
        if (z) {
            this.f268565I.setMinimumWidth(C76577a.m92151b(getContext(), 88));
        } else {
            this.f268565I.setMinimumWidth(C76577a.m92151b(getContext(), 80));
        }
    }

    /* renamed from: S7 */
    public final void mo127747S7() {
        if (C101963g.m134217b(this.f268597e)) {
            boolean a = C101963g.m134216a();
            this.f268636y = a;
            this.f268616p = a ? 7 : 3;
        }
        mo127746R7(false);
        int i = this.f268616p;
        if (i == -1) {
            mo127749U7();
            mo127747S7();
        } else if (i == 0) {
            this.f268580U.setVisibility(8);
            this.f268565I.setTextColor(getResources().getColorStateList(C0966R.color.alc));
            this.f268565I.setBackgroundResource(C0966R.C0969drawable.f4653j6);
            this.f268565I.setText(C0966R.string.c8e);
            this.f268565I.setEnabled(true);
        } else if (i != 20) {
            switch (i) {
                case 3:
                    this.f268580U.setVisibility(8);
                    this.f268565I.setTextColor(getResources().getColorStateList(C0966R.color.alc));
                    this.f268565I.setBackgroundResource(C0966R.C0969drawable.f4653j6);
                    this.f268565I.setText(C0966R.string.c8e);
                    this.f268565I.setEnabled(true);
                    break;
                case 4:
                    this.f268580U.setVisibility(8);
                    this.f268565I.setTextColor(getResources().getColorStateList(C0966R.color.alc));
                    this.f268565I.setBackgroundResource(C0966R.C0969drawable.f4653j6);
                    this.f268565I.setEnabled(true);
                    if (this.f268600f1) {
                        if (!Util.isNullOrNil(this.f268606i1)) {
                            this.f268565I.setText(this.f268606i1);
                            this.f268565I.setContentDescription(String.format(MMApplicationContext.getString(C0966R.string.c7b), new Object[]{this.f268565I.getText()}));
                            break;
                        } else {
                            this.f268565I.setText("");
                            break;
                        }
                    } else {
                        C101776f80 f802 = this.f268627u;
                        if (!((f802.f298242n & 512) == 512)) {
                            this.f268565I.setText(f802.f298240i);
                            this.f268565I.setContentDescription(String.format(MMApplicationContext.getString(C0966R.string.c7b), new Object[]{this.f268565I.getText()}));
                        } else {
                            mo127746R7(true);
                            this.f268565I.setText(C14123e.f39523a.mo13542b(this.f268595d, this.f268627u.f298232H, getString(C0966R.string.ca7), -1), TextView.BufferType.SPANNABLE);
                            this.f268565I.setContentDescription(String.format(MMApplicationContext.getString(C0966R.string.ca8), new Object[]{Integer.valueOf(this.f268627u.f298232H)}));
                        }
                        this.f268616p = 4;
                        break;
                    }
                case 5:
                    this.f268580U.setVisibility(8);
                    this.f268565I.setBackgroundResource(C0966R.C0969drawable.f4653j6);
                    this.f268565I.setText(C0966R.string.c8e);
                    this.f268565I.setEnabled(true);
                    break;
                case 6:
                    this.f268580U.setVisibility(8);
                    this.f268565I.setEnabled(false);
                    View view = this.f268570N;
                    C9556a aVar = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar.mo10233c(0);
                    C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/emoji/ui/EmojiStoreDetailUI", "updateProductStatusView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                    C117292a.m165359e(view, "com/tencent/mm/plugin/emoji/ui/EmojiStoreDetailUI", "updateProductStatusView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    this.f268568L.setVisibility(0);
                    this.f268565I.setVisibility(4);
                    break;
                case 7:
                    this.f268580U.setVisibility(8);
                    this.f268565I.setVisibility(0);
                    this.f268565I.setEnabled(true);
                    if (this.f268624s1) {
                        this.f268565I.setText(C0966R.string.c7d);
                        this.f268565I.setTextColor(getResources().getColorStateList(C0966R.color.f3539x4));
                        this.f268565I.setBackgroundResource(C0966R.C0969drawable.f4659ja);
                    } else {
                        mo127746R7(true);
                        this.f268565I.setTextColor(getResources().getColorStateList(C0966R.color.alc));
                        this.f268565I.setText(C0966R.string.c8a);
                        this.f268565I.setBackgroundResource(C0966R.C0969drawable.f4653j6);
                    }
                    View view2 = this.f268570N;
                    C9556a aVar2 = new C9556a();
                    ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                    aVar2.mo10233c(8);
                    View view3 = view2;
                    C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/plugin/emoji/ui/EmojiStoreDetailUI", "updateProductStatusView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                    C117292a.m165359e(view3, "com/tencent/mm/plugin/emoji/ui/EmojiStoreDetailUI", "updateProductStatusView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    this.f268569M.setProgress(0);
                    this.f268568L.setVisibility(4);
                    break;
                case 8:
                    this.f268580U.setVisibility(8);
                    this.f268565I.setTextColor(getResources().getColorStateList(C0966R.color.f3325nz));
                    this.f268565I.setBackgroundResource(C0966R.C0969drawable.f4665jf);
                    this.f268565I.setText(C0966R.string.c8h);
                    this.f268565I.setEnabled(false);
                    break;
                default:
                    switch (i) {
                        case 10:
                        case 12:
                            this.f268580U.setVisibility(8);
                            this.f268565I.setVisibility(0);
                            this.f268565I.setBackgroundResource(C0966R.C0969drawable.f4653j6);
                            this.f268565I.setText(C0966R.string.f360375c93);
                            this.f268565I.setEnabled(true);
                            View view4 = this.f268570N;
                            C9556a aVar3 = new C9556a();
                            ThreadLocal<C9556a> threadLocal3 = C60958c.f173611a;
                            aVar3.mo10233c(8);
                            View view5 = view4;
                            C117292a.m165358d(view5, aVar3.mo10232b(), "com/tencent/mm/plugin/emoji/ui/EmojiStoreDetailUI", "updateProductStatusView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            view4.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                            C117292a.m165359e(view5, "com/tencent/mm/plugin/emoji/ui/EmojiStoreDetailUI", "updateProductStatusView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            this.f268569M.setProgress(0);
                            this.f268568L.setVisibility(4);
                            break;
                        case 11:
                            break;
                        default:
                            Log.m105929w("MicroMsg.emoji.EmojiStoreDetailUI", "unknow product status:%d", Integer.valueOf(i));
                            break;
                    }
            }
            this.f268580U.setVisibility(0);
            this.f268565I.setVisibility(0);
            this.f268565I.setBackgroundResource(C0966R.C0969drawable.boi);
            this.f268565I.setText("");
            this.f268565I.setEnabled(false);
            View view6 = this.f268570N;
            C9556a aVar4 = new C9556a();
            ThreadLocal<C9556a> threadLocal4 = C60958c.f173611a;
            aVar4.mo10233c(8);
            View view7 = view6;
            C117292a.m165358d(view7, aVar4.mo10232b(), "com/tencent/mm/plugin/emoji/ui/EmojiStoreDetailUI", "updateProductStatusView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view6.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
            C117292a.m165359e(view7, "com/tencent/mm/plugin/emoji/ui/EmojiStoreDetailUI", "updateProductStatusView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f268569M.setProgress(0);
            this.f268568L.setVisibility(4);
        } else {
            this.f268580U.setVisibility(8);
            this.f268565I.setTextColor(getResources().getColorStateList(C0966R.color.f3325nz));
            this.f268565I.setBackgroundResource(C0966R.C0969drawable.f4665jf);
            this.f268565I.setText(C0966R.string.c79);
            this.f268565I.setEnabled(false);
        }
        mo127745Q7();
    }

    /* renamed from: T7 */
    public void mo127748T7() {
        if (C102561f.m135423c(this.f268627u.f298242n, 64)) {
            if ((((C10485b) C86709a0.m107533q(C10485b.class)).vh0().mo107404b("EmotionRewardOption", 0) & 1) != 1) {
                if (this.f268633x != null) {
                    View view = this.f268577S0;
                    C9556a aVar = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar.mo10233c(0);
                    View view2 = view;
                    C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/emoji/ui/EmojiStoreDetailUI", "updateRewardView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                    C117292a.m165359e(view2, "com/tencent/mm/plugin/emoji/ui/EmojiStoreDetailUI", "updateRewardView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    this.f268581U0.setText(C0966R.string.c9b);
                    this.f268579T0.setText(this.f268633x.f143785g.f137244d);
                    this.f268579T0.setLongClickable(false);
                    if (this.f268633x.f143783e > 0) {
                        this.f268585W0.setVisibility(0);
                        String valueOf = String.valueOf(this.f268633x.f143783e);
                        String format = String.format(getString(C0966R.string.c9f), new Object[]{Integer.valueOf(this.f268633x.f143783e)});
                        SpannableString spannableString = new SpannableString(format);
                        int indexOf = format.indexOf(valueOf);
                        if (indexOf >= 0) {
                            spannableString.setSpan(new ForegroundColorSpan(getResources().getColor(C0966R.color.f3337oc)), indexOf, valueOf.length() + indexOf, 33);
                        }
                        this.f268585W0.setText(spannableString);
                    } else {
                        this.f268585W0.setVisibility(8);
                    }
                    LinkedList<C49528g80> linkedList = this.f268633x.f143784f;
                    if (linkedList == null || linkedList.size() <= 0) {
                        this.f268583V0.setVisibility(8);
                        return;
                    }
                    this.f268583V0.setVisibility(0);
                    DonorsAvatarView donorsAvatarView = this.f268583V0;
                    String str = this.f268597e;
                    LinkedList<C49528g80> linkedList2 = this.f268633x.f143784f;
                    donorsAvatarView.removeAllViews();
                    if (linkedList2 != null && linkedList2.size() > 0) {
                        int size = linkedList2.size();
                        int i = donorsAvatarView.f12257h;
                        if (size <= i) {
                            i = linkedList2.size();
                        }
                        for (int i2 = 0; i2 < i; i2++) {
                            C49528g80 g802 = linkedList2.get(i2);
                            if (g802 != null) {
                                ImageView imageView = new ImageView(donorsAvatarView.getContext());
                                imageView.setLayoutParams(donorsAvatarView.f12258i);
                                C20937c cVar = null;
                                if (!Util.isNullOrNil(g802.f133921d)) {
                                    C20828a b = C20828a.m22825b();
                                    String str2 = g802.f133921d;
                                    Object[] objArr = new Object[0];
                                    int i3 = C98601f.f289098a;
                                    String p = EmojiLogic.m117485p(C101964h.m134224f(), str, str2);
                                    if (!Util.isNullOrNil(p)) {
                                        C20937c.C20939b bVar = new C20937c.C20939b();
                                        bVar.f59345a = true;
                                        bVar.f59346b = true;
                                        bVar.f59350f = p;
                                        bVar.f59368x = objArr;
                                        cVar = bVar.mo32666a();
                                    } else {
                                        Log.m105928w("MicroMsg.emoji.EmojiImageLoaderManager", "get emoji loader options failed. path is null.");
                                    }
                                    b.mo32519h(str2, imageView, cVar);
                                } else {
                                    try {
                                        imageView.setImageBitmap(BackwardSupportUtil.BitmapFactory.decodeStream(MMApplicationContext.getContext().getAssets().open("avatar/default_nor_avatar.png"), C76577a.m92156g((Context) null)));
                                    } catch (IOException e) {
                                        Log.printErrStackTrace("MicroMsg.emoji.DonorsAvatarView", e, "", new Object[0]);
                                    }
                                }
                                donorsAvatarView.addView(imageView);
                            }
                        }
                        return;
                    }
                    return;
                }
                View view3 = this.f268577S0;
                C9556a aVar2 = new C9556a();
                ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                aVar2.mo10233c(8);
                C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/plugin/emoji/ui/EmojiStoreDetailUI", "updateRewardView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view3, "com/tencent/mm/plugin/emoji/ui/EmojiStoreDetailUI", "updateRewardView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                mo127741M7();
                return;
            }
        }
        View view4 = this.f268577S0;
        C9556a aVar3 = new C9556a();
        ThreadLocal<C9556a> threadLocal3 = C60958c.f173611a;
        aVar3.mo10233c(8);
        View view5 = view4;
        C117292a.m165358d(view5, aVar3.mo10232b(), "com/tencent/mm/plugin/emoji/ui/EmojiStoreDetailUI", "updateRewardView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view4.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
        C117292a.m165359e(view5, "com/tencent/mm/plugin/emoji/ui/EmojiStoreDetailUI", "updateRewardView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    /* renamed from: U7 */
    public final void mo127749U7() {
        if (!C102561f.m135423c(this.f268627u.f298241j, 8) && !C102561f.m135423c(this.f268627u.f298241j, 4) && !this.f268600f1) {
            C101776f80 f802 = this.f268627u;
            if (f802.f298232H != 0) {
                TextUtils.isEmpty(f802.f298240i);
            }
        }
        Log.m105925i("MicroMsg.emoji.EmojiStoreDetailUI", "PackFlag:%d", Integer.valueOf(this.f268627u.f298242n));
        boolean z = C102561f.m135421a(this.f268627u.f298242n) && Util.isNullOrNil(this.f268603h);
        if (C102561f.m135423c(this.f268627u.f298242n, 8) && C102561f.m135424d(this.f268627u.f298241j)) {
            this.f268616p = 8;
        } else if (C102561f.m135423c(this.f268627u.f298242n, 1) || C102561f.m135423c(this.f268627u.f298241j, 8)) {
            this.f268616p = 3;
        } else if (z) {
            this.f268616p = 20;
        } else if (C102561f.m135424d(this.f268627u.f298241j)) {
            this.f268616p = 0;
        } else {
            if (!this.f268600f1) {
                C101776f80 f803 = this.f268627u;
                if ((f803.f298233I == 0 && TextUtils.isEmpty(f803.f298248t)) || this.f268627u.f298248t.equals("0")) {
                    this.f268616p = 0;
                }
            }
            if (!this.f268600f1) {
                this.f268616p = 4;
            } else if (TextUtils.isEmpty(this.f268606i1)) {
                this.f268616p = this.f268602g1;
            } else {
                this.f268616p = 4;
            }
        }
        if (this.f268636y) {
            this.f268616p = 7;
        }
    }

    public int getForceOrientation() {
        return 1;
    }

    public int getLayoutId() {
        return C0966R.C0971layout.a2e;
    }

    public void initView() {
        if (!Util.isNullOrNil(this.f268599f)) {
            setMMTitle(this.f268599f);
        }
        setBackBtn(new EmojiStoreDetailUI$$k(this));
        this.f268591Z0 = C76577a.m92157h(this.f268595d, C0966R.dimen.a3j);
        this.f268587X0 = getResources().getDimensionPixelSize(C0966R.dimen.a3i);
        this.f268587X0 = C76577a.m92157h(this.f268595d, C0966R.dimen.a3i);
        this.f268589Y0 = 4;
        this.f268560D = (EmojiDetailScrollView) findViewById(C0966R.C0970id.j4b);
        View findViewById = findViewById(C0966R.C0970id.cig);
        this.f268639z = findViewById;
        this.f268554A = (TextView) findViewById.findViewById(C0966R.C0970id.cip);
        this.f268556B = findViewById(C0966R.C0970id.chv);
        BannerEmojiView bannerEmojiView = (BannerEmojiView) findViewById(C0966R.C0970id.cfs);
        this.f268561E = bannerEmojiView;
        this.f268561E.setMinimumHeight((int) (((float) (((bannerEmojiView.getRight() - this.f268561E.getLeft()) - this.f268561E.getPaddingRight()) - this.f268561E.getPaddingLeft())) * 0.56f));
        this.f268562F = (TextView) findViewById(C0966R.C0970id.ci9);
        this.f268563G = (MMAutoSizeTextView) findViewById(C0966R.C0970id.ci_);
        this.f268564H = (TextView) findViewById(C0966R.C0970id.cf4);
        this.f268565I = (TextView) findViewById(C0966R.C0970id.cib);
        this.f268566J = (TextView) findViewById(C0966R.C0970id.cfc);
        this.f268576S = C76577a.m92145A(getContext());
        this.f268578T = findViewById(C0966R.C0970id.ce5);
        this.f268567K = (EmojiDetailGridView) findViewById(C0966R.C0970id.cfo);
        this.f268625t = new EmojiStoreDetailUI$$l(this);
        if (C101963g.m134217b(this.f268597e)) {
            EmojiStoreDetailUI$$l emojiStoreDetailUI$$l = this.f268625t;
            ((C92054g) C86312j.m106911c(C92054g.class)).getClass();
            List<EmojiInfo> NQ = C30790w2.m39221h().mo57717d().mo142039NQ("17");
            ((ArrayList) emojiStoreDetailUI$$l.f268651d).clear();
            ((ArrayList) emojiStoreDetailUI$$l.f268651d).addAll(NQ);
            emojiStoreDetailUI$$l.notifyDataSetChanged();
        }
        this.f268570N = findViewById(C0966R.C0970id.chh);
        this.f268569M = (ProgressBar) findViewById(C0966R.C0970id.cfh);
        ImageView imageView = (ImageView) findViewById(C0966R.C0970id.cez);
        this.f268568L = imageView;
        imageView.setOnClickListener(this);
        View view = this.f268570N;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/emoji/ui/EmojiStoreDetailUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/emoji/ui/EmojiStoreDetailUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f268568L.setVisibility(8);
        this.f268569M.setProgress(0);
        this.f268567K.setAdapter(this.f268625t);
        this.f268567K.setColumnWidth(this.f268587X0);
        this.f268567K.setNumColumns(this.f268589Y0);
        this.f268567K.setHorizontalSpacing(this.f268591Z0);
        this.f268567K.setVerticalSpacing(this.f268591Z0);
        this.f268567K.setEmojiDetailScrollView(this.f268560D);
        this.f268567K.setFromDetail(true);
        this.f268567K.setIsShowPopWin(true);
        this.f268567K.setOnItemClickListener(new EmojiStoreDetailUI$$b(this));
        this.f268565I.setOnClickListener(this);
        this.f268574R = findViewById(C0966R.C0970id.k1t);
        this.f268571P = (TextView) findViewById(C0966R.C0970id.chn);
        this.f268572Q = (TextView) findViewById(C0966R.C0970id.f357914cf0);
        this.f268571P.setOnClickListener(this.f268635x1);
        this.f268572Q.setOnClickListener(this.f268638y1);
        ProgressBar progressBar = (ProgressBar) findViewById(C0966R.C0970id.cfn);
        this.f268580U = progressBar;
        progressBar.setVisibility(this.f268600f1 ? 0 : 8);
        this.f268613n1 = findViewById(C0966R.C0970id.f357921cg2);
        if (WeChatBrands.Business.Entries.MeStickerDeclare.banned()) {
            View view2 = this.f268574R;
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(8);
            C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/emoji/ui/EmojiStoreDetailUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/emoji/ui/EmojiStoreDetailUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        this.f268588Y = findViewById(C0966R.C0970id.cfb);
        this.f268582V = findViewById(C0966R.C0970id.c2r);
        this.f268584W = (ImageView) findViewById(C0966R.C0970id.c2x);
        this.f268586X = (TextView) findViewById(C0966R.C0970id.c37);
        this.f268577S0 = findViewById(C0966R.C0970id.chj);
        this.f268579T0 = (TextView) findViewById(C0966R.C0970id.isd);
        this.f268581U0 = (Button) findViewById(C0966R.C0970id.ise);
        this.f268585W0 = (TextView) findViewById(C0966R.C0970id.isi);
        this.f268583V0 = (DonorsAvatarView) findViewById(C0966R.C0970id.isc);
        this.f268581U0.setOnClickListener(this.f268640z1);
        this.f268585W0.setOnClickListener(this.f268555A1);
        this.f268590Z = findViewById(C0966R.C0970id.cfd);
        this.f268617p0 = (TextView) findViewById(C0966R.C0970id.cff);
        TextView textView = (TextView) findViewById(C0966R.C0970id.cfe);
        this.f268634x0 = textView;
        textView.setOnClickListener(this);
        this.f268637y0 = findViewById(C0966R.C0970id.occ);
        this.f268573Q0 = (ImageView) findViewById(C0966R.C0970id.ocd);
        this.f268575R0 = (TextView) findViewById(C0966R.C0970id.oce);
        this.f268637y0.setOnClickListener(this);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        String str;
        int i3;
        int i4 = i;
        int i5 = i2;
        Intent intent2 = intent;
        int i6 = 0;
        Log.m105919d("MicroMsg.emoji.EmojiStoreDetailUI", "onActivityResult. requestCode:[%d] resultCode:[%d]", Integer.valueOf(i), Integer.valueOf(i2));
        if (i4 == 2001) {
            if (intent2 != null) {
                i3 = intent2.getIntExtra("key_err_code", 0);
                Log.m105928w("MicroMsg.emoji.EmojiStoreDetailUI", "errCode:" + i3);
                str = intent2.getStringExtra("key_err_msg");
                Log.m105928w("MicroMsg.emoji.EmojiStoreDetailUI", "errMsg:" + str);
            } else {
                str = "";
                i3 = 0;
            }
            this.f268611m1 = false;
            if (i5 != -1) {
                this.f268616p = -1;
                mo127747S7();
                if (C75592q0.m90796z()) {
                    C115669n.INSTANCE.idkeyStat(166, 6, 1, false);
                } else {
                    C115669n.INSTANCE.idkeyStat(166, 2, 1, false);
                }
            } else if (intent2 != null && i3 == 0) {
                ArrayList<String> stringArrayListExtra = intent2.getStringArrayListExtra("key_response_product_ids");
                ArrayList<String> stringArrayListExtra2 = intent2.getStringArrayListExtra("key_response_series_ids");
                if (stringArrayListExtra == null || !stringArrayListExtra.contains(this.f268597e)) {
                    this.f268616p = -1;
                    mo127747S7();
                    if (TextUtils.isEmpty(str)) {
                        str = getString(C0966R.string.c77);
                    }
                    C76879j.m92749t(this, str, "", new C93206p0(this));
                    return;
                }
                while (i6 < stringArrayListExtra.size()) {
                    if (this.f268597e.equals(stringArrayListExtra.get(i6))) {
                        this.f268601g = stringArrayListExtra2.get(i6);
                    }
                    i6++;
                }
                this.f268627u.f298242n = 1;
                mo127737I7();
                this.f268616p = 6;
                C76879j.m92726T(this, str);
                if (C75592q0.m90796z()) {
                    C115669n.INSTANCE.idkeyStat(166, 4, 1, false);
                } else {
                    C115669n.INSTANCE.idkeyStat(166, 0, 1, false);
                }
            } else if (intent2 != null && i3 == 100000002) {
                mo127737I7();
                this.f268616p = 6;
                this.f268625t.notifyDataSetChanged();
                if (C75592q0.m90796z()) {
                    C115669n.INSTANCE.idkeyStat(166, 7, 1, false);
                } else {
                    C115669n.INSTANCE.idkeyStat(166, 3, 1, false);
                }
            } else if (intent2 == null || i3 != 1) {
                this.f268616p = -1;
                mo127747S7();
                if (TextUtils.isEmpty(str)) {
                    str = getString(C0966R.string.c77);
                }
                C76879j.m92749t(this, str, "", new C93206p0(this));
                if (C75592q0.m90796z()) {
                    C115669n.INSTANCE.idkeyStat(166, 5, 1, false);
                } else {
                    C115669n.INSTANCE.idkeyStat(166, 1, 1, false);
                }
            } else {
                this.f268616p = -1;
                mo127747S7();
                if (C75592q0.m90796z()) {
                    C115669n.INSTANCE.idkeyStat(166, 6, 1, false);
                } else {
                    C115669n.INSTANCE.idkeyStat(166, 2, 1, false);
                }
            }
        } else if (i4 != 2002) {
            this.f268612n.getClass();
            if (i4 == 2003) {
                if (i5 == -1) {
                    Log.m105919d("MicroMsg.emoji.EmojiStoreDetailUI", "jacks use emoji to : %s", intent2.getStringExtra("Select_Conv_User"));
                    if (IntentUtil.getBooleanExtra(getIntent(), "from_appbrand_ui", false)) {
                        this.f268612n.f300173b = true;
                    }
                    C101966i iVar = this.f268612n;
                    String str2 = this.f268597e;
                    iVar.getClass();
                    String stringExtra = intent2.getStringExtra("Select_Conv_User");
                    if (Util.isNullOrNil(stringExtra)) {
                        Log.m105918d("MicroMsg.emoji.UseSmileyTool", "talker name is invalid so can't go to chat room use.");
                    } else {
                        Intent intent3 = new Intent();
                        intent3.putExtra("Chat_User", stringExtra);
                        intent3.putExtra("smiley_product_id", str2);
                        if (iVar.f300173b) {
                            intent3.addFlags(268435456);
                        }
                        ((C67654r1) ((C11502f) C86312j.m106911c(C11502f.class)).mo11462yM()).mo93173f(intent3, this);
                    }
                    C115669n.INSTANCE.mo160131h(12069, 3, this.f268597e);
                }
            } else if (i4 == 0) {
                if (i5 == -1) {
                    C75026b.m89951a(this, getContext().getString(C0966R.string.a2x));
                }
            } else if (i4 == 2005) {
                C101792j80 J7 = mo127738J7();
                int i7 = EmojiLogic.f268226a;
                if (J7 != null && J7.f298510o == 1) {
                    i6 = 1;
                }
                if (i6 != 0) {
                    mo127740L7();
                }
            }
        } else if (i5 == -1) {
            String stringExtra2 = intent2.getStringExtra("Select_Conv_User");
            if (!Util.isNullOrNil(stringExtra2)) {
                Log.m105918d("MicroMsg.emoji.EmojiStoreDetailUI", ".." + stringExtra2);
                String str3 = this.f268597e;
                C101776f80 f802 = this.f268627u;
                String str4 = f802.f298237f;
                String str5 = f802.f298238g;
                String str6 = f802.f298236e;
                String str7 = f802.f298227C;
                int i8 = f802.f298242n;
                String string = getResources().getString(C0966R.string.f7959xh);
                ((C78541w) C86312j.m106911c(C78541w.class)).mo108483Em(this, stringExtra2, string + str4, getString(C0966R.string.a2s), getString(C0966R.string.bja), str6, new C8859k(stringExtra2, str3, str4, str5, str6, str7, i8, this));
            }
        }
    }

    public void onClick(View view) {
        int i;
        String str;
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/emoji/ui/EmojiStoreDetailUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int id = view.getId();
        if (id == C0966R.C0970id.cib) {
            int i2 = this.f268616p;
            if (i2 == 7) {
                String stringExtra = getIntent().getStringExtra("to_talker_name");
                if (this.f268624s1) {
                    C86709a0.m107529k().f251779b.mo123460f(new C46445t(this.f268597e, 2));
                    this.f268626t1 = C89779i0.m112248e(this, getString(C0966R.string.gap), true, 0, (DialogInterface.OnCancelListener) null);
                } else {
                    Util.isNullOrNil(stringExtra);
                    this.f268612n.mo141488a(this);
                    C115669n.INSTANCE.mo160131h(12069, 2, this.f268597e);
                }
                Log.m105918d("MicroMsg.emoji.EmojiStoreDetailUI", "jacks kv stat update click use emoji");
                C115669n.INSTANCE.kvStat(11076, "0, ");
            } else if (i2 == -1) {
                Log.m105924i("MicroMsg.emoji.EmojiStoreDetailUI", "can not be clicked.");
            } else if (i2 == 0 || i2 == 3) {
                if (this.f268624s1) {
                    i = 6;
                    C99148f.f290704a.mo138516a(6);
                } else {
                    i = 6;
                }
                mo127737I7();
                this.f268616p = i;
                mo127747S7();
                C115669n.INSTANCE.mo160131h(12066, 1, Integer.valueOf(this.f268593b1), "", this.f268597e, this.f268594c1, this.f268596d1, Integer.valueOf(EmojiLogic.m117482m(mo127738J7())), Integer.valueOf(EmojiLogic.m117484o(mo127738J7())), EmojiLogic.m117483n(mo127738J7()));
                EmoticonStoreActionStruct emoticonStoreActionStruct = this.f268628u1;
                if (emoticonStoreActionStruct != null) {
                    emoticonStoreActionStruct.f265470f = 4;
                    emoticonStoreActionStruct.mo86054n();
                }
            } else if (i2 != 4) {
                if (i2 != 5) {
                    switch (i2) {
                        case 10:
                        case 12:
                            switch (this.f268604h1) {
                                case 10233:
                                    str = getString(C0966R.string.c6n);
                                    break;
                                case 10234:
                                    str = getString(C0966R.string.c6b);
                                    break;
                                case 10235:
                                    str = getString(C0966R.string.c_u);
                                    break;
                                default:
                                    str = getString(C0966R.string.c_z);
                                    break;
                            }
                            C76879j.m92748s(this, str, (String) null);
                            break;
                        case 11:
                            Log.m105924i("MicroMsg.emoji.EmojiStoreDetailUI", "can not be clicked.");
                            break;
                        default:
                            Log.m105921e("MicroMsg.emoji.EmojiStoreDetailUI", "can not product status.%d", Integer.valueOf(i2));
                            break;
                    }
                } else {
                    this.f268616p = 3;
                    mo127747S7();
                }
            } else if (!this.f268611m1) {
                if (this.f268624s1) {
                    C99148f.f290704a.mo138516a(6);
                }
                if (((C10432i) C86312j.m106911c(C10432i.class)).mo10750e()) {
                    C14123e.m13457b(getContext(), getString(C0966R.string.ca4), (C32224a<C13598b0>) null);
                    Log.m105925i("MicroMsg.emoji.EmojiStoreDetailUI", "Pay Intercept, TeenModeEnable, mProductId:%s, mData.WeCoinNum:%s", this.f268597e, Integer.valueOf(this.f268627u.f298233I));
                } else {
                    C101776f80 f802 = this.f268627u;
                    if ((f802.f298242n & 512) == 512) {
                        Log.m105925i("MicroMsg.emoji.EmojiStoreDetailUI", "mProductId:%s, mData.WeCoinNum:%s, PriceNum:%s", this.f268597e, Integer.valueOf(f802.f298233I), this.f268627u.f298248t);
                        if (C14123e.f39524b == -1) {
                            C14123e.f39524b = C86709a0.m107535s().mo121142i().mo119689j(C72994y1.C72995a.USERINFO_EMOJI_STORE_FIRST_CLICK_WECOIN_PAY_BUTTON_INT, 0);
                        }
                        if (C14123e.f39524b == 0) {
                            C14123e.m13458c(true);
                            C14123e.f39523a.mo13541a(getContext()).mo140655A();
                        } else {
                            C14123e.m13458c(true);
                            AppCompatActivity context = getContext();
                            String str2 = this.f268597e;
                            C101776f80 f803 = this.f268627u;
                            C14123e.m13456a(context, str2, f803.f298249u, f803.f298233I, f803.f298248t, f803.f298237f);
                        }
                    } else {
                        Log.m105925i("MicroMsg.emoji.EmojiStoreDetailUI", "mProductId:%s, mData.PackPrice:%s,PriceType:%s", this.f268597e, f802.f298240i, f802.f298249u);
                        Intent intent = new Intent();
                        intent.putExtra("key_product_id", this.f268597e);
                        if (this.f268600f1) {
                            intent.putExtra("key_currency_type", this.f268608j1);
                            intent.putExtra("key_price", this.f268608j1 + this.f268609k1);
                        } else {
                            intent.putExtra("key_currency_type", this.f268627u.f298249u);
                            intent.putExtra("key_price", this.f268627u.f298248t);
                        }
                        C88144b.m109795m(this, "wallet_index", ".ui.WalletIapUI", intent, 2001);
                    }
                    C115669n.INSTANCE.mo160131h(12066, 2, Integer.valueOf(this.f268593b1), "", this.f268597e, this.f268594c1, this.f268596d1, Integer.valueOf(EmojiLogic.m117482m(mo127738J7())), Integer.valueOf(EmojiLogic.m117484o(mo127738J7())), EmojiLogic.m117483n(mo127738J7()));
                    this.f268611m1 = true;
                }
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/emoji/ui/EmojiStoreDetailUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        } else if (id == C0966R.C0970id.cfh) {
            C76879j.m92739j(this, C0966R.string.c86, 0, C0966R.string.c_0, C0966R.string.c89, new C93213s0(this), new C93215t0(this));
            C117292a.m165361g(this, "com/tencent/mm/plugin/emoji/ui/EmojiStoreDetailUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        } else if (id == C0966R.C0970id.cez) {
            C76879j.m92739j(this, C0966R.string.c86, 0, C0966R.string.c_0, C0966R.string.c89, new C93213s0(this), new C93215t0(this));
            C117292a.m165361g(this, "com/tencent/mm/plugin/emoji/ui/EmojiStoreDetailUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        } else if (id == C0966R.C0970id.cfe) {
            EmoticonDetailActivityInfoStruct emoticonDetailActivityInfoStruct = this.f268630v1;
            String str3 = ".ui.tools.WebViewUI";
            if (emoticonDetailActivityInfoStruct != null) {
                emoticonDetailActivityInfoStruct.f265457g = 1;
            }
            C101860w93 w932 = this.f268627u.f298231G;
            if (w932 == null) {
                Log.m105928w("MicroMsg.emoji.EmojiStoreDetailUI", "go2ActivityDetail: info is null");
            } else {
                int i3 = w932.f299719d;
                if (i3 == 1) {
                    String str4 = w932.f299720e;
                    Class cls = C60200t1.class;
                    Log.m105925i("MicroMsg.emoji.EmojiStoreDetailUI", "go2Finder: %s", str4);
                    if (Util.isNullOrNil(str4)) {
                        Log.m105928w("MicroMsg.emoji.EmojiStoreDetailUI", "go2Finder: username is empty");
                    } else {
                        Intent intent2 = new Intent();
                        intent2.putExtra("finder_username", str4);
                        boolean equals = str4.equals(C75592q0.m90778h());
                        ((C60200t1) C86312j.m106911c(cls)).mo76842e7(14, 2, equals ? 33 : 32, intent2);
                        intent2.putExtra("KEY_FINDER_SELF_FLAG", equals);
                        ((C60200t1) C86312j.m106911c(cls)).mo76819V1(getContext(), intent2);
                    }
                } else if (i3 == 2) {
                    String str5 = w932.f299721f;
                    Log.m105925i("MicroMsg.emoji.EmojiStoreDetailUI", "go2BizProfile: %s", str5);
                    if (Util.isNullOrNil(str5)) {
                        Log.m105928w("MicroMsg.emoji.EmojiStoreDetailUI", "go2BizProfile: username is empty");
                    } else {
                        Intent intent3 = new Intent();
                        intent3.putExtra("Contact_User", str5);
                        intent3.putExtra("force_get_contact", true);
                        intent3.putExtra("key_use_new_contact_profile", true);
                        C88144b.m109791i(this.f268595d, Scopes.PROFILE, ".ui.ContactInfoUI", intent3, (Bundle) null);
                    }
                } else if (i3 != 3) {
                    String str6 = w932.f299724i;
                    Log.m105925i("MicroMsg.emoji.EmojiStoreDetailUI", "go2H5: %s", str6);
                    if (Util.isNullOrNil(str6)) {
                        Log.m105928w("MicroMsg.emoji.EmojiStoreDetailUI", "go2H5: h5 is empty");
                    } else {
                        Intent intent4 = new Intent();
                        intent4.putExtra("rawUrl", str6);
                        C88144b.m109791i(this, "webview", str3, intent4, (Bundle) null);
                    }
                } else {
                    String str7 = w932.f299722g;
                    String str8 = w932.f299723h;
                    Log.m105925i("MicroMsg.emoji.EmojiStoreDetailUI", "go2AppBrand: %s, %s", str7, str8);
                    if (Util.isNullOrNil(str7)) {
                        Log.m105928w("MicroMsg.emoji.EmojiStoreDetailUI", "go2AppBrand: username is empty");
                    } else {
                        C86299o oVar = new C86299o();
                        oVar.f250929a = str7;
                        oVar.f250939k = 1204;
                        oVar.f250934f = str8;
                        ((C76630x0) C86312j.m106911c(C76630x0.class)).mo106898tv(this, oVar);
                    }
                }
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/emoji/ui/EmojiStoreDetailUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        } else {
            String str9 = ".ui.tools.WebViewUI";
            if (id == C0966R.C0970id.occ) {
                C101792j80 J7 = mo127738J7();
                if (J7 != null) {
                    String str10 = J7.f298505g;
                    Intent intent5 = new Intent();
                    intent5.putExtra("rawUrl", str10);
                    intent5.putExtra("MMActivity.OverrideEnterAnimation", C0966R.C0968anim.f2333y);
                    intent5.putExtra("MMActivity.OverrideExitAnimation", C0966R.C0968anim.f2469dt);
                    C88144b.m109795m(this, "webview", str9, intent5, 2005);
                    overridePendingTransition(C0966R.C0968anim.f2471dv, C0966R.C0968anim.f2333y);
                }
                C117292a.m165361g(this, "com/tencent/mm/plugin/emoji/ui/EmojiStoreDetailUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            Log.m105928w("MicroMsg.emoji.EmojiStoreDetailUI", "click view is unknow.");
            C117292a.m165361g(this, "com/tencent/mm/plugin/emoji/ui/EmojiStoreDetailUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    public void onCreate(Bundle bundle) {
        C38142q qVar;
        Class cls = C92054g.class;
        Class cls2 = C10432i.class;
        super.onCreate(bundle);
        if (!C86709a0.m107522a()) {
            finish();
        } else if (((C10432i) C86312j.m106911c(cls2)).mo10750e()) {
            Log.m105924i("MicroMsg.emoji.EmojiStoreDetailUI", "exit in teen mode");
            ((C10432i) C86312j.m106911c(cls2)).mo10755m4(this);
            finish();
        } else {
            this.f268600f1 = C75592q0.m90796z();
            this.f268612n = new C101966i(2003);
            Intent intent = getIntent();
            this.f268597e = getIntent().getStringExtra("extra_id");
            this.f268592a1 = getIntent().getIntExtra("preceding_scence", -1);
            this.f268599f = getIntent().getStringExtra("extra_name");
            this.f268605i = getIntent().getIntExtra("call_by", -1);
            this.f268603h = getIntent().getStringExtra("ad_uxInfo");
            String stringExtra = getIntent().getStringExtra("sns_object_data");
            int i = 3;
            if (!TextUtils.isEmpty(stringExtra)) {
                this.f268597e = EmojiLogic.m117488s(stringExtra);
                this.f268592a1 = 10;
                C115669n.INSTANCE.mo160131h(10993, 3, this.f268597e);
            }
            Log.m105925i("MicroMsg.emoji.EmojiStoreDetailUI", "handleIntent produceId %s, adUxInfo %s, mEmoticonPrecedingScence=%s", this.f268597e, this.f268603h, Integer.valueOf(this.f268592a1));
            if (TextUtils.isEmpty(this.f268597e)) {
                Log.m105918d("MicroMsg.emoji.EmojiStoreDetailUI", "[hadleIntent] product id is null.");
                finish();
            }
            if (this.f268592a1 == -1) {
                Log.m105920e("MicroMsg.emoji.EmojiStoreDetailUI", "[hadleIntent] emoticon preceding scence no set!");
                finish();
            }
            this.f268615o1 = intent.getBooleanExtra("check_clickflag", true);
            this.f268598e1 = intent.getStringExtra("cdn_client_id");
            this.f268593b1 = intent.getIntExtra("download_entrance_scene", 0);
            this.f268624s1 = intent.getBooleanExtra("from_popup", false);
            String stringExtra2 = intent.getStringExtra("searchID");
            this.f268594c1 = stringExtra2;
            if (stringExtra2 == null) {
                this.f268594c1 = "";
            }
            this.f268596d1 = Util.nullAs(intent.getStringExtra("docID"), "");
            String stringExtra3 = intent.getStringExtra("extra_copyright");
            if (!TextUtils.isEmpty(stringExtra3)) {
                this.f268627u.f298247s = stringExtra3;
            }
            String stringExtra4 = intent.getStringExtra("extra_coverurl");
            if (!TextUtils.isEmpty(stringExtra4)) {
                this.f268627u.f298245q = stringExtra4;
            }
            String stringExtra5 = intent.getStringExtra("extra_description");
            if (!TextUtils.isEmpty(stringExtra5)) {
                this.f268627u.f298238g = stringExtra5;
            }
            String stringExtra6 = intent.getStringExtra("extra_price");
            if (!TextUtils.isEmpty(stringExtra6)) {
                this.f268627u.f298240i = stringExtra6;
            }
            int intExtra = intent.getIntExtra("extra_type", -1);
            if (intExtra != -1) {
                this.f268627u.f298241j = intExtra;
            }
            int intExtra2 = intent.getIntExtra("extra_flag", -1);
            if (intExtra2 != -1) {
                this.f268627u.f298242n = intExtra2;
            }
            String stringExtra7 = intent.getStringExtra("extra_price_type");
            if (!TextUtils.isEmpty(stringExtra7)) {
                this.f268627u.f298249u = stringExtra7;
            }
            String stringExtra8 = intent.getStringExtra("extra_price_num");
            if (!TextUtils.isEmpty(stringExtra8)) {
                this.f268627u.f298248t = stringExtra8;
            }
            int intExtra3 = intent.getIntExtra("extra_pack_wecoin_price", -1);
            if (intExtra3 != -1) {
                this.f268627u.f298232H = intExtra3;
            }
            int intExtra4 = intent.getIntExtra("extra_wecoin_price", -1);
            if (intExtra4 != -1) {
                this.f268627u.f298233I = intExtra4;
            }
            if (this.f268600f1) {
                this.f268602g1 = 11;
                ((C9531b) C86312j.m106911c(C9531b.class)).mo10037oy(this, this.f268610l1, this.f268559C1);
            }
            this.f268607j = intent.getBooleanExtra("reward_tip", false);
            String stringExtra9 = intent.getStringExtra("action_report");
            if (!Util.isNullOrNil(stringExtra9)) {
                this.f268628u1 = new EmoticonStoreActionStruct(stringExtra9);
            }
            String[] strArr = this.f268610l1;
            String str = this.f268597e;
            strArr[0] = str;
            C101776f80 f802 = this.f268627u;
            f802.f298235d = str;
            f802.f298237f = this.f268599f;
            f802.f298226B = null;
            f802.f298248t = "-1";
            f802.f298254z = -1;
            this.f268595d = this;
            initView();
            if (!C101963g.m134217b(this.f268597e)) {
                mo127740L7();
                ((C92054g) C86312j.m106911c(cls)).getClass();
                C30790w2 h = C30790w2.m39221h();
                synchronized (h.f82769a) {
                    qVar = h.f82777i;
                }
                this.f268633x = qVar.mo61539jo(this.f268597e);
                if (this.f268615o1) {
                    C86709a0.m107529k().f251779b.mo123460f(new C33522n(this.f268597e));
                } else {
                    this.f268620q1 = true;
                    int i2 = EmojiLogic.f268226a;
                    C50614nz1 nz12 = new C50614nz1();
                    nz12.f138858f = 1;
                    nz12.f138860h = 1;
                    this.f268618p1 = nz12;
                }
            } else {
                AppCompatActivity context = getContext();
                C101776f80 f803 = new C101776f80();
                f803.f298235d = "17";
                f803.f298237f = context.getString(C0966R.string.c_9);
                f803.f298238g = context.getString(C0966R.string.c_7);
                f803.f298239h = context.getString(C0966R.string.c_5);
                f803.f298240i = "";
                f803.f298241j = 0;
                f803.f298242n = 1;
                f803.f298245q = "";
                f803.f298246r = 0;
                f803.f298247s = context.getString(C0966R.string.c_6);
                f803.f298250v = "";
                f803.f298248t = "";
                f803.f298249u = "";
                f803.f298225A = context.getString(C0966R.string.c_8);
                this.f268627u = f803;
                this.f268620q1 = true;
                int i3 = EmojiLogic.f268226a;
                C50614nz1 nz13 = new C50614nz1();
                nz13.f138858f = 1;
                nz13.f138860h = 1;
                this.f268618p1 = nz13;
                boolean a = C101963g.m134216a();
                this.f268636y = a;
                if (a) {
                    i = 7;
                }
                this.f268616p = i;
            }
            mo127744P7();
            ((C92054g) C86312j.m106911c(cls)).getClass();
            C30790w2.m39221h().mo57715b().add(this);
            this.f268632w1.alive();
            C86709a0.m107529k().f251779b.mo123455a(822, this);
            mo127742N7(this.f268597e, getIntent().getIntExtra("extra_status", -1), getIntent().getIntExtra("extra_progress", 0), this.f268598e1);
            this.f268622r1 = true;
            if (this.f268607j && this.f268560D != null) {
                this.f268557B1.postDelayed(new EmojiStoreDetailUI$$j(this), 0);
            }
        }
    }

    public void onDestroy() {
        super.onDestroy();
        ((C92054g) C86312j.m106911c(C92054g.class)).getClass();
        C30790w2.m39221h().mo57715b().remove(this);
        this.f268632w1.dead();
        C86709a0.m107529k().f251779b.mo123470p(822, this);
        EmojiDetailGridView emojiDetailGridView = this.f268567K;
        if (emojiDetailGridView != null) {
            emojiDetailGridView.mo136420f();
        }
        this.f268557B1.removeCallbacksAndMessages((Object) null);
        EmoticonDetailActivityInfoStruct emoticonDetailActivityInfoStruct = this.f268630v1;
        if (emoticonDetailActivityInfoStruct != null) {
            emoticonDetailActivityInfoStruct.mo86054n();
            this.f268630v1 = null;
        }
    }

    public void onNotifyChange(String str, MStorageEventData mStorageEventData) {
        mo127743O7(1001);
    }

    public void onPause() {
        super.onPause();
        C86709a0.m107529k().f251779b.mo123470p(412, this);
        C86709a0.m107529k().f251779b.mo123470p(521, this);
        C86709a0.m107529k().f251779b.mo123470p(v2helper.EMethodSetNgStrength, this);
        C86709a0.m107529k().f251779b.mo123470p(413, this);
    }

    public void onRestoreInstanceState(Bundle bundle) {
        this.f268616p = bundle.getInt("status");
        this.f268614o = bundle.getInt("progress");
    }

    public void onResume() {
        C38142q qVar;
        super.onResume();
        C86709a0.m107529k().f251779b.mo123455a(412, this);
        C86709a0.m107529k().f251779b.mo123455a(521, this);
        C86709a0.m107529k().f251779b.mo123455a(v2helper.EMethodSetNgStrength, this);
        C86709a0.m107529k().f251779b.mo123455a(413, this);
        this.f268611m1 = false;
        if (!this.f268622r1) {
            ((C92054g) C86312j.m106911c(C92054g.class)).getClass();
            C30790w2 h = C30790w2.m39221h();
            synchronized (h.f82769a) {
                qVar = h.f82777i;
            }
            this.f268633x = qVar.mo61539jo(this.f268597e);
            mo127743O7(1007);
        }
        mo127741M7();
        this.f268622r1 = false;
        mo127743O7(1001);
    }

    public void onSaveInstanceState(Bundle bundle) {
        bundle.putInt("status", this.f268616p);
        bundle.putInt("progress", this.f268614o);
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        EmojiDetailScrollView emojiDetailScrollView;
        int i3 = i2;
        C117747y yVar2 = yVar;
        Log.m105925i("MicroMsg.emoji.EmojiStoreDetailUI", "[onSceneEnd] errType:%d, errCode:%d, errMsg:%s", Integer.valueOf(i), Integer.valueOf(i2), str);
        ProgressDialog progressDialog = this.f268558C;
        if (progressDialog != null && progressDialog.isShowing()) {
            this.f268558C.dismiss();
        }
        int type = yVar.getType();
        if (type != 412) {
            if (type == 413) {
                C89779i0 i0Var = this.f268626t1;
                if (i0Var != null) {
                    i0Var.dismiss();
                    this.f268626t1 = null;
                }
                if (i == 0 && i3 == 0) {
                    ((C92054g) C86312j.m106911c(C92054g.class)).getClass();
                    C30790w2.m39221h().mo57715b().mo142021Ow(((C46445t) yVar2).f125114f);
                    this.f268616p = 3;
                    mo127747S7();
                    return;
                }
                C76879j.m92707A(getContext(), getContext().getString(C0966R.string.c_w), "", "", getContext().getString(C0966R.string.f8029zr), (DialogInterface.OnClickListener) null, (DialogInterface.OnClickListener) null);
            } else if (type != 423) {
                if (type == 521) {
                    Log.m105924i("MicroMsg.emoji.EmojiStoreDetailUI", "[onSceneEnd] MMFunc_GetEmotionDesc");
                    C33522n nVar = (C33522n) yVar2;
                    if (Util.isNullOrNil(nVar.f90764f) || !nVar.f90764f.equalsIgnoreCase(this.f268597e)) {
                        Log.m105924i("MicroMsg.emoji.EmojiStoreDetailUI", "no equal productid");
                    } else {
                        if (i == 0 && i3 == 0) {
                            this.f268618p1 = (C50614nz1) nVar.f90762d.f127056b.f127083a;
                        } else {
                            this.f268618p1 = null;
                        }
                        this.f268620q1 = true;
                        mo127745Q7();
                    }
                    this.f268620q1 = true;
                    mo127745Q7();
                } else if (type == 822 && (yVar2 instanceof C33523r)) {
                    Log.m105924i("MicroMsg.emoji.EmojiStoreDetailUI", "[onSceneEnd] MMFunc_MMGetEmotionReward");
                    if (i == 0 && i3 == 0) {
                        this.f268633x = ((C33523r) yVar2).mo59186j1();
                        mo127743O7(1007);
                    }
                }
            } else if (yVar2 instanceof C46439j) {
                Log.m105924i("MicroMsg.emoji.EmojiStoreDetailUI", "[onSceneEnd] MMFunc_ExchangeEmotionPack");
                C46439j jVar = (C46439j) yVar2;
                if (jVar != this.f268621r || Util.isNullOrNil(jVar.f125078f) || !jVar.f125078f.equalsIgnoreCase(this.f268597e)) {
                    Log.m105924i("MicroMsg.emoji.EmojiStoreDetailUI", "no equal productid");
                } else if (i == 0 && i3 == 0) {
                    this.f268598e1 = jVar.f125087r;
                    this.f268616p = 6;
                    mo127747S7();
                } else {
                    this.f268616p = -1;
                    mo127747S7();
                    C76879j.m92750u(this, String.format(getString(C0966R.string.c8f), new Object[]{this.f268599f}), "", new C93217u0(this), new C93218v0(this));
                }
            }
        } else if (yVar2 instanceof C46441o) {
            Log.m105924i("MicroMsg.emoji.EmojiStoreDetailUI", "[onSceneEnd] MMFunc_GetEmotionDetail");
            C46441o oVar = (C46441o) yVar2;
            if (Util.isNullOrNil(oVar.f125094f) || !oVar.f125094f.equalsIgnoreCase(this.f268597e)) {
                Log.m105924i("MicroMsg.emoji.EmojiStoreDetailUI", "no equal productid");
            } else if (i == 0) {
                if (i3 == 0) {
                    C101776f80 j1 = oVar.mo71837j1();
                    this.f268627u = j1;
                    EmojiStoreDetailUI$$l emojiStoreDetailUI$$l = this.f268625t;
                    if (j1 == null) {
                        emojiStoreDetailUI$$l.getClass();
                    } else if (emojiStoreDetailUI$$l.f268652e.f268627u.f298253y != null) {
                        ((ArrayList) emojiStoreDetailUI$$l.f268651d).clear();
                        Iterator<C101867x93> it = emojiStoreDetailUI$$l.f268652e.f268627u.f298253y.iterator();
                        while (it.hasNext()) {
                            C101867x93 next = it.next();
                            EmojiInfo emojiInfo = new EmojiInfo();
                            emojiInfo.field_md5 = next.f299878f;
                            emojiInfo.field_thumbUrl = next.f299881i;
                            emojiInfo.field_cdnUrl = next.f299880h;
                            emojiInfo.field_aeskey = next.f299879g;
                            emojiInfo.field_encrypturl = next.f299882j;
                            emojiInfo.field_externUrl = next.f299883n;
                            emojiInfo.field_externMd5 = next.f299884o;
                            emojiInfo.field_activityid = next.f299885p;
                            emojiInfo.field_groupId = emojiStoreDetailUI$$l.f268652e.f268597e;
                            emojiInfo.field_catalog = 84;
                            emojiInfo.field_reserved4 |= 1;
                            ((ArrayList) emojiStoreDetailUI$$l.f268651d).add(emojiInfo);
                        }
                        emojiStoreDetailUI$$l.notifyDataSetChanged();
                    }
                    mo127743O7(1002);
                    if (this.f268607j && (emojiDetailScrollView = this.f268560D) != null) {
                        emojiDetailScrollView.postDelayed(new EmojiStoreDetailUI$$a(this), 100);
                    }
                    if (!this.f268629v) {
                        this.f268629v = true;
                        EmotionPageStruct emotionPageStruct = new EmotionPageStruct();
                        emotionPageStruct.f265480d = 1;
                        emotionPageStruct.f265481e = emotionPageStruct.mo86045b("PID", this.f268597e, true);
                        emotionPageStruct.f265482f = (long) this.f268593b1;
                        emotionPageStruct.f265483g = 26;
                        emotionPageStruct.f265489m = (long) EmojiLogic.m117482m(mo127738J7());
                        emotionPageStruct.f265490n = (long) EmojiLogic.m117484o(mo127738J7());
                        emotionPageStruct.f265491o = emotionPageStruct.mo86045b("linkReportInfo", EmojiLogic.m117483n(mo127738J7()), true);
                        emotionPageStruct.mo86054n();
                    }
                } else if (i3 == 1) {
                    mo127736H7();
                } else {
                    this.f268554A.setText(C0966R.string.c8p);
                    mo127739K7();
                }
            } else if (i3 == 5) {
                if (oVar.mo71837j1() != null) {
                    this.f268627u.f298242n = oVar.mo71837j1().f298242n;
                }
                mo127743O7(1002);
            } else if (i3 == 1) {
                mo127736H7();
            } else {
                this.f268560D.setVisibility(8);
                View view = this.f268639z;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(0);
                View view2 = view;
                C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/emoji/ui/EmojiStoreDetailUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/emoji/ui/EmojiStoreDetailUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                this.f268554A.setText(C0966R.string.f360087a11);
                mo127739K7();
            }
        }
    }

    public void onStart() {
        super.onStart();
    }

    public void onStop() {
        super.onStop();
    }

    public void superImportUIComponents(HashSet<Class<? extends UIComponent>> hashSet) {
        super.superImportUIComponents(hashSet);
        hashSet.add(C66553b.class);
    }
}
