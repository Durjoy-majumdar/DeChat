package com.tencent.p014mm.plugin.luckymoney.p073ui;

import af0.C16457a;
import af0.C16458b;
import af0.C16459c;
import af0.C16463e;
import af0.C16464f;
import af0.C67031g;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.media.SoundPool;
import android.os.Bundle;
import android.os.Looper;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import b63.C67186g0;
import bf0.C16793a;
import bf0.C16794b;
import c42.C67339b;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.accessibility.base.MMBaseAccessibilityConfig;
import com.tencent.p014mm.accessibility.base.ViewSetter;
import com.tencent.p014mm.accessibility.type.ViewType;
import com.tencent.p014mm.api.IEmojiInfo;
import com.tencent.p014mm.autogen.events.GetFestivalLuckyMoneyResEvent;
import com.tencent.p014mm.autogen.events.SendMsgEvent;
import com.tencent.p014mm.autogen.mmdata.rpt.RedEnvReplyWithEmoticonClickStruct;
import com.tencent.p014mm.autogen.mmdata.rpt.RedEnvReplyWithEmoticonDataStruct;
import com.tencent.p014mm.autogen.mmdata.rpt.RedEnvSendWithEmoticonClickStruct;
import com.tencent.p014mm.emoji.view.BaseEmojiView;
import com.tencent.p014mm.modelavatar.C68097n;
import com.tencent.p014mm.modelavatar.C68098o;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.p136ui.widget.pulldown.NestedBounceView;
import com.tencent.p014mm.p136ui.widget.snackbar.C75026b;
import com.tencent.p014mm.plugin.luckymoney.model.C69158a0;
import com.tencent.p014mm.plugin.luckymoney.model.C69206d2;
import com.tencent.p014mm.plugin.luckymoney.model.C69236j1;
import com.tencent.p014mm.plugin.luckymoney.model.C69242l1;
import com.tencent.p014mm.plugin.luckymoney.model.C69245l2;
import com.tencent.p014mm.plugin.luckymoney.model.C69248m2;
import com.tencent.p014mm.plugin.luckymoney.model.C69249n;
import com.tencent.p014mm.plugin.luckymoney.model.C69253n2;
import com.tencent.p014mm.plugin.luckymoney.model.C69267u1;
import com.tencent.p014mm.plugin.luckymoney.model.LuckyMoneyEmojiSwitch;
import com.tencent.p014mm.plugin.luckymoney.p073ui.C69554a;
import com.tencent.p014mm.plugin.luckymoney.p073ui.C69558a3;
import com.tencent.p014mm.plugin.luckymoney.story.C69313d0;
import com.tencent.p014mm.plugin.luckymoney.story.EnvelopeAppBarLayout;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.wallet.balance.p119ui.lqt.WalletLqtSaveFetchUI;
import com.tencent.p014mm.plugin.wallet_core.id_verify.util.RealnameGuideHelper;
import com.tencent.p014mm.plugin.wallet_core.p125ui.C72476y0;
import com.tencent.p014mm.plugin.wallet_core.utils.C72501h;
import com.tencent.p014mm.plugin.wallet_core.utils.C72506r;
import com.tencent.p014mm.pluginsdk.p133ui.ChatFooterPanel;
import com.tencent.p014mm.pluginsdk.p133ui.applet.CdnImageView;
import com.tencent.p014mm.pluginsdk.p133ui.chat.C30699x0;
import com.tencent.p014mm.sdk.platformtools.BackwardSupportUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.storage.C72996z1;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter;
import com.tencent.p014mm.wallet_core.p137ui.C7089c0;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import di3.C86312j;
import eb0.C31519v2;
import eb0.C45628s0;
import eb0.C75604z3;
import f32.C75674c;
import f32.C75675d;
import f32.C75676e;
import f40.C86709a0;
import f62.C75700k0;
import fy3.C32226l;
import ie3.C76324c;
import j20.C117292a;
import j61.C46435b;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import jq3.C60896i;
import jq3.C60905o;
import jq3.C9493c;
import jq3.C9500j;
import k20.C60958c;
import k20.C9556a;
import ke3.C88144b;
import kg3.C76577a;
import nj3.C100124v0;
import nj3.C11182m0;
import nj3.C11184p0;
import nj3.C76874e0;
import nj3.C76879j;
import nj3.C88989a;
import ob0.C11385n;
import ob0.C117747y;
import p008bq.C0363p0;
import p008bq.C39833l0;
import p008bq.C67303a1;
import p008bq.C67305d1;
import p008bq.C67308r1;
import p008bq.C67309t0;
import p196ln.C76706g;
import p281yz.C79173v;
import p492dn.C107054l;
import p629ny.C76979h;
import p680ru.C77570i;
import qo3.C77407n;
import te3.C101800k70;
import te3.C51365ta;
import te3.C64514l50;
import te3.C77935gl2;
import te3.C77994sf2;
import te3.C78023zk3;
import u32.C65209a;
import vo3.C78461f;
import wc3.C78541w;
import wd3.C65953v0;
import yq3.C79148e;

@C88989a(35)
/* renamed from: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyDetailUI */
public class LuckyMoneyDetailUI extends LuckyMoneyBaseUI {

    /* renamed from: r2 */
    public static final /* synthetic */ int f199792r2 = 0;

    /* renamed from: A */
    public View f199793A;

    /* renamed from: A1 */
    public C72506r f199794A1;

    /* renamed from: B */
    public View f199795B;

    /* renamed from: B1 */
    public int f199796B1;

    /* renamed from: C */
    public TextView f199797C;

    /* renamed from: C1 */
    public int f199798C1;

    /* renamed from: D */
    public TextView f199799D;

    /* renamed from: D1 */
    public Set<String> f199800D1 = new HashSet();

    /* renamed from: E */
    public ViewGroup f199801E;

    /* renamed from: E1 */
    public boolean f199802E1 = false;

    /* renamed from: F */
    public RelativeLayout f199803F;

    /* renamed from: F1 */
    public ImageView f199804F1;

    /* renamed from: G */
    public ImageView f199805G;

    /* renamed from: G1 */
    public ImageView f199806G1;

    /* renamed from: H */
    public View f199807H;

    /* renamed from: H1 */
    public View f199808H1;

    /* renamed from: I */
    public SoundPool f199809I;

    /* renamed from: I1 */
    public View f199810I1;

    /* renamed from: J */
    public int[] f199811J;

    /* renamed from: J1 */
    public TextView f199812J1;

    /* renamed from: K */
    public int f199813K = 0;

    /* renamed from: K1 */
    public CdnImageView f199814K1;

    /* renamed from: L */
    public ViewGroup f199815L;

    /* renamed from: L1 */
    public TextView f199816L1;

    /* renamed from: M */
    public Dialog f199817M;

    /* renamed from: M1 */
    public RecyclerView.C0130p f199818M1 = new C69374g();

    /* renamed from: N */
    public RelativeLayout f199819N;

    /* renamed from: N1 */
    public Bitmap f199820N1;

    /* renamed from: O1 */
    public Bitmap f199821O1;

    /* renamed from: P */
    public BaseEmojiView f199822P;

    /* renamed from: P1 */
    public Bitmap f199823P1;

    /* renamed from: Q */
    public TextView f199824Q;

    /* renamed from: Q0 */
    public ImageView f199825Q0;

    /* renamed from: Q1 */
    public Bitmap f199826Q1;

    /* renamed from: R */
    public LinearLayout f199827R;

    /* renamed from: R0 */
    public View f199828R0;

    /* renamed from: R1 */
    public Bitmap f199829R1;

    /* renamed from: S */
    public LinearLayout f199830S;

    /* renamed from: S0 */
    public ViewGroup f199831S0;

    /* renamed from: S1 */
    public Bitmap f199832S1;

    /* renamed from: T */
    public LinearLayout f199833T;

    /* renamed from: T0 */
    public TextView f199834T0;

    /* renamed from: T1 */
    public Bitmap f199835T1;

    /* renamed from: U */
    public LinearLayout f199836U;

    /* renamed from: U0 */
    public ImageView f199837U0;

    /* renamed from: U1 */
    public Bitmap f199838U1;

    /* renamed from: V */
    public LinearLayout f199839V;

    /* renamed from: V0 */
    public EnvelopeAppBarLayout f199840V0;

    /* renamed from: V1 */
    public C16458b f199841V1 = new C69377l();

    /* renamed from: W */
    public ImageView f199842W;

    /* renamed from: W0 */
    public boolean f199843W0 = true;

    /* renamed from: W1 */
    public boolean f199844W1 = false;

    /* renamed from: X */
    public TextView f199845X;

    /* renamed from: X0 */
    public boolean f199846X0 = false;

    /* renamed from: X1 */
    public C39833l0.C39834a f199847X1 = new C69378m();

    /* renamed from: Y */
    public BaseEmojiView f199848Y;

    /* renamed from: Y0 */
    public int f199849Y0;

    /* renamed from: Y1 */
    public int f199850Y1;

    /* renamed from: Z */
    public RelativeLayout f199851Z;

    /* renamed from: Z0 */
    public String f199852Z0;

    /* renamed from: Z1 */
    public WxRecyclerAdapter f199853Z1;

    /* renamed from: a1 */
    public String f199854a1;

    /* renamed from: a2 */
    public int f199855a2;

    /* renamed from: b1 */
    public String f199856b1;

    /* renamed from: b2 */
    public String f199857b2;

    /* renamed from: c1 */
    public String f199858c1;

    /* renamed from: c2 */
    public C69158a0 f199859c2;

    /* renamed from: d1 */
    public int f199860d1 = -1;

    /* renamed from: d2 */
    public String f199861d2;

    /* renamed from: e1 */
    public List<C69236j1> f199862e1 = new LinkedList();

    /* renamed from: e2 */
    public String f199863e2;

    /* renamed from: f1 */
    public ArrayList<C69392t> f199864f1 = new ArrayList<>();

    /* renamed from: f2 */
    public String f199865f2;

    /* renamed from: g */
    public boolean f199866g = false;

    /* renamed from: g1 */
    public Map<String, Integer> f199867g1 = new HashMap();

    /* renamed from: g2 */
    public String f199868g2;

    /* renamed from: h */
    public RecyclerView f199869h;

    /* renamed from: h1 */
    public String f199870h1 = "";

    /* renamed from: h2 */
    public int f199871h2;

    /* renamed from: i */
    public ImageView f199872i;

    /* renamed from: i1 */
    public long f199873i1;

    /* renamed from: i2 */
    public C65209a f199874i2;

    /* renamed from: j */
    public TextView f199875j;

    /* renamed from: j1 */
    public boolean f199876j1 = false;

    /* renamed from: j2 */
    public int f199877j2;

    /* renamed from: k1 */
    public boolean f199878k1 = false;

    /* renamed from: k2 */
    public String f199879k2;

    /* renamed from: l1 */
    public IEmojiInfo f199880l1;

    /* renamed from: l2 */
    public String f199881l2;

    /* renamed from: m1 */
    public String f199882m1;

    /* renamed from: m2 */
    public long f199883m2 = 0;

    /* renamed from: n */
    public TextView f199884n;

    /* renamed from: n1 */
    public int f199885n1;

    /* renamed from: n2 */
    public View.OnClickListener f199886n2 = new C69371f();

    /* renamed from: o */
    public ImageView f199887o;

    /* renamed from: o1 */
    public ChatFooterPanel f199888o1;

    /* renamed from: o2 */
    public int f199889o2 = 3;

    /* renamed from: p */
    public View f199890p;

    /* renamed from: p0 */
    public ImageView f199891p0;

    /* renamed from: p1 */
    public IEmojiInfo f199892p1;

    /* renamed from: p2 */
    public C11385n f199893p2 = new C42527i();

    /* renamed from: q */
    public TextView f199894q;

    /* renamed from: q1 */
    public ViewGroup f199895q1;

    /* renamed from: q2 */
    public int f199896q2 = 0;

    /* renamed from: r */
    public View f199897r;

    /* renamed from: r1 */
    public LuckyMoneyEmojiSwitch f199898r1;

    /* renamed from: s */
    public TextView f199899s;

    /* renamed from: s1 */
    public RedEnvReplyWithEmoticonClickStruct f199900s1;

    /* renamed from: t */
    public CdnImageView f199901t;

    /* renamed from: t1 */
    public RedEnvReplyWithEmoticonDataStruct f199902t1;

    /* renamed from: u */
    public View f199903u;

    /* renamed from: u1 */
    public int f199904u1 = 0;

    /* renamed from: v */
    public TextView f199905v;

    /* renamed from: v1 */
    public boolean f199906v1 = false;

    /* renamed from: w */
    public View f199907w;

    /* renamed from: w1 */
    public String f199908w1;

    /* renamed from: x */
    public View f199909x;

    /* renamed from: x0 */
    public C69554a f199910x0;

    /* renamed from: x1 */
    public int f199911x1;

    /* renamed from: y */
    public ViewGroup f199912y;

    /* renamed from: y0 */
    public View f199913y0;

    /* renamed from: y1 */
    public int f199914y1;

    /* renamed from: z */
    public View f199915z;

    /* renamed from: z1 */
    public C72501h f199916z1;

    /* renamed from: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyDetailUI$k */
    public class C18929k implements Runnable {
        public C18929k() {
        }

        public void run() {
            LuckyMoneyDetailUI luckyMoneyDetailUI = LuckyMoneyDetailUI.this;
            luckyMoneyDetailUI.f199815L = (ViewGroup) luckyMoneyDetailUI.findViewById(C0966R.C0970id.gey);
            LuckyMoneyDetailUI luckyMoneyDetailUI2 = LuckyMoneyDetailUI.this;
            ViewGroup viewGroup = luckyMoneyDetailUI2.f199815L;
            C16458b bVar = luckyMoneyDetailUI2.f199841V1;
            C16457a aVar = new C16457a(viewGroup);
            C16459c cVar = new C16459c(viewGroup.getContext(), bVar, new C16463e(-100, viewGroup.getHeight() / 2), viewGroup);
            cVar.mo14940f(600.0f, 150.0f);
            cVar.mo14941g(-1000.0f, 250.0f);
            cVar.f43948t = -2.0E-4f;
            cVar.f43949u = 0.0f;
            cVar.f43950v = 0.0015f;
            cVar.f43951w = 0.0f;
            cVar.f43926E = 600.0f;
            cVar.f43927F = 300.0f;
            cVar.f43952x = 180;
            cVar.f43953y = 180;
            if (C67031g.f192531a == null) {
                C67031g.f192531a = new C16464f();
            }
            cVar.f43942n = C67031g.f192531a;
            cVar.f43954z = 3.6E-4f;
            cVar.f43922A = 1.8E-4f;
            cVar.mo14939e(360.0f);
            aVar.f43921a = cVar;
            aVar.mo14933b(100, 400);
            LuckyMoneyDetailUI luckyMoneyDetailUI3 = LuckyMoneyDetailUI.this;
            ViewGroup viewGroup2 = luckyMoneyDetailUI3.f199815L;
            C16458b bVar2 = luckyMoneyDetailUI3.f199841V1;
            C16457a aVar2 = new C16457a(viewGroup2);
            C16459c cVar2 = new C16459c(viewGroup2.getContext(), bVar2, new C16463e(viewGroup2.getWidth() + 100, viewGroup2.getHeight() / 2), viewGroup2);
            cVar2.mo14940f(-600.0f, 150.0f);
            cVar2.mo14941g(-1000.0f, 250.0f);
            cVar2.f43948t = 2.0E-4f;
            cVar2.f43949u = 0.0f;
            cVar2.f43950v = 0.0015f;
            cVar2.f43951w = 0.0f;
            cVar2.f43926E = 600.0f;
            cVar2.f43927F = 300.0f;
            cVar2.f43952x = 180;
            cVar2.f43953y = 180;
            if (C67031g.f192531a == null) {
                C67031g.f192531a = new C16464f();
            }
            cVar2.f43942n = C67031g.f192531a;
            cVar2.f43954z = 3.6E-4f;
            cVar2.f43922A = 1.8E-4f;
            cVar2.mo14939e(360.0f);
            aVar2.f43921a = cVar2;
            aVar2.mo14933b(100, 400);
        }
    }

    /* renamed from: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyDetailUI$i */
    public class C42527i implements C11385n {
        public C42527i() {
        }

