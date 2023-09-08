package com.tencent.p014mm.plugin.webwx.p129ui;

import android.animation.Animator;
import android.content.Context;
import android.view.View;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.p136ui.widget.progress.MMProgressWheel;
import com.tencent.p014mm.sdk.platformtools.Util;
import e62.C75554c;
import eb0.C75592q0;
import eb0.C97625j3;
import gy3.C87412m;
import p645pj.C77091b;

/* renamed from: com.tencent.mm.plugin.webwx.ui.c */
public final class C72632c extends RecyclerView.C16631z {

    /* renamed from: A */
    public final C72633a f211307A;

    /* renamed from: B */
    public RelativeLayout f211308B;

    /* renamed from: C */
    public WeImageView f211309C;

    /* renamed from: D */
    public TextView f211310D;

    /* renamed from: E */
    public RelativeLayout f211311E;

    /* renamed from: F */
    public WeImageView f211312F;

    /* renamed from: G */
    public RelativeLayout f211313G;

    /* renamed from: H */
    public RelativeLayout f211314H;

    /* renamed from: I */
    public View f211315I;

    /* renamed from: J */
    public View f211316J;

    /* renamed from: K */
    public RelativeLayout f211317K;

    /* renamed from: L */
    public WeImageView f211318L;

    /* renamed from: M */
    public LinearLayout f211319M;

    /* renamed from: N */
    public RelativeLayout f211320N;

    /* renamed from: P */
    public WeImageView f211321P;

    /* renamed from: Q */
    public TextView f211322Q;

    /* renamed from: R */
    public MMProgressWheel f211323R;

    /* renamed from: S */
    public LinearLayout f211324S;

    /* renamed from: T */
    public RelativeLayout f211325T;

    /* renamed from: U */
    public RelativeLayout f211326U;

    /* renamed from: V */
    public TextView f211327V;

    /* renamed from: W */
    public RelativeLayout f211328W;

    /* renamed from: X */
    public CheckBox f211329X;

    /* renamed from: Y */
    public View f211330Y;

    /* renamed from: Z */
    public View f211331Z;

    /* renamed from: p0 */
    public Animator f211332p0;

    /* renamed from: x0 */
    public boolean f211333x0;

    /* renamed from: y0 */
    public boolean f211334y0;

    /* renamed from: z */
    public final Context f211335z;

    /* renamed from: com.tencent.mm.plugin.webwx.ui.c$a */
    public interface C72633a {
        /* renamed from: H2 */
        void mo100068H2();

        /* renamed from: U6 */
        void mo100070U6(int i, int i2, String str);

        /* renamed from: Z0 */
        void mo100071Z0(int i);

        void notifyDataSetChanged();

        /* renamed from: q */
        void mo100073q();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C72632c(Context context, View view, C72633a aVar) {
        super(view);
        C87412m.m108594g(context, "context");
        C87412m.m108594g(view, "itemView");
        this.f211335z = context;
        this.f211307A = aVar;
        this.f211308B = (RelativeLayout) view.findViewById(C0966R.C0970id.c4f);
        this.f211309C = (WeImageView) view.findViewById(C0966R.C0970id.k1a);
        this.f211310D = (TextView) view.findViewById(C0966R.C0970id.k19);
        this.f211311E = (RelativeLayout) view.findViewById(C0966R.C0970id.evp);
        this.f211312F = (WeImageView) view.findViewById(C0966R.C0970id.jhm);
        this.f211313G = (RelativeLayout) view.findViewById(C0966R.C0970id.c4d);
        this.f211314H = (RelativeLayout) view.findViewById(C0966R.C0970id.c4e);
        this.f211315I = view.findViewById(C0966R.C0970id.c4i);
        this.f211316J = view.findViewById(C0966R.C0970id.be7);
        this.f211317K = (RelativeLayout) view.findViewById(C0966R.C0970id.c4a);
        this.f211318L = (WeImageView) view.findViewById(C0966R.C0970id.f2j);
        this.f211319M = (LinearLayout) view.findViewById(C0966R.C0970id.f358626g50);
        this.f211320N = (RelativeLayout) view.findViewById(C0966R.C0970id.c4j);
        this.f211321P = (WeImageView) view.findViewById(C0966R.C0970id.f2c);
        this.f211322Q = (TextView) view.findViewById(C0966R.C0970id.c4k);
        this.f211323R = (MMProgressWheel) view.findViewById(C0966R.C0970id.c4l);
        this.f211324S = (LinearLayout) view.findViewById(C0966R.C0970id.c4c);
        this.f211325T = (RelativeLayout) view.findViewById(C0966R.C0970id.c4b);
        WeImageView weImageView = (WeImageView) view.findViewById(C0966R.C0970id.f29);
        this.f211326U = (RelativeLayout) view.findViewById(C0966R.C0970id.c4n);
        this.f211327V = (TextView) view.findViewById(C0966R.C0970id.c4m);
        this.f211328W = (RelativeLayout) view.findViewById(C0966R.C0970id.a1k);
        this.f211329X = (CheckBox) view.findViewById(C0966R.C0970id.a1i);
        this.f211330Y = view.findViewById(C0966R.C0970id.f358394ew0);
        this.f211331Z = view.findViewById(C0966R.C0970id.f358395ew1);
    }

