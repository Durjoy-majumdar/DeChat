package uv0;

import android.content.Context;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import aw0.C103925l;
import bw0.C79851a;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.ball.model.BallInfo;
import com.tencent.p014mm.plugin.ball.view.C55570b;
import com.tencent.p014mm.plugin.ball.view.CircleAnimateView;
import com.tencent.p014mm.plugin.ball.view.CircleImageView;
import com.tencent.p014mm.sdk.platformtools.ImgUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import j20.C117292a;
import java.util.List;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import lb0.C88394b;
import uv0.C111234h;
import yv0.C112505b;

/* renamed from: uv0.e */
public class C111231e extends RecyclerView.C16613e<C111232a> {

    /* renamed from: n */
    public static final int f333075n = C76577a.m92155f(MMApplicationContext.getContext(), C0966R.dimen.aa4);

    /* renamed from: o */
    public static final int f333076o = C76577a.m92155f(MMApplicationContext.getContext(), C0966R.dimen.a_m);

    /* renamed from: p */
    public static final int f333077p = C76577a.m92155f(MMApplicationContext.getContext(), C0966R.dimen.aa5);

    /* renamed from: q */
    public static final int f333078q = C76577a.m92155f(MMApplicationContext.getContext(), C0966R.dimen.a_n);

    /* renamed from: r */
    public static final int f333079r = C76577a.m92155f(MMApplicationContext.getContext(), C0966R.dimen.f357032aa1);

    /* renamed from: s */
    public static final int f333080s = C76577a.m92155f(MMApplicationContext.getContext(), C0966R.dimen.f357033aa2);

    /* renamed from: t */
    public static final int f333081t = C76577a.m92155f(MMApplicationContext.getContext(), C0966R.dimen.f357031aa0);

    /* renamed from: u */
    public static final int f333082u = C76577a.m92155f(MMApplicationContext.getContext(), C0966R.dimen.a_v);

    /* renamed from: v */
    public static final int f333083v = C76577a.m92155f(MMApplicationContext.getContext(), C0966R.dimen.a_x);

    /* renamed from: w */
    public static final int f333084w = C76577a.m92155f(MMApplicationContext.getContext(), C0966R.dimen.a_r);

    /* renamed from: x */
    public static final int f333085x = C76577a.m92155f(MMApplicationContext.getContext(), C0966R.dimen.a_t);

    /* renamed from: d */
    public Context f333086d;

    /* renamed from: e */
    public boolean f333087e;

    /* renamed from: f */
    public boolean f333088f;

    /* renamed from: g */
    public List<BallInfo> f333089g;

    /* renamed from: h */
    public C112505b f333090h;

    /* renamed from: i */
    public boolean f333091i;

    /* renamed from: j */
    public C55570b.C55575e f333092j;

    /* renamed from: uv0.e$a */
    public class C111232a extends RecyclerView.C16631z {

        /* renamed from: A */
        public int f333093A;

        /* renamed from: B */
        public CircleImageView f333094B;

        /* renamed from: C */
        public CircleAnimateView f333095C;

        /* renamed from: D */
        public ImageView f333096D;

        /* renamed from: E */
        public FrameLayout f333097E;

        /* renamed from: F */
        public TextView f333098F;

        /* renamed from: G */
        public TextView f333099G;

        /* renamed from: H */
        public LinearLayout f333100H;

        /* renamed from: I */
        public ImageView f333101I;

        /* renamed from: J */
        public LinearLayout f333102J;

        /* renamed from: K */
        public LinearLayout f333103K;

        /* renamed from: L */
        public int f333104L = -1;

        /* renamed from: z */
        public BallInfo f333105z;

        public C111232a(C111231e eVar, View view) {
            super(view);
            this.f333094B = (CircleImageView) view.findViewById(C0966R.C0970id.f1c);
            this.f333095C = (CircleAnimateView) view.findViewById(C0966R.C0970id.f1_);
            this.f333096D = (ImageView) view.findViewById(C0966R.C0970id.io7);
            this.f333097E = (FrameLayout) view.findViewById(C0966R.C0970id.io6);
            this.f333098F = (TextView) view.findViewById(C0966R.C0970id.h_5);
            this.f333099G = (TextView) view.findViewById(C0966R.C0970id.h_4);
            this.f333100H = (LinearLayout) view.findViewById(C0966R.C0970id.h_2);
            this.f333101I = (ImageView) view.findViewById(C0966R.C0970id.f6146yk);
            this.f333102J = (LinearLayout) view.findViewById(C0966R.C0970id.grw);
            this.f333103K = (LinearLayout) view.findViewById(C0966R.C0970id.gry);
        }
    }

