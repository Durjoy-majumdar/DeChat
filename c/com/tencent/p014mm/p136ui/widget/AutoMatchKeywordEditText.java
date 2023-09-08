package com.tencent.p014mm.p136ui.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.DragEvent;
import com.tencent.p014mm.p136ui.tools.ActionBarSearchView;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.ui.widget.AutoMatchKeywordEditText */
public class AutoMatchKeywordEditText extends MMEditText {

    /* renamed from: E */
    public C106761a f319162E;

    /* renamed from: F */
    public int f319163F = getSelectionStart();

    /* renamed from: G */
    public int f319164G = getSelectionEnd();

    /* renamed from: com.tencent.mm.ui.widget.AutoMatchKeywordEditText$a */
    public interface C106761a {
    }

    public AutoMatchKeywordEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public void extendSelection(int i) {
        Log.m105918d("MicroMsg.AutoMatchKeywordEditText", "extendSelection");
        super.extendSelection(i);
        this.f319163F = getSelectionStart();
        this.f319164G = getSelectionEnd();
    }

    public C106761a getOnSelectionChangeListener() {
        return this.f319162E;
    }

    public boolean moveCursorToVisibleOffset() {
        Log.m105918d("MicroMsg.AutoMatchKeywordEditText", "moveCursorToVisibleOffset");
        return super.moveCursorToVisibleOffset();
    }

    public boolean onDragEvent(DragEvent dragEvent) {
        Log.m105918d("MicroMsg.AutoMatchKeywordEditText", "onDragEvent");
        return super.onDragEvent(dragEvent);
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int selectionStart = getSelectionStart();
        int selectionEnd = getSelectionEnd();
        if (this.f319163F != selectionStart || this.f319164G != selectionEnd) {
            this.f319163F = selectionStart;
            this.f319164G = selectionEnd;
            C106761a aVar = this.f319162E;
            if (aVar != null) {
                ((ActionBarSearchView.C106730g) aVar).mo153823a(this, getSelectionStart(), getSelectionEnd());
            }
        }
    }

    public boolean performAccessibilityAction(int i, Bundle bundle) {
        Log.m105918d("MicroMsg.AutoMatchKeywordEditText", "performAccessibilityAction");
        return super.performAccessibilityAction(i, bundle);
    }

    public void setOnSelectionChangeListener(C106761a aVar) {
        this.f319162E = aVar;
    }

    public void setSelection(int i) {
        C106761a aVar;
        Log.m105918d("MicroMsg.AutoMatchKeywordEditText", "setSelection");
        int selectionStart = getSelectionStart();
        int selectionEnd = getSelectionEnd();
        super.setSelection(i);
        this.f319163F = getSelectionStart();
        this.f319164G = getSelectionEnd();
        if ((selectionStart != getSelectionStart() || selectionEnd != getSelectionEnd()) && (aVar = this.f319162E) != null) {
            ((ActionBarSearchView.C106730g) aVar).mo153823a(this, getSelectionStart(), getSelectionEnd());
        }
    }

    public AutoMatchKeywordEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void setSelection(int i, int i2) {
        C106761a aVar;
        Log.m105918d("MicroMsg.AutoMatchKeywordEditText", "setSelection.");
        int selectionStart = getSelectionStart();
        int selectionEnd = getSelectionEnd();
        super.setSelection(i, i2);
        this.f319163F = getSelectionStart();
        this.f319164G = getSelectionEnd();
        if ((selectionStart != getSelectionStart() || selectionEnd != getSelectionEnd()) && (aVar = this.f319162E) != null) {
            ((ActionBarSearchView.C106730g) aVar).mo153823a(this, getSelectionStart(), getSelectionEnd());
        }
    }
}
