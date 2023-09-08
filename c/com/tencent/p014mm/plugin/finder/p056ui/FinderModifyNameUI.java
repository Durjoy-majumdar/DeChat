package com.tencent.p014mm.plugin.finder.p056ui;

import a14.C0000n0;
import a14.C0002w;
import a14.C53872d1;
import a14.C53884f2;
import a14.C53895h;
import a14.C53896h0;
import a14.C53930o0;
import a14.C53934p0;
import a14.C53959v2;
import a14.C53973z1;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.SpannableString;
import android.text.TextWatcher;
import android.text.style.ForegroundColorSpan;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import bd1.C54446b;
import bl3.C39818r;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.StartAppBrandUIFromOuterEvent;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.p136ui.tools.C45078p0;
import com.tencent.p014mm.p136ui.widget.C74965a;
import com.tencent.p014mm.p136ui.widget.InputPanelFrameLayout;
import com.tencent.p014mm.plugin.finder.service.C3605p1;
import com.tencent.p014mm.plugin.finder.view.C4059g5;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import di3.C86312j;
import er1.C58684b;
import er1.C58739j4;
import er1.C58775t;
import er1.C58784w3;
import er1.C75655v3;
import er1.C7829l5;
import f14.C58901s;
import f40.C86709a0;
import fe1.C58961d;
import fe1.C58969q;
import fy3.C32226l;
import fy3.C32228q;
import gy3.C8478d0;
import gy3.C8479f0;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import ht1.C60184m;
import ht1.C8794p5;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.regex.Matcher;
import kotlin.Metadata;
import kq1.C10388c;
import nj3.C76879j;
import ot1.C11767a;
import p629ny.C76979h;
import qn3.C77382c;
import qo3.C47883u;
import qo3.C77426q;
import qo3.C89779i0;
import rx3.C13598b0;
import te3.C64553md1;
import wc1.C15099m;
import wx3.C15601d;
import wx3.C66212f;
import z04.C112550d0;
import z04.C112551y;
import zc1.C66783a;
import zc1.C66785b;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\b\u0012\u0004\u0012\u00020\u00050\u0004B\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/ui/FinderModifyNameUI;", "Lcom/tencent/mm/plugin/finder/ui/MMFinderUI;", "Lcom/tencent/mm/ui/widget/a$d;", "Lqn3/c$a;", "Lht1/p5;", "Lte3/md1;", "<init>", "()V", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.ui.FinderModifyNameUI */
public final class FinderModifyNameUI extends MMFinderUI implements C74965a.C74969d, C77382c.C77383a, C8794p5<C64553md1> {

    /* renamed from: J */
    public static String f16952J = C86709a0.m107535s().mo121142i().mo119675I(C72994y1.C72995a.USERINFO_FINDER_NICKNAME_MODIFY_WORD_STRING_SYNC, "");

    /* renamed from: K */
    public static int f16953K = C86709a0.m107535s().mo121142i().mo119689j(C72994y1.C72995a.USERINFO_FINDER_NICKNAME_MODIFY_LIMIT_LENGTH_INT_SYNC, 20);

    /* renamed from: A */
    public String f16954A = "$nickname$";

    /* renamed from: B */
    public C58969q f16955B;

    /* renamed from: C */
    public int f16956C;

    /* renamed from: D */
    public ProgressDialog f16957D;

    /* renamed from: E */
    public int f16958E = 400;

    /* renamed from: F */
    public int f16959F = 10;

    /* renamed from: G */
    public int f16960G;

    /* renamed from: H */
    public final C0000n0 f16961H;

    /* renamed from: I */
    public final C3693a f16962I;

    /* renamed from: o */
    public TextView f16963o;

    /* renamed from: p */
    public EditText f16964p;

    /* renamed from: q */
    public TextView f16965q;

    /* renamed from: r */
    public Button f16966r;

    /* renamed from: s */
    public View f16967s;

    /* renamed from: t */
    public View f16968t;

    /* renamed from: u */
    public View f16969u;

    /* renamed from: v */
    public ScrollView f16970v;

    /* renamed from: w */
    public InputPanelFrameLayout f16971w;

    /* renamed from: x */
    public TextView f16972x;

    /* renamed from: y */
    public TextView f16973y;

    /* renamed from: z */
    public String f16974z = "";

    /* renamed from: com.tencent.mm.plugin.finder.ui.FinderModifyNameUI$a */
    public static final class C3693a implements View.OnLayoutChangeListener {

        /* renamed from: d */
        public final /* synthetic */ FinderModifyNameUI f16975d;