    static {
        C76577a.m92155f(MMApplicationContext.getContext(), C0966R.dimen.a_u);
        C76577a.m92155f(MMApplicationContext.getContext(), C0966R.dimen.a_w);
        C76577a.m92155f(MMApplicationContext.getContext(), C0966R.dimen.a_q);
        C76577a.m92155f(MMApplicationContext.getContext(), C0966R.dimen.a_s);
    }

    public C111231e(Context context) {
        this.f333086d = context;
    }

    /* renamed from: F4 */
    public final void mo162988F4(C111232a aVar, int i, BallInfo ballInfo) {
        if (i == -1) {
            aVar.f333094B.setVisibility(4);
            aVar.f333095C.setVisibility(4);
        } else if (ImgUtil.isGif(MMApplicationContext.getContext(), i)) {
            if (aVar.f333104L != i) {
                aVar.f333094B.setVisibility(8);
                aVar.f333095C.setVisibility(0);
                try {
                    aVar.f333095C.setImageResource(i);
                } catch (Exception e) {
                    Log.printErrStackTrace("MicroMsg.FloatBallMenuAdapter", e, "setIconAnimateView exception:%s", e);
                    aVar.f333095C.setImageResource(C103925l.m138638l(ballInfo));
                }
            }
            long j = ballInfo.f311702w;
            if (j >= 0) {
                aVar.f333095C.setProgress(j);
            } else {
                aVar.f333095C.setProgress(-2147483648L);
            }
        } else {
            if (aVar.f333104L != i) {
                aVar.f333095C.setVisibility(8);
                aVar.f333094B.setVisibility(0);
                try {
                    aVar.f333094B.setImageResource(i);
                } catch (Exception e2) {
                    Log.printErrStackTrace("MicroMsg.FloatBallMenuAdapter", e2, "setIconImageView exception:%s", e2);
                    int k = C103925l.m138637k(ballInfo);
                    aVar.f333094B.setImageResource(k);
                    ballInfo.f311698s = k;
                }
            }
            long j2 = ballInfo.f311702w;
            if (j2 >= 0) {
                aVar.f333094B.setProgress(j2);
            } else {
                aVar.f333094B.setProgress(-2147483648L);
            }
        }
        aVar.f333104L = i;
    }

    /* renamed from: G4 */
    public final void mo162989G4(TextView textView, String str) {
        if (!Util.isNullOrNil(str)) {
            textView.setVisibility(0);
            textView.setText(Html.fromHtml(str));
            return;
        }
        textView.setText("");
        textView.setVisibility(8);
    }

    public int getItemCount() {
        if (C103925l.m138627a(this.f333089g)) {
            return this.f333089g.size();
        }
        return 0;
    }

    public int getItemViewType(int i) {
        if (!C103925l.m138627a(this.f333089g) || i < 0 || i >= this.f333089g.size()) {
            return 1;
        }
        BallInfo ballInfo = this.f333089g.get(i);
        return (ballInfo.f311680E || ballInfo.f311686d == 20) ? 2 : 1;
    }

