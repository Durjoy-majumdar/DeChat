package com.tencent.p014mm.plugin.card.p031ui;

import a70.C112760b;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.OvershootInterpolator;
import android.view.animation.ScaleAnimation;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.appbrand.p025ad.jsapi.C1500a;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import f40.C86709a0;
import gc0.C20828a;
import hc0.C20937c;
import hz0.C21037q;
import hz0.C76250f0;
import hz0.C76251l;
import j20.C117292a;
import java.util.ArrayList;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import nj3.C76879j;
import nj3.C88989a;
import ob0.C11385n;
import ob0.C117747y;
import p1162x2.C112019a;
import p629ny.C76979h;
import p823sg.C77710q;
import qo3.C89779i0;
import wz0.C53248d;
import wz0.C78745q;

@C88989a(7)
/* renamed from: com.tencent.mm.plugin.card.ui.CardGiftAcceptUI */
public class CardGiftAcceptUI extends MMActivity implements View.OnClickListener, C11385n {

    /* renamed from: A */
    public C21037q f197584A;

    /* renamed from: d */
    public String f197585d;

    /* renamed from: e */
    public int f197586e;

    /* renamed from: f */
    public String f197587f;

    /* renamed from: g */
    public String f197588g;

    /* renamed from: h */
    public RelativeLayout f197589h;

    /* renamed from: i */
    public RelativeLayout f197590i;

    /* renamed from: j */
    public ImageView f197591j;

    /* renamed from: n */
    public TextView f197592n;

    /* renamed from: o */
    public TextView f197593o;

    /* renamed from: p */
    public ImageView f197594p;

    /* renamed from: q */
    public Button f197595q;

    /* renamed from: r */
    public LinearLayout f197596r;

    /* renamed from: s */
    public TextView f197597s;

    /* renamed from: t */
    public LinearLayout f197598t;

    /* renamed from: u */
    public TextView f197599u;

    /* renamed from: v */
    public ImageView f197600v;

    /* renamed from: w */
    public ImageView f197601w;

    /* renamed from: x */
    public RelativeLayout f197602x;

    /* renamed from: y */
    public C89779i0 f197603y = null;

    /* renamed from: z */
    public C76250f0 f197604z;

    /* renamed from: com.tencent.mm.plugin.card.ui.CardGiftAcceptUI$a */
    public class C68779a implements DialogInterface.OnCancelListener {
        public C68779a() {
        }

        public void onCancel(DialogInterface dialogInterface) {
            C89779i0 i0Var = CardGiftAcceptUI.this.f197603y;
            if (i0Var != null && i0Var.isShowing()) {
                CardGiftAcceptUI.this.f197603y.dismiss();
            }
            Log.m105924i("MicroMsg.CardGiftAcceptUI", "user cancel & finish");
            CardGiftAcceptUI.this.finish();
        }
    }