        public C3693a(FinderModifyNameUI finderModifyNameUI) {
            this.f16975d = finderModifyNameUI;
        }

        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            if (i8 != i4) {
                int dimensionPixelSize = this.f16975d.getResources().getDimensionPixelSize(C0966R.dimen.f3766df);
                if (i8 < i4) {
                    View view2 = this.f16975d.f16968t;
                    if (view2 == null) {
                        C87412m.m108603p("inputContainer");
                        throw null;
                    } else if (view2.getHeight() < dimensionPixelSize) {
                        View view3 = this.f16975d.f16968t;
                        if (view3 != null) {
                            view3.scrollBy(0, i4 - i8);
                        } else {
                            C87412m.m108603p("inputContainer");
                            throw null;
                        }
                    }
                } else {
                    View view4 = this.f16975d.f16968t;
                    if (view4 == null) {
                        C87412m.m108603p("inputContainer");
                        throw null;
                    } else if (view4.getScrollY() > 0) {
                        View view5 = this.f16975d.f16968t;
                        if (view5 != null) {
                            view5.scrollBy(0, i4 - i8);
                        } else {
                            C87412m.m108603p("inputContainer");
                            throw null;
                        }
                    }
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.ui.FinderModifyNameUI$b */
    public static final class C3694b implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ FinderModifyNameUI f16976d;

        /* renamed from: com.tencent.mm.plugin.finder.ui.FinderModifyNameUI$b$a */
        public static final class C3695a implements C47883u {

            /* renamed from: a */
            public final /* synthetic */ FinderModifyNameUI f16977a;

            /* renamed from: b */
            public final /* synthetic */ String f16978b;

            public C3695a(FinderModifyNameUI finderModifyNameUI, String str) {
                this.f16977a = finderModifyNameUI;
                this.f16978b = str;
            }

            /* renamed from: a */
            public final void mo353a(boolean z, String str) {
                C87412m.m108594g(str, "s");
                FinderModifyNameUI.m3885N7(this.f16977a, this.f16978b);
            }
        }

        public C3694b(FinderModifyNameUI finderModifyNameUI) {
            this.f16976d = finderModifyNameUI;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/ui/FinderModifyNameUI$initView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            if (C11767a.f34453a.mo11659a("personalInfo")) {
                C117292a.m165361g(this, "com/tencent/mm/plugin/finder/ui/FinderModifyNameUI$initView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            Log.m105924i("Finder.FinderModifyNameUI", "doClick create contact btn");
            EditText editText = this.f16976d.f16964p;
            String str = null;
            if (editText != null) {
                String obj = C112550d0.m153799i0(editText.getText().toString()).toString();
                C58969q qVar = this.f16976d.f16955B;
                if (qVar != null) {
                    str = qVar.getNickname();
                }
                if (!C87412m.m108589b(obj, str)) {
                    FinderModifyNameUI finderModifyNameUI = this.f16976d;
                    int i = finderModifyNameUI.f16956C;
                    if (i == 1) {
                        String n = C112551y.m153814n(finderModifyNameUI.f16974z, finderModifyNameUI.f16954A, obj, true);
                        C77426q qVar2 = new C77426q(this.f16976d);
                        qVar2.mo107595g(n);
                        qVar2.mo107589a(true);
                        qVar2.mo107602n(this.f16976d.getString(C0966R.string.f360480d43));
                        qVar2.mo107598j(this.f16976d.getString(C0966R.string.d44));
                        qVar2.mo107600l(new C3695a(this.f16976d, obj));
                        qVar2.mo107603o();
                    } else if (i == 2) {
                        FinderModifyNameUI.m3885N7(finderModifyNameUI, obj);
                    }
                } else {
                    this.f16976d.finish();
                }
                C117292a.m165361g(this, "com/tencent/mm/plugin/finder/ui/FinderModifyNameUI$initView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            C87412m.m108603p("edit");
            throw null;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.ui.FinderModifyNameUI$c */
    public static final class C3696c implements View.OnTouchListener {

        /* renamed from: d */
        public final /* synthetic */ FinderModifyNameUI f16979d;

        public C3696c(FinderModifyNameUI finderModifyNameUI) {
            this.f16979d = finderModifyNameUI;
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/ui/FinderModifyNameUI$initView$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
            EditText editText = this.f16979d.f16964p;
            if (editText != null) {
                if (C87412m.m108589b(view, editText)) {
                    int actionMasked = motionEvent.getActionMasked();
                    if (actionMasked == 0) {
                        ScrollView scrollView = this.f16979d.f16970v;
                        if (scrollView != null) {
                            scrollView.requestDisallowInterceptTouchEvent(true);
                        } else {
                            C87412m.m108603p("scrollView");
                            throw null;
                        }
                    } else if (actionMasked == 1 || actionMasked == 3) {
                        ScrollView scrollView2 = this.f16979d.f16970v;
                        if (scrollView2 != null) {
                            scrollView2.requestDisallowInterceptTouchEvent(false);
                        } else {
                            C87412m.m108603p("scrollView");
                            throw null;
                        }
                    }
                }
                C117292a.m165362h(false, this, "com/tencent/mm/plugin/finder/ui/FinderModifyNameUI$initView$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
                return false;
            }
            C87412m.m108603p("edit");
            throw null;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.ui.FinderModifyNameUI$d */
    public static final class C3697d implements MenuItem.OnMenuItemClickListener {

        /* renamed from: d */
        public final /* synthetic */ FinderModifyNameUI f16980d;

        public C3697d(FinderModifyNameUI finderModifyNameUI) {
            this.f16980d = finderModifyNameUI;
        }

        public final boolean onMenuItemClick(MenuItem menuItem) {
            this.f16980d.finish();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.ui.FinderModifyNameUI$e */
    public static final class C3698e implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ FinderModifyNameUI f16981d;

        public C3698e(FinderModifyNameUI finderModifyNameUI) {
            this.f16981d = finderModifyNameUI;
        }

        public final void run() {
            FinderModifyNameUI finderModifyNameUI = this.f16981d;
            View view = finderModifyNameUI.f16968t;
            if (view != null) {
                finderModifyNameUI.f16960G = view.getHeight();
            } else {
                C87412m.m108603p("inputContainer");
                throw null;
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.ui.FinderModifyNameUI$f */
    public static final class C3699f implements TextWatcher {

        /* renamed from: d */
        public final /* synthetic */ FinderModifyNameUI f16982d;

        /* renamed from: e */
        public final /* synthetic */ C8478d0 f16983e;

        /* renamed from: f */
        public final /* synthetic */ C8479f0<String> f16984f;

        /* renamed from: com.tencent.mm.plugin.finder.ui.FinderModifyNameUI$f$a */
        public static final class C3700a extends C87413o implements C32228q<Integer, Integer, String, C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ Editable f16985d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C3700a(Editable editable) {
                super(3);
                this.f16985d = editable;
            }

            public Object invoke(Object obj, Object obj2, Object obj3) {
                int intValue = ((Number) obj).intValue();
                int intValue2 = ((Number) obj2).intValue();
                C87412m.m108594g((String) obj3, "nickname");
                this.f16985d.setSpan(new ForegroundColorSpan(MMApplicationContext.getContext().getResources().getColor(C0966R.color.a1d)), intValue, intValue2, 17);
                return C13598b0.f38549a;
            }
        }

        public C3699f(FinderModifyNameUI finderModifyNameUI, C8478d0 d0Var, C8479f0<String> f0Var) {
            this.f16982d = finderModifyNameUI;
            this.f16983e = d0Var;
            this.f16984f = f0Var;
        }

        public void afterTextChanged(Editable editable) {
            FinderModifyNameUI finderModifyNameUI = this.f16982d;
            int i = finderModifyNameUI.f16956C;
            if (i == 2 && editable != null) {
                EditText editText = finderModifyNameUI.f16964p;
                if (editText != null) {
                    C77382c b = C77382c.m93286b(editText);
                    int O7 = this.f16982d.mo4085O7();
                    b.f225611e = 1;
                    b.f225610d = O7;
                    b.f225612f = C45078p0.C45079a.MODE_CHINESE_AS_2;
                    b.f225607a = true;
                    b.mo107499d(this.f16982d);
                    ForegroundColorSpan[] foregroundColorSpanArr = (ForegroundColorSpan[]) editable.getSpans(0, editable.length(), ForegroundColorSpan.class);
                    C87412m.m108593f(foregroundColorSpanArr, "spans");
                    for (ForegroundColorSpan removeSpan : foregroundColorSpanArr) {
                        editable.removeSpan(removeSpan);
                    }
                    C58775t.f168276a.mo83826g(editable.toString(), new C3700a(editable));
                    Object[] objArr = new Object[2];
                    EditText editText2 = this.f16982d.f16964p;
                    if (editText2 != null) {
                        objArr[0] = Integer.valueOf(editText2.getLineCount());
                        objArr[1] = Integer.valueOf(this.f16983e.f27483d);
                        Log.m105925i("Finder.FinderModifyNameUI", "afterText change %d, %d", objArr);
                        EditText editText3 = this.f16982d.f16964p;
                        if (editText3 != null) {
                            int lineCount = editText3.getLineCount();
                            FinderModifyNameUI finderModifyNameUI2 = this.f16982d;
                            if (lineCount > finderModifyNameUI2.f16959F) {
                                EditText editText4 = finderModifyNameUI2.f16964p;
                                if (editText4 != null) {
                                    int lineCount2 = editText4.getLineCount();
                                    C8478d0 d0Var = this.f16983e;
                                    if (lineCount2 > d0Var.f27483d) {
                                        EditText editText5 = this.f16982d.f16964p;
                                        if (editText5 != null) {
                                            d0Var.f27483d = editText5.getLineCount();
                                            EditText editText6 = this.f16982d.f16964p;
                                            if (editText6 != null) {
                                                String str = (String) this.f16984f.f27484d;
                                                if (str == null) {
                                                    str = "";
                                                }
                                                editText6.setText(str);
                                                EditText editText7 = this.f16982d.f16964p;
                                                if (editText7 != null) {
                                                    String str2 = (String) this.f16984f.f27484d;
                                                    editText7.setSelection(str2 != null ? str2.length() : 0);
                                                } else {
                                                    C87412m.m108603p("edit");
                                                    throw null;
                                                }
                                            } else {
                                                C87412m.m108603p("edit");
                                                throw null;
                                            }
                                        } else {
                                            C87412m.m108603p("edit");
                                            throw null;
                                        }
                                    } else {
                                        this.f16984f.f27484d = editable.toString();
                                        C8478d0 d0Var2 = this.f16983e;
                                        EditText editText8 = this.f16982d.f16964p;
                                        if (editText8 != null) {
                                            d0Var2.f27483d = editText8.getLineCount();
                                        } else {
                                            C87412m.m108603p("edit");
                                            throw null;
                                        }
                                    }
                                    FinderModifyNameUI finderModifyNameUI3 = this.f16982d;
                                    String string = finderModifyNameUI3.getString(C0966R.string.f8073dz, new Object[]{finderModifyNameUI3.getString(C0966R.string.epp)});
                                    C87412m.m108593f(string, "getString(R.string.finde…string.finder_signature))");
                                    finderModifyNameUI3.mo4089R7(string, (String) null, (String) null);
                                    return;
                                }
                                C87412m.m108603p("edit");
                                throw null;
                            }
                            this.f16984f.f27484d = editable.toString();
                            C8478d0 d0Var3 = this.f16983e;
                            EditText editText9 = this.f16982d.f16964p;
                            if (editText9 != null) {
                                d0Var3.f27483d = editText9.getLineCount();
                            } else {
                                C87412m.m108603p("edit");
                                throw null;
                            }
                        } else {
                            C87412m.m108603p("edit");
                            throw null;
                        }
                    } else {
                        C87412m.m108603p("edit");
                        throw null;
                    }
                } else {
                    C87412m.m108603p("edit");
                    throw null;
                }
            } else if (i == 1) {
                finderModifyNameUI.mo4087P7();
            }
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            if (this.f16982d.f16956C == 2 && i3 == 1) {
                boolean z = false;
                if (charSequence != null) {
                    Character valueOf = (i < 0 || i > C112550d0.m153765A(charSequence)) ? null : Character.valueOf(charSequence.charAt(i));
                    if (valueOf != null && valueOf.charValue() == '@') {
                        z = true;
                    }
                }
                if (z) {
                    Log.m105924i("Finder.FinderModifyNameUI", "at auto goto");
                    Intent intent = new Intent();
                    intent.putExtra("key_scene", 2);
                    intent.putExtra("KEY_ENTER_SCENE", 1);
                    FinderModifyNameUI finderModifyNameUI = this.f16982d;
                    ((C58684b) C86312j.m106911c(C58684b.class)).getClass();
                    C87412m.m108594g(finderModifyNameUI, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
                    intent.setClass(finderModifyNameUI, FinderPostAtUI.class);
                    finderModifyNameUI.startActivityForResult(intent, 20001);
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.ui.FinderModifyNameUI$g */
    public static final class C3701g extends C87413o implements C32226l<String, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ String f16986d;

        /* renamed from: e */
        public final /* synthetic */ String f16987e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3701g(String str, String str2) {
            super(1);
            this.f16986d = str;
            this.f16987e = str2;
        }

        public Object invoke(Object obj) {
            String str = (String) obj;
            C87412m.m108594g(str, LocaleUtil.ITALIAN);
            Log.m105924i("Finder.FinderModifyNameUI", "click " + str);
            C58784w3 w3Var = C58784w3.f168295a;
            String str2 = this.f16986d;
            String str3 = this.f16987e;
            C58739j4 j4Var = C58739j4.f168176a;
            if (!(str2 == null || str3 == null)) {
                StartAppBrandUIFromOuterEvent startAppBrandUIFromOuterEvent = new StartAppBrandUIFromOuterEvent();
                StartAppBrandUIFromOuterEvent.C1142a aVar = startAppBrandUIFromOuterEvent.f9522d;
                aVar.f9526a = str2;
                aVar.f9527b = str3;
                startAppBrandUIFromOuterEvent.publish();
            }
            return C13598b0.f38549a;
        }
    }

    public FinderModifyNameUI() {
        C0002w a = C53959v2.m60598a((C53973z1) null, 1, (Object) null);
        C53896h0 h0Var = C53872d1.f151117a;
        this.f16961H = C53930o0.m60554a(((C53884f2) a).plus(C58901s.f168555a));
        this.f16962I = new C3693a(this);
    }

    /* renamed from: N7 */
    public static final void m3885N7(FinderModifyNameUI finderModifyNameUI, String str) {
        int i = finderModifyNameUI.f16956C;
        boolean z = false;
        String str2 = null;
        String str3 = "";
        if (i == 1) {
            if (str.length() == 0) {
                str3 = finderModifyNameUI.getString(C0966R.string.dcv, new Object[]{finderModifyNameUI.getString(C0966R.string.eeo)});
                C87412m.m108593f(str3, "getString(R.string.finde….string.finder_nickname))");
            }
        } else if (i == 2) {
            if (C45078p0.m49927f(str) > finderModifyNameUI.f16958E) {
                str3 = finderModifyNameUI.getString(C0966R.string.dcw, new Object[]{finderModifyNameUI.getString(C0966R.string.epp)});
                C87412m.m108593f(str3, "getString(R.string.finde…string.finder_signature))");
            }
            EditText editText = finderModifyNameUI.f16964p;
            if (editText == null) {
                C87412m.m108603p("edit");
                throw null;
            } else if (editText.getLineCount() > finderModifyNameUI.f16959F) {
                str3 = finderModifyNameUI.getString(C0966R.string.f8073dz, new Object[]{finderModifyNameUI.getString(C0966R.string.epp)});
                C87412m.m108593f(str3, "getString(R.string.finde…string.finder_signature))");
            }
        } else {
            return;
        }
        if (str3.length() > 0) {
            z = true;
        }
        if (z) {
            finderModifyNameUI.mo4089R7(str3, (String) null, (String) null);
            return;
        }
        int i2 = finderModifyNameUI.f16956C;
        if (i2 == 1) {
            ((C3605p1) C86312j.m106911c(C3605p1.class)).mo3977MC(str, finderModifyNameUI);
            finderModifyNameUI.f16957D = C76879j.m92723Q(finderModifyNameUI, "", finderModifyNameUI.getString(C0966R.string.a3v), true, false, (DialogInterface.OnCancelListener) null);
        } else if (i2 == 2) {
            C58969q qVar = finderModifyNameUI.f16955B;
            if (qVar != null) {
                str2 = qVar.getSignature();
            }
            if (!C87412m.m108589b(str, str2)) {
                C89779i0 Q = C76879j.m92723Q(finderModifyNameUI, "", finderModifyNameUI.getString(C0966R.string.a3v), true, false, (DialogInterface.OnCancelListener) null);
                finderModifyNameUI.f16957D = Q;
                if (Q != null) {
                    Q.show();
                }
                ((C10388c) C39818r.f106831a.mo62444c(finderModifyNameUI).mo75002a(C10388c.class)).mo10710c3(new C7829l5(str, (byte[]) null, (String) null, 6, (C8480h) null), new C3879v1(finderModifyNameUI), new C3886w1(finderModifyNameUI, str));
                return;
            }
            finderModifyNameUI.finish();
        }
    }

    /* renamed from: L0 */
    public void mo4083L0(String str) {
        TextView textView = this.f16965q;
        if (textView != null) {
            textView.setText("0");
            TextView textView2 = this.f16965q;
            if (textView2 != null) {
                textView2.setVisibility(0);
                TextView textView3 = this.f16965q;
                if (textView3 != null) {
                    textView3.setTextColor(getResources().getColor(C0966R.color.Red_100));
                } else {
                    C87412m.m108603p("editLimit");
                    throw null;
                }
            } else {
                C87412m.m108603p("editLimit");
                throw null;
            }
        } else {
            C87412m.m108603p("editLimit");
            throw null;
        }
    }

    /* renamed from: L3 */
    public void mo4084L3(String str) {
        TextView textView = this.f16965q;
        if (textView != null) {
            textView.setText(String.valueOf(mo4085O7()));
            TextView textView2 = this.f16965q;
            if (textView2 != null) {
                textView2.setTextColor(getResources().getColor(C0966R.color.BW_0_Alpha_0_3));
            } else {
                C87412m.m108603p("editLimit");
                throw null;
            }
        } else {
            C87412m.m108603p("editLimit");
            throw null;
        }
    }

    /* renamed from: O7 */
    public final int mo4085O7() {
        int i = this.f16956C;
        if (i == 1) {
            return f16953K;
        }
        if (i != 2) {
            return Integer.MAX_VALUE;
        }
        return this.f16958E;
    }

    /* renamed from: P4 */
    public void mo4086P4(String str) {
        int b = C45078p0.m49923b(mo4085O7(), str);
        TextView textView = this.f16965q;
        if (textView != null) {
            textView.setText(String.valueOf(b));
            TextView textView2 = this.f16965q;
            if (textView2 != null) {
                textView2.setTextColor(getResources().getColor(C0966R.color.BW_0_Alpha_0_3));
                int O7 = (int) (((float) mo4085O7()) * 0.1f);
                if (O7 < 1) {
                    O7 = 1;
                }
                if (b <= O7) {
                    TextView textView3 = this.f16965q;
                    if (textView3 != null) {
                        textView3.setVisibility(0);
                    } else {
                        C87412m.m108603p("editLimit");
                        throw null;
                    }
                } else {
                    TextView textView4 = this.f16965q;
                    if (textView4 != null) {
                        textView4.setVisibility(4);
                    } else {
                        C87412m.m108603p("editLimit");
                        throw null;
                    }
                }
                TextView textView5 = this.f16972x;
                if (textView5 != null) {
                    textView5.setText("");
                    TextView textView6 = this.f16972x;
                    if (textView6 != null) {
                        textView6.setVisibility(8);
                    } else {
                        C87412m.m108603p("topErrorTip");
                        throw null;
                    }
                } else {
                    C87412m.m108603p("topErrorTip");
                    throw null;
                }
            } else {
                C87412m.m108603p("editLimit");
                throw null;
            }
        } else {
            C87412m.m108603p("editLimit");
            throw null;
        }
    }

    /* renamed from: P7 */
    public final void mo4087P7() {
        EditText editText = this.f16964p;
        if (editText != null) {
            int g = C45078p0.m49928g(C112550d0.m153799i0(editText.getText().toString()).toString());
            TextView textView = this.f16965q;
            if (textView != null) {
                textView.setText(getString(C0966R.string.n2t, new Object[]{Integer.valueOf(g), Integer.valueOf(f16953K / 2)}));
                TextView textView2 = this.f16965q;
                if (textView2 == null) {
                    C87412m.m108603p("editLimit");
                    throw null;
                } else if (textView2.getVisibility() == 4) {
                    TextView textView3 = this.f16965q;
                    if (textView3 != null) {
                        textView3.setVisibility(0);
                    } else {
                        C87412m.m108603p("editLimit");
                        throw null;
                    }
                }
            } else {
                C87412m.m108603p("editLimit");
                throw null;
            }
        } else {
            C87412m.m108603p("edit");
            throw null;
        }
    }

    /* renamed from: Q7 */
    public final void mo4088Q7() {
        C66785b bVar = C66785b.f191882e;
        C54446b a = C66783a.C66784a.m78798a(bVar, bVar.mo90662O5(), false, 2, (Object) null);
        int i = a != null ? a.field_extFlag : 0;
        Log.m105924i("Finder.FinderModifyNameUI", "user extFlag " + i);
        boolean z = true;
        if (this.f16956C == 1) {
            boolean z2 = (i & 2) != 0;
            EditText editText = this.f16964p;
            if (editText != null) {
                editText.setEnabled(!z2);
                Button button = this.f16966r;
                if (button != null) {
                    button.setEnabled(!z2);
                    String str = f16952J;
                    C87412m.m108593f(str, "nickNameModifyWord");
                    if (str.length() <= 0) {
                        z = false;
                    }
                    if (z) {
                        TextView textView = this.f16973y;
                        if (textView != null) {
                            textView.setText(f16952J);
                            TextView textView2 = this.f16973y;
                            if (textView2 != null) {
                                textView2.setVisibility(0);
                            } else {
                                C87412m.m108603p("modifyCountTip");
                                throw null;
                            }
                        } else {
                            C87412m.m108603p("modifyCountTip");
                            throw null;
                        }
                    }
                    mo4087P7();
                    return;
                }
                C87412m.m108603p("modifyBtn");
                throw null;
            }
            C87412m.m108603p("edit");
            throw null;
        }
    }

    /* renamed from: R7 */
    public final void mo4089R7(String str, String str2, String str3) {
        String str4 = str;
        Log.m105924i("Finder.FinderModifyNameUI", "showError " + str4);
        Matcher matcher = C60184m.f171716a.matcher(str4);
        if (matcher.find()) {
            String group = matcher.group(1);
            if (group == null) {
                group = "";
            }
            String str5 = group;
            StringBuilder sb = new StringBuilder();
            if (matcher.start(0) > 0) {
                String substring = str4.substring(0, matcher.start(0));
                C87412m.m108593f(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                sb.append(substring);
            }
            sb.append(str5);
            if (matcher.end(0) < str.length()) {
                String substring2 = str4.substring(matcher.end(0), str.length());
                C87412m.m108593f(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
                sb.append(substring2);
            }
            String sb4 = sb.toString();
            C87412m.m108593f(sb4, "sb.toString()");
            int start = matcher.start(0);
            SpannableString spannableString = new SpannableString(sb4);
            spannableString.setSpan(new C4059g5(str5, getContext().getResources().getColor(C0966R.color.f2958ae), getContext().getResources().getColor(C0966R.color.Link_Alpha_0_6), false, false, new C3701g(str2, str3), 16, (C8480h) null), start, str5.length() + start, 17);
            TextView textView = this.f16972x;
            if (textView != null) {
                textView.setText(spannableString);
                TextView textView2 = this.f16972x;
                if (textView2 != null) {
                    textView2.setOnTouchListener(new C75655v3(spannableString, textView2));
                } else {
                    C87412m.m108603p("topErrorTip");
                    throw null;
                }
            } else {
                C87412m.m108603p("topErrorTip");
                throw null;
            }
        } else {
            TextView textView3 = this.f16972x;
            if (textView3 != null) {
                textView3.setText(str4);
            } else {
                C87412m.m108603p("topErrorTip");
                throw null;
            }
        }
        TextView textView4 = this.f16972x;
        if (textView4 != null) {
            textView4.setVisibility(0);
        } else {
            C87412m.m108603p("topErrorTip");
            throw null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /* renamed from: c5 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo705c5(java.lang.Object r9, te3.C50542nh0 r10) {
        /*
            r8 = this;
            te3.md1 r9 = (te3.C64553md1) r9
            java.lang.String r0 = "req"
            gy3.C87412m.m108594g(r9, r0)
            java.lang.String r9 = "ret"
            gy3.C87412m.m108594g(r10, r9)
            android.app.ProgressDialog r9 = r8.f16957D
            if (r9 == 0) goto L_0x0013
            r9.dismiss()
        L_0x0013:
            int r9 = r10.f138603e
            r0 = 0
            r1 = 1
            if (r9 != 0) goto L_0x003f
            int r9 = r8.f16956C
            if (r9 == r1) goto L_0x0027
            r10 = 2
            if (r9 == r10) goto L_0x0021
            goto L_0x002c
        L_0x0021:
            com.tencent.mm.plugin.finder.ui.u1 r9 = com.tencent.p014mm.plugin.finder.p056ui.C3876u1.f17430d
            o40.C61926c.m72668M(r9)
            goto L_0x002c
        L_0x0027:
            com.tencent.mm.plugin.finder.ui.t1 r9 = com.tencent.p014mm.plugin.finder.p056ui.C3873t1.f17426d
            o40.C61926c.m72668M(r9)
        L_0x002c:
            r9 = 2131830064(0x7f112530, float:1.9293115E38)
            java.lang.String r9 = r8.getString(r9)
            android.widget.Toast r9 = nj3.C76912y0.makeText((android.content.Context) r8, (java.lang.CharSequence) r9, (int) r0)
            r9.show()
            r8.finish()
            goto L_0x00b3
        L_0x003f:
            te3.nd1 r9 = new te3.nd1
            r9.<init>()
            pe3.b r2 = r10.f138605g
            if (r2 == 0) goto L_0x004f
            byte[] r2 = r2.mo123703f()
            r9.parseFrom(r2)
        L_0x004f:
            int r2 = r10.f138603e
            java.lang.String r3 = r10.f138604f
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
            if (r3 == 0) goto L_0x005a
            goto L_0x0065
        L_0x005a:
            r3 = -5002(0xffffffffffffec76, float:NaN)
            if (r2 == r3) goto L_0x0066
            r3 = -5001(0xffffffffffffec77, float:NaN)
            if (r2 == r3) goto L_0x0066
            switch(r2) {
                case -4007: goto L_0x0066;
                case -4006: goto L_0x0066;
                case -4005: goto L_0x0066;
                default: goto L_0x0065;
            }
        L_0x0065:
            r0 = 1
        L_0x0066:
            if (r0 == 0) goto L_0x00b3
            int r10 = r10.f138603e
            r0 = -4003(0xfffffffffffff05d, float:NaN)
            if (r10 != r0) goto L_0x007a
            com.tencent.mm.plugin.report.service.n r1 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r2 = 1279(0x4ff, double:6.32E-321)
            r4 = 37
            r6 = 1
            r1.mo175913w(r2, r4, r6)
            goto L_0x0089
        L_0x007a:
            r0 = -4008(0xfffffffffffff058, float:NaN)
            if (r10 != r0) goto L_0x0089
            com.tencent.mm.plugin.report.service.n r1 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r2 = 1279(0x4ff, double:6.32E-321)
            r4 = 38
            r6 = 1
            r1.mo175913w(r2, r4, r6)
        L_0x0089:
            te3.le1 r9 = r9.f138543d
            if (r9 == 0) goto L_0x00b3
            java.lang.String r10 = r9.f137357e
            boolean r10 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r10)
            if (r10 != 0) goto L_0x00a3
            java.lang.String r10 = r9.f137357e
            if (r10 != 0) goto L_0x009b
            java.lang.String r10 = ""
        L_0x009b:
            java.lang.String r0 = r9.f137364o
            java.lang.String r9 = r9.f137363n
            r8.mo4089R7(r10, r0, r9)
            goto L_0x00b3
        L_0x00a3:
            r9 = 2131826389(0x7f1116d5, float:1.928566E38)
            java.lang.String r9 = r8.getString(r9)
            java.lang.String r10 = "getString(R.string.finde…reate_contact_failed_tip)"
            gy3.C87412m.m108593f(r9, r10)
            r10 = 0
            r8.mo4089R7(r9, r10, r10)
        L_0x00b3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.p056ui.FinderModifyNameUI.mo705c5(java.lang.Object, te3.nh0):void");
    }

    public int getLayoutId() {
        return C0966R.C0971layout.f359771am1;
    }

    /* renamed from: i0 */
    public void mo1072i0(boolean z, int i) {
        if (z) {
            StringBuilder sb = new StringBuilder();
            sb.append("keyboardHeight ");
            sb.append(i);
            sb.append(", inputContainer.height ");
            View view = this.f16968t;
            if (view != null) {
                sb.append(view.getHeight());
                Log.m105924i("Finder.FinderModifyNameUI", sb.toString());
                View view2 = this.f16967s;
                if (view2 != null) {
                    view2.addOnLayoutChangeListener(this.f16962I);
                    Button button = this.f16966r;
                    if (button != null) {
                        ViewGroup.LayoutParams layoutParams = button.getLayoutParams();
                        C87412m.m108592e(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
                        layoutParams2.bottomMargin = 0;
                        Button button2 = this.f16966r;
                        if (button2 != null) {
                            button2.setLayoutParams(layoutParams2);
                            View view3 = this.f16968t;
                            if (view3 != null) {
                                ViewGroup.LayoutParams layoutParams3 = view3.getLayoutParams();
                                C87412m.m108592e(layoutParams3, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                                FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) layoutParams3;
                                layoutParams4.height = this.f16960G - i;
                                View view4 = this.f16968t;
                                if (view4 != null) {
                                    view4.setLayoutParams(layoutParams4);
                                    View view5 = this.f16968t;
                                    if (view5 != null) {
                                        view5.requestLayout();
                                    } else {
                                        C87412m.m108603p("inputContainer");
                                        throw null;
                                    }
                                } else {
                                    C87412m.m108603p("inputContainer");
                                    throw null;
                                }
                            } else {
                                C87412m.m108603p("inputContainer");
                                throw null;
                            }
                        } else {
                            C87412m.m108603p("modifyBtn");
                            throw null;
                        }
                    } else {
                        C87412m.m108603p("modifyBtn");
                        throw null;
                    }
                } else {
                    C87412m.m108603p("edtContainer");
                    throw null;
                }
            } else {
                C87412m.m108603p("inputContainer");
                throw null;
            }
        } else {
            View view6 = this.f16967s;
            if (view6 != null) {
                view6.removeOnLayoutChangeListener(this.f16962I);
                Button button3 = this.f16966r;
                if (button3 != null) {
                    ViewGroup.LayoutParams layoutParams5 = button3.getLayoutParams();
                    C87412m.m108592e(layoutParams5, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                    LinearLayout.LayoutParams layoutParams6 = (LinearLayout.LayoutParams) layoutParams5;
                    layoutParams6.bottomMargin = getResources().getDimensionPixelSize(C0966R.dimen.f3709c2);
                    Button button4 = this.f16966r;
                    if (button4 != null) {
                        button4.setLayoutParams(layoutParams6);
                        View view7 = this.f16968t;
                        if (view7 != null) {
                            ViewGroup.LayoutParams layoutParams7 = view7.getLayoutParams();
                            C87412m.m108592e(layoutParams7, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                            FrameLayout.LayoutParams layoutParams8 = (FrameLayout.LayoutParams) layoutParams7;
                            layoutParams8.height = -1;
                            View view8 = this.f16968t;
                            if (view8 != null) {
                                view8.setLayoutParams(layoutParams8);
                                View view9 = this.f16968t;
                                if (view9 != null) {
                                    view9.requestLayout();
                                    View view10 = this.f16968t;
                                    if (view10 != null) {
                                        view10.scrollTo(0, 0);
                                    } else {
                                        C87412m.m108603p("inputContainer");
                                        throw null;
                                    }
                                } else {
                                    C87412m.m108603p("inputContainer");
                                    throw null;
                                }
                            } else {
                                C87412m.m108603p("inputContainer");
                                throw null;
                            }
                        } else {
                            C87412m.m108603p("inputContainer");
                            throw null;
                        }
                    } else {
                        C87412m.m108603p("modifyBtn");
                        throw null;
                    }
                } else {
                    C87412m.m108603p("modifyBtn");
                    throw null;
                }
            } else {
                C87412m.m108603p("edtContainer");
                throw null;
            }
        }
    }

    public void initView() {
        Class cls = C76979h.class;
        setMMTitle("");
        setActionbarColor(getResources().getColor(C0966R.color.al6));
        getController().mo177059O0(this, getResources().getColor(C0966R.color.al6));
        View findViewById = findViewById(C0966R.C0970id.e3e);
        C87412m.m108593f(findViewById, "findViewById(R.id.finder_modify_name_container)");
        this.f16967s = findViewById;
        View findViewById2 = findViewById(C0966R.C0970id.d_z);
        C87412m.m108593f(findViewById2, "findViewById(R.id.finder_input_container)");
        this.f16968t = findViewById2;
        View findViewById3 = findViewById(C0966R.C0970id.e3f);
        C87412m.m108593f(findViewById3, "findViewById(R.id.finder_modify_title)");
        this.f16963o = (TextView) findViewById3;
        View findViewById4 = findViewById(C0966R.C0970id.d8_);
        C87412m.m108593f(findViewById4, "findViewById(R.id.finder_edit)");
        this.f16964p = (EditText) findViewById4;
        View findViewById5 = findViewById(C0966R.C0970id.d8a);
        C87412m.m108593f(findViewById5, "findViewById(R.id.finder_edit_limit)");
        this.f16965q = (TextView) findViewById5;
        View findViewById6 = findViewById(C0966R.C0970id.cd9);
        C87412m.m108593f(findViewById6, "findViewById(R.id.edt_bottom_space)");
        this.f16969u = findViewById6;
        View findViewById7 = findViewById(C0966R.C0970id.e3d);
        C87412m.m108593f(findViewById7, "findViewById(R.id.finder_modify_btn)");
        this.f16966r = (Button) findViewById7;
        View findViewById8 = findViewById(C0966R.C0970id.gyd);
        C87412m.m108593f(findViewById8, "findViewById(R.id.modify_max_tip)");
        this.f16973y = (TextView) findViewById8;
        View findViewById9 = findViewById(C0966R.C0970id.j3w);
        C87412m.m108593f(findViewById9, "findViewById(R.id.scroll_container)");
        this.f16970v = (ScrollView) findViewById9;
        View findViewById10 = findViewById(C0966R.C0970id.f7u);
        C87412m.m108593f(findViewById10, "findViewById(R.id.input_panel)");
        this.f16971w = (InputPanelFrameLayout) findViewById10;
        View findViewById11 = findViewById(C0966R.C0970id.krd);
        C87412m.m108593f(findViewById11, "findViewById(R.id.top_error_tip)");
        this.f16972x = (TextView) findViewById11;
        Button button = this.f16966r;
        if (button != null) {
            button.setOnClickListener(new C3694b(this));
            C8479f0 f0Var = new C8479f0();
            C8478d0 d0Var = new C8478d0();
            d0Var.f27483d = -1;
            C3699f fVar = new C3699f(this, d0Var, f0Var);
            EditText editText = this.f16964p;
            if (editText != null) {
                editText.addTextChangedListener(fVar);
                EditText editText2 = this.f16964p;
                if (editText2 != null) {
                    editText2.setOnTouchListener(new C3696c(this));
                    setBackBtn(new C3697d(this));
                    InputPanelFrameLayout inputPanelFrameLayout = this.f16971w;
                    if (inputPanelFrameLayout != null) {
                        inputPanelFrameLayout.setExternalListener(this);
                        int i = this.f16956C;
                        if (i == 1) {
                            EditText editText3 = this.f16964p;
                            if (editText3 != null) {
                                editText3.setMaxLines(2);
                                EditText editText4 = this.f16964p;
                                if (editText4 != null) {
                                    C76979h hVar = (C76979h) C86312j.m106911c(cls);
                                    AppCompatActivity context = getContext();
                                    C58969q qVar = this.f16955B;
                                    editText4.setText(hVar.mo107057T1(context, qVar != null ? qVar.getNickname() : null));
                                    TextView textView = this.f16963o;
                                    if (textView != null) {
                                        textView.setText(getString(C0966R.string.ecj));
                                    } else {
                                        C87412m.m108603p("titleTv");
                                        throw null;
                                    }
                                } else {
                                    C87412m.m108603p("edit");
                                    throw null;
                                }
                            } else {
                                C87412m.m108603p("edit");
                                throw null;
                            }
                        } else if (i == 2) {
                            TextView textView2 = this.f16963o;
                            if (textView2 != null) {
                                textView2.setText(getString(C0966R.string.eck));
                                EditText editText5 = this.f16964p;
                                if (editText5 != null) {
                                    editText5.setMaxLines(5);
                                    EditText editText6 = this.f16964p;
                                    if (editText6 != null) {
                                        C76979h hVar2 = (C76979h) C86312j.m106911c(cls);
                                        AppCompatActivity context2 = getContext();
                                        C58969q qVar2 = this.f16955B;
                                        editText6.setText(hVar2.mo107057T1(context2, qVar2 != null ? qVar2.field_signature : null));
                                    } else {
                                        C87412m.m108603p("edit");
                                        throw null;
                                    }
                                } else {
                                    C87412m.m108603p("edit");
                                    throw null;
                                }
                            } else {
                                C87412m.m108603p("titleTv");
                                throw null;
                            }
                        }
                        mo4088Q7();
                        EditText editText7 = this.f16964p;
                        if (editText7 != null) {
                            editText7.requestFocus();
                            View view = this.f16968t;
                            if (view != null) {
                                view.post(new C3698e(this));
                            } else {
                                C87412m.m108603p("inputContainer");
                                throw null;
                            }
                        } else {
                            C87412m.m108603p("edit");
                            throw null;
                        }
                    } else {
                        C87412m.m108603p("inputPanel");
                        throw null;
                    }
                } else {
                    C87412m.m108603p("edit");
                    throw null;
                }
            } else {
                C87412m.m108603p("edit");
                throw null;
            }
        } else {
            C87412m.m108603p("modifyBtn");
            throw null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:72:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onActivityResult(int r11, int r12, android.content.Intent r13) {
        /*
            r10 = this;
            super.onActivityResult(r11, r12, r13)
            r0 = 20001(0x4e21, float:2.8027E-41)
            if (r11 != r0) goto L_0x011c
            r10.showVKB()
            if (r13 == 0) goto L_0x011c
            r11 = -1
            if (r12 != r11) goto L_0x011c
            java.lang.String r11 = "key_select_contact"
            byte[] r11 = r13.getByteArrayExtra(r11)
            r12 = 1
            r13 = 0
            r0 = 0
            if (r11 == 0) goto L_0x0033
            te3.nq2 r1 = new te3.nq2     // Catch:{ Exception -> 0x0023 }
            r1.<init>()     // Catch:{ Exception -> 0x0023 }
            r1.parseFrom(r11)     // Catch:{ Exception -> 0x0023 }
            goto L_0x0034
        L_0x0023:
            r11 = move-exception
            java.lang.Object[] r1 = new java.lang.Object[r12]
            java.lang.String r11 = r11.getMessage()
            r1[r13] = r11
            java.lang.String r11 = "Finder.FinderModifyNameUI"
            java.lang.String r2 = "onActivityResult LocalFinderAtContact parseFrom:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r11, r2, r1)
        L_0x0033:
            r1 = r0
        L_0x0034:
            if (r1 == 0) goto L_0x011c
            java.lang.String r11 = r1.f184532f
            boolean r11 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r11)
            if (r11 != 0) goto L_0x011c
            android.widget.EditText r11 = r10.f16964p
            java.lang.String r2 = "edit"
            if (r11 == 0) goto L_0x0118
            int r11 = r11.getSelectionEnd()
            android.widget.EditText r3 = r10.f16964p
            if (r3 == 0) goto L_0x0114
            android.text.Editable r3 = r3.getText()
            java.lang.String r3 = r3.toString()
            int r4 = r10.f16956C
            r5 = 64
            r6 = 2
            java.lang.String r7 = "this as java.lang.String…ing(startIndex, endIndex)"
            if (r4 != r6) goto L_0x00bb
            android.widget.EditText r4 = r10.f16964p
            if (r4 == 0) goto L_0x00b7
            int r4 = r4.getSelectionEnd()
            if (r4 <= 0) goto L_0x00bb
            int r11 = r4 + -1
            r8 = 1
        L_0x006b:
            if (r11 < 0) goto L_0x008a
            if (r8 == 0) goto L_0x008a
            android.widget.EditText r9 = r10.f16964p
            if (r9 == 0) goto L_0x0086
            android.text.Editable r9 = r9.getText()
            java.lang.String r9 = r9.toString()
            char r9 = r9.charAt(r11)
            if (r9 != r5) goto L_0x0084
            int r11 = r11 + -1
            goto L_0x006b
        L_0x0084:
            r8 = 0
            goto L_0x006b
        L_0x0086:
            gy3.C87412m.m108603p(r2)
            throw r0
        L_0x008a:
            int r11 = r11 + r12
            int r12 = r3.length()
            if (r11 <= r12) goto L_0x0095
            int r11 = r3.length()
        L_0x0095:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r8 = r3.substring(r13, r11)
            gy3.C87412m.m108593f(r8, r7)
            r12.append(r8)
            int r8 = r3.length()
            java.lang.String r3 = r3.substring(r4, r8)
            gy3.C87412m.m108593f(r3, r7)
            r12.append(r3)
            java.lang.String r3 = r12.toString()
            goto L_0x00bb
        L_0x00b7:
            gy3.C87412m.m108603p(r2)
            throw r0
        L_0x00bb:
            int r12 = r3.length()
            if (r11 <= r12) goto L_0x00c5
            int r11 = r3.length()
        L_0x00c5:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r4 = r3.substring(r13, r11)
            gy3.C87412m.m108593f(r4, r7)
            r12.append(r4)
            r12.append(r5)
            java.lang.String r4 = r1.f184532f
            r12.append(r4)
            r4 = 32
            r12.append(r4)
            int r4 = r3.length()
            java.lang.String r3 = r3.substring(r11, r4)
            gy3.C87412m.m108593f(r3, r7)
            r12.append(r3)
            java.lang.String r12 = r12.toString()
            java.lang.String r1 = r1.f184532f
            if (r1 == 0) goto L_0x00fb
            int r13 = r1.length()
        L_0x00fb:
            int r11 = r11 + r13
            int r11 = r11 + r6
            android.widget.EditText r13 = r10.f16964p
            if (r13 == 0) goto L_0x0110
            r13.setText(r12)
            android.widget.EditText r12 = r10.f16964p
            if (r12 == 0) goto L_0x010c
            r12.setSelection(r11)
            goto L_0x011c
        L_0x010c:
            gy3.C87412m.m108603p(r2)
            throw r0
        L_0x0110:
            gy3.C87412m.m108603p(r2)
            throw r0
        L_0x0114:
            gy3.C87412m.m108603p(r2)
            throw r0
        L_0x0118:
            gy3.C87412m.m108603p(r2)
            throw r0
        L_0x011c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.p056ui.FinderModifyNameUI.onActivityResult(int, int, android.content.Intent):void");
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f16955B = C58961d.f168673a.mo84155b(C66785b.f191882e.mo90662O5());
        this.f16956C = getIntent().getIntExtra("key_scene", 0);
        initView();
    }

    public void onResume() {
        super.onResume();
        C53895h.m60466d(this.f16961H, (C66212f) null, (C53934p0) null, new C3871s1(this, (C15601d<? super C3871s1>) null), 3, (Object) null);
    }

    public void superImportUIComponents(HashSet<Class<? extends UIComponent>> hashSet) {
        C87412m.m108594g(hashSet, "set");
        super.superImportUIComponents(hashSet);
        hashSet.add(C15099m.class);
        hashSet.add(C10388c.class);
    }
}
