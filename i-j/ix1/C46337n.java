package ix1;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import ax1.C39641d;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.game.report.C40308d;
import com.tencent.p014mm.p136ui.widget.MMNeat7extView;
import com.tencent.p014mm.plugin.game.autogen.chatroom.Channel;
import com.tencent.p014mm.plugin.game.autogen.chatroom.ChatroomJumpInfo;
import com.tencent.p014mm.plugin.game.autogen.chatroom.ChatroomMsgPack;
import com.tencent.p014mm.plugin.game.autogen.chatroom.JumpInfo;
import com.tencent.p014mm.plugin.game.autogen.chatroom.MsgOptions;
import com.tencent.p014mm.plugin.game.autogen.chatroom.TopicInfo;
import com.tencent.p014mm.plugin.game.autogen.chatroom.VoteInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import gy3.C87412m;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kg3.C76577a;
import nj3.C76874e0;
import org.json.JSONException;
import org.json.JSONObject;
import org.libpag.PAGView;
import qo3.C77407n;
import rx3.C13604l;
import tl3.C78039a;
import uy1.C52645f;
import yw1.C53591c;
import yw1.C53600g;
import yw1.C53601h;
import zt3.C119157j;
import zt3.C119179t;

/* renamed from: ix1.n */
public class C46337n extends RecyclerView.C16631z {

    /* renamed from: A */
    public TextView f124835A;

    /* renamed from: B */
    public ViewGroup f124836B;

    /* renamed from: C */
    public int f124837C;

    /* renamed from: D */
    public Context f124838D;

    /* renamed from: E */
    public long f124839E;

    /* renamed from: F */
    public long f124840F;

    /* renamed from: G */
    public ChatroomMsgPack f124841G;

    /* renamed from: H */
    public ViewGroup f124842H;

    /* renamed from: I */
    public View f124843I;

    /* renamed from: J */
    public ImageView f124844J;

    /* renamed from: K */
    public PAGView f124845K;

    /* renamed from: L */
    public ImageView f124846L;

    /* renamed from: M */
    public TextView f124847M;

    /* renamed from: N */
    public TextView f124848N;

    /* renamed from: P */
    public View f124849P;

    /* renamed from: Q */
    public ImageView f124850Q;

    /* renamed from: Q0 */
    public ImageView f124851Q0;

    /* renamed from: R */
    public TextView f124852R;

    /* renamed from: R0 */
    public FrameLayout f124853R0;

    /* renamed from: S */
    public ViewGroup f124854S;

    /* renamed from: S0 */
    public TextView f124855S0;

    /* renamed from: T */
    public ViewGroup f124856T;

    /* renamed from: T0 */
    public ImageView f124857T0;

    /* renamed from: U */
    public ViewGroup f124858U;

    /* renamed from: U0 */
    public C39641d f124859U0;

    /* renamed from: V */
    public MMNeat7extView f124860V;

    /* renamed from: V0 */
    public C39641d f124861V0;

    /* renamed from: W */
    public ViewGroup f124862W;

    /* renamed from: W0 */
    public JumpInfo f124863W0;

    /* renamed from: X */
    public ProgressBar f124864X;

    /* renamed from: X0 */
    public ChatroomJumpInfo f124865X0;

    /* renamed from: Y */
    public ImageView f124866Y;

    /* renamed from: Y0 */
    public long f124867Y0 = -1;

    /* renamed from: Z */
    public ViewGroup f124868Z;

    /* renamed from: Z0 */
    public String f124869Z0;

    /* renamed from: a1 */
    public Map<String, C53591c.C53598g> f124870a1 = new HashMap();

    /* renamed from: b1 */
    public long f124871b1 = 0;

    /* renamed from: c1 */
    public String f124872c1;

    /* renamed from: d1 */
    public List<Channel> f124873d1;

    /* renamed from: e1 */
    public int f124874e1;

    /* renamed from: f1 */
    public long f124875f1 = -1;

    /* renamed from: p0 */
    public ViewGroup f124876p0;

    /* renamed from: x0 */
    public TextView f124877x0;

    /* renamed from: y0 */
    public TextView f124878y0;

    /* renamed from: z */
    public View f124879z;

