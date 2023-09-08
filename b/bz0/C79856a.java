package bz0;

import android.widget.LinearLayout;
import android.widget.TextView;
import bz0.C79866k;
import bz0.C79873o;
import bz0.C79905u;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import gy3.C87412m;

/* renamed from: bz0.a */
public final class C79856a implements C79866k.C79867a {

    /* renamed from: a */
    public final MMActivity f234002a;

    /* renamed from: b */
    public final LinearLayout f234003b;

    /* renamed from: c */
    public C79857a f234004c;

    /* renamed from: d */
    public String f234005d = "";

    /* renamed from: e */
    public int f234006e;

    /* renamed from: f */
    public TextView[] f234007f;

    /* renamed from: bz0.a$a */
    public interface C79857a {
        /* renamed from: a */
        void mo110036a(String str, boolean z);

        /* renamed from: b */
        void mo110037b(C79873o.C79875b bVar);
    }

    public C79856a(MMActivity mMActivity, LinearLayout linearLayout) {
        C87412m.m108594g(mMActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        C87412m.m108594g(linearLayout, "inputLayout");
        this.f234002a = mMActivity;
        this.f234003b = linearLayout;
    }

    /* renamed from: a */
    public void mo110033a() {
        TextView[] textViewArr = this.f234007f;
        if (textViewArr != null) {
            TextView textView = textViewArr[this.f234006e];
            C87412m.m108591d(textView);
            textView.setText("");
            mo110035c(Math.max(this.f234006e - 1, 0));
            return;
        }
        C87412m.m108603p("charViews");
        throw null;
    }

    /* renamed from: b */
    public void mo110034b(char c) {
        TextView[] textViewArr = this.f234007f;
        if (textViewArr != null) {
            TextView textView = textViewArr[this.f234006e];
            C87412m.m108591d(textView);
            CharSequence text = textView.getText();
            CharSequence charSequence = "";
            if (text == null) {
                text = charSequence;
            }
            TextView[] textViewArr2 = this.f234007f;
            if (textViewArr2 != null) {
                TextView textView2 = textViewArr2[this.f234006e];
                C87412m.m108591d(textView2);
                textView2.setText(String.valueOf(c), TextView.BufferType.SPANNABLE);
                CharSequence text2 = textView.getText();
                if (text2 != null) {
                    charSequence = text2;
                }
                if (C87412m.m108589b(text.toString(), charSequence.toString())) {
                    C79905u.C79906a aVar = C79905u.f234097e;
                    if (aVar.mo110066a(charSequence) <= aVar.mo110066a(text)) {
                        if (!(text.length() == 0)) {
                            return;
                        }
                    }
                }
                int i = this.f234006e + 1;
                TextView[] textViewArr3 = this.f234007f;
                if (textViewArr3 != null) {
                    mo110035c(Math.min(i, textViewArr3.length - 1));
                } else {
                    C87412m.m108603p("charViews");
                    throw null;
                }
            } else {
                C87412m.m108603p("charViews");
                throw null;
            }
        } else {
            C87412m.m108603p("charViews");
            throw null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0017  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x004a  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo110035c(int r9) {
        /*
            r8 = this;
            r0 = 0
            java.lang.String r1 = "charViews"
            r2 = 1
            r3 = 0
            if (r9 < 0) goto L_0x0014
            android.widget.TextView[] r4 = r8.f234007f
            if (r4 == 0) goto L_0x0010
            int r4 = r4.length
            if (r9 >= r4) goto L_0x0014
            r4 = 1
            goto L_0x0015
        L_0x0010:
            gy3.C87412m.m108603p(r1)
            throw r0
        L_0x0014:
            r4 = 0
        L_0x0015:
            if (r4 == 0) goto L_0x004a
            r8.f234006e = r9
            android.widget.TextView[] r4 = r8.f234007f
            if (r4 == 0) goto L_0x0046
            int r0 = r4.length
            r1 = 0
            r5 = 0
        L_0x0020:
            if (r1 >= r0) goto L_0x0038
            r6 = r4[r1]
            int r7 = r5 + 1
            if (r9 != r5) goto L_0x002a
            r5 = 1
            goto L_0x002b
        L_0x002a:
            r5 = 0
        L_0x002b:
            gy3.C87412m.m108591d(r6)
            r6.setSelected(r5)
            r6.setFocusable(r5)
            int r1 = r1 + 1
            r5 = r7
            goto L_0x0020
        L_0x0038:
            bz0.a$a r0 = r8.f234004c
            if (r0 == 0) goto L_0x0045
            bz0.o$b$a r1 = bz0.C79873o.C79875b.f234031d
            bz0.o$b r9 = r1.mo110051a(r9)
            r0.mo110037b(r9)
        L_0x0045:
            return
        L_0x0046:
            gy3.C87412m.m108603p(r1)
            throw r0
        L_0x004a:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "Check failed."
            java.lang.String r0 = r0.toString()
            r9.<init>(r0)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: bz0.C79856a.mo110035c(int):void");
    }
}
