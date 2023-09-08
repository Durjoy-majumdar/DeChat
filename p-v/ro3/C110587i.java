package ro3;

import android.os.Bundle;
import android.os.Handler;
import android.view.KeyEvent;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.CorrectionInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;
import com.tencent.p014mm.p136ui.C85975v4;
import gy3.C87412m;

/* renamed from: ro3.i */
public final class C110587i implements InputConnection {

    /* renamed from: a */
    public final InputConnection f330799a;

    public C110587i(InputConnection inputConnection) {
        C87412m.m108594g(inputConnection, "ic");
        this.f330799a = inputConnection;
    }

    public boolean beginBatchEdit() {
        return this.f330799a.beginBatchEdit();
    }

    public boolean clearMetaKeyStates(int i) {
        return this.f330799a.clearMetaKeyStates(i);
    }

    public void closeConnection() {
        this.f330799a.closeConnection();
    }

    public boolean commitCompletion(CompletionInfo completionInfo) {
        return this.f330799a.commitCompletion(completionInfo);
    }

    public boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
        C87412m.m108594g(inputContentInfo, "p0");
        return this.f330799a.commitContent(inputContentInfo, i, bundle);
    }

    public boolean commitCorrection(CorrectionInfo correctionInfo) {
        return this.f330799a.commitCorrection(correctionInfo);
    }

    public boolean commitText(CharSequence charSequence, int i) {
        return this.f330799a.commitText(charSequence, i);
    }

    public boolean deleteSurroundingText(int i, int i2) {
        return this.f330799a.deleteSurroundingText(i, i2);
    }

    public boolean deleteSurroundingTextInCodePoints(int i, int i2) {
        return this.f330799a.deleteSurroundingTextInCodePoints(i, i2);
    }

    public boolean endBatchEdit() {
        return this.f330799a.endBatchEdit();
    }

    public boolean finishComposingText() {
        return this.f330799a.finishComposingText();
    }

    public int getCursorCapsMode(int i) {
        return this.f330799a.getCursorCapsMode(i);
    }

    public ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest, int i) {
        return this.f330799a.getExtractedText(extractedTextRequest, i);
    }

    public Handler getHandler() {
        return this.f330799a.getHandler();
    }

    public CharSequence getSelectedText(int i) {
        return this.f330799a.getSelectedText(i);
    }

    public CharSequence getTextAfterCursor(int i, int i2) {
        try {
            return this.f330799a.getTextAfterCursor(i, i2);
        } catch (Throwable th) {
            C85975v4.m106307d("SafeProxyInputConnection", th, "getTextAfterCursor err", new Object[0]);
            return "";
        }
    }

    public CharSequence getTextBeforeCursor(int i, int i2) {
        try {
            return this.f330799a.getTextBeforeCursor(i, i2);
        } catch (Throwable th) {
            C85975v4.m106307d("SafeProxyInputConnection", th, "getTextBeforeCursor err", new Object[0]);
            return "";
        }
    }

    public boolean performContextMenuAction(int i) {
        return this.f330799a.performContextMenuAction(i);
    }

    public boolean performEditorAction(int i) {
        return this.f330799a.performEditorAction(i);
    }

    public boolean performPrivateCommand(String str, Bundle bundle) {
        return this.f330799a.performPrivateCommand(str, bundle);
    }

    public boolean reportFullscreenMode(boolean z) {
        return this.f330799a.reportFullscreenMode(z);
    }

    public boolean requestCursorUpdates(int i) {
        return this.f330799a.requestCursorUpdates(i);
    }

    public boolean sendKeyEvent(KeyEvent keyEvent) {
        return this.f330799a.sendKeyEvent(keyEvent);
    }

    public boolean setComposingRegion(int i, int i2) {
        return this.f330799a.setComposingRegion(i, i2);
    }

    public boolean setComposingText(CharSequence charSequence, int i) {
        return this.f330799a.setComposingText(charSequence, i);
    }

    public boolean setSelection(int i, int i2) {
        return this.f330799a.setSelection(i, i2);
    }
}
