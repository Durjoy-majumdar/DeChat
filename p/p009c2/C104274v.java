package p009c2;

import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.CorrectionInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;
import com.tencent.p014mm.plugin.appbrand.jsapi.bio.soter.C1650c;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.List;
import p735w1.C38006x;
import sx3.C110818d0;

/* renamed from: c2.v */
public final class C104274v implements InputConnection {

    /* renamed from: a */
    public final C104262m f308607a;

    /* renamed from: b */
    public final boolean f308608b;

    /* renamed from: c */
    public int f308609c;

    /* renamed from: d */
    public C28482z f308610d;

    /* renamed from: e */
    public int f308611e;

    /* renamed from: f */
    public boolean f308612f;

    /* renamed from: g */
    public final List<C104247d> f308613g = new ArrayList();

    /* renamed from: h */
    public boolean f308614h = true;

    public C104274v(C28482z zVar, C104262m mVar, boolean z) {
        C87412m.m108594g(zVar, "initState");
        C87412m.m108594g(mVar, "eventCallback");
        this.f308607a = mVar;
        this.f308608b = z;
        this.f308610d = zVar;
    }

    /* renamed from: a */
    public final void mo145901a(C104247d dVar) {
        this.f308609c++;
        try {
            ((ArrayList) this.f308613g).add(dVar);
        } finally {
            mo145902b();
        }
    }

    /* renamed from: b */
    public final boolean mo145902b() {
        int i = this.f308609c - 1;
        this.f308609c = i;
        if (i == 0 && (!this.f308613g.isEmpty())) {
            this.f308607a.mo145868a(C110818d0.m150900B0(this.f308613g));
            ((ArrayList) this.f308613g).clear();
        }
        return this.f308609c > 0;
    }

    public boolean beginBatchEdit() {
        boolean z = this.f308614h;
        if (!z) {
            return z;
        }
        this.f308609c++;
        return true;
    }

    /* renamed from: c */
    public final void mo145904c(int i) {
        sendKeyEvent(new KeyEvent(0, i));
        sendKeyEvent(new KeyEvent(1, i));
    }

    public boolean clearMetaKeyStates(int i) {
        boolean z = this.f308614h;
        if (z) {
            return false;
        }
        return z;
    }

    public void closeConnection() {
        ((ArrayList) this.f308613g).clear();
        this.f308609c = 0;
        this.f308614h = false;
    }

    public boolean commitCompletion(CompletionInfo completionInfo) {
        boolean z = this.f308614h;
        if (z) {
            return false;
        }
        return z;
    }

    public boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
        C87412m.m108594g(inputContentInfo, "inputContentInfo");
        boolean z = this.f308614h;
        if (z) {
            return false;
        }
        return z;
    }

    public boolean commitCorrection(CorrectionInfo correctionInfo) {
        boolean z = this.f308614h;
        return z ? this.f308608b : z;
    }

    public boolean commitText(CharSequence charSequence, int i) {
        boolean z = this.f308614h;
        if (z) {
            mo145901a(new C104239a(String.valueOf(charSequence), i));
        }
        return z;
    }

    public boolean deleteSurroundingText(int i, int i2) {
        boolean z = this.f308614h;
        if (!z) {
            return z;
        }
        mo145901a(new C104240b(i, i2));
        return true;
    }

    public boolean deleteSurroundingTextInCodePoints(int i, int i2) {
        boolean z = this.f308614h;
        if (!z) {
            return z;
        }
        mo145901a(new C104241c(i, i2));
        return true;
    }

    public boolean endBatchEdit() {
        return mo145902b();
    }

    public boolean finishComposingText() {
        boolean z = this.f308614h;
        if (!z) {
            return z;
        }
        mo145901a(new C104253h());
        return true;
    }

    public int getCursorCapsMode(int i) {
        C28482z zVar = this.f308610d;
        return TextUtils.getCapsMode(zVar.f78285a.f100413d, C38006x.m41698f(zVar.f78286b), i);
    }

    public ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest, int i) {
        boolean z = true;
        int i2 = 0;
        if ((i & 1) == 0) {
            z = false;
        }
        this.f308612f = z;
        if (z) {
            if (extractedTextRequest != null) {
                i2 = extractedTextRequest.token;
            }
            this.f308611e = i2;
        }
        return C104266p.m139163a(this.f308610d);
    }

    public Handler getHandler() {
        return null;
    }

    public CharSequence getSelectedText(int i) {
        if (C38006x.m41694b(this.f308610d.f78286b)) {
            return null;
        }
        return C28480a0.m38219a(this.f308610d).f100413d;
    }

    public CharSequence getTextAfterCursor(int i, int i2) {
        return C28480a0.m38220b(this.f308610d, i).f100413d;
    }

    public CharSequence getTextBeforeCursor(int i, int i2) {
        return C28480a0.m38221c(this.f308610d, i).f100413d;
    }

    public boolean performContextMenuAction(int i) {
        boolean z = this.f308614h;
        if (z) {
            z = false;
            switch (i) {
                case 16908319:
                    mo145901a(new C104277y(0, this.f308610d.f78285a.f100413d.length()));
                    break;
                case 16908320:
                    mo145904c(C1650c.CTRL_INDEX);
                    break;
                case 16908321:
                    mo145904c(278);
                    break;
                case 16908322:
                    mo145904c(279);
                    break;
            }
        }
        return z;
    }

    public boolean performEditorAction(int i) {
        int i2;
        boolean z = this.f308614h;
        if (z) {
            z = true;
            if (i != 0) {
                switch (i) {
                    case 2:
                        i2 = 2;
                        break;
                    case 3:
                        i2 = 3;
                        break;
                    case 4:
                        i2 = 4;
                        break;
                    case 5:
                        i2 = 6;
                        break;
                    case 6:
                        i2 = 7;
                        break;
                    case 7:
                        i2 = 5;
                        break;
                }
            }
            i2 = 1;
            this.f308607a.mo145870c(i2);
        }
        return z;
    }

    public boolean performPrivateCommand(String str, Bundle bundle) {
        boolean z = this.f308614h;
        if (z) {
            return true;
        }
        return z;
    }

    public boolean reportFullscreenMode(boolean z) {
        return false;
    }

    public boolean requestCursorUpdates(int i) {
        boolean z = this.f308614h;
        if (z) {
            return false;
        }
        return z;
    }

    public boolean sendKeyEvent(KeyEvent keyEvent) {
        C87412m.m108594g(keyEvent, "event");
        boolean z = this.f308614h;
        if (!z) {
            return z;
        }
        this.f308607a.mo145869b(keyEvent);
        return true;
    }

    public boolean setComposingRegion(int i, int i2) {
        boolean z = this.f308614h;
        if (z) {
            mo145901a(new C104275w(i, i2));
        }
        return z;
    }

    public boolean setComposingText(CharSequence charSequence, int i) {
        boolean z = this.f308614h;
        if (z) {
            mo145901a(new C104276x(String.valueOf(charSequence), i));
        }
        return z;
    }

    public boolean setSelection(int i, int i2) {
        boolean z = this.f308614h;
        if (!z) {
            return z;
        }
        mo145901a(new C104277y(i, i2));
        return true;
    }
}
