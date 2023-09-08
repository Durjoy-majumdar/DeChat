package ko3;

import android.os.Bundle;
import android.os.SystemClock;
import android.text.Editable;
import android.text.method.KeyListener;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.CorrectionInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.InputMethodManager;
import com.tencent.p014mm.p136ui.widget.cedit.edit.C106778a;
import com.tencent.p014mm.p136ui.widget.cedit.edit.CustomTextView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import jo3.C76430b;

/* renamed from: ko3.c */
public class C109029c extends BaseInputConnection {

    /* renamed from: a */
    public final CustomTextView f326532a;

    /* renamed from: b */
    public int f326533b;

    public C109029c(CustomTextView customTextView) {
        super(customTextView, true);
        this.f326532a = customTextView;
    }

    public boolean beginBatchEdit() {
        synchronized (this) {
            if (this.f326533b < 0) {
                return false;
            }
            this.f326532a.mo154259t();
            this.f326533b++;
            return true;
        }
    }

    public boolean clearMetaKeyStates(int i) {
        Editable editable = getEditable();
        if (editable == null) {
            return false;
        }
        KeyListener keyListener = this.f326532a.getKeyListener();
        if (keyListener == null) {
            return true;
        }
        try {
            keyListener.clearMetaKeyState(this.f326532a, editable, i);
            return true;
        } catch (AbstractMethodError unused) {
            return true;
        }
    }

    public void closeConnection() {
        super.closeConnection();
        synchronized (this) {
            while (this.f326533b > 0) {
                endBatchEdit();
            }
            this.f326533b = -1;
        }
    }

    public boolean commitCompletion(CompletionInfo completionInfo) {
        Log.m105926v("cmEdit.EditableInputConnection", "commitCompletion " + completionInfo);
        this.f326532a.mo154259t();
        this.f326532a.getClass();
        this.f326532a.mo153972F();
        return true;
    }

    public boolean commitCorrection(CorrectionInfo correctionInfo) {
        Log.m105926v("cmEdit.EditableInputConnection", "commitCorrection" + correctionInfo);
        this.f326532a.mo154259t();
        C106778a aVar = this.f326532a.f319246B1;
        if (aVar != null) {
            C106778a.C106783e eVar = aVar.f319398i;
            if (eVar == null) {
                aVar.f319398i = new C106778a.C106783e();
            } else {
                eVar.mo154326a(false);
            }
            C106778a.C106783e eVar2 = aVar.f319398i;
            eVar2.getClass();
            int offset = correctionInfo.getOffset();
            eVar2.f319423c = offset;
            eVar2.f319424d = offset + correctionInfo.getNewText().length();
            eVar2.f319425e = SystemClock.uptimeMillis();
            if (eVar2.f319423c < 0 || eVar2.f319424d < 0) {
                C106778a.this.f319398i = null;
            }
        }
        this.f326532a.mo153972F();
        return true;
    }

    public boolean commitText(CharSequence charSequence, int i) {
        if (this.f326532a == null) {
            return super.commitText(charSequence, i);
        }
        try {
            return super.commitText(charSequence, i);
        } catch (Throwable th) {
            Log.m105921e("cmEdit.EditableInputConnection", "commitText err:%s", Util.stackTraceToString(th));
            C76430b.m91852a(6);
            return false;
        }
    }

    public boolean endBatchEdit() {
        synchronized (this) {
            if (this.f326533b <= 0) {
                return false;
            }
            this.f326532a.mo153972F();
            this.f326533b--;
            return true;
        }
    }

    public Editable getEditable() {
        CustomTextView customTextView = this.f326532a;
        if (customTextView != null) {
            return customTextView.getEditableText();
        }
        return null;
    }

    public ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest, int i) {
        if (this.f326532a == null) {
            return null;
        }
        ExtractedText extractedText = new ExtractedText();
        CustomTextView customTextView = this.f326532a;
        customTextView.mo153970C();
        if (!customTextView.f319246B1.mo154302g(extractedTextRequest, -1, -1, -1, extractedText)) {
            return null;
        }
        if ((i & 1) != 0) {
            this.f326532a.setExtracting(extractedTextRequest);
        }
        return extractedText;
    }

    public boolean performContextMenuAction(int i) {
        Log.m105926v("cmEdit.EditableInputConnection", "performContextMenuAction " + i);
        this.f326532a.mo154259t();
        this.f326532a.mo97951b0(i);
        this.f326532a.mo153972F();
        return true;
    }

    public boolean performEditorAction(int i) {
        Log.m105926v("cmEdit.EditableInputConnection", "performEditorAction " + i);
        this.f326532a.mo153989Y(i);
        return true;
    }

    public boolean performPrivateCommand(String str, Bundle bundle) {
        this.f326532a.mo104413Z(str, bundle);
        return true;
    }

    public boolean requestCursorUpdates(int i) {
        Log.m105926v("cmEdit.EditableInputConnection", "requestUpdateCursorAnchorInfo " + i);
        int i2 = i & -4;
        if (i2 != 0) {
            Log.m105918d("cmEdit.EditableInputConnection", "Rejecting requestUpdateCursorAnchorInfo due to unknown flags. cursorUpdateMode=" + i + " unknownFlags=" + i2);
            return false;
        }
        InputMethodManager inputMethodManager = (InputMethodManager) this.f326532a.getContext().getSystemService("input_method");
        return false;
    }
}