    /* renamed from: H7 */
    public final void mo94621H7() {
        C86709a0.m107529k().f251779b.mo123460f(new C21037q(this.f197586e, this.f197585d, this.f197588g, Boolean.FALSE));
        C89779i0 i0Var = this.f197603y;
        if (i0Var != null) {
            i0Var.show();
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.f6712mh;
    }

    public void initView() {
        this.f197589h = (RelativeLayout) findViewById(C0966R.C0970id.aub);
        this.f197590i = (RelativeLayout) findViewById(C0966R.C0970id.auk);
        this.f197591j = (ImageView) findViewById(C0966R.C0970id.aum);
        this.f197592n = (TextView) findViewById(C0966R.C0970id.aun);
        this.f197593o = (TextView) findViewById(C0966R.C0970id.aui);
        this.f197594p = (ImageView) findViewById(C0966R.C0970id.fd7);
        this.f197595q = (Button) findViewById(C0966R.C0970id.aup);
        this.f197597s = (TextView) findViewById(C0966R.C0970id.auj);
        this.f197599u = (TextView) findViewById(C0966R.C0970id.aul);
        this.f197602x = (RelativeLayout) findViewById(C0966R.C0970id.auo);
        this.f197600v = (ImageView) findViewById(C0966R.C0970id.auh);
        this.f197601w = (ImageView) findViewById(C0966R.C0970id.j8d);
        this.f197596r = (LinearLayout) findViewById(C0966R.C0970id.hpw);
        this.f197598t = (LinearLayout) findViewById(C0966R.C0970id.j8e);
        this.f197602x.setOnClickListener(this);
        this.f197589h.setOnClickListener(this);
        this.f197590i.setOnClickListener(this);
        this.f197596r.setOnClickListener(this);
        this.f197598t.setOnClickListener(this);
        View contentView = getContentView();
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        C117292a.m165358d(contentView, aVar.mo10232b(), "com/tencent/mm/plugin/card/ui/CardGiftAcceptUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        contentView.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(contentView, "com/tencent/mm/plugin/card/ui/CardGiftAcceptUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f197603y = C76879j.m92723Q(getContext(), (String) null, getString(C0966R.string.gas), true, true, new C68779a());
        C86709a0.m107529k().f251779b.mo123460f(new C76250f0(this.f197586e, this.f197585d, this.f197588g));
        C89779i0 i0Var = this.f197603y;
        if (i0Var != null) {
            i0Var.show();
        }
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/card/ui/CardGiftAcceptUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (view.getId() == C0966R.C0970id.aup || view.getId() == C0966R.C0970id.hpw) {
            if (this.f197595q.getVisibility() == 0) {
                int d = C85875k4.m106176d(Util.convertStringToRGB(this.f197604z.f223363q, getResources().getColor(C0966R.color.f3208j2)));
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setColor(d);
                gradientDrawable.setStroke(2, d);
                gradientDrawable.setCornerRadius(6.0f);
                this.f197595q.setBackground(gradientDrawable);
                this.f197595q.setTextColor(getResources().getColor(C0966R.color.al_));
            }
            mo94621H7();
            if (!Util.isNullOrNil(this.f197587f)) {
                C115669n.INSTANCE.mo160131h(13866, 2, this.f197585d, C77710q.m93738a(this.f197586e), this.f197587f);
            }
        } else if (view.getId() == C0966R.C0970id.auo) {
            finish();
        } else if (view.getId() == C0966R.C0970id.aub) {
            finish();
        } else if (view.getId() == C0966R.C0970id.j8e) {
            C86709a0.m107529k().f251779b.mo123460f(new C21037q(this.f197586e, this.f197585d, this.f197588g, Boolean.TRUE));
            C89779i0 i0Var = this.f197603y;
            if (i0Var != null) {
                i0Var.show();
            }
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/card/ui/CardGiftAcceptUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f197585d = getIntent().getStringExtra("key_order_id");
        this.f197586e = getIntent().getIntExtra("key_biz_uin", -1);
        this.f197587f = getIntent().getStringExtra("key_from_user_name");
        this.f197588g = getIntent().getStringExtra("key_chatroom_name");
        Log.m105925i("MicroMsg.CardGiftAcceptUI", "onCreate, orderId:%s, bizUin:%s, fromUserName:%s", this.f197585d, Integer.valueOf(this.f197586e), this.f197587f);
        if (this.f197586e == -1) {
            Log.m105920e("MicroMsg.CardGiftAcceptUI", "bizUin is -1, fail!");
            C53248d.m59685e(this, "", true);
        } else if (this.f197585d == null) {
            Log.m105920e("MicroMsg.CardGiftAcceptUI", "orderId is null, fail");
            C53248d.m59685e(this, "", true);
        } else {
            if (!Util.isNullOrNil(this.f197587f)) {
                C115669n.INSTANCE.mo160131h(13866, 1, this.f197585d, C77710q.m93738a(this.f197586e), this.f197587f);
            }
            initView();
            C86709a0.m107529k().f251779b.mo123455a(C1500a.CTRL_INDEX, this);
            C86709a0.m107529k().f251779b.mo123455a(1136, this);
        }
    }

    public void onDestroy() {
        super.onDestroy();
        C86709a0.m107529k().f251779b.mo123470p(C1500a.CTRL_INDEX, this);
        C86709a0.m107529k().f251779b.mo123470p(1136, this);
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 4) {
            Log.m105920e("MicroMsg.CardGiftAcceptUI", "onKeyDown finishUI");
            C89779i0 i0Var = this.f197603y;
            if (i0Var != null && i0Var.isShowing()) {
                this.f197603y.dismiss();
            }
            finish();
        }
        return super.onKeyDown(i, keyEvent);
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        String str2 = str;
        C117747y yVar2 = yVar;
        if (i != 0 || i2 != 0) {
            C89779i0 i0Var = this.f197603y;
            if (i0Var != null && i0Var.isShowing()) {
                this.f197603y.dismiss();
            }
            if (yVar2 instanceof C76250f0) {
                Log.m105921e("MicroMsg.CardGiftAcceptUI", "NetSceneGetCardGiftInfo onSceneEnd fail, errType = %d, errCode = %d, errMsg = %s", Integer.valueOf(i), Integer.valueOf(i2), str2);
                C53248d.m59685e(this, str2, true);
            } else if (yVar2 instanceof C21037q) {
                Log.m105921e("MicroMsg.CardGiftAcceptUI", "NetSceneGetCardGiftInfo onSceneEnd fail, errType = %d, errCode = %d, errMsg = %s", Integer.valueOf(i), Integer.valueOf(i2), str2);
                C53248d.m59685e(this, str2, true);
            }
        } else if (yVar2 instanceof C76250f0) {
            C76250f0 f0Var = (C76250f0) yVar2;
            this.f197604z = f0Var;
            Log.m105925i("MicroMsg.CardGiftAcceptUI", "ignore:%b", Boolean.valueOf(f0Var.f223361o));
            if (!this.f197604z.f223361o) {
                C89779i0 i0Var2 = this.f197603y;
                if (i0Var2 != null && i0Var2.isShowing()) {
                    this.f197603y.dismiss();
                }
                C76250f0 f0Var2 = this.f197604z;
                if (f0Var2 == null) {
                    Log.m105920e("MicroMsg.CardGiftAcceptUI", "preAcceptGiftCard is null");
                } else {
                    this.f197593o.setText(f0Var2.f223358i);
                    this.f197592n.setText(((C76979h) C86312j.m106911c(C76979h.class)).yp0(this, this.f197604z.f223355f, this.f197592n.getTextSize()));
                    C76250f0 f0Var3 = this.f197604z;
                    int i3 = f0Var3.f223357h;
                    if (i3 == 0) {
                        if (!Util.isNullOrNil(f0Var3.f223359j)) {
                            this.f197595q.setVisibility(0);
                            this.f197595q.setText(this.f197604z.f223359j);
                            this.f197595q.setOnClickListener(this);
                        } else {
                            this.f197595q.setVisibility(0);
                            this.f197595q.setText(getResources().getString(C0966R.string.axb));
                            this.f197595q.setOnClickListener(this);
                        }
                    } else if (i3 == 1) {
                        this.f197595q.setVisibility(8);
                        this.f197595q.setOnClickListener((View.OnClickListener) null);
                    } else if (i3 != 2) {
                        this.f197595q.setVisibility(8);
                        this.f197595q.setOnClickListener((View.OnClickListener) null);
                    } else if (!Util.isNullOrNil(f0Var3.f223359j)) {
                        this.f197595q.setVisibility(0);
                        this.f197595q.setBackgroundDrawable((Drawable) null);
                        this.f197595q.setText(this.f197604z.f223359j);
                        this.f197595q.setTextColor(getResources().getColor(C0966R.color.a7f));
                        this.f197595q.setTextSize(1, 17.0f);
                        this.f197595q.setOnClickListener((View.OnClickListener) null);
                    } else {
                        this.f197595q.setVisibility(8);
                        this.f197595q.setOnClickListener((View.OnClickListener) null);
                    }
                    if (!Util.isNullOrNil(this.f197604z.f223364r)) {
                        this.f197595q.setVisibility(8);
                        this.f197598t.setVisibility(8);
                        this.f197596r.setVisibility(0);
                        this.f197597s.setText(this.f197604z.f223364r);
                    }
                    if (!Util.isNullOrNil(this.f197604z.f223365s)) {
                        this.f197596r.setVisibility(8);
                        this.f197598t.setVisibility(0);
                        this.f197599u.setText(this.f197604z.f223365s);
                    }
                    if (!Util.isNullOrNil(this.f197604z.f223356g)) {
                        int b = C76577a.m92151b(this, 15);
                        C20937c.C20939b bVar = new C20937c.C20939b();
                        bVar.f59351g = C112760b.m154195C();
                        bVar.f59350f = C76251l.m91644m(this.f197604z.f223356g);
                        bVar.f59346b = true;
                        bVar.f59364t = true;
                        bVar.f59365u = (float) b;
                        bVar.f59345a = true;
                        bVar.f59359o = C0966R.C0969drawable.f357296c91;
                        C20828a.m22825b().mo32519h(this.f197604z.f223356g, this.f197591j, bVar.mo32666a());
                    }
                    if (!Util.isNullOrNil(this.f197604z.f223362p)) {
                        C20828a.m22825b().mo32518g(this.f197604z.f223362p, this.f197594p);
                    }
                    if (!Util.isNullOrNil(this.f197604z.f223363q) && this.f197595q.getVisibility() == 0) {
                        int d = C85875k4.m106176d(Util.convertStringToRGB(this.f197604z.f223363q, getResources().getColor(C0966R.color.f3208j2)));
                        int color = getResources().getColor(C0966R.color.f2932f);
                        GradientDrawable gradientDrawable = new GradientDrawable();
                        gradientDrawable.setColor(color);
                        gradientDrawable.setStroke(2, d);
                        gradientDrawable.setCornerRadius(6.0f);
                        this.f197595q.setBackground(gradientDrawable);
                        this.f197595q.setTextColor(d);
                    }
                    if (!Util.isNullOrNil(this.f197604z.f223363q) && this.f197597s.getVisibility() == 0) {
                        this.f197597s.setTextColor(C85875k4.m106176d(Util.convertStringToRGB(this.f197604z.f223363q, getResources().getColor(C0966R.color.f3208j2))));
                        int color2 = getResources().getColor(C0966R.color.f3208j2);
                        if (!Util.isNullOrNil(this.f197604z.f223363q)) {
                            color2 = Util.convertStringToRGB(this.f197604z.f223363q, color2);
                        }
                        int d2 = C85875k4.m106176d(color2);
                        ImageView imageView = this.f197600v;
                        Drawable drawable = imageView.getDrawable();
                        ColorStateList valueOf = ColorStateList.valueOf(d2);
                        Drawable g = C112019a.m152749g(drawable);
                        g.setTintList(valueOf);
                        imageView.setImageDrawable(g);
                    }
                    if (!Util.isNullOrNil(this.f197604z.f223363q) && this.f197599u.getVisibility() == 0) {
                        this.f197599u.setTextColor(C85875k4.m106176d(Util.convertStringToRGB(this.f197604z.f223363q, getResources().getColor(C0966R.color.f3208j2))));
                        int color3 = getResources().getColor(C0966R.color.f3208j2);
                        if (!Util.isNullOrNil(this.f197604z.f223363q)) {
                            color3 = Util.convertStringToRGB(this.f197604z.f223363q, color3);
                        }
                        int d3 = C85875k4.m106176d(color3);
                        ImageView imageView2 = this.f197601w;
                        Drawable drawable2 = imageView2.getDrawable();
                        ColorStateList valueOf2 = ColorStateList.valueOf(d3);
                        Drawable g2 = C112019a.m152749g(drawable2);
                        g2.setTintList(valueOf2);
                        imageView2.setImageDrawable(g2);
                        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f197595q.getLayoutParams();
                        marginLayoutParams.topMargin -= C76577a.m92151b(this, 20);
                        this.f197595q.setLayoutParams(marginLayoutParams);
                    }
                    if (this.f197595q.getVisibility() == 0 && this.f197598t.getVisibility() == 8) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.f197595q.getLayoutParams();
                        marginLayoutParams2.bottomMargin += C76577a.m92151b(this, 28);
                        this.f197595q.setLayoutParams(marginLayoutParams2);
                    }
                }
                RelativeLayout relativeLayout = this.f197590i;
                ScaleAnimation scaleAnimation = new ScaleAnimation(0.0f, 0.96f, 0.0f, 0.96f, 1, 0.5f, 1, 0.5f);
                scaleAnimation.setDuration(300);
                scaleAnimation.setInterpolator(new OvershootInterpolator());
                scaleAnimation.setFillAfter(true);
                ScaleAnimation scaleAnimation2 = new ScaleAnimation(0.96f, 1.0f, 0.96f, 1.0f, 1, 0.5f, 1, 0.5f);
                scaleAnimation2.setDuration(100);
                scaleAnimation2.setFillAfter(true);
                scaleAnimation.setAnimationListener(new C78745q(relativeLayout, scaleAnimation2));
                if (relativeLayout != null) {
                    relativeLayout.startAnimation(scaleAnimation);
                }
                C85875k4.m106187i0(this, getResources().getColor(C0966R.color.f2931e));
                View contentView = getContentView();
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(0);
                C117292a.m165358d(contentView, aVar.mo10232b(), "com/tencent/mm/plugin/card/ui/CardGiftAcceptUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                contentView.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(contentView, "com/tencent/mm/plugin/card/ui/CardGiftAcceptUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                return;
            }
            Log.m105924i("MicroMsg.CardGiftAcceptUI", "NetScenePreAcceptGiftCard ignore is true~so ignore it");
            mo94621H7();
        } else if (yVar2 instanceof C21037q) {
            C89779i0 i0Var3 = this.f197603y;
            if (i0Var3 != null && i0Var3.isShowing()) {
                this.f197603y.dismiss();
            }
            Log.m105924i("MicroMsg.CardGiftAcceptUI", "accept gift card is success!");
            this.f197584A = (C21037q) yVar2;
            Intent intent = new Intent(this, CardGiftReceiveUI.class);
            intent.putExtra("key_order_id", this.f197585d);
            intent.putExtra("key_biz_uin", this.f197586e);
            intent.putExtra("key_gift_into", this.f197584A.f59525f);
            intent.putExtra("key_from_group_chat_room", !Util.isNullOrNil(this.f197588g));
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(intent);
            C117292a.m165358d(this, aVar2.mo10232b(), "com/tencent/mm/plugin/card/ui/CardGiftAcceptUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            startActivity((Intent) aVar2.mo10231a(0));
            C117292a.m165359e(this, "com/tencent/mm/plugin/card/ui/CardGiftAcceptUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            finish();
        }
    }
}
