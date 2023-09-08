package com.tencent.p014mm.plugin.finder.view;

import android.content.Context;
import android.text.Editable;
import android.util.AttributeSet;
import com.tencent.p014mm.p136ui.widget.MMEditText;
import com.tencent.thumbplayer.tmediacodec.util.MimeTypes;
import gy3.C87412m;
import java.util.regex.Pattern;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012B#\b\u0016\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0011\u0010\u0015J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0016R\"\u0010\f\u001a\u00020\u00058\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\u0016"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/view/SignatureEditText;", "Lcom/tencent/mm/ui/widget/MMEditText;", "Landroid/text/Editable;", "getOriginText", "getText", "", "E", "Z", "getAllowEmptyLine", "()Z", "setAllowEmptyLine", "(Z)V", "allowEmptyLine", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.view.SignatureEditText */
public final class SignatureEditText extends MMEditText {

    /* renamed from: E */
    public boolean f198153E;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SignatureEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
        addTextChangedListener(new C68955w7(this));
        setOnEditorActionListener(new C68959x7(this));
        this.f220606r.add(new C68960y7(this));
    }

    /* access modifiers changed from: private */
    public final Editable getOriginText() {
        Editable text = super.getText();
        C87412m.m108593f(text, "super.getText()");
        return text;
    }

    public final boolean getAllowEmptyLine() {
        return this.f198153E;
    }

    public final void setAllowEmptyLine(boolean z) {
        this.f198153E = z;
    }

    public Editable getText() {
        Editable text = super.getText();
        if (!this.f198153E) {
            C87412m.m108593f(text, MimeTypes.BASE_TYPE_TEXT);
            Pattern compile = Pattern.compile("(?m)^[ \t]*\r?\n");
            C87412m.m108593f(compile, "compile(pattern)");
            C87412m.m108593f(compile.matcher(text).replaceAll(""), "nativePattern.matcher(in…).replaceAll(replacement)");
        }
        C87412m.m108593f(text, MimeTypes.BASE_TYPE_TEXT);
        return text;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SignatureEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
        addTextChangedListener(new C68955w7(this));
        setOnEditorActionListener(new C68959x7(this));
        this.f220606r.add(new C68960y7(this));
    }
}
