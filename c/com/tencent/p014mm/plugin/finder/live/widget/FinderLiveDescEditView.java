package com.tencent.p014mm.plugin.finder.live.widget;

import ak1.C0073g0;
import ak1.C54067f0;
import ak1.C54099m0;
import ak1.C54108o;
import ak1.C54116w;
import android.content.Context;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.LinearLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.tools.C45078p0;
import com.tencent.p014mm.p136ui.widget.MMEditText;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.xweb.FileReaderHelper;
import di3.C7335d;
import di3.C86312j;
import er1.C58739j4;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C87412m;
import ht1.C8777j5;
import il1.C9164x1;
import il1.C9170y1;
import j20.C117292a;
import java.util.ArrayList;
import kotlin.Metadata;
import nh1.C11164a;
import org.json.JSONObject;
import p206nj.C117627q;
import rx3.C13598b0;
import z04.C112550d0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\u001b\u0010\u001cB#\b\u0016\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\u0006\u0010\u001d\u001a\u00020\f¢\u0006\u0004\b\u001b\u0010\u001eJ\u0006\u0010\u0003\u001a\u00020\u0002R\"\u0010\u000b\u001a\u00020\u00048\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\"\u0010\u0013\u001a\u00020\f8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\"\u0010\u0015\u001a\u00020\u00048\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0006\u001a\u0004\b\u0015\u0010\b\"\u0004\b\u0016\u0010\n¨\u0006\u001f"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/live/widget/FinderLiveDescEditView;", "Landroid/widget/LinearLayout;", "", "getDesc", "", "d", "Z", "getIntecerptKeyBoardEvent", "()Z", "setIntecerptKeyBoardEvent", "(Z)V", "intecerptKeyBoardEvent", "", "e", "I", "getFromScene", "()I", "setFromScene", "(I)V", "fromScene", "f", "isAssistant", "setAssistant", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyle", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder-live_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.live.widget.FinderLiveDescEditView */
public final class FinderLiveDescEditView extends LinearLayout {

    /* renamed from: j */
    public static final /* synthetic */ int f15367j = 0;

    /* renamed from: d */
    public boolean f15368d;

    /* renamed from: e */
    public int f15369e;

    /* renamed from: f */
    public boolean f15370f;

    /* renamed from: g */
    public C32226l<? super String, C13598b0> f15371g;

    /* renamed from: h */
    public C32224a<C13598b0> f15372h;

    /* renamed from: i */
    public C11164a f15373i = C11164a.m11042a(LayoutInflater.from(getContext()), this, true);

    /* renamed from: com.tencent.mm.plugin.finder.live.widget.FinderLiveDescEditView$a */
    public static final class C3238a implements TextWatcher {

        /* renamed from: d */
        public final /* synthetic */ FinderLiveDescEditView f15374d;

        /* renamed from: e */
        public final /* synthetic */ MMEditText f15375e;

        public C3238a(FinderLiveDescEditView finderLiveDescEditView, MMEditText mMEditText) {
            this.f15374d = finderLiveDescEditView;
            this.f15375e = mMEditText;
        }

