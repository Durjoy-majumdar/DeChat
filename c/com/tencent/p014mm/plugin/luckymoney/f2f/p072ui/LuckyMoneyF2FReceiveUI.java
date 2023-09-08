package com.tencent.p014mm.plugin.luckymoney.f2f.p072ui;

import android.animation.ValueAnimator;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import b63.C113146l;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.modelavatar.C68097n;
import com.tencent.p014mm.modelavatar.C68098o;
import com.tencent.p014mm.plugin.luckymoney.model.C69158a0;
import com.tencent.p014mm.plugin.luckymoney.model.C69242l1;
import com.tencent.p014mm.plugin.luckymoney.p073ui.LuckyMoneyBaseUI;
import com.tencent.p014mm.plugin.wallet_core.id_verify.util.RealnameGuideHelper;
import com.tencent.p014mm.plugin.wallet_core.utils.C72502o;
import com.tencent.p014mm.plugin.wallet_core.utils.C72506r;
import com.tencent.p014mm.pluginsdk.p133ui.applet.CdnImageView;
import com.tencent.p014mm.sdk.platformtools.BackwardSupportUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import eb0.C45628s0;
import fy3.C32227p;
import j20.C117292a;
import java.io.IOException;
import java.util.ArrayList;
import k20.C60958c;
import k20.C9556a;
import nj3.C76879j;
import nj3.C88989a;
import ob0.C117747y;
import p196ln.C76706g;
import pe3.C89349b;
import r32.C77485c;
import rx3.C13598b0;
import s32.C77616f;
import s32.C77617g;
import s32.C77618h;
import te3.C64320dn3;
import te3.C77935gl2;
import yq3.C79148e;

@C88989a(3)
/* renamed from: com.tencent.mm.plugin.luckymoney.f2f.ui.LuckyMoneyF2FReceiveUI */
public class LuckyMoneyF2FReceiveUI extends LuckyMoneyBaseUI {

    /* renamed from: g */
    public View f198877g;

    /* renamed from: h */
    public CdnImageView f198878h;

    /* renamed from: i */
    public TextView f198879i;

    /* renamed from: j */
    public TextView f198880j;

    /* renamed from: n */
    public String f198881n;

    /* renamed from: o */
    public String f198882o;

    /* renamed from: p */
    public String f198883p;

    /* renamed from: q */
    public String f198884q;

    /* renamed from: r */
    public String f198885r;

    /* renamed from: s */
    public String f198886s;

    /* renamed from: t */
    public int f198887t;

    /* renamed from: u */
    public DisplayMetrics f198888u;

    /* renamed from: v */
    public ValueAnimator f198889v;

    /* renamed from: w */
    public ValueAnimator f198890w;

    /* renamed from: x */
    public Intent f198891x;

    /* renamed from: y */
    public long f198892y = 0;

    /* renamed from: z */
    public boolean f198893z = false;

