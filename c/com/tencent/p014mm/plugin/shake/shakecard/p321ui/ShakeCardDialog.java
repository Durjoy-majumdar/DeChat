package com.tencent.p014mm.plugin.shake.shakecard.p321ui;

import a70.C112760b;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.os.Bundle;
import android.os.Looper;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.ShakeAcceptCouponCardEvent;
import com.tencent.p014mm.autogen.events.ShakeCardGiftedEvent;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import eb0.C97625j3;
import gc0.C20828a;
import hc0.C20937c;
import j20.C117292a;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import k20.C60958c;
import k20.C9556a;
import ke3.C88144b;
import ob0.C89137b0;
import p823sg.C90193h;
import qn2.C22120e;
import qn2.C47874a;
import qo3.C77390c0;
import rn2.C77542a;

/* renamed from: com.tencent.mm.plugin.shake.shakecard.ui.ShakeCardDialog */
public class ShakeCardDialog extends C77390c0 {

    /* renamed from: K */
    public static final String f54009K = (C112760b.m154195C() + "card");

    /* renamed from: A */
    public boolean f54010A = false;

    /* renamed from: B */
    public int f54011B = 0;

    /* renamed from: C */
    public C22120e f54012C;

    /* renamed from: D */
    public ShakeAcceptCouponCardEvent.C17692b f54013D;

    /* renamed from: E */
    public String f54014E = "";

    /* renamed from: F */
    public Resources f54015F;

    /* renamed from: G */
    public C19198b f54016G = C19198b.PRE_ACCEPT;

    /* renamed from: H */
    public C19199c f54017H;

    /* renamed from: I */
    public IListener f54018I = new IListener<ShakeCardGiftedEvent>(C40008f.f107254d) {
        {
            this.__eventId = 1298970405;
        }

        public boolean callback(IEvent iEvent) {
            ShakeCardGiftedEvent shakeCardGiftedEvent = (ShakeCardGiftedEvent) iEvent;
            ShakeCardDialog.this.dismiss();
            C19199c cVar = ShakeCardDialog.this.f54017H;
            if (cVar != null) {
                cVar.mo24617a();
            }
            Log.m105924i("MicroMsg.ShakeCardDialog", "gift event come, do close ShakeCardDialog");
            return false;
        }
    };

    /* renamed from: J */
    public View.OnClickListener f54019J = new C19197a();

    /* renamed from: d */
    public View f54020d;

    /* renamed from: e */
    public View f54021e;

    /* renamed from: f */
    public ImageView f54022f;

    /* renamed from: g */
    public TextView f54023g;

    /* renamed from: h */
    public TextView f54024h;

    /* renamed from: i */
    public TextView f54025i;

    /* renamed from: j */
    public Button f54026j;

    /* renamed from: n */
    public TextView f54027n;

    /* renamed from: o */
    public ProgressBar f54028o;

    /* renamed from: p */
    public View f54029p;

    /* renamed from: q */
    public View f54030q;

    /* renamed from: r */
    public View f54031r;

    /* renamed from: s */
    public ImageView f54032s;

    /* renamed from: t */
    public TextView f54033t;

    /* renamed from: u */
    public TextView f54034u;

    /* renamed from: v */
    public TextView f54035v;

    /* renamed from: w */
    public View f54036w;

    /* renamed from: x */
    public ImageView f54037x;

    /* renamed from: y */
    public TextView f54038y;

    /* renamed from: z */
    public boolean f54039z = false;

    /* renamed from: com.tencent.mm.plugin.shake.shakecard.ui.ShakeCardDialog$a */
    public class C19197a implements View.OnClickListener {
        public C19197a() {
        }

