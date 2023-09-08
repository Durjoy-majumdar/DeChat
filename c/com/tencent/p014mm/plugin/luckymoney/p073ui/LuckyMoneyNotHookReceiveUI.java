package com.tencent.p014mm.plugin.luckymoney.p073ui;

import a14.C0000n0;
import a14.C53930o0;
import ak1.C0074h0;
import ak1.C54090i0;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Rect;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.widget.C103733h;
import b63.C67186g0;
import c42.C28496a;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.api.IEmojiInfo;
import com.tencent.p014mm.autogen.mmdata.rpt.RedEnvSendWithEmoticonClickStruct;
import com.tencent.p014mm.emoji.view.BaseEmojiView;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.plugin.luckymoney.model.C69158a0;
import com.tencent.p014mm.plugin.luckymoney.model.C69198d0;
import com.tencent.p014mm.plugin.luckymoney.model.C69210e2;
import com.tencent.p014mm.plugin.luckymoney.model.C69237j2;
import com.tencent.p014mm.plugin.luckymoney.model.C69242l1;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.wallet_core.id_verify.util.RealnameGuideHelper;
import com.tencent.p014mm.plugin.wallet_core.utils.C43423i0;
import com.tencent.p014mm.plugin.wallet_core.utils.C72502o;
import com.tencent.p014mm.plugin.wallet_core.utils.C72506r;
import com.tencent.p014mm.pluginsdk.p133ui.applet.CdnImageView;
import com.tencent.p014mm.sdk.platformtools.BackwardSupportUtil;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.p014mm.wallet_core.model.C75121j;
import com.tencent.p014mm.wallet_core.model.C75142u0;
import com.tencent.p014mm.wallet_core.p137ui.C7089c0;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import d62.C75339i;
import di3.C86312j;
import eb0.C31519v2;
import eb0.C45628s0;
import eb0.C75592q0;
import eb0.C75597w2;
import f32.C75674c;
import f40.C86709a0;
import f40.C86737h0;
import fy3.C32227p;
import hp3.C87581a;
import ie3.C76324c;
import ie3.C76328d;
import ir3.C76371a;
import j20.C117292a;
import j61.C46435b;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;
import java.util.concurrent.CancellationException;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import lc3.C10485b;
import nj3.C76879j;
import nj3.C88989a;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C89132b;
import org.libpag.PAGView;
import p008bq.C0363p0;
import p008bq.C39833l0;
import p008bq.C67303a1;
import p204mr.C61568m;
import p281yz.C79173v;
import p680ru.C77570i;
import qo3.C89779i0;
import rx3.C13598b0;
import tc2.C118418g;
import te3.C101800k70;
import te3.C48685aa2;
import te3.C51365ta;
import te3.C52219z50;
import te3.C77935gl2;
import te3.C77994sf2;
import te3.C77999tf2;
import vo3.C90852c;
import w32.C78508b;
import zo3.C79405a;
import zt3.C119157j;

@C86737h0
@C88989a(7)
@C90852c(0)
/* renamed from: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNotHookReceiveUI */
public class LuckyMoneyNotHookReceiveUI extends LuckyMoneyBaseUI {

    /* renamed from: b1 */
    public static HashMap<String, C48685aa2> f200395b1 = new HashMap<>();

    /* renamed from: A */
    public View f200396A;

    /* renamed from: B */
    public View f200397B;

    /* renamed from: C */
    public PAGView f200398C;

    /* renamed from: D */
    public View f200399D;

    /* renamed from: E */
    public PAGView f200400E;

    /* renamed from: F */
    public PAGView.PAGViewListener f200401F;

    /* renamed from: G */
    public C0000n0 f200402G;

    /* renamed from: H */
    public ViewGroup f200403H;

    /* renamed from: I */
    public RelativeLayout f200404I;

    /* renamed from: J */
    public BaseEmojiView f200405J;

    /* renamed from: K */
    public TextView f200406K;

    /* renamed from: L */
    public LinearLayout f200407L;

    /* renamed from: M */
    public String f200408M;

    /* renamed from: N */
    public String f200409N;

    /* renamed from: P */
    public String f200410P;

    /* renamed from: Q */
    public C67186g0 f200411Q = null;

    /* renamed from: Q0 */
    public long f200412Q0;

    /* renamed from: R */
    public long f200413R;

    /* renamed from: R0 */
    public int f200414R0 = 0;

    /* renamed from: S */
    public IEmojiInfo f200415S;

    /* renamed from: S0 */
    public C69237j2 f200416S0;

    /* renamed from: T */
    public String f200417T;

    /* renamed from: T0 */
    public boolean f200418T0 = false;

    /* renamed from: U */
    public int f200419U;

    /* renamed from: U0 */
    public Set<String> f200420U0 = new HashSet();

    /* renamed from: V */
    public int f200421V;

    /* renamed from: V0 */
    public long f200422V0 = 0;

    /* renamed from: W */
    public String f200423W;

    /* renamed from: W0 */
    public C39833l0.C39834a f200424W0 = new C69454a();

    /* renamed from: X */
    public int f200425X;

    /* renamed from: X0 */
    public long f200426X0 = 0;

    /* renamed from: Y */
    public int f200427Y;

    /* renamed from: Y0 */
    public int f200428Y0 = 3;

    /* renamed from: Z */
    public String f200429Z;

    /* renamed from: Z0 */
    public int f200430Z0 = 0;

    /* renamed from: a1 */
    public C11385n f200431a1 = new C42535s();

    /* renamed from: g */
    public LinearLayout f200432g;

    /* renamed from: h */
    public ImageView f200433h;

    /* renamed from: i */
    public TextView f200434i;

    /* renamed from: j */
    public TextView f200435j;

    /* renamed from: n */
    public TextView f200436n;

    /* renamed from: o */
    public Button f200437o;

    /* renamed from: p */
    public ImageView f200438p;

    /* renamed from: p0 */
    public String f200439p0;

    /* renamed from: q */
    public View f200440q;

    /* renamed from: r */
    public ImageView f200441r;

    /* renamed from: s */
    public TextView f200442s;

    /* renamed from: t */
    public TextView f200443t;

    /* renamed from: u */
    public WeImageView f200444u;

    /* renamed from: v */
    public View f200445v;

    /* renamed from: w */
    public C89779i0 f200446w = null;

    /* renamed from: x */
    public ImageView f200447x;

    /* renamed from: x0 */
    public ResultReceiver f200448x0;

    /* renamed from: y */
    public ImageView f200449y;

    /* renamed from: y0 */
    public int f200450y0;

    /* renamed from: z */
    public ImageView f200451z;

    /* renamed from: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNotHookReceiveUI$i */
    public class C42533i implements C87581a<Object, C89132b.C89134c<C48685aa2>> {
        public C42533i() {
        }

        public Object call(Object obj) {
            C89132b.C89134c cVar = (C89132b.C89134c) obj;
            Log.m105925i("MicroMsg.LuckyMoneyNotHookReceiveUI", "do confirm errType: %s, errCode: %s", Integer.valueOf(cVar.f256793a), Integer.valueOf(cVar.f256794b));
            if (cVar.f256793a != 0 || cVar.f256794b != 0 || cVar.f256796d == null) {
                return null;
            }
            if (!Util.isNullOrNil(LuckyMoneyNotHookReceiveUI.this.f200408M)) {
                LuckyMoneyNotHookReceiveUI.f200395b1.put(LuckyMoneyNotHookReceiveUI.this.f200408M, (C48685aa2) cVar.f256796d);
            }
            LuckyMoneyNotHookReceiveUI.this.mo95706T7((C48685aa2) cVar.f256796d);
            C48685aa2 aa22 = (C48685aa2) cVar.f256796d;
            C28496a.m38227a(aa22.f130402i, aa22.f130403j);
            return null;
        }
    }

    /* renamed from: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNotHookReceiveUI$j */
    public class C42534j extends C7089c0 {

        /* renamed from: g */
        public final /* synthetic */ C48685aa2 f115086g;

        public C42534j(C48685aa2 aa22) {
            this.f115086g = aa22;
        }

        /* renamed from: a */
        public void mo2066a(View view) {
            C75228t.m90219L(LuckyMoneyNotHookReceiveUI.this.getContext(), this.f115086g.f130401h, true);
            C115669n.INSTANCE.mo160131h(22105, 3, 0, this.f115086g.f130406p);
        }
    }

    /* renamed from: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNotHookReceiveUI$s */
    public class C42535s implements C11385n {
        public C42535s() {
        }