        public void afterTextChanged(Editable editable) {
            String valueOf = String.valueOf(editable);
            if (C45078p0.m49926e(valueOf, C45078p0.C45079a.MODE_CHINESE_AS_2) > 120) {
                String h = C45078p0.m49929h(valueOf, 120);
                if (editable != null) {
                    try {
                        editable.replace(h.length(), valueOf.length(), "");
                    } catch (Exception e) {
                        Log.m105920e("Finder.FinderLiveDescEditView", "etDesc replace: " + e.getMessage());
                    }
                }
                this.f15374d.f15373i.f32952d.setText(this.f15375e.getContext().getString(C0966R.string.dkk, new Object[]{60}));
                this.f15374d.f15373i.f32952d.setVisibility(0);
                return;
            }
            this.f15374d.f15373i.f32952d.setVisibility(8);
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.live.widget.FinderLiveDescEditView$b */
    public static final class C3239b implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ FinderLiveDescEditView f15376d;

        public C3239b(FinderLiveDescEditView finderLiveDescEditView) {
            this.f15376d = finderLiveDescEditView;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/widget/FinderLiveDescEditView$show$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            FinderLiveDescEditView finderLiveDescEditView = this.f15376d;
            int i = FinderLiveDescEditView.f15367j;
            finderLiveDescEditView.mo3401a();
            C32224a<C13598b0> aVar = finderLiveDescEditView.f15372h;
            if (aVar != null) {
                aVar.invoke();
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveDescEditView$show$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.live.widget.FinderLiveDescEditView$c */
    public static final class C3240c implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ FinderLiveDescEditView f15377d;

        public C3240c(FinderLiveDescEditView finderLiveDescEditView) {
            this.f15377d = finderLiveDescEditView;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/widget/FinderLiveDescEditView$show$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            FinderLiveDescEditView finderLiveDescEditView = this.f15377d;
            int i = FinderLiveDescEditView.f15367j;
            Class cls = C54108o.class;
            String desc = finderLiveDescEditView.getDesc();
            finderLiveDescEditView.mo3401a();
            C32226l<? super String, C13598b0> lVar = finderLiveDescEditView.f15371g;
            if (lVar != null) {
                lVar.invoke(desc);
            }
            if (finderLiveDescEditView.f15370f) {
                ((C54116w) C86312j.m106911c(C54116w.class)).Hx0(2, desc);
            } else {
                String b = C117627q.m165909b(Util.nullAsNil(desc), "utf-8");
                if (finderLiveDescEditView.f15369e == 1) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("content", b);
                    String jSONObject2 = jSONObject.toString();
                    C87412m.m108593f(jSONObject2, "JSONObject().apply {\n   …\n            }.toString()");
                    ((C54108o) C86312j.m106911c(cls)).getClass();
                    C54067f0 f0Var = C54108o.f151869h;
                    f0Var.f151438T = jSONObject2;
                    ((C54108o) C86312j.m106911c(cls)).getClass();
                    C54099m0 m0Var = f0Var.f151443Y;
                    C87412m.m108593f(b, "reportStr");
                    m0Var.getClass();
                    m0Var.f151826c = b;
                    C7335d c = C86312j.m106911c(cls);
                    C87412m.m108593f(c, "getService(HellLiveReport::class.java)");
                    C8777j5.C8778a.m8600a((C8777j5) c, 8, jSONObject2, (String) null, 4, (Object) null);
                } else {
                    C7335d c2 = C86312j.m106911c(cls);
                    C87412m.m108593f(c2, "getService(HellLiveReport::class.java)");
                    C0073g0 g0Var = C0073g0.LIVE_DESC;
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put("type", 3);
                    jSONObject3.put(FileReaderHelper.DOC_EXT, b);
                    C13598b0 b0Var = C13598b0.f38549a;
                    C8777j5.C8778a.m8605f((C8777j5) c2, g0Var, jSONObject3.toString(), (String) null, 4, (Object) null);
                }
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveDescEditView$show$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderLiveDescEditView(Context context) {
        super(context);
        C87412m.m108594g(context, "context");
        setPadding(getPaddingLeft(), C85875k4.m106198o(getContext()) + getContext().getResources().getDimensionPixelSize(C0966R.dimen.f3766df), getPaddingRight(), getPaddingBottom());
        setBackgroundColor(getContext().getResources().getColor(C0966R.color.UN_BW_0_Alpha_0_5));
        mo3402b();
    }

    /* renamed from: a */
    public final void mo3401a() {
        Object systemService = getContext().getSystemService("input_method");
        C87412m.m108592e(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        ((InputMethodManager) systemService).hideSoftInputFromWindow(this.f15373i.f32950b.getWindowToken(), 0);
        setVisibility(8);
    }

    /* renamed from: b */
    public final void mo3402b() {
        MMEditText mMEditText = this.f15373i.f32950b;
        mMEditText.setFocusable(true);
        mMEditText.setFocusableInTouchMode(true);
        mMEditText.setCursorVisible(true);
        mMEditText.setRawInputType(1);
        C85875k4.m106189j0(mMEditText.getPaint(), 0.8f);
        mMEditText.addTextChangedListener(new C3238a(this, mMEditText));
    }

    /* renamed from: c */
    public final void mo3403c(String str, boolean z, C32226l<? super String, C13598b0> lVar, C32224a<C13598b0> aVar, boolean z2) {
        this.f15371g = lVar;
        this.f15372h = aVar;
        this.f15370f = z;
        this.f15373i.f32949a.setOnClickListener(new C3239b(this));
        this.f15373i.f32951c.setOnClickListener(new C3240c(this));
        this.f15373i.f32950b.requestFocus();
        this.f15373i.f32950b.setHint(C58739j4.f168176a.mo83720p());
        if (!Util.isNullOrNil(str)) {
            this.f15373i.f32950b.setText(str);
            MMEditText mMEditText = this.f15373i.f32950b;
            C87412m.m108591d(str);
            mMEditText.setSelection(str.length());
        }
        setVisibility(0);
        C9170y1 y1Var = new C9170y1(this);
        if (z2) {
            this.f15373i.f32950b.postDelayed(new C9164x1(y1Var), 300);
        } else {
            y1Var.invoke();
        }
    }

    public final String getDesc() {
        return C112550d0.m153799i0(this.f15373i.f32950b.getText().toString()).toString();
    }

    public final int getFromScene() {
        return this.f15369e;
    }

    public final boolean getIntecerptKeyBoardEvent() {
        return this.f15368d;
    }

    public final void setAssistant(boolean z) {
        this.f15370f = z;
    }

    public final void setFromScene(int i) {
        this.f15369e = i;
    }

    public final void setIntecerptKeyBoardEvent(boolean z) {
        this.f15368d = z;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderLiveDescEditView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
        setPadding(getPaddingLeft(), C85875k4.m106198o(getContext()) + getContext().getResources().getDimensionPixelSize(C0966R.dimen.f3766df), getPaddingRight(), getPaddingBottom());
        setBackgroundColor(getContext().getResources().getColor(C0966R.color.UN_BW_0_Alpha_0_5));
        mo3402b();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderLiveDescEditView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
        setPadding(getPaddingLeft(), C85875k4.m106198o(getContext()) + getContext().getResources().getDimensionPixelSize(C0966R.dimen.f3766df), getPaddingRight(), getPaddingBottom());
        setBackgroundColor(getContext().getResources().getColor(C0966R.color.UN_BW_0_Alpha_0_5));
        mo3402b();
    }
}