    /* renamed from: y */
    public static final boolean m84973y(C72632c cVar, C75554c.C75555b bVar) {
        cVar.getClass();
        if (!C97625j3.m125811a()) {
            return false;
        }
        boolean z = !cVar.f211333x0;
        cVar.f211333x0 = z;
        cVar.mo100078z(z);
        int p = C75592q0.m90786p();
        int i = cVar.f211333x0 ? p | 8192 : p & -8193;
        C77091b.m93037s().edit().putInt("notification.status.webonline.push.open", i).commit();
        C97625j3.m125812b().mo105906u().mo119676J(40, Integer.valueOf(i));
        C72633a aVar = cVar.f211307A;
        if (aVar != null) {
            aVar.mo100068H2();
        }
        cVar.mo100077C(bVar);
        C72633a aVar2 = cVar.f211307A;
        if (aVar2 == null) {
            return true;
        }
        aVar2.notifyDataSetChanged();
        return true;
    }

    /* renamed from: B */
    public final void mo100076B(boolean z) {
        if (z) {
            this.f211320N.setBackgroundResource(C0966R.C0969drawable.f4833o8);
            this.f211321P.setIconColor(this.f211335z.getResources().getColor(C0966R.color.BW_100_Alpha_0_8));
            this.f211322Q.setText(C0966R.string.li9);
            return;
        }
        this.f211320N.setBackgroundResource(C0966R.C0969drawable.f4832o7);
        this.f211321P.setIconColor(this.f211335z.getResources().getColor(C0966R.color.FG_0));
        this.f211322Q.setText(C0966R.string.lhn);
    }

    /* renamed from: C */
    public final void mo100077C(C75554c.C75555b bVar) {
        if (!Util.isNullOrNil(bVar.f221962p)) {
            this.f211310D.setText(bVar.f221962p);
            int i = bVar.f182221n;
            if (i == 1) {
                this.f211309C.setImageResource(C0966R.raw.icons_outlined_display);
            } else if (i == 2) {
                if (this.f211334y0) {
                    this.f211309C.setImageResource(C0966R.raw.icons_outlined_imac_lock);
                } else {
                    this.f211309C.setImageResource(C0966R.raw.icons_outlined_imac);
                }
            } else if (i == 3) {
                this.f211309C.setImageResource(C0966R.raw.icons_outlined_pad);
            } else if (i == 7) {
                this.f211309C.setImageResource(C0966R.raw.connect_kidwatch);
            } else if (i == 6) {
                this.f211309C.setImageResource(C0966R.raw.icons_outlined_car);
            } else if (i == 8) {
                if (this.f211316J.getVisibility() == 8 || this.f211333x0) {
                    this.f211309C.setImageResource(C0966R.raw.icons_outlined_android_pad);
                } else {
                    this.f211309C.setImageResource(C0966R.raw.icons_outlined_android_pad);
                }
            } else if (i == 10) {
                this.f211309C.setImageResource(C0966R.raw.icons_outlined_folder);
            } else if (i == 13) {
                this.f211309C.setImageResource(C0966R.raw.connect_rtoswatch);
            } else {
                this.f211309C.setImageResource(C0966R.raw.icons_outlined_display);
            }
        }
    }

    /* renamed from: z */
    public final void mo100078z(boolean z) {
        RelativeLayout relativeLayout = this.f211317K;
        if (relativeLayout == null) {
            return;
        }
        if (z) {
            relativeLayout.setBackgroundResource(C0966R.C0969drawable.f4832o7);
            this.f211318L.setIconColor(this.f211335z.getResources().getColor(C0966R.color.FG_0));
            return;
        }
        relativeLayout.setBackgroundResource(C0966R.C0969drawable.f4833o8);
        this.f211318L.setIconColor(this.f211335z.getResources().getColor(C0966R.color.BW_100_Alpha_0_8));
    }
}
