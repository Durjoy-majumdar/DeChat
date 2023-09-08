package com.tencent.p014mm.p136ui.widget.cedit.api;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.Editable;
import android.text.InputFilter;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.View;
import android.view.ViewParent;
import android.view.inputmethod.InputConnection;
import android.widget.FrameLayout;
import cj3.C67383b;
import cj3.C67387c;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.tencent.p014mm.p136ui.widget.MMEditText;
import com.tencent.p014mm.p136ui.widget.cedit.api.C74974a;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.thumbplayer.tmediacodec.util.MimeTypes;
import com.tencent.xweb.IXWebPreferences;
import gy3.C87412m;
import jo3.C76433e;
import kotlin.Metadata;
import ro3.C110588j;
import ro3.C77558f;
import rx3.C13604l;
import t40.C77853a;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000Ú\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002B*\b\u0016\u0012\b\u0010\u0001\u001a\u00030\u0001\u0012\n\u0010\u0001\u001a\u0005\u0018\u00010\u0001\u0012\u0007\u0010\u0001\u001a\u00020\n¢\u0006\u0006\b\u0001\u0010\u0001B!\b\u0016\u0012\b\u0010\u0001\u001a\u00030\u0001\u0012\n\u0010\u0001\u001a\u0005\u0018\u00010\u0001¢\u0006\u0006\b\u0001\u0010\u0001J\n\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002J\n\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\u0012\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\u0010\u0010\f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u0012\u0010\u000f\u001a\u00020\b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016J\u0010\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\nH\u0016J\u0010\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\nH\u0016J\b\u0010\u0014\u001a\u00020\nH\u0016J\u0010\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u0015H\u0016J\n\u0010\u0018\u001a\u0004\u0018\u00010\u0006H\u0016J\b\u0010\u001a\u001a\u00020\u0019H\u0016J\b\u0010\u001c\u001a\u00020\u001bH\u0016J\b\u0010\u001d\u001a\u00020\nH\u0016J\u0010\u0010 \u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016J\b\u0010!\u001a\u00020\nH\u0016J\u0010\u0010#\u001a\u00020\b2\u0006\u0010\"\u001a\u00020\nH\u0016J\n\u0010%\u001a\u0004\u0018\u00010$H\u0016J\b\u0010'\u001a\u00020&H\u0016J\u0012\u0010)\u001a\u00020\b2\b\u0010(\u001a\u0004\u0018\u00010\u0006H\u0016J\u0010\u0010+\u001a\u00020\b2\u0006\u0010*\u001a\u00020\nH\u0016J\b\u0010,\u001a\u00020\nH\u0016J\u0012\u0010/\u001a\u00020\b2\b\u0010.\u001a\u0004\u0018\u00010-H\u0016J\u001d\u00103\u001a\u00020\b2\f\u00102\u001a\b\u0012\u0004\u0012\u00020100H\u0016¢\u0006\u0004\b3\u00104J\u0010\u00106\u001a\u00020\b2\u0006\u00105\u001a\u00020\nH\u0016J\u0010\u00108\u001a\u00020\b2\u0006\u00107\u001a\u00020\u0019H\u0016J\b\u00109\u001a\u00020\nH\u0016J\u0012\u0010;\u001a\u00020\b2\b\u0010.\u001a\u0004\u0018\u00010:H\u0016J\u0010\u0010>\u001a\u00020\b2\u0006\u0010=\u001a\u00020<H\u0016J\n\u0010@\u001a\u0004\u0018\u00010?H\u0016J\u0010\u0010B\u001a\u00020\b2\u0006\u0010A\u001a\u00020\nH\u0016J\b\u0010C\u001a\u00020\nH\u0016J\u0010\u0010E\u001a\u00020\b2\u0006\u0010.\u001a\u00020DH\u0016J\u0010\u0010G\u001a\u00020\b2\u0006\u0010.\u001a\u00020FH\u0016J\u0012\u0010I\u001a\u00020\b2\b\u0010.\u001a\u0004\u0018\u00010HH\u0016J\u0010\u0010K\u001a\u00020\b2\u0006\u0010J\u001a\u00020\nH\u0016J\u0010\u0010M\u001a\u00020\b2\u0006\u0010L\u001a\u00020&H\u0016J\u0012\u0010O\u001a\u00020\b2\b\u0010N\u001a\u0004\u0018\u00010\u0006H\u0016J\n\u0010P\u001a\u0004\u0018\u00010\u0006H\u0017J\b\u0010R\u001a\u00020QH\u0016J\u0012\u0010U\u001a\u00020\b2\b\u0010T\u001a\u0004\u0018\u00010SH\u0016J\n\u0010W\u001a\u0004\u0018\u00010VH\u0016J\n\u0010X\u001a\u0004\u0018\u00010\u0006H\u0016J\n\u0010Z\u001a\u0004\u0018\u00010YH\u0016J\u0012\u0010\\\u001a\u00020\b2\b\u0010.\u001a\u0004\u0018\u00010[H\u0016J\u0012\u0010^\u001a\u00020\b2\b\u0010=\u001a\u0004\u0018\u00010]H\u0016R\"\u0010e\u001a\u00020\u001b8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b_\u0010`\u001a\u0004\ba\u0010b\"\u0004\bc\u0010dR\"\u0010i\u001a\u00020\u001b8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bf\u0010`\u001a\u0004\bg\u0010b\"\u0004\bh\u0010dR$\u0010m\u001a\u0004\u0018\u00010\u001b8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bj\u0010`\u001a\u0004\bk\u0010b\"\u0004\bl\u0010dR$\u0010q\u001a\u0004\u0018\u00010\u001b8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bn\u0010`\u001a\u0004\bo\u0010b\"\u0004\bp\u0010dR$\u0010x\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\br\u0010s\u001a\u0004\bt\u0010u\"\u0004\bv\u0010wR$\u0010|\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\by\u0010s\u001a\u0004\bz\u0010u\"\u0004\b{\u0010wR\u0019\u0010\u0001\u001a\u00020}8\u0006¢\u0006\r\n\u0004\b~\u0010\u001a\u0005\bR\u0010\u0001¨\u0006\u0001"}, mo182094d2 = {"Lcom/tencent/mm/ui/widget/cedit/api/MMFlexEditText;", "Landroid/widget/FrameLayout;", "Lcom/tencent/mm/ui/widget/cedit/api/a;", "getImpl", "Landroid/text/Editable;", "getText", "", "text", "Lrx3/b0;", "setText", "", "imeOptions", "setImeOptions", "Landroid/graphics/drawable/Drawable;", "drawable", "setTextCursorDrawable", "breakStrategy", "setBreakStrategy", "maxPixels", "setMaxHeight", "getImeOptions", "Landroid/view/ActionMode$Callback;", "actionModeCallback", "setCustomSelectionActionModeCallback", "getPasterContent", "", "getSimilarPasteChange", "", "getSimilarPasteSeqStr", "getSelectionStart", "Lcom/tencent/mm/ui/widget/MMEditText$e;", "keyCodeEnterListener", "setKeyCodeEnterListener", "getLineCount", "index", "setSelection", "Landroid/view/inputmethod/InputConnection;", "getInputConnection", "", "getTextSize", "hint", "setHint", "type", "setInputType", "getInputType", "Landroid/view/View$OnDragListener;", "l", "setOnDragListener", "", "Landroid/text/InputFilter;", "filters", "setFilters", "([Landroid/text/InputFilter;)V", "color", "setTextColor", "enableSendBtn", "setEnableSendBtn", "getPasterLen", "Landroid/view/View$OnClickListener;", "setOnClickListener", "Lcom/tencent/mm/ui/widget/MMEditText$b;", "listener", "setBackListener", "Landroid/text/TextPaint;", "getPaint", "visibility", "setVisibility", "getVisibility", "Landroid/view/View$OnTouchListener;", "setOnTouchListener", "Landroid/view/View$OnFocusChangeListener;", "setOnFocusChangeListener", "Landroid/view/View$OnLongClickListener;", "setOnLongClickListener", "parsterLen", "setPasterLen", "alpha", "setAlpha", "contentDescription", "setContentDescription", "getContentDescription", "Lcj3/b;", "getSizeAnimController", "Lcom/tencent/mm/ui/widget/cedit/api/a$a;", "callback", "setImeSendImageCallback", "Lro3/j;", "getSelectHelper", "getHint", "Landroid/text/Layout;", "getLayout", "Landroid/view/View$OnKeyListener;", "setOnKeyListener", "Lcom/tencent/mm/ui/widget/cedit/api/a$c;", "setSelectionChangedListener", "d", "Ljava/lang/String;", "getDEF_EDT_SYS_CLASS", "()Ljava/lang/String;", "setDEF_EDT_SYS_CLASS", "(Ljava/lang/String;)V", "DEF_EDT_SYS_CLASS", "e", "getDEF_EDT_CUSTOM_CLASS", "setDEF_EDT_CUSTOM_CLASS", "DEF_EDT_CUSTOM_CLASS", "f", "getEdtSysClass", "setEdtSysClass", "edtSysClass", "g", "getEdtCustomClass", "setEdtCustomClass", "edtCustomClass", "h", "Lcom/tencent/mm/ui/widget/cedit/api/a;", "getEdtSys", "()Lcom/tencent/mm/ui/widget/cedit/api/a;", "setEdtSys", "(Lcom/tencent/mm/ui/widget/cedit/api/a;)V", "edtSys", "i", "getEdtCustom", "setEdtCustom", "edtCustom", "Lcj3/c;", "n", "Lcj3/c;", "()Lcj3/c;", "sizeAnimController", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "libmmui_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.ui.widget.cedit.api.MMFlexEditText */
public final class MMFlexEditText extends FrameLayout implements C74974a {

