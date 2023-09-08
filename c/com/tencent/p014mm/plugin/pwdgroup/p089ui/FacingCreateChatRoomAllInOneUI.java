package com.tencent.p014mm.plugin.pwdgroup.p089ui;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Message;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.TranslateAnimation;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import cc0.C92411b;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C67654r1;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.p136ui.widget.MMScrollGridView;
import com.tencent.p014mm.plugin.pwdgroup.p089ui.widget.MMCallBackScrollView;
import com.tencent.p014mm.plugin.pwdgroup.p089ui.widget.MMKeyBoardView;
import com.tencent.p014mm.plugin.pwdgroup.p089ui.widget.MMPwdInputView;
import com.tencent.p014mm.plugin.report.service.C5139t;
import com.tencent.p014mm.pluginsdk.model.lbs.Location;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.LocationUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import com.tencent.p014mm.storage.C72994y1;
import di3.C86312j;
import eb0.C97625j3;
import f40.C86709a0;
import ff2.C8019b;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;
import k20.C60958c;
import k20.C9556a;
import nc0.C76850a;
import nj3.C76879j;
import nm0.C89025e;
import ob0.C11385n;
import ob0.C117747y;
import p148ei.C7660a;
import p214om.C11502f;
import p447aw.C103918d;
import p702ts.C78085c;
import qg0.C12215a;
import qo3.C77429t;
import te3.C50109kc0;
import te3.C50241lc0;
import uf2.C52555a;
import vf2.C102186g;
import vf2.C22754a;
import vf2.C22755b;
import vf2.C22756c;
import vf2.C52885d;

/* renamed from: com.tencent.mm.plugin.pwdgroup.ui.FacingCreateChatRoomAllInOneUI */
public class FacingCreateChatRoomAllInOneUI extends MMActivity implements C11385n {

    /* renamed from: y0 */
    public static final /* synthetic */ int f53192y0 = 0;

    /* renamed from: A */
    public C102186g f53193A;

    /* renamed from: B */
    public View f53194B;

    /* renamed from: C */
    public TextView f53195C;

    /* renamed from: D */
    public MMScrollGridView f53196D;

    /* renamed from: E */
    public View f53197E;

    /* renamed from: F */
    public View f53198F;

    /* renamed from: G */
    public MMCallBackScrollView f53199G;

    /* renamed from: H */
    public ProgressDialog f53200H;

    /* renamed from: I */
    public TextView f53201I;

    /* renamed from: J */
    public boolean f53202J = false;

    /* renamed from: K */
    public boolean f53203K;

    /* renamed from: L */
    public Runnable f53204L;

    /* renamed from: M */
    public MMHandler f53205M;

    /* renamed from: N */
    public MTimerHandler f53206N = new MTimerHandler(new C18961f(), false);

    /* renamed from: P */
    public MMHandler f53207P = new C18962g();

    /* renamed from: Q */
    public C52555a f53208Q;

    /* renamed from: R */
    public C52555a f53209R;

    /* renamed from: S */
    public int f53210S;

    /* renamed from: T */
    public Animation f53211T;

    /* renamed from: U */
    public AnimationSet f53212U;

    /* renamed from: V */
    public Animation f53213V;

    /* renamed from: W */
    public MenuItem.OnMenuItemClickListener f53214W = new C18963h();

    /* renamed from: X */
    public MMPwdInputView.C18975a f53215X = new C18964i();

    /* renamed from: Y */
    public View.OnClickListener f53216Y = new C18965j();

    /* renamed from: Z */
    public MMKeyBoardView.C18974a f53217Z = new C18966k();

    /* renamed from: d */
    public C92411b f53218d;

    /* renamed from: e */
    public boolean f53219e = false;

    /* renamed from: f */
    public boolean f53220f;

    /* renamed from: g */
    public boolean f53221g;

    /* renamed from: h */
    public boolean f53222h;

    /* renamed from: i */
    public Location f53223i;

    /* renamed from: j */
    public String f53224j;

    /* renamed from: n */
    public MMPwdInputView f53225n;

    /* renamed from: o */
    public View f53226o;

    /* renamed from: p */
    public ProgressBar f53227p;

    /* renamed from: p0 */
    public C92411b.C92412a f53228p0 = new C18967l();

    /* renamed from: q */
    public TextView f53229q;

    /* renamed from: r */
    public MMKeyBoardView f53230r;