        public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
            C51365ta B0;
            LinkedList<C101800k70> linkedList;
            if (Util.isEqual(yVar.getType(), 697) && (yVar instanceof C46435b)) {
                C46435b bVar = (C46435b) yVar;
                if (i == 0 && i2 == 0 && (B0 = bVar.mo71832B0()) != null && (linkedList = B0.f142064g) != null && linkedList.size() > 0 && Util.isEqual(B0.f142064g.get(0).f298586d, LuckyMoneyDetailUI.this.f199880l1.getMd5())) {
                    LuckyMoneyDetailUI.this.mo95563W7(false);
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyDetailUI$a */
    public class C69364a extends C7089c0 {
        public C69364a() {
        }

        /* renamed from: a */
        public void mo2066a(View view) {
            LuckyMoneyDetailUI luckyMoneyDetailUI = LuckyMoneyDetailUI.this;
            int i = LuckyMoneyDetailUI.f199792r2;
            luckyMoneyDetailUI.mo95556P7();
        }
    }

    /* renamed from: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyDetailUI$b */
    public class C69365b implements C69554a.C69555a {
        public C69365b() {
        }

        /* renamed from: a */
        public void mo95566a() {
            LuckyMoneyDetailUI luckyMoneyDetailUI = LuckyMoneyDetailUI.this;
            int i = LuckyMoneyDetailUI.f199792r2;
            luckyMoneyDetailUI.mo95556P7();
        }
    }

    /* renamed from: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyDetailUI$c */
    public class C69366c extends C7089c0 {
        public C69366c() {
        }

        /* renamed from: a */
        public void mo2066a(View view) {
            Log.m105924i("MicroMsg.LuckyMoneyDetailUI", "mEmoji click");
            C86709a0.m107528h();
            if (C86709a0.m107535s().mo121147n()) {
                if (Util.isNullOrNil(LuckyMoneyDetailUI.this.f199882m1)) {
                    Log.m105920e("MicroMsg.LuckyMoneyDetailUI", "mEmojiMd5 == null");
                    return;
                }
                IEmojiInfo Vs = ((C67309t0) C86312j.m106911c(C67309t0.class)).mo91189Vs(LuckyMoneyDetailUI.this.f199882m1);
                C72963f4 b002 = ((C72972g4) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96095LE()).b00(LuckyMoneyDetailUI.this.f199873i1);
                if (Vs != null && !Vs.mo62678k()) {
                    Intent intent = new Intent();
                    intent.putExtra("custom_smiley_preview_md5", LuckyMoneyDetailUI.this.f199882m1);
                    intent.putExtra("custom_to_talker_name", b002.mo108768t());
                    if (!(Vs.getGroup() == 81 || Vs.getGroup() == 18 || Vs.getGroup() == 17)) {
                        intent.putExtra("custom_smiley_preview_productid", Vs.getGroupId());
                    }
                    intent.putExtra("msg_id", b002.mo108774y2());
                    intent.putExtra("msg_content", b002.getContent());
                    String t = b002.mo108768t();
                    if (C72996z1.m85820U5(t)) {
                        t = C75604z3.m90847s(b002.getContent());
                        intent.putExtra("room_id", LuckyMoneyDetailUI.this.f199852Z0);
                    }
                    intent.putExtra("msg_sender", t);
                    C88144b.m109795m(LuckyMoneyDetailUI.this, "emoji", ".ui.CustomSmileyPreviewUI", intent, 1111);
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyDetailUI$d */
    public class C69367d implements C65953v0 {

        /* renamed from: a */
        public final /* synthetic */ String f199920a;

        /* renamed from: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyDetailUI$d$a */
        public class C69368a implements Runnable {
            public C69368a() {
            }

            public void run() {
                LuckyMoneyDetailUI.this.finish();
            }
        }

        public C69367d(String str) {
            this.f199920a = str;
        }

        /* renamed from: a */
        public void mo23a(boolean z, String str, int i) {
            LuckyMoneyDetailUI.this.hideVKB();
            LuckyMoneyDetailUI.this.f199900s1 = new RedEnvReplyWithEmoticonClickStruct();
            if (z) {
                LuckyMoneyDetailUI luckyMoneyDetailUI = LuckyMoneyDetailUI.this;
                luckyMoneyDetailUI.f199900s1.f194327d = 5;
                luckyMoneyDetailUI.f199902t1 = new RedEnvReplyWithEmoticonDataStruct();
                LuckyMoneyDetailUI luckyMoneyDetailUI2 = LuckyMoneyDetailUI.this;
                int i2 = luckyMoneyDetailUI2.f199904u1;
                int i3 = (i2 == 0 || i2 == 2) ? 2 : i2 == 1 ? 1 : 0;
                RedEnvReplyWithEmoticonDataStruct redEnvReplyWithEmoticonDataStruct = luckyMoneyDetailUI2.f199902t1;
                redEnvReplyWithEmoticonDataStruct.f156785d = (long) i3;
                redEnvReplyWithEmoticonDataStruct.f156786e = redEnvReplyWithEmoticonDataStruct.mo86045b("emoticonMd5", this.f199920a, true);
                if (Util.isNullOrNil(str)) {
                    LuckyMoneyDetailUI.this.f199902t1.f156787f = 1;
                } else {
                    LuckyMoneyDetailUI.this.f199902t1.f156787f = 2;
                }
                LuckyMoneyDetailUI.this.f199902t1.mo86054n();
                String str2 = LuckyMoneyDetailUI.this.f199852Z0;
                String str3 = this.f199920a;
                Object[] objArr = new Object[3];
                objArr[0] = str2;
                objArr[1] = Boolean.valueOf(str == null);
                objArr[2] = str3;
                Log.m105925i("MicroMsg.LuckyMoneyDetailUI", "doTransmitEmojiToFriend() toUser:%s customTex:%s emojiMd5:%s", objArr);
                if (!TextUtils.isEmpty(str3)) {
                    SendMsgEvent sendMsgEvent = new SendMsgEvent();
                    SendMsgEvent.C1132a aVar = sendMsgEvent.f9496d;
                    aVar.f9497a = str2;
                    aVar.f9498b = str3;
                    aVar.f9499c = C45628s0.m50810y(str2);
                    sendMsgEvent.f9496d.f9500d = 0;
                    sendMsgEvent.publish();
                    if (!TextUtils.isEmpty(str)) {
                        SendMsgEvent sendMsgEvent2 = new SendMsgEvent();
                        SendMsgEvent.C1132a aVar2 = sendMsgEvent2.f9496d;
                        aVar2.f9497a = str2;
                        aVar2.f9498b = str;
                        aVar2.f9499c = C45628s0.m50810y(str2);
                        sendMsgEvent2.f9496d.f9500d = 0;
                        sendMsgEvent2.publish();
                    }
                } else {
                    Log.m105920e("MicroMsg.LuckyMoneyDetailUI", "doTransmitEmojiToFriend() failed!");
                }
                LuckyMoneyDetailUI.this.mo95555O7(3, this.f199920a);
                C100124v0.m130821c((Drawable) null, LuckyMoneyDetailUI.this.getContext().getResources().getString(C0966R.string.fjh), LuckyMoneyDetailUI.this.getContext(), 0, (DialogInterface.OnDismissListener) null);
                MMHandlerThread.postToMainThreadDelayed(new C69368a(), 500);
            } else {
                LuckyMoneyDetailUI.this.f199900s1.f194327d = 6;
            }
            LuckyMoneyDetailUI.this.f199900s1.mo86054n();
        }
    }

    /* renamed from: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyDetailUI$e */
    public class C69369e implements C65953v0 {

        /* renamed from: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyDetailUI$e$a */
        public class C69370a implements Runnable {
            public C69370a() {
            }

            public void run() {
                LuckyMoneyDetailUI.this.finish();
            }
        }

        public C69369e() {
        }

        /* JADX WARNING: Removed duplicated region for block: B:16:0x0073  */
        /* JADX WARNING: Removed duplicated region for block: B:17:0x007c  */
        /* JADX WARNING: Removed duplicated region for block: B:20:0x009b  */
        /* JADX WARNING: Removed duplicated region for block: B:21:0x009d  */
        /* JADX WARNING: Removed duplicated region for block: B:24:0x00bb  */
        /* JADX WARNING: Removed duplicated region for block: B:27:0x00df  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo23a(boolean r8, java.lang.String r9, int r10) {
            /*
                r7 = this;
                java.lang.Class<bq.d1> r10 = p008bq.C67305d1.class
                com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyDetailUI r0 = com.tencent.p014mm.plugin.luckymoney.p073ui.LuckyMoneyDetailUI.this
                r0.hideVKB()
                com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyDetailUI r0 = com.tencent.p014mm.plugin.luckymoney.p073ui.LuckyMoneyDetailUI.this
                com.tencent.mm.autogen.mmdata.rpt.RedEnvReplyWithEmoticonClickStruct r1 = new com.tencent.mm.autogen.mmdata.rpt.RedEnvReplyWithEmoticonClickStruct
                r1.<init>()
                r0.f199900s1 = r1
                if (r8 == 0) goto L_0x010f
                com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyDetailUI r8 = com.tencent.p014mm.plugin.luckymoney.p073ui.LuckyMoneyDetailUI.this
                com.tencent.mm.autogen.mmdata.rpt.RedEnvReplyWithEmoticonClickStruct r0 = r8.f199900s1
                r1 = 5
                r0.f194327d = r1
                com.tencent.mm.autogen.mmdata.rpt.RedEnvReplyWithEmoticonDataStruct r0 = new com.tencent.mm.autogen.mmdata.rpt.RedEnvReplyWithEmoticonDataStruct
                r0.<init>()
                r8.f199902t1 = r0
                com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyDetailUI r8 = com.tencent.p014mm.plugin.luckymoney.p073ui.LuckyMoneyDetailUI.this
                int r8 = r8.f199904u1
                r0 = 2
                r1 = 3
                r2 = 0
                r3 = 1
                if (r8 == 0) goto L_0x0033
                if (r8 != r0) goto L_0x002e
                goto L_0x0033
            L_0x002e:
                if (r8 != r3) goto L_0x0031
                goto L_0x0043
            L_0x0031:
                r8 = 0
                goto L_0x0058
            L_0x0033:
                di3.d r8 = di3.C86312j.m106911c(r10)
                bq.d1 r8 = (p008bq.C67305d1) r8
                com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyDetailUI r4 = com.tencent.p014mm.plugin.luckymoney.p073ui.LuckyMoneyDetailUI.this
                com.tencent.mm.api.IEmojiInfo r4 = r4.f199892p1
                boolean r8 = r8.mo91430hJ(r4)
                if (r8 == 0) goto L_0x0045
            L_0x0043:
                r8 = 1
                goto L_0x0058
            L_0x0045:
                di3.d r8 = di3.C86312j.m106911c(r10)
                bq.d1 r8 = (p008bq.C67305d1) r8
                com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyDetailUI r10 = com.tencent.p014mm.plugin.luckymoney.p073ui.LuckyMoneyDetailUI.this
                com.tencent.mm.api.IEmojiInfo r10 = r10.f199892p1
                boolean r8 = r8.mo91433yi(r10)
                if (r8 == 0) goto L_0x0057
                r8 = 3
                goto L_0x0058
            L_0x0057:
                r8 = 2
            L_0x0058:
                com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyDetailUI r10 = com.tencent.p014mm.plugin.luckymoney.p073ui.LuckyMoneyDetailUI.this
                com.tencent.mm.autogen.mmdata.rpt.RedEnvReplyWithEmoticonDataStruct r4 = r10.f199902t1
                long r5 = (long) r8
                r4.f156785d = r5
                com.tencent.mm.api.IEmojiInfo r8 = r10.f199892p1
                java.lang.String r8 = r8.getMd5()
                java.lang.String r10 = "emoticonMd5"
                java.lang.String r8 = r4.mo86045b(r10, r8, r3)
                r4.f156786e = r8
                boolean r8 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r9)
                if (r8 == 0) goto L_0x007c
                com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyDetailUI r8 = com.tencent.p014mm.plugin.luckymoney.p073ui.LuckyMoneyDetailUI.this
                com.tencent.mm.autogen.mmdata.rpt.RedEnvReplyWithEmoticonDataStruct r8 = r8.f199902t1
                r4 = 1
                r8.f156787f = r4
                goto L_0x0084
            L_0x007c:
                com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyDetailUI r8 = com.tencent.p014mm.plugin.luckymoney.p073ui.LuckyMoneyDetailUI.this
                com.tencent.mm.autogen.mmdata.rpt.RedEnvReplyWithEmoticonDataStruct r8 = r8.f199902t1
                r4 = 2
                r8.f156787f = r4
            L_0x0084:
                com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyDetailUI r8 = com.tencent.p014mm.plugin.luckymoney.p073ui.LuckyMoneyDetailUI.this
                com.tencent.mm.autogen.mmdata.rpt.RedEnvReplyWithEmoticonDataStruct r8 = r8.f199902t1
                r8.mo86054n()
                com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyDetailUI r8 = com.tencent.p014mm.plugin.luckymoney.p073ui.LuckyMoneyDetailUI.this
                java.lang.String r10 = r8.f199852Z0
                com.tencent.mm.api.IEmojiInfo r4 = r8.f199892p1
                java.lang.String r4 = r4.getMd5()
                java.lang.Object[] r5 = new java.lang.Object[r1]
                r5[r2] = r10
                if (r9 != 0) goto L_0x009d
                r6 = 1
                goto L_0x009e
            L_0x009d:
                r6 = 0
            L_0x009e:
                java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
                r5[r3] = r6
                r5[r0] = r4
                java.lang.String r0 = "MicroMsg.LuckyMoneyDetailUI"
                java.lang.String r3 = "doTransmitEmojiToFriend() toUser:%s customTex:%s emojiMd5:%s"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r3, r5)
                java.lang.Class<bq.t0> r3 = p008bq.C67309t0.class
                di3.d r3 = di3.C86312j.m106911c(r3)
                bq.t0 r3 = (p008bq.C67309t0) r3
                boolean r8 = r3.mo91187JV(r8, r10, r4)
                if (r8 == 0) goto L_0x00df
                java.lang.String r8 = "doTransmitEmojiToFriend() success!"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r8)
                boolean r8 = android.text.TextUtils.isEmpty(r9)
                if (r8 != 0) goto L_0x00e4
                com.tencent.mm.autogen.events.SendMsgEvent r8 = new com.tencent.mm.autogen.events.SendMsgEvent
                r8.<init>()
                com.tencent.mm.autogen.events.SendMsgEvent$a r0 = r8.f9496d
                r0.f9497a = r10
                r0.f9498b = r9
                int r9 = eb0.C45628s0.m50810y(r10)
                r0.f9499c = r9
                com.tencent.mm.autogen.events.SendMsgEvent$a r9 = r8.f9496d
                r9.f9500d = r2
                r8.publish()
                goto L_0x00e4
            L_0x00df:
                java.lang.String r8 = "doTransmitEmojiToFriend() failed!"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r8)
            L_0x00e4:
                com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyDetailUI r8 = com.tencent.p014mm.plugin.luckymoney.p073ui.LuckyMoneyDetailUI.this
                r8.mo95554N7(r1)
                com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyDetailUI r8 = com.tencent.p014mm.plugin.luckymoney.p073ui.LuckyMoneyDetailUI.this
                androidx.appcompat.app.AppCompatActivity r8 = r8.getContext()
                android.content.res.Resources r8 = r8.getResources()
                r9 = 2131831222(0x7f1129b6, float:1.9295463E38)
                java.lang.String r8 = r8.getString(r9)
                com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyDetailUI r9 = com.tencent.p014mm.plugin.luckymoney.p073ui.LuckyMoneyDetailUI.this
                androidx.appcompat.app.AppCompatActivity r9 = r9.getContext()
                r10 = 0
                nj3.C100124v0.m130821c(r10, r8, r9, r2, r10)
                com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyDetailUI$e$a r8 = new com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyDetailUI$e$a
                r8.<init>()
                r9 = 500(0x1f4, double:2.47E-321)
                com.tencent.p014mm.sdk.platformtools.MMHandlerThread.postToMainThreadDelayed(r8, r9)
                goto L_0x0117
            L_0x010f:
                com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyDetailUI r8 = com.tencent.p014mm.plugin.luckymoney.p073ui.LuckyMoneyDetailUI.this
                com.tencent.mm.autogen.mmdata.rpt.RedEnvReplyWithEmoticonClickStruct r8 = r8.f199900s1
                r9 = 6
                r8.f194327d = r9
            L_0x0117:
                com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyDetailUI r8 = com.tencent.p014mm.plugin.luckymoney.p073ui.LuckyMoneyDetailUI.this
                com.tencent.mm.autogen.mmdata.rpt.RedEnvReplyWithEmoticonClickStruct r8 = r8.f199900s1
                r8.mo86054n()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.luckymoney.p073ui.LuckyMoneyDetailUI.C69369e.mo23a(boolean, java.lang.String, int):void");
        }
    }

    /* renamed from: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyDetailUI$f */
    public class C69371f extends C7089c0 {

        /* renamed from: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyDetailUI$f$a */
        public class C69372a implements C11182m0 {

            /* renamed from: d */
            public final /* synthetic */ View f199926d;

            public C69372a(View view) {
                this.f199926d = view;
            }

            public void onCreateMMMenu(C76874e0 e0Var) {
                String string = LuckyMoneyDetailUI.this.getString(C0966R.string.giz);
                if (!Util.isEqual(LuckyMoneyDetailUI.this.f199898r1.f198932g, 0)) {
                    e0Var.mo107125a(1, C0966R.string.ghp);
                } else {
                    string = LuckyMoneyDetailUI.this.getString(C0966R.string.gg5);
                }
                e0Var.mo107142f(2, string);
                if (!Util.isEqual(this.f199926d.getTag(), (Object) "nodelete")) {
                    e0Var.mo107140d(3, LuckyMoneyDetailUI.this.getResources().getColor(C0966R.color.a3f), LuckyMoneyDetailUI.this.getContext().getString(C0966R.string.gf8));
                }
            }
        }

        /* renamed from: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyDetailUI$f$b */
        public class C69373b implements C11184p0 {
            public C69373b() {
            }

            public void onMMMenuItemSelected(MenuItem menuItem, int i) {
                Log.m105925i("MicroMsg.LuckyMoneyDetailUI", "showLuckyHbDlg() onMMMenuItemSelected menuItemId:%s", Integer.valueOf(menuItem.getItemId()));
                int itemId = menuItem.getItemId();
                if (itemId == 1) {
                    LuckyMoneyDetailUI luckyMoneyDetailUI = LuckyMoneyDetailUI.this;
                    ((C67308r1) C86312j.m106911c(C67308r1.class)).mo58290YL(luckyMoneyDetailUI, 5, luckyMoneyDetailUI.f199852Z0);
                    LuckyMoneyDetailUI.this.f199900s1 = new RedEnvReplyWithEmoticonClickStruct();
                    RedEnvReplyWithEmoticonClickStruct redEnvReplyWithEmoticonClickStruct = LuckyMoneyDetailUI.this.f199900s1;
                    redEnvReplyWithEmoticonClickStruct.f194327d = 4;
                    redEnvReplyWithEmoticonClickStruct.mo86054n();
                    LuckyMoneyDetailUI.this.f199904u1 = 1;
                } else if (itemId == 2) {
                    LuckyMoneyDetailUI.m81732J7(LuckyMoneyDetailUI.this);
                } else if (itemId == 3) {
                    LuckyMoneyDetailUI luckyMoneyDetailUI2 = LuckyMoneyDetailUI.this;
                    luckyMoneyDetailUI2.f199880l1 = null;
                    luckyMoneyDetailUI2.f199900s1 = new RedEnvReplyWithEmoticonClickStruct();
                    RedEnvReplyWithEmoticonClickStruct redEnvReplyWithEmoticonClickStruct2 = LuckyMoneyDetailUI.this.f199900s1;
                    redEnvReplyWithEmoticonClickStruct2.f194327d = 8;
                    redEnvReplyWithEmoticonClickStruct2.mo86054n();
                    LuckyMoneyDetailUI.this.mo95554N7(1);
                }
            }
        }

        public C69371f() {
        }

        /* renamed from: a */
        public void mo2066a(View view) {
            LuckyMoneyDetailUI.this.f199900s1 = new RedEnvReplyWithEmoticonClickStruct();
            if (Util.isEqual(view.getId(), (int) C0966R.C0970id.gje)) {
                RedEnvReplyWithEmoticonClickStruct redEnvReplyWithEmoticonClickStruct = LuckyMoneyDetailUI.this.f199900s1;
                redEnvReplyWithEmoticonClickStruct.f194327d = 1;
                redEnvReplyWithEmoticonClickStruct.mo86054n();
            }
            if (!Util.isEqual(LuckyMoneyDetailUI.this.f199898r1.f198932g, 0) || !Util.isEqual(view.getTag(), (Object) "nodelete")) {
                C77407n nVar = new C77407n((Context) LuckyMoneyDetailUI.this.getContext(), 1, false);
                nVar.f225771i = new C69372a(view);
                nVar.f225782p = new C69373b();
                RedEnvReplyWithEmoticonClickStruct redEnvReplyWithEmoticonClickStruct2 = LuckyMoneyDetailUI.this.f199900s1;
                redEnvReplyWithEmoticonClickStruct2.f194327d = 2;
                redEnvReplyWithEmoticonClickStruct2.mo86054n();
                nVar.mo107573q();
                return;
            }
            LuckyMoneyDetailUI.m81732J7(LuckyMoneyDetailUI.this);
        }
    }

    /* renamed from: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyDetailUI$g */
    public class C69374g extends RecyclerView.C0130p {

        /* renamed from: d */
        public boolean f199929d = false;

        /* renamed from: e */
        public boolean f199930e;

        public C69374g() {
        }

        /* JADX WARNING: type inference failed for: r0v8, types: [ob0.y] */
        /* JADX WARNING: type inference failed for: r0v13, types: [ob0.y] */
        /* JADX WARNING: type inference failed for: r0v18 */
        /* JADX WARNING: type inference failed for: r21v3, types: [com.tencent.mm.plugin.luckymoney.model.u1] */
        /* JADX WARNING: type inference failed for: r11v8, types: [w32.d] */
        /* JADX WARNING: type inference failed for: r11v9, types: [com.tencent.mm.plugin.luckymoney.model.v1] */
        /* JADX WARNING: type inference failed for: r13v12, types: [w32.d] */
        /* JADX WARNING: type inference failed for: r13v13, types: [com.tencent.mm.plugin.luckymoney.model.v1] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onScrollStateChanged(androidx.recyclerview.widget.RecyclerView r35, int r36) {
            /*
                r34 = this;
                r6 = r34
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r7 = r35
                r0.add(r7)
                java.lang.Integer r1 = java.lang.Integer.valueOf(r36)
                r0.add(r1)
                java.lang.Object[] r5 = r0.toArray()
                r0.clear()
                java.lang.String r0 = "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyDetailUI$1"
                java.lang.String r1 = "androidx/recyclerview/widget/RecyclerView$OnScrollListener"
                java.lang.String r2 = "onScrollStateChanged"
                java.lang.String r3 = "(Landroidx/recyclerview/widget/RecyclerView;I)V"
                r4 = r34
                j20.C117292a.m165356b(r0, r1, r2, r3, r4, r5)
                androidx.recyclerview.widget.RecyclerView$e r0 = r35.getAdapter()
                int r0 = r0.getItemCount()
                java.lang.String r1 = "(Landroidx/recyclerview/widget/RecyclerView;I)V"
                java.lang.String r2 = "onScrollStateChanged"
                java.lang.String r3 = "androidx/recyclerview/widget/RecyclerView$OnScrollListener"
                java.lang.String r4 = "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyDetailUI$1"
                if (r0 != 0) goto L_0x003d
                j20.C117292a.m165361g(r6, r4, r3, r2, r1)
                return
            L_0x003d:
                r0 = 1
                if (r36 == 0) goto L_0x0044
                r6.f199929d = r0
                goto L_0x021f
            L_0x0044:
                androidx.recyclerview.widget.RecyclerView$LayoutManager r5 = r35.getLayoutManager()
                androidx.recyclerview.widget.LinearLayoutManager r5 = (androidx.recyclerview.widget.LinearLayoutManager) r5
                int r8 = r5.mo16959E()
                com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyDetailUI r9 = com.tencent.p014mm.plugin.luckymoney.p073ui.LuckyMoneyDetailUI.this
                java.util.ArrayList<com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyDetailUI$t> r9 = r9.f199864f1
                int r9 = r9.size()
                r10 = 0
                if (r8 == r9) goto L_0x0068
                int r5 = r5.mo16959E()
                androidx.recyclerview.widget.RecyclerView$e r7 = r35.getAdapter()
                int r7 = r7.getItemCount()
                int r7 = r7 - r0
                if (r5 != r7) goto L_0x021d
            L_0x0068:
                com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyDetailUI r5 = com.tencent.p014mm.plugin.luckymoney.p073ui.LuckyMoneyDetailUI.this
                com.tencent.mm.plugin.luckymoney.model.d1 r5 = r5.f199660d
                java.util.HashSet<ob0.y> r7 = r5.f199127g
                boolean r7 = r7.isEmpty()
                if (r7 == 0) goto L_0x007e
                java.util.HashSet<ob0.y> r5 = r5.f199126f
                boolean r5 = r5.isEmpty()
                if (r5 == 0) goto L_0x007e
                r5 = 0
                goto L_0x007f
            L_0x007e:
                r5 = 1
            L_0x007f:
                if (r5 != 0) goto L_0x0085
                com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyDetailUI r5 = com.tencent.p014mm.plugin.luckymoney.p073ui.LuckyMoneyDetailUI.this
                r5.f199846X0 = r10
            L_0x0085:
                com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyDetailUI r5 = com.tencent.p014mm.plugin.luckymoney.p073ui.LuckyMoneyDetailUI.this
                boolean r7 = r5.f199843W0
                if (r7 == 0) goto L_0x021d
                boolean r7 = r5.f199846X0
                if (r7 != 0) goto L_0x021d
                r5.f199846X0 = r0
                androidx.appcompat.app.AppCompatActivity r11 = r5.getContext()
                r7 = 2131832197(0x7f112d85, float:1.9297441E38)
                java.lang.String r14 = r5.getString(r7)
                com.tencent.mm.plugin.luckymoney.ui.y r7 = new com.tencent.mm.plugin.luckymoney.ui.y
                r7.<init>(r5)
                r12 = 0
                r13 = 3
                r15 = 1
                r16 = 1
                r17 = r7
                qo3.i0 r7 = nj3.C76879j.m92722P(r11, r12, r13, r14, r15, r16, r17)
                r5.f199817M = r7
                int r7 = r5.f199911x1
                if (r7 != r0) goto L_0x00e7
                java.lang.String r0 = "MicroMsg.LuckyMoneyDetailUI"
                java.lang.String r7 = "do get hk recordlist"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r7)
                android.content.Intent r0 = r5.getIntent()
                java.lang.String r7 = "key_hk_scene"
                int r17 = r0.getIntExtra(r7, r10)
                u32.a r0 = new u32.a
                java.lang.String r12 = r5.f199856b1
                java.lang.String r13 = r5.f199854a1
                int r15 = r5.f199813K
                r14 = 11
                r16 = 1
                r11 = r0
                r11.<init>(r12, r13, r14, r15, r16, r17)
                r5.f199874i2 = r0
                nr3.e r0 = r0.mo9225i()
                com.tencent.mm.plugin.luckymoney.ui.z r7 = new com.tencent.mm.plugin.luckymoney.ui.z
                r7.<init>(r5)
                nr3.e r0 = r0.mo123062e(r7)
                r0.mo11397F(r5)
                goto L_0x021d
            L_0x00e7:
                int r7 = r5.f199813K
                r8 = 3
                if (r7 <= 0) goto L_0x01b6
                java.util.List<com.tencent.mm.plugin.luckymoney.model.j1> r7 = r5.f199862e1
                java.util.LinkedList r7 = (java.util.LinkedList) r7
                int r7 = r7.size()
                if (r7 <= 0) goto L_0x01b6
                java.util.List<com.tencent.mm.plugin.luckymoney.model.j1> r7 = r5.f199862e1
                java.util.LinkedList r7 = (java.util.LinkedList) r7
                int r9 = r7.size()
                int r9 = r9 - r0
                java.lang.Object r7 = r7.get(r9)
                if (r7 == 0) goto L_0x01b6
                int r7 = r5.f199914y1
                boolean r7 = com.tencent.p014mm.plugin.luckymoney.model.C69242l1.m81608n(r7)
                r11 = 0
                if (r7 == 0) goto L_0x0140
                com.tencent.mm.plugin.luckymoney.model.v1 r0 = new com.tencent.mm.plugin.luckymoney.model.v1
                java.lang.String r14 = r5.f199854a1
                r15 = 11
                int r7 = r5.f199813K
                java.lang.String r8 = r5.f199856b1
                java.util.List<com.tencent.mm.plugin.luckymoney.model.j1> r9 = r5.f199862e1
                java.util.LinkedList r9 = (java.util.LinkedList) r9
                int r13 = r9.size()
                int r13 = r13 + -1
                java.lang.Object r9 = r9.get(r13)
                com.tencent.mm.plugin.luckymoney.model.j1 r9 = (com.tencent.p014mm.plugin.luckymoney.model.C69236j1) r9
                java.lang.String r9 = r9.f199215g
                long r18 = com.tencent.p014mm.sdk.platformtools.Util.getLong(r9, r11)
                java.lang.String r9 = r5.f199870h1
                java.lang.String r20 = "v1.0"
                r13 = r0
                r16 = r7
                r17 = r8
                r21 = r9
                r13.<init>(r14, r15, r16, r17, r18, r20, r21)
                goto L_0x01b2
            L_0x0140:
                int r7 = r5.f199877j2
                if (r7 != r8) goto L_0x0180
                w32.d r0 = new w32.d
                java.lang.String r14 = r5.f199854a1
                r15 = 11
                int r7 = r5.f199813K
                java.lang.String r8 = r5.f199856b1
                java.util.List<com.tencent.mm.plugin.luckymoney.model.j1> r9 = r5.f199862e1
                java.util.LinkedList r9 = (java.util.LinkedList) r9
                int r13 = r9.size()
                int r13 = r13 + -1
                java.lang.Object r9 = r9.get(r13)
                com.tencent.mm.plugin.luckymoney.model.j1 r9 = (com.tencent.p014mm.plugin.luckymoney.model.C69236j1) r9
                java.lang.String r9 = r9.f199215g
                long r18 = com.tencent.p014mm.sdk.platformtools.Util.getLong(r9, r11)
                java.lang.String r9 = r5.f199870h1
                java.lang.String r11 = r5.f199879k2
                java.lang.String r12 = r5.f199881l2
                int r13 = r5.f199798C1
                java.lang.String r20 = "v1.0"
                r24 = r13
                r13 = r0
                r16 = r7
                r17 = r8
                r21 = r9
                r22 = r11
                r23 = r12
                r13.<init>(r14, r15, r16, r17, r18, r20, r21, r22, r23, r24)
                goto L_0x01b2
            L_0x0180:
                com.tencent.mm.plugin.luckymoney.model.u1 r7 = new com.tencent.mm.plugin.luckymoney.model.u1
                java.lang.String r8 = r5.f199854a1
                r27 = 11
                int r9 = r5.f199813K
                java.lang.String r13 = r5.f199856b1
                java.util.List<com.tencent.mm.plugin.luckymoney.model.j1> r14 = r5.f199862e1
                java.util.LinkedList r14 = (java.util.LinkedList) r14
                int r15 = r14.size()
                int r15 = r15 - r0
                java.lang.Object r0 = r14.get(r15)
                com.tencent.mm.plugin.luckymoney.model.j1 r0 = (com.tencent.p014mm.plugin.luckymoney.model.C69236j1) r0
                java.lang.String r0 = r0.f199215g
                long r30 = com.tencent.p014mm.sdk.platformtools.Util.getLong(r0, r11)
                java.lang.String r0 = r5.f199870h1
                java.lang.String r32 = "v1.0"
                r25 = r7
                r26 = r8
                r28 = r9
                r29 = r13
                r33 = r0
                r25.<init>(r26, r27, r28, r29, r30, r32, r33)
                r0 = r7
            L_0x01b2:
                r5.doSceneProgress(r0, r10)
                goto L_0x021d
            L_0x01b6:
                java.lang.String r0 = ""
                r5.f199870h1 = r0
                int r0 = r5.f199914y1
                boolean r0 = com.tencent.p014mm.plugin.luckymoney.model.C69242l1.m81608n(r0)
                if (r0 == 0) goto L_0x01d8
                com.tencent.mm.plugin.luckymoney.model.v1 r0 = new com.tencent.mm.plugin.luckymoney.model.v1
                java.lang.String r12 = r5.f199854a1
                r13 = 11
                int r14 = r5.f199813K
                java.lang.String r15 = r5.f199856b1
                java.lang.String r7 = r5.f199870h1
                java.lang.String r16 = "v1.0"
                r11 = r0
                r17 = r7
                r11.<init>(r12, r13, r14, r15, r16, r17)
                goto L_0x021a
            L_0x01d8:
                int r0 = r5.f199877j2
                if (r0 != r8) goto L_0x01fe
                w32.d r0 = new w32.d
                java.lang.String r12 = r5.f199854a1
                r13 = 11
                int r14 = r5.f199813K
                java.lang.String r15 = r5.f199856b1
                java.lang.String r7 = r5.f199870h1
                java.lang.String r8 = r5.f199879k2
                java.lang.String r9 = r5.f199881l2
                int r11 = r5.f199798C1
                java.lang.String r16 = "v1.0"
                r20 = r11
                r11 = r0
                r17 = r7
                r18 = r8
                r19 = r9
                r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r20)
                goto L_0x021a
            L_0x01fe:
                com.tencent.mm.plugin.luckymoney.model.u1 r0 = new com.tencent.mm.plugin.luckymoney.model.u1
                java.lang.String r7 = r5.f199854a1
                r23 = 11
                int r8 = r5.f199813K
                java.lang.String r9 = r5.f199856b1
                java.lang.String r11 = r5.f199870h1
                java.lang.String r26 = "v1.0"
                r21 = r0
                r22 = r7
                r24 = r8
                r25 = r9
                r27 = r11
                r21.<init>(r22, r23, r24, r25, r26, r27)
            L_0x021a:
                r5.doSceneProgress(r0, r10)
            L_0x021d:
                r6.f199929d = r10
            L_0x021f:
                j20.C117292a.m165361g(r6, r4, r3, r2, r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.luckymoney.p073ui.LuckyMoneyDetailUI.C69374g.onScrollStateChanged(androidx.recyclerview.widget.RecyclerView, int):void");
        }

        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(recyclerView);
            arrayList.add(Integer.valueOf(i));
            arrayList.add(Integer.valueOf(i2));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyDetailUI$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
            if (recyclerView.getAdapter().getItemCount() == 0 || !this.f199929d) {
                C117292a.m165361g(this, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyDetailUI$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
                return;
            }
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView.getLayoutManager();
            boolean z = true;
            if (linearLayoutManager.mo16957C() <= 0) {
                View findViewByPosition = linearLayoutManager.findViewByPosition(linearLayoutManager.mo16957C());
                if ((findViewByPosition != null ? 0 - findViewByPosition.getTop() : 0) <= 100) {
                    z = false;
                }
            }
            if (this.f199930e != z) {
                if (z) {
                    LuckyMoneyDetailUI luckyMoneyDetailUI = LuckyMoneyDetailUI.this;
                    luckyMoneyDetailUI.getResources().getDrawable(C0966R.C0969drawable.c5k);
                    luckyMoneyDetailUI.getClass();
                } else {
                    LuckyMoneyDetailUI.this.getClass();
                }
                this.f199930e = z;
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyDetailUI$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyDetailUI$h */
    public class C69375h implements DialogInterface.OnClickListener {
        public C69375h() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            Log.m105924i("MicroMsg.LuckyMoneyDetailUI", "RealnameGuideHelper dialog click cancel");
            LuckyMoneyDetailUI.super.finish();
        }
    }

    /* renamed from: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyDetailUI$j */
    public class C69376j implements SoundPool.OnLoadCompleteListener {

        /* renamed from: a */
        public final /* synthetic */ C69158a0 f199933a;

        public C69376j(C69158a0 a0Var) {
            this.f199933a = a0Var;
        }

        public void onLoadComplete(SoundPool soundPool, int i, int i2) {
            if (i2 == 0) {
                int[] iArr = LuckyMoneyDetailUI.this.f199811J;
                if (i == iArr[0]) {
                    soundPool.play(i, 1.0f, 1.0f, 0, 0, 1.0f);
                } else if (i == iArr[1] && this.f199933a.f198974q >= 19000) {
                    soundPool.play(i, 1.0f, 1.0f, 0, 0, 1.0f);
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyDetailUI$l */
    public class C69377l implements C16458b {
        public C69377l() {
        }

        /* renamed from: a */
        public C16794b mo14934a(Random random) {
            switch (random.nextInt(8)) {
                case 0:
                    LuckyMoneyDetailUI luckyMoneyDetailUI = LuckyMoneyDetailUI.this;
                    if (luckyMoneyDetailUI.f199832S1 == null) {
                        luckyMoneyDetailUI.f199832S1 = LuckyMoneyDetailUI.m81734L7(luckyMoneyDetailUI, C0966R.C0969drawable.c6l);
                    }
                    return new C16793a(LuckyMoneyDetailUI.this.f199832S1);
                case 1:
                    LuckyMoneyDetailUI luckyMoneyDetailUI2 = LuckyMoneyDetailUI.this;
                    if (luckyMoneyDetailUI2.f199835T1 == null) {
                        luckyMoneyDetailUI2.f199835T1 = LuckyMoneyDetailUI.m81734L7(luckyMoneyDetailUI2, C0966R.C0969drawable.c6m);
                    }
                    return new C16793a(LuckyMoneyDetailUI.this.f199835T1);
                case 2:
                    LuckyMoneyDetailUI luckyMoneyDetailUI3 = LuckyMoneyDetailUI.this;
                    if (luckyMoneyDetailUI3.f199838U1 == null) {
                        luckyMoneyDetailUI3.f199838U1 = LuckyMoneyDetailUI.m81734L7(luckyMoneyDetailUI3, C0966R.C0969drawable.c6n);
                    }
                    return new C16793a(LuckyMoneyDetailUI.this.f199838U1);
                case 3:
                    LuckyMoneyDetailUI luckyMoneyDetailUI4 = LuckyMoneyDetailUI.this;
                    if (luckyMoneyDetailUI4.f199820N1 == null) {
                        luckyMoneyDetailUI4.f199820N1 = LuckyMoneyDetailUI.m81734L7(luckyMoneyDetailUI4, C0966R.C0969drawable.c6g);
                    }
                    return new C16793a(LuckyMoneyDetailUI.this.f199820N1);
                case 4:
                    LuckyMoneyDetailUI luckyMoneyDetailUI5 = LuckyMoneyDetailUI.this;
                    if (luckyMoneyDetailUI5.f199821O1 == null) {
                        luckyMoneyDetailUI5.f199821O1 = LuckyMoneyDetailUI.m81734L7(luckyMoneyDetailUI5, C0966R.C0969drawable.c6h);
                    }
                    return new C16793a(LuckyMoneyDetailUI.this.f199821O1);
                case 5:
                    LuckyMoneyDetailUI luckyMoneyDetailUI6 = LuckyMoneyDetailUI.this;
                    if (luckyMoneyDetailUI6.f199823P1 == null) {
                        luckyMoneyDetailUI6.f199823P1 = LuckyMoneyDetailUI.m81734L7(luckyMoneyDetailUI6, C0966R.C0969drawable.c6i);
                    }
                    return new C16793a(LuckyMoneyDetailUI.this.f199823P1);
                case 6:
                    LuckyMoneyDetailUI luckyMoneyDetailUI7 = LuckyMoneyDetailUI.this;
                    if (luckyMoneyDetailUI7.f199826Q1 == null) {
                        luckyMoneyDetailUI7.f199826Q1 = LuckyMoneyDetailUI.m81734L7(luckyMoneyDetailUI7, C0966R.C0969drawable.c6j);
                    }
                    return new C16793a(LuckyMoneyDetailUI.this.f199826Q1);
                case 7:
                    LuckyMoneyDetailUI luckyMoneyDetailUI8 = LuckyMoneyDetailUI.this;
                    if (luckyMoneyDetailUI8.f199829R1 == null) {
                        luckyMoneyDetailUI8.f199829R1 = LuckyMoneyDetailUI.m81734L7(luckyMoneyDetailUI8, C0966R.C0969drawable.c6k);
                    }
                    return new C16793a(LuckyMoneyDetailUI.this.f199829R1);
                default:
                    return null;
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyDetailUI$m */
    public class C69378m implements C39833l0.C39834a {

        /* renamed from: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyDetailUI$m$a */
        public class C69379a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ IEmojiInfo f199937d;

            /* renamed from: e */
            public final /* synthetic */ boolean f199938e;

            public C69379a(IEmojiInfo iEmojiInfo, boolean z) {
                this.f199937d = iEmojiInfo;
                this.f199938e = z;
            }

            public void run() {
                IEmojiInfo iEmojiInfo;
                if (this.f199937d != null && (iEmojiInfo = LuckyMoneyDetailUI.this.f199880l1) != null && iEmojiInfo.getMd5().equals(this.f199937d.getMd5())) {
                    if (this.f199938e) {
                        Log.m105924i("MicroMsg.LuckyMoneyDetailUI", "somethings success.");
                        LuckyMoneyDetailUI.this.f199880l1 = ((C67303a1) C86312j.m106911c(C67303a1.class)).mo55768r2(LuckyMoneyDetailUI.this.f199880l1.getMd5());
                        LuckyMoneyDetailUI.this.f199827R.setVisibility(8);
                        LuckyMoneyDetailUI.this.f199822P.setVisibility(0);
                        LuckyMoneyDetailUI luckyMoneyDetailUI = LuckyMoneyDetailUI.this;
                        IEmojiInfo iEmojiInfo2 = luckyMoneyDetailUI.f199880l1;
                        luckyMoneyDetailUI.f199896q2 = 3;
                        luckyMoneyDetailUI.f199822P.setEmojiInfo(iEmojiInfo2);
                        RedEnvSendWithEmoticonClickStruct redEnvSendWithEmoticonClickStruct = new RedEnvSendWithEmoticonClickStruct();
                        redEnvSendWithEmoticonClickStruct.f194328d = 11;
                        redEnvSendWithEmoticonClickStruct.mo86054n();
                        return;
                    }
                    Log.m105924i("MicroMsg.LuckyMoneyDetailUI", "somethings error.");
                    LuckyMoneyDetailUI.this.f199827R.setVisibility(8);
                    LuckyMoneyDetailUI.this.f199824Q.setVisibility(0);
                }
            }
        }

        public C69378m() {
        }

        /* renamed from: a */
        public void mo62471a(boolean z, IEmojiInfo iEmojiInfo) {
            MMHandlerThread.postToMainThread(new C69379a(iEmojiInfo, z));
        }
    }

    /* renamed from: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyDetailUI$n */
    public class C69380n implements C72506r.C72510d {
        public C69380n() {
        }

        /* renamed from: a */
        public void mo95297a(C77935gl2 gl22) {
            if (gl22.f227479e == 1) {
                LuckyMoneyDetailUI.this.finish();
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyDetailUI$o */
    public class C69381o implements Runnable {
        public C69381o() {
        }

        public void run() {
            int f = C75044y4.m89994f(LuckyMoneyDetailUI.this.getContext());
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) LuckyMoneyDetailUI.this.f199804F1.getLayoutParams();
            marginLayoutParams.topMargin = f;
            LuckyMoneyDetailUI.this.f199804F1.setLayoutParams(marginLayoutParams);
        }
    }

    /* renamed from: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyDetailUI$p */
    public class C69382p implements View.OnClickListener {

        /* renamed from: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyDetailUI$p$a */
        public class C69383a implements C72506r.C72510d {
            public C69383a() {
            }

            /* renamed from: a */
            public void mo95297a(C77935gl2 gl22) {
                if (gl22.f227479e == 1) {
                    LuckyMoneyDetailUI.this.finish();
                }
            }
        }

        public C69382p() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyDetailUI$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            LuckyMoneyDetailUI luckyMoneyDetailUI = LuckyMoneyDetailUI.this;
            C72501h hVar = luckyMoneyDetailUI.f199916z1;
            if (hVar == null) {
                luckyMoneyDetailUI.finish();
                C117292a.m165361g(this, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyDetailUI$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            } else if (!C72506r.m84838d(hVar)) {
                LuckyMoneyDetailUI.this.finish();
                C117292a.m165361g(this, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyDetailUI$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            } else {
                LuckyMoneyDetailUI luckyMoneyDetailUI2 = LuckyMoneyDetailUI.this;
                luckyMoneyDetailUI2.f199794A1.mo99912b(luckyMoneyDetailUI2.f199916z1, new C69383a());
                LuckyMoneyDetailUI.this.f199916z1 = null;
                C117292a.m165361g(this, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyDetailUI$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyDetailUI$q */
    public class C69384q extends WxRecyclerAdapter {
        public C69384q(LuckyMoneyDetailUI luckyMoneyDetailUI, C9500j jVar, ArrayList arrayList, boolean z) {
            super(jVar, arrayList, z);
        }

        /* renamed from: v6 */
        public boolean mo6267v6() {
            return false;
        }
    }

    /* renamed from: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyDetailUI$r */
    public class C69385r extends C7089c0 {
        public C69385r() {
        }

        /* renamed from: a */
        public void mo2066a(View view) {
            LuckyMoneyDetailUI luckyMoneyDetailUI = LuckyMoneyDetailUI.this;
            int i = LuckyMoneyDetailUI.f199792r2;
            luckyMoneyDetailUI.mo95563W7(true);
        }
    }

    /* renamed from: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyDetailUI$s */
    public static class C69386s extends MMBaseAccessibilityConfig {

        /* renamed from: d */
        public MMBaseAccessibilityConfig.ConfigHelper f199945d;

        /* renamed from: e */
        public boolean f199946e;

        /* renamed from: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyDetailUI$s$a */
        public class C69387a implements C32226l<View, String> {
            public C69387a() {
            }

            public Object invoke(Object obj) {
                View view = (View) obj;
                return C69386s.this.getString(C0966R.string.c5v);
            }
        }

        /* renamed from: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyDetailUI$s$b */
        public class C69388b implements C32226l<View, String> {
            public C69388b() {
            }

            public Object invoke(Object obj) {
                View view = (View) obj;
                return C69386s.this.getString(C0966R.string.gj_);
            }
        }

        /* renamed from: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyDetailUI$s$c */
        public class C69389c implements C32226l<View, String> {
            public C69389c() {
            }

            public Object invoke(Object obj) {
                View view = (View) obj;
                return ((TextView) C69386s.this.findViewById(C0966R.C0970id.gdq)).getText() + C69386s.this.getString(C0966R.string.gf_);
            }
        }

        /* renamed from: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyDetailUI$s$d */
        public class C69390d implements C32226l<View, String> {
            public C69390d() {
            }

            public Object invoke(Object obj) {
                View view = (View) obj;
                if (((Boolean) view.getTag(C0966R.C0970id.gcx)).booleanValue()) {
                    view.setImportantForAccessibility(1);
                    String string = C69386s.this.getString(C0966R.string.jd8);
                    if (view.getAlpha() != 1.0f) {
                        return string;
                    }
                    return string + C69386s.this.getString(C0966R.string.gfa);
                }
                view.setImportantForAccessibility(2);
                return "";
            }
        }

        /* renamed from: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyDetailUI$s$e */
        public class C69391e implements C32226l<View, String> {
            public C69391e() {
            }

            public Object invoke(Object obj) {
                View view = (View) obj;
                C69386s sVar = C69386s.this;
                return !sVar.f199946e ? sVar.getString(C0966R.string.gfc) : ((Boolean) view.getTag(C0966R.C0970id.l6i)).booleanValue() ? C69386s.this.getString(C0966R.string.gfd) : C69386s.this.getString(C0966R.string.gfe);
            }
        }

        public C69386s(AppCompatActivity appCompatActivity) {
            super(appCompatActivity);
        }

        /* renamed from: c3 */
        public void mo95574c3(boolean z) {
            this.f199946e = z;
            View findViewById = findViewById(C0966R.C0970id.k6o);
            View findViewById2 = findViewById(C0966R.C0970id.k8j);
            if (findViewById != null && findViewById2 != null) {
                if (z) {
                    findViewById.setImportantForAccessibility(2);
                    findViewById2.setImportantForAccessibility(0);
                    return;
                }
                findViewById.setImportantForAccessibility(1);
                findViewById2.setImportantForAccessibility(4);
            }
        }

        public void initConfig() {
            MMBaseAccessibilityConfig.ConfigHelper root = root(C0966R.C0970id.gdi);
            this.f199945d = root;
            ViewSetter desc = root.view(C0966R.C0970id.gd6).desc((int) C0966R.C0970id.gdz);
            ViewType viewType = ViewType.Button;
            desc.type(viewType);
            this.f199945d.view(C0966R.C0970id.gje).desc((int) C0966R.C0970id.gjf).type(viewType);
            this.f199945d.view(C0966R.C0970id.gji).desc((C32226l<? super View, String>) new C69387a()).type(viewType);
            this.f199945d.view(C0966R.C0970id.gjg).desc((C32226l<? super View, String>) new C69388b()).type(viewType);
            this.f199945d.view(C0966R.C0970id.gdn).desc((C32226l<? super View, String>) new C69389c()).type(viewType);
            this.f199945d.view(C0966R.C0970id.k6o).desc((C32226l<? super View, String>) new C69390d());
            MMBaseAccessibilityConfig.ConfigHelper root2 = root(C0966R.C0970id.gdu);
            root2.view(C0966R.C0970id.gdx).desc((C32226l<? super View, String>) new C69391e());
            root2.view(C0966R.C0970id.gjr).disable();
        }
    }

    /* renamed from: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyDetailUI$t */
    public class C69392t implements C9493c {

        /* renamed from: d */
        public C69236j1 f199952d;

        public C69392t(LuckyMoneyDetailUI luckyMoneyDetailUI) {
        }

        /* renamed from: c */
        public int mo75c() {
            return 2;
        }

        public long getItemId() {
            return (long) this.f199952d.f199217i.hashCode();
        }
    }

    /* renamed from: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyDetailUI$u */
    public class C69393u extends C60896i<C69392t> {
        public C69393u() {
        }

        /* renamed from: c */
        public int mo43c() {
            return C0966R.C0971layout.b_c;
        }

        /* renamed from: e */
        public void mo44e(C60905o oVar, C9493c cVar, int i, int i2, boolean z, List list) {
            Class cls = C76979h.class;
            C69236j1 j1Var = ((C69392t) cVar).f199952d;
            if (LuckyMoneyDetailUI.this.f199850Y1 == 7) {
                oVar.mo85817I(C0966R.C0970id.giv, 8);
            } else {
                C69242l1.m81595a((ImageView) oVar.mo85812D(C0966R.C0970id.giv), j1Var.f199213e, j1Var.f199219n);
            }
            if (Util.isNullOrNil(j1Var.f199216h)) {
                oVar.mo85817I(C0966R.C0970id.giu, 8);
            } else {
                C69242l1.m81616v(LuckyMoneyDetailUI.this.getContext(), (TextView) oVar.mo85812D(C0966R.C0970id.giu), j1Var.f199216h);
                oVar.mo85817I(C0966R.C0970id.giu, 0);
            }
            oVar.mo85815G(C0966R.C0970id.f358696gj0, C69242l1.m81597c(LuckyMoneyDetailUI.this.getContext(), Util.getLong(j1Var.f199215g, 0) * 1000));
            oVar.mo85817I(C0966R.C0970id.f358696gj0, 0);
            oVar.mo85817I(C0966R.C0970id.f358697gj1, 8);
            if (!Util.isNullOrNil(j1Var.f199221p)) {
                TextView textView = (TextView) oVar.mo85812D(C0966R.C0970id.giz);
                AppCompatActivity context = LuckyMoneyDetailUI.this.getContext();
                SpannableString yp02 = ((C76979h) C86312j.m106911c(cls)).yp0(context, j1Var.f199212d + j1Var.f199221p, textView.getTextSize());
                SpannableString yp03 = ((C76979h) C86312j.m106911c(cls)).yp0(LuckyMoneyDetailUI.this.getContext(), j1Var.f199212d, textView.getTextSize());
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(yp02);
                spannableStringBuilder.setSpan(new C72476y0("#FA9D3B", (C72476y0.C72477a) new C69676r0(this)), yp03.length(), yp02.length(), 18);
                textView.setText(spannableStringBuilder);
            } else if (j1Var.f199222q) {
                oVar.mo85815G(C0966R.C0970id.giz, "");
                TextView textView2 = (TextView) oVar.mo85812D(C0966R.C0970id.giz);
                Log.m105925i("MicroMsg.LuckyMoneyDetailUI", "try get user contact: %s", j1Var.f199219n);
                textView2.setTag(j1Var.f199219n);
                ((HashSet) LuckyMoneyDetailUI.this.f199800D1).add(j1Var.f199219n);
                C31519v2.m39436a().mo55988e(j1Var.f199219n, "", new C69680s0(this, j1Var, textView2));
            } else {
                C69242l1.m81616v(LuckyMoneyDetailUI.this.getContext(), (TextView) oVar.mo85812D(C0966R.C0970id.giz), j1Var.f199212d);
            }
            oVar.mo85815G(C0966R.C0970id.git, LuckyMoneyDetailUI.this.getContext().getString(C0966R.string.gin, new Object[]{C75228t.m90260n(((double) j1Var.f199214f) / 100.0d)}));
            if (!Util.isNullOrNil(j1Var.f199220o)) {
                oVar.mo85815G(C0966R.C0970id.giy, j1Var.f199220o);
                oVar.mo85817I(C0966R.C0970id.giy, 0);
            } else {
                oVar.mo85817I(C0966R.C0970id.giy, 8);
            }
            if (Util.isNullOrNil(j1Var.f199218j)) {
                oVar.mo85817I(C0966R.C0970id.giw, 8);
                oVar.mo85817I(C0966R.C0970id.gix, 8);
                return;
            }
            oVar.mo85815G(C0966R.C0970id.gix, j1Var.f199218j);
            if (LuckyMoneyDetailUI.this.f199850Y1 == 2) {
                ((ImageView) oVar.mo85812D(C0966R.C0970id.giw)).setImageResource(C0966R.C0969drawable.c6v);
            } else {
                ((ImageView) oVar.mo85812D(C0966R.C0970id.giw)).setImageResource(C0966R.C0969drawable.c5s);
            }
            oVar.mo85817I(C0966R.C0970id.giw, 0);
            oVar.mo85817I(C0966R.C0970id.gix, 0);
        }

        /* renamed from: f */
        public void mo45f(RecyclerView recyclerView, C60905o oVar, int i) {
        }
    }

    /* renamed from: J7 */
    public static void m81732J7(LuckyMoneyDetailUI luckyMoneyDetailUI) {
        int i;
        luckyMoneyDetailUI.f199904u1 = 2;
        RedEnvReplyWithEmoticonClickStruct redEnvReplyWithEmoticonClickStruct = new RedEnvReplyWithEmoticonClickStruct();
        luckyMoneyDetailUI.f199900s1 = redEnvReplyWithEmoticonClickStruct;
        redEnvReplyWithEmoticonClickStruct.f194327d = 3;
        redEnvReplyWithEmoticonClickStruct.mo86054n();
        luckyMoneyDetailUI.f199910x0.show();
        if (!Util.isEqual(luckyMoneyDetailUI.f199898r1.f198932g, 0)) {
            int i2 = ChatFooterPanel.f211589f;
            i = 11;
        } else {
            int i3 = ChatFooterPanel.f211589f;
            i = 8;
        }
        C67339b.m79677b(luckyMoneyDetailUI.f199895q1, luckyMoneyDetailUI.f199888o1, i, new C69694u(luckyMoneyDetailUI));
        luckyMoneyDetailUI.f199888o1.setOnTextOperationListener(new C69703v(luckyMoneyDetailUI));
    }

    /* renamed from: L7 */
    public static Bitmap m81734L7(LuckyMoneyDetailUI luckyMoneyDetailUI, int i) {
        return Bitmap.createScaledBitmap(BitmapFactory.decodeResource(luckyMoneyDetailUI.getResources(), i), 28, 28, false);
    }

    /* renamed from: M7 */
    public static void m81735M7(LuckyMoneyDetailUI luckyMoneyDetailUI, C78023zk3 zk32, Dialog dialog, String str) {
        luckyMoneyDetailUI.getClass();
        Log.m105924i("MicroMsg.LuckyMoneyDetailUI", "goWalletLqtSaveFetchUI()");
        if (dialog != null) {
            dialog.dismiss();
        }
        ArrayList arrayList = new ArrayList();
        LinkedList<C64514l50> linkedList = zk32.f228734q;
        boolean z = true;
        if (linkedList != null && linkedList.size() > 0) {
            Iterator<C64514l50> it = zk32.f228734q.iterator();
            while (it.hasNext()) {
                C64514l50 next = it.next();
                if (!Util.isNullOrNil(next.f184038d) && !Util.isNullOrNil(next.f184040f)) {
                    arrayList.add(String.format("%s||%s", new Object[]{next.f184038d, next.f184040f}));
                }
            }
        }
        Intent intent = new Intent(luckyMoneyDetailUI, WalletLqtSaveFetchUI.class);
        intent.putExtra("lqt_save_fund_code", zk32.f228735r);
        intent.putExtra("lqt_account_type", zk32.f228693C);
        intent.putExtra("lqt_fund_spid", zk32.f228694D);
        intent.putExtra("lqt_save_fetch_mode", 1);
        intent.putExtra("lqt_is_show_protocol", zk32.f228731o == 1);
        if (zk32.f228732p != 1) {
            z = false;
        }
        intent.putExtra("lqt_is_agree_protocol", z);
        intent.putExtra("operate_id", str);
        intent.putStringArrayListExtra("lqt_protocol_list", arrayList);
        intent.putExtra("lqt_profile_wording", zk32.f228745z);
        intent.putExtra("entrance_type", 6);
        if (!((C76324c) C86312j.m106911c(C76324c.class)).startLqtSaveUseCase(luckyMoneyDetailUI.getContext(), intent, new C69615j0(luckyMoneyDetailUI))) {
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            C117292a.m165358d(luckyMoneyDetailUI, aVar.mo10232b(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyDetailUI", "goWalletLqtSaveFetchUI", "(Lcom/tencent/mm/protocal/protobuf/QryUsrFundDetailRes;Landroid/app/Dialog;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            luckyMoneyDetailUI.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(luckyMoneyDetailUI, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyDetailUI", "goWalletLqtSaveFetchUI", "(Lcom/tencent/mm/protocal/protobuf/QryUsrFundDetailRes;Landroid/app/Dialog;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
    }

    /* renamed from: N7 */
    public final void mo95554N7(int i) {
        mo95555O7(i, "");
    }

    /* renamed from: O7 */
    public final void mo95555O7(int i, String str) {
        Class cls = C67305d1.class;
        C72994y1.C72995a aVar = C72994y1.C72995a.USERINFO_WALLET_HONGBAO_LAST_THX_SEND_EMOJI_NORMAL_STRING;
        C72994y1.C72995a aVar2 = C72994y1.C72995a.USERINFO_WALLET_HONGBAO_LAST_THX_SEND_EMOJI_MD5_STRING;
        if (i == 0) {
            this.f199830S.setVisibility(8);
        } else if (i == 1) {
            this.f199830S.setVisibility(0);
            this.f199833T.setVisibility(0);
            this.f199836U.setVisibility(8);
            C86709a0.m107535s().mo121142i().mo119677K(aVar2, "");
            C86709a0.m107535s().mo121142i().mo119677K(aVar, "");
        } else if (i == 2) {
            Log.m105925i("MicroMsg.LuckyMoneyDetailUI", "exchangeThxEmojiState emojiType :%s", Integer.valueOf(this.f199796B1));
            if (this.f199796B1 == 1) {
                String n8 = ((C67305d1) C86312j.m106911c(cls)).mo91431n8(str);
                if (n8 == null) {
                    Log.m105924i("MicroMsg.LuckyMoneyDetailUI", "exchangeThxEmojiState() emojiKey == null");
                    return;
                }
                this.f199848Y.setImageDrawable(((C67305d1) C86312j.m106911c(cls)).Zw0(n8));
                C86709a0.m107535s().mo121142i().mo119677K(aVar, str);
                C86709a0.m107535s().mo121142i().mo119677K(aVar2, "");
                this.f199830S.setVisibility(0);
                this.f199833T.setVisibility(8);
                this.f199836U.setVisibility(0);
            } else if (!Util.isNullOrNil(str)) {
                IEmojiInfo r2 = ((C67303a1) C86312j.m106911c(C67303a1.class)).mo55768r2(str);
                if (r2 == null) {
                    Log.m105924i("MicroMsg.LuckyMoneyDetailUI", "exchangeThxEmojiState() temp == null");
                    return;
                }
                this.f199892p1 = r2;
                C86709a0.m107535s().mo121142i().mo119677K(aVar2, this.f199892p1.getMd5());
                C86709a0.m107535s().mo121142i().mo119677K(aVar, "");
                this.f199848Y.setEmojiInfo(this.f199892p1);
                this.f199830S.setVisibility(0);
                this.f199833T.setVisibility(8);
                this.f199836U.setVisibility(0);
            }
        }
        if (C45628s0.m50742G(this.f199852Z0)) {
            this.f199830S.setVisibility(8);
        }
    }

    /* renamed from: P7 */
    public final void mo95556P7() {
        C67339b.m79676a(this, this.f199888o1);
        this.f199910x0.dismiss();
    }

    /* renamed from: Q7 */
    public final boolean mo95557Q7() {
        if (!Util.isNullOrNil(this.f199882m1)) {
            return Util.isEqual(this.f199898r1.f198929d, 1) || Util.isEqual(this.f199898r1.f198930e, 1);
        }
        return false;
    }

    /* renamed from: R7 */
    public final boolean mo95558R7(C69158a0 a0Var) {
        return a0Var.f198939A == 2 && this.f199849Y0 != 3;
    }

    /* renamed from: S7 */
    public final int mo95559S7() {
        return (Util.isNullOrNil((String) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_WALLET_HONGBAO_LAST_THX_SEND_EMOJI_MD5_STRING, "")) && !Util.isNullOrNil((String) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_WALLET_HONGBAO_LAST_THX_SEND_EMOJI_NORMAL_STRING, ""))) ? 1 : 2;
    }

    /* renamed from: T7 */
    public final void mo95560T7(C69158a0 a0Var) {
        C69253n2 a;
        View view;
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        View view2;
        View view3;
        C69558a3.C69561c cVar;
        C69558a3.C69561c cVar2;
        View view4;
        C69158a0 a0Var2 = a0Var;
        if (a0Var2 != null) {
            LinkedList<C69248m2> linkedList = a0Var2.f198944F;
            if (linkedList != null && linkedList.size() > 0) {
                View findViewById = this.f199807H.findViewById(C0966R.C0970id.gdb);
                View findViewById2 = this.f199807H.findViewById(C0966R.C0970id.gdc);
                View findViewById3 = this.f199807H.findViewById(C0966R.C0970id.gdd);
                ViewGroup viewGroup3 = (ViewGroup) this.f199807H.findViewById(C0966R.C0970id.gd9);
                ViewGroup viewGroup4 = (ViewGroup) this.f199807H.findViewById(C0966R.C0970id.gd_);
                ViewGroup viewGroup5 = (ViewGroup) this.f199807H.findViewById(C0966R.C0970id.gda);
                View findViewById4 = this.f199807H.findViewById(C0966R.C0970id.gcv);
                View findViewById5 = this.f199807H.findViewById(C0966R.C0970id.gcw);
                C69558a3.C69561c cVar3 = new C69558a3.C69561c();
                cVar3.f200852a = getResources().getColor(C0966R.color.a2z);
                if (linkedList.size() > 0) {
                    C69558a3.m81995a(this, viewGroup3, linkedList.get(0), cVar3);
                    C9556a aVar = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar.mo10233c(0);
                    View view5 = findViewById;
                    cVar = cVar3;
                    view3 = findViewById5;
                    view2 = findViewById4;
                    viewGroup2 = viewGroup5;
                    viewGroup = viewGroup4;
                    view = findViewById3;
                    C117292a.m165358d(view5, aVar.mo10232b(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyDetailUI", "renderOperationView", "(Lcom/tencent/mm/plugin/luckymoney/model/LuckyMoneyDetail;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                    C117292a.m165359e(view5, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyDetailUI", "renderOperationView", "(Lcom/tencent/mm/plugin/luckymoney/model/LuckyMoneyDetail;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                } else {
                    cVar = cVar3;
                    view3 = findViewById5;
                    view2 = findViewById4;
                    viewGroup2 = viewGroup5;
                    viewGroup = viewGroup4;
                    view = findViewById3;
                }
                if (linkedList.size() > 1) {
                    cVar2 = cVar;
                    C69558a3.m81995a(this, viewGroup, linkedList.get(1), cVar2);
                    C9556a aVar2 = new C9556a();
                    ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                    aVar2.mo10233c(0);
                    View view6 = findViewById2;
                    C117292a.m165358d(view6, aVar2.mo10232b(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyDetailUI", "renderOperationView", "(Lcom/tencent/mm/plugin/luckymoney/model/LuckyMoneyDetail;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                    C117292a.m165359e(view6, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyDetailUI", "renderOperationView", "(Lcom/tencent/mm/plugin/luckymoney/model/LuckyMoneyDetail;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                } else {
                    cVar2 = cVar;
                }
                if (linkedList.size() > 2) {
                    C69558a3.m81995a(this, viewGroup2, linkedList.get(2), cVar2);
                    C9556a aVar3 = new C9556a();
                    ThreadLocal<C9556a> threadLocal3 = C60958c.f173611a;
                    aVar3.mo10233c(0);
                    C117292a.m165358d(view, aVar3.mo10232b(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyDetailUI", "renderOperationView", "(Lcom/tencent/mm/plugin/luckymoney/model/LuckyMoneyDetail;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view4 = view;
                    view4.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                    C117292a.m165359e(view4, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyDetailUI", "renderOperationView", "(Lcom/tencent/mm/plugin/luckymoney/model/LuckyMoneyDetail;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                } else {
                    view4 = view;
                }
                if (findViewById.getVisibility() == 0 && (findViewById2.getVisibility() == 0 || view4.getVisibility() == 0)) {
                    C9556a aVar4 = new C9556a();
                    ThreadLocal<C9556a> threadLocal4 = C60958c.f173611a;
                    aVar4.mo10233c(0);
                    C117292a.m165358d(view2, aVar4.mo10232b(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyDetailUI", "renderOperationView", "(Lcom/tencent/mm/plugin/luckymoney/model/LuckyMoneyDetail;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    View view7 = view2;
                    view7.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
                    C117292a.m165359e(view7, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyDetailUI", "renderOperationView", "(Lcom/tencent/mm/plugin/luckymoney/model/LuckyMoneyDetail;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                if (findViewById2.getVisibility() == 0 && view4.getVisibility() == 0) {
                    C9556a aVar5 = new C9556a();
                    ThreadLocal<C9556a> threadLocal5 = C60958c.f173611a;
                    aVar5.mo10233c(0);
                    C117292a.m165358d(view3, aVar5.mo10232b(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyDetailUI", "renderOperationView", "(Lcom/tencent/mm/plugin/luckymoney/model/LuckyMoneyDetail;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    View view8 = view3;
                    view8.setVisibility(((Integer) aVar5.mo10231a(0)).intValue());
                    C117292a.m165359e(view8, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyDetailUI", "renderOperationView", "(Lcom/tencent/mm/plugin/luckymoney/model/LuckyMoneyDetail;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                if (findViewById.getVisibility() == 0 || findViewById2.getVisibility() == 0 || view4.getVisibility() == 0) {
                    this.f199907w.requestLayout();
                    View view9 = this.f199907w;
                    C9556a aVar6 = new C9556a();
                    ThreadLocal<C9556a> threadLocal6 = C60958c.f173611a;
                    aVar6.mo10233c(0);
                    View view10 = view9;
                    C117292a.m165358d(view10, aVar6.mo10232b(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyDetailUI", "renderOperationView", "(Lcom/tencent/mm/plugin/luckymoney/model/LuckyMoneyDetail;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view9.setVisibility(((Integer) aVar6.mo10231a(0)).intValue());
                    C117292a.m165359e(view10, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyDetailUI", "renderOperationView", "(Lcom/tencent/mm/plugin/luckymoney/model/LuckyMoneyDetail;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
            }
            this.f199801E = (ViewGroup) this.f199903u.findViewById(C0966R.C0970id.gcz);
            ViewGroup viewGroup6 = (ViewGroup) this.f199903u.findViewById(C0966R.C0970id.f358666gd2);
            C69558a3.C69561c cVar4 = new C69558a3.C69561c();
            cVar4.f200852a = getResources().getColor(C0966R.color.UN_BW_0_Alpha_0_5);
            cVar4.f200853b = getResources().getDimensionPixelSize(C0966R.dimen.f3881hq);
            C69558a3.m81995a(this, this.f199801E, a0Var2.f198945G, cVar4);
            C69558a3.C69561c cVar5 = new C69558a3.C69561c();
            cVar5.f200852a = getResources().getColor(C0966R.color.f2958ae);
            cVar5.f200853b = getResources().getDimensionPixelSize(C0966R.dimen.f3881hq);
            if (!(a0Var2.f198957T == null || C45628s0.m50742G(this.f199852Z0) || (a = C69253n2.m81627a(a0Var2.f198957T)) == null || a.f199286a == null)) {
                C77994sf2 sf22 = a.f199287b;
                cVar5.f200857f = sf22;
                if (sf22 == null) {
                    C77994sf2 sf23 = new C77994sf2();
                    cVar5.f200857f = sf23;
                    sf23.f228200d = this.f199908w1;
                }
                C69558a3.m81995a(this, this.f199801E, a.f199286a, cVar5);
                View findViewById6 = this.f199903u.findViewById(C0966R.C0970id.f358665gd1);
                TextView textView = (TextView) this.f199903u.findViewById(C0966R.C0970id.f358664gd0);
                textView.setTextSize(0, (float) getContext().getResources().getDimensionPixelSize(C0966R.dimen.f3881hq));
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f199801E.getLayoutParams();
                layoutParams.width = -1;
                this.f199801E.setLayoutParams(layoutParams);
                C9556a aVar7 = new C9556a();
                ThreadLocal<C9556a> threadLocal7 = C60958c.f173611a;
                aVar7.mo10233c(8);
                View view11 = findViewById6;
                C117292a.m165358d(view11, aVar7.mo10232b(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyDetailUI", "renderOperationView", "(Lcom/tencent/mm/plugin/luckymoney/model/LuckyMoneyDetail;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById6.setVisibility(((Integer) aVar7.mo10231a(0)).intValue());
                C117292a.m165359e(view11, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyDetailUI", "renderOperationView", "(Lcom/tencent/mm/plugin/luckymoney/model/LuckyMoneyDetail;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                textView.setVisibility(8);
                C77994sf2 sf24 = a.f199287b;
                C115669n.INSTANCE.mo160131h(16589, 1, a.f199286a.f199273g, this.f199908w1, sf24 != null ? sf24.f228202f : "", 0, C75675d.f222275a);
            }
            if (this.f199801E.getVisibility() == 0) {
                viewGroup6.setVisibility(0);
            } else {
                viewGroup6.setVisibility(8);
            }
        }
    }

    /* renamed from: U7 */
    public final void mo95561U7(String str) {
        Class cls = C78541w.class;
        Log.m105925i("MicroMsg.LuckyMoneyDetailUI", "sendEmoji emojiType :%s", Integer.valueOf(this.f199796B1));
        if (this.f199796B1 != 1) {
            ((C78541w) C86312j.m106911c(cls)).Q10(this, this.f199852Z0, this.f199892p1.getMd5(), getString(C0966R.string.f361003gj3), new C69369e());
            return;
        }
        ((C78541w) C86312j.m106911c(cls)).mo108491Sz(this, this.f199852Z0, str, getString(C0966R.string.f361003gj3), new C69367d(str));
    }

    /* renamed from: V7 */
    public void mo95562V7(boolean z) {
        LinearLayout linearLayout;
        LinearLayout linearLayout2;
        if (z) {
            this.f199806G1.setVisibility(0);
            if (this.f199802E1 && (linearLayout2 = this.f199839V) != null) {
                linearLayout2.setVisibility(0);
                return;
            }
            return;
        }
        this.f199806G1.setVisibility(8);
        if (this.f199802E1 && (linearLayout = this.f199839V) != null) {
            linearLayout.setVisibility(8);
        }
    }

    /* renamed from: W7 */
    public final void mo95563W7(boolean z) {
        Class cls = C39833l0.class;
        Log.m105925i("MicroMsg.LuckyMoneyDetailUI", "showEmoji() circle:%s", Boolean.TRUE);
        this.f199824Q.setVisibility(8);
        this.f199896q2 = 1;
        if (z) {
            this.f199889o2 = 3;
        } else {
            int i = this.f199889o2 - 1;
            this.f199889o2 = i;
            if (i == 0) {
                Log.m105924i("MicroMsg.LuckyMoneyDetailUI", "showEmoji() circle fail!");
                this.f199827R.setVisibility(8);
                this.f199824Q.setVisibility(0);
                this.f199896q2 = 2;
                return;
            }
        }
        IEmojiInfo r2 = ((C67303a1) C86312j.m106911c(C67303a1.class)).mo55768r2(this.f199882m1);
        this.f199880l1 = r2;
        if (r2 == null) {
            IEmojiInfo zE = ((C0363p0) C86312j.m106911c(C0363p0.class)).mo404zE();
            this.f199880l1 = zE;
            zE.setMd5(this.f199882m1);
            this.f199880l1.setType(this.f199885n1);
        } else if (C86013q1.m106451l(r2.mo62640K1()) > 0 || this.f199880l1.mo62678k() || this.f199880l1.mo62637I0()) {
            this.f199822P.setVisibility(0);
            IEmojiInfo iEmojiInfo = this.f199880l1;
            this.f199896q2 = 3;
            this.f199822P.setEmojiInfo(iEmojiInfo);
            RedEnvSendWithEmoticonClickStruct redEnvSendWithEmoticonClickStruct = new RedEnvSendWithEmoticonClickStruct();
            redEnvSendWithEmoticonClickStruct.f194328d = 11;
            redEnvSendWithEmoticonClickStruct.mo86054n();
            return;
        }
        if (z) {
            this.f199822P.setVisibility(8);
            this.f199827R.setVisibility(0);
            ((C39833l0) C86312j.m106911c(cls)).mo62465NG(this.f199847X1);
        }
        ((C39833l0) C86312j.m106911c(cls)).mo62467VJ(this.f199880l1);
        C86709a0.m107529k().f251779b.mo123455a(697, this.f199893p2);
    }

    /* renamed from: X7 */
    public final void mo95564X7(C69158a0 a0Var) {
        String str;
        LinkedList<C69236j1> linkedList;
        C69158a0 a0Var2 = a0Var;
        Class cls = C79173v.class;
        if (a0Var2 != null) {
            boolean R7 = mo95558R7(a0Var);
            if (a0Var2.f198981x == 1) {
                mo95557Q7();
            } else if (R7) {
                mo95557Q7();
            } else {
                mo95557Q7();
            }
            if (mo95557Q7()) {
                this.f199819N.setVisibility(0);
                mo95563W7(true);
            } else {
                this.f199819N.setVisibility(8);
            }
            String str2 = "";
            if (Util.isEqual(this.f199898r1.f198931f, 0) || !mo95558R7(a0Var) || !this.f199906v1 || a0Var2.f198948J == 7) {
                mo95554N7(0);
            } else {
                this.f199833T.setOnClickListener(this.f199886n2);
                this.f199833T.setTag("nodelete");
                this.f199891p0.setOnClickListener(this.f199886n2);
                this.f199825Q0.setOnClickListener(this.f199886n2);
                this.f199851Z.setOnClickListener(new C69686t(this));
                this.f199848Y.setOnClickListener(this.f199886n2);
                int S7 = mo95559S7();
                this.f199796B1 = S7;
                Log.m105925i("MicroMsg.LuckyMoneyDetailUI", "init mEmojiUseType：%s", Integer.valueOf(S7));
                if (this.f199796B1 != 1) {
                    String str3 = (String) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_WALLET_HONGBAO_LAST_THX_SEND_EMOJI_MD5_STRING, str2);
                    mo95554N7(1);
                    if (!Util.isNullOrNil(str3)) {
                        mo95555O7(2, str3);
                    }
                } else {
                    String str4 = (String) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_WALLET_HONGBAO_LAST_THX_SEND_EMOJI_NORMAL_STRING, str2);
                    mo95554N7(1);
                    if (!Util.isNullOrNil(str4)) {
                        mo95555O7(2, str4);
                    }
                }
            }
            boolean z = a0Var2.f198982y == 1;
            this.f199843W0 = z;
            int i = a0Var2.f198965e;
            boolean z2 = (i == 3 || i == 2) && a0Var2.f198981x == 1 && !z && a0Var2.f198940B == 1;
            C69249n nVar = a0Var2.f198941C;
            boolean z3 = nVar != null && nVar.f199277d == 1 && !Util.isNullOrNil(nVar.f199278e);
            TextView textView = (TextView) this.f199903u.findViewById(C0966R.C0970id.gdj);
            this.f199797C = textView;
            if (z2 || z3) {
                textView.setOnClickListener(new C69624k0(this, a0Var2));
                if (z3) {
                    C69249n nVar2 = a0Var2.f198941C;
                    this.f199858c1 = nVar2.f199278e;
                    this.f199797C.setText(nVar2.f199279f);
                }
                C115669n nVar3 = C115669n.INSTANCE;
                Object[] objArr = new Object[5];
                objArr[0] = Integer.valueOf(a0Var2.f198948J == 2 ? 13 : 7);
                objArr[1] = 0;
                objArr[2] = 0;
                objArr[3] = 0;
                objArr[4] = 2;
                nVar3.mo160131h(11701, objArr);
                this.f199797C.setVisibility(0);
            } else {
                textView.setVisibility(8);
            }
            this.f199860d1 = a0Var2.f198948J;
            TextView textView2 = (TextView) this.f199903u.findViewById(C0966R.C0970id.gdg);
            this.f199799D = textView2;
            textView2.setVisibility(8);
            if (!this.f199878k1) {
                this.f199853Z1.mo85792R5(this.f199903u, 3, false);
                this.f199878k1 = true;
            }
            if (this.f199813K == 0) {
                if (a0Var2.f198964d == 0 && (linkedList = a0Var2.f198951M) != null && linkedList.size() > 0 && a0Var2.f198951M.get(0).f199217i.equals(a0Var2.f198979v) && a0Var2.f198980w != 1) {
                    this.f199912y.setVisibility(8);
                } else {
                    this.f199912y.setVisibility(0);
                    if ((a0Var2.f198981x == 1) && !mo95558R7(a0Var)) {
                        View view = this.f199915z;
                        C9556a aVar = new C9556a();
                        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                        aVar.mo10233c(8);
                        View view2 = view;
                        C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyDetailUI", "updateByDetail", "(Lcom/tencent/mm/plugin/luckymoney/model/LuckyMoneyDetail;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                        C117292a.m165359e(view2, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyDetailUI", "updateByDetail", "(Lcom/tencent/mm/plugin/luckymoney/model/LuckyMoneyDetail;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        View view3 = this.f199793A;
                        C9556a aVar2 = new C9556a();
                        aVar2.mo10233c(8);
                        View view4 = view3;
                        C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyDetailUI", "updateByDetail", "(Lcom/tencent/mm/plugin/luckymoney/model/LuckyMoneyDetail;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                        C117292a.m165359e(view4, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyDetailUI", "updateByDetail", "(Lcom/tencent/mm/plugin/luckymoney/model/LuckyMoneyDetail;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        View view5 = this.f199795B;
                        C9556a aVar3 = new C9556a();
                        aVar3.mo10233c(8);
                        View view6 = view5;
                        C117292a.m165358d(view6, aVar3.mo10232b(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyDetailUI", "updateByDetail", "(Lcom/tencent/mm/plugin/luckymoney/model/LuckyMoneyDetail;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view5.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                        C117292a.m165359e(view6, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyDetailUI", "updateByDetail", "(Lcom/tencent/mm/plugin/luckymoney/model/LuckyMoneyDetail;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                }
                this.f199850Y1 = a0Var2.f198948J;
                Class cls2 = C76979h.class;
                AppCompatActivity context = getContext();
                if (a0Var2.f198948J == 2) {
                    this.f199872i.setImageResource(C0966R.C0969drawable.c5v);
                    if (a0Var2.f198949K != 0) {
                        Log.m105924i("MicroMsg.LuckyMoneyDetailUI", "busi logo load from file:" + a0Var2.f198949K);
                        GetFestivalLuckyMoneyResEvent getFestivalLuckyMoneyResEvent = new GetFestivalLuckyMoneyResEvent();
                        getFestivalLuckyMoneyResEvent.f193649d.f193651a = a0Var2.f198949K;
                        getFestivalLuckyMoneyResEvent.callback = new C69556a0(this, getFestivalLuckyMoneyResEvent, a0Var2);
                        getFestivalLuckyMoneyResEvent.asyncPublish(Looper.myLooper());
                    } else {
                        C69242l1.m81595a(this.f199872i, a0Var2.f198970j, a0Var2.f198954Q);
                    }
                } else if (C45628s0.m50742G(this.f199852Z0)) {
                    this.f199872i.setImageResource(C0966R.C0969drawable.f357299ci0);
                } else if (this.f199877j2 == 3 && a0Var2.f198963Z == 1) {
                    this.f199872i.setVisibility(8);
                } else {
                    C69242l1.m81595a(this.f199872i, a0Var2.f198970j, a0Var2.f198954Q);
                }
                if (!Util.isNullOrNil(a0Var2.f198961X)) {
                    Log.m105924i("MicroMsg.LuckyMoneyDetailUI", "use union sendername");
                    if (C45628s0.m50742G(this.f199852Z0)) {
                        str = a0Var2.f198969i + a0Var2.f198961X;
                    } else {
                        str = getString(C0966R.string.gjt, new Object[]{a0Var2.f198969i + a0Var2.f198961X});
                    }
                    this.f199875j.setMaxWidth(((WindowManager) getSystemService("window")).getDefaultDisplay().getWidth() - BackwardSupportUtil.BitmapFactory.fromDPToPix(getContext(), 92.0f));
                    SpannableString yp02 = ((C76979h) C86312j.m106911c(cls2)).yp0(getContext(), str, this.f199875j.getTextSize());
                    ((C76979h) C86312j.m106911c(cls2)).yp0(getContext(), a0Var2.f198969i, this.f199875j.getTextSize());
                    ((C76979h) C86312j.m106911c(cls2)).yp0(getContext(), a0Var2.f198961X, this.f199875j.getTextSize());
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(yp02);
                    spannableStringBuilder.setSpan(new C72476y0("#FA9D3B", (C72476y0.C72477a) new C69565b0(this)), str.lastIndexOf(a0Var2.f198961X), str.lastIndexOf(a0Var2.f198961X) + a0Var2.f198961X.length(), 18);
                    this.f199875j.setText(spannableStringBuilder);
                } else {
                    Log.m105924i("MicroMsg.LuckyMoneyDetailUI", "use union normal name");
                    if (C45628s0.m50742G(this.f199852Z0)) {
                        str2 = a0Var2.f198969i;
                    } else if (!a0Var2.f198962Y) {
                        str2 = a0Var2.f198969i;
                    } else {
                        C86709a0.m107528h();
                        C72996z1 H3 = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().mo69656H3(a0Var2.f198954Q);
                        if (H3 == null || Util.isNullOrNil(H3.getUsername())) {
                            Log.m105925i("MicroMsg.LuckyMoneyDetailUI", "do get contact: %s", a0Var2.f198954Q);
                            ((HashSet) this.f199800D1).add(a0Var2.f198954Q);
                            C31519v2.m39436a().mo55988e(a0Var2.f198954Q, str2, new C69573c0(this, a0Var2));
                        } else {
                            str2 = getString(C0966R.string.gjt, new Object[]{a0Var2.f198969i});
                        }
                    }
                    this.f199875j.setMaxWidth(((WindowManager) getSystemService("window")).getDefaultDisplay().getWidth() - BackwardSupportUtil.BitmapFactory.fromDPToPix(getContext(), 92.0f));
                    C69242l1.m81616v(context, this.f199875j, str2);
                }
                C69242l1.m81616v(context, this.f199884n, a0Var2.f198968h);
                if (!Util.isNullOrNil(a0Var2.f198968h)) {
                    this.f199884n.setVisibility(0);
                } else {
                    this.f199884n.setVisibility(8);
                }
                int i2 = a0Var2.f198964d;
                if (i2 == 1) {
                    this.f199887o.setVisibility(0);
                    this.f199887o.setImageResource(C0966R.raw.lucky_money_group_icon_new);
                } else if (i2 == 2) {
                    if (!C45628s0.m50740E(a0Var2.f198954Q)) {
                        C68097n nVar4 = new C68097n();
                        nVar4.f195728a = a0Var2.f198954Q;
                        ((C68098o) ((C76706g) C86312j.m106911c(C76706g.class)).mo106832eg()).mo93608Yt(nVar4);
                    }
                    this.f199887o.setVisibility(0);
                    this.f199887o.setImageResource(C0966R.raw.lucky_money_f2f_record_icon);
                } else {
                    this.f199887o.setVisibility(8);
                }
                if (!Util.isNullOrNil(a0Var2.f198947I)) {
                    Log.m105925i("MicroMsg.LuckyMoneyDetailUI", "hy: has url : %s", a0Var2.f198947I);
                    this.f199803F.setVisibility(4);
                    C69242l1.m81610p(this.f199805G, a0Var2.f198947I, (String) null, false);
                    MMHandlerThread.postToMainThreadDelayed(new C42538d0(this), 500);
                } else {
                    Log.m105924i("MicroMsg.LuckyMoneyDetailUI", "hy: no bg. set bg area to gone");
                    this.f199803F.setVisibility(8);
                }
                if (a0Var2.f198939A != 2 || this.f199849Y0 == 3) {
                    View view7 = this.f199890p;
                    C9556a aVar4 = new C9556a();
                    ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                    aVar4.mo10233c(8);
                    View view8 = view7;
                    C117292a.m165358d(view8, aVar4.mo10232b(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyDetailUI", "renderHeaderView", "(Lcom/tencent/mm/plugin/luckymoney/model/LuckyMoneyDetail;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view7.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
                    C117292a.m165359e(view8, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyDetailUI", "renderHeaderView", "(Lcom/tencent/mm/plugin/luckymoney/model/LuckyMoneyDetail;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                } else {
                    this.f199894q.setText(C75228t.m90260n(((double) a0Var2.f198974q) / 100.0d));
                    View view9 = this.f199890p;
                    C9556a aVar5 = new C9556a();
                    ThreadLocal<C9556a> threadLocal3 = C60958c.f173611a;
                    aVar5.mo10233c(0);
                    View view10 = view9;
                    C117292a.m165358d(view10, aVar5.mo10232b(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyDetailUI", "renderHeaderView", "(Lcom/tencent/mm/plugin/luckymoney/model/LuckyMoneyDetail;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view9.setVisibility(((Integer) aVar5.mo10231a(0)).intValue());
                    C117292a.m165359e(view10, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyDetailUI", "renderHeaderView", "(Lcom/tencent/mm/plugin/luckymoney/model/LuckyMoneyDetail;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                if (!Util.isNullOrNil(a0Var2.f198958U)) {
                    this.f199831S0.setVisibility(0);
                    this.f199834T0.setText(a0Var2.f198958U);
                    this.f199837U0.setOnClickListener(new C56862e0(this));
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f199897r.getLayoutParams();
                    if (marginLayoutParams != null) {
                        marginLayoutParams.topMargin = C76577a.m92151b(getContext(), 16);
                        this.f199897r.setLayoutParams(marginLayoutParams);
                    }
                } else {
                    this.f199831S0.setVisibility(8);
                }
                if (!Util.isNullOrNil(a0Var2.f198943E)) {
                    View view11 = this.f199897r;
                    C9556a aVar6 = new C9556a();
                    aVar6.mo10233c(0);
                    View view12 = view11;
                    C117292a.m165358d(view12, aVar6.mo10232b(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyDetailUI", "renderHeaderView", "(Lcom/tencent/mm/plugin/luckymoney/model/LuckyMoneyDetail;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view11.setVisibility(((Integer) aVar6.mo10231a(0)).intValue());
                    C117292a.m165359e(view12, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyDetailUI", "renderHeaderView", "(Lcom/tencent/mm/plugin/luckymoney/model/LuckyMoneyDetail;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    this.f199899s.setText(a0Var2.f198943E);
                    if (C45628s0.m50742G(this.f199852Z0)) {
                        this.f199901t.setVisibility(8);
                        View findViewById = this.f199807H.findViewById(C0966R.C0970id.f358668ge0);
                        C9556a aVar7 = new C9556a();
                        aVar7.mo10233c(8);
                        View view13 = findViewById;
                        C117292a.m165358d(view13, aVar7.mo10232b(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyDetailUI", "renderHeaderView", "(Lcom/tencent/mm/plugin/luckymoney/model/LuckyMoneyDetail;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        findViewById.setVisibility(((Integer) aVar7.mo10231a(0)).intValue());
                        C117292a.m165359e(view13, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyDetailUI", "renderHeaderView", "(Lcom/tencent/mm/plugin/luckymoney/model/LuckyMoneyDetail;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    } else if (a0Var2.f198942D == 1) {
                        Log.m105925i("MicroMsg.LuckyMoneyDetailUI", "changeIconUrl: %s", a0Var2.f198956S);
                        if (!Util.isNullOrNil(a0Var2.f198956S)) {
                            this.f199901t.setUrl(a0Var2.f198956S);
                            this.f199901t.setVisibility(0);
                        } else {
                            this.f199901t.setVisibility(8);
                        }
                        this.f199897r.setOnClickListener(new C69589f0(this, a0Var2));
                    } else {
                        Log.m105920e("MicroMsg.LuckyMoneyDetailUI", "detail.jumpChange is false");
                    }
                } else {
                    Log.m105920e("MicroMsg.LuckyMoneyDetailUI", "detail.changeWording is empty");
                    View view14 = this.f199897r;
                    C9556a aVar8 = new C9556a();
                    aVar8.mo10233c(8);
                    View view15 = view14;
                    C117292a.m165358d(view15, aVar8.mo10232b(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyDetailUI", "renderHeaderView", "(Lcom/tencent/mm/plugin/luckymoney/model/LuckyMoneyDetail;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view14.setVisibility(((Integer) aVar8.mo10231a(0)).intValue());
                    C117292a.m165359e(view15, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyDetailUI", "renderHeaderView", "(Lcom/tencent/mm/plugin/luckymoney/model/LuckyMoneyDetail;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                if (!Util.isNullOrNil(a0Var2.f198983z)) {
                    this.f199905v.setText(a0Var2.f198983z);
                    this.f199912y.setVisibility(0);
                    if ((a0Var2.f198981x == 1) && !mo95558R7(a0Var)) {
                        View view16 = this.f199915z;
                        C9556a aVar9 = new C9556a();
                        aVar9.mo10233c(8);
                        View view17 = view16;
                        C117292a.m165358d(view17, aVar9.mo10232b(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyDetailUI", "renderHeaderView", "(Lcom/tencent/mm/plugin/luckymoney/model/LuckyMoneyDetail;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view16.setVisibility(((Integer) aVar9.mo10231a(0)).intValue());
                        C117292a.m165359e(view17, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyDetailUI", "renderHeaderView", "(Lcom/tencent/mm/plugin/luckymoney/model/LuckyMoneyDetail;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        View view18 = this.f199793A;
                        C9556a aVar10 = new C9556a();
                        aVar10.mo10233c(8);
                        View view19 = view18;
                        C117292a.m165358d(view19, aVar10.mo10232b(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyDetailUI", "renderHeaderView", "(Lcom/tencent/mm/plugin/luckymoney/model/LuckyMoneyDetail;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view18.setVisibility(((Integer) aVar10.mo10231a(0)).intValue());
                        C117292a.m165359e(view19, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyDetailUI", "renderHeaderView", "(Lcom/tencent/mm/plugin/luckymoney/model/LuckyMoneyDetail;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        View view20 = this.f199795B;
                        C9556a aVar11 = new C9556a();
                        aVar11.mo10233c(8);
                        View view21 = view20;
                        C117292a.m165358d(view21, aVar11.mo10232b(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyDetailUI", "renderHeaderView", "(Lcom/tencent/mm/plugin/luckymoney/model/LuckyMoneyDetail;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view20.setVisibility(((Integer) aVar11.mo10231a(0)).intValue());
                        C117292a.m165359e(view21, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyDetailUI", "renderHeaderView", "(Lcom/tencent/mm/plugin/luckymoney/model/LuckyMoneyDetail;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                } else {
                    this.f199905v.setText((CharSequence) null);
                    this.f199912y.setVisibility(8);
                }
                mo95560T7(a0Var);
                C115669n nVar5 = C115669n.INSTANCE;
                Object[] objArr2 = new Object[5];
                objArr2[0] = Integer.valueOf(a0Var2.f198948J == 2 ? 13 : 7);
                objArr2[1] = 0;
                objArr2[2] = 0;
                objArr2[3] = 0;
                objArr2[4] = 1;
                nVar5.mo160131h(11701, objArr2);
            }
            LinkedList<C69236j1> linkedList2 = a0Var2.f198951M;
            if (linkedList2 != null) {
                for (int i3 = 0; i3 < linkedList2.size(); i3++) {
                    C69236j1 j1Var = linkedList2.get(i3);
                    if (!((HashMap) this.f199867g1).containsKey(j1Var.f199217i)) {
                        ((LinkedList) this.f199862e1).add(linkedList2.get(i3));
                        C69392t tVar = new C69392t(this);
                        tVar.f199952d = linkedList2.get(i3);
                        this.f199864f1.add(tVar);
                        ((HashMap) this.f199867g1).put(j1Var.f199217i, 1);
                    }
                }
                this.f199813K += linkedList2.size();
                this.f199846X0 = false;
                this.f199853Z1.notifyDataSetChanged();
            }
            if (a0Var2.f198964d == 2 && !Util.isNullOrNil(a0Var2.f198967g)) {
                SoundPool soundPool = new SoundPool(2, 3, 0);
                this.f199809I = soundPool;
                int[] iArr = new int[2];
                this.f199811J = iArr;
                try {
                    iArr[0] = soundPool.load(getResources().getAssets().openFd("most_lucky.m4a"), 0);
                    this.f199811J[1] = this.f199809I.load(getResources().getAssets().openFd("whistle.m4a"), 0);
                } catch (IOException e) {
                    Log.m105920e("MicroMsg.LuckyMoneyDetailUI", "load lucky money voice fail " + e.getMessage());
                }
                if (((C107054l) C86312j.m106911c(C107054l.class)).mo157471n()) {
                    Log.m105924i("MicroMsg.LuckyMoneyDetailUI", "do not play: system is mute");
                } else {
                    this.f199809I.setOnLoadCompleteListener(new C69376j(a0Var2));
                }
                this.f199807H.postDelayed(new C18929k(), 300);
            }
            if (!C45628s0.m50742G(this.f199852Z0)) {
                C67186g0 jo = ((C79173v) C86312j.m106911c(cls)).mo109172tc().mo105871jo(this.f199856b1);
                if (jo == null) {
                    jo = new C67186g0();
                }
                jo.field_mNativeUrl = this.f199856b1;
                jo.field_receiveAmount = a0Var2.f198974q;
                jo.field_receiveTime = System.currentTimeMillis();
                jo.field_hbStatus = a0Var2.f198965e;
                jo.field_receiveStatus = a0Var2.f198939A;
                jo.field_sendId = this.f199854a1;
                jo.field_sender = this.f199852Z0;
                if (jo.field_receiveAmount > 0) {
                    ((C79173v) C86312j.m106911c(cls)).mo109172tc().replace(jo);
                }
            }
            Log.m105918d("MicroMsg.LuckyMoneyDetailUI", "adjust footer");
            this.f199903u.post(new C69630l0(this));
            Dialog dialog = this.f199817M;
            if (dialog != null && dialog.isShowing()) {
                this.f199817M.dismiss();
            }
            if (!C45628s0.m50742G(this.f199852Z0)) {
                this.f199806G1.setVisibility(0);
                Log.m105924i("MicroMsg.LuckyMoneyDetailUI", "addOptionsMenuIfNeed");
                this.f199806G1.post(new C56867m0(this));
                this.f199806G1.setOnClickListener(new C69644n0(this));
                setActionbarElementColor(getResources().getColor(C0966R.color.f2975b6));
                return;
            }
            this.f199806G1.setVisibility(8);
        }
    }

    /* JADX WARNING: type inference failed for: r9v5 */
    /* JADX WARNING: type inference failed for: r9v71 */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00bd, code lost:
        r3 = r3.f199287b;
     */
    /* JADX WARNING: Incorrect type for immutable var: ssa=int, code=?, for r9v2, types: [boolean, int] */
    /* JADX WARNING: Removed duplicated region for block: B:172:0x066f  */
    /* JADX WARNING: Removed duplicated region for block: B:173:0x06d5  */
    /* renamed from: Y7 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo95565Y7(te3.C77993rp3 r32) {
        /*
            r31 = this;
            r1 = r31
            r0 = r32
            java.lang.Class<f32.b> r2 = f32.C75672b.class
            com.tencent.mm.plugin.luckymoney.model.a0 r3 = r1.f199859c2
            java.lang.String r3 = r3.f198957T
            r4 = 1
            r5 = 0
            java.lang.Integer r6 = java.lang.Integer.valueOf(r5)
            if (r3 == 0) goto L_0x01c2
            com.tencent.mm.plugin.luckymoney.model.n2 r3 = com.tencent.p014mm.plugin.luckymoney.model.C69253n2.m81627a(r3)
            java.lang.String r10 = r1.f199857b2
            boolean r10 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r10)
            if (r10 == 0) goto L_0x002a
            if (r3 == 0) goto L_0x002a
            te3.sf2 r10 = r3.f199287b
            if (r10 == 0) goto L_0x002a
            java.lang.String r10 = r10.f228202f
            r1.f199857b2 = r10
            com.tencent.p014mm.plugin.luckymoney.story.C69313d0.f199589g = r10
        L_0x002a:
            android.content.Intent r10 = r31.getIntent()
            java.lang.String r11 = "key_detail_envelope_url"
            java.lang.String r10 = r10.getStringExtra(r11)
            r1.f199861d2 = r10
            android.content.Intent r10 = r31.getIntent()
            java.lang.String r11 = "key_detail_envelope_md5"
            java.lang.String r10 = r10.getStringExtra(r11)
            r1.f199863e2 = r10
            android.content.Intent r10 = r31.getIntent()
            java.lang.String r11 = "key_detail_envelope_dynamic_url"
            java.lang.String r10 = r10.getStringExtra(r11)
            r1.f199865f2 = r10
            android.content.Intent r10 = r31.getIntent()
            java.lang.String r11 = "key_detail_envelope_dynamic_md5"
            java.lang.String r10 = r10.getStringExtra(r11)
            r1.f199868g2 = r10
            java.lang.String r10 = r1.f199861d2
            boolean r10 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r10)
            if (r10 == 0) goto L_0x007c
            if (r3 == 0) goto L_0x007c
            te3.sf2 r10 = r3.f199287b
            if (r10 == 0) goto L_0x007c
            te3.tf2 r10 = r10.f228203g
            if (r10 == 0) goto L_0x007c
            java.lang.String r11 = r10.f228246g
            r1.f199861d2 = r11
            java.lang.String r11 = r10.f228249j
            r1.f199863e2 = r11
            java.lang.String r11 = r10.f228261y
            r1.f199865f2 = r11
            java.lang.String r10 = r10.f228241C
            r1.f199868g2 = r10
        L_0x007c:
            java.lang.String r10 = r1.f199865f2
            boolean r10 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r10)
            if (r10 == 0) goto L_0x00b3
            java.lang.String r10 = r1.f199857b2
            boolean r10 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r10)
            if (r10 == 0) goto L_0x008d
            goto L_0x00b3
        L_0x008d:
            b42.a r10 = new b42.a
            r10.<init>()
            java.lang.String r11 = r1.f199857b2
            r10.field_packet_id = r11
            g32.b r11 = g32.C75846b.zx0()
            b42.b r11 = r11.Cx0()
            java.lang.String[] r12 = new java.lang.String[r5]
            boolean r11 = r11.get(r10, (java.lang.String[]) r12)
            if (r11 != 0) goto L_0x00a7
            goto L_0x00b3
        L_0x00a7:
            java.lang.String r11 = r10.field_detail_dynamic_url
            boolean r11 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r11)
            if (r11 != 0) goto L_0x00b3
            java.lang.String r10 = r10.field_detail_dynamic_url
            r1.f199865f2 = r10
        L_0x00b3:
            java.lang.String r10 = r1.f199861d2
            boolean r10 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r10)
            if (r10 != 0) goto L_0x01c2
            if (r3 == 0) goto L_0x00c4
            te3.sf2 r3 = r3.f199287b
            if (r3 == 0) goto L_0x00c4
            int r3 = r3.f228201e
            goto L_0x00c5
        L_0x00c4:
            r3 = 0
        L_0x00c5:
            com.tencent.mm.plugin.luckymoney.story.EnvelopeAppBarLayout r10 = r1.f199840V0
            java.lang.String r11 = r1.f199861d2
            java.lang.String r12 = r1.f199863e2
            java.lang.String r13 = r10.f199495Z0
            boolean r13 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r13)
            if (r13 == 0) goto L_0x0110
            boolean r13 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r11)
            if (r13 != 0) goto L_0x0110
            r10.f199495Z0 = r11
            r10.f199496a1 = r12
            android.widget.ProgressBar r11 = r10.f199483S
            r11.setVisibility(r5)
            di3.d r11 = di3.C86312j.m106911c(r2)
            f32.b r11 = (f32.C75672b) r11
            android.widget.ImageView r12 = r10.f199516s
            java.lang.String r13 = r10.f199495Z0
            java.lang.String r14 = r10.f199496a1
            java.lang.String r15 = r10.f199494Y0
            int r8 = r10.f199527x0
            int r9 = r10.f199511p0
            r17 = 0
            r18 = 0
            com.tencent.mm.plugin.luckymoney.story.i r7 = new com.tencent.mm.plugin.luckymoney.story.i
            r7.<init>(r10)
            r21 = 2
            r22 = 0
            r10 = r11
            r11 = r12
            r12 = r13
            r13 = r14
            r14 = r15
            r15 = r8
            r16 = r9
            r19 = r7
            r20 = r3
            r10.mo95321Ug(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
        L_0x0110:
            com.tencent.mm.plugin.luckymoney.story.EnvelopeAppBarLayout r7 = r1.f199840V0
            java.lang.String r8 = r1.f199865f2
            java.lang.String r9 = r1.f199868g2
            r7.getClass()
            java.util.HashMap<java.lang.String, java.lang.Long> r10 = com.tencent.p014mm.plugin.luckymoney.model.C69242l1.f199264a
            java.lang.Class<h81.h> r10 = h81.C32735h.class
            di3.d r10 = di3.C86312j.m106911c(r10)
            h81.h r10 = (h81.C32735h) r10
            h81.h$b r11 = h81.C32735h.C32738b.clicfg_android_lucky_money_dynamic_detail_close_switch
            boolean r10 = r10.mo58784wf(r11, r5)
            java.lang.Object[] r11 = new java.lang.Object[r4]
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r10)
            r11[r5] = r12
            java.lang.String r12 = "MicroMsg.LuckyMoneyUtil"
            java.lang.String r13 = "needCloseLuckyMoneyDynamicConfigDetail：%s "
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r12, r13, r11)
            if (r10 != 0) goto L_0x01af
            java.lang.String r10 = r7.f199497b1
            boolean r10 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r10)
            if (r10 == 0) goto L_0x01af
            boolean r10 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r8)
            if (r10 != 0) goto L_0x01af
            r7.f199497b1 = r8
            r7.f199498c1 = r9
            org.libpag.PAGView$PAGViewListener r8 = r7.f199520u
            if (r8 != 0) goto L_0x0171
            com.tencent.mm.plugin.luckymoney.story.j r8 = new com.tencent.mm.plugin.luckymoney.story.j
            r8.<init>(r7)
            r7.f199520u = r8
            org.libpag.PAGView r9 = r7.f199518t
            r9.addListener(r8)
            org.libpag.PAGView r8 = r7.f199518t
            r8.setRepeatCount(r5)
            org.libpag.PAGView r8 = r7.f199518t
            r9 = 3
            r8.setScaleMode(r9)
            org.libpag.PAGView r8 = r7.f199518t
            com.tencent.mm.plugin.luckymoney.story.k r9 = new com.tencent.mm.plugin.luckymoney.story.k
            r9.<init>(r7)
            r8.addPAGFlushListener(r9)
        L_0x0171:
            android.widget.ImageView r8 = r7.f199516s
            com.tencent.mm.plugin.luckymoney.story.l r9 = new com.tencent.mm.plugin.luckymoney.story.l
            r9.<init>(r7)
            r8.post(r9)
            a14.n0 r8 = r7.f199522v
            if (r8 != 0) goto L_0x0187
            com.tencent.mm.wallet_core.model.u0 r8 = com.tencent.p014mm.wallet_core.model.C75142u0.f221103a
            a14.n0 r8 = r8.mo104865a()
            r7.f199522v = r8
        L_0x0187:
            te3.sf2 r8 = new te3.sf2
            r8.<init>()
            r8.f228201e = r3
            te3.tf2 r3 = new te3.tf2
            r3.<init>()
            r8.f228203g = r3
            java.lang.String r9 = r7.f199497b1
            r3.f228261y = r9
            java.lang.String r9 = r7.f199498c1
            r3.f228241C = r9
            long r9 = java.lang.System.currentTimeMillis()
            com.tencent.mm.plugin.luckymoney.model.d0 r3 = com.tencent.p014mm.plugin.luckymoney.model.C69198d0.f199107a
            a14.n0 r11 = r7.f199522v
            com.tencent.mm.plugin.luckymoney.story.m r12 = new com.tencent.mm.plugin.luckymoney.story.m
            r12.<init>(r7, r9)
            r7 = 2
            r3.mo95352b(r8, r7, r11, r12)
            goto L_0x01b6
        L_0x01af:
            org.libpag.PAGView r3 = r7.f199518t
            r7 = 8
            r3.setVisibility(r7)
        L_0x01b6:
            boolean r3 = r1.f199876j1
            if (r3 != 0) goto L_0x01c2
            r1.f199876j1 = r4
            java.lang.String r3 = r1.f199861d2
            r7 = 3
            f32.C75675d.m90931a(r7, r3)
        L_0x01c2:
            com.tencent.mm.plugin.luckymoney.story.EnvelopeAppBarLayout r3 = r1.f199840V0
            java.lang.String r11 = r1.f199857b2
            java.lang.String r7 = r1.f199908w1
            int r8 = r1.f199871h2
            java.lang.String r9 = r1.f199852Z0
            boolean r9 = eb0.C45628s0.m50742G(r9)
            java.lang.String r10 = r3.f199495Z0
            boolean r10 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r10)
            java.lang.String r14 = "MicroMsg.EnvelopeAppBarLayout"
            java.lang.String r15 = ""
            r13 = -1
            r12 = 4
            if (r10 == 0) goto L_0x0204
            r3.mo95440m(r5)
            android.content.Context r7 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            r8 = 502(0x1f6, float:7.03E-43)
            int r7 = kg3.C76577a.m92151b(r7, r8)
            r3.f199527x0 = r7
            com.google.android.material.appbar.AppBarLayout$LayoutParams r7 = new com.google.android.material.appbar.AppBarLayout$LayoutParams
            int r8 = r3.f199527x0
            r7.<init>((int) r13, (int) r8)
            r8 = 3
            r7.f193396a = r8
            android.view.View r8 = r3.f199514r
            int r9 = r3.f199482R0
            r8.setMinimumHeight(r9)
            android.view.View r8 = r3.f199514r
            r8.setLayoutParams(r7)
            goto L_0x0213
        L_0x0204:
            if (r0 != 0) goto L_0x0217
            r3.mo95440m(r4)
            r3.mo95434g()
            android.widget.TextView r8 = r3.f199470G
            r8.setText(r7)
            com.tencent.p014mm.plugin.luckymoney.story.C69313d0.f199586d = r7
        L_0x0213:
            r9 = 1
            r10 = 4
            goto L_0x0618
        L_0x0217:
            r3.f199493X0 = r0
            r3.f199494Y0 = r11
            r3.f199533z1 = r9
            android.widget.TextView r7 = r3.f199461B
            java.lang.String r9 = r0.f228179g
            r7.setText(r9)
            android.widget.TextView r7 = r3.f199465D
            te3.rp3 r9 = r3.f199493X0
            java.lang.String r9 = r9.f228180h
            r7.setText(r9)
            te3.rp3 r7 = r3.f199493X0
            java.lang.String r7 = r7.f228194y
            boolean r7 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r7)
            if (r7 != 0) goto L_0x024d
            android.widget.TextView r7 = r3.f199467E
            te3.rp3 r9 = r3.f199493X0
            java.lang.String r9 = r9.f228194y
            r7.setText(r9)
            android.widget.TextView r7 = r3.f199467E
            r7.setVisibility(r5)
            r7 = 24
            java.lang.String r9 = r3.f199495Z0
            f32.C75675d.m90931a(r7, r9)
            goto L_0x0254
        L_0x024d:
            android.widget.TextView r7 = r3.f199467E
            r9 = 8
            r7.setVisibility(r9)
        L_0x0254:
            android.widget.TextView r7 = r3.f199470G
            te3.rp3 r9 = r3.f199493X0
            java.lang.String r9 = r9.f228176d
            r7.setText(r9)
            te3.rp3 r7 = r3.f199493X0
            java.lang.String r7 = r7.f228180h
            com.tencent.p014mm.plugin.luckymoney.story.C69313d0.f199586d = r7
            te3.op3 r7 = r0.f228187r
            if (r7 == 0) goto L_0x0269
            int r8 = r7.f227962u
        L_0x0269:
            r7 = 2
            if (r8 != r7) goto L_0x0277
            android.widget.TextView r7 = r3.f199471H
            r7.setVisibility(r5)
            android.widget.TextView r7 = r3.f199469F
            r7.setVisibility(r5)
            goto L_0x0283
        L_0x0277:
            android.widget.TextView r7 = r3.f199471H
            r8 = 8
            r7.setVisibility(r8)
            android.widget.TextView r7 = r3.f199469F
            r7.setVisibility(r8)
        L_0x0283:
            te3.rp3 r7 = r3.f199493X0
            int r8 = r7.f228182j
            f32.C75675d.f222281g = r8
            java.lang.String r7 = r7.f228193x
            boolean r7 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r7)
            if (r7 != 0) goto L_0x0294
            f32.C75675d.f222282h = r4
            goto L_0x0298
        L_0x0294:
            f32.C75675d.f222282h = r5
            f32.C75675d.f222283i = r15
        L_0x0298:
            te3.rp3 r7 = r3.f199493X0
            int r8 = r7.f228182j
            if (r8 != r4) goto L_0x02bf
            boolean r7 = r3.f199515r1
            if (r7 != 0) goto L_0x02ab
            java.lang.String r7 = r3.f199495Z0
            r8 = 8
            f32.C75675d.m90931a(r8, r7)
            r3.f199515r1 = r4
        L_0x02ab:
            android.view.ViewGroup r7 = r3.f199478P
            com.tencent.mm.plugin.luckymoney.story.b r8 = new com.tencent.mm.plugin.luckymoney.story.b
            r8.<init>(r3)
            r7.setOnClickListener(r8)
            android.widget.TextView r7 = r3.f199472I
            r8 = 2131821567(0x7f1103ff, float:1.927588E38)
            r7.setText(r8)
            goto L_0x0389
        L_0x02bf:
            r9 = 2
            if (r8 != r9) goto L_0x02f4
            java.lang.String r7 = r7.f228184o
            boolean r7 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r7)
            if (r7 != 0) goto L_0x0389
            boolean r7 = r3.f199517s1
            if (r7 != 0) goto L_0x02d7
            r7 = 11
            java.lang.String r8 = r3.f199495Z0
            f32.C75675d.m90931a(r7, r8)
            r3.f199517s1 = r4
        L_0x02d7:
            android.view.ViewGroup r7 = r3.f199478P
            r8 = 100
            com.tencent.p014mm.wallet_core.p137ui.C75228t.m90252j(r7, r8)
            com.tencent.p014mm.plugin.luckymoney.story.C69315e0.f199603m = r4
            android.view.ViewGroup r7 = r3.f199478P
            com.tencent.mm.plugin.luckymoney.story.c r8 = new com.tencent.mm.plugin.luckymoney.story.c
            r8.<init>(r3)
            r7.setOnClickListener(r8)
            android.widget.TextView r7 = r3.f199472I
            r8 = 2131832390(0x7f112e46, float:1.9297832E38)
            r7.setText(r8)
            goto L_0x0389
        L_0x02f4:
            r7 = 3
            if (r8 != r7) goto L_0x0318
            boolean r7 = r3.f199519t1
            if (r7 != 0) goto L_0x0304
            r7 = 12
            java.lang.String r8 = r3.f199495Z0
            f32.C75675d.m90931a(r7, r8)
            r3.f199519t1 = r4
        L_0x0304:
            android.view.ViewGroup r7 = r3.f199478P
            com.tencent.mm.plugin.luckymoney.story.d r8 = new com.tencent.mm.plugin.luckymoney.story.d
            r8.<init>(r3)
            r7.setOnClickListener(r8)
            android.widget.TextView r7 = r3.f199472I
            r8 = 2131832395(0x7f112e4b, float:1.9297843E38)
            r7.setText(r8)
            goto L_0x0389
        L_0x0318:
            if (r8 != r12) goto L_0x033a
            boolean r7 = r3.f199525w1
            if (r7 != 0) goto L_0x0327
            r7 = 19
            java.lang.String r8 = r3.f199495Z0
            f32.C75675d.m90931a(r7, r8)
            r3.f199525w1 = r4
        L_0x0327:
            android.view.ViewGroup r7 = r3.f199478P
            com.tencent.mm.plugin.luckymoney.story.e r8 = new com.tencent.mm.plugin.luckymoney.story.e
            r8.<init>(r3)
            r7.setOnClickListener(r8)
            android.widget.TextView r7 = r3.f199472I
            r8 = 2131832393(0x7f112e49, float:1.9297839E38)
            r7.setText(r8)
            goto L_0x0389
        L_0x033a:
            r7 = 5
            if (r8 != r7) goto L_0x035d
            boolean r7 = r3.f199523v1
            if (r7 != 0) goto L_0x034a
            r7 = 17
            java.lang.String r8 = r3.f199495Z0
            f32.C75675d.m90931a(r7, r8)
            r3.f199523v1 = r4
        L_0x034a:
            android.view.ViewGroup r7 = r3.f199478P
            com.tencent.mm.plugin.luckymoney.story.f r8 = new com.tencent.mm.plugin.luckymoney.story.f
            r8.<init>(r3)
            r7.setOnClickListener(r8)
            android.widget.TextView r7 = r3.f199472I
            r8 = 2131832392(0x7f112e48, float:1.9297837E38)
            r7.setText(r8)
            goto L_0x0389
        L_0x035d:
            r7 = 6
            if (r8 != r7) goto L_0x0380
            boolean r7 = r3.f199521u1
            if (r7 != 0) goto L_0x036d
            r7 = 15
            java.lang.String r8 = r3.f199495Z0
            f32.C75675d.m90931a(r7, r8)
            r3.f199521u1 = r4
        L_0x036d:
            android.view.ViewGroup r7 = r3.f199478P
            com.tencent.mm.plugin.luckymoney.story.g r8 = new com.tencent.mm.plugin.luckymoney.story.g
            r8.<init>(r3)
            r7.setOnClickListener(r8)
            android.widget.TextView r7 = r3.f199472I
            r8 = 2131832391(0x7f112e47, float:1.9297835E38)
            r7.setText(r8)
            goto L_0x0389
        L_0x0380:
            android.view.ViewGroup r7 = r3.f199478P
            r8 = 8
            r7.setVisibility(r8)
            com.tencent.p014mm.plugin.luckymoney.story.C69315e0.f199603m = r5
        L_0x0389:
            te3.rp3 r7 = r3.f199493X0
            java.lang.String r7 = r7.f228188s
            boolean r7 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r7)
            if (r7 != 0) goto L_0x039c
            android.widget.TextView r7 = r3.f199472I
            te3.rp3 r8 = r3.f199493X0
            java.lang.String r8 = r8.f228188s
            r7.setText(r8)
        L_0x039c:
            java.lang.String r7 = r0.f228177e
            boolean r7 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r7)
            if (r7 != 0) goto L_0x03bc
            di3.d r7 = di3.C86312j.m106911c(r2)
            f32.b r7 = (f32.C75672b) r7
            com.tencent.mm.ui.widget.RoundCornerImageView r8 = r3.f199463C
            java.lang.String r9 = r0.f228177e
            java.lang.String r10 = r0.f228178f
            int r13 = r3.f199468E1
            r12 = r13
            r7.mo95322b6(r8, r9, r10, r11, r12, r13)
            com.tencent.mm.ui.widget.RoundCornerImageView r7 = r3.f199463C
            r7.setVisibility(r5)
            goto L_0x03c3
        L_0x03bc:
            com.tencent.mm.ui.widget.RoundCornerImageView r7 = r3.f199463C
            r8 = 8
            r7.setVisibility(r8)
        L_0x03c3:
            java.util.ArrayList<com.tencent.mm.plugin.luckymoney.story.EnvelopeAppBarLayout$g> r7 = r3.f199490V0
            r7.clear()
            java.util.LinkedList<te3.vb4> r7 = r0.f228181i
            boolean r7 = r7.isEmpty()
            if (r7 != 0) goto L_0x0607
            com.tencent.p014mm.plugin.luckymoney.story.C69315e0.f199602l = r4
            r7 = 2
            com.tencent.p014mm.plugin.luckymoney.story.C69313d0.f199587e = r7
            r7 = 0
        L_0x03d6:
            java.util.LinkedList<te3.vb4> r8 = r0.f228181i
            int r8 = r8.size()
            if (r7 >= r8) goto L_0x0420
            java.util.LinkedList<te3.vb4> r8 = r0.f228181i
            java.lang.Object r8 = r8.get(r7)
            te3.vb4 r8 = (te3.vb4) r8
            com.tencent.mm.plugin.luckymoney.story.EnvelopeAppBarLayout$g r9 = new com.tencent.mm.plugin.luckymoney.story.EnvelopeAppBarLayout$g
            r9.<init>()
            r9.f199550d = r8
            r9.f199554h = r7
            int r10 = r0.f228175C
            r9.f199553g = r10
            java.lang.String r10 = com.tencent.p014mm.plugin.luckymoney.model.C69266u0.m81634B(r10, r7)
            int r11 = r9.f199553g
            if (r11 <= 0) goto L_0x0408
            boolean r11 = com.tencent.p014mm.vfs.C86013q1.m106450k(r10)
            if (r11 == 0) goto L_0x0408
            java.lang.String r11 = "[static luckymoney resource] has local video,add path"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r14, r11)
            r9.f199555i = r10
        L_0x0408:
            java.util.ArrayList<com.tencent.mm.plugin.luckymoney.story.EnvelopeAppBarLayout$g> r10 = r3.f199490V0
            r10.add(r9)
            int r8 = r8.f228306d
            r9 = 2
            if (r8 != r9) goto L_0x0418
            int r8 = r3.f199510o1
            int r8 = r8 + r4
            r3.f199510o1 = r8
            goto L_0x041d
        L_0x0418:
            int r8 = r3.f199512p1
            int r8 = r8 + r4
            r3.f199512p1 = r8
        L_0x041d:
            int r7 = r7 + 1
            goto L_0x03d6
        L_0x0420:
            com.tencent.mm.view.MediaBannerIndicator r7 = r3.f199459A
            java.util.ArrayList<com.tencent.mm.plugin.luckymoney.story.EnvelopeAppBarLayout$g> r8 = r3.f199490V0
            int r8 = r8.size()
            r7.setCount(r8)
            r7 = 2
            r3.mo95440m(r7)
            android.content.Context r7 = r3.getContext()
            android.graphics.Point r7 = com.tencent.p014mm.p136ui.C85875k4.m106184h(r7)
            int r7 = r7.x
            if (r7 <= 0) goto L_0x043e
            r3.f199511p0 = r7
            goto L_0x044d
        L_0x043e:
            android.graphics.Rect r7 = new android.graphics.Rect
            r7.<init>()
            r3.getWindowVisibleDisplayFrame(r7)
            int r8 = r7.right
            int r7 = r7.left
            int r8 = r8 - r7
            r3.f199511p0 = r8
        L_0x044d:
            int r7 = r3.f199511p0
            float r7 = (float) r7
            r8 = 1070948418(0x3fd56042, float:1.667)
            float r8 = r8 * r7
            int r8 = (int) r8
            r3.f199527x0 = r8
            r9 = 1068163400(0x3faae148, float:1.335)
            float r7 = r7 * r9
            int r7 = (int) r7
            int r8 = r8 - r7
            r3.f199530y0 = r8
            android.widget.ImageView r8 = r3.f199516s
            r8.setMinimumHeight(r7)
            org.libpag.PAGView r8 = r3.f199518t
            r8.setMinimumHeight(r7)
            com.google.android.material.appbar.AppBarLayout$LayoutParams r7 = new com.google.android.material.appbar.AppBarLayout$LayoutParams
            int r8 = r3.f199527x0
            r9 = -1
            r7.<init>((int) r9, (int) r8)
            r8 = 3
            r7.f193396a = r8
            android.view.View r8 = r3.f199514r
            r8.setLayoutParams(r7)
            android.view.View r7 = r3.f199514r
            int r8 = r3.f199482R0
            r7.setMinimumHeight(r8)
            com.tencent.mm.plugin.luckymoney.story.a r7 = new com.tencent.mm.plugin.luckymoney.story.a
            r7.<init>(r3)
            r8 = 50
            r3.postDelayed(r7, r8)
            com.tencent.mm.storage.y1$a r7 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_LUCKY_MONEY_STORY_PREVIEW_GUIDE_TIME_INT_SYNC
            com.tencent.mm.storage.y1$a r8 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_LUCKY_MONEY_STORY_GUIDE_TIME_INT_SYNC
            boolean r9 = r3.f199533z1
            if (r9 == 0) goto L_0x04a7
            f40.o r9 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r9 = r9.mo121142i()
            java.lang.Object r9 = r9.mo119685f(r7, r6)
            java.lang.Integer r9 = (java.lang.Integer) r9
            int r9 = r9.intValue()
            goto L_0x04b9
        L_0x04a7:
            f40.o r9 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r9 = r9.mo121142i()
            java.lang.Object r9 = r9.mo119685f(r8, r6)
            java.lang.Integer r9 = (java.lang.Integer) r9
            int r9 = r9.intValue()
        L_0x04b9:
            java.lang.Object[] r10 = new java.lang.Object[r4]
            java.lang.Integer r11 = java.lang.Integer.valueOf(r9)
            r10[r5] = r11
            java.lang.String r11 = "show first guide: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r14, r11, r10)
            bp3.p r10 = bp3.C79758p.f233760a
            bp3.f r11 = bp3.C104160f.RepairerConfig_Pay_LuckyMoneyEnvelopeFirstGuide_Int
            int r10 = r10.mo109882e(r11, r5)
            if (r10 != r4) goto L_0x04d1
            goto L_0x04dc
        L_0x04d1:
            r11 = 2
            if (r10 != r11) goto L_0x04d5
            goto L_0x04de
        L_0x04d5:
            r10 = 3
            if (r9 >= r10) goto L_0x04de
            int r9 = r3.f199499d1
            if (r9 != r11) goto L_0x04de
        L_0x04dc:
            r9 = 1
            goto L_0x04df
        L_0x04de:
            r9 = 0
        L_0x04df:
            if (r9 == 0) goto L_0x05ff
            r3.f199531y1 = r4
            r9 = 2131308534(0x7f092ff6, float:1.8235326E38)
            android.view.View r9 = r3.findViewById(r9)
            android.view.ViewGroup r9 = (android.view.ViewGroup) r9
            r3.f199481R = r9
            r9.setVisibility(r5)
            android.view.ViewGroup r9 = r3.f199529y
            r10 = 4
            r9.setVisibility(r10)
            android.animation.ValueAnimator r9 = new android.animation.ValueAnimator
            r9.<init>()
            r3.f199503h1 = r9
            r11 = 700(0x2bc, double:3.46E-321)
            r9.setDuration(r11)
            android.animation.ValueAnimator r9 = r3.f199503h1
            android.view.animation.AccelerateDecelerateInterpolator r11 = new android.view.animation.AccelerateDecelerateInterpolator
            r11.<init>()
            r9.setInterpolator(r11)
            android.animation.ValueAnimator r9 = r3.f199503h1
            r11 = 2
            int[] r12 = new int[r11]
            r12[r5] = r5
            int r13 = r3.f199480Q0
            r12[r4] = r13
            r9.setIntValues(r12)
            android.animation.ObjectAnimator r9 = new android.animation.ObjectAnimator
            r9.<init>()
            r3.f199504i1 = r9
            java.lang.String r12 = "alpha"
            r9.setPropertyName(r12)
            android.animation.ObjectAnimator r9 = r3.f199504i1
            float[] r12 = new float[r11]
            r12 = {1065353216, 0} // fill-array
            r9.setFloatValues(r12)
            android.animation.ObjectAnimator r9 = r3.f199504i1
            android.view.ViewGroup r11 = r3.f199481R
            r9.setTarget(r11)
            android.animation.ObjectAnimator r9 = r3.f199504i1
            r11 = 300(0x12c, double:1.48E-321)
            r9.setDuration(r11)
            android.animation.ObjectAnimator r9 = r3.f199504i1
            r4 = 200(0xc8, double:9.9E-322)
            r9.setStartDelay(r4)
            android.animation.ObjectAnimator r9 = r3.f199504i1
            com.tencent.mm.plugin.luckymoney.story.o r13 = new com.tencent.mm.plugin.luckymoney.story.o
            r13.<init>(r3)
            r9.addListener(r13)
            android.animation.ValueAnimator r9 = new android.animation.ValueAnimator
            r9.<init>()
            r3.f199505j1 = r9
            android.animation.TimeInterpolator r13 = p161h8.C108164a.f323894e
            r9.setInterpolator(r13)
            android.animation.ValueAnimator r9 = r3.f199505j1
            r9.setStartDelay(r4)
            android.animation.ValueAnimator r4 = r3.f199505j1
            r4.setDuration(r11)
            android.animation.ValueAnimator r4 = r3.f199505j1
            r5 = 2
            int[] r9 = new int[r5]
            int r5 = r3.f199480Q0
            r11 = 0
            r9[r11] = r5
            r5 = 1
            r9[r5] = r11
            r4.setIntValues(r9)
            com.tencent.mm.plugin.luckymoney.story.p r4 = new com.tencent.mm.plugin.luckymoney.story.p
            r4.<init>(r3)
            android.animation.ValueAnimator r5 = r3.f199503h1
            r5.addUpdateListener(r4)
            android.animation.ValueAnimator r5 = r3.f199505j1
            r5.addUpdateListener(r4)
            android.animation.AnimatorSet r4 = new android.animation.AnimatorSet
            r4.<init>()
            r3.f199506k1 = r4
            r5 = 3
            android.animation.Animator[] r5 = new android.animation.Animator[r5]
            android.animation.ValueAnimator r9 = r3.f199503h1
            r11 = 0
            r5[r11] = r9
            android.animation.ObjectAnimator r9 = r3.f199504i1
            r11 = 1
            r5[r11] = r9
            android.animation.ValueAnimator r9 = r3.f199505j1
            r11 = 2
            r5[r11] = r9
            r4.playSequentially(r5)
            android.animation.AnimatorSet r4 = r3.f199506k1
            com.tencent.mm.plugin.luckymoney.story.q r5 = new com.tencent.mm.plugin.luckymoney.story.q
            r5.<init>(r3)
            r4.addListener(r5)
            com.tencent.mm.plugin.luckymoney.story.h r4 = new com.tencent.mm.plugin.luckymoney.story.h
            r4.<init>(r3)
            r3.post(r4)
            boolean r4 = r3.f199533z1
            if (r4 == 0) goto L_0x05db
            f40.o r4 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r4 = r4.mo121142i()
            java.lang.Object r4 = r4.mo119685f(r7, r6)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            f40.o r5 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r5 = r5.mo121142i()
            r9 = 1
            int r4 = r4 + r9
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r5.mo119677K(r7, r4)
            goto L_0x060f
        L_0x05db:
            r9 = 1
            f40.o r4 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r4 = r4.mo121142i()
            java.lang.Object r4 = r4.mo119685f(r8, r6)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            f40.o r5 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r5 = r5.mo121142i()
            int r4 = r4 + r9
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r5.mo119677K(r8, r4)
            goto L_0x060f
        L_0x05ff:
            r9 = 1
            r10 = 4
            r3.f199464C1 = r9
            r3.mo95442o()
            goto L_0x060f
        L_0x0607:
            r9 = 1
            r10 = 4
            r3.mo95440m(r9)
            r3.mo95434g()
        L_0x060f:
            com.tencent.mm.view.RecyclerHorizontalViewPager r4 = r3.f199524w
            androidx.recyclerview.widget.RecyclerView$e r4 = r4.getAdapter()
            r4.notifyDataSetChanged()
        L_0x0618:
            java.lang.Object[] r4 = new java.lang.Object[r9]
            int r3 = r3.f199499d1
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r5 = 0
            r4[r5] = r3
            java.lang.String r3 = "set envelope story: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r14, r3, r4)
            di3.d r2 = di3.C86312j.m106911c(r2)
            f32.b r2 = (f32.C75672b) r2
            r2.mo95318Ng(r0, r9)
            java.lang.String r2 = r1.f199857b2
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r2 != 0) goto L_0x0656
            java.lang.String r2 = r1.f199857b2
            java.lang.String r3 = "rpid_wxapp_"
            boolean r2 = r2.startsWith(r3)
            if (r2 == 0) goto L_0x0656
            android.view.View r2 = r1.f199903u
            if (r2 == 0) goto L_0x0656
            r3 = 2131308520(0x7f092fe8, float:1.8235298E38)
            android.view.View r2 = r2.findViewById(r3)
            android.widget.TextView r2 = (android.widget.TextView) r2
            if (r2 == 0) goto L_0x0656
            r3 = 0
            r2.setVisibility(r3)
        L_0x0656:
            java.lang.String r2 = "MicroMsg.LuckyMoneyDetailUI"
            java.lang.String r3 = "adjust footer"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r2, r3)
            android.view.View r3 = r1.f199903u
            com.tencent.mm.plugin.luckymoney.ui.l0 r4 = new com.tencent.mm.plugin.luckymoney.ui.l0
            r4.<init>(r1)
            r3.post(r4)
            java.lang.String r3 = r1.f199861d2
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
            if (r3 == 0) goto L_0x06d5
            java.lang.String r0 = "mEnvelopeUrl is null, old margin "
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)
            android.view.View r0 = r1.f199810I1
            k20.a r2 = new k20.a
            r2.<init>()
            java.lang.ThreadLocal<k20.a> r3 = k20.C60958c.f173611a
            r3 = 8
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r2.mo10233c(r3)
            java.lang.Object[] r4 = r2.mo10232b()
            java.lang.String r5 = "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyDetailUI"
            java.lang.String r6 = "updateTopLinkArea"
            java.lang.String r7 = "(Lcom/tencent/mm/protocal/protobuf/RedPacketStoryInfo;)V"
            java.lang.String r8 = "android/view/View_EXEC_"
            java.lang.String r9 = "setVisibility"
            java.lang.String r10 = "(I)V"
            r3 = r0
            j20.C117292a.m165358d(r3, r4, r5, r6, r7, r8, r9, r10)
            r3 = 0
            java.lang.Object r2 = r2.mo10231a(r3)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r0.setVisibility(r2)
            java.lang.String r4 = "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyDetailUI"
            java.lang.String r5 = "updateTopLinkArea"
            java.lang.String r6 = "(Lcom/tencent/mm/protocal/protobuf/RedPacketStoryInfo;)V"
            java.lang.String r7 = "android/view/View_EXEC_"
            java.lang.String r8 = "setVisibility"
            java.lang.String r9 = "(I)V"
            r3 = r0
            j20.C117292a.m165359e(r3, r4, r5, r6, r7, r8, r9)
            android.view.View r0 = r1.f199808H1
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            android.widget.RelativeLayout$LayoutParams r0 = (android.widget.RelativeLayout.LayoutParams) r0
            androidx.appcompat.app.AppCompatActivity r2 = r31.getContext()
            r3 = 32
            int r2 = kg3.C76577a.m92151b(r2, r3)
            r0.topMargin = r2
            android.view.View r2 = r1.f199808H1
            r2.setLayoutParams(r0)
            goto L_0x084f
        L_0x06d5:
            android.view.View r3 = r1.f199810I1
            k20.a r4 = new k20.a
            r4.<init>()
            java.lang.ThreadLocal<k20.a> r5 = k20.C60958c.f173611a
            java.lang.Integer r5 = java.lang.Integer.valueOf(r10)
            r4.mo10233c(r5)
            java.lang.Object[] r24 = r4.mo10232b()
            java.lang.String r25 = "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyDetailUI"
            java.lang.String r26 = "updateTopLinkArea"
            java.lang.String r27 = "(Lcom/tencent/mm/protocal/protobuf/RedPacketStoryInfo;)V"
            java.lang.String r28 = "android/view/View_EXEC_"
            java.lang.String r29 = "setVisibility"
            java.lang.String r30 = "(I)V"
            r23 = r3
            j20.C117292a.m165358d(r23, r24, r25, r26, r27, r28, r29, r30)
            r5 = 0
            java.lang.Object r4 = r4.mo10231a(r5)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            r3.setVisibility(r4)
            java.lang.String r24 = "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyDetailUI"
            java.lang.String r25 = "updateTopLinkArea"
            java.lang.String r26 = "(Lcom/tencent/mm/protocal/protobuf/RedPacketStoryInfo;)V"
            java.lang.String r27 = "android/view/View_EXEC_"
            java.lang.String r28 = "setVisibility"
            java.lang.String r29 = "(I)V"
            j20.C117292a.m165359e(r23, r24, r25, r26, r27, r28, r29)
            android.view.View r3 = r1.f199808H1
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            android.widget.RelativeLayout$LayoutParams r3 = (android.widget.RelativeLayout.LayoutParams) r3
            androidx.appcompat.app.AppCompatActivity r4 = r31.getContext()
            r5 = 28
            int r4 = kg3.C76577a.m92151b(r4, r5)
            r3.topMargin = r4
            android.view.View r4 = r1.f199808H1
            r4.setLayoutParams(r3)
            if (r0 != 0) goto L_0x073b
            java.lang.String r0 = "redPacket info is null "
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)
            goto L_0x084f
        L_0x073b:
            java.lang.String r3 = r0.f228192w
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
            if (r3 != 0) goto L_0x084f
            r3 = 1
            java.lang.Object[] r4 = new java.lang.Object[r3]
            int r3 = r0.f228182j
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r5 = 0
            r4[r5] = r3
            java.lang.String r3 = "info.action_type:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r3, r4)
            android.view.View r3 = r1.f199810I1
            k20.a r4 = new k20.a
            r4.<init>()
            r4.mo10233c(r6)
            java.lang.Object[] r24 = r4.mo10232b()
            java.lang.String r25 = "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyDetailUI"
            java.lang.String r26 = "updateTopLinkArea"
            java.lang.String r27 = "(Lcom/tencent/mm/protocal/protobuf/RedPacketStoryInfo;)V"
            java.lang.String r28 = "android/view/View_EXEC_"
            java.lang.String r29 = "setVisibility"
            java.lang.String r30 = "(I)V"
            r23 = r3
            j20.C117292a.m165358d(r23, r24, r25, r26, r27, r28, r29, r30)
            r5 = 0
            java.lang.Object r4 = r4.mo10231a(r5)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            r3.setVisibility(r4)
            java.lang.String r24 = "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyDetailUI"
            java.lang.String r25 = "updateTopLinkArea"
            java.lang.String r26 = "(Lcom/tencent/mm/protocal/protobuf/RedPacketStoryInfo;)V"
            java.lang.String r27 = "android/view/View_EXEC_"
            java.lang.String r28 = "setVisibility"
            java.lang.String r29 = "(I)V"
            j20.C117292a.m165359e(r23, r24, r25, r26, r27, r28, r29)
            java.lang.String r3 = r0.f228193x
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
            if (r3 != 0) goto L_0x079f
            r3 = 1
            f32.C75675d.f222282h = r3
            r3 = 0
            goto L_0x07a4
        L_0x079f:
            r3 = 0
            f32.C75675d.f222282h = r3
            f32.C75675d.f222283i = r15
        L_0x07a4:
            java.lang.String r4 = r0.f228173A
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)
            if (r4 != 0) goto L_0x07cf
            com.tencent.mm.pluginsdk.ui.applet.CdnImageView r4 = r1.f199814K1
            r4.setVisibility(r3)
            boolean r3 = com.tencent.p014mm.p136ui.C85875k4.m106211z()
            if (r3 == 0) goto L_0x07c7
            java.lang.String r3 = r0.f228174B
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
            if (r3 != 0) goto L_0x07c7
            com.tencent.mm.pluginsdk.ui.applet.CdnImageView r3 = r1.f199814K1
            java.lang.String r4 = r0.f228174B
            r3.setUrl(r4)
            goto L_0x07d6
        L_0x07c7:
            com.tencent.mm.pluginsdk.ui.applet.CdnImageView r3 = r1.f199814K1
            java.lang.String r4 = r0.f228173A
            r3.setUrl(r4)
            goto L_0x07d6
        L_0x07cf:
            com.tencent.mm.pluginsdk.ui.applet.CdnImageView r3 = r1.f199814K1
            r4 = 8
            r3.setVisibility(r4)
        L_0x07d6:
            java.lang.String r3 = r0.f228195z
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
            if (r3 != 0) goto L_0x07e6
            android.widget.TextView r3 = r1.f199816L1
            java.lang.String r4 = r0.f228195z
            r3.setText(r4)
            goto L_0x07ee
        L_0x07e6:
            android.widget.TextView r3 = r1.f199816L1
            r4 = 2131832394(0x7f112e4a, float:1.929784E38)
            r3.setText(r4)
        L_0x07ee:
            android.widget.TextView r3 = r1.f199812J1
            java.lang.String r4 = r0.f228192w
            r19 = 0
            int r20 = r4.length()
            com.tencent.mm.wallet_core.ui.q r5 = new com.tencent.mm.wallet_core.ui.q
            com.tencent.mm.plugin.luckymoney.ui.s r6 = new com.tencent.mm.plugin.luckymoney.ui.s
            r6.<init>(r1, r0)
            r7 = 1
            r5.<init>((com.tencent.p014mm.wallet_core.p137ui.C7092q.C7093a) r6, (boolean) r7)
            androidx.appcompat.app.AppCompatActivity r22 = r31.getContext()
            r17 = r3
            r18 = r4
            r21 = r5
            com.tencent.p014mm.wallet_core.p137ui.C75228t.m90253j0(r17, r18, r19, r20, r21, r22)
            int r3 = r0.f228182j
            if (r3 != r10) goto L_0x084f
            org.json.JSONObject r3 = new org.json.JSONObject
            r3.<init>()
            java.lang.String r4 = "red_cover_id"
            java.lang.String r5 = r0.f228186q     // Catch:{ all -> 0x0831 }
            r3.put(r4, r5)     // Catch:{ all -> 0x0831 }
            java.lang.String r4 = "finderusername"
            java.lang.String r0 = r0.f228184o     // Catch:{ all -> 0x0831 }
            r3.put(r4, r0)     // Catch:{ all -> 0x0831 }
            java.lang.String r0 = "red_cover_type"
            r4 = 1
            r3.put(r0, r4)     // Catch:{ all -> 0x082f }
            r5 = 0
            goto L_0x083d
        L_0x082f:
            r0 = move-exception
            goto L_0x0833
        L_0x0831:
            r0 = move-exception
            r4 = 1
        L_0x0833:
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r5 = 0
            r4[r5] = r0
            java.lang.String r0 = "jump finder error, "
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r2, r0, r4)
        L_0x083d:
            java.lang.Class<ht1.t1> r0 = ht1.C60200t1.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            ht1.t1 r0 = (ht1.C60200t1) r0
            ht1.z4 r0 = r0.mo76861l7()
            r2 = 0
            java.lang.String r4 = "red_cover_link"
            r0.mo83788g6(r4, r5, r3, r2)
        L_0x084f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.luckymoney.p073ui.LuckyMoneyDetailUI.mo95565Y7(te3.rp3):void");
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    public boolean enableActivityAnimation() {
        return false;
    }

    public void finish() {
        if (getIntent().hasExtra("key_realname_guide_helper")) {
            Bundle bundle = new Bundle();
            bundle.putString("realname_verify_process_jump_activity", ".ui.LuckyMoneyDetailUI");
            bundle.putString("realname_verify_process_jump_plugin", "luckymoney");
            boolean a = ((RealnameGuideHelper) getIntent().getParcelableExtra("key_realname_guide_helper")).mo99370a(this, bundle, new C69375h(), (C79148e.C79149a) null);
            getIntent().removeExtra("key_realname_guide_helper");
            if (!a) {
                super.finish();
            }
        } else {
            super.finish();
        }
        overridePendingTransition(C0966R.C0968anim.f2496ek, C0966R.C0968anim.f2506eu);
    }

    public int getLayoutId() {
        return C0966R.C0971layout.b9j;
    }

    public void initView() {
        this.f199794A1 = new C72506r(this);
        setMMTitle("");
        mo95517H7();
        this.f199806G1 = (ImageView) findViewById(C0966R.C0970id.k6q);
        ImageView imageView = (ImageView) findViewById(C0966R.C0970id.k6i);
        this.f199804F1 = imageView;
        imageView.post(new C69381o());
        this.f199804F1.setOnClickListener(new C69382p());
        RecyclerView recyclerView = (RecyclerView) findViewById(C0966R.C0970id.gdh);
        this.f199869h = recyclerView;
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext(), 1, false));
        this.f199807H = LayoutInflater.from(this).inflate(C0966R.C0971layout.b9i, this.f199869h, false);
        this.f199903u = LayoutInflater.from(this).inflate(C0966R.C0971layout.b9g, this.f199869h, false);
        C69384q qVar = new C69384q(this, new C9500j() {
            public C60896i<?> getItemConvert(int i) {
                if (i == 2) {
                    return new C69393u();
                }
                return null;
            }
        }, this.f199864f1, false);
        this.f199853Z1 = qVar;
        qVar.mo85794V5(this.f199807H, 1, false);
        this.f199869h.setAdapter(this.f199853Z1);
        this.f199869h.mo17043c(this.f199818M1);
        this.f199872i = (ImageView) this.f199807H.findViewById(C0966R.C0970id.gdl);
        this.f199875j = (TextView) this.f199807H.findViewById(C0966R.C0970id.f358671ge3);
        this.f199828R0 = this.f199807H.findViewById(C0966R.C0970id.f358669ge1);
        this.f199887o = (ImageView) this.f199807H.findViewById(C0966R.C0970id.f358667gd3);
        this.f199884n = (TextView) this.f199807H.findViewById(C0966R.C0970id.ge6);
        this.f199819N = (RelativeLayout) this.f199807H.findViewById(C0966R.C0970id.gea);
        this.f199822P = (BaseEmojiView) this.f199807H.findViewById(C0966R.C0970id.ge7);
        this.f199824Q = (TextView) this.f199807H.findViewById(C0966R.C0970id.f358698gj2);
        this.f199827R = (LinearLayout) this.f199807H.findViewById(C0966R.C0970id.gfs);
        ProgressBar progressBar = (ProgressBar) this.f199807H.findViewById(C0966R.C0970id.f357919cg0);
        this.f199890p = this.f199807H.findViewById(C0966R.C0970id.gck);
        this.f199894q = (TextView) this.f199807H.findViewById(C0966R.C0970id.gcj);
        this.f199831S0 = (ViewGroup) this.f199807H.findViewById(C0966R.C0970id.gfi);
        this.f199834T0 = (TextView) this.f199807H.findViewById(C0966R.C0970id.gfj);
        this.f199837U0 = (ImageView) this.f199807H.findViewById(C0966R.C0970id.gfh);
        this.f199897r = this.f199807H.findViewById(C0966R.C0970id.gd6);
        this.f199899s = (TextView) this.f199807H.findViewById(C0966R.C0970id.gdz);
        this.f199901t = (CdnImageView) this.f199807H.findViewById(C0966R.C0970id.gd5);
        this.f199905v = (TextView) this.f199807H.findViewById(C0966R.C0970id.gcq);
        this.f199907w = this.f199807H.findViewById(C0966R.C0970id.gde);
        this.f199909x = this.f199807H.findViewById(C0966R.C0970id.gco);
        ImageView imageView2 = (ImageView) this.f199807H.findViewById(C0966R.C0970id.gcn);
        this.f199830S = (LinearLayout) this.f199807H.findViewById(C0966R.C0970id.gja);
        this.f199833T = (LinearLayout) this.f199807H.findViewById(C0966R.C0970id.gje);
        this.f199836U = (LinearLayout) this.f199807H.findViewById(C0966R.C0970id.gjh);
        this.f199848Y = (BaseEmojiView) this.f199807H.findViewById(C0966R.C0970id.gjb);
        this.f199851Z = (RelativeLayout) this.f199807H.findViewById(C0966R.C0970id.gjg);
        this.f199891p0 = (ImageView) this.f199807H.findViewById(C0966R.C0970id.gjc);
        this.f199912y = (ViewGroup) this.f199807H.findViewById(C0966R.C0970id.gcs);
        this.f199915z = this.f199807H.findViewById(C0966R.C0970id.gcr);
        this.f199793A = this.f199807H.findViewById(C0966R.C0970id.gct);
        this.f199795B = this.f199807H.findViewById(C0966R.C0970id.gcu);
        this.f199803F = (RelativeLayout) this.f199807H.findViewById(C0966R.C0970id.gco);
        this.f199805G = (ImageView) this.f199807H.findViewById(C0966R.C0970id.gcn);
        this.f199825Q0 = (ImageView) this.f199807H.findViewById(C0966R.C0970id.gjk);
        this.f199815L = (ViewGroup) findViewById(C0966R.C0970id.gey);
        this.f199808H1 = this.f199807H.findViewById(C0966R.C0970id.gdk);
        this.f199810I1 = this.f199807H.findViewById(C0966R.C0970id.m__);
        this.f199812J1 = (TextView) this.f199807H.findViewById(C0966R.C0970id.m_9);
        this.f199814K1 = (CdnImageView) this.f199807H.findViewById(C0966R.C0970id.o9d);
        this.f199816L1 = (TextView) this.f199807H.findViewById(C0966R.C0970id.o9e);
        this.f199824Q.setOnClickListener(new C69385r());
        this.f199910x0 = new C69554a(this);
        View inflate = getLayoutInflater().inflate(C0966R.C0971layout.b9n, (ViewGroup) null);
        this.f199913y0 = inflate;
        this.f199910x0.setContentView(inflate, new ViewGroup.LayoutParams(-1, -1));
        this.f199913y0.findViewById(C0966R.C0970id.ge_).setOnClickListener(new C69364a());
        this.f199910x0.f200845f = new C69365b();
        this.f199895q1 = (ViewGroup) this.f199913y0.findViewById(C0966R.C0970id.geb);
        if (C30699x0.m39154a() == null) {
            Log.m105928w("MicroMsg.LuckyMoneyDetailUI", "can't show correctly");
            finish();
            return;
        }
        ChatFooterPanel si02 = C30699x0.m39154a().si0(getContext());
        this.f199888o1 = si02;
        si02.setTalkerName(this.f199852Z0);
        this.f199888o1.setShowSmiley(false);
        this.f199888o1.setShowSmiley(true);
        this.f199901t.setUseSdcardCache(true);
        this.f199822P.setOnClickListener(new C69366c());
        EnvelopeAppBarLayout envelopeAppBarLayout = (EnvelopeAppBarLayout) findViewById(C0966R.C0970id.gek);
        this.f199840V0 = envelopeAppBarLayout;
        envelopeAppBarLayout.setActivityLifeCycle(this);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i != 1) {
            if (i == 2) {
                C75676e.m90932a(8);
            } else if (i == 1111) {
                if (i2 == -1) {
                    String stringExtra = intent != null ? intent.getStringExtra("gif_md5") : "";
                    if (!Util.isNullOrNil(stringExtra)) {
                        this.f199796B1 = 2;
                        mo95555O7(2, stringExtra);
                        mo95561U7("");
                        mo95556P7();
                    } else {
                        Log.m105924i("MicroMsg.LuckyMoneyDetailUI", "md5 == null go emoji capture failed!");
                    }
                } else {
                    Log.m105924i("MicroMsg.LuckyMoneyDetailUI", "go emoji capture failed!");
                }
            }
        } else if (i2 == -1 && intent != null) {
            String stringExtra2 = intent.getStringExtra("Select_Conv_User");
            if (!Util.isNullOrNil(stringExtra2)) {
                String str = this.f199858c1;
                if (str == null || !str.startsWith("wxpay://c2cbizmessagehandler/hongbao/festivalhongbao")) {
                    doSceneProgress(new C69245l2(stringExtra2.replaceAll(",", "|"), this.f199854a1, 1, "v1.0"));
                } else {
                    Log.m105924i("MicroMsg.LuckyMoneyDetailUI", "Not expected branch since 2015 fesitval");
                }
            }
        }
        super.onActivityResult(i, i2, intent);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v17, resolved type: te3.rp3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v22, resolved type: te3.qp3} */
    /* JADX WARNING: type inference failed for: r6v14 */
    /* JADX WARNING: type inference failed for: r6v40 */
    /* JADX WARNING: type inference failed for: r6v41 */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x01be */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x01de A[Catch:{ Exception -> 0x022a }] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x01fa A[Catch:{ Exception -> 0x022a }] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0209 A[Catch:{ Exception -> 0x022a }] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x020c A[Catch:{ Exception -> 0x022a }] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0272  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0280  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0303  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x030c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r19) {
        /*
            r18 = this;
            r1 = r18
            java.lang.String r2 = "MicroMsg.LuckyMoneyDetailUI"
            r0 = 109(0x6d, float:1.53E-43)
            r1.supportRequestWindowFeature(r0)
            r3 = 1
            r1.customfixStatusbar(r3)
            r4 = 0
            r1.f199661e = r4
            android.content.Intent r0 = r18.getIntent()
            java.lang.String r5 = "key_anim_slide"
            boolean r0 = r0.getBooleanExtra(r5, r4)
            if (r0 != 0) goto L_0x0025
            r0 = 2130772134(0x7f0100a6, float:1.7147378E38)
            r5 = 2130772058(0x7f01005a, float:1.7147224E38)
            r1.overridePendingTransition(r0, r5)
        L_0x0025:
            super.onCreate(r19)     // Catch:{ Exception -> 0x0417 }
            android.view.Window r0 = r18.getWindow()
            android.view.View r0 = r0.getDecorView()
            r5 = 1280(0x500, float:1.794E-42)
            r0.setSystemUiVisibility(r5)
            android.view.Window r0 = r18.getWindow()
            r5 = 2131099940(0x7f060124, float:1.7812247E38)
            r0.setBackgroundDrawableResource(r5)
            android.content.Intent r0 = r18.getIntent()
            java.lang.String r5 = "key_cropname"
            java.lang.String r0 = r0.getStringExtra(r5)
            r1.f199908w1 = r0
            android.content.Intent r0 = r18.getIntent()
            java.lang.String r5 = "key_material_flag"
            int r0 = r0.getIntExtra(r5, r4)
            r1.f199871h2 = r0
            android.content.Intent r0 = r18.getIntent()
            java.lang.String r5 = "key_hk_flag"
            int r0 = r0.getIntExtra(r5, r4)
            r1.f199911x1 = r0
            android.content.Intent r0 = r18.getIntent()
            java.lang.String r6 = "key_from"
            int r0 = r0.getIntExtra(r6, r4)
            r1.f199877j2 = r0
            android.content.Intent r0 = r18.getIntent()
            java.lang.String r6 = "key_live_id"
            java.lang.String r0 = r0.getStringExtra(r6)
            r1.f199879k2 = r0
            android.content.Intent r0 = r18.getIntent()
            java.lang.String r6 = "key_live_attach"
            java.lang.String r0 = r0.getStringExtra(r6)
            r1.f199881l2 = r0
            android.content.Intent r0 = r18.getIntent()
            java.lang.String r6 = "key_live_anchor_type"
            int r0 = r0.getIntExtra(r6, r4)
            r1.f199798C1 = r0
            com.tencent.mm.ui.MMActivityController r0 = r18.getController()
            r0.f348087a0 = r4
            android.content.res.Resources r0 = r18.getResources()
            r6 = 2131101688(0x7f0607f8, float:1.7815793E38)
            int r0 = r0.getColor(r6)
            r1.setActionbarColor(r0)
            r18.hideActionbarLine()
            android.content.Intent r0 = r18.getIntent()
            java.lang.String r6 = "key_lucky_money_can_received"
            boolean r0 = r0.getBooleanExtra(r6, r4)
            r1.f199906v1 = r0
            android.content.Intent r0 = r18.getIntent()     // Catch:{ Exception -> 0x00cc }
            java.lang.String r6 = "key_lucky_intercept_win_after"
            java.lang.String r0 = r0.getStringExtra(r6)     // Catch:{ Exception -> 0x00cc }
            org.json.JSONObject r6 = new org.json.JSONObject     // Catch:{ Exception -> 0x00cc }
            r6.<init>(r0)     // Catch:{ Exception -> 0x00cc }
            com.tencent.mm.plugin.wallet_core.utils.h r0 = com.tencent.p014mm.plugin.wallet_core.utils.C72501h.m84833a(r6)     // Catch:{ Exception -> 0x00cc }
            r1.f199916z1 = r0     // Catch:{ Exception -> 0x00cc }
            goto L_0x00cd
        L_0x00cc:
        L_0x00cd:
            android.content.Intent r0 = r18.getIntent()
            java.lang.String r6 = "key_username"
            java.lang.String r0 = r0.getStringExtra(r6)
            r1.f199852Z0 = r0
            android.content.Intent r0 = r18.getIntent()
            r6 = 1002(0x3ea, float:1.404E-42)
            java.lang.String r7 = "scene_id"
            int r0 = r0.getIntExtra(r7, r6)
            r1.f199914y1 = r0
            android.content.Intent r0 = r18.getIntent()
            java.lang.String r6 = "key_sendid"
            java.lang.String r0 = r0.getStringExtra(r6)
            r1.f199854a1 = r0
            android.content.Intent r0 = r18.getIntent()
            java.lang.String r6 = "key_native_url"
            java.lang.String r0 = r0.getStringExtra(r6)
            r1.f199856b1 = r0
            android.content.Intent r0 = r18.getIntent()
            java.lang.String r6 = "key_jump_from"
            r7 = 2
            int r0 = r0.getIntExtra(r6, r7)
            r1.f199849Y0 = r0
            android.content.Intent r0 = r18.getIntent()
            java.lang.String r6 = "key_process_content"
            java.lang.String r0 = r0.getStringExtra(r6)
            r1.f199870h1 = r0
            android.content.Intent r0 = r18.getIntent()
            r8 = 0
            java.lang.String r6 = "key_msgid"
            long r8 = r0.getLongExtra(r6, r8)
            r1.f199873i1 = r8
            android.content.Intent r0 = r18.getIntent()
            java.lang.String r6 = "key_packet_id"
            java.lang.String r0 = r0.getStringExtra(r6)
            r1.f199857b2 = r0
            com.tencent.p014mm.plugin.luckymoney.story.C69313d0.f199589g = r0
            android.content.Intent r0 = r18.getIntent()
            java.lang.String r8 = "key_detail_envelope_url"
            java.lang.String r0 = r0.getStringExtra(r8)
            r1.f199861d2 = r0
            android.content.Intent r0 = r18.getIntent()
            java.lang.String r8 = "key_detail_envelope_md5"
            java.lang.String r0 = r0.getStringExtra(r8)
            r1.f199863e2 = r0
            android.content.Intent r0 = r18.getIntent()
            java.lang.String r8 = "key_detail_envelope_dynamic_url"
            java.lang.String r0 = r0.getStringExtra(r8)
            r1.f199865f2 = r0
            android.content.Intent r0 = r18.getIntent()
            java.lang.String r8 = "key_detail_envelope_dynamic_md5"
            java.lang.String r0 = r0.getStringExtra(r8)
            r1.f199868g2 = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r8 = "sendid="
            r0.append(r8)
            java.lang.String r8 = r1.f199854a1
            java.lang.String r8 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r8)
            r0.append(r8)
            java.lang.String r8 = ", nativeurl="
            r0.append(r8)
            java.lang.String r8 = r1.f199856b1
            java.lang.String r8 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r8)
            r0.append(r8)
            java.lang.String r8 = ", jumpFrom="
            r0.append(r8)
            int r8 = r1.f199849Y0
            r0.append(r8)
            java.lang.String r8 = ", packetId: "
            r0.append(r8)
            java.lang.String r8 = r1.f199857b2
            r0.append(r8)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)
            java.lang.String r0 = r1.f199854a1
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 == 0) goto L_0x01be
            java.lang.String r0 = r1.f199856b1
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 != 0) goto L_0x01be
            java.lang.String r0 = r1.f199856b1
            android.net.Uri r0 = android.net.Uri.parse(r0)
            java.lang.String r8 = "sendid"
            java.lang.String r0 = r0.getQueryParameter(r8)     // Catch:{ Exception -> 0x01be }
            r1.f199854a1 = r0     // Catch:{ Exception -> 0x01be }
        L_0x01be:
            android.content.Intent r0 = r18.getIntent()     // Catch:{ Exception -> 0x022a }
            java.lang.String r8 = "key_detail_emoji_md5"
            java.lang.String r0 = r0.getStringExtra(r8)     // Catch:{ Exception -> 0x022a }
            r1.f199882m1 = r0     // Catch:{ Exception -> 0x022a }
            android.content.Intent r0 = r18.getIntent()     // Catch:{ Exception -> 0x022a }
            java.lang.String r8 = "key_detail_emoji_type"
            int r0 = r0.getIntExtra(r8, r4)     // Catch:{ Exception -> 0x022a }
            r1.f199885n1 = r0     // Catch:{ Exception -> 0x022a }
            java.lang.String r0 = r1.f199882m1     // Catch:{ Exception -> 0x022a }
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)     // Catch:{ Exception -> 0x022a }
            if (r0 != 0) goto L_0x01ea
            com.tencent.mm.autogen.mmdata.rpt.RedEnvSendWithEmoticonClickStruct r0 = new com.tencent.mm.autogen.mmdata.rpt.RedEnvSendWithEmoticonClickStruct     // Catch:{ Exception -> 0x022a }
            r0.<init>()     // Catch:{ Exception -> 0x022a }
            r8 = 10
            r0.f194328d = r8     // Catch:{ Exception -> 0x022a }
            r0.mo86054n()     // Catch:{ Exception -> 0x022a }
        L_0x01ea:
            android.content.Intent r0 = r18.getIntent()     // Catch:{ Exception -> 0x022a }
            java.lang.String r8 = "key_emoji_switch"
            android.os.Parcelable r0 = r0.getParcelableExtra(r8)     // Catch:{ Exception -> 0x022a }
            com.tencent.mm.plugin.luckymoney.model.LuckyMoneyEmojiSwitch r0 = (com.tencent.p014mm.plugin.luckymoney.model.LuckyMoneyEmojiSwitch) r0     // Catch:{ Exception -> 0x022a }
            r1.f199898r1 = r0     // Catch:{ Exception -> 0x022a }
            if (r0 != 0) goto L_0x0201
            com.tencent.mm.plugin.luckymoney.model.LuckyMoneyEmojiSwitch r0 = new com.tencent.mm.plugin.luckymoney.model.LuckyMoneyEmojiSwitch     // Catch:{ Exception -> 0x022a }
            r0.<init>()     // Catch:{ Exception -> 0x022a }
            r1.f199898r1 = r0     // Catch:{ Exception -> 0x022a }
        L_0x0201:
            java.lang.String r0 = r1.f199854a1     // Catch:{ Exception -> 0x022a }
            com.tencent.mm.plugin.luckymoney.model.a0 r0 = f32.C75674c.m90929a(r0)     // Catch:{ Exception -> 0x022a }
            if (r0 == 0) goto L_0x020c
            r1.f199859c2 = r0     // Catch:{ Exception -> 0x022a }
            goto L_0x0246
        L_0x020c:
            android.content.Intent r0 = r18.getIntent()     // Catch:{ Exception -> 0x022a }
            java.lang.String r8 = "key_detail_info"
            byte[] r0 = r0.getByteArrayExtra(r8)     // Catch:{ Exception -> 0x022a }
            if (r0 == 0) goto L_0x0226
            com.tencent.mm.plugin.luckymoney.model.a0 r8 = new com.tencent.mm.plugin.luckymoney.model.a0     // Catch:{ Exception -> 0x022a }
            r8.<init>()     // Catch:{ Exception -> 0x022a }
            pe3.a r0 = r8.parseFrom(r0)     // Catch:{ Exception -> 0x022a }
            com.tencent.mm.plugin.luckymoney.model.a0 r0 = (com.tencent.p014mm.plugin.luckymoney.model.C69158a0) r0     // Catch:{ Exception -> 0x022a }
            r1.f199859c2 = r0     // Catch:{ Exception -> 0x022a }
            goto L_0x0246
        L_0x0226:
            r18.finish()     // Catch:{ Exception -> 0x022a }
            goto L_0x0246
        L_0x022a:
            r0 = move-exception
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "Parse LuckyMoneyDetail fail!"
            r8.append(r9)
            java.lang.String r0 = r0.getLocalizedMessage()
            r8.append(r0)
            java.lang.String r0 = r8.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r2, r0)
            r18.finish()
        L_0x0246:
            r0 = 2131314540(0x7f09476c, float:1.8247508E38)
            android.view.View r0 = r1.findViewById(r0)
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r1.f199839V = r0
            r0 = 2131314541(0x7f09476d, float:1.824751E38)
            android.view.View r0 = r1.findViewById(r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r1.f199842W = r0
            r0 = 2131314542(0x7f09476e, float:1.8247512E38)
            android.view.View r0 = r1.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1.f199845X = r0
            java.lang.String r0 = r1.f199852Z0
            boolean r0 = eb0.C45628s0.m50742G(r0)
            r8 = 8
            r9 = 3
            if (r0 == 0) goto L_0x0280
            java.lang.String r0 = "getRedpacketFissionEntrance：isFackUser return "
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)
            r1.f199802E1 = r4
            android.widget.LinearLayout r0 = r1.f199839V
            r0.setVisibility(r8)
            goto L_0x02fc
        L_0x0280:
            android.content.Intent r0 = r18.getIntent()
            java.lang.String r10 = "key_receive_envelope_widget_status_flag"
            r0.getIntExtra(r10, r4)
            android.content.Intent r0 = r18.getIntent()
            java.lang.String r10 = "key_receive_envelope_fission_info"
            java.lang.String r17 = r0.getStringExtra(r10)
            java.lang.Object[] r0 = new java.lang.Object[r3]
            r0[r4] = r17
            java.lang.String r10 = "getRedpacketFissionEntrance fissionInfo :%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r10, r0)
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r17)
            if (r0 == 0) goto L_0x02aa
            r1.f199802E1 = r4
            android.widget.LinearLayout r0 = r1.f199839V
            r0.setVisibility(r8)
            goto L_0x02fc
        L_0x02aa:
            android.content.Intent r0 = r18.getIntent()
            java.lang.String r12 = r0.getStringExtra(r6)
            java.lang.String r13 = r1.f199852Z0
            android.content.Intent r0 = r18.getIntent()
            java.lang.String r6 = "key_packet_create_time"
            int r14 = r0.getIntExtra(r6, r4)
            android.content.Intent r0 = r18.getIntent()
            java.lang.String r6 = "key_packet_source"
            int r15 = r0.getIntExtra(r6, r4)
            int r0 = r1.f199877j2
            if (r0 != r9) goto L_0x02cf
            r16 = 3
            goto L_0x02dc
        L_0x02cf:
            java.lang.String r0 = r1.f199852Z0
            boolean r0 = com.tencent.p014mm.storage.C72996z1.m85820U5(r0)
            if (r0 == 0) goto L_0x02da
            r16 = 2
            goto L_0x02dc
        L_0x02da:
            r16 = 1
        L_0x02dc:
            android.widget.LinearLayout r0 = r1.f199839V
            com.tencent.mm.plugin.luckymoney.ui.o0 r6 = new com.tencent.mm.plugin.luckymoney.ui.o0
            r6.<init>(r1)
            r0.post(r6)
            com.tencent.mm.plugin.luckymoney.model.d r0 = new com.tencent.mm.plugin.luckymoney.model.d
            r11 = r0
            r11.<init>(r12, r13, r14, r15, r16, r17)
            nr3.e r0 = r0.mo9225i()
            com.tencent.mm.plugin.luckymoney.ui.q0 r6 = new com.tencent.mm.plugin.luckymoney.ui.q0
            r6.<init>(r1)
            nr3.e r0 = r0.mo123062e(r6)
            r0.mo11397F(r1)
        L_0x02fc:
            r18.initView()
            com.tencent.mm.plugin.luckymoney.model.a0 r0 = r1.f199859c2
            if (r0 != 0) goto L_0x030c
            java.lang.String r0 = "lucky detail is null!!"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r2, r0)
            r18.finish()
            return
        L_0x030c:
            java.lang.String r0 = r0.f198957T
            com.tencent.mm.plugin.luckymoney.model.n2 r0 = com.tencent.p014mm.plugin.luckymoney.model.C69253n2.m81627a(r0)
            if (r0 == 0) goto L_0x0336
            te3.sf2 r6 = r0.f199287b
            if (r6 == 0) goto L_0x0336
            java.lang.String r6 = r1.f199857b2
            boolean r6 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r6)
            if (r6 == 0) goto L_0x0328
            te3.sf2 r6 = r0.f199287b
            java.lang.String r6 = r6.f228202f
            r1.f199857b2 = r6
            com.tencent.p014mm.plugin.luckymoney.story.C69313d0.f199589g = r6
        L_0x0328:
            java.lang.String r6 = r1.f199908w1
            boolean r6 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r6)
            if (r6 == 0) goto L_0x0336
            te3.sf2 r0 = r0.f199287b
            java.lang.String r0 = r0.f228200d
            r1.f199908w1 = r0
        L_0x0336:
            java.lang.String r0 = r1.f199852Z0
            boolean r0 = eb0.C45628s0.m50742G(r0)
            r6 = 0
            if (r0 == 0) goto L_0x0362
            java.lang.String r0 = "fetch preview story"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)
            long r10 = r1.f199873i1
            java.lang.Long r0 = java.lang.Long.valueOf(r10)
            if (r0 != 0) goto L_0x034f
            java.util.Map<java.lang.String, com.tencent.mm.plugin.luckymoney.model.a0> r0 = f32.C75674c.f222272a
            goto L_0x035a
        L_0x034f:
            java.util.Map<java.lang.Long, te3.qp3> r6 = f32.C75674c.f222274c
            java.util.HashMap r6 = (java.util.HashMap) r6
            java.lang.Object r0 = r6.get(r0)
            r6 = r0
            te3.qp3 r6 = (te3.C50994qp3) r6
        L_0x035a:
            if (r6 == 0) goto L_0x0399
            te3.rp3 r0 = r6.f140448g
            r1.mo95565Y7(r0)
            goto L_0x0399
        L_0x0362:
            java.lang.String r0 = r1.f199857b2
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 != 0) goto L_0x0396
            java.lang.String r0 = r1.f199857b2
            java.util.Map<java.lang.String, com.tencent.mm.plugin.luckymoney.model.a0> r8 = f32.C75674c.f222272a
            boolean r8 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r8 == 0) goto L_0x0375
            goto L_0x0380
        L_0x0375:
            java.util.Map<java.lang.String, te3.rp3> r6 = f32.C75674c.f222273b
            java.util.HashMap r6 = (java.util.HashMap) r6
            java.lang.Object r0 = r6.get(r0)
            r6 = r0
            te3.rp3 r6 = (te3.C77993rp3) r6
        L_0x0380:
            java.lang.Object[] r0 = new java.lang.Object[r3]
            if (r6 == 0) goto L_0x0386
            r8 = 1
            goto L_0x0387
        L_0x0386:
            r8 = 0
        L_0x0387:
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r8)
            r0[r4] = r8
            java.lang.String r8 = "has story info: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r8, r0)
            r1.mo95565Y7(r6)
            goto L_0x0399
        L_0x0396:
            r1.mo95565Y7(r6)
        L_0x0399:
            com.tencent.mm.plugin.luckymoney.model.a0 r0 = r1.f199859c2
            r1.mo95564X7(r0)
            android.content.Intent r0 = r18.getIntent()
            java.lang.String r6 = "play_sound"
            boolean r0 = r0.getBooleanExtra(r6, r4)
            if (r0 == 0) goto L_0x03b0
            r0 = 2131832339(0x7f112e13, float:1.929773E38)
            com.tencent.p014mm.plugin.luckymoney.p073ui.C115591q5.m162472a(r1, r0)
        L_0x03b0:
            android.content.Intent r0 = r18.getIntent()
            r0.getIntExtra(r5, r4)
            int r0 = r1.f199849Y0
            r5 = 4
            if (r0 == r5) goto L_0x03c8
            if (r0 != r7) goto L_0x03bf
            goto L_0x03c8
        L_0x03bf:
            if (r0 == r3) goto L_0x03c6
            if (r0 != r9) goto L_0x03c4
            goto L_0x03c6
        L_0x03c4:
            r0 = 0
            goto L_0x03c9
        L_0x03c6:
            r0 = 2
            goto L_0x03c9
        L_0x03c8:
            r0 = 1
        L_0x03c9:
            java.lang.String r5 = r1.f199852Z0
            b42.e r6 = new b42.e
            r6.<init>()
            java.lang.String r8 = r1.f199854a1
            r6.field_send_id = r8
            g32.b r8 = g32.C75846b.zx0()
            b42.f r8 = r8.Ax0()
            java.lang.String[] r9 = new java.lang.String[r4]
            boolean r8 = r8.get(r6, (java.lang.String[]) r9)
            java.lang.Object[] r9 = new java.lang.Object[r7]
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r8)
            r9[r4] = r10
            java.lang.String r10 = r1.f199854a1
            r9[r3] = r10
            java.lang.String r10 = "hasData： %s, sendid: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r2, r10, r9)
            if (r8 == 0) goto L_0x040a
            int r2 = r6.field_open_count
            if (r2 > 0) goto L_0x03fa
            r7 = 1
        L_0x03fa:
            int r2 = r2 + r3
            r6.field_open_count = r2
            g32.b r2 = g32.C75846b.zx0()
            b42.f r2 = r2.Ax0()
            java.lang.String[] r3 = new java.lang.String[r4]
            r2.update(r6, (java.lang.String[]) r3)
        L_0x040a:
            com.tencent.p014mm.plugin.luckymoney.story.C69313d0.f199583a = r0
            com.tencent.p014mm.plugin.luckymoney.story.C69313d0.f199584b = r5
            com.tencent.p014mm.plugin.luckymoney.story.C69313d0.f199585c = r7
            long r2 = android.os.SystemClock.elapsedRealtime()
            com.tencent.p014mm.plugin.luckymoney.story.C69313d0.f199588f = r2
            return
        L_0x0417:
            r0 = move-exception
            r3 = r0
            java.lang.Object[] r0 = new java.lang.Object[r4]
            java.lang.String r5 = ""
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r2, r3, r5, r0)
            android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            java.lang.String r2 = "inflate view failed"
            android.widget.Toast r0 = p910lj.C76701a.makeText((android.content.Context) r0, (java.lang.CharSequence) r2, (int) r4)
            r0.show()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.luckymoney.p073ui.LuckyMoneyDetailUI.onCreate(android.os.Bundle):void");
    }

    public boolean onCreatePanelMenu(int i, Menu menu) {
        boolean onCreatePanelMenu = super.onCreatePanelMenu(i, menu);
        TextView textView = (TextView) findViewById(C0966R.C0970id.f5424er);
        if (textView != null) {
            textView.setTextColor(getResources().getColor(C0966R.color.a2w));
        }
        return onCreatePanelMenu;
    }

    public void onDestroy() {
        super.onDestroy();
        int i = this.f199896q2;
        if (i == 1 || i == 2) {
            RedEnvSendWithEmoticonClickStruct redEnvSendWithEmoticonClickStruct = new RedEnvSendWithEmoticonClickStruct();
            redEnvSendWithEmoticonClickStruct.f194328d = 12;
            redEnvSendWithEmoticonClickStruct.mo86054n();
        }
        SoundPool soundPool = this.f199809I;
        if (soundPool != null) {
            soundPool.release();
            int i2 = 0;
            while (true) {
                int[] iArr = this.f199811J;
                if (i2 >= iArr.length) {
                    break;
                }
                this.f199809I.unload(iArr[i2]);
                i2++;
            }
        }
        if (this.f199888o1 != null) {
            Log.m105924i("MicroMsg.LuckyMoneyDetailUI", "commentfooter release");
            this.f199888o1.mo100196h();
            this.f199888o1.mo100200l();
            this.f199888o1.mo100189b();
        }
        ((C39833l0) C86312j.m106911c(C39833l0.class)).mo62465NG((C39833l0.C39834a) null);
        ((HashMap) C75674c.f222272a).clear();
        ((HashMap) C75674c.f222273b).clear();
        Log.m105925i("MicroMsg.LuckyMoneyEnvelopeExposureReport", "resetData：openId %s, coverId: %s bizName：%s clickJumpType：%s", C75675d.f222275a, C75675d.f222277c, C75675d.f222280f, Integer.valueOf(C75675d.f222281g));
        C75675d.f222275a = null;
        C75675d.f222276b = null;
        C75675d.f222277c = null;
        C75675d.f222280f = null;
        C75675d.f222279e = 0;
        C75675d.f222278d = 0;
        C75675d.f222281g = 0;
        C75675d.f222282h = 0;
        C75675d.f222283i = null;
        C69313d0.m81700a(1);
        C86709a0.m107529k().f251779b.mo123470p(697, this.f199893p2);
        Iterator it = ((HashSet) this.f199800D1).iterator();
        while (it.hasNext()) {
            C31519v2.m39436a().mo55989f((String) it.next());
        }
        ((HashSet) this.f199800D1).clear();
    }

    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (i != 4) {
            return super.onKeyUp(i, keyEvent);
        }
        C72501h hVar = this.f199916z1;
        if (hVar == null) {
            return super.onKeyUp(i, keyEvent);
        }
        if (!C72506r.m84838d(hVar)) {
            return super.onKeyUp(i, keyEvent);
        }
        this.f199794A1.mo99912b(this.f199916z1, new C69380n());
        this.f199916z1 = null;
        return true;
    }

    public void onKeyboardStateChanged() {
        super.onKeyboardStateChanged();
        Log.m105919d("MicroMsg.LuckyMoneyDetailUI", "keyboard changed: %s", Integer.valueOf(keyboardState()));
        keyboardState();
    }

    public void onPause() {
        super.onPause();
        ((C77570i) C86312j.m106911c(C77570i.class)).Ge0("LuckyMoneyDetailUI", this.f199883m2, Util.nowSecond());
    }

    public void onResume() {
        super.onResume();
        this.f199883m2 = Util.nowSecond();
        C78461f bounceView = getBounceView();
        if (bounceView != null) {
            ((NestedBounceView) bounceView).mo154638f(false);
        }
    }

    public boolean onSceneEnd(int i, int i2, String str, C117747y yVar) {
        Log.m105924i("MicroMsg.LuckyMoneyDetailUI", "onSceneEnd() errType:" + i + " errCode:" + i2 + " errMsg:" + str + " netsceneType:" + yVar.getType());
        if (!(yVar instanceof C69267u1)) {
            int i3 = 0;
            if (yVar instanceof C69206d2) {
                if (i == 0 && i2 == 0) {
                    C69206d2 d2Var = (C69206d2) yVar;
                    if (this.f199862e1 != null) {
                        while (true) {
                            if (i3 >= ((LinkedList) this.f199862e1).size()) {
                                break;
                            }
                            C69236j1 j1Var = (C69236j1) ((LinkedList) this.f199862e1).get(i3);
                            if (j1Var.f199217i.equalsIgnoreCase(d2Var.f199132h)) {
                                j1Var.f199216h = d2Var.f199133i;
                                this.f199853Z1.notifyDataSetChanged();
                                break;
                            }
                            i3++;
                        }
                    }
                    return true;
                }
                C76879j.m92726T(this, str);
                return true;
            } else if (!(yVar instanceof C69245l2)) {
                return false;
            } else {
                if (i == 0 && i2 == 0) {
                    C75026b.m89951a(this, getString(C0966R.string.fjh));
                    return true;
                }
                C76879j.m92726T(this, str);
                return true;
            }
        } else if (i == 0 && i2 == 0) {
            C69267u1 u1Var = (C69267u1) yVar;
            C69158a0 a0Var = u1Var.f199337h;
            this.f199870h1 = u1Var.f199338i;
            this.f199882m1 = u1Var.f199339j;
            this.f199885n1 = u1Var.f199340n;
            this.f199898r1 = u1Var.f199341o;
            this.f199859c2 = a0Var;
            mo95564X7(a0Var);
            return true;
        } else {
            C76879j.m92726T(this, str);
            return true;
        }
    }

    public void superImportUIComponents(HashSet<Class<? extends UIComponent>> hashSet) {
        super.superImportUIComponents(hashSet);
        hashSet.add(C69386s.class);
    }
}
