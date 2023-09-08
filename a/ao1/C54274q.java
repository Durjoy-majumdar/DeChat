package ao1;

import android.text.Editable;
import android.text.TextWatcher;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.lifecycle.C39622i0;
import ao1.C0157h1;
import bl3.C39818r;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.tools.C45078p0;
import com.tencent.p014mm.plugin.finder.post.PostMainUIC;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.xweb.file.XVFSFile;
import er1.C58771q3;
import er1.C58775t;
import gs1.C59692c;
import gs1.C59693i;
import gs1.C59694k;
import gs1.C8436b;
import gs1.C8450j;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import pe1.C35464c;
import rx3.C13604l;
import te3.C51270sn1;
import te3.C64589nq2;
import up1.C37521f;
import z04.C112550d0;

/* renamed from: ao1.q */
public final class C54274q implements TextWatcher {

    /* renamed from: d */
    public final /* synthetic */ int f152332d;

    /* renamed from: e */
    public final /* synthetic */ C54277t f152333e;

    public C54274q(int i, C54277t tVar) {
        this.f152332d = i;
        this.f152333e = tVar;
    }

    public void afterTextChanged(Editable editable) {
        int i;
        C0157h1.C0158a aVar;
        Editable editable2 = editable;
        if (editable2 != null) {
            C54277t tVar = this.f152333e;
            int selectionStart = tVar.mo75070e3().getSelectionStart() > 0 ? tVar.mo75070e3().getSelectionStart() : tVar.f152351s;
            C39622i0 a = C39818r.f106831a.mo62444c(tVar.getActivity()).mo75002a(C0157h1.class);
            C87412m.m108593f(a, "UICProvider.of(activity)…PostTopicUIC::class.java)");
            C0157h1 h1Var = (C0157h1) a;
            if (h1Var.f601e) {
                int i2 = selectionStart - 1;
                if (i2 >= 0 && i2 < editable.length()) {
                    if (editable.length() > 0) {
                        char charAt = editable2.charAt(i2);
                        C58771q3 q3Var = C58771q3.f168268a;
                        if (charAt == '#') {
                            h1Var.f606j = i2;
                            LinearLayout linearLayout = h1Var.f600d;
                            if (linearLayout != null) {
                                linearLayout.setVisibility(0);
                            }
                            List<? extends C51270sn1> list = h1Var.f604h;
                            if (!(list == null || (aVar = h1Var.f605i) == null)) {
                                aVar.f608d = list;
                                aVar.notifyDataSetChanged();
                            }
                            h1Var.mo148c3(0, "", 0);
                        }
                    }
                }
                int i3 = h1Var.f606j;
                if (!(i3 >= 0 && i3 < i2) || i3 + 1 >= editable.length() || (i = i2 + 1) > editable.length()) {
                    LinearLayout linearLayout2 = h1Var.f600d;
                    if (linearLayout2 != null) {
                        linearLayout2.setVisibility(8);
                    }
                    h1Var.f606j = -1;
                    h1Var.f607n = "";
                } else {
                    int i4 = h1Var.f606j;
                    char[] cArr = new char[(i2 - i4)];
                    editable2.getChars(i4 + 1, i, cArr, 0);
                    h1Var.f607n = new String(cArr);
                    List<? extends C51270sn1> list2 = h1Var.f604h;
                    if (list2 != null) {
                        ArrayList arrayList = new ArrayList();
                        for (T next : list2) {
                            String str = ((C51270sn1) next).f141617d;
                            if (str != null ? C112550d0.m153801u(str, h1Var.f607n, false) : false) {
                                arrayList.add(next);
                            }
                        }
                        C0157h1.C0158a aVar2 = h1Var.f605i;
                        if (aVar2 != null) {
                            aVar2.f608d = arrayList;
                            aVar2.notifyDataSetChanged();
                        }
                    }
                }
            }
        }
        int b = this.f152332d - (C45078p0.m49923b(this.f152332d * 2, String.valueOf(editable)) / 2);
        C54277t tVar2 = this.f152333e;
        tVar2.f152347o = true;
        C37521f.f99374d.getClass();
        int intValue = C37521f.f99481p1.mo60266n().intValue();
        boolean n3 = tVar2.mo75078n3();
        Log.m105924i("Finder.FinderPostUI", "[checkShowShortTitle] textLimit=" + intValue + " textCount=" + b + " enableShortTitle=" + n3);
        if (b > intValue && n3) {
            RelativeLayout relativeLayout = tVar2.f152343h;
            if (relativeLayout == null) {
                C87412m.m108603p("shortTitleLayout");
                throw null;
            } else if (relativeLayout.getVisibility() == 8) {
                RelativeLayout relativeLayout2 = tVar2.f152343h;
                if (relativeLayout2 != null) {
                    relativeLayout2.setVisibility(0);
                    RelativeLayout relativeLayout3 = tVar2.f152343h;
                    if (relativeLayout3 != null) {
                        relativeLayout3.post(new C54272o(tVar2));
                    } else {
                        C87412m.m108603p("shortTitleLayout");
                        throw null;
                    }
                } else {
                    C87412m.m108603p("shortTitleLayout");
                    throw null;
                }
            }
        }
        if (((double) (((float) b) / ((float) this.f152332d))) >= 0.95d) {
            TextView textView = this.f152333e.f152340e;
            if (textView != null) {
                StringBuilder sb = new StringBuilder();
                sb.append(b);
                sb.append(XVFSFile.SEPARATOR_CHAR);
                sb.append(this.f152332d);
                textView.setText(sb.toString());
                if (b > this.f152332d) {
                    C54277t tVar3 = this.f152333e;
                    TextView textView2 = tVar3.f152340e;
                    if (textView2 != null) {
                        textView2.setTextColor(tVar3.getResources().getColor(C0966R.color.Red_100));
                        this.f152333e.f152347o = false;
                    } else {
                        C87412m.m108603p("textCountTv");
                        throw null;
                    }
                } else {
                    C54277t tVar4 = this.f152333e;
                    TextView textView3 = tVar4.f152340e;
                    if (textView3 != null) {
                        textView3.setTextColor(tVar4.getResources().getColor(C0966R.color.FG_1));
                    } else {
                        C87412m.m108603p("textCountTv");
                        throw null;
                    }
                }
                TextView textView4 = this.f152333e.f152340e;
                if (textView4 != null) {
                    textView4.setVisibility(0);
                } else {
                    C87412m.m108603p("textCountTv");
                    throw null;
                }
            } else {
                C87412m.m108603p("textCountTv");
                throw null;
            }
        } else {
            TextView textView5 = this.f152333e.f152340e;
            if (textView5 != null) {
                textView5.setText("");
                TextView textView6 = this.f152333e.f152340e;
                if (textView6 != null) {
                    textView6.setVisibility(8);
                } else {
                    C87412m.m108603p("textCountTv");
                    throw null;
                }
            } else {
                C87412m.m108603p("textCountTv");
                throw null;
            }
        }
        C54277t tVar5 = this.f152333e;
        tVar5.getClass();
        ((PostMainUIC) C39818r.f106831a.mo62444c(tVar5.getActivity()).mo75002a(PostMainUIC.class)).mo78425f3();
        C59693i j3 = this.f152333e.mo75074j3();
        String valueOf = String.valueOf(editable);
        C87412m.m108591d(editable);
        ForegroundColorSpan[] foregroundColorSpanArr = (ForegroundColorSpan[]) editable2.getSpans(0, editable.length(), ForegroundColorSpan.class);
        C87412m.m108593f(foregroundColorSpanArr, "spans");
        for (ForegroundColorSpan removeSpan : foregroundColorSpanArr) {
            editable2.removeSpan(removeSpan);
        }
        C37521f fVar = C37521f.f99374d;
        if (fVar.mo61175c()) {
            C59692c a2 = j3.mo84676a();
            a2.f170521b.clear();
            a2.f170522c.clear();
            C13604l<ArrayList<C64589nq2>, ArrayList<C58775t.C58776a>> f = C58775t.f168276a.mo83825f(valueOf, a2.f170520a, new C8436b(editable2));
            a2.f170521b.addAll((Collection) f.f38555d);
            a2.f170522c.addAll((Collection) f.f38556e);
        }
        if (fVar.mo61158L()) {
            C59694k kVar = j3.f170527a;
            if (kVar != null) {
                ArrayList<C58775t.C58776a> arrayList2 = j3.mo84676a().f170522c;
                C87412m.m108594g(arrayList2, "atStringInfoList");
                ((ArrayList) kVar.f170531b).clear();
                ((ArrayList) kVar.f170531b).addAll(C58771q3.f168268a.mo83813d(valueOf, arrayList2, new C8450j(editable2)));
            } else {
                C87412m.m108603p("topicSuggestManager");
                throw null;
            }
        }
        if (j3.f170529c != null) {
            int E = C112550d0.m153769E(valueOf, "", 0, false, 6, (Object) null);
            if (!Util.isNullOrNil("") && E >= 0) {
                int i5 = E + 0;
                editable2.setSpan(new ForegroundColorSpan(MMApplicationContext.getContext().getResources().getColor(C0966R.color.a1d)), E, i5, 17);
                editable2.setSpan(new BackgroundColorSpan(MMApplicationContext.getContext().getResources().getColor(C0966R.color.f3534wq)), E, i5, 17);
            }
            if (fVar.mo61158L()) {
                C59694k kVar2 = this.f152333e.mo75074j3().f170527a;
                if (kVar2 == null) {
                    C87412m.m108603p("topicSuggestManager");
                    throw null;
                } else if (((ArrayList) kVar2.f170531b).size() > C37521f.f99554x1.mo60266n().intValue()) {
                    this.f152333e.mo75071f3().mo79847c(false);
                } else {
                    this.f152333e.mo75071f3().mo79847c(true);
                }
            }
            if (fVar.mo61175c()) {
                C35464c<Integer> cVar = C37521f.f99229M1;
                if (cVar.mo60266n().intValue() == 1000 || this.f152333e.mo75074j3().mo84676a().f170521b.size() < cVar.mo60266n().intValue()) {
                    this.f152333e.mo75071f3().mo79846b(true);
                } else {
                    this.f152333e.mo75071f3().mo79846b(false);
                }
            }
        } else {
            C87412m.m108603p("activityPostManager");
            throw null;
        }
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
