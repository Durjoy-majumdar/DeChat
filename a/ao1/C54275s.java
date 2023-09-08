package ao1;

import android.text.Editable;
import android.text.SpannableString;
import android.text.TextWatcher;
import android.widget.ImageView;
import android.widget.TextView;
import bl3.C39818r;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.post.PostMainUIC;
import com.tencent.p014mm.smiley.C72953u;
import com.tencent.xweb.file.XVFSFile;
import di3.C86312j;
import gy3.C87412m;
import java.util.Collections;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import nj3.C76901s0;
import p008bq.C54532p1;
import sx3.C110823p;
import sx3.C64186f0;
import z04.C112550d0;
import z04.C112551y;

/* renamed from: ao1.s */
public final class C54275s implements TextWatcher {

    /* renamed from: d */
    public final /* synthetic */ C54277t f152334d;

    /* renamed from: e */
    public final /* synthetic */ String f152335e;

    /* renamed from: f */
    public final /* synthetic */ int f152336f;

    public C54275s(C54277t tVar, String str, int i) {
        this.f152334d = tVar;
        this.f152335e = str;
        this.f152336f = i;
    }

    public void afterTextChanged(Editable editable) {
        String str;
        List<C72953u> list;
        int i;
        if (this.f152334d.mo75078n3()) {
            C54277t tVar = this.f152334d;
            String valueOf = String.valueOf(editable);
            String str2 = this.f152335e;
            tVar.getClass();
            SpannableString M = ((C54532p1) C86312j.m106911c(C54532p1.class)).mo55776j().mo75395M(tVar.getActivity(), valueOf);
            C72953u[] uVarArr = (C72953u[]) M.getSpans(0, M.length(), C72953u.class);
            C87412m.m108593f(uVarArr, "emojiSpans");
            boolean z = true;
            if (!(uVarArr.length == 0)) {
                str = "" + tVar.mo75076l3("", C0966R.string.n2x);
                if (uVarArr.length == 0) {
                    list = C64186f0.f181907d;
                } else {
                    list = C110823p.m151003c0(uVarArr);
                    Collections.reverse(list);
                }
                for (C72953u uVar : list) {
                    int i2 = uVar.f212636f;
                    if (i2 >= 0 && i2 < valueOf.length() && (i = uVar.f212637g) > uVar.f212636f && i <= valueOf.length()) {
                        valueOf = C112550d0.m153781Q(valueOf, uVar.f212636f, uVar.f212637g, "").toString();
                    }
                }
            } else {
                str = "";
            }
            if (C112550d0.m153803w(valueOf, "\n", false, 2, (Object) null)) {
                str = str + tVar.mo75076l3(str, C0966R.string.n2y);
                valueOf = C112551y.m153814n(valueOf, "\n", "", false);
            }
            Matcher matcher = Pattern.compile(str2).matcher(valueOf);
            String str3 = "";
            while (matcher.find()) {
                str3 = str3 + matcher.group();
            }
            if (str3.length() > 0) {
                if (str.length() == 0) {
                    str = str + 12300 + str3 + 12301;
                } else {
                    str = str + "、「" + str3 + 12301;
                }
            }
            if (!(str.length() == 0)) {
                str = tVar.getActivity().getResources().getString(C0966R.string.n2z, new Object[]{str});
                C87412m.m108593f(str, "{\n            activity.r…ps, invalidStr)\n        }");
            }
            C54277t tVar2 = this.f152334d;
            if (str.length() == 0) {
                C54277t tVar3 = this.f152334d;
                C76901s0 s0Var = tVar3.f152352t;
                if (s0Var != null) {
                    s0Var.dismiss();
                }
                tVar3.f152352t = null;
            } else {
                C54277t.m61001c3(this.f152334d, str);
                z = false;
            }
            tVar2.f152348p = z;
            int length = editable != null ? editable.length() : 0;
            if (length == 0) {
                ImageView imageView = this.f152334d.f152346n;
                if (imageView != null) {
                    imageView.setVisibility(0);
                } else {
                    C87412m.m108603p("shortTitleTipsIv");
                    throw null;
                }
            } else {
                ImageView imageView2 = this.f152334d.f152346n;
                if (imageView2 != null) {
                    imageView2.setVisibility(8);
                } else {
                    C87412m.m108603p("shortTitleTipsIv");
                    throw null;
                }
            }
            if (((double) (((float) length) / ((float) this.f152336f))) >= 0.95d) {
                TextView textView = this.f152334d.f152345j;
                if (textView != null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(length);
                    sb.append(XVFSFile.SEPARATOR_CHAR);
                    sb.append(this.f152336f);
                    textView.setText(sb.toString());
                    if (length > this.f152336f) {
                        C54277t tVar4 = this.f152334d;
                        TextView textView2 = tVar4.f152345j;
                        if (textView2 != null) {
                            textView2.setTextColor(tVar4.getResources().getColor(C0966R.color.Red_100));
                            this.f152334d.f152348p = false;
                        } else {
                            C87412m.m108603p("shortTitleCountTv");
                            throw null;
                        }
                    } else {
                        C54277t tVar5 = this.f152334d;
                        TextView textView3 = tVar5.f152345j;
                        if (textView3 != null) {
                            textView3.setTextColor(tVar5.getResources().getColor(C0966R.color.FG_1));
                        } else {
                            C87412m.m108603p("shortTitleCountTv");
                            throw null;
                        }
                    }
                    TextView textView4 = this.f152334d.f152345j;
                    if (textView4 != null) {
                        textView4.setVisibility(0);
                    } else {
                        C87412m.m108603p("shortTitleCountTv");
                        throw null;
                    }
                } else {
                    C87412m.m108603p("shortTitleCountTv");
                    throw null;
                }
            } else {
                TextView textView5 = this.f152334d.f152345j;
                if (textView5 != null) {
                    textView5.setText("");
                    TextView textView6 = this.f152334d.f152345j;
                    if (textView6 != null) {
                        textView6.setVisibility(8);
                    } else {
                        C87412m.m108603p("shortTitleCountTv");
                        throw null;
                    }
                } else {
                    C87412m.m108603p("shortTitleCountTv");
                    throw null;
                }
            }
            C54277t tVar6 = this.f152334d;
            tVar6.getClass();
            ((PostMainUIC) C39818r.f106831a.mo62444c(tVar6.getActivity()).mo75002a(PostMainUIC.class)).mo78425f3();
        }
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