    /* renamed from: p */
    public static final /* synthetic */ int f220522p = 0;

    /* renamed from: d */
    public String f220523d = "com.tencent.mm.ui.widget.MMEditText";

    /* renamed from: e */
    public String f220524e = "com.tencent.mm.ui.widget.cedit.api.MMCustomEditText";

    /* renamed from: f */
    public String f220525f = "com.tencent.mm.ui.widget.MMEditText";

    /* renamed from: g */
    public String f220526g = "com.tencent.mm.ui.widget.cedit.api.MMCustomEditText";

    /* renamed from: h */
    public C74974a f220527h;

    /* renamed from: i */
    public C74974a f220528i;

    /* renamed from: j */
    public Boolean f220529j;

    /* renamed from: n */
    public final C67387c f220530n = new C67387c(this);

    /* renamed from: o */
    public final String f220531o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MMFlexEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
        String str = "MicroMsg.MMFlexEditText@" + hashCode();
        this.f220531o = str;
        Log.m105924i(str, "init with defStyle");
        mo104458s(context, attributeSet);
        this.f220528i = mo104455r(this.f220526g, context, attributeSet, i);
        this.f220527h = mo104455r(this.f220525f, context, attributeSet, i);
        setPadding(0, 0, 0, 0);
        mo104239a(true);
        C76433e eVar = new C76433e(this);
        C74974a aVar = this.f220527h;
        if (aVar != null) {
            aVar.addTextChangedListener(eVar);
        }
        C74974a aVar2 = this.f220528i;
        if (aVar2 != null) {
            aVar2.addTextChangedListener(eVar);
        }
    }

    private final C74974a getImpl() {
        Boolean bool = this.f220529j;
        C87412m.m108591d(bool);
        return bool.booleanValue() ? this.f220527h : this.f220528i;
    }

    /* JADX WARNING: type inference failed for: r1v6, types: [android.view.ViewParent] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo104239a(boolean r6) {
        /*
            r5 = this;
            java.lang.String r0 = r5.f220531o
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r6)
            r3 = 0
            r1[r3] = r2
            java.lang.Boolean r2 = r5.f220529j
            r4 = 1
            r1[r4] = r2
            java.lang.String r2 = "refresh isUseSys:%s, mUseSys:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r2, r1)
            com.tencent.mm.ui.widget.cedit.api.a r0 = r5.f220528i
            if (r0 == 0) goto L_0x0022
            boolean r0 = r0.mo104252i()
            if (r0 != r4) goto L_0x0022
            r0 = 1
            goto L_0x0023
        L_0x0022:
            r0 = 0
        L_0x0023:
            if (r0 == 0) goto L_0x0026
            r6 = 1
        L_0x0026:
            java.lang.Boolean r0 = r5.f220529j
            if (r0 == 0) goto L_0x0035
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r6)
            boolean r0 = gy3.C87412m.m108589b(r0, r1)
            if (r0 == 0) goto L_0x0035
            return
        L_0x0035:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            r5.f220529j = r6
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r6 = gy3.C87412m.m108589b(r6, r0)
            r0 = 8
            r1 = 0
            if (r6 == 0) goto L_0x007a
            com.tencent.mm.ui.widget.cedit.api.a r6 = r5.f220527h
            if (r6 == 0) goto L_0x004f
            android.view.ViewParent r6 = r6.mo104253j()
            goto L_0x0050
        L_0x004f:
            r6 = r1
        L_0x0050:
            if (r6 != 0) goto L_0x005f
            com.tencent.mm.ui.widget.cedit.api.a r6 = r5.f220527h
            if (r6 == 0) goto L_0x005b
            android.view.View r6 = r6.view()
            goto L_0x005c
        L_0x005b:
            r6 = r1
        L_0x005c:
            r5.addView(r6)
        L_0x005f:
            com.tencent.mm.ui.widget.cedit.api.a r6 = r5.f220527h
            if (r6 != 0) goto L_0x0064
            goto L_0x0067
        L_0x0064:
            r6.setVisibility(r3)
        L_0x0067:
            com.tencent.mm.ui.widget.cedit.api.a r6 = r5.f220528i
            if (r6 == 0) goto L_0x006f
            android.view.ViewParent r1 = r6.mo104253j()
        L_0x006f:
            if (r1 == 0) goto L_0x00b2
            com.tencent.mm.ui.widget.cedit.api.a r6 = r5.f220528i
            if (r6 != 0) goto L_0x0076
            goto L_0x00b2
        L_0x0076:
            r6.setVisibility(r0)
            goto L_0x00b2
        L_0x007a:
            r6 = 9
            jo3.C76430b.m91852a(r6)
            com.tencent.mm.ui.widget.cedit.api.a r6 = r5.f220527h
            if (r6 == 0) goto L_0x0088
            android.view.ViewParent r6 = r6.mo104253j()
            goto L_0x0089
        L_0x0088:
            r6 = r1
        L_0x0089:
            if (r6 == 0) goto L_0x0093
            com.tencent.mm.ui.widget.cedit.api.a r6 = r5.f220527h
            if (r6 != 0) goto L_0x0090
            goto L_0x0093
        L_0x0090:
            r6.setVisibility(r0)
        L_0x0093:
            com.tencent.mm.ui.widget.cedit.api.a r6 = r5.f220528i
            if (r6 == 0) goto L_0x009c
            android.view.ViewParent r6 = r6.mo104253j()
            goto L_0x009d
        L_0x009c:
            r6 = r1
        L_0x009d:
            if (r6 != 0) goto L_0x00aa
            com.tencent.mm.ui.widget.cedit.api.a r6 = r5.f220528i
            if (r6 == 0) goto L_0x00a7
            android.view.View r1 = r6.view()
        L_0x00a7:
            r5.addView(r1)
        L_0x00aa:
            com.tencent.mm.ui.widget.cedit.api.a r6 = r5.f220528i
            if (r6 != 0) goto L_0x00af
            goto L_0x00b2
        L_0x00af:
            r6.setVisibility(r3)
        L_0x00b2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.widget.cedit.api.MMFlexEditText.mo104239a(boolean):void");
    }

    public void addOnLayoutChangeListener(View.OnLayoutChangeListener onLayoutChangeListener) {
        C87412m.m108594g(onLayoutChangeListener, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        C74974a aVar = this.f220527h;
        if (aVar != null) {
            aVar.addOnLayoutChangeListener(onLayoutChangeListener);
        }
        C74974a aVar2 = this.f220528i;
        if (aVar2 != null) {
            aVar2.addOnLayoutChangeListener(onLayoutChangeListener);
        }
    }

    public void addTextChangedListener(TextWatcher textWatcher) {
        C87412m.m108594g(textWatcher, "watcher");
        C74974a aVar = this.f220527h;
        if (aVar != null) {
            aVar.addTextChangedListener(textWatcher);
        }
        C74974a aVar2 = this.f220528i;
        if (aVar2 != null) {
            aVar2.addTextChangedListener(textWatcher);
        }
    }

    public void append(CharSequence charSequence) {
        C74974a aVar = this.f220527h;
        if (aVar != null) {
            aVar.append(charSequence);
        }
        C74974a aVar2 = this.f220528i;
        if (aVar2 != null) {
            aVar2.append(charSequence);
        }
    }

    /* renamed from: b */
    public void mo104240b() {
        if (C87412m.m108589b(this.f220529j, Boolean.TRUE)) {
            C74974a aVar = this.f220527h;
            if (aVar != null && aVar != null) {
                aVar.mo104240b();
                return;
            }
            return;
        }
        C74974a aVar2 = this.f220528i;
        if (aVar2 != null && aVar2 != null) {
            aVar2.mo104240b();
        }
    }

    /* renamed from: c */
    public void mo104241c() {
        if (C87412m.m108589b(this.f220529j, Boolean.TRUE)) {
            C74974a aVar = this.f220527h;
            if (aVar != null) {
                aVar.mo104241c();
                return;
            }
            return;
        }
        C74974a aVar2 = this.f220528i;
        if (aVar2 != null) {
            aVar2.mo104241c();
        }
    }

    public void clearComposingText() {
        C74974a aVar = this.f220527h;
        if (aVar != null) {
            aVar.clearComposingText();
        }
        C74974a aVar2 = this.f220528i;
        if (aVar2 != null) {
            aVar2.clearComposingText();
        }
    }

    public void clearFocus() {
        C74974a aVar = this.f220528i;
        if (aVar != null) {
            aVar.clearFocus();
        }
        C74974a aVar2 = this.f220527h;
        if (aVar2 != null) {
            aVar2.clearFocus();
        }
    }

    /* renamed from: d */
    public void mo104242d(C77558f fVar) {
        C74974a aVar = this.f220527h;
        if (aVar != null) {
            aVar.mo104242d(fVar);
        }
        C74974a aVar2 = this.f220528i;
        if (aVar2 != null) {
            aVar2.mo104242d(fVar);
        }
    }

    public void destroy() {
        C74974a aVar = this.f220528i;
        if (aVar != null) {
            aVar.destroy();
        }
        C74974a aVar2 = this.f220527h;
        if (aVar2 != null) {
            aVar2.destroy();
        }
    }

    /* renamed from: e */
    public void mo104244e(String str, String str2, C110588j.C110590c cVar, C110588j.C77559a.C77560a aVar) {
        C87412m.m108594g(str, "sysMenuConfig");
        C87412m.m108594g(str2, IXWebPreferences.XWEB_LANGUAGE);
        C87412m.m108594g(cVar, "menuCallback");
        C74974a aVar2 = this.f220528i;
        if (aVar2 != null) {
            aVar2.mo104244e(str, str2, cVar, aVar);
        }
        C74974a aVar3 = this.f220527h;
        if (aVar3 != null) {
            aVar3.mo104244e(str, str2, cVar, aVar);
        }
    }

    /* renamed from: f */
    public void mo104245f(boolean z) {
        if (C87412m.m108589b(this.f220529j, Boolean.TRUE)) {
            C74974a aVar = this.f220527h;
            if (aVar != null) {
                aVar.mo104245f(z);
                return;
            }
            return;
        }
        C74974a aVar2 = this.f220528i;
        if (aVar2 != null) {
            aVar2.mo104245f(z);
        }
    }

    /* renamed from: g */
    public void mo104247g() {
        if (C87412m.m108589b(this.f220529j, Boolean.TRUE)) {
            C74974a aVar = this.f220527h;
            if (aVar != null) {
                aVar.mo104247g();
                return;
            }
            return;
        }
        C74974a aVar2 = this.f220528i;
        if (aVar2 != null) {
            aVar2.mo104247g();
        }
    }

    public CharSequence getContentDescription() {
        if (C87412m.m108589b(this.f220529j, Boolean.TRUE)) {
            C74974a aVar = this.f220527h;
            if (aVar != null) {
                if (aVar != null) {
                    return aVar.getContentDescription();
                }
                return null;
            }
        } else {
            C74974a aVar2 = this.f220528i;
            if (aVar2 != null) {
                if (aVar2 != null) {
                    return aVar2.getContentDescription();
                }
                return null;
            }
        }
        return super.getContentDescription();
    }

    public final String getDEF_EDT_CUSTOM_CLASS() {
        return this.f220524e;
    }

    public final String getDEF_EDT_SYS_CLASS() {
        return this.f220523d;
    }

    public final C74974a getEdtCustom() {
        return this.f220528i;
    }

    public final String getEdtCustomClass() {
        return this.f220526g;
    }

    public final C74974a getEdtSys() {
        return this.f220527h;
    }

    public final String getEdtSysClass() {
        return this.f220525f;
    }

    public CharSequence getHint() {
        if (C87412m.m108589b(this.f220529j, Boolean.TRUE)) {
            C74974a aVar = this.f220527h;
            if (aVar == null || aVar == null) {
                return null;
            }
            return aVar.getHint();
        }
        C74974a aVar2 = this.f220528i;
        if (aVar2 == null || aVar2 == null) {
            return null;
        }
        return aVar2.getHint();
    }

    public int getImeOptions() {
        if (C87412m.m108589b(this.f220529j, Boolean.TRUE)) {
            C74974a aVar = this.f220527h;
            if (aVar != null) {
                return aVar.getImeOptions();
            }
            return 0;
        }
        C74974a aVar2 = this.f220528i;
        if (aVar2 != null) {
            return aVar2.getImeOptions();
        }
        return 0;
    }

    public InputConnection getInputConnection() {
        if (C87412m.m108589b(this.f220529j, Boolean.TRUE)) {
            C74974a aVar = this.f220527h;
            if (aVar != null) {
                return aVar.getInputConnection();
            }
            return null;
        }
        C74974a aVar2 = this.f220528i;
        if (aVar2 != null) {
            return aVar2.getInputConnection();
        }
        return null;
    }

    public Bundle getInputExtras(boolean z) {
        if (C87412m.m108589b(this.f220529j, Boolean.TRUE)) {
            C74974a aVar = this.f220527h;
            if (aVar != null) {
                return aVar.getInputExtras(z);
            }
            return null;
        }
        C74974a aVar2 = this.f220528i;
        if (aVar2 != null) {
            return aVar2.getInputExtras(z);
        }
        return null;
    }

    public int getInputType() {
        if (C87412m.m108589b(this.f220529j, Boolean.TRUE)) {
            C74974a aVar = this.f220527h;
            if (aVar != null) {
                return aVar.getInputType();
            }
            return 0;
        }
        C74974a aVar2 = this.f220528i;
        if (aVar2 != null) {
            return aVar2.getInputType();
        }
        return 0;
    }

    public Layout getLayout() {
        if (C87412m.m108589b(this.f220529j, Boolean.TRUE)) {
            C74974a aVar = this.f220527h;
            if (aVar != null) {
                return aVar.getLayout();
            }
            return null;
        }
        C74974a aVar2 = this.f220528i;
        if (aVar2 != null) {
            return aVar2.getLayout();
        }
        return null;
    }

    public int getLineCount() {
        if (C87412m.m108589b(this.f220529j, Boolean.TRUE)) {
            C74974a aVar = this.f220527h;
            if (aVar != null) {
                return aVar.getLineCount();
            }
            return 0;
        }
        C74974a aVar2 = this.f220528i;
        if (aVar2 != null) {
            return aVar2.getLineCount();
        }
        return 0;
    }

    public TextPaint getPaint() {
        if (C87412m.m108589b(this.f220529j, Boolean.TRUE)) {
            C74974a aVar = this.f220527h;
            if (aVar != null) {
                return aVar.getPaint();
            }
            return null;
        }
        C74974a aVar2 = this.f220528i;
        if (aVar2 != null) {
            return aVar2.getPaint();
        }
        return null;
    }

    public CharSequence getPasterContent() {
        if (C87412m.m108589b(this.f220529j, Boolean.TRUE)) {
            C74974a aVar = this.f220527h;
            if (aVar != null) {
                return aVar.getPasterContent();
            }
            return null;
        }
        C74974a aVar2 = this.f220528i;
        if (aVar2 != null) {
            return aVar2.getPasterContent();
        }
        return null;
    }

    public int getPasterLen() {
        if (C87412m.m108589b(this.f220529j, Boolean.TRUE)) {
            C74974a aVar = this.f220527h;
            if (aVar != null) {
                return aVar.getPasterLen();
            }
            return 0;
        }
        C74974a aVar2 = this.f220528i;
        if (aVar2 != null) {
            return aVar2.getPasterLen();
        }
        return 0;
    }

    public C110588j getSelectHelper() {
        if (C87412m.m108589b(this.f220529j, Boolean.TRUE)) {
            C74974a aVar = this.f220527h;
            if (aVar != null) {
                return aVar.getSelectHelper();
            }
            return null;
        }
        C74974a aVar2 = this.f220528i;
        if (aVar2 != null) {
            return aVar2.getSelectHelper();
        }
        return null;
    }

    public int getSelectionStart() {
        if (C87412m.m108589b(this.f220529j, Boolean.TRUE)) {
            C74974a aVar = this.f220527h;
            if (aVar != null) {
                return aVar.getSelectionStart();
            }
            return 0;
        }
        C74974a aVar2 = this.f220528i;
        if (aVar2 != null) {
            return aVar2.getSelectionStart();
        }
        return 0;
    }

    public boolean getSimilarPasteChange() {
        if (C87412m.m108589b(this.f220529j, Boolean.TRUE)) {
            C74974a aVar = this.f220527h;
            if (aVar != null) {
                return aVar.getSimilarPasteChange();
            }
            return false;
        }
        C74974a aVar2 = this.f220528i;
        if (aVar2 != null) {
            return aVar2.getSimilarPasteChange();
        }
        return false;
    }

    public String getSimilarPasteSeqStr() {
        String str = null;
        if (C87412m.m108589b(this.f220529j, Boolean.TRUE)) {
            C74974a aVar = this.f220527h;
            if (aVar != null) {
                str = aVar.getSimilarPasteSeqStr();
            }
            if (str == null) {
                return "";
            }
        } else {
            C74974a aVar2 = this.f220528i;
            if (aVar2 != null) {
                str = aVar2.getSimilarPasteSeqStr();
            }
            if (str == null) {
                return "";
            }
        }
        return str;
    }

    /* renamed from: getSizeAnimController  reason: collision with other method in class */
    public final C67387c m168878getSizeAnimController() {
        return this.f220530n;
    }

    public Editable getText() {
        if (C87412m.m108589b(this.f220529j, Boolean.TRUE)) {
            C74974a aVar = this.f220527h;
            if (aVar != null) {
                return aVar.getText();
            }
            return null;
        }
        C74974a aVar2 = this.f220528i;
        if (aVar2 != null) {
            return aVar2.getText();
        }
        return null;
    }

    public float getTextSize() {
        if (C87412m.m108589b(this.f220529j, Boolean.TRUE)) {
            C74974a aVar = this.f220527h;
            if (aVar != null) {
                return aVar.getTextSize();
            }
            return 0.0f;
        }
        C74974a aVar2 = this.f220528i;
        if (aVar2 != null) {
            return aVar2.getTextSize();
        }
        return 0.0f;
    }

    public int getVisibility() {
        Boolean bool = this.f220529j;
        if (bool == null) {
            return super.getVisibility();
        }
        if (C87412m.m108589b(bool, Boolean.TRUE)) {
            C74974a aVar = this.f220527h;
            return aVar != null ? aVar.getVisibility() : super.getVisibility();
        }
        C74974a aVar2 = this.f220528i;
        return aVar2 != null ? aVar2.getVisibility() : super.getVisibility();
    }

    /* renamed from: h */
    public Context mo104251h() {
        if (C87412m.m108589b(this.f220529j, Boolean.TRUE)) {
            C74974a aVar = this.f220527h;
            if (aVar != null) {
                return aVar.mo104251h();
            }
            return null;
        }
        C74974a aVar2 = this.f220528i;
        if (aVar2 != null) {
            return aVar2.mo104251h();
        }
        return null;
    }

    /* renamed from: i */
    public boolean mo104252i() {
        return false;
    }

    /* renamed from: j */
    public ViewParent mo104253j() {
        ViewParent parent = getParent();
        C87412m.m108593f(parent, "parent");
        return parent;
    }

    /* renamed from: k */
    public void mo104254k(C74974a.C74976b bVar) {
        C87412m.m108594g(bVar, "l");
        C74974a aVar = this.f220527h;
        if (aVar != null) {
            aVar.mo104254k(bVar);
        }
        C74974a aVar2 = this.f220528i;
        if (aVar2 != null) {
            aVar2.mo104254k(bVar);
        }
    }

    /* renamed from: l */
    public int mo104255l() {
        if (C87412m.m108589b(this.f220529j, Boolean.TRUE)) {
            C74974a aVar = this.f220527h;
            if (aVar != null) {
                return aVar.mo104255l();
            }
            return 0;
        }
        C74974a aVar2 = this.f220528i;
        if (aVar2 != null) {
            return aVar2.mo104255l();
        }
        return 0;
    }

    public int length() {
        if (C87412m.m108589b(this.f220529j, Boolean.TRUE)) {
            C74974a aVar = this.f220527h;
            if (aVar != null) {
                return aVar.length();
            }
            return 0;
        }
        C74974a aVar2 = this.f220528i;
        if (aVar2 != null) {
            return aVar2.length();
        }
        return 0;
    }

    /* renamed from: m */
    public boolean mo104256m() {
        try {
            if (C87412m.m108589b(this.f220529j, Boolean.TRUE)) {
                C74974a aVar = this.f220527h;
                if (aVar != null) {
                    return aVar.mo104256m();
                }
                return false;
            }
            C74974a aVar2 = this.f220528i;
            if (aVar2 != null) {
                return aVar2.mo104256m();
            }
            return false;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: n */
    public View mo104257n() {
        return this;
    }

    /* renamed from: o */
    public void mo98046o(String str) {
        C87412m.m108594g(str, MimeTypes.BASE_TYPE_TEXT);
        C74974a aVar = this.f220527h;
        if (aVar != null) {
            aVar.mo98046o(str);
        }
        C74974a aVar2 = this.f220528i;
        if (aVar2 != null) {
            aVar2.mo98046o(str);
        }
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.f220530n.mo91532d(z, i, i2, i3, i4);
    }

    public void onMeasure(int i, int i2) {
        C13604l<Integer, Integer> f = this.f220530n.mo91534f(i, i2);
        if (f != null) {
            setMeasuredDimension(((Number) f.f38555d).intValue(), ((Number) f.f38556e).intValue());
            return;
        }
        super.onMeasure(i, i2);
        C13604l<Integer, Integer> e = this.f220530n.mo91533e(i, i2);
        if (e != null) {
            setMeasuredDimension(((Number) e.f38555d).intValue(), ((Number) e.f38556e).intValue());
        }
    }

    public void onPause() {
        if (C87412m.m108589b(this.f220529j, Boolean.TRUE)) {
            C74974a aVar = this.f220527h;
            if (aVar != null) {
                aVar.onPause();
                return;
            }
            return;
        }
        C74974a aVar2 = this.f220528i;
        if (aVar2 != null) {
            aVar2.onPause();
        }
    }

    /* renamed from: p */
    public void mo104453p() {
        C74974a aVar = this.f220527h;
        if (aVar != null) {
            aVar.mo104453p();
        }
        C74974a aVar2 = this.f220528i;
        if (aVar2 != null) {
            aVar2.mo104453p();
        }
    }

    /* renamed from: q */
    public final C74974a mo104454q(String str, Context context, AttributeSet attributeSet) {
        try {
            Object newInstance = Class.forName(str).getConstructor(new Class[]{Context.class, AttributeSet.class}).newInstance(new Object[]{context, attributeSet});
            C87412m.m108592e(newInstance, "null cannot be cast to non-null type com.tencent.mm.ui.widget.cedit.api.IEditText");
            return (C74974a) newInstance;
        } catch (Throwable th) {
            Log.m105921e(this.f220531o, "getEdtByClass err1:%s", Util.stackTraceToString(th));
            return new MMEditText(context, attributeSet);
        }
    }

    /* renamed from: r */
    public final C74974a mo104455r(String str, Context context, AttributeSet attributeSet, int i) {
        try {
            Object newInstance = Class.forName(str).getConstructor(new Class[]{Context.class, AttributeSet.class, Integer.TYPE}).newInstance(new Object[]{context, attributeSet, Integer.valueOf(i)});
            C87412m.m108592e(newInstance, "null cannot be cast to non-null type com.tencent.mm.ui.widget.cedit.api.IEditText");
            return (C74974a) newInstance;
        } catch (Throwable th) {
            Log.m105921e(this.f220531o, "getEdtByClass err2:%s", Util.stackTraceToString(th));
            return new MMEditText(context, attributeSet, i);
        }
    }

    public void removeOnLayoutChangeListener(View.OnLayoutChangeListener onLayoutChangeListener) {
        C87412m.m108594g(onLayoutChangeListener, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        C74974a aVar = this.f220527h;
        if (aVar != null) {
            aVar.removeOnLayoutChangeListener(onLayoutChangeListener);
        }
        C74974a aVar2 = this.f220528i;
        if (aVar2 != null) {
            aVar2.removeOnLayoutChangeListener(onLayoutChangeListener);
        }
    }

    public void removeTextChangedListener(TextWatcher textWatcher) {
        C87412m.m108594g(textWatcher, "watcher");
        C74974a aVar = this.f220527h;
        if (aVar != null) {
            aVar.removeTextChangedListener(textWatcher);
        }
        C74974a aVar2 = this.f220528i;
        if (aVar2 != null) {
            aVar2.removeTextChangedListener(textWatcher);
        }
    }

    /* renamed from: s */
    public final void mo104458s(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C77853a.f226867m);
            C87412m.m108593f(obtainStyledAttributes, "context.obtainStyledAttr…styleable.MMFlexEditText)");
            this.f220525f = obtainStyledAttributes.getString(1);
            this.f220526g = obtainStyledAttributes.getString(0);
            obtainStyledAttributes.recycle();
        }
    }

    public void setAlpha(float f) {
        C74974a aVar = this.f220528i;
        if (aVar != null) {
            aVar.setAlpha(f);
        }
        C74974a aVar2 = this.f220527h;
        if (aVar2 != null) {
            aVar2.setAlpha(f);
        }
    }

    public void setBackListener(MMEditText.C74949b bVar) {
        C87412m.m108594g(bVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        C74974a aVar = this.f220527h;
        if (aVar != null) {
            aVar.setBackListener(bVar);
        }
        C74974a aVar2 = this.f220528i;
        if (aVar2 != null) {
            aVar2.setBackListener(bVar);
        }
    }

    public void setBreakStrategy(int i) {
        C74974a aVar = this.f220527h;
        if (aVar != null) {
            aVar.setBreakStrategy(i);
        }
        C74974a aVar2 = this.f220528i;
        if (aVar2 != null) {
            aVar2.setBreakStrategy(i);
        }
    }

    public void setContentDescription(CharSequence charSequence) {
        super.setContentDescription(charSequence);
        if (C87412m.m108589b(this.f220529j, Boolean.TRUE)) {
            C74974a aVar = this.f220527h;
            if (aVar != null && aVar != null) {
                aVar.setContentDescription(charSequence);
                return;
            }
            return;
        }
        C74974a aVar2 = this.f220528i;
        if (aVar2 != null && aVar2 != null) {
            aVar2.setContentDescription(charSequence);
        }
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        C87412m.m108594g(callback, "actionModeCallback");
        C74974a aVar = this.f220527h;
        if (aVar != null) {
            aVar.setCustomSelectionActionModeCallback(callback);
        }
        C74974a aVar2 = this.f220528i;
        if (aVar2 != null) {
            aVar2.setCustomSelectionActionModeCallback(callback);
        }
    }

    public final void setDEF_EDT_CUSTOM_CLASS(String str) {
        C87412m.m108594g(str, "<set-?>");
        this.f220524e = str;
    }

    public final void setDEF_EDT_SYS_CLASS(String str) {
        C87412m.m108594g(str, "<set-?>");
        this.f220523d = str;
    }

    public final void setEdtCustom(C74974a aVar) {
        this.f220528i = aVar;
    }

    public final void setEdtCustomClass(String str) {
        this.f220526g = str;
    }

    public final void setEdtSys(C74974a aVar) {
        this.f220527h = aVar;
    }

    public final void setEdtSysClass(String str) {
        this.f220525f = str;
    }

    public void setEnableSendBtn(boolean z) {
        C74974a aVar = this.f220527h;
        if (aVar != null) {
            aVar.setEnableSendBtn(z);
        }
        C74974a aVar2 = this.f220528i;
        if (aVar2 != null) {
            aVar2.setEnableSendBtn(z);
        }
    }

    public void setFilters(InputFilter[] inputFilterArr) {
        C87412m.m108594g(inputFilterArr, "filters");
        C74974a aVar = this.f220527h;
        if (aVar != null) {
            aVar.setFilters(inputFilterArr);
        }
        C74974a aVar2 = this.f220528i;
        if (aVar2 != null) {
            aVar2.setFilters(inputFilterArr);
        }
    }

    public void setHint(CharSequence charSequence) {
        C74974a aVar = this.f220527h;
        if (aVar != null) {
            aVar.setHint(charSequence);
        }
        C74974a aVar2 = this.f220528i;
        if (aVar2 != null) {
            aVar2.setHint(charSequence);
        }
    }

    public void setImeOptions(int i) {
        C74974a aVar = this.f220527h;
        if (aVar != null) {
            aVar.setImeOptions(i);
        }
        C74974a aVar2 = this.f220528i;
        if (aVar2 != null) {
            aVar2.setImeOptions(i);
        }
    }

    public void setImeSendImageCallback(C74974a.C74975a aVar) {
        C74974a impl = getImpl();
        if (impl != null) {
            impl.setImeSendImageCallback(aVar);
        }
    }

    public void setInputType(int i) {
        C74974a aVar = this.f220527h;
        if (aVar != null) {
            aVar.setInputType(i);
        }
        C74974a aVar2 = this.f220528i;
        if (aVar2 != null) {
            aVar2.setInputType(i);
        }
    }

    public void setKeyCodeEnterListener(MMEditText.C74951e eVar) {
        C87412m.m108594g(eVar, "keyCodeEnterListener");
        C74974a aVar = this.f220527h;
        if (aVar != null) {
            aVar.setKeyCodeEnterListener(eVar);
        }
        C74974a aVar2 = this.f220528i;
        if (aVar2 != null) {
            aVar2.setKeyCodeEnterListener(eVar);
        }
    }

    public void setMaxHeight(int i) {
        C74974a aVar = this.f220527h;
        if (!(aVar == null || aVar == null)) {
            aVar.setMaxHeight(i);
        }
        C74974a aVar2 = this.f220528i;
        if (aVar2 != null && aVar2 != null) {
            aVar2.setMaxHeight(i);
        }
    }

    public void setOnClickListener(View.OnClickListener onClickListener) {
        C74974a aVar = this.f220527h;
        if (aVar != null) {
            aVar.setOnClickListener(onClickListener);
        }
        C74974a aVar2 = this.f220528i;
        if (aVar2 != null) {
            aVar2.setOnClickListener(onClickListener);
        }
    }

    public void setOnDragListener(View.OnDragListener onDragListener) {
        C74974a aVar = this.f220527h;
        if (aVar != null) {
            aVar.setOnDragListener(onDragListener);
        }
        C74974a aVar2 = this.f220528i;
        if (aVar2 != null) {
            aVar2.setOnDragListener(onDragListener);
        }
    }

    public void setOnFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        C87412m.m108594g(onFocusChangeListener, "l");
        C74974a aVar = this.f220528i;
        if (aVar != null) {
            aVar.setOnFocusChangeListener(onFocusChangeListener);
        }
        C74974a aVar2 = this.f220527h;
        if (aVar2 != null) {
            aVar2.setOnFocusChangeListener(onFocusChangeListener);
        }
    }

    public void setOnKeyListener(View.OnKeyListener onKeyListener) {
        C74974a aVar = this.f220527h;
        if (aVar != null) {
            aVar.setOnKeyListener(onKeyListener);
        }
        C74974a aVar2 = this.f220528i;
        if (aVar2 != null) {
            aVar2.setOnKeyListener(onKeyListener);
        }
    }

    public void setOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        C74974a aVar = this.f220528i;
        if (aVar != null) {
            aVar.setOnLongClickListener(onLongClickListener);
        }
        C74974a aVar2 = this.f220527h;
        if (aVar2 != null) {
            aVar2.setOnLongClickListener(onLongClickListener);
        }
    }

    public void setOnTouchListener(View.OnTouchListener onTouchListener) {
        C87412m.m108594g(onTouchListener, "l");
        C74974a aVar = this.f220528i;
        if (aVar != null) {
            aVar.setOnTouchListener(onTouchListener);
        }
        C74974a aVar2 = this.f220527h;
        if (aVar2 != null) {
            aVar2.setOnTouchListener(onTouchListener);
        }
    }

    public void setPasterLen(int i) {
        C74974a aVar = this.f220527h;
        if (aVar != null) {
            aVar.setPasterLen(i);
        }
        C74974a aVar2 = this.f220528i;
        if (aVar2 != null) {
            aVar2.setPasterLen(i);
        }
    }

    public void setSelection(int i) {
        C74974a aVar = this.f220527h;
        if (aVar != null) {
            aVar.setSelection(i);
        }
        C74974a aVar2 = this.f220528i;
        if (aVar2 != null) {
            aVar2.setSelection(i);
        }
    }

    public void setSelectionChangedListener(C74974a.C74977c cVar) {
        C74974a aVar = this.f220527h;
        if (aVar != null) {
            aVar.setSelectionChangedListener(cVar);
        }
        C74974a aVar2 = this.f220528i;
        if (aVar2 != null) {
            aVar2.setSelectionChangedListener(cVar);
        }
    }

    public void setText(CharSequence charSequence) {
        C74974a aVar = this.f220527h;
        if (aVar != null) {
            aVar.setText(charSequence);
        }
        C74974a aVar2 = this.f220528i;
        if (aVar2 != null) {
            aVar2.setText(charSequence);
        }
    }

    public void setTextColor(int i) {
        C74974a aVar = this.f220527h;
        if (aVar != null) {
            aVar.setTextColor(i);
        }
        C74974a aVar2 = this.f220528i;
        if (aVar2 != null) {
            aVar2.setTextColor(i);
        }
    }

    public void setTextCursorDrawable(Drawable drawable) {
        C74974a aVar = this.f220527h;
        if (aVar != null) {
            aVar.setTextCursorDrawable(drawable);
        }
        C74974a aVar2 = this.f220528i;
        if (aVar2 != null) {
            aVar2.setTextCursorDrawable(drawable);
        }
    }

    public void setTextSize(int i, float f) {
        if (C87412m.m108589b(this.f220529j, Boolean.TRUE)) {
            C74974a aVar = this.f220527h;
            if (aVar != null && aVar != null) {
                aVar.setTextSize(i, f);
                return;
            }
            return;
        }
        C74974a aVar2 = this.f220528i;
        if (aVar2 != null && aVar2 != null) {
            aVar2.setTextSize(i, f);
        }
    }

    public void setVisibility(int i) {
        if (C87412m.m108589b(this.f220529j, Boolean.TRUE)) {
            C74974a aVar = this.f220527h;
            if (aVar != null) {
                aVar.setVisibility(i);
                return;
            }
            return;
        }
        C74974a aVar2 = this.f220528i;
        if (aVar2 != null) {
            aVar2.setVisibility(i);
        }
    }

    public View view() {
        if (C87412m.m108589b(this.f220529j, Boolean.TRUE)) {
            C74974a aVar = this.f220527h;
            if (aVar != null) {
                return aVar.view();
            }
            return null;
        }
        C74974a aVar2 = this.f220528i;
        if (aVar2 != null) {
            return aVar2.view();
        }
        return null;
    }

    public C67383b getSizeAnimController() {
        return this.f220530n;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MMFlexEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
        String str = "MicroMsg.MMFlexEditText@" + hashCode();
        this.f220531o = str;
        Log.m105924i(str, "init with attrs");
        mo104458s(context, attributeSet);
        this.f220528i = mo104454q(this.f220526g, context, attributeSet);
        this.f220527h = mo104454q(this.f220525f, context, attributeSet);
        setPadding(0, 0, 0, 0);
        mo104239a(true);
        C76433e eVar = new C76433e(this);
        C74974a aVar = this.f220527h;
        if (aVar != null) {
            aVar.addTextChangedListener(eVar);
        }
        C74974a aVar2 = this.f220528i;
        if (aVar2 != null) {
            aVar2.addTextChangedListener(eVar);
        }
    }
}