        public void onClick(View view) {
            C19198b bVar = C19198b.ACCEPTING;
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/shake/shakecard/ui/ShakeCardDialog$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            if (view.getId() == C0966R.C0970id.at7) {
                ShakeCardDialog.this.dismiss();
                C19199c cVar = ShakeCardDialog.this.f54017H;
                if (cVar != null) {
                    cVar.mo24617a();
                }
                Log.m105924i("MicroMsg.ShakeCardDialog", "close ShakeCardDialog");
            } else if (view.getId() == C0966R.C0970id.ark) {
                ShakeCardDialog shakeCardDialog = ShakeCardDialog.this;
                C19198b bVar2 = shakeCardDialog.f54016G;
                if (bVar2 == C19198b.PRE_ACCEPT) {
                    shakeCardDialog.f54016G = bVar;
                    shakeCardDialog.f54028o.setVisibility(0);
                    ShakeCardDialog.this.mo24609d();
                    ShakeCardDialog.m20343c(ShakeCardDialog.this);
                } else if (bVar2 != bVar) {
                    if (bVar2 == C19198b.ACCEPTED_FAIL) {
                        ShakeCardDialog.m20343c(shakeCardDialog);
                    } else if (bVar2 == C19198b.ACCEPTED_SUCCES) {
                        shakeCardDialog.f54018I.alive();
                        ShakeCardDialog shakeCardDialog2 = ShakeCardDialog.this;
                        shakeCardDialog2.getClass();
                        Log.m105924i("MicroMsg.ShakeCardDialog", "goCardDetailUI ShakeCardDialog");
                        C115669n.INSTANCE.kvStat(11665, shakeCardDialog2.f54014E);
                        Context context = shakeCardDialog2.getContext();
                        String str = shakeCardDialog2.f54014E;
                        String str2 = shakeCardDialog2.f54012C.f62545c;
                        Log.m105924i("MicroMsg.ShakeCardUtil", "ShakeCardUtil doCardDetailUI()");
                        Intent intent = new Intent();
                        intent.putExtra("key_card_id", str);
                        intent.putExtra("key_card_ext", str2);
                        intent.putExtra("key_from_scene", 15);
                        C88144b.m109791i(context, "card", ".ui.CardDetailUI", intent, (Bundle) null);
                    }
                }
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/shake/shakecard/ui/ShakeCardDialog$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.shake.shakecard.ui.ShakeCardDialog$b */
    public enum C19198b {
        PRE_ACCEPT,
        ACCEPTING,
        ACCEPTED_SUCCES,
        ACCEPTED_FAIL
    }

    /* renamed from: com.tencent.mm.plugin.shake.shakecard.ui.ShakeCardDialog$c */
    public interface C19199c {
        /* renamed from: a */
        void mo24617a();
    }

    public ShakeCardDialog(Context context, int i) {
        super(context, C0966R.style.a67);
        Log.m105924i("MicroMsg.ShakeCardDialog", "init shake card dialog");
        this.f54015F = context.getResources();
        setCanceledOnTouchOutside(true);
        getWindow().setSoftInputMode(2);
        View inflate = View.inflate(context, C0966R.C0971layout.by_, (ViewGroup) null);
        this.f54020d = inflate;
        this.f54021e = inflate.findViewById(C0966R.C0970id.jfh);
        this.f54023g = (TextView) this.f54020d.findViewById(C0966R.C0970id.axp);
        this.f54024h = (TextView) this.f54020d.findViewById(C0966R.C0970id.axa);
        this.f54025i = (TextView) this.f54020d.findViewById(C0966R.C0970id.atq);
        this.f54022f = (ImageView) this.f54020d.findViewById(C0966R.C0970id.at7);
        this.f54026j = (Button) this.f54020d.findViewById(C0966R.C0970id.ark);
        this.f54027n = (TextView) this.f54020d.findViewById(C0966R.C0970id.arq);
        this.f54028o = (ProgressBar) this.f54020d.findViewById(C0966R.C0970id.awp);
        this.f54022f.setOnClickListener(this.f54019J);
        this.f54026j.setOnClickListener(this.f54019J);
        this.f54029p = this.f54020d.findViewById(C0966R.C0970id.ash);
        this.f54030q = this.f54020d.findViewById(C0966R.C0970id.lpz);
        this.f54031r = this.f54020d.findViewById(C0966R.C0970id.axs);
        this.f54032s = (ImageView) this.f54020d.findViewById(C0966R.C0970id.avy);
        this.f54033t = (TextView) this.f54020d.findViewById(C0966R.C0970id.axi);
        this.f54034u = (TextView) this.f54020d.findViewById(C0966R.C0970id.asp);
        this.f54035v = (TextView) this.f54020d.findViewById(C0966R.C0970id.axf);
        this.f54036w = this.f54020d.findViewById(C0966R.C0970id.awu);
        this.f54037x = (ImageView) this.f54020d.findViewById(C0966R.C0970id.f359088is0);
        this.f54038y = (TextView) this.f54020d.findViewById(C0966R.C0970id.iry);
        this.f54011B = C77542a.m93502c();
    }

    /* renamed from: c */
    public static void m20343c(ShakeCardDialog shakeCardDialog) {
        shakeCardDialog.getClass();
        Log.m105924i("MicroMsg.ShakeCardDialog", "doNetSceneAccept()");
        if (TextUtils.isEmpty(shakeCardDialog.f54012C.f62544b)) {
            Log.m105920e("MicroMsg.ShakeCardDialog", "card_tp_id is empty befor doNetSceneAccept");
            return;
        }
        ShakeAcceptCouponCardEvent shakeAcceptCouponCardEvent = new ShakeAcceptCouponCardEvent();
        shakeAcceptCouponCardEvent.f48127e = null;
        ShakeAcceptCouponCardEvent.C17691a aVar = shakeAcceptCouponCardEvent.f48126d;
        C22120e eVar = shakeCardDialog.f54012C;
        aVar.f48128a = eVar.f62544b;
        aVar.f48129b = eVar.f62545c;
        aVar.f48130c = 15;
        shakeAcceptCouponCardEvent.callback = new C19200a(shakeCardDialog, shakeAcceptCouponCardEvent);
        shakeAcceptCouponCardEvent.asyncPublish(Looper.getMainLooper());
    }

    /* renamed from: d */
    public final void mo24609d() {
        C19198b bVar = this.f54016G;
        if (bVar == C19198b.PRE_ACCEPT || bVar == C19198b.ACCEPTED_FAIL) {
            if (TextUtils.isEmpty(this.f54012C.f62554l)) {
                this.f54026j.setText(C0966R.string.f360215aw2);
            } else {
                this.f54026j.setText(this.f54012C.f62554l);
            }
        } else if (bVar == C19198b.ACCEPTING) {
            this.f54026j.setText("");
        } else if (bVar == C19198b.ACCEPTED_SUCCES) {
            this.f54026j.setText(C0966R.string.j3s);
        }
    }

    public void dismiss() {
        try {
            C19199c cVar = this.f54017H;
            if (cVar != null) {
                cVar.mo24617a();
            }
            if (this.f54016G != C19198b.ACCEPTED_SUCCES && !this.f54010A) {
                this.f54010A = true;
                Log.m105924i("MicroMsg.ShakeCardDialog", "ShakeCardDialog card is not cancel accepte");
                C89137b0 e = C97625j3.m125815e();
                C22120e eVar = this.f54012C;
                e.mo123460f(new C47874a(eVar.f62544b, eVar.f62545c));
            }
            this.f54018I.dead();
            Log.m105924i("MicroMsg.ShakeCardDialog", "dismiss ShakeCardDialog");
            super.dismiss();
        } catch (Exception e2) {
            Log.m105920e("MicroMsg.ShakeCardDialog", "dismiss exception, e = " + e2.getMessage());
        }
    }

    /* renamed from: e */
    public final void mo24611e() {
        float dimensionPixelOffset = (float) getContext().getResources().getDimensionPixelOffset(C0966R.dimen.amk);
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, 0.0f, 0.0f, 0.0f, 0.0f}, (RectF) null, (float[]) null));
        Paint paint = shapeDrawable.getPaint();
        String str = this.f54012C.f62549g;
        int rgb = Color.rgb(66, 66, 66);
        if (str == null || str.length() < 7 || !str.startsWith("#")) {
            Log.m105920e("MicroMsg.ShakeCardUtil", "string format error");
        } else {
            try {
                String upperCase = str.substring(1).toUpperCase();
                rgb = Color.argb(255, Integer.parseInt(upperCase.substring(0, 2), 16), Integer.parseInt(upperCase.substring(2, 4), 16), Integer.parseInt(upperCase.substring(4, 6), 16));
            } catch (Exception e) {
                Log.m105920e("MicroMsg.ShakeCardUtil", e.toString());
            }
        }
        paint.setColor(rgb);
        this.f54031r.setBackgroundDrawable(shapeDrawable);
        mo24609d();
        if (!TextUtils.isEmpty(this.f54012C.f62552j)) {
            this.f54023g.setText(this.f54012C.f62552j);
        }
        if (!TextUtils.isEmpty(this.f54012C.f62557o)) {
            this.f54024h.setText(this.f54012C.f62557o);
            this.f54024h.setVisibility(0);
        }
        if (!TextUtils.isEmpty(this.f54012C.f62553k)) {
            this.f54025i.setText(this.f54012C.f62553k);
            this.f54025i.setVisibility(0);
        }
        if (!TextUtils.isEmpty(this.f54012C.f62548f)) {
            int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(C0966R.dimen.amj);
            ImageView imageView = this.f54032s;
            String str2 = this.f54012C.f62548f;
            if (imageView != null && !TextUtils.isEmpty(str2)) {
                if (!TextUtils.isEmpty(str2)) {
                    C20937c.C20939b bVar = new C20937c.C20939b();
                    bVar.f59351g = C112760b.m154195C();
                    bVar.f59350f = String.format("%s/%s", new Object[]{f54009K, C90193h.m112878f(str2.getBytes())});
                    bVar.f59346b = true;
                    bVar.f59364t = true;
                    bVar.f59345a = true;
                    bVar.f59355k = dimensionPixelSize;
                    bVar.f59354j = dimensionPixelSize;
                    bVar.f59359o = C0966R.raw.shake_card_package_defaultlogo;
                    C20828a.m22825b().mo32519h(str2, imageView, bVar.mo32666a());
                } else {
                    imageView.setImageResource(C0966R.raw.shake_card_package_defaultlogo);
                }
            }
        }
        if (!TextUtils.isEmpty(this.f54012C.f62546d)) {
            this.f54033t.setText(this.f54012C.f62546d);
        }
        if (!TextUtils.isEmpty(this.f54012C.f62547e)) {
            this.f54034u.setText(this.f54012C.f62547e);
        }
        if (this.f54012C.f62556n > 0) {
            TextView textView = this.f54035v;
            Context context = getContext();
            Object[] objArr = new Object[1];
            long j = ((long) this.f54012C.f62556n) * 1000;
            new GregorianCalendar().setTimeInMillis(j);
            if (C77542a.f226070a == null) {
                C77542a.f226070a = new SimpleDateFormat("yyyy.MM.dd");
            }
            objArr[0] = C77542a.f226070a.format(new Date(j));
            textView.setText(context.getString(C0966R.string.b29, objArr));
        }
        if (this.f54016G == C19198b.ACCEPTED_FAIL) {
            this.f54027n.setVisibility(0);
        } else {
            this.f54027n.setVisibility(8);
        }
    }

