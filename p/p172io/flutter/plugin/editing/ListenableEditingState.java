package p172io.flutter.plugin.editing;

import android.text.Editable;
import android.text.Selection;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;
import java.util.ArrayList;
import java.util.Iterator;
import p172io.flutter.Log;
import p172io.flutter.embedding.engine.systemchannels.TextInputChannel;

/* renamed from: io.flutter.plugin.editing.ListenableEditingState */
class ListenableEditingState extends SpannableStringBuilder {
    private static final String TAG = "ListenableEditingState";
    private int mBatchEditNestDepth = 0;
    private ArrayList<TextEditingDelta> mBatchTextEditingDeltas = new ArrayList<>();
    private int mChangeNotificationDepth = 0;
    private int mComposingEndWhenBeginBatchEdit;
    private int mComposingStartWhenBeginBatchEdit;
    private BaseInputConnection mDummyConnection;
    private ArrayList<EditingStateWatcher> mListeners = new ArrayList<>();
    private ArrayList<EditingStateWatcher> mPendingListeners = new ArrayList<>();
    private int mSelectionEndWhenBeginBatchEdit;
    private int mSelectionStartWhenBeginBatchEdit;
    private String mTextWhenBeginBatchEdit;
    private String mToStringCache;

    /* renamed from: io.flutter.plugin.editing.ListenableEditingState$EditingStateWatcher */
    public interface EditingStateWatcher {
        void didChangeEditingState(boolean z, boolean z2, boolean z3);
    }

    public ListenableEditingState(TextInputChannel.TextEditState textEditState, View view) {
        if (textEditState != null) {
            setEditingState(textEditState);
        }
        this.mDummyConnection = new BaseInputConnection(view, true) {
            public Editable getEditable() {
                return this;
            }
        };
    }

    private void notifyListener(EditingStateWatcher editingStateWatcher, boolean z, boolean z2, boolean z3) {
        this.mChangeNotificationDepth++;
        editingStateWatcher.didChangeEditingState(z, z2, z3);
        this.mChangeNotificationDepth--;
    }

    private void notifyListenersIfNeeded(boolean z, boolean z2, boolean z3) {
        if (z || z2 || z3) {
            Iterator<EditingStateWatcher> it = this.mListeners.iterator();
            while (it.hasNext()) {
                notifyListener(it.next(), z, z2, z3);
            }
        }
    }

    public void addEditingStateListener(EditingStateWatcher editingStateWatcher) {
        if (this.mChangeNotificationDepth > 0) {
            Log.m165286e(TAG, "adding a listener " + editingStateWatcher.toString() + " in a listener callback");
        }
        if (this.mBatchEditNestDepth > 0) {
            Log.m165292w(TAG, "a listener was added to EditingState while a batch edit was in progress");
            this.mPendingListeners.add(editingStateWatcher);
            return;
        }
        this.mListeners.add(editingStateWatcher);
    }

    public void beginBatchEdit() {
        this.mBatchEditNestDepth++;
        if (this.mChangeNotificationDepth > 0) {
            Log.m165286e(TAG, "editing state should not be changed in a listener callback");
        }
        if (this.mBatchEditNestDepth == 1 && !this.mListeners.isEmpty()) {
            this.mTextWhenBeginBatchEdit = toString();
            this.mSelectionStartWhenBeginBatchEdit = getSelectionStart();
            this.mSelectionEndWhenBeginBatchEdit = getSelectionEnd();
            this.mComposingStartWhenBeginBatchEdit = getComposingStart();
            this.mComposingEndWhenBeginBatchEdit = getComposingEnd();
        }
    }

    public void clearBatchDeltas() {
        this.mBatchTextEditingDeltas.clear();
    }

    public void endBatchEdit() {
        int i = this.mBatchEditNestDepth;
        if (i == 0) {
            Log.m165286e(TAG, "endBatchEdit called without a matching beginBatchEdit");
            return;
        }
        if (i == 1) {
            Iterator<EditingStateWatcher> it = this.mPendingListeners.iterator();
            while (it.hasNext()) {
                notifyListener(it.next(), true, true, true);
            }
            if (!this.mListeners.isEmpty()) {
                Log.m165290v(TAG, "didFinishBatchEdit with " + String.valueOf(this.mListeners.size()) + " listener(s)");
                boolean equals = toString().equals(this.mTextWhenBeginBatchEdit) ^ true;
                boolean z = false;
                boolean z2 = (this.mSelectionStartWhenBeginBatchEdit == getSelectionStart() && this.mSelectionEndWhenBeginBatchEdit == getSelectionEnd()) ? false : true;
                if (!(this.mComposingStartWhenBeginBatchEdit == getComposingStart() && this.mComposingEndWhenBeginBatchEdit == getComposingEnd())) {
                    z = true;
                }
                notifyListenersIfNeeded(equals, z2, z);
            }
        }
        this.mListeners.addAll(this.mPendingListeners);
        this.mPendingListeners.clear();
        this.mBatchEditNestDepth--;
    }