    /* renamed from: com.tencent.mm.plugin.luckymoney.f2f.ui.LuckyMoneyF2FReceiveUI$a */
    public class C69146a implements DialogInterface.OnClickListener {
        public C69146a() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            LuckyMoneyF2FReceiveUI.this.finish();
        }
    }

    /* renamed from: com.tencent.mm.plugin.luckymoney.f2f.ui.LuckyMoneyF2FReceiveUI$b */
    public class C69147b implements View.OnClickListener {
        public C69147b() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/luckymoney/f2f/ui/LuckyMoneyF2FReceiveUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            LuckyMoneyF2FReceiveUI.this.f198890w.cancel();
            LuckyMoneyF2FReceiveUI.this.finish();
            C117292a.m165361g(this, "com/tencent/mm/plugin/luckymoney/f2f/ui/LuckyMoneyF2FReceiveUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.luckymoney.f2f.ui.LuckyMoneyF2FReceiveUI$c */
    public class C69148c implements C72506r.C72510d {

        /* renamed from: a */
        public final /* synthetic */ C77485c f198896a;

        public C69148c(C77485c cVar) {
            this.f198896a = cVar;
        }

        /* renamed from: a */
        public void mo95297a(C77935gl2 gl22) {
            C89349b bVar;
            if (gl22.f227479e != 2 || (bVar = this.f198896a.f225949y) == null) {
                LuckyMoneyF2FReceiveUI.this.finish();
                return;
            }
            LuckyMoneyF2FReceiveUI.this.doSceneProgress(new C77485c(LuckyMoneyF2FReceiveUI.this.f198881n, bVar), true);
        }
    }

    /* renamed from: com.tencent.mm.plugin.luckymoney.f2f.ui.LuckyMoneyF2FReceiveUI$d */
    public class C69149d implements C32227p<C72502o.C72503a, Long, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C89349b f198898d;

        public C69149d(C89349b bVar) {
            this.f198898d = bVar;
        }

        public Object invoke(Object obj, Object obj2) {
            C72502o.C72503a aVar = (C72502o.C72503a) obj;
            long longValue = ((Long) obj2).longValue();
            LuckyMoneyF2FReceiveUI luckyMoneyF2FReceiveUI = LuckyMoneyF2FReceiveUI.this;
            if (longValue != luckyMoneyF2FReceiveUI.f198892y) {
                Log.m105920e("LuckyMoneyF2FReceiveUI", "unexpected halfpage callback");
                return C13598b0.f38549a;
            }
            luckyMoneyF2FReceiveUI.f198892y = 0;
            if (aVar == C72502o.C72503a.Continue) {
                LuckyMoneyF2FReceiveUI.this.doSceneProgress(new C77485c(luckyMoneyF2FReceiveUI.f198881n, this.f198898d), true);
            } else {
                luckyMoneyF2FReceiveUI.finish();
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.luckymoney.f2f.ui.LuckyMoneyF2FReceiveUI$e */
    public class C69150e implements DialogInterface.OnClickListener {
        public C69150e() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            LuckyMoneyF2FReceiveUI.this.finish();
        }
    }

    /* renamed from: com.tencent.mm.plugin.luckymoney.f2f.ui.LuckyMoneyF2FReceiveUI$f */
    public class C69151f implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C77485c f198901d;

        public C69151f(C77485c cVar) {
            this.f198901d = cVar;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            C89349b bVar = this.f198901d.f225949y;
            if (bVar == null || bVar.f257327a.length <= 0) {
                LuckyMoneyF2FReceiveUI.this.finish();
                return;
            }
            LuckyMoneyF2FReceiveUI.this.doSceneProgress(new C77485c(LuckyMoneyF2FReceiveUI.this.f198881n, bVar), true);
        }
    }

    /* renamed from: com.tencent.mm.plugin.luckymoney.f2f.ui.LuckyMoneyF2FReceiveUI$g */
    public class C69152g implements C79148e.C79149a {
        public C69152g(LuckyMoneyF2FReceiveUI luckyMoneyF2FReceiveUI) {
        }

        public Intent onProcessEnd(int i, Bundle bundle) {
            return null;
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.b9r;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f198877g = findViewById(C0966R.C0970id.gic);
        this.f198878h = (CdnImageView) findViewById(C0966R.C0970id.gig);
        this.f198879i = (TextView) findViewById(C0966R.C0970id.gih);
        this.f198880j = (TextView) findViewById(C0966R.C0970id.gij);
        ((ImageView) findViewById(C0966R.C0970id.gip)).setOnClickListener(new C69147b());
        View contentView = getContentView();
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        C117292a.m165358d(contentView, aVar.mo10232b(), "com/tencent/mm/plugin/luckymoney/f2f/ui/LuckyMoneyF2FReceiveUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        contentView.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(contentView, "com/tencent/mm/plugin/luckymoney/f2f/ui/LuckyMoneyF2FReceiveUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f198881n = getIntent().getStringExtra("key_share_url");
        C113146l.m154807e(6);
        doSceneProgress(new C77485c(this.f198881n, (C89349b) null), true);
        this.f198888u = getResources().getDisplayMetrics();
        this.f198889v = ValueAnimator.ofFloat(new float[]{1.0f, 0.0f}).setDuration(300);
        ValueAnimator duration = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f}).setDuration(300);
        this.f198890w = duration;
        duration.setStartDelay(1000);
        this.f198889v.addUpdateListener(new C77616f(this));
        this.f198889v.addListener(new C77617g(this));
        this.f198890w.addListener(new C77618h(this));
    }

    public void onResume() {
        super.onResume();
        addSceneEndListener(1997);
        if (this.f198893z) {
            finish();
        }
    }

    public boolean onSceneEnd(int i, int i2, String str, C117747y yVar) {
        Log.m105925i("LuckyMoneyF2FReceiveUI", "errType: %d,errCode: %d,errMsg: %s", Integer.valueOf(i), Integer.valueOf(i2), str);
        if (!(yVar instanceof C77485c)) {
            return true;
        }
        C77485c cVar = (C77485c) yVar;
        int i3 = cVar.f225936i;
        int i4 = cVar.f225938n;
        this.f198887t = cVar.f225940p;
        int i5 = cVar.f225942r;
        String str2 = cVar.f225943s;
        String str3 = cVar.f225944t;
        Log.m105925i("LuckyMoneyF2FReceiveUI", "hbStatus: %d, recvStatus:%d, errorType:%d", Integer.valueOf(i3), Integer.valueOf(cVar.f225938n), Integer.valueOf(cVar.f225937j));
        if (C72506r.m84839e(cVar.f225934g.f228007w)) {
            new C72506r(this).mo99913c(cVar.f225934g.f228007w, new C69148c(cVar));
            return true;
        }
        C89349b bVar = cVar.f225934g.f228009y;
        if (bVar == null || bVar.f257327a.length <= 0) {
            Log.m105929w("HABBYGE-MALI", "recvStatus=%s, hbStatus=%s", Integer.valueOf(i4), Integer.valueOf(i3));
            if (i4 == 2) {
                if (i3 == 5) {
                    C76879j.m92749t(this, getString(C0966R.string.gg_), "", new C69150e());
                } else {
                    this.f198882o = cVar.f225935h;
                    this.f198883p = cVar.f225939o;
                    this.f198884q = cVar.f225947w;
                    this.f198885r = cVar.f225948x;
                    this.f198886s = cVar.f225945u;
                    this.f198891x = new Intent();
                    if (Util.isNullOrNil(this.f198884q)) {
                        if (!Util.isNullOrNil(this.f198883p) && !C45628s0.m50740E(this.f198883p)) {
                            C68097n nVar = new C68097n();
                            nVar.f195728a = this.f198883p;
                            ((C68098o) ((C76706g) C86312j.m106911c(C76706g.class)).mo106832eg()).mo93608Yt(nVar);
                        }
                        C69242l1.m81595a(this.f198878h, (String) null, this.f198883p);
                    } else {
                        int fromDPToPix = BackwardSupportUtil.BitmapFactory.fromDPToPix(this, 48.0f);
                        this.f198878h.setRoundCorner(true);
                        this.f198878h.mo100288c(this.f198884q, fromDPToPix, fromDPToPix, C0966R.C0969drawable.bfb);
                    }
                    C69158a0 a0Var = new C69158a0();
                    a0Var.f198974q = (long) this.f198887t;
                    a0Var.f198971n = this.f198882o;
                    a0Var.f198965e = i3;
                    a0Var.f198939A = i4;
                    a0Var.f198943E = str3;
                    a0Var.f198942D = i5;
                    a0Var.f198954Q = this.f198883p;
                    a0Var.f198952N = str2;
                    if (Util.isNullOrNil(this.f198885r)) {
                        a0Var.f198969i = C69242l1.m81602h(this.f198883p);
                    } else {
                        a0Var.f198969i = this.f198885r;
                    }
                    a0Var.f198950L = this.f198886s;
                    a0Var.f198964d = 2;
                    Log.m105925i("LuckyMoneyF2FReceiveUI", "is most lucky %d", Integer.valueOf(cVar.f225946v));
                    if (cVar.f225946v > 0) {
                        a0Var.f198967g = getString(C0966R.string.gh4);
                    }
                    if (Util.isNullOrNil(this.f198884q)) {
                        a0Var.f198970j = C69242l1.m81599e(this.f198883p);
                    } else {
                        a0Var.f198970j = this.f198884q;
                    }
                    try {
                        this.f198891x.putExtra("key_detail_info", a0Var.toByteArray());
                        C64320dn3 dn32 = cVar.f225941q;
                        if (dn32 != null) {
                            RealnameGuideHelper realnameGuideHelper = new RealnameGuideHelper();
                            realnameGuideHelper.mo99373d(String.valueOf(dn32.f182785d), dn32.f182786e, dn32.f182787f, dn32.f182788g, dn32.f182789h, yVar.getType());
                            this.f198891x.putExtra("key_realname_guide_helper", realnameGuideHelper);
                        }
                    } catch (IOException e) {
                        Log.m105920e("LuckyMoneyF2FReceiveUI", "lucky detail toBytes error: " + e.getMessage());
                    }
                    if (!Util.isNullOrNil(this.f198885r)) {
                        C69242l1.m81616v(this, this.f198879i, this.f198885r);
                    } else {
                        if (!Util.isNullOrNil(this.f198882o, this.f198883p)) {
                            C69242l1.m81616v(this, this.f198879i, C69242l1.m81602h(this.f198883p));
                        }
                    }
                    C69242l1.m81616v(this, this.f198880j, this.f198886s);
                    this.f198889v.start();
                    View contentView = getContentView();
                    C9556a aVar = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar.mo10233c(0);
                    View view = contentView;
                    C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/luckymoney/f2f/ui/LuckyMoneyF2FReceiveUI", "showRedPacket", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    contentView.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                    C117292a.m165359e(view, "com/tencent/mm/plugin/luckymoney/f2f/ui/LuckyMoneyF2FReceiveUI", "showRedPacket", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                return true;
            }
            if (cVar.f225941q != null) {
                Log.m105924i("LuckyMoneyF2FReceiveUI", "need real name verify");
                C64320dn3 dn33 = cVar.f225941q;
                RealnameGuideHelper realnameGuideHelper2 = new RealnameGuideHelper();
                realnameGuideHelper2.mo99373d(String.valueOf(dn33.f182785d), dn33.f182786e, dn33.f182787f, dn33.f182788g, dn33.f182789h, yVar.getType());
                Bundle bundle = new Bundle();
                bundle.putString("realname_verify_process_jump_activity", ".f2f.ui.LuckyMoneyF2FReceiveUI");
                bundle.putString("realname_verify_process_jump_plugin", "luckymoney");
                if (realnameGuideHelper2.mo99371b(this, bundle, new C69151f(cVar), new C69152g(this), false)) {
                    this.f198893z = true;
                    return true;
                }
            }
            if (Util.isNullOrNil(str)) {
                str = getString(C0966R.string.ggf);
            }
            C76879j.m92749t(this, str, "", new C69146a());
            return true;
        }
        String h = bVar.mo123705h();
        long j = 0;
        if (this.f198892y != 0) {
            Log.m105920e("LuckyMoneyF2FReceiveUI", "last compliance usecase wast not stopped as expected!");
        }
        Long a = C72502o.f210909a.mo99911a(h, new C69149d(cVar.f225949y));
        if (a != null) {
            j = a.longValue();
        }
        this.f198892y = j;
        return true;
    }

    public void onStop() {
        super.onStop();
        removeSceneEndListener(1997);
    }
}
