package ao1;

import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import bl3.C39818r;
import bt1.C54563e;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.plugin.finder.post.PostMainUIC;
import com.tencent.p014mm.plugin.finder.view.FinderPostEditText;
import com.tencent.p014mm.plugin.finder.view.FinderPostFooter;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import di3.C86312j;
import er1.C58771q3;
import fe1.C58961d;
import fe1.C58969q;
import fy3.C32224a;
import gs1.C59693i;
import gy3.C87412m;
import gy3.C87413o;
import java.util.Map;
import l31.C61212e;
import nj3.C76901s0;
import p629ny.C76979h;
import q31.C118148a;
import qo3.C47877k0;
import rs1.C13442s8;
import rx3.C13601g;
import rx3.C13604l;
import rx3.C36568h;
import sx3.C90364q0;
import up1.C37521f;
import z04.C66713a;
import zc1.C66785b;

/* renamed from: ao1.t */
public final class C54277t extends UIComponent implements FinderPostFooter.C56564a {

    /* renamed from: d */
    public FinderPostEditText f152339d;

    /* renamed from: e */
    public TextView f152340e;

    /* renamed from: f */
    public FinderPostFooter f152341f;

    /* renamed from: g */
    public View f152342g;

    /* renamed from: h */
    public RelativeLayout f152343h;

    /* renamed from: i */
    public FinderPostEditText f152344i;

    /* renamed from: j */
    public TextView f152345j;

    /* renamed from: n */
    public ImageView f152346n;

    /* renamed from: o */
    public boolean f152347o = true;

    /* renamed from: p */
    public boolean f152348p = true;

    /* renamed from: q */
    public int f152349q;

    /* renamed from: r */
    public C59693i f152350r;

    /* renamed from: s */
    public int f152351s = -1;

    /* renamed from: t */
    public C76901s0 f152352t;

    /* renamed from: u */
    public final C13601g f152353u;

    /* renamed from: v */
    public final C13601g f152354v;

    /* renamed from: w */
    public boolean f152355w;

    /* renamed from: ao1.t$a */
    public static final class C0182a implements C118148a {

        /* renamed from: a */
        public final /* synthetic */ C54277t f646a;

        public C0182a(C54277t tVar) {
            this.f646a = tVar;
        }

        /* renamed from: a */
        public /* synthetic */ boolean mo36a(Object obj, String str, int i) {
            return false;
        }

        /* renamed from: b */
        public final Map<String, Object> mo37b(String str) {
            C13604l[] lVarArr = new C13604l[4];
            C13442s8.C13443a aVar = C13442s8.f38060Q0;
            C13442s8 f = aVar.mo12873f(this.f646a.getActivity());
            Integer num = null;
            lVarArr[0] = new C13604l("behaviour_session_id", f != null ? f.f38099o : null);
            C13442s8 f2 = aVar.mo12873f(this.f646a.getActivity());
            lVarArr[1] = new C13604l("finder_context_id", f2 != null ? f2.f38098n : null);
            C13442s8 f3 = aVar.mo12873f(this.f646a.getActivity());
            lVarArr[2] = new C13604l("finder_tab_context_id", f3 != null ? f3.f38100p : null);
            C13442s8 f4 = aVar.mo12873f(this.f646a.getActivity());
            if (f4 != null) {
                num = Integer.valueOf(f4.f38096i);
            }
            lVarArr[3] = new C13604l("comment_scene", num);
            return C90364q0.m113147f(lVarArr);
        }
    }

    /* renamed from: ao1.t$b */
    public static final class C0183b extends C87413o implements C32224a<C54563e> {

        /* renamed from: d */
        public final /* synthetic */ AppCompatActivity f647d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0183b(AppCompatActivity appCompatActivity) {
            super(0);
            this.f647d = appCompatActivity;
        }

        public Object invoke() {
            return ((PostMainUIC) C39818r.f106831a.mo62444c(this.f647d).mo75002a(PostMainUIC.class)).mo78410F3();
        }
    }

    /* renamed from: ao1.t$c */
    public static final class C0184c extends C87413o implements C32224a<ScrollView> {

        /* renamed from: d */
        public final /* synthetic */ AppCompatActivity f648d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0184c(AppCompatActivity appCompatActivity) {
            super(0);
            this.f648d = appCompatActivity;
        }

