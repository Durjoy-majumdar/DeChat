package e21;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.plugin.newtips.model.C115619a;
import com.tencent.p014mm.plugin.newtips.model.C115631n;
import com.tencent.p014mm.pluginsdk.p133ui.applet.CdnImageView;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import com.tencent.p014mm.wallet_core.p137ui.WalletTextView;
import di3.C86312j;
import e21.C116645t;
import e21.C116648v0;
import java.util.LinkedList;
import java.util.List;
import kg3.C76577a;
import p626nv.C76963d;
import pe3.C89349b;
import te3.C118447nw2;
import te3.C118460qp;
import te3.C118466sp;
import te3.C118477wj3;
import te3.C118480xn3;
import te3.C49139df2;
import te3.C64275c7;
import te3.C64774vi;
import te3.tg4;

/* renamed from: e21.y0 */
public class C116673y0 {

    /* renamed from: e21.y0$a */
    public static abstract class C75493a implements C115619a {

        /* renamed from: d */
        public TextView f221862d;

        /* renamed from: e */
        public ImageView f221863e;

        public C75493a() {
            mo105820a();
        }

        /* renamed from: a */
        public abstract void mo105820a();

        /* renamed from: f */
        public boolean mo25956f(boolean z) {
            ImageView imageView = this.f221863e;
            if (imageView == null) {
                return true;
            }
            if (z) {
                imageView.setVisibility(0);
                return true;
            }
            imageView.setVisibility(8);
            return true;
        }

        /* renamed from: g */
        public boolean mo25958g(boolean z, tg4 tg4) {
            return false;
        }

        /* renamed from: h */
        public boolean mo25960h(boolean z) {
            TextView textView = this.f221862d;
            if (textView == null) {
                return true;
            }
            if (z) {
                textView.setVisibility(0);
                return true;
            }
            textView.setVisibility(8);
            return true;
        }

        /* renamed from: i */
        public boolean mo25962i(boolean z, tg4 tg4) {
            return true;
        }

        /* renamed from: j */
        public boolean mo64135j(boolean z, tg4 tg4) {
            return false;
        }

        /* renamed from: k */
        public void mo64136k(C115631n nVar, boolean z) {
            ((C76963d) C86312j.m106911c(C76963d.class)).mo107037m2(this, nVar, z);
        }

        /* renamed from: l */
        public boolean mo64137l() {
            return false;
        }

        /* renamed from: m */
        public boolean mo64138m(boolean z) {
            return ((C76963d) C86312j.m106911c(C76963d.class)).mo107036I0(z, this);
        }

        /* renamed from: n */
        public boolean mo64139n(boolean z, tg4 tg4) {
            return false;
        }

        /* renamed from: o */
        public void mo64140o(boolean z, C115631n nVar) {
        }
    }

    /* renamed from: e21.y0$b */
    public static class C116674b {

        /* renamed from: A */
        public MTimerHandler f349834A;

        /* renamed from: B */
        public MTimerHandler f349835B;

        /* renamed from: C */
        public boolean f349836C;

        /* renamed from: D */
        public long f349837D;

        /* renamed from: E */
        public long f349838E;

        /* renamed from: F */
        public String f349839F;

        /* renamed from: G */
        public String f349840G;

        /* renamed from: H */
        public C64774vi f349841H;

        /* renamed from: I */
        public boolean f349842I;

        /* renamed from: J */
        public C118480xn3 f349843J;

        /* renamed from: K */
        public boolean f349844K;

        /* renamed from: L */
        public String f349845L;

        /* renamed from: M */
        public C49139df2 f349846M;

        /* renamed from: N */
        public boolean f349847N;

        /* renamed from: O */
        public String f349848O;

        /* renamed from: P */
        public int f349849P;

        /* renamed from: Q */
        public C64275c7 f349850Q;

        /* renamed from: a */
        public String f349851a;

        /* renamed from: b */
        public C89349b f349852b;

        /* renamed from: c */
        public String f349853c;

        /* renamed from: d */
        public int f349854d;

        /* renamed from: e */
        public C118477wj3 f349855e;

        /* renamed from: f */
        public C118477wj3 f349856f;

        /* renamed from: g */
        public LinkedList<C118447nw2> f349857g = new LinkedList<>();

