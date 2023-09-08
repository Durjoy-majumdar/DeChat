package com.tencent.p014mm.p136ui.widget.edittext;

import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.widget.EditText;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/* renamed from: com.tencent.mm.ui.widget.edittext.PasterEditText */
public class PasterEditText extends EditText {

    /* renamed from: d */
    public Context f220595d;

    /* renamed from: e */
    public boolean f220596e = false;

    /* renamed from: f */
    public int f220597f = 0;

    /* renamed from: g */
    public int f220598g = 0;

    /* renamed from: h */
    public CharSequence f220599h = "";

    /* renamed from: i */
    public CharSequence f220600i = "";

    /* renamed from: j */
    public int f220601j = 0;

    /* renamed from: n */
    public boolean f220602n = false;

    /* renamed from: o */
    public String f220603o = "";

    /* renamed from: p */
    public List f220604p = new ArrayList();

    /* renamed from: q */
    public LinkedList<TextWatcher> f220605q = new LinkedList<>();

    /* renamed from: r */
    public List<C74990a> f220606r = Collections.synchronizedList(new LinkedList());

    /* renamed from: com.tencent.mm.ui.widget.edittext.PasterEditText$a */
    public interface C74990a {
        /* renamed from: a */
        void mo94888a(Editable editable, CharSequence charSequence, int i, int i2);
    }

    public PasterEditText(Context context) {
        super(context);
        this.f220595d = context;
        super.addTextChangedListener(new C74991a(this));
    }

    public void addTextChangedListener(TextWatcher textWatcher) {
        this.f220605q.add(textWatcher);
    }

    public CharSequence getPasterContent() {
        return this.f220600i;
    }

    public int getPasterLen() {
        return this.f220601j;
    }

    public boolean getSimilarPasteChange() {
        return this.f220602n;
    }

    public String getSimilarPasteSeqStr() {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (i < 3 && i < this.f220604p.size()) {
            if (i != 0) {
                sb.append(",");
            }
            sb.append(this.f220604p.get(i));
            i++;
        }
        return sb.toString();
    }

    public boolean onPrivateIMECommand(String str, Bundle bundle) {
        return super.onPrivateIMECommand(str, bundle);
    }

    public boolean onTextContextMenuItem(int i) {
        if (i != 16908322) {
            return i == 16908321 ? super.onTextContextMenuItem(i) : super.onTextContextMenuItem(i);
        }
        this.f220596e = true;
        return super.onTextContextMenuItem(i);
    }

    /* renamed from: p */
    public void mo104505p() {
        this.f220602n = false;
        this.f220604p.clear();
        this.f220603o = "";
    }

    public void removeTextChangedListener(TextWatcher textWatcher) {
        this.f220605q.remove(textWatcher);
    }

    public PasterEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f220595d = context;
        super.addTextChangedListener(new C74991a(this));
    }

    public PasterEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        super.addTextChangedListener(new C74991a(this));
    }
}
