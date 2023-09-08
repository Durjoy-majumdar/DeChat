package com.tencent.p014mm.p136ui.widget.cedit.api;

import android.content.Context;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.KeyEvent;
import com.tencent.p014mm.p136ui.widget.cedit.edit.CustomEditText;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/* renamed from: com.tencent.mm.ui.widget.cedit.api.PasterEditTextCompact */
public class PasterEditTextCompact extends CustomEditText {

    /* renamed from: Q1 */
    public Context f319223Q1;

    /* renamed from: R1 */
    public boolean f319224R1 = false;

    /* renamed from: S1 */
    public int f319225S1 = 0;

    /* renamed from: T1 */
    public int f319226T1 = 0;

    /* renamed from: U1 */
    public CharSequence f319227U1 = "";

    /* renamed from: V1 */
    public CharSequence f319228V1 = "";

    /* renamed from: W1 */
    public int f319229W1 = 0;

    /* renamed from: X1 */
    public boolean f319230X1 = false;

    /* renamed from: Y1 */
    public String f319231Y1 = "";

    /* renamed from: Z1 */
    public List f319232Z1 = new ArrayList();

    /* renamed from: a2 */
    public LinkedList<TextWatcher> f319233a2 = new LinkedList<>();

    /* renamed from: b2 */
    public LinkedList<C106769a> f319234b2 = new LinkedList<>();

    /* renamed from: com.tencent.mm.ui.widget.cedit.api.PasterEditTextCompact$a */
    public interface C106769a {
        /* renamed from: a */
        void mo153955a(Editable editable, CharSequence charSequence, int i, int i2);
    }

    public PasterEditTextCompact(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f319223Q1 = context;
        C106770b bVar = new C106770b(this);
        if (this.f319261J == null) {
            this.f319261J = new ArrayList<>();
        }
        this.f319261J.add(bVar);
    }

    public void addTextChangedListener(TextWatcher textWatcher) {
        this.f319233a2.add(textWatcher);
    }

    /* renamed from: b0 */
    public boolean mo97951b0(int i) {
        if (i != 16908322) {
            return i == 16908321 ? super.mo97951b0(i) : super.mo97951b0(i);
        }
        this.f319224R1 = true;
        return super.mo97951b0(i);
    }

    public CharSequence getPasterContent() {
        return this.f319228V1;
    }

    public int getPasterLen() {
        return this.f319229W1;
    }

    public boolean getSimilarPasteChange() {
        return this.f319230X1;
    }

    public String getSimilarPasteSeqStr() {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (i < 3 && i < this.f319232Z1.size()) {
            if (i != 0) {
                sb.append(",");
            }
            sb.append(this.f319232Z1.get(i));
            i++;
        }
        return sb.toString();
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        Log.m105925i("MicroMsg.PasterEditTextCompact", "onKeyDown keyCode:%s eventAction:%s", Integer.valueOf(i), Integer.valueOf(keyEvent.getAction()));
        return super.onKeyDown(i, keyEvent);
    }

    public boolean onKeyMultiple(int i, int i2, KeyEvent keyEvent) {
        Log.m105925i("MicroMsg.PasterEditTextCompact", "onKeyMultiple keyCode:%s repeatCount:%s eventAction:%s", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(keyEvent.getAction()));
        return super.onKeyMultiple(i, i2, keyEvent);
    }

    public boolean onKeyPreIme(int i, KeyEvent keyEvent) {
        Log.m105925i("MicroMsg.PasterEditTextCompact", "onKeyMultiple keyCode:%s eventAction:%s", Integer.valueOf(i), Integer.valueOf(keyEvent.getAction()));
        return super.onKeyPreIme(i, keyEvent);
    }

    public boolean onKeyShortcut(int i, KeyEvent keyEvent) {
        Log.m105925i("MicroMsg.PasterEditTextCompact", "onKeyShortcut keyCode:%s eventAction:%s", Integer.valueOf(i), Integer.valueOf(keyEvent.getAction()));
        return super.onKeyShortcut(i, keyEvent);
    }

    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        Log.m105925i("MicroMsg.PasterEditTextCompact", "onKeyUp keyCode:%s eventAction:%s", Integer.valueOf(i), Integer.valueOf(keyEvent.getAction()));
        return super.onKeyUp(i, keyEvent);
    }

    /* renamed from: p */
    public void mo153953p() {
        this.f319230X1 = false;
        this.f319232Z1.clear();
        this.f319231Y1 = "";
    }

    public void removeTextChangedListener(TextWatcher textWatcher) {
        this.f319233a2.remove(textWatcher);
    }

    public PasterEditTextCompact(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C106770b bVar = new C106770b(this);
        if (this.f319261J == null) {
            this.f319261J = new ArrayList<>();
        }
        this.f319261J.add(bVar);
    }
}