    public void onBindViewHolder(RecyclerView.C16631z zVar, int i) {
        int i2;
        C111232a aVar = (C111232a) zVar;
        if (C103925l.m138627a(this.f333089g) && i >= 0 && i < this.f333089g.size()) {
            BallInfo ballInfo = this.f333089g.get(i);
            aVar.f333093A = i;
            aVar.f333105z = ballInfo;
            aVar.f44854d.setTranslationX(0.0f);
            View view = aVar.f44854d;
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar2.mo10233c(Float.valueOf(1.0f));
            C117292a.m165358d(view, aVar2.mo10232b(), "com/tencent/mm/plugin/ball/adapter/FloatBallMenuAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/ball/adapter/FloatBallMenuAdapter$FloatMenuViewHolder;I)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view.setAlpha(((Float) aVar2.mo10231a(0)).floatValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/ball/adapter/FloatBallMenuAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/ball/adapter/FloatBallMenuAdapter$FloatMenuViewHolder;I)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            if (this.f333088f) {
                aVar.f333097E.setVisibility(4);
            } else {
                aVar.f333097E.setVisibility(0);
                aVar.f333096D.setImageResource(C0966R.raw.icons_filled_close);
                ImageView imageView = aVar.f333096D;
                imageView.setColorFilter(C76577a.m92153d(imageView.getContext(), C0966R.color.BW_50));
                aVar.f333097E.setOnClickListener(new C111227a(this, ballInfo, aVar));
            }
            int i3 = ballInfo.f311687e;
            if (i3 == 6) {
                aVar.f333097E.setContentDescription(MMApplicationContext.getResources().getString(C0966R.string.juk));
            } else if (i3 == 2) {
                aVar.f333097E.setContentDescription(MMApplicationContext.getResources().getString(C0966R.string.jtu));
            } else if (i3 == 16) {
                aVar.f333097E.setContentDescription(MMApplicationContext.getResources().getString(C0966R.string.ju5));
            } else {
                aVar.f333097E.setContentDescription(MMApplicationContext.getResources().getString(C0966R.string.f361430ju3));
            }
            if (ballInfo.f311680E) {
                mo162988F4(aVar, C103925l.m138638l(ballInfo), ballInfo);
            } else {
                int i4 = ballInfo.f311698s;
                if (i4 != -1) {
                    mo162988F4(aVar, i4, ballInfo);
                } else {
                    int k = C103925l.m138637k(ballInfo);
                    if (Util.isNullOrNil(ballInfo.f311695p)) {
                        mo162988F4(aVar, k, ballInfo);
                    } else {
                        aVar.f333104L = -1;
                        String str = C88394b.f255384g;
                        C88394b.C88418q.f255427a.mo122796o(new C111229c(this, aVar, k, ballInfo), ballInfo.f311695p, C79851a.f234000d);
                    }
                }
            }
            View view2 = ballInfo.f311691i;
            boolean z = true;
            int i5 = 8;
            if (view2 == null || !ballInfo.f311680E) {
                LinearLayout linearLayout = aVar.f333102J;
                if (linearLayout != null) {
                    linearLayout.setVisibility(0);
                }
                LinearLayout linearLayout2 = aVar.f333103K;
                if (linearLayout2 != null) {
                    linearLayout2.setVisibility(8);
                }
                if (!C111234h.C111236b.f333107a.mo64044b(aVar.f333098F, ballInfo)) {
                    if (ballInfo.f311686d == 20) {
                        mo162989G4(aVar.f333098F, String.format(this.f333086d.getString(C0966R.string.evg), new Object[]{Util.nullAs(ballInfo.f311699t, "")}));
                    } else {
                        mo162989G4(aVar.f333098F, ballInfo.f311699t);
                    }
                }
                mo162989G4(aVar.f333099G, ballInfo.f311701v);
                if (aVar.f333098F.getVisibility() == 8 && aVar.f333099G.getVisibility() == 8) {
                    aVar.f333100H.setVisibility(8);
                } else {
                    aVar.f333100H.setVisibility(0);
                }
            } else {
                if (view2.getParent() instanceof ViewGroup) {
                    ((ViewGroup) ballInfo.f311691i.getParent()).removeView(ballInfo.f311691i);
                }
                LinearLayout linearLayout3 = aVar.f333102J;
                if (linearLayout3 != null) {
                    linearLayout3.setVisibility(8);
                }
                LinearLayout linearLayout4 = aVar.f333103K;
                if (linearLayout4 != null) {
                    linearLayout4.setVisibility(0);
                    aVar.f333103K.removeAllViews();
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
                    layoutParams.gravity = 8388627;
                    aVar.f333103K.addView(ballInfo.f311691i, layoutParams);
                }
            }
            if (!(!ballInfo.f311680E || (i2 = ballInfo.f311686d) == 16 || i2 == 17 || i2 == 19 || i2 == 20)) {
                z = false;
            }
            ImageView imageView2 = aVar.f333101I;
            if (imageView2 != null) {
                if (z) {
                    i5 = 0;
                }
                imageView2.setVisibility(i5);
            }
            aVar.f44854d.setTag(ballInfo);
            if (!z || this.f333090h == null) {
                aVar.f44854d.setOnClickListener((View.OnClickListener) null);
            } else {
                aVar.f44854d.setOnClickListener(new C111230d(this, ballInfo));
            }
            View view3 = aVar.f44854d;
            boolean z2 = this.f333087e;
            view3.setPadding(z2 ? f333082u : f333083v + f333079r, 0, z2 ? f333084w + f333079r : f333085x, 0);
        }
    }

    public RecyclerView.C16631z onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (i == 1) {
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C0966R.C0971layout.b4a, (ViewGroup) null, false);
            inflate.setLayoutParams(new RecyclerView.LayoutParams(f333075n + f333079r, f333076o + f333080s + f333081t));
            return new C111232a(this, inflate);
        }
        View inflate2 = LayoutInflater.from(viewGroup.getContext()).inflate(C0966R.C0971layout.b4b, (ViewGroup) null, false);
        inflate2.setLayoutParams(new RecyclerView.LayoutParams(f333077p + f333079r, f333078q));
        return new C111232a(this, inflate2);
    }
}