        public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
            C51365ta B0;
            LinkedList<C101800k70> linkedList;
            if (Util.isEqual(yVar.getType(), 697) && (yVar instanceof C46435b)) {
                C46435b bVar = (C46435b) yVar;
                if (i == 0 && i2 == 0 && (B0 = bVar.mo71832B0()) != null && (linkedList = B0.f142064g) != null && linkedList.size() > 0 && Util.isEqual(B0.f142064g.get(0).f298586d, LuckyMoneyNotHookReceiveUI.this.f200415S.getMd5())) {
                    LuckyMoneyNotHookReceiveUI.this.mo95705S7(false);
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNotHookReceiveUI$a */
    public class C69454a implements C39833l0.C39834a {

        /* renamed from: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNotHookReceiveUI$a$a */
        public class C69455a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ IEmojiInfo f200453d;

            /* renamed from: e */
            public final /* synthetic */ boolean f200454e;

            /* renamed from: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNotHookReceiveUI$a$a$a */
            public class C69456a implements Runnable {
                public C69456a() {
                }

                public void run() {
                    IEmojiInfo iEmojiInfo;
                    C69455a aVar = C69455a.this;
                    if (aVar.f200453d != null && (iEmojiInfo = LuckyMoneyNotHookReceiveUI.this.f200415S) != null && iEmojiInfo.getMd5().equals(C69455a.this.f200453d.getMd5())) {
                        if (C69455a.this.f200454e) {
                            Log.m105924i("MicroMsg.LuckyMoneyNotHookReceiveUI", "somethings success.");
                            LuckyMoneyNotHookReceiveUI.this.f200415S = ((C67303a1) C86312j.m106911c(C67303a1.class)).mo55768r2(LuckyMoneyNotHookReceiveUI.this.f200415S.getMd5());
                            LuckyMoneyNotHookReceiveUI.this.f200407L.setVisibility(8);
                            LuckyMoneyNotHookReceiveUI.this.f200405J.setVisibility(0);
                            LuckyMoneyNotHookReceiveUI.this.getClass();
                            LuckyMoneyNotHookReceiveUI luckyMoneyNotHookReceiveUI = LuckyMoneyNotHookReceiveUI.this;
                            IEmojiInfo iEmojiInfo2 = luckyMoneyNotHookReceiveUI.f200415S;
                            luckyMoneyNotHookReceiveUI.f200430Z0 = 4;
                            luckyMoneyNotHookReceiveUI.f200405J.setEmojiInfo(iEmojiInfo2);
                            RedEnvSendWithEmoticonClickStruct redEnvSendWithEmoticonClickStruct = new RedEnvSendWithEmoticonClickStruct();
                            redEnvSendWithEmoticonClickStruct.f194328d = 8;
                            redEnvSendWithEmoticonClickStruct.mo86054n();
                            return;
                        }
                        Log.m105924i("MicroMsg.LuckyMoneyNotHookReceiveUI", "somethings error.");
                        LuckyMoneyNotHookReceiveUI.this.f200407L.setVisibility(8);
                        LuckyMoneyNotHookReceiveUI.this.f200406K.setVisibility(0);
                        LuckyMoneyNotHookReceiveUI.this.getClass();
                    }
                }
            }

            public C69455a(IEmojiInfo iEmojiInfo, boolean z) {
                this.f200453d = iEmojiInfo;
                this.f200454e = z;
            }

            public void run() {
                MMHandlerThread.postToMainThread(new C69456a());
            }
        }

        public C69454a() {
        }

        /* renamed from: a */
        public void mo62471a(boolean z, IEmojiInfo iEmojiInfo) {
            MMHandlerThread.postToMainThread(new C69455a(iEmojiInfo, z));
        }
    }

    /* renamed from: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNotHookReceiveUI$b */
    public class C69457b extends C7089c0 {

        /* renamed from: g */
        public final /* synthetic */ boolean f200457g;

        public C69457b(boolean z) {
            this.f200457g = z;
        }

        /* renamed from: a */
        public void mo2066a(View view) {
            if (this.f200457g) {
                C115669n nVar = C115669n.INSTANCE;
                Object[] objArr = new Object[5];
                objArr[0] = 6;
                int i = LuckyMoneyNotHookReceiveUI.this.f200416S0.f199256y;
                objArr[1] = Integer.valueOf(i == 1 ? 1 : i == 0 ? 2 : 0);
                objArr[2] = Integer.valueOf(LuckyMoneyNotHookReceiveUI.this.mo95699L7());
                objArr[3] = 0;
                objArr[4] = 1;
                nVar.mo160131h(11701, objArr);
            }
            Intent intent = new Intent();
            intent.setClass(LuckyMoneyNotHookReceiveUI.this.getContext(), LuckyMoneyBeforeDetailUI.class);
            intent.putExtra("key_native_url", LuckyMoneyNotHookReceiveUI.this.f200416S0.f199245n);
            intent.putExtra("key_sendid", LuckyMoneyNotHookReceiveUI.this.f200416S0.f199244j);
            intent.putExtra("key_lucky_money_can_received", true);
            intent.putExtra("key_username", LuckyMoneyNotHookReceiveUI.this.getIntent().getStringExtra("key_username"));
            intent.putExtra("key_from_username", LuckyMoneyNotHookReceiveUI.this.getIntent().getStringExtra("key_from_username"));
            intent.putExtra("scene_id", LuckyMoneyNotHookReceiveUI.this.f200425X);
            intent.putExtra("key_msgid", LuckyMoneyNotHookReceiveUI.this.f200413R);
            LuckyMoneyNotHookReceiveUI.this.mo95701N7(intent);
            LuckyMoneyNotHookReceiveUI luckyMoneyNotHookReceiveUI = LuckyMoneyNotHookReceiveUI.this;
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            LuckyMoneyNotHookReceiveUI luckyMoneyNotHookReceiveUI2 = luckyMoneyNotHookReceiveUI;
            C117292a.m165358d(luckyMoneyNotHookReceiveUI2, aVar.mo10232b(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNotHookReceiveUI$10", "onRealClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            luckyMoneyNotHookReceiveUI.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(luckyMoneyNotHookReceiveUI2, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNotHookReceiveUI$10", "onRealClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            LuckyMoneyNotHookReceiveUI.this.finish();
            LuckyMoneyNotHookReceiveUI.this.mo95703Q7(C54090i0.SEE_DETAIL, true);
        }
    }

    /* renamed from: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNotHookReceiveUI$c */
    public class C69458c implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C78508b f200459d;

        public C69458c(C78508b bVar) {
            this.f200459d = bVar;
        }

        public void run() {
            LuckyMoneyNotHookReceiveUI.this.doSceneProgress(this.f200459d, false);
        }
    }

    /* renamed from: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNotHookReceiveUI$d */
    public class C69459d implements C75121j {

        /* renamed from: a */
        public final /* synthetic */ C69210e2 f200461a;

        public C69459d(C69210e2 e2Var) {
            this.f200461a = e2Var;
        }

        /* renamed from: a */
        public void mo95711a() {
            LuckyMoneyNotHookReceiveUI luckyMoneyNotHookReceiveUI = LuckyMoneyNotHookReceiveUI.this;
            C69210e2 e2Var = this.f200461a;
            HashMap<String, C48685aa2> hashMap = LuckyMoneyNotHookReceiveUI.f200395b1;
            luckyMoneyNotHookReceiveUI.mo95700M7(e2Var);
        }
    }

    /* renamed from: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNotHookReceiveUI$e */
    public class C69460e implements C72506r.C72510d {

        /* renamed from: a */
        public final /* synthetic */ C69210e2 f200463a;

        public C69460e(C69210e2 e2Var) {
            this.f200463a = e2Var;
        }

        /* renamed from: a */
        public void mo95297a(C77935gl2 gl22) {
            if (gl22.f227479e == 2) {
                LuckyMoneyNotHookReceiveUI.this.showLoading();
                LuckyMoneyNotHookReceiveUI.this.mo95698K7(this.f200463a.f199161w);
                return;
            }
            LuckyMoneyNotHookReceiveUI.this.finish();
        }
    }

    /* renamed from: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNotHookReceiveUI$f */
    public class C69461f implements C32227p<C72502o.C72503a, Long, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ String f200465d;

        public C69461f(String str) {
            this.f200465d = str;
        }

        public Object invoke(Object obj, Object obj2) {
            C72502o.C72503a aVar = (C72502o.C72503a) obj;
            long longValue = ((Long) obj2).longValue();
            LuckyMoneyNotHookReceiveUI luckyMoneyNotHookReceiveUI = LuckyMoneyNotHookReceiveUI.this;
            if (longValue != luckyMoneyNotHookReceiveUI.f200422V0) {
                Log.m105920e("MicroMsg.LuckyMoneyNotHookReceiveUI", "unexpected halfpage callback");
                return C13598b0.f38549a;
            }
            luckyMoneyNotHookReceiveUI.f200422V0 = 0;
            if (aVar == C72502o.C72503a.Continue) {
                luckyMoneyNotHookReceiveUI.showLoading();
                LuckyMoneyNotHookReceiveUI.this.mo95698K7(this.f200465d);
            } else {
                luckyMoneyNotHookReceiveUI.finish();
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNotHookReceiveUI$g */
    public class C69462g implements DialogInterface.OnClickListener {
        public C69462g(LuckyMoneyNotHookReceiveUI luckyMoneyNotHookReceiveUI) {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNotHookReceiveUI$h */
    public class C69463h implements DialogInterface.OnClickListener {
        public C69463h() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            Log.m105924i("MicroMsg.LuckyMoneyNotHookReceiveUI", "click AlertDialog");
            LuckyMoneyNotHookReceiveUI.this.finish();
        }
    }

    /* renamed from: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNotHookReceiveUI$k */
    public class C69464k implements Animation.AnimationListener {

        /* renamed from: a */
        public final /* synthetic */ ViewGroup f200468a;

        public C69464k(ViewGroup viewGroup) {
            this.f200468a = viewGroup;
        }

        public void onAnimationEnd(Animation animation) {
            Rect rect = new Rect();
            this.f200468a.getGlobalVisibleRect(rect);
            if (rect.bottom >= C85875k4.m106186i(LuckyMoneyNotHookReceiveUI.this.getContext()).y) {
                Log.m105924i("MicroMsg.LuckyMoneyNotHookReceiveUI", "over bottom");
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f200468a.getLayoutParams();
                if (marginLayoutParams != null) {
                    marginLayoutParams.topMargin = C76371a.m91795a(16);
                    this.f200468a.setLayoutParams(marginLayoutParams);
                }
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) LuckyMoneyNotHookReceiveUI.this.f200444u.getLayoutParams();
                if (marginLayoutParams2 != null) {
                    marginLayoutParams2.topMargin = C76371a.m91795a(16);
                    LuckyMoneyNotHookReceiveUI.this.f200444u.setLayoutParams(marginLayoutParams2);
                }
            }
        }

        public void onAnimationRepeat(Animation animation) {
        }

        public void onAnimationStart(Animation animation) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNotHookReceiveUI$l */
    public class C69465l implements C75142u0.C75149e {

        /* renamed from: a */
        public final /* synthetic */ long f200470a;

        /* renamed from: b */
        public final /* synthetic */ View f200471b;

        /* renamed from: c */
        public final /* synthetic */ PAGView f200472c;

        /* renamed from: d */
        public final /* synthetic */ C77994sf2 f200473d;

        /* renamed from: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNotHookReceiveUI$l$a */
        public class C69466a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ String f200474d;

            /* renamed from: e */
            public final /* synthetic */ long f200475e;

            public C69466a(String str, long j) {
                this.f200474d = str;
                this.f200475e = j;
            }

            public void run() {
                C69198d0.f199107a.mo95357g(1, this.f200474d, C69465l.this.f200472c);
                C115669n.INSTANCE.mo160131h(28153, C69465l.this.f200473d.f228203g.f228260x, 1, 2, Long.valueOf(this.f200475e));
            }
        }

        public C69465l(long j, View view, PAGView pAGView, C77994sf2 sf22) {
            this.f200470a = j;
            this.f200471b = view;
            this.f200472c = pAGView;
            this.f200473d = sf22;
        }

        /* renamed from: a */
        public void mo95346a(C75142u0.C75143a aVar) {
            long currentTimeMillis = System.currentTimeMillis() - this.f200470a;
            if (aVar instanceof C75142u0.C75143a.C75145b) {
                String str = ((C75142u0.C75143a.C75145b) aVar).f221112a;
                Log.m105925i("MicroMsg.LuckyMoneyNotHookReceiveUI", "downloadComplete success，file path: %s", str);
                this.f200471b.postDelayed(new C69466a(str, currentTimeMillis), 170);
                return;
            }
            Log.m105925i("MicroMsg.LuckyMoneyNotHookReceiveUI", "downloadComplete failed，errorCode: %s", Integer.valueOf(((C75142u0.C75143a.C75144a) aVar).f221111a));
            View view = this.f200471b;
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar2.mo10233c(8);
            View view2 = view;
            C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNotHookReceiveUI$23", "downloadComplete", "(Lcom/tencent/mm/wallet_core/model/WalletPagDownloader$Result;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNotHookReceiveUI$23", "downloadComplete", "(Lcom/tencent/mm/wallet_core/model/WalletPagDownloader$Result;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            C115669n.INSTANCE.mo160131h(28153, this.f200473d.f228203g.f228260x, 2, 2, Long.valueOf(currentTimeMillis));
        }
    }

    /* renamed from: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNotHookReceiveUI$m */
    public class C69467m implements C75142u0.C75149e {

        /* renamed from: a */
        public final /* synthetic */ long f200477a;

        /* renamed from: b */
        public final /* synthetic */ View f200478b;

        /* renamed from: c */
        public final /* synthetic */ PAGView f200479c;

        /* renamed from: d */
        public final /* synthetic */ C77994sf2 f200480d;

        /* renamed from: e */
        public final /* synthetic */ View f200481e;

        /* renamed from: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNotHookReceiveUI$m$a */
        public class C69468a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ String f200482d;

            /* renamed from: e */
            public final /* synthetic */ long f200483e;

            public C69468a(String str, long j) {
                this.f200482d = str;
                this.f200483e = j;
            }

            public void run() {
                C69198d0.f199107a.mo95357g(1, this.f200482d, C69467m.this.f200479c);
                C115669n.INSTANCE.mo160131h(28153, C69467m.this.f200480d.f228203g.f228260x, 1, 2, Long.valueOf(this.f200483e));
            }
        }

        public C69467m(long j, View view, PAGView pAGView, C77994sf2 sf22, View view2) {
            this.f200477a = j;
            this.f200478b = view;
            this.f200479c = pAGView;
            this.f200480d = sf22;
            this.f200481e = view2;
        }

        /* renamed from: a */
        public void mo95346a(C75142u0.C75143a aVar) {
            long currentTimeMillis = System.currentTimeMillis() - this.f200477a;
            if (aVar instanceof C75142u0.C75143a.C75145b) {
                String str = ((C75142u0.C75143a.C75145b) aVar).f221112a;
                Log.m105925i("MicroMsg.LuckyMoneyNotHookReceiveUI", "downloadComplete success，file path: %s", str);
                this.f200478b.postDelayed(new C69468a(str, currentTimeMillis), 150);
                return;
            }
            Log.m105925i("MicroMsg.LuckyMoneyNotHookReceiveUI", "downloadComplete failed，errorCode: %s", Integer.valueOf(((C75142u0.C75143a.C75144a) aVar).f221111a));
            View view = this.f200481e;
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar2.mo10233c(8);
            View view2 = view;
            C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNotHookReceiveUI$24", "downloadComplete", "(Lcom/tencent/mm/wallet_core/model/WalletPagDownloader$Result;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNotHookReceiveUI$24", "downloadComplete", "(Lcom/tencent/mm/wallet_core/model/WalletPagDownloader$Result;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            C115669n.INSTANCE.mo160131h(28153, this.f200480d.f228203g.f228260x, 2, 2, Long.valueOf(currentTimeMillis));
        }
    }

    /* renamed from: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNotHookReceiveUI$n */
    public class C69469n extends C7089c0 {

        /* renamed from: g */
        public final /* synthetic */ C69210e2 f200485g;

        public C69469n(C69210e2 e2Var) {
            this.f200485g = e2Var;
        }

        /* renamed from: a */
        public void mo2066a(View view) {
            Intent intent = new Intent();
            RealnameGuideHelper realnameGuideHelper = this.f200485g.f199154p;
            if (realnameGuideHelper != null) {
                intent.putExtra("key_realname_guide_helper", realnameGuideHelper);
            }
            intent.setClass(LuckyMoneyNotHookReceiveUI.this.getContext(), LuckyMoneyBeforeDetailUI.class);
            intent.putExtra("key_lucky_money_can_received", true);
            intent.putExtra("key_native_url", this.f200485g.f199151j);
            intent.putExtra("key_sendid", this.f200485g.f199150i);
            intent.putExtra("key_username", LuckyMoneyNotHookReceiveUI.this.getIntent().getStringExtra("key_username"));
            intent.putExtra("key_from_username", LuckyMoneyNotHookReceiveUI.this.getIntent().getStringExtra("key_from_username"));
            intent.putExtra("scene_id", LuckyMoneyNotHookReceiveUI.this.f200425X);
            intent.putExtra("key_emoji_switch", this.f200485g.f199156r);
            intent.putExtra("key_detail_emoji_md5", this.f200485g.f199157s);
            intent.putExtra("key_detail_emoji_type", this.f200485g.f199158t);
            intent.putExtra("key_msgid", LuckyMoneyNotHookReceiveUI.this.f200413R);
            LuckyMoneyNotHookReceiveUI.this.mo95701N7(intent);
            LuckyMoneyNotHookReceiveUI luckyMoneyNotHookReceiveUI = LuckyMoneyNotHookReceiveUI.this;
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            LuckyMoneyNotHookReceiveUI luckyMoneyNotHookReceiveUI2 = luckyMoneyNotHookReceiveUI;
            C117292a.m165358d(luckyMoneyNotHookReceiveUI2, aVar.mo10232b(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNotHookReceiveUI$25", "onRealClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            luckyMoneyNotHookReceiveUI.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(luckyMoneyNotHookReceiveUI2, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNotHookReceiveUI$25", "onRealClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            LuckyMoneyNotHookReceiveUI.this.finish();
        }
    }

    /* renamed from: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNotHookReceiveUI$o */
    public class C69470o implements MenuItem.OnMenuItemClickListener {
        public C69470o() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            ResultReceiver resultReceiver = LuckyMoneyNotHookReceiveUI.this.f200448x0;
            if (resultReceiver != null) {
                resultReceiver.send(0, (Bundle) null);
            }
            LuckyMoneyNotHookReceiveUI.this.finish();
            return false;
        }
    }

    /* renamed from: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNotHookReceiveUI$p */
    public class C69471p extends C7089c0 {
        public C69471p() {
        }

        /* renamed from: a */
        public void mo2066a(View view) {
            ResultReceiver resultReceiver = LuckyMoneyNotHookReceiveUI.this.f200448x0;
            if (resultReceiver != null) {
                resultReceiver.send(0, (Bundle) null);
            }
            LuckyMoneyNotHookReceiveUI.this.finish();
            C115669n.INSTANCE.mo160131h(22105, 4, Long.valueOf(Util.ticksToNow(LuckyMoneyNotHookReceiveUI.this.f200412Q0) / 1000));
        }
    }

    /* renamed from: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNotHookReceiveUI$q */
    public class C69472q extends C7089c0 {
        public C69472q() {
        }

        /* renamed from: a */
        public void mo2066a(View view) {
            LuckyMoneyNotHookReceiveUI luckyMoneyNotHookReceiveUI = LuckyMoneyNotHookReceiveUI.this;
            HashMap<String, C48685aa2> hashMap = LuckyMoneyNotHookReceiveUI.f200395b1;
            luckyMoneyNotHookReceiveUI.mo95705S7(true);
        }
    }

    /* renamed from: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNotHookReceiveUI$r */
    public class C69473r implements DialogInterface.OnCancelListener {
        public C69473r() {
        }

        public void onCancel(DialogInterface dialogInterface) {
            C89779i0 i0Var = LuckyMoneyNotHookReceiveUI.this.f200446w;
            if (i0Var != null && i0Var.isShowing()) {
                LuckyMoneyNotHookReceiveUI.this.f200446w.dismiss();
            }
            LuckyMoneyNotHookReceiveUI.this.forceCancel();
            if (LuckyMoneyNotHookReceiveUI.this.getContentView().getVisibility() == 8 || LuckyMoneyNotHookReceiveUI.this.getContentView().getVisibility() == 4) {
                Log.m105924i("MicroMsg.LuckyMoneyNotHookReceiveUI", "user cancel & finish");
                LuckyMoneyNotHookReceiveUI.this.finish();
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNotHookReceiveUI$t */
    public class C69474t implements C75597w2.C31525a {

        /* renamed from: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNotHookReceiveUI$t$a */
        public class C69475a implements Runnable {
            public C69475a() {
            }

            public void run() {
                LuckyMoneyNotHookReceiveUI luckyMoneyNotHookReceiveUI = LuckyMoneyNotHookReceiveUI.this;
                ((HashSet) luckyMoneyNotHookReceiveUI.f200420U0).remove(luckyMoneyNotHookReceiveUI.f200416S0.f199257z);
                LuckyMoneyNotHookReceiveUI.this.f200416S0.f199246o = ((C75339i) C86312j.m106911c(C75339i.class)).getDisplayName(LuckyMoneyNotHookReceiveUI.this.f200416S0.f199257z);
                AppCompatActivity context = LuckyMoneyNotHookReceiveUI.this.getContext();
                LuckyMoneyNotHookReceiveUI luckyMoneyNotHookReceiveUI2 = LuckyMoneyNotHookReceiveUI.this;
                C69242l1.m81616v(context, luckyMoneyNotHookReceiveUI2.f200434i, luckyMoneyNotHookReceiveUI2.getString(C0966R.string.gju, new Object[]{luckyMoneyNotHookReceiveUI2.f200416S0.f199246o}));
            }
        }

        public C69474t() {
        }

        /* renamed from: a */
        public void mo1109a(String str, boolean z) {
            Log.m105927v("MicroMsg.LuckyMoneyParseHelper", "getContact suc, user: %s", str);
            if (z) {
                ((C119157j) C119157j.f356862d).mo183868B(new C69475a());
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNotHookReceiveUI$u */
    public class C69476u extends C7089c0 {
        public C69476u() {
        }

        /* renamed from: a */
        public void mo2066a(View view) {
            ((C76328d) C86312j.m106911c(C76328d.class)).mo106561my(LuckyMoneyNotHookReceiveUI.this, 10, 3);
            C115669n nVar = C115669n.INSTANCE;
            Object[] objArr = new Object[5];
            objArr[0] = 5;
            int i = LuckyMoneyNotHookReceiveUI.this.f200416S0.f199256y;
            objArr[1] = Integer.valueOf(i == 1 ? 1 : i == 0 ? 2 : 0);
            objArr[2] = Integer.valueOf(LuckyMoneyNotHookReceiveUI.this.mo95699L7());
            objArr[3] = 0;
            objArr[4] = 2;
            nVar.mo160131h(11701, objArr);
            Log.m105925i("MicroMsg.LuckyMoneyNotHookReceiveUI", "open btn click! mLiveId[%s]", LuckyMoneyNotHookReceiveUI.this.f200429Z);
            LuckyMoneyNotHookReceiveUI.this.f200437o.setClickable(false);
            LuckyMoneyNotHookReceiveUI.this.mo95703Q7(C54090i0.CLICK_OPEN_RED_PACKET, true);
            LuckyMoneyNotHookReceiveUI.this.mo95698K7("");
        }
    }

    /* renamed from: O7 */
    public static void m81872O7(C77994sf2 sf22, View view, PAGView pAGView, View view2, PAGView pAGView2, PAGView.PAGViewListener pAGViewListener, C0000n0 n0Var) {
        boolean z;
        C77994sf2 sf23 = sf22;
        View view3 = view;
        PAGView pAGView3 = pAGView;
        View view4 = view2;
        PAGView pAGView4 = pAGView2;
        C0000n0 n0Var2 = n0Var;
        C77999tf2 tf22 = sf23.f228203g;
        if (tf22 == null || Util.isNullOrNil(tf22.f228260x)) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNotHookReceiveUI", "renderEnvelopeDynamic", "(Lcom/tencent/mm/protocal/protobuf/HbEnvelopSource;Landroid/view/View;Lorg/libpag/PAGView;Landroid/view/View;Lorg/libpag/PAGView;Lorg/libpag/PAGView$PAGViewListener;Lkotlinx/coroutines/CoroutineScope;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNotHookReceiveUI", "renderEnvelopeDynamic", "(Lcom/tencent/mm/protocal/protobuf/HbEnvelopSource;Landroid/view/View;Lorg/libpag/PAGView;Landroid/view/View;Lorg/libpag/PAGView;Lorg/libpag/PAGView$PAGViewListener;Lkotlinx/coroutines/CoroutineScope;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(8);
            C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNotHookReceiveUI", "renderEnvelopeDynamic", "(Lcom/tencent/mm/protocal/protobuf/HbEnvelopSource;Landroid/view/View;Lorg/libpag/PAGView;Landroid/view/View;Lorg/libpag/PAGView;Lorg/libpag/PAGView$PAGViewListener;Lkotlinx/coroutines/CoroutineScope;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNotHookReceiveUI", "renderEnvelopeDynamic", "(Lcom/tencent/mm/protocal/protobuf/HbEnvelopSource;Landroid/view/View;Lorg/libpag/PAGView;Landroid/view/View;Lorg/libpag/PAGView;Lorg/libpag/PAGView$PAGViewListener;Lkotlinx/coroutines/CoroutineScope;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        int i = sf23.f228203g.f228242D;
        pAGView3.addListener(pAGViewListener);
        pAGView3.setRepeatCount(0);
        pAGView3.setScaleMode(3);
        pAGView2.addListener(pAGViewListener);
        pAGView4.setRepeatCount(0);
        pAGView4.setScaleMode(3);
        long currentTimeMillis = System.currentTimeMillis();
        if (i == 2) {
            C9556a aVar3 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar3.mo10233c(8);
            C117292a.m165358d(view, aVar3.mo10232b(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNotHookReceiveUI", "renderEnvelopeDynamic", "(Lcom/tencent/mm/protocal/protobuf/HbEnvelopSource;Landroid/view/View;Lorg/libpag/PAGView;Landroid/view/View;Lorg/libpag/PAGView;Lorg/libpag/PAGView$PAGViewListener;Lkotlinx/coroutines/CoroutineScope;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
            View view5 = view4;
            C117292a.m165359e(view, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNotHookReceiveUI", "renderEnvelopeDynamic", "(Lcom/tencent/mm/protocal/protobuf/HbEnvelopSource;Landroid/view/View;Lorg/libpag/PAGView;Landroid/view/View;Lorg/libpag/PAGView;Lorg/libpag/PAGView$PAGViewListener;Lkotlinx/coroutines/CoroutineScope;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            C69198d0.f199107a.mo95352b(sf23, 1, n0Var2, new C69465l(currentTimeMillis, view2, pAGView2, sf22));
            return;
        }
        C0000n0 n0Var3 = n0Var2;
        C9556a aVar4 = new C9556a();
        ThreadLocal<C9556a> threadLocal3 = C60958c.f173611a;
        aVar4.mo10233c(8);
        View view6 = view2;
        C0000n0 n0Var4 = n0Var3;
        C117292a.m165358d(view6, aVar4.mo10232b(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNotHookReceiveUI", "renderEnvelopeDynamic", "(Lcom/tencent/mm/protocal/protobuf/HbEnvelopSource;Landroid/view/View;Lorg/libpag/PAGView;Landroid/view/View;Lorg/libpag/PAGView;Lorg/libpag/PAGView$PAGViewListener;Lkotlinx/coroutines/CoroutineScope;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view4.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
        C117292a.m165359e(view6, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNotHookReceiveUI", "renderEnvelopeDynamic", "(Lcom/tencent/mm/protocal/protobuf/HbEnvelopSource;Landroid/view/View;Lorg/libpag/PAGView;Landroid/view/View;Lorg/libpag/PAGView;Lorg/libpag/PAGView$PAGViewListener;Lkotlinx/coroutines/CoroutineScope;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        float b = (float) C76577a.m92151b(MMApplicationContext.getContext(), 8);
        if (view3 == null) {
            z = true;
        } else {
            z = true;
            view3.setOutlineProvider(new C79405a(true, true, b));
        }
        if (view3 != null) {
            view3.setClipToOutline(z);
        }
        C69467m mVar = new C69467m(currentTimeMillis, view2, pAGView, sf22, view);
        C69198d0.f199107a.mo95352b(sf23, z ? 1 : 0, n0Var4, mVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0045, code lost:
        if (r3 <= r0) goto L_0x0022;
     */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0052  */
    /* renamed from: J7 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo95697J7() {
        /*
            r7 = this;
            f40.o r0 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r0 = r0.mo121142i()
            com.tencent.mm.storage.y1$a r1 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_WALLET_HB_GETTIMELIMITPROMOT_PERCENT_INT_SYNC
            r2 = 0
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            java.lang.Object r0 = r0.mo119685f(r1, r3)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            r1 = 1
            if (r0 > 0) goto L_0x001e
        L_0x001c:
            r0 = 0
            goto L_0x0048
        L_0x001e:
            r3 = 100
            if (r0 < r3) goto L_0x0024
        L_0x0022:
            r0 = 1
            goto L_0x0048
        L_0x0024:
            java.util.Random r3 = new java.util.Random
            r3.<init>()
            r4 = 101(0x65, float:1.42E-43)
            int r3 = r3.nextInt(r4)
            r4 = 2
            java.lang.Object[] r4 = new java.lang.Object[r4]
            java.lang.Integer r5 = java.lang.Integer.valueOf(r3)
            r4[r2] = r5
            java.lang.Integer r5 = java.lang.Integer.valueOf(r0)
            r4[r1] = r5
            java.lang.String r5 = "MicroMsg.GetTimeLimitPromotBlindBox"
            java.lang.String r6 = "random: %s, %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r6, r4)
            if (r3 > r0) goto L_0x001c
            goto L_0x0022
        L_0x0048:
            java.lang.String r3 = "MicroMsg.LuckyMoneyNotHookReceiveUI"
            if (r0 != 0) goto L_0x0052
            java.lang.String r0 = "random drop this time"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r0)
            return
        L_0x0052:
            java.util.HashMap<java.lang.String, te3.aa2> r0 = f200395b1
            java.lang.String r4 = r7.f200408M
            java.lang.Object r0 = r0.get(r4)
            te3.aa2 r0 = (te3.C48685aa2) r0
            if (r0 == 0) goto L_0x0068
            java.lang.String r1 = "use cache response this time"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r1)
            r7.mo95706T7(r0)
            return
        L_0x0068:
            android.content.Intent r0 = r7.getIntent()
            java.lang.String r4 = "key_packet_id"
            java.lang.String r0 = r0.getStringExtra(r4)
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r2] = r0
            java.lang.String r2 = "do get time limit promot: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r2, r1)
            com.tencent.mm.plugin.luckymoney.model.f r1 = new com.tencent.mm.plugin.luckymoney.model.f
            r1.<init>(r0)
            nr3.e r0 = r1.mo9225i()
            com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNotHookReceiveUI$i r1 = new com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNotHookReceiveUI$i
            r1.<init>()
            nr3.e r0 = r0.mo123062e(r1)
            r0.mo11397F(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.luckymoney.p073ui.LuckyMoneyNotHookReceiveUI.mo95697J7():void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v10, resolved type: com.tencent.mm.plugin.luckymoney.model.e2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v15, resolved type: w32.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v16, resolved type: com.tencent.mm.plugin.luckymoney.model.f2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v17, resolved type: com.tencent.mm.plugin.luckymoney.model.f2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v3, resolved type: com.tencent.mm.plugin.luckymoney.model.f2} */
    /* JADX WARNING: type inference failed for: r2v3, types: [ob0.y, com.tencent.mm.plugin.luckymoney.model.n1] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: K7 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo95698K7(java.lang.String r24) {
        /*
            r23 = this;
            r0 = r23
            if (r24 != 0) goto L_0x0008
            java.lang.String r1 = ""
            r12 = r1
            goto L_0x000a
        L_0x0008:
            r12 = r24
        L_0x000a:
            android.content.Intent r1 = r23.getIntent()
            java.lang.String r2 = "key_username"
            java.lang.String r1 = r1.getStringExtra(r2)
            int r2 = r0.f200425X
            boolean r2 = com.tencent.p014mm.plugin.luckymoney.model.C69242l1.m81608n(r2)
            if (r2 == 0) goto L_0x0044
            com.tencent.mm.plugin.luckymoney.model.f2 r2 = new com.tencent.mm.plugin.luckymoney.model.f2
            com.tencent.mm.plugin.luckymoney.model.j2 r3 = r0.f200416S0
            int r14 = r3.f199242h
            int r15 = r3.f199243i
            java.lang.String r4 = r3.f199244j
            java.lang.String r3 = r3.f199245n
            java.lang.String r18 = com.tencent.p014mm.plugin.luckymoney.model.C69242l1.m81601g()
            java.lang.String r19 = eb0.C75592q0.m90783m()
            com.tencent.mm.plugin.luckymoney.model.j2 r5 = r0.f200416S0
            java.lang.String r5 = r5.f199237P
            java.lang.String r21 = "v1.0"
            r13 = r2
            r16 = r4
            r17 = r3
            r20 = r1
            r22 = r5
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21, r22)
            goto L_0x00a1
        L_0x0044:
            int r2 = r0.f200427Y
            r3 = 3
            if (r2 != r3) goto L_0x0081
            android.content.Intent r2 = r23.getIntent()
            java.lang.String r3 = "key_live_id"
            java.lang.String r13 = r2.getStringExtra(r3)
            android.content.Intent r2 = r23.getIntent()
            java.lang.String r3 = "key_live_attach"
            java.lang.String r14 = r2.getStringExtra(r3)
            w32.b r16 = new w32.b
            com.tencent.mm.plugin.luckymoney.model.j2 r2 = r0.f200416S0
            int r3 = r2.f199242h
            int r4 = r2.f199243i
            java.lang.String r5 = r2.f199244j
            java.lang.String r6 = r2.f199245n
            java.lang.String r7 = com.tencent.p014mm.plugin.luckymoney.model.C69242l1.m81601g()
            java.lang.String r8 = eb0.C75592q0.m90783m()
            com.tencent.mm.plugin.luckymoney.model.j2 r2 = r0.f200416S0
            java.lang.String r11 = r2.f199237P
            int r15 = r0.f200450y0
            java.lang.String r10 = "v1.0"
            r2 = r16
            r9 = r1
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            goto L_0x00a1
        L_0x0081:
            com.tencent.mm.plugin.luckymoney.model.e2 r13 = new com.tencent.mm.plugin.luckymoney.model.e2
            com.tencent.mm.plugin.luckymoney.model.j2 r2 = r0.f200416S0
            int r3 = r2.f199242h
            int r4 = r2.f199243i
            java.lang.String r5 = r2.f199244j
            java.lang.String r6 = r2.f199245n
            java.lang.String r7 = com.tencent.p014mm.plugin.luckymoney.model.C69242l1.m81601g()
            java.lang.String r8 = eb0.C75592q0.m90783m()
            com.tencent.mm.plugin.luckymoney.model.j2 r2 = r0.f200416S0
            java.lang.String r11 = r2.f199237P
            java.lang.String r10 = "v1.0"
            r2 = r13
            r9 = r1
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
        L_0x00a1:
            boolean r1 = eb0.C45628s0.m50742G(r1)
            if (r1 == 0) goto L_0x00c2
            android.content.Intent r1 = r23.getIntent()
            java.lang.String r3 = "key_emoji_md5"
            java.lang.String r1 = r1.getStringExtra(r3)
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            r3 = r3 ^ 1
            com.tencent.mm.plugin.luckymoney.model.q0 r4 = new com.tencent.mm.plugin.luckymoney.model.q0
            r4.<init>(r3, r1)
            r2.f199285g = r4
            r1 = 2
            f32.C75676e.m90932a(r1)
        L_0x00c2:
            r1 = 0
            r0.doSceneProgress(r2, r1)
            android.widget.Button r1 = r0.f200437o
            r2 = 8
            r1.setVisibility(r2)
            android.widget.ImageView r1 = r0.f200438p
            com.tencent.mm.plugin.luckymoney.model.j2 r2 = r0.f200416S0
            int r2 = r2.f199256y
            com.tencent.p014mm.plugin.luckymoney.model.C69242l1.m81617w(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.luckymoney.p073ui.LuckyMoneyNotHookReceiveUI.mo95698K7(java.lang.String):void");
    }

    /* renamed from: L7 */
    public final int mo95699L7() {
        return C75592q0.m90789s().equals(this.f200410P) ? 1 : 0;
    }

    /* renamed from: M7 */
    public final void mo95700M7(C69210e2 e2Var) {
        C69210e2 e2Var2 = e2Var;
        Class cls = C79173v.class;
        C69158a0 a0Var = e2Var2.f199149h;
        if (a0Var.f198939A == 2) {
            Intent intent = new Intent();
            intent.setClass(getContext(), LuckyMoneyBeforeDetailUI.class);
            intent.putExtra("key_lucky_intercept_win_after", e2Var2.f199160v);
            intent.putExtra("key_lucky_money_can_received", true);
            try {
                C75674c.m90930b(this.f200408M, e2Var2.f199149h);
                intent.putExtra("key_jump_from", 2);
            } catch (Exception e) {
                Log.m105928w("MicroMsg.LuckyMoneyNotHookReceiveUI", "luckyMoneyDetail.toByteArray() fail! " + e.getLocalizedMessage());
            }
            intent.putExtra("key_native_url", e2Var2.f199151j);
            intent.putExtra("key_sendid", e2Var2.f199150i);
            mo95701N7(intent);
            if (((C10485b) C86709a0.m107533q(C10485b.class)).vh0().mo107404b("PlayCoinSound", 0) > 0) {
                intent.putExtra("play_sound", true);
            }
            RealnameGuideHelper realnameGuideHelper = e2Var2.f199154p;
            if (realnameGuideHelper != null) {
                intent.putExtra("key_realname_guide_helper", realnameGuideHelper);
            }
            intent.putExtra("key_username", getIntent().getStringExtra("key_username"));
            intent.putExtra("key_from_username", getIntent().getStringExtra("key_from_username"));
            intent.putExtra("scene_id", this.f200425X);
            intent.putExtra("key_emoji_switch", e2Var2.f199156r);
            intent.putExtra("key_detail_emoji_md5", e2Var2.f199157s);
            intent.putExtra("key_detail_emoji_type", e2Var2.f199158t);
            intent.putExtra("key_msgid", this.f200413R);
            intent.putExtra("scene_id", this.f200425X);
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            C117292a.m165358d(this, aVar.mo10232b(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNotHookReceiveUI", "openLuckyDetail", "(Lcom/tencent/mm/plugin/luckymoney/model/NetSceneOpenLuckyMoney;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(this, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNotHookReceiveUI", "openLuckyDetail", "(Lcom/tencent/mm/plugin/luckymoney/model/NetSceneOpenLuckyMoney;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            finish();
            String stringExtra = getIntent().getStringExtra("key_username");
            if (!C45628s0.m50742G(stringExtra)) {
                C67186g0 jo = ((C79173v) C86312j.m106911c(cls)).mo109172tc().mo105871jo(this.f200409N);
                if (jo == null) {
                    jo = new C67186g0();
                }
                jo.field_mNativeUrl = this.f200409N;
                jo.field_receiveAmount = a0Var.f198974q;
                jo.field_receiveTime = System.currentTimeMillis();
                jo.field_hbStatus = a0Var.f198965e;
                jo.field_receiveStatus = a0Var.f198939A;
                jo.field_sender = stringExtra;
                jo.field_sendId = this.f200408M;
                jo.field_exclusiveUsername = getIntent().getStringExtra("key_exclusive_username");
                if (jo.field_receiveAmount > 0) {
                    ((C79173v) C86312j.m106911c(cls)).mo109172tc().replace(jo);
                }
            }
            ResultReceiver resultReceiver = this.f200448x0;
            if (resultReceiver != null) {
                resultReceiver.send(-1, (Bundle) null);
                return;
            }
            return;
        }
        this.f200437o.setBackgroundResource(C0966R.C0969drawable.c88);
        this.f200437o.setText(C0966R.string.ghz);
        this.f200437o.setOnClickListener((View.OnClickListener) null);
        this.f200437o.setVisibility(8);
        this.f200438p.setVisibility(8);
        if (!Util.isNullOrNil(a0Var.f198950L)) {
            this.f200435j.setText(a0Var.f198950L);
            this.f200435j.setVisibility(0);
        } else {
            this.f200435j.setVisibility(8);
        }
        this.f200436n.setText(a0Var.f198966f);
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f200440q.getLayoutParams();
        layoutParams.bottomMargin = BackwardSupportUtil.BitmapFactory.fromDPToPix(getContext(), 30.0f);
        this.f200440q.setLayoutParams(layoutParams);
        if (C75592q0.m90789s().equals(this.f200410P) || a0Var.f198964d == 1) {
            View view = this.f200440q;
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar2.mo10233c(0);
            C117292a.m165358d(view, aVar2.mo10232b(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNotHookReceiveUI", "openLuckyDetail", "(Lcom/tencent/mm/plugin/luckymoney/model/NetSceneOpenLuckyMoney;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNotHookReceiveUI", "openLuckyDetail", "(Lcom/tencent/mm/plugin/luckymoney/model/NetSceneOpenLuckyMoney;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f200440q.setOnClickListener(new C69469n(e2Var2));
            this.f200441r.setVisibility(8);
        } else {
            View view2 = this.f200440q;
            C9556a aVar3 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar3.mo10233c(8);
            View view3 = view2;
            C117292a.m165358d(view3, aVar3.mo10232b(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNotHookReceiveUI", "openLuckyDetail", "(Lcom/tencent/mm/plugin/luckymoney/model/NetSceneOpenLuckyMoney;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
            C117292a.m165359e(view3, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNotHookReceiveUI", "openLuckyDetail", "(Lcom/tencent/mm/plugin/luckymoney/model/NetSceneOpenLuckyMoney;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f200441r.setVisibility(8);
        }
        if (a0Var.f198964d == 1 && a0Var.f198965e == 4 && !C69242l1.m81608n(this.f200425X) && this.f200427Y != 3) {
            mo95697J7();
        }
        ResultReceiver resultReceiver2 = this.f200448x0;
        if (resultReceiver2 != null) {
            resultReceiver2.send(1, (Bundle) null);
        }
    }

    /* renamed from: N7 */
    public final void mo95701N7(Intent intent) {
        intent.putExtra("key_detail_envelope_url", getIntent().getStringExtra("key_detail_envelope_url"));
        intent.putExtra("key_detail_envelope_md5", getIntent().getStringExtra("key_detail_envelope_md5"));
        intent.putExtra("key_detail_envelope_dynamic_url", getIntent().getStringExtra("key_detail_envelope_dynamic_url"));
        intent.putExtra("key_detail_envelope_dynamic_md5", getIntent().getStringExtra("key_detail_envelope_dynamic_md5"));
        intent.putExtra("key_about_url", getIntent().getStringExtra("key_about_url"));
        intent.putExtra("key_store_action_type", getIntent().getStringExtra("key_store_action_type"));
        intent.putExtra("key_story_url", getIntent().getStringExtra("key_story_url"));
        intent.putExtra("key_cropname", getIntent().getStringExtra("key_cropname"));
        intent.putExtra("key_packet_id", getIntent().getStringExtra("key_packet_id"));
        intent.putExtra("key_receive_envelope_widget_status_flag", getIntent().getIntExtra("key_receive_envelope_widget_status_flag", 0));
        intent.putExtra("key_receive_envelope_fission_info", getIntent().getStringExtra("key_receive_envelope_fission_info"));
        intent.putExtra("key_packet_create_time", getIntent().getIntExtra("key_packet_create_time", 0));
        intent.putExtra("key_packet_source", getIntent().getIntExtra("key_packet_source", 0));
        intent.putExtra("key_has_story", getIntent().getBooleanExtra("key_has_story", false));
        intent.putExtra("key_material_flag", this.f200421V);
        intent.putExtra("key_from", getIntent().getIntExtra("key_from", 0));
        intent.putExtra("key_live_id", getIntent().getStringExtra("key_live_id"));
        intent.putExtra("key_live_attach", getIntent().getStringExtra("key_live_attach"));
        intent.putExtra("key_live_anchor_type", getIntent().getIntExtra("key_live_anchor_type", 0));
    }

    /* renamed from: P7 */
    public final void mo95702P7() {
        Button button = this.f200437o;
        if (button != null) {
            C118418g.INSTANCE.mo175815dy(button.getId());
            String loadApplicationLanguage = LocaleUtil.loadApplicationLanguage(MMApplicationContext.getContext().getSharedPreferences(MMApplicationContext.getDefaultPreferencePath(), 0), MMApplicationContext.getContext());
            if (loadApplicationLanguage == null || loadApplicationLanguage.length() <= 0 || (!loadApplicationLanguage.equals("zh_CN") && !loadApplicationLanguage.equals("zh_TW") && !loadApplicationLanguage.equals("zh_HK"))) {
                this.f200437o.setBackgroundResource(C0966R.C0969drawable.aef);
                this.f200437o.setText(C0966R.string.f360994gi2);
            }
        }
    }

    /* renamed from: Q7 */
    public final void mo95703Q7(C54090i0 i0Var, boolean z) {
        Class cls = C61568m.class;
        if (!Util.isNullOrNil(this.f200429Z) && C86312j.m106911c(cls) != null) {
            ((C61568m) C86312j.m106911c(cls)).mo74893td(i0Var, C0074h0.UNKNOWN, z, 0);
        }
    }

    /* renamed from: R7 */
    public final void mo95704R7() {
        if (this.f200427Y == 3) {
            this.f200403H.setBackgroundResource(C0966R.C0969drawable.ae5);
            C85875k4.m106187i0(this, getResources().getColor(C0966R.color.UN_BW_0_Alpha_0_3));
            View findViewById = findViewById(C0966R.C0970id.gi5);
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            C117292a.m165358d(findViewById, aVar.mo10232b(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNotHookReceiveUI", "setActivityBg", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(findViewById, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNotHookReceiveUI", "setActivityBg", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else if (C85875k4.m106211z()) {
            this.f200403H.setBackgroundResource(C0966R.color.BW_0_Alpha_0_8);
            C85875k4.m106187i0(this, getResources().getColor(C0966R.color.BW_0_Alpha_0_8));
        } else {
            this.f200403H.setBackgroundResource(C0966R.color.f356950a32);
            C85875k4.m106187i0(this, getResources().getColor(C0966R.color.f356950a32));
        }
        View contentView = getContentView();
        C9556a aVar2 = new C9556a();
        ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
        aVar2.mo10233c(0);
        View view = contentView;
        C117292a.m165358d(view, aVar2.mo10232b(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNotHookReceiveUI", "setActivityBg", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        contentView.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNotHookReceiveUI", "setActivityBg", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    /* renamed from: S7 */
    public final void mo95705S7(boolean z) {
        Class cls = C39833l0.class;
        Log.m105925i("MicroMsg.LuckyMoneyNotHookReceiveUI", "showEmoji() circle:%s", Boolean.TRUE);
        this.f200406K.setVisibility(8);
        this.f200430Z0 = 1;
        if (z) {
            this.f200428Y0 = 3;
        } else {
            int i = this.f200428Y0 - 1;
            this.f200428Y0 = i;
            if (i == 0) {
                Log.m105924i("MicroMsg.LuckyMoneyNotHookReceiveUI", "showEmoji() circle fail!");
                this.f200407L.setVisibility(8);
                this.f200406K.setVisibility(0);
                this.f200430Z0 = 2;
                return;
            }
        }
        IEmojiInfo r2 = ((C67303a1) C86312j.m106911c(C67303a1.class)).mo55768r2(this.f200417T);
        this.f200415S = r2;
        if (r2 == null) {
            IEmojiInfo zE = ((C0363p0) C86312j.m106911c(C0363p0.class)).mo404zE();
            this.f200415S = zE;
            zE.setMd5(this.f200417T);
            this.f200415S.setType(this.f200419U);
        } else if (C86013q1.m106451l(r2.mo62640K1()) > 0 || this.f200415S.mo62678k() || this.f200415S.mo62637I0()) {
            this.f200405J.setVisibility(0);
            IEmojiInfo iEmojiInfo = this.f200415S;
            this.f200430Z0 = 4;
            this.f200405J.setEmojiInfo(iEmojiInfo);
            RedEnvSendWithEmoticonClickStruct redEnvSendWithEmoticonClickStruct = new RedEnvSendWithEmoticonClickStruct();
            redEnvSendWithEmoticonClickStruct.f194328d = 8;
            redEnvSendWithEmoticonClickStruct.mo86054n();
            return;
        }
        if (z) {
            this.f200405J.setVisibility(8);
            this.f200407L.setVisibility(0);
            ((C39833l0) C86312j.m106911c(cls)).mo62465NG(this.f200424W0);
        }
        ((C39833l0) C86312j.m106911c(cls)).mo62467VJ(this.f200415S);
        C86709a0.m107529k().f251779b.mo123455a(697, this.f200431a1);
    }

    /* renamed from: T7 */
    public final void mo95706T7(C48685aa2 aa22) {
        Class cls = C76324c.class;
        if (isFinishing() || isDestroyed()) {
            Log.m105924i("MicroMsg.LuckyMoneyNotHookReceiveUI", "the activity is finishing or destroyed.");
        } else if (aa22.f130397d) {
            Log.m105924i("MicroMsg.LuckyMoneyNotHookReceiveUI", "show envelope promo");
            ViewGroup viewGroup = (ViewGroup) findViewById(C0966R.C0970id.gi8);
            CdnImageView cdnImageView = (CdnImageView) viewGroup.findViewById(C0966R.C0970id.gi7);
            TextView textView = (TextView) viewGroup.findViewById(C0966R.C0970id.gi9);
            textView.setMaxWidth(C76577a.m92151b(getContext(), (((C76577a.m92152c(getContext(), C76577a.m92145A(getContext())) - 24) - 20) - 36) - 18));
            C75228t.m90240d(textView);
            cdnImageView.setRoundCorner(true);
            cdnImageView.setUrl(aa22.f130399f);
            textView.setText(aa22.f130398e);
            if (aa22.f130405o != null) {
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setShape(0);
                gradientDrawable.setCornerRadius((float) C76577a.m92151b(getContext(), 24));
                C52219z50 z502 = aa22.f130405o;
                long colorByMode = ((C76324c) C86312j.m106911c(cls)).getColorByMode(z502.f145706d, z502.f145707e);
                if (colorByMode != -1) {
                    gradientDrawable.setColor(C43423i0.m46930a(colorByMode));
                }
                viewGroup.setBackground(gradientDrawable);
            }
            if (aa22.f130404n != null) {
                C52219z50 z503 = aa22.f130404n;
                long colorByMode2 = ((C76324c) C86312j.m106911c(cls)).getColorByMode(z503.f145706d, z503.f145707e);
                if (colorByMode2 != -1) {
                    textView.setTextColor(C43423i0.m46930a(colorByMode2));
                }
            }
            viewGroup.setOnClickListener(new C42534j(aa22));
            viewGroup.setVisibility(0);
            Animation loadAnimation = AnimationUtils.loadAnimation(getContext(), C0966R.C0968anim.f2421cm);
            loadAnimation.setInterpolator(new DecelerateInterpolator());
            loadAnimation.setDuration(300);
            loadAnimation.setFillAfter(true);
            loadAnimation.setFillEnabled(true);
            Animation loadAnimation2 = AnimationUtils.loadAnimation(getContext(), C0966R.C0968anim.f2328p);
            loadAnimation2.setDuration(300);
            loadAnimation2.setFillEnabled(true);
            loadAnimation2.setFillAfter(true);
            AnimationSet animationSet = new AnimationSet(false);
            animationSet.addAnimation(loadAnimation);
            animationSet.addAnimation(loadAnimation2);
            viewGroup.startAnimation(animationSet);
            C115669n.INSTANCE.mo160131h(22105, 2, 0, aa22.f130406p);
            animationSet.setAnimationListener(new C69464k(viewGroup));
        }
    }

    public boolean enableActivityAnimation() {
        return false;
    }

    public void finish() {
        super.finish();
        overridePendingTransition(0, C0966R.C0968anim.f2390bt);
    }

    public int getLayoutId() {
        return C0966R.C0971layout.b_b;
    }

    public void initView() {
        this.f200445v = findViewById(C0966R.C0970id.gii);
        this.f200403H = (ViewGroup) findViewById(C0966R.C0970id.gif);
        this.f200432g = (LinearLayout) findViewById(C0966R.C0970id.f358699gj3);
        this.f200433h = (ImageView) findViewById(C0966R.C0970id.gig);
        this.f200434i = (TextView) findViewById(C0966R.C0970id.gih);
        this.f200435j = (TextView) findViewById(C0966R.C0970id.gij);
        this.f200436n = (TextView) findViewById(C0966R.C0970id.gim);
        this.f200404I = (RelativeLayout) findViewById(C0966R.C0970id.gea);
        this.f200405J = (BaseEmojiView) findViewById(C0966R.C0970id.ge7);
        this.f200406K = (TextView) findViewById(C0966R.C0970id.f358698gj2);
        this.f200407L = (LinearLayout) findViewById(C0966R.C0970id.gfs);
        ProgressBar progressBar = (ProgressBar) findViewById(C0966R.C0970id.f357919cg0);
        this.f200437o = (Button) findViewById(C0966R.C0970id.giq);
        this.f200438p = (ImageView) findViewById(C0966R.C0970id.gir);
        this.f200442s = (TextView) findViewById(C0966R.C0970id.gin);
        this.f200440q = findViewById(C0966R.C0970id.gio);
        this.f200441r = (ImageView) findViewById(C0966R.C0970id.gbu);
        this.f200447x = (ImageView) findViewById(C0966R.C0970id.gi_);
        this.f200449y = (ImageView) findViewById(C0966R.C0970id.gia);
        this.f200451z = (ImageView) findViewById(C0966R.C0970id.gib);
        this.f200396A = findViewById(C0966R.C0970id.m_d);
        this.f200397B = findViewById(C0966R.C0970id.f358695o14);
        this.f200398C = (PAGView) findViewById(C0966R.C0970id.f358694o13);
        this.f200399D = findViewById(C0966R.C0970id.o16);
        this.f200400E = (PAGView) findViewById(C0966R.C0970id.o15);
        this.f200443t = (TextView) findViewById(C0966R.C0970id.gis);
        WeImageView weImageView = (WeImageView) findViewById(C0966R.C0970id.gip);
        this.f200444u = weImageView;
        weImageView.setOnClickListener(new C69471p());
        if (this.f200427Y == 3) {
            this.f200444u.setEnableColorFilter(true);
            this.f200444u.setImageResource(C0966R.raw.icons_outlined_close2);
            this.f200444u.setIconColor(getResources().getColor(C0966R.color.f2975b6));
        } else {
            this.f200444u.setEnableColorFilter(false);
            this.f200444u.setImageResource(C0966R.C0969drawable.adn);
        }
        this.f200406K.setOnClickListener(new C69472q());
        this.f200435j.setLines(2);
        C103733h.m138106c(this.f200435j, 1);
        C76577a.m92155f(getContext(), C0966R.dimen.aed);
        C76577a.m92157h(getContext(), C0966R.dimen.aed);
        View contentView = getContentView();
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        View view = contentView;
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNotHookReceiveUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        contentView.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNotHookReceiveUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        showLoading();
        mo95702P7();
    }

    /* JADX WARNING: type inference failed for: r3v66, types: [ob0.y, com.tencent.mm.plugin.luckymoney.model.n1] */
    /* JADX WARNING: type inference failed for: r16v4, types: [com.tencent.mm.plugin.luckymoney.model.j2] */
    /* JADX WARNING: type inference failed for: r16v5, types: [w32.e] */
    /* JADX WARNING: type inference failed for: r16v6, types: [com.tencent.mm.plugin.luckymoney.model.k2] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r28) {
        /*
            r27 = this;
            r8 = r27
            java.lang.Class<kq.h> r0 = p185kq.C10383h.class
            java.lang.Class<l31.e> r1 = l31.C61212e.class
            r2 = 1
            r8.fixStatusbar(r2)
            super.onCreate(r28)
            android.view.Window r3 = r27.getWindow()
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r3.addFlags(r4)
            android.content.res.Resources r4 = r27.getResources()
            r5 = 2131101688(0x7f0607f8, float:1.7815793E38)
            int r4 = r4.getColor(r5)
            r3.setStatusBarColor(r4)
            long r3 = com.tencent.p014mm.sdk.platformtools.Util.currentTicks()
            r8.f200412Q0 = r3
            android.content.Intent r3 = r27.getIntent()
            java.lang.String r4 = "key_native_url"
            java.lang.String r3 = r3.getStringExtra(r4)
            r8.f200409N = r3
            android.content.Intent r3 = r27.getIntent()
            java.lang.String r5 = "key_cropname"
            r3.getStringExtra(r5)
            android.content.Intent r3 = r27.getIntent()
            java.lang.String r5 = "key_msgid"
            r6 = 0
            long r9 = r3.getLongExtra(r5, r6)
            r8.f200413R = r9
            android.content.Intent r3 = r27.getIntent()
            java.lang.String r9 = "key_material_flag"
            r10 = 0
            int r3 = r3.getIntExtra(r9, r10)
            r8.f200421V = r3
            android.content.Intent r3 = r27.getIntent()
            r9 = 1002(0x3ea, float:1.404E-42)
            java.lang.String r11 = "scene_id"
            int r3 = r3.getIntExtra(r11, r9)
            r8.f200425X = r3
            android.content.Intent r3 = r27.getIntent()
            java.lang.String r9 = "key_username"
            java.lang.String r3 = r3.getStringExtra(r9)
            r8.f200423W = r3
            android.content.Intent r3 = r27.getIntent()
            java.lang.String r12 = "key_from"
            int r3 = r3.getIntExtra(r12, r10)
            r8.f200427Y = r3
            android.content.Intent r3 = r27.getIntent()
            java.lang.String r12 = "key_live_id"
            java.lang.String r3 = r3.getStringExtra(r12)
            r8.f200429Z = r3
            android.content.Intent r3 = r27.getIntent()
            java.lang.String r13 = "key_live_attach"
            java.lang.String r3 = r3.getStringExtra(r13)
            r8.f200439p0 = r3
            android.content.Intent r3 = r27.getIntent()
            java.lang.String r14 = "key_open_result_receiver"
            android.os.Parcelable r3 = r3.getParcelableExtra(r14)
            android.os.ResultReceiver r3 = (android.os.ResultReceiver) r3
            r8.f200448x0 = r3
            android.content.Intent r3 = r27.getIntent()
            java.lang.String r14 = "key_live_anchor_type"
            int r3 = r3.getIntExtra(r14, r10)
            r8.f200450y0 = r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r14 = "nativeUrl= "
            r3.append(r14)
            java.lang.String r14 = r8.f200409N
            java.lang.String r14 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r14)
            r3.append(r14)
            java.lang.String r3 = r3.toString()
            java.lang.String r14 = "MicroMsg.LuckyMoneyNotHookReceiveUI"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r14, r3)
            r27.initView()
            java.lang.String r3 = r8.f200409N
            java.lang.String r3 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r3)
            android.net.Uri r3 = android.net.Uri.parse(r3)
            java.lang.String r15 = "sendid"
            java.lang.String r15 = r3.getQueryParameter(r15)     // Catch:{ Exception -> 0x00e4 }
            r8.f200408M = r15     // Catch:{ Exception -> 0x00e4 }
            goto L_0x00e5
        L_0x00e4:
        L_0x00e5:
            java.lang.Class<yz.v> r15 = p281yz.C79173v.class
            di3.d r15 = di3.C86312j.m106911c(r15)
            yz.v r15 = (p281yz.C79173v) r15
            e63.i r15 = r15.mo109172tc()
            java.lang.String r2 = r8.f200409N
            b63.g0 r2 = r15.mo105871jo(r2)
            r8.f200411Q = r2
            if (r2 == 0) goto L_0x01b7
            r15 = r11
            long r10 = r2.field_receiveAmount
            int r16 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r16 <= 0) goto L_0x01b7
            long r10 = r2.field_receiveTime
            long r10 = com.tencent.p014mm.sdk.platformtools.Util.milliSecondsToNow(r10)
            r16 = 86400000(0x5265c00, double:4.2687272E-316)
            int r2 = (r10 > r16 ? 1 : (r10 == r16 ? 0 : -1))
            if (r2 >= 0) goto L_0x01b7
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            b63.g0 r1 = r8.f200411Q
            long r1 = r1.field_receiveTime
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r2 = 0
            r0[r2] = r1
            java.lang.String r1 = r8.f200409N
            java.lang.String r1 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r1)
            r2 = 1
            r0[r2] = r1
            java.lang.String r1 = "use cache this item %s %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r14, r1, r0)
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            androidx.appcompat.app.AppCompatActivity r1 = r27.getContext()
            java.lang.Class<com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyBeforeDetailUI> r2 = com.tencent.p014mm.plugin.luckymoney.p073ui.LuckyMoneyBeforeDetailUI.class
            r0.setClass(r1, r2)
            b63.g0 r1 = r8.f200411Q
            java.lang.String r1 = r1.field_mNativeUrl
            r0.putExtra(r4, r1)
            java.lang.String r1 = r8.f200408M
            java.lang.String r2 = "key_sendid"
            r0.putExtra(r2, r1)
            java.lang.String r1 = "key_anim_slide"
            r2 = 1
            r0.putExtra(r1, r2)
            java.lang.String r1 = "key_lucky_money_can_received"
            r0.putExtra(r1, r2)
            android.content.Intent r1 = r27.getIntent()
            java.lang.String r1 = r1.getStringExtra(r9)
            r0.putExtra(r9, r1)
            android.content.Intent r1 = r27.getIntent()
            java.lang.String r2 = "key_from_username"
            java.lang.String r1 = r1.getStringExtra(r2)
            r0.putExtra(r2, r1)
            int r1 = r8.f200425X
            r2 = r15
            r0.putExtra(r2, r1)
            long r1 = r8.f200413R
            r0.putExtra(r5, r1)
            r8.mo95701N7(r0)
            k20.a r9 = new k20.a
            r9.<init>()
            r9.mo10233c(r0)
            java.lang.Object[] r1 = r9.mo10232b()
            java.lang.String r2 = "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNotHookReceiveUI"
            java.lang.String r3 = "onCreate"
            java.lang.String r4 = "(Landroid/os/Bundle;)V"
            java.lang.String r5 = "Undefined"
            java.lang.String r6 = "startActivity"
            java.lang.String r7 = "(Landroid/content/Intent;)V"
            r0 = r27
            j20.C117292a.m165358d(r0, r1, r2, r3, r4, r5, r6, r7)
            r0 = 0
            java.lang.Object r0 = r9.mo10231a(r0)
            android.content.Intent r0 = (android.content.Intent) r0
            r8.startActivity(r0)
            java.lang.String r1 = "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNotHookReceiveUI"
            java.lang.String r2 = "onCreate"
            java.lang.String r3 = "(Landroid/os/Bundle;)V"
            java.lang.String r4 = "Undefined"
            java.lang.String r5 = "startActivity"
            java.lang.String r6 = "(Landroid/content/Intent;)V"
            r0 = r27
            j20.C117292a.m165359e(r0, r1, r2, r3, r4, r5, r6)
            r27.finish()
            return
        L_0x01b7:
            java.lang.String r2 = r8.f200408M
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            r4 = 3
            if (r2 != 0) goto L_0x0285
            java.lang.String r2 = "channelid"
            java.lang.String r2 = r3.getQueryParameter(r2)
            r5 = 1
            int r18 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r2, (int) r5)
            java.lang.String r2 = "sendusername"
            java.lang.String r2 = r3.getQueryParameter(r2)
            r8.f200410P = r2
            android.content.Intent r2 = r27.getIntent()
            java.lang.String r2 = r2.getStringExtra(r9)
            int r3 = r8.f200425X
            boolean r3 = com.tencent.p014mm.plugin.luckymoney.model.C69242l1.m81608n(r3)
            java.lang.String r5 = "key_way"
            if (r3 == 0) goto L_0x0203
            com.tencent.mm.plugin.luckymoney.model.k2 r3 = new com.tencent.mm.plugin.luckymoney.model.k2
            r17 = 1
            java.lang.String r9 = r8.f200408M
            java.lang.String r10 = r8.f200409N
            android.content.Intent r11 = r27.getIntent()
            r12 = 0
            int r21 = r11.getIntExtra(r5, r12)
            java.lang.String r22 = "v1.0"
            r16 = r3
            r19 = r9
            r20 = r10
            r16.<init>(r17, r18, r19, r20, r21, r22)
            goto L_0x025a
        L_0x0203:
            int r3 = r8.f200427Y
            if (r3 != r4) goto L_0x023b
            android.content.Intent r3 = r27.getIntent()
            java.lang.String r24 = r3.getStringExtra(r12)
            android.content.Intent r3 = r27.getIntent()
            java.lang.String r25 = r3.getStringExtra(r13)
            w32.e r3 = new w32.e
            r17 = 1
            java.lang.String r9 = r8.f200408M
            java.lang.String r10 = r8.f200409N
            android.content.Intent r11 = r27.getIntent()
            r12 = 0
            int r21 = r11.getIntExtra(r5, r12)
            int r5 = r8.f200450y0
            java.lang.String r22 = "v1.0"
            r16 = r3
            r19 = r9
            r20 = r10
            r23 = r2
            r26 = r5
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            goto L_0x025a
        L_0x023b:
            com.tencent.mm.plugin.luckymoney.model.j2 r3 = new com.tencent.mm.plugin.luckymoney.model.j2
            r17 = 1
            java.lang.String r9 = r8.f200408M
            java.lang.String r10 = r8.f200409N
            android.content.Intent r11 = r27.getIntent()
            r12 = 0
            int r21 = r11.getIntExtra(r5, r12)
            java.lang.String r22 = "v1.0"
            r16 = r3
            r19 = r9
            r20 = r10
            r23 = r2
            r16.<init>(r17, r18, r19, r20, r21, r22, r23)
        L_0x025a:
            boolean r2 = eb0.C45628s0.m50742G(r2)
            if (r2 == 0) goto L_0x0278
            android.content.Intent r2 = r27.getIntent()
            java.lang.String r5 = "key_emoji_md5"
            java.lang.String r2 = r2.getStringExtra(r5)
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            r9 = 1
            r5 = r5 ^ r9
            com.tencent.mm.plugin.luckymoney.model.p0 r10 = new com.tencent.mm.plugin.luckymoney.model.p0
            r10.<init>(r5, r2)
            r3.f199285g = r10
            goto L_0x0279
        L_0x0278:
            r9 = 1
        L_0x0279:
            r2 = 0
            r8.doSceneProgress(r3, r2)
            qo3.i0 r3 = r8.f200446w
            if (r3 == 0) goto L_0x028f
            r3.show()
            goto L_0x028f
        L_0x0285:
            r2 = 0
            r9 = 1
            r27.finish()
            java.lang.String r3 = "sendid null & finish"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r14, r3)
        L_0x028f:
            com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNotHookReceiveUI$o r3 = new com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNotHookReceiveUI$o
            r3.<init>()
            r8.setBackBtn(r3)
            di3.d r3 = di3.C86312j.m106911c(r1)
            l31.e r3 = (l31.C61212e) r3
            o31.b r5 = o31.C11345b.LuckyMoneyNotHookReceiveUI
            l31.e r3 = r3.mo86178qr(r8, r5)
            o31.a r5 = o31.C76986a.FinderLive
            r3.mo86179qs(r8, r5)
            java.lang.String r3 = r8.f200408M
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
            if (r3 != 0) goto L_0x0388
            ak1.i0 r3 = ak1.C54090i0.EXPOSE_RED_PACKET_UI
            int r5 = r8.f200427Y
            if (r5 != r4) goto L_0x02b7
            r2 = 1
        L_0x02b7:
            r8.mo95703Q7(r3, r2)
            int r2 = r8.f200427Y
            if (r2 != r4) goto L_0x0388
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            java.lang.Class<kq.g> r3 = p185kq.C61130g.class
            di3.d r3 = di3.C86312j.m106911c(r3)
            kq.g r3 = (p185kq.C61130g) r3
            java.lang.String r3 = r3.mo33244gK()
            java.lang.String r4 = "comment_scene"
            r2.put(r4, r3)
            java.lang.String r3 = r8.f200423W
            java.lang.String r4 = "finder_username"
            r2.put(r4, r3)
            java.lang.String r3 = r8.f200429Z
            java.lang.String r4 = "live_id"
            r2.put(r4, r3)
            android.content.Intent r3 = r27.getIntent()
            java.lang.String r4 = "key_live_feed_id"
            java.lang.String r3 = r3.getStringExtra(r4)
            java.lang.String r4 = "feed_id"
            r2.put(r4, r3)
            android.content.Intent r3 = r27.getIntent()
            java.lang.String r4 = "key_live_session_buff"
            java.lang.String r3 = r3.getStringExtra(r4)
            java.lang.String r4 = "session_buffer"
            r2.put(r4, r3)
            android.content.Intent r3 = r27.getIntent()
            java.lang.String r4 = "key_live_start_time"
            long r3 = r3.getLongExtra(r4, r6)
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            java.lang.String r4 = "live_start_time"
            r2.put(r4, r3)
            android.content.Intent r3 = r27.getIntent()
            java.lang.String r4 = "key_live_now_live_time"
            long r3 = r3.getLongExtra(r4, r6)
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            java.lang.String r4 = "live_time"
            r2.put(r4, r3)
            android.content.Intent r3 = r27.getIntent()
            java.lang.String r4 = "key_live_enter_session_id"
            long r3 = r3.getLongExtra(r4, r6)
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            java.lang.String r4 = "enter_session_id"
            r2.put(r4, r3)
            java.lang.Class<h81.i> r3 = h81.C59774i.class
            di3.d r3 = di3.C86312j.m106911c(r3)
            h81.i r3 = (h81.C59774i) r3
            java.lang.String r3 = r3.mo84751Wb()
            java.lang.String r4 = "behaviour_session_id"
            r2.put(r4, r3)
            di3.d r3 = di3.C86312j.m106911c(r0)
            kq.h r3 = (p185kq.C10383h) r3
            java.lang.String r3 = r3.mo10696E()
            java.lang.String r4 = "finder_context_id"
            r2.put(r4, r3)
            di3.d r0 = di3.C86312j.m106911c(r0)
            kq.h r0 = (p185kq.C10383h) r0
            java.lang.String r0 = r0.mo10698S0()
            java.lang.String r3 = "finder_tab_context_id"
            r2.put(r3, r0)
            int r0 = r8.f200450y0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r3 = "cur_red_packet_source"
            r2.put(r3, r0)
            di3.d r0 = di3.C86312j.m106911c(r1)
            l31.e r0 = (l31.C61212e) r0
            r0.u70(r8, r2)
            di3.d r0 = di3.C86312j.m106911c(r1)
            l31.e r0 = (l31.C61212e) r0
            r1 = 4
            r2 = 25561(0x63d9, float:3.5819E-41)
            r0.mo86148No(r8, r1, r2)
        L_0x0388:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.luckymoney.p073ui.LuckyMoneyNotHookReceiveUI.onCreate(android.os.Bundle):void");
    }

    public void onDestroy() {
        super.onDestroy();
        int i = this.f200430Z0;
        if (i == 1 || i == 2) {
            RedEnvSendWithEmoticonClickStruct redEnvSendWithEmoticonClickStruct = new RedEnvSendWithEmoticonClickStruct();
            redEnvSendWithEmoticonClickStruct.f194328d = 9;
            redEnvSendWithEmoticonClickStruct.mo86054n();
        }
        C89779i0 i0Var = this.f200446w;
        if (i0Var != null && i0Var.isShowing()) {
            this.f200446w.dismiss();
        }
        ((C39833l0) C86312j.m106911c(C39833l0.class)).mo62465NG((C39833l0.C39834a) null);
        C86709a0.m107529k().f251779b.mo123470p(697, this.f200431a1);
        Iterator it = ((HashSet) this.f200420U0).iterator();
        while (it.hasNext()) {
            C31519v2.m39436a().mo55989f((String) it.next());
        }
        ((HashSet) this.f200420U0).clear();
        PAGView pAGView = this.f200398C;
        if (pAGView != null && pAGView.getVisibility() == 0) {
            this.f200398C.stop();
            this.f200398C.removeListener(this.f200401F);
        }
        PAGView pAGView2 = this.f200400E;
        if (pAGView2 != null && pAGView2.getVisibility() == 0) {
            this.f200400E.stop();
            this.f200400E.removeListener(this.f200401F);
        }
        this.f200401F = null;
        C75142u0 u0Var = C75142u0.f221103a;
        C0000n0 n0Var = this.f200402G;
        u0Var.getClass();
        if (n0Var != null) {
            C53930o0.m60556c(n0Var, (CancellationException) null);
        }
        this.f200402G = null;
    }

    public void onPause() {
        super.onPause();
        ((C77570i) C86312j.m106911c(C77570i.class)).Ge0("LuckyMoneyReceiveUI", this.f200426X0, Util.nowSecond());
    }

    public void onResume() {
        super.onResume();
        this.f200426X0 = Util.nowSecond();
    }

    /* JADX WARNING: type inference failed for: r0v133, types: [ob0.y] */
    /* JADX WARNING: type inference failed for: r23v8, types: [com.tencent.mm.plugin.luckymoney.model.u1] */
    /* JADX WARNING: type inference failed for: r16v10, types: [w32.d] */
    /* JADX WARNING: type inference failed for: r16v11, types: [com.tencent.mm.plugin.luckymoney.model.v1] */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x04a1, code lost:
        if (r5.f199250s != 4) goto L_0x04a5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x04aa, code lost:
        if (r5.f199250s == r12) goto L_0x04ac;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x0413  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x0423  */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x0485  */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x0497  */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x04b2  */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x0578  */
    /* JADX WARNING: Removed duplicated region for block: B:162:0x058d  */
    /* JADX WARNING: Removed duplicated region for block: B:204:0x0893  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x030b  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0327  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0338  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0348  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onSceneEnd(int r32, int r33, java.lang.String r34, ob0.C117747y r35) {
        /*
            r31 = this;
            r10 = r31
            r0 = r32
            r2 = r33
            r3 = r34
            r4 = r35
            java.lang.Class<l31.e> r1 = l31.C61212e.class
            java.lang.Class<d62.i> r5 = d62.C75339i.class
            java.lang.Class<yz.v> r6 = p281yz.C79173v.class
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "onSceneEnd() errType:"
            r7.append(r8)
            r7.append(r0)
            java.lang.String r8 = " errCode:"
            r7.append(r8)
            r7.append(r2)
            java.lang.String r8 = " errMsg:"
            r7.append(r8)
            r7.append(r3)
            java.lang.String r8 = " netsceneType:"
            r7.append(r8)
            int r8 = r35.getType()
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            java.lang.String r8 = "MicroMsg.LuckyMoneyNotHookReceiveUI"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r7)
            boolean r7 = r4 instanceof com.tencent.p014mm.plugin.luckymoney.model.C69237j2
            r9 = 0
            java.lang.Integer r11 = java.lang.Integer.valueOf(r9)
            r12 = 1
            java.lang.Integer r13 = java.lang.Integer.valueOf(r12)
            java.lang.String r14 = ""
            java.lang.String r15 = "key_username"
            r12 = 4
            if (r7 == 0) goto L_0x0915
            qo3.i0 r3 = r10.f200446w
            if (r3 == 0) goto L_0x0064
            boolean r3 = r3.isShowing()
            if (r3 == 0) goto L_0x0064
            qo3.i0 r3 = r10.f200446w
            r3.dismiss()
        L_0x0064:
            if (r0 != 0) goto L_0x0914
            if (r2 != 0) goto L_0x0914
            r0 = r4
            com.tencent.mm.plugin.luckymoney.model.j2 r0 = (com.tencent.p014mm.plugin.luckymoney.model.C69237j2) r0
            r10.f200416S0 = r0
            int r0 = r0.f199234L
            r10.f200414R0 = r0
            com.tencent.mm.plugin.report.service.n r0 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r2 = 11701(0x2db5, float:1.6397E-41)
            r3 = 5
            java.lang.Object[] r4 = new java.lang.Object[r3]
            java.lang.Integer r7 = java.lang.Integer.valueOf(r3)
            r4[r9] = r7
            com.tencent.mm.plugin.luckymoney.model.j2 r7 = r10.f200416S0
            int r7 = r7.f199256y
            r3 = 1
            if (r7 != r3) goto L_0x0087
            r7 = 1
            goto L_0x008c
        L_0x0087:
            if (r7 != 0) goto L_0x008b
            r7 = 2
            goto L_0x008c
        L_0x008b:
            r7 = 0
        L_0x008c:
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r4[r3] = r7
            int r3 = r31.mo95699L7()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r7 = 2
            r4[r7] = r3
            r3 = 3
            r4[r3] = r11
            r4[r12] = r13
            r0.mo160131h(r2, r4)
            di3.d r2 = di3.C86312j.m106911c(r6)
            yz.v r2 = (p281yz.C79173v) r2
            e63.i r2 = r2.mo109172tc()
            java.lang.String r4 = r10.f200409N
            b63.g0 r2 = r2.mo105871jo(r4)
            if (r2 != 0) goto L_0x00bc
            b63.g0 r2 = new b63.g0
            r2.<init>()
        L_0x00bc:
            java.lang.String r4 = r10.f200409N
            r2.field_mNativeUrl = r4
            com.tencent.mm.plugin.luckymoney.model.j2 r4 = r10.f200416S0
            int r7 = r4.f199256y
            r2.field_hbType = r7
            int r7 = r4.f199250s
            r2.field_hbStatus = r7
            int r4 = r4.f199251t
            r2.field_receiveStatus = r4
            java.lang.String r4 = r10.f200408M
            r2.field_sendId = r4
            java.lang.String r4 = r10.f200423W
            r2.field_sender = r4
            di3.d r4 = di3.C86312j.m106911c(r6)
            yz.v r4 = (p281yz.C79173v) r4
            e63.i r4 = r4.mo109172tc()
            r4.replace(r2)
            com.tencent.mm.plugin.luckymoney.model.j2 r2 = r10.f200416S0
            int r4 = r2.f199251t
            r6 = -1
            r7 = 2
            if (r4 != r7) goto L_0x0159
            int r0 = r10.f200425X
            boolean r0 = com.tencent.p014mm.plugin.luckymoney.model.C69242l1.m81608n(r0)
            if (r0 == 0) goto L_0x010c
            com.tencent.mm.plugin.luckymoney.model.v1 r0 = new com.tencent.mm.plugin.luckymoney.model.v1
            java.lang.String r1 = r10.f200408M
            r18 = 11
            r19 = 0
            java.lang.String r2 = r10.f200409N
            java.lang.String r21 = "v1.0"
            java.lang.String r22 = ""
            r16 = r0
            r17 = r1
            r20 = r2
            r16.<init>(r17, r18, r19, r20, r21, r22)
            goto L_0x014b
        L_0x010c:
            int r0 = r10.f200427Y
            if (r0 != r3) goto L_0x0135
            w32.d r0 = new w32.d
            java.lang.String r1 = r10.f200408M
            r18 = 11
            r19 = 0
            java.lang.String r2 = r10.f200409N
            java.lang.String r3 = r10.f200429Z
            java.lang.String r4 = r10.f200439p0
            int r5 = r10.f200450y0
            java.lang.String r21 = "v1.0"
            java.lang.String r22 = ""
            r16 = r0
            r17 = r1
            r20 = r2
            r23 = r3
            r24 = r4
            r25 = r5
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25)
            goto L_0x014b
        L_0x0135:
            com.tencent.mm.plugin.luckymoney.model.u1 r0 = new com.tencent.mm.plugin.luckymoney.model.u1
            java.lang.String r1 = r10.f200408M
            r25 = 11
            r26 = 0
            java.lang.String r2 = r10.f200409N
            java.lang.String r28 = "v1.0"
            r23 = r0
            r24 = r1
            r27 = r2
            r23.<init>(r24, r25, r26, r27, r28)
        L_0x014b:
            r10.doSceneProgress(r0, r9)
            android.os.ResultReceiver r0 = r10.f200448x0
            if (r0 == 0) goto L_0x0156
            r1 = 0
            r0.send(r6, r1)
        L_0x0156:
            r1 = 1
            goto L_0x0913
        L_0x0159:
            java.lang.String r2 = r2.f199235M
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r2 != 0) goto L_0x016d
            com.tencent.mm.autogen.mmdata.rpt.RedEnvSendWithEmoticonClickStruct r2 = new com.tencent.mm.autogen.mmdata.rpt.RedEnvSendWithEmoticonClickStruct
            r2.<init>()
            r6 = 7
            r2.f194328d = r6
            r2.mo86054n()
        L_0x016d:
            com.tencent.mm.plugin.luckymoney.model.j2 r2 = r10.f200416S0
            int r4 = r2.f199223A
            r6 = 8
            r7 = 1
            if (r4 != r7) goto L_0x017c
            android.widget.ImageView r2 = r10.f200433h
            r2.setVisibility(r6)
            goto L_0x0185
        L_0x017c:
            android.widget.ImageView r4 = r10.f200433h
            java.lang.String r7 = r2.f199248q
            java.lang.String r2 = r2.f199257z
            com.tencent.p014mm.plugin.luckymoney.model.C69242l1.m81595a(r4, r7, r2)
        L_0x0185:
            android.content.Intent r2 = r31.getIntent()
            java.lang.String r2 = r2.getStringExtra(r15)
            int r4 = r10.f200425X
            boolean r4 = com.tencent.p014mm.plugin.luckymoney.model.C69242l1.m81608n(r4)
            r7 = 2131832559(0x7f112eef, float:1.9298175E38)
            if (r4 == 0) goto L_0x0219
            boolean r4 = eb0.C45628s0.m50742G(r2)
            if (r4 == 0) goto L_0x01ce
            com.tencent.mm.plugin.luckymoney.model.j2 r4 = r10.f200416S0
            java.lang.String r4 = r4.f199257z
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)
            if (r4 != 0) goto L_0x01c4
            com.tencent.mm.plugin.luckymoney.model.j2 r4 = r10.f200416S0
            java.lang.String r4 = r4.f199246o
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)
            if (r4 == 0) goto L_0x01c4
            com.tencent.mm.plugin.luckymoney.model.j2 r4 = r10.f200416S0
            di3.d r5 = di3.C86312j.m106911c(r5)
            d62.i r5 = (d62.C75339i) r5
            com.tencent.mm.plugin.luckymoney.model.j2 r7 = r10.f200416S0
            java.lang.String r7 = r7.f199257z
            java.lang.String r5 = r5.getDisplayName(r7)
            r4.f199246o = r5
        L_0x01c4:
            android.widget.TextView r4 = r10.f200434i
            com.tencent.mm.plugin.luckymoney.model.j2 r5 = r10.f200416S0
            java.lang.String r5 = r5.f199246o
            r4.setText(r5)
            goto L_0x0228
        L_0x01ce:
            com.tencent.mm.plugin.luckymoney.model.j2 r4 = r10.f200416S0
            java.lang.String r4 = r4.f199257z
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)
            if (r4 != 0) goto L_0x020b
            com.tencent.mm.plugin.luckymoney.model.j2 r4 = r10.f200416S0
            java.lang.String r4 = r4.f199246o
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)
            if (r4 == 0) goto L_0x020b
            com.tencent.mm.plugin.luckymoney.model.j2 r4 = r10.f200416S0
            di3.d r5 = di3.C86312j.m106911c(r5)
            d62.i r5 = (d62.C75339i) r5
            com.tencent.mm.plugin.luckymoney.model.j2 r6 = r10.f200416S0
            java.lang.String r6 = r6.f199257z
            java.lang.String r5 = r5.getDisplayName(r6)
            r4.f199246o = r5
            androidx.appcompat.app.AppCompatActivity r4 = r31.getContext()
            android.widget.TextView r5 = r10.f200434i
            r6 = 1
            java.lang.Object[] r12 = new java.lang.Object[r6]
            com.tencent.mm.plugin.luckymoney.model.j2 r6 = r10.f200416S0
            java.lang.String r6 = r6.f199246o
            r12[r9] = r6
            java.lang.String r6 = r10.getString(r7, r12)
            com.tencent.p014mm.plugin.luckymoney.model.C69242l1.m81616v(r4, r5, r6)
            goto L_0x0228
        L_0x020b:
            androidx.appcompat.app.AppCompatActivity r4 = r31.getContext()
            android.widget.TextView r5 = r10.f200434i
            com.tencent.mm.plugin.luckymoney.model.j2 r6 = r10.f200416S0
            java.lang.String r6 = r6.f199246o
            com.tencent.p014mm.plugin.luckymoney.model.C69242l1.m81616v(r4, r5, r6)
            goto L_0x0228
        L_0x0219:
            boolean r4 = eb0.C45628s0.m50742G(r2)
            if (r4 == 0) goto L_0x022b
            android.widget.TextView r4 = r10.f200434i
            com.tencent.mm.plugin.luckymoney.model.j2 r5 = r10.f200416S0
            java.lang.String r5 = r5.f199246o
            r4.setText(r5)
        L_0x0228:
            r5 = 1
            goto L_0x02dd
        L_0x022b:
            com.tencent.mm.plugin.luckymoney.model.j2 r4 = r10.f200416S0
            int r5 = r4.f199256y
            r6 = 2131832560(0x7f112ef0, float:1.9298177E38)
            if (r5 != r3) goto L_0x024b
            androidx.appcompat.app.AppCompatActivity r4 = r31.getContext()
            android.widget.TextView r5 = r10.f200434i
            r7 = 1
            java.lang.Object[] r12 = new java.lang.Object[r7]
            com.tencent.mm.plugin.luckymoney.model.j2 r7 = r10.f200416S0
            java.lang.String r7 = r7.f199246o
            r12[r9] = r7
            java.lang.String r6 = r10.getString(r6, r12)
            com.tencent.p014mm.plugin.luckymoney.model.C69242l1.m81616v(r4, r5, r6)
            goto L_0x0228
        L_0x024b:
            int r5 = r10.f200427Y
            if (r5 != r3) goto L_0x02c7
            boolean r4 = r4.f199247p
            if (r4 == 0) goto L_0x02b8
            f40.C86709a0.m107528h()
            java.lang.Class<f62.k0> r4 = f62.C75700k0.class
            k40.a r4 = f40.C86709a0.m107533q(r4)
            f62.k0 r4 = (f62.C75700k0) r4
            com.tencent.mm.storage.u3 r4 = r4.mo96097Ni()
            com.tencent.mm.plugin.luckymoney.model.j2 r5 = r10.f200416S0
            java.lang.String r5 = r5.f199257z
            com.tencent.mm.storage.z1 r4 = r4.mo69656H3(r5)
            if (r4 == 0) goto L_0x028d
            java.lang.String r4 = r4.getUsername()
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)
            if (r4 != 0) goto L_0x028d
            androidx.appcompat.app.AppCompatActivity r4 = r31.getContext()
            android.widget.TextView r5 = r10.f200434i
            r7 = 1
            java.lang.Object[] r12 = new java.lang.Object[r7]
            com.tencent.mm.plugin.luckymoney.model.j2 r3 = r10.f200416S0
            java.lang.String r3 = r3.f199246o
            r12[r9] = r3
            java.lang.String r3 = r10.getString(r6, r12)
            com.tencent.p014mm.plugin.luckymoney.model.C69242l1.m81616v(r4, r5, r3)
            goto L_0x0228
        L_0x028d:
            r7 = 1
            java.lang.Object[] r3 = new java.lang.Object[r7]
            com.tencent.mm.plugin.luckymoney.model.j2 r4 = r10.f200416S0
            java.lang.String r4 = r4.f199257z
            r3[r9] = r4
            java.lang.String r4 = "do get contact: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r8, r4, r3)
            java.util.Set<java.lang.String> r3 = r10.f200420U0
            com.tencent.mm.plugin.luckymoney.model.j2 r4 = r10.f200416S0
            java.lang.String r4 = r4.f199257z
            java.util.HashSet r3 = (java.util.HashSet) r3
            r3.add(r4)
            eb0.w2 r3 = eb0.C31519v2.m39436a()
            com.tencent.mm.plugin.luckymoney.model.j2 r4 = r10.f200416S0
            java.lang.String r4 = r4.f199257z
            com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNotHookReceiveUI$t r5 = new com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNotHookReceiveUI$t
            r5.<init>()
            r3.mo55988e(r4, r14, r5)
            goto L_0x0228
        L_0x02b8:
            androidx.appcompat.app.AppCompatActivity r3 = r31.getContext()
            android.widget.TextView r4 = r10.f200434i
            com.tencent.mm.plugin.luckymoney.model.j2 r5 = r10.f200416S0
            java.lang.String r5 = r5.f199246o
            com.tencent.p014mm.plugin.luckymoney.model.C69242l1.m81616v(r3, r4, r5)
            goto L_0x0228
        L_0x02c7:
            androidx.appcompat.app.AppCompatActivity r3 = r31.getContext()
            android.widget.TextView r4 = r10.f200434i
            r5 = 1
            java.lang.Object[] r6 = new java.lang.Object[r5]
            com.tencent.mm.plugin.luckymoney.model.j2 r12 = r10.f200416S0
            java.lang.String r12 = r12.f199246o
            r6[r9] = r12
            java.lang.String r6 = r10.getString(r7, r6)
            com.tencent.p014mm.plugin.luckymoney.model.C69242l1.m81616v(r3, r4, r6)
        L_0x02dd:
            com.tencent.mm.plugin.luckymoney.model.j2 r3 = r10.f200416S0
            int r4 = r3.f199256y
            if (r4 != r5) goto L_0x0301
            int r3 = r3.f199250s
            r4 = 4
            if (r3 != r4) goto L_0x0301
            int r3 = r10.f200425X
            boolean r3 = com.tencent.p014mm.plugin.luckymoney.model.C69242l1.m81608n(r3)
            if (r3 != 0) goto L_0x0301
            int r3 = r10.f200427Y
            r4 = 3
            if (r3 == r4) goto L_0x0301
            r3 = 22105(0x5659, float:3.0976E-41)
            java.lang.Object[] r4 = new java.lang.Object[r5]
            r4[r9] = r13
            r0.mo160131h(r3, r4)
            r31.mo95697J7()
        L_0x0301:
            com.tencent.mm.plugin.luckymoney.model.j2 r0 = r10.f200416S0
            java.lang.String r0 = r0.f199235M
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 != 0) goto L_0x0327
            int r0 = r10.f200414R0
            r3 = 1
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isEqual((int) r0, (int) r3)
            if (r0 == 0) goto L_0x0328
            com.tencent.mm.plugin.luckymoney.model.j2 r0 = r10.f200416S0
            java.lang.String r4 = r0.f199235M
            r10.f200417T = r4
            int r0 = r0.f199236N
            r10.f200419U = r0
            android.widget.RelativeLayout r0 = r10.f200404I
            r0.setVisibility(r9)
            r10.mo95705S7(r3)
            goto L_0x0328
        L_0x0327:
            r3 = 1
        L_0x0328:
            android.content.Intent r0 = r31.getIntent()
            java.lang.String r4 = "key_live_error_msg"
            java.lang.String r0 = r0.getStringExtra(r4)
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r4 != 0) goto L_0x0341
            java.lang.Object[] r4 = new java.lang.Object[r3]
            r4[r9] = r0
            java.lang.String r3 = "live errorMsg: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r8, r3, r4)
        L_0x0341:
            com.tencent.mm.plugin.luckymoney.model.j2 r3 = r10.f200416S0
            r4 = 25561(0x63d9, float:3.5819E-41)
            if (r3 != 0) goto L_0x0348
            goto L_0x0389
        L_0x0348:
            int r5 = r3.f199250s
            r6 = 5
            if (r5 != r6) goto L_0x0355
            ak1.i0 r3 = ak1.C54090i0.RED_PACKET_EXPIRED_NOTIFY
            r6 = 1
            r10.mo95703Q7(r3, r6)
            r6 = 2
            goto L_0x036b
        L_0x0355:
            r6 = 1
            int r3 = r3.f199251t
            if (r3 != r6) goto L_0x0360
            ak1.i0 r3 = ak1.C54090i0.EXPOSE_ONLY_PART_USER_INTERCEPT_UI
            r10.mo95703Q7(r3, r6)
            goto L_0x036b
        L_0x0360:
            r3 = 4
            if (r5 != r3) goto L_0x036a
            ak1.i0 r3 = ak1.C54090i0.EXPOSE_RED_PACKET_OVER_INTERCEPT_UI
            r10.mo95703Q7(r3, r6)
            r6 = 0
            goto L_0x036b
        L_0x036a:
            r6 = -1
        L_0x036b:
            android.util.ArrayMap r3 = new android.util.ArrayMap
            r3.<init>()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r6)
            java.lang.String r7 = "red_packet_err_type"
            r3.put(r7, r5)
            r5 = -1
            if (r6 == r5) goto L_0x0389
            di3.d r5 = di3.C86312j.m106911c(r1)
            l31.e r5 = (l31.C61212e) r5
            android.view.View r6 = r10.f200396A
            java.lang.String r7 = "finder_live_red_packet_hold_up"
            r5.mo86153W7(r7, r6, r3, r4)
        L_0x0389:
            com.tencent.mm.plugin.luckymoney.model.j2 r3 = r10.f200416S0
            int r5 = r3.f199251t
            r6 = 1
            if (r5 == r6) goto L_0x0401
            int r3 = r3.f199250s
            r5 = 4
            if (r3 == r5) goto L_0x0401
            r5 = 5
            if (r3 == r5) goto L_0x0401
            if (r3 == r6) goto L_0x0401
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r3 == 0) goto L_0x0401
            com.tencent.mm.plugin.luckymoney.model.j2 r3 = r10.f200416S0
            java.lang.String r3 = r3.f199252u
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
            if (r3 != 0) goto L_0x03b8
            android.widget.TextView r3 = r10.f200435j
            com.tencent.mm.plugin.luckymoney.model.j2 r5 = r10.f200416S0
            java.lang.String r5 = r5.f199252u
            r3.setText(r5)
            android.widget.TextView r3 = r10.f200435j
            r3.setVisibility(r9)
        L_0x03b8:
            com.tencent.mm.plugin.luckymoney.model.j2 r3 = r10.f200416S0
            java.lang.String r3 = r3.f199254w
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
            if (r3 != 0) goto L_0x03dc
            androidx.appcompat.app.AppCompatActivity r3 = r31.getContext()
            android.widget.TextView r5 = r10.f200436n
            com.tencent.mm.plugin.luckymoney.model.j2 r6 = r10.f200416S0
            java.lang.String r6 = r6.f199254w
            com.tencent.p014mm.plugin.luckymoney.model.C69242l1.m81616v(r3, r5, r6)
            android.widget.TextView r3 = r10.f200436n
            r3.setVisibility(r9)
            android.widget.TextView r3 = r10.f200435j
            r5 = 8
            r3.setVisibility(r5)
            goto L_0x03de
        L_0x03dc:
            r5 = 8
        L_0x03de:
            android.widget.Button r3 = r10.f200437o
            di3.d r6 = di3.C86312j.m106911c(r1)
            l31.e r6 = (l31.C61212e) r6
            java.lang.String r7 = "finder_live_red_packet_open"
            r6.o30(r3, r7)
            di3.d r6 = di3.C86312j.m106911c(r1)
            l31.e r6 = (l31.C61212e) r6
            r6.mo86175pO(r3, r5, r4)
            android.widget.Button r3 = r10.f200437o
            com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNotHookReceiveUI$u r5 = new com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNotHookReceiveUI$u
            r5.<init>()
            r3.setOnClickListener(r5)
            r3 = 0
            goto L_0x048b
        L_0x0401:
            android.widget.Button r3 = r10.f200437o
            r5 = 8
            r3.setVisibility(r5)
            android.widget.ImageView r3 = r10.f200438p
            r3.setVisibility(r5)
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r3 != 0) goto L_0x0423
            android.widget.TextView r3 = r10.f200435j
            r3.setText(r0)
            android.widget.TextView r3 = r10.f200435j
            r3.setVisibility(r9)
            android.widget.TextView r3 = r10.f200436n
            r3.setVisibility(r5)
            goto L_0x0468
        L_0x0423:
            com.tencent.mm.plugin.luckymoney.model.j2 r3 = r10.f200416S0
            java.lang.String r3 = r3.f199253v
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
            if (r3 != 0) goto L_0x043c
            android.widget.TextView r3 = r10.f200435j
            com.tencent.mm.plugin.luckymoney.model.j2 r5 = r10.f200416S0
            java.lang.String r5 = r5.f199253v
            r3.setText(r5)
            android.widget.TextView r3 = r10.f200435j
            r3.setVisibility(r9)
            goto L_0x0443
        L_0x043c:
            android.widget.TextView r3 = r10.f200435j
            r5 = 8
            r3.setVisibility(r5)
        L_0x0443:
            com.tencent.mm.plugin.luckymoney.model.j2 r3 = r10.f200416S0
            java.lang.String r3 = r3.f199252u
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
            if (r3 != 0) goto L_0x0461
            android.widget.TextView r3 = r10.f200436n
            com.tencent.mm.plugin.luckymoney.model.j2 r5 = r10.f200416S0
            java.lang.String r5 = r5.f199252u
            r3.setText(r5)
            android.widget.TextView r3 = r10.f200436n
            r3.setVisibility(r9)
            android.widget.TextView r3 = r10.f200436n
            r3.setSingleLine(r9)
            goto L_0x0468
        L_0x0461:
            android.widget.TextView r3 = r10.f200436n
            r5 = 8
            r3.setVisibility(r5)
        L_0x0468:
            android.view.View r3 = r10.f200440q
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            android.widget.RelativeLayout$LayoutParams r3 = (android.widget.RelativeLayout.LayoutParams) r3
            androidx.appcompat.app.AppCompatActivity r5 = r31.getContext()
            r6 = 1106247680(0x41f00000, float:30.0)
            int r5 = com.tencent.p014mm.sdk.platformtools.BackwardSupportUtil.BitmapFactory.fromDPToPix(r5, r6)
            r3.bottomMargin = r5
            android.view.View r5 = r10.f200440q
            r5.setLayoutParams(r3)
            android.os.ResultReceiver r3 = r10.f200448x0
            if (r3 == 0) goto L_0x048a
            r5 = 0
            r6 = 1
            r3.send(r6, r5)
        L_0x048a:
            r3 = 1
        L_0x048b:
            java.lang.String r5 = eb0.C75592q0.m90789s()
            java.lang.String r6 = r10.f200410P
            boolean r5 = r5.equals(r6)
            if (r5 != 0) goto L_0x04ac
            com.tencent.mm.plugin.luckymoney.model.j2 r5 = r10.f200416S0
            int r6 = r5.f199256y
            r7 = 1
            if (r6 != r7) goto L_0x04a4
            int r7 = r5.f199250s
            r12 = 4
            if (r7 == r12) goto L_0x04ac
            goto L_0x04a5
        L_0x04a4:
            r12 = 4
        L_0x04a5:
            r7 = 3
            if (r6 != r7) goto L_0x0528
            int r5 = r5.f199250s
            if (r5 != r12) goto L_0x0528
        L_0x04ac:
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 == 0) goto L_0x0528
            com.tencent.mm.plugin.luckymoney.model.j2 r0 = r10.f200416S0
            int r0 = r0.f199256y
            r5 = 1
            if (r0 != r5) goto L_0x04c1
            android.widget.TextView r0 = r10.f200442s
            r5 = 2131832373(0x7f112e35, float:1.9297798E38)
            r0.setText(r5)
        L_0x04c1:
            android.view.View r0 = r10.f200440q
            di3.d r5 = di3.C86312j.m106911c(r1)
            l31.e r5 = (l31.C61212e) r5
            java.lang.String r6 = "red_packet_check_detail"
            r5.o30(r0, r6)
            di3.d r1 = di3.C86312j.m106911c(r1)
            l31.e r1 = (l31.C61212e) r1
            r5 = 8
            r1.mo86175pO(r0, r5, r4)
            android.view.View r0 = r10.f200440q
            k20.a r1 = new k20.a
            r1.<init>()
            java.lang.ThreadLocal<k20.a> r4 = k20.C60958c.f173611a
            r1.mo10233c(r11)
            java.lang.Object[] r17 = r1.mo10232b()
            java.lang.String r18 = "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNotHookReceiveUI"
            java.lang.String r19 = "onSceneEnd"
            java.lang.String r20 = "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)Z"
            java.lang.String r21 = "android/view/View_EXEC_"
            java.lang.String r22 = "setVisibility"
            java.lang.String r23 = "(I)V"
            r16 = r0
            j20.C117292a.m165358d(r16, r17, r18, r19, r20, r21, r22, r23)
            java.lang.Object r1 = r1.mo10231a(r9)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r0.setVisibility(r1)
            java.lang.String r17 = "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNotHookReceiveUI"
            java.lang.String r18 = "onSceneEnd"
            java.lang.String r19 = "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)Z"
            java.lang.String r20 = "android/view/View_EXEC_"
            java.lang.String r21 = "setVisibility"
            java.lang.String r22 = "(I)V"
            j20.C117292a.m165359e(r16, r17, r18, r19, r20, r21, r22)
            android.view.View r0 = r10.f200440q
            com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNotHookReceiveUI$b r1 = new com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNotHookReceiveUI$b
            r1.<init>(r3)
            r0.setOnClickListener(r1)
            android.widget.ImageView r0 = r10.f200441r
            r1 = 8
            r0.setVisibility(r1)
            goto L_0x0572
        L_0x0528:
            r1 = 8
            android.view.View r0 = r10.f200440q
            k20.a r3 = new k20.a
            r3.<init>()
            java.lang.ThreadLocal<k20.a> r4 = k20.C60958c.f173611a
            java.lang.Integer r4 = java.lang.Integer.valueOf(r1)
            r3.mo10233c(r4)
            java.lang.Object[] r17 = r3.mo10232b()
            java.lang.String r18 = "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNotHookReceiveUI"
            java.lang.String r19 = "onSceneEnd"
            java.lang.String r20 = "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)Z"
            java.lang.String r21 = "android/view/View_EXEC_"
            java.lang.String r22 = "setVisibility"
            java.lang.String r23 = "(I)V"
            r16 = r0
            j20.C117292a.m165358d(r16, r17, r18, r19, r20, r21, r22, r23)
            java.lang.Object r1 = r3.mo10231a(r9)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r0.setVisibility(r1)
            java.lang.String r17 = "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNotHookReceiveUI"
            java.lang.String r18 = "onSceneEnd"
            java.lang.String r19 = "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)Z"
            java.lang.String r20 = "android/view/View_EXEC_"
            java.lang.String r21 = "setVisibility"
            java.lang.String r22 = "(I)V"
            j20.C117292a.m165359e(r16, r17, r18, r19, r20, r21, r22)
            android.widget.ImageView r0 = r10.f200441r
            r1 = 8
            r0.setVisibility(r1)
        L_0x0572:
            boolean r0 = eb0.C45628s0.m50742G(r2)
            if (r0 == 0) goto L_0x0585
            com.tencent.mm.plugin.luckymoney.model.j2 r0 = r10.f200416S0
            com.tencent.mm.plugin.luckymoney.model.o2 r1 = r0.f199238Q
            if (r1 != 0) goto L_0x0585
            com.tencent.mm.plugin.luckymoney.model.o2 r1 = new com.tencent.mm.plugin.luckymoney.model.o2
            r1.<init>()
            r0.f199238Q = r1
        L_0x0585:
            com.tencent.mm.plugin.luckymoney.model.j2 r0 = r10.f200416S0
            com.tencent.mm.plugin.luckymoney.model.o2 r0 = r0.f199238Q
            r1 = 1118830592(0x42b00000, float:88.0)
            if (r0 == 0) goto L_0x0893
            android.content.Intent r0 = r31.getIntent()
            java.lang.String r2 = "key_receive_envelope_url"
            java.lang.String r0 = r0.getStringExtra(r2)
            android.content.Intent r2 = r31.getIntent()
            java.lang.String r3 = "key_receive_envelope_md5"
            java.lang.String r2 = r2.getStringExtra(r3)
            android.content.Intent r3 = r31.getIntent()
            java.lang.String r4 = "key_receive_envelope_widget_url"
            java.lang.String r3 = r3.getStringExtra(r4)
            android.content.Intent r4 = r31.getIntent()
            java.lang.String r5 = "key_receive_envelope_widget_md5"
            java.lang.String r4 = r4.getStringExtra(r5)
            android.content.Intent r5 = r31.getIntent()
            java.lang.String r6 = "key_receive_envelope_dynamic_url"
            java.lang.String r5 = r5.getStringExtra(r6)
            android.content.Intent r6 = r31.getIntent()
            java.lang.String r7 = "key_receive_envelope_dynamic_md5"
            java.lang.String r6 = r6.getStringExtra(r7)
            android.content.Intent r7 = r31.getIntent()
            java.lang.String r12 = "key_receive_envelope_dynamic_type"
            int r7 = r7.getIntExtra(r12, r9)
            boolean r12 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r12 != 0) goto L_0x0611
            java.lang.String r12 = "use bubble xml content"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r12)
            com.tencent.mm.plugin.luckymoney.model.j2 r12 = r10.f200416S0
            com.tencent.mm.plugin.luckymoney.model.o2 r12 = r12.f199238Q
            te3.sf2 r13 = r12.f199291a
            if (r13 != 0) goto L_0x05ee
            te3.sf2 r13 = new te3.sf2
            r13.<init>()
            r12.f199291a = r13
        L_0x05ee:
            com.tencent.mm.plugin.luckymoney.model.j2 r12 = r10.f200416S0
            com.tencent.mm.plugin.luckymoney.model.o2 r12 = r12.f199238Q
            te3.sf2 r12 = r12.f199291a
            te3.tf2 r13 = new te3.tf2
            r13.<init>()
            r12.f228203g = r13
            com.tencent.mm.plugin.luckymoney.model.j2 r12 = r10.f200416S0
            com.tencent.mm.plugin.luckymoney.model.o2 r12 = r12.f199238Q
            te3.sf2 r12 = r12.f199291a
            te3.tf2 r12 = r12.f228203g
            r12.f228245f = r0
            r12.f228248i = r2
            r12.f228251o = r3
            r12.f228252p = r4
            r12.f228260x = r5
            r12.f228240B = r6
            r12.f228242D = r7
        L_0x0611:
            com.tencent.mm.plugin.luckymoney.model.j2 r0 = r10.f200416S0
            com.tencent.mm.plugin.luckymoney.model.o2 r0 = r0.f199238Q
            te3.sf2 r4 = r0.f199291a
            java.lang.Class<f32.b> r0 = f32.C75672b.class
            java.lang.String r2 = "render envelope"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r2)
            if (r4 != 0) goto L_0x0622
            goto L_0x086d
        L_0x0622:
            android.widget.ImageView r2 = r10.f200449y
            r3 = 2131233825(0x7f080c21, float:1.8083798E38)
            r2.setImageResource(r3)
            di3.d r2 = di3.C86312j.m106911c(r0)
            r16 = r2
            f32.b r16 = (f32.C75672b) r16
            android.widget.ImageView r2 = r10.f200447x
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r17 = r2
            r18 = r4
            r16.ng0(r17, r18, r19, r20, r21, r22)
            android.widget.ImageView r2 = r10.f200447x
            r2.setVisibility(r9)
            android.widget.ImageView r2 = r10.f200441r
            r3 = 8
            r2.setVisibility(r3)
            r2 = 1
            r10.f200418T0 = r2
            int r2 = r10.f200421V
            r5 = 2
            if (r2 != r5) goto L_0x065d
            android.widget.TextView r2 = r10.f200443t
            r2.setVisibility(r9)
            goto L_0x0662
        L_0x065d:
            android.widget.TextView r2 = r10.f200443t
            r2.setVisibility(r3)
        L_0x0662:
            android.widget.LinearLayout r2 = r10.f200432g
            android.view.ViewGroup$LayoutParams r2 = r2.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r2 = (android.widget.LinearLayout.LayoutParams) r2
            androidx.appcompat.app.AppCompatActivity r3 = r31.getContext()
            int r1 = com.tencent.p014mm.sdk.platformtools.BackwardSupportUtil.BitmapFactory.fromDPToPix(r3, r1)
            r2.topMargin = r1
            android.widget.LinearLayout r1 = r10.f200432g
            r1.setLayoutParams(r2)
            android.widget.TextView r1 = r10.f200436n
            com.tencent.p014mm.plugin.luckymoney.model.C69242l1.m81615u(r1)
            android.widget.TextView r1 = r10.f200435j
            com.tencent.p014mm.plugin.luckymoney.model.C69242l1.m81615u(r1)
            android.widget.TextView r1 = r10.f200434i
            com.tencent.p014mm.plugin.luckymoney.model.C69242l1.m81615u(r1)
            te3.tf2 r1 = r4.f228203g
            if (r1 == 0) goto L_0x068e
            java.lang.String r14 = r1.f228245f
        L_0x068e:
            r1 = 2
            f32.C75675d.m90931a(r1, r14)
            java.lang.Class<h81.h> r1 = h81.C32735h.class
            di3.d r1 = di3.C86312j.m106911c(r1)
            h81.h r1 = (h81.C32735h) r1
            h81.h$b r2 = h81.C32735h.C32738b.clicfg_android_lucky_money_dynamic_cover_close_switch
            boolean r1 = r1.mo58784wf(r2, r9)
            r2 = 1
            java.lang.Object[] r3 = new java.lang.Object[r2]
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r1)
            r3[r9] = r2
            java.lang.String r2 = "MicroMsg.LuckyMoneyUtil"
            java.lang.String r5 = "needCloseLuckyMoneyDynamicConfigCover：%s "
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r5, r3)
            if (r1 != 0) goto L_0x06ef
            te3.tf2 r1 = r4.f228203g
            if (r1 == 0) goto L_0x06ef
            java.lang.String r1 = r1.f228260x
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r1 == 0) goto L_0x06bf
            goto L_0x06ef
        L_0x06bf:
            com.tencent.mm.wallet_core.model.u0 r1 = com.tencent.p014mm.wallet_core.model.C75142u0.f221103a
            a14.n0 r1 = r1.mo104865a()
            r10.f200402G = r1
            te3.tf2 r1 = r4.f228203g
            int r1 = r1.f228242D
            com.tencent.mm.plugin.luckymoney.ui.x2 r2 = new com.tencent.mm.plugin.luckymoney.ui.x2
            r2.<init>(r10, r1)
            r10.f200401F = r2
            android.view.View r1 = r10.f200397B
            org.libpag.PAGView r3 = r10.f200398C
            android.view.View r5 = r10.f200399D
            org.libpag.PAGView r6 = r10.f200400E
            a14.n0 r7 = r10.f200402G
            r16 = r4
            r17 = r1
            r18 = r3
            r19 = r5
            r20 = r6
            r21 = r2
            r22 = r7
            m81872O7(r16, r17, r18, r19, r20, r21, r22)
            goto L_0x0771
        L_0x06ef:
            android.view.View r1 = r10.f200397B
            k20.a r2 = new k20.a
            r2.<init>()
            r3 = 8
            java.lang.Integer r5 = java.lang.Integer.valueOf(r3)
            r2.mo10233c(r5)
            java.lang.Object[] r17 = r2.mo10232b()
            java.lang.String r18 = "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNotHookReceiveUI"
            java.lang.String r19 = "renderEnvelopeDynamic"
            java.lang.String r20 = "(Lcom/tencent/mm/protocal/protobuf/HbEnvelopSource;)V"
            java.lang.String r21 = "android/view/View_EXEC_"
            java.lang.String r22 = "setVisibility"
            java.lang.String r23 = "(I)V"
            r16 = r1
            j20.C117292a.m165358d(r16, r17, r18, r19, r20, r21, r22, r23)
            java.lang.Object r2 = r2.mo10231a(r9)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r1.setVisibility(r2)
            java.lang.String r17 = "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNotHookReceiveUI"
            java.lang.String r18 = "renderEnvelopeDynamic"
            java.lang.String r19 = "(Lcom/tencent/mm/protocal/protobuf/HbEnvelopSource;)V"
            java.lang.String r20 = "android/view/View_EXEC_"
            java.lang.String r21 = "setVisibility"
            java.lang.String r22 = "(I)V"
            j20.C117292a.m165359e(r16, r17, r18, r19, r20, r21, r22)
            android.view.View r1 = r10.f200399D
            k20.a r2 = new k20.a
            r2.<init>()
            r3 = 8
            java.lang.Integer r5 = java.lang.Integer.valueOf(r3)
            r2.mo10233c(r5)
            java.lang.Object[] r24 = r2.mo10232b()
            java.lang.String r25 = "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNotHookReceiveUI"
            java.lang.String r26 = "renderEnvelopeDynamic"
            java.lang.String r27 = "(Lcom/tencent/mm/protocal/protobuf/HbEnvelopSource;)V"
            java.lang.String r28 = "android/view/View_EXEC_"
            java.lang.String r29 = "setVisibility"
            java.lang.String r30 = "(I)V"
            r23 = r1
            j20.C117292a.m165358d(r23, r24, r25, r26, r27, r28, r29, r30)
            java.lang.Object r2 = r2.mo10231a(r9)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r1.setVisibility(r2)
            java.lang.String r24 = "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNotHookReceiveUI"
            java.lang.String r25 = "renderEnvelopeDynamic"
            java.lang.String r26 = "(Lcom/tencent/mm/protocal/protobuf/HbEnvelopSource;)V"
            java.lang.String r27 = "android/view/View_EXEC_"
            java.lang.String r28 = "setVisibility"
            java.lang.String r29 = "(I)V"
            j20.C117292a.m165359e(r23, r24, r25, r26, r27, r28, r29)
        L_0x0771:
            te3.tf2 r1 = r4.f228203g
            if (r1 == 0) goto L_0x080c
            java.lang.String r1 = r1.f228251o
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r1 != 0) goto L_0x080c
            te3.tf2 r1 = r4.f228203g
            java.lang.String r1 = r1.f228252p
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r1 == 0) goto L_0x0789
            goto L_0x080c
        L_0x0789:
            android.content.Intent r1 = r31.getIntent()
            java.lang.String r1 = r1.getStringExtra(r15)
            boolean r1 = eb0.C45628s0.m50742G(r1)
            if (r1 == 0) goto L_0x079a
            r1 = 30
            goto L_0x079b
        L_0x079a:
            r1 = 0
        L_0x079b:
            android.widget.ImageView r2 = r10.f200451z
            com.tencent.mm.plugin.luckymoney.ui.w2 r3 = new com.tencent.mm.plugin.luckymoney.ui.w2
            r3.<init>(r10)
            long r5 = (long) r1
            r2.postDelayed(r3, r5)
            di3.d r0 = di3.C86312j.m106911c(r0)
            r2 = r0
            f32.b r2 = (f32.C75672b) r2
            android.widget.ImageView r3 = r10.f200451z
            r5 = 0
            r6 = 0
            r7 = 0
            r2.P30(r3, r4, r5, r6, r7)
            android.widget.ImageView r0 = r10.f200451z
            r0.setVisibility(r9)
            android.view.View r0 = r10.f200396A
            k20.a r12 = new k20.a
            r12.<init>()
            r12.mo10233c(r11)
            java.lang.Object[] r2 = r12.mo10232b()
            java.lang.String r3 = "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNotHookReceiveUI"
            java.lang.String r4 = "renderEnvelopeWidget"
            java.lang.String r5 = "(Lcom/tencent/mm/protocal/protobuf/HbEnvelopSource;)V"
            java.lang.String r6 = "android/view/View_EXEC_"
            java.lang.String r7 = "setVisibility"
            java.lang.String r8 = "(I)V"
            r1 = r0
            j20.C117292a.m165358d(r1, r2, r3, r4, r5, r6, r7, r8)
            java.lang.Object r1 = r12.mo10231a(r9)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r0.setVisibility(r1)
            java.lang.String r2 = "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNotHookReceiveUI"
            java.lang.String r3 = "renderEnvelopeWidget"
            java.lang.String r4 = "(Lcom/tencent/mm/protocal/protobuf/HbEnvelopSource;)V"
            java.lang.String r5 = "android/view/View_EXEC_"
            java.lang.String r6 = "setVisibility"
            java.lang.String r7 = "(I)V"
            r1 = r0
            j20.C117292a.m165359e(r1, r2, r3, r4, r5, r6, r7)
            android.widget.ImageView r0 = r10.f200451z
            com.tencent.p014mm.plugin.luckymoney.model.C69242l1.m81612r(r0)
            com.tencent.mm.ui.widget.imageview.WeImageView r0 = r10.f200444u
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r0 = (android.view.ViewGroup.MarginLayoutParams) r0
            if (r0 == 0) goto L_0x086d
            r0.topMargin = r9
            com.tencent.mm.ui.widget.imageview.WeImageView r1 = r10.f200444u
            r1.setLayoutParams(r0)
            goto L_0x086d
        L_0x080c:
            android.widget.ImageView r0 = r10.f200451z
            r1 = 8
            r0.setVisibility(r1)
            android.view.View r2 = r10.f200396A
            k20.a r0 = new k20.a
            r0.<init>()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.mo10233c(r1)
            java.lang.Object[] r17 = r0.mo10232b()
            java.lang.String r18 = "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNotHookReceiveUI"
            java.lang.String r19 = "renderEnvelopeWidget"
            java.lang.String r20 = "(Lcom/tencent/mm/protocal/protobuf/HbEnvelopSource;)V"
            java.lang.String r21 = "android/view/View_EXEC_"
            java.lang.String r22 = "setVisibility"
            java.lang.String r23 = "(I)V"
            r16 = r2
            j20.C117292a.m165358d(r16, r17, r18, r19, r20, r21, r22, r23)
            java.lang.Object r0 = r0.mo10231a(r9)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            r2.setVisibility(r0)
            java.lang.String r3 = "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNotHookReceiveUI"
            java.lang.String r4 = "renderEnvelopeWidget"
            java.lang.String r5 = "(Lcom/tencent/mm/protocal/protobuf/HbEnvelopSource;)V"
            java.lang.String r6 = "android/view/View_EXEC_"
            java.lang.String r7 = "setVisibility"
            java.lang.String r8 = "(I)V"
            j20.C117292a.m165359e(r2, r3, r4, r5, r6, r7, r8)
            com.tencent.mm.ui.widget.imageview.WeImageView r0 = r10.f200444u
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r0 = (android.view.ViewGroup.MarginLayoutParams) r0
            if (r0 == 0) goto L_0x086d
            androidx.appcompat.app.AppCompatActivity r1 = r31.getContext()
            r2 = 24
            int r1 = kg3.C76577a.m92151b(r1, r2)
            r0.topMargin = r1
            com.tencent.mm.ui.widget.imageview.WeImageView r1 = r10.f200444u
            r1.setLayoutParams(r0)
        L_0x086d:
            com.tencent.mm.plugin.luckymoney.model.j2 r0 = r10.f200416S0
            com.tencent.mm.plugin.luckymoney.model.o2 r0 = r0.f199238Q
            te3.sf2 r0 = r0.f199291a
            te3.tf2 r0 = r0.f228203g
            android.content.Intent r0 = r31.getIntent()
            r0.getStringExtra(r15)
            com.tencent.mm.plugin.luckymoney.model.j2 r0 = r10.f200416S0
            com.tencent.mm.plugin.luckymoney.model.o2 r0 = r0.f199238Q
            te3.sf2 r0 = r0.f199291a
            java.lang.String r0 = r0.f228200d
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 != 0) goto L_0x08ce
            com.tencent.mm.plugin.luckymoney.model.j2 r0 = r10.f200416S0
            com.tencent.mm.plugin.luckymoney.model.o2 r0 = r0.f199238Q
            te3.sf2 r0 = r0.f199291a
            java.lang.String r0 = r0.f228200d
            goto L_0x08ce
        L_0x0893:
            android.widget.LinearLayout r0 = r10.f200432g
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r0 = (android.widget.LinearLayout.LayoutParams) r0
            java.lang.String r2 = r10.f200417T
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r2 != 0) goto L_0x08ae
            androidx.appcompat.app.AppCompatActivity r2 = r31.getContext()
            int r1 = com.tencent.p014mm.sdk.platformtools.BackwardSupportUtil.BitmapFactory.fromDPToPix(r2, r1)
            r0.topMargin = r1
            goto L_0x08ba
        L_0x08ae:
            androidx.appcompat.app.AppCompatActivity r1 = r31.getContext()
            r2 = 1122762752(0x42ec0000, float:118.0)
            int r1 = com.tencent.p014mm.sdk.platformtools.BackwardSupportUtil.BitmapFactory.fromDPToPix(r1, r2)
            r0.topMargin = r1
        L_0x08ba:
            float r1 = lg3.C88494d.f255615g
            r2 = 1065353216(0x3f800000, float:1.0)
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r2 == 0) goto L_0x08c9
            int r2 = r0.topMargin
            float r2 = (float) r2
            float r2 = r2 / r1
            int r1 = (int) r2
            r0.topMargin = r1
        L_0x08c9:
            android.widget.LinearLayout r1 = r10.f200432g
            r1.setLayoutParams(r0)
        L_0x08ce:
            r31.mo95704R7()
            android.view.View r2 = r10.f200445v
            k20.a r0 = new k20.a
            r0.<init>()
            r0.mo10233c(r11)
            java.lang.Object[] r17 = r0.mo10232b()
            java.lang.String r18 = "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNotHookReceiveUI"
            java.lang.String r19 = "onSceneEnd"
            java.lang.String r20 = "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)Z"
            java.lang.String r21 = "android/view/View_EXEC_"
            java.lang.String r22 = "setVisibility"
            java.lang.String r23 = "(I)V"
            r16 = r2
            j20.C117292a.m165358d(r16, r17, r18, r19, r20, r21, r22, r23)
            java.lang.Object r0 = r0.mo10231a(r9)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            r2.setVisibility(r0)
            java.lang.String r3 = "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNotHookReceiveUI"
            java.lang.String r4 = "onSceneEnd"
            java.lang.String r5 = "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)Z"
            java.lang.String r6 = "android/view/View_EXEC_"
            java.lang.String r7 = "setVisibility"
            java.lang.String r8 = "(I)V"
            j20.C117292a.m165359e(r2, r3, r4, r5, r6, r7, r8)
            android.view.View r0 = r10.f200445v
            com.tencent.p014mm.plugin.luckymoney.model.C69242l1.m81612r(r0)
            goto L_0x0156
        L_0x0913:
            return r1
        L_0x0914:
            return r9
        L_0x0915:
            r1 = 1
            boolean r5 = r4 instanceof com.tencent.p014mm.plugin.luckymoney.model.C69210e2
            if (r5 == 0) goto L_0x0b19
            boolean r5 = r4 instanceof w32.C78508b
            if (r5 == 0) goto L_0x0973
            r5 = r4
            w32.b r5 = (w32.C78508b) r5
            if (r2 == 0) goto L_0x0973
            int r6 = r5.f229958C
            java.lang.Object[] r7 = new java.lang.Object[r1]
            java.lang.Integer r11 = java.lang.Integer.valueOf(r6)
            r7[r9] = r11
            java.lang.String r11 = "whether doing the retry logic of NetSceneLiveOpenLuckyMoney, delayTimeMs: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r8, r11, r7)
            if (r6 <= 0) goto L_0x0973
            java.util.Map<java.lang.String, java.lang.String> r7 = r5.f229959D
            if (r7 == 0) goto L_0x095c
            java.lang.String r11 = java.lang.String.valueOf(r1)
            java.util.HashMap r7 = (java.util.HashMap) r7
            java.lang.String r1 = "policy_retry"
            r7.put(r1, r11)
            w32.b r1 = new w32.b
            java.util.Map<java.lang.String, java.lang.String> r7 = r5.f229959D
            r1.<init>(r7)
            java.lang.String r7 = r5.f199150i
            r1.f199150i = r7
            java.lang.String r7 = r5.f199151j
            r1.f199151j = r7
            java.lang.String r7 = r5.f199152n
            r1.f199152n = r7
            int r5 = r5.f229957B
            r1.f229957B = r5
            goto L_0x095d
        L_0x095c:
            r1 = 0
        L_0x095d:
            if (r1 == 0) goto L_0x096e
            zt3.t r0 = zt3.C119157j.f356862d
            com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNotHookReceiveUI$c r2 = new com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNotHookReceiveUI$c
            r2.<init>(r1)
            long r3 = (long) r6
            zt3.j r0 = (zt3.C119157j) r0
            r0.mo183878i(r2, r3)
            r1 = 1
            return r1
        L_0x096e:
            java.lang.String r1 = "The retryNetScene is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r8, r1)
        L_0x0973:
            qo3.i0 r1 = r10.f200446w
            if (r1 == 0) goto L_0x0982
            boolean r1 = r1.isShowing()
            if (r1 == 0) goto L_0x0982
            qo3.i0 r1 = r10.f200446w
            r1.dismiss()
        L_0x0982:
            android.widget.ImageView r1 = r10.f200438p
            com.tencent.p014mm.plugin.luckymoney.model.C69242l1.m81618x(r1)
            android.widget.Button r1 = r10.f200437o
            r5 = 1
            r1.setClickable(r5)
            r31.mo95702P7()
            if (r0 != 0) goto L_0x0a4c
            if (r2 != 0) goto L_0x0a4c
            r0 = r4
            com.tencent.mm.plugin.luckymoney.model.e2 r0 = (com.tencent.p014mm.plugin.luckymoney.model.C69210e2) r0
            r1 = 2131832339(0x7f112e13, float:1.929773E38)
            com.tencent.p014mm.plugin.luckymoney.p073ui.C115591q5.m162472a(r10, r1)
            com.tencent.mm.wallet_core.model.JumpRemind r1 = r0.f199284f
            if (r1 != 0) goto L_0x09a3
            r2 = 0
            goto L_0x09a4
        L_0x09a3:
            r2 = 1
        L_0x09a4:
            if (r2 == 0) goto L_0x09b0
            com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNotHookReceiveUI$d r2 = new com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNotHookReceiveUI$d
            r2.<init>(r0)
            r1.mo104782f(r10, r2)
            r1 = 1
            return r1
        L_0x09b0:
            r1 = 1
            com.tencent.mm.plugin.wallet_core.utils.h r2 = r0.f199159u
            boolean r2 = com.tencent.p014mm.plugin.wallet_core.utils.C72506r.m84838d(r2)
            if (r2 == 0) goto L_0x09cd
            r2 = 4
            r10.setContentViewVisibility(r2)
            com.tencent.mm.plugin.wallet_core.utils.r r2 = new com.tencent.mm.plugin.wallet_core.utils.r
            r2.<init>(r10)
            com.tencent.mm.plugin.wallet_core.utils.h r3 = r0.f199159u
            com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNotHookReceiveUI$e r4 = new com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNotHookReceiveUI$e
            r4.<init>(r0)
            r2.mo99912b(r3, r4)
            return r1
        L_0x09cd:
            r2 = 4
            java.lang.String r1 = r0.f199163y
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r1 != 0) goto L_0x0a3a
            r10.setContentViewVisibility(r2)
            long r1 = r10.f200422V0
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L_0x09e6
            java.lang.String r1 = "last compliance usecase wast not stopped as expected!"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r8, r1)
        L_0x09e6:
            java.lang.String r1 = r0.f199161w
            java.lang.String r0 = r0.f199163y
            com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNotHookReceiveUI$f r2 = new com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNotHookReceiveUI$f
            r2.<init>(r1)
            java.lang.String r1 = "base64Data"
            gy3.C87412m.m108594g(r0, r1)
            byte[] r0 = android.util.Base64.decode(r0, r9)
            java.lang.String r1 = "decode(base64Data, Base64.DEFAULT)"
            gy3.C87412m.m108593f(r0, r1)
            int r1 = r0.length
            if (r1 != 0) goto L_0x0a01
            r9 = 1
        L_0x0a01:
            if (r9 == 0) goto L_0x0a05
            r14 = 0
            goto L_0x0a30
        L_0x0a05:
            long r5 = java.lang.System.currentTimeMillis()
            com.tencent.kinda.gen.ITransmitKvData r1 = com.tencent.kinda.gen.ITransmitKvData.create()
            java.lang.String r7 = "half_page_view_data"
            r1.putBinary(r7, r0)
            java.lang.String r0 = "usecase_platform_session"
            r1.putLong(r0, r5)
            java.lang.Class<ie3.c> r0 = ie3.C76324c.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            ie3.c r0 = (ie3.C76324c) r0
            if (r0 == 0) goto L_0x0a2c
            com.tencent.mm.plugin.wallet_core.utils.p r7 = new com.tencent.mm.plugin.wallet_core.utils.p
            r7.<init>(r2)
            java.lang.String r2 = "complianceHalfPage"
            r0.startUseCase(r2, r1, r7)
        L_0x0a2c:
            java.lang.Long r14 = java.lang.Long.valueOf(r5)
        L_0x0a30:
            if (r14 == 0) goto L_0x0a36
            long r3 = r14.longValue()
        L_0x0a36:
            r10.f200422V0 = r3
            r1 = 1
            return r1
        L_0x0a3a:
            r1 = 1
            r10.mo95700M7(r0)
            boolean r0 = r10.f200418T0
            if (r0 == 0) goto L_0x0a4b
            com.tencent.mm.plugin.report.service.n r0 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r2 = 991(0x3df, float:1.389E-42)
            r3 = 13
            r0.mo175911u(r2, r3)
        L_0x0a4b:
            return r1
        L_0x0a4c:
            r0 = 416(0x1a0, float:5.83E-43)
            if (r2 != r0) goto L_0x0add
            qo3.i0 r0 = r10.f200446w
            if (r0 == 0) goto L_0x0a5f
            boolean r0 = r0.isShowing()
            if (r0 == 0) goto L_0x0a5f
            qo3.i0 r0 = r10.f200446w
            r0.dismiss()
        L_0x0a5f:
            android.os.Bundle r5 = new android.os.Bundle
            r5.<init>()
            java.lang.String r0 = "realname_verify_process_jump_activity"
            java.lang.String r1 = ".ui.LuckyMoneyNotHookReceiveUI"
            r5.putString(r0, r1)
            java.lang.String r0 = "realname_verify_process_jump_plugin"
            java.lang.String r1 = "luckymoney"
            r5.putString(r0, r1)
            android.widget.Button r0 = r10.f200437o
            r0.setVisibility(r9)
            android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            java.lang.String r1 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getDefaultPreferencePath()
            android.content.SharedPreferences r0 = r0.getSharedPreferences(r1, r9)
            android.content.Context r1 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.LocaleUtil.loadApplicationLanguage(r0, r1)
            if (r0 == 0) goto L_0x0ab7
            int r1 = r0.length()
            if (r1 <= 0) goto L_0x0ab7
            java.lang.String r1 = "zh_CN"
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L_0x0aae
            java.lang.String r1 = "zh_TW"
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L_0x0aae
            java.lang.String r1 = "zh_HK"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0ab7
        L_0x0aae:
            android.widget.Button r0 = r10.f200437o
            r1 = 2131232276(0x7f080614, float:1.8080657E38)
            r0.setBackgroundResource(r1)
            goto L_0x0ac7
        L_0x0ab7:
            android.widget.Button r0 = r10.f200437o
            r1 = 2131233939(0x7f080c93, float:1.808403E38)
            r0.setBackgroundResource(r1)
            android.widget.Button r0 = r10.f200437o
            r1 = 2131832484(0x7f112ea4, float:1.9298023E38)
            r0.setText(r1)
        L_0x0ac7:
            r6 = 0
            com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNotHookReceiveUI$g r7 = new com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNotHookReceiveUI$g
            r7.<init>(r10)
            r8 = 0
            r9 = 1003(0x3eb, float:1.406E-42)
            r1 = r31
            r2 = r33
            r3 = r34
            r4 = r35
            boolean r0 = com.tencent.p014mm.plugin.luckymoney.model.C69242l1.m81596b(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return r0
        L_0x0add:
            r0 = 419(0x1a3, float:5.87E-43)
            if (r2 != r0) goto L_0x0aff
            androidx.appcompat.app.AppCompatActivity r0 = r31.getContext()
            androidx.appcompat.app.AppCompatActivity r1 = r31.getContext()
            r2 = 2131832375(0x7f112e37, float:1.9297802E38)
            java.lang.String r1 = r1.getString(r2)
            com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNotHookReceiveUI$h r2 = new com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNotHookReceiveUI$h
            r2.<init>()
            nj3.C76879j.m92754y(r0, r3, r14, r1, r2)
            android.widget.Button r0 = r10.f200437o
            r0.setVisibility(r9)
            r1 = 1
            return r1
        L_0x0aff:
            r1 = 1
            boolean r0 = android.text.TextUtils.isEmpty(r34)
            if (r0 == 0) goto L_0x0b0e
            r0 = 2131839734(0x7f114af6, float:1.9312728E38)
            java.lang.String r0 = r10.getString(r0)
            goto L_0x0b0f
        L_0x0b0e:
            r0 = r3
        L_0x0b0f:
            com.tencent.mm.plugin.luckymoney.ui.v2 r2 = new com.tencent.mm.plugin.luckymoney.ui.v2
            r2.<init>(r10)
            r3 = 0
            nj3.C76879j.m92713G(r10, r0, r3, r9, r2)
            return r1
        L_0x0b19:
            boolean r1 = r4 instanceof com.tencent.p014mm.plugin.luckymoney.model.C69267u1
            if (r1 == 0) goto L_0x0c14
            qo3.i0 r1 = r10.f200446w
            if (r1 == 0) goto L_0x0b2c
            boolean r1 = r1.isShowing()
            if (r1 == 0) goto L_0x0b2c
            qo3.i0 r1 = r10.f200446w
            r1.dismiss()
        L_0x0b2c:
            if (r0 != 0) goto L_0x0c0c
            if (r2 != 0) goto L_0x0c0c
            r1 = r4
            com.tencent.mm.plugin.luckymoney.model.u1 r1 = (com.tencent.p014mm.plugin.luckymoney.model.C69267u1) r1
            android.content.Intent r2 = new android.content.Intent
            r2.<init>()
            androidx.appcompat.app.AppCompatActivity r0 = r31.getContext()
            java.lang.Class<com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyBeforeDetailUI> r3 = com.tencent.p014mm.plugin.luckymoney.p073ui.LuckyMoneyBeforeDetailUI.class
            r2.setClass(r0, r3)
            java.lang.String r0 = "key_lucky_money_can_received"
            r3 = 1
            r2.putExtra(r0, r3)
            java.lang.String r0 = r10.f200408M     // Catch:{ Exception -> 0x0b55 }
            com.tencent.mm.plugin.luckymoney.model.a0 r3 = r1.f199337h     // Catch:{ Exception -> 0x0b55 }
            f32.C75674c.m90930b(r0, r3)     // Catch:{ Exception -> 0x0b55 }
            java.lang.String r0 = "key_jump_from"
            r3 = 2
            r2.putExtra(r0, r3)     // Catch:{ Exception -> 0x0b55 }
            goto L_0x0b6e
        L_0x0b55:
            r0 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "luckyMoneyDetail.toByteArray() fail! "
            r3.append(r4)
            java.lang.String r0 = r0.getLocalizedMessage()
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r8, r0)
        L_0x0b6e:
            java.lang.String r0 = r10.f200409N
            java.lang.String r3 = "key_native_url"
            r2.putExtra(r3, r0)
            java.lang.String r0 = r10.f200408M
            java.lang.String r3 = "key_sendid"
            r2.putExtra(r3, r0)
            java.lang.String r0 = "key_anim_slide"
            r3 = 1
            r2.putExtra(r0, r3)
            java.lang.String r0 = r1.f199339j
            java.lang.String r3 = "key_detail_emoji_md5"
            r2.putExtra(r3, r0)
            int r0 = r1.f199340n
            java.lang.String r3 = "key_detail_emoji_type"
            r2.putExtra(r3, r0)
            android.content.Intent r0 = r31.getIntent()
            java.lang.String r0 = r0.getStringExtra(r15)
            r2.putExtra(r15, r0)
            android.content.Intent r0 = r31.getIntent()
            java.lang.String r3 = "key_from_username"
            java.lang.String r0 = r0.getStringExtra(r3)
            com.tencent.mm.plugin.luckymoney.model.a0 r4 = r1.f199337h
            if (r4 == 0) goto L_0x0bb5
            java.lang.String r4 = r4.f198954Q
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)
            if (r4 != 0) goto L_0x0bb5
            com.tencent.mm.plugin.luckymoney.model.a0 r0 = r1.f199337h
            java.lang.String r0 = r0.f198954Q
        L_0x0bb5:
            r2.putExtra(r3, r0)
            int r0 = r10.f200425X
            java.lang.String r3 = "scene_id"
            r2.putExtra(r3, r0)
            com.tencent.mm.plugin.luckymoney.model.LuckyMoneyEmojiSwitch r0 = r1.f199341o
            java.lang.String r1 = "key_emoji_switch"
            r2.putExtra(r1, r0)
            long r0 = r10.f200413R
            java.lang.String r3 = "key_msgid"
            r2.putExtra(r3, r0)
            r10.mo95701N7(r2)
            k20.a r0 = new k20.a
            r0.<init>()
            r0.mo10233c(r2)
            java.lang.Object[] r2 = r0.mo10232b()
            java.lang.String r3 = "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNotHookReceiveUI"
            java.lang.String r4 = "onSceneEnd"
            java.lang.String r5 = "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)Z"
            java.lang.String r6 = "Undefined"
            java.lang.String r7 = "startActivity"
            java.lang.String r8 = "(Landroid/content/Intent;)V"
            r1 = r31
            j20.C117292a.m165358d(r1, r2, r3, r4, r5, r6, r7, r8)
            java.lang.Object r0 = r0.mo10231a(r9)
            android.content.Intent r0 = (android.content.Intent) r0
            r10.startActivity(r0)
            java.lang.String r2 = "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNotHookReceiveUI"
            java.lang.String r3 = "onSceneEnd"
            java.lang.String r4 = "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)Z"
            java.lang.String r5 = "Undefined"
            java.lang.String r6 = "startActivity"
            java.lang.String r7 = "(Landroid/content/Intent;)V"
            j20.C117292a.m165359e(r1, r2, r3, r4, r5, r6, r7)
            r31.finish()
            r1 = 1
            return r1
        L_0x0c0c:
            r1 = 1
            nj3.C76879j.m92726T(r10, r3)
            r31.finish()
            return r1
        L_0x0c14:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.luckymoney.p073ui.LuckyMoneyNotHookReceiveUI.onSceneEnd(int, int, java.lang.String, ob0.y):boolean");
    }

    public void showLoading() {
        this.f200446w = C76879j.m92721O(getContext(), (String) null, 3, C0966R.style.f8510l3, getString(C0966R.string.gas), true, true, new C69473r());
    }
}