    public C46337n(View view, int i) {
        super(view);
        this.f124879z = view.findViewById(C0966R.C0970id.hdm);
        this.f124835A = (TextView) view.findViewById(C0966R.C0970id.h2n);
        this.f124836B = (ViewGroup) view.findViewById(C0966R.C0970id.h1p);
        Context context = view.getContext();
        this.f124838D = context;
        this.f124839E = ((Activity) context).getIntent().getLongExtra("game_report_sourceid", 0);
        this.f124840F = ((Activity) this.f124838D).getIntent().getLongExtra("game_report_ssid", 0);
        Map<Integer, Class<? extends C46337n>> map = C53600g.f150628a;
        int i2 = i != 10003 ? i != 10004 ? 1 : 3 : 2;
        this.f124837C = i2;
        if (i2 == 1) {
            LayoutInflater.from(this.f124838D).inflate(C0966R.C0971layout.av5, this.f124836B, true);
            this.f124842H = (ViewGroup) view.findViewById(C0966R.C0970id.b07);
            this.f124843I = view.findViewById(C0966R.C0970id.f359471l23);
            this.f124844J = (ImageView) view.findViewById(C0966R.C0970id.j0h);
            this.f124845K = (PAGView) view.findViewById(C0966R.C0970id.mmh);
            this.f124846L = (ImageView) view.findViewById(C0966R.C0970id.l2f);
            this.f124847M = (TextView) view.findViewById(C0966R.C0970id.l2_);
            this.f124848N = (TextView) view.findViewById(C0966R.C0970id.l2j);
            this.f124849P = view.findViewById(C0966R.C0970id.m8n);
            this.f124850Q = (ImageView) view.findViewById(C0966R.C0970id.m8m);
            this.f124852R = (TextView) view.findViewById(C0966R.C0970id.m8o);
            this.f124854S = (ViewGroup) view.findViewById(C0966R.C0970id.br7);
            this.f124856T = (ViewGroup) view.findViewById(C0966R.C0970id.h1z);
            this.f124858U = (ViewGroup) view.findViewById(C0966R.C0970id.azi);
            MMNeat7extView mMNeat7extView = (MMNeat7extView) view.findViewById(C0966R.C0970id.azj);
            this.f124860V = mMNeat7extView;
            mMNeat7extView.setTextColor(Color.parseColor("#7D90A9"));
            this.f124862W = (ViewGroup) view.findViewById(C0966R.C0970id.h1o);
            this.f124864X = (ProgressBar) view.findViewById(C0966R.C0970id.h1x);
            this.f124866Y = (ImageView) view.findViewById(C0966R.C0970id.h1w);
            this.f124868Z = (ViewGroup) view.findViewById(C0966R.C0970id.h1q);
            this.f124853R0 = (FrameLayout) view.findViewById(C0966R.C0970id.f357995cy0);
            this.f124855S0 = (TextView) view.findViewById(C0966R.C0970id.cxy);
            this.f124857T0 = (ImageView) view.findViewById(C0966R.C0970id.cxw);
            this.f124876p0 = (ViewGroup) view.findViewById(C0966R.C0970id.m4s);
            this.f124877x0 = (TextView) view.findViewById(C0966R.C0970id.mjx);
            this.f124878y0 = (TextView) view.findViewById(C0966R.C0970id.mjy);
            this.f124851Q0 = (ImageView) view.findViewById(C0966R.C0970id.m5i);
        } else if (i2 == 2) {
            LayoutInflater.from(this.f124838D).inflate(C0966R.C0971layout.av8, this.f124836B, true);
            this.f124842H = (ViewGroup) view.findViewById(C0966R.C0970id.b08);
        } else if (i2 == 3) {
            LayoutInflater.from(this.f124838D).inflate(C0966R.C0971layout.av7, this.f124836B, true);
            this.f124842H = (ViewGroup) view.findViewById(C0966R.C0970id.b06);
        }
        mo71737O(this.f124842H);
    }

    /* renamed from: y */
    public static void m51653y(C46337n nVar, long j, boolean z) {
        int i = z ? 11 : 12;
        C77407n nVar2 = new C77407n(nVar.f124838D, 1, true);
        nVar2.f225771i = new C46346t(nVar, z);
        nVar2.f225782p = new C46347u(nVar, j, z, i);
        nVar2.f225802y = new C46348v(nVar, i);
        nVar2.mo107570o(true);
        View inflate = LayoutInflater.from(nVar.f124838D).inflate(C0966R.C0971layout.axw, (ViewGroup) null);
        ((TextView) inflate.findViewById(C0966R.C0970id.f359196jj2)).setText(z ? C0966R.string.ime : C0966R.string.aus);
        nVar2.mo107569n(inflate, false);
        nVar2.mo107573q();
        nVar.mo71735M(i, 1);
    }

    /* renamed from: B */
    public void mo71705B(ChatroomMsgPack chatroomMsgPack) {
    }