    public ArrayList<TextEditingDelta> extractBatchTextEditingDeltas() {
        ArrayList<TextEditingDelta> arrayList = new ArrayList<>(this.mBatchTextEditingDeltas);
        this.mBatchTextEditingDeltas.clear();
        return arrayList;
    }

    public final int getComposingEnd() {
        return BaseInputConnection.getComposingSpanEnd(this);
    }

    public final int getComposingStart() {
        return BaseInputConnection.getComposingSpanStart(this);
    }

    public final int getSelectionEnd() {
        return Selection.getSelectionEnd(this);
    }

    public final int getSelectionStart() {
        return Selection.getSelectionStart(this);
    }

    public void removeEditingStateListener(EditingStateWatcher editingStateWatcher) {
        if (this.mChangeNotificationDepth > 0) {
            Log.m165286e(TAG, "removing a listener " + editingStateWatcher.toString() + " in a listener callback");
        }
        this.mListeners.remove(editingStateWatcher);
        if (this.mBatchEditNestDepth > 0) {
            this.mPendingListeners.remove(editingStateWatcher);
        }
    }

    public void setComposingRange(int i, int i2) {
        if (i < 0 || i >= i2) {
            BaseInputConnection.removeComposingSpans(this);
        } else {
            this.mDummyConnection.setComposingRegion(i, i2);
        }
    }

    public void setEditingState(TextInputChannel.TextEditState textEditState) {
        beginBatchEdit();
        replace(0, length(), textEditState.text);
        if (textEditState.hasSelection()) {
            Selection.setSelection(this, textEditState.selectionStart, textEditState.selectionEnd);
        } else {
            Selection.removeSelection(this);
        }
        setComposingRange(textEditState.composingStart, textEditState.composingEnd);
        clearBatchDeltas();
        endBatchEdit();
    }

    public void setSpan(Object obj, int i, int i2, int i3) {
        super.setSpan(obj, i, i2, i3);
        this.mBatchTextEditingDeltas.add(new TextEditingDelta(toString(), getSelectionStart(), getSelectionEnd(), getComposingStart(), getComposingEnd()));
    }

    public String toString() {
        String str = this.mToStringCache;
        if (str != null) {
            return str;
        }
        String spannableStringBuilder = super.toString();
        this.mToStringCache = spannableStringBuilder;
        return spannableStringBuilder;
    }

    public SpannableStringBuilder replace(int i, int i2, CharSequence charSequence, int i3, int i4) {
        boolean z;
        boolean z2;
        if (this.mChangeNotificationDepth > 0) {
            Log.m165286e(TAG, "editing state should not be changed in a listener callback");
        }
        String listenableEditingState = toString();
        int i5 = i2 - i;
        boolean z3 = i5 != i4 - i3;
        for (int i6 = 0; i6 < i5 && !z3; i6++) {
            z3 |= charAt(i + i6) != charSequence.charAt(i3 + i6);
        }
        CharSequence charSequence2 = charSequence;
        if (z3) {
            this.mToStringCache = null;
        }
        int selectionStart = getSelectionStart();
        int selectionEnd = getSelectionEnd();
        int composingStart = getComposingStart();
        int composingEnd = getComposingEnd();
        SpannableStringBuilder replace = super.replace(i, i2, charSequence, i3, i4);
        TextEditingDelta textEditingDelta = r1;
        boolean z4 = z3;
        int i7 = composingEnd;
        TextEditingDelta textEditingDelta2 = new TextEditingDelta(listenableEditingState, i, i2, charSequence, getSelectionStart(), getSelectionEnd(), getComposingStart(), getComposingEnd());
        this.mBatchTextEditingDeltas.add(textEditingDelta);
        if (this.mBatchEditNestDepth > 0) {
            return replace;
        }
        boolean z5 = (getSelectionStart() == selectionStart && getSelectionEnd() == selectionEnd) ? false : true;
        if (getComposingStart() == composingStart && getComposingEnd() == i7) {
            z = z4;
            z2 = false;
        } else {
            z = z4;
            z2 = true;
        }
        notifyListenersIfNeeded(z, z5, z2);
        return replace;
    }
}