        public Object invoke() {
            ScrollView scrollView = ((PostMainUIC) C39818r.f106831a.mo62444c(this.f648d).mo75002a(PostMainUIC.class)).f160277n;
            if (scrollView != null) {
                return scrollView;
            }
            C87412m.m108603p("scrollView");
            throw null;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C54277t(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        C87412m.m108593f(getContext().getResources().getString(C0966R.string.egc), "context.resources.getStr…finder_original_feed_tip)");
        this.f152353u = C36568h.m40985a(new C0183b(appCompatActivity));
        this.f152354v = C36568h.m40985a(new C0184c(appCompatActivity));
    }

    /* renamed from: c3 */
    public static final void m61001c3(C54277t tVar, String str) {
        C76901s0 s0Var = tVar.f152352t;
        if (s0Var != null) {
            View contentView = s0Var.getContentView();
            TextView textView = contentView != null ? (TextView) contentView.findViewById(C0966R.C0970id.knw) : null;
            if (textView != null) {
                textView.setText(str);
            }
        } else if (tVar.f152355w) {
            tVar.f152352t = C47877k0.m53190b(tVar.getActivity(), C0966R.C0971layout.d5s, C0966R.raw.icons_outlined_info, tVar.getActivity().getResources().getColor(C0966R.color.f2929c), str, 0);
        } else {
            tVar.mo75073i3().post(new C54280x(tVar, str));
        }
    }

    /* renamed from: U1 */
    public void mo75068U1() {
        C58771q3 q3Var = C58771q3.f168268a;
        mo75069d3("#", "");
        if (mo75072g3().getVisibility() == 8) {
            AppCompatActivity activity = getActivity();
            C87412m.m108592e(activity, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            ((MMActivity) activity).showVKB();
        }
    }

    /* renamed from: d3 */
    public final void mo75069d3(String str, String str2) {
        String str3;
        int selectionStart = mo75070e3().getSelectionStart();
        String obj = mo75070e3().getText().toString();
        int length = str2.length() > 0 ? selectionStart - str2.length() : 0;
        if (selectionStart == 0) {
            str3 = str + obj;
        } else if (selectionStart == obj.length()) {
            if (length > 0) {
                StringBuilder sb = new StringBuilder();
                String substring = obj.substring(0, length);
                C87412m.m108593f(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                sb.append(substring);
                sb.append(str);
                String substring2 = obj.substring(length + 1, obj.length());
                C87412m.m108593f(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
                sb.append(substring2);
                str3 = sb.toString();
            } else {
                str3 = obj + str;
            }
        } else if (length > 0) {
            StringBuilder sb4 = new StringBuilder();
            String substring3 = obj.substring(0, length);
            C87412m.m108593f(substring3, "this as java.lang.String…ing(startIndex, endIndex)");
            sb4.append(substring3);
            sb4.append(str);
            String substring4 = obj.substring(length + 1, obj.length());
            C87412m.m108593f(substring4, "this as java.lang.String…ing(startIndex, endIndex)");
            sb4.append(substring4);
            str3 = sb4.toString();
        } else {
            StringBuilder sb5 = new StringBuilder();
            String substring5 = obj.substring(0, selectionStart);
            C87412m.m108593f(substring5, "this as java.lang.String…ing(startIndex, endIndex)");
            sb5.append(substring5);
            sb5.append(str);
            String substring6 = obj.substring(selectionStart, obj.length());
            C87412m.m108593f(substring6, "this as java.lang.String…ing(startIndex, endIndex)");
            sb5.append(substring6);
            str3 = sb5.toString();
        }
        this.f152351s = length > 0 ? length + str.length() : selectionStart + str.length();
        mo75070e3().setText(((C76979h) C86312j.m106911c(C76979h.class)).mo107057T1(getContext(), str3));
        mo75070e3().requestFocus();
        mo75070e3().setSelection(this.f152351s);
    }

    /* renamed from: e3 */
    public final FinderPostEditText mo75070e3() {
        FinderPostEditText finderPostEditText = this.f152339d;
        if (finderPostEditText != null) {
            return finderPostEditText;
        }
        C87412m.m108603p("descTv");
        throw null;
    }

    /* renamed from: f3 */
    public final FinderPostFooter mo75071f3() {
        FinderPostFooter finderPostFooter = this.f152341f;
        if (finderPostFooter != null) {
            return finderPostFooter;
        }
        C87412m.m108603p("footer");
        throw null;
    }

    /* renamed from: g3 */
    public final View mo75072g3() {
        View view = this.f152342g;
        if (view != null) {
            return view;
        }
        C87412m.m108603p("footerContainer");
        throw null;
    }

    /* renamed from: i3 */
    public final FinderPostEditText mo75073i3() {
        FinderPostEditText finderPostEditText = this.f152344i;
        if (finderPostEditText != null) {
            return finderPostEditText;
        }
        C87412m.m108603p("shortTitleTv");
        throw null;
    }

    /* renamed from: j3 */
    public final C59693i mo75074j3() {
        C59693i iVar = this.f152350r;
        if (iVar != null) {
            return iVar;
        }
        C87412m.m108603p("styleManager");
        throw null;
    }

    /* renamed from: k3 */
    public final String mo75075k3() {
        Object obj;
        String obj2 = mo75070e3().getText().toString();
        C87412m.m108594g(obj2, "<this>");
        int length = obj2.length();
        int i = 0;
        while (true) {
            if (i >= length) {
                obj = "";
                break;
            } else if (!C66713a.m78713b(obj2.charAt(i))) {
                obj = obj2.subSequence(i, obj2.length());
                break;
            } else {
                i++;
            }
        }
        return obj.toString();
    }

    /* renamed from: l3 */
    public final String mo75076l3(String str, int i) {
        String string = getActivity().getResources().getString(i);
        C87412m.m108593f(string, "activity.resources.getString(strResId)");
        if (str.length() == 0) {
            return string;
        }
        return 12289 + string;
    }

    /* renamed from: m3 */
    public final void mo75077m3(View view, String str, int i) {
        Class cls = C61212e.class;
        ((C61212e) C86312j.m106911c(cls)).o30(view, str);
        ((C61212e) C86312j.m106911c(cls)).mo86175pO(view, i, 25496);
        ((C61212e) C86312j.m106911c(cls)).E60(view, new C0182a(this));
    }

    /* renamed from: n3 */
    public final boolean mo75078n3() {
        C58969q b = C58961d.f168673a.mo84155b(C66785b.f191882e.mo90662O5());
        long j = b != null ? b.field_additionalFlag : 0;
        Log.m105924i("Finder.FinderPostUI", "[isShortTitleEnable] additionalFlag=" + j);
        if ((j & 8) == 8) {
            return true;
        }
        C37521f.f99374d.getClass();
        return C37521f.f99490q1.mo60266n().intValue() == 1;
    }

    public void onDestroy() {
        super.onDestroy();
        mo75074j3();
    }

    public void onResume() {
        super.onResume();
        this.f152355w = true;
    }
}