    /* renamed from: f */
    public final void mo24612f() {
        C19198b bVar = this.f54016G;
        if (bVar == C19198b.ACCEPTED_SUCCES) {
            View view = this.f54029p;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/shake/shakecard/ui/ShakeCardDialog", "updateLayout", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/shake/shakecard/ui/ShakeCardDialog", "updateLayout", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            View view3 = this.f54036w;
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(0);
            View view4 = view3;
            C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/shake/shakecard/ui/ShakeCardDialog", "updateLayout", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view4, "com/tencent/mm/plugin/shake/shakecard/ui/ShakeCardDialog", "updateLayout", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else if (bVar == C19198b.PRE_ACCEPT || bVar == C19198b.ACCEPTING || bVar == C19198b.ACCEPTED_FAIL) {
            View view5 = this.f54029p;
            C9556a aVar3 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar3.mo10233c(0);
            View view6 = view5;
            C117292a.m165358d(view6, aVar3.mo10232b(), "com/tencent/mm/plugin/shake/shakecard/ui/ShakeCardDialog", "updateLayout", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view5.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
            C117292a.m165359e(view6, "com/tencent/mm/plugin/shake/shakecard/ui/ShakeCardDialog", "updateLayout", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            View view7 = this.f54036w;
            C9556a aVar4 = new C9556a();
            aVar4.mo10233c(8);
            View view8 = view7;
            C117292a.m165358d(view8, aVar4.mo10232b(), "com/tencent/mm/plugin/shake/shakecard/ui/ShakeCardDialog", "updateLayout", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view7.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
            C117292a.m165359e(view8, "com/tencent/mm/plugin/shake/shakecard/ui/ShakeCardDialog", "updateLayout", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(this.f54020d);
    }

    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (i == 4) {
            Log.m105924i("MicroMsg.ShakeCardDialog", "back key in shake card dialog");
            dismiss();
            C19199c cVar = this.f54017H;
            if (cVar != null) {
                cVar.mo24617a();
            }
        }
        return super.onKeyUp(i, keyEvent);
    }

    public void setCancelable(boolean z) {
        super.setCancelable(z);
        setCanceledOnTouchOutside(z);
    }
}