        /* renamed from: h */
        public C118447nw2 f349858h;

        /* renamed from: i */
        public String f349859i;

        /* renamed from: j */
        public C89349b f349860j;

        /* renamed from: k */
        public double f349861k;

        /* renamed from: l */
        public String f349862l;

        /* renamed from: m */
        public String f349863m = "";

        /* renamed from: n */
        public String f349864n = "";

        /* renamed from: o */
        public boolean f349865o = false;

        /* renamed from: p */
        public int f349866p;

        /* renamed from: q */
        public String f349867q;

        /* renamed from: r */
        public String f349868r;

        /* renamed from: s */
        public String f349869s;

        /* renamed from: t */
        public int f349870t;

        /* renamed from: u */
        public Bitmap f349871u;

        /* renamed from: v */
        public int f349872v;

        /* renamed from: w */
        public List<C116645t.C116647b> f349873w = new LinkedList();

        /* renamed from: x */
        public C116645t f349874x;

        /* renamed from: y */
        public float f349875y;

        /* renamed from: z */
        public int f349876z;
    }

    /* renamed from: e21.y0$c */
    public static class C116675c {

        /* renamed from: A */
        public RelativeLayout f349877A;

        /* renamed from: B */
        public View f349878B;

        /* renamed from: C */
        public View f349879C;

        /* renamed from: D */
        public WalletTextView f349880D;

        /* renamed from: E */
        public RecyclerView f349881E;

        /* renamed from: F */
        public C116648v0.C116655g f349882F;

        /* renamed from: G */
        public LinearLayout f349883G;

        /* renamed from: H */
        public WeImageView f349884H;

        /* renamed from: I */
        public TextView f349885I;

        /* renamed from: J */
        public Button f349886J;

        /* renamed from: K */
        public Button f349887K;

        /* renamed from: L */
        public RelativeLayout f349888L;

        /* renamed from: M */
        public LinearLayout f349889M;

        /* renamed from: N */
        public WeImageView f349890N;

        /* renamed from: O */
        public LinearLayout f349891O;

        /* renamed from: P */
        public TextView f349892P;

        /* renamed from: Q */
        public LinearLayout f349893Q;

        /* renamed from: R */
        public RelativeLayout f349894R;

        /* renamed from: S */
        public WeImageView f349895S;

        /* renamed from: T */
        public WeImageView f349896T;

        /* renamed from: U */
        public TextView f349897U;

        /* renamed from: V */
        public CdnImageView f349898V;

        /* renamed from: W */
        public TextView f349899W;

        /* renamed from: X */
        public WalletTextView f349900X;

        /* renamed from: a */
        public View f349901a;

        /* renamed from: b */
        public RelativeLayout f349902b;

        /* renamed from: c */
        public RelativeLayout f349903c;

        /* renamed from: d */
        public WeImageView f349904d;

        /* renamed from: e */
        public WeImageView f349905e;

        /* renamed from: f */
        public TextView f349906f;

        /* renamed from: g */
        public TextView f349907g;

        /* renamed from: h */
        public RelativeLayout f349908h;

        /* renamed from: i */
        public RelativeLayout f349909i;

        /* renamed from: j */
        public View f349910j;

        /* renamed from: k */
        public TextView f349911k;

        /* renamed from: l */
        public LinearLayout f349912l;

        /* renamed from: m */
        public WalletTextView f349913m;

        /* renamed from: n */
        public TextView f349914n;

        /* renamed from: o */
        public TextView f349915o;

        /* renamed from: p */
        public RelativeLayout f349916p;

        /* renamed from: q */
        public ImageView f349917q;

        /* renamed from: r */
        public TextView f349918r;

        /* renamed from: s */
        public TextView f349919s;

        /* renamed from: t */
        public TextView f349920t;

        /* renamed from: u */
        public LinearLayout f349921u;

        /* renamed from: v */
        public CdnImageView f349922v;

        /* renamed from: w */
        public TextView f349923w;

        /* renamed from: x */
        public TextView f349924x;

        /* renamed from: y */
        public ImageView f349925y;

        /* renamed from: z */
        public RelativeLayout f349926z;