    /* renamed from: s */
    public TextView f53231s;

    /* renamed from: t */
    public boolean f53232t = false;

    /* renamed from: u */
    public boolean f53233u = false;

    /* renamed from: v */
    public boolean f53234v = false;

    /* renamed from: w */
    public String f53235w;

    /* renamed from: x */
    public LinkedList<C50241lc0> f53236x = new LinkedList<>();

    /* renamed from: x0 */
    public MTimerHandler f53237x0 = new MTimerHandler(new C18969m(), false);

    /* renamed from: y */
    public HashMap<String, C50241lc0> f53238y = new HashMap<>();

    /* renamed from: z */
    public LinkedList<C50241lc0> f53239z = new LinkedList<>();

    /* renamed from: com.tencent.mm.plugin.pwdgroup.ui.FacingCreateChatRoomAllInOneUI$a */
    public class C18956a implements DialogInterface.OnClickListener {
        public C18956a() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            ((C103918d) C86312j.m106911c(C103918d.class)).mo125783j7(FacingCreateChatRoomAllInOneUI.this.getContext());
            FacingCreateChatRoomAllInOneUI.this.finish();
        }
    }

    /* renamed from: com.tencent.mm.plugin.pwdgroup.ui.FacingCreateChatRoomAllInOneUI$b */
    public class C18957b implements DialogInterface.OnClickListener {
        public C18957b() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            FacingCreateChatRoomAllInOneUI.this.finish();
        }
    }

    /* renamed from: com.tencent.mm.plugin.pwdgroup.ui.FacingCreateChatRoomAllInOneUI$c */
    public class C18958c implements MMCallBackScrollView.C18973b {
        public C18958c() {
        }
    }

    /* renamed from: com.tencent.mm.plugin.pwdgroup.ui.FacingCreateChatRoomAllInOneUI$d */
    public class C18959d implements Animation.AnimationListener {

        /* renamed from: a */
        public final /* synthetic */ Animation f53243a;

        public C18959d(Animation animation) {
            this.f53243a = animation;
        }

        public void onAnimationEnd(Animation animation) {
            FacingCreateChatRoomAllInOneUI.this.f53225n.mo24160b();
            FacingCreateChatRoomAllInOneUI.this.f53225n.startAnimation(this.f53243a);
        }

        public void onAnimationRepeat(Animation animation) {
        }

        public void onAnimationStart(Animation animation) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.pwdgroup.ui.FacingCreateChatRoomAllInOneUI$e */
    public class C18960e implements Animation.AnimationListener {
        public C18960e() {
        }

        public void onAnimationEnd(Animation animation) {
            MMKeyBoardView mMKeyBoardView = FacingCreateChatRoomAllInOneUI.this.f53230r;
            if (mMKeyBoardView != null) {
                mMKeyBoardView.setKeyBoardEnable(true);
            }
        }

        public void onAnimationRepeat(Animation animation) {
        }

        public void onAnimationStart(Animation animation) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.pwdgroup.ui.FacingCreateChatRoomAllInOneUI$f */
    public class C18961f implements MTimerHandler.CallBack {
        public C18961f() {
        }

        public boolean onTimerExpired() {
            FacingCreateChatRoomAllInOneUI facingCreateChatRoomAllInOneUI = FacingCreateChatRoomAllInOneUI.this;
            if (facingCreateChatRoomAllInOneUI.f53234v || facingCreateChatRoomAllInOneUI.f53223i == null) {
                Log.m105928w("MicroMsg.Facing.FacingCreateChatRoomAllInONeUI", "cancel refresh chat room member.");
                return false;
            }
            Log.m105918d("MicroMsg.Facing.FacingCreateChatRoomAllInONeUI", "cpan[tryDoSearchScene]-----------");
            String str = facingCreateChatRoomAllInOneUI.f53224j;
            String str2 = facingCreateChatRoomAllInOneUI.f53235w;
            Location location = facingCreateChatRoomAllInOneUI.f53223i;
            facingCreateChatRoomAllInOneUI.f53208Q = new C52555a(0, str, str2, location.f211578d, location.f211579e, location.f211580f, location.f211581g, location.f211582h, location.f211583i);
            C97625j3.m125815e().mo123460f(facingCreateChatRoomAllInOneUI.f53208Q);
            return false;
        }
    }

    /* renamed from: com.tencent.mm.plugin.pwdgroup.ui.FacingCreateChatRoomAllInOneUI$g */
    public class C18962g extends MMHandler {
        public C18962g() {
        }

        public void handleMessage(Message message) {
            int i = message.what;
            if (i == 10001) {
                FacingCreateChatRoomAllInOneUI facingCreateChatRoomAllInOneUI = FacingCreateChatRoomAllInOneUI.this;
                C102186g gVar = facingCreateChatRoomAllInOneUI.f53193A;
                if (gVar != null) {
                    gVar.mo141727a(facingCreateChatRoomAllInOneUI.f53236x);
                }
            } else if (i == 10002) {
                FacingCreateChatRoomAllInOneUI.m20009H7(FacingCreateChatRoomAllInOneUI.this, 1);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.pwdgroup.ui.FacingCreateChatRoomAllInOneUI$h */
    public class C18963h implements MenuItem.OnMenuItemClickListener {
        public C18963h() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            FacingCreateChatRoomAllInOneUI.this.finish();
            return false;
        }
    }

    /* renamed from: com.tencent.mm.plugin.pwdgroup.ui.FacingCreateChatRoomAllInOneUI$i */
    public class C18964i implements MMPwdInputView.C18975a {
        public C18964i() {
        }
    }

    /* renamed from: com.tencent.mm.plugin.pwdgroup.ui.FacingCreateChatRoomAllInOneUI$j */
    public class C18965j implements View.OnClickListener {
        public C18965j() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/pwdgroup/ui/FacingCreateChatRoomAllInOneUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            FacingCreateChatRoomAllInOneUI facingCreateChatRoomAllInOneUI = FacingCreateChatRoomAllInOneUI.this;
            facingCreateChatRoomAllInOneUI.f53232t = false;
            FacingCreateChatRoomAllInOneUI.m20009H7(facingCreateChatRoomAllInOneUI, 1);
            C117292a.m165361g(this, "com/tencent/mm/plugin/pwdgroup/ui/FacingCreateChatRoomAllInOneUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.pwdgroup.ui.FacingCreateChatRoomAllInOneUI$k */
    public class C18966k implements MMKeyBoardView.C18974a {
        public C18966k() {
        }
    }

    /* renamed from: com.tencent.mm.plugin.pwdgroup.ui.FacingCreateChatRoomAllInOneUI$l */
    public class C18967l implements C92411b.C92412a {

        /* renamed from: com.tencent.mm.plugin.pwdgroup.ui.FacingCreateChatRoomAllInOneUI$l$a */
        public class C18968a implements DialogInterface.OnClickListener {
            public C18968a() {
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                LocationUtil.jumpToOpenGps(FacingCreateChatRoomAllInOneUI.this);
            }
        }

        public C18967l() {
        }

        public boolean onGetLocation(boolean z, float f, float f2, int i, double d, double d2, double d3) {
            boolean z2;
            Log.m105919d("MicroMsg.Facing.FacingCreateChatRoomAllInONeUI", "lat:%f lng:%f accuracy:%f", Float.valueOf(f2), Float.valueOf(f), Double.valueOf(d2));
            if (z) {
                Location location = new Location(f2, f, (int) d2, i, "", "");
                if (location.f211578d == -85.0f || location.f211579e == -1000.0f) {
                    Log.m105918d("MicroMsg.Radar.Location", "mac and cellId is null");
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (!z2) {
                    FacingCreateChatRoomAllInOneUI facingCreateChatRoomAllInOneUI = FacingCreateChatRoomAllInOneUI.this;
                    facingCreateChatRoomAllInOneUI.f53223i = location;
                    facingCreateChatRoomAllInOneUI.f53221g = true;
                    FacingCreateChatRoomAllInOneUI.m20010I7(facingCreateChatRoomAllInOneUI);
                }
            } else {
                if (!FacingCreateChatRoomAllInOneUI.this.f53203K && !LocationUtil.isGpsEnable()) {
                    FacingCreateChatRoomAllInOneUI facingCreateChatRoomAllInOneUI2 = FacingCreateChatRoomAllInOneUI.this;
                    facingCreateChatRoomAllInOneUI2.f53203K = true;
                    C76879j.m92709C(facingCreateChatRoomAllInOneUI2, facingCreateChatRoomAllInOneUI2.getString(C0966R.string.fez), FacingCreateChatRoomAllInOneUI.this.getString(C0966R.string.a3h), FacingCreateChatRoomAllInOneUI.this.getString(C0966R.string.fyd), FacingCreateChatRoomAllInOneUI.this.getString(C0966R.string.f7926wf), false, new C18968a(), (DialogInterface.OnClickListener) null);
                }
                FacingCreateChatRoomAllInOneUI.this.f53221g = false;
            }
            return false;
        }
    }

    /* renamed from: com.tencent.mm.plugin.pwdgroup.ui.FacingCreateChatRoomAllInOneUI$m */
    public class C18969m implements MTimerHandler.CallBack {
        public C18969m() {
        }

        public boolean onTimerExpired() {
            FacingCreateChatRoomAllInOneUI facingCreateChatRoomAllInOneUI = FacingCreateChatRoomAllInOneUI.this;
            facingCreateChatRoomAllInOneUI.f53220f = false;
            facingCreateChatRoomAllInOneUI.mo24135M7(C18971o.Unknow);
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.pwdgroup.ui.FacingCreateChatRoomAllInOneUI$n */
    public class C18970n implements C77429t {
        public C18970n() {
        }

        /* renamed from: a */
        public void mo8330a(boolean z, String str, boolean z2) {
            if (!z) {
                FacingCreateChatRoomAllInOneUI.this.finish();
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.pwdgroup.ui.FacingCreateChatRoomAllInOneUI$o */
    public enum C18971o {
        Normal,
        Loading,
        ToSimple,
        Unknow
    }

    /* renamed from: H7 */
    public static void m20009H7(FacingCreateChatRoomAllInOneUI facingCreateChatRoomAllInOneUI, int i) {
        facingCreateChatRoomAllInOneUI.f53200H = C76879j.m92723Q(facingCreateChatRoomAllInOneUI, facingCreateChatRoomAllInOneUI.getString(C0966R.string.a3h), facingCreateChatRoomAllInOneUI.getString(C0966R.string.a4d), true, true, new C22755b(facingCreateChatRoomAllInOneUI));
        facingCreateChatRoomAllInOneUI.mo24134L7();
        String str = facingCreateChatRoomAllInOneUI.f53224j;
        String str2 = facingCreateChatRoomAllInOneUI.f53235w;
        Location location = facingCreateChatRoomAllInOneUI.f53223i;
        C97625j3.m125815e().mo123460f(new C52555a(i, str, str2, location.f211578d, location.f211579e, location.f211580f, location.f211581g, location.f211582h, location.f211583i));
    }

    /* renamed from: I7 */
    public static void m20010I7(FacingCreateChatRoomAllInOneUI facingCreateChatRoomAllInOneUI) {
        facingCreateChatRoomAllInOneUI.getClass();
        C18971o oVar = C18971o.Loading;
        Log.m105918d("MicroMsg.Facing.FacingCreateChatRoomAllInONeUI", "cpan[tryGetChatRoomUser]");
        MTimerHandler mTimerHandler = facingCreateChatRoomAllInOneUI.f53237x0;
        if (mTimerHandler != null) {
            mTimerHandler.stopTimer();
        }
        if (!facingCreateChatRoomAllInOneUI.f53221g) {
            Log.m105928w("MicroMsg.Facing.FacingCreateChatRoomAllInONeUI", "tryGetChatRoomUser location is no ready.");
            facingCreateChatRoomAllInOneUI.mo24135M7(oVar);
            MTimerHandler mTimerHandler2 = facingCreateChatRoomAllInOneUI.f53237x0;
            if (mTimerHandler2 != null) {
                mTimerHandler2.startTimer(15000);
                return;
            }
            return;
        }
        if (facingCreateChatRoomAllInOneUI.f53220f) {
            facingCreateChatRoomAllInOneUI.mo24135M7(oVar);
        }
        if (facingCreateChatRoomAllInOneUI.f53221g && facingCreateChatRoomAllInOneUI.f53220f && !facingCreateChatRoomAllInOneUI.f53222h) {
            Log.m105918d("MicroMsg.Facing.FacingCreateChatRoomAllInONeUI", "do tryGetChatRoomUser");
            facingCreateChatRoomAllInOneUI.f53222h = true;
            facingCreateChatRoomAllInOneUI.f53220f = false;
            String str = facingCreateChatRoomAllInOneUI.f53224j;
            Location location = facingCreateChatRoomAllInOneUI.f53223i;
            facingCreateChatRoomAllInOneUI.f53209R = new C52555a(0, str, "", location.f211578d, location.f211579e, location.f211580f, location.f211581g, location.f211582h, location.f211583i);
            C97625j3.m125815e().mo123460f(facingCreateChatRoomAllInOneUI.f53209R);
        }
    }

    /* renamed from: J7 */
    public final void mo24132J7() {
        C92411b ms = ((C78085c) C86312j.m106911c(C78085c.class)).mo108056ms();
        this.f53218d = ms;
        ms.mo126407a(this.f53228p0, true);
        C97625j3.m125815e().mo123455a(C89025e.C89026a.CTRL_INDEX, this);
        getWindow().getDecorView().setSystemUiVisibility(1280);
        initView();
        C5139t.m5183e(3, 10);
    }

    /* renamed from: K7 */
    public final void mo24133K7() {
        Animation loadAnimation = AnimationUtils.loadAnimation(this, C0966R.C0968anim.f2329q);
        Animation loadAnimation2 = AnimationUtils.loadAnimation(this, C0966R.C0968anim.f2328p);
        loadAnimation.setInterpolator(new AccelerateDecelerateInterpolator());
        loadAnimation.setAnimationListener(new C18959d(loadAnimation2));
        loadAnimation2.setAnimationListener(new C18960e());
        MMPwdInputView mMPwdInputView = this.f53225n;
        if (mMPwdInputView != null) {
            mMPwdInputView.startAnimation(loadAnimation);
        }
        MMKeyBoardView mMKeyBoardView = this.f53230r;
        if (mMKeyBoardView != null) {
            mMKeyBoardView.setKeyBoardEnable(false);
        }
    }

    /* renamed from: L7 */
    public final void mo24134L7() {
        this.f53234v = true;
        MTimerHandler mTimerHandler = this.f53206N;
        if (mTimerHandler != null) {
            mTimerHandler.stopTimer();
        }
        C97625j3.m125815e().mo123458d(this.f53208Q);
    }

    /* renamed from: M7 */
    public final void mo24135M7(C18971o oVar) {
        if (this.f53229q != null) {
            int ordinal = oVar.ordinal();
            if (ordinal == 0) {
                MMKeyBoardView mMKeyBoardView = this.f53230r;
                if (mMKeyBoardView != null) {
                    mMKeyBoardView.setKeyBoardEnable(true);
                }
                this.f53219e = false;
                this.f53227p.setVisibility(8);
                this.f53229q.setVisibility(8);
            } else if (ordinal == 1) {
                MMKeyBoardView mMKeyBoardView2 = this.f53230r;
                if (mMKeyBoardView2 != null) {
                    mMKeyBoardView2.setKeyBoardEnable(false);
                }
                this.f53229q.setText(C0966R.string.hqx);
                this.f53227p.setVisibility(0);
                this.f53229q.setVisibility(8);
            } else if (ordinal == 2) {
                MMKeyBoardView mMKeyBoardView3 = this.f53230r;
                if (mMKeyBoardView3 != null) {
                    mMKeyBoardView3.setKeyBoardEnable(true);
                }
                this.f53227p.setVisibility(8);
                this.f53229q.setVisibility(0);
                this.f53229q.setText(C0966R.string.hqu);
                mo24133K7();
            } else if (ordinal != 3) {
                Log.m105928w("MicroMsg.Facing.FacingCreateChatRoomAllInONeUI", "unknow statue tip");
            } else {
                MMKeyBoardView mMKeyBoardView4 = this.f53230r;
                if (mMKeyBoardView4 != null) {
                    mMKeyBoardView4.setKeyBoardEnable(true);
                }
                this.f53227p.setVisibility(8);
                this.f53229q.setVisibility(0);
                this.f53229q.setText(C0966R.string.hqw);
                mo24133K7();
            }
        }
    }

    public int getForceOrientation() {
        return 1;
    }

    public int getLayoutId() {
        return C0966R.C0971layout.a69;
    }

    public void hideLoading() {
        ProgressDialog progressDialog = this.f53200H;
        if (progressDialog != null && progressDialog.isShowing()) {
            this.f53200H.dismiss();
        }
    }

    public Set<Class<? extends UIComponent>> importUIComponents() {
        HashSet hashSet = new HashSet(super.importUIComponents());
        hashSet.add(C8019b.class);
        return hashSet;
    }

    public void initView() {
        setMMTitle((int) C0966R.string.cw_);
        setBackBtn(this.f53214W);
        setActionbarColor(getResources().getColor(C0966R.color.ahf));
        setNavigationbarColor(getResources().getColor(C0966R.color.a9a));
        this.f53226o = findViewById(C0966R.C0970id.crn);
        this.f53227p = (ProgressBar) findViewById(C0966R.C0970id.crm);
        this.f53229q = (TextView) findViewById(C0966R.C0970id.cro);
        this.f53230r = (MMKeyBoardView) findViewById(C0966R.C0970id.crl);
        this.f53231s = (TextView) findViewById(C0966R.C0970id.crk);
        MMPwdInputView mMPwdInputView = (MMPwdInputView) findViewById(C0966R.C0970id.cri);
        this.f53225n = mMPwdInputView;
        mMPwdInputView.setOnFinishInputListener(this.f53215X);
        this.f53225n.requestFocus();
        this.f53230r.setOnInputDeleteListener(this.f53217Z);
        mo24135M7(C18971o.Normal);
        this.f53194B = findViewById(C0966R.C0970id.crb);
        this.f53195C = (TextView) findViewById(C0966R.C0970id.crd);
        MMScrollGridView mMScrollGridView = (MMScrollGridView) findViewById(C0966R.C0970id.crc);
        this.f53196D = mMScrollGridView;
        mMScrollGridView.setVisibility(4);
        ((Button) findViewById(C0966R.C0970id.cre)).setOnClickListener(this.f53216Y);
        this.f53197E = findViewById(C0966R.C0970id.crf);
        this.f53198F = findViewById(C0966R.C0970id.crg);
        this.f53195C.setText(C0966R.string.f360414cm2);
        this.f53199G = (MMCallBackScrollView) findViewById(C0966R.C0970id.crp);
        this.f53201I = (TextView) findViewById(C0966R.C0970id.crj);
        this.f53199G.setMMOnScrollListener(new C18958c());
        C102186g gVar = new C102186g(this);
        this.f53193A = gVar;
        this.f53196D.setAdapter(gVar);
        this.f53193A.mo141727a(this.f53236x);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i != 30764) {
            return;
        }
        if (intent != null) {
            Bundle bundleExtra = intent.getBundleExtra("result_data");
            if (bundleExtra == null || !bundleExtra.getString("go_next", "").equals("gdpr_auth_location")) {
                finish();
                return;
            }
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_GDPR_LOCATION_PERMISSION_DESCRIBE_CONFIRM_BOOLEAN_SYNC, Boolean.TRUE);
            ((C103918d) C86312j.m106911c(C103918d.class)).mo125790zt(this, "android.permission.ACCESS_FINE_LOCATION", 64);
            return;
        }
        finish();
    }

    public void onBackPressed() {
        super.onBackPressed();
        finish();
    }

    public void onCreate(Bundle bundle) {
        Class cls = C103918d.class;
        customfixStatusbar(true);
        super.onCreate(bundle);
        if (!C76850a.m92639k((String) C86709a0.m107535s().mo121142i().mo119684e(274436, (Object) null))) {
            boolean vp02 = ((C103918d) C86312j.m106911c(cls)).vp0(this, "android.permission.ACCESS_FINE_LOCATION", 64, (String) null, getString(C0966R.string.cm5), new C18970n());
            Log.m105925i("MicroMsg.Facing.FacingCreateChatRoomAllInONeUI", "summerper checkPermission checkCamera[%b]", Boolean.valueOf(vp02));
            if (!vp02) {
                return;
            }
        } else if (!((C103918d) C86312j.m106911c(cls)).Lb0(this, "android.permission.ACCESS_FINE_LOCATION")) {
            if (!((Boolean) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_GDPR_LOCATION_PERMISSION_DESCRIBE_CONFIRM_BOOLEAN_SYNC, Boolean.FALSE)).booleanValue()) {
                C12215a.m11778c(this, getString(C0966R.string.gbq, new Object[]{LocaleUtil.getApplicationLanguage()}), 30764, true);
                return;
            }
            ((C103918d) C86312j.m106911c(cls)).mo125790zt(this, "android.permission.ACCESS_FINE_LOCATION", 64);
            return;
        }
        mo24132J7();
    }

    public void onDestroy() {
        Runnable runnable;
        C97625j3.m125815e().mo123470p(C89025e.C89026a.CTRL_INDEX, this);
        C92411b bVar = this.f53218d;
        if (bVar != null) {
            bVar.mo126408b(this.f53228p0);
        }
        if (!this.f53233u) {
            C97625j3.m125815e().mo123457c(C89025e.C89026a.CTRL_INDEX);
            Location location = this.f53223i;
            if (location != null) {
                this.f53209R = new C52555a(2, this.f53224j, "", location.f211578d, location.f211579e, location.f211580f, location.f211581g, location.f211582h, location.f211583i);
                C97625j3.m125815e().mo123460f(this.f53209R);
            }
        }
        if (this.f53202J) {
            mo24134L7();
        }
        MMHandler mMHandler = this.f53205M;
        if (!(mMHandler == null || (runnable = this.f53204L) == null)) {
            mMHandler.removeCallbacks(runnable);
        }
        super.onDestroy();
    }

    public void onPause() {
        C92411b bVar = this.f53218d;
        if (bVar != null) {
            bVar.mo126408b(this.f53228p0);
        }
        if (this.f53202J) {
            mo24134L7();
        }
        super.onPause();
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (iArr == null || iArr.length <= 0) {
            Log.m105925i("MicroMsg.Facing.FacingCreateChatRoomAllInONeUI", "onRequestPermissionsResult grantResults length 0. requestCode[%d], tid[%d]", Integer.valueOf(i), Long.valueOf(Thread.currentThread().getId()));
            return;
        }
        Log.m105925i("MicroMsg.Facing.FacingCreateChatRoomAllInONeUI", "onRequestPermissionsResult requestCode[%d],grantResults[%d] tid[%d]", Integer.valueOf(i), Integer.valueOf(iArr[0]), Long.valueOf(Thread.currentThread().getId()));
        if (i == 64) {
            if (iArr[0] == 0) {
                mo24132J7();
                return;
            }
            C76879j.m92709C(this, getString(C0966R.string.f361129hi0), getString(C0966R.string.hif), getString(C0966R.string.fyd), getString(C0966R.string.auj), false, new C18956a(), new C18957b());
        }
    }

    public void onResume() {
        C92411b bVar = this.f53218d;
        if (bVar != null) {
            bVar.mo126407a(this.f53228p0, true);
        }
        if (this.f53202J) {
            this.f53234v = false;
            MTimerHandler mTimerHandler = this.f53206N;
            if (mTimerHandler != null) {
                mTimerHandler.startTimer(0);
            }
        }
        super.onResume();
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        int i3 = i2;
        C18971o oVar = C18971o.ToSimple;
        C18971o oVar2 = C18971o.Unknow;
        Log.m105919d("MicroMsg.Facing.FacingCreateChatRoomAllInONeUI", "cpan[onSceneEnd]errType:%d errCode:%d errMsg:%s", Integer.valueOf(i), Integer.valueOf(i2), str);
        if (yVar.getType() != 653) {
            Log.m105928w("MicroMsg.Facing.FacingCreateChatRoomAllInONeUI", "cpan[onSceneEnd] unknow scene type");
            return;
        }
        C52555a aVar = (C52555a) yVar;
        int i4 = aVar.f146780f;
        if (i4 == 0) {
            this.f53222h = false;
            if (this.f53202J) {
                MTimerHandler mTimerHandler = this.f53206N;
                if (mTimerHandler != null) {
                    mTimerHandler.startTimer(3000);
                }
                if (i == 0 && i3 == 0) {
                    LinkedList<C50241lc0> linkedList = ((C50109kc0) aVar.f146779e.f127056b.f127083a).f136657f;
                    if (this.f53205M == null) {
                        this.f53205M = new MMHandler("FacingCreateChatRoomAllInOneUI");
                    }
                    Runnable runnable = this.f53204L;
                    if (runnable != null) {
                        this.f53205M.removeCallbacks(runnable);
                    }
                    C52885d dVar = new C52885d(this, linkedList);
                    this.f53204L = dVar;
                    this.f53205M.post(dVar);
                    this.f53235w = ((C50109kc0) aVar.f146779e.f127056b.f127083a).f136655d;
                }
            } else if (i == 0 && i3 == 0) {
                mo24135M7(C18971o.Normal);
                int height = this.f53231s.getHeight();
                this.f53210S = height;
                Log.m105919d("MicroMsg.Facing.FacingCreateChatRoomAllInONeUI", "mFacingInputMsgViewHeigth:%d", Integer.valueOf(height));
                this.f53211T = AnimationUtils.loadAnimation(this, C0966R.C0968anim.f2388bp);
                this.f53213V = AnimationUtils.loadAnimation(this, C0966R.C0968anim.f2378bf);
                AnimationSet animationSet = new AnimationSet(true);
                this.f53212U = animationSet;
                animationSet.addAnimation(AnimationUtils.loadAnimation(this, C0966R.C0968anim.f2485e9));
                TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, 0.0f, (float) (-this.f53210S));
                translateAnimation.setDuration(300);
                this.f53212U.addAnimation(translateAnimation);
                this.f53211T.setDuration(200);
                this.f53212U.setDuration(300);
                this.f53213V.setDuration(300);
                this.f53211T.setInterpolator(new AccelerateDecelerateInterpolator());
                this.f53212U.setInterpolator(new AccelerateDecelerateInterpolator());
                this.f53213V.setInterpolator(new AccelerateDecelerateInterpolator());
                this.f53212U.setFillAfter(true);
                translateAnimation.setFillAfter(true);
                this.f53212U.setAnimationListener(new C22754a(this));
                this.f53225n.setVisibility(4);
                this.f53225n.setAnimation(translateAnimation);
                this.f53230r.startAnimation(this.f53211T);
                this.f53226o.startAnimation(this.f53211T);
                this.f53231s.startAnimation(this.f53211T);
                this.f53197E.startAnimation(this.f53213V);
                this.f53194B.startAnimation(this.f53212U);
                View view = this.f53197E;
                C9556a aVar2 = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar2.mo10233c(4);
                View view2 = view;
                C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/pwdgroup/ui/FacingCreateChatRoomAllInOneUI", "switchToDetailUI", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/pwdgroup/ui/FacingCreateChatRoomAllInOneUI", "switchToDetailUI", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                this.f53230r.setVisibility(8);
                this.f53231s.setVisibility(8);
                this.f53202J = true;
                this.f53234v = false;
                MTimerHandler mTimerHandler2 = this.f53206N;
                if (mTimerHandler2 != null) {
                    mTimerHandler2.startTimer(0);
                }
            } else if (i3 == -431) {
                this.f53219e = true;
                mo24135M7(oVar);
            } else {
                this.f53219e = true;
                mo24135M7(oVar2);
            }
        } else if (i4 == 3) {
            if (i != 0 || i3 != 0) {
                if (i3 == -431) {
                    mo24135M7(oVar);
                    this.f53219e = true;
                    return;
                }
                mo24135M7(oVar2);
            }
        } else if (i4 != 1) {
            hideLoading();
        } else if (i == 0 && i3 == 0) {
            hideLoading();
            String str2 = ((C50109kc0) aVar.f146779e.f127056b.f127083a).f136658g;
            Log.m105919d("MicroMsg.Facing.FacingCreateChatRoomAllInONeUI", "ChatRoomName is:%s", str2 + "");
            this.f53233u = true;
            finish();
            Intent intent = new Intent();
            intent.putExtra("Chat_User", str2);
            intent.putExtra("enter_room_from_uri_jump", true);
            ((C67654r1) ((C11502f) C86312j.m106911c(C11502f.class)).mo11462yM()).mo93173f(intent, this);
        } else if (i3 == -432 && !this.f53232t) {
            this.f53232t = true;
            this.f53207P.sendEmptyMessageDelayed(10002, 3000);
        } else if (i3 == -23) {
            hideLoading();
            C76879j.m92754y(this, getString(C0966R.string.cm4), "", getString(C0966R.string.a18), new C22756c(this));
            MTimerHandler mTimerHandler3 = this.f53206N;
            if (mTimerHandler3 != null) {
                mTimerHandler3.startTimer(3000);
            }
        } else {
            hideLoading();
            C7660a a = C7660a.m7782a(str);
            if (a != null) {
                a.mo8792b(getContext(), (DialogInterface.OnClickListener) null, (DialogInterface.OnClickListener) null);
            } else {
                C76879j.m92754y(this, getString(C0966R.string.hqw), "", getString(C0966R.string.a18), new C22756c(this));
            }
            MTimerHandler mTimerHandler4 = this.f53206N;
            if (mTimerHandler4 != null) {
                mTimerHandler4.startTimer(3000);
            }
        }
    }
}
