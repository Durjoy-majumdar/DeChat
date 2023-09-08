package ce1;

import android.animation.ValueAnimator;
import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import bl3.C39818r;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.p136ui.tools.C7020t0;
import com.tencent.p014mm.p136ui.tools.KeyboardHeightProvider;
import com.tencent.p014mm.p136ui.widget.MMEditText;
import com.tencent.p014mm.plugin.finder.view.C4059g5;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import de3.C75355a0;
import di3.C86312j;
import er1.C58739j4;
import er1.C58784w3;
import er1.C7878t0;
import f40.C86709a0;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import ht1.C60200t1;
import j20.C117292a;
import java.util.Calendar;
import je1.C9312g4;
import k20.C60958c;
import k20.C9556a;
import k60.C60979d;
import kg3.C76577a;
import ob0.C11385n;
import ob0.C117747y;
import p629ny.C76979h;
import pl1.C100810g0;
import pl1.C11978e0;
import pl1.C11990s0;
import pl1.C62345f;
import qo3.C89779i0;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import u60.C65220d;
import up1.C27696y;
import up1.C37521f;
import uq1.C65453p;

/* renamed from: ce1.p */
public final class C0479p extends UIComponent implements C11385n, C7020t0 {

    /* renamed from: N */
    public static final C0481b f1167N = new C0481b((C8480h) null);

    /* renamed from: P */
    public static final C13601g<Integer> f1168P = C36568h.m40985a(C0480a.f1202d);

    /* renamed from: A */
    public String f1169A = "";

    /* renamed from: B */
    public String f1170B = "";

    /* renamed from: C */
    public String f1171C = "";

    /* renamed from: D */
    public String f1172D = "";

    /* renamed from: E */
    public int f1173E;

    /* renamed from: F */
    public int f1174F;

    /* renamed from: G */
    public String f1175G = "";

    /* renamed from: H */
    public String f1176H = "";

    /* renamed from: I */
    public KeyboardHeightProvider f1177I;

    /* renamed from: J */
    public final C13601g f1178J = C36568h.m40985a(new C0485f(this));

    /* renamed from: K */
    public final C13601g f1179K = C36568h.m40985a(new C0486g(this));

    /* renamed from: L */
    public final C13601g f1180L = C36568h.m40985a(new C0482c(this));

    /* renamed from: M */
    public final C13601g f1181M = C36568h.m40985a(new C0483d(this));

    /* renamed from: d */
    public TextView f1182d;

    /* renamed from: e */
    public MMEditText f1183e;

    /* renamed from: f */
    public MMEditText f1184f;

    /* renamed from: g */
    public TextView f1185g;

    /* renamed from: h */
    public ImageView f1186h;

    /* renamed from: i */
    public ScrollView f1187i;

    /* renamed from: j */
    public Button f1188j;

    /* renamed from: n */
    public TextView f1189n;

    /* renamed from: o */
    public LinearLayout f1190o;

    /* renamed from: p */
    public RelativeLayout f1191p;

    /* renamed from: q */
    public TextView f1192q;

    /* renamed from: r */
    public CheckBox f1193r;

    /* renamed from: s */
    public ViewGroup f1194s;

    /* renamed from: t */
    public TextView f1195t;

    /* renamed from: u */
    public TextView f1196u;

    /* renamed from: v */
    public TextView f1197v;

    /* renamed from: w */
    public long f1198w;

    /* renamed from: x */
    public String f1199x = "";

    /* renamed from: y */
    public int f1200y;

    /* renamed from: z */
    public int f1201z;

    /* renamed from: ce1.p$a */
    public static final class C0480a extends C87413o implements C32224a<Integer> {

        /* renamed from: d */
        public static final C0480a f1202d = new C0480a();

        public C0480a() {
            super(0);
        }

        public Object invoke() {
            C37521f.f99374d.getClass();
            return C37521f.f99462n1.mo60266n();
        }
    }

    /* renamed from: ce1.p$b */
    public static final class C0481b {
        public C0481b(C8480h hVar) {
        }