        /* renamed from: a */
        public void mo180677a(View view, Context context, int i) {
            this.f349901a = view;
            this.f349902b = (RelativeLayout) view.findViewById(C0966R.C0970id.h6i);
            this.f349903c = (RelativeLayout) view.findViewById(C0966R.C0970id.h5s);
            this.f349906f = (TextView) view.findViewById(C0966R.C0970id.hq8);
            this.f349907g = (TextView) view.findViewById(C0966R.C0970id.h7_);
            this.f349904d = (WeImageView) view.findViewById(C0966R.C0970id.h6n);
            WeImageView weImageView = (WeImageView) view.findViewById(C0966R.C0970id.hhe);
            this.f349905e = weImageView;
            weImageView.setRotation(270.0f);
            this.f349903c.setBackgroundResource(C0966R.C0969drawable.a_3);
            this.f349902b.setBackgroundResource(C0966R.C0969drawable.a_1);
            if (i == 2) {
                this.f349906f.setText(context.getString(C0966R.string.bta));
                this.f349904d.setImageResource(C0966R.raw.icon_outlined_collect_mch);
            } else {
                this.f349906f.setText(context.getString(C0966R.string.btb));
                this.f349904d.setImageResource(C0966R.raw.icon_outlined_collect_personal);
            }
            this.f349909i = (RelativeLayout) view.findViewById(C0966R.C0970id.epz);
            this.f349908h = (RelativeLayout) view.findViewById(C0966R.C0970id.er5);
            this.f349910j = view.findViewById(C0966R.C0970id.f5o);
            TextView textView = (TextView) view.findViewById(C0966R.C0970id.gzz);
            this.f349911k = textView;
            C75228t.m90240d(textView);
            this.f349916p = (RelativeLayout) view.findViewById(C0966R.C0970id.f7q);
            ImageView imageView = (ImageView) view.findViewById(C0966R.C0970id.f7p);
            this.f349917q = imageView;
            if (i == 2) {
                imageView.setContentDescription(context.getString(C0966R.string.d27));
            } else {
                imageView.setContentDescription(context.getString(C0966R.string.d9d));
            }
            ViewGroup.LayoutParams layoutParams = this.f349916p.getLayoutParams();
            layoutParams.width = C76577a.m92151b(context, 206);
            layoutParams.height = C76577a.m92151b(context, 206);
            this.f349916p.setLayoutParams(layoutParams);
            LinearLayout linearLayout = (LinearLayout) view.findViewById(C0966R.C0970id.eul);
            this.f349912l = (LinearLayout) view.findViewById(C0966R.C0970id.era);
            TextView textView2 = (TextView) view.findViewById(C0966R.C0970id.er_);
            this.f349913m = (WalletTextView) view.findViewById(C0966R.C0970id.er9);
            this.f349914n = (TextView) view.findViewById(C0966R.C0970id.er8);
            this.f349915o = (TextView) view.findViewById(C0966R.C0970id.nsp);
            RelativeLayout relativeLayout = (RelativeLayout) view.findViewById(C0966R.C0970id.ewo);
            this.f349918r = (TextView) view.findViewById(C0966R.C0970id.ffa);
            this.f349919s = (TextView) view.findViewById(C0966R.C0970id.bik);
            this.f349920t = (TextView) view.findViewById(C0966R.C0970id.f5r);
            this.f349921u = (LinearLayout) view.findViewById(C0966R.C0970id.ci6);
            this.f349922v = (CdnImageView) view.findViewById(C0966R.C0970id.ci5);
            this.f349923w = (TextView) view.findViewById(C0966R.C0970id.eae);
            this.f349924x = (TextView) view.findViewById(C0966R.C0970id.epu);
            this.f349925y = (ImageView) view.findViewById(C0966R.C0970id.e9t);
            ImageView imageView2 = (ImageView) view.findViewById(C0966R.C0970id.cfw);
            this.f349926z = (RelativeLayout) view.findViewById(C0966R.C0970id.e9p);
            this.f349877A = (RelativeLayout) view.findViewById(C0966R.C0970id.dft);
            this.f349878B = view.findViewById(C0966R.C0970id.dfs);
            this.f349879C = view.findViewById(C0966R.C0970id.dfr);
            LinearLayout linearLayout2 = (LinearLayout) view.findViewById(C0966R.C0970id.cid);
            this.f349880D = (WalletTextView) view.findViewById(C0966R.C0970id.cic);
            RecyclerView recyclerView = (RecyclerView) view.findViewById(C0966R.C0970id.ci8);
            this.f349881E = recyclerView;
            recyclerView.setLayoutManager(new LinearLayoutManager(context, 1, false));
            this.f349883G = (LinearLayout) view.findViewById(C0966R.C0970id.bi5);
            this.f349884H = (WeImageView) view.findViewById(C0966R.C0970id.mog);
            this.f349885I = (TextView) view.findViewById(C0966R.C0970id.bi8);
            this.f349886J = (Button) view.findViewById(C0966R.C0970id.bi6);
            this.f349887K = (Button) view.findViewById(C0966R.C0970id.bi7);
            this.f349888L = (RelativeLayout) view.findViewById(C0966R.C0970id.moe);
            this.f349889M = (LinearLayout) view.findViewById(C0966R.C0970id.mxt);
            this.f349890N = (WeImageView) view.findViewById(C0966R.C0970id.mxs);
            this.f349891O = (LinearLayout) view.findViewById(C0966R.C0970id.mod);
            this.f349892P = (TextView) view.findViewById(C0966R.C0970id.mof);
            this.f349893Q = (LinearLayout) view.findViewById(C0966R.C0970id.dkq);
            this.f349894R = (RelativeLayout) view.findViewById(C0966R.C0970id.f6198a2);
            this.f349897U = (TextView) view.findViewById(C0966R.C0970id.bzl);
            this.f349895S = (WeImageView) view.findViewById(C0966R.C0970id.f6199cx);
            WeImageView weImageView2 = (WeImageView) view.findViewById(C0966R.C0970id.ao7);
            this.f349896T = weImageView2;
            weImageView2.setRotation(270.0f);
            if (i == 2) {
                this.f349897U.setText(context.getString(C0966R.string.bta));
                this.f349895S.setImageResource(C0966R.raw.icon_outlined_collect_mch);
            } else {
                this.f349897U.setText(context.getString(C0966R.string.btb));
                this.f349895S.setImageResource(C0966R.raw.icon_outlined_collect_personal);
            }
            this.f349898V = (CdnImageView) view.findViewById(C0966R.C0970id.bia);
            this.f349899W = (TextView) view.findViewById(C0966R.C0970id.bic);
            this.f349900X = (WalletTextView) view.findViewById(C0966R.C0970id.bib);
        }
    }

