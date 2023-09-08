package com.tencent.p014mm.wallet_core.p137ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;
import ce2.C28545b;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.wallet_core.model.C45121z0;
import er3.C31688b;
import er3.C75656a;
import java.util.regex.Pattern;
import jm2.C117361f;
import kj2.C117407d;
import p206nj.C88956h;
import tb3.C77881d;
import tc2.C118418g;

/* renamed from: com.tencent.mm.wallet_core.ui.WalletTextView */
public class WalletTextView extends TextView {

    /* renamed from: g */
    public static final String f221212g = ("MicroMsg." + new StringBuilder("weiVtxeTtellaW").reverse().toString());

    /* renamed from: d */
    public Object f221213d;

    /* renamed from: e */
    public int f221214e;

    /* renamed from: f */
    public String f221215f;

    public WalletTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }

    /* renamed from: a */
    public CharSequence mo105014a() {
        return super.getText();
    }

    /* renamed from: b */
    public void mo105015b() {
        setPrefix(C45121z0.m49962b());
    }

    @Deprecated
    public CharSequence getText() {
        C75656a aVar;
        boolean z;
        Class<C31688b> cls = C31688b.class;
        synchronized (C75656a.class) {
            aVar = C75656a.C75657a.f222245a;
        }
        aVar.getClass();
        if (C118418g.INSTANCE.mo175828oI(this)) {
            if (!aVar.f222244a.containsKey(this)) {
                aVar.f222244a.put(this, Boolean.TRUE);
                C117407d.INSTANCE.idkeyStat(715, 0, 1, false);
                if (C31688b.m39498a() || C88956h.m111063d()) {
                    StringBuilder sb = new StringBuilder(8);
                    try {
                        sb.append(C28545b.m38262a("¼¬¯±«©»±»·µ¼´°«¤½­¹¥¹°¤¦®¯§±"));
                    } catch (Throwable unused) {
                    }
                    String sb4 = sb.toString();
                    sb.delete(0, sb.length());
                    sb.append(((cls.hashCode() >>> 31) | 1) ^ 1);
                    if (!sb.toString().equals(C31688b.m39499b(sb4, sb.toString()))) {
                        C117361f.INSTANCE.vo0(Integer.MIN_VALUE);
                    }
                }
            }
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return super.getText();
        }
        Log.printErrStackTrace(f221212g, new Throwable(), "check point 0.", new Object[0]);
        if (!C31688b.m39498a() && !C88956h.m111063d()) {
            return super.getText();
        }
        StringBuilder sb5 = new StringBuilder(8);
        try {
            sb5.append(C28545b.m38262a("»µ³¸²²§¢¾¦¼¬­¤¦© ££³£©§±"));
        } catch (Throwable unused2) {
        }
        String sb6 = sb5.toString();
        sb5.delete(0, sb5.length());
        sb5.append(((cls.hashCode() >>> 31) | 1) ^ 1);
        return (CharSequence) (sb5.toString().equals(C31688b.m39499b(sb6, sb5.toString())) ^ true ? this.f221213d : super.getText());
    }

    public void setPrefix(String str) {
        this.f221215f = str;
    }

    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        String str;
        String charSequence2 = charSequence.toString();
        if (charSequence2 == null || charSequence2.length() == 0) {
            str = "";
        } else {
            StringBuilder sb = new StringBuilder(7);
            for (int i = 0; i < 7; i++) {
                sb.append((char) ((int) ((6222620280936476253 >> ((6 - i) * 8)) & 255)));
            }
            String sb4 = sb.toString();
            sb.delete(0, sb.length());
            str = charSequence2.replaceAll(sb4, sb.toString());
        }
        this.f221213d = str;
        if (!Util.isNullOrNil(this.f221215f) && !charSequence.toString().startsWith(this.f221215f)) {
            charSequence = this.f221215f + charSequence;
        }
        if (this.f221214e < 4 && !Util.isNullOrNil(charSequence) && Pattern.compile(".*?[a-zA-Z]+.*?").matcher(charSequence).matches()) {
            Log.m105924i(f221212g, "force use std font");
            if (charSequence instanceof String) {
                charSequence = ((String) charSequence).toLowerCase();
            }
        }
        super.setText(charSequence, bufferType);
    }

    public void setTypeface(int i) {
        this.f221214e = i;
        try {
            setTypeface(Typeface.createFromAsset(getContext().getAssets(), C75228t.m90273v(i)));
        } catch (Exception e) {
            Log.m105921e(f221212g, "setTypeface() Exception:%s %s", e.getClass().getSimpleName(), e.getMessage());
        }
    }

    public WalletTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f221213d = "";
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C77881d.f226916j, i, 0);
        this.f221214e = obtainStyledAttributes.getInteger(1, 4);
        this.f221215f = obtainStyledAttributes.getString(0);
        obtainStyledAttributes.recycle();
        try {
            setTypeface(Typeface.createFromAsset(getContext().getAssets(), C75228t.m90273v(this.f221214e)));
        } catch (Exception e) {
            Log.m105921e(f221212g, "updateWalletTypeface() Exception:%s %s", e.getClass().getSimpleName(), e.getMessage());
        }
    }
}