        /* renamed from: a */
        public static final int m427a(C0481b bVar) {
            bVar.getClass();
            return ((Number) ((C36570n) C0479p.f1168P).getValue()).intValue();
        }
    }

    /* renamed from: ce1.p$c */
    public static final class C0482c extends C87413o implements C32224a<View> {

        /* renamed from: d */
        public final /* synthetic */ C0479p f1203d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0482c(C0479p pVar) {
            super(0);
            this.f1203d = pVar;
        }

        public Object invoke() {
            return this.f1203d.findViewById(C0966R.C0970id.f357939cl0);
        }
    }

    /* renamed from: ce1.p$d */
    public static final class C0483d extends C87413o implements C32224a<TextView> {

        /* renamed from: d */
        public final /* synthetic */ C0479p f1204d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0483d(C0479p pVar) {
            super(0);
            this.f1204d = pVar;
        }

        public Object invoke() {
            return (TextView) this.f1204d.findViewById(C0966R.C0970id.cky);
        }
    }

    /* renamed from: ce1.p$e */
    public static final class C0484e implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C0479p f1205d;

        public C0484e(C0479p pVar) {
            this.f1205d = pVar;
        }

        public final void run() {
            KeyboardHeightProvider keyboardHeightProvider = this.f1205d.f1177I;
            if (keyboardHeightProvider != null) {
                keyboardHeightProvider.mo104022e();
            } else {
                C87412m.m108603p("keyboardHeightProvider");
                throw null;
            }
        }
    }

    /* renamed from: ce1.p$f */
    public static final class C0485f extends C87413o implements C32224a<Integer> {

        /* renamed from: d */
        public final /* synthetic */ C0479p f1206d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0485f(C0479p pVar) {
            super(0);
            this.f1206d = pVar;
        }

        public Object invoke() {
            return Integer.valueOf(this.f1206d.getResources().getDimensionPixelOffset(C0966R.dimen.awl));
        }
    }

    /* renamed from: ce1.p$g */
    public static final class C0486g extends C87413o implements C32224a<Integer> {

        /* renamed from: d */
        public final /* synthetic */ C0479p f1207d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0486g(C0479p pVar) {
            super(0);
            this.f1207d = pVar;
        }

        public Object invoke() {
            float p = C76577a.m92165p(this.f1207d.getContext());
            return Integer.valueOf((int) (((float) this.f1207d.getResources().getDimensionPixelOffset(C0966R.dimen.awm)) - (p > 1.0f ? (p - ((float) 1)) * ((float) this.f1207d.getResources().getDimensionPixelOffset(C0966R.dimen.f3749d0)) : 0.0f)));
        }
    }

    /* renamed from: ce1.p$h */
    public static final class C0487h extends C87413o implements C32226l<String, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C0479p f1208d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0487h(C0479p pVar) {
            super(1);
            this.f1208d = pVar;
        }

        public Object invoke(Object obj) {
            C87412m.m108594g((String) obj, LocaleUtil.ITALIAN);
            Log.m105924i("FinderActivityPostUIC", "setAnnounceView");
            C58784w3.f168295a.mo83935h1(this.f1208d.getContext());
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0479p(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    /* renamed from: c3 */
    public static final void m420c3(C0479p pVar, boolean z) {
        MMEditText mMEditText = pVar.f1184f;
        if (mMEditText != null) {
            int paddingBottom = mMEditText.getPaddingBottom();
            if (z && paddingBottom == pVar.f1174F) {
                Log.m105924i("FinderActivityPostUIC", "animateDesc isBig:" + paddingBottom + " paddingBottom:" + paddingBottom + " return");
            } else if (z || paddingBottom != pVar.f1173E) {
                MMEditText mMEditText2 = pVar.f1184f;
                if (mMEditText2 != null) {
                    int paddingStart = mMEditText2.getPaddingStart();
                    MMEditText mMEditText3 = pVar.f1184f;
                    if (mMEditText3 != null) {
                        int paddingTop = mMEditText3.getPaddingTop();
                        MMEditText mMEditText4 = pVar.f1184f;
                        if (mMEditText4 != null) {
                            int paddingEnd = mMEditText4.getPaddingEnd();
                            ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{paddingBottom, z ? pVar.f1174F : pVar.f1173E});
                            ofInt.setDuration(200);
                            ofInt.addUpdateListener(new C0488q(pVar, paddingStart, paddingTop, paddingEnd));
                            ofInt.start();
                            return;
                        }
                        C87412m.m108603p("descEdit");
                        throw null;
                    }
                    C87412m.m108603p("descEdit");
                    throw null;
                }
                C87412m.m108603p("descEdit");
                throw null;
            } else {
                Log.m105924i("FinderActivityPostUIC", "animateDesc isBig:" + paddingBottom + " paddingBottom:" + paddingBottom + " return");
            }
        } else {
            C87412m.m108603p("descEdit");
            throw null;
        }
    }

    /* renamed from: d3 */
    public static final void m421d3(C0479p pVar, int i, int i2) {
        CheckBox checkBox = pVar.f1193r;
        if (checkBox != null) {
            if (checkBox.isChecked()) {
                boolean z = false;
                if (1 <= i && i < 11) {
                    if (1 <= i2 && i2 <= C0481b.m427a(f1167N)) {
                        z = true;
                    }
                    if (z) {
                        Button button = pVar.f1188j;
                        if (button != null) {
                            button.setBackgroundResource(C0966R.C0969drawable.f4653j6);
                            Button button2 = pVar.f1188j;
                            if (button2 != null) {
                                button2.setTextColor(pVar.getResources().getColor(C0966R.color.f3185i9));
                                return;
                            } else {
                                C87412m.m108603p("postBtn");
                                throw null;
                            }
                        } else {
                            C87412m.m108603p("postBtn");
                            throw null;
                        }
                    }
                }
            }
            Button button3 = pVar.f1188j;
            if (button3 != null) {
                button3.setBackgroundResource(C0966R.C0969drawable.f4665jf);
                Button button4 = pVar.f1188j;
                if (button4 != null) {
                    button4.setTextColor(pVar.getResources().getColor(C0966R.color.f3182i6));
                } else {
                    C87412m.m108603p("postBtn");
                    throw null;
                }
            } else {
                C87412m.m108603p("postBtn");
                throw null;
            }
        } else {
            C87412m.m108603p("announceCheckBox");
            throw null;
        }
    }

    /* renamed from: Q1 */
    public void mo531Q1(int i, boolean z) {
        int intValue = ((Number) ((C36570n) this.f1179K).getValue()).intValue() - i;
        if (intValue < ((Number) ((C36570n) this.f1178J).getValue()).intValue()) {
            intValue = ((Number) ((C36570n) this.f1178J).getValue()).intValue();
        }
        LinearLayout linearLayout = this.f1190o;
        if (linearLayout != null) {
            linearLayout.setMinimumHeight(intValue);
        } else {
            C87412m.m108603p("profileLayout");
            throw null;
        }
    }

    /* renamed from: e3 */
    public final void mo532e3(C65220d dVar) {
        MMEditText mMEditText = this.f1183e;
        if (mMEditText != null) {
            String obj = mMEditText.getText().toString();
            MMEditText mMEditText2 = this.f1184f;
            if (mMEditText2 != null) {
                String obj2 = mMEditText2.getText().toString();
                this.f1175G = dVar instanceof C65453p ? ((C65453p) dVar).f188339g : "";
                CheckBox checkBox = this.f1193r;
                if (checkBox != null) {
                    checkBox.setEnabled(false);
                    C86709a0.m107524d().mo123455a(4050, this);
                    C86709a0.m107524d().mo123460f(new C9312g4(this.f1170B, obj, obj2, this.f1175G, this.f1198w, 0, 32, (C8480h) null));
                    return;
                }
                C87412m.m108603p("announceCheckBox");
                throw null;
            }
            C87412m.m108603p("descEdit");
            throw null;
        }
        C87412m.m108603p("nameEdit");
        throw null;
    }

    /* renamed from: f3 */
    public final void mo533f3(boolean z) {
        String string = getContext().getResources().getString(C0966R.string.cy6);
        C87412m.m108593f(string, "context.resources.getStr…r_activity_announce_name)");
        String string2 = getResources().getString(C0966R.string.mqh, new Object[]{string});
        C87412m.m108593f(string2, "resources.getString(R.st…_agreement, announceName)");
        SpannableString spannableString = new SpannableString(string2);
        spannableString.setSpan(new C4059g5(string2, getResources().getColor(C0966R.color.f3595yw), getContext().getResources().getColor(C0966R.color.ahf), false, false, new C0487h(this)), string2.length() - string.length(), string2.length(), 17);
        if (z) {
            TextView textView = this.f1192q;
            if (textView != null) {
                textView.setTextColor(getResources().getColor(C0966R.color.BW_100_Alpha_0_5));
            }
        } else {
            TextView textView2 = this.f1192q;
            if (textView2 != null) {
                textView2.setTextColor(getResources().getColor(C0966R.color.FG_1));
            }
        }
        if (z) {
            CheckBox checkBox = this.f1193r;
            if (checkBox != null) {
                checkBox.setBackgroundResource(C0966R.C0969drawable.b_n);
            } else {
                C87412m.m108603p("announceCheckBox");
                throw null;
            }
        } else {
            CheckBox checkBox2 = this.f1193r;
            if (checkBox2 != null) {
                checkBox2.setBackgroundResource(C0966R.C0969drawable.ag6);
            } else {
                C87412m.m108603p("announceCheckBox");
                throw null;
            }
        }
        TextView textView3 = this.f1192q;
        if (textView3 != null) {
            textView3.setOnTouchListener(new C75355a0(getContext()));
        }
        TextView textView4 = this.f1192q;
        if (textView4 != null) {
            textView4.setText(spannableString);
        }
    }

    /* renamed from: g3 */
    public final void mo534g3(int i) {
        MMEditText mMEditText = this.f1183e;
        if (mMEditText != null) {
            mMEditText.setTextColor(i);
            MMEditText mMEditText2 = this.f1184f;
            if (mMEditText2 != null) {
                mMEditText2.setTextColor(i);
                TextView textView = this.f1182d;
                if (textView != null) {
                    textView.setTextColor(i);
                    TextView textView2 = this.f1195t;
                    if (textView2 != null) {
                        textView2.setTextColor(i);
                        TextView textView3 = this.f1189n;
                        if (textView3 != null) {
                            textView3.setTextColor(i);
                        } else {
                            C87412m.m108603p("selectTimeText");
                            throw null;
                        }
                    } else {
                        C87412m.m108603p("cancelBtn");
                        throw null;
                    }
                } else {
                    C87412m.m108603p("titleText");
                    throw null;
                }
            } else {
                C87412m.m108603p("descEdit");
                throw null;
            }
        } else {
            C87412m.m108603p("nameEdit");
            throw null;
        }
    }

    /* renamed from: i3 */
    public final void mo535i3(boolean z, int i) {
        if (z) {
            View view = (View) ((C36570n) this.f1180L).getValue();
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/activity/uic/FinderActivityPostUIC", "showErrorTips", "(ZI)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/activity/uic/FinderActivityPostUIC", "showErrorTips", "(ZI)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            if (i == -4066) {
                ((TextView) ((C36570n) this.f1181M).getValue()).setText(C0966R.string.cy_);
            } else if (i != -4055) {
                ((TextView) ((C36570n) this.f1181M).getValue()).setText(C0966R.string.cyb);
            } else {
                ((TextView) ((C36570n) this.f1181M).getValue()).setText(C0966R.string.cya);
            }
        } else {
            View view3 = (View) ((C36570n) this.f1180L).getValue();
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar2.mo10233c(8);
            View view4 = view3;
            C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/activity/uic/FinderActivityPostUIC", "showErrorTips", "(ZI)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view4, "com/tencent/mm/plugin/finder/activity/uic/FinderActivityPostUIC", "showErrorTips", "(ZI)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        View findViewById = getActivity().findViewById(C0966R.C0970id.d6q);
        C87412m.m108593f(findViewById, "activity.findViewById(R.…der_activity_post_scroll)");
        this.f1187i = (ScrollView) findViewById;
        String stringExtra = getIntent().getStringExtra("key_nick_name");
        String str = "";
        if (stringExtra == null) {
            stringExtra = str;
        }
        this.f1169A = stringExtra;
        String stringExtra2 = getIntent().getStringExtra("key_user_name");
        if (stringExtra2 == null) {
            stringExtra2 = str;
        }
        this.f1170B = stringExtra2;
        String stringExtra3 = getIntent().getStringExtra("key_activity_name");
        if (stringExtra3 == null) {
            stringExtra3 = str;
        }
        this.f1171C = stringExtra3;
        String stringExtra4 = getIntent().getStringExtra("key_activity_desc");
        if (stringExtra4 == null) {
            stringExtra4 = str;
        }
        this.f1172D = stringExtra4;
        String stringExtra5 = getIntent().getStringExtra("key_activity_local_cover_url");
        if (stringExtra5 != null) {
            str = stringExtra5;
        }
        this.f1176H = str;
        getIntent().getIntExtra("key_activity_type", 101);
        Util.isNullOrNil(this.f1176H);
        this.f1173E = (int) getResources().getDimension(C0966R.dimen.f3736cp);
        this.f1174F = (int) getResources().getDimension(C0966R.dimen.f3754d5);
        String spannableString = ((C76979h) C86312j.m106911c(C76979h.class)).mo107057T1(getActivity(), this.f1169A).toString();
        C87412m.m108593f(spannableString, "getService(ISpannableSer…this.nickName).toString()");
        View findViewById2 = getActivity().findViewById(C0966R.C0970id.d6j);
        ((TextView) findViewById2).setOnClickListener(new C0491t(this));
        C87412m.m108593f(findViewById2, "activity.findViewById<Te…)\n            }\n        }");
        this.f1195t = (TextView) findViewById2;
        View findViewById3 = getActivity().findViewById(C0966R.C0970id.d6r);
        C87412m.m108593f(findViewById3, "activity.findViewById(R.…nder_activity_post_title)");
        TextView textView = (TextView) findViewById3;
        this.f1182d = textView;
        C85875k4.m106189j0(textView.getPaint(), 0.8f);
        Class cls = C11990s0.class;
        Class<C60200t1> cls2 = C60200t1.class;
        AppCompatActivity activity = getActivity();
        View findViewById4 = activity.findViewById(C0966R.C0970id.d6m);
        C87412m.m108593f(findViewById4, "findViewById(R.id.finder_activity_post_name_edit)");
        this.f1183e = (MMEditText) findViewById4;
        if (!TextUtils.isEmpty(this.f1171C)) {
            MMEditText mMEditText = this.f1183e;
            if (mMEditText != null) {
                mMEditText.setText(this.f1171C);
            } else {
                C87412m.m108603p("nameEdit");
                throw null;
            }
        }
        View findViewById5 = activity.findViewById(C0966R.C0970id.d6k);
        C87412m.m108593f(findViewById5, "findViewById(R.id.finder_activity_post_desc_edit)");
        this.f1184f = (MMEditText) findViewById5;
        if (!TextUtils.isEmpty(this.f1172D)) {
            MMEditText mMEditText2 = this.f1184f;
            if (mMEditText2 != null) {
                mMEditText2.setText(this.f1172D);
            } else {
                C87412m.m108603p("descEdit");
                throw null;
            }
        }
        View findViewById6 = activity.findViewById(C0966R.C0970id.f5512h6);
        C87412m.m108593f(findViewById6, "findViewById(R.id.activity_profile_header_name)");
        this.f1185g = (TextView) findViewById6;
        View findViewById7 = activity.findViewById(C0966R.C0970id.f5506h0);
        C87412m.m108593f(findViewById7, "findViewById(R.id.activity_profile_header_avatar)");
        this.f1186h = (ImageView) findViewById7;
        TextView textView2 = this.f1185g;
        if (textView2 != null) {
            textView2.setText(spannableString);
            String stringExtra6 = getIntent().getStringExtra("key_avatar_url");
            C39818r rVar = C39818r.f106831a;
            C60979d<C100810g0> i2 = ((C11990s0) rVar.mo62446e(cls2).mo62447c(cls)).mo11872i2();
            C62345f fVar = new C62345f(stringExtra6, (C27696y) null, 2, (C8480h) null);
            ImageView imageView = this.f1186h;
            if (imageView != null) {
                i2.mo85957c(fVar, imageView, ((C11990s0) rVar.mo62446e(cls2).mo62447c(cls)).mo11867O2(C11978e0.C11979a.AVATAR));
                StringBuilder sb = new StringBuilder();
                sb.append("nameEdit size ");
                MMEditText mMEditText3 = this.f1183e;
                if (mMEditText3 != null) {
                    sb.append(mMEditText3.getTextSize());
                    sb.append("  descEdit size ");
                    MMEditText mMEditText4 = this.f1184f;
                    if (mMEditText4 != null) {
                        sb.append(mMEditText4.getTextSize());
                        Log.m105924i("FinderActivityPostUIC", sb.toString());
                        C0490s sVar = new C0490s(this);
                        MMEditText mMEditText5 = this.f1183e;
                        if (mMEditText5 != null) {
                            mMEditText5.setOnTouchListener(sVar);
                            MMEditText mMEditText6 = this.f1184f;
                            if (mMEditText6 != null) {
                                mMEditText6.setOnTouchListener(sVar);
                                View findViewById8 = getActivity().findViewById(C0966R.C0970id.c3d);
                                C87412m.m108593f(findViewById8, "activity.findViewById(R.….activity_profile_layout)");
                                this.f1190o = (LinearLayout) findViewById8;
                                View findViewById9 = getActivity().findViewById(C0966R.C0970id.amv);
                                C87412m.m108593f(findViewById9, "activity.findViewById(R.…_post_announce_container)");
                                this.f1191p = (RelativeLayout) findViewById9;
                                View findViewById10 = getActivity().findViewById(C0966R.C0970id.d6i);
                                C87412m.m108593f(findViewById10, "activity.findViewById(R.…finder_activity_post_btn)");
                                Button button = (Button) findViewById10;
                                this.f1188j = button;
                                button.setOnClickListener(new C0492u(this));
                                this.f1192q = (TextView) getActivity().findViewById(C0966R.C0970id.f5491gl);
                                View findViewById11 = getActivity().findViewById(C0966R.C0970id.aos);
                                C87412m.m108593f(findViewById11, "activity.findViewById(R.….activity_post_check_box)");
                                this.f1193r = (CheckBox) findViewById11;
                                View findViewById12 = getActivity().findViewById(C0966R.C0970id.f357445b02);
                                C87412m.m108593f(findViewById12, "activity.findViewById(R.…ty_post_check_box_layout)");
                                this.f1194s = (ViewGroup) findViewById12;
                                CheckBox checkBox = this.f1193r;
                                if (checkBox != null) {
                                    Object f = C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_FINDER_POST_ACTIVITY_READ_LICENSE_BOOLEAN_SYNC, Boolean.FALSE);
                                    C87412m.m108592e(f, "null cannot be cast to non-null type kotlin.Boolean");
                                    checkBox.setChecked(((Boolean) f).booleanValue());
                                    ViewGroup viewGroup = this.f1194s;
                                    if (viewGroup != null) {
                                        viewGroup.setOnClickListener(new C0493v(this));
                                        CheckBox checkBox2 = this.f1193r;
                                        if (checkBox2 != null) {
                                            checkBox2.setOnCheckedChangeListener(new C0494w(this));
                                            mo533f3(false);
                                            MMEditText mMEditText7 = this.f1183e;
                                            if (mMEditText7 != null) {
                                                mMEditText7.addTextChangedListener(new C0495x(this));
                                                MMEditText mMEditText8 = this.f1183e;
                                                if (mMEditText8 != null) {
                                                    C85875k4.m106189j0(mMEditText8.getPaint(), 0.8f);
                                                    this.f1196u = (TextView) getActivity().findViewById(C0966R.C0970id.d6n);
                                                    this.f1197v = (TextView) getActivity().findViewById(C0966R.C0970id.d6l);
                                                    MMEditText mMEditText9 = this.f1184f;
                                                    if (mMEditText9 != null) {
                                                        mMEditText9.addTextChangedListener(new C0496y(this));
                                                        View findViewById13 = getActivity().findViewById(C0966R.C0970id.d6w);
                                                        C87412m.m108593f(findViewById13, "activity.findViewById(R.…inder_activity_time_text)");
                                                        TextView textView3 = (TextView) findViewById13;
                                                        this.f1189n = textView3;
                                                        textView3.setOnClickListener(new C0497z(this));
                                                        Calendar instance = Calendar.getInstance();
                                                        C58784w3 w3Var = C58784w3.f168295a;
                                                        instance.setTimeInMillis(w3Var.mo83943k0());
                                                        instance.set(12, 0);
                                                        instance.set(13, 0);
                                                        Calendar instance2 = Calendar.getInstance();
                                                        instance2.setTimeInMillis(w3Var.mo83943k0());
                                                        instance2.add(2, 1);
                                                        instance2.add(11, 1);
                                                        instance2.set(12, 0);
                                                        instance2.set(13, 0);
                                                        Calendar instance3 = Calendar.getInstance();
                                                        instance3.setTimeInMillis(w3Var.mo83943k0());
                                                        instance3.set(2, 11);
                                                        instance3.set(5, 31);
                                                        instance3.set(11, 0);
                                                        instance3.set(12, 0);
                                                        instance3.set(13, 0);
                                                        int i = instance3.get(6);
                                                        int i3 = instance2.get(6) - instance.get(6);
                                                        if (i3 < 0) {
                                                            i3 += i;
                                                        }
                                                        this.f1200y = i3;
                                                        Log.m105924i("FinderActivityPostUIC", "selectedDateIndex :" + this.f1200y + " yearCount:" + i);
                                                        int i4 = instance2.get(11);
                                                        this.f1201z = i4;
                                                        if (i4 > 23) {
                                                            this.f1201z = 23;
                                                        }
                                                        Log.m105924i("FinderActivityPostUIC", "initSelectTime time:" + instance2.getTime() + ",timeInMills:" + instance2.getTimeInMillis());
                                                        this.f1198w = instance2.getTimeInMillis() / ((long) 1000);
                                                        int i5 = 7;
                                                        int i6 = instance2.get(7);
                                                        if (i6 - 2 >= 0) {
                                                            i5 = i6 - 1;
                                                        }
                                                        int i7 = instance2.get(5);
                                                        String string = getContext().getResources().getString(C0966R.string.d2k, new Object[]{C58739j4.f168176a.mo83675C(instance2.get(11))});
                                                        C87412m.m108593f(string, "context.resources.getStr…ime_picker_hour, hourStr)");
                                                        String str2 = (getContext().getResources().getString(C0966R.string.dzf, new Object[]{Integer.valueOf(instance2.get(2) + 1), Integer.valueOf(i7)}) + ' ' + C7878t0.m8040i(getContext(), i5, FirebaseAnalytics.C113379b.CAMPAIGN)) + ' ' + string;
                                                        this.f1199x = str2;
                                                        TextView textView4 = this.f1189n;
                                                        if (textView4 != null) {
                                                            textView4.setText(str2);
                                                            KeyboardHeightProvider keyboardHeightProvider = new KeyboardHeightProvider(getActivity());
                                                            this.f1177I = keyboardHeightProvider;
                                                            keyboardHeightProvider.f220015b = this;
                                                            return;
                                                        }
                                                        C87412m.m108603p("selectTimeText");
                                                        throw null;
                                                    }
                                                    C87412m.m108603p("descEdit");
                                                    throw null;
                                                }
                                                C87412m.m108603p("nameEdit");
                                                throw null;
                                            }
                                            C87412m.m108603p("nameEdit");
                                            throw null;
                                        }
                                        C87412m.m108603p("announceCheckBox");
                                        throw null;
                                    }
                                    C87412m.m108603p("announceCheckBoxContainer");
                                    throw null;
                                }
                                C87412m.m108603p("announceCheckBox");
                                throw null;
                            }
                            C87412m.m108603p("descEdit");
                            throw null;
                        }
                        C87412m.m108603p("nameEdit");
                        throw null;
                    }
                    C87412m.m108603p("descEdit");
                    throw null;
                }
                C87412m.m108603p("nameEdit");
                throw null;
            }
            C87412m.m108603p("avatarImage");
            throw null;
        }
        C87412m.m108603p("nickNameText");
        throw null;
    }

    public void onDestroy() {
        super.onDestroy();
        C86709a0.m107524d().mo123470p(4050, this);
    }

    public void onPause() {
        super.onPause();
        KeyboardHeightProvider keyboardHeightProvider = this.f1177I;
        if (keyboardHeightProvider != null) {
            keyboardHeightProvider.mo104021d();
        } else {
            C87412m.m108603p("keyboardHeightProvider");
            throw null;
        }
    }

    public void onResume() {
        super.onResume();
        Button button = this.f1188j;
        if (button != null) {
            button.post(new C0484e(this));
        } else {
            C87412m.m108603p("postBtn");
            throw null;
        }
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        Log.m105924i("FinderActivityPostUIC", "onSceneEnd: errType=" + i + ", errCode=" + i2 + ", errMsg=" + str);
        if (yVar instanceof C9312g4) {
            C89779i0 i0Var = ((C0461e0) C39818r.f106831a.mo62444c(getActivity()).mo75002a(C0461e0.class)).f1096d;
            if (i0Var != null && i0Var.isShowing()) {
                i0Var.dismiss();
            }
            if (i == 0 && i2 == 0) {
                long j = ((C9312g4) yVar).f29096i;
                C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_FINDER_POST_ACTIVITY_READ_LICENSE_BOOLEAN_SYNC, Boolean.TRUE);
                MMEditText mMEditText = this.f1183e;
                if (mMEditText != null) {
                    String obj = mMEditText.getText().toString();
                    MMEditText mMEditText2 = this.f1184f;
                    if (mMEditText2 != null) {
                        String obj2 = mMEditText2.getText().toString();
                        Intent intent = new Intent();
                        intent.putExtra("key_topic_id", j);
                        intent.putExtra("key_activity_name", obj);
                        intent.putExtra("key_activity_desc", obj2);
                        intent.putExtra("key_nick_name", this.f1169A);
                        intent.putExtra("key_activity_local_cover_url", this.f1176H);
                        intent.putExtra("key_cover_url", this.f1175G);
                        intent.putExtra("key_activity_type", 101);
                        intent.putExtra("key_activity_end_time", this.f1198w);
                        Log.m105924i("FinderActivityPostUI", "eventTopicId:" + j + "  name:" + obj + "  desc:" + obj2);
                        AppCompatActivity activity = getActivity();
                        activity.setResult(-1, intent);
                        if (!activity.isFinishing()) {
                            activity.finish();
                            return;
                        }
                        return;
                    }
                    C87412m.m108603p("descEdit");
                    throw null;
                }
                C87412m.m108603p("nameEdit");
                throw null;
            }
            CheckBox checkBox = this.f1193r;
            if (checkBox != null) {
                checkBox.setEnabled(true);
                mo535i3(true, i2);
                return;
            }
            C87412m.m108603p("announceCheckBox");
            throw null;
        }
    }
}