    /* renamed from: a */
    public static void m164541a(C116674b bVar, C118466sp spVar, C118460qp qpVar) {
        if (spVar != null) {
            bVar.f349851a = spVar.f354375f;
            bVar.f349853c = spVar.f354377h;
            bVar.f349854d = spVar.f354376g;
            bVar.f349855e = spVar.f354384r;
            bVar.f349852b = spVar.f354387u;
            bVar.f349856f = spVar.f354385s;
            bVar.f349857g = spVar.f354378i;
            bVar.f349858h = spVar.f354379j;
            bVar.f349876z = spVar.f354388v;
            bVar.f349839F = spVar.f354382p;
            bVar.f349840G = spVar.f354383q;
            bVar.f349844K = spVar.f354386t == 0;
            bVar.f349847N = false;
            bVar.f349841H = spVar.f354389w;
            bVar.f349842I = spVar.f354390x;
            bVar.f349843J = spVar.f354391y;
        }
        if (qpVar != null) {
            bVar.f349851a = qpVar.f354280f;
            bVar.f349853c = qpVar.f354279e;
            bVar.f349854d = qpVar.f354287p;
            bVar.f349855e = qpVar.f354285n;
            bVar.f349852b = qpVar.f354290s;
            bVar.f349856f = qpVar.f354286o;
            bVar.f349857g = qpVar.f354284j;
            bVar.f349858h = qpVar.f354281g;
            bVar.f349876z = qpVar.f354291t;
            bVar.f349842I = qpVar.f354292u;
            bVar.f349843J = qpVar.f354293v;
            bVar.f349848O = qpVar.f354278d;
            bVar.f349849P = qpVar.f354288q;
            bVar.f349850Q = qpVar.f354289r;
        }
    }
}