    /* renamed from: C */
    public void mo71730C(TopicInfo topicInfo, long j, boolean z) {
        if (topicInfo == null) {
            this.f124876p0.setVisibility(8);
            return;
        }
        this.f124876p0.setVisibility(0);
        if (topicInfo.has_publish) {
            this.f124876p0.setClickable(true);
            this.f124876p0.setOnClickListener(new n$$e(this, topicInfo));
            if (Util.isNullOrNil(topicInfo.right_desc)) {
                this.f124878y0.setVisibility(8);
            } else {
                this.f124878y0.setText(topicInfo.right_desc);
                this.f124878y0.setVisibility(0);
            }
            this.f124877x0.setText(mo71732G(topicInfo.left_desc, z, true));
            this.f124851Q0.setVisibility(0);
        } else {
            if (z) {
                this.f124876p0.setClickable(true);
                this.f124876p0.setOnClickListener(new n$$f(this, j));
            } else {
                this.f124876p0.setClickable(false);
            }
            this.f124851Q0.setVisibility(8);
            this.f124877x0.setText(mo71732G(topicInfo.left_desc, z, false));
            this.f124878y0.setVisibility(8);
        }
        Log.m105918d("bindTopicPublishData", "topicInfo  = hasPublish = " + topicInfo.has_publish + "   topicInfo.left_desc = " + topicInfo.left_desc + "   topicInfo.right_desc = " + topicInfo.right_desc + "    topicInfo.content_url = " + topicInfo.content_url);
    }

    /* renamed from: D */
    public boolean mo71725D() {
        return this instanceof C46322h;
    }

    /* renamed from: E */
    public final void mo71731E(boolean z) {
        ImageView imageView = this.f124844J;
        if (imageView != null) {
            HashMap<C13604l<String, String>, Long> hashMap = C46326i0.f124817a;
            C87412m.m108594g(imageView, "view");
            imageView.performHapticFeedback(1, 3);
            this.f124844J.setAlpha(0.5f);
            this.f124844J.postDelayed(new n$$k(this, z), 200);
            this.f124844J.postDelayed(new n$$l(this), 230);
        }
    }

    /* renamed from: F */
    public View mo71706F(ViewGroup viewGroup) {
        return null;
    }

    /* renamed from: G */
    public final SpannableString mo71732G(String str, boolean z, boolean z2) {
        if (z2) {
            if (Util.isNullOrNil(str)) {
                str = this.f124838D.getString(C0966R.string.m7u);
            }
        } else if (z) {
            String string = this.f124838D.getString(C0966R.string.m7r);
            String string2 = this.f124838D.getString(C0966R.string.m7s);
            SpannableString spannableString = new SpannableString(string + ", " + string2);
            spannableString.setSpan(new ForegroundColorSpan(this.f124838D.getColor(C0966R.color.Link_100)), 0, string.length(), 18);
            return spannableString;
        } else {
            str = this.f124838D.getString(C0966R.string.m7q);
        }
        return new SpannableString(str);
    }

    /* renamed from: H */
    public void mo71733H() {
        MsgOptions msgOptions;
        ChatroomMsgPack chatroomMsgPack = this.f124841G;
        if (chatroomMsgPack != null && chatroomMsgPack.seq == this.f124867Y0 && this.f124837C != 3) {
            if (chatroomMsgPack == null || (msgOptions = chatroomMsgPack.msg_options) == null || msgOptions.bg_type != 2) {
                this.f124842H.setBackgroundColor(this.f124838D.getResources().getColor(C0966R.color.BW_100_Alpha_0_1));
            } else {
                this.f124842H.setBackgroundColor(C53601h.m60134m("#665A33").intValue());
            }
            C119179t tVar = C119157j.f356862d;
            n$$m n__m = new n$$m(this);
            C119157j jVar = (C119157j) tVar;
            jVar.getClass();
            jVar.mo183892w(n__m, 3000, false);
        }
    }

    /* renamed from: I */
    public boolean mo71734I() {
        return C53601h.m60126e(this.f124869Z0).f150604a;
    }

    /* renamed from: J */
    public void mo71726J(C76874e0 e0Var) {
    }

    /* renamed from: K */
    public void mo71707K(View view) {
    }

    /* renamed from: L */
    public void mo71727L(int i) {
    }

    /* renamed from: M */
    public final void mo71735M(int i, int i2) {
        if (this.f124841G != null) {
            JSONObject jSONObject = new JSONObject();
            try {
                ViewGroup viewGroup = this.f124868Z;
                boolean z = false;
                if (viewGroup != null && viewGroup.getVisibility() == 0) {
                    z = true;
                }
                jSONObject.put("lightup", z);
            } catch (JSONException unused) {
            }
            long j = this.f124840F;
            long j2 = this.f124839E;
            ChatroomMsgPack chatroomMsgPack = this.f124841G;
            C40308d.f108375a.mo62998h((long) i, 2, j, j2, chatroomMsgPack.seq, chatroomMsgPack.from_username, (long) i2, this.f124874e1, jSONObject.toString());
        }
    }

