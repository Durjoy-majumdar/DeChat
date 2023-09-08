package com.tencent.wcdb;

public class CrossProcessCursorWrapper extends CursorWrapper implements CrossProcessCursor {
    public CrossProcessCursorWrapper(Cursor cursor) {
        super(cursor);
    }

    public void fillWindow(int i, CursorWindow cursorWindow) {
        Cursor cursor = this.mCursor;
        if (cursor instanceof CrossProcessCursor) {
            ((CrossProcessCursor) cursor).fillWindow(i, cursorWindow);
        } else {
            DatabaseUtils.cursorFillWindow(cursor, i, cursorWindow);
        }
    }

    public CursorWindow getWindow() {
        Cursor cursor = this.mCursor;
        if (cursor instanceof CrossProcessCursor) {
            return ((CrossProcessCursor) cursor).getWindow();
        }
        return null;
    }

    public boolean onMove(int i, int i2) {
        Cursor cursor = this.mCursor;
        if (cursor instanceof CrossProcessCursor) {
            return ((CrossProcessCursor) cursor).onMove(i, i2);
        }
        return true;
    }
}