    /* renamed from: N */
    public final void mo71736N() {
        MsgOptions msgOptions;
        if (this.f124837C != 3) {
            ChatroomMsgPack chatroomMsgPack = this.f124841G;
            if (chatroomMsgPack != null && (msgOptions = chatroomMsgPack.msg_options) != null && msgOptions.bg_type == 2) {
                this.f124842H.setBackgroundColor(C53601h.m60134m("#665A33").intValue());
            } else if (chatroomMsgPack == null || this.f124861V0 == null || !Util.nullAsNil(chatroomMsgPack.from_username).equals(Util.nullAsNil(this.f124861V0.getUserName()))) {
                this.f124842H.setBackgroundColor(this.f124838D.getResources().getColor(C0966R.color.UN_BW_0_Alpha_0_3));
            } else {
                this.f124842H.setBackgroundColor(this.f124838D.getResources().getColor(C0966R.color.BW_100_Alpha_0_1));
            }
        }
    }

    /* renamed from: O */
    public final void mo71737O(View view) {
        if (view != null) {
            n$$h n__h = new n$$h(this, view.getContext(), view);
            n__h.f229257z = true;
            n__h.mo108274i(view, new n$$i(this), new n$$j(this));
        }
    }

    /* renamed from: P */
    public void mo71738P() {
        Integer m;
        GradientDrawable gradientDrawable;
        ChatroomMsgPack chatroomMsgPack = this.f124841G;
        if (chatroomMsgPack != null && this.f124846L != null) {
            C53591c.C53598g gVar = (C53591c.C53598g) ((HashMap) this.f124870a1).get(chatroomMsgPack.from_username);
            if (gVar == null || Util.isNullOrNil(gVar.f150626a)) {
                this.f124846L.setVisibility(8);
                return;
            }
            C52645f.m59023a().mo73595e(this.f124846L, gVar.f150626a, (C52645f.C52650d) null, (C52645f.C52652e) null);
            com.tencent.p014mm.plugin.game.autogen.chatroom.Color color = gVar.f150627b;
            if (!(color == null || (m = C53601h.m60134m(Util.nullAsNil(color.dark_color))) == null || (gradientDrawable = (GradientDrawable) this.f124846L.getBackground()) == null)) {
                gradientDrawable.setColor(m.intValue());
            }
            this.f124846L.setVisibility(0);
        }
    }

    /* renamed from: z */
    public void mo71739z(VoteInfo voteInfo) {
        if (voteInfo == null) {
            this.f124868Z.setVisibility(8);
        } else if (voteInfo.show_type == 2) {
            this.f124868Z.setVisibility(0);
            if (Util.isNullOrNil((List) voteInfo.latest_voter_username_list)) {
                this.f124853R0.setVisibility(8);
            } else {
                this.f124853R0.setVisibility(0);
                this.f124853R0.removeAllViews();
                for (int i = 0; i < voteInfo.latest_voter_username_list.size(); i++) {
                    View inflate = LayoutInflater.from(this.f124838D).inflate(C0966R.C0971layout.a7o, this.f124853R0, false);
                    C78039a.m94189a((ImageView) inflate.findViewById(C0966R.C0970id.f357996cy1), voteInfo.latest_voter_username_list.get(i));
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
                    layoutParams.leftMargin = C76577a.m92151b(this.f124838D, 12) * i;
                    this.f124853R0.addView(inflate, 0, layoutParams);
                }
            }
            if (voteInfo.voted_by_me) {
                this.f124855S0.setTextColor(this.f124838D.getResources().getColor(C0966R.color.f2973b4));
                this.f124857T0.setVisibility(0);
                this.f124857T0.setImageResource(C0966R.raw.icons_filled_game_favour);
            } else {
                this.f124855S0.setTextColor(this.f124838D.getResources().getColor(C0966R.color.BW_100_Alpha_0_3));
                this.f124857T0.setVisibility(0);
                this.f124857T0.setImageResource(C0966R.raw.icons_filled_game_no_favour);
            }
            this.f124857T0.setTag(voteInfo);
            this.f124855S0.setText(voteInfo.desc);
            this.f124857T0.setOnClickListener(new n$$g(this));
        } else {
            this.f124868Z.setVisibility(8);
        }
    }
}
